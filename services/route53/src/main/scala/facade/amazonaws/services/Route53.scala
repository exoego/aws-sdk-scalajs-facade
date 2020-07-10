package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object route53 {
  type AWSAccountID = String
  type AlarmName = String
  type AliasHealthEnabled = Boolean
  type AssociateVPCComment = String
  type Changes = js.Array[Change]
  type CheckerIpRanges = js.Array[IPAddressCidr]
  type ChildHealthCheckList = js.Array[HealthCheckId]
  type CloudWatchLogsLogGroupArn = String
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
  type HealthCheckRegionList = js.Array[HealthCheckRegion]
  type HealthCheckVersion = Double
  type HealthChecks = js.Array[HealthCheck]
  type HealthThreshold = Int
  type HostedZoneCount = Double
  type HostedZoneOwningService = String
  type HostedZoneRRSetCount = Double
  type HostedZoneSummaries = js.Array[HostedZoneSummary]
  type HostedZones = js.Array[HostedZone]
  type IPAddress = String
  type IPAddressCidr = String
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
  type RecordData = js.Array[RecordDataEntry]
  type RecordDataEntry = String
  type RequestInterval = Int
  type ResettableElementNameList = js.Array[ResettableElementName]
  type ResourceDescription = String
  type ResourceId = String
  type ResourcePath = String
  type ResourceRecordSetIdentifier = String
  type ResourceRecordSetMultiValueAnswer = Boolean
  type ResourceRecordSetWeight = Double
  type ResourceRecordSets = js.Array[ResourceRecordSet]
  type ResourceRecords = js.Array[ResourceRecord]
  type ResourceTagSetList = js.Array[ResourceTagSet]
  type ResourceURI = String
  type SearchString = String
  type ServicePrincipal = String
  type Status = String
  type SubnetMask = String
  type TTL = Double
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagResourceId = String
  type TagResourceIdList = js.Array[TagResourceId]
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
  type VPCs = js.Array[VPC]

  implicit final class Route53Ops(private val service: Route53) extends AnyVal {

    @inline def associateVPCWithHostedZoneFuture(
        params: AssociateVPCWithHostedZoneRequest
    ): Future[AssociateVPCWithHostedZoneResponse] = service.associateVPCWithHostedZone(params).promise().toFuture
    @inline def changeResourceRecordSetsFuture(
        params: ChangeResourceRecordSetsRequest
    ): Future[ChangeResourceRecordSetsResponse] = service.changeResourceRecordSets(params).promise().toFuture
    @inline def changeTagsForResourceFuture(
        params: ChangeTagsForResourceRequest
    ): Future[ChangeTagsForResourceResponse] = service.changeTagsForResource(params).promise().toFuture
    @inline def createHealthCheckFuture(params: CreateHealthCheckRequest): Future[CreateHealthCheckResponse] =
      service.createHealthCheck(params).promise().toFuture
    @inline def createHostedZoneFuture(params: CreateHostedZoneRequest): Future[CreateHostedZoneResponse] =
      service.createHostedZone(params).promise().toFuture
    @inline def createQueryLoggingConfigFuture(
        params: CreateQueryLoggingConfigRequest
    ): Future[CreateQueryLoggingConfigResponse] = service.createQueryLoggingConfig(params).promise().toFuture
    @inline def createReusableDelegationSetFuture(
        params: CreateReusableDelegationSetRequest
    ): Future[CreateReusableDelegationSetResponse] = service.createReusableDelegationSet(params).promise().toFuture
    @inline def createTrafficPolicyFuture(params: CreateTrafficPolicyRequest): Future[CreateTrafficPolicyResponse] =
      service.createTrafficPolicy(params).promise().toFuture
    @inline def createTrafficPolicyInstanceFuture(
        params: CreateTrafficPolicyInstanceRequest
    ): Future[CreateTrafficPolicyInstanceResponse] = service.createTrafficPolicyInstance(params).promise().toFuture
    @inline def createTrafficPolicyVersionFuture(
        params: CreateTrafficPolicyVersionRequest
    ): Future[CreateTrafficPolicyVersionResponse] = service.createTrafficPolicyVersion(params).promise().toFuture
    @inline def createVPCAssociationAuthorizationFuture(
        params: CreateVPCAssociationAuthorizationRequest
    ): Future[CreateVPCAssociationAuthorizationResponse] =
      service.createVPCAssociationAuthorization(params).promise().toFuture
    @inline def deleteHealthCheckFuture(params: DeleteHealthCheckRequest): Future[DeleteHealthCheckResponse] =
      service.deleteHealthCheck(params).promise().toFuture
    @inline def deleteHostedZoneFuture(params: DeleteHostedZoneRequest): Future[DeleteHostedZoneResponse] =
      service.deleteHostedZone(params).promise().toFuture
    @inline def deleteQueryLoggingConfigFuture(
        params: DeleteQueryLoggingConfigRequest
    ): Future[DeleteQueryLoggingConfigResponse] = service.deleteQueryLoggingConfig(params).promise().toFuture
    @inline def deleteReusableDelegationSetFuture(
        params: DeleteReusableDelegationSetRequest
    ): Future[DeleteReusableDelegationSetResponse] = service.deleteReusableDelegationSet(params).promise().toFuture
    @inline def deleteTrafficPolicyFuture(params: DeleteTrafficPolicyRequest): Future[DeleteTrafficPolicyResponse] =
      service.deleteTrafficPolicy(params).promise().toFuture
    @inline def deleteTrafficPolicyInstanceFuture(
        params: DeleteTrafficPolicyInstanceRequest
    ): Future[DeleteTrafficPolicyInstanceResponse] = service.deleteTrafficPolicyInstance(params).promise().toFuture
    @inline def deleteVPCAssociationAuthorizationFuture(
        params: DeleteVPCAssociationAuthorizationRequest
    ): Future[DeleteVPCAssociationAuthorizationResponse] =
      service.deleteVPCAssociationAuthorization(params).promise().toFuture
    @inline def disassociateVPCFromHostedZoneFuture(
        params: DisassociateVPCFromHostedZoneRequest
    ): Future[DisassociateVPCFromHostedZoneResponse] = service.disassociateVPCFromHostedZone(params).promise().toFuture
    @inline def getAccountLimitFuture(params: GetAccountLimitRequest): Future[GetAccountLimitResponse] =
      service.getAccountLimit(params).promise().toFuture
    @inline def getChangeFuture(params: GetChangeRequest): Future[GetChangeResponse] =
      service.getChange(params).promise().toFuture
    @inline def getCheckerIpRangesFuture(params: GetCheckerIpRangesRequest): Future[GetCheckerIpRangesResponse] =
      service.getCheckerIpRanges(params).promise().toFuture
    @inline def getGeoLocationFuture(params: GetGeoLocationRequest): Future[GetGeoLocationResponse] =
      service.getGeoLocation(params).promise().toFuture
    @inline def getHealthCheckCountFuture(params: GetHealthCheckCountRequest): Future[GetHealthCheckCountResponse] =
      service.getHealthCheckCount(params).promise().toFuture
    @inline def getHealthCheckFuture(params: GetHealthCheckRequest): Future[GetHealthCheckResponse] =
      service.getHealthCheck(params).promise().toFuture
    @inline def getHealthCheckLastFailureReasonFuture(
        params: GetHealthCheckLastFailureReasonRequest
    ): Future[GetHealthCheckLastFailureReasonResponse] =
      service.getHealthCheckLastFailureReason(params).promise().toFuture
    @inline def getHealthCheckStatusFuture(params: GetHealthCheckStatusRequest): Future[GetHealthCheckStatusResponse] =
      service.getHealthCheckStatus(params).promise().toFuture
    @inline def getHostedZoneCountFuture(params: GetHostedZoneCountRequest): Future[GetHostedZoneCountResponse] =
      service.getHostedZoneCount(params).promise().toFuture
    @inline def getHostedZoneFuture(params: GetHostedZoneRequest): Future[GetHostedZoneResponse] =
      service.getHostedZone(params).promise().toFuture
    @inline def getHostedZoneLimitFuture(params: GetHostedZoneLimitRequest): Future[GetHostedZoneLimitResponse] =
      service.getHostedZoneLimit(params).promise().toFuture
    @inline def getQueryLoggingConfigFuture(
        params: GetQueryLoggingConfigRequest
    ): Future[GetQueryLoggingConfigResponse] = service.getQueryLoggingConfig(params).promise().toFuture
    @inline def getReusableDelegationSetFuture(
        params: GetReusableDelegationSetRequest
    ): Future[GetReusableDelegationSetResponse] = service.getReusableDelegationSet(params).promise().toFuture
    @inline def getReusableDelegationSetLimitFuture(
        params: GetReusableDelegationSetLimitRequest
    ): Future[GetReusableDelegationSetLimitResponse] = service.getReusableDelegationSetLimit(params).promise().toFuture
    @inline def getTrafficPolicyFuture(params: GetTrafficPolicyRequest): Future[GetTrafficPolicyResponse] =
      service.getTrafficPolicy(params).promise().toFuture
    @inline def getTrafficPolicyInstanceCountFuture(
        params: GetTrafficPolicyInstanceCountRequest
    ): Future[GetTrafficPolicyInstanceCountResponse] = service.getTrafficPolicyInstanceCount(params).promise().toFuture
    @inline def getTrafficPolicyInstanceFuture(
        params: GetTrafficPolicyInstanceRequest
    ): Future[GetTrafficPolicyInstanceResponse] = service.getTrafficPolicyInstance(params).promise().toFuture
    @inline def listGeoLocationsFuture(params: ListGeoLocationsRequest): Future[ListGeoLocationsResponse] =
      service.listGeoLocations(params).promise().toFuture
    @inline def listHealthChecksFuture(params: ListHealthChecksRequest): Future[ListHealthChecksResponse] =
      service.listHealthChecks(params).promise().toFuture
    @inline def listHostedZonesByNameFuture(
        params: ListHostedZonesByNameRequest
    ): Future[ListHostedZonesByNameResponse] = service.listHostedZonesByName(params).promise().toFuture
    @inline def listHostedZonesByVPCFuture(params: ListHostedZonesByVPCRequest): Future[ListHostedZonesByVPCResponse] =
      service.listHostedZonesByVPC(params).promise().toFuture
    @inline def listHostedZonesFuture(params: ListHostedZonesRequest): Future[ListHostedZonesResponse] =
      service.listHostedZones(params).promise().toFuture
    @inline def listQueryLoggingConfigsFuture(
        params: ListQueryLoggingConfigsRequest
    ): Future[ListQueryLoggingConfigsResponse] = service.listQueryLoggingConfigs(params).promise().toFuture
    @inline def listResourceRecordSetsFuture(
        params: ListResourceRecordSetsRequest
    ): Future[ListResourceRecordSetsResponse] = service.listResourceRecordSets(params).promise().toFuture
    @inline def listReusableDelegationSetsFuture(
        params: ListReusableDelegationSetsRequest
    ): Future[ListReusableDelegationSetsResponse] = service.listReusableDelegationSets(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise().toFuture
    @inline def listTagsForResourcesFuture(params: ListTagsForResourcesRequest): Future[ListTagsForResourcesResponse] =
      service.listTagsForResources(params).promise().toFuture
    @inline def listTrafficPoliciesFuture(params: ListTrafficPoliciesRequest): Future[ListTrafficPoliciesResponse] =
      service.listTrafficPolicies(params).promise().toFuture
    @inline def listTrafficPolicyInstancesByHostedZoneFuture(
        params: ListTrafficPolicyInstancesByHostedZoneRequest
    ): Future[ListTrafficPolicyInstancesByHostedZoneResponse] =
      service.listTrafficPolicyInstancesByHostedZone(params).promise().toFuture
    @inline def listTrafficPolicyInstancesByPolicyFuture(
        params: ListTrafficPolicyInstancesByPolicyRequest
    ): Future[ListTrafficPolicyInstancesByPolicyResponse] =
      service.listTrafficPolicyInstancesByPolicy(params).promise().toFuture
    @inline def listTrafficPolicyInstancesFuture(
        params: ListTrafficPolicyInstancesRequest
    ): Future[ListTrafficPolicyInstancesResponse] = service.listTrafficPolicyInstances(params).promise().toFuture
    @inline def listTrafficPolicyVersionsFuture(
        params: ListTrafficPolicyVersionsRequest
    ): Future[ListTrafficPolicyVersionsResponse] = service.listTrafficPolicyVersions(params).promise().toFuture
    @inline def listVPCAssociationAuthorizationsFuture(
        params: ListVPCAssociationAuthorizationsRequest
    ): Future[ListVPCAssociationAuthorizationsResponse] =
      service.listVPCAssociationAuthorizations(params).promise().toFuture
    @inline def testDNSAnswerFuture(params: TestDNSAnswerRequest): Future[TestDNSAnswerResponse] =
      service.testDNSAnswer(params).promise().toFuture
    @inline def updateHealthCheckFuture(params: UpdateHealthCheckRequest): Future[UpdateHealthCheckResponse] =
      service.updateHealthCheck(params).promise().toFuture
    @inline def updateHostedZoneCommentFuture(
        params: UpdateHostedZoneCommentRequest
    ): Future[UpdateHostedZoneCommentResponse] = service.updateHostedZoneComment(params).promise().toFuture
    @inline def updateTrafficPolicyCommentFuture(
        params: UpdateTrafficPolicyCommentRequest
    ): Future[UpdateTrafficPolicyCommentResponse] = service.updateTrafficPolicyComment(params).promise().toFuture
    @inline def updateTrafficPolicyInstanceFuture(
        params: UpdateTrafficPolicyInstanceRequest
    ): Future[UpdateTrafficPolicyInstanceResponse] = service.updateTrafficPolicyInstance(params).promise().toFuture
  }
}

package route53 {
  @js.native
  @JSImport("aws-sdk", "Route53", "AWS.Route53")
  class Route53() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateVPCWithHostedZone(
        params: AssociateVPCWithHostedZoneRequest
    ): Request[AssociateVPCWithHostedZoneResponse] = js.native
    def changeResourceRecordSets(params: ChangeResourceRecordSetsRequest): Request[ChangeResourceRecordSetsResponse] =
      js.native
    def changeTagsForResource(params: ChangeTagsForResourceRequest): Request[ChangeTagsForResourceResponse] = js.native
    def createHealthCheck(params: CreateHealthCheckRequest): Request[CreateHealthCheckResponse] = js.native
    def createHostedZone(params: CreateHostedZoneRequest): Request[CreateHostedZoneResponse] = js.native
    def createQueryLoggingConfig(params: CreateQueryLoggingConfigRequest): Request[CreateQueryLoggingConfigResponse] =
      js.native
    def createReusableDelegationSet(
        params: CreateReusableDelegationSetRequest
    ): Request[CreateReusableDelegationSetResponse] = js.native
    def createTrafficPolicy(params: CreateTrafficPolicyRequest): Request[CreateTrafficPolicyResponse] = js.native
    def createTrafficPolicyInstance(
        params: CreateTrafficPolicyInstanceRequest
    ): Request[CreateTrafficPolicyInstanceResponse] = js.native
    def createTrafficPolicyVersion(
        params: CreateTrafficPolicyVersionRequest
    ): Request[CreateTrafficPolicyVersionResponse] = js.native
    def createVPCAssociationAuthorization(
        params: CreateVPCAssociationAuthorizationRequest
    ): Request[CreateVPCAssociationAuthorizationResponse] = js.native
    def deleteHealthCheck(params: DeleteHealthCheckRequest): Request[DeleteHealthCheckResponse] = js.native
    def deleteHostedZone(params: DeleteHostedZoneRequest): Request[DeleteHostedZoneResponse] = js.native
    def deleteQueryLoggingConfig(params: DeleteQueryLoggingConfigRequest): Request[DeleteQueryLoggingConfigResponse] =
      js.native
    def deleteReusableDelegationSet(
        params: DeleteReusableDelegationSetRequest
    ): Request[DeleteReusableDelegationSetResponse] = js.native
    def deleteTrafficPolicy(params: DeleteTrafficPolicyRequest): Request[DeleteTrafficPolicyResponse] = js.native
    def deleteTrafficPolicyInstance(
        params: DeleteTrafficPolicyInstanceRequest
    ): Request[DeleteTrafficPolicyInstanceResponse] = js.native
    def deleteVPCAssociationAuthorization(
        params: DeleteVPCAssociationAuthorizationRequest
    ): Request[DeleteVPCAssociationAuthorizationResponse] = js.native
    def disassociateVPCFromHostedZone(
        params: DisassociateVPCFromHostedZoneRequest
    ): Request[DisassociateVPCFromHostedZoneResponse] = js.native
    def getAccountLimit(params: GetAccountLimitRequest): Request[GetAccountLimitResponse] = js.native
    def getChange(params: GetChangeRequest): Request[GetChangeResponse] = js.native
    def getCheckerIpRanges(params: GetCheckerIpRangesRequest): Request[GetCheckerIpRangesResponse] = js.native
    def getGeoLocation(params: GetGeoLocationRequest): Request[GetGeoLocationResponse] = js.native
    def getHealthCheck(params: GetHealthCheckRequest): Request[GetHealthCheckResponse] = js.native
    def getHealthCheckCount(params: GetHealthCheckCountRequest): Request[GetHealthCheckCountResponse] = js.native
    def getHealthCheckLastFailureReason(
        params: GetHealthCheckLastFailureReasonRequest
    ): Request[GetHealthCheckLastFailureReasonResponse] = js.native
    def getHealthCheckStatus(params: GetHealthCheckStatusRequest): Request[GetHealthCheckStatusResponse] = js.native
    def getHostedZone(params: GetHostedZoneRequest): Request[GetHostedZoneResponse] = js.native
    def getHostedZoneCount(params: GetHostedZoneCountRequest): Request[GetHostedZoneCountResponse] = js.native
    def getHostedZoneLimit(params: GetHostedZoneLimitRequest): Request[GetHostedZoneLimitResponse] = js.native
    def getQueryLoggingConfig(params: GetQueryLoggingConfigRequest): Request[GetQueryLoggingConfigResponse] = js.native
    def getReusableDelegationSet(params: GetReusableDelegationSetRequest): Request[GetReusableDelegationSetResponse] =
      js.native
    def getReusableDelegationSetLimit(
        params: GetReusableDelegationSetLimitRequest
    ): Request[GetReusableDelegationSetLimitResponse] = js.native
    def getTrafficPolicy(params: GetTrafficPolicyRequest): Request[GetTrafficPolicyResponse] = js.native
    def getTrafficPolicyInstance(params: GetTrafficPolicyInstanceRequest): Request[GetTrafficPolicyInstanceResponse] =
      js.native
    def getTrafficPolicyInstanceCount(
        params: GetTrafficPolicyInstanceCountRequest
    ): Request[GetTrafficPolicyInstanceCountResponse] = js.native
    def listGeoLocations(params: ListGeoLocationsRequest): Request[ListGeoLocationsResponse] = js.native
    def listHealthChecks(params: ListHealthChecksRequest): Request[ListHealthChecksResponse] = js.native
    def listHostedZones(params: ListHostedZonesRequest): Request[ListHostedZonesResponse] = js.native
    def listHostedZonesByName(params: ListHostedZonesByNameRequest): Request[ListHostedZonesByNameResponse] = js.native
    def listHostedZonesByVPC(params: ListHostedZonesByVPCRequest): Request[ListHostedZonesByVPCResponse] = js.native
    def listQueryLoggingConfigs(params: ListQueryLoggingConfigsRequest): Request[ListQueryLoggingConfigsResponse] =
      js.native
    def listResourceRecordSets(params: ListResourceRecordSetsRequest): Request[ListResourceRecordSetsResponse] =
      js.native
    def listReusableDelegationSets(
        params: ListReusableDelegationSetsRequest
    ): Request[ListReusableDelegationSetsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def listTagsForResources(params: ListTagsForResourcesRequest): Request[ListTagsForResourcesResponse] = js.native
    def listTrafficPolicies(params: ListTrafficPoliciesRequest): Request[ListTrafficPoliciesResponse] = js.native
    def listTrafficPolicyInstances(
        params: ListTrafficPolicyInstancesRequest
    ): Request[ListTrafficPolicyInstancesResponse] = js.native
    def listTrafficPolicyInstancesByHostedZone(
        params: ListTrafficPolicyInstancesByHostedZoneRequest
    ): Request[ListTrafficPolicyInstancesByHostedZoneResponse] = js.native
    def listTrafficPolicyInstancesByPolicy(
        params: ListTrafficPolicyInstancesByPolicyRequest
    ): Request[ListTrafficPolicyInstancesByPolicyResponse] = js.native
    def listTrafficPolicyVersions(
        params: ListTrafficPolicyVersionsRequest
    ): Request[ListTrafficPolicyVersionsResponse] = js.native
    def listVPCAssociationAuthorizations(
        params: ListVPCAssociationAuthorizationsRequest
    ): Request[ListVPCAssociationAuthorizationsResponse] = js.native
    def testDNSAnswer(params: TestDNSAnswerRequest): Request[TestDNSAnswerResponse] = js.native
    def updateHealthCheck(params: UpdateHealthCheckRequest): Request[UpdateHealthCheckResponse] = js.native
    def updateHostedZoneComment(params: UpdateHostedZoneCommentRequest): Request[UpdateHostedZoneCommentResponse] =
      js.native
    def updateTrafficPolicyComment(
        params: UpdateTrafficPolicyCommentRequest
    ): Request[UpdateTrafficPolicyCommentResponse] = js.native
    def updateTrafficPolicyInstance(
        params: UpdateTrafficPolicyInstanceRequest
    ): Request[UpdateTrafficPolicyInstanceResponse] = js.native
  }

  /**
    * A complex type that contains the type of limit that you specified in the request and the current value for that limit.
    */
  @js.native
  trait AccountLimit extends js.Object {
    var Type: AccountLimitType
    var Value: LimitValue
  }

  object AccountLimit {
    @inline
    def apply(
        Type: AccountLimitType,
        Value: LimitValue
    ): AccountLimit = {
      val __obj = js.Dynamic.literal(
        "Type" -> Type.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AccountLimit]
    }
  }

  @js.native
  sealed trait AccountLimitType extends js.Any
  object AccountLimitType extends js.Object {
    val MAX_HEALTH_CHECKS_BY_OWNER = "MAX_HEALTH_CHECKS_BY_OWNER".asInstanceOf[AccountLimitType]
    val MAX_HOSTED_ZONES_BY_OWNER = "MAX_HOSTED_ZONES_BY_OWNER".asInstanceOf[AccountLimitType]
    val MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER = "MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER".asInstanceOf[AccountLimitType]
    val MAX_REUSABLE_DELEGATION_SETS_BY_OWNER = "MAX_REUSABLE_DELEGATION_SETS_BY_OWNER".asInstanceOf[AccountLimitType]
    val MAX_TRAFFIC_POLICIES_BY_OWNER = "MAX_TRAFFIC_POLICIES_BY_OWNER".asInstanceOf[AccountLimitType]

    val values = js.Object.freeze(
      js.Array(
        MAX_HEALTH_CHECKS_BY_OWNER,
        MAX_HOSTED_ZONES_BY_OWNER,
        MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER,
        MAX_REUSABLE_DELEGATION_SETS_BY_OWNER,
        MAX_TRAFFIC_POLICIES_BY_OWNER
      )
    )
  }

  /**
    * A complex type that identifies the CloudWatch alarm that you want Amazon Route 53 health checkers to use to determine whether the specified health check is healthy.
    */
  @js.native
  trait AlarmIdentifier extends js.Object {
    var Name: AlarmName
    var Region: CloudWatchRegion
  }

  object AlarmIdentifier {
    @inline
    def apply(
        Name: AlarmName,
        Region: CloudWatchRegion
    ): AlarmIdentifier = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Region" -> Region.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AlarmIdentifier]
    }
  }

  /**
    * <i>Alias resource record sets only:</i> Information about the AWS resource, such as a CloudFront distribution or an Amazon S3 bucket, that you want to route traffic to.
    *  When creating resource record sets for a private hosted zone, note the following:
    * * Creating geolocation alias resource record sets or latency alias resource record sets in a private hosted zone is unsupported.
    *  * For information about creating failover resource record sets in a private hosted zone, see [[https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-private-hosted-zones.html|Configuring Failover in a Private Hosted Zone]].
    */
  @js.native
  trait AliasTarget extends js.Object {
    var DNSName: DNSName
    var EvaluateTargetHealth: AliasHealthEnabled
    var HostedZoneId: ResourceId
  }

  object AliasTarget {
    @inline
    def apply(
        DNSName: DNSName,
        EvaluateTargetHealth: AliasHealthEnabled,
        HostedZoneId: ResourceId
    ): AliasTarget = {
      val __obj = js.Dynamic.literal(
        "DNSName" -> DNSName.asInstanceOf[js.Any],
        "EvaluateTargetHealth" -> EvaluateTargetHealth.asInstanceOf[js.Any],
        "HostedZoneId" -> HostedZoneId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AliasTarget]
    }
  }

  /**
    * A complex type that contains information about the request to associate a VPC with a private hosted zone.
    */
  @js.native
  trait AssociateVPCWithHostedZoneRequest extends js.Object {
    var HostedZoneId: ResourceId
    var VPC: VPC
    var Comment: js.UndefOr[AssociateVPCComment]
  }

  object AssociateVPCWithHostedZoneRequest {
    @inline
    def apply(
        HostedZoneId: ResourceId,
        VPC: VPC,
        Comment: js.UndefOr[AssociateVPCComment] = js.undefined
    ): AssociateVPCWithHostedZoneRequest = {
      val __obj = js.Dynamic.literal(
        "HostedZoneId" -> HostedZoneId.asInstanceOf[js.Any],
        "VPC" -> VPC.asInstanceOf[js.Any]
      )

      Comment.foreach(__v => __obj.updateDynamic("Comment")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateVPCWithHostedZoneRequest]
    }
  }

  /**
    * A complex type that contains the response information for the <code>AssociateVPCWithHostedZone</code> request.
    */
  @js.native
  trait AssociateVPCWithHostedZoneResponse extends js.Object {
    var ChangeInfo: ChangeInfo
  }

  object AssociateVPCWithHostedZoneResponse {
    @inline
    def apply(
        ChangeInfo: ChangeInfo
    ): AssociateVPCWithHostedZoneResponse = {
      val __obj = js.Dynamic.literal(
        "ChangeInfo" -> ChangeInfo.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AssociateVPCWithHostedZoneResponse]
    }
  }

  /**
    * The information for each resource record set that you want to change.
    */
  @js.native
  trait Change extends js.Object {
    var Action: ChangeAction
    var ResourceRecordSet: ResourceRecordSet
  }

  object Change {
    @inline
    def apply(
        Action: ChangeAction,
        ResourceRecordSet: ResourceRecordSet
    ): Change = {
      val __obj = js.Dynamic.literal(
        "Action" -> Action.asInstanceOf[js.Any],
        "ResourceRecordSet" -> ResourceRecordSet.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Change]
    }
  }

  @js.native
  sealed trait ChangeAction extends js.Any
  object ChangeAction extends js.Object {
    val CREATE = "CREATE".asInstanceOf[ChangeAction]
    val DELETE = "DELETE".asInstanceOf[ChangeAction]
    val UPSERT = "UPSERT".asInstanceOf[ChangeAction]

    val values = js.Object.freeze(js.Array(CREATE, DELETE, UPSERT))
  }

  /**
    * The information for a change request.
    */
  @js.native
  trait ChangeBatch extends js.Object {
    var Changes: Changes
    var Comment: js.UndefOr[ResourceDescription]
  }

  object ChangeBatch {
    @inline
    def apply(
        Changes: Changes,
        Comment: js.UndefOr[ResourceDescription] = js.undefined
    ): ChangeBatch = {
      val __obj = js.Dynamic.literal(
        "Changes" -> Changes.asInstanceOf[js.Any]
      )

      Comment.foreach(__v => __obj.updateDynamic("Comment")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChangeBatch]
    }
  }

  /**
    * A complex type that describes change information about changes made to your hosted zone.
    */
  @js.native
  trait ChangeInfo extends js.Object {
    var Id: ResourceId
    var Status: ChangeStatus
    var SubmittedAt: TimeStamp
    var Comment: js.UndefOr[ResourceDescription]
  }

  object ChangeInfo {
    @inline
    def apply(
        Id: ResourceId,
        Status: ChangeStatus,
        SubmittedAt: TimeStamp,
        Comment: js.UndefOr[ResourceDescription] = js.undefined
    ): ChangeInfo = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any],
        "SubmittedAt" -> SubmittedAt.asInstanceOf[js.Any]
      )

      Comment.foreach(__v => __obj.updateDynamic("Comment")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChangeInfo]
    }
  }

  /**
    * A complex type that contains change information for the resource record set.
    */
  @js.native
  trait ChangeResourceRecordSetsRequest extends js.Object {
    var ChangeBatch: ChangeBatch
    var HostedZoneId: ResourceId
  }

  object ChangeResourceRecordSetsRequest {
    @inline
    def apply(
        ChangeBatch: ChangeBatch,
        HostedZoneId: ResourceId
    ): ChangeResourceRecordSetsRequest = {
      val __obj = js.Dynamic.literal(
        "ChangeBatch" -> ChangeBatch.asInstanceOf[js.Any],
        "HostedZoneId" -> HostedZoneId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ChangeResourceRecordSetsRequest]
    }
  }

  /**
    * A complex type containing the response for the request.
    */
  @js.native
  trait ChangeResourceRecordSetsResponse extends js.Object {
    var ChangeInfo: ChangeInfo
  }

  object ChangeResourceRecordSetsResponse {
    @inline
    def apply(
        ChangeInfo: ChangeInfo
    ): ChangeResourceRecordSetsResponse = {
      val __obj = js.Dynamic.literal(
        "ChangeInfo" -> ChangeInfo.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ChangeResourceRecordSetsResponse]
    }
  }

  @js.native
  sealed trait ChangeStatus extends js.Any
  object ChangeStatus extends js.Object {
    val PENDING = "PENDING".asInstanceOf[ChangeStatus]
    val INSYNC = "INSYNC".asInstanceOf[ChangeStatus]

    val values = js.Object.freeze(js.Array(PENDING, INSYNC))
  }

  /**
    * A complex type that contains information about the tags that you want to add, edit, or delete.
    */
  @js.native
  trait ChangeTagsForResourceRequest extends js.Object {
    var ResourceId: TagResourceId
    var ResourceType: TagResourceType
    var AddTags: js.UndefOr[TagList]
    var RemoveTagKeys: js.UndefOr[TagKeyList]
  }

  object ChangeTagsForResourceRequest {
    @inline
    def apply(
        ResourceId: TagResourceId,
        ResourceType: TagResourceType,
        AddTags: js.UndefOr[TagList] = js.undefined,
        RemoveTagKeys: js.UndefOr[TagKeyList] = js.undefined
    ): ChangeTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "ResourceType" -> ResourceType.asInstanceOf[js.Any]
      )

      AddTags.foreach(__v => __obj.updateDynamic("AddTags")(__v.asInstanceOf[js.Any]))
      RemoveTagKeys.foreach(__v => __obj.updateDynamic("RemoveTagKeys")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChangeTagsForResourceRequest]
    }
  }

  /**
    * Empty response for the request.
    */
  @js.native
  trait ChangeTagsForResourceResponse extends js.Object {}

  object ChangeTagsForResourceResponse {
    @inline
    def apply(
    ): ChangeTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[ChangeTagsForResourceResponse]
    }
  }

  /**
    * A complex type that contains information about the CloudWatch alarm that Amazon Route 53 is monitoring for this health check.
    */
  @js.native
  trait CloudWatchAlarmConfiguration extends js.Object {
    var ComparisonOperator: ComparisonOperator
    var EvaluationPeriods: EvaluationPeriods
    var MetricName: MetricName
    var Namespace: Namespace
    var Period: Period
    var Statistic: Statistic
    var Threshold: Threshold
    var Dimensions: js.UndefOr[DimensionList]
  }

  object CloudWatchAlarmConfiguration {
    @inline
    def apply(
        ComparisonOperator: ComparisonOperator,
        EvaluationPeriods: EvaluationPeriods,
        MetricName: MetricName,
        Namespace: Namespace,
        Period: Period,
        Statistic: Statistic,
        Threshold: Threshold,
        Dimensions: js.UndefOr[DimensionList] = js.undefined
    ): CloudWatchAlarmConfiguration = {
      val __obj = js.Dynamic.literal(
        "ComparisonOperator" -> ComparisonOperator.asInstanceOf[js.Any],
        "EvaluationPeriods" -> EvaluationPeriods.asInstanceOf[js.Any],
        "MetricName" -> MetricName.asInstanceOf[js.Any],
        "Namespace" -> Namespace.asInstanceOf[js.Any],
        "Period" -> Period.asInstanceOf[js.Any],
        "Statistic" -> Statistic.asInstanceOf[js.Any],
        "Threshold" -> Threshold.asInstanceOf[js.Any]
      )

      Dimensions.foreach(__v => __obj.updateDynamic("Dimensions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CloudWatchAlarmConfiguration]
    }
  }

  @js.native
  sealed trait CloudWatchRegion extends js.Any
  object CloudWatchRegion extends js.Object {
    val `us-east-1` = "us-east-1".asInstanceOf[CloudWatchRegion]
    val `us-east-2` = "us-east-2".asInstanceOf[CloudWatchRegion]
    val `us-west-1` = "us-west-1".asInstanceOf[CloudWatchRegion]
    val `us-west-2` = "us-west-2".asInstanceOf[CloudWatchRegion]
    val `ca-central-1` = "ca-central-1".asInstanceOf[CloudWatchRegion]
    val `eu-central-1` = "eu-central-1".asInstanceOf[CloudWatchRegion]
    val `eu-west-1` = "eu-west-1".asInstanceOf[CloudWatchRegion]
    val `eu-west-2` = "eu-west-2".asInstanceOf[CloudWatchRegion]
    val `eu-west-3` = "eu-west-3".asInstanceOf[CloudWatchRegion]
    val `ap-east-1` = "ap-east-1".asInstanceOf[CloudWatchRegion]
    val `me-south-1` = "me-south-1".asInstanceOf[CloudWatchRegion]
    val `ap-south-1` = "ap-south-1".asInstanceOf[CloudWatchRegion]
    val `ap-southeast-1` = "ap-southeast-1".asInstanceOf[CloudWatchRegion]
    val `ap-southeast-2` = "ap-southeast-2".asInstanceOf[CloudWatchRegion]
    val `ap-northeast-1` = "ap-northeast-1".asInstanceOf[CloudWatchRegion]
    val `ap-northeast-2` = "ap-northeast-2".asInstanceOf[CloudWatchRegion]
    val `ap-northeast-3` = "ap-northeast-3".asInstanceOf[CloudWatchRegion]
    val `eu-north-1` = "eu-north-1".asInstanceOf[CloudWatchRegion]
    val `sa-east-1` = "sa-east-1".asInstanceOf[CloudWatchRegion]
    val `cn-northwest-1` = "cn-northwest-1".asInstanceOf[CloudWatchRegion]
    val `cn-north-1` = "cn-north-1".asInstanceOf[CloudWatchRegion]
    val `af-south-1` = "af-south-1".asInstanceOf[CloudWatchRegion]
    val `eu-south-1` = "eu-south-1".asInstanceOf[CloudWatchRegion]
    val `us-gov-west-1` = "us-gov-west-1".asInstanceOf[CloudWatchRegion]
    val `us-gov-east-1` = "us-gov-east-1".asInstanceOf[CloudWatchRegion]
    val `us-iso-east-1` = "us-iso-east-1".asInstanceOf[CloudWatchRegion]
    val `us-isob-east-1` = "us-isob-east-1".asInstanceOf[CloudWatchRegion]

    val values = js.Object.freeze(
      js.Array(
        `us-east-1`,
        `us-east-2`,
        `us-west-1`,
        `us-west-2`,
        `ca-central-1`,
        `eu-central-1`,
        `eu-west-1`,
        `eu-west-2`,
        `eu-west-3`,
        `ap-east-1`,
        `me-south-1`,
        `ap-south-1`,
        `ap-southeast-1`,
        `ap-southeast-2`,
        `ap-northeast-1`,
        `ap-northeast-2`,
        `ap-northeast-3`,
        `eu-north-1`,
        `sa-east-1`,
        `cn-northwest-1`,
        `cn-north-1`,
        `af-south-1`,
        `eu-south-1`,
        `us-gov-west-1`,
        `us-gov-east-1`,
        `us-iso-east-1`,
        `us-isob-east-1`
      )
    )
  }

  @js.native
  sealed trait ComparisonOperator extends js.Any
  object ComparisonOperator extends js.Object {
    val GreaterThanOrEqualToThreshold = "GreaterThanOrEqualToThreshold".asInstanceOf[ComparisonOperator]
    val GreaterThanThreshold = "GreaterThanThreshold".asInstanceOf[ComparisonOperator]
    val LessThanThreshold = "LessThanThreshold".asInstanceOf[ComparisonOperator]
    val LessThanOrEqualToThreshold = "LessThanOrEqualToThreshold".asInstanceOf[ComparisonOperator]

    val values = js.Object.freeze(
      js.Array(GreaterThanOrEqualToThreshold, GreaterThanThreshold, LessThanThreshold, LessThanOrEqualToThreshold)
    )
  }

  /**
    * A complex type that contains the health check request information.
    */
  @js.native
  trait CreateHealthCheckRequest extends js.Object {
    var CallerReference: HealthCheckNonce
    var HealthCheckConfig: HealthCheckConfig
  }

  object CreateHealthCheckRequest {
    @inline
    def apply(
        CallerReference: HealthCheckNonce,
        HealthCheckConfig: HealthCheckConfig
    ): CreateHealthCheckRequest = {
      val __obj = js.Dynamic.literal(
        "CallerReference" -> CallerReference.asInstanceOf[js.Any],
        "HealthCheckConfig" -> HealthCheckConfig.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateHealthCheckRequest]
    }
  }

  /**
    * A complex type containing the response information for the new health check.
    */
  @js.native
  trait CreateHealthCheckResponse extends js.Object {
    var HealthCheck: HealthCheck
    var Location: ResourceURI
  }

  object CreateHealthCheckResponse {
    @inline
    def apply(
        HealthCheck: HealthCheck,
        Location: ResourceURI
    ): CreateHealthCheckResponse = {
      val __obj = js.Dynamic.literal(
        "HealthCheck" -> HealthCheck.asInstanceOf[js.Any],
        "Location" -> Location.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateHealthCheckResponse]
    }
  }

  /**
    * A complex type that contains information about the request to create a public or private hosted zone.
    */
  @js.native
  trait CreateHostedZoneRequest extends js.Object {
    var CallerReference: Nonce
    var Name: DNSName
    var DelegationSetId: js.UndefOr[ResourceId]
    var HostedZoneConfig: js.UndefOr[HostedZoneConfig]
    var VPC: js.UndefOr[VPC]
  }

  object CreateHostedZoneRequest {
    @inline
    def apply(
        CallerReference: Nonce,
        Name: DNSName,
        DelegationSetId: js.UndefOr[ResourceId] = js.undefined,
        HostedZoneConfig: js.UndefOr[HostedZoneConfig] = js.undefined,
        VPC: js.UndefOr[VPC] = js.undefined
    ): CreateHostedZoneRequest = {
      val __obj = js.Dynamic.literal(
        "CallerReference" -> CallerReference.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      DelegationSetId.foreach(__v => __obj.updateDynamic("DelegationSetId")(__v.asInstanceOf[js.Any]))
      HostedZoneConfig.foreach(__v => __obj.updateDynamic("HostedZoneConfig")(__v.asInstanceOf[js.Any]))
      VPC.foreach(__v => __obj.updateDynamic("VPC")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateHostedZoneRequest]
    }
  }

  /**
    * A complex type containing the response information for the hosted zone.
    */
  @js.native
  trait CreateHostedZoneResponse extends js.Object {
    var ChangeInfo: ChangeInfo
    var DelegationSet: DelegationSet
    var HostedZone: HostedZone
    var Location: ResourceURI
    var VPC: js.UndefOr[VPC]
  }

  object CreateHostedZoneResponse {
    @inline
    def apply(
        ChangeInfo: ChangeInfo,
        DelegationSet: DelegationSet,
        HostedZone: HostedZone,
        Location: ResourceURI,
        VPC: js.UndefOr[VPC] = js.undefined
    ): CreateHostedZoneResponse = {
      val __obj = js.Dynamic.literal(
        "ChangeInfo" -> ChangeInfo.asInstanceOf[js.Any],
        "DelegationSet" -> DelegationSet.asInstanceOf[js.Any],
        "HostedZone" -> HostedZone.asInstanceOf[js.Any],
        "Location" -> Location.asInstanceOf[js.Any]
      )

      VPC.foreach(__v => __obj.updateDynamic("VPC")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateHostedZoneResponse]
    }
  }

  @js.native
  trait CreateQueryLoggingConfigRequest extends js.Object {
    var CloudWatchLogsLogGroupArn: CloudWatchLogsLogGroupArn
    var HostedZoneId: ResourceId
  }

  object CreateQueryLoggingConfigRequest {
    @inline
    def apply(
        CloudWatchLogsLogGroupArn: CloudWatchLogsLogGroupArn,
        HostedZoneId: ResourceId
    ): CreateQueryLoggingConfigRequest = {
      val __obj = js.Dynamic.literal(
        "CloudWatchLogsLogGroupArn" -> CloudWatchLogsLogGroupArn.asInstanceOf[js.Any],
        "HostedZoneId" -> HostedZoneId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateQueryLoggingConfigRequest]
    }
  }

  @js.native
  trait CreateQueryLoggingConfigResponse extends js.Object {
    var Location: ResourceURI
    var QueryLoggingConfig: QueryLoggingConfig
  }

  object CreateQueryLoggingConfigResponse {
    @inline
    def apply(
        Location: ResourceURI,
        QueryLoggingConfig: QueryLoggingConfig
    ): CreateQueryLoggingConfigResponse = {
      val __obj = js.Dynamic.literal(
        "Location" -> Location.asInstanceOf[js.Any],
        "QueryLoggingConfig" -> QueryLoggingConfig.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateQueryLoggingConfigResponse]
    }
  }

  @js.native
  trait CreateReusableDelegationSetRequest extends js.Object {
    var CallerReference: Nonce
    var HostedZoneId: js.UndefOr[ResourceId]
  }

  object CreateReusableDelegationSetRequest {
    @inline
    def apply(
        CallerReference: Nonce,
        HostedZoneId: js.UndefOr[ResourceId] = js.undefined
    ): CreateReusableDelegationSetRequest = {
      val __obj = js.Dynamic.literal(
        "CallerReference" -> CallerReference.asInstanceOf[js.Any]
      )

      HostedZoneId.foreach(__v => __obj.updateDynamic("HostedZoneId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateReusableDelegationSetRequest]
    }
  }

  @js.native
  trait CreateReusableDelegationSetResponse extends js.Object {
    var DelegationSet: DelegationSet
    var Location: ResourceURI
  }

  object CreateReusableDelegationSetResponse {
    @inline
    def apply(
        DelegationSet: DelegationSet,
        Location: ResourceURI
    ): CreateReusableDelegationSetResponse = {
      val __obj = js.Dynamic.literal(
        "DelegationSet" -> DelegationSet.asInstanceOf[js.Any],
        "Location" -> Location.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateReusableDelegationSetResponse]
    }
  }

  /**
    * A complex type that contains information about the resource record sets that you want to create based on a specified traffic policy.
    */
  @js.native
  trait CreateTrafficPolicyInstanceRequest extends js.Object {
    var HostedZoneId: ResourceId
    var Name: DNSName
    var TTL: TTL
    var TrafficPolicyId: TrafficPolicyId
    var TrafficPolicyVersion: TrafficPolicyVersion
  }

  object CreateTrafficPolicyInstanceRequest {
    @inline
    def apply(
        HostedZoneId: ResourceId,
        Name: DNSName,
        TTL: TTL,
        TrafficPolicyId: TrafficPolicyId,
        TrafficPolicyVersion: TrafficPolicyVersion
    ): CreateTrafficPolicyInstanceRequest = {
      val __obj = js.Dynamic.literal(
        "HostedZoneId" -> HostedZoneId.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "TTL" -> TTL.asInstanceOf[js.Any],
        "TrafficPolicyId" -> TrafficPolicyId.asInstanceOf[js.Any],
        "TrafficPolicyVersion" -> TrafficPolicyVersion.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateTrafficPolicyInstanceRequest]
    }
  }

  /**
    * A complex type that contains the response information for the <code>CreateTrafficPolicyInstance</code> request.
    */
  @js.native
  trait CreateTrafficPolicyInstanceResponse extends js.Object {
    var Location: ResourceURI
    var TrafficPolicyInstance: TrafficPolicyInstance
  }

  object CreateTrafficPolicyInstanceResponse {
    @inline
    def apply(
        Location: ResourceURI,
        TrafficPolicyInstance: TrafficPolicyInstance
    ): CreateTrafficPolicyInstanceResponse = {
      val __obj = js.Dynamic.literal(
        "Location" -> Location.asInstanceOf[js.Any],
        "TrafficPolicyInstance" -> TrafficPolicyInstance.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateTrafficPolicyInstanceResponse]
    }
  }

  /**
    * A complex type that contains information about the traffic policy that you want to create.
    */
  @js.native
  trait CreateTrafficPolicyRequest extends js.Object {
    var Document: TrafficPolicyDocument
    var Name: TrafficPolicyName
    var Comment: js.UndefOr[TrafficPolicyComment]
  }

  object CreateTrafficPolicyRequest {
    @inline
    def apply(
        Document: TrafficPolicyDocument,
        Name: TrafficPolicyName,
        Comment: js.UndefOr[TrafficPolicyComment] = js.undefined
    ): CreateTrafficPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "Document" -> Document.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Comment.foreach(__v => __obj.updateDynamic("Comment")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTrafficPolicyRequest]
    }
  }

  /**
    * A complex type that contains the response information for the <code>CreateTrafficPolicy</code> request.
    */
  @js.native
  trait CreateTrafficPolicyResponse extends js.Object {
    var Location: ResourceURI
    var TrafficPolicy: TrafficPolicy
  }

  object CreateTrafficPolicyResponse {
    @inline
    def apply(
        Location: ResourceURI,
        TrafficPolicy: TrafficPolicy
    ): CreateTrafficPolicyResponse = {
      val __obj = js.Dynamic.literal(
        "Location" -> Location.asInstanceOf[js.Any],
        "TrafficPolicy" -> TrafficPolicy.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateTrafficPolicyResponse]
    }
  }

  /**
    * A complex type that contains information about the traffic policy that you want to create a new version for.
    */
  @js.native
  trait CreateTrafficPolicyVersionRequest extends js.Object {
    var Document: TrafficPolicyDocument
    var Id: TrafficPolicyId
    var Comment: js.UndefOr[TrafficPolicyComment]
  }

  object CreateTrafficPolicyVersionRequest {
    @inline
    def apply(
        Document: TrafficPolicyDocument,
        Id: TrafficPolicyId,
        Comment: js.UndefOr[TrafficPolicyComment] = js.undefined
    ): CreateTrafficPolicyVersionRequest = {
      val __obj = js.Dynamic.literal(
        "Document" -> Document.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any]
      )

      Comment.foreach(__v => __obj.updateDynamic("Comment")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTrafficPolicyVersionRequest]
    }
  }

  /**
    * A complex type that contains the response information for the <code>CreateTrafficPolicyVersion</code> request.
    */
  @js.native
  trait CreateTrafficPolicyVersionResponse extends js.Object {
    var Location: ResourceURI
    var TrafficPolicy: TrafficPolicy
  }

  object CreateTrafficPolicyVersionResponse {
    @inline
    def apply(
        Location: ResourceURI,
        TrafficPolicy: TrafficPolicy
    ): CreateTrafficPolicyVersionResponse = {
      val __obj = js.Dynamic.literal(
        "Location" -> Location.asInstanceOf[js.Any],
        "TrafficPolicy" -> TrafficPolicy.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateTrafficPolicyVersionResponse]
    }
  }

  /**
    * A complex type that contains information about the request to authorize associating a VPC with your private hosted zone. Authorization is only required when a private hosted zone and a VPC were created by using different accounts.
    */
  @js.native
  trait CreateVPCAssociationAuthorizationRequest extends js.Object {
    var HostedZoneId: ResourceId
    var VPC: VPC
  }

  object CreateVPCAssociationAuthorizationRequest {
    @inline
    def apply(
        HostedZoneId: ResourceId,
        VPC: VPC
    ): CreateVPCAssociationAuthorizationRequest = {
      val __obj = js.Dynamic.literal(
        "HostedZoneId" -> HostedZoneId.asInstanceOf[js.Any],
        "VPC" -> VPC.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateVPCAssociationAuthorizationRequest]
    }
  }

  /**
    * A complex type that contains the response information from a <code>CreateVPCAssociationAuthorization</code> request.
    */
  @js.native
  trait CreateVPCAssociationAuthorizationResponse extends js.Object {
    var HostedZoneId: ResourceId
    var VPC: VPC
  }

  object CreateVPCAssociationAuthorizationResponse {
    @inline
    def apply(
        HostedZoneId: ResourceId,
        VPC: VPC
    ): CreateVPCAssociationAuthorizationResponse = {
      val __obj = js.Dynamic.literal(
        "HostedZoneId" -> HostedZoneId.asInstanceOf[js.Any],
        "VPC" -> VPC.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateVPCAssociationAuthorizationResponse]
    }
  }

  /**
    * A complex type that lists the name servers in a delegation set, as well as the <code>CallerReference</code> and the <code>ID</code> for the delegation set.
    */
  @js.native
  trait DelegationSet extends js.Object {
    var NameServers: DelegationSetNameServers
    var CallerReference: js.UndefOr[Nonce]
    var Id: js.UndefOr[ResourceId]
  }

  object DelegationSet {
    @inline
    def apply(
        NameServers: DelegationSetNameServers,
        CallerReference: js.UndefOr[Nonce] = js.undefined,
        Id: js.UndefOr[ResourceId] = js.undefined
    ): DelegationSet = {
      val __obj = js.Dynamic.literal(
        "NameServers" -> NameServers.asInstanceOf[js.Any]
      )

      CallerReference.foreach(__v => __obj.updateDynamic("CallerReference")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DelegationSet]
    }
  }

  /**
    * This action deletes a health check.
    */
  @js.native
  trait DeleteHealthCheckRequest extends js.Object {
    var HealthCheckId: HealthCheckId
  }

  object DeleteHealthCheckRequest {
    @inline
    def apply(
        HealthCheckId: HealthCheckId
    ): DeleteHealthCheckRequest = {
      val __obj = js.Dynamic.literal(
        "HealthCheckId" -> HealthCheckId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteHealthCheckRequest]
    }
  }

  /**
    * An empty element.
    */
  @js.native
  trait DeleteHealthCheckResponse extends js.Object {}

  object DeleteHealthCheckResponse {
    @inline
    def apply(
    ): DeleteHealthCheckResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteHealthCheckResponse]
    }
  }

  /**
    * A request to delete a hosted zone.
    */
  @js.native
  trait DeleteHostedZoneRequest extends js.Object {
    var Id: ResourceId
  }

  object DeleteHostedZoneRequest {
    @inline
    def apply(
        Id: ResourceId
    ): DeleteHostedZoneRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteHostedZoneRequest]
    }
  }

  /**
    * A complex type that contains the response to a <code>DeleteHostedZone</code> request.
    */
  @js.native
  trait DeleteHostedZoneResponse extends js.Object {
    var ChangeInfo: ChangeInfo
  }

  object DeleteHostedZoneResponse {
    @inline
    def apply(
        ChangeInfo: ChangeInfo
    ): DeleteHostedZoneResponse = {
      val __obj = js.Dynamic.literal(
        "ChangeInfo" -> ChangeInfo.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteHostedZoneResponse]
    }
  }

  @js.native
  trait DeleteQueryLoggingConfigRequest extends js.Object {
    var Id: QueryLoggingConfigId
  }

  object DeleteQueryLoggingConfigRequest {
    @inline
    def apply(
        Id: QueryLoggingConfigId
    ): DeleteQueryLoggingConfigRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteQueryLoggingConfigRequest]
    }
  }

  @js.native
  trait DeleteQueryLoggingConfigResponse extends js.Object {}

  object DeleteQueryLoggingConfigResponse {
    @inline
    def apply(
    ): DeleteQueryLoggingConfigResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteQueryLoggingConfigResponse]
    }
  }

  /**
    * A request to delete a reusable delegation set.
    */
  @js.native
  trait DeleteReusableDelegationSetRequest extends js.Object {
    var Id: ResourceId
  }

  object DeleteReusableDelegationSetRequest {
    @inline
    def apply(
        Id: ResourceId
    ): DeleteReusableDelegationSetRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteReusableDelegationSetRequest]
    }
  }

  /**
    * An empty element.
    */
  @js.native
  trait DeleteReusableDelegationSetResponse extends js.Object {}

  object DeleteReusableDelegationSetResponse {
    @inline
    def apply(
    ): DeleteReusableDelegationSetResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteReusableDelegationSetResponse]
    }
  }

  /**
    * A request to delete a specified traffic policy instance.
    */
  @js.native
  trait DeleteTrafficPolicyInstanceRequest extends js.Object {
    var Id: TrafficPolicyInstanceId
  }

  object DeleteTrafficPolicyInstanceRequest {
    @inline
    def apply(
        Id: TrafficPolicyInstanceId
    ): DeleteTrafficPolicyInstanceRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteTrafficPolicyInstanceRequest]
    }
  }

  /**
    * An empty element.
    */
  @js.native
  trait DeleteTrafficPolicyInstanceResponse extends js.Object {}

  object DeleteTrafficPolicyInstanceResponse {
    @inline
    def apply(
    ): DeleteTrafficPolicyInstanceResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteTrafficPolicyInstanceResponse]
    }
  }

  /**
    * A request to delete a specified traffic policy version.
    */
  @js.native
  trait DeleteTrafficPolicyRequest extends js.Object {
    var Id: TrafficPolicyId
    var Version: TrafficPolicyVersion
  }

  object DeleteTrafficPolicyRequest {
    @inline
    def apply(
        Id: TrafficPolicyId,
        Version: TrafficPolicyVersion
    ): DeleteTrafficPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "Version" -> Version.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteTrafficPolicyRequest]
    }
  }

  /**
    * An empty element.
    */
  @js.native
  trait DeleteTrafficPolicyResponse extends js.Object {}

  object DeleteTrafficPolicyResponse {
    @inline
    def apply(
    ): DeleteTrafficPolicyResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteTrafficPolicyResponse]
    }
  }

  /**
    * A complex type that contains information about the request to remove authorization to associate a VPC that was created by one AWS account with a hosted zone that was created with a different AWS account.
    */
  @js.native
  trait DeleteVPCAssociationAuthorizationRequest extends js.Object {
    var HostedZoneId: ResourceId
    var VPC: VPC
  }

  object DeleteVPCAssociationAuthorizationRequest {
    @inline
    def apply(
        HostedZoneId: ResourceId,
        VPC: VPC
    ): DeleteVPCAssociationAuthorizationRequest = {
      val __obj = js.Dynamic.literal(
        "HostedZoneId" -> HostedZoneId.asInstanceOf[js.Any],
        "VPC" -> VPC.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteVPCAssociationAuthorizationRequest]
    }
  }

  /**
    * Empty response for the request.
    */
  @js.native
  trait DeleteVPCAssociationAuthorizationResponse extends js.Object {}

  object DeleteVPCAssociationAuthorizationResponse {
    @inline
    def apply(
    ): DeleteVPCAssociationAuthorizationResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteVPCAssociationAuthorizationResponse]
    }
  }

  /**
    * For the metric that the CloudWatch alarm is associated with, a complex type that contains information about one dimension.
    */
  @js.native
  trait Dimension extends js.Object {
    var Name: DimensionField
    var Value: DimensionField
  }

  object Dimension {
    @inline
    def apply(
        Name: DimensionField,
        Value: DimensionField
    ): Dimension = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Dimension]
    }
  }

  /**
    * A complex type that contains information about the VPC that you want to disassociate from a specified private hosted zone.
    */
  @js.native
  trait DisassociateVPCFromHostedZoneRequest extends js.Object {
    var HostedZoneId: ResourceId
    var VPC: VPC
    var Comment: js.UndefOr[DisassociateVPCComment]
  }

  object DisassociateVPCFromHostedZoneRequest {
    @inline
    def apply(
        HostedZoneId: ResourceId,
        VPC: VPC,
        Comment: js.UndefOr[DisassociateVPCComment] = js.undefined
    ): DisassociateVPCFromHostedZoneRequest = {
      val __obj = js.Dynamic.literal(
        "HostedZoneId" -> HostedZoneId.asInstanceOf[js.Any],
        "VPC" -> VPC.asInstanceOf[js.Any]
      )

      Comment.foreach(__v => __obj.updateDynamic("Comment")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociateVPCFromHostedZoneRequest]
    }
  }

  /**
    * A complex type that contains the response information for the disassociate request.
    */
  @js.native
  trait DisassociateVPCFromHostedZoneResponse extends js.Object {
    var ChangeInfo: ChangeInfo
  }

  object DisassociateVPCFromHostedZoneResponse {
    @inline
    def apply(
        ChangeInfo: ChangeInfo
    ): DisassociateVPCFromHostedZoneResponse = {
      val __obj = js.Dynamic.literal(
        "ChangeInfo" -> ChangeInfo.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DisassociateVPCFromHostedZoneResponse]
    }
  }

  /**
    * A complex type that contains information about a geographic location.
    */
  @js.native
  trait GeoLocation extends js.Object {
    var ContinentCode: js.UndefOr[GeoLocationContinentCode]
    var CountryCode: js.UndefOr[GeoLocationCountryCode]
    var SubdivisionCode: js.UndefOr[GeoLocationSubdivisionCode]
  }

  object GeoLocation {
    @inline
    def apply(
        ContinentCode: js.UndefOr[GeoLocationContinentCode] = js.undefined,
        CountryCode: js.UndefOr[GeoLocationCountryCode] = js.undefined,
        SubdivisionCode: js.UndefOr[GeoLocationSubdivisionCode] = js.undefined
    ): GeoLocation = {
      val __obj = js.Dynamic.literal()
      ContinentCode.foreach(__v => __obj.updateDynamic("ContinentCode")(__v.asInstanceOf[js.Any]))
      CountryCode.foreach(__v => __obj.updateDynamic("CountryCode")(__v.asInstanceOf[js.Any]))
      SubdivisionCode.foreach(__v => __obj.updateDynamic("SubdivisionCode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GeoLocation]
    }
  }

  /**
    * A complex type that contains the codes and full continent, country, and subdivision names for the specified <code>geolocation</code> code.
    */
  @js.native
  trait GeoLocationDetails extends js.Object {
    var ContinentCode: js.UndefOr[GeoLocationContinentCode]
    var ContinentName: js.UndefOr[GeoLocationContinentName]
    var CountryCode: js.UndefOr[GeoLocationCountryCode]
    var CountryName: js.UndefOr[GeoLocationCountryName]
    var SubdivisionCode: js.UndefOr[GeoLocationSubdivisionCode]
    var SubdivisionName: js.UndefOr[GeoLocationSubdivisionName]
  }

  object GeoLocationDetails {
    @inline
    def apply(
        ContinentCode: js.UndefOr[GeoLocationContinentCode] = js.undefined,
        ContinentName: js.UndefOr[GeoLocationContinentName] = js.undefined,
        CountryCode: js.UndefOr[GeoLocationCountryCode] = js.undefined,
        CountryName: js.UndefOr[GeoLocationCountryName] = js.undefined,
        SubdivisionCode: js.UndefOr[GeoLocationSubdivisionCode] = js.undefined,
        SubdivisionName: js.UndefOr[GeoLocationSubdivisionName] = js.undefined
    ): GeoLocationDetails = {
      val __obj = js.Dynamic.literal()
      ContinentCode.foreach(__v => __obj.updateDynamic("ContinentCode")(__v.asInstanceOf[js.Any]))
      ContinentName.foreach(__v => __obj.updateDynamic("ContinentName")(__v.asInstanceOf[js.Any]))
      CountryCode.foreach(__v => __obj.updateDynamic("CountryCode")(__v.asInstanceOf[js.Any]))
      CountryName.foreach(__v => __obj.updateDynamic("CountryName")(__v.asInstanceOf[js.Any]))
      SubdivisionCode.foreach(__v => __obj.updateDynamic("SubdivisionCode")(__v.asInstanceOf[js.Any]))
      SubdivisionName.foreach(__v => __obj.updateDynamic("SubdivisionName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GeoLocationDetails]
    }
  }

  /**
    * A complex type that contains information about the request to create a hosted zone.
    */
  @js.native
  trait GetAccountLimitRequest extends js.Object {
    var Type: AccountLimitType
  }

  object GetAccountLimitRequest {
    @inline
    def apply(
        Type: AccountLimitType
    ): GetAccountLimitRequest = {
      val __obj = js.Dynamic.literal(
        "Type" -> Type.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetAccountLimitRequest]
    }
  }

  /**
    * A complex type that contains the requested limit.
    */
  @js.native
  trait GetAccountLimitResponse extends js.Object {
    var Count: UsageCount
    var Limit: AccountLimit
  }

  object GetAccountLimitResponse {
    @inline
    def apply(
        Count: UsageCount,
        Limit: AccountLimit
    ): GetAccountLimitResponse = {
      val __obj = js.Dynamic.literal(
        "Count" -> Count.asInstanceOf[js.Any],
        "Limit" -> Limit.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetAccountLimitResponse]
    }
  }

  /**
    * The input for a GetChange request.
    */
  @js.native
  trait GetChangeRequest extends js.Object {
    var Id: ResourceId
  }

  object GetChangeRequest {
    @inline
    def apply(
        Id: ResourceId
    ): GetChangeRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetChangeRequest]
    }
  }

  /**
    * A complex type that contains the <code>ChangeInfo</code> element.
    */
  @js.native
  trait GetChangeResponse extends js.Object {
    var ChangeInfo: ChangeInfo
  }

  object GetChangeResponse {
    @inline
    def apply(
        ChangeInfo: ChangeInfo
    ): GetChangeResponse = {
      val __obj = js.Dynamic.literal(
        "ChangeInfo" -> ChangeInfo.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetChangeResponse]
    }
  }

  /**
    * Empty request.
    */
  @js.native
  trait GetCheckerIpRangesRequest extends js.Object {}

  object GetCheckerIpRangesRequest {
    @inline
    def apply(
    ): GetCheckerIpRangesRequest = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[GetCheckerIpRangesRequest]
    }
  }

  /**
    * A complex type that contains the <code>CheckerIpRanges</code> element.
    */
  @js.native
  trait GetCheckerIpRangesResponse extends js.Object {
    var CheckerIpRanges: CheckerIpRanges
  }

  object GetCheckerIpRangesResponse {
    @inline
    def apply(
        CheckerIpRanges: CheckerIpRanges
    ): GetCheckerIpRangesResponse = {
      val __obj = js.Dynamic.literal(
        "CheckerIpRanges" -> CheckerIpRanges.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetCheckerIpRangesResponse]
    }
  }

  /**
    * A request for information about whether a specified geographic location is supported for Amazon Route 53 geolocation resource record sets.
    */
  @js.native
  trait GetGeoLocationRequest extends js.Object {
    var ContinentCode: js.UndefOr[GeoLocationContinentCode]
    var CountryCode: js.UndefOr[GeoLocationCountryCode]
    var SubdivisionCode: js.UndefOr[GeoLocationSubdivisionCode]
  }

  object GetGeoLocationRequest {
    @inline
    def apply(
        ContinentCode: js.UndefOr[GeoLocationContinentCode] = js.undefined,
        CountryCode: js.UndefOr[GeoLocationCountryCode] = js.undefined,
        SubdivisionCode: js.UndefOr[GeoLocationSubdivisionCode] = js.undefined
    ): GetGeoLocationRequest = {
      val __obj = js.Dynamic.literal()
      ContinentCode.foreach(__v => __obj.updateDynamic("ContinentCode")(__v.asInstanceOf[js.Any]))
      CountryCode.foreach(__v => __obj.updateDynamic("CountryCode")(__v.asInstanceOf[js.Any]))
      SubdivisionCode.foreach(__v => __obj.updateDynamic("SubdivisionCode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetGeoLocationRequest]
    }
  }

  /**
    * A complex type that contains the response information for the specified geolocation code.
    */
  @js.native
  trait GetGeoLocationResponse extends js.Object {
    var GeoLocationDetails: GeoLocationDetails
  }

  object GetGeoLocationResponse {
    @inline
    def apply(
        GeoLocationDetails: GeoLocationDetails
    ): GetGeoLocationResponse = {
      val __obj = js.Dynamic.literal(
        "GeoLocationDetails" -> GeoLocationDetails.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetGeoLocationResponse]
    }
  }

  /**
    * A request for the number of health checks that are associated with the current AWS account.
    */
  @js.native
  trait GetHealthCheckCountRequest extends js.Object {}

  object GetHealthCheckCountRequest {
    @inline
    def apply(
    ): GetHealthCheckCountRequest = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[GetHealthCheckCountRequest]
    }
  }

  /**
    * A complex type that contains the response to a <code>GetHealthCheckCount</code> request.
    */
  @js.native
  trait GetHealthCheckCountResponse extends js.Object {
    var HealthCheckCount: HealthCheckCount
  }

  object GetHealthCheckCountResponse {
    @inline
    def apply(
        HealthCheckCount: HealthCheckCount
    ): GetHealthCheckCountResponse = {
      val __obj = js.Dynamic.literal(
        "HealthCheckCount" -> HealthCheckCount.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetHealthCheckCountResponse]
    }
  }

  /**
    * A request for the reason that a health check failed most recently.
    */
  @js.native
  trait GetHealthCheckLastFailureReasonRequest extends js.Object {
    var HealthCheckId: HealthCheckId
  }

  object GetHealthCheckLastFailureReasonRequest {
    @inline
    def apply(
        HealthCheckId: HealthCheckId
    ): GetHealthCheckLastFailureReasonRequest = {
      val __obj = js.Dynamic.literal(
        "HealthCheckId" -> HealthCheckId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetHealthCheckLastFailureReasonRequest]
    }
  }

  /**
    * A complex type that contains the response to a <code>GetHealthCheckLastFailureReason</code> request.
    */
  @js.native
  trait GetHealthCheckLastFailureReasonResponse extends js.Object {
    var HealthCheckObservations: HealthCheckObservations
  }

  object GetHealthCheckLastFailureReasonResponse {
    @inline
    def apply(
        HealthCheckObservations: HealthCheckObservations
    ): GetHealthCheckLastFailureReasonResponse = {
      val __obj = js.Dynamic.literal(
        "HealthCheckObservations" -> HealthCheckObservations.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetHealthCheckLastFailureReasonResponse]
    }
  }

  /**
    * A request to get information about a specified health check.
    */
  @js.native
  trait GetHealthCheckRequest extends js.Object {
    var HealthCheckId: HealthCheckId
  }

  object GetHealthCheckRequest {
    @inline
    def apply(
        HealthCheckId: HealthCheckId
    ): GetHealthCheckRequest = {
      val __obj = js.Dynamic.literal(
        "HealthCheckId" -> HealthCheckId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetHealthCheckRequest]
    }
  }

  /**
    * A complex type that contains the response to a <code>GetHealthCheck</code> request.
    */
  @js.native
  trait GetHealthCheckResponse extends js.Object {
    var HealthCheck: HealthCheck
  }

  object GetHealthCheckResponse {
    @inline
    def apply(
        HealthCheck: HealthCheck
    ): GetHealthCheckResponse = {
      val __obj = js.Dynamic.literal(
        "HealthCheck" -> HealthCheck.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetHealthCheckResponse]
    }
  }

  /**
    * A request to get the status for a health check.
    */
  @js.native
  trait GetHealthCheckStatusRequest extends js.Object {
    var HealthCheckId: HealthCheckId
  }

  object GetHealthCheckStatusRequest {
    @inline
    def apply(
        HealthCheckId: HealthCheckId
    ): GetHealthCheckStatusRequest = {
      val __obj = js.Dynamic.literal(
        "HealthCheckId" -> HealthCheckId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetHealthCheckStatusRequest]
    }
  }

  /**
    * A complex type that contains the response to a <code>GetHealthCheck</code> request.
    */
  @js.native
  trait GetHealthCheckStatusResponse extends js.Object {
    var HealthCheckObservations: HealthCheckObservations
  }

  object GetHealthCheckStatusResponse {
    @inline
    def apply(
        HealthCheckObservations: HealthCheckObservations
    ): GetHealthCheckStatusResponse = {
      val __obj = js.Dynamic.literal(
        "HealthCheckObservations" -> HealthCheckObservations.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetHealthCheckStatusResponse]
    }
  }

  /**
    * A request to retrieve a count of all the hosted zones that are associated with the current AWS account.
    */
  @js.native
  trait GetHostedZoneCountRequest extends js.Object {}

  object GetHostedZoneCountRequest {
    @inline
    def apply(
    ): GetHostedZoneCountRequest = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[GetHostedZoneCountRequest]
    }
  }

  /**
    * A complex type that contains the response to a <code>GetHostedZoneCount</code> request.
    */
  @js.native
  trait GetHostedZoneCountResponse extends js.Object {
    var HostedZoneCount: HostedZoneCount
  }

  object GetHostedZoneCountResponse {
    @inline
    def apply(
        HostedZoneCount: HostedZoneCount
    ): GetHostedZoneCountResponse = {
      val __obj = js.Dynamic.literal(
        "HostedZoneCount" -> HostedZoneCount.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetHostedZoneCountResponse]
    }
  }

  /**
    * A complex type that contains information about the request to create a hosted zone.
    */
  @js.native
  trait GetHostedZoneLimitRequest extends js.Object {
    var HostedZoneId: ResourceId
    var Type: HostedZoneLimitType
  }

  object GetHostedZoneLimitRequest {
    @inline
    def apply(
        HostedZoneId: ResourceId,
        Type: HostedZoneLimitType
    ): GetHostedZoneLimitRequest = {
      val __obj = js.Dynamic.literal(
        "HostedZoneId" -> HostedZoneId.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetHostedZoneLimitRequest]
    }
  }

  /**
    * A complex type that contains the requested limit.
    */
  @js.native
  trait GetHostedZoneLimitResponse extends js.Object {
    var Count: UsageCount
    var Limit: HostedZoneLimit
  }

  object GetHostedZoneLimitResponse {
    @inline
    def apply(
        Count: UsageCount,
        Limit: HostedZoneLimit
    ): GetHostedZoneLimitResponse = {
      val __obj = js.Dynamic.literal(
        "Count" -> Count.asInstanceOf[js.Any],
        "Limit" -> Limit.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetHostedZoneLimitResponse]
    }
  }

  /**
    * A request to get information about a specified hosted zone.
    */
  @js.native
  trait GetHostedZoneRequest extends js.Object {
    var Id: ResourceId
  }

  object GetHostedZoneRequest {
    @inline
    def apply(
        Id: ResourceId
    ): GetHostedZoneRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetHostedZoneRequest]
    }
  }

  /**
    * A complex type that contain the response to a <code>GetHostedZone</code> request.
    */
  @js.native
  trait GetHostedZoneResponse extends js.Object {
    var HostedZone: HostedZone
    var DelegationSet: js.UndefOr[DelegationSet]
    var VPCs: js.UndefOr[VPCs]
  }

  object GetHostedZoneResponse {
    @inline
    def apply(
        HostedZone: HostedZone,
        DelegationSet: js.UndefOr[DelegationSet] = js.undefined,
        VPCs: js.UndefOr[VPCs] = js.undefined
    ): GetHostedZoneResponse = {
      val __obj = js.Dynamic.literal(
        "HostedZone" -> HostedZone.asInstanceOf[js.Any]
      )

      DelegationSet.foreach(__v => __obj.updateDynamic("DelegationSet")(__v.asInstanceOf[js.Any]))
      VPCs.foreach(__v => __obj.updateDynamic("VPCs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetHostedZoneResponse]
    }
  }

  @js.native
  trait GetQueryLoggingConfigRequest extends js.Object {
    var Id: QueryLoggingConfigId
  }

  object GetQueryLoggingConfigRequest {
    @inline
    def apply(
        Id: QueryLoggingConfigId
    ): GetQueryLoggingConfigRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetQueryLoggingConfigRequest]
    }
  }

  @js.native
  trait GetQueryLoggingConfigResponse extends js.Object {
    var QueryLoggingConfig: QueryLoggingConfig
  }

  object GetQueryLoggingConfigResponse {
    @inline
    def apply(
        QueryLoggingConfig: QueryLoggingConfig
    ): GetQueryLoggingConfigResponse = {
      val __obj = js.Dynamic.literal(
        "QueryLoggingConfig" -> QueryLoggingConfig.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetQueryLoggingConfigResponse]
    }
  }

  /**
    * A complex type that contains information about the request to create a hosted zone.
    */
  @js.native
  trait GetReusableDelegationSetLimitRequest extends js.Object {
    var DelegationSetId: ResourceId
    var Type: ReusableDelegationSetLimitType
  }

  object GetReusableDelegationSetLimitRequest {
    @inline
    def apply(
        DelegationSetId: ResourceId,
        Type: ReusableDelegationSetLimitType
    ): GetReusableDelegationSetLimitRequest = {
      val __obj = js.Dynamic.literal(
        "DelegationSetId" -> DelegationSetId.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetReusableDelegationSetLimitRequest]
    }
  }

  /**
    * A complex type that contains the requested limit.
    */
  @js.native
  trait GetReusableDelegationSetLimitResponse extends js.Object {
    var Count: UsageCount
    var Limit: ReusableDelegationSetLimit
  }

  object GetReusableDelegationSetLimitResponse {
    @inline
    def apply(
        Count: UsageCount,
        Limit: ReusableDelegationSetLimit
    ): GetReusableDelegationSetLimitResponse = {
      val __obj = js.Dynamic.literal(
        "Count" -> Count.asInstanceOf[js.Any],
        "Limit" -> Limit.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetReusableDelegationSetLimitResponse]
    }
  }

  /**
    * A request to get information about a specified reusable delegation set.
    */
  @js.native
  trait GetReusableDelegationSetRequest extends js.Object {
    var Id: ResourceId
  }

  object GetReusableDelegationSetRequest {
    @inline
    def apply(
        Id: ResourceId
    ): GetReusableDelegationSetRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetReusableDelegationSetRequest]
    }
  }

  /**
    * A complex type that contains the response to the <code>GetReusableDelegationSet</code> request.
    */
  @js.native
  trait GetReusableDelegationSetResponse extends js.Object {
    var DelegationSet: DelegationSet
  }

  object GetReusableDelegationSetResponse {
    @inline
    def apply(
        DelegationSet: DelegationSet
    ): GetReusableDelegationSetResponse = {
      val __obj = js.Dynamic.literal(
        "DelegationSet" -> DelegationSet.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetReusableDelegationSetResponse]
    }
  }

  /**
    * Request to get the number of traffic policy instances that are associated with the current AWS account.
    */
  @js.native
  trait GetTrafficPolicyInstanceCountRequest extends js.Object {}

  object GetTrafficPolicyInstanceCountRequest {
    @inline
    def apply(
    ): GetTrafficPolicyInstanceCountRequest = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[GetTrafficPolicyInstanceCountRequest]
    }
  }

  /**
    * A complex type that contains information about the resource record sets that Amazon Route 53 created based on a specified traffic policy.
    */
  @js.native
  trait GetTrafficPolicyInstanceCountResponse extends js.Object {
    var TrafficPolicyInstanceCount: TrafficPolicyInstanceCount
  }

  object GetTrafficPolicyInstanceCountResponse {
    @inline
    def apply(
        TrafficPolicyInstanceCount: TrafficPolicyInstanceCount
    ): GetTrafficPolicyInstanceCountResponse = {
      val __obj = js.Dynamic.literal(
        "TrafficPolicyInstanceCount" -> TrafficPolicyInstanceCount.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetTrafficPolicyInstanceCountResponse]
    }
  }

  /**
    * Gets information about a specified traffic policy instance.
    */
  @js.native
  trait GetTrafficPolicyInstanceRequest extends js.Object {
    var Id: TrafficPolicyInstanceId
  }

  object GetTrafficPolicyInstanceRequest {
    @inline
    def apply(
        Id: TrafficPolicyInstanceId
    ): GetTrafficPolicyInstanceRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetTrafficPolicyInstanceRequest]
    }
  }

  /**
    * A complex type that contains information about the resource record sets that Amazon Route 53 created based on a specified traffic policy.
    */
  @js.native
  trait GetTrafficPolicyInstanceResponse extends js.Object {
    var TrafficPolicyInstance: TrafficPolicyInstance
  }

  object GetTrafficPolicyInstanceResponse {
    @inline
    def apply(
        TrafficPolicyInstance: TrafficPolicyInstance
    ): GetTrafficPolicyInstanceResponse = {
      val __obj = js.Dynamic.literal(
        "TrafficPolicyInstance" -> TrafficPolicyInstance.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetTrafficPolicyInstanceResponse]
    }
  }

  /**
    * Gets information about a specific traffic policy version.
    */
  @js.native
  trait GetTrafficPolicyRequest extends js.Object {
    var Id: TrafficPolicyId
    var Version: TrafficPolicyVersion
  }

  object GetTrafficPolicyRequest {
    @inline
    def apply(
        Id: TrafficPolicyId,
        Version: TrafficPolicyVersion
    ): GetTrafficPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "Version" -> Version.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetTrafficPolicyRequest]
    }
  }

  /**
    * A complex type that contains the response information for the request.
    */
  @js.native
  trait GetTrafficPolicyResponse extends js.Object {
    var TrafficPolicy: TrafficPolicy
  }

  object GetTrafficPolicyResponse {
    @inline
    def apply(
        TrafficPolicy: TrafficPolicy
    ): GetTrafficPolicyResponse = {
      val __obj = js.Dynamic.literal(
        "TrafficPolicy" -> TrafficPolicy.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetTrafficPolicyResponse]
    }
  }

  /**
    * A complex type that contains information about one health check that is associated with the current AWS account.
    */
  @js.native
  trait HealthCheck extends js.Object {
    var CallerReference: HealthCheckNonce
    var HealthCheckConfig: HealthCheckConfig
    var HealthCheckVersion: HealthCheckVersion
    var Id: HealthCheckId
    var CloudWatchAlarmConfiguration: js.UndefOr[CloudWatchAlarmConfiguration]
    var LinkedService: js.UndefOr[LinkedService]
  }

  object HealthCheck {
    @inline
    def apply(
        CallerReference: HealthCheckNonce,
        HealthCheckConfig: HealthCheckConfig,
        HealthCheckVersion: HealthCheckVersion,
        Id: HealthCheckId,
        CloudWatchAlarmConfiguration: js.UndefOr[CloudWatchAlarmConfiguration] = js.undefined,
        LinkedService: js.UndefOr[LinkedService] = js.undefined
    ): HealthCheck = {
      val __obj = js.Dynamic.literal(
        "CallerReference" -> CallerReference.asInstanceOf[js.Any],
        "HealthCheckConfig" -> HealthCheckConfig.asInstanceOf[js.Any],
        "HealthCheckVersion" -> HealthCheckVersion.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any]
      )

      CloudWatchAlarmConfiguration.foreach(__v =>
        __obj.updateDynamic("CloudWatchAlarmConfiguration")(__v.asInstanceOf[js.Any])
      )
      LinkedService.foreach(__v => __obj.updateDynamic("LinkedService")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HealthCheck]
    }
  }

  /**
    * A complex type that contains information about the health check.
    */
  @js.native
  trait HealthCheckConfig extends js.Object {
    var Type: HealthCheckType
    var AlarmIdentifier: js.UndefOr[AlarmIdentifier]
    var ChildHealthChecks: js.UndefOr[ChildHealthCheckList]
    var Disabled: js.UndefOr[Disabled]
    var EnableSNI: js.UndefOr[EnableSNI]
    var FailureThreshold: js.UndefOr[FailureThreshold]
    var FullyQualifiedDomainName: js.UndefOr[FullyQualifiedDomainName]
    var HealthThreshold: js.UndefOr[HealthThreshold]
    var IPAddress: js.UndefOr[IPAddress]
    var InsufficientDataHealthStatus: js.UndefOr[InsufficientDataHealthStatus]
    var Inverted: js.UndefOr[Inverted]
    var MeasureLatency: js.UndefOr[MeasureLatency]
    var Port: js.UndefOr[Port]
    var Regions: js.UndefOr[HealthCheckRegionList]
    var RequestInterval: js.UndefOr[RequestInterval]
    var ResourcePath: js.UndefOr[ResourcePath]
    var SearchString: js.UndefOr[SearchString]
  }

  object HealthCheckConfig {
    @inline
    def apply(
        Type: HealthCheckType,
        AlarmIdentifier: js.UndefOr[AlarmIdentifier] = js.undefined,
        ChildHealthChecks: js.UndefOr[ChildHealthCheckList] = js.undefined,
        Disabled: js.UndefOr[Disabled] = js.undefined,
        EnableSNI: js.UndefOr[EnableSNI] = js.undefined,
        FailureThreshold: js.UndefOr[FailureThreshold] = js.undefined,
        FullyQualifiedDomainName: js.UndefOr[FullyQualifiedDomainName] = js.undefined,
        HealthThreshold: js.UndefOr[HealthThreshold] = js.undefined,
        IPAddress: js.UndefOr[IPAddress] = js.undefined,
        InsufficientDataHealthStatus: js.UndefOr[InsufficientDataHealthStatus] = js.undefined,
        Inverted: js.UndefOr[Inverted] = js.undefined,
        MeasureLatency: js.UndefOr[MeasureLatency] = js.undefined,
        Port: js.UndefOr[Port] = js.undefined,
        Regions: js.UndefOr[HealthCheckRegionList] = js.undefined,
        RequestInterval: js.UndefOr[RequestInterval] = js.undefined,
        ResourcePath: js.UndefOr[ResourcePath] = js.undefined,
        SearchString: js.UndefOr[SearchString] = js.undefined
    ): HealthCheckConfig = {
      val __obj = js.Dynamic.literal(
        "Type" -> Type.asInstanceOf[js.Any]
      )

      AlarmIdentifier.foreach(__v => __obj.updateDynamic("AlarmIdentifier")(__v.asInstanceOf[js.Any]))
      ChildHealthChecks.foreach(__v => __obj.updateDynamic("ChildHealthChecks")(__v.asInstanceOf[js.Any]))
      Disabled.foreach(__v => __obj.updateDynamic("Disabled")(__v.asInstanceOf[js.Any]))
      EnableSNI.foreach(__v => __obj.updateDynamic("EnableSNI")(__v.asInstanceOf[js.Any]))
      FailureThreshold.foreach(__v => __obj.updateDynamic("FailureThreshold")(__v.asInstanceOf[js.Any]))
      FullyQualifiedDomainName.foreach(__v => __obj.updateDynamic("FullyQualifiedDomainName")(__v.asInstanceOf[js.Any]))
      HealthThreshold.foreach(__v => __obj.updateDynamic("HealthThreshold")(__v.asInstanceOf[js.Any]))
      IPAddress.foreach(__v => __obj.updateDynamic("IPAddress")(__v.asInstanceOf[js.Any]))
      InsufficientDataHealthStatus.foreach(__v =>
        __obj.updateDynamic("InsufficientDataHealthStatus")(__v.asInstanceOf[js.Any])
      )
      Inverted.foreach(__v => __obj.updateDynamic("Inverted")(__v.asInstanceOf[js.Any]))
      MeasureLatency.foreach(__v => __obj.updateDynamic("MeasureLatency")(__v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      Regions.foreach(__v => __obj.updateDynamic("Regions")(__v.asInstanceOf[js.Any]))
      RequestInterval.foreach(__v => __obj.updateDynamic("RequestInterval")(__v.asInstanceOf[js.Any]))
      ResourcePath.foreach(__v => __obj.updateDynamic("ResourcePath")(__v.asInstanceOf[js.Any]))
      SearchString.foreach(__v => __obj.updateDynamic("SearchString")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HealthCheckConfig]
    }
  }

  /**
    * A complex type that contains the last failure reason as reported by one Amazon Route 53 health checker.
    */
  @js.native
  trait HealthCheckObservation extends js.Object {
    var IPAddress: js.UndefOr[IPAddress]
    var Region: js.UndefOr[HealthCheckRegion]
    var StatusReport: js.UndefOr[StatusReport]
  }

  object HealthCheckObservation {
    @inline
    def apply(
        IPAddress: js.UndefOr[IPAddress] = js.undefined,
        Region: js.UndefOr[HealthCheckRegion] = js.undefined,
        StatusReport: js.UndefOr[StatusReport] = js.undefined
    ): HealthCheckObservation = {
      val __obj = js.Dynamic.literal()
      IPAddress.foreach(__v => __obj.updateDynamic("IPAddress")(__v.asInstanceOf[js.Any]))
      Region.foreach(__v => __obj.updateDynamic("Region")(__v.asInstanceOf[js.Any]))
      StatusReport.foreach(__v => __obj.updateDynamic("StatusReport")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HealthCheckObservation]
    }
  }

  @js.native
  sealed trait HealthCheckRegion extends js.Any
  object HealthCheckRegion extends js.Object {
    val `us-east-1` = "us-east-1".asInstanceOf[HealthCheckRegion]
    val `us-west-1` = "us-west-1".asInstanceOf[HealthCheckRegion]
    val `us-west-2` = "us-west-2".asInstanceOf[HealthCheckRegion]
    val `eu-west-1` = "eu-west-1".asInstanceOf[HealthCheckRegion]
    val `ap-southeast-1` = "ap-southeast-1".asInstanceOf[HealthCheckRegion]
    val `ap-southeast-2` = "ap-southeast-2".asInstanceOf[HealthCheckRegion]
    val `ap-northeast-1` = "ap-northeast-1".asInstanceOf[HealthCheckRegion]
    val `sa-east-1` = "sa-east-1".asInstanceOf[HealthCheckRegion]

    val values = js.Object.freeze(
      js.Array(
        `us-east-1`,
        `us-west-1`,
        `us-west-2`,
        `eu-west-1`,
        `ap-southeast-1`,
        `ap-southeast-2`,
        `ap-northeast-1`,
        `sa-east-1`
      )
    )
  }

  @js.native
  sealed trait HealthCheckType extends js.Any
  object HealthCheckType extends js.Object {
    val HTTP = "HTTP".asInstanceOf[HealthCheckType]
    val HTTPS = "HTTPS".asInstanceOf[HealthCheckType]
    val HTTP_STR_MATCH = "HTTP_STR_MATCH".asInstanceOf[HealthCheckType]
    val HTTPS_STR_MATCH = "HTTPS_STR_MATCH".asInstanceOf[HealthCheckType]
    val TCP = "TCP".asInstanceOf[HealthCheckType]
    val CALCULATED = "CALCULATED".asInstanceOf[HealthCheckType]
    val CLOUDWATCH_METRIC = "CLOUDWATCH_METRIC".asInstanceOf[HealthCheckType]

    val values =
      js.Object.freeze(js.Array(HTTP, HTTPS, HTTP_STR_MATCH, HTTPS_STR_MATCH, TCP, CALCULATED, CLOUDWATCH_METRIC))
  }

  /**
    * A complex type that contains general information about the hosted zone.
    */
  @js.native
  trait HostedZone extends js.Object {
    var CallerReference: Nonce
    var Id: ResourceId
    var Name: DNSName
    var Config: js.UndefOr[HostedZoneConfig]
    var LinkedService: js.UndefOr[LinkedService]
    var ResourceRecordSetCount: js.UndefOr[HostedZoneRRSetCount]
  }

  object HostedZone {
    @inline
    def apply(
        CallerReference: Nonce,
        Id: ResourceId,
        Name: DNSName,
        Config: js.UndefOr[HostedZoneConfig] = js.undefined,
        LinkedService: js.UndefOr[LinkedService] = js.undefined,
        ResourceRecordSetCount: js.UndefOr[HostedZoneRRSetCount] = js.undefined
    ): HostedZone = {
      val __obj = js.Dynamic.literal(
        "CallerReference" -> CallerReference.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Config.foreach(__v => __obj.updateDynamic("Config")(__v.asInstanceOf[js.Any]))
      LinkedService.foreach(__v => __obj.updateDynamic("LinkedService")(__v.asInstanceOf[js.Any]))
      ResourceRecordSetCount.foreach(__v => __obj.updateDynamic("ResourceRecordSetCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HostedZone]
    }
  }

  /**
    * A complex type that contains an optional comment about your hosted zone. If you don't want to specify a comment, omit both the <code>HostedZoneConfig</code> and <code>Comment</code> elements.
    */
  @js.native
  trait HostedZoneConfig extends js.Object {
    var Comment: js.UndefOr[ResourceDescription]
    var PrivateZone: js.UndefOr[IsPrivateZone]
  }

  object HostedZoneConfig {
    @inline
    def apply(
        Comment: js.UndefOr[ResourceDescription] = js.undefined,
        PrivateZone: js.UndefOr[IsPrivateZone] = js.undefined
    ): HostedZoneConfig = {
      val __obj = js.Dynamic.literal()
      Comment.foreach(__v => __obj.updateDynamic("Comment")(__v.asInstanceOf[js.Any]))
      PrivateZone.foreach(__v => __obj.updateDynamic("PrivateZone")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HostedZoneConfig]
    }
  }

  /**
    * A complex type that contains the type of limit that you specified in the request and the current value for that limit.
    */
  @js.native
  trait HostedZoneLimit extends js.Object {
    var Type: HostedZoneLimitType
    var Value: LimitValue
  }

  object HostedZoneLimit {
    @inline
    def apply(
        Type: HostedZoneLimitType,
        Value: LimitValue
    ): HostedZoneLimit = {
      val __obj = js.Dynamic.literal(
        "Type" -> Type.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[HostedZoneLimit]
    }
  }

  @js.native
  sealed trait HostedZoneLimitType extends js.Any
  object HostedZoneLimitType extends js.Object {
    val MAX_RRSETS_BY_ZONE = "MAX_RRSETS_BY_ZONE".asInstanceOf[HostedZoneLimitType]
    val MAX_VPCS_ASSOCIATED_BY_ZONE = "MAX_VPCS_ASSOCIATED_BY_ZONE".asInstanceOf[HostedZoneLimitType]

    val values = js.Object.freeze(js.Array(MAX_RRSETS_BY_ZONE, MAX_VPCS_ASSOCIATED_BY_ZONE))
  }

  /**
    * A complex type that identifies a hosted zone that a specified Amazon VPC is associated with and the owner of the hosted zone. If there is a value for <code>OwningAccount</code>, there is no value for <code>OwningService</code>, and vice versa.
    */
  @js.native
  trait HostedZoneOwner extends js.Object {
    var OwningAccount: js.UndefOr[AWSAccountID]
    var OwningService: js.UndefOr[HostedZoneOwningService]
  }

  object HostedZoneOwner {
    @inline
    def apply(
        OwningAccount: js.UndefOr[AWSAccountID] = js.undefined,
        OwningService: js.UndefOr[HostedZoneOwningService] = js.undefined
    ): HostedZoneOwner = {
      val __obj = js.Dynamic.literal()
      OwningAccount.foreach(__v => __obj.updateDynamic("OwningAccount")(__v.asInstanceOf[js.Any]))
      OwningService.foreach(__v => __obj.updateDynamic("OwningService")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HostedZoneOwner]
    }
  }

  /**
    * In the response to a <code>ListHostedZonesByVPC</code> request, the <code>HostedZoneSummaries</code> element contains one <code>HostedZoneSummary</code> element for each hosted zone that the specified Amazon VPC is associated with. Each <code>HostedZoneSummary</code> element contains the hosted zone name and ID, and information about who owns the hosted zone.
    */
  @js.native
  trait HostedZoneSummary extends js.Object {
    var HostedZoneId: ResourceId
    var Name: DNSName
    var Owner: HostedZoneOwner
  }

  object HostedZoneSummary {
    @inline
    def apply(
        HostedZoneId: ResourceId,
        Name: DNSName,
        Owner: HostedZoneOwner
    ): HostedZoneSummary = {
      val __obj = js.Dynamic.literal(
        "HostedZoneId" -> HostedZoneId.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Owner" -> Owner.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[HostedZoneSummary]
    }
  }

  @js.native
  sealed trait InsufficientDataHealthStatus extends js.Any
  object InsufficientDataHealthStatus extends js.Object {
    val Healthy = "Healthy".asInstanceOf[InsufficientDataHealthStatus]
    val Unhealthy = "Unhealthy".asInstanceOf[InsufficientDataHealthStatus]
    val LastKnownStatus = "LastKnownStatus".asInstanceOf[InsufficientDataHealthStatus]

    val values = js.Object.freeze(js.Array(Healthy, Unhealthy, LastKnownStatus))
  }

  /**
    * If a health check or hosted zone was created by another service, <code>LinkedService</code> is a complex type that describes the service that created the resource. When a resource is created by another service, you can't edit or delete it using Amazon Route 53.
    */
  @js.native
  trait LinkedService extends js.Object {
    var Description: js.UndefOr[ResourceDescription]
    var ServicePrincipal: js.UndefOr[ServicePrincipal]
  }

  object LinkedService {
    @inline
    def apply(
        Description: js.UndefOr[ResourceDescription] = js.undefined,
        ServicePrincipal: js.UndefOr[ServicePrincipal] = js.undefined
    ): LinkedService = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      ServicePrincipal.foreach(__v => __obj.updateDynamic("ServicePrincipal")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LinkedService]
    }
  }

  /**
    * A request to get a list of geographic locations that Amazon Route 53 supports for geolocation resource record sets.
    */
  @js.native
  trait ListGeoLocationsRequest extends js.Object {
    var MaxItems: js.UndefOr[PageMaxItems]
    var StartContinentCode: js.UndefOr[GeoLocationContinentCode]
    var StartCountryCode: js.UndefOr[GeoLocationCountryCode]
    var StartSubdivisionCode: js.UndefOr[GeoLocationSubdivisionCode]
  }

  object ListGeoLocationsRequest {
    @inline
    def apply(
        MaxItems: js.UndefOr[PageMaxItems] = js.undefined,
        StartContinentCode: js.UndefOr[GeoLocationContinentCode] = js.undefined,
        StartCountryCode: js.UndefOr[GeoLocationCountryCode] = js.undefined,
        StartSubdivisionCode: js.UndefOr[GeoLocationSubdivisionCode] = js.undefined
    ): ListGeoLocationsRequest = {
      val __obj = js.Dynamic.literal()
      MaxItems.foreach(__v => __obj.updateDynamic("MaxItems")(__v.asInstanceOf[js.Any]))
      StartContinentCode.foreach(__v => __obj.updateDynamic("StartContinentCode")(__v.asInstanceOf[js.Any]))
      StartCountryCode.foreach(__v => __obj.updateDynamic("StartCountryCode")(__v.asInstanceOf[js.Any]))
      StartSubdivisionCode.foreach(__v => __obj.updateDynamic("StartSubdivisionCode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGeoLocationsRequest]
    }
  }

  /**
    * A complex type containing the response information for the request.
    */
  @js.native
  trait ListGeoLocationsResponse extends js.Object {
    var GeoLocationDetailsList: GeoLocationDetailsList
    var IsTruncated: PageTruncated
    var MaxItems: PageMaxItems
    var NextContinentCode: js.UndefOr[GeoLocationContinentCode]
    var NextCountryCode: js.UndefOr[GeoLocationCountryCode]
    var NextSubdivisionCode: js.UndefOr[GeoLocationSubdivisionCode]
  }

  object ListGeoLocationsResponse {
    @inline
    def apply(
        GeoLocationDetailsList: GeoLocationDetailsList,
        IsTruncated: PageTruncated,
        MaxItems: PageMaxItems,
        NextContinentCode: js.UndefOr[GeoLocationContinentCode] = js.undefined,
        NextCountryCode: js.UndefOr[GeoLocationCountryCode] = js.undefined,
        NextSubdivisionCode: js.UndefOr[GeoLocationSubdivisionCode] = js.undefined
    ): ListGeoLocationsResponse = {
      val __obj = js.Dynamic.literal(
        "GeoLocationDetailsList" -> GeoLocationDetailsList.asInstanceOf[js.Any],
        "IsTruncated" -> IsTruncated.asInstanceOf[js.Any],
        "MaxItems" -> MaxItems.asInstanceOf[js.Any]
      )

      NextContinentCode.foreach(__v => __obj.updateDynamic("NextContinentCode")(__v.asInstanceOf[js.Any]))
      NextCountryCode.foreach(__v => __obj.updateDynamic("NextCountryCode")(__v.asInstanceOf[js.Any]))
      NextSubdivisionCode.foreach(__v => __obj.updateDynamic("NextSubdivisionCode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGeoLocationsResponse]
    }
  }

  /**
    * A request to retrieve a list of the health checks that are associated with the current AWS account.
    */
  @js.native
  trait ListHealthChecksRequest extends js.Object {
    var Marker: js.UndefOr[PageMarker]
    var MaxItems: js.UndefOr[PageMaxItems]
  }

  object ListHealthChecksRequest {
    @inline
    def apply(
        Marker: js.UndefOr[PageMarker] = js.undefined,
        MaxItems: js.UndefOr[PageMaxItems] = js.undefined
    ): ListHealthChecksRequest = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.updateDynamic("MaxItems")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListHealthChecksRequest]
    }
  }

  /**
    * A complex type that contains the response to a <code>ListHealthChecks</code> request.
    */
  @js.native
  trait ListHealthChecksResponse extends js.Object {
    var HealthChecks: HealthChecks
    var IsTruncated: PageTruncated
    var Marker: PageMarker
    var MaxItems: PageMaxItems
    var NextMarker: js.UndefOr[PageMarker]
  }

  object ListHealthChecksResponse {
    @inline
    def apply(
        HealthChecks: HealthChecks,
        IsTruncated: PageTruncated,
        Marker: PageMarker,
        MaxItems: PageMaxItems,
        NextMarker: js.UndefOr[PageMarker] = js.undefined
    ): ListHealthChecksResponse = {
      val __obj = js.Dynamic.literal(
        "HealthChecks" -> HealthChecks.asInstanceOf[js.Any],
        "IsTruncated" -> IsTruncated.asInstanceOf[js.Any],
        "Marker" -> Marker.asInstanceOf[js.Any],
        "MaxItems" -> MaxItems.asInstanceOf[js.Any]
      )

      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListHealthChecksResponse]
    }
  }

  /**
    * Retrieves a list of the public and private hosted zones that are associated with the current AWS account in ASCII order by domain name.
    */
  @js.native
  trait ListHostedZonesByNameRequest extends js.Object {
    var DNSName: js.UndefOr[DNSName]
    var HostedZoneId: js.UndefOr[ResourceId]
    var MaxItems: js.UndefOr[PageMaxItems]
  }

  object ListHostedZonesByNameRequest {
    @inline
    def apply(
        DNSName: js.UndefOr[DNSName] = js.undefined,
        HostedZoneId: js.UndefOr[ResourceId] = js.undefined,
        MaxItems: js.UndefOr[PageMaxItems] = js.undefined
    ): ListHostedZonesByNameRequest = {
      val __obj = js.Dynamic.literal()
      DNSName.foreach(__v => __obj.updateDynamic("DNSName")(__v.asInstanceOf[js.Any]))
      HostedZoneId.foreach(__v => __obj.updateDynamic("HostedZoneId")(__v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.updateDynamic("MaxItems")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListHostedZonesByNameRequest]
    }
  }

  /**
    * A complex type that contains the response information for the request.
    */
  @js.native
  trait ListHostedZonesByNameResponse extends js.Object {
    var HostedZones: HostedZones
    var IsTruncated: PageTruncated
    var MaxItems: PageMaxItems
    var DNSName: js.UndefOr[DNSName]
    var HostedZoneId: js.UndefOr[ResourceId]
    var NextDNSName: js.UndefOr[DNSName]
    var NextHostedZoneId: js.UndefOr[ResourceId]
  }

  object ListHostedZonesByNameResponse {
    @inline
    def apply(
        HostedZones: HostedZones,
        IsTruncated: PageTruncated,
        MaxItems: PageMaxItems,
        DNSName: js.UndefOr[DNSName] = js.undefined,
        HostedZoneId: js.UndefOr[ResourceId] = js.undefined,
        NextDNSName: js.UndefOr[DNSName] = js.undefined,
        NextHostedZoneId: js.UndefOr[ResourceId] = js.undefined
    ): ListHostedZonesByNameResponse = {
      val __obj = js.Dynamic.literal(
        "HostedZones" -> HostedZones.asInstanceOf[js.Any],
        "IsTruncated" -> IsTruncated.asInstanceOf[js.Any],
        "MaxItems" -> MaxItems.asInstanceOf[js.Any]
      )

      DNSName.foreach(__v => __obj.updateDynamic("DNSName")(__v.asInstanceOf[js.Any]))
      HostedZoneId.foreach(__v => __obj.updateDynamic("HostedZoneId")(__v.asInstanceOf[js.Any]))
      NextDNSName.foreach(__v => __obj.updateDynamic("NextDNSName")(__v.asInstanceOf[js.Any]))
      NextHostedZoneId.foreach(__v => __obj.updateDynamic("NextHostedZoneId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListHostedZonesByNameResponse]
    }
  }

  /**
    * Lists all the private hosted zones that a specified VPC is associated with, regardless of which AWS account created the hosted zones.
    */
  @js.native
  trait ListHostedZonesByVPCRequest extends js.Object {
    var VPCId: VPCId
    var VPCRegion: VPCRegion
    var MaxItems: js.UndefOr[PageMaxItems]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListHostedZonesByVPCRequest {
    @inline
    def apply(
        VPCId: VPCId,
        VPCRegion: VPCRegion,
        MaxItems: js.UndefOr[PageMaxItems] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListHostedZonesByVPCRequest = {
      val __obj = js.Dynamic.literal(
        "VPCId" -> VPCId.asInstanceOf[js.Any],
        "VPCRegion" -> VPCRegion.asInstanceOf[js.Any]
      )

      MaxItems.foreach(__v => __obj.updateDynamic("MaxItems")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListHostedZonesByVPCRequest]
    }
  }

  @js.native
  trait ListHostedZonesByVPCResponse extends js.Object {
    var HostedZoneSummaries: HostedZoneSummaries
    var MaxItems: PageMaxItems
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListHostedZonesByVPCResponse {
    @inline
    def apply(
        HostedZoneSummaries: HostedZoneSummaries,
        MaxItems: PageMaxItems,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListHostedZonesByVPCResponse = {
      val __obj = js.Dynamic.literal(
        "HostedZoneSummaries" -> HostedZoneSummaries.asInstanceOf[js.Any],
        "MaxItems" -> MaxItems.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListHostedZonesByVPCResponse]
    }
  }

  /**
    * A request to retrieve a list of the public and private hosted zones that are associated with the current AWS account.
    */
  @js.native
  trait ListHostedZonesRequest extends js.Object {
    var DelegationSetId: js.UndefOr[ResourceId]
    var Marker: js.UndefOr[PageMarker]
    var MaxItems: js.UndefOr[PageMaxItems]
  }

  object ListHostedZonesRequest {
    @inline
    def apply(
        DelegationSetId: js.UndefOr[ResourceId] = js.undefined,
        Marker: js.UndefOr[PageMarker] = js.undefined,
        MaxItems: js.UndefOr[PageMaxItems] = js.undefined
    ): ListHostedZonesRequest = {
      val __obj = js.Dynamic.literal()
      DelegationSetId.foreach(__v => __obj.updateDynamic("DelegationSetId")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.updateDynamic("MaxItems")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListHostedZonesRequest]
    }
  }

  @js.native
  trait ListHostedZonesResponse extends js.Object {
    var HostedZones: HostedZones
    var IsTruncated: PageTruncated
    var Marker: PageMarker
    var MaxItems: PageMaxItems
    var NextMarker: js.UndefOr[PageMarker]
  }

  object ListHostedZonesResponse {
    @inline
    def apply(
        HostedZones: HostedZones,
        IsTruncated: PageTruncated,
        Marker: PageMarker,
        MaxItems: PageMaxItems,
        NextMarker: js.UndefOr[PageMarker] = js.undefined
    ): ListHostedZonesResponse = {
      val __obj = js.Dynamic.literal(
        "HostedZones" -> HostedZones.asInstanceOf[js.Any],
        "IsTruncated" -> IsTruncated.asInstanceOf[js.Any],
        "Marker" -> Marker.asInstanceOf[js.Any],
        "MaxItems" -> MaxItems.asInstanceOf[js.Any]
      )

      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListHostedZonesResponse]
    }
  }

  @js.native
  trait ListQueryLoggingConfigsRequest extends js.Object {
    var HostedZoneId: js.UndefOr[ResourceId]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListQueryLoggingConfigsRequest {
    @inline
    def apply(
        HostedZoneId: js.UndefOr[ResourceId] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListQueryLoggingConfigsRequest = {
      val __obj = js.Dynamic.literal()
      HostedZoneId.foreach(__v => __obj.updateDynamic("HostedZoneId")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListQueryLoggingConfigsRequest]
    }
  }

  @js.native
  trait ListQueryLoggingConfigsResponse extends js.Object {
    var QueryLoggingConfigs: QueryLoggingConfigs
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListQueryLoggingConfigsResponse {
    @inline
    def apply(
        QueryLoggingConfigs: QueryLoggingConfigs,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListQueryLoggingConfigsResponse = {
      val __obj = js.Dynamic.literal(
        "QueryLoggingConfigs" -> QueryLoggingConfigs.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListQueryLoggingConfigsResponse]
    }
  }

  /**
    * A request for the resource record sets that are associated with a specified hosted zone.
    */
  @js.native
  trait ListResourceRecordSetsRequest extends js.Object {
    var HostedZoneId: ResourceId
    var MaxItems: js.UndefOr[PageMaxItems]
    var StartRecordIdentifier: js.UndefOr[ResourceRecordSetIdentifier]
    var StartRecordName: js.UndefOr[DNSName]
    var StartRecordType: js.UndefOr[RRType]
  }

  object ListResourceRecordSetsRequest {
    @inline
    def apply(
        HostedZoneId: ResourceId,
        MaxItems: js.UndefOr[PageMaxItems] = js.undefined,
        StartRecordIdentifier: js.UndefOr[ResourceRecordSetIdentifier] = js.undefined,
        StartRecordName: js.UndefOr[DNSName] = js.undefined,
        StartRecordType: js.UndefOr[RRType] = js.undefined
    ): ListResourceRecordSetsRequest = {
      val __obj = js.Dynamic.literal(
        "HostedZoneId" -> HostedZoneId.asInstanceOf[js.Any]
      )

      MaxItems.foreach(__v => __obj.updateDynamic("MaxItems")(__v.asInstanceOf[js.Any]))
      StartRecordIdentifier.foreach(__v => __obj.updateDynamic("StartRecordIdentifier")(__v.asInstanceOf[js.Any]))
      StartRecordName.foreach(__v => __obj.updateDynamic("StartRecordName")(__v.asInstanceOf[js.Any]))
      StartRecordType.foreach(__v => __obj.updateDynamic("StartRecordType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResourceRecordSetsRequest]
    }
  }

  /**
    * A complex type that contains list information for the resource record set.
    */
  @js.native
  trait ListResourceRecordSetsResponse extends js.Object {
    var IsTruncated: PageTruncated
    var MaxItems: PageMaxItems
    var ResourceRecordSets: ResourceRecordSets
    var NextRecordIdentifier: js.UndefOr[ResourceRecordSetIdentifier]
    var NextRecordName: js.UndefOr[DNSName]
    var NextRecordType: js.UndefOr[RRType]
  }

  object ListResourceRecordSetsResponse {
    @inline
    def apply(
        IsTruncated: PageTruncated,
        MaxItems: PageMaxItems,
        ResourceRecordSets: ResourceRecordSets,
        NextRecordIdentifier: js.UndefOr[ResourceRecordSetIdentifier] = js.undefined,
        NextRecordName: js.UndefOr[DNSName] = js.undefined,
        NextRecordType: js.UndefOr[RRType] = js.undefined
    ): ListResourceRecordSetsResponse = {
      val __obj = js.Dynamic.literal(
        "IsTruncated" -> IsTruncated.asInstanceOf[js.Any],
        "MaxItems" -> MaxItems.asInstanceOf[js.Any],
        "ResourceRecordSets" -> ResourceRecordSets.asInstanceOf[js.Any]
      )

      NextRecordIdentifier.foreach(__v => __obj.updateDynamic("NextRecordIdentifier")(__v.asInstanceOf[js.Any]))
      NextRecordName.foreach(__v => __obj.updateDynamic("NextRecordName")(__v.asInstanceOf[js.Any]))
      NextRecordType.foreach(__v => __obj.updateDynamic("NextRecordType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResourceRecordSetsResponse]
    }
  }

  /**
    * A request to get a list of the reusable delegation sets that are associated with the current AWS account.
    */
  @js.native
  trait ListReusableDelegationSetsRequest extends js.Object {
    var Marker: js.UndefOr[PageMarker]
    var MaxItems: js.UndefOr[PageMaxItems]
  }

  object ListReusableDelegationSetsRequest {
    @inline
    def apply(
        Marker: js.UndefOr[PageMarker] = js.undefined,
        MaxItems: js.UndefOr[PageMaxItems] = js.undefined
    ): ListReusableDelegationSetsRequest = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.updateDynamic("MaxItems")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListReusableDelegationSetsRequest]
    }
  }

  /**
    * A complex type that contains information about the reusable delegation sets that are associated with the current AWS account.
    */
  @js.native
  trait ListReusableDelegationSetsResponse extends js.Object {
    var DelegationSets: DelegationSets
    var IsTruncated: PageTruncated
    var Marker: PageMarker
    var MaxItems: PageMaxItems
    var NextMarker: js.UndefOr[PageMarker]
  }

  object ListReusableDelegationSetsResponse {
    @inline
    def apply(
        DelegationSets: DelegationSets,
        IsTruncated: PageTruncated,
        Marker: PageMarker,
        MaxItems: PageMaxItems,
        NextMarker: js.UndefOr[PageMarker] = js.undefined
    ): ListReusableDelegationSetsResponse = {
      val __obj = js.Dynamic.literal(
        "DelegationSets" -> DelegationSets.asInstanceOf[js.Any],
        "IsTruncated" -> IsTruncated.asInstanceOf[js.Any],
        "Marker" -> Marker.asInstanceOf[js.Any],
        "MaxItems" -> MaxItems.asInstanceOf[js.Any]
      )

      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListReusableDelegationSetsResponse]
    }
  }

  /**
    * A complex type containing information about a request for a list of the tags that are associated with an individual resource.
    */
  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceId: TagResourceId
    var ResourceType: TagResourceType
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceId: TagResourceId,
        ResourceType: TagResourceType
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "ResourceType" -> ResourceType.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  /**
    * A complex type that contains information about the health checks or hosted zones for which you want to list tags.
    */
  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var ResourceTagSet: ResourceTagSet
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        ResourceTagSet: ResourceTagSet
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal(
        "ResourceTagSet" -> ResourceTagSet.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /**
    * A complex type that contains information about the health checks or hosted zones for which you want to list tags.
    */
  @js.native
  trait ListTagsForResourcesRequest extends js.Object {
    var ResourceIds: TagResourceIdList
    var ResourceType: TagResourceType
  }

  object ListTagsForResourcesRequest {
    @inline
    def apply(
        ResourceIds: TagResourceIdList,
        ResourceType: TagResourceType
    ): ListTagsForResourcesRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceIds" -> ResourceIds.asInstanceOf[js.Any],
        "ResourceType" -> ResourceType.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListTagsForResourcesRequest]
    }
  }

  /**
    * A complex type containing tags for the specified resources.
    */
  @js.native
  trait ListTagsForResourcesResponse extends js.Object {
    var ResourceTagSets: ResourceTagSetList
  }

  object ListTagsForResourcesResponse {
    @inline
    def apply(
        ResourceTagSets: ResourceTagSetList
    ): ListTagsForResourcesResponse = {
      val __obj = js.Dynamic.literal(
        "ResourceTagSets" -> ResourceTagSets.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListTagsForResourcesResponse]
    }
  }

  /**
    * A complex type that contains the information about the request to list the traffic policies that are associated with the current AWS account.
    */
  @js.native
  trait ListTrafficPoliciesRequest extends js.Object {
    var MaxItems: js.UndefOr[PageMaxItems]
    var TrafficPolicyIdMarker: js.UndefOr[TrafficPolicyId]
  }

  object ListTrafficPoliciesRequest {
    @inline
    def apply(
        MaxItems: js.UndefOr[PageMaxItems] = js.undefined,
        TrafficPolicyIdMarker: js.UndefOr[TrafficPolicyId] = js.undefined
    ): ListTrafficPoliciesRequest = {
      val __obj = js.Dynamic.literal()
      MaxItems.foreach(__v => __obj.updateDynamic("MaxItems")(__v.asInstanceOf[js.Any]))
      TrafficPolicyIdMarker.foreach(__v => __obj.updateDynamic("TrafficPolicyIdMarker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTrafficPoliciesRequest]
    }
  }

  /**
    * A complex type that contains the response information for the request.
    */
  @js.native
  trait ListTrafficPoliciesResponse extends js.Object {
    var IsTruncated: PageTruncated
    var MaxItems: PageMaxItems
    var TrafficPolicyIdMarker: TrafficPolicyId
    var TrafficPolicySummaries: TrafficPolicySummaries
  }

  object ListTrafficPoliciesResponse {
    @inline
    def apply(
        IsTruncated: PageTruncated,
        MaxItems: PageMaxItems,
        TrafficPolicyIdMarker: TrafficPolicyId,
        TrafficPolicySummaries: TrafficPolicySummaries
    ): ListTrafficPoliciesResponse = {
      val __obj = js.Dynamic.literal(
        "IsTruncated" -> IsTruncated.asInstanceOf[js.Any],
        "MaxItems" -> MaxItems.asInstanceOf[js.Any],
        "TrafficPolicyIdMarker" -> TrafficPolicyIdMarker.asInstanceOf[js.Any],
        "TrafficPolicySummaries" -> TrafficPolicySummaries.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListTrafficPoliciesResponse]
    }
  }

  /**
    * A request for the traffic policy instances that you created in a specified hosted zone.
    */
  @js.native
  trait ListTrafficPolicyInstancesByHostedZoneRequest extends js.Object {
    var HostedZoneId: ResourceId
    var MaxItems: js.UndefOr[PageMaxItems]
    var TrafficPolicyInstanceNameMarker: js.UndefOr[DNSName]
    var TrafficPolicyInstanceTypeMarker: js.UndefOr[RRType]
  }

  object ListTrafficPolicyInstancesByHostedZoneRequest {
    @inline
    def apply(
        HostedZoneId: ResourceId,
        MaxItems: js.UndefOr[PageMaxItems] = js.undefined,
        TrafficPolicyInstanceNameMarker: js.UndefOr[DNSName] = js.undefined,
        TrafficPolicyInstanceTypeMarker: js.UndefOr[RRType] = js.undefined
    ): ListTrafficPolicyInstancesByHostedZoneRequest = {
      val __obj = js.Dynamic.literal(
        "HostedZoneId" -> HostedZoneId.asInstanceOf[js.Any]
      )

      MaxItems.foreach(__v => __obj.updateDynamic("MaxItems")(__v.asInstanceOf[js.Any]))
      TrafficPolicyInstanceNameMarker.foreach(__v =>
        __obj.updateDynamic("TrafficPolicyInstanceNameMarker")(__v.asInstanceOf[js.Any])
      )
      TrafficPolicyInstanceTypeMarker.foreach(__v =>
        __obj.updateDynamic("TrafficPolicyInstanceTypeMarker")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[ListTrafficPolicyInstancesByHostedZoneRequest]
    }
  }

  /**
    * A complex type that contains the response information for the request.
    */
  @js.native
  trait ListTrafficPolicyInstancesByHostedZoneResponse extends js.Object {
    var IsTruncated: PageTruncated
    var MaxItems: PageMaxItems
    var TrafficPolicyInstances: TrafficPolicyInstances
    var TrafficPolicyInstanceNameMarker: js.UndefOr[DNSName]
    var TrafficPolicyInstanceTypeMarker: js.UndefOr[RRType]
  }

  object ListTrafficPolicyInstancesByHostedZoneResponse {
    @inline
    def apply(
        IsTruncated: PageTruncated,
        MaxItems: PageMaxItems,
        TrafficPolicyInstances: TrafficPolicyInstances,
        TrafficPolicyInstanceNameMarker: js.UndefOr[DNSName] = js.undefined,
        TrafficPolicyInstanceTypeMarker: js.UndefOr[RRType] = js.undefined
    ): ListTrafficPolicyInstancesByHostedZoneResponse = {
      val __obj = js.Dynamic.literal(
        "IsTruncated" -> IsTruncated.asInstanceOf[js.Any],
        "MaxItems" -> MaxItems.asInstanceOf[js.Any],
        "TrafficPolicyInstances" -> TrafficPolicyInstances.asInstanceOf[js.Any]
      )

      TrafficPolicyInstanceNameMarker.foreach(__v =>
        __obj.updateDynamic("TrafficPolicyInstanceNameMarker")(__v.asInstanceOf[js.Any])
      )
      TrafficPolicyInstanceTypeMarker.foreach(__v =>
        __obj.updateDynamic("TrafficPolicyInstanceTypeMarker")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[ListTrafficPolicyInstancesByHostedZoneResponse]
    }
  }

  /**
    * A complex type that contains the information about the request to list your traffic policy instances.
    */
  @js.native
  trait ListTrafficPolicyInstancesByPolicyRequest extends js.Object {
    var TrafficPolicyId: TrafficPolicyId
    var TrafficPolicyVersion: TrafficPolicyVersion
    var HostedZoneIdMarker: js.UndefOr[ResourceId]
    var MaxItems: js.UndefOr[PageMaxItems]
    var TrafficPolicyInstanceNameMarker: js.UndefOr[DNSName]
    var TrafficPolicyInstanceTypeMarker: js.UndefOr[RRType]
  }

  object ListTrafficPolicyInstancesByPolicyRequest {
    @inline
    def apply(
        TrafficPolicyId: TrafficPolicyId,
        TrafficPolicyVersion: TrafficPolicyVersion,
        HostedZoneIdMarker: js.UndefOr[ResourceId] = js.undefined,
        MaxItems: js.UndefOr[PageMaxItems] = js.undefined,
        TrafficPolicyInstanceNameMarker: js.UndefOr[DNSName] = js.undefined,
        TrafficPolicyInstanceTypeMarker: js.UndefOr[RRType] = js.undefined
    ): ListTrafficPolicyInstancesByPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "TrafficPolicyId" -> TrafficPolicyId.asInstanceOf[js.Any],
        "TrafficPolicyVersion" -> TrafficPolicyVersion.asInstanceOf[js.Any]
      )

      HostedZoneIdMarker.foreach(__v => __obj.updateDynamic("HostedZoneIdMarker")(__v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.updateDynamic("MaxItems")(__v.asInstanceOf[js.Any]))
      TrafficPolicyInstanceNameMarker.foreach(__v =>
        __obj.updateDynamic("TrafficPolicyInstanceNameMarker")(__v.asInstanceOf[js.Any])
      )
      TrafficPolicyInstanceTypeMarker.foreach(__v =>
        __obj.updateDynamic("TrafficPolicyInstanceTypeMarker")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[ListTrafficPolicyInstancesByPolicyRequest]
    }
  }

  /**
    * A complex type that contains the response information for the request.
    */
  @js.native
  trait ListTrafficPolicyInstancesByPolicyResponse extends js.Object {
    var IsTruncated: PageTruncated
    var MaxItems: PageMaxItems
    var TrafficPolicyInstances: TrafficPolicyInstances
    var HostedZoneIdMarker: js.UndefOr[ResourceId]
    var TrafficPolicyInstanceNameMarker: js.UndefOr[DNSName]
    var TrafficPolicyInstanceTypeMarker: js.UndefOr[RRType]
  }

  object ListTrafficPolicyInstancesByPolicyResponse {
    @inline
    def apply(
        IsTruncated: PageTruncated,
        MaxItems: PageMaxItems,
        TrafficPolicyInstances: TrafficPolicyInstances,
        HostedZoneIdMarker: js.UndefOr[ResourceId] = js.undefined,
        TrafficPolicyInstanceNameMarker: js.UndefOr[DNSName] = js.undefined,
        TrafficPolicyInstanceTypeMarker: js.UndefOr[RRType] = js.undefined
    ): ListTrafficPolicyInstancesByPolicyResponse = {
      val __obj = js.Dynamic.literal(
        "IsTruncated" -> IsTruncated.asInstanceOf[js.Any],
        "MaxItems" -> MaxItems.asInstanceOf[js.Any],
        "TrafficPolicyInstances" -> TrafficPolicyInstances.asInstanceOf[js.Any]
      )

      HostedZoneIdMarker.foreach(__v => __obj.updateDynamic("HostedZoneIdMarker")(__v.asInstanceOf[js.Any]))
      TrafficPolicyInstanceNameMarker.foreach(__v =>
        __obj.updateDynamic("TrafficPolicyInstanceNameMarker")(__v.asInstanceOf[js.Any])
      )
      TrafficPolicyInstanceTypeMarker.foreach(__v =>
        __obj.updateDynamic("TrafficPolicyInstanceTypeMarker")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[ListTrafficPolicyInstancesByPolicyResponse]
    }
  }

  /**
    * A request to get information about the traffic policy instances that you created by using the current AWS account.
    */
  @js.native
  trait ListTrafficPolicyInstancesRequest extends js.Object {
    var HostedZoneIdMarker: js.UndefOr[ResourceId]
    var MaxItems: js.UndefOr[PageMaxItems]
    var TrafficPolicyInstanceNameMarker: js.UndefOr[DNSName]
    var TrafficPolicyInstanceTypeMarker: js.UndefOr[RRType]
  }

  object ListTrafficPolicyInstancesRequest {
    @inline
    def apply(
        HostedZoneIdMarker: js.UndefOr[ResourceId] = js.undefined,
        MaxItems: js.UndefOr[PageMaxItems] = js.undefined,
        TrafficPolicyInstanceNameMarker: js.UndefOr[DNSName] = js.undefined,
        TrafficPolicyInstanceTypeMarker: js.UndefOr[RRType] = js.undefined
    ): ListTrafficPolicyInstancesRequest = {
      val __obj = js.Dynamic.literal()
      HostedZoneIdMarker.foreach(__v => __obj.updateDynamic("HostedZoneIdMarker")(__v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.updateDynamic("MaxItems")(__v.asInstanceOf[js.Any]))
      TrafficPolicyInstanceNameMarker.foreach(__v =>
        __obj.updateDynamic("TrafficPolicyInstanceNameMarker")(__v.asInstanceOf[js.Any])
      )
      TrafficPolicyInstanceTypeMarker.foreach(__v =>
        __obj.updateDynamic("TrafficPolicyInstanceTypeMarker")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[ListTrafficPolicyInstancesRequest]
    }
  }

  /**
    * A complex type that contains the response information for the request.
    */
  @js.native
  trait ListTrafficPolicyInstancesResponse extends js.Object {
    var IsTruncated: PageTruncated
    var MaxItems: PageMaxItems
    var TrafficPolicyInstances: TrafficPolicyInstances
    var HostedZoneIdMarker: js.UndefOr[ResourceId]
    var TrafficPolicyInstanceNameMarker: js.UndefOr[DNSName]
    var TrafficPolicyInstanceTypeMarker: js.UndefOr[RRType]
  }

  object ListTrafficPolicyInstancesResponse {
    @inline
    def apply(
        IsTruncated: PageTruncated,
        MaxItems: PageMaxItems,
        TrafficPolicyInstances: TrafficPolicyInstances,
        HostedZoneIdMarker: js.UndefOr[ResourceId] = js.undefined,
        TrafficPolicyInstanceNameMarker: js.UndefOr[DNSName] = js.undefined,
        TrafficPolicyInstanceTypeMarker: js.UndefOr[RRType] = js.undefined
    ): ListTrafficPolicyInstancesResponse = {
      val __obj = js.Dynamic.literal(
        "IsTruncated" -> IsTruncated.asInstanceOf[js.Any],
        "MaxItems" -> MaxItems.asInstanceOf[js.Any],
        "TrafficPolicyInstances" -> TrafficPolicyInstances.asInstanceOf[js.Any]
      )

      HostedZoneIdMarker.foreach(__v => __obj.updateDynamic("HostedZoneIdMarker")(__v.asInstanceOf[js.Any]))
      TrafficPolicyInstanceNameMarker.foreach(__v =>
        __obj.updateDynamic("TrafficPolicyInstanceNameMarker")(__v.asInstanceOf[js.Any])
      )
      TrafficPolicyInstanceTypeMarker.foreach(__v =>
        __obj.updateDynamic("TrafficPolicyInstanceTypeMarker")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[ListTrafficPolicyInstancesResponse]
    }
  }

  /**
    * A complex type that contains the information about the request to list your traffic policies.
    */
  @js.native
  trait ListTrafficPolicyVersionsRequest extends js.Object {
    var Id: TrafficPolicyId
    var MaxItems: js.UndefOr[PageMaxItems]
    var TrafficPolicyVersionMarker: js.UndefOr[TrafficPolicyVersionMarker]
  }

  object ListTrafficPolicyVersionsRequest {
    @inline
    def apply(
        Id: TrafficPolicyId,
        MaxItems: js.UndefOr[PageMaxItems] = js.undefined,
        TrafficPolicyVersionMarker: js.UndefOr[TrafficPolicyVersionMarker] = js.undefined
    ): ListTrafficPolicyVersionsRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      MaxItems.foreach(__v => __obj.updateDynamic("MaxItems")(__v.asInstanceOf[js.Any]))
      TrafficPolicyVersionMarker.foreach(__v =>
        __obj.updateDynamic("TrafficPolicyVersionMarker")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[ListTrafficPolicyVersionsRequest]
    }
  }

  /**
    * A complex type that contains the response information for the request.
    */
  @js.native
  trait ListTrafficPolicyVersionsResponse extends js.Object {
    var IsTruncated: PageTruncated
    var MaxItems: PageMaxItems
    var TrafficPolicies: TrafficPolicies
    var TrafficPolicyVersionMarker: TrafficPolicyVersionMarker
  }

  object ListTrafficPolicyVersionsResponse {
    @inline
    def apply(
        IsTruncated: PageTruncated,
        MaxItems: PageMaxItems,
        TrafficPolicies: TrafficPolicies,
        TrafficPolicyVersionMarker: TrafficPolicyVersionMarker
    ): ListTrafficPolicyVersionsResponse = {
      val __obj = js.Dynamic.literal(
        "IsTruncated" -> IsTruncated.asInstanceOf[js.Any],
        "MaxItems" -> MaxItems.asInstanceOf[js.Any],
        "TrafficPolicies" -> TrafficPolicies.asInstanceOf[js.Any],
        "TrafficPolicyVersionMarker" -> TrafficPolicyVersionMarker.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListTrafficPolicyVersionsResponse]
    }
  }

  /**
    * A complex type that contains information about that can be associated with your hosted zone.
    */
  @js.native
  trait ListVPCAssociationAuthorizationsRequest extends js.Object {
    var HostedZoneId: ResourceId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListVPCAssociationAuthorizationsRequest {
    @inline
    def apply(
        HostedZoneId: ResourceId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListVPCAssociationAuthorizationsRequest = {
      val __obj = js.Dynamic.literal(
        "HostedZoneId" -> HostedZoneId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVPCAssociationAuthorizationsRequest]
    }
  }

  /**
    * A complex type that contains the response information for the request.
    */
  @js.native
  trait ListVPCAssociationAuthorizationsResponse extends js.Object {
    var HostedZoneId: ResourceId
    var VPCs: VPCs
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListVPCAssociationAuthorizationsResponse {
    @inline
    def apply(
        HostedZoneId: ResourceId,
        VPCs: VPCs,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListVPCAssociationAuthorizationsResponse = {
      val __obj = js.Dynamic.literal(
        "HostedZoneId" -> HostedZoneId.asInstanceOf[js.Any],
        "VPCs" -> VPCs.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVPCAssociationAuthorizationsResponse]
    }
  }

  /**
    * A complex type that contains information about a configuration for DNS query logging.
    */
  @js.native
  trait QueryLoggingConfig extends js.Object {
    var CloudWatchLogsLogGroupArn: CloudWatchLogsLogGroupArn
    var HostedZoneId: ResourceId
    var Id: QueryLoggingConfigId
  }

  object QueryLoggingConfig {
    @inline
    def apply(
        CloudWatchLogsLogGroupArn: CloudWatchLogsLogGroupArn,
        HostedZoneId: ResourceId,
        Id: QueryLoggingConfigId
    ): QueryLoggingConfig = {
      val __obj = js.Dynamic.literal(
        "CloudWatchLogsLogGroupArn" -> CloudWatchLogsLogGroupArn.asInstanceOf[js.Any],
        "HostedZoneId" -> HostedZoneId.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[QueryLoggingConfig]
    }
  }

  @js.native
  sealed trait RRType extends js.Any
  object RRType extends js.Object {
    val SOA = "SOA".asInstanceOf[RRType]
    val A = "A".asInstanceOf[RRType]
    val TXT = "TXT".asInstanceOf[RRType]
    val NS = "NS".asInstanceOf[RRType]
    val CNAME = "CNAME".asInstanceOf[RRType]
    val MX = "MX".asInstanceOf[RRType]
    val NAPTR = "NAPTR".asInstanceOf[RRType]
    val PTR = "PTR".asInstanceOf[RRType]
    val SRV = "SRV".asInstanceOf[RRType]
    val SPF = "SPF".asInstanceOf[RRType]
    val AAAA = "AAAA".asInstanceOf[RRType]
    val CAA = "CAA".asInstanceOf[RRType]

    val values = js.Object.freeze(js.Array(SOA, A, TXT, NS, CNAME, MX, NAPTR, PTR, SRV, SPF, AAAA, CAA))
  }

  @js.native
  sealed trait ResettableElementName extends js.Any
  object ResettableElementName extends js.Object {
    val FullyQualifiedDomainName = "FullyQualifiedDomainName".asInstanceOf[ResettableElementName]
    val Regions = "Regions".asInstanceOf[ResettableElementName]
    val ResourcePath = "ResourcePath".asInstanceOf[ResettableElementName]
    val ChildHealthChecks = "ChildHealthChecks".asInstanceOf[ResettableElementName]

    val values = js.Object.freeze(js.Array(FullyQualifiedDomainName, Regions, ResourcePath, ChildHealthChecks))
  }

  /**
    * Information specific to the resource record.
    *
    * '''Note:'''If you're creating an alias resource record set, omit <code>ResourceRecord</code>.
    */
  @js.native
  trait ResourceRecord extends js.Object {
    var Value: RData
  }

  object ResourceRecord {
    @inline
    def apply(
        Value: RData
    ): ResourceRecord = {
      val __obj = js.Dynamic.literal(
        "Value" -> Value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ResourceRecord]
    }
  }

  /**
    * Information about the resource record set to create or delete.
    */
  @js.native
  trait ResourceRecordSet extends js.Object {
    var Name: DNSName
    var Type: RRType
    var AliasTarget: js.UndefOr[AliasTarget]
    var Failover: js.UndefOr[ResourceRecordSetFailover]
    var GeoLocation: js.UndefOr[GeoLocation]
    var HealthCheckId: js.UndefOr[HealthCheckId]
    var MultiValueAnswer: js.UndefOr[ResourceRecordSetMultiValueAnswer]
    var Region: js.UndefOr[ResourceRecordSetRegion]
    var ResourceRecords: js.UndefOr[ResourceRecords]
    var SetIdentifier: js.UndefOr[ResourceRecordSetIdentifier]
    var TTL: js.UndefOr[TTL]
    var TrafficPolicyInstanceId: js.UndefOr[TrafficPolicyInstanceId]
    var Weight: js.UndefOr[ResourceRecordSetWeight]
  }

  object ResourceRecordSet {
    @inline
    def apply(
        Name: DNSName,
        Type: RRType,
        AliasTarget: js.UndefOr[AliasTarget] = js.undefined,
        Failover: js.UndefOr[ResourceRecordSetFailover] = js.undefined,
        GeoLocation: js.UndefOr[GeoLocation] = js.undefined,
        HealthCheckId: js.UndefOr[HealthCheckId] = js.undefined,
        MultiValueAnswer: js.UndefOr[ResourceRecordSetMultiValueAnswer] = js.undefined,
        Region: js.UndefOr[ResourceRecordSetRegion] = js.undefined,
        ResourceRecords: js.UndefOr[ResourceRecords] = js.undefined,
        SetIdentifier: js.UndefOr[ResourceRecordSetIdentifier] = js.undefined,
        TTL: js.UndefOr[TTL] = js.undefined,
        TrafficPolicyInstanceId: js.UndefOr[TrafficPolicyInstanceId] = js.undefined,
        Weight: js.UndefOr[ResourceRecordSetWeight] = js.undefined
    ): ResourceRecordSet = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      AliasTarget.foreach(__v => __obj.updateDynamic("AliasTarget")(__v.asInstanceOf[js.Any]))
      Failover.foreach(__v => __obj.updateDynamic("Failover")(__v.asInstanceOf[js.Any]))
      GeoLocation.foreach(__v => __obj.updateDynamic("GeoLocation")(__v.asInstanceOf[js.Any]))
      HealthCheckId.foreach(__v => __obj.updateDynamic("HealthCheckId")(__v.asInstanceOf[js.Any]))
      MultiValueAnswer.foreach(__v => __obj.updateDynamic("MultiValueAnswer")(__v.asInstanceOf[js.Any]))
      Region.foreach(__v => __obj.updateDynamic("Region")(__v.asInstanceOf[js.Any]))
      ResourceRecords.foreach(__v => __obj.updateDynamic("ResourceRecords")(__v.asInstanceOf[js.Any]))
      SetIdentifier.foreach(__v => __obj.updateDynamic("SetIdentifier")(__v.asInstanceOf[js.Any]))
      TTL.foreach(__v => __obj.updateDynamic("TTL")(__v.asInstanceOf[js.Any]))
      TrafficPolicyInstanceId.foreach(__v => __obj.updateDynamic("TrafficPolicyInstanceId")(__v.asInstanceOf[js.Any]))
      Weight.foreach(__v => __obj.updateDynamic("Weight")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceRecordSet]
    }
  }

  @js.native
  sealed trait ResourceRecordSetFailover extends js.Any
  object ResourceRecordSetFailover extends js.Object {
    val PRIMARY = "PRIMARY".asInstanceOf[ResourceRecordSetFailover]
    val SECONDARY = "SECONDARY".asInstanceOf[ResourceRecordSetFailover]

    val values = js.Object.freeze(js.Array(PRIMARY, SECONDARY))
  }

  @js.native
  sealed trait ResourceRecordSetRegion extends js.Any
  object ResourceRecordSetRegion extends js.Object {
    val `us-east-1` = "us-east-1".asInstanceOf[ResourceRecordSetRegion]
    val `us-east-2` = "us-east-2".asInstanceOf[ResourceRecordSetRegion]
    val `us-west-1` = "us-west-1".asInstanceOf[ResourceRecordSetRegion]
    val `us-west-2` = "us-west-2".asInstanceOf[ResourceRecordSetRegion]
    val `ca-central-1` = "ca-central-1".asInstanceOf[ResourceRecordSetRegion]
    val `eu-west-1` = "eu-west-1".asInstanceOf[ResourceRecordSetRegion]
    val `eu-west-2` = "eu-west-2".asInstanceOf[ResourceRecordSetRegion]
    val `eu-west-3` = "eu-west-3".asInstanceOf[ResourceRecordSetRegion]
    val `eu-central-1` = "eu-central-1".asInstanceOf[ResourceRecordSetRegion]
    val `ap-southeast-1` = "ap-southeast-1".asInstanceOf[ResourceRecordSetRegion]
    val `ap-southeast-2` = "ap-southeast-2".asInstanceOf[ResourceRecordSetRegion]
    val `ap-northeast-1` = "ap-northeast-1".asInstanceOf[ResourceRecordSetRegion]
    val `ap-northeast-2` = "ap-northeast-2".asInstanceOf[ResourceRecordSetRegion]
    val `ap-northeast-3` = "ap-northeast-3".asInstanceOf[ResourceRecordSetRegion]
    val `eu-north-1` = "eu-north-1".asInstanceOf[ResourceRecordSetRegion]
    val `sa-east-1` = "sa-east-1".asInstanceOf[ResourceRecordSetRegion]
    val `cn-north-1` = "cn-north-1".asInstanceOf[ResourceRecordSetRegion]
    val `cn-northwest-1` = "cn-northwest-1".asInstanceOf[ResourceRecordSetRegion]
    val `ap-east-1` = "ap-east-1".asInstanceOf[ResourceRecordSetRegion]
    val `me-south-1` = "me-south-1".asInstanceOf[ResourceRecordSetRegion]
    val `ap-south-1` = "ap-south-1".asInstanceOf[ResourceRecordSetRegion]
    val `af-south-1` = "af-south-1".asInstanceOf[ResourceRecordSetRegion]
    val `eu-south-1` = "eu-south-1".asInstanceOf[ResourceRecordSetRegion]

    val values = js.Object.freeze(
      js.Array(
        `us-east-1`,
        `us-east-2`,
        `us-west-1`,
        `us-west-2`,
        `ca-central-1`,
        `eu-west-1`,
        `eu-west-2`,
        `eu-west-3`,
        `eu-central-1`,
        `ap-southeast-1`,
        `ap-southeast-2`,
        `ap-northeast-1`,
        `ap-northeast-2`,
        `ap-northeast-3`,
        `eu-north-1`,
        `sa-east-1`,
        `cn-north-1`,
        `cn-northwest-1`,
        `ap-east-1`,
        `me-south-1`,
        `ap-south-1`,
        `af-south-1`,
        `eu-south-1`
      )
    )
  }

  /**
    * A complex type containing a resource and its associated tags.
    */
  @js.native
  trait ResourceTagSet extends js.Object {
    var ResourceId: js.UndefOr[TagResourceId]
    var ResourceType: js.UndefOr[TagResourceType]
    var Tags: js.UndefOr[TagList]
  }

  object ResourceTagSet {
    @inline
    def apply(
        ResourceId: js.UndefOr[TagResourceId] = js.undefined,
        ResourceType: js.UndefOr[TagResourceType] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): ResourceTagSet = {
      val __obj = js.Dynamic.literal()
      ResourceId.foreach(__v => __obj.updateDynamic("ResourceId")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceTagSet]
    }
  }

  /**
    * A complex type that contains the type of limit that you specified in the request and the current value for that limit.
    */
  @js.native
  trait ReusableDelegationSetLimit extends js.Object {
    var Type: ReusableDelegationSetLimitType
    var Value: LimitValue
  }

  object ReusableDelegationSetLimit {
    @inline
    def apply(
        Type: ReusableDelegationSetLimitType,
        Value: LimitValue
    ): ReusableDelegationSetLimit = {
      val __obj = js.Dynamic.literal(
        "Type" -> Type.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ReusableDelegationSetLimit]
    }
  }

  @js.native
  sealed trait ReusableDelegationSetLimitType extends js.Any
  object ReusableDelegationSetLimitType extends js.Object {
    val MAX_ZONES_BY_REUSABLE_DELEGATION_SET =
      "MAX_ZONES_BY_REUSABLE_DELEGATION_SET".asInstanceOf[ReusableDelegationSetLimitType]

    val values = js.Object.freeze(js.Array(MAX_ZONES_BY_REUSABLE_DELEGATION_SET))
  }

  @js.native
  sealed trait Statistic extends js.Any
  object Statistic extends js.Object {
    val Average = "Average".asInstanceOf[Statistic]
    val Sum = "Sum".asInstanceOf[Statistic]
    val SampleCount = "SampleCount".asInstanceOf[Statistic]
    val Maximum = "Maximum".asInstanceOf[Statistic]
    val Minimum = "Minimum".asInstanceOf[Statistic]

    val values = js.Object.freeze(js.Array(Average, Sum, SampleCount, Maximum, Minimum))
  }

  /**
    * A complex type that contains the status that one Amazon Route 53 health checker reports and the time of the health check.
    */
  @js.native
  trait StatusReport extends js.Object {
    var CheckedTime: js.UndefOr[TimeStamp]
    var Status: js.UndefOr[Status]
  }

  object StatusReport {
    @inline
    def apply(
        CheckedTime: js.UndefOr[TimeStamp] = js.undefined,
        Status: js.UndefOr[Status] = js.undefined
    ): StatusReport = {
      val __obj = js.Dynamic.literal()
      CheckedTime.foreach(__v => __obj.updateDynamic("CheckedTime")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StatusReport]
    }
  }

  /**
    * A complex type that contains information about a tag that you want to add or edit for the specified health check or hosted zone.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: js.UndefOr[TagKey]
    var Value: js.UndefOr[TagValue]
  }

  object Tag {
    @inline
    def apply(
        Key: js.UndefOr[TagKey] = js.undefined,
        Value: js.UndefOr[TagValue] = js.undefined
    ): Tag = {
      val __obj = js.Dynamic.literal()
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  sealed trait TagResourceType extends js.Any
  object TagResourceType extends js.Object {
    val healthcheck = "healthcheck".asInstanceOf[TagResourceType]
    val hostedzone = "hostedzone".asInstanceOf[TagResourceType]

    val values = js.Object.freeze(js.Array(healthcheck, hostedzone))
  }

  /**
    * Gets the value that Amazon Route 53 returns in response to a DNS request for a specified record name and type. You can optionally specify the IP address of a DNS resolver, an EDNS0 client subnet IP address, and a subnet mask.
    */
  @js.native
  trait TestDNSAnswerRequest extends js.Object {
    var HostedZoneId: ResourceId
    var RecordName: DNSName
    var RecordType: RRType
    var EDNS0ClientSubnetIP: js.UndefOr[IPAddress]
    var EDNS0ClientSubnetMask: js.UndefOr[SubnetMask]
    var ResolverIP: js.UndefOr[IPAddress]
  }

  object TestDNSAnswerRequest {
    @inline
    def apply(
        HostedZoneId: ResourceId,
        RecordName: DNSName,
        RecordType: RRType,
        EDNS0ClientSubnetIP: js.UndefOr[IPAddress] = js.undefined,
        EDNS0ClientSubnetMask: js.UndefOr[SubnetMask] = js.undefined,
        ResolverIP: js.UndefOr[IPAddress] = js.undefined
    ): TestDNSAnswerRequest = {
      val __obj = js.Dynamic.literal(
        "HostedZoneId" -> HostedZoneId.asInstanceOf[js.Any],
        "RecordName" -> RecordName.asInstanceOf[js.Any],
        "RecordType" -> RecordType.asInstanceOf[js.Any]
      )

      EDNS0ClientSubnetIP.foreach(__v => __obj.updateDynamic("EDNS0ClientSubnetIP")(__v.asInstanceOf[js.Any]))
      EDNS0ClientSubnetMask.foreach(__v => __obj.updateDynamic("EDNS0ClientSubnetMask")(__v.asInstanceOf[js.Any]))
      ResolverIP.foreach(__v => __obj.updateDynamic("ResolverIP")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TestDNSAnswerRequest]
    }
  }

  /**
    * A complex type that contains the response to a <code>TestDNSAnswer</code> request.
    */
  @js.native
  trait TestDNSAnswerResponse extends js.Object {
    var Nameserver: Nameserver
    var Protocol: TransportProtocol
    var RecordData: RecordData
    var RecordName: DNSName
    var RecordType: RRType
    var ResponseCode: DNSRCode
  }

  object TestDNSAnswerResponse {
    @inline
    def apply(
        Nameserver: Nameserver,
        Protocol: TransportProtocol,
        RecordData: RecordData,
        RecordName: DNSName,
        RecordType: RRType,
        ResponseCode: DNSRCode
    ): TestDNSAnswerResponse = {
      val __obj = js.Dynamic.literal(
        "Nameserver" -> Nameserver.asInstanceOf[js.Any],
        "Protocol" -> Protocol.asInstanceOf[js.Any],
        "RecordData" -> RecordData.asInstanceOf[js.Any],
        "RecordName" -> RecordName.asInstanceOf[js.Any],
        "RecordType" -> RecordType.asInstanceOf[js.Any],
        "ResponseCode" -> ResponseCode.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TestDNSAnswerResponse]
    }
  }

  /**
    * A complex type that contains settings for a traffic policy.
    */
  @js.native
  trait TrafficPolicy extends js.Object {
    var Document: TrafficPolicyDocument
    var Id: TrafficPolicyId
    var Name: TrafficPolicyName
    var Type: RRType
    var Version: TrafficPolicyVersion
    var Comment: js.UndefOr[TrafficPolicyComment]
  }

  object TrafficPolicy {
    @inline
    def apply(
        Document: TrafficPolicyDocument,
        Id: TrafficPolicyId,
        Name: TrafficPolicyName,
        Type: RRType,
        Version: TrafficPolicyVersion,
        Comment: js.UndefOr[TrafficPolicyComment] = js.undefined
    ): TrafficPolicy = {
      val __obj = js.Dynamic.literal(
        "Document" -> Document.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any],
        "Version" -> Version.asInstanceOf[js.Any]
      )

      Comment.foreach(__v => __obj.updateDynamic("Comment")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TrafficPolicy]
    }
  }

  /**
    * A complex type that contains settings for the new traffic policy instance.
    */
  @js.native
  trait TrafficPolicyInstance extends js.Object {
    var HostedZoneId: ResourceId
    var Id: TrafficPolicyInstanceId
    var Message: Message
    var Name: DNSName
    var State: TrafficPolicyInstanceState
    var TTL: TTL
    var TrafficPolicyId: TrafficPolicyId
    var TrafficPolicyType: RRType
    var TrafficPolicyVersion: TrafficPolicyVersion
  }

  object TrafficPolicyInstance {
    @inline
    def apply(
        HostedZoneId: ResourceId,
        Id: TrafficPolicyInstanceId,
        Message: Message,
        Name: DNSName,
        State: TrafficPolicyInstanceState,
        TTL: TTL,
        TrafficPolicyId: TrafficPolicyId,
        TrafficPolicyType: RRType,
        TrafficPolicyVersion: TrafficPolicyVersion
    ): TrafficPolicyInstance = {
      val __obj = js.Dynamic.literal(
        "HostedZoneId" -> HostedZoneId.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "Message" -> Message.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "State" -> State.asInstanceOf[js.Any],
        "TTL" -> TTL.asInstanceOf[js.Any],
        "TrafficPolicyId" -> TrafficPolicyId.asInstanceOf[js.Any],
        "TrafficPolicyType" -> TrafficPolicyType.asInstanceOf[js.Any],
        "TrafficPolicyVersion" -> TrafficPolicyVersion.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TrafficPolicyInstance]
    }
  }

  /**
    * A complex type that contains information about the latest version of one traffic policy that is associated with the current AWS account.
    */
  @js.native
  trait TrafficPolicySummary extends js.Object {
    var Id: TrafficPolicyId
    var LatestVersion: TrafficPolicyVersion
    var Name: TrafficPolicyName
    var TrafficPolicyCount: TrafficPolicyVersion
    var Type: RRType
  }

  object TrafficPolicySummary {
    @inline
    def apply(
        Id: TrafficPolicyId,
        LatestVersion: TrafficPolicyVersion,
        Name: TrafficPolicyName,
        TrafficPolicyCount: TrafficPolicyVersion,
        Type: RRType
    ): TrafficPolicySummary = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "LatestVersion" -> LatestVersion.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "TrafficPolicyCount" -> TrafficPolicyCount.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TrafficPolicySummary]
    }
  }

  /**
    * A complex type that contains information about a request to update a health check.
    */
  @js.native
  trait UpdateHealthCheckRequest extends js.Object {
    var HealthCheckId: HealthCheckId
    var AlarmIdentifier: js.UndefOr[AlarmIdentifier]
    var ChildHealthChecks: js.UndefOr[ChildHealthCheckList]
    var Disabled: js.UndefOr[Disabled]
    var EnableSNI: js.UndefOr[EnableSNI]
    var FailureThreshold: js.UndefOr[FailureThreshold]
    var FullyQualifiedDomainName: js.UndefOr[FullyQualifiedDomainName]
    var HealthCheckVersion: js.UndefOr[HealthCheckVersion]
    var HealthThreshold: js.UndefOr[HealthThreshold]
    var IPAddress: js.UndefOr[IPAddress]
    var InsufficientDataHealthStatus: js.UndefOr[InsufficientDataHealthStatus]
    var Inverted: js.UndefOr[Inverted]
    var Port: js.UndefOr[Port]
    var Regions: js.UndefOr[HealthCheckRegionList]
    var ResetElements: js.UndefOr[ResettableElementNameList]
    var ResourcePath: js.UndefOr[ResourcePath]
    var SearchString: js.UndefOr[SearchString]
  }

  object UpdateHealthCheckRequest {
    @inline
    def apply(
        HealthCheckId: HealthCheckId,
        AlarmIdentifier: js.UndefOr[AlarmIdentifier] = js.undefined,
        ChildHealthChecks: js.UndefOr[ChildHealthCheckList] = js.undefined,
        Disabled: js.UndefOr[Disabled] = js.undefined,
        EnableSNI: js.UndefOr[EnableSNI] = js.undefined,
        FailureThreshold: js.UndefOr[FailureThreshold] = js.undefined,
        FullyQualifiedDomainName: js.UndefOr[FullyQualifiedDomainName] = js.undefined,
        HealthCheckVersion: js.UndefOr[HealthCheckVersion] = js.undefined,
        HealthThreshold: js.UndefOr[HealthThreshold] = js.undefined,
        IPAddress: js.UndefOr[IPAddress] = js.undefined,
        InsufficientDataHealthStatus: js.UndefOr[InsufficientDataHealthStatus] = js.undefined,
        Inverted: js.UndefOr[Inverted] = js.undefined,
        Port: js.UndefOr[Port] = js.undefined,
        Regions: js.UndefOr[HealthCheckRegionList] = js.undefined,
        ResetElements: js.UndefOr[ResettableElementNameList] = js.undefined,
        ResourcePath: js.UndefOr[ResourcePath] = js.undefined,
        SearchString: js.UndefOr[SearchString] = js.undefined
    ): UpdateHealthCheckRequest = {
      val __obj = js.Dynamic.literal(
        "HealthCheckId" -> HealthCheckId.asInstanceOf[js.Any]
      )

      AlarmIdentifier.foreach(__v => __obj.updateDynamic("AlarmIdentifier")(__v.asInstanceOf[js.Any]))
      ChildHealthChecks.foreach(__v => __obj.updateDynamic("ChildHealthChecks")(__v.asInstanceOf[js.Any]))
      Disabled.foreach(__v => __obj.updateDynamic("Disabled")(__v.asInstanceOf[js.Any]))
      EnableSNI.foreach(__v => __obj.updateDynamic("EnableSNI")(__v.asInstanceOf[js.Any]))
      FailureThreshold.foreach(__v => __obj.updateDynamic("FailureThreshold")(__v.asInstanceOf[js.Any]))
      FullyQualifiedDomainName.foreach(__v => __obj.updateDynamic("FullyQualifiedDomainName")(__v.asInstanceOf[js.Any]))
      HealthCheckVersion.foreach(__v => __obj.updateDynamic("HealthCheckVersion")(__v.asInstanceOf[js.Any]))
      HealthThreshold.foreach(__v => __obj.updateDynamic("HealthThreshold")(__v.asInstanceOf[js.Any]))
      IPAddress.foreach(__v => __obj.updateDynamic("IPAddress")(__v.asInstanceOf[js.Any]))
      InsufficientDataHealthStatus.foreach(__v =>
        __obj.updateDynamic("InsufficientDataHealthStatus")(__v.asInstanceOf[js.Any])
      )
      Inverted.foreach(__v => __obj.updateDynamic("Inverted")(__v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      Regions.foreach(__v => __obj.updateDynamic("Regions")(__v.asInstanceOf[js.Any]))
      ResetElements.foreach(__v => __obj.updateDynamic("ResetElements")(__v.asInstanceOf[js.Any]))
      ResourcePath.foreach(__v => __obj.updateDynamic("ResourcePath")(__v.asInstanceOf[js.Any]))
      SearchString.foreach(__v => __obj.updateDynamic("SearchString")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateHealthCheckRequest]
    }
  }

  /**
    * A complex type that contains the response to the <code>UpdateHealthCheck</code> request.
    */
  @js.native
  trait UpdateHealthCheckResponse extends js.Object {
    var HealthCheck: HealthCheck
  }

  object UpdateHealthCheckResponse {
    @inline
    def apply(
        HealthCheck: HealthCheck
    ): UpdateHealthCheckResponse = {
      val __obj = js.Dynamic.literal(
        "HealthCheck" -> HealthCheck.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateHealthCheckResponse]
    }
  }

  /**
    * A request to update the comment for a hosted zone.
    */
  @js.native
  trait UpdateHostedZoneCommentRequest extends js.Object {
    var Id: ResourceId
    var Comment: js.UndefOr[ResourceDescription]
  }

  object UpdateHostedZoneCommentRequest {
    @inline
    def apply(
        Id: ResourceId,
        Comment: js.UndefOr[ResourceDescription] = js.undefined
    ): UpdateHostedZoneCommentRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      Comment.foreach(__v => __obj.updateDynamic("Comment")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateHostedZoneCommentRequest]
    }
  }

  /**
    * A complex type that contains the response to the <code>UpdateHostedZoneComment</code> request.
    */
  @js.native
  trait UpdateHostedZoneCommentResponse extends js.Object {
    var HostedZone: HostedZone
  }

  object UpdateHostedZoneCommentResponse {
    @inline
    def apply(
        HostedZone: HostedZone
    ): UpdateHostedZoneCommentResponse = {
      val __obj = js.Dynamic.literal(
        "HostedZone" -> HostedZone.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateHostedZoneCommentResponse]
    }
  }

  /**
    * A complex type that contains information about the traffic policy that you want to update the comment for.
    */
  @js.native
  trait UpdateTrafficPolicyCommentRequest extends js.Object {
    var Comment: TrafficPolicyComment
    var Id: TrafficPolicyId
    var Version: TrafficPolicyVersion
  }

  object UpdateTrafficPolicyCommentRequest {
    @inline
    def apply(
        Comment: TrafficPolicyComment,
        Id: TrafficPolicyId,
        Version: TrafficPolicyVersion
    ): UpdateTrafficPolicyCommentRequest = {
      val __obj = js.Dynamic.literal(
        "Comment" -> Comment.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "Version" -> Version.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateTrafficPolicyCommentRequest]
    }
  }

  /**
    * A complex type that contains the response information for the traffic policy.
    */
  @js.native
  trait UpdateTrafficPolicyCommentResponse extends js.Object {
    var TrafficPolicy: TrafficPolicy
  }

  object UpdateTrafficPolicyCommentResponse {
    @inline
    def apply(
        TrafficPolicy: TrafficPolicy
    ): UpdateTrafficPolicyCommentResponse = {
      val __obj = js.Dynamic.literal(
        "TrafficPolicy" -> TrafficPolicy.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateTrafficPolicyCommentResponse]
    }
  }

  /**
    * A complex type that contains information about the resource record sets that you want to update based on a specified traffic policy instance.
    */
  @js.native
  trait UpdateTrafficPolicyInstanceRequest extends js.Object {
    var Id: TrafficPolicyInstanceId
    var TTL: TTL
    var TrafficPolicyId: TrafficPolicyId
    var TrafficPolicyVersion: TrafficPolicyVersion
  }

  object UpdateTrafficPolicyInstanceRequest {
    @inline
    def apply(
        Id: TrafficPolicyInstanceId,
        TTL: TTL,
        TrafficPolicyId: TrafficPolicyId,
        TrafficPolicyVersion: TrafficPolicyVersion
    ): UpdateTrafficPolicyInstanceRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "TTL" -> TTL.asInstanceOf[js.Any],
        "TrafficPolicyId" -> TrafficPolicyId.asInstanceOf[js.Any],
        "TrafficPolicyVersion" -> TrafficPolicyVersion.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateTrafficPolicyInstanceRequest]
    }
  }

  /**
    * A complex type that contains information about the resource record sets that Amazon Route 53 created based on a specified traffic policy.
    */
  @js.native
  trait UpdateTrafficPolicyInstanceResponse extends js.Object {
    var TrafficPolicyInstance: TrafficPolicyInstance
  }

  object UpdateTrafficPolicyInstanceResponse {
    @inline
    def apply(
        TrafficPolicyInstance: TrafficPolicyInstance
    ): UpdateTrafficPolicyInstanceResponse = {
      val __obj = js.Dynamic.literal(
        "TrafficPolicyInstance" -> TrafficPolicyInstance.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateTrafficPolicyInstanceResponse]
    }
  }

  /**
    * (Private hosted zones only) A complex type that contains information about an Amazon VPC.
    */
  @js.native
  trait VPC extends js.Object {
    var VPCId: js.UndefOr[VPCId]
    var VPCRegion: js.UndefOr[VPCRegion]
  }

  object VPC {
    @inline
    def apply(
        VPCId: js.UndefOr[VPCId] = js.undefined,
        VPCRegion: js.UndefOr[VPCRegion] = js.undefined
    ): VPC = {
      val __obj = js.Dynamic.literal()
      VPCId.foreach(__v => __obj.updateDynamic("VPCId")(__v.asInstanceOf[js.Any]))
      VPCRegion.foreach(__v => __obj.updateDynamic("VPCRegion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VPC]
    }
  }

  @js.native
  sealed trait VPCRegion extends js.Any
  object VPCRegion extends js.Object {
    val `us-east-1` = "us-east-1".asInstanceOf[VPCRegion]
    val `us-east-2` = "us-east-2".asInstanceOf[VPCRegion]
    val `us-west-1` = "us-west-1".asInstanceOf[VPCRegion]
    val `us-west-2` = "us-west-2".asInstanceOf[VPCRegion]
    val `eu-west-1` = "eu-west-1".asInstanceOf[VPCRegion]
    val `eu-west-2` = "eu-west-2".asInstanceOf[VPCRegion]
    val `eu-west-3` = "eu-west-3".asInstanceOf[VPCRegion]
    val `eu-central-1` = "eu-central-1".asInstanceOf[VPCRegion]
    val `ap-east-1` = "ap-east-1".asInstanceOf[VPCRegion]
    val `me-south-1` = "me-south-1".asInstanceOf[VPCRegion]
    val `us-gov-west-1` = "us-gov-west-1".asInstanceOf[VPCRegion]
    val `us-gov-east-1` = "us-gov-east-1".asInstanceOf[VPCRegion]
    val `us-iso-east-1` = "us-iso-east-1".asInstanceOf[VPCRegion]
    val `us-isob-east-1` = "us-isob-east-1".asInstanceOf[VPCRegion]
    val `ap-southeast-1` = "ap-southeast-1".asInstanceOf[VPCRegion]
    val `ap-southeast-2` = "ap-southeast-2".asInstanceOf[VPCRegion]
    val `ap-south-1` = "ap-south-1".asInstanceOf[VPCRegion]
    val `ap-northeast-1` = "ap-northeast-1".asInstanceOf[VPCRegion]
    val `ap-northeast-2` = "ap-northeast-2".asInstanceOf[VPCRegion]
    val `ap-northeast-3` = "ap-northeast-3".asInstanceOf[VPCRegion]
    val `eu-north-1` = "eu-north-1".asInstanceOf[VPCRegion]
    val `sa-east-1` = "sa-east-1".asInstanceOf[VPCRegion]
    val `ca-central-1` = "ca-central-1".asInstanceOf[VPCRegion]
    val `cn-north-1` = "cn-north-1".asInstanceOf[VPCRegion]
    val `af-south-1` = "af-south-1".asInstanceOf[VPCRegion]
    val `eu-south-1` = "eu-south-1".asInstanceOf[VPCRegion]

    val values = js.Object.freeze(
      js.Array(
        `us-east-1`,
        `us-east-2`,
        `us-west-1`,
        `us-west-2`,
        `eu-west-1`,
        `eu-west-2`,
        `eu-west-3`,
        `eu-central-1`,
        `ap-east-1`,
        `me-south-1`,
        `us-gov-west-1`,
        `us-gov-east-1`,
        `us-iso-east-1`,
        `us-isob-east-1`,
        `ap-southeast-1`,
        `ap-southeast-2`,
        `ap-south-1`,
        `ap-northeast-1`,
        `ap-northeast-2`,
        `ap-northeast-3`,
        `eu-north-1`,
        `sa-east-1`,
        `ca-central-1`,
        `cn-north-1`,
        `af-south-1`,
        `eu-south-1`
      )
    )
  }
}
