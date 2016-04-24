package facade.amazonaws.services

import scalajs._
import facade.amazonaws._

package object route53 {
  type AliasHealthEnabled = Boolean
  type AssociateVPCComment = String
  type ChangeAction = String
  type ChangeStatus = String
  type Changes = js.Array[Change]
  type CheckerIpRanges = js.Array[IPAddressCidr]
  type DNSName = String
  type DelegationSetNameServers = js.Array[DNSName]
  type DelegationSets = js.Array[DelegationSet]
  type DisassociateVPCComment = String
  type ErrorMessage = String
  type ErrorMessages = js.Array[ErrorMessage]
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
  type HealthCheckType = String
  type HealthCheckVersion = Long
  type HealthChecks = js.Array[HealthCheck]
  type HostedZoneCount = Long
  type HostedZoneRRSetCount = Long
  type HostedZones = js.Array[HostedZone]
  type IPAddress = String
  type IPAddressCidr = String
  type IsPrivateZone = Boolean
  type Nonce = String
  type PageMarker = String
  type PageMaxItems = String
  type PageTruncated = Boolean
  type Port = Integer
  type RData = String
  type RRType = String
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
  type Status = String
  type TTL = Long
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagResourceId = String
  type TagResourceIdList = js.Array[TagResourceId]
  type TagResourceType = String
  type TagValue = String
  type TimeStamp = js.Date
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
    def deleteHealthCheck(params: DeleteHealthCheckRequest, callback: Callback[DeleteHealthCheckResponse]): Unit = js.native
    def deleteHealthCheck(params: DeleteHealthCheckRequest): Request[DeleteHealthCheckResponse] = js.native
    def deleteHostedZone(params: DeleteHostedZoneRequest, callback: Callback[DeleteHostedZoneResponse]): Unit = js.native
    def deleteHostedZone(params: DeleteHostedZoneRequest): Request[DeleteHostedZoneResponse] = js.native
    def deleteReusableDelegationSet(params: DeleteReusableDelegationSetRequest, callback: Callback[DeleteReusableDelegationSetResponse]): Unit = js.native
    def deleteReusableDelegationSet(params: DeleteReusableDelegationSetRequest): Request[DeleteReusableDelegationSetResponse] = js.native
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
    def updateHealthCheck(params: UpdateHealthCheckRequest, callback: Callback[UpdateHealthCheckResponse]): Unit = js.native
    def updateHealthCheck(params: UpdateHealthCheckRequest): Request[UpdateHealthCheckResponse] = js.native
    def updateHostedZoneComment(params: UpdateHostedZoneCommentRequest, callback: Callback[UpdateHostedZoneCommentResponse]): Unit = js.native
    def updateHostedZoneComment(params: UpdateHostedZoneCommentRequest): Request[UpdateHostedZoneCommentResponse] = js.native
  }

  /**
   * <p><i>Alias resource record sets only:</i> Information about the domain to which you are redirecting traffic.</p> <p>For more information and an example, see <a href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/CreatingAliasRRSets.html">Creating Alias Resource Record Sets</a> in the <i>Amazon Route 53 Developer Guide</i></p>.
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
   * <p>A complex type that contains information about the request to associate a VPC with an hosted zone.</p>
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
   * <p>A complex type containing the response information for the request.</p>
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
   * <p>A complex type that contains the information for each change in a change batch request.</p>
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
   * <p>A complex type that contains an optional comment and the changes that you want to make with a change batch request.</p>
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
   * <p>A complex type that describes change information about changes made to your hosted zone.</p> <p>This element contains an ID that you use when performing a <a>GetChange</a> action to get detailed information about the change.</p>
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
   * <p>A complex type that contains a change batch.</p>
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
   * <p>A complex type containing information about a request to add, change, or delete the tags that are associated with a resource.</p>
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

  @js.native
  trait ConflictingDomainExistsException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>&gt;A complex type that contains information about the request to create a health check.</p>
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
   * <p>A complex type that contains information about the request to create a hosted zone.</p>
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
   * <p>A complex type containing the response information for the new hosted zone.</p>
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
   * <p>A complex type that contains name server information.</p>
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
   * <p>Route 53 allows some duplicate domain names, but there is a maximum number of duplicate names. This error indicates that you have reached that maximum. If you want to create another hosted zone with the same name and Route 53 generates this error, you can request an increase to the limit on the <a href="http://aws.amazon.com/route53-request/">Contact Us</a> page.</p>
   */
  @js.native
  trait DelegationSetNotAvailableException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>The specified delegation set has not been marked as reusable.</p>
   */
  @js.native
  trait DelegationSetNotReusableException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>A complex type containing the request information for delete health check.</p>
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
   * <p>Empty response for the request.</p>
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
   * <p>Empty response for the request.</p>
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
   * <p>A complex type that contains information about the request to disassociate a VPC from an hosted zone.</p>
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
   * <p>A complex type containing the response information for the request.</p>
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
   * <p>A complex type that contains information about a <code>GeoLocation</code>.</p>
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
   * <p>A complex type containing information about the specified geo location.</p>
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
   * <p> To retrieve a count of all your health checks, send a <code>GET</code> request to the <code>2013-04-01/healthcheckcount</code> resource.</p>
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
   * <p> A complex type that contains the count of health checks associated with the current AWS account.</p>
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
   * <p>A complex type that contains information about the request to get the most recent failure reason for a health check.</p>
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
   * <p>A complex type that contains information about the most recent failure for the specified health check.</p>
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
   * <p>A complex type that contains information about the request to get a health check.</p>
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
   * <p>A complex type containing information about the specified health check.</p>
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
   * <p>A complex type that contains information about the status of the specified health check.</p>
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
   * <p> To retrieve a count of all your hosted zones, send a <code>GET</code> request to the <code>2013-04-01/hostedzonecount</code> resource.</p>
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
   * <p> A complex type that contains the count of hosted zones associated with the current AWS account.</p>
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
   * <p> The input for a GetHostedZone request.</p>
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
   * <p>A complex type containing information about the specified hosted zone.</p>
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
   * <p> The input for a GetReusableDelegationSet request.</p>
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
   * <p>A complex type containing information about the specified reusable delegation set.</p>
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
   * <p>A complex type that contains identifying information about the health check.</p>
   */
  @js.native
  trait HealthCheck extends js.Object {
    var Id: HealthCheckId
    var CallerReference: HealthCheckNonce
    var HealthCheckConfig: HealthCheckConfig
    var HealthCheckVersion: HealthCheckVersion
  }

  object HealthCheck {
    def apply(
      Id: js.UndefOr[HealthCheckId] = js.undefined,
      CallerReference: js.UndefOr[HealthCheckNonce] = js.undefined,
      HealthCheckConfig: js.UndefOr[HealthCheckConfig] = js.undefined,
      HealthCheckVersion: js.UndefOr[HealthCheckVersion] = js.undefined
    ): HealthCheck = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Id" -> Id.map { x => x: js.Any }),
        ("CallerReference" -> CallerReference.map { x => x: js.Any }),
        ("HealthCheckConfig" -> HealthCheckConfig.map { x => x: js.Any }),
        ("HealthCheckVersion" -> HealthCheckVersion.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HealthCheck]
    }
  }

  /**
   * <p>The health check you are trying to create already exists. Route 53 returns this error when a health check has already been created with the specified <code>CallerReference</code>.</p>
   */
  @js.native
  trait HealthCheckAlreadyExistsException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>A complex type that contains the health check configuration.</p>
   */
  @js.native
  trait HealthCheckConfig extends js.Object {
    var IPAddress: IPAddress
    var ResourcePath: ResourcePath
    var FullyQualifiedDomainName: FullyQualifiedDomainName
    var SearchString: SearchString
    var Port: Port
    var RequestInterval: RequestInterval
    var FailureThreshold: FailureThreshold
    var Type: HealthCheckType
  }

  object HealthCheckConfig {
    def apply(
      IPAddress: js.UndefOr[IPAddress] = js.undefined,
      ResourcePath: js.UndefOr[ResourcePath] = js.undefined,
      FullyQualifiedDomainName: js.UndefOr[FullyQualifiedDomainName] = js.undefined,
      SearchString: js.UndefOr[SearchString] = js.undefined,
      Port: js.UndefOr[Port] = js.undefined,
      RequestInterval: js.UndefOr[RequestInterval] = js.undefined,
      FailureThreshold: js.UndefOr[FailureThreshold] = js.undefined,
      Type: js.UndefOr[HealthCheckType] = js.undefined
    ): HealthCheckConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IPAddress" -> IPAddress.map { x => x: js.Any }),
        ("ResourcePath" -> ResourcePath.map { x => x: js.Any }),
        ("FullyQualifiedDomainName" -> FullyQualifiedDomainName.map { x => x: js.Any }),
        ("SearchString" -> SearchString.map { x => x: js.Any }),
        ("Port" -> Port.map { x => x: js.Any }),
        ("RequestInterval" -> RequestInterval.map { x => x: js.Any }),
        ("FailureThreshold" -> FailureThreshold.map { x => x: js.Any }),
        ("Type" -> Type.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HealthCheckConfig]
    }
  }

  /**
   * <p>There are resource records associated with this health check. Before you can delete the health check, you must disassociate it from the resource record sets.</p>
   */
  @js.native
  trait HealthCheckInUseException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>A complex type that contains the IP address of a Route 53 health checker and the reason for the health check status.</p>
   */
  @js.native
  trait HealthCheckObservation extends js.Object {
    var IPAddress: IPAddress
    var StatusReport: StatusReport
  }

  object HealthCheckObservation {
    def apply(
      IPAddress: js.UndefOr[IPAddress] = js.undefined,
      StatusReport: js.UndefOr[StatusReport] = js.undefined
    ): HealthCheckObservation = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IPAddress" -> IPAddress.map { x => x: js.Any }),
        ("StatusReport" -> StatusReport.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HealthCheckObservation]
    }
  }


  object HealthCheckTypeEnum {
    val HTTP = "HTTP"
    val HTTPS = "HTTPS"
    val `HTTP_STR_MATCH` = "HTTP_STR_MATCH"
    val `HTTPS_STR_MATCH` = "HTTPS_STR_MATCH"
    val TCP = "TCP"

    val values = IndexedSeq(HTTP, HTTPS, `HTTP_STR_MATCH`, `HTTPS_STR_MATCH`, TCP)
  }

  @js.native
  trait HealthCheckVersionMismatchException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>A complex type that contain information about the specified hosted zone.</p>
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
   * <p>The hosted zone you are trying to create already exists. Route 53 returns this error when a hosted zone has already been created with the specified <code>CallerReference</code>.</p>
   */
  @js.native
  trait HostedZoneAlreadyExistsException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>A complex type that contains an optional comment about your hosted zone. If you don't want to specify a comment, you can omit the <code>HostedZoneConfig</code> and <code>Comment</code> elements from the XML document.</p>
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
   * <p>The hosted zone contains resource record sets in addition to the default NS and SOA resource record sets. Before you can delete the hosted zone, you must delete the additional resource record sets.</p>
   */
  @js.native
  trait HostedZoneNotEmptyException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>The specified HostedZone cannot be found.</p>
   */
  @js.native
  trait HostedZoneNotFoundException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>The resource you are trying to access is unsupported on this Route 53 endpoint. Please consider using a newer endpoint or a tool that does so.</p>
   */
  @js.native
  trait IncompatibleVersionException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>At least one of the specified arguments is invalid.</p>
   */
  @js.native
  trait InvalidArgumentException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>This error contains a list of one or more error messages. Each error message indicates one error in the change batch. For more information, see <a href="http://docs.aws.amazon.com/Route53/latest/APIReference/API_ChangeResourceRecordSets.html#example_Errors">Example InvalidChangeBatch Errors</a>. </p>
   */
  @js.native
  trait InvalidChangeBatchException extends js.Object {
    var messages: ErrorMessages
  }

  /**
   * <p>This error indicates that the specified domain name is not valid.</p>
   */
  @js.native
  trait InvalidDomainNameException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>Some value specified in the request is invalid or the XML document is malformed.</p>
   */
  @js.native
  trait InvalidInputException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>The hosted zone you are trying to create for your VPC_ID does not belong to you. Route 53 returns this error when the VPC specified by <code>VPCId</code> does not belong to you.</p>
   */
  @js.native
  trait InvalidVPCIdException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>The VPC you are trying to disassociate from the hosted zone is the last the VPC that is associated with the hosted zone. Route 53 currently doesn't support disassociate the last VPC from the hosted zone.</p>
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
   * <p> The input for a ListGeoLocations request.</p>
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
   * <p>A complex type that contains information about the geo locations that are returned by the request and information about the response.</p>
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
   * <p> To retrieve a list of your health checks, send a <code>GET</code> request to the <code>2013-04-01/healthcheck</code> resource. The response to this request includes a <code>HealthChecks</code> element with zero or more <code>HealthCheck</code> child elements. By default, the list of health checks is displayed on a single page. You can control the length of the page that is displayed by using the <code>MaxItems</code> parameter. You can use the <code>Marker</code> parameter to control the health check that the list begins with.</p> <note> Route 53 returns a maximum of 100 items. If you set <code>MaxItems</code> to a value greater than 100, Route 53 returns only the first 100.</note>
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
   * <p> A complex type that contains the response for the request.</p>
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
   * <p>To retrieve a list of your hosted zones in lexicographic order, send a <code>GET</code> request to the <code>2013-04-01/hostedzonesbyname</code> resource. The response to this request includes a <code>HostedZones</code> element with zero or more <code>HostedZone</code> child elements lexicographically ordered by DNS name. By default, the list of hosted zones is displayed on a single page. You can control the length of the page that is displayed by using the <code>MaxItems</code> parameter. You can use the <code>DNSName</code> and <code>HostedZoneId</code> parameters to control the hosted zone that the list begins with.</p> <p>For more information about listing hosted zones, see <a href="http://docs.amazonwebservices.com/Route53/latest/DeveloperGuide/ListInfoOnHostedZone.html">Listing the Hosted Zones for an AWS Account</a> in the <i>Amazon Route 53 Developer Guide</i>.</p>
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
   * <p>A complex type that contains the response for the request.</p>
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
   * <p> To retrieve a list of your hosted zones, send a <code>GET</code> request to the <code>2013-04-01/hostedzone</code> resource. The response to this request includes a <code>HostedZones</code> element with zero or more <code>HostedZone</code> child elements. By default, the list of hosted zones is displayed on a single page. You can control the length of the page that is displayed by using the <code>MaxItems</code> parameter. You can use the <code>Marker</code> parameter to control the hosted zone that the list begins with. For more information about listing hosted zones, see <a href="http://docs.amazonwebservices.com/Route53/latest/DeveloperGuide/ListInfoOnHostedZone.html">Listing the Hosted Zones for an AWS Account</a> in the <i>Amazon Route 53 Developer Guide</i>.</p> <note> Route 53 returns a maximum of 100 items. If you set <code>MaxItems</code> to a value greater than 100, Route 53 returns only the first 100.</note>
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

  /**
   * <p> A complex type that contains the response for the request.</p>
   */
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
   * <p> The input for a ListResourceRecordSets request.</p>
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
   * <p>A complex type that contains information about the resource record sets that are returned by the request and information about the response.</p>
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
   * <p> To retrieve a list of your reusable delegation sets, send a <code>GET</code> request to the <code>2013-04-01/delegationset</code> resource. The response to this request includes a <code>DelegationSets</code> element with zero or more <code>DelegationSet</code> child elements. By default, the list of reusable delegation sets is displayed on a single page. You can control the length of the page that is displayed by using the <code>MaxItems</code> parameter. You can use the <code>Marker</code> parameter to control the delegation set that the list begins with.</p> <note> Route 53 returns a maximum of 100 items. If you set <code>MaxItems</code> to a value greater than 100, Route 53 returns only the first 100.</note>
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
   * <p> A complex type that contains the response for the request.</p>
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
   * <p>A complex type containing tags for the specified resource.</p>
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
   * <p>A complex type containing information about a request for a list of the tags that are associated with up to 10 specified resources.</p>
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

  @js.native
  trait NoSuchChangeException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>The specified delegation set does not exist.</p>
   */
  @js.native
  trait NoSuchDelegationSetException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>The geo location you are trying to get does not exist.</p>
   */
  @js.native
  trait NoSuchGeoLocationException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>The health check you are trying to get or delete does not exist.</p>
   */
  @js.native
  trait NoSuchHealthCheckException extends js.Object {
    var message: ErrorMessage
  }

  @js.native
  trait NoSuchHostedZoneException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>The request was rejected because Route 53 was still processing a prior request.</p>
   */
  @js.native
  trait PriorRequestNotCompleteException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>The hosted zone you are trying to associate VPC with doesn't have any VPC association. Route 53 currently doesn't support associate a VPC with a public hosted zone.</p>
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
    val PTR = "PTR"
    val SRV = "SRV"
    val SPF = "SPF"
    val AAAA = "AAAA"

    val values = IndexedSeq(SOA, A, TXT, NS, CNAME, MX, PTR, SRV, SPF, AAAA)
  }

  /**
   * <p>A complex type that contains the value of the <code>Value</code> element for the current resource record set.</p>
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
   * <p>A complex type that contains information about the current resource record set.</p>
   */
  @js.native
  trait ResourceRecordSet extends js.Object {
    var Name: DNSName
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
    val `us-west-1` = "us-west-1"
    val `us-west-2` = "us-west-2"
    val `eu-west-1` = "eu-west-1"
    val `eu-central-1` = "eu-central-1"
    val `ap-southeast-1` = "ap-southeast-1"
    val `ap-southeast-2` = "ap-southeast-2"
    val `ap-northeast-1` = "ap-northeast-1"
    val `sa-east-1` = "sa-east-1"
    val `cn-north-1` = "cn-north-1"

    val values = IndexedSeq(`us-east-1`, `us-west-1`, `us-west-2`, `eu-west-1`, `eu-central-1`, `ap-southeast-1`, `ap-southeast-2`, `ap-northeast-1`, `sa-east-1`, `cn-north-1`)
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

  /**
   * <p>A complex type that contains information about the health check status for the current observation.</p>
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
   * <p>A single tag containing a key and value.</p>
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

  @js.native
  trait ThrottlingExceptionException extends js.Object {
    var message: ErrorMessage
  }

  @js.native
  trait TooManyHealthChecksException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>This error indicates that you've reached the maximum number of hosted zones that can be created for the current AWS account. You can request an increase to the limit on the <a href="http://aws.amazon.com/route53-request/">Contact Us</a> page.</p>
   */
  @js.native
  trait TooManyHostedZonesException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * <p>&gt;A complex type that contains information about the request to update a health check.</p>
   */
  @js.native
  trait UpdateHealthCheckRequest extends js.Object {
    var IPAddress: IPAddress
    var HealthCheckId: HealthCheckId
    var HealthCheckVersion: HealthCheckVersion
    var ResourcePath: ResourcePath
    var FullyQualifiedDomainName: FullyQualifiedDomainName
    var SearchString: SearchString
    var Port: Port
    var FailureThreshold: FailureThreshold
  }

  object UpdateHealthCheckRequest {
    def apply(
      IPAddress: js.UndefOr[IPAddress] = js.undefined,
      HealthCheckId: js.UndefOr[HealthCheckId] = js.undefined,
      HealthCheckVersion: js.UndefOr[HealthCheckVersion] = js.undefined,
      ResourcePath: js.UndefOr[ResourcePath] = js.undefined,
      FullyQualifiedDomainName: js.UndefOr[FullyQualifiedDomainName] = js.undefined,
      SearchString: js.UndefOr[SearchString] = js.undefined,
      Port: js.UndefOr[Port] = js.undefined,
      FailureThreshold: js.UndefOr[FailureThreshold] = js.undefined
    ): UpdateHealthCheckRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IPAddress" -> IPAddress.map { x => x: js.Any }),
        ("HealthCheckId" -> HealthCheckId.map { x => x: js.Any }),
        ("HealthCheckVersion" -> HealthCheckVersion.map { x => x: js.Any }),
        ("ResourcePath" -> ResourcePath.map { x => x: js.Any }),
        ("FullyQualifiedDomainName" -> FullyQualifiedDomainName.map { x => x: js.Any }),
        ("SearchString" -> SearchString.map { x => x: js.Any }),
        ("Port" -> Port.map { x => x: js.Any }),
        ("FailureThreshold" -> FailureThreshold.map { x => x: js.Any })
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
   * <p>A complex type that contains information about the request to update a hosted zone comment.</p>
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
   * <p>A complex type containing information about the specified hosted zone after the update.</p>
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
   * <p>The VPC you specified is not currently associated with the hosted zone.</p>
   */
  @js.native
  trait VPCAssociationNotFoundException extends js.Object {
    var message: ErrorMessage
  }


  object VPCRegionEnum {
    val `us-east-1` = "us-east-1"
    val `us-west-1` = "us-west-1"
    val `us-west-2` = "us-west-2"
    val `eu-west-1` = "eu-west-1"
    val `eu-central-1` = "eu-central-1"
    val `ap-southeast-1` = "ap-southeast-1"
    val `ap-southeast-2` = "ap-southeast-2"
    val `ap-northeast-1` = "ap-northeast-1"
    val `sa-east-1` = "sa-east-1"
    val `cn-north-1` = "cn-north-1"

    val values = IndexedSeq(`us-east-1`, `us-west-1`, `us-west-2`, `eu-west-1`, `eu-central-1`, `ap-southeast-1`, `ap-southeast-2`, `ap-northeast-1`, `sa-east-1`, `cn-north-1`)
  }
}
