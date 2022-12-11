package facade.amazonaws.services.configservice

import scalajs.js

type AggregateConformancePackComplianceSummaryGroupKey = "ACCOUNT_ID" | "AWS_REGION"
object AggregateConformancePackComplianceSummaryGroupKey {
  inline val ACCOUNT_ID: "ACCOUNT_ID" = "ACCOUNT_ID"
  inline val AWS_REGION: "AWS_REGION" = "AWS_REGION"

  inline def values: js.Array[AggregateConformancePackComplianceSummaryGroupKey] = js.Array(ACCOUNT_ID, AWS_REGION)
}

type AggregatedSourceStatusType = "FAILED" | "SUCCEEDED" | "OUTDATED"
object AggregatedSourceStatusType {
  inline val FAILED: "FAILED" = "FAILED"
  inline val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  inline val OUTDATED: "OUTDATED" = "OUTDATED"

  inline def values: js.Array[AggregatedSourceStatusType] = js.Array(FAILED, SUCCEEDED, OUTDATED)
}

type AggregatedSourceType = "ACCOUNT" | "ORGANIZATION"
object AggregatedSourceType {
  inline val ACCOUNT: "ACCOUNT" = "ACCOUNT"
  inline val ORGANIZATION: "ORGANIZATION" = "ORGANIZATION"

  inline def values: js.Array[AggregatedSourceType] = js.Array(ACCOUNT, ORGANIZATION)
}

type ChronologicalOrder = "Reverse" | "Forward"
object ChronologicalOrder {
  inline val Reverse: "Reverse" = "Reverse"
  inline val Forward: "Forward" = "Forward"

  inline def values: js.Array[ChronologicalOrder] = js.Array(Reverse, Forward)
}

type ComplianceType = "COMPLIANT" | "NON_COMPLIANT" | "NOT_APPLICABLE" | "INSUFFICIENT_DATA"
object ComplianceType {
  inline val COMPLIANT: "COMPLIANT" = "COMPLIANT"
  inline val NON_COMPLIANT: "NON_COMPLIANT" = "NON_COMPLIANT"
  inline val NOT_APPLICABLE: "NOT_APPLICABLE" = "NOT_APPLICABLE"
  inline val INSUFFICIENT_DATA: "INSUFFICIENT_DATA" = "INSUFFICIENT_DATA"

  inline def values: js.Array[ComplianceType] = js.Array(COMPLIANT, NON_COMPLIANT, NOT_APPLICABLE, INSUFFICIENT_DATA)
}

type ConfigRuleComplianceSummaryGroupKey = "ACCOUNT_ID" | "AWS_REGION"
object ConfigRuleComplianceSummaryGroupKey {
  inline val ACCOUNT_ID: "ACCOUNT_ID" = "ACCOUNT_ID"
  inline val AWS_REGION: "AWS_REGION" = "AWS_REGION"

  inline def values: js.Array[ConfigRuleComplianceSummaryGroupKey] = js.Array(ACCOUNT_ID, AWS_REGION)
}

type ConfigRuleState = "ACTIVE" | "DELETING" | "DELETING_RESULTS" | "EVALUATING"
object ConfigRuleState {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val DELETING: "DELETING" = "DELETING"
  inline val DELETING_RESULTS: "DELETING_RESULTS" = "DELETING_RESULTS"
  inline val EVALUATING: "EVALUATING" = "EVALUATING"

  inline def values: js.Array[ConfigRuleState] = js.Array(ACTIVE, DELETING, DELETING_RESULTS, EVALUATING)
}

type ConfigurationItemStatus = "OK" | "ResourceDiscovered" | "ResourceNotRecorded" | "ResourceDeleted" | "ResourceDeletedNotRecorded"
object ConfigurationItemStatus {
  inline val OK: "OK" = "OK"
  inline val ResourceDiscovered: "ResourceDiscovered" = "ResourceDiscovered"
  inline val ResourceNotRecorded: "ResourceNotRecorded" = "ResourceNotRecorded"
  inline val ResourceDeleted: "ResourceDeleted" = "ResourceDeleted"
  inline val ResourceDeletedNotRecorded: "ResourceDeletedNotRecorded" = "ResourceDeletedNotRecorded"

  inline def values: js.Array[ConfigurationItemStatus] = js.Array(OK, ResourceDiscovered, ResourceNotRecorded, ResourceDeleted, ResourceDeletedNotRecorded)
}

type ConformancePackComplianceType = "COMPLIANT" | "NON_COMPLIANT" | "INSUFFICIENT_DATA"
object ConformancePackComplianceType {
  inline val COMPLIANT: "COMPLIANT" = "COMPLIANT"
  inline val NON_COMPLIANT: "NON_COMPLIANT" = "NON_COMPLIANT"
  inline val INSUFFICIENT_DATA: "INSUFFICIENT_DATA" = "INSUFFICIENT_DATA"

  inline def values: js.Array[ConformancePackComplianceType] = js.Array(COMPLIANT, NON_COMPLIANT, INSUFFICIENT_DATA)
}

type ConformancePackState = "CREATE_IN_PROGRESS" | "CREATE_COMPLETE" | "CREATE_FAILED" | "DELETE_IN_PROGRESS" | "DELETE_FAILED"
object ConformancePackState {
  inline val CREATE_IN_PROGRESS: "CREATE_IN_PROGRESS" = "CREATE_IN_PROGRESS"
  inline val CREATE_COMPLETE: "CREATE_COMPLETE" = "CREATE_COMPLETE"
  inline val CREATE_FAILED: "CREATE_FAILED" = "CREATE_FAILED"
  inline val DELETE_IN_PROGRESS: "DELETE_IN_PROGRESS" = "DELETE_IN_PROGRESS"
  inline val DELETE_FAILED: "DELETE_FAILED" = "DELETE_FAILED"

  inline def values: js.Array[ConformancePackState] = js.Array(CREATE_IN_PROGRESS, CREATE_COMPLETE, CREATE_FAILED, DELETE_IN_PROGRESS, DELETE_FAILED)
}

type DeliveryStatus = "Success" | "Failure" | "Not_Applicable"
object DeliveryStatus {
  inline val Success: "Success" = "Success"
  inline val Failure: "Failure" = "Failure"
  inline val Not_Applicable: "Not_Applicable" = "Not_Applicable"

  inline def values: js.Array[DeliveryStatus] = js.Array(Success, Failure, Not_Applicable)
}

type EvaluationMode = "DETECTIVE" | "PROACTIVE"
object EvaluationMode {
  inline val DETECTIVE: "DETECTIVE" = "DETECTIVE"
  inline val PROACTIVE: "PROACTIVE" = "PROACTIVE"

  inline def values: js.Array[EvaluationMode] = js.Array(DETECTIVE, PROACTIVE)
}

type EventSource = "aws.config"
object EventSource {
  inline val `aws.config`: "aws.config" = "aws.config"

  inline def values: js.Array[EventSource] = js.Array(`aws.config`)
}

type MaximumExecutionFrequency = "One_Hour" | "Three_Hours" | "Six_Hours" | "Twelve_Hours" | "TwentyFour_Hours"
object MaximumExecutionFrequency {
  inline val One_Hour: "One_Hour" = "One_Hour"
  inline val Three_Hours: "Three_Hours" = "Three_Hours"
  inline val Six_Hours: "Six_Hours" = "Six_Hours"
  inline val Twelve_Hours: "Twelve_Hours" = "Twelve_Hours"
  inline val TwentyFour_Hours: "TwentyFour_Hours" = "TwentyFour_Hours"

  inline def values: js.Array[MaximumExecutionFrequency] = js.Array(One_Hour, Three_Hours, Six_Hours, Twelve_Hours, TwentyFour_Hours)
}

type MemberAccountRuleStatus = "CREATE_SUCCESSFUL" | "CREATE_IN_PROGRESS" | "CREATE_FAILED" | "DELETE_SUCCESSFUL" | "DELETE_FAILED" | "DELETE_IN_PROGRESS" | "UPDATE_SUCCESSFUL" | "UPDATE_IN_PROGRESS" | "UPDATE_FAILED"
object MemberAccountRuleStatus {
  inline val CREATE_SUCCESSFUL: "CREATE_SUCCESSFUL" = "CREATE_SUCCESSFUL"
  inline val CREATE_IN_PROGRESS: "CREATE_IN_PROGRESS" = "CREATE_IN_PROGRESS"
  inline val CREATE_FAILED: "CREATE_FAILED" = "CREATE_FAILED"
  inline val DELETE_SUCCESSFUL: "DELETE_SUCCESSFUL" = "DELETE_SUCCESSFUL"
  inline val DELETE_FAILED: "DELETE_FAILED" = "DELETE_FAILED"
  inline val DELETE_IN_PROGRESS: "DELETE_IN_PROGRESS" = "DELETE_IN_PROGRESS"
  inline val UPDATE_SUCCESSFUL: "UPDATE_SUCCESSFUL" = "UPDATE_SUCCESSFUL"
  inline val UPDATE_IN_PROGRESS: "UPDATE_IN_PROGRESS" = "UPDATE_IN_PROGRESS"
  inline val UPDATE_FAILED: "UPDATE_FAILED" = "UPDATE_FAILED"

  inline def values: js.Array[MemberAccountRuleStatus] = js.Array(
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
  inline val ConfigurationItemChangeNotification: "ConfigurationItemChangeNotification" = "ConfigurationItemChangeNotification"
  inline val ConfigurationSnapshotDeliveryCompleted: "ConfigurationSnapshotDeliveryCompleted" = "ConfigurationSnapshotDeliveryCompleted"
  inline val ScheduledNotification: "ScheduledNotification" = "ScheduledNotification"
  inline val OversizedConfigurationItemChangeNotification: "OversizedConfigurationItemChangeNotification" = "OversizedConfigurationItemChangeNotification"

  inline def values: js.Array[MessageType] = js.Array(ConfigurationItemChangeNotification, ConfigurationSnapshotDeliveryCompleted, ScheduledNotification, OversizedConfigurationItemChangeNotification)
}

type OrganizationConfigRuleTriggerType = "ConfigurationItemChangeNotification" | "OversizedConfigurationItemChangeNotification" | "ScheduledNotification"
object OrganizationConfigRuleTriggerType {
  inline val ConfigurationItemChangeNotification: "ConfigurationItemChangeNotification" = "ConfigurationItemChangeNotification"
  inline val OversizedConfigurationItemChangeNotification: "OversizedConfigurationItemChangeNotification" = "OversizedConfigurationItemChangeNotification"
  inline val ScheduledNotification: "ScheduledNotification" = "ScheduledNotification"

  inline def values: js.Array[OrganizationConfigRuleTriggerType] = js.Array(ConfigurationItemChangeNotification, OversizedConfigurationItemChangeNotification, ScheduledNotification)
}

type OrganizationConfigRuleTriggerTypeNoSN = "ConfigurationItemChangeNotification" | "OversizedConfigurationItemChangeNotification"
object OrganizationConfigRuleTriggerTypeNoSN {
  inline val ConfigurationItemChangeNotification: "ConfigurationItemChangeNotification" = "ConfigurationItemChangeNotification"
  inline val OversizedConfigurationItemChangeNotification: "OversizedConfigurationItemChangeNotification" = "OversizedConfigurationItemChangeNotification"

  inline def values: js.Array[OrganizationConfigRuleTriggerTypeNoSN] = js.Array(ConfigurationItemChangeNotification, OversizedConfigurationItemChangeNotification)
}

type OrganizationResourceDetailedStatus = "CREATE_SUCCESSFUL" | "CREATE_IN_PROGRESS" | "CREATE_FAILED" | "DELETE_SUCCESSFUL" | "DELETE_FAILED" | "DELETE_IN_PROGRESS" | "UPDATE_SUCCESSFUL" | "UPDATE_IN_PROGRESS" | "UPDATE_FAILED"
object OrganizationResourceDetailedStatus {
  inline val CREATE_SUCCESSFUL: "CREATE_SUCCESSFUL" = "CREATE_SUCCESSFUL"
  inline val CREATE_IN_PROGRESS: "CREATE_IN_PROGRESS" = "CREATE_IN_PROGRESS"
  inline val CREATE_FAILED: "CREATE_FAILED" = "CREATE_FAILED"
  inline val DELETE_SUCCESSFUL: "DELETE_SUCCESSFUL" = "DELETE_SUCCESSFUL"
  inline val DELETE_FAILED: "DELETE_FAILED" = "DELETE_FAILED"
  inline val DELETE_IN_PROGRESS: "DELETE_IN_PROGRESS" = "DELETE_IN_PROGRESS"
  inline val UPDATE_SUCCESSFUL: "UPDATE_SUCCESSFUL" = "UPDATE_SUCCESSFUL"
  inline val UPDATE_IN_PROGRESS: "UPDATE_IN_PROGRESS" = "UPDATE_IN_PROGRESS"
  inline val UPDATE_FAILED: "UPDATE_FAILED" = "UPDATE_FAILED"

  inline def values: js.Array[OrganizationResourceDetailedStatus] = js.Array(
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
  inline val CREATE_SUCCESSFUL: "CREATE_SUCCESSFUL" = "CREATE_SUCCESSFUL"
  inline val CREATE_IN_PROGRESS: "CREATE_IN_PROGRESS" = "CREATE_IN_PROGRESS"
  inline val CREATE_FAILED: "CREATE_FAILED" = "CREATE_FAILED"
  inline val DELETE_SUCCESSFUL: "DELETE_SUCCESSFUL" = "DELETE_SUCCESSFUL"
  inline val DELETE_FAILED: "DELETE_FAILED" = "DELETE_FAILED"
  inline val DELETE_IN_PROGRESS: "DELETE_IN_PROGRESS" = "DELETE_IN_PROGRESS"
  inline val UPDATE_SUCCESSFUL: "UPDATE_SUCCESSFUL" = "UPDATE_SUCCESSFUL"
  inline val UPDATE_IN_PROGRESS: "UPDATE_IN_PROGRESS" = "UPDATE_IN_PROGRESS"
  inline val UPDATE_FAILED: "UPDATE_FAILED" = "UPDATE_FAILED"

  inline def values: js.Array[OrganizationResourceStatus] = js.Array(
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
  inline val CREATE_SUCCESSFUL: "CREATE_SUCCESSFUL" = "CREATE_SUCCESSFUL"
  inline val CREATE_IN_PROGRESS: "CREATE_IN_PROGRESS" = "CREATE_IN_PROGRESS"
  inline val CREATE_FAILED: "CREATE_FAILED" = "CREATE_FAILED"
  inline val DELETE_SUCCESSFUL: "DELETE_SUCCESSFUL" = "DELETE_SUCCESSFUL"
  inline val DELETE_FAILED: "DELETE_FAILED" = "DELETE_FAILED"
  inline val DELETE_IN_PROGRESS: "DELETE_IN_PROGRESS" = "DELETE_IN_PROGRESS"
  inline val UPDATE_SUCCESSFUL: "UPDATE_SUCCESSFUL" = "UPDATE_SUCCESSFUL"
  inline val UPDATE_IN_PROGRESS: "UPDATE_IN_PROGRESS" = "UPDATE_IN_PROGRESS"
  inline val UPDATE_FAILED: "UPDATE_FAILED" = "UPDATE_FAILED"

  inline def values: js.Array[OrganizationRuleStatus] = js.Array(
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

type Owner = "CUSTOM_LAMBDA" | "AWS" | "CUSTOM_POLICY"
object Owner {
  inline val CUSTOM_LAMBDA: "CUSTOM_LAMBDA" = "CUSTOM_LAMBDA"
  inline val AWS: "AWS" = "AWS"
  inline val CUSTOM_POLICY: "CUSTOM_POLICY" = "CUSTOM_POLICY"

  inline def values: js.Array[Owner] = js.Array(CUSTOM_LAMBDA, AWS, CUSTOM_POLICY)
}

type RecorderStatus = "Pending" | "Success" | "Failure"
object RecorderStatus {
  inline val Pending: "Pending" = "Pending"
  inline val Success: "Success" = "Success"
  inline val Failure: "Failure" = "Failure"

  inline def values: js.Array[RecorderStatus] = js.Array(Pending, Success, Failure)
}

type RemediationExecutionState = "QUEUED" | "IN_PROGRESS" | "SUCCEEDED" | "FAILED"
object RemediationExecutionState {
  inline val QUEUED: "QUEUED" = "QUEUED"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[RemediationExecutionState] = js.Array(QUEUED, IN_PROGRESS, SUCCEEDED, FAILED)
}

type RemediationExecutionStepState = "SUCCEEDED" | "PENDING" | "FAILED"
object RemediationExecutionStepState {
  inline val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  inline val PENDING: "PENDING" = "PENDING"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[RemediationExecutionStepState] = js.Array(SUCCEEDED, PENDING, FAILED)
}

type RemediationTargetType = "SSM_DOCUMENT"
object RemediationTargetType {
  inline val SSM_DOCUMENT: "SSM_DOCUMENT" = "SSM_DOCUMENT"

  inline def values: js.Array[RemediationTargetType] = js.Array(SSM_DOCUMENT)
}

type ResourceConfigurationSchemaType = "CFN_RESOURCE_SCHEMA"
object ResourceConfigurationSchemaType {
  inline val CFN_RESOURCE_SCHEMA: "CFN_RESOURCE_SCHEMA" = "CFN_RESOURCE_SCHEMA"

  inline def values: js.Array[ResourceConfigurationSchemaType] = js.Array(CFN_RESOURCE_SCHEMA)
}

type ResourceCountGroupKey = "RESOURCE_TYPE" | "ACCOUNT_ID" | "AWS_REGION"
object ResourceCountGroupKey {
  inline val RESOURCE_TYPE: "RESOURCE_TYPE" = "RESOURCE_TYPE"
  inline val ACCOUNT_ID: "ACCOUNT_ID" = "ACCOUNT_ID"
  inline val AWS_REGION: "AWS_REGION" = "AWS_REGION"

  inline def values: js.Array[ResourceCountGroupKey] = js.Array(RESOURCE_TYPE, ACCOUNT_ID, AWS_REGION)
}

type ResourceEvaluationStatus = "IN_PROGRESS" | "FAILED" | "SUCCEEDED"
object ResourceEvaluationStatus {
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val FAILED: "FAILED" = "FAILED"
  inline val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"

  inline def values: js.Array[ResourceEvaluationStatus] = js.Array(IN_PROGRESS, FAILED, SUCCEEDED)
}

type ResourceType =
  "AWS::EC2::CustomerGateway" | "AWS::EC2::EIP" | "AWS::EC2::Host" | "AWS::EC2::Instance" | "AWS::EC2::InternetGateway" | "AWS::EC2::NetworkAcl" | "AWS::EC2::NetworkInterface" | "AWS::EC2::RouteTable" | "AWS::EC2::SecurityGroup" | "AWS::EC2::Subnet" | "AWS::CloudTrail::Trail" | "AWS::EC2::Volume" | "AWS::EC2::VPC" | "AWS::EC2::VPNConnection" | "AWS::EC2::VPNGateway" | "AWS::EC2::RegisteredHAInstance" | "AWS::EC2::NatGateway" | "AWS::EC2::EgressOnlyInternetGateway" | "AWS::EC2::VPCEndpoint" | "AWS::EC2::VPCEndpointService" | "AWS::EC2::FlowLog" | "AWS::EC2::VPCPeeringConnection" | "AWS::Elasticsearch::Domain" | "AWS::IAM::Group" | "AWS::IAM::Policy" | "AWS::IAM::Role" | "AWS::IAM::User" | "AWS::ElasticLoadBalancingV2::LoadBalancer" | "AWS::ACM::Certificate" | "AWS::RDS::DBInstance" | "AWS::RDS::DBSubnetGroup" | "AWS::RDS::DBSecurityGroup" | "AWS::RDS::DBSnapshot" | "AWS::RDS::DBCluster" | "AWS::RDS::DBClusterSnapshot" | "AWS::RDS::EventSubscription" | "AWS::S3::Bucket" | "AWS::S3::AccountPublicAccessBlock" | "AWS::Redshift::Cluster" | "AWS::Redshift::ClusterSnapshot" | "AWS::Redshift::ClusterParameterGroup" | "AWS::Redshift::ClusterSecurityGroup" | "AWS::Redshift::ClusterSubnetGroup" | "AWS::Redshift::EventSubscription" | "AWS::SSM::ManagedInstanceInventory" | "AWS::CloudWatch::Alarm" | "AWS::CloudFormation::Stack" | "AWS::ElasticLoadBalancing::LoadBalancer" | "AWS::AutoScaling::AutoScalingGroup" | "AWS::AutoScaling::LaunchConfiguration" | "AWS::AutoScaling::ScalingPolicy" | "AWS::AutoScaling::ScheduledAction" | "AWS::DynamoDB::Table" | "AWS::CodeBuild::Project" | "AWS::WAF::RateBasedRule" | "AWS::WAF::Rule" | "AWS::WAF::RuleGroup" | "AWS::WAF::WebACL" | "AWS::WAFRegional::RateBasedRule" | "AWS::WAFRegional::Rule" | "AWS::WAFRegional::RuleGroup" | "AWS::WAFRegional::WebACL" | "AWS::CloudFront::Distribution" | "AWS::CloudFront::StreamingDistribution" | "AWS::Lambda::Function" | "AWS::NetworkFirewall::Firewall" | "AWS::NetworkFirewall::FirewallPolicy" | "AWS::NetworkFirewall::RuleGroup" | "AWS::ElasticBeanstalk::Application" | "AWS::ElasticBeanstalk::ApplicationVersion" | "AWS::ElasticBeanstalk::Environment" | "AWS::WAFv2::WebACL" | "AWS::WAFv2::RuleGroup" | "AWS::WAFv2::IPSet" | "AWS::WAFv2::RegexPatternSet" | "AWS::WAFv2::ManagedRuleSet" | "AWS::XRay::EncryptionConfig" | "AWS::SSM::AssociationCompliance" | "AWS::SSM::PatchCompliance" | "AWS::Shield::Protection" | "AWS::ShieldRegional::Protection" | "AWS::Config::ConformancePackCompliance" | "AWS::Config::ResourceCompliance" | "AWS::ApiGateway::Stage" | "AWS::ApiGateway::RestApi" | "AWS::ApiGatewayV2::Stage" | "AWS::ApiGatewayV2::Api" | "AWS::CodePipeline::Pipeline" | "AWS::ServiceCatalog::CloudFormationProvisionedProduct" | "AWS::ServiceCatalog::CloudFormationProduct" | "AWS::ServiceCatalog::Portfolio" | "AWS::SQS::Queue" | "AWS::KMS::Key" | "AWS::QLDB::Ledger" | "AWS::SecretsManager::Secret" | "AWS::SNS::Topic" | "AWS::SSM::FileData" | "AWS::Backup::BackupPlan" | "AWS::Backup::BackupSelection" | "AWS::Backup::BackupVault" | "AWS::Backup::RecoveryPoint" | "AWS::ECR::Repository" | "AWS::ECS::Cluster" | "AWS::ECS::Service" | "AWS::ECS::TaskDefinition" | "AWS::EFS::AccessPoint" | "AWS::EFS::FileSystem" | "AWS::EKS::Cluster" | "AWS::OpenSearch::Domain" | "AWS::EC2::TransitGateway" | "AWS::Kinesis::Stream" | "AWS::Kinesis::StreamConsumer" | "AWS::CodeDeploy::Application" | "AWS::CodeDeploy::DeploymentConfig" | "AWS::CodeDeploy::DeploymentGroup" | "AWS::EC2::LaunchTemplate" | "AWS::ECR::PublicRepository" | "AWS::GuardDuty::Detector" | "AWS::EMR::SecurityConfiguration" | "AWS::SageMaker::CodeRepository" | "AWS::Route53Resolver::ResolverEndpoint" | "AWS::Route53Resolver::ResolverRule" | "AWS::Route53Resolver::ResolverRuleAssociation" | "AWS::DMS::ReplicationSubnetGroup" | "AWS::DMS::EventSubscription" | "AWS::MSK::Cluster" | "AWS::StepFunctions::Activity" | "AWS::WorkSpaces::Workspace" | "AWS::WorkSpaces::ConnectionAlias" | "AWS::SageMaker::Model" | "AWS::ElasticLoadBalancingV2::Listener" | "AWS::StepFunctions::StateMachine" | "AWS::Batch::JobQueue" | "AWS::Batch::ComputeEnvironment" | "AWS::AccessAnalyzer::Analyzer" | "AWS::Athena::WorkGroup" | "AWS::Athena::DataCatalog" | "AWS::Detective::Graph" | "AWS::GlobalAccelerator::Accelerator" | "AWS::GlobalAccelerator::EndpointGroup" | "AWS::GlobalAccelerator::Listener" | "AWS::EC2::TransitGatewayAttachment" | "AWS::EC2::TransitGatewayRouteTable" | "AWS::DMS::Certificate" | "AWS::AppConfig::Application" | "AWS::AppSync::GraphQLApi" | "AWS::DataSync::LocationSMB" | "AWS::DataSync::LocationFSxLustre" | "AWS::DataSync::LocationS3" | "AWS::DataSync::LocationEFS" | "AWS::DataSync::Task" | "AWS::DataSync::LocationNFS" | "AWS::EC2::NetworkInsightsAccessScopeAnalysis" | "AWS::EKS::FargateProfile" | "AWS::Glue::Job" | "AWS::GuardDuty::ThreatIntelSet" | "AWS::GuardDuty::IPSet" | "AWS::SageMaker::Workteam" | "AWS::SageMaker::NotebookInstanceLifecycleConfig" | "AWS::ServiceDiscovery::Service" | "AWS::ServiceDiscovery::PublicDnsNamespace" | "AWS::SES::ContactList" | "AWS::SES::ConfigurationSet" | "AWS::Route53::HostedZone"
object ResourceType {
  inline val `AWS::EC2::CustomerGateway`: "AWS::EC2::CustomerGateway" = "AWS::EC2::CustomerGateway"
  inline val `AWS::EC2::EIP`: "AWS::EC2::EIP" = "AWS::EC2::EIP"
  inline val `AWS::EC2::Host`: "AWS::EC2::Host" = "AWS::EC2::Host"
  inline val `AWS::EC2::Instance`: "AWS::EC2::Instance" = "AWS::EC2::Instance"
  inline val `AWS::EC2::InternetGateway`: "AWS::EC2::InternetGateway" = "AWS::EC2::InternetGateway"
  inline val `AWS::EC2::NetworkAcl`: "AWS::EC2::NetworkAcl" = "AWS::EC2::NetworkAcl"
  inline val `AWS::EC2::NetworkInterface`: "AWS::EC2::NetworkInterface" = "AWS::EC2::NetworkInterface"
  inline val `AWS::EC2::RouteTable`: "AWS::EC2::RouteTable" = "AWS::EC2::RouteTable"
  inline val `AWS::EC2::SecurityGroup`: "AWS::EC2::SecurityGroup" = "AWS::EC2::SecurityGroup"
  inline val `AWS::EC2::Subnet`: "AWS::EC2::Subnet" = "AWS::EC2::Subnet"
  inline val `AWS::CloudTrail::Trail`: "AWS::CloudTrail::Trail" = "AWS::CloudTrail::Trail"
  inline val `AWS::EC2::Volume`: "AWS::EC2::Volume" = "AWS::EC2::Volume"
  inline val `AWS::EC2::VPC`: "AWS::EC2::VPC" = "AWS::EC2::VPC"
  inline val `AWS::EC2::VPNConnection`: "AWS::EC2::VPNConnection" = "AWS::EC2::VPNConnection"
  inline val `AWS::EC2::VPNGateway`: "AWS::EC2::VPNGateway" = "AWS::EC2::VPNGateway"
  inline val `AWS::EC2::RegisteredHAInstance`: "AWS::EC2::RegisteredHAInstance" = "AWS::EC2::RegisteredHAInstance"
  inline val `AWS::EC2::NatGateway`: "AWS::EC2::NatGateway" = "AWS::EC2::NatGateway"
  inline val `AWS::EC2::EgressOnlyInternetGateway`: "AWS::EC2::EgressOnlyInternetGateway" = "AWS::EC2::EgressOnlyInternetGateway"
  inline val `AWS::EC2::VPCEndpoint`: "AWS::EC2::VPCEndpoint" = "AWS::EC2::VPCEndpoint"
  inline val `AWS::EC2::VPCEndpointService`: "AWS::EC2::VPCEndpointService" = "AWS::EC2::VPCEndpointService"
  inline val `AWS::EC2::FlowLog`: "AWS::EC2::FlowLog" = "AWS::EC2::FlowLog"
  inline val `AWS::EC2::VPCPeeringConnection`: "AWS::EC2::VPCPeeringConnection" = "AWS::EC2::VPCPeeringConnection"
  inline val `AWS::Elasticsearch::Domain`: "AWS::Elasticsearch::Domain" = "AWS::Elasticsearch::Domain"
  inline val `AWS::IAM::Group`: "AWS::IAM::Group" = "AWS::IAM::Group"
  inline val `AWS::IAM::Policy`: "AWS::IAM::Policy" = "AWS::IAM::Policy"
  inline val `AWS::IAM::Role`: "AWS::IAM::Role" = "AWS::IAM::Role"
  inline val `AWS::IAM::User`: "AWS::IAM::User" = "AWS::IAM::User"
  inline val `AWS::ElasticLoadBalancingV2::LoadBalancer`: "AWS::ElasticLoadBalancingV2::LoadBalancer" = "AWS::ElasticLoadBalancingV2::LoadBalancer"
  inline val `AWS::ACM::Certificate`: "AWS::ACM::Certificate" = "AWS::ACM::Certificate"
  inline val `AWS::RDS::DBInstance`: "AWS::RDS::DBInstance" = "AWS::RDS::DBInstance"
  inline val `AWS::RDS::DBSubnetGroup`: "AWS::RDS::DBSubnetGroup" = "AWS::RDS::DBSubnetGroup"
  inline val `AWS::RDS::DBSecurityGroup`: "AWS::RDS::DBSecurityGroup" = "AWS::RDS::DBSecurityGroup"
  inline val `AWS::RDS::DBSnapshot`: "AWS::RDS::DBSnapshot" = "AWS::RDS::DBSnapshot"
  inline val `AWS::RDS::DBCluster`: "AWS::RDS::DBCluster" = "AWS::RDS::DBCluster"
  inline val `AWS::RDS::DBClusterSnapshot`: "AWS::RDS::DBClusterSnapshot" = "AWS::RDS::DBClusterSnapshot"
  inline val `AWS::RDS::EventSubscription`: "AWS::RDS::EventSubscription" = "AWS::RDS::EventSubscription"
  inline val `AWS::S3::Bucket`: "AWS::S3::Bucket" = "AWS::S3::Bucket"
  inline val `AWS::S3::AccountPublicAccessBlock`: "AWS::S3::AccountPublicAccessBlock" = "AWS::S3::AccountPublicAccessBlock"
  inline val `AWS::Redshift::Cluster`: "AWS::Redshift::Cluster" = "AWS::Redshift::Cluster"
  inline val `AWS::Redshift::ClusterSnapshot`: "AWS::Redshift::ClusterSnapshot" = "AWS::Redshift::ClusterSnapshot"
  inline val `AWS::Redshift::ClusterParameterGroup`: "AWS::Redshift::ClusterParameterGroup" = "AWS::Redshift::ClusterParameterGroup"
  inline val `AWS::Redshift::ClusterSecurityGroup`: "AWS::Redshift::ClusterSecurityGroup" = "AWS::Redshift::ClusterSecurityGroup"
  inline val `AWS::Redshift::ClusterSubnetGroup`: "AWS::Redshift::ClusterSubnetGroup" = "AWS::Redshift::ClusterSubnetGroup"
  inline val `AWS::Redshift::EventSubscription`: "AWS::Redshift::EventSubscription" = "AWS::Redshift::EventSubscription"
  inline val `AWS::SSM::ManagedInstanceInventory`: "AWS::SSM::ManagedInstanceInventory" = "AWS::SSM::ManagedInstanceInventory"
  inline val `AWS::CloudWatch::Alarm`: "AWS::CloudWatch::Alarm" = "AWS::CloudWatch::Alarm"
  inline val `AWS::CloudFormation::Stack`: "AWS::CloudFormation::Stack" = "AWS::CloudFormation::Stack"
  inline val `AWS::ElasticLoadBalancing::LoadBalancer`: "AWS::ElasticLoadBalancing::LoadBalancer" = "AWS::ElasticLoadBalancing::LoadBalancer"
  inline val `AWS::AutoScaling::AutoScalingGroup`: "AWS::AutoScaling::AutoScalingGroup" = "AWS::AutoScaling::AutoScalingGroup"
  inline val `AWS::AutoScaling::LaunchConfiguration`: "AWS::AutoScaling::LaunchConfiguration" = "AWS::AutoScaling::LaunchConfiguration"
  inline val `AWS::AutoScaling::ScalingPolicy`: "AWS::AutoScaling::ScalingPolicy" = "AWS::AutoScaling::ScalingPolicy"
  inline val `AWS::AutoScaling::ScheduledAction`: "AWS::AutoScaling::ScheduledAction" = "AWS::AutoScaling::ScheduledAction"
  inline val `AWS::DynamoDB::Table`: "AWS::DynamoDB::Table" = "AWS::DynamoDB::Table"
  inline val `AWS::CodeBuild::Project`: "AWS::CodeBuild::Project" = "AWS::CodeBuild::Project"
  inline val `AWS::WAF::RateBasedRule`: "AWS::WAF::RateBasedRule" = "AWS::WAF::RateBasedRule"
  inline val `AWS::WAF::Rule`: "AWS::WAF::Rule" = "AWS::WAF::Rule"
  inline val `AWS::WAF::RuleGroup`: "AWS::WAF::RuleGroup" = "AWS::WAF::RuleGroup"
  inline val `AWS::WAF::WebACL`: "AWS::WAF::WebACL" = "AWS::WAF::WebACL"
  inline val `AWS::WAFRegional::RateBasedRule`: "AWS::WAFRegional::RateBasedRule" = "AWS::WAFRegional::RateBasedRule"
  inline val `AWS::WAFRegional::Rule`: "AWS::WAFRegional::Rule" = "AWS::WAFRegional::Rule"
  inline val `AWS::WAFRegional::RuleGroup`: "AWS::WAFRegional::RuleGroup" = "AWS::WAFRegional::RuleGroup"
  inline val `AWS::WAFRegional::WebACL`: "AWS::WAFRegional::WebACL" = "AWS::WAFRegional::WebACL"
  inline val `AWS::CloudFront::Distribution`: "AWS::CloudFront::Distribution" = "AWS::CloudFront::Distribution"
  inline val `AWS::CloudFront::StreamingDistribution`: "AWS::CloudFront::StreamingDistribution" = "AWS::CloudFront::StreamingDistribution"
  inline val `AWS::Lambda::Function`: "AWS::Lambda::Function" = "AWS::Lambda::Function"
  inline val `AWS::NetworkFirewall::Firewall`: "AWS::NetworkFirewall::Firewall" = "AWS::NetworkFirewall::Firewall"
  inline val `AWS::NetworkFirewall::FirewallPolicy`: "AWS::NetworkFirewall::FirewallPolicy" = "AWS::NetworkFirewall::FirewallPolicy"
  inline val `AWS::NetworkFirewall::RuleGroup`: "AWS::NetworkFirewall::RuleGroup" = "AWS::NetworkFirewall::RuleGroup"
  inline val `AWS::ElasticBeanstalk::Application`: "AWS::ElasticBeanstalk::Application" = "AWS::ElasticBeanstalk::Application"
  inline val `AWS::ElasticBeanstalk::ApplicationVersion`: "AWS::ElasticBeanstalk::ApplicationVersion" = "AWS::ElasticBeanstalk::ApplicationVersion"
  inline val `AWS::ElasticBeanstalk::Environment`: "AWS::ElasticBeanstalk::Environment" = "AWS::ElasticBeanstalk::Environment"
  inline val `AWS::WAFv2::WebACL`: "AWS::WAFv2::WebACL" = "AWS::WAFv2::WebACL"
  inline val `AWS::WAFv2::RuleGroup`: "AWS::WAFv2::RuleGroup" = "AWS::WAFv2::RuleGroup"
  inline val `AWS::WAFv2::IPSet`: "AWS::WAFv2::IPSet" = "AWS::WAFv2::IPSet"
  inline val `AWS::WAFv2::RegexPatternSet`: "AWS::WAFv2::RegexPatternSet" = "AWS::WAFv2::RegexPatternSet"
  inline val `AWS::WAFv2::ManagedRuleSet`: "AWS::WAFv2::ManagedRuleSet" = "AWS::WAFv2::ManagedRuleSet"
  inline val `AWS::XRay::EncryptionConfig`: "AWS::XRay::EncryptionConfig" = "AWS::XRay::EncryptionConfig"
  inline val `AWS::SSM::AssociationCompliance`: "AWS::SSM::AssociationCompliance" = "AWS::SSM::AssociationCompliance"
  inline val `AWS::SSM::PatchCompliance`: "AWS::SSM::PatchCompliance" = "AWS::SSM::PatchCompliance"
  inline val `AWS::Shield::Protection`: "AWS::Shield::Protection" = "AWS::Shield::Protection"
  inline val `AWS::ShieldRegional::Protection`: "AWS::ShieldRegional::Protection" = "AWS::ShieldRegional::Protection"
  inline val `AWS::Config::ConformancePackCompliance`: "AWS::Config::ConformancePackCompliance" = "AWS::Config::ConformancePackCompliance"
  inline val `AWS::Config::ResourceCompliance`: "AWS::Config::ResourceCompliance" = "AWS::Config::ResourceCompliance"
  inline val `AWS::ApiGateway::Stage`: "AWS::ApiGateway::Stage" = "AWS::ApiGateway::Stage"
  inline val `AWS::ApiGateway::RestApi`: "AWS::ApiGateway::RestApi" = "AWS::ApiGateway::RestApi"
  inline val `AWS::ApiGatewayV2::Stage`: "AWS::ApiGatewayV2::Stage" = "AWS::ApiGatewayV2::Stage"
  inline val `AWS::ApiGatewayV2::Api`: "AWS::ApiGatewayV2::Api" = "AWS::ApiGatewayV2::Api"
  inline val `AWS::CodePipeline::Pipeline`: "AWS::CodePipeline::Pipeline" = "AWS::CodePipeline::Pipeline"
  inline val `AWS::ServiceCatalog::CloudFormationProvisionedProduct`: "AWS::ServiceCatalog::CloudFormationProvisionedProduct" = "AWS::ServiceCatalog::CloudFormationProvisionedProduct"
  inline val `AWS::ServiceCatalog::CloudFormationProduct`: "AWS::ServiceCatalog::CloudFormationProduct" = "AWS::ServiceCatalog::CloudFormationProduct"
  inline val `AWS::ServiceCatalog::Portfolio`: "AWS::ServiceCatalog::Portfolio" = "AWS::ServiceCatalog::Portfolio"
  inline val `AWS::SQS::Queue`: "AWS::SQS::Queue" = "AWS::SQS::Queue"
  inline val `AWS::KMS::Key`: "AWS::KMS::Key" = "AWS::KMS::Key"
  inline val `AWS::QLDB::Ledger`: "AWS::QLDB::Ledger" = "AWS::QLDB::Ledger"
  inline val `AWS::SecretsManager::Secret`: "AWS::SecretsManager::Secret" = "AWS::SecretsManager::Secret"
  inline val `AWS::SNS::Topic`: "AWS::SNS::Topic" = "AWS::SNS::Topic"
  inline val `AWS::SSM::FileData`: "AWS::SSM::FileData" = "AWS::SSM::FileData"
  inline val `AWS::Backup::BackupPlan`: "AWS::Backup::BackupPlan" = "AWS::Backup::BackupPlan"
  inline val `AWS::Backup::BackupSelection`: "AWS::Backup::BackupSelection" = "AWS::Backup::BackupSelection"
  inline val `AWS::Backup::BackupVault`: "AWS::Backup::BackupVault" = "AWS::Backup::BackupVault"
  inline val `AWS::Backup::RecoveryPoint`: "AWS::Backup::RecoveryPoint" = "AWS::Backup::RecoveryPoint"
  inline val `AWS::ECR::Repository`: "AWS::ECR::Repository" = "AWS::ECR::Repository"
  inline val `AWS::ECS::Cluster`: "AWS::ECS::Cluster" = "AWS::ECS::Cluster"
  inline val `AWS::ECS::Service`: "AWS::ECS::Service" = "AWS::ECS::Service"
  inline val `AWS::ECS::TaskDefinition`: "AWS::ECS::TaskDefinition" = "AWS::ECS::TaskDefinition"
  inline val `AWS::EFS::AccessPoint`: "AWS::EFS::AccessPoint" = "AWS::EFS::AccessPoint"
  inline val `AWS::EFS::FileSystem`: "AWS::EFS::FileSystem" = "AWS::EFS::FileSystem"
  inline val `AWS::EKS::Cluster`: "AWS::EKS::Cluster" = "AWS::EKS::Cluster"
  inline val `AWS::OpenSearch::Domain`: "AWS::OpenSearch::Domain" = "AWS::OpenSearch::Domain"
  inline val `AWS::EC2::TransitGateway`: "AWS::EC2::TransitGateway" = "AWS::EC2::TransitGateway"
  inline val `AWS::Kinesis::Stream`: "AWS::Kinesis::Stream" = "AWS::Kinesis::Stream"
  inline val `AWS::Kinesis::StreamConsumer`: "AWS::Kinesis::StreamConsumer" = "AWS::Kinesis::StreamConsumer"
  inline val `AWS::CodeDeploy::Application`: "AWS::CodeDeploy::Application" = "AWS::CodeDeploy::Application"
  inline val `AWS::CodeDeploy::DeploymentConfig`: "AWS::CodeDeploy::DeploymentConfig" = "AWS::CodeDeploy::DeploymentConfig"
  inline val `AWS::CodeDeploy::DeploymentGroup`: "AWS::CodeDeploy::DeploymentGroup" = "AWS::CodeDeploy::DeploymentGroup"
  inline val `AWS::EC2::LaunchTemplate`: "AWS::EC2::LaunchTemplate" = "AWS::EC2::LaunchTemplate"
  inline val `AWS::ECR::PublicRepository`: "AWS::ECR::PublicRepository" = "AWS::ECR::PublicRepository"
  inline val `AWS::GuardDuty::Detector`: "AWS::GuardDuty::Detector" = "AWS::GuardDuty::Detector"
  inline val `AWS::EMR::SecurityConfiguration`: "AWS::EMR::SecurityConfiguration" = "AWS::EMR::SecurityConfiguration"
  inline val `AWS::SageMaker::CodeRepository`: "AWS::SageMaker::CodeRepository" = "AWS::SageMaker::CodeRepository"
  inline val `AWS::Route53Resolver::ResolverEndpoint`: "AWS::Route53Resolver::ResolverEndpoint" = "AWS::Route53Resolver::ResolverEndpoint"
  inline val `AWS::Route53Resolver::ResolverRule`: "AWS::Route53Resolver::ResolverRule" = "AWS::Route53Resolver::ResolverRule"
  inline val `AWS::Route53Resolver::ResolverRuleAssociation`: "AWS::Route53Resolver::ResolverRuleAssociation" = "AWS::Route53Resolver::ResolverRuleAssociation"
  inline val `AWS::DMS::ReplicationSubnetGroup`: "AWS::DMS::ReplicationSubnetGroup" = "AWS::DMS::ReplicationSubnetGroup"
  inline val `AWS::DMS::EventSubscription`: "AWS::DMS::EventSubscription" = "AWS::DMS::EventSubscription"
  inline val `AWS::MSK::Cluster`: "AWS::MSK::Cluster" = "AWS::MSK::Cluster"
  inline val `AWS::StepFunctions::Activity`: "AWS::StepFunctions::Activity" = "AWS::StepFunctions::Activity"
  inline val `AWS::WorkSpaces::Workspace`: "AWS::WorkSpaces::Workspace" = "AWS::WorkSpaces::Workspace"
  inline val `AWS::WorkSpaces::ConnectionAlias`: "AWS::WorkSpaces::ConnectionAlias" = "AWS::WorkSpaces::ConnectionAlias"
  inline val `AWS::SageMaker::Model`: "AWS::SageMaker::Model" = "AWS::SageMaker::Model"
  inline val `AWS::ElasticLoadBalancingV2::Listener`: "AWS::ElasticLoadBalancingV2::Listener" = "AWS::ElasticLoadBalancingV2::Listener"
  inline val `AWS::StepFunctions::StateMachine`: "AWS::StepFunctions::StateMachine" = "AWS::StepFunctions::StateMachine"
  inline val `AWS::Batch::JobQueue`: "AWS::Batch::JobQueue" = "AWS::Batch::JobQueue"
  inline val `AWS::Batch::ComputeEnvironment`: "AWS::Batch::ComputeEnvironment" = "AWS::Batch::ComputeEnvironment"
  inline val `AWS::AccessAnalyzer::Analyzer`: "AWS::AccessAnalyzer::Analyzer" = "AWS::AccessAnalyzer::Analyzer"
  inline val `AWS::Athena::WorkGroup`: "AWS::Athena::WorkGroup" = "AWS::Athena::WorkGroup"
  inline val `AWS::Athena::DataCatalog`: "AWS::Athena::DataCatalog" = "AWS::Athena::DataCatalog"
  inline val `AWS::Detective::Graph`: "AWS::Detective::Graph" = "AWS::Detective::Graph"
  inline val `AWS::GlobalAccelerator::Accelerator`: "AWS::GlobalAccelerator::Accelerator" = "AWS::GlobalAccelerator::Accelerator"
  inline val `AWS::GlobalAccelerator::EndpointGroup`: "AWS::GlobalAccelerator::EndpointGroup" = "AWS::GlobalAccelerator::EndpointGroup"
  inline val `AWS::GlobalAccelerator::Listener`: "AWS::GlobalAccelerator::Listener" = "AWS::GlobalAccelerator::Listener"
  inline val `AWS::EC2::TransitGatewayAttachment`: "AWS::EC2::TransitGatewayAttachment" = "AWS::EC2::TransitGatewayAttachment"
  inline val `AWS::EC2::TransitGatewayRouteTable`: "AWS::EC2::TransitGatewayRouteTable" = "AWS::EC2::TransitGatewayRouteTable"
  inline val `AWS::DMS::Certificate`: "AWS::DMS::Certificate" = "AWS::DMS::Certificate"
  inline val `AWS::AppConfig::Application`: "AWS::AppConfig::Application" = "AWS::AppConfig::Application"
  inline val `AWS::AppSync::GraphQLApi`: "AWS::AppSync::GraphQLApi" = "AWS::AppSync::GraphQLApi"
  inline val `AWS::DataSync::LocationSMB`: "AWS::DataSync::LocationSMB" = "AWS::DataSync::LocationSMB"
  inline val `AWS::DataSync::LocationFSxLustre`: "AWS::DataSync::LocationFSxLustre" = "AWS::DataSync::LocationFSxLustre"
  inline val `AWS::DataSync::LocationS3`: "AWS::DataSync::LocationS3" = "AWS::DataSync::LocationS3"
  inline val `AWS::DataSync::LocationEFS`: "AWS::DataSync::LocationEFS" = "AWS::DataSync::LocationEFS"
  inline val `AWS::DataSync::Task`: "AWS::DataSync::Task" = "AWS::DataSync::Task"
  inline val `AWS::DataSync::LocationNFS`: "AWS::DataSync::LocationNFS" = "AWS::DataSync::LocationNFS"
  inline val `AWS::EC2::NetworkInsightsAccessScopeAnalysis`: "AWS::EC2::NetworkInsightsAccessScopeAnalysis" = "AWS::EC2::NetworkInsightsAccessScopeAnalysis"
  inline val `AWS::EKS::FargateProfile`: "AWS::EKS::FargateProfile" = "AWS::EKS::FargateProfile"
  inline val `AWS::Glue::Job`: "AWS::Glue::Job" = "AWS::Glue::Job"
  inline val `AWS::GuardDuty::ThreatIntelSet`: "AWS::GuardDuty::ThreatIntelSet" = "AWS::GuardDuty::ThreatIntelSet"
  inline val `AWS::GuardDuty::IPSet`: "AWS::GuardDuty::IPSet" = "AWS::GuardDuty::IPSet"
  inline val `AWS::SageMaker::Workteam`: "AWS::SageMaker::Workteam" = "AWS::SageMaker::Workteam"
  inline val `AWS::SageMaker::NotebookInstanceLifecycleConfig`: "AWS::SageMaker::NotebookInstanceLifecycleConfig" = "AWS::SageMaker::NotebookInstanceLifecycleConfig"
  inline val `AWS::ServiceDiscovery::Service`: "AWS::ServiceDiscovery::Service" = "AWS::ServiceDiscovery::Service"
  inline val `AWS::ServiceDiscovery::PublicDnsNamespace`: "AWS::ServiceDiscovery::PublicDnsNamespace" = "AWS::ServiceDiscovery::PublicDnsNamespace"
  inline val `AWS::SES::ContactList`: "AWS::SES::ContactList" = "AWS::SES::ContactList"
  inline val `AWS::SES::ConfigurationSet`: "AWS::SES::ConfigurationSet" = "AWS::SES::ConfigurationSet"
  inline val `AWS::Route53::HostedZone`: "AWS::Route53::HostedZone" = "AWS::Route53::HostedZone"

  inline def values: js.Array[ResourceType] = js.Array(
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
    `AWS::SSM::FileData`,
    `AWS::Backup::BackupPlan`,
    `AWS::Backup::BackupSelection`,
    `AWS::Backup::BackupVault`,
    `AWS::Backup::RecoveryPoint`,
    `AWS::ECR::Repository`,
    `AWS::ECS::Cluster`,
    `AWS::ECS::Service`,
    `AWS::ECS::TaskDefinition`,
    `AWS::EFS::AccessPoint`,
    `AWS::EFS::FileSystem`,
    `AWS::EKS::Cluster`,
    `AWS::OpenSearch::Domain`,
    `AWS::EC2::TransitGateway`,
    `AWS::Kinesis::Stream`,
    `AWS::Kinesis::StreamConsumer`,
    `AWS::CodeDeploy::Application`,
    `AWS::CodeDeploy::DeploymentConfig`,
    `AWS::CodeDeploy::DeploymentGroup`,
    `AWS::EC2::LaunchTemplate`,
    `AWS::ECR::PublicRepository`,
    `AWS::GuardDuty::Detector`,
    `AWS::EMR::SecurityConfiguration`,
    `AWS::SageMaker::CodeRepository`,
    `AWS::Route53Resolver::ResolverEndpoint`,
    `AWS::Route53Resolver::ResolverRule`,
    `AWS::Route53Resolver::ResolverRuleAssociation`,
    `AWS::DMS::ReplicationSubnetGroup`,
    `AWS::DMS::EventSubscription`,
    `AWS::MSK::Cluster`,
    `AWS::StepFunctions::Activity`,
    `AWS::WorkSpaces::Workspace`,
    `AWS::WorkSpaces::ConnectionAlias`,
    `AWS::SageMaker::Model`,
    `AWS::ElasticLoadBalancingV2::Listener`,
    `AWS::StepFunctions::StateMachine`,
    `AWS::Batch::JobQueue`,
    `AWS::Batch::ComputeEnvironment`,
    `AWS::AccessAnalyzer::Analyzer`,
    `AWS::Athena::WorkGroup`,
    `AWS::Athena::DataCatalog`,
    `AWS::Detective::Graph`,
    `AWS::GlobalAccelerator::Accelerator`,
    `AWS::GlobalAccelerator::EndpointGroup`,
    `AWS::GlobalAccelerator::Listener`,
    `AWS::EC2::TransitGatewayAttachment`,
    `AWS::EC2::TransitGatewayRouteTable`,
    `AWS::DMS::Certificate`,
    `AWS::AppConfig::Application`,
    `AWS::AppSync::GraphQLApi`,
    `AWS::DataSync::LocationSMB`,
    `AWS::DataSync::LocationFSxLustre`,
    `AWS::DataSync::LocationS3`,
    `AWS::DataSync::LocationEFS`,
    `AWS::DataSync::Task`,
    `AWS::DataSync::LocationNFS`,
    `AWS::EC2::NetworkInsightsAccessScopeAnalysis`,
    `AWS::EKS::FargateProfile`,
    `AWS::Glue::Job`,
    `AWS::GuardDuty::ThreatIntelSet`,
    `AWS::GuardDuty::IPSet`,
    `AWS::SageMaker::Workteam`,
    `AWS::SageMaker::NotebookInstanceLifecycleConfig`,
    `AWS::ServiceDiscovery::Service`,
    `AWS::ServiceDiscovery::PublicDnsNamespace`,
    `AWS::SES::ContactList`,
    `AWS::SES::ConfigurationSet`,
    `AWS::Route53::HostedZone`
  )
}

type ResourceValueType = "RESOURCE_ID"
object ResourceValueType {
  inline val RESOURCE_ID: "RESOURCE_ID" = "RESOURCE_ID"

  inline def values: js.Array[ResourceValueType] = js.Array(RESOURCE_ID)
}

type SortBy = "SCORE"
object SortBy {
  inline val SCORE: "SCORE" = "SCORE"

  inline def values: js.Array[SortBy] = js.Array(SCORE)
}

type SortOrder = "ASCENDING" | "DESCENDING"
object SortOrder {
  inline val ASCENDING: "ASCENDING" = "ASCENDING"
  inline val DESCENDING: "DESCENDING" = "DESCENDING"

  inline def values: js.Array[SortOrder] = js.Array(ASCENDING, DESCENDING)
}
