package facade.amazonaws.services.configservice

import scalajs._

type AggregateConformancePackComplianceSummaryGroupKey = "ACCOUNT_ID" | "AWS_REGION"
object AggregateConformancePackComplianceSummaryGroupKey {
  val ACCOUNT_ID: "ACCOUNT_ID" = "ACCOUNT_ID"
  val AWS_REGION: "AWS_REGION" = "AWS_REGION"

  @inline def values = js.Array[AggregateConformancePackComplianceSummaryGroupKey](ACCOUNT_ID, AWS_REGION)
}

type AggregatedSourceStatusType = "FAILED" | "SUCCEEDED" | "OUTDATED"
object AggregatedSourceStatusType {
  val FAILED: "FAILED" = "FAILED"
  val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  val OUTDATED: "OUTDATED" = "OUTDATED"

  @inline def values = js.Array[AggregatedSourceStatusType](FAILED, SUCCEEDED, OUTDATED)
}

type AggregatedSourceType = "ACCOUNT" | "ORGANIZATION"
object AggregatedSourceType {
  val ACCOUNT: "ACCOUNT" = "ACCOUNT"
  val ORGANIZATION: "ORGANIZATION" = "ORGANIZATION"

  @inline def values = js.Array[AggregatedSourceType](ACCOUNT, ORGANIZATION)
}

type ChronologicalOrder = "Reverse" | "Forward"
object ChronologicalOrder {
  val Reverse: "Reverse" = "Reverse"
  val Forward: "Forward" = "Forward"

  @inline def values = js.Array[ChronologicalOrder](Reverse, Forward)
}

type ComplianceType = "COMPLIANT" | "NON_COMPLIANT" | "NOT_APPLICABLE" | "INSUFFICIENT_DATA"
object ComplianceType {
  val COMPLIANT: "COMPLIANT" = "COMPLIANT"
  val NON_COMPLIANT: "NON_COMPLIANT" = "NON_COMPLIANT"
  val NOT_APPLICABLE: "NOT_APPLICABLE" = "NOT_APPLICABLE"
  val INSUFFICIENT_DATA: "INSUFFICIENT_DATA" = "INSUFFICIENT_DATA"

  @inline def values = js.Array[ComplianceType](COMPLIANT, NON_COMPLIANT, NOT_APPLICABLE, INSUFFICIENT_DATA)
}

type ConfigRuleComplianceSummaryGroupKey = "ACCOUNT_ID" | "AWS_REGION"
object ConfigRuleComplianceSummaryGroupKey {
  val ACCOUNT_ID: "ACCOUNT_ID" = "ACCOUNT_ID"
  val AWS_REGION: "AWS_REGION" = "AWS_REGION"

  @inline def values = js.Array[ConfigRuleComplianceSummaryGroupKey](ACCOUNT_ID, AWS_REGION)
}

type ConfigRuleState = "ACTIVE" | "DELETING" | "DELETING_RESULTS" | "EVALUATING"
object ConfigRuleState {
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val DELETING: "DELETING" = "DELETING"
  val DELETING_RESULTS: "DELETING_RESULTS" = "DELETING_RESULTS"
  val EVALUATING: "EVALUATING" = "EVALUATING"

  @inline def values = js.Array[ConfigRuleState](ACTIVE, DELETING, DELETING_RESULTS, EVALUATING)
}

type ConfigurationItemStatus = "OK" | "ResourceDiscovered" | "ResourceNotRecorded" | "ResourceDeleted" | "ResourceDeletedNotRecorded"
object ConfigurationItemStatus {
  val OK: "OK" = "OK"
  val ResourceDiscovered: "ResourceDiscovered" = "ResourceDiscovered"
  val ResourceNotRecorded: "ResourceNotRecorded" = "ResourceNotRecorded"
  val ResourceDeleted: "ResourceDeleted" = "ResourceDeleted"
  val ResourceDeletedNotRecorded: "ResourceDeletedNotRecorded" = "ResourceDeletedNotRecorded"

  @inline def values = js.Array[ConfigurationItemStatus](OK, ResourceDiscovered, ResourceNotRecorded, ResourceDeleted, ResourceDeletedNotRecorded)
}

type ConformancePackComplianceType = "COMPLIANT" | "NON_COMPLIANT" | "INSUFFICIENT_DATA"
object ConformancePackComplianceType {
  val COMPLIANT: "COMPLIANT" = "COMPLIANT"
  val NON_COMPLIANT: "NON_COMPLIANT" = "NON_COMPLIANT"
  val INSUFFICIENT_DATA: "INSUFFICIENT_DATA" = "INSUFFICIENT_DATA"

  @inline def values = js.Array[ConformancePackComplianceType](COMPLIANT, NON_COMPLIANT, INSUFFICIENT_DATA)
}

type ConformancePackState = "CREATE_IN_PROGRESS" | "CREATE_COMPLETE" | "CREATE_FAILED" | "DELETE_IN_PROGRESS" | "DELETE_FAILED"
object ConformancePackState {
  val CREATE_IN_PROGRESS: "CREATE_IN_PROGRESS" = "CREATE_IN_PROGRESS"
  val CREATE_COMPLETE: "CREATE_COMPLETE" = "CREATE_COMPLETE"
  val CREATE_FAILED: "CREATE_FAILED" = "CREATE_FAILED"
  val DELETE_IN_PROGRESS: "DELETE_IN_PROGRESS" = "DELETE_IN_PROGRESS"
  val DELETE_FAILED: "DELETE_FAILED" = "DELETE_FAILED"

  @inline def values = js.Array[ConformancePackState](CREATE_IN_PROGRESS, CREATE_COMPLETE, CREATE_FAILED, DELETE_IN_PROGRESS, DELETE_FAILED)
}

type DeliveryStatus = "Success" | "Failure" | "Not_Applicable"
object DeliveryStatus {
  val Success: "Success" = "Success"
  val Failure: "Failure" = "Failure"
  val Not_Applicable: "Not_Applicable" = "Not_Applicable"

  @inline def values = js.Array[DeliveryStatus](Success, Failure, Not_Applicable)
}

type EventSource = "aws.config"
object EventSource {
  val `aws.config`: "aws.config" = "aws.config"

  @inline def values = js.Array[EventSource](`aws.config`)
}

type MaximumExecutionFrequency = "One_Hour" | "Three_Hours" | "Six_Hours" | "Twelve_Hours" | "TwentyFour_Hours"
object MaximumExecutionFrequency {
  val One_Hour: "One_Hour" = "One_Hour"
  val Three_Hours: "Three_Hours" = "Three_Hours"
  val Six_Hours: "Six_Hours" = "Six_Hours"
  val Twelve_Hours: "Twelve_Hours" = "Twelve_Hours"
  val TwentyFour_Hours: "TwentyFour_Hours" = "TwentyFour_Hours"

  @inline def values = js.Array[MaximumExecutionFrequency](One_Hour, Three_Hours, Six_Hours, Twelve_Hours, TwentyFour_Hours)
}

type MemberAccountRuleStatus = "CREATE_SUCCESSFUL" | "CREATE_IN_PROGRESS" | "CREATE_FAILED" | "DELETE_SUCCESSFUL" | "DELETE_FAILED" | "DELETE_IN_PROGRESS" | "UPDATE_SUCCESSFUL" | "UPDATE_IN_PROGRESS" | "UPDATE_FAILED"
object MemberAccountRuleStatus {
  val CREATE_SUCCESSFUL: "CREATE_SUCCESSFUL" = "CREATE_SUCCESSFUL"
  val CREATE_IN_PROGRESS: "CREATE_IN_PROGRESS" = "CREATE_IN_PROGRESS"
  val CREATE_FAILED: "CREATE_FAILED" = "CREATE_FAILED"
  val DELETE_SUCCESSFUL: "DELETE_SUCCESSFUL" = "DELETE_SUCCESSFUL"
  val DELETE_FAILED: "DELETE_FAILED" = "DELETE_FAILED"
  val DELETE_IN_PROGRESS: "DELETE_IN_PROGRESS" = "DELETE_IN_PROGRESS"
  val UPDATE_SUCCESSFUL: "UPDATE_SUCCESSFUL" = "UPDATE_SUCCESSFUL"
  val UPDATE_IN_PROGRESS: "UPDATE_IN_PROGRESS" = "UPDATE_IN_PROGRESS"
  val UPDATE_FAILED: "UPDATE_FAILED" = "UPDATE_FAILED"

  @inline def values = js.Array[MemberAccountRuleStatus](
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

type MessageType = "ConfigurationItemChangeNotification" | "ConfigurationSnapshotDeliveryCompleted" | "ScheduledNotification" | "OversizedConfigurationItemChangeNotification"
object MessageType {
  val ConfigurationItemChangeNotification: "ConfigurationItemChangeNotification" = "ConfigurationItemChangeNotification"
  val ConfigurationSnapshotDeliveryCompleted: "ConfigurationSnapshotDeliveryCompleted" = "ConfigurationSnapshotDeliveryCompleted"
  val ScheduledNotification: "ScheduledNotification" = "ScheduledNotification"
  val OversizedConfigurationItemChangeNotification: "OversizedConfigurationItemChangeNotification" = "OversizedConfigurationItemChangeNotification"

  @inline def values = js.Array[MessageType](ConfigurationItemChangeNotification, ConfigurationSnapshotDeliveryCompleted, ScheduledNotification, OversizedConfigurationItemChangeNotification)
}

type OrganizationConfigRuleTriggerType = "ConfigurationItemChangeNotification" | "OversizedConfigurationItemChangeNotification" | "ScheduledNotification"
object OrganizationConfigRuleTriggerType {
  val ConfigurationItemChangeNotification: "ConfigurationItemChangeNotification" = "ConfigurationItemChangeNotification"
  val OversizedConfigurationItemChangeNotification: "OversizedConfigurationItemChangeNotification" = "OversizedConfigurationItemChangeNotification"
  val ScheduledNotification: "ScheduledNotification" = "ScheduledNotification"

  @inline def values = js.Array[OrganizationConfigRuleTriggerType](ConfigurationItemChangeNotification, OversizedConfigurationItemChangeNotification, ScheduledNotification)
}

type OrganizationResourceDetailedStatus = "CREATE_SUCCESSFUL" | "CREATE_IN_PROGRESS" | "CREATE_FAILED" | "DELETE_SUCCESSFUL" | "DELETE_FAILED" | "DELETE_IN_PROGRESS" | "UPDATE_SUCCESSFUL" | "UPDATE_IN_PROGRESS" | "UPDATE_FAILED"
object OrganizationResourceDetailedStatus {
  val CREATE_SUCCESSFUL: "CREATE_SUCCESSFUL" = "CREATE_SUCCESSFUL"
  val CREATE_IN_PROGRESS: "CREATE_IN_PROGRESS" = "CREATE_IN_PROGRESS"
  val CREATE_FAILED: "CREATE_FAILED" = "CREATE_FAILED"
  val DELETE_SUCCESSFUL: "DELETE_SUCCESSFUL" = "DELETE_SUCCESSFUL"
  val DELETE_FAILED: "DELETE_FAILED" = "DELETE_FAILED"
  val DELETE_IN_PROGRESS: "DELETE_IN_PROGRESS" = "DELETE_IN_PROGRESS"
  val UPDATE_SUCCESSFUL: "UPDATE_SUCCESSFUL" = "UPDATE_SUCCESSFUL"
  val UPDATE_IN_PROGRESS: "UPDATE_IN_PROGRESS" = "UPDATE_IN_PROGRESS"
  val UPDATE_FAILED: "UPDATE_FAILED" = "UPDATE_FAILED"

  @inline def values = js.Array[OrganizationResourceDetailedStatus](
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

type OrganizationResourceStatus = "CREATE_SUCCESSFUL" | "CREATE_IN_PROGRESS" | "CREATE_FAILED" | "DELETE_SUCCESSFUL" | "DELETE_FAILED" | "DELETE_IN_PROGRESS" | "UPDATE_SUCCESSFUL" | "UPDATE_IN_PROGRESS" | "UPDATE_FAILED"
object OrganizationResourceStatus {
  val CREATE_SUCCESSFUL: "CREATE_SUCCESSFUL" = "CREATE_SUCCESSFUL"
  val CREATE_IN_PROGRESS: "CREATE_IN_PROGRESS" = "CREATE_IN_PROGRESS"
  val CREATE_FAILED: "CREATE_FAILED" = "CREATE_FAILED"
  val DELETE_SUCCESSFUL: "DELETE_SUCCESSFUL" = "DELETE_SUCCESSFUL"
  val DELETE_FAILED: "DELETE_FAILED" = "DELETE_FAILED"
  val DELETE_IN_PROGRESS: "DELETE_IN_PROGRESS" = "DELETE_IN_PROGRESS"
  val UPDATE_SUCCESSFUL: "UPDATE_SUCCESSFUL" = "UPDATE_SUCCESSFUL"
  val UPDATE_IN_PROGRESS: "UPDATE_IN_PROGRESS" = "UPDATE_IN_PROGRESS"
  val UPDATE_FAILED: "UPDATE_FAILED" = "UPDATE_FAILED"

  @inline def values = js.Array[OrganizationResourceStatus](
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

type OrganizationRuleStatus = "CREATE_SUCCESSFUL" | "CREATE_IN_PROGRESS" | "CREATE_FAILED" | "DELETE_SUCCESSFUL" | "DELETE_FAILED" | "DELETE_IN_PROGRESS" | "UPDATE_SUCCESSFUL" | "UPDATE_IN_PROGRESS" | "UPDATE_FAILED"
object OrganizationRuleStatus {
  val CREATE_SUCCESSFUL: "CREATE_SUCCESSFUL" = "CREATE_SUCCESSFUL"
  val CREATE_IN_PROGRESS: "CREATE_IN_PROGRESS" = "CREATE_IN_PROGRESS"
  val CREATE_FAILED: "CREATE_FAILED" = "CREATE_FAILED"
  val DELETE_SUCCESSFUL: "DELETE_SUCCESSFUL" = "DELETE_SUCCESSFUL"
  val DELETE_FAILED: "DELETE_FAILED" = "DELETE_FAILED"
  val DELETE_IN_PROGRESS: "DELETE_IN_PROGRESS" = "DELETE_IN_PROGRESS"
  val UPDATE_SUCCESSFUL: "UPDATE_SUCCESSFUL" = "UPDATE_SUCCESSFUL"
  val UPDATE_IN_PROGRESS: "UPDATE_IN_PROGRESS" = "UPDATE_IN_PROGRESS"
  val UPDATE_FAILED: "UPDATE_FAILED" = "UPDATE_FAILED"

  @inline def values = js.Array[OrganizationRuleStatus](
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

type Owner = "CUSTOM_LAMBDA" | "AWS"
object Owner {
  val CUSTOM_LAMBDA: "CUSTOM_LAMBDA" = "CUSTOM_LAMBDA"
  val AWS: "AWS" = "AWS"

  @inline def values = js.Array[Owner](CUSTOM_LAMBDA, AWS)
}

type RecorderStatus = "Pending" | "Success" | "Failure"
object RecorderStatus {
  val Pending: "Pending" = "Pending"
  val Success: "Success" = "Success"
  val Failure: "Failure" = "Failure"

  @inline def values = js.Array[RecorderStatus](Pending, Success, Failure)
}

type RemediationExecutionState = "QUEUED" | "IN_PROGRESS" | "SUCCEEDED" | "FAILED"
object RemediationExecutionState {
  val QUEUED: "QUEUED" = "QUEUED"
  val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[RemediationExecutionState](QUEUED, IN_PROGRESS, SUCCEEDED, FAILED)
}

type RemediationExecutionStepState = "SUCCEEDED" | "PENDING" | "FAILED"
object RemediationExecutionStepState {
  val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  val PENDING: "PENDING" = "PENDING"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[RemediationExecutionStepState](SUCCEEDED, PENDING, FAILED)
}

type RemediationTargetType = "SSM_DOCUMENT"
object RemediationTargetType {
  val SSM_DOCUMENT: "SSM_DOCUMENT" = "SSM_DOCUMENT"

  @inline def values = js.Array[RemediationTargetType](SSM_DOCUMENT)
}

type ResourceCountGroupKey = "RESOURCE_TYPE" | "ACCOUNT_ID" | "AWS_REGION"
object ResourceCountGroupKey {
  val RESOURCE_TYPE: "RESOURCE_TYPE" = "RESOURCE_TYPE"
  val ACCOUNT_ID: "ACCOUNT_ID" = "ACCOUNT_ID"
  val AWS_REGION: "AWS_REGION" = "AWS_REGION"

  @inline def values = js.Array[ResourceCountGroupKey](RESOURCE_TYPE, ACCOUNT_ID, AWS_REGION)
}

type ResourceType = "AWS::EC2::CustomerGateway" | "AWS::EC2::EIP" | "AWS::EC2::Host" | "AWS::EC2::Instance" | "AWS::EC2::InternetGateway" | "AWS::EC2::NetworkAcl" | "AWS::EC2::NetworkInterface" | "AWS::EC2::RouteTable" | "AWS::EC2::SecurityGroup" | "AWS::EC2::Subnet" | "AWS::CloudTrail::Trail" | "AWS::EC2::Volume" | "AWS::EC2::VPC" | "AWS::EC2::VPNConnection" | "AWS::EC2::VPNGateway" | "AWS::EC2::RegisteredHAInstance" | "AWS::EC2::NatGateway" | "AWS::EC2::EgressOnlyInternetGateway" | "AWS::EC2::VPCEndpoint" | "AWS::EC2::VPCEndpointService" | "AWS::EC2::FlowLog" | "AWS::EC2::VPCPeeringConnection" | "AWS::Elasticsearch::Domain" | "AWS::IAM::Group" | "AWS::IAM::Policy" | "AWS::IAM::Role" | "AWS::IAM::User" | "AWS::ElasticLoadBalancingV2::LoadBalancer" | "AWS::ACM::Certificate" | "AWS::RDS::DBInstance" | "AWS::RDS::DBSubnetGroup" | "AWS::RDS::DBSecurityGroup" | "AWS::RDS::DBSnapshot" | "AWS::RDS::DBCluster" | "AWS::RDS::DBClusterSnapshot" | "AWS::RDS::EventSubscription" |
  "AWS::S3::Bucket" | "AWS::S3::AccountPublicAccessBlock" | "AWS::Redshift::Cluster" | "AWS::Redshift::ClusterSnapshot" | "AWS::Redshift::ClusterParameterGroup" | "AWS::Redshift::ClusterSecurityGroup" | "AWS::Redshift::ClusterSubnetGroup" | "AWS::Redshift::EventSubscription" | "AWS::SSM::ManagedInstanceInventory" | "AWS::CloudWatch::Alarm" | "AWS::CloudFormation::Stack" | "AWS::ElasticLoadBalancing::LoadBalancer" | "AWS::AutoScaling::AutoScalingGroup" | "AWS::AutoScaling::LaunchConfiguration" | "AWS::AutoScaling::ScalingPolicy" | "AWS::AutoScaling::ScheduledAction" | "AWS::DynamoDB::Table" | "AWS::CodeBuild::Project" | "AWS::WAF::RateBasedRule" | "AWS::WAF::Rule" | "AWS::WAF::RuleGroup" | "AWS::WAF::WebACL" | "AWS::WAFRegional::RateBasedRule" | "AWS::WAFRegional::Rule" | "AWS::WAFRegional::RuleGroup" | "AWS::WAFRegional::WebACL" | "AWS::CloudFront::Distribution" | "AWS::CloudFront::StreamingDistribution" | "AWS::Lambda::Function" | "AWS::NetworkFirewall::Firewall" |
  "AWS::NetworkFirewall::FirewallPolicy" | "AWS::NetworkFirewall::RuleGroup" | "AWS::ElasticBeanstalk::Application" | "AWS::ElasticBeanstalk::ApplicationVersion" | "AWS::ElasticBeanstalk::Environment" | "AWS::WAFv2::WebACL" | "AWS::WAFv2::RuleGroup" | "AWS::WAFv2::IPSet" | "AWS::WAFv2::RegexPatternSet" | "AWS::WAFv2::ManagedRuleSet" | "AWS::XRay::EncryptionConfig" | "AWS::SSM::AssociationCompliance" | "AWS::SSM::PatchCompliance" | "AWS::Shield::Protection" | "AWS::ShieldRegional::Protection" | "AWS::Config::ConformancePackCompliance" | "AWS::Config::ResourceCompliance" | "AWS::ApiGateway::Stage" | "AWS::ApiGateway::RestApi" | "AWS::ApiGatewayV2::Stage" | "AWS::ApiGatewayV2::Api" | "AWS::CodePipeline::Pipeline" | "AWS::ServiceCatalog::CloudFormationProvisionedProduct" | "AWS::ServiceCatalog::CloudFormationProduct" | "AWS::ServiceCatalog::Portfolio" | "AWS::SQS::Queue" | "AWS::KMS::Key" | "AWS::QLDB::Ledger" | "AWS::SecretsManager::Secret" | "AWS::SNS::Topic" | "AWS::SSM::FileData"
object ResourceType {
  val `AWS::EC2::CustomerGateway`: "AWS::EC2::CustomerGateway" = "AWS::EC2::CustomerGateway"
  val `AWS::EC2::EIP`: "AWS::EC2::EIP" = "AWS::EC2::EIP"
  val `AWS::EC2::Host`: "AWS::EC2::Host" = "AWS::EC2::Host"
  val `AWS::EC2::Instance`: "AWS::EC2::Instance" = "AWS::EC2::Instance"
  val `AWS::EC2::InternetGateway`: "AWS::EC2::InternetGateway" = "AWS::EC2::InternetGateway"
  val `AWS::EC2::NetworkAcl`: "AWS::EC2::NetworkAcl" = "AWS::EC2::NetworkAcl"
  val `AWS::EC2::NetworkInterface`: "AWS::EC2::NetworkInterface" = "AWS::EC2::NetworkInterface"
  val `AWS::EC2::RouteTable`: "AWS::EC2::RouteTable" = "AWS::EC2::RouteTable"
  val `AWS::EC2::SecurityGroup`: "AWS::EC2::SecurityGroup" = "AWS::EC2::SecurityGroup"
  val `AWS::EC2::Subnet`: "AWS::EC2::Subnet" = "AWS::EC2::Subnet"
  val `AWS::CloudTrail::Trail`: "AWS::CloudTrail::Trail" = "AWS::CloudTrail::Trail"
  val `AWS::EC2::Volume`: "AWS::EC2::Volume" = "AWS::EC2::Volume"
  val `AWS::EC2::VPC`: "AWS::EC2::VPC" = "AWS::EC2::VPC"
  val `AWS::EC2::VPNConnection`: "AWS::EC2::VPNConnection" = "AWS::EC2::VPNConnection"
  val `AWS::EC2::VPNGateway`: "AWS::EC2::VPNGateway" = "AWS::EC2::VPNGateway"
  val `AWS::EC2::RegisteredHAInstance`: "AWS::EC2::RegisteredHAInstance" = "AWS::EC2::RegisteredHAInstance"
  val `AWS::EC2::NatGateway`: "AWS::EC2::NatGateway" = "AWS::EC2::NatGateway"
  val `AWS::EC2::EgressOnlyInternetGateway`: "AWS::EC2::EgressOnlyInternetGateway" = "AWS::EC2::EgressOnlyInternetGateway"
  val `AWS::EC2::VPCEndpoint`: "AWS::EC2::VPCEndpoint" = "AWS::EC2::VPCEndpoint"
  val `AWS::EC2::VPCEndpointService`: "AWS::EC2::VPCEndpointService" = "AWS::EC2::VPCEndpointService"
  val `AWS::EC2::FlowLog`: "AWS::EC2::FlowLog" = "AWS::EC2::FlowLog"
  val `AWS::EC2::VPCPeeringConnection`: "AWS::EC2::VPCPeeringConnection" = "AWS::EC2::VPCPeeringConnection"
  val `AWS::Elasticsearch::Domain`: "AWS::Elasticsearch::Domain" = "AWS::Elasticsearch::Domain"
  val `AWS::IAM::Group`: "AWS::IAM::Group" = "AWS::IAM::Group"
  val `AWS::IAM::Policy`: "AWS::IAM::Policy" = "AWS::IAM::Policy"
  val `AWS::IAM::Role`: "AWS::IAM::Role" = "AWS::IAM::Role"
  val `AWS::IAM::User`: "AWS::IAM::User" = "AWS::IAM::User"
  val `AWS::ElasticLoadBalancingV2::LoadBalancer`: "AWS::ElasticLoadBalancingV2::LoadBalancer" = "AWS::ElasticLoadBalancingV2::LoadBalancer"
  val `AWS::ACM::Certificate`: "AWS::ACM::Certificate" = "AWS::ACM::Certificate"
  val `AWS::RDS::DBInstance`: "AWS::RDS::DBInstance" = "AWS::RDS::DBInstance"
  val `AWS::RDS::DBSubnetGroup`: "AWS::RDS::DBSubnetGroup" = "AWS::RDS::DBSubnetGroup"
  val `AWS::RDS::DBSecurityGroup`: "AWS::RDS::DBSecurityGroup" = "AWS::RDS::DBSecurityGroup"
  val `AWS::RDS::DBSnapshot`: "AWS::RDS::DBSnapshot" = "AWS::RDS::DBSnapshot"
  val `AWS::RDS::DBCluster`: "AWS::RDS::DBCluster" = "AWS::RDS::DBCluster"
  val `AWS::RDS::DBClusterSnapshot`: "AWS::RDS::DBClusterSnapshot" = "AWS::RDS::DBClusterSnapshot"
  val `AWS::RDS::EventSubscription`: "AWS::RDS::EventSubscription" = "AWS::RDS::EventSubscription"
  val `AWS::S3::Bucket`: "AWS::S3::Bucket" = "AWS::S3::Bucket"
  val `AWS::S3::AccountPublicAccessBlock`: "AWS::S3::AccountPublicAccessBlock" = "AWS::S3::AccountPublicAccessBlock"
  val `AWS::Redshift::Cluster`: "AWS::Redshift::Cluster" = "AWS::Redshift::Cluster"
  val `AWS::Redshift::ClusterSnapshot`: "AWS::Redshift::ClusterSnapshot" = "AWS::Redshift::ClusterSnapshot"
  val `AWS::Redshift::ClusterParameterGroup`: "AWS::Redshift::ClusterParameterGroup" = "AWS::Redshift::ClusterParameterGroup"
  val `AWS::Redshift::ClusterSecurityGroup`: "AWS::Redshift::ClusterSecurityGroup" = "AWS::Redshift::ClusterSecurityGroup"
  val `AWS::Redshift::ClusterSubnetGroup`: "AWS::Redshift::ClusterSubnetGroup" = "AWS::Redshift::ClusterSubnetGroup"
  val `AWS::Redshift::EventSubscription`: "AWS::Redshift::EventSubscription" = "AWS::Redshift::EventSubscription"
  val `AWS::SSM::ManagedInstanceInventory`: "AWS::SSM::ManagedInstanceInventory" = "AWS::SSM::ManagedInstanceInventory"
  val `AWS::CloudWatch::Alarm`: "AWS::CloudWatch::Alarm" = "AWS::CloudWatch::Alarm"
  val `AWS::CloudFormation::Stack`: "AWS::CloudFormation::Stack" = "AWS::CloudFormation::Stack"
  val `AWS::ElasticLoadBalancing::LoadBalancer`: "AWS::ElasticLoadBalancing::LoadBalancer" = "AWS::ElasticLoadBalancing::LoadBalancer"
  val `AWS::AutoScaling::AutoScalingGroup`: "AWS::AutoScaling::AutoScalingGroup" = "AWS::AutoScaling::AutoScalingGroup"
  val `AWS::AutoScaling::LaunchConfiguration`: "AWS::AutoScaling::LaunchConfiguration" = "AWS::AutoScaling::LaunchConfiguration"
  val `AWS::AutoScaling::ScalingPolicy`: "AWS::AutoScaling::ScalingPolicy" = "AWS::AutoScaling::ScalingPolicy"
  val `AWS::AutoScaling::ScheduledAction`: "AWS::AutoScaling::ScheduledAction" = "AWS::AutoScaling::ScheduledAction"
  val `AWS::DynamoDB::Table`: "AWS::DynamoDB::Table" = "AWS::DynamoDB::Table"
  val `AWS::CodeBuild::Project`: "AWS::CodeBuild::Project" = "AWS::CodeBuild::Project"
  val `AWS::WAF::RateBasedRule`: "AWS::WAF::RateBasedRule" = "AWS::WAF::RateBasedRule"
  val `AWS::WAF::Rule`: "AWS::WAF::Rule" = "AWS::WAF::Rule"
  val `AWS::WAF::RuleGroup`: "AWS::WAF::RuleGroup" = "AWS::WAF::RuleGroup"
  val `AWS::WAF::WebACL`: "AWS::WAF::WebACL" = "AWS::WAF::WebACL"
  val `AWS::WAFRegional::RateBasedRule`: "AWS::WAFRegional::RateBasedRule" = "AWS::WAFRegional::RateBasedRule"
  val `AWS::WAFRegional::Rule`: "AWS::WAFRegional::Rule" = "AWS::WAFRegional::Rule"
  val `AWS::WAFRegional::RuleGroup`: "AWS::WAFRegional::RuleGroup" = "AWS::WAFRegional::RuleGroup"
  val `AWS::WAFRegional::WebACL`: "AWS::WAFRegional::WebACL" = "AWS::WAFRegional::WebACL"
  val `AWS::CloudFront::Distribution`: "AWS::CloudFront::Distribution" = "AWS::CloudFront::Distribution"
  val `AWS::CloudFront::StreamingDistribution`: "AWS::CloudFront::StreamingDistribution" = "AWS::CloudFront::StreamingDistribution"
  val `AWS::Lambda::Function`: "AWS::Lambda::Function" = "AWS::Lambda::Function"
  val `AWS::NetworkFirewall::Firewall`: "AWS::NetworkFirewall::Firewall" = "AWS::NetworkFirewall::Firewall"
  val `AWS::NetworkFirewall::FirewallPolicy`: "AWS::NetworkFirewall::FirewallPolicy" = "AWS::NetworkFirewall::FirewallPolicy"
  val `AWS::NetworkFirewall::RuleGroup`: "AWS::NetworkFirewall::RuleGroup" = "AWS::NetworkFirewall::RuleGroup"
  val `AWS::ElasticBeanstalk::Application`: "AWS::ElasticBeanstalk::Application" = "AWS::ElasticBeanstalk::Application"
  val `AWS::ElasticBeanstalk::ApplicationVersion`: "AWS::ElasticBeanstalk::ApplicationVersion" = "AWS::ElasticBeanstalk::ApplicationVersion"
  val `AWS::ElasticBeanstalk::Environment`: "AWS::ElasticBeanstalk::Environment" = "AWS::ElasticBeanstalk::Environment"
  val `AWS::WAFv2::WebACL`: "AWS::WAFv2::WebACL" = "AWS::WAFv2::WebACL"
  val `AWS::WAFv2::RuleGroup`: "AWS::WAFv2::RuleGroup" = "AWS::WAFv2::RuleGroup"
  val `AWS::WAFv2::IPSet`: "AWS::WAFv2::IPSet" = "AWS::WAFv2::IPSet"
  val `AWS::WAFv2::RegexPatternSet`: "AWS::WAFv2::RegexPatternSet" = "AWS::WAFv2::RegexPatternSet"
  val `AWS::WAFv2::ManagedRuleSet`: "AWS::WAFv2::ManagedRuleSet" = "AWS::WAFv2::ManagedRuleSet"
  val `AWS::XRay::EncryptionConfig`: "AWS::XRay::EncryptionConfig" = "AWS::XRay::EncryptionConfig"
  val `AWS::SSM::AssociationCompliance`: "AWS::SSM::AssociationCompliance" = "AWS::SSM::AssociationCompliance"
  val `AWS::SSM::PatchCompliance`: "AWS::SSM::PatchCompliance" = "AWS::SSM::PatchCompliance"
  val `AWS::Shield::Protection`: "AWS::Shield::Protection" = "AWS::Shield::Protection"
  val `AWS::ShieldRegional::Protection`: "AWS::ShieldRegional::Protection" = "AWS::ShieldRegional::Protection"
  val `AWS::Config::ConformancePackCompliance`: "AWS::Config::ConformancePackCompliance" = "AWS::Config::ConformancePackCompliance"
  val `AWS::Config::ResourceCompliance`: "AWS::Config::ResourceCompliance" = "AWS::Config::ResourceCompliance"
  val `AWS::ApiGateway::Stage`: "AWS::ApiGateway::Stage" = "AWS::ApiGateway::Stage"
  val `AWS::ApiGateway::RestApi`: "AWS::ApiGateway::RestApi" = "AWS::ApiGateway::RestApi"
  val `AWS::ApiGatewayV2::Stage`: "AWS::ApiGatewayV2::Stage" = "AWS::ApiGatewayV2::Stage"
  val `AWS::ApiGatewayV2::Api`: "AWS::ApiGatewayV2::Api" = "AWS::ApiGatewayV2::Api"
  val `AWS::CodePipeline::Pipeline`: "AWS::CodePipeline::Pipeline" = "AWS::CodePipeline::Pipeline"
  val `AWS::ServiceCatalog::CloudFormationProvisionedProduct`: "AWS::ServiceCatalog::CloudFormationProvisionedProduct" = "AWS::ServiceCatalog::CloudFormationProvisionedProduct"
  val `AWS::ServiceCatalog::CloudFormationProduct`: "AWS::ServiceCatalog::CloudFormationProduct" = "AWS::ServiceCatalog::CloudFormationProduct"
  val `AWS::ServiceCatalog::Portfolio`: "AWS::ServiceCatalog::Portfolio" = "AWS::ServiceCatalog::Portfolio"
  val `AWS::SQS::Queue`: "AWS::SQS::Queue" = "AWS::SQS::Queue"
  val `AWS::KMS::Key`: "AWS::KMS::Key" = "AWS::KMS::Key"
  val `AWS::QLDB::Ledger`: "AWS::QLDB::Ledger" = "AWS::QLDB::Ledger"
  val `AWS::SecretsManager::Secret`: "AWS::SecretsManager::Secret" = "AWS::SecretsManager::Secret"
  val `AWS::SNS::Topic`: "AWS::SNS::Topic" = "AWS::SNS::Topic"
  val `AWS::SSM::FileData`: "AWS::SSM::FileData" = "AWS::SSM::FileData"

  @inline def values = js.Array[ResourceType](
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

type ResourceValueType = "RESOURCE_ID"
object ResourceValueType {
  val RESOURCE_ID: "RESOURCE_ID" = "RESOURCE_ID"

  @inline def values = js.Array[ResourceValueType](RESOURCE_ID)
}
