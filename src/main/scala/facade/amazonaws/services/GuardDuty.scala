package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
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
    def apply(DetectorId: __string, InvitationId: InvitationId, MasterId: MasterId): AcceptInvitationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DetectorId"   -> DetectorId.asInstanceOf[js.Any],
        "InvitationId" -> InvitationId.asInstanceOf[js.Any],
        "MasterId"     -> MasterId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AcceptInvitationRequest]
    }
  }

  @js.native
  trait AcceptInvitationResponse extends js.Object {}

  object AcceptInvitationResponse {
    def apply(): AcceptInvitationResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AcceptInvitationResponse]
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
    def apply(AccessKeyId: js.UndefOr[__string] = js.undefined,
              PrincipalId: js.UndefOr[__string] = js.undefined,
              UserName: js.UndefOr[__string] = js.undefined,
              UserType: js.UndefOr[__string] = js.undefined): AccessKeyDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccessKeyId" -> AccessKeyId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PrincipalId" -> PrincipalId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserName" -> UserName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserType" -> UserType.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AccessKeyDetails]
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
    def apply(AccountId: AccountId, Email: Email): AccountDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "Email"     -> Email.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AccountDetail]
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
    def apply(ActionType: js.UndefOr[__string] = js.undefined,
              AwsApiCallAction: js.UndefOr[AwsApiCallAction] = js.undefined,
              DnsRequestAction: js.UndefOr[DnsRequestAction] = js.undefined,
              NetworkConnectionAction: js.UndefOr[NetworkConnectionAction] = js.undefined,
              PortProbeAction: js.UndefOr[PortProbeAction] = js.undefined): Action = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ActionType" -> ActionType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AwsApiCallAction" -> AwsApiCallAction.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DnsRequestAction" -> DnsRequestAction.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NetworkConnectionAction" -> NetworkConnectionAction.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PortProbeAction" -> PortProbeAction.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Action]
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
    def apply(DetectorId: __string, FindingIds: FindingIds): ArchiveFindingsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DetectorId" -> DetectorId.asInstanceOf[js.Any],
        "FindingIds" -> FindingIds.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ArchiveFindingsRequest]
    }
  }

  @js.native
  trait ArchiveFindingsResponse extends js.Object {}

  object ArchiveFindingsResponse {
    def apply(): ArchiveFindingsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ArchiveFindingsResponse]
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
    def apply(Api: js.UndefOr[__string] = js.undefined,
              CallerType: js.UndefOr[__string] = js.undefined,
              DomainDetails: js.UndefOr[DomainDetails] = js.undefined,
              RemoteIpDetails: js.UndefOr[RemoteIpDetails] = js.undefined,
              ServiceName: js.UndefOr[__string] = js.undefined): AwsApiCallAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Api" -> Api.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CallerType" -> CallerType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DomainDetails" -> DomainDetails.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RemoteIpDetails" -> RemoteIpDetails.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ServiceName" -> ServiceName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AwsApiCallAction]
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
    def apply(CityName: js.UndefOr[__string] = js.undefined): City = {
      val _fields = IndexedSeq[(String, js.Any)]("CityName" -> CityName.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[City]
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
    def apply(Eq: js.UndefOr[Eq] = js.undefined,
              Gt: js.UndefOr[__integer] = js.undefined,
              Gte: js.UndefOr[__integer] = js.undefined,
              Lt: js.UndefOr[__integer] = js.undefined,
              Lte: js.UndefOr[__integer] = js.undefined,
              Neq: js.UndefOr[Neq] = js.undefined): Condition = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Eq" -> Eq.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Gt" -> Gt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Gte" -> Gte.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Lt" -> Lt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Lte" -> Lte.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Neq" -> Neq.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Condition]
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
    def apply(CountryCode: js.UndefOr[__string] = js.undefined,
              CountryName: js.UndefOr[__string] = js.undefined): Country = {
      val _fields = IndexedSeq[(String, js.Any)]("CountryCode" -> CountryCode.map { x =>
        x.asInstanceOf[js.Any]
      }, "CountryName" -> CountryName.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Country]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Enable" -> Enable.asInstanceOf[js.Any],
        "ClientToken" -> ClientToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FindingPublishingFrequency" -> FindingPublishingFrequency.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDetectorRequest]
    }
  }

  @js.native
  trait CreateDetectorResponse extends js.Object {
    var DetectorId: js.UndefOr[DetectorId]
  }

  object CreateDetectorResponse {
    def apply(DetectorId: js.UndefOr[DetectorId] = js.undefined): CreateDetectorResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("DetectorId" -> DetectorId.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDetectorResponse]
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
    def apply(DetectorId: __string,
              FindingCriteria: FindingCriteria,
              Name: FilterName,
              Action: js.UndefOr[FilterAction] = js.undefined,
              ClientToken: js.UndefOr[__stringMin0Max64] = js.undefined,
              Description: js.UndefOr[FilterDescription] = js.undefined,
              Rank: js.UndefOr[FilterRank] = js.undefined): CreateFilterRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DetectorId"      -> DetectorId.asInstanceOf[js.Any],
        "FindingCriteria" -> FindingCriteria.asInstanceOf[js.Any],
        "Name"            -> Name.asInstanceOf[js.Any],
        "Action" -> Action.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ClientToken" -> ClientToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Rank" -> Rank.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateFilterRequest]
    }
  }

  @js.native
  trait CreateFilterResponse extends js.Object {
    var Name: js.UndefOr[FilterName]
  }

  object CreateFilterResponse {
    def apply(Name: js.UndefOr[FilterName] = js.undefined): CreateFilterResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("Name" -> Name.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateFilterResponse]
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
    def apply(Activate: Activate,
              DetectorId: __string,
              Format: IpSetFormat,
              Location: Location,
              Name: Name,
              ClientToken: js.UndefOr[__stringMin0Max64] = js.undefined): CreateIPSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Activate"   -> Activate.asInstanceOf[js.Any],
        "DetectorId" -> DetectorId.asInstanceOf[js.Any],
        "Format"     -> Format.asInstanceOf[js.Any],
        "Location"   -> Location.asInstanceOf[js.Any],
        "Name"       -> Name.asInstanceOf[js.Any],
        "ClientToken" -> ClientToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateIPSetRequest]
    }
  }

  @js.native
  trait CreateIPSetResponse extends js.Object {
    var IpSetId: js.UndefOr[IpSetId]
  }

  object CreateIPSetResponse {
    def apply(IpSetId: js.UndefOr[IpSetId] = js.undefined): CreateIPSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("IpSetId" -> IpSetId.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateIPSetResponse]
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
    def apply(AccountDetails: AccountDetails, DetectorId: __string): CreateMembersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountDetails" -> AccountDetails.asInstanceOf[js.Any],
        "DetectorId"     -> DetectorId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateMembersRequest]
    }
  }

  @js.native
  trait CreateMembersResponse extends js.Object {
    var UnprocessedAccounts: js.UndefOr[UnprocessedAccounts]
  }

  object CreateMembersResponse {
    def apply(UnprocessedAccounts: js.UndefOr[UnprocessedAccounts] = js.undefined): CreateMembersResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("UnprocessedAccounts" -> UnprocessedAccounts.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateMembersResponse]
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
    def apply(DetectorId: __string,
              FindingTypes: js.UndefOr[FindingTypes] = js.undefined): CreateSampleFindingsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DetectorId" -> DetectorId.asInstanceOf[js.Any],
        "FindingTypes" -> FindingTypes.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSampleFindingsRequest]
    }
  }

  @js.native
  trait CreateSampleFindingsResponse extends js.Object {}

  object CreateSampleFindingsResponse {
    def apply(): CreateSampleFindingsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSampleFindingsResponse]
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
    def apply(Activate: Activate,
              DetectorId: __string,
              Format: ThreatIntelSetFormat,
              Location: Location,
              Name: Name,
              ClientToken: js.UndefOr[__stringMin0Max64] = js.undefined): CreateThreatIntelSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Activate"   -> Activate.asInstanceOf[js.Any],
        "DetectorId" -> DetectorId.asInstanceOf[js.Any],
        "Format"     -> Format.asInstanceOf[js.Any],
        "Location"   -> Location.asInstanceOf[js.Any],
        "Name"       -> Name.asInstanceOf[js.Any],
        "ClientToken" -> ClientToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateThreatIntelSetRequest]
    }
  }

  @js.native
  trait CreateThreatIntelSetResponse extends js.Object {
    var ThreatIntelSetId: js.UndefOr[ThreatIntelSetId]
  }

  object CreateThreatIntelSetResponse {
    def apply(ThreatIntelSetId: js.UndefOr[ThreatIntelSetId] = js.undefined): CreateThreatIntelSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("ThreatIntelSetId" -> ThreatIntelSetId.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateThreatIntelSetResponse]
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
    def apply(AccountIds: AccountIds): DeclineInvitationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("AccountIds" -> AccountIds.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeclineInvitationsRequest]
    }
  }

  @js.native
  trait DeclineInvitationsResponse extends js.Object {
    var UnprocessedAccounts: js.UndefOr[UnprocessedAccounts]
  }

  object DeclineInvitationsResponse {
    def apply(UnprocessedAccounts: js.UndefOr[UnprocessedAccounts] = js.undefined): DeclineInvitationsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("UnprocessedAccounts" -> UnprocessedAccounts.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeclineInvitationsResponse]
    }
  }

  @js.native
  trait DeleteDetectorRequest extends js.Object {
    var DetectorId: __string
  }

  object DeleteDetectorRequest {
    def apply(DetectorId: __string): DeleteDetectorRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("DetectorId" -> DetectorId.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDetectorRequest]
    }
  }

  @js.native
  trait DeleteDetectorResponse extends js.Object {}

  object DeleteDetectorResponse {
    def apply(): DeleteDetectorResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDetectorResponse]
    }
  }

  @js.native
  trait DeleteFilterRequest extends js.Object {
    var DetectorId: __string
    var FilterName: __string
  }

  object DeleteFilterRequest {
    def apply(DetectorId: __string, FilterName: __string): DeleteFilterRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DetectorId" -> DetectorId.asInstanceOf[js.Any],
        "FilterName" -> FilterName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteFilterRequest]
    }
  }

  @js.native
  trait DeleteFilterResponse extends js.Object {}

  object DeleteFilterResponse {
    def apply(): DeleteFilterResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteFilterResponse]
    }
  }

  @js.native
  trait DeleteIPSetRequest extends js.Object {
    var DetectorId: __string
    var IpSetId: __string
  }

  object DeleteIPSetRequest {
    def apply(DetectorId: __string, IpSetId: __string): DeleteIPSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DetectorId" -> DetectorId.asInstanceOf[js.Any],
        "IpSetId"    -> IpSetId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteIPSetRequest]
    }
  }

  @js.native
  trait DeleteIPSetResponse extends js.Object {}

  object DeleteIPSetResponse {
    def apply(): DeleteIPSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteIPSetResponse]
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
    def apply(AccountIds: AccountIds): DeleteInvitationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("AccountIds" -> AccountIds.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteInvitationsRequest]
    }
  }

  @js.native
  trait DeleteInvitationsResponse extends js.Object {
    var UnprocessedAccounts: js.UndefOr[UnprocessedAccounts]
  }

  object DeleteInvitationsResponse {
    def apply(UnprocessedAccounts: js.UndefOr[UnprocessedAccounts] = js.undefined): DeleteInvitationsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("UnprocessedAccounts" -> UnprocessedAccounts.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteInvitationsResponse]
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
    def apply(AccountIds: AccountIds, DetectorId: __string): DeleteMembersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountIds" -> AccountIds.asInstanceOf[js.Any],
        "DetectorId" -> DetectorId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteMembersRequest]
    }
  }

  @js.native
  trait DeleteMembersResponse extends js.Object {
    var UnprocessedAccounts: js.UndefOr[UnprocessedAccounts]
  }

  object DeleteMembersResponse {
    def apply(UnprocessedAccounts: js.UndefOr[UnprocessedAccounts] = js.undefined): DeleteMembersResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("UnprocessedAccounts" -> UnprocessedAccounts.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteMembersResponse]
    }
  }

  @js.native
  trait DeleteThreatIntelSetRequest extends js.Object {
    var DetectorId: __string
    var ThreatIntelSetId: __string
  }

  object DeleteThreatIntelSetRequest {
    def apply(DetectorId: __string, ThreatIntelSetId: __string): DeleteThreatIntelSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DetectorId"       -> DetectorId.asInstanceOf[js.Any],
        "ThreatIntelSetId" -> ThreatIntelSetId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteThreatIntelSetRequest]
    }
  }

  @js.native
  trait DeleteThreatIntelSetResponse extends js.Object {}

  object DeleteThreatIntelSetResponse {
    def apply(): DeleteThreatIntelSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteThreatIntelSetResponse]
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
    def apply(DetectorId: __string): DisassociateFromMasterAccountRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("DetectorId" -> DetectorId.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateFromMasterAccountRequest]
    }
  }

  @js.native
  trait DisassociateFromMasterAccountResponse extends js.Object {}

  object DisassociateFromMasterAccountResponse {
    def apply(): DisassociateFromMasterAccountResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateFromMasterAccountResponse]
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
    def apply(AccountIds: AccountIds, DetectorId: __string): DisassociateMembersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountIds" -> AccountIds.asInstanceOf[js.Any],
        "DetectorId" -> DetectorId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateMembersRequest]
    }
  }

  @js.native
  trait DisassociateMembersResponse extends js.Object {
    var UnprocessedAccounts: js.UndefOr[UnprocessedAccounts]
  }

  object DisassociateMembersResponse {
    def apply(UnprocessedAccounts: js.UndefOr[UnprocessedAccounts] = js.undefined): DisassociateMembersResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("UnprocessedAccounts" -> UnprocessedAccounts.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateMembersResponse]
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
    def apply(Domain: js.UndefOr[Domain] = js.undefined): DnsRequestAction = {
      val _fields = IndexedSeq[(String, js.Any)]("Domain" -> Domain.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DnsRequestAction]
    }
  }

  /**
    * Domain information for the AWS API call.
    */
  @js.native
  trait DomainDetails extends js.Object {}

  object DomainDetails {
    def apply(): DomainDetails = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DomainDetails]
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
    def apply(AccountId: __string,
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
              Title: js.UndefOr[__string] = js.undefined): Finding = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId"     -> AccountId.asInstanceOf[js.Any],
        "Arn"           -> Arn.asInstanceOf[js.Any],
        "CreatedAt"     -> CreatedAt.asInstanceOf[js.Any],
        "Id"            -> Id.asInstanceOf[js.Any],
        "Region"        -> Region.asInstanceOf[js.Any],
        "Resource"      -> Resource.asInstanceOf[js.Any],
        "SchemaVersion" -> SchemaVersion.asInstanceOf[js.Any],
        "Severity"      -> Severity.asInstanceOf[js.Any],
        "Type"          -> Type.asInstanceOf[js.Any],
        "UpdatedAt"     -> UpdatedAt.asInstanceOf[js.Any],
        "Confidence" -> Confidence.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Partition" -> Partition.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Service" -> Service.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Title" -> Title.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Finding]
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
    def apply(Criterion: js.UndefOr[__mapOfCondition] = js.undefined): FindingCriteria = {
      val _fields = IndexedSeq[(String, js.Any)]("Criterion" -> Criterion.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FindingCriteria]
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
    def apply(CountBySeverity: js.UndefOr[__mapOfCountBySeverityFindingStatistic] = js.undefined): FindingStatistics = {
      val _fields = IndexedSeq[(String, js.Any)]("CountBySeverity" -> CountBySeverity.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FindingStatistics]
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
    def apply(Lat: js.UndefOr[__double] = js.undefined, Lon: js.UndefOr[__double] = js.undefined): GeoLocation = {
      val _fields = IndexedSeq[(String, js.Any)]("Lat" -> Lat.map { x =>
        x.asInstanceOf[js.Any]
      }, "Lon" -> Lon.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GeoLocation]
    }
  }

  @js.native
  trait GetDetectorRequest extends js.Object {
    var DetectorId: __string
  }

  object GetDetectorRequest {
    def apply(DetectorId: __string): GetDetectorRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("DetectorId" -> DetectorId.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDetectorRequest]
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
    def apply(CreatedAt: js.UndefOr[CreatedAt] = js.undefined,
              FindingPublishingFrequency: js.UndefOr[FindingPublishingFrequency] = js.undefined,
              ServiceRole: js.UndefOr[ServiceRole] = js.undefined,
              Status: js.UndefOr[DetectorStatus] = js.undefined,
              UpdatedAt: js.UndefOr[UpdatedAt] = js.undefined): GetDetectorResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreatedAt" -> CreatedAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FindingPublishingFrequency" -> FindingPublishingFrequency.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ServiceRole" -> ServiceRole.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UpdatedAt" -> UpdatedAt.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDetectorResponse]
    }
  }

  @js.native
  trait GetFilterRequest extends js.Object {
    var DetectorId: __string
    var FilterName: __string
  }

  object GetFilterRequest {
    def apply(DetectorId: __string, FilterName: __string): GetFilterRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DetectorId" -> DetectorId.asInstanceOf[js.Any],
        "FilterName" -> FilterName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetFilterRequest]
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
    def apply(Action: js.UndefOr[FilterAction] = js.undefined,
              Description: js.UndefOr[FilterDescription] = js.undefined,
              FindingCriteria: js.UndefOr[FindingCriteria] = js.undefined,
              Name: js.UndefOr[FilterName] = js.undefined,
              Rank: js.UndefOr[FilterRank] = js.undefined): GetFilterResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Action" -> Action.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FindingCriteria" -> FindingCriteria.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Rank" -> Rank.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetFilterResponse]
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
    def apply(DetectorId: __string,
              FindingIds: FindingIds,
              SortCriteria: js.UndefOr[SortCriteria] = js.undefined): GetFindingsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DetectorId" -> DetectorId.asInstanceOf[js.Any],
        "FindingIds" -> FindingIds.asInstanceOf[js.Any],
        "SortCriteria" -> SortCriteria.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetFindingsRequest]
    }
  }

  @js.native
  trait GetFindingsResponse extends js.Object {
    var Findings: js.UndefOr[Findings]
  }

  object GetFindingsResponse {
    def apply(Findings: js.UndefOr[Findings] = js.undefined): GetFindingsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("Findings" -> Findings.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetFindingsResponse]
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
    def apply(DetectorId: __string,
              FindingStatisticTypes: FindingStatisticTypes,
              FindingCriteria: js.UndefOr[FindingCriteria] = js.undefined): GetFindingsStatisticsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DetectorId"            -> DetectorId.asInstanceOf[js.Any],
        "FindingStatisticTypes" -> FindingStatisticTypes.asInstanceOf[js.Any],
        "FindingCriteria" -> FindingCriteria.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetFindingsStatisticsRequest]
    }
  }

  @js.native
  trait GetFindingsStatisticsResponse extends js.Object {
    var FindingStatistics: js.UndefOr[FindingStatistics]
  }

  object GetFindingsStatisticsResponse {
    def apply(FindingStatistics: js.UndefOr[FindingStatistics] = js.undefined): GetFindingsStatisticsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("FindingStatistics" -> FindingStatistics.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetFindingsStatisticsResponse]
    }
  }

  @js.native
  trait GetIPSetRequest extends js.Object {
    var DetectorId: __string
    var IpSetId: __string
  }

  object GetIPSetRequest {
    def apply(DetectorId: __string, IpSetId: __string): GetIPSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DetectorId" -> DetectorId.asInstanceOf[js.Any],
        "IpSetId"    -> IpSetId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetIPSetRequest]
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
    def apply(Format: js.UndefOr[IpSetFormat] = js.undefined,
              Location: js.UndefOr[Location] = js.undefined,
              Name: js.UndefOr[Name] = js.undefined,
              Status: js.UndefOr[IpSetStatus] = js.undefined): GetIPSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Format" -> Format.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Location" -> Location.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetIPSetResponse]
    }
  }

  @js.native
  trait GetInvitationsCountRequest extends js.Object {}

  object GetInvitationsCountRequest {
    def apply(): GetInvitationsCountRequest = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetInvitationsCountRequest]
    }
  }

  @js.native
  trait GetInvitationsCountResponse extends js.Object {
    var InvitationsCount: js.UndefOr[__integer]
  }

  object GetInvitationsCountResponse {
    def apply(InvitationsCount: js.UndefOr[__integer] = js.undefined): GetInvitationsCountResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("InvitationsCount" -> InvitationsCount.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetInvitationsCountResponse]
    }
  }

  @js.native
  trait GetMasterAccountRequest extends js.Object {
    var DetectorId: __string
  }

  object GetMasterAccountRequest {
    def apply(DetectorId: __string): GetMasterAccountRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("DetectorId" -> DetectorId.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetMasterAccountRequest]
    }
  }

  @js.native
  trait GetMasterAccountResponse extends js.Object {
    var Master: js.UndefOr[Master]
  }

  object GetMasterAccountResponse {
    def apply(Master: js.UndefOr[Master] = js.undefined): GetMasterAccountResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("Master" -> Master.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetMasterAccountResponse]
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
    def apply(AccountIds: AccountIds, DetectorId: __string): GetMembersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountIds" -> AccountIds.asInstanceOf[js.Any],
        "DetectorId" -> DetectorId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetMembersRequest]
    }
  }

  @js.native
  trait GetMembersResponse extends js.Object {
    var Members: js.UndefOr[Members]
    var UnprocessedAccounts: js.UndefOr[UnprocessedAccounts]
  }

  object GetMembersResponse {
    def apply(Members: js.UndefOr[Members] = js.undefined,
              UnprocessedAccounts: js.UndefOr[UnprocessedAccounts] = js.undefined): GetMembersResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("Members" -> Members.map { x =>
        x.asInstanceOf[js.Any]
      }, "UnprocessedAccounts" -> UnprocessedAccounts.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetMembersResponse]
    }
  }

  @js.native
  trait GetThreatIntelSetRequest extends js.Object {
    var DetectorId: __string
    var ThreatIntelSetId: __string
  }

  object GetThreatIntelSetRequest {
    def apply(DetectorId: __string, ThreatIntelSetId: __string): GetThreatIntelSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DetectorId"       -> DetectorId.asInstanceOf[js.Any],
        "ThreatIntelSetId" -> ThreatIntelSetId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetThreatIntelSetRequest]
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
    def apply(Format: js.UndefOr[ThreatIntelSetFormat] = js.undefined,
              Location: js.UndefOr[Location] = js.undefined,
              Name: js.UndefOr[Name] = js.undefined,
              Status: js.UndefOr[ThreatIntelSetStatus] = js.undefined): GetThreatIntelSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Format" -> Format.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Location" -> Location.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetThreatIntelSetResponse]
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
    def apply(Arn: js.UndefOr[__string] = js.undefined, Id: js.UndefOr[__string] = js.undefined): IamInstanceProfile = {
      val _fields = IndexedSeq[(String, js.Any)]("Arn" -> Arn.map { x =>
        x.asInstanceOf[js.Any]
      }, "Id" -> Id.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IamInstanceProfile]
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
    def apply(AvailabilityZone: js.UndefOr[__string] = js.undefined,
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
              Tags: js.UndefOr[Tags] = js.undefined): InstanceDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AvailabilityZone" -> AvailabilityZone.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IamInstanceProfile" -> IamInstanceProfile.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ImageDescription" -> ImageDescription.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ImageId" -> ImageId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InstanceId" -> InstanceId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InstanceState" -> InstanceState.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InstanceType" -> InstanceType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LaunchTime" -> LaunchTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NetworkInterfaces" -> NetworkInterfaces.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Platform" -> Platform.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ProductCodes" -> ProductCodes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceDetails]
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
    def apply(AccountId: js.UndefOr[__string] = js.undefined,
              InvitationId: js.UndefOr[InvitationId] = js.undefined,
              InvitedAt: js.UndefOr[InvitedAt] = js.undefined,
              RelationshipStatus: js.UndefOr[__string] = js.undefined): Invitation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId" -> AccountId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InvitationId" -> InvitationId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InvitedAt" -> InvitedAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RelationshipStatus" -> RelationshipStatus.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Invitation]
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
    def apply(AccountIds: AccountIds,
              DetectorId: __string,
              DisableEmailNotification: js.UndefOr[__boolean] = js.undefined,
              Message: js.UndefOr[Message] = js.undefined): InviteMembersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountIds" -> AccountIds.asInstanceOf[js.Any],
        "DetectorId" -> DetectorId.asInstanceOf[js.Any],
        "DisableEmailNotification" -> DisableEmailNotification.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Message" -> Message.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InviteMembersRequest]
    }
  }

  @js.native
  trait InviteMembersResponse extends js.Object {
    var UnprocessedAccounts: js.UndefOr[UnprocessedAccounts]
  }

  object InviteMembersResponse {
    def apply(UnprocessedAccounts: js.UndefOr[UnprocessedAccounts] = js.undefined): InviteMembersResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("UnprocessedAccounts" -> UnprocessedAccounts.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InviteMembersResponse]
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
    def apply(MaxResults: js.UndefOr[MaxResults] = js.undefined,
              NextToken: js.UndefOr[__string] = js.undefined): ListDetectorsRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("MaxResults" -> MaxResults.map { x =>
        x.asInstanceOf[js.Any]
      }, "NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDetectorsRequest]
    }
  }

  @js.native
  trait ListDetectorsResponse extends js.Object {
    var DetectorIds: js.UndefOr[DetectorIds]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDetectorsResponse {
    def apply(DetectorIds: js.UndefOr[DetectorIds] = js.undefined,
              NextToken: js.UndefOr[NextToken] = js.undefined): ListDetectorsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("DetectorIds" -> DetectorIds.map { x =>
        x.asInstanceOf[js.Any]
      }, "NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDetectorsResponse]
    }
  }

  @js.native
  trait ListFiltersRequest extends js.Object {
    var DetectorId: __string
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListFiltersRequest {
    def apply(DetectorId: __string,
              MaxResults: js.UndefOr[MaxResults] = js.undefined,
              NextToken: js.UndefOr[__string] = js.undefined): ListFiltersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DetectorId" -> DetectorId.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListFiltersRequest]
    }
  }

  @js.native
  trait ListFiltersResponse extends js.Object {
    var FilterNames: js.UndefOr[FilterNames]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListFiltersResponse {
    def apply(FilterNames: js.UndefOr[FilterNames] = js.undefined,
              NextToken: js.UndefOr[NextToken] = js.undefined): ListFiltersResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("FilterNames" -> FilterNames.map { x =>
        x.asInstanceOf[js.Any]
      }, "NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListFiltersResponse]
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
    def apply(DetectorId: __string,
              FindingCriteria: js.UndefOr[FindingCriteria] = js.undefined,
              MaxResults: js.UndefOr[MaxResults] = js.undefined,
              NextToken: js.UndefOr[NextToken] = js.undefined,
              SortCriteria: js.UndefOr[SortCriteria] = js.undefined): ListFindingsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DetectorId" -> DetectorId.asInstanceOf[js.Any],
        "FindingCriteria" -> FindingCriteria.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SortCriteria" -> SortCriteria.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListFindingsRequest]
    }
  }

  @js.native
  trait ListFindingsResponse extends js.Object {
    var FindingIds: js.UndefOr[FindingIds]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListFindingsResponse {
    def apply(FindingIds: js.UndefOr[FindingIds] = js.undefined,
              NextToken: js.UndefOr[NextToken] = js.undefined): ListFindingsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("FindingIds" -> FindingIds.map { x =>
        x.asInstanceOf[js.Any]
      }, "NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListFindingsResponse]
    }
  }

  @js.native
  trait ListIPSetsRequest extends js.Object {
    var DetectorId: __string
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListIPSetsRequest {
    def apply(DetectorId: __string,
              MaxResults: js.UndefOr[MaxResults] = js.undefined,
              NextToken: js.UndefOr[__string] = js.undefined): ListIPSetsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DetectorId" -> DetectorId.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListIPSetsRequest]
    }
  }

  @js.native
  trait ListIPSetsResponse extends js.Object {
    var IpSetIds: js.UndefOr[IpSetIds]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListIPSetsResponse {
    def apply(IpSetIds: js.UndefOr[IpSetIds] = js.undefined,
              NextToken: js.UndefOr[NextToken] = js.undefined): ListIPSetsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("IpSetIds" -> IpSetIds.map { x =>
        x.asInstanceOf[js.Any]
      }, "NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListIPSetsResponse]
    }
  }

  @js.native
  trait ListInvitationsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListInvitationsRequest {
    def apply(MaxResults: js.UndefOr[MaxResults] = js.undefined,
              NextToken: js.UndefOr[__string] = js.undefined): ListInvitationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("MaxResults" -> MaxResults.map { x =>
        x.asInstanceOf[js.Any]
      }, "NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListInvitationsRequest]
    }
  }

  @js.native
  trait ListInvitationsResponse extends js.Object {
    var Invitations: js.UndefOr[Invitations]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListInvitationsResponse {
    def apply(Invitations: js.UndefOr[Invitations] = js.undefined,
              NextToken: js.UndefOr[NextToken] = js.undefined): ListInvitationsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("Invitations" -> Invitations.map { x =>
        x.asInstanceOf[js.Any]
      }, "NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListInvitationsResponse]
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
    def apply(DetectorId: __string,
              MaxResults: js.UndefOr[MaxResults] = js.undefined,
              NextToken: js.UndefOr[__string] = js.undefined,
              OnlyAssociated: js.UndefOr[__string] = js.undefined): ListMembersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DetectorId" -> DetectorId.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OnlyAssociated" -> OnlyAssociated.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListMembersRequest]
    }
  }

  @js.native
  trait ListMembersResponse extends js.Object {
    var Members: js.UndefOr[Members]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListMembersResponse {
    def apply(Members: js.UndefOr[Members] = js.undefined,
              NextToken: js.UndefOr[NextToken] = js.undefined): ListMembersResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("Members" -> Members.map { x =>
        x.asInstanceOf[js.Any]
      }, "NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListMembersResponse]
    }
  }

  @js.native
  trait ListThreatIntelSetsRequest extends js.Object {
    var DetectorId: __string
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListThreatIntelSetsRequest {
    def apply(DetectorId: __string,
              MaxResults: js.UndefOr[MaxResults] = js.undefined,
              NextToken: js.UndefOr[__string] = js.undefined): ListThreatIntelSetsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DetectorId" -> DetectorId.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListThreatIntelSetsRequest]
    }
  }

  @js.native
  trait ListThreatIntelSetsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var ThreatIntelSetIds: js.UndefOr[ThreatIntelSetIds]
  }

  object ListThreatIntelSetsResponse {
    def apply(NextToken: js.UndefOr[NextToken] = js.undefined,
              ThreatIntelSetIds: js.UndefOr[ThreatIntelSetIds] = js.undefined): ListThreatIntelSetsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }, "ThreatIntelSetIds" -> ThreatIntelSetIds.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListThreatIntelSetsResponse]
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
    def apply(Port: js.UndefOr[__integer] = js.undefined,
              PortName: js.UndefOr[__string] = js.undefined): LocalPortDetails = {
      val _fields = IndexedSeq[(String, js.Any)]("Port" -> Port.map { x =>
        x.asInstanceOf[js.Any]
      }, "PortName" -> PortName.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LocalPortDetails]
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
    def apply(AccountId: js.UndefOr[__string] = js.undefined,
              InvitationId: js.UndefOr[InvitationId] = js.undefined,
              InvitedAt: js.UndefOr[InvitedAt] = js.undefined,
              RelationshipStatus: js.UndefOr[__string] = js.undefined): Master = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId" -> AccountId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InvitationId" -> InvitationId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InvitedAt" -> InvitedAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RelationshipStatus" -> RelationshipStatus.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Master]
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
    def apply(AccountId: AccountId,
              Email: Email,
              MasterId: MasterId,
              RelationshipStatus: __string,
              UpdatedAt: UpdatedAt,
              DetectorId: js.UndefOr[DetectorId] = js.undefined,
              InvitedAt: js.UndefOr[InvitedAt] = js.undefined): Member = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId"          -> AccountId.asInstanceOf[js.Any],
        "Email"              -> Email.asInstanceOf[js.Any],
        "MasterId"           -> MasterId.asInstanceOf[js.Any],
        "RelationshipStatus" -> RelationshipStatus.asInstanceOf[js.Any],
        "UpdatedAt"          -> UpdatedAt.asInstanceOf[js.Any],
        "DetectorId" -> DetectorId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InvitedAt" -> InvitedAt.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Member]
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
    def apply(Blocked: js.UndefOr[__boolean] = js.undefined,
              ConnectionDirection: js.UndefOr[__string] = js.undefined,
              LocalPortDetails: js.UndefOr[LocalPortDetails] = js.undefined,
              Protocol: js.UndefOr[__string] = js.undefined,
              RemoteIpDetails: js.UndefOr[RemoteIpDetails] = js.undefined,
              RemotePortDetails: js.UndefOr[RemotePortDetails] = js.undefined): NetworkConnectionAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Blocked" -> Blocked.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ConnectionDirection" -> ConnectionDirection.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LocalPortDetails" -> LocalPortDetails.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Protocol" -> Protocol.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RemoteIpDetails" -> RemoteIpDetails.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RemotePortDetails" -> RemotePortDetails.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NetworkConnectionAction]
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
    def apply(Ipv6Addresses: js.UndefOr[Ipv6Addresses] = js.undefined,
              NetworkInterfaceId: js.UndefOr[NetworkInterfaceId] = js.undefined,
              PrivateDnsName: js.UndefOr[PrivateDnsName] = js.undefined,
              PrivateIpAddress: js.UndefOr[PrivateIpAddress] = js.undefined,
              PrivateIpAddresses: js.UndefOr[PrivateIpAddresses] = js.undefined,
              PublicDnsName: js.UndefOr[__string] = js.undefined,
              PublicIp: js.UndefOr[__string] = js.undefined,
              SecurityGroups: js.UndefOr[SecurityGroups] = js.undefined,
              SubnetId: js.UndefOr[__string] = js.undefined,
              VpcId: js.UndefOr[__string] = js.undefined): NetworkInterface = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Ipv6Addresses" -> Ipv6Addresses.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NetworkInterfaceId" -> NetworkInterfaceId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PrivateDnsName" -> PrivateDnsName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PrivateIpAddress" -> PrivateIpAddress.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PrivateIpAddresses" -> PrivateIpAddresses.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PublicDnsName" -> PublicDnsName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PublicIp" -> PublicIp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SecurityGroups" -> SecurityGroups.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SubnetId" -> SubnetId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VpcId" -> VpcId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NetworkInterface]
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
    def apply(Asn: js.UndefOr[__string] = js.undefined,
              AsnOrg: js.UndefOr[__string] = js.undefined,
              Isp: js.UndefOr[__string] = js.undefined,
              Org: js.UndefOr[__string] = js.undefined): Organization = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Asn" -> Asn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AsnOrg" -> AsnOrg.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Isp" -> Isp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Org" -> Org.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Organization]
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
    def apply(Blocked: js.UndefOr[__boolean] = js.undefined,
              PortProbeDetails: js.UndefOr[__listOfPortProbeDetail] = js.undefined): PortProbeAction = {
      val _fields = IndexedSeq[(String, js.Any)]("Blocked" -> Blocked.map { x =>
        x.asInstanceOf[js.Any]
      }, "PortProbeDetails" -> PortProbeDetails.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PortProbeAction]
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
    def apply(LocalPortDetails: js.UndefOr[LocalPortDetails] = js.undefined,
              RemoteIpDetails: js.UndefOr[RemoteIpDetails] = js.undefined): PortProbeDetail = {
      val _fields = IndexedSeq[(String, js.Any)]("LocalPortDetails" -> LocalPortDetails.map { x =>
        x.asInstanceOf[js.Any]
      }, "RemoteIpDetails" -> RemoteIpDetails.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PortProbeDetail]
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
    def apply(PrivateDnsName: js.UndefOr[PrivateDnsName] = js.undefined,
              PrivateIpAddress: js.UndefOr[PrivateIpAddress] = js.undefined): PrivateIpAddressDetails = {
      val _fields = IndexedSeq[(String, js.Any)]("PrivateDnsName" -> PrivateDnsName.map { x =>
        x.asInstanceOf[js.Any]
      }, "PrivateIpAddress" -> PrivateIpAddress.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PrivateIpAddressDetails]
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
    def apply(Code: js.UndefOr[__string] = js.undefined,
              ProductType: js.UndefOr[__string] = js.undefined): ProductCode = {
      val _fields = IndexedSeq[(String, js.Any)]("Code" -> Code.map { x =>
        x.asInstanceOf[js.Any]
      }, "ProductType" -> ProductType.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ProductCode]
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
    def apply(City: js.UndefOr[City] = js.undefined,
              Country: js.UndefOr[Country] = js.undefined,
              GeoLocation: js.UndefOr[GeoLocation] = js.undefined,
              IpAddressV4: js.UndefOr[__string] = js.undefined,
              Organization: js.UndefOr[Organization] = js.undefined): RemoteIpDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "City" -> City.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Country" -> Country.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GeoLocation" -> GeoLocation.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IpAddressV4" -> IpAddressV4.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Organization" -> Organization.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoteIpDetails]
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
    def apply(Port: js.UndefOr[__integer] = js.undefined,
              PortName: js.UndefOr[__string] = js.undefined): RemotePortDetails = {
      val _fields = IndexedSeq[(String, js.Any)]("Port" -> Port.map { x =>
        x.asInstanceOf[js.Any]
      }, "PortName" -> PortName.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemotePortDetails]
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
    def apply(AccessKeyDetails: js.UndefOr[AccessKeyDetails] = js.undefined,
              InstanceDetails: js.UndefOr[InstanceDetails] = js.undefined,
              ResourceType: js.UndefOr[__string] = js.undefined): Resource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccessKeyDetails" -> AccessKeyDetails.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InstanceDetails" -> InstanceDetails.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ResourceType" -> ResourceType.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Resource]
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
    def apply(GroupId: js.UndefOr[__string] = js.undefined,
              GroupName: js.UndefOr[__string] = js.undefined): SecurityGroup = {
      val _fields = IndexedSeq[(String, js.Any)]("GroupId" -> GroupId.map { x =>
        x.asInstanceOf[js.Any]
      }, "GroupName" -> GroupName.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SecurityGroup]
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
    def apply(Action: js.UndefOr[Action] = js.undefined,
              Archived: js.UndefOr[__boolean] = js.undefined,
              Count: js.UndefOr[__integer] = js.undefined,
              DetectorId: js.UndefOr[DetectorId] = js.undefined,
              EventFirstSeen: js.UndefOr[__string] = js.undefined,
              EventLastSeen: js.UndefOr[__string] = js.undefined,
              ResourceRole: js.UndefOr[__string] = js.undefined,
              ServiceName: js.UndefOr[__string] = js.undefined,
              UserFeedback: js.UndefOr[__string] = js.undefined): Service = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Action" -> Action.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Archived" -> Archived.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Count" -> Count.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DetectorId" -> DetectorId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EventFirstSeen" -> EventFirstSeen.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EventLastSeen" -> EventLastSeen.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ResourceRole" -> ResourceRole.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ServiceName" -> ServiceName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserFeedback" -> UserFeedback.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Service]
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
    def apply(AttributeName: js.UndefOr[__string] = js.undefined,
              OrderBy: js.UndefOr[OrderBy] = js.undefined): SortCriteria = {
      val _fields = IndexedSeq[(String, js.Any)]("AttributeName" -> AttributeName.map { x =>
        x.asInstanceOf[js.Any]
      }, "OrderBy" -> OrderBy.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SortCriteria]
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
    def apply(AccountIds: AccountIds, DetectorId: __string): StartMonitoringMembersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountIds" -> AccountIds.asInstanceOf[js.Any],
        "DetectorId" -> DetectorId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartMonitoringMembersRequest]
    }
  }

  @js.native
  trait StartMonitoringMembersResponse extends js.Object {
    var UnprocessedAccounts: js.UndefOr[UnprocessedAccounts]
  }

  object StartMonitoringMembersResponse {
    def apply(UnprocessedAccounts: js.UndefOr[UnprocessedAccounts] = js.undefined): StartMonitoringMembersResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("UnprocessedAccounts" -> UnprocessedAccounts.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartMonitoringMembersResponse]
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
    def apply(AccountIds: AccountIds, DetectorId: __string): StopMonitoringMembersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountIds" -> AccountIds.asInstanceOf[js.Any],
        "DetectorId" -> DetectorId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopMonitoringMembersRequest]
    }
  }

  @js.native
  trait StopMonitoringMembersResponse extends js.Object {
    var UnprocessedAccounts: js.UndefOr[UnprocessedAccounts]
  }

  object StopMonitoringMembersResponse {
    def apply(UnprocessedAccounts: js.UndefOr[UnprocessedAccounts] = js.undefined): StopMonitoringMembersResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("UnprocessedAccounts" -> UnprocessedAccounts.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopMonitoringMembersResponse]
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
    def apply(Key: js.UndefOr[__string] = js.undefined, Value: js.UndefOr[__string] = js.undefined): Tag = {
      val _fields = IndexedSeq[(String, js.Any)]("Key" -> Key.map { x =>
        x.asInstanceOf[js.Any]
      }, "Value" -> Value.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
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
    def apply(DetectorId: __string, FindingIds: FindingIds): UnarchiveFindingsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DetectorId" -> DetectorId.asInstanceOf[js.Any],
        "FindingIds" -> FindingIds.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UnarchiveFindingsRequest]
    }
  }

  @js.native
  trait UnarchiveFindingsResponse extends js.Object {}

  object UnarchiveFindingsResponse {
    def apply(): UnarchiveFindingsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UnarchiveFindingsResponse]
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
    def apply(AccountId: __string, Result: __string): UnprocessedAccount = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "Result"    -> Result.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UnprocessedAccount]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "DetectorId" -> DetectorId.asInstanceOf[js.Any],
        "Enable" -> Enable.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FindingPublishingFrequency" -> FindingPublishingFrequency.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDetectorRequest]
    }
  }

  @js.native
  trait UpdateDetectorResponse extends js.Object {}

  object UpdateDetectorResponse {
    def apply(): UpdateDetectorResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDetectorResponse]
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
    def apply(DetectorId: __string,
              FilterName: __string,
              Action: js.UndefOr[FilterAction] = js.undefined,
              Description: js.UndefOr[FilterDescription] = js.undefined,
              FindingCriteria: js.UndefOr[FindingCriteria] = js.undefined,
              Rank: js.UndefOr[FilterRank] = js.undefined): UpdateFilterRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DetectorId" -> DetectorId.asInstanceOf[js.Any],
        "FilterName" -> FilterName.asInstanceOf[js.Any],
        "Action" -> Action.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FindingCriteria" -> FindingCriteria.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Rank" -> Rank.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateFilterRequest]
    }
  }

  @js.native
  trait UpdateFilterResponse extends js.Object {
    var Name: js.UndefOr[FilterName]
  }

  object UpdateFilterResponse {
    def apply(Name: js.UndefOr[FilterName] = js.undefined): UpdateFilterResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("Name" -> Name.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateFilterResponse]
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
    def apply(DetectorId: __string,
              Feedback: Feedback,
              FindingIds: FindingIds,
              Comments: js.UndefOr[Comments] = js.undefined): UpdateFindingsFeedbackRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DetectorId" -> DetectorId.asInstanceOf[js.Any],
        "Feedback"   -> Feedback.asInstanceOf[js.Any],
        "FindingIds" -> FindingIds.asInstanceOf[js.Any],
        "Comments" -> Comments.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateFindingsFeedbackRequest]
    }
  }

  @js.native
  trait UpdateFindingsFeedbackResponse extends js.Object {}

  object UpdateFindingsFeedbackResponse {
    def apply(): UpdateFindingsFeedbackResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateFindingsFeedbackResponse]
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
    def apply(DetectorId: __string,
              IpSetId: __string,
              Activate: js.UndefOr[Activate] = js.undefined,
              Location: js.UndefOr[Location] = js.undefined,
              Name: js.UndefOr[Name] = js.undefined): UpdateIPSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DetectorId" -> DetectorId.asInstanceOf[js.Any],
        "IpSetId"    -> IpSetId.asInstanceOf[js.Any],
        "Activate" -> Activate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Location" -> Location.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateIPSetRequest]
    }
  }

  @js.native
  trait UpdateIPSetResponse extends js.Object {}

  object UpdateIPSetResponse {
    def apply(): UpdateIPSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateIPSetResponse]
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
    def apply(DetectorId: __string,
              ThreatIntelSetId: __string,
              Activate: js.UndefOr[Activate] = js.undefined,
              Location: js.UndefOr[Location] = js.undefined,
              Name: js.UndefOr[Name] = js.undefined): UpdateThreatIntelSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DetectorId"       -> DetectorId.asInstanceOf[js.Any],
        "ThreatIntelSetId" -> ThreatIntelSetId.asInstanceOf[js.Any],
        "Activate" -> Activate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Location" -> Location.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateThreatIntelSetRequest]
    }
  }

  @js.native
  trait UpdateThreatIntelSetResponse extends js.Object {}

  object UpdateThreatIntelSetResponse {
    def apply(): UpdateThreatIntelSetResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateThreatIntelSetResponse]
    }
  }
}
