package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object securityhub {
  type AccountDetailsList = js.Array[AccountDetails]
  type AccountId = String
  type AccountIdList = js.Array[NonEmptyString]
  type ActionTargetList = js.Array[ActionTarget]
  type AdjustmentList = js.Array[Adjustment]
  type AdminAccounts = js.Array[AdminAccount]
  type AdminsMaxResults = Int
  type ArnList = js.Array[NonEmptyString]
  type AvailabilityZones = js.Array[AvailabilityZone]
  type AwsApiGatewayMethodSettingsList = js.Array[AwsApiGatewayMethodSettings]
  type AwsAutoScalingAutoScalingGroupAvailabilityZonesList = js.Array[AwsAutoScalingAutoScalingGroupAvailabilityZonesListDetails]
  type AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateOverridesList = js.Array[AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateOverridesListDetails]
  type AwsAutoScalingLaunchConfigurationBlockDeviceMappingsList = js.Array[AwsAutoScalingLaunchConfigurationBlockDeviceMappingsDetails]
  type AwsBackupBackupPlanAdvancedBackupSettingsList = js.Array[AwsBackupBackupPlanAdvancedBackupSettingsDetails]
  type AwsBackupBackupPlanRuleCopyActionsList = js.Array[AwsBackupBackupPlanRuleCopyActionsDetails]
  type AwsBackupBackupPlanRuleList = js.Array[AwsBackupBackupPlanRuleDetails]
  type AwsCertificateManagerCertificateDomainValidationOptions = js.Array[AwsCertificateManagerCertificateDomainValidationOption]
  type AwsCertificateManagerCertificateExtendedKeyUsages = js.Array[AwsCertificateManagerCertificateExtendedKeyUsage]
  type AwsCertificateManagerCertificateKeyUsages = js.Array[AwsCertificateManagerCertificateKeyUsage]
  type AwsCloudFormationStackOutputsList = js.Array[AwsCloudFormationStackOutputsDetails]
  type AwsCloudFrontDistributionCacheBehaviorsItemList = js.Array[AwsCloudFrontDistributionCacheBehavior]
  type AwsCloudFrontDistributionOriginGroupFailoverStatusCodesItemList = js.Array[Int]
  type AwsCloudFrontDistributionOriginGroupsItemList = js.Array[AwsCloudFrontDistributionOriginGroup]
  type AwsCloudFrontDistributionOriginItemList = js.Array[AwsCloudFrontDistributionOriginItem]
  type AwsCloudWatchAlarmDimensionsList = js.Array[AwsCloudWatchAlarmDimensionsDetails]
  type AwsCodeBuildProjectArtifactsList = js.Array[AwsCodeBuildProjectArtifactsDetails]
  type AwsCodeBuildProjectEnvironmentEnvironmentVariablesList = js.Array[AwsCodeBuildProjectEnvironmentEnvironmentVariablesDetails]
  type AwsDynamoDbTableAttributeDefinitionList = js.Array[AwsDynamoDbTableAttributeDefinition]
  type AwsDynamoDbTableGlobalSecondaryIndexList = js.Array[AwsDynamoDbTableGlobalSecondaryIndex]
  type AwsDynamoDbTableKeySchemaList = js.Array[AwsDynamoDbTableKeySchema]
  type AwsDynamoDbTableLocalSecondaryIndexList = js.Array[AwsDynamoDbTableLocalSecondaryIndex]
  type AwsDynamoDbTableReplicaGlobalSecondaryIndexList = js.Array[AwsDynamoDbTableReplicaGlobalSecondaryIndex]
  type AwsDynamoDbTableReplicaList = js.Array[AwsDynamoDbTableReplica]
  type AwsEc2InstanceNetworkInterfacesList = js.Array[AwsEc2InstanceNetworkInterfacesDetails]
  type AwsEc2NetworkAclAssociationList = js.Array[AwsEc2NetworkAclAssociation]
  type AwsEc2NetworkAclEntryList = js.Array[AwsEc2NetworkAclEntry]
  type AwsEc2NetworkInterfaceIpV6AddressList = js.Array[AwsEc2NetworkInterfaceIpV6AddressDetail]
  type AwsEc2NetworkInterfacePrivateIpAddressList = js.Array[AwsEc2NetworkInterfacePrivateIpAddressDetail]
  type AwsEc2NetworkInterfaceSecurityGroupList = js.Array[AwsEc2NetworkInterfaceSecurityGroup]
  type AwsEc2SecurityGroupIpPermissionList = js.Array[AwsEc2SecurityGroupIpPermission]
  type AwsEc2SecurityGroupIpRangeList = js.Array[AwsEc2SecurityGroupIpRange]
  type AwsEc2SecurityGroupIpv6RangeList = js.Array[AwsEc2SecurityGroupIpv6Range]
  type AwsEc2SecurityGroupPrefixListIdList = js.Array[AwsEc2SecurityGroupPrefixListId]
  type AwsEc2SecurityGroupUserIdGroupPairList = js.Array[AwsEc2SecurityGroupUserIdGroupPair]
  type AwsEc2VolumeAttachmentList = js.Array[AwsEc2VolumeAttachment]
  type AwsEc2VpcEndpointServiceServiceTypeList = js.Array[AwsEc2VpcEndpointServiceServiceTypeDetails]
  type AwsEc2VpnConnectionOptionsTunnelOptionsList = js.Array[AwsEc2VpnConnectionOptionsTunnelOptionsDetails]
  type AwsEc2VpnConnectionRoutesList = js.Array[AwsEc2VpnConnectionRoutesDetails]
  type AwsEc2VpnConnectionVgwTelemetryList = js.Array[AwsEc2VpnConnectionVgwTelemetryDetails]
  type AwsEcsClusterClusterSettingsList = js.Array[AwsEcsClusterClusterSettingsDetails]
  type AwsEcsClusterDefaultCapacityProviderStrategyList = js.Array[AwsEcsClusterDefaultCapacityProviderStrategyDetails]
  type AwsEcsContainerDetailsList = js.Array[AwsEcsContainerDetails]
  type AwsEcsServiceCapacityProviderStrategyList = js.Array[AwsEcsServiceCapacityProviderStrategyDetails]
  type AwsEcsServiceLoadBalancersList = js.Array[AwsEcsServiceLoadBalancersDetails]
  type AwsEcsServicePlacementConstraintsList = js.Array[AwsEcsServicePlacementConstraintsDetails]
  type AwsEcsServicePlacementStrategiesList = js.Array[AwsEcsServicePlacementStrategiesDetails]
  type AwsEcsServiceServiceRegistriesList = js.Array[AwsEcsServiceServiceRegistriesDetails]
  type AwsEcsTaskDefinitionContainerDefinitionsDependsOnList = js.Array[AwsEcsTaskDefinitionContainerDefinitionsDependsOnDetails]
  type AwsEcsTaskDefinitionContainerDefinitionsEnvironmentFilesList = js.Array[AwsEcsTaskDefinitionContainerDefinitionsEnvironmentFilesDetails]
  type AwsEcsTaskDefinitionContainerDefinitionsEnvironmentList = js.Array[AwsEcsTaskDefinitionContainerDefinitionsEnvironmentDetails]
  type AwsEcsTaskDefinitionContainerDefinitionsExtraHostsList = js.Array[AwsEcsTaskDefinitionContainerDefinitionsExtraHostsDetails]
  type AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDevicesList = js.Array[AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDevicesDetails]
  type AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersTmpfsList = js.Array[AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersTmpfsDetails]
  type AwsEcsTaskDefinitionContainerDefinitionsList = js.Array[AwsEcsTaskDefinitionContainerDefinitionsDetails]
  type AwsEcsTaskDefinitionContainerDefinitionsLogConfigurationSecretOptionsList = js.Array[AwsEcsTaskDefinitionContainerDefinitionsLogConfigurationSecretOptionsDetails]
  type AwsEcsTaskDefinitionContainerDefinitionsMountPointsList = js.Array[AwsEcsTaskDefinitionContainerDefinitionsMountPointsDetails]
  type AwsEcsTaskDefinitionContainerDefinitionsPortMappingsList = js.Array[AwsEcsTaskDefinitionContainerDefinitionsPortMappingsDetails]
  type AwsEcsTaskDefinitionContainerDefinitionsResourceRequirementsList = js.Array[AwsEcsTaskDefinitionContainerDefinitionsResourceRequirementsDetails]
  type AwsEcsTaskDefinitionContainerDefinitionsSecretsList = js.Array[AwsEcsTaskDefinitionContainerDefinitionsSecretsDetails]
  type AwsEcsTaskDefinitionContainerDefinitionsSystemControlsList = js.Array[AwsEcsTaskDefinitionContainerDefinitionsSystemControlsDetails]
  type AwsEcsTaskDefinitionContainerDefinitionsUlimitsList = js.Array[AwsEcsTaskDefinitionContainerDefinitionsUlimitsDetails]
  type AwsEcsTaskDefinitionContainerDefinitionsVolumesFromList = js.Array[AwsEcsTaskDefinitionContainerDefinitionsVolumesFromDetails]
  type AwsEcsTaskDefinitionInferenceAcceleratorsList = js.Array[AwsEcsTaskDefinitionInferenceAcceleratorsDetails]
  type AwsEcsTaskDefinitionPlacementConstraintsList = js.Array[AwsEcsTaskDefinitionPlacementConstraintsDetails]
  type AwsEcsTaskDefinitionProxyConfigurationProxyConfigurationPropertiesList = js.Array[AwsEcsTaskDefinitionProxyConfigurationProxyConfigurationPropertiesDetails]
  type AwsEcsTaskDefinitionVolumesList = js.Array[AwsEcsTaskDefinitionVolumesDetails]
  type AwsEcsTaskVolumeDetailsList = js.Array[AwsEcsTaskVolumeDetails]
  type AwsEksClusterLoggingClusterLoggingList = js.Array[AwsEksClusterLoggingClusterLoggingDetails]
  type AwsElasticBeanstalkEnvironmentEnvironmentLinks = js.Array[AwsElasticBeanstalkEnvironmentEnvironmentLink]
  type AwsElasticBeanstalkEnvironmentOptionSettings = js.Array[AwsElasticBeanstalkEnvironmentOptionSetting]
  type AwsElbAppCookieStickinessPolicies = js.Array[AwsElbAppCookieStickinessPolicy]
  type AwsElbLbCookieStickinessPolicies = js.Array[AwsElbLbCookieStickinessPolicy]
  type AwsElbLoadBalancerAdditionalAttributeList = js.Array[AwsElbLoadBalancerAdditionalAttribute]
  type AwsElbLoadBalancerBackendServerDescriptions = js.Array[AwsElbLoadBalancerBackendServerDescription]
  type AwsElbLoadBalancerInstances = js.Array[AwsElbLoadBalancerInstance]
  type AwsElbLoadBalancerListenerDescriptions = js.Array[AwsElbLoadBalancerListenerDescription]
  type AwsElbv2LoadBalancerAttributes = js.Array[AwsElbv2LoadBalancerAttribute]
  type AwsIamAttachedManagedPolicyList = js.Array[AwsIamAttachedManagedPolicy]
  type AwsIamGroupPolicyList = js.Array[AwsIamGroupPolicy]
  type AwsIamInstanceProfileList = js.Array[AwsIamInstanceProfile]
  type AwsIamInstanceProfileRoles = js.Array[AwsIamInstanceProfileRole]
  type AwsIamPolicyVersionList = js.Array[AwsIamPolicyVersion]
  type AwsIamRoleAssumeRolePolicyDocument = String
  type AwsIamRolePolicyList = js.Array[AwsIamRolePolicy]
  type AwsIamUserPolicyList = js.Array[AwsIamUserPolicy]
  type AwsLambdaFunctionLayerList = js.Array[AwsLambdaFunctionLayer]
  type AwsLambdaLayerVersionNumber = Double
  type AwsMountPointList = js.Array[AwsMountPoint]
  type AwsNetworkFirewallFirewallSubnetMappingsList = js.Array[AwsNetworkFirewallFirewallSubnetMappingsDetails]
  type AwsRdsDbClusterAssociatedRoles = js.Array[AwsRdsDbClusterAssociatedRole]
  type AwsRdsDbClusterMembers = js.Array[AwsRdsDbClusterMember]
  type AwsRdsDbClusterOptionGroupMemberships = js.Array[AwsRdsDbClusterOptionGroupMembership]
  type AwsRdsDbDomainMemberships = js.Array[AwsRdsDbDomainMembership]
  type AwsRdsDbInstanceAssociatedRoles = js.Array[AwsRdsDbInstanceAssociatedRole]
  type AwsRdsDbInstanceVpcSecurityGroups = js.Array[AwsRdsDbInstanceVpcSecurityGroup]
  type AwsRdsDbOptionGroupMemberships = js.Array[AwsRdsDbOptionGroupMembership]
  type AwsRdsDbParameterGroups = js.Array[AwsRdsDbParameterGroup]
  type AwsRdsDbProcessorFeatures = js.Array[AwsRdsDbProcessorFeature]
  type AwsRdsDbSecurityGroupEc2SecurityGroups = js.Array[AwsRdsDbSecurityGroupEc2SecurityGroup]
  type AwsRdsDbSecurityGroupIpRanges = js.Array[AwsRdsDbSecurityGroupIpRange]
  type AwsRdsDbStatusInfos = js.Array[AwsRdsDbStatusInfo]
  type AwsRdsDbSubnetGroupSubnets = js.Array[AwsRdsDbSubnetGroupSubnet]
  type AwsRedshiftClusterClusterNodes = js.Array[AwsRedshiftClusterClusterNode]
  type AwsRedshiftClusterClusterParameterGroups = js.Array[AwsRedshiftClusterClusterParameterGroup]
  type AwsRedshiftClusterClusterParameterStatusList = js.Array[AwsRedshiftClusterClusterParameterStatus]
  type AwsRedshiftClusterClusterSecurityGroups = js.Array[AwsRedshiftClusterClusterSecurityGroup]
  type AwsRedshiftClusterDeferredMaintenanceWindows = js.Array[AwsRedshiftClusterDeferredMaintenanceWindow]
  type AwsRedshiftClusterIamRoles = js.Array[AwsRedshiftClusterIamRole]
  type AwsRedshiftClusterVpcSecurityGroups = js.Array[AwsRedshiftClusterVpcSecurityGroup]
  type AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateOperandsList = js.Array[AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateOperandsDetails]
  type AwsS3BucketBucketLifecycleConfigurationRulesList = js.Array[AwsS3BucketBucketLifecycleConfigurationRulesDetails]
  type AwsS3BucketBucketLifecycleConfigurationRulesNoncurrentVersionTransitionsList = js.Array[AwsS3BucketBucketLifecycleConfigurationRulesNoncurrentVersionTransitionsDetails]
  type AwsS3BucketBucketLifecycleConfigurationRulesTransitionsList = js.Array[AwsS3BucketBucketLifecycleConfigurationRulesTransitionsDetails]
  type AwsS3BucketNotificationConfigurationDetails = js.Array[AwsS3BucketNotificationConfigurationDetail]
  type AwsS3BucketNotificationConfigurationEvents = js.Array[NonEmptyString]
  type AwsS3BucketNotificationConfigurationS3KeyFilterRules = js.Array[AwsS3BucketNotificationConfigurationS3KeyFilterRule]
  type AwsS3BucketServerSideEncryptionRules = js.Array[AwsS3BucketServerSideEncryptionRule]
  type AwsS3BucketWebsiteConfigurationRoutingRules = js.Array[AwsS3BucketWebsiteConfigurationRoutingRule]
  type AwsSecurityFindingIdentifierList = js.Array[AwsSecurityFindingIdentifier]
  type AwsSecurityFindingList = js.Array[AwsSecurityFinding]
  type AwsSnsTopicSubscriptionList = js.Array[AwsSnsTopicSubscription]
  type AwsWafRateBasedRuleMatchPredicateList = js.Array[AwsWafRateBasedRuleMatchPredicate]
  type AwsWafRegionalRateBasedRuleMatchPredicateList = js.Array[AwsWafRegionalRateBasedRuleMatchPredicate]
  type AwsWafRegionalRuleGroupRulesList = js.Array[AwsWafRegionalRuleGroupRulesDetails]
  type AwsWafRegionalRulePredicateList = js.Array[AwsWafRegionalRulePredicateListDetails]
  type AwsWafRegionalWebAclRulesList = js.Array[AwsWafRegionalWebAclRulesListDetails]
  type AwsWafRuleGroupRulesList = js.Array[AwsWafRuleGroupRulesDetails]
  type AwsWafRulePredicateList = js.Array[AwsWafRulePredicateListDetails]
  type AwsWafWebAclRuleList = js.Array[AwsWafWebAclRule]
  type BatchImportFindingsRequestFindingList = js.Array[AwsSecurityFinding]
  type BatchUpdateFindingsUnprocessedFindingsList = js.Array[BatchUpdateFindingsUnprocessedFinding]
  type BooleanFilterList = js.Array[BooleanFilter]
  type CategoryList = js.Array[NonEmptyString]
  type Cells = js.Array[Cell]
  type CidrBlockAssociationList = js.Array[CidrBlockAssociation]
  type CrossAccountMaxResults = Int
  type CustomDataIdentifiersDetectionsList = js.Array[CustomDataIdentifiersDetections]
  type CvssList = js.Array[Cvss]
  type DateFilterList = js.Array[DateFilter]
  type FieldMap = js.Dictionary[NonEmptyString]
  type FilePathList = js.Array[FilePaths]
  type FindingAggregatorList = js.Array[FindingAggregator]
  type FirewallPolicyStatefulRuleGroupReferencesList = js.Array[FirewallPolicyStatefulRuleGroupReferencesDetails]
  type FirewallPolicyStatelessCustomActionsList = js.Array[FirewallPolicyStatelessCustomActionsDetails]
  type FirewallPolicyStatelessRuleGroupReferencesList = js.Array[FirewallPolicyStatelessRuleGroupReferencesDetails]
  type ImportFindingsErrorList = js.Array[ImportFindingsError]
  type InsightList = js.Array[Insight]
  type InsightResultValueList = js.Array[InsightResultValue]
  type IntegerList = js.Array[Int]
  type IntegrationTypeList = js.Array[IntegrationType]
  type InvitationList = js.Array[Invitation]
  type IpFilterList = js.Array[IpFilter]
  type Ipv6CidrBlockAssociationList = js.Array[Ipv6CidrBlockAssociation]
  type KeywordFilterList = js.Array[KeywordFilter]
  type MalwareList = js.Array[Malware]
  type MapFilterList = js.Array[MapFilter]
  type MaxResults = Int
  type MemberList = js.Array[Member]
  type NetworkPathList = js.Array[NetworkPathComponent]
  type NextToken = String
  type NonEmptyString = String
  type NonEmptyStringList = js.Array[NonEmptyString]
  type NumberFilterList = js.Array[NumberFilter]
  type Pages = js.Array[Page]
  type PortProbeDetailList = js.Array[PortProbeDetail]
  type PortRangeList = js.Array[PortRange]
  type ProductSubscriptionArnList = js.Array[NonEmptyString]
  type ProductsList = js.Array[Product]
  type Ranges = js.Array[Range]
  type RatioScale = Int
  type Records = js.Array[Record]
  type RelatedFindingList = js.Array[RelatedFinding]
  type RelatedRequirementsList = js.Array[NonEmptyString]
  type ResourceArn = String
  type ResourceList = js.Array[Resource]
  type ResultList = js.Array[Result]
  type RuleGroupSourceCustomActionsList = js.Array[RuleGroupSourceCustomActionsDetails]
  type RuleGroupSourceStatefulRulesList = js.Array[RuleGroupSourceStatefulRulesDetails]
  type RuleGroupSourceStatefulRulesOptionsList = js.Array[RuleGroupSourceStatefulRulesOptionsDetails]
  type RuleGroupSourceStatefulRulesRuleOptionsSettingsList = js.Array[NonEmptyString]
  type RuleGroupSourceStatelessRuleMatchAttributesDestinationPortsList = js.Array[RuleGroupSourceStatelessRuleMatchAttributesDestinationPorts]
  type RuleGroupSourceStatelessRuleMatchAttributesDestinationsList = js.Array[RuleGroupSourceStatelessRuleMatchAttributesDestinations]
  type RuleGroupSourceStatelessRuleMatchAttributesProtocolsList = js.Array[Int]
  type RuleGroupSourceStatelessRuleMatchAttributesSourcePortsList = js.Array[RuleGroupSourceStatelessRuleMatchAttributesSourcePorts]
  type RuleGroupSourceStatelessRuleMatchAttributesSourcesList = js.Array[RuleGroupSourceStatelessRuleMatchAttributesSources]
  type RuleGroupSourceStatelessRuleMatchAttributesTcpFlagsList = js.Array[RuleGroupSourceStatelessRuleMatchAttributesTcpFlags]
  type RuleGroupSourceStatelessRulesList = js.Array[RuleGroupSourceStatelessRulesDetails]
  type SecurityGroups = js.Array[NonEmptyString]
  type SensitiveDataDetectionsList = js.Array[SensitiveDataDetections]
  type SensitiveDataResultList = js.Array[SensitiveDataResult]
  type SizeBytes = Double
  type SoftwarePackageList = js.Array[SoftwarePackage]
  type SortCriteria = js.Array[SortCriterion]
  type Standards = js.Array[Standard]
  type StandardsControls = js.Array[StandardsControl]
  type StandardsInputParameterMap = js.Dictionary[NonEmptyString]
  type StandardsSubscriptionArns = js.Array[NonEmptyString]
  type StandardsSubscriptionRequests = js.Array[StandardsSubscriptionRequest]
  type StandardsSubscriptions = js.Array[StandardsSubscription]
  type StatelessCustomPublishMetricActionDimensionsList = js.Array[StatelessCustomPublishMetricActionDimension]
  type StatusReasonsList = js.Array[StatusReason]
  type StringFilterList = js.Array[StringFilter]
  type StringList = js.Array[NonEmptyString]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagMap = js.Dictionary[TagValue]
  type TagValue = String
  type ThreatIntelIndicatorList = js.Array[ThreatIntelIndicator]
  type ThreatList = js.Array[Threat]
  type Timestamp = js.Date
  type TypeList = js.Array[NonEmptyString]
  type VolumeMountList = js.Array[VolumeMount]
  type VpcInfoCidrBlockSetList = js.Array[VpcInfoCidrBlockSetDetails]
  type VpcInfoIpv6CidrBlockSetList = js.Array[VpcInfoIpv6CidrBlockSetDetails]
  type VulnerabilityList = js.Array[Vulnerability]
  type WafExcludedRuleList = js.Array[WafExcludedRule]

  final class SecurityHubOps(private val service: SecurityHub) extends AnyVal {

    @inline def acceptAdministratorInvitationFuture(params: AcceptAdministratorInvitationRequest): Future[AcceptAdministratorInvitationResponse] = service.acceptAdministratorInvitation(params).promise().toFuture
    @inline def batchDisableStandardsFuture(params: BatchDisableStandardsRequest): Future[BatchDisableStandardsResponse] = service.batchDisableStandards(params).promise().toFuture
    @inline def batchEnableStandardsFuture(params: BatchEnableStandardsRequest): Future[BatchEnableStandardsResponse] = service.batchEnableStandards(params).promise().toFuture
    @inline def batchImportFindingsFuture(params: BatchImportFindingsRequest): Future[BatchImportFindingsResponse] = service.batchImportFindings(params).promise().toFuture
    @inline def batchUpdateFindingsFuture(params: BatchUpdateFindingsRequest): Future[BatchUpdateFindingsResponse] = service.batchUpdateFindings(params).promise().toFuture
    @inline def createActionTargetFuture(params: CreateActionTargetRequest): Future[CreateActionTargetResponse] = service.createActionTarget(params).promise().toFuture
    @inline def createFindingAggregatorFuture(params: CreateFindingAggregatorRequest): Future[CreateFindingAggregatorResponse] = service.createFindingAggregator(params).promise().toFuture
    @inline def createInsightFuture(params: CreateInsightRequest): Future[CreateInsightResponse] = service.createInsight(params).promise().toFuture
    @inline def createMembersFuture(params: CreateMembersRequest): Future[CreateMembersResponse] = service.createMembers(params).promise().toFuture
    @inline def declineInvitationsFuture(params: DeclineInvitationsRequest): Future[DeclineInvitationsResponse] = service.declineInvitations(params).promise().toFuture
    @inline def deleteActionTargetFuture(params: DeleteActionTargetRequest): Future[DeleteActionTargetResponse] = service.deleteActionTarget(params).promise().toFuture
    @inline def deleteFindingAggregatorFuture(params: DeleteFindingAggregatorRequest): Future[DeleteFindingAggregatorResponse] = service.deleteFindingAggregator(params).promise().toFuture
    @inline def deleteInsightFuture(params: DeleteInsightRequest): Future[DeleteInsightResponse] = service.deleteInsight(params).promise().toFuture
    @inline def deleteInvitationsFuture(params: DeleteInvitationsRequest): Future[DeleteInvitationsResponse] = service.deleteInvitations(params).promise().toFuture
    @inline def deleteMembersFuture(params: DeleteMembersRequest): Future[DeleteMembersResponse] = service.deleteMembers(params).promise().toFuture
    @inline def describeActionTargetsFuture(params: DescribeActionTargetsRequest): Future[DescribeActionTargetsResponse] = service.describeActionTargets(params).promise().toFuture
    @inline def describeHubFuture(params: DescribeHubRequest): Future[DescribeHubResponse] = service.describeHub(params).promise().toFuture
    @inline def describeOrganizationConfigurationFuture(params: DescribeOrganizationConfigurationRequest): Future[DescribeOrganizationConfigurationResponse] = service.describeOrganizationConfiguration(params).promise().toFuture
    @inline def describeProductsFuture(params: DescribeProductsRequest): Future[DescribeProductsResponse] = service.describeProducts(params).promise().toFuture
    @inline def describeStandardsControlsFuture(params: DescribeStandardsControlsRequest): Future[DescribeStandardsControlsResponse] = service.describeStandardsControls(params).promise().toFuture
    @inline def describeStandardsFuture(params: DescribeStandardsRequest): Future[DescribeStandardsResponse] = service.describeStandards(params).promise().toFuture
    @inline def disableImportFindingsForProductFuture(params: DisableImportFindingsForProductRequest): Future[DisableImportFindingsForProductResponse] = service.disableImportFindingsForProduct(params).promise().toFuture
    @inline def disableOrganizationAdminAccountFuture(params: DisableOrganizationAdminAccountRequest): Future[DisableOrganizationAdminAccountResponse] = service.disableOrganizationAdminAccount(params).promise().toFuture
    @inline def disableSecurityHubFuture(params: DisableSecurityHubRequest): Future[DisableSecurityHubResponse] = service.disableSecurityHub(params).promise().toFuture
    @inline def disassociateFromAdministratorAccountFuture(params: DisassociateFromAdministratorAccountRequest): Future[DisassociateFromAdministratorAccountResponse] = service.disassociateFromAdministratorAccount(params).promise().toFuture
    @inline def disassociateMembersFuture(params: DisassociateMembersRequest): Future[DisassociateMembersResponse] = service.disassociateMembers(params).promise().toFuture
    @inline def enableImportFindingsForProductFuture(params: EnableImportFindingsForProductRequest): Future[EnableImportFindingsForProductResponse] = service.enableImportFindingsForProduct(params).promise().toFuture
    @inline def enableOrganizationAdminAccountFuture(params: EnableOrganizationAdminAccountRequest): Future[EnableOrganizationAdminAccountResponse] = service.enableOrganizationAdminAccount(params).promise().toFuture
    @inline def enableSecurityHubFuture(params: EnableSecurityHubRequest): Future[EnableSecurityHubResponse] = service.enableSecurityHub(params).promise().toFuture
    @inline def getAdministratorAccountFuture(params: GetAdministratorAccountRequest): Future[GetAdministratorAccountResponse] = service.getAdministratorAccount(params).promise().toFuture
    @inline def getEnabledStandardsFuture(params: GetEnabledStandardsRequest): Future[GetEnabledStandardsResponse] = service.getEnabledStandards(params).promise().toFuture
    @inline def getFindingAggregatorFuture(params: GetFindingAggregatorRequest): Future[GetFindingAggregatorResponse] = service.getFindingAggregator(params).promise().toFuture
    @inline def getFindingsFuture(params: GetFindingsRequest): Future[GetFindingsResponse] = service.getFindings(params).promise().toFuture
    @inline def getInsightResultsFuture(params: GetInsightResultsRequest): Future[GetInsightResultsResponse] = service.getInsightResults(params).promise().toFuture
    @inline def getInsightsFuture(params: GetInsightsRequest): Future[GetInsightsResponse] = service.getInsights(params).promise().toFuture
    @inline def getInvitationsCountFuture(params: GetInvitationsCountRequest): Future[GetInvitationsCountResponse] = service.getInvitationsCount(params).promise().toFuture
    @inline def getMembersFuture(params: GetMembersRequest): Future[GetMembersResponse] = service.getMembers(params).promise().toFuture
    @inline def inviteMembersFuture(params: InviteMembersRequest): Future[InviteMembersResponse] = service.inviteMembers(params).promise().toFuture
    @inline def listEnabledProductsForImportFuture(params: ListEnabledProductsForImportRequest): Future[ListEnabledProductsForImportResponse] = service.listEnabledProductsForImport(params).promise().toFuture
    @inline def listFindingAggregatorsFuture(params: ListFindingAggregatorsRequest): Future[ListFindingAggregatorsResponse] = service.listFindingAggregators(params).promise().toFuture
    @inline def listInvitationsFuture(params: ListInvitationsRequest): Future[ListInvitationsResponse] = service.listInvitations(params).promise().toFuture
    @inline def listMembersFuture(params: ListMembersRequest): Future[ListMembersResponse] = service.listMembers(params).promise().toFuture
    @inline def listOrganizationAdminAccountsFuture(params: ListOrganizationAdminAccountsRequest): Future[ListOrganizationAdminAccountsResponse] = service.listOrganizationAdminAccounts(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateActionTargetFuture(params: UpdateActionTargetRequest): Future[UpdateActionTargetResponse] = service.updateActionTarget(params).promise().toFuture
    @inline def updateFindingAggregatorFuture(params: UpdateFindingAggregatorRequest): Future[UpdateFindingAggregatorResponse] = service.updateFindingAggregator(params).promise().toFuture
    @inline def updateFindingsFuture(params: UpdateFindingsRequest): Future[UpdateFindingsResponse] = service.updateFindings(params).promise().toFuture
    @inline def updateInsightFuture(params: UpdateInsightRequest): Future[UpdateInsightResponse] = service.updateInsight(params).promise().toFuture
    @inline def updateOrganizationConfigurationFuture(params: UpdateOrganizationConfigurationRequest): Future[UpdateOrganizationConfigurationResponse] = service.updateOrganizationConfiguration(params).promise().toFuture
    @inline def updateSecurityHubConfigurationFuture(params: UpdateSecurityHubConfigurationRequest): Future[UpdateSecurityHubConfigurationResponse] = service.updateSecurityHubConfiguration(params).promise().toFuture
    @inline def updateStandardsControlFuture(params: UpdateStandardsControlRequest): Future[UpdateStandardsControlResponse] = service.updateStandardsControl(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/securityhub", JSImport.Namespace, "AWS.SecurityHub")
  class SecurityHub() extends js.Object {
    def this(config: AWSConfig) = this()

    @deprecated("This API has been deprecated, use AcceptAdministratorInvitation API instead.", "forever") def acceptInvitation(params: AcceptInvitationRequest): Request[AcceptInvitationResponse] = js.native
    @deprecated("This API has been deprecated, use DisassociateFromAdministratorAccount API instead.", "forever") def disassociateFromMasterAccount(params: DisassociateFromMasterAccountRequest): Request[DisassociateFromMasterAccountResponse] = js.native
    @deprecated("This API has been deprecated, use GetAdministratorAccount API instead.", "forever") def getMasterAccount(params: GetMasterAccountRequest): Request[GetMasterAccountResponse] = js.native
    def acceptAdministratorInvitation(params: AcceptAdministratorInvitationRequest): Request[AcceptAdministratorInvitationResponse] = js.native
    def batchDisableStandards(params: BatchDisableStandardsRequest): Request[BatchDisableStandardsResponse] = js.native
    def batchEnableStandards(params: BatchEnableStandardsRequest): Request[BatchEnableStandardsResponse] = js.native
    def batchImportFindings(params: BatchImportFindingsRequest): Request[BatchImportFindingsResponse] = js.native
    def batchUpdateFindings(params: BatchUpdateFindingsRequest): Request[BatchUpdateFindingsResponse] = js.native
    def createActionTarget(params: CreateActionTargetRequest): Request[CreateActionTargetResponse] = js.native
    def createFindingAggregator(params: CreateFindingAggregatorRequest): Request[CreateFindingAggregatorResponse] = js.native
    def createInsight(params: CreateInsightRequest): Request[CreateInsightResponse] = js.native
    def createMembers(params: CreateMembersRequest): Request[CreateMembersResponse] = js.native
    def declineInvitations(params: DeclineInvitationsRequest): Request[DeclineInvitationsResponse] = js.native
    def deleteActionTarget(params: DeleteActionTargetRequest): Request[DeleteActionTargetResponse] = js.native
    def deleteFindingAggregator(params: DeleteFindingAggregatorRequest): Request[DeleteFindingAggregatorResponse] = js.native
    def deleteInsight(params: DeleteInsightRequest): Request[DeleteInsightResponse] = js.native
    def deleteInvitations(params: DeleteInvitationsRequest): Request[DeleteInvitationsResponse] = js.native
    def deleteMembers(params: DeleteMembersRequest): Request[DeleteMembersResponse] = js.native
    def describeActionTargets(params: DescribeActionTargetsRequest): Request[DescribeActionTargetsResponse] = js.native
    def describeHub(params: DescribeHubRequest): Request[DescribeHubResponse] = js.native
    def describeOrganizationConfiguration(params: DescribeOrganizationConfigurationRequest): Request[DescribeOrganizationConfigurationResponse] = js.native
    def describeProducts(params: DescribeProductsRequest): Request[DescribeProductsResponse] = js.native
    def describeStandards(params: DescribeStandardsRequest): Request[DescribeStandardsResponse] = js.native
    def describeStandardsControls(params: DescribeStandardsControlsRequest): Request[DescribeStandardsControlsResponse] = js.native
    def disableImportFindingsForProduct(params: DisableImportFindingsForProductRequest): Request[DisableImportFindingsForProductResponse] = js.native
    def disableOrganizationAdminAccount(params: DisableOrganizationAdminAccountRequest): Request[DisableOrganizationAdminAccountResponse] = js.native
    def disableSecurityHub(params: DisableSecurityHubRequest): Request[DisableSecurityHubResponse] = js.native
    def disassociateFromAdministratorAccount(params: DisassociateFromAdministratorAccountRequest): Request[DisassociateFromAdministratorAccountResponse] = js.native
    def disassociateMembers(params: DisassociateMembersRequest): Request[DisassociateMembersResponse] = js.native
    def enableImportFindingsForProduct(params: EnableImportFindingsForProductRequest): Request[EnableImportFindingsForProductResponse] = js.native
    def enableOrganizationAdminAccount(params: EnableOrganizationAdminAccountRequest): Request[EnableOrganizationAdminAccountResponse] = js.native
    def enableSecurityHub(params: EnableSecurityHubRequest): Request[EnableSecurityHubResponse] = js.native
    def getAdministratorAccount(params: GetAdministratorAccountRequest): Request[GetAdministratorAccountResponse] = js.native
    def getEnabledStandards(params: GetEnabledStandardsRequest): Request[GetEnabledStandardsResponse] = js.native
    def getFindingAggregator(params: GetFindingAggregatorRequest): Request[GetFindingAggregatorResponse] = js.native
    def getFindings(params: GetFindingsRequest): Request[GetFindingsResponse] = js.native
    def getInsightResults(params: GetInsightResultsRequest): Request[GetInsightResultsResponse] = js.native
    def getInsights(params: GetInsightsRequest): Request[GetInsightsResponse] = js.native
    def getInvitationsCount(params: GetInvitationsCountRequest): Request[GetInvitationsCountResponse] = js.native
    def getMembers(params: GetMembersRequest): Request[GetMembersResponse] = js.native
    def inviteMembers(params: InviteMembersRequest): Request[InviteMembersResponse] = js.native
    def listEnabledProductsForImport(params: ListEnabledProductsForImportRequest): Request[ListEnabledProductsForImportResponse] = js.native
    def listFindingAggregators(params: ListFindingAggregatorsRequest): Request[ListFindingAggregatorsResponse] = js.native
    def listInvitations(params: ListInvitationsRequest): Request[ListInvitationsResponse] = js.native
    def listMembers(params: ListMembersRequest): Request[ListMembersResponse] = js.native
    def listOrganizationAdminAccounts(params: ListOrganizationAdminAccountsRequest): Request[ListOrganizationAdminAccountsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateActionTarget(params: UpdateActionTargetRequest): Request[UpdateActionTargetResponse] = js.native
    def updateFindingAggregator(params: UpdateFindingAggregatorRequest): Request[UpdateFindingAggregatorResponse] = js.native
    def updateFindings(params: UpdateFindingsRequest): Request[UpdateFindingsResponse] = js.native
    def updateInsight(params: UpdateInsightRequest): Request[UpdateInsightResponse] = js.native
    def updateOrganizationConfiguration(params: UpdateOrganizationConfigurationRequest): Request[UpdateOrganizationConfigurationResponse] = js.native
    def updateSecurityHubConfiguration(params: UpdateSecurityHubConfigurationRequest): Request[UpdateSecurityHubConfigurationResponse] = js.native
    def updateStandardsControl(params: UpdateStandardsControlRequest): Request[UpdateStandardsControlResponse] = js.native
  }
  object SecurityHub {
    @inline implicit def toOps(service: SecurityHub): SecurityHubOps = {
      new SecurityHubOps(service)
    }
  }

  @js.native
  trait AcceptAdministratorInvitationRequest extends js.Object {
    var AdministratorId: NonEmptyString
    var InvitationId: NonEmptyString
  }

  object AcceptAdministratorInvitationRequest {
    @inline
    def apply(
        AdministratorId: NonEmptyString,
        InvitationId: NonEmptyString
    ): AcceptAdministratorInvitationRequest = {
      val __obj = js.Dynamic.literal(
        "AdministratorId" -> AdministratorId.asInstanceOf[js.Any],
        "InvitationId" -> InvitationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AcceptAdministratorInvitationRequest]
    }
  }

  @js.native
  trait AcceptAdministratorInvitationResponse extends js.Object

  object AcceptAdministratorInvitationResponse {
    @inline
    def apply(): AcceptAdministratorInvitationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AcceptAdministratorInvitationResponse]
    }
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
        "MasterId" -> MasterId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AcceptInvitationRequest]
    }
  }

  @js.native
  trait AcceptInvitationResponse extends js.Object

  object AcceptInvitationResponse {
    @inline
    def apply(): AcceptInvitationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AcceptInvitationResponse]
    }
  }

  /** The details of an Amazon Web Services account.
    */
  @js.native
  trait AccountDetails extends js.Object {
    var AccountId: AccountId
    var Email: js.UndefOr[NonEmptyString]
  }

  object AccountDetails {
    @inline
    def apply(
        AccountId: AccountId,
        Email: js.UndefOr[NonEmptyString] = js.undefined
    ): AccountDetails = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any]
      )

      Email.foreach(__v => __obj.updateDynamic("Email")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccountDetails]
    }
  }

  /** Provides details about one of the following actions that affects or that was taken on a resource: * A remote IP address issued an Amazon Web Services API call * A DNS request was received * A remote IP address attempted to connect to an EC2 instance * A remote IP address attempted a port probe on an EC2 instance
    */
  @js.native
  trait Action extends js.Object {
    var ActionType: js.UndefOr[NonEmptyString]
    var AwsApiCallAction: js.UndefOr[AwsApiCallAction]
    var DnsRequestAction: js.UndefOr[DnsRequestAction]
    var NetworkConnectionAction: js.UndefOr[NetworkConnectionAction]
    var PortProbeAction: js.UndefOr[PortProbeAction]
  }

  object Action {
    @inline
    def apply(
        ActionType: js.UndefOr[NonEmptyString] = js.undefined,
        AwsApiCallAction: js.UndefOr[AwsApiCallAction] = js.undefined,
        DnsRequestAction: js.UndefOr[DnsRequestAction] = js.undefined,
        NetworkConnectionAction: js.UndefOr[NetworkConnectionAction] = js.undefined,
        PortProbeAction: js.UndefOr[PortProbeAction] = js.undefined
    ): Action = {
      val __obj = js.Dynamic.literal()
      ActionType.foreach(__v => __obj.updateDynamic("ActionType")(__v.asInstanceOf[js.Any]))
      AwsApiCallAction.foreach(__v => __obj.updateDynamic("AwsApiCallAction")(__v.asInstanceOf[js.Any]))
      DnsRequestAction.foreach(__v => __obj.updateDynamic("DnsRequestAction")(__v.asInstanceOf[js.Any]))
      NetworkConnectionAction.foreach(__v => __obj.updateDynamic("NetworkConnectionAction")(__v.asInstanceOf[js.Any]))
      PortProbeAction.foreach(__v => __obj.updateDynamic("PortProbeAction")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Action]
    }
  }

  /** Provides information about the IP address where the scanned port is located.
    */
  @js.native
  trait ActionLocalIpDetails extends js.Object {
    var IpAddressV4: js.UndefOr[NonEmptyString]
  }

  object ActionLocalIpDetails {
    @inline
    def apply(
        IpAddressV4: js.UndefOr[NonEmptyString] = js.undefined
    ): ActionLocalIpDetails = {
      val __obj = js.Dynamic.literal()
      IpAddressV4.foreach(__v => __obj.updateDynamic("IpAddressV4")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActionLocalIpDetails]
    }
  }

  /** For <code>NetworkConnectionAction</code> and <code>PortProbeDetails</code>, <code>LocalPortDetails</code> provides information about the local port that was involved in the action.
    */
  @js.native
  trait ActionLocalPortDetails extends js.Object {
    var Port: js.UndefOr[Int]
    var PortName: js.UndefOr[NonEmptyString]
  }

  object ActionLocalPortDetails {
    @inline
    def apply(
        Port: js.UndefOr[Int] = js.undefined,
        PortName: js.UndefOr[NonEmptyString] = js.undefined
    ): ActionLocalPortDetails = {
      val __obj = js.Dynamic.literal()
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      PortName.foreach(__v => __obj.updateDynamic("PortName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActionLocalPortDetails]
    }
  }

  /** For <code>AwsApiAction</code>, <code>NetworkConnectionAction</code>, and <code>PortProbeAction</code>, <code>RemoteIpDetails</code> provides information about the remote IP address that was involved in the action.
    */
  @js.native
  trait ActionRemoteIpDetails extends js.Object {
    var City: js.UndefOr[City]
    var Country: js.UndefOr[Country]
    var GeoLocation: js.UndefOr[GeoLocation]
    var IpAddressV4: js.UndefOr[NonEmptyString]
    var Organization: js.UndefOr[IpOrganizationDetails]
  }

  object ActionRemoteIpDetails {
    @inline
    def apply(
        City: js.UndefOr[City] = js.undefined,
        Country: js.UndefOr[Country] = js.undefined,
        GeoLocation: js.UndefOr[GeoLocation] = js.undefined,
        IpAddressV4: js.UndefOr[NonEmptyString] = js.undefined,
        Organization: js.UndefOr[IpOrganizationDetails] = js.undefined
    ): ActionRemoteIpDetails = {
      val __obj = js.Dynamic.literal()
      City.foreach(__v => __obj.updateDynamic("City")(__v.asInstanceOf[js.Any]))
      Country.foreach(__v => __obj.updateDynamic("Country")(__v.asInstanceOf[js.Any]))
      GeoLocation.foreach(__v => __obj.updateDynamic("GeoLocation")(__v.asInstanceOf[js.Any]))
      IpAddressV4.foreach(__v => __obj.updateDynamic("IpAddressV4")(__v.asInstanceOf[js.Any]))
      Organization.foreach(__v => __obj.updateDynamic("Organization")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActionRemoteIpDetails]
    }
  }

  /** Provides information about the remote port that was involved in an attempted network connection.
    */
  @js.native
  trait ActionRemotePortDetails extends js.Object {
    var Port: js.UndefOr[Int]
    var PortName: js.UndefOr[NonEmptyString]
  }

  object ActionRemotePortDetails {
    @inline
    def apply(
        Port: js.UndefOr[Int] = js.undefined,
        PortName: js.UndefOr[NonEmptyString] = js.undefined
    ): ActionRemotePortDetails = {
      val __obj = js.Dynamic.literal()
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      PortName.foreach(__v => __obj.updateDynamic("PortName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActionRemotePortDetails]
    }
  }

  /** An <code>ActionTarget</code> object.
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
        "Description" -> Description.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ActionTarget]
    }
  }

  /** An adjustment to the CVSS metric.
    */
  @js.native
  trait Adjustment extends js.Object {
    var Metric: js.UndefOr[NonEmptyString]
    var Reason: js.UndefOr[NonEmptyString]
  }

  object Adjustment {
    @inline
    def apply(
        Metric: js.UndefOr[NonEmptyString] = js.undefined,
        Reason: js.UndefOr[NonEmptyString] = js.undefined
    ): Adjustment = {
      val __obj = js.Dynamic.literal()
      Metric.foreach(__v => __obj.updateDynamic("Metric")(__v.asInstanceOf[js.Any]))
      Reason.foreach(__v => __obj.updateDynamic("Reason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Adjustment]
    }
  }

  /** Represents a Security Hub administrator account designated by an organization management account.
    */
  @js.native
  trait AdminAccount extends js.Object {
    var AccountId: js.UndefOr[NonEmptyString]
    var Status: js.UndefOr[AdminStatus]
  }

  object AdminAccount {
    @inline
    def apply(
        AccountId: js.UndefOr[NonEmptyString] = js.undefined,
        Status: js.UndefOr[AdminStatus] = js.undefined
    ): AdminAccount = {
      val __obj = js.Dynamic.literal()
      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AdminAccount]
    }
  }

  /** Information about an Availability Zone.
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

  /** Provided if <code>ActionType</code> is <code>AWS_API_CALL</code>. It provides details about the API call that was detected.
    */
  @js.native
  trait AwsApiCallAction extends js.Object {
    var AffectedResources: js.UndefOr[FieldMap]
    var Api: js.UndefOr[NonEmptyString]
    var CallerType: js.UndefOr[NonEmptyString]
    var DomainDetails: js.UndefOr[AwsApiCallActionDomainDetails]
    var FirstSeen: js.UndefOr[NonEmptyString]
    var LastSeen: js.UndefOr[NonEmptyString]
    var RemoteIpDetails: js.UndefOr[ActionRemoteIpDetails]
    var ServiceName: js.UndefOr[NonEmptyString]
  }

  object AwsApiCallAction {
    @inline
    def apply(
        AffectedResources: js.UndefOr[FieldMap] = js.undefined,
        Api: js.UndefOr[NonEmptyString] = js.undefined,
        CallerType: js.UndefOr[NonEmptyString] = js.undefined,
        DomainDetails: js.UndefOr[AwsApiCallActionDomainDetails] = js.undefined,
        FirstSeen: js.UndefOr[NonEmptyString] = js.undefined,
        LastSeen: js.UndefOr[NonEmptyString] = js.undefined,
        RemoteIpDetails: js.UndefOr[ActionRemoteIpDetails] = js.undefined,
        ServiceName: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsApiCallAction = {
      val __obj = js.Dynamic.literal()
      AffectedResources.foreach(__v => __obj.updateDynamic("AffectedResources")(__v.asInstanceOf[js.Any]))
      Api.foreach(__v => __obj.updateDynamic("Api")(__v.asInstanceOf[js.Any]))
      CallerType.foreach(__v => __obj.updateDynamic("CallerType")(__v.asInstanceOf[js.Any]))
      DomainDetails.foreach(__v => __obj.updateDynamic("DomainDetails")(__v.asInstanceOf[js.Any]))
      FirstSeen.foreach(__v => __obj.updateDynamic("FirstSeen")(__v.asInstanceOf[js.Any]))
      LastSeen.foreach(__v => __obj.updateDynamic("LastSeen")(__v.asInstanceOf[js.Any]))
      RemoteIpDetails.foreach(__v => __obj.updateDynamic("RemoteIpDetails")(__v.asInstanceOf[js.Any]))
      ServiceName.foreach(__v => __obj.updateDynamic("ServiceName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsApiCallAction]
    }
  }

  /** Provided if <code>CallerType</code> is <code>domain</code>. It provides information about the DNS domain that issued the API call.
    */
  @js.native
  trait AwsApiCallActionDomainDetails extends js.Object {
    var Domain: js.UndefOr[NonEmptyString]
  }

  object AwsApiCallActionDomainDetails {
    @inline
    def apply(
        Domain: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsApiCallActionDomainDetails = {
      val __obj = js.Dynamic.literal()
      Domain.foreach(__v => __obj.updateDynamic("Domain")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsApiCallActionDomainDetails]
    }
  }

  /** Contains information about settings for logging access for the stage.
    */
  @js.native
  trait AwsApiGatewayAccessLogSettings extends js.Object {
    var DestinationArn: js.UndefOr[NonEmptyString]
    var Format: js.UndefOr[NonEmptyString]
  }

  object AwsApiGatewayAccessLogSettings {
    @inline
    def apply(
        DestinationArn: js.UndefOr[NonEmptyString] = js.undefined,
        Format: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsApiGatewayAccessLogSettings = {
      val __obj = js.Dynamic.literal()
      DestinationArn.foreach(__v => __obj.updateDynamic("DestinationArn")(__v.asInstanceOf[js.Any]))
      Format.foreach(__v => __obj.updateDynamic("Format")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsApiGatewayAccessLogSettings]
    }
  }

  /** Contains information about settings for canary deployment in the stage.
    */
  @js.native
  trait AwsApiGatewayCanarySettings extends js.Object {
    var DeploymentId: js.UndefOr[NonEmptyString]
    var PercentTraffic: js.UndefOr[Double]
    var StageVariableOverrides: js.UndefOr[FieldMap]
    var UseStageCache: js.UndefOr[Boolean]
  }

  object AwsApiGatewayCanarySettings {
    @inline
    def apply(
        DeploymentId: js.UndefOr[NonEmptyString] = js.undefined,
        PercentTraffic: js.UndefOr[Double] = js.undefined,
        StageVariableOverrides: js.UndefOr[FieldMap] = js.undefined,
        UseStageCache: js.UndefOr[Boolean] = js.undefined
    ): AwsApiGatewayCanarySettings = {
      val __obj = js.Dynamic.literal()
      DeploymentId.foreach(__v => __obj.updateDynamic("DeploymentId")(__v.asInstanceOf[js.Any]))
      PercentTraffic.foreach(__v => __obj.updateDynamic("PercentTraffic")(__v.asInstanceOf[js.Any]))
      StageVariableOverrides.foreach(__v => __obj.updateDynamic("StageVariableOverrides")(__v.asInstanceOf[js.Any]))
      UseStageCache.foreach(__v => __obj.updateDynamic("UseStageCache")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsApiGatewayCanarySettings]
    }
  }

  /** Contains information about the endpoints for the API.
    */
  @js.native
  trait AwsApiGatewayEndpointConfiguration extends js.Object {
    var Types: js.UndefOr[NonEmptyStringList]
  }

  object AwsApiGatewayEndpointConfiguration {
    @inline
    def apply(
        Types: js.UndefOr[NonEmptyStringList] = js.undefined
    ): AwsApiGatewayEndpointConfiguration = {
      val __obj = js.Dynamic.literal()
      Types.foreach(__v => __obj.updateDynamic("Types")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsApiGatewayEndpointConfiguration]
    }
  }

  /** Defines settings for a method for the stage.
    */
  @js.native
  trait AwsApiGatewayMethodSettings extends js.Object {
    var CacheDataEncrypted: js.UndefOr[Boolean]
    var CacheTtlInSeconds: js.UndefOr[Int]
    var CachingEnabled: js.UndefOr[Boolean]
    var DataTraceEnabled: js.UndefOr[Boolean]
    var HttpMethod: js.UndefOr[NonEmptyString]
    var LoggingLevel: js.UndefOr[NonEmptyString]
    var MetricsEnabled: js.UndefOr[Boolean]
    var RequireAuthorizationForCacheControl: js.UndefOr[Boolean]
    var ResourcePath: js.UndefOr[NonEmptyString]
    var ThrottlingBurstLimit: js.UndefOr[Int]
    var ThrottlingRateLimit: js.UndefOr[Double]
    var UnauthorizedCacheControlHeaderStrategy: js.UndefOr[NonEmptyString]
  }

  object AwsApiGatewayMethodSettings {
    @inline
    def apply(
        CacheDataEncrypted: js.UndefOr[Boolean] = js.undefined,
        CacheTtlInSeconds: js.UndefOr[Int] = js.undefined,
        CachingEnabled: js.UndefOr[Boolean] = js.undefined,
        DataTraceEnabled: js.UndefOr[Boolean] = js.undefined,
        HttpMethod: js.UndefOr[NonEmptyString] = js.undefined,
        LoggingLevel: js.UndefOr[NonEmptyString] = js.undefined,
        MetricsEnabled: js.UndefOr[Boolean] = js.undefined,
        RequireAuthorizationForCacheControl: js.UndefOr[Boolean] = js.undefined,
        ResourcePath: js.UndefOr[NonEmptyString] = js.undefined,
        ThrottlingBurstLimit: js.UndefOr[Int] = js.undefined,
        ThrottlingRateLimit: js.UndefOr[Double] = js.undefined,
        UnauthorizedCacheControlHeaderStrategy: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsApiGatewayMethodSettings = {
      val __obj = js.Dynamic.literal()
      CacheDataEncrypted.foreach(__v => __obj.updateDynamic("CacheDataEncrypted")(__v.asInstanceOf[js.Any]))
      CacheTtlInSeconds.foreach(__v => __obj.updateDynamic("CacheTtlInSeconds")(__v.asInstanceOf[js.Any]))
      CachingEnabled.foreach(__v => __obj.updateDynamic("CachingEnabled")(__v.asInstanceOf[js.Any]))
      DataTraceEnabled.foreach(__v => __obj.updateDynamic("DataTraceEnabled")(__v.asInstanceOf[js.Any]))
      HttpMethod.foreach(__v => __obj.updateDynamic("HttpMethod")(__v.asInstanceOf[js.Any]))
      LoggingLevel.foreach(__v => __obj.updateDynamic("LoggingLevel")(__v.asInstanceOf[js.Any]))
      MetricsEnabled.foreach(__v => __obj.updateDynamic("MetricsEnabled")(__v.asInstanceOf[js.Any]))
      RequireAuthorizationForCacheControl.foreach(__v => __obj.updateDynamic("RequireAuthorizationForCacheControl")(__v.asInstanceOf[js.Any]))
      ResourcePath.foreach(__v => __obj.updateDynamic("ResourcePath")(__v.asInstanceOf[js.Any]))
      ThrottlingBurstLimit.foreach(__v => __obj.updateDynamic("ThrottlingBurstLimit")(__v.asInstanceOf[js.Any]))
      ThrottlingRateLimit.foreach(__v => __obj.updateDynamic("ThrottlingRateLimit")(__v.asInstanceOf[js.Any]))
      UnauthorizedCacheControlHeaderStrategy.foreach(__v => __obj.updateDynamic("UnauthorizedCacheControlHeaderStrategy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsApiGatewayMethodSettings]
    }
  }

  /** Contains information about a REST API in version 1 of Amazon API Gateway.
    */
  @js.native
  trait AwsApiGatewayRestApiDetails extends js.Object {
    var ApiKeySource: js.UndefOr[NonEmptyString]
    var BinaryMediaTypes: js.UndefOr[NonEmptyStringList]
    var CreatedDate: js.UndefOr[NonEmptyString]
    var Description: js.UndefOr[NonEmptyString]
    var EndpointConfiguration: js.UndefOr[AwsApiGatewayEndpointConfiguration]
    var Id: js.UndefOr[NonEmptyString]
    var MinimumCompressionSize: js.UndefOr[Int]
    var Name: js.UndefOr[NonEmptyString]
    var Version: js.UndefOr[NonEmptyString]
  }

  object AwsApiGatewayRestApiDetails {
    @inline
    def apply(
        ApiKeySource: js.UndefOr[NonEmptyString] = js.undefined,
        BinaryMediaTypes: js.UndefOr[NonEmptyStringList] = js.undefined,
        CreatedDate: js.UndefOr[NonEmptyString] = js.undefined,
        Description: js.UndefOr[NonEmptyString] = js.undefined,
        EndpointConfiguration: js.UndefOr[AwsApiGatewayEndpointConfiguration] = js.undefined,
        Id: js.UndefOr[NonEmptyString] = js.undefined,
        MinimumCompressionSize: js.UndefOr[Int] = js.undefined,
        Name: js.UndefOr[NonEmptyString] = js.undefined,
        Version: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsApiGatewayRestApiDetails = {
      val __obj = js.Dynamic.literal()
      ApiKeySource.foreach(__v => __obj.updateDynamic("ApiKeySource")(__v.asInstanceOf[js.Any]))
      BinaryMediaTypes.foreach(__v => __obj.updateDynamic("BinaryMediaTypes")(__v.asInstanceOf[js.Any]))
      CreatedDate.foreach(__v => __obj.updateDynamic("CreatedDate")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EndpointConfiguration.foreach(__v => __obj.updateDynamic("EndpointConfiguration")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      MinimumCompressionSize.foreach(__v => __obj.updateDynamic("MinimumCompressionSize")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsApiGatewayRestApiDetails]
    }
  }

  /** Provides information about a version 1 Amazon API Gateway stage.
    */
  @js.native
  trait AwsApiGatewayStageDetails extends js.Object {
    var AccessLogSettings: js.UndefOr[AwsApiGatewayAccessLogSettings]
    var CacheClusterEnabled: js.UndefOr[Boolean]
    var CacheClusterSize: js.UndefOr[NonEmptyString]
    var CacheClusterStatus: js.UndefOr[NonEmptyString]
    var CanarySettings: js.UndefOr[AwsApiGatewayCanarySettings]
    var ClientCertificateId: js.UndefOr[NonEmptyString]
    var CreatedDate: js.UndefOr[NonEmptyString]
    var DeploymentId: js.UndefOr[NonEmptyString]
    var Description: js.UndefOr[NonEmptyString]
    var DocumentationVersion: js.UndefOr[NonEmptyString]
    var LastUpdatedDate: js.UndefOr[NonEmptyString]
    var MethodSettings: js.UndefOr[AwsApiGatewayMethodSettingsList]
    var StageName: js.UndefOr[NonEmptyString]
    var TracingEnabled: js.UndefOr[Boolean]
    var Variables: js.UndefOr[FieldMap]
    var WebAclArn: js.UndefOr[NonEmptyString]
  }

  object AwsApiGatewayStageDetails {
    @inline
    def apply(
        AccessLogSettings: js.UndefOr[AwsApiGatewayAccessLogSettings] = js.undefined,
        CacheClusterEnabled: js.UndefOr[Boolean] = js.undefined,
        CacheClusterSize: js.UndefOr[NonEmptyString] = js.undefined,
        CacheClusterStatus: js.UndefOr[NonEmptyString] = js.undefined,
        CanarySettings: js.UndefOr[AwsApiGatewayCanarySettings] = js.undefined,
        ClientCertificateId: js.UndefOr[NonEmptyString] = js.undefined,
        CreatedDate: js.UndefOr[NonEmptyString] = js.undefined,
        DeploymentId: js.UndefOr[NonEmptyString] = js.undefined,
        Description: js.UndefOr[NonEmptyString] = js.undefined,
        DocumentationVersion: js.UndefOr[NonEmptyString] = js.undefined,
        LastUpdatedDate: js.UndefOr[NonEmptyString] = js.undefined,
        MethodSettings: js.UndefOr[AwsApiGatewayMethodSettingsList] = js.undefined,
        StageName: js.UndefOr[NonEmptyString] = js.undefined,
        TracingEnabled: js.UndefOr[Boolean] = js.undefined,
        Variables: js.UndefOr[FieldMap] = js.undefined,
        WebAclArn: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsApiGatewayStageDetails = {
      val __obj = js.Dynamic.literal()
      AccessLogSettings.foreach(__v => __obj.updateDynamic("AccessLogSettings")(__v.asInstanceOf[js.Any]))
      CacheClusterEnabled.foreach(__v => __obj.updateDynamic("CacheClusterEnabled")(__v.asInstanceOf[js.Any]))
      CacheClusterSize.foreach(__v => __obj.updateDynamic("CacheClusterSize")(__v.asInstanceOf[js.Any]))
      CacheClusterStatus.foreach(__v => __obj.updateDynamic("CacheClusterStatus")(__v.asInstanceOf[js.Any]))
      CanarySettings.foreach(__v => __obj.updateDynamic("CanarySettings")(__v.asInstanceOf[js.Any]))
      ClientCertificateId.foreach(__v => __obj.updateDynamic("ClientCertificateId")(__v.asInstanceOf[js.Any]))
      CreatedDate.foreach(__v => __obj.updateDynamic("CreatedDate")(__v.asInstanceOf[js.Any]))
      DeploymentId.foreach(__v => __obj.updateDynamic("DeploymentId")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DocumentationVersion.foreach(__v => __obj.updateDynamic("DocumentationVersion")(__v.asInstanceOf[js.Any]))
      LastUpdatedDate.foreach(__v => __obj.updateDynamic("LastUpdatedDate")(__v.asInstanceOf[js.Any]))
      MethodSettings.foreach(__v => __obj.updateDynamic("MethodSettings")(__v.asInstanceOf[js.Any]))
      StageName.foreach(__v => __obj.updateDynamic("StageName")(__v.asInstanceOf[js.Any]))
      TracingEnabled.foreach(__v => __obj.updateDynamic("TracingEnabled")(__v.asInstanceOf[js.Any]))
      Variables.foreach(__v => __obj.updateDynamic("Variables")(__v.asInstanceOf[js.Any]))
      WebAclArn.foreach(__v => __obj.updateDynamic("WebAclArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsApiGatewayStageDetails]
    }
  }

  /** Contains information about a version 2 API in Amazon API Gateway.
    */
  @js.native
  trait AwsApiGatewayV2ApiDetails extends js.Object {
    var ApiEndpoint: js.UndefOr[NonEmptyString]
    var ApiId: js.UndefOr[NonEmptyString]
    var ApiKeySelectionExpression: js.UndefOr[NonEmptyString]
    var CorsConfiguration: js.UndefOr[AwsCorsConfiguration]
    var CreatedDate: js.UndefOr[NonEmptyString]
    var Description: js.UndefOr[NonEmptyString]
    var Name: js.UndefOr[NonEmptyString]
    var ProtocolType: js.UndefOr[NonEmptyString]
    var RouteSelectionExpression: js.UndefOr[NonEmptyString]
    var Version: js.UndefOr[NonEmptyString]
  }

  object AwsApiGatewayV2ApiDetails {
    @inline
    def apply(
        ApiEndpoint: js.UndefOr[NonEmptyString] = js.undefined,
        ApiId: js.UndefOr[NonEmptyString] = js.undefined,
        ApiKeySelectionExpression: js.UndefOr[NonEmptyString] = js.undefined,
        CorsConfiguration: js.UndefOr[AwsCorsConfiguration] = js.undefined,
        CreatedDate: js.UndefOr[NonEmptyString] = js.undefined,
        Description: js.UndefOr[NonEmptyString] = js.undefined,
        Name: js.UndefOr[NonEmptyString] = js.undefined,
        ProtocolType: js.UndefOr[NonEmptyString] = js.undefined,
        RouteSelectionExpression: js.UndefOr[NonEmptyString] = js.undefined,
        Version: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsApiGatewayV2ApiDetails = {
      val __obj = js.Dynamic.literal()
      ApiEndpoint.foreach(__v => __obj.updateDynamic("ApiEndpoint")(__v.asInstanceOf[js.Any]))
      ApiId.foreach(__v => __obj.updateDynamic("ApiId")(__v.asInstanceOf[js.Any]))
      ApiKeySelectionExpression.foreach(__v => __obj.updateDynamic("ApiKeySelectionExpression")(__v.asInstanceOf[js.Any]))
      CorsConfiguration.foreach(__v => __obj.updateDynamic("CorsConfiguration")(__v.asInstanceOf[js.Any]))
      CreatedDate.foreach(__v => __obj.updateDynamic("CreatedDate")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ProtocolType.foreach(__v => __obj.updateDynamic("ProtocolType")(__v.asInstanceOf[js.Any]))
      RouteSelectionExpression.foreach(__v => __obj.updateDynamic("RouteSelectionExpression")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsApiGatewayV2ApiDetails]
    }
  }

  /** Contains route settings for a stage.
    */
  @js.native
  trait AwsApiGatewayV2RouteSettings extends js.Object {
    var DataTraceEnabled: js.UndefOr[Boolean]
    var DetailedMetricsEnabled: js.UndefOr[Boolean]
    var LoggingLevel: js.UndefOr[NonEmptyString]
    var ThrottlingBurstLimit: js.UndefOr[Int]
    var ThrottlingRateLimit: js.UndefOr[Double]
  }

  object AwsApiGatewayV2RouteSettings {
    @inline
    def apply(
        DataTraceEnabled: js.UndefOr[Boolean] = js.undefined,
        DetailedMetricsEnabled: js.UndefOr[Boolean] = js.undefined,
        LoggingLevel: js.UndefOr[NonEmptyString] = js.undefined,
        ThrottlingBurstLimit: js.UndefOr[Int] = js.undefined,
        ThrottlingRateLimit: js.UndefOr[Double] = js.undefined
    ): AwsApiGatewayV2RouteSettings = {
      val __obj = js.Dynamic.literal()
      DataTraceEnabled.foreach(__v => __obj.updateDynamic("DataTraceEnabled")(__v.asInstanceOf[js.Any]))
      DetailedMetricsEnabled.foreach(__v => __obj.updateDynamic("DetailedMetricsEnabled")(__v.asInstanceOf[js.Any]))
      LoggingLevel.foreach(__v => __obj.updateDynamic("LoggingLevel")(__v.asInstanceOf[js.Any]))
      ThrottlingBurstLimit.foreach(__v => __obj.updateDynamic("ThrottlingBurstLimit")(__v.asInstanceOf[js.Any]))
      ThrottlingRateLimit.foreach(__v => __obj.updateDynamic("ThrottlingRateLimit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsApiGatewayV2RouteSettings]
    }
  }

  /** Contains information about a version 2 stage for Amazon API Gateway.
    */
  @js.native
  trait AwsApiGatewayV2StageDetails extends js.Object {
    var AccessLogSettings: js.UndefOr[AwsApiGatewayAccessLogSettings]
    var ApiGatewayManaged: js.UndefOr[Boolean]
    var AutoDeploy: js.UndefOr[Boolean]
    var ClientCertificateId: js.UndefOr[NonEmptyString]
    var CreatedDate: js.UndefOr[NonEmptyString]
    var DefaultRouteSettings: js.UndefOr[AwsApiGatewayV2RouteSettings]
    var DeploymentId: js.UndefOr[NonEmptyString]
    var Description: js.UndefOr[NonEmptyString]
    var LastDeploymentStatusMessage: js.UndefOr[NonEmptyString]
    var LastUpdatedDate: js.UndefOr[NonEmptyString]
    var RouteSettings: js.UndefOr[AwsApiGatewayV2RouteSettings]
    var StageName: js.UndefOr[NonEmptyString]
    var StageVariables: js.UndefOr[FieldMap]
  }

  object AwsApiGatewayV2StageDetails {
    @inline
    def apply(
        AccessLogSettings: js.UndefOr[AwsApiGatewayAccessLogSettings] = js.undefined,
        ApiGatewayManaged: js.UndefOr[Boolean] = js.undefined,
        AutoDeploy: js.UndefOr[Boolean] = js.undefined,
        ClientCertificateId: js.UndefOr[NonEmptyString] = js.undefined,
        CreatedDate: js.UndefOr[NonEmptyString] = js.undefined,
        DefaultRouteSettings: js.UndefOr[AwsApiGatewayV2RouteSettings] = js.undefined,
        DeploymentId: js.UndefOr[NonEmptyString] = js.undefined,
        Description: js.UndefOr[NonEmptyString] = js.undefined,
        LastDeploymentStatusMessage: js.UndefOr[NonEmptyString] = js.undefined,
        LastUpdatedDate: js.UndefOr[NonEmptyString] = js.undefined,
        RouteSettings: js.UndefOr[AwsApiGatewayV2RouteSettings] = js.undefined,
        StageName: js.UndefOr[NonEmptyString] = js.undefined,
        StageVariables: js.UndefOr[FieldMap] = js.undefined
    ): AwsApiGatewayV2StageDetails = {
      val __obj = js.Dynamic.literal()
      AccessLogSettings.foreach(__v => __obj.updateDynamic("AccessLogSettings")(__v.asInstanceOf[js.Any]))
      ApiGatewayManaged.foreach(__v => __obj.updateDynamic("ApiGatewayManaged")(__v.asInstanceOf[js.Any]))
      AutoDeploy.foreach(__v => __obj.updateDynamic("AutoDeploy")(__v.asInstanceOf[js.Any]))
      ClientCertificateId.foreach(__v => __obj.updateDynamic("ClientCertificateId")(__v.asInstanceOf[js.Any]))
      CreatedDate.foreach(__v => __obj.updateDynamic("CreatedDate")(__v.asInstanceOf[js.Any]))
      DefaultRouteSettings.foreach(__v => __obj.updateDynamic("DefaultRouteSettings")(__v.asInstanceOf[js.Any]))
      DeploymentId.foreach(__v => __obj.updateDynamic("DeploymentId")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LastDeploymentStatusMessage.foreach(__v => __obj.updateDynamic("LastDeploymentStatusMessage")(__v.asInstanceOf[js.Any]))
      LastUpdatedDate.foreach(__v => __obj.updateDynamic("LastUpdatedDate")(__v.asInstanceOf[js.Any]))
      RouteSettings.foreach(__v => __obj.updateDynamic("RouteSettings")(__v.asInstanceOf[js.Any]))
      StageName.foreach(__v => __obj.updateDynamic("StageName")(__v.asInstanceOf[js.Any]))
      StageVariables.foreach(__v => __obj.updateDynamic("StageVariables")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsApiGatewayV2StageDetails]
    }
  }

  /** An Availability Zone for the automatic scaling group.
    */
  @js.native
  trait AwsAutoScalingAutoScalingGroupAvailabilityZonesListDetails extends js.Object {
    var Value: js.UndefOr[NonEmptyString]
  }

  object AwsAutoScalingAutoScalingGroupAvailabilityZonesListDetails {
    @inline
    def apply(
        Value: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsAutoScalingAutoScalingGroupAvailabilityZonesListDetails = {
      val __obj = js.Dynamic.literal()
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsAutoScalingAutoScalingGroupAvailabilityZonesListDetails]
    }
  }

  /** Provides details about an auto scaling group.
    */
  @js.native
  trait AwsAutoScalingAutoScalingGroupDetails extends js.Object {
    var AvailabilityZones: js.UndefOr[AwsAutoScalingAutoScalingGroupAvailabilityZonesList]
    var CapacityRebalance: js.UndefOr[Boolean]
    var CreatedTime: js.UndefOr[NonEmptyString]
    var HealthCheckGracePeriod: js.UndefOr[Int]
    var HealthCheckType: js.UndefOr[NonEmptyString]
    var LaunchConfigurationName: js.UndefOr[NonEmptyString]
    var LaunchTemplate: js.UndefOr[AwsAutoScalingAutoScalingGroupLaunchTemplateLaunchTemplateSpecification]
    var LoadBalancerNames: js.UndefOr[StringList]
    var MixedInstancesPolicy: js.UndefOr[AwsAutoScalingAutoScalingGroupMixedInstancesPolicyDetails]
  }

  object AwsAutoScalingAutoScalingGroupDetails {
    @inline
    def apply(
        AvailabilityZones: js.UndefOr[AwsAutoScalingAutoScalingGroupAvailabilityZonesList] = js.undefined,
        CapacityRebalance: js.UndefOr[Boolean] = js.undefined,
        CreatedTime: js.UndefOr[NonEmptyString] = js.undefined,
        HealthCheckGracePeriod: js.UndefOr[Int] = js.undefined,
        HealthCheckType: js.UndefOr[NonEmptyString] = js.undefined,
        LaunchConfigurationName: js.UndefOr[NonEmptyString] = js.undefined,
        LaunchTemplate: js.UndefOr[AwsAutoScalingAutoScalingGroupLaunchTemplateLaunchTemplateSpecification] = js.undefined,
        LoadBalancerNames: js.UndefOr[StringList] = js.undefined,
        MixedInstancesPolicy: js.UndefOr[AwsAutoScalingAutoScalingGroupMixedInstancesPolicyDetails] = js.undefined
    ): AwsAutoScalingAutoScalingGroupDetails = {
      val __obj = js.Dynamic.literal()
      AvailabilityZones.foreach(__v => __obj.updateDynamic("AvailabilityZones")(__v.asInstanceOf[js.Any]))
      CapacityRebalance.foreach(__v => __obj.updateDynamic("CapacityRebalance")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      HealthCheckGracePeriod.foreach(__v => __obj.updateDynamic("HealthCheckGracePeriod")(__v.asInstanceOf[js.Any]))
      HealthCheckType.foreach(__v => __obj.updateDynamic("HealthCheckType")(__v.asInstanceOf[js.Any]))
      LaunchConfigurationName.foreach(__v => __obj.updateDynamic("LaunchConfigurationName")(__v.asInstanceOf[js.Any]))
      LaunchTemplate.foreach(__v => __obj.updateDynamic("LaunchTemplate")(__v.asInstanceOf[js.Any]))
      LoadBalancerNames.foreach(__v => __obj.updateDynamic("LoadBalancerNames")(__v.asInstanceOf[js.Any]))
      MixedInstancesPolicy.foreach(__v => __obj.updateDynamic("MixedInstancesPolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsAutoScalingAutoScalingGroupDetails]
    }
  }

  /** Details about the launch template to use.
    */
  @js.native
  trait AwsAutoScalingAutoScalingGroupLaunchTemplateLaunchTemplateSpecification extends js.Object {
    var LaunchTemplateId: js.UndefOr[NonEmptyString]
    var LaunchTemplateName: js.UndefOr[NonEmptyString]
    var Version: js.UndefOr[NonEmptyString]
  }

  object AwsAutoScalingAutoScalingGroupLaunchTemplateLaunchTemplateSpecification {
    @inline
    def apply(
        LaunchTemplateId: js.UndefOr[NonEmptyString] = js.undefined,
        LaunchTemplateName: js.UndefOr[NonEmptyString] = js.undefined,
        Version: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsAutoScalingAutoScalingGroupLaunchTemplateLaunchTemplateSpecification = {
      val __obj = js.Dynamic.literal()
      LaunchTemplateId.foreach(__v => __obj.updateDynamic("LaunchTemplateId")(__v.asInstanceOf[js.Any]))
      LaunchTemplateName.foreach(__v => __obj.updateDynamic("LaunchTemplateName")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsAutoScalingAutoScalingGroupLaunchTemplateLaunchTemplateSpecification]
    }
  }

  /** The mixed instances policy for the automatic scaling group.
    */
  @js.native
  trait AwsAutoScalingAutoScalingGroupMixedInstancesPolicyDetails extends js.Object {
    var InstancesDistribution: js.UndefOr[AwsAutoScalingAutoScalingGroupMixedInstancesPolicyInstancesDistributionDetails]
    var LaunchTemplate: js.UndefOr[AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateDetails]
  }

  object AwsAutoScalingAutoScalingGroupMixedInstancesPolicyDetails {
    @inline
    def apply(
        InstancesDistribution: js.UndefOr[AwsAutoScalingAutoScalingGroupMixedInstancesPolicyInstancesDistributionDetails] = js.undefined,
        LaunchTemplate: js.UndefOr[AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateDetails] = js.undefined
    ): AwsAutoScalingAutoScalingGroupMixedInstancesPolicyDetails = {
      val __obj = js.Dynamic.literal()
      InstancesDistribution.foreach(__v => __obj.updateDynamic("InstancesDistribution")(__v.asInstanceOf[js.Any]))
      LaunchTemplate.foreach(__v => __obj.updateDynamic("LaunchTemplate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsAutoScalingAutoScalingGroupMixedInstancesPolicyDetails]
    }
  }

  /** Information about the instances distribution.
    */
  @js.native
  trait AwsAutoScalingAutoScalingGroupMixedInstancesPolicyInstancesDistributionDetails extends js.Object {
    var OnDemandAllocationStrategy: js.UndefOr[NonEmptyString]
    var OnDemandBaseCapacity: js.UndefOr[Int]
    var OnDemandPercentageAboveBaseCapacity: js.UndefOr[Int]
    var SpotAllocationStrategy: js.UndefOr[NonEmptyString]
    var SpotInstancePools: js.UndefOr[Int]
    var SpotMaxPrice: js.UndefOr[NonEmptyString]
  }

  object AwsAutoScalingAutoScalingGroupMixedInstancesPolicyInstancesDistributionDetails {
    @inline
    def apply(
        OnDemandAllocationStrategy: js.UndefOr[NonEmptyString] = js.undefined,
        OnDemandBaseCapacity: js.UndefOr[Int] = js.undefined,
        OnDemandPercentageAboveBaseCapacity: js.UndefOr[Int] = js.undefined,
        SpotAllocationStrategy: js.UndefOr[NonEmptyString] = js.undefined,
        SpotInstancePools: js.UndefOr[Int] = js.undefined,
        SpotMaxPrice: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsAutoScalingAutoScalingGroupMixedInstancesPolicyInstancesDistributionDetails = {
      val __obj = js.Dynamic.literal()
      OnDemandAllocationStrategy.foreach(__v => __obj.updateDynamic("OnDemandAllocationStrategy")(__v.asInstanceOf[js.Any]))
      OnDemandBaseCapacity.foreach(__v => __obj.updateDynamic("OnDemandBaseCapacity")(__v.asInstanceOf[js.Any]))
      OnDemandPercentageAboveBaseCapacity.foreach(__v => __obj.updateDynamic("OnDemandPercentageAboveBaseCapacity")(__v.asInstanceOf[js.Any]))
      SpotAllocationStrategy.foreach(__v => __obj.updateDynamic("SpotAllocationStrategy")(__v.asInstanceOf[js.Any]))
      SpotInstancePools.foreach(__v => __obj.updateDynamic("SpotInstancePools")(__v.asInstanceOf[js.Any]))
      SpotMaxPrice.foreach(__v => __obj.updateDynamic("SpotMaxPrice")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsAutoScalingAutoScalingGroupMixedInstancesPolicyInstancesDistributionDetails]
    }
  }

  /** Describes a launch template and overrides for a mixed instances policy.
    */
  @js.native
  trait AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateDetails extends js.Object {
    var LaunchTemplateSpecification: js.UndefOr[AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecification]
    var Overrides: js.UndefOr[AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateOverridesList]
  }

  object AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateDetails {
    @inline
    def apply(
        LaunchTemplateSpecification: js.UndefOr[AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecification] = js.undefined,
        Overrides: js.UndefOr[AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateOverridesList] = js.undefined
    ): AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateDetails = {
      val __obj = js.Dynamic.literal()
      LaunchTemplateSpecification.foreach(__v => __obj.updateDynamic("LaunchTemplateSpecification")(__v.asInstanceOf[js.Any]))
      Overrides.foreach(__v => __obj.updateDynamic("Overrides")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateDetails]
    }
  }

  /** Details about the launch template to use for a mixed instances policy.
    */
  @js.native
  trait AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecification extends js.Object {
    var LaunchTemplateId: js.UndefOr[NonEmptyString]
    var LaunchTemplateName: js.UndefOr[NonEmptyString]
    var Version: js.UndefOr[NonEmptyString]
  }

  object AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecification {
    @inline
    def apply(
        LaunchTemplateId: js.UndefOr[NonEmptyString] = js.undefined,
        LaunchTemplateName: js.UndefOr[NonEmptyString] = js.undefined,
        Version: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecification = {
      val __obj = js.Dynamic.literal()
      LaunchTemplateId.foreach(__v => __obj.updateDynamic("LaunchTemplateId")(__v.asInstanceOf[js.Any]))
      LaunchTemplateName.foreach(__v => __obj.updateDynamic("LaunchTemplateName")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecification]
    }
  }

  /** Property values to use to override the values in the launch template.
    */
  @js.native
  trait AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateOverridesListDetails extends js.Object {
    var InstanceType: js.UndefOr[NonEmptyString]
    var WeightedCapacity: js.UndefOr[NonEmptyString]
  }

  object AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateOverridesListDetails {
    @inline
    def apply(
        InstanceType: js.UndefOr[NonEmptyString] = js.undefined,
        WeightedCapacity: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateOverridesListDetails = {
      val __obj = js.Dynamic.literal()
      InstanceType.foreach(__v => __obj.updateDynamic("InstanceType")(__v.asInstanceOf[js.Any]))
      WeightedCapacity.foreach(__v => __obj.updateDynamic("WeightedCapacity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateOverridesListDetails]
    }
  }

  /** A block device for the instance.
    */
  @js.native
  trait AwsAutoScalingLaunchConfigurationBlockDeviceMappingsDetails extends js.Object {
    var DeviceName: js.UndefOr[NonEmptyString]
    var Ebs: js.UndefOr[AwsAutoScalingLaunchConfigurationBlockDeviceMappingsEbsDetails]
    var NoDevice: js.UndefOr[Boolean]
    var VirtualName: js.UndefOr[NonEmptyString]
  }

  object AwsAutoScalingLaunchConfigurationBlockDeviceMappingsDetails {
    @inline
    def apply(
        DeviceName: js.UndefOr[NonEmptyString] = js.undefined,
        Ebs: js.UndefOr[AwsAutoScalingLaunchConfigurationBlockDeviceMappingsEbsDetails] = js.undefined,
        NoDevice: js.UndefOr[Boolean] = js.undefined,
        VirtualName: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsAutoScalingLaunchConfigurationBlockDeviceMappingsDetails = {
      val __obj = js.Dynamic.literal()
      DeviceName.foreach(__v => __obj.updateDynamic("DeviceName")(__v.asInstanceOf[js.Any]))
      Ebs.foreach(__v => __obj.updateDynamic("Ebs")(__v.asInstanceOf[js.Any]))
      NoDevice.foreach(__v => __obj.updateDynamic("NoDevice")(__v.asInstanceOf[js.Any]))
      VirtualName.foreach(__v => __obj.updateDynamic("VirtualName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsAutoScalingLaunchConfigurationBlockDeviceMappingsDetails]
    }
  }

  /** Parameters that are used to automatically set up EBS volumes when an instance is launched.
    */
  @js.native
  trait AwsAutoScalingLaunchConfigurationBlockDeviceMappingsEbsDetails extends js.Object {
    var DeleteOnTermination: js.UndefOr[Boolean]
    var Encrypted: js.UndefOr[Boolean]
    var Iops: js.UndefOr[Int]
    var SnapshotId: js.UndefOr[NonEmptyString]
    var VolumeSize: js.UndefOr[Int]
    var VolumeType: js.UndefOr[NonEmptyString]
  }

  object AwsAutoScalingLaunchConfigurationBlockDeviceMappingsEbsDetails {
    @inline
    def apply(
        DeleteOnTermination: js.UndefOr[Boolean] = js.undefined,
        Encrypted: js.UndefOr[Boolean] = js.undefined,
        Iops: js.UndefOr[Int] = js.undefined,
        SnapshotId: js.UndefOr[NonEmptyString] = js.undefined,
        VolumeSize: js.UndefOr[Int] = js.undefined,
        VolumeType: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsAutoScalingLaunchConfigurationBlockDeviceMappingsEbsDetails = {
      val __obj = js.Dynamic.literal()
      DeleteOnTermination.foreach(__v => __obj.updateDynamic("DeleteOnTermination")(__v.asInstanceOf[js.Any]))
      Encrypted.foreach(__v => __obj.updateDynamic("Encrypted")(__v.asInstanceOf[js.Any]))
      Iops.foreach(__v => __obj.updateDynamic("Iops")(__v.asInstanceOf[js.Any]))
      SnapshotId.foreach(__v => __obj.updateDynamic("SnapshotId")(__v.asInstanceOf[js.Any]))
      VolumeSize.foreach(__v => __obj.updateDynamic("VolumeSize")(__v.asInstanceOf[js.Any]))
      VolumeType.foreach(__v => __obj.updateDynamic("VolumeType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsAutoScalingLaunchConfigurationBlockDeviceMappingsEbsDetails]
    }
  }

  /** Details about a launch configuration.
    */
  @js.native
  trait AwsAutoScalingLaunchConfigurationDetails extends js.Object {
    var AssociatePublicIpAddress: js.UndefOr[Boolean]
    var BlockDeviceMappings: js.UndefOr[AwsAutoScalingLaunchConfigurationBlockDeviceMappingsList]
    var ClassicLinkVpcId: js.UndefOr[NonEmptyString]
    var ClassicLinkVpcSecurityGroups: js.UndefOr[NonEmptyStringList]
    var CreatedTime: js.UndefOr[NonEmptyString]
    var EbsOptimized: js.UndefOr[Boolean]
    var IamInstanceProfile: js.UndefOr[NonEmptyString]
    var ImageId: js.UndefOr[NonEmptyString]
    var InstanceMonitoring: js.UndefOr[AwsAutoScalingLaunchConfigurationInstanceMonitoringDetails]
    var InstanceType: js.UndefOr[NonEmptyString]
    var KernelId: js.UndefOr[NonEmptyString]
    var KeyName: js.UndefOr[NonEmptyString]
    var LaunchConfigurationName: js.UndefOr[NonEmptyString]
    var MetadataOptions: js.UndefOr[AwsAutoScalingLaunchConfigurationMetadataOptions]
    var PlacementTenancy: js.UndefOr[NonEmptyString]
    var RamdiskId: js.UndefOr[NonEmptyString]
    var SecurityGroups: js.UndefOr[NonEmptyStringList]
    var SpotPrice: js.UndefOr[NonEmptyString]
    var UserData: js.UndefOr[NonEmptyString]
  }

  object AwsAutoScalingLaunchConfigurationDetails {
    @inline
    def apply(
        AssociatePublicIpAddress: js.UndefOr[Boolean] = js.undefined,
        BlockDeviceMappings: js.UndefOr[AwsAutoScalingLaunchConfigurationBlockDeviceMappingsList] = js.undefined,
        ClassicLinkVpcId: js.UndefOr[NonEmptyString] = js.undefined,
        ClassicLinkVpcSecurityGroups: js.UndefOr[NonEmptyStringList] = js.undefined,
        CreatedTime: js.UndefOr[NonEmptyString] = js.undefined,
        EbsOptimized: js.UndefOr[Boolean] = js.undefined,
        IamInstanceProfile: js.UndefOr[NonEmptyString] = js.undefined,
        ImageId: js.UndefOr[NonEmptyString] = js.undefined,
        InstanceMonitoring: js.UndefOr[AwsAutoScalingLaunchConfigurationInstanceMonitoringDetails] = js.undefined,
        InstanceType: js.UndefOr[NonEmptyString] = js.undefined,
        KernelId: js.UndefOr[NonEmptyString] = js.undefined,
        KeyName: js.UndefOr[NonEmptyString] = js.undefined,
        LaunchConfigurationName: js.UndefOr[NonEmptyString] = js.undefined,
        MetadataOptions: js.UndefOr[AwsAutoScalingLaunchConfigurationMetadataOptions] = js.undefined,
        PlacementTenancy: js.UndefOr[NonEmptyString] = js.undefined,
        RamdiskId: js.UndefOr[NonEmptyString] = js.undefined,
        SecurityGroups: js.UndefOr[NonEmptyStringList] = js.undefined,
        SpotPrice: js.UndefOr[NonEmptyString] = js.undefined,
        UserData: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsAutoScalingLaunchConfigurationDetails = {
      val __obj = js.Dynamic.literal()
      AssociatePublicIpAddress.foreach(__v => __obj.updateDynamic("AssociatePublicIpAddress")(__v.asInstanceOf[js.Any]))
      BlockDeviceMappings.foreach(__v => __obj.updateDynamic("BlockDeviceMappings")(__v.asInstanceOf[js.Any]))
      ClassicLinkVpcId.foreach(__v => __obj.updateDynamic("ClassicLinkVpcId")(__v.asInstanceOf[js.Any]))
      ClassicLinkVpcSecurityGroups.foreach(__v => __obj.updateDynamic("ClassicLinkVpcSecurityGroups")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      EbsOptimized.foreach(__v => __obj.updateDynamic("EbsOptimized")(__v.asInstanceOf[js.Any]))
      IamInstanceProfile.foreach(__v => __obj.updateDynamic("IamInstanceProfile")(__v.asInstanceOf[js.Any]))
      ImageId.foreach(__v => __obj.updateDynamic("ImageId")(__v.asInstanceOf[js.Any]))
      InstanceMonitoring.foreach(__v => __obj.updateDynamic("InstanceMonitoring")(__v.asInstanceOf[js.Any]))
      InstanceType.foreach(__v => __obj.updateDynamic("InstanceType")(__v.asInstanceOf[js.Any]))
      KernelId.foreach(__v => __obj.updateDynamic("KernelId")(__v.asInstanceOf[js.Any]))
      KeyName.foreach(__v => __obj.updateDynamic("KeyName")(__v.asInstanceOf[js.Any]))
      LaunchConfigurationName.foreach(__v => __obj.updateDynamic("LaunchConfigurationName")(__v.asInstanceOf[js.Any]))
      MetadataOptions.foreach(__v => __obj.updateDynamic("MetadataOptions")(__v.asInstanceOf[js.Any]))
      PlacementTenancy.foreach(__v => __obj.updateDynamic("PlacementTenancy")(__v.asInstanceOf[js.Any]))
      RamdiskId.foreach(__v => __obj.updateDynamic("RamdiskId")(__v.asInstanceOf[js.Any]))
      SecurityGroups.foreach(__v => __obj.updateDynamic("SecurityGroups")(__v.asInstanceOf[js.Any]))
      SpotPrice.foreach(__v => __obj.updateDynamic("SpotPrice")(__v.asInstanceOf[js.Any]))
      UserData.foreach(__v => __obj.updateDynamic("UserData")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsAutoScalingLaunchConfigurationDetails]
    }
  }

  /** Information about the type of monitoring for instances in the group.
    */
  @js.native
  trait AwsAutoScalingLaunchConfigurationInstanceMonitoringDetails extends js.Object {
    var Enabled: js.UndefOr[Boolean]
  }

  object AwsAutoScalingLaunchConfigurationInstanceMonitoringDetails {
    @inline
    def apply(
        Enabled: js.UndefOr[Boolean] = js.undefined
    ): AwsAutoScalingLaunchConfigurationInstanceMonitoringDetails = {
      val __obj = js.Dynamic.literal()
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsAutoScalingLaunchConfigurationInstanceMonitoringDetails]
    }
  }

  /** The metadata options for the instances.
    */
  @js.native
  trait AwsAutoScalingLaunchConfigurationMetadataOptions extends js.Object {
    var HttpEndpoint: js.UndefOr[NonEmptyString]
    var HttpPutResponseHopLimit: js.UndefOr[Int]
    var HttpTokens: js.UndefOr[NonEmptyString]
  }

  object AwsAutoScalingLaunchConfigurationMetadataOptions {
    @inline
    def apply(
        HttpEndpoint: js.UndefOr[NonEmptyString] = js.undefined,
        HttpPutResponseHopLimit: js.UndefOr[Int] = js.undefined,
        HttpTokens: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsAutoScalingLaunchConfigurationMetadataOptions = {
      val __obj = js.Dynamic.literal()
      HttpEndpoint.foreach(__v => __obj.updateDynamic("HttpEndpoint")(__v.asInstanceOf[js.Any]))
      HttpPutResponseHopLimit.foreach(__v => __obj.updateDynamic("HttpPutResponseHopLimit")(__v.asInstanceOf[js.Any]))
      HttpTokens.foreach(__v => __obj.updateDynamic("HttpTokens")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsAutoScalingLaunchConfigurationMetadataOptions]
    }
  }

  /** Provides a list of backup options for each resource type.
    */
  @js.native
  trait AwsBackupBackupPlanAdvancedBackupSettingsDetails extends js.Object {
    var BackupOptions: js.UndefOr[FieldMap]
    var ResourceType: js.UndefOr[NonEmptyString]
  }

  object AwsBackupBackupPlanAdvancedBackupSettingsDetails {
    @inline
    def apply(
        BackupOptions: js.UndefOr[FieldMap] = js.undefined,
        ResourceType: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsBackupBackupPlanAdvancedBackupSettingsDetails = {
      val __obj = js.Dynamic.literal()
      BackupOptions.foreach(__v => __obj.updateDynamic("BackupOptions")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsBackupBackupPlanAdvancedBackupSettingsDetails]
    }
  }

  /** Provides details about an Backup backup plan and an array of <code>BackupRule</code> objects, each of which specifies a backup rule.
    */
  @js.native
  trait AwsBackupBackupPlanBackupPlanDetails extends js.Object {
    var AdvancedBackupSettings: js.UndefOr[AwsBackupBackupPlanAdvancedBackupSettingsList]
    var BackupPlanName: js.UndefOr[NonEmptyString]
    var BackupPlanRule: js.UndefOr[AwsBackupBackupPlanRuleList]
  }

  object AwsBackupBackupPlanBackupPlanDetails {
    @inline
    def apply(
        AdvancedBackupSettings: js.UndefOr[AwsBackupBackupPlanAdvancedBackupSettingsList] = js.undefined,
        BackupPlanName: js.UndefOr[NonEmptyString] = js.undefined,
        BackupPlanRule: js.UndefOr[AwsBackupBackupPlanRuleList] = js.undefined
    ): AwsBackupBackupPlanBackupPlanDetails = {
      val __obj = js.Dynamic.literal()
      AdvancedBackupSettings.foreach(__v => __obj.updateDynamic("AdvancedBackupSettings")(__v.asInstanceOf[js.Any]))
      BackupPlanName.foreach(__v => __obj.updateDynamic("BackupPlanName")(__v.asInstanceOf[js.Any]))
      BackupPlanRule.foreach(__v => __obj.updateDynamic("BackupPlanRule")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsBackupBackupPlanBackupPlanDetails]
    }
  }

  /** Provides details about an Backup backup plan and an array of <code>BackupRule</code> objects, each of which specifies a backup rule.
    */
  @js.native
  trait AwsBackupBackupPlanDetails extends js.Object {
    var BackupPlan: js.UndefOr[AwsBackupBackupPlanBackupPlanDetails]
    var BackupPlanArn: js.UndefOr[NonEmptyString]
    var BackupPlanId: js.UndefOr[NonEmptyString]
    var VersionId: js.UndefOr[NonEmptyString]
  }

  object AwsBackupBackupPlanDetails {
    @inline
    def apply(
        BackupPlan: js.UndefOr[AwsBackupBackupPlanBackupPlanDetails] = js.undefined,
        BackupPlanArn: js.UndefOr[NonEmptyString] = js.undefined,
        BackupPlanId: js.UndefOr[NonEmptyString] = js.undefined,
        VersionId: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsBackupBackupPlanDetails = {
      val __obj = js.Dynamic.literal()
      BackupPlan.foreach(__v => __obj.updateDynamic("BackupPlan")(__v.asInstanceOf[js.Any]))
      BackupPlanArn.foreach(__v => __obj.updateDynamic("BackupPlanArn")(__v.asInstanceOf[js.Any]))
      BackupPlanId.foreach(__v => __obj.updateDynamic("BackupPlanId")(__v.asInstanceOf[js.Any]))
      VersionId.foreach(__v => __obj.updateDynamic("VersionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsBackupBackupPlanDetails]
    }
  }

  /** Provides lifecycle details for the backup plan. A lifecycle defines when a backup is transitioned to cold storage and when it expires.
    */
  @js.native
  trait AwsBackupBackupPlanLifecycleDetails extends js.Object {
    var DeleteAfterDays: js.UndefOr[Double]
    var MoveToColdStorageAfterDays: js.UndefOr[Double]
  }

  object AwsBackupBackupPlanLifecycleDetails {
    @inline
    def apply(
        DeleteAfterDays: js.UndefOr[Double] = js.undefined,
        MoveToColdStorageAfterDays: js.UndefOr[Double] = js.undefined
    ): AwsBackupBackupPlanLifecycleDetails = {
      val __obj = js.Dynamic.literal()
      DeleteAfterDays.foreach(__v => __obj.updateDynamic("DeleteAfterDays")(__v.asInstanceOf[js.Any]))
      MoveToColdStorageAfterDays.foreach(__v => __obj.updateDynamic("MoveToColdStorageAfterDays")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsBackupBackupPlanLifecycleDetails]
    }
  }

  /** An array of <code>CopyAction</code> objects, each of which contains details of the copy operation.
    */
  @js.native
  trait AwsBackupBackupPlanRuleCopyActionsDetails extends js.Object {
    var DestinationBackupVaultArn: js.UndefOr[NonEmptyString]
    var Lifecycle: js.UndefOr[AwsBackupBackupPlanLifecycleDetails]
  }

  object AwsBackupBackupPlanRuleCopyActionsDetails {
    @inline
    def apply(
        DestinationBackupVaultArn: js.UndefOr[NonEmptyString] = js.undefined,
        Lifecycle: js.UndefOr[AwsBackupBackupPlanLifecycleDetails] = js.undefined
    ): AwsBackupBackupPlanRuleCopyActionsDetails = {
      val __obj = js.Dynamic.literal()
      DestinationBackupVaultArn.foreach(__v => __obj.updateDynamic("DestinationBackupVaultArn")(__v.asInstanceOf[js.Any]))
      Lifecycle.foreach(__v => __obj.updateDynamic("Lifecycle")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsBackupBackupPlanRuleCopyActionsDetails]
    }
  }

  /** Provides details about an array of <code>BackupRule</code> objects, each of which specifies a scheduled task that is used to back up a selection of resources.
    */
  @js.native
  trait AwsBackupBackupPlanRuleDetails extends js.Object {
    var CompletionWindowMinutes: js.UndefOr[Double]
    var CopyActions: js.UndefOr[AwsBackupBackupPlanRuleCopyActionsList]
    var EnableContinuousBackup: js.UndefOr[Boolean]
    var Lifecycle: js.UndefOr[AwsBackupBackupPlanLifecycleDetails]
    var RuleId: js.UndefOr[NonEmptyString]
    var RuleName: js.UndefOr[NonEmptyString]
    var ScheduleExpression: js.UndefOr[NonEmptyString]
    var StartWindowMinutes: js.UndefOr[Double]
    var TargetBackupVault: js.UndefOr[NonEmptyString]
  }

  object AwsBackupBackupPlanRuleDetails {
    @inline
    def apply(
        CompletionWindowMinutes: js.UndefOr[Double] = js.undefined,
        CopyActions: js.UndefOr[AwsBackupBackupPlanRuleCopyActionsList] = js.undefined,
        EnableContinuousBackup: js.UndefOr[Boolean] = js.undefined,
        Lifecycle: js.UndefOr[AwsBackupBackupPlanLifecycleDetails] = js.undefined,
        RuleId: js.UndefOr[NonEmptyString] = js.undefined,
        RuleName: js.UndefOr[NonEmptyString] = js.undefined,
        ScheduleExpression: js.UndefOr[NonEmptyString] = js.undefined,
        StartWindowMinutes: js.UndefOr[Double] = js.undefined,
        TargetBackupVault: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsBackupBackupPlanRuleDetails = {
      val __obj = js.Dynamic.literal()
      CompletionWindowMinutes.foreach(__v => __obj.updateDynamic("CompletionWindowMinutes")(__v.asInstanceOf[js.Any]))
      CopyActions.foreach(__v => __obj.updateDynamic("CopyActions")(__v.asInstanceOf[js.Any]))
      EnableContinuousBackup.foreach(__v => __obj.updateDynamic("EnableContinuousBackup")(__v.asInstanceOf[js.Any]))
      Lifecycle.foreach(__v => __obj.updateDynamic("Lifecycle")(__v.asInstanceOf[js.Any]))
      RuleId.foreach(__v => __obj.updateDynamic("RuleId")(__v.asInstanceOf[js.Any]))
      RuleName.foreach(__v => __obj.updateDynamic("RuleName")(__v.asInstanceOf[js.Any]))
      ScheduleExpression.foreach(__v => __obj.updateDynamic("ScheduleExpression")(__v.asInstanceOf[js.Any]))
      StartWindowMinutes.foreach(__v => __obj.updateDynamic("StartWindowMinutes")(__v.asInstanceOf[js.Any]))
      TargetBackupVault.foreach(__v => __obj.updateDynamic("TargetBackupVault")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsBackupBackupPlanRuleDetails]
    }
  }

  /** Provides details about an Backup backup vault. In Backup, a backup vault is a container that stores and organizes your backups.
    */
  @js.native
  trait AwsBackupBackupVaultDetails extends js.Object {
    var AccessPolicy: js.UndefOr[NonEmptyString]
    var BackupVaultArn: js.UndefOr[NonEmptyString]
    var BackupVaultName: js.UndefOr[NonEmptyString]
    var EncryptionKeyArn: js.UndefOr[NonEmptyString]
    var Notifications: js.UndefOr[AwsBackupBackupVaultNotificationsDetails]
  }

  object AwsBackupBackupVaultDetails {
    @inline
    def apply(
        AccessPolicy: js.UndefOr[NonEmptyString] = js.undefined,
        BackupVaultArn: js.UndefOr[NonEmptyString] = js.undefined,
        BackupVaultName: js.UndefOr[NonEmptyString] = js.undefined,
        EncryptionKeyArn: js.UndefOr[NonEmptyString] = js.undefined,
        Notifications: js.UndefOr[AwsBackupBackupVaultNotificationsDetails] = js.undefined
    ): AwsBackupBackupVaultDetails = {
      val __obj = js.Dynamic.literal()
      AccessPolicy.foreach(__v => __obj.updateDynamic("AccessPolicy")(__v.asInstanceOf[js.Any]))
      BackupVaultArn.foreach(__v => __obj.updateDynamic("BackupVaultArn")(__v.asInstanceOf[js.Any]))
      BackupVaultName.foreach(__v => __obj.updateDynamic("BackupVaultName")(__v.asInstanceOf[js.Any]))
      EncryptionKeyArn.foreach(__v => __obj.updateDynamic("EncryptionKeyArn")(__v.asInstanceOf[js.Any]))
      Notifications.foreach(__v => __obj.updateDynamic("Notifications")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsBackupBackupVaultDetails]
    }
  }

  /** Provides details about the Amazon SNS event notifications for the specified backup vault.
    */
  @js.native
  trait AwsBackupBackupVaultNotificationsDetails extends js.Object {
    var BackupVaultEvents: js.UndefOr[NonEmptyStringList]
    var SnsTopicArn: js.UndefOr[NonEmptyString]
  }

  object AwsBackupBackupVaultNotificationsDetails {
    @inline
    def apply(
        BackupVaultEvents: js.UndefOr[NonEmptyStringList] = js.undefined,
        SnsTopicArn: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsBackupBackupVaultNotificationsDetails = {
      val __obj = js.Dynamic.literal()
      BackupVaultEvents.foreach(__v => __obj.updateDynamic("BackupVaultEvents")(__v.asInstanceOf[js.Any]))
      SnsTopicArn.foreach(__v => __obj.updateDynamic("SnsTopicArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsBackupBackupVaultNotificationsDetails]
    }
  }

  /** Specifies how long in days before a recovery point transitions to cold storage or is deleted.
    */
  @js.native
  trait AwsBackupRecoveryPointCalculatedLifecycleDetails extends js.Object {
    var DeleteAt: js.UndefOr[NonEmptyString]
    var MoveToColdStorageAt: js.UndefOr[NonEmptyString]
  }

  object AwsBackupRecoveryPointCalculatedLifecycleDetails {
    @inline
    def apply(
        DeleteAt: js.UndefOr[NonEmptyString] = js.undefined,
        MoveToColdStorageAt: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsBackupRecoveryPointCalculatedLifecycleDetails = {
      val __obj = js.Dynamic.literal()
      DeleteAt.foreach(__v => __obj.updateDynamic("DeleteAt")(__v.asInstanceOf[js.Any]))
      MoveToColdStorageAt.foreach(__v => __obj.updateDynamic("MoveToColdStorageAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsBackupRecoveryPointCalculatedLifecycleDetails]
    }
  }

  /** Contains information about the backup plan and rule that Backup used to initiate the recovery point backup.
    */
  @js.native
  trait AwsBackupRecoveryPointCreatedByDetails extends js.Object {
    var BackupPlanArn: js.UndefOr[NonEmptyString]
    var BackupPlanId: js.UndefOr[NonEmptyString]
    var BackupPlanVersion: js.UndefOr[NonEmptyString]
    var BackupRuleId: js.UndefOr[NonEmptyString]
  }

  object AwsBackupRecoveryPointCreatedByDetails {
    @inline
    def apply(
        BackupPlanArn: js.UndefOr[NonEmptyString] = js.undefined,
        BackupPlanId: js.UndefOr[NonEmptyString] = js.undefined,
        BackupPlanVersion: js.UndefOr[NonEmptyString] = js.undefined,
        BackupRuleId: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsBackupRecoveryPointCreatedByDetails = {
      val __obj = js.Dynamic.literal()
      BackupPlanArn.foreach(__v => __obj.updateDynamic("BackupPlanArn")(__v.asInstanceOf[js.Any]))
      BackupPlanId.foreach(__v => __obj.updateDynamic("BackupPlanId")(__v.asInstanceOf[js.Any]))
      BackupPlanVersion.foreach(__v => __obj.updateDynamic("BackupPlanVersion")(__v.asInstanceOf[js.Any]))
      BackupRuleId.foreach(__v => __obj.updateDynamic("BackupRuleId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsBackupRecoveryPointCreatedByDetails]
    }
  }

  /** Contains detailed information about the recovery points stored in an Backup backup vault. A backup, or recovery point, represents the content of a resource at a specified time.
    */
  @js.native
  trait AwsBackupRecoveryPointDetails extends js.Object {
    var BackupSizeInBytes: js.UndefOr[Double]
    var BackupVaultArn: js.UndefOr[NonEmptyString]
    var BackupVaultName: js.UndefOr[NonEmptyString]
    var CalculatedLifecycle: js.UndefOr[AwsBackupRecoveryPointCalculatedLifecycleDetails]
    var CompletionDate: js.UndefOr[NonEmptyString]
    var CreatedBy: js.UndefOr[AwsBackupRecoveryPointCreatedByDetails]
    var CreationDate: js.UndefOr[NonEmptyString]
    var EncryptionKeyArn: js.UndefOr[NonEmptyString]
    var IamRoleArn: js.UndefOr[NonEmptyString]
    var IsEncrypted: js.UndefOr[Boolean]
    var LastRestoreTime: js.UndefOr[NonEmptyString]
    var Lifecycle: js.UndefOr[AwsBackupRecoveryPointLifecycleDetails]
    var RecoveryPointArn: js.UndefOr[NonEmptyString]
    var ResourceArn: js.UndefOr[NonEmptyString]
    var ResourceType: js.UndefOr[NonEmptyString]
    var SourceBackupVaultArn: js.UndefOr[NonEmptyString]
    var Status: js.UndefOr[NonEmptyString]
    var StatusMessage: js.UndefOr[NonEmptyString]
    var StorageClass: js.UndefOr[NonEmptyString]
  }

  object AwsBackupRecoveryPointDetails {
    @inline
    def apply(
        BackupSizeInBytes: js.UndefOr[Double] = js.undefined,
        BackupVaultArn: js.UndefOr[NonEmptyString] = js.undefined,
        BackupVaultName: js.UndefOr[NonEmptyString] = js.undefined,
        CalculatedLifecycle: js.UndefOr[AwsBackupRecoveryPointCalculatedLifecycleDetails] = js.undefined,
        CompletionDate: js.UndefOr[NonEmptyString] = js.undefined,
        CreatedBy: js.UndefOr[AwsBackupRecoveryPointCreatedByDetails] = js.undefined,
        CreationDate: js.UndefOr[NonEmptyString] = js.undefined,
        EncryptionKeyArn: js.UndefOr[NonEmptyString] = js.undefined,
        IamRoleArn: js.UndefOr[NonEmptyString] = js.undefined,
        IsEncrypted: js.UndefOr[Boolean] = js.undefined,
        LastRestoreTime: js.UndefOr[NonEmptyString] = js.undefined,
        Lifecycle: js.UndefOr[AwsBackupRecoveryPointLifecycleDetails] = js.undefined,
        RecoveryPointArn: js.UndefOr[NonEmptyString] = js.undefined,
        ResourceArn: js.UndefOr[NonEmptyString] = js.undefined,
        ResourceType: js.UndefOr[NonEmptyString] = js.undefined,
        SourceBackupVaultArn: js.UndefOr[NonEmptyString] = js.undefined,
        Status: js.UndefOr[NonEmptyString] = js.undefined,
        StatusMessage: js.UndefOr[NonEmptyString] = js.undefined,
        StorageClass: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsBackupRecoveryPointDetails = {
      val __obj = js.Dynamic.literal()
      BackupSizeInBytes.foreach(__v => __obj.updateDynamic("BackupSizeInBytes")(__v.asInstanceOf[js.Any]))
      BackupVaultArn.foreach(__v => __obj.updateDynamic("BackupVaultArn")(__v.asInstanceOf[js.Any]))
      BackupVaultName.foreach(__v => __obj.updateDynamic("BackupVaultName")(__v.asInstanceOf[js.Any]))
      CalculatedLifecycle.foreach(__v => __obj.updateDynamic("CalculatedLifecycle")(__v.asInstanceOf[js.Any]))
      CompletionDate.foreach(__v => __obj.updateDynamic("CompletionDate")(__v.asInstanceOf[js.Any]))
      CreatedBy.foreach(__v => __obj.updateDynamic("CreatedBy")(__v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.updateDynamic("CreationDate")(__v.asInstanceOf[js.Any]))
      EncryptionKeyArn.foreach(__v => __obj.updateDynamic("EncryptionKeyArn")(__v.asInstanceOf[js.Any]))
      IamRoleArn.foreach(__v => __obj.updateDynamic("IamRoleArn")(__v.asInstanceOf[js.Any]))
      IsEncrypted.foreach(__v => __obj.updateDynamic("IsEncrypted")(__v.asInstanceOf[js.Any]))
      LastRestoreTime.foreach(__v => __obj.updateDynamic("LastRestoreTime")(__v.asInstanceOf[js.Any]))
      Lifecycle.foreach(__v => __obj.updateDynamic("Lifecycle")(__v.asInstanceOf[js.Any]))
      RecoveryPointArn.foreach(__v => __obj.updateDynamic("RecoveryPointArn")(__v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.updateDynamic("ResourceArn")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      SourceBackupVaultArn.foreach(__v => __obj.updateDynamic("SourceBackupVaultArn")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusMessage.foreach(__v => __obj.updateDynamic("StatusMessage")(__v.asInstanceOf[js.Any]))
      StorageClass.foreach(__v => __obj.updateDynamic("StorageClass")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsBackupRecoveryPointDetails]
    }
  }

  /** Contains an array of Transition objects specifying how long in days before a recovery point transitions to cold storage or is deleted.
    */
  @js.native
  trait AwsBackupRecoveryPointLifecycleDetails extends js.Object {
    var DeleteAfterDays: js.UndefOr[Double]
    var MoveToColdStorageAfterDays: js.UndefOr[Double]
  }

  object AwsBackupRecoveryPointLifecycleDetails {
    @inline
    def apply(
        DeleteAfterDays: js.UndefOr[Double] = js.undefined,
        MoveToColdStorageAfterDays: js.UndefOr[Double] = js.undefined
    ): AwsBackupRecoveryPointLifecycleDetails = {
      val __obj = js.Dynamic.literal()
      DeleteAfterDays.foreach(__v => __obj.updateDynamic("DeleteAfterDays")(__v.asInstanceOf[js.Any]))
      MoveToColdStorageAfterDays.foreach(__v => __obj.updateDynamic("MoveToColdStorageAfterDays")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsBackupRecoveryPointLifecycleDetails]
    }
  }

  /** Provides details about an Certificate Manager certificate.
    */
  @js.native
  trait AwsCertificateManagerCertificateDetails extends js.Object {
    var CertificateAuthorityArn: js.UndefOr[NonEmptyString]
    var CreatedAt: js.UndefOr[NonEmptyString]
    var DomainName: js.UndefOr[NonEmptyString]
    var DomainValidationOptions: js.UndefOr[AwsCertificateManagerCertificateDomainValidationOptions]
    var ExtendedKeyUsages: js.UndefOr[AwsCertificateManagerCertificateExtendedKeyUsages]
    var FailureReason: js.UndefOr[NonEmptyString]
    var ImportedAt: js.UndefOr[NonEmptyString]
    var InUseBy: js.UndefOr[StringList]
    var IssuedAt: js.UndefOr[NonEmptyString]
    var Issuer: js.UndefOr[NonEmptyString]
    var KeyAlgorithm: js.UndefOr[NonEmptyString]
    var KeyUsages: js.UndefOr[AwsCertificateManagerCertificateKeyUsages]
    var NotAfter: js.UndefOr[NonEmptyString]
    var NotBefore: js.UndefOr[NonEmptyString]
    var Options: js.UndefOr[AwsCertificateManagerCertificateOptions]
    var RenewalEligibility: js.UndefOr[NonEmptyString]
    var RenewalSummary: js.UndefOr[AwsCertificateManagerCertificateRenewalSummary]
    var Serial: js.UndefOr[NonEmptyString]
    var SignatureAlgorithm: js.UndefOr[NonEmptyString]
    var Status: js.UndefOr[NonEmptyString]
    var Subject: js.UndefOr[NonEmptyString]
    var SubjectAlternativeNames: js.UndefOr[StringList]
    var Type: js.UndefOr[NonEmptyString]
  }

  object AwsCertificateManagerCertificateDetails {
    @inline
    def apply(
        CertificateAuthorityArn: js.UndefOr[NonEmptyString] = js.undefined,
        CreatedAt: js.UndefOr[NonEmptyString] = js.undefined,
        DomainName: js.UndefOr[NonEmptyString] = js.undefined,
        DomainValidationOptions: js.UndefOr[AwsCertificateManagerCertificateDomainValidationOptions] = js.undefined,
        ExtendedKeyUsages: js.UndefOr[AwsCertificateManagerCertificateExtendedKeyUsages] = js.undefined,
        FailureReason: js.UndefOr[NonEmptyString] = js.undefined,
        ImportedAt: js.UndefOr[NonEmptyString] = js.undefined,
        InUseBy: js.UndefOr[StringList] = js.undefined,
        IssuedAt: js.UndefOr[NonEmptyString] = js.undefined,
        Issuer: js.UndefOr[NonEmptyString] = js.undefined,
        KeyAlgorithm: js.UndefOr[NonEmptyString] = js.undefined,
        KeyUsages: js.UndefOr[AwsCertificateManagerCertificateKeyUsages] = js.undefined,
        NotAfter: js.UndefOr[NonEmptyString] = js.undefined,
        NotBefore: js.UndefOr[NonEmptyString] = js.undefined,
        Options: js.UndefOr[AwsCertificateManagerCertificateOptions] = js.undefined,
        RenewalEligibility: js.UndefOr[NonEmptyString] = js.undefined,
        RenewalSummary: js.UndefOr[AwsCertificateManagerCertificateRenewalSummary] = js.undefined,
        Serial: js.UndefOr[NonEmptyString] = js.undefined,
        SignatureAlgorithm: js.UndefOr[NonEmptyString] = js.undefined,
        Status: js.UndefOr[NonEmptyString] = js.undefined,
        Subject: js.UndefOr[NonEmptyString] = js.undefined,
        SubjectAlternativeNames: js.UndefOr[StringList] = js.undefined,
        Type: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsCertificateManagerCertificateDetails = {
      val __obj = js.Dynamic.literal()
      CertificateAuthorityArn.foreach(__v => __obj.updateDynamic("CertificateAuthorityArn")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      DomainName.foreach(__v => __obj.updateDynamic("DomainName")(__v.asInstanceOf[js.Any]))
      DomainValidationOptions.foreach(__v => __obj.updateDynamic("DomainValidationOptions")(__v.asInstanceOf[js.Any]))
      ExtendedKeyUsages.foreach(__v => __obj.updateDynamic("ExtendedKeyUsages")(__v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      ImportedAt.foreach(__v => __obj.updateDynamic("ImportedAt")(__v.asInstanceOf[js.Any]))
      InUseBy.foreach(__v => __obj.updateDynamic("InUseBy")(__v.asInstanceOf[js.Any]))
      IssuedAt.foreach(__v => __obj.updateDynamic("IssuedAt")(__v.asInstanceOf[js.Any]))
      Issuer.foreach(__v => __obj.updateDynamic("Issuer")(__v.asInstanceOf[js.Any]))
      KeyAlgorithm.foreach(__v => __obj.updateDynamic("KeyAlgorithm")(__v.asInstanceOf[js.Any]))
      KeyUsages.foreach(__v => __obj.updateDynamic("KeyUsages")(__v.asInstanceOf[js.Any]))
      NotAfter.foreach(__v => __obj.updateDynamic("NotAfter")(__v.asInstanceOf[js.Any]))
      NotBefore.foreach(__v => __obj.updateDynamic("NotBefore")(__v.asInstanceOf[js.Any]))
      Options.foreach(__v => __obj.updateDynamic("Options")(__v.asInstanceOf[js.Any]))
      RenewalEligibility.foreach(__v => __obj.updateDynamic("RenewalEligibility")(__v.asInstanceOf[js.Any]))
      RenewalSummary.foreach(__v => __obj.updateDynamic("RenewalSummary")(__v.asInstanceOf[js.Any]))
      Serial.foreach(__v => __obj.updateDynamic("Serial")(__v.asInstanceOf[js.Any]))
      SignatureAlgorithm.foreach(__v => __obj.updateDynamic("SignatureAlgorithm")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Subject.foreach(__v => __obj.updateDynamic("Subject")(__v.asInstanceOf[js.Any]))
      SubjectAlternativeNames.foreach(__v => __obj.updateDynamic("SubjectAlternativeNames")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsCertificateManagerCertificateDetails]
    }
  }

  /** Contains information about one of the following: * The initial validation of each domain name that occurs as a result of the <code>RequestCertificate</code> request * The validation of each domain name in the certificate, as it pertains to Certificate Manager managed renewal
    */
  @js.native
  trait AwsCertificateManagerCertificateDomainValidationOption extends js.Object {
    var DomainName: js.UndefOr[NonEmptyString]
    var ResourceRecord: js.UndefOr[AwsCertificateManagerCertificateResourceRecord]
    var ValidationDomain: js.UndefOr[NonEmptyString]
    var ValidationEmails: js.UndefOr[StringList]
    var ValidationMethod: js.UndefOr[NonEmptyString]
    var ValidationStatus: js.UndefOr[NonEmptyString]
  }

  object AwsCertificateManagerCertificateDomainValidationOption {
    @inline
    def apply(
        DomainName: js.UndefOr[NonEmptyString] = js.undefined,
        ResourceRecord: js.UndefOr[AwsCertificateManagerCertificateResourceRecord] = js.undefined,
        ValidationDomain: js.UndefOr[NonEmptyString] = js.undefined,
        ValidationEmails: js.UndefOr[StringList] = js.undefined,
        ValidationMethod: js.UndefOr[NonEmptyString] = js.undefined,
        ValidationStatus: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsCertificateManagerCertificateDomainValidationOption = {
      val __obj = js.Dynamic.literal()
      DomainName.foreach(__v => __obj.updateDynamic("DomainName")(__v.asInstanceOf[js.Any]))
      ResourceRecord.foreach(__v => __obj.updateDynamic("ResourceRecord")(__v.asInstanceOf[js.Any]))
      ValidationDomain.foreach(__v => __obj.updateDynamic("ValidationDomain")(__v.asInstanceOf[js.Any]))
      ValidationEmails.foreach(__v => __obj.updateDynamic("ValidationEmails")(__v.asInstanceOf[js.Any]))
      ValidationMethod.foreach(__v => __obj.updateDynamic("ValidationMethod")(__v.asInstanceOf[js.Any]))
      ValidationStatus.foreach(__v => __obj.updateDynamic("ValidationStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsCertificateManagerCertificateDomainValidationOption]
    }
  }

  /** Contains information about an extended key usage X.509 v3 extension object.
    */
  @js.native
  trait AwsCertificateManagerCertificateExtendedKeyUsage extends js.Object {
    var Name: js.UndefOr[NonEmptyString]
    var OId: js.UndefOr[NonEmptyString]
  }

  object AwsCertificateManagerCertificateExtendedKeyUsage {
    @inline
    def apply(
        Name: js.UndefOr[NonEmptyString] = js.undefined,
        OId: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsCertificateManagerCertificateExtendedKeyUsage = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      OId.foreach(__v => __obj.updateDynamic("OId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsCertificateManagerCertificateExtendedKeyUsage]
    }
  }

  /** Contains information about a key usage X.509 v3 extension object.
    */
  @js.native
  trait AwsCertificateManagerCertificateKeyUsage extends js.Object {
    var Name: js.UndefOr[NonEmptyString]
  }

  object AwsCertificateManagerCertificateKeyUsage {
    @inline
    def apply(
        Name: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsCertificateManagerCertificateKeyUsage = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsCertificateManagerCertificateKeyUsage]
    }
  }

  /** Contains other options for the certificate.
    */
  @js.native
  trait AwsCertificateManagerCertificateOptions extends js.Object {
    var CertificateTransparencyLoggingPreference: js.UndefOr[NonEmptyString]
  }

  object AwsCertificateManagerCertificateOptions {
    @inline
    def apply(
        CertificateTransparencyLoggingPreference: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsCertificateManagerCertificateOptions = {
      val __obj = js.Dynamic.literal()
      CertificateTransparencyLoggingPreference.foreach(__v => __obj.updateDynamic("CertificateTransparencyLoggingPreference")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsCertificateManagerCertificateOptions]
    }
  }

  /** Contains information about the Certificate Manager managed renewal for an <code>AMAZON_ISSUED</code> certificate.
    */
  @js.native
  trait AwsCertificateManagerCertificateRenewalSummary extends js.Object {
    var DomainValidationOptions: js.UndefOr[AwsCertificateManagerCertificateDomainValidationOptions]
    var RenewalStatus: js.UndefOr[NonEmptyString]
    var RenewalStatusReason: js.UndefOr[NonEmptyString]
    var UpdatedAt: js.UndefOr[NonEmptyString]
  }

  object AwsCertificateManagerCertificateRenewalSummary {
    @inline
    def apply(
        DomainValidationOptions: js.UndefOr[AwsCertificateManagerCertificateDomainValidationOptions] = js.undefined,
        RenewalStatus: js.UndefOr[NonEmptyString] = js.undefined,
        RenewalStatusReason: js.UndefOr[NonEmptyString] = js.undefined,
        UpdatedAt: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsCertificateManagerCertificateRenewalSummary = {
      val __obj = js.Dynamic.literal()
      DomainValidationOptions.foreach(__v => __obj.updateDynamic("DomainValidationOptions")(__v.asInstanceOf[js.Any]))
      RenewalStatus.foreach(__v => __obj.updateDynamic("RenewalStatus")(__v.asInstanceOf[js.Any]))
      RenewalStatusReason.foreach(__v => __obj.updateDynamic("RenewalStatusReason")(__v.asInstanceOf[js.Any]))
      UpdatedAt.foreach(__v => __obj.updateDynamic("UpdatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsCertificateManagerCertificateRenewalSummary]
    }
  }

  /** Provides details about the CNAME record that is added to the DNS database for domain validation.
    */
  @js.native
  trait AwsCertificateManagerCertificateResourceRecord extends js.Object {
    var Name: js.UndefOr[NonEmptyString]
    var Type: js.UndefOr[NonEmptyString]
    var Value: js.UndefOr[NonEmptyString]
  }

  object AwsCertificateManagerCertificateResourceRecord {
    @inline
    def apply(
        Name: js.UndefOr[NonEmptyString] = js.undefined,
        Type: js.UndefOr[NonEmptyString] = js.undefined,
        Value: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsCertificateManagerCertificateResourceRecord = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsCertificateManagerCertificateResourceRecord]
    }
  }

  /** Nests a stack as a resource in a top-level template. Nested stacks are stacks created as resources for another stack.
    */
  @js.native
  trait AwsCloudFormationStackDetails extends js.Object {
    var Capabilities: js.UndefOr[NonEmptyStringList]
    var CreationTime: js.UndefOr[NonEmptyString]
    var Description: js.UndefOr[NonEmptyString]
    var DisableRollback: js.UndefOr[Boolean]
    var DriftInformation: js.UndefOr[AwsCloudFormationStackDriftInformationDetails]
    var EnableTerminationProtection: js.UndefOr[Boolean]
    var LastUpdatedTime: js.UndefOr[NonEmptyString]
    var NotificationArns: js.UndefOr[NonEmptyStringList]
    var Outputs: js.UndefOr[AwsCloudFormationStackOutputsList]
    var RoleArn: js.UndefOr[NonEmptyString]
    var StackId: js.UndefOr[NonEmptyString]
    var StackName: js.UndefOr[NonEmptyString]
    var StackStatus: js.UndefOr[NonEmptyString]
    var StackStatusReason: js.UndefOr[NonEmptyString]
    var TimeoutInMinutes: js.UndefOr[Int]
  }

  object AwsCloudFormationStackDetails {
    @inline
    def apply(
        Capabilities: js.UndefOr[NonEmptyStringList] = js.undefined,
        CreationTime: js.UndefOr[NonEmptyString] = js.undefined,
        Description: js.UndefOr[NonEmptyString] = js.undefined,
        DisableRollback: js.UndefOr[Boolean] = js.undefined,
        DriftInformation: js.UndefOr[AwsCloudFormationStackDriftInformationDetails] = js.undefined,
        EnableTerminationProtection: js.UndefOr[Boolean] = js.undefined,
        LastUpdatedTime: js.UndefOr[NonEmptyString] = js.undefined,
        NotificationArns: js.UndefOr[NonEmptyStringList] = js.undefined,
        Outputs: js.UndefOr[AwsCloudFormationStackOutputsList] = js.undefined,
        RoleArn: js.UndefOr[NonEmptyString] = js.undefined,
        StackId: js.UndefOr[NonEmptyString] = js.undefined,
        StackName: js.UndefOr[NonEmptyString] = js.undefined,
        StackStatus: js.UndefOr[NonEmptyString] = js.undefined,
        StackStatusReason: js.UndefOr[NonEmptyString] = js.undefined,
        TimeoutInMinutes: js.UndefOr[Int] = js.undefined
    ): AwsCloudFormationStackDetails = {
      val __obj = js.Dynamic.literal()
      Capabilities.foreach(__v => __obj.updateDynamic("Capabilities")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DisableRollback.foreach(__v => __obj.updateDynamic("DisableRollback")(__v.asInstanceOf[js.Any]))
      DriftInformation.foreach(__v => __obj.updateDynamic("DriftInformation")(__v.asInstanceOf[js.Any]))
      EnableTerminationProtection.foreach(__v => __obj.updateDynamic("EnableTerminationProtection")(__v.asInstanceOf[js.Any]))
      LastUpdatedTime.foreach(__v => __obj.updateDynamic("LastUpdatedTime")(__v.asInstanceOf[js.Any]))
      NotificationArns.foreach(__v => __obj.updateDynamic("NotificationArns")(__v.asInstanceOf[js.Any]))
      Outputs.foreach(__v => __obj.updateDynamic("Outputs")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      StackId.foreach(__v => __obj.updateDynamic("StackId")(__v.asInstanceOf[js.Any]))
      StackName.foreach(__v => __obj.updateDynamic("StackName")(__v.asInstanceOf[js.Any]))
      StackStatus.foreach(__v => __obj.updateDynamic("StackStatus")(__v.asInstanceOf[js.Any]))
      StackStatusReason.foreach(__v => __obj.updateDynamic("StackStatusReason")(__v.asInstanceOf[js.Any]))
      TimeoutInMinutes.foreach(__v => __obj.updateDynamic("TimeoutInMinutes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsCloudFormationStackDetails]
    }
  }

  /** Provides information about the stack's conformity to its expected template configuration.
    */
  @js.native
  trait AwsCloudFormationStackDriftInformationDetails extends js.Object {
    var StackDriftStatus: js.UndefOr[NonEmptyString]
  }

  object AwsCloudFormationStackDriftInformationDetails {
    @inline
    def apply(
        StackDriftStatus: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsCloudFormationStackDriftInformationDetails = {
      val __obj = js.Dynamic.literal()
      StackDriftStatus.foreach(__v => __obj.updateDynamic("StackDriftStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsCloudFormationStackDriftInformationDetails]
    }
  }

  /** Provides information about the CloudFormation stack output.
    */
  @js.native
  trait AwsCloudFormationStackOutputsDetails extends js.Object {
    var Description: js.UndefOr[NonEmptyString]
    var OutputKey: js.UndefOr[NonEmptyString]
    var OutputValue: js.UndefOr[NonEmptyString]
  }

  object AwsCloudFormationStackOutputsDetails {
    @inline
    def apply(
        Description: js.UndefOr[NonEmptyString] = js.undefined,
        OutputKey: js.UndefOr[NonEmptyString] = js.undefined,
        OutputValue: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsCloudFormationStackOutputsDetails = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      OutputKey.foreach(__v => __obj.updateDynamic("OutputKey")(__v.asInstanceOf[js.Any]))
      OutputValue.foreach(__v => __obj.updateDynamic("OutputValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsCloudFormationStackOutputsDetails]
    }
  }

  /** Information about a cache behavior for the distribution.
    */
  @js.native
  trait AwsCloudFrontDistributionCacheBehavior extends js.Object {
    var ViewerProtocolPolicy: js.UndefOr[NonEmptyString]
  }

  object AwsCloudFrontDistributionCacheBehavior {
    @inline
    def apply(
        ViewerProtocolPolicy: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsCloudFrontDistributionCacheBehavior = {
      val __obj = js.Dynamic.literal()
      ViewerProtocolPolicy.foreach(__v => __obj.updateDynamic("ViewerProtocolPolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsCloudFrontDistributionCacheBehavior]
    }
  }

  /** Provides information about caching for the CloudFront distribution.
    */
  @js.native
  trait AwsCloudFrontDistributionCacheBehaviors extends js.Object {
    var Items: js.UndefOr[AwsCloudFrontDistributionCacheBehaviorsItemList]
  }

  object AwsCloudFrontDistributionCacheBehaviors {
    @inline
    def apply(
        Items: js.UndefOr[AwsCloudFrontDistributionCacheBehaviorsItemList] = js.undefined
    ): AwsCloudFrontDistributionCacheBehaviors = {
      val __obj = js.Dynamic.literal()
      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsCloudFrontDistributionCacheBehaviors]
    }
  }

  /** Contains information about the default cache configuration for the CloudFront distribution.
    */
  @js.native
  trait AwsCloudFrontDistributionDefaultCacheBehavior extends js.Object {
    var ViewerProtocolPolicy: js.UndefOr[NonEmptyString]
  }

  object AwsCloudFrontDistributionDefaultCacheBehavior {
    @inline
    def apply(
        ViewerProtocolPolicy: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsCloudFrontDistributionDefaultCacheBehavior = {
      val __obj = js.Dynamic.literal()
      ViewerProtocolPolicy.foreach(__v => __obj.updateDynamic("ViewerProtocolPolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsCloudFrontDistributionDefaultCacheBehavior]
    }
  }

  /** A CloudFront distribution configuration.
    */
  @js.native
  trait AwsCloudFrontDistributionDetails extends js.Object {
    var CacheBehaviors: js.UndefOr[AwsCloudFrontDistributionCacheBehaviors]
    var DefaultCacheBehavior: js.UndefOr[AwsCloudFrontDistributionDefaultCacheBehavior]
    var DefaultRootObject: js.UndefOr[NonEmptyString]
    var DomainName: js.UndefOr[NonEmptyString]
    var ETag: js.UndefOr[NonEmptyString]
    var LastModifiedTime: js.UndefOr[NonEmptyString]
    var Logging: js.UndefOr[AwsCloudFrontDistributionLogging]
    var OriginGroups: js.UndefOr[AwsCloudFrontDistributionOriginGroups]
    var Origins: js.UndefOr[AwsCloudFrontDistributionOrigins]
    var Status: js.UndefOr[NonEmptyString]
    var ViewerCertificate: js.UndefOr[AwsCloudFrontDistributionViewerCertificate]
    var WebAclId: js.UndefOr[NonEmptyString]
  }

  object AwsCloudFrontDistributionDetails {
    @inline
    def apply(
        CacheBehaviors: js.UndefOr[AwsCloudFrontDistributionCacheBehaviors] = js.undefined,
        DefaultCacheBehavior: js.UndefOr[AwsCloudFrontDistributionDefaultCacheBehavior] = js.undefined,
        DefaultRootObject: js.UndefOr[NonEmptyString] = js.undefined,
        DomainName: js.UndefOr[NonEmptyString] = js.undefined,
        ETag: js.UndefOr[NonEmptyString] = js.undefined,
        LastModifiedTime: js.UndefOr[NonEmptyString] = js.undefined,
        Logging: js.UndefOr[AwsCloudFrontDistributionLogging] = js.undefined,
        OriginGroups: js.UndefOr[AwsCloudFrontDistributionOriginGroups] = js.undefined,
        Origins: js.UndefOr[AwsCloudFrontDistributionOrigins] = js.undefined,
        Status: js.UndefOr[NonEmptyString] = js.undefined,
        ViewerCertificate: js.UndefOr[AwsCloudFrontDistributionViewerCertificate] = js.undefined,
        WebAclId: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsCloudFrontDistributionDetails = {
      val __obj = js.Dynamic.literal()
      CacheBehaviors.foreach(__v => __obj.updateDynamic("CacheBehaviors")(__v.asInstanceOf[js.Any]))
      DefaultCacheBehavior.foreach(__v => __obj.updateDynamic("DefaultCacheBehavior")(__v.asInstanceOf[js.Any]))
      DefaultRootObject.foreach(__v => __obj.updateDynamic("DefaultRootObject")(__v.asInstanceOf[js.Any]))
      DomainName.foreach(__v => __obj.updateDynamic("DomainName")(__v.asInstanceOf[js.Any]))
      ETag.foreach(__v => __obj.updateDynamic("ETag")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      Logging.foreach(__v => __obj.updateDynamic("Logging")(__v.asInstanceOf[js.Any]))
      OriginGroups.foreach(__v => __obj.updateDynamic("OriginGroups")(__v.asInstanceOf[js.Any]))
      Origins.foreach(__v => __obj.updateDynamic("Origins")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      ViewerCertificate.foreach(__v => __obj.updateDynamic("ViewerCertificate")(__v.asInstanceOf[js.Any]))
      WebAclId.foreach(__v => __obj.updateDynamic("WebAclId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsCloudFrontDistributionDetails]
    }
  }

  /** A complex type that controls whether access logs are written for the CloudFront distribution.
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

  /** A custom origin. A custom origin is any origin that is not an Amazon S3 bucket, with one exception. An Amazon S3 bucket that is [[https://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html|configured with static website hosting]] is a custom origin.
    */
  @js.native
  trait AwsCloudFrontDistributionOriginCustomOriginConfig extends js.Object {
    var HttpPort: js.UndefOr[Int]
    var HttpsPort: js.UndefOr[Int]
    var OriginKeepaliveTimeout: js.UndefOr[Int]
    var OriginProtocolPolicy: js.UndefOr[NonEmptyString]
    var OriginReadTimeout: js.UndefOr[Int]
    var OriginSslProtocols: js.UndefOr[AwsCloudFrontDistributionOriginSslProtocols]
  }

  object AwsCloudFrontDistributionOriginCustomOriginConfig {
    @inline
    def apply(
        HttpPort: js.UndefOr[Int] = js.undefined,
        HttpsPort: js.UndefOr[Int] = js.undefined,
        OriginKeepaliveTimeout: js.UndefOr[Int] = js.undefined,
        OriginProtocolPolicy: js.UndefOr[NonEmptyString] = js.undefined,
        OriginReadTimeout: js.UndefOr[Int] = js.undefined,
        OriginSslProtocols: js.UndefOr[AwsCloudFrontDistributionOriginSslProtocols] = js.undefined
    ): AwsCloudFrontDistributionOriginCustomOriginConfig = {
      val __obj = js.Dynamic.literal()
      HttpPort.foreach(__v => __obj.updateDynamic("HttpPort")(__v.asInstanceOf[js.Any]))
      HttpsPort.foreach(__v => __obj.updateDynamic("HttpsPort")(__v.asInstanceOf[js.Any]))
      OriginKeepaliveTimeout.foreach(__v => __obj.updateDynamic("OriginKeepaliveTimeout")(__v.asInstanceOf[js.Any]))
      OriginProtocolPolicy.foreach(__v => __obj.updateDynamic("OriginProtocolPolicy")(__v.asInstanceOf[js.Any]))
      OriginReadTimeout.foreach(__v => __obj.updateDynamic("OriginReadTimeout")(__v.asInstanceOf[js.Any]))
      OriginSslProtocols.foreach(__v => __obj.updateDynamic("OriginSslProtocols")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsCloudFrontDistributionOriginCustomOriginConfig]
    }
  }

  /** Information about an origin group for the CloudFront distribution.
    */
  @js.native
  trait AwsCloudFrontDistributionOriginGroup extends js.Object {
    var FailoverCriteria: js.UndefOr[AwsCloudFrontDistributionOriginGroupFailover]
  }

  object AwsCloudFrontDistributionOriginGroup {
    @inline
    def apply(
        FailoverCriteria: js.UndefOr[AwsCloudFrontDistributionOriginGroupFailover] = js.undefined
    ): AwsCloudFrontDistributionOriginGroup = {
      val __obj = js.Dynamic.literal()
      FailoverCriteria.foreach(__v => __obj.updateDynamic("FailoverCriteria")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsCloudFrontDistributionOriginGroup]
    }
  }

  /** Provides information about when an origin group fails over.
    */
  @js.native
  trait AwsCloudFrontDistributionOriginGroupFailover extends js.Object {
    var StatusCodes: js.UndefOr[AwsCloudFrontDistributionOriginGroupFailoverStatusCodes]
  }

  object AwsCloudFrontDistributionOriginGroupFailover {
    @inline
    def apply(
        StatusCodes: js.UndefOr[AwsCloudFrontDistributionOriginGroupFailoverStatusCodes] = js.undefined
    ): AwsCloudFrontDistributionOriginGroupFailover = {
      val __obj = js.Dynamic.literal()
      StatusCodes.foreach(__v => __obj.updateDynamic("StatusCodes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsCloudFrontDistributionOriginGroupFailover]
    }
  }

  /** The status codes that cause an origin group to fail over.
    */
  @js.native
  trait AwsCloudFrontDistributionOriginGroupFailoverStatusCodes extends js.Object {
    var Items: js.UndefOr[AwsCloudFrontDistributionOriginGroupFailoverStatusCodesItemList]
    var Quantity: js.UndefOr[Int]
  }

  object AwsCloudFrontDistributionOriginGroupFailoverStatusCodes {
    @inline
    def apply(
        Items: js.UndefOr[AwsCloudFrontDistributionOriginGroupFailoverStatusCodesItemList] = js.undefined,
        Quantity: js.UndefOr[Int] = js.undefined
    ): AwsCloudFrontDistributionOriginGroupFailoverStatusCodes = {
      val __obj = js.Dynamic.literal()
      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
      Quantity.foreach(__v => __obj.updateDynamic("Quantity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsCloudFrontDistributionOriginGroupFailoverStatusCodes]
    }
  }

  /** Provides information about origin groups that are associated with the CloudFront distribution.
    */
  @js.native
  trait AwsCloudFrontDistributionOriginGroups extends js.Object {
    var Items: js.UndefOr[AwsCloudFrontDistributionOriginGroupsItemList]
  }

  object AwsCloudFrontDistributionOriginGroups {
    @inline
    def apply(
        Items: js.UndefOr[AwsCloudFrontDistributionOriginGroupsItemList] = js.undefined
    ): AwsCloudFrontDistributionOriginGroups = {
      val __obj = js.Dynamic.literal()
      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsCloudFrontDistributionOriginGroups]
    }
  }

  /** A complex type that describes the Amazon S3 bucket, HTTP server (for example, a web server), AWS Elemental MediaStore, or other server from which CloudFront gets your files.
    */
  @js.native
  trait AwsCloudFrontDistributionOriginItem extends js.Object {
    var CustomOriginConfig: js.UndefOr[AwsCloudFrontDistributionOriginCustomOriginConfig]
    var DomainName: js.UndefOr[NonEmptyString]
    var Id: js.UndefOr[NonEmptyString]
    var OriginPath: js.UndefOr[NonEmptyString]
    var S3OriginConfig: js.UndefOr[AwsCloudFrontDistributionOriginS3OriginConfig]
  }

  object AwsCloudFrontDistributionOriginItem {
    @inline
    def apply(
        CustomOriginConfig: js.UndefOr[AwsCloudFrontDistributionOriginCustomOriginConfig] = js.undefined,
        DomainName: js.UndefOr[NonEmptyString] = js.undefined,
        Id: js.UndefOr[NonEmptyString] = js.undefined,
        OriginPath: js.UndefOr[NonEmptyString] = js.undefined,
        S3OriginConfig: js.UndefOr[AwsCloudFrontDistributionOriginS3OriginConfig] = js.undefined
    ): AwsCloudFrontDistributionOriginItem = {
      val __obj = js.Dynamic.literal()
      CustomOriginConfig.foreach(__v => __obj.updateDynamic("CustomOriginConfig")(__v.asInstanceOf[js.Any]))
      DomainName.foreach(__v => __obj.updateDynamic("DomainName")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      OriginPath.foreach(__v => __obj.updateDynamic("OriginPath")(__v.asInstanceOf[js.Any]))
      S3OriginConfig.foreach(__v => __obj.updateDynamic("S3OriginConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsCloudFrontDistributionOriginItem]
    }
  }

  /** Information about an origin that is an Amazon S3 bucket that is not configured with static website hosting.
    */
  @js.native
  trait AwsCloudFrontDistributionOriginS3OriginConfig extends js.Object {
    var OriginAccessIdentity: js.UndefOr[NonEmptyString]
  }

  object AwsCloudFrontDistributionOriginS3OriginConfig {
    @inline
    def apply(
        OriginAccessIdentity: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsCloudFrontDistributionOriginS3OriginConfig = {
      val __obj = js.Dynamic.literal()
      OriginAccessIdentity.foreach(__v => __obj.updateDynamic("OriginAccessIdentity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsCloudFrontDistributionOriginS3OriginConfig]
    }
  }

  /** A complex type that contains information about the SSL/TLS protocols that CloudFront can use when establishing an HTTPS connection with your origin.
    */
  @js.native
  trait AwsCloudFrontDistributionOriginSslProtocols extends js.Object {
    var Items: js.UndefOr[NonEmptyStringList]
    var Quantity: js.UndefOr[Int]
  }

  object AwsCloudFrontDistributionOriginSslProtocols {
    @inline
    def apply(
        Items: js.UndefOr[NonEmptyStringList] = js.undefined,
        Quantity: js.UndefOr[Int] = js.undefined
    ): AwsCloudFrontDistributionOriginSslProtocols = {
      val __obj = js.Dynamic.literal()
      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
      Quantity.foreach(__v => __obj.updateDynamic("Quantity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsCloudFrontDistributionOriginSslProtocols]
    }
  }

  /** A complex type that contains information about origins and origin groups for this CloudFront distribution.
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

  /** Provides information about the TLS/SSL configuration that the CloudFront distribution uses to communicate with viewers.
    */
  @js.native
  trait AwsCloudFrontDistributionViewerCertificate extends js.Object {
    var AcmCertificateArn: js.UndefOr[NonEmptyString]
    var Certificate: js.UndefOr[NonEmptyString]
    var CertificateSource: js.UndefOr[NonEmptyString]
    var CloudFrontDefaultCertificate: js.UndefOr[Boolean]
    var IamCertificateId: js.UndefOr[NonEmptyString]
    var MinimumProtocolVersion: js.UndefOr[NonEmptyString]
    var SslSupportMethod: js.UndefOr[NonEmptyString]
  }

  object AwsCloudFrontDistributionViewerCertificate {
    @inline
    def apply(
        AcmCertificateArn: js.UndefOr[NonEmptyString] = js.undefined,
        Certificate: js.UndefOr[NonEmptyString] = js.undefined,
        CertificateSource: js.UndefOr[NonEmptyString] = js.undefined,
        CloudFrontDefaultCertificate: js.UndefOr[Boolean] = js.undefined,
        IamCertificateId: js.UndefOr[NonEmptyString] = js.undefined,
        MinimumProtocolVersion: js.UndefOr[NonEmptyString] = js.undefined,
        SslSupportMethod: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsCloudFrontDistributionViewerCertificate = {
      val __obj = js.Dynamic.literal()
      AcmCertificateArn.foreach(__v => __obj.updateDynamic("AcmCertificateArn")(__v.asInstanceOf[js.Any]))
      Certificate.foreach(__v => __obj.updateDynamic("Certificate")(__v.asInstanceOf[js.Any]))
      CertificateSource.foreach(__v => __obj.updateDynamic("CertificateSource")(__v.asInstanceOf[js.Any]))
      CloudFrontDefaultCertificate.foreach(__v => __obj.updateDynamic("CloudFrontDefaultCertificate")(__v.asInstanceOf[js.Any]))
      IamCertificateId.foreach(__v => __obj.updateDynamic("IamCertificateId")(__v.asInstanceOf[js.Any]))
      MinimumProtocolVersion.foreach(__v => __obj.updateDynamic("MinimumProtocolVersion")(__v.asInstanceOf[js.Any]))
      SslSupportMethod.foreach(__v => __obj.updateDynamic("SslSupportMethod")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsCloudFrontDistributionViewerCertificate]
    }
  }

  /** Provides details about a CloudTrail trail.
    */
  @js.native
  trait AwsCloudTrailTrailDetails extends js.Object {
    var CloudWatchLogsLogGroupArn: js.UndefOr[NonEmptyString]
    var CloudWatchLogsRoleArn: js.UndefOr[NonEmptyString]
    var HasCustomEventSelectors: js.UndefOr[Boolean]
    var HomeRegion: js.UndefOr[NonEmptyString]
    var IncludeGlobalServiceEvents: js.UndefOr[Boolean]
    var IsMultiRegionTrail: js.UndefOr[Boolean]
    var IsOrganizationTrail: js.UndefOr[Boolean]
    var KmsKeyId: js.UndefOr[NonEmptyString]
    var LogFileValidationEnabled: js.UndefOr[Boolean]
    var Name: js.UndefOr[NonEmptyString]
    var S3BucketName: js.UndefOr[NonEmptyString]
    var S3KeyPrefix: js.UndefOr[NonEmptyString]
    var SnsTopicArn: js.UndefOr[NonEmptyString]
    var SnsTopicName: js.UndefOr[NonEmptyString]
    var TrailArn: js.UndefOr[NonEmptyString]
  }

  object AwsCloudTrailTrailDetails {
    @inline
    def apply(
        CloudWatchLogsLogGroupArn: js.UndefOr[NonEmptyString] = js.undefined,
        CloudWatchLogsRoleArn: js.UndefOr[NonEmptyString] = js.undefined,
        HasCustomEventSelectors: js.UndefOr[Boolean] = js.undefined,
        HomeRegion: js.UndefOr[NonEmptyString] = js.undefined,
        IncludeGlobalServiceEvents: js.UndefOr[Boolean] = js.undefined,
        IsMultiRegionTrail: js.UndefOr[Boolean] = js.undefined,
        IsOrganizationTrail: js.UndefOr[Boolean] = js.undefined,
        KmsKeyId: js.UndefOr[NonEmptyString] = js.undefined,
        LogFileValidationEnabled: js.UndefOr[Boolean] = js.undefined,
        Name: js.UndefOr[NonEmptyString] = js.undefined,
        S3BucketName: js.UndefOr[NonEmptyString] = js.undefined,
        S3KeyPrefix: js.UndefOr[NonEmptyString] = js.undefined,
        SnsTopicArn: js.UndefOr[NonEmptyString] = js.undefined,
        SnsTopicName: js.UndefOr[NonEmptyString] = js.undefined,
        TrailArn: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsCloudTrailTrailDetails = {
      val __obj = js.Dynamic.literal()
      CloudWatchLogsLogGroupArn.foreach(__v => __obj.updateDynamic("CloudWatchLogsLogGroupArn")(__v.asInstanceOf[js.Any]))
      CloudWatchLogsRoleArn.foreach(__v => __obj.updateDynamic("CloudWatchLogsRoleArn")(__v.asInstanceOf[js.Any]))
      HasCustomEventSelectors.foreach(__v => __obj.updateDynamic("HasCustomEventSelectors")(__v.asInstanceOf[js.Any]))
      HomeRegion.foreach(__v => __obj.updateDynamic("HomeRegion")(__v.asInstanceOf[js.Any]))
      IncludeGlobalServiceEvents.foreach(__v => __obj.updateDynamic("IncludeGlobalServiceEvents")(__v.asInstanceOf[js.Any]))
      IsMultiRegionTrail.foreach(__v => __obj.updateDynamic("IsMultiRegionTrail")(__v.asInstanceOf[js.Any]))
      IsOrganizationTrail.foreach(__v => __obj.updateDynamic("IsOrganizationTrail")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      LogFileValidationEnabled.foreach(__v => __obj.updateDynamic("LogFileValidationEnabled")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      S3BucketName.foreach(__v => __obj.updateDynamic("S3BucketName")(__v.asInstanceOf[js.Any]))
      S3KeyPrefix.foreach(__v => __obj.updateDynamic("S3KeyPrefix")(__v.asInstanceOf[js.Any]))
      SnsTopicArn.foreach(__v => __obj.updateDynamic("SnsTopicArn")(__v.asInstanceOf[js.Any]))
      SnsTopicName.foreach(__v => __obj.updateDynamic("SnsTopicName")(__v.asInstanceOf[js.Any]))
      TrailArn.foreach(__v => __obj.updateDynamic("TrailArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsCloudTrailTrailDetails]
    }
  }

  /** Specifies an alarm and associates it with the specified metric or metric math expression.
    */
  @js.native
  trait AwsCloudWatchAlarmDetails extends js.Object {
    var ActionsEnabled: js.UndefOr[Boolean]
    var AlarmActions: js.UndefOr[NonEmptyStringList]
    var AlarmArn: js.UndefOr[NonEmptyString]
    var AlarmConfigurationUpdatedTimestamp: js.UndefOr[NonEmptyString]
    var AlarmDescription: js.UndefOr[NonEmptyString]
    var AlarmName: js.UndefOr[NonEmptyString]
    var ComparisonOperator: js.UndefOr[NonEmptyString]
    var DatapointsToAlarm: js.UndefOr[Int]
    var Dimensions: js.UndefOr[AwsCloudWatchAlarmDimensionsList]
    var EvaluateLowSampleCountPercentile: js.UndefOr[NonEmptyString]
    var EvaluationPeriods: js.UndefOr[Int]
    var ExtendedStatistic: js.UndefOr[NonEmptyString]
    var InsufficientDataActions: js.UndefOr[NonEmptyStringList]
    var MetricName: js.UndefOr[NonEmptyString]
    var Namespace: js.UndefOr[NonEmptyString]
    var OkActions: js.UndefOr[NonEmptyStringList]
    var Period: js.UndefOr[Int]
    var Statistic: js.UndefOr[NonEmptyString]
    var Threshold: js.UndefOr[Double]
    var ThresholdMetricId: js.UndefOr[NonEmptyString]
    var TreatMissingData: js.UndefOr[NonEmptyString]
    var Unit: js.UndefOr[NonEmptyString]
  }

  object AwsCloudWatchAlarmDetails {
    @inline
    def apply(
        ActionsEnabled: js.UndefOr[Boolean] = js.undefined,
        AlarmActions: js.UndefOr[NonEmptyStringList] = js.undefined,
        AlarmArn: js.UndefOr[NonEmptyString] = js.undefined,
        AlarmConfigurationUpdatedTimestamp: js.UndefOr[NonEmptyString] = js.undefined,
        AlarmDescription: js.UndefOr[NonEmptyString] = js.undefined,
        AlarmName: js.UndefOr[NonEmptyString] = js.undefined,
        ComparisonOperator: js.UndefOr[NonEmptyString] = js.undefined,
        DatapointsToAlarm: js.UndefOr[Int] = js.undefined,
        Dimensions: js.UndefOr[AwsCloudWatchAlarmDimensionsList] = js.undefined,
        EvaluateLowSampleCountPercentile: js.UndefOr[NonEmptyString] = js.undefined,
        EvaluationPeriods: js.UndefOr[Int] = js.undefined,
        ExtendedStatistic: js.UndefOr[NonEmptyString] = js.undefined,
        InsufficientDataActions: js.UndefOr[NonEmptyStringList] = js.undefined,
        MetricName: js.UndefOr[NonEmptyString] = js.undefined,
        Namespace: js.UndefOr[NonEmptyString] = js.undefined,
        OkActions: js.UndefOr[NonEmptyStringList] = js.undefined,
        Period: js.UndefOr[Int] = js.undefined,
        Statistic: js.UndefOr[NonEmptyString] = js.undefined,
        Threshold: js.UndefOr[Double] = js.undefined,
        ThresholdMetricId: js.UndefOr[NonEmptyString] = js.undefined,
        TreatMissingData: js.UndefOr[NonEmptyString] = js.undefined,
        Unit: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsCloudWatchAlarmDetails = {
      val __obj = js.Dynamic.literal()
      ActionsEnabled.foreach(__v => __obj.updateDynamic("ActionsEnabled")(__v.asInstanceOf[js.Any]))
      AlarmActions.foreach(__v => __obj.updateDynamic("AlarmActions")(__v.asInstanceOf[js.Any]))
      AlarmArn.foreach(__v => __obj.updateDynamic("AlarmArn")(__v.asInstanceOf[js.Any]))
      AlarmConfigurationUpdatedTimestamp.foreach(__v => __obj.updateDynamic("AlarmConfigurationUpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      AlarmDescription.foreach(__v => __obj.updateDynamic("AlarmDescription")(__v.asInstanceOf[js.Any]))
      AlarmName.foreach(__v => __obj.updateDynamic("AlarmName")(__v.asInstanceOf[js.Any]))
      ComparisonOperator.foreach(__v => __obj.updateDynamic("ComparisonOperator")(__v.asInstanceOf[js.Any]))
      DatapointsToAlarm.foreach(__v => __obj.updateDynamic("DatapointsToAlarm")(__v.asInstanceOf[js.Any]))
      Dimensions.foreach(__v => __obj.updateDynamic("Dimensions")(__v.asInstanceOf[js.Any]))
      EvaluateLowSampleCountPercentile.foreach(__v => __obj.updateDynamic("EvaluateLowSampleCountPercentile")(__v.asInstanceOf[js.Any]))
      EvaluationPeriods.foreach(__v => __obj.updateDynamic("EvaluationPeriods")(__v.asInstanceOf[js.Any]))
      ExtendedStatistic.foreach(__v => __obj.updateDynamic("ExtendedStatistic")(__v.asInstanceOf[js.Any]))
      InsufficientDataActions.foreach(__v => __obj.updateDynamic("InsufficientDataActions")(__v.asInstanceOf[js.Any]))
      MetricName.foreach(__v => __obj.updateDynamic("MetricName")(__v.asInstanceOf[js.Any]))
      Namespace.foreach(__v => __obj.updateDynamic("Namespace")(__v.asInstanceOf[js.Any]))
      OkActions.foreach(__v => __obj.updateDynamic("OkActions")(__v.asInstanceOf[js.Any]))
      Period.foreach(__v => __obj.updateDynamic("Period")(__v.asInstanceOf[js.Any]))
      Statistic.foreach(__v => __obj.updateDynamic("Statistic")(__v.asInstanceOf[js.Any]))
      Threshold.foreach(__v => __obj.updateDynamic("Threshold")(__v.asInstanceOf[js.Any]))
      ThresholdMetricId.foreach(__v => __obj.updateDynamic("ThresholdMetricId")(__v.asInstanceOf[js.Any]))
      TreatMissingData.foreach(__v => __obj.updateDynamic("TreatMissingData")(__v.asInstanceOf[js.Any]))
      Unit.foreach(__v => __obj.updateDynamic("Unit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsCloudWatchAlarmDetails]
    }
  }

  /** Details about the dimensions for the metric associated with the alarm.
    */
  @js.native
  trait AwsCloudWatchAlarmDimensionsDetails extends js.Object {
    var Name: js.UndefOr[NonEmptyString]
    var Value: js.UndefOr[NonEmptyString]
  }

  object AwsCloudWatchAlarmDimensionsDetails {
    @inline
    def apply(
        Name: js.UndefOr[NonEmptyString] = js.undefined,
        Value: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsCloudWatchAlarmDimensionsDetails = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsCloudWatchAlarmDimensionsDetails]
    }
  }

  /** Information about the build artifacts for the CodeBuild project.
    */
  @js.native
  trait AwsCodeBuildProjectArtifactsDetails extends js.Object {
    var ArtifactIdentifier: js.UndefOr[NonEmptyString]
    var EncryptionDisabled: js.UndefOr[Boolean]
    var Location: js.UndefOr[NonEmptyString]
    var Name: js.UndefOr[NonEmptyString]
    var NamespaceType: js.UndefOr[NonEmptyString]
    var OverrideArtifactName: js.UndefOr[Boolean]
    var Packaging: js.UndefOr[NonEmptyString]
    var Path: js.UndefOr[NonEmptyString]
    var Type: js.UndefOr[NonEmptyString]
  }

  object AwsCodeBuildProjectArtifactsDetails {
    @inline
    def apply(
        ArtifactIdentifier: js.UndefOr[NonEmptyString] = js.undefined,
        EncryptionDisabled: js.UndefOr[Boolean] = js.undefined,
        Location: js.UndefOr[NonEmptyString] = js.undefined,
        Name: js.UndefOr[NonEmptyString] = js.undefined,
        NamespaceType: js.UndefOr[NonEmptyString] = js.undefined,
        OverrideArtifactName: js.UndefOr[Boolean] = js.undefined,
        Packaging: js.UndefOr[NonEmptyString] = js.undefined,
        Path: js.UndefOr[NonEmptyString] = js.undefined,
        Type: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsCodeBuildProjectArtifactsDetails = {
      val __obj = js.Dynamic.literal()
      ArtifactIdentifier.foreach(__v => __obj.updateDynamic("ArtifactIdentifier")(__v.asInstanceOf[js.Any]))
      EncryptionDisabled.foreach(__v => __obj.updateDynamic("EncryptionDisabled")(__v.asInstanceOf[js.Any]))
      Location.foreach(__v => __obj.updateDynamic("Location")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      NamespaceType.foreach(__v => __obj.updateDynamic("NamespaceType")(__v.asInstanceOf[js.Any]))
      OverrideArtifactName.foreach(__v => __obj.updateDynamic("OverrideArtifactName")(__v.asInstanceOf[js.Any]))
      Packaging.foreach(__v => __obj.updateDynamic("Packaging")(__v.asInstanceOf[js.Any]))
      Path.foreach(__v => __obj.updateDynamic("Path")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsCodeBuildProjectArtifactsDetails]
    }
  }

  /** Information about an CodeBuild project.
    */
  @js.native
  trait AwsCodeBuildProjectDetails extends js.Object {
    var Artifacts: js.UndefOr[AwsCodeBuildProjectArtifactsList]
    var EncryptionKey: js.UndefOr[NonEmptyString]
    var Environment: js.UndefOr[AwsCodeBuildProjectEnvironment]
    var LogsConfig: js.UndefOr[AwsCodeBuildProjectLogsConfigDetails]
    var Name: js.UndefOr[NonEmptyString]
    var SecondaryArtifacts: js.UndefOr[AwsCodeBuildProjectArtifactsList]
    var ServiceRole: js.UndefOr[NonEmptyString]
    var Source: js.UndefOr[AwsCodeBuildProjectSource]
    var VpcConfig: js.UndefOr[AwsCodeBuildProjectVpcConfig]
  }

  object AwsCodeBuildProjectDetails {
    @inline
    def apply(
        Artifacts: js.UndefOr[AwsCodeBuildProjectArtifactsList] = js.undefined,
        EncryptionKey: js.UndefOr[NonEmptyString] = js.undefined,
        Environment: js.UndefOr[AwsCodeBuildProjectEnvironment] = js.undefined,
        LogsConfig: js.UndefOr[AwsCodeBuildProjectLogsConfigDetails] = js.undefined,
        Name: js.UndefOr[NonEmptyString] = js.undefined,
        SecondaryArtifacts: js.UndefOr[AwsCodeBuildProjectArtifactsList] = js.undefined,
        ServiceRole: js.UndefOr[NonEmptyString] = js.undefined,
        Source: js.UndefOr[AwsCodeBuildProjectSource] = js.undefined,
        VpcConfig: js.UndefOr[AwsCodeBuildProjectVpcConfig] = js.undefined
    ): AwsCodeBuildProjectDetails = {
      val __obj = js.Dynamic.literal()
      Artifacts.foreach(__v => __obj.updateDynamic("Artifacts")(__v.asInstanceOf[js.Any]))
      EncryptionKey.foreach(__v => __obj.updateDynamic("EncryptionKey")(__v.asInstanceOf[js.Any]))
      Environment.foreach(__v => __obj.updateDynamic("Environment")(__v.asInstanceOf[js.Any]))
      LogsConfig.foreach(__v => __obj.updateDynamic("LogsConfig")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      SecondaryArtifacts.foreach(__v => __obj.updateDynamic("SecondaryArtifacts")(__v.asInstanceOf[js.Any]))
      ServiceRole.foreach(__v => __obj.updateDynamic("ServiceRole")(__v.asInstanceOf[js.Any]))
      Source.foreach(__v => __obj.updateDynamic("Source")(__v.asInstanceOf[js.Any]))
      VpcConfig.foreach(__v => __obj.updateDynamic("VpcConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsCodeBuildProjectDetails]
    }
  }

  /** Information about the build environment for this build project.
    */
  @js.native
  trait AwsCodeBuildProjectEnvironment extends js.Object {
    var Certificate: js.UndefOr[NonEmptyString]
    var EnvironmentVariables: js.UndefOr[AwsCodeBuildProjectEnvironmentEnvironmentVariablesList]
    var ImagePullCredentialsType: js.UndefOr[NonEmptyString]
    var PrivilegedMode: js.UndefOr[Boolean]
    var RegistryCredential: js.UndefOr[AwsCodeBuildProjectEnvironmentRegistryCredential]
    var Type: js.UndefOr[NonEmptyString]
  }

  object AwsCodeBuildProjectEnvironment {
    @inline
    def apply(
        Certificate: js.UndefOr[NonEmptyString] = js.undefined,
        EnvironmentVariables: js.UndefOr[AwsCodeBuildProjectEnvironmentEnvironmentVariablesList] = js.undefined,
        ImagePullCredentialsType: js.UndefOr[NonEmptyString] = js.undefined,
        PrivilegedMode: js.UndefOr[Boolean] = js.undefined,
        RegistryCredential: js.UndefOr[AwsCodeBuildProjectEnvironmentRegistryCredential] = js.undefined,
        Type: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsCodeBuildProjectEnvironment = {
      val __obj = js.Dynamic.literal()
      Certificate.foreach(__v => __obj.updateDynamic("Certificate")(__v.asInstanceOf[js.Any]))
      EnvironmentVariables.foreach(__v => __obj.updateDynamic("EnvironmentVariables")(__v.asInstanceOf[js.Any]))
      ImagePullCredentialsType.foreach(__v => __obj.updateDynamic("ImagePullCredentialsType")(__v.asInstanceOf[js.Any]))
      PrivilegedMode.foreach(__v => __obj.updateDynamic("PrivilegedMode")(__v.asInstanceOf[js.Any]))
      RegistryCredential.foreach(__v => __obj.updateDynamic("RegistryCredential")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsCodeBuildProjectEnvironment]
    }
  }

  /** Information about an environment variable that is available to builds for the build project.
    */
  @js.native
  trait AwsCodeBuildProjectEnvironmentEnvironmentVariablesDetails extends js.Object {
    var Name: js.UndefOr[NonEmptyString]
    var Type: js.UndefOr[NonEmptyString]
    var Value: js.UndefOr[NonEmptyString]
  }

  object AwsCodeBuildProjectEnvironmentEnvironmentVariablesDetails {
    @inline
    def apply(
        Name: js.UndefOr[NonEmptyString] = js.undefined,
        Type: js.UndefOr[NonEmptyString] = js.undefined,
        Value: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsCodeBuildProjectEnvironmentEnvironmentVariablesDetails = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsCodeBuildProjectEnvironmentEnvironmentVariablesDetails]
    }
  }

  /** The credentials for access to a private registry.
    */
  @js.native
  trait AwsCodeBuildProjectEnvironmentRegistryCredential extends js.Object {
    var Credential: js.UndefOr[NonEmptyString]
    var CredentialProvider: js.UndefOr[NonEmptyString]
  }

  object AwsCodeBuildProjectEnvironmentRegistryCredential {
    @inline
    def apply(
        Credential: js.UndefOr[NonEmptyString] = js.undefined,
        CredentialProvider: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsCodeBuildProjectEnvironmentRegistryCredential = {
      val __obj = js.Dynamic.literal()
      Credential.foreach(__v => __obj.updateDynamic("Credential")(__v.asInstanceOf[js.Any]))
      CredentialProvider.foreach(__v => __obj.updateDynamic("CredentialProvider")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsCodeBuildProjectEnvironmentRegistryCredential]
    }
  }

  /** Information about CloudWatch Logs for the build project.
    */
  @js.native
  trait AwsCodeBuildProjectLogsConfigCloudWatchLogsDetails extends js.Object {
    var GroupName: js.UndefOr[NonEmptyString]
    var Status: js.UndefOr[NonEmptyString]
    var StreamName: js.UndefOr[NonEmptyString]
  }

  object AwsCodeBuildProjectLogsConfigCloudWatchLogsDetails {
    @inline
    def apply(
        GroupName: js.UndefOr[NonEmptyString] = js.undefined,
        Status: js.UndefOr[NonEmptyString] = js.undefined,
        StreamName: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsCodeBuildProjectLogsConfigCloudWatchLogsDetails = {
      val __obj = js.Dynamic.literal()
      GroupName.foreach(__v => __obj.updateDynamic("GroupName")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StreamName.foreach(__v => __obj.updateDynamic("StreamName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsCodeBuildProjectLogsConfigCloudWatchLogsDetails]
    }
  }

  /** Information about logs for the build project.
    */
  @js.native
  trait AwsCodeBuildProjectLogsConfigDetails extends js.Object {
    var CloudWatchLogs: js.UndefOr[AwsCodeBuildProjectLogsConfigCloudWatchLogsDetails]
    var S3Logs: js.UndefOr[AwsCodeBuildProjectLogsConfigS3LogsDetails]
  }

  object AwsCodeBuildProjectLogsConfigDetails {
    @inline
    def apply(
        CloudWatchLogs: js.UndefOr[AwsCodeBuildProjectLogsConfigCloudWatchLogsDetails] = js.undefined,
        S3Logs: js.UndefOr[AwsCodeBuildProjectLogsConfigS3LogsDetails] = js.undefined
    ): AwsCodeBuildProjectLogsConfigDetails = {
      val __obj = js.Dynamic.literal()
      CloudWatchLogs.foreach(__v => __obj.updateDynamic("CloudWatchLogs")(__v.asInstanceOf[js.Any]))
      S3Logs.foreach(__v => __obj.updateDynamic("S3Logs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsCodeBuildProjectLogsConfigDetails]
    }
  }

  /** Information about logs built to an S3 bucket for a build project.
    */
  @js.native
  trait AwsCodeBuildProjectLogsConfigS3LogsDetails extends js.Object {
    var EncryptionDisabled: js.UndefOr[Boolean]
    var Location: js.UndefOr[NonEmptyString]
    var Status: js.UndefOr[NonEmptyString]
  }

  object AwsCodeBuildProjectLogsConfigS3LogsDetails {
    @inline
    def apply(
        EncryptionDisabled: js.UndefOr[Boolean] = js.undefined,
        Location: js.UndefOr[NonEmptyString] = js.undefined,
        Status: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsCodeBuildProjectLogsConfigS3LogsDetails = {
      val __obj = js.Dynamic.literal()
      EncryptionDisabled.foreach(__v => __obj.updateDynamic("EncryptionDisabled")(__v.asInstanceOf[js.Any]))
      Location.foreach(__v => __obj.updateDynamic("Location")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsCodeBuildProjectLogsConfigS3LogsDetails]
    }
  }

  /** Information about the build input source code for this build project.
    */
  @js.native
  trait AwsCodeBuildProjectSource extends js.Object {
    var GitCloneDepth: js.UndefOr[Int]
    var InsecureSsl: js.UndefOr[Boolean]
    var Location: js.UndefOr[NonEmptyString]
    var Type: js.UndefOr[NonEmptyString]
  }

  object AwsCodeBuildProjectSource {
    @inline
    def apply(
        GitCloneDepth: js.UndefOr[Int] = js.undefined,
        InsecureSsl: js.UndefOr[Boolean] = js.undefined,
        Location: js.UndefOr[NonEmptyString] = js.undefined,
        Type: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsCodeBuildProjectSource = {
      val __obj = js.Dynamic.literal()
      GitCloneDepth.foreach(__v => __obj.updateDynamic("GitCloneDepth")(__v.asInstanceOf[js.Any]))
      InsecureSsl.foreach(__v => __obj.updateDynamic("InsecureSsl")(__v.asInstanceOf[js.Any]))
      Location.foreach(__v => __obj.updateDynamic("Location")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsCodeBuildProjectSource]
    }
  }

  /** Information about the VPC configuration that CodeBuild accesses.
    */
  @js.native
  trait AwsCodeBuildProjectVpcConfig extends js.Object {
    var SecurityGroupIds: js.UndefOr[NonEmptyStringList]
    var Subnets: js.UndefOr[NonEmptyStringList]
    var VpcId: js.UndefOr[NonEmptyString]
  }

  object AwsCodeBuildProjectVpcConfig {
    @inline
    def apply(
        SecurityGroupIds: js.UndefOr[NonEmptyStringList] = js.undefined,
        Subnets: js.UndefOr[NonEmptyStringList] = js.undefined,
        VpcId: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsCodeBuildProjectVpcConfig = {
      val __obj = js.Dynamic.literal()
      SecurityGroupIds.foreach(__v => __obj.updateDynamic("SecurityGroupIds")(__v.asInstanceOf[js.Any]))
      Subnets.foreach(__v => __obj.updateDynamic("Subnets")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsCodeBuildProjectVpcConfig]
    }
  }

  /** Contains the cross-origin resource sharing (CORS) configuration for the API. CORS is only supported for HTTP APIs.
    */
  @js.native
  trait AwsCorsConfiguration extends js.Object {
    var AllowCredentials: js.UndefOr[Boolean]
    var AllowHeaders: js.UndefOr[NonEmptyStringList]
    var AllowMethods: js.UndefOr[NonEmptyStringList]
    var AllowOrigins: js.UndefOr[NonEmptyStringList]
    var ExposeHeaders: js.UndefOr[NonEmptyStringList]
    var MaxAge: js.UndefOr[Int]
  }

  object AwsCorsConfiguration {
    @inline
    def apply(
        AllowCredentials: js.UndefOr[Boolean] = js.undefined,
        AllowHeaders: js.UndefOr[NonEmptyStringList] = js.undefined,
        AllowMethods: js.UndefOr[NonEmptyStringList] = js.undefined,
        AllowOrigins: js.UndefOr[NonEmptyStringList] = js.undefined,
        ExposeHeaders: js.UndefOr[NonEmptyStringList] = js.undefined,
        MaxAge: js.UndefOr[Int] = js.undefined
    ): AwsCorsConfiguration = {
      val __obj = js.Dynamic.literal()
      AllowCredentials.foreach(__v => __obj.updateDynamic("AllowCredentials")(__v.asInstanceOf[js.Any]))
      AllowHeaders.foreach(__v => __obj.updateDynamic("AllowHeaders")(__v.asInstanceOf[js.Any]))
      AllowMethods.foreach(__v => __obj.updateDynamic("AllowMethods")(__v.asInstanceOf[js.Any]))
      AllowOrigins.foreach(__v => __obj.updateDynamic("AllowOrigins")(__v.asInstanceOf[js.Any]))
      ExposeHeaders.foreach(__v => __obj.updateDynamic("ExposeHeaders")(__v.asInstanceOf[js.Any]))
      MaxAge.foreach(__v => __obj.updateDynamic("MaxAge")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsCorsConfiguration]
    }
  }

  /** Contains a definition of an attribute for the table.
    */
  @js.native
  trait AwsDynamoDbTableAttributeDefinition extends js.Object {
    var AttributeName: js.UndefOr[NonEmptyString]
    var AttributeType: js.UndefOr[NonEmptyString]
  }

  object AwsDynamoDbTableAttributeDefinition {
    @inline
    def apply(
        AttributeName: js.UndefOr[NonEmptyString] = js.undefined,
        AttributeType: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsDynamoDbTableAttributeDefinition = {
      val __obj = js.Dynamic.literal()
      AttributeName.foreach(__v => __obj.updateDynamic("AttributeName")(__v.asInstanceOf[js.Any]))
      AttributeType.foreach(__v => __obj.updateDynamic("AttributeType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsDynamoDbTableAttributeDefinition]
    }
  }

  /** Provides information about the billing for read/write capacity on the table.
    */
  @js.native
  trait AwsDynamoDbTableBillingModeSummary extends js.Object {
    var BillingMode: js.UndefOr[NonEmptyString]
    var LastUpdateToPayPerRequestDateTime: js.UndefOr[NonEmptyString]
  }

  object AwsDynamoDbTableBillingModeSummary {
    @inline
    def apply(
        BillingMode: js.UndefOr[NonEmptyString] = js.undefined,
        LastUpdateToPayPerRequestDateTime: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsDynamoDbTableBillingModeSummary = {
      val __obj = js.Dynamic.literal()
      BillingMode.foreach(__v => __obj.updateDynamic("BillingMode")(__v.asInstanceOf[js.Any]))
      LastUpdateToPayPerRequestDateTime.foreach(__v => __obj.updateDynamic("LastUpdateToPayPerRequestDateTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsDynamoDbTableBillingModeSummary]
    }
  }

  /** Provides details about a DynamoDB table.
    */
  @js.native
  trait AwsDynamoDbTableDetails extends js.Object {
    var AttributeDefinitions: js.UndefOr[AwsDynamoDbTableAttributeDefinitionList]
    var BillingModeSummary: js.UndefOr[AwsDynamoDbTableBillingModeSummary]
    var CreationDateTime: js.UndefOr[NonEmptyString]
    var GlobalSecondaryIndexes: js.UndefOr[AwsDynamoDbTableGlobalSecondaryIndexList]
    var GlobalTableVersion: js.UndefOr[NonEmptyString]
    var ItemCount: js.UndefOr[Int]
    var KeySchema: js.UndefOr[AwsDynamoDbTableKeySchemaList]
    var LatestStreamArn: js.UndefOr[NonEmptyString]
    var LatestStreamLabel: js.UndefOr[NonEmptyString]
    var LocalSecondaryIndexes: js.UndefOr[AwsDynamoDbTableLocalSecondaryIndexList]
    var ProvisionedThroughput: js.UndefOr[AwsDynamoDbTableProvisionedThroughput]
    var Replicas: js.UndefOr[AwsDynamoDbTableReplicaList]
    var RestoreSummary: js.UndefOr[AwsDynamoDbTableRestoreSummary]
    var SseDescription: js.UndefOr[AwsDynamoDbTableSseDescription]
    var StreamSpecification: js.UndefOr[AwsDynamoDbTableStreamSpecification]
    var TableId: js.UndefOr[NonEmptyString]
    var TableName: js.UndefOr[NonEmptyString]
    var TableSizeBytes: js.UndefOr[SizeBytes]
    var TableStatus: js.UndefOr[NonEmptyString]
  }

  object AwsDynamoDbTableDetails {
    @inline
    def apply(
        AttributeDefinitions: js.UndefOr[AwsDynamoDbTableAttributeDefinitionList] = js.undefined,
        BillingModeSummary: js.UndefOr[AwsDynamoDbTableBillingModeSummary] = js.undefined,
        CreationDateTime: js.UndefOr[NonEmptyString] = js.undefined,
        GlobalSecondaryIndexes: js.UndefOr[AwsDynamoDbTableGlobalSecondaryIndexList] = js.undefined,
        GlobalTableVersion: js.UndefOr[NonEmptyString] = js.undefined,
        ItemCount: js.UndefOr[Int] = js.undefined,
        KeySchema: js.UndefOr[AwsDynamoDbTableKeySchemaList] = js.undefined,
        LatestStreamArn: js.UndefOr[NonEmptyString] = js.undefined,
        LatestStreamLabel: js.UndefOr[NonEmptyString] = js.undefined,
        LocalSecondaryIndexes: js.UndefOr[AwsDynamoDbTableLocalSecondaryIndexList] = js.undefined,
        ProvisionedThroughput: js.UndefOr[AwsDynamoDbTableProvisionedThroughput] = js.undefined,
        Replicas: js.UndefOr[AwsDynamoDbTableReplicaList] = js.undefined,
        RestoreSummary: js.UndefOr[AwsDynamoDbTableRestoreSummary] = js.undefined,
        SseDescription: js.UndefOr[AwsDynamoDbTableSseDescription] = js.undefined,
        StreamSpecification: js.UndefOr[AwsDynamoDbTableStreamSpecification] = js.undefined,
        TableId: js.UndefOr[NonEmptyString] = js.undefined,
        TableName: js.UndefOr[NonEmptyString] = js.undefined,
        TableSizeBytes: js.UndefOr[SizeBytes] = js.undefined,
        TableStatus: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsDynamoDbTableDetails = {
      val __obj = js.Dynamic.literal()
      AttributeDefinitions.foreach(__v => __obj.updateDynamic("AttributeDefinitions")(__v.asInstanceOf[js.Any]))
      BillingModeSummary.foreach(__v => __obj.updateDynamic("BillingModeSummary")(__v.asInstanceOf[js.Any]))
      CreationDateTime.foreach(__v => __obj.updateDynamic("CreationDateTime")(__v.asInstanceOf[js.Any]))
      GlobalSecondaryIndexes.foreach(__v => __obj.updateDynamic("GlobalSecondaryIndexes")(__v.asInstanceOf[js.Any]))
      GlobalTableVersion.foreach(__v => __obj.updateDynamic("GlobalTableVersion")(__v.asInstanceOf[js.Any]))
      ItemCount.foreach(__v => __obj.updateDynamic("ItemCount")(__v.asInstanceOf[js.Any]))
      KeySchema.foreach(__v => __obj.updateDynamic("KeySchema")(__v.asInstanceOf[js.Any]))
      LatestStreamArn.foreach(__v => __obj.updateDynamic("LatestStreamArn")(__v.asInstanceOf[js.Any]))
      LatestStreamLabel.foreach(__v => __obj.updateDynamic("LatestStreamLabel")(__v.asInstanceOf[js.Any]))
      LocalSecondaryIndexes.foreach(__v => __obj.updateDynamic("LocalSecondaryIndexes")(__v.asInstanceOf[js.Any]))
      ProvisionedThroughput.foreach(__v => __obj.updateDynamic("ProvisionedThroughput")(__v.asInstanceOf[js.Any]))
      Replicas.foreach(__v => __obj.updateDynamic("Replicas")(__v.asInstanceOf[js.Any]))
      RestoreSummary.foreach(__v => __obj.updateDynamic("RestoreSummary")(__v.asInstanceOf[js.Any]))
      SseDescription.foreach(__v => __obj.updateDynamic("SseDescription")(__v.asInstanceOf[js.Any]))
      StreamSpecification.foreach(__v => __obj.updateDynamic("StreamSpecification")(__v.asInstanceOf[js.Any]))
      TableId.foreach(__v => __obj.updateDynamic("TableId")(__v.asInstanceOf[js.Any]))
      TableName.foreach(__v => __obj.updateDynamic("TableName")(__v.asInstanceOf[js.Any]))
      TableSizeBytes.foreach(__v => __obj.updateDynamic("TableSizeBytes")(__v.asInstanceOf[js.Any]))
      TableStatus.foreach(__v => __obj.updateDynamic("TableStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsDynamoDbTableDetails]
    }
  }

  /** Information abut a global secondary index for the table.
    */
  @js.native
  trait AwsDynamoDbTableGlobalSecondaryIndex extends js.Object {
    var Backfilling: js.UndefOr[Boolean]
    var IndexArn: js.UndefOr[NonEmptyString]
    var IndexName: js.UndefOr[NonEmptyString]
    var IndexSizeBytes: js.UndefOr[SizeBytes]
    var IndexStatus: js.UndefOr[NonEmptyString]
    var ItemCount: js.UndefOr[Int]
    var KeySchema: js.UndefOr[AwsDynamoDbTableKeySchemaList]
    var Projection: js.UndefOr[AwsDynamoDbTableProjection]
    var ProvisionedThroughput: js.UndefOr[AwsDynamoDbTableProvisionedThroughput]
  }

  object AwsDynamoDbTableGlobalSecondaryIndex {
    @inline
    def apply(
        Backfilling: js.UndefOr[Boolean] = js.undefined,
        IndexArn: js.UndefOr[NonEmptyString] = js.undefined,
        IndexName: js.UndefOr[NonEmptyString] = js.undefined,
        IndexSizeBytes: js.UndefOr[SizeBytes] = js.undefined,
        IndexStatus: js.UndefOr[NonEmptyString] = js.undefined,
        ItemCount: js.UndefOr[Int] = js.undefined,
        KeySchema: js.UndefOr[AwsDynamoDbTableKeySchemaList] = js.undefined,
        Projection: js.UndefOr[AwsDynamoDbTableProjection] = js.undefined,
        ProvisionedThroughput: js.UndefOr[AwsDynamoDbTableProvisionedThroughput] = js.undefined
    ): AwsDynamoDbTableGlobalSecondaryIndex = {
      val __obj = js.Dynamic.literal()
      Backfilling.foreach(__v => __obj.updateDynamic("Backfilling")(__v.asInstanceOf[js.Any]))
      IndexArn.foreach(__v => __obj.updateDynamic("IndexArn")(__v.asInstanceOf[js.Any]))
      IndexName.foreach(__v => __obj.updateDynamic("IndexName")(__v.asInstanceOf[js.Any]))
      IndexSizeBytes.foreach(__v => __obj.updateDynamic("IndexSizeBytes")(__v.asInstanceOf[js.Any]))
      IndexStatus.foreach(__v => __obj.updateDynamic("IndexStatus")(__v.asInstanceOf[js.Any]))
      ItemCount.foreach(__v => __obj.updateDynamic("ItemCount")(__v.asInstanceOf[js.Any]))
      KeySchema.foreach(__v => __obj.updateDynamic("KeySchema")(__v.asInstanceOf[js.Any]))
      Projection.foreach(__v => __obj.updateDynamic("Projection")(__v.asInstanceOf[js.Any]))
      ProvisionedThroughput.foreach(__v => __obj.updateDynamic("ProvisionedThroughput")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsDynamoDbTableGlobalSecondaryIndex]
    }
  }

  /** A component of the key schema for the DynamoDB table, a global secondary index, or a local secondary index.
    */
  @js.native
  trait AwsDynamoDbTableKeySchema extends js.Object {
    var AttributeName: js.UndefOr[NonEmptyString]
    var KeyType: js.UndefOr[NonEmptyString]
  }

  object AwsDynamoDbTableKeySchema {
    @inline
    def apply(
        AttributeName: js.UndefOr[NonEmptyString] = js.undefined,
        KeyType: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsDynamoDbTableKeySchema = {
      val __obj = js.Dynamic.literal()
      AttributeName.foreach(__v => __obj.updateDynamic("AttributeName")(__v.asInstanceOf[js.Any]))
      KeyType.foreach(__v => __obj.updateDynamic("KeyType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsDynamoDbTableKeySchema]
    }
  }

  /** Information about a local secondary index for a DynamoDB table.
    */
  @js.native
  trait AwsDynamoDbTableLocalSecondaryIndex extends js.Object {
    var IndexArn: js.UndefOr[NonEmptyString]
    var IndexName: js.UndefOr[NonEmptyString]
    var KeySchema: js.UndefOr[AwsDynamoDbTableKeySchemaList]
    var Projection: js.UndefOr[AwsDynamoDbTableProjection]
  }

  object AwsDynamoDbTableLocalSecondaryIndex {
    @inline
    def apply(
        IndexArn: js.UndefOr[NonEmptyString] = js.undefined,
        IndexName: js.UndefOr[NonEmptyString] = js.undefined,
        KeySchema: js.UndefOr[AwsDynamoDbTableKeySchemaList] = js.undefined,
        Projection: js.UndefOr[AwsDynamoDbTableProjection] = js.undefined
    ): AwsDynamoDbTableLocalSecondaryIndex = {
      val __obj = js.Dynamic.literal()
      IndexArn.foreach(__v => __obj.updateDynamic("IndexArn")(__v.asInstanceOf[js.Any]))
      IndexName.foreach(__v => __obj.updateDynamic("IndexName")(__v.asInstanceOf[js.Any]))
      KeySchema.foreach(__v => __obj.updateDynamic("KeySchema")(__v.asInstanceOf[js.Any]))
      Projection.foreach(__v => __obj.updateDynamic("Projection")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsDynamoDbTableLocalSecondaryIndex]
    }
  }

  /** For global and local secondary indexes, identifies the attributes that are copied from the table into the index.
    */
  @js.native
  trait AwsDynamoDbTableProjection extends js.Object {
    var NonKeyAttributes: js.UndefOr[StringList]
    var ProjectionType: js.UndefOr[NonEmptyString]
  }

  object AwsDynamoDbTableProjection {
    @inline
    def apply(
        NonKeyAttributes: js.UndefOr[StringList] = js.undefined,
        ProjectionType: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsDynamoDbTableProjection = {
      val __obj = js.Dynamic.literal()
      NonKeyAttributes.foreach(__v => __obj.updateDynamic("NonKeyAttributes")(__v.asInstanceOf[js.Any]))
      ProjectionType.foreach(__v => __obj.updateDynamic("ProjectionType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsDynamoDbTableProjection]
    }
  }

  /** Information about the provisioned throughput for the table or for a global secondary index.
    */
  @js.native
  trait AwsDynamoDbTableProvisionedThroughput extends js.Object {
    var LastDecreaseDateTime: js.UndefOr[NonEmptyString]
    var LastIncreaseDateTime: js.UndefOr[NonEmptyString]
    var NumberOfDecreasesToday: js.UndefOr[Int]
    var ReadCapacityUnits: js.UndefOr[Int]
    var WriteCapacityUnits: js.UndefOr[Int]
  }

  object AwsDynamoDbTableProvisionedThroughput {
    @inline
    def apply(
        LastDecreaseDateTime: js.UndefOr[NonEmptyString] = js.undefined,
        LastIncreaseDateTime: js.UndefOr[NonEmptyString] = js.undefined,
        NumberOfDecreasesToday: js.UndefOr[Int] = js.undefined,
        ReadCapacityUnits: js.UndefOr[Int] = js.undefined,
        WriteCapacityUnits: js.UndefOr[Int] = js.undefined
    ): AwsDynamoDbTableProvisionedThroughput = {
      val __obj = js.Dynamic.literal()
      LastDecreaseDateTime.foreach(__v => __obj.updateDynamic("LastDecreaseDateTime")(__v.asInstanceOf[js.Any]))
      LastIncreaseDateTime.foreach(__v => __obj.updateDynamic("LastIncreaseDateTime")(__v.asInstanceOf[js.Any]))
      NumberOfDecreasesToday.foreach(__v => __obj.updateDynamic("NumberOfDecreasesToday")(__v.asInstanceOf[js.Any]))
      ReadCapacityUnits.foreach(__v => __obj.updateDynamic("ReadCapacityUnits")(__v.asInstanceOf[js.Any]))
      WriteCapacityUnits.foreach(__v => __obj.updateDynamic("WriteCapacityUnits")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsDynamoDbTableProvisionedThroughput]
    }
  }

  /** Replica-specific configuration for the provisioned throughput.
    */
  @js.native
  trait AwsDynamoDbTableProvisionedThroughputOverride extends js.Object {
    var ReadCapacityUnits: js.UndefOr[Int]
  }

  object AwsDynamoDbTableProvisionedThroughputOverride {
    @inline
    def apply(
        ReadCapacityUnits: js.UndefOr[Int] = js.undefined
    ): AwsDynamoDbTableProvisionedThroughputOverride = {
      val __obj = js.Dynamic.literal()
      ReadCapacityUnits.foreach(__v => __obj.updateDynamic("ReadCapacityUnits")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsDynamoDbTableProvisionedThroughputOverride]
    }
  }

  /** Information about a replica of a DynamoDB table.
    */
  @js.native
  trait AwsDynamoDbTableReplica extends js.Object {
    var GlobalSecondaryIndexes: js.UndefOr[AwsDynamoDbTableReplicaGlobalSecondaryIndexList]
    var KmsMasterKeyId: js.UndefOr[NonEmptyString]
    var ProvisionedThroughputOverride: js.UndefOr[AwsDynamoDbTableProvisionedThroughputOverride]
    var RegionName: js.UndefOr[NonEmptyString]
    var ReplicaStatus: js.UndefOr[NonEmptyString]
    var ReplicaStatusDescription: js.UndefOr[NonEmptyString]
  }

  object AwsDynamoDbTableReplica {
    @inline
    def apply(
        GlobalSecondaryIndexes: js.UndefOr[AwsDynamoDbTableReplicaGlobalSecondaryIndexList] = js.undefined,
        KmsMasterKeyId: js.UndefOr[NonEmptyString] = js.undefined,
        ProvisionedThroughputOverride: js.UndefOr[AwsDynamoDbTableProvisionedThroughputOverride] = js.undefined,
        RegionName: js.UndefOr[NonEmptyString] = js.undefined,
        ReplicaStatus: js.UndefOr[NonEmptyString] = js.undefined,
        ReplicaStatusDescription: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsDynamoDbTableReplica = {
      val __obj = js.Dynamic.literal()
      GlobalSecondaryIndexes.foreach(__v => __obj.updateDynamic("GlobalSecondaryIndexes")(__v.asInstanceOf[js.Any]))
      KmsMasterKeyId.foreach(__v => __obj.updateDynamic("KmsMasterKeyId")(__v.asInstanceOf[js.Any]))
      ProvisionedThroughputOverride.foreach(__v => __obj.updateDynamic("ProvisionedThroughputOverride")(__v.asInstanceOf[js.Any]))
      RegionName.foreach(__v => __obj.updateDynamic("RegionName")(__v.asInstanceOf[js.Any]))
      ReplicaStatus.foreach(__v => __obj.updateDynamic("ReplicaStatus")(__v.asInstanceOf[js.Any]))
      ReplicaStatusDescription.foreach(__v => __obj.updateDynamic("ReplicaStatusDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsDynamoDbTableReplica]
    }
  }

  /** Information about a global secondary index for a DynamoDB table replica.
    */
  @js.native
  trait AwsDynamoDbTableReplicaGlobalSecondaryIndex extends js.Object {
    var IndexName: js.UndefOr[NonEmptyString]
    var ProvisionedThroughputOverride: js.UndefOr[AwsDynamoDbTableProvisionedThroughputOverride]
  }

  object AwsDynamoDbTableReplicaGlobalSecondaryIndex {
    @inline
    def apply(
        IndexName: js.UndefOr[NonEmptyString] = js.undefined,
        ProvisionedThroughputOverride: js.UndefOr[AwsDynamoDbTableProvisionedThroughputOverride] = js.undefined
    ): AwsDynamoDbTableReplicaGlobalSecondaryIndex = {
      val __obj = js.Dynamic.literal()
      IndexName.foreach(__v => __obj.updateDynamic("IndexName")(__v.asInstanceOf[js.Any]))
      ProvisionedThroughputOverride.foreach(__v => __obj.updateDynamic("ProvisionedThroughputOverride")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsDynamoDbTableReplicaGlobalSecondaryIndex]
    }
  }

  /** Information about the restore for the table.
    */
  @js.native
  trait AwsDynamoDbTableRestoreSummary extends js.Object {
    var RestoreDateTime: js.UndefOr[NonEmptyString]
    var RestoreInProgress: js.UndefOr[Boolean]
    var SourceBackupArn: js.UndefOr[NonEmptyString]
    var SourceTableArn: js.UndefOr[NonEmptyString]
  }

  object AwsDynamoDbTableRestoreSummary {
    @inline
    def apply(
        RestoreDateTime: js.UndefOr[NonEmptyString] = js.undefined,
        RestoreInProgress: js.UndefOr[Boolean] = js.undefined,
        SourceBackupArn: js.UndefOr[NonEmptyString] = js.undefined,
        SourceTableArn: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsDynamoDbTableRestoreSummary = {
      val __obj = js.Dynamic.literal()
      RestoreDateTime.foreach(__v => __obj.updateDynamic("RestoreDateTime")(__v.asInstanceOf[js.Any]))
      RestoreInProgress.foreach(__v => __obj.updateDynamic("RestoreInProgress")(__v.asInstanceOf[js.Any]))
      SourceBackupArn.foreach(__v => __obj.updateDynamic("SourceBackupArn")(__v.asInstanceOf[js.Any]))
      SourceTableArn.foreach(__v => __obj.updateDynamic("SourceTableArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsDynamoDbTableRestoreSummary]
    }
  }

  /** Information about the server-side encryption for the table.
    */
  @js.native
  trait AwsDynamoDbTableSseDescription extends js.Object {
    var InaccessibleEncryptionDateTime: js.UndefOr[NonEmptyString]
    var KmsMasterKeyArn: js.UndefOr[NonEmptyString]
    var SseType: js.UndefOr[NonEmptyString]
    var Status: js.UndefOr[NonEmptyString]
  }

  object AwsDynamoDbTableSseDescription {
    @inline
    def apply(
        InaccessibleEncryptionDateTime: js.UndefOr[NonEmptyString] = js.undefined,
        KmsMasterKeyArn: js.UndefOr[NonEmptyString] = js.undefined,
        SseType: js.UndefOr[NonEmptyString] = js.undefined,
        Status: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsDynamoDbTableSseDescription = {
      val __obj = js.Dynamic.literal()
      InaccessibleEncryptionDateTime.foreach(__v => __obj.updateDynamic("InaccessibleEncryptionDateTime")(__v.asInstanceOf[js.Any]))
      KmsMasterKeyArn.foreach(__v => __obj.updateDynamic("KmsMasterKeyArn")(__v.asInstanceOf[js.Any]))
      SseType.foreach(__v => __obj.updateDynamic("SseType")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsDynamoDbTableSseDescription]
    }
  }

  /** The current DynamoDB Streams configuration for the table.
    */
  @js.native
  trait AwsDynamoDbTableStreamSpecification extends js.Object {
    var StreamEnabled: js.UndefOr[Boolean]
    var StreamViewType: js.UndefOr[NonEmptyString]
  }

  object AwsDynamoDbTableStreamSpecification {
    @inline
    def apply(
        StreamEnabled: js.UndefOr[Boolean] = js.undefined,
        StreamViewType: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsDynamoDbTableStreamSpecification = {
      val __obj = js.Dynamic.literal()
      StreamEnabled.foreach(__v => __obj.updateDynamic("StreamEnabled")(__v.asInstanceOf[js.Any]))
      StreamViewType.foreach(__v => __obj.updateDynamic("StreamViewType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsDynamoDbTableStreamSpecification]
    }
  }

  /** Information about an Elastic IP address.
    */
  @js.native
  trait AwsEc2EipDetails extends js.Object {
    var AllocationId: js.UndefOr[NonEmptyString]
    var AssociationId: js.UndefOr[NonEmptyString]
    var Domain: js.UndefOr[NonEmptyString]
    var InstanceId: js.UndefOr[NonEmptyString]
    var NetworkBorderGroup: js.UndefOr[NonEmptyString]
    var NetworkInterfaceId: js.UndefOr[NonEmptyString]
    var NetworkInterfaceOwnerId: js.UndefOr[NonEmptyString]
    var PrivateIpAddress: js.UndefOr[NonEmptyString]
    var PublicIp: js.UndefOr[NonEmptyString]
    var PublicIpv4Pool: js.UndefOr[NonEmptyString]
  }

  object AwsEc2EipDetails {
    @inline
    def apply(
        AllocationId: js.UndefOr[NonEmptyString] = js.undefined,
        AssociationId: js.UndefOr[NonEmptyString] = js.undefined,
        Domain: js.UndefOr[NonEmptyString] = js.undefined,
        InstanceId: js.UndefOr[NonEmptyString] = js.undefined,
        NetworkBorderGroup: js.UndefOr[NonEmptyString] = js.undefined,
        NetworkInterfaceId: js.UndefOr[NonEmptyString] = js.undefined,
        NetworkInterfaceOwnerId: js.UndefOr[NonEmptyString] = js.undefined,
        PrivateIpAddress: js.UndefOr[NonEmptyString] = js.undefined,
        PublicIp: js.UndefOr[NonEmptyString] = js.undefined,
        PublicIpv4Pool: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEc2EipDetails = {
      val __obj = js.Dynamic.literal()
      AllocationId.foreach(__v => __obj.updateDynamic("AllocationId")(__v.asInstanceOf[js.Any]))
      AssociationId.foreach(__v => __obj.updateDynamic("AssociationId")(__v.asInstanceOf[js.Any]))
      Domain.foreach(__v => __obj.updateDynamic("Domain")(__v.asInstanceOf[js.Any]))
      InstanceId.foreach(__v => __obj.updateDynamic("InstanceId")(__v.asInstanceOf[js.Any]))
      NetworkBorderGroup.foreach(__v => __obj.updateDynamic("NetworkBorderGroup")(__v.asInstanceOf[js.Any]))
      NetworkInterfaceId.foreach(__v => __obj.updateDynamic("NetworkInterfaceId")(__v.asInstanceOf[js.Any]))
      NetworkInterfaceOwnerId.foreach(__v => __obj.updateDynamic("NetworkInterfaceOwnerId")(__v.asInstanceOf[js.Any]))
      PrivateIpAddress.foreach(__v => __obj.updateDynamic("PrivateIpAddress")(__v.asInstanceOf[js.Any]))
      PublicIp.foreach(__v => __obj.updateDynamic("PublicIp")(__v.asInstanceOf[js.Any]))
      PublicIpv4Pool.foreach(__v => __obj.updateDynamic("PublicIpv4Pool")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEc2EipDetails]
    }
  }

  /** The details of an Amazon EC2 instance.
    */
  @js.native
  trait AwsEc2InstanceDetails extends js.Object {
    var IamInstanceProfileArn: js.UndefOr[NonEmptyString]
    var ImageId: js.UndefOr[NonEmptyString]
    var IpV4Addresses: js.UndefOr[StringList]
    var IpV6Addresses: js.UndefOr[StringList]
    var KeyName: js.UndefOr[NonEmptyString]
    var LaunchedAt: js.UndefOr[NonEmptyString]
    var MetadataOptions: js.UndefOr[AwsEc2InstanceMetadataOptions]
    var NetworkInterfaces: js.UndefOr[AwsEc2InstanceNetworkInterfacesList]
    var SubnetId: js.UndefOr[NonEmptyString]
    var Type: js.UndefOr[NonEmptyString]
    var VirtualizationType: js.UndefOr[NonEmptyString]
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
        MetadataOptions: js.UndefOr[AwsEc2InstanceMetadataOptions] = js.undefined,
        NetworkInterfaces: js.UndefOr[AwsEc2InstanceNetworkInterfacesList] = js.undefined,
        SubnetId: js.UndefOr[NonEmptyString] = js.undefined,
        Type: js.UndefOr[NonEmptyString] = js.undefined,
        VirtualizationType: js.UndefOr[NonEmptyString] = js.undefined,
        VpcId: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEc2InstanceDetails = {
      val __obj = js.Dynamic.literal()
      IamInstanceProfileArn.foreach(__v => __obj.updateDynamic("IamInstanceProfileArn")(__v.asInstanceOf[js.Any]))
      ImageId.foreach(__v => __obj.updateDynamic("ImageId")(__v.asInstanceOf[js.Any]))
      IpV4Addresses.foreach(__v => __obj.updateDynamic("IpV4Addresses")(__v.asInstanceOf[js.Any]))
      IpV6Addresses.foreach(__v => __obj.updateDynamic("IpV6Addresses")(__v.asInstanceOf[js.Any]))
      KeyName.foreach(__v => __obj.updateDynamic("KeyName")(__v.asInstanceOf[js.Any]))
      LaunchedAt.foreach(__v => __obj.updateDynamic("LaunchedAt")(__v.asInstanceOf[js.Any]))
      MetadataOptions.foreach(__v => __obj.updateDynamic("MetadataOptions")(__v.asInstanceOf[js.Any]))
      NetworkInterfaces.foreach(__v => __obj.updateDynamic("NetworkInterfaces")(__v.asInstanceOf[js.Any]))
      SubnetId.foreach(__v => __obj.updateDynamic("SubnetId")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      VirtualizationType.foreach(__v => __obj.updateDynamic("VirtualizationType")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEc2InstanceDetails]
    }
  }

  /** Metadata options that allow you to configure and secure the Amazon EC2 instance.
    */
  @js.native
  trait AwsEc2InstanceMetadataOptions extends js.Object {
    var HttpEndpoint: js.UndefOr[NonEmptyString]
    var HttpProtocolIpv6: js.UndefOr[NonEmptyString]
    var HttpPutResponseHopLimit: js.UndefOr[Int]
    var HttpTokens: js.UndefOr[NonEmptyString]
    var InstanceMetadataTags: js.UndefOr[NonEmptyString]
  }

  object AwsEc2InstanceMetadataOptions {
    @inline
    def apply(
        HttpEndpoint: js.UndefOr[NonEmptyString] = js.undefined,
        HttpProtocolIpv6: js.UndefOr[NonEmptyString] = js.undefined,
        HttpPutResponseHopLimit: js.UndefOr[Int] = js.undefined,
        HttpTokens: js.UndefOr[NonEmptyString] = js.undefined,
        InstanceMetadataTags: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEc2InstanceMetadataOptions = {
      val __obj = js.Dynamic.literal()
      HttpEndpoint.foreach(__v => __obj.updateDynamic("HttpEndpoint")(__v.asInstanceOf[js.Any]))
      HttpProtocolIpv6.foreach(__v => __obj.updateDynamic("HttpProtocolIpv6")(__v.asInstanceOf[js.Any]))
      HttpPutResponseHopLimit.foreach(__v => __obj.updateDynamic("HttpPutResponseHopLimit")(__v.asInstanceOf[js.Any]))
      HttpTokens.foreach(__v => __obj.updateDynamic("HttpTokens")(__v.asInstanceOf[js.Any]))
      InstanceMetadataTags.foreach(__v => __obj.updateDynamic("InstanceMetadataTags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEc2InstanceMetadataOptions]
    }
  }

  /** Identifies a network interface for the Amazon EC2 instance.
    */
  @js.native
  trait AwsEc2InstanceNetworkInterfacesDetails extends js.Object {
    var NetworkInterfaceId: js.UndefOr[NonEmptyString]
  }

  object AwsEc2InstanceNetworkInterfacesDetails {
    @inline
    def apply(
        NetworkInterfaceId: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEc2InstanceNetworkInterfacesDetails = {
      val __obj = js.Dynamic.literal()
      NetworkInterfaceId.foreach(__v => __obj.updateDynamic("NetworkInterfaceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEc2InstanceNetworkInterfacesDetails]
    }
  }

  /** An association between the network ACL and a subnet.
    */
  @js.native
  trait AwsEc2NetworkAclAssociation extends js.Object {
    var NetworkAclAssociationId: js.UndefOr[NonEmptyString]
    var NetworkAclId: js.UndefOr[NonEmptyString]
    var SubnetId: js.UndefOr[NonEmptyString]
  }

  object AwsEc2NetworkAclAssociation {
    @inline
    def apply(
        NetworkAclAssociationId: js.UndefOr[NonEmptyString] = js.undefined,
        NetworkAclId: js.UndefOr[NonEmptyString] = js.undefined,
        SubnetId: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEc2NetworkAclAssociation = {
      val __obj = js.Dynamic.literal()
      NetworkAclAssociationId.foreach(__v => __obj.updateDynamic("NetworkAclAssociationId")(__v.asInstanceOf[js.Any]))
      NetworkAclId.foreach(__v => __obj.updateDynamic("NetworkAclId")(__v.asInstanceOf[js.Any]))
      SubnetId.foreach(__v => __obj.updateDynamic("SubnetId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEc2NetworkAclAssociation]
    }
  }

  /** Contains details about an Amazon EC2 network access control list (ACL).
    */
  @js.native
  trait AwsEc2NetworkAclDetails extends js.Object {
    var Associations: js.UndefOr[AwsEc2NetworkAclAssociationList]
    var Entries: js.UndefOr[AwsEc2NetworkAclEntryList]
    var IsDefault: js.UndefOr[Boolean]
    var NetworkAclId: js.UndefOr[NonEmptyString]
    var OwnerId: js.UndefOr[NonEmptyString]
    var VpcId: js.UndefOr[NonEmptyString]
  }

  object AwsEc2NetworkAclDetails {
    @inline
    def apply(
        Associations: js.UndefOr[AwsEc2NetworkAclAssociationList] = js.undefined,
        Entries: js.UndefOr[AwsEc2NetworkAclEntryList] = js.undefined,
        IsDefault: js.UndefOr[Boolean] = js.undefined,
        NetworkAclId: js.UndefOr[NonEmptyString] = js.undefined,
        OwnerId: js.UndefOr[NonEmptyString] = js.undefined,
        VpcId: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEc2NetworkAclDetails = {
      val __obj = js.Dynamic.literal()
      Associations.foreach(__v => __obj.updateDynamic("Associations")(__v.asInstanceOf[js.Any]))
      Entries.foreach(__v => __obj.updateDynamic("Entries")(__v.asInstanceOf[js.Any]))
      IsDefault.foreach(__v => __obj.updateDynamic("IsDefault")(__v.asInstanceOf[js.Any]))
      NetworkAclId.foreach(__v => __obj.updateDynamic("NetworkAclId")(__v.asInstanceOf[js.Any]))
      OwnerId.foreach(__v => __obj.updateDynamic("OwnerId")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEc2NetworkAclDetails]
    }
  }

  /** A rule for the network ACL. Each rule allows or denies access based on the IP address, traffic direction, port, and protocol.
    */
  @js.native
  trait AwsEc2NetworkAclEntry extends js.Object {
    var CidrBlock: js.UndefOr[NonEmptyString]
    var Egress: js.UndefOr[Boolean]
    var IcmpTypeCode: js.UndefOr[IcmpTypeCode]
    var Ipv6CidrBlock: js.UndefOr[NonEmptyString]
    var PortRange: js.UndefOr[PortRangeFromTo]
    var Protocol: js.UndefOr[NonEmptyString]
    var RuleAction: js.UndefOr[NonEmptyString]
    var RuleNumber: js.UndefOr[Int]
  }

  object AwsEc2NetworkAclEntry {
    @inline
    def apply(
        CidrBlock: js.UndefOr[NonEmptyString] = js.undefined,
        Egress: js.UndefOr[Boolean] = js.undefined,
        IcmpTypeCode: js.UndefOr[IcmpTypeCode] = js.undefined,
        Ipv6CidrBlock: js.UndefOr[NonEmptyString] = js.undefined,
        PortRange: js.UndefOr[PortRangeFromTo] = js.undefined,
        Protocol: js.UndefOr[NonEmptyString] = js.undefined,
        RuleAction: js.UndefOr[NonEmptyString] = js.undefined,
        RuleNumber: js.UndefOr[Int] = js.undefined
    ): AwsEc2NetworkAclEntry = {
      val __obj = js.Dynamic.literal()
      CidrBlock.foreach(__v => __obj.updateDynamic("CidrBlock")(__v.asInstanceOf[js.Any]))
      Egress.foreach(__v => __obj.updateDynamic("Egress")(__v.asInstanceOf[js.Any]))
      IcmpTypeCode.foreach(__v => __obj.updateDynamic("IcmpTypeCode")(__v.asInstanceOf[js.Any]))
      Ipv6CidrBlock.foreach(__v => __obj.updateDynamic("Ipv6CidrBlock")(__v.asInstanceOf[js.Any]))
      PortRange.foreach(__v => __obj.updateDynamic("PortRange")(__v.asInstanceOf[js.Any]))
      Protocol.foreach(__v => __obj.updateDynamic("Protocol")(__v.asInstanceOf[js.Any]))
      RuleAction.foreach(__v => __obj.updateDynamic("RuleAction")(__v.asInstanceOf[js.Any]))
      RuleNumber.foreach(__v => __obj.updateDynamic("RuleNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEc2NetworkAclEntry]
    }
  }

  /** Information about the network interface attachment.
    */
  @js.native
  trait AwsEc2NetworkInterfaceAttachment extends js.Object {
    var AttachTime: js.UndefOr[NonEmptyString]
    var AttachmentId: js.UndefOr[NonEmptyString]
    var DeleteOnTermination: js.UndefOr[Boolean]
    var DeviceIndex: js.UndefOr[Int]
    var InstanceId: js.UndefOr[NonEmptyString]
    var InstanceOwnerId: js.UndefOr[NonEmptyString]
    var Status: js.UndefOr[NonEmptyString]
  }

  object AwsEc2NetworkInterfaceAttachment {
    @inline
    def apply(
        AttachTime: js.UndefOr[NonEmptyString] = js.undefined,
        AttachmentId: js.UndefOr[NonEmptyString] = js.undefined,
        DeleteOnTermination: js.UndefOr[Boolean] = js.undefined,
        DeviceIndex: js.UndefOr[Int] = js.undefined,
        InstanceId: js.UndefOr[NonEmptyString] = js.undefined,
        InstanceOwnerId: js.UndefOr[NonEmptyString] = js.undefined,
        Status: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEc2NetworkInterfaceAttachment = {
      val __obj = js.Dynamic.literal()
      AttachTime.foreach(__v => __obj.updateDynamic("AttachTime")(__v.asInstanceOf[js.Any]))
      AttachmentId.foreach(__v => __obj.updateDynamic("AttachmentId")(__v.asInstanceOf[js.Any]))
      DeleteOnTermination.foreach(__v => __obj.updateDynamic("DeleteOnTermination")(__v.asInstanceOf[js.Any]))
      DeviceIndex.foreach(__v => __obj.updateDynamic("DeviceIndex")(__v.asInstanceOf[js.Any]))
      InstanceId.foreach(__v => __obj.updateDynamic("InstanceId")(__v.asInstanceOf[js.Any]))
      InstanceOwnerId.foreach(__v => __obj.updateDynamic("InstanceOwnerId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEc2NetworkInterfaceAttachment]
    }
  }

  /** Details about the network interface
    */
  @js.native
  trait AwsEc2NetworkInterfaceDetails extends js.Object {
    var Attachment: js.UndefOr[AwsEc2NetworkInterfaceAttachment]
    var IpV6Addresses: js.UndefOr[AwsEc2NetworkInterfaceIpV6AddressList]
    var NetworkInterfaceId: js.UndefOr[NonEmptyString]
    var PrivateIpAddresses: js.UndefOr[AwsEc2NetworkInterfacePrivateIpAddressList]
    var PublicDnsName: js.UndefOr[NonEmptyString]
    var PublicIp: js.UndefOr[NonEmptyString]
    var SecurityGroups: js.UndefOr[AwsEc2NetworkInterfaceSecurityGroupList]
    var SourceDestCheck: js.UndefOr[Boolean]
  }

  object AwsEc2NetworkInterfaceDetails {
    @inline
    def apply(
        Attachment: js.UndefOr[AwsEc2NetworkInterfaceAttachment] = js.undefined,
        IpV6Addresses: js.UndefOr[AwsEc2NetworkInterfaceIpV6AddressList] = js.undefined,
        NetworkInterfaceId: js.UndefOr[NonEmptyString] = js.undefined,
        PrivateIpAddresses: js.UndefOr[AwsEc2NetworkInterfacePrivateIpAddressList] = js.undefined,
        PublicDnsName: js.UndefOr[NonEmptyString] = js.undefined,
        PublicIp: js.UndefOr[NonEmptyString] = js.undefined,
        SecurityGroups: js.UndefOr[AwsEc2NetworkInterfaceSecurityGroupList] = js.undefined,
        SourceDestCheck: js.UndefOr[Boolean] = js.undefined
    ): AwsEc2NetworkInterfaceDetails = {
      val __obj = js.Dynamic.literal()
      Attachment.foreach(__v => __obj.updateDynamic("Attachment")(__v.asInstanceOf[js.Any]))
      IpV6Addresses.foreach(__v => __obj.updateDynamic("IpV6Addresses")(__v.asInstanceOf[js.Any]))
      NetworkInterfaceId.foreach(__v => __obj.updateDynamic("NetworkInterfaceId")(__v.asInstanceOf[js.Any]))
      PrivateIpAddresses.foreach(__v => __obj.updateDynamic("PrivateIpAddresses")(__v.asInstanceOf[js.Any]))
      PublicDnsName.foreach(__v => __obj.updateDynamic("PublicDnsName")(__v.asInstanceOf[js.Any]))
      PublicIp.foreach(__v => __obj.updateDynamic("PublicIp")(__v.asInstanceOf[js.Any]))
      SecurityGroups.foreach(__v => __obj.updateDynamic("SecurityGroups")(__v.asInstanceOf[js.Any]))
      SourceDestCheck.foreach(__v => __obj.updateDynamic("SourceDestCheck")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEc2NetworkInterfaceDetails]
    }
  }

  /** Provides information about an IPV6 address that is associated with the network interface.
    */
  @js.native
  trait AwsEc2NetworkInterfaceIpV6AddressDetail extends js.Object {
    var IpV6Address: js.UndefOr[NonEmptyString]
  }

  object AwsEc2NetworkInterfaceIpV6AddressDetail {
    @inline
    def apply(
        IpV6Address: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEc2NetworkInterfaceIpV6AddressDetail = {
      val __obj = js.Dynamic.literal()
      IpV6Address.foreach(__v => __obj.updateDynamic("IpV6Address")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEc2NetworkInterfaceIpV6AddressDetail]
    }
  }

  /** Provides information about a private IPv4 address that is with the network interface.
    */
  @js.native
  trait AwsEc2NetworkInterfacePrivateIpAddressDetail extends js.Object {
    var PrivateDnsName: js.UndefOr[NonEmptyString]
    var PrivateIpAddress: js.UndefOr[NonEmptyString]
  }

  object AwsEc2NetworkInterfacePrivateIpAddressDetail {
    @inline
    def apply(
        PrivateDnsName: js.UndefOr[NonEmptyString] = js.undefined,
        PrivateIpAddress: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEc2NetworkInterfacePrivateIpAddressDetail = {
      val __obj = js.Dynamic.literal()
      PrivateDnsName.foreach(__v => __obj.updateDynamic("PrivateDnsName")(__v.asInstanceOf[js.Any]))
      PrivateIpAddress.foreach(__v => __obj.updateDynamic("PrivateIpAddress")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEc2NetworkInterfacePrivateIpAddressDetail]
    }
  }

  /** A security group associated with the network interface.
    */
  @js.native
  trait AwsEc2NetworkInterfaceSecurityGroup extends js.Object {
    var GroupId: js.UndefOr[NonEmptyString]
    var GroupName: js.UndefOr[NonEmptyString]
  }

  object AwsEc2NetworkInterfaceSecurityGroup {
    @inline
    def apply(
        GroupId: js.UndefOr[NonEmptyString] = js.undefined,
        GroupName: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEc2NetworkInterfaceSecurityGroup = {
      val __obj = js.Dynamic.literal()
      GroupId.foreach(__v => __obj.updateDynamic("GroupId")(__v.asInstanceOf[js.Any]))
      GroupName.foreach(__v => __obj.updateDynamic("GroupName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEc2NetworkInterfaceSecurityGroup]
    }
  }

  /** Details about an Amazon EC2 security group.
    */
  @js.native
  trait AwsEc2SecurityGroupDetails extends js.Object {
    var GroupId: js.UndefOr[NonEmptyString]
    var GroupName: js.UndefOr[NonEmptyString]
    var IpPermissions: js.UndefOr[AwsEc2SecurityGroupIpPermissionList]
    var IpPermissionsEgress: js.UndefOr[AwsEc2SecurityGroupIpPermissionList]
    var OwnerId: js.UndefOr[NonEmptyString]
    var VpcId: js.UndefOr[NonEmptyString]
  }

  object AwsEc2SecurityGroupDetails {
    @inline
    def apply(
        GroupId: js.UndefOr[NonEmptyString] = js.undefined,
        GroupName: js.UndefOr[NonEmptyString] = js.undefined,
        IpPermissions: js.UndefOr[AwsEc2SecurityGroupIpPermissionList] = js.undefined,
        IpPermissionsEgress: js.UndefOr[AwsEc2SecurityGroupIpPermissionList] = js.undefined,
        OwnerId: js.UndefOr[NonEmptyString] = js.undefined,
        VpcId: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEc2SecurityGroupDetails = {
      val __obj = js.Dynamic.literal()
      GroupId.foreach(__v => __obj.updateDynamic("GroupId")(__v.asInstanceOf[js.Any]))
      GroupName.foreach(__v => __obj.updateDynamic("GroupName")(__v.asInstanceOf[js.Any]))
      IpPermissions.foreach(__v => __obj.updateDynamic("IpPermissions")(__v.asInstanceOf[js.Any]))
      IpPermissionsEgress.foreach(__v => __obj.updateDynamic("IpPermissionsEgress")(__v.asInstanceOf[js.Any]))
      OwnerId.foreach(__v => __obj.updateDynamic("OwnerId")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEc2SecurityGroupDetails]
    }
  }

  /** An IP permission for an EC2 security group.
    */
  @js.native
  trait AwsEc2SecurityGroupIpPermission extends js.Object {
    var FromPort: js.UndefOr[Int]
    var IpProtocol: js.UndefOr[NonEmptyString]
    var IpRanges: js.UndefOr[AwsEc2SecurityGroupIpRangeList]
    var Ipv6Ranges: js.UndefOr[AwsEc2SecurityGroupIpv6RangeList]
    var PrefixListIds: js.UndefOr[AwsEc2SecurityGroupPrefixListIdList]
    var ToPort: js.UndefOr[Int]
    var UserIdGroupPairs: js.UndefOr[AwsEc2SecurityGroupUserIdGroupPairList]
  }

  object AwsEc2SecurityGroupIpPermission {
    @inline
    def apply(
        FromPort: js.UndefOr[Int] = js.undefined,
        IpProtocol: js.UndefOr[NonEmptyString] = js.undefined,
        IpRanges: js.UndefOr[AwsEc2SecurityGroupIpRangeList] = js.undefined,
        Ipv6Ranges: js.UndefOr[AwsEc2SecurityGroupIpv6RangeList] = js.undefined,
        PrefixListIds: js.UndefOr[AwsEc2SecurityGroupPrefixListIdList] = js.undefined,
        ToPort: js.UndefOr[Int] = js.undefined,
        UserIdGroupPairs: js.UndefOr[AwsEc2SecurityGroupUserIdGroupPairList] = js.undefined
    ): AwsEc2SecurityGroupIpPermission = {
      val __obj = js.Dynamic.literal()
      FromPort.foreach(__v => __obj.updateDynamic("FromPort")(__v.asInstanceOf[js.Any]))
      IpProtocol.foreach(__v => __obj.updateDynamic("IpProtocol")(__v.asInstanceOf[js.Any]))
      IpRanges.foreach(__v => __obj.updateDynamic("IpRanges")(__v.asInstanceOf[js.Any]))
      Ipv6Ranges.foreach(__v => __obj.updateDynamic("Ipv6Ranges")(__v.asInstanceOf[js.Any]))
      PrefixListIds.foreach(__v => __obj.updateDynamic("PrefixListIds")(__v.asInstanceOf[js.Any]))
      ToPort.foreach(__v => __obj.updateDynamic("ToPort")(__v.asInstanceOf[js.Any]))
      UserIdGroupPairs.foreach(__v => __obj.updateDynamic("UserIdGroupPairs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEc2SecurityGroupIpPermission]
    }
  }

  /** A range of IPv4 addresses.
    */
  @js.native
  trait AwsEc2SecurityGroupIpRange extends js.Object {
    var CidrIp: js.UndefOr[NonEmptyString]
  }

  object AwsEc2SecurityGroupIpRange {
    @inline
    def apply(
        CidrIp: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEc2SecurityGroupIpRange = {
      val __obj = js.Dynamic.literal()
      CidrIp.foreach(__v => __obj.updateDynamic("CidrIp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEc2SecurityGroupIpRange]
    }
  }

  /** A range of IPv6 addresses.
    */
  @js.native
  trait AwsEc2SecurityGroupIpv6Range extends js.Object {
    var CidrIpv6: js.UndefOr[NonEmptyString]
  }

  object AwsEc2SecurityGroupIpv6Range {
    @inline
    def apply(
        CidrIpv6: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEc2SecurityGroupIpv6Range = {
      val __obj = js.Dynamic.literal()
      CidrIpv6.foreach(__v => __obj.updateDynamic("CidrIpv6")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEc2SecurityGroupIpv6Range]
    }
  }

  /** A prefix list ID.
    */
  @js.native
  trait AwsEc2SecurityGroupPrefixListId extends js.Object {
    var PrefixListId: js.UndefOr[NonEmptyString]
  }

  object AwsEc2SecurityGroupPrefixListId {
    @inline
    def apply(
        PrefixListId: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEc2SecurityGroupPrefixListId = {
      val __obj = js.Dynamic.literal()
      PrefixListId.foreach(__v => __obj.updateDynamic("PrefixListId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEc2SecurityGroupPrefixListId]
    }
  }

  /** A relationship between a security group and a user.
    */
  @js.native
  trait AwsEc2SecurityGroupUserIdGroupPair extends js.Object {
    var GroupId: js.UndefOr[NonEmptyString]
    var GroupName: js.UndefOr[NonEmptyString]
    var PeeringStatus: js.UndefOr[NonEmptyString]
    var UserId: js.UndefOr[NonEmptyString]
    var VpcId: js.UndefOr[NonEmptyString]
    var VpcPeeringConnectionId: js.UndefOr[NonEmptyString]
  }

  object AwsEc2SecurityGroupUserIdGroupPair {
    @inline
    def apply(
        GroupId: js.UndefOr[NonEmptyString] = js.undefined,
        GroupName: js.UndefOr[NonEmptyString] = js.undefined,
        PeeringStatus: js.UndefOr[NonEmptyString] = js.undefined,
        UserId: js.UndefOr[NonEmptyString] = js.undefined,
        VpcId: js.UndefOr[NonEmptyString] = js.undefined,
        VpcPeeringConnectionId: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEc2SecurityGroupUserIdGroupPair = {
      val __obj = js.Dynamic.literal()
      GroupId.foreach(__v => __obj.updateDynamic("GroupId")(__v.asInstanceOf[js.Any]))
      GroupName.foreach(__v => __obj.updateDynamic("GroupName")(__v.asInstanceOf[js.Any]))
      PeeringStatus.foreach(__v => __obj.updateDynamic("PeeringStatus")(__v.asInstanceOf[js.Any]))
      UserId.foreach(__v => __obj.updateDynamic("UserId")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      VpcPeeringConnectionId.foreach(__v => __obj.updateDynamic("VpcPeeringConnectionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEc2SecurityGroupUserIdGroupPair]
    }
  }

  /** Contains information about a subnet in Amazon EC2.
    */
  @js.native
  trait AwsEc2SubnetDetails extends js.Object {
    var AssignIpv6AddressOnCreation: js.UndefOr[Boolean]
    var AvailabilityZone: js.UndefOr[NonEmptyString]
    var AvailabilityZoneId: js.UndefOr[NonEmptyString]
    var AvailableIpAddressCount: js.UndefOr[Int]
    var CidrBlock: js.UndefOr[NonEmptyString]
    var DefaultForAz: js.UndefOr[Boolean]
    var Ipv6CidrBlockAssociationSet: js.UndefOr[Ipv6CidrBlockAssociationList]
    var MapPublicIpOnLaunch: js.UndefOr[Boolean]
    var OwnerId: js.UndefOr[NonEmptyString]
    var State: js.UndefOr[NonEmptyString]
    var SubnetArn: js.UndefOr[NonEmptyString]
    var SubnetId: js.UndefOr[NonEmptyString]
    var VpcId: js.UndefOr[NonEmptyString]
  }

  object AwsEc2SubnetDetails {
    @inline
    def apply(
        AssignIpv6AddressOnCreation: js.UndefOr[Boolean] = js.undefined,
        AvailabilityZone: js.UndefOr[NonEmptyString] = js.undefined,
        AvailabilityZoneId: js.UndefOr[NonEmptyString] = js.undefined,
        AvailableIpAddressCount: js.UndefOr[Int] = js.undefined,
        CidrBlock: js.UndefOr[NonEmptyString] = js.undefined,
        DefaultForAz: js.UndefOr[Boolean] = js.undefined,
        Ipv6CidrBlockAssociationSet: js.UndefOr[Ipv6CidrBlockAssociationList] = js.undefined,
        MapPublicIpOnLaunch: js.UndefOr[Boolean] = js.undefined,
        OwnerId: js.UndefOr[NonEmptyString] = js.undefined,
        State: js.UndefOr[NonEmptyString] = js.undefined,
        SubnetArn: js.UndefOr[NonEmptyString] = js.undefined,
        SubnetId: js.UndefOr[NonEmptyString] = js.undefined,
        VpcId: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEc2SubnetDetails = {
      val __obj = js.Dynamic.literal()
      AssignIpv6AddressOnCreation.foreach(__v => __obj.updateDynamic("AssignIpv6AddressOnCreation")(__v.asInstanceOf[js.Any]))
      AvailabilityZone.foreach(__v => __obj.updateDynamic("AvailabilityZone")(__v.asInstanceOf[js.Any]))
      AvailabilityZoneId.foreach(__v => __obj.updateDynamic("AvailabilityZoneId")(__v.asInstanceOf[js.Any]))
      AvailableIpAddressCount.foreach(__v => __obj.updateDynamic("AvailableIpAddressCount")(__v.asInstanceOf[js.Any]))
      CidrBlock.foreach(__v => __obj.updateDynamic("CidrBlock")(__v.asInstanceOf[js.Any]))
      DefaultForAz.foreach(__v => __obj.updateDynamic("DefaultForAz")(__v.asInstanceOf[js.Any]))
      Ipv6CidrBlockAssociationSet.foreach(__v => __obj.updateDynamic("Ipv6CidrBlockAssociationSet")(__v.asInstanceOf[js.Any]))
      MapPublicIpOnLaunch.foreach(__v => __obj.updateDynamic("MapPublicIpOnLaunch")(__v.asInstanceOf[js.Any]))
      OwnerId.foreach(__v => __obj.updateDynamic("OwnerId")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      SubnetArn.foreach(__v => __obj.updateDynamic("SubnetArn")(__v.asInstanceOf[js.Any]))
      SubnetId.foreach(__v => __obj.updateDynamic("SubnetId")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEc2SubnetDetails]
    }
  }

  /** Information about an Amazon Web Services Amazon EC2 Transit Gateway that interconnects virtual private clouds (VPCs) and on-premises networks.
    */
  @js.native
  trait AwsEc2TransitGatewayDetails extends js.Object {
    var AmazonSideAsn: js.UndefOr[Int]
    var AssociationDefaultRouteTableId: js.UndefOr[NonEmptyString]
    var AutoAcceptSharedAttachments: js.UndefOr[NonEmptyString]
    var DefaultRouteTableAssociation: js.UndefOr[NonEmptyString]
    var DefaultRouteTablePropagation: js.UndefOr[NonEmptyString]
    var Description: js.UndefOr[NonEmptyString]
    var DnsSupport: js.UndefOr[NonEmptyString]
    var Id: js.UndefOr[NonEmptyString]
    var MulticastSupport: js.UndefOr[NonEmptyString]
    var PropagationDefaultRouteTableId: js.UndefOr[NonEmptyString]
    var TransitGatewayCidrBlocks: js.UndefOr[NonEmptyStringList]
    var VpnEcmpSupport: js.UndefOr[NonEmptyString]
  }

  object AwsEc2TransitGatewayDetails {
    @inline
    def apply(
        AmazonSideAsn: js.UndefOr[Int] = js.undefined,
        AssociationDefaultRouteTableId: js.UndefOr[NonEmptyString] = js.undefined,
        AutoAcceptSharedAttachments: js.UndefOr[NonEmptyString] = js.undefined,
        DefaultRouteTableAssociation: js.UndefOr[NonEmptyString] = js.undefined,
        DefaultRouteTablePropagation: js.UndefOr[NonEmptyString] = js.undefined,
        Description: js.UndefOr[NonEmptyString] = js.undefined,
        DnsSupport: js.UndefOr[NonEmptyString] = js.undefined,
        Id: js.UndefOr[NonEmptyString] = js.undefined,
        MulticastSupport: js.UndefOr[NonEmptyString] = js.undefined,
        PropagationDefaultRouteTableId: js.UndefOr[NonEmptyString] = js.undefined,
        TransitGatewayCidrBlocks: js.UndefOr[NonEmptyStringList] = js.undefined,
        VpnEcmpSupport: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEc2TransitGatewayDetails = {
      val __obj = js.Dynamic.literal()
      AmazonSideAsn.foreach(__v => __obj.updateDynamic("AmazonSideAsn")(__v.asInstanceOf[js.Any]))
      AssociationDefaultRouteTableId.foreach(__v => __obj.updateDynamic("AssociationDefaultRouteTableId")(__v.asInstanceOf[js.Any]))
      AutoAcceptSharedAttachments.foreach(__v => __obj.updateDynamic("AutoAcceptSharedAttachments")(__v.asInstanceOf[js.Any]))
      DefaultRouteTableAssociation.foreach(__v => __obj.updateDynamic("DefaultRouteTableAssociation")(__v.asInstanceOf[js.Any]))
      DefaultRouteTablePropagation.foreach(__v => __obj.updateDynamic("DefaultRouteTablePropagation")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DnsSupport.foreach(__v => __obj.updateDynamic("DnsSupport")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      MulticastSupport.foreach(__v => __obj.updateDynamic("MulticastSupport")(__v.asInstanceOf[js.Any]))
      PropagationDefaultRouteTableId.foreach(__v => __obj.updateDynamic("PropagationDefaultRouteTableId")(__v.asInstanceOf[js.Any]))
      TransitGatewayCidrBlocks.foreach(__v => __obj.updateDynamic("TransitGatewayCidrBlocks")(__v.asInstanceOf[js.Any]))
      VpnEcmpSupport.foreach(__v => __obj.updateDynamic("VpnEcmpSupport")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEc2TransitGatewayDetails]
    }
  }

  /** An attachment to an Amazon EC2 volume.
    */
  @js.native
  trait AwsEc2VolumeAttachment extends js.Object {
    var AttachTime: js.UndefOr[NonEmptyString]
    var DeleteOnTermination: js.UndefOr[Boolean]
    var InstanceId: js.UndefOr[NonEmptyString]
    var Status: js.UndefOr[NonEmptyString]
  }

  object AwsEc2VolumeAttachment {
    @inline
    def apply(
        AttachTime: js.UndefOr[NonEmptyString] = js.undefined,
        DeleteOnTermination: js.UndefOr[Boolean] = js.undefined,
        InstanceId: js.UndefOr[NonEmptyString] = js.undefined,
        Status: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEc2VolumeAttachment = {
      val __obj = js.Dynamic.literal()
      AttachTime.foreach(__v => __obj.updateDynamic("AttachTime")(__v.asInstanceOf[js.Any]))
      DeleteOnTermination.foreach(__v => __obj.updateDynamic("DeleteOnTermination")(__v.asInstanceOf[js.Any]))
      InstanceId.foreach(__v => __obj.updateDynamic("InstanceId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEc2VolumeAttachment]
    }
  }

  /** Details about an EC2 volume.
    */
  @js.native
  trait AwsEc2VolumeDetails extends js.Object {
    var Attachments: js.UndefOr[AwsEc2VolumeAttachmentList]
    var CreateTime: js.UndefOr[NonEmptyString]
    var DeviceName: js.UndefOr[NonEmptyString]
    var Encrypted: js.UndefOr[Boolean]
    var KmsKeyId: js.UndefOr[NonEmptyString]
    var Size: js.UndefOr[Int]
    var SnapshotId: js.UndefOr[NonEmptyString]
    var Status: js.UndefOr[NonEmptyString]
    var VolumeId: js.UndefOr[NonEmptyString]
    var VolumeScanStatus: js.UndefOr[NonEmptyString]
    var VolumeType: js.UndefOr[NonEmptyString]
  }

  object AwsEc2VolumeDetails {
    @inline
    def apply(
        Attachments: js.UndefOr[AwsEc2VolumeAttachmentList] = js.undefined,
        CreateTime: js.UndefOr[NonEmptyString] = js.undefined,
        DeviceName: js.UndefOr[NonEmptyString] = js.undefined,
        Encrypted: js.UndefOr[Boolean] = js.undefined,
        KmsKeyId: js.UndefOr[NonEmptyString] = js.undefined,
        Size: js.UndefOr[Int] = js.undefined,
        SnapshotId: js.UndefOr[NonEmptyString] = js.undefined,
        Status: js.UndefOr[NonEmptyString] = js.undefined,
        VolumeId: js.UndefOr[NonEmptyString] = js.undefined,
        VolumeScanStatus: js.UndefOr[NonEmptyString] = js.undefined,
        VolumeType: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEc2VolumeDetails = {
      val __obj = js.Dynamic.literal()
      Attachments.foreach(__v => __obj.updateDynamic("Attachments")(__v.asInstanceOf[js.Any]))
      CreateTime.foreach(__v => __obj.updateDynamic("CreateTime")(__v.asInstanceOf[js.Any]))
      DeviceName.foreach(__v => __obj.updateDynamic("DeviceName")(__v.asInstanceOf[js.Any]))
      Encrypted.foreach(__v => __obj.updateDynamic("Encrypted")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      Size.foreach(__v => __obj.updateDynamic("Size")(__v.asInstanceOf[js.Any]))
      SnapshotId.foreach(__v => __obj.updateDynamic("SnapshotId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      VolumeId.foreach(__v => __obj.updateDynamic("VolumeId")(__v.asInstanceOf[js.Any]))
      VolumeScanStatus.foreach(__v => __obj.updateDynamic("VolumeScanStatus")(__v.asInstanceOf[js.Any]))
      VolumeType.foreach(__v => __obj.updateDynamic("VolumeType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEc2VolumeDetails]
    }
  }

  /** Details about an EC2 VPC.
    */
  @js.native
  trait AwsEc2VpcDetails extends js.Object {
    var CidrBlockAssociationSet: js.UndefOr[CidrBlockAssociationList]
    var DhcpOptionsId: js.UndefOr[NonEmptyString]
    var Ipv6CidrBlockAssociationSet: js.UndefOr[Ipv6CidrBlockAssociationList]
    var State: js.UndefOr[NonEmptyString]
  }

  object AwsEc2VpcDetails {
    @inline
    def apply(
        CidrBlockAssociationSet: js.UndefOr[CidrBlockAssociationList] = js.undefined,
        DhcpOptionsId: js.UndefOr[NonEmptyString] = js.undefined,
        Ipv6CidrBlockAssociationSet: js.UndefOr[Ipv6CidrBlockAssociationList] = js.undefined,
        State: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEc2VpcDetails = {
      val __obj = js.Dynamic.literal()
      CidrBlockAssociationSet.foreach(__v => __obj.updateDynamic("CidrBlockAssociationSet")(__v.asInstanceOf[js.Any]))
      DhcpOptionsId.foreach(__v => __obj.updateDynamic("DhcpOptionsId")(__v.asInstanceOf[js.Any]))
      Ipv6CidrBlockAssociationSet.foreach(__v => __obj.updateDynamic("Ipv6CidrBlockAssociationSet")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEc2VpcDetails]
    }
  }

  /** Contains details about the service configuration for a VPC endpoint service.
    */
  @js.native
  trait AwsEc2VpcEndpointServiceDetails extends js.Object {
    var AcceptanceRequired: js.UndefOr[Boolean]
    var AvailabilityZones: js.UndefOr[NonEmptyStringList]
    var BaseEndpointDnsNames: js.UndefOr[NonEmptyStringList]
    var GatewayLoadBalancerArns: js.UndefOr[NonEmptyStringList]
    var ManagesVpcEndpoints: js.UndefOr[Boolean]
    var NetworkLoadBalancerArns: js.UndefOr[NonEmptyStringList]
    var PrivateDnsName: js.UndefOr[NonEmptyString]
    var ServiceId: js.UndefOr[NonEmptyString]
    var ServiceName: js.UndefOr[NonEmptyString]
    var ServiceState: js.UndefOr[NonEmptyString]
    var ServiceType: js.UndefOr[AwsEc2VpcEndpointServiceServiceTypeList]
  }

  object AwsEc2VpcEndpointServiceDetails {
    @inline
    def apply(
        AcceptanceRequired: js.UndefOr[Boolean] = js.undefined,
        AvailabilityZones: js.UndefOr[NonEmptyStringList] = js.undefined,
        BaseEndpointDnsNames: js.UndefOr[NonEmptyStringList] = js.undefined,
        GatewayLoadBalancerArns: js.UndefOr[NonEmptyStringList] = js.undefined,
        ManagesVpcEndpoints: js.UndefOr[Boolean] = js.undefined,
        NetworkLoadBalancerArns: js.UndefOr[NonEmptyStringList] = js.undefined,
        PrivateDnsName: js.UndefOr[NonEmptyString] = js.undefined,
        ServiceId: js.UndefOr[NonEmptyString] = js.undefined,
        ServiceName: js.UndefOr[NonEmptyString] = js.undefined,
        ServiceState: js.UndefOr[NonEmptyString] = js.undefined,
        ServiceType: js.UndefOr[AwsEc2VpcEndpointServiceServiceTypeList] = js.undefined
    ): AwsEc2VpcEndpointServiceDetails = {
      val __obj = js.Dynamic.literal()
      AcceptanceRequired.foreach(__v => __obj.updateDynamic("AcceptanceRequired")(__v.asInstanceOf[js.Any]))
      AvailabilityZones.foreach(__v => __obj.updateDynamic("AvailabilityZones")(__v.asInstanceOf[js.Any]))
      BaseEndpointDnsNames.foreach(__v => __obj.updateDynamic("BaseEndpointDnsNames")(__v.asInstanceOf[js.Any]))
      GatewayLoadBalancerArns.foreach(__v => __obj.updateDynamic("GatewayLoadBalancerArns")(__v.asInstanceOf[js.Any]))
      ManagesVpcEndpoints.foreach(__v => __obj.updateDynamic("ManagesVpcEndpoints")(__v.asInstanceOf[js.Any]))
      NetworkLoadBalancerArns.foreach(__v => __obj.updateDynamic("NetworkLoadBalancerArns")(__v.asInstanceOf[js.Any]))
      PrivateDnsName.foreach(__v => __obj.updateDynamic("PrivateDnsName")(__v.asInstanceOf[js.Any]))
      ServiceId.foreach(__v => __obj.updateDynamic("ServiceId")(__v.asInstanceOf[js.Any]))
      ServiceName.foreach(__v => __obj.updateDynamic("ServiceName")(__v.asInstanceOf[js.Any]))
      ServiceState.foreach(__v => __obj.updateDynamic("ServiceState")(__v.asInstanceOf[js.Any]))
      ServiceType.foreach(__v => __obj.updateDynamic("ServiceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEc2VpcEndpointServiceDetails]
    }
  }

  /** The service type information for a VPC endpoint service.
    */
  @js.native
  trait AwsEc2VpcEndpointServiceServiceTypeDetails extends js.Object {
    var ServiceType: js.UndefOr[NonEmptyString]
  }

  object AwsEc2VpcEndpointServiceServiceTypeDetails {
    @inline
    def apply(
        ServiceType: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEc2VpcEndpointServiceServiceTypeDetails = {
      val __obj = js.Dynamic.literal()
      ServiceType.foreach(__v => __obj.updateDynamic("ServiceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEc2VpcEndpointServiceServiceTypeDetails]
    }
  }

  /** Provides information about a VPC peering connection between two VPCs: a requester VPC that you own and an accepter VPC with which to create the connection.
    */
  @js.native
  trait AwsEc2VpcPeeringConnectionDetails extends js.Object {
    var AccepterVpcInfo: js.UndefOr[AwsEc2VpcPeeringConnectionVpcInfoDetails]
    var ExpirationTime: js.UndefOr[NonEmptyString]
    var RequesterVpcInfo: js.UndefOr[AwsEc2VpcPeeringConnectionVpcInfoDetails]
    var Status: js.UndefOr[AwsEc2VpcPeeringConnectionStatusDetails]
    var VpcPeeringConnectionId: js.UndefOr[NonEmptyString]
  }

  object AwsEc2VpcPeeringConnectionDetails {
    @inline
    def apply(
        AccepterVpcInfo: js.UndefOr[AwsEc2VpcPeeringConnectionVpcInfoDetails] = js.undefined,
        ExpirationTime: js.UndefOr[NonEmptyString] = js.undefined,
        RequesterVpcInfo: js.UndefOr[AwsEc2VpcPeeringConnectionVpcInfoDetails] = js.undefined,
        Status: js.UndefOr[AwsEc2VpcPeeringConnectionStatusDetails] = js.undefined,
        VpcPeeringConnectionId: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEc2VpcPeeringConnectionDetails = {
      val __obj = js.Dynamic.literal()
      AccepterVpcInfo.foreach(__v => __obj.updateDynamic("AccepterVpcInfo")(__v.asInstanceOf[js.Any]))
      ExpirationTime.foreach(__v => __obj.updateDynamic("ExpirationTime")(__v.asInstanceOf[js.Any]))
      RequesterVpcInfo.foreach(__v => __obj.updateDynamic("RequesterVpcInfo")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      VpcPeeringConnectionId.foreach(__v => __obj.updateDynamic("VpcPeeringConnectionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEc2VpcPeeringConnectionDetails]
    }
  }

  /** Details about the status of the VPC peering connection.
    */
  @js.native
  trait AwsEc2VpcPeeringConnectionStatusDetails extends js.Object {
    var Code: js.UndefOr[NonEmptyString]
    var Message: js.UndefOr[NonEmptyString]
  }

  object AwsEc2VpcPeeringConnectionStatusDetails {
    @inline
    def apply(
        Code: js.UndefOr[NonEmptyString] = js.undefined,
        Message: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEc2VpcPeeringConnectionStatusDetails = {
      val __obj = js.Dynamic.literal()
      Code.foreach(__v => __obj.updateDynamic("Code")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEc2VpcPeeringConnectionStatusDetails]
    }
  }

  /** Describes a VPC in a VPC peering connection.
    */
  @js.native
  trait AwsEc2VpcPeeringConnectionVpcInfoDetails extends js.Object {
    var CidrBlock: js.UndefOr[NonEmptyString]
    var CidrBlockSet: js.UndefOr[VpcInfoCidrBlockSetList]
    var Ipv6CidrBlockSet: js.UndefOr[VpcInfoIpv6CidrBlockSetList]
    var OwnerId: js.UndefOr[NonEmptyString]
    var PeeringOptions: js.UndefOr[VpcInfoPeeringOptionsDetails]
    var Region: js.UndefOr[NonEmptyString]
    var VpcId: js.UndefOr[NonEmptyString]
  }

  object AwsEc2VpcPeeringConnectionVpcInfoDetails {
    @inline
    def apply(
        CidrBlock: js.UndefOr[NonEmptyString] = js.undefined,
        CidrBlockSet: js.UndefOr[VpcInfoCidrBlockSetList] = js.undefined,
        Ipv6CidrBlockSet: js.UndefOr[VpcInfoIpv6CidrBlockSetList] = js.undefined,
        OwnerId: js.UndefOr[NonEmptyString] = js.undefined,
        PeeringOptions: js.UndefOr[VpcInfoPeeringOptionsDetails] = js.undefined,
        Region: js.UndefOr[NonEmptyString] = js.undefined,
        VpcId: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEc2VpcPeeringConnectionVpcInfoDetails = {
      val __obj = js.Dynamic.literal()
      CidrBlock.foreach(__v => __obj.updateDynamic("CidrBlock")(__v.asInstanceOf[js.Any]))
      CidrBlockSet.foreach(__v => __obj.updateDynamic("CidrBlockSet")(__v.asInstanceOf[js.Any]))
      Ipv6CidrBlockSet.foreach(__v => __obj.updateDynamic("Ipv6CidrBlockSet")(__v.asInstanceOf[js.Any]))
      OwnerId.foreach(__v => __obj.updateDynamic("OwnerId")(__v.asInstanceOf[js.Any]))
      PeeringOptions.foreach(__v => __obj.updateDynamic("PeeringOptions")(__v.asInstanceOf[js.Any]))
      Region.foreach(__v => __obj.updateDynamic("Region")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEc2VpcPeeringConnectionVpcInfoDetails]
    }
  }

  /** Details about an Amazon EC2 VPN connection.
    */
  @js.native
  trait AwsEc2VpnConnectionDetails extends js.Object {
    var Category: js.UndefOr[NonEmptyString]
    var CustomerGatewayConfiguration: js.UndefOr[NonEmptyString]
    var CustomerGatewayId: js.UndefOr[NonEmptyString]
    var Options: js.UndefOr[AwsEc2VpnConnectionOptionsDetails]
    var Routes: js.UndefOr[AwsEc2VpnConnectionRoutesList]
    var State: js.UndefOr[NonEmptyString]
    var TransitGatewayId: js.UndefOr[NonEmptyString]
    var Type: js.UndefOr[NonEmptyString]
    var VgwTelemetry: js.UndefOr[AwsEc2VpnConnectionVgwTelemetryList]
    var VpnConnectionId: js.UndefOr[NonEmptyString]
    var VpnGatewayId: js.UndefOr[NonEmptyString]
  }

  object AwsEc2VpnConnectionDetails {
    @inline
    def apply(
        Category: js.UndefOr[NonEmptyString] = js.undefined,
        CustomerGatewayConfiguration: js.UndefOr[NonEmptyString] = js.undefined,
        CustomerGatewayId: js.UndefOr[NonEmptyString] = js.undefined,
        Options: js.UndefOr[AwsEc2VpnConnectionOptionsDetails] = js.undefined,
        Routes: js.UndefOr[AwsEc2VpnConnectionRoutesList] = js.undefined,
        State: js.UndefOr[NonEmptyString] = js.undefined,
        TransitGatewayId: js.UndefOr[NonEmptyString] = js.undefined,
        Type: js.UndefOr[NonEmptyString] = js.undefined,
        VgwTelemetry: js.UndefOr[AwsEc2VpnConnectionVgwTelemetryList] = js.undefined,
        VpnConnectionId: js.UndefOr[NonEmptyString] = js.undefined,
        VpnGatewayId: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEc2VpnConnectionDetails = {
      val __obj = js.Dynamic.literal()
      Category.foreach(__v => __obj.updateDynamic("Category")(__v.asInstanceOf[js.Any]))
      CustomerGatewayConfiguration.foreach(__v => __obj.updateDynamic("CustomerGatewayConfiguration")(__v.asInstanceOf[js.Any]))
      CustomerGatewayId.foreach(__v => __obj.updateDynamic("CustomerGatewayId")(__v.asInstanceOf[js.Any]))
      Options.foreach(__v => __obj.updateDynamic("Options")(__v.asInstanceOf[js.Any]))
      Routes.foreach(__v => __obj.updateDynamic("Routes")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      TransitGatewayId.foreach(__v => __obj.updateDynamic("TransitGatewayId")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      VgwTelemetry.foreach(__v => __obj.updateDynamic("VgwTelemetry")(__v.asInstanceOf[js.Any]))
      VpnConnectionId.foreach(__v => __obj.updateDynamic("VpnConnectionId")(__v.asInstanceOf[js.Any]))
      VpnGatewayId.foreach(__v => __obj.updateDynamic("VpnGatewayId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEc2VpnConnectionDetails]
    }
  }

  /** VPN connection options.
    */
  @js.native
  trait AwsEc2VpnConnectionOptionsDetails extends js.Object {
    var StaticRoutesOnly: js.UndefOr[Boolean]
    var TunnelOptions: js.UndefOr[AwsEc2VpnConnectionOptionsTunnelOptionsList]
  }

  object AwsEc2VpnConnectionOptionsDetails {
    @inline
    def apply(
        StaticRoutesOnly: js.UndefOr[Boolean] = js.undefined,
        TunnelOptions: js.UndefOr[AwsEc2VpnConnectionOptionsTunnelOptionsList] = js.undefined
    ): AwsEc2VpnConnectionOptionsDetails = {
      val __obj = js.Dynamic.literal()
      StaticRoutesOnly.foreach(__v => __obj.updateDynamic("StaticRoutesOnly")(__v.asInstanceOf[js.Any]))
      TunnelOptions.foreach(__v => __obj.updateDynamic("TunnelOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEc2VpnConnectionOptionsDetails]
    }
  }

  /** The VPN tunnel options.
    */
  @js.native
  trait AwsEc2VpnConnectionOptionsTunnelOptionsDetails extends js.Object {
    var DpdTimeoutSeconds: js.UndefOr[Int]
    var IkeVersions: js.UndefOr[NonEmptyStringList]
    var OutsideIpAddress: js.UndefOr[NonEmptyString]
    var Phase1DhGroupNumbers: js.UndefOr[IntegerList]
    var Phase1EncryptionAlgorithms: js.UndefOr[NonEmptyStringList]
    var Phase1IntegrityAlgorithms: js.UndefOr[NonEmptyStringList]
    var Phase1LifetimeSeconds: js.UndefOr[Int]
    var Phase2DhGroupNumbers: js.UndefOr[IntegerList]
    var Phase2EncryptionAlgorithms: js.UndefOr[NonEmptyStringList]
    var Phase2IntegrityAlgorithms: js.UndefOr[NonEmptyStringList]
    var Phase2LifetimeSeconds: js.UndefOr[Int]
    var PreSharedKey: js.UndefOr[NonEmptyString]
    var RekeyFuzzPercentage: js.UndefOr[Int]
    var RekeyMarginTimeSeconds: js.UndefOr[Int]
    var ReplayWindowSize: js.UndefOr[Int]
    var TunnelInsideCidr: js.UndefOr[NonEmptyString]
  }

  object AwsEc2VpnConnectionOptionsTunnelOptionsDetails {
    @inline
    def apply(
        DpdTimeoutSeconds: js.UndefOr[Int] = js.undefined,
        IkeVersions: js.UndefOr[NonEmptyStringList] = js.undefined,
        OutsideIpAddress: js.UndefOr[NonEmptyString] = js.undefined,
        Phase1DhGroupNumbers: js.UndefOr[IntegerList] = js.undefined,
        Phase1EncryptionAlgorithms: js.UndefOr[NonEmptyStringList] = js.undefined,
        Phase1IntegrityAlgorithms: js.UndefOr[NonEmptyStringList] = js.undefined,
        Phase1LifetimeSeconds: js.UndefOr[Int] = js.undefined,
        Phase2DhGroupNumbers: js.UndefOr[IntegerList] = js.undefined,
        Phase2EncryptionAlgorithms: js.UndefOr[NonEmptyStringList] = js.undefined,
        Phase2IntegrityAlgorithms: js.UndefOr[NonEmptyStringList] = js.undefined,
        Phase2LifetimeSeconds: js.UndefOr[Int] = js.undefined,
        PreSharedKey: js.UndefOr[NonEmptyString] = js.undefined,
        RekeyFuzzPercentage: js.UndefOr[Int] = js.undefined,
        RekeyMarginTimeSeconds: js.UndefOr[Int] = js.undefined,
        ReplayWindowSize: js.UndefOr[Int] = js.undefined,
        TunnelInsideCidr: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEc2VpnConnectionOptionsTunnelOptionsDetails = {
      val __obj = js.Dynamic.literal()
      DpdTimeoutSeconds.foreach(__v => __obj.updateDynamic("DpdTimeoutSeconds")(__v.asInstanceOf[js.Any]))
      IkeVersions.foreach(__v => __obj.updateDynamic("IkeVersions")(__v.asInstanceOf[js.Any]))
      OutsideIpAddress.foreach(__v => __obj.updateDynamic("OutsideIpAddress")(__v.asInstanceOf[js.Any]))
      Phase1DhGroupNumbers.foreach(__v => __obj.updateDynamic("Phase1DhGroupNumbers")(__v.asInstanceOf[js.Any]))
      Phase1EncryptionAlgorithms.foreach(__v => __obj.updateDynamic("Phase1EncryptionAlgorithms")(__v.asInstanceOf[js.Any]))
      Phase1IntegrityAlgorithms.foreach(__v => __obj.updateDynamic("Phase1IntegrityAlgorithms")(__v.asInstanceOf[js.Any]))
      Phase1LifetimeSeconds.foreach(__v => __obj.updateDynamic("Phase1LifetimeSeconds")(__v.asInstanceOf[js.Any]))
      Phase2DhGroupNumbers.foreach(__v => __obj.updateDynamic("Phase2DhGroupNumbers")(__v.asInstanceOf[js.Any]))
      Phase2EncryptionAlgorithms.foreach(__v => __obj.updateDynamic("Phase2EncryptionAlgorithms")(__v.asInstanceOf[js.Any]))
      Phase2IntegrityAlgorithms.foreach(__v => __obj.updateDynamic("Phase2IntegrityAlgorithms")(__v.asInstanceOf[js.Any]))
      Phase2LifetimeSeconds.foreach(__v => __obj.updateDynamic("Phase2LifetimeSeconds")(__v.asInstanceOf[js.Any]))
      PreSharedKey.foreach(__v => __obj.updateDynamic("PreSharedKey")(__v.asInstanceOf[js.Any]))
      RekeyFuzzPercentage.foreach(__v => __obj.updateDynamic("RekeyFuzzPercentage")(__v.asInstanceOf[js.Any]))
      RekeyMarginTimeSeconds.foreach(__v => __obj.updateDynamic("RekeyMarginTimeSeconds")(__v.asInstanceOf[js.Any]))
      ReplayWindowSize.foreach(__v => __obj.updateDynamic("ReplayWindowSize")(__v.asInstanceOf[js.Any]))
      TunnelInsideCidr.foreach(__v => __obj.updateDynamic("TunnelInsideCidr")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEc2VpnConnectionOptionsTunnelOptionsDetails]
    }
  }

  /** A static routes associated with the VPN connection.
    */
  @js.native
  trait AwsEc2VpnConnectionRoutesDetails extends js.Object {
    var DestinationCidrBlock: js.UndefOr[NonEmptyString]
    var State: js.UndefOr[NonEmptyString]
  }

  object AwsEc2VpnConnectionRoutesDetails {
    @inline
    def apply(
        DestinationCidrBlock: js.UndefOr[NonEmptyString] = js.undefined,
        State: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEc2VpnConnectionRoutesDetails = {
      val __obj = js.Dynamic.literal()
      DestinationCidrBlock.foreach(__v => __obj.updateDynamic("DestinationCidrBlock")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEc2VpnConnectionRoutesDetails]
    }
  }

  /** Information about the VPN tunnel.
    */
  @js.native
  trait AwsEc2VpnConnectionVgwTelemetryDetails extends js.Object {
    var AcceptedRouteCount: js.UndefOr[Int]
    var CertificateArn: js.UndefOr[NonEmptyString]
    var LastStatusChange: js.UndefOr[NonEmptyString]
    var OutsideIpAddress: js.UndefOr[NonEmptyString]
    var Status: js.UndefOr[NonEmptyString]
    var StatusMessage: js.UndefOr[NonEmptyString]
  }

  object AwsEc2VpnConnectionVgwTelemetryDetails {
    @inline
    def apply(
        AcceptedRouteCount: js.UndefOr[Int] = js.undefined,
        CertificateArn: js.UndefOr[NonEmptyString] = js.undefined,
        LastStatusChange: js.UndefOr[NonEmptyString] = js.undefined,
        OutsideIpAddress: js.UndefOr[NonEmptyString] = js.undefined,
        Status: js.UndefOr[NonEmptyString] = js.undefined,
        StatusMessage: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEc2VpnConnectionVgwTelemetryDetails = {
      val __obj = js.Dynamic.literal()
      AcceptedRouteCount.foreach(__v => __obj.updateDynamic("AcceptedRouteCount")(__v.asInstanceOf[js.Any]))
      CertificateArn.foreach(__v => __obj.updateDynamic("CertificateArn")(__v.asInstanceOf[js.Any]))
      LastStatusChange.foreach(__v => __obj.updateDynamic("LastStatusChange")(__v.asInstanceOf[js.Any]))
      OutsideIpAddress.foreach(__v => __obj.updateDynamic("OutsideIpAddress")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusMessage.foreach(__v => __obj.updateDynamic("StatusMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEc2VpnConnectionVgwTelemetryDetails]
    }
  }

  /** Information about an Amazon ECR image.
    */
  @js.native
  trait AwsEcrContainerImageDetails extends js.Object {
    var Architecture: js.UndefOr[NonEmptyString]
    var ImageDigest: js.UndefOr[NonEmptyString]
    var ImagePublishedAt: js.UndefOr[NonEmptyString]
    var ImageTags: js.UndefOr[NonEmptyStringList]
    var RegistryId: js.UndefOr[NonEmptyString]
    var RepositoryName: js.UndefOr[NonEmptyString]
  }

  object AwsEcrContainerImageDetails {
    @inline
    def apply(
        Architecture: js.UndefOr[NonEmptyString] = js.undefined,
        ImageDigest: js.UndefOr[NonEmptyString] = js.undefined,
        ImagePublishedAt: js.UndefOr[NonEmptyString] = js.undefined,
        ImageTags: js.UndefOr[NonEmptyStringList] = js.undefined,
        RegistryId: js.UndefOr[NonEmptyString] = js.undefined,
        RepositoryName: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEcrContainerImageDetails = {
      val __obj = js.Dynamic.literal()
      Architecture.foreach(__v => __obj.updateDynamic("Architecture")(__v.asInstanceOf[js.Any]))
      ImageDigest.foreach(__v => __obj.updateDynamic("ImageDigest")(__v.asInstanceOf[js.Any]))
      ImagePublishedAt.foreach(__v => __obj.updateDynamic("ImagePublishedAt")(__v.asInstanceOf[js.Any]))
      ImageTags.foreach(__v => __obj.updateDynamic("ImageTags")(__v.asInstanceOf[js.Any]))
      RegistryId.foreach(__v => __obj.updateDynamic("RegistryId")(__v.asInstanceOf[js.Any]))
      RepositoryName.foreach(__v => __obj.updateDynamic("RepositoryName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEcrContainerImageDetails]
    }
  }

  /** Provides information about an Amazon Elastic Container Registry repository.
    */
  @js.native
  trait AwsEcrRepositoryDetails extends js.Object {
    var Arn: js.UndefOr[NonEmptyString]
    var ImageScanningConfiguration: js.UndefOr[AwsEcrRepositoryImageScanningConfigurationDetails]
    var ImageTagMutability: js.UndefOr[NonEmptyString]
    var LifecyclePolicy: js.UndefOr[AwsEcrRepositoryLifecyclePolicyDetails]
    var RepositoryName: js.UndefOr[NonEmptyString]
    var RepositoryPolicyText: js.UndefOr[NonEmptyString]
  }

  object AwsEcrRepositoryDetails {
    @inline
    def apply(
        Arn: js.UndefOr[NonEmptyString] = js.undefined,
        ImageScanningConfiguration: js.UndefOr[AwsEcrRepositoryImageScanningConfigurationDetails] = js.undefined,
        ImageTagMutability: js.UndefOr[NonEmptyString] = js.undefined,
        LifecyclePolicy: js.UndefOr[AwsEcrRepositoryLifecyclePolicyDetails] = js.undefined,
        RepositoryName: js.UndefOr[NonEmptyString] = js.undefined,
        RepositoryPolicyText: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEcrRepositoryDetails = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      ImageScanningConfiguration.foreach(__v => __obj.updateDynamic("ImageScanningConfiguration")(__v.asInstanceOf[js.Any]))
      ImageTagMutability.foreach(__v => __obj.updateDynamic("ImageTagMutability")(__v.asInstanceOf[js.Any]))
      LifecyclePolicy.foreach(__v => __obj.updateDynamic("LifecyclePolicy")(__v.asInstanceOf[js.Any]))
      RepositoryName.foreach(__v => __obj.updateDynamic("RepositoryName")(__v.asInstanceOf[js.Any]))
      RepositoryPolicyText.foreach(__v => __obj.updateDynamic("RepositoryPolicyText")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEcrRepositoryDetails]
    }
  }

  /** The image scanning configuration for a repository.
    */
  @js.native
  trait AwsEcrRepositoryImageScanningConfigurationDetails extends js.Object {
    var ScanOnPush: js.UndefOr[Boolean]
  }

  object AwsEcrRepositoryImageScanningConfigurationDetails {
    @inline
    def apply(
        ScanOnPush: js.UndefOr[Boolean] = js.undefined
    ): AwsEcrRepositoryImageScanningConfigurationDetails = {
      val __obj = js.Dynamic.literal()
      ScanOnPush.foreach(__v => __obj.updateDynamic("ScanOnPush")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEcrRepositoryImageScanningConfigurationDetails]
    }
  }

  /** Information about the lifecycle policy for the repository.
    */
  @js.native
  trait AwsEcrRepositoryLifecyclePolicyDetails extends js.Object {
    var LifecyclePolicyText: js.UndefOr[NonEmptyString]
    var RegistryId: js.UndefOr[NonEmptyString]
  }

  object AwsEcrRepositoryLifecyclePolicyDetails {
    @inline
    def apply(
        LifecyclePolicyText: js.UndefOr[NonEmptyString] = js.undefined,
        RegistryId: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEcrRepositoryLifecyclePolicyDetails = {
      val __obj = js.Dynamic.literal()
      LifecyclePolicyText.foreach(__v => __obj.updateDynamic("LifecyclePolicyText")(__v.asInstanceOf[js.Any]))
      RegistryId.foreach(__v => __obj.updateDynamic("RegistryId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEcrRepositoryLifecyclePolicyDetails]
    }
  }

  /** Indicates whether to enable CloudWatch Container Insights for the ECS cluster.
    */
  @js.native
  trait AwsEcsClusterClusterSettingsDetails extends js.Object {
    var Name: js.UndefOr[NonEmptyString]
    var Value: js.UndefOr[NonEmptyString]
  }

  object AwsEcsClusterClusterSettingsDetails {
    @inline
    def apply(
        Name: js.UndefOr[NonEmptyString] = js.undefined,
        Value: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEcsClusterClusterSettingsDetails = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEcsClusterClusterSettingsDetails]
    }
  }

  /** The run command configuration for the cluster.
    */
  @js.native
  trait AwsEcsClusterConfigurationDetails extends js.Object {
    var ExecuteCommandConfiguration: js.UndefOr[AwsEcsClusterConfigurationExecuteCommandConfigurationDetails]
  }

  object AwsEcsClusterConfigurationDetails {
    @inline
    def apply(
        ExecuteCommandConfiguration: js.UndefOr[AwsEcsClusterConfigurationExecuteCommandConfigurationDetails] = js.undefined
    ): AwsEcsClusterConfigurationDetails = {
      val __obj = js.Dynamic.literal()
      ExecuteCommandConfiguration.foreach(__v => __obj.updateDynamic("ExecuteCommandConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEcsClusterConfigurationDetails]
    }
  }

  /** Contains the run command configuration for the cluster.
    */
  @js.native
  trait AwsEcsClusterConfigurationExecuteCommandConfigurationDetails extends js.Object {
    var KmsKeyId: js.UndefOr[NonEmptyString]
    var LogConfiguration: js.UndefOr[AwsEcsClusterConfigurationExecuteCommandConfigurationLogConfigurationDetails]
    var Logging: js.UndefOr[NonEmptyString]
  }

  object AwsEcsClusterConfigurationExecuteCommandConfigurationDetails {
    @inline
    def apply(
        KmsKeyId: js.UndefOr[NonEmptyString] = js.undefined,
        LogConfiguration: js.UndefOr[AwsEcsClusterConfigurationExecuteCommandConfigurationLogConfigurationDetails] = js.undefined,
        Logging: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEcsClusterConfigurationExecuteCommandConfigurationDetails = {
      val __obj = js.Dynamic.literal()
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      LogConfiguration.foreach(__v => __obj.updateDynamic("LogConfiguration")(__v.asInstanceOf[js.Any]))
      Logging.foreach(__v => __obj.updateDynamic("Logging")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEcsClusterConfigurationExecuteCommandConfigurationDetails]
    }
  }

  /** The log configuration for the results of the run command actions.
    */
  @js.native
  trait AwsEcsClusterConfigurationExecuteCommandConfigurationLogConfigurationDetails extends js.Object {
    var CloudWatchEncryptionEnabled: js.UndefOr[Boolean]
    var CloudWatchLogGroupName: js.UndefOr[NonEmptyString]
    var S3BucketName: js.UndefOr[NonEmptyString]
    var S3EncryptionEnabled: js.UndefOr[Boolean]
    var S3KeyPrefix: js.UndefOr[NonEmptyString]
  }

  object AwsEcsClusterConfigurationExecuteCommandConfigurationLogConfigurationDetails {
    @inline
    def apply(
        CloudWatchEncryptionEnabled: js.UndefOr[Boolean] = js.undefined,
        CloudWatchLogGroupName: js.UndefOr[NonEmptyString] = js.undefined,
        S3BucketName: js.UndefOr[NonEmptyString] = js.undefined,
        S3EncryptionEnabled: js.UndefOr[Boolean] = js.undefined,
        S3KeyPrefix: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEcsClusterConfigurationExecuteCommandConfigurationLogConfigurationDetails = {
      val __obj = js.Dynamic.literal()
      CloudWatchEncryptionEnabled.foreach(__v => __obj.updateDynamic("CloudWatchEncryptionEnabled")(__v.asInstanceOf[js.Any]))
      CloudWatchLogGroupName.foreach(__v => __obj.updateDynamic("CloudWatchLogGroupName")(__v.asInstanceOf[js.Any]))
      S3BucketName.foreach(__v => __obj.updateDynamic("S3BucketName")(__v.asInstanceOf[js.Any]))
      S3EncryptionEnabled.foreach(__v => __obj.updateDynamic("S3EncryptionEnabled")(__v.asInstanceOf[js.Any]))
      S3KeyPrefix.foreach(__v => __obj.updateDynamic("S3KeyPrefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEcsClusterConfigurationExecuteCommandConfigurationLogConfigurationDetails]
    }
  }

  /** The default capacity provider strategy for the cluster. The default capacity provider strategy is used when services or tasks are run without a specified launch type or capacity provider strategy.
    */
  @js.native
  trait AwsEcsClusterDefaultCapacityProviderStrategyDetails extends js.Object {
    var Base: js.UndefOr[Int]
    var CapacityProvider: js.UndefOr[NonEmptyString]
    var Weight: js.UndefOr[Int]
  }

  object AwsEcsClusterDefaultCapacityProviderStrategyDetails {
    @inline
    def apply(
        Base: js.UndefOr[Int] = js.undefined,
        CapacityProvider: js.UndefOr[NonEmptyString] = js.undefined,
        Weight: js.UndefOr[Int] = js.undefined
    ): AwsEcsClusterDefaultCapacityProviderStrategyDetails = {
      val __obj = js.Dynamic.literal()
      Base.foreach(__v => __obj.updateDynamic("Base")(__v.asInstanceOf[js.Any]))
      CapacityProvider.foreach(__v => __obj.updateDynamic("CapacityProvider")(__v.asInstanceOf[js.Any]))
      Weight.foreach(__v => __obj.updateDynamic("Weight")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEcsClusterDefaultCapacityProviderStrategyDetails]
    }
  }

  /** Provides details about an Amazon ECS cluster.
    */
  @js.native
  trait AwsEcsClusterDetails extends js.Object {
    var ActiveServicesCount: js.UndefOr[Int]
    var CapacityProviders: js.UndefOr[NonEmptyStringList]
    var ClusterArn: js.UndefOr[NonEmptyString]
    var ClusterName: js.UndefOr[NonEmptyString]
    var ClusterSettings: js.UndefOr[AwsEcsClusterClusterSettingsList]
    var Configuration: js.UndefOr[AwsEcsClusterConfigurationDetails]
    var DefaultCapacityProviderStrategy: js.UndefOr[AwsEcsClusterDefaultCapacityProviderStrategyList]
    var RegisteredContainerInstancesCount: js.UndefOr[Int]
    var RunningTasksCount: js.UndefOr[Int]
    var Status: js.UndefOr[NonEmptyString]
  }

  object AwsEcsClusterDetails {
    @inline
    def apply(
        ActiveServicesCount: js.UndefOr[Int] = js.undefined,
        CapacityProviders: js.UndefOr[NonEmptyStringList] = js.undefined,
        ClusterArn: js.UndefOr[NonEmptyString] = js.undefined,
        ClusterName: js.UndefOr[NonEmptyString] = js.undefined,
        ClusterSettings: js.UndefOr[AwsEcsClusterClusterSettingsList] = js.undefined,
        Configuration: js.UndefOr[AwsEcsClusterConfigurationDetails] = js.undefined,
        DefaultCapacityProviderStrategy: js.UndefOr[AwsEcsClusterDefaultCapacityProviderStrategyList] = js.undefined,
        RegisteredContainerInstancesCount: js.UndefOr[Int] = js.undefined,
        RunningTasksCount: js.UndefOr[Int] = js.undefined,
        Status: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEcsClusterDetails = {
      val __obj = js.Dynamic.literal()
      ActiveServicesCount.foreach(__v => __obj.updateDynamic("ActiveServicesCount")(__v.asInstanceOf[js.Any]))
      CapacityProviders.foreach(__v => __obj.updateDynamic("CapacityProviders")(__v.asInstanceOf[js.Any]))
      ClusterArn.foreach(__v => __obj.updateDynamic("ClusterArn")(__v.asInstanceOf[js.Any]))
      ClusterName.foreach(__v => __obj.updateDynamic("ClusterName")(__v.asInstanceOf[js.Any]))
      ClusterSettings.foreach(__v => __obj.updateDynamic("ClusterSettings")(__v.asInstanceOf[js.Any]))
      Configuration.foreach(__v => __obj.updateDynamic("Configuration")(__v.asInstanceOf[js.Any]))
      DefaultCapacityProviderStrategy.foreach(__v => __obj.updateDynamic("DefaultCapacityProviderStrategy")(__v.asInstanceOf[js.Any]))
      RegisteredContainerInstancesCount.foreach(__v => __obj.updateDynamic("RegisteredContainerInstancesCount")(__v.asInstanceOf[js.Any]))
      RunningTasksCount.foreach(__v => __obj.updateDynamic("RunningTasksCount")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEcsClusterDetails]
    }
  }

  /** Provides information about an Amazon ECS container.
    */
  @js.native
  trait AwsEcsContainerDetails extends js.Object {
    var Image: js.UndefOr[NonEmptyString]
    var MountPoints: js.UndefOr[AwsMountPointList]
    var Name: js.UndefOr[NonEmptyString]
    var Privileged: js.UndefOr[Boolean]
  }

  object AwsEcsContainerDetails {
    @inline
    def apply(
        Image: js.UndefOr[NonEmptyString] = js.undefined,
        MountPoints: js.UndefOr[AwsMountPointList] = js.undefined,
        Name: js.UndefOr[NonEmptyString] = js.undefined,
        Privileged: js.UndefOr[Boolean] = js.undefined
    ): AwsEcsContainerDetails = {
      val __obj = js.Dynamic.literal()
      Image.foreach(__v => __obj.updateDynamic("Image")(__v.asInstanceOf[js.Any]))
      MountPoints.foreach(__v => __obj.updateDynamic("MountPoints")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Privileged.foreach(__v => __obj.updateDynamic("Privileged")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEcsContainerDetails]
    }
  }

  /** Strategy item for the capacity provider strategy that the service uses.
    */
  @js.native
  trait AwsEcsServiceCapacityProviderStrategyDetails extends js.Object {
    var Base: js.UndefOr[Int]
    var CapacityProvider: js.UndefOr[NonEmptyString]
    var Weight: js.UndefOr[Int]
  }

  object AwsEcsServiceCapacityProviderStrategyDetails {
    @inline
    def apply(
        Base: js.UndefOr[Int] = js.undefined,
        CapacityProvider: js.UndefOr[NonEmptyString] = js.undefined,
        Weight: js.UndefOr[Int] = js.undefined
    ): AwsEcsServiceCapacityProviderStrategyDetails = {
      val __obj = js.Dynamic.literal()
      Base.foreach(__v => __obj.updateDynamic("Base")(__v.asInstanceOf[js.Any]))
      CapacityProvider.foreach(__v => __obj.updateDynamic("CapacityProvider")(__v.asInstanceOf[js.Any]))
      Weight.foreach(__v => __obj.updateDynamic("Weight")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEcsServiceCapacityProviderStrategyDetails]
    }
  }

  /** Determines whether a service deployment fails if a service cannot reach a steady state.
    */
  @js.native
  trait AwsEcsServiceDeploymentConfigurationDeploymentCircuitBreakerDetails extends js.Object {
    var Enable: js.UndefOr[Boolean]
    var Rollback: js.UndefOr[Boolean]
  }

  object AwsEcsServiceDeploymentConfigurationDeploymentCircuitBreakerDetails {
    @inline
    def apply(
        Enable: js.UndefOr[Boolean] = js.undefined,
        Rollback: js.UndefOr[Boolean] = js.undefined
    ): AwsEcsServiceDeploymentConfigurationDeploymentCircuitBreakerDetails = {
      val __obj = js.Dynamic.literal()
      Enable.foreach(__v => __obj.updateDynamic("Enable")(__v.asInstanceOf[js.Any]))
      Rollback.foreach(__v => __obj.updateDynamic("Rollback")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEcsServiceDeploymentConfigurationDeploymentCircuitBreakerDetails]
    }
  }

  /** Optional deployment parameters for the service.
    */
  @js.native
  trait AwsEcsServiceDeploymentConfigurationDetails extends js.Object {
    var DeploymentCircuitBreaker: js.UndefOr[AwsEcsServiceDeploymentConfigurationDeploymentCircuitBreakerDetails]
    var MaximumPercent: js.UndefOr[Int]
    var MinimumHealthyPercent: js.UndefOr[Int]
  }

  object AwsEcsServiceDeploymentConfigurationDetails {
    @inline
    def apply(
        DeploymentCircuitBreaker: js.UndefOr[AwsEcsServiceDeploymentConfigurationDeploymentCircuitBreakerDetails] = js.undefined,
        MaximumPercent: js.UndefOr[Int] = js.undefined,
        MinimumHealthyPercent: js.UndefOr[Int] = js.undefined
    ): AwsEcsServiceDeploymentConfigurationDetails = {
      val __obj = js.Dynamic.literal()
      DeploymentCircuitBreaker.foreach(__v => __obj.updateDynamic("DeploymentCircuitBreaker")(__v.asInstanceOf[js.Any]))
      MaximumPercent.foreach(__v => __obj.updateDynamic("MaximumPercent")(__v.asInstanceOf[js.Any]))
      MinimumHealthyPercent.foreach(__v => __obj.updateDynamic("MinimumHealthyPercent")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEcsServiceDeploymentConfigurationDetails]
    }
  }

  /** Information about the deployment controller type that the service uses.
    */
  @js.native
  trait AwsEcsServiceDeploymentControllerDetails extends js.Object {
    var Type: js.UndefOr[NonEmptyString]
  }

  object AwsEcsServiceDeploymentControllerDetails {
    @inline
    def apply(
        Type: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEcsServiceDeploymentControllerDetails = {
      val __obj = js.Dynamic.literal()
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEcsServiceDeploymentControllerDetails]
    }
  }

  /** Provides details about a service within an ECS cluster.
    */
  @js.native
  trait AwsEcsServiceDetails extends js.Object {
    var CapacityProviderStrategy: js.UndefOr[AwsEcsServiceCapacityProviderStrategyList]
    var Cluster: js.UndefOr[NonEmptyString]
    var DeploymentConfiguration: js.UndefOr[AwsEcsServiceDeploymentConfigurationDetails]
    var DeploymentController: js.UndefOr[AwsEcsServiceDeploymentControllerDetails]
    var DesiredCount: js.UndefOr[Int]
    var EnableEcsManagedTags: js.UndefOr[Boolean]
    var EnableExecuteCommand: js.UndefOr[Boolean]
    var HealthCheckGracePeriodSeconds: js.UndefOr[Int]
    var LaunchType: js.UndefOr[NonEmptyString]
    var LoadBalancers: js.UndefOr[AwsEcsServiceLoadBalancersList]
    var Name: js.UndefOr[NonEmptyString]
    var NetworkConfiguration: js.UndefOr[AwsEcsServiceNetworkConfigurationDetails]
    var PlacementConstraints: js.UndefOr[AwsEcsServicePlacementConstraintsList]
    var PlacementStrategies: js.UndefOr[AwsEcsServicePlacementStrategiesList]
    var PlatformVersion: js.UndefOr[NonEmptyString]
    var PropagateTags: js.UndefOr[NonEmptyString]
    var Role: js.UndefOr[NonEmptyString]
    var SchedulingStrategy: js.UndefOr[NonEmptyString]
    var ServiceArn: js.UndefOr[NonEmptyString]
    var ServiceName: js.UndefOr[NonEmptyString]
    var ServiceRegistries: js.UndefOr[AwsEcsServiceServiceRegistriesList]
    var TaskDefinition: js.UndefOr[NonEmptyString]
  }

  object AwsEcsServiceDetails {
    @inline
    def apply(
        CapacityProviderStrategy: js.UndefOr[AwsEcsServiceCapacityProviderStrategyList] = js.undefined,
        Cluster: js.UndefOr[NonEmptyString] = js.undefined,
        DeploymentConfiguration: js.UndefOr[AwsEcsServiceDeploymentConfigurationDetails] = js.undefined,
        DeploymentController: js.UndefOr[AwsEcsServiceDeploymentControllerDetails] = js.undefined,
        DesiredCount: js.UndefOr[Int] = js.undefined,
        EnableEcsManagedTags: js.UndefOr[Boolean] = js.undefined,
        EnableExecuteCommand: js.UndefOr[Boolean] = js.undefined,
        HealthCheckGracePeriodSeconds: js.UndefOr[Int] = js.undefined,
        LaunchType: js.UndefOr[NonEmptyString] = js.undefined,
        LoadBalancers: js.UndefOr[AwsEcsServiceLoadBalancersList] = js.undefined,
        Name: js.UndefOr[NonEmptyString] = js.undefined,
        NetworkConfiguration: js.UndefOr[AwsEcsServiceNetworkConfigurationDetails] = js.undefined,
        PlacementConstraints: js.UndefOr[AwsEcsServicePlacementConstraintsList] = js.undefined,
        PlacementStrategies: js.UndefOr[AwsEcsServicePlacementStrategiesList] = js.undefined,
        PlatformVersion: js.UndefOr[NonEmptyString] = js.undefined,
        PropagateTags: js.UndefOr[NonEmptyString] = js.undefined,
        Role: js.UndefOr[NonEmptyString] = js.undefined,
        SchedulingStrategy: js.UndefOr[NonEmptyString] = js.undefined,
        ServiceArn: js.UndefOr[NonEmptyString] = js.undefined,
        ServiceName: js.UndefOr[NonEmptyString] = js.undefined,
        ServiceRegistries: js.UndefOr[AwsEcsServiceServiceRegistriesList] = js.undefined,
        TaskDefinition: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEcsServiceDetails = {
      val __obj = js.Dynamic.literal()
      CapacityProviderStrategy.foreach(__v => __obj.updateDynamic("CapacityProviderStrategy")(__v.asInstanceOf[js.Any]))
      Cluster.foreach(__v => __obj.updateDynamic("Cluster")(__v.asInstanceOf[js.Any]))
      DeploymentConfiguration.foreach(__v => __obj.updateDynamic("DeploymentConfiguration")(__v.asInstanceOf[js.Any]))
      DeploymentController.foreach(__v => __obj.updateDynamic("DeploymentController")(__v.asInstanceOf[js.Any]))
      DesiredCount.foreach(__v => __obj.updateDynamic("DesiredCount")(__v.asInstanceOf[js.Any]))
      EnableEcsManagedTags.foreach(__v => __obj.updateDynamic("EnableEcsManagedTags")(__v.asInstanceOf[js.Any]))
      EnableExecuteCommand.foreach(__v => __obj.updateDynamic("EnableExecuteCommand")(__v.asInstanceOf[js.Any]))
      HealthCheckGracePeriodSeconds.foreach(__v => __obj.updateDynamic("HealthCheckGracePeriodSeconds")(__v.asInstanceOf[js.Any]))
      LaunchType.foreach(__v => __obj.updateDynamic("LaunchType")(__v.asInstanceOf[js.Any]))
      LoadBalancers.foreach(__v => __obj.updateDynamic("LoadBalancers")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      NetworkConfiguration.foreach(__v => __obj.updateDynamic("NetworkConfiguration")(__v.asInstanceOf[js.Any]))
      PlacementConstraints.foreach(__v => __obj.updateDynamic("PlacementConstraints")(__v.asInstanceOf[js.Any]))
      PlacementStrategies.foreach(__v => __obj.updateDynamic("PlacementStrategies")(__v.asInstanceOf[js.Any]))
      PlatformVersion.foreach(__v => __obj.updateDynamic("PlatformVersion")(__v.asInstanceOf[js.Any]))
      PropagateTags.foreach(__v => __obj.updateDynamic("PropagateTags")(__v.asInstanceOf[js.Any]))
      Role.foreach(__v => __obj.updateDynamic("Role")(__v.asInstanceOf[js.Any]))
      SchedulingStrategy.foreach(__v => __obj.updateDynamic("SchedulingStrategy")(__v.asInstanceOf[js.Any]))
      ServiceArn.foreach(__v => __obj.updateDynamic("ServiceArn")(__v.asInstanceOf[js.Any]))
      ServiceName.foreach(__v => __obj.updateDynamic("ServiceName")(__v.asInstanceOf[js.Any]))
      ServiceRegistries.foreach(__v => __obj.updateDynamic("ServiceRegistries")(__v.asInstanceOf[js.Any]))
      TaskDefinition.foreach(__v => __obj.updateDynamic("TaskDefinition")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEcsServiceDetails]
    }
  }

  /** Information about a load balancer that the service uses.
    */
  @js.native
  trait AwsEcsServiceLoadBalancersDetails extends js.Object {
    var ContainerName: js.UndefOr[NonEmptyString]
    var ContainerPort: js.UndefOr[Int]
    var LoadBalancerName: js.UndefOr[NonEmptyString]
    var TargetGroupArn: js.UndefOr[NonEmptyString]
  }

  object AwsEcsServiceLoadBalancersDetails {
    @inline
    def apply(
        ContainerName: js.UndefOr[NonEmptyString] = js.undefined,
        ContainerPort: js.UndefOr[Int] = js.undefined,
        LoadBalancerName: js.UndefOr[NonEmptyString] = js.undefined,
        TargetGroupArn: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEcsServiceLoadBalancersDetails = {
      val __obj = js.Dynamic.literal()
      ContainerName.foreach(__v => __obj.updateDynamic("ContainerName")(__v.asInstanceOf[js.Any]))
      ContainerPort.foreach(__v => __obj.updateDynamic("ContainerPort")(__v.asInstanceOf[js.Any]))
      LoadBalancerName.foreach(__v => __obj.updateDynamic("LoadBalancerName")(__v.asInstanceOf[js.Any]))
      TargetGroupArn.foreach(__v => __obj.updateDynamic("TargetGroupArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEcsServiceLoadBalancersDetails]
    }
  }

  /** For tasks that use the <code>awsvpc</code> networking mode, the VPC subnet and security group configuration.
    */
  @js.native
  trait AwsEcsServiceNetworkConfigurationAwsVpcConfigurationDetails extends js.Object {
    var AssignPublicIp: js.UndefOr[NonEmptyString]
    var SecurityGroups: js.UndefOr[NonEmptyStringList]
    var Subnets: js.UndefOr[NonEmptyStringList]
  }

  object AwsEcsServiceNetworkConfigurationAwsVpcConfigurationDetails {
    @inline
    def apply(
        AssignPublicIp: js.UndefOr[NonEmptyString] = js.undefined,
        SecurityGroups: js.UndefOr[NonEmptyStringList] = js.undefined,
        Subnets: js.UndefOr[NonEmptyStringList] = js.undefined
    ): AwsEcsServiceNetworkConfigurationAwsVpcConfigurationDetails = {
      val __obj = js.Dynamic.literal()
      AssignPublicIp.foreach(__v => __obj.updateDynamic("AssignPublicIp")(__v.asInstanceOf[js.Any]))
      SecurityGroups.foreach(__v => __obj.updateDynamic("SecurityGroups")(__v.asInstanceOf[js.Any]))
      Subnets.foreach(__v => __obj.updateDynamic("Subnets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEcsServiceNetworkConfigurationAwsVpcConfigurationDetails]
    }
  }

  /** For tasks that use the <code>awsvpc</code> networking mode, the VPC subnet and security group configuration.
    */
  @js.native
  trait AwsEcsServiceNetworkConfigurationDetails extends js.Object {
    var AwsVpcConfiguration: js.UndefOr[AwsEcsServiceNetworkConfigurationAwsVpcConfigurationDetails]
  }

  object AwsEcsServiceNetworkConfigurationDetails {
    @inline
    def apply(
        AwsVpcConfiguration: js.UndefOr[AwsEcsServiceNetworkConfigurationAwsVpcConfigurationDetails] = js.undefined
    ): AwsEcsServiceNetworkConfigurationDetails = {
      val __obj = js.Dynamic.literal()
      AwsVpcConfiguration.foreach(__v => __obj.updateDynamic("AwsVpcConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEcsServiceNetworkConfigurationDetails]
    }
  }

  /** A placement constraint for the tasks in the service.
    */
  @js.native
  trait AwsEcsServicePlacementConstraintsDetails extends js.Object {
    var Expression: js.UndefOr[NonEmptyString]
    var Type: js.UndefOr[NonEmptyString]
  }

  object AwsEcsServicePlacementConstraintsDetails {
    @inline
    def apply(
        Expression: js.UndefOr[NonEmptyString] = js.undefined,
        Type: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEcsServicePlacementConstraintsDetails = {
      val __obj = js.Dynamic.literal()
      Expression.foreach(__v => __obj.updateDynamic("Expression")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEcsServicePlacementConstraintsDetails]
    }
  }

  /** A placement strategy that determines how to place the tasks for the service.
    */
  @js.native
  trait AwsEcsServicePlacementStrategiesDetails extends js.Object {
    var Field: js.UndefOr[NonEmptyString]
    var Type: js.UndefOr[NonEmptyString]
  }

  object AwsEcsServicePlacementStrategiesDetails {
    @inline
    def apply(
        Field: js.UndefOr[NonEmptyString] = js.undefined,
        Type: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEcsServicePlacementStrategiesDetails = {
      val __obj = js.Dynamic.literal()
      Field.foreach(__v => __obj.updateDynamic("Field")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEcsServicePlacementStrategiesDetails]
    }
  }

  /** Information about a service discovery registry to assign to the service.
    */
  @js.native
  trait AwsEcsServiceServiceRegistriesDetails extends js.Object {
    var ContainerName: js.UndefOr[NonEmptyString]
    var ContainerPort: js.UndefOr[Int]
    var Port: js.UndefOr[Int]
    var RegistryArn: js.UndefOr[NonEmptyString]
  }

  object AwsEcsServiceServiceRegistriesDetails {
    @inline
    def apply(
        ContainerName: js.UndefOr[NonEmptyString] = js.undefined,
        ContainerPort: js.UndefOr[Int] = js.undefined,
        Port: js.UndefOr[Int] = js.undefined,
        RegistryArn: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEcsServiceServiceRegistriesDetails = {
      val __obj = js.Dynamic.literal()
      ContainerName.foreach(__v => __obj.updateDynamic("ContainerName")(__v.asInstanceOf[js.Any]))
      ContainerPort.foreach(__v => __obj.updateDynamic("ContainerPort")(__v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      RegistryArn.foreach(__v => __obj.updateDynamic("RegistryArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEcsServiceServiceRegistriesDetails]
    }
  }

  /** A dependency that is defined for container startup and shutdown.
    */
  @js.native
  trait AwsEcsTaskDefinitionContainerDefinitionsDependsOnDetails extends js.Object {
    var Condition: js.UndefOr[NonEmptyString]
    var ContainerName: js.UndefOr[NonEmptyString]
  }

  object AwsEcsTaskDefinitionContainerDefinitionsDependsOnDetails {
    @inline
    def apply(
        Condition: js.UndefOr[NonEmptyString] = js.undefined,
        ContainerName: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEcsTaskDefinitionContainerDefinitionsDependsOnDetails = {
      val __obj = js.Dynamic.literal()
      Condition.foreach(__v => __obj.updateDynamic("Condition")(__v.asInstanceOf[js.Any]))
      ContainerName.foreach(__v => __obj.updateDynamic("ContainerName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEcsTaskDefinitionContainerDefinitionsDependsOnDetails]
    }
  }

  /** A container definition that describes a container in the task.
    */
  @js.native
  trait AwsEcsTaskDefinitionContainerDefinitionsDetails extends js.Object {
    var Command: js.UndefOr[NonEmptyStringList]
    var Cpu: js.UndefOr[Int]
    var DependsOn: js.UndefOr[AwsEcsTaskDefinitionContainerDefinitionsDependsOnList]
    var DisableNetworking: js.UndefOr[Boolean]
    var DnsSearchDomains: js.UndefOr[NonEmptyStringList]
    var DnsServers: js.UndefOr[NonEmptyStringList]
    var DockerLabels: js.UndefOr[FieldMap]
    var DockerSecurityOptions: js.UndefOr[NonEmptyStringList]
    var EntryPoint: js.UndefOr[NonEmptyStringList]
    var Environment: js.UndefOr[AwsEcsTaskDefinitionContainerDefinitionsEnvironmentList]
    var EnvironmentFiles: js.UndefOr[AwsEcsTaskDefinitionContainerDefinitionsEnvironmentFilesList]
    var Essential: js.UndefOr[Boolean]
    var ExtraHosts: js.UndefOr[AwsEcsTaskDefinitionContainerDefinitionsExtraHostsList]
    var FirelensConfiguration: js.UndefOr[AwsEcsTaskDefinitionContainerDefinitionsFirelensConfigurationDetails]
    var HealthCheck: js.UndefOr[AwsEcsTaskDefinitionContainerDefinitionsHealthCheckDetails]
    var Hostname: js.UndefOr[NonEmptyString]
    var Image: js.UndefOr[NonEmptyString]
    var Interactive: js.UndefOr[Boolean]
    var Links: js.UndefOr[NonEmptyStringList]
    var LinuxParameters: js.UndefOr[AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails]
    var LogConfiguration: js.UndefOr[AwsEcsTaskDefinitionContainerDefinitionsLogConfigurationDetails]
    var Memory: js.UndefOr[Int]
    var MemoryReservation: js.UndefOr[Int]
    var MountPoints: js.UndefOr[AwsEcsTaskDefinitionContainerDefinitionsMountPointsList]
    var Name: js.UndefOr[NonEmptyString]
    var PortMappings: js.UndefOr[AwsEcsTaskDefinitionContainerDefinitionsPortMappingsList]
    var Privileged: js.UndefOr[Boolean]
    var PseudoTerminal: js.UndefOr[Boolean]
    var ReadonlyRootFilesystem: js.UndefOr[Boolean]
    var RepositoryCredentials: js.UndefOr[AwsEcsTaskDefinitionContainerDefinitionsRepositoryCredentialsDetails]
    var ResourceRequirements: js.UndefOr[AwsEcsTaskDefinitionContainerDefinitionsResourceRequirementsList]
    var Secrets: js.UndefOr[AwsEcsTaskDefinitionContainerDefinitionsSecretsList]
    var StartTimeout: js.UndefOr[Int]
    var StopTimeout: js.UndefOr[Int]
    var SystemControls: js.UndefOr[AwsEcsTaskDefinitionContainerDefinitionsSystemControlsList]
    var Ulimits: js.UndefOr[AwsEcsTaskDefinitionContainerDefinitionsUlimitsList]
    var User: js.UndefOr[NonEmptyString]
    var VolumesFrom: js.UndefOr[AwsEcsTaskDefinitionContainerDefinitionsVolumesFromList]
    var WorkingDirectory: js.UndefOr[NonEmptyString]
  }

  object AwsEcsTaskDefinitionContainerDefinitionsDetails {
    @inline
    def apply(
        Command: js.UndefOr[NonEmptyStringList] = js.undefined,
        Cpu: js.UndefOr[Int] = js.undefined,
        DependsOn: js.UndefOr[AwsEcsTaskDefinitionContainerDefinitionsDependsOnList] = js.undefined,
        DisableNetworking: js.UndefOr[Boolean] = js.undefined,
        DnsSearchDomains: js.UndefOr[NonEmptyStringList] = js.undefined,
        DnsServers: js.UndefOr[NonEmptyStringList] = js.undefined,
        DockerLabels: js.UndefOr[FieldMap] = js.undefined,
        DockerSecurityOptions: js.UndefOr[NonEmptyStringList] = js.undefined,
        EntryPoint: js.UndefOr[NonEmptyStringList] = js.undefined,
        Environment: js.UndefOr[AwsEcsTaskDefinitionContainerDefinitionsEnvironmentList] = js.undefined,
        EnvironmentFiles: js.UndefOr[AwsEcsTaskDefinitionContainerDefinitionsEnvironmentFilesList] = js.undefined,
        Essential: js.UndefOr[Boolean] = js.undefined,
        ExtraHosts: js.UndefOr[AwsEcsTaskDefinitionContainerDefinitionsExtraHostsList] = js.undefined,
        FirelensConfiguration: js.UndefOr[AwsEcsTaskDefinitionContainerDefinitionsFirelensConfigurationDetails] = js.undefined,
        HealthCheck: js.UndefOr[AwsEcsTaskDefinitionContainerDefinitionsHealthCheckDetails] = js.undefined,
        Hostname: js.UndefOr[NonEmptyString] = js.undefined,
        Image: js.UndefOr[NonEmptyString] = js.undefined,
        Interactive: js.UndefOr[Boolean] = js.undefined,
        Links: js.UndefOr[NonEmptyStringList] = js.undefined,
        LinuxParameters: js.UndefOr[AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails] = js.undefined,
        LogConfiguration: js.UndefOr[AwsEcsTaskDefinitionContainerDefinitionsLogConfigurationDetails] = js.undefined,
        Memory: js.UndefOr[Int] = js.undefined,
        MemoryReservation: js.UndefOr[Int] = js.undefined,
        MountPoints: js.UndefOr[AwsEcsTaskDefinitionContainerDefinitionsMountPointsList] = js.undefined,
        Name: js.UndefOr[NonEmptyString] = js.undefined,
        PortMappings: js.UndefOr[AwsEcsTaskDefinitionContainerDefinitionsPortMappingsList] = js.undefined,
        Privileged: js.UndefOr[Boolean] = js.undefined,
        PseudoTerminal: js.UndefOr[Boolean] = js.undefined,
        ReadonlyRootFilesystem: js.UndefOr[Boolean] = js.undefined,
        RepositoryCredentials: js.UndefOr[AwsEcsTaskDefinitionContainerDefinitionsRepositoryCredentialsDetails] = js.undefined,
        ResourceRequirements: js.UndefOr[AwsEcsTaskDefinitionContainerDefinitionsResourceRequirementsList] = js.undefined,
        Secrets: js.UndefOr[AwsEcsTaskDefinitionContainerDefinitionsSecretsList] = js.undefined,
        StartTimeout: js.UndefOr[Int] = js.undefined,
        StopTimeout: js.UndefOr[Int] = js.undefined,
        SystemControls: js.UndefOr[AwsEcsTaskDefinitionContainerDefinitionsSystemControlsList] = js.undefined,
        Ulimits: js.UndefOr[AwsEcsTaskDefinitionContainerDefinitionsUlimitsList] = js.undefined,
        User: js.UndefOr[NonEmptyString] = js.undefined,
        VolumesFrom: js.UndefOr[AwsEcsTaskDefinitionContainerDefinitionsVolumesFromList] = js.undefined,
        WorkingDirectory: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEcsTaskDefinitionContainerDefinitionsDetails = {
      val __obj = js.Dynamic.literal()
      Command.foreach(__v => __obj.updateDynamic("Command")(__v.asInstanceOf[js.Any]))
      Cpu.foreach(__v => __obj.updateDynamic("Cpu")(__v.asInstanceOf[js.Any]))
      DependsOn.foreach(__v => __obj.updateDynamic("DependsOn")(__v.asInstanceOf[js.Any]))
      DisableNetworking.foreach(__v => __obj.updateDynamic("DisableNetworking")(__v.asInstanceOf[js.Any]))
      DnsSearchDomains.foreach(__v => __obj.updateDynamic("DnsSearchDomains")(__v.asInstanceOf[js.Any]))
      DnsServers.foreach(__v => __obj.updateDynamic("DnsServers")(__v.asInstanceOf[js.Any]))
      DockerLabels.foreach(__v => __obj.updateDynamic("DockerLabels")(__v.asInstanceOf[js.Any]))
      DockerSecurityOptions.foreach(__v => __obj.updateDynamic("DockerSecurityOptions")(__v.asInstanceOf[js.Any]))
      EntryPoint.foreach(__v => __obj.updateDynamic("EntryPoint")(__v.asInstanceOf[js.Any]))
      Environment.foreach(__v => __obj.updateDynamic("Environment")(__v.asInstanceOf[js.Any]))
      EnvironmentFiles.foreach(__v => __obj.updateDynamic("EnvironmentFiles")(__v.asInstanceOf[js.Any]))
      Essential.foreach(__v => __obj.updateDynamic("Essential")(__v.asInstanceOf[js.Any]))
      ExtraHosts.foreach(__v => __obj.updateDynamic("ExtraHosts")(__v.asInstanceOf[js.Any]))
      FirelensConfiguration.foreach(__v => __obj.updateDynamic("FirelensConfiguration")(__v.asInstanceOf[js.Any]))
      HealthCheck.foreach(__v => __obj.updateDynamic("HealthCheck")(__v.asInstanceOf[js.Any]))
      Hostname.foreach(__v => __obj.updateDynamic("Hostname")(__v.asInstanceOf[js.Any]))
      Image.foreach(__v => __obj.updateDynamic("Image")(__v.asInstanceOf[js.Any]))
      Interactive.foreach(__v => __obj.updateDynamic("Interactive")(__v.asInstanceOf[js.Any]))
      Links.foreach(__v => __obj.updateDynamic("Links")(__v.asInstanceOf[js.Any]))
      LinuxParameters.foreach(__v => __obj.updateDynamic("LinuxParameters")(__v.asInstanceOf[js.Any]))
      LogConfiguration.foreach(__v => __obj.updateDynamic("LogConfiguration")(__v.asInstanceOf[js.Any]))
      Memory.foreach(__v => __obj.updateDynamic("Memory")(__v.asInstanceOf[js.Any]))
      MemoryReservation.foreach(__v => __obj.updateDynamic("MemoryReservation")(__v.asInstanceOf[js.Any]))
      MountPoints.foreach(__v => __obj.updateDynamic("MountPoints")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      PortMappings.foreach(__v => __obj.updateDynamic("PortMappings")(__v.asInstanceOf[js.Any]))
      Privileged.foreach(__v => __obj.updateDynamic("Privileged")(__v.asInstanceOf[js.Any]))
      PseudoTerminal.foreach(__v => __obj.updateDynamic("PseudoTerminal")(__v.asInstanceOf[js.Any]))
      ReadonlyRootFilesystem.foreach(__v => __obj.updateDynamic("ReadonlyRootFilesystem")(__v.asInstanceOf[js.Any]))
      RepositoryCredentials.foreach(__v => __obj.updateDynamic("RepositoryCredentials")(__v.asInstanceOf[js.Any]))
      ResourceRequirements.foreach(__v => __obj.updateDynamic("ResourceRequirements")(__v.asInstanceOf[js.Any]))
      Secrets.foreach(__v => __obj.updateDynamic("Secrets")(__v.asInstanceOf[js.Any]))
      StartTimeout.foreach(__v => __obj.updateDynamic("StartTimeout")(__v.asInstanceOf[js.Any]))
      StopTimeout.foreach(__v => __obj.updateDynamic("StopTimeout")(__v.asInstanceOf[js.Any]))
      SystemControls.foreach(__v => __obj.updateDynamic("SystemControls")(__v.asInstanceOf[js.Any]))
      Ulimits.foreach(__v => __obj.updateDynamic("Ulimits")(__v.asInstanceOf[js.Any]))
      User.foreach(__v => __obj.updateDynamic("User")(__v.asInstanceOf[js.Any]))
      VolumesFrom.foreach(__v => __obj.updateDynamic("VolumesFrom")(__v.asInstanceOf[js.Any]))
      WorkingDirectory.foreach(__v => __obj.updateDynamic("WorkingDirectory")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEcsTaskDefinitionContainerDefinitionsDetails]
    }
  }

  /** An environment variable to pass to the container.
    */
  @js.native
  trait AwsEcsTaskDefinitionContainerDefinitionsEnvironmentDetails extends js.Object {
    var Name: js.UndefOr[NonEmptyString]
    var Value: js.UndefOr[NonEmptyString]
  }

  object AwsEcsTaskDefinitionContainerDefinitionsEnvironmentDetails {
    @inline
    def apply(
        Name: js.UndefOr[NonEmptyString] = js.undefined,
        Value: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEcsTaskDefinitionContainerDefinitionsEnvironmentDetails = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEcsTaskDefinitionContainerDefinitionsEnvironmentDetails]
    }
  }

  /** A file that contain environment variables to pass to a container.
    */
  @js.native
  trait AwsEcsTaskDefinitionContainerDefinitionsEnvironmentFilesDetails extends js.Object {
    var Type: js.UndefOr[NonEmptyString]
    var Value: js.UndefOr[NonEmptyString]
  }

  object AwsEcsTaskDefinitionContainerDefinitionsEnvironmentFilesDetails {
    @inline
    def apply(
        Type: js.UndefOr[NonEmptyString] = js.undefined,
        Value: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEcsTaskDefinitionContainerDefinitionsEnvironmentFilesDetails = {
      val __obj = js.Dynamic.literal()
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEcsTaskDefinitionContainerDefinitionsEnvironmentFilesDetails]
    }
  }

  /** A hostname and IP address mapping to append to the ```/etc/hosts``` file on the container.
    */
  @js.native
  trait AwsEcsTaskDefinitionContainerDefinitionsExtraHostsDetails extends js.Object {
    var Hostname: js.UndefOr[NonEmptyString]
    var IpAddress: js.UndefOr[NonEmptyString]
  }

  object AwsEcsTaskDefinitionContainerDefinitionsExtraHostsDetails {
    @inline
    def apply(
        Hostname: js.UndefOr[NonEmptyString] = js.undefined,
        IpAddress: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEcsTaskDefinitionContainerDefinitionsExtraHostsDetails = {
      val __obj = js.Dynamic.literal()
      Hostname.foreach(__v => __obj.updateDynamic("Hostname")(__v.asInstanceOf[js.Any]))
      IpAddress.foreach(__v => __obj.updateDynamic("IpAddress")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEcsTaskDefinitionContainerDefinitionsExtraHostsDetails]
    }
  }

  /** The FireLens configuration for the container. The configuration specifies and configures a log router for container logs.
    */
  @js.native
  trait AwsEcsTaskDefinitionContainerDefinitionsFirelensConfigurationDetails extends js.Object {
    var Options: js.UndefOr[FieldMap]
    var Type: js.UndefOr[NonEmptyString]
  }

  object AwsEcsTaskDefinitionContainerDefinitionsFirelensConfigurationDetails {
    @inline
    def apply(
        Options: js.UndefOr[FieldMap] = js.undefined,
        Type: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEcsTaskDefinitionContainerDefinitionsFirelensConfigurationDetails = {
      val __obj = js.Dynamic.literal()
      Options.foreach(__v => __obj.updateDynamic("Options")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEcsTaskDefinitionContainerDefinitionsFirelensConfigurationDetails]
    }
  }

  /** The container health check command and associated configuration parameters for the container.
    */
  @js.native
  trait AwsEcsTaskDefinitionContainerDefinitionsHealthCheckDetails extends js.Object {
    var Command: js.UndefOr[NonEmptyStringList]
    var Interval: js.UndefOr[Int]
    var Retries: js.UndefOr[Int]
    var StartPeriod: js.UndefOr[Int]
    var Timeout: js.UndefOr[Int]
  }

  object AwsEcsTaskDefinitionContainerDefinitionsHealthCheckDetails {
    @inline
    def apply(
        Command: js.UndefOr[NonEmptyStringList] = js.undefined,
        Interval: js.UndefOr[Int] = js.undefined,
        Retries: js.UndefOr[Int] = js.undefined,
        StartPeriod: js.UndefOr[Int] = js.undefined,
        Timeout: js.UndefOr[Int] = js.undefined
    ): AwsEcsTaskDefinitionContainerDefinitionsHealthCheckDetails = {
      val __obj = js.Dynamic.literal()
      Command.foreach(__v => __obj.updateDynamic("Command")(__v.asInstanceOf[js.Any]))
      Interval.foreach(__v => __obj.updateDynamic("Interval")(__v.asInstanceOf[js.Any]))
      Retries.foreach(__v => __obj.updateDynamic("Retries")(__v.asInstanceOf[js.Any]))
      StartPeriod.foreach(__v => __obj.updateDynamic("StartPeriod")(__v.asInstanceOf[js.Any]))
      Timeout.foreach(__v => __obj.updateDynamic("Timeout")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEcsTaskDefinitionContainerDefinitionsHealthCheckDetails]
    }
  }

  /** The Linux capabilities for the container that are added to or dropped from the default configuration provided by Docker.
    */
  @js.native
  trait AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersCapabilitiesDetails extends js.Object {
    var Add: js.UndefOr[NonEmptyStringList]
    var Drop: js.UndefOr[NonEmptyStringList]
  }

  object AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersCapabilitiesDetails {
    @inline
    def apply(
        Add: js.UndefOr[NonEmptyStringList] = js.undefined,
        Drop: js.UndefOr[NonEmptyStringList] = js.undefined
    ): AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersCapabilitiesDetails = {
      val __obj = js.Dynamic.literal()
      Add.foreach(__v => __obj.updateDynamic("Add")(__v.asInstanceOf[js.Any]))
      Drop.foreach(__v => __obj.updateDynamic("Drop")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersCapabilitiesDetails]
    }
  }

  /** &gt;Linux-specific modifications that are applied to the container, such as Linux kernel capabilities.
    */
  @js.native
  trait AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails extends js.Object {
    var Capabilities: js.UndefOr[AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersCapabilitiesDetails]
    var Devices: js.UndefOr[AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDevicesList]
    var InitProcessEnabled: js.UndefOr[Boolean]
    var MaxSwap: js.UndefOr[Int]
    var SharedMemorySize: js.UndefOr[Int]
    var Swappiness: js.UndefOr[Int]
    var Tmpfs: js.UndefOr[AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersTmpfsList]
  }

  object AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails {
    @inline
    def apply(
        Capabilities: js.UndefOr[AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersCapabilitiesDetails] = js.undefined,
        Devices: js.UndefOr[AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDevicesList] = js.undefined,
        InitProcessEnabled: js.UndefOr[Boolean] = js.undefined,
        MaxSwap: js.UndefOr[Int] = js.undefined,
        SharedMemorySize: js.UndefOr[Int] = js.undefined,
        Swappiness: js.UndefOr[Int] = js.undefined,
        Tmpfs: js.UndefOr[AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersTmpfsList] = js.undefined
    ): AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails = {
      val __obj = js.Dynamic.literal()
      Capabilities.foreach(__v => __obj.updateDynamic("Capabilities")(__v.asInstanceOf[js.Any]))
      Devices.foreach(__v => __obj.updateDynamic("Devices")(__v.asInstanceOf[js.Any]))
      InitProcessEnabled.foreach(__v => __obj.updateDynamic("InitProcessEnabled")(__v.asInstanceOf[js.Any]))
      MaxSwap.foreach(__v => __obj.updateDynamic("MaxSwap")(__v.asInstanceOf[js.Any]))
      SharedMemorySize.foreach(__v => __obj.updateDynamic("SharedMemorySize")(__v.asInstanceOf[js.Any]))
      Swappiness.foreach(__v => __obj.updateDynamic("Swappiness")(__v.asInstanceOf[js.Any]))
      Tmpfs.foreach(__v => __obj.updateDynamic("Tmpfs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails]
    }
  }

  /** A host device to expose to the container.
    */
  @js.native
  trait AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDevicesDetails extends js.Object {
    var ContainerPath: js.UndefOr[NonEmptyString]
    var HostPath: js.UndefOr[NonEmptyString]
    var Permissions: js.UndefOr[NonEmptyStringList]
  }

  object AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDevicesDetails {
    @inline
    def apply(
        ContainerPath: js.UndefOr[NonEmptyString] = js.undefined,
        HostPath: js.UndefOr[NonEmptyString] = js.undefined,
        Permissions: js.UndefOr[NonEmptyStringList] = js.undefined
    ): AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDevicesDetails = {
      val __obj = js.Dynamic.literal()
      ContainerPath.foreach(__v => __obj.updateDynamic("ContainerPath")(__v.asInstanceOf[js.Any]))
      HostPath.foreach(__v => __obj.updateDynamic("HostPath")(__v.asInstanceOf[js.Any]))
      Permissions.foreach(__v => __obj.updateDynamic("Permissions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDevicesDetails]
    }
  }

  /** The container path, mount options, and size (in MiB) of a tmpfs mount.
    */
  @js.native
  trait AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersTmpfsDetails extends js.Object {
    var ContainerPath: js.UndefOr[NonEmptyString]
    var MountOptions: js.UndefOr[NonEmptyStringList]
    var Size: js.UndefOr[Int]
  }

  object AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersTmpfsDetails {
    @inline
    def apply(
        ContainerPath: js.UndefOr[NonEmptyString] = js.undefined,
        MountOptions: js.UndefOr[NonEmptyStringList] = js.undefined,
        Size: js.UndefOr[Int] = js.undefined
    ): AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersTmpfsDetails = {
      val __obj = js.Dynamic.literal()
      ContainerPath.foreach(__v => __obj.updateDynamic("ContainerPath")(__v.asInstanceOf[js.Any]))
      MountOptions.foreach(__v => __obj.updateDynamic("MountOptions")(__v.asInstanceOf[js.Any]))
      Size.foreach(__v => __obj.updateDynamic("Size")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersTmpfsDetails]
    }
  }

  /** The log configuration specification for the container.
    */
  @js.native
  trait AwsEcsTaskDefinitionContainerDefinitionsLogConfigurationDetails extends js.Object {
    var LogDriver: js.UndefOr[NonEmptyString]
    var Options: js.UndefOr[FieldMap]
    var SecretOptions: js.UndefOr[AwsEcsTaskDefinitionContainerDefinitionsLogConfigurationSecretOptionsList]
  }

  object AwsEcsTaskDefinitionContainerDefinitionsLogConfigurationDetails {
    @inline
    def apply(
        LogDriver: js.UndefOr[NonEmptyString] = js.undefined,
        Options: js.UndefOr[FieldMap] = js.undefined,
        SecretOptions: js.UndefOr[AwsEcsTaskDefinitionContainerDefinitionsLogConfigurationSecretOptionsList] = js.undefined
    ): AwsEcsTaskDefinitionContainerDefinitionsLogConfigurationDetails = {
      val __obj = js.Dynamic.literal()
      LogDriver.foreach(__v => __obj.updateDynamic("LogDriver")(__v.asInstanceOf[js.Any]))
      Options.foreach(__v => __obj.updateDynamic("Options")(__v.asInstanceOf[js.Any]))
      SecretOptions.foreach(__v => __obj.updateDynamic("SecretOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEcsTaskDefinitionContainerDefinitionsLogConfigurationDetails]
    }
  }

  /** A secret to pass to the log configuration.
    */
  @js.native
  trait AwsEcsTaskDefinitionContainerDefinitionsLogConfigurationSecretOptionsDetails extends js.Object {
    var Name: js.UndefOr[NonEmptyString]
    var ValueFrom: js.UndefOr[NonEmptyString]
  }

  object AwsEcsTaskDefinitionContainerDefinitionsLogConfigurationSecretOptionsDetails {
    @inline
    def apply(
        Name: js.UndefOr[NonEmptyString] = js.undefined,
        ValueFrom: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEcsTaskDefinitionContainerDefinitionsLogConfigurationSecretOptionsDetails = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ValueFrom.foreach(__v => __obj.updateDynamic("ValueFrom")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEcsTaskDefinitionContainerDefinitionsLogConfigurationSecretOptionsDetails]
    }
  }

  /** A mount point for the data volumes in the container.
    */
  @js.native
  trait AwsEcsTaskDefinitionContainerDefinitionsMountPointsDetails extends js.Object {
    var ContainerPath: js.UndefOr[NonEmptyString]
    var ReadOnly: js.UndefOr[Boolean]
    var SourceVolume: js.UndefOr[NonEmptyString]
  }

  object AwsEcsTaskDefinitionContainerDefinitionsMountPointsDetails {
    @inline
    def apply(
        ContainerPath: js.UndefOr[NonEmptyString] = js.undefined,
        ReadOnly: js.UndefOr[Boolean] = js.undefined,
        SourceVolume: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEcsTaskDefinitionContainerDefinitionsMountPointsDetails = {
      val __obj = js.Dynamic.literal()
      ContainerPath.foreach(__v => __obj.updateDynamic("ContainerPath")(__v.asInstanceOf[js.Any]))
      ReadOnly.foreach(__v => __obj.updateDynamic("ReadOnly")(__v.asInstanceOf[js.Any]))
      SourceVolume.foreach(__v => __obj.updateDynamic("SourceVolume")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEcsTaskDefinitionContainerDefinitionsMountPointsDetails]
    }
  }

  /** A port mapping for the container.
    */
  @js.native
  trait AwsEcsTaskDefinitionContainerDefinitionsPortMappingsDetails extends js.Object {
    var ContainerPort: js.UndefOr[Int]
    var HostPort: js.UndefOr[Int]
    var Protocol: js.UndefOr[NonEmptyString]
  }

  object AwsEcsTaskDefinitionContainerDefinitionsPortMappingsDetails {
    @inline
    def apply(
        ContainerPort: js.UndefOr[Int] = js.undefined,
        HostPort: js.UndefOr[Int] = js.undefined,
        Protocol: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEcsTaskDefinitionContainerDefinitionsPortMappingsDetails = {
      val __obj = js.Dynamic.literal()
      ContainerPort.foreach(__v => __obj.updateDynamic("ContainerPort")(__v.asInstanceOf[js.Any]))
      HostPort.foreach(__v => __obj.updateDynamic("HostPort")(__v.asInstanceOf[js.Any]))
      Protocol.foreach(__v => __obj.updateDynamic("Protocol")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEcsTaskDefinitionContainerDefinitionsPortMappingsDetails]
    }
  }

  /** The private repository authentication credentials to use.
    */
  @js.native
  trait AwsEcsTaskDefinitionContainerDefinitionsRepositoryCredentialsDetails extends js.Object {
    var CredentialsParameter: js.UndefOr[NonEmptyString]
  }

  object AwsEcsTaskDefinitionContainerDefinitionsRepositoryCredentialsDetails {
    @inline
    def apply(
        CredentialsParameter: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEcsTaskDefinitionContainerDefinitionsRepositoryCredentialsDetails = {
      val __obj = js.Dynamic.literal()
      CredentialsParameter.foreach(__v => __obj.updateDynamic("CredentialsParameter")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEcsTaskDefinitionContainerDefinitionsRepositoryCredentialsDetails]
    }
  }

  /** A resource to assign to a container.
    */
  @js.native
  trait AwsEcsTaskDefinitionContainerDefinitionsResourceRequirementsDetails extends js.Object {
    var Type: js.UndefOr[NonEmptyString]
    var Value: js.UndefOr[NonEmptyString]
  }

  object AwsEcsTaskDefinitionContainerDefinitionsResourceRequirementsDetails {
    @inline
    def apply(
        Type: js.UndefOr[NonEmptyString] = js.undefined,
        Value: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEcsTaskDefinitionContainerDefinitionsResourceRequirementsDetails = {
      val __obj = js.Dynamic.literal()
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEcsTaskDefinitionContainerDefinitionsResourceRequirementsDetails]
    }
  }

  /** A secret to pass to the container.
    */
  @js.native
  trait AwsEcsTaskDefinitionContainerDefinitionsSecretsDetails extends js.Object {
    var Name: js.UndefOr[NonEmptyString]
    var ValueFrom: js.UndefOr[NonEmptyString]
  }

  object AwsEcsTaskDefinitionContainerDefinitionsSecretsDetails {
    @inline
    def apply(
        Name: js.UndefOr[NonEmptyString] = js.undefined,
        ValueFrom: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEcsTaskDefinitionContainerDefinitionsSecretsDetails = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ValueFrom.foreach(__v => __obj.updateDynamic("ValueFrom")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEcsTaskDefinitionContainerDefinitionsSecretsDetails]
    }
  }

  /** A namespaced kernel parameter to set in the container.
    */
  @js.native
  trait AwsEcsTaskDefinitionContainerDefinitionsSystemControlsDetails extends js.Object {
    var Namespace: js.UndefOr[NonEmptyString]
    var Value: js.UndefOr[NonEmptyString]
  }

  object AwsEcsTaskDefinitionContainerDefinitionsSystemControlsDetails {
    @inline
    def apply(
        Namespace: js.UndefOr[NonEmptyString] = js.undefined,
        Value: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEcsTaskDefinitionContainerDefinitionsSystemControlsDetails = {
      val __obj = js.Dynamic.literal()
      Namespace.foreach(__v => __obj.updateDynamic("Namespace")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEcsTaskDefinitionContainerDefinitionsSystemControlsDetails]
    }
  }

  /** A ulimit to set in the container.
    */
  @js.native
  trait AwsEcsTaskDefinitionContainerDefinitionsUlimitsDetails extends js.Object {
    var HardLimit: js.UndefOr[Int]
    var Name: js.UndefOr[NonEmptyString]
    var SoftLimit: js.UndefOr[Int]
  }

  object AwsEcsTaskDefinitionContainerDefinitionsUlimitsDetails {
    @inline
    def apply(
        HardLimit: js.UndefOr[Int] = js.undefined,
        Name: js.UndefOr[NonEmptyString] = js.undefined,
        SoftLimit: js.UndefOr[Int] = js.undefined
    ): AwsEcsTaskDefinitionContainerDefinitionsUlimitsDetails = {
      val __obj = js.Dynamic.literal()
      HardLimit.foreach(__v => __obj.updateDynamic("HardLimit")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      SoftLimit.foreach(__v => __obj.updateDynamic("SoftLimit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEcsTaskDefinitionContainerDefinitionsUlimitsDetails]
    }
  }

  /** A data volume to mount from another container.
    */
  @js.native
  trait AwsEcsTaskDefinitionContainerDefinitionsVolumesFromDetails extends js.Object {
    var ReadOnly: js.UndefOr[Boolean]
    var SourceContainer: js.UndefOr[NonEmptyString]
  }

  object AwsEcsTaskDefinitionContainerDefinitionsVolumesFromDetails {
    @inline
    def apply(
        ReadOnly: js.UndefOr[Boolean] = js.undefined,
        SourceContainer: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEcsTaskDefinitionContainerDefinitionsVolumesFromDetails = {
      val __obj = js.Dynamic.literal()
      ReadOnly.foreach(__v => __obj.updateDynamic("ReadOnly")(__v.asInstanceOf[js.Any]))
      SourceContainer.foreach(__v => __obj.updateDynamic("SourceContainer")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEcsTaskDefinitionContainerDefinitionsVolumesFromDetails]
    }
  }

  /** Details about a task definition. A task definition describes the container and volume definitions of an Amazon Elastic Container Service task.
    */
  @js.native
  trait AwsEcsTaskDefinitionDetails extends js.Object {
    var ContainerDefinitions: js.UndefOr[AwsEcsTaskDefinitionContainerDefinitionsList]
    var Cpu: js.UndefOr[NonEmptyString]
    var ExecutionRoleArn: js.UndefOr[NonEmptyString]
    var Family: js.UndefOr[NonEmptyString]
    var InferenceAccelerators: js.UndefOr[AwsEcsTaskDefinitionInferenceAcceleratorsList]
    var IpcMode: js.UndefOr[NonEmptyString]
    var Memory: js.UndefOr[NonEmptyString]
    var NetworkMode: js.UndefOr[NonEmptyString]
    var PidMode: js.UndefOr[NonEmptyString]
    var PlacementConstraints: js.UndefOr[AwsEcsTaskDefinitionPlacementConstraintsList]
    var ProxyConfiguration: js.UndefOr[AwsEcsTaskDefinitionProxyConfigurationDetails]
    var RequiresCompatibilities: js.UndefOr[NonEmptyStringList]
    var TaskRoleArn: js.UndefOr[NonEmptyString]
    var Volumes: js.UndefOr[AwsEcsTaskDefinitionVolumesList]
  }

  object AwsEcsTaskDefinitionDetails {
    @inline
    def apply(
        ContainerDefinitions: js.UndefOr[AwsEcsTaskDefinitionContainerDefinitionsList] = js.undefined,
        Cpu: js.UndefOr[NonEmptyString] = js.undefined,
        ExecutionRoleArn: js.UndefOr[NonEmptyString] = js.undefined,
        Family: js.UndefOr[NonEmptyString] = js.undefined,
        InferenceAccelerators: js.UndefOr[AwsEcsTaskDefinitionInferenceAcceleratorsList] = js.undefined,
        IpcMode: js.UndefOr[NonEmptyString] = js.undefined,
        Memory: js.UndefOr[NonEmptyString] = js.undefined,
        NetworkMode: js.UndefOr[NonEmptyString] = js.undefined,
        PidMode: js.UndefOr[NonEmptyString] = js.undefined,
        PlacementConstraints: js.UndefOr[AwsEcsTaskDefinitionPlacementConstraintsList] = js.undefined,
        ProxyConfiguration: js.UndefOr[AwsEcsTaskDefinitionProxyConfigurationDetails] = js.undefined,
        RequiresCompatibilities: js.UndefOr[NonEmptyStringList] = js.undefined,
        TaskRoleArn: js.UndefOr[NonEmptyString] = js.undefined,
        Volumes: js.UndefOr[AwsEcsTaskDefinitionVolumesList] = js.undefined
    ): AwsEcsTaskDefinitionDetails = {
      val __obj = js.Dynamic.literal()
      ContainerDefinitions.foreach(__v => __obj.updateDynamic("ContainerDefinitions")(__v.asInstanceOf[js.Any]))
      Cpu.foreach(__v => __obj.updateDynamic("Cpu")(__v.asInstanceOf[js.Any]))
      ExecutionRoleArn.foreach(__v => __obj.updateDynamic("ExecutionRoleArn")(__v.asInstanceOf[js.Any]))
      Family.foreach(__v => __obj.updateDynamic("Family")(__v.asInstanceOf[js.Any]))
      InferenceAccelerators.foreach(__v => __obj.updateDynamic("InferenceAccelerators")(__v.asInstanceOf[js.Any]))
      IpcMode.foreach(__v => __obj.updateDynamic("IpcMode")(__v.asInstanceOf[js.Any]))
      Memory.foreach(__v => __obj.updateDynamic("Memory")(__v.asInstanceOf[js.Any]))
      NetworkMode.foreach(__v => __obj.updateDynamic("NetworkMode")(__v.asInstanceOf[js.Any]))
      PidMode.foreach(__v => __obj.updateDynamic("PidMode")(__v.asInstanceOf[js.Any]))
      PlacementConstraints.foreach(__v => __obj.updateDynamic("PlacementConstraints")(__v.asInstanceOf[js.Any]))
      ProxyConfiguration.foreach(__v => __obj.updateDynamic("ProxyConfiguration")(__v.asInstanceOf[js.Any]))
      RequiresCompatibilities.foreach(__v => __obj.updateDynamic("RequiresCompatibilities")(__v.asInstanceOf[js.Any]))
      TaskRoleArn.foreach(__v => __obj.updateDynamic("TaskRoleArn")(__v.asInstanceOf[js.Any]))
      Volumes.foreach(__v => __obj.updateDynamic("Volumes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEcsTaskDefinitionDetails]
    }
  }

  /** An Elastic Inference accelerator to use for the containers in the task.
    */
  @js.native
  trait AwsEcsTaskDefinitionInferenceAcceleratorsDetails extends js.Object {
    var DeviceName: js.UndefOr[NonEmptyString]
    var DeviceType: js.UndefOr[NonEmptyString]
  }

  object AwsEcsTaskDefinitionInferenceAcceleratorsDetails {
    @inline
    def apply(
        DeviceName: js.UndefOr[NonEmptyString] = js.undefined,
        DeviceType: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEcsTaskDefinitionInferenceAcceleratorsDetails = {
      val __obj = js.Dynamic.literal()
      DeviceName.foreach(__v => __obj.updateDynamic("DeviceName")(__v.asInstanceOf[js.Any]))
      DeviceType.foreach(__v => __obj.updateDynamic("DeviceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEcsTaskDefinitionInferenceAcceleratorsDetails]
    }
  }

  /** A placement constraint object to use for tasks.
    */
  @js.native
  trait AwsEcsTaskDefinitionPlacementConstraintsDetails extends js.Object {
    var Expression: js.UndefOr[NonEmptyString]
    var Type: js.UndefOr[NonEmptyString]
  }

  object AwsEcsTaskDefinitionPlacementConstraintsDetails {
    @inline
    def apply(
        Expression: js.UndefOr[NonEmptyString] = js.undefined,
        Type: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEcsTaskDefinitionPlacementConstraintsDetails = {
      val __obj = js.Dynamic.literal()
      Expression.foreach(__v => __obj.updateDynamic("Expression")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEcsTaskDefinitionPlacementConstraintsDetails]
    }
  }

  /** The configuration details for the App Mesh proxy.
    */
  @js.native
  trait AwsEcsTaskDefinitionProxyConfigurationDetails extends js.Object {
    var ContainerName: js.UndefOr[NonEmptyString]
    var ProxyConfigurationProperties: js.UndefOr[AwsEcsTaskDefinitionProxyConfigurationProxyConfigurationPropertiesList]
    var Type: js.UndefOr[NonEmptyString]
  }

  object AwsEcsTaskDefinitionProxyConfigurationDetails {
    @inline
    def apply(
        ContainerName: js.UndefOr[NonEmptyString] = js.undefined,
        ProxyConfigurationProperties: js.UndefOr[AwsEcsTaskDefinitionProxyConfigurationProxyConfigurationPropertiesList] = js.undefined,
        Type: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEcsTaskDefinitionProxyConfigurationDetails = {
      val __obj = js.Dynamic.literal()
      ContainerName.foreach(__v => __obj.updateDynamic("ContainerName")(__v.asInstanceOf[js.Any]))
      ProxyConfigurationProperties.foreach(__v => __obj.updateDynamic("ProxyConfigurationProperties")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEcsTaskDefinitionProxyConfigurationDetails]
    }
  }

  /** A network configuration parameter to provide to the Container Network Interface (CNI) plugin.
    */
  @js.native
  trait AwsEcsTaskDefinitionProxyConfigurationProxyConfigurationPropertiesDetails extends js.Object {
    var Name: js.UndefOr[NonEmptyString]
    var Value: js.UndefOr[NonEmptyString]
  }

  object AwsEcsTaskDefinitionProxyConfigurationProxyConfigurationPropertiesDetails {
    @inline
    def apply(
        Name: js.UndefOr[NonEmptyString] = js.undefined,
        Value: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEcsTaskDefinitionProxyConfigurationProxyConfigurationPropertiesDetails = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEcsTaskDefinitionProxyConfigurationProxyConfigurationPropertiesDetails]
    }
  }

  /** A data volume to mount from another container.
    */
  @js.native
  trait AwsEcsTaskDefinitionVolumesDetails extends js.Object {
    var DockerVolumeConfiguration: js.UndefOr[AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails]
    var EfsVolumeConfiguration: js.UndefOr[AwsEcsTaskDefinitionVolumesEfsVolumeConfigurationDetails]
    var Host: js.UndefOr[AwsEcsTaskDefinitionVolumesHostDetails]
    var Name: js.UndefOr[NonEmptyString]
  }

  object AwsEcsTaskDefinitionVolumesDetails {
    @inline
    def apply(
        DockerVolumeConfiguration: js.UndefOr[AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails] = js.undefined,
        EfsVolumeConfiguration: js.UndefOr[AwsEcsTaskDefinitionVolumesEfsVolumeConfigurationDetails] = js.undefined,
        Host: js.UndefOr[AwsEcsTaskDefinitionVolumesHostDetails] = js.undefined,
        Name: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEcsTaskDefinitionVolumesDetails = {
      val __obj = js.Dynamic.literal()
      DockerVolumeConfiguration.foreach(__v => __obj.updateDynamic("DockerVolumeConfiguration")(__v.asInstanceOf[js.Any]))
      EfsVolumeConfiguration.foreach(__v => __obj.updateDynamic("EfsVolumeConfiguration")(__v.asInstanceOf[js.Any]))
      Host.foreach(__v => __obj.updateDynamic("Host")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEcsTaskDefinitionVolumesDetails]
    }
  }

  /** Information about a Docker volume.
    */
  @js.native
  trait AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails extends js.Object {
    var Autoprovision: js.UndefOr[Boolean]
    var Driver: js.UndefOr[NonEmptyString]
    var DriverOpts: js.UndefOr[FieldMap]
    var Labels: js.UndefOr[FieldMap]
    var Scope: js.UndefOr[NonEmptyString]
  }

  object AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails {
    @inline
    def apply(
        Autoprovision: js.UndefOr[Boolean] = js.undefined,
        Driver: js.UndefOr[NonEmptyString] = js.undefined,
        DriverOpts: js.UndefOr[FieldMap] = js.undefined,
        Labels: js.UndefOr[FieldMap] = js.undefined,
        Scope: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails = {
      val __obj = js.Dynamic.literal()
      Autoprovision.foreach(__v => __obj.updateDynamic("Autoprovision")(__v.asInstanceOf[js.Any]))
      Driver.foreach(__v => __obj.updateDynamic("Driver")(__v.asInstanceOf[js.Any]))
      DriverOpts.foreach(__v => __obj.updateDynamic("DriverOpts")(__v.asInstanceOf[js.Any]))
      Labels.foreach(__v => __obj.updateDynamic("Labels")(__v.asInstanceOf[js.Any]))
      Scope.foreach(__v => __obj.updateDynamic("Scope")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails]
    }
  }

  /** <p/>
    */
  @js.native
  trait AwsEcsTaskDefinitionVolumesEfsVolumeConfigurationAuthorizationConfigDetails extends js.Object {
    var AccessPointId: js.UndefOr[NonEmptyString]
    var Iam: js.UndefOr[NonEmptyString]
  }

  object AwsEcsTaskDefinitionVolumesEfsVolumeConfigurationAuthorizationConfigDetails {
    @inline
    def apply(
        AccessPointId: js.UndefOr[NonEmptyString] = js.undefined,
        Iam: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEcsTaskDefinitionVolumesEfsVolumeConfigurationAuthorizationConfigDetails = {
      val __obj = js.Dynamic.literal()
      AccessPointId.foreach(__v => __obj.updateDynamic("AccessPointId")(__v.asInstanceOf[js.Any]))
      Iam.foreach(__v => __obj.updateDynamic("Iam")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEcsTaskDefinitionVolumesEfsVolumeConfigurationAuthorizationConfigDetails]
    }
  }

  /** Information about the Amazon Elastic File System file system that is used for task storage.
    */
  @js.native
  trait AwsEcsTaskDefinitionVolumesEfsVolumeConfigurationDetails extends js.Object {
    var AuthorizationConfig: js.UndefOr[AwsEcsTaskDefinitionVolumesEfsVolumeConfigurationAuthorizationConfigDetails]
    var FilesystemId: js.UndefOr[NonEmptyString]
    var RootDirectory: js.UndefOr[NonEmptyString]
    var TransitEncryption: js.UndefOr[NonEmptyString]
    var TransitEncryptionPort: js.UndefOr[Int]
  }

  object AwsEcsTaskDefinitionVolumesEfsVolumeConfigurationDetails {
    @inline
    def apply(
        AuthorizationConfig: js.UndefOr[AwsEcsTaskDefinitionVolumesEfsVolumeConfigurationAuthorizationConfigDetails] = js.undefined,
        FilesystemId: js.UndefOr[NonEmptyString] = js.undefined,
        RootDirectory: js.UndefOr[NonEmptyString] = js.undefined,
        TransitEncryption: js.UndefOr[NonEmptyString] = js.undefined,
        TransitEncryptionPort: js.UndefOr[Int] = js.undefined
    ): AwsEcsTaskDefinitionVolumesEfsVolumeConfigurationDetails = {
      val __obj = js.Dynamic.literal()
      AuthorizationConfig.foreach(__v => __obj.updateDynamic("AuthorizationConfig")(__v.asInstanceOf[js.Any]))
      FilesystemId.foreach(__v => __obj.updateDynamic("FilesystemId")(__v.asInstanceOf[js.Any]))
      RootDirectory.foreach(__v => __obj.updateDynamic("RootDirectory")(__v.asInstanceOf[js.Any]))
      TransitEncryption.foreach(__v => __obj.updateDynamic("TransitEncryption")(__v.asInstanceOf[js.Any]))
      TransitEncryptionPort.foreach(__v => __obj.updateDynamic("TransitEncryptionPort")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEcsTaskDefinitionVolumesEfsVolumeConfigurationDetails]
    }
  }

  /** Information about a bind mount host volume.
    */
  @js.native
  trait AwsEcsTaskDefinitionVolumesHostDetails extends js.Object {
    var SourcePath: js.UndefOr[NonEmptyString]
  }

  object AwsEcsTaskDefinitionVolumesHostDetails {
    @inline
    def apply(
        SourcePath: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEcsTaskDefinitionVolumesHostDetails = {
      val __obj = js.Dynamic.literal()
      SourcePath.foreach(__v => __obj.updateDynamic("SourcePath")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEcsTaskDefinitionVolumesHostDetails]
    }
  }

  /** Provides details about a task in a cluster.
    */
  @js.native
  trait AwsEcsTaskDetails extends js.Object {
    var ClusterArn: js.UndefOr[NonEmptyString]
    var Containers: js.UndefOr[AwsEcsContainerDetailsList]
    var CreatedAt: js.UndefOr[NonEmptyString]
    var Group: js.UndefOr[NonEmptyString]
    var StartedAt: js.UndefOr[NonEmptyString]
    var StartedBy: js.UndefOr[NonEmptyString]
    var TaskDefinitionArn: js.UndefOr[NonEmptyString]
    var Version: js.UndefOr[NonEmptyString]
    var Volumes: js.UndefOr[AwsEcsTaskVolumeDetailsList]
  }

  object AwsEcsTaskDetails {
    @inline
    def apply(
        ClusterArn: js.UndefOr[NonEmptyString] = js.undefined,
        Containers: js.UndefOr[AwsEcsContainerDetailsList] = js.undefined,
        CreatedAt: js.UndefOr[NonEmptyString] = js.undefined,
        Group: js.UndefOr[NonEmptyString] = js.undefined,
        StartedAt: js.UndefOr[NonEmptyString] = js.undefined,
        StartedBy: js.UndefOr[NonEmptyString] = js.undefined,
        TaskDefinitionArn: js.UndefOr[NonEmptyString] = js.undefined,
        Version: js.UndefOr[NonEmptyString] = js.undefined,
        Volumes: js.UndefOr[AwsEcsTaskVolumeDetailsList] = js.undefined
    ): AwsEcsTaskDetails = {
      val __obj = js.Dynamic.literal()
      ClusterArn.foreach(__v => __obj.updateDynamic("ClusterArn")(__v.asInstanceOf[js.Any]))
      Containers.foreach(__v => __obj.updateDynamic("Containers")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      Group.foreach(__v => __obj.updateDynamic("Group")(__v.asInstanceOf[js.Any]))
      StartedAt.foreach(__v => __obj.updateDynamic("StartedAt")(__v.asInstanceOf[js.Any]))
      StartedBy.foreach(__v => __obj.updateDynamic("StartedBy")(__v.asInstanceOf[js.Any]))
      TaskDefinitionArn.foreach(__v => __obj.updateDynamic("TaskDefinitionArn")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      Volumes.foreach(__v => __obj.updateDynamic("Volumes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEcsTaskDetails]
    }
  }

  /** Provides information about a data volume that's used in a task definition.
    */
  @js.native
  trait AwsEcsTaskVolumeDetails extends js.Object {
    var Host: js.UndefOr[AwsEcsTaskVolumeHostDetails]
    var Name: js.UndefOr[NonEmptyString]
  }

  object AwsEcsTaskVolumeDetails {
    @inline
    def apply(
        Host: js.UndefOr[AwsEcsTaskVolumeHostDetails] = js.undefined,
        Name: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEcsTaskVolumeDetails = {
      val __obj = js.Dynamic.literal()
      Host.foreach(__v => __obj.updateDynamic("Host")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEcsTaskVolumeDetails]
    }
  }

  /** Provides details on a container instance bind mount host volume.
    */
  @js.native
  trait AwsEcsTaskVolumeHostDetails extends js.Object {
    var SourcePath: js.UndefOr[NonEmptyString]
  }

  object AwsEcsTaskVolumeHostDetails {
    @inline
    def apply(
        SourcePath: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEcsTaskVolumeHostDetails = {
      val __obj = js.Dynamic.literal()
      SourcePath.foreach(__v => __obj.updateDynamic("SourcePath")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEcsTaskVolumeHostDetails]
    }
  }

  /** Provides information about an Amazon EFS access point.
    */
  @js.native
  trait AwsEfsAccessPointDetails extends js.Object {
    var AccessPointId: js.UndefOr[NonEmptyString]
    var Arn: js.UndefOr[NonEmptyString]
    var ClientToken: js.UndefOr[NonEmptyString]
    var FileSystemId: js.UndefOr[NonEmptyString]
    var PosixUser: js.UndefOr[AwsEfsAccessPointPosixUserDetails]
    var RootDirectory: js.UndefOr[AwsEfsAccessPointRootDirectoryDetails]
  }

  object AwsEfsAccessPointDetails {
    @inline
    def apply(
        AccessPointId: js.UndefOr[NonEmptyString] = js.undefined,
        Arn: js.UndefOr[NonEmptyString] = js.undefined,
        ClientToken: js.UndefOr[NonEmptyString] = js.undefined,
        FileSystemId: js.UndefOr[NonEmptyString] = js.undefined,
        PosixUser: js.UndefOr[AwsEfsAccessPointPosixUserDetails] = js.undefined,
        RootDirectory: js.UndefOr[AwsEfsAccessPointRootDirectoryDetails] = js.undefined
    ): AwsEfsAccessPointDetails = {
      val __obj = js.Dynamic.literal()
      AccessPointId.foreach(__v => __obj.updateDynamic("AccessPointId")(__v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      FileSystemId.foreach(__v => __obj.updateDynamic("FileSystemId")(__v.asInstanceOf[js.Any]))
      PosixUser.foreach(__v => __obj.updateDynamic("PosixUser")(__v.asInstanceOf[js.Any]))
      RootDirectory.foreach(__v => __obj.updateDynamic("RootDirectory")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEfsAccessPointDetails]
    }
  }

  /** Provides details for all file system operations using this Amazon EFS access point.
    */
  @js.native
  trait AwsEfsAccessPointPosixUserDetails extends js.Object {
    var Gid: js.UndefOr[NonEmptyString]
    var SecondaryGids: js.UndefOr[NonEmptyStringList]
    var Uid: js.UndefOr[NonEmptyString]
  }

  object AwsEfsAccessPointPosixUserDetails {
    @inline
    def apply(
        Gid: js.UndefOr[NonEmptyString] = js.undefined,
        SecondaryGids: js.UndefOr[NonEmptyStringList] = js.undefined,
        Uid: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEfsAccessPointPosixUserDetails = {
      val __obj = js.Dynamic.literal()
      Gid.foreach(__v => __obj.updateDynamic("Gid")(__v.asInstanceOf[js.Any]))
      SecondaryGids.foreach(__v => __obj.updateDynamic("SecondaryGids")(__v.asInstanceOf[js.Any]))
      Uid.foreach(__v => __obj.updateDynamic("Uid")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEfsAccessPointPosixUserDetails]
    }
  }

  /** Provides information about the settings that Amazon EFS uses to create the root directory when a client connects to an access point.
    */
  @js.native
  trait AwsEfsAccessPointRootDirectoryCreationInfoDetails extends js.Object {
    var OwnerGid: js.UndefOr[NonEmptyString]
    var OwnerUid: js.UndefOr[NonEmptyString]
    var Permissions: js.UndefOr[NonEmptyString]
  }

  object AwsEfsAccessPointRootDirectoryCreationInfoDetails {
    @inline
    def apply(
        OwnerGid: js.UndefOr[NonEmptyString] = js.undefined,
        OwnerUid: js.UndefOr[NonEmptyString] = js.undefined,
        Permissions: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEfsAccessPointRootDirectoryCreationInfoDetails = {
      val __obj = js.Dynamic.literal()
      OwnerGid.foreach(__v => __obj.updateDynamic("OwnerGid")(__v.asInstanceOf[js.Any]))
      OwnerUid.foreach(__v => __obj.updateDynamic("OwnerUid")(__v.asInstanceOf[js.Any]))
      Permissions.foreach(__v => __obj.updateDynamic("Permissions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEfsAccessPointRootDirectoryCreationInfoDetails]
    }
  }

  /** Provides information about the directory on the Amazon EFS file system that the access point exposes as the root directory to NFS clients using the access point.
    */
  @js.native
  trait AwsEfsAccessPointRootDirectoryDetails extends js.Object {
    var CreationInfo: js.UndefOr[AwsEfsAccessPointRootDirectoryCreationInfoDetails]
    var Path: js.UndefOr[NonEmptyString]
  }

  object AwsEfsAccessPointRootDirectoryDetails {
    @inline
    def apply(
        CreationInfo: js.UndefOr[AwsEfsAccessPointRootDirectoryCreationInfoDetails] = js.undefined,
        Path: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEfsAccessPointRootDirectoryDetails = {
      val __obj = js.Dynamic.literal()
      CreationInfo.foreach(__v => __obj.updateDynamic("CreationInfo")(__v.asInstanceOf[js.Any]))
      Path.foreach(__v => __obj.updateDynamic("Path")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEfsAccessPointRootDirectoryDetails]
    }
  }

  /** Provides details about an Amazon EKS cluster.
    */
  @js.native
  trait AwsEksClusterDetails extends js.Object {
    var Arn: js.UndefOr[NonEmptyString]
    var CertificateAuthorityData: js.UndefOr[NonEmptyString]
    var ClusterStatus: js.UndefOr[NonEmptyString]
    var Endpoint: js.UndefOr[NonEmptyString]
    var Logging: js.UndefOr[AwsEksClusterLoggingDetails]
    var Name: js.UndefOr[NonEmptyString]
    var ResourcesVpcConfig: js.UndefOr[AwsEksClusterResourcesVpcConfigDetails]
    var RoleArn: js.UndefOr[NonEmptyString]
    var Version: js.UndefOr[NonEmptyString]
  }

  object AwsEksClusterDetails {
    @inline
    def apply(
        Arn: js.UndefOr[NonEmptyString] = js.undefined,
        CertificateAuthorityData: js.UndefOr[NonEmptyString] = js.undefined,
        ClusterStatus: js.UndefOr[NonEmptyString] = js.undefined,
        Endpoint: js.UndefOr[NonEmptyString] = js.undefined,
        Logging: js.UndefOr[AwsEksClusterLoggingDetails] = js.undefined,
        Name: js.UndefOr[NonEmptyString] = js.undefined,
        ResourcesVpcConfig: js.UndefOr[AwsEksClusterResourcesVpcConfigDetails] = js.undefined,
        RoleArn: js.UndefOr[NonEmptyString] = js.undefined,
        Version: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsEksClusterDetails = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CertificateAuthorityData.foreach(__v => __obj.updateDynamic("CertificateAuthorityData")(__v.asInstanceOf[js.Any]))
      ClusterStatus.foreach(__v => __obj.updateDynamic("ClusterStatus")(__v.asInstanceOf[js.Any]))
      Endpoint.foreach(__v => __obj.updateDynamic("Endpoint")(__v.asInstanceOf[js.Any]))
      Logging.foreach(__v => __obj.updateDynamic("Logging")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ResourcesVpcConfig.foreach(__v => __obj.updateDynamic("ResourcesVpcConfig")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEksClusterDetails]
    }
  }

  /** Details for a cluster logging configuration.
    */
  @js.native
  trait AwsEksClusterLoggingClusterLoggingDetails extends js.Object {
    var Enabled: js.UndefOr[Boolean]
    var Types: js.UndefOr[NonEmptyStringList]
  }

  object AwsEksClusterLoggingClusterLoggingDetails {
    @inline
    def apply(
        Enabled: js.UndefOr[Boolean] = js.undefined,
        Types: js.UndefOr[NonEmptyStringList] = js.undefined
    ): AwsEksClusterLoggingClusterLoggingDetails = {
      val __obj = js.Dynamic.literal()
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      Types.foreach(__v => __obj.updateDynamic("Types")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEksClusterLoggingClusterLoggingDetails]
    }
  }

  /** The logging configuration for an Amazon EKS cluster.
    */
  @js.native
  trait AwsEksClusterLoggingDetails extends js.Object {
    var ClusterLogging: js.UndefOr[AwsEksClusterLoggingClusterLoggingList]
  }

  object AwsEksClusterLoggingDetails {
    @inline
    def apply(
        ClusterLogging: js.UndefOr[AwsEksClusterLoggingClusterLoggingList] = js.undefined
    ): AwsEksClusterLoggingDetails = {
      val __obj = js.Dynamic.literal()
      ClusterLogging.foreach(__v => __obj.updateDynamic("ClusterLogging")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEksClusterLoggingDetails]
    }
  }

  /** Information about the VPC configuration used by the cluster control plane.
    */
  @js.native
  trait AwsEksClusterResourcesVpcConfigDetails extends js.Object {
    var SecurityGroupIds: js.UndefOr[NonEmptyStringList]
    var SubnetIds: js.UndefOr[NonEmptyStringList]
  }

  object AwsEksClusterResourcesVpcConfigDetails {
    @inline
    def apply(
        SecurityGroupIds: js.UndefOr[NonEmptyStringList] = js.undefined,
        SubnetIds: js.UndefOr[NonEmptyStringList] = js.undefined
    ): AwsEksClusterResourcesVpcConfigDetails = {
      val __obj = js.Dynamic.literal()
      SecurityGroupIds.foreach(__v => __obj.updateDynamic("SecurityGroupIds")(__v.asInstanceOf[js.Any]))
      SubnetIds.foreach(__v => __obj.updateDynamic("SubnetIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsEksClusterResourcesVpcConfigDetails]
    }
  }

  /** Contains details about an Elastic Beanstalk environment.
    */
  @js.native
  trait AwsElasticBeanstalkEnvironmentDetails extends js.Object {
    var ApplicationName: js.UndefOr[NonEmptyString]
    var Cname: js.UndefOr[NonEmptyString]
    var DateCreated: js.UndefOr[NonEmptyString]
    var DateUpdated: js.UndefOr[NonEmptyString]
    var Description: js.UndefOr[NonEmptyString]
    var EndpointUrl: js.UndefOr[NonEmptyString]
    var EnvironmentArn: js.UndefOr[NonEmptyString]
    var EnvironmentId: js.UndefOr[NonEmptyString]
    var EnvironmentLinks: js.UndefOr[AwsElasticBeanstalkEnvironmentEnvironmentLinks]
    var EnvironmentName: js.UndefOr[NonEmptyString]
    var OptionSettings: js.UndefOr[AwsElasticBeanstalkEnvironmentOptionSettings]
    var PlatformArn: js.UndefOr[NonEmptyString]
    var SolutionStackName: js.UndefOr[NonEmptyString]
    var Status: js.UndefOr[NonEmptyString]
    var Tier: js.UndefOr[AwsElasticBeanstalkEnvironmentTier]
    var VersionLabel: js.UndefOr[NonEmptyString]
  }

  object AwsElasticBeanstalkEnvironmentDetails {
    @inline
    def apply(
        ApplicationName: js.UndefOr[NonEmptyString] = js.undefined,
        Cname: js.UndefOr[NonEmptyString] = js.undefined,
        DateCreated: js.UndefOr[NonEmptyString] = js.undefined,
        DateUpdated: js.UndefOr[NonEmptyString] = js.undefined,
        Description: js.UndefOr[NonEmptyString] = js.undefined,
        EndpointUrl: js.UndefOr[NonEmptyString] = js.undefined,
        EnvironmentArn: js.UndefOr[NonEmptyString] = js.undefined,
        EnvironmentId: js.UndefOr[NonEmptyString] = js.undefined,
        EnvironmentLinks: js.UndefOr[AwsElasticBeanstalkEnvironmentEnvironmentLinks] = js.undefined,
        EnvironmentName: js.UndefOr[NonEmptyString] = js.undefined,
        OptionSettings: js.UndefOr[AwsElasticBeanstalkEnvironmentOptionSettings] = js.undefined,
        PlatformArn: js.UndefOr[NonEmptyString] = js.undefined,
        SolutionStackName: js.UndefOr[NonEmptyString] = js.undefined,
        Status: js.UndefOr[NonEmptyString] = js.undefined,
        Tier: js.UndefOr[AwsElasticBeanstalkEnvironmentTier] = js.undefined,
        VersionLabel: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsElasticBeanstalkEnvironmentDetails = {
      val __obj = js.Dynamic.literal()
      ApplicationName.foreach(__v => __obj.updateDynamic("ApplicationName")(__v.asInstanceOf[js.Any]))
      Cname.foreach(__v => __obj.updateDynamic("Cname")(__v.asInstanceOf[js.Any]))
      DateCreated.foreach(__v => __obj.updateDynamic("DateCreated")(__v.asInstanceOf[js.Any]))
      DateUpdated.foreach(__v => __obj.updateDynamic("DateUpdated")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EndpointUrl.foreach(__v => __obj.updateDynamic("EndpointUrl")(__v.asInstanceOf[js.Any]))
      EnvironmentArn.foreach(__v => __obj.updateDynamic("EnvironmentArn")(__v.asInstanceOf[js.Any]))
      EnvironmentId.foreach(__v => __obj.updateDynamic("EnvironmentId")(__v.asInstanceOf[js.Any]))
      EnvironmentLinks.foreach(__v => __obj.updateDynamic("EnvironmentLinks")(__v.asInstanceOf[js.Any]))
      EnvironmentName.foreach(__v => __obj.updateDynamic("EnvironmentName")(__v.asInstanceOf[js.Any]))
      OptionSettings.foreach(__v => __obj.updateDynamic("OptionSettings")(__v.asInstanceOf[js.Any]))
      PlatformArn.foreach(__v => __obj.updateDynamic("PlatformArn")(__v.asInstanceOf[js.Any]))
      SolutionStackName.foreach(__v => __obj.updateDynamic("SolutionStackName")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Tier.foreach(__v => __obj.updateDynamic("Tier")(__v.asInstanceOf[js.Any]))
      VersionLabel.foreach(__v => __obj.updateDynamic("VersionLabel")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsElasticBeanstalkEnvironmentDetails]
    }
  }

  /** Contains information about a link to another environment that is in the same group.
    */
  @js.native
  trait AwsElasticBeanstalkEnvironmentEnvironmentLink extends js.Object {
    var EnvironmentName: js.UndefOr[NonEmptyString]
    var LinkName: js.UndefOr[NonEmptyString]
  }

  object AwsElasticBeanstalkEnvironmentEnvironmentLink {
    @inline
    def apply(
        EnvironmentName: js.UndefOr[NonEmptyString] = js.undefined,
        LinkName: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsElasticBeanstalkEnvironmentEnvironmentLink = {
      val __obj = js.Dynamic.literal()
      EnvironmentName.foreach(__v => __obj.updateDynamic("EnvironmentName")(__v.asInstanceOf[js.Any]))
      LinkName.foreach(__v => __obj.updateDynamic("LinkName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsElasticBeanstalkEnvironmentEnvironmentLink]
    }
  }

  /** A configuration option setting for the environment.
    */
  @js.native
  trait AwsElasticBeanstalkEnvironmentOptionSetting extends js.Object {
    var Namespace: js.UndefOr[NonEmptyString]
    var OptionName: js.UndefOr[NonEmptyString]
    var ResourceName: js.UndefOr[NonEmptyString]
    var Value: js.UndefOr[NonEmptyString]
  }

  object AwsElasticBeanstalkEnvironmentOptionSetting {
    @inline
    def apply(
        Namespace: js.UndefOr[NonEmptyString] = js.undefined,
        OptionName: js.UndefOr[NonEmptyString] = js.undefined,
        ResourceName: js.UndefOr[NonEmptyString] = js.undefined,
        Value: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsElasticBeanstalkEnvironmentOptionSetting = {
      val __obj = js.Dynamic.literal()
      Namespace.foreach(__v => __obj.updateDynamic("Namespace")(__v.asInstanceOf[js.Any]))
      OptionName.foreach(__v => __obj.updateDynamic("OptionName")(__v.asInstanceOf[js.Any]))
      ResourceName.foreach(__v => __obj.updateDynamic("ResourceName")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsElasticBeanstalkEnvironmentOptionSetting]
    }
  }

  /** Contains information about the tier of the environment.
    */
  @js.native
  trait AwsElasticBeanstalkEnvironmentTier extends js.Object {
    var Name: js.UndefOr[NonEmptyString]
    var Type: js.UndefOr[NonEmptyString]
    var Version: js.UndefOr[NonEmptyString]
  }

  object AwsElasticBeanstalkEnvironmentTier {
    @inline
    def apply(
        Name: js.UndefOr[NonEmptyString] = js.undefined,
        Type: js.UndefOr[NonEmptyString] = js.undefined,
        Version: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsElasticBeanstalkEnvironmentTier = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsElasticBeanstalkEnvironmentTier]
    }
  }

  /** Information about an Elasticsearch domain.
    */
  @js.native
  trait AwsElasticsearchDomainDetails extends js.Object {
    var AccessPolicies: js.UndefOr[NonEmptyString]
    var DomainEndpointOptions: js.UndefOr[AwsElasticsearchDomainDomainEndpointOptions]
    var DomainId: js.UndefOr[NonEmptyString]
    var DomainName: js.UndefOr[NonEmptyString]
    var ElasticsearchClusterConfig: js.UndefOr[AwsElasticsearchDomainElasticsearchClusterConfigDetails]
    var ElasticsearchVersion: js.UndefOr[NonEmptyString]
    var EncryptionAtRestOptions: js.UndefOr[AwsElasticsearchDomainEncryptionAtRestOptions]
    var Endpoint: js.UndefOr[NonEmptyString]
    var Endpoints: js.UndefOr[FieldMap]
    var LogPublishingOptions: js.UndefOr[AwsElasticsearchDomainLogPublishingOptions]
    var NodeToNodeEncryptionOptions: js.UndefOr[AwsElasticsearchDomainNodeToNodeEncryptionOptions]
    var ServiceSoftwareOptions: js.UndefOr[AwsElasticsearchDomainServiceSoftwareOptions]
    var VPCOptions: js.UndefOr[AwsElasticsearchDomainVPCOptions]
  }

  object AwsElasticsearchDomainDetails {
    @inline
    def apply(
        AccessPolicies: js.UndefOr[NonEmptyString] = js.undefined,
        DomainEndpointOptions: js.UndefOr[AwsElasticsearchDomainDomainEndpointOptions] = js.undefined,
        DomainId: js.UndefOr[NonEmptyString] = js.undefined,
        DomainName: js.UndefOr[NonEmptyString] = js.undefined,
        ElasticsearchClusterConfig: js.UndefOr[AwsElasticsearchDomainElasticsearchClusterConfigDetails] = js.undefined,
        ElasticsearchVersion: js.UndefOr[NonEmptyString] = js.undefined,
        EncryptionAtRestOptions: js.UndefOr[AwsElasticsearchDomainEncryptionAtRestOptions] = js.undefined,
        Endpoint: js.UndefOr[NonEmptyString] = js.undefined,
        Endpoints: js.UndefOr[FieldMap] = js.undefined,
        LogPublishingOptions: js.UndefOr[AwsElasticsearchDomainLogPublishingOptions] = js.undefined,
        NodeToNodeEncryptionOptions: js.UndefOr[AwsElasticsearchDomainNodeToNodeEncryptionOptions] = js.undefined,
        ServiceSoftwareOptions: js.UndefOr[AwsElasticsearchDomainServiceSoftwareOptions] = js.undefined,
        VPCOptions: js.UndefOr[AwsElasticsearchDomainVPCOptions] = js.undefined
    ): AwsElasticsearchDomainDetails = {
      val __obj = js.Dynamic.literal()
      AccessPolicies.foreach(__v => __obj.updateDynamic("AccessPolicies")(__v.asInstanceOf[js.Any]))
      DomainEndpointOptions.foreach(__v => __obj.updateDynamic("DomainEndpointOptions")(__v.asInstanceOf[js.Any]))
      DomainId.foreach(__v => __obj.updateDynamic("DomainId")(__v.asInstanceOf[js.Any]))
      DomainName.foreach(__v => __obj.updateDynamic("DomainName")(__v.asInstanceOf[js.Any]))
      ElasticsearchClusterConfig.foreach(__v => __obj.updateDynamic("ElasticsearchClusterConfig")(__v.asInstanceOf[js.Any]))
      ElasticsearchVersion.foreach(__v => __obj.updateDynamic("ElasticsearchVersion")(__v.asInstanceOf[js.Any]))
      EncryptionAtRestOptions.foreach(__v => __obj.updateDynamic("EncryptionAtRestOptions")(__v.asInstanceOf[js.Any]))
      Endpoint.foreach(__v => __obj.updateDynamic("Endpoint")(__v.asInstanceOf[js.Any]))
      Endpoints.foreach(__v => __obj.updateDynamic("Endpoints")(__v.asInstanceOf[js.Any]))
      LogPublishingOptions.foreach(__v => __obj.updateDynamic("LogPublishingOptions")(__v.asInstanceOf[js.Any]))
      NodeToNodeEncryptionOptions.foreach(__v => __obj.updateDynamic("NodeToNodeEncryptionOptions")(__v.asInstanceOf[js.Any]))
      ServiceSoftwareOptions.foreach(__v => __obj.updateDynamic("ServiceSoftwareOptions")(__v.asInstanceOf[js.Any]))
      VPCOptions.foreach(__v => __obj.updateDynamic("VPCOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsElasticsearchDomainDetails]
    }
  }

  /** Additional options for the domain endpoint, such as whether to require HTTPS for all traffic.
    */
  @js.native
  trait AwsElasticsearchDomainDomainEndpointOptions extends js.Object {
    var EnforceHTTPS: js.UndefOr[Boolean]
    var TLSSecurityPolicy: js.UndefOr[NonEmptyString]
  }

  object AwsElasticsearchDomainDomainEndpointOptions {
    @inline
    def apply(
        EnforceHTTPS: js.UndefOr[Boolean] = js.undefined,
        TLSSecurityPolicy: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsElasticsearchDomainDomainEndpointOptions = {
      val __obj = js.Dynamic.literal()
      EnforceHTTPS.foreach(__v => __obj.updateDynamic("EnforceHTTPS")(__v.asInstanceOf[js.Any]))
      TLSSecurityPolicy.foreach(__v => __obj.updateDynamic("TLSSecurityPolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsElasticsearchDomainDomainEndpointOptions]
    }
  }

  /** details about the configuration of an OpenSearch cluster.
    */
  @js.native
  trait AwsElasticsearchDomainElasticsearchClusterConfigDetails extends js.Object {
    var DedicatedMasterCount: js.UndefOr[Int]
    var DedicatedMasterEnabled: js.UndefOr[Boolean]
    var DedicatedMasterType: js.UndefOr[NonEmptyString]
    var InstanceCount: js.UndefOr[Int]
    var InstanceType: js.UndefOr[NonEmptyString]
    var ZoneAwarenessConfig: js.UndefOr[AwsElasticsearchDomainElasticsearchClusterConfigZoneAwarenessConfigDetails]
    var ZoneAwarenessEnabled: js.UndefOr[Boolean]
  }

  object AwsElasticsearchDomainElasticsearchClusterConfigDetails {
    @inline
    def apply(
        DedicatedMasterCount: js.UndefOr[Int] = js.undefined,
        DedicatedMasterEnabled: js.UndefOr[Boolean] = js.undefined,
        DedicatedMasterType: js.UndefOr[NonEmptyString] = js.undefined,
        InstanceCount: js.UndefOr[Int] = js.undefined,
        InstanceType: js.UndefOr[NonEmptyString] = js.undefined,
        ZoneAwarenessConfig: js.UndefOr[AwsElasticsearchDomainElasticsearchClusterConfigZoneAwarenessConfigDetails] = js.undefined,
        ZoneAwarenessEnabled: js.UndefOr[Boolean] = js.undefined
    ): AwsElasticsearchDomainElasticsearchClusterConfigDetails = {
      val __obj = js.Dynamic.literal()
      DedicatedMasterCount.foreach(__v => __obj.updateDynamic("DedicatedMasterCount")(__v.asInstanceOf[js.Any]))
      DedicatedMasterEnabled.foreach(__v => __obj.updateDynamic("DedicatedMasterEnabled")(__v.asInstanceOf[js.Any]))
      DedicatedMasterType.foreach(__v => __obj.updateDynamic("DedicatedMasterType")(__v.asInstanceOf[js.Any]))
      InstanceCount.foreach(__v => __obj.updateDynamic("InstanceCount")(__v.asInstanceOf[js.Any]))
      InstanceType.foreach(__v => __obj.updateDynamic("InstanceType")(__v.asInstanceOf[js.Any]))
      ZoneAwarenessConfig.foreach(__v => __obj.updateDynamic("ZoneAwarenessConfig")(__v.asInstanceOf[js.Any]))
      ZoneAwarenessEnabled.foreach(__v => __obj.updateDynamic("ZoneAwarenessEnabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsElasticsearchDomainElasticsearchClusterConfigDetails]
    }
  }

  /** Configuration options for zone awareness.
    */
  @js.native
  trait AwsElasticsearchDomainElasticsearchClusterConfigZoneAwarenessConfigDetails extends js.Object {
    var AvailabilityZoneCount: js.UndefOr[Int]
  }

  object AwsElasticsearchDomainElasticsearchClusterConfigZoneAwarenessConfigDetails {
    @inline
    def apply(
        AvailabilityZoneCount: js.UndefOr[Int] = js.undefined
    ): AwsElasticsearchDomainElasticsearchClusterConfigZoneAwarenessConfigDetails = {
      val __obj = js.Dynamic.literal()
      AvailabilityZoneCount.foreach(__v => __obj.updateDynamic("AvailabilityZoneCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsElasticsearchDomainElasticsearchClusterConfigZoneAwarenessConfigDetails]
    }
  }

  /** Details about the configuration for encryption at rest.
    */
  @js.native
  trait AwsElasticsearchDomainEncryptionAtRestOptions extends js.Object {
    var Enabled: js.UndefOr[Boolean]
    var KmsKeyId: js.UndefOr[NonEmptyString]
  }

  object AwsElasticsearchDomainEncryptionAtRestOptions {
    @inline
    def apply(
        Enabled: js.UndefOr[Boolean] = js.undefined,
        KmsKeyId: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsElasticsearchDomainEncryptionAtRestOptions = {
      val __obj = js.Dynamic.literal()
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsElasticsearchDomainEncryptionAtRestOptions]
    }
  }

  /** configures the CloudWatch Logs to publish for the Elasticsearch domain.
    */
  @js.native
  trait AwsElasticsearchDomainLogPublishingOptions extends js.Object {
    var AuditLogs: js.UndefOr[AwsElasticsearchDomainLogPublishingOptionsLogConfig]
    var IndexSlowLogs: js.UndefOr[AwsElasticsearchDomainLogPublishingOptionsLogConfig]
    var SearchSlowLogs: js.UndefOr[AwsElasticsearchDomainLogPublishingOptionsLogConfig]
  }

  object AwsElasticsearchDomainLogPublishingOptions {
    @inline
    def apply(
        AuditLogs: js.UndefOr[AwsElasticsearchDomainLogPublishingOptionsLogConfig] = js.undefined,
        IndexSlowLogs: js.UndefOr[AwsElasticsearchDomainLogPublishingOptionsLogConfig] = js.undefined,
        SearchSlowLogs: js.UndefOr[AwsElasticsearchDomainLogPublishingOptionsLogConfig] = js.undefined
    ): AwsElasticsearchDomainLogPublishingOptions = {
      val __obj = js.Dynamic.literal()
      AuditLogs.foreach(__v => __obj.updateDynamic("AuditLogs")(__v.asInstanceOf[js.Any]))
      IndexSlowLogs.foreach(__v => __obj.updateDynamic("IndexSlowLogs")(__v.asInstanceOf[js.Any]))
      SearchSlowLogs.foreach(__v => __obj.updateDynamic("SearchSlowLogs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsElasticsearchDomainLogPublishingOptions]
    }
  }

  /** The log configuration.
    */
  @js.native
  trait AwsElasticsearchDomainLogPublishingOptionsLogConfig extends js.Object {
    var CloudWatchLogsLogGroupArn: js.UndefOr[NonEmptyString]
    var Enabled: js.UndefOr[Boolean]
  }

  object AwsElasticsearchDomainLogPublishingOptionsLogConfig {
    @inline
    def apply(
        CloudWatchLogsLogGroupArn: js.UndefOr[NonEmptyString] = js.undefined,
        Enabled: js.UndefOr[Boolean] = js.undefined
    ): AwsElasticsearchDomainLogPublishingOptionsLogConfig = {
      val __obj = js.Dynamic.literal()
      CloudWatchLogsLogGroupArn.foreach(__v => __obj.updateDynamic("CloudWatchLogsLogGroupArn")(__v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsElasticsearchDomainLogPublishingOptionsLogConfig]
    }
  }

  /** Details about the configuration for node-to-node encryption.
    */
  @js.native
  trait AwsElasticsearchDomainNodeToNodeEncryptionOptions extends js.Object {
    var Enabled: js.UndefOr[Boolean]
  }

  object AwsElasticsearchDomainNodeToNodeEncryptionOptions {
    @inline
    def apply(
        Enabled: js.UndefOr[Boolean] = js.undefined
    ): AwsElasticsearchDomainNodeToNodeEncryptionOptions = {
      val __obj = js.Dynamic.literal()
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsElasticsearchDomainNodeToNodeEncryptionOptions]
    }
  }

  /** Information about the state of the domain relative to the latest service software.
    */
  @js.native
  trait AwsElasticsearchDomainServiceSoftwareOptions extends js.Object {
    var AutomatedUpdateDate: js.UndefOr[NonEmptyString]
    var Cancellable: js.UndefOr[Boolean]
    var CurrentVersion: js.UndefOr[NonEmptyString]
    var Description: js.UndefOr[NonEmptyString]
    var NewVersion: js.UndefOr[NonEmptyString]
    var UpdateAvailable: js.UndefOr[Boolean]
    var UpdateStatus: js.UndefOr[NonEmptyString]
  }

  object AwsElasticsearchDomainServiceSoftwareOptions {
    @inline
    def apply(
        AutomatedUpdateDate: js.UndefOr[NonEmptyString] = js.undefined,
        Cancellable: js.UndefOr[Boolean] = js.undefined,
        CurrentVersion: js.UndefOr[NonEmptyString] = js.undefined,
        Description: js.UndefOr[NonEmptyString] = js.undefined,
        NewVersion: js.UndefOr[NonEmptyString] = js.undefined,
        UpdateAvailable: js.UndefOr[Boolean] = js.undefined,
        UpdateStatus: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsElasticsearchDomainServiceSoftwareOptions = {
      val __obj = js.Dynamic.literal()
      AutomatedUpdateDate.foreach(__v => __obj.updateDynamic("AutomatedUpdateDate")(__v.asInstanceOf[js.Any]))
      Cancellable.foreach(__v => __obj.updateDynamic("Cancellable")(__v.asInstanceOf[js.Any]))
      CurrentVersion.foreach(__v => __obj.updateDynamic("CurrentVersion")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      NewVersion.foreach(__v => __obj.updateDynamic("NewVersion")(__v.asInstanceOf[js.Any]))
      UpdateAvailable.foreach(__v => __obj.updateDynamic("UpdateAvailable")(__v.asInstanceOf[js.Any]))
      UpdateStatus.foreach(__v => __obj.updateDynamic("UpdateStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsElasticsearchDomainServiceSoftwareOptions]
    }
  }

  /** Information that OpenSearch derives based on <code>VPCOptions</code> for the domain.
    */
  @js.native
  trait AwsElasticsearchDomainVPCOptions extends js.Object {
    var AvailabilityZones: js.UndefOr[NonEmptyStringList]
    var SecurityGroupIds: js.UndefOr[NonEmptyStringList]
    var SubnetIds: js.UndefOr[NonEmptyStringList]
    var VPCId: js.UndefOr[NonEmptyString]
  }

  object AwsElasticsearchDomainVPCOptions {
    @inline
    def apply(
        AvailabilityZones: js.UndefOr[NonEmptyStringList] = js.undefined,
        SecurityGroupIds: js.UndefOr[NonEmptyStringList] = js.undefined,
        SubnetIds: js.UndefOr[NonEmptyStringList] = js.undefined,
        VPCId: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsElasticsearchDomainVPCOptions = {
      val __obj = js.Dynamic.literal()
      AvailabilityZones.foreach(__v => __obj.updateDynamic("AvailabilityZones")(__v.asInstanceOf[js.Any]))
      SecurityGroupIds.foreach(__v => __obj.updateDynamic("SecurityGroupIds")(__v.asInstanceOf[js.Any]))
      SubnetIds.foreach(__v => __obj.updateDynamic("SubnetIds")(__v.asInstanceOf[js.Any]))
      VPCId.foreach(__v => __obj.updateDynamic("VPCId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsElasticsearchDomainVPCOptions]
    }
  }

  /** Contains information about a stickiness policy that was created using <code>CreateAppCookieStickinessPolicy</code>.
    */
  @js.native
  trait AwsElbAppCookieStickinessPolicy extends js.Object {
    var CookieName: js.UndefOr[NonEmptyString]
    var PolicyName: js.UndefOr[NonEmptyString]
  }

  object AwsElbAppCookieStickinessPolicy {
    @inline
    def apply(
        CookieName: js.UndefOr[NonEmptyString] = js.undefined,
        PolicyName: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsElbAppCookieStickinessPolicy = {
      val __obj = js.Dynamic.literal()
      CookieName.foreach(__v => __obj.updateDynamic("CookieName")(__v.asInstanceOf[js.Any]))
      PolicyName.foreach(__v => __obj.updateDynamic("PolicyName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsElbAppCookieStickinessPolicy]
    }
  }

  /** Contains information about a stickiness policy that was created using <code>CreateLBCookieStickinessPolicy</code>.
    */
  @js.native
  trait AwsElbLbCookieStickinessPolicy extends js.Object {
    var CookieExpirationPeriod: js.UndefOr[Double]
    var PolicyName: js.UndefOr[NonEmptyString]
  }

  object AwsElbLbCookieStickinessPolicy {
    @inline
    def apply(
        CookieExpirationPeriod: js.UndefOr[Double] = js.undefined,
        PolicyName: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsElbLbCookieStickinessPolicy = {
      val __obj = js.Dynamic.literal()
      CookieExpirationPeriod.foreach(__v => __obj.updateDynamic("CookieExpirationPeriod")(__v.asInstanceOf[js.Any]))
      PolicyName.foreach(__v => __obj.updateDynamic("PolicyName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsElbLbCookieStickinessPolicy]
    }
  }

  /** Contains information about the access log configuration for the load balancer.
    */
  @js.native
  trait AwsElbLoadBalancerAccessLog extends js.Object {
    var EmitInterval: js.UndefOr[Int]
    var Enabled: js.UndefOr[Boolean]
    var S3BucketName: js.UndefOr[NonEmptyString]
    var S3BucketPrefix: js.UndefOr[NonEmptyString]
  }

  object AwsElbLoadBalancerAccessLog {
    @inline
    def apply(
        EmitInterval: js.UndefOr[Int] = js.undefined,
        Enabled: js.UndefOr[Boolean] = js.undefined,
        S3BucketName: js.UndefOr[NonEmptyString] = js.undefined,
        S3BucketPrefix: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsElbLoadBalancerAccessLog = {
      val __obj = js.Dynamic.literal()
      EmitInterval.foreach(__v => __obj.updateDynamic("EmitInterval")(__v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      S3BucketName.foreach(__v => __obj.updateDynamic("S3BucketName")(__v.asInstanceOf[js.Any]))
      S3BucketPrefix.foreach(__v => __obj.updateDynamic("S3BucketPrefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsElbLoadBalancerAccessLog]
    }
  }

  /** Provides information about additional attributes for the load balancer.
    */
  @js.native
  trait AwsElbLoadBalancerAdditionalAttribute extends js.Object {
    var Key: js.UndefOr[NonEmptyString]
    var Value: js.UndefOr[NonEmptyString]
  }

  object AwsElbLoadBalancerAdditionalAttribute {
    @inline
    def apply(
        Key: js.UndefOr[NonEmptyString] = js.undefined,
        Value: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsElbLoadBalancerAdditionalAttribute = {
      val __obj = js.Dynamic.literal()
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsElbLoadBalancerAdditionalAttribute]
    }
  }

  /** Contains attributes for the load balancer.
    */
  @js.native
  trait AwsElbLoadBalancerAttributes extends js.Object {
    var AccessLog: js.UndefOr[AwsElbLoadBalancerAccessLog]
    var AdditionalAttributes: js.UndefOr[AwsElbLoadBalancerAdditionalAttributeList]
    var ConnectionDraining: js.UndefOr[AwsElbLoadBalancerConnectionDraining]
    var ConnectionSettings: js.UndefOr[AwsElbLoadBalancerConnectionSettings]
    var CrossZoneLoadBalancing: js.UndefOr[AwsElbLoadBalancerCrossZoneLoadBalancing]
  }

  object AwsElbLoadBalancerAttributes {
    @inline
    def apply(
        AccessLog: js.UndefOr[AwsElbLoadBalancerAccessLog] = js.undefined,
        AdditionalAttributes: js.UndefOr[AwsElbLoadBalancerAdditionalAttributeList] = js.undefined,
        ConnectionDraining: js.UndefOr[AwsElbLoadBalancerConnectionDraining] = js.undefined,
        ConnectionSettings: js.UndefOr[AwsElbLoadBalancerConnectionSettings] = js.undefined,
        CrossZoneLoadBalancing: js.UndefOr[AwsElbLoadBalancerCrossZoneLoadBalancing] = js.undefined
    ): AwsElbLoadBalancerAttributes = {
      val __obj = js.Dynamic.literal()
      AccessLog.foreach(__v => __obj.updateDynamic("AccessLog")(__v.asInstanceOf[js.Any]))
      AdditionalAttributes.foreach(__v => __obj.updateDynamic("AdditionalAttributes")(__v.asInstanceOf[js.Any]))
      ConnectionDraining.foreach(__v => __obj.updateDynamic("ConnectionDraining")(__v.asInstanceOf[js.Any]))
      ConnectionSettings.foreach(__v => __obj.updateDynamic("ConnectionSettings")(__v.asInstanceOf[js.Any]))
      CrossZoneLoadBalancing.foreach(__v => __obj.updateDynamic("CrossZoneLoadBalancing")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsElbLoadBalancerAttributes]
    }
  }

  /** Provides information about the configuration of an EC2 instance for the load balancer.
    */
  @js.native
  trait AwsElbLoadBalancerBackendServerDescription extends js.Object {
    var InstancePort: js.UndefOr[Int]
    var PolicyNames: js.UndefOr[StringList]
  }

  object AwsElbLoadBalancerBackendServerDescription {
    @inline
    def apply(
        InstancePort: js.UndefOr[Int] = js.undefined,
        PolicyNames: js.UndefOr[StringList] = js.undefined
    ): AwsElbLoadBalancerBackendServerDescription = {
      val __obj = js.Dynamic.literal()
      InstancePort.foreach(__v => __obj.updateDynamic("InstancePort")(__v.asInstanceOf[js.Any]))
      PolicyNames.foreach(__v => __obj.updateDynamic("PolicyNames")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsElbLoadBalancerBackendServerDescription]
    }
  }

  /** Contains information about the connection draining configuration for the load balancer.
    */
  @js.native
  trait AwsElbLoadBalancerConnectionDraining extends js.Object {
    var Enabled: js.UndefOr[Boolean]
    var Timeout: js.UndefOr[Int]
  }

  object AwsElbLoadBalancerConnectionDraining {
    @inline
    def apply(
        Enabled: js.UndefOr[Boolean] = js.undefined,
        Timeout: js.UndefOr[Int] = js.undefined
    ): AwsElbLoadBalancerConnectionDraining = {
      val __obj = js.Dynamic.literal()
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      Timeout.foreach(__v => __obj.updateDynamic("Timeout")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsElbLoadBalancerConnectionDraining]
    }
  }

  /** Contains connection settings for the load balancer.
    */
  @js.native
  trait AwsElbLoadBalancerConnectionSettings extends js.Object {
    var IdleTimeout: js.UndefOr[Int]
  }

  object AwsElbLoadBalancerConnectionSettings {
    @inline
    def apply(
        IdleTimeout: js.UndefOr[Int] = js.undefined
    ): AwsElbLoadBalancerConnectionSettings = {
      val __obj = js.Dynamic.literal()
      IdleTimeout.foreach(__v => __obj.updateDynamic("IdleTimeout")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsElbLoadBalancerConnectionSettings]
    }
  }

  /** Contains cross-zone load balancing settings for the load balancer.
    */
  @js.native
  trait AwsElbLoadBalancerCrossZoneLoadBalancing extends js.Object {
    var Enabled: js.UndefOr[Boolean]
  }

  object AwsElbLoadBalancerCrossZoneLoadBalancing {
    @inline
    def apply(
        Enabled: js.UndefOr[Boolean] = js.undefined
    ): AwsElbLoadBalancerCrossZoneLoadBalancing = {
      val __obj = js.Dynamic.literal()
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsElbLoadBalancerCrossZoneLoadBalancing]
    }
  }

  /** Contains details about a Classic Load Balancer.
    */
  @js.native
  trait AwsElbLoadBalancerDetails extends js.Object {
    var AvailabilityZones: js.UndefOr[StringList]
    var BackendServerDescriptions: js.UndefOr[AwsElbLoadBalancerBackendServerDescriptions]
    var CanonicalHostedZoneName: js.UndefOr[NonEmptyString]
    var CanonicalHostedZoneNameID: js.UndefOr[NonEmptyString]
    var CreatedTime: js.UndefOr[NonEmptyString]
    var DnsName: js.UndefOr[NonEmptyString]
    var HealthCheck: js.UndefOr[AwsElbLoadBalancerHealthCheck]
    var Instances: js.UndefOr[AwsElbLoadBalancerInstances]
    var ListenerDescriptions: js.UndefOr[AwsElbLoadBalancerListenerDescriptions]
    var LoadBalancerAttributes: js.UndefOr[AwsElbLoadBalancerAttributes]
    var LoadBalancerName: js.UndefOr[NonEmptyString]
    var Policies: js.UndefOr[AwsElbLoadBalancerPolicies]
    var Scheme: js.UndefOr[NonEmptyString]
    var SecurityGroups: js.UndefOr[StringList]
    var SourceSecurityGroup: js.UndefOr[AwsElbLoadBalancerSourceSecurityGroup]
    var Subnets: js.UndefOr[StringList]
    var VpcId: js.UndefOr[NonEmptyString]
  }

  object AwsElbLoadBalancerDetails {
    @inline
    def apply(
        AvailabilityZones: js.UndefOr[StringList] = js.undefined,
        BackendServerDescriptions: js.UndefOr[AwsElbLoadBalancerBackendServerDescriptions] = js.undefined,
        CanonicalHostedZoneName: js.UndefOr[NonEmptyString] = js.undefined,
        CanonicalHostedZoneNameID: js.UndefOr[NonEmptyString] = js.undefined,
        CreatedTime: js.UndefOr[NonEmptyString] = js.undefined,
        DnsName: js.UndefOr[NonEmptyString] = js.undefined,
        HealthCheck: js.UndefOr[AwsElbLoadBalancerHealthCheck] = js.undefined,
        Instances: js.UndefOr[AwsElbLoadBalancerInstances] = js.undefined,
        ListenerDescriptions: js.UndefOr[AwsElbLoadBalancerListenerDescriptions] = js.undefined,
        LoadBalancerAttributes: js.UndefOr[AwsElbLoadBalancerAttributes] = js.undefined,
        LoadBalancerName: js.UndefOr[NonEmptyString] = js.undefined,
        Policies: js.UndefOr[AwsElbLoadBalancerPolicies] = js.undefined,
        Scheme: js.UndefOr[NonEmptyString] = js.undefined,
        SecurityGroups: js.UndefOr[StringList] = js.undefined,
        SourceSecurityGroup: js.UndefOr[AwsElbLoadBalancerSourceSecurityGroup] = js.undefined,
        Subnets: js.UndefOr[StringList] = js.undefined,
        VpcId: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsElbLoadBalancerDetails = {
      val __obj = js.Dynamic.literal()
      AvailabilityZones.foreach(__v => __obj.updateDynamic("AvailabilityZones")(__v.asInstanceOf[js.Any]))
      BackendServerDescriptions.foreach(__v => __obj.updateDynamic("BackendServerDescriptions")(__v.asInstanceOf[js.Any]))
      CanonicalHostedZoneName.foreach(__v => __obj.updateDynamic("CanonicalHostedZoneName")(__v.asInstanceOf[js.Any]))
      CanonicalHostedZoneNameID.foreach(__v => __obj.updateDynamic("CanonicalHostedZoneNameID")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      DnsName.foreach(__v => __obj.updateDynamic("DnsName")(__v.asInstanceOf[js.Any]))
      HealthCheck.foreach(__v => __obj.updateDynamic("HealthCheck")(__v.asInstanceOf[js.Any]))
      Instances.foreach(__v => __obj.updateDynamic("Instances")(__v.asInstanceOf[js.Any]))
      ListenerDescriptions.foreach(__v => __obj.updateDynamic("ListenerDescriptions")(__v.asInstanceOf[js.Any]))
      LoadBalancerAttributes.foreach(__v => __obj.updateDynamic("LoadBalancerAttributes")(__v.asInstanceOf[js.Any]))
      LoadBalancerName.foreach(__v => __obj.updateDynamic("LoadBalancerName")(__v.asInstanceOf[js.Any]))
      Policies.foreach(__v => __obj.updateDynamic("Policies")(__v.asInstanceOf[js.Any]))
      Scheme.foreach(__v => __obj.updateDynamic("Scheme")(__v.asInstanceOf[js.Any]))
      SecurityGroups.foreach(__v => __obj.updateDynamic("SecurityGroups")(__v.asInstanceOf[js.Any]))
      SourceSecurityGroup.foreach(__v => __obj.updateDynamic("SourceSecurityGroup")(__v.asInstanceOf[js.Any]))
      Subnets.foreach(__v => __obj.updateDynamic("Subnets")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsElbLoadBalancerDetails]
    }
  }

  /** Contains information about the health checks that are conducted on the load balancer.
    */
  @js.native
  trait AwsElbLoadBalancerHealthCheck extends js.Object {
    var HealthyThreshold: js.UndefOr[Int]
    var Interval: js.UndefOr[Int]
    var Target: js.UndefOr[NonEmptyString]
    var Timeout: js.UndefOr[Int]
    var UnhealthyThreshold: js.UndefOr[Int]
  }

  object AwsElbLoadBalancerHealthCheck {
    @inline
    def apply(
        HealthyThreshold: js.UndefOr[Int] = js.undefined,
        Interval: js.UndefOr[Int] = js.undefined,
        Target: js.UndefOr[NonEmptyString] = js.undefined,
        Timeout: js.UndefOr[Int] = js.undefined,
        UnhealthyThreshold: js.UndefOr[Int] = js.undefined
    ): AwsElbLoadBalancerHealthCheck = {
      val __obj = js.Dynamic.literal()
      HealthyThreshold.foreach(__v => __obj.updateDynamic("HealthyThreshold")(__v.asInstanceOf[js.Any]))
      Interval.foreach(__v => __obj.updateDynamic("Interval")(__v.asInstanceOf[js.Any]))
      Target.foreach(__v => __obj.updateDynamic("Target")(__v.asInstanceOf[js.Any]))
      Timeout.foreach(__v => __obj.updateDynamic("Timeout")(__v.asInstanceOf[js.Any]))
      UnhealthyThreshold.foreach(__v => __obj.updateDynamic("UnhealthyThreshold")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsElbLoadBalancerHealthCheck]
    }
  }

  /** Provides information about an EC2 instance for a load balancer.
    */
  @js.native
  trait AwsElbLoadBalancerInstance extends js.Object {
    var InstanceId: js.UndefOr[NonEmptyString]
  }

  object AwsElbLoadBalancerInstance {
    @inline
    def apply(
        InstanceId: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsElbLoadBalancerInstance = {
      val __obj = js.Dynamic.literal()
      InstanceId.foreach(__v => __obj.updateDynamic("InstanceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsElbLoadBalancerInstance]
    }
  }

  /** Information about a load balancer listener.
    */
  @js.native
  trait AwsElbLoadBalancerListener extends js.Object {
    var InstancePort: js.UndefOr[Int]
    var InstanceProtocol: js.UndefOr[NonEmptyString]
    var LoadBalancerPort: js.UndefOr[Int]
    var Protocol: js.UndefOr[NonEmptyString]
    var SslCertificateId: js.UndefOr[NonEmptyString]
  }

  object AwsElbLoadBalancerListener {
    @inline
    def apply(
        InstancePort: js.UndefOr[Int] = js.undefined,
        InstanceProtocol: js.UndefOr[NonEmptyString] = js.undefined,
        LoadBalancerPort: js.UndefOr[Int] = js.undefined,
        Protocol: js.UndefOr[NonEmptyString] = js.undefined,
        SslCertificateId: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsElbLoadBalancerListener = {
      val __obj = js.Dynamic.literal()
      InstancePort.foreach(__v => __obj.updateDynamic("InstancePort")(__v.asInstanceOf[js.Any]))
      InstanceProtocol.foreach(__v => __obj.updateDynamic("InstanceProtocol")(__v.asInstanceOf[js.Any]))
      LoadBalancerPort.foreach(__v => __obj.updateDynamic("LoadBalancerPort")(__v.asInstanceOf[js.Any]))
      Protocol.foreach(__v => __obj.updateDynamic("Protocol")(__v.asInstanceOf[js.Any]))
      SslCertificateId.foreach(__v => __obj.updateDynamic("SslCertificateId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsElbLoadBalancerListener]
    }
  }

  /** Lists the policies that are enabled for a load balancer listener.
    */
  @js.native
  trait AwsElbLoadBalancerListenerDescription extends js.Object {
    var Listener: js.UndefOr[AwsElbLoadBalancerListener]
    var PolicyNames: js.UndefOr[StringList]
  }

  object AwsElbLoadBalancerListenerDescription {
    @inline
    def apply(
        Listener: js.UndefOr[AwsElbLoadBalancerListener] = js.undefined,
        PolicyNames: js.UndefOr[StringList] = js.undefined
    ): AwsElbLoadBalancerListenerDescription = {
      val __obj = js.Dynamic.literal()
      Listener.foreach(__v => __obj.updateDynamic("Listener")(__v.asInstanceOf[js.Any]))
      PolicyNames.foreach(__v => __obj.updateDynamic("PolicyNames")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsElbLoadBalancerListenerDescription]
    }
  }

  /** Contains information about the policies for a load balancer.
    */
  @js.native
  trait AwsElbLoadBalancerPolicies extends js.Object {
    var AppCookieStickinessPolicies: js.UndefOr[AwsElbAppCookieStickinessPolicies]
    var LbCookieStickinessPolicies: js.UndefOr[AwsElbLbCookieStickinessPolicies]
    var OtherPolicies: js.UndefOr[StringList]
  }

  object AwsElbLoadBalancerPolicies {
    @inline
    def apply(
        AppCookieStickinessPolicies: js.UndefOr[AwsElbAppCookieStickinessPolicies] = js.undefined,
        LbCookieStickinessPolicies: js.UndefOr[AwsElbLbCookieStickinessPolicies] = js.undefined,
        OtherPolicies: js.UndefOr[StringList] = js.undefined
    ): AwsElbLoadBalancerPolicies = {
      val __obj = js.Dynamic.literal()
      AppCookieStickinessPolicies.foreach(__v => __obj.updateDynamic("AppCookieStickinessPolicies")(__v.asInstanceOf[js.Any]))
      LbCookieStickinessPolicies.foreach(__v => __obj.updateDynamic("LbCookieStickinessPolicies")(__v.asInstanceOf[js.Any]))
      OtherPolicies.foreach(__v => __obj.updateDynamic("OtherPolicies")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsElbLoadBalancerPolicies]
    }
  }

  /** Contains information about the security group for the load balancer.
    */
  @js.native
  trait AwsElbLoadBalancerSourceSecurityGroup extends js.Object {
    var GroupName: js.UndefOr[NonEmptyString]
    var OwnerAlias: js.UndefOr[NonEmptyString]
  }

  object AwsElbLoadBalancerSourceSecurityGroup {
    @inline
    def apply(
        GroupName: js.UndefOr[NonEmptyString] = js.undefined,
        OwnerAlias: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsElbLoadBalancerSourceSecurityGroup = {
      val __obj = js.Dynamic.literal()
      GroupName.foreach(__v => __obj.updateDynamic("GroupName")(__v.asInstanceOf[js.Any]))
      OwnerAlias.foreach(__v => __obj.updateDynamic("OwnerAlias")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsElbLoadBalancerSourceSecurityGroup]
    }
  }

  /** A load balancer attribute.
    */
  @js.native
  trait AwsElbv2LoadBalancerAttribute extends js.Object {
    var Key: js.UndefOr[NonEmptyString]
    var Value: js.UndefOr[NonEmptyString]
  }

  object AwsElbv2LoadBalancerAttribute {
    @inline
    def apply(
        Key: js.UndefOr[NonEmptyString] = js.undefined,
        Value: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsElbv2LoadBalancerAttribute = {
      val __obj = js.Dynamic.literal()
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsElbv2LoadBalancerAttribute]
    }
  }

  /** Information about a load balancer.
    */
  @js.native
  trait AwsElbv2LoadBalancerDetails extends js.Object {
    var AvailabilityZones: js.UndefOr[AvailabilityZones]
    var CanonicalHostedZoneId: js.UndefOr[NonEmptyString]
    var CreatedTime: js.UndefOr[NonEmptyString]
    var DNSName: js.UndefOr[NonEmptyString]
    var IpAddressType: js.UndefOr[NonEmptyString]
    var LoadBalancerAttributes: js.UndefOr[AwsElbv2LoadBalancerAttributes]
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
        LoadBalancerAttributes: js.UndefOr[AwsElbv2LoadBalancerAttributes] = js.undefined,
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
      LoadBalancerAttributes.foreach(__v => __obj.updateDynamic("LoadBalancerAttributes")(__v.asInstanceOf[js.Any]))
      Scheme.foreach(__v => __obj.updateDynamic("Scheme")(__v.asInstanceOf[js.Any]))
      SecurityGroups.foreach(__v => __obj.updateDynamic("SecurityGroups")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsElbv2LoadBalancerDetails]
    }
  }

  /** IAM access key details related to a finding.
    */
  @js.native
  trait AwsIamAccessKeyDetails extends js.Object {
    var AccessKeyId: js.UndefOr[NonEmptyString]
    var AccountId: js.UndefOr[NonEmptyString]
    var CreatedAt: js.UndefOr[NonEmptyString]
    var PrincipalId: js.UndefOr[NonEmptyString]
    var PrincipalName: js.UndefOr[NonEmptyString]
    var PrincipalType: js.UndefOr[NonEmptyString]
    var SessionContext: js.UndefOr[AwsIamAccessKeySessionContext]
    var Status: js.UndefOr[AwsIamAccessKeyStatus]
    var UserName: js.UndefOr[NonEmptyString]
  }

  object AwsIamAccessKeyDetails {
    @inline
    def apply(
        AccessKeyId: js.UndefOr[NonEmptyString] = js.undefined,
        AccountId: js.UndefOr[NonEmptyString] = js.undefined,
        CreatedAt: js.UndefOr[NonEmptyString] = js.undefined,
        PrincipalId: js.UndefOr[NonEmptyString] = js.undefined,
        PrincipalName: js.UndefOr[NonEmptyString] = js.undefined,
        PrincipalType: js.UndefOr[NonEmptyString] = js.undefined,
        SessionContext: js.UndefOr[AwsIamAccessKeySessionContext] = js.undefined,
        Status: js.UndefOr[AwsIamAccessKeyStatus] = js.undefined,
        UserName: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsIamAccessKeyDetails = {
      val __obj = js.Dynamic.literal()
      AccessKeyId.foreach(__v => __obj.updateDynamic("AccessKeyId")(__v.asInstanceOf[js.Any]))
      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      PrincipalId.foreach(__v => __obj.updateDynamic("PrincipalId")(__v.asInstanceOf[js.Any]))
      PrincipalName.foreach(__v => __obj.updateDynamic("PrincipalName")(__v.asInstanceOf[js.Any]))
      PrincipalType.foreach(__v => __obj.updateDynamic("PrincipalType")(__v.asInstanceOf[js.Any]))
      SessionContext.foreach(__v => __obj.updateDynamic("SessionContext")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      UserName.foreach(__v => __obj.updateDynamic("UserName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsIamAccessKeyDetails]
    }
  }

  /** Provides information about the session that the key was used for.
    */
  @js.native
  trait AwsIamAccessKeySessionContext extends js.Object {
    var Attributes: js.UndefOr[AwsIamAccessKeySessionContextAttributes]
    var SessionIssuer: js.UndefOr[AwsIamAccessKeySessionContextSessionIssuer]
  }

  object AwsIamAccessKeySessionContext {
    @inline
    def apply(
        Attributes: js.UndefOr[AwsIamAccessKeySessionContextAttributes] = js.undefined,
        SessionIssuer: js.UndefOr[AwsIamAccessKeySessionContextSessionIssuer] = js.undefined
    ): AwsIamAccessKeySessionContext = {
      val __obj = js.Dynamic.literal()
      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      SessionIssuer.foreach(__v => __obj.updateDynamic("SessionIssuer")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsIamAccessKeySessionContext]
    }
  }

  /** Attributes of the session that the key was used for.
    */
  @js.native
  trait AwsIamAccessKeySessionContextAttributes extends js.Object {
    var CreationDate: js.UndefOr[NonEmptyString]
    var MfaAuthenticated: js.UndefOr[Boolean]
  }

  object AwsIamAccessKeySessionContextAttributes {
    @inline
    def apply(
        CreationDate: js.UndefOr[NonEmptyString] = js.undefined,
        MfaAuthenticated: js.UndefOr[Boolean] = js.undefined
    ): AwsIamAccessKeySessionContextAttributes = {
      val __obj = js.Dynamic.literal()
      CreationDate.foreach(__v => __obj.updateDynamic("CreationDate")(__v.asInstanceOf[js.Any]))
      MfaAuthenticated.foreach(__v => __obj.updateDynamic("MfaAuthenticated")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsIamAccessKeySessionContextAttributes]
    }
  }

  /** Information about the entity that created the session.
    */
  @js.native
  trait AwsIamAccessKeySessionContextSessionIssuer extends js.Object {
    var AccountId: js.UndefOr[NonEmptyString]
    var Arn: js.UndefOr[NonEmptyString]
    var PrincipalId: js.UndefOr[NonEmptyString]
    var Type: js.UndefOr[NonEmptyString]
    var UserName: js.UndefOr[NonEmptyString]
  }

  object AwsIamAccessKeySessionContextSessionIssuer {
    @inline
    def apply(
        AccountId: js.UndefOr[NonEmptyString] = js.undefined,
        Arn: js.UndefOr[NonEmptyString] = js.undefined,
        PrincipalId: js.UndefOr[NonEmptyString] = js.undefined,
        Type: js.UndefOr[NonEmptyString] = js.undefined,
        UserName: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsIamAccessKeySessionContextSessionIssuer = {
      val __obj = js.Dynamic.literal()
      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      PrincipalId.foreach(__v => __obj.updateDynamic("PrincipalId")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      UserName.foreach(__v => __obj.updateDynamic("UserName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsIamAccessKeySessionContextSessionIssuer]
    }
  }

  /** A managed policy that is attached to an IAM principal.
    */
  @js.native
  trait AwsIamAttachedManagedPolicy extends js.Object {
    var PolicyArn: js.UndefOr[NonEmptyString]
    var PolicyName: js.UndefOr[NonEmptyString]
  }

  object AwsIamAttachedManagedPolicy {
    @inline
    def apply(
        PolicyArn: js.UndefOr[NonEmptyString] = js.undefined,
        PolicyName: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsIamAttachedManagedPolicy = {
      val __obj = js.Dynamic.literal()
      PolicyArn.foreach(__v => __obj.updateDynamic("PolicyArn")(__v.asInstanceOf[js.Any]))
      PolicyName.foreach(__v => __obj.updateDynamic("PolicyName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsIamAttachedManagedPolicy]
    }
  }

  /** Contains details about an IAM group.
    */
  @js.native
  trait AwsIamGroupDetails extends js.Object {
    var AttachedManagedPolicies: js.UndefOr[AwsIamAttachedManagedPolicyList]
    var CreateDate: js.UndefOr[NonEmptyString]
    var GroupId: js.UndefOr[NonEmptyString]
    var GroupName: js.UndefOr[NonEmptyString]
    var GroupPolicyList: js.UndefOr[AwsIamGroupPolicyList]
    var Path: js.UndefOr[NonEmptyString]
  }

  object AwsIamGroupDetails {
    @inline
    def apply(
        AttachedManagedPolicies: js.UndefOr[AwsIamAttachedManagedPolicyList] = js.undefined,
        CreateDate: js.UndefOr[NonEmptyString] = js.undefined,
        GroupId: js.UndefOr[NonEmptyString] = js.undefined,
        GroupName: js.UndefOr[NonEmptyString] = js.undefined,
        GroupPolicyList: js.UndefOr[AwsIamGroupPolicyList] = js.undefined,
        Path: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsIamGroupDetails = {
      val __obj = js.Dynamic.literal()
      AttachedManagedPolicies.foreach(__v => __obj.updateDynamic("AttachedManagedPolicies")(__v.asInstanceOf[js.Any]))
      CreateDate.foreach(__v => __obj.updateDynamic("CreateDate")(__v.asInstanceOf[js.Any]))
      GroupId.foreach(__v => __obj.updateDynamic("GroupId")(__v.asInstanceOf[js.Any]))
      GroupName.foreach(__v => __obj.updateDynamic("GroupName")(__v.asInstanceOf[js.Any]))
      GroupPolicyList.foreach(__v => __obj.updateDynamic("GroupPolicyList")(__v.asInstanceOf[js.Any]))
      Path.foreach(__v => __obj.updateDynamic("Path")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsIamGroupDetails]
    }
  }

  /** A managed policy that is attached to the IAM group.
    */
  @js.native
  trait AwsIamGroupPolicy extends js.Object {
    var PolicyName: js.UndefOr[NonEmptyString]
  }

  object AwsIamGroupPolicy {
    @inline
    def apply(
        PolicyName: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsIamGroupPolicy = {
      val __obj = js.Dynamic.literal()
      PolicyName.foreach(__v => __obj.updateDynamic("PolicyName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsIamGroupPolicy]
    }
  }

  /** Information about an instance profile.
    */
  @js.native
  trait AwsIamInstanceProfile extends js.Object {
    var Arn: js.UndefOr[NonEmptyString]
    var CreateDate: js.UndefOr[NonEmptyString]
    var InstanceProfileId: js.UndefOr[NonEmptyString]
    var InstanceProfileName: js.UndefOr[NonEmptyString]
    var Path: js.UndefOr[NonEmptyString]
    var Roles: js.UndefOr[AwsIamInstanceProfileRoles]
  }

  object AwsIamInstanceProfile {
    @inline
    def apply(
        Arn: js.UndefOr[NonEmptyString] = js.undefined,
        CreateDate: js.UndefOr[NonEmptyString] = js.undefined,
        InstanceProfileId: js.UndefOr[NonEmptyString] = js.undefined,
        InstanceProfileName: js.UndefOr[NonEmptyString] = js.undefined,
        Path: js.UndefOr[NonEmptyString] = js.undefined,
        Roles: js.UndefOr[AwsIamInstanceProfileRoles] = js.undefined
    ): AwsIamInstanceProfile = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreateDate.foreach(__v => __obj.updateDynamic("CreateDate")(__v.asInstanceOf[js.Any]))
      InstanceProfileId.foreach(__v => __obj.updateDynamic("InstanceProfileId")(__v.asInstanceOf[js.Any]))
      InstanceProfileName.foreach(__v => __obj.updateDynamic("InstanceProfileName")(__v.asInstanceOf[js.Any]))
      Path.foreach(__v => __obj.updateDynamic("Path")(__v.asInstanceOf[js.Any]))
      Roles.foreach(__v => __obj.updateDynamic("Roles")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsIamInstanceProfile]
    }
  }

  /** Information about a role associated with an instance profile.
    */
  @js.native
  trait AwsIamInstanceProfileRole extends js.Object {
    var Arn: js.UndefOr[NonEmptyString]
    var AssumeRolePolicyDocument: js.UndefOr[AwsIamRoleAssumeRolePolicyDocument]
    var CreateDate: js.UndefOr[NonEmptyString]
    var Path: js.UndefOr[NonEmptyString]
    var RoleId: js.UndefOr[NonEmptyString]
    var RoleName: js.UndefOr[NonEmptyString]
  }

  object AwsIamInstanceProfileRole {
    @inline
    def apply(
        Arn: js.UndefOr[NonEmptyString] = js.undefined,
        AssumeRolePolicyDocument: js.UndefOr[AwsIamRoleAssumeRolePolicyDocument] = js.undefined,
        CreateDate: js.UndefOr[NonEmptyString] = js.undefined,
        Path: js.UndefOr[NonEmptyString] = js.undefined,
        RoleId: js.UndefOr[NonEmptyString] = js.undefined,
        RoleName: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsIamInstanceProfileRole = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      AssumeRolePolicyDocument.foreach(__v => __obj.updateDynamic("AssumeRolePolicyDocument")(__v.asInstanceOf[js.Any]))
      CreateDate.foreach(__v => __obj.updateDynamic("CreateDate")(__v.asInstanceOf[js.Any]))
      Path.foreach(__v => __obj.updateDynamic("Path")(__v.asInstanceOf[js.Any]))
      RoleId.foreach(__v => __obj.updateDynamic("RoleId")(__v.asInstanceOf[js.Any]))
      RoleName.foreach(__v => __obj.updateDynamic("RoleName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsIamInstanceProfileRole]
    }
  }

  /** Information about the policy used to set the permissions boundary for an IAM principal.
    */
  @js.native
  trait AwsIamPermissionsBoundary extends js.Object {
    var PermissionsBoundaryArn: js.UndefOr[NonEmptyString]
    var PermissionsBoundaryType: js.UndefOr[NonEmptyString]
  }

  object AwsIamPermissionsBoundary {
    @inline
    def apply(
        PermissionsBoundaryArn: js.UndefOr[NonEmptyString] = js.undefined,
        PermissionsBoundaryType: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsIamPermissionsBoundary = {
      val __obj = js.Dynamic.literal()
      PermissionsBoundaryArn.foreach(__v => __obj.updateDynamic("PermissionsBoundaryArn")(__v.asInstanceOf[js.Any]))
      PermissionsBoundaryType.foreach(__v => __obj.updateDynamic("PermissionsBoundaryType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsIamPermissionsBoundary]
    }
  }

  /** Represents an IAM permissions policy.
    */
  @js.native
  trait AwsIamPolicyDetails extends js.Object {
    var AttachmentCount: js.UndefOr[Int]
    var CreateDate: js.UndefOr[NonEmptyString]
    var DefaultVersionId: js.UndefOr[NonEmptyString]
    var Description: js.UndefOr[NonEmptyString]
    var IsAttachable: js.UndefOr[Boolean]
    var Path: js.UndefOr[NonEmptyString]
    var PermissionsBoundaryUsageCount: js.UndefOr[Int]
    var PolicyId: js.UndefOr[NonEmptyString]
    var PolicyName: js.UndefOr[NonEmptyString]
    var PolicyVersionList: js.UndefOr[AwsIamPolicyVersionList]
    var UpdateDate: js.UndefOr[NonEmptyString]
  }

  object AwsIamPolicyDetails {
    @inline
    def apply(
        AttachmentCount: js.UndefOr[Int] = js.undefined,
        CreateDate: js.UndefOr[NonEmptyString] = js.undefined,
        DefaultVersionId: js.UndefOr[NonEmptyString] = js.undefined,
        Description: js.UndefOr[NonEmptyString] = js.undefined,
        IsAttachable: js.UndefOr[Boolean] = js.undefined,
        Path: js.UndefOr[NonEmptyString] = js.undefined,
        PermissionsBoundaryUsageCount: js.UndefOr[Int] = js.undefined,
        PolicyId: js.UndefOr[NonEmptyString] = js.undefined,
        PolicyName: js.UndefOr[NonEmptyString] = js.undefined,
        PolicyVersionList: js.UndefOr[AwsIamPolicyVersionList] = js.undefined,
        UpdateDate: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsIamPolicyDetails = {
      val __obj = js.Dynamic.literal()
      AttachmentCount.foreach(__v => __obj.updateDynamic("AttachmentCount")(__v.asInstanceOf[js.Any]))
      CreateDate.foreach(__v => __obj.updateDynamic("CreateDate")(__v.asInstanceOf[js.Any]))
      DefaultVersionId.foreach(__v => __obj.updateDynamic("DefaultVersionId")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      IsAttachable.foreach(__v => __obj.updateDynamic("IsAttachable")(__v.asInstanceOf[js.Any]))
      Path.foreach(__v => __obj.updateDynamic("Path")(__v.asInstanceOf[js.Any]))
      PermissionsBoundaryUsageCount.foreach(__v => __obj.updateDynamic("PermissionsBoundaryUsageCount")(__v.asInstanceOf[js.Any]))
      PolicyId.foreach(__v => __obj.updateDynamic("PolicyId")(__v.asInstanceOf[js.Any]))
      PolicyName.foreach(__v => __obj.updateDynamic("PolicyName")(__v.asInstanceOf[js.Any]))
      PolicyVersionList.foreach(__v => __obj.updateDynamic("PolicyVersionList")(__v.asInstanceOf[js.Any]))
      UpdateDate.foreach(__v => __obj.updateDynamic("UpdateDate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsIamPolicyDetails]
    }
  }

  /** A version of an IAM policy.
    */
  @js.native
  trait AwsIamPolicyVersion extends js.Object {
    var CreateDate: js.UndefOr[NonEmptyString]
    var IsDefaultVersion: js.UndefOr[Boolean]
    var VersionId: js.UndefOr[NonEmptyString]
  }

  object AwsIamPolicyVersion {
    @inline
    def apply(
        CreateDate: js.UndefOr[NonEmptyString] = js.undefined,
        IsDefaultVersion: js.UndefOr[Boolean] = js.undefined,
        VersionId: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsIamPolicyVersion = {
      val __obj = js.Dynamic.literal()
      CreateDate.foreach(__v => __obj.updateDynamic("CreateDate")(__v.asInstanceOf[js.Any]))
      IsDefaultVersion.foreach(__v => __obj.updateDynamic("IsDefaultVersion")(__v.asInstanceOf[js.Any]))
      VersionId.foreach(__v => __obj.updateDynamic("VersionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsIamPolicyVersion]
    }
  }

  /** Contains information about an IAM role, including all of the role's policies.
    */
  @js.native
  trait AwsIamRoleDetails extends js.Object {
    var AssumeRolePolicyDocument: js.UndefOr[AwsIamRoleAssumeRolePolicyDocument]
    var AttachedManagedPolicies: js.UndefOr[AwsIamAttachedManagedPolicyList]
    var CreateDate: js.UndefOr[NonEmptyString]
    var InstanceProfileList: js.UndefOr[AwsIamInstanceProfileList]
    var MaxSessionDuration: js.UndefOr[Int]
    var Path: js.UndefOr[NonEmptyString]
    var PermissionsBoundary: js.UndefOr[AwsIamPermissionsBoundary]
    var RoleId: js.UndefOr[NonEmptyString]
    var RoleName: js.UndefOr[NonEmptyString]
    var RolePolicyList: js.UndefOr[AwsIamRolePolicyList]
  }

  object AwsIamRoleDetails {
    @inline
    def apply(
        AssumeRolePolicyDocument: js.UndefOr[AwsIamRoleAssumeRolePolicyDocument] = js.undefined,
        AttachedManagedPolicies: js.UndefOr[AwsIamAttachedManagedPolicyList] = js.undefined,
        CreateDate: js.UndefOr[NonEmptyString] = js.undefined,
        InstanceProfileList: js.UndefOr[AwsIamInstanceProfileList] = js.undefined,
        MaxSessionDuration: js.UndefOr[Int] = js.undefined,
        Path: js.UndefOr[NonEmptyString] = js.undefined,
        PermissionsBoundary: js.UndefOr[AwsIamPermissionsBoundary] = js.undefined,
        RoleId: js.UndefOr[NonEmptyString] = js.undefined,
        RoleName: js.UndefOr[NonEmptyString] = js.undefined,
        RolePolicyList: js.UndefOr[AwsIamRolePolicyList] = js.undefined
    ): AwsIamRoleDetails = {
      val __obj = js.Dynamic.literal()
      AssumeRolePolicyDocument.foreach(__v => __obj.updateDynamic("AssumeRolePolicyDocument")(__v.asInstanceOf[js.Any]))
      AttachedManagedPolicies.foreach(__v => __obj.updateDynamic("AttachedManagedPolicies")(__v.asInstanceOf[js.Any]))
      CreateDate.foreach(__v => __obj.updateDynamic("CreateDate")(__v.asInstanceOf[js.Any]))
      InstanceProfileList.foreach(__v => __obj.updateDynamic("InstanceProfileList")(__v.asInstanceOf[js.Any]))
      MaxSessionDuration.foreach(__v => __obj.updateDynamic("MaxSessionDuration")(__v.asInstanceOf[js.Any]))
      Path.foreach(__v => __obj.updateDynamic("Path")(__v.asInstanceOf[js.Any]))
      PermissionsBoundary.foreach(__v => __obj.updateDynamic("PermissionsBoundary")(__v.asInstanceOf[js.Any]))
      RoleId.foreach(__v => __obj.updateDynamic("RoleId")(__v.asInstanceOf[js.Any]))
      RoleName.foreach(__v => __obj.updateDynamic("RoleName")(__v.asInstanceOf[js.Any]))
      RolePolicyList.foreach(__v => __obj.updateDynamic("RolePolicyList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsIamRoleDetails]
    }
  }

  /** An inline policy that is embedded in the role.
    */
  @js.native
  trait AwsIamRolePolicy extends js.Object {
    var PolicyName: js.UndefOr[NonEmptyString]
  }

  object AwsIamRolePolicy {
    @inline
    def apply(
        PolicyName: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsIamRolePolicy = {
      val __obj = js.Dynamic.literal()
      PolicyName.foreach(__v => __obj.updateDynamic("PolicyName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsIamRolePolicy]
    }
  }

  /** Information about an IAM user.
    */
  @js.native
  trait AwsIamUserDetails extends js.Object {
    var AttachedManagedPolicies: js.UndefOr[AwsIamAttachedManagedPolicyList]
    var CreateDate: js.UndefOr[NonEmptyString]
    var GroupList: js.UndefOr[StringList]
    var Path: js.UndefOr[NonEmptyString]
    var PermissionsBoundary: js.UndefOr[AwsIamPermissionsBoundary]
    var UserId: js.UndefOr[NonEmptyString]
    var UserName: js.UndefOr[NonEmptyString]
    var UserPolicyList: js.UndefOr[AwsIamUserPolicyList]
  }

  object AwsIamUserDetails {
    @inline
    def apply(
        AttachedManagedPolicies: js.UndefOr[AwsIamAttachedManagedPolicyList] = js.undefined,
        CreateDate: js.UndefOr[NonEmptyString] = js.undefined,
        GroupList: js.UndefOr[StringList] = js.undefined,
        Path: js.UndefOr[NonEmptyString] = js.undefined,
        PermissionsBoundary: js.UndefOr[AwsIamPermissionsBoundary] = js.undefined,
        UserId: js.UndefOr[NonEmptyString] = js.undefined,
        UserName: js.UndefOr[NonEmptyString] = js.undefined,
        UserPolicyList: js.UndefOr[AwsIamUserPolicyList] = js.undefined
    ): AwsIamUserDetails = {
      val __obj = js.Dynamic.literal()
      AttachedManagedPolicies.foreach(__v => __obj.updateDynamic("AttachedManagedPolicies")(__v.asInstanceOf[js.Any]))
      CreateDate.foreach(__v => __obj.updateDynamic("CreateDate")(__v.asInstanceOf[js.Any]))
      GroupList.foreach(__v => __obj.updateDynamic("GroupList")(__v.asInstanceOf[js.Any]))
      Path.foreach(__v => __obj.updateDynamic("Path")(__v.asInstanceOf[js.Any]))
      PermissionsBoundary.foreach(__v => __obj.updateDynamic("PermissionsBoundary")(__v.asInstanceOf[js.Any]))
      UserId.foreach(__v => __obj.updateDynamic("UserId")(__v.asInstanceOf[js.Any]))
      UserName.foreach(__v => __obj.updateDynamic("UserName")(__v.asInstanceOf[js.Any]))
      UserPolicyList.foreach(__v => __obj.updateDynamic("UserPolicyList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsIamUserDetails]
    }
  }

  /** Information about an inline policy that is embedded in the user.
    */
  @js.native
  trait AwsIamUserPolicy extends js.Object {
    var PolicyName: js.UndefOr[NonEmptyString]
  }

  object AwsIamUserPolicy {
    @inline
    def apply(
        PolicyName: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsIamUserPolicy = {
      val __obj = js.Dynamic.literal()
      PolicyName.foreach(__v => __obj.updateDynamic("PolicyName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsIamUserPolicy]
    }
  }

  /** Provides information about an Amazon Kinesis data stream.
    */
  @js.native
  trait AwsKinesisStreamDetails extends js.Object {
    var Arn: js.UndefOr[NonEmptyString]
    var Name: js.UndefOr[NonEmptyString]
    var RetentionPeriodHours: js.UndefOr[Int]
    var ShardCount: js.UndefOr[Int]
    var StreamEncryption: js.UndefOr[AwsKinesisStreamStreamEncryptionDetails]
  }

  object AwsKinesisStreamDetails {
    @inline
    def apply(
        Arn: js.UndefOr[NonEmptyString] = js.undefined,
        Name: js.UndefOr[NonEmptyString] = js.undefined,
        RetentionPeriodHours: js.UndefOr[Int] = js.undefined,
        ShardCount: js.UndefOr[Int] = js.undefined,
        StreamEncryption: js.UndefOr[AwsKinesisStreamStreamEncryptionDetails] = js.undefined
    ): AwsKinesisStreamDetails = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      RetentionPeriodHours.foreach(__v => __obj.updateDynamic("RetentionPeriodHours")(__v.asInstanceOf[js.Any]))
      ShardCount.foreach(__v => __obj.updateDynamic("ShardCount")(__v.asInstanceOf[js.Any]))
      StreamEncryption.foreach(__v => __obj.updateDynamic("StreamEncryption")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsKinesisStreamDetails]
    }
  }

  /** Provides information about stream encryption.
    */
  @js.native
  trait AwsKinesisStreamStreamEncryptionDetails extends js.Object {
    var EncryptionType: js.UndefOr[NonEmptyString]
    var KeyId: js.UndefOr[NonEmptyString]
  }

  object AwsKinesisStreamStreamEncryptionDetails {
    @inline
    def apply(
        EncryptionType: js.UndefOr[NonEmptyString] = js.undefined,
        KeyId: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsKinesisStreamStreamEncryptionDetails = {
      val __obj = js.Dynamic.literal()
      EncryptionType.foreach(__v => __obj.updateDynamic("EncryptionType")(__v.asInstanceOf[js.Any]))
      KeyId.foreach(__v => __obj.updateDynamic("KeyId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsKinesisStreamStreamEncryptionDetails]
    }
  }

  /** Contains metadata about an KMS key.
    */
  @js.native
  trait AwsKmsKeyDetails extends js.Object {
    var AWSAccountId: js.UndefOr[NonEmptyString]
    var CreationDate: js.UndefOr[Double]
    var Description: js.UndefOr[NonEmptyString]
    var KeyId: js.UndefOr[NonEmptyString]
    var KeyManager: js.UndefOr[NonEmptyString]
    var KeyRotationStatus: js.UndefOr[Boolean]
    var KeyState: js.UndefOr[NonEmptyString]
    var Origin: js.UndefOr[NonEmptyString]
  }

  object AwsKmsKeyDetails {
    @inline
    def apply(
        AWSAccountId: js.UndefOr[NonEmptyString] = js.undefined,
        CreationDate: js.UndefOr[Double] = js.undefined,
        Description: js.UndefOr[NonEmptyString] = js.undefined,
        KeyId: js.UndefOr[NonEmptyString] = js.undefined,
        KeyManager: js.UndefOr[NonEmptyString] = js.undefined,
        KeyRotationStatus: js.UndefOr[Boolean] = js.undefined,
        KeyState: js.UndefOr[NonEmptyString] = js.undefined,
        Origin: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsKmsKeyDetails = {
      val __obj = js.Dynamic.literal()
      AWSAccountId.foreach(__v => __obj.updateDynamic("AWSAccountId")(__v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.updateDynamic("CreationDate")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      KeyId.foreach(__v => __obj.updateDynamic("KeyId")(__v.asInstanceOf[js.Any]))
      KeyManager.foreach(__v => __obj.updateDynamic("KeyManager")(__v.asInstanceOf[js.Any]))
      KeyRotationStatus.foreach(__v => __obj.updateDynamic("KeyRotationStatus")(__v.asInstanceOf[js.Any]))
      KeyState.foreach(__v => __obj.updateDynamic("KeyState")(__v.asInstanceOf[js.Any]))
      Origin.foreach(__v => __obj.updateDynamic("Origin")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsKmsKeyDetails]
    }
  }

  /** The code for the Lambda function. You can specify either an object in Amazon S3, or upload a deployment package directly.
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

  /** The dead-letter queue for failed asynchronous invocations.
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

  /** Details about an Lambda function's configuration.
    */
  @js.native
  trait AwsLambdaFunctionDetails extends js.Object {
    var Architectures: js.UndefOr[NonEmptyStringList]
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
    var PackageType: js.UndefOr[NonEmptyString]
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
        Architectures: js.UndefOr[NonEmptyStringList] = js.undefined,
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
        PackageType: js.UndefOr[NonEmptyString] = js.undefined,
        RevisionId: js.UndefOr[NonEmptyString] = js.undefined,
        Role: js.UndefOr[NonEmptyString] = js.undefined,
        Runtime: js.UndefOr[NonEmptyString] = js.undefined,
        Timeout: js.UndefOr[Int] = js.undefined,
        TracingConfig: js.UndefOr[AwsLambdaFunctionTracingConfig] = js.undefined,
        Version: js.UndefOr[NonEmptyString] = js.undefined,
        VpcConfig: js.UndefOr[AwsLambdaFunctionVpcConfig] = js.undefined
    ): AwsLambdaFunctionDetails = {
      val __obj = js.Dynamic.literal()
      Architectures.foreach(__v => __obj.updateDynamic("Architectures")(__v.asInstanceOf[js.Any]))
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
      PackageType.foreach(__v => __obj.updateDynamic("PackageType")(__v.asInstanceOf[js.Any]))
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

  /** A function's environment variable settings.
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

  /** Error messages for environment variables that could not be applied.
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

  /** An Lambda layer.
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

  /** The function's X-Ray tracing configuration.
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

  /** The VPC security groups and subnets that are attached to a Lambda function.
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

  /** Details about a Lambda layer version.
    */
  @js.native
  trait AwsLambdaLayerVersionDetails extends js.Object {
    var CompatibleRuntimes: js.UndefOr[NonEmptyStringList]
    var CreatedDate: js.UndefOr[NonEmptyString]
    var Version: js.UndefOr[AwsLambdaLayerVersionNumber]
  }

  object AwsLambdaLayerVersionDetails {
    @inline
    def apply(
        CompatibleRuntimes: js.UndefOr[NonEmptyStringList] = js.undefined,
        CreatedDate: js.UndefOr[NonEmptyString] = js.undefined,
        Version: js.UndefOr[AwsLambdaLayerVersionNumber] = js.undefined
    ): AwsLambdaLayerVersionDetails = {
      val __obj = js.Dynamic.literal()
      CompatibleRuntimes.foreach(__v => __obj.updateDynamic("CompatibleRuntimes")(__v.asInstanceOf[js.Any]))
      CreatedDate.foreach(__v => __obj.updateDynamic("CreatedDate")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsLambdaLayerVersionDetails]
    }
  }

  /** Details for a volume mount point that's used in a container definition.
    */
  @js.native
  trait AwsMountPoint extends js.Object {
    var ContainerPath: js.UndefOr[NonEmptyString]
    var SourceVolume: js.UndefOr[NonEmptyString]
  }

  object AwsMountPoint {
    @inline
    def apply(
        ContainerPath: js.UndefOr[NonEmptyString] = js.undefined,
        SourceVolume: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsMountPoint = {
      val __obj = js.Dynamic.literal()
      ContainerPath.foreach(__v => __obj.updateDynamic("ContainerPath")(__v.asInstanceOf[js.Any]))
      SourceVolume.foreach(__v => __obj.updateDynamic("SourceVolume")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsMountPoint]
    }
  }

  /** Details about an Network Firewall firewall.
    */
  @js.native
  trait AwsNetworkFirewallFirewallDetails extends js.Object {
    var DeleteProtection: js.UndefOr[Boolean]
    var Description: js.UndefOr[NonEmptyString]
    var FirewallArn: js.UndefOr[NonEmptyString]
    var FirewallId: js.UndefOr[NonEmptyString]
    var FirewallName: js.UndefOr[NonEmptyString]
    var FirewallPolicyArn: js.UndefOr[NonEmptyString]
    var FirewallPolicyChangeProtection: js.UndefOr[Boolean]
    var SubnetChangeProtection: js.UndefOr[Boolean]
    var SubnetMappings: js.UndefOr[AwsNetworkFirewallFirewallSubnetMappingsList]
    var VpcId: js.UndefOr[NonEmptyString]
  }

  object AwsNetworkFirewallFirewallDetails {
    @inline
    def apply(
        DeleteProtection: js.UndefOr[Boolean] = js.undefined,
        Description: js.UndefOr[NonEmptyString] = js.undefined,
        FirewallArn: js.UndefOr[NonEmptyString] = js.undefined,
        FirewallId: js.UndefOr[NonEmptyString] = js.undefined,
        FirewallName: js.UndefOr[NonEmptyString] = js.undefined,
        FirewallPolicyArn: js.UndefOr[NonEmptyString] = js.undefined,
        FirewallPolicyChangeProtection: js.UndefOr[Boolean] = js.undefined,
        SubnetChangeProtection: js.UndefOr[Boolean] = js.undefined,
        SubnetMappings: js.UndefOr[AwsNetworkFirewallFirewallSubnetMappingsList] = js.undefined,
        VpcId: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsNetworkFirewallFirewallDetails = {
      val __obj = js.Dynamic.literal()
      DeleteProtection.foreach(__v => __obj.updateDynamic("DeleteProtection")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      FirewallArn.foreach(__v => __obj.updateDynamic("FirewallArn")(__v.asInstanceOf[js.Any]))
      FirewallId.foreach(__v => __obj.updateDynamic("FirewallId")(__v.asInstanceOf[js.Any]))
      FirewallName.foreach(__v => __obj.updateDynamic("FirewallName")(__v.asInstanceOf[js.Any]))
      FirewallPolicyArn.foreach(__v => __obj.updateDynamic("FirewallPolicyArn")(__v.asInstanceOf[js.Any]))
      FirewallPolicyChangeProtection.foreach(__v => __obj.updateDynamic("FirewallPolicyChangeProtection")(__v.asInstanceOf[js.Any]))
      SubnetChangeProtection.foreach(__v => __obj.updateDynamic("SubnetChangeProtection")(__v.asInstanceOf[js.Any]))
      SubnetMappings.foreach(__v => __obj.updateDynamic("SubnetMappings")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsNetworkFirewallFirewallDetails]
    }
  }

  /** Details about a firewall policy. A firewall policy defines the behavior of a network firewall.
    */
  @js.native
  trait AwsNetworkFirewallFirewallPolicyDetails extends js.Object {
    var Description: js.UndefOr[NonEmptyString]
    var FirewallPolicy: js.UndefOr[FirewallPolicyDetails]
    var FirewallPolicyArn: js.UndefOr[NonEmptyString]
    var FirewallPolicyId: js.UndefOr[NonEmptyString]
    var FirewallPolicyName: js.UndefOr[NonEmptyString]
  }

  object AwsNetworkFirewallFirewallPolicyDetails {
    @inline
    def apply(
        Description: js.UndefOr[NonEmptyString] = js.undefined,
        FirewallPolicy: js.UndefOr[FirewallPolicyDetails] = js.undefined,
        FirewallPolicyArn: js.UndefOr[NonEmptyString] = js.undefined,
        FirewallPolicyId: js.UndefOr[NonEmptyString] = js.undefined,
        FirewallPolicyName: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsNetworkFirewallFirewallPolicyDetails = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      FirewallPolicy.foreach(__v => __obj.updateDynamic("FirewallPolicy")(__v.asInstanceOf[js.Any]))
      FirewallPolicyArn.foreach(__v => __obj.updateDynamic("FirewallPolicyArn")(__v.asInstanceOf[js.Any]))
      FirewallPolicyId.foreach(__v => __obj.updateDynamic("FirewallPolicyId")(__v.asInstanceOf[js.Any]))
      FirewallPolicyName.foreach(__v => __obj.updateDynamic("FirewallPolicyName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsNetworkFirewallFirewallPolicyDetails]
    }
  }

  /** A public subnet that Network Firewall uses for the firewall.
    */
  @js.native
  trait AwsNetworkFirewallFirewallSubnetMappingsDetails extends js.Object {
    var SubnetId: js.UndefOr[NonEmptyString]
  }

  object AwsNetworkFirewallFirewallSubnetMappingsDetails {
    @inline
    def apply(
        SubnetId: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsNetworkFirewallFirewallSubnetMappingsDetails = {
      val __obj = js.Dynamic.literal()
      SubnetId.foreach(__v => __obj.updateDynamic("SubnetId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsNetworkFirewallFirewallSubnetMappingsDetails]
    }
  }

  /** Details about an Network Firewall rule group. Rule groups are used to inspect and control network traffic. Stateless rule groups apply to individual packets. Stateful rule groups apply to packets in the context of their traffic flow. Rule groups are referenced in firewall policies.
    */
  @js.native
  trait AwsNetworkFirewallRuleGroupDetails extends js.Object {
    var Capacity: js.UndefOr[Int]
    var Description: js.UndefOr[NonEmptyString]
    var RuleGroup: js.UndefOr[RuleGroupDetails]
    var RuleGroupArn: js.UndefOr[NonEmptyString]
    var RuleGroupId: js.UndefOr[NonEmptyString]
    var RuleGroupName: js.UndefOr[NonEmptyString]
    var Type: js.UndefOr[NonEmptyString]
  }

  object AwsNetworkFirewallRuleGroupDetails {
    @inline
    def apply(
        Capacity: js.UndefOr[Int] = js.undefined,
        Description: js.UndefOr[NonEmptyString] = js.undefined,
        RuleGroup: js.UndefOr[RuleGroupDetails] = js.undefined,
        RuleGroupArn: js.UndefOr[NonEmptyString] = js.undefined,
        RuleGroupId: js.UndefOr[NonEmptyString] = js.undefined,
        RuleGroupName: js.UndefOr[NonEmptyString] = js.undefined,
        Type: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsNetworkFirewallRuleGroupDetails = {
      val __obj = js.Dynamic.literal()
      Capacity.foreach(__v => __obj.updateDynamic("Capacity")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      RuleGroup.foreach(__v => __obj.updateDynamic("RuleGroup")(__v.asInstanceOf[js.Any]))
      RuleGroupArn.foreach(__v => __obj.updateDynamic("RuleGroupArn")(__v.asInstanceOf[js.Any]))
      RuleGroupId.foreach(__v => __obj.updateDynamic("RuleGroupId")(__v.asInstanceOf[js.Any]))
      RuleGroupName.foreach(__v => __obj.updateDynamic("RuleGroupName")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsNetworkFirewallRuleGroupDetails]
    }
  }

  /** Provides information about domain access control options.
    */
  @js.native
  trait AwsOpenSearchServiceDomainAdvancedSecurityOptionsDetails extends js.Object {
    var Enabled: js.UndefOr[Boolean]
    var InternalUserDatabaseEnabled: js.UndefOr[Boolean]
    var MasterUserOptions: js.UndefOr[AwsOpenSearchServiceDomainMasterUserOptionsDetails]
  }

  object AwsOpenSearchServiceDomainAdvancedSecurityOptionsDetails {
    @inline
    def apply(
        Enabled: js.UndefOr[Boolean] = js.undefined,
        InternalUserDatabaseEnabled: js.UndefOr[Boolean] = js.undefined,
        MasterUserOptions: js.UndefOr[AwsOpenSearchServiceDomainMasterUserOptionsDetails] = js.undefined
    ): AwsOpenSearchServiceDomainAdvancedSecurityOptionsDetails = {
      val __obj = js.Dynamic.literal()
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      InternalUserDatabaseEnabled.foreach(__v => __obj.updateDynamic("InternalUserDatabaseEnabled")(__v.asInstanceOf[js.Any]))
      MasterUserOptions.foreach(__v => __obj.updateDynamic("MasterUserOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsOpenSearchServiceDomainAdvancedSecurityOptionsDetails]
    }
  }

  /** Details about the configuration of an OpenSearch cluster.
    */
  @js.native
  trait AwsOpenSearchServiceDomainClusterConfigDetails extends js.Object {
    var DedicatedMasterCount: js.UndefOr[Int]
    var DedicatedMasterEnabled: js.UndefOr[Boolean]
    var DedicatedMasterType: js.UndefOr[NonEmptyString]
    var InstanceCount: js.UndefOr[Int]
    var InstanceType: js.UndefOr[NonEmptyString]
    var WarmCount: js.UndefOr[Int]
    var WarmEnabled: js.UndefOr[Boolean]
    var WarmType: js.UndefOr[NonEmptyString]
    var ZoneAwarenessConfig: js.UndefOr[AwsOpenSearchServiceDomainClusterConfigZoneAwarenessConfigDetails]
    var ZoneAwarenessEnabled: js.UndefOr[Boolean]
  }

  object AwsOpenSearchServiceDomainClusterConfigDetails {
    @inline
    def apply(
        DedicatedMasterCount: js.UndefOr[Int] = js.undefined,
        DedicatedMasterEnabled: js.UndefOr[Boolean] = js.undefined,
        DedicatedMasterType: js.UndefOr[NonEmptyString] = js.undefined,
        InstanceCount: js.UndefOr[Int] = js.undefined,
        InstanceType: js.UndefOr[NonEmptyString] = js.undefined,
        WarmCount: js.UndefOr[Int] = js.undefined,
        WarmEnabled: js.UndefOr[Boolean] = js.undefined,
        WarmType: js.UndefOr[NonEmptyString] = js.undefined,
        ZoneAwarenessConfig: js.UndefOr[AwsOpenSearchServiceDomainClusterConfigZoneAwarenessConfigDetails] = js.undefined,
        ZoneAwarenessEnabled: js.UndefOr[Boolean] = js.undefined
    ): AwsOpenSearchServiceDomainClusterConfigDetails = {
      val __obj = js.Dynamic.literal()
      DedicatedMasterCount.foreach(__v => __obj.updateDynamic("DedicatedMasterCount")(__v.asInstanceOf[js.Any]))
      DedicatedMasterEnabled.foreach(__v => __obj.updateDynamic("DedicatedMasterEnabled")(__v.asInstanceOf[js.Any]))
      DedicatedMasterType.foreach(__v => __obj.updateDynamic("DedicatedMasterType")(__v.asInstanceOf[js.Any]))
      InstanceCount.foreach(__v => __obj.updateDynamic("InstanceCount")(__v.asInstanceOf[js.Any]))
      InstanceType.foreach(__v => __obj.updateDynamic("InstanceType")(__v.asInstanceOf[js.Any]))
      WarmCount.foreach(__v => __obj.updateDynamic("WarmCount")(__v.asInstanceOf[js.Any]))
      WarmEnabled.foreach(__v => __obj.updateDynamic("WarmEnabled")(__v.asInstanceOf[js.Any]))
      WarmType.foreach(__v => __obj.updateDynamic("WarmType")(__v.asInstanceOf[js.Any]))
      ZoneAwarenessConfig.foreach(__v => __obj.updateDynamic("ZoneAwarenessConfig")(__v.asInstanceOf[js.Any]))
      ZoneAwarenessEnabled.foreach(__v => __obj.updateDynamic("ZoneAwarenessEnabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsOpenSearchServiceDomainClusterConfigDetails]
    }
  }

  /** Configuration options for zone awareness.
    */
  @js.native
  trait AwsOpenSearchServiceDomainClusterConfigZoneAwarenessConfigDetails extends js.Object {
    var AvailabilityZoneCount: js.UndefOr[Int]
  }

  object AwsOpenSearchServiceDomainClusterConfigZoneAwarenessConfigDetails {
    @inline
    def apply(
        AvailabilityZoneCount: js.UndefOr[Int] = js.undefined
    ): AwsOpenSearchServiceDomainClusterConfigZoneAwarenessConfigDetails = {
      val __obj = js.Dynamic.literal()
      AvailabilityZoneCount.foreach(__v => __obj.updateDynamic("AvailabilityZoneCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsOpenSearchServiceDomainClusterConfigZoneAwarenessConfigDetails]
    }
  }

  /** Information about an Amazon OpenSearch Service domain.
    */
  @js.native
  trait AwsOpenSearchServiceDomainDetails extends js.Object {
    var AccessPolicies: js.UndefOr[NonEmptyString]
    var AdvancedSecurityOptions: js.UndefOr[AwsOpenSearchServiceDomainAdvancedSecurityOptionsDetails]
    var Arn: js.UndefOr[NonEmptyString]
    var ClusterConfig: js.UndefOr[AwsOpenSearchServiceDomainClusterConfigDetails]
    var DomainEndpoint: js.UndefOr[NonEmptyString]
    var DomainEndpointOptions: js.UndefOr[AwsOpenSearchServiceDomainDomainEndpointOptionsDetails]
    var DomainEndpoints: js.UndefOr[FieldMap]
    var DomainName: js.UndefOr[NonEmptyString]
    var EncryptionAtRestOptions: js.UndefOr[AwsOpenSearchServiceDomainEncryptionAtRestOptionsDetails]
    var EngineVersion: js.UndefOr[NonEmptyString]
    var Id: js.UndefOr[NonEmptyString]
    var LogPublishingOptions: js.UndefOr[AwsOpenSearchServiceDomainLogPublishingOptionsDetails]
    var NodeToNodeEncryptionOptions: js.UndefOr[AwsOpenSearchServiceDomainNodeToNodeEncryptionOptionsDetails]
    var ServiceSoftwareOptions: js.UndefOr[AwsOpenSearchServiceDomainServiceSoftwareOptionsDetails]
    var VpcOptions: js.UndefOr[AwsOpenSearchServiceDomainVpcOptionsDetails]
  }

  object AwsOpenSearchServiceDomainDetails {
    @inline
    def apply(
        AccessPolicies: js.UndefOr[NonEmptyString] = js.undefined,
        AdvancedSecurityOptions: js.UndefOr[AwsOpenSearchServiceDomainAdvancedSecurityOptionsDetails] = js.undefined,
        Arn: js.UndefOr[NonEmptyString] = js.undefined,
        ClusterConfig: js.UndefOr[AwsOpenSearchServiceDomainClusterConfigDetails] = js.undefined,
        DomainEndpoint: js.UndefOr[NonEmptyString] = js.undefined,
        DomainEndpointOptions: js.UndefOr[AwsOpenSearchServiceDomainDomainEndpointOptionsDetails] = js.undefined,
        DomainEndpoints: js.UndefOr[FieldMap] = js.undefined,
        DomainName: js.UndefOr[NonEmptyString] = js.undefined,
        EncryptionAtRestOptions: js.UndefOr[AwsOpenSearchServiceDomainEncryptionAtRestOptionsDetails] = js.undefined,
        EngineVersion: js.UndefOr[NonEmptyString] = js.undefined,
        Id: js.UndefOr[NonEmptyString] = js.undefined,
        LogPublishingOptions: js.UndefOr[AwsOpenSearchServiceDomainLogPublishingOptionsDetails] = js.undefined,
        NodeToNodeEncryptionOptions: js.UndefOr[AwsOpenSearchServiceDomainNodeToNodeEncryptionOptionsDetails] = js.undefined,
        ServiceSoftwareOptions: js.UndefOr[AwsOpenSearchServiceDomainServiceSoftwareOptionsDetails] = js.undefined,
        VpcOptions: js.UndefOr[AwsOpenSearchServiceDomainVpcOptionsDetails] = js.undefined
    ): AwsOpenSearchServiceDomainDetails = {
      val __obj = js.Dynamic.literal()
      AccessPolicies.foreach(__v => __obj.updateDynamic("AccessPolicies")(__v.asInstanceOf[js.Any]))
      AdvancedSecurityOptions.foreach(__v => __obj.updateDynamic("AdvancedSecurityOptions")(__v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      ClusterConfig.foreach(__v => __obj.updateDynamic("ClusterConfig")(__v.asInstanceOf[js.Any]))
      DomainEndpoint.foreach(__v => __obj.updateDynamic("DomainEndpoint")(__v.asInstanceOf[js.Any]))
      DomainEndpointOptions.foreach(__v => __obj.updateDynamic("DomainEndpointOptions")(__v.asInstanceOf[js.Any]))
      DomainEndpoints.foreach(__v => __obj.updateDynamic("DomainEndpoints")(__v.asInstanceOf[js.Any]))
      DomainName.foreach(__v => __obj.updateDynamic("DomainName")(__v.asInstanceOf[js.Any]))
      EncryptionAtRestOptions.foreach(__v => __obj.updateDynamic("EncryptionAtRestOptions")(__v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      LogPublishingOptions.foreach(__v => __obj.updateDynamic("LogPublishingOptions")(__v.asInstanceOf[js.Any]))
      NodeToNodeEncryptionOptions.foreach(__v => __obj.updateDynamic("NodeToNodeEncryptionOptions")(__v.asInstanceOf[js.Any]))
      ServiceSoftwareOptions.foreach(__v => __obj.updateDynamic("ServiceSoftwareOptions")(__v.asInstanceOf[js.Any]))
      VpcOptions.foreach(__v => __obj.updateDynamic("VpcOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsOpenSearchServiceDomainDetails]
    }
  }

  /** Information about additional options for the domain endpoint.
    */
  @js.native
  trait AwsOpenSearchServiceDomainDomainEndpointOptionsDetails extends js.Object {
    var CustomEndpoint: js.UndefOr[NonEmptyString]
    var CustomEndpointCertificateArn: js.UndefOr[NonEmptyString]
    var CustomEndpointEnabled: js.UndefOr[Boolean]
    var EnforceHTTPS: js.UndefOr[Boolean]
    var TLSSecurityPolicy: js.UndefOr[NonEmptyString]
  }

  object AwsOpenSearchServiceDomainDomainEndpointOptionsDetails {
    @inline
    def apply(
        CustomEndpoint: js.UndefOr[NonEmptyString] = js.undefined,
        CustomEndpointCertificateArn: js.UndefOr[NonEmptyString] = js.undefined,
        CustomEndpointEnabled: js.UndefOr[Boolean] = js.undefined,
        EnforceHTTPS: js.UndefOr[Boolean] = js.undefined,
        TLSSecurityPolicy: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsOpenSearchServiceDomainDomainEndpointOptionsDetails = {
      val __obj = js.Dynamic.literal()
      CustomEndpoint.foreach(__v => __obj.updateDynamic("CustomEndpoint")(__v.asInstanceOf[js.Any]))
      CustomEndpointCertificateArn.foreach(__v => __obj.updateDynamic("CustomEndpointCertificateArn")(__v.asInstanceOf[js.Any]))
      CustomEndpointEnabled.foreach(__v => __obj.updateDynamic("CustomEndpointEnabled")(__v.asInstanceOf[js.Any]))
      EnforceHTTPS.foreach(__v => __obj.updateDynamic("EnforceHTTPS")(__v.asInstanceOf[js.Any]))
      TLSSecurityPolicy.foreach(__v => __obj.updateDynamic("TLSSecurityPolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsOpenSearchServiceDomainDomainEndpointOptionsDetails]
    }
  }

  /** Details about the configuration for encryption at rest for the OpenSearch domain.
    */
  @js.native
  trait AwsOpenSearchServiceDomainEncryptionAtRestOptionsDetails extends js.Object {
    var Enabled: js.UndefOr[Boolean]
    var KmsKeyId: js.UndefOr[NonEmptyString]
  }

  object AwsOpenSearchServiceDomainEncryptionAtRestOptionsDetails {
    @inline
    def apply(
        Enabled: js.UndefOr[Boolean] = js.undefined,
        KmsKeyId: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsOpenSearchServiceDomainEncryptionAtRestOptionsDetails = {
      val __obj = js.Dynamic.literal()
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsOpenSearchServiceDomainEncryptionAtRestOptionsDetails]
    }
  }

  /** Configuration details for a log publishing option.
    */
  @js.native
  trait AwsOpenSearchServiceDomainLogPublishingOption extends js.Object {
    var CloudWatchLogsLogGroupArn: js.UndefOr[NonEmptyString]
    var Enabled: js.UndefOr[Boolean]
  }

  object AwsOpenSearchServiceDomainLogPublishingOption {
    @inline
    def apply(
        CloudWatchLogsLogGroupArn: js.UndefOr[NonEmptyString] = js.undefined,
        Enabled: js.UndefOr[Boolean] = js.undefined
    ): AwsOpenSearchServiceDomainLogPublishingOption = {
      val __obj = js.Dynamic.literal()
      CloudWatchLogsLogGroupArn.foreach(__v => __obj.updateDynamic("CloudWatchLogsLogGroupArn")(__v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsOpenSearchServiceDomainLogPublishingOption]
    }
  }

  /** Configures the CloudWatch Logs to publish for the OpenSearch domain.
    */
  @js.native
  trait AwsOpenSearchServiceDomainLogPublishingOptionsDetails extends js.Object {
    var AuditLogs: js.UndefOr[AwsOpenSearchServiceDomainLogPublishingOption]
    var IndexSlowLogs: js.UndefOr[AwsOpenSearchServiceDomainLogPublishingOption]
    var SearchSlowLogs: js.UndefOr[AwsOpenSearchServiceDomainLogPublishingOption]
  }

  object AwsOpenSearchServiceDomainLogPublishingOptionsDetails {
    @inline
    def apply(
        AuditLogs: js.UndefOr[AwsOpenSearchServiceDomainLogPublishingOption] = js.undefined,
        IndexSlowLogs: js.UndefOr[AwsOpenSearchServiceDomainLogPublishingOption] = js.undefined,
        SearchSlowLogs: js.UndefOr[AwsOpenSearchServiceDomainLogPublishingOption] = js.undefined
    ): AwsOpenSearchServiceDomainLogPublishingOptionsDetails = {
      val __obj = js.Dynamic.literal()
      AuditLogs.foreach(__v => __obj.updateDynamic("AuditLogs")(__v.asInstanceOf[js.Any]))
      IndexSlowLogs.foreach(__v => __obj.updateDynamic("IndexSlowLogs")(__v.asInstanceOf[js.Any]))
      SearchSlowLogs.foreach(__v => __obj.updateDynamic("SearchSlowLogs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsOpenSearchServiceDomainLogPublishingOptionsDetails]
    }
  }

  /** Specifies information about the master user of the domain.
    */
  @js.native
  trait AwsOpenSearchServiceDomainMasterUserOptionsDetails extends js.Object {
    var MasterUserArn: js.UndefOr[NonEmptyString]
    var MasterUserName: js.UndefOr[NonEmptyString]
    var MasterUserPassword: js.UndefOr[NonEmptyString]
  }

  object AwsOpenSearchServiceDomainMasterUserOptionsDetails {
    @inline
    def apply(
        MasterUserArn: js.UndefOr[NonEmptyString] = js.undefined,
        MasterUserName: js.UndefOr[NonEmptyString] = js.undefined,
        MasterUserPassword: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsOpenSearchServiceDomainMasterUserOptionsDetails = {
      val __obj = js.Dynamic.literal()
      MasterUserArn.foreach(__v => __obj.updateDynamic("MasterUserArn")(__v.asInstanceOf[js.Any]))
      MasterUserName.foreach(__v => __obj.updateDynamic("MasterUserName")(__v.asInstanceOf[js.Any]))
      MasterUserPassword.foreach(__v => __obj.updateDynamic("MasterUserPassword")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsOpenSearchServiceDomainMasterUserOptionsDetails]
    }
  }

  /** Provides details about the configuration for node-to-node encryption.
    */
  @js.native
  trait AwsOpenSearchServiceDomainNodeToNodeEncryptionOptionsDetails extends js.Object {
    var Enabled: js.UndefOr[Boolean]
  }

  object AwsOpenSearchServiceDomainNodeToNodeEncryptionOptionsDetails {
    @inline
    def apply(
        Enabled: js.UndefOr[Boolean] = js.undefined
    ): AwsOpenSearchServiceDomainNodeToNodeEncryptionOptionsDetails = {
      val __obj = js.Dynamic.literal()
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsOpenSearchServiceDomainNodeToNodeEncryptionOptionsDetails]
    }
  }

  /** Provides information about the state of the domain relative to the latest service software.
    */
  @js.native
  trait AwsOpenSearchServiceDomainServiceSoftwareOptionsDetails extends js.Object {
    var AutomatedUpdateDate: js.UndefOr[NonEmptyString]
    var Cancellable: js.UndefOr[Boolean]
    var CurrentVersion: js.UndefOr[NonEmptyString]
    var Description: js.UndefOr[NonEmptyString]
    var NewVersion: js.UndefOr[NonEmptyString]
    var OptionalDeployment: js.UndefOr[Boolean]
    var UpdateAvailable: js.UndefOr[Boolean]
    var UpdateStatus: js.UndefOr[NonEmptyString]
  }

  object AwsOpenSearchServiceDomainServiceSoftwareOptionsDetails {
    @inline
    def apply(
        AutomatedUpdateDate: js.UndefOr[NonEmptyString] = js.undefined,
        Cancellable: js.UndefOr[Boolean] = js.undefined,
        CurrentVersion: js.UndefOr[NonEmptyString] = js.undefined,
        Description: js.UndefOr[NonEmptyString] = js.undefined,
        NewVersion: js.UndefOr[NonEmptyString] = js.undefined,
        OptionalDeployment: js.UndefOr[Boolean] = js.undefined,
        UpdateAvailable: js.UndefOr[Boolean] = js.undefined,
        UpdateStatus: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsOpenSearchServiceDomainServiceSoftwareOptionsDetails = {
      val __obj = js.Dynamic.literal()
      AutomatedUpdateDate.foreach(__v => __obj.updateDynamic("AutomatedUpdateDate")(__v.asInstanceOf[js.Any]))
      Cancellable.foreach(__v => __obj.updateDynamic("Cancellable")(__v.asInstanceOf[js.Any]))
      CurrentVersion.foreach(__v => __obj.updateDynamic("CurrentVersion")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      NewVersion.foreach(__v => __obj.updateDynamic("NewVersion")(__v.asInstanceOf[js.Any]))
      OptionalDeployment.foreach(__v => __obj.updateDynamic("OptionalDeployment")(__v.asInstanceOf[js.Any]))
      UpdateAvailable.foreach(__v => __obj.updateDynamic("UpdateAvailable")(__v.asInstanceOf[js.Any]))
      UpdateStatus.foreach(__v => __obj.updateDynamic("UpdateStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsOpenSearchServiceDomainServiceSoftwareOptionsDetails]
    }
  }

  /** Contains information that OpenSearch Service derives based on the <code>VPCOptions</code> for the domain.
    */
  @js.native
  trait AwsOpenSearchServiceDomainVpcOptionsDetails extends js.Object {
    var SecurityGroupIds: js.UndefOr[NonEmptyStringList]
    var SubnetIds: js.UndefOr[NonEmptyStringList]
  }

  object AwsOpenSearchServiceDomainVpcOptionsDetails {
    @inline
    def apply(
        SecurityGroupIds: js.UndefOr[NonEmptyStringList] = js.undefined,
        SubnetIds: js.UndefOr[NonEmptyStringList] = js.undefined
    ): AwsOpenSearchServiceDomainVpcOptionsDetails = {
      val __obj = js.Dynamic.literal()
      SecurityGroupIds.foreach(__v => __obj.updateDynamic("SecurityGroupIds")(__v.asInstanceOf[js.Any]))
      SubnetIds.foreach(__v => __obj.updateDynamic("SubnetIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsOpenSearchServiceDomainVpcOptionsDetails]
    }
  }

  /** An IAM role that is associated with the Amazon RDS DB cluster.
    */
  @js.native
  trait AwsRdsDbClusterAssociatedRole extends js.Object {
    var RoleArn: js.UndefOr[NonEmptyString]
    var Status: js.UndefOr[NonEmptyString]
  }

  object AwsRdsDbClusterAssociatedRole {
    @inline
    def apply(
        RoleArn: js.UndefOr[NonEmptyString] = js.undefined,
        Status: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsRdsDbClusterAssociatedRole = {
      val __obj = js.Dynamic.literal()
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsRdsDbClusterAssociatedRole]
    }
  }

  /** Information about an Amazon RDS DB cluster.
    */
  @js.native
  trait AwsRdsDbClusterDetails extends js.Object {
    var ActivityStreamStatus: js.UndefOr[NonEmptyString]
    var AllocatedStorage: js.UndefOr[Int]
    var AssociatedRoles: js.UndefOr[AwsRdsDbClusterAssociatedRoles]
    var AvailabilityZones: js.UndefOr[StringList]
    var BackupRetentionPeriod: js.UndefOr[Int]
    var ClusterCreateTime: js.UndefOr[NonEmptyString]
    var CopyTagsToSnapshot: js.UndefOr[Boolean]
    var CrossAccountClone: js.UndefOr[Boolean]
    var CustomEndpoints: js.UndefOr[StringList]
    var DatabaseName: js.UndefOr[NonEmptyString]
    var DbClusterIdentifier: js.UndefOr[NonEmptyString]
    var DbClusterMembers: js.UndefOr[AwsRdsDbClusterMembers]
    var DbClusterOptionGroupMemberships: js.UndefOr[AwsRdsDbClusterOptionGroupMemberships]
    var DbClusterParameterGroup: js.UndefOr[NonEmptyString]
    var DbClusterResourceId: js.UndefOr[NonEmptyString]
    var DbSubnetGroup: js.UndefOr[NonEmptyString]
    var DeletionProtection: js.UndefOr[Boolean]
    var DomainMemberships: js.UndefOr[AwsRdsDbDomainMemberships]
    var EnabledCloudWatchLogsExports: js.UndefOr[StringList]
    var Endpoint: js.UndefOr[NonEmptyString]
    var Engine: js.UndefOr[NonEmptyString]
    var EngineMode: js.UndefOr[NonEmptyString]
    var EngineVersion: js.UndefOr[NonEmptyString]
    var HostedZoneId: js.UndefOr[NonEmptyString]
    var HttpEndpointEnabled: js.UndefOr[Boolean]
    var IamDatabaseAuthenticationEnabled: js.UndefOr[Boolean]
    var KmsKeyId: js.UndefOr[NonEmptyString]
    var MasterUsername: js.UndefOr[NonEmptyString]
    var MultiAz: js.UndefOr[Boolean]
    var Port: js.UndefOr[Int]
    var PreferredBackupWindow: js.UndefOr[NonEmptyString]
    var PreferredMaintenanceWindow: js.UndefOr[NonEmptyString]
    var ReadReplicaIdentifiers: js.UndefOr[StringList]
    var ReaderEndpoint: js.UndefOr[NonEmptyString]
    var Status: js.UndefOr[NonEmptyString]
    var StorageEncrypted: js.UndefOr[Boolean]
    var VpcSecurityGroups: js.UndefOr[AwsRdsDbInstanceVpcSecurityGroups]
  }

  object AwsRdsDbClusterDetails {
    @inline
    def apply(
        ActivityStreamStatus: js.UndefOr[NonEmptyString] = js.undefined,
        AllocatedStorage: js.UndefOr[Int] = js.undefined,
        AssociatedRoles: js.UndefOr[AwsRdsDbClusterAssociatedRoles] = js.undefined,
        AvailabilityZones: js.UndefOr[StringList] = js.undefined,
        BackupRetentionPeriod: js.UndefOr[Int] = js.undefined,
        ClusterCreateTime: js.UndefOr[NonEmptyString] = js.undefined,
        CopyTagsToSnapshot: js.UndefOr[Boolean] = js.undefined,
        CrossAccountClone: js.UndefOr[Boolean] = js.undefined,
        CustomEndpoints: js.UndefOr[StringList] = js.undefined,
        DatabaseName: js.UndefOr[NonEmptyString] = js.undefined,
        DbClusterIdentifier: js.UndefOr[NonEmptyString] = js.undefined,
        DbClusterMembers: js.UndefOr[AwsRdsDbClusterMembers] = js.undefined,
        DbClusterOptionGroupMemberships: js.UndefOr[AwsRdsDbClusterOptionGroupMemberships] = js.undefined,
        DbClusterParameterGroup: js.UndefOr[NonEmptyString] = js.undefined,
        DbClusterResourceId: js.UndefOr[NonEmptyString] = js.undefined,
        DbSubnetGroup: js.UndefOr[NonEmptyString] = js.undefined,
        DeletionProtection: js.UndefOr[Boolean] = js.undefined,
        DomainMemberships: js.UndefOr[AwsRdsDbDomainMemberships] = js.undefined,
        EnabledCloudWatchLogsExports: js.UndefOr[StringList] = js.undefined,
        Endpoint: js.UndefOr[NonEmptyString] = js.undefined,
        Engine: js.UndefOr[NonEmptyString] = js.undefined,
        EngineMode: js.UndefOr[NonEmptyString] = js.undefined,
        EngineVersion: js.UndefOr[NonEmptyString] = js.undefined,
        HostedZoneId: js.UndefOr[NonEmptyString] = js.undefined,
        HttpEndpointEnabled: js.UndefOr[Boolean] = js.undefined,
        IamDatabaseAuthenticationEnabled: js.UndefOr[Boolean] = js.undefined,
        KmsKeyId: js.UndefOr[NonEmptyString] = js.undefined,
        MasterUsername: js.UndefOr[NonEmptyString] = js.undefined,
        MultiAz: js.UndefOr[Boolean] = js.undefined,
        Port: js.UndefOr[Int] = js.undefined,
        PreferredBackupWindow: js.UndefOr[NonEmptyString] = js.undefined,
        PreferredMaintenanceWindow: js.UndefOr[NonEmptyString] = js.undefined,
        ReadReplicaIdentifiers: js.UndefOr[StringList] = js.undefined,
        ReaderEndpoint: js.UndefOr[NonEmptyString] = js.undefined,
        Status: js.UndefOr[NonEmptyString] = js.undefined,
        StorageEncrypted: js.UndefOr[Boolean] = js.undefined,
        VpcSecurityGroups: js.UndefOr[AwsRdsDbInstanceVpcSecurityGroups] = js.undefined
    ): AwsRdsDbClusterDetails = {
      val __obj = js.Dynamic.literal()
      ActivityStreamStatus.foreach(__v => __obj.updateDynamic("ActivityStreamStatus")(__v.asInstanceOf[js.Any]))
      AllocatedStorage.foreach(__v => __obj.updateDynamic("AllocatedStorage")(__v.asInstanceOf[js.Any]))
      AssociatedRoles.foreach(__v => __obj.updateDynamic("AssociatedRoles")(__v.asInstanceOf[js.Any]))
      AvailabilityZones.foreach(__v => __obj.updateDynamic("AvailabilityZones")(__v.asInstanceOf[js.Any]))
      BackupRetentionPeriod.foreach(__v => __obj.updateDynamic("BackupRetentionPeriod")(__v.asInstanceOf[js.Any]))
      ClusterCreateTime.foreach(__v => __obj.updateDynamic("ClusterCreateTime")(__v.asInstanceOf[js.Any]))
      CopyTagsToSnapshot.foreach(__v => __obj.updateDynamic("CopyTagsToSnapshot")(__v.asInstanceOf[js.Any]))
      CrossAccountClone.foreach(__v => __obj.updateDynamic("CrossAccountClone")(__v.asInstanceOf[js.Any]))
      CustomEndpoints.foreach(__v => __obj.updateDynamic("CustomEndpoints")(__v.asInstanceOf[js.Any]))
      DatabaseName.foreach(__v => __obj.updateDynamic("DatabaseName")(__v.asInstanceOf[js.Any]))
      DbClusterIdentifier.foreach(__v => __obj.updateDynamic("DbClusterIdentifier")(__v.asInstanceOf[js.Any]))
      DbClusterMembers.foreach(__v => __obj.updateDynamic("DbClusterMembers")(__v.asInstanceOf[js.Any]))
      DbClusterOptionGroupMemberships.foreach(__v => __obj.updateDynamic("DbClusterOptionGroupMemberships")(__v.asInstanceOf[js.Any]))
      DbClusterParameterGroup.foreach(__v => __obj.updateDynamic("DbClusterParameterGroup")(__v.asInstanceOf[js.Any]))
      DbClusterResourceId.foreach(__v => __obj.updateDynamic("DbClusterResourceId")(__v.asInstanceOf[js.Any]))
      DbSubnetGroup.foreach(__v => __obj.updateDynamic("DbSubnetGroup")(__v.asInstanceOf[js.Any]))
      DeletionProtection.foreach(__v => __obj.updateDynamic("DeletionProtection")(__v.asInstanceOf[js.Any]))
      DomainMemberships.foreach(__v => __obj.updateDynamic("DomainMemberships")(__v.asInstanceOf[js.Any]))
      EnabledCloudWatchLogsExports.foreach(__v => __obj.updateDynamic("EnabledCloudWatchLogsExports")(__v.asInstanceOf[js.Any]))
      Endpoint.foreach(__v => __obj.updateDynamic("Endpoint")(__v.asInstanceOf[js.Any]))
      Engine.foreach(__v => __obj.updateDynamic("Engine")(__v.asInstanceOf[js.Any]))
      EngineMode.foreach(__v => __obj.updateDynamic("EngineMode")(__v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
      HostedZoneId.foreach(__v => __obj.updateDynamic("HostedZoneId")(__v.asInstanceOf[js.Any]))
      HttpEndpointEnabled.foreach(__v => __obj.updateDynamic("HttpEndpointEnabled")(__v.asInstanceOf[js.Any]))
      IamDatabaseAuthenticationEnabled.foreach(__v => __obj.updateDynamic("IamDatabaseAuthenticationEnabled")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      MasterUsername.foreach(__v => __obj.updateDynamic("MasterUsername")(__v.asInstanceOf[js.Any]))
      MultiAz.foreach(__v => __obj.updateDynamic("MultiAz")(__v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      PreferredBackupWindow.foreach(__v => __obj.updateDynamic("PreferredBackupWindow")(__v.asInstanceOf[js.Any]))
      PreferredMaintenanceWindow.foreach(__v => __obj.updateDynamic("PreferredMaintenanceWindow")(__v.asInstanceOf[js.Any]))
      ReadReplicaIdentifiers.foreach(__v => __obj.updateDynamic("ReadReplicaIdentifiers")(__v.asInstanceOf[js.Any]))
      ReaderEndpoint.foreach(__v => __obj.updateDynamic("ReaderEndpoint")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StorageEncrypted.foreach(__v => __obj.updateDynamic("StorageEncrypted")(__v.asInstanceOf[js.Any]))
      VpcSecurityGroups.foreach(__v => __obj.updateDynamic("VpcSecurityGroups")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsRdsDbClusterDetails]
    }
  }

  /** Information about an instance in the DB cluster.
    */
  @js.native
  trait AwsRdsDbClusterMember extends js.Object {
    var DbClusterParameterGroupStatus: js.UndefOr[NonEmptyString]
    var DbInstanceIdentifier: js.UndefOr[NonEmptyString]
    var IsClusterWriter: js.UndefOr[Boolean]
    var PromotionTier: js.UndefOr[Int]
  }

  object AwsRdsDbClusterMember {
    @inline
    def apply(
        DbClusterParameterGroupStatus: js.UndefOr[NonEmptyString] = js.undefined,
        DbInstanceIdentifier: js.UndefOr[NonEmptyString] = js.undefined,
        IsClusterWriter: js.UndefOr[Boolean] = js.undefined,
        PromotionTier: js.UndefOr[Int] = js.undefined
    ): AwsRdsDbClusterMember = {
      val __obj = js.Dynamic.literal()
      DbClusterParameterGroupStatus.foreach(__v => __obj.updateDynamic("DbClusterParameterGroupStatus")(__v.asInstanceOf[js.Any]))
      DbInstanceIdentifier.foreach(__v => __obj.updateDynamic("DbInstanceIdentifier")(__v.asInstanceOf[js.Any]))
      IsClusterWriter.foreach(__v => __obj.updateDynamic("IsClusterWriter")(__v.asInstanceOf[js.Any]))
      PromotionTier.foreach(__v => __obj.updateDynamic("PromotionTier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsRdsDbClusterMember]
    }
  }

  /** Information about an option group membership for a DB cluster.
    */
  @js.native
  trait AwsRdsDbClusterOptionGroupMembership extends js.Object {
    var DbClusterOptionGroupName: js.UndefOr[NonEmptyString]
    var Status: js.UndefOr[NonEmptyString]
  }

  object AwsRdsDbClusterOptionGroupMembership {
    @inline
    def apply(
        DbClusterOptionGroupName: js.UndefOr[NonEmptyString] = js.undefined,
        Status: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsRdsDbClusterOptionGroupMembership = {
      val __obj = js.Dynamic.literal()
      DbClusterOptionGroupName.foreach(__v => __obj.updateDynamic("DbClusterOptionGroupName")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsRdsDbClusterOptionGroupMembership]
    }
  }

  /** Information about an Amazon RDS DB cluster snapshot.
    */
  @js.native
  trait AwsRdsDbClusterSnapshotDetails extends js.Object {
    var AllocatedStorage: js.UndefOr[Int]
    var AvailabilityZones: js.UndefOr[StringList]
    var ClusterCreateTime: js.UndefOr[NonEmptyString]
    var DbClusterIdentifier: js.UndefOr[NonEmptyString]
    var DbClusterSnapshotIdentifier: js.UndefOr[NonEmptyString]
    var Engine: js.UndefOr[NonEmptyString]
    var EngineVersion: js.UndefOr[NonEmptyString]
    var IamDatabaseAuthenticationEnabled: js.UndefOr[Boolean]
    var KmsKeyId: js.UndefOr[NonEmptyString]
    var LicenseModel: js.UndefOr[NonEmptyString]
    var MasterUsername: js.UndefOr[NonEmptyString]
    var PercentProgress: js.UndefOr[Int]
    var Port: js.UndefOr[Int]
    var SnapshotCreateTime: js.UndefOr[NonEmptyString]
    var SnapshotType: js.UndefOr[NonEmptyString]
    var Status: js.UndefOr[NonEmptyString]
    var StorageEncrypted: js.UndefOr[Boolean]
    var VpcId: js.UndefOr[NonEmptyString]
  }

  object AwsRdsDbClusterSnapshotDetails {
    @inline
    def apply(
        AllocatedStorage: js.UndefOr[Int] = js.undefined,
        AvailabilityZones: js.UndefOr[StringList] = js.undefined,
        ClusterCreateTime: js.UndefOr[NonEmptyString] = js.undefined,
        DbClusterIdentifier: js.UndefOr[NonEmptyString] = js.undefined,
        DbClusterSnapshotIdentifier: js.UndefOr[NonEmptyString] = js.undefined,
        Engine: js.UndefOr[NonEmptyString] = js.undefined,
        EngineVersion: js.UndefOr[NonEmptyString] = js.undefined,
        IamDatabaseAuthenticationEnabled: js.UndefOr[Boolean] = js.undefined,
        KmsKeyId: js.UndefOr[NonEmptyString] = js.undefined,
        LicenseModel: js.UndefOr[NonEmptyString] = js.undefined,
        MasterUsername: js.UndefOr[NonEmptyString] = js.undefined,
        PercentProgress: js.UndefOr[Int] = js.undefined,
        Port: js.UndefOr[Int] = js.undefined,
        SnapshotCreateTime: js.UndefOr[NonEmptyString] = js.undefined,
        SnapshotType: js.UndefOr[NonEmptyString] = js.undefined,
        Status: js.UndefOr[NonEmptyString] = js.undefined,
        StorageEncrypted: js.UndefOr[Boolean] = js.undefined,
        VpcId: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsRdsDbClusterSnapshotDetails = {
      val __obj = js.Dynamic.literal()
      AllocatedStorage.foreach(__v => __obj.updateDynamic("AllocatedStorage")(__v.asInstanceOf[js.Any]))
      AvailabilityZones.foreach(__v => __obj.updateDynamic("AvailabilityZones")(__v.asInstanceOf[js.Any]))
      ClusterCreateTime.foreach(__v => __obj.updateDynamic("ClusterCreateTime")(__v.asInstanceOf[js.Any]))
      DbClusterIdentifier.foreach(__v => __obj.updateDynamic("DbClusterIdentifier")(__v.asInstanceOf[js.Any]))
      DbClusterSnapshotIdentifier.foreach(__v => __obj.updateDynamic("DbClusterSnapshotIdentifier")(__v.asInstanceOf[js.Any]))
      Engine.foreach(__v => __obj.updateDynamic("Engine")(__v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
      IamDatabaseAuthenticationEnabled.foreach(__v => __obj.updateDynamic("IamDatabaseAuthenticationEnabled")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      LicenseModel.foreach(__v => __obj.updateDynamic("LicenseModel")(__v.asInstanceOf[js.Any]))
      MasterUsername.foreach(__v => __obj.updateDynamic("MasterUsername")(__v.asInstanceOf[js.Any]))
      PercentProgress.foreach(__v => __obj.updateDynamic("PercentProgress")(__v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      SnapshotCreateTime.foreach(__v => __obj.updateDynamic("SnapshotCreateTime")(__v.asInstanceOf[js.Any]))
      SnapshotType.foreach(__v => __obj.updateDynamic("SnapshotType")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StorageEncrypted.foreach(__v => __obj.updateDynamic("StorageEncrypted")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsRdsDbClusterSnapshotDetails]
    }
  }

  /** Information about an Active Directory domain membership record associated with the DB instance.
    */
  @js.native
  trait AwsRdsDbDomainMembership extends js.Object {
    var Domain: js.UndefOr[NonEmptyString]
    var Fqdn: js.UndefOr[NonEmptyString]
    var IamRoleName: js.UndefOr[NonEmptyString]
    var Status: js.UndefOr[NonEmptyString]
  }

  object AwsRdsDbDomainMembership {
    @inline
    def apply(
        Domain: js.UndefOr[NonEmptyString] = js.undefined,
        Fqdn: js.UndefOr[NonEmptyString] = js.undefined,
        IamRoleName: js.UndefOr[NonEmptyString] = js.undefined,
        Status: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsRdsDbDomainMembership = {
      val __obj = js.Dynamic.literal()
      Domain.foreach(__v => __obj.updateDynamic("Domain")(__v.asInstanceOf[js.Any]))
      Fqdn.foreach(__v => __obj.updateDynamic("Fqdn")(__v.asInstanceOf[js.Any]))
      IamRoleName.foreach(__v => __obj.updateDynamic("IamRoleName")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsRdsDbDomainMembership]
    }
  }

  /** An IAM role associated with the DB instance.
    */
  @js.native
  trait AwsRdsDbInstanceAssociatedRole extends js.Object {
    var FeatureName: js.UndefOr[NonEmptyString]
    var RoleArn: js.UndefOr[NonEmptyString]
    var Status: js.UndefOr[NonEmptyString]
  }

  object AwsRdsDbInstanceAssociatedRole {
    @inline
    def apply(
        FeatureName: js.UndefOr[NonEmptyString] = js.undefined,
        RoleArn: js.UndefOr[NonEmptyString] = js.undefined,
        Status: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsRdsDbInstanceAssociatedRole = {
      val __obj = js.Dynamic.literal()
      FeatureName.foreach(__v => __obj.updateDynamic("FeatureName")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsRdsDbInstanceAssociatedRole]
    }
  }

  /** Contains the details of an Amazon RDS DB instance.
    */
  @js.native
  trait AwsRdsDbInstanceDetails extends js.Object {
    var AllocatedStorage: js.UndefOr[Int]
    var AssociatedRoles: js.UndefOr[AwsRdsDbInstanceAssociatedRoles]
    var AutoMinorVersionUpgrade: js.UndefOr[Boolean]
    var AvailabilityZone: js.UndefOr[NonEmptyString]
    var BackupRetentionPeriod: js.UndefOr[Int]
    var CACertificateIdentifier: js.UndefOr[NonEmptyString]
    var CharacterSetName: js.UndefOr[NonEmptyString]
    var CopyTagsToSnapshot: js.UndefOr[Boolean]
    var DBClusterIdentifier: js.UndefOr[NonEmptyString]
    var DBInstanceClass: js.UndefOr[NonEmptyString]
    var DBInstanceIdentifier: js.UndefOr[NonEmptyString]
    var DBName: js.UndefOr[NonEmptyString]
    var DbInstancePort: js.UndefOr[Int]
    var DbInstanceStatus: js.UndefOr[NonEmptyString]
    var DbParameterGroups: js.UndefOr[AwsRdsDbParameterGroups]
    var DbSecurityGroups: js.UndefOr[StringList]
    var DbSubnetGroup: js.UndefOr[AwsRdsDbSubnetGroup]
    var DbiResourceId: js.UndefOr[NonEmptyString]
    var DeletionProtection: js.UndefOr[Boolean]
    var DomainMemberships: js.UndefOr[AwsRdsDbDomainMemberships]
    var EnabledCloudWatchLogsExports: js.UndefOr[StringList]
    var Endpoint: js.UndefOr[AwsRdsDbInstanceEndpoint]
    var Engine: js.UndefOr[NonEmptyString]
    var EngineVersion: js.UndefOr[NonEmptyString]
    var EnhancedMonitoringResourceArn: js.UndefOr[NonEmptyString]
    var IAMDatabaseAuthenticationEnabled: js.UndefOr[Boolean]
    var InstanceCreateTime: js.UndefOr[NonEmptyString]
    var Iops: js.UndefOr[Int]
    var KmsKeyId: js.UndefOr[NonEmptyString]
    var LatestRestorableTime: js.UndefOr[NonEmptyString]
    var LicenseModel: js.UndefOr[NonEmptyString]
    var ListenerEndpoint: js.UndefOr[AwsRdsDbInstanceEndpoint]
    var MasterUsername: js.UndefOr[NonEmptyString]
    var MaxAllocatedStorage: js.UndefOr[Int]
    var MonitoringInterval: js.UndefOr[Int]
    var MonitoringRoleArn: js.UndefOr[NonEmptyString]
    var MultiAz: js.UndefOr[Boolean]
    var OptionGroupMemberships: js.UndefOr[AwsRdsDbOptionGroupMemberships]
    var PendingModifiedValues: js.UndefOr[AwsRdsDbPendingModifiedValues]
    var PerformanceInsightsEnabled: js.UndefOr[Boolean]
    var PerformanceInsightsKmsKeyId: js.UndefOr[NonEmptyString]
    var PerformanceInsightsRetentionPeriod: js.UndefOr[Int]
    var PreferredBackupWindow: js.UndefOr[NonEmptyString]
    var PreferredMaintenanceWindow: js.UndefOr[NonEmptyString]
    var ProcessorFeatures: js.UndefOr[AwsRdsDbProcessorFeatures]
    var PromotionTier: js.UndefOr[Int]
    var PubliclyAccessible: js.UndefOr[Boolean]
    var ReadReplicaDBClusterIdentifiers: js.UndefOr[StringList]
    var ReadReplicaDBInstanceIdentifiers: js.UndefOr[StringList]
    var ReadReplicaSourceDBInstanceIdentifier: js.UndefOr[NonEmptyString]
    var SecondaryAvailabilityZone: js.UndefOr[NonEmptyString]
    var StatusInfos: js.UndefOr[AwsRdsDbStatusInfos]
    var StorageEncrypted: js.UndefOr[Boolean]
    var StorageType: js.UndefOr[NonEmptyString]
    var TdeCredentialArn: js.UndefOr[NonEmptyString]
    var Timezone: js.UndefOr[NonEmptyString]
    var VpcSecurityGroups: js.UndefOr[AwsRdsDbInstanceVpcSecurityGroups]
  }

  object AwsRdsDbInstanceDetails {
    @inline
    def apply(
        AllocatedStorage: js.UndefOr[Int] = js.undefined,
        AssociatedRoles: js.UndefOr[AwsRdsDbInstanceAssociatedRoles] = js.undefined,
        AutoMinorVersionUpgrade: js.UndefOr[Boolean] = js.undefined,
        AvailabilityZone: js.UndefOr[NonEmptyString] = js.undefined,
        BackupRetentionPeriod: js.UndefOr[Int] = js.undefined,
        CACertificateIdentifier: js.UndefOr[NonEmptyString] = js.undefined,
        CharacterSetName: js.UndefOr[NonEmptyString] = js.undefined,
        CopyTagsToSnapshot: js.UndefOr[Boolean] = js.undefined,
        DBClusterIdentifier: js.UndefOr[NonEmptyString] = js.undefined,
        DBInstanceClass: js.UndefOr[NonEmptyString] = js.undefined,
        DBInstanceIdentifier: js.UndefOr[NonEmptyString] = js.undefined,
        DBName: js.UndefOr[NonEmptyString] = js.undefined,
        DbInstancePort: js.UndefOr[Int] = js.undefined,
        DbInstanceStatus: js.UndefOr[NonEmptyString] = js.undefined,
        DbParameterGroups: js.UndefOr[AwsRdsDbParameterGroups] = js.undefined,
        DbSecurityGroups: js.UndefOr[StringList] = js.undefined,
        DbSubnetGroup: js.UndefOr[AwsRdsDbSubnetGroup] = js.undefined,
        DbiResourceId: js.UndefOr[NonEmptyString] = js.undefined,
        DeletionProtection: js.UndefOr[Boolean] = js.undefined,
        DomainMemberships: js.UndefOr[AwsRdsDbDomainMemberships] = js.undefined,
        EnabledCloudWatchLogsExports: js.UndefOr[StringList] = js.undefined,
        Endpoint: js.UndefOr[AwsRdsDbInstanceEndpoint] = js.undefined,
        Engine: js.UndefOr[NonEmptyString] = js.undefined,
        EngineVersion: js.UndefOr[NonEmptyString] = js.undefined,
        EnhancedMonitoringResourceArn: js.UndefOr[NonEmptyString] = js.undefined,
        IAMDatabaseAuthenticationEnabled: js.UndefOr[Boolean] = js.undefined,
        InstanceCreateTime: js.UndefOr[NonEmptyString] = js.undefined,
        Iops: js.UndefOr[Int] = js.undefined,
        KmsKeyId: js.UndefOr[NonEmptyString] = js.undefined,
        LatestRestorableTime: js.UndefOr[NonEmptyString] = js.undefined,
        LicenseModel: js.UndefOr[NonEmptyString] = js.undefined,
        ListenerEndpoint: js.UndefOr[AwsRdsDbInstanceEndpoint] = js.undefined,
        MasterUsername: js.UndefOr[NonEmptyString] = js.undefined,
        MaxAllocatedStorage: js.UndefOr[Int] = js.undefined,
        MonitoringInterval: js.UndefOr[Int] = js.undefined,
        MonitoringRoleArn: js.UndefOr[NonEmptyString] = js.undefined,
        MultiAz: js.UndefOr[Boolean] = js.undefined,
        OptionGroupMemberships: js.UndefOr[AwsRdsDbOptionGroupMemberships] = js.undefined,
        PendingModifiedValues: js.UndefOr[AwsRdsDbPendingModifiedValues] = js.undefined,
        PerformanceInsightsEnabled: js.UndefOr[Boolean] = js.undefined,
        PerformanceInsightsKmsKeyId: js.UndefOr[NonEmptyString] = js.undefined,
        PerformanceInsightsRetentionPeriod: js.UndefOr[Int] = js.undefined,
        PreferredBackupWindow: js.UndefOr[NonEmptyString] = js.undefined,
        PreferredMaintenanceWindow: js.UndefOr[NonEmptyString] = js.undefined,
        ProcessorFeatures: js.UndefOr[AwsRdsDbProcessorFeatures] = js.undefined,
        PromotionTier: js.UndefOr[Int] = js.undefined,
        PubliclyAccessible: js.UndefOr[Boolean] = js.undefined,
        ReadReplicaDBClusterIdentifiers: js.UndefOr[StringList] = js.undefined,
        ReadReplicaDBInstanceIdentifiers: js.UndefOr[StringList] = js.undefined,
        ReadReplicaSourceDBInstanceIdentifier: js.UndefOr[NonEmptyString] = js.undefined,
        SecondaryAvailabilityZone: js.UndefOr[NonEmptyString] = js.undefined,
        StatusInfos: js.UndefOr[AwsRdsDbStatusInfos] = js.undefined,
        StorageEncrypted: js.UndefOr[Boolean] = js.undefined,
        StorageType: js.UndefOr[NonEmptyString] = js.undefined,
        TdeCredentialArn: js.UndefOr[NonEmptyString] = js.undefined,
        Timezone: js.UndefOr[NonEmptyString] = js.undefined,
        VpcSecurityGroups: js.UndefOr[AwsRdsDbInstanceVpcSecurityGroups] = js.undefined
    ): AwsRdsDbInstanceDetails = {
      val __obj = js.Dynamic.literal()
      AllocatedStorage.foreach(__v => __obj.updateDynamic("AllocatedStorage")(__v.asInstanceOf[js.Any]))
      AssociatedRoles.foreach(__v => __obj.updateDynamic("AssociatedRoles")(__v.asInstanceOf[js.Any]))
      AutoMinorVersionUpgrade.foreach(__v => __obj.updateDynamic("AutoMinorVersionUpgrade")(__v.asInstanceOf[js.Any]))
      AvailabilityZone.foreach(__v => __obj.updateDynamic("AvailabilityZone")(__v.asInstanceOf[js.Any]))
      BackupRetentionPeriod.foreach(__v => __obj.updateDynamic("BackupRetentionPeriod")(__v.asInstanceOf[js.Any]))
      CACertificateIdentifier.foreach(__v => __obj.updateDynamic("CACertificateIdentifier")(__v.asInstanceOf[js.Any]))
      CharacterSetName.foreach(__v => __obj.updateDynamic("CharacterSetName")(__v.asInstanceOf[js.Any]))
      CopyTagsToSnapshot.foreach(__v => __obj.updateDynamic("CopyTagsToSnapshot")(__v.asInstanceOf[js.Any]))
      DBClusterIdentifier.foreach(__v => __obj.updateDynamic("DBClusterIdentifier")(__v.asInstanceOf[js.Any]))
      DBInstanceClass.foreach(__v => __obj.updateDynamic("DBInstanceClass")(__v.asInstanceOf[js.Any]))
      DBInstanceIdentifier.foreach(__v => __obj.updateDynamic("DBInstanceIdentifier")(__v.asInstanceOf[js.Any]))
      DBName.foreach(__v => __obj.updateDynamic("DBName")(__v.asInstanceOf[js.Any]))
      DbInstancePort.foreach(__v => __obj.updateDynamic("DbInstancePort")(__v.asInstanceOf[js.Any]))
      DbInstanceStatus.foreach(__v => __obj.updateDynamic("DbInstanceStatus")(__v.asInstanceOf[js.Any]))
      DbParameterGroups.foreach(__v => __obj.updateDynamic("DbParameterGroups")(__v.asInstanceOf[js.Any]))
      DbSecurityGroups.foreach(__v => __obj.updateDynamic("DbSecurityGroups")(__v.asInstanceOf[js.Any]))
      DbSubnetGroup.foreach(__v => __obj.updateDynamic("DbSubnetGroup")(__v.asInstanceOf[js.Any]))
      DbiResourceId.foreach(__v => __obj.updateDynamic("DbiResourceId")(__v.asInstanceOf[js.Any]))
      DeletionProtection.foreach(__v => __obj.updateDynamic("DeletionProtection")(__v.asInstanceOf[js.Any]))
      DomainMemberships.foreach(__v => __obj.updateDynamic("DomainMemberships")(__v.asInstanceOf[js.Any]))
      EnabledCloudWatchLogsExports.foreach(__v => __obj.updateDynamic("EnabledCloudWatchLogsExports")(__v.asInstanceOf[js.Any]))
      Endpoint.foreach(__v => __obj.updateDynamic("Endpoint")(__v.asInstanceOf[js.Any]))
      Engine.foreach(__v => __obj.updateDynamic("Engine")(__v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
      EnhancedMonitoringResourceArn.foreach(__v => __obj.updateDynamic("EnhancedMonitoringResourceArn")(__v.asInstanceOf[js.Any]))
      IAMDatabaseAuthenticationEnabled.foreach(__v => __obj.updateDynamic("IAMDatabaseAuthenticationEnabled")(__v.asInstanceOf[js.Any]))
      InstanceCreateTime.foreach(__v => __obj.updateDynamic("InstanceCreateTime")(__v.asInstanceOf[js.Any]))
      Iops.foreach(__v => __obj.updateDynamic("Iops")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      LatestRestorableTime.foreach(__v => __obj.updateDynamic("LatestRestorableTime")(__v.asInstanceOf[js.Any]))
      LicenseModel.foreach(__v => __obj.updateDynamic("LicenseModel")(__v.asInstanceOf[js.Any]))
      ListenerEndpoint.foreach(__v => __obj.updateDynamic("ListenerEndpoint")(__v.asInstanceOf[js.Any]))
      MasterUsername.foreach(__v => __obj.updateDynamic("MasterUsername")(__v.asInstanceOf[js.Any]))
      MaxAllocatedStorage.foreach(__v => __obj.updateDynamic("MaxAllocatedStorage")(__v.asInstanceOf[js.Any]))
      MonitoringInterval.foreach(__v => __obj.updateDynamic("MonitoringInterval")(__v.asInstanceOf[js.Any]))
      MonitoringRoleArn.foreach(__v => __obj.updateDynamic("MonitoringRoleArn")(__v.asInstanceOf[js.Any]))
      MultiAz.foreach(__v => __obj.updateDynamic("MultiAz")(__v.asInstanceOf[js.Any]))
      OptionGroupMemberships.foreach(__v => __obj.updateDynamic("OptionGroupMemberships")(__v.asInstanceOf[js.Any]))
      PendingModifiedValues.foreach(__v => __obj.updateDynamic("PendingModifiedValues")(__v.asInstanceOf[js.Any]))
      PerformanceInsightsEnabled.foreach(__v => __obj.updateDynamic("PerformanceInsightsEnabled")(__v.asInstanceOf[js.Any]))
      PerformanceInsightsKmsKeyId.foreach(__v => __obj.updateDynamic("PerformanceInsightsKmsKeyId")(__v.asInstanceOf[js.Any]))
      PerformanceInsightsRetentionPeriod.foreach(__v => __obj.updateDynamic("PerformanceInsightsRetentionPeriod")(__v.asInstanceOf[js.Any]))
      PreferredBackupWindow.foreach(__v => __obj.updateDynamic("PreferredBackupWindow")(__v.asInstanceOf[js.Any]))
      PreferredMaintenanceWindow.foreach(__v => __obj.updateDynamic("PreferredMaintenanceWindow")(__v.asInstanceOf[js.Any]))
      ProcessorFeatures.foreach(__v => __obj.updateDynamic("ProcessorFeatures")(__v.asInstanceOf[js.Any]))
      PromotionTier.foreach(__v => __obj.updateDynamic("PromotionTier")(__v.asInstanceOf[js.Any]))
      PubliclyAccessible.foreach(__v => __obj.updateDynamic("PubliclyAccessible")(__v.asInstanceOf[js.Any]))
      ReadReplicaDBClusterIdentifiers.foreach(__v => __obj.updateDynamic("ReadReplicaDBClusterIdentifiers")(__v.asInstanceOf[js.Any]))
      ReadReplicaDBInstanceIdentifiers.foreach(__v => __obj.updateDynamic("ReadReplicaDBInstanceIdentifiers")(__v.asInstanceOf[js.Any]))
      ReadReplicaSourceDBInstanceIdentifier.foreach(__v => __obj.updateDynamic("ReadReplicaSourceDBInstanceIdentifier")(__v.asInstanceOf[js.Any]))
      SecondaryAvailabilityZone.foreach(__v => __obj.updateDynamic("SecondaryAvailabilityZone")(__v.asInstanceOf[js.Any]))
      StatusInfos.foreach(__v => __obj.updateDynamic("StatusInfos")(__v.asInstanceOf[js.Any]))
      StorageEncrypted.foreach(__v => __obj.updateDynamic("StorageEncrypted")(__v.asInstanceOf[js.Any]))
      StorageType.foreach(__v => __obj.updateDynamic("StorageType")(__v.asInstanceOf[js.Any]))
      TdeCredentialArn.foreach(__v => __obj.updateDynamic("TdeCredentialArn")(__v.asInstanceOf[js.Any]))
      Timezone.foreach(__v => __obj.updateDynamic("Timezone")(__v.asInstanceOf[js.Any]))
      VpcSecurityGroups.foreach(__v => __obj.updateDynamic("VpcSecurityGroups")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsRdsDbInstanceDetails]
    }
  }

  /** Specifies the connection endpoint.
    */
  @js.native
  trait AwsRdsDbInstanceEndpoint extends js.Object {
    var Address: js.UndefOr[NonEmptyString]
    var HostedZoneId: js.UndefOr[NonEmptyString]
    var Port: js.UndefOr[Int]
  }

  object AwsRdsDbInstanceEndpoint {
    @inline
    def apply(
        Address: js.UndefOr[NonEmptyString] = js.undefined,
        HostedZoneId: js.UndefOr[NonEmptyString] = js.undefined,
        Port: js.UndefOr[Int] = js.undefined
    ): AwsRdsDbInstanceEndpoint = {
      val __obj = js.Dynamic.literal()
      Address.foreach(__v => __obj.updateDynamic("Address")(__v.asInstanceOf[js.Any]))
      HostedZoneId.foreach(__v => __obj.updateDynamic("HostedZoneId")(__v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsRdsDbInstanceEndpoint]
    }
  }

  /** A VPC security groups that the DB instance belongs to.
    */
  @js.native
  trait AwsRdsDbInstanceVpcSecurityGroup extends js.Object {
    var Status: js.UndefOr[NonEmptyString]
    var VpcSecurityGroupId: js.UndefOr[NonEmptyString]
  }

  object AwsRdsDbInstanceVpcSecurityGroup {
    @inline
    def apply(
        Status: js.UndefOr[NonEmptyString] = js.undefined,
        VpcSecurityGroupId: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsRdsDbInstanceVpcSecurityGroup = {
      val __obj = js.Dynamic.literal()
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      VpcSecurityGroupId.foreach(__v => __obj.updateDynamic("VpcSecurityGroupId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsRdsDbInstanceVpcSecurityGroup]
    }
  }

  /** An option group membership.
    */
  @js.native
  trait AwsRdsDbOptionGroupMembership extends js.Object {
    var OptionGroupName: js.UndefOr[NonEmptyString]
    var Status: js.UndefOr[NonEmptyString]
  }

  object AwsRdsDbOptionGroupMembership {
    @inline
    def apply(
        OptionGroupName: js.UndefOr[NonEmptyString] = js.undefined,
        Status: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsRdsDbOptionGroupMembership = {
      val __obj = js.Dynamic.literal()
      OptionGroupName.foreach(__v => __obj.updateDynamic("OptionGroupName")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsRdsDbOptionGroupMembership]
    }
  }

  /** Provides information about a parameter group for a DB instance.
    */
  @js.native
  trait AwsRdsDbParameterGroup extends js.Object {
    var DbParameterGroupName: js.UndefOr[NonEmptyString]
    var ParameterApplyStatus: js.UndefOr[NonEmptyString]
  }

  object AwsRdsDbParameterGroup {
    @inline
    def apply(
        DbParameterGroupName: js.UndefOr[NonEmptyString] = js.undefined,
        ParameterApplyStatus: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsRdsDbParameterGroup = {
      val __obj = js.Dynamic.literal()
      DbParameterGroupName.foreach(__v => __obj.updateDynamic("DbParameterGroupName")(__v.asInstanceOf[js.Any]))
      ParameterApplyStatus.foreach(__v => __obj.updateDynamic("ParameterApplyStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsRdsDbParameterGroup]
    }
  }

  /** Changes to a DB instance that are currently pending.
    */
  @js.native
  trait AwsRdsDbPendingModifiedValues extends js.Object {
    var AllocatedStorage: js.UndefOr[Int]
    var BackupRetentionPeriod: js.UndefOr[Int]
    var CaCertificateIdentifier: js.UndefOr[NonEmptyString]
    var DbInstanceClass: js.UndefOr[NonEmptyString]
    var DbInstanceIdentifier: js.UndefOr[NonEmptyString]
    var DbSubnetGroupName: js.UndefOr[NonEmptyString]
    var EngineVersion: js.UndefOr[NonEmptyString]
    var Iops: js.UndefOr[Int]
    var LicenseModel: js.UndefOr[NonEmptyString]
    var MasterUserPassword: js.UndefOr[NonEmptyString]
    var MultiAZ: js.UndefOr[Boolean]
    var PendingCloudWatchLogsExports: js.UndefOr[AwsRdsPendingCloudWatchLogsExports]
    var Port: js.UndefOr[Int]
    var ProcessorFeatures: js.UndefOr[AwsRdsDbProcessorFeatures]
    var StorageType: js.UndefOr[NonEmptyString]
  }

  object AwsRdsDbPendingModifiedValues {
    @inline
    def apply(
        AllocatedStorage: js.UndefOr[Int] = js.undefined,
        BackupRetentionPeriod: js.UndefOr[Int] = js.undefined,
        CaCertificateIdentifier: js.UndefOr[NonEmptyString] = js.undefined,
        DbInstanceClass: js.UndefOr[NonEmptyString] = js.undefined,
        DbInstanceIdentifier: js.UndefOr[NonEmptyString] = js.undefined,
        DbSubnetGroupName: js.UndefOr[NonEmptyString] = js.undefined,
        EngineVersion: js.UndefOr[NonEmptyString] = js.undefined,
        Iops: js.UndefOr[Int] = js.undefined,
        LicenseModel: js.UndefOr[NonEmptyString] = js.undefined,
        MasterUserPassword: js.UndefOr[NonEmptyString] = js.undefined,
        MultiAZ: js.UndefOr[Boolean] = js.undefined,
        PendingCloudWatchLogsExports: js.UndefOr[AwsRdsPendingCloudWatchLogsExports] = js.undefined,
        Port: js.UndefOr[Int] = js.undefined,
        ProcessorFeatures: js.UndefOr[AwsRdsDbProcessorFeatures] = js.undefined,
        StorageType: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsRdsDbPendingModifiedValues = {
      val __obj = js.Dynamic.literal()
      AllocatedStorage.foreach(__v => __obj.updateDynamic("AllocatedStorage")(__v.asInstanceOf[js.Any]))
      BackupRetentionPeriod.foreach(__v => __obj.updateDynamic("BackupRetentionPeriod")(__v.asInstanceOf[js.Any]))
      CaCertificateIdentifier.foreach(__v => __obj.updateDynamic("CaCertificateIdentifier")(__v.asInstanceOf[js.Any]))
      DbInstanceClass.foreach(__v => __obj.updateDynamic("DbInstanceClass")(__v.asInstanceOf[js.Any]))
      DbInstanceIdentifier.foreach(__v => __obj.updateDynamic("DbInstanceIdentifier")(__v.asInstanceOf[js.Any]))
      DbSubnetGroupName.foreach(__v => __obj.updateDynamic("DbSubnetGroupName")(__v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
      Iops.foreach(__v => __obj.updateDynamic("Iops")(__v.asInstanceOf[js.Any]))
      LicenseModel.foreach(__v => __obj.updateDynamic("LicenseModel")(__v.asInstanceOf[js.Any]))
      MasterUserPassword.foreach(__v => __obj.updateDynamic("MasterUserPassword")(__v.asInstanceOf[js.Any]))
      MultiAZ.foreach(__v => __obj.updateDynamic("MultiAZ")(__v.asInstanceOf[js.Any]))
      PendingCloudWatchLogsExports.foreach(__v => __obj.updateDynamic("PendingCloudWatchLogsExports")(__v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      ProcessorFeatures.foreach(__v => __obj.updateDynamic("ProcessorFeatures")(__v.asInstanceOf[js.Any]))
      StorageType.foreach(__v => __obj.updateDynamic("StorageType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsRdsDbPendingModifiedValues]
    }
  }

  /** A processor feature.
    */
  @js.native
  trait AwsRdsDbProcessorFeature extends js.Object {
    var Name: js.UndefOr[NonEmptyString]
    var Value: js.UndefOr[NonEmptyString]
  }

  object AwsRdsDbProcessorFeature {
    @inline
    def apply(
        Name: js.UndefOr[NonEmptyString] = js.undefined,
        Value: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsRdsDbProcessorFeature = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsRdsDbProcessorFeature]
    }
  }

  /** Provides information about an Amazon RDS DB security group.
    */
  @js.native
  trait AwsRdsDbSecurityGroupDetails extends js.Object {
    var DbSecurityGroupArn: js.UndefOr[NonEmptyString]
    var DbSecurityGroupDescription: js.UndefOr[NonEmptyString]
    var DbSecurityGroupName: js.UndefOr[NonEmptyString]
    var Ec2SecurityGroups: js.UndefOr[AwsRdsDbSecurityGroupEc2SecurityGroups]
    var IpRanges: js.UndefOr[AwsRdsDbSecurityGroupIpRanges]
    var OwnerId: js.UndefOr[NonEmptyString]
    var VpcId: js.UndefOr[NonEmptyString]
  }

  object AwsRdsDbSecurityGroupDetails {
    @inline
    def apply(
        DbSecurityGroupArn: js.UndefOr[NonEmptyString] = js.undefined,
        DbSecurityGroupDescription: js.UndefOr[NonEmptyString] = js.undefined,
        DbSecurityGroupName: js.UndefOr[NonEmptyString] = js.undefined,
        Ec2SecurityGroups: js.UndefOr[AwsRdsDbSecurityGroupEc2SecurityGroups] = js.undefined,
        IpRanges: js.UndefOr[AwsRdsDbSecurityGroupIpRanges] = js.undefined,
        OwnerId: js.UndefOr[NonEmptyString] = js.undefined,
        VpcId: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsRdsDbSecurityGroupDetails = {
      val __obj = js.Dynamic.literal()
      DbSecurityGroupArn.foreach(__v => __obj.updateDynamic("DbSecurityGroupArn")(__v.asInstanceOf[js.Any]))
      DbSecurityGroupDescription.foreach(__v => __obj.updateDynamic("DbSecurityGroupDescription")(__v.asInstanceOf[js.Any]))
      DbSecurityGroupName.foreach(__v => __obj.updateDynamic("DbSecurityGroupName")(__v.asInstanceOf[js.Any]))
      Ec2SecurityGroups.foreach(__v => __obj.updateDynamic("Ec2SecurityGroups")(__v.asInstanceOf[js.Any]))
      IpRanges.foreach(__v => __obj.updateDynamic("IpRanges")(__v.asInstanceOf[js.Any]))
      OwnerId.foreach(__v => __obj.updateDynamic("OwnerId")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsRdsDbSecurityGroupDetails]
    }
  }

  /** EC2 security group information for an RDS DB security group.
    */
  @js.native
  trait AwsRdsDbSecurityGroupEc2SecurityGroup extends js.Object {
    var Ec2SecurityGroupId: js.UndefOr[NonEmptyString]
    var Ec2SecurityGroupName: js.UndefOr[NonEmptyString]
    var Ec2SecurityGroupOwnerId: js.UndefOr[NonEmptyString]
    var Status: js.UndefOr[NonEmptyString]
  }

  object AwsRdsDbSecurityGroupEc2SecurityGroup {
    @inline
    def apply(
        Ec2SecurityGroupId: js.UndefOr[NonEmptyString] = js.undefined,
        Ec2SecurityGroupName: js.UndefOr[NonEmptyString] = js.undefined,
        Ec2SecurityGroupOwnerId: js.UndefOr[NonEmptyString] = js.undefined,
        Status: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsRdsDbSecurityGroupEc2SecurityGroup = {
      val __obj = js.Dynamic.literal()
      Ec2SecurityGroupId.foreach(__v => __obj.updateDynamic("Ec2SecurityGroupId")(__v.asInstanceOf[js.Any]))
      Ec2SecurityGroupName.foreach(__v => __obj.updateDynamic("Ec2SecurityGroupName")(__v.asInstanceOf[js.Any]))
      Ec2SecurityGroupOwnerId.foreach(__v => __obj.updateDynamic("Ec2SecurityGroupOwnerId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsRdsDbSecurityGroupEc2SecurityGroup]
    }
  }

  /** IP range information for an RDS DB security group.
    */
  @js.native
  trait AwsRdsDbSecurityGroupIpRange extends js.Object {
    var CidrIp: js.UndefOr[NonEmptyString]
    var Status: js.UndefOr[NonEmptyString]
  }

  object AwsRdsDbSecurityGroupIpRange {
    @inline
    def apply(
        CidrIp: js.UndefOr[NonEmptyString] = js.undefined,
        Status: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsRdsDbSecurityGroupIpRange = {
      val __obj = js.Dynamic.literal()
      CidrIp.foreach(__v => __obj.updateDynamic("CidrIp")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsRdsDbSecurityGroupIpRange]
    }
  }

  /** Provides details about an Amazon RDS DB cluster snapshot.
    */
  @js.native
  trait AwsRdsDbSnapshotDetails extends js.Object {
    var AllocatedStorage: js.UndefOr[Int]
    var AvailabilityZone: js.UndefOr[NonEmptyString]
    var DbInstanceIdentifier: js.UndefOr[NonEmptyString]
    var DbSnapshotIdentifier: js.UndefOr[NonEmptyString]
    var DbiResourceId: js.UndefOr[NonEmptyString]
    var Encrypted: js.UndefOr[Boolean]
    var Engine: js.UndefOr[NonEmptyString]
    var EngineVersion: js.UndefOr[NonEmptyString]
    var IamDatabaseAuthenticationEnabled: js.UndefOr[Boolean]
    var InstanceCreateTime: js.UndefOr[NonEmptyString]
    var Iops: js.UndefOr[Int]
    var KmsKeyId: js.UndefOr[NonEmptyString]
    var LicenseModel: js.UndefOr[NonEmptyString]
    var MasterUsername: js.UndefOr[NonEmptyString]
    var OptionGroupName: js.UndefOr[NonEmptyString]
    var PercentProgress: js.UndefOr[Int]
    var Port: js.UndefOr[Int]
    var ProcessorFeatures: js.UndefOr[AwsRdsDbProcessorFeatures]
    var SnapshotCreateTime: js.UndefOr[NonEmptyString]
    var SnapshotType: js.UndefOr[NonEmptyString]
    var SourceDbSnapshotIdentifier: js.UndefOr[NonEmptyString]
    var SourceRegion: js.UndefOr[NonEmptyString]
    var Status: js.UndefOr[NonEmptyString]
    var StorageType: js.UndefOr[NonEmptyString]
    var TdeCredentialArn: js.UndefOr[NonEmptyString]
    var Timezone: js.UndefOr[NonEmptyString]
    var VpcId: js.UndefOr[NonEmptyString]
  }

  object AwsRdsDbSnapshotDetails {
    @inline
    def apply(
        AllocatedStorage: js.UndefOr[Int] = js.undefined,
        AvailabilityZone: js.UndefOr[NonEmptyString] = js.undefined,
        DbInstanceIdentifier: js.UndefOr[NonEmptyString] = js.undefined,
        DbSnapshotIdentifier: js.UndefOr[NonEmptyString] = js.undefined,
        DbiResourceId: js.UndefOr[NonEmptyString] = js.undefined,
        Encrypted: js.UndefOr[Boolean] = js.undefined,
        Engine: js.UndefOr[NonEmptyString] = js.undefined,
        EngineVersion: js.UndefOr[NonEmptyString] = js.undefined,
        IamDatabaseAuthenticationEnabled: js.UndefOr[Boolean] = js.undefined,
        InstanceCreateTime: js.UndefOr[NonEmptyString] = js.undefined,
        Iops: js.UndefOr[Int] = js.undefined,
        KmsKeyId: js.UndefOr[NonEmptyString] = js.undefined,
        LicenseModel: js.UndefOr[NonEmptyString] = js.undefined,
        MasterUsername: js.UndefOr[NonEmptyString] = js.undefined,
        OptionGroupName: js.UndefOr[NonEmptyString] = js.undefined,
        PercentProgress: js.UndefOr[Int] = js.undefined,
        Port: js.UndefOr[Int] = js.undefined,
        ProcessorFeatures: js.UndefOr[AwsRdsDbProcessorFeatures] = js.undefined,
        SnapshotCreateTime: js.UndefOr[NonEmptyString] = js.undefined,
        SnapshotType: js.UndefOr[NonEmptyString] = js.undefined,
        SourceDbSnapshotIdentifier: js.UndefOr[NonEmptyString] = js.undefined,
        SourceRegion: js.UndefOr[NonEmptyString] = js.undefined,
        Status: js.UndefOr[NonEmptyString] = js.undefined,
        StorageType: js.UndefOr[NonEmptyString] = js.undefined,
        TdeCredentialArn: js.UndefOr[NonEmptyString] = js.undefined,
        Timezone: js.UndefOr[NonEmptyString] = js.undefined,
        VpcId: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsRdsDbSnapshotDetails = {
      val __obj = js.Dynamic.literal()
      AllocatedStorage.foreach(__v => __obj.updateDynamic("AllocatedStorage")(__v.asInstanceOf[js.Any]))
      AvailabilityZone.foreach(__v => __obj.updateDynamic("AvailabilityZone")(__v.asInstanceOf[js.Any]))
      DbInstanceIdentifier.foreach(__v => __obj.updateDynamic("DbInstanceIdentifier")(__v.asInstanceOf[js.Any]))
      DbSnapshotIdentifier.foreach(__v => __obj.updateDynamic("DbSnapshotIdentifier")(__v.asInstanceOf[js.Any]))
      DbiResourceId.foreach(__v => __obj.updateDynamic("DbiResourceId")(__v.asInstanceOf[js.Any]))
      Encrypted.foreach(__v => __obj.updateDynamic("Encrypted")(__v.asInstanceOf[js.Any]))
      Engine.foreach(__v => __obj.updateDynamic("Engine")(__v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
      IamDatabaseAuthenticationEnabled.foreach(__v => __obj.updateDynamic("IamDatabaseAuthenticationEnabled")(__v.asInstanceOf[js.Any]))
      InstanceCreateTime.foreach(__v => __obj.updateDynamic("InstanceCreateTime")(__v.asInstanceOf[js.Any]))
      Iops.foreach(__v => __obj.updateDynamic("Iops")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      LicenseModel.foreach(__v => __obj.updateDynamic("LicenseModel")(__v.asInstanceOf[js.Any]))
      MasterUsername.foreach(__v => __obj.updateDynamic("MasterUsername")(__v.asInstanceOf[js.Any]))
      OptionGroupName.foreach(__v => __obj.updateDynamic("OptionGroupName")(__v.asInstanceOf[js.Any]))
      PercentProgress.foreach(__v => __obj.updateDynamic("PercentProgress")(__v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      ProcessorFeatures.foreach(__v => __obj.updateDynamic("ProcessorFeatures")(__v.asInstanceOf[js.Any]))
      SnapshotCreateTime.foreach(__v => __obj.updateDynamic("SnapshotCreateTime")(__v.asInstanceOf[js.Any]))
      SnapshotType.foreach(__v => __obj.updateDynamic("SnapshotType")(__v.asInstanceOf[js.Any]))
      SourceDbSnapshotIdentifier.foreach(__v => __obj.updateDynamic("SourceDbSnapshotIdentifier")(__v.asInstanceOf[js.Any]))
      SourceRegion.foreach(__v => __obj.updateDynamic("SourceRegion")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StorageType.foreach(__v => __obj.updateDynamic("StorageType")(__v.asInstanceOf[js.Any]))
      TdeCredentialArn.foreach(__v => __obj.updateDynamic("TdeCredentialArn")(__v.asInstanceOf[js.Any]))
      Timezone.foreach(__v => __obj.updateDynamic("Timezone")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsRdsDbSnapshotDetails]
    }
  }

  /** Information about the status of a read replica.
    */
  @js.native
  trait AwsRdsDbStatusInfo extends js.Object {
    var Message: js.UndefOr[NonEmptyString]
    var Normal: js.UndefOr[Boolean]
    var Status: js.UndefOr[NonEmptyString]
    var StatusType: js.UndefOr[NonEmptyString]
  }

  object AwsRdsDbStatusInfo {
    @inline
    def apply(
        Message: js.UndefOr[NonEmptyString] = js.undefined,
        Normal: js.UndefOr[Boolean] = js.undefined,
        Status: js.UndefOr[NonEmptyString] = js.undefined,
        StatusType: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsRdsDbStatusInfo = {
      val __obj = js.Dynamic.literal()
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      Normal.foreach(__v => __obj.updateDynamic("Normal")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusType.foreach(__v => __obj.updateDynamic("StatusType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsRdsDbStatusInfo]
    }
  }

  /** Information about the subnet group for the database instance.
    */
  @js.native
  trait AwsRdsDbSubnetGroup extends js.Object {
    var DbSubnetGroupArn: js.UndefOr[NonEmptyString]
    var DbSubnetGroupDescription: js.UndefOr[NonEmptyString]
    var DbSubnetGroupName: js.UndefOr[NonEmptyString]
    var SubnetGroupStatus: js.UndefOr[NonEmptyString]
    var Subnets: js.UndefOr[AwsRdsDbSubnetGroupSubnets]
    var VpcId: js.UndefOr[NonEmptyString]
  }

  object AwsRdsDbSubnetGroup {
    @inline
    def apply(
        DbSubnetGroupArn: js.UndefOr[NonEmptyString] = js.undefined,
        DbSubnetGroupDescription: js.UndefOr[NonEmptyString] = js.undefined,
        DbSubnetGroupName: js.UndefOr[NonEmptyString] = js.undefined,
        SubnetGroupStatus: js.UndefOr[NonEmptyString] = js.undefined,
        Subnets: js.UndefOr[AwsRdsDbSubnetGroupSubnets] = js.undefined,
        VpcId: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsRdsDbSubnetGroup = {
      val __obj = js.Dynamic.literal()
      DbSubnetGroupArn.foreach(__v => __obj.updateDynamic("DbSubnetGroupArn")(__v.asInstanceOf[js.Any]))
      DbSubnetGroupDescription.foreach(__v => __obj.updateDynamic("DbSubnetGroupDescription")(__v.asInstanceOf[js.Any]))
      DbSubnetGroupName.foreach(__v => __obj.updateDynamic("DbSubnetGroupName")(__v.asInstanceOf[js.Any]))
      SubnetGroupStatus.foreach(__v => __obj.updateDynamic("SubnetGroupStatus")(__v.asInstanceOf[js.Any]))
      Subnets.foreach(__v => __obj.updateDynamic("Subnets")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsRdsDbSubnetGroup]
    }
  }

  /** Information about a subnet in a subnet group.
    */
  @js.native
  trait AwsRdsDbSubnetGroupSubnet extends js.Object {
    var SubnetAvailabilityZone: js.UndefOr[AwsRdsDbSubnetGroupSubnetAvailabilityZone]
    var SubnetIdentifier: js.UndefOr[NonEmptyString]
    var SubnetStatus: js.UndefOr[NonEmptyString]
  }

  object AwsRdsDbSubnetGroupSubnet {
    @inline
    def apply(
        SubnetAvailabilityZone: js.UndefOr[AwsRdsDbSubnetGroupSubnetAvailabilityZone] = js.undefined,
        SubnetIdentifier: js.UndefOr[NonEmptyString] = js.undefined,
        SubnetStatus: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsRdsDbSubnetGroupSubnet = {
      val __obj = js.Dynamic.literal()
      SubnetAvailabilityZone.foreach(__v => __obj.updateDynamic("SubnetAvailabilityZone")(__v.asInstanceOf[js.Any]))
      SubnetIdentifier.foreach(__v => __obj.updateDynamic("SubnetIdentifier")(__v.asInstanceOf[js.Any]))
      SubnetStatus.foreach(__v => __obj.updateDynamic("SubnetStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsRdsDbSubnetGroupSubnet]
    }
  }

  /** An Availability Zone for a subnet in a subnet group.
    */
  @js.native
  trait AwsRdsDbSubnetGroupSubnetAvailabilityZone extends js.Object {
    var Name: js.UndefOr[NonEmptyString]
  }

  object AwsRdsDbSubnetGroupSubnetAvailabilityZone {
    @inline
    def apply(
        Name: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsRdsDbSubnetGroupSubnetAvailabilityZone = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsRdsDbSubnetGroupSubnetAvailabilityZone]
    }
  }

  /** Details about an Amazon RDS event notification subscription. The subscription allows Amazon RDS to post events to an SNS topic.
    */
  @js.native
  trait AwsRdsEventSubscriptionDetails extends js.Object {
    var CustSubscriptionId: js.UndefOr[NonEmptyString]
    var CustomerAwsId: js.UndefOr[NonEmptyString]
    var Enabled: js.UndefOr[Boolean]
    var EventCategoriesList: js.UndefOr[NonEmptyStringList]
    var EventSubscriptionArn: js.UndefOr[NonEmptyString]
    var SnsTopicArn: js.UndefOr[NonEmptyString]
    var SourceIdsList: js.UndefOr[NonEmptyStringList]
    var SourceType: js.UndefOr[NonEmptyString]
    var Status: js.UndefOr[NonEmptyString]
    var SubscriptionCreationTime: js.UndefOr[NonEmptyString]
  }

  object AwsRdsEventSubscriptionDetails {
    @inline
    def apply(
        CustSubscriptionId: js.UndefOr[NonEmptyString] = js.undefined,
        CustomerAwsId: js.UndefOr[NonEmptyString] = js.undefined,
        Enabled: js.UndefOr[Boolean] = js.undefined,
        EventCategoriesList: js.UndefOr[NonEmptyStringList] = js.undefined,
        EventSubscriptionArn: js.UndefOr[NonEmptyString] = js.undefined,
        SnsTopicArn: js.UndefOr[NonEmptyString] = js.undefined,
        SourceIdsList: js.UndefOr[NonEmptyStringList] = js.undefined,
        SourceType: js.UndefOr[NonEmptyString] = js.undefined,
        Status: js.UndefOr[NonEmptyString] = js.undefined,
        SubscriptionCreationTime: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsRdsEventSubscriptionDetails = {
      val __obj = js.Dynamic.literal()
      CustSubscriptionId.foreach(__v => __obj.updateDynamic("CustSubscriptionId")(__v.asInstanceOf[js.Any]))
      CustomerAwsId.foreach(__v => __obj.updateDynamic("CustomerAwsId")(__v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      EventCategoriesList.foreach(__v => __obj.updateDynamic("EventCategoriesList")(__v.asInstanceOf[js.Any]))
      EventSubscriptionArn.foreach(__v => __obj.updateDynamic("EventSubscriptionArn")(__v.asInstanceOf[js.Any]))
      SnsTopicArn.foreach(__v => __obj.updateDynamic("SnsTopicArn")(__v.asInstanceOf[js.Any]))
      SourceIdsList.foreach(__v => __obj.updateDynamic("SourceIdsList")(__v.asInstanceOf[js.Any]))
      SourceType.foreach(__v => __obj.updateDynamic("SourceType")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      SubscriptionCreationTime.foreach(__v => __obj.updateDynamic("SubscriptionCreationTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsRdsEventSubscriptionDetails]
    }
  }

  /** Identifies the log types to enable and disable.
    */
  @js.native
  trait AwsRdsPendingCloudWatchLogsExports extends js.Object {
    var LogTypesToDisable: js.UndefOr[StringList]
    var LogTypesToEnable: js.UndefOr[StringList]
  }

  object AwsRdsPendingCloudWatchLogsExports {
    @inline
    def apply(
        LogTypesToDisable: js.UndefOr[StringList] = js.undefined,
        LogTypesToEnable: js.UndefOr[StringList] = js.undefined
    ): AwsRdsPendingCloudWatchLogsExports = {
      val __obj = js.Dynamic.literal()
      LogTypesToDisable.foreach(__v => __obj.updateDynamic("LogTypesToDisable")(__v.asInstanceOf[js.Any]))
      LogTypesToEnable.foreach(__v => __obj.updateDynamic("LogTypesToEnable")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsRdsPendingCloudWatchLogsExports]
    }
  }

  /** A node in an Amazon Redshift cluster.
    */
  @js.native
  trait AwsRedshiftClusterClusterNode extends js.Object {
    var NodeRole: js.UndefOr[NonEmptyString]
    var PrivateIpAddress: js.UndefOr[NonEmptyString]
    var PublicIpAddress: js.UndefOr[NonEmptyString]
  }

  object AwsRedshiftClusterClusterNode {
    @inline
    def apply(
        NodeRole: js.UndefOr[NonEmptyString] = js.undefined,
        PrivateIpAddress: js.UndefOr[NonEmptyString] = js.undefined,
        PublicIpAddress: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsRedshiftClusterClusterNode = {
      val __obj = js.Dynamic.literal()
      NodeRole.foreach(__v => __obj.updateDynamic("NodeRole")(__v.asInstanceOf[js.Any]))
      PrivateIpAddress.foreach(__v => __obj.updateDynamic("PrivateIpAddress")(__v.asInstanceOf[js.Any]))
      PublicIpAddress.foreach(__v => __obj.updateDynamic("PublicIpAddress")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsRedshiftClusterClusterNode]
    }
  }

  /** A cluster parameter group that is associated with an Amazon Redshift cluster.
    */
  @js.native
  trait AwsRedshiftClusterClusterParameterGroup extends js.Object {
    var ClusterParameterStatusList: js.UndefOr[AwsRedshiftClusterClusterParameterStatusList]
    var ParameterApplyStatus: js.UndefOr[NonEmptyString]
    var ParameterGroupName: js.UndefOr[NonEmptyString]
  }

  object AwsRedshiftClusterClusterParameterGroup {
    @inline
    def apply(
        ClusterParameterStatusList: js.UndefOr[AwsRedshiftClusterClusterParameterStatusList] = js.undefined,
        ParameterApplyStatus: js.UndefOr[NonEmptyString] = js.undefined,
        ParameterGroupName: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsRedshiftClusterClusterParameterGroup = {
      val __obj = js.Dynamic.literal()
      ClusterParameterStatusList.foreach(__v => __obj.updateDynamic("ClusterParameterStatusList")(__v.asInstanceOf[js.Any]))
      ParameterApplyStatus.foreach(__v => __obj.updateDynamic("ParameterApplyStatus")(__v.asInstanceOf[js.Any]))
      ParameterGroupName.foreach(__v => __obj.updateDynamic("ParameterGroupName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsRedshiftClusterClusterParameterGroup]
    }
  }

  /** The status of a parameter in a cluster parameter group for an Amazon Redshift cluster.
    */
  @js.native
  trait AwsRedshiftClusterClusterParameterStatus extends js.Object {
    var ParameterApplyErrorDescription: js.UndefOr[NonEmptyString]
    var ParameterApplyStatus: js.UndefOr[NonEmptyString]
    var ParameterName: js.UndefOr[NonEmptyString]
  }

  object AwsRedshiftClusterClusterParameterStatus {
    @inline
    def apply(
        ParameterApplyErrorDescription: js.UndefOr[NonEmptyString] = js.undefined,
        ParameterApplyStatus: js.UndefOr[NonEmptyString] = js.undefined,
        ParameterName: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsRedshiftClusterClusterParameterStatus = {
      val __obj = js.Dynamic.literal()
      ParameterApplyErrorDescription.foreach(__v => __obj.updateDynamic("ParameterApplyErrorDescription")(__v.asInstanceOf[js.Any]))
      ParameterApplyStatus.foreach(__v => __obj.updateDynamic("ParameterApplyStatus")(__v.asInstanceOf[js.Any]))
      ParameterName.foreach(__v => __obj.updateDynamic("ParameterName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsRedshiftClusterClusterParameterStatus]
    }
  }

  /** A security group that is associated with the cluster.
    */
  @js.native
  trait AwsRedshiftClusterClusterSecurityGroup extends js.Object {
    var ClusterSecurityGroupName: js.UndefOr[NonEmptyString]
    var Status: js.UndefOr[NonEmptyString]
  }

  object AwsRedshiftClusterClusterSecurityGroup {
    @inline
    def apply(
        ClusterSecurityGroupName: js.UndefOr[NonEmptyString] = js.undefined,
        Status: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsRedshiftClusterClusterSecurityGroup = {
      val __obj = js.Dynamic.literal()
      ClusterSecurityGroupName.foreach(__v => __obj.updateDynamic("ClusterSecurityGroupName")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsRedshiftClusterClusterSecurityGroup]
    }
  }

  /** Information about a cross-Region snapshot copy.
    */
  @js.native
  trait AwsRedshiftClusterClusterSnapshotCopyStatus extends js.Object {
    var DestinationRegion: js.UndefOr[NonEmptyString]
    var ManualSnapshotRetentionPeriod: js.UndefOr[Int]
    var RetentionPeriod: js.UndefOr[Int]
    var SnapshotCopyGrantName: js.UndefOr[NonEmptyString]
  }

  object AwsRedshiftClusterClusterSnapshotCopyStatus {
    @inline
    def apply(
        DestinationRegion: js.UndefOr[NonEmptyString] = js.undefined,
        ManualSnapshotRetentionPeriod: js.UndefOr[Int] = js.undefined,
        RetentionPeriod: js.UndefOr[Int] = js.undefined,
        SnapshotCopyGrantName: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsRedshiftClusterClusterSnapshotCopyStatus = {
      val __obj = js.Dynamic.literal()
      DestinationRegion.foreach(__v => __obj.updateDynamic("DestinationRegion")(__v.asInstanceOf[js.Any]))
      ManualSnapshotRetentionPeriod.foreach(__v => __obj.updateDynamic("ManualSnapshotRetentionPeriod")(__v.asInstanceOf[js.Any]))
      RetentionPeriod.foreach(__v => __obj.updateDynamic("RetentionPeriod")(__v.asInstanceOf[js.Any]))
      SnapshotCopyGrantName.foreach(__v => __obj.updateDynamic("SnapshotCopyGrantName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsRedshiftClusterClusterSnapshotCopyStatus]
    }
  }

  /** A time windows during which maintenance was deferred for an Amazon Redshift cluster.
    */
  @js.native
  trait AwsRedshiftClusterDeferredMaintenanceWindow extends js.Object {
    var DeferMaintenanceEndTime: js.UndefOr[NonEmptyString]
    var DeferMaintenanceIdentifier: js.UndefOr[NonEmptyString]
    var DeferMaintenanceStartTime: js.UndefOr[NonEmptyString]
  }

  object AwsRedshiftClusterDeferredMaintenanceWindow {
    @inline
    def apply(
        DeferMaintenanceEndTime: js.UndefOr[NonEmptyString] = js.undefined,
        DeferMaintenanceIdentifier: js.UndefOr[NonEmptyString] = js.undefined,
        DeferMaintenanceStartTime: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsRedshiftClusterDeferredMaintenanceWindow = {
      val __obj = js.Dynamic.literal()
      DeferMaintenanceEndTime.foreach(__v => __obj.updateDynamic("DeferMaintenanceEndTime")(__v.asInstanceOf[js.Any]))
      DeferMaintenanceIdentifier.foreach(__v => __obj.updateDynamic("DeferMaintenanceIdentifier")(__v.asInstanceOf[js.Any]))
      DeferMaintenanceStartTime.foreach(__v => __obj.updateDynamic("DeferMaintenanceStartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsRedshiftClusterDeferredMaintenanceWindow]
    }
  }

  /** Details about an Amazon Redshift cluster.
    */
  @js.native
  trait AwsRedshiftClusterDetails extends js.Object {
    var AllowVersionUpgrade: js.UndefOr[Boolean]
    var AutomatedSnapshotRetentionPeriod: js.UndefOr[Int]
    var AvailabilityZone: js.UndefOr[NonEmptyString]
    var ClusterAvailabilityStatus: js.UndefOr[NonEmptyString]
    var ClusterCreateTime: js.UndefOr[NonEmptyString]
    var ClusterIdentifier: js.UndefOr[NonEmptyString]
    var ClusterNodes: js.UndefOr[AwsRedshiftClusterClusterNodes]
    var ClusterParameterGroups: js.UndefOr[AwsRedshiftClusterClusterParameterGroups]
    var ClusterPublicKey: js.UndefOr[NonEmptyString]
    var ClusterRevisionNumber: js.UndefOr[NonEmptyString]
    var ClusterSecurityGroups: js.UndefOr[AwsRedshiftClusterClusterSecurityGroups]
    var ClusterSnapshotCopyStatus: js.UndefOr[AwsRedshiftClusterClusterSnapshotCopyStatus]
    var ClusterStatus: js.UndefOr[NonEmptyString]
    var ClusterSubnetGroupName: js.UndefOr[NonEmptyString]
    var ClusterVersion: js.UndefOr[NonEmptyString]
    var DBName: js.UndefOr[NonEmptyString]
    var DeferredMaintenanceWindows: js.UndefOr[AwsRedshiftClusterDeferredMaintenanceWindows]
    var ElasticIpStatus: js.UndefOr[AwsRedshiftClusterElasticIpStatus]
    var ElasticResizeNumberOfNodeOptions: js.UndefOr[NonEmptyString]
    var Encrypted: js.UndefOr[Boolean]
    var Endpoint: js.UndefOr[AwsRedshiftClusterEndpoint]
    var EnhancedVpcRouting: js.UndefOr[Boolean]
    var ExpectedNextSnapshotScheduleTime: js.UndefOr[NonEmptyString]
    var ExpectedNextSnapshotScheduleTimeStatus: js.UndefOr[NonEmptyString]
    var HsmStatus: js.UndefOr[AwsRedshiftClusterHsmStatus]
    var IamRoles: js.UndefOr[AwsRedshiftClusterIamRoles]
    var KmsKeyId: js.UndefOr[NonEmptyString]
    var LoggingStatus: js.UndefOr[AwsRedshiftClusterLoggingStatus]
    var MaintenanceTrackName: js.UndefOr[NonEmptyString]
    var ManualSnapshotRetentionPeriod: js.UndefOr[Int]
    var MasterUsername: js.UndefOr[NonEmptyString]
    var NextMaintenanceWindowStartTime: js.UndefOr[NonEmptyString]
    var NodeType: js.UndefOr[NonEmptyString]
    var NumberOfNodes: js.UndefOr[Int]
    var PendingActions: js.UndefOr[StringList]
    var PendingModifiedValues: js.UndefOr[AwsRedshiftClusterPendingModifiedValues]
    var PreferredMaintenanceWindow: js.UndefOr[NonEmptyString]
    var PubliclyAccessible: js.UndefOr[Boolean]
    var ResizeInfo: js.UndefOr[AwsRedshiftClusterResizeInfo]
    var RestoreStatus: js.UndefOr[AwsRedshiftClusterRestoreStatus]
    var SnapshotScheduleIdentifier: js.UndefOr[NonEmptyString]
    var SnapshotScheduleState: js.UndefOr[NonEmptyString]
    var VpcId: js.UndefOr[NonEmptyString]
    var VpcSecurityGroups: js.UndefOr[AwsRedshiftClusterVpcSecurityGroups]
  }

  object AwsRedshiftClusterDetails {
    @inline
    def apply(
        AllowVersionUpgrade: js.UndefOr[Boolean] = js.undefined,
        AutomatedSnapshotRetentionPeriod: js.UndefOr[Int] = js.undefined,
        AvailabilityZone: js.UndefOr[NonEmptyString] = js.undefined,
        ClusterAvailabilityStatus: js.UndefOr[NonEmptyString] = js.undefined,
        ClusterCreateTime: js.UndefOr[NonEmptyString] = js.undefined,
        ClusterIdentifier: js.UndefOr[NonEmptyString] = js.undefined,
        ClusterNodes: js.UndefOr[AwsRedshiftClusterClusterNodes] = js.undefined,
        ClusterParameterGroups: js.UndefOr[AwsRedshiftClusterClusterParameterGroups] = js.undefined,
        ClusterPublicKey: js.UndefOr[NonEmptyString] = js.undefined,
        ClusterRevisionNumber: js.UndefOr[NonEmptyString] = js.undefined,
        ClusterSecurityGroups: js.UndefOr[AwsRedshiftClusterClusterSecurityGroups] = js.undefined,
        ClusterSnapshotCopyStatus: js.UndefOr[AwsRedshiftClusterClusterSnapshotCopyStatus] = js.undefined,
        ClusterStatus: js.UndefOr[NonEmptyString] = js.undefined,
        ClusterSubnetGroupName: js.UndefOr[NonEmptyString] = js.undefined,
        ClusterVersion: js.UndefOr[NonEmptyString] = js.undefined,
        DBName: js.UndefOr[NonEmptyString] = js.undefined,
        DeferredMaintenanceWindows: js.UndefOr[AwsRedshiftClusterDeferredMaintenanceWindows] = js.undefined,
        ElasticIpStatus: js.UndefOr[AwsRedshiftClusterElasticIpStatus] = js.undefined,
        ElasticResizeNumberOfNodeOptions: js.UndefOr[NonEmptyString] = js.undefined,
        Encrypted: js.UndefOr[Boolean] = js.undefined,
        Endpoint: js.UndefOr[AwsRedshiftClusterEndpoint] = js.undefined,
        EnhancedVpcRouting: js.UndefOr[Boolean] = js.undefined,
        ExpectedNextSnapshotScheduleTime: js.UndefOr[NonEmptyString] = js.undefined,
        ExpectedNextSnapshotScheduleTimeStatus: js.UndefOr[NonEmptyString] = js.undefined,
        HsmStatus: js.UndefOr[AwsRedshiftClusterHsmStatus] = js.undefined,
        IamRoles: js.UndefOr[AwsRedshiftClusterIamRoles] = js.undefined,
        KmsKeyId: js.UndefOr[NonEmptyString] = js.undefined,
        LoggingStatus: js.UndefOr[AwsRedshiftClusterLoggingStatus] = js.undefined,
        MaintenanceTrackName: js.UndefOr[NonEmptyString] = js.undefined,
        ManualSnapshotRetentionPeriod: js.UndefOr[Int] = js.undefined,
        MasterUsername: js.UndefOr[NonEmptyString] = js.undefined,
        NextMaintenanceWindowStartTime: js.UndefOr[NonEmptyString] = js.undefined,
        NodeType: js.UndefOr[NonEmptyString] = js.undefined,
        NumberOfNodes: js.UndefOr[Int] = js.undefined,
        PendingActions: js.UndefOr[StringList] = js.undefined,
        PendingModifiedValues: js.UndefOr[AwsRedshiftClusterPendingModifiedValues] = js.undefined,
        PreferredMaintenanceWindow: js.UndefOr[NonEmptyString] = js.undefined,
        PubliclyAccessible: js.UndefOr[Boolean] = js.undefined,
        ResizeInfo: js.UndefOr[AwsRedshiftClusterResizeInfo] = js.undefined,
        RestoreStatus: js.UndefOr[AwsRedshiftClusterRestoreStatus] = js.undefined,
        SnapshotScheduleIdentifier: js.UndefOr[NonEmptyString] = js.undefined,
        SnapshotScheduleState: js.UndefOr[NonEmptyString] = js.undefined,
        VpcId: js.UndefOr[NonEmptyString] = js.undefined,
        VpcSecurityGroups: js.UndefOr[AwsRedshiftClusterVpcSecurityGroups] = js.undefined
    ): AwsRedshiftClusterDetails = {
      val __obj = js.Dynamic.literal()
      AllowVersionUpgrade.foreach(__v => __obj.updateDynamic("AllowVersionUpgrade")(__v.asInstanceOf[js.Any]))
      AutomatedSnapshotRetentionPeriod.foreach(__v => __obj.updateDynamic("AutomatedSnapshotRetentionPeriod")(__v.asInstanceOf[js.Any]))
      AvailabilityZone.foreach(__v => __obj.updateDynamic("AvailabilityZone")(__v.asInstanceOf[js.Any]))
      ClusterAvailabilityStatus.foreach(__v => __obj.updateDynamic("ClusterAvailabilityStatus")(__v.asInstanceOf[js.Any]))
      ClusterCreateTime.foreach(__v => __obj.updateDynamic("ClusterCreateTime")(__v.asInstanceOf[js.Any]))
      ClusterIdentifier.foreach(__v => __obj.updateDynamic("ClusterIdentifier")(__v.asInstanceOf[js.Any]))
      ClusterNodes.foreach(__v => __obj.updateDynamic("ClusterNodes")(__v.asInstanceOf[js.Any]))
      ClusterParameterGroups.foreach(__v => __obj.updateDynamic("ClusterParameterGroups")(__v.asInstanceOf[js.Any]))
      ClusterPublicKey.foreach(__v => __obj.updateDynamic("ClusterPublicKey")(__v.asInstanceOf[js.Any]))
      ClusterRevisionNumber.foreach(__v => __obj.updateDynamic("ClusterRevisionNumber")(__v.asInstanceOf[js.Any]))
      ClusterSecurityGroups.foreach(__v => __obj.updateDynamic("ClusterSecurityGroups")(__v.asInstanceOf[js.Any]))
      ClusterSnapshotCopyStatus.foreach(__v => __obj.updateDynamic("ClusterSnapshotCopyStatus")(__v.asInstanceOf[js.Any]))
      ClusterStatus.foreach(__v => __obj.updateDynamic("ClusterStatus")(__v.asInstanceOf[js.Any]))
      ClusterSubnetGroupName.foreach(__v => __obj.updateDynamic("ClusterSubnetGroupName")(__v.asInstanceOf[js.Any]))
      ClusterVersion.foreach(__v => __obj.updateDynamic("ClusterVersion")(__v.asInstanceOf[js.Any]))
      DBName.foreach(__v => __obj.updateDynamic("DBName")(__v.asInstanceOf[js.Any]))
      DeferredMaintenanceWindows.foreach(__v => __obj.updateDynamic("DeferredMaintenanceWindows")(__v.asInstanceOf[js.Any]))
      ElasticIpStatus.foreach(__v => __obj.updateDynamic("ElasticIpStatus")(__v.asInstanceOf[js.Any]))
      ElasticResizeNumberOfNodeOptions.foreach(__v => __obj.updateDynamic("ElasticResizeNumberOfNodeOptions")(__v.asInstanceOf[js.Any]))
      Encrypted.foreach(__v => __obj.updateDynamic("Encrypted")(__v.asInstanceOf[js.Any]))
      Endpoint.foreach(__v => __obj.updateDynamic("Endpoint")(__v.asInstanceOf[js.Any]))
      EnhancedVpcRouting.foreach(__v => __obj.updateDynamic("EnhancedVpcRouting")(__v.asInstanceOf[js.Any]))
      ExpectedNextSnapshotScheduleTime.foreach(__v => __obj.updateDynamic("ExpectedNextSnapshotScheduleTime")(__v.asInstanceOf[js.Any]))
      ExpectedNextSnapshotScheduleTimeStatus.foreach(__v => __obj.updateDynamic("ExpectedNextSnapshotScheduleTimeStatus")(__v.asInstanceOf[js.Any]))
      HsmStatus.foreach(__v => __obj.updateDynamic("HsmStatus")(__v.asInstanceOf[js.Any]))
      IamRoles.foreach(__v => __obj.updateDynamic("IamRoles")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      LoggingStatus.foreach(__v => __obj.updateDynamic("LoggingStatus")(__v.asInstanceOf[js.Any]))
      MaintenanceTrackName.foreach(__v => __obj.updateDynamic("MaintenanceTrackName")(__v.asInstanceOf[js.Any]))
      ManualSnapshotRetentionPeriod.foreach(__v => __obj.updateDynamic("ManualSnapshotRetentionPeriod")(__v.asInstanceOf[js.Any]))
      MasterUsername.foreach(__v => __obj.updateDynamic("MasterUsername")(__v.asInstanceOf[js.Any]))
      NextMaintenanceWindowStartTime.foreach(__v => __obj.updateDynamic("NextMaintenanceWindowStartTime")(__v.asInstanceOf[js.Any]))
      NodeType.foreach(__v => __obj.updateDynamic("NodeType")(__v.asInstanceOf[js.Any]))
      NumberOfNodes.foreach(__v => __obj.updateDynamic("NumberOfNodes")(__v.asInstanceOf[js.Any]))
      PendingActions.foreach(__v => __obj.updateDynamic("PendingActions")(__v.asInstanceOf[js.Any]))
      PendingModifiedValues.foreach(__v => __obj.updateDynamic("PendingModifiedValues")(__v.asInstanceOf[js.Any]))
      PreferredMaintenanceWindow.foreach(__v => __obj.updateDynamic("PreferredMaintenanceWindow")(__v.asInstanceOf[js.Any]))
      PubliclyAccessible.foreach(__v => __obj.updateDynamic("PubliclyAccessible")(__v.asInstanceOf[js.Any]))
      ResizeInfo.foreach(__v => __obj.updateDynamic("ResizeInfo")(__v.asInstanceOf[js.Any]))
      RestoreStatus.foreach(__v => __obj.updateDynamic("RestoreStatus")(__v.asInstanceOf[js.Any]))
      SnapshotScheduleIdentifier.foreach(__v => __obj.updateDynamic("SnapshotScheduleIdentifier")(__v.asInstanceOf[js.Any]))
      SnapshotScheduleState.foreach(__v => __obj.updateDynamic("SnapshotScheduleState")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      VpcSecurityGroups.foreach(__v => __obj.updateDynamic("VpcSecurityGroups")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsRedshiftClusterDetails]
    }
  }

  /** The status of the elastic IP (EIP) address for an Amazon Redshift cluster.
    */
  @js.native
  trait AwsRedshiftClusterElasticIpStatus extends js.Object {
    var ElasticIp: js.UndefOr[NonEmptyString]
    var Status: js.UndefOr[NonEmptyString]
  }

  object AwsRedshiftClusterElasticIpStatus {
    @inline
    def apply(
        ElasticIp: js.UndefOr[NonEmptyString] = js.undefined,
        Status: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsRedshiftClusterElasticIpStatus = {
      val __obj = js.Dynamic.literal()
      ElasticIp.foreach(__v => __obj.updateDynamic("ElasticIp")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsRedshiftClusterElasticIpStatus]
    }
  }

  /** The connection endpoint for an Amazon Redshift cluster.
    */
  @js.native
  trait AwsRedshiftClusterEndpoint extends js.Object {
    var Address: js.UndefOr[NonEmptyString]
    var Port: js.UndefOr[Int]
  }

  object AwsRedshiftClusterEndpoint {
    @inline
    def apply(
        Address: js.UndefOr[NonEmptyString] = js.undefined,
        Port: js.UndefOr[Int] = js.undefined
    ): AwsRedshiftClusterEndpoint = {
      val __obj = js.Dynamic.literal()
      Address.foreach(__v => __obj.updateDynamic("Address")(__v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsRedshiftClusterEndpoint]
    }
  }

  /** Information about whether an Amazon Redshift cluster finished applying any hardware changes to security module (HSM) settings that were specified in a modify cluster command.
    */
  @js.native
  trait AwsRedshiftClusterHsmStatus extends js.Object {
    var HsmClientCertificateIdentifier: js.UndefOr[NonEmptyString]
    var HsmConfigurationIdentifier: js.UndefOr[NonEmptyString]
    var Status: js.UndefOr[NonEmptyString]
  }

  object AwsRedshiftClusterHsmStatus {
    @inline
    def apply(
        HsmClientCertificateIdentifier: js.UndefOr[NonEmptyString] = js.undefined,
        HsmConfigurationIdentifier: js.UndefOr[NonEmptyString] = js.undefined,
        Status: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsRedshiftClusterHsmStatus = {
      val __obj = js.Dynamic.literal()
      HsmClientCertificateIdentifier.foreach(__v => __obj.updateDynamic("HsmClientCertificateIdentifier")(__v.asInstanceOf[js.Any]))
      HsmConfigurationIdentifier.foreach(__v => __obj.updateDynamic("HsmConfigurationIdentifier")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsRedshiftClusterHsmStatus]
    }
  }

  /** An IAM role that the cluster can use to access other Amazon Web Services services.
    */
  @js.native
  trait AwsRedshiftClusterIamRole extends js.Object {
    var ApplyStatus: js.UndefOr[NonEmptyString]
    var IamRoleArn: js.UndefOr[NonEmptyString]
  }

  object AwsRedshiftClusterIamRole {
    @inline
    def apply(
        ApplyStatus: js.UndefOr[NonEmptyString] = js.undefined,
        IamRoleArn: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsRedshiftClusterIamRole = {
      val __obj = js.Dynamic.literal()
      ApplyStatus.foreach(__v => __obj.updateDynamic("ApplyStatus")(__v.asInstanceOf[js.Any]))
      IamRoleArn.foreach(__v => __obj.updateDynamic("IamRoleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsRedshiftClusterIamRole]
    }
  }

  /** Provides information about the logging status of the cluster.
    */
  @js.native
  trait AwsRedshiftClusterLoggingStatus extends js.Object {
    var BucketName: js.UndefOr[NonEmptyString]
    var LastFailureMessage: js.UndefOr[NonEmptyString]
    var LastFailureTime: js.UndefOr[NonEmptyString]
    var LastSuccessfulDeliveryTime: js.UndefOr[NonEmptyString]
    var LoggingEnabled: js.UndefOr[Boolean]
    var S3KeyPrefix: js.UndefOr[NonEmptyString]
  }

  object AwsRedshiftClusterLoggingStatus {
    @inline
    def apply(
        BucketName: js.UndefOr[NonEmptyString] = js.undefined,
        LastFailureMessage: js.UndefOr[NonEmptyString] = js.undefined,
        LastFailureTime: js.UndefOr[NonEmptyString] = js.undefined,
        LastSuccessfulDeliveryTime: js.UndefOr[NonEmptyString] = js.undefined,
        LoggingEnabled: js.UndefOr[Boolean] = js.undefined,
        S3KeyPrefix: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsRedshiftClusterLoggingStatus = {
      val __obj = js.Dynamic.literal()
      BucketName.foreach(__v => __obj.updateDynamic("BucketName")(__v.asInstanceOf[js.Any]))
      LastFailureMessage.foreach(__v => __obj.updateDynamic("LastFailureMessage")(__v.asInstanceOf[js.Any]))
      LastFailureTime.foreach(__v => __obj.updateDynamic("LastFailureTime")(__v.asInstanceOf[js.Any]))
      LastSuccessfulDeliveryTime.foreach(__v => __obj.updateDynamic("LastSuccessfulDeliveryTime")(__v.asInstanceOf[js.Any]))
      LoggingEnabled.foreach(__v => __obj.updateDynamic("LoggingEnabled")(__v.asInstanceOf[js.Any]))
      S3KeyPrefix.foreach(__v => __obj.updateDynamic("S3KeyPrefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsRedshiftClusterLoggingStatus]
    }
  }

  /** Changes to the Amazon Redshift cluster that are currently pending.
    */
  @js.native
  trait AwsRedshiftClusterPendingModifiedValues extends js.Object {
    var AutomatedSnapshotRetentionPeriod: js.UndefOr[Int]
    var ClusterIdentifier: js.UndefOr[NonEmptyString]
    var ClusterType: js.UndefOr[NonEmptyString]
    var ClusterVersion: js.UndefOr[NonEmptyString]
    var EncryptionType: js.UndefOr[NonEmptyString]
    var EnhancedVpcRouting: js.UndefOr[Boolean]
    var MaintenanceTrackName: js.UndefOr[NonEmptyString]
    var MasterUserPassword: js.UndefOr[NonEmptyString]
    var NodeType: js.UndefOr[NonEmptyString]
    var NumberOfNodes: js.UndefOr[Int]
    var PubliclyAccessible: js.UndefOr[Boolean]
  }

  object AwsRedshiftClusterPendingModifiedValues {
    @inline
    def apply(
        AutomatedSnapshotRetentionPeriod: js.UndefOr[Int] = js.undefined,
        ClusterIdentifier: js.UndefOr[NonEmptyString] = js.undefined,
        ClusterType: js.UndefOr[NonEmptyString] = js.undefined,
        ClusterVersion: js.UndefOr[NonEmptyString] = js.undefined,
        EncryptionType: js.UndefOr[NonEmptyString] = js.undefined,
        EnhancedVpcRouting: js.UndefOr[Boolean] = js.undefined,
        MaintenanceTrackName: js.UndefOr[NonEmptyString] = js.undefined,
        MasterUserPassword: js.UndefOr[NonEmptyString] = js.undefined,
        NodeType: js.UndefOr[NonEmptyString] = js.undefined,
        NumberOfNodes: js.UndefOr[Int] = js.undefined,
        PubliclyAccessible: js.UndefOr[Boolean] = js.undefined
    ): AwsRedshiftClusterPendingModifiedValues = {
      val __obj = js.Dynamic.literal()
      AutomatedSnapshotRetentionPeriod.foreach(__v => __obj.updateDynamic("AutomatedSnapshotRetentionPeriod")(__v.asInstanceOf[js.Any]))
      ClusterIdentifier.foreach(__v => __obj.updateDynamic("ClusterIdentifier")(__v.asInstanceOf[js.Any]))
      ClusterType.foreach(__v => __obj.updateDynamic("ClusterType")(__v.asInstanceOf[js.Any]))
      ClusterVersion.foreach(__v => __obj.updateDynamic("ClusterVersion")(__v.asInstanceOf[js.Any]))
      EncryptionType.foreach(__v => __obj.updateDynamic("EncryptionType")(__v.asInstanceOf[js.Any]))
      EnhancedVpcRouting.foreach(__v => __obj.updateDynamic("EnhancedVpcRouting")(__v.asInstanceOf[js.Any]))
      MaintenanceTrackName.foreach(__v => __obj.updateDynamic("MaintenanceTrackName")(__v.asInstanceOf[js.Any]))
      MasterUserPassword.foreach(__v => __obj.updateDynamic("MasterUserPassword")(__v.asInstanceOf[js.Any]))
      NodeType.foreach(__v => __obj.updateDynamic("NodeType")(__v.asInstanceOf[js.Any]))
      NumberOfNodes.foreach(__v => __obj.updateDynamic("NumberOfNodes")(__v.asInstanceOf[js.Any]))
      PubliclyAccessible.foreach(__v => __obj.updateDynamic("PubliclyAccessible")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsRedshiftClusterPendingModifiedValues]
    }
  }

  /** Information about the resize operation for the cluster.
    */
  @js.native
  trait AwsRedshiftClusterResizeInfo extends js.Object {
    var AllowCancelResize: js.UndefOr[Boolean]
    var ResizeType: js.UndefOr[NonEmptyString]
  }

  object AwsRedshiftClusterResizeInfo {
    @inline
    def apply(
        AllowCancelResize: js.UndefOr[Boolean] = js.undefined,
        ResizeType: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsRedshiftClusterResizeInfo = {
      val __obj = js.Dynamic.literal()
      AllowCancelResize.foreach(__v => __obj.updateDynamic("AllowCancelResize")(__v.asInstanceOf[js.Any]))
      ResizeType.foreach(__v => __obj.updateDynamic("ResizeType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsRedshiftClusterResizeInfo]
    }
  }

  /** Information about the status of a cluster restore action. It only applies if the cluster was created by restoring a snapshot.
    */
  @js.native
  trait AwsRedshiftClusterRestoreStatus extends js.Object {
    var CurrentRestoreRateInMegaBytesPerSecond: js.UndefOr[Double]
    var ElapsedTimeInSeconds: js.UndefOr[Double]
    var EstimatedTimeToCompletionInSeconds: js.UndefOr[Double]
    var ProgressInMegaBytes: js.UndefOr[Double]
    var SnapshotSizeInMegaBytes: js.UndefOr[Double]
    var Status: js.UndefOr[NonEmptyString]
  }

  object AwsRedshiftClusterRestoreStatus {
    @inline
    def apply(
        CurrentRestoreRateInMegaBytesPerSecond: js.UndefOr[Double] = js.undefined,
        ElapsedTimeInSeconds: js.UndefOr[Double] = js.undefined,
        EstimatedTimeToCompletionInSeconds: js.UndefOr[Double] = js.undefined,
        ProgressInMegaBytes: js.UndefOr[Double] = js.undefined,
        SnapshotSizeInMegaBytes: js.UndefOr[Double] = js.undefined,
        Status: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsRedshiftClusterRestoreStatus = {
      val __obj = js.Dynamic.literal()
      CurrentRestoreRateInMegaBytesPerSecond.foreach(__v => __obj.updateDynamic("CurrentRestoreRateInMegaBytesPerSecond")(__v.asInstanceOf[js.Any]))
      ElapsedTimeInSeconds.foreach(__v => __obj.updateDynamic("ElapsedTimeInSeconds")(__v.asInstanceOf[js.Any]))
      EstimatedTimeToCompletionInSeconds.foreach(__v => __obj.updateDynamic("EstimatedTimeToCompletionInSeconds")(__v.asInstanceOf[js.Any]))
      ProgressInMegaBytes.foreach(__v => __obj.updateDynamic("ProgressInMegaBytes")(__v.asInstanceOf[js.Any]))
      SnapshotSizeInMegaBytes.foreach(__v => __obj.updateDynamic("SnapshotSizeInMegaBytes")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsRedshiftClusterRestoreStatus]
    }
  }

  /** A VPC security group that the cluster belongs to, if the cluster is in a VPC.
    */
  @js.native
  trait AwsRedshiftClusterVpcSecurityGroup extends js.Object {
    var Status: js.UndefOr[NonEmptyString]
    var VpcSecurityGroupId: js.UndefOr[NonEmptyString]
  }

  object AwsRedshiftClusterVpcSecurityGroup {
    @inline
    def apply(
        Status: js.UndefOr[NonEmptyString] = js.undefined,
        VpcSecurityGroupId: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsRedshiftClusterVpcSecurityGroup = {
      val __obj = js.Dynamic.literal()
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      VpcSecurityGroupId.foreach(__v => __obj.updateDynamic("VpcSecurityGroupId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsRedshiftClusterVpcSecurityGroup]
    }
  }

  /** provides information about the Amazon S3 Public Access Block configuration for accounts.
    */
  @js.native
  trait AwsS3AccountPublicAccessBlockDetails extends js.Object {
    var BlockPublicAcls: js.UndefOr[Boolean]
    var BlockPublicPolicy: js.UndefOr[Boolean]
    var IgnorePublicAcls: js.UndefOr[Boolean]
    var RestrictPublicBuckets: js.UndefOr[Boolean]
  }

  object AwsS3AccountPublicAccessBlockDetails {
    @inline
    def apply(
        BlockPublicAcls: js.UndefOr[Boolean] = js.undefined,
        BlockPublicPolicy: js.UndefOr[Boolean] = js.undefined,
        IgnorePublicAcls: js.UndefOr[Boolean] = js.undefined,
        RestrictPublicBuckets: js.UndefOr[Boolean] = js.undefined
    ): AwsS3AccountPublicAccessBlockDetails = {
      val __obj = js.Dynamic.literal()
      BlockPublicAcls.foreach(__v => __obj.updateDynamic("BlockPublicAcls")(__v.asInstanceOf[js.Any]))
      BlockPublicPolicy.foreach(__v => __obj.updateDynamic("BlockPublicPolicy")(__v.asInstanceOf[js.Any]))
      IgnorePublicAcls.foreach(__v => __obj.updateDynamic("IgnorePublicAcls")(__v.asInstanceOf[js.Any]))
      RestrictPublicBuckets.foreach(__v => __obj.updateDynamic("RestrictPublicBuckets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsS3AccountPublicAccessBlockDetails]
    }
  }

  /** The lifecycle configuration for the objects in the S3 bucket.
    */
  @js.native
  trait AwsS3BucketBucketLifecycleConfigurationDetails extends js.Object {
    var Rules: js.UndefOr[AwsS3BucketBucketLifecycleConfigurationRulesList]
  }

  object AwsS3BucketBucketLifecycleConfigurationDetails {
    @inline
    def apply(
        Rules: js.UndefOr[AwsS3BucketBucketLifecycleConfigurationRulesList] = js.undefined
    ): AwsS3BucketBucketLifecycleConfigurationDetails = {
      val __obj = js.Dynamic.literal()
      Rules.foreach(__v => __obj.updateDynamic("Rules")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsS3BucketBucketLifecycleConfigurationDetails]
    }
  }

  /** Information about what Amazon S3 does when a multipart upload is incomplete.
    */
  @js.native
  trait AwsS3BucketBucketLifecycleConfigurationRulesAbortIncompleteMultipartUploadDetails extends js.Object {
    var DaysAfterInitiation: js.UndefOr[Int]
  }

  object AwsS3BucketBucketLifecycleConfigurationRulesAbortIncompleteMultipartUploadDetails {
    @inline
    def apply(
        DaysAfterInitiation: js.UndefOr[Int] = js.undefined
    ): AwsS3BucketBucketLifecycleConfigurationRulesAbortIncompleteMultipartUploadDetails = {
      val __obj = js.Dynamic.literal()
      DaysAfterInitiation.foreach(__v => __obj.updateDynamic("DaysAfterInitiation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsS3BucketBucketLifecycleConfigurationRulesAbortIncompleteMultipartUploadDetails]
    }
  }

  /** Configuration for a lifecycle rule.
    */
  @js.native
  trait AwsS3BucketBucketLifecycleConfigurationRulesDetails extends js.Object {
    var AbortIncompleteMultipartUpload: js.UndefOr[AwsS3BucketBucketLifecycleConfigurationRulesAbortIncompleteMultipartUploadDetails]
    var ExpirationDate: js.UndefOr[NonEmptyString]
    var ExpirationInDays: js.UndefOr[Int]
    var ExpiredObjectDeleteMarker: js.UndefOr[Boolean]
    var Filter: js.UndefOr[AwsS3BucketBucketLifecycleConfigurationRulesFilterDetails]
    var ID: js.UndefOr[NonEmptyString]
    var NoncurrentVersionExpirationInDays: js.UndefOr[Int]
    var NoncurrentVersionTransitions: js.UndefOr[AwsS3BucketBucketLifecycleConfigurationRulesNoncurrentVersionTransitionsList]
    var Prefix: js.UndefOr[NonEmptyString]
    var Status: js.UndefOr[NonEmptyString]
    var Transitions: js.UndefOr[AwsS3BucketBucketLifecycleConfigurationRulesTransitionsList]
  }

  object AwsS3BucketBucketLifecycleConfigurationRulesDetails {
    @inline
    def apply(
        AbortIncompleteMultipartUpload: js.UndefOr[AwsS3BucketBucketLifecycleConfigurationRulesAbortIncompleteMultipartUploadDetails] = js.undefined,
        ExpirationDate: js.UndefOr[NonEmptyString] = js.undefined,
        ExpirationInDays: js.UndefOr[Int] = js.undefined,
        ExpiredObjectDeleteMarker: js.UndefOr[Boolean] = js.undefined,
        Filter: js.UndefOr[AwsS3BucketBucketLifecycleConfigurationRulesFilterDetails] = js.undefined,
        ID: js.UndefOr[NonEmptyString] = js.undefined,
        NoncurrentVersionExpirationInDays: js.UndefOr[Int] = js.undefined,
        NoncurrentVersionTransitions: js.UndefOr[AwsS3BucketBucketLifecycleConfigurationRulesNoncurrentVersionTransitionsList] = js.undefined,
        Prefix: js.UndefOr[NonEmptyString] = js.undefined,
        Status: js.UndefOr[NonEmptyString] = js.undefined,
        Transitions: js.UndefOr[AwsS3BucketBucketLifecycleConfigurationRulesTransitionsList] = js.undefined
    ): AwsS3BucketBucketLifecycleConfigurationRulesDetails = {
      val __obj = js.Dynamic.literal()
      AbortIncompleteMultipartUpload.foreach(__v => __obj.updateDynamic("AbortIncompleteMultipartUpload")(__v.asInstanceOf[js.Any]))
      ExpirationDate.foreach(__v => __obj.updateDynamic("ExpirationDate")(__v.asInstanceOf[js.Any]))
      ExpirationInDays.foreach(__v => __obj.updateDynamic("ExpirationInDays")(__v.asInstanceOf[js.Any]))
      ExpiredObjectDeleteMarker.foreach(__v => __obj.updateDynamic("ExpiredObjectDeleteMarker")(__v.asInstanceOf[js.Any]))
      Filter.foreach(__v => __obj.updateDynamic("Filter")(__v.asInstanceOf[js.Any]))
      ID.foreach(__v => __obj.updateDynamic("ID")(__v.asInstanceOf[js.Any]))
      NoncurrentVersionExpirationInDays.foreach(__v => __obj.updateDynamic("NoncurrentVersionExpirationInDays")(__v.asInstanceOf[js.Any]))
      NoncurrentVersionTransitions.foreach(__v => __obj.updateDynamic("NoncurrentVersionTransitions")(__v.asInstanceOf[js.Any]))
      Prefix.foreach(__v => __obj.updateDynamic("Prefix")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Transitions.foreach(__v => __obj.updateDynamic("Transitions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsS3BucketBucketLifecycleConfigurationRulesDetails]
    }
  }

  /** Identifies the objects that a rule applies to.
    */
  @js.native
  trait AwsS3BucketBucketLifecycleConfigurationRulesFilterDetails extends js.Object {
    var Predicate: js.UndefOr[AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateDetails]
  }

  object AwsS3BucketBucketLifecycleConfigurationRulesFilterDetails {
    @inline
    def apply(
        Predicate: js.UndefOr[AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateDetails] = js.undefined
    ): AwsS3BucketBucketLifecycleConfigurationRulesFilterDetails = {
      val __obj = js.Dynamic.literal()
      Predicate.foreach(__v => __obj.updateDynamic("Predicate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsS3BucketBucketLifecycleConfigurationRulesFilterDetails]
    }
  }

  /** The configuration for the filter.
    */
  @js.native
  trait AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateDetails extends js.Object {
    var Operands: js.UndefOr[AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateOperandsList]
    var Prefix: js.UndefOr[NonEmptyString]
    var Tag: js.UndefOr[AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateTagDetails]
    var Type: js.UndefOr[NonEmptyString]
  }

  object AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateDetails {
    @inline
    def apply(
        Operands: js.UndefOr[AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateOperandsList] = js.undefined,
        Prefix: js.UndefOr[NonEmptyString] = js.undefined,
        Tag: js.UndefOr[AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateTagDetails] = js.undefined,
        Type: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateDetails = {
      val __obj = js.Dynamic.literal()
      Operands.foreach(__v => __obj.updateDynamic("Operands")(__v.asInstanceOf[js.Any]))
      Prefix.foreach(__v => __obj.updateDynamic("Prefix")(__v.asInstanceOf[js.Any]))
      Tag.foreach(__v => __obj.updateDynamic("Tag")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateDetails]
    }
  }

  /** A value to use for the filter.
    */
  @js.native
  trait AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateOperandsDetails extends js.Object {
    var Prefix: js.UndefOr[NonEmptyString]
    var Tag: js.UndefOr[AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateOperandsTagDetails]
    var Type: js.UndefOr[NonEmptyString]
  }

  object AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateOperandsDetails {
    @inline
    def apply(
        Prefix: js.UndefOr[NonEmptyString] = js.undefined,
        Tag: js.UndefOr[AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateOperandsTagDetails] = js.undefined,
        Type: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateOperandsDetails = {
      val __obj = js.Dynamic.literal()
      Prefix.foreach(__v => __obj.updateDynamic("Prefix")(__v.asInstanceOf[js.Any]))
      Tag.foreach(__v => __obj.updateDynamic("Tag")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateOperandsDetails]
    }
  }

  /** A tag that is assigned to matching objects.
    */
  @js.native
  trait AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateOperandsTagDetails extends js.Object {
    var Key: js.UndefOr[NonEmptyString]
    var Value: js.UndefOr[NonEmptyString]
  }

  object AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateOperandsTagDetails {
    @inline
    def apply(
        Key: js.UndefOr[NonEmptyString] = js.undefined,
        Value: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateOperandsTagDetails = {
      val __obj = js.Dynamic.literal()
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateOperandsTagDetails]
    }
  }

  /** A tag filter.
    */
  @js.native
  trait AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateTagDetails extends js.Object {
    var Key: js.UndefOr[NonEmptyString]
    var Value: js.UndefOr[NonEmptyString]
  }

  object AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateTagDetails {
    @inline
    def apply(
        Key: js.UndefOr[NonEmptyString] = js.undefined,
        Value: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateTagDetails = {
      val __obj = js.Dynamic.literal()
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateTagDetails]
    }
  }

  /** A transition rule that describes when noncurrent objects transition to a specified storage class.
    */
  @js.native
  trait AwsS3BucketBucketLifecycleConfigurationRulesNoncurrentVersionTransitionsDetails extends js.Object {
    var Days: js.UndefOr[Int]
    var StorageClass: js.UndefOr[NonEmptyString]
  }

  object AwsS3BucketBucketLifecycleConfigurationRulesNoncurrentVersionTransitionsDetails {
    @inline
    def apply(
        Days: js.UndefOr[Int] = js.undefined,
        StorageClass: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsS3BucketBucketLifecycleConfigurationRulesNoncurrentVersionTransitionsDetails = {
      val __obj = js.Dynamic.literal()
      Days.foreach(__v => __obj.updateDynamic("Days")(__v.asInstanceOf[js.Any]))
      StorageClass.foreach(__v => __obj.updateDynamic("StorageClass")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsS3BucketBucketLifecycleConfigurationRulesNoncurrentVersionTransitionsDetails]
    }
  }

  /** A rule for when objects transition to specific storage classes.
    */
  @js.native
  trait AwsS3BucketBucketLifecycleConfigurationRulesTransitionsDetails extends js.Object {
    var Date: js.UndefOr[NonEmptyString]
    var Days: js.UndefOr[Int]
    var StorageClass: js.UndefOr[NonEmptyString]
  }

  object AwsS3BucketBucketLifecycleConfigurationRulesTransitionsDetails {
    @inline
    def apply(
        Date: js.UndefOr[NonEmptyString] = js.undefined,
        Days: js.UndefOr[Int] = js.undefined,
        StorageClass: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsS3BucketBucketLifecycleConfigurationRulesTransitionsDetails = {
      val __obj = js.Dynamic.literal()
      Date.foreach(__v => __obj.updateDynamic("Date")(__v.asInstanceOf[js.Any]))
      Days.foreach(__v => __obj.updateDynamic("Days")(__v.asInstanceOf[js.Any]))
      StorageClass.foreach(__v => __obj.updateDynamic("StorageClass")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsS3BucketBucketLifecycleConfigurationRulesTransitionsDetails]
    }
  }

  /** Describes the versioning state of an S3 bucket.
    */
  @js.native
  trait AwsS3BucketBucketVersioningConfiguration extends js.Object {
    var IsMfaDeleteEnabled: js.UndefOr[Boolean]
    var Status: js.UndefOr[NonEmptyString]
  }

  object AwsS3BucketBucketVersioningConfiguration {
    @inline
    def apply(
        IsMfaDeleteEnabled: js.UndefOr[Boolean] = js.undefined,
        Status: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsS3BucketBucketVersioningConfiguration = {
      val __obj = js.Dynamic.literal()
      IsMfaDeleteEnabled.foreach(__v => __obj.updateDynamic("IsMfaDeleteEnabled")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsS3BucketBucketVersioningConfiguration]
    }
  }

  /** The details of an Amazon S3 bucket.
    */
  @js.native
  trait AwsS3BucketDetails extends js.Object {
    var AccessControlList: js.UndefOr[NonEmptyString]
    var BucketLifecycleConfiguration: js.UndefOr[AwsS3BucketBucketLifecycleConfigurationDetails]
    var BucketLoggingConfiguration: js.UndefOr[AwsS3BucketLoggingConfiguration]
    var BucketNotificationConfiguration: js.UndefOr[AwsS3BucketNotificationConfiguration]
    var BucketVersioningConfiguration: js.UndefOr[AwsS3BucketBucketVersioningConfiguration]
    var BucketWebsiteConfiguration: js.UndefOr[AwsS3BucketWebsiteConfiguration]
    var CreatedAt: js.UndefOr[NonEmptyString]
    var OwnerAccountId: js.UndefOr[NonEmptyString]
    var OwnerId: js.UndefOr[NonEmptyString]
    var OwnerName: js.UndefOr[NonEmptyString]
    var PublicAccessBlockConfiguration: js.UndefOr[AwsS3AccountPublicAccessBlockDetails]
    var ServerSideEncryptionConfiguration: js.UndefOr[AwsS3BucketServerSideEncryptionConfiguration]
  }

  object AwsS3BucketDetails {
    @inline
    def apply(
        AccessControlList: js.UndefOr[NonEmptyString] = js.undefined,
        BucketLifecycleConfiguration: js.UndefOr[AwsS3BucketBucketLifecycleConfigurationDetails] = js.undefined,
        BucketLoggingConfiguration: js.UndefOr[AwsS3BucketLoggingConfiguration] = js.undefined,
        BucketNotificationConfiguration: js.UndefOr[AwsS3BucketNotificationConfiguration] = js.undefined,
        BucketVersioningConfiguration: js.UndefOr[AwsS3BucketBucketVersioningConfiguration] = js.undefined,
        BucketWebsiteConfiguration: js.UndefOr[AwsS3BucketWebsiteConfiguration] = js.undefined,
        CreatedAt: js.UndefOr[NonEmptyString] = js.undefined,
        OwnerAccountId: js.UndefOr[NonEmptyString] = js.undefined,
        OwnerId: js.UndefOr[NonEmptyString] = js.undefined,
        OwnerName: js.UndefOr[NonEmptyString] = js.undefined,
        PublicAccessBlockConfiguration: js.UndefOr[AwsS3AccountPublicAccessBlockDetails] = js.undefined,
        ServerSideEncryptionConfiguration: js.UndefOr[AwsS3BucketServerSideEncryptionConfiguration] = js.undefined
    ): AwsS3BucketDetails = {
      val __obj = js.Dynamic.literal()
      AccessControlList.foreach(__v => __obj.updateDynamic("AccessControlList")(__v.asInstanceOf[js.Any]))
      BucketLifecycleConfiguration.foreach(__v => __obj.updateDynamic("BucketLifecycleConfiguration")(__v.asInstanceOf[js.Any]))
      BucketLoggingConfiguration.foreach(__v => __obj.updateDynamic("BucketLoggingConfiguration")(__v.asInstanceOf[js.Any]))
      BucketNotificationConfiguration.foreach(__v => __obj.updateDynamic("BucketNotificationConfiguration")(__v.asInstanceOf[js.Any]))
      BucketVersioningConfiguration.foreach(__v => __obj.updateDynamic("BucketVersioningConfiguration")(__v.asInstanceOf[js.Any]))
      BucketWebsiteConfiguration.foreach(__v => __obj.updateDynamic("BucketWebsiteConfiguration")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      OwnerAccountId.foreach(__v => __obj.updateDynamic("OwnerAccountId")(__v.asInstanceOf[js.Any]))
      OwnerId.foreach(__v => __obj.updateDynamic("OwnerId")(__v.asInstanceOf[js.Any]))
      OwnerName.foreach(__v => __obj.updateDynamic("OwnerName")(__v.asInstanceOf[js.Any]))
      PublicAccessBlockConfiguration.foreach(__v => __obj.updateDynamic("PublicAccessBlockConfiguration")(__v.asInstanceOf[js.Any]))
      ServerSideEncryptionConfiguration.foreach(__v => __obj.updateDynamic("ServerSideEncryptionConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsS3BucketDetails]
    }
  }

  /** Information about logging for the S3 bucket
    */
  @js.native
  trait AwsS3BucketLoggingConfiguration extends js.Object {
    var DestinationBucketName: js.UndefOr[NonEmptyString]
    var LogFilePrefix: js.UndefOr[NonEmptyString]
  }

  object AwsS3BucketLoggingConfiguration {
    @inline
    def apply(
        DestinationBucketName: js.UndefOr[NonEmptyString] = js.undefined,
        LogFilePrefix: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsS3BucketLoggingConfiguration = {
      val __obj = js.Dynamic.literal()
      DestinationBucketName.foreach(__v => __obj.updateDynamic("DestinationBucketName")(__v.asInstanceOf[js.Any]))
      LogFilePrefix.foreach(__v => __obj.updateDynamic("LogFilePrefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsS3BucketLoggingConfiguration]
    }
  }

  /** The notification configuration for the S3 bucket.
    */
  @js.native
  trait AwsS3BucketNotificationConfiguration extends js.Object {
    var Configurations: js.UndefOr[AwsS3BucketNotificationConfigurationDetails]
  }

  object AwsS3BucketNotificationConfiguration {
    @inline
    def apply(
        Configurations: js.UndefOr[AwsS3BucketNotificationConfigurationDetails] = js.undefined
    ): AwsS3BucketNotificationConfiguration = {
      val __obj = js.Dynamic.literal()
      Configurations.foreach(__v => __obj.updateDynamic("Configurations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsS3BucketNotificationConfiguration]
    }
  }

  /** Details for an S3 bucket notification configuration.
    */
  @js.native
  trait AwsS3BucketNotificationConfigurationDetail extends js.Object {
    var Destination: js.UndefOr[NonEmptyString]
    var Events: js.UndefOr[AwsS3BucketNotificationConfigurationEvents]
    var Filter: js.UndefOr[AwsS3BucketNotificationConfigurationFilter]
    var Type: js.UndefOr[NonEmptyString]
  }

  object AwsS3BucketNotificationConfigurationDetail {
    @inline
    def apply(
        Destination: js.UndefOr[NonEmptyString] = js.undefined,
        Events: js.UndefOr[AwsS3BucketNotificationConfigurationEvents] = js.undefined,
        Filter: js.UndefOr[AwsS3BucketNotificationConfigurationFilter] = js.undefined,
        Type: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsS3BucketNotificationConfigurationDetail = {
      val __obj = js.Dynamic.literal()
      Destination.foreach(__v => __obj.updateDynamic("Destination")(__v.asInstanceOf[js.Any]))
      Events.foreach(__v => __obj.updateDynamic("Events")(__v.asInstanceOf[js.Any]))
      Filter.foreach(__v => __obj.updateDynamic("Filter")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsS3BucketNotificationConfigurationDetail]
    }
  }

  /** Filtering information for the notifications. The filtering is based on Amazon S3 key names.
    */
  @js.native
  trait AwsS3BucketNotificationConfigurationFilter extends js.Object {
    var S3KeyFilter: js.UndefOr[AwsS3BucketNotificationConfigurationS3KeyFilter]
  }

  object AwsS3BucketNotificationConfigurationFilter {
    @inline
    def apply(
        S3KeyFilter: js.UndefOr[AwsS3BucketNotificationConfigurationS3KeyFilter] = js.undefined
    ): AwsS3BucketNotificationConfigurationFilter = {
      val __obj = js.Dynamic.literal()
      S3KeyFilter.foreach(__v => __obj.updateDynamic("S3KeyFilter")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsS3BucketNotificationConfigurationFilter]
    }
  }

  /** Details for an Amazon S3 filter.
    */
  @js.native
  trait AwsS3BucketNotificationConfigurationS3KeyFilter extends js.Object {
    var FilterRules: js.UndefOr[AwsS3BucketNotificationConfigurationS3KeyFilterRules]
  }

  object AwsS3BucketNotificationConfigurationS3KeyFilter {
    @inline
    def apply(
        FilterRules: js.UndefOr[AwsS3BucketNotificationConfigurationS3KeyFilterRules] = js.undefined
    ): AwsS3BucketNotificationConfigurationS3KeyFilter = {
      val __obj = js.Dynamic.literal()
      FilterRules.foreach(__v => __obj.updateDynamic("FilterRules")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsS3BucketNotificationConfigurationS3KeyFilter]
    }
  }

  /** Details for a filter rule.
    */
  @js.native
  trait AwsS3BucketNotificationConfigurationS3KeyFilterRule extends js.Object {
    var Name: js.UndefOr[AwsS3BucketNotificationConfigurationS3KeyFilterRuleName]
    var Value: js.UndefOr[NonEmptyString]
  }

  object AwsS3BucketNotificationConfigurationS3KeyFilterRule {
    @inline
    def apply(
        Name: js.UndefOr[AwsS3BucketNotificationConfigurationS3KeyFilterRuleName] = js.undefined,
        Value: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsS3BucketNotificationConfigurationS3KeyFilterRule = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsS3BucketNotificationConfigurationS3KeyFilterRule]
    }
  }

  /** Specifies the default server-side encryption to apply to new objects in the bucket.
    */
  @js.native
  trait AwsS3BucketServerSideEncryptionByDefault extends js.Object {
    var KMSMasterKeyID: js.UndefOr[NonEmptyString]
    var SSEAlgorithm: js.UndefOr[NonEmptyString]
  }

  object AwsS3BucketServerSideEncryptionByDefault {
    @inline
    def apply(
        KMSMasterKeyID: js.UndefOr[NonEmptyString] = js.undefined,
        SSEAlgorithm: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsS3BucketServerSideEncryptionByDefault = {
      val __obj = js.Dynamic.literal()
      KMSMasterKeyID.foreach(__v => __obj.updateDynamic("KMSMasterKeyID")(__v.asInstanceOf[js.Any]))
      SSEAlgorithm.foreach(__v => __obj.updateDynamic("SSEAlgorithm")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsS3BucketServerSideEncryptionByDefault]
    }
  }

  /** The encryption configuration for the S3 bucket.
    */
  @js.native
  trait AwsS3BucketServerSideEncryptionConfiguration extends js.Object {
    var Rules: js.UndefOr[AwsS3BucketServerSideEncryptionRules]
  }

  object AwsS3BucketServerSideEncryptionConfiguration {
    @inline
    def apply(
        Rules: js.UndefOr[AwsS3BucketServerSideEncryptionRules] = js.undefined
    ): AwsS3BucketServerSideEncryptionConfiguration = {
      val __obj = js.Dynamic.literal()
      Rules.foreach(__v => __obj.updateDynamic("Rules")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsS3BucketServerSideEncryptionConfiguration]
    }
  }

  /** An encryption rule to apply to the S3 bucket.
    */
  @js.native
  trait AwsS3BucketServerSideEncryptionRule extends js.Object {
    var ApplyServerSideEncryptionByDefault: js.UndefOr[AwsS3BucketServerSideEncryptionByDefault]
  }

  object AwsS3BucketServerSideEncryptionRule {
    @inline
    def apply(
        ApplyServerSideEncryptionByDefault: js.UndefOr[AwsS3BucketServerSideEncryptionByDefault] = js.undefined
    ): AwsS3BucketServerSideEncryptionRule = {
      val __obj = js.Dynamic.literal()
      ApplyServerSideEncryptionByDefault.foreach(__v => __obj.updateDynamic("ApplyServerSideEncryptionByDefault")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsS3BucketServerSideEncryptionRule]
    }
  }

  /** Website parameters for the S3 bucket.
    */
  @js.native
  trait AwsS3BucketWebsiteConfiguration extends js.Object {
    var ErrorDocument: js.UndefOr[NonEmptyString]
    var IndexDocumentSuffix: js.UndefOr[NonEmptyString]
    var RedirectAllRequestsTo: js.UndefOr[AwsS3BucketWebsiteConfigurationRedirectTo]
    var RoutingRules: js.UndefOr[AwsS3BucketWebsiteConfigurationRoutingRules]
  }

  object AwsS3BucketWebsiteConfiguration {
    @inline
    def apply(
        ErrorDocument: js.UndefOr[NonEmptyString] = js.undefined,
        IndexDocumentSuffix: js.UndefOr[NonEmptyString] = js.undefined,
        RedirectAllRequestsTo: js.UndefOr[AwsS3BucketWebsiteConfigurationRedirectTo] = js.undefined,
        RoutingRules: js.UndefOr[AwsS3BucketWebsiteConfigurationRoutingRules] = js.undefined
    ): AwsS3BucketWebsiteConfiguration = {
      val __obj = js.Dynamic.literal()
      ErrorDocument.foreach(__v => __obj.updateDynamic("ErrorDocument")(__v.asInstanceOf[js.Any]))
      IndexDocumentSuffix.foreach(__v => __obj.updateDynamic("IndexDocumentSuffix")(__v.asInstanceOf[js.Any]))
      RedirectAllRequestsTo.foreach(__v => __obj.updateDynamic("RedirectAllRequestsTo")(__v.asInstanceOf[js.Any]))
      RoutingRules.foreach(__v => __obj.updateDynamic("RoutingRules")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsS3BucketWebsiteConfiguration]
    }
  }

  /** The redirect behavior for requests to the website.
    */
  @js.native
  trait AwsS3BucketWebsiteConfigurationRedirectTo extends js.Object {
    var Hostname: js.UndefOr[NonEmptyString]
    var Protocol: js.UndefOr[NonEmptyString]
  }

  object AwsS3BucketWebsiteConfigurationRedirectTo {
    @inline
    def apply(
        Hostname: js.UndefOr[NonEmptyString] = js.undefined,
        Protocol: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsS3BucketWebsiteConfigurationRedirectTo = {
      val __obj = js.Dynamic.literal()
      Hostname.foreach(__v => __obj.updateDynamic("Hostname")(__v.asInstanceOf[js.Any]))
      Protocol.foreach(__v => __obj.updateDynamic("Protocol")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsS3BucketWebsiteConfigurationRedirectTo]
    }
  }

  /** A rule for redirecting requests to the website.
    */
  @js.native
  trait AwsS3BucketWebsiteConfigurationRoutingRule extends js.Object {
    var Condition: js.UndefOr[AwsS3BucketWebsiteConfigurationRoutingRuleCondition]
    var Redirect: js.UndefOr[AwsS3BucketWebsiteConfigurationRoutingRuleRedirect]
  }

  object AwsS3BucketWebsiteConfigurationRoutingRule {
    @inline
    def apply(
        Condition: js.UndefOr[AwsS3BucketWebsiteConfigurationRoutingRuleCondition] = js.undefined,
        Redirect: js.UndefOr[AwsS3BucketWebsiteConfigurationRoutingRuleRedirect] = js.undefined
    ): AwsS3BucketWebsiteConfigurationRoutingRule = {
      val __obj = js.Dynamic.literal()
      Condition.foreach(__v => __obj.updateDynamic("Condition")(__v.asInstanceOf[js.Any]))
      Redirect.foreach(__v => __obj.updateDynamic("Redirect")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsS3BucketWebsiteConfigurationRoutingRule]
    }
  }

  /** The condition that must be met in order to apply the routing rule.
    */
  @js.native
  trait AwsS3BucketWebsiteConfigurationRoutingRuleCondition extends js.Object {
    var HttpErrorCodeReturnedEquals: js.UndefOr[NonEmptyString]
    var KeyPrefixEquals: js.UndefOr[NonEmptyString]
  }

  object AwsS3BucketWebsiteConfigurationRoutingRuleCondition {
    @inline
    def apply(
        HttpErrorCodeReturnedEquals: js.UndefOr[NonEmptyString] = js.undefined,
        KeyPrefixEquals: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsS3BucketWebsiteConfigurationRoutingRuleCondition = {
      val __obj = js.Dynamic.literal()
      HttpErrorCodeReturnedEquals.foreach(__v => __obj.updateDynamic("HttpErrorCodeReturnedEquals")(__v.asInstanceOf[js.Any]))
      KeyPrefixEquals.foreach(__v => __obj.updateDynamic("KeyPrefixEquals")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsS3BucketWebsiteConfigurationRoutingRuleCondition]
    }
  }

  /** The rules to redirect the request if the condition in <code>Condition</code> is met.
    */
  @js.native
  trait AwsS3BucketWebsiteConfigurationRoutingRuleRedirect extends js.Object {
    var Hostname: js.UndefOr[NonEmptyString]
    var HttpRedirectCode: js.UndefOr[NonEmptyString]
    var Protocol: js.UndefOr[NonEmptyString]
    var ReplaceKeyPrefixWith: js.UndefOr[NonEmptyString]
    var ReplaceKeyWith: js.UndefOr[NonEmptyString]
  }

  object AwsS3BucketWebsiteConfigurationRoutingRuleRedirect {
    @inline
    def apply(
        Hostname: js.UndefOr[NonEmptyString] = js.undefined,
        HttpRedirectCode: js.UndefOr[NonEmptyString] = js.undefined,
        Protocol: js.UndefOr[NonEmptyString] = js.undefined,
        ReplaceKeyPrefixWith: js.UndefOr[NonEmptyString] = js.undefined,
        ReplaceKeyWith: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsS3BucketWebsiteConfigurationRoutingRuleRedirect = {
      val __obj = js.Dynamic.literal()
      Hostname.foreach(__v => __obj.updateDynamic("Hostname")(__v.asInstanceOf[js.Any]))
      HttpRedirectCode.foreach(__v => __obj.updateDynamic("HttpRedirectCode")(__v.asInstanceOf[js.Any]))
      Protocol.foreach(__v => __obj.updateDynamic("Protocol")(__v.asInstanceOf[js.Any]))
      ReplaceKeyPrefixWith.foreach(__v => __obj.updateDynamic("ReplaceKeyPrefixWith")(__v.asInstanceOf[js.Any]))
      ReplaceKeyWith.foreach(__v => __obj.updateDynamic("ReplaceKeyWith")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsS3BucketWebsiteConfigurationRoutingRuleRedirect]
    }
  }

  /** Details about an Amazon S3 object.
    */
  @js.native
  trait AwsS3ObjectDetails extends js.Object {
    var ContentType: js.UndefOr[NonEmptyString]
    var ETag: js.UndefOr[NonEmptyString]
    var LastModified: js.UndefOr[NonEmptyString]
    var SSEKMSKeyId: js.UndefOr[NonEmptyString]
    var ServerSideEncryption: js.UndefOr[NonEmptyString]
    var VersionId: js.UndefOr[NonEmptyString]
  }

  object AwsS3ObjectDetails {
    @inline
    def apply(
        ContentType: js.UndefOr[NonEmptyString] = js.undefined,
        ETag: js.UndefOr[NonEmptyString] = js.undefined,
        LastModified: js.UndefOr[NonEmptyString] = js.undefined,
        SSEKMSKeyId: js.UndefOr[NonEmptyString] = js.undefined,
        ServerSideEncryption: js.UndefOr[NonEmptyString] = js.undefined,
        VersionId: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsS3ObjectDetails = {
      val __obj = js.Dynamic.literal()
      ContentType.foreach(__v => __obj.updateDynamic("ContentType")(__v.asInstanceOf[js.Any]))
      ETag.foreach(__v => __obj.updateDynamic("ETag")(__v.asInstanceOf[js.Any]))
      LastModified.foreach(__v => __obj.updateDynamic("LastModified")(__v.asInstanceOf[js.Any]))
      SSEKMSKeyId.foreach(__v => __obj.updateDynamic("SSEKMSKeyId")(__v.asInstanceOf[js.Any]))
      ServerSideEncryption.foreach(__v => __obj.updateDynamic("ServerSideEncryption")(__v.asInstanceOf[js.Any]))
      VersionId.foreach(__v => __obj.updateDynamic("VersionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsS3ObjectDetails]
    }
  }

  /** Details about an Secrets Manager secret.
    */
  @js.native
  trait AwsSecretsManagerSecretDetails extends js.Object {
    var Deleted: js.UndefOr[Boolean]
    var Description: js.UndefOr[NonEmptyString]
    var KmsKeyId: js.UndefOr[NonEmptyString]
    var Name: js.UndefOr[NonEmptyString]
    var RotationEnabled: js.UndefOr[Boolean]
    var RotationLambdaArn: js.UndefOr[NonEmptyString]
    var RotationOccurredWithinFrequency: js.UndefOr[Boolean]
    var RotationRules: js.UndefOr[AwsSecretsManagerSecretRotationRules]
  }

  object AwsSecretsManagerSecretDetails {
    @inline
    def apply(
        Deleted: js.UndefOr[Boolean] = js.undefined,
        Description: js.UndefOr[NonEmptyString] = js.undefined,
        KmsKeyId: js.UndefOr[NonEmptyString] = js.undefined,
        Name: js.UndefOr[NonEmptyString] = js.undefined,
        RotationEnabled: js.UndefOr[Boolean] = js.undefined,
        RotationLambdaArn: js.UndefOr[NonEmptyString] = js.undefined,
        RotationOccurredWithinFrequency: js.UndefOr[Boolean] = js.undefined,
        RotationRules: js.UndefOr[AwsSecretsManagerSecretRotationRules] = js.undefined
    ): AwsSecretsManagerSecretDetails = {
      val __obj = js.Dynamic.literal()
      Deleted.foreach(__v => __obj.updateDynamic("Deleted")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      RotationEnabled.foreach(__v => __obj.updateDynamic("RotationEnabled")(__v.asInstanceOf[js.Any]))
      RotationLambdaArn.foreach(__v => __obj.updateDynamic("RotationLambdaArn")(__v.asInstanceOf[js.Any]))
      RotationOccurredWithinFrequency.foreach(__v => __obj.updateDynamic("RotationOccurredWithinFrequency")(__v.asInstanceOf[js.Any]))
      RotationRules.foreach(__v => __obj.updateDynamic("RotationRules")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsSecretsManagerSecretDetails]
    }
  }

  /** Defines the rotation schedule for the secret.
    */
  @js.native
  trait AwsSecretsManagerSecretRotationRules extends js.Object {
    var AutomaticallyAfterDays: js.UndefOr[Int]
  }

  object AwsSecretsManagerSecretRotationRules {
    @inline
    def apply(
        AutomaticallyAfterDays: js.UndefOr[Int] = js.undefined
    ): AwsSecretsManagerSecretRotationRules = {
      val __obj = js.Dynamic.literal()
      AutomaticallyAfterDays.foreach(__v => __obj.updateDynamic("AutomaticallyAfterDays")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsSecretsManagerSecretRotationRules]
    }
  }

  /** Provides a consistent format for Security Hub findings. <code>AwsSecurityFinding</code> format allows you to share findings between Amazon Web Services security services and third-party solutions.
    *
    * '''Note:'''A finding is a potential security issue generated either by Amazon Web Services services or by the integrated third-party solutions and standards checks.
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
    var Title: NonEmptyString
    var UpdatedAt: NonEmptyString
    var Action: js.UndefOr[Action]
    var CompanyName: js.UndefOr[NonEmptyString]
    var Compliance: js.UndefOr[Compliance]
    var Confidence: js.UndefOr[Int]
    var Criticality: js.UndefOr[Int]
    var FindingProviderFields: js.UndefOr[FindingProviderFields]
    var FirstObservedAt: js.UndefOr[NonEmptyString]
    var LastObservedAt: js.UndefOr[NonEmptyString]
    var Malware: js.UndefOr[MalwareList]
    var Network: js.UndefOr[Network]
    var NetworkPath: js.UndefOr[NetworkPathList]
    var Note: js.UndefOr[Note]
    var PatchSummary: js.UndefOr[PatchSummary]
    var Process: js.UndefOr[ProcessDetails]
    var ProductFields: js.UndefOr[FieldMap]
    var ProductName: js.UndefOr[NonEmptyString]
    var RecordState: js.UndefOr[RecordState]
    var Region: js.UndefOr[NonEmptyString]
    var RelatedFindings: js.UndefOr[RelatedFindingList]
    var Remediation: js.UndefOr[Remediation]
    var Sample: js.UndefOr[Boolean]
    var Severity: js.UndefOr[Severity]
    var SourceUrl: js.UndefOr[NonEmptyString]
    var ThreatIntelIndicators: js.UndefOr[ThreatIntelIndicatorList]
    var Threats: js.UndefOr[ThreatList]
    var Types: js.UndefOr[TypeList]
    var UserDefinedFields: js.UndefOr[FieldMap]
    var VerificationState: js.UndefOr[VerificationState]
    var Vulnerabilities: js.UndefOr[VulnerabilityList]
    var Workflow: js.UndefOr[Workflow]
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
        Title: NonEmptyString,
        UpdatedAt: NonEmptyString,
        Action: js.UndefOr[Action] = js.undefined,
        CompanyName: js.UndefOr[NonEmptyString] = js.undefined,
        Compliance: js.UndefOr[Compliance] = js.undefined,
        Confidence: js.UndefOr[Int] = js.undefined,
        Criticality: js.UndefOr[Int] = js.undefined,
        FindingProviderFields: js.UndefOr[FindingProviderFields] = js.undefined,
        FirstObservedAt: js.UndefOr[NonEmptyString] = js.undefined,
        LastObservedAt: js.UndefOr[NonEmptyString] = js.undefined,
        Malware: js.UndefOr[MalwareList] = js.undefined,
        Network: js.UndefOr[Network] = js.undefined,
        NetworkPath: js.UndefOr[NetworkPathList] = js.undefined,
        Note: js.UndefOr[Note] = js.undefined,
        PatchSummary: js.UndefOr[PatchSummary] = js.undefined,
        Process: js.UndefOr[ProcessDetails] = js.undefined,
        ProductFields: js.UndefOr[FieldMap] = js.undefined,
        ProductName: js.UndefOr[NonEmptyString] = js.undefined,
        RecordState: js.UndefOr[RecordState] = js.undefined,
        Region: js.UndefOr[NonEmptyString] = js.undefined,
        RelatedFindings: js.UndefOr[RelatedFindingList] = js.undefined,
        Remediation: js.UndefOr[Remediation] = js.undefined,
        Sample: js.UndefOr[Boolean] = js.undefined,
        Severity: js.UndefOr[Severity] = js.undefined,
        SourceUrl: js.UndefOr[NonEmptyString] = js.undefined,
        ThreatIntelIndicators: js.UndefOr[ThreatIntelIndicatorList] = js.undefined,
        Threats: js.UndefOr[ThreatList] = js.undefined,
        Types: js.UndefOr[TypeList] = js.undefined,
        UserDefinedFields: js.UndefOr[FieldMap] = js.undefined,
        VerificationState: js.UndefOr[VerificationState] = js.undefined,
        Vulnerabilities: js.UndefOr[VulnerabilityList] = js.undefined,
        Workflow: js.UndefOr[Workflow] = js.undefined,
        WorkflowState: js.UndefOr[WorkflowState] = js.undefined
    ): AwsSecurityFinding = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "CreatedAt" -> CreatedAt.asInstanceOf[js.Any],
        "Description" -> Description.asInstanceOf[js.Any],
        "GeneratorId" -> GeneratorId.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "ProductArn" -> ProductArn.asInstanceOf[js.Any],
        "Resources" -> Resources.asInstanceOf[js.Any],
        "SchemaVersion" -> SchemaVersion.asInstanceOf[js.Any],
        "Title" -> Title.asInstanceOf[js.Any],
        "UpdatedAt" -> UpdatedAt.asInstanceOf[js.Any]
      )

      Action.foreach(__v => __obj.updateDynamic("Action")(__v.asInstanceOf[js.Any]))
      CompanyName.foreach(__v => __obj.updateDynamic("CompanyName")(__v.asInstanceOf[js.Any]))
      Compliance.foreach(__v => __obj.updateDynamic("Compliance")(__v.asInstanceOf[js.Any]))
      Confidence.foreach(__v => __obj.updateDynamic("Confidence")(__v.asInstanceOf[js.Any]))
      Criticality.foreach(__v => __obj.updateDynamic("Criticality")(__v.asInstanceOf[js.Any]))
      FindingProviderFields.foreach(__v => __obj.updateDynamic("FindingProviderFields")(__v.asInstanceOf[js.Any]))
      FirstObservedAt.foreach(__v => __obj.updateDynamic("FirstObservedAt")(__v.asInstanceOf[js.Any]))
      LastObservedAt.foreach(__v => __obj.updateDynamic("LastObservedAt")(__v.asInstanceOf[js.Any]))
      Malware.foreach(__v => __obj.updateDynamic("Malware")(__v.asInstanceOf[js.Any]))
      Network.foreach(__v => __obj.updateDynamic("Network")(__v.asInstanceOf[js.Any]))
      NetworkPath.foreach(__v => __obj.updateDynamic("NetworkPath")(__v.asInstanceOf[js.Any]))
      Note.foreach(__v => __obj.updateDynamic("Note")(__v.asInstanceOf[js.Any]))
      PatchSummary.foreach(__v => __obj.updateDynamic("PatchSummary")(__v.asInstanceOf[js.Any]))
      Process.foreach(__v => __obj.updateDynamic("Process")(__v.asInstanceOf[js.Any]))
      ProductFields.foreach(__v => __obj.updateDynamic("ProductFields")(__v.asInstanceOf[js.Any]))
      ProductName.foreach(__v => __obj.updateDynamic("ProductName")(__v.asInstanceOf[js.Any]))
      RecordState.foreach(__v => __obj.updateDynamic("RecordState")(__v.asInstanceOf[js.Any]))
      Region.foreach(__v => __obj.updateDynamic("Region")(__v.asInstanceOf[js.Any]))
      RelatedFindings.foreach(__v => __obj.updateDynamic("RelatedFindings")(__v.asInstanceOf[js.Any]))
      Remediation.foreach(__v => __obj.updateDynamic("Remediation")(__v.asInstanceOf[js.Any]))
      Sample.foreach(__v => __obj.updateDynamic("Sample")(__v.asInstanceOf[js.Any]))
      Severity.foreach(__v => __obj.updateDynamic("Severity")(__v.asInstanceOf[js.Any]))
      SourceUrl.foreach(__v => __obj.updateDynamic("SourceUrl")(__v.asInstanceOf[js.Any]))
      ThreatIntelIndicators.foreach(__v => __obj.updateDynamic("ThreatIntelIndicators")(__v.asInstanceOf[js.Any]))
      Threats.foreach(__v => __obj.updateDynamic("Threats")(__v.asInstanceOf[js.Any]))
      Types.foreach(__v => __obj.updateDynamic("Types")(__v.asInstanceOf[js.Any]))
      UserDefinedFields.foreach(__v => __obj.updateDynamic("UserDefinedFields")(__v.asInstanceOf[js.Any]))
      VerificationState.foreach(__v => __obj.updateDynamic("VerificationState")(__v.asInstanceOf[js.Any]))
      Vulnerabilities.foreach(__v => __obj.updateDynamic("Vulnerabilities")(__v.asInstanceOf[js.Any]))
      Workflow.foreach(__v => __obj.updateDynamic("Workflow")(__v.asInstanceOf[js.Any]))
      WorkflowState.foreach(__v => __obj.updateDynamic("WorkflowState")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsSecurityFinding]
    }
  }

  /** A collection of attributes that are applied to all active Security Hub-aggregated findings and that result in a subset of findings that are included in this insight. You can filter by up to 10 finding attributes. For each attribute, you can provide up to 20 filter values.
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
    var FindingProviderFieldsConfidence: js.UndefOr[NumberFilterList]
    var FindingProviderFieldsCriticality: js.UndefOr[NumberFilterList]
    var FindingProviderFieldsRelatedFindingsId: js.UndefOr[StringFilterList]
    var FindingProviderFieldsRelatedFindingsProductArn: js.UndefOr[StringFilterList]
    var FindingProviderFieldsSeverityLabel: js.UndefOr[StringFilterList]
    var FindingProviderFieldsSeverityOriginal: js.UndefOr[StringFilterList]
    var FindingProviderFieldsTypes: js.UndefOr[StringFilterList]
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
    var Region: js.UndefOr[StringFilterList]
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
    var ResourceAwsIamAccessKeyPrincipalName: js.UndefOr[StringFilterList]
    var ResourceAwsIamAccessKeyStatus: js.UndefOr[StringFilterList]
    var ResourceAwsIamAccessKeyUserName: js.UndefOr[StringFilterList]
    var ResourceAwsIamUserUserName: js.UndefOr[StringFilterList]
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
    var Sample: js.UndefOr[BooleanFilterList]
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
    var WorkflowStatus: js.UndefOr[StringFilterList]
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
        FindingProviderFieldsConfidence: js.UndefOr[NumberFilterList] = js.undefined,
        FindingProviderFieldsCriticality: js.UndefOr[NumberFilterList] = js.undefined,
        FindingProviderFieldsRelatedFindingsId: js.UndefOr[StringFilterList] = js.undefined,
        FindingProviderFieldsRelatedFindingsProductArn: js.UndefOr[StringFilterList] = js.undefined,
        FindingProviderFieldsSeverityLabel: js.UndefOr[StringFilterList] = js.undefined,
        FindingProviderFieldsSeverityOriginal: js.UndefOr[StringFilterList] = js.undefined,
        FindingProviderFieldsTypes: js.UndefOr[StringFilterList] = js.undefined,
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
        Region: js.UndefOr[StringFilterList] = js.undefined,
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
        ResourceAwsIamAccessKeyPrincipalName: js.UndefOr[StringFilterList] = js.undefined,
        ResourceAwsIamAccessKeyStatus: js.UndefOr[StringFilterList] = js.undefined,
        ResourceAwsIamAccessKeyUserName: js.UndefOr[StringFilterList] = js.undefined,
        ResourceAwsIamUserUserName: js.UndefOr[StringFilterList] = js.undefined,
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
        Sample: js.UndefOr[BooleanFilterList] = js.undefined,
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
        WorkflowState: js.UndefOr[StringFilterList] = js.undefined,
        WorkflowStatus: js.UndefOr[StringFilterList] = js.undefined
    ): AwsSecurityFindingFilters = {
      val __obj = js.Dynamic.literal()
      AwsAccountId.foreach(__v => __obj.updateDynamic("AwsAccountId")(__v.asInstanceOf[js.Any]))
      CompanyName.foreach(__v => __obj.updateDynamic("CompanyName")(__v.asInstanceOf[js.Any]))
      ComplianceStatus.foreach(__v => __obj.updateDynamic("ComplianceStatus")(__v.asInstanceOf[js.Any]))
      Confidence.foreach(__v => __obj.updateDynamic("Confidence")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      Criticality.foreach(__v => __obj.updateDynamic("Criticality")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      FindingProviderFieldsConfidence.foreach(__v => __obj.updateDynamic("FindingProviderFieldsConfidence")(__v.asInstanceOf[js.Any]))
      FindingProviderFieldsCriticality.foreach(__v => __obj.updateDynamic("FindingProviderFieldsCriticality")(__v.asInstanceOf[js.Any]))
      FindingProviderFieldsRelatedFindingsId.foreach(__v => __obj.updateDynamic("FindingProviderFieldsRelatedFindingsId")(__v.asInstanceOf[js.Any]))
      FindingProviderFieldsRelatedFindingsProductArn.foreach(__v => __obj.updateDynamic("FindingProviderFieldsRelatedFindingsProductArn")(__v.asInstanceOf[js.Any]))
      FindingProviderFieldsSeverityLabel.foreach(__v => __obj.updateDynamic("FindingProviderFieldsSeverityLabel")(__v.asInstanceOf[js.Any]))
      FindingProviderFieldsSeverityOriginal.foreach(__v => __obj.updateDynamic("FindingProviderFieldsSeverityOriginal")(__v.asInstanceOf[js.Any]))
      FindingProviderFieldsTypes.foreach(__v => __obj.updateDynamic("FindingProviderFieldsTypes")(__v.asInstanceOf[js.Any]))
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
      Region.foreach(__v => __obj.updateDynamic("Region")(__v.asInstanceOf[js.Any]))
      RelatedFindingsId.foreach(__v => __obj.updateDynamic("RelatedFindingsId")(__v.asInstanceOf[js.Any]))
      RelatedFindingsProductArn.foreach(__v => __obj.updateDynamic("RelatedFindingsProductArn")(__v.asInstanceOf[js.Any]))
      ResourceAwsEc2InstanceIamInstanceProfileArn.foreach(__v => __obj.updateDynamic("ResourceAwsEc2InstanceIamInstanceProfileArn")(__v.asInstanceOf[js.Any]))
      ResourceAwsEc2InstanceImageId.foreach(__v => __obj.updateDynamic("ResourceAwsEc2InstanceImageId")(__v.asInstanceOf[js.Any]))
      ResourceAwsEc2InstanceIpV4Addresses.foreach(__v => __obj.updateDynamic("ResourceAwsEc2InstanceIpV4Addresses")(__v.asInstanceOf[js.Any]))
      ResourceAwsEc2InstanceIpV6Addresses.foreach(__v => __obj.updateDynamic("ResourceAwsEc2InstanceIpV6Addresses")(__v.asInstanceOf[js.Any]))
      ResourceAwsEc2InstanceKeyName.foreach(__v => __obj.updateDynamic("ResourceAwsEc2InstanceKeyName")(__v.asInstanceOf[js.Any]))
      ResourceAwsEc2InstanceLaunchedAt.foreach(__v => __obj.updateDynamic("ResourceAwsEc2InstanceLaunchedAt")(__v.asInstanceOf[js.Any]))
      ResourceAwsEc2InstanceSubnetId.foreach(__v => __obj.updateDynamic("ResourceAwsEc2InstanceSubnetId")(__v.asInstanceOf[js.Any]))
      ResourceAwsEc2InstanceType.foreach(__v => __obj.updateDynamic("ResourceAwsEc2InstanceType")(__v.asInstanceOf[js.Any]))
      ResourceAwsEc2InstanceVpcId.foreach(__v => __obj.updateDynamic("ResourceAwsEc2InstanceVpcId")(__v.asInstanceOf[js.Any]))
      ResourceAwsIamAccessKeyCreatedAt.foreach(__v => __obj.updateDynamic("ResourceAwsIamAccessKeyCreatedAt")(__v.asInstanceOf[js.Any]))
      ResourceAwsIamAccessKeyPrincipalName.foreach(__v => __obj.updateDynamic("ResourceAwsIamAccessKeyPrincipalName")(__v.asInstanceOf[js.Any]))
      ResourceAwsIamAccessKeyStatus.foreach(__v => __obj.updateDynamic("ResourceAwsIamAccessKeyStatus")(__v.asInstanceOf[js.Any]))
      ResourceAwsIamAccessKeyUserName.foreach(__v => __obj.updateDynamic("ResourceAwsIamAccessKeyUserName")(__v.asInstanceOf[js.Any]))
      ResourceAwsIamUserUserName.foreach(__v => __obj.updateDynamic("ResourceAwsIamUserUserName")(__v.asInstanceOf[js.Any]))
      ResourceAwsS3BucketOwnerId.foreach(__v => __obj.updateDynamic("ResourceAwsS3BucketOwnerId")(__v.asInstanceOf[js.Any]))
      ResourceAwsS3BucketOwnerName.foreach(__v => __obj.updateDynamic("ResourceAwsS3BucketOwnerName")(__v.asInstanceOf[js.Any]))
      ResourceContainerImageId.foreach(__v => __obj.updateDynamic("ResourceContainerImageId")(__v.asInstanceOf[js.Any]))
      ResourceContainerImageName.foreach(__v => __obj.updateDynamic("ResourceContainerImageName")(__v.asInstanceOf[js.Any]))
      ResourceContainerLaunchedAt.foreach(__v => __obj.updateDynamic("ResourceContainerLaunchedAt")(__v.asInstanceOf[js.Any]))
      ResourceContainerName.foreach(__v => __obj.updateDynamic("ResourceContainerName")(__v.asInstanceOf[js.Any]))
      ResourceDetailsOther.foreach(__v => __obj.updateDynamic("ResourceDetailsOther")(__v.asInstanceOf[js.Any]))
      ResourceId.foreach(__v => __obj.updateDynamic("ResourceId")(__v.asInstanceOf[js.Any]))
      ResourcePartition.foreach(__v => __obj.updateDynamic("ResourcePartition")(__v.asInstanceOf[js.Any]))
      ResourceRegion.foreach(__v => __obj.updateDynamic("ResourceRegion")(__v.asInstanceOf[js.Any]))
      ResourceTags.foreach(__v => __obj.updateDynamic("ResourceTags")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      Sample.foreach(__v => __obj.updateDynamic("Sample")(__v.asInstanceOf[js.Any]))
      SeverityLabel.foreach(__v => __obj.updateDynamic("SeverityLabel")(__v.asInstanceOf[js.Any]))
      SeverityNormalized.foreach(__v => __obj.updateDynamic("SeverityNormalized")(__v.asInstanceOf[js.Any]))
      SeverityProduct.foreach(__v => __obj.updateDynamic("SeverityProduct")(__v.asInstanceOf[js.Any]))
      SourceUrl.foreach(__v => __obj.updateDynamic("SourceUrl")(__v.asInstanceOf[js.Any]))
      ThreatIntelIndicatorCategory.foreach(__v => __obj.updateDynamic("ThreatIntelIndicatorCategory")(__v.asInstanceOf[js.Any]))
      ThreatIntelIndicatorLastObservedAt.foreach(__v => __obj.updateDynamic("ThreatIntelIndicatorLastObservedAt")(__v.asInstanceOf[js.Any]))
      ThreatIntelIndicatorSource.foreach(__v => __obj.updateDynamic("ThreatIntelIndicatorSource")(__v.asInstanceOf[js.Any]))
      ThreatIntelIndicatorSourceUrl.foreach(__v => __obj.updateDynamic("ThreatIntelIndicatorSourceUrl")(__v.asInstanceOf[js.Any]))
      ThreatIntelIndicatorType.foreach(__v => __obj.updateDynamic("ThreatIntelIndicatorType")(__v.asInstanceOf[js.Any]))
      ThreatIntelIndicatorValue.foreach(__v => __obj.updateDynamic("ThreatIntelIndicatorValue")(__v.asInstanceOf[js.Any]))
      Title.foreach(__v => __obj.updateDynamic("Title")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      UpdatedAt.foreach(__v => __obj.updateDynamic("UpdatedAt")(__v.asInstanceOf[js.Any]))
      UserDefinedFields.foreach(__v => __obj.updateDynamic("UserDefinedFields")(__v.asInstanceOf[js.Any]))
      VerificationState.foreach(__v => __obj.updateDynamic("VerificationState")(__v.asInstanceOf[js.Any]))
      WorkflowState.foreach(__v => __obj.updateDynamic("WorkflowState")(__v.asInstanceOf[js.Any]))
      WorkflowStatus.foreach(__v => __obj.updateDynamic("WorkflowStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsSecurityFindingFilters]
    }
  }

  /** Identifies a finding to update using <code>BatchUpdateFindings</code>.
    */
  @js.native
  trait AwsSecurityFindingIdentifier extends js.Object {
    var Id: NonEmptyString
    var ProductArn: NonEmptyString
  }

  object AwsSecurityFindingIdentifier {
    @inline
    def apply(
        Id: NonEmptyString,
        ProductArn: NonEmptyString
    ): AwsSecurityFindingIdentifier = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "ProductArn" -> ProductArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AwsSecurityFindingIdentifier]
    }
  }

  /** Provides information about an Amazon SNS topic to which notifications can be published.
    */
  @js.native
  trait AwsSnsTopicDetails extends js.Object {
    var ApplicationSuccessFeedbackRoleArn: js.UndefOr[NonEmptyString]
    var FirehoseFailureFeedbackRoleArn: js.UndefOr[NonEmptyString]
    var FirehoseSuccessFeedbackRoleArn: js.UndefOr[NonEmptyString]
    var HttpFailureFeedbackRoleArn: js.UndefOr[NonEmptyString]
    var HttpSuccessFeedbackRoleArn: js.UndefOr[NonEmptyString]
    var KmsMasterKeyId: js.UndefOr[NonEmptyString]
    var Owner: js.UndefOr[NonEmptyString]
    var SqsFailureFeedbackRoleArn: js.UndefOr[NonEmptyString]
    var SqsSuccessFeedbackRoleArn: js.UndefOr[NonEmptyString]
    var Subscription: js.UndefOr[AwsSnsTopicSubscriptionList]
    var TopicName: js.UndefOr[NonEmptyString]
  }

  object AwsSnsTopicDetails {
    @inline
    def apply(
        ApplicationSuccessFeedbackRoleArn: js.UndefOr[NonEmptyString] = js.undefined,
        FirehoseFailureFeedbackRoleArn: js.UndefOr[NonEmptyString] = js.undefined,
        FirehoseSuccessFeedbackRoleArn: js.UndefOr[NonEmptyString] = js.undefined,
        HttpFailureFeedbackRoleArn: js.UndefOr[NonEmptyString] = js.undefined,
        HttpSuccessFeedbackRoleArn: js.UndefOr[NonEmptyString] = js.undefined,
        KmsMasterKeyId: js.UndefOr[NonEmptyString] = js.undefined,
        Owner: js.UndefOr[NonEmptyString] = js.undefined,
        SqsFailureFeedbackRoleArn: js.UndefOr[NonEmptyString] = js.undefined,
        SqsSuccessFeedbackRoleArn: js.UndefOr[NonEmptyString] = js.undefined,
        Subscription: js.UndefOr[AwsSnsTopicSubscriptionList] = js.undefined,
        TopicName: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsSnsTopicDetails = {
      val __obj = js.Dynamic.literal()
      ApplicationSuccessFeedbackRoleArn.foreach(__v => __obj.updateDynamic("ApplicationSuccessFeedbackRoleArn")(__v.asInstanceOf[js.Any]))
      FirehoseFailureFeedbackRoleArn.foreach(__v => __obj.updateDynamic("FirehoseFailureFeedbackRoleArn")(__v.asInstanceOf[js.Any]))
      FirehoseSuccessFeedbackRoleArn.foreach(__v => __obj.updateDynamic("FirehoseSuccessFeedbackRoleArn")(__v.asInstanceOf[js.Any]))
      HttpFailureFeedbackRoleArn.foreach(__v => __obj.updateDynamic("HttpFailureFeedbackRoleArn")(__v.asInstanceOf[js.Any]))
      HttpSuccessFeedbackRoleArn.foreach(__v => __obj.updateDynamic("HttpSuccessFeedbackRoleArn")(__v.asInstanceOf[js.Any]))
      KmsMasterKeyId.foreach(__v => __obj.updateDynamic("KmsMasterKeyId")(__v.asInstanceOf[js.Any]))
      Owner.foreach(__v => __obj.updateDynamic("Owner")(__v.asInstanceOf[js.Any]))
      SqsFailureFeedbackRoleArn.foreach(__v => __obj.updateDynamic("SqsFailureFeedbackRoleArn")(__v.asInstanceOf[js.Any]))
      SqsSuccessFeedbackRoleArn.foreach(__v => __obj.updateDynamic("SqsSuccessFeedbackRoleArn")(__v.asInstanceOf[js.Any]))
      Subscription.foreach(__v => __obj.updateDynamic("Subscription")(__v.asInstanceOf[js.Any]))
      TopicName.foreach(__v => __obj.updateDynamic("TopicName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsSnsTopicDetails]
    }
  }

  /** A wrapper type for the attributes of an Amazon SNS subscription.
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

  /** Data about a queue.
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
      KmsDataKeyReusePeriodSeconds.foreach(__v => __obj.updateDynamic("KmsDataKeyReusePeriodSeconds")(__v.asInstanceOf[js.Any]))
      KmsMasterKeyId.foreach(__v => __obj.updateDynamic("KmsMasterKeyId")(__v.asInstanceOf[js.Any]))
      QueueName.foreach(__v => __obj.updateDynamic("QueueName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsSqsQueueDetails]
    }
  }

  /** Provides the details about the compliance status for a patch.
    */
  @js.native
  trait AwsSsmComplianceSummary extends js.Object {
    var ComplianceType: js.UndefOr[NonEmptyString]
    var CompliantCriticalCount: js.UndefOr[Int]
    var CompliantHighCount: js.UndefOr[Int]
    var CompliantInformationalCount: js.UndefOr[Int]
    var CompliantLowCount: js.UndefOr[Int]
    var CompliantMediumCount: js.UndefOr[Int]
    var CompliantUnspecifiedCount: js.UndefOr[Int]
    var ExecutionType: js.UndefOr[NonEmptyString]
    var NonCompliantCriticalCount: js.UndefOr[Int]
    var NonCompliantHighCount: js.UndefOr[Int]
    var NonCompliantInformationalCount: js.UndefOr[Int]
    var NonCompliantLowCount: js.UndefOr[Int]
    var NonCompliantMediumCount: js.UndefOr[Int]
    var NonCompliantUnspecifiedCount: js.UndefOr[Int]
    var OverallSeverity: js.UndefOr[NonEmptyString]
    var PatchBaselineId: js.UndefOr[NonEmptyString]
    var PatchGroup: js.UndefOr[NonEmptyString]
    var Status: js.UndefOr[NonEmptyString]
  }

  object AwsSsmComplianceSummary {
    @inline
    def apply(
        ComplianceType: js.UndefOr[NonEmptyString] = js.undefined,
        CompliantCriticalCount: js.UndefOr[Int] = js.undefined,
        CompliantHighCount: js.UndefOr[Int] = js.undefined,
        CompliantInformationalCount: js.UndefOr[Int] = js.undefined,
        CompliantLowCount: js.UndefOr[Int] = js.undefined,
        CompliantMediumCount: js.UndefOr[Int] = js.undefined,
        CompliantUnspecifiedCount: js.UndefOr[Int] = js.undefined,
        ExecutionType: js.UndefOr[NonEmptyString] = js.undefined,
        NonCompliantCriticalCount: js.UndefOr[Int] = js.undefined,
        NonCompliantHighCount: js.UndefOr[Int] = js.undefined,
        NonCompliantInformationalCount: js.UndefOr[Int] = js.undefined,
        NonCompliantLowCount: js.UndefOr[Int] = js.undefined,
        NonCompliantMediumCount: js.UndefOr[Int] = js.undefined,
        NonCompliantUnspecifiedCount: js.UndefOr[Int] = js.undefined,
        OverallSeverity: js.UndefOr[NonEmptyString] = js.undefined,
        PatchBaselineId: js.UndefOr[NonEmptyString] = js.undefined,
        PatchGroup: js.UndefOr[NonEmptyString] = js.undefined,
        Status: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsSsmComplianceSummary = {
      val __obj = js.Dynamic.literal()
      ComplianceType.foreach(__v => __obj.updateDynamic("ComplianceType")(__v.asInstanceOf[js.Any]))
      CompliantCriticalCount.foreach(__v => __obj.updateDynamic("CompliantCriticalCount")(__v.asInstanceOf[js.Any]))
      CompliantHighCount.foreach(__v => __obj.updateDynamic("CompliantHighCount")(__v.asInstanceOf[js.Any]))
      CompliantInformationalCount.foreach(__v => __obj.updateDynamic("CompliantInformationalCount")(__v.asInstanceOf[js.Any]))
      CompliantLowCount.foreach(__v => __obj.updateDynamic("CompliantLowCount")(__v.asInstanceOf[js.Any]))
      CompliantMediumCount.foreach(__v => __obj.updateDynamic("CompliantMediumCount")(__v.asInstanceOf[js.Any]))
      CompliantUnspecifiedCount.foreach(__v => __obj.updateDynamic("CompliantUnspecifiedCount")(__v.asInstanceOf[js.Any]))
      ExecutionType.foreach(__v => __obj.updateDynamic("ExecutionType")(__v.asInstanceOf[js.Any]))
      NonCompliantCriticalCount.foreach(__v => __obj.updateDynamic("NonCompliantCriticalCount")(__v.asInstanceOf[js.Any]))
      NonCompliantHighCount.foreach(__v => __obj.updateDynamic("NonCompliantHighCount")(__v.asInstanceOf[js.Any]))
      NonCompliantInformationalCount.foreach(__v => __obj.updateDynamic("NonCompliantInformationalCount")(__v.asInstanceOf[js.Any]))
      NonCompliantLowCount.foreach(__v => __obj.updateDynamic("NonCompliantLowCount")(__v.asInstanceOf[js.Any]))
      NonCompliantMediumCount.foreach(__v => __obj.updateDynamic("NonCompliantMediumCount")(__v.asInstanceOf[js.Any]))
      NonCompliantUnspecifiedCount.foreach(__v => __obj.updateDynamic("NonCompliantUnspecifiedCount")(__v.asInstanceOf[js.Any]))
      OverallSeverity.foreach(__v => __obj.updateDynamic("OverallSeverity")(__v.asInstanceOf[js.Any]))
      PatchBaselineId.foreach(__v => __obj.updateDynamic("PatchBaselineId")(__v.asInstanceOf[js.Any]))
      PatchGroup.foreach(__v => __obj.updateDynamic("PatchGroup")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsSsmComplianceSummary]
    }
  }

  /** Provides details about the compliance for a patch.
    */
  @js.native
  trait AwsSsmPatch extends js.Object {
    var ComplianceSummary: js.UndefOr[AwsSsmComplianceSummary]
  }

  object AwsSsmPatch {
    @inline
    def apply(
        ComplianceSummary: js.UndefOr[AwsSsmComplianceSummary] = js.undefined
    ): AwsSsmPatch = {
      val __obj = js.Dynamic.literal()
      ComplianceSummary.foreach(__v => __obj.updateDynamic("ComplianceSummary")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsSsmPatch]
    }
  }

  /** Provides information about the state of a patch on an instance based on the patch baseline that was used to patch the instance.
    */
  @js.native
  trait AwsSsmPatchComplianceDetails extends js.Object {
    var Patch: js.UndefOr[AwsSsmPatch]
  }

  object AwsSsmPatchComplianceDetails {
    @inline
    def apply(
        Patch: js.UndefOr[AwsSsmPatch] = js.undefined
    ): AwsSsmPatchComplianceDetails = {
      val __obj = js.Dynamic.literal()
      Patch.foreach(__v => __obj.updateDynamic("Patch")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsSsmPatchComplianceDetails]
    }
  }

  /** Details about a rate-based rule for global resources. A rate-based rule provides settings to indicate when to allow, block, or count a request. Rate-based rules include the number of requests that arrive over a specified period of time.
    */
  @js.native
  trait AwsWafRateBasedRuleDetails extends js.Object {
    var MatchPredicates: js.UndefOr[AwsWafRateBasedRuleMatchPredicateList]
    var MetricName: js.UndefOr[NonEmptyString]
    var Name: js.UndefOr[NonEmptyString]
    var RateKey: js.UndefOr[NonEmptyString]
    var RateLimit: js.UndefOr[Double]
    var RuleId: js.UndefOr[NonEmptyString]
  }

  object AwsWafRateBasedRuleDetails {
    @inline
    def apply(
        MatchPredicates: js.UndefOr[AwsWafRateBasedRuleMatchPredicateList] = js.undefined,
        MetricName: js.UndefOr[NonEmptyString] = js.undefined,
        Name: js.UndefOr[NonEmptyString] = js.undefined,
        RateKey: js.UndefOr[NonEmptyString] = js.undefined,
        RateLimit: js.UndefOr[Double] = js.undefined,
        RuleId: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsWafRateBasedRuleDetails = {
      val __obj = js.Dynamic.literal()
      MatchPredicates.foreach(__v => __obj.updateDynamic("MatchPredicates")(__v.asInstanceOf[js.Any]))
      MetricName.foreach(__v => __obj.updateDynamic("MetricName")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      RateKey.foreach(__v => __obj.updateDynamic("RateKey")(__v.asInstanceOf[js.Any]))
      RateLimit.foreach(__v => __obj.updateDynamic("RateLimit")(__v.asInstanceOf[js.Any]))
      RuleId.foreach(__v => __obj.updateDynamic("RuleId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsWafRateBasedRuleDetails]
    }
  }

  /** A match predicate. A predicate might look for characteristics such as specific IP addresses, geographic locations, or sizes.
    */
  @js.native
  trait AwsWafRateBasedRuleMatchPredicate extends js.Object {
    var DataId: js.UndefOr[NonEmptyString]
    var Negated: js.UndefOr[Boolean]
    var Type: js.UndefOr[NonEmptyString]
  }

  object AwsWafRateBasedRuleMatchPredicate {
    @inline
    def apply(
        DataId: js.UndefOr[NonEmptyString] = js.undefined,
        Negated: js.UndefOr[Boolean] = js.undefined,
        Type: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsWafRateBasedRuleMatchPredicate = {
      val __obj = js.Dynamic.literal()
      DataId.foreach(__v => __obj.updateDynamic("DataId")(__v.asInstanceOf[js.Any]))
      Negated.foreach(__v => __obj.updateDynamic("Negated")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsWafRateBasedRuleMatchPredicate]
    }
  }

  /** contains details about a rate-based rule for Regional resources. A rate-based rule provides settings to indicate when to allow, block, or count a request. Rate-based rules include the number of requests that arrive over a specified period of time.
    */
  @js.native
  trait AwsWafRegionalRateBasedRuleDetails extends js.Object {
    var MatchPredicates: js.UndefOr[AwsWafRegionalRateBasedRuleMatchPredicateList]
    var MetricName: js.UndefOr[NonEmptyString]
    var Name: js.UndefOr[NonEmptyString]
    var RateKey: js.UndefOr[NonEmptyString]
    var RateLimit: js.UndefOr[Double]
    var RuleId: js.UndefOr[NonEmptyString]
  }

  object AwsWafRegionalRateBasedRuleDetails {
    @inline
    def apply(
        MatchPredicates: js.UndefOr[AwsWafRegionalRateBasedRuleMatchPredicateList] = js.undefined,
        MetricName: js.UndefOr[NonEmptyString] = js.undefined,
        Name: js.UndefOr[NonEmptyString] = js.undefined,
        RateKey: js.UndefOr[NonEmptyString] = js.undefined,
        RateLimit: js.UndefOr[Double] = js.undefined,
        RuleId: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsWafRegionalRateBasedRuleDetails = {
      val __obj = js.Dynamic.literal()
      MatchPredicates.foreach(__v => __obj.updateDynamic("MatchPredicates")(__v.asInstanceOf[js.Any]))
      MetricName.foreach(__v => __obj.updateDynamic("MetricName")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      RateKey.foreach(__v => __obj.updateDynamic("RateKey")(__v.asInstanceOf[js.Any]))
      RateLimit.foreach(__v => __obj.updateDynamic("RateLimit")(__v.asInstanceOf[js.Any]))
      RuleId.foreach(__v => __obj.updateDynamic("RuleId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsWafRegionalRateBasedRuleDetails]
    }
  }

  /** Details for a match predicate. A predicate might look for characteristics such as specific IP addresses, geographic locations, or sizes.
    */
  @js.native
  trait AwsWafRegionalRateBasedRuleMatchPredicate extends js.Object {
    var DataId: js.UndefOr[NonEmptyString]
    var Negated: js.UndefOr[Boolean]
    var Type: js.UndefOr[NonEmptyString]
  }

  object AwsWafRegionalRateBasedRuleMatchPredicate {
    @inline
    def apply(
        DataId: js.UndefOr[NonEmptyString] = js.undefined,
        Negated: js.UndefOr[Boolean] = js.undefined,
        Type: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsWafRegionalRateBasedRuleMatchPredicate = {
      val __obj = js.Dynamic.literal()
      DataId.foreach(__v => __obj.updateDynamic("DataId")(__v.asInstanceOf[js.Any]))
      Negated.foreach(__v => __obj.updateDynamic("Negated")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsWafRegionalRateBasedRuleMatchPredicate]
    }
  }

  /** Provides information about an WAF Regional rule. This rule identifies the web requests that you want to allow, block, or count.
    */
  @js.native
  trait AwsWafRegionalRuleDetails extends js.Object {
    var MetricName: js.UndefOr[NonEmptyString]
    var Name: js.UndefOr[NonEmptyString]
    var PredicateList: js.UndefOr[AwsWafRegionalRulePredicateList]
    var RuleId: js.UndefOr[NonEmptyString]
  }

  object AwsWafRegionalRuleDetails {
    @inline
    def apply(
        MetricName: js.UndefOr[NonEmptyString] = js.undefined,
        Name: js.UndefOr[NonEmptyString] = js.undefined,
        PredicateList: js.UndefOr[AwsWafRegionalRulePredicateList] = js.undefined,
        RuleId: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsWafRegionalRuleDetails = {
      val __obj = js.Dynamic.literal()
      MetricName.foreach(__v => __obj.updateDynamic("MetricName")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      PredicateList.foreach(__v => __obj.updateDynamic("PredicateList")(__v.asInstanceOf[js.Any]))
      RuleId.foreach(__v => __obj.updateDynamic("RuleId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsWafRegionalRuleDetails]
    }
  }

  /** Provides information about an WAF Regional rule group. The rule group is a collection of rules for inspecting and controlling web requests.
    */
  @js.native
  trait AwsWafRegionalRuleGroupDetails extends js.Object {
    var MetricName: js.UndefOr[NonEmptyString]
    var Name: js.UndefOr[NonEmptyString]
    var RuleGroupId: js.UndefOr[NonEmptyString]
    var Rules: js.UndefOr[AwsWafRegionalRuleGroupRulesList]
  }

  object AwsWafRegionalRuleGroupDetails {
    @inline
    def apply(
        MetricName: js.UndefOr[NonEmptyString] = js.undefined,
        Name: js.UndefOr[NonEmptyString] = js.undefined,
        RuleGroupId: js.UndefOr[NonEmptyString] = js.undefined,
        Rules: js.UndefOr[AwsWafRegionalRuleGroupRulesList] = js.undefined
    ): AwsWafRegionalRuleGroupDetails = {
      val __obj = js.Dynamic.literal()
      MetricName.foreach(__v => __obj.updateDynamic("MetricName")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      RuleGroupId.foreach(__v => __obj.updateDynamic("RuleGroupId")(__v.asInstanceOf[js.Any]))
      Rules.foreach(__v => __obj.updateDynamic("Rules")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsWafRegionalRuleGroupDetails]
    }
  }

  /** Describes the action that WAF should take on a web request when it matches the criteria defined in the rule.
    */
  @js.native
  trait AwsWafRegionalRuleGroupRulesActionDetails extends js.Object {
    var Type: js.UndefOr[NonEmptyString]
  }

  object AwsWafRegionalRuleGroupRulesActionDetails {
    @inline
    def apply(
        Type: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsWafRegionalRuleGroupRulesActionDetails = {
      val __obj = js.Dynamic.literal()
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsWafRegionalRuleGroupRulesActionDetails]
    }
  }

  /** Provides information about the rules attached to a rule group
    */
  @js.native
  trait AwsWafRegionalRuleGroupRulesDetails extends js.Object {
    var Action: js.UndefOr[AwsWafRegionalRuleGroupRulesActionDetails]
    var Priority: js.UndefOr[Int]
    var RuleId: js.UndefOr[NonEmptyString]
    var Type: js.UndefOr[NonEmptyString]
  }

  object AwsWafRegionalRuleGroupRulesDetails {
    @inline
    def apply(
        Action: js.UndefOr[AwsWafRegionalRuleGroupRulesActionDetails] = js.undefined,
        Priority: js.UndefOr[Int] = js.undefined,
        RuleId: js.UndefOr[NonEmptyString] = js.undefined,
        Type: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsWafRegionalRuleGroupRulesDetails = {
      val __obj = js.Dynamic.literal()
      Action.foreach(__v => __obj.updateDynamic("Action")(__v.asInstanceOf[js.Any]))
      Priority.foreach(__v => __obj.updateDynamic("Priority")(__v.asInstanceOf[js.Any]))
      RuleId.foreach(__v => __obj.updateDynamic("RuleId")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsWafRegionalRuleGroupRulesDetails]
    }
  }

  /** Provides details about the <code>ByteMatchSet</code>, <code>IPSet</code>, <code>SqlInjectionMatchSet</code>, <code>XssMatchSet</code>, <code>RegexMatchSet</code>, <code>GeoMatchSet</code>, and <code>SizeConstraintSet</code> objects that you want to add to a rule and, for each object, indicates whether you want to negate the settings.
    */
  @js.native
  trait AwsWafRegionalRulePredicateListDetails extends js.Object {
    var DataId: js.UndefOr[NonEmptyString]
    var Negated: js.UndefOr[Boolean]
    var Type: js.UndefOr[NonEmptyString]
  }

  object AwsWafRegionalRulePredicateListDetails {
    @inline
    def apply(
        DataId: js.UndefOr[NonEmptyString] = js.undefined,
        Negated: js.UndefOr[Boolean] = js.undefined,
        Type: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsWafRegionalRulePredicateListDetails = {
      val __obj = js.Dynamic.literal()
      DataId.foreach(__v => __obj.updateDynamic("DataId")(__v.asInstanceOf[js.Any]))
      Negated.foreach(__v => __obj.updateDynamic("Negated")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsWafRegionalRulePredicateListDetails]
    }
  }

  /** Provides information about the web access control list (web ACL). The web ACL contains the rules that identify the requests that you want to allow, block, or count.
    */
  @js.native
  trait AwsWafRegionalWebAclDetails extends js.Object {
    var DefaultAction: js.UndefOr[NonEmptyString]
    var MetricName: js.UndefOr[NonEmptyString]
    var Name: js.UndefOr[NonEmptyString]
    var RulesList: js.UndefOr[AwsWafRegionalWebAclRulesList]
    var WebAclId: js.UndefOr[NonEmptyString]
  }

  object AwsWafRegionalWebAclDetails {
    @inline
    def apply(
        DefaultAction: js.UndefOr[NonEmptyString] = js.undefined,
        MetricName: js.UndefOr[NonEmptyString] = js.undefined,
        Name: js.UndefOr[NonEmptyString] = js.undefined,
        RulesList: js.UndefOr[AwsWafRegionalWebAclRulesList] = js.undefined,
        WebAclId: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsWafRegionalWebAclDetails = {
      val __obj = js.Dynamic.literal()
      DefaultAction.foreach(__v => __obj.updateDynamic("DefaultAction")(__v.asInstanceOf[js.Any]))
      MetricName.foreach(__v => __obj.updateDynamic("MetricName")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      RulesList.foreach(__v => __obj.updateDynamic("RulesList")(__v.asInstanceOf[js.Any]))
      WebAclId.foreach(__v => __obj.updateDynamic("WebAclId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsWafRegionalWebAclDetails]
    }
  }

  /** The action that WAF takes when a web request matches all conditions in the rule, such as allow, block, or count the request.
    */
  @js.native
  trait AwsWafRegionalWebAclRulesListActionDetails extends js.Object {
    var Type: js.UndefOr[NonEmptyString]
  }

  object AwsWafRegionalWebAclRulesListActionDetails {
    @inline
    def apply(
        Type: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsWafRegionalWebAclRulesListActionDetails = {
      val __obj = js.Dynamic.literal()
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsWafRegionalWebAclRulesListActionDetails]
    }
  }

  /** A combination of <code>ByteMatchSet</code>, <code>IPSet</code>, and/or <code>SqlInjectionMatchSet</code> objects that identify the web requests that you want to allow, block, or count.
    */
  @js.native
  trait AwsWafRegionalWebAclRulesListDetails extends js.Object {
    var Action: js.UndefOr[AwsWafRegionalWebAclRulesListActionDetails]
    var OverrideAction: js.UndefOr[AwsWafRegionalWebAclRulesListOverrideActionDetails]
    var Priority: js.UndefOr[Int]
    var RuleId: js.UndefOr[NonEmptyString]
    var Type: js.UndefOr[NonEmptyString]
  }

  object AwsWafRegionalWebAclRulesListDetails {
    @inline
    def apply(
        Action: js.UndefOr[AwsWafRegionalWebAclRulesListActionDetails] = js.undefined,
        OverrideAction: js.UndefOr[AwsWafRegionalWebAclRulesListOverrideActionDetails] = js.undefined,
        Priority: js.UndefOr[Int] = js.undefined,
        RuleId: js.UndefOr[NonEmptyString] = js.undefined,
        Type: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsWafRegionalWebAclRulesListDetails = {
      val __obj = js.Dynamic.literal()
      Action.foreach(__v => __obj.updateDynamic("Action")(__v.asInstanceOf[js.Any]))
      OverrideAction.foreach(__v => __obj.updateDynamic("OverrideAction")(__v.asInstanceOf[js.Any]))
      Priority.foreach(__v => __obj.updateDynamic("Priority")(__v.asInstanceOf[js.Any]))
      RuleId.foreach(__v => __obj.updateDynamic("RuleId")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsWafRegionalWebAclRulesListDetails]
    }
  }

  /** Provides details about the action to use in the place of the action that results from the rule group evaluation.
    */
  @js.native
  trait AwsWafRegionalWebAclRulesListOverrideActionDetails extends js.Object {
    var Type: js.UndefOr[NonEmptyString]
  }

  object AwsWafRegionalWebAclRulesListOverrideActionDetails {
    @inline
    def apply(
        Type: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsWafRegionalWebAclRulesListOverrideActionDetails = {
      val __obj = js.Dynamic.literal()
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsWafRegionalWebAclRulesListOverrideActionDetails]
    }
  }

  /** Provides information about a WAF rule. This rule specifies the web requests that you want to allow, block, or count.
    */
  @js.native
  trait AwsWafRuleDetails extends js.Object {
    var MetricName: js.UndefOr[NonEmptyString]
    var Name: js.UndefOr[NonEmptyString]
    var PredicateList: js.UndefOr[AwsWafRulePredicateList]
    var RuleId: js.UndefOr[NonEmptyString]
  }

  object AwsWafRuleDetails {
    @inline
    def apply(
        MetricName: js.UndefOr[NonEmptyString] = js.undefined,
        Name: js.UndefOr[NonEmptyString] = js.undefined,
        PredicateList: js.UndefOr[AwsWafRulePredicateList] = js.undefined,
        RuleId: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsWafRuleDetails = {
      val __obj = js.Dynamic.literal()
      MetricName.foreach(__v => __obj.updateDynamic("MetricName")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      PredicateList.foreach(__v => __obj.updateDynamic("PredicateList")(__v.asInstanceOf[js.Any]))
      RuleId.foreach(__v => __obj.updateDynamic("RuleId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsWafRuleDetails]
    }
  }

  /** Provides information about an WAF rule group. A rule group is a collection of rules for inspecting and controlling web requests.
    */
  @js.native
  trait AwsWafRuleGroupDetails extends js.Object {
    var MetricName: js.UndefOr[NonEmptyString]
    var Name: js.UndefOr[NonEmptyString]
    var RuleGroupId: js.UndefOr[NonEmptyString]
    var Rules: js.UndefOr[AwsWafRuleGroupRulesList]
  }

  object AwsWafRuleGroupDetails {
    @inline
    def apply(
        MetricName: js.UndefOr[NonEmptyString] = js.undefined,
        Name: js.UndefOr[NonEmptyString] = js.undefined,
        RuleGroupId: js.UndefOr[NonEmptyString] = js.undefined,
        Rules: js.UndefOr[AwsWafRuleGroupRulesList] = js.undefined
    ): AwsWafRuleGroupDetails = {
      val __obj = js.Dynamic.literal()
      MetricName.foreach(__v => __obj.updateDynamic("MetricName")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      RuleGroupId.foreach(__v => __obj.updateDynamic("RuleGroupId")(__v.asInstanceOf[js.Any]))
      Rules.foreach(__v => __obj.updateDynamic("Rules")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsWafRuleGroupDetails]
    }
  }

  /** Provides information about what action WAF should take on a web request when it matches the criteria defined in the rule.
    */
  @js.native
  trait AwsWafRuleGroupRulesActionDetails extends js.Object {
    var Type: js.UndefOr[NonEmptyString]
  }

  object AwsWafRuleGroupRulesActionDetails {
    @inline
    def apply(
        Type: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsWafRuleGroupRulesActionDetails = {
      val __obj = js.Dynamic.literal()
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsWafRuleGroupRulesActionDetails]
    }
  }

  /** Provides information about the rules attached to the rule group. These rules identify the web requests that you want to allow, block, or count.
    */
  @js.native
  trait AwsWafRuleGroupRulesDetails extends js.Object {
    var Action: js.UndefOr[AwsWafRuleGroupRulesActionDetails]
    var Priority: js.UndefOr[Int]
    var RuleId: js.UndefOr[NonEmptyString]
    var Type: js.UndefOr[NonEmptyString]
  }

  object AwsWafRuleGroupRulesDetails {
    @inline
    def apply(
        Action: js.UndefOr[AwsWafRuleGroupRulesActionDetails] = js.undefined,
        Priority: js.UndefOr[Int] = js.undefined,
        RuleId: js.UndefOr[NonEmptyString] = js.undefined,
        Type: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsWafRuleGroupRulesDetails = {
      val __obj = js.Dynamic.literal()
      Action.foreach(__v => __obj.updateDynamic("Action")(__v.asInstanceOf[js.Any]))
      Priority.foreach(__v => __obj.updateDynamic("Priority")(__v.asInstanceOf[js.Any]))
      RuleId.foreach(__v => __obj.updateDynamic("RuleId")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsWafRuleGroupRulesDetails]
    }
  }

  /** Provides details about the <code>ByteMatchSet</code>, <code>IPSet</code>, <code>SqlInjectionMatchSet</code>, <code>XssMatchSet</code>, <code>RegexMatchSet</code>, <code>GeoMatchSet</code>, and <code>SizeConstraintSet</code> objects that you want to add to a rule and, for each object, indicates whether you want to negate the settings.
    */
  @js.native
  trait AwsWafRulePredicateListDetails extends js.Object {
    var DataId: js.UndefOr[NonEmptyString]
    var Negated: js.UndefOr[Boolean]
    var Type: js.UndefOr[NonEmptyString]
  }

  object AwsWafRulePredicateListDetails {
    @inline
    def apply(
        DataId: js.UndefOr[NonEmptyString] = js.undefined,
        Negated: js.UndefOr[Boolean] = js.undefined,
        Type: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsWafRulePredicateListDetails = {
      val __obj = js.Dynamic.literal()
      DataId.foreach(__v => __obj.updateDynamic("DataId")(__v.asInstanceOf[js.Any]))
      Negated.foreach(__v => __obj.updateDynamic("Negated")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsWafRulePredicateListDetails]
    }
  }

  /** Provides information about an WAF web access control list (web ACL).
    */
  @js.native
  trait AwsWafWebAclDetails extends js.Object {
    var DefaultAction: js.UndefOr[NonEmptyString]
    var Name: js.UndefOr[NonEmptyString]
    var Rules: js.UndefOr[AwsWafWebAclRuleList]
    var WebAclId: js.UndefOr[NonEmptyString]
  }

  object AwsWafWebAclDetails {
    @inline
    def apply(
        DefaultAction: js.UndefOr[NonEmptyString] = js.undefined,
        Name: js.UndefOr[NonEmptyString] = js.undefined,
        Rules: js.UndefOr[AwsWafWebAclRuleList] = js.undefined,
        WebAclId: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsWafWebAclDetails = {
      val __obj = js.Dynamic.literal()
      DefaultAction.foreach(__v => __obj.updateDynamic("DefaultAction")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Rules.foreach(__v => __obj.updateDynamic("Rules")(__v.asInstanceOf[js.Any]))
      WebAclId.foreach(__v => __obj.updateDynamic("WebAclId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsWafWebAclDetails]
    }
  }

  /** Details for a rule in an WAF web ACL.
    */
  @js.native
  trait AwsWafWebAclRule extends js.Object {
    var Action: js.UndefOr[WafAction]
    var ExcludedRules: js.UndefOr[WafExcludedRuleList]
    var OverrideAction: js.UndefOr[WafOverrideAction]
    var Priority: js.UndefOr[Int]
    var RuleId: js.UndefOr[NonEmptyString]
    var Type: js.UndefOr[NonEmptyString]
  }

  object AwsWafWebAclRule {
    @inline
    def apply(
        Action: js.UndefOr[WafAction] = js.undefined,
        ExcludedRules: js.UndefOr[WafExcludedRuleList] = js.undefined,
        OverrideAction: js.UndefOr[WafOverrideAction] = js.undefined,
        Priority: js.UndefOr[Int] = js.undefined,
        RuleId: js.UndefOr[NonEmptyString] = js.undefined,
        Type: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsWafWebAclRule = {
      val __obj = js.Dynamic.literal()
      Action.foreach(__v => __obj.updateDynamic("Action")(__v.asInstanceOf[js.Any]))
      ExcludedRules.foreach(__v => __obj.updateDynamic("ExcludedRules")(__v.asInstanceOf[js.Any]))
      OverrideAction.foreach(__v => __obj.updateDynamic("OverrideAction")(__v.asInstanceOf[js.Any]))
      Priority.foreach(__v => __obj.updateDynamic("Priority")(__v.asInstanceOf[js.Any]))
      RuleId.foreach(__v => __obj.updateDynamic("RuleId")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsWafWebAclRule]
    }
  }

  /** Information about the encryption configuration for X-Ray.
    */
  @js.native
  trait AwsXrayEncryptionConfigDetails extends js.Object {
    var KeyId: js.UndefOr[NonEmptyString]
    var Status: js.UndefOr[NonEmptyString]
    var Type: js.UndefOr[NonEmptyString]
  }

  object AwsXrayEncryptionConfigDetails {
    @inline
    def apply(
        KeyId: js.UndefOr[NonEmptyString] = js.undefined,
        Status: js.UndefOr[NonEmptyString] = js.undefined,
        Type: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsXrayEncryptionConfigDetails = {
      val __obj = js.Dynamic.literal()
      KeyId.foreach(__v => __obj.updateDynamic("KeyId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsXrayEncryptionConfigDetails]
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
    var Findings: BatchImportFindingsRequestFindingList
  }

  object BatchImportFindingsRequest {
    @inline
    def apply(
        Findings: BatchImportFindingsRequestFindingList
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
        "FailedCount" -> FailedCount.asInstanceOf[js.Any],
        "SuccessCount" -> SuccessCount.asInstanceOf[js.Any]
      )

      FailedFindings.foreach(__v => __obj.updateDynamic("FailedFindings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchImportFindingsResponse]
    }
  }

  @js.native
  trait BatchUpdateFindingsRequest extends js.Object {
    var FindingIdentifiers: AwsSecurityFindingIdentifierList
    var Confidence: js.UndefOr[RatioScale]
    var Criticality: js.UndefOr[RatioScale]
    var Note: js.UndefOr[NoteUpdate]
    var RelatedFindings: js.UndefOr[RelatedFindingList]
    var Severity: js.UndefOr[SeverityUpdate]
    var Types: js.UndefOr[TypeList]
    var UserDefinedFields: js.UndefOr[FieldMap]
    var VerificationState: js.UndefOr[VerificationState]
    var Workflow: js.UndefOr[WorkflowUpdate]
  }

  object BatchUpdateFindingsRequest {
    @inline
    def apply(
        FindingIdentifiers: AwsSecurityFindingIdentifierList,
        Confidence: js.UndefOr[RatioScale] = js.undefined,
        Criticality: js.UndefOr[RatioScale] = js.undefined,
        Note: js.UndefOr[NoteUpdate] = js.undefined,
        RelatedFindings: js.UndefOr[RelatedFindingList] = js.undefined,
        Severity: js.UndefOr[SeverityUpdate] = js.undefined,
        Types: js.UndefOr[TypeList] = js.undefined,
        UserDefinedFields: js.UndefOr[FieldMap] = js.undefined,
        VerificationState: js.UndefOr[VerificationState] = js.undefined,
        Workflow: js.UndefOr[WorkflowUpdate] = js.undefined
    ): BatchUpdateFindingsRequest = {
      val __obj = js.Dynamic.literal(
        "FindingIdentifiers" -> FindingIdentifiers.asInstanceOf[js.Any]
      )

      Confidence.foreach(__v => __obj.updateDynamic("Confidence")(__v.asInstanceOf[js.Any]))
      Criticality.foreach(__v => __obj.updateDynamic("Criticality")(__v.asInstanceOf[js.Any]))
      Note.foreach(__v => __obj.updateDynamic("Note")(__v.asInstanceOf[js.Any]))
      RelatedFindings.foreach(__v => __obj.updateDynamic("RelatedFindings")(__v.asInstanceOf[js.Any]))
      Severity.foreach(__v => __obj.updateDynamic("Severity")(__v.asInstanceOf[js.Any]))
      Types.foreach(__v => __obj.updateDynamic("Types")(__v.asInstanceOf[js.Any]))
      UserDefinedFields.foreach(__v => __obj.updateDynamic("UserDefinedFields")(__v.asInstanceOf[js.Any]))
      VerificationState.foreach(__v => __obj.updateDynamic("VerificationState")(__v.asInstanceOf[js.Any]))
      Workflow.foreach(__v => __obj.updateDynamic("Workflow")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchUpdateFindingsRequest]
    }
  }

  @js.native
  trait BatchUpdateFindingsResponse extends js.Object {
    var ProcessedFindings: AwsSecurityFindingIdentifierList
    var UnprocessedFindings: BatchUpdateFindingsUnprocessedFindingsList
  }

  object BatchUpdateFindingsResponse {
    @inline
    def apply(
        ProcessedFindings: AwsSecurityFindingIdentifierList,
        UnprocessedFindings: BatchUpdateFindingsUnprocessedFindingsList
    ): BatchUpdateFindingsResponse = {
      val __obj = js.Dynamic.literal(
        "ProcessedFindings" -> ProcessedFindings.asInstanceOf[js.Any],
        "UnprocessedFindings" -> UnprocessedFindings.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchUpdateFindingsResponse]
    }
  }

  /** A finding from a <code>BatchUpdateFindings</code> request that Security Hub was unable to update.
    */
  @js.native
  trait BatchUpdateFindingsUnprocessedFinding extends js.Object {
    var ErrorCode: NonEmptyString
    var ErrorMessage: NonEmptyString
    var FindingIdentifier: AwsSecurityFindingIdentifier
  }

  object BatchUpdateFindingsUnprocessedFinding {
    @inline
    def apply(
        ErrorCode: NonEmptyString,
        ErrorMessage: NonEmptyString,
        FindingIdentifier: AwsSecurityFindingIdentifier
    ): BatchUpdateFindingsUnprocessedFinding = {
      val __obj = js.Dynamic.literal(
        "ErrorCode" -> ErrorCode.asInstanceOf[js.Any],
        "ErrorMessage" -> ErrorMessage.asInstanceOf[js.Any],
        "FindingIdentifier" -> FindingIdentifier.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchUpdateFindingsUnprocessedFinding]
    }
  }

  /** Boolean filter for querying findings.
    */
  @js.native
  trait BooleanFilter extends js.Object {
    var Value: js.UndefOr[Boolean]
  }

  object BooleanFilter {
    @inline
    def apply(
        Value: js.UndefOr[Boolean] = js.undefined
    ): BooleanFilter = {
      val __obj = js.Dynamic.literal()
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BooleanFilter]
    }
  }

  /** An occurrence of sensitive data detected in a Microsoft Excel workbook, comma-separated value (CSV) file, or tab-separated value (TSV) file.
    */
  @js.native
  trait Cell extends js.Object {
    var CellReference: js.UndefOr[NonEmptyString]
    var Column: js.UndefOr[Double]
    var ColumnName: js.UndefOr[NonEmptyString]
    var Row: js.UndefOr[Double]
  }

  object Cell {
    @inline
    def apply(
        CellReference: js.UndefOr[NonEmptyString] = js.undefined,
        Column: js.UndefOr[Double] = js.undefined,
        ColumnName: js.UndefOr[NonEmptyString] = js.undefined,
        Row: js.UndefOr[Double] = js.undefined
    ): Cell = {
      val __obj = js.Dynamic.literal()
      CellReference.foreach(__v => __obj.updateDynamic("CellReference")(__v.asInstanceOf[js.Any]))
      Column.foreach(__v => __obj.updateDynamic("Column")(__v.asInstanceOf[js.Any]))
      ColumnName.foreach(__v => __obj.updateDynamic("ColumnName")(__v.asInstanceOf[js.Any]))
      Row.foreach(__v => __obj.updateDynamic("Row")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Cell]
    }
  }

  /** An IPv4 CIDR block association.
    */
  @js.native
  trait CidrBlockAssociation extends js.Object {
    var AssociationId: js.UndefOr[NonEmptyString]
    var CidrBlock: js.UndefOr[NonEmptyString]
    var CidrBlockState: js.UndefOr[NonEmptyString]
  }

  object CidrBlockAssociation {
    @inline
    def apply(
        AssociationId: js.UndefOr[NonEmptyString] = js.undefined,
        CidrBlock: js.UndefOr[NonEmptyString] = js.undefined,
        CidrBlockState: js.UndefOr[NonEmptyString] = js.undefined
    ): CidrBlockAssociation = {
      val __obj = js.Dynamic.literal()
      AssociationId.foreach(__v => __obj.updateDynamic("AssociationId")(__v.asInstanceOf[js.Any]))
      CidrBlock.foreach(__v => __obj.updateDynamic("CidrBlock")(__v.asInstanceOf[js.Any]))
      CidrBlockState.foreach(__v => __obj.updateDynamic("CidrBlockState")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CidrBlockAssociation]
    }
  }

  /** Information about a city.
    */
  @js.native
  trait City extends js.Object {
    var CityName: js.UndefOr[NonEmptyString]
  }

  object City {
    @inline
    def apply(
        CityName: js.UndefOr[NonEmptyString] = js.undefined
    ): City = {
      val __obj = js.Dynamic.literal()
      CityName.foreach(__v => __obj.updateDynamic("CityName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[City]
    }
  }

  /** Details about the sensitive data that was detected on the resource.
    */
  @js.native
  trait ClassificationResult extends js.Object {
    var AdditionalOccurrences: js.UndefOr[Boolean]
    var CustomDataIdentifiers: js.UndefOr[CustomDataIdentifiersResult]
    var MimeType: js.UndefOr[NonEmptyString]
    var SensitiveData: js.UndefOr[SensitiveDataResultList]
    var SizeClassified: js.UndefOr[Double]
    var Status: js.UndefOr[ClassificationStatus]
  }

  object ClassificationResult {
    @inline
    def apply(
        AdditionalOccurrences: js.UndefOr[Boolean] = js.undefined,
        CustomDataIdentifiers: js.UndefOr[CustomDataIdentifiersResult] = js.undefined,
        MimeType: js.UndefOr[NonEmptyString] = js.undefined,
        SensitiveData: js.UndefOr[SensitiveDataResultList] = js.undefined,
        SizeClassified: js.UndefOr[Double] = js.undefined,
        Status: js.UndefOr[ClassificationStatus] = js.undefined
    ): ClassificationResult = {
      val __obj = js.Dynamic.literal()
      AdditionalOccurrences.foreach(__v => __obj.updateDynamic("AdditionalOccurrences")(__v.asInstanceOf[js.Any]))
      CustomDataIdentifiers.foreach(__v => __obj.updateDynamic("CustomDataIdentifiers")(__v.asInstanceOf[js.Any]))
      MimeType.foreach(__v => __obj.updateDynamic("MimeType")(__v.asInstanceOf[js.Any]))
      SensitiveData.foreach(__v => __obj.updateDynamic("SensitiveData")(__v.asInstanceOf[js.Any]))
      SizeClassified.foreach(__v => __obj.updateDynamic("SizeClassified")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClassificationResult]
    }
  }

  /** Provides details about the current status of the sensitive data detection.
    */
  @js.native
  trait ClassificationStatus extends js.Object {
    var Code: js.UndefOr[NonEmptyString]
    var Reason: js.UndefOr[NonEmptyString]
  }

  object ClassificationStatus {
    @inline
    def apply(
        Code: js.UndefOr[NonEmptyString] = js.undefined,
        Reason: js.UndefOr[NonEmptyString] = js.undefined
    ): ClassificationStatus = {
      val __obj = js.Dynamic.literal()
      Code.foreach(__v => __obj.updateDynamic("Code")(__v.asInstanceOf[js.Any]))
      Reason.foreach(__v => __obj.updateDynamic("Reason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClassificationStatus]
    }
  }

  /** Contains finding details that are specific to control-based findings. Only returned for findings generated from controls.
    */
  @js.native
  trait Compliance extends js.Object {
    var RelatedRequirements: js.UndefOr[RelatedRequirementsList]
    var Status: js.UndefOr[ComplianceStatus]
    var StatusReasons: js.UndefOr[StatusReasonsList]
  }

  object Compliance {
    @inline
    def apply(
        RelatedRequirements: js.UndefOr[RelatedRequirementsList] = js.undefined,
        Status: js.UndefOr[ComplianceStatus] = js.undefined,
        StatusReasons: js.UndefOr[StatusReasonsList] = js.undefined
    ): Compliance = {
      val __obj = js.Dynamic.literal()
      RelatedRequirements.foreach(__v => __obj.updateDynamic("RelatedRequirements")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusReasons.foreach(__v => __obj.updateDynamic("StatusReasons")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Compliance]
    }
  }

  /** Container details related to a finding.
    */
  @js.native
  trait ContainerDetails extends js.Object {
    var ContainerRuntime: js.UndefOr[NonEmptyString]
    var ImageId: js.UndefOr[NonEmptyString]
    var ImageName: js.UndefOr[NonEmptyString]
    var LaunchedAt: js.UndefOr[NonEmptyString]
    var Name: js.UndefOr[NonEmptyString]
    var Privileged: js.UndefOr[Boolean]
    var VolumeMounts: js.UndefOr[VolumeMountList]
  }

  object ContainerDetails {
    @inline
    def apply(
        ContainerRuntime: js.UndefOr[NonEmptyString] = js.undefined,
        ImageId: js.UndefOr[NonEmptyString] = js.undefined,
        ImageName: js.UndefOr[NonEmptyString] = js.undefined,
        LaunchedAt: js.UndefOr[NonEmptyString] = js.undefined,
        Name: js.UndefOr[NonEmptyString] = js.undefined,
        Privileged: js.UndefOr[Boolean] = js.undefined,
        VolumeMounts: js.UndefOr[VolumeMountList] = js.undefined
    ): ContainerDetails = {
      val __obj = js.Dynamic.literal()
      ContainerRuntime.foreach(__v => __obj.updateDynamic("ContainerRuntime")(__v.asInstanceOf[js.Any]))
      ImageId.foreach(__v => __obj.updateDynamic("ImageId")(__v.asInstanceOf[js.Any]))
      ImageName.foreach(__v => __obj.updateDynamic("ImageName")(__v.asInstanceOf[js.Any]))
      LaunchedAt.foreach(__v => __obj.updateDynamic("LaunchedAt")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Privileged.foreach(__v => __obj.updateDynamic("Privileged")(__v.asInstanceOf[js.Any]))
      VolumeMounts.foreach(__v => __obj.updateDynamic("VolumeMounts")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ContainerDetails]
    }
  }

  /** Information about a country.
    */
  @js.native
  trait Country extends js.Object {
    var CountryCode: js.UndefOr[NonEmptyString]
    var CountryName: js.UndefOr[NonEmptyString]
  }

  object Country {
    @inline
    def apply(
        CountryCode: js.UndefOr[NonEmptyString] = js.undefined,
        CountryName: js.UndefOr[NonEmptyString] = js.undefined
    ): Country = {
      val __obj = js.Dynamic.literal()
      CountryCode.foreach(__v => __obj.updateDynamic("CountryCode")(__v.asInstanceOf[js.Any]))
      CountryName.foreach(__v => __obj.updateDynamic("CountryName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Country]
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
        "Id" -> Id.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
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
  trait CreateFindingAggregatorRequest extends js.Object {
    var RegionLinkingMode: NonEmptyString
    var Regions: js.UndefOr[StringList]
  }

  object CreateFindingAggregatorRequest {
    @inline
    def apply(
        RegionLinkingMode: NonEmptyString,
        Regions: js.UndefOr[StringList] = js.undefined
    ): CreateFindingAggregatorRequest = {
      val __obj = js.Dynamic.literal(
        "RegionLinkingMode" -> RegionLinkingMode.asInstanceOf[js.Any]
      )

      Regions.foreach(__v => __obj.updateDynamic("Regions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFindingAggregatorRequest]
    }
  }

  @js.native
  trait CreateFindingAggregatorResponse extends js.Object {
    var FindingAggregationRegion: js.UndefOr[NonEmptyString]
    var FindingAggregatorArn: js.UndefOr[NonEmptyString]
    var RegionLinkingMode: js.UndefOr[NonEmptyString]
    var Regions: js.UndefOr[StringList]
  }

  object CreateFindingAggregatorResponse {
    @inline
    def apply(
        FindingAggregationRegion: js.UndefOr[NonEmptyString] = js.undefined,
        FindingAggregatorArn: js.UndefOr[NonEmptyString] = js.undefined,
        RegionLinkingMode: js.UndefOr[NonEmptyString] = js.undefined,
        Regions: js.UndefOr[StringList] = js.undefined
    ): CreateFindingAggregatorResponse = {
      val __obj = js.Dynamic.literal()
      FindingAggregationRegion.foreach(__v => __obj.updateDynamic("FindingAggregationRegion")(__v.asInstanceOf[js.Any]))
      FindingAggregatorArn.foreach(__v => __obj.updateDynamic("FindingAggregatorArn")(__v.asInstanceOf[js.Any]))
      RegionLinkingMode.foreach(__v => __obj.updateDynamic("RegionLinkingMode")(__v.asInstanceOf[js.Any]))
      Regions.foreach(__v => __obj.updateDynamic("Regions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFindingAggregatorResponse]
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
        "Filters" -> Filters.asInstanceOf[js.Any],
        "GroupByAttribute" -> GroupByAttribute.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
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
    var AccountDetails: AccountDetailsList
  }

  object CreateMembersRequest {
    @inline
    def apply(
        AccountDetails: AccountDetailsList
    ): CreateMembersRequest = {
      val __obj = js.Dynamic.literal(
        "AccountDetails" -> AccountDetails.asInstanceOf[js.Any]
      )
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

  /** The list of detected instances of sensitive data.
    */
  @js.native
  trait CustomDataIdentifiersDetections extends js.Object {
    var Arn: js.UndefOr[NonEmptyString]
    var Count: js.UndefOr[Double]
    var Name: js.UndefOr[NonEmptyString]
    var Occurrences: js.UndefOr[Occurrences]
  }

  object CustomDataIdentifiersDetections {
    @inline
    def apply(
        Arn: js.UndefOr[NonEmptyString] = js.undefined,
        Count: js.UndefOr[Double] = js.undefined,
        Name: js.UndefOr[NonEmptyString] = js.undefined,
        Occurrences: js.UndefOr[Occurrences] = js.undefined
    ): CustomDataIdentifiersDetections = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Count.foreach(__v => __obj.updateDynamic("Count")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Occurrences.foreach(__v => __obj.updateDynamic("Occurrences")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CustomDataIdentifiersDetections]
    }
  }

  /** Contains an instance of sensitive data that was detected by a customer-defined identifier.
    */
  @js.native
  trait CustomDataIdentifiersResult extends js.Object {
    var Detections: js.UndefOr[CustomDataIdentifiersDetectionsList]
    var TotalCount: js.UndefOr[Double]
  }

  object CustomDataIdentifiersResult {
    @inline
    def apply(
        Detections: js.UndefOr[CustomDataIdentifiersDetectionsList] = js.undefined,
        TotalCount: js.UndefOr[Double] = js.undefined
    ): CustomDataIdentifiersResult = {
      val __obj = js.Dynamic.literal()
      Detections.foreach(__v => __obj.updateDynamic("Detections")(__v.asInstanceOf[js.Any]))
      TotalCount.foreach(__v => __obj.updateDynamic("TotalCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CustomDataIdentifiersResult]
    }
  }

  /** CVSS scores from the advisory related to the vulnerability.
    */
  @js.native
  trait Cvss extends js.Object {
    var Adjustments: js.UndefOr[AdjustmentList]
    var BaseScore: js.UndefOr[Double]
    var BaseVector: js.UndefOr[NonEmptyString]
    var Source: js.UndefOr[NonEmptyString]
    var Version: js.UndefOr[NonEmptyString]
  }

  object Cvss {
    @inline
    def apply(
        Adjustments: js.UndefOr[AdjustmentList] = js.undefined,
        BaseScore: js.UndefOr[Double] = js.undefined,
        BaseVector: js.UndefOr[NonEmptyString] = js.undefined,
        Source: js.UndefOr[NonEmptyString] = js.undefined,
        Version: js.UndefOr[NonEmptyString] = js.undefined
    ): Cvss = {
      val __obj = js.Dynamic.literal()
      Adjustments.foreach(__v => __obj.updateDynamic("Adjustments")(__v.asInstanceOf[js.Any]))
      BaseScore.foreach(__v => __obj.updateDynamic("BaseScore")(__v.asInstanceOf[js.Any]))
      BaseVector.foreach(__v => __obj.updateDynamic("BaseVector")(__v.asInstanceOf[js.Any]))
      Source.foreach(__v => __obj.updateDynamic("Source")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Cvss]
    }
  }

  /** Provides details about sensitive data that was detected on a resource.
    */
  @js.native
  trait DataClassificationDetails extends js.Object {
    var DetailedResultsLocation: js.UndefOr[NonEmptyString]
    var Result: js.UndefOr[ClassificationResult]
  }

  object DataClassificationDetails {
    @inline
    def apply(
        DetailedResultsLocation: js.UndefOr[NonEmptyString] = js.undefined,
        Result: js.UndefOr[ClassificationResult] = js.undefined
    ): DataClassificationDetails = {
      val __obj = js.Dynamic.literal()
      DetailedResultsLocation.foreach(__v => __obj.updateDynamic("DetailedResultsLocation")(__v.asInstanceOf[js.Any]))
      Result.foreach(__v => __obj.updateDynamic("Result")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataClassificationDetails]
    }
  }

  /** A date filter for querying findings.
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

  /** A date range for the date filter.
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
  trait DeleteFindingAggregatorRequest extends js.Object {
    var FindingAggregatorArn: NonEmptyString
  }

  object DeleteFindingAggregatorRequest {
    @inline
    def apply(
        FindingAggregatorArn: NonEmptyString
    ): DeleteFindingAggregatorRequest = {
      val __obj = js.Dynamic.literal(
        "FindingAggregatorArn" -> FindingAggregatorArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteFindingAggregatorRequest]
    }
  }

  @js.native
  trait DeleteFindingAggregatorResponse extends js.Object

  object DeleteFindingAggregatorResponse {
    @inline
    def apply(): DeleteFindingAggregatorResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteFindingAggregatorResponse]
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
    var AccountIds: AccountIdList
  }

  object DeleteMembersRequest {
    @inline
    def apply(
        AccountIds: AccountIdList
    ): DeleteMembersRequest = {
      val __obj = js.Dynamic.literal(
        "AccountIds" -> AccountIds.asInstanceOf[js.Any]
      )
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
    var AutoEnableControls: js.UndefOr[Boolean]
    var HubArn: js.UndefOr[NonEmptyString]
    var SubscribedAt: js.UndefOr[NonEmptyString]
  }

  object DescribeHubResponse {
    @inline
    def apply(
        AutoEnableControls: js.UndefOr[Boolean] = js.undefined,
        HubArn: js.UndefOr[NonEmptyString] = js.undefined,
        SubscribedAt: js.UndefOr[NonEmptyString] = js.undefined
    ): DescribeHubResponse = {
      val __obj = js.Dynamic.literal()
      AutoEnableControls.foreach(__v => __obj.updateDynamic("AutoEnableControls")(__v.asInstanceOf[js.Any]))
      HubArn.foreach(__v => __obj.updateDynamic("HubArn")(__v.asInstanceOf[js.Any]))
      SubscribedAt.foreach(__v => __obj.updateDynamic("SubscribedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeHubResponse]
    }
  }

  @js.native
  trait DescribeOrganizationConfigurationRequest extends js.Object

  object DescribeOrganizationConfigurationRequest {
    @inline
    def apply(): DescribeOrganizationConfigurationRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DescribeOrganizationConfigurationRequest]
    }
  }

  @js.native
  trait DescribeOrganizationConfigurationResponse extends js.Object {
    var AutoEnable: js.UndefOr[Boolean]
    var AutoEnableStandards: js.UndefOr[AutoEnableStandards]
    var MemberAccountLimitReached: js.UndefOr[Boolean]
  }

  object DescribeOrganizationConfigurationResponse {
    @inline
    def apply(
        AutoEnable: js.UndefOr[Boolean] = js.undefined,
        AutoEnableStandards: js.UndefOr[AutoEnableStandards] = js.undefined,
        MemberAccountLimitReached: js.UndefOr[Boolean] = js.undefined
    ): DescribeOrganizationConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      AutoEnable.foreach(__v => __obj.updateDynamic("AutoEnable")(__v.asInstanceOf[js.Any]))
      AutoEnableStandards.foreach(__v => __obj.updateDynamic("AutoEnableStandards")(__v.asInstanceOf[js.Any]))
      MemberAccountLimitReached.foreach(__v => __obj.updateDynamic("MemberAccountLimitReached")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeOrganizationConfigurationResponse]
    }
  }

  @js.native
  trait DescribeProductsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var ProductArn: js.UndefOr[NonEmptyString]
  }

  object DescribeProductsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ProductArn: js.UndefOr[NonEmptyString] = js.undefined
    ): DescribeProductsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ProductArn.foreach(__v => __obj.updateDynamic("ProductArn")(__v.asInstanceOf[js.Any]))
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
  trait DescribeStandardsControlsRequest extends js.Object {
    var StandardsSubscriptionArn: NonEmptyString
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeStandardsControlsRequest {
    @inline
    def apply(
        StandardsSubscriptionArn: NonEmptyString,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeStandardsControlsRequest = {
      val __obj = js.Dynamic.literal(
        "StandardsSubscriptionArn" -> StandardsSubscriptionArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeStandardsControlsRequest]
    }
  }

  @js.native
  trait DescribeStandardsControlsResponse extends js.Object {
    var Controls: js.UndefOr[StandardsControls]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeStandardsControlsResponse {
    @inline
    def apply(
        Controls: js.UndefOr[StandardsControls] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeStandardsControlsResponse = {
      val __obj = js.Dynamic.literal()
      Controls.foreach(__v => __obj.updateDynamic("Controls")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeStandardsControlsResponse]
    }
  }

  @js.native
  trait DescribeStandardsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeStandardsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeStandardsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeStandardsRequest]
    }
  }

  @js.native
  trait DescribeStandardsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Standards: js.UndefOr[Standards]
  }

  object DescribeStandardsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Standards: js.UndefOr[Standards] = js.undefined
    ): DescribeStandardsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Standards.foreach(__v => __obj.updateDynamic("Standards")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeStandardsResponse]
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
  trait DisableImportFindingsForProductResponse extends js.Object

  object DisableImportFindingsForProductResponse {
    @inline
    def apply(): DisableImportFindingsForProductResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisableImportFindingsForProductResponse]
    }
  }

  @js.native
  trait DisableOrganizationAdminAccountRequest extends js.Object {
    var AdminAccountId: NonEmptyString
  }

  object DisableOrganizationAdminAccountRequest {
    @inline
    def apply(
        AdminAccountId: NonEmptyString
    ): DisableOrganizationAdminAccountRequest = {
      val __obj = js.Dynamic.literal(
        "AdminAccountId" -> AdminAccountId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisableOrganizationAdminAccountRequest]
    }
  }

  @js.native
  trait DisableOrganizationAdminAccountResponse extends js.Object

  object DisableOrganizationAdminAccountResponse {
    @inline
    def apply(): DisableOrganizationAdminAccountResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisableOrganizationAdminAccountResponse]
    }
  }

  @js.native
  trait DisableSecurityHubRequest extends js.Object

  object DisableSecurityHubRequest {
    @inline
    def apply(): DisableSecurityHubRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisableSecurityHubRequest]
    }
  }

  @js.native
  trait DisableSecurityHubResponse extends js.Object

  object DisableSecurityHubResponse {
    @inline
    def apply(): DisableSecurityHubResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisableSecurityHubResponse]
    }
  }

  @js.native
  trait DisassociateFromAdministratorAccountRequest extends js.Object

  object DisassociateFromAdministratorAccountRequest {
    @inline
    def apply(): DisassociateFromAdministratorAccountRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisassociateFromAdministratorAccountRequest]
    }
  }

  @js.native
  trait DisassociateFromAdministratorAccountResponse extends js.Object

  object DisassociateFromAdministratorAccountResponse {
    @inline
    def apply(): DisassociateFromAdministratorAccountResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisassociateFromAdministratorAccountResponse]
    }
  }

  @js.native
  trait DisassociateFromMasterAccountRequest extends js.Object

  object DisassociateFromMasterAccountRequest {
    @inline
    def apply(): DisassociateFromMasterAccountRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisassociateFromMasterAccountRequest]
    }
  }

  @js.native
  trait DisassociateFromMasterAccountResponse extends js.Object

  object DisassociateFromMasterAccountResponse {
    @inline
    def apply(): DisassociateFromMasterAccountResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisassociateFromMasterAccountResponse]
    }
  }

  @js.native
  trait DisassociateMembersRequest extends js.Object {
    var AccountIds: AccountIdList
  }

  object DisassociateMembersRequest {
    @inline
    def apply(
        AccountIds: AccountIdList
    ): DisassociateMembersRequest = {
      val __obj = js.Dynamic.literal(
        "AccountIds" -> AccountIds.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociateMembersRequest]
    }
  }

  @js.native
  trait DisassociateMembersResponse extends js.Object

  object DisassociateMembersResponse {
    @inline
    def apply(): DisassociateMembersResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisassociateMembersResponse]
    }
  }

  /** Provided if <code>ActionType</code> is <code>DNS_REQUEST</code>. It provides details about the DNS request that was detected.
    */
  @js.native
  trait DnsRequestAction extends js.Object {
    var Blocked: js.UndefOr[Boolean]
    var Domain: js.UndefOr[NonEmptyString]
    var Protocol: js.UndefOr[NonEmptyString]
  }

  object DnsRequestAction {
    @inline
    def apply(
        Blocked: js.UndefOr[Boolean] = js.undefined,
        Domain: js.UndefOr[NonEmptyString] = js.undefined,
        Protocol: js.UndefOr[NonEmptyString] = js.undefined
    ): DnsRequestAction = {
      val __obj = js.Dynamic.literal()
      Blocked.foreach(__v => __obj.updateDynamic("Blocked")(__v.asInstanceOf[js.Any]))
      Domain.foreach(__v => __obj.updateDynamic("Domain")(__v.asInstanceOf[js.Any]))
      Protocol.foreach(__v => __obj.updateDynamic("Protocol")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DnsRequestAction]
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
  trait EnableOrganizationAdminAccountRequest extends js.Object {
    var AdminAccountId: NonEmptyString
  }

  object EnableOrganizationAdminAccountRequest {
    @inline
    def apply(
        AdminAccountId: NonEmptyString
    ): EnableOrganizationAdminAccountRequest = {
      val __obj = js.Dynamic.literal(
        "AdminAccountId" -> AdminAccountId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[EnableOrganizationAdminAccountRequest]
    }
  }

  @js.native
  trait EnableOrganizationAdminAccountResponse extends js.Object

  object EnableOrganizationAdminAccountResponse {
    @inline
    def apply(): EnableOrganizationAdminAccountResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EnableOrganizationAdminAccountResponse]
    }
  }

  @js.native
  trait EnableSecurityHubRequest extends js.Object {
    var EnableDefaultStandards: js.UndefOr[Boolean]
    var Tags: js.UndefOr[TagMap]
  }

  object EnableSecurityHubRequest {
    @inline
    def apply(
        EnableDefaultStandards: js.UndefOr[Boolean] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): EnableSecurityHubRequest = {
      val __obj = js.Dynamic.literal()
      EnableDefaultStandards.foreach(__v => __obj.updateDynamic("EnableDefaultStandards")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EnableSecurityHubRequest]
    }
  }

  @js.native
  trait EnableSecurityHubResponse extends js.Object

  object EnableSecurityHubResponse {
    @inline
    def apply(): EnableSecurityHubResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EnableSecurityHubResponse]
    }
  }

  /** Provides information about the file paths that were affected by the threat.
    */
  @js.native
  trait FilePaths extends js.Object {
    var FileName: js.UndefOr[NonEmptyString]
    var FilePath: js.UndefOr[NonEmptyString]
    var Hash: js.UndefOr[NonEmptyString]
    var ResourceId: js.UndefOr[NonEmptyString]
  }

  object FilePaths {
    @inline
    def apply(
        FileName: js.UndefOr[NonEmptyString] = js.undefined,
        FilePath: js.UndefOr[NonEmptyString] = js.undefined,
        Hash: js.UndefOr[NonEmptyString] = js.undefined,
        ResourceId: js.UndefOr[NonEmptyString] = js.undefined
    ): FilePaths = {
      val __obj = js.Dynamic.literal()
      FileName.foreach(__v => __obj.updateDynamic("FileName")(__v.asInstanceOf[js.Any]))
      FilePath.foreach(__v => __obj.updateDynamic("FilePath")(__v.asInstanceOf[js.Any]))
      Hash.foreach(__v => __obj.updateDynamic("Hash")(__v.asInstanceOf[js.Any]))
      ResourceId.foreach(__v => __obj.updateDynamic("ResourceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FilePaths]
    }
  }

  /** A finding aggregator. A finding aggregator contains the configuration for finding aggregation.
    */
  @js.native
  trait FindingAggregator extends js.Object {
    var FindingAggregatorArn: js.UndefOr[NonEmptyString]
  }

  object FindingAggregator {
    @inline
    def apply(
        FindingAggregatorArn: js.UndefOr[NonEmptyString] = js.undefined
    ): FindingAggregator = {
      val __obj = js.Dynamic.literal()
      FindingAggregatorArn.foreach(__v => __obj.updateDynamic("FindingAggregatorArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FindingAggregator]
    }
  }

  /** In a <code>BatchImportFindings</code> request, finding providers use <code>FindingProviderFields</code> to provide and update values for confidence, criticality, related findings, severity, and types.
    */
  @js.native
  trait FindingProviderFields extends js.Object {
    var Confidence: js.UndefOr[RatioScale]
    var Criticality: js.UndefOr[RatioScale]
    var RelatedFindings: js.UndefOr[RelatedFindingList]
    var Severity: js.UndefOr[FindingProviderSeverity]
    var Types: js.UndefOr[TypeList]
  }

  object FindingProviderFields {
    @inline
    def apply(
        Confidence: js.UndefOr[RatioScale] = js.undefined,
        Criticality: js.UndefOr[RatioScale] = js.undefined,
        RelatedFindings: js.UndefOr[RelatedFindingList] = js.undefined,
        Severity: js.UndefOr[FindingProviderSeverity] = js.undefined,
        Types: js.UndefOr[TypeList] = js.undefined
    ): FindingProviderFields = {
      val __obj = js.Dynamic.literal()
      Confidence.foreach(__v => __obj.updateDynamic("Confidence")(__v.asInstanceOf[js.Any]))
      Criticality.foreach(__v => __obj.updateDynamic("Criticality")(__v.asInstanceOf[js.Any]))
      RelatedFindings.foreach(__v => __obj.updateDynamic("RelatedFindings")(__v.asInstanceOf[js.Any]))
      Severity.foreach(__v => __obj.updateDynamic("Severity")(__v.asInstanceOf[js.Any]))
      Types.foreach(__v => __obj.updateDynamic("Types")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FindingProviderFields]
    }
  }

  /** The severity assigned to the finding by the finding provider.
    */
  @js.native
  trait FindingProviderSeverity extends js.Object {
    var Label: js.UndefOr[SeverityLabel]
    var Original: js.UndefOr[NonEmptyString]
  }

  object FindingProviderSeverity {
    @inline
    def apply(
        Label: js.UndefOr[SeverityLabel] = js.undefined,
        Original: js.UndefOr[NonEmptyString] = js.undefined
    ): FindingProviderSeverity = {
      val __obj = js.Dynamic.literal()
      Label.foreach(__v => __obj.updateDynamic("Label")(__v.asInstanceOf[js.Any]))
      Original.foreach(__v => __obj.updateDynamic("Original")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FindingProviderSeverity]
    }
  }

  /** Defines the behavior of the firewall.
    */
  @js.native
  trait FirewallPolicyDetails extends js.Object {
    var StatefulRuleGroupReferences: js.UndefOr[FirewallPolicyStatefulRuleGroupReferencesList]
    var StatelessCustomActions: js.UndefOr[FirewallPolicyStatelessCustomActionsList]
    var StatelessDefaultActions: js.UndefOr[NonEmptyStringList]
    var StatelessFragmentDefaultActions: js.UndefOr[NonEmptyStringList]
    var StatelessRuleGroupReferences: js.UndefOr[FirewallPolicyStatelessRuleGroupReferencesList]
  }

  object FirewallPolicyDetails {
    @inline
    def apply(
        StatefulRuleGroupReferences: js.UndefOr[FirewallPolicyStatefulRuleGroupReferencesList] = js.undefined,
        StatelessCustomActions: js.UndefOr[FirewallPolicyStatelessCustomActionsList] = js.undefined,
        StatelessDefaultActions: js.UndefOr[NonEmptyStringList] = js.undefined,
        StatelessFragmentDefaultActions: js.UndefOr[NonEmptyStringList] = js.undefined,
        StatelessRuleGroupReferences: js.UndefOr[FirewallPolicyStatelessRuleGroupReferencesList] = js.undefined
    ): FirewallPolicyDetails = {
      val __obj = js.Dynamic.literal()
      StatefulRuleGroupReferences.foreach(__v => __obj.updateDynamic("StatefulRuleGroupReferences")(__v.asInstanceOf[js.Any]))
      StatelessCustomActions.foreach(__v => __obj.updateDynamic("StatelessCustomActions")(__v.asInstanceOf[js.Any]))
      StatelessDefaultActions.foreach(__v => __obj.updateDynamic("StatelessDefaultActions")(__v.asInstanceOf[js.Any]))
      StatelessFragmentDefaultActions.foreach(__v => __obj.updateDynamic("StatelessFragmentDefaultActions")(__v.asInstanceOf[js.Any]))
      StatelessRuleGroupReferences.foreach(__v => __obj.updateDynamic("StatelessRuleGroupReferences")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FirewallPolicyDetails]
    }
  }

  /** A stateful rule group that is used by the firewall policy.
    */
  @js.native
  trait FirewallPolicyStatefulRuleGroupReferencesDetails extends js.Object {
    var ResourceArn: js.UndefOr[NonEmptyString]
  }

  object FirewallPolicyStatefulRuleGroupReferencesDetails {
    @inline
    def apply(
        ResourceArn: js.UndefOr[NonEmptyString] = js.undefined
    ): FirewallPolicyStatefulRuleGroupReferencesDetails = {
      val __obj = js.Dynamic.literal()
      ResourceArn.foreach(__v => __obj.updateDynamic("ResourceArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FirewallPolicyStatefulRuleGroupReferencesDetails]
    }
  }

  /** A custom action that can be used for stateless packet handling.
    */
  @js.native
  trait FirewallPolicyStatelessCustomActionsDetails extends js.Object {
    var ActionDefinition: js.UndefOr[StatelessCustomActionDefinition]
    var ActionName: js.UndefOr[NonEmptyString]
  }

  object FirewallPolicyStatelessCustomActionsDetails {
    @inline
    def apply(
        ActionDefinition: js.UndefOr[StatelessCustomActionDefinition] = js.undefined,
        ActionName: js.UndefOr[NonEmptyString] = js.undefined
    ): FirewallPolicyStatelessCustomActionsDetails = {
      val __obj = js.Dynamic.literal()
      ActionDefinition.foreach(__v => __obj.updateDynamic("ActionDefinition")(__v.asInstanceOf[js.Any]))
      ActionName.foreach(__v => __obj.updateDynamic("ActionName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FirewallPolicyStatelessCustomActionsDetails]
    }
  }

  /** A stateless rule group that is used by the firewall policy.
    */
  @js.native
  trait FirewallPolicyStatelessRuleGroupReferencesDetails extends js.Object {
    var Priority: js.UndefOr[Int]
    var ResourceArn: js.UndefOr[NonEmptyString]
  }

  object FirewallPolicyStatelessRuleGroupReferencesDetails {
    @inline
    def apply(
        Priority: js.UndefOr[Int] = js.undefined,
        ResourceArn: js.UndefOr[NonEmptyString] = js.undefined
    ): FirewallPolicyStatelessRuleGroupReferencesDetails = {
      val __obj = js.Dynamic.literal()
      Priority.foreach(__v => __obj.updateDynamic("Priority")(__v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.updateDynamic("ResourceArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FirewallPolicyStatelessRuleGroupReferencesDetails]
    }
  }

  /** Provides the latitude and longitude coordinates of a location.
    */
  @js.native
  trait GeoLocation extends js.Object {
    var Lat: js.UndefOr[Double]
    var Lon: js.UndefOr[Double]
  }

  object GeoLocation {
    @inline
    def apply(
        Lat: js.UndefOr[Double] = js.undefined,
        Lon: js.UndefOr[Double] = js.undefined
    ): GeoLocation = {
      val __obj = js.Dynamic.literal()
      Lat.foreach(__v => __obj.updateDynamic("Lat")(__v.asInstanceOf[js.Any]))
      Lon.foreach(__v => __obj.updateDynamic("Lon")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GeoLocation]
    }
  }

  @js.native
  trait GetAdministratorAccountRequest extends js.Object

  object GetAdministratorAccountRequest {
    @inline
    def apply(): GetAdministratorAccountRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetAdministratorAccountRequest]
    }
  }

  @js.native
  trait GetAdministratorAccountResponse extends js.Object {
    var Administrator: js.UndefOr[Invitation]
  }

  object GetAdministratorAccountResponse {
    @inline
    def apply(
        Administrator: js.UndefOr[Invitation] = js.undefined
    ): GetAdministratorAccountResponse = {
      val __obj = js.Dynamic.literal()
      Administrator.foreach(__v => __obj.updateDynamic("Administrator")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAdministratorAccountResponse]
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
      StandardsSubscriptionArns.foreach(__v => __obj.updateDynamic("StandardsSubscriptionArns")(__v.asInstanceOf[js.Any]))
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
  trait GetFindingAggregatorRequest extends js.Object {
    var FindingAggregatorArn: NonEmptyString
  }

  object GetFindingAggregatorRequest {
    @inline
    def apply(
        FindingAggregatorArn: NonEmptyString
    ): GetFindingAggregatorRequest = {
      val __obj = js.Dynamic.literal(
        "FindingAggregatorArn" -> FindingAggregatorArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetFindingAggregatorRequest]
    }
  }

  @js.native
  trait GetFindingAggregatorResponse extends js.Object {
    var FindingAggregationRegion: js.UndefOr[NonEmptyString]
    var FindingAggregatorArn: js.UndefOr[NonEmptyString]
    var RegionLinkingMode: js.UndefOr[NonEmptyString]
    var Regions: js.UndefOr[StringList]
  }

  object GetFindingAggregatorResponse {
    @inline
    def apply(
        FindingAggregationRegion: js.UndefOr[NonEmptyString] = js.undefined,
        FindingAggregatorArn: js.UndefOr[NonEmptyString] = js.undefined,
        RegionLinkingMode: js.UndefOr[NonEmptyString] = js.undefined,
        Regions: js.UndefOr[StringList] = js.undefined
    ): GetFindingAggregatorResponse = {
      val __obj = js.Dynamic.literal()
      FindingAggregationRegion.foreach(__v => __obj.updateDynamic("FindingAggregationRegion")(__v.asInstanceOf[js.Any]))
      FindingAggregatorArn.foreach(__v => __obj.updateDynamic("FindingAggregatorArn")(__v.asInstanceOf[js.Any]))
      RegionLinkingMode.foreach(__v => __obj.updateDynamic("RegionLinkingMode")(__v.asInstanceOf[js.Any]))
      Regions.foreach(__v => __obj.updateDynamic("Regions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFindingAggregatorResponse]
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
  trait GetInvitationsCountRequest extends js.Object

  object GetInvitationsCountRequest {
    @inline
    def apply(): GetInvitationsCountRequest = {
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
  trait GetMasterAccountRequest extends js.Object

  object GetMasterAccountRequest {
    @inline
    def apply(): GetMasterAccountRequest = {
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

  /** An Internet Control Message Protocol (ICMP) type and code.
    */
  @js.native
  trait IcmpTypeCode extends js.Object {
    var Code: js.UndefOr[Int]
    var Type: js.UndefOr[Int]
  }

  object IcmpTypeCode {
    @inline
    def apply(
        Code: js.UndefOr[Int] = js.undefined,
        Type: js.UndefOr[Int] = js.undefined
    ): IcmpTypeCode = {
      val __obj = js.Dynamic.literal()
      Code.foreach(__v => __obj.updateDynamic("Code")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IcmpTypeCode]
    }
  }

  /** The list of the findings that cannot be imported. For each finding, the list provides the error.
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
        "ErrorCode" -> ErrorCode.asInstanceOf[js.Any],
        "ErrorMessage" -> ErrorMessage.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ImportFindingsError]
    }
  }

  /** Contains information about a Security Hub insight.
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
        "Filters" -> Filters.asInstanceOf[js.Any],
        "GroupByAttribute" -> GroupByAttribute.asInstanceOf[js.Any],
        "InsightArn" -> InsightArn.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Insight]
    }
  }

  /** The insight result values returned by the <code>GetInsightResults</code> operation.
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
        "Count" -> Count.asInstanceOf[js.Any],
        "GroupByAttributeValue" -> GroupByAttributeValue.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[InsightResultValue]
    }
  }

  /** The insight results returned by the <code>GetInsightResults</code> operation.
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
        "InsightArn" -> InsightArn.asInstanceOf[js.Any],
        "ResultValues" -> ResultValues.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[InsightResults]
    }
  }

  /** Details about an invitation.
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
    var AccountIds: AccountIdList
  }

  object InviteMembersRequest {
    @inline
    def apply(
        AccountIds: AccountIdList
    ): InviteMembersRequest = {
      val __obj = js.Dynamic.literal(
        "AccountIds" -> AccountIds.asInstanceOf[js.Any]
      )
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

  /** The IP filter for querying findings.
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

  /** Provides information about an internet provider.
    */
  @js.native
  trait IpOrganizationDetails extends js.Object {
    var Asn: js.UndefOr[Int]
    var AsnOrg: js.UndefOr[NonEmptyString]
    var Isp: js.UndefOr[NonEmptyString]
    var Org: js.UndefOr[NonEmptyString]
  }

  object IpOrganizationDetails {
    @inline
    def apply(
        Asn: js.UndefOr[Int] = js.undefined,
        AsnOrg: js.UndefOr[NonEmptyString] = js.undefined,
        Isp: js.UndefOr[NonEmptyString] = js.undefined,
        Org: js.UndefOr[NonEmptyString] = js.undefined
    ): IpOrganizationDetails = {
      val __obj = js.Dynamic.literal()
      Asn.foreach(__v => __obj.updateDynamic("Asn")(__v.asInstanceOf[js.Any]))
      AsnOrg.foreach(__v => __obj.updateDynamic("AsnOrg")(__v.asInstanceOf[js.Any]))
      Isp.foreach(__v => __obj.updateDynamic("Isp")(__v.asInstanceOf[js.Any]))
      Org.foreach(__v => __obj.updateDynamic("Org")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IpOrganizationDetails]
    }
  }

  /** An IPV6 CIDR block association.
    */
  @js.native
  trait Ipv6CidrBlockAssociation extends js.Object {
    var AssociationId: js.UndefOr[NonEmptyString]
    var CidrBlockState: js.UndefOr[NonEmptyString]
    var Ipv6CidrBlock: js.UndefOr[NonEmptyString]
  }

  object Ipv6CidrBlockAssociation {
    @inline
    def apply(
        AssociationId: js.UndefOr[NonEmptyString] = js.undefined,
        CidrBlockState: js.UndefOr[NonEmptyString] = js.undefined,
        Ipv6CidrBlock: js.UndefOr[NonEmptyString] = js.undefined
    ): Ipv6CidrBlockAssociation = {
      val __obj = js.Dynamic.literal()
      AssociationId.foreach(__v => __obj.updateDynamic("AssociationId")(__v.asInstanceOf[js.Any]))
      CidrBlockState.foreach(__v => __obj.updateDynamic("CidrBlockState")(__v.asInstanceOf[js.Any]))
      Ipv6CidrBlock.foreach(__v => __obj.updateDynamic("Ipv6CidrBlock")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Ipv6CidrBlockAssociation]
    }
  }

  /** A keyword filter for querying findings.
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
  trait ListFindingAggregatorsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListFindingAggregatorsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListFindingAggregatorsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFindingAggregatorsRequest]
    }
  }

  @js.native
  trait ListFindingAggregatorsResponse extends js.Object {
    var FindingAggregators: js.UndefOr[FindingAggregatorList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListFindingAggregatorsResponse {
    @inline
    def apply(
        FindingAggregators: js.UndefOr[FindingAggregatorList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListFindingAggregatorsResponse = {
      val __obj = js.Dynamic.literal()
      FindingAggregators.foreach(__v => __obj.updateDynamic("FindingAggregators")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFindingAggregatorsResponse]
    }
  }

  @js.native
  trait ListInvitationsRequest extends js.Object {
    var MaxResults: js.UndefOr[CrossAccountMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListInvitationsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[CrossAccountMaxResults] = js.undefined,
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
    var MaxResults: js.UndefOr[CrossAccountMaxResults]
    var NextToken: js.UndefOr[NextToken]
    var OnlyAssociated: js.UndefOr[Boolean]
  }

  object ListMembersRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[CrossAccountMaxResults] = js.undefined,
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
  trait ListOrganizationAdminAccountsRequest extends js.Object {
    var MaxResults: js.UndefOr[AdminsMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListOrganizationAdminAccountsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[AdminsMaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListOrganizationAdminAccountsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListOrganizationAdminAccountsRequest]
    }
  }

  @js.native
  trait ListOrganizationAdminAccountsResponse extends js.Object {
    var AdminAccounts: js.UndefOr[AdminAccounts]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListOrganizationAdminAccountsResponse {
    @inline
    def apply(
        AdminAccounts: js.UndefOr[AdminAccounts] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListOrganizationAdminAccountsResponse = {
      val __obj = js.Dynamic.literal()
      AdminAccounts.foreach(__v => __obj.updateDynamic("AdminAccounts")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListOrganizationAdminAccountsResponse]
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

  /** Information about the state of the load balancer.
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

  /** A list of malware related to a finding.
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

  /** A map filter for querying findings. Each map filter provides the field to check, the value to look for, and the comparison operator.
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

  /** The details about a member account.
    */
  @js.native
  trait Member extends js.Object {
    var AccountId: js.UndefOr[AccountId]
    var AdministratorId: js.UndefOr[NonEmptyString]
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
        AdministratorId: js.UndefOr[NonEmptyString] = js.undefined,
        Email: js.UndefOr[NonEmptyString] = js.undefined,
        InvitedAt: js.UndefOr[Timestamp] = js.undefined,
        MasterId: js.UndefOr[NonEmptyString] = js.undefined,
        MemberStatus: js.UndefOr[NonEmptyString] = js.undefined,
        UpdatedAt: js.UndefOr[Timestamp] = js.undefined
    ): Member = {
      val __obj = js.Dynamic.literal()
      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      AdministratorId.foreach(__v => __obj.updateDynamic("AdministratorId")(__v.asInstanceOf[js.Any]))
      Email.foreach(__v => __obj.updateDynamic("Email")(__v.asInstanceOf[js.Any]))
      InvitedAt.foreach(__v => __obj.updateDynamic("InvitedAt")(__v.asInstanceOf[js.Any]))
      MasterId.foreach(__v => __obj.updateDynamic("MasterId")(__v.asInstanceOf[js.Any]))
      MemberStatus.foreach(__v => __obj.updateDynamic("MemberStatus")(__v.asInstanceOf[js.Any]))
      UpdatedAt.foreach(__v => __obj.updateDynamic("UpdatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Member]
    }
  }

  /** The details of network-related information about a finding.
    */
  @js.native
  trait Network extends js.Object {
    var DestinationDomain: js.UndefOr[NonEmptyString]
    var DestinationIpV4: js.UndefOr[NonEmptyString]
    var DestinationIpV6: js.UndefOr[NonEmptyString]
    var DestinationPort: js.UndefOr[Int]
    var Direction: js.UndefOr[NetworkDirection]
    var OpenPortRange: js.UndefOr[PortRange]
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
        OpenPortRange: js.UndefOr[PortRange] = js.undefined,
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
      OpenPortRange.foreach(__v => __obj.updateDynamic("OpenPortRange")(__v.asInstanceOf[js.Any]))
      Protocol.foreach(__v => __obj.updateDynamic("Protocol")(__v.asInstanceOf[js.Any]))
      SourceDomain.foreach(__v => __obj.updateDynamic("SourceDomain")(__v.asInstanceOf[js.Any]))
      SourceIpV4.foreach(__v => __obj.updateDynamic("SourceIpV4")(__v.asInstanceOf[js.Any]))
      SourceIpV6.foreach(__v => __obj.updateDynamic("SourceIpV6")(__v.asInstanceOf[js.Any]))
      SourceMac.foreach(__v => __obj.updateDynamic("SourceMac")(__v.asInstanceOf[js.Any]))
      SourcePort.foreach(__v => __obj.updateDynamic("SourcePort")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Network]
    }
  }

  /** Provided if <code>ActionType</code> is <code>NETWORK_CONNECTION</code>. It provides details about the attempted network connection that was detected.
    */
  @js.native
  trait NetworkConnectionAction extends js.Object {
    var Blocked: js.UndefOr[Boolean]
    var ConnectionDirection: js.UndefOr[NonEmptyString]
    var LocalPortDetails: js.UndefOr[ActionLocalPortDetails]
    var Protocol: js.UndefOr[NonEmptyString]
    var RemoteIpDetails: js.UndefOr[ActionRemoteIpDetails]
    var RemotePortDetails: js.UndefOr[ActionRemotePortDetails]
  }

  object NetworkConnectionAction {
    @inline
    def apply(
        Blocked: js.UndefOr[Boolean] = js.undefined,
        ConnectionDirection: js.UndefOr[NonEmptyString] = js.undefined,
        LocalPortDetails: js.UndefOr[ActionLocalPortDetails] = js.undefined,
        Protocol: js.UndefOr[NonEmptyString] = js.undefined,
        RemoteIpDetails: js.UndefOr[ActionRemoteIpDetails] = js.undefined,
        RemotePortDetails: js.UndefOr[ActionRemotePortDetails] = js.undefined
    ): NetworkConnectionAction = {
      val __obj = js.Dynamic.literal()
      Blocked.foreach(__v => __obj.updateDynamic("Blocked")(__v.asInstanceOf[js.Any]))
      ConnectionDirection.foreach(__v => __obj.updateDynamic("ConnectionDirection")(__v.asInstanceOf[js.Any]))
      LocalPortDetails.foreach(__v => __obj.updateDynamic("LocalPortDetails")(__v.asInstanceOf[js.Any]))
      Protocol.foreach(__v => __obj.updateDynamic("Protocol")(__v.asInstanceOf[js.Any]))
      RemoteIpDetails.foreach(__v => __obj.updateDynamic("RemoteIpDetails")(__v.asInstanceOf[js.Any]))
      RemotePortDetails.foreach(__v => __obj.updateDynamic("RemotePortDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkConnectionAction]
    }
  }

  /** Details about a network path component that occurs before or after the current component.
    */
  @js.native
  trait NetworkHeader extends js.Object {
    var Destination: js.UndefOr[NetworkPathComponentDetails]
    var Protocol: js.UndefOr[NonEmptyString]
    var Source: js.UndefOr[NetworkPathComponentDetails]
  }

  object NetworkHeader {
    @inline
    def apply(
        Destination: js.UndefOr[NetworkPathComponentDetails] = js.undefined,
        Protocol: js.UndefOr[NonEmptyString] = js.undefined,
        Source: js.UndefOr[NetworkPathComponentDetails] = js.undefined
    ): NetworkHeader = {
      val __obj = js.Dynamic.literal()
      Destination.foreach(__v => __obj.updateDynamic("Destination")(__v.asInstanceOf[js.Any]))
      Protocol.foreach(__v => __obj.updateDynamic("Protocol")(__v.asInstanceOf[js.Any]))
      Source.foreach(__v => __obj.updateDynamic("Source")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkHeader]
    }
  }

  /** Information about a network path component.
    */
  @js.native
  trait NetworkPathComponent extends js.Object {
    var ComponentId: js.UndefOr[NonEmptyString]
    var ComponentType: js.UndefOr[NonEmptyString]
    var Egress: js.UndefOr[NetworkHeader]
    var Ingress: js.UndefOr[NetworkHeader]
  }

  object NetworkPathComponent {
    @inline
    def apply(
        ComponentId: js.UndefOr[NonEmptyString] = js.undefined,
        ComponentType: js.UndefOr[NonEmptyString] = js.undefined,
        Egress: js.UndefOr[NetworkHeader] = js.undefined,
        Ingress: js.UndefOr[NetworkHeader] = js.undefined
    ): NetworkPathComponent = {
      val __obj = js.Dynamic.literal()
      ComponentId.foreach(__v => __obj.updateDynamic("ComponentId")(__v.asInstanceOf[js.Any]))
      ComponentType.foreach(__v => __obj.updateDynamic("ComponentType")(__v.asInstanceOf[js.Any]))
      Egress.foreach(__v => __obj.updateDynamic("Egress")(__v.asInstanceOf[js.Any]))
      Ingress.foreach(__v => __obj.updateDynamic("Ingress")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkPathComponent]
    }
  }

  /** Information about the destination of the next component in the network path.
    */
  @js.native
  trait NetworkPathComponentDetails extends js.Object {
    var Address: js.UndefOr[StringList]
    var PortRanges: js.UndefOr[PortRangeList]
  }

  object NetworkPathComponentDetails {
    @inline
    def apply(
        Address: js.UndefOr[StringList] = js.undefined,
        PortRanges: js.UndefOr[PortRangeList] = js.undefined
    ): NetworkPathComponentDetails = {
      val __obj = js.Dynamic.literal()
      Address.foreach(__v => __obj.updateDynamic("Address")(__v.asInstanceOf[js.Any]))
      PortRanges.foreach(__v => __obj.updateDynamic("PortRanges")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkPathComponentDetails]
    }
  }

  /** A user-defined note added to a finding.
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
        "Text" -> Text.asInstanceOf[js.Any],
        "UpdatedAt" -> UpdatedAt.asInstanceOf[js.Any],
        "UpdatedBy" -> UpdatedBy.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Note]
    }
  }

  /** The updated note.
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
        "Text" -> Text.asInstanceOf[js.Any],
        "UpdatedBy" -> UpdatedBy.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[NoteUpdate]
    }
  }

  /** A number filter for querying findings.
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

  /** The detected occurrences of sensitive data.
    */
  @js.native
  trait Occurrences extends js.Object {
    var Cells: js.UndefOr[Cells]
    var LineRanges: js.UndefOr[Ranges]
    var OffsetRanges: js.UndefOr[Ranges]
    var Pages: js.UndefOr[Pages]
    var Records: js.UndefOr[Records]
  }

  object Occurrences {
    @inline
    def apply(
        Cells: js.UndefOr[Cells] = js.undefined,
        LineRanges: js.UndefOr[Ranges] = js.undefined,
        OffsetRanges: js.UndefOr[Ranges] = js.undefined,
        Pages: js.UndefOr[Pages] = js.undefined,
        Records: js.UndefOr[Records] = js.undefined
    ): Occurrences = {
      val __obj = js.Dynamic.literal()
      Cells.foreach(__v => __obj.updateDynamic("Cells")(__v.asInstanceOf[js.Any]))
      LineRanges.foreach(__v => __obj.updateDynamic("LineRanges")(__v.asInstanceOf[js.Any]))
      OffsetRanges.foreach(__v => __obj.updateDynamic("OffsetRanges")(__v.asInstanceOf[js.Any]))
      Pages.foreach(__v => __obj.updateDynamic("Pages")(__v.asInstanceOf[js.Any]))
      Records.foreach(__v => __obj.updateDynamic("Records")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Occurrences]
    }
  }

  /** An occurrence of sensitive data in an Adobe Portable Document Format (PDF) file.
    */
  @js.native
  trait Page extends js.Object {
    var LineRange: js.UndefOr[Range]
    var OffsetRange: js.UndefOr[Range]
    var PageNumber: js.UndefOr[Double]
  }

  object Page {
    @inline
    def apply(
        LineRange: js.UndefOr[Range] = js.undefined,
        OffsetRange: js.UndefOr[Range] = js.undefined,
        PageNumber: js.UndefOr[Double] = js.undefined
    ): Page = {
      val __obj = js.Dynamic.literal()
      LineRange.foreach(__v => __obj.updateDynamic("LineRange")(__v.asInstanceOf[js.Any]))
      OffsetRange.foreach(__v => __obj.updateDynamic("OffsetRange")(__v.asInstanceOf[js.Any]))
      PageNumber.foreach(__v => __obj.updateDynamic("PageNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Page]
    }
  }

  /** Provides an overview of the patch compliance status for an instance against a selected compliance standard.
    */
  @js.native
  trait PatchSummary extends js.Object {
    var Id: NonEmptyString
    var FailedCount: js.UndefOr[Int]
    var InstalledCount: js.UndefOr[Int]
    var InstalledOtherCount: js.UndefOr[Int]
    var InstalledPendingReboot: js.UndefOr[Int]
    var InstalledRejectedCount: js.UndefOr[Int]
    var MissingCount: js.UndefOr[Int]
    var Operation: js.UndefOr[NonEmptyString]
    var OperationEndTime: js.UndefOr[NonEmptyString]
    var OperationStartTime: js.UndefOr[NonEmptyString]
    var RebootOption: js.UndefOr[NonEmptyString]
  }

  object PatchSummary {
    @inline
    def apply(
        Id: NonEmptyString,
        FailedCount: js.UndefOr[Int] = js.undefined,
        InstalledCount: js.UndefOr[Int] = js.undefined,
        InstalledOtherCount: js.UndefOr[Int] = js.undefined,
        InstalledPendingReboot: js.UndefOr[Int] = js.undefined,
        InstalledRejectedCount: js.UndefOr[Int] = js.undefined,
        MissingCount: js.UndefOr[Int] = js.undefined,
        Operation: js.UndefOr[NonEmptyString] = js.undefined,
        OperationEndTime: js.UndefOr[NonEmptyString] = js.undefined,
        OperationStartTime: js.UndefOr[NonEmptyString] = js.undefined,
        RebootOption: js.UndefOr[NonEmptyString] = js.undefined
    ): PatchSummary = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      FailedCount.foreach(__v => __obj.updateDynamic("FailedCount")(__v.asInstanceOf[js.Any]))
      InstalledCount.foreach(__v => __obj.updateDynamic("InstalledCount")(__v.asInstanceOf[js.Any]))
      InstalledOtherCount.foreach(__v => __obj.updateDynamic("InstalledOtherCount")(__v.asInstanceOf[js.Any]))
      InstalledPendingReboot.foreach(__v => __obj.updateDynamic("InstalledPendingReboot")(__v.asInstanceOf[js.Any]))
      InstalledRejectedCount.foreach(__v => __obj.updateDynamic("InstalledRejectedCount")(__v.asInstanceOf[js.Any]))
      MissingCount.foreach(__v => __obj.updateDynamic("MissingCount")(__v.asInstanceOf[js.Any]))
      Operation.foreach(__v => __obj.updateDynamic("Operation")(__v.asInstanceOf[js.Any]))
      OperationEndTime.foreach(__v => __obj.updateDynamic("OperationEndTime")(__v.asInstanceOf[js.Any]))
      OperationStartTime.foreach(__v => __obj.updateDynamic("OperationStartTime")(__v.asInstanceOf[js.Any]))
      RebootOption.foreach(__v => __obj.updateDynamic("RebootOption")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PatchSummary]
    }
  }

  /** Provided if <code>ActionType</code> is <code>PORT_PROBE</code>. It provides details about the attempted port probe that was detected.
    */
  @js.native
  trait PortProbeAction extends js.Object {
    var Blocked: js.UndefOr[Boolean]
    var PortProbeDetails: js.UndefOr[PortProbeDetailList]
  }

  object PortProbeAction {
    @inline
    def apply(
        Blocked: js.UndefOr[Boolean] = js.undefined,
        PortProbeDetails: js.UndefOr[PortProbeDetailList] = js.undefined
    ): PortProbeAction = {
      val __obj = js.Dynamic.literal()
      Blocked.foreach(__v => __obj.updateDynamic("Blocked")(__v.asInstanceOf[js.Any]))
      PortProbeDetails.foreach(__v => __obj.updateDynamic("PortProbeDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PortProbeAction]
    }
  }

  /** A port scan that was part of the port probe. For each scan, PortProbeDetails provides information about the local IP address and port that were scanned, and the remote IP address that the scan originated from.
    */
  @js.native
  trait PortProbeDetail extends js.Object {
    var LocalIpDetails: js.UndefOr[ActionLocalIpDetails]
    var LocalPortDetails: js.UndefOr[ActionLocalPortDetails]
    var RemoteIpDetails: js.UndefOr[ActionRemoteIpDetails]
  }

  object PortProbeDetail {
    @inline
    def apply(
        LocalIpDetails: js.UndefOr[ActionLocalIpDetails] = js.undefined,
        LocalPortDetails: js.UndefOr[ActionLocalPortDetails] = js.undefined,
        RemoteIpDetails: js.UndefOr[ActionRemoteIpDetails] = js.undefined
    ): PortProbeDetail = {
      val __obj = js.Dynamic.literal()
      LocalIpDetails.foreach(__v => __obj.updateDynamic("LocalIpDetails")(__v.asInstanceOf[js.Any]))
      LocalPortDetails.foreach(__v => __obj.updateDynamic("LocalPortDetails")(__v.asInstanceOf[js.Any]))
      RemoteIpDetails.foreach(__v => __obj.updateDynamic("RemoteIpDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PortProbeDetail]
    }
  }

  /** A range of ports.
    */
  @js.native
  trait PortRange extends js.Object {
    var Begin: js.UndefOr[Int]
    var End: js.UndefOr[Int]
  }

  object PortRange {
    @inline
    def apply(
        Begin: js.UndefOr[Int] = js.undefined,
        End: js.UndefOr[Int] = js.undefined
    ): PortRange = {
      val __obj = js.Dynamic.literal()
      Begin.foreach(__v => __obj.updateDynamic("Begin")(__v.asInstanceOf[js.Any]))
      End.foreach(__v => __obj.updateDynamic("End")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PortRange]
    }
  }

  /** A range of ports.
    */
  @js.native
  trait PortRangeFromTo extends js.Object {
    var From: js.UndefOr[Int]
    var To: js.UndefOr[Int]
  }

  object PortRangeFromTo {
    @inline
    def apply(
        From: js.UndefOr[Int] = js.undefined,
        To: js.UndefOr[Int] = js.undefined
    ): PortRangeFromTo = {
      val __obj = js.Dynamic.literal()
      From.foreach(__v => __obj.updateDynamic("From")(__v.asInstanceOf[js.Any]))
      To.foreach(__v => __obj.updateDynamic("To")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PortRangeFromTo]
    }
  }

  /** The details of process-related information about a finding.
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

  /** Contains details about a product.
    */
  @js.native
  trait Product extends js.Object {
    var ProductArn: NonEmptyString
    var ActivationUrl: js.UndefOr[NonEmptyString]
    var Categories: js.UndefOr[CategoryList]
    var CompanyName: js.UndefOr[NonEmptyString]
    var Description: js.UndefOr[NonEmptyString]
    var IntegrationTypes: js.UndefOr[IntegrationTypeList]
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
        IntegrationTypes: js.UndefOr[IntegrationTypeList] = js.undefined,
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
      IntegrationTypes.foreach(__v => __obj.updateDynamic("IntegrationTypes")(__v.asInstanceOf[js.Any]))
      MarketplaceUrl.foreach(__v => __obj.updateDynamic("MarketplaceUrl")(__v.asInstanceOf[js.Any]))
      ProductName.foreach(__v => __obj.updateDynamic("ProductName")(__v.asInstanceOf[js.Any]))
      ProductSubscriptionResourcePolicy.foreach(__v => __obj.updateDynamic("ProductSubscriptionResourcePolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Product]
    }
  }

  /** Identifies where the sensitive data begins and ends.
    */
  @js.native
  trait Range extends js.Object {
    var End: js.UndefOr[Double]
    var Start: js.UndefOr[Double]
    var StartColumn: js.UndefOr[Double]
  }

  object Range {
    @inline
    def apply(
        End: js.UndefOr[Double] = js.undefined,
        Start: js.UndefOr[Double] = js.undefined,
        StartColumn: js.UndefOr[Double] = js.undefined
    ): Range = {
      val __obj = js.Dynamic.literal()
      End.foreach(__v => __obj.updateDynamic("End")(__v.asInstanceOf[js.Any]))
      Start.foreach(__v => __obj.updateDynamic("Start")(__v.asInstanceOf[js.Any]))
      StartColumn.foreach(__v => __obj.updateDynamic("StartColumn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Range]
    }
  }

  /** A recommendation on how to remediate the issue identified in a finding.
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

  /** An occurrence of sensitive data in an Apache Avro object container or an Apache Parquet file.
    */
  @js.native
  trait Record extends js.Object {
    var JsonPath: js.UndefOr[NonEmptyString]
    var RecordIndex: js.UndefOr[Double]
  }

  object Record {
    @inline
    def apply(
        JsonPath: js.UndefOr[NonEmptyString] = js.undefined,
        RecordIndex: js.UndefOr[Double] = js.undefined
    ): Record = {
      val __obj = js.Dynamic.literal()
      JsonPath.foreach(__v => __obj.updateDynamic("JsonPath")(__v.asInstanceOf[js.Any]))
      RecordIndex.foreach(__v => __obj.updateDynamic("RecordIndex")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Record]
    }
  }

  /** Details about a related finding.
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
        "Id" -> Id.asInstanceOf[js.Any],
        "ProductArn" -> ProductArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RelatedFinding]
    }
  }

  /** Details about the remediation steps for a finding.
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

  /** A resource related to a finding.
    */
  @js.native
  trait Resource extends js.Object {
    var Id: NonEmptyString
    var Type: NonEmptyString
    var DataClassification: js.UndefOr[DataClassificationDetails]
    var Details: js.UndefOr[ResourceDetails]
    var Partition: js.UndefOr[Partition]
    var Region: js.UndefOr[NonEmptyString]
    var ResourceRole: js.UndefOr[NonEmptyString]
    var Tags: js.UndefOr[FieldMap]
  }

  object Resource {
    @inline
    def apply(
        Id: NonEmptyString,
        Type: NonEmptyString,
        DataClassification: js.UndefOr[DataClassificationDetails] = js.undefined,
        Details: js.UndefOr[ResourceDetails] = js.undefined,
        Partition: js.UndefOr[Partition] = js.undefined,
        Region: js.UndefOr[NonEmptyString] = js.undefined,
        ResourceRole: js.UndefOr[NonEmptyString] = js.undefined,
        Tags: js.UndefOr[FieldMap] = js.undefined
    ): Resource = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      DataClassification.foreach(__v => __obj.updateDynamic("DataClassification")(__v.asInstanceOf[js.Any]))
      Details.foreach(__v => __obj.updateDynamic("Details")(__v.asInstanceOf[js.Any]))
      Partition.foreach(__v => __obj.updateDynamic("Partition")(__v.asInstanceOf[js.Any]))
      Region.foreach(__v => __obj.updateDynamic("Region")(__v.asInstanceOf[js.Any]))
      ResourceRole.foreach(__v => __obj.updateDynamic("ResourceRole")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Resource]
    }
  }

  /** Additional details about a resource related to a finding. To provide the details, use the object that corresponds to the resource type. For example, if the resource type is <code>AwsEc2Instance</code>, then you use the <code>AwsEc2Instance</code> object to provide the details. If the type-specific object does not contain all of the fields you want to populate, then you use the <code>Other</code> object to populate those additional fields. You also use the <code>Other</code> object to populate the details when the selected type does not have a corresponding object.
    */
  @js.native
  trait ResourceDetails extends js.Object {
    var AwsApiGatewayRestApi: js.UndefOr[AwsApiGatewayRestApiDetails]
    var AwsApiGatewayStage: js.UndefOr[AwsApiGatewayStageDetails]
    var AwsApiGatewayV2Api: js.UndefOr[AwsApiGatewayV2ApiDetails]
    var AwsApiGatewayV2Stage: js.UndefOr[AwsApiGatewayV2StageDetails]
    var AwsAutoScalingAutoScalingGroup: js.UndefOr[AwsAutoScalingAutoScalingGroupDetails]
    var AwsAutoScalingLaunchConfiguration: js.UndefOr[AwsAutoScalingLaunchConfigurationDetails]
    var AwsBackupBackupPlan: js.UndefOr[AwsBackupBackupPlanDetails]
    var AwsBackupBackupVault: js.UndefOr[AwsBackupBackupVaultDetails]
    var AwsBackupRecoveryPoint: js.UndefOr[AwsBackupRecoveryPointDetails]
    var AwsCertificateManagerCertificate: js.UndefOr[AwsCertificateManagerCertificateDetails]
    var AwsCloudFormationStack: js.UndefOr[AwsCloudFormationStackDetails]
    var AwsCloudFrontDistribution: js.UndefOr[AwsCloudFrontDistributionDetails]
    var AwsCloudTrailTrail: js.UndefOr[AwsCloudTrailTrailDetails]
    var AwsCloudWatchAlarm: js.UndefOr[AwsCloudWatchAlarmDetails]
    var AwsCodeBuildProject: js.UndefOr[AwsCodeBuildProjectDetails]
    var AwsDynamoDbTable: js.UndefOr[AwsDynamoDbTableDetails]
    var AwsEc2Eip: js.UndefOr[AwsEc2EipDetails]
    var AwsEc2Instance: js.UndefOr[AwsEc2InstanceDetails]
    var AwsEc2NetworkAcl: js.UndefOr[AwsEc2NetworkAclDetails]
    var AwsEc2NetworkInterface: js.UndefOr[AwsEc2NetworkInterfaceDetails]
    var AwsEc2SecurityGroup: js.UndefOr[AwsEc2SecurityGroupDetails]
    var AwsEc2Subnet: js.UndefOr[AwsEc2SubnetDetails]
    var AwsEc2TransitGateway: js.UndefOr[AwsEc2TransitGatewayDetails]
    var AwsEc2Volume: js.UndefOr[AwsEc2VolumeDetails]
    var AwsEc2Vpc: js.UndefOr[AwsEc2VpcDetails]
    var AwsEc2VpcEndpointService: js.UndefOr[AwsEc2VpcEndpointServiceDetails]
    var AwsEc2VpcPeeringConnection: js.UndefOr[AwsEc2VpcPeeringConnectionDetails]
    var AwsEc2VpnConnection: js.UndefOr[AwsEc2VpnConnectionDetails]
    var AwsEcrContainerImage: js.UndefOr[AwsEcrContainerImageDetails]
    var AwsEcrRepository: js.UndefOr[AwsEcrRepositoryDetails]
    var AwsEcsCluster: js.UndefOr[AwsEcsClusterDetails]
    var AwsEcsContainer: js.UndefOr[AwsEcsContainerDetails]
    var AwsEcsService: js.UndefOr[AwsEcsServiceDetails]
    var AwsEcsTask: js.UndefOr[AwsEcsTaskDetails]
    var AwsEcsTaskDefinition: js.UndefOr[AwsEcsTaskDefinitionDetails]
    var AwsEfsAccessPoint: js.UndefOr[AwsEfsAccessPointDetails]
    var AwsEksCluster: js.UndefOr[AwsEksClusterDetails]
    var AwsElasticBeanstalkEnvironment: js.UndefOr[AwsElasticBeanstalkEnvironmentDetails]
    var AwsElasticsearchDomain: js.UndefOr[AwsElasticsearchDomainDetails]
    var AwsElbLoadBalancer: js.UndefOr[AwsElbLoadBalancerDetails]
    var AwsElbv2LoadBalancer: js.UndefOr[AwsElbv2LoadBalancerDetails]
    var AwsIamAccessKey: js.UndefOr[AwsIamAccessKeyDetails]
    var AwsIamGroup: js.UndefOr[AwsIamGroupDetails]
    var AwsIamPolicy: js.UndefOr[AwsIamPolicyDetails]
    var AwsIamRole: js.UndefOr[AwsIamRoleDetails]
    var AwsIamUser: js.UndefOr[AwsIamUserDetails]
    var AwsKinesisStream: js.UndefOr[AwsKinesisStreamDetails]
    var AwsKmsKey: js.UndefOr[AwsKmsKeyDetails]
    var AwsLambdaFunction: js.UndefOr[AwsLambdaFunctionDetails]
    var AwsLambdaLayerVersion: js.UndefOr[AwsLambdaLayerVersionDetails]
    var AwsNetworkFirewallFirewall: js.UndefOr[AwsNetworkFirewallFirewallDetails]
    var AwsNetworkFirewallFirewallPolicy: js.UndefOr[AwsNetworkFirewallFirewallPolicyDetails]
    var AwsNetworkFirewallRuleGroup: js.UndefOr[AwsNetworkFirewallRuleGroupDetails]
    var AwsOpenSearchServiceDomain: js.UndefOr[AwsOpenSearchServiceDomainDetails]
    var AwsRdsDbCluster: js.UndefOr[AwsRdsDbClusterDetails]
    var AwsRdsDbClusterSnapshot: js.UndefOr[AwsRdsDbClusterSnapshotDetails]
    var AwsRdsDbInstance: js.UndefOr[AwsRdsDbInstanceDetails]
    var AwsRdsDbSecurityGroup: js.UndefOr[AwsRdsDbSecurityGroupDetails]
    var AwsRdsDbSnapshot: js.UndefOr[AwsRdsDbSnapshotDetails]
    var AwsRdsEventSubscription: js.UndefOr[AwsRdsEventSubscriptionDetails]
    var AwsRedshiftCluster: js.UndefOr[AwsRedshiftClusterDetails]
    var AwsS3AccountPublicAccessBlock: js.UndefOr[AwsS3AccountPublicAccessBlockDetails]
    var AwsS3Bucket: js.UndefOr[AwsS3BucketDetails]
    var AwsS3Object: js.UndefOr[AwsS3ObjectDetails]
    var AwsSecretsManagerSecret: js.UndefOr[AwsSecretsManagerSecretDetails]
    var AwsSnsTopic: js.UndefOr[AwsSnsTopicDetails]
    var AwsSqsQueue: js.UndefOr[AwsSqsQueueDetails]
    var AwsSsmPatchCompliance: js.UndefOr[AwsSsmPatchComplianceDetails]
    var AwsWafRateBasedRule: js.UndefOr[AwsWafRateBasedRuleDetails]
    var AwsWafRegionalRateBasedRule: js.UndefOr[AwsWafRegionalRateBasedRuleDetails]
    var AwsWafRegionalRule: js.UndefOr[AwsWafRegionalRuleDetails]
    var AwsWafRegionalRuleGroup: js.UndefOr[AwsWafRegionalRuleGroupDetails]
    var AwsWafRegionalWebAcl: js.UndefOr[AwsWafRegionalWebAclDetails]
    var AwsWafRule: js.UndefOr[AwsWafRuleDetails]
    var AwsWafRuleGroup: js.UndefOr[AwsWafRuleGroupDetails]
    var AwsWafWebAcl: js.UndefOr[AwsWafWebAclDetails]
    var AwsXrayEncryptionConfig: js.UndefOr[AwsXrayEncryptionConfigDetails]
    var Container: js.UndefOr[ContainerDetails]
    var Other: js.UndefOr[FieldMap]
  }

  object ResourceDetails {
    @inline
    def apply(
        AwsApiGatewayRestApi: js.UndefOr[AwsApiGatewayRestApiDetails] = js.undefined,
        AwsApiGatewayStage: js.UndefOr[AwsApiGatewayStageDetails] = js.undefined,
        AwsApiGatewayV2Api: js.UndefOr[AwsApiGatewayV2ApiDetails] = js.undefined,
        AwsApiGatewayV2Stage: js.UndefOr[AwsApiGatewayV2StageDetails] = js.undefined,
        AwsAutoScalingAutoScalingGroup: js.UndefOr[AwsAutoScalingAutoScalingGroupDetails] = js.undefined,
        AwsAutoScalingLaunchConfiguration: js.UndefOr[AwsAutoScalingLaunchConfigurationDetails] = js.undefined,
        AwsBackupBackupPlan: js.UndefOr[AwsBackupBackupPlanDetails] = js.undefined,
        AwsBackupBackupVault: js.UndefOr[AwsBackupBackupVaultDetails] = js.undefined,
        AwsBackupRecoveryPoint: js.UndefOr[AwsBackupRecoveryPointDetails] = js.undefined,
        AwsCertificateManagerCertificate: js.UndefOr[AwsCertificateManagerCertificateDetails] = js.undefined,
        AwsCloudFormationStack: js.UndefOr[AwsCloudFormationStackDetails] = js.undefined,
        AwsCloudFrontDistribution: js.UndefOr[AwsCloudFrontDistributionDetails] = js.undefined,
        AwsCloudTrailTrail: js.UndefOr[AwsCloudTrailTrailDetails] = js.undefined,
        AwsCloudWatchAlarm: js.UndefOr[AwsCloudWatchAlarmDetails] = js.undefined,
        AwsCodeBuildProject: js.UndefOr[AwsCodeBuildProjectDetails] = js.undefined,
        AwsDynamoDbTable: js.UndefOr[AwsDynamoDbTableDetails] = js.undefined,
        AwsEc2Eip: js.UndefOr[AwsEc2EipDetails] = js.undefined,
        AwsEc2Instance: js.UndefOr[AwsEc2InstanceDetails] = js.undefined,
        AwsEc2NetworkAcl: js.UndefOr[AwsEc2NetworkAclDetails] = js.undefined,
        AwsEc2NetworkInterface: js.UndefOr[AwsEc2NetworkInterfaceDetails] = js.undefined,
        AwsEc2SecurityGroup: js.UndefOr[AwsEc2SecurityGroupDetails] = js.undefined,
        AwsEc2Subnet: js.UndefOr[AwsEc2SubnetDetails] = js.undefined,
        AwsEc2TransitGateway: js.UndefOr[AwsEc2TransitGatewayDetails] = js.undefined,
        AwsEc2Volume: js.UndefOr[AwsEc2VolumeDetails] = js.undefined,
        AwsEc2Vpc: js.UndefOr[AwsEc2VpcDetails] = js.undefined,
        AwsEc2VpcEndpointService: js.UndefOr[AwsEc2VpcEndpointServiceDetails] = js.undefined,
        AwsEc2VpcPeeringConnection: js.UndefOr[AwsEc2VpcPeeringConnectionDetails] = js.undefined,
        AwsEc2VpnConnection: js.UndefOr[AwsEc2VpnConnectionDetails] = js.undefined,
        AwsEcrContainerImage: js.UndefOr[AwsEcrContainerImageDetails] = js.undefined,
        AwsEcrRepository: js.UndefOr[AwsEcrRepositoryDetails] = js.undefined,
        AwsEcsCluster: js.UndefOr[AwsEcsClusterDetails] = js.undefined,
        AwsEcsContainer: js.UndefOr[AwsEcsContainerDetails] = js.undefined,
        AwsEcsService: js.UndefOr[AwsEcsServiceDetails] = js.undefined,
        AwsEcsTask: js.UndefOr[AwsEcsTaskDetails] = js.undefined,
        AwsEcsTaskDefinition: js.UndefOr[AwsEcsTaskDefinitionDetails] = js.undefined,
        AwsEfsAccessPoint: js.UndefOr[AwsEfsAccessPointDetails] = js.undefined,
        AwsEksCluster: js.UndefOr[AwsEksClusterDetails] = js.undefined,
        AwsElasticBeanstalkEnvironment: js.UndefOr[AwsElasticBeanstalkEnvironmentDetails] = js.undefined,
        AwsElasticsearchDomain: js.UndefOr[AwsElasticsearchDomainDetails] = js.undefined,
        AwsElbLoadBalancer: js.UndefOr[AwsElbLoadBalancerDetails] = js.undefined,
        AwsElbv2LoadBalancer: js.UndefOr[AwsElbv2LoadBalancerDetails] = js.undefined,
        AwsIamAccessKey: js.UndefOr[AwsIamAccessKeyDetails] = js.undefined,
        AwsIamGroup: js.UndefOr[AwsIamGroupDetails] = js.undefined,
        AwsIamPolicy: js.UndefOr[AwsIamPolicyDetails] = js.undefined,
        AwsIamRole: js.UndefOr[AwsIamRoleDetails] = js.undefined,
        AwsIamUser: js.UndefOr[AwsIamUserDetails] = js.undefined,
        AwsKinesisStream: js.UndefOr[AwsKinesisStreamDetails] = js.undefined,
        AwsKmsKey: js.UndefOr[AwsKmsKeyDetails] = js.undefined,
        AwsLambdaFunction: js.UndefOr[AwsLambdaFunctionDetails] = js.undefined,
        AwsLambdaLayerVersion: js.UndefOr[AwsLambdaLayerVersionDetails] = js.undefined,
        AwsNetworkFirewallFirewall: js.UndefOr[AwsNetworkFirewallFirewallDetails] = js.undefined,
        AwsNetworkFirewallFirewallPolicy: js.UndefOr[AwsNetworkFirewallFirewallPolicyDetails] = js.undefined,
        AwsNetworkFirewallRuleGroup: js.UndefOr[AwsNetworkFirewallRuleGroupDetails] = js.undefined,
        AwsOpenSearchServiceDomain: js.UndefOr[AwsOpenSearchServiceDomainDetails] = js.undefined,
        AwsRdsDbCluster: js.UndefOr[AwsRdsDbClusterDetails] = js.undefined,
        AwsRdsDbClusterSnapshot: js.UndefOr[AwsRdsDbClusterSnapshotDetails] = js.undefined,
        AwsRdsDbInstance: js.UndefOr[AwsRdsDbInstanceDetails] = js.undefined,
        AwsRdsDbSecurityGroup: js.UndefOr[AwsRdsDbSecurityGroupDetails] = js.undefined,
        AwsRdsDbSnapshot: js.UndefOr[AwsRdsDbSnapshotDetails] = js.undefined,
        AwsRdsEventSubscription: js.UndefOr[AwsRdsEventSubscriptionDetails] = js.undefined,
        AwsRedshiftCluster: js.UndefOr[AwsRedshiftClusterDetails] = js.undefined,
        AwsS3AccountPublicAccessBlock: js.UndefOr[AwsS3AccountPublicAccessBlockDetails] = js.undefined,
        AwsS3Bucket: js.UndefOr[AwsS3BucketDetails] = js.undefined,
        AwsS3Object: js.UndefOr[AwsS3ObjectDetails] = js.undefined,
        AwsSecretsManagerSecret: js.UndefOr[AwsSecretsManagerSecretDetails] = js.undefined,
        AwsSnsTopic: js.UndefOr[AwsSnsTopicDetails] = js.undefined,
        AwsSqsQueue: js.UndefOr[AwsSqsQueueDetails] = js.undefined,
        AwsSsmPatchCompliance: js.UndefOr[AwsSsmPatchComplianceDetails] = js.undefined,
        AwsWafRateBasedRule: js.UndefOr[AwsWafRateBasedRuleDetails] = js.undefined,
        AwsWafRegionalRateBasedRule: js.UndefOr[AwsWafRegionalRateBasedRuleDetails] = js.undefined,
        AwsWafRegionalRule: js.UndefOr[AwsWafRegionalRuleDetails] = js.undefined,
        AwsWafRegionalRuleGroup: js.UndefOr[AwsWafRegionalRuleGroupDetails] = js.undefined,
        AwsWafRegionalWebAcl: js.UndefOr[AwsWafRegionalWebAclDetails] = js.undefined,
        AwsWafRule: js.UndefOr[AwsWafRuleDetails] = js.undefined,
        AwsWafRuleGroup: js.UndefOr[AwsWafRuleGroupDetails] = js.undefined,
        AwsWafWebAcl: js.UndefOr[AwsWafWebAclDetails] = js.undefined,
        AwsXrayEncryptionConfig: js.UndefOr[AwsXrayEncryptionConfigDetails] = js.undefined,
        Container: js.UndefOr[ContainerDetails] = js.undefined,
        Other: js.UndefOr[FieldMap] = js.undefined
    ): ResourceDetails = {
      val __obj = js.Dynamic.literal()
      AwsApiGatewayRestApi.foreach(__v => __obj.updateDynamic("AwsApiGatewayRestApi")(__v.asInstanceOf[js.Any]))
      AwsApiGatewayStage.foreach(__v => __obj.updateDynamic("AwsApiGatewayStage")(__v.asInstanceOf[js.Any]))
      AwsApiGatewayV2Api.foreach(__v => __obj.updateDynamic("AwsApiGatewayV2Api")(__v.asInstanceOf[js.Any]))
      AwsApiGatewayV2Stage.foreach(__v => __obj.updateDynamic("AwsApiGatewayV2Stage")(__v.asInstanceOf[js.Any]))
      AwsAutoScalingAutoScalingGroup.foreach(__v => __obj.updateDynamic("AwsAutoScalingAutoScalingGroup")(__v.asInstanceOf[js.Any]))
      AwsAutoScalingLaunchConfiguration.foreach(__v => __obj.updateDynamic("AwsAutoScalingLaunchConfiguration")(__v.asInstanceOf[js.Any]))
      AwsBackupBackupPlan.foreach(__v => __obj.updateDynamic("AwsBackupBackupPlan")(__v.asInstanceOf[js.Any]))
      AwsBackupBackupVault.foreach(__v => __obj.updateDynamic("AwsBackupBackupVault")(__v.asInstanceOf[js.Any]))
      AwsBackupRecoveryPoint.foreach(__v => __obj.updateDynamic("AwsBackupRecoveryPoint")(__v.asInstanceOf[js.Any]))
      AwsCertificateManagerCertificate.foreach(__v => __obj.updateDynamic("AwsCertificateManagerCertificate")(__v.asInstanceOf[js.Any]))
      AwsCloudFormationStack.foreach(__v => __obj.updateDynamic("AwsCloudFormationStack")(__v.asInstanceOf[js.Any]))
      AwsCloudFrontDistribution.foreach(__v => __obj.updateDynamic("AwsCloudFrontDistribution")(__v.asInstanceOf[js.Any]))
      AwsCloudTrailTrail.foreach(__v => __obj.updateDynamic("AwsCloudTrailTrail")(__v.asInstanceOf[js.Any]))
      AwsCloudWatchAlarm.foreach(__v => __obj.updateDynamic("AwsCloudWatchAlarm")(__v.asInstanceOf[js.Any]))
      AwsCodeBuildProject.foreach(__v => __obj.updateDynamic("AwsCodeBuildProject")(__v.asInstanceOf[js.Any]))
      AwsDynamoDbTable.foreach(__v => __obj.updateDynamic("AwsDynamoDbTable")(__v.asInstanceOf[js.Any]))
      AwsEc2Eip.foreach(__v => __obj.updateDynamic("AwsEc2Eip")(__v.asInstanceOf[js.Any]))
      AwsEc2Instance.foreach(__v => __obj.updateDynamic("AwsEc2Instance")(__v.asInstanceOf[js.Any]))
      AwsEc2NetworkAcl.foreach(__v => __obj.updateDynamic("AwsEc2NetworkAcl")(__v.asInstanceOf[js.Any]))
      AwsEc2NetworkInterface.foreach(__v => __obj.updateDynamic("AwsEc2NetworkInterface")(__v.asInstanceOf[js.Any]))
      AwsEc2SecurityGroup.foreach(__v => __obj.updateDynamic("AwsEc2SecurityGroup")(__v.asInstanceOf[js.Any]))
      AwsEc2Subnet.foreach(__v => __obj.updateDynamic("AwsEc2Subnet")(__v.asInstanceOf[js.Any]))
      AwsEc2TransitGateway.foreach(__v => __obj.updateDynamic("AwsEc2TransitGateway")(__v.asInstanceOf[js.Any]))
      AwsEc2Volume.foreach(__v => __obj.updateDynamic("AwsEc2Volume")(__v.asInstanceOf[js.Any]))
      AwsEc2Vpc.foreach(__v => __obj.updateDynamic("AwsEc2Vpc")(__v.asInstanceOf[js.Any]))
      AwsEc2VpcEndpointService.foreach(__v => __obj.updateDynamic("AwsEc2VpcEndpointService")(__v.asInstanceOf[js.Any]))
      AwsEc2VpcPeeringConnection.foreach(__v => __obj.updateDynamic("AwsEc2VpcPeeringConnection")(__v.asInstanceOf[js.Any]))
      AwsEc2VpnConnection.foreach(__v => __obj.updateDynamic("AwsEc2VpnConnection")(__v.asInstanceOf[js.Any]))
      AwsEcrContainerImage.foreach(__v => __obj.updateDynamic("AwsEcrContainerImage")(__v.asInstanceOf[js.Any]))
      AwsEcrRepository.foreach(__v => __obj.updateDynamic("AwsEcrRepository")(__v.asInstanceOf[js.Any]))
      AwsEcsCluster.foreach(__v => __obj.updateDynamic("AwsEcsCluster")(__v.asInstanceOf[js.Any]))
      AwsEcsContainer.foreach(__v => __obj.updateDynamic("AwsEcsContainer")(__v.asInstanceOf[js.Any]))
      AwsEcsService.foreach(__v => __obj.updateDynamic("AwsEcsService")(__v.asInstanceOf[js.Any]))
      AwsEcsTask.foreach(__v => __obj.updateDynamic("AwsEcsTask")(__v.asInstanceOf[js.Any]))
      AwsEcsTaskDefinition.foreach(__v => __obj.updateDynamic("AwsEcsTaskDefinition")(__v.asInstanceOf[js.Any]))
      AwsEfsAccessPoint.foreach(__v => __obj.updateDynamic("AwsEfsAccessPoint")(__v.asInstanceOf[js.Any]))
      AwsEksCluster.foreach(__v => __obj.updateDynamic("AwsEksCluster")(__v.asInstanceOf[js.Any]))
      AwsElasticBeanstalkEnvironment.foreach(__v => __obj.updateDynamic("AwsElasticBeanstalkEnvironment")(__v.asInstanceOf[js.Any]))
      AwsElasticsearchDomain.foreach(__v => __obj.updateDynamic("AwsElasticsearchDomain")(__v.asInstanceOf[js.Any]))
      AwsElbLoadBalancer.foreach(__v => __obj.updateDynamic("AwsElbLoadBalancer")(__v.asInstanceOf[js.Any]))
      AwsElbv2LoadBalancer.foreach(__v => __obj.updateDynamic("AwsElbv2LoadBalancer")(__v.asInstanceOf[js.Any]))
      AwsIamAccessKey.foreach(__v => __obj.updateDynamic("AwsIamAccessKey")(__v.asInstanceOf[js.Any]))
      AwsIamGroup.foreach(__v => __obj.updateDynamic("AwsIamGroup")(__v.asInstanceOf[js.Any]))
      AwsIamPolicy.foreach(__v => __obj.updateDynamic("AwsIamPolicy")(__v.asInstanceOf[js.Any]))
      AwsIamRole.foreach(__v => __obj.updateDynamic("AwsIamRole")(__v.asInstanceOf[js.Any]))
      AwsIamUser.foreach(__v => __obj.updateDynamic("AwsIamUser")(__v.asInstanceOf[js.Any]))
      AwsKinesisStream.foreach(__v => __obj.updateDynamic("AwsKinesisStream")(__v.asInstanceOf[js.Any]))
      AwsKmsKey.foreach(__v => __obj.updateDynamic("AwsKmsKey")(__v.asInstanceOf[js.Any]))
      AwsLambdaFunction.foreach(__v => __obj.updateDynamic("AwsLambdaFunction")(__v.asInstanceOf[js.Any]))
      AwsLambdaLayerVersion.foreach(__v => __obj.updateDynamic("AwsLambdaLayerVersion")(__v.asInstanceOf[js.Any]))
      AwsNetworkFirewallFirewall.foreach(__v => __obj.updateDynamic("AwsNetworkFirewallFirewall")(__v.asInstanceOf[js.Any]))
      AwsNetworkFirewallFirewallPolicy.foreach(__v => __obj.updateDynamic("AwsNetworkFirewallFirewallPolicy")(__v.asInstanceOf[js.Any]))
      AwsNetworkFirewallRuleGroup.foreach(__v => __obj.updateDynamic("AwsNetworkFirewallRuleGroup")(__v.asInstanceOf[js.Any]))
      AwsOpenSearchServiceDomain.foreach(__v => __obj.updateDynamic("AwsOpenSearchServiceDomain")(__v.asInstanceOf[js.Any]))
      AwsRdsDbCluster.foreach(__v => __obj.updateDynamic("AwsRdsDbCluster")(__v.asInstanceOf[js.Any]))
      AwsRdsDbClusterSnapshot.foreach(__v => __obj.updateDynamic("AwsRdsDbClusterSnapshot")(__v.asInstanceOf[js.Any]))
      AwsRdsDbInstance.foreach(__v => __obj.updateDynamic("AwsRdsDbInstance")(__v.asInstanceOf[js.Any]))
      AwsRdsDbSecurityGroup.foreach(__v => __obj.updateDynamic("AwsRdsDbSecurityGroup")(__v.asInstanceOf[js.Any]))
      AwsRdsDbSnapshot.foreach(__v => __obj.updateDynamic("AwsRdsDbSnapshot")(__v.asInstanceOf[js.Any]))
      AwsRdsEventSubscription.foreach(__v => __obj.updateDynamic("AwsRdsEventSubscription")(__v.asInstanceOf[js.Any]))
      AwsRedshiftCluster.foreach(__v => __obj.updateDynamic("AwsRedshiftCluster")(__v.asInstanceOf[js.Any]))
      AwsS3AccountPublicAccessBlock.foreach(__v => __obj.updateDynamic("AwsS3AccountPublicAccessBlock")(__v.asInstanceOf[js.Any]))
      AwsS3Bucket.foreach(__v => __obj.updateDynamic("AwsS3Bucket")(__v.asInstanceOf[js.Any]))
      AwsS3Object.foreach(__v => __obj.updateDynamic("AwsS3Object")(__v.asInstanceOf[js.Any]))
      AwsSecretsManagerSecret.foreach(__v => __obj.updateDynamic("AwsSecretsManagerSecret")(__v.asInstanceOf[js.Any]))
      AwsSnsTopic.foreach(__v => __obj.updateDynamic("AwsSnsTopic")(__v.asInstanceOf[js.Any]))
      AwsSqsQueue.foreach(__v => __obj.updateDynamic("AwsSqsQueue")(__v.asInstanceOf[js.Any]))
      AwsSsmPatchCompliance.foreach(__v => __obj.updateDynamic("AwsSsmPatchCompliance")(__v.asInstanceOf[js.Any]))
      AwsWafRateBasedRule.foreach(__v => __obj.updateDynamic("AwsWafRateBasedRule")(__v.asInstanceOf[js.Any]))
      AwsWafRegionalRateBasedRule.foreach(__v => __obj.updateDynamic("AwsWafRegionalRateBasedRule")(__v.asInstanceOf[js.Any]))
      AwsWafRegionalRule.foreach(__v => __obj.updateDynamic("AwsWafRegionalRule")(__v.asInstanceOf[js.Any]))
      AwsWafRegionalRuleGroup.foreach(__v => __obj.updateDynamic("AwsWafRegionalRuleGroup")(__v.asInstanceOf[js.Any]))
      AwsWafRegionalWebAcl.foreach(__v => __obj.updateDynamic("AwsWafRegionalWebAcl")(__v.asInstanceOf[js.Any]))
      AwsWafRule.foreach(__v => __obj.updateDynamic("AwsWafRule")(__v.asInstanceOf[js.Any]))
      AwsWafRuleGroup.foreach(__v => __obj.updateDynamic("AwsWafRuleGroup")(__v.asInstanceOf[js.Any]))
      AwsWafWebAcl.foreach(__v => __obj.updateDynamic("AwsWafWebAcl")(__v.asInstanceOf[js.Any]))
      AwsXrayEncryptionConfig.foreach(__v => __obj.updateDynamic("AwsXrayEncryptionConfig")(__v.asInstanceOf[js.Any]))
      Container.foreach(__v => __obj.updateDynamic("Container")(__v.asInstanceOf[js.Any]))
      Other.foreach(__v => __obj.updateDynamic("Other")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceDetails]
    }
  }

  /** Details about the account that was not processed.
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

  /** Details about the rule group.
    */
  @js.native
  trait RuleGroupDetails extends js.Object {
    var RuleVariables: js.UndefOr[RuleGroupVariables]
    var RulesSource: js.UndefOr[RuleGroupSource]
  }

  object RuleGroupDetails {
    @inline
    def apply(
        RuleVariables: js.UndefOr[RuleGroupVariables] = js.undefined,
        RulesSource: js.UndefOr[RuleGroupSource] = js.undefined
    ): RuleGroupDetails = {
      val __obj = js.Dynamic.literal()
      RuleVariables.foreach(__v => __obj.updateDynamic("RuleVariables")(__v.asInstanceOf[js.Any]))
      RulesSource.foreach(__v => __obj.updateDynamic("RulesSource")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RuleGroupDetails]
    }
  }

  /** The rules and actions for the rule group.
    */
  @js.native
  trait RuleGroupSource extends js.Object {
    var RulesSourceList: js.UndefOr[RuleGroupSourceListDetails]
    var RulesString: js.UndefOr[NonEmptyString]
    var StatefulRules: js.UndefOr[RuleGroupSourceStatefulRulesList]
    var StatelessRulesAndCustomActions: js.UndefOr[RuleGroupSourceStatelessRulesAndCustomActionsDetails]
  }

  object RuleGroupSource {
    @inline
    def apply(
        RulesSourceList: js.UndefOr[RuleGroupSourceListDetails] = js.undefined,
        RulesString: js.UndefOr[NonEmptyString] = js.undefined,
        StatefulRules: js.UndefOr[RuleGroupSourceStatefulRulesList] = js.undefined,
        StatelessRulesAndCustomActions: js.UndefOr[RuleGroupSourceStatelessRulesAndCustomActionsDetails] = js.undefined
    ): RuleGroupSource = {
      val __obj = js.Dynamic.literal()
      RulesSourceList.foreach(__v => __obj.updateDynamic("RulesSourceList")(__v.asInstanceOf[js.Any]))
      RulesString.foreach(__v => __obj.updateDynamic("RulesString")(__v.asInstanceOf[js.Any]))
      StatefulRules.foreach(__v => __obj.updateDynamic("StatefulRules")(__v.asInstanceOf[js.Any]))
      StatelessRulesAndCustomActions.foreach(__v => __obj.updateDynamic("StatelessRulesAndCustomActions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RuleGroupSource]
    }
  }

  /** A custom action definition. A custom action is an optional, non-standard action to use for stateless packet handling.
    */
  @js.native
  trait RuleGroupSourceCustomActionsDetails extends js.Object {
    var ActionDefinition: js.UndefOr[StatelessCustomActionDefinition]
    var ActionName: js.UndefOr[NonEmptyString]
  }

  object RuleGroupSourceCustomActionsDetails {
    @inline
    def apply(
        ActionDefinition: js.UndefOr[StatelessCustomActionDefinition] = js.undefined,
        ActionName: js.UndefOr[NonEmptyString] = js.undefined
    ): RuleGroupSourceCustomActionsDetails = {
      val __obj = js.Dynamic.literal()
      ActionDefinition.foreach(__v => __obj.updateDynamic("ActionDefinition")(__v.asInstanceOf[js.Any]))
      ActionName.foreach(__v => __obj.updateDynamic("ActionName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RuleGroupSourceCustomActionsDetails]
    }
  }

  /** Stateful inspection criteria for a domain list rule group.
    */
  @js.native
  trait RuleGroupSourceListDetails extends js.Object {
    var GeneratedRulesType: js.UndefOr[NonEmptyString]
    var TargetTypes: js.UndefOr[NonEmptyStringList]
    var Targets: js.UndefOr[NonEmptyStringList]
  }

  object RuleGroupSourceListDetails {
    @inline
    def apply(
        GeneratedRulesType: js.UndefOr[NonEmptyString] = js.undefined,
        TargetTypes: js.UndefOr[NonEmptyStringList] = js.undefined,
        Targets: js.UndefOr[NonEmptyStringList] = js.undefined
    ): RuleGroupSourceListDetails = {
      val __obj = js.Dynamic.literal()
      GeneratedRulesType.foreach(__v => __obj.updateDynamic("GeneratedRulesType")(__v.asInstanceOf[js.Any]))
      TargetTypes.foreach(__v => __obj.updateDynamic("TargetTypes")(__v.asInstanceOf[js.Any]))
      Targets.foreach(__v => __obj.updateDynamic("Targets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RuleGroupSourceListDetails]
    }
  }

  /** A Suricata rule specification.
    */
  @js.native
  trait RuleGroupSourceStatefulRulesDetails extends js.Object {
    var Action: js.UndefOr[NonEmptyString]
    var Header: js.UndefOr[RuleGroupSourceStatefulRulesHeaderDetails]
    var RuleOptions: js.UndefOr[RuleGroupSourceStatefulRulesOptionsList]
  }

  object RuleGroupSourceStatefulRulesDetails {
    @inline
    def apply(
        Action: js.UndefOr[NonEmptyString] = js.undefined,
        Header: js.UndefOr[RuleGroupSourceStatefulRulesHeaderDetails] = js.undefined,
        RuleOptions: js.UndefOr[RuleGroupSourceStatefulRulesOptionsList] = js.undefined
    ): RuleGroupSourceStatefulRulesDetails = {
      val __obj = js.Dynamic.literal()
      Action.foreach(__v => __obj.updateDynamic("Action")(__v.asInstanceOf[js.Any]))
      Header.foreach(__v => __obj.updateDynamic("Header")(__v.asInstanceOf[js.Any]))
      RuleOptions.foreach(__v => __obj.updateDynamic("RuleOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RuleGroupSourceStatefulRulesDetails]
    }
  }

  /** The inspection criteria for a stateful rule.
    */
  @js.native
  trait RuleGroupSourceStatefulRulesHeaderDetails extends js.Object {
    var Destination: js.UndefOr[NonEmptyString]
    var DestinationPort: js.UndefOr[NonEmptyString]
    var Direction: js.UndefOr[NonEmptyString]
    var Protocol: js.UndefOr[NonEmptyString]
    var Source: js.UndefOr[NonEmptyString]
    var SourcePort: js.UndefOr[NonEmptyString]
  }

  object RuleGroupSourceStatefulRulesHeaderDetails {
    @inline
    def apply(
        Destination: js.UndefOr[NonEmptyString] = js.undefined,
        DestinationPort: js.UndefOr[NonEmptyString] = js.undefined,
        Direction: js.UndefOr[NonEmptyString] = js.undefined,
        Protocol: js.UndefOr[NonEmptyString] = js.undefined,
        Source: js.UndefOr[NonEmptyString] = js.undefined,
        SourcePort: js.UndefOr[NonEmptyString] = js.undefined
    ): RuleGroupSourceStatefulRulesHeaderDetails = {
      val __obj = js.Dynamic.literal()
      Destination.foreach(__v => __obj.updateDynamic("Destination")(__v.asInstanceOf[js.Any]))
      DestinationPort.foreach(__v => __obj.updateDynamic("DestinationPort")(__v.asInstanceOf[js.Any]))
      Direction.foreach(__v => __obj.updateDynamic("Direction")(__v.asInstanceOf[js.Any]))
      Protocol.foreach(__v => __obj.updateDynamic("Protocol")(__v.asInstanceOf[js.Any]))
      Source.foreach(__v => __obj.updateDynamic("Source")(__v.asInstanceOf[js.Any]))
      SourcePort.foreach(__v => __obj.updateDynamic("SourcePort")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RuleGroupSourceStatefulRulesHeaderDetails]
    }
  }

  /** A rule option for a stateful rule.
    */
  @js.native
  trait RuleGroupSourceStatefulRulesOptionsDetails extends js.Object {
    var Keyword: js.UndefOr[NonEmptyString]
    var Settings: js.UndefOr[RuleGroupSourceStatefulRulesRuleOptionsSettingsList]
  }

  object RuleGroupSourceStatefulRulesOptionsDetails {
    @inline
    def apply(
        Keyword: js.UndefOr[NonEmptyString] = js.undefined,
        Settings: js.UndefOr[RuleGroupSourceStatefulRulesRuleOptionsSettingsList] = js.undefined
    ): RuleGroupSourceStatefulRulesOptionsDetails = {
      val __obj = js.Dynamic.literal()
      Keyword.foreach(__v => __obj.updateDynamic("Keyword")(__v.asInstanceOf[js.Any]))
      Settings.foreach(__v => __obj.updateDynamic("Settings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RuleGroupSourceStatefulRulesOptionsDetails]
    }
  }

  /** The definition of the stateless rule.
    */
  @js.native
  trait RuleGroupSourceStatelessRuleDefinition extends js.Object {
    var Actions: js.UndefOr[NonEmptyStringList]
    var MatchAttributes: js.UndefOr[RuleGroupSourceStatelessRuleMatchAttributes]
  }

  object RuleGroupSourceStatelessRuleDefinition {
    @inline
    def apply(
        Actions: js.UndefOr[NonEmptyStringList] = js.undefined,
        MatchAttributes: js.UndefOr[RuleGroupSourceStatelessRuleMatchAttributes] = js.undefined
    ): RuleGroupSourceStatelessRuleDefinition = {
      val __obj = js.Dynamic.literal()
      Actions.foreach(__v => __obj.updateDynamic("Actions")(__v.asInstanceOf[js.Any]))
      MatchAttributes.foreach(__v => __obj.updateDynamic("MatchAttributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RuleGroupSourceStatelessRuleDefinition]
    }
  }

  /** Criteria for the stateless rule.
    */
  @js.native
  trait RuleGroupSourceStatelessRuleMatchAttributes extends js.Object {
    var DestinationPorts: js.UndefOr[RuleGroupSourceStatelessRuleMatchAttributesDestinationPortsList]
    var Destinations: js.UndefOr[RuleGroupSourceStatelessRuleMatchAttributesDestinationsList]
    var Protocols: js.UndefOr[RuleGroupSourceStatelessRuleMatchAttributesProtocolsList]
    var SourcePorts: js.UndefOr[RuleGroupSourceStatelessRuleMatchAttributesSourcePortsList]
    var Sources: js.UndefOr[RuleGroupSourceStatelessRuleMatchAttributesSourcesList]
    var TcpFlags: js.UndefOr[RuleGroupSourceStatelessRuleMatchAttributesTcpFlagsList]
  }

  object RuleGroupSourceStatelessRuleMatchAttributes {
    @inline
    def apply(
        DestinationPorts: js.UndefOr[RuleGroupSourceStatelessRuleMatchAttributesDestinationPortsList] = js.undefined,
        Destinations: js.UndefOr[RuleGroupSourceStatelessRuleMatchAttributesDestinationsList] = js.undefined,
        Protocols: js.UndefOr[RuleGroupSourceStatelessRuleMatchAttributesProtocolsList] = js.undefined,
        SourcePorts: js.UndefOr[RuleGroupSourceStatelessRuleMatchAttributesSourcePortsList] = js.undefined,
        Sources: js.UndefOr[RuleGroupSourceStatelessRuleMatchAttributesSourcesList] = js.undefined,
        TcpFlags: js.UndefOr[RuleGroupSourceStatelessRuleMatchAttributesTcpFlagsList] = js.undefined
    ): RuleGroupSourceStatelessRuleMatchAttributes = {
      val __obj = js.Dynamic.literal()
      DestinationPorts.foreach(__v => __obj.updateDynamic("DestinationPorts")(__v.asInstanceOf[js.Any]))
      Destinations.foreach(__v => __obj.updateDynamic("Destinations")(__v.asInstanceOf[js.Any]))
      Protocols.foreach(__v => __obj.updateDynamic("Protocols")(__v.asInstanceOf[js.Any]))
      SourcePorts.foreach(__v => __obj.updateDynamic("SourcePorts")(__v.asInstanceOf[js.Any]))
      Sources.foreach(__v => __obj.updateDynamic("Sources")(__v.asInstanceOf[js.Any]))
      TcpFlags.foreach(__v => __obj.updateDynamic("TcpFlags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RuleGroupSourceStatelessRuleMatchAttributes]
    }
  }

  /** A port range to specify the destination ports to inspect for.
    */
  @js.native
  trait RuleGroupSourceStatelessRuleMatchAttributesDestinationPorts extends js.Object {
    var FromPort: js.UndefOr[Int]
    var ToPort: js.UndefOr[Int]
  }

  object RuleGroupSourceStatelessRuleMatchAttributesDestinationPorts {
    @inline
    def apply(
        FromPort: js.UndefOr[Int] = js.undefined,
        ToPort: js.UndefOr[Int] = js.undefined
    ): RuleGroupSourceStatelessRuleMatchAttributesDestinationPorts = {
      val __obj = js.Dynamic.literal()
      FromPort.foreach(__v => __obj.updateDynamic("FromPort")(__v.asInstanceOf[js.Any]))
      ToPort.foreach(__v => __obj.updateDynamic("ToPort")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RuleGroupSourceStatelessRuleMatchAttributesDestinationPorts]
    }
  }

  /** A destination IP address or range.
    */
  @js.native
  trait RuleGroupSourceStatelessRuleMatchAttributesDestinations extends js.Object {
    var AddressDefinition: js.UndefOr[NonEmptyString]
  }

  object RuleGroupSourceStatelessRuleMatchAttributesDestinations {
    @inline
    def apply(
        AddressDefinition: js.UndefOr[NonEmptyString] = js.undefined
    ): RuleGroupSourceStatelessRuleMatchAttributesDestinations = {
      val __obj = js.Dynamic.literal()
      AddressDefinition.foreach(__v => __obj.updateDynamic("AddressDefinition")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RuleGroupSourceStatelessRuleMatchAttributesDestinations]
    }
  }

  /** A port range to specify the source ports to inspect for.
    */
  @js.native
  trait RuleGroupSourceStatelessRuleMatchAttributesSourcePorts extends js.Object {
    var FromPort: js.UndefOr[Int]
    var ToPort: js.UndefOr[Int]
  }

  object RuleGroupSourceStatelessRuleMatchAttributesSourcePorts {
    @inline
    def apply(
        FromPort: js.UndefOr[Int] = js.undefined,
        ToPort: js.UndefOr[Int] = js.undefined
    ): RuleGroupSourceStatelessRuleMatchAttributesSourcePorts = {
      val __obj = js.Dynamic.literal()
      FromPort.foreach(__v => __obj.updateDynamic("FromPort")(__v.asInstanceOf[js.Any]))
      ToPort.foreach(__v => __obj.updateDynamic("ToPort")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RuleGroupSourceStatelessRuleMatchAttributesSourcePorts]
    }
  }

  /** A source IP addresses and address range to inspect for.
    */
  @js.native
  trait RuleGroupSourceStatelessRuleMatchAttributesSources extends js.Object {
    var AddressDefinition: js.UndefOr[NonEmptyString]
  }

  object RuleGroupSourceStatelessRuleMatchAttributesSources {
    @inline
    def apply(
        AddressDefinition: js.UndefOr[NonEmptyString] = js.undefined
    ): RuleGroupSourceStatelessRuleMatchAttributesSources = {
      val __obj = js.Dynamic.literal()
      AddressDefinition.foreach(__v => __obj.updateDynamic("AddressDefinition")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RuleGroupSourceStatelessRuleMatchAttributesSources]
    }
  }

  /** A set of TCP flags and masks to inspect for.
    */
  @js.native
  trait RuleGroupSourceStatelessRuleMatchAttributesTcpFlags extends js.Object {
    var Flags: js.UndefOr[NonEmptyStringList]
    var Masks: js.UndefOr[NonEmptyStringList]
  }

  object RuleGroupSourceStatelessRuleMatchAttributesTcpFlags {
    @inline
    def apply(
        Flags: js.UndefOr[NonEmptyStringList] = js.undefined,
        Masks: js.UndefOr[NonEmptyStringList] = js.undefined
    ): RuleGroupSourceStatelessRuleMatchAttributesTcpFlags = {
      val __obj = js.Dynamic.literal()
      Flags.foreach(__v => __obj.updateDynamic("Flags")(__v.asInstanceOf[js.Any]))
      Masks.foreach(__v => __obj.updateDynamic("Masks")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RuleGroupSourceStatelessRuleMatchAttributesTcpFlags]
    }
  }

  /** Stateless rules and custom actions for a stateless rule group.
    */
  @js.native
  trait RuleGroupSourceStatelessRulesAndCustomActionsDetails extends js.Object {
    var CustomActions: js.UndefOr[RuleGroupSourceCustomActionsList]
    var StatelessRules: js.UndefOr[RuleGroupSourceStatelessRulesList]
  }

  object RuleGroupSourceStatelessRulesAndCustomActionsDetails {
    @inline
    def apply(
        CustomActions: js.UndefOr[RuleGroupSourceCustomActionsList] = js.undefined,
        StatelessRules: js.UndefOr[RuleGroupSourceStatelessRulesList] = js.undefined
    ): RuleGroupSourceStatelessRulesAndCustomActionsDetails = {
      val __obj = js.Dynamic.literal()
      CustomActions.foreach(__v => __obj.updateDynamic("CustomActions")(__v.asInstanceOf[js.Any]))
      StatelessRules.foreach(__v => __obj.updateDynamic("StatelessRules")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RuleGroupSourceStatelessRulesAndCustomActionsDetails]
    }
  }

  /** A stateless rule in the rule group.
    */
  @js.native
  trait RuleGroupSourceStatelessRulesDetails extends js.Object {
    var Priority: js.UndefOr[Int]
    var RuleDefinition: js.UndefOr[RuleGroupSourceStatelessRuleDefinition]
  }

  object RuleGroupSourceStatelessRulesDetails {
    @inline
    def apply(
        Priority: js.UndefOr[Int] = js.undefined,
        RuleDefinition: js.UndefOr[RuleGroupSourceStatelessRuleDefinition] = js.undefined
    ): RuleGroupSourceStatelessRulesDetails = {
      val __obj = js.Dynamic.literal()
      Priority.foreach(__v => __obj.updateDynamic("Priority")(__v.asInstanceOf[js.Any]))
      RuleDefinition.foreach(__v => __obj.updateDynamic("RuleDefinition")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RuleGroupSourceStatelessRulesDetails]
    }
  }

  /** Additional settings to use in the specified rules.
    */
  @js.native
  trait RuleGroupVariables extends js.Object {
    var IpSets: js.UndefOr[RuleGroupVariablesIpSetsDetails]
    var PortSets: js.UndefOr[RuleGroupVariablesPortSetsDetails]
  }

  object RuleGroupVariables {
    @inline
    def apply(
        IpSets: js.UndefOr[RuleGroupVariablesIpSetsDetails] = js.undefined,
        PortSets: js.UndefOr[RuleGroupVariablesPortSetsDetails] = js.undefined
    ): RuleGroupVariables = {
      val __obj = js.Dynamic.literal()
      IpSets.foreach(__v => __obj.updateDynamic("IpSets")(__v.asInstanceOf[js.Any]))
      PortSets.foreach(__v => __obj.updateDynamic("PortSets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RuleGroupVariables]
    }
  }

  /** A list of IP addresses and address ranges, in CIDR notation.
    */
  @js.native
  trait RuleGroupVariablesIpSetsDetails extends js.Object {
    var Definition: js.UndefOr[NonEmptyStringList]
  }

  object RuleGroupVariablesIpSetsDetails {
    @inline
    def apply(
        Definition: js.UndefOr[NonEmptyStringList] = js.undefined
    ): RuleGroupVariablesIpSetsDetails = {
      val __obj = js.Dynamic.literal()
      Definition.foreach(__v => __obj.updateDynamic("Definition")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RuleGroupVariablesIpSetsDetails]
    }
  }

  /** A list of port ranges.
    */
  @js.native
  trait RuleGroupVariablesPortSetsDetails extends js.Object {
    var Definition: js.UndefOr[NonEmptyStringList]
  }

  object RuleGroupVariablesPortSetsDetails {
    @inline
    def apply(
        Definition: js.UndefOr[NonEmptyStringList] = js.undefined
    ): RuleGroupVariablesPortSetsDetails = {
      val __obj = js.Dynamic.literal()
      Definition.foreach(__v => __obj.updateDynamic("Definition")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RuleGroupVariablesPortSetsDetails]
    }
  }

  /** The list of detected instances of sensitive data.
    */
  @js.native
  trait SensitiveDataDetections extends js.Object {
    var Count: js.UndefOr[Double]
    var Occurrences: js.UndefOr[Occurrences]
    var Type: js.UndefOr[NonEmptyString]
  }

  object SensitiveDataDetections {
    @inline
    def apply(
        Count: js.UndefOr[Double] = js.undefined,
        Occurrences: js.UndefOr[Occurrences] = js.undefined,
        Type: js.UndefOr[NonEmptyString] = js.undefined
    ): SensitiveDataDetections = {
      val __obj = js.Dynamic.literal()
      Count.foreach(__v => __obj.updateDynamic("Count")(__v.asInstanceOf[js.Any]))
      Occurrences.foreach(__v => __obj.updateDynamic("Occurrences")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SensitiveDataDetections]
    }
  }

  /** Contains a detected instance of sensitive data that are based on built-in identifiers.
    */
  @js.native
  trait SensitiveDataResult extends js.Object {
    var Category: js.UndefOr[NonEmptyString]
    var Detections: js.UndefOr[SensitiveDataDetectionsList]
    var TotalCount: js.UndefOr[Double]
  }

  object SensitiveDataResult {
    @inline
    def apply(
        Category: js.UndefOr[NonEmptyString] = js.undefined,
        Detections: js.UndefOr[SensitiveDataDetectionsList] = js.undefined,
        TotalCount: js.UndefOr[Double] = js.undefined
    ): SensitiveDataResult = {
      val __obj = js.Dynamic.literal()
      Category.foreach(__v => __obj.updateDynamic("Category")(__v.asInstanceOf[js.Any]))
      Detections.foreach(__v => __obj.updateDynamic("Detections")(__v.asInstanceOf[js.Any]))
      TotalCount.foreach(__v => __obj.updateDynamic("TotalCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SensitiveDataResult]
    }
  }

  /** The severity of the finding. The finding provider can provide the initial severity. The finding provider can only update the severity if it has not been updated using <code>BatchUpdateFindings</code>. The finding must have either <code>Label</code> or <code>Normalized</code> populated. If only one of these attributes is populated, then Security Hub automatically populates the other one. If neither attribute is populated, then the finding is invalid. <code>Label</code> is the preferred attribute.
    */
  @js.native
  trait Severity extends js.Object {
    var Label: js.UndefOr[SeverityLabel]
    var Normalized: js.UndefOr[Int]
    var Original: js.UndefOr[NonEmptyString]
    var Product: js.UndefOr[Double]
  }

  object Severity {
    @inline
    def apply(
        Label: js.UndefOr[SeverityLabel] = js.undefined,
        Normalized: js.UndefOr[Int] = js.undefined,
        Original: js.UndefOr[NonEmptyString] = js.undefined,
        Product: js.UndefOr[Double] = js.undefined
    ): Severity = {
      val __obj = js.Dynamic.literal()
      Label.foreach(__v => __obj.updateDynamic("Label")(__v.asInstanceOf[js.Any]))
      Normalized.foreach(__v => __obj.updateDynamic("Normalized")(__v.asInstanceOf[js.Any]))
      Original.foreach(__v => __obj.updateDynamic("Original")(__v.asInstanceOf[js.Any]))
      Product.foreach(__v => __obj.updateDynamic("Product")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Severity]
    }
  }

  /** Updates to the severity information for a finding.
    */
  @js.native
  trait SeverityUpdate extends js.Object {
    var Label: js.UndefOr[SeverityLabel]
    var Normalized: js.UndefOr[RatioScale]
    var Product: js.UndefOr[Double]
  }

  object SeverityUpdate {
    @inline
    def apply(
        Label: js.UndefOr[SeverityLabel] = js.undefined,
        Normalized: js.UndefOr[RatioScale] = js.undefined,
        Product: js.UndefOr[Double] = js.undefined
    ): SeverityUpdate = {
      val __obj = js.Dynamic.literal()
      Label.foreach(__v => __obj.updateDynamic("Label")(__v.asInstanceOf[js.Any]))
      Normalized.foreach(__v => __obj.updateDynamic("Normalized")(__v.asInstanceOf[js.Any]))
      Product.foreach(__v => __obj.updateDynamic("Product")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SeverityUpdate]
    }
  }

  /** Information about a software package.
    */
  @js.native
  trait SoftwarePackage extends js.Object {
    var Architecture: js.UndefOr[NonEmptyString]
    var Epoch: js.UndefOr[NonEmptyString]
    var FilePath: js.UndefOr[NonEmptyString]
    var FixedInVersion: js.UndefOr[NonEmptyString]
    var Name: js.UndefOr[NonEmptyString]
    var PackageManager: js.UndefOr[NonEmptyString]
    var Release: js.UndefOr[NonEmptyString]
    var Remediation: js.UndefOr[NonEmptyString]
    var SourceLayerArn: js.UndefOr[NonEmptyString]
    var SourceLayerHash: js.UndefOr[NonEmptyString]
    var Version: js.UndefOr[NonEmptyString]
  }

  object SoftwarePackage {
    @inline
    def apply(
        Architecture: js.UndefOr[NonEmptyString] = js.undefined,
        Epoch: js.UndefOr[NonEmptyString] = js.undefined,
        FilePath: js.UndefOr[NonEmptyString] = js.undefined,
        FixedInVersion: js.UndefOr[NonEmptyString] = js.undefined,
        Name: js.UndefOr[NonEmptyString] = js.undefined,
        PackageManager: js.UndefOr[NonEmptyString] = js.undefined,
        Release: js.UndefOr[NonEmptyString] = js.undefined,
        Remediation: js.UndefOr[NonEmptyString] = js.undefined,
        SourceLayerArn: js.UndefOr[NonEmptyString] = js.undefined,
        SourceLayerHash: js.UndefOr[NonEmptyString] = js.undefined,
        Version: js.UndefOr[NonEmptyString] = js.undefined
    ): SoftwarePackage = {
      val __obj = js.Dynamic.literal()
      Architecture.foreach(__v => __obj.updateDynamic("Architecture")(__v.asInstanceOf[js.Any]))
      Epoch.foreach(__v => __obj.updateDynamic("Epoch")(__v.asInstanceOf[js.Any]))
      FilePath.foreach(__v => __obj.updateDynamic("FilePath")(__v.asInstanceOf[js.Any]))
      FixedInVersion.foreach(__v => __obj.updateDynamic("FixedInVersion")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      PackageManager.foreach(__v => __obj.updateDynamic("PackageManager")(__v.asInstanceOf[js.Any]))
      Release.foreach(__v => __obj.updateDynamic("Release")(__v.asInstanceOf[js.Any]))
      Remediation.foreach(__v => __obj.updateDynamic("Remediation")(__v.asInstanceOf[js.Any]))
      SourceLayerArn.foreach(__v => __obj.updateDynamic("SourceLayerArn")(__v.asInstanceOf[js.Any]))
      SourceLayerHash.foreach(__v => __obj.updateDynamic("SourceLayerHash")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SoftwarePackage]
    }
  }

  /** A collection of finding attributes used to sort findings.
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

  /** Provides information about a specific security standard.
    */
  @js.native
  trait Standard extends js.Object {
    var Description: js.UndefOr[NonEmptyString]
    var EnabledByDefault: js.UndefOr[Boolean]
    var Name: js.UndefOr[NonEmptyString]
    var StandardsArn: js.UndefOr[NonEmptyString]
    var StandardsManagedBy: js.UndefOr[StandardsManagedBy]
  }

  object Standard {
    @inline
    def apply(
        Description: js.UndefOr[NonEmptyString] = js.undefined,
        EnabledByDefault: js.UndefOr[Boolean] = js.undefined,
        Name: js.UndefOr[NonEmptyString] = js.undefined,
        StandardsArn: js.UndefOr[NonEmptyString] = js.undefined,
        StandardsManagedBy: js.UndefOr[StandardsManagedBy] = js.undefined
    ): Standard = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EnabledByDefault.foreach(__v => __obj.updateDynamic("EnabledByDefault")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      StandardsArn.foreach(__v => __obj.updateDynamic("StandardsArn")(__v.asInstanceOf[js.Any]))
      StandardsManagedBy.foreach(__v => __obj.updateDynamic("StandardsManagedBy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Standard]
    }
  }

  /** Details for an individual security standard control.
    */
  @js.native
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

  object StandardsControl {
    @inline
    def apply(
        ControlId: js.UndefOr[NonEmptyString] = js.undefined,
        ControlStatus: js.UndefOr[ControlStatus] = js.undefined,
        ControlStatusUpdatedAt: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[NonEmptyString] = js.undefined,
        DisabledReason: js.UndefOr[NonEmptyString] = js.undefined,
        RelatedRequirements: js.UndefOr[RelatedRequirementsList] = js.undefined,
        RemediationUrl: js.UndefOr[NonEmptyString] = js.undefined,
        SeverityRating: js.UndefOr[SeverityRating] = js.undefined,
        StandardsControlArn: js.UndefOr[NonEmptyString] = js.undefined,
        Title: js.UndefOr[NonEmptyString] = js.undefined
    ): StandardsControl = {
      val __obj = js.Dynamic.literal()
      ControlId.foreach(__v => __obj.updateDynamic("ControlId")(__v.asInstanceOf[js.Any]))
      ControlStatus.foreach(__v => __obj.updateDynamic("ControlStatus")(__v.asInstanceOf[js.Any]))
      ControlStatusUpdatedAt.foreach(__v => __obj.updateDynamic("ControlStatusUpdatedAt")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DisabledReason.foreach(__v => __obj.updateDynamic("DisabledReason")(__v.asInstanceOf[js.Any]))
      RelatedRequirements.foreach(__v => __obj.updateDynamic("RelatedRequirements")(__v.asInstanceOf[js.Any]))
      RemediationUrl.foreach(__v => __obj.updateDynamic("RemediationUrl")(__v.asInstanceOf[js.Any]))
      SeverityRating.foreach(__v => __obj.updateDynamic("SeverityRating")(__v.asInstanceOf[js.Any]))
      StandardsControlArn.foreach(__v => __obj.updateDynamic("StandardsControlArn")(__v.asInstanceOf[js.Any]))
      Title.foreach(__v => __obj.updateDynamic("Title")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StandardsControl]
    }
  }

  /** Provides details about the management of a security standard.
    */
  @js.native
  trait StandardsManagedBy extends js.Object {
    var Company: js.UndefOr[NonEmptyString]
    var Product: js.UndefOr[NonEmptyString]
  }

  object StandardsManagedBy {
    @inline
    def apply(
        Company: js.UndefOr[NonEmptyString] = js.undefined,
        Product: js.UndefOr[NonEmptyString] = js.undefined
    ): StandardsManagedBy = {
      val __obj = js.Dynamic.literal()
      Company.foreach(__v => __obj.updateDynamic("Company")(__v.asInstanceOf[js.Any]))
      Product.foreach(__v => __obj.updateDynamic("Product")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StandardsManagedBy]
    }
  }

  /** The reason for the current status of a standard subscription.
    */
  @js.native
  trait StandardsStatusReason extends js.Object {
    var StatusReasonCode: StatusReasonCode
  }

  object StandardsStatusReason {
    @inline
    def apply(
        StatusReasonCode: StatusReasonCode
    ): StandardsStatusReason = {
      val __obj = js.Dynamic.literal(
        "StatusReasonCode" -> StatusReasonCode.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StandardsStatusReason]
    }
  }

  /** A resource that represents your subscription to a supported standard.
    */
  @js.native
  trait StandardsSubscription extends js.Object {
    var StandardsArn: NonEmptyString
    var StandardsInput: StandardsInputParameterMap
    var StandardsStatus: StandardsStatus
    var StandardsSubscriptionArn: NonEmptyString
    var StandardsStatusReason: js.UndefOr[StandardsStatusReason]
  }

  object StandardsSubscription {
    @inline
    def apply(
        StandardsArn: NonEmptyString,
        StandardsInput: StandardsInputParameterMap,
        StandardsStatus: StandardsStatus,
        StandardsSubscriptionArn: NonEmptyString,
        StandardsStatusReason: js.UndefOr[StandardsStatusReason] = js.undefined
    ): StandardsSubscription = {
      val __obj = js.Dynamic.literal(
        "StandardsArn" -> StandardsArn.asInstanceOf[js.Any],
        "StandardsInput" -> StandardsInput.asInstanceOf[js.Any],
        "StandardsStatus" -> StandardsStatus.asInstanceOf[js.Any],
        "StandardsSubscriptionArn" -> StandardsSubscriptionArn.asInstanceOf[js.Any]
      )

      StandardsStatusReason.foreach(__v => __obj.updateDynamic("StandardsStatusReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StandardsSubscription]
    }
  }

  /** The standard that you want to enable.
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

  /** The definition of a custom action that can be used for stateless packet handling.
    */
  @js.native
  trait StatelessCustomActionDefinition extends js.Object {
    var PublishMetricAction: js.UndefOr[StatelessCustomPublishMetricAction]
  }

  object StatelessCustomActionDefinition {
    @inline
    def apply(
        PublishMetricAction: js.UndefOr[StatelessCustomPublishMetricAction] = js.undefined
    ): StatelessCustomActionDefinition = {
      val __obj = js.Dynamic.literal()
      PublishMetricAction.foreach(__v => __obj.updateDynamic("PublishMetricAction")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StatelessCustomActionDefinition]
    }
  }

  /** Information about metrics to publish to CloudWatch.
    */
  @js.native
  trait StatelessCustomPublishMetricAction extends js.Object {
    var Dimensions: js.UndefOr[StatelessCustomPublishMetricActionDimensionsList]
  }

  object StatelessCustomPublishMetricAction {
    @inline
    def apply(
        Dimensions: js.UndefOr[StatelessCustomPublishMetricActionDimensionsList] = js.undefined
    ): StatelessCustomPublishMetricAction = {
      val __obj = js.Dynamic.literal()
      Dimensions.foreach(__v => __obj.updateDynamic("Dimensions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StatelessCustomPublishMetricAction]
    }
  }

  /** Defines a CloudWatch dimension value to publish.
    */
  @js.native
  trait StatelessCustomPublishMetricActionDimension extends js.Object {
    var Value: js.UndefOr[NonEmptyString]
  }

  object StatelessCustomPublishMetricActionDimension {
    @inline
    def apply(
        Value: js.UndefOr[NonEmptyString] = js.undefined
    ): StatelessCustomPublishMetricActionDimension = {
      val __obj = js.Dynamic.literal()
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StatelessCustomPublishMetricActionDimension]
    }
  }

  /** Provides additional context for the value of <code>Compliance.Status</code>.
    */
  @js.native
  trait StatusReason extends js.Object {
    var ReasonCode: NonEmptyString
    var Description: js.UndefOr[NonEmptyString]
  }

  object StatusReason {
    @inline
    def apply(
        ReasonCode: NonEmptyString,
        Description: js.UndefOr[NonEmptyString] = js.undefined
    ): StatusReason = {
      val __obj = js.Dynamic.literal(
        "ReasonCode" -> ReasonCode.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StatusReason]
    }
  }

  /** A string filter for querying findings.
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

  /** Provides information about the threat detected in a security finding and the file paths that were affected by the threat.
    */
  @js.native
  trait Threat extends js.Object {
    var FilePaths: js.UndefOr[FilePathList]
    var ItemCount: js.UndefOr[Int]
    var Name: js.UndefOr[NonEmptyString]
    var Severity: js.UndefOr[NonEmptyString]
  }

  object Threat {
    @inline
    def apply(
        FilePaths: js.UndefOr[FilePathList] = js.undefined,
        ItemCount: js.UndefOr[Int] = js.undefined,
        Name: js.UndefOr[NonEmptyString] = js.undefined,
        Severity: js.UndefOr[NonEmptyString] = js.undefined
    ): Threat = {
      val __obj = js.Dynamic.literal()
      FilePaths.foreach(__v => __obj.updateDynamic("FilePaths")(__v.asInstanceOf[js.Any]))
      ItemCount.foreach(__v => __obj.updateDynamic("ItemCount")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Severity.foreach(__v => __obj.updateDynamic("Severity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Threat]
    }
  }

  /** Details about the threat intelligence related to a finding.
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
  trait UpdateActionTargetResponse extends js.Object

  object UpdateActionTargetResponse {
    @inline
    def apply(): UpdateActionTargetResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateActionTargetResponse]
    }
  }

  @js.native
  trait UpdateFindingAggregatorRequest extends js.Object {
    var FindingAggregatorArn: NonEmptyString
    var RegionLinkingMode: NonEmptyString
    var Regions: js.UndefOr[StringList]
  }

  object UpdateFindingAggregatorRequest {
    @inline
    def apply(
        FindingAggregatorArn: NonEmptyString,
        RegionLinkingMode: NonEmptyString,
        Regions: js.UndefOr[StringList] = js.undefined
    ): UpdateFindingAggregatorRequest = {
      val __obj = js.Dynamic.literal(
        "FindingAggregatorArn" -> FindingAggregatorArn.asInstanceOf[js.Any],
        "RegionLinkingMode" -> RegionLinkingMode.asInstanceOf[js.Any]
      )

      Regions.foreach(__v => __obj.updateDynamic("Regions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFindingAggregatorRequest]
    }
  }

  @js.native
  trait UpdateFindingAggregatorResponse extends js.Object {
    var FindingAggregationRegion: js.UndefOr[NonEmptyString]
    var FindingAggregatorArn: js.UndefOr[NonEmptyString]
    var RegionLinkingMode: js.UndefOr[NonEmptyString]
    var Regions: js.UndefOr[StringList]
  }

  object UpdateFindingAggregatorResponse {
    @inline
    def apply(
        FindingAggregationRegion: js.UndefOr[NonEmptyString] = js.undefined,
        FindingAggregatorArn: js.UndefOr[NonEmptyString] = js.undefined,
        RegionLinkingMode: js.UndefOr[NonEmptyString] = js.undefined,
        Regions: js.UndefOr[StringList] = js.undefined
    ): UpdateFindingAggregatorResponse = {
      val __obj = js.Dynamic.literal()
      FindingAggregationRegion.foreach(__v => __obj.updateDynamic("FindingAggregationRegion")(__v.asInstanceOf[js.Any]))
      FindingAggregatorArn.foreach(__v => __obj.updateDynamic("FindingAggregatorArn")(__v.asInstanceOf[js.Any]))
      RegionLinkingMode.foreach(__v => __obj.updateDynamic("RegionLinkingMode")(__v.asInstanceOf[js.Any]))
      Regions.foreach(__v => __obj.updateDynamic("Regions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFindingAggregatorResponse]
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
  trait UpdateFindingsResponse extends js.Object

  object UpdateFindingsResponse {
    @inline
    def apply(): UpdateFindingsResponse = {
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
  trait UpdateInsightResponse extends js.Object

  object UpdateInsightResponse {
    @inline
    def apply(): UpdateInsightResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateInsightResponse]
    }
  }

  @js.native
  trait UpdateOrganizationConfigurationRequest extends js.Object {
    var AutoEnable: Boolean
    var AutoEnableStandards: js.UndefOr[AutoEnableStandards]
  }

  object UpdateOrganizationConfigurationRequest {
    @inline
    def apply(
        AutoEnable: Boolean,
        AutoEnableStandards: js.UndefOr[AutoEnableStandards] = js.undefined
    ): UpdateOrganizationConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "AutoEnable" -> AutoEnable.asInstanceOf[js.Any]
      )

      AutoEnableStandards.foreach(__v => __obj.updateDynamic("AutoEnableStandards")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateOrganizationConfigurationRequest]
    }
  }

  @js.native
  trait UpdateOrganizationConfigurationResponse extends js.Object

  object UpdateOrganizationConfigurationResponse {
    @inline
    def apply(): UpdateOrganizationConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateOrganizationConfigurationResponse]
    }
  }

  @js.native
  trait UpdateSecurityHubConfigurationRequest extends js.Object {
    var AutoEnableControls: js.UndefOr[Boolean]
  }

  object UpdateSecurityHubConfigurationRequest {
    @inline
    def apply(
        AutoEnableControls: js.UndefOr[Boolean] = js.undefined
    ): UpdateSecurityHubConfigurationRequest = {
      val __obj = js.Dynamic.literal()
      AutoEnableControls.foreach(__v => __obj.updateDynamic("AutoEnableControls")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSecurityHubConfigurationRequest]
    }
  }

  @js.native
  trait UpdateSecurityHubConfigurationResponse extends js.Object

  object UpdateSecurityHubConfigurationResponse {
    @inline
    def apply(): UpdateSecurityHubConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateSecurityHubConfigurationResponse]
    }
  }

  @js.native
  trait UpdateStandardsControlRequest extends js.Object {
    var StandardsControlArn: NonEmptyString
    var ControlStatus: js.UndefOr[ControlStatus]
    var DisabledReason: js.UndefOr[NonEmptyString]
  }

  object UpdateStandardsControlRequest {
    @inline
    def apply(
        StandardsControlArn: NonEmptyString,
        ControlStatus: js.UndefOr[ControlStatus] = js.undefined,
        DisabledReason: js.UndefOr[NonEmptyString] = js.undefined
    ): UpdateStandardsControlRequest = {
      val __obj = js.Dynamic.literal(
        "StandardsControlArn" -> StandardsControlArn.asInstanceOf[js.Any]
      )

      ControlStatus.foreach(__v => __obj.updateDynamic("ControlStatus")(__v.asInstanceOf[js.Any]))
      DisabledReason.foreach(__v => __obj.updateDynamic("DisabledReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateStandardsControlRequest]
    }
  }

  @js.native
  trait UpdateStandardsControlResponse extends js.Object

  object UpdateStandardsControlResponse {
    @inline
    def apply(): UpdateStandardsControlResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateStandardsControlResponse]
    }
  }

  /** Describes the mounting of a volume in a container.
    */
  @js.native
  trait VolumeMount extends js.Object {
    var MountPath: js.UndefOr[NonEmptyString]
    var Name: js.UndefOr[NonEmptyString]
  }

  object VolumeMount {
    @inline
    def apply(
        MountPath: js.UndefOr[NonEmptyString] = js.undefined,
        Name: js.UndefOr[NonEmptyString] = js.undefined
    ): VolumeMount = {
      val __obj = js.Dynamic.literal()
      MountPath.foreach(__v => __obj.updateDynamic("MountPath")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VolumeMount]
    }
  }

  /** Provides details about the IPv4 CIDR blocks for the VPC.
    */
  @js.native
  trait VpcInfoCidrBlockSetDetails extends js.Object {
    var CidrBlock: js.UndefOr[NonEmptyString]
  }

  object VpcInfoCidrBlockSetDetails {
    @inline
    def apply(
        CidrBlock: js.UndefOr[NonEmptyString] = js.undefined
    ): VpcInfoCidrBlockSetDetails = {
      val __obj = js.Dynamic.literal()
      CidrBlock.foreach(__v => __obj.updateDynamic("CidrBlock")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VpcInfoCidrBlockSetDetails]
    }
  }

  /** Provides details about the IPv6 CIDR blocks for the VPC.
    */
  @js.native
  trait VpcInfoIpv6CidrBlockSetDetails extends js.Object {
    var Ipv6CidrBlock: js.UndefOr[NonEmptyString]
  }

  object VpcInfoIpv6CidrBlockSetDetails {
    @inline
    def apply(
        Ipv6CidrBlock: js.UndefOr[NonEmptyString] = js.undefined
    ): VpcInfoIpv6CidrBlockSetDetails = {
      val __obj = js.Dynamic.literal()
      Ipv6CidrBlock.foreach(__v => __obj.updateDynamic("Ipv6CidrBlock")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VpcInfoIpv6CidrBlockSetDetails]
    }
  }

  /** Provides information about the VPC peering connection options for the accepter or requester VPC.
    */
  @js.native
  trait VpcInfoPeeringOptionsDetails extends js.Object {
    var AllowDnsResolutionFromRemoteVpc: js.UndefOr[Boolean]
    var AllowEgressFromLocalClassicLinkToRemoteVpc: js.UndefOr[Boolean]
    var AllowEgressFromLocalVpcToRemoteClassicLink: js.UndefOr[Boolean]
  }

  object VpcInfoPeeringOptionsDetails {
    @inline
    def apply(
        AllowDnsResolutionFromRemoteVpc: js.UndefOr[Boolean] = js.undefined,
        AllowEgressFromLocalClassicLinkToRemoteVpc: js.UndefOr[Boolean] = js.undefined,
        AllowEgressFromLocalVpcToRemoteClassicLink: js.UndefOr[Boolean] = js.undefined
    ): VpcInfoPeeringOptionsDetails = {
      val __obj = js.Dynamic.literal()
      AllowDnsResolutionFromRemoteVpc.foreach(__v => __obj.updateDynamic("AllowDnsResolutionFromRemoteVpc")(__v.asInstanceOf[js.Any]))
      AllowEgressFromLocalClassicLinkToRemoteVpc.foreach(__v => __obj.updateDynamic("AllowEgressFromLocalClassicLinkToRemoteVpc")(__v.asInstanceOf[js.Any]))
      AllowEgressFromLocalVpcToRemoteClassicLink.foreach(__v => __obj.updateDynamic("AllowEgressFromLocalVpcToRemoteClassicLink")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VpcInfoPeeringOptionsDetails]
    }
  }

  /** A vulnerability associated with a finding.
    */
  @js.native
  trait Vulnerability extends js.Object {
    var Id: NonEmptyString
    var Cvss: js.UndefOr[CvssList]
    var FixAvailable: js.UndefOr[VulnerabilityFixAvailable]
    var ReferenceUrls: js.UndefOr[StringList]
    var RelatedVulnerabilities: js.UndefOr[StringList]
    var Vendor: js.UndefOr[VulnerabilityVendor]
    var VulnerablePackages: js.UndefOr[SoftwarePackageList]
  }

  object Vulnerability {
    @inline
    def apply(
        Id: NonEmptyString,
        Cvss: js.UndefOr[CvssList] = js.undefined,
        FixAvailable: js.UndefOr[VulnerabilityFixAvailable] = js.undefined,
        ReferenceUrls: js.UndefOr[StringList] = js.undefined,
        RelatedVulnerabilities: js.UndefOr[StringList] = js.undefined,
        Vendor: js.UndefOr[VulnerabilityVendor] = js.undefined,
        VulnerablePackages: js.UndefOr[SoftwarePackageList] = js.undefined
    ): Vulnerability = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      Cvss.foreach(__v => __obj.updateDynamic("Cvss")(__v.asInstanceOf[js.Any]))
      FixAvailable.foreach(__v => __obj.updateDynamic("FixAvailable")(__v.asInstanceOf[js.Any]))
      ReferenceUrls.foreach(__v => __obj.updateDynamic("ReferenceUrls")(__v.asInstanceOf[js.Any]))
      RelatedVulnerabilities.foreach(__v => __obj.updateDynamic("RelatedVulnerabilities")(__v.asInstanceOf[js.Any]))
      Vendor.foreach(__v => __obj.updateDynamic("Vendor")(__v.asInstanceOf[js.Any]))
      VulnerablePackages.foreach(__v => __obj.updateDynamic("VulnerablePackages")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Vulnerability]
    }
  }

  /** A vendor that generates a vulnerability report.
    */
  @js.native
  trait VulnerabilityVendor extends js.Object {
    var Name: NonEmptyString
    var Url: js.UndefOr[NonEmptyString]
    var VendorCreatedAt: js.UndefOr[NonEmptyString]
    var VendorSeverity: js.UndefOr[NonEmptyString]
    var VendorUpdatedAt: js.UndefOr[NonEmptyString]
  }

  object VulnerabilityVendor {
    @inline
    def apply(
        Name: NonEmptyString,
        Url: js.UndefOr[NonEmptyString] = js.undefined,
        VendorCreatedAt: js.UndefOr[NonEmptyString] = js.undefined,
        VendorSeverity: js.UndefOr[NonEmptyString] = js.undefined,
        VendorUpdatedAt: js.UndefOr[NonEmptyString] = js.undefined
    ): VulnerabilityVendor = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Url.foreach(__v => __obj.updateDynamic("Url")(__v.asInstanceOf[js.Any]))
      VendorCreatedAt.foreach(__v => __obj.updateDynamic("VendorCreatedAt")(__v.asInstanceOf[js.Any]))
      VendorSeverity.foreach(__v => __obj.updateDynamic("VendorSeverity")(__v.asInstanceOf[js.Any]))
      VendorUpdatedAt.foreach(__v => __obj.updateDynamic("VendorUpdatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VulnerabilityVendor]
    }
  }

  /** Details about the action that CloudFront or WAF takes when a web request matches the conditions in the rule.
    */
  @js.native
  trait WafAction extends js.Object {
    var Type: js.UndefOr[NonEmptyString]
  }

  object WafAction {
    @inline
    def apply(
        Type: js.UndefOr[NonEmptyString] = js.undefined
    ): WafAction = {
      val __obj = js.Dynamic.literal()
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WafAction]
    }
  }

  /** Details about a rule to exclude from a rule group.
    */
  @js.native
  trait WafExcludedRule extends js.Object {
    var RuleId: js.UndefOr[NonEmptyString]
  }

  object WafExcludedRule {
    @inline
    def apply(
        RuleId: js.UndefOr[NonEmptyString] = js.undefined
    ): WafExcludedRule = {
      val __obj = js.Dynamic.literal()
      RuleId.foreach(__v => __obj.updateDynamic("RuleId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WafExcludedRule]
    }
  }

  /** Details about an override action for a rule.
    */
  @js.native
  trait WafOverrideAction extends js.Object {
    var Type: js.UndefOr[NonEmptyString]
  }

  object WafOverrideAction {
    @inline
    def apply(
        Type: js.UndefOr[NonEmptyString] = js.undefined
    ): WafOverrideAction = {
      val __obj = js.Dynamic.literal()
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WafOverrideAction]
    }
  }

  /** Provides information about the status of the investigation into a finding.
    */
  @js.native
  trait Workflow extends js.Object {
    var Status: js.UndefOr[WorkflowStatus]
  }

  object Workflow {
    @inline
    def apply(
        Status: js.UndefOr[WorkflowStatus] = js.undefined
    ): Workflow = {
      val __obj = js.Dynamic.literal()
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Workflow]
    }
  }

  /** Used to update information about the investigation into the finding.
    */
  @js.native
  trait WorkflowUpdate extends js.Object {
    var Status: js.UndefOr[WorkflowStatus]
  }

  object WorkflowUpdate {
    @inline
    def apply(
        Status: js.UndefOr[WorkflowStatus] = js.undefined
    ): WorkflowUpdate = {
      val __obj = js.Dynamic.literal()
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkflowUpdate]
    }
  }
}
