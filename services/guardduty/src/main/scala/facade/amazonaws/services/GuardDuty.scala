package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object guardduty {
  type AccountDetails            = js.Array[AccountDetail]
  type AccountId                 = String
  type AccountIds                = js.Array[AccountId]
  type ClientToken               = String
  type CountBySeverity           = js.Dictionary[Int]
  type Criterion                 = js.Dictionary[Condition]
  type Destinations              = js.Array[Destination]
  type DetectorId                = String
  type DetectorIds               = js.Array[DetectorId]
  type Email                     = String
  type Eq                        = js.Array[String]
  type Equals                    = js.Array[String]
  type FilterDescription         = String
  type FilterName                = String
  type FilterNames               = js.Array[FilterName]
  type FilterRank                = Int
  type FindingId                 = String
  type FindingIds                = js.Array[FindingId]
  type FindingStatisticTypes     = js.Array[FindingStatisticType]
  type FindingType               = String
  type FindingTypes              = js.Array[FindingType]
  type Findings                  = js.Array[Finding]
  type GuardDutyArn              = String
  type Invitations               = js.Array[Invitation]
  type IpSetIds                  = js.Array[String]
  type Ipv6Addresses             = js.Array[String]
  type Location                  = String
  type MaxResults                = Int
  type Members                   = js.Array[Member]
  type Name                      = String
  type Neq                       = js.Array[String]
  type NetworkInterfaces         = js.Array[NetworkInterface]
  type NotEquals                 = js.Array[String]
  type PortProbeDetails          = js.Array[PortProbeDetail]
  type PrivateIpAddresses        = js.Array[PrivateIpAddressDetails]
  type ProductCodes              = js.Array[ProductCode]
  type SecurityGroups            = js.Array[SecurityGroup]
  type TagKey                    = String
  type TagKeyList                = js.Array[TagKey]
  type TagMap                    = js.Dictionary[TagValue]
  type TagValue                  = String
  type Tags                      = js.Array[Tag]
  type ThreatIntelSetIds         = js.Array[String]
  type ThreatIntelligenceDetails = js.Array[ThreatIntelligenceDetail]
  type ThreatNames               = js.Array[String]
  type UnprocessedAccounts       = js.Array[UnprocessedAccount]

  implicit final class GuardDutyOps(private val service: GuardDuty) extends AnyVal {

    @inline def acceptInvitationFuture(params: AcceptInvitationRequest): Future[AcceptInvitationResponse] =
      service.acceptInvitation(params).promise().toFuture
    @inline def archiveFindingsFuture(params: ArchiveFindingsRequest): Future[ArchiveFindingsResponse] =
      service.archiveFindings(params).promise().toFuture
    @inline def createDetectorFuture(params: CreateDetectorRequest): Future[CreateDetectorResponse] =
      service.createDetector(params).promise().toFuture
    @inline def createFilterFuture(params: CreateFilterRequest): Future[CreateFilterResponse] =
      service.createFilter(params).promise().toFuture
    @inline def createIPSetFuture(params: CreateIPSetRequest): Future[CreateIPSetResponse] =
      service.createIPSet(params).promise().toFuture
    @inline def createMembersFuture(params: CreateMembersRequest): Future[CreateMembersResponse] =
      service.createMembers(params).promise().toFuture
    @inline def createPublishingDestinationFuture(
        params: CreatePublishingDestinationRequest
    ): Future[CreatePublishingDestinationResponse] = service.createPublishingDestination(params).promise().toFuture
    @inline def createSampleFindingsFuture(params: CreateSampleFindingsRequest): Future[CreateSampleFindingsResponse] =
      service.createSampleFindings(params).promise().toFuture
    @inline def createThreatIntelSetFuture(params: CreateThreatIntelSetRequest): Future[CreateThreatIntelSetResponse] =
      service.createThreatIntelSet(params).promise().toFuture
    @inline def declineInvitationsFuture(params: DeclineInvitationsRequest): Future[DeclineInvitationsResponse] =
      service.declineInvitations(params).promise().toFuture
    @inline def deleteDetectorFuture(params: DeleteDetectorRequest): Future[DeleteDetectorResponse] =
      service.deleteDetector(params).promise().toFuture
    @inline def deleteFilterFuture(params: DeleteFilterRequest): Future[DeleteFilterResponse] =
      service.deleteFilter(params).promise().toFuture
    @inline def deleteIPSetFuture(params: DeleteIPSetRequest): Future[DeleteIPSetResponse] =
      service.deleteIPSet(params).promise().toFuture
    @inline def deleteInvitationsFuture(params: DeleteInvitationsRequest): Future[DeleteInvitationsResponse] =
      service.deleteInvitations(params).promise().toFuture
    @inline def deleteMembersFuture(params: DeleteMembersRequest): Future[DeleteMembersResponse] =
      service.deleteMembers(params).promise().toFuture
    @inline def deletePublishingDestinationFuture(
        params: DeletePublishingDestinationRequest
    ): Future[DeletePublishingDestinationResponse] = service.deletePublishingDestination(params).promise().toFuture
    @inline def deleteThreatIntelSetFuture(params: DeleteThreatIntelSetRequest): Future[DeleteThreatIntelSetResponse] =
      service.deleteThreatIntelSet(params).promise().toFuture
    @inline def describePublishingDestinationFuture(
        params: DescribePublishingDestinationRequest
    ): Future[DescribePublishingDestinationResponse] = service.describePublishingDestination(params).promise().toFuture
    @inline def disassociateFromMasterAccountFuture(
        params: DisassociateFromMasterAccountRequest
    ): Future[DisassociateFromMasterAccountResponse] = service.disassociateFromMasterAccount(params).promise().toFuture
    @inline def disassociateMembersFuture(params: DisassociateMembersRequest): Future[DisassociateMembersResponse] =
      service.disassociateMembers(params).promise().toFuture
    @inline def getDetectorFuture(params: GetDetectorRequest): Future[GetDetectorResponse] =
      service.getDetector(params).promise().toFuture
    @inline def getFilterFuture(params: GetFilterRequest): Future[GetFilterResponse] =
      service.getFilter(params).promise().toFuture
    @inline def getFindingsFuture(params: GetFindingsRequest): Future[GetFindingsResponse] =
      service.getFindings(params).promise().toFuture
    @inline def getFindingsStatisticsFuture(
        params: GetFindingsStatisticsRequest
    ): Future[GetFindingsStatisticsResponse] = service.getFindingsStatistics(params).promise().toFuture
    @inline def getIPSetFuture(params: GetIPSetRequest): Future[GetIPSetResponse] =
      service.getIPSet(params).promise().toFuture
    @inline def getInvitationsCountFuture(params: GetInvitationsCountRequest): Future[GetInvitationsCountResponse] =
      service.getInvitationsCount(params).promise().toFuture
    @inline def getMasterAccountFuture(params: GetMasterAccountRequest): Future[GetMasterAccountResponse] =
      service.getMasterAccount(params).promise().toFuture
    @inline def getMembersFuture(params: GetMembersRequest): Future[GetMembersResponse] =
      service.getMembers(params).promise().toFuture
    @inline def getThreatIntelSetFuture(params: GetThreatIntelSetRequest): Future[GetThreatIntelSetResponse] =
      service.getThreatIntelSet(params).promise().toFuture
    @inline def inviteMembersFuture(params: InviteMembersRequest): Future[InviteMembersResponse] =
      service.inviteMembers(params).promise().toFuture
    @inline def listDetectorsFuture(params: ListDetectorsRequest): Future[ListDetectorsResponse] =
      service.listDetectors(params).promise().toFuture
    @inline def listFiltersFuture(params: ListFiltersRequest): Future[ListFiltersResponse] =
      service.listFilters(params).promise().toFuture
    @inline def listFindingsFuture(params: ListFindingsRequest): Future[ListFindingsResponse] =
      service.listFindings(params).promise().toFuture
    @inline def listIPSetsFuture(params: ListIPSetsRequest): Future[ListIPSetsResponse] =
      service.listIPSets(params).promise().toFuture
    @inline def listInvitationsFuture(params: ListInvitationsRequest): Future[ListInvitationsResponse] =
      service.listInvitations(params).promise().toFuture
    @inline def listMembersFuture(params: ListMembersRequest): Future[ListMembersResponse] =
      service.listMembers(params).promise().toFuture
    @inline def listPublishingDestinationsFuture(
        params: ListPublishingDestinationsRequest
    ): Future[ListPublishingDestinationsResponse] = service.listPublishingDestinations(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise().toFuture
    @inline def listThreatIntelSetsFuture(params: ListThreatIntelSetsRequest): Future[ListThreatIntelSetsResponse] =
      service.listThreatIntelSets(params).promise().toFuture
    @inline def startMonitoringMembersFuture(
        params: StartMonitoringMembersRequest
    ): Future[StartMonitoringMembersResponse] = service.startMonitoringMembers(params).promise().toFuture
    @inline def stopMonitoringMembersFuture(
        params: StopMonitoringMembersRequest
    ): Future[StopMonitoringMembersResponse] = service.stopMonitoringMembers(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise().toFuture
    @inline def unarchiveFindingsFuture(params: UnarchiveFindingsRequest): Future[UnarchiveFindingsResponse] =
      service.unarchiveFindings(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise().toFuture
    @inline def updateDetectorFuture(params: UpdateDetectorRequest): Future[UpdateDetectorResponse] =
      service.updateDetector(params).promise().toFuture
    @inline def updateFilterFuture(params: UpdateFilterRequest): Future[UpdateFilterResponse] =
      service.updateFilter(params).promise().toFuture
    @inline def updateFindingsFeedbackFuture(
        params: UpdateFindingsFeedbackRequest
    ): Future[UpdateFindingsFeedbackResponse] = service.updateFindingsFeedback(params).promise().toFuture
    @inline def updateIPSetFuture(params: UpdateIPSetRequest): Future[UpdateIPSetResponse] =
      service.updateIPSet(params).promise().toFuture
    @inline def updatePublishingDestinationFuture(
        params: UpdatePublishingDestinationRequest
    ): Future[UpdatePublishingDestinationResponse] = service.updatePublishingDestination(params).promise().toFuture
    @inline def updateThreatIntelSetFuture(params: UpdateThreatIntelSetRequest): Future[UpdateThreatIntelSetResponse] =
      service.updateThreatIntelSet(params).promise().toFuture
  }
}

package guardduty {
  @js.native
  @JSImport("aws-sdk", "GuardDuty")
  class GuardDuty() extends js.Object {
    def this(config: AWSConfig) = this()

    def acceptInvitation(params: AcceptInvitationRequest): Request[AcceptInvitationResponse] = js.native
    def archiveFindings(params: ArchiveFindingsRequest): Request[ArchiveFindingsResponse]    = js.native
    def createDetector(params: CreateDetectorRequest): Request[CreateDetectorResponse]       = js.native
    def createFilter(params: CreateFilterRequest): Request[CreateFilterResponse]             = js.native
    def createIPSet(params: CreateIPSetRequest): Request[CreateIPSetResponse]                = js.native
    def createMembers(params: CreateMembersRequest): Request[CreateMembersResponse]          = js.native
    def createPublishingDestination(
        params: CreatePublishingDestinationRequest
    ): Request[CreatePublishingDestinationResponse]                                                      = js.native
    def createSampleFindings(params: CreateSampleFindingsRequest): Request[CreateSampleFindingsResponse] = js.native
    def createThreatIntelSet(params: CreateThreatIntelSetRequest): Request[CreateThreatIntelSetResponse] = js.native
    def declineInvitations(params: DeclineInvitationsRequest): Request[DeclineInvitationsResponse]       = js.native
    def deleteDetector(params: DeleteDetectorRequest): Request[DeleteDetectorResponse]                   = js.native
    def deleteFilter(params: DeleteFilterRequest): Request[DeleteFilterResponse]                         = js.native
    def deleteIPSet(params: DeleteIPSetRequest): Request[DeleteIPSetResponse]                            = js.native
    def deleteInvitations(params: DeleteInvitationsRequest): Request[DeleteInvitationsResponse]          = js.native
    def deleteMembers(params: DeleteMembersRequest): Request[DeleteMembersResponse]                      = js.native
    def deletePublishingDestination(
        params: DeletePublishingDestinationRequest
    ): Request[DeletePublishingDestinationResponse]                                                      = js.native
    def deleteThreatIntelSet(params: DeleteThreatIntelSetRequest): Request[DeleteThreatIntelSetResponse] = js.native
    def describePublishingDestination(
        params: DescribePublishingDestinationRequest
    ): Request[DescribePublishingDestinationResponse] = js.native
    def disassociateFromMasterAccount(
        params: DisassociateFromMasterAccountRequest
    ): Request[DisassociateFromMasterAccountResponse]                                                       = js.native
    def disassociateMembers(params: DisassociateMembersRequest): Request[DisassociateMembersResponse]       = js.native
    def getDetector(params: GetDetectorRequest): Request[GetDetectorResponse]                               = js.native
    def getFilter(params: GetFilterRequest): Request[GetFilterResponse]                                     = js.native
    def getFindings(params: GetFindingsRequest): Request[GetFindingsResponse]                               = js.native
    def getFindingsStatistics(params: GetFindingsStatisticsRequest): Request[GetFindingsStatisticsResponse] = js.native
    def getIPSet(params: GetIPSetRequest): Request[GetIPSetResponse]                                        = js.native
    def getInvitationsCount(params: GetInvitationsCountRequest): Request[GetInvitationsCountResponse]       = js.native
    def getMasterAccount(params: GetMasterAccountRequest): Request[GetMasterAccountResponse]                = js.native
    def getMembers(params: GetMembersRequest): Request[GetMembersResponse]                                  = js.native
    def getThreatIntelSet(params: GetThreatIntelSetRequest): Request[GetThreatIntelSetResponse]             = js.native
    def inviteMembers(params: InviteMembersRequest): Request[InviteMembersResponse]                         = js.native
    def listDetectors(params: ListDetectorsRequest): Request[ListDetectorsResponse]                         = js.native
    def listFilters(params: ListFiltersRequest): Request[ListFiltersResponse]                               = js.native
    def listFindings(params: ListFindingsRequest): Request[ListFindingsResponse]                            = js.native
    def listIPSets(params: ListIPSetsRequest): Request[ListIPSetsResponse]                                  = js.native
    def listInvitations(params: ListInvitationsRequest): Request[ListInvitationsResponse]                   = js.native
    def listMembers(params: ListMembersRequest): Request[ListMembersResponse]                               = js.native
    def listPublishingDestinations(
        params: ListPublishingDestinationsRequest
    ): Request[ListPublishingDestinationsResponse]                                                    = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def listThreatIntelSets(params: ListThreatIntelSetsRequest): Request[ListThreatIntelSetsResponse] = js.native
    def startMonitoringMembers(params: StartMonitoringMembersRequest): Request[StartMonitoringMembersResponse] =
      js.native
    def stopMonitoringMembers(params: StopMonitoringMembersRequest): Request[StopMonitoringMembersResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse]                               = js.native
    def unarchiveFindings(params: UnarchiveFindingsRequest): Request[UnarchiveFindingsResponse]             = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse]                         = js.native
    def updateDetector(params: UpdateDetectorRequest): Request[UpdateDetectorResponse]                      = js.native
    def updateFilter(params: UpdateFilterRequest): Request[UpdateFilterResponse]                            = js.native
    def updateFindingsFeedback(params: UpdateFindingsFeedbackRequest): Request[UpdateFindingsFeedbackResponse] =
      js.native
    def updateIPSet(params: UpdateIPSetRequest): Request[UpdateIPSetResponse] = js.native
    def updatePublishingDestination(
        params: UpdatePublishingDestinationRequest
    ): Request[UpdatePublishingDestinationResponse]                                                      = js.native
    def updateThreatIntelSet(params: UpdateThreatIntelSetRequest): Request[UpdateThreatIntelSetResponse] = js.native
  }

  @js.native
  @Factory
  trait AcceptInvitationRequest extends js.Object {
    var DetectorId: DetectorId
    var InvitationId: String
    var MasterId: String
  }

  @js.native
  @Factory
  trait AcceptInvitationResponse extends js.Object {}

  /**
    * Contains information about the access keys.
    */
  @js.native
  @Factory
  trait AccessKeyDetails extends js.Object {
    var AccessKeyId: js.UndefOr[String]
    var PrincipalId: js.UndefOr[String]
    var UserName: js.UndefOr[String]
    var UserType: js.UndefOr[String]
  }

  /**
    * Contains information about the account.
    */
  @js.native
  @Factory
  trait AccountDetail extends js.Object {
    var AccountId: AccountId
    var Email: Email
  }

  /**
    * Contains information about action.
    */
  @js.native
  @Factory
  trait Action extends js.Object {
    var ActionType: js.UndefOr[String]
    var AwsApiCallAction: js.UndefOr[AwsApiCallAction]
    var DnsRequestAction: js.UndefOr[DnsRequestAction]
    var NetworkConnectionAction: js.UndefOr[NetworkConnectionAction]
    var PortProbeAction: js.UndefOr[PortProbeAction]
  }

  @js.native
  @Factory
  trait ArchiveFindingsRequest extends js.Object {
    var DetectorId: DetectorId
    var FindingIds: FindingIds
  }

  @js.native
  @Factory
  trait ArchiveFindingsResponse extends js.Object {}

  /**
    * Contains information about the API operation.
    */
  @js.native
  @Factory
  trait AwsApiCallAction extends js.Object {
    var Api: js.UndefOr[String]
    var CallerType: js.UndefOr[String]
    var DomainDetails: js.UndefOr[DomainDetails]
    var RemoteIpDetails: js.UndefOr[RemoteIpDetails]
    var ServiceName: js.UndefOr[String]
  }

  /**
    * Contains information about the city associated with the IP address.
    */
  @js.native
  @Factory
  trait City extends js.Object {
    var CityName: js.UndefOr[String]
  }

  /**
    * Contains information about the condition.
    */
  @js.native
  @Factory
  trait Condition extends js.Object {
    var Eq: js.UndefOr[Eq]
    var Equals: js.UndefOr[Equals]
    var GreaterThan: js.UndefOr[Double]
    var GreaterThanOrEqual: js.UndefOr[Double]
    var Gt: js.UndefOr[Int]
    var Gte: js.UndefOr[Int]
    var LessThan: js.UndefOr[Double]
    var LessThanOrEqual: js.UndefOr[Double]
    var Lt: js.UndefOr[Int]
    var Lte: js.UndefOr[Int]
    var Neq: js.UndefOr[Neq]
    var NotEquals: js.UndefOr[NotEquals]
  }

  /**
    * Contains information about the country in which the remote IP address is located.
    */
  @js.native
  @Factory
  trait Country extends js.Object {
    var CountryCode: js.UndefOr[String]
    var CountryName: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait CreateDetectorRequest extends js.Object {
    var Enable: Boolean
    var ClientToken: js.UndefOr[ClientToken]
    var FindingPublishingFrequency: js.UndefOr[FindingPublishingFrequency]
    var Tags: js.UndefOr[TagMap]
  }

  @js.native
  @Factory
  trait CreateDetectorResponse extends js.Object {
    var DetectorId: js.UndefOr[DetectorId]
  }

  @js.native
  @Factory
  trait CreateFilterRequest extends js.Object {
    var DetectorId: DetectorId
    var FindingCriteria: FindingCriteria
    var Name: FilterName
    var Action: js.UndefOr[FilterAction]
    var ClientToken: js.UndefOr[ClientToken]
    var Description: js.UndefOr[FilterDescription]
    var Rank: js.UndefOr[FilterRank]
    var Tags: js.UndefOr[TagMap]
  }

  @js.native
  @Factory
  trait CreateFilterResponse extends js.Object {
    var Name: FilterName
  }

  @js.native
  @Factory
  trait CreateIPSetRequest extends js.Object {
    var Activate: Boolean
    var DetectorId: DetectorId
    var Format: IpSetFormat
    var Location: Location
    var Name: Name
    var ClientToken: js.UndefOr[ClientToken]
    var Tags: js.UndefOr[TagMap]
  }

  @js.native
  @Factory
  trait CreateIPSetResponse extends js.Object {
    var IpSetId: String
  }

  @js.native
  @Factory
  trait CreateMembersRequest extends js.Object {
    var AccountDetails: AccountDetails
    var DetectorId: DetectorId
  }

  @js.native
  @Factory
  trait CreateMembersResponse extends js.Object {
    var UnprocessedAccounts: UnprocessedAccounts
  }

  @js.native
  @Factory
  trait CreatePublishingDestinationRequest extends js.Object {
    var DestinationProperties: DestinationProperties
    var DestinationType: DestinationType
    var DetectorId: DetectorId
    var ClientToken: js.UndefOr[ClientToken]
  }

  @js.native
  @Factory
  trait CreatePublishingDestinationResponse extends js.Object {
    var DestinationId: String
  }

  @js.native
  @Factory
  trait CreateSampleFindingsRequest extends js.Object {
    var DetectorId: DetectorId
    var FindingTypes: js.UndefOr[FindingTypes]
  }

  @js.native
  @Factory
  trait CreateSampleFindingsResponse extends js.Object {}

  @js.native
  @Factory
  trait CreateThreatIntelSetRequest extends js.Object {
    var Activate: Boolean
    var DetectorId: DetectorId
    var Format: ThreatIntelSetFormat
    var Location: Location
    var Name: Name
    var ClientToken: js.UndefOr[ClientToken]
    var Tags: js.UndefOr[TagMap]
  }

  @js.native
  @Factory
  trait CreateThreatIntelSetResponse extends js.Object {
    var ThreatIntelSetId: String
  }

  @js.native
  @Factory
  trait DeclineInvitationsRequest extends js.Object {
    var AccountIds: AccountIds
  }

  @js.native
  @Factory
  trait DeclineInvitationsResponse extends js.Object {
    var UnprocessedAccounts: UnprocessedAccounts
  }

  @js.native
  @Factory
  trait DeleteDetectorRequest extends js.Object {
    var DetectorId: DetectorId
  }

  @js.native
  @Factory
  trait DeleteDetectorResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteFilterRequest extends js.Object {
    var DetectorId: DetectorId
    var FilterName: String
  }

  @js.native
  @Factory
  trait DeleteFilterResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteIPSetRequest extends js.Object {
    var DetectorId: DetectorId
    var IpSetId: String
  }

  @js.native
  @Factory
  trait DeleteIPSetResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteInvitationsRequest extends js.Object {
    var AccountIds: AccountIds
  }

  @js.native
  @Factory
  trait DeleteInvitationsResponse extends js.Object {
    var UnprocessedAccounts: UnprocessedAccounts
  }

  @js.native
  @Factory
  trait DeleteMembersRequest extends js.Object {
    var AccountIds: AccountIds
    var DetectorId: DetectorId
  }

  @js.native
  @Factory
  trait DeleteMembersResponse extends js.Object {
    var UnprocessedAccounts: UnprocessedAccounts
  }

  @js.native
  @Factory
  trait DeletePublishingDestinationRequest extends js.Object {
    var DestinationId: String
    var DetectorId: DetectorId
  }

  @js.native
  @Factory
  trait DeletePublishingDestinationResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteThreatIntelSetRequest extends js.Object {
    var DetectorId: DetectorId
    var ThreatIntelSetId: String
  }

  @js.native
  @Factory
  trait DeleteThreatIntelSetResponse extends js.Object {}

  @js.native
  @Factory
  trait DescribePublishingDestinationRequest extends js.Object {
    var DestinationId: String
    var DetectorId: DetectorId
  }

  @js.native
  @Factory
  trait DescribePublishingDestinationResponse extends js.Object {
    var DestinationId: String
    var DestinationProperties: DestinationProperties
    var DestinationType: DestinationType
    var PublishingFailureStartTimestamp: Double
    var Status: PublishingStatus
  }

  /**
    * Contains information about a publishing destination, including the ID, type, and status.
    */
  @js.native
  @Factory
  trait Destination extends js.Object {
    var DestinationId: String
    var DestinationType: DestinationType
    var Status: PublishingStatus
  }

  /**
    * Contains the ARN of the resource to publish to, such as an S3 bucket, and the ARN of the KMS key to use to encrypt published findings.
    */
  @js.native
  @Factory
  trait DestinationProperties extends js.Object {
    var DestinationArn: js.UndefOr[String]
    var KmsKeyArn: js.UndefOr[String]
  }

  @js.native
  sealed trait DestinationType extends js.Any
  object DestinationType extends js.Object {
    val S3 = "S3".asInstanceOf[DestinationType]

    val values = js.Object.freeze(js.Array(S3))
  }

  @js.native
  sealed trait DetectorStatus extends js.Any
  object DetectorStatus extends js.Object {
    val ENABLED  = "ENABLED".asInstanceOf[DetectorStatus]
    val DISABLED = "DISABLED".asInstanceOf[DetectorStatus]

    val values = js.Object.freeze(js.Array(ENABLED, DISABLED))
  }

  @js.native
  @Factory
  trait DisassociateFromMasterAccountRequest extends js.Object {
    var DetectorId: DetectorId
  }

  @js.native
  @Factory
  trait DisassociateFromMasterAccountResponse extends js.Object {}

  @js.native
  @Factory
  trait DisassociateMembersRequest extends js.Object {
    var AccountIds: AccountIds
    var DetectorId: DetectorId
  }

  @js.native
  @Factory
  trait DisassociateMembersResponse extends js.Object {
    var UnprocessedAccounts: UnprocessedAccounts
  }

  /**
    * Contains information about the DNS_REQUEST action described in this finding.
    */
  @js.native
  @Factory
  trait DnsRequestAction extends js.Object {
    var Domain: js.UndefOr[String]
  }

  /**
    * Contains information about the domain.
    */
  @js.native
  @Factory
  trait DomainDetails extends js.Object {
    var Domain: js.UndefOr[String]
  }

  /**
    * Contains information about the reason that the finding was generated.
    */
  @js.native
  @Factory
  trait Evidence extends js.Object {
    var ThreatIntelligenceDetails: js.UndefOr[ThreatIntelligenceDetails]
  }

  @js.native
  sealed trait Feedback extends js.Any
  object Feedback extends js.Object {
    val USEFUL     = "USEFUL".asInstanceOf[Feedback]
    val NOT_USEFUL = "NOT_USEFUL".asInstanceOf[Feedback]

    val values = js.Object.freeze(js.Array(USEFUL, NOT_USEFUL))
  }

  @js.native
  sealed trait FilterAction extends js.Any
  object FilterAction extends js.Object {
    val NOOP    = "NOOP".asInstanceOf[FilterAction]
    val ARCHIVE = "ARCHIVE".asInstanceOf[FilterAction]

    val values = js.Object.freeze(js.Array(NOOP, ARCHIVE))
  }

  /**
    * Contains information about the finding, which is generated when abnormal or suspicious activity is detected.
    */
  @js.native
  @Factory
  trait Finding extends js.Object {
    var AccountId: String
    var Arn: String
    var CreatedAt: String
    var Id: String
    var Region: String
    var Resource: Resource
    var SchemaVersion: String
    var Severity: Double
    var Type: FindingType
    var UpdatedAt: String
    var Confidence: js.UndefOr[Double]
    var Description: js.UndefOr[String]
    var Partition: js.UndefOr[String]
    var Service: js.UndefOr[Service]
    var Title: js.UndefOr[String]
  }

  /**
    * Contains information about the criteria used for querying findings.
    */
  @js.native
  @Factory
  trait FindingCriteria extends js.Object {
    var Criterion: js.UndefOr[Criterion]
  }

  @js.native
  sealed trait FindingPublishingFrequency extends js.Any
  object FindingPublishingFrequency extends js.Object {
    val FIFTEEN_MINUTES = "FIFTEEN_MINUTES".asInstanceOf[FindingPublishingFrequency]
    val ONE_HOUR        = "ONE_HOUR".asInstanceOf[FindingPublishingFrequency]
    val SIX_HOURS       = "SIX_HOURS".asInstanceOf[FindingPublishingFrequency]

    val values = js.Object.freeze(js.Array(FIFTEEN_MINUTES, ONE_HOUR, SIX_HOURS))
  }

  @js.native
  sealed trait FindingStatisticType extends js.Any
  object FindingStatisticType extends js.Object {
    val COUNT_BY_SEVERITY = "COUNT_BY_SEVERITY".asInstanceOf[FindingStatisticType]

    val values = js.Object.freeze(js.Array(COUNT_BY_SEVERITY))
  }

  /**
    * Contains information about finding statistics.
    */
  @js.native
  @Factory
  trait FindingStatistics extends js.Object {
    var CountBySeverity: js.UndefOr[CountBySeverity]
  }

  /**
    * Contains information about the location of the remote IP address.
    */
  @js.native
  @Factory
  trait GeoLocation extends js.Object {
    var Lat: js.UndefOr[Double]
    var Lon: js.UndefOr[Double]
  }

  @js.native
  @Factory
  trait GetDetectorRequest extends js.Object {
    var DetectorId: DetectorId
  }

  @js.native
  @Factory
  trait GetDetectorResponse extends js.Object {
    var ServiceRole: String
    var Status: DetectorStatus
    var CreatedAt: js.UndefOr[String]
    var FindingPublishingFrequency: js.UndefOr[FindingPublishingFrequency]
    var Tags: js.UndefOr[TagMap]
    var UpdatedAt: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetFilterRequest extends js.Object {
    var DetectorId: DetectorId
    var FilterName: String
  }

  @js.native
  @Factory
  trait GetFilterResponse extends js.Object {
    var Action: FilterAction
    var FindingCriteria: FindingCriteria
    var Name: FilterName
    var Description: js.UndefOr[FilterDescription]
    var Rank: js.UndefOr[FilterRank]
    var Tags: js.UndefOr[TagMap]
  }

  @js.native
  @Factory
  trait GetFindingsRequest extends js.Object {
    var DetectorId: DetectorId
    var FindingIds: FindingIds
    var SortCriteria: js.UndefOr[SortCriteria]
  }

  @js.native
  @Factory
  trait GetFindingsResponse extends js.Object {
    var Findings: Findings
  }

  @js.native
  @Factory
  trait GetFindingsStatisticsRequest extends js.Object {
    var DetectorId: DetectorId
    var FindingStatisticTypes: FindingStatisticTypes
    var FindingCriteria: js.UndefOr[FindingCriteria]
  }

  @js.native
  @Factory
  trait GetFindingsStatisticsResponse extends js.Object {
    var FindingStatistics: FindingStatistics
  }

  @js.native
  @Factory
  trait GetIPSetRequest extends js.Object {
    var DetectorId: DetectorId
    var IpSetId: String
  }

  @js.native
  @Factory
  trait GetIPSetResponse extends js.Object {
    var Format: IpSetFormat
    var Location: Location
    var Name: Name
    var Status: IpSetStatus
    var Tags: js.UndefOr[TagMap]
  }

  @js.native
  @Factory
  trait GetInvitationsCountRequest extends js.Object {}

  @js.native
  @Factory
  trait GetInvitationsCountResponse extends js.Object {
    var InvitationsCount: js.UndefOr[Int]
  }

  @js.native
  @Factory
  trait GetMasterAccountRequest extends js.Object {
    var DetectorId: DetectorId
  }

  @js.native
  @Factory
  trait GetMasterAccountResponse extends js.Object {
    var Master: Master
  }

  @js.native
  @Factory
  trait GetMembersRequest extends js.Object {
    var AccountIds: AccountIds
    var DetectorId: DetectorId
  }

  @js.native
  @Factory
  trait GetMembersResponse extends js.Object {
    var Members: Members
    var UnprocessedAccounts: UnprocessedAccounts
  }

  @js.native
  @Factory
  trait GetThreatIntelSetRequest extends js.Object {
    var DetectorId: DetectorId
    var ThreatIntelSetId: String
  }

  @js.native
  @Factory
  trait GetThreatIntelSetResponse extends js.Object {
    var Format: ThreatIntelSetFormat
    var Location: Location
    var Name: Name
    var Status: ThreatIntelSetStatus
    var Tags: js.UndefOr[TagMap]
  }

  /**
    * Contains information about the EC2 instance profile.
    */
  @js.native
  @Factory
  trait IamInstanceProfile extends js.Object {
    var Arn: js.UndefOr[String]
    var Id: js.UndefOr[String]
  }

  /**
    * Contains information about the details of an instance.
    */
  @js.native
  @Factory
  trait InstanceDetails extends js.Object {
    var AvailabilityZone: js.UndefOr[String]
    var IamInstanceProfile: js.UndefOr[IamInstanceProfile]
    var ImageDescription: js.UndefOr[String]
    var ImageId: js.UndefOr[String]
    var InstanceId: js.UndefOr[String]
    var InstanceState: js.UndefOr[String]
    var InstanceType: js.UndefOr[String]
    var LaunchTime: js.UndefOr[String]
    var NetworkInterfaces: js.UndefOr[NetworkInterfaces]
    var Platform: js.UndefOr[String]
    var ProductCodes: js.UndefOr[ProductCodes]
    var Tags: js.UndefOr[Tags]
  }

  /**
    * Contains information about the invitation to become a member account.
    */
  @js.native
  @Factory
  trait Invitation extends js.Object {
    var AccountId: js.UndefOr[AccountId]
    var InvitationId: js.UndefOr[String]
    var InvitedAt: js.UndefOr[String]
    var RelationshipStatus: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait InviteMembersRequest extends js.Object {
    var AccountIds: AccountIds
    var DetectorId: DetectorId
    var DisableEmailNotification: js.UndefOr[Boolean]
    var Message: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait InviteMembersResponse extends js.Object {
    var UnprocessedAccounts: UnprocessedAccounts
  }

  @js.native
  sealed trait IpSetFormat extends js.Any
  object IpSetFormat extends js.Object {
    val TXT         = "TXT".asInstanceOf[IpSetFormat]
    val STIX        = "STIX".asInstanceOf[IpSetFormat]
    val OTX_CSV     = "OTX_CSV".asInstanceOf[IpSetFormat]
    val ALIEN_VAULT = "ALIEN_VAULT".asInstanceOf[IpSetFormat]
    val PROOF_POINT = "PROOF_POINT".asInstanceOf[IpSetFormat]
    val FIRE_EYE    = "FIRE_EYE".asInstanceOf[IpSetFormat]

    val values = js.Object.freeze(js.Array(TXT, STIX, OTX_CSV, ALIEN_VAULT, PROOF_POINT, FIRE_EYE))
  }

  @js.native
  sealed trait IpSetStatus extends js.Any
  object IpSetStatus extends js.Object {
    val INACTIVE       = "INACTIVE".asInstanceOf[IpSetStatus]
    val ACTIVATING     = "ACTIVATING".asInstanceOf[IpSetStatus]
    val ACTIVE         = "ACTIVE".asInstanceOf[IpSetStatus]
    val DEACTIVATING   = "DEACTIVATING".asInstanceOf[IpSetStatus]
    val ERROR          = "ERROR".asInstanceOf[IpSetStatus]
    val DELETE_PENDING = "DELETE_PENDING".asInstanceOf[IpSetStatus]
    val DELETED        = "DELETED".asInstanceOf[IpSetStatus]

    val values = js.Object.freeze(js.Array(INACTIVE, ACTIVATING, ACTIVE, DEACTIVATING, ERROR, DELETE_PENDING, DELETED))
  }

  @js.native
  @Factory
  trait ListDetectorsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListDetectorsResponse extends js.Object {
    var DetectorIds: DetectorIds
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListFiltersRequest extends js.Object {
    var DetectorId: DetectorId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListFiltersResponse extends js.Object {
    var FilterNames: FilterNames
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListFindingsRequest extends js.Object {
    var DetectorId: DetectorId
    var FindingCriteria: js.UndefOr[FindingCriteria]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
    var SortCriteria: js.UndefOr[SortCriteria]
  }

  @js.native
  @Factory
  trait ListFindingsResponse extends js.Object {
    var FindingIds: FindingIds
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListIPSetsRequest extends js.Object {
    var DetectorId: DetectorId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListIPSetsResponse extends js.Object {
    var IpSetIds: IpSetIds
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListInvitationsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListInvitationsResponse extends js.Object {
    var Invitations: js.UndefOr[Invitations]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListMembersRequest extends js.Object {
    var DetectorId: DetectorId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
    var OnlyAssociated: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListMembersResponse extends js.Object {
    var Members: js.UndefOr[Members]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListPublishingDestinationsRequest extends js.Object {
    var DetectorId: DetectorId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListPublishingDestinationsResponse extends js.Object {
    var Destinations: Destinations
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: GuardDutyArn
  }

  @js.native
  @Factory
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[TagMap]
  }

  @js.native
  @Factory
  trait ListThreatIntelSetsRequest extends js.Object {
    var DetectorId: DetectorId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListThreatIntelSetsResponse extends js.Object {
    var ThreatIntelSetIds: ThreatIntelSetIds
    var NextToken: js.UndefOr[String]
  }

  /**
    * Contains information about the port for the local connection.
    */
  @js.native
  @Factory
  trait LocalPortDetails extends js.Object {
    var Port: js.UndefOr[Int]
    var PortName: js.UndefOr[String]
  }

  /**
    * Contains information about the Master account and invitation.
    */
  @js.native
  @Factory
  trait Master extends js.Object {
    var AccountId: js.UndefOr[AccountId]
    var InvitationId: js.UndefOr[String]
    var InvitedAt: js.UndefOr[String]
    var RelationshipStatus: js.UndefOr[String]
  }

  /**
    * Continas information about the member account
    */
  @js.native
  @Factory
  trait Member extends js.Object {
    var AccountId: AccountId
    var Email: Email
    var MasterId: String
    var RelationshipStatus: String
    var UpdatedAt: String
    var DetectorId: js.UndefOr[DetectorId]
    var InvitedAt: js.UndefOr[String]
  }

  /**
    * Contains information about the NETWORK_CONNECTION action described in the finding.
    */
  @js.native
  @Factory
  trait NetworkConnectionAction extends js.Object {
    var Blocked: js.UndefOr[Boolean]
    var ConnectionDirection: js.UndefOr[String]
    var LocalPortDetails: js.UndefOr[LocalPortDetails]
    var Protocol: js.UndefOr[String]
    var RemoteIpDetails: js.UndefOr[RemoteIpDetails]
    var RemotePortDetails: js.UndefOr[RemotePortDetails]
  }

  /**
    * Contains information about the network interface of the Ec2 instance.
    */
  @js.native
  @Factory
  trait NetworkInterface extends js.Object {
    var Ipv6Addresses: js.UndefOr[Ipv6Addresses]
    var NetworkInterfaceId: js.UndefOr[String]
    var PrivateDnsName: js.UndefOr[String]
    var PrivateIpAddress: js.UndefOr[String]
    var PrivateIpAddresses: js.UndefOr[PrivateIpAddresses]
    var PublicDnsName: js.UndefOr[String]
    var PublicIp: js.UndefOr[String]
    var SecurityGroups: js.UndefOr[SecurityGroups]
    var SubnetId: js.UndefOr[String]
    var VpcId: js.UndefOr[String]
  }

  @js.native
  sealed trait OrderBy extends js.Any
  object OrderBy extends js.Object {
    val ASC  = "ASC".asInstanceOf[OrderBy]
    val DESC = "DESC".asInstanceOf[OrderBy]

    val values = js.Object.freeze(js.Array(ASC, DESC))
  }

  /**
    * Continas information about the ISP organization of the remote IP address.
    */
  @js.native
  @Factory
  trait Organization extends js.Object {
    var Asn: js.UndefOr[String]
    var AsnOrg: js.UndefOr[String]
    var Isp: js.UndefOr[String]
    var Org: js.UndefOr[String]
  }

  /**
    * Contains information about the PORT_PROBE action described in the finding.
    */
  @js.native
  @Factory
  trait PortProbeAction extends js.Object {
    var Blocked: js.UndefOr[Boolean]
    var PortProbeDetails: js.UndefOr[PortProbeDetails]
  }

  /**
    * Contains information about the port probe details.
    */
  @js.native
  @Factory
  trait PortProbeDetail extends js.Object {
    var LocalPortDetails: js.UndefOr[LocalPortDetails]
    var RemoteIpDetails: js.UndefOr[RemoteIpDetails]
  }

  /**
    * Contains other private IP address information of the EC2 instance.
    */
  @js.native
  @Factory
  trait PrivateIpAddressDetails extends js.Object {
    var PrivateDnsName: js.UndefOr[String]
    var PrivateIpAddress: js.UndefOr[String]
  }

  /**
    * Contains information about the product code for the Ec2 instance.
    */
  @js.native
  @Factory
  trait ProductCode extends js.Object {
    var Code: js.UndefOr[String]
    var ProductType: js.UndefOr[String]
  }

  @js.native
  sealed trait PublishingStatus extends js.Any
  object PublishingStatus extends js.Object {
    val PENDING_VERIFICATION = "PENDING_VERIFICATION".asInstanceOf[PublishingStatus]
    val PUBLISHING           = "PUBLISHING".asInstanceOf[PublishingStatus]
    val UNABLE_TO_PUBLISH_FIX_DESTINATION_PROPERTY =
      "UNABLE_TO_PUBLISH_FIX_DESTINATION_PROPERTY".asInstanceOf[PublishingStatus]
    val STOPPED = "STOPPED".asInstanceOf[PublishingStatus]

    val values =
      js.Object.freeze(js.Array(PENDING_VERIFICATION, PUBLISHING, UNABLE_TO_PUBLISH_FIX_DESTINATION_PROPERTY, STOPPED))
  }

  /**
    * Continas information about the remote IP address of the connection.
    */
  @js.native
  @Factory
  trait RemoteIpDetails extends js.Object {
    var City: js.UndefOr[City]
    var Country: js.UndefOr[Country]
    var GeoLocation: js.UndefOr[GeoLocation]
    var IpAddressV4: js.UndefOr[String]
    var Organization: js.UndefOr[Organization]
  }

  /**
    * Contains information about the remote port.
    */
  @js.native
  @Factory
  trait RemotePortDetails extends js.Object {
    var Port: js.UndefOr[Int]
    var PortName: js.UndefOr[String]
  }

  /**
    * Contains information about the AWS resource associated with the activity that prompted GuardDuty to generate a finding.
    */
  @js.native
  @Factory
  trait Resource extends js.Object {
    var AccessKeyDetails: js.UndefOr[AccessKeyDetails]
    var InstanceDetails: js.UndefOr[InstanceDetails]
    var ResourceType: js.UndefOr[String]
  }

  /**
    * Contains information about the security groups associated with the EC2 instance.
    */
  @js.native
  @Factory
  trait SecurityGroup extends js.Object {
    var GroupId: js.UndefOr[String]
    var GroupName: js.UndefOr[String]
  }

  /**
    * Contains additional information about the generated finding.
    */
  @js.native
  @Factory
  trait Service extends js.Object {
    var Action: js.UndefOr[Action]
    var Archived: js.UndefOr[Boolean]
    var Count: js.UndefOr[Int]
    var DetectorId: js.UndefOr[DetectorId]
    var EventFirstSeen: js.UndefOr[String]
    var EventLastSeen: js.UndefOr[String]
    var Evidence: js.UndefOr[Evidence]
    var ResourceRole: js.UndefOr[String]
    var ServiceName: js.UndefOr[String]
    var UserFeedback: js.UndefOr[String]
  }

  /**
    * Contains information about the criteria used for sorting findings.
    */
  @js.native
  @Factory
  trait SortCriteria extends js.Object {
    var AttributeName: js.UndefOr[String]
    var OrderBy: js.UndefOr[OrderBy]
  }

  @js.native
  @Factory
  trait StartMonitoringMembersRequest extends js.Object {
    var AccountIds: AccountIds
    var DetectorId: DetectorId
  }

  @js.native
  @Factory
  trait StartMonitoringMembersResponse extends js.Object {
    var UnprocessedAccounts: UnprocessedAccounts
  }

  @js.native
  @Factory
  trait StopMonitoringMembersRequest extends js.Object {
    var AccountIds: AccountIds
    var DetectorId: DetectorId
  }

  @js.native
  @Factory
  trait StopMonitoringMembersResponse extends js.Object {
    var UnprocessedAccounts: UnprocessedAccounts
  }

  /**
    * Contains information about a tag associated with the Ec2 instance.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var Key: js.UndefOr[String]
    var Value: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var ResourceArn: GuardDutyArn
    var Tags: TagMap
  }

  @js.native
  @Factory
  trait TagResourceResponse extends js.Object {}

  @js.native
  sealed trait ThreatIntelSetFormat extends js.Any
  object ThreatIntelSetFormat extends js.Object {
    val TXT         = "TXT".asInstanceOf[ThreatIntelSetFormat]
    val STIX        = "STIX".asInstanceOf[ThreatIntelSetFormat]
    val OTX_CSV     = "OTX_CSV".asInstanceOf[ThreatIntelSetFormat]
    val ALIEN_VAULT = "ALIEN_VAULT".asInstanceOf[ThreatIntelSetFormat]
    val PROOF_POINT = "PROOF_POINT".asInstanceOf[ThreatIntelSetFormat]
    val FIRE_EYE    = "FIRE_EYE".asInstanceOf[ThreatIntelSetFormat]

    val values = js.Object.freeze(js.Array(TXT, STIX, OTX_CSV, ALIEN_VAULT, PROOF_POINT, FIRE_EYE))
  }

  @js.native
  sealed trait ThreatIntelSetStatus extends js.Any
  object ThreatIntelSetStatus extends js.Object {
    val INACTIVE       = "INACTIVE".asInstanceOf[ThreatIntelSetStatus]
    val ACTIVATING     = "ACTIVATING".asInstanceOf[ThreatIntelSetStatus]
    val ACTIVE         = "ACTIVE".asInstanceOf[ThreatIntelSetStatus]
    val DEACTIVATING   = "DEACTIVATING".asInstanceOf[ThreatIntelSetStatus]
    val ERROR          = "ERROR".asInstanceOf[ThreatIntelSetStatus]
    val DELETE_PENDING = "DELETE_PENDING".asInstanceOf[ThreatIntelSetStatus]
    val DELETED        = "DELETED".asInstanceOf[ThreatIntelSetStatus]

    val values = js.Object.freeze(js.Array(INACTIVE, ACTIVATING, ACTIVE, DEACTIVATING, ERROR, DELETE_PENDING, DELETED))
  }

  /**
    * An instance of a threat intelligence detail that constitutes evidence for the finding.
    */
  @js.native
  @Factory
  trait ThreatIntelligenceDetail extends js.Object {
    var ThreatListName: js.UndefOr[String]
    var ThreatNames: js.UndefOr[ThreatNames]
  }

  @js.native
  @Factory
  trait UnarchiveFindingsRequest extends js.Object {
    var DetectorId: DetectorId
    var FindingIds: FindingIds
  }

  @js.native
  @Factory
  trait UnarchiveFindingsResponse extends js.Object {}

  /**
    * Contains information about the accounts that were not processed.
    */
  @js.native
  @Factory
  trait UnprocessedAccount extends js.Object {
    var AccountId: AccountId
    var Result: String
  }

  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: GuardDutyArn
    var TagKeys: TagKeyList
  }

  @js.native
  @Factory
  trait UntagResourceResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateDetectorRequest extends js.Object {
    var DetectorId: DetectorId
    var Enable: js.UndefOr[Boolean]
    var FindingPublishingFrequency: js.UndefOr[FindingPublishingFrequency]
  }

  @js.native
  @Factory
  trait UpdateDetectorResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateFilterRequest extends js.Object {
    var DetectorId: DetectorId
    var FilterName: String
    var Action: js.UndefOr[FilterAction]
    var Description: js.UndefOr[FilterDescription]
    var FindingCriteria: js.UndefOr[FindingCriteria]
    var Rank: js.UndefOr[FilterRank]
  }

  @js.native
  @Factory
  trait UpdateFilterResponse extends js.Object {
    var Name: FilterName
  }

  @js.native
  @Factory
  trait UpdateFindingsFeedbackRequest extends js.Object {
    var DetectorId: DetectorId
    var Feedback: Feedback
    var FindingIds: FindingIds
    var Comments: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait UpdateFindingsFeedbackResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateIPSetRequest extends js.Object {
    var DetectorId: DetectorId
    var IpSetId: String
    var Activate: js.UndefOr[Boolean]
    var Location: js.UndefOr[Location]
    var Name: js.UndefOr[Name]
  }

  @js.native
  @Factory
  trait UpdateIPSetResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdatePublishingDestinationRequest extends js.Object {
    var DestinationId: String
    var DetectorId: DetectorId
    var DestinationProperties: js.UndefOr[DestinationProperties]
  }

  @js.native
  @Factory
  trait UpdatePublishingDestinationResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateThreatIntelSetRequest extends js.Object {
    var DetectorId: DetectorId
    var ThreatIntelSetId: String
    var Activate: js.UndefOr[Boolean]
    var Location: js.UndefOr[Location]
    var Name: js.UndefOr[Name]
  }

  @js.native
  @Factory
  trait UpdateThreatIntelSetResponse extends js.Object {}
}
