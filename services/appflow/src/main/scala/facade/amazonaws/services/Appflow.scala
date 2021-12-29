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
  type DomainName = String
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
  type ObjectTypeName = String
  type Password = String
  type PrivateLinkServiceName = String
  type Property = String
  type RedirectUri = String
  type RefreshToken = String
  type Region = String
  type RegionList = js.Array[Region]
  type RoleArn = String
  type ScheduleExpression = String
  type ScheduleOffset = Double
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

  final class AppflowOps(private val service: Appflow) extends AnyVal {

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
  object Appflow {
    @inline implicit def toOps(service: Appflow): AppflowOps = {
      new AppflowOps(service)
    }
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
    var CustomerProfiles: js.UndefOr[CustomerProfilesMetadata]
    var Datadog: js.UndefOr[DatadogMetadata]
    var Dynatrace: js.UndefOr[DynatraceMetadata]
    var EventBridge: js.UndefOr[EventBridgeMetadata]
    var GoogleAnalytics: js.UndefOr[GoogleAnalyticsMetadata]
    var Honeycode: js.UndefOr[HoneycodeMetadata]
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
        CustomerProfiles: js.UndefOr[CustomerProfilesMetadata] = js.undefined,
        Datadog: js.UndefOr[DatadogMetadata] = js.undefined,
        Dynatrace: js.UndefOr[DynatraceMetadata] = js.undefined,
        EventBridge: js.UndefOr[EventBridgeMetadata] = js.undefined,
        GoogleAnalytics: js.UndefOr[GoogleAnalyticsMetadata] = js.undefined,
        Honeycode: js.UndefOr[HoneycodeMetadata] = js.undefined,
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
      CustomerProfiles.foreach(__v => __obj.updateDynamic("CustomerProfiles")(__v.asInstanceOf[js.Any]))
      Datadog.foreach(__v => __obj.updateDynamic("Datadog")(__v.asInstanceOf[js.Any]))
      Dynatrace.foreach(__v => __obj.updateDynamic("Dynatrace")(__v.asInstanceOf[js.Any]))
      EventBridge.foreach(__v => __obj.updateDynamic("EventBridge")(__v.asInstanceOf[js.Any]))
      GoogleAnalytics.foreach(__v => __obj.updateDynamic("GoogleAnalytics")(__v.asInstanceOf[js.Any]))
      Honeycode.foreach(__v => __obj.updateDynamic("Honeycode")(__v.asInstanceOf[js.Any]))
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
    var Honeycode: js.UndefOr[HoneycodeConnectorProfileCredentials]
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
        Honeycode: js.UndefOr[HoneycodeConnectorProfileCredentials] = js.undefined,
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
      Honeycode.foreach(__v => __obj.updateDynamic("Honeycode")(__v.asInstanceOf[js.Any]))
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
    var Honeycode: js.UndefOr[HoneycodeConnectorProfileProperties]
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
        Honeycode: js.UndefOr[HoneycodeConnectorProfileProperties] = js.undefined,
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
      Honeycode.foreach(__v => __obj.updateDynamic("Honeycode")(__v.asInstanceOf[js.Any]))
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

  /** The properties that are applied when Amazon Connect Customer Profiles is used as a destination.
    */
  @js.native
  trait CustomerProfilesDestinationProperties extends js.Object {
    var domainName: DomainName
    var objectTypeName: js.UndefOr[ObjectTypeName]
  }

  object CustomerProfilesDestinationProperties {
    @inline
    def apply(
        domainName: DomainName,
        objectTypeName: js.UndefOr[ObjectTypeName] = js.undefined
    ): CustomerProfilesDestinationProperties = {
      val __obj = js.Dynamic.literal(
        "domainName" -> domainName.asInstanceOf[js.Any]
      )

      objectTypeName.foreach(__v => __obj.updateDynamic("objectTypeName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CustomerProfilesDestinationProperties]
    }
  }

  /** The connector metadata specific to Amazon Connect Customer Profiles.
    */
  @js.native
  trait CustomerProfilesMetadata extends js.Object

  object CustomerProfilesMetadata {
    @inline
    def apply(): CustomerProfilesMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomerProfilesMetadata]
    }
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
    var CustomerProfiles: js.UndefOr[CustomerProfilesDestinationProperties]
    var EventBridge: js.UndefOr[EventBridgeDestinationProperties]
    var Honeycode: js.UndefOr[HoneycodeDestinationProperties]
    var LookoutMetrics: js.UndefOr[LookoutMetricsDestinationProperties]
    var Redshift: js.UndefOr[RedshiftDestinationProperties]
    var S3: js.UndefOr[S3DestinationProperties]
    var Salesforce: js.UndefOr[SalesforceDestinationProperties]
    var Snowflake: js.UndefOr[SnowflakeDestinationProperties]
    var Upsolver: js.UndefOr[UpsolverDestinationProperties]
    var Zendesk: js.UndefOr[ZendeskDestinationProperties]
  }

  object DestinationConnectorProperties {
    @inline
    def apply(
        CustomerProfiles: js.UndefOr[CustomerProfilesDestinationProperties] = js.undefined,
        EventBridge: js.UndefOr[EventBridgeDestinationProperties] = js.undefined,
        Honeycode: js.UndefOr[HoneycodeDestinationProperties] = js.undefined,
        LookoutMetrics: js.UndefOr[LookoutMetricsDestinationProperties] = js.undefined,
        Redshift: js.UndefOr[RedshiftDestinationProperties] = js.undefined,
        S3: js.UndefOr[S3DestinationProperties] = js.undefined,
        Salesforce: js.UndefOr[SalesforceDestinationProperties] = js.undefined,
        Snowflake: js.UndefOr[SnowflakeDestinationProperties] = js.undefined,
        Upsolver: js.UndefOr[UpsolverDestinationProperties] = js.undefined,
        Zendesk: js.UndefOr[ZendeskDestinationProperties] = js.undefined
    ): DestinationConnectorProperties = {
      val __obj = js.Dynamic.literal()
      CustomerProfiles.foreach(__v => __obj.updateDynamic("CustomerProfiles")(__v.asInstanceOf[js.Any]))
      EventBridge.foreach(__v => __obj.updateDynamic("EventBridge")(__v.asInstanceOf[js.Any]))
      Honeycode.foreach(__v => __obj.updateDynamic("Honeycode")(__v.asInstanceOf[js.Any]))
      LookoutMetrics.foreach(__v => __obj.updateDynamic("LookoutMetrics")(__v.asInstanceOf[js.Any]))
      Redshift.foreach(__v => __obj.updateDynamic("Redshift")(__v.asInstanceOf[js.Any]))
      S3.foreach(__v => __obj.updateDynamic("S3")(__v.asInstanceOf[js.Any]))
      Salesforce.foreach(__v => __obj.updateDynamic("Salesforce")(__v.asInstanceOf[js.Any]))
      Snowflake.foreach(__v => __obj.updateDynamic("Snowflake")(__v.asInstanceOf[js.Any]))
      Upsolver.foreach(__v => __obj.updateDynamic("Upsolver")(__v.asInstanceOf[js.Any]))
      Zendesk.foreach(__v => __obj.updateDynamic("Zendesk")(__v.asInstanceOf[js.Any]))
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
    var dataPullEndTime: js.UndefOr[Date]
    var dataPullStartTime: js.UndefOr[Date]
    var executionId: js.UndefOr[ExecutionId]
    var executionResult: js.UndefOr[ExecutionResult]
    var executionStatus: js.UndefOr[ExecutionStatus]
    var lastUpdatedAt: js.UndefOr[Date]
    var startedAt: js.UndefOr[Date]
  }

  object ExecutionRecord {
    @inline
    def apply(
        dataPullEndTime: js.UndefOr[Date] = js.undefined,
        dataPullStartTime: js.UndefOr[Date] = js.undefined,
        executionId: js.UndefOr[ExecutionId] = js.undefined,
        executionResult: js.UndefOr[ExecutionResult] = js.undefined,
        executionStatus: js.UndefOr[ExecutionStatus] = js.undefined,
        lastUpdatedAt: js.UndefOr[Date] = js.undefined,
        startedAt: js.UndefOr[Date] = js.undefined
    ): ExecutionRecord = {
      val __obj = js.Dynamic.literal()
      dataPullEndTime.foreach(__v => __obj.updateDynamic("dataPullEndTime")(__v.asInstanceOf[js.Any]))
      dataPullStartTime.foreach(__v => __obj.updateDynamic("dataPullStartTime")(__v.asInstanceOf[js.Any]))
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

  /** The connector-specific credentials required when using Amazon Honeycode.
    */
  @js.native
  trait HoneycodeConnectorProfileCredentials extends js.Object {
    var accessToken: js.UndefOr[AccessToken]
    var oAuthRequest: js.UndefOr[ConnectorOAuthRequest]
    var refreshToken: js.UndefOr[RefreshToken]
  }

  object HoneycodeConnectorProfileCredentials {
    @inline
    def apply(
        accessToken: js.UndefOr[AccessToken] = js.undefined,
        oAuthRequest: js.UndefOr[ConnectorOAuthRequest] = js.undefined,
        refreshToken: js.UndefOr[RefreshToken] = js.undefined
    ): HoneycodeConnectorProfileCredentials = {
      val __obj = js.Dynamic.literal()
      accessToken.foreach(__v => __obj.updateDynamic("accessToken")(__v.asInstanceOf[js.Any]))
      oAuthRequest.foreach(__v => __obj.updateDynamic("oAuthRequest")(__v.asInstanceOf[js.Any]))
      refreshToken.foreach(__v => __obj.updateDynamic("refreshToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HoneycodeConnectorProfileCredentials]
    }
  }

  /** The connector-specific properties required when using Amazon Honeycode.
    */
  @js.native
  trait HoneycodeConnectorProfileProperties extends js.Object

  object HoneycodeConnectorProfileProperties {
    @inline
    def apply(): HoneycodeConnectorProfileProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HoneycodeConnectorProfileProperties]
    }
  }

  /** The properties that are applied when Amazon Honeycode is used as a destination.
    */
  @js.native
  trait HoneycodeDestinationProperties extends js.Object {
    var `object`: Object
    var errorHandlingConfig: js.UndefOr[ErrorHandlingConfig]
  }

  object HoneycodeDestinationProperties {
    @inline
    def apply(
        `object`: Object,
        errorHandlingConfig: js.UndefOr[ErrorHandlingConfig] = js.undefined
    ): HoneycodeDestinationProperties = {
      val __obj = js.Dynamic.literal(
        "object" -> `object`.asInstanceOf[js.Any]
      )

      errorHandlingConfig.foreach(__v => __obj.updateDynamic("errorHandlingConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HoneycodeDestinationProperties]
    }
  }

  /** The connector metadata specific to Amazon Honeycode.
    */
  @js.native
  trait HoneycodeMetadata extends js.Object {
    var oAuthScopes: js.UndefOr[OAuthScopeList]
  }

  object HoneycodeMetadata {
    @inline
    def apply(
        oAuthScopes: js.UndefOr[OAuthScopeList] = js.undefined
    ): HoneycodeMetadata = {
      val __obj = js.Dynamic.literal()
      oAuthScopes.foreach(__v => __obj.updateDynamic("oAuthScopes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HoneycodeMetadata]
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

  /** The properties that are applied when Amazon Lookout for Metrics is used as a destination.
    */
  @js.native
  trait LookoutMetricsDestinationProperties extends js.Object

  object LookoutMetricsDestinationProperties {
    @inline
    def apply(): LookoutMetricsDestinationProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LookoutMetricsDestinationProperties]
    }
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

  /** Specifies the configuration details of a schedule-triggered flow as defined by the user. Currently, these settings only apply to the <code>Scheduled</code> trigger type.
    */
  @js.native
  trait ScheduledTriggerProperties extends js.Object {
    var scheduleExpression: ScheduleExpression
    var dataPullMode: js.UndefOr[DataPullMode]
    var firstExecutionFrom: js.UndefOr[Date]
    var scheduleEndTime: js.UndefOr[Date]
    var scheduleOffset: js.UndefOr[ScheduleOffset]
    var scheduleStartTime: js.UndefOr[Date]
    var timezone: js.UndefOr[Timezone]
  }

  object ScheduledTriggerProperties {
    @inline
    def apply(
        scheduleExpression: ScheduleExpression,
        dataPullMode: js.UndefOr[DataPullMode] = js.undefined,
        firstExecutionFrom: js.UndefOr[Date] = js.undefined,
        scheduleEndTime: js.UndefOr[Date] = js.undefined,
        scheduleOffset: js.UndefOr[ScheduleOffset] = js.undefined,
        scheduleStartTime: js.UndefOr[Date] = js.undefined,
        timezone: js.UndefOr[Timezone] = js.undefined
    ): ScheduledTriggerProperties = {
      val __obj = js.Dynamic.literal(
        "scheduleExpression" -> scheduleExpression.asInstanceOf[js.Any]
      )

      dataPullMode.foreach(__v => __obj.updateDynamic("dataPullMode")(__v.asInstanceOf[js.Any]))
      firstExecutionFrom.foreach(__v => __obj.updateDynamic("firstExecutionFrom")(__v.asInstanceOf[js.Any]))
      scheduleEndTime.foreach(__v => __obj.updateDynamic("scheduleEndTime")(__v.asInstanceOf[js.Any]))
      scheduleOffset.foreach(__v => __obj.updateDynamic("scheduleOffset")(__v.asInstanceOf[js.Any]))
      scheduleStartTime.foreach(__v => __obj.updateDynamic("scheduleStartTime")(__v.asInstanceOf[js.Any]))
      timezone.foreach(__v => __obj.updateDynamic("timezone")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScheduledTriggerProperties]
    }
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

  @js.native
  trait ZendeskDestinationProperties extends js.Object {
    var `object`: Object
    var errorHandlingConfig: js.UndefOr[ErrorHandlingConfig]
    var idFieldNames: js.UndefOr[IdFieldNameList]
    var writeOperationType: js.UndefOr[WriteOperationType]
  }

  object ZendeskDestinationProperties {
    @inline
    def apply(
        `object`: Object,
        errorHandlingConfig: js.UndefOr[ErrorHandlingConfig] = js.undefined,
        idFieldNames: js.UndefOr[IdFieldNameList] = js.undefined,
        writeOperationType: js.UndefOr[WriteOperationType] = js.undefined
    ): ZendeskDestinationProperties = {
      val __obj = js.Dynamic.literal(
        "object" -> `object`.asInstanceOf[js.Any]
      )

      errorHandlingConfig.foreach(__v => __obj.updateDynamic("errorHandlingConfig")(__v.asInstanceOf[js.Any]))
      idFieldNames.foreach(__v => __obj.updateDynamic("idFieldNames")(__v.asInstanceOf[js.Any]))
      writeOperationType.foreach(__v => __obj.updateDynamic("writeOperationType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ZendeskDestinationProperties]
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
