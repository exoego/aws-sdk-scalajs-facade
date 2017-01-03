package facade.amazonaws.services

import scalajs._
import facade.amazonaws._

package object route53 {
  type AlarmName = String
  type AliasHealthEnabled = Boolean
  type AssociateVPCComment = String
  type ChangeAction = String
  type ChangeStatus = String
  type Changes = js.Array[Change]
  type CheckerIpRanges = js.Array[IPAddressCidr]
  type ChildHealthCheckList = js.Array[HealthCheckId]
  type CloudWatchRegion = String
  type ComparisonOperator = String
  type DNSName = String
  type DNSRCode = String
  type DelegationSetNameServers = js.Array[DNSName]
  type DelegationSets = js.Array[DelegationSet]
  type DimensionField = String
  type DimensionList = js.Array[Dimension]
  type DisassociateVPCComment = String
  type EnableSNI = Boolean
  type ErrorMessage = String
  type ErrorMessages = js.Array[ErrorMessage]
  type EvaluationPeriods = Integer
  type FailureThreshold = Integer
  type FullyQualifiedDomainName = String
  type GeoLocationContinentCode = String
  type GeoLocationContinentName = String
  type GeoLocationCountryCode = String
  type GeoLocationCountryName = String
  type GeoLocationDetailsList = js.Array[GeoLocationDetails]
  type GeoLocationSubdivisionCode = String
  type GeoLocationSubdivisionName = String
  type HealthCheckCount = Long
  type HealthCheckId = String
  type HealthCheckNonce = String
  type HealthCheckObservations = js.Array[HealthCheckObservation]
  type HealthCheckRegion = String
  type HealthCheckRegionList = js.Array[HealthCheckRegion]
  type HealthCheckType = String
  type HealthCheckVersion = Long
  type HealthChecks = js.Array[HealthCheck]
  type HealthThreshold = Integer
  type HostedZoneCount = Long
  type HostedZoneRRSetCount = Long
  type HostedZones = js.Array[HostedZone]
  type IPAddress = String
  type IPAddressCidr = String
  type InsufficientDataHealthStatus = String
  type Inverted = Boolean
  type IsPrivateZone = Boolean
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
  type Period = Integer
  type Port = Integer
  type RData = String
  type RRType = String
  type RecordData = js.Array[RecordDataEntry]
  type RecordDataEntry = String
  type RequestInterval = Integer
  type ResourceDescription = String
  type ResourceId = String
  type ResourcePath = String
  type ResourceRecordSetFailover = String
  type ResourceRecordSetIdentifier = String
  type ResourceRecordSetRegion = String
  type ResourceRecordSetWeight = Long
  type ResourceRecordSets = js.Array[ResourceRecordSet]
  type ResourceRecords = js.Array[ResourceRecord]
  type ResourceTagSetList = js.Array[ResourceTagSet]
  type ResourceURI = String
  type SearchString = String
  type Statistic = String
  type Status = String
  type SubnetMask = String
  type TTL = Long
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
  type TrafficPolicyInstanceCount = Integer
  type TrafficPolicyInstanceId = String
  type TrafficPolicyInstanceState = String
  type TrafficPolicyInstances = js.Array[TrafficPolicyInstance]
  type TrafficPolicyName = String
  type TrafficPolicySummaries = js.Array[TrafficPolicySummary]
  type TrafficPolicyVersion = Integer
  type TrafficPolicyVersionMarker = String
  type TransportProtocol = String
  type VPCId = String
  type VPCRegion = String
  type VPCs = js.Array[VPC]
}

package route53 {
  @js.native
  trait Route53 extends js.Object {
    def associateVPCWithHostedZone(params: AssociateVPCWithHostedZoneRequest, callback: Callback[AssociateVPCWithHostedZoneResponse]): Unit = js.native
    def associateVPCWithHostedZone(params: AssociateVPCWithHostedZoneRequest): Request[AssociateVPCWithHostedZoneResponse] = js.native
    def changeResourceRecordSets(params: ChangeResourceRecordSetsRequest, callback: Callback[ChangeResourceRecordSetsResponse]): Unit = js.native
    def changeResourceRecordSets(params: ChangeResourceRecordSetsRequest): Request[ChangeResourceRecordSetsResponse] = js.native
    def changeTagsForResource(params: ChangeTagsForResourceRequest, callback: Callback[ChangeTagsForResourceResponse]): Unit = js.native
    def changeTagsForResource(params: ChangeTagsForResourceRequest): Request[ChangeTagsForResourceResponse] = js.native
    def createHealthCheck(params: CreateHealthCheckRequest, callback: Callback[CreateHealthCheckResponse]): Unit = js.native
    def createHealthCheck(params: CreateHealthCheckRequest): Request[CreateHealthCheckResponse] = js.native
    def createHostedZone(params: CreateHostedZoneRequest, callback: Callback[CreateHostedZoneResponse]): Unit = js.native
    def createHostedZone(params: CreateHostedZoneRequest): Request[CreateHostedZoneResponse] = js.native
    def createReusableDelegationSet(params: CreateReusableDelegationSetRequest, callback: Callback[CreateReusableDelegationSetResponse]): Unit = js.native
    def createReusableDelegationSet(params: CreateReusableDelegationSetRequest): Request[CreateReusableDelegationSetResponse] = js.native
    def createTrafficPolicy(params: CreateTrafficPolicyRequest, callback: Callback[CreateTrafficPolicyResponse]): Unit = js.native
    def createTrafficPolicy(params: CreateTrafficPolicyRequest): Request[CreateTrafficPolicyResponse] = js.native
    def createTrafficPolicyInstance(params: CreateTrafficPolicyInstanceRequest, callback: Callback[CreateTrafficPolicyInstanceResponse]): Unit = js.native
    def createTrafficPolicyInstance(params: CreateTrafficPolicyInstanceRequest): Request[CreateTrafficPolicyInstanceResponse] = js.native
    def createTrafficPolicyVersion(params: CreateTrafficPolicyVersionRequest, callback: Callback[CreateTrafficPolicyVersionResponse]): Unit = js.native
    def createTrafficPolicyVersion(params: CreateTrafficPolicyVersionRequest): Request[CreateTrafficPolicyVersionResponse] = js.native
    def createVPCAssociationAuthorization(params: CreateVPCAssociationAuthorizationRequest, callback: Callback[CreateVPCAssociationAuthorizationResponse]): Unit = js.native
    def createVPCAssociationAuthorization(params: CreateVPCAssociationAuthorizationRequest): Request[CreateVPCAssociationAuthorizationResponse] = js.native
    def deleteHealthCheck(params: DeleteHealthCheckRequest, callback: Callback[DeleteHealthCheckResponse]): Unit = js.native
    def deleteHealthCheck(params: DeleteHealthCheckRequest): Request[DeleteHealthCheckResponse] = js.native
    def deleteHostedZone(params: DeleteHostedZoneRequest, callback: Callback[DeleteHostedZoneResponse]): Unit = js.native
    def deleteHostedZone(params: DeleteHostedZoneRequest): Request[DeleteHostedZoneResponse] = js.native
    def deleteReusableDelegationSet(params: DeleteReusableDelegationSetRequest, callback: Callback[DeleteReusableDelegationSetResponse]): Unit = js.native
    def deleteReusableDelegationSet(params: DeleteReusableDelegationSetRequest): Request[DeleteReusableDelegationSetResponse] = js.native
    def deleteTrafficPolicy(params: DeleteTrafficPolicyRequest, callback: Callback[DeleteTrafficPolicyResponse]): Unit = js.native
    def deleteTrafficPolicy(params: DeleteTrafficPolicyRequest): Request[DeleteTrafficPolicyResponse] = js.native
    def deleteTrafficPolicyInstance(params: DeleteTrafficPolicyInstanceRequest, callback: Callback[DeleteTrafficPolicyInstanceResponse]): Unit = js.native
    def deleteTrafficPolicyInstance(params: DeleteTrafficPolicyInstanceRequest): Request[DeleteTrafficPolicyInstanceResponse] = js.native
    def deleteVPCAssociationAuthorization(params: DeleteVPCAssociationAuthorizationRequest, callback: Callback[DeleteVPCAssociationAuthorizationResponse]): Unit = js.native
    def deleteVPCAssociationAuthorization(params: DeleteVPCAssociationAuthorizationRequest): Request[DeleteVPCAssociationAuthorizationResponse] = js.native
    def disassociateVPCFromHostedZone(params: DisassociateVPCFromHostedZoneRequest, callback: Callback[DisassociateVPCFromHostedZoneResponse]): Unit = js.native
    def disassociateVPCFromHostedZone(params: DisassociateVPCFromHostedZoneRequest): Request[DisassociateVPCFromHostedZoneResponse] = js.native
    def getChange(params: GetChangeRequest, callback: Callback[GetChangeResponse]): Unit = js.native
    def getChange(params: GetChangeRequest): Request[GetChangeResponse] = js.native
    def getCheckerIpRanges(params: GetCheckerIpRangesRequest, callback: Callback[GetCheckerIpRangesResponse]): Unit = js.native
    def getCheckerIpRanges(params: GetCheckerIpRangesRequest): Request[GetCheckerIpRangesResponse] = js.native
    def getGeoLocation(params: GetGeoLocationRequest, callback: Callback[GetGeoLocationResponse]): Unit = js.native
    def getGeoLocation(params: GetGeoLocationRequest): Request[GetGeoLocationResponse] = js.native
    def getHealthCheck(params: GetHealthCheckRequest, callback: Callback[GetHealthCheckResponse]): Unit = js.native
    def getHealthCheck(params: GetHealthCheckRequest): Request[GetHealthCheckResponse] = js.native
    def getHealthCheckCount(params: GetHealthCheckCountRequest, callback: Callback[GetHealthCheckCountResponse]): Unit = js.native
    def getHealthCheckCount(params: GetHealthCheckCountRequest): Request[GetHealthCheckCountResponse] = js.native
    def getHealthCheckLastFailureReason(params: GetHealthCheckLastFailureReasonRequest, callback: Callback[GetHealthCheckLastFailureReasonResponse]): Unit = js.native
    def getHealthCheckLastFailureReason(params: GetHealthCheckLastFailureReasonRequest): Request[GetHealthCheckLastFailureReasonResponse] = js.native
    def getHealthCheckStatus(params: GetHealthCheckStatusRequest, callback: Callback[GetHealthCheckStatusResponse]): Unit = js.native
    def getHealthCheckStatus(params: GetHealthCheckStatusRequest): Request[GetHealthCheckStatusResponse] = js.native
    def getHostedZone(params: GetHostedZoneRequest, callback: Callback[GetHostedZoneResponse]): Unit = js.native
    def getHostedZone(params: GetHostedZoneRequest): Request[GetHostedZoneResponse] = js.native
    def getHostedZoneCount(params: GetHostedZoneCountRequest, callback: Callback[GetHostedZoneCountResponse]): Unit = js.native
    def getHostedZoneCount(params: GetHostedZoneCountRequest): Request[GetHostedZoneCountResponse] = js.native
    def getReusableDelegationSet(params: GetReusableDelegationSetRequest, callback: Callback[GetReusableDelegationSetResponse]): Unit = js.native
    def getReusableDelegationSet(params: GetReusableDelegationSetRequest): Request[GetReusableDelegationSetResponse] = js.native
    def getTrafficPolicy(params: GetTrafficPolicyRequest, callback: Callback[GetTrafficPolicyResponse]): Unit = js.native
    def getTrafficPolicy(params: GetTrafficPolicyRequest): Request[GetTrafficPolicyResponse] = js.native
    def getTrafficPolicyInstance(params: GetTrafficPolicyInstanceRequest, callback: Callback[GetTrafficPolicyInstanceResponse]): Unit = js.native
    def getTrafficPolicyInstance(params: GetTrafficPolicyInstanceRequest): Request[GetTrafficPolicyInstanceResponse] = js.native
    def getTrafficPolicyInstanceCount(params: GetTrafficPolicyInstanceCountRequest, callback: Callback[GetTrafficPolicyInstanceCountResponse]): Unit = js.native
    def getTrafficPolicyInstanceCount(params: GetTrafficPolicyInstanceCountRequest): Request[GetTrafficPolicyInstanceCountResponse] = js.native
    def listGeoLocations(params: ListGeoLocationsRequest, callback: Callback[ListGeoLocationsResponse]): Unit = js.native
    def listGeoLocations(params: ListGeoLocationsRequest): Request[ListGeoLocationsResponse] = js.native
    def listHealthChecks(params: ListHealthChecksRequest, callback: Callback[ListHealthChecksResponse]): Unit = js.native
    def listHealthChecks(params: ListHealthChecksRequest): Request[ListHealthChecksResponse] = js.native
    def listHostedZones(params: ListHostedZonesRequest, callback: Callback[ListHostedZonesResponse]): Unit = js.native
    def listHostedZones(params: ListHostedZonesRequest): Request[ListHostedZonesResponse] = js.native
    def listHostedZonesByName(params: ListHostedZonesByNameRequest, callback: Callback[ListHostedZonesByNameResponse]): Unit = js.native
    def listHostedZonesByName(params: ListHostedZonesByNameRequest): Request[ListHostedZonesByNameResponse] = js.native
    def listResourceRecordSets(params: ListResourceRecordSetsRequest, callback: Callback[ListResourceRecordSetsResponse]): Unit = js.native
    def listResourceRecordSets(params: ListResourceRecordSetsRequest): Request[ListResourceRecordSetsResponse] = js.native
    def listReusableDelegationSets(params: ListReusableDelegationSetsRequest, callback: Callback[ListReusableDelegationSetsResponse]): Unit = js.native
    def listReusableDelegationSets(params: ListReusableDelegationSetsRequest): Request[ListReusableDelegationSetsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest, callback: Callback[ListTagsForResourceResponse]): Unit = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def listTagsForResources(params: ListTagsForResourcesRequest, callback: Callback[ListTagsForResourcesResponse]): Unit = js.native
    def listTagsForResources(params: ListTagsForResourcesRequest): Request[ListTagsForResourcesResponse] = js.native
    def listTrafficPolicies(params: ListTrafficPoliciesRequest, callback: Callback[ListTrafficPoliciesResponse]): Unit = js.native
    def listTrafficPolicies(params: ListTrafficPoliciesRequest): Request[ListTrafficPoliciesResponse] = js.native
    def listTrafficPolicyInstances(params: ListTrafficPolicyInstancesRequest, callback: Callback[ListTrafficPolicyInstancesResponse]): Unit = js.native
    def listTrafficPolicyInstances(params: ListTrafficPolicyInstancesRequest): Request[ListTrafficPolicyInstancesResponse] = js.native
    def listTrafficPolicyInstancesByHostedZone(params: ListTrafficPolicyInstancesByHostedZoneRequest, callback: Callback[ListTrafficPolicyInstancesByHostedZoneResponse]): Unit = js.native
    def listTrafficPolicyInstancesByHostedZone(params: ListTrafficPolicyInstancesByHostedZoneRequest): Request[ListTrafficPolicyInstancesByHostedZoneResponse] = js.native
    def listTrafficPolicyInstancesByPolicy(params: ListTrafficPolicyInstancesByPolicyRequest, callback: Callback[ListTrafficPolicyInstancesByPolicyResponse]): Unit = js.native
    def listTrafficPolicyInstancesByPolicy(params: ListTrafficPolicyInstancesByPolicyRequest): Request[ListTrafficPolicyInstancesByPolicyResponse] = js.native
    def listTrafficPolicyVersions(params: ListTrafficPolicyVersionsRequest, callback: Callback[ListTrafficPolicyVersionsResponse]): Unit = js.native
    def listTrafficPolicyVersions(params: ListTrafficPolicyVersionsRequest): Request[ListTrafficPolicyVersionsResponse] = js.native
    def listVPCAssociationAuthorizations(params: ListVPCAssociationAuthorizationsRequest, callback: Callback[ListVPCAssociationAuthorizationsResponse]): Unit = js.native
    def listVPCAssociationAuthorizations(params: ListVPCAssociationAuthorizationsRequest): Request[ListVPCAssociationAuthorizationsResponse] = js.native
    def testDNSAnswer(params: TestDNSAnswerRequest, callback: Callback[TestDNSAnswerResponse]): Unit = js.native
    def testDNSAnswer(params: TestDNSAnswerRequest): Request[TestDNSAnswerResponse] = js.native
    def updateHealthCheck(params: UpdateHealthCheckRequest, callback: Callback[UpdateHealthCheckResponse]): Unit = js.native
    def updateHealthCheck(params: UpdateHealthCheckRequest): Request[UpdateHealthCheckResponse] = js.native
    def updateHostedZoneComment(params: UpdateHostedZoneCommentRequest, callback: Callback[UpdateHostedZoneCommentResponse]): Unit = js.native
    def updateHostedZoneComment(params: UpdateHostedZoneCommentRequest): Request[UpdateHostedZoneCommentResponse] = js.native
    def updateTrafficPolicyComment(params: UpdateTrafficPolicyCommentRequest, callback: Callback[UpdateTrafficPolicyCommentResponse]): Unit = js.native
    def updateTrafficPolicyComment(params: UpdateTrafficPolicyCommentRequest): Request[UpdateTrafficPolicyCommentResponse] = js.native
    def updateTrafficPolicyInstance(params: UpdateTrafficPolicyInstanceRequest, callback: Callback[UpdateTrafficPolicyInstanceResponse]): Unit = js.native
    def updateTrafficPolicyInstance(params: UpdateTrafficPolicyInstanceRequest): Request[UpdateTrafficPolicyInstanceResponse] = js.native
  }

  /**
   * <p>A complex type that identifies the CloudWatch alarm that you want Amazon Route 53 health checkers to use to determine whether this health check is healthy.</p>
   */
  @js.native
  trait AlarmIdentifier extends js.Object {
    var Region: CloudWatchRegion
    var Name: AlarmName
  }

  object AlarmIdentifier {
    def apply(
      Region: js.UndefOr[CloudWatchRegion] = js.undefined,
      Name: js.UndefOr[AlarmName] = js.undefined
    ): AlarmIdentifier = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Region" -> Region.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AlarmIdentifier]
    }
  }

  /**
   * <p> <i>Alias resource record sets only:</i> Information about the CloudFront distribution, Elastic Beanstalk environment, ELB load balancer, Amazon S3 bucket, or Amazon Route 53 resource record set that you're redirecting queries to. The Elastic Beanstalk environment must have a regionalized subdomain.</p> <p>When creating resource record sets for a private hosted zone, note the following:</p> <ul> <li> <p>Resource record sets can't be created for CloudFront distributions in a private hosted zone.</p> </li> <li> <p>Creating geolocation alias resource record sets or latency alias resource record sets in a private hosted zone is unsupported.</p> </li> <li> <p>For information about creating failover resource record sets in a private hosted zone, see <a href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-private-hosted-zones.html">Configuring Failover in a Private Hosted Zone</a>.</p> </li> </ul>
   */
  @js.native
  trait AliasTarget extends js.Object {
    var HostedZoneId: ResourceId
    var DNSName: DNSName
    var EvaluateTargetHealth: AliasHealthEnabled
  }

  object AliasTarget {
    def apply(
      HostedZoneId: js.UndefOr[ResourceId] = js.undefined,
      DNSName: js.UndefOr[DNSName] = js.undefined,
      EvaluateTargetHealth: js.UndefOr[AliasHealthEnabled] = js.undefined
    ): AliasTarget = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("HostedZoneId" -> HostedZoneId.map { x => x: js.Any }),
        ("DNSName" -> DNSName.map { x => x: js.Any }),
        ("EvaluateTargetHealth" -> EvaluateTargetHealth.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AliasTarget]
    }
  }

  /**
   * <p>A complex type that contains information about the request to associate a VPC with a private hosted zone.</p>
   */
  @js.native
  trait AssociateVPCWithHostedZoneRequest extends js.Object {
    var HostedZoneId: ResourceId
    var VPC: VPC
    var Comment: AssociateVPCComment
  }

  object AssociateVPCWithHostedZoneRequest {
    def apply(
      HostedZoneId: js.UndefOr[ResourceId] = js.undefined,
      VPC: js.UndefOr[VPC] = js.undefined,
      Comment: js.UndefOr[AssociateVPCComment] = js.undefined
    ): AssociateVPCWithHostedZoneRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("HostedZoneId" -> HostedZoneId.map { x => x: js.Any }),
        ("VPC" -> VPC.map { x => x: js.Any }),
        ("Comment" -> Comment.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateVPCWithHostedZoneRequest]
    }
  }

  /**
   * <p>A complex type that contains the response information for the <code>AssociateVPCWithHostedZone</code> request.</p>
   */
  @js.native
  trait AssociateVPCWithHostedZoneResponse extends js.Object {
    var ChangeInfo: ChangeInfo
  }

  object AssociateVPCWithHostedZoneResponse {
    def apply(
      ChangeInfo: js.UndefOr[ChangeInfo] = js.undefined
    ): AssociateVPCWithHostedZoneResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ChangeInfo" -> ChangeInfo.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateVPCWithHostedZoneResponse]
    }
  }

  /**
   * <p>The information for each resource record set that you want to change.</p>
   */
  @js.native
  trait Change extends js.Object {
    var Action: ChangeAction
    var ResourceRecordSet: ResourceRecordSet
  }

  object Change {
    def apply(
      Action: js.UndefOr[ChangeAction] = js.undefined,
      ResourceRecordSet: js.UndefOr[ResourceRecordSet] = js.undefined
    ): Change = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Action" -> Action.map { x => x: js.Any }),
        ("ResourceRecordSet" -> ResourceRecordSet.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    var Comment: ResourceDescription
    var Changes: Changes
  }

  object ChangeBatch {
    def apply(
      Comment: js.UndefOr[ResourceDescription] = js.undefined,
      Changes: js.UndefOr[Changes] = js.undefined
    ): ChangeBatch = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Comment" -> Comment.map { x => x: js.Any }),
        ("Changes" -> Changes.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ChangeBatch]
    }
  }

  /**
   * <p>A complex type that describes change information about changes made to your hosted zone.</p>
   */
  @js.native
  trait ChangeInfo extends js.Object {
    var Id: ResourceId
    var Status: ChangeStatus
    var SubmittedAt: TimeStamp
    var Comment: ResourceDescription
  }

  object ChangeInfo {
    def apply(
      Id: js.UndefOr[ResourceId] = js.undefined,
      Status: js.UndefOr[ChangeStatus] = js.undefined,
      SubmittedAt: js.UndefOr[TimeStamp] = js.undefined,
      Comment: js.UndefOr[ResourceDescription] = js.undefined
    ): ChangeInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Id" -> Id.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any }),
        ("SubmittedAt" -> SubmittedAt.map { x => x: js.Any }),
        ("Comment" -> Comment.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ChangeInfo]
    }
  }

  /**
   * <p>A complex type that contains change information for the resource record set.</p>
   */
  @js.native
  trait ChangeResourceRecordSetsRequest extends js.Object {
    var HostedZoneId: ResourceId
    var ChangeBatch: ChangeBatch
  }

  object ChangeResourceRecordSetsRequest {
    def apply(
      HostedZoneId: js.UndefOr[ResourceId] = js.undefined,
      ChangeBatch: js.UndefOr[ChangeBatch] = js.undefined
    ): ChangeResourceRecordSetsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("HostedZoneId" -> HostedZoneId.map { x => x: js.Any }),
        ("ChangeBatch" -> ChangeBatch.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ChangeResourceRecordSetsRequest]
    }
  }

  /**
   * <p>A complex type containing the response for the request.</p>
   */
  @js.native
  trait ChangeResourceRecordSetsResponse extends js.Object {
    var ChangeInfo: ChangeInfo
  }

  object ChangeResourceRecordSetsResponse {
    def apply(
      ChangeInfo: js.UndefOr[ChangeInfo] = js.undefined
    ): ChangeResourceRecordSetsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ChangeInfo" -> ChangeInfo.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    var ResourceType: TagResourceType
    var ResourceId: TagResourceId
    var AddTags: TagList
    var RemoveTagKeys: TagKeyList
  }

  object ChangeTagsForResourceRequest {
    def apply(
      ResourceType: js.UndefOr[TagResourceType] = js.undefined,
      ResourceId: js.UndefOr[TagResourceId] = js.undefined,
      AddTags: js.UndefOr[TagList] = js.undefined,
      RemoveTagKeys: js.UndefOr[TagKeyList] = js.undefined
    ): ChangeTagsForResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ResourceType" -> ResourceType.map { x => x: js.Any }),
        ("ResourceId" -> ResourceId.map { x => x: js.Any }),
        ("AddTags" -> AddTags.map { x => x: js.Any }),
        ("RemoveTagKeys" -> RemoveTagKeys.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    def apply(

    ): ChangeTagsForResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ChangeTagsForResourceResponse]
    }
  }

  /**
   * <p>A complex type that contains information about the CloudWatch alarm that Amazon Route 53 is monitoring for this health check.</p>
   */
  @js.native
  trait CloudWatchAlarmConfiguration extends js.Object {
    var Threshold: Threshold
    var Dimensions: DimensionList
    var EvaluationPeriods: EvaluationPeriods
    var ComparisonOperator: ComparisonOperator
    var Period: Period
    var Statistic: Statistic
    var Namespace: Namespace
    var MetricName: MetricName
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
      MetricName: js.UndefOr[MetricName] = js.undefined
    ): CloudWatchAlarmConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Threshold" -> Threshold.map { x => x: js.Any }),
        ("Dimensions" -> Dimensions.map { x => x: js.Any }),
        ("EvaluationPeriods" -> EvaluationPeriods.map { x => x: js.Any }),
        ("ComparisonOperator" -> ComparisonOperator.map { x => x: js.Any }),
        ("Period" -> Period.map { x => x: js.Any }),
        ("Statistic" -> Statistic.map { x => x: js.Any }),
        ("Namespace" -> Namespace.map { x => x: js.Any }),
        ("MetricName" -> MetricName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CloudWatchAlarmConfiguration]
    }
  }


  object CloudWatchRegionEnum {
    val `us-east-1` = "us-east-1"
    val `us-east-2` = "us-east-2"
    val `us-west-1` = "us-west-1"
    val `us-west-2` = "us-west-2"
    val `eu-central-1` = "eu-central-1"
    val `eu-west-1` = "eu-west-1"
    val `ap-south-1` = "ap-south-1"
    val `ap-southeast-1` = "ap-southeast-1"
    val `ap-southeast-2` = "ap-southeast-2"
    val `ap-northeast-1` = "ap-northeast-1"
    val `ap-northeast-2` = "ap-northeast-2"
    val `sa-east-1` = "sa-east-1"

    val values = IndexedSeq(`us-east-1`, `us-east-2`, `us-west-1`, `us-west-2`, `eu-central-1`, `eu-west-1`, `ap-south-1`, `ap-southeast-1`, `ap-southeast-2`, `ap-northeast-1`, `ap-northeast-2`, `sa-east-1`)
  }


  object ComparisonOperatorEnum {
    val GreaterThanOrEqualToThreshold = "GreaterThanOrEqualToThreshold"
    val GreaterThanThreshold = "GreaterThanThreshold"
    val LessThanThreshold = "LessThanThreshold"
    val LessThanOrEqualToThreshold = "LessThanOrEqualToThreshold"

    val values = IndexedSeq(GreaterThanOrEqualToThreshold, GreaterThanThreshold, LessThanThreshold, LessThanOrEqualToThreshold)
  }

  /**
   * <p>Another user submitted a request to update the object at the same time that you did. Retry the request. </p>
   */
  @js.native
  trait ConcurrentModificationException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>You specified an Amazon VPC that you're already using for another hosted zone, and the domain that you specified for one of the hosted zones is a subdomain of the domain that you specified for the other hosted zone. For example, you can't use the same Amazon VPC for the hosted zones for example.com and test.example.com.</p>
   */
  @js.native
  trait ConflictingDomainExistsException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>You tried to update a traffic policy instance by using a traffic policy version that has a different DNS type than the current type for the instance. You specified the type in the JSON document in the <code>CreateTrafficPolicy</code> or <code>CreateTrafficPolicyVersion</code>request. </p>
   */
  @js.native
  trait ConflictingTypesException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>A complex type that contains the health check request information.</p>
   */
  @js.native
  trait CreateHealthCheckRequest extends js.Object {
    var CallerReference: HealthCheckNonce
    var HealthCheckConfig: HealthCheckConfig
  }

  object CreateHealthCheckRequest {
    def apply(
      CallerReference: js.UndefOr[HealthCheckNonce] = js.undefined,
      HealthCheckConfig: js.UndefOr[HealthCheckConfig] = js.undefined
    ): CreateHealthCheckRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CallerReference" -> CallerReference.map { x => x: js.Any }),
        ("HealthCheckConfig" -> HealthCheckConfig.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateHealthCheckRequest]
    }
  }

  /**
   * <p>A complex type containing the response information for the new health check.</p>
   */
  @js.native
  trait CreateHealthCheckResponse extends js.Object {
    var HealthCheck: HealthCheck
    var Location: ResourceURI
  }

  object CreateHealthCheckResponse {
    def apply(
      HealthCheck: js.UndefOr[HealthCheck] = js.undefined,
      Location: js.UndefOr[ResourceURI] = js.undefined
    ): CreateHealthCheckResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("HealthCheck" -> HealthCheck.map { x => x: js.Any }),
        ("Location" -> Location.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateHealthCheckResponse]
    }
  }

  /**
   * <p>A complex type containing the hosted zone request information.</p>
   */
  @js.native
  trait CreateHostedZoneRequest extends js.Object {
    var DelegationSetId: ResourceId
    var Name: DNSName
    var CallerReference: Nonce
    var VPC: VPC
    var HostedZoneConfig: HostedZoneConfig
  }

  object CreateHostedZoneRequest {
    def apply(
      DelegationSetId: js.UndefOr[ResourceId] = js.undefined,
      Name: js.UndefOr[DNSName] = js.undefined,
      CallerReference: js.UndefOr[Nonce] = js.undefined,
      VPC: js.UndefOr[VPC] = js.undefined,
      HostedZoneConfig: js.UndefOr[HostedZoneConfig] = js.undefined
    ): CreateHostedZoneRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DelegationSetId" -> DelegationSetId.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("CallerReference" -> CallerReference.map { x => x: js.Any }),
        ("VPC" -> VPC.map { x => x: js.Any }),
        ("HostedZoneConfig" -> HostedZoneConfig.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateHostedZoneRequest]
    }
  }

  /**
   * <p>A complex type containing the response information for the hosted zone.</p>
   */
  @js.native
  trait CreateHostedZoneResponse extends js.Object {
    var Location: ResourceURI
    var ChangeInfo: ChangeInfo
    var VPC: VPC
    var HostedZone: HostedZone
    var DelegationSet: DelegationSet
  }

  object CreateHostedZoneResponse {
    def apply(
      Location: js.UndefOr[ResourceURI] = js.undefined,
      ChangeInfo: js.UndefOr[ChangeInfo] = js.undefined,
      VPC: js.UndefOr[VPC] = js.undefined,
      HostedZone: js.UndefOr[HostedZone] = js.undefined,
      DelegationSet: js.UndefOr[DelegationSet] = js.undefined
    ): CreateHostedZoneResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Location" -> Location.map { x => x: js.Any }),
        ("ChangeInfo" -> ChangeInfo.map { x => x: js.Any }),
        ("VPC" -> VPC.map { x => x: js.Any }),
        ("HostedZone" -> HostedZone.map { x => x: js.Any }),
        ("DelegationSet" -> DelegationSet.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateHostedZoneResponse]
    }
  }

  @js.native
  trait CreateReusableDelegationSetRequest extends js.Object {
    var CallerReference: Nonce
    var HostedZoneId: ResourceId
  }

  object CreateReusableDelegationSetRequest {
    def apply(
      CallerReference: js.UndefOr[Nonce] = js.undefined,
      HostedZoneId: js.UndefOr[ResourceId] = js.undefined
    ): CreateReusableDelegationSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CallerReference" -> CallerReference.map { x => x: js.Any }),
        ("HostedZoneId" -> HostedZoneId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
      DelegationSet: js.UndefOr[DelegationSet] = js.undefined,
      Location: js.UndefOr[ResourceURI] = js.undefined
    ): CreateReusableDelegationSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DelegationSet" -> DelegationSet.map { x => x: js.Any }),
        ("Location" -> Location.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateReusableDelegationSetResponse]
    }
  }

  /**
   * <p>A complex type that contains information about the resource record sets that you want to create based on a specified traffic policy.</p>
   */
  @js.native
  trait CreateTrafficPolicyInstanceRequest extends js.Object {
    var Name: DNSName
    var TrafficPolicyVersion: TrafficPolicyVersion
    var TrafficPolicyId: TrafficPolicyId
    var TTL: TTL
    var HostedZoneId: ResourceId
  }

  object CreateTrafficPolicyInstanceRequest {
    def apply(
      Name: js.UndefOr[DNSName] = js.undefined,
      TrafficPolicyVersion: js.UndefOr[TrafficPolicyVersion] = js.undefined,
      TrafficPolicyId: js.UndefOr[TrafficPolicyId] = js.undefined,
      TTL: js.UndefOr[TTL] = js.undefined,
      HostedZoneId: js.UndefOr[ResourceId] = js.undefined
    ): CreateTrafficPolicyInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("TrafficPolicyVersion" -> TrafficPolicyVersion.map { x => x: js.Any }),
        ("TrafficPolicyId" -> TrafficPolicyId.map { x => x: js.Any }),
        ("TTL" -> TTL.map { x => x: js.Any }),
        ("HostedZoneId" -> HostedZoneId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTrafficPolicyInstanceRequest]
    }
  }

  /**
   * <p>A complex type that contains the response information for the <code>CreateTrafficPolicyInstance</code> request.</p>
   */
  @js.native
  trait CreateTrafficPolicyInstanceResponse extends js.Object {
    var TrafficPolicyInstance: TrafficPolicyInstance
    var Location: ResourceURI
  }

  object CreateTrafficPolicyInstanceResponse {
    def apply(
      TrafficPolicyInstance: js.UndefOr[TrafficPolicyInstance] = js.undefined,
      Location: js.UndefOr[ResourceURI] = js.undefined
    ): CreateTrafficPolicyInstanceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TrafficPolicyInstance" -> TrafficPolicyInstance.map { x => x: js.Any }),
        ("Location" -> Location.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTrafficPolicyInstanceResponse]
    }
  }

  /**
   * <p>A complex type that contains information about the traffic policy that you want to create.</p>
   */
  @js.native
  trait CreateTrafficPolicyRequest extends js.Object {
    var Name: TrafficPolicyName
    var Document: TrafficPolicyDocument
    var Comment: TrafficPolicyComment
  }

  object CreateTrafficPolicyRequest {
    def apply(
      Name: js.UndefOr[TrafficPolicyName] = js.undefined,
      Document: js.UndefOr[TrafficPolicyDocument] = js.undefined,
      Comment: js.UndefOr[TrafficPolicyComment] = js.undefined
    ): CreateTrafficPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("Document" -> Document.map { x => x: js.Any }),
        ("Comment" -> Comment.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTrafficPolicyRequest]
    }
  }

  /**
   * <p>A complex type that contains the response information for the <code>CreateTrafficPolicy</code> request.</p>
   */
  @js.native
  trait CreateTrafficPolicyResponse extends js.Object {
    var TrafficPolicy: TrafficPolicy
    var Location: ResourceURI
  }

  object CreateTrafficPolicyResponse {
    def apply(
      TrafficPolicy: js.UndefOr[TrafficPolicy] = js.undefined,
      Location: js.UndefOr[ResourceURI] = js.undefined
    ): CreateTrafficPolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TrafficPolicy" -> TrafficPolicy.map { x => x: js.Any }),
        ("Location" -> Location.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTrafficPolicyResponse]
    }
  }

  /**
   * <p>A complex type that contains information about the traffic policy for which you want to create a new version.</p>
   */
  @js.native
  trait CreateTrafficPolicyVersionRequest extends js.Object {
    var Id: TrafficPolicyId
    var Document: TrafficPolicyDocument
    var Comment: TrafficPolicyComment
  }

  object CreateTrafficPolicyVersionRequest {
    def apply(
      Id: js.UndefOr[TrafficPolicyId] = js.undefined,
      Document: js.UndefOr[TrafficPolicyDocument] = js.undefined,
      Comment: js.UndefOr[TrafficPolicyComment] = js.undefined
    ): CreateTrafficPolicyVersionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Id" -> Id.map { x => x: js.Any }),
        ("Document" -> Document.map { x => x: js.Any }),
        ("Comment" -> Comment.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTrafficPolicyVersionRequest]
    }
  }

  /**
   * <p>A complex type that contains the response information for the <code>CreateTrafficPolicyVersion</code> request.</p>
   */
  @js.native
  trait CreateTrafficPolicyVersionResponse extends js.Object {
    var TrafficPolicy: TrafficPolicy
    var Location: ResourceURI
  }

  object CreateTrafficPolicyVersionResponse {
    def apply(
      TrafficPolicy: js.UndefOr[TrafficPolicy] = js.undefined,
      Location: js.UndefOr[ResourceURI] = js.undefined
    ): CreateTrafficPolicyVersionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TrafficPolicy" -> TrafficPolicy.map { x => x: js.Any }),
        ("Location" -> Location.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTrafficPolicyVersionResponse]
    }
  }

  /**
   * <p>A complex type that contains information about the request to authorize associating a VPC with your private hosted zone. Authorization is only required when a private hosted zone and a VPC were created by using different accounts.</p>
   */
  @js.native
  trait CreateVPCAssociationAuthorizationRequest extends js.Object {
    var HostedZoneId: ResourceId
    var VPC: VPC
  }

  object CreateVPCAssociationAuthorizationRequest {
    def apply(
      HostedZoneId: js.UndefOr[ResourceId] = js.undefined,
      VPC: js.UndefOr[VPC] = js.undefined
    ): CreateVPCAssociationAuthorizationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("HostedZoneId" -> HostedZoneId.map { x => x: js.Any }),
        ("VPC" -> VPC.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateVPCAssociationAuthorizationRequest]
    }
  }

  /**
   * <p>A complex type that contains the response information from a CreateVPCAssociationAuthorization request.</p>
   */
  @js.native
  trait CreateVPCAssociationAuthorizationResponse extends js.Object {
    var HostedZoneId: ResourceId
    var VPC: VPC
  }

  object CreateVPCAssociationAuthorizationResponse {
    def apply(
      HostedZoneId: js.UndefOr[ResourceId] = js.undefined,
      VPC: js.UndefOr[VPC] = js.undefined
    ): CreateVPCAssociationAuthorizationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("HostedZoneId" -> HostedZoneId.map { x => x: js.Any }),
        ("VPC" -> VPC.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateVPCAssociationAuthorizationResponse]
    }
  }

  /**
   * <p>A complex type that describes the name servers for this hosted zone.</p>
   */
  @js.native
  trait DelegationSet extends js.Object {
    var Id: ResourceId
    var CallerReference: Nonce
    var NameServers: DelegationSetNameServers
  }

  object DelegationSet {
    def apply(
      Id: js.UndefOr[ResourceId] = js.undefined,
      CallerReference: js.UndefOr[Nonce] = js.undefined,
      NameServers: js.UndefOr[DelegationSetNameServers] = js.undefined
    ): DelegationSet = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Id" -> Id.map { x => x: js.Any }),
        ("CallerReference" -> CallerReference.map { x => x: js.Any }),
        ("NameServers" -> NameServers.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DelegationSet]
    }
  }

  /**
   * <p>A delegation set with the same owner and caller reference combination has already been created.</p>
   */
  @js.native
  trait DelegationSetAlreadyCreatedException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>The specified delegation set has already been marked as reusable.</p>
   */
  @js.native
  trait DelegationSetAlreadyReusableException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>The specified delegation contains associated hosted zones which must be deleted before the reusable delegation set can be deleted.</p>
   */
  @js.native
  trait DelegationSetInUseException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>You can create a hosted zone that has the same name as an existing hosted zone (example.com is common), but there is a limit to the number of hosted zones that have the same name. If you get this error, Amazon Route 53 has reached that limit. If you own the domain name and Amazon Route 53 generates this error, contact Customer Support.</p>
   */
  @js.native
  trait DelegationSetNotAvailableException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>A reusable delegation set with the specified ID does not exist.</p>
   */
  @js.native
  trait DelegationSetNotReusableException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>This action deletes a health check. Send a <code>DELETE</code> request to the <code>/2013-04-01/DeleteHealthCheckRequest</code> resource.</p>
   */
  @js.native
  trait DeleteHealthCheckRequest extends js.Object {
    var HealthCheckId: HealthCheckId
  }

  object DeleteHealthCheckRequest {
    def apply(
      HealthCheckId: js.UndefOr[HealthCheckId] = js.undefined
    ): DeleteHealthCheckRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("HealthCheckId" -> HealthCheckId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    def apply(

    ): DeleteHealthCheckResponse = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteHealthCheckResponse]
    }
  }

  /**
   * <p>A complex type that contains information about the hosted zone that you want to delete.</p>
   */
  @js.native
  trait DeleteHostedZoneRequest extends js.Object {
    var Id: ResourceId
  }

  object DeleteHostedZoneRequest {
    def apply(
      Id: js.UndefOr[ResourceId] = js.undefined
    ): DeleteHostedZoneRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Id" -> Id.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteHostedZoneRequest]
    }
  }

  /**
   * <p>A complex type containing the response information for the request.</p>
   */
  @js.native
  trait DeleteHostedZoneResponse extends js.Object {
    var ChangeInfo: ChangeInfo
  }

  object DeleteHostedZoneResponse {
    def apply(
      ChangeInfo: js.UndefOr[ChangeInfo] = js.undefined
    ): DeleteHostedZoneResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ChangeInfo" -> ChangeInfo.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteHostedZoneResponse]
    }
  }

  /**
   * <p>A complex type containing the information for the delete request.</p>
   */
  @js.native
  trait DeleteReusableDelegationSetRequest extends js.Object {
    var Id: ResourceId
  }

  object DeleteReusableDelegationSetRequest {
    def apply(
      Id: js.UndefOr[ResourceId] = js.undefined
    ): DeleteReusableDelegationSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Id" -> Id.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    def apply(

    ): DeleteReusableDelegationSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteReusableDelegationSetResponse]
    }
  }

  /**
   * <p>A complex type that contains information about the traffic policy instance that you want to delete.</p>
   */
  @js.native
  trait DeleteTrafficPolicyInstanceRequest extends js.Object {
    var Id: TrafficPolicyInstanceId
  }

  object DeleteTrafficPolicyInstanceRequest {
    def apply(
      Id: js.UndefOr[TrafficPolicyInstanceId] = js.undefined
    ): DeleteTrafficPolicyInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Id" -> Id.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    def apply(

    ): DeleteTrafficPolicyInstanceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTrafficPolicyInstanceResponse]
    }
  }

  /**
   * <p>A request to delete a specified traffic policy version.</p>
   */
  @js.native
  trait DeleteTrafficPolicyRequest extends js.Object {
    var Id: TrafficPolicyId
    var Version: TrafficPolicyVersion
  }

  object DeleteTrafficPolicyRequest {
    def apply(
      Id: js.UndefOr[TrafficPolicyId] = js.undefined,
      Version: js.UndefOr[TrafficPolicyVersion] = js.undefined
    ): DeleteTrafficPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Id" -> Id.map { x => x: js.Any }),
        ("Version" -> Version.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    def apply(

    ): DeleteTrafficPolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTrafficPolicyResponse]
    }
  }

  /**
   * <p>A complex type that contains information about the request to remove authorization to associate a VPC that was created by one AWS account with a hosted zone that was created with a different AWS account. </p>
   */
  @js.native
  trait DeleteVPCAssociationAuthorizationRequest extends js.Object {
    var HostedZoneId: ResourceId
    var VPC: VPC
  }

  object DeleteVPCAssociationAuthorizationRequest {
    def apply(
      HostedZoneId: js.UndefOr[ResourceId] = js.undefined,
      VPC: js.UndefOr[VPC] = js.undefined
    ): DeleteVPCAssociationAuthorizationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("HostedZoneId" -> HostedZoneId.map { x => x: js.Any }),
        ("VPC" -> VPC.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    def apply(

    ): DeleteVPCAssociationAuthorizationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteVPCAssociationAuthorizationResponse]
    }
  }

  /**
   * <p>For the metric that the CloudWatch alarm is associated with, a complex type that contains information about one dimension.</p>
   */
  @js.native
  trait Dimension extends js.Object {
    var Name: DimensionField
    var Value: DimensionField
  }

  object Dimension {
    def apply(
      Name: js.UndefOr[DimensionField] = js.undefined,
      Value: js.UndefOr[DimensionField] = js.undefined
    ): Dimension = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("Value" -> Value.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Dimension]
    }
  }

  /**
   * <p>A complex type that contains information about the VPC that you want to disassociate from a specified private hosted zone.</p>
   */
  @js.native
  trait DisassociateVPCFromHostedZoneRequest extends js.Object {
    var HostedZoneId: ResourceId
    var VPC: VPC
    var Comment: DisassociateVPCComment
  }

  object DisassociateVPCFromHostedZoneRequest {
    def apply(
      HostedZoneId: js.UndefOr[ResourceId] = js.undefined,
      VPC: js.UndefOr[VPC] = js.undefined,
      Comment: js.UndefOr[DisassociateVPCComment] = js.undefined
    ): DisassociateVPCFromHostedZoneRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("HostedZoneId" -> HostedZoneId.map { x => x: js.Any }),
        ("VPC" -> VPC.map { x => x: js.Any }),
        ("Comment" -> Comment.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateVPCFromHostedZoneRequest]
    }
  }

  /**
   * <p>A complex type that contains the response information for the disassociate request.</p>
   */
  @js.native
  trait DisassociateVPCFromHostedZoneResponse extends js.Object {
    var ChangeInfo: ChangeInfo
  }

  object DisassociateVPCFromHostedZoneResponse {
    def apply(
      ChangeInfo: js.UndefOr[ChangeInfo] = js.undefined
    ): DisassociateVPCFromHostedZoneResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ChangeInfo" -> ChangeInfo.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateVPCFromHostedZoneResponse]
    }
  }

  /**
   * <p>A complex type that contains information about a geo location.</p>
   */
  @js.native
  trait GeoLocation extends js.Object {
    var ContinentCode: GeoLocationContinentCode
    var CountryCode: GeoLocationCountryCode
    var SubdivisionCode: GeoLocationSubdivisionCode
  }

  object GeoLocation {
    def apply(
      ContinentCode: js.UndefOr[GeoLocationContinentCode] = js.undefined,
      CountryCode: js.UndefOr[GeoLocationCountryCode] = js.undefined,
      SubdivisionCode: js.UndefOr[GeoLocationSubdivisionCode] = js.undefined
    ): GeoLocation = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ContinentCode" -> ContinentCode.map { x => x: js.Any }),
        ("CountryCode" -> CountryCode.map { x => x: js.Any }),
        ("SubdivisionCode" -> SubdivisionCode.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GeoLocation]
    }
  }

  /**
   * <p>A complex type that contains the codes and full continent, country, and subdivision names for the specified <code>geolocation</code> code.</p>
   */
  @js.native
  trait GeoLocationDetails extends js.Object {
    var ContinentCode: GeoLocationContinentCode
    var CountryCode: GeoLocationCountryCode
    var SubdivisionName: GeoLocationSubdivisionName
    var CountryName: GeoLocationCountryName
    var ContinentName: GeoLocationContinentName
    var SubdivisionCode: GeoLocationSubdivisionCode
  }

  object GeoLocationDetails {
    def apply(
      ContinentCode: js.UndefOr[GeoLocationContinentCode] = js.undefined,
      CountryCode: js.UndefOr[GeoLocationCountryCode] = js.undefined,
      SubdivisionName: js.UndefOr[GeoLocationSubdivisionName] = js.undefined,
      CountryName: js.UndefOr[GeoLocationCountryName] = js.undefined,
      ContinentName: js.UndefOr[GeoLocationContinentName] = js.undefined,
      SubdivisionCode: js.UndefOr[GeoLocationSubdivisionCode] = js.undefined
    ): GeoLocationDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ContinentCode" -> ContinentCode.map { x => x: js.Any }),
        ("CountryCode" -> CountryCode.map { x => x: js.Any }),
        ("SubdivisionName" -> SubdivisionName.map { x => x: js.Any }),
        ("CountryName" -> CountryName.map { x => x: js.Any }),
        ("ContinentName" -> ContinentName.map { x => x: js.Any }),
        ("SubdivisionCode" -> SubdivisionCode.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GeoLocationDetails]
    }
  }

  /**
   * <p>The input for a GetChange request.</p>
   */
  @js.native
  trait GetChangeRequest extends js.Object {
    var Id: ResourceId
  }

  object GetChangeRequest {
    def apply(
      Id: js.UndefOr[ResourceId] = js.undefined
    ): GetChangeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Id" -> Id.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetChangeRequest]
    }
  }

  /**
   * <p>A complex type that contains the <code>ChangeInfo</code> element.</p>
   */
  @js.native
  trait GetChangeResponse extends js.Object {
    var ChangeInfo: ChangeInfo
  }

  object GetChangeResponse {
    def apply(
      ChangeInfo: js.UndefOr[ChangeInfo] = js.undefined
    ): GetChangeResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ChangeInfo" -> ChangeInfo.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetChangeResponse]
    }
  }

  /**
   * <p>Empty request.</p>
   */
  @js.native
  trait GetCheckerIpRangesRequest extends js.Object {

  }

  object GetCheckerIpRangesRequest {
    def apply(

    ): GetCheckerIpRangesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCheckerIpRangesRequest]
    }
  }

  /**
   * <p>A complex type that contains the <code>CheckerIpRanges</code> element.</p>
   */
  @js.native
  trait GetCheckerIpRangesResponse extends js.Object {
    var CheckerIpRanges: CheckerIpRanges
  }

  object GetCheckerIpRangesResponse {
    def apply(
      CheckerIpRanges: js.UndefOr[CheckerIpRanges] = js.undefined
    ): GetCheckerIpRangesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CheckerIpRanges" -> CheckerIpRanges.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCheckerIpRangesResponse]
    }
  }

  /**
   * <p>A complex type that contains information about the request to get a geo location.</p>
   */
  @js.native
  trait GetGeoLocationRequest extends js.Object {
    var ContinentCode: GeoLocationContinentCode
    var CountryCode: GeoLocationCountryCode
    var SubdivisionCode: GeoLocationSubdivisionCode
  }

  object GetGeoLocationRequest {
    def apply(
      ContinentCode: js.UndefOr[GeoLocationContinentCode] = js.undefined,
      CountryCode: js.UndefOr[GeoLocationCountryCode] = js.undefined,
      SubdivisionCode: js.UndefOr[GeoLocationSubdivisionCode] = js.undefined
    ): GetGeoLocationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ContinentCode" -> ContinentCode.map { x => x: js.Any }),
        ("CountryCode" -> CountryCode.map { x => x: js.Any }),
        ("SubdivisionCode" -> SubdivisionCode.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetGeoLocationRequest]
    }
  }

  /**
   * <p>A complex type that contains the response information for the specified geolocation code.</p>
   */
  @js.native
  trait GetGeoLocationResponse extends js.Object {
    var GeoLocationDetails: GeoLocationDetails
  }

  object GetGeoLocationResponse {
    def apply(
      GeoLocationDetails: js.UndefOr[GeoLocationDetails] = js.undefined
    ): GetGeoLocationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GeoLocationDetails" -> GeoLocationDetails.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetGeoLocationResponse]
    }
  }

  /**
   * <p>To retrieve a count of all your health checks, send a <code>GET</code> request to the <code>/2013-04-01/healthcheckcount</code> resource.</p>
   */
  @js.native
  trait GetHealthCheckCountRequest extends js.Object {

  }

  object GetHealthCheckCountRequest {
    def apply(

    ): GetHealthCheckCountRequest = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetHealthCheckCountRequest]
    }
  }

  /**
   * <p>A complex type that contains the response to a <code>healthcheckcount</code> request.</p>
   */
  @js.native
  trait GetHealthCheckCountResponse extends js.Object {
    var HealthCheckCount: HealthCheckCount
  }

  object GetHealthCheckCountResponse {
    def apply(
      HealthCheckCount: js.UndefOr[HealthCheckCount] = js.undefined
    ): GetHealthCheckCountResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("HealthCheckCount" -> HealthCheckCount.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetHealthCheckCountResponse]
    }
  }

  /**
   * <p>This action gets the reason that a specified health check failed most recently.</p> <p>To get the reason for the last failure of a health check, send a GET request to the /2013-04-01/healthcheck/health check ID/lastfailurereason resource. </p> <p>For information about viewing the last failure reason for a health check using the Amazon Route 53 console, see <a href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/health-checks-monitor-view-status.html">Viewing Health Check Status and the Reason for Health Check Failures</a> in the <i>Amazon Route 53 Developer Guide</i>.</p>
   */
  @js.native
  trait GetHealthCheckLastFailureReasonRequest extends js.Object {
    var HealthCheckId: HealthCheckId
  }

  object GetHealthCheckLastFailureReasonRequest {
    def apply(
      HealthCheckId: js.UndefOr[HealthCheckId] = js.undefined
    ): GetHealthCheckLastFailureReasonRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("HealthCheckId" -> HealthCheckId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetHealthCheckLastFailureReasonRequest]
    }
  }

  /**
   * <p>A complex type that contains the response to a <code>GetHealthCheckLastFailureReason</code> request.</p>
   */
  @js.native
  trait GetHealthCheckLastFailureReasonResponse extends js.Object {
    var HealthCheckObservations: HealthCheckObservations
  }

  object GetHealthCheckLastFailureReasonResponse {
    def apply(
      HealthCheckObservations: js.UndefOr[HealthCheckObservations] = js.undefined
    ): GetHealthCheckLastFailureReasonResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("HealthCheckObservations" -> HealthCheckObservations.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetHealthCheckLastFailureReasonResponse]
    }
  }

  /**
   * <p>This action gets information about a specified health check.</p> <p>Send a <code>GET</code> request to the <code>/<i>Amazon Route 53 API version</i>/gethealthcheckrequest</code> resource.</p> <p>For information about getting information about a health check using the Amazon Route 53 console, see <a href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html">Amazon Route 53 Health Checks and DNS Failover</a> in the <i>Amazon Route 53 Developer Guide</i>.</p>
   */
  @js.native
  trait GetHealthCheckRequest extends js.Object {
    var HealthCheckId: HealthCheckId
  }

  object GetHealthCheckRequest {
    def apply(
      HealthCheckId: js.UndefOr[HealthCheckId] = js.undefined
    ): GetHealthCheckRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("HealthCheckId" -> HealthCheckId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetHealthCheckRequest]
    }
  }

  /**
   * <p>A complex type that contains the response to a <code>GetHealthCheck</code> request.</p>
   */
  @js.native
  trait GetHealthCheckResponse extends js.Object {
    var HealthCheck: HealthCheck
  }

  object GetHealthCheckResponse {
    def apply(
      HealthCheck: js.UndefOr[HealthCheck] = js.undefined
    ): GetHealthCheckResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("HealthCheck" -> HealthCheck.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetHealthCheckResponse]
    }
  }

  /**
   * <p>A complex type that contains information about the request to get health check status for a health check.</p>
   */
  @js.native
  trait GetHealthCheckStatusRequest extends js.Object {
    var HealthCheckId: HealthCheckId
  }

  object GetHealthCheckStatusRequest {
    def apply(
      HealthCheckId: js.UndefOr[HealthCheckId] = js.undefined
    ): GetHealthCheckStatusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("HealthCheckId" -> HealthCheckId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetHealthCheckStatusRequest]
    }
  }

  /**
   * <p>A complex type that contains the response to a <code>GetHealthCheck</code> request.</p>
   */
  @js.native
  trait GetHealthCheckStatusResponse extends js.Object {
    var HealthCheckObservations: HealthCheckObservations
  }

  object GetHealthCheckStatusResponse {
    def apply(
      HealthCheckObservations: js.UndefOr[HealthCheckObservations] = js.undefined
    ): GetHealthCheckStatusResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("HealthCheckObservations" -> HealthCheckObservations.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetHealthCheckStatusResponse]
    }
  }

  /**
   * <p>To retrieve a count of all your hosted zones, send a <code>GET</code> request to the <code>/2013-04-01/hostedzonecount</code> resource.</p>
   */
  @js.native
  trait GetHostedZoneCountRequest extends js.Object {

  }

  object GetHostedZoneCountRequest {
    def apply(

    ): GetHostedZoneCountRequest = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetHostedZoneCountRequest]
    }
  }

  /**
   * <p>A complex type that contains the response to a <code>hostedzonecount</code> request.</p>
   */
  @js.native
  trait GetHostedZoneCountResponse extends js.Object {
    var HostedZoneCount: HostedZoneCount
  }

  object GetHostedZoneCountResponse {
    def apply(
      HostedZoneCount: js.UndefOr[HostedZoneCount] = js.undefined
    ): GetHostedZoneCountResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("HostedZoneCount" -> HostedZoneCount.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetHostedZoneCountResponse]
    }
  }

  /**
   * <p>The input for a GetHostedZone request.</p>
   */
  @js.native
  trait GetHostedZoneRequest extends js.Object {
    var Id: ResourceId
  }

  object GetHostedZoneRequest {
    def apply(
      Id: js.UndefOr[ResourceId] = js.undefined
    ): GetHostedZoneRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Id" -> Id.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetHostedZoneRequest]
    }
  }

  /**
   * <p>A complex type containing the response information for the hosted zone.</p>
   */
  @js.native
  trait GetHostedZoneResponse extends js.Object {
    var HostedZone: HostedZone
    var DelegationSet: DelegationSet
    var VPCs: VPCs
  }

  object GetHostedZoneResponse {
    def apply(
      HostedZone: js.UndefOr[HostedZone] = js.undefined,
      DelegationSet: js.UndefOr[DelegationSet] = js.undefined,
      VPCs: js.UndefOr[VPCs] = js.undefined
    ): GetHostedZoneResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("HostedZone" -> HostedZone.map { x => x: js.Any }),
        ("DelegationSet" -> DelegationSet.map { x => x: js.Any }),
        ("VPCs" -> VPCs.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetHostedZoneResponse]
    }
  }

  /**
   * <p>The input for a <code>GetReusableDelegationSet</code> request.</p>
   */
  @js.native
  trait GetReusableDelegationSetRequest extends js.Object {
    var Id: ResourceId
  }

  object GetReusableDelegationSetRequest {
    def apply(
      Id: js.UndefOr[ResourceId] = js.undefined
    ): GetReusableDelegationSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Id" -> Id.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetReusableDelegationSetRequest]
    }
  }

  /**
   * <p>A complex type that contains the response to the <code>GetReusableDelegationSet</code> request.</p>
   */
  @js.native
  trait GetReusableDelegationSetResponse extends js.Object {
    var DelegationSet: DelegationSet
  }

  object GetReusableDelegationSetResponse {
    def apply(
      DelegationSet: js.UndefOr[DelegationSet] = js.undefined
    ): GetReusableDelegationSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DelegationSet" -> DelegationSet.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetReusableDelegationSetResponse]
    }
  }

  /**
   * <p>To retrieve a count of all your traffic policy instances, send a <code>GET</code> request to the <code>/2013-04-01/trafficpolicyinstancecount</code> resource.</p>
   */
  @js.native
  trait GetTrafficPolicyInstanceCountRequest extends js.Object {

  }

  object GetTrafficPolicyInstanceCountRequest {
    def apply(

    ): GetTrafficPolicyInstanceCountRequest = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTrafficPolicyInstanceCountRequest]
    }
  }

  /**
   * <p>A complex type that contains information about the resource record sets that Amazon Route 53 created based on a specified traffic policy.</p>
   */
  @js.native
  trait GetTrafficPolicyInstanceCountResponse extends js.Object {
    var TrafficPolicyInstanceCount: TrafficPolicyInstanceCount
  }

  object GetTrafficPolicyInstanceCountResponse {
    def apply(
      TrafficPolicyInstanceCount: js.UndefOr[TrafficPolicyInstanceCount] = js.undefined
    ): GetTrafficPolicyInstanceCountResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TrafficPolicyInstanceCount" -> TrafficPolicyInstanceCount.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTrafficPolicyInstanceCountResponse]
    }
  }

  /**
   * <p>Gets information about a specified traffic policy instance.</p> <p>To get information about a traffic policy instance, send a <code>GET</code> request to the <code>/<i>Amazon Route 53 API version</i>/trafficpolicyinstance/<i>Id</i> </code> resource.</p>
   */
  @js.native
  trait GetTrafficPolicyInstanceRequest extends js.Object {
    var Id: TrafficPolicyInstanceId
  }

  object GetTrafficPolicyInstanceRequest {
    def apply(
      Id: js.UndefOr[TrafficPolicyInstanceId] = js.undefined
    ): GetTrafficPolicyInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Id" -> Id.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTrafficPolicyInstanceRequest]
    }
  }

  /**
   * <p>A complex type that contains information about the resource record sets that Amazon Route 53 created based on a specified traffic policy.</p>
   */
  @js.native
  trait GetTrafficPolicyInstanceResponse extends js.Object {
    var TrafficPolicyInstance: TrafficPolicyInstance
  }

  object GetTrafficPolicyInstanceResponse {
    def apply(
      TrafficPolicyInstance: js.UndefOr[TrafficPolicyInstance] = js.undefined
    ): GetTrafficPolicyInstanceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TrafficPolicyInstance" -> TrafficPolicyInstance.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTrafficPolicyInstanceResponse]
    }
  }

  /**
   * <p>Gets information about a specific traffic policy version. To get the information, send a GET request to the /2013-04-01/trafficpolicy resource, and specify the ID and the version of the traffic policy.</p>
   */
  @js.native
  trait GetTrafficPolicyRequest extends js.Object {
    var Id: TrafficPolicyId
    var Version: TrafficPolicyVersion
  }

  object GetTrafficPolicyRequest {
    def apply(
      Id: js.UndefOr[TrafficPolicyId] = js.undefined,
      Version: js.UndefOr[TrafficPolicyVersion] = js.undefined
    ): GetTrafficPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Id" -> Id.map { x => x: js.Any }),
        ("Version" -> Version.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTrafficPolicyRequest]
    }
  }

  /**
   * <p>A complex type that contains the response information for the request.</p>
   */
  @js.native
  trait GetTrafficPolicyResponse extends js.Object {
    var TrafficPolicy: TrafficPolicy
  }

  object GetTrafficPolicyResponse {
    def apply(
      TrafficPolicy: js.UndefOr[TrafficPolicy] = js.undefined
    ): GetTrafficPolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TrafficPolicy" -> TrafficPolicy.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTrafficPolicyResponse]
    }
  }

  /**
   * <p>A complex type that contains information about one health check that is associated with the current AWS account.</p>
   */
  @js.native
  trait HealthCheck extends js.Object {
    var Id: HealthCheckId
    var HealthCheckVersion: HealthCheckVersion
    var CallerReference: HealthCheckNonce
    var CloudWatchAlarmConfiguration: CloudWatchAlarmConfiguration
    var HealthCheckConfig: HealthCheckConfig
  }

  object HealthCheck {
    def apply(
      Id: js.UndefOr[HealthCheckId] = js.undefined,
      HealthCheckVersion: js.UndefOr[HealthCheckVersion] = js.undefined,
      CallerReference: js.UndefOr[HealthCheckNonce] = js.undefined,
      CloudWatchAlarmConfiguration: js.UndefOr[CloudWatchAlarmConfiguration] = js.undefined,
      HealthCheckConfig: js.UndefOr[HealthCheckConfig] = js.undefined
    ): HealthCheck = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Id" -> Id.map { x => x: js.Any }),
        ("HealthCheckVersion" -> HealthCheckVersion.map { x => x: js.Any }),
        ("CallerReference" -> CallerReference.map { x => x: js.Any }),
        ("CloudWatchAlarmConfiguration" -> CloudWatchAlarmConfiguration.map { x => x: js.Any }),
        ("HealthCheckConfig" -> HealthCheckConfig.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HealthCheck]
    }
  }

  /**
   * <p> The health check you're attempting to create already exists.</p> <p>Amazon Route 53 returns this error when a health check has already been created with the specified value for <code>CallerReference</code>.</p>
   */
  @js.native
  trait HealthCheckAlreadyExistsException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>A complex type that contains information about the health check.</p>
   */
  @js.native
  trait HealthCheckConfig extends js.Object {
    var IPAddress: IPAddress
    var ResourcePath: ResourcePath
    var Regions: HealthCheckRegionList
    var AlarmIdentifier: AlarmIdentifier
    var FullyQualifiedDomainName: FullyQualifiedDomainName
    var SearchString: SearchString
    var EnableSNI: EnableSNI
    var InsufficientDataHealthStatus: InsufficientDataHealthStatus
    var Port: Port
    var MeasureLatency: MeasureLatency
    var RequestInterval: RequestInterval
    var Inverted: Inverted
    var FailureThreshold: FailureThreshold
    var ChildHealthChecks: ChildHealthCheckList
    var HealthThreshold: HealthThreshold
    var Type: HealthCheckType
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
      Inverted: js.UndefOr[Inverted] = js.undefined,
      FailureThreshold: js.UndefOr[FailureThreshold] = js.undefined,
      ChildHealthChecks: js.UndefOr[ChildHealthCheckList] = js.undefined,
      HealthThreshold: js.UndefOr[HealthThreshold] = js.undefined,
      Type: js.UndefOr[HealthCheckType] = js.undefined
    ): HealthCheckConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IPAddress" -> IPAddress.map { x => x: js.Any }),
        ("ResourcePath" -> ResourcePath.map { x => x: js.Any }),
        ("Regions" -> Regions.map { x => x: js.Any }),
        ("AlarmIdentifier" -> AlarmIdentifier.map { x => x: js.Any }),
        ("FullyQualifiedDomainName" -> FullyQualifiedDomainName.map { x => x: js.Any }),
        ("SearchString" -> SearchString.map { x => x: js.Any }),
        ("EnableSNI" -> EnableSNI.map { x => x: js.Any }),
        ("InsufficientDataHealthStatus" -> InsufficientDataHealthStatus.map { x => x: js.Any }),
        ("Port" -> Port.map { x => x: js.Any }),
        ("MeasureLatency" -> MeasureLatency.map { x => x: js.Any }),
        ("RequestInterval" -> RequestInterval.map { x => x: js.Any }),
        ("Inverted" -> Inverted.map { x => x: js.Any }),
        ("FailureThreshold" -> FailureThreshold.map { x => x: js.Any }),
        ("ChildHealthChecks" -> ChildHealthChecks.map { x => x: js.Any }),
        ("HealthThreshold" -> HealthThreshold.map { x => x: js.Any }),
        ("Type" -> Type.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HealthCheckConfig]
    }
  }

  /**
   * <p>The health check ID for this health check is referenced in the <code>HealthCheckId</code> element in one of the resource record sets in one of the hosted zones that are owned by the current AWS account.</p>
   */
  @js.native
  trait HealthCheckInUseException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>A complex type that contains the last failure reason as reported by one Amazon Route 53 health checker.</p>
   */
  @js.native
  trait HealthCheckObservation extends js.Object {
    var Region: HealthCheckRegion
    var IPAddress: IPAddress
    var StatusReport: StatusReport
  }

  object HealthCheckObservation {
    def apply(
      Region: js.UndefOr[HealthCheckRegion] = js.undefined,
      IPAddress: js.UndefOr[IPAddress] = js.undefined,
      StatusReport: js.UndefOr[StatusReport] = js.undefined
    ): HealthCheckObservation = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Region" -> Region.map { x => x: js.Any }),
        ("IPAddress" -> IPAddress.map { x => x: js.Any }),
        ("StatusReport" -> StatusReport.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HealthCheckObservation]
    }
  }

  /**
   * <p>An Amazon EC2 Region that you want Amazon Route 53 to use to perform health checks.</p>
   */
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
    val `HTTP_STR_MATCH` = "HTTP_STR_MATCH"
    val `HTTPS_STR_MATCH` = "HTTPS_STR_MATCH"
    val TCP = "TCP"
    val CALCULATED = "CALCULATED"
    val `CLOUDWATCH_METRIC` = "CLOUDWATCH_METRIC"

    val values = IndexedSeq(HTTP, HTTPS, `HTTP_STR_MATCH`, `HTTPS_STR_MATCH`, TCP, CALCULATED, `CLOUDWATCH_METRIC`)
  }

  /**
   * <p>The value of <code>HealthCheckVersion</code> in the request doesn't match the value of <code>HealthCheckVersion</code> in the health check.</p>
   */
  @js.native
  trait HealthCheckVersionMismatchException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>A complex type that contains general information about the hosted zone.</p>
   */
  @js.native
  trait HostedZone extends js.Object {
    var Id: ResourceId
    var Name: DNSName
    var CallerReference: Nonce
    var ResourceRecordSetCount: HostedZoneRRSetCount
    var Config: HostedZoneConfig
  }

  object HostedZone {
    def apply(
      Id: js.UndefOr[ResourceId] = js.undefined,
      Name: js.UndefOr[DNSName] = js.undefined,
      CallerReference: js.UndefOr[Nonce] = js.undefined,
      ResourceRecordSetCount: js.UndefOr[HostedZoneRRSetCount] = js.undefined,
      Config: js.UndefOr[HostedZoneConfig] = js.undefined
    ): HostedZone = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Id" -> Id.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("CallerReference" -> CallerReference.map { x => x: js.Any }),
        ("ResourceRecordSetCount" -> ResourceRecordSetCount.map { x => x: js.Any }),
        ("Config" -> Config.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HostedZone]
    }
  }

  /**
   * <p>The hosted zone you are trying to create already exists. Amazon Route 53 returns this error when a hosted zone has already been created with the specified <code>CallerReference</code>.</p>
   */
  @js.native
  trait HostedZoneAlreadyExistsException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>A complex type that contains an optional comment about your hosted zone. If you don't want to specify a comment, omit both the <code>HostedZoneConfig</code> and <code>Comment</code> elements.</p>
   */
  @js.native
  trait HostedZoneConfig extends js.Object {
    var Comment: ResourceDescription
    var PrivateZone: IsPrivateZone
  }

  object HostedZoneConfig {
    def apply(
      Comment: js.UndefOr[ResourceDescription] = js.undefined,
      PrivateZone: js.UndefOr[IsPrivateZone] = js.undefined
    ): HostedZoneConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Comment" -> Comment.map { x => x: js.Any }),
        ("PrivateZone" -> PrivateZone.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HostedZoneConfig]
    }
  }

  /**
   * <p>The hosted zone contains resource records that are not SOA or NS records.</p>
   */
  @js.native
  trait HostedZoneNotEmptyException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>The specified HostedZone can't be found.</p>
   */
  @js.native
  trait HostedZoneNotFoundException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>The resource you are trying to access is unsupported on this Amazon Route 53 endpoint. Please consider using a newer endpoint or a tool that does so.</p>
   */
  @js.native
  trait IncompatibleVersionException extends js.Object {
    var message: ErrorMessage
  }


  object InsufficientDataHealthStatusEnum {
    val Healthy = "Healthy"
    val Unhealthy = "Unhealthy"
    val LastKnownStatus = "LastKnownStatus"

    val values = IndexedSeq(Healthy, Unhealthy, LastKnownStatus)
  }

  /**
   * <p>Parameter name and problem.</p>
   */
  @js.native
  trait InvalidArgumentException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>This exception contains a list of messages that might contain one or more error messages. Each error message indicates one error in the change batch.</p>
   */
  @js.native
  trait InvalidChangeBatchException extends js.Object {
    var messages: ErrorMessages
  }

  /**
   * <p>The specified domain name is not valid.</p>
   */
  @js.native
  trait InvalidDomainNameException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>The input is not valid.</p>
   */
  @js.native
  trait InvalidInputException extends js.Object {
    var message: ErrorMessage
  }

  @js.native
  trait InvalidPaginationTokenException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>The format of the traffic policy document that you specified in the <code>Document</code> element is invalid.</p>
   */
  @js.native
  trait InvalidTrafficPolicyDocumentException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>The VPC ID that you specified either isn't a valid ID or the current account is not authorized to access this VPC.</p>
   */
  @js.native
  trait InvalidVPCIdException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>The VPC that you're trying to disassociate from the private hosted zone is the last VPC that is associated with the hosted zone. Amazon Route 53 doesn't support disassociating the last VPC from a hosted zone.</p>
   */
  @js.native
  trait LastVPCAssociationException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>The limits specified for a resource have been exceeded.</p>
   */
  @js.native
  trait LimitsExceededException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>To get a list of geographic locations that Amazon Route 53 supports for geolocation, send a <code>GET</code> request to the <code>/<i>Amazon Route 53 API version</i>/geolocations</code> resource. The response to this request includes a <code>GeoLocationDetails</code> element for each location that Amazon Route 53 supports.</p> <p>Countries are listed first, and continents are listed last. If Amazon Route 53 supports subdivisions for a country (for example, states or provinces), the subdivisions for that country are listed in alphabetical order immediately after the corresponding country. </p>
   */
  @js.native
  trait ListGeoLocationsRequest extends js.Object {
    var StartContinentCode: GeoLocationContinentCode
    var StartCountryCode: GeoLocationCountryCode
    var StartSubdivisionCode: GeoLocationSubdivisionCode
    var MaxItems: PageMaxItems
  }

  object ListGeoLocationsRequest {
    def apply(
      StartContinentCode: js.UndefOr[GeoLocationContinentCode] = js.undefined,
      StartCountryCode: js.UndefOr[GeoLocationCountryCode] = js.undefined,
      StartSubdivisionCode: js.UndefOr[GeoLocationSubdivisionCode] = js.undefined,
      MaxItems: js.UndefOr[PageMaxItems] = js.undefined
    ): ListGeoLocationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StartContinentCode" -> StartContinentCode.map { x => x: js.Any }),
        ("StartCountryCode" -> StartCountryCode.map { x => x: js.Any }),
        ("StartSubdivisionCode" -> StartSubdivisionCode.map { x => x: js.Any }),
        ("MaxItems" -> MaxItems.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListGeoLocationsRequest]
    }
  }

  /**
   * <p>A complex type containing the response information for the request.</p>
   */
  @js.native
  trait ListGeoLocationsResponse extends js.Object {
    var IsTruncated: PageTruncated
    var NextCountryCode: GeoLocationCountryCode
    var GeoLocationDetailsList: GeoLocationDetailsList
    var MaxItems: PageMaxItems
    var NextContinentCode: GeoLocationContinentCode
    var NextSubdivisionCode: GeoLocationSubdivisionCode
  }

  object ListGeoLocationsResponse {
    def apply(
      IsTruncated: js.UndefOr[PageTruncated] = js.undefined,
      NextCountryCode: js.UndefOr[GeoLocationCountryCode] = js.undefined,
      GeoLocationDetailsList: js.UndefOr[GeoLocationDetailsList] = js.undefined,
      MaxItems: js.UndefOr[PageMaxItems] = js.undefined,
      NextContinentCode: js.UndefOr[GeoLocationContinentCode] = js.undefined,
      NextSubdivisionCode: js.UndefOr[GeoLocationSubdivisionCode] = js.undefined
    ): ListGeoLocationsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IsTruncated" -> IsTruncated.map { x => x: js.Any }),
        ("NextCountryCode" -> NextCountryCode.map { x => x: js.Any }),
        ("GeoLocationDetailsList" -> GeoLocationDetailsList.map { x => x: js.Any }),
        ("MaxItems" -> MaxItems.map { x => x: js.Any }),
        ("NextContinentCode" -> NextContinentCode.map { x => x: js.Any }),
        ("NextSubdivisionCode" -> NextSubdivisionCode.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListGeoLocationsResponse]
    }
  }

  /**
   * <p>To retrieve a list of your health checks, send a <code>GET</code> request to the <code>/2013-04-01/healthcheck</code> resource. The response to this request includes a <code>HealthChecks</code> element with zero or more <code>HealthCheck</code> child elements. By default, the list of health checks is displayed on a single page. You can control the length of the page that is displayed by using the <code>MaxItems</code> parameter. You can use the <code>Marker</code> parameter to control the health check that the list begins with.</p> <note> <p> Amazon Route 53 returns a maximum of 100 items. If you set <code>MaxItems</code> to a value greater than 100, Amazon Route 53 returns only the first 100.</p> </note>
   */
  @js.native
  trait ListHealthChecksRequest extends js.Object {
    var Marker: PageMarker
    var MaxItems: PageMaxItems
  }

  object ListHealthChecksRequest {
    def apply(
      Marker: js.UndefOr[PageMarker] = js.undefined,
      MaxItems: js.UndefOr[PageMaxItems] = js.undefined
    ): ListHealthChecksRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("MaxItems" -> MaxItems.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListHealthChecksRequest]
    }
  }

  /**
   * <p>A complex type that contains the response to a <code>ListHealthChecks</code> request.</p>
   */
  @js.native
  trait ListHealthChecksResponse extends js.Object {
    var IsTruncated: PageTruncated
    var MaxItems: PageMaxItems
    var NextMarker: PageMarker
    var HealthChecks: HealthChecks
    var Marker: PageMarker
  }

  object ListHealthChecksResponse {
    def apply(
      IsTruncated: js.UndefOr[PageTruncated] = js.undefined,
      MaxItems: js.UndefOr[PageMaxItems] = js.undefined,
      NextMarker: js.UndefOr[PageMarker] = js.undefined,
      HealthChecks: js.UndefOr[HealthChecks] = js.undefined,
      Marker: js.UndefOr[PageMarker] = js.undefined
    ): ListHealthChecksResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IsTruncated" -> IsTruncated.map { x => x: js.Any }),
        ("MaxItems" -> MaxItems.map { x => x: js.Any }),
        ("NextMarker" -> NextMarker.map { x => x: js.Any }),
        ("HealthChecks" -> HealthChecks.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListHealthChecksResponse]
    }
  }

  /**
   * <p>To retrieve a list of your public and private hosted zones in ASCII order by domain name, send a <code>GET</code> request to the <code>/<i>Amazon Route 53 API version</i>/hostedzonesbyname</code> resource. The response to this request includes a <code>HostedZone</code> child element for each hosted zone that was created by the current AWS account. <code>ListHostedZonesByName</code> sorts hosted zones by name with the labels reversed, for example:</p> <p> <code>com.example.www.</code> </p> <p>Note the trailing dot, which can change the sort order in some circumstances.</p> <p>If the domain name includes escape characters or Punycode, <code>ListHostedZonesByName</code> alphabetizes the domain name using the escaped or Punycoded value, which is the format that Amazon Route 53 saves in its database. For example, to create a hosted zone for exämple.com, you specify <code>ex\344mple.com</code> for the domain name. <code>ListHostedZonesByName</code> alphabetizes it as: <code>com.ex\344mple</code>. The labels are reversed, and it's alphabetized using the escaped value. For more information about valid domain name formats, including internationalized domain names, see <a href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DomainNameFormat.html">DNS Domain Name Format</a> in the <i>Amazon Route 53 Developer Guide</i>.</p> <p>Amazon Route 53 returns up to 100 items in each response. If you have a lot of hosted zones, you can use the <code>MaxItems</code> parameter to list them in groups of up to 100. The response includes values that help you navigate from one group of <code>MaxItems</code> hosted zones to the next:</p> <ul> <li> <p>The <code>DNSName</code> and <code>HostedZoneId</code> elements in the response contain the values, if any, that you specified for the <code>dnsname</code> and <code>hostedzoneid</code> parameters in the request that produced the current response.</p> </li> <li> <p>The <code>MaxItems</code> element in the response contains the value, if any, that you specified for the <code>maxitems</code> parameter in the request that produced the current response.</p> </li> <li> <p>If the value of <code>IsTruncated</code> in the response is true, there are more hosted zones associated with the current Amazon Route 53 account.</p> <p>If <code>IsTruncated</code> is <code>false</code>, this response includes the last hosted zone that is associated with the current account. The <code>NextDNSName</code> element and <code>NextHostedZoneId</code> elements are omitted from the response.</p> </li> <li> <p>The <code>NextDNSName</code> and <code>NextHostedZoneId</code> elements in the response contain the domain name and the hosted zone ID of the next hosted zone that is associated with the current AWS account. If you want to list more hosted zones, make another call to <code>ListHostedZonesByName</code>, and specify the value of <code>NextDNSName</code> and <code>NextHostedZoneId</code> in the <code>dnsname</code> and <code>hostedzoneid</code> parameters, respectively.</p> </li> </ul>
   */
  @js.native
  trait ListHostedZonesByNameRequest extends js.Object {
    var DNSName: DNSName
    var HostedZoneId: ResourceId
    var MaxItems: PageMaxItems
  }

  object ListHostedZonesByNameRequest {
    def apply(
      DNSName: js.UndefOr[DNSName] = js.undefined,
      HostedZoneId: js.UndefOr[ResourceId] = js.undefined,
      MaxItems: js.UndefOr[PageMaxItems] = js.undefined
    ): ListHostedZonesByNameRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DNSName" -> DNSName.map { x => x: js.Any }),
        ("HostedZoneId" -> HostedZoneId.map { x => x: js.Any }),
        ("MaxItems" -> MaxItems.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListHostedZonesByNameRequest]
    }
  }

  /**
   * <p>A complex type that contains the response information for the request.</p>
   */
  @js.native
  trait ListHostedZonesByNameResponse extends js.Object {
    var IsTruncated: PageTruncated
    var NextHostedZoneId: ResourceId
    var MaxItems: PageMaxItems
    var NextDNSName: DNSName
    var HostedZones: HostedZones
    var DNSName: DNSName
    var HostedZoneId: ResourceId
  }

  object ListHostedZonesByNameResponse {
    def apply(
      IsTruncated: js.UndefOr[PageTruncated] = js.undefined,
      NextHostedZoneId: js.UndefOr[ResourceId] = js.undefined,
      MaxItems: js.UndefOr[PageMaxItems] = js.undefined,
      NextDNSName: js.UndefOr[DNSName] = js.undefined,
      HostedZones: js.UndefOr[HostedZones] = js.undefined,
      DNSName: js.UndefOr[DNSName] = js.undefined,
      HostedZoneId: js.UndefOr[ResourceId] = js.undefined
    ): ListHostedZonesByNameResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IsTruncated" -> IsTruncated.map { x => x: js.Any }),
        ("NextHostedZoneId" -> NextHostedZoneId.map { x => x: js.Any }),
        ("MaxItems" -> MaxItems.map { x => x: js.Any }),
        ("NextDNSName" -> NextDNSName.map { x => x: js.Any }),
        ("HostedZones" -> HostedZones.map { x => x: js.Any }),
        ("DNSName" -> DNSName.map { x => x: js.Any }),
        ("HostedZoneId" -> HostedZoneId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListHostedZonesByNameResponse]
    }
  }

  /**
   * <p>To retrieve a list of your public and private hosted zones, send a <code>GET</code> request to the <code>/2013-04-01/hostedzone</code> resource. The response to this request includes a HostedZone child element for each hosted zone that was created by the current AWS account.</p> <p>Amazon Route 53 returns a maximum of 100 items in each response. If you have a lot of hosted zones, you can use the maxitems parameter to list them in groups of up to 100. The response includes four values that help you navigate from one group of maxitems hosted zones to the next:</p> <ul> <li> <p> <code>MaxItems</code> is the value that you specified for the <code>maxitems</code> parameter in the request that produced the current response.</p> </li> <li> <p>If the value of <code>IsTruncated</code> in the response is <code>true</code>, there are more hosted zones associated with the current AWS account.</p> <p>If <code>IsTruncated</code> is <code>false</code>, this response includes the last hosted zone that is associated with the current account.</p> </li> <li> <p> <code>NextMarker</code> is the hosted zone ID of the next hosted zone that is associated with the current AWS account. If you want to list more hosted zones, make another call to <code>ListHostedZones</code>, and specify the value of the <code>NextMarker</code> element in the marker parameter.</p> <p>If <code>IsTruncated</code> is <code>false</code>, the <code>NextMarker</code> element is omitted from the response.</p> </li> <li> <p>If you're making the second or subsequent call to <code>ListHostedZones</code>, the <code>Marker</code> element matches the value that you specified in the <code>marker</code> parameter in the previous request.</p> </li> </ul>
   */
  @js.native
  trait ListHostedZonesRequest extends js.Object {
    var Marker: PageMarker
    var MaxItems: PageMaxItems
    var DelegationSetId: ResourceId
  }

  object ListHostedZonesRequest {
    def apply(
      Marker: js.UndefOr[PageMarker] = js.undefined,
      MaxItems: js.UndefOr[PageMaxItems] = js.undefined,
      DelegationSetId: js.UndefOr[ResourceId] = js.undefined
    ): ListHostedZonesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("MaxItems" -> MaxItems.map { x => x: js.Any }),
        ("DelegationSetId" -> DelegationSetId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListHostedZonesRequest]
    }
  }

  @js.native
  trait ListHostedZonesResponse extends js.Object {
    var IsTruncated: PageTruncated
    var MaxItems: PageMaxItems
    var NextMarker: PageMarker
    var HostedZones: HostedZones
    var Marker: PageMarker
  }

  object ListHostedZonesResponse {
    def apply(
      IsTruncated: js.UndefOr[PageTruncated] = js.undefined,
      MaxItems: js.UndefOr[PageMaxItems] = js.undefined,
      NextMarker: js.UndefOr[PageMarker] = js.undefined,
      HostedZones: js.UndefOr[HostedZones] = js.undefined,
      Marker: js.UndefOr[PageMarker] = js.undefined
    ): ListHostedZonesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IsTruncated" -> IsTruncated.map { x => x: js.Any }),
        ("MaxItems" -> MaxItems.map { x => x: js.Any }),
        ("NextMarker" -> NextMarker.map { x => x: js.Any }),
        ("HostedZones" -> HostedZones.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListHostedZonesResponse]
    }
  }

  /**
   * <p>The input for a ListResourceRecordSets request.</p>
   */
  @js.native
  trait ListResourceRecordSetsRequest extends js.Object {
    var StartRecordType: RRType
    var MaxItems: PageMaxItems
    var StartRecordIdentifier: ResourceRecordSetIdentifier
    var StartRecordName: DNSName
    var HostedZoneId: ResourceId
  }

  object ListResourceRecordSetsRequest {
    def apply(
      StartRecordType: js.UndefOr[RRType] = js.undefined,
      MaxItems: js.UndefOr[PageMaxItems] = js.undefined,
      StartRecordIdentifier: js.UndefOr[ResourceRecordSetIdentifier] = js.undefined,
      StartRecordName: js.UndefOr[DNSName] = js.undefined,
      HostedZoneId: js.UndefOr[ResourceId] = js.undefined
    ): ListResourceRecordSetsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StartRecordType" -> StartRecordType.map { x => x: js.Any }),
        ("MaxItems" -> MaxItems.map { x => x: js.Any }),
        ("StartRecordIdentifier" -> StartRecordIdentifier.map { x => x: js.Any }),
        ("StartRecordName" -> StartRecordName.map { x => x: js.Any }),
        ("HostedZoneId" -> HostedZoneId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListResourceRecordSetsRequest]
    }
  }

  /**
   * <p>A complex type that contains list information for the resource record set.</p>
   */
  @js.native
  trait ListResourceRecordSetsResponse extends js.Object {
    var IsTruncated: PageTruncated
    var NextRecordName: DNSName
    var NextRecordIdentifier: ResourceRecordSetIdentifier
    var ResourceRecordSets: ResourceRecordSets
    var MaxItems: PageMaxItems
    var NextRecordType: RRType
  }

  object ListResourceRecordSetsResponse {
    def apply(
      IsTruncated: js.UndefOr[PageTruncated] = js.undefined,
      NextRecordName: js.UndefOr[DNSName] = js.undefined,
      NextRecordIdentifier: js.UndefOr[ResourceRecordSetIdentifier] = js.undefined,
      ResourceRecordSets: js.UndefOr[ResourceRecordSets] = js.undefined,
      MaxItems: js.UndefOr[PageMaxItems] = js.undefined,
      NextRecordType: js.UndefOr[RRType] = js.undefined
    ): ListResourceRecordSetsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IsTruncated" -> IsTruncated.map { x => x: js.Any }),
        ("NextRecordName" -> NextRecordName.map { x => x: js.Any }),
        ("NextRecordIdentifier" -> NextRecordIdentifier.map { x => x: js.Any }),
        ("ResourceRecordSets" -> ResourceRecordSets.map { x => x: js.Any }),
        ("MaxItems" -> MaxItems.map { x => x: js.Any }),
        ("NextRecordType" -> NextRecordType.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListResourceRecordSetsResponse]
    }
  }

  /**
   * <p>To retrieve a list of your reusable delegation sets, send a <code>GET</code> request to the <code>/2013-04-01/delegationset</code> resource. The response to this request includes a <code>DelegationSets</code> element with zero or more <code>DelegationSet</code> child elements. By default, the list of reusable delegation sets is displayed on a single page. You can control the length of the page that is displayed by using the <code>MaxItems</code> parameter. You can use the <code>Marker</code> parameter to control the delegation set that the list begins with.</p> <note> <p>Amazon Route 53 returns a maximum of 100 items. If you set <code>MaxItems</code> to a value greater than 100, Amazon Route 53 returns only the first 100.</p> </note>
   */
  @js.native
  trait ListReusableDelegationSetsRequest extends js.Object {
    var Marker: PageMarker
    var MaxItems: PageMaxItems
  }

  object ListReusableDelegationSetsRequest {
    def apply(
      Marker: js.UndefOr[PageMarker] = js.undefined,
      MaxItems: js.UndefOr[PageMaxItems] = js.undefined
    ): ListReusableDelegationSetsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("MaxItems" -> MaxItems.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListReusableDelegationSetsRequest]
    }
  }

  /**
   * <p>A complex type that contains information about the reusable delegation sets that are associated with the current AWS account.</p>
   */
  @js.native
  trait ListReusableDelegationSetsResponse extends js.Object {
    var IsTruncated: PageTruncated
    var DelegationSets: DelegationSets
    var MaxItems: PageMaxItems
    var NextMarker: PageMarker
    var Marker: PageMarker
  }

  object ListReusableDelegationSetsResponse {
    def apply(
      IsTruncated: js.UndefOr[PageTruncated] = js.undefined,
      DelegationSets: js.UndefOr[DelegationSets] = js.undefined,
      MaxItems: js.UndefOr[PageMaxItems] = js.undefined,
      NextMarker: js.UndefOr[PageMarker] = js.undefined,
      Marker: js.UndefOr[PageMarker] = js.undefined
    ): ListReusableDelegationSetsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IsTruncated" -> IsTruncated.map { x => x: js.Any }),
        ("DelegationSets" -> DelegationSets.map { x => x: js.Any }),
        ("MaxItems" -> MaxItems.map { x => x: js.Any }),
        ("NextMarker" -> NextMarker.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListReusableDelegationSetsResponse]
    }
  }

  /**
   * <p>A complex type containing information about a request for a list of the tags that are associated with an individual resource.</p>
   */
  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceType: TagResourceType
    var ResourceId: TagResourceId
  }

  object ListTagsForResourceRequest {
    def apply(
      ResourceType: js.UndefOr[TagResourceType] = js.undefined,
      ResourceId: js.UndefOr[TagResourceId] = js.undefined
    ): ListTagsForResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ResourceType" -> ResourceType.map { x => x: js.Any }),
        ("ResourceId" -> ResourceId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceRequest]
    }
  }

  /**
   * <p>A complex type that contains information about the health checks or hosted zones for which you want to list tags.</p>
   */
  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var ResourceTagSet: ResourceTagSet
  }

  object ListTagsForResourceResponse {
    def apply(
      ResourceTagSet: js.UndefOr[ResourceTagSet] = js.undefined
    ): ListTagsForResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ResourceTagSet" -> ResourceTagSet.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /**
   * <p>A complex type that contains information about the health checks or hosted zones for which you want to list tags.</p>
   */
  @js.native
  trait ListTagsForResourcesRequest extends js.Object {
    var ResourceType: TagResourceType
    var ResourceIds: TagResourceIdList
  }

  object ListTagsForResourcesRequest {
    def apply(
      ResourceType: js.UndefOr[TagResourceType] = js.undefined,
      ResourceIds: js.UndefOr[TagResourceIdList] = js.undefined
    ): ListTagsForResourcesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ResourceType" -> ResourceType.map { x => x: js.Any }),
        ("ResourceIds" -> ResourceIds.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourcesRequest]
    }
  }

  /**
   * <p>A complex type containing tags for the specified resources.</p>
   */
  @js.native
  trait ListTagsForResourcesResponse extends js.Object {
    var ResourceTagSets: ResourceTagSetList
  }

  object ListTagsForResourcesResponse {
    def apply(
      ResourceTagSets: js.UndefOr[ResourceTagSetList] = js.undefined
    ): ListTagsForResourcesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ResourceTagSets" -> ResourceTagSets.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourcesResponse]
    }
  }

  /**
   * <p>A complex type that contains the information about the request to list the traffic policies that are associated with the current AWS account.</p>
   */
  @js.native
  trait ListTrafficPoliciesRequest extends js.Object {
    var TrafficPolicyIdMarker: TrafficPolicyId
    var MaxItems: PageMaxItems
  }

  object ListTrafficPoliciesRequest {
    def apply(
      TrafficPolicyIdMarker: js.UndefOr[TrafficPolicyId] = js.undefined,
      MaxItems: js.UndefOr[PageMaxItems] = js.undefined
    ): ListTrafficPoliciesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TrafficPolicyIdMarker" -> TrafficPolicyIdMarker.map { x => x: js.Any }),
        ("MaxItems" -> MaxItems.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTrafficPoliciesRequest]
    }
  }

  /**
   * <p>A complex type that contains the response information for the request.</p>
   */
  @js.native
  trait ListTrafficPoliciesResponse extends js.Object {
    var TrafficPolicySummaries: TrafficPolicySummaries
    var IsTruncated: PageTruncated
    var TrafficPolicyIdMarker: TrafficPolicyId
    var MaxItems: PageMaxItems
  }

  object ListTrafficPoliciesResponse {
    def apply(
      TrafficPolicySummaries: js.UndefOr[TrafficPolicySummaries] = js.undefined,
      IsTruncated: js.UndefOr[PageTruncated] = js.undefined,
      TrafficPolicyIdMarker: js.UndefOr[TrafficPolicyId] = js.undefined,
      MaxItems: js.UndefOr[PageMaxItems] = js.undefined
    ): ListTrafficPoliciesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TrafficPolicySummaries" -> TrafficPolicySummaries.map { x => x: js.Any }),
        ("IsTruncated" -> IsTruncated.map { x => x: js.Any }),
        ("TrafficPolicyIdMarker" -> TrafficPolicyIdMarker.map { x => x: js.Any }),
        ("MaxItems" -> MaxItems.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTrafficPoliciesResponse]
    }
  }

  /**
   * <p>A request for the traffic policy instances that you created in a specified hosted zone.</p>
   */
  @js.native
  trait ListTrafficPolicyInstancesByHostedZoneRequest extends js.Object {
    var HostedZoneId: ResourceId
    var TrafficPolicyInstanceNameMarker: DNSName
    var TrafficPolicyInstanceTypeMarker: RRType
    var MaxItems: PageMaxItems
  }

  object ListTrafficPolicyInstancesByHostedZoneRequest {
    def apply(
      HostedZoneId: js.UndefOr[ResourceId] = js.undefined,
      TrafficPolicyInstanceNameMarker: js.UndefOr[DNSName] = js.undefined,
      TrafficPolicyInstanceTypeMarker: js.UndefOr[RRType] = js.undefined,
      MaxItems: js.UndefOr[PageMaxItems] = js.undefined
    ): ListTrafficPolicyInstancesByHostedZoneRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("HostedZoneId" -> HostedZoneId.map { x => x: js.Any }),
        ("TrafficPolicyInstanceNameMarker" -> TrafficPolicyInstanceNameMarker.map { x => x: js.Any }),
        ("TrafficPolicyInstanceTypeMarker" -> TrafficPolicyInstanceTypeMarker.map { x => x: js.Any }),
        ("MaxItems" -> MaxItems.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTrafficPolicyInstancesByHostedZoneRequest]
    }
  }

  /**
   * <p>A complex type that contains the response information for the request.</p>
   */
  @js.native
  trait ListTrafficPolicyInstancesByHostedZoneResponse extends js.Object {
    var IsTruncated: PageTruncated
    var TrafficPolicyInstanceTypeMarker: RRType
    var MaxItems: PageMaxItems
    var TrafficPolicyInstances: TrafficPolicyInstances
    var TrafficPolicyInstanceNameMarker: DNSName
  }

  object ListTrafficPolicyInstancesByHostedZoneResponse {
    def apply(
      IsTruncated: js.UndefOr[PageTruncated] = js.undefined,
      TrafficPolicyInstanceTypeMarker: js.UndefOr[RRType] = js.undefined,
      MaxItems: js.UndefOr[PageMaxItems] = js.undefined,
      TrafficPolicyInstances: js.UndefOr[TrafficPolicyInstances] = js.undefined,
      TrafficPolicyInstanceNameMarker: js.UndefOr[DNSName] = js.undefined
    ): ListTrafficPolicyInstancesByHostedZoneResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IsTruncated" -> IsTruncated.map { x => x: js.Any }),
        ("TrafficPolicyInstanceTypeMarker" -> TrafficPolicyInstanceTypeMarker.map { x => x: js.Any }),
        ("MaxItems" -> MaxItems.map { x => x: js.Any }),
        ("TrafficPolicyInstances" -> TrafficPolicyInstances.map { x => x: js.Any }),
        ("TrafficPolicyInstanceNameMarker" -> TrafficPolicyInstanceNameMarker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTrafficPolicyInstancesByHostedZoneResponse]
    }
  }

  /**
   * <p>A complex type that contains the information about the request to list your traffic policy instances.</p>
   */
  @js.native
  trait ListTrafficPolicyInstancesByPolicyRequest extends js.Object {
    var TrafficPolicyInstanceTypeMarker: RRType
    var TrafficPolicyVersion: TrafficPolicyVersion
    var MaxItems: PageMaxItems
    var TrafficPolicyId: TrafficPolicyId
    var HostedZoneIdMarker: ResourceId
    var TrafficPolicyInstanceNameMarker: DNSName
  }

  object ListTrafficPolicyInstancesByPolicyRequest {
    def apply(
      TrafficPolicyInstanceTypeMarker: js.UndefOr[RRType] = js.undefined,
      TrafficPolicyVersion: js.UndefOr[TrafficPolicyVersion] = js.undefined,
      MaxItems: js.UndefOr[PageMaxItems] = js.undefined,
      TrafficPolicyId: js.UndefOr[TrafficPolicyId] = js.undefined,
      HostedZoneIdMarker: js.UndefOr[ResourceId] = js.undefined,
      TrafficPolicyInstanceNameMarker: js.UndefOr[DNSName] = js.undefined
    ): ListTrafficPolicyInstancesByPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TrafficPolicyInstanceTypeMarker" -> TrafficPolicyInstanceTypeMarker.map { x => x: js.Any }),
        ("TrafficPolicyVersion" -> TrafficPolicyVersion.map { x => x: js.Any }),
        ("MaxItems" -> MaxItems.map { x => x: js.Any }),
        ("TrafficPolicyId" -> TrafficPolicyId.map { x => x: js.Any }),
        ("HostedZoneIdMarker" -> HostedZoneIdMarker.map { x => x: js.Any }),
        ("TrafficPolicyInstanceNameMarker" -> TrafficPolicyInstanceNameMarker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTrafficPolicyInstancesByPolicyRequest]
    }
  }

  /**
   * <p>A complex type that contains the response information for the request.</p>
   */
  @js.native
  trait ListTrafficPolicyInstancesByPolicyResponse extends js.Object {
    var IsTruncated: PageTruncated
    var TrafficPolicyInstanceTypeMarker: RRType
    var MaxItems: PageMaxItems
    var TrafficPolicyInstances: TrafficPolicyInstances
    var HostedZoneIdMarker: ResourceId
    var TrafficPolicyInstanceNameMarker: DNSName
  }

  object ListTrafficPolicyInstancesByPolicyResponse {
    def apply(
      IsTruncated: js.UndefOr[PageTruncated] = js.undefined,
      TrafficPolicyInstanceTypeMarker: js.UndefOr[RRType] = js.undefined,
      MaxItems: js.UndefOr[PageMaxItems] = js.undefined,
      TrafficPolicyInstances: js.UndefOr[TrafficPolicyInstances] = js.undefined,
      HostedZoneIdMarker: js.UndefOr[ResourceId] = js.undefined,
      TrafficPolicyInstanceNameMarker: js.UndefOr[DNSName] = js.undefined
    ): ListTrafficPolicyInstancesByPolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IsTruncated" -> IsTruncated.map { x => x: js.Any }),
        ("TrafficPolicyInstanceTypeMarker" -> TrafficPolicyInstanceTypeMarker.map { x => x: js.Any }),
        ("MaxItems" -> MaxItems.map { x => x: js.Any }),
        ("TrafficPolicyInstances" -> TrafficPolicyInstances.map { x => x: js.Any }),
        ("HostedZoneIdMarker" -> HostedZoneIdMarker.map { x => x: js.Any }),
        ("TrafficPolicyInstanceNameMarker" -> TrafficPolicyInstanceNameMarker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTrafficPolicyInstancesByPolicyResponse]
    }
  }

  /**
   * <p>A complex type that contains the information about the request to list your traffic policy instances.</p>
   */
  @js.native
  trait ListTrafficPolicyInstancesRequest extends js.Object {
    var HostedZoneIdMarker: ResourceId
    var TrafficPolicyInstanceNameMarker: DNSName
    var TrafficPolicyInstanceTypeMarker: RRType
    var MaxItems: PageMaxItems
  }

  object ListTrafficPolicyInstancesRequest {
    def apply(
      HostedZoneIdMarker: js.UndefOr[ResourceId] = js.undefined,
      TrafficPolicyInstanceNameMarker: js.UndefOr[DNSName] = js.undefined,
      TrafficPolicyInstanceTypeMarker: js.UndefOr[RRType] = js.undefined,
      MaxItems: js.UndefOr[PageMaxItems] = js.undefined
    ): ListTrafficPolicyInstancesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("HostedZoneIdMarker" -> HostedZoneIdMarker.map { x => x: js.Any }),
        ("TrafficPolicyInstanceNameMarker" -> TrafficPolicyInstanceNameMarker.map { x => x: js.Any }),
        ("TrafficPolicyInstanceTypeMarker" -> TrafficPolicyInstanceTypeMarker.map { x => x: js.Any }),
        ("MaxItems" -> MaxItems.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTrafficPolicyInstancesRequest]
    }
  }

  /**
   * <p>A complex type that contains the response information for the request.</p>
   */
  @js.native
  trait ListTrafficPolicyInstancesResponse extends js.Object {
    var IsTruncated: PageTruncated
    var TrafficPolicyInstanceTypeMarker: RRType
    var MaxItems: PageMaxItems
    var TrafficPolicyInstances: TrafficPolicyInstances
    var HostedZoneIdMarker: ResourceId
    var TrafficPolicyInstanceNameMarker: DNSName
  }

  object ListTrafficPolicyInstancesResponse {
    def apply(
      IsTruncated: js.UndefOr[PageTruncated] = js.undefined,
      TrafficPolicyInstanceTypeMarker: js.UndefOr[RRType] = js.undefined,
      MaxItems: js.UndefOr[PageMaxItems] = js.undefined,
      TrafficPolicyInstances: js.UndefOr[TrafficPolicyInstances] = js.undefined,
      HostedZoneIdMarker: js.UndefOr[ResourceId] = js.undefined,
      TrafficPolicyInstanceNameMarker: js.UndefOr[DNSName] = js.undefined
    ): ListTrafficPolicyInstancesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IsTruncated" -> IsTruncated.map { x => x: js.Any }),
        ("TrafficPolicyInstanceTypeMarker" -> TrafficPolicyInstanceTypeMarker.map { x => x: js.Any }),
        ("MaxItems" -> MaxItems.map { x => x: js.Any }),
        ("TrafficPolicyInstances" -> TrafficPolicyInstances.map { x => x: js.Any }),
        ("HostedZoneIdMarker" -> HostedZoneIdMarker.map { x => x: js.Any }),
        ("TrafficPolicyInstanceNameMarker" -> TrafficPolicyInstanceNameMarker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTrafficPolicyInstancesResponse]
    }
  }

  /**
   * <p>A complex type that contains the information about the request to list your traffic policies.</p>
   */
  @js.native
  trait ListTrafficPolicyVersionsRequest extends js.Object {
    var Id: TrafficPolicyId
    var TrafficPolicyVersionMarker: TrafficPolicyVersionMarker
    var MaxItems: PageMaxItems
  }

  object ListTrafficPolicyVersionsRequest {
    def apply(
      Id: js.UndefOr[TrafficPolicyId] = js.undefined,
      TrafficPolicyVersionMarker: js.UndefOr[TrafficPolicyVersionMarker] = js.undefined,
      MaxItems: js.UndefOr[PageMaxItems] = js.undefined
    ): ListTrafficPolicyVersionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Id" -> Id.map { x => x: js.Any }),
        ("TrafficPolicyVersionMarker" -> TrafficPolicyVersionMarker.map { x => x: js.Any }),
        ("MaxItems" -> MaxItems.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTrafficPolicyVersionsRequest]
    }
  }

  /**
   * <p>A complex type that contains the response information for the request.</p>
   */
  @js.native
  trait ListTrafficPolicyVersionsResponse extends js.Object {
    var TrafficPolicies: TrafficPolicies
    var IsTruncated: PageTruncated
    var TrafficPolicyVersionMarker: TrafficPolicyVersionMarker
    var MaxItems: PageMaxItems
  }

  object ListTrafficPolicyVersionsResponse {
    def apply(
      TrafficPolicies: js.UndefOr[TrafficPolicies] = js.undefined,
      IsTruncated: js.UndefOr[PageTruncated] = js.undefined,
      TrafficPolicyVersionMarker: js.UndefOr[TrafficPolicyVersionMarker] = js.undefined,
      MaxItems: js.UndefOr[PageMaxItems] = js.undefined
    ): ListTrafficPolicyVersionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TrafficPolicies" -> TrafficPolicies.map { x => x: js.Any }),
        ("IsTruncated" -> IsTruncated.map { x => x: js.Any }),
        ("TrafficPolicyVersionMarker" -> TrafficPolicyVersionMarker.map { x => x: js.Any }),
        ("MaxItems" -> MaxItems.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTrafficPolicyVersionsResponse]
    }
  }

  /**
   * <p>A complex type that contains information about that can be associated with your hosted zone.</p>
   */
  @js.native
  trait ListVPCAssociationAuthorizationsRequest extends js.Object {
    var HostedZoneId: ResourceId
    var NextToken: PaginationToken
    var MaxResults: MaxResults
  }

  object ListVPCAssociationAuthorizationsRequest {
    def apply(
      HostedZoneId: js.UndefOr[ResourceId] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined
    ): ListVPCAssociationAuthorizationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("HostedZoneId" -> HostedZoneId.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any }),
        ("MaxResults" -> MaxResults.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListVPCAssociationAuthorizationsRequest]
    }
  }

  /**
   * <p>A complex type that contains the response information for the request.</p>
   */
  @js.native
  trait ListVPCAssociationAuthorizationsResponse extends js.Object {
    var HostedZoneId: ResourceId
    var NextToken: PaginationToken
    var VPCs: VPCs
  }

  object ListVPCAssociationAuthorizationsResponse {
    def apply(
      HostedZoneId: js.UndefOr[ResourceId] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined,
      VPCs: js.UndefOr[VPCs] = js.undefined
    ): ListVPCAssociationAuthorizationsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("HostedZoneId" -> HostedZoneId.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any }),
        ("VPCs" -> VPCs.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListVPCAssociationAuthorizationsResponse]
    }
  }

  /**
   * <p>A change with the specified change ID does not exist.</p>
   */
  @js.native
  trait NoSuchChangeException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>A reusable delegation set with the specified ID does not exist.</p>
   */
  @js.native
  trait NoSuchDelegationSetException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>Amazon Route 53 doesn't support the specified geolocation.</p>
   */
  @js.native
  trait NoSuchGeoLocationException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>No health check exists with the ID that you specified in the <code>DeleteHealthCheck</code> request.</p>
   */
  @js.native
  trait NoSuchHealthCheckException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>No hosted zone exists with the ID that you specified.</p>
   */
  @js.native
  trait NoSuchHostedZoneException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>No traffic policy exists with the specified ID.</p>
   */
  @js.native
  trait NoSuchTrafficPolicyException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>No traffic policy instance exists with the specified ID.</p>
   */
  @js.native
  trait NoSuchTrafficPolicyInstanceException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>Associating the specified VPC with the specified hosted zone has not been authorized.</p>
   */
  @js.native
  trait NotAuthorizedExceptionException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>If Amazon Route 53 can't process a request before the next request arrives, it will reject subsequent requests for the same hosted zone and return an <code>HTTP 400 error</code> (<code>Bad request</code>). If Amazon Route 53 returns this error repeatedly for the same request, we recommend that you wait, in intervals of increasing duration, before you try the request again.</p>
   */
  @js.native
  trait PriorRequestNotCompleteException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>You're trying to associate a VPC with a public hosted zone. Amazon Route 53 doesn't support associating a VPC with a public hosted zone.</p>
   */
  @js.native
  trait PublicZoneVPCAssociationException extends js.Object {
    var message: ErrorMessage
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

    val values = IndexedSeq(SOA, A, TXT, NS, CNAME, MX, NAPTR, PTR, SRV, SPF, AAAA)
  }

  /**
   * <p>Information specific to the resource record.</p> <note> <p>If you are creating an alias resource record set, omit <code>ResourceRecord</code>.</p> </note>
   */
  @js.native
  trait ResourceRecord extends js.Object {
    var Value: RData
  }

  object ResourceRecord {
    def apply(
      Value: js.UndefOr[RData] = js.undefined
    ): ResourceRecord = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Value" -> Value.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceRecord]
    }
  }

  /**
   * <p>Information about the resource record set to create or delete.</p>
   */
  @js.native
  trait ResourceRecordSet extends js.Object {
    var Name: DNSName
    var TrafficPolicyInstanceId: TrafficPolicyInstanceId
    var AliasTarget: AliasTarget
    var HealthCheckId: HealthCheckId
    var Region: ResourceRecordSetRegion
    var Weight: ResourceRecordSetWeight
    var ResourceRecords: ResourceRecords
    var Failover: ResourceRecordSetFailover
    var GeoLocation: GeoLocation
    var SetIdentifier: ResourceRecordSetIdentifier
    var TTL: TTL
    var Type: RRType
  }

  object ResourceRecordSet {
    def apply(
      Name: js.UndefOr[DNSName] = js.undefined,
      TrafficPolicyInstanceId: js.UndefOr[TrafficPolicyInstanceId] = js.undefined,
      AliasTarget: js.UndefOr[AliasTarget] = js.undefined,
      HealthCheckId: js.UndefOr[HealthCheckId] = js.undefined,
      Region: js.UndefOr[ResourceRecordSetRegion] = js.undefined,
      Weight: js.UndefOr[ResourceRecordSetWeight] = js.undefined,
      ResourceRecords: js.UndefOr[ResourceRecords] = js.undefined,
      Failover: js.UndefOr[ResourceRecordSetFailover] = js.undefined,
      GeoLocation: js.UndefOr[GeoLocation] = js.undefined,
      SetIdentifier: js.UndefOr[ResourceRecordSetIdentifier] = js.undefined,
      TTL: js.UndefOr[TTL] = js.undefined,
      Type: js.UndefOr[RRType] = js.undefined
    ): ResourceRecordSet = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("TrafficPolicyInstanceId" -> TrafficPolicyInstanceId.map { x => x: js.Any }),
        ("AliasTarget" -> AliasTarget.map { x => x: js.Any }),
        ("HealthCheckId" -> HealthCheckId.map { x => x: js.Any }),
        ("Region" -> Region.map { x => x: js.Any }),
        ("Weight" -> Weight.map { x => x: js.Any }),
        ("ResourceRecords" -> ResourceRecords.map { x => x: js.Any }),
        ("Failover" -> Failover.map { x => x: js.Any }),
        ("GeoLocation" -> GeoLocation.map { x => x: js.Any }),
        ("SetIdentifier" -> SetIdentifier.map { x => x: js.Any }),
        ("TTL" -> TTL.map { x => x: js.Any }),
        ("Type" -> Type.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    val `eu-central-1` = "eu-central-1"
    val `ap-southeast-1` = "ap-southeast-1"
    val `ap-southeast-2` = "ap-southeast-2"
    val `ap-northeast-1` = "ap-northeast-1"
    val `ap-northeast-2` = "ap-northeast-2"
    val `sa-east-1` = "sa-east-1"
    val `cn-north-1` = "cn-north-1"
    val `ap-south-1` = "ap-south-1"

    val values = IndexedSeq(`us-east-1`, `us-east-2`, `us-west-1`, `us-west-2`, `ca-central-1`, `eu-west-1`, `eu-west-2`, `eu-central-1`, `ap-southeast-1`, `ap-southeast-2`, `ap-northeast-1`, `ap-northeast-2`, `sa-east-1`, `cn-north-1`, `ap-south-1`)
  }

  /**
   * <p>A complex type containing a resource and its associated tags.</p>
   */
  @js.native
  trait ResourceTagSet extends js.Object {
    var ResourceType: TagResourceType
    var ResourceId: TagResourceId
    var Tags: TagList
  }

  object ResourceTagSet {
    def apply(
      ResourceType: js.UndefOr[TagResourceType] = js.undefined,
      ResourceId: js.UndefOr[TagResourceId] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined
    ): ResourceTagSet = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ResourceType" -> ResourceType.map { x => x: js.Any }),
        ("ResourceId" -> ResourceId.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceTagSet]
    }
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
    var Status: Status
    var CheckedTime: TimeStamp
  }

  object StatusReport {
    def apply(
      Status: js.UndefOr[Status] = js.undefined,
      CheckedTime: js.UndefOr[TimeStamp] = js.undefined
    ): StatusReport = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Status" -> Status.map { x => x: js.Any }),
        ("CheckedTime" -> CheckedTime.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StatusReport]
    }
  }

  /**
   * <p>A complex type that contains information about a tag that you want to add or edit for the specified health check or hosted zone.</p>
   */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  object Tag {
    def apply(
      Key: js.UndefOr[TagKey] = js.undefined,
      Value: js.UndefOr[TagValue] = js.undefined
    ): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Key" -> Key.map { x => x: js.Any }),
        ("Value" -> Value.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }


  object TagResourceTypeEnum {
    val healthcheck = "healthcheck"
    val hostedzone = "hostedzone"

    val values = IndexedSeq(healthcheck, hostedzone)
  }

  /**
   * <p>Gets the value that Amazon Route 53 returns in response to a DNS request for a specified record name and type. You can optionally specify the IP address of a DNS resolver, an EDNS0 client subnet IP address, and a subnet mask. </p> <p> <b>Parameters</b> </p> <dl> <dt>hostedzoneid</dt> <dd> <p>The ID of the hosted zone that you want Amazon Route 53 to simulate a query for.</p> </dd> <dt>recordname</dt> <dd> <p>The name of the resource record set that you want Amazon Route 53 to simulate a query for.</p> </dd> <dt>recordtype</dt> <dd> <p>The type of the resource record set.</p> </dd> <dt>resolverip (optional)</dt> <dd> <p>If you want to simulate a request from a specific DNS resolver, specify the IP address for that resolver. If you omit this value, <code>TestDNSAnswer</code> uses the IP address of a DNS resolver in the AWS US East region. </p> </dd> <dt>edns0clientsubnetip (optional)</dt> <dd> <p>If the resolver that you specified for <code>resolverip</code> supports EDNS0, specify the IP address of a client in the applicable location. </p> </dd> <dt>edns0clientsubnetmask (optional)</dt> <dd> <p>If you specify an IP address for <code>edns0clientsubnetip</code>, you can optionally specify the number of bits of the IP address that you want the checking tool to include in the DNS query. For example, if you specify <code>192.0.2.44</code> for <code>edns0clientsubnetip</code> and <code>24</code> for <code>edns0clientsubnetmask</code>, the checking tool will simulate a request from <code>192.0.2.0/24</code>. The default value is 24 bits. </p> </dd> </dl>
   */
  @js.native
  trait TestDNSAnswerRequest extends js.Object {
    var EDNS0ClientSubnetIP: IPAddress
    var RecordName: DNSName
    var EDNS0ClientSubnetMask: SubnetMask
    var RecordType: RRType
    var ResolverIP: IPAddress
    var HostedZoneId: ResourceId
  }

  object TestDNSAnswerRequest {
    def apply(
      EDNS0ClientSubnetIP: js.UndefOr[IPAddress] = js.undefined,
      RecordName: js.UndefOr[DNSName] = js.undefined,
      EDNS0ClientSubnetMask: js.UndefOr[SubnetMask] = js.undefined,
      RecordType: js.UndefOr[RRType] = js.undefined,
      ResolverIP: js.UndefOr[IPAddress] = js.undefined,
      HostedZoneId: js.UndefOr[ResourceId] = js.undefined
    ): TestDNSAnswerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("EDNS0ClientSubnetIP" -> EDNS0ClientSubnetIP.map { x => x: js.Any }),
        ("RecordName" -> RecordName.map { x => x: js.Any }),
        ("EDNS0ClientSubnetMask" -> EDNS0ClientSubnetMask.map { x => x: js.Any }),
        ("RecordType" -> RecordType.map { x => x: js.Any }),
        ("ResolverIP" -> ResolverIP.map { x => x: js.Any }),
        ("HostedZoneId" -> HostedZoneId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TestDNSAnswerRequest]
    }
  }

  /**
   * <p>A complex type that contains the response to a <code>TestDNSAnswer</code> request. </p>
   */
  @js.native
  trait TestDNSAnswerResponse extends js.Object {
    var RecordName: DNSName
    var ResponseCode: DNSRCode
    var RecordData: RecordData
    var Nameserver: Nameserver
    var Protocol: TransportProtocol
    var RecordType: RRType
  }

  object TestDNSAnswerResponse {
    def apply(
      RecordName: js.UndefOr[DNSName] = js.undefined,
      ResponseCode: js.UndefOr[DNSRCode] = js.undefined,
      RecordData: js.UndefOr[RecordData] = js.undefined,
      Nameserver: js.UndefOr[Nameserver] = js.undefined,
      Protocol: js.UndefOr[TransportProtocol] = js.undefined,
      RecordType: js.UndefOr[RRType] = js.undefined
    ): TestDNSAnswerResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("RecordName" -> RecordName.map { x => x: js.Any }),
        ("ResponseCode" -> ResponseCode.map { x => x: js.Any }),
        ("RecordData" -> RecordData.map { x => x: js.Any }),
        ("Nameserver" -> Nameserver.map { x => x: js.Any }),
        ("Protocol" -> Protocol.map { x => x: js.Any }),
        ("RecordType" -> RecordType.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TestDNSAnswerResponse]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait ThrottlingExceptionException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>You have reached the maximum number of active health checks for an AWS account. The default limit is 100. To request a higher limit, <a href="http://aws.amazon.com/route53-request">create a case</a> with the AWS Support Center.</p>
   */
  @js.native
  trait TooManyHealthChecksException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>This hosted zone can't be created because the hosted zone limit is exceeded. To request a limit increase, go to the Amazon Route 53 <a href="http://aws.amazon.com/route53-request/">Contact Us</a> page.</p>
   */
  @js.native
  trait TooManyHostedZonesException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>You've created the maximum number of traffic policies that can be created for the current AWS account. You can request an increase to the limit on the <a href="http://aws.amazon.com/route53-request/">Contact Us</a> page.</p>
   */
  @js.native
  trait TooManyTrafficPoliciesException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>You've created the maximum number of traffic policy instances that can be created for the current AWS account. You can request an increase to the limit on the <a href="http://aws.amazon.com/route53-request/">Contact Us</a> page.</p>
   */
  @js.native
  trait TooManyTrafficPolicyInstancesException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>You've created the maximum number of authorizations that can be created for the specified hosted zone. To authorize another VPC to be associated with the hosted zone, submit a <code>DeleteVPCAssociationAuthorization</code> request to remove an existing authorization. To get a list of existing authorizations, submit a <code>ListVPCAssociationAuthorizations</code> request.</p>
   */
  @js.native
  trait TooManyVPCAssociationAuthorizationsException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>A complex type that contains settings for a traffic policy.</p>
   */
  @js.native
  trait TrafficPolicy extends js.Object {
    var Id: TrafficPolicyId
    var Name: TrafficPolicyName
    var Version: TrafficPolicyVersion
    var Comment: TrafficPolicyComment
    var Type: RRType
    var Document: TrafficPolicyDocument
  }

  object TrafficPolicy {
    def apply(
      Id: js.UndefOr[TrafficPolicyId] = js.undefined,
      Name: js.UndefOr[TrafficPolicyName] = js.undefined,
      Version: js.UndefOr[TrafficPolicyVersion] = js.undefined,
      Comment: js.UndefOr[TrafficPolicyComment] = js.undefined,
      Type: js.UndefOr[RRType] = js.undefined,
      Document: js.UndefOr[TrafficPolicyDocument] = js.undefined
    ): TrafficPolicy = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Id" -> Id.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("Version" -> Version.map { x => x: js.Any }),
        ("Comment" -> Comment.map { x => x: js.Any }),
        ("Type" -> Type.map { x => x: js.Any }),
        ("Document" -> Document.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TrafficPolicy]
    }
  }

  /**
   * <p>A traffic policy that has the same value for <code>Name</code> already exists.</p>
   */
  @js.native
  trait TrafficPolicyAlreadyExistsException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>One or more traffic policy instances were created by using the specified traffic policy.</p>
   */
  @js.native
  trait TrafficPolicyInUseException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>A complex type that contains settings for the new traffic policy instance.</p>
   */
  @js.native
  trait TrafficPolicyInstance extends js.Object {
    var Id: TrafficPolicyInstanceId
    var Name: DNSName
    var TrafficPolicyVersion: TrafficPolicyVersion
    var TrafficPolicyId: TrafficPolicyId
    var Message: Message
    var TrafficPolicyType: RRType
    var State: TrafficPolicyInstanceState
    var TTL: TTL
    var HostedZoneId: ResourceId
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
      HostedZoneId: js.UndefOr[ResourceId] = js.undefined
    ): TrafficPolicyInstance = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Id" -> Id.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("TrafficPolicyVersion" -> TrafficPolicyVersion.map { x => x: js.Any }),
        ("TrafficPolicyId" -> TrafficPolicyId.map { x => x: js.Any }),
        ("Message" -> Message.map { x => x: js.Any }),
        ("TrafficPolicyType" -> TrafficPolicyType.map { x => x: js.Any }),
        ("State" -> State.map { x => x: js.Any }),
        ("TTL" -> TTL.map { x => x: js.Any }),
        ("HostedZoneId" -> HostedZoneId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TrafficPolicyInstance]
    }
  }

  /**
   * <p>Traffic policy instance with given Id already exists.</p>
   */
  @js.native
  trait TrafficPolicyInstanceAlreadyExistsException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>A complex type that contains information about the latest version of one traffic policy that is associated with the current AWS account.</p>
   */
  @js.native
  trait TrafficPolicySummary extends js.Object {
    var Id: TrafficPolicyId
    var Name: TrafficPolicyName
    var LatestVersion: TrafficPolicyVersion
    var TrafficPolicyCount: TrafficPolicyVersion
    var Type: RRType
  }

  object TrafficPolicySummary {
    def apply(
      Id: js.UndefOr[TrafficPolicyId] = js.undefined,
      Name: js.UndefOr[TrafficPolicyName] = js.undefined,
      LatestVersion: js.UndefOr[TrafficPolicyVersion] = js.undefined,
      TrafficPolicyCount: js.UndefOr[TrafficPolicyVersion] = js.undefined,
      Type: js.UndefOr[RRType] = js.undefined
    ): TrafficPolicySummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Id" -> Id.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("LatestVersion" -> LatestVersion.map { x => x: js.Any }),
        ("TrafficPolicyCount" -> TrafficPolicyCount.map { x => x: js.Any }),
        ("Type" -> Type.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TrafficPolicySummary]
    }
  }

  /**
   * <p>A complex type that contains the health check request information.</p>
   */
  @js.native
  trait UpdateHealthCheckRequest extends js.Object {
    var IPAddress: IPAddress
    var HealthCheckId: HealthCheckId
    var HealthCheckVersion: HealthCheckVersion
    var ResourcePath: ResourcePath
    var Regions: HealthCheckRegionList
    var AlarmIdentifier: AlarmIdentifier
    var FullyQualifiedDomainName: FullyQualifiedDomainName
    var SearchString: SearchString
    var EnableSNI: EnableSNI
    var InsufficientDataHealthStatus: InsufficientDataHealthStatus
    var Port: Port
    var Inverted: Inverted
    var FailureThreshold: FailureThreshold
    var ChildHealthChecks: ChildHealthCheckList
    var HealthThreshold: HealthThreshold
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
      Inverted: js.UndefOr[Inverted] = js.undefined,
      FailureThreshold: js.UndefOr[FailureThreshold] = js.undefined,
      ChildHealthChecks: js.UndefOr[ChildHealthCheckList] = js.undefined,
      HealthThreshold: js.UndefOr[HealthThreshold] = js.undefined
    ): UpdateHealthCheckRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IPAddress" -> IPAddress.map { x => x: js.Any }),
        ("HealthCheckId" -> HealthCheckId.map { x => x: js.Any }),
        ("HealthCheckVersion" -> HealthCheckVersion.map { x => x: js.Any }),
        ("ResourcePath" -> ResourcePath.map { x => x: js.Any }),
        ("Regions" -> Regions.map { x => x: js.Any }),
        ("AlarmIdentifier" -> AlarmIdentifier.map { x => x: js.Any }),
        ("FullyQualifiedDomainName" -> FullyQualifiedDomainName.map { x => x: js.Any }),
        ("SearchString" -> SearchString.map { x => x: js.Any }),
        ("EnableSNI" -> EnableSNI.map { x => x: js.Any }),
        ("InsufficientDataHealthStatus" -> InsufficientDataHealthStatus.map { x => x: js.Any }),
        ("Port" -> Port.map { x => x: js.Any }),
        ("Inverted" -> Inverted.map { x => x: js.Any }),
        ("FailureThreshold" -> FailureThreshold.map { x => x: js.Any }),
        ("ChildHealthChecks" -> ChildHealthChecks.map { x => x: js.Any }),
        ("HealthThreshold" -> HealthThreshold.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateHealthCheckRequest]
    }
  }

  @js.native
  trait UpdateHealthCheckResponse extends js.Object {
    var HealthCheck: HealthCheck
  }

  object UpdateHealthCheckResponse {
    def apply(
      HealthCheck: js.UndefOr[HealthCheck] = js.undefined
    ): UpdateHealthCheckResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("HealthCheck" -> HealthCheck.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateHealthCheckResponse]
    }
  }

  /**
   * <p>A complex type that contains the hosted zone request information.</p>
   */
  @js.native
  trait UpdateHostedZoneCommentRequest extends js.Object {
    var Id: ResourceId
    var Comment: ResourceDescription
  }

  object UpdateHostedZoneCommentRequest {
    def apply(
      Id: js.UndefOr[ResourceId] = js.undefined,
      Comment: js.UndefOr[ResourceDescription] = js.undefined
    ): UpdateHostedZoneCommentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Id" -> Id.map { x => x: js.Any }),
        ("Comment" -> Comment.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateHostedZoneCommentRequest]
    }
  }

  /**
   * <p>A complex type that contains the response to the UpdateHostedZoneCommentRequest.</p>
   */
  @js.native
  trait UpdateHostedZoneCommentResponse extends js.Object {
    var HostedZone: HostedZone
  }

  object UpdateHostedZoneCommentResponse {
    def apply(
      HostedZone: js.UndefOr[HostedZone] = js.undefined
    ): UpdateHostedZoneCommentResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("HostedZone" -> HostedZone.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateHostedZoneCommentResponse]
    }
  }

  /**
   * <p>A complex type that contains information about the traffic policy for which you want to update the comment.</p>
   */
  @js.native
  trait UpdateTrafficPolicyCommentRequest extends js.Object {
    var Id: TrafficPolicyId
    var Version: TrafficPolicyVersion
    var Comment: TrafficPolicyComment
  }

  object UpdateTrafficPolicyCommentRequest {
    def apply(
      Id: js.UndefOr[TrafficPolicyId] = js.undefined,
      Version: js.UndefOr[TrafficPolicyVersion] = js.undefined,
      Comment: js.UndefOr[TrafficPolicyComment] = js.undefined
    ): UpdateTrafficPolicyCommentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Id" -> Id.map { x => x: js.Any }),
        ("Version" -> Version.map { x => x: js.Any }),
        ("Comment" -> Comment.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateTrafficPolicyCommentRequest]
    }
  }

  /**
   * <p>A complex type that contains the response information for the traffic policy.</p>
   */
  @js.native
  trait UpdateTrafficPolicyCommentResponse extends js.Object {
    var TrafficPolicy: TrafficPolicy
  }

  object UpdateTrafficPolicyCommentResponse {
    def apply(
      TrafficPolicy: js.UndefOr[TrafficPolicy] = js.undefined
    ): UpdateTrafficPolicyCommentResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TrafficPolicy" -> TrafficPolicy.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateTrafficPolicyCommentResponse]
    }
  }

  /**
   * <p>A complex type that contains information about the resource record sets that you want to update based on a specified traffic policy instance.</p>
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
      Id: js.UndefOr[TrafficPolicyInstanceId] = js.undefined,
      TTL: js.UndefOr[TTL] = js.undefined,
      TrafficPolicyId: js.UndefOr[TrafficPolicyId] = js.undefined,
      TrafficPolicyVersion: js.UndefOr[TrafficPolicyVersion] = js.undefined
    ): UpdateTrafficPolicyInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Id" -> Id.map { x => x: js.Any }),
        ("TTL" -> TTL.map { x => x: js.Any }),
        ("TrafficPolicyId" -> TrafficPolicyId.map { x => x: js.Any }),
        ("TrafficPolicyVersion" -> TrafficPolicyVersion.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateTrafficPolicyInstanceRequest]
    }
  }

  /**
   * <p>A complex type that contains information about the resource record sets that Amazon Route 53 created based on a specified traffic policy.</p>
   */
  @js.native
  trait UpdateTrafficPolicyInstanceResponse extends js.Object {
    var TrafficPolicyInstance: TrafficPolicyInstance
  }

  object UpdateTrafficPolicyInstanceResponse {
    def apply(
      TrafficPolicyInstance: js.UndefOr[TrafficPolicyInstance] = js.undefined
    ): UpdateTrafficPolicyInstanceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TrafficPolicyInstance" -> TrafficPolicyInstance.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateTrafficPolicyInstanceResponse]
    }
  }

  /**
   * <p>A complex type that contains information about an Amazon VPC that is associated with a private hosted zone.</p>
   */
  @js.native
  trait VPC extends js.Object {
    var VPCRegion: VPCRegion
    var VPCId: VPCId
  }

  object VPC {
    def apply(
      VPCRegion: js.UndefOr[VPCRegion] = js.undefined,
      VPCId: js.UndefOr[VPCId] = js.undefined
    ): VPC = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VPCRegion" -> VPCRegion.map { x => x: js.Any }),
        ("VPCId" -> VPCId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VPC]
    }
  }

  /**
   * <p>The VPC that you specified is not authorized to be associated with the hosted zone.</p>
   */
  @js.native
  trait VPCAssociationAuthorizationNotFoundException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>The specified VPC and hosted zone are not currently associated.</p>
   */
  @js.native
  trait VPCAssociationNotFoundException extends js.Object {
    var message: ErrorMessage
  }


  object VPCRegionEnum {
    val `us-east-1` = "us-east-1"
    val `us-east-2` = "us-east-2"
    val `us-west-1` = "us-west-1"
    val `us-west-2` = "us-west-2"
    val `eu-west-1` = "eu-west-1"
    val `eu-west-2` = "eu-west-2"
    val `eu-central-1` = "eu-central-1"
    val `ap-southeast-1` = "ap-southeast-1"
    val `ap-southeast-2` = "ap-southeast-2"
    val `ap-south-1` = "ap-south-1"
    val `ap-northeast-1` = "ap-northeast-1"
    val `ap-northeast-2` = "ap-northeast-2"
    val `sa-east-1` = "sa-east-1"
    val `ca-central-1` = "ca-central-1"
    val `cn-north-1` = "cn-north-1"

    val values = IndexedSeq(`us-east-1`, `us-east-2`, `us-west-1`, `us-west-2`, `eu-west-1`, `eu-west-2`, `eu-central-1`, `ap-southeast-1`, `ap-southeast-2`, `ap-south-1`, `ap-northeast-1`, `ap-northeast-2`, `sa-east-1`, `ca-central-1`, `cn-north-1`)
  }
}
