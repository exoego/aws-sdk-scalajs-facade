package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object route53 {
  type AccountLimitType = String
  type AlarmName = String
  type AliasHealthEnabled = Boolean
  type AssociateVPCComment = String
  type ChangeAction = String
  type ChangeStatus = String
  type Changes = js.Array[Change]
  type CheckerIpRanges = js.Array[IPAddressCidr]
  type ChildHealthCheckList = js.Array[HealthCheckId]
  type CloudWatchLogsLogGroupArn = String
  type CloudWatchRegion = String
  type ComparisonOperator = String
  type DNSName = String
  type DNSRCode = String
  type DelegationSetNameServers = js.Array[DNSName]
  type DelegationSets = js.Array[DelegationSet]
  type DimensionField = String
  type DimensionList = js.Array[Dimension]
  type Disabled = Boolean
  type DisassociateVPCComment = String
  type EnableSNI = Boolean
  type EvaluationPeriods = Int
  type FailureThreshold = Int
  type FullyQualifiedDomainName = String
  type GeoLocationContinentCode = String
  type GeoLocationContinentName = String
  type GeoLocationCountryCode = String
  type GeoLocationCountryName = String
  type GeoLocationDetailsList = js.Array[GeoLocationDetails]
  type GeoLocationSubdivisionCode = String
  type GeoLocationSubdivisionName = String
  type HealthCheckCount = Double
  type HealthCheckId = String
  type HealthCheckNonce = String
  type HealthCheckObservations = js.Array[HealthCheckObservation]
  type HealthCheckRegion = String
  type HealthCheckRegionList = js.Array[HealthCheckRegion]
  type HealthCheckType = String
  type HealthCheckVersion = Double
  type HealthChecks = js.Array[HealthCheck]
  type HealthThreshold = Int
  type HostedZoneCount = Double
  type HostedZoneLimitType = String
  type HostedZoneRRSetCount = Double
  type HostedZones = js.Array[HostedZone]
  type IPAddress = String
  type IPAddressCidr = String
  type InsufficientDataHealthStatus = String
  type Inverted = Boolean
  type IsPrivateZone = Boolean
  type LimitValue = Double
  type MaxResults = String
  type MeasureLatency = Boolean
  type Message = String
  type MetricName = String
  type Nameserver = String
  type Namespace = String
  type Nonce = String
  type PageMarker = String
  type PageMaxItems = String
  type PageTruncated = Boolean
  type PaginationToken = String
  type Period = Int
  type Port = Int
  type QueryLoggingConfigId = String
  type QueryLoggingConfigs = js.Array[QueryLoggingConfig]
  type RData = String
  type RRType = String
  type RecordData = js.Array[RecordDataEntry]
  type RecordDataEntry = String
  type RequestInterval = Int
  type ResettableElementName = String
  type ResettableElementNameList = js.Array[ResettableElementName]
  type ResourceDescription = String
  type ResourceId = String
  type ResourcePath = String
  type ResourceRecordSetFailover = String
  type ResourceRecordSetIdentifier = String
  type ResourceRecordSetMultiValueAnswer = Boolean
  type ResourceRecordSetRegion = String
  type ResourceRecordSetWeight = Double
  type ResourceRecordSets = js.Array[ResourceRecordSet]
  type ResourceRecords = js.Array[ResourceRecord]
  type ResourceTagSetList = js.Array[ResourceTagSet]
  type ResourceURI = String
  type ReusableDelegationSetLimitType = String
  type SearchString = String
  type ServicePrincipal = String
  type Statistic = String
  type Status = String
  type SubnetMask = String
  type TTL = Double
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagResourceId = String
  type TagResourceIdList = js.Array[TagResourceId]
  type TagResourceType = String
  type TagValue = String
  type Threshold = Double
  type TimeStamp = js.Date
  type TrafficPolicies = js.Array[TrafficPolicy]
  type TrafficPolicyComment = String
  type TrafficPolicyDocument = String
  type TrafficPolicyId = String
  type TrafficPolicyInstanceCount = Int
  type TrafficPolicyInstanceId = String
  type TrafficPolicyInstanceState = String
  type TrafficPolicyInstances = js.Array[TrafficPolicyInstance]
  type TrafficPolicyName = String
  type TrafficPolicySummaries = js.Array[TrafficPolicySummary]
  type TrafficPolicyVersion = Int
  type TrafficPolicyVersionMarker = String
  type TransportProtocol = String
  type UsageCount = Double
  type VPCId = String
  type VPCRegion = String
  type VPCs = js.Array[VPC]
}

package route53 {
  @js.native
  @JSImport("aws-sdk", "Route53")
  class Route53(config: AWSConfig) extends js.Object {
    def associateVPCWithHostedZone(params: AssociateVPCWithHostedZoneRequest): Request[AssociateVPCWithHostedZoneResponse] = js.native
    def changeResourceRecordSets(params: ChangeResourceRecordSetsRequest): Request[ChangeResourceRecordSetsResponse] = js.native
    def changeTagsForResource(params: ChangeTagsForResourceRequest): Request[ChangeTagsForResourceResponse] = js.native
    def createHealthCheck(params: CreateHealthCheckRequest): Request[CreateHealthCheckResponse] = js.native
    def createHostedZone(params: CreateHostedZoneRequest): Request[CreateHostedZoneResponse] = js.native
    def createQueryLoggingConfig(params: CreateQueryLoggingConfigRequest): Request[CreateQueryLoggingConfigResponse] = js.native
    def createReusableDelegationSet(params: CreateReusableDelegationSetRequest): Request[CreateReusableDelegationSetResponse] = js.native
    def createTrafficPolicy(params: CreateTrafficPolicyRequest): Request[CreateTrafficPolicyResponse] = js.native
    def createTrafficPolicyInstance(params: CreateTrafficPolicyInstanceRequest): Request[CreateTrafficPolicyInstanceResponse] = js.native
    def createTrafficPolicyVersion(params: CreateTrafficPolicyVersionRequest): Request[CreateTrafficPolicyVersionResponse] = js.native
    def createVPCAssociationAuthorization(params: CreateVPCAssociationAuthorizationRequest): Request[CreateVPCAssociationAuthorizationResponse] = js.native
    def deleteHealthCheck(params: DeleteHealthCheckRequest): Request[DeleteHealthCheckResponse] = js.native
    def deleteHostedZone(params: DeleteHostedZoneRequest): Request[DeleteHostedZoneResponse] = js.native
    def deleteQueryLoggingConfig(params: DeleteQueryLoggingConfigRequest): Request[DeleteQueryLoggingConfigResponse] = js.native
    def deleteReusableDelegationSet(params: DeleteReusableDelegationSetRequest): Request[DeleteReusableDelegationSetResponse] = js.native
    def deleteTrafficPolicy(params: DeleteTrafficPolicyRequest): Request[DeleteTrafficPolicyResponse] = js.native
    def deleteTrafficPolicyInstance(params: DeleteTrafficPolicyInstanceRequest): Request[DeleteTrafficPolicyInstanceResponse] = js.native
    def deleteVPCAssociationAuthorization(params: DeleteVPCAssociationAuthorizationRequest): Request[DeleteVPCAssociationAuthorizationResponse] = js.native
    def disassociateVPCFromHostedZone(params: DisassociateVPCFromHostedZoneRequest): Request[DisassociateVPCFromHostedZoneResponse] = js.native
    def getAccountLimit(params: GetAccountLimitRequest): Request[GetAccountLimitResponse] = js.native
    def getChange(params: GetChangeRequest): Request[GetChangeResponse] = js.native
    def getCheckerIpRanges(params: GetCheckerIpRangesRequest): Request[GetCheckerIpRangesResponse] = js.native
    def getGeoLocation(params: GetGeoLocationRequest): Request[GetGeoLocationResponse] = js.native
    def getHealthCheck(params: GetHealthCheckRequest): Request[GetHealthCheckResponse] = js.native
    def getHealthCheckCount(params: GetHealthCheckCountRequest): Request[GetHealthCheckCountResponse] = js.native
    def getHealthCheckLastFailureReason(params: GetHealthCheckLastFailureReasonRequest): Request[GetHealthCheckLastFailureReasonResponse] = js.native
    def getHealthCheckStatus(params: GetHealthCheckStatusRequest): Request[GetHealthCheckStatusResponse] = js.native
    def getHostedZone(params: GetHostedZoneRequest): Request[GetHostedZoneResponse] = js.native
    def getHostedZoneCount(params: GetHostedZoneCountRequest): Request[GetHostedZoneCountResponse] = js.native
    def getHostedZoneLimit(params: GetHostedZoneLimitRequest): Request[GetHostedZoneLimitResponse] = js.native
    def getQueryLoggingConfig(params: GetQueryLoggingConfigRequest): Request[GetQueryLoggingConfigResponse] = js.native
    def getReusableDelegationSet(params: GetReusableDelegationSetRequest): Request[GetReusableDelegationSetResponse] = js.native
    def getReusableDelegationSetLimit(params: GetReusableDelegationSetLimitRequest): Request[GetReusableDelegationSetLimitResponse] = js.native
    def getTrafficPolicy(params: GetTrafficPolicyRequest): Request[GetTrafficPolicyResponse] = js.native
    def getTrafficPolicyInstance(params: GetTrafficPolicyInstanceRequest): Request[GetTrafficPolicyInstanceResponse] = js.native
    def getTrafficPolicyInstanceCount(params: GetTrafficPolicyInstanceCountRequest): Request[GetTrafficPolicyInstanceCountResponse] = js.native
    def listGeoLocations(params: ListGeoLocationsRequest): Request[ListGeoLocationsResponse] = js.native
    def listHealthChecks(params: ListHealthChecksRequest): Request[ListHealthChecksResponse] = js.native
    def listHostedZones(params: ListHostedZonesRequest): Request[ListHostedZonesResponse] = js.native
    def listHostedZonesByName(params: ListHostedZonesByNameRequest): Request[ListHostedZonesByNameResponse] = js.native
    def listQueryLoggingConfigs(params: ListQueryLoggingConfigsRequest): Request[ListQueryLoggingConfigsResponse] = js.native
    def listResourceRecordSets(params: ListResourceRecordSetsRequest): Request[ListResourceRecordSetsResponse] = js.native
    def listReusableDelegationSets(params: ListReusableDelegationSetsRequest): Request[ListReusableDelegationSetsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def listTagsForResources(params: ListTagsForResourcesRequest): Request[ListTagsForResourcesResponse] = js.native
    def listTrafficPolicies(params: ListTrafficPoliciesRequest): Request[ListTrafficPoliciesResponse] = js.native
    def listTrafficPolicyInstances(params: ListTrafficPolicyInstancesRequest): Request[ListTrafficPolicyInstancesResponse] = js.native
    def listTrafficPolicyInstancesByHostedZone(params: ListTrafficPolicyInstancesByHostedZoneRequest): Request[ListTrafficPolicyInstancesByHostedZoneResponse] = js.native
    def listTrafficPolicyInstancesByPolicy(params: ListTrafficPolicyInstancesByPolicyRequest): Request[ListTrafficPolicyInstancesByPolicyResponse] = js.native
    def listTrafficPolicyVersions(params: ListTrafficPolicyVersionsRequest): Request[ListTrafficPolicyVersionsResponse] = js.native
    def listVPCAssociationAuthorizations(params: ListVPCAssociationAuthorizationsRequest): Request[ListVPCAssociationAuthorizationsResponse] = js.native
    def testDNSAnswer(params: TestDNSAnswerRequest): Request[TestDNSAnswerResponse] = js.native
    def updateHealthCheck(params: UpdateHealthCheckRequest): Request[UpdateHealthCheckResponse] = js.native
    def updateHostedZoneComment(params: UpdateHostedZoneCommentRequest): Request[UpdateHostedZoneCommentResponse] = js.native
    def updateTrafficPolicyComment(params: UpdateTrafficPolicyCommentRequest): Request[UpdateTrafficPolicyCommentResponse] = js.native
    def updateTrafficPolicyInstance(params: UpdateTrafficPolicyInstanceRequest): Request[UpdateTrafficPolicyInstanceResponse] = js.native
  }

  /**
   * <p>A complex type that contains the type of limit that you specified in the request and the current value for that limit.</p>
   */
  @js.native
  trait AccountLimit extends js.Object {
    var Type: js.UndefOr[AccountLimitType]
    var Value: js.UndefOr[LimitValue]
  }

  object AccountLimit {
    def apply(
      Type: js.UndefOr[AccountLimitType] = js.undefined,
      Value: js.UndefOr[LimitValue] = js.undefined): AccountLimit = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AccountLimit]
    }
  }

  object AccountLimitTypeEnum {
    val MAX_HEALTH_CHECKS_BY_OWNER = "MAX_HEALTH_CHECKS_BY_OWNER"
    val MAX_HOSTED_ZONES_BY_OWNER = "MAX_HOSTED_ZONES_BY_OWNER"
    val MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER = "MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER"
    val MAX_REUSABLE_DELEGATION_SETS_BY_OWNER = "MAX_REUSABLE_DELEGATION_SETS_BY_OWNER"
    val MAX_TRAFFIC_POLICIES_BY_OWNER = "MAX_TRAFFIC_POLICIES_BY_OWNER"

    val values = IndexedSeq(MAX_HEALTH_CHECKS_BY_OWNER, MAX_HOSTED_ZONES_BY_OWNER, MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER, MAX_REUSABLE_DELEGATION_SETS_BY_OWNER, MAX_TRAFFIC_POLICIES_BY_OWNER)
  }

  /**
   * <p>A complex type that identifies the CloudWatch alarm that you want Amazon Route 53 health checkers to use to determine whether the specified health check is healthy.</p>
   */
  @js.native
  trait AlarmIdentifier extends js.Object {
    var Region: js.UndefOr[CloudWatchRegion]
    var Name: js.UndefOr[AlarmName]
  }

  object AlarmIdentifier {
    def apply(
      Region: js.UndefOr[CloudWatchRegion] = js.undefined,
      Name: js.UndefOr[AlarmName] = js.undefined): AlarmIdentifier = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Region" -> Region.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AlarmIdentifier]
    }
  }

  /**
   * <p> <i>Alias resource record sets only:</i> Information about the CloudFront distribution, Elastic Beanstalk environment, ELB load balancer, Amazon S3 bucket, or Amazon Route 53 resource record set that you're redirecting queries to. An Elastic Beanstalk environment must have a regionalized subdomain.</p> <p>When creating resource record sets for a private hosted zone, note the following:</p> <ul> <li> <p>Resource record sets can't be created for CloudFront distributions in a private hosted zone.</p> </li> <li> <p>Creating geolocation alias resource record sets or latency alias resource record sets in a private hosted zone is unsupported.</p> </li> <li> <p>For information about creating failover resource record sets in a private hosted zone, see <a href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-private-hosted-zones.html">Configuring Failover in a Private Hosted Zone</a>.</p> </li> </ul>
   */
  @js.native
  trait AliasTarget extends js.Object {
    var HostedZoneId: js.UndefOr[ResourceId]
    var DNSName: js.UndefOr[DNSName]
    var EvaluateTargetHealth: js.UndefOr[AliasHealthEnabled]
  }

  object AliasTarget {
    def apply(
      HostedZoneId: js.UndefOr[ResourceId] = js.undefined,
      DNSName: js.UndefOr[DNSName] = js.undefined,
      EvaluateTargetHealth: js.UndefOr[AliasHealthEnabled] = js.undefined): AliasTarget = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HostedZoneId" -> HostedZoneId.map { x => x.asInstanceOf[js.Any] },
        "DNSName" -> DNSName.map { x => x.asInstanceOf[js.Any] },
        "EvaluateTargetHealth" -> EvaluateTargetHealth.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AliasTarget]
    }
  }

  /**
   * <p>A complex type that contains information about the request to associate a VPC with a private hosted zone.</p>
   */
  @js.native
  trait AssociateVPCWithHostedZoneRequest extends js.Object {
    var HostedZoneId: js.UndefOr[ResourceId]
    var VPC: js.UndefOr[VPC]
    var Comment: js.UndefOr[AssociateVPCComment]
  }

  object AssociateVPCWithHostedZoneRequest {
    def apply(
      HostedZoneId: js.UndefOr[ResourceId] = js.undefined,
      VPC: js.UndefOr[VPC] = js.undefined,
      Comment: js.UndefOr[AssociateVPCComment] = js.undefined): AssociateVPCWithHostedZoneRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HostedZoneId" -> HostedZoneId.map { x => x.asInstanceOf[js.Any] },
        "VPC" -> VPC.map { x => x.asInstanceOf[js.Any] },
        "Comment" -> Comment.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateVPCWithHostedZoneRequest]
    }
  }

  /**
   * <p>A complex type that contains the response information for the <code>AssociateVPCWithHostedZone</code> request.</p>
   */
  @js.native
  trait AssociateVPCWithHostedZoneResponse extends js.Object {
    var ChangeInfo: js.UndefOr[ChangeInfo]
  }

  object AssociateVPCWithHostedZoneResponse {
    def apply(
      ChangeInfo: js.UndefOr[ChangeInfo] = js.undefined): AssociateVPCWithHostedZoneResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeInfo" -> ChangeInfo.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateVPCWithHostedZoneResponse]
    }
  }

  /**
   * <p>The information for each resource record set that you want to change.</p>
   */
  @js.native
  trait Change extends js.Object {
    var Action: js.UndefOr[ChangeAction]
    var ResourceRecordSet: js.UndefOr[ResourceRecordSet]
  }

  object Change {
    def apply(
      Action: js.UndefOr[ChangeAction] = js.undefined,
      ResourceRecordSet: js.UndefOr[ResourceRecordSet] = js.undefined): Change = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Action" -> Action.map { x => x.asInstanceOf[js.Any] },
        "ResourceRecordSet" -> ResourceRecordSet.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Change]
    }
  }

  object ChangeActionEnum {
    val CREATE = "CREATE"
    val DELETE = "DELETE"
    val UPSERT = "UPSERT"

    val values = IndexedSeq(CREATE, DELETE, UPSERT)
  }

  /**
   * <p>The information for a change request.</p>
   */
  @js.native
  trait ChangeBatch extends js.Object {
    var Comment: js.UndefOr[ResourceDescription]
    var Changes: js.UndefOr[Changes]
  }

  object ChangeBatch {
    def apply(
      Comment: js.UndefOr[ResourceDescription] = js.undefined,
      Changes: js.UndefOr[Changes] = js.undefined): ChangeBatch = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Comment" -> Comment.map { x => x.asInstanceOf[js.Any] },
        "Changes" -> Changes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ChangeBatch]
    }
  }

  /**
   * <p>A complex type that describes change information about changes made to your hosted zone.</p>
   */
  @js.native
  trait ChangeInfo extends js.Object {
    var Id: js.UndefOr[ResourceId]
    var Status: js.UndefOr[ChangeStatus]
    var SubmittedAt: js.UndefOr[TimeStamp]
    var Comment: js.UndefOr[ResourceDescription]
  }

  object ChangeInfo {
    def apply(
      Id: js.UndefOr[ResourceId] = js.undefined,
      Status: js.UndefOr[ChangeStatus] = js.undefined,
      SubmittedAt: js.UndefOr[TimeStamp] = js.undefined,
      Comment: js.UndefOr[ResourceDescription] = js.undefined): ChangeInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "SubmittedAt" -> SubmittedAt.map { x => x.asInstanceOf[js.Any] },
        "Comment" -> Comment.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ChangeInfo]
    }
  }

  /**
   * <p>A complex type that contains change information for the resource record set.</p>
   */
  @js.native
  trait ChangeResourceRecordSetsRequest extends js.Object {
    var HostedZoneId: js.UndefOr[ResourceId]
    var ChangeBatch: js.UndefOr[ChangeBatch]
  }

  object ChangeResourceRecordSetsRequest {
    def apply(
      HostedZoneId: js.UndefOr[ResourceId] = js.undefined,
      ChangeBatch: js.UndefOr[ChangeBatch] = js.undefined): ChangeResourceRecordSetsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HostedZoneId" -> HostedZoneId.map { x => x.asInstanceOf[js.Any] },
        "ChangeBatch" -> ChangeBatch.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ChangeResourceRecordSetsRequest]
    }
  }

  /**
   * <p>A complex type containing the response for the request.</p>
   */
  @js.native
  trait ChangeResourceRecordSetsResponse extends js.Object {
    var ChangeInfo: js.UndefOr[ChangeInfo]
  }

  object ChangeResourceRecordSetsResponse {
    def apply(
      ChangeInfo: js.UndefOr[ChangeInfo] = js.undefined): ChangeResourceRecordSetsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeInfo" -> ChangeInfo.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ChangeResourceRecordSetsResponse]
    }
  }

  object ChangeStatusEnum {
    val PENDING = "PENDING"
    val INSYNC = "INSYNC"

    val values = IndexedSeq(PENDING, INSYNC)
  }

  /**
   * <p>A complex type that contains information about the tags that you want to add, edit, or delete.</p>
   */
  @js.native
  trait ChangeTagsForResourceRequest extends js.Object {
    var ResourceType: js.UndefOr[TagResourceType]
    var ResourceId: js.UndefOr[TagResourceId]
    var AddTags: js.UndefOr[TagList]
    var RemoveTagKeys: js.UndefOr[TagKeyList]
  }

  object ChangeTagsForResourceRequest {
    def apply(
      ResourceType: js.UndefOr[TagResourceType] = js.undefined,
      ResourceId: js.UndefOr[TagResourceId] = js.undefined,
      AddTags: js.UndefOr[TagList] = js.undefined,
      RemoveTagKeys: js.UndefOr[TagKeyList] = js.undefined): ChangeTagsForResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceType" -> ResourceType.map { x => x.asInstanceOf[js.Any] },
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] },
        "AddTags" -> AddTags.map { x => x.asInstanceOf[js.Any] },
        "RemoveTagKeys" -> RemoveTagKeys.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ChangeTagsForResourceRequest]
    }
  }

  /**
   * <p>Empty response for the request.</p>
   */
  @js.native
  trait ChangeTagsForResourceResponse extends js.Object {

  }

  object ChangeTagsForResourceResponse {
    def apply(): ChangeTagsForResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ChangeTagsForResourceResponse]
    }
  }

  /**
   * <p>A complex type that contains information about the CloudWatch alarm that Amazon Route 53 is monitoring for this health check.</p>
   */
  @js.native
  trait CloudWatchAlarmConfiguration extends js.Object {
    var Threshold: js.UndefOr[Threshold]
    var Dimensions: js.UndefOr[DimensionList]
    var EvaluationPeriods: js.UndefOr[EvaluationPeriods]
    var ComparisonOperator: js.UndefOr[ComparisonOperator]
    var Period: js.UndefOr[Period]
    var Statistic: js.UndefOr[Statistic]
    var Namespace: js.UndefOr[Namespace]
    var MetricName: js.UndefOr[MetricName]
  }

  object CloudWatchAlarmConfiguration {
    def apply(
      Threshold: js.UndefOr[Threshold] = js.undefined,
      Dimensions: js.UndefOr[DimensionList] = js.undefined,
      EvaluationPeriods: js.UndefOr[EvaluationPeriods] = js.undefined,
      ComparisonOperator: js.UndefOr[ComparisonOperator] = js.undefined,
      Period: js.UndefOr[Period] = js.undefined,
      Statistic: js.UndefOr[Statistic] = js.undefined,
      Namespace: js.UndefOr[Namespace] = js.undefined,
      MetricName: js.UndefOr[MetricName] = js.undefined): CloudWatchAlarmConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Threshold" -> Threshold.map { x => x.asInstanceOf[js.Any] },
        "Dimensions" -> Dimensions.map { x => x.asInstanceOf[js.Any] },
        "EvaluationPeriods" -> EvaluationPeriods.map { x => x.asInstanceOf[js.Any] },
        "ComparisonOperator" -> ComparisonOperator.map { x => x.asInstanceOf[js.Any] },
        "Period" -> Period.map { x => x.asInstanceOf[js.Any] },
        "Statistic" -> Statistic.map { x => x.asInstanceOf[js.Any] },
        "Namespace" -> Namespace.map { x => x.asInstanceOf[js.Any] },
        "MetricName" -> MetricName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CloudWatchAlarmConfiguration]
    }
  }

  object CloudWatchRegionEnum {
    val `us-east-1` = "us-east-1"
    val `us-east-2` = "us-east-2"
    val `us-west-1` = "us-west-1"
    val `us-west-2` = "us-west-2"
    val `ca-central-1` = "ca-central-1"
    val `eu-central-1` = "eu-central-1"
    val `eu-west-1` = "eu-west-1"
    val `eu-west-2` = "eu-west-2"
    val `eu-west-3` = "eu-west-3"
    val `ap-south-1` = "ap-south-1"
    val `ap-southeast-1` = "ap-southeast-1"
    val `ap-southeast-2` = "ap-southeast-2"
    val `ap-northeast-1` = "ap-northeast-1"
    val `ap-northeast-2` = "ap-northeast-2"
    val `ap-northeast-3` = "ap-northeast-3"
    val `sa-east-1` = "sa-east-1"

    val values = IndexedSeq(`us-east-1`, `us-east-2`, `us-west-1`, `us-west-2`, `ca-central-1`, `eu-central-1`, `eu-west-1`, `eu-west-2`, `eu-west-3`, `ap-south-1`, `ap-southeast-1`, `ap-southeast-2`, `ap-northeast-1`, `ap-northeast-2`, `ap-northeast-3`, `sa-east-1`)
  }

  object ComparisonOperatorEnum {
    val GreaterThanOrEqualToThreshold = "GreaterThanOrEqualToThreshold"
    val GreaterThanThreshold = "GreaterThanThreshold"
    val LessThanThreshold = "LessThanThreshold"
    val LessThanOrEqualToThreshold = "LessThanOrEqualToThreshold"

    val values = IndexedSeq(GreaterThanOrEqualToThreshold, GreaterThanThreshold, LessThanThreshold, LessThanOrEqualToThreshold)
  }

  /**
   * <p>A complex type that contains the health check request information.</p>
   */
  @js.native
  trait CreateHealthCheckRequest extends js.Object {
    var CallerReference: js.UndefOr[HealthCheckNonce]
    var HealthCheckConfig: js.UndefOr[HealthCheckConfig]
  }

  object CreateHealthCheckRequest {
    def apply(
      CallerReference: js.UndefOr[HealthCheckNonce] = js.undefined,
      HealthCheckConfig: js.UndefOr[HealthCheckConfig] = js.undefined): CreateHealthCheckRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CallerReference" -> CallerReference.map { x => x.asInstanceOf[js.Any] },
        "HealthCheckConfig" -> HealthCheckConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateHealthCheckRequest]
    }
  }

  /**
   * <p>A complex type containing the response information for the new health check.</p>
   */
  @js.native
  trait CreateHealthCheckResponse extends js.Object {
    var HealthCheck: js.UndefOr[HealthCheck]
    var Location: js.UndefOr[ResourceURI]
  }

  object CreateHealthCheckResponse {
    def apply(
      HealthCheck: js.UndefOr[HealthCheck] = js.undefined,
      Location: js.UndefOr[ResourceURI] = js.undefined): CreateHealthCheckResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HealthCheck" -> HealthCheck.map { x => x.asInstanceOf[js.Any] },
        "Location" -> Location.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateHealthCheckResponse]
    }
  }

  /**
   * <p>A complex type that contains information about the request to create a public or private hosted zone.</p>
   */
  @js.native
  trait CreateHostedZoneRequest extends js.Object {
    var DelegationSetId: js.UndefOr[ResourceId]
    var Name: js.UndefOr[DNSName]
    var CallerReference: js.UndefOr[Nonce]
    var VPC: js.UndefOr[VPC]
    var HostedZoneConfig: js.UndefOr[HostedZoneConfig]
  }

  object CreateHostedZoneRequest {
    def apply(
      DelegationSetId: js.UndefOr[ResourceId] = js.undefined,
      Name: js.UndefOr[DNSName] = js.undefined,
      CallerReference: js.UndefOr[Nonce] = js.undefined,
      VPC: js.UndefOr[VPC] = js.undefined,
      HostedZoneConfig: js.UndefOr[HostedZoneConfig] = js.undefined): CreateHostedZoneRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DelegationSetId" -> DelegationSetId.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "CallerReference" -> CallerReference.map { x => x.asInstanceOf[js.Any] },
        "VPC" -> VPC.map { x => x.asInstanceOf[js.Any] },
        "HostedZoneConfig" -> HostedZoneConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateHostedZoneRequest]
    }
  }

  /**
   * <p>A complex type containing the response information for the hosted zone.</p>
   */
  @js.native
  trait CreateHostedZoneResponse extends js.Object {
    var Location: js.UndefOr[ResourceURI]
    var ChangeInfo: js.UndefOr[ChangeInfo]
    var VPC: js.UndefOr[VPC]
    var HostedZone: js.UndefOr[HostedZone]
    var DelegationSet: js.UndefOr[DelegationSet]
  }

  object CreateHostedZoneResponse {
    def apply(
      Location: js.UndefOr[ResourceURI] = js.undefined,
      ChangeInfo: js.UndefOr[ChangeInfo] = js.undefined,
      VPC: js.UndefOr[VPC] = js.undefined,
      HostedZone: js.UndefOr[HostedZone] = js.undefined,
      DelegationSet: js.UndefOr[DelegationSet] = js.undefined): CreateHostedZoneResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Location" -> Location.map { x => x.asInstanceOf[js.Any] },
        "ChangeInfo" -> ChangeInfo.map { x => x.asInstanceOf[js.Any] },
        "VPC" -> VPC.map { x => x.asInstanceOf[js.Any] },
        "HostedZone" -> HostedZone.map { x => x.asInstanceOf[js.Any] },
        "DelegationSet" -> DelegationSet.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateHostedZoneResponse]
    }
  }

  @js.native
  trait CreateQueryLoggingConfigRequest extends js.Object {
    var HostedZoneId: js.UndefOr[ResourceId]
    var CloudWatchLogsLogGroupArn: js.UndefOr[CloudWatchLogsLogGroupArn]
  }

  object CreateQueryLoggingConfigRequest {
    def apply(
      HostedZoneId: js.UndefOr[ResourceId] = js.undefined,
      CloudWatchLogsLogGroupArn: js.UndefOr[CloudWatchLogsLogGroupArn] = js.undefined): CreateQueryLoggingConfigRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HostedZoneId" -> HostedZoneId.map { x => x.asInstanceOf[js.Any] },
        "CloudWatchLogsLogGroupArn" -> CloudWatchLogsLogGroupArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateQueryLoggingConfigRequest]
    }
  }

  @js.native
  trait CreateQueryLoggingConfigResponse extends js.Object {
    var QueryLoggingConfig: js.UndefOr[QueryLoggingConfig]
    var Location: js.UndefOr[ResourceURI]
  }

  object CreateQueryLoggingConfigResponse {
    def apply(
      QueryLoggingConfig: js.UndefOr[QueryLoggingConfig] = js.undefined,
      Location: js.UndefOr[ResourceURI] = js.undefined): CreateQueryLoggingConfigResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QueryLoggingConfig" -> QueryLoggingConfig.map { x => x.asInstanceOf[js.Any] },
        "Location" -> Location.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateQueryLoggingConfigResponse]
    }
  }

  @js.native
  trait CreateReusableDelegationSetRequest extends js.Object {
    var CallerReference: js.UndefOr[Nonce]
    var HostedZoneId: js.UndefOr[ResourceId]
  }

  object CreateReusableDelegationSetRequest {
    def apply(
      CallerReference: js.UndefOr[Nonce] = js.undefined,
      HostedZoneId: js.UndefOr[ResourceId] = js.undefined): CreateReusableDelegationSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CallerReference" -> CallerReference.map { x => x.asInstanceOf[js.Any] },
        "HostedZoneId" -> HostedZoneId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateReusableDelegationSetRequest]
    }
  }

  @js.native
  trait CreateReusableDelegationSetResponse extends js.Object {
    var DelegationSet: js.UndefOr[DelegationSet]
    var Location: js.UndefOr[ResourceURI]
  }

  object CreateReusableDelegationSetResponse {
    def apply(
      DelegationSet: js.UndefOr[DelegationSet] = js.undefined,
      Location: js.UndefOr[ResourceURI] = js.undefined): CreateReusableDelegationSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DelegationSet" -> DelegationSet.map { x => x.asInstanceOf[js.Any] },
        "Location" -> Location.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateReusableDelegationSetResponse]
    }
  }

  /**
   * <p>A complex type that contains information about the resource record sets that you want to create based on a specified traffic policy.</p>
   */
  @js.native
  trait CreateTrafficPolicyInstanceRequest extends js.Object {
    var Name: js.UndefOr[DNSName]
    var TrafficPolicyVersion: js.UndefOr[TrafficPolicyVersion]
    var TrafficPolicyId: js.UndefOr[TrafficPolicyId]
    var TTL: js.UndefOr[TTL]
    var HostedZoneId: js.UndefOr[ResourceId]
  }

  object CreateTrafficPolicyInstanceRequest {
    def apply(
      Name: js.UndefOr[DNSName] = js.undefined,
      TrafficPolicyVersion: js.UndefOr[TrafficPolicyVersion] = js.undefined,
      TrafficPolicyId: js.UndefOr[TrafficPolicyId] = js.undefined,
      TTL: js.UndefOr[TTL] = js.undefined,
      HostedZoneId: js.UndefOr[ResourceId] = js.undefined): CreateTrafficPolicyInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "TrafficPolicyVersion" -> TrafficPolicyVersion.map { x => x.asInstanceOf[js.Any] },
        "TrafficPolicyId" -> TrafficPolicyId.map { x => x.asInstanceOf[js.Any] },
        "TTL" -> TTL.map { x => x.asInstanceOf[js.Any] },
        "HostedZoneId" -> HostedZoneId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTrafficPolicyInstanceRequest]
    }
  }

  /**
   * <p>A complex type that contains the response information for the <code>CreateTrafficPolicyInstance</code> request.</p>
   */
  @js.native
  trait CreateTrafficPolicyInstanceResponse extends js.Object {
    var TrafficPolicyInstance: js.UndefOr[TrafficPolicyInstance]
    var Location: js.UndefOr[ResourceURI]
  }

  object CreateTrafficPolicyInstanceResponse {
    def apply(
      TrafficPolicyInstance: js.UndefOr[TrafficPolicyInstance] = js.undefined,
      Location: js.UndefOr[ResourceURI] = js.undefined): CreateTrafficPolicyInstanceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TrafficPolicyInstance" -> TrafficPolicyInstance.map { x => x.asInstanceOf[js.Any] },
        "Location" -> Location.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTrafficPolicyInstanceResponse]
    }
  }

  /**
   * <p>A complex type that contains information about the traffic policy that you want to create.</p>
   */
  @js.native
  trait CreateTrafficPolicyRequest extends js.Object {
    var Name: js.UndefOr[TrafficPolicyName]
    var Document: js.UndefOr[TrafficPolicyDocument]
    var Comment: js.UndefOr[TrafficPolicyComment]
  }

  object CreateTrafficPolicyRequest {
    def apply(
      Name: js.UndefOr[TrafficPolicyName] = js.undefined,
      Document: js.UndefOr[TrafficPolicyDocument] = js.undefined,
      Comment: js.UndefOr[TrafficPolicyComment] = js.undefined): CreateTrafficPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Document" -> Document.map { x => x.asInstanceOf[js.Any] },
        "Comment" -> Comment.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTrafficPolicyRequest]
    }
  }

  /**
   * <p>A complex type that contains the response information for the <code>CreateTrafficPolicy</code> request.</p>
   */
  @js.native
  trait CreateTrafficPolicyResponse extends js.Object {
    var TrafficPolicy: js.UndefOr[TrafficPolicy]
    var Location: js.UndefOr[ResourceURI]
  }

  object CreateTrafficPolicyResponse {
    def apply(
      TrafficPolicy: js.UndefOr[TrafficPolicy] = js.undefined,
      Location: js.UndefOr[ResourceURI] = js.undefined): CreateTrafficPolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TrafficPolicy" -> TrafficPolicy.map { x => x.asInstanceOf[js.Any] },
        "Location" -> Location.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTrafficPolicyResponse]
    }
  }

  /**
   * <p>A complex type that contains information about the traffic policy that you want to create a new version for.</p>
   */
  @js.native
  trait CreateTrafficPolicyVersionRequest extends js.Object {
    var Id: js.UndefOr[TrafficPolicyId]
    var Document: js.UndefOr[TrafficPolicyDocument]
    var Comment: js.UndefOr[TrafficPolicyComment]
  }

  object CreateTrafficPolicyVersionRequest {
    def apply(
      Id: js.UndefOr[TrafficPolicyId] = js.undefined,
      Document: js.UndefOr[TrafficPolicyDocument] = js.undefined,
      Comment: js.UndefOr[TrafficPolicyComment] = js.undefined): CreateTrafficPolicyVersionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Document" -> Document.map { x => x.asInstanceOf[js.Any] },
        "Comment" -> Comment.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTrafficPolicyVersionRequest]
    }
  }

  /**
   * <p>A complex type that contains the response information for the <code>CreateTrafficPolicyVersion</code> request.</p>
   */
  @js.native
  trait CreateTrafficPolicyVersionResponse extends js.Object {
    var TrafficPolicy: js.UndefOr[TrafficPolicy]
    var Location: js.UndefOr[ResourceURI]
  }

  object CreateTrafficPolicyVersionResponse {
    def apply(
      TrafficPolicy: js.UndefOr[TrafficPolicy] = js.undefined,
      Location: js.UndefOr[ResourceURI] = js.undefined): CreateTrafficPolicyVersionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TrafficPolicy" -> TrafficPolicy.map { x => x.asInstanceOf[js.Any] },
        "Location" -> Location.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTrafficPolicyVersionResponse]
    }
  }

  /**
   * <p>A complex type that contains information about the request to authorize associating a VPC with your private hosted zone. Authorization is only required when a private hosted zone and a VPC were created by using different accounts.</p>
   */
  @js.native
  trait CreateVPCAssociationAuthorizationRequest extends js.Object {
    var HostedZoneId: js.UndefOr[ResourceId]
    var VPC: js.UndefOr[VPC]
  }

  object CreateVPCAssociationAuthorizationRequest {
    def apply(
      HostedZoneId: js.UndefOr[ResourceId] = js.undefined,
      VPC: js.UndefOr[VPC] = js.undefined): CreateVPCAssociationAuthorizationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HostedZoneId" -> HostedZoneId.map { x => x.asInstanceOf[js.Any] },
        "VPC" -> VPC.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateVPCAssociationAuthorizationRequest]
    }
  }

  /**
   * <p>A complex type that contains the response information from a <code>CreateVPCAssociationAuthorization</code> request.</p>
   */
  @js.native
  trait CreateVPCAssociationAuthorizationResponse extends js.Object {
    var HostedZoneId: js.UndefOr[ResourceId]
    var VPC: js.UndefOr[VPC]
  }

  object CreateVPCAssociationAuthorizationResponse {
    def apply(
      HostedZoneId: js.UndefOr[ResourceId] = js.undefined,
      VPC: js.UndefOr[VPC] = js.undefined): CreateVPCAssociationAuthorizationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HostedZoneId" -> HostedZoneId.map { x => x.asInstanceOf[js.Any] },
        "VPC" -> VPC.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateVPCAssociationAuthorizationResponse]
    }
  }

  /**
   * <p>A complex type that lists the name servers in a delegation set, as well as the <code>CallerReference</code> and the <code>ID</code> for the delegation set.</p>
   */
  @js.native
  trait DelegationSet extends js.Object {
    var Id: js.UndefOr[ResourceId]
    var CallerReference: js.UndefOr[Nonce]
    var NameServers: js.UndefOr[DelegationSetNameServers]
  }

  object DelegationSet {
    def apply(
      Id: js.UndefOr[ResourceId] = js.undefined,
      CallerReference: js.UndefOr[Nonce] = js.undefined,
      NameServers: js.UndefOr[DelegationSetNameServers] = js.undefined): DelegationSet = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "CallerReference" -> CallerReference.map { x => x.asInstanceOf[js.Any] },
        "NameServers" -> NameServers.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DelegationSet]
    }
  }

  /**
   * <p>This action deletes a health check.</p>
   */
  @js.native
  trait DeleteHealthCheckRequest extends js.Object {
    var HealthCheckId: js.UndefOr[HealthCheckId]
  }

  object DeleteHealthCheckRequest {
    def apply(
      HealthCheckId: js.UndefOr[HealthCheckId] = js.undefined): DeleteHealthCheckRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HealthCheckId" -> HealthCheckId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteHealthCheckRequest]
    }
  }

  /**
   * <p>An empty element.</p>
   */
  @js.native
  trait DeleteHealthCheckResponse extends js.Object {

  }

  object DeleteHealthCheckResponse {
    def apply(): DeleteHealthCheckResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteHealthCheckResponse]
    }
  }

  /**
   * <p>A request to delete a hosted zone.</p>
   */
  @js.native
  trait DeleteHostedZoneRequest extends js.Object {
    var Id: js.UndefOr[ResourceId]
  }

  object DeleteHostedZoneRequest {
    def apply(
      Id: js.UndefOr[ResourceId] = js.undefined): DeleteHostedZoneRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteHostedZoneRequest]
    }
  }

  /**
   * <p>A complex type that contains the response to a <code>DeleteHostedZone</code> request.</p>
   */
  @js.native
  trait DeleteHostedZoneResponse extends js.Object {
    var ChangeInfo: js.UndefOr[ChangeInfo]
  }

  object DeleteHostedZoneResponse {
    def apply(
      ChangeInfo: js.UndefOr[ChangeInfo] = js.undefined): DeleteHostedZoneResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeInfo" -> ChangeInfo.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteHostedZoneResponse]
    }
  }

  @js.native
  trait DeleteQueryLoggingConfigRequest extends js.Object {
    var Id: js.UndefOr[QueryLoggingConfigId]
  }

  object DeleteQueryLoggingConfigRequest {
    def apply(
      Id: js.UndefOr[QueryLoggingConfigId] = js.undefined): DeleteQueryLoggingConfigRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteQueryLoggingConfigRequest]
    }
  }

  @js.native
  trait DeleteQueryLoggingConfigResponse extends js.Object {

  }

  object DeleteQueryLoggingConfigResponse {
    def apply(): DeleteQueryLoggingConfigResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteQueryLoggingConfigResponse]
    }
  }

  /**
   * <p>A request to delete a reusable delegation set.</p>
   */
  @js.native
  trait DeleteReusableDelegationSetRequest extends js.Object {
    var Id: js.UndefOr[ResourceId]
  }

  object DeleteReusableDelegationSetRequest {
    def apply(
      Id: js.UndefOr[ResourceId] = js.undefined): DeleteReusableDelegationSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteReusableDelegationSetRequest]
    }
  }

  /**
   * <p>An empty element.</p>
   */
  @js.native
  trait DeleteReusableDelegationSetResponse extends js.Object {

  }

  object DeleteReusableDelegationSetResponse {
    def apply(): DeleteReusableDelegationSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteReusableDelegationSetResponse]
    }
  }

  /**
   * <p>A request to delete a specified traffic policy instance.</p>
   */
  @js.native
  trait DeleteTrafficPolicyInstanceRequest extends js.Object {
    var Id: js.UndefOr[TrafficPolicyInstanceId]
  }

  object DeleteTrafficPolicyInstanceRequest {
    def apply(
      Id: js.UndefOr[TrafficPolicyInstanceId] = js.undefined): DeleteTrafficPolicyInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTrafficPolicyInstanceRequest]
    }
  }

  /**
   * <p>An empty element.</p>
   */
  @js.native
  trait DeleteTrafficPolicyInstanceResponse extends js.Object {

  }

  object DeleteTrafficPolicyInstanceResponse {
    def apply(): DeleteTrafficPolicyInstanceResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTrafficPolicyInstanceResponse]
    }
  }

  /**
   * <p>A request to delete a specified traffic policy version.</p>
   */
  @js.native
  trait DeleteTrafficPolicyRequest extends js.Object {
    var Id: js.UndefOr[TrafficPolicyId]
    var Version: js.UndefOr[TrafficPolicyVersion]
  }

  object DeleteTrafficPolicyRequest {
    def apply(
      Id: js.UndefOr[TrafficPolicyId] = js.undefined,
      Version: js.UndefOr[TrafficPolicyVersion] = js.undefined): DeleteTrafficPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Version" -> Version.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTrafficPolicyRequest]
    }
  }

  /**
   * <p>An empty element.</p>
   */
  @js.native
  trait DeleteTrafficPolicyResponse extends js.Object {

  }

  object DeleteTrafficPolicyResponse {
    def apply(): DeleteTrafficPolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTrafficPolicyResponse]
    }
  }

  /**
   * <p>A complex type that contains information about the request to remove authorization to associate a VPC that was created by one AWS account with a hosted zone that was created with a different AWS account. </p>
   */
  @js.native
  trait DeleteVPCAssociationAuthorizationRequest extends js.Object {
    var HostedZoneId: js.UndefOr[ResourceId]
    var VPC: js.UndefOr[VPC]
  }

  object DeleteVPCAssociationAuthorizationRequest {
    def apply(
      HostedZoneId: js.UndefOr[ResourceId] = js.undefined,
      VPC: js.UndefOr[VPC] = js.undefined): DeleteVPCAssociationAuthorizationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HostedZoneId" -> HostedZoneId.map { x => x.asInstanceOf[js.Any] },
        "VPC" -> VPC.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteVPCAssociationAuthorizationRequest]
    }
  }

  /**
   * <p>Empty response for the request.</p>
   */
  @js.native
  trait DeleteVPCAssociationAuthorizationResponse extends js.Object {

  }

  object DeleteVPCAssociationAuthorizationResponse {
    def apply(): DeleteVPCAssociationAuthorizationResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteVPCAssociationAuthorizationResponse]
    }
  }

  /**
   * <p>For the metric that the CloudWatch alarm is associated with, a complex type that contains information about one dimension.</p>
   */
  @js.native
  trait Dimension extends js.Object {
    var Name: js.UndefOr[DimensionField]
    var Value: js.UndefOr[DimensionField]
  }

  object Dimension {
    def apply(
      Name: js.UndefOr[DimensionField] = js.undefined,
      Value: js.UndefOr[DimensionField] = js.undefined): Dimension = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Dimension]
    }
  }

  /**
   * <p>A complex type that contains information about the VPC that you want to disassociate from a specified private hosted zone.</p>
   */
  @js.native
  trait DisassociateVPCFromHostedZoneRequest extends js.Object {
    var HostedZoneId: js.UndefOr[ResourceId]
    var VPC: js.UndefOr[VPC]
    var Comment: js.UndefOr[DisassociateVPCComment]
  }

  object DisassociateVPCFromHostedZoneRequest {
    def apply(
      HostedZoneId: js.UndefOr[ResourceId] = js.undefined,
      VPC: js.UndefOr[VPC] = js.undefined,
      Comment: js.UndefOr[DisassociateVPCComment] = js.undefined): DisassociateVPCFromHostedZoneRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HostedZoneId" -> HostedZoneId.map { x => x.asInstanceOf[js.Any] },
        "VPC" -> VPC.map { x => x.asInstanceOf[js.Any] },
        "Comment" -> Comment.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateVPCFromHostedZoneRequest]
    }
  }

  /**
   * <p>A complex type that contains the response information for the disassociate request.</p>
   */
  @js.native
  trait DisassociateVPCFromHostedZoneResponse extends js.Object {
    var ChangeInfo: js.UndefOr[ChangeInfo]
  }

  object DisassociateVPCFromHostedZoneResponse {
    def apply(
      ChangeInfo: js.UndefOr[ChangeInfo] = js.undefined): DisassociateVPCFromHostedZoneResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeInfo" -> ChangeInfo.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateVPCFromHostedZoneResponse]
    }
  }

  /**
   * <p>A complex type that contains information about a geographic location.</p>
   */
  @js.native
  trait GeoLocation extends js.Object {
    var ContinentCode: js.UndefOr[GeoLocationContinentCode]
    var CountryCode: js.UndefOr[GeoLocationCountryCode]
    var SubdivisionCode: js.UndefOr[GeoLocationSubdivisionCode]
  }

  object GeoLocation {
    def apply(
      ContinentCode: js.UndefOr[GeoLocationContinentCode] = js.undefined,
      CountryCode: js.UndefOr[GeoLocationCountryCode] = js.undefined,
      SubdivisionCode: js.UndefOr[GeoLocationSubdivisionCode] = js.undefined): GeoLocation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ContinentCode" -> ContinentCode.map { x => x.asInstanceOf[js.Any] },
        "CountryCode" -> CountryCode.map { x => x.asInstanceOf[js.Any] },
        "SubdivisionCode" -> SubdivisionCode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GeoLocation]
    }
  }

  /**
   * <p>A complex type that contains the codes and full continent, country, and subdivision names for the specified <code>geolocation</code> code.</p>
   */
  @js.native
  trait GeoLocationDetails extends js.Object {
    var ContinentCode: js.UndefOr[GeoLocationContinentCode]
    var CountryCode: js.UndefOr[GeoLocationCountryCode]
    var SubdivisionName: js.UndefOr[GeoLocationSubdivisionName]
    var CountryName: js.UndefOr[GeoLocationCountryName]
    var ContinentName: js.UndefOr[GeoLocationContinentName]
    var SubdivisionCode: js.UndefOr[GeoLocationSubdivisionCode]
  }

  object GeoLocationDetails {
    def apply(
      ContinentCode: js.UndefOr[GeoLocationContinentCode] = js.undefined,
      CountryCode: js.UndefOr[GeoLocationCountryCode] = js.undefined,
      SubdivisionName: js.UndefOr[GeoLocationSubdivisionName] = js.undefined,
      CountryName: js.UndefOr[GeoLocationCountryName] = js.undefined,
      ContinentName: js.UndefOr[GeoLocationContinentName] = js.undefined,
      SubdivisionCode: js.UndefOr[GeoLocationSubdivisionCode] = js.undefined): GeoLocationDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ContinentCode" -> ContinentCode.map { x => x.asInstanceOf[js.Any] },
        "CountryCode" -> CountryCode.map { x => x.asInstanceOf[js.Any] },
        "SubdivisionName" -> SubdivisionName.map { x => x.asInstanceOf[js.Any] },
        "CountryName" -> CountryName.map { x => x.asInstanceOf[js.Any] },
        "ContinentName" -> ContinentName.map { x => x.asInstanceOf[js.Any] },
        "SubdivisionCode" -> SubdivisionCode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GeoLocationDetails]
    }
  }

  /**
   * <p>A complex type that contains information about the request to create a hosted zone.</p>
   */
  @js.native
  trait GetAccountLimitRequest extends js.Object {
    var Type: js.UndefOr[AccountLimitType]
  }

  object GetAccountLimitRequest {
    def apply(
      Type: js.UndefOr[AccountLimitType] = js.undefined): GetAccountLimitRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAccountLimitRequest]
    }
  }

  /**
   * <p>A complex type that contains the requested limit. </p>
   */
  @js.native
  trait GetAccountLimitResponse extends js.Object {
    var Limit: js.UndefOr[AccountLimit]
    var Count: js.UndefOr[UsageCount]
  }

  object GetAccountLimitResponse {
    def apply(
      Limit: js.UndefOr[AccountLimit] = js.undefined,
      Count: js.UndefOr[UsageCount] = js.undefined): GetAccountLimitResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "Count" -> Count.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAccountLimitResponse]
    }
  }

  /**
   * <p>The input for a GetChange request.</p>
   */
  @js.native
  trait GetChangeRequest extends js.Object {
    var Id: js.UndefOr[ResourceId]
  }

  object GetChangeRequest {
    def apply(
      Id: js.UndefOr[ResourceId] = js.undefined): GetChangeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetChangeRequest]
    }
  }

  /**
   * <p>A complex type that contains the <code>ChangeInfo</code> element.</p>
   */
  @js.native
  trait GetChangeResponse extends js.Object {
    var ChangeInfo: js.UndefOr[ChangeInfo]
  }

  object GetChangeResponse {
    def apply(
      ChangeInfo: js.UndefOr[ChangeInfo] = js.undefined): GetChangeResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeInfo" -> ChangeInfo.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetChangeResponse]
    }
  }

  @js.native
  trait GetCheckerIpRangesRequest extends js.Object {

  }

  object GetCheckerIpRangesRequest {
    def apply(): GetCheckerIpRangesRequest = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCheckerIpRangesRequest]
    }
  }

  @js.native
  trait GetCheckerIpRangesResponse extends js.Object {
    var CheckerIpRanges: js.UndefOr[CheckerIpRanges]
  }

  object GetCheckerIpRangesResponse {
    def apply(
      CheckerIpRanges: js.UndefOr[CheckerIpRanges] = js.undefined): GetCheckerIpRangesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CheckerIpRanges" -> CheckerIpRanges.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCheckerIpRangesResponse]
    }
  }

  /**
   * <p>A request for information about whether a specified geographic location is supported for Amazon Route 53 geolocation resource record sets.</p>
   */
  @js.native
  trait GetGeoLocationRequest extends js.Object {
    var ContinentCode: js.UndefOr[GeoLocationContinentCode]
    var CountryCode: js.UndefOr[GeoLocationCountryCode]
    var SubdivisionCode: js.UndefOr[GeoLocationSubdivisionCode]
  }

  object GetGeoLocationRequest {
    def apply(
      ContinentCode: js.UndefOr[GeoLocationContinentCode] = js.undefined,
      CountryCode: js.UndefOr[GeoLocationCountryCode] = js.undefined,
      SubdivisionCode: js.UndefOr[GeoLocationSubdivisionCode] = js.undefined): GetGeoLocationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ContinentCode" -> ContinentCode.map { x => x.asInstanceOf[js.Any] },
        "CountryCode" -> CountryCode.map { x => x.asInstanceOf[js.Any] },
        "SubdivisionCode" -> SubdivisionCode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetGeoLocationRequest]
    }
  }

  /**
   * <p>A complex type that contains the response information for the specified geolocation code.</p>
   */
  @js.native
  trait GetGeoLocationResponse extends js.Object {
    var GeoLocationDetails: js.UndefOr[GeoLocationDetails]
  }

  object GetGeoLocationResponse {
    def apply(
      GeoLocationDetails: js.UndefOr[GeoLocationDetails] = js.undefined): GetGeoLocationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GeoLocationDetails" -> GeoLocationDetails.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetGeoLocationResponse]
    }
  }

  /**
   * <p>A request for the number of health checks that are associated with the current AWS account.</p>
   */
  @js.native
  trait GetHealthCheckCountRequest extends js.Object {

  }

  object GetHealthCheckCountRequest {
    def apply(): GetHealthCheckCountRequest = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetHealthCheckCountRequest]
    }
  }

  /**
   * <p>A complex type that contains the response to a <code>GetHealthCheckCount</code> request.</p>
   */
  @js.native
  trait GetHealthCheckCountResponse extends js.Object {
    var HealthCheckCount: js.UndefOr[HealthCheckCount]
  }

  object GetHealthCheckCountResponse {
    def apply(
      HealthCheckCount: js.UndefOr[HealthCheckCount] = js.undefined): GetHealthCheckCountResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HealthCheckCount" -> HealthCheckCount.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetHealthCheckCountResponse]
    }
  }

  /**
   * <p>A request for the reason that a health check failed most recently.</p>
   */
  @js.native
  trait GetHealthCheckLastFailureReasonRequest extends js.Object {
    var HealthCheckId: js.UndefOr[HealthCheckId]
  }

  object GetHealthCheckLastFailureReasonRequest {
    def apply(
      HealthCheckId: js.UndefOr[HealthCheckId] = js.undefined): GetHealthCheckLastFailureReasonRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HealthCheckId" -> HealthCheckId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetHealthCheckLastFailureReasonRequest]
    }
  }

  /**
   * <p>A complex type that contains the response to a <code>GetHealthCheckLastFailureReason</code> request.</p>
   */
  @js.native
  trait GetHealthCheckLastFailureReasonResponse extends js.Object {
    var HealthCheckObservations: js.UndefOr[HealthCheckObservations]
  }

  object GetHealthCheckLastFailureReasonResponse {
    def apply(
      HealthCheckObservations: js.UndefOr[HealthCheckObservations] = js.undefined): GetHealthCheckLastFailureReasonResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HealthCheckObservations" -> HealthCheckObservations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetHealthCheckLastFailureReasonResponse]
    }
  }

  /**
   * <p>A request to get information about a specified health check. </p>
   */
  @js.native
  trait GetHealthCheckRequest extends js.Object {
    var HealthCheckId: js.UndefOr[HealthCheckId]
  }

  object GetHealthCheckRequest {
    def apply(
      HealthCheckId: js.UndefOr[HealthCheckId] = js.undefined): GetHealthCheckRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HealthCheckId" -> HealthCheckId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetHealthCheckRequest]
    }
  }

  /**
   * <p>A complex type that contains the response to a <code>GetHealthCheck</code> request.</p>
   */
  @js.native
  trait GetHealthCheckResponse extends js.Object {
    var HealthCheck: js.UndefOr[HealthCheck]
  }

  object GetHealthCheckResponse {
    def apply(
      HealthCheck: js.UndefOr[HealthCheck] = js.undefined): GetHealthCheckResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HealthCheck" -> HealthCheck.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetHealthCheckResponse]
    }
  }

  /**
   * <p>A request to get the status for a health check.</p>
   */
  @js.native
  trait GetHealthCheckStatusRequest extends js.Object {
    var HealthCheckId: js.UndefOr[HealthCheckId]
  }

  object GetHealthCheckStatusRequest {
    def apply(
      HealthCheckId: js.UndefOr[HealthCheckId] = js.undefined): GetHealthCheckStatusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HealthCheckId" -> HealthCheckId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetHealthCheckStatusRequest]
    }
  }

  /**
   * <p>A complex type that contains the response to a <code>GetHealthCheck</code> request.</p>
   */
  @js.native
  trait GetHealthCheckStatusResponse extends js.Object {
    var HealthCheckObservations: js.UndefOr[HealthCheckObservations]
  }

  object GetHealthCheckStatusResponse {
    def apply(
      HealthCheckObservations: js.UndefOr[HealthCheckObservations] = js.undefined): GetHealthCheckStatusResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HealthCheckObservations" -> HealthCheckObservations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetHealthCheckStatusResponse]
    }
  }

  /**
   * <p>A request to retrieve a count of all the hosted zones that are associated with the current AWS account.</p>
   */
  @js.native
  trait GetHostedZoneCountRequest extends js.Object {

  }

  object GetHostedZoneCountRequest {
    def apply(): GetHostedZoneCountRequest = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetHostedZoneCountRequest]
    }
  }

  /**
   * <p>A complex type that contains the response to a <code>GetHostedZoneCount</code> request.</p>
   */
  @js.native
  trait GetHostedZoneCountResponse extends js.Object {
    var HostedZoneCount: js.UndefOr[HostedZoneCount]
  }

  object GetHostedZoneCountResponse {
    def apply(
      HostedZoneCount: js.UndefOr[HostedZoneCount] = js.undefined): GetHostedZoneCountResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HostedZoneCount" -> HostedZoneCount.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetHostedZoneCountResponse]
    }
  }

  /**
   * <p>A complex type that contains information about the request to create a hosted zone.</p>
   */
  @js.native
  trait GetHostedZoneLimitRequest extends js.Object {
    var Type: js.UndefOr[HostedZoneLimitType]
    var HostedZoneId: js.UndefOr[ResourceId]
  }

  object GetHostedZoneLimitRequest {
    def apply(
      Type: js.UndefOr[HostedZoneLimitType] = js.undefined,
      HostedZoneId: js.UndefOr[ResourceId] = js.undefined): GetHostedZoneLimitRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] },
        "HostedZoneId" -> HostedZoneId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetHostedZoneLimitRequest]
    }
  }

  /**
   * <p>A complex type that contains the requested limit. </p>
   */
  @js.native
  trait GetHostedZoneLimitResponse extends js.Object {
    var Limit: js.UndefOr[HostedZoneLimit]
    var Count: js.UndefOr[UsageCount]
  }

  object GetHostedZoneLimitResponse {
    def apply(
      Limit: js.UndefOr[HostedZoneLimit] = js.undefined,
      Count: js.UndefOr[UsageCount] = js.undefined): GetHostedZoneLimitResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "Count" -> Count.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetHostedZoneLimitResponse]
    }
  }

  /**
   * <p>A request to get information about a specified hosted zone. </p>
   */
  @js.native
  trait GetHostedZoneRequest extends js.Object {
    var Id: js.UndefOr[ResourceId]
  }

  object GetHostedZoneRequest {
    def apply(
      Id: js.UndefOr[ResourceId] = js.undefined): GetHostedZoneRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetHostedZoneRequest]
    }
  }

  /**
   * <p>A complex type that contain the response to a <code>GetHostedZone</code> request.</p>
   */
  @js.native
  trait GetHostedZoneResponse extends js.Object {
    var HostedZone: js.UndefOr[HostedZone]
    var DelegationSet: js.UndefOr[DelegationSet]
    var VPCs: js.UndefOr[VPCs]
  }

  object GetHostedZoneResponse {
    def apply(
      HostedZone: js.UndefOr[HostedZone] = js.undefined,
      DelegationSet: js.UndefOr[DelegationSet] = js.undefined,
      VPCs: js.UndefOr[VPCs] = js.undefined): GetHostedZoneResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HostedZone" -> HostedZone.map { x => x.asInstanceOf[js.Any] },
        "DelegationSet" -> DelegationSet.map { x => x.asInstanceOf[js.Any] },
        "VPCs" -> VPCs.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetHostedZoneResponse]
    }
  }

  @js.native
  trait GetQueryLoggingConfigRequest extends js.Object {
    var Id: js.UndefOr[QueryLoggingConfigId]
  }

  object GetQueryLoggingConfigRequest {
    def apply(
      Id: js.UndefOr[QueryLoggingConfigId] = js.undefined): GetQueryLoggingConfigRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetQueryLoggingConfigRequest]
    }
  }

  @js.native
  trait GetQueryLoggingConfigResponse extends js.Object {
    var QueryLoggingConfig: js.UndefOr[QueryLoggingConfig]
  }

  object GetQueryLoggingConfigResponse {
    def apply(
      QueryLoggingConfig: js.UndefOr[QueryLoggingConfig] = js.undefined): GetQueryLoggingConfigResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QueryLoggingConfig" -> QueryLoggingConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetQueryLoggingConfigResponse]
    }
  }

  /**
   * <p>A complex type that contains information about the request to create a hosted zone.</p>
   */
  @js.native
  trait GetReusableDelegationSetLimitRequest extends js.Object {
    var Type: js.UndefOr[ReusableDelegationSetLimitType]
    var DelegationSetId: js.UndefOr[ResourceId]
  }

  object GetReusableDelegationSetLimitRequest {
    def apply(
      Type: js.UndefOr[ReusableDelegationSetLimitType] = js.undefined,
      DelegationSetId: js.UndefOr[ResourceId] = js.undefined): GetReusableDelegationSetLimitRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] },
        "DelegationSetId" -> DelegationSetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetReusableDelegationSetLimitRequest]
    }
  }

  /**
   * <p>A complex type that contains the requested limit. </p>
   */
  @js.native
  trait GetReusableDelegationSetLimitResponse extends js.Object {
    var Limit: js.UndefOr[ReusableDelegationSetLimit]
    var Count: js.UndefOr[UsageCount]
  }

  object GetReusableDelegationSetLimitResponse {
    def apply(
      Limit: js.UndefOr[ReusableDelegationSetLimit] = js.undefined,
      Count: js.UndefOr[UsageCount] = js.undefined): GetReusableDelegationSetLimitResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "Count" -> Count.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetReusableDelegationSetLimitResponse]
    }
  }

  /**
   * <p>A request to get information about a specified reusable delegation set.</p>
   */
  @js.native
  trait GetReusableDelegationSetRequest extends js.Object {
    var Id: js.UndefOr[ResourceId]
  }

  object GetReusableDelegationSetRequest {
    def apply(
      Id: js.UndefOr[ResourceId] = js.undefined): GetReusableDelegationSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetReusableDelegationSetRequest]
    }
  }

  /**
   * <p>A complex type that contains the response to the <code>GetReusableDelegationSet</code> request.</p>
   */
  @js.native
  trait GetReusableDelegationSetResponse extends js.Object {
    var DelegationSet: js.UndefOr[DelegationSet]
  }

  object GetReusableDelegationSetResponse {
    def apply(
      DelegationSet: js.UndefOr[DelegationSet] = js.undefined): GetReusableDelegationSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DelegationSet" -> DelegationSet.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetReusableDelegationSetResponse]
    }
  }

  /**
   * <p>Request to get the number of traffic policy instances that are associated with the current AWS account.</p>
   */
  @js.native
  trait GetTrafficPolicyInstanceCountRequest extends js.Object {

  }

  object GetTrafficPolicyInstanceCountRequest {
    def apply(): GetTrafficPolicyInstanceCountRequest = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTrafficPolicyInstanceCountRequest]
    }
  }

  /**
   * <p>A complex type that contains information about the resource record sets that Amazon Route 53 created based on a specified traffic policy.</p>
   */
  @js.native
  trait GetTrafficPolicyInstanceCountResponse extends js.Object {
    var TrafficPolicyInstanceCount: js.UndefOr[TrafficPolicyInstanceCount]
  }

  object GetTrafficPolicyInstanceCountResponse {
    def apply(
      TrafficPolicyInstanceCount: js.UndefOr[TrafficPolicyInstanceCount] = js.undefined): GetTrafficPolicyInstanceCountResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TrafficPolicyInstanceCount" -> TrafficPolicyInstanceCount.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTrafficPolicyInstanceCountResponse]
    }
  }

  /**
   * <p>Gets information about a specified traffic policy instance.</p>
   */
  @js.native
  trait GetTrafficPolicyInstanceRequest extends js.Object {
    var Id: js.UndefOr[TrafficPolicyInstanceId]
  }

  object GetTrafficPolicyInstanceRequest {
    def apply(
      Id: js.UndefOr[TrafficPolicyInstanceId] = js.undefined): GetTrafficPolicyInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTrafficPolicyInstanceRequest]
    }
  }

  /**
   * <p>A complex type that contains information about the resource record sets that Amazon Route 53 created based on a specified traffic policy.</p>
   */
  @js.native
  trait GetTrafficPolicyInstanceResponse extends js.Object {
    var TrafficPolicyInstance: js.UndefOr[TrafficPolicyInstance]
  }

  object GetTrafficPolicyInstanceResponse {
    def apply(
      TrafficPolicyInstance: js.UndefOr[TrafficPolicyInstance] = js.undefined): GetTrafficPolicyInstanceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TrafficPolicyInstance" -> TrafficPolicyInstance.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTrafficPolicyInstanceResponse]
    }
  }

  /**
   * <p>Gets information about a specific traffic policy version.</p>
   */
  @js.native
  trait GetTrafficPolicyRequest extends js.Object {
    var Id: js.UndefOr[TrafficPolicyId]
    var Version: js.UndefOr[TrafficPolicyVersion]
  }

  object GetTrafficPolicyRequest {
    def apply(
      Id: js.UndefOr[TrafficPolicyId] = js.undefined,
      Version: js.UndefOr[TrafficPolicyVersion] = js.undefined): GetTrafficPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Version" -> Version.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTrafficPolicyRequest]
    }
  }

  /**
   * <p>A complex type that contains the response information for the request.</p>
   */
  @js.native
  trait GetTrafficPolicyResponse extends js.Object {
    var TrafficPolicy: js.UndefOr[TrafficPolicy]
  }

  object GetTrafficPolicyResponse {
    def apply(
      TrafficPolicy: js.UndefOr[TrafficPolicy] = js.undefined): GetTrafficPolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TrafficPolicy" -> TrafficPolicy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTrafficPolicyResponse]
    }
  }

  /**
   * <p>A complex type that contains information about one health check that is associated with the current AWS account.</p>
   */
  @js.native
  trait HealthCheck extends js.Object {
    var Id: js.UndefOr[HealthCheckId]
    var HealthCheckVersion: js.UndefOr[HealthCheckVersion]
    var CallerReference: js.UndefOr[HealthCheckNonce]
    var LinkedService: js.UndefOr[LinkedService]
    var CloudWatchAlarmConfiguration: js.UndefOr[CloudWatchAlarmConfiguration]
    var HealthCheckConfig: js.UndefOr[HealthCheckConfig]
  }

  object HealthCheck {
    def apply(
      Id: js.UndefOr[HealthCheckId] = js.undefined,
      HealthCheckVersion: js.UndefOr[HealthCheckVersion] = js.undefined,
      CallerReference: js.UndefOr[HealthCheckNonce] = js.undefined,
      LinkedService: js.UndefOr[LinkedService] = js.undefined,
      CloudWatchAlarmConfiguration: js.UndefOr[CloudWatchAlarmConfiguration] = js.undefined,
      HealthCheckConfig: js.UndefOr[HealthCheckConfig] = js.undefined): HealthCheck = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "HealthCheckVersion" -> HealthCheckVersion.map { x => x.asInstanceOf[js.Any] },
        "CallerReference" -> CallerReference.map { x => x.asInstanceOf[js.Any] },
        "LinkedService" -> LinkedService.map { x => x.asInstanceOf[js.Any] },
        "CloudWatchAlarmConfiguration" -> CloudWatchAlarmConfiguration.map { x => x.asInstanceOf[js.Any] },
        "HealthCheckConfig" -> HealthCheckConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HealthCheck]
    }
  }

  /**
   * <p>A complex type that contains information about the health check.</p>
   */
  @js.native
  trait HealthCheckConfig extends js.Object {
    var IPAddress: js.UndefOr[IPAddress]
    var ResourcePath: js.UndefOr[ResourcePath]
    var Regions: js.UndefOr[HealthCheckRegionList]
    var AlarmIdentifier: js.UndefOr[AlarmIdentifier]
    var FullyQualifiedDomainName: js.UndefOr[FullyQualifiedDomainName]
    var SearchString: js.UndefOr[SearchString]
    var EnableSNI: js.UndefOr[EnableSNI]
    var InsufficientDataHealthStatus: js.UndefOr[InsufficientDataHealthStatus]
    var Port: js.UndefOr[Port]
    var MeasureLatency: js.UndefOr[MeasureLatency]
    var RequestInterval: js.UndefOr[RequestInterval]
    var Disabled: js.UndefOr[Disabled]
    var Inverted: js.UndefOr[Inverted]
    var FailureThreshold: js.UndefOr[FailureThreshold]
    var ChildHealthChecks: js.UndefOr[ChildHealthCheckList]
    var HealthThreshold: js.UndefOr[HealthThreshold]
    var Type: js.UndefOr[HealthCheckType]
  }

  object HealthCheckConfig {
    def apply(
      IPAddress: js.UndefOr[IPAddress] = js.undefined,
      ResourcePath: js.UndefOr[ResourcePath] = js.undefined,
      Regions: js.UndefOr[HealthCheckRegionList] = js.undefined,
      AlarmIdentifier: js.UndefOr[AlarmIdentifier] = js.undefined,
      FullyQualifiedDomainName: js.UndefOr[FullyQualifiedDomainName] = js.undefined,
      SearchString: js.UndefOr[SearchString] = js.undefined,
      EnableSNI: js.UndefOr[EnableSNI] = js.undefined,
      InsufficientDataHealthStatus: js.UndefOr[InsufficientDataHealthStatus] = js.undefined,
      Port: js.UndefOr[Port] = js.undefined,
      MeasureLatency: js.UndefOr[MeasureLatency] = js.undefined,
      RequestInterval: js.UndefOr[RequestInterval] = js.undefined,
      Disabled: js.UndefOr[Disabled] = js.undefined,
      Inverted: js.UndefOr[Inverted] = js.undefined,
      FailureThreshold: js.UndefOr[FailureThreshold] = js.undefined,
      ChildHealthChecks: js.UndefOr[ChildHealthCheckList] = js.undefined,
      HealthThreshold: js.UndefOr[HealthThreshold] = js.undefined,
      Type: js.UndefOr[HealthCheckType] = js.undefined): HealthCheckConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IPAddress" -> IPAddress.map { x => x.asInstanceOf[js.Any] },
        "ResourcePath" -> ResourcePath.map { x => x.asInstanceOf[js.Any] },
        "Regions" -> Regions.map { x => x.asInstanceOf[js.Any] },
        "AlarmIdentifier" -> AlarmIdentifier.map { x => x.asInstanceOf[js.Any] },
        "FullyQualifiedDomainName" -> FullyQualifiedDomainName.map { x => x.asInstanceOf[js.Any] },
        "SearchString" -> SearchString.map { x => x.asInstanceOf[js.Any] },
        "EnableSNI" -> EnableSNI.map { x => x.asInstanceOf[js.Any] },
        "InsufficientDataHealthStatus" -> InsufficientDataHealthStatus.map { x => x.asInstanceOf[js.Any] },
        "Port" -> Port.map { x => x.asInstanceOf[js.Any] },
        "MeasureLatency" -> MeasureLatency.map { x => x.asInstanceOf[js.Any] },
        "RequestInterval" -> RequestInterval.map { x => x.asInstanceOf[js.Any] },
        "Disabled" -> Disabled.map { x => x.asInstanceOf[js.Any] },
        "Inverted" -> Inverted.map { x => x.asInstanceOf[js.Any] },
        "FailureThreshold" -> FailureThreshold.map { x => x.asInstanceOf[js.Any] },
        "ChildHealthChecks" -> ChildHealthChecks.map { x => x.asInstanceOf[js.Any] },
        "HealthThreshold" -> HealthThreshold.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HealthCheckConfig]
    }
  }

  /**
   * <p>A complex type that contains the last failure reason as reported by one Amazon Route 53 health checker.</p>
   */
  @js.native
  trait HealthCheckObservation extends js.Object {
    var Region: js.UndefOr[HealthCheckRegion]
    var IPAddress: js.UndefOr[IPAddress]
    var StatusReport: js.UndefOr[StatusReport]
  }

  object HealthCheckObservation {
    def apply(
      Region: js.UndefOr[HealthCheckRegion] = js.undefined,
      IPAddress: js.UndefOr[IPAddress] = js.undefined,
      StatusReport: js.UndefOr[StatusReport] = js.undefined): HealthCheckObservation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Region" -> Region.map { x => x.asInstanceOf[js.Any] },
        "IPAddress" -> IPAddress.map { x => x.asInstanceOf[js.Any] },
        "StatusReport" -> StatusReport.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HealthCheckObservation]
    }
  }

  object HealthCheckRegionEnum {
    val `us-east-1` = "us-east-1"
    val `us-west-1` = "us-west-1"
    val `us-west-2` = "us-west-2"
    val `eu-west-1` = "eu-west-1"
    val `ap-southeast-1` = "ap-southeast-1"
    val `ap-southeast-2` = "ap-southeast-2"
    val `ap-northeast-1` = "ap-northeast-1"
    val `sa-east-1` = "sa-east-1"

    val values = IndexedSeq(`us-east-1`, `us-west-1`, `us-west-2`, `eu-west-1`, `ap-southeast-1`, `ap-southeast-2`, `ap-northeast-1`, `sa-east-1`)
  }

  object HealthCheckTypeEnum {
    val HTTP = "HTTP"
    val HTTPS = "HTTPS"
    val HTTP_STR_MATCH = "HTTP_STR_MATCH"
    val HTTPS_STR_MATCH = "HTTPS_STR_MATCH"
    val TCP = "TCP"
    val CALCULATED = "CALCULATED"
    val CLOUDWATCH_METRIC = "CLOUDWATCH_METRIC"

    val values = IndexedSeq(HTTP, HTTPS, HTTP_STR_MATCH, HTTPS_STR_MATCH, TCP, CALCULATED, CLOUDWATCH_METRIC)
  }

  /**
   * <p>A complex type that contains general information about the hosted zone.</p>
   */
  @js.native
  trait HostedZone extends js.Object {
    var Id: js.UndefOr[ResourceId]
    var Name: js.UndefOr[DNSName]
    var CallerReference: js.UndefOr[Nonce]
    var LinkedService: js.UndefOr[LinkedService]
    var ResourceRecordSetCount: js.UndefOr[HostedZoneRRSetCount]
    var Config: js.UndefOr[HostedZoneConfig]
  }

  object HostedZone {
    def apply(
      Id: js.UndefOr[ResourceId] = js.undefined,
      Name: js.UndefOr[DNSName] = js.undefined,
      CallerReference: js.UndefOr[Nonce] = js.undefined,
      LinkedService: js.UndefOr[LinkedService] = js.undefined,
      ResourceRecordSetCount: js.UndefOr[HostedZoneRRSetCount] = js.undefined,
      Config: js.UndefOr[HostedZoneConfig] = js.undefined): HostedZone = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "CallerReference" -> CallerReference.map { x => x.asInstanceOf[js.Any] },
        "LinkedService" -> LinkedService.map { x => x.asInstanceOf[js.Any] },
        "ResourceRecordSetCount" -> ResourceRecordSetCount.map { x => x.asInstanceOf[js.Any] },
        "Config" -> Config.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HostedZone]
    }
  }

  /**
   * <p>A complex type that contains an optional comment about your hosted zone. If you don't want to specify a comment, omit both the <code>HostedZoneConfig</code> and <code>Comment</code> elements.</p>
   */
  @js.native
  trait HostedZoneConfig extends js.Object {
    var Comment: js.UndefOr[ResourceDescription]
    var PrivateZone: js.UndefOr[IsPrivateZone]
  }

  object HostedZoneConfig {
    def apply(
      Comment: js.UndefOr[ResourceDescription] = js.undefined,
      PrivateZone: js.UndefOr[IsPrivateZone] = js.undefined): HostedZoneConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Comment" -> Comment.map { x => x.asInstanceOf[js.Any] },
        "PrivateZone" -> PrivateZone.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HostedZoneConfig]
    }
  }

  /**
   * <p>A complex type that contains the type of limit that you specified in the request and the current value for that limit.</p>
   */
  @js.native
  trait HostedZoneLimit extends js.Object {
    var Type: js.UndefOr[HostedZoneLimitType]
    var Value: js.UndefOr[LimitValue]
  }

  object HostedZoneLimit {
    def apply(
      Type: js.UndefOr[HostedZoneLimitType] = js.undefined,
      Value: js.UndefOr[LimitValue] = js.undefined): HostedZoneLimit = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HostedZoneLimit]
    }
  }

  object HostedZoneLimitTypeEnum {
    val MAX_RRSETS_BY_ZONE = "MAX_RRSETS_BY_ZONE"
    val MAX_VPCS_ASSOCIATED_BY_ZONE = "MAX_VPCS_ASSOCIATED_BY_ZONE"

    val values = IndexedSeq(MAX_RRSETS_BY_ZONE, MAX_VPCS_ASSOCIATED_BY_ZONE)
  }

  object InsufficientDataHealthStatusEnum {
    val Healthy = "Healthy"
    val Unhealthy = "Unhealthy"
    val LastKnownStatus = "LastKnownStatus"

    val values = IndexedSeq(Healthy, Unhealthy, LastKnownStatus)
  }

  /**
   * <p>If a health check or hosted zone was created by another service, <code>LinkedService</code> is a complex type that describes the service that created the resource. When a resource is created by another service, you can't edit or delete it using Amazon Route 53. </p>
   */
  @js.native
  trait LinkedService extends js.Object {
    var ServicePrincipal: js.UndefOr[ServicePrincipal]
    var Description: js.UndefOr[ResourceDescription]
  }

  object LinkedService {
    def apply(
      ServicePrincipal: js.UndefOr[ServicePrincipal] = js.undefined,
      Description: js.UndefOr[ResourceDescription] = js.undefined): LinkedService = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServicePrincipal" -> ServicePrincipal.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LinkedService]
    }
  }

  /**
   * <p>A request to get a list of geographic locations that Amazon Route 53 supports for geolocation resource record sets. </p>
   */
  @js.native
  trait ListGeoLocationsRequest extends js.Object {
    var StartContinentCode: js.UndefOr[GeoLocationContinentCode]
    var StartCountryCode: js.UndefOr[GeoLocationCountryCode]
    var StartSubdivisionCode: js.UndefOr[GeoLocationSubdivisionCode]
    var MaxItems: js.UndefOr[PageMaxItems]
  }

  object ListGeoLocationsRequest {
    def apply(
      StartContinentCode: js.UndefOr[GeoLocationContinentCode] = js.undefined,
      StartCountryCode: js.UndefOr[GeoLocationCountryCode] = js.undefined,
      StartSubdivisionCode: js.UndefOr[GeoLocationSubdivisionCode] = js.undefined,
      MaxItems: js.UndefOr[PageMaxItems] = js.undefined): ListGeoLocationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StartContinentCode" -> StartContinentCode.map { x => x.asInstanceOf[js.Any] },
        "StartCountryCode" -> StartCountryCode.map { x => x.asInstanceOf[js.Any] },
        "StartSubdivisionCode" -> StartSubdivisionCode.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListGeoLocationsRequest]
    }
  }

  /**
   * <p>A complex type containing the response information for the request.</p>
   */
  @js.native
  trait ListGeoLocationsResponse extends js.Object {
    var IsTruncated: js.UndefOr[PageTruncated]
    var NextCountryCode: js.UndefOr[GeoLocationCountryCode]
    var GeoLocationDetailsList: js.UndefOr[GeoLocationDetailsList]
    var MaxItems: js.UndefOr[PageMaxItems]
    var NextContinentCode: js.UndefOr[GeoLocationContinentCode]
    var NextSubdivisionCode: js.UndefOr[GeoLocationSubdivisionCode]
  }

  object ListGeoLocationsResponse {
    def apply(
      IsTruncated: js.UndefOr[PageTruncated] = js.undefined,
      NextCountryCode: js.UndefOr[GeoLocationCountryCode] = js.undefined,
      GeoLocationDetailsList: js.UndefOr[GeoLocationDetailsList] = js.undefined,
      MaxItems: js.UndefOr[PageMaxItems] = js.undefined,
      NextContinentCode: js.UndefOr[GeoLocationContinentCode] = js.undefined,
      NextSubdivisionCode: js.UndefOr[GeoLocationSubdivisionCode] = js.undefined): ListGeoLocationsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IsTruncated" -> IsTruncated.map { x => x.asInstanceOf[js.Any] },
        "NextCountryCode" -> NextCountryCode.map { x => x.asInstanceOf[js.Any] },
        "GeoLocationDetailsList" -> GeoLocationDetailsList.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] },
        "NextContinentCode" -> NextContinentCode.map { x => x.asInstanceOf[js.Any] },
        "NextSubdivisionCode" -> NextSubdivisionCode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListGeoLocationsResponse]
    }
  }

  /**
   * <p>A request to retrieve a list of the health checks that are associated with the current AWS account.</p>
   */
  @js.native
  trait ListHealthChecksRequest extends js.Object {
    var Marker: js.UndefOr[PageMarker]
    var MaxItems: js.UndefOr[PageMaxItems]
  }

  object ListHealthChecksRequest {
    def apply(
      Marker: js.UndefOr[PageMarker] = js.undefined,
      MaxItems: js.UndefOr[PageMaxItems] = js.undefined): ListHealthChecksRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListHealthChecksRequest]
    }
  }

  /**
   * <p>A complex type that contains the response to a <code>ListHealthChecks</code> request.</p>
   */
  @js.native
  trait ListHealthChecksResponse extends js.Object {
    var IsTruncated: js.UndefOr[PageTruncated]
    var MaxItems: js.UndefOr[PageMaxItems]
    var NextMarker: js.UndefOr[PageMarker]
    var HealthChecks: js.UndefOr[HealthChecks]
    var Marker: js.UndefOr[PageMarker]
  }

  object ListHealthChecksResponse {
    def apply(
      IsTruncated: js.UndefOr[PageTruncated] = js.undefined,
      MaxItems: js.UndefOr[PageMaxItems] = js.undefined,
      NextMarker: js.UndefOr[PageMarker] = js.undefined,
      HealthChecks: js.UndefOr[HealthChecks] = js.undefined,
      Marker: js.UndefOr[PageMarker] = js.undefined): ListHealthChecksResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IsTruncated" -> IsTruncated.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] },
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] },
        "HealthChecks" -> HealthChecks.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListHealthChecksResponse]
    }
  }

  /**
   * <p>Retrieves a list of the public and private hosted zones that are associated with the current AWS account in ASCII order by domain name. </p>
   */
  @js.native
  trait ListHostedZonesByNameRequest extends js.Object {
    var DNSName: js.UndefOr[DNSName]
    var HostedZoneId: js.UndefOr[ResourceId]
    var MaxItems: js.UndefOr[PageMaxItems]
  }

  object ListHostedZonesByNameRequest {
    def apply(
      DNSName: js.UndefOr[DNSName] = js.undefined,
      HostedZoneId: js.UndefOr[ResourceId] = js.undefined,
      MaxItems: js.UndefOr[PageMaxItems] = js.undefined): ListHostedZonesByNameRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DNSName" -> DNSName.map { x => x.asInstanceOf[js.Any] },
        "HostedZoneId" -> HostedZoneId.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListHostedZonesByNameRequest]
    }
  }

  /**
   * <p>A complex type that contains the response information for the request.</p>
   */
  @js.native
  trait ListHostedZonesByNameResponse extends js.Object {
    var IsTruncated: js.UndefOr[PageTruncated]
    var NextHostedZoneId: js.UndefOr[ResourceId]
    var MaxItems: js.UndefOr[PageMaxItems]
    var NextDNSName: js.UndefOr[DNSName]
    var HostedZones: js.UndefOr[HostedZones]
    var DNSName: js.UndefOr[DNSName]
    var HostedZoneId: js.UndefOr[ResourceId]
  }

  object ListHostedZonesByNameResponse {
    def apply(
      IsTruncated: js.UndefOr[PageTruncated] = js.undefined,
      NextHostedZoneId: js.UndefOr[ResourceId] = js.undefined,
      MaxItems: js.UndefOr[PageMaxItems] = js.undefined,
      NextDNSName: js.UndefOr[DNSName] = js.undefined,
      HostedZones: js.UndefOr[HostedZones] = js.undefined,
      DNSName: js.UndefOr[DNSName] = js.undefined,
      HostedZoneId: js.UndefOr[ResourceId] = js.undefined): ListHostedZonesByNameResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IsTruncated" -> IsTruncated.map { x => x.asInstanceOf[js.Any] },
        "NextHostedZoneId" -> NextHostedZoneId.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] },
        "NextDNSName" -> NextDNSName.map { x => x.asInstanceOf[js.Any] },
        "HostedZones" -> HostedZones.map { x => x.asInstanceOf[js.Any] },
        "DNSName" -> DNSName.map { x => x.asInstanceOf[js.Any] },
        "HostedZoneId" -> HostedZoneId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListHostedZonesByNameResponse]
    }
  }

  /**
   * <p>A request to retrieve a list of the public and private hosted zones that are associated with the current AWS account.</p>
   */
  @js.native
  trait ListHostedZonesRequest extends js.Object {
    var Marker: js.UndefOr[PageMarker]
    var MaxItems: js.UndefOr[PageMaxItems]
    var DelegationSetId: js.UndefOr[ResourceId]
  }

  object ListHostedZonesRequest {
    def apply(
      Marker: js.UndefOr[PageMarker] = js.undefined,
      MaxItems: js.UndefOr[PageMaxItems] = js.undefined,
      DelegationSetId: js.UndefOr[ResourceId] = js.undefined): ListHostedZonesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] },
        "DelegationSetId" -> DelegationSetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListHostedZonesRequest]
    }
  }

  @js.native
  trait ListHostedZonesResponse extends js.Object {
    var IsTruncated: js.UndefOr[PageTruncated]
    var MaxItems: js.UndefOr[PageMaxItems]
    var NextMarker: js.UndefOr[PageMarker]
    var HostedZones: js.UndefOr[HostedZones]
    var Marker: js.UndefOr[PageMarker]
  }

  object ListHostedZonesResponse {
    def apply(
      IsTruncated: js.UndefOr[PageTruncated] = js.undefined,
      MaxItems: js.UndefOr[PageMaxItems] = js.undefined,
      NextMarker: js.UndefOr[PageMarker] = js.undefined,
      HostedZones: js.UndefOr[HostedZones] = js.undefined,
      Marker: js.UndefOr[PageMarker] = js.undefined): ListHostedZonesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IsTruncated" -> IsTruncated.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] },
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] },
        "HostedZones" -> HostedZones.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListHostedZonesResponse]
    }
  }

  @js.native
  trait ListQueryLoggingConfigsRequest extends js.Object {
    var HostedZoneId: js.UndefOr[ResourceId]
    var NextToken: js.UndefOr[PaginationToken]
    var MaxResults: js.UndefOr[MaxResults]
  }

  object ListQueryLoggingConfigsRequest {
    def apply(
      HostedZoneId: js.UndefOr[ResourceId] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined): ListQueryLoggingConfigsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HostedZoneId" -> HostedZoneId.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListQueryLoggingConfigsRequest]
    }
  }

  @js.native
  trait ListQueryLoggingConfigsResponse extends js.Object {
    var QueryLoggingConfigs: js.UndefOr[QueryLoggingConfigs]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListQueryLoggingConfigsResponse {
    def apply(
      QueryLoggingConfigs: js.UndefOr[QueryLoggingConfigs] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined): ListQueryLoggingConfigsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QueryLoggingConfigs" -> QueryLoggingConfigs.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListQueryLoggingConfigsResponse]
    }
  }

  /**
   * <p>A request for the resource record sets that are associated with a specified hosted zone.</p>
   */
  @js.native
  trait ListResourceRecordSetsRequest extends js.Object {
    var StartRecordType: js.UndefOr[RRType]
    var MaxItems: js.UndefOr[PageMaxItems]
    var StartRecordIdentifier: js.UndefOr[ResourceRecordSetIdentifier]
    var StartRecordName: js.UndefOr[DNSName]
    var HostedZoneId: js.UndefOr[ResourceId]
  }

  object ListResourceRecordSetsRequest {
    def apply(
      StartRecordType: js.UndefOr[RRType] = js.undefined,
      MaxItems: js.UndefOr[PageMaxItems] = js.undefined,
      StartRecordIdentifier: js.UndefOr[ResourceRecordSetIdentifier] = js.undefined,
      StartRecordName: js.UndefOr[DNSName] = js.undefined,
      HostedZoneId: js.UndefOr[ResourceId] = js.undefined): ListResourceRecordSetsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StartRecordType" -> StartRecordType.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] },
        "StartRecordIdentifier" -> StartRecordIdentifier.map { x => x.asInstanceOf[js.Any] },
        "StartRecordName" -> StartRecordName.map { x => x.asInstanceOf[js.Any] },
        "HostedZoneId" -> HostedZoneId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListResourceRecordSetsRequest]
    }
  }

  /**
   * <p>A complex type that contains list information for the resource record set.</p>
   */
  @js.native
  trait ListResourceRecordSetsResponse extends js.Object {
    var IsTruncated: js.UndefOr[PageTruncated]
    var NextRecordName: js.UndefOr[DNSName]
    var NextRecordIdentifier: js.UndefOr[ResourceRecordSetIdentifier]
    var ResourceRecordSets: js.UndefOr[ResourceRecordSets]
    var MaxItems: js.UndefOr[PageMaxItems]
    var NextRecordType: js.UndefOr[RRType]
  }

  object ListResourceRecordSetsResponse {
    def apply(
      IsTruncated: js.UndefOr[PageTruncated] = js.undefined,
      NextRecordName: js.UndefOr[DNSName] = js.undefined,
      NextRecordIdentifier: js.UndefOr[ResourceRecordSetIdentifier] = js.undefined,
      ResourceRecordSets: js.UndefOr[ResourceRecordSets] = js.undefined,
      MaxItems: js.UndefOr[PageMaxItems] = js.undefined,
      NextRecordType: js.UndefOr[RRType] = js.undefined): ListResourceRecordSetsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IsTruncated" -> IsTruncated.map { x => x.asInstanceOf[js.Any] },
        "NextRecordName" -> NextRecordName.map { x => x.asInstanceOf[js.Any] },
        "NextRecordIdentifier" -> NextRecordIdentifier.map { x => x.asInstanceOf[js.Any] },
        "ResourceRecordSets" -> ResourceRecordSets.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] },
        "NextRecordType" -> NextRecordType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListResourceRecordSetsResponse]
    }
  }

  /**
   * <p>A request to get a list of the reusable delegation sets that are associated with the current AWS account.</p>
   */
  @js.native
  trait ListReusableDelegationSetsRequest extends js.Object {
    var Marker: js.UndefOr[PageMarker]
    var MaxItems: js.UndefOr[PageMaxItems]
  }

  object ListReusableDelegationSetsRequest {
    def apply(
      Marker: js.UndefOr[PageMarker] = js.undefined,
      MaxItems: js.UndefOr[PageMaxItems] = js.undefined): ListReusableDelegationSetsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListReusableDelegationSetsRequest]
    }
  }

  /**
   * <p>A complex type that contains information about the reusable delegation sets that are associated with the current AWS account.</p>
   */
  @js.native
  trait ListReusableDelegationSetsResponse extends js.Object {
    var IsTruncated: js.UndefOr[PageTruncated]
    var DelegationSets: js.UndefOr[DelegationSets]
    var MaxItems: js.UndefOr[PageMaxItems]
    var NextMarker: js.UndefOr[PageMarker]
    var Marker: js.UndefOr[PageMarker]
  }

  object ListReusableDelegationSetsResponse {
    def apply(
      IsTruncated: js.UndefOr[PageTruncated] = js.undefined,
      DelegationSets: js.UndefOr[DelegationSets] = js.undefined,
      MaxItems: js.UndefOr[PageMaxItems] = js.undefined,
      NextMarker: js.UndefOr[PageMarker] = js.undefined,
      Marker: js.UndefOr[PageMarker] = js.undefined): ListReusableDelegationSetsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IsTruncated" -> IsTruncated.map { x => x.asInstanceOf[js.Any] },
        "DelegationSets" -> DelegationSets.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] },
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListReusableDelegationSetsResponse]
    }
  }

  /**
   * <p>A complex type containing information about a request for a list of the tags that are associated with an individual resource.</p>
   */
  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceType: js.UndefOr[TagResourceType]
    var ResourceId: js.UndefOr[TagResourceId]
  }

  object ListTagsForResourceRequest {
    def apply(
      ResourceType: js.UndefOr[TagResourceType] = js.undefined,
      ResourceId: js.UndefOr[TagResourceId] = js.undefined): ListTagsForResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceType" -> ResourceType.map { x => x.asInstanceOf[js.Any] },
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceRequest]
    }
  }

  /**
   * <p>A complex type that contains information about the health checks or hosted zones for which you want to list tags.</p>
   */
  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var ResourceTagSet: js.UndefOr[ResourceTagSet]
  }

  object ListTagsForResourceResponse {
    def apply(
      ResourceTagSet: js.UndefOr[ResourceTagSet] = js.undefined): ListTagsForResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceTagSet" -> ResourceTagSet.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /**
   * <p>A complex type that contains information about the health checks or hosted zones for which you want to list tags.</p>
   */
  @js.native
  trait ListTagsForResourcesRequest extends js.Object {
    var ResourceType: js.UndefOr[TagResourceType]
    var ResourceIds: js.UndefOr[TagResourceIdList]
  }

  object ListTagsForResourcesRequest {
    def apply(
      ResourceType: js.UndefOr[TagResourceType] = js.undefined,
      ResourceIds: js.UndefOr[TagResourceIdList] = js.undefined): ListTagsForResourcesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceType" -> ResourceType.map { x => x.asInstanceOf[js.Any] },
        "ResourceIds" -> ResourceIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourcesRequest]
    }
  }

  /**
   * <p>A complex type containing tags for the specified resources.</p>
   */
  @js.native
  trait ListTagsForResourcesResponse extends js.Object {
    var ResourceTagSets: js.UndefOr[ResourceTagSetList]
  }

  object ListTagsForResourcesResponse {
    def apply(
      ResourceTagSets: js.UndefOr[ResourceTagSetList] = js.undefined): ListTagsForResourcesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceTagSets" -> ResourceTagSets.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourcesResponse]
    }
  }

  /**
   * <p>A complex type that contains the information about the request to list the traffic policies that are associated with the current AWS account.</p>
   */
  @js.native
  trait ListTrafficPoliciesRequest extends js.Object {
    var TrafficPolicyIdMarker: js.UndefOr[TrafficPolicyId]
    var MaxItems: js.UndefOr[PageMaxItems]
  }

  object ListTrafficPoliciesRequest {
    def apply(
      TrafficPolicyIdMarker: js.UndefOr[TrafficPolicyId] = js.undefined,
      MaxItems: js.UndefOr[PageMaxItems] = js.undefined): ListTrafficPoliciesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TrafficPolicyIdMarker" -> TrafficPolicyIdMarker.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTrafficPoliciesRequest]
    }
  }

  /**
   * <p>A complex type that contains the response information for the request.</p>
   */
  @js.native
  trait ListTrafficPoliciesResponse extends js.Object {
    var TrafficPolicySummaries: js.UndefOr[TrafficPolicySummaries]
    var IsTruncated: js.UndefOr[PageTruncated]
    var TrafficPolicyIdMarker: js.UndefOr[TrafficPolicyId]
    var MaxItems: js.UndefOr[PageMaxItems]
  }

  object ListTrafficPoliciesResponse {
    def apply(
      TrafficPolicySummaries: js.UndefOr[TrafficPolicySummaries] = js.undefined,
      IsTruncated: js.UndefOr[PageTruncated] = js.undefined,
      TrafficPolicyIdMarker: js.UndefOr[TrafficPolicyId] = js.undefined,
      MaxItems: js.UndefOr[PageMaxItems] = js.undefined): ListTrafficPoliciesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TrafficPolicySummaries" -> TrafficPolicySummaries.map { x => x.asInstanceOf[js.Any] },
        "IsTruncated" -> IsTruncated.map { x => x.asInstanceOf[js.Any] },
        "TrafficPolicyIdMarker" -> TrafficPolicyIdMarker.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTrafficPoliciesResponse]
    }
  }

  /**
   * <p>A request for the traffic policy instances that you created in a specified hosted zone.</p>
   */
  @js.native
  trait ListTrafficPolicyInstancesByHostedZoneRequest extends js.Object {
    var HostedZoneId: js.UndefOr[ResourceId]
    var TrafficPolicyInstanceNameMarker: js.UndefOr[DNSName]
    var TrafficPolicyInstanceTypeMarker: js.UndefOr[RRType]
    var MaxItems: js.UndefOr[PageMaxItems]
  }

  object ListTrafficPolicyInstancesByHostedZoneRequest {
    def apply(
      HostedZoneId: js.UndefOr[ResourceId] = js.undefined,
      TrafficPolicyInstanceNameMarker: js.UndefOr[DNSName] = js.undefined,
      TrafficPolicyInstanceTypeMarker: js.UndefOr[RRType] = js.undefined,
      MaxItems: js.UndefOr[PageMaxItems] = js.undefined): ListTrafficPolicyInstancesByHostedZoneRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HostedZoneId" -> HostedZoneId.map { x => x.asInstanceOf[js.Any] },
        "TrafficPolicyInstanceNameMarker" -> TrafficPolicyInstanceNameMarker.map { x => x.asInstanceOf[js.Any] },
        "TrafficPolicyInstanceTypeMarker" -> TrafficPolicyInstanceTypeMarker.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTrafficPolicyInstancesByHostedZoneRequest]
    }
  }

  /**
   * <p>A complex type that contains the response information for the request.</p>
   */
  @js.native
  trait ListTrafficPolicyInstancesByHostedZoneResponse extends js.Object {
    var IsTruncated: js.UndefOr[PageTruncated]
    var TrafficPolicyInstanceTypeMarker: js.UndefOr[RRType]
    var MaxItems: js.UndefOr[PageMaxItems]
    var TrafficPolicyInstances: js.UndefOr[TrafficPolicyInstances]
    var TrafficPolicyInstanceNameMarker: js.UndefOr[DNSName]
  }

  object ListTrafficPolicyInstancesByHostedZoneResponse {
    def apply(
      IsTruncated: js.UndefOr[PageTruncated] = js.undefined,
      TrafficPolicyInstanceTypeMarker: js.UndefOr[RRType] = js.undefined,
      MaxItems: js.UndefOr[PageMaxItems] = js.undefined,
      TrafficPolicyInstances: js.UndefOr[TrafficPolicyInstances] = js.undefined,
      TrafficPolicyInstanceNameMarker: js.UndefOr[DNSName] = js.undefined): ListTrafficPolicyInstancesByHostedZoneResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IsTruncated" -> IsTruncated.map { x => x.asInstanceOf[js.Any] },
        "TrafficPolicyInstanceTypeMarker" -> TrafficPolicyInstanceTypeMarker.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] },
        "TrafficPolicyInstances" -> TrafficPolicyInstances.map { x => x.asInstanceOf[js.Any] },
        "TrafficPolicyInstanceNameMarker" -> TrafficPolicyInstanceNameMarker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTrafficPolicyInstancesByHostedZoneResponse]
    }
  }

  /**
   * <p>A complex type that contains the information about the request to list your traffic policy instances.</p>
   */
  @js.native
  trait ListTrafficPolicyInstancesByPolicyRequest extends js.Object {
    var TrafficPolicyInstanceTypeMarker: js.UndefOr[RRType]
    var TrafficPolicyVersion: js.UndefOr[TrafficPolicyVersion]
    var MaxItems: js.UndefOr[PageMaxItems]
    var TrafficPolicyId: js.UndefOr[TrafficPolicyId]
    var HostedZoneIdMarker: js.UndefOr[ResourceId]
    var TrafficPolicyInstanceNameMarker: js.UndefOr[DNSName]
  }

  object ListTrafficPolicyInstancesByPolicyRequest {
    def apply(
      TrafficPolicyInstanceTypeMarker: js.UndefOr[RRType] = js.undefined,
      TrafficPolicyVersion: js.UndefOr[TrafficPolicyVersion] = js.undefined,
      MaxItems: js.UndefOr[PageMaxItems] = js.undefined,
      TrafficPolicyId: js.UndefOr[TrafficPolicyId] = js.undefined,
      HostedZoneIdMarker: js.UndefOr[ResourceId] = js.undefined,
      TrafficPolicyInstanceNameMarker: js.UndefOr[DNSName] = js.undefined): ListTrafficPolicyInstancesByPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TrafficPolicyInstanceTypeMarker" -> TrafficPolicyInstanceTypeMarker.map { x => x.asInstanceOf[js.Any] },
        "TrafficPolicyVersion" -> TrafficPolicyVersion.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] },
        "TrafficPolicyId" -> TrafficPolicyId.map { x => x.asInstanceOf[js.Any] },
        "HostedZoneIdMarker" -> HostedZoneIdMarker.map { x => x.asInstanceOf[js.Any] },
        "TrafficPolicyInstanceNameMarker" -> TrafficPolicyInstanceNameMarker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTrafficPolicyInstancesByPolicyRequest]
    }
  }

  /**
   * <p>A complex type that contains the response information for the request.</p>
   */
  @js.native
  trait ListTrafficPolicyInstancesByPolicyResponse extends js.Object {
    var IsTruncated: js.UndefOr[PageTruncated]
    var TrafficPolicyInstanceTypeMarker: js.UndefOr[RRType]
    var MaxItems: js.UndefOr[PageMaxItems]
    var TrafficPolicyInstances: js.UndefOr[TrafficPolicyInstances]
    var HostedZoneIdMarker: js.UndefOr[ResourceId]
    var TrafficPolicyInstanceNameMarker: js.UndefOr[DNSName]
  }

  object ListTrafficPolicyInstancesByPolicyResponse {
    def apply(
      IsTruncated: js.UndefOr[PageTruncated] = js.undefined,
      TrafficPolicyInstanceTypeMarker: js.UndefOr[RRType] = js.undefined,
      MaxItems: js.UndefOr[PageMaxItems] = js.undefined,
      TrafficPolicyInstances: js.UndefOr[TrafficPolicyInstances] = js.undefined,
      HostedZoneIdMarker: js.UndefOr[ResourceId] = js.undefined,
      TrafficPolicyInstanceNameMarker: js.UndefOr[DNSName] = js.undefined): ListTrafficPolicyInstancesByPolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IsTruncated" -> IsTruncated.map { x => x.asInstanceOf[js.Any] },
        "TrafficPolicyInstanceTypeMarker" -> TrafficPolicyInstanceTypeMarker.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] },
        "TrafficPolicyInstances" -> TrafficPolicyInstances.map { x => x.asInstanceOf[js.Any] },
        "HostedZoneIdMarker" -> HostedZoneIdMarker.map { x => x.asInstanceOf[js.Any] },
        "TrafficPolicyInstanceNameMarker" -> TrafficPolicyInstanceNameMarker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTrafficPolicyInstancesByPolicyResponse]
    }
  }

  /**
   * <p>A request to get information about the traffic policy instances that you created by using the current AWS account.</p>
   */
  @js.native
  trait ListTrafficPolicyInstancesRequest extends js.Object {
    var HostedZoneIdMarker: js.UndefOr[ResourceId]
    var TrafficPolicyInstanceNameMarker: js.UndefOr[DNSName]
    var TrafficPolicyInstanceTypeMarker: js.UndefOr[RRType]
    var MaxItems: js.UndefOr[PageMaxItems]
  }

  object ListTrafficPolicyInstancesRequest {
    def apply(
      HostedZoneIdMarker: js.UndefOr[ResourceId] = js.undefined,
      TrafficPolicyInstanceNameMarker: js.UndefOr[DNSName] = js.undefined,
      TrafficPolicyInstanceTypeMarker: js.UndefOr[RRType] = js.undefined,
      MaxItems: js.UndefOr[PageMaxItems] = js.undefined): ListTrafficPolicyInstancesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HostedZoneIdMarker" -> HostedZoneIdMarker.map { x => x.asInstanceOf[js.Any] },
        "TrafficPolicyInstanceNameMarker" -> TrafficPolicyInstanceNameMarker.map { x => x.asInstanceOf[js.Any] },
        "TrafficPolicyInstanceTypeMarker" -> TrafficPolicyInstanceTypeMarker.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTrafficPolicyInstancesRequest]
    }
  }

  /**
   * <p>A complex type that contains the response information for the request.</p>
   */
  @js.native
  trait ListTrafficPolicyInstancesResponse extends js.Object {
    var IsTruncated: js.UndefOr[PageTruncated]
    var TrafficPolicyInstanceTypeMarker: js.UndefOr[RRType]
    var MaxItems: js.UndefOr[PageMaxItems]
    var TrafficPolicyInstances: js.UndefOr[TrafficPolicyInstances]
    var HostedZoneIdMarker: js.UndefOr[ResourceId]
    var TrafficPolicyInstanceNameMarker: js.UndefOr[DNSName]
  }

  object ListTrafficPolicyInstancesResponse {
    def apply(
      IsTruncated: js.UndefOr[PageTruncated] = js.undefined,
      TrafficPolicyInstanceTypeMarker: js.UndefOr[RRType] = js.undefined,
      MaxItems: js.UndefOr[PageMaxItems] = js.undefined,
      TrafficPolicyInstances: js.UndefOr[TrafficPolicyInstances] = js.undefined,
      HostedZoneIdMarker: js.UndefOr[ResourceId] = js.undefined,
      TrafficPolicyInstanceNameMarker: js.UndefOr[DNSName] = js.undefined): ListTrafficPolicyInstancesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IsTruncated" -> IsTruncated.map { x => x.asInstanceOf[js.Any] },
        "TrafficPolicyInstanceTypeMarker" -> TrafficPolicyInstanceTypeMarker.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] },
        "TrafficPolicyInstances" -> TrafficPolicyInstances.map { x => x.asInstanceOf[js.Any] },
        "HostedZoneIdMarker" -> HostedZoneIdMarker.map { x => x.asInstanceOf[js.Any] },
        "TrafficPolicyInstanceNameMarker" -> TrafficPolicyInstanceNameMarker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTrafficPolicyInstancesResponse]
    }
  }

  /**
   * <p>A complex type that contains the information about the request to list your traffic policies.</p>
   */
  @js.native
  trait ListTrafficPolicyVersionsRequest extends js.Object {
    var Id: js.UndefOr[TrafficPolicyId]
    var TrafficPolicyVersionMarker: js.UndefOr[TrafficPolicyVersionMarker]
    var MaxItems: js.UndefOr[PageMaxItems]
  }

  object ListTrafficPolicyVersionsRequest {
    def apply(
      Id: js.UndefOr[TrafficPolicyId] = js.undefined,
      TrafficPolicyVersionMarker: js.UndefOr[TrafficPolicyVersionMarker] = js.undefined,
      MaxItems: js.UndefOr[PageMaxItems] = js.undefined): ListTrafficPolicyVersionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "TrafficPolicyVersionMarker" -> TrafficPolicyVersionMarker.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTrafficPolicyVersionsRequest]
    }
  }

  /**
   * <p>A complex type that contains the response information for the request.</p>
   */
  @js.native
  trait ListTrafficPolicyVersionsResponse extends js.Object {
    var TrafficPolicies: js.UndefOr[TrafficPolicies]
    var IsTruncated: js.UndefOr[PageTruncated]
    var TrafficPolicyVersionMarker: js.UndefOr[TrafficPolicyVersionMarker]
    var MaxItems: js.UndefOr[PageMaxItems]
  }

  object ListTrafficPolicyVersionsResponse {
    def apply(
      TrafficPolicies: js.UndefOr[TrafficPolicies] = js.undefined,
      IsTruncated: js.UndefOr[PageTruncated] = js.undefined,
      TrafficPolicyVersionMarker: js.UndefOr[TrafficPolicyVersionMarker] = js.undefined,
      MaxItems: js.UndefOr[PageMaxItems] = js.undefined): ListTrafficPolicyVersionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TrafficPolicies" -> TrafficPolicies.map { x => x.asInstanceOf[js.Any] },
        "IsTruncated" -> IsTruncated.map { x => x.asInstanceOf[js.Any] },
        "TrafficPolicyVersionMarker" -> TrafficPolicyVersionMarker.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTrafficPolicyVersionsResponse]
    }
  }

  /**
   * <p>A complex type that contains information about that can be associated with your hosted zone.</p>
   */
  @js.native
  trait ListVPCAssociationAuthorizationsRequest extends js.Object {
    var HostedZoneId: js.UndefOr[ResourceId]
    var NextToken: js.UndefOr[PaginationToken]
    var MaxResults: js.UndefOr[MaxResults]
  }

  object ListVPCAssociationAuthorizationsRequest {
    def apply(
      HostedZoneId: js.UndefOr[ResourceId] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined): ListVPCAssociationAuthorizationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HostedZoneId" -> HostedZoneId.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListVPCAssociationAuthorizationsRequest]
    }
  }

  /**
   * <p>A complex type that contains the response information for the request.</p>
   */
  @js.native
  trait ListVPCAssociationAuthorizationsResponse extends js.Object {
    var HostedZoneId: js.UndefOr[ResourceId]
    var NextToken: js.UndefOr[PaginationToken]
    var VPCs: js.UndefOr[VPCs]
  }

  object ListVPCAssociationAuthorizationsResponse {
    def apply(
      HostedZoneId: js.UndefOr[ResourceId] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined,
      VPCs: js.UndefOr[VPCs] = js.undefined): ListVPCAssociationAuthorizationsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HostedZoneId" -> HostedZoneId.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "VPCs" -> VPCs.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListVPCAssociationAuthorizationsResponse]
    }
  }

  /**
   * <p>A complex type that contains information about a configuration for DNS query logging.</p>
   */
  @js.native
  trait QueryLoggingConfig extends js.Object {
    var Id: js.UndefOr[QueryLoggingConfigId]
    var HostedZoneId: js.UndefOr[ResourceId]
    var CloudWatchLogsLogGroupArn: js.UndefOr[CloudWatchLogsLogGroupArn]
  }

  object QueryLoggingConfig {
    def apply(
      Id: js.UndefOr[QueryLoggingConfigId] = js.undefined,
      HostedZoneId: js.UndefOr[ResourceId] = js.undefined,
      CloudWatchLogsLogGroupArn: js.UndefOr[CloudWatchLogsLogGroupArn] = js.undefined): QueryLoggingConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "HostedZoneId" -> HostedZoneId.map { x => x.asInstanceOf[js.Any] },
        "CloudWatchLogsLogGroupArn" -> CloudWatchLogsLogGroupArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[QueryLoggingConfig]
    }
  }

  object RRTypeEnum {
    val SOA = "SOA"
    val A = "A"
    val TXT = "TXT"
    val NS = "NS"
    val CNAME = "CNAME"
    val MX = "MX"
    val NAPTR = "NAPTR"
    val PTR = "PTR"
    val SRV = "SRV"
    val SPF = "SPF"
    val AAAA = "AAAA"
    val CAA = "CAA"

    val values = IndexedSeq(SOA, A, TXT, NS, CNAME, MX, NAPTR, PTR, SRV, SPF, AAAA, CAA)
  }

  object ResettableElementNameEnum {
    val FullyQualifiedDomainName = "FullyQualifiedDomainName"
    val Regions = "Regions"
    val ResourcePath = "ResourcePath"
    val ChildHealthChecks = "ChildHealthChecks"

    val values = IndexedSeq(FullyQualifiedDomainName, Regions, ResourcePath, ChildHealthChecks)
  }

  /**
   * <p>Information specific to the resource record.</p> <note> <p>If you're creating an alias resource record set, omit <code>ResourceRecord</code>.</p> </note>
   */
  @js.native
  trait ResourceRecord extends js.Object {
    var Value: js.UndefOr[RData]
  }

  object ResourceRecord {
    def apply(
      Value: js.UndefOr[RData] = js.undefined): ResourceRecord = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceRecord]
    }
  }

  /**
   * <p>Information about the resource record set to create or delete.</p>
   */
  @js.native
  trait ResourceRecordSet extends js.Object {
    var Name: js.UndefOr[DNSName]
    var TrafficPolicyInstanceId: js.UndefOr[TrafficPolicyInstanceId]
    var AliasTarget: js.UndefOr[AliasTarget]
    var HealthCheckId: js.UndefOr[HealthCheckId]
    var MultiValueAnswer: js.UndefOr[ResourceRecordSetMultiValueAnswer]
    var Region: js.UndefOr[ResourceRecordSetRegion]
    var Weight: js.UndefOr[ResourceRecordSetWeight]
    var ResourceRecords: js.UndefOr[ResourceRecords]
    var Failover: js.UndefOr[ResourceRecordSetFailover]
    var GeoLocation: js.UndefOr[GeoLocation]
    var SetIdentifier: js.UndefOr[ResourceRecordSetIdentifier]
    var TTL: js.UndefOr[TTL]
    var Type: js.UndefOr[RRType]
  }

  object ResourceRecordSet {
    def apply(
      Name: js.UndefOr[DNSName] = js.undefined,
      TrafficPolicyInstanceId: js.UndefOr[TrafficPolicyInstanceId] = js.undefined,
      AliasTarget: js.UndefOr[AliasTarget] = js.undefined,
      HealthCheckId: js.UndefOr[HealthCheckId] = js.undefined,
      MultiValueAnswer: js.UndefOr[ResourceRecordSetMultiValueAnswer] = js.undefined,
      Region: js.UndefOr[ResourceRecordSetRegion] = js.undefined,
      Weight: js.UndefOr[ResourceRecordSetWeight] = js.undefined,
      ResourceRecords: js.UndefOr[ResourceRecords] = js.undefined,
      Failover: js.UndefOr[ResourceRecordSetFailover] = js.undefined,
      GeoLocation: js.UndefOr[GeoLocation] = js.undefined,
      SetIdentifier: js.UndefOr[ResourceRecordSetIdentifier] = js.undefined,
      TTL: js.UndefOr[TTL] = js.undefined,
      Type: js.UndefOr[RRType] = js.undefined): ResourceRecordSet = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "TrafficPolicyInstanceId" -> TrafficPolicyInstanceId.map { x => x.asInstanceOf[js.Any] },
        "AliasTarget" -> AliasTarget.map { x => x.asInstanceOf[js.Any] },
        "HealthCheckId" -> HealthCheckId.map { x => x.asInstanceOf[js.Any] },
        "MultiValueAnswer" -> MultiValueAnswer.map { x => x.asInstanceOf[js.Any] },
        "Region" -> Region.map { x => x.asInstanceOf[js.Any] },
        "Weight" -> Weight.map { x => x.asInstanceOf[js.Any] },
        "ResourceRecords" -> ResourceRecords.map { x => x.asInstanceOf[js.Any] },
        "Failover" -> Failover.map { x => x.asInstanceOf[js.Any] },
        "GeoLocation" -> GeoLocation.map { x => x.asInstanceOf[js.Any] },
        "SetIdentifier" -> SetIdentifier.map { x => x.asInstanceOf[js.Any] },
        "TTL" -> TTL.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceRecordSet]
    }
  }

  object ResourceRecordSetFailoverEnum {
    val PRIMARY = "PRIMARY"
    val SECONDARY = "SECONDARY"

    val values = IndexedSeq(PRIMARY, SECONDARY)
  }

  object ResourceRecordSetRegionEnum {
    val `us-east-1` = "us-east-1"
    val `us-east-2` = "us-east-2"
    val `us-west-1` = "us-west-1"
    val `us-west-2` = "us-west-2"
    val `ca-central-1` = "ca-central-1"
    val `eu-west-1` = "eu-west-1"
    val `eu-west-2` = "eu-west-2"
    val `eu-west-3` = "eu-west-3"
    val `eu-central-1` = "eu-central-1"
    val `ap-southeast-1` = "ap-southeast-1"
    val `ap-southeast-2` = "ap-southeast-2"
    val `ap-northeast-1` = "ap-northeast-1"
    val `ap-northeast-2` = "ap-northeast-2"
    val `ap-northeast-3` = "ap-northeast-3"
    val `sa-east-1` = "sa-east-1"
    val `cn-north-1` = "cn-north-1"
    val `cn-northwest-1` = "cn-northwest-1"
    val `ap-south-1` = "ap-south-1"

    val values = IndexedSeq(`us-east-1`, `us-east-2`, `us-west-1`, `us-west-2`, `ca-central-1`, `eu-west-1`, `eu-west-2`, `eu-west-3`, `eu-central-1`, `ap-southeast-1`, `ap-southeast-2`, `ap-northeast-1`, `ap-northeast-2`, `ap-northeast-3`, `sa-east-1`, `cn-north-1`, `cn-northwest-1`, `ap-south-1`)
  }

  /**
   * <p>A complex type containing a resource and its associated tags.</p>
   */
  @js.native
  trait ResourceTagSet extends js.Object {
    var ResourceType: js.UndefOr[TagResourceType]
    var ResourceId: js.UndefOr[TagResourceId]
    var Tags: js.UndefOr[TagList]
  }

  object ResourceTagSet {
    def apply(
      ResourceType: js.UndefOr[TagResourceType] = js.undefined,
      ResourceId: js.UndefOr[TagResourceId] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): ResourceTagSet = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceType" -> ResourceType.map { x => x.asInstanceOf[js.Any] },
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceTagSet]
    }
  }

  /**
   * <p>A complex type that contains the type of limit that you specified in the request and the current value for that limit.</p>
   */
  @js.native
  trait ReusableDelegationSetLimit extends js.Object {
    var Type: js.UndefOr[ReusableDelegationSetLimitType]
    var Value: js.UndefOr[LimitValue]
  }

  object ReusableDelegationSetLimit {
    def apply(
      Type: js.UndefOr[ReusableDelegationSetLimitType] = js.undefined,
      Value: js.UndefOr[LimitValue] = js.undefined): ReusableDelegationSetLimit = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReusableDelegationSetLimit]
    }
  }

  object ReusableDelegationSetLimitTypeEnum {
    val MAX_ZONES_BY_REUSABLE_DELEGATION_SET = "MAX_ZONES_BY_REUSABLE_DELEGATION_SET"

    val values = IndexedSeq(MAX_ZONES_BY_REUSABLE_DELEGATION_SET)
  }

  object StatisticEnum {
    val Average = "Average"
    val Sum = "Sum"
    val SampleCount = "SampleCount"
    val Maximum = "Maximum"
    val Minimum = "Minimum"

    val values = IndexedSeq(Average, Sum, SampleCount, Maximum, Minimum)
  }

  /**
   * <p>A complex type that contains the status that one Amazon Route 53 health checker reports and the time of the health check.</p>
   */
  @js.native
  trait StatusReport extends js.Object {
    var Status: js.UndefOr[Status]
    var CheckedTime: js.UndefOr[TimeStamp]
  }

  object StatusReport {
    def apply(
      Status: js.UndefOr[Status] = js.undefined,
      CheckedTime: js.UndefOr[TimeStamp] = js.undefined): StatusReport = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "CheckedTime" -> CheckedTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StatusReport]
    }
  }

  /**
   * <p>A complex type that contains information about a tag that you want to add or edit for the specified health check or hosted zone.</p>
   */
  @js.native
  trait Tag extends js.Object {
    var Key: js.UndefOr[TagKey]
    var Value: js.UndefOr[TagValue]
  }

  object Tag {
    def apply(
      Key: js.UndefOr[TagKey] = js.undefined,
      Value: js.UndefOr[TagValue] = js.undefined): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  object TagResourceTypeEnum {
    val healthcheck = "healthcheck"
    val hostedzone = "hostedzone"

    val values = IndexedSeq(healthcheck, hostedzone)
  }

  /**
   * <p>Gets the value that Amazon Route 53 returns in response to a DNS request for a specified record name and type. You can optionally specify the IP address of a DNS resolver, an EDNS0 client subnet IP address, and a subnet mask. </p>
   */
  @js.native
  trait TestDNSAnswerRequest extends js.Object {
    var EDNS0ClientSubnetIP: js.UndefOr[IPAddress]
    var RecordName: js.UndefOr[DNSName]
    var EDNS0ClientSubnetMask: js.UndefOr[SubnetMask]
    var RecordType: js.UndefOr[RRType]
    var ResolverIP: js.UndefOr[IPAddress]
    var HostedZoneId: js.UndefOr[ResourceId]
  }

  object TestDNSAnswerRequest {
    def apply(
      EDNS0ClientSubnetIP: js.UndefOr[IPAddress] = js.undefined,
      RecordName: js.UndefOr[DNSName] = js.undefined,
      EDNS0ClientSubnetMask: js.UndefOr[SubnetMask] = js.undefined,
      RecordType: js.UndefOr[RRType] = js.undefined,
      ResolverIP: js.UndefOr[IPAddress] = js.undefined,
      HostedZoneId: js.UndefOr[ResourceId] = js.undefined): TestDNSAnswerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EDNS0ClientSubnetIP" -> EDNS0ClientSubnetIP.map { x => x.asInstanceOf[js.Any] },
        "RecordName" -> RecordName.map { x => x.asInstanceOf[js.Any] },
        "EDNS0ClientSubnetMask" -> EDNS0ClientSubnetMask.map { x => x.asInstanceOf[js.Any] },
        "RecordType" -> RecordType.map { x => x.asInstanceOf[js.Any] },
        "ResolverIP" -> ResolverIP.map { x => x.asInstanceOf[js.Any] },
        "HostedZoneId" -> HostedZoneId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TestDNSAnswerRequest]
    }
  }

  /**
   * <p>A complex type that contains the response to a <code>TestDNSAnswer</code> request. </p>
   */
  @js.native
  trait TestDNSAnswerResponse extends js.Object {
    var RecordName: js.UndefOr[DNSName]
    var ResponseCode: js.UndefOr[DNSRCode]
    var RecordData: js.UndefOr[RecordData]
    var Nameserver: js.UndefOr[Nameserver]
    var Protocol: js.UndefOr[TransportProtocol]
    var RecordType: js.UndefOr[RRType]
  }

  object TestDNSAnswerResponse {
    def apply(
      RecordName: js.UndefOr[DNSName] = js.undefined,
      ResponseCode: js.UndefOr[DNSRCode] = js.undefined,
      RecordData: js.UndefOr[RecordData] = js.undefined,
      Nameserver: js.UndefOr[Nameserver] = js.undefined,
      Protocol: js.UndefOr[TransportProtocol] = js.undefined,
      RecordType: js.UndefOr[RRType] = js.undefined): TestDNSAnswerResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RecordName" -> RecordName.map { x => x.asInstanceOf[js.Any] },
        "ResponseCode" -> ResponseCode.map { x => x.asInstanceOf[js.Any] },
        "RecordData" -> RecordData.map { x => x.asInstanceOf[js.Any] },
        "Nameserver" -> Nameserver.map { x => x.asInstanceOf[js.Any] },
        "Protocol" -> Protocol.map { x => x.asInstanceOf[js.Any] },
        "RecordType" -> RecordType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TestDNSAnswerResponse]
    }
  }

  /**
   * <p>A complex type that contains settings for a traffic policy.</p>
   */
  @js.native
  trait TrafficPolicy extends js.Object {
    var Id: js.UndefOr[TrafficPolicyId]
    var Name: js.UndefOr[TrafficPolicyName]
    var Version: js.UndefOr[TrafficPolicyVersion]
    var Comment: js.UndefOr[TrafficPolicyComment]
    var Type: js.UndefOr[RRType]
    var Document: js.UndefOr[TrafficPolicyDocument]
  }

  object TrafficPolicy {
    def apply(
      Id: js.UndefOr[TrafficPolicyId] = js.undefined,
      Name: js.UndefOr[TrafficPolicyName] = js.undefined,
      Version: js.UndefOr[TrafficPolicyVersion] = js.undefined,
      Comment: js.UndefOr[TrafficPolicyComment] = js.undefined,
      Type: js.UndefOr[RRType] = js.undefined,
      Document: js.UndefOr[TrafficPolicyDocument] = js.undefined): TrafficPolicy = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Version" -> Version.map { x => x.asInstanceOf[js.Any] },
        "Comment" -> Comment.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] },
        "Document" -> Document.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TrafficPolicy]
    }
  }

  /**
   * <p>A complex type that contains settings for the new traffic policy instance.</p>
   */
  @js.native
  trait TrafficPolicyInstance extends js.Object {
    var Id: js.UndefOr[TrafficPolicyInstanceId]
    var Name: js.UndefOr[DNSName]
    var TrafficPolicyVersion: js.UndefOr[TrafficPolicyVersion]
    var TrafficPolicyId: js.UndefOr[TrafficPolicyId]
    var Message: js.UndefOr[Message]
    var TrafficPolicyType: js.UndefOr[RRType]
    var State: js.UndefOr[TrafficPolicyInstanceState]
    var TTL: js.UndefOr[TTL]
    var HostedZoneId: js.UndefOr[ResourceId]
  }

  object TrafficPolicyInstance {
    def apply(
      Id: js.UndefOr[TrafficPolicyInstanceId] = js.undefined,
      Name: js.UndefOr[DNSName] = js.undefined,
      TrafficPolicyVersion: js.UndefOr[TrafficPolicyVersion] = js.undefined,
      TrafficPolicyId: js.UndefOr[TrafficPolicyId] = js.undefined,
      Message: js.UndefOr[Message] = js.undefined,
      TrafficPolicyType: js.UndefOr[RRType] = js.undefined,
      State: js.UndefOr[TrafficPolicyInstanceState] = js.undefined,
      TTL: js.UndefOr[TTL] = js.undefined,
      HostedZoneId: js.UndefOr[ResourceId] = js.undefined): TrafficPolicyInstance = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "TrafficPolicyVersion" -> TrafficPolicyVersion.map { x => x.asInstanceOf[js.Any] },
        "TrafficPolicyId" -> TrafficPolicyId.map { x => x.asInstanceOf[js.Any] },
        "Message" -> Message.map { x => x.asInstanceOf[js.Any] },
        "TrafficPolicyType" -> TrafficPolicyType.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] },
        "TTL" -> TTL.map { x => x.asInstanceOf[js.Any] },
        "HostedZoneId" -> HostedZoneId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TrafficPolicyInstance]
    }
  }

  /**
   * <p>A complex type that contains information about the latest version of one traffic policy that is associated with the current AWS account.</p>
   */
  @js.native
  trait TrafficPolicySummary extends js.Object {
    var Id: js.UndefOr[TrafficPolicyId]
    var Name: js.UndefOr[TrafficPolicyName]
    var LatestVersion: js.UndefOr[TrafficPolicyVersion]
    var TrafficPolicyCount: js.UndefOr[TrafficPolicyVersion]
    var Type: js.UndefOr[RRType]
  }

  object TrafficPolicySummary {
    def apply(
      Id: js.UndefOr[TrafficPolicyId] = js.undefined,
      Name: js.UndefOr[TrafficPolicyName] = js.undefined,
      LatestVersion: js.UndefOr[TrafficPolicyVersion] = js.undefined,
      TrafficPolicyCount: js.UndefOr[TrafficPolicyVersion] = js.undefined,
      Type: js.UndefOr[RRType] = js.undefined): TrafficPolicySummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "LatestVersion" -> LatestVersion.map { x => x.asInstanceOf[js.Any] },
        "TrafficPolicyCount" -> TrafficPolicyCount.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TrafficPolicySummary]
    }
  }

  /**
   * <p>A complex type that contains information about a request to update a health check.</p>
   */
  @js.native
  trait UpdateHealthCheckRequest extends js.Object {
    var IPAddress: js.UndefOr[IPAddress]
    var HealthCheckId: js.UndefOr[HealthCheckId]
    var HealthCheckVersion: js.UndefOr[HealthCheckVersion]
    var ResourcePath: js.UndefOr[ResourcePath]
    var Regions: js.UndefOr[HealthCheckRegionList]
    var AlarmIdentifier: js.UndefOr[AlarmIdentifier]
    var FullyQualifiedDomainName: js.UndefOr[FullyQualifiedDomainName]
    var SearchString: js.UndefOr[SearchString]
    var EnableSNI: js.UndefOr[EnableSNI]
    var InsufficientDataHealthStatus: js.UndefOr[InsufficientDataHealthStatus]
    var Port: js.UndefOr[Port]
    var ResetElements: js.UndefOr[ResettableElementNameList]
    var Disabled: js.UndefOr[Disabled]
    var Inverted: js.UndefOr[Inverted]
    var FailureThreshold: js.UndefOr[FailureThreshold]
    var ChildHealthChecks: js.UndefOr[ChildHealthCheckList]
    var HealthThreshold: js.UndefOr[HealthThreshold]
  }

  object UpdateHealthCheckRequest {
    def apply(
      IPAddress: js.UndefOr[IPAddress] = js.undefined,
      HealthCheckId: js.UndefOr[HealthCheckId] = js.undefined,
      HealthCheckVersion: js.UndefOr[HealthCheckVersion] = js.undefined,
      ResourcePath: js.UndefOr[ResourcePath] = js.undefined,
      Regions: js.UndefOr[HealthCheckRegionList] = js.undefined,
      AlarmIdentifier: js.UndefOr[AlarmIdentifier] = js.undefined,
      FullyQualifiedDomainName: js.UndefOr[FullyQualifiedDomainName] = js.undefined,
      SearchString: js.UndefOr[SearchString] = js.undefined,
      EnableSNI: js.UndefOr[EnableSNI] = js.undefined,
      InsufficientDataHealthStatus: js.UndefOr[InsufficientDataHealthStatus] = js.undefined,
      Port: js.UndefOr[Port] = js.undefined,
      ResetElements: js.UndefOr[ResettableElementNameList] = js.undefined,
      Disabled: js.UndefOr[Disabled] = js.undefined,
      Inverted: js.UndefOr[Inverted] = js.undefined,
      FailureThreshold: js.UndefOr[FailureThreshold] = js.undefined,
      ChildHealthChecks: js.UndefOr[ChildHealthCheckList] = js.undefined,
      HealthThreshold: js.UndefOr[HealthThreshold] = js.undefined): UpdateHealthCheckRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IPAddress" -> IPAddress.map { x => x.asInstanceOf[js.Any] },
        "HealthCheckId" -> HealthCheckId.map { x => x.asInstanceOf[js.Any] },
        "HealthCheckVersion" -> HealthCheckVersion.map { x => x.asInstanceOf[js.Any] },
        "ResourcePath" -> ResourcePath.map { x => x.asInstanceOf[js.Any] },
        "Regions" -> Regions.map { x => x.asInstanceOf[js.Any] },
        "AlarmIdentifier" -> AlarmIdentifier.map { x => x.asInstanceOf[js.Any] },
        "FullyQualifiedDomainName" -> FullyQualifiedDomainName.map { x => x.asInstanceOf[js.Any] },
        "SearchString" -> SearchString.map { x => x.asInstanceOf[js.Any] },
        "EnableSNI" -> EnableSNI.map { x => x.asInstanceOf[js.Any] },
        "InsufficientDataHealthStatus" -> InsufficientDataHealthStatus.map { x => x.asInstanceOf[js.Any] },
        "Port" -> Port.map { x => x.asInstanceOf[js.Any] },
        "ResetElements" -> ResetElements.map { x => x.asInstanceOf[js.Any] },
        "Disabled" -> Disabled.map { x => x.asInstanceOf[js.Any] },
        "Inverted" -> Inverted.map { x => x.asInstanceOf[js.Any] },
        "FailureThreshold" -> FailureThreshold.map { x => x.asInstanceOf[js.Any] },
        "ChildHealthChecks" -> ChildHealthChecks.map { x => x.asInstanceOf[js.Any] },
        "HealthThreshold" -> HealthThreshold.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateHealthCheckRequest]
    }
  }

  @js.native
  trait UpdateHealthCheckResponse extends js.Object {
    var HealthCheck: js.UndefOr[HealthCheck]
  }

  object UpdateHealthCheckResponse {
    def apply(
      HealthCheck: js.UndefOr[HealthCheck] = js.undefined): UpdateHealthCheckResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HealthCheck" -> HealthCheck.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateHealthCheckResponse]
    }
  }

  /**
   * <p>A request to update the comment for a hosted zone.</p>
   */
  @js.native
  trait UpdateHostedZoneCommentRequest extends js.Object {
    var Id: js.UndefOr[ResourceId]
    var Comment: js.UndefOr[ResourceDescription]
  }

  object UpdateHostedZoneCommentRequest {
    def apply(
      Id: js.UndefOr[ResourceId] = js.undefined,
      Comment: js.UndefOr[ResourceDescription] = js.undefined): UpdateHostedZoneCommentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Comment" -> Comment.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateHostedZoneCommentRequest]
    }
  }

  /**
   * <p>A complex type that contains the response to the <code>UpdateHostedZoneComment</code> request.</p>
   */
  @js.native
  trait UpdateHostedZoneCommentResponse extends js.Object {
    var HostedZone: js.UndefOr[HostedZone]
  }

  object UpdateHostedZoneCommentResponse {
    def apply(
      HostedZone: js.UndefOr[HostedZone] = js.undefined): UpdateHostedZoneCommentResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HostedZone" -> HostedZone.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateHostedZoneCommentResponse]
    }
  }

  /**
   * <p>A complex type that contains information about the traffic policy that you want to update the comment for.</p>
   */
  @js.native
  trait UpdateTrafficPolicyCommentRequest extends js.Object {
    var Id: js.UndefOr[TrafficPolicyId]
    var Version: js.UndefOr[TrafficPolicyVersion]
    var Comment: js.UndefOr[TrafficPolicyComment]
  }

  object UpdateTrafficPolicyCommentRequest {
    def apply(
      Id: js.UndefOr[TrafficPolicyId] = js.undefined,
      Version: js.UndefOr[TrafficPolicyVersion] = js.undefined,
      Comment: js.UndefOr[TrafficPolicyComment] = js.undefined): UpdateTrafficPolicyCommentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Version" -> Version.map { x => x.asInstanceOf[js.Any] },
        "Comment" -> Comment.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateTrafficPolicyCommentRequest]
    }
  }

  /**
   * <p>A complex type that contains the response information for the traffic policy.</p>
   */
  @js.native
  trait UpdateTrafficPolicyCommentResponse extends js.Object {
    var TrafficPolicy: js.UndefOr[TrafficPolicy]
  }

  object UpdateTrafficPolicyCommentResponse {
    def apply(
      TrafficPolicy: js.UndefOr[TrafficPolicy] = js.undefined): UpdateTrafficPolicyCommentResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TrafficPolicy" -> TrafficPolicy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateTrafficPolicyCommentResponse]
    }
  }

  /**
   * <p>A complex type that contains information about the resource record sets that you want to update based on a specified traffic policy instance.</p>
   */
  @js.native
  trait UpdateTrafficPolicyInstanceRequest extends js.Object {
    var Id: js.UndefOr[TrafficPolicyInstanceId]
    var TTL: js.UndefOr[TTL]
    var TrafficPolicyId: js.UndefOr[TrafficPolicyId]
    var TrafficPolicyVersion: js.UndefOr[TrafficPolicyVersion]
  }

  object UpdateTrafficPolicyInstanceRequest {
    def apply(
      Id: js.UndefOr[TrafficPolicyInstanceId] = js.undefined,
      TTL: js.UndefOr[TTL] = js.undefined,
      TrafficPolicyId: js.UndefOr[TrafficPolicyId] = js.undefined,
      TrafficPolicyVersion: js.UndefOr[TrafficPolicyVersion] = js.undefined): UpdateTrafficPolicyInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "TTL" -> TTL.map { x => x.asInstanceOf[js.Any] },
        "TrafficPolicyId" -> TrafficPolicyId.map { x => x.asInstanceOf[js.Any] },
        "TrafficPolicyVersion" -> TrafficPolicyVersion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateTrafficPolicyInstanceRequest]
    }
  }

  /**
   * <p>A complex type that contains information about the resource record sets that Amazon Route 53 created based on a specified traffic policy.</p>
   */
  @js.native
  trait UpdateTrafficPolicyInstanceResponse extends js.Object {
    var TrafficPolicyInstance: js.UndefOr[TrafficPolicyInstance]
  }

  object UpdateTrafficPolicyInstanceResponse {
    def apply(
      TrafficPolicyInstance: js.UndefOr[TrafficPolicyInstance] = js.undefined): UpdateTrafficPolicyInstanceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TrafficPolicyInstance" -> TrafficPolicyInstance.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateTrafficPolicyInstanceResponse]
    }
  }

  /**
   * <p>(Private hosted zones only) A complex type that contains information about an Amazon VPC.</p>
   */
  @js.native
  trait VPC extends js.Object {
    var VPCRegion: js.UndefOr[VPCRegion]
    var VPCId: js.UndefOr[VPCId]
  }

  object VPC {
    def apply(
      VPCRegion: js.UndefOr[VPCRegion] = js.undefined,
      VPCId: js.UndefOr[VPCId] = js.undefined): VPC = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VPCRegion" -> VPCRegion.map { x => x.asInstanceOf[js.Any] },
        "VPCId" -> VPCId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VPC]
    }
  }

  object VPCRegionEnum {
    val `us-east-1` = "us-east-1"
    val `us-east-2` = "us-east-2"
    val `us-west-1` = "us-west-1"
    val `us-west-2` = "us-west-2"
    val `eu-west-1` = "eu-west-1"
    val `eu-west-2` = "eu-west-2"
    val `eu-west-3` = "eu-west-3"
    val `eu-central-1` = "eu-central-1"
    val `ap-southeast-1` = "ap-southeast-1"
    val `ap-southeast-2` = "ap-southeast-2"
    val `ap-south-1` = "ap-south-1"
    val `ap-northeast-1` = "ap-northeast-1"
    val `ap-northeast-2` = "ap-northeast-2"
    val `ap-northeast-3` = "ap-northeast-3"
    val `sa-east-1` = "sa-east-1"
    val `ca-central-1` = "ca-central-1"
    val `cn-north-1` = "cn-north-1"

    val values = IndexedSeq(`us-east-1`, `us-east-2`, `us-west-1`, `us-west-2`, `eu-west-1`, `eu-west-2`, `eu-west-3`, `eu-central-1`, `ap-southeast-1`, `ap-southeast-2`, `ap-south-1`, `ap-northeast-1`, `ap-northeast-2`, `ap-northeast-3`, `sa-east-1`, `ca-central-1`, `cn-north-1`)
  }
}
