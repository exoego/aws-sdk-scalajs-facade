package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object guardduty {
  type AccountDetails             = js.Array[AccountDetail]
  type AccountId                  = String
  type AccountIds                 = js.Array[AccountId]
  type ClientToken                = String
  type CountBySeverity            = js.Dictionary[Int]
  type Criterion                  = js.Dictionary[Condition]
  type DetectorId                 = String
  type DetectorIds                = js.Array[DetectorId]
  type DetectorStatus             = String
  type Email                      = String
  type Eq                         = js.Array[String]
  type Equals                     = js.Array[String]
  type Feedback                   = String
  type FilterAction               = String
  type FilterDescription          = String
  type FilterName                 = String
  type FilterNames                = js.Array[FilterName]
  type FilterRank                 = Int
  type FindingId                  = String
  type FindingIds                 = js.Array[FindingId]
  type FindingPublishingFrequency = String
  type FindingStatisticType       = String
  type FindingStatisticTypes      = js.Array[FindingStatisticType]
  type FindingType                = String
  type FindingTypes               = js.Array[FindingType]
  type Findings                   = js.Array[Finding]
  type GuardDutyArn               = String
  type Invitations                = js.Array[Invitation]
  type IpSetFormat                = String
  type IpSetIds                   = js.Array[String]
  type IpSetStatus                = String
  type Ipv6Addresses              = js.Array[String]
  type Location                   = String
  type MaxResults                 = Int
  type Members                    = js.Array[Member]
  type Name                       = String
  type Neq                        = js.Array[String]
  type NetworkInterfaces          = js.Array[NetworkInterface]
  type NotEquals                  = js.Array[String]
  type OrderBy                    = String
  type PortProbeDetails           = js.Array[PortProbeDetail]
  type PrivateIpAddresses         = js.Array[PrivateIpAddressDetails]
  type ProductCodes               = js.Array[ProductCode]
  type SecurityGroups             = js.Array[SecurityGroup]
  type TagKey                     = String
  type TagKeyList                 = js.Array[TagKey]
  type TagMap                     = js.Dictionary[TagValue]
  type TagValue                   = String
  type Tags                       = js.Array[Tag]
  type ThreatIntelSetFormat       = String
  type ThreatIntelSetIds          = js.Array[String]
  type ThreatIntelSetStatus       = String
  type ThreatIntelligenceDetails  = js.Array[ThreatIntelligenceDetail]
  type ThreatNames                = js.Array[String]
  type UnprocessedAccounts        = js.Array[UnprocessedAccount]

  implicit final class GuardDutyOps(val service: GuardDuty) extends AnyVal {

    def acceptInvitationFuture(params: AcceptInvitationRequest): Future[AcceptInvitationResponse] =
      service.acceptInvitation(params).promise.toFuture
    def archiveFindingsFuture(params: ArchiveFindingsRequest): Future[ArchiveFindingsResponse] =
      service.archiveFindings(params).promise.toFuture
    def createDetectorFuture(params: CreateDetectorRequest): Future[CreateDetectorResponse] =
      service.createDetector(params).promise.toFuture
    def createFilterFuture(params: CreateFilterRequest): Future[CreateFilterResponse] =
      service.createFilter(params).promise.toFuture
    def createIPSetFuture(params: CreateIPSetRequest): Future[CreateIPSetResponse] =
      service.createIPSet(params).promise.toFuture
    def createMembersFuture(params: CreateMembersRequest): Future[CreateMembersResponse] =
      service.createMembers(params).promise.toFuture
    def createSampleFindingsFuture(params: CreateSampleFindingsRequest): Future[CreateSampleFindingsResponse] =
      service.createSampleFindings(params).promise.toFuture
    def createThreatIntelSetFuture(params: CreateThreatIntelSetRequest): Future[CreateThreatIntelSetResponse] =
      service.createThreatIntelSet(params).promise.toFuture
    def declineInvitationsFuture(params: DeclineInvitationsRequest): Future[DeclineInvitationsResponse] =
      service.declineInvitations(params).promise.toFuture
    def deleteDetectorFuture(params: DeleteDetectorRequest): Future[DeleteDetectorResponse] =
      service.deleteDetector(params).promise.toFuture
    def deleteFilterFuture(params: DeleteFilterRequest): Future[DeleteFilterResponse] =
      service.deleteFilter(params).promise.toFuture
    def deleteIPSetFuture(params: DeleteIPSetRequest): Future[DeleteIPSetResponse] =
      service.deleteIPSet(params).promise.toFuture
    def deleteInvitationsFuture(params: DeleteInvitationsRequest): Future[DeleteInvitationsResponse] =
      service.deleteInvitations(params).promise.toFuture
    def deleteMembersFuture(params: DeleteMembersRequest): Future[DeleteMembersResponse] =
      service.deleteMembers(params).promise.toFuture
    def deleteThreatIntelSetFuture(params: DeleteThreatIntelSetRequest): Future[DeleteThreatIntelSetResponse] =
      service.deleteThreatIntelSet(params).promise.toFuture
    def disassociateFromMasterAccountFuture(
        params: DisassociateFromMasterAccountRequest
    ): Future[DisassociateFromMasterAccountResponse] = service.disassociateFromMasterAccount(params).promise.toFuture
    def disassociateMembersFuture(params: DisassociateMembersRequest): Future[DisassociateMembersResponse] =
      service.disassociateMembers(params).promise.toFuture
    def getDetectorFuture(params: GetDetectorRequest): Future[GetDetectorResponse] =
      service.getDetector(params).promise.toFuture
    def getFilterFuture(params: GetFilterRequest): Future[GetFilterResponse] =
      service.getFilter(params).promise.toFuture
    def getFindingsFuture(params: GetFindingsRequest): Future[GetFindingsResponse] =
      service.getFindings(params).promise.toFuture
    def getFindingsStatisticsFuture(params: GetFindingsStatisticsRequest): Future[GetFindingsStatisticsResponse] =
      service.getFindingsStatistics(params).promise.toFuture
    def getIPSetFuture(params: GetIPSetRequest): Future[GetIPSetResponse] = service.getIPSet(params).promise.toFuture
    def getInvitationsCountFuture(params: GetInvitationsCountRequest): Future[GetInvitationsCountResponse] =
      service.getInvitationsCount(params).promise.toFuture
    def getMasterAccountFuture(params: GetMasterAccountRequest): Future[GetMasterAccountResponse] =
      service.getMasterAccount(params).promise.toFuture
    def getMembersFuture(params: GetMembersRequest): Future[GetMembersResponse] =
      service.getMembers(params).promise.toFuture
    def getThreatIntelSetFuture(params: GetThreatIntelSetRequest): Future[GetThreatIntelSetResponse] =
      service.getThreatIntelSet(params).promise.toFuture
    def inviteMembersFuture(params: InviteMembersRequest): Future[InviteMembersResponse] =
      service.inviteMembers(params).promise.toFuture
    def listDetectorsFuture(params: ListDetectorsRequest): Future[ListDetectorsResponse] =
      service.listDetectors(params).promise.toFuture
    def listFiltersFuture(params: ListFiltersRequest): Future[ListFiltersResponse] =
      service.listFilters(params).promise.toFuture
    def listFindingsFuture(params: ListFindingsRequest): Future[ListFindingsResponse] =
      service.listFindings(params).promise.toFuture
    def listIPSetsFuture(params: ListIPSetsRequest): Future[ListIPSetsResponse] =
      service.listIPSets(params).promise.toFuture
    def listInvitationsFuture(params: ListInvitationsRequest): Future[ListInvitationsResponse] =
      service.listInvitations(params).promise.toFuture
    def listMembersFuture(params: ListMembersRequest): Future[ListMembersResponse] =
      service.listMembers(params).promise.toFuture
    def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise.toFuture
    def listThreatIntelSetsFuture(params: ListThreatIntelSetsRequest): Future[ListThreatIntelSetsResponse] =
      service.listThreatIntelSets(params).promise.toFuture
    def startMonitoringMembersFuture(params: StartMonitoringMembersRequest): Future[StartMonitoringMembersResponse] =
      service.startMonitoringMembers(params).promise.toFuture
    def stopMonitoringMembersFuture(params: StopMonitoringMembersRequest): Future[StopMonitoringMembersResponse] =
      service.stopMonitoringMembers(params).promise.toFuture
    def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise.toFuture
    def unarchiveFindingsFuture(params: UnarchiveFindingsRequest): Future[UnarchiveFindingsResponse] =
      service.unarchiveFindings(params).promise.toFuture
    def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise.toFuture
    def updateDetectorFuture(params: UpdateDetectorRequest): Future[UpdateDetectorResponse] =
      service.updateDetector(params).promise.toFuture
    def updateFilterFuture(params: UpdateFilterRequest): Future[UpdateFilterResponse] =
      service.updateFilter(params).promise.toFuture
    def updateFindingsFeedbackFuture(params: UpdateFindingsFeedbackRequest): Future[UpdateFindingsFeedbackResponse] =
      service.updateFindingsFeedback(params).promise.toFuture
    def updateIPSetFuture(params: UpdateIPSetRequest): Future[UpdateIPSetResponse] =
      service.updateIPSet(params).promise.toFuture
    def updateThreatIntelSetFuture(params: UpdateThreatIntelSetRequest): Future[UpdateThreatIntelSetResponse] =
      service.updateThreatIntelSet(params).promise.toFuture
  }
}

package guardduty {
  @js.native
  @JSImport("aws-sdk", "GuardDuty")
  class GuardDuty() extends js.Object {
    def this(config: AWSConfig) = this()

    def acceptInvitation(params: AcceptInvitationRequest): Request[AcceptInvitationResponse]             = js.native
    def archiveFindings(params: ArchiveFindingsRequest): Request[ArchiveFindingsResponse]                = js.native
    def createDetector(params: CreateDetectorRequest): Request[CreateDetectorResponse]                   = js.native
    def createFilter(params: CreateFilterRequest): Request[CreateFilterResponse]                         = js.native
    def createIPSet(params: CreateIPSetRequest): Request[CreateIPSetResponse]                            = js.native
    def createMembers(params: CreateMembersRequest): Request[CreateMembersResponse]                      = js.native
    def createSampleFindings(params: CreateSampleFindingsRequest): Request[CreateSampleFindingsResponse] = js.native
    def createThreatIntelSet(params: CreateThreatIntelSetRequest): Request[CreateThreatIntelSetResponse] = js.native
    def declineInvitations(params: DeclineInvitationsRequest): Request[DeclineInvitationsResponse]       = js.native
    def deleteDetector(params: DeleteDetectorRequest): Request[DeleteDetectorResponse]                   = js.native
    def deleteFilter(params: DeleteFilterRequest): Request[DeleteFilterResponse]                         = js.native
    def deleteIPSet(params: DeleteIPSetRequest): Request[DeleteIPSetResponse]                            = js.native
    def deleteInvitations(params: DeleteInvitationsRequest): Request[DeleteInvitationsResponse]          = js.native
    def deleteMembers(params: DeleteMembersRequest): Request[DeleteMembersResponse]                      = js.native
    def deleteThreatIntelSet(params: DeleteThreatIntelSetRequest): Request[DeleteThreatIntelSetResponse] = js.native
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
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse]       = js.native
    def listThreatIntelSets(params: ListThreatIntelSetsRequest): Request[ListThreatIntelSetsResponse]       = js.native
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
    def updateIPSet(params: UpdateIPSetRequest): Request[UpdateIPSetResponse]                            = js.native
    def updateThreatIntelSet(params: UpdateThreatIntelSetRequest): Request[UpdateThreatIntelSetResponse] = js.native
  }

  @js.native
  trait AcceptInvitationRequest extends js.Object {
    var DetectorId: DetectorId
    var InvitationId: String
    var MasterId: String
  }

  object AcceptInvitationRequest {
    def apply(
        DetectorId: DetectorId,
        InvitationId: String,
        MasterId: String
    ): AcceptInvitationRequest = {
      val __obj = js.Dictionary[js.Any](
        "DetectorId"   -> DetectorId.asInstanceOf[js.Any],
        "InvitationId" -> InvitationId.asInstanceOf[js.Any],
        "MasterId"     -> MasterId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AcceptInvitationRequest]
    }
  }

  @js.native
  trait AcceptInvitationResponse extends js.Object {}

  object AcceptInvitationResponse {
    def apply(
        ): AcceptInvitationResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[AcceptInvitationResponse]
    }
  }

  /**
    * Contains information about the access keys.
    */
  @js.native
  trait AccessKeyDetails extends js.Object {
    var AccessKeyId: js.UndefOr[String]
    var PrincipalId: js.UndefOr[String]
    var UserName: js.UndefOr[String]
    var UserType: js.UndefOr[String]
  }

  object AccessKeyDetails {
    def apply(
        AccessKeyId: js.UndefOr[String] = js.undefined,
        PrincipalId: js.UndefOr[String] = js.undefined,
        UserName: js.UndefOr[String] = js.undefined,
        UserType: js.UndefOr[String] = js.undefined
    ): AccessKeyDetails = {
      val __obj = js.Dictionary.empty[js.Any]
      AccessKeyId.foreach(__v => __obj.update("AccessKeyId", __v.asInstanceOf[js.Any]))
      PrincipalId.foreach(__v => __obj.update("PrincipalId", __v.asInstanceOf[js.Any]))
      UserName.foreach(__v => __obj.update("UserName", __v.asInstanceOf[js.Any]))
      UserType.foreach(__v => __obj.update("UserType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccessKeyDetails]
    }
  }

  /**
    * Contains information about the account.
    */
  @js.native
  trait AccountDetail extends js.Object {
    var AccountId: AccountId
    var Email: Email
  }

  object AccountDetail {
    def apply(
        AccountId: AccountId,
        Email: Email
    ): AccountDetail = {
      val __obj = js.Dictionary[js.Any](
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "Email"     -> Email.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AccountDetail]
    }
  }

  /**
    * Contains information about action.
    */
  @js.native
  trait Action extends js.Object {
    var ActionType: js.UndefOr[String]
    var AwsApiCallAction: js.UndefOr[AwsApiCallAction]
    var DnsRequestAction: js.UndefOr[DnsRequestAction]
    var NetworkConnectionAction: js.UndefOr[NetworkConnectionAction]
    var PortProbeAction: js.UndefOr[PortProbeAction]
  }

  object Action {
    def apply(
        ActionType: js.UndefOr[String] = js.undefined,
        AwsApiCallAction: js.UndefOr[AwsApiCallAction] = js.undefined,
        DnsRequestAction: js.UndefOr[DnsRequestAction] = js.undefined,
        NetworkConnectionAction: js.UndefOr[NetworkConnectionAction] = js.undefined,
        PortProbeAction: js.UndefOr[PortProbeAction] = js.undefined
    ): Action = {
      val __obj = js.Dictionary.empty[js.Any]
      ActionType.foreach(__v => __obj.update("ActionType", __v.asInstanceOf[js.Any]))
      AwsApiCallAction.foreach(__v => __obj.update("AwsApiCallAction", __v.asInstanceOf[js.Any]))
      DnsRequestAction.foreach(__v => __obj.update("DnsRequestAction", __v.asInstanceOf[js.Any]))
      NetworkConnectionAction.foreach(__v => __obj.update("NetworkConnectionAction", __v.asInstanceOf[js.Any]))
      PortProbeAction.foreach(__v => __obj.update("PortProbeAction", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Action]
    }
  }

  @js.native
  trait ArchiveFindingsRequest extends js.Object {
    var DetectorId: DetectorId
    var FindingIds: FindingIds
  }

  object ArchiveFindingsRequest {
    def apply(
        DetectorId: DetectorId,
        FindingIds: FindingIds
    ): ArchiveFindingsRequest = {
      val __obj = js.Dictionary[js.Any](
        "DetectorId" -> DetectorId.asInstanceOf[js.Any],
        "FindingIds" -> FindingIds.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ArchiveFindingsRequest]
    }
  }

  @js.native
  trait ArchiveFindingsResponse extends js.Object {}

  object ArchiveFindingsResponse {
    def apply(
        ): ArchiveFindingsResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[ArchiveFindingsResponse]
    }
  }

  /**
    * Contains information about the API operation.
    */
  @js.native
  trait AwsApiCallAction extends js.Object {
    var Api: js.UndefOr[String]
    var CallerType: js.UndefOr[String]
    var DomainDetails: js.UndefOr[DomainDetails]
    var RemoteIpDetails: js.UndefOr[RemoteIpDetails]
    var ServiceName: js.UndefOr[String]
  }

  object AwsApiCallAction {
    def apply(
        Api: js.UndefOr[String] = js.undefined,
        CallerType: js.UndefOr[String] = js.undefined,
        DomainDetails: js.UndefOr[DomainDetails] = js.undefined,
        RemoteIpDetails: js.UndefOr[RemoteIpDetails] = js.undefined,
        ServiceName: js.UndefOr[String] = js.undefined
    ): AwsApiCallAction = {
      val __obj = js.Dictionary.empty[js.Any]
      Api.foreach(__v => __obj.update("Api", __v.asInstanceOf[js.Any]))
      CallerType.foreach(__v => __obj.update("CallerType", __v.asInstanceOf[js.Any]))
      DomainDetails.foreach(__v => __obj.update("DomainDetails", __v.asInstanceOf[js.Any]))
      RemoteIpDetails.foreach(__v => __obj.update("RemoteIpDetails", __v.asInstanceOf[js.Any]))
      ServiceName.foreach(__v => __obj.update("ServiceName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsApiCallAction]
    }
  }

  /**
    * Contains information about the city associated with the IP address.
    */
  @js.native
  trait City extends js.Object {
    var CityName: js.UndefOr[String]
  }

  object City {
    def apply(
        CityName: js.UndefOr[String] = js.undefined
    ): City = {
      val __obj = js.Dictionary.empty[js.Any]
      CityName.foreach(__v => __obj.update("CityName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[City]
    }
  }

  /**
    * Contains information about the condition.
    */
  @js.native
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

  object Condition {
    def apply(
        Eq: js.UndefOr[Eq] = js.undefined,
        Equals: js.UndefOr[Equals] = js.undefined,
        GreaterThan: js.UndefOr[Double] = js.undefined,
        GreaterThanOrEqual: js.UndefOr[Double] = js.undefined,
        Gt: js.UndefOr[Int] = js.undefined,
        Gte: js.UndefOr[Int] = js.undefined,
        LessThan: js.UndefOr[Double] = js.undefined,
        LessThanOrEqual: js.UndefOr[Double] = js.undefined,
        Lt: js.UndefOr[Int] = js.undefined,
        Lte: js.UndefOr[Int] = js.undefined,
        Neq: js.UndefOr[Neq] = js.undefined,
        NotEquals: js.UndefOr[NotEquals] = js.undefined
    ): Condition = {
      val __obj = js.Dictionary.empty[js.Any]
      Eq.foreach(__v => __obj.update("Eq", __v.asInstanceOf[js.Any]))
      Equals.foreach(__v => __obj.update("Equals", __v.asInstanceOf[js.Any]))
      GreaterThan.foreach(__v => __obj.update("GreaterThan", __v.asInstanceOf[js.Any]))
      GreaterThanOrEqual.foreach(__v => __obj.update("GreaterThanOrEqual", __v.asInstanceOf[js.Any]))
      Gt.foreach(__v => __obj.update("Gt", __v.asInstanceOf[js.Any]))
      Gte.foreach(__v => __obj.update("Gte", __v.asInstanceOf[js.Any]))
      LessThan.foreach(__v => __obj.update("LessThan", __v.asInstanceOf[js.Any]))
      LessThanOrEqual.foreach(__v => __obj.update("LessThanOrEqual", __v.asInstanceOf[js.Any]))
      Lt.foreach(__v => __obj.update("Lt", __v.asInstanceOf[js.Any]))
      Lte.foreach(__v => __obj.update("Lte", __v.asInstanceOf[js.Any]))
      Neq.foreach(__v => __obj.update("Neq", __v.asInstanceOf[js.Any]))
      NotEquals.foreach(__v => __obj.update("NotEquals", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Condition]
    }
  }

  /**
    * Contains information about the country.
    */
  @js.native
  trait Country extends js.Object {
    var CountryCode: js.UndefOr[String]
    var CountryName: js.UndefOr[String]
  }

  object Country {
    def apply(
        CountryCode: js.UndefOr[String] = js.undefined,
        CountryName: js.UndefOr[String] = js.undefined
    ): Country = {
      val __obj = js.Dictionary.empty[js.Any]
      CountryCode.foreach(__v => __obj.update("CountryCode", __v.asInstanceOf[js.Any]))
      CountryName.foreach(__v => __obj.update("CountryName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Country]
    }
  }

  @js.native
  trait CreateDetectorRequest extends js.Object {
    var Enable: Boolean
    var ClientToken: js.UndefOr[ClientToken]
    var FindingPublishingFrequency: js.UndefOr[FindingPublishingFrequency]
    var Tags: js.UndefOr[TagMap]
  }

  object CreateDetectorRequest {
    def apply(
        Enable: Boolean,
        ClientToken: js.UndefOr[ClientToken] = js.undefined,
        FindingPublishingFrequency: js.UndefOr[FindingPublishingFrequency] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreateDetectorRequest = {
      val __obj = js.Dictionary[js.Any](
        "Enable" -> Enable.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.update("ClientToken", __v.asInstanceOf[js.Any]))
      FindingPublishingFrequency.foreach(__v => __obj.update("FindingPublishingFrequency", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDetectorRequest]
    }
  }

  @js.native
  trait CreateDetectorResponse extends js.Object {
    var DetectorId: js.UndefOr[DetectorId]
  }

  object CreateDetectorResponse {
    def apply(
        DetectorId: js.UndefOr[DetectorId] = js.undefined
    ): CreateDetectorResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      DetectorId.foreach(__v => __obj.update("DetectorId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDetectorResponse]
    }
  }

  @js.native
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

  object CreateFilterRequest {
    def apply(
        DetectorId: DetectorId,
        FindingCriteria: FindingCriteria,
        Name: FilterName,
        Action: js.UndefOr[FilterAction] = js.undefined,
        ClientToken: js.UndefOr[ClientToken] = js.undefined,
        Description: js.UndefOr[FilterDescription] = js.undefined,
        Rank: js.UndefOr[FilterRank] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreateFilterRequest = {
      val __obj = js.Dictionary[js.Any](
        "DetectorId"      -> DetectorId.asInstanceOf[js.Any],
        "FindingCriteria" -> FindingCriteria.asInstanceOf[js.Any],
        "Name"            -> Name.asInstanceOf[js.Any]
      )

      Action.foreach(__v => __obj.update("Action", __v.asInstanceOf[js.Any]))
      ClientToken.foreach(__v => __obj.update("ClientToken", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      Rank.foreach(__v => __obj.update("Rank", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFilterRequest]
    }
  }

  @js.native
  trait CreateFilterResponse extends js.Object {
    var Name: FilterName
  }

  object CreateFilterResponse {
    def apply(
        Name: FilterName
    ): CreateFilterResponse = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateFilterResponse]
    }
  }

  @js.native
  trait CreateIPSetRequest extends js.Object {
    var Activate: Boolean
    var DetectorId: DetectorId
    var Format: IpSetFormat
    var Location: Location
    var Name: Name
    var ClientToken: js.UndefOr[ClientToken]
    var Tags: js.UndefOr[TagMap]
  }

  object CreateIPSetRequest {
    def apply(
        Activate: Boolean,
        DetectorId: DetectorId,
        Format: IpSetFormat,
        Location: Location,
        Name: Name,
        ClientToken: js.UndefOr[ClientToken] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreateIPSetRequest = {
      val __obj = js.Dictionary[js.Any](
        "Activate"   -> Activate.asInstanceOf[js.Any],
        "DetectorId" -> DetectorId.asInstanceOf[js.Any],
        "Format"     -> Format.asInstanceOf[js.Any],
        "Location"   -> Location.asInstanceOf[js.Any],
        "Name"       -> Name.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.update("ClientToken", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateIPSetRequest]
    }
  }

  @js.native
  trait CreateIPSetResponse extends js.Object {
    var IpSetId: String
  }

  object CreateIPSetResponse {
    def apply(
        IpSetId: String
    ): CreateIPSetResponse = {
      val __obj = js.Dictionary[js.Any](
        "IpSetId" -> IpSetId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateIPSetResponse]
    }
  }

  @js.native
  trait CreateMembersRequest extends js.Object {
    var AccountDetails: AccountDetails
    var DetectorId: DetectorId
  }

  object CreateMembersRequest {
    def apply(
        AccountDetails: AccountDetails,
        DetectorId: DetectorId
    ): CreateMembersRequest = {
      val __obj = js.Dictionary[js.Any](
        "AccountDetails" -> AccountDetails.asInstanceOf[js.Any],
        "DetectorId"     -> DetectorId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateMembersRequest]
    }
  }

  @js.native
  trait CreateMembersResponse extends js.Object {
    var UnprocessedAccounts: UnprocessedAccounts
  }

  object CreateMembersResponse {
    def apply(
        UnprocessedAccounts: UnprocessedAccounts
    ): CreateMembersResponse = {
      val __obj = js.Dictionary[js.Any](
        "UnprocessedAccounts" -> UnprocessedAccounts.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateMembersResponse]
    }
  }

  @js.native
  trait CreateSampleFindingsRequest extends js.Object {
    var DetectorId: DetectorId
    var FindingTypes: js.UndefOr[FindingTypes]
  }

  object CreateSampleFindingsRequest {
    def apply(
        DetectorId: DetectorId,
        FindingTypes: js.UndefOr[FindingTypes] = js.undefined
    ): CreateSampleFindingsRequest = {
      val __obj = js.Dictionary[js.Any](
        "DetectorId" -> DetectorId.asInstanceOf[js.Any]
      )

      FindingTypes.foreach(__v => __obj.update("FindingTypes", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSampleFindingsRequest]
    }
  }

  @js.native
  trait CreateSampleFindingsResponse extends js.Object {}

  object CreateSampleFindingsResponse {
    def apply(
        ): CreateSampleFindingsResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[CreateSampleFindingsResponse]
    }
  }

  @js.native
  trait CreateThreatIntelSetRequest extends js.Object {
    var Activate: Boolean
    var DetectorId: DetectorId
    var Format: ThreatIntelSetFormat
    var Location: Location
    var Name: Name
    var ClientToken: js.UndefOr[ClientToken]
    var Tags: js.UndefOr[TagMap]
  }

  object CreateThreatIntelSetRequest {
    def apply(
        Activate: Boolean,
        DetectorId: DetectorId,
        Format: ThreatIntelSetFormat,
        Location: Location,
        Name: Name,
        ClientToken: js.UndefOr[ClientToken] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreateThreatIntelSetRequest = {
      val __obj = js.Dictionary[js.Any](
        "Activate"   -> Activate.asInstanceOf[js.Any],
        "DetectorId" -> DetectorId.asInstanceOf[js.Any],
        "Format"     -> Format.asInstanceOf[js.Any],
        "Location"   -> Location.asInstanceOf[js.Any],
        "Name"       -> Name.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.update("ClientToken", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateThreatIntelSetRequest]
    }
  }

  @js.native
  trait CreateThreatIntelSetResponse extends js.Object {
    var ThreatIntelSetId: String
  }

  object CreateThreatIntelSetResponse {
    def apply(
        ThreatIntelSetId: String
    ): CreateThreatIntelSetResponse = {
      val __obj = js.Dictionary[js.Any](
        "ThreatIntelSetId" -> ThreatIntelSetId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateThreatIntelSetResponse]
    }
  }

  @js.native
  trait DeclineInvitationsRequest extends js.Object {
    var AccountIds: AccountIds
  }

  object DeclineInvitationsRequest {
    def apply(
        AccountIds: AccountIds
    ): DeclineInvitationsRequest = {
      val __obj = js.Dictionary[js.Any](
        "AccountIds" -> AccountIds.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeclineInvitationsRequest]
    }
  }

  @js.native
  trait DeclineInvitationsResponse extends js.Object {
    var UnprocessedAccounts: UnprocessedAccounts
  }

  object DeclineInvitationsResponse {
    def apply(
        UnprocessedAccounts: UnprocessedAccounts
    ): DeclineInvitationsResponse = {
      val __obj = js.Dictionary[js.Any](
        "UnprocessedAccounts" -> UnprocessedAccounts.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeclineInvitationsResponse]
    }
  }

  @js.native
  trait DeleteDetectorRequest extends js.Object {
    var DetectorId: DetectorId
  }

  object DeleteDetectorRequest {
    def apply(
        DetectorId: DetectorId
    ): DeleteDetectorRequest = {
      val __obj = js.Dictionary[js.Any](
        "DetectorId" -> DetectorId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteDetectorRequest]
    }
  }

  @js.native
  trait DeleteDetectorResponse extends js.Object {}

  object DeleteDetectorResponse {
    def apply(
        ): DeleteDetectorResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteDetectorResponse]
    }
  }

  @js.native
  trait DeleteFilterRequest extends js.Object {
    var DetectorId: DetectorId
    var FilterName: String
  }

  object DeleteFilterRequest {
    def apply(
        DetectorId: DetectorId,
        FilterName: String
    ): DeleteFilterRequest = {
      val __obj = js.Dictionary[js.Any](
        "DetectorId" -> DetectorId.asInstanceOf[js.Any],
        "FilterName" -> FilterName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteFilterRequest]
    }
  }

  @js.native
  trait DeleteFilterResponse extends js.Object {}

  object DeleteFilterResponse {
    def apply(
        ): DeleteFilterResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteFilterResponse]
    }
  }

  @js.native
  trait DeleteIPSetRequest extends js.Object {
    var DetectorId: DetectorId
    var IpSetId: String
  }

  object DeleteIPSetRequest {
    def apply(
        DetectorId: DetectorId,
        IpSetId: String
    ): DeleteIPSetRequest = {
      val __obj = js.Dictionary[js.Any](
        "DetectorId" -> DetectorId.asInstanceOf[js.Any],
        "IpSetId"    -> IpSetId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteIPSetRequest]
    }
  }

  @js.native
  trait DeleteIPSetResponse extends js.Object {}

  object DeleteIPSetResponse {
    def apply(
        ): DeleteIPSetResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteIPSetResponse]
    }
  }

  @js.native
  trait DeleteInvitationsRequest extends js.Object {
    var AccountIds: AccountIds
  }

  object DeleteInvitationsRequest {
    def apply(
        AccountIds: AccountIds
    ): DeleteInvitationsRequest = {
      val __obj = js.Dictionary[js.Any](
        "AccountIds" -> AccountIds.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteInvitationsRequest]
    }
  }

  @js.native
  trait DeleteInvitationsResponse extends js.Object {
    var UnprocessedAccounts: UnprocessedAccounts
  }

  object DeleteInvitationsResponse {
    def apply(
        UnprocessedAccounts: UnprocessedAccounts
    ): DeleteInvitationsResponse = {
      val __obj = js.Dictionary[js.Any](
        "UnprocessedAccounts" -> UnprocessedAccounts.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteInvitationsResponse]
    }
  }

  @js.native
  trait DeleteMembersRequest extends js.Object {
    var AccountIds: AccountIds
    var DetectorId: DetectorId
  }

  object DeleteMembersRequest {
    def apply(
        AccountIds: AccountIds,
        DetectorId: DetectorId
    ): DeleteMembersRequest = {
      val __obj = js.Dictionary[js.Any](
        "AccountIds" -> AccountIds.asInstanceOf[js.Any],
        "DetectorId" -> DetectorId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteMembersRequest]
    }
  }

  @js.native
  trait DeleteMembersResponse extends js.Object {
    var UnprocessedAccounts: UnprocessedAccounts
  }

  object DeleteMembersResponse {
    def apply(
        UnprocessedAccounts: UnprocessedAccounts
    ): DeleteMembersResponse = {
      val __obj = js.Dictionary[js.Any](
        "UnprocessedAccounts" -> UnprocessedAccounts.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteMembersResponse]
    }
  }

  @js.native
  trait DeleteThreatIntelSetRequest extends js.Object {
    var DetectorId: DetectorId
    var ThreatIntelSetId: String
  }

  object DeleteThreatIntelSetRequest {
    def apply(
        DetectorId: DetectorId,
        ThreatIntelSetId: String
    ): DeleteThreatIntelSetRequest = {
      val __obj = js.Dictionary[js.Any](
        "DetectorId"       -> DetectorId.asInstanceOf[js.Any],
        "ThreatIntelSetId" -> ThreatIntelSetId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteThreatIntelSetRequest]
    }
  }

  @js.native
  trait DeleteThreatIntelSetResponse extends js.Object {}

  object DeleteThreatIntelSetResponse {
    def apply(
        ): DeleteThreatIntelSetResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteThreatIntelSetResponse]
    }
  }

  object DetectorStatusEnum {
    val ENABLED  = "ENABLED"
    val DISABLED = "DISABLED"

    val values = js.Object.freeze(js.Array(ENABLED, DISABLED))
  }

  @js.native
  trait DisassociateFromMasterAccountRequest extends js.Object {
    var DetectorId: DetectorId
  }

  object DisassociateFromMasterAccountRequest {
    def apply(
        DetectorId: DetectorId
    ): DisassociateFromMasterAccountRequest = {
      val __obj = js.Dictionary[js.Any](
        "DetectorId" -> DetectorId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DisassociateFromMasterAccountRequest]
    }
  }

  @js.native
  trait DisassociateFromMasterAccountResponse extends js.Object {}

  object DisassociateFromMasterAccountResponse {
    def apply(
        ): DisassociateFromMasterAccountResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DisassociateFromMasterAccountResponse]
    }
  }

  @js.native
  trait DisassociateMembersRequest extends js.Object {
    var AccountIds: AccountIds
    var DetectorId: DetectorId
  }

  object DisassociateMembersRequest {
    def apply(
        AccountIds: AccountIds,
        DetectorId: DetectorId
    ): DisassociateMembersRequest = {
      val __obj = js.Dictionary[js.Any](
        "AccountIds" -> AccountIds.asInstanceOf[js.Any],
        "DetectorId" -> DetectorId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DisassociateMembersRequest]
    }
  }

  @js.native
  trait DisassociateMembersResponse extends js.Object {
    var UnprocessedAccounts: UnprocessedAccounts
  }

  object DisassociateMembersResponse {
    def apply(
        UnprocessedAccounts: UnprocessedAccounts
    ): DisassociateMembersResponse = {
      val __obj = js.Dictionary[js.Any](
        "UnprocessedAccounts" -> UnprocessedAccounts.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DisassociateMembersResponse]
    }
  }

  /**
    * Contains information about the DNS request.
    */
  @js.native
  trait DnsRequestAction extends js.Object {
    var Domain: js.UndefOr[String]
  }

  object DnsRequestAction {
    def apply(
        Domain: js.UndefOr[String] = js.undefined
    ): DnsRequestAction = {
      val __obj = js.Dictionary.empty[js.Any]
      Domain.foreach(__v => __obj.update("Domain", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DnsRequestAction]
    }
  }

  /**
    * Contains information about the domain.
    */
  @js.native
  trait DomainDetails extends js.Object {
    var Domain: js.UndefOr[String]
  }

  object DomainDetails {
    def apply(
        Domain: js.UndefOr[String] = js.undefined
    ): DomainDetails = {
      val __obj = js.Dictionary.empty[js.Any]
      Domain.foreach(__v => __obj.update("Domain", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DomainDetails]
    }
  }

  /**
    * Contains information about the reason that the finding was generated.
    */
  @js.native
  trait Evidence extends js.Object {
    var ThreatIntelligenceDetails: js.UndefOr[ThreatIntelligenceDetails]
  }

  object Evidence {
    def apply(
        ThreatIntelligenceDetails: js.UndefOr[ThreatIntelligenceDetails] = js.undefined
    ): Evidence = {
      val __obj = js.Dictionary.empty[js.Any]
      ThreatIntelligenceDetails.foreach(__v => __obj.update("ThreatIntelligenceDetails", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Evidence]
    }
  }

  object FeedbackEnum {
    val USEFUL     = "USEFUL"
    val NOT_USEFUL = "NOT_USEFUL"

    val values = js.Object.freeze(js.Array(USEFUL, NOT_USEFUL))
  }

  object FilterActionEnum {
    val NOOP    = "NOOP"
    val ARCHIVE = "ARCHIVE"

    val values = js.Object.freeze(js.Array(NOOP, ARCHIVE))
  }

  /**
    * Contains information about the finding.
    */
  @js.native
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

  object Finding {
    def apply(
        AccountId: String,
        Arn: String,
        CreatedAt: String,
        Id: String,
        Region: String,
        Resource: Resource,
        SchemaVersion: String,
        Severity: Double,
        Type: FindingType,
        UpdatedAt: String,
        Confidence: js.UndefOr[Double] = js.undefined,
        Description: js.UndefOr[String] = js.undefined,
        Partition: js.UndefOr[String] = js.undefined,
        Service: js.UndefOr[Service] = js.undefined,
        Title: js.UndefOr[String] = js.undefined
    ): Finding = {
      val __obj = js.Dictionary[js.Any](
        "AccountId"     -> AccountId.asInstanceOf[js.Any],
        "Arn"           -> Arn.asInstanceOf[js.Any],
        "CreatedAt"     -> CreatedAt.asInstanceOf[js.Any],
        "Id"            -> Id.asInstanceOf[js.Any],
        "Region"        -> Region.asInstanceOf[js.Any],
        "Resource"      -> Resource.asInstanceOf[js.Any],
        "SchemaVersion" -> SchemaVersion.asInstanceOf[js.Any],
        "Severity"      -> Severity.asInstanceOf[js.Any],
        "Type"          -> Type.asInstanceOf[js.Any],
        "UpdatedAt"     -> UpdatedAt.asInstanceOf[js.Any]
      )

      Confidence.foreach(__v => __obj.update("Confidence", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      Partition.foreach(__v => __obj.update("Partition", __v.asInstanceOf[js.Any]))
      Service.foreach(__v => __obj.update("Service", __v.asInstanceOf[js.Any]))
      Title.foreach(__v => __obj.update("Title", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Finding]
    }
  }

  /**
    * Contains finding criteria information.
    */
  @js.native
  trait FindingCriteria extends js.Object {
    var Criterion: js.UndefOr[Criterion]
  }

  object FindingCriteria {
    def apply(
        Criterion: js.UndefOr[Criterion] = js.undefined
    ): FindingCriteria = {
      val __obj = js.Dictionary.empty[js.Any]
      Criterion.foreach(__v => __obj.update("Criterion", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FindingCriteria]
    }
  }

  object FindingPublishingFrequencyEnum {
    val FIFTEEN_MINUTES = "FIFTEEN_MINUTES"
    val ONE_HOUR        = "ONE_HOUR"
    val SIX_HOURS       = "SIX_HOURS"

    val values = js.Object.freeze(js.Array(FIFTEEN_MINUTES, ONE_HOUR, SIX_HOURS))
  }

  object FindingStatisticTypeEnum {
    val COUNT_BY_SEVERITY = "COUNT_BY_SEVERITY"

    val values = js.Object.freeze(js.Array(COUNT_BY_SEVERITY))
  }

  /**
    * Contains information about finding statistics.
    */
  @js.native
  trait FindingStatistics extends js.Object {
    var CountBySeverity: js.UndefOr[CountBySeverity]
  }

  object FindingStatistics {
    def apply(
        CountBySeverity: js.UndefOr[CountBySeverity] = js.undefined
    ): FindingStatistics = {
      val __obj = js.Dictionary.empty[js.Any]
      CountBySeverity.foreach(__v => __obj.update("CountBySeverity", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FindingStatistics]
    }
  }

  /**
    * Contains information about the
    */
  @js.native
  trait GeoLocation extends js.Object {
    var Lat: js.UndefOr[Double]
    var Lon: js.UndefOr[Double]
  }

  object GeoLocation {
    def apply(
        Lat: js.UndefOr[Double] = js.undefined,
        Lon: js.UndefOr[Double] = js.undefined
    ): GeoLocation = {
      val __obj = js.Dictionary.empty[js.Any]
      Lat.foreach(__v => __obj.update("Lat", __v.asInstanceOf[js.Any]))
      Lon.foreach(__v => __obj.update("Lon", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GeoLocation]
    }
  }

  @js.native
  trait GetDetectorRequest extends js.Object {
    var DetectorId: DetectorId
  }

  object GetDetectorRequest {
    def apply(
        DetectorId: DetectorId
    ): GetDetectorRequest = {
      val __obj = js.Dictionary[js.Any](
        "DetectorId" -> DetectorId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetDetectorRequest]
    }
  }

  @js.native
  trait GetDetectorResponse extends js.Object {
    var ServiceRole: String
    var Status: DetectorStatus
    var CreatedAt: js.UndefOr[String]
    var FindingPublishingFrequency: js.UndefOr[FindingPublishingFrequency]
    var Tags: js.UndefOr[TagMap]
    var UpdatedAt: js.UndefOr[String]
  }

  object GetDetectorResponse {
    def apply(
        ServiceRole: String,
        Status: DetectorStatus,
        CreatedAt: js.UndefOr[String] = js.undefined,
        FindingPublishingFrequency: js.UndefOr[FindingPublishingFrequency] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined,
        UpdatedAt: js.UndefOr[String] = js.undefined
    ): GetDetectorResponse = {
      val __obj = js.Dictionary[js.Any](
        "ServiceRole" -> ServiceRole.asInstanceOf[js.Any],
        "Status"      -> Status.asInstanceOf[js.Any]
      )

      CreatedAt.foreach(__v => __obj.update("CreatedAt", __v.asInstanceOf[js.Any]))
      FindingPublishingFrequency.foreach(__v => __obj.update("FindingPublishingFrequency", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      UpdatedAt.foreach(__v => __obj.update("UpdatedAt", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDetectorResponse]
    }
  }

  @js.native
  trait GetFilterRequest extends js.Object {
    var DetectorId: DetectorId
    var FilterName: String
  }

  object GetFilterRequest {
    def apply(
        DetectorId: DetectorId,
        FilterName: String
    ): GetFilterRequest = {
      val __obj = js.Dictionary[js.Any](
        "DetectorId" -> DetectorId.asInstanceOf[js.Any],
        "FilterName" -> FilterName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetFilterRequest]
    }
  }

  @js.native
  trait GetFilterResponse extends js.Object {
    var Action: FilterAction
    var FindingCriteria: FindingCriteria
    var Name: FilterName
    var Description: js.UndefOr[FilterDescription]
    var Rank: js.UndefOr[FilterRank]
    var Tags: js.UndefOr[TagMap]
  }

  object GetFilterResponse {
    def apply(
        Action: FilterAction,
        FindingCriteria: FindingCriteria,
        Name: FilterName,
        Description: js.UndefOr[FilterDescription] = js.undefined,
        Rank: js.UndefOr[FilterRank] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): GetFilterResponse = {
      val __obj = js.Dictionary[js.Any](
        "Action"          -> Action.asInstanceOf[js.Any],
        "FindingCriteria" -> FindingCriteria.asInstanceOf[js.Any],
        "Name"            -> Name.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      Rank.foreach(__v => __obj.update("Rank", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFilterResponse]
    }
  }

  @js.native
  trait GetFindingsRequest extends js.Object {
    var DetectorId: DetectorId
    var FindingIds: FindingIds
    var SortCriteria: js.UndefOr[SortCriteria]
  }

  object GetFindingsRequest {
    def apply(
        DetectorId: DetectorId,
        FindingIds: FindingIds,
        SortCriteria: js.UndefOr[SortCriteria] = js.undefined
    ): GetFindingsRequest = {
      val __obj = js.Dictionary[js.Any](
        "DetectorId" -> DetectorId.asInstanceOf[js.Any],
        "FindingIds" -> FindingIds.asInstanceOf[js.Any]
      )

      SortCriteria.foreach(__v => __obj.update("SortCriteria", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFindingsRequest]
    }
  }

  @js.native
  trait GetFindingsResponse extends js.Object {
    var Findings: Findings
  }

  object GetFindingsResponse {
    def apply(
        Findings: Findings
    ): GetFindingsResponse = {
      val __obj = js.Dictionary[js.Any](
        "Findings" -> Findings.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetFindingsResponse]
    }
  }

  @js.native
  trait GetFindingsStatisticsRequest extends js.Object {
    var DetectorId: DetectorId
    var FindingStatisticTypes: FindingStatisticTypes
    var FindingCriteria: js.UndefOr[FindingCriteria]
  }

  object GetFindingsStatisticsRequest {
    def apply(
        DetectorId: DetectorId,
        FindingStatisticTypes: FindingStatisticTypes,
        FindingCriteria: js.UndefOr[FindingCriteria] = js.undefined
    ): GetFindingsStatisticsRequest = {
      val __obj = js.Dictionary[js.Any](
        "DetectorId"            -> DetectorId.asInstanceOf[js.Any],
        "FindingStatisticTypes" -> FindingStatisticTypes.asInstanceOf[js.Any]
      )

      FindingCriteria.foreach(__v => __obj.update("FindingCriteria", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFindingsStatisticsRequest]
    }
  }

  @js.native
  trait GetFindingsStatisticsResponse extends js.Object {
    var FindingStatistics: FindingStatistics
  }

  object GetFindingsStatisticsResponse {
    def apply(
        FindingStatistics: FindingStatistics
    ): GetFindingsStatisticsResponse = {
      val __obj = js.Dictionary[js.Any](
        "FindingStatistics" -> FindingStatistics.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetFindingsStatisticsResponse]
    }
  }

  @js.native
  trait GetIPSetRequest extends js.Object {
    var DetectorId: DetectorId
    var IpSetId: String
  }

  object GetIPSetRequest {
    def apply(
        DetectorId: DetectorId,
        IpSetId: String
    ): GetIPSetRequest = {
      val __obj = js.Dictionary[js.Any](
        "DetectorId" -> DetectorId.asInstanceOf[js.Any],
        "IpSetId"    -> IpSetId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetIPSetRequest]
    }
  }

  @js.native
  trait GetIPSetResponse extends js.Object {
    var Format: IpSetFormat
    var Location: Location
    var Name: Name
    var Status: IpSetStatus
    var Tags: js.UndefOr[TagMap]
  }

  object GetIPSetResponse {
    def apply(
        Format: IpSetFormat,
        Location: Location,
        Name: Name,
        Status: IpSetStatus,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): GetIPSetResponse = {
      val __obj = js.Dictionary[js.Any](
        "Format"   -> Format.asInstanceOf[js.Any],
        "Location" -> Location.asInstanceOf[js.Any],
        "Name"     -> Name.asInstanceOf[js.Any],
        "Status"   -> Status.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetIPSetResponse]
    }
  }

  @js.native
  trait GetInvitationsCountRequest extends js.Object {}

  object GetInvitationsCountRequest {
    def apply(
        ): GetInvitationsCountRequest = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[GetInvitationsCountRequest]
    }
  }

  @js.native
  trait GetInvitationsCountResponse extends js.Object {
    var InvitationsCount: js.UndefOr[Int]
  }

  object GetInvitationsCountResponse {
    def apply(
        InvitationsCount: js.UndefOr[Int] = js.undefined
    ): GetInvitationsCountResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      InvitationsCount.foreach(__v => __obj.update("InvitationsCount", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetInvitationsCountResponse]
    }
  }

  @js.native
  trait GetMasterAccountRequest extends js.Object {
    var DetectorId: DetectorId
  }

  object GetMasterAccountRequest {
    def apply(
        DetectorId: DetectorId
    ): GetMasterAccountRequest = {
      val __obj = js.Dictionary[js.Any](
        "DetectorId" -> DetectorId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetMasterAccountRequest]
    }
  }

  @js.native
  trait GetMasterAccountResponse extends js.Object {
    var Master: Master
  }

  object GetMasterAccountResponse {
    def apply(
        Master: Master
    ): GetMasterAccountResponse = {
      val __obj = js.Dictionary[js.Any](
        "Master" -> Master.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetMasterAccountResponse]
    }
  }

  @js.native
  trait GetMembersRequest extends js.Object {
    var AccountIds: AccountIds
    var DetectorId: DetectorId
  }

  object GetMembersRequest {
    def apply(
        AccountIds: AccountIds,
        DetectorId: DetectorId
    ): GetMembersRequest = {
      val __obj = js.Dictionary[js.Any](
        "AccountIds" -> AccountIds.asInstanceOf[js.Any],
        "DetectorId" -> DetectorId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetMembersRequest]
    }
  }

  @js.native
  trait GetMembersResponse extends js.Object {
    var Members: Members
    var UnprocessedAccounts: UnprocessedAccounts
  }

  object GetMembersResponse {
    def apply(
        Members: Members,
        UnprocessedAccounts: UnprocessedAccounts
    ): GetMembersResponse = {
      val __obj = js.Dictionary[js.Any](
        "Members"             -> Members.asInstanceOf[js.Any],
        "UnprocessedAccounts" -> UnprocessedAccounts.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetMembersResponse]
    }
  }

  @js.native
  trait GetThreatIntelSetRequest extends js.Object {
    var DetectorId: DetectorId
    var ThreatIntelSetId: String
  }

  object GetThreatIntelSetRequest {
    def apply(
        DetectorId: DetectorId,
        ThreatIntelSetId: String
    ): GetThreatIntelSetRequest = {
      val __obj = js.Dictionary[js.Any](
        "DetectorId"       -> DetectorId.asInstanceOf[js.Any],
        "ThreatIntelSetId" -> ThreatIntelSetId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetThreatIntelSetRequest]
    }
  }

  @js.native
  trait GetThreatIntelSetResponse extends js.Object {
    var Format: ThreatIntelSetFormat
    var Location: Location
    var Name: Name
    var Status: ThreatIntelSetStatus
    var Tags: js.UndefOr[TagMap]
  }

  object GetThreatIntelSetResponse {
    def apply(
        Format: ThreatIntelSetFormat,
        Location: Location,
        Name: Name,
        Status: ThreatIntelSetStatus,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): GetThreatIntelSetResponse = {
      val __obj = js.Dictionary[js.Any](
        "Format"   -> Format.asInstanceOf[js.Any],
        "Location" -> Location.asInstanceOf[js.Any],
        "Name"     -> Name.asInstanceOf[js.Any],
        "Status"   -> Status.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetThreatIntelSetResponse]
    }
  }

  /**
    * Contains information about the instance profile.
    */
  @js.native
  trait IamInstanceProfile extends js.Object {
    var Arn: js.UndefOr[String]
    var Id: js.UndefOr[String]
  }

  object IamInstanceProfile {
    def apply(
        Arn: js.UndefOr[String] = js.undefined,
        Id: js.UndefOr[String] = js.undefined
    ): IamInstanceProfile = {
      val __obj = js.Dictionary.empty[js.Any]
      Arn.foreach(__v => __obj.update("Arn", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IamInstanceProfile]
    }
  }

  /**
    * Contains information about the details of an instance.
    */
  @js.native
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

  object InstanceDetails {
    def apply(
        AvailabilityZone: js.UndefOr[String] = js.undefined,
        IamInstanceProfile: js.UndefOr[IamInstanceProfile] = js.undefined,
        ImageDescription: js.UndefOr[String] = js.undefined,
        ImageId: js.UndefOr[String] = js.undefined,
        InstanceId: js.UndefOr[String] = js.undefined,
        InstanceState: js.UndefOr[String] = js.undefined,
        InstanceType: js.UndefOr[String] = js.undefined,
        LaunchTime: js.UndefOr[String] = js.undefined,
        NetworkInterfaces: js.UndefOr[NetworkInterfaces] = js.undefined,
        Platform: js.UndefOr[String] = js.undefined,
        ProductCodes: js.UndefOr[ProductCodes] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): InstanceDetails = {
      val __obj = js.Dictionary.empty[js.Any]
      AvailabilityZone.foreach(__v => __obj.update("AvailabilityZone", __v.asInstanceOf[js.Any]))
      IamInstanceProfile.foreach(__v => __obj.update("IamInstanceProfile", __v.asInstanceOf[js.Any]))
      ImageDescription.foreach(__v => __obj.update("ImageDescription", __v.asInstanceOf[js.Any]))
      ImageId.foreach(__v => __obj.update("ImageId", __v.asInstanceOf[js.Any]))
      InstanceId.foreach(__v => __obj.update("InstanceId", __v.asInstanceOf[js.Any]))
      InstanceState.foreach(__v => __obj.update("InstanceState", __v.asInstanceOf[js.Any]))
      InstanceType.foreach(__v => __obj.update("InstanceType", __v.asInstanceOf[js.Any]))
      LaunchTime.foreach(__v => __obj.update("LaunchTime", __v.asInstanceOf[js.Any]))
      NetworkInterfaces.foreach(__v => __obj.update("NetworkInterfaces", __v.asInstanceOf[js.Any]))
      Platform.foreach(__v => __obj.update("Platform", __v.asInstanceOf[js.Any]))
      ProductCodes.foreach(__v => __obj.update("ProductCodes", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceDetails]
    }
  }

  /**
    * Contains information about the invitation.
    */
  @js.native
  trait Invitation extends js.Object {
    var AccountId: js.UndefOr[AccountId]
    var InvitationId: js.UndefOr[String]
    var InvitedAt: js.UndefOr[String]
    var RelationshipStatus: js.UndefOr[String]
  }

  object Invitation {
    def apply(
        AccountId: js.UndefOr[AccountId] = js.undefined,
        InvitationId: js.UndefOr[String] = js.undefined,
        InvitedAt: js.UndefOr[String] = js.undefined,
        RelationshipStatus: js.UndefOr[String] = js.undefined
    ): Invitation = {
      val __obj = js.Dictionary.empty[js.Any]
      AccountId.foreach(__v => __obj.update("AccountId", __v.asInstanceOf[js.Any]))
      InvitationId.foreach(__v => __obj.update("InvitationId", __v.asInstanceOf[js.Any]))
      InvitedAt.foreach(__v => __obj.update("InvitedAt", __v.asInstanceOf[js.Any]))
      RelationshipStatus.foreach(__v => __obj.update("RelationshipStatus", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Invitation]
    }
  }

  @js.native
  trait InviteMembersRequest extends js.Object {
    var AccountIds: AccountIds
    var DetectorId: DetectorId
    var DisableEmailNotification: js.UndefOr[Boolean]
    var Message: js.UndefOr[String]
  }

  object InviteMembersRequest {
    def apply(
        AccountIds: AccountIds,
        DetectorId: DetectorId,
        DisableEmailNotification: js.UndefOr[Boolean] = js.undefined,
        Message: js.UndefOr[String] = js.undefined
    ): InviteMembersRequest = {
      val __obj = js.Dictionary[js.Any](
        "AccountIds" -> AccountIds.asInstanceOf[js.Any],
        "DetectorId" -> DetectorId.asInstanceOf[js.Any]
      )

      DisableEmailNotification.foreach(__v => __obj.update("DisableEmailNotification", __v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.update("Message", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InviteMembersRequest]
    }
  }

  @js.native
  trait InviteMembersResponse extends js.Object {
    var UnprocessedAccounts: UnprocessedAccounts
  }

  object InviteMembersResponse {
    def apply(
        UnprocessedAccounts: UnprocessedAccounts
    ): InviteMembersResponse = {
      val __obj = js.Dictionary[js.Any](
        "UnprocessedAccounts" -> UnprocessedAccounts.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[InviteMembersResponse]
    }
  }

  object IpSetFormatEnum {
    val TXT         = "TXT"
    val STIX        = "STIX"
    val OTX_CSV     = "OTX_CSV"
    val ALIEN_VAULT = "ALIEN_VAULT"
    val PROOF_POINT = "PROOF_POINT"
    val FIRE_EYE    = "FIRE_EYE"

    val values = js.Object.freeze(js.Array(TXT, STIX, OTX_CSV, ALIEN_VAULT, PROOF_POINT, FIRE_EYE))
  }

  object IpSetStatusEnum {
    val INACTIVE       = "INACTIVE"
    val ACTIVATING     = "ACTIVATING"
    val ACTIVE         = "ACTIVE"
    val DEACTIVATING   = "DEACTIVATING"
    val ERROR          = "ERROR"
    val DELETE_PENDING = "DELETE_PENDING"
    val DELETED        = "DELETED"

    val values = js.Object.freeze(js.Array(INACTIVE, ACTIVATING, ACTIVE, DEACTIVATING, ERROR, DELETE_PENDING, DELETED))
  }

  @js.native
  trait ListDetectorsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  object ListDetectorsRequest {
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListDetectorsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDetectorsRequest]
    }
  }

  @js.native
  trait ListDetectorsResponse extends js.Object {
    var DetectorIds: DetectorIds
    var NextToken: js.UndefOr[String]
  }

  object ListDetectorsResponse {
    def apply(
        DetectorIds: DetectorIds,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListDetectorsResponse = {
      val __obj = js.Dictionary[js.Any](
        "DetectorIds" -> DetectorIds.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDetectorsResponse]
    }
  }

  @js.native
  trait ListFiltersRequest extends js.Object {
    var DetectorId: DetectorId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  object ListFiltersRequest {
    def apply(
        DetectorId: DetectorId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListFiltersRequest = {
      val __obj = js.Dictionary[js.Any](
        "DetectorId" -> DetectorId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFiltersRequest]
    }
  }

  @js.native
  trait ListFiltersResponse extends js.Object {
    var FilterNames: FilterNames
    var NextToken: js.UndefOr[String]
  }

  object ListFiltersResponse {
    def apply(
        FilterNames: FilterNames,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListFiltersResponse = {
      val __obj = js.Dictionary[js.Any](
        "FilterNames" -> FilterNames.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFiltersResponse]
    }
  }

  @js.native
  trait ListFindingsRequest extends js.Object {
    var DetectorId: DetectorId
    var FindingCriteria: js.UndefOr[FindingCriteria]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
    var SortCriteria: js.UndefOr[SortCriteria]
  }

  object ListFindingsRequest {
    def apply(
        DetectorId: DetectorId,
        FindingCriteria: js.UndefOr[FindingCriteria] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        SortCriteria: js.UndefOr[SortCriteria] = js.undefined
    ): ListFindingsRequest = {
      val __obj = js.Dictionary[js.Any](
        "DetectorId" -> DetectorId.asInstanceOf[js.Any]
      )

      FindingCriteria.foreach(__v => __obj.update("FindingCriteria", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      SortCriteria.foreach(__v => __obj.update("SortCriteria", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFindingsRequest]
    }
  }

  @js.native
  trait ListFindingsResponse extends js.Object {
    var FindingIds: FindingIds
    var NextToken: js.UndefOr[String]
  }

  object ListFindingsResponse {
    def apply(
        FindingIds: FindingIds,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListFindingsResponse = {
      val __obj = js.Dictionary[js.Any](
        "FindingIds" -> FindingIds.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFindingsResponse]
    }
  }

  @js.native
  trait ListIPSetsRequest extends js.Object {
    var DetectorId: DetectorId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  object ListIPSetsRequest {
    def apply(
        DetectorId: DetectorId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListIPSetsRequest = {
      val __obj = js.Dictionary[js.Any](
        "DetectorId" -> DetectorId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListIPSetsRequest]
    }
  }

  @js.native
  trait ListIPSetsResponse extends js.Object {
    var IpSetIds: IpSetIds
    var NextToken: js.UndefOr[String]
  }

  object ListIPSetsResponse {
    def apply(
        IpSetIds: IpSetIds,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListIPSetsResponse = {
      val __obj = js.Dictionary[js.Any](
        "IpSetIds" -> IpSetIds.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListIPSetsResponse]
    }
  }

  @js.native
  trait ListInvitationsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  object ListInvitationsRequest {
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListInvitationsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInvitationsRequest]
    }
  }

  @js.native
  trait ListInvitationsResponse extends js.Object {
    var Invitations: js.UndefOr[Invitations]
    var NextToken: js.UndefOr[String]
  }

  object ListInvitationsResponse {
    def apply(
        Invitations: js.UndefOr[Invitations] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListInvitationsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Invitations.foreach(__v => __obj.update("Invitations", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInvitationsResponse]
    }
  }

  @js.native
  trait ListMembersRequest extends js.Object {
    var DetectorId: DetectorId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
    var OnlyAssociated: js.UndefOr[String]
  }

  object ListMembersRequest {
    def apply(
        DetectorId: DetectorId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        OnlyAssociated: js.UndefOr[String] = js.undefined
    ): ListMembersRequest = {
      val __obj = js.Dictionary[js.Any](
        "DetectorId" -> DetectorId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      OnlyAssociated.foreach(__v => __obj.update("OnlyAssociated", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMembersRequest]
    }
  }

  @js.native
  trait ListMembersResponse extends js.Object {
    var Members: js.UndefOr[Members]
    var NextToken: js.UndefOr[String]
  }

  object ListMembersResponse {
    def apply(
        Members: js.UndefOr[Members] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListMembersResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Members.foreach(__v => __obj.update("Members", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMembersResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: GuardDutyArn
  }

  object ListTagsForResourceRequest {
    def apply(
        ResourceArn: GuardDutyArn
    ): ListTagsForResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[TagMap]
  }

  object ListTagsForResourceResponse {
    def apply(
        Tags: js.UndefOr[TagMap] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  @js.native
  trait ListThreatIntelSetsRequest extends js.Object {
    var DetectorId: DetectorId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  object ListThreatIntelSetsRequest {
    def apply(
        DetectorId: DetectorId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListThreatIntelSetsRequest = {
      val __obj = js.Dictionary[js.Any](
        "DetectorId" -> DetectorId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListThreatIntelSetsRequest]
    }
  }

  @js.native
  trait ListThreatIntelSetsResponse extends js.Object {
    var ThreatIntelSetIds: ThreatIntelSetIds
    var NextToken: js.UndefOr[String]
  }

  object ListThreatIntelSetsResponse {
    def apply(
        ThreatIntelSetIds: ThreatIntelSetIds,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListThreatIntelSetsResponse = {
      val __obj = js.Dictionary[js.Any](
        "ThreatIntelSetIds" -> ThreatIntelSetIds.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListThreatIntelSetsResponse]
    }
  }

  /**
    * Contains information about the port for the local connection.
    */
  @js.native
  trait LocalPortDetails extends js.Object {
    var Port: js.UndefOr[Int]
    var PortName: js.UndefOr[String]
  }

  object LocalPortDetails {
    def apply(
        Port: js.UndefOr[Int] = js.undefined,
        PortName: js.UndefOr[String] = js.undefined
    ): LocalPortDetails = {
      val __obj = js.Dictionary.empty[js.Any]
      Port.foreach(__v => __obj.update("Port", __v.asInstanceOf[js.Any]))
      PortName.foreach(__v => __obj.update("PortName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LocalPortDetails]
    }
  }

  /**
    * Contains information about the Master account and invitation.
    */
  @js.native
  trait Master extends js.Object {
    var AccountId: js.UndefOr[AccountId]
    var InvitationId: js.UndefOr[String]
    var InvitedAt: js.UndefOr[String]
    var RelationshipStatus: js.UndefOr[String]
  }

  object Master {
    def apply(
        AccountId: js.UndefOr[AccountId] = js.undefined,
        InvitationId: js.UndefOr[String] = js.undefined,
        InvitedAt: js.UndefOr[String] = js.undefined,
        RelationshipStatus: js.UndefOr[String] = js.undefined
    ): Master = {
      val __obj = js.Dictionary.empty[js.Any]
      AccountId.foreach(__v => __obj.update("AccountId", __v.asInstanceOf[js.Any]))
      InvitationId.foreach(__v => __obj.update("InvitationId", __v.asInstanceOf[js.Any]))
      InvitedAt.foreach(__v => __obj.update("InvitedAt", __v.asInstanceOf[js.Any]))
      RelationshipStatus.foreach(__v => __obj.update("RelationshipStatus", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Master]
    }
  }

  /**
    * Continas information about the member account
    */
  @js.native
  trait Member extends js.Object {
    var AccountId: AccountId
    var Email: Email
    var MasterId: String
    var RelationshipStatus: String
    var UpdatedAt: String
    var DetectorId: js.UndefOr[DetectorId]
    var InvitedAt: js.UndefOr[String]
  }

  object Member {
    def apply(
        AccountId: AccountId,
        Email: Email,
        MasterId: String,
        RelationshipStatus: String,
        UpdatedAt: String,
        DetectorId: js.UndefOr[DetectorId] = js.undefined,
        InvitedAt: js.UndefOr[String] = js.undefined
    ): Member = {
      val __obj = js.Dictionary[js.Any](
        "AccountId"          -> AccountId.asInstanceOf[js.Any],
        "Email"              -> Email.asInstanceOf[js.Any],
        "MasterId"           -> MasterId.asInstanceOf[js.Any],
        "RelationshipStatus" -> RelationshipStatus.asInstanceOf[js.Any],
        "UpdatedAt"          -> UpdatedAt.asInstanceOf[js.Any]
      )

      DetectorId.foreach(__v => __obj.update("DetectorId", __v.asInstanceOf[js.Any]))
      InvitedAt.foreach(__v => __obj.update("InvitedAt", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Member]
    }
  }

  /**
    * Contains information about the network connection.
    */
  @js.native
  trait NetworkConnectionAction extends js.Object {
    var Blocked: js.UndefOr[Boolean]
    var ConnectionDirection: js.UndefOr[String]
    var LocalPortDetails: js.UndefOr[LocalPortDetails]
    var Protocol: js.UndefOr[String]
    var RemoteIpDetails: js.UndefOr[RemoteIpDetails]
    var RemotePortDetails: js.UndefOr[RemotePortDetails]
  }

  object NetworkConnectionAction {
    def apply(
        Blocked: js.UndefOr[Boolean] = js.undefined,
        ConnectionDirection: js.UndefOr[String] = js.undefined,
        LocalPortDetails: js.UndefOr[LocalPortDetails] = js.undefined,
        Protocol: js.UndefOr[String] = js.undefined,
        RemoteIpDetails: js.UndefOr[RemoteIpDetails] = js.undefined,
        RemotePortDetails: js.UndefOr[RemotePortDetails] = js.undefined
    ): NetworkConnectionAction = {
      val __obj = js.Dictionary.empty[js.Any]
      Blocked.foreach(__v => __obj.update("Blocked", __v.asInstanceOf[js.Any]))
      ConnectionDirection.foreach(__v => __obj.update("ConnectionDirection", __v.asInstanceOf[js.Any]))
      LocalPortDetails.foreach(__v => __obj.update("LocalPortDetails", __v.asInstanceOf[js.Any]))
      Protocol.foreach(__v => __obj.update("Protocol", __v.asInstanceOf[js.Any]))
      RemoteIpDetails.foreach(__v => __obj.update("RemoteIpDetails", __v.asInstanceOf[js.Any]))
      RemotePortDetails.foreach(__v => __obj.update("RemotePortDetails", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkConnectionAction]
    }
  }

  /**
    * Contains information about the network interface.
    */
  @js.native
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

  object NetworkInterface {
    def apply(
        Ipv6Addresses: js.UndefOr[Ipv6Addresses] = js.undefined,
        NetworkInterfaceId: js.UndefOr[String] = js.undefined,
        PrivateDnsName: js.UndefOr[String] = js.undefined,
        PrivateIpAddress: js.UndefOr[String] = js.undefined,
        PrivateIpAddresses: js.UndefOr[PrivateIpAddresses] = js.undefined,
        PublicDnsName: js.UndefOr[String] = js.undefined,
        PublicIp: js.UndefOr[String] = js.undefined,
        SecurityGroups: js.UndefOr[SecurityGroups] = js.undefined,
        SubnetId: js.UndefOr[String] = js.undefined,
        VpcId: js.UndefOr[String] = js.undefined
    ): NetworkInterface = {
      val __obj = js.Dictionary.empty[js.Any]
      Ipv6Addresses.foreach(__v => __obj.update("Ipv6Addresses", __v.asInstanceOf[js.Any]))
      NetworkInterfaceId.foreach(__v => __obj.update("NetworkInterfaceId", __v.asInstanceOf[js.Any]))
      PrivateDnsName.foreach(__v => __obj.update("PrivateDnsName", __v.asInstanceOf[js.Any]))
      PrivateIpAddress.foreach(__v => __obj.update("PrivateIpAddress", __v.asInstanceOf[js.Any]))
      PrivateIpAddresses.foreach(__v => __obj.update("PrivateIpAddresses", __v.asInstanceOf[js.Any]))
      PublicDnsName.foreach(__v => __obj.update("PublicDnsName", __v.asInstanceOf[js.Any]))
      PublicIp.foreach(__v => __obj.update("PublicIp", __v.asInstanceOf[js.Any]))
      SecurityGroups.foreach(__v => __obj.update("SecurityGroups", __v.asInstanceOf[js.Any]))
      SubnetId.foreach(__v => __obj.update("SubnetId", __v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.update("VpcId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkInterface]
    }
  }

  object OrderByEnum {
    val ASC  = "ASC"
    val DESC = "DESC"

    val values = js.Object.freeze(js.Array(ASC, DESC))
  }

  /**
    * Continas information about the organization.
    */
  @js.native
  trait Organization extends js.Object {
    var Asn: js.UndefOr[String]
    var AsnOrg: js.UndefOr[String]
    var Isp: js.UndefOr[String]
    var Org: js.UndefOr[String]
  }

  object Organization {
    def apply(
        Asn: js.UndefOr[String] = js.undefined,
        AsnOrg: js.UndefOr[String] = js.undefined,
        Isp: js.UndefOr[String] = js.undefined,
        Org: js.UndefOr[String] = js.undefined
    ): Organization = {
      val __obj = js.Dictionary.empty[js.Any]
      Asn.foreach(__v => __obj.update("Asn", __v.asInstanceOf[js.Any]))
      AsnOrg.foreach(__v => __obj.update("AsnOrg", __v.asInstanceOf[js.Any]))
      Isp.foreach(__v => __obj.update("Isp", __v.asInstanceOf[js.Any]))
      Org.foreach(__v => __obj.update("Org", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Organization]
    }
  }

  /**
    * Contains information about the port probe.
    */
  @js.native
  trait PortProbeAction extends js.Object {
    var Blocked: js.UndefOr[Boolean]
    var PortProbeDetails: js.UndefOr[PortProbeDetails]
  }

  object PortProbeAction {
    def apply(
        Blocked: js.UndefOr[Boolean] = js.undefined,
        PortProbeDetails: js.UndefOr[PortProbeDetails] = js.undefined
    ): PortProbeAction = {
      val __obj = js.Dictionary.empty[js.Any]
      Blocked.foreach(__v => __obj.update("Blocked", __v.asInstanceOf[js.Any]))
      PortProbeDetails.foreach(__v => __obj.update("PortProbeDetails", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PortProbeAction]
    }
  }

  /**
    * Contains information about the port probe details.
    */
  @js.native
  trait PortProbeDetail extends js.Object {
    var LocalPortDetails: js.UndefOr[LocalPortDetails]
    var RemoteIpDetails: js.UndefOr[RemoteIpDetails]
  }

  object PortProbeDetail {
    def apply(
        LocalPortDetails: js.UndefOr[LocalPortDetails] = js.undefined,
        RemoteIpDetails: js.UndefOr[RemoteIpDetails] = js.undefined
    ): PortProbeDetail = {
      val __obj = js.Dictionary.empty[js.Any]
      LocalPortDetails.foreach(__v => __obj.update("LocalPortDetails", __v.asInstanceOf[js.Any]))
      RemoteIpDetails.foreach(__v => __obj.update("RemoteIpDetails", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PortProbeDetail]
    }
  }

  /**
    * Contains information about the private IP address.
    */
  @js.native
  trait PrivateIpAddressDetails extends js.Object {
    var PrivateDnsName: js.UndefOr[String]
    var PrivateIpAddress: js.UndefOr[String]
  }

  object PrivateIpAddressDetails {
    def apply(
        PrivateDnsName: js.UndefOr[String] = js.undefined,
        PrivateIpAddress: js.UndefOr[String] = js.undefined
    ): PrivateIpAddressDetails = {
      val __obj = js.Dictionary.empty[js.Any]
      PrivateDnsName.foreach(__v => __obj.update("PrivateDnsName", __v.asInstanceOf[js.Any]))
      PrivateIpAddress.foreach(__v => __obj.update("PrivateIpAddress", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PrivateIpAddressDetails]
    }
  }

  /**
    * Contains information about the product code.
    */
  @js.native
  trait ProductCode extends js.Object {
    var Code: js.UndefOr[String]
    var ProductType: js.UndefOr[String]
  }

  object ProductCode {
    def apply(
        Code: js.UndefOr[String] = js.undefined,
        ProductType: js.UndefOr[String] = js.undefined
    ): ProductCode = {
      val __obj = js.Dictionary.empty[js.Any]
      Code.foreach(__v => __obj.update("Code", __v.asInstanceOf[js.Any]))
      ProductType.foreach(__v => __obj.update("ProductType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProductCode]
    }
  }

  /**
    * Continas information about the remote IP address.
    */
  @js.native
  trait RemoteIpDetails extends js.Object {
    var City: js.UndefOr[City]
    var Country: js.UndefOr[Country]
    var GeoLocation: js.UndefOr[GeoLocation]
    var IpAddressV4: js.UndefOr[String]
    var Organization: js.UndefOr[Organization]
  }

  object RemoteIpDetails {
    def apply(
        City: js.UndefOr[City] = js.undefined,
        Country: js.UndefOr[Country] = js.undefined,
        GeoLocation: js.UndefOr[GeoLocation] = js.undefined,
        IpAddressV4: js.UndefOr[String] = js.undefined,
        Organization: js.UndefOr[Organization] = js.undefined
    ): RemoteIpDetails = {
      val __obj = js.Dictionary.empty[js.Any]
      City.foreach(__v => __obj.update("City", __v.asInstanceOf[js.Any]))
      Country.foreach(__v => __obj.update("Country", __v.asInstanceOf[js.Any]))
      GeoLocation.foreach(__v => __obj.update("GeoLocation", __v.asInstanceOf[js.Any]))
      IpAddressV4.foreach(__v => __obj.update("IpAddressV4", __v.asInstanceOf[js.Any]))
      Organization.foreach(__v => __obj.update("Organization", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RemoteIpDetails]
    }
  }

  /**
    * Contains information about the remote port.
    */
  @js.native
  trait RemotePortDetails extends js.Object {
    var Port: js.UndefOr[Int]
    var PortName: js.UndefOr[String]
  }

  object RemotePortDetails {
    def apply(
        Port: js.UndefOr[Int] = js.undefined,
        PortName: js.UndefOr[String] = js.undefined
    ): RemotePortDetails = {
      val __obj = js.Dictionary.empty[js.Any]
      Port.foreach(__v => __obj.update("Port", __v.asInstanceOf[js.Any]))
      PortName.foreach(__v => __obj.update("PortName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RemotePortDetails]
    }
  }

  /**
    * Contains information about the resource.
    */
  @js.native
  trait Resource extends js.Object {
    var AccessKeyDetails: js.UndefOr[AccessKeyDetails]
    var InstanceDetails: js.UndefOr[InstanceDetails]
    var ResourceType: js.UndefOr[String]
  }

  object Resource {
    def apply(
        AccessKeyDetails: js.UndefOr[AccessKeyDetails] = js.undefined,
        InstanceDetails: js.UndefOr[InstanceDetails] = js.undefined,
        ResourceType: js.UndefOr[String] = js.undefined
    ): Resource = {
      val __obj = js.Dictionary.empty[js.Any]
      AccessKeyDetails.foreach(__v => __obj.update("AccessKeyDetails", __v.asInstanceOf[js.Any]))
      InstanceDetails.foreach(__v => __obj.update("InstanceDetails", __v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.update("ResourceType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Resource]
    }
  }

  /**
    * Contains information about the security group.
    */
  @js.native
  trait SecurityGroup extends js.Object {
    var GroupId: js.UndefOr[String]
    var GroupName: js.UndefOr[String]
  }

  object SecurityGroup {
    def apply(
        GroupId: js.UndefOr[String] = js.undefined,
        GroupName: js.UndefOr[String] = js.undefined
    ): SecurityGroup = {
      val __obj = js.Dictionary.empty[js.Any]
      GroupId.foreach(__v => __obj.update("GroupId", __v.asInstanceOf[js.Any]))
      GroupName.foreach(__v => __obj.update("GroupName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SecurityGroup]
    }
  }

  /**
    * Contains information about the service.
    */
  @js.native
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

  object Service {
    def apply(
        Action: js.UndefOr[Action] = js.undefined,
        Archived: js.UndefOr[Boolean] = js.undefined,
        Count: js.UndefOr[Int] = js.undefined,
        DetectorId: js.UndefOr[DetectorId] = js.undefined,
        EventFirstSeen: js.UndefOr[String] = js.undefined,
        EventLastSeen: js.UndefOr[String] = js.undefined,
        Evidence: js.UndefOr[Evidence] = js.undefined,
        ResourceRole: js.UndefOr[String] = js.undefined,
        ServiceName: js.UndefOr[String] = js.undefined,
        UserFeedback: js.UndefOr[String] = js.undefined
    ): Service = {
      val __obj = js.Dictionary.empty[js.Any]
      Action.foreach(__v => __obj.update("Action", __v.asInstanceOf[js.Any]))
      Archived.foreach(__v => __obj.update("Archived", __v.asInstanceOf[js.Any]))
      Count.foreach(__v => __obj.update("Count", __v.asInstanceOf[js.Any]))
      DetectorId.foreach(__v => __obj.update("DetectorId", __v.asInstanceOf[js.Any]))
      EventFirstSeen.foreach(__v => __obj.update("EventFirstSeen", __v.asInstanceOf[js.Any]))
      EventLastSeen.foreach(__v => __obj.update("EventLastSeen", __v.asInstanceOf[js.Any]))
      Evidence.foreach(__v => __obj.update("Evidence", __v.asInstanceOf[js.Any]))
      ResourceRole.foreach(__v => __obj.update("ResourceRole", __v.asInstanceOf[js.Any]))
      ServiceName.foreach(__v => __obj.update("ServiceName", __v.asInstanceOf[js.Any]))
      UserFeedback.foreach(__v => __obj.update("UserFeedback", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Service]
    }
  }

  /**
    * Contains information about the criteria for sorting.
    */
  @js.native
  trait SortCriteria extends js.Object {
    var AttributeName: js.UndefOr[String]
    var OrderBy: js.UndefOr[OrderBy]
  }

  object SortCriteria {
    def apply(
        AttributeName: js.UndefOr[String] = js.undefined,
        OrderBy: js.UndefOr[OrderBy] = js.undefined
    ): SortCriteria = {
      val __obj = js.Dictionary.empty[js.Any]
      AttributeName.foreach(__v => __obj.update("AttributeName", __v.asInstanceOf[js.Any]))
      OrderBy.foreach(__v => __obj.update("OrderBy", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SortCriteria]
    }
  }

  @js.native
  trait StartMonitoringMembersRequest extends js.Object {
    var AccountIds: AccountIds
    var DetectorId: DetectorId
  }

  object StartMonitoringMembersRequest {
    def apply(
        AccountIds: AccountIds,
        DetectorId: DetectorId
    ): StartMonitoringMembersRequest = {
      val __obj = js.Dictionary[js.Any](
        "AccountIds" -> AccountIds.asInstanceOf[js.Any],
        "DetectorId" -> DetectorId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StartMonitoringMembersRequest]
    }
  }

  @js.native
  trait StartMonitoringMembersResponse extends js.Object {
    var UnprocessedAccounts: UnprocessedAccounts
  }

  object StartMonitoringMembersResponse {
    def apply(
        UnprocessedAccounts: UnprocessedAccounts
    ): StartMonitoringMembersResponse = {
      val __obj = js.Dictionary[js.Any](
        "UnprocessedAccounts" -> UnprocessedAccounts.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StartMonitoringMembersResponse]
    }
  }

  @js.native
  trait StopMonitoringMembersRequest extends js.Object {
    var AccountIds: AccountIds
    var DetectorId: DetectorId
  }

  object StopMonitoringMembersRequest {
    def apply(
        AccountIds: AccountIds,
        DetectorId: DetectorId
    ): StopMonitoringMembersRequest = {
      val __obj = js.Dictionary[js.Any](
        "AccountIds" -> AccountIds.asInstanceOf[js.Any],
        "DetectorId" -> DetectorId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StopMonitoringMembersRequest]
    }
  }

  @js.native
  trait StopMonitoringMembersResponse extends js.Object {
    var UnprocessedAccounts: UnprocessedAccounts
  }

  object StopMonitoringMembersResponse {
    def apply(
        UnprocessedAccounts: UnprocessedAccounts
    ): StopMonitoringMembersResponse = {
      val __obj = js.Dictionary[js.Any](
        "UnprocessedAccounts" -> UnprocessedAccounts.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StopMonitoringMembersResponse]
    }
  }

  /**
    * Contains information about the tag associated with the resource.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: js.UndefOr[String]
    var Value: js.UndefOr[String]
  }

  object Tag {
    def apply(
        Key: js.UndefOr[String] = js.undefined,
        Value: js.UndefOr[String] = js.undefined
    ): Tag = {
      val __obj = js.Dictionary.empty[js.Any]
      Key.foreach(__v => __obj.update("Key", __v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.update("Value", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: GuardDutyArn
    var Tags: TagMap
  }

  object TagResourceRequest {
    def apply(
        ResourceArn: GuardDutyArn,
        Tags: TagMap
    ): TagResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "Tags"        -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object {}

  object TagResourceResponse {
    def apply(
        ): TagResourceResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  object ThreatIntelSetFormatEnum {
    val TXT         = "TXT"
    val STIX        = "STIX"
    val OTX_CSV     = "OTX_CSV"
    val ALIEN_VAULT = "ALIEN_VAULT"
    val PROOF_POINT = "PROOF_POINT"
    val FIRE_EYE    = "FIRE_EYE"

    val values = js.Object.freeze(js.Array(TXT, STIX, OTX_CSV, ALIEN_VAULT, PROOF_POINT, FIRE_EYE))
  }

  object ThreatIntelSetStatusEnum {
    val INACTIVE       = "INACTIVE"
    val ACTIVATING     = "ACTIVATING"
    val ACTIVE         = "ACTIVE"
    val DEACTIVATING   = "DEACTIVATING"
    val ERROR          = "ERROR"
    val DELETE_PENDING = "DELETE_PENDING"
    val DELETED        = "DELETED"

    val values = js.Object.freeze(js.Array(INACTIVE, ACTIVATING, ACTIVE, DEACTIVATING, ERROR, DELETE_PENDING, DELETED))
  }

  /**
    * An instance of a threat intelligence detail that constitutes evidence for the finding.
    */
  @js.native
  trait ThreatIntelligenceDetail extends js.Object {
    var ThreatListName: js.UndefOr[String]
    var ThreatNames: js.UndefOr[ThreatNames]
  }

  object ThreatIntelligenceDetail {
    def apply(
        ThreatListName: js.UndefOr[String] = js.undefined,
        ThreatNames: js.UndefOr[ThreatNames] = js.undefined
    ): ThreatIntelligenceDetail = {
      val __obj = js.Dictionary.empty[js.Any]
      ThreatListName.foreach(__v => __obj.update("ThreatListName", __v.asInstanceOf[js.Any]))
      ThreatNames.foreach(__v => __obj.update("ThreatNames", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ThreatIntelligenceDetail]
    }
  }

  @js.native
  trait UnarchiveFindingsRequest extends js.Object {
    var DetectorId: DetectorId
    var FindingIds: FindingIds
  }

  object UnarchiveFindingsRequest {
    def apply(
        DetectorId: DetectorId,
        FindingIds: FindingIds
    ): UnarchiveFindingsRequest = {
      val __obj = js.Dictionary[js.Any](
        "DetectorId" -> DetectorId.asInstanceOf[js.Any],
        "FindingIds" -> FindingIds.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UnarchiveFindingsRequest]
    }
  }

  @js.native
  trait UnarchiveFindingsResponse extends js.Object {}

  object UnarchiveFindingsResponse {
    def apply(
        ): UnarchiveFindingsResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[UnarchiveFindingsResponse]
    }
  }

  /**
    * Contains information about the accounts that were not processed.
    */
  @js.native
  trait UnprocessedAccount extends js.Object {
    var AccountId: AccountId
    var Result: String
  }

  object UnprocessedAccount {
    def apply(
        AccountId: AccountId,
        Result: String
    ): UnprocessedAccount = {
      val __obj = js.Dictionary[js.Any](
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "Result"    -> Result.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UnprocessedAccount]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: GuardDutyArn
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    def apply(
        ResourceArn: GuardDutyArn,
        TagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeys"     -> TagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object {}

  object UntagResourceResponse {
    def apply(
        ): UntagResourceResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  @js.native
  trait UpdateDetectorRequest extends js.Object {
    var DetectorId: DetectorId
    var Enable: js.UndefOr[Boolean]
    var FindingPublishingFrequency: js.UndefOr[FindingPublishingFrequency]
  }

  object UpdateDetectorRequest {
    def apply(
        DetectorId: DetectorId,
        Enable: js.UndefOr[Boolean] = js.undefined,
        FindingPublishingFrequency: js.UndefOr[FindingPublishingFrequency] = js.undefined
    ): UpdateDetectorRequest = {
      val __obj = js.Dictionary[js.Any](
        "DetectorId" -> DetectorId.asInstanceOf[js.Any]
      )

      Enable.foreach(__v => __obj.update("Enable", __v.asInstanceOf[js.Any]))
      FindingPublishingFrequency.foreach(__v => __obj.update("FindingPublishingFrequency", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDetectorRequest]
    }
  }

  @js.native
  trait UpdateDetectorResponse extends js.Object {}

  object UpdateDetectorResponse {
    def apply(
        ): UpdateDetectorResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[UpdateDetectorResponse]
    }
  }

  @js.native
  trait UpdateFilterRequest extends js.Object {
    var DetectorId: DetectorId
    var FilterName: String
    var Action: js.UndefOr[FilterAction]
    var Description: js.UndefOr[FilterDescription]
    var FindingCriteria: js.UndefOr[FindingCriteria]
    var Rank: js.UndefOr[FilterRank]
  }

  object UpdateFilterRequest {
    def apply(
        DetectorId: DetectorId,
        FilterName: String,
        Action: js.UndefOr[FilterAction] = js.undefined,
        Description: js.UndefOr[FilterDescription] = js.undefined,
        FindingCriteria: js.UndefOr[FindingCriteria] = js.undefined,
        Rank: js.UndefOr[FilterRank] = js.undefined
    ): UpdateFilterRequest = {
      val __obj = js.Dictionary[js.Any](
        "DetectorId" -> DetectorId.asInstanceOf[js.Any],
        "FilterName" -> FilterName.asInstanceOf[js.Any]
      )

      Action.foreach(__v => __obj.update("Action", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      FindingCriteria.foreach(__v => __obj.update("FindingCriteria", __v.asInstanceOf[js.Any]))
      Rank.foreach(__v => __obj.update("Rank", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFilterRequest]
    }
  }

  @js.native
  trait UpdateFilterResponse extends js.Object {
    var Name: FilterName
  }

  object UpdateFilterResponse {
    def apply(
        Name: FilterName
    ): UpdateFilterResponse = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateFilterResponse]
    }
  }

  @js.native
  trait UpdateFindingsFeedbackRequest extends js.Object {
    var DetectorId: DetectorId
    var Feedback: Feedback
    var FindingIds: FindingIds
    var Comments: js.UndefOr[String]
  }

  object UpdateFindingsFeedbackRequest {
    def apply(
        DetectorId: DetectorId,
        Feedback: Feedback,
        FindingIds: FindingIds,
        Comments: js.UndefOr[String] = js.undefined
    ): UpdateFindingsFeedbackRequest = {
      val __obj = js.Dictionary[js.Any](
        "DetectorId" -> DetectorId.asInstanceOf[js.Any],
        "Feedback"   -> Feedback.asInstanceOf[js.Any],
        "FindingIds" -> FindingIds.asInstanceOf[js.Any]
      )

      Comments.foreach(__v => __obj.update("Comments", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFindingsFeedbackRequest]
    }
  }

  @js.native
  trait UpdateFindingsFeedbackResponse extends js.Object {}

  object UpdateFindingsFeedbackResponse {
    def apply(
        ): UpdateFindingsFeedbackResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[UpdateFindingsFeedbackResponse]
    }
  }

  @js.native
  trait UpdateIPSetRequest extends js.Object {
    var DetectorId: DetectorId
    var IpSetId: String
    var Activate: js.UndefOr[Boolean]
    var Location: js.UndefOr[Location]
    var Name: js.UndefOr[Name]
  }

  object UpdateIPSetRequest {
    def apply(
        DetectorId: DetectorId,
        IpSetId: String,
        Activate: js.UndefOr[Boolean] = js.undefined,
        Location: js.UndefOr[Location] = js.undefined,
        Name: js.UndefOr[Name] = js.undefined
    ): UpdateIPSetRequest = {
      val __obj = js.Dictionary[js.Any](
        "DetectorId" -> DetectorId.asInstanceOf[js.Any],
        "IpSetId"    -> IpSetId.asInstanceOf[js.Any]
      )

      Activate.foreach(__v => __obj.update("Activate", __v.asInstanceOf[js.Any]))
      Location.foreach(__v => __obj.update("Location", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateIPSetRequest]
    }
  }

  @js.native
  trait UpdateIPSetResponse extends js.Object {}

  object UpdateIPSetResponse {
    def apply(
        ): UpdateIPSetResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[UpdateIPSetResponse]
    }
  }

  @js.native
  trait UpdateThreatIntelSetRequest extends js.Object {
    var DetectorId: DetectorId
    var ThreatIntelSetId: String
    var Activate: js.UndefOr[Boolean]
    var Location: js.UndefOr[Location]
    var Name: js.UndefOr[Name]
  }

  object UpdateThreatIntelSetRequest {
    def apply(
        DetectorId: DetectorId,
        ThreatIntelSetId: String,
        Activate: js.UndefOr[Boolean] = js.undefined,
        Location: js.UndefOr[Location] = js.undefined,
        Name: js.UndefOr[Name] = js.undefined
    ): UpdateThreatIntelSetRequest = {
      val __obj = js.Dictionary[js.Any](
        "DetectorId"       -> DetectorId.asInstanceOf[js.Any],
        "ThreatIntelSetId" -> ThreatIntelSetId.asInstanceOf[js.Any]
      )

      Activate.foreach(__v => __obj.update("Activate", __v.asInstanceOf[js.Any]))
      Location.foreach(__v => __obj.update("Location", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateThreatIntelSetRequest]
    }
  }

  @js.native
  trait UpdateThreatIntelSetResponse extends js.Object {}

  object UpdateThreatIntelSetResponse {
    def apply(
        ): UpdateThreatIntelSetResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[UpdateThreatIntelSetResponse]
    }
  }
}
