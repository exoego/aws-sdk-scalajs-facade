package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object appflow {
  type ARN = String
  type AccessKeyId = String
  type AccessToken = String
  type AccountName = String
  type ApiKey = String
  type ApiSecretKey = String
  type ApiToken = String
  type ApplicationKey = String
  type AuthCode = String
  type BucketName = String
  type BucketPrefix = String
  type ClientCredentialsArn = String
  type ClientId = String
  type ClientSecret = String
  type ConnectorConfigurationsMap = js.Dictionary[ConnectorConfiguration]
  type ConnectorEntityFieldList = js.Array[ConnectorEntityField]
  type ConnectorEntityList = js.Array[ConnectorEntity]
  type ConnectorEntityMap = js.Dictionary[ConnectorEntityList]
  type ConnectorProfileArn = String
  type ConnectorProfileDetailList = js.Array[ConnectorProfile]
  type ConnectorProfileName = String
  type ConnectorProfileNameList = js.Array[ConnectorProfileName]
  type ConnectorTypeList = js.Array[ConnectorType]
  type CreatedBy = String
  type DatabaseUrl = String
  type Date = js.Date
  type DatetimeTypeFieldName = String
  type Description = String
  type DestinationField = String
  type DestinationFlowConfigList = js.Array[DestinationFlowConfig]
  type EntitiesPath = String
  type ExecutionId = String
  type ExecutionMessage = String
  type FieldType = String
  type FilterOperatorList = js.Array[Operator]
  type FlowArn = String
  type FlowDescription = String
  type FlowExecutionList = js.Array[ExecutionRecord]
  type FlowList = js.Array[FlowDefinition]
  type FlowName = String
  type FlowStatusMessage = String
  type Group = String
  type IdFieldNameList = js.Array[Name]
  type Identifier = String
  type InstanceUrl = String
  type KMSArn = String
  type Key = String
  type Label = String
  type MaxResults = Int
  type MostRecentExecutionMessage = String
  type Name = String
  type NextToken = String
  type OAuthScope = String
  type OAuthScopeList = js.Array[OAuthScope]
  type Object = String
  type Password = String
  type PrivateLinkServiceName = String
  type Property = String
  type RedirectUri = String
  type RefreshToken = String
  type Region = String
  type RegionList = js.Array[Region]
  type RoleArn = String
  type ScheduleExpression = String
  type SchedulingFrequencyTypeList = js.Array[ScheduleFrequencyType]
  type SecretKey = String
  type SourceFields = js.Array[String]
  type Stage = String
  type SupportedValueList = js.Array[Value]
  type SupportedWriteOperationList = js.Array[WriteOperationType]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagMap = js.Dictionary[TagValue]
  type TagValue = String
  type TaskPropertiesMap = js.Dictionary[Property]
  type Tasks = js.Array[Task]
  type Timezone = String
  type TriggerTypeList = js.Array[TriggerType]
  type UpdatedBy = String
  type UpsolverBucketName = String
  type Username = String
  type Value = String
  type Warehouse = String

  implicit final class AppflowOps(private val service: Appflow) extends AnyVal {

    @inline def createConnectorProfileFuture(params: CreateConnectorProfileRequest): Future[CreateConnectorProfileResponse] = service.createConnectorProfile(params).promise().toFuture
    @inline def createFlowFuture(params: CreateFlowRequest): Future[CreateFlowResponse] = service.createFlow(params).promise().toFuture
    @inline def deleteConnectorProfileFuture(params: DeleteConnectorProfileRequest): Future[DeleteConnectorProfileResponse] = service.deleteConnectorProfile(params).promise().toFuture
    @inline def deleteFlowFuture(params: DeleteFlowRequest): Future[DeleteFlowResponse] = service.deleteFlow(params).promise().toFuture
    @inline def describeConnectorEntityFuture(params: DescribeConnectorEntityRequest): Future[DescribeConnectorEntityResponse] = service.describeConnectorEntity(params).promise().toFuture
    @inline def describeConnectorProfilesFuture(params: DescribeConnectorProfilesRequest): Future[DescribeConnectorProfilesResponse] = service.describeConnectorProfiles(params).promise().toFuture
    @inline def describeConnectorsFuture(params: DescribeConnectorsRequest): Future[DescribeConnectorsResponse] = service.describeConnectors(params).promise().toFuture
    @inline def describeFlowExecutionRecordsFuture(params: DescribeFlowExecutionRecordsRequest): Future[DescribeFlowExecutionRecordsResponse] = service.describeFlowExecutionRecords(params).promise().toFuture
    @inline def describeFlowFuture(params: DescribeFlowRequest): Future[DescribeFlowResponse] = service.describeFlow(params).promise().toFuture
    @inline def listConnectorEntitiesFuture(params: ListConnectorEntitiesRequest): Future[ListConnectorEntitiesResponse] = service.listConnectorEntities(params).promise().toFuture
    @inline def listFlowsFuture(params: ListFlowsRequest): Future[ListFlowsResponse] = service.listFlows(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def startFlowFuture(params: StartFlowRequest): Future[StartFlowResponse] = service.startFlow(params).promise().toFuture
    @inline def stopFlowFuture(params: StopFlowRequest): Future[StopFlowResponse] = service.stopFlow(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateConnectorProfileFuture(params: UpdateConnectorProfileRequest): Future[UpdateConnectorProfileResponse] = service.updateConnectorProfile(params).promise().toFuture
    @inline def updateFlowFuture(params: UpdateFlowRequest): Future[UpdateFlowResponse] = service.updateFlow(params).promise().toFuture

  }
}

package appflow {
  @js.native
  @JSImport("aws-sdk/clients/appflow", JSImport.Namespace, "AWS.Appflow")
  class Appflow() extends js.Object {
    def this(config: AWSConfig) = this()

    def createConnectorProfile(params: CreateConnectorProfileRequest): Request[CreateConnectorProfileResponse] = js.native
    def createFlow(params: CreateFlowRequest): Request[CreateFlowResponse] = js.native
    def deleteConnectorProfile(params: DeleteConnectorProfileRequest): Request[DeleteConnectorProfileResponse] = js.native
    def deleteFlow(params: DeleteFlowRequest): Request[DeleteFlowResponse] = js.native
    def describeConnectorEntity(params: DescribeConnectorEntityRequest): Request[DescribeConnectorEntityResponse] = js.native
    def describeConnectorProfiles(params: DescribeConnectorProfilesRequest): Request[DescribeConnectorProfilesResponse] = js.native
    def describeConnectors(params: DescribeConnectorsRequest): Request[DescribeConnectorsResponse] = js.native
    def describeFlow(params: DescribeFlowRequest): Request[DescribeFlowResponse] = js.native
    def describeFlowExecutionRecords(params: DescribeFlowExecutionRecordsRequest): Request[DescribeFlowExecutionRecordsResponse] = js.native
    def listConnectorEntities(params: ListConnectorEntitiesRequest): Request[ListConnectorEntitiesResponse] = js.native
    def listFlows(params: ListFlowsRequest): Request[ListFlowsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def startFlow(params: StartFlowRequest): Request[StartFlowResponse] = js.native
    def stopFlow(params: StopFlowRequest): Request[StopFlowResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateConnectorProfile(params: UpdateConnectorProfileRequest): Request[UpdateConnectorProfileResponse] = js.native
    def updateFlow(params: UpdateFlowRequest): Request[UpdateFlowResponse] = js.native
  }

  /** The aggregation settings that you can use to customize the output format of your flow data.
    */
  @js.native
  trait AggregationConfig extends js.Object {
    var aggregationType: js.UndefOr[AggregationType]
  }

  object AggregationConfig {
    @inline
    def apply(
        aggregationType: js.UndefOr[AggregationType] = js.undefined
    ): AggregationConfig = {
      val __obj = js.Dynamic.literal()
      aggregationType.foreach(__v => __obj.updateDynamic("aggregationType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AggregationConfig]
    }
  }

  @js.native
  sealed trait AggregationType extends js.Any
  object AggregationType {
    val None = "None".asInstanceOf[AggregationType]
    val SingleFile = "SingleFile".asInstanceOf[AggregationType]

    @inline def values = js.Array(None, SingleFile)
  }

  @js.native
  sealed trait AmplitudeConnectorOperator extends js.Any
  object AmplitudeConnectorOperator {
    val BETWEEN = "BETWEEN".asInstanceOf[AmplitudeConnectorOperator]

    @inline def values = js.Array(BETWEEN)
  }

  /** The connector-specific credentials required when using Amplitude.
    */
  @js.native
  trait AmplitudeConnectorProfileCredentials extends js.Object {
    var apiKey: ApiKey
    var secretKey: SecretKey
  }

  object AmplitudeConnectorProfileCredentials {
    @inline
    def apply(
        apiKey: ApiKey,
        secretKey: SecretKey
    ): AmplitudeConnectorProfileCredentials = {
      val __obj = js.Dynamic.literal(
        "apiKey" -> apiKey.asInstanceOf[js.Any],
        "secretKey" -> secretKey.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AmplitudeConnectorProfileCredentials]
    }
  }

  /** The connector-specific profile properties required when using Amplitude.
    */
  @js.native
  trait AmplitudeConnectorProfileProperties extends js.Object

  object AmplitudeConnectorProfileProperties {
    @inline
    def apply(): AmplitudeConnectorProfileProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AmplitudeConnectorProfileProperties]
    }
  }

  /** The connector metadata specific to Amplitude.
    */
  @js.native
  trait AmplitudeMetadata extends js.Object

  object AmplitudeMetadata {
    @inline
    def apply(): AmplitudeMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AmplitudeMetadata]
    }
  }

  /** The properties that are applied when Amplitude is being used as a source.
    */
  @js.native
  trait AmplitudeSourceProperties extends js.Object {
    var `object`: Object
  }

  object AmplitudeSourceProperties {
    @inline
    def apply(
        `object`: Object
    ): AmplitudeSourceProperties = {
      val __obj = js.Dynamic.literal(
        "object" -> `object`.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AmplitudeSourceProperties]
    }
  }

  @js.native
  sealed trait ConnectionMode extends js.Any
  object ConnectionMode {
    val Public = "Public".asInstanceOf[ConnectionMode]
    val Private = "Private".asInstanceOf[ConnectionMode]

    @inline def values = js.Array(Public, Private)
  }

  /** The configuration settings related to a given connector.
    */
  @js.native
  trait ConnectorConfiguration extends js.Object {
    var canUseAsDestination: js.UndefOr[Boolean]
    var canUseAsSource: js.UndefOr[Boolean]
    var connectorMetadata: js.UndefOr[ConnectorMetadata]
    var isPrivateLinkEnabled: js.UndefOr[Boolean]
    var isPrivateLinkEndpointUrlRequired: js.UndefOr[Boolean]
    var supportedDestinationConnectors: js.UndefOr[ConnectorTypeList]
    var supportedSchedulingFrequencies: js.UndefOr[SchedulingFrequencyTypeList]
    var supportedTriggerTypes: js.UndefOr[TriggerTypeList]
  }

  object ConnectorConfiguration {
    @inline
    def apply(
        canUseAsDestination: js.UndefOr[Boolean] = js.undefined,
        canUseAsSource: js.UndefOr[Boolean] = js.undefined,
        connectorMetadata: js.UndefOr[ConnectorMetadata] = js.undefined,
        isPrivateLinkEnabled: js.UndefOr[Boolean] = js.undefined,
        isPrivateLinkEndpointUrlRequired: js.UndefOr[Boolean] = js.undefined,
        supportedDestinationConnectors: js.UndefOr[ConnectorTypeList] = js.undefined,
        supportedSchedulingFrequencies: js.UndefOr[SchedulingFrequencyTypeList] = js.undefined,
        supportedTriggerTypes: js.UndefOr[TriggerTypeList] = js.undefined
    ): ConnectorConfiguration = {
      val __obj = js.Dynamic.literal()
      canUseAsDestination.foreach(__v => __obj.updateDynamic("canUseAsDestination")(__v.asInstanceOf[js.Any]))
      canUseAsSource.foreach(__v => __obj.updateDynamic("canUseAsSource")(__v.asInstanceOf[js.Any]))
      connectorMetadata.foreach(__v => __obj.updateDynamic("connectorMetadata")(__v.asInstanceOf[js.Any]))
      isPrivateLinkEnabled.foreach(__v => __obj.updateDynamic("isPrivateLinkEnabled")(__v.asInstanceOf[js.Any]))
      isPrivateLinkEndpointUrlRequired.foreach(__v => __obj.updateDynamic("isPrivateLinkEndpointUrlRequired")(__v.asInstanceOf[js.Any]))
      supportedDestinationConnectors.foreach(__v => __obj.updateDynamic("supportedDestinationConnectors")(__v.asInstanceOf[js.Any]))
      supportedSchedulingFrequencies.foreach(__v => __obj.updateDynamic("supportedSchedulingFrequencies")(__v.asInstanceOf[js.Any]))
      supportedTriggerTypes.foreach(__v => __obj.updateDynamic("supportedTriggerTypes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConnectorConfiguration]
    }
  }

  /** The high-level entity that can be queried in Amazon AppFlow. For example, a Salesforce entity might be an <i>Account</i> or <i>Opportunity</i>, whereas a ServiceNow entity might be an <i>Incident</i>.
    */
  @js.native
  trait ConnectorEntity extends js.Object {
    var name: Name
    var hasNestedEntities: js.UndefOr[Boolean]
    var label: js.UndefOr[Label]
  }

  object ConnectorEntity {
    @inline
    def apply(
        name: Name,
        hasNestedEntities: js.UndefOr[Boolean] = js.undefined,
        label: js.UndefOr[Label] = js.undefined
    ): ConnectorEntity = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      hasNestedEntities.foreach(__v => __obj.updateDynamic("hasNestedEntities")(__v.asInstanceOf[js.Any]))
      label.foreach(__v => __obj.updateDynamic("label")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConnectorEntity]
    }
  }

  /** Describes the data model of a connector field. For example, for an <i>account</i> entity, the fields would be <i>account name</i>, <i>account ID</i>, and so on.
    */
  @js.native
  trait ConnectorEntityField extends js.Object {
    var identifier: Identifier
    var description: js.UndefOr[Description]
    var destinationProperties: js.UndefOr[DestinationFieldProperties]
    var label: js.UndefOr[Label]
    var sourceProperties: js.UndefOr[SourceFieldProperties]
    var supportedFieldTypeDetails: js.UndefOr[SupportedFieldTypeDetails]
  }

  object ConnectorEntityField {
    @inline
    def apply(
        identifier: Identifier,
        description: js.UndefOr[Description] = js.undefined,
        destinationProperties: js.UndefOr[DestinationFieldProperties] = js.undefined,
        label: js.UndefOr[Label] = js.undefined,
        sourceProperties: js.UndefOr[SourceFieldProperties] = js.undefined,
        supportedFieldTypeDetails: js.UndefOr[SupportedFieldTypeDetails] = js.undefined
    ): ConnectorEntityField = {
      val __obj = js.Dynamic.literal(
        "identifier" -> identifier.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      destinationProperties.foreach(__v => __obj.updateDynamic("destinationProperties")(__v.asInstanceOf[js.Any]))
      label.foreach(__v => __obj.updateDynamic("label")(__v.asInstanceOf[js.Any]))
      sourceProperties.foreach(__v => __obj.updateDynamic("sourceProperties")(__v.asInstanceOf[js.Any]))
      supportedFieldTypeDetails.foreach(__v => __obj.updateDynamic("supportedFieldTypeDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConnectorEntityField]
    }
  }

  /** A structure to specify connector-specific metadata such as <code>oAuthScopes</code>, <code>supportedRegions</code>, <code>privateLinkServiceUrl</code>, and so on.
    */
  @js.native
  trait ConnectorMetadata extends js.Object {
    var Amplitude: js.UndefOr[AmplitudeMetadata]
    var Datadog: js.UndefOr[DatadogMetadata]
    var Dynatrace: js.UndefOr[DynatraceMetadata]
    var EventBridge: js.UndefOr[EventBridgeMetadata]
    var GoogleAnalytics: js.UndefOr[GoogleAnalyticsMetadata]
    var InforNexus: js.UndefOr[InforNexusMetadata]
    var Marketo: js.UndefOr[MarketoMetadata]
    var Redshift: js.UndefOr[RedshiftMetadata]
    var S3: js.UndefOr[S3Metadata]
    var Salesforce: js.UndefOr[SalesforceMetadata]
    var ServiceNow: js.UndefOr[ServiceNowMetadata]
    var Singular: js.UndefOr[SingularMetadata]
    var Slack: js.UndefOr[SlackMetadata]
    var Snowflake: js.UndefOr[SnowflakeMetadata]
    var Trendmicro: js.UndefOr[TrendmicroMetadata]
    var Upsolver: js.UndefOr[UpsolverMetadata]
    var Veeva: js.UndefOr[VeevaMetadata]
    var Zendesk: js.UndefOr[ZendeskMetadata]
  }

  object ConnectorMetadata {
    @inline
    def apply(
        Amplitude: js.UndefOr[AmplitudeMetadata] = js.undefined,
        Datadog: js.UndefOr[DatadogMetadata] = js.undefined,
        Dynatrace: js.UndefOr[DynatraceMetadata] = js.undefined,
        EventBridge: js.UndefOr[EventBridgeMetadata] = js.undefined,
        GoogleAnalytics: js.UndefOr[GoogleAnalyticsMetadata] = js.undefined,
        InforNexus: js.UndefOr[InforNexusMetadata] = js.undefined,
        Marketo: js.UndefOr[MarketoMetadata] = js.undefined,
        Redshift: js.UndefOr[RedshiftMetadata] = js.undefined,
        S3: js.UndefOr[S3Metadata] = js.undefined,
        Salesforce: js.UndefOr[SalesforceMetadata] = js.undefined,
        ServiceNow: js.UndefOr[ServiceNowMetadata] = js.undefined,
        Singular: js.UndefOr[SingularMetadata] = js.undefined,
        Slack: js.UndefOr[SlackMetadata] = js.undefined,
        Snowflake: js.UndefOr[SnowflakeMetadata] = js.undefined,
        Trendmicro: js.UndefOr[TrendmicroMetadata] = js.undefined,
        Upsolver: js.UndefOr[UpsolverMetadata] = js.undefined,
        Veeva: js.UndefOr[VeevaMetadata] = js.undefined,
        Zendesk: js.UndefOr[ZendeskMetadata] = js.undefined
    ): ConnectorMetadata = {
      val __obj = js.Dynamic.literal()
      Amplitude.foreach(__v => __obj.updateDynamic("Amplitude")(__v.asInstanceOf[js.Any]))
      Datadog.foreach(__v => __obj.updateDynamic("Datadog")(__v.asInstanceOf[js.Any]))
      Dynatrace.foreach(__v => __obj.updateDynamic("Dynatrace")(__v.asInstanceOf[js.Any]))
      EventBridge.foreach(__v => __obj.updateDynamic("EventBridge")(__v.asInstanceOf[js.Any]))
      GoogleAnalytics.foreach(__v => __obj.updateDynamic("GoogleAnalytics")(__v.asInstanceOf[js.Any]))
      InforNexus.foreach(__v => __obj.updateDynamic("InforNexus")(__v.asInstanceOf[js.Any]))
      Marketo.foreach(__v => __obj.updateDynamic("Marketo")(__v.asInstanceOf[js.Any]))
      Redshift.foreach(__v => __obj.updateDynamic("Redshift")(__v.asInstanceOf[js.Any]))
      S3.foreach(__v => __obj.updateDynamic("S3")(__v.asInstanceOf[js.Any]))
      Salesforce.foreach(__v => __obj.updateDynamic("Salesforce")(__v.asInstanceOf[js.Any]))
      ServiceNow.foreach(__v => __obj.updateDynamic("ServiceNow")(__v.asInstanceOf[js.Any]))
      Singular.foreach(__v => __obj.updateDynamic("Singular")(__v.asInstanceOf[js.Any]))
      Slack.foreach(__v => __obj.updateDynamic("Slack")(__v.asInstanceOf[js.Any]))
      Snowflake.foreach(__v => __obj.updateDynamic("Snowflake")(__v.asInstanceOf[js.Any]))
      Trendmicro.foreach(__v => __obj.updateDynamic("Trendmicro")(__v.asInstanceOf[js.Any]))
      Upsolver.foreach(__v => __obj.updateDynamic("Upsolver")(__v.asInstanceOf[js.Any]))
      Veeva.foreach(__v => __obj.updateDynamic("Veeva")(__v.asInstanceOf[js.Any]))
      Zendesk.foreach(__v => __obj.updateDynamic("Zendesk")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConnectorMetadata]
    }
  }

  /** Used by select connectors for which the OAuth workflow is supported, such as Salesforce, Google Analytics, Marketo, Zendesk, and Slack.
    */
  @js.native
  trait ConnectorOAuthRequest extends js.Object {
    var authCode: js.UndefOr[AuthCode]
    var redirectUri: js.UndefOr[RedirectUri]
  }

  object ConnectorOAuthRequest {
    @inline
    def apply(
        authCode: js.UndefOr[AuthCode] = js.undefined,
        redirectUri: js.UndefOr[RedirectUri] = js.undefined
    ): ConnectorOAuthRequest = {
      val __obj = js.Dynamic.literal()
      authCode.foreach(__v => __obj.updateDynamic("authCode")(__v.asInstanceOf[js.Any]))
      redirectUri.foreach(__v => __obj.updateDynamic("redirectUri")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConnectorOAuthRequest]
    }
  }

  /** The operation to be performed on the provided source fields.
    */
  @js.native
  trait ConnectorOperator extends js.Object {
    var Amplitude: js.UndefOr[AmplitudeConnectorOperator]
    var Datadog: js.UndefOr[DatadogConnectorOperator]
    var Dynatrace: js.UndefOr[DynatraceConnectorOperator]
    var GoogleAnalytics: js.UndefOr[GoogleAnalyticsConnectorOperator]
    var InforNexus: js.UndefOr[InforNexusConnectorOperator]
    var Marketo: js.UndefOr[MarketoConnectorOperator]
    var S3: js.UndefOr[S3ConnectorOperator]
    var Salesforce: js.UndefOr[SalesforceConnectorOperator]
    var ServiceNow: js.UndefOr[ServiceNowConnectorOperator]
    var Singular: js.UndefOr[SingularConnectorOperator]
    var Slack: js.UndefOr[SlackConnectorOperator]
    var Trendmicro: js.UndefOr[TrendmicroConnectorOperator]
    var Veeva: js.UndefOr[VeevaConnectorOperator]
    var Zendesk: js.UndefOr[ZendeskConnectorOperator]
  }

  object ConnectorOperator {
    @inline
    def apply(
        Amplitude: js.UndefOr[AmplitudeConnectorOperator] = js.undefined,
        Datadog: js.UndefOr[DatadogConnectorOperator] = js.undefined,
        Dynatrace: js.UndefOr[DynatraceConnectorOperator] = js.undefined,
        GoogleAnalytics: js.UndefOr[GoogleAnalyticsConnectorOperator] = js.undefined,
        InforNexus: js.UndefOr[InforNexusConnectorOperator] = js.undefined,
        Marketo: js.UndefOr[MarketoConnectorOperator] = js.undefined,
        S3: js.UndefOr[S3ConnectorOperator] = js.undefined,
        Salesforce: js.UndefOr[SalesforceConnectorOperator] = js.undefined,
        ServiceNow: js.UndefOr[ServiceNowConnectorOperator] = js.undefined,
        Singular: js.UndefOr[SingularConnectorOperator] = js.undefined,
        Slack: js.UndefOr[SlackConnectorOperator] = js.undefined,
        Trendmicro: js.UndefOr[TrendmicroConnectorOperator] = js.undefined,
        Veeva: js.UndefOr[VeevaConnectorOperator] = js.undefined,
        Zendesk: js.UndefOr[ZendeskConnectorOperator] = js.undefined
    ): ConnectorOperator = {
      val __obj = js.Dynamic.literal()
      Amplitude.foreach(__v => __obj.updateDynamic("Amplitude")(__v.asInstanceOf[js.Any]))
      Datadog.foreach(__v => __obj.updateDynamic("Datadog")(__v.asInstanceOf[js.Any]))
      Dynatrace.foreach(__v => __obj.updateDynamic("Dynatrace")(__v.asInstanceOf[js.Any]))
      GoogleAnalytics.foreach(__v => __obj.updateDynamic("GoogleAnalytics")(__v.asInstanceOf[js.Any]))
      InforNexus.foreach(__v => __obj.updateDynamic("InforNexus")(__v.asInstanceOf[js.Any]))
      Marketo.foreach(__v => __obj.updateDynamic("Marketo")(__v.asInstanceOf[js.Any]))
      S3.foreach(__v => __obj.updateDynamic("S3")(__v.asInstanceOf[js.Any]))
      Salesforce.foreach(__v => __obj.updateDynamic("Salesforce")(__v.asInstanceOf[js.Any]))
      ServiceNow.foreach(__v => __obj.updateDynamic("ServiceNow")(__v.asInstanceOf[js.Any]))
      Singular.foreach(__v => __obj.updateDynamic("Singular")(__v.asInstanceOf[js.Any]))
      Slack.foreach(__v => __obj.updateDynamic("Slack")(__v.asInstanceOf[js.Any]))
      Trendmicro.foreach(__v => __obj.updateDynamic("Trendmicro")(__v.asInstanceOf[js.Any]))
      Veeva.foreach(__v => __obj.updateDynamic("Veeva")(__v.asInstanceOf[js.Any]))
      Zendesk.foreach(__v => __obj.updateDynamic("Zendesk")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConnectorOperator]
    }
  }

  /** Describes an instance of a connector. This includes the provided name, credentials ARN, connection-mode, and so on. To keep the API intuitive and extensible, the fields that are common to all types of connector profiles are explicitly specified at the top level. The rest of the connector-specific properties are available via the <code>connectorProfileProperties</code> field.
    */
  @js.native
  trait ConnectorProfile extends js.Object {
    var connectionMode: js.UndefOr[ConnectionMode]
    var connectorProfileArn: js.UndefOr[ConnectorProfileArn]
    var connectorProfileName: js.UndefOr[ConnectorProfileName]
    var connectorProfileProperties: js.UndefOr[ConnectorProfileProperties]
    var connectorType: js.UndefOr[ConnectorType]
    var createdAt: js.UndefOr[Date]
    var credentialsArn: js.UndefOr[ARN]
    var lastUpdatedAt: js.UndefOr[Date]
  }

  object ConnectorProfile {
    @inline
    def apply(
        connectionMode: js.UndefOr[ConnectionMode] = js.undefined,
        connectorProfileArn: js.UndefOr[ConnectorProfileArn] = js.undefined,
        connectorProfileName: js.UndefOr[ConnectorProfileName] = js.undefined,
        connectorProfileProperties: js.UndefOr[ConnectorProfileProperties] = js.undefined,
        connectorType: js.UndefOr[ConnectorType] = js.undefined,
        createdAt: js.UndefOr[Date] = js.undefined,
        credentialsArn: js.UndefOr[ARN] = js.undefined,
        lastUpdatedAt: js.UndefOr[Date] = js.undefined
    ): ConnectorProfile = {
      val __obj = js.Dynamic.literal()
      connectionMode.foreach(__v => __obj.updateDynamic("connectionMode")(__v.asInstanceOf[js.Any]))
      connectorProfileArn.foreach(__v => __obj.updateDynamic("connectorProfileArn")(__v.asInstanceOf[js.Any]))
      connectorProfileName.foreach(__v => __obj.updateDynamic("connectorProfileName")(__v.asInstanceOf[js.Any]))
      connectorProfileProperties.foreach(__v => __obj.updateDynamic("connectorProfileProperties")(__v.asInstanceOf[js.Any]))
      connectorType.foreach(__v => __obj.updateDynamic("connectorType")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      credentialsArn.foreach(__v => __obj.updateDynamic("credentialsArn")(__v.asInstanceOf[js.Any]))
      lastUpdatedAt.foreach(__v => __obj.updateDynamic("lastUpdatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConnectorProfile]
    }
  }

  /** Defines the connector-specific configuration and credentials for the connector profile.
    */
  @js.native
  trait ConnectorProfileConfig extends js.Object {
    var connectorProfileCredentials: ConnectorProfileCredentials
    var connectorProfileProperties: ConnectorProfileProperties
  }

  object ConnectorProfileConfig {
    @inline
    def apply(
        connectorProfileCredentials: ConnectorProfileCredentials,
        connectorProfileProperties: ConnectorProfileProperties
    ): ConnectorProfileConfig = {
      val __obj = js.Dynamic.literal(
        "connectorProfileCredentials" -> connectorProfileCredentials.asInstanceOf[js.Any],
        "connectorProfileProperties" -> connectorProfileProperties.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ConnectorProfileConfig]
    }
  }

  /** The connector-specific credentials required by a connector.
    */
  @js.native
  trait ConnectorProfileCredentials extends js.Object {
    var Amplitude: js.UndefOr[AmplitudeConnectorProfileCredentials]
    var Datadog: js.UndefOr[DatadogConnectorProfileCredentials]
    var Dynatrace: js.UndefOr[DynatraceConnectorProfileCredentials]
    var GoogleAnalytics: js.UndefOr[GoogleAnalyticsConnectorProfileCredentials]
    var InforNexus: js.UndefOr[InforNexusConnectorProfileCredentials]
    var Marketo: js.UndefOr[MarketoConnectorProfileCredentials]
    var Redshift: js.UndefOr[RedshiftConnectorProfileCredentials]
    var Salesforce: js.UndefOr[SalesforceConnectorProfileCredentials]
    var ServiceNow: js.UndefOr[ServiceNowConnectorProfileCredentials]
    var Singular: js.UndefOr[SingularConnectorProfileCredentials]
    var Slack: js.UndefOr[SlackConnectorProfileCredentials]
    var Snowflake: js.UndefOr[SnowflakeConnectorProfileCredentials]
    var Trendmicro: js.UndefOr[TrendmicroConnectorProfileCredentials]
    var Veeva: js.UndefOr[VeevaConnectorProfileCredentials]
    var Zendesk: js.UndefOr[ZendeskConnectorProfileCredentials]
  }

  object ConnectorProfileCredentials {
    @inline
    def apply(
        Amplitude: js.UndefOr[AmplitudeConnectorProfileCredentials] = js.undefined,
        Datadog: js.UndefOr[DatadogConnectorProfileCredentials] = js.undefined,
        Dynatrace: js.UndefOr[DynatraceConnectorProfileCredentials] = js.undefined,
        GoogleAnalytics: js.UndefOr[GoogleAnalyticsConnectorProfileCredentials] = js.undefined,
        InforNexus: js.UndefOr[InforNexusConnectorProfileCredentials] = js.undefined,
        Marketo: js.UndefOr[MarketoConnectorProfileCredentials] = js.undefined,
        Redshift: js.UndefOr[RedshiftConnectorProfileCredentials] = js.undefined,
        Salesforce: js.UndefOr[SalesforceConnectorProfileCredentials] = js.undefined,
        ServiceNow: js.UndefOr[ServiceNowConnectorProfileCredentials] = js.undefined,
        Singular: js.UndefOr[SingularConnectorProfileCredentials] = js.undefined,
        Slack: js.UndefOr[SlackConnectorProfileCredentials] = js.undefined,
        Snowflake: js.UndefOr[SnowflakeConnectorProfileCredentials] = js.undefined,
        Trendmicro: js.UndefOr[TrendmicroConnectorProfileCredentials] = js.undefined,
        Veeva: js.UndefOr[VeevaConnectorProfileCredentials] = js.undefined,
        Zendesk: js.UndefOr[ZendeskConnectorProfileCredentials] = js.undefined
    ): ConnectorProfileCredentials = {
      val __obj = js.Dynamic.literal()
      Amplitude.foreach(__v => __obj.updateDynamic("Amplitude")(__v.asInstanceOf[js.Any]))
      Datadog.foreach(__v => __obj.updateDynamic("Datadog")(__v.asInstanceOf[js.Any]))
      Dynatrace.foreach(__v => __obj.updateDynamic("Dynatrace")(__v.asInstanceOf[js.Any]))
      GoogleAnalytics.foreach(__v => __obj.updateDynamic("GoogleAnalytics")(__v.asInstanceOf[js.Any]))
      InforNexus.foreach(__v => __obj.updateDynamic("InforNexus")(__v.asInstanceOf[js.Any]))
      Marketo.foreach(__v => __obj.updateDynamic("Marketo")(__v.asInstanceOf[js.Any]))
      Redshift.foreach(__v => __obj.updateDynamic("Redshift")(__v.asInstanceOf[js.Any]))
      Salesforce.foreach(__v => __obj.updateDynamic("Salesforce")(__v.asInstanceOf[js.Any]))
      ServiceNow.foreach(__v => __obj.updateDynamic("ServiceNow")(__v.asInstanceOf[js.Any]))
      Singular.foreach(__v => __obj.updateDynamic("Singular")(__v.asInstanceOf[js.Any]))
      Slack.foreach(__v => __obj.updateDynamic("Slack")(__v.asInstanceOf[js.Any]))
      Snowflake.foreach(__v => __obj.updateDynamic("Snowflake")(__v.asInstanceOf[js.Any]))
      Trendmicro.foreach(__v => __obj.updateDynamic("Trendmicro")(__v.asInstanceOf[js.Any]))
      Veeva.foreach(__v => __obj.updateDynamic("Veeva")(__v.asInstanceOf[js.Any]))
      Zendesk.foreach(__v => __obj.updateDynamic("Zendesk")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConnectorProfileCredentials]
    }
  }

  /** The connector-specific profile properties required by each connector.
    */
  @js.native
  trait ConnectorProfileProperties extends js.Object {
    var Amplitude: js.UndefOr[AmplitudeConnectorProfileProperties]
    var Datadog: js.UndefOr[DatadogConnectorProfileProperties]
    var Dynatrace: js.UndefOr[DynatraceConnectorProfileProperties]
    var GoogleAnalytics: js.UndefOr[GoogleAnalyticsConnectorProfileProperties]
    var InforNexus: js.UndefOr[InforNexusConnectorProfileProperties]
    var Marketo: js.UndefOr[MarketoConnectorProfileProperties]
    var Redshift: js.UndefOr[RedshiftConnectorProfileProperties]
    var Salesforce: js.UndefOr[SalesforceConnectorProfileProperties]
    var ServiceNow: js.UndefOr[ServiceNowConnectorProfileProperties]
    var Singular: js.UndefOr[SingularConnectorProfileProperties]
    var Slack: js.UndefOr[SlackConnectorProfileProperties]
    var Snowflake: js.UndefOr[SnowflakeConnectorProfileProperties]
    var Trendmicro: js.UndefOr[TrendmicroConnectorProfileProperties]
    var Veeva: js.UndefOr[VeevaConnectorProfileProperties]
    var Zendesk: js.UndefOr[ZendeskConnectorProfileProperties]
  }

  object ConnectorProfileProperties {
    @inline
    def apply(
        Amplitude: js.UndefOr[AmplitudeConnectorProfileProperties] = js.undefined,
        Datadog: js.UndefOr[DatadogConnectorProfileProperties] = js.undefined,
        Dynatrace: js.UndefOr[DynatraceConnectorProfileProperties] = js.undefined,
        GoogleAnalytics: js.UndefOr[GoogleAnalyticsConnectorProfileProperties] = js.undefined,
        InforNexus: js.UndefOr[InforNexusConnectorProfileProperties] = js.undefined,
        Marketo: js.UndefOr[MarketoConnectorProfileProperties] = js.undefined,
        Redshift: js.UndefOr[RedshiftConnectorProfileProperties] = js.undefined,
        Salesforce: js.UndefOr[SalesforceConnectorProfileProperties] = js.undefined,
        ServiceNow: js.UndefOr[ServiceNowConnectorProfileProperties] = js.undefined,
        Singular: js.UndefOr[SingularConnectorProfileProperties] = js.undefined,
        Slack: js.UndefOr[SlackConnectorProfileProperties] = js.undefined,
        Snowflake: js.UndefOr[SnowflakeConnectorProfileProperties] = js.undefined,
        Trendmicro: js.UndefOr[TrendmicroConnectorProfileProperties] = js.undefined,
        Veeva: js.UndefOr[VeevaConnectorProfileProperties] = js.undefined,
        Zendesk: js.UndefOr[ZendeskConnectorProfileProperties] = js.undefined
    ): ConnectorProfileProperties = {
      val __obj = js.Dynamic.literal()
      Amplitude.foreach(__v => __obj.updateDynamic("Amplitude")(__v.asInstanceOf[js.Any]))
      Datadog.foreach(__v => __obj.updateDynamic("Datadog")(__v.asInstanceOf[js.Any]))
      Dynatrace.foreach(__v => __obj.updateDynamic("Dynatrace")(__v.asInstanceOf[js.Any]))
      GoogleAnalytics.foreach(__v => __obj.updateDynamic("GoogleAnalytics")(__v.asInstanceOf[js.Any]))
      InforNexus.foreach(__v => __obj.updateDynamic("InforNexus")(__v.asInstanceOf[js.Any]))
      Marketo.foreach(__v => __obj.updateDynamic("Marketo")(__v.asInstanceOf[js.Any]))
      Redshift.foreach(__v => __obj.updateDynamic("Redshift")(__v.asInstanceOf[js.Any]))
      Salesforce.foreach(__v => __obj.updateDynamic("Salesforce")(__v.asInstanceOf[js.Any]))
      ServiceNow.foreach(__v => __obj.updateDynamic("ServiceNow")(__v.asInstanceOf[js.Any]))
      Singular.foreach(__v => __obj.updateDynamic("Singular")(__v.asInstanceOf[js.Any]))
      Slack.foreach(__v => __obj.updateDynamic("Slack")(__v.asInstanceOf[js.Any]))
      Snowflake.foreach(__v => __obj.updateDynamic("Snowflake")(__v.asInstanceOf[js.Any]))
      Trendmicro.foreach(__v => __obj.updateDynamic("Trendmicro")(__v.asInstanceOf[js.Any]))
      Veeva.foreach(__v => __obj.updateDynamic("Veeva")(__v.asInstanceOf[js.Any]))
      Zendesk.foreach(__v => __obj.updateDynamic("Zendesk")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConnectorProfileProperties]
    }
  }

  @js.native
  sealed trait ConnectorType extends js.Any
  object ConnectorType {
    val Salesforce = "Salesforce".asInstanceOf[ConnectorType]
    val Singular = "Singular".asInstanceOf[ConnectorType]
    val Slack = "Slack".asInstanceOf[ConnectorType]
    val Redshift = "Redshift".asInstanceOf[ConnectorType]
    val S3 = "S3".asInstanceOf[ConnectorType]
    val Marketo = "Marketo".asInstanceOf[ConnectorType]
    val Googleanalytics = "Googleanalytics".asInstanceOf[ConnectorType]
    val Zendesk = "Zendesk".asInstanceOf[ConnectorType]
    val Servicenow = "Servicenow".asInstanceOf[ConnectorType]
    val Datadog = "Datadog".asInstanceOf[ConnectorType]
    val Trendmicro = "Trendmicro".asInstanceOf[ConnectorType]
    val Snowflake = "Snowflake".asInstanceOf[ConnectorType]
    val Dynatrace = "Dynatrace".asInstanceOf[ConnectorType]
    val Infornexus = "Infornexus".asInstanceOf[ConnectorType]
    val Amplitude = "Amplitude".asInstanceOf[ConnectorType]
    val Veeva = "Veeva".asInstanceOf[ConnectorType]
    val EventBridge = "EventBridge".asInstanceOf[ConnectorType]
    val Upsolver = "Upsolver".asInstanceOf[ConnectorType]

    @inline def values = js.Array(
      Salesforce,
      Singular,
      Slack,
      Redshift,
      S3,
      Marketo,
      Googleanalytics,
      Zendesk,
      Servicenow,
      Datadog,
      Trendmicro,
      Snowflake,
      Dynatrace,
      Infornexus,
      Amplitude,
      Veeva,
      EventBridge,
      Upsolver
    )
  }

  @js.native
  trait CreateConnectorProfileRequest extends js.Object {
    var connectionMode: ConnectionMode
    var connectorProfileConfig: ConnectorProfileConfig
    var connectorProfileName: ConnectorProfileName
    var connectorType: ConnectorType
    var kmsArn: js.UndefOr[KMSArn]
  }

  object CreateConnectorProfileRequest {
    @inline
    def apply(
        connectionMode: ConnectionMode,
        connectorProfileConfig: ConnectorProfileConfig,
        connectorProfileName: ConnectorProfileName,
        connectorType: ConnectorType,
        kmsArn: js.UndefOr[KMSArn] = js.undefined
    ): CreateConnectorProfileRequest = {
      val __obj = js.Dynamic.literal(
        "connectionMode" -> connectionMode.asInstanceOf[js.Any],
        "connectorProfileConfig" -> connectorProfileConfig.asInstanceOf[js.Any],
        "connectorProfileName" -> connectorProfileName.asInstanceOf[js.Any],
        "connectorType" -> connectorType.asInstanceOf[js.Any]
      )

      kmsArn.foreach(__v => __obj.updateDynamic("kmsArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateConnectorProfileRequest]
    }
  }

  @js.native
  trait CreateConnectorProfileResponse extends js.Object {
    var connectorProfileArn: js.UndefOr[ConnectorProfileArn]
  }

  object CreateConnectorProfileResponse {
    @inline
    def apply(
        connectorProfileArn: js.UndefOr[ConnectorProfileArn] = js.undefined
    ): CreateConnectorProfileResponse = {
      val __obj = js.Dynamic.literal()
      connectorProfileArn.foreach(__v => __obj.updateDynamic("connectorProfileArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateConnectorProfileResponse]
    }
  }

  @js.native
  trait CreateFlowRequest extends js.Object {
    var destinationFlowConfigList: DestinationFlowConfigList
    var flowName: FlowName
    var sourceFlowConfig: SourceFlowConfig
    var tasks: Tasks
    var triggerConfig: TriggerConfig
    var description: js.UndefOr[FlowDescription]
    var kmsArn: js.UndefOr[KMSArn]
    var tags: js.UndefOr[TagMap]
  }

  object CreateFlowRequest {
    @inline
    def apply(
        destinationFlowConfigList: DestinationFlowConfigList,
        flowName: FlowName,
        sourceFlowConfig: SourceFlowConfig,
        tasks: Tasks,
        triggerConfig: TriggerConfig,
        description: js.UndefOr[FlowDescription] = js.undefined,
        kmsArn: js.UndefOr[KMSArn] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateFlowRequest = {
      val __obj = js.Dynamic.literal(
        "destinationFlowConfigList" -> destinationFlowConfigList.asInstanceOf[js.Any],
        "flowName" -> flowName.asInstanceOf[js.Any],
        "sourceFlowConfig" -> sourceFlowConfig.asInstanceOf[js.Any],
        "tasks" -> tasks.asInstanceOf[js.Any],
        "triggerConfig" -> triggerConfig.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      kmsArn.foreach(__v => __obj.updateDynamic("kmsArn")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFlowRequest]
    }
  }

  @js.native
  trait CreateFlowResponse extends js.Object {
    var flowArn: js.UndefOr[FlowArn]
    var flowStatus: js.UndefOr[FlowStatus]
  }

  object CreateFlowResponse {
    @inline
    def apply(
        flowArn: js.UndefOr[FlowArn] = js.undefined,
        flowStatus: js.UndefOr[FlowStatus] = js.undefined
    ): CreateFlowResponse = {
      val __obj = js.Dynamic.literal()
      flowArn.foreach(__v => __obj.updateDynamic("flowArn")(__v.asInstanceOf[js.Any]))
      flowStatus.foreach(__v => __obj.updateDynamic("flowStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFlowResponse]
    }
  }

  @js.native
  sealed trait DataPullMode extends js.Any
  object DataPullMode {
    val Incremental = "Incremental".asInstanceOf[DataPullMode]
    val Complete = "Complete".asInstanceOf[DataPullMode]

    @inline def values = js.Array(Incremental, Complete)
  }

  @js.native
  sealed trait DatadogConnectorOperator extends js.Any
  object DatadogConnectorOperator {
    val PROJECTION = "PROJECTION".asInstanceOf[DatadogConnectorOperator]
    val BETWEEN = "BETWEEN".asInstanceOf[DatadogConnectorOperator]
    val EQUAL_TO = "EQUAL_TO".asInstanceOf[DatadogConnectorOperator]
    val ADDITION = "ADDITION".asInstanceOf[DatadogConnectorOperator]
    val MULTIPLICATION = "MULTIPLICATION".asInstanceOf[DatadogConnectorOperator]
    val DIVISION = "DIVISION".asInstanceOf[DatadogConnectorOperator]
    val SUBTRACTION = "SUBTRACTION".asInstanceOf[DatadogConnectorOperator]
    val MASK_ALL = "MASK_ALL".asInstanceOf[DatadogConnectorOperator]
    val MASK_FIRST_N = "MASK_FIRST_N".asInstanceOf[DatadogConnectorOperator]
    val MASK_LAST_N = "MASK_LAST_N".asInstanceOf[DatadogConnectorOperator]
    val VALIDATE_NON_NULL = "VALIDATE_NON_NULL".asInstanceOf[DatadogConnectorOperator]
    val VALIDATE_NON_ZERO = "VALIDATE_NON_ZERO".asInstanceOf[DatadogConnectorOperator]
    val VALIDATE_NON_NEGATIVE = "VALIDATE_NON_NEGATIVE".asInstanceOf[DatadogConnectorOperator]
    val VALIDATE_NUMERIC = "VALIDATE_NUMERIC".asInstanceOf[DatadogConnectorOperator]
    val NO_OP = "NO_OP".asInstanceOf[DatadogConnectorOperator]

    @inline def values = js.Array(
      PROJECTION,
      BETWEEN,
      EQUAL_TO,
      ADDITION,
      MULTIPLICATION,
      DIVISION,
      SUBTRACTION,
      MASK_ALL,
      MASK_FIRST_N,
      MASK_LAST_N,
      VALIDATE_NON_NULL,
      VALIDATE_NON_ZERO,
      VALIDATE_NON_NEGATIVE,
      VALIDATE_NUMERIC,
      NO_OP
    )
  }

  /** The connector-specific credentials required by Datadog.
    */
  @js.native
  trait DatadogConnectorProfileCredentials extends js.Object {
    var apiKey: ApiKey
    var applicationKey: ApplicationKey
  }

  object DatadogConnectorProfileCredentials {
    @inline
    def apply(
        apiKey: ApiKey,
        applicationKey: ApplicationKey
    ): DatadogConnectorProfileCredentials = {
      val __obj = js.Dynamic.literal(
        "apiKey" -> apiKey.asInstanceOf[js.Any],
        "applicationKey" -> applicationKey.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DatadogConnectorProfileCredentials]
    }
  }

  /** The connector-specific profile properties required by Datadog.
    */
  @js.native
  trait DatadogConnectorProfileProperties extends js.Object {
    var instanceUrl: InstanceUrl
  }

  object DatadogConnectorProfileProperties {
    @inline
    def apply(
        instanceUrl: InstanceUrl
    ): DatadogConnectorProfileProperties = {
      val __obj = js.Dynamic.literal(
        "instanceUrl" -> instanceUrl.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DatadogConnectorProfileProperties]
    }
  }

  /** The connector metadata specific to Datadog.
    */
  @js.native
  trait DatadogMetadata extends js.Object

  object DatadogMetadata {
    @inline
    def apply(): DatadogMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DatadogMetadata]
    }
  }

  /** The properties that are applied when Datadog is being used as a source.
    */
  @js.native
  trait DatadogSourceProperties extends js.Object {
    var `object`: Object
  }

  object DatadogSourceProperties {
    @inline
    def apply(
        `object`: Object
    ): DatadogSourceProperties = {
      val __obj = js.Dynamic.literal(
        "object" -> `object`.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DatadogSourceProperties]
    }
  }

  @js.native
  trait DeleteConnectorProfileRequest extends js.Object {
    var connectorProfileName: ConnectorProfileName
    var forceDelete: js.UndefOr[Boolean]
  }

  object DeleteConnectorProfileRequest {
    @inline
    def apply(
        connectorProfileName: ConnectorProfileName,
        forceDelete: js.UndefOr[Boolean] = js.undefined
    ): DeleteConnectorProfileRequest = {
      val __obj = js.Dynamic.literal(
        "connectorProfileName" -> connectorProfileName.asInstanceOf[js.Any]
      )

      forceDelete.foreach(__v => __obj.updateDynamic("forceDelete")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteConnectorProfileRequest]
    }
  }

  @js.native
  trait DeleteConnectorProfileResponse extends js.Object

  object DeleteConnectorProfileResponse {
    @inline
    def apply(): DeleteConnectorProfileResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteConnectorProfileResponse]
    }
  }

  @js.native
  trait DeleteFlowRequest extends js.Object {
    var flowName: FlowName
    var forceDelete: js.UndefOr[Boolean]
  }

  object DeleteFlowRequest {
    @inline
    def apply(
        flowName: FlowName,
        forceDelete: js.UndefOr[Boolean] = js.undefined
    ): DeleteFlowRequest = {
      val __obj = js.Dynamic.literal(
        "flowName" -> flowName.asInstanceOf[js.Any]
      )

      forceDelete.foreach(__v => __obj.updateDynamic("forceDelete")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteFlowRequest]
    }
  }

  @js.native
  trait DeleteFlowResponse extends js.Object

  object DeleteFlowResponse {
    @inline
    def apply(): DeleteFlowResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteFlowResponse]
    }
  }

  @js.native
  trait DescribeConnectorEntityRequest extends js.Object {
    var connectorEntityName: Name
    var connectorProfileName: js.UndefOr[ConnectorProfileName]
    var connectorType: js.UndefOr[ConnectorType]
  }

  object DescribeConnectorEntityRequest {
    @inline
    def apply(
        connectorEntityName: Name,
        connectorProfileName: js.UndefOr[ConnectorProfileName] = js.undefined,
        connectorType: js.UndefOr[ConnectorType] = js.undefined
    ): DescribeConnectorEntityRequest = {
      val __obj = js.Dynamic.literal(
        "connectorEntityName" -> connectorEntityName.asInstanceOf[js.Any]
      )

      connectorProfileName.foreach(__v => __obj.updateDynamic("connectorProfileName")(__v.asInstanceOf[js.Any]))
      connectorType.foreach(__v => __obj.updateDynamic("connectorType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeConnectorEntityRequest]
    }
  }

  @js.native
  trait DescribeConnectorEntityResponse extends js.Object {
    var connectorEntityFields: ConnectorEntityFieldList
  }

  object DescribeConnectorEntityResponse {
    @inline
    def apply(
        connectorEntityFields: ConnectorEntityFieldList
    ): DescribeConnectorEntityResponse = {
      val __obj = js.Dynamic.literal(
        "connectorEntityFields" -> connectorEntityFields.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeConnectorEntityResponse]
    }
  }

  @js.native
  trait DescribeConnectorProfilesRequest extends js.Object {
    var connectorProfileNames: js.UndefOr[ConnectorProfileNameList]
    var connectorType: js.UndefOr[ConnectorType]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object DescribeConnectorProfilesRequest {
    @inline
    def apply(
        connectorProfileNames: js.UndefOr[ConnectorProfileNameList] = js.undefined,
        connectorType: js.UndefOr[ConnectorType] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeConnectorProfilesRequest = {
      val __obj = js.Dynamic.literal()
      connectorProfileNames.foreach(__v => __obj.updateDynamic("connectorProfileNames")(__v.asInstanceOf[js.Any]))
      connectorType.foreach(__v => __obj.updateDynamic("connectorType")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeConnectorProfilesRequest]
    }
  }

  @js.native
  trait DescribeConnectorProfilesResponse extends js.Object {
    var connectorProfileDetails: js.UndefOr[ConnectorProfileDetailList]
    var nextToken: js.UndefOr[NextToken]
  }

  object DescribeConnectorProfilesResponse {
    @inline
    def apply(
        connectorProfileDetails: js.UndefOr[ConnectorProfileDetailList] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeConnectorProfilesResponse = {
      val __obj = js.Dynamic.literal()
      connectorProfileDetails.foreach(__v => __obj.updateDynamic("connectorProfileDetails")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeConnectorProfilesResponse]
    }
  }

  @js.native
  trait DescribeConnectorsRequest extends js.Object {
    var connectorTypes: js.UndefOr[ConnectorTypeList]
    var nextToken: js.UndefOr[NextToken]
  }

  object DescribeConnectorsRequest {
    @inline
    def apply(
        connectorTypes: js.UndefOr[ConnectorTypeList] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeConnectorsRequest = {
      val __obj = js.Dynamic.literal()
      connectorTypes.foreach(__v => __obj.updateDynamic("connectorTypes")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeConnectorsRequest]
    }
  }

  @js.native
  trait DescribeConnectorsResponse extends js.Object {
    var connectorConfigurations: js.UndefOr[ConnectorConfigurationsMap]
    var nextToken: js.UndefOr[NextToken]
  }

  object DescribeConnectorsResponse {
    @inline
    def apply(
        connectorConfigurations: js.UndefOr[ConnectorConfigurationsMap] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeConnectorsResponse = {
      val __obj = js.Dynamic.literal()
      connectorConfigurations.foreach(__v => __obj.updateDynamic("connectorConfigurations")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeConnectorsResponse]
    }
  }

  @js.native
  trait DescribeFlowExecutionRecordsRequest extends js.Object {
    var flowName: FlowName
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object DescribeFlowExecutionRecordsRequest {
    @inline
    def apply(
        flowName: FlowName,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeFlowExecutionRecordsRequest = {
      val __obj = js.Dynamic.literal(
        "flowName" -> flowName.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeFlowExecutionRecordsRequest]
    }
  }

  @js.native
  trait DescribeFlowExecutionRecordsResponse extends js.Object {
    var flowExecutions: js.UndefOr[FlowExecutionList]
    var nextToken: js.UndefOr[NextToken]
  }

  object DescribeFlowExecutionRecordsResponse {
    @inline
    def apply(
        flowExecutions: js.UndefOr[FlowExecutionList] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeFlowExecutionRecordsResponse = {
      val __obj = js.Dynamic.literal()
      flowExecutions.foreach(__v => __obj.updateDynamic("flowExecutions")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeFlowExecutionRecordsResponse]
    }
  }

  @js.native
  trait DescribeFlowRequest extends js.Object {
    var flowName: FlowName
  }

  object DescribeFlowRequest {
    @inline
    def apply(
        flowName: FlowName
    ): DescribeFlowRequest = {
      val __obj = js.Dynamic.literal(
        "flowName" -> flowName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeFlowRequest]
    }
  }

  @js.native
  trait DescribeFlowResponse extends js.Object {
    var createdAt: js.UndefOr[Date]
    var createdBy: js.UndefOr[CreatedBy]
    var description: js.UndefOr[FlowDescription]
    var destinationFlowConfigList: js.UndefOr[DestinationFlowConfigList]
    var flowArn: js.UndefOr[FlowArn]
    var flowName: js.UndefOr[FlowName]
    var flowStatus: js.UndefOr[FlowStatus]
    var flowStatusMessage: js.UndefOr[FlowStatusMessage]
    var kmsArn: js.UndefOr[KMSArn]
    var lastRunExecutionDetails: js.UndefOr[ExecutionDetails]
    var lastUpdatedAt: js.UndefOr[Date]
    var lastUpdatedBy: js.UndefOr[UpdatedBy]
    var sourceFlowConfig: js.UndefOr[SourceFlowConfig]
    var tags: js.UndefOr[TagMap]
    var tasks: js.UndefOr[Tasks]
    var triggerConfig: js.UndefOr[TriggerConfig]
  }

  object DescribeFlowResponse {
    @inline
    def apply(
        createdAt: js.UndefOr[Date] = js.undefined,
        createdBy: js.UndefOr[CreatedBy] = js.undefined,
        description: js.UndefOr[FlowDescription] = js.undefined,
        destinationFlowConfigList: js.UndefOr[DestinationFlowConfigList] = js.undefined,
        flowArn: js.UndefOr[FlowArn] = js.undefined,
        flowName: js.UndefOr[FlowName] = js.undefined,
        flowStatus: js.UndefOr[FlowStatus] = js.undefined,
        flowStatusMessage: js.UndefOr[FlowStatusMessage] = js.undefined,
        kmsArn: js.UndefOr[KMSArn] = js.undefined,
        lastRunExecutionDetails: js.UndefOr[ExecutionDetails] = js.undefined,
        lastUpdatedAt: js.UndefOr[Date] = js.undefined,
        lastUpdatedBy: js.UndefOr[UpdatedBy] = js.undefined,
        sourceFlowConfig: js.UndefOr[SourceFlowConfig] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined,
        tasks: js.UndefOr[Tasks] = js.undefined,
        triggerConfig: js.UndefOr[TriggerConfig] = js.undefined
    ): DescribeFlowResponse = {
      val __obj = js.Dynamic.literal()
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      createdBy.foreach(__v => __obj.updateDynamic("createdBy")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      destinationFlowConfigList.foreach(__v => __obj.updateDynamic("destinationFlowConfigList")(__v.asInstanceOf[js.Any]))
      flowArn.foreach(__v => __obj.updateDynamic("flowArn")(__v.asInstanceOf[js.Any]))
      flowName.foreach(__v => __obj.updateDynamic("flowName")(__v.asInstanceOf[js.Any]))
      flowStatus.foreach(__v => __obj.updateDynamic("flowStatus")(__v.asInstanceOf[js.Any]))
      flowStatusMessage.foreach(__v => __obj.updateDynamic("flowStatusMessage")(__v.asInstanceOf[js.Any]))
      kmsArn.foreach(__v => __obj.updateDynamic("kmsArn")(__v.asInstanceOf[js.Any]))
      lastRunExecutionDetails.foreach(__v => __obj.updateDynamic("lastRunExecutionDetails")(__v.asInstanceOf[js.Any]))
      lastUpdatedAt.foreach(__v => __obj.updateDynamic("lastUpdatedAt")(__v.asInstanceOf[js.Any]))
      lastUpdatedBy.foreach(__v => __obj.updateDynamic("lastUpdatedBy")(__v.asInstanceOf[js.Any]))
      sourceFlowConfig.foreach(__v => __obj.updateDynamic("sourceFlowConfig")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      tasks.foreach(__v => __obj.updateDynamic("tasks")(__v.asInstanceOf[js.Any]))
      triggerConfig.foreach(__v => __obj.updateDynamic("triggerConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeFlowResponse]
    }
  }

  /** This stores the information that is required to query a particular connector.
    */
  @js.native
  trait DestinationConnectorProperties extends js.Object {
    var EventBridge: js.UndefOr[EventBridgeDestinationProperties]
    var Redshift: js.UndefOr[RedshiftDestinationProperties]
    var S3: js.UndefOr[S3DestinationProperties]
    var Salesforce: js.UndefOr[SalesforceDestinationProperties]
    var Snowflake: js.UndefOr[SnowflakeDestinationProperties]
    var Upsolver: js.UndefOr[UpsolverDestinationProperties]
  }

  object DestinationConnectorProperties {
    @inline
    def apply(
        EventBridge: js.UndefOr[EventBridgeDestinationProperties] = js.undefined,
        Redshift: js.UndefOr[RedshiftDestinationProperties] = js.undefined,
        S3: js.UndefOr[S3DestinationProperties] = js.undefined,
        Salesforce: js.UndefOr[SalesforceDestinationProperties] = js.undefined,
        Snowflake: js.UndefOr[SnowflakeDestinationProperties] = js.undefined,
        Upsolver: js.UndefOr[UpsolverDestinationProperties] = js.undefined
    ): DestinationConnectorProperties = {
      val __obj = js.Dynamic.literal()
      EventBridge.foreach(__v => __obj.updateDynamic("EventBridge")(__v.asInstanceOf[js.Any]))
      Redshift.foreach(__v => __obj.updateDynamic("Redshift")(__v.asInstanceOf[js.Any]))
      S3.foreach(__v => __obj.updateDynamic("S3")(__v.asInstanceOf[js.Any]))
      Salesforce.foreach(__v => __obj.updateDynamic("Salesforce")(__v.asInstanceOf[js.Any]))
      Snowflake.foreach(__v => __obj.updateDynamic("Snowflake")(__v.asInstanceOf[js.Any]))
      Upsolver.foreach(__v => __obj.updateDynamic("Upsolver")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DestinationConnectorProperties]
    }
  }

  /** The properties that can be applied to a field when connector is being used as a destination.
    */
  @js.native
  trait DestinationFieldProperties extends js.Object {
    var isCreatable: js.UndefOr[Boolean]
    var isNullable: js.UndefOr[Boolean]
    var isUpdatable: js.UndefOr[Boolean]
    var isUpsertable: js.UndefOr[Boolean]
    var supportedWriteOperations: js.UndefOr[SupportedWriteOperationList]
  }

  object DestinationFieldProperties {
    @inline
    def apply(
        isCreatable: js.UndefOr[Boolean] = js.undefined,
        isNullable: js.UndefOr[Boolean] = js.undefined,
        isUpdatable: js.UndefOr[Boolean] = js.undefined,
        isUpsertable: js.UndefOr[Boolean] = js.undefined,
        supportedWriteOperations: js.UndefOr[SupportedWriteOperationList] = js.undefined
    ): DestinationFieldProperties = {
      val __obj = js.Dynamic.literal()
      isCreatable.foreach(__v => __obj.updateDynamic("isCreatable")(__v.asInstanceOf[js.Any]))
      isNullable.foreach(__v => __obj.updateDynamic("isNullable")(__v.asInstanceOf[js.Any]))
      isUpdatable.foreach(__v => __obj.updateDynamic("isUpdatable")(__v.asInstanceOf[js.Any]))
      isUpsertable.foreach(__v => __obj.updateDynamic("isUpsertable")(__v.asInstanceOf[js.Any]))
      supportedWriteOperations.foreach(__v => __obj.updateDynamic("supportedWriteOperations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DestinationFieldProperties]
    }
  }

  /** Contains information about the configuration of destination connectors present in the flow.
    */
  @js.native
  trait DestinationFlowConfig extends js.Object {
    var connectorType: ConnectorType
    var destinationConnectorProperties: DestinationConnectorProperties
    var connectorProfileName: js.UndefOr[ConnectorProfileName]
  }

  object DestinationFlowConfig {
    @inline
    def apply(
        connectorType: ConnectorType,
        destinationConnectorProperties: DestinationConnectorProperties,
        connectorProfileName: js.UndefOr[ConnectorProfileName] = js.undefined
    ): DestinationFlowConfig = {
      val __obj = js.Dynamic.literal(
        "connectorType" -> connectorType.asInstanceOf[js.Any],
        "destinationConnectorProperties" -> destinationConnectorProperties.asInstanceOf[js.Any]
      )

      connectorProfileName.foreach(__v => __obj.updateDynamic("connectorProfileName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DestinationFlowConfig]
    }
  }

  @js.native
  sealed trait DynatraceConnectorOperator extends js.Any
  object DynatraceConnectorOperator {
    val PROJECTION = "PROJECTION".asInstanceOf[DynatraceConnectorOperator]
    val BETWEEN = "BETWEEN".asInstanceOf[DynatraceConnectorOperator]
    val EQUAL_TO = "EQUAL_TO".asInstanceOf[DynatraceConnectorOperator]
    val ADDITION = "ADDITION".asInstanceOf[DynatraceConnectorOperator]
    val MULTIPLICATION = "MULTIPLICATION".asInstanceOf[DynatraceConnectorOperator]
    val DIVISION = "DIVISION".asInstanceOf[DynatraceConnectorOperator]
    val SUBTRACTION = "SUBTRACTION".asInstanceOf[DynatraceConnectorOperator]
    val MASK_ALL = "MASK_ALL".asInstanceOf[DynatraceConnectorOperator]
    val MASK_FIRST_N = "MASK_FIRST_N".asInstanceOf[DynatraceConnectorOperator]
    val MASK_LAST_N = "MASK_LAST_N".asInstanceOf[DynatraceConnectorOperator]
    val VALIDATE_NON_NULL = "VALIDATE_NON_NULL".asInstanceOf[DynatraceConnectorOperator]
    val VALIDATE_NON_ZERO = "VALIDATE_NON_ZERO".asInstanceOf[DynatraceConnectorOperator]
    val VALIDATE_NON_NEGATIVE = "VALIDATE_NON_NEGATIVE".asInstanceOf[DynatraceConnectorOperator]
    val VALIDATE_NUMERIC = "VALIDATE_NUMERIC".asInstanceOf[DynatraceConnectorOperator]
    val NO_OP = "NO_OP".asInstanceOf[DynatraceConnectorOperator]

    @inline def values = js.Array(
      PROJECTION,
      BETWEEN,
      EQUAL_TO,
      ADDITION,
      MULTIPLICATION,
      DIVISION,
      SUBTRACTION,
      MASK_ALL,
      MASK_FIRST_N,
      MASK_LAST_N,
      VALIDATE_NON_NULL,
      VALIDATE_NON_ZERO,
      VALIDATE_NON_NEGATIVE,
      VALIDATE_NUMERIC,
      NO_OP
    )
  }

  /** The connector-specific profile credentials required by Dynatrace.
    */
  @js.native
  trait DynatraceConnectorProfileCredentials extends js.Object {
    var apiToken: ApiToken
  }

  object DynatraceConnectorProfileCredentials {
    @inline
    def apply(
        apiToken: ApiToken
    ): DynatraceConnectorProfileCredentials = {
      val __obj = js.Dynamic.literal(
        "apiToken" -> apiToken.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DynatraceConnectorProfileCredentials]
    }
  }

  /** The connector-specific profile properties required by Dynatrace.
    */
  @js.native
  trait DynatraceConnectorProfileProperties extends js.Object {
    var instanceUrl: InstanceUrl
  }

  object DynatraceConnectorProfileProperties {
    @inline
    def apply(
        instanceUrl: InstanceUrl
    ): DynatraceConnectorProfileProperties = {
      val __obj = js.Dynamic.literal(
        "instanceUrl" -> instanceUrl.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DynatraceConnectorProfileProperties]
    }
  }

  /** The connector metadata specific to Dynatrace.
    */
  @js.native
  trait DynatraceMetadata extends js.Object

  object DynatraceMetadata {
    @inline
    def apply(): DynatraceMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DynatraceMetadata]
    }
  }

  /** The properties that are applied when Dynatrace is being used as a source.
    */
  @js.native
  trait DynatraceSourceProperties extends js.Object {
    var `object`: Object
  }

  object DynatraceSourceProperties {
    @inline
    def apply(
        `object`: Object
    ): DynatraceSourceProperties = {
      val __obj = js.Dynamic.literal(
        "object" -> `object`.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DynatraceSourceProperties]
    }
  }

  /** The settings that determine how Amazon AppFlow handles an error when placing data in the destination. For example, this setting would determine if the flow should fail after one insertion error, or continue and attempt to insert every record regardless of the initial failure. <code>ErrorHandlingConfig</code> is a part of the destination connector details.
    */
  @js.native
  trait ErrorHandlingConfig extends js.Object {
    var bucketName: js.UndefOr[BucketName]
    var bucketPrefix: js.UndefOr[BucketPrefix]
    var failOnFirstDestinationError: js.UndefOr[Boolean]
  }

  object ErrorHandlingConfig {
    @inline
    def apply(
        bucketName: js.UndefOr[BucketName] = js.undefined,
        bucketPrefix: js.UndefOr[BucketPrefix] = js.undefined,
        failOnFirstDestinationError: js.UndefOr[Boolean] = js.undefined
    ): ErrorHandlingConfig = {
      val __obj = js.Dynamic.literal()
      bucketName.foreach(__v => __obj.updateDynamic("bucketName")(__v.asInstanceOf[js.Any]))
      bucketPrefix.foreach(__v => __obj.updateDynamic("bucketPrefix")(__v.asInstanceOf[js.Any]))
      failOnFirstDestinationError.foreach(__v => __obj.updateDynamic("failOnFirstDestinationError")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ErrorHandlingConfig]
    }
  }

  /** Provides details in the event of a failed flow, including the failure count and the related error messages.
    */
  @js.native
  trait ErrorInfo extends js.Object {
    var executionMessage: js.UndefOr[ExecutionMessage]
    var putFailuresCount: js.UndefOr[Double]
  }

  object ErrorInfo {
    @inline
    def apply(
        executionMessage: js.UndefOr[ExecutionMessage] = js.undefined,
        putFailuresCount: js.UndefOr[Double] = js.undefined
    ): ErrorInfo = {
      val __obj = js.Dynamic.literal()
      executionMessage.foreach(__v => __obj.updateDynamic("executionMessage")(__v.asInstanceOf[js.Any]))
      putFailuresCount.foreach(__v => __obj.updateDynamic("putFailuresCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ErrorInfo]
    }
  }

  /** The properties that are applied when Amazon EventBridge is being used as a destination.
    */
  @js.native
  trait EventBridgeDestinationProperties extends js.Object {
    var `object`: Object
    var errorHandlingConfig: js.UndefOr[ErrorHandlingConfig]
  }

  object EventBridgeDestinationProperties {
    @inline
    def apply(
        `object`: Object,
        errorHandlingConfig: js.UndefOr[ErrorHandlingConfig] = js.undefined
    ): EventBridgeDestinationProperties = {
      val __obj = js.Dynamic.literal(
        "object" -> `object`.asInstanceOf[js.Any]
      )

      errorHandlingConfig.foreach(__v => __obj.updateDynamic("errorHandlingConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventBridgeDestinationProperties]
    }
  }

  /** The connector metadata specific to Amazon EventBridge.
    */
  @js.native
  trait EventBridgeMetadata extends js.Object

  object EventBridgeMetadata {
    @inline
    def apply(): EventBridgeMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventBridgeMetadata]
    }
  }

  /** Describes the details of the flow run, including the timestamp, status, and message.
    */
  @js.native
  trait ExecutionDetails extends js.Object {
    var mostRecentExecutionMessage: js.UndefOr[MostRecentExecutionMessage]
    var mostRecentExecutionStatus: js.UndefOr[ExecutionStatus]
    var mostRecentExecutionTime: js.UndefOr[Date]
  }

  object ExecutionDetails {
    @inline
    def apply(
        mostRecentExecutionMessage: js.UndefOr[MostRecentExecutionMessage] = js.undefined,
        mostRecentExecutionStatus: js.UndefOr[ExecutionStatus] = js.undefined,
        mostRecentExecutionTime: js.UndefOr[Date] = js.undefined
    ): ExecutionDetails = {
      val __obj = js.Dynamic.literal()
      mostRecentExecutionMessage.foreach(__v => __obj.updateDynamic("mostRecentExecutionMessage")(__v.asInstanceOf[js.Any]))
      mostRecentExecutionStatus.foreach(__v => __obj.updateDynamic("mostRecentExecutionStatus")(__v.asInstanceOf[js.Any]))
      mostRecentExecutionTime.foreach(__v => __obj.updateDynamic("mostRecentExecutionTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExecutionDetails]
    }
  }

  /** Specifies information about the past flow run instances for a given flow.
    */
  @js.native
  trait ExecutionRecord extends js.Object {
    var executionId: js.UndefOr[ExecutionId]
    var executionResult: js.UndefOr[ExecutionResult]
    var executionStatus: js.UndefOr[ExecutionStatus]
    var lastUpdatedAt: js.UndefOr[Date]
    var startedAt: js.UndefOr[Date]
  }

  object ExecutionRecord {
    @inline
    def apply(
        executionId: js.UndefOr[ExecutionId] = js.undefined,
        executionResult: js.UndefOr[ExecutionResult] = js.undefined,
        executionStatus: js.UndefOr[ExecutionStatus] = js.undefined,
        lastUpdatedAt: js.UndefOr[Date] = js.undefined,
        startedAt: js.UndefOr[Date] = js.undefined
    ): ExecutionRecord = {
      val __obj = js.Dynamic.literal()
      executionId.foreach(__v => __obj.updateDynamic("executionId")(__v.asInstanceOf[js.Any]))
      executionResult.foreach(__v => __obj.updateDynamic("executionResult")(__v.asInstanceOf[js.Any]))
      executionStatus.foreach(__v => __obj.updateDynamic("executionStatus")(__v.asInstanceOf[js.Any]))
      lastUpdatedAt.foreach(__v => __obj.updateDynamic("lastUpdatedAt")(__v.asInstanceOf[js.Any]))
      startedAt.foreach(__v => __obj.updateDynamic("startedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExecutionRecord]
    }
  }

  /** Specifies the end result of the flow run.
    */
  @js.native
  trait ExecutionResult extends js.Object {
    var bytesProcessed: js.UndefOr[Double]
    var bytesWritten: js.UndefOr[Double]
    var errorInfo: js.UndefOr[ErrorInfo]
    var recordsProcessed: js.UndefOr[Double]
  }

  object ExecutionResult {
    @inline
    def apply(
        bytesProcessed: js.UndefOr[Double] = js.undefined,
        bytesWritten: js.UndefOr[Double] = js.undefined,
        errorInfo: js.UndefOr[ErrorInfo] = js.undefined,
        recordsProcessed: js.UndefOr[Double] = js.undefined
    ): ExecutionResult = {
      val __obj = js.Dynamic.literal()
      bytesProcessed.foreach(__v => __obj.updateDynamic("bytesProcessed")(__v.asInstanceOf[js.Any]))
      bytesWritten.foreach(__v => __obj.updateDynamic("bytesWritten")(__v.asInstanceOf[js.Any]))
      errorInfo.foreach(__v => __obj.updateDynamic("errorInfo")(__v.asInstanceOf[js.Any]))
      recordsProcessed.foreach(__v => __obj.updateDynamic("recordsProcessed")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExecutionResult]
    }
  }

  @js.native
  sealed trait ExecutionStatus extends js.Any
  object ExecutionStatus {
    val InProgress = "InProgress".asInstanceOf[ExecutionStatus]
    val Successful = "Successful".asInstanceOf[ExecutionStatus]
    val Error = "Error".asInstanceOf[ExecutionStatus]

    @inline def values = js.Array(InProgress, Successful, Error)
  }

  /** Contains details regarding the supported field type and the operators that can be applied for filtering.
    */
  @js.native
  trait FieldTypeDetails extends js.Object {
    var fieldType: FieldType
    var filterOperators: FilterOperatorList
    var supportedValues: js.UndefOr[SupportedValueList]
  }

  object FieldTypeDetails {
    @inline
    def apply(
        fieldType: FieldType,
        filterOperators: FilterOperatorList,
        supportedValues: js.UndefOr[SupportedValueList] = js.undefined
    ): FieldTypeDetails = {
      val __obj = js.Dynamic.literal(
        "fieldType" -> fieldType.asInstanceOf[js.Any],
        "filterOperators" -> filterOperators.asInstanceOf[js.Any]
      )

      supportedValues.foreach(__v => __obj.updateDynamic("supportedValues")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FieldTypeDetails]
    }
  }

  @js.native
  sealed trait FileType extends js.Any
  object FileType {
    val CSV = "CSV".asInstanceOf[FileType]
    val JSON = "JSON".asInstanceOf[FileType]
    val PARQUET = "PARQUET".asInstanceOf[FileType]

    @inline def values = js.Array(CSV, JSON, PARQUET)
  }

  /** The properties of the flow, such as its source, destination, trigger type, and so on.
    */
  @js.native
  trait FlowDefinition extends js.Object {
    var createdAt: js.UndefOr[Date]
    var createdBy: js.UndefOr[CreatedBy]
    var description: js.UndefOr[FlowDescription]
    var destinationConnectorType: js.UndefOr[ConnectorType]
    var flowArn: js.UndefOr[FlowArn]
    var flowName: js.UndefOr[FlowName]
    var flowStatus: js.UndefOr[FlowStatus]
    var lastRunExecutionDetails: js.UndefOr[ExecutionDetails]
    var lastUpdatedAt: js.UndefOr[Date]
    var lastUpdatedBy: js.UndefOr[UpdatedBy]
    var sourceConnectorType: js.UndefOr[ConnectorType]
    var tags: js.UndefOr[TagMap]
    var triggerType: js.UndefOr[TriggerType]
  }

  object FlowDefinition {
    @inline
    def apply(
        createdAt: js.UndefOr[Date] = js.undefined,
        createdBy: js.UndefOr[CreatedBy] = js.undefined,
        description: js.UndefOr[FlowDescription] = js.undefined,
        destinationConnectorType: js.UndefOr[ConnectorType] = js.undefined,
        flowArn: js.UndefOr[FlowArn] = js.undefined,
        flowName: js.UndefOr[FlowName] = js.undefined,
        flowStatus: js.UndefOr[FlowStatus] = js.undefined,
        lastRunExecutionDetails: js.UndefOr[ExecutionDetails] = js.undefined,
        lastUpdatedAt: js.UndefOr[Date] = js.undefined,
        lastUpdatedBy: js.UndefOr[UpdatedBy] = js.undefined,
        sourceConnectorType: js.UndefOr[ConnectorType] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined,
        triggerType: js.UndefOr[TriggerType] = js.undefined
    ): FlowDefinition = {
      val __obj = js.Dynamic.literal()
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      createdBy.foreach(__v => __obj.updateDynamic("createdBy")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      destinationConnectorType.foreach(__v => __obj.updateDynamic("destinationConnectorType")(__v.asInstanceOf[js.Any]))
      flowArn.foreach(__v => __obj.updateDynamic("flowArn")(__v.asInstanceOf[js.Any]))
      flowName.foreach(__v => __obj.updateDynamic("flowName")(__v.asInstanceOf[js.Any]))
      flowStatus.foreach(__v => __obj.updateDynamic("flowStatus")(__v.asInstanceOf[js.Any]))
      lastRunExecutionDetails.foreach(__v => __obj.updateDynamic("lastRunExecutionDetails")(__v.asInstanceOf[js.Any]))
      lastUpdatedAt.foreach(__v => __obj.updateDynamic("lastUpdatedAt")(__v.asInstanceOf[js.Any]))
      lastUpdatedBy.foreach(__v => __obj.updateDynamic("lastUpdatedBy")(__v.asInstanceOf[js.Any]))
      sourceConnectorType.foreach(__v => __obj.updateDynamic("sourceConnectorType")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      triggerType.foreach(__v => __obj.updateDynamic("triggerType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FlowDefinition]
    }
  }

  @js.native
  sealed trait FlowStatus extends js.Any
  object FlowStatus {
    val Active = "Active".asInstanceOf[FlowStatus]
    val Deprecated = "Deprecated".asInstanceOf[FlowStatus]
    val Deleted = "Deleted".asInstanceOf[FlowStatus]
    val Draft = "Draft".asInstanceOf[FlowStatus]
    val Errored = "Errored".asInstanceOf[FlowStatus]
    val Suspended = "Suspended".asInstanceOf[FlowStatus]

    @inline def values = js.Array(Active, Deprecated, Deleted, Draft, Errored, Suspended)
  }

  @js.native
  sealed trait GoogleAnalyticsConnectorOperator extends js.Any
  object GoogleAnalyticsConnectorOperator {
    val PROJECTION = "PROJECTION".asInstanceOf[GoogleAnalyticsConnectorOperator]
    val BETWEEN = "BETWEEN".asInstanceOf[GoogleAnalyticsConnectorOperator]

    @inline def values = js.Array(PROJECTION, BETWEEN)
  }

  /** The connector-specific profile credentials required by Google Analytics.
    */
  @js.native
  trait GoogleAnalyticsConnectorProfileCredentials extends js.Object {
    var clientId: ClientId
    var clientSecret: ClientSecret
    var accessToken: js.UndefOr[AccessToken]
    var oAuthRequest: js.UndefOr[ConnectorOAuthRequest]
    var refreshToken: js.UndefOr[RefreshToken]
  }

  object GoogleAnalyticsConnectorProfileCredentials {
    @inline
    def apply(
        clientId: ClientId,
        clientSecret: ClientSecret,
        accessToken: js.UndefOr[AccessToken] = js.undefined,
        oAuthRequest: js.UndefOr[ConnectorOAuthRequest] = js.undefined,
        refreshToken: js.UndefOr[RefreshToken] = js.undefined
    ): GoogleAnalyticsConnectorProfileCredentials = {
      val __obj = js.Dynamic.literal(
        "clientId" -> clientId.asInstanceOf[js.Any],
        "clientSecret" -> clientSecret.asInstanceOf[js.Any]
      )

      accessToken.foreach(__v => __obj.updateDynamic("accessToken")(__v.asInstanceOf[js.Any]))
      oAuthRequest.foreach(__v => __obj.updateDynamic("oAuthRequest")(__v.asInstanceOf[js.Any]))
      refreshToken.foreach(__v => __obj.updateDynamic("refreshToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GoogleAnalyticsConnectorProfileCredentials]
    }
  }

  /** The connector-specific profile properties required by Google Analytics.
    */
  @js.native
  trait GoogleAnalyticsConnectorProfileProperties extends js.Object

  object GoogleAnalyticsConnectorProfileProperties {
    @inline
    def apply(): GoogleAnalyticsConnectorProfileProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GoogleAnalyticsConnectorProfileProperties]
    }
  }

  /** The connector metadata specific to Google Analytics.
    */
  @js.native
  trait GoogleAnalyticsMetadata extends js.Object {
    var oAuthScopes: js.UndefOr[OAuthScopeList]
  }

  object GoogleAnalyticsMetadata {
    @inline
    def apply(
        oAuthScopes: js.UndefOr[OAuthScopeList] = js.undefined
    ): GoogleAnalyticsMetadata = {
      val __obj = js.Dynamic.literal()
      oAuthScopes.foreach(__v => __obj.updateDynamic("oAuthScopes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GoogleAnalyticsMetadata]
    }
  }

  /** The properties that are applied when Google Analytics is being used as a source.
    */
  @js.native
  trait GoogleAnalyticsSourceProperties extends js.Object {
    var `object`: Object
  }

  object GoogleAnalyticsSourceProperties {
    @inline
    def apply(
        `object`: Object
    ): GoogleAnalyticsSourceProperties = {
      val __obj = js.Dynamic.literal(
        "object" -> `object`.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GoogleAnalyticsSourceProperties]
    }
  }

  /** Specifies the configuration used when importing incremental records from the source.
    */
  @js.native
  trait IncrementalPullConfig extends js.Object {
    var datetimeTypeFieldName: js.UndefOr[DatetimeTypeFieldName]
  }

  object IncrementalPullConfig {
    @inline
    def apply(
        datetimeTypeFieldName: js.UndefOr[DatetimeTypeFieldName] = js.undefined
    ): IncrementalPullConfig = {
      val __obj = js.Dynamic.literal()
      datetimeTypeFieldName.foreach(__v => __obj.updateDynamic("datetimeTypeFieldName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IncrementalPullConfig]
    }
  }

  @js.native
  sealed trait InforNexusConnectorOperator extends js.Any
  object InforNexusConnectorOperator {
    val PROJECTION = "PROJECTION".asInstanceOf[InforNexusConnectorOperator]
    val BETWEEN = "BETWEEN".asInstanceOf[InforNexusConnectorOperator]
    val EQUAL_TO = "EQUAL_TO".asInstanceOf[InforNexusConnectorOperator]
    val ADDITION = "ADDITION".asInstanceOf[InforNexusConnectorOperator]
    val MULTIPLICATION = "MULTIPLICATION".asInstanceOf[InforNexusConnectorOperator]
    val DIVISION = "DIVISION".asInstanceOf[InforNexusConnectorOperator]
    val SUBTRACTION = "SUBTRACTION".asInstanceOf[InforNexusConnectorOperator]
    val MASK_ALL = "MASK_ALL".asInstanceOf[InforNexusConnectorOperator]
    val MASK_FIRST_N = "MASK_FIRST_N".asInstanceOf[InforNexusConnectorOperator]
    val MASK_LAST_N = "MASK_LAST_N".asInstanceOf[InforNexusConnectorOperator]
    val VALIDATE_NON_NULL = "VALIDATE_NON_NULL".asInstanceOf[InforNexusConnectorOperator]
    val VALIDATE_NON_ZERO = "VALIDATE_NON_ZERO".asInstanceOf[InforNexusConnectorOperator]
    val VALIDATE_NON_NEGATIVE = "VALIDATE_NON_NEGATIVE".asInstanceOf[InforNexusConnectorOperator]
    val VALIDATE_NUMERIC = "VALIDATE_NUMERIC".asInstanceOf[InforNexusConnectorOperator]
    val NO_OP = "NO_OP".asInstanceOf[InforNexusConnectorOperator]

    @inline def values = js.Array(
      PROJECTION,
      BETWEEN,
      EQUAL_TO,
      ADDITION,
      MULTIPLICATION,
      DIVISION,
      SUBTRACTION,
      MASK_ALL,
      MASK_FIRST_N,
      MASK_LAST_N,
      VALIDATE_NON_NULL,
      VALIDATE_NON_ZERO,
      VALIDATE_NON_NEGATIVE,
      VALIDATE_NUMERIC,
      NO_OP
    )
  }

  /** The connector-specific profile credentials required by Infor Nexus.
    */
  @js.native
  trait InforNexusConnectorProfileCredentials extends js.Object {
    var accessKeyId: AccessKeyId
    var datakey: Key
    var secretAccessKey: Key
    var userId: Username
  }

  object InforNexusConnectorProfileCredentials {
    @inline
    def apply(
        accessKeyId: AccessKeyId,
        datakey: Key,
        secretAccessKey: Key,
        userId: Username
    ): InforNexusConnectorProfileCredentials = {
      val __obj = js.Dynamic.literal(
        "accessKeyId" -> accessKeyId.asInstanceOf[js.Any],
        "datakey" -> datakey.asInstanceOf[js.Any],
        "secretAccessKey" -> secretAccessKey.asInstanceOf[js.Any],
        "userId" -> userId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[InforNexusConnectorProfileCredentials]
    }
  }

  /** The connector-specific profile properties required by Infor Nexus.
    */
  @js.native
  trait InforNexusConnectorProfileProperties extends js.Object {
    var instanceUrl: InstanceUrl
  }

  object InforNexusConnectorProfileProperties {
    @inline
    def apply(
        instanceUrl: InstanceUrl
    ): InforNexusConnectorProfileProperties = {
      val __obj = js.Dynamic.literal(
        "instanceUrl" -> instanceUrl.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[InforNexusConnectorProfileProperties]
    }
  }

  /** The connector metadata specific to Infor Nexus.
    */
  @js.native
  trait InforNexusMetadata extends js.Object

  object InforNexusMetadata {
    @inline
    def apply(): InforNexusMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InforNexusMetadata]
    }
  }

  /** The properties that are applied when Infor Nexus is being used as a source.
    */
  @js.native
  trait InforNexusSourceProperties extends js.Object {
    var `object`: Object
  }

  object InforNexusSourceProperties {
    @inline
    def apply(
        `object`: Object
    ): InforNexusSourceProperties = {
      val __obj = js.Dynamic.literal(
        "object" -> `object`.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[InforNexusSourceProperties]
    }
  }

  @js.native
  trait ListConnectorEntitiesRequest extends js.Object {
    var connectorProfileName: js.UndefOr[ConnectorProfileName]
    var connectorType: js.UndefOr[ConnectorType]
    var entitiesPath: js.UndefOr[EntitiesPath]
  }

  object ListConnectorEntitiesRequest {
    @inline
    def apply(
        connectorProfileName: js.UndefOr[ConnectorProfileName] = js.undefined,
        connectorType: js.UndefOr[ConnectorType] = js.undefined,
        entitiesPath: js.UndefOr[EntitiesPath] = js.undefined
    ): ListConnectorEntitiesRequest = {
      val __obj = js.Dynamic.literal()
      connectorProfileName.foreach(__v => __obj.updateDynamic("connectorProfileName")(__v.asInstanceOf[js.Any]))
      connectorType.foreach(__v => __obj.updateDynamic("connectorType")(__v.asInstanceOf[js.Any]))
      entitiesPath.foreach(__v => __obj.updateDynamic("entitiesPath")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListConnectorEntitiesRequest]
    }
  }

  @js.native
  trait ListConnectorEntitiesResponse extends js.Object {
    var connectorEntityMap: ConnectorEntityMap
  }

  object ListConnectorEntitiesResponse {
    @inline
    def apply(
        connectorEntityMap: ConnectorEntityMap
    ): ListConnectorEntitiesResponse = {
      val __obj = js.Dynamic.literal(
        "connectorEntityMap" -> connectorEntityMap.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListConnectorEntitiesResponse]
    }
  }

  @js.native
  trait ListFlowsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListFlowsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListFlowsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFlowsRequest]
    }
  }

  @js.native
  trait ListFlowsResponse extends js.Object {
    var flows: js.UndefOr[FlowList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListFlowsResponse {
    @inline
    def apply(
        flows: js.UndefOr[FlowList] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListFlowsResponse = {
      val __obj = js.Dynamic.literal()
      flows.foreach(__v => __obj.updateDynamic("flows")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFlowsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: ARN
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        resourceArn: ARN
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

  @js.native
  sealed trait MarketoConnectorOperator extends js.Any
  object MarketoConnectorOperator {
    val PROJECTION = "PROJECTION".asInstanceOf[MarketoConnectorOperator]
    val LESS_THAN = "LESS_THAN".asInstanceOf[MarketoConnectorOperator]
    val GREATER_THAN = "GREATER_THAN".asInstanceOf[MarketoConnectorOperator]
    val BETWEEN = "BETWEEN".asInstanceOf[MarketoConnectorOperator]
    val ADDITION = "ADDITION".asInstanceOf[MarketoConnectorOperator]
    val MULTIPLICATION = "MULTIPLICATION".asInstanceOf[MarketoConnectorOperator]
    val DIVISION = "DIVISION".asInstanceOf[MarketoConnectorOperator]
    val SUBTRACTION = "SUBTRACTION".asInstanceOf[MarketoConnectorOperator]
    val MASK_ALL = "MASK_ALL".asInstanceOf[MarketoConnectorOperator]
    val MASK_FIRST_N = "MASK_FIRST_N".asInstanceOf[MarketoConnectorOperator]
    val MASK_LAST_N = "MASK_LAST_N".asInstanceOf[MarketoConnectorOperator]
    val VALIDATE_NON_NULL = "VALIDATE_NON_NULL".asInstanceOf[MarketoConnectorOperator]
    val VALIDATE_NON_ZERO = "VALIDATE_NON_ZERO".asInstanceOf[MarketoConnectorOperator]
    val VALIDATE_NON_NEGATIVE = "VALIDATE_NON_NEGATIVE".asInstanceOf[MarketoConnectorOperator]
    val VALIDATE_NUMERIC = "VALIDATE_NUMERIC".asInstanceOf[MarketoConnectorOperator]
    val NO_OP = "NO_OP".asInstanceOf[MarketoConnectorOperator]

    @inline def values = js.Array(
      PROJECTION,
      LESS_THAN,
      GREATER_THAN,
      BETWEEN,
      ADDITION,
      MULTIPLICATION,
      DIVISION,
      SUBTRACTION,
      MASK_ALL,
      MASK_FIRST_N,
      MASK_LAST_N,
      VALIDATE_NON_NULL,
      VALIDATE_NON_ZERO,
      VALIDATE_NON_NEGATIVE,
      VALIDATE_NUMERIC,
      NO_OP
    )
  }

  /** The connector-specific profile credentials required by Marketo.
    */
  @js.native
  trait MarketoConnectorProfileCredentials extends js.Object {
    var clientId: ClientId
    var clientSecret: ClientSecret
    var accessToken: js.UndefOr[AccessToken]
    var oAuthRequest: js.UndefOr[ConnectorOAuthRequest]
  }

  object MarketoConnectorProfileCredentials {
    @inline
    def apply(
        clientId: ClientId,
        clientSecret: ClientSecret,
        accessToken: js.UndefOr[AccessToken] = js.undefined,
        oAuthRequest: js.UndefOr[ConnectorOAuthRequest] = js.undefined
    ): MarketoConnectorProfileCredentials = {
      val __obj = js.Dynamic.literal(
        "clientId" -> clientId.asInstanceOf[js.Any],
        "clientSecret" -> clientSecret.asInstanceOf[js.Any]
      )

      accessToken.foreach(__v => __obj.updateDynamic("accessToken")(__v.asInstanceOf[js.Any]))
      oAuthRequest.foreach(__v => __obj.updateDynamic("oAuthRequest")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MarketoConnectorProfileCredentials]
    }
  }

  /** The connector-specific profile properties required when using Marketo.
    */
  @js.native
  trait MarketoConnectorProfileProperties extends js.Object {
    var instanceUrl: InstanceUrl
  }

  object MarketoConnectorProfileProperties {
    @inline
    def apply(
        instanceUrl: InstanceUrl
    ): MarketoConnectorProfileProperties = {
      val __obj = js.Dynamic.literal(
        "instanceUrl" -> instanceUrl.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[MarketoConnectorProfileProperties]
    }
  }

  /** The connector metadata specific to Marketo.
    */
  @js.native
  trait MarketoMetadata extends js.Object

  object MarketoMetadata {
    @inline
    def apply(): MarketoMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MarketoMetadata]
    }
  }

  /** The properties that are applied when Marketo is being used as a source.
    */
  @js.native
  trait MarketoSourceProperties extends js.Object {
    var `object`: Object
  }

  object MarketoSourceProperties {
    @inline
    def apply(
        `object`: Object
    ): MarketoSourceProperties = {
      val __obj = js.Dynamic.literal(
        "object" -> `object`.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[MarketoSourceProperties]
    }
  }

  @js.native
  sealed trait Operator extends js.Any
  object Operator {
    val PROJECTION = "PROJECTION".asInstanceOf[Operator]
    val LESS_THAN = "LESS_THAN".asInstanceOf[Operator]
    val GREATER_THAN = "GREATER_THAN".asInstanceOf[Operator]
    val CONTAINS = "CONTAINS".asInstanceOf[Operator]
    val BETWEEN = "BETWEEN".asInstanceOf[Operator]
    val LESS_THAN_OR_EQUAL_TO = "LESS_THAN_OR_EQUAL_TO".asInstanceOf[Operator]
    val GREATER_THAN_OR_EQUAL_TO = "GREATER_THAN_OR_EQUAL_TO".asInstanceOf[Operator]
    val EQUAL_TO = "EQUAL_TO".asInstanceOf[Operator]
    val NOT_EQUAL_TO = "NOT_EQUAL_TO".asInstanceOf[Operator]
    val ADDITION = "ADDITION".asInstanceOf[Operator]
    val MULTIPLICATION = "MULTIPLICATION".asInstanceOf[Operator]
    val DIVISION = "DIVISION".asInstanceOf[Operator]
    val SUBTRACTION = "SUBTRACTION".asInstanceOf[Operator]
    val MASK_ALL = "MASK_ALL".asInstanceOf[Operator]
    val MASK_FIRST_N = "MASK_FIRST_N".asInstanceOf[Operator]
    val MASK_LAST_N = "MASK_LAST_N".asInstanceOf[Operator]
    val VALIDATE_NON_NULL = "VALIDATE_NON_NULL".asInstanceOf[Operator]
    val VALIDATE_NON_ZERO = "VALIDATE_NON_ZERO".asInstanceOf[Operator]
    val VALIDATE_NON_NEGATIVE = "VALIDATE_NON_NEGATIVE".asInstanceOf[Operator]
    val VALIDATE_NUMERIC = "VALIDATE_NUMERIC".asInstanceOf[Operator]
    val NO_OP = "NO_OP".asInstanceOf[Operator]

    @inline def values = js.Array(
      PROJECTION,
      LESS_THAN,
      GREATER_THAN,
      CONTAINS,
      BETWEEN,
      LESS_THAN_OR_EQUAL_TO,
      GREATER_THAN_OR_EQUAL_TO,
      EQUAL_TO,
      NOT_EQUAL_TO,
      ADDITION,
      MULTIPLICATION,
      DIVISION,
      SUBTRACTION,
      MASK_ALL,
      MASK_FIRST_N,
      MASK_LAST_N,
      VALIDATE_NON_NULL,
      VALIDATE_NON_ZERO,
      VALIDATE_NON_NEGATIVE,
      VALIDATE_NUMERIC,
      NO_OP
    )
  }

  @js.native
  sealed trait OperatorPropertiesKeys extends js.Any
  object OperatorPropertiesKeys {
    val VALUE = "VALUE".asInstanceOf[OperatorPropertiesKeys]
    val VALUES = "VALUES".asInstanceOf[OperatorPropertiesKeys]
    val DATA_TYPE = "DATA_TYPE".asInstanceOf[OperatorPropertiesKeys]
    val UPPER_BOUND = "UPPER_BOUND".asInstanceOf[OperatorPropertiesKeys]
    val LOWER_BOUND = "LOWER_BOUND".asInstanceOf[OperatorPropertiesKeys]
    val SOURCE_DATA_TYPE = "SOURCE_DATA_TYPE".asInstanceOf[OperatorPropertiesKeys]
    val DESTINATION_DATA_TYPE = "DESTINATION_DATA_TYPE".asInstanceOf[OperatorPropertiesKeys]
    val VALIDATION_ACTION = "VALIDATION_ACTION".asInstanceOf[OperatorPropertiesKeys]
    val MASK_VALUE = "MASK_VALUE".asInstanceOf[OperatorPropertiesKeys]
    val MASK_LENGTH = "MASK_LENGTH".asInstanceOf[OperatorPropertiesKeys]
    val TRUNCATE_LENGTH = "TRUNCATE_LENGTH".asInstanceOf[OperatorPropertiesKeys]
    val MATH_OPERATION_FIELDS_ORDER = "MATH_OPERATION_FIELDS_ORDER".asInstanceOf[OperatorPropertiesKeys]
    val CONCAT_FORMAT = "CONCAT_FORMAT".asInstanceOf[OperatorPropertiesKeys]
    val SUBFIELD_CATEGORY_MAP = "SUBFIELD_CATEGORY_MAP".asInstanceOf[OperatorPropertiesKeys]

    @inline def values = js.Array(
      VALUE,
      VALUES,
      DATA_TYPE,
      UPPER_BOUND,
      LOWER_BOUND,
      SOURCE_DATA_TYPE,
      DESTINATION_DATA_TYPE,
      VALIDATION_ACTION,
      MASK_VALUE,
      MASK_LENGTH,
      TRUNCATE_LENGTH,
      MATH_OPERATION_FIELDS_ORDER,
      CONCAT_FORMAT,
      SUBFIELD_CATEGORY_MAP
    )
  }

  /** Determines the prefix that Amazon AppFlow applies to the destination folder name. You can name your destination folders according to the flow frequency and date.
    */
  @js.native
  trait PrefixConfig extends js.Object {
    var prefixFormat: js.UndefOr[PrefixFormat]
    var prefixType: js.UndefOr[PrefixType]
  }

  object PrefixConfig {
    @inline
    def apply(
        prefixFormat: js.UndefOr[PrefixFormat] = js.undefined,
        prefixType: js.UndefOr[PrefixType] = js.undefined
    ): PrefixConfig = {
      val __obj = js.Dynamic.literal()
      prefixFormat.foreach(__v => __obj.updateDynamic("prefixFormat")(__v.asInstanceOf[js.Any]))
      prefixType.foreach(__v => __obj.updateDynamic("prefixType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PrefixConfig]
    }
  }

  @js.native
  sealed trait PrefixFormat extends js.Any
  object PrefixFormat {
    val YEAR = "YEAR".asInstanceOf[PrefixFormat]
    val MONTH = "MONTH".asInstanceOf[PrefixFormat]
    val DAY = "DAY".asInstanceOf[PrefixFormat]
    val HOUR = "HOUR".asInstanceOf[PrefixFormat]
    val MINUTE = "MINUTE".asInstanceOf[PrefixFormat]

    @inline def values = js.Array(YEAR, MONTH, DAY, HOUR, MINUTE)
  }

  @js.native
  sealed trait PrefixType extends js.Any
  object PrefixType {
    val FILENAME = "FILENAME".asInstanceOf[PrefixType]
    val PATH = "PATH".asInstanceOf[PrefixType]
    val PATH_AND_FILENAME = "PATH_AND_FILENAME".asInstanceOf[PrefixType]

    @inline def values = js.Array(FILENAME, PATH, PATH_AND_FILENAME)
  }

  /** The connector-specific profile credentials required when using Amazon Redshift.
    */
  @js.native
  trait RedshiftConnectorProfileCredentials extends js.Object {
    var password: Password
    var username: Username
  }

  object RedshiftConnectorProfileCredentials {
    @inline
    def apply(
        password: Password,
        username: Username
    ): RedshiftConnectorProfileCredentials = {
      val __obj = js.Dynamic.literal(
        "password" -> password.asInstanceOf[js.Any],
        "username" -> username.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RedshiftConnectorProfileCredentials]
    }
  }

  /** The connector-specific profile properties when using Amazon Redshift.
    */
  @js.native
  trait RedshiftConnectorProfileProperties extends js.Object {
    var bucketName: BucketName
    var databaseUrl: DatabaseUrl
    var roleArn: RoleArn
    var bucketPrefix: js.UndefOr[BucketPrefix]
  }

  object RedshiftConnectorProfileProperties {
    @inline
    def apply(
        bucketName: BucketName,
        databaseUrl: DatabaseUrl,
        roleArn: RoleArn,
        bucketPrefix: js.UndefOr[BucketPrefix] = js.undefined
    ): RedshiftConnectorProfileProperties = {
      val __obj = js.Dynamic.literal(
        "bucketName" -> bucketName.asInstanceOf[js.Any],
        "databaseUrl" -> databaseUrl.asInstanceOf[js.Any],
        "roleArn" -> roleArn.asInstanceOf[js.Any]
      )

      bucketPrefix.foreach(__v => __obj.updateDynamic("bucketPrefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RedshiftConnectorProfileProperties]
    }
  }

  /** The properties that are applied when Amazon Redshift is being used as a destination.
    */
  @js.native
  trait RedshiftDestinationProperties extends js.Object {
    var intermediateBucketName: BucketName
    var `object`: Object
    var bucketPrefix: js.UndefOr[BucketPrefix]
    var errorHandlingConfig: js.UndefOr[ErrorHandlingConfig]
  }

  object RedshiftDestinationProperties {
    @inline
    def apply(
        intermediateBucketName: BucketName,
        `object`: Object,
        bucketPrefix: js.UndefOr[BucketPrefix] = js.undefined,
        errorHandlingConfig: js.UndefOr[ErrorHandlingConfig] = js.undefined
    ): RedshiftDestinationProperties = {
      val __obj = js.Dynamic.literal(
        "intermediateBucketName" -> intermediateBucketName.asInstanceOf[js.Any],
        "object" -> `object`.asInstanceOf[js.Any]
      )

      bucketPrefix.foreach(__v => __obj.updateDynamic("bucketPrefix")(__v.asInstanceOf[js.Any]))
      errorHandlingConfig.foreach(__v => __obj.updateDynamic("errorHandlingConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RedshiftDestinationProperties]
    }
  }

  /** The connector metadata specific to Amazon Redshift.
    */
  @js.native
  trait RedshiftMetadata extends js.Object

  object RedshiftMetadata {
    @inline
    def apply(): RedshiftMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RedshiftMetadata]
    }
  }

  @js.native
  sealed trait S3ConnectorOperator extends js.Any
  object S3ConnectorOperator {
    val PROJECTION = "PROJECTION".asInstanceOf[S3ConnectorOperator]
    val LESS_THAN = "LESS_THAN".asInstanceOf[S3ConnectorOperator]
    val GREATER_THAN = "GREATER_THAN".asInstanceOf[S3ConnectorOperator]
    val BETWEEN = "BETWEEN".asInstanceOf[S3ConnectorOperator]
    val LESS_THAN_OR_EQUAL_TO = "LESS_THAN_OR_EQUAL_TO".asInstanceOf[S3ConnectorOperator]
    val GREATER_THAN_OR_EQUAL_TO = "GREATER_THAN_OR_EQUAL_TO".asInstanceOf[S3ConnectorOperator]
    val EQUAL_TO = "EQUAL_TO".asInstanceOf[S3ConnectorOperator]
    val NOT_EQUAL_TO = "NOT_EQUAL_TO".asInstanceOf[S3ConnectorOperator]
    val ADDITION = "ADDITION".asInstanceOf[S3ConnectorOperator]
    val MULTIPLICATION = "MULTIPLICATION".asInstanceOf[S3ConnectorOperator]
    val DIVISION = "DIVISION".asInstanceOf[S3ConnectorOperator]
    val SUBTRACTION = "SUBTRACTION".asInstanceOf[S3ConnectorOperator]
    val MASK_ALL = "MASK_ALL".asInstanceOf[S3ConnectorOperator]
    val MASK_FIRST_N = "MASK_FIRST_N".asInstanceOf[S3ConnectorOperator]
    val MASK_LAST_N = "MASK_LAST_N".asInstanceOf[S3ConnectorOperator]
    val VALIDATE_NON_NULL = "VALIDATE_NON_NULL".asInstanceOf[S3ConnectorOperator]
    val VALIDATE_NON_ZERO = "VALIDATE_NON_ZERO".asInstanceOf[S3ConnectorOperator]
    val VALIDATE_NON_NEGATIVE = "VALIDATE_NON_NEGATIVE".asInstanceOf[S3ConnectorOperator]
    val VALIDATE_NUMERIC = "VALIDATE_NUMERIC".asInstanceOf[S3ConnectorOperator]
    val NO_OP = "NO_OP".asInstanceOf[S3ConnectorOperator]

    @inline def values = js.Array(
      PROJECTION,
      LESS_THAN,
      GREATER_THAN,
      BETWEEN,
      LESS_THAN_OR_EQUAL_TO,
      GREATER_THAN_OR_EQUAL_TO,
      EQUAL_TO,
      NOT_EQUAL_TO,
      ADDITION,
      MULTIPLICATION,
      DIVISION,
      SUBTRACTION,
      MASK_ALL,
      MASK_FIRST_N,
      MASK_LAST_N,
      VALIDATE_NON_NULL,
      VALIDATE_NON_ZERO,
      VALIDATE_NON_NEGATIVE,
      VALIDATE_NUMERIC,
      NO_OP
    )
  }

  /** The properties that are applied when Amazon S3 is used as a destination.
    */
  @js.native
  trait S3DestinationProperties extends js.Object {
    var bucketName: BucketName
    var bucketPrefix: js.UndefOr[BucketPrefix]
    var s3OutputFormatConfig: js.UndefOr[S3OutputFormatConfig]
  }

  object S3DestinationProperties {
    @inline
    def apply(
        bucketName: BucketName,
        bucketPrefix: js.UndefOr[BucketPrefix] = js.undefined,
        s3OutputFormatConfig: js.UndefOr[S3OutputFormatConfig] = js.undefined
    ): S3DestinationProperties = {
      val __obj = js.Dynamic.literal(
        "bucketName" -> bucketName.asInstanceOf[js.Any]
      )

      bucketPrefix.foreach(__v => __obj.updateDynamic("bucketPrefix")(__v.asInstanceOf[js.Any]))
      s3OutputFormatConfig.foreach(__v => __obj.updateDynamic("s3OutputFormatConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3DestinationProperties]
    }
  }

  /** The connector metadata specific to Amazon S3.
    */
  @js.native
  trait S3Metadata extends js.Object

  object S3Metadata {
    @inline
    def apply(): S3Metadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[S3Metadata]
    }
  }

  /** The configuration that determines how Amazon AppFlow should format the flow output data when Amazon S3 is used as the destination.
    */
  @js.native
  trait S3OutputFormatConfig extends js.Object {
    var aggregationConfig: js.UndefOr[AggregationConfig]
    var fileType: js.UndefOr[FileType]
    var prefixConfig: js.UndefOr[PrefixConfig]
  }

  object S3OutputFormatConfig {
    @inline
    def apply(
        aggregationConfig: js.UndefOr[AggregationConfig] = js.undefined,
        fileType: js.UndefOr[FileType] = js.undefined,
        prefixConfig: js.UndefOr[PrefixConfig] = js.undefined
    ): S3OutputFormatConfig = {
      val __obj = js.Dynamic.literal()
      aggregationConfig.foreach(__v => __obj.updateDynamic("aggregationConfig")(__v.asInstanceOf[js.Any]))
      fileType.foreach(__v => __obj.updateDynamic("fileType")(__v.asInstanceOf[js.Any]))
      prefixConfig.foreach(__v => __obj.updateDynamic("prefixConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3OutputFormatConfig]
    }
  }

  /** The properties that are applied when Amazon S3 is being used as the flow source.
    */
  @js.native
  trait S3SourceProperties extends js.Object {
    var bucketName: BucketName
    var bucketPrefix: js.UndefOr[BucketPrefix]
  }

  object S3SourceProperties {
    @inline
    def apply(
        bucketName: BucketName,
        bucketPrefix: js.UndefOr[BucketPrefix] = js.undefined
    ): S3SourceProperties = {
      val __obj = js.Dynamic.literal(
        "bucketName" -> bucketName.asInstanceOf[js.Any]
      )

      bucketPrefix.foreach(__v => __obj.updateDynamic("bucketPrefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3SourceProperties]
    }
  }

  @js.native
  sealed trait SalesforceConnectorOperator extends js.Any
  object SalesforceConnectorOperator {
    val PROJECTION = "PROJECTION".asInstanceOf[SalesforceConnectorOperator]
    val LESS_THAN = "LESS_THAN".asInstanceOf[SalesforceConnectorOperator]
    val CONTAINS = "CONTAINS".asInstanceOf[SalesforceConnectorOperator]
    val GREATER_THAN = "GREATER_THAN".asInstanceOf[SalesforceConnectorOperator]
    val BETWEEN = "BETWEEN".asInstanceOf[SalesforceConnectorOperator]
    val LESS_THAN_OR_EQUAL_TO = "LESS_THAN_OR_EQUAL_TO".asInstanceOf[SalesforceConnectorOperator]
    val GREATER_THAN_OR_EQUAL_TO = "GREATER_THAN_OR_EQUAL_TO".asInstanceOf[SalesforceConnectorOperator]
    val EQUAL_TO = "EQUAL_TO".asInstanceOf[SalesforceConnectorOperator]
    val NOT_EQUAL_TO = "NOT_EQUAL_TO".asInstanceOf[SalesforceConnectorOperator]
    val ADDITION = "ADDITION".asInstanceOf[SalesforceConnectorOperator]
    val MULTIPLICATION = "MULTIPLICATION".asInstanceOf[SalesforceConnectorOperator]
    val DIVISION = "DIVISION".asInstanceOf[SalesforceConnectorOperator]
    val SUBTRACTION = "SUBTRACTION".asInstanceOf[SalesforceConnectorOperator]
    val MASK_ALL = "MASK_ALL".asInstanceOf[SalesforceConnectorOperator]
    val MASK_FIRST_N = "MASK_FIRST_N".asInstanceOf[SalesforceConnectorOperator]
    val MASK_LAST_N = "MASK_LAST_N".asInstanceOf[SalesforceConnectorOperator]
    val VALIDATE_NON_NULL = "VALIDATE_NON_NULL".asInstanceOf[SalesforceConnectorOperator]
    val VALIDATE_NON_ZERO = "VALIDATE_NON_ZERO".asInstanceOf[SalesforceConnectorOperator]
    val VALIDATE_NON_NEGATIVE = "VALIDATE_NON_NEGATIVE".asInstanceOf[SalesforceConnectorOperator]
    val VALIDATE_NUMERIC = "VALIDATE_NUMERIC".asInstanceOf[SalesforceConnectorOperator]
    val NO_OP = "NO_OP".asInstanceOf[SalesforceConnectorOperator]

    @inline def values = js.Array(
      PROJECTION,
      LESS_THAN,
      CONTAINS,
      GREATER_THAN,
      BETWEEN,
      LESS_THAN_OR_EQUAL_TO,
      GREATER_THAN_OR_EQUAL_TO,
      EQUAL_TO,
      NOT_EQUAL_TO,
      ADDITION,
      MULTIPLICATION,
      DIVISION,
      SUBTRACTION,
      MASK_ALL,
      MASK_FIRST_N,
      MASK_LAST_N,
      VALIDATE_NON_NULL,
      VALIDATE_NON_ZERO,
      VALIDATE_NON_NEGATIVE,
      VALIDATE_NUMERIC,
      NO_OP
    )
  }

  /** The connector-specific profile credentials required when using Salesforce.
    */
  @js.native
  trait SalesforceConnectorProfileCredentials extends js.Object {
    var accessToken: js.UndefOr[AccessToken]
    var clientCredentialsArn: js.UndefOr[ClientCredentialsArn]
    var oAuthRequest: js.UndefOr[ConnectorOAuthRequest]
    var refreshToken: js.UndefOr[RefreshToken]
  }

  object SalesforceConnectorProfileCredentials {
    @inline
    def apply(
        accessToken: js.UndefOr[AccessToken] = js.undefined,
        clientCredentialsArn: js.UndefOr[ClientCredentialsArn] = js.undefined,
        oAuthRequest: js.UndefOr[ConnectorOAuthRequest] = js.undefined,
        refreshToken: js.UndefOr[RefreshToken] = js.undefined
    ): SalesforceConnectorProfileCredentials = {
      val __obj = js.Dynamic.literal()
      accessToken.foreach(__v => __obj.updateDynamic("accessToken")(__v.asInstanceOf[js.Any]))
      clientCredentialsArn.foreach(__v => __obj.updateDynamic("clientCredentialsArn")(__v.asInstanceOf[js.Any]))
      oAuthRequest.foreach(__v => __obj.updateDynamic("oAuthRequest")(__v.asInstanceOf[js.Any]))
      refreshToken.foreach(__v => __obj.updateDynamic("refreshToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SalesforceConnectorProfileCredentials]
    }
  }

  /** The connector-specific profile properties required when using Salesforce.
    */
  @js.native
  trait SalesforceConnectorProfileProperties extends js.Object {
    var instanceUrl: js.UndefOr[InstanceUrl]
    var isSandboxEnvironment: js.UndefOr[Boolean]
  }

  object SalesforceConnectorProfileProperties {
    @inline
    def apply(
        instanceUrl: js.UndefOr[InstanceUrl] = js.undefined,
        isSandboxEnvironment: js.UndefOr[Boolean] = js.undefined
    ): SalesforceConnectorProfileProperties = {
      val __obj = js.Dynamic.literal()
      instanceUrl.foreach(__v => __obj.updateDynamic("instanceUrl")(__v.asInstanceOf[js.Any]))
      isSandboxEnvironment.foreach(__v => __obj.updateDynamic("isSandboxEnvironment")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SalesforceConnectorProfileProperties]
    }
  }

  /** The properties that are applied when Salesforce is being used as a destination.
    */
  @js.native
  trait SalesforceDestinationProperties extends js.Object {
    var `object`: Object
    var errorHandlingConfig: js.UndefOr[ErrorHandlingConfig]
    var idFieldNames: js.UndefOr[IdFieldNameList]
    var writeOperationType: js.UndefOr[WriteOperationType]
  }

  object SalesforceDestinationProperties {
    @inline
    def apply(
        `object`: Object,
        errorHandlingConfig: js.UndefOr[ErrorHandlingConfig] = js.undefined,
        idFieldNames: js.UndefOr[IdFieldNameList] = js.undefined,
        writeOperationType: js.UndefOr[WriteOperationType] = js.undefined
    ): SalesforceDestinationProperties = {
      val __obj = js.Dynamic.literal(
        "object" -> `object`.asInstanceOf[js.Any]
      )

      errorHandlingConfig.foreach(__v => __obj.updateDynamic("errorHandlingConfig")(__v.asInstanceOf[js.Any]))
      idFieldNames.foreach(__v => __obj.updateDynamic("idFieldNames")(__v.asInstanceOf[js.Any]))
      writeOperationType.foreach(__v => __obj.updateDynamic("writeOperationType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SalesforceDestinationProperties]
    }
  }

  /** The connector metadata specific to Salesforce.
    */
  @js.native
  trait SalesforceMetadata extends js.Object {
    var oAuthScopes: js.UndefOr[OAuthScopeList]
  }

  object SalesforceMetadata {
    @inline
    def apply(
        oAuthScopes: js.UndefOr[OAuthScopeList] = js.undefined
    ): SalesforceMetadata = {
      val __obj = js.Dynamic.literal()
      oAuthScopes.foreach(__v => __obj.updateDynamic("oAuthScopes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SalesforceMetadata]
    }
  }

  /** The properties that are applied when Salesforce is being used as a source.
    */
  @js.native
  trait SalesforceSourceProperties extends js.Object {
    var `object`: Object
    var enableDynamicFieldUpdate: js.UndefOr[Boolean]
    var includeDeletedRecords: js.UndefOr[Boolean]
  }

  object SalesforceSourceProperties {
    @inline
    def apply(
        `object`: Object,
        enableDynamicFieldUpdate: js.UndefOr[Boolean] = js.undefined,
        includeDeletedRecords: js.UndefOr[Boolean] = js.undefined
    ): SalesforceSourceProperties = {
      val __obj = js.Dynamic.literal(
        "object" -> `object`.asInstanceOf[js.Any]
      )

      enableDynamicFieldUpdate.foreach(__v => __obj.updateDynamic("enableDynamicFieldUpdate")(__v.asInstanceOf[js.Any]))
      includeDeletedRecords.foreach(__v => __obj.updateDynamic("includeDeletedRecords")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SalesforceSourceProperties]
    }
  }

  @js.native
  sealed trait ScheduleFrequencyType extends js.Any
  object ScheduleFrequencyType {
    val BYMINUTE = "BYMINUTE".asInstanceOf[ScheduleFrequencyType]
    val HOURLY = "HOURLY".asInstanceOf[ScheduleFrequencyType]
    val DAILY = "DAILY".asInstanceOf[ScheduleFrequencyType]
    val WEEKLY = "WEEKLY".asInstanceOf[ScheduleFrequencyType]
    val MONTHLY = "MONTHLY".asInstanceOf[ScheduleFrequencyType]
    val ONCE = "ONCE".asInstanceOf[ScheduleFrequencyType]

    @inline def values = js.Array(BYMINUTE, HOURLY, DAILY, WEEKLY, MONTHLY, ONCE)
  }

  /** Specifies the configuration details of a schedule-triggered flow as defined by the user. Currently, these settings only apply to the <code>Scheduled</code> trigger type.
    */
  @js.native
  trait ScheduledTriggerProperties extends js.Object {
    var scheduleExpression: ScheduleExpression
    var dataPullMode: js.UndefOr[DataPullMode]
    var scheduleEndTime: js.UndefOr[Date]
    var scheduleStartTime: js.UndefOr[Date]
    var timezone: js.UndefOr[Timezone]
  }

  object ScheduledTriggerProperties {
    @inline
    def apply(
        scheduleExpression: ScheduleExpression,
        dataPullMode: js.UndefOr[DataPullMode] = js.undefined,
        scheduleEndTime: js.UndefOr[Date] = js.undefined,
        scheduleStartTime: js.UndefOr[Date] = js.undefined,
        timezone: js.UndefOr[Timezone] = js.undefined
    ): ScheduledTriggerProperties = {
      val __obj = js.Dynamic.literal(
        "scheduleExpression" -> scheduleExpression.asInstanceOf[js.Any]
      )

      dataPullMode.foreach(__v => __obj.updateDynamic("dataPullMode")(__v.asInstanceOf[js.Any]))
      scheduleEndTime.foreach(__v => __obj.updateDynamic("scheduleEndTime")(__v.asInstanceOf[js.Any]))
      scheduleStartTime.foreach(__v => __obj.updateDynamic("scheduleStartTime")(__v.asInstanceOf[js.Any]))
      timezone.foreach(__v => __obj.updateDynamic("timezone")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScheduledTriggerProperties]
    }
  }

  @js.native
  sealed trait ServiceNowConnectorOperator extends js.Any
  object ServiceNowConnectorOperator {
    val PROJECTION = "PROJECTION".asInstanceOf[ServiceNowConnectorOperator]
    val CONTAINS = "CONTAINS".asInstanceOf[ServiceNowConnectorOperator]
    val LESS_THAN = "LESS_THAN".asInstanceOf[ServiceNowConnectorOperator]
    val GREATER_THAN = "GREATER_THAN".asInstanceOf[ServiceNowConnectorOperator]
    val BETWEEN = "BETWEEN".asInstanceOf[ServiceNowConnectorOperator]
    val LESS_THAN_OR_EQUAL_TO = "LESS_THAN_OR_EQUAL_TO".asInstanceOf[ServiceNowConnectorOperator]
    val GREATER_THAN_OR_EQUAL_TO = "GREATER_THAN_OR_EQUAL_TO".asInstanceOf[ServiceNowConnectorOperator]
    val EQUAL_TO = "EQUAL_TO".asInstanceOf[ServiceNowConnectorOperator]
    val NOT_EQUAL_TO = "NOT_EQUAL_TO".asInstanceOf[ServiceNowConnectorOperator]
    val ADDITION = "ADDITION".asInstanceOf[ServiceNowConnectorOperator]
    val MULTIPLICATION = "MULTIPLICATION".asInstanceOf[ServiceNowConnectorOperator]
    val DIVISION = "DIVISION".asInstanceOf[ServiceNowConnectorOperator]
    val SUBTRACTION = "SUBTRACTION".asInstanceOf[ServiceNowConnectorOperator]
    val MASK_ALL = "MASK_ALL".asInstanceOf[ServiceNowConnectorOperator]
    val MASK_FIRST_N = "MASK_FIRST_N".asInstanceOf[ServiceNowConnectorOperator]
    val MASK_LAST_N = "MASK_LAST_N".asInstanceOf[ServiceNowConnectorOperator]
    val VALIDATE_NON_NULL = "VALIDATE_NON_NULL".asInstanceOf[ServiceNowConnectorOperator]
    val VALIDATE_NON_ZERO = "VALIDATE_NON_ZERO".asInstanceOf[ServiceNowConnectorOperator]
    val VALIDATE_NON_NEGATIVE = "VALIDATE_NON_NEGATIVE".asInstanceOf[ServiceNowConnectorOperator]
    val VALIDATE_NUMERIC = "VALIDATE_NUMERIC".asInstanceOf[ServiceNowConnectorOperator]
    val NO_OP = "NO_OP".asInstanceOf[ServiceNowConnectorOperator]

    @inline def values = js.Array(
      PROJECTION,
      CONTAINS,
      LESS_THAN,
      GREATER_THAN,
      BETWEEN,
      LESS_THAN_OR_EQUAL_TO,
      GREATER_THAN_OR_EQUAL_TO,
      EQUAL_TO,
      NOT_EQUAL_TO,
      ADDITION,
      MULTIPLICATION,
      DIVISION,
      SUBTRACTION,
      MASK_ALL,
      MASK_FIRST_N,
      MASK_LAST_N,
      VALIDATE_NON_NULL,
      VALIDATE_NON_ZERO,
      VALIDATE_NON_NEGATIVE,
      VALIDATE_NUMERIC,
      NO_OP
    )
  }

  /** The connector-specific profile credentials required when using ServiceNow.
    */
  @js.native
  trait ServiceNowConnectorProfileCredentials extends js.Object {
    var password: Password
    var username: Username
  }

  object ServiceNowConnectorProfileCredentials {
    @inline
    def apply(
        password: Password,
        username: Username
    ): ServiceNowConnectorProfileCredentials = {
      val __obj = js.Dynamic.literal(
        "password" -> password.asInstanceOf[js.Any],
        "username" -> username.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ServiceNowConnectorProfileCredentials]
    }
  }

  /** The connector-specific profile properties required when using ServiceNow.
    */
  @js.native
  trait ServiceNowConnectorProfileProperties extends js.Object {
    var instanceUrl: InstanceUrl
  }

  object ServiceNowConnectorProfileProperties {
    @inline
    def apply(
        instanceUrl: InstanceUrl
    ): ServiceNowConnectorProfileProperties = {
      val __obj = js.Dynamic.literal(
        "instanceUrl" -> instanceUrl.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ServiceNowConnectorProfileProperties]
    }
  }

  /** The connector metadata specific to ServiceNow.
    */
  @js.native
  trait ServiceNowMetadata extends js.Object

  object ServiceNowMetadata {
    @inline
    def apply(): ServiceNowMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServiceNowMetadata]
    }
  }

  /** The properties that are applied when ServiceNow is being used as a source.
    */
  @js.native
  trait ServiceNowSourceProperties extends js.Object {
    var `object`: Object
  }

  object ServiceNowSourceProperties {
    @inline
    def apply(
        `object`: Object
    ): ServiceNowSourceProperties = {
      val __obj = js.Dynamic.literal(
        "object" -> `object`.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ServiceNowSourceProperties]
    }
  }

  @js.native
  sealed trait SingularConnectorOperator extends js.Any
  object SingularConnectorOperator {
    val PROJECTION = "PROJECTION".asInstanceOf[SingularConnectorOperator]
    val EQUAL_TO = "EQUAL_TO".asInstanceOf[SingularConnectorOperator]
    val ADDITION = "ADDITION".asInstanceOf[SingularConnectorOperator]
    val MULTIPLICATION = "MULTIPLICATION".asInstanceOf[SingularConnectorOperator]
    val DIVISION = "DIVISION".asInstanceOf[SingularConnectorOperator]
    val SUBTRACTION = "SUBTRACTION".asInstanceOf[SingularConnectorOperator]
    val MASK_ALL = "MASK_ALL".asInstanceOf[SingularConnectorOperator]
    val MASK_FIRST_N = "MASK_FIRST_N".asInstanceOf[SingularConnectorOperator]
    val MASK_LAST_N = "MASK_LAST_N".asInstanceOf[SingularConnectorOperator]
    val VALIDATE_NON_NULL = "VALIDATE_NON_NULL".asInstanceOf[SingularConnectorOperator]
    val VALIDATE_NON_ZERO = "VALIDATE_NON_ZERO".asInstanceOf[SingularConnectorOperator]
    val VALIDATE_NON_NEGATIVE = "VALIDATE_NON_NEGATIVE".asInstanceOf[SingularConnectorOperator]
    val VALIDATE_NUMERIC = "VALIDATE_NUMERIC".asInstanceOf[SingularConnectorOperator]
    val NO_OP = "NO_OP".asInstanceOf[SingularConnectorOperator]

    @inline def values = js.Array(
      PROJECTION,
      EQUAL_TO,
      ADDITION,
      MULTIPLICATION,
      DIVISION,
      SUBTRACTION,
      MASK_ALL,
      MASK_FIRST_N,
      MASK_LAST_N,
      VALIDATE_NON_NULL,
      VALIDATE_NON_ZERO,
      VALIDATE_NON_NEGATIVE,
      VALIDATE_NUMERIC,
      NO_OP
    )
  }

  /** The connector-specific profile credentials required when using Singular.
    */
  @js.native
  trait SingularConnectorProfileCredentials extends js.Object {
    var apiKey: ApiKey
  }

  object SingularConnectorProfileCredentials {
    @inline
    def apply(
        apiKey: ApiKey
    ): SingularConnectorProfileCredentials = {
      val __obj = js.Dynamic.literal(
        "apiKey" -> apiKey.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SingularConnectorProfileCredentials]
    }
  }

  /** The connector-specific profile properties required when using Singular.
    */
  @js.native
  trait SingularConnectorProfileProperties extends js.Object

  object SingularConnectorProfileProperties {
    @inline
    def apply(): SingularConnectorProfileProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SingularConnectorProfileProperties]
    }
  }

  /** The connector metadata specific to Singular.
    */
  @js.native
  trait SingularMetadata extends js.Object

  object SingularMetadata {
    @inline
    def apply(): SingularMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SingularMetadata]
    }
  }

  /** The properties that are applied when Singular is being used as a source.
    */
  @js.native
  trait SingularSourceProperties extends js.Object {
    var `object`: Object
  }

  object SingularSourceProperties {
    @inline
    def apply(
        `object`: Object
    ): SingularSourceProperties = {
      val __obj = js.Dynamic.literal(
        "object" -> `object`.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SingularSourceProperties]
    }
  }

  @js.native
  sealed trait SlackConnectorOperator extends js.Any
  object SlackConnectorOperator {
    val PROJECTION = "PROJECTION".asInstanceOf[SlackConnectorOperator]
    val LESS_THAN = "LESS_THAN".asInstanceOf[SlackConnectorOperator]
    val GREATER_THAN = "GREATER_THAN".asInstanceOf[SlackConnectorOperator]
    val BETWEEN = "BETWEEN".asInstanceOf[SlackConnectorOperator]
    val LESS_THAN_OR_EQUAL_TO = "LESS_THAN_OR_EQUAL_TO".asInstanceOf[SlackConnectorOperator]
    val GREATER_THAN_OR_EQUAL_TO = "GREATER_THAN_OR_EQUAL_TO".asInstanceOf[SlackConnectorOperator]
    val EQUAL_TO = "EQUAL_TO".asInstanceOf[SlackConnectorOperator]
    val ADDITION = "ADDITION".asInstanceOf[SlackConnectorOperator]
    val MULTIPLICATION = "MULTIPLICATION".asInstanceOf[SlackConnectorOperator]
    val DIVISION = "DIVISION".asInstanceOf[SlackConnectorOperator]
    val SUBTRACTION = "SUBTRACTION".asInstanceOf[SlackConnectorOperator]
    val MASK_ALL = "MASK_ALL".asInstanceOf[SlackConnectorOperator]
    val MASK_FIRST_N = "MASK_FIRST_N".asInstanceOf[SlackConnectorOperator]
    val MASK_LAST_N = "MASK_LAST_N".asInstanceOf[SlackConnectorOperator]
    val VALIDATE_NON_NULL = "VALIDATE_NON_NULL".asInstanceOf[SlackConnectorOperator]
    val VALIDATE_NON_ZERO = "VALIDATE_NON_ZERO".asInstanceOf[SlackConnectorOperator]
    val VALIDATE_NON_NEGATIVE = "VALIDATE_NON_NEGATIVE".asInstanceOf[SlackConnectorOperator]
    val VALIDATE_NUMERIC = "VALIDATE_NUMERIC".asInstanceOf[SlackConnectorOperator]
    val NO_OP = "NO_OP".asInstanceOf[SlackConnectorOperator]

    @inline def values = js.Array(
      PROJECTION,
      LESS_THAN,
      GREATER_THAN,
      BETWEEN,
      LESS_THAN_OR_EQUAL_TO,
      GREATER_THAN_OR_EQUAL_TO,
      EQUAL_TO,
      ADDITION,
      MULTIPLICATION,
      DIVISION,
      SUBTRACTION,
      MASK_ALL,
      MASK_FIRST_N,
      MASK_LAST_N,
      VALIDATE_NON_NULL,
      VALIDATE_NON_ZERO,
      VALIDATE_NON_NEGATIVE,
      VALIDATE_NUMERIC,
      NO_OP
    )
  }

  /** The connector-specific profile credentials required when using Slack.
    */
  @js.native
  trait SlackConnectorProfileCredentials extends js.Object {
    var clientId: ClientId
    var clientSecret: ClientSecret
    var accessToken: js.UndefOr[AccessToken]
    var oAuthRequest: js.UndefOr[ConnectorOAuthRequest]
  }

  object SlackConnectorProfileCredentials {
    @inline
    def apply(
        clientId: ClientId,
        clientSecret: ClientSecret,
        accessToken: js.UndefOr[AccessToken] = js.undefined,
        oAuthRequest: js.UndefOr[ConnectorOAuthRequest] = js.undefined
    ): SlackConnectorProfileCredentials = {
      val __obj = js.Dynamic.literal(
        "clientId" -> clientId.asInstanceOf[js.Any],
        "clientSecret" -> clientSecret.asInstanceOf[js.Any]
      )

      accessToken.foreach(__v => __obj.updateDynamic("accessToken")(__v.asInstanceOf[js.Any]))
      oAuthRequest.foreach(__v => __obj.updateDynamic("oAuthRequest")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SlackConnectorProfileCredentials]
    }
  }

  /** The connector-specific profile properties required when using Slack.
    */
  @js.native
  trait SlackConnectorProfileProperties extends js.Object {
    var instanceUrl: InstanceUrl
  }

  object SlackConnectorProfileProperties {
    @inline
    def apply(
        instanceUrl: InstanceUrl
    ): SlackConnectorProfileProperties = {
      val __obj = js.Dynamic.literal(
        "instanceUrl" -> instanceUrl.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SlackConnectorProfileProperties]
    }
  }

  /** The connector metadata specific to Slack.
    */
  @js.native
  trait SlackMetadata extends js.Object {
    var oAuthScopes: js.UndefOr[OAuthScopeList]
  }

  object SlackMetadata {
    @inline
    def apply(
        oAuthScopes: js.UndefOr[OAuthScopeList] = js.undefined
    ): SlackMetadata = {
      val __obj = js.Dynamic.literal()
      oAuthScopes.foreach(__v => __obj.updateDynamic("oAuthScopes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SlackMetadata]
    }
  }

  /** The properties that are applied when Slack is being used as a source.
    */
  @js.native
  trait SlackSourceProperties extends js.Object {
    var `object`: Object
  }

  object SlackSourceProperties {
    @inline
    def apply(
        `object`: Object
    ): SlackSourceProperties = {
      val __obj = js.Dynamic.literal(
        "object" -> `object`.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SlackSourceProperties]
    }
  }

  /** The connector-specific profile credentials required when using Snowflake.
    */
  @js.native
  trait SnowflakeConnectorProfileCredentials extends js.Object {
    var password: Password
    var username: Username
  }

  object SnowflakeConnectorProfileCredentials {
    @inline
    def apply(
        password: Password,
        username: Username
    ): SnowflakeConnectorProfileCredentials = {
      val __obj = js.Dynamic.literal(
        "password" -> password.asInstanceOf[js.Any],
        "username" -> username.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SnowflakeConnectorProfileCredentials]
    }
  }

  /** The connector-specific profile properties required when using Snowflake.
    */
  @js.native
  trait SnowflakeConnectorProfileProperties extends js.Object {
    var bucketName: BucketName
    var stage: Stage
    var warehouse: Warehouse
    var accountName: js.UndefOr[AccountName]
    var bucketPrefix: js.UndefOr[BucketPrefix]
    var privateLinkServiceName: js.UndefOr[PrivateLinkServiceName]
    var region: js.UndefOr[Region]
  }

  object SnowflakeConnectorProfileProperties {
    @inline
    def apply(
        bucketName: BucketName,
        stage: Stage,
        warehouse: Warehouse,
        accountName: js.UndefOr[AccountName] = js.undefined,
        bucketPrefix: js.UndefOr[BucketPrefix] = js.undefined,
        privateLinkServiceName: js.UndefOr[PrivateLinkServiceName] = js.undefined,
        region: js.UndefOr[Region] = js.undefined
    ): SnowflakeConnectorProfileProperties = {
      val __obj = js.Dynamic.literal(
        "bucketName" -> bucketName.asInstanceOf[js.Any],
        "stage" -> stage.asInstanceOf[js.Any],
        "warehouse" -> warehouse.asInstanceOf[js.Any]
      )

      accountName.foreach(__v => __obj.updateDynamic("accountName")(__v.asInstanceOf[js.Any]))
      bucketPrefix.foreach(__v => __obj.updateDynamic("bucketPrefix")(__v.asInstanceOf[js.Any]))
      privateLinkServiceName.foreach(__v => __obj.updateDynamic("privateLinkServiceName")(__v.asInstanceOf[js.Any]))
      region.foreach(__v => __obj.updateDynamic("region")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SnowflakeConnectorProfileProperties]
    }
  }

  /** The properties that are applied when Snowflake is being used as a destination.
    */
  @js.native
  trait SnowflakeDestinationProperties extends js.Object {
    var intermediateBucketName: BucketName
    var `object`: Object
    var bucketPrefix: js.UndefOr[BucketPrefix]
    var errorHandlingConfig: js.UndefOr[ErrorHandlingConfig]
  }

  object SnowflakeDestinationProperties {
    @inline
    def apply(
        intermediateBucketName: BucketName,
        `object`: Object,
        bucketPrefix: js.UndefOr[BucketPrefix] = js.undefined,
        errorHandlingConfig: js.UndefOr[ErrorHandlingConfig] = js.undefined
    ): SnowflakeDestinationProperties = {
      val __obj = js.Dynamic.literal(
        "intermediateBucketName" -> intermediateBucketName.asInstanceOf[js.Any],
        "object" -> `object`.asInstanceOf[js.Any]
      )

      bucketPrefix.foreach(__v => __obj.updateDynamic("bucketPrefix")(__v.asInstanceOf[js.Any]))
      errorHandlingConfig.foreach(__v => __obj.updateDynamic("errorHandlingConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SnowflakeDestinationProperties]
    }
  }

  /** The connector metadata specific to Snowflake.
    */
  @js.native
  trait SnowflakeMetadata extends js.Object {
    var supportedRegions: js.UndefOr[RegionList]
  }

  object SnowflakeMetadata {
    @inline
    def apply(
        supportedRegions: js.UndefOr[RegionList] = js.undefined
    ): SnowflakeMetadata = {
      val __obj = js.Dynamic.literal()
      supportedRegions.foreach(__v => __obj.updateDynamic("supportedRegions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SnowflakeMetadata]
    }
  }

  /** Specifies the information that is required to query a particular connector.
    */
  @js.native
  trait SourceConnectorProperties extends js.Object {
    var Amplitude: js.UndefOr[AmplitudeSourceProperties]
    var Datadog: js.UndefOr[DatadogSourceProperties]
    var Dynatrace: js.UndefOr[DynatraceSourceProperties]
    var GoogleAnalytics: js.UndefOr[GoogleAnalyticsSourceProperties]
    var InforNexus: js.UndefOr[InforNexusSourceProperties]
    var Marketo: js.UndefOr[MarketoSourceProperties]
    var S3: js.UndefOr[S3SourceProperties]
    var Salesforce: js.UndefOr[SalesforceSourceProperties]
    var ServiceNow: js.UndefOr[ServiceNowSourceProperties]
    var Singular: js.UndefOr[SingularSourceProperties]
    var Slack: js.UndefOr[SlackSourceProperties]
    var Trendmicro: js.UndefOr[TrendmicroSourceProperties]
    var Veeva: js.UndefOr[VeevaSourceProperties]
    var Zendesk: js.UndefOr[ZendeskSourceProperties]
  }

  object SourceConnectorProperties {
    @inline
    def apply(
        Amplitude: js.UndefOr[AmplitudeSourceProperties] = js.undefined,
        Datadog: js.UndefOr[DatadogSourceProperties] = js.undefined,
        Dynatrace: js.UndefOr[DynatraceSourceProperties] = js.undefined,
        GoogleAnalytics: js.UndefOr[GoogleAnalyticsSourceProperties] = js.undefined,
        InforNexus: js.UndefOr[InforNexusSourceProperties] = js.undefined,
        Marketo: js.UndefOr[MarketoSourceProperties] = js.undefined,
        S3: js.UndefOr[S3SourceProperties] = js.undefined,
        Salesforce: js.UndefOr[SalesforceSourceProperties] = js.undefined,
        ServiceNow: js.UndefOr[ServiceNowSourceProperties] = js.undefined,
        Singular: js.UndefOr[SingularSourceProperties] = js.undefined,
        Slack: js.UndefOr[SlackSourceProperties] = js.undefined,
        Trendmicro: js.UndefOr[TrendmicroSourceProperties] = js.undefined,
        Veeva: js.UndefOr[VeevaSourceProperties] = js.undefined,
        Zendesk: js.UndefOr[ZendeskSourceProperties] = js.undefined
    ): SourceConnectorProperties = {
      val __obj = js.Dynamic.literal()
      Amplitude.foreach(__v => __obj.updateDynamic("Amplitude")(__v.asInstanceOf[js.Any]))
      Datadog.foreach(__v => __obj.updateDynamic("Datadog")(__v.asInstanceOf[js.Any]))
      Dynatrace.foreach(__v => __obj.updateDynamic("Dynatrace")(__v.asInstanceOf[js.Any]))
      GoogleAnalytics.foreach(__v => __obj.updateDynamic("GoogleAnalytics")(__v.asInstanceOf[js.Any]))
      InforNexus.foreach(__v => __obj.updateDynamic("InforNexus")(__v.asInstanceOf[js.Any]))
      Marketo.foreach(__v => __obj.updateDynamic("Marketo")(__v.asInstanceOf[js.Any]))
      S3.foreach(__v => __obj.updateDynamic("S3")(__v.asInstanceOf[js.Any]))
      Salesforce.foreach(__v => __obj.updateDynamic("Salesforce")(__v.asInstanceOf[js.Any]))
      ServiceNow.foreach(__v => __obj.updateDynamic("ServiceNow")(__v.asInstanceOf[js.Any]))
      Singular.foreach(__v => __obj.updateDynamic("Singular")(__v.asInstanceOf[js.Any]))
      Slack.foreach(__v => __obj.updateDynamic("Slack")(__v.asInstanceOf[js.Any]))
      Trendmicro.foreach(__v => __obj.updateDynamic("Trendmicro")(__v.asInstanceOf[js.Any]))
      Veeva.foreach(__v => __obj.updateDynamic("Veeva")(__v.asInstanceOf[js.Any]))
      Zendesk.foreach(__v => __obj.updateDynamic("Zendesk")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SourceConnectorProperties]
    }
  }

  /** The properties that can be applied to a field when the connector is being used as a source.
    */
  @js.native
  trait SourceFieldProperties extends js.Object {
    var isQueryable: js.UndefOr[Boolean]
    var isRetrievable: js.UndefOr[Boolean]
  }

  object SourceFieldProperties {
    @inline
    def apply(
        isQueryable: js.UndefOr[Boolean] = js.undefined,
        isRetrievable: js.UndefOr[Boolean] = js.undefined
    ): SourceFieldProperties = {
      val __obj = js.Dynamic.literal()
      isQueryable.foreach(__v => __obj.updateDynamic("isQueryable")(__v.asInstanceOf[js.Any]))
      isRetrievable.foreach(__v => __obj.updateDynamic("isRetrievable")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SourceFieldProperties]
    }
  }

  /** Contains information about the configuration of the source connector used in the flow.
    */
  @js.native
  trait SourceFlowConfig extends js.Object {
    var connectorType: ConnectorType
    var sourceConnectorProperties: SourceConnectorProperties
    var connectorProfileName: js.UndefOr[ConnectorProfileName]
    var incrementalPullConfig: js.UndefOr[IncrementalPullConfig]
  }

  object SourceFlowConfig {
    @inline
    def apply(
        connectorType: ConnectorType,
        sourceConnectorProperties: SourceConnectorProperties,
        connectorProfileName: js.UndefOr[ConnectorProfileName] = js.undefined,
        incrementalPullConfig: js.UndefOr[IncrementalPullConfig] = js.undefined
    ): SourceFlowConfig = {
      val __obj = js.Dynamic.literal(
        "connectorType" -> connectorType.asInstanceOf[js.Any],
        "sourceConnectorProperties" -> sourceConnectorProperties.asInstanceOf[js.Any]
      )

      connectorProfileName.foreach(__v => __obj.updateDynamic("connectorProfileName")(__v.asInstanceOf[js.Any]))
      incrementalPullConfig.foreach(__v => __obj.updateDynamic("incrementalPullConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SourceFlowConfig]
    }
  }

  @js.native
  trait StartFlowRequest extends js.Object {
    var flowName: FlowName
  }

  object StartFlowRequest {
    @inline
    def apply(
        flowName: FlowName
    ): StartFlowRequest = {
      val __obj = js.Dynamic.literal(
        "flowName" -> flowName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartFlowRequest]
    }
  }

  @js.native
  trait StartFlowResponse extends js.Object {
    var executionId: js.UndefOr[ExecutionId]
    var flowArn: js.UndefOr[FlowArn]
    var flowStatus: js.UndefOr[FlowStatus]
  }

  object StartFlowResponse {
    @inline
    def apply(
        executionId: js.UndefOr[ExecutionId] = js.undefined,
        flowArn: js.UndefOr[FlowArn] = js.undefined,
        flowStatus: js.UndefOr[FlowStatus] = js.undefined
    ): StartFlowResponse = {
      val __obj = js.Dynamic.literal()
      executionId.foreach(__v => __obj.updateDynamic("executionId")(__v.asInstanceOf[js.Any]))
      flowArn.foreach(__v => __obj.updateDynamic("flowArn")(__v.asInstanceOf[js.Any]))
      flowStatus.foreach(__v => __obj.updateDynamic("flowStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartFlowResponse]
    }
  }

  @js.native
  trait StopFlowRequest extends js.Object {
    var flowName: FlowName
  }

  object StopFlowRequest {
    @inline
    def apply(
        flowName: FlowName
    ): StopFlowRequest = {
      val __obj = js.Dynamic.literal(
        "flowName" -> flowName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StopFlowRequest]
    }
  }

  @js.native
  trait StopFlowResponse extends js.Object {
    var flowArn: js.UndefOr[FlowArn]
    var flowStatus: js.UndefOr[FlowStatus]
  }

  object StopFlowResponse {
    @inline
    def apply(
        flowArn: js.UndefOr[FlowArn] = js.undefined,
        flowStatus: js.UndefOr[FlowStatus] = js.undefined
    ): StopFlowResponse = {
      val __obj = js.Dynamic.literal()
      flowArn.foreach(__v => __obj.updateDynamic("flowArn")(__v.asInstanceOf[js.Any]))
      flowStatus.foreach(__v => __obj.updateDynamic("flowStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopFlowResponse]
    }
  }

  /** Contains details regarding all the supported <code>FieldTypes</code> and their corresponding <code>filterOperators</code> and <code>supportedValues</code>.
    */
  @js.native
  trait SupportedFieldTypeDetails extends js.Object {
    var v1: FieldTypeDetails
  }

  object SupportedFieldTypeDetails {
    @inline
    def apply(
        v1: FieldTypeDetails
    ): SupportedFieldTypeDetails = {
      val __obj = js.Dynamic.literal(
        "v1" -> v1.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SupportedFieldTypeDetails]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: ARN
    var tags: TagMap
  }

  object TagResourceRequest {
    @inline
    def apply(
        resourceArn: ARN,
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

  /** A class for modeling different type of tasks. Task implementation varies based on the <code>TaskType</code>.
    */
  @js.native
  trait Task extends js.Object {
    var sourceFields: SourceFields
    var taskType: TaskType
    var connectorOperator: js.UndefOr[ConnectorOperator]
    var destinationField: js.UndefOr[DestinationField]
    var taskProperties: js.UndefOr[TaskPropertiesMap]
  }

  object Task {
    @inline
    def apply(
        sourceFields: SourceFields,
        taskType: TaskType,
        connectorOperator: js.UndefOr[ConnectorOperator] = js.undefined,
        destinationField: js.UndefOr[DestinationField] = js.undefined,
        taskProperties: js.UndefOr[TaskPropertiesMap] = js.undefined
    ): Task = {
      val __obj = js.Dynamic.literal(
        "sourceFields" -> sourceFields.asInstanceOf[js.Any],
        "taskType" -> taskType.asInstanceOf[js.Any]
      )

      connectorOperator.foreach(__v => __obj.updateDynamic("connectorOperator")(__v.asInstanceOf[js.Any]))
      destinationField.foreach(__v => __obj.updateDynamic("destinationField")(__v.asInstanceOf[js.Any]))
      taskProperties.foreach(__v => __obj.updateDynamic("taskProperties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Task]
    }
  }

  @js.native
  sealed trait TaskType extends js.Any
  object TaskType {
    val Arithmetic = "Arithmetic".asInstanceOf[TaskType]
    val Filter = "Filter".asInstanceOf[TaskType]
    val Map = "Map".asInstanceOf[TaskType]
    val Mask = "Mask".asInstanceOf[TaskType]
    val Merge = "Merge".asInstanceOf[TaskType]
    val Truncate = "Truncate".asInstanceOf[TaskType]
    val Validate = "Validate".asInstanceOf[TaskType]

    @inline def values = js.Array(Arithmetic, Filter, Map, Mask, Merge, Truncate, Validate)
  }

  @js.native
  sealed trait TrendmicroConnectorOperator extends js.Any
  object TrendmicroConnectorOperator {
    val PROJECTION = "PROJECTION".asInstanceOf[TrendmicroConnectorOperator]
    val EQUAL_TO = "EQUAL_TO".asInstanceOf[TrendmicroConnectorOperator]
    val ADDITION = "ADDITION".asInstanceOf[TrendmicroConnectorOperator]
    val MULTIPLICATION = "MULTIPLICATION".asInstanceOf[TrendmicroConnectorOperator]
    val DIVISION = "DIVISION".asInstanceOf[TrendmicroConnectorOperator]
    val SUBTRACTION = "SUBTRACTION".asInstanceOf[TrendmicroConnectorOperator]
    val MASK_ALL = "MASK_ALL".asInstanceOf[TrendmicroConnectorOperator]
    val MASK_FIRST_N = "MASK_FIRST_N".asInstanceOf[TrendmicroConnectorOperator]
    val MASK_LAST_N = "MASK_LAST_N".asInstanceOf[TrendmicroConnectorOperator]
    val VALIDATE_NON_NULL = "VALIDATE_NON_NULL".asInstanceOf[TrendmicroConnectorOperator]
    val VALIDATE_NON_ZERO = "VALIDATE_NON_ZERO".asInstanceOf[TrendmicroConnectorOperator]
    val VALIDATE_NON_NEGATIVE = "VALIDATE_NON_NEGATIVE".asInstanceOf[TrendmicroConnectorOperator]
    val VALIDATE_NUMERIC = "VALIDATE_NUMERIC".asInstanceOf[TrendmicroConnectorOperator]
    val NO_OP = "NO_OP".asInstanceOf[TrendmicroConnectorOperator]

    @inline def values = js.Array(
      PROJECTION,
      EQUAL_TO,
      ADDITION,
      MULTIPLICATION,
      DIVISION,
      SUBTRACTION,
      MASK_ALL,
      MASK_FIRST_N,
      MASK_LAST_N,
      VALIDATE_NON_NULL,
      VALIDATE_NON_ZERO,
      VALIDATE_NON_NEGATIVE,
      VALIDATE_NUMERIC,
      NO_OP
    )
  }

  /** The connector-specific profile credentials required when using Trend Micro.
    */
  @js.native
  trait TrendmicroConnectorProfileCredentials extends js.Object {
    var apiSecretKey: ApiSecretKey
  }

  object TrendmicroConnectorProfileCredentials {
    @inline
    def apply(
        apiSecretKey: ApiSecretKey
    ): TrendmicroConnectorProfileCredentials = {
      val __obj = js.Dynamic.literal(
        "apiSecretKey" -> apiSecretKey.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TrendmicroConnectorProfileCredentials]
    }
  }

  /** The connector-specific profile properties required when using Trend Micro.
    */
  @js.native
  trait TrendmicroConnectorProfileProperties extends js.Object

  object TrendmicroConnectorProfileProperties {
    @inline
    def apply(): TrendmicroConnectorProfileProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TrendmicroConnectorProfileProperties]
    }
  }

  /** The connector metadata specific to Trend Micro.
    */
  @js.native
  trait TrendmicroMetadata extends js.Object

  object TrendmicroMetadata {
    @inline
    def apply(): TrendmicroMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TrendmicroMetadata]
    }
  }

  /** The properties that are applied when using Trend Micro as a flow source.
    */
  @js.native
  trait TrendmicroSourceProperties extends js.Object {
    var `object`: Object
  }

  object TrendmicroSourceProperties {
    @inline
    def apply(
        `object`: Object
    ): TrendmicroSourceProperties = {
      val __obj = js.Dynamic.literal(
        "object" -> `object`.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TrendmicroSourceProperties]
    }
  }

  /** The trigger settings that determine how and when Amazon AppFlow runs the specified flow.
    */
  @js.native
  trait TriggerConfig extends js.Object {
    var triggerType: TriggerType
    var triggerProperties: js.UndefOr[TriggerProperties]
  }

  object TriggerConfig {
    @inline
    def apply(
        triggerType: TriggerType,
        triggerProperties: js.UndefOr[TriggerProperties] = js.undefined
    ): TriggerConfig = {
      val __obj = js.Dynamic.literal(
        "triggerType" -> triggerType.asInstanceOf[js.Any]
      )

      triggerProperties.foreach(__v => __obj.updateDynamic("triggerProperties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TriggerConfig]
    }
  }

  /** Specifies the configuration details that control the trigger for a flow. Currently, these settings only apply to the <code>Scheduled</code> trigger type.
    */
  @js.native
  trait TriggerProperties extends js.Object {
    var Scheduled: js.UndefOr[ScheduledTriggerProperties]
  }

  object TriggerProperties {
    @inline
    def apply(
        Scheduled: js.UndefOr[ScheduledTriggerProperties] = js.undefined
    ): TriggerProperties = {
      val __obj = js.Dynamic.literal()
      Scheduled.foreach(__v => __obj.updateDynamic("Scheduled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TriggerProperties]
    }
  }

  @js.native
  sealed trait TriggerType extends js.Any
  object TriggerType {
    val Scheduled = "Scheduled".asInstanceOf[TriggerType]
    val Event = "Event".asInstanceOf[TriggerType]
    val OnDemand = "OnDemand".asInstanceOf[TriggerType]

    @inline def values = js.Array(Scheduled, Event, OnDemand)
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var resourceArn: ARN
    var tagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        resourceArn: ARN,
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
  trait UpdateConnectorProfileRequest extends js.Object {
    var connectionMode: ConnectionMode
    var connectorProfileConfig: ConnectorProfileConfig
    var connectorProfileName: ConnectorProfileName
  }

  object UpdateConnectorProfileRequest {
    @inline
    def apply(
        connectionMode: ConnectionMode,
        connectorProfileConfig: ConnectorProfileConfig,
        connectorProfileName: ConnectorProfileName
    ): UpdateConnectorProfileRequest = {
      val __obj = js.Dynamic.literal(
        "connectionMode" -> connectionMode.asInstanceOf[js.Any],
        "connectorProfileConfig" -> connectorProfileConfig.asInstanceOf[js.Any],
        "connectorProfileName" -> connectorProfileName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateConnectorProfileRequest]
    }
  }

  @js.native
  trait UpdateConnectorProfileResponse extends js.Object {
    var connectorProfileArn: js.UndefOr[ConnectorProfileArn]
  }

  object UpdateConnectorProfileResponse {
    @inline
    def apply(
        connectorProfileArn: js.UndefOr[ConnectorProfileArn] = js.undefined
    ): UpdateConnectorProfileResponse = {
      val __obj = js.Dynamic.literal()
      connectorProfileArn.foreach(__v => __obj.updateDynamic("connectorProfileArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateConnectorProfileResponse]
    }
  }

  @js.native
  trait UpdateFlowRequest extends js.Object {
    var destinationFlowConfigList: DestinationFlowConfigList
    var flowName: FlowName
    var tasks: Tasks
    var triggerConfig: TriggerConfig
    var description: js.UndefOr[FlowDescription]
    var sourceFlowConfig: js.UndefOr[SourceFlowConfig]
  }

  object UpdateFlowRequest {
    @inline
    def apply(
        destinationFlowConfigList: DestinationFlowConfigList,
        flowName: FlowName,
        tasks: Tasks,
        triggerConfig: TriggerConfig,
        description: js.UndefOr[FlowDescription] = js.undefined,
        sourceFlowConfig: js.UndefOr[SourceFlowConfig] = js.undefined
    ): UpdateFlowRequest = {
      val __obj = js.Dynamic.literal(
        "destinationFlowConfigList" -> destinationFlowConfigList.asInstanceOf[js.Any],
        "flowName" -> flowName.asInstanceOf[js.Any],
        "tasks" -> tasks.asInstanceOf[js.Any],
        "triggerConfig" -> triggerConfig.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      sourceFlowConfig.foreach(__v => __obj.updateDynamic("sourceFlowConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFlowRequest]
    }
  }

  @js.native
  trait UpdateFlowResponse extends js.Object {
    var flowStatus: js.UndefOr[FlowStatus]
  }

  object UpdateFlowResponse {
    @inline
    def apply(
        flowStatus: js.UndefOr[FlowStatus] = js.undefined
    ): UpdateFlowResponse = {
      val __obj = js.Dynamic.literal()
      flowStatus.foreach(__v => __obj.updateDynamic("flowStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFlowResponse]
    }
  }

  /** The properties that are applied when Upsolver is used as a destination.
    */
  @js.native
  trait UpsolverDestinationProperties extends js.Object {
    var bucketName: UpsolverBucketName
    var s3OutputFormatConfig: UpsolverS3OutputFormatConfig
    var bucketPrefix: js.UndefOr[BucketPrefix]
  }

  object UpsolverDestinationProperties {
    @inline
    def apply(
        bucketName: UpsolverBucketName,
        s3OutputFormatConfig: UpsolverS3OutputFormatConfig,
        bucketPrefix: js.UndefOr[BucketPrefix] = js.undefined
    ): UpsolverDestinationProperties = {
      val __obj = js.Dynamic.literal(
        "bucketName" -> bucketName.asInstanceOf[js.Any],
        "s3OutputFormatConfig" -> s3OutputFormatConfig.asInstanceOf[js.Any]
      )

      bucketPrefix.foreach(__v => __obj.updateDynamic("bucketPrefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpsolverDestinationProperties]
    }
  }

  /** The connector metadata specific to Upsolver.
    */
  @js.native
  trait UpsolverMetadata extends js.Object

  object UpsolverMetadata {
    @inline
    def apply(): UpsolverMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpsolverMetadata]
    }
  }

  /** The configuration that determines how Amazon AppFlow formats the flow output data when Upsolver is used as the destination.
    */
  @js.native
  trait UpsolverS3OutputFormatConfig extends js.Object {
    var prefixConfig: PrefixConfig
    var aggregationConfig: js.UndefOr[AggregationConfig]
    var fileType: js.UndefOr[FileType]
  }

  object UpsolverS3OutputFormatConfig {
    @inline
    def apply(
        prefixConfig: PrefixConfig,
        aggregationConfig: js.UndefOr[AggregationConfig] = js.undefined,
        fileType: js.UndefOr[FileType] = js.undefined
    ): UpsolverS3OutputFormatConfig = {
      val __obj = js.Dynamic.literal(
        "prefixConfig" -> prefixConfig.asInstanceOf[js.Any]
      )

      aggregationConfig.foreach(__v => __obj.updateDynamic("aggregationConfig")(__v.asInstanceOf[js.Any]))
      fileType.foreach(__v => __obj.updateDynamic("fileType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpsolverS3OutputFormatConfig]
    }
  }

  @js.native
  sealed trait VeevaConnectorOperator extends js.Any
  object VeevaConnectorOperator {
    val PROJECTION = "PROJECTION".asInstanceOf[VeevaConnectorOperator]
    val LESS_THAN = "LESS_THAN".asInstanceOf[VeevaConnectorOperator]
    val GREATER_THAN = "GREATER_THAN".asInstanceOf[VeevaConnectorOperator]
    val CONTAINS = "CONTAINS".asInstanceOf[VeevaConnectorOperator]
    val BETWEEN = "BETWEEN".asInstanceOf[VeevaConnectorOperator]
    val LESS_THAN_OR_EQUAL_TO = "LESS_THAN_OR_EQUAL_TO".asInstanceOf[VeevaConnectorOperator]
    val GREATER_THAN_OR_EQUAL_TO = "GREATER_THAN_OR_EQUAL_TO".asInstanceOf[VeevaConnectorOperator]
    val EQUAL_TO = "EQUAL_TO".asInstanceOf[VeevaConnectorOperator]
    val NOT_EQUAL_TO = "NOT_EQUAL_TO".asInstanceOf[VeevaConnectorOperator]
    val ADDITION = "ADDITION".asInstanceOf[VeevaConnectorOperator]
    val MULTIPLICATION = "MULTIPLICATION".asInstanceOf[VeevaConnectorOperator]
    val DIVISION = "DIVISION".asInstanceOf[VeevaConnectorOperator]
    val SUBTRACTION = "SUBTRACTION".asInstanceOf[VeevaConnectorOperator]
    val MASK_ALL = "MASK_ALL".asInstanceOf[VeevaConnectorOperator]
    val MASK_FIRST_N = "MASK_FIRST_N".asInstanceOf[VeevaConnectorOperator]
    val MASK_LAST_N = "MASK_LAST_N".asInstanceOf[VeevaConnectorOperator]
    val VALIDATE_NON_NULL = "VALIDATE_NON_NULL".asInstanceOf[VeevaConnectorOperator]
    val VALIDATE_NON_ZERO = "VALIDATE_NON_ZERO".asInstanceOf[VeevaConnectorOperator]
    val VALIDATE_NON_NEGATIVE = "VALIDATE_NON_NEGATIVE".asInstanceOf[VeevaConnectorOperator]
    val VALIDATE_NUMERIC = "VALIDATE_NUMERIC".asInstanceOf[VeevaConnectorOperator]
    val NO_OP = "NO_OP".asInstanceOf[VeevaConnectorOperator]

    @inline def values = js.Array(
      PROJECTION,
      LESS_THAN,
      GREATER_THAN,
      CONTAINS,
      BETWEEN,
      LESS_THAN_OR_EQUAL_TO,
      GREATER_THAN_OR_EQUAL_TO,
      EQUAL_TO,
      NOT_EQUAL_TO,
      ADDITION,
      MULTIPLICATION,
      DIVISION,
      SUBTRACTION,
      MASK_ALL,
      MASK_FIRST_N,
      MASK_LAST_N,
      VALIDATE_NON_NULL,
      VALIDATE_NON_ZERO,
      VALIDATE_NON_NEGATIVE,
      VALIDATE_NUMERIC,
      NO_OP
    )
  }

  /** The connector-specific profile credentials required when using Veeva.
    */
  @js.native
  trait VeevaConnectorProfileCredentials extends js.Object {
    var password: Password
    var username: Username
  }

  object VeevaConnectorProfileCredentials {
    @inline
    def apply(
        password: Password,
        username: Username
    ): VeevaConnectorProfileCredentials = {
      val __obj = js.Dynamic.literal(
        "password" -> password.asInstanceOf[js.Any],
        "username" -> username.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[VeevaConnectorProfileCredentials]
    }
  }

  /** The connector-specific profile properties required when using Veeva.
    */
  @js.native
  trait VeevaConnectorProfileProperties extends js.Object {
    var instanceUrl: InstanceUrl
  }

  object VeevaConnectorProfileProperties {
    @inline
    def apply(
        instanceUrl: InstanceUrl
    ): VeevaConnectorProfileProperties = {
      val __obj = js.Dynamic.literal(
        "instanceUrl" -> instanceUrl.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[VeevaConnectorProfileProperties]
    }
  }

  /** The connector metadata specific to Veeva.
    */
  @js.native
  trait VeevaMetadata extends js.Object

  object VeevaMetadata {
    @inline
    def apply(): VeevaMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VeevaMetadata]
    }
  }

  /** The properties that are applied when using Veeva as a flow source.
    */
  @js.native
  trait VeevaSourceProperties extends js.Object {
    var `object`: Object
  }

  object VeevaSourceProperties {
    @inline
    def apply(
        `object`: Object
    ): VeevaSourceProperties = {
      val __obj = js.Dynamic.literal(
        "object" -> `object`.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[VeevaSourceProperties]
    }
  }

  /** The possible write operations in the destination connector. When this value is not provided, this defaults to the <code>INSERT</code> operation.
    */
  @js.native
  sealed trait WriteOperationType extends js.Any
  object WriteOperationType {
    val INSERT = "INSERT".asInstanceOf[WriteOperationType]
    val UPSERT = "UPSERT".asInstanceOf[WriteOperationType]
    val UPDATE = "UPDATE".asInstanceOf[WriteOperationType]

    @inline def values = js.Array(INSERT, UPSERT, UPDATE)
  }

  @js.native
  sealed trait ZendeskConnectorOperator extends js.Any
  object ZendeskConnectorOperator {
    val PROJECTION = "PROJECTION".asInstanceOf[ZendeskConnectorOperator]
    val GREATER_THAN = "GREATER_THAN".asInstanceOf[ZendeskConnectorOperator]
    val ADDITION = "ADDITION".asInstanceOf[ZendeskConnectorOperator]
    val MULTIPLICATION = "MULTIPLICATION".asInstanceOf[ZendeskConnectorOperator]
    val DIVISION = "DIVISION".asInstanceOf[ZendeskConnectorOperator]
    val SUBTRACTION = "SUBTRACTION".asInstanceOf[ZendeskConnectorOperator]
    val MASK_ALL = "MASK_ALL".asInstanceOf[ZendeskConnectorOperator]
    val MASK_FIRST_N = "MASK_FIRST_N".asInstanceOf[ZendeskConnectorOperator]
    val MASK_LAST_N = "MASK_LAST_N".asInstanceOf[ZendeskConnectorOperator]
    val VALIDATE_NON_NULL = "VALIDATE_NON_NULL".asInstanceOf[ZendeskConnectorOperator]
    val VALIDATE_NON_ZERO = "VALIDATE_NON_ZERO".asInstanceOf[ZendeskConnectorOperator]
    val VALIDATE_NON_NEGATIVE = "VALIDATE_NON_NEGATIVE".asInstanceOf[ZendeskConnectorOperator]
    val VALIDATE_NUMERIC = "VALIDATE_NUMERIC".asInstanceOf[ZendeskConnectorOperator]
    val NO_OP = "NO_OP".asInstanceOf[ZendeskConnectorOperator]

    @inline def values = js.Array(
      PROJECTION,
      GREATER_THAN,
      ADDITION,
      MULTIPLICATION,
      DIVISION,
      SUBTRACTION,
      MASK_ALL,
      MASK_FIRST_N,
      MASK_LAST_N,
      VALIDATE_NON_NULL,
      VALIDATE_NON_ZERO,
      VALIDATE_NON_NEGATIVE,
      VALIDATE_NUMERIC,
      NO_OP
    )
  }

  /** The connector-specific profile credentials required when using Zendesk.
    */
  @js.native
  trait ZendeskConnectorProfileCredentials extends js.Object {
    var clientId: ClientId
    var clientSecret: ClientSecret
    var accessToken: js.UndefOr[AccessToken]
    var oAuthRequest: js.UndefOr[ConnectorOAuthRequest]
  }

  object ZendeskConnectorProfileCredentials {
    @inline
    def apply(
        clientId: ClientId,
        clientSecret: ClientSecret,
        accessToken: js.UndefOr[AccessToken] = js.undefined,
        oAuthRequest: js.UndefOr[ConnectorOAuthRequest] = js.undefined
    ): ZendeskConnectorProfileCredentials = {
      val __obj = js.Dynamic.literal(
        "clientId" -> clientId.asInstanceOf[js.Any],
        "clientSecret" -> clientSecret.asInstanceOf[js.Any]
      )

      accessToken.foreach(__v => __obj.updateDynamic("accessToken")(__v.asInstanceOf[js.Any]))
      oAuthRequest.foreach(__v => __obj.updateDynamic("oAuthRequest")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ZendeskConnectorProfileCredentials]
    }
  }

  /** The connector-specific profile properties required when using Zendesk.
    */
  @js.native
  trait ZendeskConnectorProfileProperties extends js.Object {
    var instanceUrl: InstanceUrl
  }

  object ZendeskConnectorProfileProperties {
    @inline
    def apply(
        instanceUrl: InstanceUrl
    ): ZendeskConnectorProfileProperties = {
      val __obj = js.Dynamic.literal(
        "instanceUrl" -> instanceUrl.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ZendeskConnectorProfileProperties]
    }
  }

  /** The connector metadata specific to Zendesk.
    */
  @js.native
  trait ZendeskMetadata extends js.Object {
    var oAuthScopes: js.UndefOr[OAuthScopeList]
  }

  object ZendeskMetadata {
    @inline
    def apply(
        oAuthScopes: js.UndefOr[OAuthScopeList] = js.undefined
    ): ZendeskMetadata = {
      val __obj = js.Dynamic.literal()
      oAuthScopes.foreach(__v => __obj.updateDynamic("oAuthScopes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ZendeskMetadata]
    }
  }

  /** The properties that are applied when using Zendesk as a flow source.
    */
  @js.native
  trait ZendeskSourceProperties extends js.Object {
    var `object`: Object
  }

  object ZendeskSourceProperties {
    @inline
    def apply(
        `object`: Object
    ): ZendeskSourceProperties = {
      val __obj = js.Dynamic.literal(
        "object" -> `object`.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ZendeskSourceProperties]
    }
  }
}
