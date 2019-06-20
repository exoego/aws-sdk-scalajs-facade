package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object route53 {
  type AccountLimitType                  = String
  type AlarmName                         = String
  type AliasHealthEnabled                = Boolean
  type AssociateVPCComment               = String
  type ChangeAction                      = String
  type ChangeStatus                      = String
  type Changes                           = js.Array[Change]
  type CheckerIpRanges                   = js.Array[IPAddressCidr]
  type ChildHealthCheckList              = js.Array[HealthCheckId]
  type CloudWatchLogsLogGroupArn         = String
  type CloudWatchRegion                  = String
  type ComparisonOperator                = String
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
  type HealthCheckRegion                 = String
  type HealthCheckRegionList             = js.Array[HealthCheckRegion]
  type HealthCheckType                   = String
  type HealthCheckVersion                = Double
  type HealthChecks                      = js.Array[HealthCheck]
  type HealthThreshold                   = Int
  type HostedZoneCount                   = Double
  type HostedZoneLimitType               = String
  type HostedZoneRRSetCount              = Double
  type HostedZones                       = js.Array[HostedZone]
  type IPAddress                         = String
  type IPAddressCidr                     = String
  type InsufficientDataHealthStatus      = String
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
  type RRType                            = String
  type RecordData                        = js.Array[RecordDataEntry]
  type RecordDataEntry                   = String
  type RequestInterval                   = Int
  type ResettableElementName             = String
  type ResettableElementNameList         = js.Array[ResettableElementName]
  type ResourceDescription               = String
  type ResourceId                        = String
  type ResourcePath                      = String
  type ResourceRecordSetFailover         = String
  type ResourceRecordSetIdentifier       = String
  type ResourceRecordSetMultiValueAnswer = Boolean
  type ResourceRecordSetRegion           = String
  type ResourceRecordSetWeight           = Double
  type ResourceRecordSets                = js.Array[ResourceRecordSet]
  type ResourceRecords                   = js.Array[ResourceRecord]
  type ResourceTagSetList                = js.Array[ResourceTagSet]
  type ResourceURI                       = String
  type ReusableDelegationSetLimitType    = String
  type SearchString                      = String
  type ServicePrincipal                  = String
  type Statistic                         = String
  type Status                            = String
  type SubnetMask                        = String
  type TTL                               = Double
  type TagKey                            = String
  type TagKeyList                        = js.Array[TagKey]
  type TagList                           = js.Array[Tag]
  type TagResourceId                     = String
  type TagResourceIdList                 = js.Array[TagResourceId]
  type TagResourceType                   = String
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
  type VPCRegion                         = String
  type VPCs                              = js.Array[VPC]
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
  trait AccountLimit extends js.Object {
    var Type: AccountLimitType
    var Value: LimitValue
  }

  object AccountLimit {
    def apply(
        Type: AccountLimitType,
        Value: LimitValue
    ): AccountLimit = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Type"  -> Type.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AccountLimit]
    }
  }

  object AccountLimitTypeEnum {
    val MAX_HEALTH_CHECKS_BY_OWNER            = "MAX_HEALTH_CHECKS_BY_OWNER"
    val MAX_HOSTED_ZONES_BY_OWNER             = "MAX_HOSTED_ZONES_BY_OWNER"
    val MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER = "MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER"
    val MAX_REUSABLE_DELEGATION_SETS_BY_OWNER = "MAX_REUSABLE_DELEGATION_SETS_BY_OWNER"
    val MAX_TRAFFIC_POLICIES_BY_OWNER         = "MAX_TRAFFIC_POLICIES_BY_OWNER"

    val values = IndexedSeq(
      MAX_HEALTH_CHECKS_BY_OWNER,
      MAX_HOSTED_ZONES_BY_OWNER,
      MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER,
      MAX_REUSABLE_DELEGATION_SETS_BY_OWNER,
      MAX_TRAFFIC_POLICIES_BY_OWNER
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
    def apply(
        Name: AlarmName,
        Region: CloudWatchRegion
    ): AlarmIdentifier = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name"   -> Name.asInstanceOf[js.Any],
        "Region" -> Region.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AlarmIdentifier]
    }
  }

  /**
    * <i>Alias resource record sets only:</i> Information about the CloudFront distribution, Elastic Beanstalk environment, ELB load balancer, Amazon S3 bucket, or Amazon Route 53 resource record set that you're redirecting queries to. An Elastic Beanstalk environment must have a regionalized subdomain.
    *  When creating resource record sets for a private hosted zone, note the following:
    * * Resource record sets can't be created for CloudFront distributions in a private hosted zone.
    *  * Creating geolocation alias resource record sets or latency alias resource record sets in a private hosted zone is unsupported.
    *  * For information about creating failover resource record sets in a private hosted zone, see [[http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-private-hosted-zones.html|Configuring Failover in a Private Hosted Zone]].
    */
  @js.native
  trait AliasTarget extends js.Object {
    var DNSName: DNSName
    var EvaluateTargetHealth: AliasHealthEnabled
    var HostedZoneId: ResourceId
  }

  object AliasTarget {
    def apply(
        DNSName: DNSName,
        EvaluateTargetHealth: AliasHealthEnabled,
        HostedZoneId: ResourceId
    ): AliasTarget = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DNSName"              -> DNSName.asInstanceOf[js.Any],
        "EvaluateTargetHealth" -> EvaluateTargetHealth.asInstanceOf[js.Any],
        "HostedZoneId"         -> HostedZoneId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AliasTarget]
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
    def apply(
        HostedZoneId: ResourceId,
        VPC: VPC,
        Comment: js.UndefOr[AssociateVPCComment] = js.undefined
    ): AssociateVPCWithHostedZoneRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HostedZoneId" -> HostedZoneId.asInstanceOf[js.Any],
        "VPC"          -> VPC.asInstanceOf[js.Any],
        "Comment" -> Comment.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateVPCWithHostedZoneRequest]
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
    def apply(
        ChangeInfo: ChangeInfo
    ): AssociateVPCWithHostedZoneResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeInfo" -> ChangeInfo.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateVPCWithHostedZoneResponse]
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
    def apply(
        Action: ChangeAction,
        ResourceRecordSet: ResourceRecordSet
    ): Change = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Action"            -> Action.asInstanceOf[js.Any],
        "ResourceRecordSet" -> ResourceRecordSet.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

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
    * The information for a change request.
    */
  @js.native
  trait ChangeBatch extends js.Object {
    var Changes: Changes
    var Comment: js.UndefOr[ResourceDescription]
  }

  object ChangeBatch {
    def apply(
        Changes: Changes,
        Comment: js.UndefOr[ResourceDescription] = js.undefined
    ): ChangeBatch = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Changes" -> Changes.asInstanceOf[js.Any],
        "Comment" -> Comment.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ChangeBatch]
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
    def apply(
        Id: ResourceId,
        Status: ChangeStatus,
        SubmittedAt: TimeStamp,
        Comment: js.UndefOr[ResourceDescription] = js.undefined
    ): ChangeInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id"          -> Id.asInstanceOf[js.Any],
        "Status"      -> Status.asInstanceOf[js.Any],
        "SubmittedAt" -> SubmittedAt.asInstanceOf[js.Any],
        "Comment" -> Comment.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ChangeInfo]
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
    def apply(
        ChangeBatch: ChangeBatch,
        HostedZoneId: ResourceId
    ): ChangeResourceRecordSetsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeBatch"  -> ChangeBatch.asInstanceOf[js.Any],
        "HostedZoneId" -> HostedZoneId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ChangeResourceRecordSetsRequest]
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
    def apply(
        ChangeInfo: ChangeInfo
    ): ChangeResourceRecordSetsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeInfo" -> ChangeInfo.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ChangeResourceRecordSetsResponse]
    }
  }

  object ChangeStatusEnum {
    val PENDING = "PENDING"
    val INSYNC  = "INSYNC"

    val values = IndexedSeq(PENDING, INSYNC)
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
    def apply(
        ResourceId: TagResourceId,
        ResourceType: TagResourceType,
        AddTags: js.UndefOr[TagList] = js.undefined,
        RemoveTagKeys: js.UndefOr[TagKeyList] = js.undefined
    ): ChangeTagsForResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceId"   -> ResourceId.asInstanceOf[js.Any],
        "ResourceType" -> ResourceType.asInstanceOf[js.Any],
        "AddTags" -> AddTags.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RemoveTagKeys" -> RemoveTagKeys.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ChangeTagsForResourceRequest]
    }
  }

  /**
    * Empty response for the request.
    */
  @js.native
  trait ChangeTagsForResourceResponse extends js.Object {}

  object ChangeTagsForResourceResponse {
    def apply(
        ): ChangeTagsForResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ChangeTagsForResourceResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "ComparisonOperator" -> ComparisonOperator.asInstanceOf[js.Any],
        "EvaluationPeriods"  -> EvaluationPeriods.asInstanceOf[js.Any],
        "MetricName"         -> MetricName.asInstanceOf[js.Any],
        "Namespace"          -> Namespace.asInstanceOf[js.Any],
        "Period"             -> Period.asInstanceOf[js.Any],
        "Statistic"          -> Statistic.asInstanceOf[js.Any],
        "Threshold"          -> Threshold.asInstanceOf[js.Any],
        "Dimensions" -> Dimensions.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CloudWatchAlarmConfiguration]
    }
  }

  object CloudWatchRegionEnum {
    val `us-east-1`      = "us-east-1"
    val `us-east-2`      = "us-east-2"
    val `us-west-1`      = "us-west-1"
    val `us-west-2`      = "us-west-2"
    val `ca-central-1`   = "ca-central-1"
    val `eu-central-1`   = "eu-central-1"
    val `eu-west-1`      = "eu-west-1"
    val `eu-west-2`      = "eu-west-2"
    val `eu-west-3`      = "eu-west-3"
    val `ap-south-1`     = "ap-south-1"
    val `ap-southeast-1` = "ap-southeast-1"
    val `ap-southeast-2` = "ap-southeast-2"
    val `ap-northeast-1` = "ap-northeast-1"
    val `ap-northeast-2` = "ap-northeast-2"
    val `ap-northeast-3` = "ap-northeast-3"
    val `eu-north-1`     = "eu-north-1"
    val `sa-east-1`      = "sa-east-1"

    val values = IndexedSeq(
      `us-east-1`,
      `us-east-2`,
      `us-west-1`,
      `us-west-2`,
      `ca-central-1`,
      `eu-central-1`,
      `eu-west-1`,
      `eu-west-2`,
      `eu-west-3`,
      `ap-south-1`,
      `ap-southeast-1`,
      `ap-southeast-2`,
      `ap-northeast-1`,
      `ap-northeast-2`,
      `ap-northeast-3`,
      `eu-north-1`,
      `sa-east-1`
    )
  }

  object ComparisonOperatorEnum {
    val GreaterThanOrEqualToThreshold = "GreaterThanOrEqualToThreshold"
    val GreaterThanThreshold          = "GreaterThanThreshold"
    val LessThanThreshold             = "LessThanThreshold"
    val LessThanOrEqualToThreshold    = "LessThanOrEqualToThreshold"

    val values =
      IndexedSeq(GreaterThanOrEqualToThreshold, GreaterThanThreshold, LessThanThreshold, LessThanOrEqualToThreshold)
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
    def apply(
        CallerReference: HealthCheckNonce,
        HealthCheckConfig: HealthCheckConfig
    ): CreateHealthCheckRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CallerReference"   -> CallerReference.asInstanceOf[js.Any],
        "HealthCheckConfig" -> HealthCheckConfig.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateHealthCheckRequest]
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
    def apply(
        HealthCheck: HealthCheck,
        Location: ResourceURI
    ): CreateHealthCheckResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HealthCheck" -> HealthCheck.asInstanceOf[js.Any],
        "Location"    -> Location.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateHealthCheckResponse]
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
    def apply(
        CallerReference: Nonce,
        Name: DNSName,
        DelegationSetId: js.UndefOr[ResourceId] = js.undefined,
        HostedZoneConfig: js.UndefOr[HostedZoneConfig] = js.undefined,
        VPC: js.UndefOr[VPC] = js.undefined
    ): CreateHostedZoneRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CallerReference" -> CallerReference.asInstanceOf[js.Any],
        "Name"            -> Name.asInstanceOf[js.Any],
        "DelegationSetId" -> DelegationSetId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HostedZoneConfig" -> HostedZoneConfig.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VPC" -> VPC.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateHostedZoneRequest]
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
    def apply(
        ChangeInfo: ChangeInfo,
        DelegationSet: DelegationSet,
        HostedZone: HostedZone,
        Location: ResourceURI,
        VPC: js.UndefOr[VPC] = js.undefined
    ): CreateHostedZoneResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeInfo"    -> ChangeInfo.asInstanceOf[js.Any],
        "DelegationSet" -> DelegationSet.asInstanceOf[js.Any],
        "HostedZone"    -> HostedZone.asInstanceOf[js.Any],
        "Location"      -> Location.asInstanceOf[js.Any],
        "VPC" -> VPC.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateHostedZoneResponse]
    }
  }

  @js.native
  trait CreateQueryLoggingConfigRequest extends js.Object {
    var CloudWatchLogsLogGroupArn: CloudWatchLogsLogGroupArn
    var HostedZoneId: ResourceId
  }

  object CreateQueryLoggingConfigRequest {
    def apply(
        CloudWatchLogsLogGroupArn: CloudWatchLogsLogGroupArn,
        HostedZoneId: ResourceId
    ): CreateQueryLoggingConfigRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CloudWatchLogsLogGroupArn" -> CloudWatchLogsLogGroupArn.asInstanceOf[js.Any],
        "HostedZoneId"              -> HostedZoneId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateQueryLoggingConfigRequest]
    }
  }

  @js.native
  trait CreateQueryLoggingConfigResponse extends js.Object {
    var Location: ResourceURI
    var QueryLoggingConfig: QueryLoggingConfig
  }

  object CreateQueryLoggingConfigResponse {
    def apply(
        Location: ResourceURI,
        QueryLoggingConfig: QueryLoggingConfig
    ): CreateQueryLoggingConfigResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Location"           -> Location.asInstanceOf[js.Any],
        "QueryLoggingConfig" -> QueryLoggingConfig.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateQueryLoggingConfigResponse]
    }
  }

  @js.native
  trait CreateReusableDelegationSetRequest extends js.Object {
    var CallerReference: Nonce
    var HostedZoneId: js.UndefOr[ResourceId]
  }

  object CreateReusableDelegationSetRequest {
    def apply(
        CallerReference: Nonce,
        HostedZoneId: js.UndefOr[ResourceId] = js.undefined
    ): CreateReusableDelegationSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CallerReference" -> CallerReference.asInstanceOf[js.Any],
        "HostedZoneId" -> HostedZoneId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateReusableDelegationSetRequest]
    }
  }

  @js.native
  trait CreateReusableDelegationSetResponse extends js.Object {
    var DelegationSet: DelegationSet
    var Location: ResourceURI
  }

  object CreateReusableDelegationSetResponse {
    def apply(
        DelegationSet: DelegationSet,
        Location: ResourceURI
    ): CreateReusableDelegationSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DelegationSet" -> DelegationSet.asInstanceOf[js.Any],
        "Location"      -> Location.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateReusableDelegationSetResponse]
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
    def apply(
        HostedZoneId: ResourceId,
        Name: DNSName,
        TTL: TTL,
        TrafficPolicyId: TrafficPolicyId,
        TrafficPolicyVersion: TrafficPolicyVersion
    ): CreateTrafficPolicyInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HostedZoneId"         -> HostedZoneId.asInstanceOf[js.Any],
        "Name"                 -> Name.asInstanceOf[js.Any],
        "TTL"                  -> TTL.asInstanceOf[js.Any],
        "TrafficPolicyId"      -> TrafficPolicyId.asInstanceOf[js.Any],
        "TrafficPolicyVersion" -> TrafficPolicyVersion.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTrafficPolicyInstanceRequest]
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
    def apply(
        Location: ResourceURI,
        TrafficPolicyInstance: TrafficPolicyInstance
    ): CreateTrafficPolicyInstanceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Location"              -> Location.asInstanceOf[js.Any],
        "TrafficPolicyInstance" -> TrafficPolicyInstance.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTrafficPolicyInstanceResponse]
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
    def apply(
        Document: TrafficPolicyDocument,
        Name: TrafficPolicyName,
        Comment: js.UndefOr[TrafficPolicyComment] = js.undefined
    ): CreateTrafficPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Document" -> Document.asInstanceOf[js.Any],
        "Name"     -> Name.asInstanceOf[js.Any],
        "Comment" -> Comment.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTrafficPolicyRequest]
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
    def apply(
        Location: ResourceURI,
        TrafficPolicy: TrafficPolicy
    ): CreateTrafficPolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Location"      -> Location.asInstanceOf[js.Any],
        "TrafficPolicy" -> TrafficPolicy.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTrafficPolicyResponse]
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
    def apply(
        Document: TrafficPolicyDocument,
        Id: TrafficPolicyId,
        Comment: js.UndefOr[TrafficPolicyComment] = js.undefined
    ): CreateTrafficPolicyVersionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Document" -> Document.asInstanceOf[js.Any],
        "Id"       -> Id.asInstanceOf[js.Any],
        "Comment" -> Comment.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTrafficPolicyVersionRequest]
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
    def apply(
        Location: ResourceURI,
        TrafficPolicy: TrafficPolicy
    ): CreateTrafficPolicyVersionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Location"      -> Location.asInstanceOf[js.Any],
        "TrafficPolicy" -> TrafficPolicy.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTrafficPolicyVersionResponse]
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
    def apply(
        HostedZoneId: ResourceId,
        VPC: VPC
    ): CreateVPCAssociationAuthorizationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HostedZoneId" -> HostedZoneId.asInstanceOf[js.Any],
        "VPC"          -> VPC.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateVPCAssociationAuthorizationRequest]
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
    def apply(
        HostedZoneId: ResourceId,
        VPC: VPC
    ): CreateVPCAssociationAuthorizationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HostedZoneId" -> HostedZoneId.asInstanceOf[js.Any],
        "VPC"          -> VPC.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateVPCAssociationAuthorizationResponse]
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
    def apply(
        NameServers: DelegationSetNameServers,
        CallerReference: js.UndefOr[Nonce] = js.undefined,
        Id: js.UndefOr[ResourceId] = js.undefined
    ): DelegationSet = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NameServers" -> NameServers.asInstanceOf[js.Any],
        "CallerReference" -> CallerReference.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DelegationSet]
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
    def apply(
        HealthCheckId: HealthCheckId
    ): DeleteHealthCheckRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HealthCheckId" -> HealthCheckId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteHealthCheckRequest]
    }
  }

  /**
    * An empty element.
    */
  @js.native
  trait DeleteHealthCheckResponse extends js.Object {}

  object DeleteHealthCheckResponse {
    def apply(
        ): DeleteHealthCheckResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteHealthCheckResponse]
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
    def apply(
        Id: ResourceId
    ): DeleteHostedZoneRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteHostedZoneRequest]
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
    def apply(
        ChangeInfo: ChangeInfo
    ): DeleteHostedZoneResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeInfo" -> ChangeInfo.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteHostedZoneResponse]
    }
  }

  @js.native
  trait DeleteQueryLoggingConfigRequest extends js.Object {
    var Id: QueryLoggingConfigId
  }

  object DeleteQueryLoggingConfigRequest {
    def apply(
        Id: QueryLoggingConfigId
    ): DeleteQueryLoggingConfigRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteQueryLoggingConfigRequest]
    }
  }

  @js.native
  trait DeleteQueryLoggingConfigResponse extends js.Object {}

  object DeleteQueryLoggingConfigResponse {
    def apply(
        ): DeleteQueryLoggingConfigResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteQueryLoggingConfigResponse]
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
    def apply(
        Id: ResourceId
    ): DeleteReusableDelegationSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteReusableDelegationSetRequest]
    }
  }

  /**
    * An empty element.
    */
  @js.native
  trait DeleteReusableDelegationSetResponse extends js.Object {}

  object DeleteReusableDelegationSetResponse {
    def apply(
        ): DeleteReusableDelegationSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteReusableDelegationSetResponse]
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
    def apply(
        Id: TrafficPolicyInstanceId
    ): DeleteTrafficPolicyInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTrafficPolicyInstanceRequest]
    }
  }

  /**
    * An empty element.
    */
  @js.native
  trait DeleteTrafficPolicyInstanceResponse extends js.Object {}

  object DeleteTrafficPolicyInstanceResponse {
    def apply(
        ): DeleteTrafficPolicyInstanceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTrafficPolicyInstanceResponse]
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
    def apply(
        Id: TrafficPolicyId,
        Version: TrafficPolicyVersion
    ): DeleteTrafficPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id"      -> Id.asInstanceOf[js.Any],
        "Version" -> Version.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTrafficPolicyRequest]
    }
  }

  /**
    * An empty element.
    */
  @js.native
  trait DeleteTrafficPolicyResponse extends js.Object {}

  object DeleteTrafficPolicyResponse {
    def apply(
        ): DeleteTrafficPolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTrafficPolicyResponse]
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
    def apply(
        HostedZoneId: ResourceId,
        VPC: VPC
    ): DeleteVPCAssociationAuthorizationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HostedZoneId" -> HostedZoneId.asInstanceOf[js.Any],
        "VPC"          -> VPC.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteVPCAssociationAuthorizationRequest]
    }
  }

  /**
    * Empty response for the request.
    */
  @js.native
  trait DeleteVPCAssociationAuthorizationResponse extends js.Object {}

  object DeleteVPCAssociationAuthorizationResponse {
    def apply(
        ): DeleteVPCAssociationAuthorizationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteVPCAssociationAuthorizationResponse]
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
    def apply(
        Name: DimensionField,
        Value: DimensionField
    ): Dimension = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name"  -> Name.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Dimension]
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
    def apply(
        HostedZoneId: ResourceId,
        VPC: VPC,
        Comment: js.UndefOr[DisassociateVPCComment] = js.undefined
    ): DisassociateVPCFromHostedZoneRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HostedZoneId" -> HostedZoneId.asInstanceOf[js.Any],
        "VPC"          -> VPC.asInstanceOf[js.Any],
        "Comment" -> Comment.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateVPCFromHostedZoneRequest]
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
    def apply(
        ChangeInfo: ChangeInfo
    ): DisassociateVPCFromHostedZoneResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeInfo" -> ChangeInfo.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateVPCFromHostedZoneResponse]
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
    def apply(
        ContinentCode: js.UndefOr[GeoLocationContinentCode] = js.undefined,
        CountryCode: js.UndefOr[GeoLocationCountryCode] = js.undefined,
        SubdivisionCode: js.UndefOr[GeoLocationSubdivisionCode] = js.undefined
    ): GeoLocation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ContinentCode" -> ContinentCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CountryCode" -> CountryCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SubdivisionCode" -> SubdivisionCode.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GeoLocation]
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
    def apply(
        ContinentCode: js.UndefOr[GeoLocationContinentCode] = js.undefined,
        ContinentName: js.UndefOr[GeoLocationContinentName] = js.undefined,
        CountryCode: js.UndefOr[GeoLocationCountryCode] = js.undefined,
        CountryName: js.UndefOr[GeoLocationCountryName] = js.undefined,
        SubdivisionCode: js.UndefOr[GeoLocationSubdivisionCode] = js.undefined,
        SubdivisionName: js.UndefOr[GeoLocationSubdivisionName] = js.undefined
    ): GeoLocationDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ContinentCode" -> ContinentCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ContinentName" -> ContinentName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CountryCode" -> CountryCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CountryName" -> CountryName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SubdivisionCode" -> SubdivisionCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SubdivisionName" -> SubdivisionName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GeoLocationDetails]
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
    def apply(
        Type: AccountLimitType
    ): GetAccountLimitRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Type" -> Type.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAccountLimitRequest]
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
    def apply(
        Count: UsageCount,
        Limit: AccountLimit
    ): GetAccountLimitResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Count" -> Count.asInstanceOf[js.Any],
        "Limit" -> Limit.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAccountLimitResponse]
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
    def apply(
        Id: ResourceId
    ): GetChangeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetChangeRequest]
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
    def apply(
        ChangeInfo: ChangeInfo
    ): GetChangeResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeInfo" -> ChangeInfo.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetChangeResponse]
    }
  }

  @js.native
  trait GetCheckerIpRangesRequest extends js.Object {}

  object GetCheckerIpRangesRequest {
    def apply(
        ): GetCheckerIpRangesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCheckerIpRangesRequest]
    }
  }

  @js.native
  trait GetCheckerIpRangesResponse extends js.Object {
    var CheckerIpRanges: CheckerIpRanges
  }

  object GetCheckerIpRangesResponse {
    def apply(
        CheckerIpRanges: CheckerIpRanges
    ): GetCheckerIpRangesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CheckerIpRanges" -> CheckerIpRanges.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCheckerIpRangesResponse]
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
    def apply(
        ContinentCode: js.UndefOr[GeoLocationContinentCode] = js.undefined,
        CountryCode: js.UndefOr[GeoLocationCountryCode] = js.undefined,
        SubdivisionCode: js.UndefOr[GeoLocationSubdivisionCode] = js.undefined
    ): GetGeoLocationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ContinentCode" -> ContinentCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CountryCode" -> CountryCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SubdivisionCode" -> SubdivisionCode.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetGeoLocationRequest]
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
    def apply(
        GeoLocationDetails: GeoLocationDetails
    ): GetGeoLocationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GeoLocationDetails" -> GeoLocationDetails.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetGeoLocationResponse]
    }
  }

  /**
    * A request for the number of health checks that are associated with the current AWS account.
    */
  @js.native
  trait GetHealthCheckCountRequest extends js.Object {}

  object GetHealthCheckCountRequest {
    def apply(
        ): GetHealthCheckCountRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetHealthCheckCountRequest]
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
    def apply(
        HealthCheckCount: HealthCheckCount
    ): GetHealthCheckCountResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HealthCheckCount" -> HealthCheckCount.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetHealthCheckCountResponse]
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
    def apply(
        HealthCheckId: HealthCheckId
    ): GetHealthCheckLastFailureReasonRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HealthCheckId" -> HealthCheckId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetHealthCheckLastFailureReasonRequest]
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
    def apply(
        HealthCheckObservations: HealthCheckObservations
    ): GetHealthCheckLastFailureReasonResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HealthCheckObservations" -> HealthCheckObservations.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetHealthCheckLastFailureReasonResponse]
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
    def apply(
        HealthCheckId: HealthCheckId
    ): GetHealthCheckRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HealthCheckId" -> HealthCheckId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetHealthCheckRequest]
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
    def apply(
        HealthCheck: HealthCheck
    ): GetHealthCheckResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HealthCheck" -> HealthCheck.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetHealthCheckResponse]
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
    def apply(
        HealthCheckId: HealthCheckId
    ): GetHealthCheckStatusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HealthCheckId" -> HealthCheckId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetHealthCheckStatusRequest]
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
    def apply(
        HealthCheckObservations: HealthCheckObservations
    ): GetHealthCheckStatusResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HealthCheckObservations" -> HealthCheckObservations.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetHealthCheckStatusResponse]
    }
  }

  /**
    * A request to retrieve a count of all the hosted zones that are associated with the current AWS account.
    */
  @js.native
  trait GetHostedZoneCountRequest extends js.Object {}

  object GetHostedZoneCountRequest {
    def apply(
        ): GetHostedZoneCountRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetHostedZoneCountRequest]
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
    def apply(
        HostedZoneCount: HostedZoneCount
    ): GetHostedZoneCountResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HostedZoneCount" -> HostedZoneCount.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetHostedZoneCountResponse]
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
    def apply(
        HostedZoneId: ResourceId,
        Type: HostedZoneLimitType
    ): GetHostedZoneLimitRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HostedZoneId" -> HostedZoneId.asInstanceOf[js.Any],
        "Type"         -> Type.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetHostedZoneLimitRequest]
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
    def apply(
        Count: UsageCount,
        Limit: HostedZoneLimit
    ): GetHostedZoneLimitResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Count" -> Count.asInstanceOf[js.Any],
        "Limit" -> Limit.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetHostedZoneLimitResponse]
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
    def apply(
        Id: ResourceId
    ): GetHostedZoneRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetHostedZoneRequest]
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
    def apply(
        HostedZone: HostedZone,
        DelegationSet: js.UndefOr[DelegationSet] = js.undefined,
        VPCs: js.UndefOr[VPCs] = js.undefined
    ): GetHostedZoneResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HostedZone" -> HostedZone.asInstanceOf[js.Any],
        "DelegationSet" -> DelegationSet.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VPCs" -> VPCs.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetHostedZoneResponse]
    }
  }

  @js.native
  trait GetQueryLoggingConfigRequest extends js.Object {
    var Id: QueryLoggingConfigId
  }

  object GetQueryLoggingConfigRequest {
    def apply(
        Id: QueryLoggingConfigId
    ): GetQueryLoggingConfigRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetQueryLoggingConfigRequest]
    }
  }

  @js.native
  trait GetQueryLoggingConfigResponse extends js.Object {
    var QueryLoggingConfig: QueryLoggingConfig
  }

  object GetQueryLoggingConfigResponse {
    def apply(
        QueryLoggingConfig: QueryLoggingConfig
    ): GetQueryLoggingConfigResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QueryLoggingConfig" -> QueryLoggingConfig.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetQueryLoggingConfigResponse]
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
    def apply(
        DelegationSetId: ResourceId,
        Type: ReusableDelegationSetLimitType
    ): GetReusableDelegationSetLimitRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DelegationSetId" -> DelegationSetId.asInstanceOf[js.Any],
        "Type"            -> Type.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetReusableDelegationSetLimitRequest]
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
    def apply(
        Count: UsageCount,
        Limit: ReusableDelegationSetLimit
    ): GetReusableDelegationSetLimitResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Count" -> Count.asInstanceOf[js.Any],
        "Limit" -> Limit.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetReusableDelegationSetLimitResponse]
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
    def apply(
        Id: ResourceId
    ): GetReusableDelegationSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetReusableDelegationSetRequest]
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
    def apply(
        DelegationSet: DelegationSet
    ): GetReusableDelegationSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DelegationSet" -> DelegationSet.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetReusableDelegationSetResponse]
    }
  }

  /**
    * Request to get the number of traffic policy instances that are associated with the current AWS account.
    */
  @js.native
  trait GetTrafficPolicyInstanceCountRequest extends js.Object {}

  object GetTrafficPolicyInstanceCountRequest {
    def apply(
        ): GetTrafficPolicyInstanceCountRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTrafficPolicyInstanceCountRequest]
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
    def apply(
        TrafficPolicyInstanceCount: TrafficPolicyInstanceCount
    ): GetTrafficPolicyInstanceCountResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TrafficPolicyInstanceCount" -> TrafficPolicyInstanceCount.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTrafficPolicyInstanceCountResponse]
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
    def apply(
        Id: TrafficPolicyInstanceId
    ): GetTrafficPolicyInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTrafficPolicyInstanceRequest]
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
    def apply(
        TrafficPolicyInstance: TrafficPolicyInstance
    ): GetTrafficPolicyInstanceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TrafficPolicyInstance" -> TrafficPolicyInstance.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTrafficPolicyInstanceResponse]
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
    def apply(
        Id: TrafficPolicyId,
        Version: TrafficPolicyVersion
    ): GetTrafficPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id"      -> Id.asInstanceOf[js.Any],
        "Version" -> Version.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTrafficPolicyRequest]
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
    def apply(
        TrafficPolicy: TrafficPolicy
    ): GetTrafficPolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TrafficPolicy" -> TrafficPolicy.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTrafficPolicyResponse]
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
    def apply(
        CallerReference: HealthCheckNonce,
        HealthCheckConfig: HealthCheckConfig,
        HealthCheckVersion: HealthCheckVersion,
        Id: HealthCheckId,
        CloudWatchAlarmConfiguration: js.UndefOr[CloudWatchAlarmConfiguration] = js.undefined,
        LinkedService: js.UndefOr[LinkedService] = js.undefined
    ): HealthCheck = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CallerReference"    -> CallerReference.asInstanceOf[js.Any],
        "HealthCheckConfig"  -> HealthCheckConfig.asInstanceOf[js.Any],
        "HealthCheckVersion" -> HealthCheckVersion.asInstanceOf[js.Any],
        "Id"                 -> Id.asInstanceOf[js.Any],
        "CloudWatchAlarmConfiguration" -> CloudWatchAlarmConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LinkedService" -> LinkedService.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HealthCheck]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Type" -> Type.asInstanceOf[js.Any],
        "AlarmIdentifier" -> AlarmIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ChildHealthChecks" -> ChildHealthChecks.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Disabled" -> Disabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnableSNI" -> EnableSNI.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FailureThreshold" -> FailureThreshold.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FullyQualifiedDomainName" -> FullyQualifiedDomainName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HealthThreshold" -> HealthThreshold.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IPAddress" -> IPAddress.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InsufficientDataHealthStatus" -> InsufficientDataHealthStatus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Inverted" -> Inverted.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MeasureLatency" -> MeasureLatency.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Port" -> Port.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Regions" -> Regions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RequestInterval" -> RequestInterval.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ResourcePath" -> ResourcePath.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SearchString" -> SearchString.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HealthCheckConfig]
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
    def apply(
        IPAddress: js.UndefOr[IPAddress] = js.undefined,
        Region: js.UndefOr[HealthCheckRegion] = js.undefined,
        StatusReport: js.UndefOr[StatusReport] = js.undefined
    ): HealthCheckObservation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IPAddress" -> IPAddress.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Region" -> Region.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StatusReport" -> StatusReport.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HealthCheckObservation]
    }
  }

  object HealthCheckRegionEnum {
    val `us-east-1`      = "us-east-1"
    val `us-west-1`      = "us-west-1"
    val `us-west-2`      = "us-west-2"
    val `eu-west-1`      = "eu-west-1"
    val `ap-southeast-1` = "ap-southeast-1"
    val `ap-southeast-2` = "ap-southeast-2"
    val `ap-northeast-1` = "ap-northeast-1"
    val `sa-east-1`      = "sa-east-1"

    val values = IndexedSeq(
      `us-east-1`,
      `us-west-1`,
      `us-west-2`,
      `eu-west-1`,
      `ap-southeast-1`,
      `ap-southeast-2`,
      `ap-northeast-1`,
      `sa-east-1`
    )
  }

  object HealthCheckTypeEnum {
    val HTTP              = "HTTP"
    val HTTPS             = "HTTPS"
    val HTTP_STR_MATCH    = "HTTP_STR_MATCH"
    val HTTPS_STR_MATCH   = "HTTPS_STR_MATCH"
    val TCP               = "TCP"
    val CALCULATED        = "CALCULATED"
    val CLOUDWATCH_METRIC = "CLOUDWATCH_METRIC"

    val values = IndexedSeq(HTTP, HTTPS, HTTP_STR_MATCH, HTTPS_STR_MATCH, TCP, CALCULATED, CLOUDWATCH_METRIC)
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
    def apply(
        CallerReference: Nonce,
        Id: ResourceId,
        Name: DNSName,
        Config: js.UndefOr[HostedZoneConfig] = js.undefined,
        LinkedService: js.UndefOr[LinkedService] = js.undefined,
        ResourceRecordSetCount: js.UndefOr[HostedZoneRRSetCount] = js.undefined
    ): HostedZone = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CallerReference" -> CallerReference.asInstanceOf[js.Any],
        "Id"              -> Id.asInstanceOf[js.Any],
        "Name"            -> Name.asInstanceOf[js.Any],
        "Config" -> Config.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LinkedService" -> LinkedService.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ResourceRecordSetCount" -> ResourceRecordSetCount.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HostedZone]
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
    def apply(
        Comment: js.UndefOr[ResourceDescription] = js.undefined,
        PrivateZone: js.UndefOr[IsPrivateZone] = js.undefined
    ): HostedZoneConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Comment" -> Comment.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PrivateZone" -> PrivateZone.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HostedZoneConfig]
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
    def apply(
        Type: HostedZoneLimitType,
        Value: LimitValue
    ): HostedZoneLimit = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Type"  -> Type.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HostedZoneLimit]
    }
  }

  object HostedZoneLimitTypeEnum {
    val MAX_RRSETS_BY_ZONE          = "MAX_RRSETS_BY_ZONE"
    val MAX_VPCS_ASSOCIATED_BY_ZONE = "MAX_VPCS_ASSOCIATED_BY_ZONE"

    val values = IndexedSeq(MAX_RRSETS_BY_ZONE, MAX_VPCS_ASSOCIATED_BY_ZONE)
  }

  object InsufficientDataHealthStatusEnum {
    val Healthy         = "Healthy"
    val Unhealthy       = "Unhealthy"
    val LastKnownStatus = "LastKnownStatus"

    val values = IndexedSeq(Healthy, Unhealthy, LastKnownStatus)
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
    def apply(
        Description: js.UndefOr[ResourceDescription] = js.undefined,
        ServicePrincipal: js.UndefOr[ServicePrincipal] = js.undefined
    ): LinkedService = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ServicePrincipal" -> ServicePrincipal.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LinkedService]
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
    def apply(
        MaxItems: js.UndefOr[PageMaxItems] = js.undefined,
        StartContinentCode: js.UndefOr[GeoLocationContinentCode] = js.undefined,
        StartCountryCode: js.UndefOr[GeoLocationCountryCode] = js.undefined,
        StartSubdivisionCode: js.UndefOr[GeoLocationSubdivisionCode] = js.undefined
    ): ListGeoLocationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxItems" -> MaxItems.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StartContinentCode" -> StartContinentCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StartCountryCode" -> StartCountryCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StartSubdivisionCode" -> StartSubdivisionCode.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListGeoLocationsRequest]
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
    def apply(
        GeoLocationDetailsList: GeoLocationDetailsList,
        IsTruncated: PageTruncated,
        MaxItems: PageMaxItems,
        NextContinentCode: js.UndefOr[GeoLocationContinentCode] = js.undefined,
        NextCountryCode: js.UndefOr[GeoLocationCountryCode] = js.undefined,
        NextSubdivisionCode: js.UndefOr[GeoLocationSubdivisionCode] = js.undefined
    ): ListGeoLocationsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GeoLocationDetailsList" -> GeoLocationDetailsList.asInstanceOf[js.Any],
        "IsTruncated"            -> IsTruncated.asInstanceOf[js.Any],
        "MaxItems"               -> MaxItems.asInstanceOf[js.Any],
        "NextContinentCode" -> NextContinentCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextCountryCode" -> NextCountryCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextSubdivisionCode" -> NextSubdivisionCode.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListGeoLocationsResponse]
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
    def apply(
        Marker: js.UndefOr[PageMarker] = js.undefined,
        MaxItems: js.UndefOr[PageMaxItems] = js.undefined
    ): ListHealthChecksRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxItems" -> MaxItems.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListHealthChecksRequest]
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
    def apply(
        HealthChecks: HealthChecks,
        IsTruncated: PageTruncated,
        Marker: PageMarker,
        MaxItems: PageMaxItems,
        NextMarker: js.UndefOr[PageMarker] = js.undefined
    ): ListHealthChecksResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HealthChecks" -> HealthChecks.asInstanceOf[js.Any],
        "IsTruncated"  -> IsTruncated.asInstanceOf[js.Any],
        "Marker"       -> Marker.asInstanceOf[js.Any],
        "MaxItems"     -> MaxItems.asInstanceOf[js.Any],
        "NextMarker" -> NextMarker.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListHealthChecksResponse]
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
    def apply(
        DNSName: js.UndefOr[DNSName] = js.undefined,
        HostedZoneId: js.UndefOr[ResourceId] = js.undefined,
        MaxItems: js.UndefOr[PageMaxItems] = js.undefined
    ): ListHostedZonesByNameRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DNSName" -> DNSName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HostedZoneId" -> HostedZoneId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxItems" -> MaxItems.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListHostedZonesByNameRequest]
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
    def apply(
        HostedZones: HostedZones,
        IsTruncated: PageTruncated,
        MaxItems: PageMaxItems,
        DNSName: js.UndefOr[DNSName] = js.undefined,
        HostedZoneId: js.UndefOr[ResourceId] = js.undefined,
        NextDNSName: js.UndefOr[DNSName] = js.undefined,
        NextHostedZoneId: js.UndefOr[ResourceId] = js.undefined
    ): ListHostedZonesByNameResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HostedZones" -> HostedZones.asInstanceOf[js.Any],
        "IsTruncated" -> IsTruncated.asInstanceOf[js.Any],
        "MaxItems"    -> MaxItems.asInstanceOf[js.Any],
        "DNSName" -> DNSName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HostedZoneId" -> HostedZoneId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextDNSName" -> NextDNSName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextHostedZoneId" -> NextHostedZoneId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListHostedZonesByNameResponse]
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
    def apply(
        DelegationSetId: js.UndefOr[ResourceId] = js.undefined,
        Marker: js.UndefOr[PageMarker] = js.undefined,
        MaxItems: js.UndefOr[PageMaxItems] = js.undefined
    ): ListHostedZonesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DelegationSetId" -> DelegationSetId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxItems" -> MaxItems.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListHostedZonesRequest]
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
    def apply(
        HostedZones: HostedZones,
        IsTruncated: PageTruncated,
        Marker: PageMarker,
        MaxItems: PageMaxItems,
        NextMarker: js.UndefOr[PageMarker] = js.undefined
    ): ListHostedZonesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HostedZones" -> HostedZones.asInstanceOf[js.Any],
        "IsTruncated" -> IsTruncated.asInstanceOf[js.Any],
        "Marker"      -> Marker.asInstanceOf[js.Any],
        "MaxItems"    -> MaxItems.asInstanceOf[js.Any],
        "NextMarker" -> NextMarker.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListHostedZonesResponse]
    }
  }

  @js.native
  trait ListQueryLoggingConfigsRequest extends js.Object {
    var HostedZoneId: js.UndefOr[ResourceId]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListQueryLoggingConfigsRequest {
    def apply(
        HostedZoneId: js.UndefOr[ResourceId] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListQueryLoggingConfigsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HostedZoneId" -> HostedZoneId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListQueryLoggingConfigsRequest]
    }
  }

  @js.native
  trait ListQueryLoggingConfigsResponse extends js.Object {
    var QueryLoggingConfigs: QueryLoggingConfigs
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListQueryLoggingConfigsResponse {
    def apply(
        QueryLoggingConfigs: QueryLoggingConfigs,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListQueryLoggingConfigsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "QueryLoggingConfigs" -> QueryLoggingConfigs.asInstanceOf[js.Any],
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListQueryLoggingConfigsResponse]
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
    def apply(
        HostedZoneId: ResourceId,
        MaxItems: js.UndefOr[PageMaxItems] = js.undefined,
        StartRecordIdentifier: js.UndefOr[ResourceRecordSetIdentifier] = js.undefined,
        StartRecordName: js.UndefOr[DNSName] = js.undefined,
        StartRecordType: js.UndefOr[RRType] = js.undefined
    ): ListResourceRecordSetsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HostedZoneId" -> HostedZoneId.asInstanceOf[js.Any],
        "MaxItems" -> MaxItems.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StartRecordIdentifier" -> StartRecordIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StartRecordName" -> StartRecordName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StartRecordType" -> StartRecordType.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListResourceRecordSetsRequest]
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
    def apply(
        IsTruncated: PageTruncated,
        MaxItems: PageMaxItems,
        ResourceRecordSets: ResourceRecordSets,
        NextRecordIdentifier: js.UndefOr[ResourceRecordSetIdentifier] = js.undefined,
        NextRecordName: js.UndefOr[DNSName] = js.undefined,
        NextRecordType: js.UndefOr[RRType] = js.undefined
    ): ListResourceRecordSetsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IsTruncated"        -> IsTruncated.asInstanceOf[js.Any],
        "MaxItems"           -> MaxItems.asInstanceOf[js.Any],
        "ResourceRecordSets" -> ResourceRecordSets.asInstanceOf[js.Any],
        "NextRecordIdentifier" -> NextRecordIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextRecordName" -> NextRecordName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextRecordType" -> NextRecordType.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListResourceRecordSetsResponse]
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
    def apply(
        Marker: js.UndefOr[PageMarker] = js.undefined,
        MaxItems: js.UndefOr[PageMaxItems] = js.undefined
    ): ListReusableDelegationSetsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxItems" -> MaxItems.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListReusableDelegationSetsRequest]
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
    def apply(
        DelegationSets: DelegationSets,
        IsTruncated: PageTruncated,
        Marker: PageMarker,
        MaxItems: PageMaxItems,
        NextMarker: js.UndefOr[PageMarker] = js.undefined
    ): ListReusableDelegationSetsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DelegationSets" -> DelegationSets.asInstanceOf[js.Any],
        "IsTruncated"    -> IsTruncated.asInstanceOf[js.Any],
        "Marker"         -> Marker.asInstanceOf[js.Any],
        "MaxItems"       -> MaxItems.asInstanceOf[js.Any],
        "NextMarker" -> NextMarker.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListReusableDelegationSetsResponse]
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
    def apply(
        ResourceId: TagResourceId,
        ResourceType: TagResourceType
    ): ListTagsForResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceId"   -> ResourceId.asInstanceOf[js.Any],
        "ResourceType" -> ResourceType.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceRequest]
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
    def apply(
        ResourceTagSet: ResourceTagSet
    ): ListTagsForResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceTagSet" -> ResourceTagSet.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceResponse]
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
    def apply(
        ResourceIds: TagResourceIdList,
        ResourceType: TagResourceType
    ): ListTagsForResourcesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceIds"  -> ResourceIds.asInstanceOf[js.Any],
        "ResourceType" -> ResourceType.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourcesRequest]
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
    def apply(
        ResourceTagSets: ResourceTagSetList
    ): ListTagsForResourcesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceTagSets" -> ResourceTagSets.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourcesResponse]
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
    def apply(
        MaxItems: js.UndefOr[PageMaxItems] = js.undefined,
        TrafficPolicyIdMarker: js.UndefOr[TrafficPolicyId] = js.undefined
    ): ListTrafficPoliciesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxItems" -> MaxItems.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TrafficPolicyIdMarker" -> TrafficPolicyIdMarker.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTrafficPoliciesRequest]
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
    def apply(
        IsTruncated: PageTruncated,
        MaxItems: PageMaxItems,
        TrafficPolicyIdMarker: TrafficPolicyId,
        TrafficPolicySummaries: TrafficPolicySummaries
    ): ListTrafficPoliciesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IsTruncated"            -> IsTruncated.asInstanceOf[js.Any],
        "MaxItems"               -> MaxItems.asInstanceOf[js.Any],
        "TrafficPolicyIdMarker"  -> TrafficPolicyIdMarker.asInstanceOf[js.Any],
        "TrafficPolicySummaries" -> TrafficPolicySummaries.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTrafficPoliciesResponse]
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
    def apply(
        HostedZoneId: ResourceId,
        MaxItems: js.UndefOr[PageMaxItems] = js.undefined,
        TrafficPolicyInstanceNameMarker: js.UndefOr[DNSName] = js.undefined,
        TrafficPolicyInstanceTypeMarker: js.UndefOr[RRType] = js.undefined
    ): ListTrafficPolicyInstancesByHostedZoneRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HostedZoneId" -> HostedZoneId.asInstanceOf[js.Any],
        "MaxItems" -> MaxItems.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TrafficPolicyInstanceNameMarker" -> TrafficPolicyInstanceNameMarker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TrafficPolicyInstanceTypeMarker" -> TrafficPolicyInstanceTypeMarker.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[ListTrafficPolicyInstancesByHostedZoneRequest]
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
    def apply(
        IsTruncated: PageTruncated,
        MaxItems: PageMaxItems,
        TrafficPolicyInstances: TrafficPolicyInstances,
        TrafficPolicyInstanceNameMarker: js.UndefOr[DNSName] = js.undefined,
        TrafficPolicyInstanceTypeMarker: js.UndefOr[RRType] = js.undefined
    ): ListTrafficPolicyInstancesByHostedZoneResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IsTruncated"            -> IsTruncated.asInstanceOf[js.Any],
        "MaxItems"               -> MaxItems.asInstanceOf[js.Any],
        "TrafficPolicyInstances" -> TrafficPolicyInstances.asInstanceOf[js.Any],
        "TrafficPolicyInstanceNameMarker" -> TrafficPolicyInstanceNameMarker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TrafficPolicyInstanceTypeMarker" -> TrafficPolicyInstanceTypeMarker.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[ListTrafficPolicyInstancesByHostedZoneResponse]
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
    def apply(
        TrafficPolicyId: TrafficPolicyId,
        TrafficPolicyVersion: TrafficPolicyVersion,
        HostedZoneIdMarker: js.UndefOr[ResourceId] = js.undefined,
        MaxItems: js.UndefOr[PageMaxItems] = js.undefined,
        TrafficPolicyInstanceNameMarker: js.UndefOr[DNSName] = js.undefined,
        TrafficPolicyInstanceTypeMarker: js.UndefOr[RRType] = js.undefined
    ): ListTrafficPolicyInstancesByPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TrafficPolicyId"      -> TrafficPolicyId.asInstanceOf[js.Any],
        "TrafficPolicyVersion" -> TrafficPolicyVersion.asInstanceOf[js.Any],
        "HostedZoneIdMarker" -> HostedZoneIdMarker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxItems" -> MaxItems.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TrafficPolicyInstanceNameMarker" -> TrafficPolicyInstanceNameMarker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TrafficPolicyInstanceTypeMarker" -> TrafficPolicyInstanceTypeMarker.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTrafficPolicyInstancesByPolicyRequest]
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
    def apply(
        IsTruncated: PageTruncated,
        MaxItems: PageMaxItems,
        TrafficPolicyInstances: TrafficPolicyInstances,
        HostedZoneIdMarker: js.UndefOr[ResourceId] = js.undefined,
        TrafficPolicyInstanceNameMarker: js.UndefOr[DNSName] = js.undefined,
        TrafficPolicyInstanceTypeMarker: js.UndefOr[RRType] = js.undefined
    ): ListTrafficPolicyInstancesByPolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IsTruncated"            -> IsTruncated.asInstanceOf[js.Any],
        "MaxItems"               -> MaxItems.asInstanceOf[js.Any],
        "TrafficPolicyInstances" -> TrafficPolicyInstances.asInstanceOf[js.Any],
        "HostedZoneIdMarker" -> HostedZoneIdMarker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TrafficPolicyInstanceNameMarker" -> TrafficPolicyInstanceNameMarker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TrafficPolicyInstanceTypeMarker" -> TrafficPolicyInstanceTypeMarker.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[ListTrafficPolicyInstancesByPolicyResponse]
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
    def apply(
        HostedZoneIdMarker: js.UndefOr[ResourceId] = js.undefined,
        MaxItems: js.UndefOr[PageMaxItems] = js.undefined,
        TrafficPolicyInstanceNameMarker: js.UndefOr[DNSName] = js.undefined,
        TrafficPolicyInstanceTypeMarker: js.UndefOr[RRType] = js.undefined
    ): ListTrafficPolicyInstancesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HostedZoneIdMarker" -> HostedZoneIdMarker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxItems" -> MaxItems.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TrafficPolicyInstanceNameMarker" -> TrafficPolicyInstanceNameMarker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TrafficPolicyInstanceTypeMarker" -> TrafficPolicyInstanceTypeMarker.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTrafficPolicyInstancesRequest]
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
    def apply(
        IsTruncated: PageTruncated,
        MaxItems: PageMaxItems,
        TrafficPolicyInstances: TrafficPolicyInstances,
        HostedZoneIdMarker: js.UndefOr[ResourceId] = js.undefined,
        TrafficPolicyInstanceNameMarker: js.UndefOr[DNSName] = js.undefined,
        TrafficPolicyInstanceTypeMarker: js.UndefOr[RRType] = js.undefined
    ): ListTrafficPolicyInstancesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IsTruncated"            -> IsTruncated.asInstanceOf[js.Any],
        "MaxItems"               -> MaxItems.asInstanceOf[js.Any],
        "TrafficPolicyInstances" -> TrafficPolicyInstances.asInstanceOf[js.Any],
        "HostedZoneIdMarker" -> HostedZoneIdMarker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TrafficPolicyInstanceNameMarker" -> TrafficPolicyInstanceNameMarker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TrafficPolicyInstanceTypeMarker" -> TrafficPolicyInstanceTypeMarker.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTrafficPolicyInstancesResponse]
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
    def apply(
        Id: TrafficPolicyId,
        MaxItems: js.UndefOr[PageMaxItems] = js.undefined,
        TrafficPolicyVersionMarker: js.UndefOr[TrafficPolicyVersionMarker] = js.undefined
    ): ListTrafficPolicyVersionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any],
        "MaxItems" -> MaxItems.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TrafficPolicyVersionMarker" -> TrafficPolicyVersionMarker.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTrafficPolicyVersionsRequest]
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
    def apply(
        IsTruncated: PageTruncated,
        MaxItems: PageMaxItems,
        TrafficPolicies: TrafficPolicies,
        TrafficPolicyVersionMarker: TrafficPolicyVersionMarker
    ): ListTrafficPolicyVersionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IsTruncated"                -> IsTruncated.asInstanceOf[js.Any],
        "MaxItems"                   -> MaxItems.asInstanceOf[js.Any],
        "TrafficPolicies"            -> TrafficPolicies.asInstanceOf[js.Any],
        "TrafficPolicyVersionMarker" -> TrafficPolicyVersionMarker.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTrafficPolicyVersionsResponse]
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
    def apply(
        HostedZoneId: ResourceId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListVPCAssociationAuthorizationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HostedZoneId" -> HostedZoneId.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListVPCAssociationAuthorizationsRequest]
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
    def apply(
        HostedZoneId: ResourceId,
        VPCs: VPCs,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListVPCAssociationAuthorizationsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HostedZoneId" -> HostedZoneId.asInstanceOf[js.Any],
        "VPCs"         -> VPCs.asInstanceOf[js.Any],
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListVPCAssociationAuthorizationsResponse]
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
    def apply(
        CloudWatchLogsLogGroupArn: CloudWatchLogsLogGroupArn,
        HostedZoneId: ResourceId,
        Id: QueryLoggingConfigId
    ): QueryLoggingConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CloudWatchLogsLogGroupArn" -> CloudWatchLogsLogGroupArn.asInstanceOf[js.Any],
        "HostedZoneId"              -> HostedZoneId.asInstanceOf[js.Any],
        "Id"                        -> Id.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[QueryLoggingConfig]
    }
  }

  object RRTypeEnum {
    val SOA   = "SOA"
    val A     = "A"
    val TXT   = "TXT"
    val NS    = "NS"
    val CNAME = "CNAME"
    val MX    = "MX"
    val NAPTR = "NAPTR"
    val PTR   = "PTR"
    val SRV   = "SRV"
    val SPF   = "SPF"
    val AAAA  = "AAAA"
    val CAA   = "CAA"

    val values = IndexedSeq(SOA, A, TXT, NS, CNAME, MX, NAPTR, PTR, SRV, SPF, AAAA, CAA)
  }

  object ResettableElementNameEnum {
    val FullyQualifiedDomainName = "FullyQualifiedDomainName"
    val Regions                  = "Regions"
    val ResourcePath             = "ResourcePath"
    val ChildHealthChecks        = "ChildHealthChecks"

    val values = IndexedSeq(FullyQualifiedDomainName, Regions, ResourcePath, ChildHealthChecks)
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
    def apply(
        Value: RData
    ): ResourceRecord = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Value" -> Value.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceRecord]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any],
        "AliasTarget" -> AliasTarget.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Failover" -> Failover.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GeoLocation" -> GeoLocation.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HealthCheckId" -> HealthCheckId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MultiValueAnswer" -> MultiValueAnswer.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Region" -> Region.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ResourceRecords" -> ResourceRecords.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SetIdentifier" -> SetIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TTL" -> TTL.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TrafficPolicyInstanceId" -> TrafficPolicyInstanceId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Weight" -> Weight.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceRecordSet]
    }
  }

  object ResourceRecordSetFailoverEnum {
    val PRIMARY   = "PRIMARY"
    val SECONDARY = "SECONDARY"

    val values = IndexedSeq(PRIMARY, SECONDARY)
  }

  object ResourceRecordSetRegionEnum {
    val `us-east-1`      = "us-east-1"
    val `us-east-2`      = "us-east-2"
    val `us-west-1`      = "us-west-1"
    val `us-west-2`      = "us-west-2"
    val `ca-central-1`   = "ca-central-1"
    val `eu-west-1`      = "eu-west-1"
    val `eu-west-2`      = "eu-west-2"
    val `eu-west-3`      = "eu-west-3"
    val `eu-central-1`   = "eu-central-1"
    val `ap-southeast-1` = "ap-southeast-1"
    val `ap-southeast-2` = "ap-southeast-2"
    val `ap-northeast-1` = "ap-northeast-1"
    val `ap-northeast-2` = "ap-northeast-2"
    val `ap-northeast-3` = "ap-northeast-3"
    val `eu-north-1`     = "eu-north-1"
    val `sa-east-1`      = "sa-east-1"
    val `cn-north-1`     = "cn-north-1"
    val `cn-northwest-1` = "cn-northwest-1"
    val `ap-south-1`     = "ap-south-1"

    val values = IndexedSeq(
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
      `ap-south-1`
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
    def apply(
        ResourceId: js.UndefOr[TagResourceId] = js.undefined,
        ResourceType: js.UndefOr[TagResourceType] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): ResourceTagSet = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceId" -> ResourceId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ResourceType" -> ResourceType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceTagSet]
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
    def apply(
        Type: ReusableDelegationSetLimitType,
        Value: LimitValue
    ): ReusableDelegationSetLimit = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Type"  -> Type.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReusableDelegationSetLimit]
    }
  }

  object ReusableDelegationSetLimitTypeEnum {
    val MAX_ZONES_BY_REUSABLE_DELEGATION_SET = "MAX_ZONES_BY_REUSABLE_DELEGATION_SET"

    val values = IndexedSeq(MAX_ZONES_BY_REUSABLE_DELEGATION_SET)
  }

  object StatisticEnum {
    val Average     = "Average"
    val Sum         = "Sum"
    val SampleCount = "SampleCount"
    val Maximum     = "Maximum"
    val Minimum     = "Minimum"

    val values = IndexedSeq(Average, Sum, SampleCount, Maximum, Minimum)
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
    def apply(
        CheckedTime: js.UndefOr[TimeStamp] = js.undefined,
        Status: js.UndefOr[Status] = js.undefined
    ): StatusReport = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CheckedTime" -> CheckedTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StatusReport]
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
    def apply(
        Key: js.UndefOr[TagKey] = js.undefined,
        Value: js.UndefOr[TagValue] = js.undefined
    ): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Value" -> Value.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  object TagResourceTypeEnum {
    val healthcheck = "healthcheck"
    val hostedzone  = "hostedzone"

    val values = IndexedSeq(healthcheck, hostedzone)
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
    def apply(
        HostedZoneId: ResourceId,
        RecordName: DNSName,
        RecordType: RRType,
        EDNS0ClientSubnetIP: js.UndefOr[IPAddress] = js.undefined,
        EDNS0ClientSubnetMask: js.UndefOr[SubnetMask] = js.undefined,
        ResolverIP: js.UndefOr[IPAddress] = js.undefined
    ): TestDNSAnswerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HostedZoneId" -> HostedZoneId.asInstanceOf[js.Any],
        "RecordName"   -> RecordName.asInstanceOf[js.Any],
        "RecordType"   -> RecordType.asInstanceOf[js.Any],
        "EDNS0ClientSubnetIP" -> EDNS0ClientSubnetIP.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EDNS0ClientSubnetMask" -> EDNS0ClientSubnetMask.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ResolverIP" -> ResolverIP.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TestDNSAnswerRequest]
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
    def apply(
        Nameserver: Nameserver,
        Protocol: TransportProtocol,
        RecordData: RecordData,
        RecordName: DNSName,
        RecordType: RRType,
        ResponseCode: DNSRCode
    ): TestDNSAnswerResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Nameserver"   -> Nameserver.asInstanceOf[js.Any],
        "Protocol"     -> Protocol.asInstanceOf[js.Any],
        "RecordData"   -> RecordData.asInstanceOf[js.Any],
        "RecordName"   -> RecordName.asInstanceOf[js.Any],
        "RecordType"   -> RecordType.asInstanceOf[js.Any],
        "ResponseCode" -> ResponseCode.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TestDNSAnswerResponse]
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
    def apply(
        Document: TrafficPolicyDocument,
        Id: TrafficPolicyId,
        Name: TrafficPolicyName,
        Type: RRType,
        Version: TrafficPolicyVersion,
        Comment: js.UndefOr[TrafficPolicyComment] = js.undefined
    ): TrafficPolicy = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Document" -> Document.asInstanceOf[js.Any],
        "Id"       -> Id.asInstanceOf[js.Any],
        "Name"     -> Name.asInstanceOf[js.Any],
        "Type"     -> Type.asInstanceOf[js.Any],
        "Version"  -> Version.asInstanceOf[js.Any],
        "Comment" -> Comment.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TrafficPolicy]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "HostedZoneId"         -> HostedZoneId.asInstanceOf[js.Any],
        "Id"                   -> Id.asInstanceOf[js.Any],
        "Message"              -> Message.asInstanceOf[js.Any],
        "Name"                 -> Name.asInstanceOf[js.Any],
        "State"                -> State.asInstanceOf[js.Any],
        "TTL"                  -> TTL.asInstanceOf[js.Any],
        "TrafficPolicyId"      -> TrafficPolicyId.asInstanceOf[js.Any],
        "TrafficPolicyType"    -> TrafficPolicyType.asInstanceOf[js.Any],
        "TrafficPolicyVersion" -> TrafficPolicyVersion.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TrafficPolicyInstance]
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
    def apply(
        Id: TrafficPolicyId,
        LatestVersion: TrafficPolicyVersion,
        Name: TrafficPolicyName,
        TrafficPolicyCount: TrafficPolicyVersion,
        Type: RRType
    ): TrafficPolicySummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id"                 -> Id.asInstanceOf[js.Any],
        "LatestVersion"      -> LatestVersion.asInstanceOf[js.Any],
        "Name"               -> Name.asInstanceOf[js.Any],
        "TrafficPolicyCount" -> TrafficPolicyCount.asInstanceOf[js.Any],
        "Type"               -> Type.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TrafficPolicySummary]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "HealthCheckId" -> HealthCheckId.asInstanceOf[js.Any],
        "AlarmIdentifier" -> AlarmIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ChildHealthChecks" -> ChildHealthChecks.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Disabled" -> Disabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnableSNI" -> EnableSNI.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FailureThreshold" -> FailureThreshold.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FullyQualifiedDomainName" -> FullyQualifiedDomainName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HealthCheckVersion" -> HealthCheckVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HealthThreshold" -> HealthThreshold.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IPAddress" -> IPAddress.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InsufficientDataHealthStatus" -> InsufficientDataHealthStatus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Inverted" -> Inverted.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Port" -> Port.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Regions" -> Regions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ResetElements" -> ResetElements.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ResourcePath" -> ResourcePath.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SearchString" -> SearchString.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateHealthCheckRequest]
    }
  }

  @js.native
  trait UpdateHealthCheckResponse extends js.Object {
    var HealthCheck: HealthCheck
  }

  object UpdateHealthCheckResponse {
    def apply(
        HealthCheck: HealthCheck
    ): UpdateHealthCheckResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HealthCheck" -> HealthCheck.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateHealthCheckResponse]
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
    def apply(
        Id: ResourceId,
        Comment: js.UndefOr[ResourceDescription] = js.undefined
    ): UpdateHostedZoneCommentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any],
        "Comment" -> Comment.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateHostedZoneCommentRequest]
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
    def apply(
        HostedZone: HostedZone
    ): UpdateHostedZoneCommentResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HostedZone" -> HostedZone.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateHostedZoneCommentResponse]
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
    def apply(
        Comment: TrafficPolicyComment,
        Id: TrafficPolicyId,
        Version: TrafficPolicyVersion
    ): UpdateTrafficPolicyCommentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Comment" -> Comment.asInstanceOf[js.Any],
        "Id"      -> Id.asInstanceOf[js.Any],
        "Version" -> Version.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateTrafficPolicyCommentRequest]
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
    def apply(
        TrafficPolicy: TrafficPolicy
    ): UpdateTrafficPolicyCommentResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TrafficPolicy" -> TrafficPolicy.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateTrafficPolicyCommentResponse]
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
    def apply(
        Id: TrafficPolicyInstanceId,
        TTL: TTL,
        TrafficPolicyId: TrafficPolicyId,
        TrafficPolicyVersion: TrafficPolicyVersion
    ): UpdateTrafficPolicyInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id"                   -> Id.asInstanceOf[js.Any],
        "TTL"                  -> TTL.asInstanceOf[js.Any],
        "TrafficPolicyId"      -> TrafficPolicyId.asInstanceOf[js.Any],
        "TrafficPolicyVersion" -> TrafficPolicyVersion.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateTrafficPolicyInstanceRequest]
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
    def apply(
        TrafficPolicyInstance: TrafficPolicyInstance
    ): UpdateTrafficPolicyInstanceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TrafficPolicyInstance" -> TrafficPolicyInstance.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateTrafficPolicyInstanceResponse]
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
    def apply(
        VPCId: js.UndefOr[VPCId] = js.undefined,
        VPCRegion: js.UndefOr[VPCRegion] = js.undefined
    ): VPC = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VPCId" -> VPCId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VPCRegion" -> VPCRegion.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VPC]
    }
  }

  object VPCRegionEnum {
    val `us-east-1`      = "us-east-1"
    val `us-east-2`      = "us-east-2"
    val `us-west-1`      = "us-west-1"
    val `us-west-2`      = "us-west-2"
    val `eu-west-1`      = "eu-west-1"
    val `eu-west-2`      = "eu-west-2"
    val `eu-west-3`      = "eu-west-3"
    val `eu-central-1`   = "eu-central-1"
    val `ap-southeast-1` = "ap-southeast-1"
    val `ap-southeast-2` = "ap-southeast-2"
    val `ap-south-1`     = "ap-south-1"
    val `ap-northeast-1` = "ap-northeast-1"
    val `ap-northeast-2` = "ap-northeast-2"
    val `ap-northeast-3` = "ap-northeast-3"
    val `eu-north-1`     = "eu-north-1"
    val `sa-east-1`      = "sa-east-1"
    val `ca-central-1`   = "ca-central-1"
    val `cn-north-1`     = "cn-north-1"

    val values = IndexedSeq(
      `us-east-1`,
      `us-east-2`,
      `us-west-1`,
      `us-west-2`,
      `eu-west-1`,
      `eu-west-2`,
      `eu-west-3`,
      `eu-central-1`,
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
  }
}
