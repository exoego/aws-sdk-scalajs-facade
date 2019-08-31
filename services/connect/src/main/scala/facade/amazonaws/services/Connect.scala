package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object connect {
  type ARN                             = String
  type AfterContactWorkTimeLimit       = Int
  type AgentFirstName                  = String
  type AgentLastName                   = String
  type AgentUsername                   = String
  type AttributeName                   = String
  type AttributeValue                  = String
  type Attributes                      = js.Dictionary[AttributeValue]
  type AutoAccept                      = Boolean
  type Channel                         = String
  type Channels                        = js.Array[Channel]
  type ClientToken                     = String
  type Comparison                      = String
  type ContactFlowId                   = String
  type ContactId                       = String
  type CurrentMetricDataCollections    = js.Array[CurrentMetricData]
  type CurrentMetricName               = String
  type CurrentMetricResults            = js.Array[CurrentMetricResult]
  type CurrentMetrics                  = js.Array[CurrentMetric]
  type DirectoryUserId                 = String
  type Email                           = String
  type Grouping                        = String
  type Groupings                       = js.Array[Grouping]
  type HierarchyGroupId                = String
  type HierarchyGroupName              = String
  type HierarchyGroupSummaryList       = js.Array[HierarchyGroupSummary]
  type HierarchyLevelId                = String
  type HierarchyLevelName              = String
  type HistoricalMetricDataCollections = js.Array[HistoricalMetricData]
  type HistoricalMetricName            = String
  type HistoricalMetricResults         = js.Array[HistoricalMetricResult]
  type HistoricalMetrics               = js.Array[HistoricalMetric]
  type InstanceId                      = String
  type MaxResult100                    = Int
  type MaxResult1000                   = Int
  type NextToken                       = String
  type Password                        = String
  type PhoneNumber                     = String
  type PhoneType                       = String
  type QueueId                         = String
  type Queues                          = js.Array[QueueId]
  type RoutingProfileId                = String
  type RoutingProfileName              = String
  type RoutingProfileSummaryList       = js.Array[RoutingProfileSummary]
  type SecurityProfileId               = String
  type SecurityProfileIds              = js.Array[SecurityProfileId]
  type SecurityProfileName             = String
  type SecurityProfileSummaryList      = js.Array[SecurityProfileSummary]
  type SecurityToken                   = String
  type Statistic                       = String
  type ThresholdValue                  = Double
  type Unit                            = String
  type UserId                          = String
  type UserSummaryList                 = js.Array[UserSummary]
  type Value                           = Double
  type timestamp                       = js.Date

  implicit final class ConnectOps(private val service: Connect) extends AnyVal {

    def createUserFuture(params: CreateUserRequest): Future[CreateUserResponse] =
      service.createUser(params).promise.toFuture
    def deleteUserFuture(params: DeleteUserRequest): Future[js.Object] = service.deleteUser(params).promise.toFuture
    def describeUserFuture(params: DescribeUserRequest): Future[DescribeUserResponse] =
      service.describeUser(params).promise.toFuture
    def describeUserHierarchyGroupFuture(
        params: DescribeUserHierarchyGroupRequest
    ): Future[DescribeUserHierarchyGroupResponse] = service.describeUserHierarchyGroup(params).promise.toFuture
    def describeUserHierarchyStructureFuture(
        params: DescribeUserHierarchyStructureRequest
    ): Future[DescribeUserHierarchyStructureResponse] = service.describeUserHierarchyStructure(params).promise.toFuture
    def getContactAttributesFuture(params: GetContactAttributesRequest): Future[GetContactAttributesResponse] =
      service.getContactAttributes(params).promise.toFuture
    def getCurrentMetricDataFuture(params: GetCurrentMetricDataRequest): Future[GetCurrentMetricDataResponse] =
      service.getCurrentMetricData(params).promise.toFuture
    def getFederationTokenFuture(params: GetFederationTokenRequest): Future[GetFederationTokenResponse] =
      service.getFederationToken(params).promise.toFuture
    def getMetricDataFuture(params: GetMetricDataRequest): Future[GetMetricDataResponse] =
      service.getMetricData(params).promise.toFuture
    def listRoutingProfilesFuture(params: ListRoutingProfilesRequest): Future[ListRoutingProfilesResponse] =
      service.listRoutingProfiles(params).promise.toFuture
    def listSecurityProfilesFuture(params: ListSecurityProfilesRequest): Future[ListSecurityProfilesResponse] =
      service.listSecurityProfiles(params).promise.toFuture
    def listUserHierarchyGroupsFuture(params: ListUserHierarchyGroupsRequest): Future[ListUserHierarchyGroupsResponse] =
      service.listUserHierarchyGroups(params).promise.toFuture
    def listUsersFuture(params: ListUsersRequest): Future[ListUsersResponse] =
      service.listUsers(params).promise.toFuture
    def startOutboundVoiceContactFuture(
        params: StartOutboundVoiceContactRequest
    ): Future[StartOutboundVoiceContactResponse] = service.startOutboundVoiceContact(params).promise.toFuture
    def stopContactFuture(params: StopContactRequest): Future[StopContactResponse] =
      service.stopContact(params).promise.toFuture
    def updateContactAttributesFuture(params: UpdateContactAttributesRequest): Future[UpdateContactAttributesResponse] =
      service.updateContactAttributes(params).promise.toFuture
    def updateUserHierarchyFuture(params: UpdateUserHierarchyRequest): Future[js.Object] =
      service.updateUserHierarchy(params).promise.toFuture
    def updateUserIdentityInfoFuture(params: UpdateUserIdentityInfoRequest): Future[js.Object] =
      service.updateUserIdentityInfo(params).promise.toFuture
    def updateUserPhoneConfigFuture(params: UpdateUserPhoneConfigRequest): Future[js.Object] =
      service.updateUserPhoneConfig(params).promise.toFuture
    def updateUserRoutingProfileFuture(params: UpdateUserRoutingProfileRequest): Future[js.Object] =
      service.updateUserRoutingProfile(params).promise.toFuture
    def updateUserSecurityProfilesFuture(params: UpdateUserSecurityProfilesRequest): Future[js.Object] =
      service.updateUserSecurityProfiles(params).promise.toFuture
  }
}

package connect {
  @js.native
  @JSImport("aws-sdk", "Connect")
  class Connect() extends js.Object {
    def this(config: AWSConfig) = this()

    def createUser(params: CreateUserRequest): Request[CreateUserResponse]       = js.native
    def deleteUser(params: DeleteUserRequest): Request[js.Object]                = js.native
    def describeUser(params: DescribeUserRequest): Request[DescribeUserResponse] = js.native
    def describeUserHierarchyGroup(
        params: DescribeUserHierarchyGroupRequest
    ): Request[DescribeUserHierarchyGroupResponse] = js.native
    def describeUserHierarchyStructure(
        params: DescribeUserHierarchyStructureRequest
    ): Request[DescribeUserHierarchyStructureResponse]                                                   = js.native
    def getContactAttributes(params: GetContactAttributesRequest): Request[GetContactAttributesResponse] = js.native
    def getCurrentMetricData(params: GetCurrentMetricDataRequest): Request[GetCurrentMetricDataResponse] = js.native
    def getFederationToken(params: GetFederationTokenRequest): Request[GetFederationTokenResponse]       = js.native
    def getMetricData(params: GetMetricDataRequest): Request[GetMetricDataResponse]                      = js.native
    def listRoutingProfiles(params: ListRoutingProfilesRequest): Request[ListRoutingProfilesResponse]    = js.native
    def listSecurityProfiles(params: ListSecurityProfilesRequest): Request[ListSecurityProfilesResponse] = js.native
    def listUserHierarchyGroups(params: ListUserHierarchyGroupsRequest): Request[ListUserHierarchyGroupsResponse] =
      js.native
    def listUsers(params: ListUsersRequest): Request[ListUsersResponse] = js.native
    def startOutboundVoiceContact(
        params: StartOutboundVoiceContactRequest
    ): Request[StartOutboundVoiceContactResponse]                             = js.native
    def stopContact(params: StopContactRequest): Request[StopContactResponse] = js.native
    def updateContactAttributes(params: UpdateContactAttributesRequest): Request[UpdateContactAttributesResponse] =
      js.native
    def updateUserHierarchy(params: UpdateUserHierarchyRequest): Request[js.Object]               = js.native
    def updateUserIdentityInfo(params: UpdateUserIdentityInfoRequest): Request[js.Object]         = js.native
    def updateUserPhoneConfig(params: UpdateUserPhoneConfigRequest): Request[js.Object]           = js.native
    def updateUserRoutingProfile(params: UpdateUserRoutingProfileRequest): Request[js.Object]     = js.native
    def updateUserSecurityProfiles(params: UpdateUserSecurityProfilesRequest): Request[js.Object] = js.native
  }

  object ChannelEnum {
    val VOICE = "VOICE"

    val values = js.Object.freeze(js.Array(VOICE))
  }

  object ComparisonEnum {
    val LT = "LT"

    val values = js.Object.freeze(js.Array(LT))
  }

  @js.native
  trait CreateUserRequest extends js.Object {
    var InstanceId: InstanceId
    var PhoneConfig: UserPhoneConfig
    var RoutingProfileId: RoutingProfileId
    var SecurityProfileIds: SecurityProfileIds
    var Username: AgentUsername
    var DirectoryUserId: js.UndefOr[DirectoryUserId]
    var HierarchyGroupId: js.UndefOr[HierarchyGroupId]
    var IdentityInfo: js.UndefOr[UserIdentityInfo]
    var Password: js.UndefOr[Password]
  }

  object CreateUserRequest {
    def apply(
        InstanceId: InstanceId,
        PhoneConfig: UserPhoneConfig,
        RoutingProfileId: RoutingProfileId,
        SecurityProfileIds: SecurityProfileIds,
        Username: AgentUsername,
        DirectoryUserId: js.UndefOr[DirectoryUserId] = js.undefined,
        HierarchyGroupId: js.UndefOr[HierarchyGroupId] = js.undefined,
        IdentityInfo: js.UndefOr[UserIdentityInfo] = js.undefined,
        Password: js.UndefOr[Password] = js.undefined
    ): CreateUserRequest = {
      val __obj = js.Dictionary[js.Any](
        "InstanceId"         -> InstanceId.asInstanceOf[js.Any],
        "PhoneConfig"        -> PhoneConfig.asInstanceOf[js.Any],
        "RoutingProfileId"   -> RoutingProfileId.asInstanceOf[js.Any],
        "SecurityProfileIds" -> SecurityProfileIds.asInstanceOf[js.Any],
        "Username"           -> Username.asInstanceOf[js.Any]
      )

      DirectoryUserId.foreach(__v => __obj.update("DirectoryUserId", __v.asInstanceOf[js.Any]))
      HierarchyGroupId.foreach(__v => __obj.update("HierarchyGroupId", __v.asInstanceOf[js.Any]))
      IdentityInfo.foreach(__v => __obj.update("IdentityInfo", __v.asInstanceOf[js.Any]))
      Password.foreach(__v => __obj.update("Password", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateUserRequest]
    }
  }

  @js.native
  trait CreateUserResponse extends js.Object {
    var UserArn: js.UndefOr[ARN]
    var UserId: js.UndefOr[UserId]
  }

  object CreateUserResponse {
    def apply(
        UserArn: js.UndefOr[ARN] = js.undefined,
        UserId: js.UndefOr[UserId] = js.undefined
    ): CreateUserResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      UserArn.foreach(__v => __obj.update("UserArn", __v.asInstanceOf[js.Any]))
      UserId.foreach(__v => __obj.update("UserId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateUserResponse]
    }
  }

  /**
    * The credentials to use for federation.
    */
  @js.native
  trait Credentials extends js.Object {
    var AccessToken: js.UndefOr[SecurityToken]
    var AccessTokenExpiration: js.UndefOr[timestamp]
    var RefreshToken: js.UndefOr[SecurityToken]
    var RefreshTokenExpiration: js.UndefOr[timestamp]
  }

  object Credentials {
    def apply(
        AccessToken: js.UndefOr[SecurityToken] = js.undefined,
        AccessTokenExpiration: js.UndefOr[timestamp] = js.undefined,
        RefreshToken: js.UndefOr[SecurityToken] = js.undefined,
        RefreshTokenExpiration: js.UndefOr[timestamp] = js.undefined
    ): Credentials = {
      val __obj = js.Dictionary.empty[js.Any]
      AccessToken.foreach(__v => __obj.update("AccessToken", __v.asInstanceOf[js.Any]))
      AccessTokenExpiration.foreach(__v => __obj.update("AccessTokenExpiration", __v.asInstanceOf[js.Any]))
      RefreshToken.foreach(__v => __obj.update("RefreshToken", __v.asInstanceOf[js.Any]))
      RefreshTokenExpiration.foreach(__v => __obj.update("RefreshTokenExpiration", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Credentials]
    }
  }

  /**
    * A <code>CurrentMetric</code> object that contains the Name and Unit for the metric.
    */
  @js.native
  trait CurrentMetric extends js.Object {
    var Name: js.UndefOr[CurrentMetricName]
    var Unit: js.UndefOr[Unit]
  }

  object CurrentMetric {
    def apply(
        Name: js.UndefOr[CurrentMetricName] = js.undefined,
        Unit: js.UndefOr[Unit] = js.undefined
    ): CurrentMetric = {
      val __obj = js.Dictionary.empty[js.Any]
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Unit.foreach(__v => __obj.update("Unit", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CurrentMetric]
    }
  }

  /**
    * A <code>CurrentMetricData</code> object.
    */
  @js.native
  trait CurrentMetricData extends js.Object {
    var Metric: js.UndefOr[CurrentMetric]
    var Value: js.UndefOr[Value]
  }

  object CurrentMetricData {
    def apply(
        Metric: js.UndefOr[CurrentMetric] = js.undefined,
        Value: js.UndefOr[Value] = js.undefined
    ): CurrentMetricData = {
      val __obj = js.Dictionary.empty[js.Any]
      Metric.foreach(__v => __obj.update("Metric", __v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.update("Value", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CurrentMetricData]
    }
  }

  /**
    * A list of current metric names.
    */
  object CurrentMetricNameEnum {
    val AGENTS_ONLINE             = "AGENTS_ONLINE"
    val AGENTS_AVAILABLE          = "AGENTS_AVAILABLE"
    val AGENTS_ON_CALL            = "AGENTS_ON_CALL"
    val AGENTS_NON_PRODUCTIVE     = "AGENTS_NON_PRODUCTIVE"
    val AGENTS_AFTER_CONTACT_WORK = "AGENTS_AFTER_CONTACT_WORK"
    val AGENTS_ERROR              = "AGENTS_ERROR"
    val AGENTS_STAFFED            = "AGENTS_STAFFED"
    val CONTACTS_IN_QUEUE         = "CONTACTS_IN_QUEUE"
    val OLDEST_CONTACT_AGE        = "OLDEST_CONTACT_AGE"
    val CONTACTS_SCHEDULED        = "CONTACTS_SCHEDULED"

    val values = js.Object.freeze(
      js.Array(
        AGENTS_ONLINE,
        AGENTS_AVAILABLE,
        AGENTS_ON_CALL,
        AGENTS_NON_PRODUCTIVE,
        AGENTS_AFTER_CONTACT_WORK,
        AGENTS_ERROR,
        AGENTS_STAFFED,
        CONTACTS_IN_QUEUE,
        OLDEST_CONTACT_AGE,
        CONTACTS_SCHEDULED
      )
    )
  }

  /**
    * A <code>CurrentMetricResult</code> object.
    */
  @js.native
  trait CurrentMetricResult extends js.Object {
    var Collections: js.UndefOr[CurrentMetricDataCollections]
    var Dimensions: js.UndefOr[Dimensions]
  }

  object CurrentMetricResult {
    def apply(
        Collections: js.UndefOr[CurrentMetricDataCollections] = js.undefined,
        Dimensions: js.UndefOr[Dimensions] = js.undefined
    ): CurrentMetricResult = {
      val __obj = js.Dictionary.empty[js.Any]
      Collections.foreach(__v => __obj.update("Collections", __v.asInstanceOf[js.Any]))
      Dimensions.foreach(__v => __obj.update("Dimensions", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CurrentMetricResult]
    }
  }

  @js.native
  trait DeleteUserRequest extends js.Object {
    var InstanceId: InstanceId
    var UserId: UserId
  }

  object DeleteUserRequest {
    def apply(
        InstanceId: InstanceId,
        UserId: UserId
    ): DeleteUserRequest = {
      val __obj = js.Dictionary[js.Any](
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "UserId"     -> UserId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteUserRequest]
    }
  }

  @js.native
  trait DescribeUserHierarchyGroupRequest extends js.Object {
    var HierarchyGroupId: HierarchyGroupId
    var InstanceId: InstanceId
  }

  object DescribeUserHierarchyGroupRequest {
    def apply(
        HierarchyGroupId: HierarchyGroupId,
        InstanceId: InstanceId
    ): DescribeUserHierarchyGroupRequest = {
      val __obj = js.Dictionary[js.Any](
        "HierarchyGroupId" -> HierarchyGroupId.asInstanceOf[js.Any],
        "InstanceId"       -> InstanceId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeUserHierarchyGroupRequest]
    }
  }

  @js.native
  trait DescribeUserHierarchyGroupResponse extends js.Object {
    var HierarchyGroup: js.UndefOr[HierarchyGroup]
  }

  object DescribeUserHierarchyGroupResponse {
    def apply(
        HierarchyGroup: js.UndefOr[HierarchyGroup] = js.undefined
    ): DescribeUserHierarchyGroupResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      HierarchyGroup.foreach(__v => __obj.update("HierarchyGroup", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeUserHierarchyGroupResponse]
    }
  }

  @js.native
  trait DescribeUserHierarchyStructureRequest extends js.Object {
    var InstanceId: InstanceId
  }

  object DescribeUserHierarchyStructureRequest {
    def apply(
        InstanceId: InstanceId
    ): DescribeUserHierarchyStructureRequest = {
      val __obj = js.Dictionary[js.Any](
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeUserHierarchyStructureRequest]
    }
  }

  @js.native
  trait DescribeUserHierarchyStructureResponse extends js.Object {
    var HierarchyStructure: js.UndefOr[HierarchyStructure]
  }

  object DescribeUserHierarchyStructureResponse {
    def apply(
        HierarchyStructure: js.UndefOr[HierarchyStructure] = js.undefined
    ): DescribeUserHierarchyStructureResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      HierarchyStructure.foreach(__v => __obj.update("HierarchyStructure", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeUserHierarchyStructureResponse]
    }
  }

  @js.native
  trait DescribeUserRequest extends js.Object {
    var InstanceId: InstanceId
    var UserId: UserId
  }

  object DescribeUserRequest {
    def apply(
        InstanceId: InstanceId,
        UserId: UserId
    ): DescribeUserRequest = {
      val __obj = js.Dictionary[js.Any](
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "UserId"     -> UserId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeUserRequest]
    }
  }

  @js.native
  trait DescribeUserResponse extends js.Object {
    var User: js.UndefOr[User]
  }

  object DescribeUserResponse {
    def apply(
        User: js.UndefOr[User] = js.undefined
    ): DescribeUserResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      User.foreach(__v => __obj.update("User", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeUserResponse]
    }
  }

  /**
    * A <code>Dimensions</code> object that includes the Channel and Queue for the metric.
    */
  @js.native
  trait Dimensions extends js.Object {
    var Channel: js.UndefOr[Channel]
    var Queue: js.UndefOr[QueueReference]
  }

  object Dimensions {
    def apply(
        Channel: js.UndefOr[Channel] = js.undefined,
        Queue: js.UndefOr[QueueReference] = js.undefined
    ): Dimensions = {
      val __obj = js.Dictionary.empty[js.Any]
      Channel.foreach(__v => __obj.update("Channel", __v.asInstanceOf[js.Any]))
      Queue.foreach(__v => __obj.update("Queue", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Dimensions]
    }
  }

  /**
    * The filter, either channel or queues, to apply to the metric results retrieved.
    */
  @js.native
  trait Filters extends js.Object {
    var Channels: js.UndefOr[Channels]
    var Queues: js.UndefOr[Queues]
  }

  object Filters {
    def apply(
        Channels: js.UndefOr[Channels] = js.undefined,
        Queues: js.UndefOr[Queues] = js.undefined
    ): Filters = {
      val __obj = js.Dictionary.empty[js.Any]
      Channels.foreach(__v => __obj.update("Channels", __v.asInstanceOf[js.Any]))
      Queues.foreach(__v => __obj.update("Queues", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Filters]
    }
  }

  @js.native
  trait GetContactAttributesRequest extends js.Object {
    var InitialContactId: ContactId
    var InstanceId: InstanceId
  }

  object GetContactAttributesRequest {
    def apply(
        InitialContactId: ContactId,
        InstanceId: InstanceId
    ): GetContactAttributesRequest = {
      val __obj = js.Dictionary[js.Any](
        "InitialContactId" -> InitialContactId.asInstanceOf[js.Any],
        "InstanceId"       -> InstanceId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetContactAttributesRequest]
    }
  }

  @js.native
  trait GetContactAttributesResponse extends js.Object {
    var Attributes: js.UndefOr[Attributes]
  }

  object GetContactAttributesResponse {
    def apply(
        Attributes: js.UndefOr[Attributes] = js.undefined
    ): GetContactAttributesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Attributes.foreach(__v => __obj.update("Attributes", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetContactAttributesResponse]
    }
  }

  @js.native
  trait GetCurrentMetricDataRequest extends js.Object {
    var CurrentMetrics: CurrentMetrics
    var Filters: Filters
    var InstanceId: InstanceId
    var Groupings: js.UndefOr[Groupings]
    var MaxResults: js.UndefOr[MaxResult100]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetCurrentMetricDataRequest {
    def apply(
        CurrentMetrics: CurrentMetrics,
        Filters: Filters,
        InstanceId: InstanceId,
        Groupings: js.UndefOr[Groupings] = js.undefined,
        MaxResults: js.UndefOr[MaxResult100] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetCurrentMetricDataRequest = {
      val __obj = js.Dictionary[js.Any](
        "CurrentMetrics" -> CurrentMetrics.asInstanceOf[js.Any],
        "Filters"        -> Filters.asInstanceOf[js.Any],
        "InstanceId"     -> InstanceId.asInstanceOf[js.Any]
      )

      Groupings.foreach(__v => __obj.update("Groupings", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCurrentMetricDataRequest]
    }
  }

  @js.native
  trait GetCurrentMetricDataResponse extends js.Object {
    var DataSnapshotTime: js.UndefOr[timestamp]
    var MetricResults: js.UndefOr[CurrentMetricResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetCurrentMetricDataResponse {
    def apply(
        DataSnapshotTime: js.UndefOr[timestamp] = js.undefined,
        MetricResults: js.UndefOr[CurrentMetricResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetCurrentMetricDataResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      DataSnapshotTime.foreach(__v => __obj.update("DataSnapshotTime", __v.asInstanceOf[js.Any]))
      MetricResults.foreach(__v => __obj.update("MetricResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCurrentMetricDataResponse]
    }
  }

  @js.native
  trait GetFederationTokenRequest extends js.Object {
    var InstanceId: InstanceId
  }

  object GetFederationTokenRequest {
    def apply(
        InstanceId: InstanceId
    ): GetFederationTokenRequest = {
      val __obj = js.Dictionary[js.Any](
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetFederationTokenRequest]
    }
  }

  @js.native
  trait GetFederationTokenResponse extends js.Object {
    var Credentials: js.UndefOr[Credentials]
  }

  object GetFederationTokenResponse {
    def apply(
        Credentials: js.UndefOr[Credentials] = js.undefined
    ): GetFederationTokenResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Credentials.foreach(__v => __obj.update("Credentials", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFederationTokenResponse]
    }
  }

  @js.native
  trait GetMetricDataRequest extends js.Object {
    var EndTime: timestamp
    var Filters: Filters
    var HistoricalMetrics: HistoricalMetrics
    var InstanceId: InstanceId
    var StartTime: timestamp
    var Groupings: js.UndefOr[Groupings]
    var MaxResults: js.UndefOr[MaxResult100]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetMetricDataRequest {
    def apply(
        EndTime: timestamp,
        Filters: Filters,
        HistoricalMetrics: HistoricalMetrics,
        InstanceId: InstanceId,
        StartTime: timestamp,
        Groupings: js.UndefOr[Groupings] = js.undefined,
        MaxResults: js.UndefOr[MaxResult100] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetMetricDataRequest = {
      val __obj = js.Dictionary[js.Any](
        "EndTime"           -> EndTime.asInstanceOf[js.Any],
        "Filters"           -> Filters.asInstanceOf[js.Any],
        "HistoricalMetrics" -> HistoricalMetrics.asInstanceOf[js.Any],
        "InstanceId"        -> InstanceId.asInstanceOf[js.Any],
        "StartTime"         -> StartTime.asInstanceOf[js.Any]
      )

      Groupings.foreach(__v => __obj.update("Groupings", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMetricDataRequest]
    }
  }

  @js.native
  trait GetMetricDataResponse extends js.Object {
    var MetricResults: js.UndefOr[HistoricalMetricResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetMetricDataResponse {
    def apply(
        MetricResults: js.UndefOr[HistoricalMetricResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetMetricDataResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      MetricResults.foreach(__v => __obj.update("MetricResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMetricDataResponse]
    }
  }

  object GroupingEnum {
    val QUEUE   = "QUEUE"
    val CHANNEL = "CHANNEL"

    val values = js.Object.freeze(js.Array(QUEUE, CHANNEL))
  }

  /**
    * A <code>HierarchyGroup</code> object that contains information about a hierarchy group in your Amazon Connect instance.
    */
  @js.native
  trait HierarchyGroup extends js.Object {
    var Arn: js.UndefOr[ARN]
    var HierarchyPath: js.UndefOr[HierarchyPath]
    var Id: js.UndefOr[HierarchyGroupId]
    var LevelId: js.UndefOr[HierarchyLevelId]
    var Name: js.UndefOr[HierarchyGroupName]
  }

  object HierarchyGroup {
    def apply(
        Arn: js.UndefOr[ARN] = js.undefined,
        HierarchyPath: js.UndefOr[HierarchyPath] = js.undefined,
        Id: js.UndefOr[HierarchyGroupId] = js.undefined,
        LevelId: js.UndefOr[HierarchyLevelId] = js.undefined,
        Name: js.UndefOr[HierarchyGroupName] = js.undefined
    ): HierarchyGroup = {
      val __obj = js.Dictionary.empty[js.Any]
      Arn.foreach(__v => __obj.update("Arn", __v.asInstanceOf[js.Any]))
      HierarchyPath.foreach(__v => __obj.update("HierarchyPath", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      LevelId.foreach(__v => __obj.update("LevelId", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HierarchyGroup]
    }
  }

  /**
    * A <code>HierarchyGroupSummary</code> object that contains information about the hierarchy group, including ARN, Id, and Name.
    */
  @js.native
  trait HierarchyGroupSummary extends js.Object {
    var Arn: js.UndefOr[ARN]
    var Id: js.UndefOr[HierarchyGroupId]
    var Name: js.UndefOr[HierarchyGroupName]
  }

  object HierarchyGroupSummary {
    def apply(
        Arn: js.UndefOr[ARN] = js.undefined,
        Id: js.UndefOr[HierarchyGroupId] = js.undefined,
        Name: js.UndefOr[HierarchyGroupName] = js.undefined
    ): HierarchyGroupSummary = {
      val __obj = js.Dictionary.empty[js.Any]
      Arn.foreach(__v => __obj.update("Arn", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HierarchyGroupSummary]
    }
  }

  /**
    * A <code>HierarchyLevel</code> object that contains information about the levels in a hierarchy group, including ARN, Id, and Name.
    */
  @js.native
  trait HierarchyLevel extends js.Object {
    var Arn: js.UndefOr[ARN]
    var Id: js.UndefOr[HierarchyLevelId]
    var Name: js.UndefOr[HierarchyLevelName]
  }

  object HierarchyLevel {
    def apply(
        Arn: js.UndefOr[ARN] = js.undefined,
        Id: js.UndefOr[HierarchyLevelId] = js.undefined,
        Name: js.UndefOr[HierarchyLevelName] = js.undefined
    ): HierarchyLevel = {
      val __obj = js.Dictionary.empty[js.Any]
      Arn.foreach(__v => __obj.update("Arn", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HierarchyLevel]
    }
  }

  /**
    * A <code>HierarchyPath</code> object that contains information about the levels of the hierarchy group.
    */
  @js.native
  trait HierarchyPath extends js.Object {
    var LevelFive: js.UndefOr[HierarchyGroupSummary]
    var LevelFour: js.UndefOr[HierarchyGroupSummary]
    var LevelOne: js.UndefOr[HierarchyGroupSummary]
    var LevelThree: js.UndefOr[HierarchyGroupSummary]
    var LevelTwo: js.UndefOr[HierarchyGroupSummary]
  }

  object HierarchyPath {
    def apply(
        LevelFive: js.UndefOr[HierarchyGroupSummary] = js.undefined,
        LevelFour: js.UndefOr[HierarchyGroupSummary] = js.undefined,
        LevelOne: js.UndefOr[HierarchyGroupSummary] = js.undefined,
        LevelThree: js.UndefOr[HierarchyGroupSummary] = js.undefined,
        LevelTwo: js.UndefOr[HierarchyGroupSummary] = js.undefined
    ): HierarchyPath = {
      val __obj = js.Dictionary.empty[js.Any]
      LevelFive.foreach(__v => __obj.update("LevelFive", __v.asInstanceOf[js.Any]))
      LevelFour.foreach(__v => __obj.update("LevelFour", __v.asInstanceOf[js.Any]))
      LevelOne.foreach(__v => __obj.update("LevelOne", __v.asInstanceOf[js.Any]))
      LevelThree.foreach(__v => __obj.update("LevelThree", __v.asInstanceOf[js.Any]))
      LevelTwo.foreach(__v => __obj.update("LevelTwo", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HierarchyPath]
    }
  }

  /**
    * A <code>HierarchyStructure</code> object that contains information about the hierarchy group structure.
    */
  @js.native
  trait HierarchyStructure extends js.Object {
    var LevelFive: js.UndefOr[HierarchyLevel]
    var LevelFour: js.UndefOr[HierarchyLevel]
    var LevelOne: js.UndefOr[HierarchyLevel]
    var LevelThree: js.UndefOr[HierarchyLevel]
    var LevelTwo: js.UndefOr[HierarchyLevel]
  }

  object HierarchyStructure {
    def apply(
        LevelFive: js.UndefOr[HierarchyLevel] = js.undefined,
        LevelFour: js.UndefOr[HierarchyLevel] = js.undefined,
        LevelOne: js.UndefOr[HierarchyLevel] = js.undefined,
        LevelThree: js.UndefOr[HierarchyLevel] = js.undefined,
        LevelTwo: js.UndefOr[HierarchyLevel] = js.undefined
    ): HierarchyStructure = {
      val __obj = js.Dictionary.empty[js.Any]
      LevelFive.foreach(__v => __obj.update("LevelFive", __v.asInstanceOf[js.Any]))
      LevelFour.foreach(__v => __obj.update("LevelFour", __v.asInstanceOf[js.Any]))
      LevelOne.foreach(__v => __obj.update("LevelOne", __v.asInstanceOf[js.Any]))
      LevelThree.foreach(__v => __obj.update("LevelThree", __v.asInstanceOf[js.Any]))
      LevelTwo.foreach(__v => __obj.update("LevelTwo", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HierarchyStructure]
    }
  }

  /**
    * A <code>HistoricalMetric</code> object that contains the Name, Unit, Statistic, and Threshold for the metric.
    */
  @js.native
  trait HistoricalMetric extends js.Object {
    var Name: js.UndefOr[HistoricalMetricName]
    var Statistic: js.UndefOr[Statistic]
    var Threshold: js.UndefOr[Threshold]
    var Unit: js.UndefOr[Unit]
  }

  object HistoricalMetric {
    def apply(
        Name: js.UndefOr[HistoricalMetricName] = js.undefined,
        Statistic: js.UndefOr[Statistic] = js.undefined,
        Threshold: js.UndefOr[Threshold] = js.undefined,
        Unit: js.UndefOr[Unit] = js.undefined
    ): HistoricalMetric = {
      val __obj = js.Dictionary.empty[js.Any]
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Statistic.foreach(__v => __obj.update("Statistic", __v.asInstanceOf[js.Any]))
      Threshold.foreach(__v => __obj.update("Threshold", __v.asInstanceOf[js.Any]))
      Unit.foreach(__v => __obj.update("Unit", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HistoricalMetric]
    }
  }

  /**
    * A <code>HistoricalMetricData</code> object than contains a <code>Metric</code> and a <code>Value</code>.
    */
  @js.native
  trait HistoricalMetricData extends js.Object {
    var Metric: js.UndefOr[HistoricalMetric]
    var Value: js.UndefOr[Value]
  }

  object HistoricalMetricData {
    def apply(
        Metric: js.UndefOr[HistoricalMetric] = js.undefined,
        Value: js.UndefOr[Value] = js.undefined
    ): HistoricalMetricData = {
      val __obj = js.Dictionary.empty[js.Any]
      Metric.foreach(__v => __obj.update("Metric", __v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.update("Value", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HistoricalMetricData]
    }
  }

  /**
    * A list of historical metric names.
    */
  object HistoricalMetricNameEnum {
    val CONTACTS_QUEUED                     = "CONTACTS_QUEUED"
    val CONTACTS_HANDLED                    = "CONTACTS_HANDLED"
    val CONTACTS_ABANDONED                  = "CONTACTS_ABANDONED"
    val CONTACTS_CONSULTED                  = "CONTACTS_CONSULTED"
    val CONTACTS_AGENT_HUNG_UP_FIRST        = "CONTACTS_AGENT_HUNG_UP_FIRST"
    val CONTACTS_HANDLED_INCOMING           = "CONTACTS_HANDLED_INCOMING"
    val CONTACTS_HANDLED_OUTBOUND           = "CONTACTS_HANDLED_OUTBOUND"
    val CONTACTS_HOLD_ABANDONS              = "CONTACTS_HOLD_ABANDONS"
    val CONTACTS_TRANSFERRED_IN             = "CONTACTS_TRANSFERRED_IN"
    val CONTACTS_TRANSFERRED_OUT            = "CONTACTS_TRANSFERRED_OUT"
    val CONTACTS_TRANSFERRED_IN_FROM_QUEUE  = "CONTACTS_TRANSFERRED_IN_FROM_QUEUE"
    val CONTACTS_TRANSFERRED_OUT_FROM_QUEUE = "CONTACTS_TRANSFERRED_OUT_FROM_QUEUE"
    val CONTACTS_MISSED                     = "CONTACTS_MISSED"
    val CALLBACK_CONTACTS_HANDLED           = "CALLBACK_CONTACTS_HANDLED"
    val API_CONTACTS_HANDLED                = "API_CONTACTS_HANDLED"
    val OCCUPANCY                           = "OCCUPANCY"
    val HANDLE_TIME                         = "HANDLE_TIME"
    val AFTER_CONTACT_WORK_TIME             = "AFTER_CONTACT_WORK_TIME"
    val QUEUED_TIME                         = "QUEUED_TIME"
    val ABANDON_TIME                        = "ABANDON_TIME"
    val QUEUE_ANSWER_TIME                   = "QUEUE_ANSWER_TIME"
    val HOLD_TIME                           = "HOLD_TIME"
    val INTERACTION_TIME                    = "INTERACTION_TIME"
    val INTERACTION_AND_HOLD_TIME           = "INTERACTION_AND_HOLD_TIME"
    val SERVICE_LEVEL                       = "SERVICE_LEVEL"

    val values = js.Object.freeze(
      js.Array(
        CONTACTS_QUEUED,
        CONTACTS_HANDLED,
        CONTACTS_ABANDONED,
        CONTACTS_CONSULTED,
        CONTACTS_AGENT_HUNG_UP_FIRST,
        CONTACTS_HANDLED_INCOMING,
        CONTACTS_HANDLED_OUTBOUND,
        CONTACTS_HOLD_ABANDONS,
        CONTACTS_TRANSFERRED_IN,
        CONTACTS_TRANSFERRED_OUT,
        CONTACTS_TRANSFERRED_IN_FROM_QUEUE,
        CONTACTS_TRANSFERRED_OUT_FROM_QUEUE,
        CONTACTS_MISSED,
        CALLBACK_CONTACTS_HANDLED,
        API_CONTACTS_HANDLED,
        OCCUPANCY,
        HANDLE_TIME,
        AFTER_CONTACT_WORK_TIME,
        QUEUED_TIME,
        ABANDON_TIME,
        QUEUE_ANSWER_TIME,
        HOLD_TIME,
        INTERACTION_TIME,
        INTERACTION_AND_HOLD_TIME,
        SERVICE_LEVEL
      )
    )
  }

  /**
    * The metrics data returned from a <code>GetMetricData</code> operation.
    */
  @js.native
  trait HistoricalMetricResult extends js.Object {
    var Collections: js.UndefOr[HistoricalMetricDataCollections]
    var Dimensions: js.UndefOr[Dimensions]
  }

  object HistoricalMetricResult {
    def apply(
        Collections: js.UndefOr[HistoricalMetricDataCollections] = js.undefined,
        Dimensions: js.UndefOr[Dimensions] = js.undefined
    ): HistoricalMetricResult = {
      val __obj = js.Dictionary.empty[js.Any]
      Collections.foreach(__v => __obj.update("Collections", __v.asInstanceOf[js.Any]))
      Dimensions.foreach(__v => __obj.update("Dimensions", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HistoricalMetricResult]
    }
  }

  @js.native
  trait ListRoutingProfilesRequest extends js.Object {
    var InstanceId: InstanceId
    var MaxResults: js.UndefOr[MaxResult1000]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListRoutingProfilesRequest {
    def apply(
        InstanceId: InstanceId,
        MaxResults: js.UndefOr[MaxResult1000] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListRoutingProfilesRequest = {
      val __obj = js.Dictionary[js.Any](
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRoutingProfilesRequest]
    }
  }

  @js.native
  trait ListRoutingProfilesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var RoutingProfileSummaryList: js.UndefOr[RoutingProfileSummaryList]
  }

  object ListRoutingProfilesResponse {
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        RoutingProfileSummaryList: js.UndefOr[RoutingProfileSummaryList] = js.undefined
    ): ListRoutingProfilesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      RoutingProfileSummaryList.foreach(__v => __obj.update("RoutingProfileSummaryList", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRoutingProfilesResponse]
    }
  }

  @js.native
  trait ListSecurityProfilesRequest extends js.Object {
    var InstanceId: InstanceId
    var MaxResults: js.UndefOr[MaxResult1000]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListSecurityProfilesRequest {
    def apply(
        InstanceId: InstanceId,
        MaxResults: js.UndefOr[MaxResult1000] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListSecurityProfilesRequest = {
      val __obj = js.Dictionary[js.Any](
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSecurityProfilesRequest]
    }
  }

  @js.native
  trait ListSecurityProfilesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var SecurityProfileSummaryList: js.UndefOr[SecurityProfileSummaryList]
  }

  object ListSecurityProfilesResponse {
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SecurityProfileSummaryList: js.UndefOr[SecurityProfileSummaryList] = js.undefined
    ): ListSecurityProfilesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      SecurityProfileSummaryList.foreach(__v => __obj.update("SecurityProfileSummaryList", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSecurityProfilesResponse]
    }
  }

  @js.native
  trait ListUserHierarchyGroupsRequest extends js.Object {
    var InstanceId: InstanceId
    var MaxResults: js.UndefOr[MaxResult1000]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListUserHierarchyGroupsRequest {
    def apply(
        InstanceId: InstanceId,
        MaxResults: js.UndefOr[MaxResult1000] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListUserHierarchyGroupsRequest = {
      val __obj = js.Dictionary[js.Any](
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUserHierarchyGroupsRequest]
    }
  }

  @js.native
  trait ListUserHierarchyGroupsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var UserHierarchyGroupSummaryList: js.UndefOr[HierarchyGroupSummaryList]
  }

  object ListUserHierarchyGroupsResponse {
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        UserHierarchyGroupSummaryList: js.UndefOr[HierarchyGroupSummaryList] = js.undefined
    ): ListUserHierarchyGroupsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      UserHierarchyGroupSummaryList.foreach(
        __v => __obj.update("UserHierarchyGroupSummaryList", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[ListUserHierarchyGroupsResponse]
    }
  }

  @js.native
  trait ListUsersRequest extends js.Object {
    var InstanceId: InstanceId
    var MaxResults: js.UndefOr[MaxResult1000]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListUsersRequest {
    def apply(
        InstanceId: InstanceId,
        MaxResults: js.UndefOr[MaxResult1000] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListUsersRequest = {
      val __obj = js.Dictionary[js.Any](
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUsersRequest]
    }
  }

  @js.native
  trait ListUsersResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var UserSummaryList: js.UndefOr[UserSummaryList]
  }

  object ListUsersResponse {
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        UserSummaryList: js.UndefOr[UserSummaryList] = js.undefined
    ): ListUsersResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      UserSummaryList.foreach(__v => __obj.update("UserSummaryList", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUsersResponse]
    }
  }

  object PhoneTypeEnum {
    val SOFT_PHONE = "SOFT_PHONE"
    val DESK_PHONE = "DESK_PHONE"

    val values = js.Object.freeze(js.Array(SOFT_PHONE, DESK_PHONE))
  }

  /**
    * A QueueReference object that contains the the QueueId and ARN for the queue resource for which metrics are returned.
    */
  @js.native
  trait QueueReference extends js.Object {
    var Arn: js.UndefOr[ARN]
    var Id: js.UndefOr[QueueId]
  }

  object QueueReference {
    def apply(
        Arn: js.UndefOr[ARN] = js.undefined,
        Id: js.UndefOr[QueueId] = js.undefined
    ): QueueReference = {
      val __obj = js.Dictionary.empty[js.Any]
      Arn.foreach(__v => __obj.update("Arn", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QueueReference]
    }
  }

  /**
    * A <code>RoutingProfileSummary</code> object that contains information about a routing profile, including ARN, Id, and Name.
    */
  @js.native
  trait RoutingProfileSummary extends js.Object {
    var Arn: js.UndefOr[ARN]
    var Id: js.UndefOr[RoutingProfileId]
    var Name: js.UndefOr[RoutingProfileName]
  }

  object RoutingProfileSummary {
    def apply(
        Arn: js.UndefOr[ARN] = js.undefined,
        Id: js.UndefOr[RoutingProfileId] = js.undefined,
        Name: js.UndefOr[RoutingProfileName] = js.undefined
    ): RoutingProfileSummary = {
      val __obj = js.Dictionary.empty[js.Any]
      Arn.foreach(__v => __obj.update("Arn", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RoutingProfileSummary]
    }
  }

  /**
    * A <code>SecurityProfileSummary</code> object that contains information about a security profile, including ARN, Id, Name.
    */
  @js.native
  trait SecurityProfileSummary extends js.Object {
    var Arn: js.UndefOr[ARN]
    var Id: js.UndefOr[SecurityProfileId]
    var Name: js.UndefOr[SecurityProfileName]
  }

  object SecurityProfileSummary {
    def apply(
        Arn: js.UndefOr[ARN] = js.undefined,
        Id: js.UndefOr[SecurityProfileId] = js.undefined,
        Name: js.UndefOr[SecurityProfileName] = js.undefined
    ): SecurityProfileSummary = {
      val __obj = js.Dictionary.empty[js.Any]
      Arn.foreach(__v => __obj.update("Arn", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SecurityProfileSummary]
    }
  }

  @js.native
  trait StartOutboundVoiceContactRequest extends js.Object {
    var ContactFlowId: ContactFlowId
    var DestinationPhoneNumber: PhoneNumber
    var InstanceId: InstanceId
    var Attributes: js.UndefOr[Attributes]
    var ClientToken: js.UndefOr[ClientToken]
    var QueueId: js.UndefOr[QueueId]
    var SourcePhoneNumber: js.UndefOr[PhoneNumber]
  }

  object StartOutboundVoiceContactRequest {
    def apply(
        ContactFlowId: ContactFlowId,
        DestinationPhoneNumber: PhoneNumber,
        InstanceId: InstanceId,
        Attributes: js.UndefOr[Attributes] = js.undefined,
        ClientToken: js.UndefOr[ClientToken] = js.undefined,
        QueueId: js.UndefOr[QueueId] = js.undefined,
        SourcePhoneNumber: js.UndefOr[PhoneNumber] = js.undefined
    ): StartOutboundVoiceContactRequest = {
      val __obj = js.Dictionary[js.Any](
        "ContactFlowId"          -> ContactFlowId.asInstanceOf[js.Any],
        "DestinationPhoneNumber" -> DestinationPhoneNumber.asInstanceOf[js.Any],
        "InstanceId"             -> InstanceId.asInstanceOf[js.Any]
      )

      Attributes.foreach(__v => __obj.update("Attributes", __v.asInstanceOf[js.Any]))
      ClientToken.foreach(__v => __obj.update("ClientToken", __v.asInstanceOf[js.Any]))
      QueueId.foreach(__v => __obj.update("QueueId", __v.asInstanceOf[js.Any]))
      SourcePhoneNumber.foreach(__v => __obj.update("SourcePhoneNumber", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartOutboundVoiceContactRequest]
    }
  }

  @js.native
  trait StartOutboundVoiceContactResponse extends js.Object {
    var ContactId: js.UndefOr[ContactId]
  }

  object StartOutboundVoiceContactResponse {
    def apply(
        ContactId: js.UndefOr[ContactId] = js.undefined
    ): StartOutboundVoiceContactResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ContactId.foreach(__v => __obj.update("ContactId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartOutboundVoiceContactResponse]
    }
  }

  object StatisticEnum {
    val SUM = "SUM"
    val MAX = "MAX"
    val AVG = "AVG"

    val values = js.Object.freeze(js.Array(SUM, MAX, AVG))
  }

  @js.native
  trait StopContactRequest extends js.Object {
    var ContactId: ContactId
    var InstanceId: InstanceId
  }

  object StopContactRequest {
    def apply(
        ContactId: ContactId,
        InstanceId: InstanceId
    ): StopContactRequest = {
      val __obj = js.Dictionary[js.Any](
        "ContactId"  -> ContactId.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StopContactRequest]
    }
  }

  @js.native
  trait StopContactResponse extends js.Object {}

  object StopContactResponse {
    def apply(
        ): StopContactResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[StopContactResponse]
    }
  }

  /**
    * A <code>Threshold</code> object that includes a comparison and <code>ThresholdValue</code> to compare to. Used with service level metrics.
    */
  @js.native
  trait Threshold extends js.Object {
    var Comparison: js.UndefOr[Comparison]
    var ThresholdValue: js.UndefOr[ThresholdValue]
  }

  object Threshold {
    def apply(
        Comparison: js.UndefOr[Comparison] = js.undefined,
        ThresholdValue: js.UndefOr[ThresholdValue] = js.undefined
    ): Threshold = {
      val __obj = js.Dictionary.empty[js.Any]
      Comparison.foreach(__v => __obj.update("Comparison", __v.asInstanceOf[js.Any]))
      ThresholdValue.foreach(__v => __obj.update("ThresholdValue", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Threshold]
    }
  }

  object UnitEnum {
    val SECONDS = "SECONDS"
    val COUNT   = "COUNT"
    val PERCENT = "PERCENT"

    val values = js.Object.freeze(js.Array(SECONDS, COUNT, PERCENT))
  }

  @js.native
  trait UpdateContactAttributesRequest extends js.Object {
    var Attributes: Attributes
    var InitialContactId: ContactId
    var InstanceId: InstanceId
  }

  object UpdateContactAttributesRequest {
    def apply(
        Attributes: Attributes,
        InitialContactId: ContactId,
        InstanceId: InstanceId
    ): UpdateContactAttributesRequest = {
      val __obj = js.Dictionary[js.Any](
        "Attributes"       -> Attributes.asInstanceOf[js.Any],
        "InitialContactId" -> InitialContactId.asInstanceOf[js.Any],
        "InstanceId"       -> InstanceId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateContactAttributesRequest]
    }
  }

  @js.native
  trait UpdateContactAttributesResponse extends js.Object {}

  object UpdateContactAttributesResponse {
    def apply(
        ): UpdateContactAttributesResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[UpdateContactAttributesResponse]
    }
  }

  @js.native
  trait UpdateUserHierarchyRequest extends js.Object {
    var InstanceId: InstanceId
    var UserId: UserId
    var HierarchyGroupId: js.UndefOr[HierarchyGroupId]
  }

  object UpdateUserHierarchyRequest {
    def apply(
        InstanceId: InstanceId,
        UserId: UserId,
        HierarchyGroupId: js.UndefOr[HierarchyGroupId] = js.undefined
    ): UpdateUserHierarchyRequest = {
      val __obj = js.Dictionary[js.Any](
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "UserId"     -> UserId.asInstanceOf[js.Any]
      )

      HierarchyGroupId.foreach(__v => __obj.update("HierarchyGroupId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateUserHierarchyRequest]
    }
  }

  @js.native
  trait UpdateUserIdentityInfoRequest extends js.Object {
    var IdentityInfo: UserIdentityInfo
    var InstanceId: InstanceId
    var UserId: UserId
  }

  object UpdateUserIdentityInfoRequest {
    def apply(
        IdentityInfo: UserIdentityInfo,
        InstanceId: InstanceId,
        UserId: UserId
    ): UpdateUserIdentityInfoRequest = {
      val __obj = js.Dictionary[js.Any](
        "IdentityInfo" -> IdentityInfo.asInstanceOf[js.Any],
        "InstanceId"   -> InstanceId.asInstanceOf[js.Any],
        "UserId"       -> UserId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateUserIdentityInfoRequest]
    }
  }

  @js.native
  trait UpdateUserPhoneConfigRequest extends js.Object {
    var InstanceId: InstanceId
    var PhoneConfig: UserPhoneConfig
    var UserId: UserId
  }

  object UpdateUserPhoneConfigRequest {
    def apply(
        InstanceId: InstanceId,
        PhoneConfig: UserPhoneConfig,
        UserId: UserId
    ): UpdateUserPhoneConfigRequest = {
      val __obj = js.Dictionary[js.Any](
        "InstanceId"  -> InstanceId.asInstanceOf[js.Any],
        "PhoneConfig" -> PhoneConfig.asInstanceOf[js.Any],
        "UserId"      -> UserId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateUserPhoneConfigRequest]
    }
  }

  @js.native
  trait UpdateUserRoutingProfileRequest extends js.Object {
    var InstanceId: InstanceId
    var RoutingProfileId: RoutingProfileId
    var UserId: UserId
  }

  object UpdateUserRoutingProfileRequest {
    def apply(
        InstanceId: InstanceId,
        RoutingProfileId: RoutingProfileId,
        UserId: UserId
    ): UpdateUserRoutingProfileRequest = {
      val __obj = js.Dictionary[js.Any](
        "InstanceId"       -> InstanceId.asInstanceOf[js.Any],
        "RoutingProfileId" -> RoutingProfileId.asInstanceOf[js.Any],
        "UserId"           -> UserId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateUserRoutingProfileRequest]
    }
  }

  @js.native
  trait UpdateUserSecurityProfilesRequest extends js.Object {
    var InstanceId: InstanceId
    var SecurityProfileIds: SecurityProfileIds
    var UserId: UserId
  }

  object UpdateUserSecurityProfilesRequest {
    def apply(
        InstanceId: InstanceId,
        SecurityProfileIds: SecurityProfileIds,
        UserId: UserId
    ): UpdateUserSecurityProfilesRequest = {
      val __obj = js.Dictionary[js.Any](
        "InstanceId"         -> InstanceId.asInstanceOf[js.Any],
        "SecurityProfileIds" -> SecurityProfileIds.asInstanceOf[js.Any],
        "UserId"             -> UserId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateUserSecurityProfilesRequest]
    }
  }

  /**
    * A <code>User</code> object that contains information about a user account in your Amazon Connect instance, including configuration settings.
    */
  @js.native
  trait User extends js.Object {
    var Arn: js.UndefOr[ARN]
    var DirectoryUserId: js.UndefOr[DirectoryUserId]
    var HierarchyGroupId: js.UndefOr[HierarchyGroupId]
    var Id: js.UndefOr[UserId]
    var IdentityInfo: js.UndefOr[UserIdentityInfo]
    var PhoneConfig: js.UndefOr[UserPhoneConfig]
    var RoutingProfileId: js.UndefOr[RoutingProfileId]
    var SecurityProfileIds: js.UndefOr[SecurityProfileIds]
    var Username: js.UndefOr[AgentUsername]
  }

  object User {
    def apply(
        Arn: js.UndefOr[ARN] = js.undefined,
        DirectoryUserId: js.UndefOr[DirectoryUserId] = js.undefined,
        HierarchyGroupId: js.UndefOr[HierarchyGroupId] = js.undefined,
        Id: js.UndefOr[UserId] = js.undefined,
        IdentityInfo: js.UndefOr[UserIdentityInfo] = js.undefined,
        PhoneConfig: js.UndefOr[UserPhoneConfig] = js.undefined,
        RoutingProfileId: js.UndefOr[RoutingProfileId] = js.undefined,
        SecurityProfileIds: js.UndefOr[SecurityProfileIds] = js.undefined,
        Username: js.UndefOr[AgentUsername] = js.undefined
    ): User = {
      val __obj = js.Dictionary.empty[js.Any]
      Arn.foreach(__v => __obj.update("Arn", __v.asInstanceOf[js.Any]))
      DirectoryUserId.foreach(__v => __obj.update("DirectoryUserId", __v.asInstanceOf[js.Any]))
      HierarchyGroupId.foreach(__v => __obj.update("HierarchyGroupId", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      IdentityInfo.foreach(__v => __obj.update("IdentityInfo", __v.asInstanceOf[js.Any]))
      PhoneConfig.foreach(__v => __obj.update("PhoneConfig", __v.asInstanceOf[js.Any]))
      RoutingProfileId.foreach(__v => __obj.update("RoutingProfileId", __v.asInstanceOf[js.Any]))
      SecurityProfileIds.foreach(__v => __obj.update("SecurityProfileIds", __v.asInstanceOf[js.Any]))
      Username.foreach(__v => __obj.update("Username", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[User]
    }
  }

  /**
    * A <code>UserIdentityInfo</code> object that contains information about the user's identity, including email address, first name, and last name.
    */
  @js.native
  trait UserIdentityInfo extends js.Object {
    var Email: js.UndefOr[Email]
    var FirstName: js.UndefOr[AgentFirstName]
    var LastName: js.UndefOr[AgentLastName]
  }

  object UserIdentityInfo {
    def apply(
        Email: js.UndefOr[Email] = js.undefined,
        FirstName: js.UndefOr[AgentFirstName] = js.undefined,
        LastName: js.UndefOr[AgentLastName] = js.undefined
    ): UserIdentityInfo = {
      val __obj = js.Dictionary.empty[js.Any]
      Email.foreach(__v => __obj.update("Email", __v.asInstanceOf[js.Any]))
      FirstName.foreach(__v => __obj.update("FirstName", __v.asInstanceOf[js.Any]))
      LastName.foreach(__v => __obj.update("LastName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserIdentityInfo]
    }
  }

  /**
    * A <code>UserPhoneConfig</code> object that contains information about the user phone configuration settings.
    */
  @js.native
  trait UserPhoneConfig extends js.Object {
    var PhoneType: PhoneType
    var AfterContactWorkTimeLimit: js.UndefOr[AfterContactWorkTimeLimit]
    var AutoAccept: js.UndefOr[AutoAccept]
    var DeskPhoneNumber: js.UndefOr[PhoneNumber]
  }

  object UserPhoneConfig {
    def apply(
        PhoneType: PhoneType,
        AfterContactWorkTimeLimit: js.UndefOr[AfterContactWorkTimeLimit] = js.undefined,
        AutoAccept: js.UndefOr[AutoAccept] = js.undefined,
        DeskPhoneNumber: js.UndefOr[PhoneNumber] = js.undefined
    ): UserPhoneConfig = {
      val __obj = js.Dictionary[js.Any](
        "PhoneType" -> PhoneType.asInstanceOf[js.Any]
      )

      AfterContactWorkTimeLimit.foreach(__v => __obj.update("AfterContactWorkTimeLimit", __v.asInstanceOf[js.Any]))
      AutoAccept.foreach(__v => __obj.update("AutoAccept", __v.asInstanceOf[js.Any]))
      DeskPhoneNumber.foreach(__v => __obj.update("DeskPhoneNumber", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserPhoneConfig]
    }
  }

  /**
    * A <code>UserSummary</code> object that contains Information about a user, including ARN, Id, and user name.
    */
  @js.native
  trait UserSummary extends js.Object {
    var Arn: js.UndefOr[ARN]
    var Id: js.UndefOr[UserId]
    var Username: js.UndefOr[AgentUsername]
  }

  object UserSummary {
    def apply(
        Arn: js.UndefOr[ARN] = js.undefined,
        Id: js.UndefOr[UserId] = js.undefined,
        Username: js.UndefOr[AgentUsername] = js.undefined
    ): UserSummary = {
      val __obj = js.Dictionary.empty[js.Any]
      Arn.foreach(__v => __obj.update("Arn", __v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.update("Id", __v.asInstanceOf[js.Any]))
      Username.foreach(__v => __obj.update("Username", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserSummary]
    }
  }
}
