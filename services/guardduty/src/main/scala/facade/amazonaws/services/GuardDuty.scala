package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object guardduty {
  type AccountDetails                         = js.Array[AccountDetail]
  type AccountId                              = String
  type AccountIds                             = js.Array[__string]
  type Activate                               = Boolean
  type Comments                               = String
  type CountBySeverityFindingStatistic        = Int
  type CreatedAt                              = String
  type DetectorId                             = String
  type DetectorIds                            = js.Array[DetectorId]
  type DetectorStatus                         = String
  type Domain                                 = String
  type Email                                  = String
  type Enable                                 = Boolean
  type Eq                                     = js.Array[__string]
  type Feedback                               = String
  type FilterAction                           = String
  type FilterDescription                      = String
  type FilterName                             = String
  type FilterNames                            = js.Array[FilterName]
  type FilterRank                             = Int
  type FindingId                              = String
  type FindingIds                             = js.Array[FindingId]
  type FindingPublishingFrequency             = String
  type FindingStatisticType                   = String
  type FindingStatisticTypes                  = js.Array[FindingStatisticType]
  type FindingType                            = String
  type FindingTypes                           = js.Array[FindingType]
  type Findings                               = js.Array[Finding]
  type InvitationId                           = String
  type Invitations                            = js.Array[Invitation]
  type InvitedAt                              = String
  type IpSetFormat                            = String
  type IpSetId                                = String
  type IpSetIds                               = js.Array[IpSetId]
  type IpSetStatus                            = String
  type Ipv6Address                            = String
  type Ipv6Addresses                          = js.Array[Ipv6Address]
  type Location                               = String
  type MasterId                               = String
  type MaxResults                             = Int
  type Members                                = js.Array[Member]
  type Message                                = String
  type Name                                   = String
  type Neq                                    = js.Array[__string]
  type NetworkInterfaceId                     = String
  type NetworkInterfaces                      = js.Array[NetworkInterface]
  type NextToken                              = String
  type OrderBy                                = String
  type PrivateDnsName                         = String
  type PrivateIpAddress                       = String
  type PrivateIpAddresses                     = js.Array[PrivateIpAddressDetails]
  type ProductCodes                           = js.Array[ProductCode]
  type SecurityGroups                         = js.Array[SecurityGroup]
  type ServiceRole                            = String
  type Tags                                   = js.Array[Tag]
  type ThreatIntelSetFormat                   = String
  type ThreatIntelSetId                       = String
  type ThreatIntelSetIds                      = js.Array[ThreatIntelSetId]
  type ThreatIntelSetStatus                   = String
  type UnprocessedAccounts                    = js.Array[UnprocessedAccount]
  type UpdatedAt                              = String
  type __boolean                              = Boolean
  type __double                               = Double
  type __integer                              = Int
  type __listOfPortProbeDetail                = js.Array[PortProbeDetail]
  type __mapOfCondition                       = js.Dictionary[Condition]
  type __mapOfCountBySeverityFindingStatistic = js.Dictionary[CountBySeverityFindingStatistic]
  type __string                               = String
  type __stringMin0Max64                      = String

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
    def listThreatIntelSetsFuture(params: ListThreatIntelSetsRequest): Future[ListThreatIntelSetsResponse] =
      service.listThreatIntelSets(params).promise.toFuture
    def startMonitoringMembersFuture(params: StartMonitoringMembersRequest): Future[StartMonitoringMembersResponse] =
      service.startMonitoringMembers(params).promise.toFuture
    def stopMonitoringMembersFuture(params: StopMonitoringMembersRequest): Future[StopMonitoringMembersResponse] =
      service.stopMonitoringMembers(params).promise.toFuture
    def unarchiveFindingsFuture(params: UnarchiveFindingsRequest): Future[UnarchiveFindingsResponse] =
      service.unarchiveFindings(params).promise.toFuture
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
    def listThreatIntelSets(params: ListThreatIntelSetsRequest): Request[ListThreatIntelSetsResponse]       = js.native
    def startMonitoringMembers(params: StartMonitoringMembersRequest): Request[StartMonitoringMembersResponse] =
      js.native
    def stopMonitoringMembers(params: StopMonitoringMembersRequest): Request[StopMonitoringMembersResponse] = js.native
    def unarchiveFindings(params: UnarchiveFindingsRequest): Request[UnarchiveFindingsResponse]             = js.native
    def updateDetector(params: UpdateDetectorRequest): Request[UpdateDetectorResponse]                      = js.native
    def updateFilter(params: UpdateFilterRequest): Request[UpdateFilterResponse]                            = js.native
    def updateFindingsFeedback(params: UpdateFindingsFeedbackRequest): Request[UpdateFindingsFeedbackResponse] =
      js.native
    def updateIPSet(params: UpdateIPSetRequest): Request[UpdateIPSetResponse]                            = js.native
    def updateThreatIntelSet(params: UpdateThreatIntelSetRequest): Request[UpdateThreatIntelSetResponse] = js.native
  }

  /**
    * AcceptInvitation request body.
    */
  @js.native
  trait AcceptInvitationRequest extends js.Object {
    var DetectorId: __string
    var InvitationId: InvitationId
    var MasterId: MasterId
  }

  object AcceptInvitationRequest {
    def apply(
        DetectorId: __string,
        InvitationId: InvitationId,
        MasterId: MasterId
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
    * The IAM access key details (IAM user information) of a user that engaged in the activity that prompted GuardDuty to generate a finding.
    */
  @js.native
  trait AccessKeyDetails extends js.Object {
    var AccessKeyId: js.UndefOr[__string]
    var PrincipalId: js.UndefOr[__string]
    var UserName: js.UndefOr[__string]
    var UserType: js.UndefOr[__string]
  }

  object AccessKeyDetails {
    def apply(
        AccessKeyId: js.UndefOr[__string] = js.undefined,
        PrincipalId: js.UndefOr[__string] = js.undefined,
        UserName: js.UndefOr[__string] = js.undefined,
        UserType: js.UndefOr[__string] = js.undefined
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
    * An object containing the member's accountId and email address.
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
    * Information about the activity described in a finding.
    */
  @js.native
  trait Action extends js.Object {
    var ActionType: js.UndefOr[__string]
    var AwsApiCallAction: js.UndefOr[AwsApiCallAction]
    var DnsRequestAction: js.UndefOr[DnsRequestAction]
    var NetworkConnectionAction: js.UndefOr[NetworkConnectionAction]
    var PortProbeAction: js.UndefOr[PortProbeAction]
  }

  object Action {
    def apply(
        ActionType: js.UndefOr[__string] = js.undefined,
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

  /**
    * ArchiveFindings request body.
    */
  @js.native
  trait ArchiveFindingsRequest extends js.Object {
    var DetectorId: __string
    var FindingIds: FindingIds
  }

  object ArchiveFindingsRequest {
    def apply(
        DetectorId: __string,
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
    * Information about the AWS_API_CALL action described in this finding.
    */
  @js.native
  trait AwsApiCallAction extends js.Object {
    var Api: js.UndefOr[__string]
    var CallerType: js.UndefOr[__string]
    var DomainDetails: js.UndefOr[DomainDetails]
    var RemoteIpDetails: js.UndefOr[RemoteIpDetails]
    var ServiceName: js.UndefOr[__string]
  }

  object AwsApiCallAction {
    def apply(
        Api: js.UndefOr[__string] = js.undefined,
        CallerType: js.UndefOr[__string] = js.undefined,
        DomainDetails: js.UndefOr[DomainDetails] = js.undefined,
        RemoteIpDetails: js.UndefOr[RemoteIpDetails] = js.undefined,
        ServiceName: js.UndefOr[__string] = js.undefined
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
    * City information of the remote IP address.
    */
  @js.native
  trait City extends js.Object {
    var CityName: js.UndefOr[__string]
  }

  object City {
    def apply(
        CityName: js.UndefOr[__string] = js.undefined
    ): City = {
      val __obj = js.Dictionary.empty[js.Any]
      CityName.foreach(__v => __obj.update("CityName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[City]
    }
  }

  /**
    * Finding attribute (for example, accountId) for which conditions and values must be specified when querying findings.
    */
  @js.native
  trait Condition extends js.Object {
    var Eq: js.UndefOr[Eq]
    var Gt: js.UndefOr[__integer]
    var Gte: js.UndefOr[__integer]
    var Lt: js.UndefOr[__integer]
    var Lte: js.UndefOr[__integer]
    var Neq: js.UndefOr[Neq]
  }

  object Condition {
    def apply(
        Eq: js.UndefOr[Eq] = js.undefined,
        Gt: js.UndefOr[__integer] = js.undefined,
        Gte: js.UndefOr[__integer] = js.undefined,
        Lt: js.UndefOr[__integer] = js.undefined,
        Lte: js.UndefOr[__integer] = js.undefined,
        Neq: js.UndefOr[Neq] = js.undefined
    ): Condition = {
      val __obj = js.Dictionary.empty[js.Any]
      Eq.foreach(__v => __obj.update("Eq", __v.asInstanceOf[js.Any]))
      Gt.foreach(__v => __obj.update("Gt", __v.asInstanceOf[js.Any]))
      Gte.foreach(__v => __obj.update("Gte", __v.asInstanceOf[js.Any]))
      Lt.foreach(__v => __obj.update("Lt", __v.asInstanceOf[js.Any]))
      Lte.foreach(__v => __obj.update("Lte", __v.asInstanceOf[js.Any]))
      Neq.foreach(__v => __obj.update("Neq", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Condition]
    }
  }

  /**
    * Country information of the remote IP address.
    */
  @js.native
  trait Country extends js.Object {
    var CountryCode: js.UndefOr[__string]
    var CountryName: js.UndefOr[__string]
  }

  object Country {
    def apply(
        CountryCode: js.UndefOr[__string] = js.undefined,
        CountryName: js.UndefOr[__string] = js.undefined
    ): Country = {
      val __obj = js.Dictionary.empty[js.Any]
      CountryCode.foreach(__v => __obj.update("CountryCode", __v.asInstanceOf[js.Any]))
      CountryName.foreach(__v => __obj.update("CountryName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Country]
    }
  }

  /**
    * CreateDetector request body.
    */
  @js.native
  trait CreateDetectorRequest extends js.Object {
    var Enable: Enable
    var ClientToken: js.UndefOr[__stringMin0Max64]
    var FindingPublishingFrequency: js.UndefOr[FindingPublishingFrequency]
  }

  object CreateDetectorRequest {
    def apply(
        Enable: Enable,
        ClientToken: js.UndefOr[__stringMin0Max64] = js.undefined,
        FindingPublishingFrequency: js.UndefOr[FindingPublishingFrequency] = js.undefined
    ): CreateDetectorRequest = {
      val __obj = js.Dictionary[js.Any](
        "Enable" -> Enable.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.update("ClientToken", __v.asInstanceOf[js.Any]))
      FindingPublishingFrequency.foreach(__v => __obj.update("FindingPublishingFrequency", __v.asInstanceOf[js.Any]))
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

  /**
    * CreateFilterRequest request body.
    */
  @js.native
  trait CreateFilterRequest extends js.Object {
    var DetectorId: __string
    var FindingCriteria: FindingCriteria
    var Name: FilterName
    var Action: js.UndefOr[FilterAction]
    var ClientToken: js.UndefOr[__stringMin0Max64]
    var Description: js.UndefOr[FilterDescription]
    var Rank: js.UndefOr[FilterRank]
  }

  object CreateFilterRequest {
    def apply(
        DetectorId: __string,
        FindingCriteria: FindingCriteria,
        Name: FilterName,
        Action: js.UndefOr[FilterAction] = js.undefined,
        ClientToken: js.UndefOr[__stringMin0Max64] = js.undefined,
        Description: js.UndefOr[FilterDescription] = js.undefined,
        Rank: js.UndefOr[FilterRank] = js.undefined
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
      __obj.asInstanceOf[CreateFilterRequest]
    }
  }

  @js.native
  trait CreateFilterResponse extends js.Object {
    var Name: js.UndefOr[FilterName]
  }

  object CreateFilterResponse {
    def apply(
        Name: js.UndefOr[FilterName] = js.undefined
    ): CreateFilterResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFilterResponse]
    }
  }

  /**
    * CreateIPSet request body.
    */
  @js.native
  trait CreateIPSetRequest extends js.Object {
    var Activate: Activate
    var DetectorId: __string
    var Format: IpSetFormat
    var Location: Location
    var Name: Name
    var ClientToken: js.UndefOr[__stringMin0Max64]
  }

  object CreateIPSetRequest {
    def apply(
        Activate: Activate,
        DetectorId: __string,
        Format: IpSetFormat,
        Location: Location,
        Name: Name,
        ClientToken: js.UndefOr[__stringMin0Max64] = js.undefined
    ): CreateIPSetRequest = {
      val __obj = js.Dictionary[js.Any](
        "Activate"   -> Activate.asInstanceOf[js.Any],
        "DetectorId" -> DetectorId.asInstanceOf[js.Any],
        "Format"     -> Format.asInstanceOf[js.Any],
        "Location"   -> Location.asInstanceOf[js.Any],
        "Name"       -> Name.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.update("ClientToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateIPSetRequest]
    }
  }

  @js.native
  trait CreateIPSetResponse extends js.Object {
    var IpSetId: js.UndefOr[IpSetId]
  }

  object CreateIPSetResponse {
    def apply(
        IpSetId: js.UndefOr[IpSetId] = js.undefined
    ): CreateIPSetResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      IpSetId.foreach(__v => __obj.update("IpSetId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateIPSetResponse]
    }
  }

  /**
    * CreateMembers request body.
    */
  @js.native
  trait CreateMembersRequest extends js.Object {
    var AccountDetails: AccountDetails
    var DetectorId: __string
  }

  object CreateMembersRequest {
    def apply(
        AccountDetails: AccountDetails,
        DetectorId: __string
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
    var UnprocessedAccounts: js.UndefOr[UnprocessedAccounts]
  }

  object CreateMembersResponse {
    def apply(
        UnprocessedAccounts: js.UndefOr[UnprocessedAccounts] = js.undefined
    ): CreateMembersResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      UnprocessedAccounts.foreach(__v => __obj.update("UnprocessedAccounts", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateMembersResponse]
    }
  }

  /**
    * CreateSampleFindings request body.
    */
  @js.native
  trait CreateSampleFindingsRequest extends js.Object {
    var DetectorId: __string
    var FindingTypes: js.UndefOr[FindingTypes]
  }

  object CreateSampleFindingsRequest {
    def apply(
        DetectorId: __string,
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

  /**
    * CreateThreatIntelSet request body.
    */
  @js.native
  trait CreateThreatIntelSetRequest extends js.Object {
    var Activate: Activate
    var DetectorId: __string
    var Format: ThreatIntelSetFormat
    var Location: Location
    var Name: Name
    var ClientToken: js.UndefOr[__stringMin0Max64]
  }

  object CreateThreatIntelSetRequest {
    def apply(
        Activate: Activate,
        DetectorId: __string,
        Format: ThreatIntelSetFormat,
        Location: Location,
        Name: Name,
        ClientToken: js.UndefOr[__stringMin0Max64] = js.undefined
    ): CreateThreatIntelSetRequest = {
      val __obj = js.Dictionary[js.Any](
        "Activate"   -> Activate.asInstanceOf[js.Any],
        "DetectorId" -> DetectorId.asInstanceOf[js.Any],
        "Format"     -> Format.asInstanceOf[js.Any],
        "Location"   -> Location.asInstanceOf[js.Any],
        "Name"       -> Name.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.update("ClientToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateThreatIntelSetRequest]
    }
  }

  @js.native
  trait CreateThreatIntelSetResponse extends js.Object {
    var ThreatIntelSetId: js.UndefOr[ThreatIntelSetId]
  }

  object CreateThreatIntelSetResponse {
    def apply(
        ThreatIntelSetId: js.UndefOr[ThreatIntelSetId] = js.undefined
    ): CreateThreatIntelSetResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ThreatIntelSetId.foreach(__v => __obj.update("ThreatIntelSetId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateThreatIntelSetResponse]
    }
  }

  /**
    * DeclineInvitations request body.
    */
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
    var UnprocessedAccounts: js.UndefOr[UnprocessedAccounts]
  }

  object DeclineInvitationsResponse {
    def apply(
        UnprocessedAccounts: js.UndefOr[UnprocessedAccounts] = js.undefined
    ): DeclineInvitationsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      UnprocessedAccounts.foreach(__v => __obj.update("UnprocessedAccounts", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeclineInvitationsResponse]
    }
  }

  @js.native
  trait DeleteDetectorRequest extends js.Object {
    var DetectorId: __string
  }

  object DeleteDetectorRequest {
    def apply(
        DetectorId: __string
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
    var DetectorId: __string
    var FilterName: __string
  }

  object DeleteFilterRequest {
    def apply(
        DetectorId: __string,
        FilterName: __string
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
    var DetectorId: __string
    var IpSetId: __string
  }

  object DeleteIPSetRequest {
    def apply(
        DetectorId: __string,
        IpSetId: __string
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

  /**
    * DeleteInvitations request body.
    */
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
    var UnprocessedAccounts: js.UndefOr[UnprocessedAccounts]
  }

  object DeleteInvitationsResponse {
    def apply(
        UnprocessedAccounts: js.UndefOr[UnprocessedAccounts] = js.undefined
    ): DeleteInvitationsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      UnprocessedAccounts.foreach(__v => __obj.update("UnprocessedAccounts", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteInvitationsResponse]
    }
  }

  /**
    * DeleteMembers request body.
    */
  @js.native
  trait DeleteMembersRequest extends js.Object {
    var AccountIds: AccountIds
    var DetectorId: __string
  }

  object DeleteMembersRequest {
    def apply(
        AccountIds: AccountIds,
        DetectorId: __string
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
    var UnprocessedAccounts: js.UndefOr[UnprocessedAccounts]
  }

  object DeleteMembersResponse {
    def apply(
        UnprocessedAccounts: js.UndefOr[UnprocessedAccounts] = js.undefined
    ): DeleteMembersResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      UnprocessedAccounts.foreach(__v => __obj.update("UnprocessedAccounts", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteMembersResponse]
    }
  }

  @js.native
  trait DeleteThreatIntelSetRequest extends js.Object {
    var DetectorId: __string
    var ThreatIntelSetId: __string
  }

  object DeleteThreatIntelSetRequest {
    def apply(
        DetectorId: __string,
        ThreatIntelSetId: __string
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

  /**
    * The status of detector.
    */
  object DetectorStatusEnum {
    val ENABLED  = "ENABLED"
    val DISABLED = "DISABLED"

    val values = IndexedSeq(ENABLED, DISABLED)
  }

  @js.native
  trait DisassociateFromMasterAccountRequest extends js.Object {
    var DetectorId: __string
  }

  object DisassociateFromMasterAccountRequest {
    def apply(
        DetectorId: __string
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

  /**
    * DisassociateMembers request body.
    */
  @js.native
  trait DisassociateMembersRequest extends js.Object {
    var AccountIds: AccountIds
    var DetectorId: __string
  }

  object DisassociateMembersRequest {
    def apply(
        AccountIds: AccountIds,
        DetectorId: __string
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
    var UnprocessedAccounts: js.UndefOr[UnprocessedAccounts]
  }

  object DisassociateMembersResponse {
    def apply(
        UnprocessedAccounts: js.UndefOr[UnprocessedAccounts] = js.undefined
    ): DisassociateMembersResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      UnprocessedAccounts.foreach(__v => __obj.update("UnprocessedAccounts", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociateMembersResponse]
    }
  }

  /**
    * Information about the DNS_REQUEST action described in this finding.
    */
  @js.native
  trait DnsRequestAction extends js.Object {
    var Domain: js.UndefOr[Domain]
  }

  object DnsRequestAction {
    def apply(
        Domain: js.UndefOr[Domain] = js.undefined
    ): DnsRequestAction = {
      val __obj = js.Dictionary.empty[js.Any]
      Domain.foreach(__v => __obj.update("Domain", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DnsRequestAction]
    }
  }

  /**
    * Domain information for the AWS API call.
    */
  @js.native
  trait DomainDetails extends js.Object {}

  object DomainDetails {
    def apply(
        ): DomainDetails = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DomainDetails]
    }
  }

  /**
    * Finding Feedback Value
    */
  object FeedbackEnum {
    val USEFUL     = "USEFUL"
    val NOT_USEFUL = "NOT_USEFUL"

    val values = IndexedSeq(USEFUL, NOT_USEFUL)
  }

  /**
    * The action associated with a filter.
    */
  object FilterActionEnum {
    val NOOP    = "NOOP"
    val ARCHIVE = "ARCHIVE"

    val values = IndexedSeq(NOOP, ARCHIVE)
  }

  /**
    * Representation of a abnormal or suspicious activity.
    */
  @js.native
  trait Finding extends js.Object {
    var AccountId: __string
    var Arn: __string
    var CreatedAt: CreatedAt
    var Id: __string
    var Region: __string
    var Resource: Resource
    var SchemaVersion: __string
    var Severity: __double
    var Type: __string
    var UpdatedAt: UpdatedAt
    var Confidence: js.UndefOr[__double]
    var Description: js.UndefOr[__string]
    var Partition: js.UndefOr[__string]
    var Service: js.UndefOr[Service]
    var Title: js.UndefOr[__string]
  }

  object Finding {
    def apply(
        AccountId: __string,
        Arn: __string,
        CreatedAt: CreatedAt,
        Id: __string,
        Region: __string,
        Resource: Resource,
        SchemaVersion: __string,
        Severity: __double,
        Type: __string,
        UpdatedAt: UpdatedAt,
        Confidence: js.UndefOr[__double] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        Partition: js.UndefOr[__string] = js.undefined,
        Service: js.UndefOr[Service] = js.undefined,
        Title: js.UndefOr[__string] = js.undefined
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
    * Represents the criteria used for querying findings.
    */
  @js.native
  trait FindingCriteria extends js.Object {
    var Criterion: js.UndefOr[__mapOfCondition]
  }

  object FindingCriteria {
    def apply(
        Criterion: js.UndefOr[__mapOfCondition] = js.undefined
    ): FindingCriteria = {
      val __obj = js.Dictionary.empty[js.Any]
      Criterion.foreach(__v => __obj.update("Criterion", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FindingCriteria]
    }
  }

  /**
    * A enum value that specifies how frequently customer got Finding updates published.
    */
  object FindingPublishingFrequencyEnum {
    val FIFTEEN_MINUTES = "FIFTEEN_MINUTES"
    val ONE_HOUR        = "ONE_HOUR"
    val SIX_HOURS       = "SIX_HOURS"

    val values = IndexedSeq(FIFTEEN_MINUTES, ONE_HOUR, SIX_HOURS)
  }

  /**
    * The types of finding statistics.
    */
  object FindingStatisticTypeEnum {
    val COUNT_BY_SEVERITY = "COUNT_BY_SEVERITY"

    val values = IndexedSeq(COUNT_BY_SEVERITY)
  }

  /**
    * Finding statistics object.
    */
  @js.native
  trait FindingStatistics extends js.Object {
    var CountBySeverity: js.UndefOr[__mapOfCountBySeverityFindingStatistic]
  }

  object FindingStatistics {
    def apply(
        CountBySeverity: js.UndefOr[__mapOfCountBySeverityFindingStatistic] = js.undefined
    ): FindingStatistics = {
      val __obj = js.Dictionary.empty[js.Any]
      CountBySeverity.foreach(__v => __obj.update("CountBySeverity", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FindingStatistics]
    }
  }

  /**
    * Location information of the remote IP address.
    */
  @js.native
  trait GeoLocation extends js.Object {
    var Lat: js.UndefOr[__double]
    var Lon: js.UndefOr[__double]
  }

  object GeoLocation {
    def apply(
        Lat: js.UndefOr[__double] = js.undefined,
        Lon: js.UndefOr[__double] = js.undefined
    ): GeoLocation = {
      val __obj = js.Dictionary.empty[js.Any]
      Lat.foreach(__v => __obj.update("Lat", __v.asInstanceOf[js.Any]))
      Lon.foreach(__v => __obj.update("Lon", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GeoLocation]
    }
  }

  @js.native
  trait GetDetectorRequest extends js.Object {
    var DetectorId: __string
  }

  object GetDetectorRequest {
    def apply(
        DetectorId: __string
    ): GetDetectorRequest = {
      val __obj = js.Dictionary[js.Any](
        "DetectorId" -> DetectorId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetDetectorRequest]
    }
  }

  @js.native
  trait GetDetectorResponse extends js.Object {
    var CreatedAt: js.UndefOr[CreatedAt]
    var FindingPublishingFrequency: js.UndefOr[FindingPublishingFrequency]
    var ServiceRole: js.UndefOr[ServiceRole]
    var Status: js.UndefOr[DetectorStatus]
    var UpdatedAt: js.UndefOr[UpdatedAt]
  }

  object GetDetectorResponse {
    def apply(
        CreatedAt: js.UndefOr[CreatedAt] = js.undefined,
        FindingPublishingFrequency: js.UndefOr[FindingPublishingFrequency] = js.undefined,
        ServiceRole: js.UndefOr[ServiceRole] = js.undefined,
        Status: js.UndefOr[DetectorStatus] = js.undefined,
        UpdatedAt: js.UndefOr[UpdatedAt] = js.undefined
    ): GetDetectorResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      CreatedAt.foreach(__v => __obj.update("CreatedAt", __v.asInstanceOf[js.Any]))
      FindingPublishingFrequency.foreach(__v => __obj.update("FindingPublishingFrequency", __v.asInstanceOf[js.Any]))
      ServiceRole.foreach(__v => __obj.update("ServiceRole", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      UpdatedAt.foreach(__v => __obj.update("UpdatedAt", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDetectorResponse]
    }
  }

  @js.native
  trait GetFilterRequest extends js.Object {
    var DetectorId: __string
    var FilterName: __string
  }

  object GetFilterRequest {
    def apply(
        DetectorId: __string,
        FilterName: __string
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
    var Action: js.UndefOr[FilterAction]
    var Description: js.UndefOr[FilterDescription]
    var FindingCriteria: js.UndefOr[FindingCriteria]
    var Name: js.UndefOr[FilterName]
    var Rank: js.UndefOr[FilterRank]
  }

  object GetFilterResponse {
    def apply(
        Action: js.UndefOr[FilterAction] = js.undefined,
        Description: js.UndefOr[FilterDescription] = js.undefined,
        FindingCriteria: js.UndefOr[FindingCriteria] = js.undefined,
        Name: js.UndefOr[FilterName] = js.undefined,
        Rank: js.UndefOr[FilterRank] = js.undefined
    ): GetFilterResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Action.foreach(__v => __obj.update("Action", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      FindingCriteria.foreach(__v => __obj.update("FindingCriteria", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Rank.foreach(__v => __obj.update("Rank", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFilterResponse]
    }
  }

  /**
    * GetFindings request body.
    */
  @js.native
  trait GetFindingsRequest extends js.Object {
    var DetectorId: __string
    var FindingIds: FindingIds
    var SortCriteria: js.UndefOr[SortCriteria]
  }

  object GetFindingsRequest {
    def apply(
        DetectorId: __string,
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
    var Findings: js.UndefOr[Findings]
  }

  object GetFindingsResponse {
    def apply(
        Findings: js.UndefOr[Findings] = js.undefined
    ): GetFindingsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Findings.foreach(__v => __obj.update("Findings", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFindingsResponse]
    }
  }

  /**
    * GetFindingsStatistics request body.
    */
  @js.native
  trait GetFindingsStatisticsRequest extends js.Object {
    var DetectorId: __string
    var FindingStatisticTypes: FindingStatisticTypes
    var FindingCriteria: js.UndefOr[FindingCriteria]
  }

  object GetFindingsStatisticsRequest {
    def apply(
        DetectorId: __string,
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
    var FindingStatistics: js.UndefOr[FindingStatistics]
  }

  object GetFindingsStatisticsResponse {
    def apply(
        FindingStatistics: js.UndefOr[FindingStatistics] = js.undefined
    ): GetFindingsStatisticsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      FindingStatistics.foreach(__v => __obj.update("FindingStatistics", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFindingsStatisticsResponse]
    }
  }

  @js.native
  trait GetIPSetRequest extends js.Object {
    var DetectorId: __string
    var IpSetId: __string
  }

  object GetIPSetRequest {
    def apply(
        DetectorId: __string,
        IpSetId: __string
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
    var Format: js.UndefOr[IpSetFormat]
    var Location: js.UndefOr[Location]
    var Name: js.UndefOr[Name]
    var Status: js.UndefOr[IpSetStatus]
  }

  object GetIPSetResponse {
    def apply(
        Format: js.UndefOr[IpSetFormat] = js.undefined,
        Location: js.UndefOr[Location] = js.undefined,
        Name: js.UndefOr[Name] = js.undefined,
        Status: js.UndefOr[IpSetStatus] = js.undefined
    ): GetIPSetResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Format.foreach(__v => __obj.update("Format", __v.asInstanceOf[js.Any]))
      Location.foreach(__v => __obj.update("Location", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
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
    var InvitationsCount: js.UndefOr[__integer]
  }

  object GetInvitationsCountResponse {
    def apply(
        InvitationsCount: js.UndefOr[__integer] = js.undefined
    ): GetInvitationsCountResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      InvitationsCount.foreach(__v => __obj.update("InvitationsCount", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetInvitationsCountResponse]
    }
  }

  @js.native
  trait GetMasterAccountRequest extends js.Object {
    var DetectorId: __string
  }

  object GetMasterAccountRequest {
    def apply(
        DetectorId: __string
    ): GetMasterAccountRequest = {
      val __obj = js.Dictionary[js.Any](
        "DetectorId" -> DetectorId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetMasterAccountRequest]
    }
  }

  @js.native
  trait GetMasterAccountResponse extends js.Object {
    var Master: js.UndefOr[Master]
  }

  object GetMasterAccountResponse {
    def apply(
        Master: js.UndefOr[Master] = js.undefined
    ): GetMasterAccountResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Master.foreach(__v => __obj.update("Master", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMasterAccountResponse]
    }
  }

  /**
    * GetMembers request body.
    */
  @js.native
  trait GetMembersRequest extends js.Object {
    var AccountIds: AccountIds
    var DetectorId: __string
  }

  object GetMembersRequest {
    def apply(
        AccountIds: AccountIds,
        DetectorId: __string
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
    var Members: js.UndefOr[Members]
    var UnprocessedAccounts: js.UndefOr[UnprocessedAccounts]
  }

  object GetMembersResponse {
    def apply(
        Members: js.UndefOr[Members] = js.undefined,
        UnprocessedAccounts: js.UndefOr[UnprocessedAccounts] = js.undefined
    ): GetMembersResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Members.foreach(__v => __obj.update("Members", __v.asInstanceOf[js.Any]))
      UnprocessedAccounts.foreach(__v => __obj.update("UnprocessedAccounts", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMembersResponse]
    }
  }

  @js.native
  trait GetThreatIntelSetRequest extends js.Object {
    var DetectorId: __string
    var ThreatIntelSetId: __string
  }

  object GetThreatIntelSetRequest {
    def apply(
        DetectorId: __string,
        ThreatIntelSetId: __string
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
    var Format: js.UndefOr[ThreatIntelSetFormat]
    var Location: js.UndefOr[Location]
    var Name: js.UndefOr[Name]
    var Status: js.UndefOr[ThreatIntelSetStatus]
  }

  object GetThreatIntelSetResponse {
    def apply(
        Format: js.UndefOr[ThreatIntelSetFormat] = js.undefined,
        Location: js.UndefOr[Location] = js.undefined,
        Name: js.UndefOr[Name] = js.undefined,
        Status: js.UndefOr[ThreatIntelSetStatus] = js.undefined
    ): GetThreatIntelSetResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Format.foreach(__v => __obj.update("Format", __v.asInstanceOf[js.Any]))
      Location.foreach(__v => __obj.update("Location", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetThreatIntelSetResponse]
    }
  }

  /**
    * The profile information of the EC2 instance.
    */
  @js.native
  trait IamInstanceProfile extends js.Object {
    var Arn: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
  }

  object IamInstanceProfile {
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined
    ): IamInstanceProfile = {
      val __obj = js.Dictionary.empty[js.Any]
      Arn.foreach(__v => __obj.update("Arn", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IamInstanceProfile]
    }
  }

  /**
    * The information about the EC2 instance associated with the activity that prompted GuardDuty to generate a finding.
    */
  @js.native
  trait InstanceDetails extends js.Object {
    var AvailabilityZone: js.UndefOr[__string]
    var IamInstanceProfile: js.UndefOr[IamInstanceProfile]
    var ImageDescription: js.UndefOr[__string]
    var ImageId: js.UndefOr[__string]
    var InstanceId: js.UndefOr[__string]
    var InstanceState: js.UndefOr[__string]
    var InstanceType: js.UndefOr[__string]
    var LaunchTime: js.UndefOr[__string]
    var NetworkInterfaces: js.UndefOr[NetworkInterfaces]
    var Platform: js.UndefOr[__string]
    var ProductCodes: js.UndefOr[ProductCodes]
    var Tags: js.UndefOr[Tags]
  }

  object InstanceDetails {
    def apply(
        AvailabilityZone: js.UndefOr[__string] = js.undefined,
        IamInstanceProfile: js.UndefOr[IamInstanceProfile] = js.undefined,
        ImageDescription: js.UndefOr[__string] = js.undefined,
        ImageId: js.UndefOr[__string] = js.undefined,
        InstanceId: js.UndefOr[__string] = js.undefined,
        InstanceState: js.UndefOr[__string] = js.undefined,
        InstanceType: js.UndefOr[__string] = js.undefined,
        LaunchTime: js.UndefOr[__string] = js.undefined,
        NetworkInterfaces: js.UndefOr[NetworkInterfaces] = js.undefined,
        Platform: js.UndefOr[__string] = js.undefined,
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
    * Invitation from an AWS account to become the current account's master.
    */
  @js.native
  trait Invitation extends js.Object {
    var AccountId: js.UndefOr[__string]
    var InvitationId: js.UndefOr[InvitationId]
    var InvitedAt: js.UndefOr[InvitedAt]
    var RelationshipStatus: js.UndefOr[__string]
  }

  object Invitation {
    def apply(
        AccountId: js.UndefOr[__string] = js.undefined,
        InvitationId: js.UndefOr[InvitationId] = js.undefined,
        InvitedAt: js.UndefOr[InvitedAt] = js.undefined,
        RelationshipStatus: js.UndefOr[__string] = js.undefined
    ): Invitation = {
      val __obj = js.Dictionary.empty[js.Any]
      AccountId.foreach(__v => __obj.update("AccountId", __v.asInstanceOf[js.Any]))
      InvitationId.foreach(__v => __obj.update("InvitationId", __v.asInstanceOf[js.Any]))
      InvitedAt.foreach(__v => __obj.update("InvitedAt", __v.asInstanceOf[js.Any]))
      RelationshipStatus.foreach(__v => __obj.update("RelationshipStatus", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Invitation]
    }
  }

  /**
    * InviteMembers request body.
    */
  @js.native
  trait InviteMembersRequest extends js.Object {
    var AccountIds: AccountIds
    var DetectorId: __string
    var DisableEmailNotification: js.UndefOr[__boolean]
    var Message: js.UndefOr[Message]
  }

  object InviteMembersRequest {
    def apply(
        AccountIds: AccountIds,
        DetectorId: __string,
        DisableEmailNotification: js.UndefOr[__boolean] = js.undefined,
        Message: js.UndefOr[Message] = js.undefined
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
    var UnprocessedAccounts: js.UndefOr[UnprocessedAccounts]
  }

  object InviteMembersResponse {
    def apply(
        UnprocessedAccounts: js.UndefOr[UnprocessedAccounts] = js.undefined
    ): InviteMembersResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      UnprocessedAccounts.foreach(__v => __obj.update("UnprocessedAccounts", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InviteMembersResponse]
    }
  }

  /**
    * The format of the ipSet.
    */
  object IpSetFormatEnum {
    val TXT         = "TXT"
    val STIX        = "STIX"
    val OTX_CSV     = "OTX_CSV"
    val ALIEN_VAULT = "ALIEN_VAULT"
    val PROOF_POINT = "PROOF_POINT"
    val FIRE_EYE    = "FIRE_EYE"

    val values = IndexedSeq(TXT, STIX, OTX_CSV, ALIEN_VAULT, PROOF_POINT, FIRE_EYE)
  }

  /**
    * The status of ipSet file uploaded.
    */
  object IpSetStatusEnum {
    val INACTIVE       = "INACTIVE"
    val ACTIVATING     = "ACTIVATING"
    val ACTIVE         = "ACTIVE"
    val DEACTIVATING   = "DEACTIVATING"
    val ERROR          = "ERROR"
    val DELETE_PENDING = "DELETE_PENDING"
    val DELETED        = "DELETED"

    val values = IndexedSeq(INACTIVE, ACTIVATING, ACTIVE, DEACTIVATING, ERROR, DELETE_PENDING, DELETED)
  }

  @js.native
  trait ListDetectorsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListDetectorsRequest {
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListDetectorsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDetectorsRequest]
    }
  }

  @js.native
  trait ListDetectorsResponse extends js.Object {
    var DetectorIds: js.UndefOr[DetectorIds]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDetectorsResponse {
    def apply(
        DetectorIds: js.UndefOr[DetectorIds] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDetectorsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      DetectorIds.foreach(__v => __obj.update("DetectorIds", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDetectorsResponse]
    }
  }

  @js.native
  trait ListFiltersRequest extends js.Object {
    var DetectorId: __string
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListFiltersRequest {
    def apply(
        DetectorId: __string,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
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
    var FilterNames: js.UndefOr[FilterNames]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListFiltersResponse {
    def apply(
        FilterNames: js.UndefOr[FilterNames] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListFiltersResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      FilterNames.foreach(__v => __obj.update("FilterNames", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFiltersResponse]
    }
  }

  /**
    * ListFindings request body.
    */
  @js.native
  trait ListFindingsRequest extends js.Object {
    var DetectorId: __string
    var FindingCriteria: js.UndefOr[FindingCriteria]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var SortCriteria: js.UndefOr[SortCriteria]
  }

  object ListFindingsRequest {
    def apply(
        DetectorId: __string,
        FindingCriteria: js.UndefOr[FindingCriteria] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
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
    var FindingIds: js.UndefOr[FindingIds]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListFindingsResponse {
    def apply(
        FindingIds: js.UndefOr[FindingIds] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListFindingsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      FindingIds.foreach(__v => __obj.update("FindingIds", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFindingsResponse]
    }
  }

  @js.native
  trait ListIPSetsRequest extends js.Object {
    var DetectorId: __string
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListIPSetsRequest {
    def apply(
        DetectorId: __string,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
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
    var IpSetIds: js.UndefOr[IpSetIds]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListIPSetsResponse {
    def apply(
        IpSetIds: js.UndefOr[IpSetIds] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListIPSetsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      IpSetIds.foreach(__v => __obj.update("IpSetIds", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListIPSetsResponse]
    }
  }

  @js.native
  trait ListInvitationsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListInvitationsRequest {
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
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
    var NextToken: js.UndefOr[NextToken]
  }

  object ListInvitationsResponse {
    def apply(
        Invitations: js.UndefOr[Invitations] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListInvitationsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Invitations.foreach(__v => __obj.update("Invitations", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInvitationsResponse]
    }
  }

  @js.native
  trait ListMembersRequest extends js.Object {
    var DetectorId: __string
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
    var OnlyAssociated: js.UndefOr[__string]
  }

  object ListMembersRequest {
    def apply(
        DetectorId: __string,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined,
        OnlyAssociated: js.UndefOr[__string] = js.undefined
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
    var NextToken: js.UndefOr[NextToken]
  }

  object ListMembersResponse {
    def apply(
        Members: js.UndefOr[Members] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListMembersResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Members.foreach(__v => __obj.update("Members", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMembersResponse]
    }
  }

  @js.native
  trait ListThreatIntelSetsRequest extends js.Object {
    var DetectorId: __string
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListThreatIntelSetsRequest {
    def apply(
        DetectorId: __string,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
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
    var NextToken: js.UndefOr[NextToken]
    var ThreatIntelSetIds: js.UndefOr[ThreatIntelSetIds]
  }

  object ListThreatIntelSetsResponse {
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ThreatIntelSetIds: js.UndefOr[ThreatIntelSetIds] = js.undefined
    ): ListThreatIntelSetsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      ThreatIntelSetIds.foreach(__v => __obj.update("ThreatIntelSetIds", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListThreatIntelSetsResponse]
    }
  }

  /**
    * Local port information of the connection.
    */
  @js.native
  trait LocalPortDetails extends js.Object {
    var Port: js.UndefOr[__integer]
    var PortName: js.UndefOr[__string]
  }

  object LocalPortDetails {
    def apply(
        Port: js.UndefOr[__integer] = js.undefined,
        PortName: js.UndefOr[__string] = js.undefined
    ): LocalPortDetails = {
      val __obj = js.Dictionary.empty[js.Any]
      Port.foreach(__v => __obj.update("Port", __v.asInstanceOf[js.Any]))
      PortName.foreach(__v => __obj.update("PortName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LocalPortDetails]
    }
  }

  /**
    * Contains details about the master account.
    */
  @js.native
  trait Master extends js.Object {
    var AccountId: js.UndefOr[__string]
    var InvitationId: js.UndefOr[InvitationId]
    var InvitedAt: js.UndefOr[InvitedAt]
    var RelationshipStatus: js.UndefOr[__string]
  }

  object Master {
    def apply(
        AccountId: js.UndefOr[__string] = js.undefined,
        InvitationId: js.UndefOr[InvitationId] = js.undefined,
        InvitedAt: js.UndefOr[InvitedAt] = js.undefined,
        RelationshipStatus: js.UndefOr[__string] = js.undefined
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
    * Contains details about the member account.
    */
  @js.native
  trait Member extends js.Object {
    var AccountId: AccountId
    var Email: Email
    var MasterId: MasterId
    var RelationshipStatus: __string
    var UpdatedAt: UpdatedAt
    var DetectorId: js.UndefOr[DetectorId]
    var InvitedAt: js.UndefOr[InvitedAt]
  }

  object Member {
    def apply(
        AccountId: AccountId,
        Email: Email,
        MasterId: MasterId,
        RelationshipStatus: __string,
        UpdatedAt: UpdatedAt,
        DetectorId: js.UndefOr[DetectorId] = js.undefined,
        InvitedAt: js.UndefOr[InvitedAt] = js.undefined
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
    * Information about the NETWORK_CONNECTION action described in this finding.
    */
  @js.native
  trait NetworkConnectionAction extends js.Object {
    var Blocked: js.UndefOr[__boolean]
    var ConnectionDirection: js.UndefOr[__string]
    var LocalPortDetails: js.UndefOr[LocalPortDetails]
    var Protocol: js.UndefOr[__string]
    var RemoteIpDetails: js.UndefOr[RemoteIpDetails]
    var RemotePortDetails: js.UndefOr[RemotePortDetails]
  }

  object NetworkConnectionAction {
    def apply(
        Blocked: js.UndefOr[__boolean] = js.undefined,
        ConnectionDirection: js.UndefOr[__string] = js.undefined,
        LocalPortDetails: js.UndefOr[LocalPortDetails] = js.undefined,
        Protocol: js.UndefOr[__string] = js.undefined,
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
    * The network interface information of the EC2 instance.
    */
  @js.native
  trait NetworkInterface extends js.Object {
    var Ipv6Addresses: js.UndefOr[Ipv6Addresses]
    var NetworkInterfaceId: js.UndefOr[NetworkInterfaceId]
    var PrivateDnsName: js.UndefOr[PrivateDnsName]
    var PrivateIpAddress: js.UndefOr[PrivateIpAddress]
    var PrivateIpAddresses: js.UndefOr[PrivateIpAddresses]
    var PublicDnsName: js.UndefOr[__string]
    var PublicIp: js.UndefOr[__string]
    var SecurityGroups: js.UndefOr[SecurityGroups]
    var SubnetId: js.UndefOr[__string]
    var VpcId: js.UndefOr[__string]
  }

  object NetworkInterface {
    def apply(
        Ipv6Addresses: js.UndefOr[Ipv6Addresses] = js.undefined,
        NetworkInterfaceId: js.UndefOr[NetworkInterfaceId] = js.undefined,
        PrivateDnsName: js.UndefOr[PrivateDnsName] = js.undefined,
        PrivateIpAddress: js.UndefOr[PrivateIpAddress] = js.undefined,
        PrivateIpAddresses: js.UndefOr[PrivateIpAddresses] = js.undefined,
        PublicDnsName: js.UndefOr[__string] = js.undefined,
        PublicIp: js.UndefOr[__string] = js.undefined,
        SecurityGroups: js.UndefOr[SecurityGroups] = js.undefined,
        SubnetId: js.UndefOr[__string] = js.undefined,
        VpcId: js.UndefOr[__string] = js.undefined
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

    val values = IndexedSeq(ASC, DESC)
  }

  /**
    * ISP Organization information of the remote IP address.
    */
  @js.native
  trait Organization extends js.Object {
    var Asn: js.UndefOr[__string]
    var AsnOrg: js.UndefOr[__string]
    var Isp: js.UndefOr[__string]
    var Org: js.UndefOr[__string]
  }

  object Organization {
    def apply(
        Asn: js.UndefOr[__string] = js.undefined,
        AsnOrg: js.UndefOr[__string] = js.undefined,
        Isp: js.UndefOr[__string] = js.undefined,
        Org: js.UndefOr[__string] = js.undefined
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
    * Information about the PORT_PROBE action described in this finding.
    */
  @js.native
  trait PortProbeAction extends js.Object {
    var Blocked: js.UndefOr[__boolean]
    var PortProbeDetails: js.UndefOr[__listOfPortProbeDetail]
  }

  object PortProbeAction {
    def apply(
        Blocked: js.UndefOr[__boolean] = js.undefined,
        PortProbeDetails: js.UndefOr[__listOfPortProbeDetail] = js.undefined
    ): PortProbeAction = {
      val __obj = js.Dictionary.empty[js.Any]
      Blocked.foreach(__v => __obj.update("Blocked", __v.asInstanceOf[js.Any]))
      PortProbeDetails.foreach(__v => __obj.update("PortProbeDetails", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PortProbeAction]
    }
  }

  /**
    * Details about the port probe finding.
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
    * Other private IP address information of the EC2 instance.
    */
  @js.native
  trait PrivateIpAddressDetails extends js.Object {
    var PrivateDnsName: js.UndefOr[PrivateDnsName]
    var PrivateIpAddress: js.UndefOr[PrivateIpAddress]
  }

  object PrivateIpAddressDetails {
    def apply(
        PrivateDnsName: js.UndefOr[PrivateDnsName] = js.undefined,
        PrivateIpAddress: js.UndefOr[PrivateIpAddress] = js.undefined
    ): PrivateIpAddressDetails = {
      val __obj = js.Dictionary.empty[js.Any]
      PrivateDnsName.foreach(__v => __obj.update("PrivateDnsName", __v.asInstanceOf[js.Any]))
      PrivateIpAddress.foreach(__v => __obj.update("PrivateIpAddress", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PrivateIpAddressDetails]
    }
  }

  /**
    * The product code of the EC2 instance.
    */
  @js.native
  trait ProductCode extends js.Object {
    var Code: js.UndefOr[__string]
    var ProductType: js.UndefOr[__string]
  }

  object ProductCode {
    def apply(
        Code: js.UndefOr[__string] = js.undefined,
        ProductType: js.UndefOr[__string] = js.undefined
    ): ProductCode = {
      val __obj = js.Dictionary.empty[js.Any]
      Code.foreach(__v => __obj.update("Code", __v.asInstanceOf[js.Any]))
      ProductType.foreach(__v => __obj.update("ProductType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProductCode]
    }
  }

  /**
    * Remote IP information of the connection.
    */
  @js.native
  trait RemoteIpDetails extends js.Object {
    var City: js.UndefOr[City]
    var Country: js.UndefOr[Country]
    var GeoLocation: js.UndefOr[GeoLocation]
    var IpAddressV4: js.UndefOr[__string]
    var Organization: js.UndefOr[Organization]
  }

  object RemoteIpDetails {
    def apply(
        City: js.UndefOr[City] = js.undefined,
        Country: js.UndefOr[Country] = js.undefined,
        GeoLocation: js.UndefOr[GeoLocation] = js.undefined,
        IpAddressV4: js.UndefOr[__string] = js.undefined,
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
    * Remote port information of the connection.
    */
  @js.native
  trait RemotePortDetails extends js.Object {
    var Port: js.UndefOr[__integer]
    var PortName: js.UndefOr[__string]
  }

  object RemotePortDetails {
    def apply(
        Port: js.UndefOr[__integer] = js.undefined,
        PortName: js.UndefOr[__string] = js.undefined
    ): RemotePortDetails = {
      val __obj = js.Dictionary.empty[js.Any]
      Port.foreach(__v => __obj.update("Port", __v.asInstanceOf[js.Any]))
      PortName.foreach(__v => __obj.update("PortName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RemotePortDetails]
    }
  }

  /**
    * The AWS resource associated with the activity that prompted GuardDuty to generate a finding.
    */
  @js.native
  trait Resource extends js.Object {
    var AccessKeyDetails: js.UndefOr[AccessKeyDetails]
    var InstanceDetails: js.UndefOr[InstanceDetails]
    var ResourceType: js.UndefOr[__string]
  }

  object Resource {
    def apply(
        AccessKeyDetails: js.UndefOr[AccessKeyDetails] = js.undefined,
        InstanceDetails: js.UndefOr[InstanceDetails] = js.undefined,
        ResourceType: js.UndefOr[__string] = js.undefined
    ): Resource = {
      val __obj = js.Dictionary.empty[js.Any]
      AccessKeyDetails.foreach(__v => __obj.update("AccessKeyDetails", __v.asInstanceOf[js.Any]))
      InstanceDetails.foreach(__v => __obj.update("InstanceDetails", __v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.update("ResourceType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Resource]
    }
  }

  /**
    * Security groups associated with the EC2 instance.
    */
  @js.native
  trait SecurityGroup extends js.Object {
    var GroupId: js.UndefOr[__string]
    var GroupName: js.UndefOr[__string]
  }

  object SecurityGroup {
    def apply(
        GroupId: js.UndefOr[__string] = js.undefined,
        GroupName: js.UndefOr[__string] = js.undefined
    ): SecurityGroup = {
      val __obj = js.Dictionary.empty[js.Any]
      GroupId.foreach(__v => __obj.update("GroupId", __v.asInstanceOf[js.Any]))
      GroupName.foreach(__v => __obj.update("GroupName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SecurityGroup]
    }
  }

  /**
    * Additional information assigned to the generated finding by GuardDuty.
    */
  @js.native
  trait Service extends js.Object {
    var Action: js.UndefOr[Action]
    var Archived: js.UndefOr[__boolean]
    var Count: js.UndefOr[__integer]
    var DetectorId: js.UndefOr[DetectorId]
    var EventFirstSeen: js.UndefOr[__string]
    var EventLastSeen: js.UndefOr[__string]
    var ResourceRole: js.UndefOr[__string]
    var ServiceName: js.UndefOr[__string]
    var UserFeedback: js.UndefOr[__string]
  }

  object Service {
    def apply(
        Action: js.UndefOr[Action] = js.undefined,
        Archived: js.UndefOr[__boolean] = js.undefined,
        Count: js.UndefOr[__integer] = js.undefined,
        DetectorId: js.UndefOr[DetectorId] = js.undefined,
        EventFirstSeen: js.UndefOr[__string] = js.undefined,
        EventLastSeen: js.UndefOr[__string] = js.undefined,
        ResourceRole: js.UndefOr[__string] = js.undefined,
        ServiceName: js.UndefOr[__string] = js.undefined,
        UserFeedback: js.UndefOr[__string] = js.undefined
    ): Service = {
      val __obj = js.Dictionary.empty[js.Any]
      Action.foreach(__v => __obj.update("Action", __v.asInstanceOf[js.Any]))
      Archived.foreach(__v => __obj.update("Archived", __v.asInstanceOf[js.Any]))
      Count.foreach(__v => __obj.update("Count", __v.asInstanceOf[js.Any]))
      DetectorId.foreach(__v => __obj.update("DetectorId", __v.asInstanceOf[js.Any]))
      EventFirstSeen.foreach(__v => __obj.update("EventFirstSeen", __v.asInstanceOf[js.Any]))
      EventLastSeen.foreach(__v => __obj.update("EventLastSeen", __v.asInstanceOf[js.Any]))
      ResourceRole.foreach(__v => __obj.update("ResourceRole", __v.asInstanceOf[js.Any]))
      ServiceName.foreach(__v => __obj.update("ServiceName", __v.asInstanceOf[js.Any]))
      UserFeedback.foreach(__v => __obj.update("UserFeedback", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Service]
    }
  }

  /**
    * Represents the criteria used for sorting findings.
    */
  @js.native
  trait SortCriteria extends js.Object {
    var AttributeName: js.UndefOr[__string]
    var OrderBy: js.UndefOr[OrderBy]
  }

  object SortCriteria {
    def apply(
        AttributeName: js.UndefOr[__string] = js.undefined,
        OrderBy: js.UndefOr[OrderBy] = js.undefined
    ): SortCriteria = {
      val __obj = js.Dictionary.empty[js.Any]
      AttributeName.foreach(__v => __obj.update("AttributeName", __v.asInstanceOf[js.Any]))
      OrderBy.foreach(__v => __obj.update("OrderBy", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SortCriteria]
    }
  }

  /**
    * StartMonitoringMembers request body.
    */
  @js.native
  trait StartMonitoringMembersRequest extends js.Object {
    var AccountIds: AccountIds
    var DetectorId: __string
  }

  object StartMonitoringMembersRequest {
    def apply(
        AccountIds: AccountIds,
        DetectorId: __string
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
    var UnprocessedAccounts: js.UndefOr[UnprocessedAccounts]
  }

  object StartMonitoringMembersResponse {
    def apply(
        UnprocessedAccounts: js.UndefOr[UnprocessedAccounts] = js.undefined
    ): StartMonitoringMembersResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      UnprocessedAccounts.foreach(__v => __obj.update("UnprocessedAccounts", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartMonitoringMembersResponse]
    }
  }

  /**
    * StopMonitoringMembers request body.
    */
  @js.native
  trait StopMonitoringMembersRequest extends js.Object {
    var AccountIds: AccountIds
    var DetectorId: __string
  }

  object StopMonitoringMembersRequest {
    def apply(
        AccountIds: AccountIds,
        DetectorId: __string
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
    var UnprocessedAccounts: js.UndefOr[UnprocessedAccounts]
  }

  object StopMonitoringMembersResponse {
    def apply(
        UnprocessedAccounts: js.UndefOr[UnprocessedAccounts] = js.undefined
    ): StopMonitoringMembersResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      UnprocessedAccounts.foreach(__v => __obj.update("UnprocessedAccounts", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopMonitoringMembersResponse]
    }
  }

  /**
    * A tag of the EC2 instance.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: js.UndefOr[__string]
    var Value: js.UndefOr[__string]
  }

  object Tag {
    def apply(
        Key: js.UndefOr[__string] = js.undefined,
        Value: js.UndefOr[__string] = js.undefined
    ): Tag = {
      val __obj = js.Dictionary.empty[js.Any]
      Key.foreach(__v => __obj.update("Key", __v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.update("Value", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Tag]
    }
  }

  /**
    * The format of the threatIntelSet.
    */
  object ThreatIntelSetFormatEnum {
    val TXT         = "TXT"
    val STIX        = "STIX"
    val OTX_CSV     = "OTX_CSV"
    val ALIEN_VAULT = "ALIEN_VAULT"
    val PROOF_POINT = "PROOF_POINT"
    val FIRE_EYE    = "FIRE_EYE"

    val values = IndexedSeq(TXT, STIX, OTX_CSV, ALIEN_VAULT, PROOF_POINT, FIRE_EYE)
  }

  /**
    * The status of threatIntelSet file uploaded.
    */
  object ThreatIntelSetStatusEnum {
    val INACTIVE       = "INACTIVE"
    val ACTIVATING     = "ACTIVATING"
    val ACTIVE         = "ACTIVE"
    val DEACTIVATING   = "DEACTIVATING"
    val ERROR          = "ERROR"
    val DELETE_PENDING = "DELETE_PENDING"
    val DELETED        = "DELETED"

    val values = IndexedSeq(INACTIVE, ACTIVATING, ACTIVE, DEACTIVATING, ERROR, DELETE_PENDING, DELETED)
  }

  /**
    * UnarchiveFindings request body.
    */
  @js.native
  trait UnarchiveFindingsRequest extends js.Object {
    var DetectorId: __string
    var FindingIds: FindingIds
  }

  object UnarchiveFindingsRequest {
    def apply(
        DetectorId: __string,
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
    * An object containing the unprocessed account and a result string explaining why it was unprocessed.
    */
  @js.native
  trait UnprocessedAccount extends js.Object {
    var AccountId: __string
    var Result: __string
  }

  object UnprocessedAccount {
    def apply(
        AccountId: __string,
        Result: __string
    ): UnprocessedAccount = {
      val __obj = js.Dictionary[js.Any](
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "Result"    -> Result.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UnprocessedAccount]
    }
  }

  /**
    * UpdateDetector request body.
    */
  @js.native
  trait UpdateDetectorRequest extends js.Object {
    var DetectorId: __string
    var Enable: js.UndefOr[Enable]
    var FindingPublishingFrequency: js.UndefOr[FindingPublishingFrequency]
  }

  object UpdateDetectorRequest {
    def apply(
        DetectorId: __string,
        Enable: js.UndefOr[Enable] = js.undefined,
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

  /**
    * UpdateFilterRequest request body.
    */
  @js.native
  trait UpdateFilterRequest extends js.Object {
    var DetectorId: __string
    var FilterName: __string
    var Action: js.UndefOr[FilterAction]
    var Description: js.UndefOr[FilterDescription]
    var FindingCriteria: js.UndefOr[FindingCriteria]
    var Rank: js.UndefOr[FilterRank]
  }

  object UpdateFilterRequest {
    def apply(
        DetectorId: __string,
        FilterName: __string,
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
    var Name: js.UndefOr[FilterName]
  }

  object UpdateFilterResponse {
    def apply(
        Name: js.UndefOr[FilterName] = js.undefined
    ): UpdateFilterResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFilterResponse]
    }
  }

  /**
    * UpdateFindingsFeedback request body.
    */
  @js.native
  trait UpdateFindingsFeedbackRequest extends js.Object {
    var DetectorId: __string
    var Feedback: Feedback
    var FindingIds: FindingIds
    var Comments: js.UndefOr[Comments]
  }

  object UpdateFindingsFeedbackRequest {
    def apply(
        DetectorId: __string,
        Feedback: Feedback,
        FindingIds: FindingIds,
        Comments: js.UndefOr[Comments] = js.undefined
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

  /**
    * UpdateIPSet request body.
    */
  @js.native
  trait UpdateIPSetRequest extends js.Object {
    var DetectorId: __string
    var IpSetId: __string
    var Activate: js.UndefOr[Activate]
    var Location: js.UndefOr[Location]
    var Name: js.UndefOr[Name]
  }

  object UpdateIPSetRequest {
    def apply(
        DetectorId: __string,
        IpSetId: __string,
        Activate: js.UndefOr[Activate] = js.undefined,
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

  /**
    * UpdateThreatIntelSet request body.
    */
  @js.native
  trait UpdateThreatIntelSetRequest extends js.Object {
    var DetectorId: __string
    var ThreatIntelSetId: __string
    var Activate: js.UndefOr[Activate]
    var Location: js.UndefOr[Location]
    var Name: js.UndefOr[Name]
  }

  object UpdateThreatIntelSetRequest {
    def apply(
        DetectorId: __string,
        ThreatIntelSetId: __string,
        Activate: js.UndefOr[Activate] = js.undefined,
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
