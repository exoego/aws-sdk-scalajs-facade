package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object connect {
  type ARN = String
  type AfterContactWorkTimeLimit = Int
  type AgentFirstName = String
  type AgentLastName = String
  type AgentUsername = String
  type AttributeName = String
  type AttributeValue = String
  type Attributes = js.Dictionary[AttributeValue]
  type AutoAccept = Boolean
  type Channel = String
  type Channels = js.Array[Channel]
  type ClientToken = String
  type Comparison = String
  type ContactFlowId = String
  type ContactId = String
  type CurrentMetricDataCollections = js.Array[CurrentMetricData]
  type CurrentMetricName = String
  type CurrentMetricResults = js.Array[CurrentMetricResult]
  type CurrentMetrics = js.Array[CurrentMetric]
  type DirectoryUserId = String
  type Email = String
  type Grouping = String
  type Groupings = js.Array[Grouping]
  type HierarchyGroupId = String
  type HierarchyGroupName = String
  type HierarchyGroupSummaryList = js.Array[HierarchyGroupSummary]
  type HierarchyLevelId = String
  type HierarchyLevelName = String
  type HistoricalMetricDataCollections = js.Array[HistoricalMetricData]
  type HistoricalMetricName = String
  type HistoricalMetricResults = js.Array[HistoricalMetricResult]
  type HistoricalMetrics = js.Array[HistoricalMetric]
  type InstanceId = String
  type MaxResult100 = Int
  type MaxResult1000 = Int
  type NextToken = String
  type Password = String
  type PhoneNumber = String
  type PhoneType = String
  type QueueId = String
  type Queues = js.Array[QueueId]
  type RoutingProfileId = String
  type RoutingProfileName = String
  type RoutingProfileSummaryList = js.Array[RoutingProfileSummary]
  type SecurityProfileId = String
  type SecurityProfileIds = js.Array[SecurityProfileId]
  type SecurityProfileName = String
  type SecurityProfileSummaryList = js.Array[SecurityProfileSummary]
  type SecurityToken = String
  type Statistic = String
  type ThresholdValue = Double
  type Unit = String
  type UserId = String
  type UserSummaryList = js.Array[UserSummary]
  type Value = Double
  type timestamp = js.Date
}

package connect {
  @js.native
  @JSImport("aws-sdk", "Connect")
  class Connect(config: AWSConfig) extends js.Object {
    def createUser(params: CreateUserRequest): Request[CreateUserResponse] = js.native
    def deleteUser(params: DeleteUserRequest): Request[js.Object] = js.native
    def describeUser(params: DescribeUserRequest): Request[DescribeUserResponse] = js.native
    def describeUserHierarchyGroup(params: DescribeUserHierarchyGroupRequest): Request[DescribeUserHierarchyGroupResponse] = js.native
    def describeUserHierarchyStructure(params: DescribeUserHierarchyStructureRequest): Request[DescribeUserHierarchyStructureResponse] = js.native
    def getCurrentMetricData(params: GetCurrentMetricDataRequest): Request[GetCurrentMetricDataResponse] = js.native
    def getFederationToken(params: GetFederationTokenRequest): Request[GetFederationTokenResponse] = js.native
    def getMetricData(params: GetMetricDataRequest): Request[GetMetricDataResponse] = js.native
    def listRoutingProfiles(params: ListRoutingProfilesRequest): Request[ListRoutingProfilesResponse] = js.native
    def listSecurityProfiles(params: ListSecurityProfilesRequest): Request[ListSecurityProfilesResponse] = js.native
    def listUserHierarchyGroups(params: ListUserHierarchyGroupsRequest): Request[ListUserHierarchyGroupsResponse] = js.native
    def listUsers(params: ListUsersRequest): Request[ListUsersResponse] = js.native
    def startOutboundVoiceContact(params: StartOutboundVoiceContactRequest): Request[StartOutboundVoiceContactResponse] = js.native
    def stopContact(params: StopContactRequest): Request[StopContactResponse] = js.native
    def updateContactAttributes(params: UpdateContactAttributesRequest): Request[UpdateContactAttributesResponse] = js.native
    def updateUserHierarchy(params: UpdateUserHierarchyRequest): Request[js.Object] = js.native
    def updateUserIdentityInfo(params: UpdateUserIdentityInfoRequest): Request[js.Object] = js.native
    def updateUserPhoneConfig(params: UpdateUserPhoneConfigRequest): Request[js.Object] = js.native
    def updateUserRoutingProfile(params: UpdateUserRoutingProfileRequest): Request[js.Object] = js.native
    def updateUserSecurityProfiles(params: UpdateUserSecurityProfilesRequest): Request[js.Object] = js.native
  }

  object ChannelEnum {
    val VOICE = "VOICE"

    val values = IndexedSeq(VOICE)
  }

  object ComparisonEnum {
    val LT = "LT"

    val values = IndexedSeq(LT)
  }

  @js.native
  trait CreateUserRequest extends js.Object {
    var SecurityProfileIds: js.UndefOr[SecurityProfileIds]
    var Username: js.UndefOr[AgentUsername]
    var HierarchyGroupId: js.UndefOr[HierarchyGroupId]
    var PhoneConfig: js.UndefOr[UserPhoneConfig]
    var Password: js.UndefOr[Password]
    var DirectoryUserId: js.UndefOr[DirectoryUserId]
    var IdentityInfo: js.UndefOr[UserIdentityInfo]
    var InstanceId: js.UndefOr[InstanceId]
    var RoutingProfileId: js.UndefOr[RoutingProfileId]
  }

  object CreateUserRequest {
    def apply(
      SecurityProfileIds: js.UndefOr[SecurityProfileIds] = js.undefined,
      Username: js.UndefOr[AgentUsername] = js.undefined,
      HierarchyGroupId: js.UndefOr[HierarchyGroupId] = js.undefined,
      PhoneConfig: js.UndefOr[UserPhoneConfig] = js.undefined,
      Password: js.UndefOr[Password] = js.undefined,
      DirectoryUserId: js.UndefOr[DirectoryUserId] = js.undefined,
      IdentityInfo: js.UndefOr[UserIdentityInfo] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      RoutingProfileId: js.UndefOr[RoutingProfileId] = js.undefined): CreateUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SecurityProfileIds" -> SecurityProfileIds.map { x => x.asInstanceOf[js.Any] },
        "Username" -> Username.map { x => x.asInstanceOf[js.Any] },
        "HierarchyGroupId" -> HierarchyGroupId.map { x => x.asInstanceOf[js.Any] },
        "PhoneConfig" -> PhoneConfig.map { x => x.asInstanceOf[js.Any] },
        "Password" -> Password.map { x => x.asInstanceOf[js.Any] },
        "DirectoryUserId" -> DirectoryUserId.map { x => x.asInstanceOf[js.Any] },
        "IdentityInfo" -> IdentityInfo.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "RoutingProfileId" -> RoutingProfileId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateUserRequest]
    }
  }

  @js.native
  trait CreateUserResponse extends js.Object {
    var UserId: js.UndefOr[UserId]
    var UserArn: js.UndefOr[ARN]
  }

  object CreateUserResponse {
    def apply(
      UserId: js.UndefOr[UserId] = js.undefined,
      UserArn: js.UndefOr[ARN] = js.undefined): CreateUserResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserId" -> UserId.map { x => x.asInstanceOf[js.Any] },
        "UserArn" -> UserArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateUserResponse]
    }
  }

  /**
   * <p>The credentials to use for federation.</p>
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
      RefreshTokenExpiration: js.UndefOr[timestamp] = js.undefined): Credentials = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccessToken" -> AccessToken.map { x => x.asInstanceOf[js.Any] },
        "AccessTokenExpiration" -> AccessTokenExpiration.map { x => x.asInstanceOf[js.Any] },
        "RefreshToken" -> RefreshToken.map { x => x.asInstanceOf[js.Any] },
        "RefreshTokenExpiration" -> RefreshTokenExpiration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Credentials]
    }
  }

  /**
   * <p>A <code>CurrentMetric</code> object that contains the Name and Unit for the metric.</p>
   */
  @js.native
  trait CurrentMetric extends js.Object {
    var Name: js.UndefOr[CurrentMetricName]
    var Unit: js.UndefOr[Unit]
  }

  object CurrentMetric {
    def apply(
      Name: js.UndefOr[CurrentMetricName] = js.undefined,
      Unit: js.UndefOr[Unit] = js.undefined): CurrentMetric = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Unit" -> Unit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CurrentMetric]
    }
  }

  /**
   * <p>A <code>CurrentMetricData</code> object.</p>
   */
  @js.native
  trait CurrentMetricData extends js.Object {
    var Metric: js.UndefOr[CurrentMetric]
    var Value: js.UndefOr[Value]
  }

  object CurrentMetricData {
    def apply(
      Metric: js.UndefOr[CurrentMetric] = js.undefined,
      Value: js.UndefOr[Value] = js.undefined): CurrentMetricData = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Metric" -> Metric.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CurrentMetricData]
    }
  }

  /**
   * <p>A list of current metric names.</p>
   */
  object CurrentMetricNameEnum {
    val AGENTS_ONLINE = "AGENTS_ONLINE"
    val AGENTS_AVAILABLE = "AGENTS_AVAILABLE"
    val AGENTS_ON_CALL = "AGENTS_ON_CALL"
    val AGENTS_NON_PRODUCTIVE = "AGENTS_NON_PRODUCTIVE"
    val AGENTS_AFTER_CONTACT_WORK = "AGENTS_AFTER_CONTACT_WORK"
    val AGENTS_ERROR = "AGENTS_ERROR"
    val AGENTS_STAFFED = "AGENTS_STAFFED"
    val CONTACTS_IN_QUEUE = "CONTACTS_IN_QUEUE"
    val OLDEST_CONTACT_AGE = "OLDEST_CONTACT_AGE"
    val CONTACTS_SCHEDULED = "CONTACTS_SCHEDULED"

    val values = IndexedSeq(AGENTS_ONLINE, AGENTS_AVAILABLE, AGENTS_ON_CALL, AGENTS_NON_PRODUCTIVE, AGENTS_AFTER_CONTACT_WORK, AGENTS_ERROR, AGENTS_STAFFED, CONTACTS_IN_QUEUE, OLDEST_CONTACT_AGE, CONTACTS_SCHEDULED)
  }

  /**
   * <p>A <code>CurrentMetricResult</code> object.</p>
   */
  @js.native
  trait CurrentMetricResult extends js.Object {
    var Dimensions: js.UndefOr[Dimensions]
    var Collections: js.UndefOr[CurrentMetricDataCollections]
  }

  object CurrentMetricResult {
    def apply(
      Dimensions: js.UndefOr[Dimensions] = js.undefined,
      Collections: js.UndefOr[CurrentMetricDataCollections] = js.undefined): CurrentMetricResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Dimensions" -> Dimensions.map { x => x.asInstanceOf[js.Any] },
        "Collections" -> Collections.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CurrentMetricResult]
    }
  }

  @js.native
  trait DeleteUserRequest extends js.Object {
    var InstanceId: js.UndefOr[InstanceId]
    var UserId: js.UndefOr[UserId]
  }

  object DeleteUserRequest {
    def apply(
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      UserId: js.UndefOr[UserId] = js.undefined): DeleteUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "UserId" -> UserId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteUserRequest]
    }
  }

  @js.native
  trait DescribeUserHierarchyGroupRequest extends js.Object {
    var HierarchyGroupId: js.UndefOr[HierarchyGroupId]
    var InstanceId: js.UndefOr[InstanceId]
  }

  object DescribeUserHierarchyGroupRequest {
    def apply(
      HierarchyGroupId: js.UndefOr[HierarchyGroupId] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined): DescribeUserHierarchyGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HierarchyGroupId" -> HierarchyGroupId.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeUserHierarchyGroupRequest]
    }
  }

  @js.native
  trait DescribeUserHierarchyGroupResponse extends js.Object {
    var HierarchyGroup: js.UndefOr[HierarchyGroup]
  }

  object DescribeUserHierarchyGroupResponse {
    def apply(
      HierarchyGroup: js.UndefOr[HierarchyGroup] = js.undefined): DescribeUserHierarchyGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HierarchyGroup" -> HierarchyGroup.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeUserHierarchyGroupResponse]
    }
  }

  @js.native
  trait DescribeUserHierarchyStructureRequest extends js.Object {
    var InstanceId: js.UndefOr[InstanceId]
  }

  object DescribeUserHierarchyStructureRequest {
    def apply(
      InstanceId: js.UndefOr[InstanceId] = js.undefined): DescribeUserHierarchyStructureRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeUserHierarchyStructureRequest]
    }
  }

  @js.native
  trait DescribeUserHierarchyStructureResponse extends js.Object {
    var HierarchyStructure: js.UndefOr[HierarchyStructure]
  }

  object DescribeUserHierarchyStructureResponse {
    def apply(
      HierarchyStructure: js.UndefOr[HierarchyStructure] = js.undefined): DescribeUserHierarchyStructureResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HierarchyStructure" -> HierarchyStructure.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeUserHierarchyStructureResponse]
    }
  }

  @js.native
  trait DescribeUserRequest extends js.Object {
    var UserId: js.UndefOr[UserId]
    var InstanceId: js.UndefOr[InstanceId]
  }

  object DescribeUserRequest {
    def apply(
      UserId: js.UndefOr[UserId] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined): DescribeUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserId" -> UserId.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeUserRequest]
    }
  }

  @js.native
  trait DescribeUserResponse extends js.Object {
    var User: js.UndefOr[User]
  }

  object DescribeUserResponse {
    def apply(
      User: js.UndefOr[User] = js.undefined): DescribeUserResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "User" -> User.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeUserResponse]
    }
  }

  /**
   * <p>A <code>Dimensions</code> object that includes the Channel and Queue for the metric.</p>
   */
  @js.native
  trait Dimensions extends js.Object {
    var Queue: js.UndefOr[QueueReference]
    var Channel: js.UndefOr[Channel]
  }

  object Dimensions {
    def apply(
      Queue: js.UndefOr[QueueReference] = js.undefined,
      Channel: js.UndefOr[Channel] = js.undefined): Dimensions = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Queue" -> Queue.map { x => x.asInstanceOf[js.Any] },
        "Channel" -> Channel.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Dimensions]
    }
  }

  /**
   * <p>The filter, either channel or queues, to apply to the metric results retrieved.</p>
   */
  @js.native
  trait Filters extends js.Object {
    var Queues: js.UndefOr[Queues]
    var Channels: js.UndefOr[Channels]
  }

  object Filters {
    def apply(
      Queues: js.UndefOr[Queues] = js.undefined,
      Channels: js.UndefOr[Channels] = js.undefined): Filters = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Queues" -> Queues.map { x => x.asInstanceOf[js.Any] },
        "Channels" -> Channels.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Filters]
    }
  }

  @js.native
  trait GetCurrentMetricDataRequest extends js.Object {
    var CurrentMetrics: js.UndefOr[CurrentMetrics]
    var MaxResults: js.UndefOr[MaxResult100]
    var Groupings: js.UndefOr[Groupings]
    var InstanceId: js.UndefOr[InstanceId]
    var Filters: js.UndefOr[Filters]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetCurrentMetricDataRequest {
    def apply(
      CurrentMetrics: js.UndefOr[CurrentMetrics] = js.undefined,
      MaxResults: js.UndefOr[MaxResult100] = js.undefined,
      Groupings: js.UndefOr[Groupings] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      Filters: js.UndefOr[Filters] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): GetCurrentMetricDataRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CurrentMetrics" -> CurrentMetrics.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "Groupings" -> Groupings.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCurrentMetricDataRequest]
    }
  }

  @js.native
  trait GetCurrentMetricDataResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var MetricResults: js.UndefOr[CurrentMetricResults]
    var DataSnapshotTime: js.UndefOr[timestamp]
  }

  object GetCurrentMetricDataResponse {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MetricResults: js.UndefOr[CurrentMetricResults] = js.undefined,
      DataSnapshotTime: js.UndefOr[timestamp] = js.undefined): GetCurrentMetricDataResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MetricResults" -> MetricResults.map { x => x.asInstanceOf[js.Any] },
        "DataSnapshotTime" -> DataSnapshotTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCurrentMetricDataResponse]
    }
  }

  @js.native
  trait GetFederationTokenRequest extends js.Object {
    var InstanceId: js.UndefOr[InstanceId]
  }

  object GetFederationTokenRequest {
    def apply(
      InstanceId: js.UndefOr[InstanceId] = js.undefined): GetFederationTokenRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetFederationTokenRequest]
    }
  }

  @js.native
  trait GetFederationTokenResponse extends js.Object {
    var Credentials: js.UndefOr[Credentials]
  }

  object GetFederationTokenResponse {
    def apply(
      Credentials: js.UndefOr[Credentials] = js.undefined): GetFederationTokenResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Credentials" -> Credentials.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetFederationTokenResponse]
    }
  }

  @js.native
  trait GetMetricDataRequest extends js.Object {
    var HistoricalMetrics: js.UndefOr[HistoricalMetrics]
    var MaxResults: js.UndefOr[MaxResult100]
    var StartTime: js.UndefOr[timestamp]
    var EndTime: js.UndefOr[timestamp]
    var Groupings: js.UndefOr[Groupings]
    var InstanceId: js.UndefOr[InstanceId]
    var Filters: js.UndefOr[Filters]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetMetricDataRequest {
    def apply(
      HistoricalMetrics: js.UndefOr[HistoricalMetrics] = js.undefined,
      MaxResults: js.UndefOr[MaxResult100] = js.undefined,
      StartTime: js.UndefOr[timestamp] = js.undefined,
      EndTime: js.UndefOr[timestamp] = js.undefined,
      Groupings: js.UndefOr[Groupings] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      Filters: js.UndefOr[Filters] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): GetMetricDataRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HistoricalMetrics" -> HistoricalMetrics.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] },
        "EndTime" -> EndTime.map { x => x.asInstanceOf[js.Any] },
        "Groupings" -> Groupings.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetMetricDataRequest]
    }
  }

  @js.native
  trait GetMetricDataResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var MetricResults: js.UndefOr[HistoricalMetricResults]
  }

  object GetMetricDataResponse {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MetricResults: js.UndefOr[HistoricalMetricResults] = js.undefined): GetMetricDataResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MetricResults" -> MetricResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetMetricDataResponse]
    }
  }

  object GroupingEnum {
    val QUEUE = "QUEUE"
    val CHANNEL = "CHANNEL"

    val values = IndexedSeq(QUEUE, CHANNEL)
  }

  /**
   * <p>A <code>HierarchyGroup</code> object that contains information about a hierarchy group in your Amazon Connect instance.</p>
   */
  @js.native
  trait HierarchyGroup extends js.Object {
    var Id: js.UndefOr[HierarchyGroupId]
    var Name: js.UndefOr[HierarchyGroupName]
    var Arn: js.UndefOr[ARN]
    var HierarchyPath: js.UndefOr[HierarchyPath]
    var LevelId: js.UndefOr[HierarchyLevelId]
  }

  object HierarchyGroup {
    def apply(
      Id: js.UndefOr[HierarchyGroupId] = js.undefined,
      Name: js.UndefOr[HierarchyGroupName] = js.undefined,
      Arn: js.UndefOr[ARN] = js.undefined,
      HierarchyPath: js.UndefOr[HierarchyPath] = js.undefined,
      LevelId: js.UndefOr[HierarchyLevelId] = js.undefined): HierarchyGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "HierarchyPath" -> HierarchyPath.map { x => x.asInstanceOf[js.Any] },
        "LevelId" -> LevelId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HierarchyGroup]
    }
  }

  /**
   * <p>A <code>HierarchyGroupSummary</code> object that contains information about the hierarchy group, including ARN, Id, and Name.</p>
   */
  @js.native
  trait HierarchyGroupSummary extends js.Object {
    var Id: js.UndefOr[HierarchyGroupId]
    var Arn: js.UndefOr[ARN]
    var Name: js.UndefOr[HierarchyGroupName]
  }

  object HierarchyGroupSummary {
    def apply(
      Id: js.UndefOr[HierarchyGroupId] = js.undefined,
      Arn: js.UndefOr[ARN] = js.undefined,
      Name: js.UndefOr[HierarchyGroupName] = js.undefined): HierarchyGroupSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HierarchyGroupSummary]
    }
  }

  /**
   * <p>A <code>HierarchyLevel</code> object that contains information about the levels in a hierarchy group, including ARN, Id, and Name.</p>
   */
  @js.native
  trait HierarchyLevel extends js.Object {
    var Id: js.UndefOr[HierarchyLevelId]
    var Arn: js.UndefOr[ARN]
    var Name: js.UndefOr[HierarchyLevelName]
  }

  object HierarchyLevel {
    def apply(
      Id: js.UndefOr[HierarchyLevelId] = js.undefined,
      Arn: js.UndefOr[ARN] = js.undefined,
      Name: js.UndefOr[HierarchyLevelName] = js.undefined): HierarchyLevel = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HierarchyLevel]
    }
  }

  /**
   * <p>A <code>HierarchyPath</code> object that contains information about the levels of the hierarchy group.</p>
   */
  @js.native
  trait HierarchyPath extends js.Object {
    var LevelFour: js.UndefOr[HierarchyGroupSummary]
    var LevelTwo: js.UndefOr[HierarchyGroupSummary]
    var LevelFive: js.UndefOr[HierarchyGroupSummary]
    var LevelThree: js.UndefOr[HierarchyGroupSummary]
    var LevelOne: js.UndefOr[HierarchyGroupSummary]
  }

  object HierarchyPath {
    def apply(
      LevelFour: js.UndefOr[HierarchyGroupSummary] = js.undefined,
      LevelTwo: js.UndefOr[HierarchyGroupSummary] = js.undefined,
      LevelFive: js.UndefOr[HierarchyGroupSummary] = js.undefined,
      LevelThree: js.UndefOr[HierarchyGroupSummary] = js.undefined,
      LevelOne: js.UndefOr[HierarchyGroupSummary] = js.undefined): HierarchyPath = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LevelFour" -> LevelFour.map { x => x.asInstanceOf[js.Any] },
        "LevelTwo" -> LevelTwo.map { x => x.asInstanceOf[js.Any] },
        "LevelFive" -> LevelFive.map { x => x.asInstanceOf[js.Any] },
        "LevelThree" -> LevelThree.map { x => x.asInstanceOf[js.Any] },
        "LevelOne" -> LevelOne.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HierarchyPath]
    }
  }

  /**
   * <p>A <code>HierarchyStructure</code> object that contains information about the hierarchy group structure.</p>
   */
  @js.native
  trait HierarchyStructure extends js.Object {
    var LevelFour: js.UndefOr[HierarchyLevel]
    var LevelTwo: js.UndefOr[HierarchyLevel]
    var LevelFive: js.UndefOr[HierarchyLevel]
    var LevelThree: js.UndefOr[HierarchyLevel]
    var LevelOne: js.UndefOr[HierarchyLevel]
  }

  object HierarchyStructure {
    def apply(
      LevelFour: js.UndefOr[HierarchyLevel] = js.undefined,
      LevelTwo: js.UndefOr[HierarchyLevel] = js.undefined,
      LevelFive: js.UndefOr[HierarchyLevel] = js.undefined,
      LevelThree: js.UndefOr[HierarchyLevel] = js.undefined,
      LevelOne: js.UndefOr[HierarchyLevel] = js.undefined): HierarchyStructure = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LevelFour" -> LevelFour.map { x => x.asInstanceOf[js.Any] },
        "LevelTwo" -> LevelTwo.map { x => x.asInstanceOf[js.Any] },
        "LevelFive" -> LevelFive.map { x => x.asInstanceOf[js.Any] },
        "LevelThree" -> LevelThree.map { x => x.asInstanceOf[js.Any] },
        "LevelOne" -> LevelOne.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HierarchyStructure]
    }
  }

  /**
   * <p>A <code>HistoricalMetric</code> object that contains the Name, Unit, Statistic, and Threshold for the metric.</p>
   */
  @js.native
  trait HistoricalMetric extends js.Object {
    var Name: js.UndefOr[HistoricalMetricName]
    var Threshold: js.UndefOr[Threshold]
    var Statistic: js.UndefOr[Statistic]
    var Unit: js.UndefOr[Unit]
  }

  object HistoricalMetric {
    def apply(
      Name: js.UndefOr[HistoricalMetricName] = js.undefined,
      Threshold: js.UndefOr[Threshold] = js.undefined,
      Statistic: js.UndefOr[Statistic] = js.undefined,
      Unit: js.UndefOr[Unit] = js.undefined): HistoricalMetric = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Threshold" -> Threshold.map { x => x.asInstanceOf[js.Any] },
        "Statistic" -> Statistic.map { x => x.asInstanceOf[js.Any] },
        "Unit" -> Unit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HistoricalMetric]
    }
  }

  /**
   * <p>A <code>HistoricalMetricData</code> object than contains a <code>Metric</code> and a <code>Value</code>.</p>
   */
  @js.native
  trait HistoricalMetricData extends js.Object {
    var Metric: js.UndefOr[HistoricalMetric]
    var Value: js.UndefOr[Value]
  }

  object HistoricalMetricData {
    def apply(
      Metric: js.UndefOr[HistoricalMetric] = js.undefined,
      Value: js.UndefOr[Value] = js.undefined): HistoricalMetricData = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Metric" -> Metric.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HistoricalMetricData]
    }
  }

  /**
   * <p>A list of historical metric names.</p>
   */
  object HistoricalMetricNameEnum {
    val CONTACTS_QUEUED = "CONTACTS_QUEUED"
    val CONTACTS_HANDLED = "CONTACTS_HANDLED"
    val CONTACTS_ABANDONED = "CONTACTS_ABANDONED"
    val CONTACTS_CONSULTED = "CONTACTS_CONSULTED"
    val CONTACTS_AGENT_HUNG_UP_FIRST = "CONTACTS_AGENT_HUNG_UP_FIRST"
    val CONTACTS_HANDLED_INCOMING = "CONTACTS_HANDLED_INCOMING"
    val CONTACTS_HANDLED_OUTBOUND = "CONTACTS_HANDLED_OUTBOUND"
    val CONTACTS_HOLD_ABANDONS = "CONTACTS_HOLD_ABANDONS"
    val CONTACTS_TRANSFERRED_IN = "CONTACTS_TRANSFERRED_IN"
    val CONTACTS_TRANSFERRED_OUT = "CONTACTS_TRANSFERRED_OUT"
    val CONTACTS_TRANSFERRED_IN_FROM_QUEUE = "CONTACTS_TRANSFERRED_IN_FROM_QUEUE"
    val CONTACTS_TRANSFERRED_OUT_FROM_QUEUE = "CONTACTS_TRANSFERRED_OUT_FROM_QUEUE"
    val CONTACTS_MISSED = "CONTACTS_MISSED"
    val CALLBACK_CONTACTS_HANDLED = "CALLBACK_CONTACTS_HANDLED"
    val API_CONTACTS_HANDLED = "API_CONTACTS_HANDLED"
    val OCCUPANCY = "OCCUPANCY"
    val HANDLE_TIME = "HANDLE_TIME"
    val AFTER_CONTACT_WORK_TIME = "AFTER_CONTACT_WORK_TIME"
    val QUEUED_TIME = "QUEUED_TIME"
    val ABANDON_TIME = "ABANDON_TIME"
    val QUEUE_ANSWER_TIME = "QUEUE_ANSWER_TIME"
    val HOLD_TIME = "HOLD_TIME"
    val INTERACTION_TIME = "INTERACTION_TIME"
    val INTERACTION_AND_HOLD_TIME = "INTERACTION_AND_HOLD_TIME"
    val SERVICE_LEVEL = "SERVICE_LEVEL"

    val values = IndexedSeq(CONTACTS_QUEUED, CONTACTS_HANDLED, CONTACTS_ABANDONED, CONTACTS_CONSULTED, CONTACTS_AGENT_HUNG_UP_FIRST, CONTACTS_HANDLED_INCOMING, CONTACTS_HANDLED_OUTBOUND, CONTACTS_HOLD_ABANDONS, CONTACTS_TRANSFERRED_IN, CONTACTS_TRANSFERRED_OUT, CONTACTS_TRANSFERRED_IN_FROM_QUEUE, CONTACTS_TRANSFERRED_OUT_FROM_QUEUE, CONTACTS_MISSED, CALLBACK_CONTACTS_HANDLED, API_CONTACTS_HANDLED, OCCUPANCY, HANDLE_TIME, AFTER_CONTACT_WORK_TIME, QUEUED_TIME, ABANDON_TIME, QUEUE_ANSWER_TIME, HOLD_TIME, INTERACTION_TIME, INTERACTION_AND_HOLD_TIME, SERVICE_LEVEL)
  }

  /**
   * <p>The metrics data returned from a <code>GetMetricData</code> operation.</p>
   */
  @js.native
  trait HistoricalMetricResult extends js.Object {
    var Dimensions: js.UndefOr[Dimensions]
    var Collections: js.UndefOr[HistoricalMetricDataCollections]
  }

  object HistoricalMetricResult {
    def apply(
      Dimensions: js.UndefOr[Dimensions] = js.undefined,
      Collections: js.UndefOr[HistoricalMetricDataCollections] = js.undefined): HistoricalMetricResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Dimensions" -> Dimensions.map { x => x.asInstanceOf[js.Any] },
        "Collections" -> Collections.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HistoricalMetricResult]
    }
  }

  @js.native
  trait ListRoutingProfilesRequest extends js.Object {
    var InstanceId: js.UndefOr[InstanceId]
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[MaxResult1000]
  }

  object ListRoutingProfilesRequest {
    def apply(
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[MaxResult1000] = js.undefined): ListRoutingProfilesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListRoutingProfilesRequest]
    }
  }

  @js.native
  trait ListRoutingProfilesResponse extends js.Object {
    var RoutingProfileSummaryList: js.UndefOr[RoutingProfileSummaryList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListRoutingProfilesResponse {
    def apply(
      RoutingProfileSummaryList: js.UndefOr[RoutingProfileSummaryList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListRoutingProfilesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RoutingProfileSummaryList" -> RoutingProfileSummaryList.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListRoutingProfilesResponse]
    }
  }

  @js.native
  trait ListSecurityProfilesRequest extends js.Object {
    var InstanceId: js.UndefOr[InstanceId]
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[MaxResult1000]
  }

  object ListSecurityProfilesRequest {
    def apply(
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[MaxResult1000] = js.undefined): ListSecurityProfilesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSecurityProfilesRequest]
    }
  }

  @js.native
  trait ListSecurityProfilesResponse extends js.Object {
    var SecurityProfileSummaryList: js.UndefOr[SecurityProfileSummaryList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListSecurityProfilesResponse {
    def apply(
      SecurityProfileSummaryList: js.UndefOr[SecurityProfileSummaryList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListSecurityProfilesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SecurityProfileSummaryList" -> SecurityProfileSummaryList.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSecurityProfilesResponse]
    }
  }

  @js.native
  trait ListUserHierarchyGroupsRequest extends js.Object {
    var InstanceId: js.UndefOr[InstanceId]
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[MaxResult1000]
  }

  object ListUserHierarchyGroupsRequest {
    def apply(
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[MaxResult1000] = js.undefined): ListUserHierarchyGroupsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListUserHierarchyGroupsRequest]
    }
  }

  @js.native
  trait ListUserHierarchyGroupsResponse extends js.Object {
    var UserHierarchyGroupSummaryList: js.UndefOr[HierarchyGroupSummaryList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListUserHierarchyGroupsResponse {
    def apply(
      UserHierarchyGroupSummaryList: js.UndefOr[HierarchyGroupSummaryList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListUserHierarchyGroupsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserHierarchyGroupSummaryList" -> UserHierarchyGroupSummaryList.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListUserHierarchyGroupsResponse]
    }
  }

  @js.native
  trait ListUsersRequest extends js.Object {
    var InstanceId: js.UndefOr[InstanceId]
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[MaxResult1000]
  }

  object ListUsersRequest {
    def apply(
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[MaxResult1000] = js.undefined): ListUsersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListUsersRequest]
    }
  }

  @js.native
  trait ListUsersResponse extends js.Object {
    var UserSummaryList: js.UndefOr[UserSummaryList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListUsersResponse {
    def apply(
      UserSummaryList: js.UndefOr[UserSummaryList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListUsersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserSummaryList" -> UserSummaryList.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListUsersResponse]
    }
  }

  object PhoneTypeEnum {
    val SOFT_PHONE = "SOFT_PHONE"
    val DESK_PHONE = "DESK_PHONE"

    val values = IndexedSeq(SOFT_PHONE, DESK_PHONE)
  }

  /**
   * <p>A QueueReference object that contains the the QueueId and ARN for the queue resource for which metrics are returned.</p>
   */
  @js.native
  trait QueueReference extends js.Object {
    var Id: js.UndefOr[QueueId]
    var Arn: js.UndefOr[ARN]
  }

  object QueueReference {
    def apply(
      Id: js.UndefOr[QueueId] = js.undefined,
      Arn: js.UndefOr[ARN] = js.undefined): QueueReference = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[QueueReference]
    }
  }

  /**
   * <p>A <code>RoutingProfileSummary</code> object that contains information about a routing profile, including ARN, Id, and Name.</p>
   */
  @js.native
  trait RoutingProfileSummary extends js.Object {
    var Id: js.UndefOr[RoutingProfileId]
    var Arn: js.UndefOr[ARN]
    var Name: js.UndefOr[RoutingProfileName]
  }

  object RoutingProfileSummary {
    def apply(
      Id: js.UndefOr[RoutingProfileId] = js.undefined,
      Arn: js.UndefOr[ARN] = js.undefined,
      Name: js.UndefOr[RoutingProfileName] = js.undefined): RoutingProfileSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RoutingProfileSummary]
    }
  }

  /**
   * <p>A <code>SecurityProfileSummary</code> object that contains information about a security profile, including ARN, Id, Name.</p>
   */
  @js.native
  trait SecurityProfileSummary extends js.Object {
    var Id: js.UndefOr[SecurityProfileId]
    var Arn: js.UndefOr[ARN]
    var Name: js.UndefOr[SecurityProfileName]
  }

  object SecurityProfileSummary {
    def apply(
      Id: js.UndefOr[SecurityProfileId] = js.undefined,
      Arn: js.UndefOr[ARN] = js.undefined,
      Name: js.UndefOr[SecurityProfileName] = js.undefined): SecurityProfileSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SecurityProfileSummary]
    }
  }

  @js.native
  trait StartOutboundVoiceContactRequest extends js.Object {
    var ContactFlowId: js.UndefOr[ContactFlowId]
    var DestinationPhoneNumber: js.UndefOr[PhoneNumber]
    var ClientToken: js.UndefOr[ClientToken]
    var Attributes: js.UndefOr[Attributes]
    var SourcePhoneNumber: js.UndefOr[PhoneNumber]
    var InstanceId: js.UndefOr[InstanceId]
    var QueueId: js.UndefOr[QueueId]
  }

  object StartOutboundVoiceContactRequest {
    def apply(
      ContactFlowId: js.UndefOr[ContactFlowId] = js.undefined,
      DestinationPhoneNumber: js.UndefOr[PhoneNumber] = js.undefined,
      ClientToken: js.UndefOr[ClientToken] = js.undefined,
      Attributes: js.UndefOr[Attributes] = js.undefined,
      SourcePhoneNumber: js.UndefOr[PhoneNumber] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      QueueId: js.UndefOr[QueueId] = js.undefined): StartOutboundVoiceContactRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ContactFlowId" -> ContactFlowId.map { x => x.asInstanceOf[js.Any] },
        "DestinationPhoneNumber" -> DestinationPhoneNumber.map { x => x.asInstanceOf[js.Any] },
        "ClientToken" -> ClientToken.map { x => x.asInstanceOf[js.Any] },
        "Attributes" -> Attributes.map { x => x.asInstanceOf[js.Any] },
        "SourcePhoneNumber" -> SourcePhoneNumber.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "QueueId" -> QueueId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartOutboundVoiceContactRequest]
    }
  }

  @js.native
  trait StartOutboundVoiceContactResponse extends js.Object {
    var ContactId: js.UndefOr[ContactId]
  }

  object StartOutboundVoiceContactResponse {
    def apply(
      ContactId: js.UndefOr[ContactId] = js.undefined): StartOutboundVoiceContactResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ContactId" -> ContactId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartOutboundVoiceContactResponse]
    }
  }

  object StatisticEnum {
    val SUM = "SUM"
    val MAX = "MAX"
    val AVG = "AVG"

    val values = IndexedSeq(SUM, MAX, AVG)
  }

  @js.native
  trait StopContactRequest extends js.Object {
    var ContactId: js.UndefOr[ContactId]
    var InstanceId: js.UndefOr[InstanceId]
  }

  object StopContactRequest {
    def apply(
      ContactId: js.UndefOr[ContactId] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined): StopContactRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ContactId" -> ContactId.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopContactRequest]
    }
  }

  @js.native
  trait StopContactResponse extends js.Object {

  }

  object StopContactResponse {
    def apply(): StopContactResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopContactResponse]
    }
  }

  /**
   * <p>A <code>Threshold</code> object that includes a comparison and <code>ThresholdValue</code> to compare to. Used with service level metrics.</p>
   */
  @js.native
  trait Threshold extends js.Object {
    var Comparison: js.UndefOr[Comparison]
    var ThresholdValue: js.UndefOr[ThresholdValue]
  }

  object Threshold {
    def apply(
      Comparison: js.UndefOr[Comparison] = js.undefined,
      ThresholdValue: js.UndefOr[ThresholdValue] = js.undefined): Threshold = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Comparison" -> Comparison.map { x => x.asInstanceOf[js.Any] },
        "ThresholdValue" -> ThresholdValue.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Threshold]
    }
  }

  object UnitEnum {
    val SECONDS = "SECONDS"
    val COUNT = "COUNT"
    val PERCENT = "PERCENT"

    val values = IndexedSeq(SECONDS, COUNT, PERCENT)
  }

  @js.native
  trait UpdateContactAttributesRequest extends js.Object {
    var InitialContactId: js.UndefOr[ContactId]
    var InstanceId: js.UndefOr[InstanceId]
    var Attributes: js.UndefOr[Attributes]
  }

  object UpdateContactAttributesRequest {
    def apply(
      InitialContactId: js.UndefOr[ContactId] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      Attributes: js.UndefOr[Attributes] = js.undefined): UpdateContactAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InitialContactId" -> InitialContactId.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "Attributes" -> Attributes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateContactAttributesRequest]
    }
  }

  @js.native
  trait UpdateContactAttributesResponse extends js.Object {

  }

  object UpdateContactAttributesResponse {
    def apply(): UpdateContactAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateContactAttributesResponse]
    }
  }

  @js.native
  trait UpdateUserHierarchyRequest extends js.Object {
    var HierarchyGroupId: js.UndefOr[HierarchyGroupId]
    var UserId: js.UndefOr[UserId]
    var InstanceId: js.UndefOr[InstanceId]
  }

  object UpdateUserHierarchyRequest {
    def apply(
      HierarchyGroupId: js.UndefOr[HierarchyGroupId] = js.undefined,
      UserId: js.UndefOr[UserId] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined): UpdateUserHierarchyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HierarchyGroupId" -> HierarchyGroupId.map { x => x.asInstanceOf[js.Any] },
        "UserId" -> UserId.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateUserHierarchyRequest]
    }
  }

  @js.native
  trait UpdateUserIdentityInfoRequest extends js.Object {
    var IdentityInfo: js.UndefOr[UserIdentityInfo]
    var UserId: js.UndefOr[UserId]
    var InstanceId: js.UndefOr[InstanceId]
  }

  object UpdateUserIdentityInfoRequest {
    def apply(
      IdentityInfo: js.UndefOr[UserIdentityInfo] = js.undefined,
      UserId: js.UndefOr[UserId] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined): UpdateUserIdentityInfoRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdentityInfo" -> IdentityInfo.map { x => x.asInstanceOf[js.Any] },
        "UserId" -> UserId.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateUserIdentityInfoRequest]
    }
  }

  @js.native
  trait UpdateUserPhoneConfigRequest extends js.Object {
    var PhoneConfig: js.UndefOr[UserPhoneConfig]
    var UserId: js.UndefOr[UserId]
    var InstanceId: js.UndefOr[InstanceId]
  }

  object UpdateUserPhoneConfigRequest {
    def apply(
      PhoneConfig: js.UndefOr[UserPhoneConfig] = js.undefined,
      UserId: js.UndefOr[UserId] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined): UpdateUserPhoneConfigRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PhoneConfig" -> PhoneConfig.map { x => x.asInstanceOf[js.Any] },
        "UserId" -> UserId.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateUserPhoneConfigRequest]
    }
  }

  @js.native
  trait UpdateUserRoutingProfileRequest extends js.Object {
    var RoutingProfileId: js.UndefOr[RoutingProfileId]
    var UserId: js.UndefOr[UserId]
    var InstanceId: js.UndefOr[InstanceId]
  }

  object UpdateUserRoutingProfileRequest {
    def apply(
      RoutingProfileId: js.UndefOr[RoutingProfileId] = js.undefined,
      UserId: js.UndefOr[UserId] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined): UpdateUserRoutingProfileRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RoutingProfileId" -> RoutingProfileId.map { x => x.asInstanceOf[js.Any] },
        "UserId" -> UserId.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateUserRoutingProfileRequest]
    }
  }

  @js.native
  trait UpdateUserSecurityProfilesRequest extends js.Object {
    var SecurityProfileIds: js.UndefOr[SecurityProfileIds]
    var UserId: js.UndefOr[UserId]
    var InstanceId: js.UndefOr[InstanceId]
  }

  object UpdateUserSecurityProfilesRequest {
    def apply(
      SecurityProfileIds: js.UndefOr[SecurityProfileIds] = js.undefined,
      UserId: js.UndefOr[UserId] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined): UpdateUserSecurityProfilesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SecurityProfileIds" -> SecurityProfileIds.map { x => x.asInstanceOf[js.Any] },
        "UserId" -> UserId.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateUserSecurityProfilesRequest]
    }
  }

  /**
   * <p>A <code>User</code> object that contains information about a user account in your Amazon Connect instance, including configuration settings.</p>
   */
  @js.native
  trait User extends js.Object {
    var SecurityProfileIds: js.UndefOr[SecurityProfileIds]
    var Username: js.UndefOr[AgentUsername]
    var Id: js.UndefOr[UserId]
    var HierarchyGroupId: js.UndefOr[HierarchyGroupId]
    var PhoneConfig: js.UndefOr[UserPhoneConfig]
    var DirectoryUserId: js.UndefOr[DirectoryUserId]
    var Arn: js.UndefOr[ARN]
    var IdentityInfo: js.UndefOr[UserIdentityInfo]
    var RoutingProfileId: js.UndefOr[RoutingProfileId]
  }

  object User {
    def apply(
      SecurityProfileIds: js.UndefOr[SecurityProfileIds] = js.undefined,
      Username: js.UndefOr[AgentUsername] = js.undefined,
      Id: js.UndefOr[UserId] = js.undefined,
      HierarchyGroupId: js.UndefOr[HierarchyGroupId] = js.undefined,
      PhoneConfig: js.UndefOr[UserPhoneConfig] = js.undefined,
      DirectoryUserId: js.UndefOr[DirectoryUserId] = js.undefined,
      Arn: js.UndefOr[ARN] = js.undefined,
      IdentityInfo: js.UndefOr[UserIdentityInfo] = js.undefined,
      RoutingProfileId: js.UndefOr[RoutingProfileId] = js.undefined): User = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SecurityProfileIds" -> SecurityProfileIds.map { x => x.asInstanceOf[js.Any] },
        "Username" -> Username.map { x => x.asInstanceOf[js.Any] },
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "HierarchyGroupId" -> HierarchyGroupId.map { x => x.asInstanceOf[js.Any] },
        "PhoneConfig" -> PhoneConfig.map { x => x.asInstanceOf[js.Any] },
        "DirectoryUserId" -> DirectoryUserId.map { x => x.asInstanceOf[js.Any] },
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "IdentityInfo" -> IdentityInfo.map { x => x.asInstanceOf[js.Any] },
        "RoutingProfileId" -> RoutingProfileId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[User]
    }
  }

  /**
   * <p>A <code>UserIdentityInfo</code> object that contains information about the user's identity, including email address, first name, and last name.</p>
   */
  @js.native
  trait UserIdentityInfo extends js.Object {
    var FirstName: js.UndefOr[AgentFirstName]
    var LastName: js.UndefOr[AgentLastName]
    var Email: js.UndefOr[Email]
  }

  object UserIdentityInfo {
    def apply(
      FirstName: js.UndefOr[AgentFirstName] = js.undefined,
      LastName: js.UndefOr[AgentLastName] = js.undefined,
      Email: js.UndefOr[Email] = js.undefined): UserIdentityInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FirstName" -> FirstName.map { x => x.asInstanceOf[js.Any] },
        "LastName" -> LastName.map { x => x.asInstanceOf[js.Any] },
        "Email" -> Email.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UserIdentityInfo]
    }
  }

  /**
   * <p>A <code>UserPhoneConfig</code> object that contains information about the user phone configuration settings.</p>
   */
  @js.native
  trait UserPhoneConfig extends js.Object {
    var PhoneType: js.UndefOr[PhoneType]
    var AutoAccept: js.UndefOr[AutoAccept]
    var AfterContactWorkTimeLimit: js.UndefOr[AfterContactWorkTimeLimit]
    var DeskPhoneNumber: js.UndefOr[PhoneNumber]
  }

  object UserPhoneConfig {
    def apply(
      PhoneType: js.UndefOr[PhoneType] = js.undefined,
      AutoAccept: js.UndefOr[AutoAccept] = js.undefined,
      AfterContactWorkTimeLimit: js.UndefOr[AfterContactWorkTimeLimit] = js.undefined,
      DeskPhoneNumber: js.UndefOr[PhoneNumber] = js.undefined): UserPhoneConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PhoneType" -> PhoneType.map { x => x.asInstanceOf[js.Any] },
        "AutoAccept" -> AutoAccept.map { x => x.asInstanceOf[js.Any] },
        "AfterContactWorkTimeLimit" -> AfterContactWorkTimeLimit.map { x => x.asInstanceOf[js.Any] },
        "DeskPhoneNumber" -> DeskPhoneNumber.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UserPhoneConfig]
    }
  }

  /**
   * <p>A <code>UserSummary</code> object that contains Information about a user, including ARN, Id, and user name.</p>
   */
  @js.native
  trait UserSummary extends js.Object {
    var Id: js.UndefOr[UserId]
    var Arn: js.UndefOr[ARN]
    var Username: js.UndefOr[AgentUsername]
  }

  object UserSummary {
    def apply(
      Id: js.UndefOr[UserId] = js.undefined,
      Arn: js.UndefOr[ARN] = js.undefined,
      Username: js.UndefOr[AgentUsername] = js.undefined): UserSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "Username" -> Username.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UserSummary]
    }
  }
}
