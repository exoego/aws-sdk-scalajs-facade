package facade.amazonaws.services.configservice

import scalajs.js

@js.native
sealed trait AggregateConformancePackComplianceSummaryGroupKey extends js.Any
object AggregateConformancePackComplianceSummaryGroupKey {
  val ACCOUNT_ID = "ACCOUNT_ID".asInstanceOf[AggregateConformancePackComplianceSummaryGroupKey]
  val AWS_REGION = "AWS_REGION".asInstanceOf[AggregateConformancePackComplianceSummaryGroupKey]

  @inline def values: js.Array[AggregateConformancePackComplianceSummaryGroupKey] = js.Array(ACCOUNT_ID, AWS_REGION)
}

@js.native
sealed trait AggregatedSourceStatusType extends js.Any
object AggregatedSourceStatusType {
  val FAILED = "FAILED".asInstanceOf[AggregatedSourceStatusType]
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[AggregatedSourceStatusType]
  val OUTDATED = "OUTDATED".asInstanceOf[AggregatedSourceStatusType]

  @inline def values: js.Array[AggregatedSourceStatusType] = js.Array(FAILED, SUCCEEDED, OUTDATED)
}

@js.native
sealed trait AggregatedSourceType extends js.Any
object AggregatedSourceType {
  val ACCOUNT = "ACCOUNT".asInstanceOf[AggregatedSourceType]
  val ORGANIZATION = "ORGANIZATION".asInstanceOf[AggregatedSourceType]

  @inline def values: js.Array[AggregatedSourceType] = js.Array(ACCOUNT, ORGANIZATION)
}

@js.native
sealed trait ChronologicalOrder extends js.Any
object ChronologicalOrder {
  val Reverse = "Reverse".asInstanceOf[ChronologicalOrder]
  val Forward = "Forward".asInstanceOf[ChronologicalOrder]

  @inline def values: js.Array[ChronologicalOrder] = js.Array(Reverse, Forward)
}

@js.native
sealed trait ComplianceType extends js.Any
object ComplianceType {
  val COMPLIANT = "COMPLIANT".asInstanceOf[ComplianceType]
  val NON_COMPLIANT = "NON_COMPLIANT".asInstanceOf[ComplianceType]
  val NOT_APPLICABLE = "NOT_APPLICABLE".asInstanceOf[ComplianceType]
  val INSUFFICIENT_DATA = "INSUFFICIENT_DATA".asInstanceOf[ComplianceType]

  @inline def values: js.Array[ComplianceType] = js.Array(COMPLIANT, NON_COMPLIANT, NOT_APPLICABLE, INSUFFICIENT_DATA)
}

@js.native
sealed trait ConfigRuleComplianceSummaryGroupKey extends js.Any
object ConfigRuleComplianceSummaryGroupKey {
  val ACCOUNT_ID = "ACCOUNT_ID".asInstanceOf[ConfigRuleComplianceSummaryGroupKey]
  val AWS_REGION = "AWS_REGION".asInstanceOf[ConfigRuleComplianceSummaryGroupKey]

  @inline def values: js.Array[ConfigRuleComplianceSummaryGroupKey] = js.Array(ACCOUNT_ID, AWS_REGION)
}

@js.native
sealed trait ConfigRuleState extends js.Any
object ConfigRuleState {
  val ACTIVE = "ACTIVE".asInstanceOf[ConfigRuleState]
  val DELETING = "DELETING".asInstanceOf[ConfigRuleState]
  val DELETING_RESULTS = "DELETING_RESULTS".asInstanceOf[ConfigRuleState]
  val EVALUATING = "EVALUATING".asInstanceOf[ConfigRuleState]

  @inline def values: js.Array[ConfigRuleState] = js.Array(ACTIVE, DELETING, DELETING_RESULTS, EVALUATING)
}

@js.native
sealed trait ConfigurationItemStatus extends js.Any
object ConfigurationItemStatus {
  val OK = "OK".asInstanceOf[ConfigurationItemStatus]
  val ResourceDiscovered = "ResourceDiscovered".asInstanceOf[ConfigurationItemStatus]
  val ResourceNotRecorded = "ResourceNotRecorded".asInstanceOf[ConfigurationItemStatus]
  val ResourceDeleted = "ResourceDeleted".asInstanceOf[ConfigurationItemStatus]
  val ResourceDeletedNotRecorded = "ResourceDeletedNotRecorded".asInstanceOf[ConfigurationItemStatus]

  @inline def values: js.Array[ConfigurationItemStatus] = js.Array(OK, ResourceDiscovered, ResourceNotRecorded, ResourceDeleted, ResourceDeletedNotRecorded)
}

@js.native
sealed trait ConformancePackComplianceType extends js.Any
object ConformancePackComplianceType {
  val COMPLIANT = "COMPLIANT".asInstanceOf[ConformancePackComplianceType]
  val NON_COMPLIANT = "NON_COMPLIANT".asInstanceOf[ConformancePackComplianceType]
  val INSUFFICIENT_DATA = "INSUFFICIENT_DATA".asInstanceOf[ConformancePackComplianceType]

  @inline def values: js.Array[ConformancePackComplianceType] = js.Array(COMPLIANT, NON_COMPLIANT, INSUFFICIENT_DATA)
}

@js.native
sealed trait ConformancePackState extends js.Any
object ConformancePackState {
  val CREATE_IN_PROGRESS = "CREATE_IN_PROGRESS".asInstanceOf[ConformancePackState]
  val CREATE_COMPLETE = "CREATE_COMPLETE".asInstanceOf[ConformancePackState]
  val CREATE_FAILED = "CREATE_FAILED".asInstanceOf[ConformancePackState]
  val DELETE_IN_PROGRESS = "DELETE_IN_PROGRESS".asInstanceOf[ConformancePackState]
  val DELETE_FAILED = "DELETE_FAILED".asInstanceOf[ConformancePackState]

  @inline def values: js.Array[ConformancePackState] = js.Array(CREATE_IN_PROGRESS, CREATE_COMPLETE, CREATE_FAILED, DELETE_IN_PROGRESS, DELETE_FAILED)
}

@js.native
sealed trait DeliveryStatus extends js.Any
object DeliveryStatus {
  val Success = "Success".asInstanceOf[DeliveryStatus]
  val Failure = "Failure".asInstanceOf[DeliveryStatus]
  val Not_Applicable = "Not_Applicable".asInstanceOf[DeliveryStatus]

  @inline def values: js.Array[DeliveryStatus] = js.Array(Success, Failure, Not_Applicable)
}

@js.native
sealed trait EventSource extends js.Any
object EventSource {
  val `aws.config` = "aws.config".asInstanceOf[EventSource]

  @inline def values: js.Array[EventSource] = js.Array(`aws.config`)
}

@js.native
sealed trait MaximumExecutionFrequency extends js.Any
object MaximumExecutionFrequency {
  val One_Hour = "One_Hour".asInstanceOf[MaximumExecutionFrequency]
  val Three_Hours = "Three_Hours".asInstanceOf[MaximumExecutionFrequency]
  val Six_Hours = "Six_Hours".asInstanceOf[MaximumExecutionFrequency]
  val Twelve_Hours = "Twelve_Hours".asInstanceOf[MaximumExecutionFrequency]
  val TwentyFour_Hours = "TwentyFour_Hours".asInstanceOf[MaximumExecutionFrequency]

  @inline def values: js.Array[MaximumExecutionFrequency] = js.Array(One_Hour, Three_Hours, Six_Hours, Twelve_Hours, TwentyFour_Hours)
}

@js.native
sealed trait MemberAccountRuleStatus extends js.Any
object MemberAccountRuleStatus {
  val CREATE_SUCCESSFUL = "CREATE_SUCCESSFUL".asInstanceOf[MemberAccountRuleStatus]
  val CREATE_IN_PROGRESS = "CREATE_IN_PROGRESS".asInstanceOf[MemberAccountRuleStatus]
  val CREATE_FAILED = "CREATE_FAILED".asInstanceOf[MemberAccountRuleStatus]
  val DELETE_SUCCESSFUL = "DELETE_SUCCESSFUL".asInstanceOf[MemberAccountRuleStatus]
  val DELETE_FAILED = "DELETE_FAILED".asInstanceOf[MemberAccountRuleStatus]
  val DELETE_IN_PROGRESS = "DELETE_IN_PROGRESS".asInstanceOf[MemberAccountRuleStatus]
  val UPDATE_SUCCESSFUL = "UPDATE_SUCCESSFUL".asInstanceOf[MemberAccountRuleStatus]
  val UPDATE_IN_PROGRESS = "UPDATE_IN_PROGRESS".asInstanceOf[MemberAccountRuleStatus]
  val UPDATE_FAILED = "UPDATE_FAILED".asInstanceOf[MemberAccountRuleStatus]

  @inline def values: js.Array[MemberAccountRuleStatus] = js.Array(
    CREATE_SUCCESSFUL,
    CREATE_IN_PROGRESS,
    CREATE_FAILED,
    DELETE_SUCCESSFUL,
    DELETE_FAILED,
    DELETE_IN_PROGRESS,
    UPDATE_SUCCESSFUL,
    UPDATE_IN_PROGRESS,
    UPDATE_FAILED
  )
}

@js.native
sealed trait MessageType extends js.Any
object MessageType {
  val ConfigurationItemChangeNotification = "ConfigurationItemChangeNotification".asInstanceOf[MessageType]
  val ConfigurationSnapshotDeliveryCompleted = "ConfigurationSnapshotDeliveryCompleted".asInstanceOf[MessageType]
  val ScheduledNotification = "ScheduledNotification".asInstanceOf[MessageType]
  val OversizedConfigurationItemChangeNotification = "OversizedConfigurationItemChangeNotification".asInstanceOf[MessageType]

  @inline def values: js.Array[MessageType] = js.Array(ConfigurationItemChangeNotification, ConfigurationSnapshotDeliveryCompleted, ScheduledNotification, OversizedConfigurationItemChangeNotification)
}

@js.native
sealed trait OrganizationConfigRuleTriggerType extends js.Any
object OrganizationConfigRuleTriggerType {
  val ConfigurationItemChangeNotification = "ConfigurationItemChangeNotification".asInstanceOf[OrganizationConfigRuleTriggerType]
  val OversizedConfigurationItemChangeNotification = "OversizedConfigurationItemChangeNotification".asInstanceOf[OrganizationConfigRuleTriggerType]
  val ScheduledNotification = "ScheduledNotification".asInstanceOf[OrganizationConfigRuleTriggerType]

  @inline def values: js.Array[OrganizationConfigRuleTriggerType] = js.Array(ConfigurationItemChangeNotification, OversizedConfigurationItemChangeNotification, ScheduledNotification)
}

@js.native
sealed trait OrganizationResourceDetailedStatus extends js.Any
object OrganizationResourceDetailedStatus {
  val CREATE_SUCCESSFUL = "CREATE_SUCCESSFUL".asInstanceOf[OrganizationResourceDetailedStatus]
  val CREATE_IN_PROGRESS = "CREATE_IN_PROGRESS".asInstanceOf[OrganizationResourceDetailedStatus]
  val CREATE_FAILED = "CREATE_FAILED".asInstanceOf[OrganizationResourceDetailedStatus]
  val DELETE_SUCCESSFUL = "DELETE_SUCCESSFUL".asInstanceOf[OrganizationResourceDetailedStatus]
  val DELETE_FAILED = "DELETE_FAILED".asInstanceOf[OrganizationResourceDetailedStatus]
  val DELETE_IN_PROGRESS = "DELETE_IN_PROGRESS".asInstanceOf[OrganizationResourceDetailedStatus]
  val UPDATE_SUCCESSFUL = "UPDATE_SUCCESSFUL".asInstanceOf[OrganizationResourceDetailedStatus]
  val UPDATE_IN_PROGRESS = "UPDATE_IN_PROGRESS".asInstanceOf[OrganizationResourceDetailedStatus]
  val UPDATE_FAILED = "UPDATE_FAILED".asInstanceOf[OrganizationResourceDetailedStatus]

  @inline def values: js.Array[OrganizationResourceDetailedStatus] = js.Array(
    CREATE_SUCCESSFUL,
    CREATE_IN_PROGRESS,
    CREATE_FAILED,
    DELETE_SUCCESSFUL,
    DELETE_FAILED,
    DELETE_IN_PROGRESS,
    UPDATE_SUCCESSFUL,
    UPDATE_IN_PROGRESS,
    UPDATE_FAILED
  )
}

@js.native
sealed trait OrganizationResourceStatus extends js.Any
object OrganizationResourceStatus {
  val CREATE_SUCCESSFUL = "CREATE_SUCCESSFUL".asInstanceOf[OrganizationResourceStatus]
  val CREATE_IN_PROGRESS = "CREATE_IN_PROGRESS".asInstanceOf[OrganizationResourceStatus]
  val CREATE_FAILED = "CREATE_FAILED".asInstanceOf[OrganizationResourceStatus]
  val DELETE_SUCCESSFUL = "DELETE_SUCCESSFUL".asInstanceOf[OrganizationResourceStatus]
  val DELETE_FAILED = "DELETE_FAILED".asInstanceOf[OrganizationResourceStatus]
  val DELETE_IN_PROGRESS = "DELETE_IN_PROGRESS".asInstanceOf[OrganizationResourceStatus]
  val UPDATE_SUCCESSFUL = "UPDATE_SUCCESSFUL".asInstanceOf[OrganizationResourceStatus]
  val UPDATE_IN_PROGRESS = "UPDATE_IN_PROGRESS".asInstanceOf[OrganizationResourceStatus]
  val UPDATE_FAILED = "UPDATE_FAILED".asInstanceOf[OrganizationResourceStatus]

  @inline def values: js.Array[OrganizationResourceStatus] = js.Array(
    CREATE_SUCCESSFUL,
    CREATE_IN_PROGRESS,
    CREATE_FAILED,
    DELETE_SUCCESSFUL,
    DELETE_FAILED,
    DELETE_IN_PROGRESS,
    UPDATE_SUCCESSFUL,
    UPDATE_IN_PROGRESS,
    UPDATE_FAILED
  )
}

@js.native
sealed trait OrganizationRuleStatus extends js.Any
object OrganizationRuleStatus {
  val CREATE_SUCCESSFUL = "CREATE_SUCCESSFUL".asInstanceOf[OrganizationRuleStatus]
  val CREATE_IN_PROGRESS = "CREATE_IN_PROGRESS".asInstanceOf[OrganizationRuleStatus]
  val CREATE_FAILED = "CREATE_FAILED".asInstanceOf[OrganizationRuleStatus]
  val DELETE_SUCCESSFUL = "DELETE_SUCCESSFUL".asInstanceOf[OrganizationRuleStatus]
  val DELETE_FAILED = "DELETE_FAILED".asInstanceOf[OrganizationRuleStatus]
  val DELETE_IN_PROGRESS = "DELETE_IN_PROGRESS".asInstanceOf[OrganizationRuleStatus]
  val UPDATE_SUCCESSFUL = "UPDATE_SUCCESSFUL".asInstanceOf[OrganizationRuleStatus]
  val UPDATE_IN_PROGRESS = "UPDATE_IN_PROGRESS".asInstanceOf[OrganizationRuleStatus]
  val UPDATE_FAILED = "UPDATE_FAILED".asInstanceOf[OrganizationRuleStatus]

  @inline def values: js.Array[OrganizationRuleStatus] = js.Array(
    CREATE_SUCCESSFUL,
    CREATE_IN_PROGRESS,
    CREATE_FAILED,
    DELETE_SUCCESSFUL,
    DELETE_FAILED,
    DELETE_IN_PROGRESS,
    UPDATE_SUCCESSFUL,
    UPDATE_IN_PROGRESS,
    UPDATE_FAILED
  )
}

@js.native
sealed trait Owner extends js.Any
object Owner {
  val CUSTOM_LAMBDA = "CUSTOM_LAMBDA".asInstanceOf[Owner]
  val AWS = "AWS".asInstanceOf[Owner]

  @inline def values: js.Array[Owner] = js.Array(CUSTOM_LAMBDA, AWS)
}

@js.native
sealed trait RecorderStatus extends js.Any
object RecorderStatus {
  val Pending = "Pending".asInstanceOf[RecorderStatus]
  val Success = "Success".asInstanceOf[RecorderStatus]
  val Failure = "Failure".asInstanceOf[RecorderStatus]

  @inline def values: js.Array[RecorderStatus] = js.Array(Pending, Success, Failure)
}

@js.native
sealed trait RemediationExecutionState extends js.Any
object RemediationExecutionState {
  val QUEUED = "QUEUED".asInstanceOf[RemediationExecutionState]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[RemediationExecutionState]
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[RemediationExecutionState]
  val FAILED = "FAILED".asInstanceOf[RemediationExecutionState]

  @inline def values: js.Array[RemediationExecutionState] = js.Array(QUEUED, IN_PROGRESS, SUCCEEDED, FAILED)
}

@js.native
sealed trait RemediationExecutionStepState extends js.Any
object RemediationExecutionStepState {
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[RemediationExecutionStepState]
  val PENDING = "PENDING".asInstanceOf[RemediationExecutionStepState]
  val FAILED = "FAILED".asInstanceOf[RemediationExecutionStepState]

  @inline def values: js.Array[RemediationExecutionStepState] = js.Array(SUCCEEDED, PENDING, FAILED)
}

@js.native
sealed trait RemediationTargetType extends js.Any
object RemediationTargetType {
  val SSM_DOCUMENT = "SSM_DOCUMENT".asInstanceOf[RemediationTargetType]

  @inline def values: js.Array[RemediationTargetType] = js.Array(SSM_DOCUMENT)
}

@js.native
sealed trait ResourceCountGroupKey extends js.Any
object ResourceCountGroupKey {
  val RESOURCE_TYPE = "RESOURCE_TYPE".asInstanceOf[ResourceCountGroupKey]
  val ACCOUNT_ID = "ACCOUNT_ID".asInstanceOf[ResourceCountGroupKey]
  val AWS_REGION = "AWS_REGION".asInstanceOf[ResourceCountGroupKey]

  @inline def values: js.Array[ResourceCountGroupKey] = js.Array(RESOURCE_TYPE, ACCOUNT_ID, AWS_REGION)
}

@js.native
sealed trait ResourceType extends js.Any
object ResourceType {
  val `AWS::EC2::CustomerGateway` = "AWS::EC2::CustomerGateway".asInstanceOf[ResourceType]
  val `AWS::EC2::EIP` = "AWS::EC2::EIP".asInstanceOf[ResourceType]
  val `AWS::EC2::Host` = "AWS::EC2::Host".asInstanceOf[ResourceType]
  val `AWS::EC2::Instance` = "AWS::EC2::Instance".asInstanceOf[ResourceType]
  val `AWS::EC2::InternetGateway` = "AWS::EC2::InternetGateway".asInstanceOf[ResourceType]
  val `AWS::EC2::NetworkAcl` = "AWS::EC2::NetworkAcl".asInstanceOf[ResourceType]
  val `AWS::EC2::NetworkInterface` = "AWS::EC2::NetworkInterface".asInstanceOf[ResourceType]
  val `AWS::EC2::RouteTable` = "AWS::EC2::RouteTable".asInstanceOf[ResourceType]
  val `AWS::EC2::SecurityGroup` = "AWS::EC2::SecurityGroup".asInstanceOf[ResourceType]
  val `AWS::EC2::Subnet` = "AWS::EC2::Subnet".asInstanceOf[ResourceType]
  val `AWS::CloudTrail::Trail` = "AWS::CloudTrail::Trail".asInstanceOf[ResourceType]
  val `AWS::EC2::Volume` = "AWS::EC2::Volume".asInstanceOf[ResourceType]
  val `AWS::EC2::VPC` = "AWS::EC2::VPC".asInstanceOf[ResourceType]
  val `AWS::EC2::VPNConnection` = "AWS::EC2::VPNConnection".asInstanceOf[ResourceType]
  val `AWS::EC2::VPNGateway` = "AWS::EC2::VPNGateway".asInstanceOf[ResourceType]
  val `AWS::EC2::RegisteredHAInstance` = "AWS::EC2::RegisteredHAInstance".asInstanceOf[ResourceType]
  val `AWS::EC2::NatGateway` = "AWS::EC2::NatGateway".asInstanceOf[ResourceType]
  val `AWS::EC2::EgressOnlyInternetGateway` = "AWS::EC2::EgressOnlyInternetGateway".asInstanceOf[ResourceType]
  val `AWS::EC2::VPCEndpoint` = "AWS::EC2::VPCEndpoint".asInstanceOf[ResourceType]
  val `AWS::EC2::VPCEndpointService` = "AWS::EC2::VPCEndpointService".asInstanceOf[ResourceType]
  val `AWS::EC2::FlowLog` = "AWS::EC2::FlowLog".asInstanceOf[ResourceType]
  val `AWS::EC2::VPCPeeringConnection` = "AWS::EC2::VPCPeeringConnection".asInstanceOf[ResourceType]
  val `AWS::Elasticsearch::Domain` = "AWS::Elasticsearch::Domain".asInstanceOf[ResourceType]
  val `AWS::IAM::Group` = "AWS::IAM::Group".asInstanceOf[ResourceType]
  val `AWS::IAM::Policy` = "AWS::IAM::Policy".asInstanceOf[ResourceType]
  val `AWS::IAM::Role` = "AWS::IAM::Role".asInstanceOf[ResourceType]
  val `AWS::IAM::User` = "AWS::IAM::User".asInstanceOf[ResourceType]
  val `AWS::ElasticLoadBalancingV2::LoadBalancer` = "AWS::ElasticLoadBalancingV2::LoadBalancer".asInstanceOf[ResourceType]
  val `AWS::ACM::Certificate` = "AWS::ACM::Certificate".asInstanceOf[ResourceType]
  val `AWS::RDS::DBInstance` = "AWS::RDS::DBInstance".asInstanceOf[ResourceType]
  val `AWS::RDS::DBSubnetGroup` = "AWS::RDS::DBSubnetGroup".asInstanceOf[ResourceType]
  val `AWS::RDS::DBSecurityGroup` = "AWS::RDS::DBSecurityGroup".asInstanceOf[ResourceType]
  val `AWS::RDS::DBSnapshot` = "AWS::RDS::DBSnapshot".asInstanceOf[ResourceType]
  val `AWS::RDS::DBCluster` = "AWS::RDS::DBCluster".asInstanceOf[ResourceType]
  val `AWS::RDS::DBClusterSnapshot` = "AWS::RDS::DBClusterSnapshot".asInstanceOf[ResourceType]
  val `AWS::RDS::EventSubscription` = "AWS::RDS::EventSubscription".asInstanceOf[ResourceType]
  val `AWS::S3::Bucket` = "AWS::S3::Bucket".asInstanceOf[ResourceType]
  val `AWS::S3::AccountPublicAccessBlock` = "AWS::S3::AccountPublicAccessBlock".asInstanceOf[ResourceType]
  val `AWS::Redshift::Cluster` = "AWS::Redshift::Cluster".asInstanceOf[ResourceType]
  val `AWS::Redshift::ClusterSnapshot` = "AWS::Redshift::ClusterSnapshot".asInstanceOf[ResourceType]
  val `AWS::Redshift::ClusterParameterGroup` = "AWS::Redshift::ClusterParameterGroup".asInstanceOf[ResourceType]
  val `AWS::Redshift::ClusterSecurityGroup` = "AWS::Redshift::ClusterSecurityGroup".asInstanceOf[ResourceType]
  val `AWS::Redshift::ClusterSubnetGroup` = "AWS::Redshift::ClusterSubnetGroup".asInstanceOf[ResourceType]
  val `AWS::Redshift::EventSubscription` = "AWS::Redshift::EventSubscription".asInstanceOf[ResourceType]
  val `AWS::SSM::ManagedInstanceInventory` = "AWS::SSM::ManagedInstanceInventory".asInstanceOf[ResourceType]
  val `AWS::CloudWatch::Alarm` = "AWS::CloudWatch::Alarm".asInstanceOf[ResourceType]
  val `AWS::CloudFormation::Stack` = "AWS::CloudFormation::Stack".asInstanceOf[ResourceType]
  val `AWS::ElasticLoadBalancing::LoadBalancer` = "AWS::ElasticLoadBalancing::LoadBalancer".asInstanceOf[ResourceType]
  val `AWS::AutoScaling::AutoScalingGroup` = "AWS::AutoScaling::AutoScalingGroup".asInstanceOf[ResourceType]
  val `AWS::AutoScaling::LaunchConfiguration` = "AWS::AutoScaling::LaunchConfiguration".asInstanceOf[ResourceType]
  val `AWS::AutoScaling::ScalingPolicy` = "AWS::AutoScaling::ScalingPolicy".asInstanceOf[ResourceType]
  val `AWS::AutoScaling::ScheduledAction` = "AWS::AutoScaling::ScheduledAction".asInstanceOf[ResourceType]
  val `AWS::DynamoDB::Table` = "AWS::DynamoDB::Table".asInstanceOf[ResourceType]
  val `AWS::CodeBuild::Project` = "AWS::CodeBuild::Project".asInstanceOf[ResourceType]
  val `AWS::WAF::RateBasedRule` = "AWS::WAF::RateBasedRule".asInstanceOf[ResourceType]
  val `AWS::WAF::Rule` = "AWS::WAF::Rule".asInstanceOf[ResourceType]
  val `AWS::WAF::RuleGroup` = "AWS::WAF::RuleGroup".asInstanceOf[ResourceType]
  val `AWS::WAF::WebACL` = "AWS::WAF::WebACL".asInstanceOf[ResourceType]
  val `AWS::WAFRegional::RateBasedRule` = "AWS::WAFRegional::RateBasedRule".asInstanceOf[ResourceType]
  val `AWS::WAFRegional::Rule` = "AWS::WAFRegional::Rule".asInstanceOf[ResourceType]
  val `AWS::WAFRegional::RuleGroup` = "AWS::WAFRegional::RuleGroup".asInstanceOf[ResourceType]
  val `AWS::WAFRegional::WebACL` = "AWS::WAFRegional::WebACL".asInstanceOf[ResourceType]
  val `AWS::CloudFront::Distribution` = "AWS::CloudFront::Distribution".asInstanceOf[ResourceType]
  val `AWS::CloudFront::StreamingDistribution` = "AWS::CloudFront::StreamingDistribution".asInstanceOf[ResourceType]
  val `AWS::Lambda::Function` = "AWS::Lambda::Function".asInstanceOf[ResourceType]
  val `AWS::NetworkFirewall::Firewall` = "AWS::NetworkFirewall::Firewall".asInstanceOf[ResourceType]
  val `AWS::NetworkFirewall::FirewallPolicy` = "AWS::NetworkFirewall::FirewallPolicy".asInstanceOf[ResourceType]
  val `AWS::NetworkFirewall::RuleGroup` = "AWS::NetworkFirewall::RuleGroup".asInstanceOf[ResourceType]
  val `AWS::ElasticBeanstalk::Application` = "AWS::ElasticBeanstalk::Application".asInstanceOf[ResourceType]
  val `AWS::ElasticBeanstalk::ApplicationVersion` = "AWS::ElasticBeanstalk::ApplicationVersion".asInstanceOf[ResourceType]
  val `AWS::ElasticBeanstalk::Environment` = "AWS::ElasticBeanstalk::Environment".asInstanceOf[ResourceType]
  val `AWS::WAFv2::WebACL` = "AWS::WAFv2::WebACL".asInstanceOf[ResourceType]
  val `AWS::WAFv2::RuleGroup` = "AWS::WAFv2::RuleGroup".asInstanceOf[ResourceType]
  val `AWS::WAFv2::IPSet` = "AWS::WAFv2::IPSet".asInstanceOf[ResourceType]
  val `AWS::WAFv2::RegexPatternSet` = "AWS::WAFv2::RegexPatternSet".asInstanceOf[ResourceType]
  val `AWS::WAFv2::ManagedRuleSet` = "AWS::WAFv2::ManagedRuleSet".asInstanceOf[ResourceType]
  val `AWS::XRay::EncryptionConfig` = "AWS::XRay::EncryptionConfig".asInstanceOf[ResourceType]
  val `AWS::SSM::AssociationCompliance` = "AWS::SSM::AssociationCompliance".asInstanceOf[ResourceType]
  val `AWS::SSM::PatchCompliance` = "AWS::SSM::PatchCompliance".asInstanceOf[ResourceType]
  val `AWS::Shield::Protection` = "AWS::Shield::Protection".asInstanceOf[ResourceType]
  val `AWS::ShieldRegional::Protection` = "AWS::ShieldRegional::Protection".asInstanceOf[ResourceType]
  val `AWS::Config::ConformancePackCompliance` = "AWS::Config::ConformancePackCompliance".asInstanceOf[ResourceType]
  val `AWS::Config::ResourceCompliance` = "AWS::Config::ResourceCompliance".asInstanceOf[ResourceType]
  val `AWS::ApiGateway::Stage` = "AWS::ApiGateway::Stage".asInstanceOf[ResourceType]
  val `AWS::ApiGateway::RestApi` = "AWS::ApiGateway::RestApi".asInstanceOf[ResourceType]
  val `AWS::ApiGatewayV2::Stage` = "AWS::ApiGatewayV2::Stage".asInstanceOf[ResourceType]
  val `AWS::ApiGatewayV2::Api` = "AWS::ApiGatewayV2::Api".asInstanceOf[ResourceType]
  val `AWS::CodePipeline::Pipeline` = "AWS::CodePipeline::Pipeline".asInstanceOf[ResourceType]
  val `AWS::ServiceCatalog::CloudFormationProvisionedProduct` = "AWS::ServiceCatalog::CloudFormationProvisionedProduct".asInstanceOf[ResourceType]
  val `AWS::ServiceCatalog::CloudFormationProduct` = "AWS::ServiceCatalog::CloudFormationProduct".asInstanceOf[ResourceType]
  val `AWS::ServiceCatalog::Portfolio` = "AWS::ServiceCatalog::Portfolio".asInstanceOf[ResourceType]
  val `AWS::SQS::Queue` = "AWS::SQS::Queue".asInstanceOf[ResourceType]
  val `AWS::KMS::Key` = "AWS::KMS::Key".asInstanceOf[ResourceType]
  val `AWS::QLDB::Ledger` = "AWS::QLDB::Ledger".asInstanceOf[ResourceType]
  val `AWS::SecretsManager::Secret` = "AWS::SecretsManager::Secret".asInstanceOf[ResourceType]
  val `AWS::SNS::Topic` = "AWS::SNS::Topic".asInstanceOf[ResourceType]
  val `AWS::SSM::FileData` = "AWS::SSM::FileData".asInstanceOf[ResourceType]

  @inline def values: js.Array[ResourceType] = js.Array(
    `AWS::EC2::CustomerGateway`,
    `AWS::EC2::EIP`,
    `AWS::EC2::Host`,
    `AWS::EC2::Instance`,
    `AWS::EC2::InternetGateway`,
    `AWS::EC2::NetworkAcl`,
    `AWS::EC2::NetworkInterface`,
    `AWS::EC2::RouteTable`,
    `AWS::EC2::SecurityGroup`,
    `AWS::EC2::Subnet`,
    `AWS::CloudTrail::Trail`,
    `AWS::EC2::Volume`,
    `AWS::EC2::VPC`,
    `AWS::EC2::VPNConnection`,
    `AWS::EC2::VPNGateway`,
    `AWS::EC2::RegisteredHAInstance`,
    `AWS::EC2::NatGateway`,
    `AWS::EC2::EgressOnlyInternetGateway`,
    `AWS::EC2::VPCEndpoint`,
    `AWS::EC2::VPCEndpointService`,
    `AWS::EC2::FlowLog`,
    `AWS::EC2::VPCPeeringConnection`,
    `AWS::Elasticsearch::Domain`,
    `AWS::IAM::Group`,
    `AWS::IAM::Policy`,
    `AWS::IAM::Role`,
    `AWS::IAM::User`,
    `AWS::ElasticLoadBalancingV2::LoadBalancer`,
    `AWS::ACM::Certificate`,
    `AWS::RDS::DBInstance`,
    `AWS::RDS::DBSubnetGroup`,
    `AWS::RDS::DBSecurityGroup`,
    `AWS::RDS::DBSnapshot`,
    `AWS::RDS::DBCluster`,
    `AWS::RDS::DBClusterSnapshot`,
    `AWS::RDS::EventSubscription`,
    `AWS::S3::Bucket`,
    `AWS::S3::AccountPublicAccessBlock`,
    `AWS::Redshift::Cluster`,
    `AWS::Redshift::ClusterSnapshot`,
    `AWS::Redshift::ClusterParameterGroup`,
    `AWS::Redshift::ClusterSecurityGroup`,
    `AWS::Redshift::ClusterSubnetGroup`,
    `AWS::Redshift::EventSubscription`,
    `AWS::SSM::ManagedInstanceInventory`,
    `AWS::CloudWatch::Alarm`,
    `AWS::CloudFormation::Stack`,
    `AWS::ElasticLoadBalancing::LoadBalancer`,
    `AWS::AutoScaling::AutoScalingGroup`,
    `AWS::AutoScaling::LaunchConfiguration`,
    `AWS::AutoScaling::ScalingPolicy`,
    `AWS::AutoScaling::ScheduledAction`,
    `AWS::DynamoDB::Table`,
    `AWS::CodeBuild::Project`,
    `AWS::WAF::RateBasedRule`,
    `AWS::WAF::Rule`,
    `AWS::WAF::RuleGroup`,
    `AWS::WAF::WebACL`,
    `AWS::WAFRegional::RateBasedRule`,
    `AWS::WAFRegional::Rule`,
    `AWS::WAFRegional::RuleGroup`,
    `AWS::WAFRegional::WebACL`,
    `AWS::CloudFront::Distribution`,
    `AWS::CloudFront::StreamingDistribution`,
    `AWS::Lambda::Function`,
    `AWS::NetworkFirewall::Firewall`,
    `AWS::NetworkFirewall::FirewallPolicy`,
    `AWS::NetworkFirewall::RuleGroup`,
    `AWS::ElasticBeanstalk::Application`,
    `AWS::ElasticBeanstalk::ApplicationVersion`,
    `AWS::ElasticBeanstalk::Environment`,
    `AWS::WAFv2::WebACL`,
    `AWS::WAFv2::RuleGroup`,
    `AWS::WAFv2::IPSet`,
    `AWS::WAFv2::RegexPatternSet`,
    `AWS::WAFv2::ManagedRuleSet`,
    `AWS::XRay::EncryptionConfig`,
    `AWS::SSM::AssociationCompliance`,
    `AWS::SSM::PatchCompliance`,
    `AWS::Shield::Protection`,
    `AWS::ShieldRegional::Protection`,
    `AWS::Config::ConformancePackCompliance`,
    `AWS::Config::ResourceCompliance`,
    `AWS::ApiGateway::Stage`,
    `AWS::ApiGateway::RestApi`,
    `AWS::ApiGatewayV2::Stage`,
    `AWS::ApiGatewayV2::Api`,
    `AWS::CodePipeline::Pipeline`,
    `AWS::ServiceCatalog::CloudFormationProvisionedProduct`,
    `AWS::ServiceCatalog::CloudFormationProduct`,
    `AWS::ServiceCatalog::Portfolio`,
    `AWS::SQS::Queue`,
    `AWS::KMS::Key`,
    `AWS::QLDB::Ledger`,
    `AWS::SecretsManager::Secret`,
    `AWS::SNS::Topic`,
    `AWS::SSM::FileData`
  )
}

@js.native
sealed trait ResourceValueType extends js.Any
object ResourceValueType {
  val RESOURCE_ID = "RESOURCE_ID".asInstanceOf[ResourceValueType]

  @inline def values: js.Array[ResourceValueType] = js.Array(RESOURCE_ID)
}
