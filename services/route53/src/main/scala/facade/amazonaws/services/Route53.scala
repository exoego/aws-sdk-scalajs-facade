package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object route53 {
  type AlarmName                         = String
  type AliasHealthEnabled                = Boolean
  type AssociateVPCComment               = String
  type Changes                           = js.Array[Change]
  type CheckerIpRanges                   = js.Array[IPAddressCidr]
  type ChildHealthCheckList              = js.Array[HealthCheckId]
  type CloudWatchLogsLogGroupArn         = String
  type DNSName                           = String
  type DNSRCode                          = String
  type DelegationSetNameServers          = js.Array[DNSName]
  type DelegationSets                    = js.Array[DelegationSet]
  type DimensionField                    = String
  type DimensionList                     = js.Array[Dimension]
  type Disabled                          = Boolean
  type DisassociateVPCComment            = String
  type EnableSNI                         = Boolean
  type EvaluationPeriods                 = Int
  type FailureThreshold                  = Int
  type FullyQualifiedDomainName          = String
  type GeoLocationContinentCode          = String
  type GeoLocationContinentName          = String
  type GeoLocationCountryCode            = String
  type GeoLocationCountryName            = String
  type GeoLocationDetailsList            = js.Array[GeoLocationDetails]
  type GeoLocationSubdivisionCode        = String
  type GeoLocationSubdivisionName        = String
  type HealthCheckCount                  = Double
  type HealthCheckId                     = String
  type HealthCheckNonce                  = String
  type HealthCheckObservations           = js.Array[HealthCheckObservation]
  type HealthCheckRegionList             = js.Array[HealthCheckRegion]
  type HealthCheckVersion                = Double
  type HealthChecks                      = js.Array[HealthCheck]
  type HealthThreshold                   = Int
  type HostedZoneCount                   = Double
  type HostedZoneRRSetCount              = Double
  type HostedZones                       = js.Array[HostedZone]
  type IPAddress                         = String
  type IPAddressCidr                     = String
  type Inverted                          = Boolean
  type IsPrivateZone                     = Boolean
  type LimitValue                        = Double
  type MaxResults                        = String
  type MeasureLatency                    = Boolean
  type Message                           = String
  type MetricName                        = String
  type Nameserver                        = String
  type Namespace                         = String
  type Nonce                             = String
  type PageMarker                        = String
  type PageMaxItems                      = String
  type PageTruncated                     = Boolean
  type PaginationToken                   = String
  type Period                            = Int
  type Port                              = Int
  type QueryLoggingConfigId              = String
  type QueryLoggingConfigs               = js.Array[QueryLoggingConfig]
  type RData                             = String
  type RecordData                        = js.Array[RecordDataEntry]
  type RecordDataEntry                   = String
  type RequestInterval                   = Int
  type ResettableElementNameList         = js.Array[ResettableElementName]
  type ResourceDescription               = String
  type ResourceId                        = String
  type ResourcePath                      = String
  type ResourceRecordSetIdentifier       = String
  type ResourceRecordSetMultiValueAnswer = Boolean
  type ResourceRecordSetWeight           = Double
  type ResourceRecordSets                = js.Array[ResourceRecordSet]
  type ResourceRecords                   = js.Array[ResourceRecord]
  type ResourceTagSetList                = js.Array[ResourceTagSet]
  type ResourceURI                       = String
  type SearchString                      = String
  type ServicePrincipal                  = String
  type Status                            = String
  type SubnetMask                        = String
  type TTL                               = Double
  type TagKey                            = String
  type TagKeyList                        = js.Array[TagKey]
  type TagList                           = js.Array[Tag]
  type TagResourceId                     = String
  type TagResourceIdList                 = js.Array[TagResourceId]
  type TagValue                          = String
  type Threshold                         = Double
  type TimeStamp                         = js.Date
  type TrafficPolicies                   = js.Array[TrafficPolicy]
  type TrafficPolicyComment              = String
  type TrafficPolicyDocument             = String
  type TrafficPolicyId                   = String
  type TrafficPolicyInstanceCount        = Int
  type TrafficPolicyInstanceId           = String
  type TrafficPolicyInstanceState        = String
  type TrafficPolicyInstances            = js.Array[TrafficPolicyInstance]
  type TrafficPolicyName                 = String
  type TrafficPolicySummaries            = js.Array[TrafficPolicySummary]
  type TrafficPolicyVersion              = Int
  type TrafficPolicyVersionMarker        = String
  type TransportProtocol                 = String
  type UsageCount                        = Double
  type VPCId                             = String
  type VPCs                              = js.Array[VPC]

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
  @JSImport("aws-sdk", "Route53")
  class Route53() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateVPCWithHostedZone(
        params: AssociateVPCWithHostedZoneRequest
    ): Request[AssociateVPCWithHostedZoneResponse] = js.native
    def changeResourceRecordSets(params: ChangeResourceRecordSetsRequest): Request[ChangeResourceRecordSetsResponse] =
      js.native
    def changeTagsForResource(params: ChangeTagsForResourceRequest): Request[ChangeTagsForResourceResponse] = js.native
    def createHealthCheck(params: CreateHealthCheckRequest): Request[CreateHealthCheckResponse]             = js.native
    def createHostedZone(params: CreateHostedZoneRequest): Request[CreateHostedZoneResponse]                = js.native
    def createQueryLoggingConfig(params: CreateQueryLoggingConfigRequest): Request[CreateQueryLoggingConfigResponse] =
      js.native
    def createReusableDelegationSet(
        params: CreateReusableDelegationSetRequest
    ): Request[CreateReusableDelegationSetResponse]                                                   = js.native
    def createTrafficPolicy(params: CreateTrafficPolicyRequest): Request[CreateTrafficPolicyResponse] = js.native
    def createTrafficPolicyInstance(
        params: CreateTrafficPolicyInstanceRequest
    ): Request[CreateTrafficPolicyInstanceResponse] = js.native
    def createTrafficPolicyVersion(
        params: CreateTrafficPolicyVersionRequest
    ): Request[CreateTrafficPolicyVersionResponse] = js.native
    def createVPCAssociationAuthorization(
        params: CreateVPCAssociationAuthorizationRequest
    ): Request[CreateVPCAssociationAuthorizationResponse]                                       = js.native
    def deleteHealthCheck(params: DeleteHealthCheckRequest): Request[DeleteHealthCheckResponse] = js.native
    def deleteHostedZone(params: DeleteHostedZoneRequest): Request[DeleteHostedZoneResponse]    = js.native
    def deleteQueryLoggingConfig(params: DeleteQueryLoggingConfigRequest): Request[DeleteQueryLoggingConfigResponse] =
      js.native
    def deleteReusableDelegationSet(
        params: DeleteReusableDelegationSetRequest
    ): Request[DeleteReusableDelegationSetResponse]                                                   = js.native
    def deleteTrafficPolicy(params: DeleteTrafficPolicyRequest): Request[DeleteTrafficPolicyResponse] = js.native
    def deleteTrafficPolicyInstance(
        params: DeleteTrafficPolicyInstanceRequest
    ): Request[DeleteTrafficPolicyInstanceResponse] = js.native
    def deleteVPCAssociationAuthorization(
        params: DeleteVPCAssociationAuthorizationRequest
    ): Request[DeleteVPCAssociationAuthorizationResponse] = js.native
    def disassociateVPCFromHostedZone(
        params: DisassociateVPCFromHostedZoneRequest
    ): Request[DisassociateVPCFromHostedZoneResponse]                                                 = js.native
    def getAccountLimit(params: GetAccountLimitRequest): Request[GetAccountLimitResponse]             = js.native
    def getChange(params: GetChangeRequest): Request[GetChangeResponse]                               = js.native
    def getCheckerIpRanges(params: GetCheckerIpRangesRequest): Request[GetCheckerIpRangesResponse]    = js.native
    def getGeoLocation(params: GetGeoLocationRequest): Request[GetGeoLocationResponse]                = js.native
    def getHealthCheck(params: GetHealthCheckRequest): Request[GetHealthCheckResponse]                = js.native
    def getHealthCheckCount(params: GetHealthCheckCountRequest): Request[GetHealthCheckCountResponse] = js.native
    def getHealthCheckLastFailureReason(
        params: GetHealthCheckLastFailureReasonRequest
    ): Request[GetHealthCheckLastFailureReasonResponse]                                                     = js.native
    def getHealthCheckStatus(params: GetHealthCheckStatusRequest): Request[GetHealthCheckStatusResponse]    = js.native
    def getHostedZone(params: GetHostedZoneRequest): Request[GetHostedZoneResponse]                         = js.native
    def getHostedZoneCount(params: GetHostedZoneCountRequest): Request[GetHostedZoneCountResponse]          = js.native
    def getHostedZoneLimit(params: GetHostedZoneLimitRequest): Request[GetHostedZoneLimitResponse]          = js.native
    def getQueryLoggingConfig(params: GetQueryLoggingConfigRequest): Request[GetQueryLoggingConfigResponse] = js.native
    def getReusableDelegationSet(params: GetReusableDelegationSetRequest): Request[GetReusableDelegationSetResponse] =
      js.native
    def getReusableDelegationSetLimit(
        params: GetReusableDelegationSetLimitRequest
    ): Request[GetReusableDelegationSetLimitResponse]                                        = js.native
    def getTrafficPolicy(params: GetTrafficPolicyRequest): Request[GetTrafficPolicyResponse] = js.native
    def getTrafficPolicyInstance(params: GetTrafficPolicyInstanceRequest): Request[GetTrafficPolicyInstanceResponse] =
      js.native
    def getTrafficPolicyInstanceCount(
        params: GetTrafficPolicyInstanceCountRequest
    ): Request[GetTrafficPolicyInstanceCountResponse]                                                       = js.native
    def listGeoLocations(params: ListGeoLocationsRequest): Request[ListGeoLocationsResponse]                = js.native
    def listHealthChecks(params: ListHealthChecksRequest): Request[ListHealthChecksResponse]                = js.native
    def listHostedZones(params: ListHostedZonesRequest): Request[ListHostedZonesResponse]                   = js.native
    def listHostedZonesByName(params: ListHostedZonesByNameRequest): Request[ListHostedZonesByNameResponse] = js.native
    def listQueryLoggingConfigs(params: ListQueryLoggingConfigsRequest): Request[ListQueryLoggingConfigsResponse] =
      js.native
    def listResourceRecordSets(params: ListResourceRecordSetsRequest): Request[ListResourceRecordSetsResponse] =
      js.native
    def listReusableDelegationSets(
        params: ListReusableDelegationSetsRequest
    ): Request[ListReusableDelegationSetsResponse]                                                       = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse]    = js.native
    def listTagsForResources(params: ListTagsForResourcesRequest): Request[ListTagsForResourcesResponse] = js.native
    def listTrafficPolicies(params: ListTrafficPoliciesRequest): Request[ListTrafficPoliciesResponse]    = js.native
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
    ): Request[ListVPCAssociationAuthorizationsResponse]                                        = js.native
    def testDNSAnswer(params: TestDNSAnswerRequest): Request[TestDNSAnswerResponse]             = js.native
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
  @Factory
  trait AccountLimit extends js.Object {
    var Type: AccountLimitType
    var Value: LimitValue
  }

  @js.native
  sealed trait AccountLimitType extends js.Any
  object AccountLimitType extends js.Object {
    val MAX_HEALTH_CHECKS_BY_OWNER            = "MAX_HEALTH_CHECKS_BY_OWNER".asInstanceOf[AccountLimitType]
    val MAX_HOSTED_ZONES_BY_OWNER             = "MAX_HOSTED_ZONES_BY_OWNER".asInstanceOf[AccountLimitType]
    val MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER = "MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER".asInstanceOf[AccountLimitType]
    val MAX_REUSABLE_DELEGATION_SETS_BY_OWNER = "MAX_REUSABLE_DELEGATION_SETS_BY_OWNER".asInstanceOf[AccountLimitType]
    val MAX_TRAFFIC_POLICIES_BY_OWNER         = "MAX_TRAFFIC_POLICIES_BY_OWNER".asInstanceOf[AccountLimitType]

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
  @Factory
  trait AlarmIdentifier extends js.Object {
    var Name: AlarmName
    var Region: CloudWatchRegion
  }

  /**
    * <i>Alias resource record sets only:</i> Information about the AWS resource, such as a CloudFront distribution or an Amazon S3 bucket, that you want to route traffic to.
    *  When creating resource record sets for a private hosted zone, note the following:
    * * Creating geolocation alias resource record sets or latency alias resource record sets in a private hosted zone is unsupported.
    *  * For information about creating failover resource record sets in a private hosted zone, see [[http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-private-hosted-zones.html|Configuring Failover in a Private Hosted Zone]].
    */
  @js.native
  @Factory
  trait AliasTarget extends js.Object {
    var DNSName: DNSName
    var EvaluateTargetHealth: AliasHealthEnabled
    var HostedZoneId: ResourceId
  }

  /**
    * A complex type that contains information about the request to associate a VPC with a private hosted zone.
    */
  @js.native
  @Factory
  trait AssociateVPCWithHostedZoneRequest extends js.Object {
    var HostedZoneId: ResourceId
    var VPC: VPC
    var Comment: js.UndefOr[AssociateVPCComment]
  }

  /**
    * A complex type that contains the response information for the <code>AssociateVPCWithHostedZone</code> request.
    */
  @js.native
  @Factory
  trait AssociateVPCWithHostedZoneResponse extends js.Object {
    var ChangeInfo: ChangeInfo
  }

  /**
    * The information for each resource record set that you want to change.
    */
  @js.native
  @Factory
  trait Change extends js.Object {
    var Action: ChangeAction
    var ResourceRecordSet: ResourceRecordSet
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
  @Factory
  trait ChangeBatch extends js.Object {
    var Changes: Changes
    var Comment: js.UndefOr[ResourceDescription]
  }

  /**
    * A complex type that describes change information about changes made to your hosted zone.
    */
  @js.native
  @Factory
  trait ChangeInfo extends js.Object {
    var Id: ResourceId
    var Status: ChangeStatus
    var SubmittedAt: TimeStamp
    var Comment: js.UndefOr[ResourceDescription]
  }

  /**
    * A complex type that contains change information for the resource record set.
    */
  @js.native
  @Factory
  trait ChangeResourceRecordSetsRequest extends js.Object {
    var ChangeBatch: ChangeBatch
    var HostedZoneId: ResourceId
  }

  /**
    * A complex type containing the response for the request.
    */
  @js.native
  @Factory
  trait ChangeResourceRecordSetsResponse extends js.Object {
    var ChangeInfo: ChangeInfo
  }

  @js.native
  sealed trait ChangeStatus extends js.Any
  object ChangeStatus extends js.Object {
    val PENDING = "PENDING".asInstanceOf[ChangeStatus]
    val INSYNC  = "INSYNC".asInstanceOf[ChangeStatus]

    val values = js.Object.freeze(js.Array(PENDING, INSYNC))
  }

  /**
    * A complex type that contains information about the tags that you want to add, edit, or delete.
    */
  @js.native
  @Factory
  trait ChangeTagsForResourceRequest extends js.Object {
    var ResourceId: TagResourceId
    var ResourceType: TagResourceType
    var AddTags: js.UndefOr[TagList]
    var RemoveTagKeys: js.UndefOr[TagKeyList]
  }

  /**
    * Empty response for the request.
    */
  @js.native
  @Factory
  trait ChangeTagsForResourceResponse extends js.Object {}

  /**
    * A complex type that contains information about the CloudWatch alarm that Amazon Route 53 is monitoring for this health check.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait CloudWatchRegion extends js.Any
  object CloudWatchRegion extends js.Object {
    val `us-east-1`      = "us-east-1".asInstanceOf[CloudWatchRegion]
    val `us-east-2`      = "us-east-2".asInstanceOf[CloudWatchRegion]
    val `us-west-1`      = "us-west-1".asInstanceOf[CloudWatchRegion]
    val `us-west-2`      = "us-west-2".asInstanceOf[CloudWatchRegion]
    val `ca-central-1`   = "ca-central-1".asInstanceOf[CloudWatchRegion]
    val `eu-central-1`   = "eu-central-1".asInstanceOf[CloudWatchRegion]
    val `eu-west-1`      = "eu-west-1".asInstanceOf[CloudWatchRegion]
    val `eu-west-2`      = "eu-west-2".asInstanceOf[CloudWatchRegion]
    val `eu-west-3`      = "eu-west-3".asInstanceOf[CloudWatchRegion]
    val `ap-east-1`      = "ap-east-1".asInstanceOf[CloudWatchRegion]
    val `me-south-1`     = "me-south-1".asInstanceOf[CloudWatchRegion]
    val `ap-south-1`     = "ap-south-1".asInstanceOf[CloudWatchRegion]
    val `ap-southeast-1` = "ap-southeast-1".asInstanceOf[CloudWatchRegion]
    val `ap-southeast-2` = "ap-southeast-2".asInstanceOf[CloudWatchRegion]
    val `ap-northeast-1` = "ap-northeast-1".asInstanceOf[CloudWatchRegion]
    val `ap-northeast-2` = "ap-northeast-2".asInstanceOf[CloudWatchRegion]
    val `ap-northeast-3` = "ap-northeast-3".asInstanceOf[CloudWatchRegion]
    val `eu-north-1`     = "eu-north-1".asInstanceOf[CloudWatchRegion]
    val `sa-east-1`      = "sa-east-1".asInstanceOf[CloudWatchRegion]
    val `cn-northwest-1` = "cn-northwest-1".asInstanceOf[CloudWatchRegion]
    val `cn-north-1`     = "cn-north-1".asInstanceOf[CloudWatchRegion]

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
        `cn-north-1`
      )
    )
  }

  @js.native
  sealed trait ComparisonOperator extends js.Any
  object ComparisonOperator extends js.Object {
    val GreaterThanOrEqualToThreshold = "GreaterThanOrEqualToThreshold".asInstanceOf[ComparisonOperator]
    val GreaterThanThreshold          = "GreaterThanThreshold".asInstanceOf[ComparisonOperator]
    val LessThanThreshold             = "LessThanThreshold".asInstanceOf[ComparisonOperator]
    val LessThanOrEqualToThreshold    = "LessThanOrEqualToThreshold".asInstanceOf[ComparisonOperator]

    val values = js.Object.freeze(
      js.Array(GreaterThanOrEqualToThreshold, GreaterThanThreshold, LessThanThreshold, LessThanOrEqualToThreshold)
    )
  }

  /**
    * A complex type that contains the health check request information.
    */
  @js.native
  @Factory
  trait CreateHealthCheckRequest extends js.Object {
    var CallerReference: HealthCheckNonce
    var HealthCheckConfig: HealthCheckConfig
  }

  /**
    * A complex type containing the response information for the new health check.
    */
  @js.native
  @Factory
  trait CreateHealthCheckResponse extends js.Object {
    var HealthCheck: HealthCheck
    var Location: ResourceURI
  }

  /**
    * A complex type that contains information about the request to create a public or private hosted zone.
    */
  @js.native
  @Factory
  trait CreateHostedZoneRequest extends js.Object {
    var CallerReference: Nonce
    var Name: DNSName
    var DelegationSetId: js.UndefOr[ResourceId]
    var HostedZoneConfig: js.UndefOr[HostedZoneConfig]
    var VPC: js.UndefOr[VPC]
  }

  /**
    * A complex type containing the response information for the hosted zone.
    */
  @js.native
  @Factory
  trait CreateHostedZoneResponse extends js.Object {
    var ChangeInfo: ChangeInfo
    var DelegationSet: DelegationSet
    var HostedZone: HostedZone
    var Location: ResourceURI
    var VPC: js.UndefOr[VPC]
  }

  @js.native
  @Factory
  trait CreateQueryLoggingConfigRequest extends js.Object {
    var CloudWatchLogsLogGroupArn: CloudWatchLogsLogGroupArn
    var HostedZoneId: ResourceId
  }

  @js.native
  @Factory
  trait CreateQueryLoggingConfigResponse extends js.Object {
    var Location: ResourceURI
    var QueryLoggingConfig: QueryLoggingConfig
  }

  @js.native
  @Factory
  trait CreateReusableDelegationSetRequest extends js.Object {
    var CallerReference: Nonce
    var HostedZoneId: js.UndefOr[ResourceId]
  }

  @js.native
  @Factory
  trait CreateReusableDelegationSetResponse extends js.Object {
    var DelegationSet: DelegationSet
    var Location: ResourceURI
  }

  /**
    * A complex type that contains information about the resource record sets that you want to create based on a specified traffic policy.
    */
  @js.native
  @Factory
  trait CreateTrafficPolicyInstanceRequest extends js.Object {
    var HostedZoneId: ResourceId
    var Name: DNSName
    var TTL: TTL
    var TrafficPolicyId: TrafficPolicyId
    var TrafficPolicyVersion: TrafficPolicyVersion
  }

  /**
    * A complex type that contains the response information for the <code>CreateTrafficPolicyInstance</code> request.
    */
  @js.native
  @Factory
  trait CreateTrafficPolicyInstanceResponse extends js.Object {
    var Location: ResourceURI
    var TrafficPolicyInstance: TrafficPolicyInstance
  }

  /**
    * A complex type that contains information about the traffic policy that you want to create.
    */
  @js.native
  @Factory
  trait CreateTrafficPolicyRequest extends js.Object {
    var Document: TrafficPolicyDocument
    var Name: TrafficPolicyName
    var Comment: js.UndefOr[TrafficPolicyComment]
  }

  /**
    * A complex type that contains the response information for the <code>CreateTrafficPolicy</code> request.
    */
  @js.native
  @Factory
  trait CreateTrafficPolicyResponse extends js.Object {
    var Location: ResourceURI
    var TrafficPolicy: TrafficPolicy
  }

  /**
    * A complex type that contains information about the traffic policy that you want to create a new version for.
    */
  @js.native
  @Factory
  trait CreateTrafficPolicyVersionRequest extends js.Object {
    var Document: TrafficPolicyDocument
    var Id: TrafficPolicyId
    var Comment: js.UndefOr[TrafficPolicyComment]
  }

  /**
    * A complex type that contains the response information for the <code>CreateTrafficPolicyVersion</code> request.
    */
  @js.native
  @Factory
  trait CreateTrafficPolicyVersionResponse extends js.Object {
    var Location: ResourceURI
    var TrafficPolicy: TrafficPolicy
  }

  /**
    * A complex type that contains information about the request to authorize associating a VPC with your private hosted zone. Authorization is only required when a private hosted zone and a VPC were created by using different accounts.
    */
  @js.native
  @Factory
  trait CreateVPCAssociationAuthorizationRequest extends js.Object {
    var HostedZoneId: ResourceId
    var VPC: VPC
  }

  /**
    * A complex type that contains the response information from a <code>CreateVPCAssociationAuthorization</code> request.
    */
  @js.native
  @Factory
  trait CreateVPCAssociationAuthorizationResponse extends js.Object {
    var HostedZoneId: ResourceId
    var VPC: VPC
  }

  /**
    * A complex type that lists the name servers in a delegation set, as well as the <code>CallerReference</code> and the <code>ID</code> for the delegation set.
    */
  @js.native
  @Factory
  trait DelegationSet extends js.Object {
    var NameServers: DelegationSetNameServers
    var CallerReference: js.UndefOr[Nonce]
    var Id: js.UndefOr[ResourceId]
  }

  /**
    * This action deletes a health check.
    */
  @js.native
  @Factory
  trait DeleteHealthCheckRequest extends js.Object {
    var HealthCheckId: HealthCheckId
  }

  /**
    * An empty element.
    */
  @js.native
  @Factory
  trait DeleteHealthCheckResponse extends js.Object {}

  /**
    * A request to delete a hosted zone.
    */
  @js.native
  @Factory
  trait DeleteHostedZoneRequest extends js.Object {
    var Id: ResourceId
  }

  /**
    * A complex type that contains the response to a <code>DeleteHostedZone</code> request.
    */
  @js.native
  @Factory
  trait DeleteHostedZoneResponse extends js.Object {
    var ChangeInfo: ChangeInfo
  }

  @js.native
  @Factory
  trait DeleteQueryLoggingConfigRequest extends js.Object {
    var Id: QueryLoggingConfigId
  }

  @js.native
  @Factory
  trait DeleteQueryLoggingConfigResponse extends js.Object {}

  /**
    * A request to delete a reusable delegation set.
    */
  @js.native
  @Factory
  trait DeleteReusableDelegationSetRequest extends js.Object {
    var Id: ResourceId
  }

  /**
    * An empty element.
    */
  @js.native
  @Factory
  trait DeleteReusableDelegationSetResponse extends js.Object {}

  /**
    * A request to delete a specified traffic policy instance.
    */
  @js.native
  @Factory
  trait DeleteTrafficPolicyInstanceRequest extends js.Object {
    var Id: TrafficPolicyInstanceId
  }

  /**
    * An empty element.
    */
  @js.native
  @Factory
  trait DeleteTrafficPolicyInstanceResponse extends js.Object {}

  /**
    * A request to delete a specified traffic policy version.
    */
  @js.native
  @Factory
  trait DeleteTrafficPolicyRequest extends js.Object {
    var Id: TrafficPolicyId
    var Version: TrafficPolicyVersion
  }

  /**
    * An empty element.
    */
  @js.native
  @Factory
  trait DeleteTrafficPolicyResponse extends js.Object {}

  /**
    * A complex type that contains information about the request to remove authorization to associate a VPC that was created by one AWS account with a hosted zone that was created with a different AWS account.
    */
  @js.native
  @Factory
  trait DeleteVPCAssociationAuthorizationRequest extends js.Object {
    var HostedZoneId: ResourceId
    var VPC: VPC
  }

  /**
    * Empty response for the request.
    */
  @js.native
  @Factory
  trait DeleteVPCAssociationAuthorizationResponse extends js.Object {}

  /**
    * For the metric that the CloudWatch alarm is associated with, a complex type that contains information about one dimension.
    */
  @js.native
  @Factory
  trait Dimension extends js.Object {
    var Name: DimensionField
    var Value: DimensionField
  }

  /**
    * A complex type that contains information about the VPC that you want to disassociate from a specified private hosted zone.
    */
  @js.native
  @Factory
  trait DisassociateVPCFromHostedZoneRequest extends js.Object {
    var HostedZoneId: ResourceId
    var VPC: VPC
    var Comment: js.UndefOr[DisassociateVPCComment]
  }

  /**
    * A complex type that contains the response information for the disassociate request.
    */
  @js.native
  @Factory
  trait DisassociateVPCFromHostedZoneResponse extends js.Object {
    var ChangeInfo: ChangeInfo
  }

  /**
    * A complex type that contains information about a geographic location.
    */
  @js.native
  @Factory
  trait GeoLocation extends js.Object {
    var ContinentCode: js.UndefOr[GeoLocationContinentCode]
    var CountryCode: js.UndefOr[GeoLocationCountryCode]
    var SubdivisionCode: js.UndefOr[GeoLocationSubdivisionCode]
  }

  /**
    * A complex type that contains the codes and full continent, country, and subdivision names for the specified <code>geolocation</code> code.
    */
  @js.native
  @Factory
  trait GeoLocationDetails extends js.Object {
    var ContinentCode: js.UndefOr[GeoLocationContinentCode]
    var ContinentName: js.UndefOr[GeoLocationContinentName]
    var CountryCode: js.UndefOr[GeoLocationCountryCode]
    var CountryName: js.UndefOr[GeoLocationCountryName]
    var SubdivisionCode: js.UndefOr[GeoLocationSubdivisionCode]
    var SubdivisionName: js.UndefOr[GeoLocationSubdivisionName]
  }

  /**
    * A complex type that contains information about the request to create a hosted zone.
    */
  @js.native
  @Factory
  trait GetAccountLimitRequest extends js.Object {
    var Type: AccountLimitType
  }

  /**
    * A complex type that contains the requested limit.
    */
  @js.native
  @Factory
  trait GetAccountLimitResponse extends js.Object {
    var Count: UsageCount
    var Limit: AccountLimit
  }

  /**
    * The input for a GetChange request.
    */
  @js.native
  @Factory
  trait GetChangeRequest extends js.Object {
    var Id: ResourceId
  }

  /**
    * A complex type that contains the <code>ChangeInfo</code> element.
    */
  @js.native
  @Factory
  trait GetChangeResponse extends js.Object {
    var ChangeInfo: ChangeInfo
  }

  /**
    * Empty request.
    */
  @js.native
  @Factory
  trait GetCheckerIpRangesRequest extends js.Object {}

  /**
    * A complex type that contains the <code>CheckerIpRanges</code> element.
    */
  @js.native
  @Factory
  trait GetCheckerIpRangesResponse extends js.Object {
    var CheckerIpRanges: CheckerIpRanges
  }

  /**
    * A request for information about whether a specified geographic location is supported for Amazon Route 53 geolocation resource record sets.
    */
  @js.native
  @Factory
  trait GetGeoLocationRequest extends js.Object {
    var ContinentCode: js.UndefOr[GeoLocationContinentCode]
    var CountryCode: js.UndefOr[GeoLocationCountryCode]
    var SubdivisionCode: js.UndefOr[GeoLocationSubdivisionCode]
  }

  /**
    * A complex type that contains the response information for the specified geolocation code.
    */
  @js.native
  @Factory
  trait GetGeoLocationResponse extends js.Object {
    var GeoLocationDetails: GeoLocationDetails
  }

  /**
    * A request for the number of health checks that are associated with the current AWS account.
    */
  @js.native
  @Factory
  trait GetHealthCheckCountRequest extends js.Object {}

  /**
    * A complex type that contains the response to a <code>GetHealthCheckCount</code> request.
    */
  @js.native
  @Factory
  trait GetHealthCheckCountResponse extends js.Object {
    var HealthCheckCount: HealthCheckCount
  }

  /**
    * A request for the reason that a health check failed most recently.
    */
  @js.native
  @Factory
  trait GetHealthCheckLastFailureReasonRequest extends js.Object {
    var HealthCheckId: HealthCheckId
  }

  /**
    * A complex type that contains the response to a <code>GetHealthCheckLastFailureReason</code> request.
    */
  @js.native
  @Factory
  trait GetHealthCheckLastFailureReasonResponse extends js.Object {
    var HealthCheckObservations: HealthCheckObservations
  }

  /**
    * A request to get information about a specified health check.
    */
  @js.native
  @Factory
  trait GetHealthCheckRequest extends js.Object {
    var HealthCheckId: HealthCheckId
  }

  /**
    * A complex type that contains the response to a <code>GetHealthCheck</code> request.
    */
  @js.native
  @Factory
  trait GetHealthCheckResponse extends js.Object {
    var HealthCheck: HealthCheck
  }

  /**
    * A request to get the status for a health check.
    */
  @js.native
  @Factory
  trait GetHealthCheckStatusRequest extends js.Object {
    var HealthCheckId: HealthCheckId
  }

  /**
    * A complex type that contains the response to a <code>GetHealthCheck</code> request.
    */
  @js.native
  @Factory
  trait GetHealthCheckStatusResponse extends js.Object {
    var HealthCheckObservations: HealthCheckObservations
  }

  /**
    * A request to retrieve a count of all the hosted zones that are associated with the current AWS account.
    */
  @js.native
  @Factory
  trait GetHostedZoneCountRequest extends js.Object {}

  /**
    * A complex type that contains the response to a <code>GetHostedZoneCount</code> request.
    */
  @js.native
  @Factory
  trait GetHostedZoneCountResponse extends js.Object {
    var HostedZoneCount: HostedZoneCount
  }

  /**
    * A complex type that contains information about the request to create a hosted zone.
    */
  @js.native
  @Factory
  trait GetHostedZoneLimitRequest extends js.Object {
    var HostedZoneId: ResourceId
    var Type: HostedZoneLimitType
  }

  /**
    * A complex type that contains the requested limit.
    */
  @js.native
  @Factory
  trait GetHostedZoneLimitResponse extends js.Object {
    var Count: UsageCount
    var Limit: HostedZoneLimit
  }

  /**
    * A request to get information about a specified hosted zone.
    */
  @js.native
  @Factory
  trait GetHostedZoneRequest extends js.Object {
    var Id: ResourceId
  }

  /**
    * A complex type that contain the response to a <code>GetHostedZone</code> request.
    */
  @js.native
  @Factory
  trait GetHostedZoneResponse extends js.Object {
    var HostedZone: HostedZone
    var DelegationSet: js.UndefOr[DelegationSet]
    var VPCs: js.UndefOr[VPCs]
  }

  @js.native
  @Factory
  trait GetQueryLoggingConfigRequest extends js.Object {
    var Id: QueryLoggingConfigId
  }

  @js.native
  @Factory
  trait GetQueryLoggingConfigResponse extends js.Object {
    var QueryLoggingConfig: QueryLoggingConfig
  }

  /**
    * A complex type that contains information about the request to create a hosted zone.
    */
  @js.native
  @Factory
  trait GetReusableDelegationSetLimitRequest extends js.Object {
    var DelegationSetId: ResourceId
    var Type: ReusableDelegationSetLimitType
  }

  /**
    * A complex type that contains the requested limit.
    */
  @js.native
  @Factory
  trait GetReusableDelegationSetLimitResponse extends js.Object {
    var Count: UsageCount
    var Limit: ReusableDelegationSetLimit
  }

  /**
    * A request to get information about a specified reusable delegation set.
    */
  @js.native
  @Factory
  trait GetReusableDelegationSetRequest extends js.Object {
    var Id: ResourceId
  }

  /**
    * A complex type that contains the response to the <code>GetReusableDelegationSet</code> request.
    */
  @js.native
  @Factory
  trait GetReusableDelegationSetResponse extends js.Object {
    var DelegationSet: DelegationSet
  }

  /**
    * Request to get the number of traffic policy instances that are associated with the current AWS account.
    */
  @js.native
  @Factory
  trait GetTrafficPolicyInstanceCountRequest extends js.Object {}

  /**
    * A complex type that contains information about the resource record sets that Amazon Route 53 created based on a specified traffic policy.
    */
  @js.native
  @Factory
  trait GetTrafficPolicyInstanceCountResponse extends js.Object {
    var TrafficPolicyInstanceCount: TrafficPolicyInstanceCount
  }

  /**
    * Gets information about a specified traffic policy instance.
    */
  @js.native
  @Factory
  trait GetTrafficPolicyInstanceRequest extends js.Object {
    var Id: TrafficPolicyInstanceId
  }

  /**
    * A complex type that contains information about the resource record sets that Amazon Route 53 created based on a specified traffic policy.
    */
  @js.native
  @Factory
  trait GetTrafficPolicyInstanceResponse extends js.Object {
    var TrafficPolicyInstance: TrafficPolicyInstance
  }

  /**
    * Gets information about a specific traffic policy version.
    */
  @js.native
  @Factory
  trait GetTrafficPolicyRequest extends js.Object {
    var Id: TrafficPolicyId
    var Version: TrafficPolicyVersion
  }

  /**
    * A complex type that contains the response information for the request.
    */
  @js.native
  @Factory
  trait GetTrafficPolicyResponse extends js.Object {
    var TrafficPolicy: TrafficPolicy
  }

  /**
    * A complex type that contains information about one health check that is associated with the current AWS account.
    */
  @js.native
  @Factory
  trait HealthCheck extends js.Object {
    var CallerReference: HealthCheckNonce
    var HealthCheckConfig: HealthCheckConfig
    var HealthCheckVersion: HealthCheckVersion
    var Id: HealthCheckId
    var CloudWatchAlarmConfiguration: js.UndefOr[CloudWatchAlarmConfiguration]
    var LinkedService: js.UndefOr[LinkedService]
  }

  /**
    * A complex type that contains information about the health check.
    */
  @js.native
  @Factory
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

  /**
    * A complex type that contains the last failure reason as reported by one Amazon Route 53 health checker.
    */
  @js.native
  @Factory
  trait HealthCheckObservation extends js.Object {
    var IPAddress: js.UndefOr[IPAddress]
    var Region: js.UndefOr[HealthCheckRegion]
    var StatusReport: js.UndefOr[StatusReport]
  }

  @js.native
  sealed trait HealthCheckRegion extends js.Any
  object HealthCheckRegion extends js.Object {
    val `us-east-1`      = "us-east-1".asInstanceOf[HealthCheckRegion]
    val `us-west-1`      = "us-west-1".asInstanceOf[HealthCheckRegion]
    val `us-west-2`      = "us-west-2".asInstanceOf[HealthCheckRegion]
    val `eu-west-1`      = "eu-west-1".asInstanceOf[HealthCheckRegion]
    val `ap-southeast-1` = "ap-southeast-1".asInstanceOf[HealthCheckRegion]
    val `ap-southeast-2` = "ap-southeast-2".asInstanceOf[HealthCheckRegion]
    val `ap-northeast-1` = "ap-northeast-1".asInstanceOf[HealthCheckRegion]
    val `sa-east-1`      = "sa-east-1".asInstanceOf[HealthCheckRegion]

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
    val HTTP              = "HTTP".asInstanceOf[HealthCheckType]
    val HTTPS             = "HTTPS".asInstanceOf[HealthCheckType]
    val HTTP_STR_MATCH    = "HTTP_STR_MATCH".asInstanceOf[HealthCheckType]
    val HTTPS_STR_MATCH   = "HTTPS_STR_MATCH".asInstanceOf[HealthCheckType]
    val TCP               = "TCP".asInstanceOf[HealthCheckType]
    val CALCULATED        = "CALCULATED".asInstanceOf[HealthCheckType]
    val CLOUDWATCH_METRIC = "CLOUDWATCH_METRIC".asInstanceOf[HealthCheckType]

    val values =
      js.Object.freeze(js.Array(HTTP, HTTPS, HTTP_STR_MATCH, HTTPS_STR_MATCH, TCP, CALCULATED, CLOUDWATCH_METRIC))
  }

  /**
    * A complex type that contains general information about the hosted zone.
    */
  @js.native
  @Factory
  trait HostedZone extends js.Object {
    var CallerReference: Nonce
    var Id: ResourceId
    var Name: DNSName
    var Config: js.UndefOr[HostedZoneConfig]
    var LinkedService: js.UndefOr[LinkedService]
    var ResourceRecordSetCount: js.UndefOr[HostedZoneRRSetCount]
  }

  /**
    * A complex type that contains an optional comment about your hosted zone. If you don't want to specify a comment, omit both the <code>HostedZoneConfig</code> and <code>Comment</code> elements.
    */
  @js.native
  @Factory
  trait HostedZoneConfig extends js.Object {
    var Comment: js.UndefOr[ResourceDescription]
    var PrivateZone: js.UndefOr[IsPrivateZone]
  }

  /**
    * A complex type that contains the type of limit that you specified in the request and the current value for that limit.
    */
  @js.native
  @Factory
  trait HostedZoneLimit extends js.Object {
    var Type: HostedZoneLimitType
    var Value: LimitValue
  }

  @js.native
  sealed trait HostedZoneLimitType extends js.Any
  object HostedZoneLimitType extends js.Object {
    val MAX_RRSETS_BY_ZONE          = "MAX_RRSETS_BY_ZONE".asInstanceOf[HostedZoneLimitType]
    val MAX_VPCS_ASSOCIATED_BY_ZONE = "MAX_VPCS_ASSOCIATED_BY_ZONE".asInstanceOf[HostedZoneLimitType]

    val values = js.Object.freeze(js.Array(MAX_RRSETS_BY_ZONE, MAX_VPCS_ASSOCIATED_BY_ZONE))
  }

  @js.native
  sealed trait InsufficientDataHealthStatus extends js.Any
  object InsufficientDataHealthStatus extends js.Object {
    val Healthy         = "Healthy".asInstanceOf[InsufficientDataHealthStatus]
    val Unhealthy       = "Unhealthy".asInstanceOf[InsufficientDataHealthStatus]
    val LastKnownStatus = "LastKnownStatus".asInstanceOf[InsufficientDataHealthStatus]

    val values = js.Object.freeze(js.Array(Healthy, Unhealthy, LastKnownStatus))
  }

  /**
    * If a health check or hosted zone was created by another service, <code>LinkedService</code> is a complex type that describes the service that created the resource. When a resource is created by another service, you can't edit or delete it using Amazon Route 53.
    */
  @js.native
  @Factory
  trait LinkedService extends js.Object {
    var Description: js.UndefOr[ResourceDescription]
    var ServicePrincipal: js.UndefOr[ServicePrincipal]
  }

  /**
    * A request to get a list of geographic locations that Amazon Route 53 supports for geolocation resource record sets.
    */
  @js.native
  @Factory
  trait ListGeoLocationsRequest extends js.Object {
    var MaxItems: js.UndefOr[PageMaxItems]
    var StartContinentCode: js.UndefOr[GeoLocationContinentCode]
    var StartCountryCode: js.UndefOr[GeoLocationCountryCode]
    var StartSubdivisionCode: js.UndefOr[GeoLocationSubdivisionCode]
  }

  /**
    * A complex type containing the response information for the request.
    */
  @js.native
  @Factory
  trait ListGeoLocationsResponse extends js.Object {
    var GeoLocationDetailsList: GeoLocationDetailsList
    var IsTruncated: PageTruncated
    var MaxItems: PageMaxItems
    var NextContinentCode: js.UndefOr[GeoLocationContinentCode]
    var NextCountryCode: js.UndefOr[GeoLocationCountryCode]
    var NextSubdivisionCode: js.UndefOr[GeoLocationSubdivisionCode]
  }

  /**
    * A request to retrieve a list of the health checks that are associated with the current AWS account.
    */
  @js.native
  @Factory
  trait ListHealthChecksRequest extends js.Object {
    var Marker: js.UndefOr[PageMarker]
    var MaxItems: js.UndefOr[PageMaxItems]
  }

  /**
    * A complex type that contains the response to a <code>ListHealthChecks</code> request.
    */
  @js.native
  @Factory
  trait ListHealthChecksResponse extends js.Object {
    var HealthChecks: HealthChecks
    var IsTruncated: PageTruncated
    var Marker: PageMarker
    var MaxItems: PageMaxItems
    var NextMarker: js.UndefOr[PageMarker]
  }

  /**
    * Retrieves a list of the public and private hosted zones that are associated with the current AWS account in ASCII order by domain name.
    */
  @js.native
  @Factory
  trait ListHostedZonesByNameRequest extends js.Object {
    var DNSName: js.UndefOr[DNSName]
    var HostedZoneId: js.UndefOr[ResourceId]
    var MaxItems: js.UndefOr[PageMaxItems]
  }

  /**
    * A complex type that contains the response information for the request.
    */
  @js.native
  @Factory
  trait ListHostedZonesByNameResponse extends js.Object {
    var HostedZones: HostedZones
    var IsTruncated: PageTruncated
    var MaxItems: PageMaxItems
    var DNSName: js.UndefOr[DNSName]
    var HostedZoneId: js.UndefOr[ResourceId]
    var NextDNSName: js.UndefOr[DNSName]
    var NextHostedZoneId: js.UndefOr[ResourceId]
  }

  /**
    * A request to retrieve a list of the public and private hosted zones that are associated with the current AWS account.
    */
  @js.native
  @Factory
  trait ListHostedZonesRequest extends js.Object {
    var DelegationSetId: js.UndefOr[ResourceId]
    var Marker: js.UndefOr[PageMarker]
    var MaxItems: js.UndefOr[PageMaxItems]
  }

  @js.native
  @Factory
  trait ListHostedZonesResponse extends js.Object {
    var HostedZones: HostedZones
    var IsTruncated: PageTruncated
    var Marker: PageMarker
    var MaxItems: PageMaxItems
    var NextMarker: js.UndefOr[PageMarker]
  }

  @js.native
  @Factory
  trait ListQueryLoggingConfigsRequest extends js.Object {
    var HostedZoneId: js.UndefOr[ResourceId]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListQueryLoggingConfigsResponse extends js.Object {
    var QueryLoggingConfigs: QueryLoggingConfigs
    var NextToken: js.UndefOr[PaginationToken]
  }

  /**
    * A request for the resource record sets that are associated with a specified hosted zone.
    */
  @js.native
  @Factory
  trait ListResourceRecordSetsRequest extends js.Object {
    var HostedZoneId: ResourceId
    var MaxItems: js.UndefOr[PageMaxItems]
    var StartRecordIdentifier: js.UndefOr[ResourceRecordSetIdentifier]
    var StartRecordName: js.UndefOr[DNSName]
    var StartRecordType: js.UndefOr[RRType]
  }

  /**
    * A complex type that contains list information for the resource record set.
    */
  @js.native
  @Factory
  trait ListResourceRecordSetsResponse extends js.Object {
    var IsTruncated: PageTruncated
    var MaxItems: PageMaxItems
    var ResourceRecordSets: ResourceRecordSets
    var NextRecordIdentifier: js.UndefOr[ResourceRecordSetIdentifier]
    var NextRecordName: js.UndefOr[DNSName]
    var NextRecordType: js.UndefOr[RRType]
  }

  /**
    * A request to get a list of the reusable delegation sets that are associated with the current AWS account.
    */
  @js.native
  @Factory
  trait ListReusableDelegationSetsRequest extends js.Object {
    var Marker: js.UndefOr[PageMarker]
    var MaxItems: js.UndefOr[PageMaxItems]
  }

  /**
    * A complex type that contains information about the reusable delegation sets that are associated with the current AWS account.
    */
  @js.native
  @Factory
  trait ListReusableDelegationSetsResponse extends js.Object {
    var DelegationSets: DelegationSets
    var IsTruncated: PageTruncated
    var Marker: PageMarker
    var MaxItems: PageMaxItems
    var NextMarker: js.UndefOr[PageMarker]
  }

  /**
    * A complex type containing information about a request for a list of the tags that are associated with an individual resource.
    */
  @js.native
  @Factory
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceId: TagResourceId
    var ResourceType: TagResourceType
  }

  /**
    * A complex type that contains information about the health checks or hosted zones for which you want to list tags.
    */
  @js.native
  @Factory
  trait ListTagsForResourceResponse extends js.Object {
    var ResourceTagSet: ResourceTagSet
  }

  /**
    * A complex type that contains information about the health checks or hosted zones for which you want to list tags.
    */
  @js.native
  @Factory
  trait ListTagsForResourcesRequest extends js.Object {
    var ResourceIds: TagResourceIdList
    var ResourceType: TagResourceType
  }

  /**
    * A complex type containing tags for the specified resources.
    */
  @js.native
  @Factory
  trait ListTagsForResourcesResponse extends js.Object {
    var ResourceTagSets: ResourceTagSetList
  }

  /**
    * A complex type that contains the information about the request to list the traffic policies that are associated with the current AWS account.
    */
  @js.native
  @Factory
  trait ListTrafficPoliciesRequest extends js.Object {
    var MaxItems: js.UndefOr[PageMaxItems]
    var TrafficPolicyIdMarker: js.UndefOr[TrafficPolicyId]
  }

  /**
    * A complex type that contains the response information for the request.
    */
  @js.native
  @Factory
  trait ListTrafficPoliciesResponse extends js.Object {
    var IsTruncated: PageTruncated
    var MaxItems: PageMaxItems
    var TrafficPolicyIdMarker: TrafficPolicyId
    var TrafficPolicySummaries: TrafficPolicySummaries
  }

  /**
    * A request for the traffic policy instances that you created in a specified hosted zone.
    */
  @js.native
  @Factory
  trait ListTrafficPolicyInstancesByHostedZoneRequest extends js.Object {
    var HostedZoneId: ResourceId
    var MaxItems: js.UndefOr[PageMaxItems]
    var TrafficPolicyInstanceNameMarker: js.UndefOr[DNSName]
    var TrafficPolicyInstanceTypeMarker: js.UndefOr[RRType]
  }

  /**
    * A complex type that contains the response information for the request.
    */
  @js.native
  @Factory
  trait ListTrafficPolicyInstancesByHostedZoneResponse extends js.Object {
    var IsTruncated: PageTruncated
    var MaxItems: PageMaxItems
    var TrafficPolicyInstances: TrafficPolicyInstances
    var TrafficPolicyInstanceNameMarker: js.UndefOr[DNSName]
    var TrafficPolicyInstanceTypeMarker: js.UndefOr[RRType]
  }

  /**
    * A complex type that contains the information about the request to list your traffic policy instances.
    */
  @js.native
  @Factory
  trait ListTrafficPolicyInstancesByPolicyRequest extends js.Object {
    var TrafficPolicyId: TrafficPolicyId
    var TrafficPolicyVersion: TrafficPolicyVersion
    var HostedZoneIdMarker: js.UndefOr[ResourceId]
    var MaxItems: js.UndefOr[PageMaxItems]
    var TrafficPolicyInstanceNameMarker: js.UndefOr[DNSName]
    var TrafficPolicyInstanceTypeMarker: js.UndefOr[RRType]
  }

  /**
    * A complex type that contains the response information for the request.
    */
  @js.native
  @Factory
  trait ListTrafficPolicyInstancesByPolicyResponse extends js.Object {
    var IsTruncated: PageTruncated
    var MaxItems: PageMaxItems
    var TrafficPolicyInstances: TrafficPolicyInstances
    var HostedZoneIdMarker: js.UndefOr[ResourceId]
    var TrafficPolicyInstanceNameMarker: js.UndefOr[DNSName]
    var TrafficPolicyInstanceTypeMarker: js.UndefOr[RRType]
  }

  /**
    * A request to get information about the traffic policy instances that you created by using the current AWS account.
    */
  @js.native
  @Factory
  trait ListTrafficPolicyInstancesRequest extends js.Object {
    var HostedZoneIdMarker: js.UndefOr[ResourceId]
    var MaxItems: js.UndefOr[PageMaxItems]
    var TrafficPolicyInstanceNameMarker: js.UndefOr[DNSName]
    var TrafficPolicyInstanceTypeMarker: js.UndefOr[RRType]
  }

  /**
    * A complex type that contains the response information for the request.
    */
  @js.native
  @Factory
  trait ListTrafficPolicyInstancesResponse extends js.Object {
    var IsTruncated: PageTruncated
    var MaxItems: PageMaxItems
    var TrafficPolicyInstances: TrafficPolicyInstances
    var HostedZoneIdMarker: js.UndefOr[ResourceId]
    var TrafficPolicyInstanceNameMarker: js.UndefOr[DNSName]
    var TrafficPolicyInstanceTypeMarker: js.UndefOr[RRType]
  }

  /**
    * A complex type that contains the information about the request to list your traffic policies.
    */
  @js.native
  @Factory
  trait ListTrafficPolicyVersionsRequest extends js.Object {
    var Id: TrafficPolicyId
    var MaxItems: js.UndefOr[PageMaxItems]
    var TrafficPolicyVersionMarker: js.UndefOr[TrafficPolicyVersionMarker]
  }

  /**
    * A complex type that contains the response information for the request.
    */
  @js.native
  @Factory
  trait ListTrafficPolicyVersionsResponse extends js.Object {
    var IsTruncated: PageTruncated
    var MaxItems: PageMaxItems
    var TrafficPolicies: TrafficPolicies
    var TrafficPolicyVersionMarker: TrafficPolicyVersionMarker
  }

  /**
    * A complex type that contains information about that can be associated with your hosted zone.
    */
  @js.native
  @Factory
  trait ListVPCAssociationAuthorizationsRequest extends js.Object {
    var HostedZoneId: ResourceId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[PaginationToken]
  }

  /**
    * A complex type that contains the response information for the request.
    */
  @js.native
  @Factory
  trait ListVPCAssociationAuthorizationsResponse extends js.Object {
    var HostedZoneId: ResourceId
    var VPCs: VPCs
    var NextToken: js.UndefOr[PaginationToken]
  }

  /**
    * A complex type that contains information about a configuration for DNS query logging.
    */
  @js.native
  @Factory
  trait QueryLoggingConfig extends js.Object {
    var CloudWatchLogsLogGroupArn: CloudWatchLogsLogGroupArn
    var HostedZoneId: ResourceId
    var Id: QueryLoggingConfigId
  }

  @js.native
  sealed trait RRType extends js.Any
  object RRType extends js.Object {
    val SOA   = "SOA".asInstanceOf[RRType]
    val A     = "A".asInstanceOf[RRType]
    val TXT   = "TXT".asInstanceOf[RRType]
    val NS    = "NS".asInstanceOf[RRType]
    val CNAME = "CNAME".asInstanceOf[RRType]
    val MX    = "MX".asInstanceOf[RRType]
    val NAPTR = "NAPTR".asInstanceOf[RRType]
    val PTR   = "PTR".asInstanceOf[RRType]
    val SRV   = "SRV".asInstanceOf[RRType]
    val SPF   = "SPF".asInstanceOf[RRType]
    val AAAA  = "AAAA".asInstanceOf[RRType]
    val CAA   = "CAA".asInstanceOf[RRType]

    val values = js.Object.freeze(js.Array(SOA, A, TXT, NS, CNAME, MX, NAPTR, PTR, SRV, SPF, AAAA, CAA))
  }

  @js.native
  sealed trait ResettableElementName extends js.Any
  object ResettableElementName extends js.Object {
    val FullyQualifiedDomainName = "FullyQualifiedDomainName".asInstanceOf[ResettableElementName]
    val Regions                  = "Regions".asInstanceOf[ResettableElementName]
    val ResourcePath             = "ResourcePath".asInstanceOf[ResettableElementName]
    val ChildHealthChecks        = "ChildHealthChecks".asInstanceOf[ResettableElementName]

    val values = js.Object.freeze(js.Array(FullyQualifiedDomainName, Regions, ResourcePath, ChildHealthChecks))
  }

  /**
    * Information specific to the resource record.
    *
    * '''Note:'''If you're creating an alias resource record set, omit <code>ResourceRecord</code>.
    */
  @js.native
  @Factory
  trait ResourceRecord extends js.Object {
    var Value: RData
  }

  /**
    * Information about the resource record set to create or delete.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait ResourceRecordSetFailover extends js.Any
  object ResourceRecordSetFailover extends js.Object {
    val PRIMARY   = "PRIMARY".asInstanceOf[ResourceRecordSetFailover]
    val SECONDARY = "SECONDARY".asInstanceOf[ResourceRecordSetFailover]

    val values = js.Object.freeze(js.Array(PRIMARY, SECONDARY))
  }

  @js.native
  sealed trait ResourceRecordSetRegion extends js.Any
  object ResourceRecordSetRegion extends js.Object {
    val `us-east-1`      = "us-east-1".asInstanceOf[ResourceRecordSetRegion]
    val `us-east-2`      = "us-east-2".asInstanceOf[ResourceRecordSetRegion]
    val `us-west-1`      = "us-west-1".asInstanceOf[ResourceRecordSetRegion]
    val `us-west-2`      = "us-west-2".asInstanceOf[ResourceRecordSetRegion]
    val `ca-central-1`   = "ca-central-1".asInstanceOf[ResourceRecordSetRegion]
    val `eu-west-1`      = "eu-west-1".asInstanceOf[ResourceRecordSetRegion]
    val `eu-west-2`      = "eu-west-2".asInstanceOf[ResourceRecordSetRegion]
    val `eu-west-3`      = "eu-west-3".asInstanceOf[ResourceRecordSetRegion]
    val `eu-central-1`   = "eu-central-1".asInstanceOf[ResourceRecordSetRegion]
    val `ap-southeast-1` = "ap-southeast-1".asInstanceOf[ResourceRecordSetRegion]
    val `ap-southeast-2` = "ap-southeast-2".asInstanceOf[ResourceRecordSetRegion]
    val `ap-northeast-1` = "ap-northeast-1".asInstanceOf[ResourceRecordSetRegion]
    val `ap-northeast-2` = "ap-northeast-2".asInstanceOf[ResourceRecordSetRegion]
    val `ap-northeast-3` = "ap-northeast-3".asInstanceOf[ResourceRecordSetRegion]
    val `eu-north-1`     = "eu-north-1".asInstanceOf[ResourceRecordSetRegion]
    val `sa-east-1`      = "sa-east-1".asInstanceOf[ResourceRecordSetRegion]
    val `cn-north-1`     = "cn-north-1".asInstanceOf[ResourceRecordSetRegion]
    val `cn-northwest-1` = "cn-northwest-1".asInstanceOf[ResourceRecordSetRegion]
    val `ap-east-1`      = "ap-east-1".asInstanceOf[ResourceRecordSetRegion]
    val `me-south-1`     = "me-south-1".asInstanceOf[ResourceRecordSetRegion]
    val `ap-south-1`     = "ap-south-1".asInstanceOf[ResourceRecordSetRegion]

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
        `ap-south-1`
      )
    )
  }

  /**
    * A complex type containing a resource and its associated tags.
    */
  @js.native
  @Factory
  trait ResourceTagSet extends js.Object {
    var ResourceId: js.UndefOr[TagResourceId]
    var ResourceType: js.UndefOr[TagResourceType]
    var Tags: js.UndefOr[TagList]
  }

  /**
    * A complex type that contains the type of limit that you specified in the request and the current value for that limit.
    */
  @js.native
  @Factory
  trait ReusableDelegationSetLimit extends js.Object {
    var Type: ReusableDelegationSetLimitType
    var Value: LimitValue
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
    val Average     = "Average".asInstanceOf[Statistic]
    val Sum         = "Sum".asInstanceOf[Statistic]
    val SampleCount = "SampleCount".asInstanceOf[Statistic]
    val Maximum     = "Maximum".asInstanceOf[Statistic]
    val Minimum     = "Minimum".asInstanceOf[Statistic]

    val values = js.Object.freeze(js.Array(Average, Sum, SampleCount, Maximum, Minimum))
  }

  /**
    * A complex type that contains the status that one Amazon Route 53 health checker reports and the time of the health check.
    */
  @js.native
  @Factory
  trait StatusReport extends js.Object {
    var CheckedTime: js.UndefOr[TimeStamp]
    var Status: js.UndefOr[Status]
  }

  /**
    * A complex type that contains information about a tag that you want to add or edit for the specified health check or hosted zone.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var Key: js.UndefOr[TagKey]
    var Value: js.UndefOr[TagValue]
  }

  @js.native
  sealed trait TagResourceType extends js.Any
  object TagResourceType extends js.Object {
    val healthcheck = "healthcheck".asInstanceOf[TagResourceType]
    val hostedzone  = "hostedzone".asInstanceOf[TagResourceType]

    val values = js.Object.freeze(js.Array(healthcheck, hostedzone))
  }

  /**
    * Gets the value that Amazon Route 53 returns in response to a DNS request for a specified record name and type. You can optionally specify the IP address of a DNS resolver, an EDNS0 client subnet IP address, and a subnet mask.
    */
  @js.native
  @Factory
  trait TestDNSAnswerRequest extends js.Object {
    var HostedZoneId: ResourceId
    var RecordName: DNSName
    var RecordType: RRType
    var EDNS0ClientSubnetIP: js.UndefOr[IPAddress]
    var EDNS0ClientSubnetMask: js.UndefOr[SubnetMask]
    var ResolverIP: js.UndefOr[IPAddress]
  }

  /**
    * A complex type that contains the response to a <code>TestDNSAnswer</code> request.
    */
  @js.native
  @Factory
  trait TestDNSAnswerResponse extends js.Object {
    var Nameserver: Nameserver
    var Protocol: TransportProtocol
    var RecordData: RecordData
    var RecordName: DNSName
    var RecordType: RRType
    var ResponseCode: DNSRCode
  }

  /**
    * A complex type that contains settings for a traffic policy.
    */
  @js.native
  @Factory
  trait TrafficPolicy extends js.Object {
    var Document: TrafficPolicyDocument
    var Id: TrafficPolicyId
    var Name: TrafficPolicyName
    var Type: RRType
    var Version: TrafficPolicyVersion
    var Comment: js.UndefOr[TrafficPolicyComment]
  }

  /**
    * A complex type that contains settings for the new traffic policy instance.
    */
  @js.native
  @Factory
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

  /**
    * A complex type that contains information about the latest version of one traffic policy that is associated with the current AWS account.
    */
  @js.native
  @Factory
  trait TrafficPolicySummary extends js.Object {
    var Id: TrafficPolicyId
    var LatestVersion: TrafficPolicyVersion
    var Name: TrafficPolicyName
    var TrafficPolicyCount: TrafficPolicyVersion
    var Type: RRType
  }

  /**
    * A complex type that contains information about a request to update a health check.
    */
  @js.native
  @Factory
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

  /**
    * A complex type that contains the response to the <code>UpdateHealthCheck</code> request.
    */
  @js.native
  @Factory
  trait UpdateHealthCheckResponse extends js.Object {
    var HealthCheck: HealthCheck
  }

  /**
    * A request to update the comment for a hosted zone.
    */
  @js.native
  @Factory
  trait UpdateHostedZoneCommentRequest extends js.Object {
    var Id: ResourceId
    var Comment: js.UndefOr[ResourceDescription]
  }

  /**
    * A complex type that contains the response to the <code>UpdateHostedZoneComment</code> request.
    */
  @js.native
  @Factory
  trait UpdateHostedZoneCommentResponse extends js.Object {
    var HostedZone: HostedZone
  }

  /**
    * A complex type that contains information about the traffic policy that you want to update the comment for.
    */
  @js.native
  @Factory
  trait UpdateTrafficPolicyCommentRequest extends js.Object {
    var Comment: TrafficPolicyComment
    var Id: TrafficPolicyId
    var Version: TrafficPolicyVersion
  }

  /**
    * A complex type that contains the response information for the traffic policy.
    */
  @js.native
  @Factory
  trait UpdateTrafficPolicyCommentResponse extends js.Object {
    var TrafficPolicy: TrafficPolicy
  }

  /**
    * A complex type that contains information about the resource record sets that you want to update based on a specified traffic policy instance.
    */
  @js.native
  @Factory
  trait UpdateTrafficPolicyInstanceRequest extends js.Object {
    var Id: TrafficPolicyInstanceId
    var TTL: TTL
    var TrafficPolicyId: TrafficPolicyId
    var TrafficPolicyVersion: TrafficPolicyVersion
  }

  /**
    * A complex type that contains information about the resource record sets that Amazon Route 53 created based on a specified traffic policy.
    */
  @js.native
  @Factory
  trait UpdateTrafficPolicyInstanceResponse extends js.Object {
    var TrafficPolicyInstance: TrafficPolicyInstance
  }

  /**
    * (Private hosted zones only) A complex type that contains information about an Amazon VPC.
    */
  @js.native
  @Factory
  trait VPC extends js.Object {
    var VPCId: js.UndefOr[VPCId]
    var VPCRegion: js.UndefOr[VPCRegion]
  }

  @js.native
  sealed trait VPCRegion extends js.Any
  object VPCRegion extends js.Object {
    val `us-east-1`      = "us-east-1".asInstanceOf[VPCRegion]
    val `us-east-2`      = "us-east-2".asInstanceOf[VPCRegion]
    val `us-west-1`      = "us-west-1".asInstanceOf[VPCRegion]
    val `us-west-2`      = "us-west-2".asInstanceOf[VPCRegion]
    val `eu-west-1`      = "eu-west-1".asInstanceOf[VPCRegion]
    val `eu-west-2`      = "eu-west-2".asInstanceOf[VPCRegion]
    val `eu-west-3`      = "eu-west-3".asInstanceOf[VPCRegion]
    val `eu-central-1`   = "eu-central-1".asInstanceOf[VPCRegion]
    val `ap-east-1`      = "ap-east-1".asInstanceOf[VPCRegion]
    val `me-south-1`     = "me-south-1".asInstanceOf[VPCRegion]
    val `ap-southeast-1` = "ap-southeast-1".asInstanceOf[VPCRegion]
    val `ap-southeast-2` = "ap-southeast-2".asInstanceOf[VPCRegion]
    val `ap-south-1`     = "ap-south-1".asInstanceOf[VPCRegion]
    val `ap-northeast-1` = "ap-northeast-1".asInstanceOf[VPCRegion]
    val `ap-northeast-2` = "ap-northeast-2".asInstanceOf[VPCRegion]
    val `ap-northeast-3` = "ap-northeast-3".asInstanceOf[VPCRegion]
    val `eu-north-1`     = "eu-north-1".asInstanceOf[VPCRegion]
    val `sa-east-1`      = "sa-east-1".asInstanceOf[VPCRegion]
    val `ca-central-1`   = "ca-central-1".asInstanceOf[VPCRegion]
    val `cn-north-1`     = "cn-north-1".asInstanceOf[VPCRegion]

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
        `ap-southeast-1`,
        `ap-southeast-2`,
        `ap-south-1`,
        `ap-northeast-1`,
        `ap-northeast-2`,
        `ap-northeast-3`,
        `eu-north-1`,
        `sa-east-1`,
        `ca-central-1`,
        `cn-north-1`
      )
    )
  }
}
