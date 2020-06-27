package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

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
  type Channels                        = js.Array[Channel]
  type ChatContent                     = String
  type ChatContentType                 = String
  type ClientToken                     = String
  type ContactFlowId                   = String
  type ContactFlowName                 = String
  type ContactFlowSummaryList          = js.Array[ContactFlowSummary]
  type ContactFlowTypes                = js.Array[ContactFlowType]
  type ContactId                       = String
  type CurrentMetricDataCollections    = js.Array[CurrentMetricData]
  type CurrentMetricResults            = js.Array[CurrentMetricResult]
  type CurrentMetrics                  = js.Array[CurrentMetric]
  type DirectoryUserId                 = String
  type DisplayName                     = String
  type Email                           = String
  type Groupings                       = js.Array[Grouping]
  type HierarchyGroupId                = String
  type HierarchyGroupName              = String
  type HierarchyGroupSummaryList       = js.Array[HierarchyGroupSummary]
  type HierarchyLevelId                = String
  type HierarchyLevelName              = String
  type HistoricalMetricDataCollections = js.Array[HistoricalMetricData]
  type HistoricalMetricResults         = js.Array[HistoricalMetricResult]
  type HistoricalMetrics               = js.Array[HistoricalMetric]
  type HoursOfOperationId              = String
  type HoursOfOperationName            = String
  type HoursOfOperationSummaryList     = js.Array[HoursOfOperationSummary]
  type InstanceId                      = String
  type MaxResult100                    = Int
  type MaxResult1000                   = Int
  type NextToken                       = String
  type ParticipantId                   = String
  type ParticipantToken                = String
  type Password                        = String
  type PhoneNumber                     = String
  type PhoneNumberCountryCodes         = js.Array[PhoneNumberCountryCode]
  type PhoneNumberId                   = String
  type PhoneNumberSummaryList          = js.Array[PhoneNumberSummary]
  type PhoneNumberTypes                = js.Array[PhoneNumberType]
  type QueueId                         = String
  type QueueName                       = String
  type QueueSummaryList                = js.Array[QueueSummary]
  type QueueTypes                      = js.Array[QueueType]
  type Queues                          = js.Array[QueueId]
  type RoutingProfileId                = String
  type RoutingProfileName              = String
  type RoutingProfileSummaryList       = js.Array[RoutingProfileSummary]
  type SecurityProfileId               = String
  type SecurityProfileIds              = js.Array[SecurityProfileId]
  type SecurityProfileName             = String
  type SecurityProfileSummaryList      = js.Array[SecurityProfileSummary]
  type SecurityToken                   = String
  type TagKey                          = String
  type TagKeyList                      = js.Array[TagKey]
  type TagMap                          = js.Dictionary[TagValue]
  type TagValue                        = String
  type ThresholdValue                  = Double
  type UserId                          = String
  type UserSummaryList                 = js.Array[UserSummary]
  type Value                           = Double
  type timestamp                       = js.Date

  implicit final class ConnectOps(private val service: Connect) extends AnyVal {

    @inline def createUserFuture(params: CreateUserRequest): Future[CreateUserResponse] =
      service.createUser(params).promise().toFuture
    @inline def deleteUserFuture(params: DeleteUserRequest): Future[js.Object] =
      service.deleteUser(params).promise().toFuture
    @inline def describeUserFuture(params: DescribeUserRequest): Future[DescribeUserResponse] =
      service.describeUser(params).promise().toFuture
    @inline def describeUserHierarchyGroupFuture(
        params: DescribeUserHierarchyGroupRequest
    ): Future[DescribeUserHierarchyGroupResponse] = service.describeUserHierarchyGroup(params).promise().toFuture
    @inline def describeUserHierarchyStructureFuture(
        params: DescribeUserHierarchyStructureRequest
    ): Future[DescribeUserHierarchyStructureResponse] =
      service.describeUserHierarchyStructure(params).promise().toFuture
    @inline def getContactAttributesFuture(params: GetContactAttributesRequest): Future[GetContactAttributesResponse] =
      service.getContactAttributes(params).promise().toFuture
    @inline def getCurrentMetricDataFuture(params: GetCurrentMetricDataRequest): Future[GetCurrentMetricDataResponse] =
      service.getCurrentMetricData(params).promise().toFuture
    @inline def getFederationTokenFuture(params: GetFederationTokenRequest): Future[GetFederationTokenResponse] =
      service.getFederationToken(params).promise().toFuture
    @inline def getMetricDataFuture(params: GetMetricDataRequest): Future[GetMetricDataResponse] =
      service.getMetricData(params).promise().toFuture
    @inline def listContactFlowsFuture(params: ListContactFlowsRequest): Future[ListContactFlowsResponse] =
      service.listContactFlows(params).promise().toFuture
    @inline def listHoursOfOperationsFuture(
        params: ListHoursOfOperationsRequest
    ): Future[ListHoursOfOperationsResponse] = service.listHoursOfOperations(params).promise().toFuture
    @inline def listPhoneNumbersFuture(params: ListPhoneNumbersRequest): Future[ListPhoneNumbersResponse] =
      service.listPhoneNumbers(params).promise().toFuture
    @inline def listQueuesFuture(params: ListQueuesRequest): Future[ListQueuesResponse] =
      service.listQueues(params).promise().toFuture
    @inline def listRoutingProfilesFuture(params: ListRoutingProfilesRequest): Future[ListRoutingProfilesResponse] =
      service.listRoutingProfiles(params).promise().toFuture
    @inline def listSecurityProfilesFuture(params: ListSecurityProfilesRequest): Future[ListSecurityProfilesResponse] =
      service.listSecurityProfiles(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise().toFuture
    @inline def listUserHierarchyGroupsFuture(
        params: ListUserHierarchyGroupsRequest
    ): Future[ListUserHierarchyGroupsResponse] = service.listUserHierarchyGroups(params).promise().toFuture
    @inline def listUsersFuture(params: ListUsersRequest): Future[ListUsersResponse] =
      service.listUsers(params).promise().toFuture
    @inline def startChatContactFuture(params: StartChatContactRequest): Future[StartChatContactResponse] =
      service.startChatContact(params).promise().toFuture
    @inline def startOutboundVoiceContactFuture(
        params: StartOutboundVoiceContactRequest
    ): Future[StartOutboundVoiceContactResponse] = service.startOutboundVoiceContact(params).promise().toFuture
    @inline def stopContactFuture(params: StopContactRequest): Future[StopContactResponse] =
      service.stopContact(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[js.Object] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[js.Object] =
      service.untagResource(params).promise().toFuture
    @inline def updateContactAttributesFuture(
        params: UpdateContactAttributesRequest
    ): Future[UpdateContactAttributesResponse] = service.updateContactAttributes(params).promise().toFuture
    @inline def updateUserHierarchyFuture(params: UpdateUserHierarchyRequest): Future[js.Object] =
      service.updateUserHierarchy(params).promise().toFuture
    @inline def updateUserIdentityInfoFuture(params: UpdateUserIdentityInfoRequest): Future[js.Object] =
      service.updateUserIdentityInfo(params).promise().toFuture
    @inline def updateUserPhoneConfigFuture(params: UpdateUserPhoneConfigRequest): Future[js.Object] =
      service.updateUserPhoneConfig(params).promise().toFuture
    @inline def updateUserRoutingProfileFuture(params: UpdateUserRoutingProfileRequest): Future[js.Object] =
      service.updateUserRoutingProfile(params).promise().toFuture
    @inline def updateUserSecurityProfilesFuture(params: UpdateUserSecurityProfilesRequest): Future[js.Object] =
      service.updateUserSecurityProfiles(params).promise().toFuture
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
    ): Request[DescribeUserHierarchyStructureResponse]                                                      = js.native
    def getContactAttributes(params: GetContactAttributesRequest): Request[GetContactAttributesResponse]    = js.native
    def getCurrentMetricData(params: GetCurrentMetricDataRequest): Request[GetCurrentMetricDataResponse]    = js.native
    def getFederationToken(params: GetFederationTokenRequest): Request[GetFederationTokenResponse]          = js.native
    def getMetricData(params: GetMetricDataRequest): Request[GetMetricDataResponse]                         = js.native
    def listContactFlows(params: ListContactFlowsRequest): Request[ListContactFlowsResponse]                = js.native
    def listHoursOfOperations(params: ListHoursOfOperationsRequest): Request[ListHoursOfOperationsResponse] = js.native
    def listPhoneNumbers(params: ListPhoneNumbersRequest): Request[ListPhoneNumbersResponse]                = js.native
    def listQueues(params: ListQueuesRequest): Request[ListQueuesResponse]                                  = js.native
    def listRoutingProfiles(params: ListRoutingProfilesRequest): Request[ListRoutingProfilesResponse]       = js.native
    def listSecurityProfiles(params: ListSecurityProfilesRequest): Request[ListSecurityProfilesResponse]    = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse]       = js.native
    def listUserHierarchyGroups(params: ListUserHierarchyGroupsRequest): Request[ListUserHierarchyGroupsResponse] =
      js.native
    def listUsers(params: ListUsersRequest): Request[ListUsersResponse]                      = js.native
    def startChatContact(params: StartChatContactRequest): Request[StartChatContactResponse] = js.native
    def startOutboundVoiceContact(
        params: StartOutboundVoiceContactRequest
    ): Request[StartOutboundVoiceContactResponse]                             = js.native
    def stopContact(params: StopContactRequest): Request[StopContactResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[js.Object]           = js.native
    def untagResource(params: UntagResourceRequest): Request[js.Object]       = js.native
    def updateContactAttributes(params: UpdateContactAttributesRequest): Request[UpdateContactAttributesResponse] =
      js.native
    def updateUserHierarchy(params: UpdateUserHierarchyRequest): Request[js.Object]               = js.native
    def updateUserIdentityInfo(params: UpdateUserIdentityInfoRequest): Request[js.Object]         = js.native
    def updateUserPhoneConfig(params: UpdateUserPhoneConfigRequest): Request[js.Object]           = js.native
    def updateUserRoutingProfile(params: UpdateUserRoutingProfileRequest): Request[js.Object]     = js.native
    def updateUserSecurityProfiles(params: UpdateUserSecurityProfilesRequest): Request[js.Object] = js.native
  }

  @js.native
  sealed trait Channel extends js.Any
  object Channel extends js.Object {
    val VOICE = "VOICE".asInstanceOf[Channel]
    val CHAT  = "CHAT".asInstanceOf[Channel]

    val values = js.Object.freeze(js.Array(VOICE, CHAT))
  }

  /**
    * A chat message.
    */
  @js.native
  @Factory
  trait ChatMessage extends js.Object {
    var Content: ChatContent
    var ContentType: ChatContentType
  }

  @js.native
  sealed trait Comparison extends js.Any
  object Comparison extends js.Object {
    val LT = "LT".asInstanceOf[Comparison]

    val values = js.Object.freeze(js.Array(LT))
  }

  /**
    * Contains summary information about a contact flow.
    */
  @js.native
  @Factory
  trait ContactFlowSummary extends js.Object {
    var Arn: js.UndefOr[ARN]
    var ContactFlowType: js.UndefOr[ContactFlowType]
    var Id: js.UndefOr[ContactFlowId]
    var Name: js.UndefOr[ContactFlowName]
  }

  @js.native
  sealed trait ContactFlowType extends js.Any
  object ContactFlowType extends js.Object {
    val CONTACT_FLOW     = "CONTACT_FLOW".asInstanceOf[ContactFlowType]
    val CUSTOMER_QUEUE   = "CUSTOMER_QUEUE".asInstanceOf[ContactFlowType]
    val CUSTOMER_HOLD    = "CUSTOMER_HOLD".asInstanceOf[ContactFlowType]
    val CUSTOMER_WHISPER = "CUSTOMER_WHISPER".asInstanceOf[ContactFlowType]
    val AGENT_HOLD       = "AGENT_HOLD".asInstanceOf[ContactFlowType]
    val AGENT_WHISPER    = "AGENT_WHISPER".asInstanceOf[ContactFlowType]
    val OUTBOUND_WHISPER = "OUTBOUND_WHISPER".asInstanceOf[ContactFlowType]
    val AGENT_TRANSFER   = "AGENT_TRANSFER".asInstanceOf[ContactFlowType]
    val QUEUE_TRANSFER   = "QUEUE_TRANSFER".asInstanceOf[ContactFlowType]

    val values = js.Object.freeze(
      js.Array(
        CONTACT_FLOW,
        CUSTOMER_QUEUE,
        CUSTOMER_HOLD,
        CUSTOMER_WHISPER,
        AGENT_HOLD,
        AGENT_WHISPER,
        OUTBOUND_WHISPER,
        AGENT_TRANSFER,
        QUEUE_TRANSFER
      )
    )
  }

  @js.native
  @Factory
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
    var Tags: js.UndefOr[TagMap]
  }

  @js.native
  @Factory
  trait CreateUserResponse extends js.Object {
    var UserArn: js.UndefOr[ARN]
    var UserId: js.UndefOr[UserId]
  }

  /**
    * Contains credentials to use for federation.
    */
  @js.native
  @Factory
  trait Credentials extends js.Object {
    var AccessToken: js.UndefOr[SecurityToken]
    var AccessTokenExpiration: js.UndefOr[timestamp]
    var RefreshToken: js.UndefOr[SecurityToken]
    var RefreshTokenExpiration: js.UndefOr[timestamp]
  }

  /**
    * Contains information about a real-time metric.
    */
  @js.native
  @Factory
  trait CurrentMetric extends js.Object {
    var Name: js.UndefOr[CurrentMetricName]
    var Unit: js.UndefOr[Unit]
  }

  /**
    * Contains the data for a real-time metric.
    */
  @js.native
  @Factory
  trait CurrentMetricData extends js.Object {
    var Metric: js.UndefOr[CurrentMetric]
    var Value: js.UndefOr[Value]
  }

  /**
    * The current metric names.
    */
  @js.native
  sealed trait CurrentMetricName extends js.Any
  object CurrentMetricName extends js.Object {
    val AGENTS_ONLINE             = "AGENTS_ONLINE".asInstanceOf[CurrentMetricName]
    val AGENTS_AVAILABLE          = "AGENTS_AVAILABLE".asInstanceOf[CurrentMetricName]
    val AGENTS_ON_CALL            = "AGENTS_ON_CALL".asInstanceOf[CurrentMetricName]
    val AGENTS_NON_PRODUCTIVE     = "AGENTS_NON_PRODUCTIVE".asInstanceOf[CurrentMetricName]
    val AGENTS_AFTER_CONTACT_WORK = "AGENTS_AFTER_CONTACT_WORK".asInstanceOf[CurrentMetricName]
    val AGENTS_ERROR              = "AGENTS_ERROR".asInstanceOf[CurrentMetricName]
    val AGENTS_STAFFED            = "AGENTS_STAFFED".asInstanceOf[CurrentMetricName]
    val CONTACTS_IN_QUEUE         = "CONTACTS_IN_QUEUE".asInstanceOf[CurrentMetricName]
    val OLDEST_CONTACT_AGE        = "OLDEST_CONTACT_AGE".asInstanceOf[CurrentMetricName]
    val CONTACTS_SCHEDULED        = "CONTACTS_SCHEDULED".asInstanceOf[CurrentMetricName]
    val AGENTS_ON_CONTACT         = "AGENTS_ON_CONTACT".asInstanceOf[CurrentMetricName]
    val SLOTS_ACTIVE              = "SLOTS_ACTIVE".asInstanceOf[CurrentMetricName]
    val SLOTS_AVAILABLE           = "SLOTS_AVAILABLE".asInstanceOf[CurrentMetricName]

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
        CONTACTS_SCHEDULED,
        AGENTS_ON_CONTACT,
        SLOTS_ACTIVE,
        SLOTS_AVAILABLE
      )
    )
  }

  /**
    * Contains information about a set of real-time metrics.
    */
  @js.native
  @Factory
  trait CurrentMetricResult extends js.Object {
    var Collections: js.UndefOr[CurrentMetricDataCollections]
    var Dimensions: js.UndefOr[Dimensions]
  }

  @js.native
  @Factory
  trait DeleteUserRequest extends js.Object {
    var InstanceId: InstanceId
    var UserId: UserId
  }

  @js.native
  @Factory
  trait DescribeUserHierarchyGroupRequest extends js.Object {
    var HierarchyGroupId: HierarchyGroupId
    var InstanceId: InstanceId
  }

  @js.native
  @Factory
  trait DescribeUserHierarchyGroupResponse extends js.Object {
    var HierarchyGroup: js.UndefOr[HierarchyGroup]
  }

  @js.native
  @Factory
  trait DescribeUserHierarchyStructureRequest extends js.Object {
    var InstanceId: InstanceId
  }

  @js.native
  @Factory
  trait DescribeUserHierarchyStructureResponse extends js.Object {
    var HierarchyStructure: js.UndefOr[HierarchyStructure]
  }

  @js.native
  @Factory
  trait DescribeUserRequest extends js.Object {
    var InstanceId: InstanceId
    var UserId: UserId
  }

  @js.native
  @Factory
  trait DescribeUserResponse extends js.Object {
    var User: js.UndefOr[User]
  }

  /**
    * Contains information about the dimensions for a set of metrics.
    */
  @js.native
  @Factory
  trait Dimensions extends js.Object {
    var Channel: js.UndefOr[Channel]
    var Queue: js.UndefOr[QueueReference]
  }

  /**
    * Contains the filter to apply when retrieving metrics.
    */
  @js.native
  @Factory
  trait Filters extends js.Object {
    var Channels: js.UndefOr[Channels]
    var Queues: js.UndefOr[Queues]
  }

  @js.native
  @Factory
  trait GetContactAttributesRequest extends js.Object {
    var InitialContactId: ContactId
    var InstanceId: InstanceId
  }

  @js.native
  @Factory
  trait GetContactAttributesResponse extends js.Object {
    var Attributes: js.UndefOr[Attributes]
  }

  @js.native
  @Factory
  trait GetCurrentMetricDataRequest extends js.Object {
    var CurrentMetrics: CurrentMetrics
    var Filters: Filters
    var InstanceId: InstanceId
    var Groupings: js.UndefOr[Groupings]
    var MaxResults: js.UndefOr[MaxResult100]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait GetCurrentMetricDataResponse extends js.Object {
    var DataSnapshotTime: js.UndefOr[timestamp]
    var MetricResults: js.UndefOr[CurrentMetricResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait GetFederationTokenRequest extends js.Object {
    var InstanceId: InstanceId
  }

  @js.native
  @Factory
  trait GetFederationTokenResponse extends js.Object {
    var Credentials: js.UndefOr[Credentials]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait GetMetricDataResponse extends js.Object {
    var MetricResults: js.UndefOr[HistoricalMetricResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  sealed trait Grouping extends js.Any
  object Grouping extends js.Object {
    val QUEUE   = "QUEUE".asInstanceOf[Grouping]
    val CHANNEL = "CHANNEL".asInstanceOf[Grouping]

    val values = js.Object.freeze(js.Array(QUEUE, CHANNEL))
  }

  /**
    * Contains information about a hierarchy group.
    */
  @js.native
  @Factory
  trait HierarchyGroup extends js.Object {
    var Arn: js.UndefOr[ARN]
    var HierarchyPath: js.UndefOr[HierarchyPath]
    var Id: js.UndefOr[HierarchyGroupId]
    var LevelId: js.UndefOr[HierarchyLevelId]
    var Name: js.UndefOr[HierarchyGroupName]
  }

  /**
    * Contains summary information about a hierarchy group.
    */
  @js.native
  @Factory
  trait HierarchyGroupSummary extends js.Object {
    var Arn: js.UndefOr[ARN]
    var Id: js.UndefOr[HierarchyGroupId]
    var Name: js.UndefOr[HierarchyGroupName]
  }

  /**
    * Contains information about a hierarchy level.
    */
  @js.native
  @Factory
  trait HierarchyLevel extends js.Object {
    var Arn: js.UndefOr[ARN]
    var Id: js.UndefOr[HierarchyLevelId]
    var Name: js.UndefOr[HierarchyLevelName]
  }

  /**
    * Contains information about the levels of a hierarchy group.
    */
  @js.native
  @Factory
  trait HierarchyPath extends js.Object {
    var LevelFive: js.UndefOr[HierarchyGroupSummary]
    var LevelFour: js.UndefOr[HierarchyGroupSummary]
    var LevelOne: js.UndefOr[HierarchyGroupSummary]
    var LevelThree: js.UndefOr[HierarchyGroupSummary]
    var LevelTwo: js.UndefOr[HierarchyGroupSummary]
  }

  /**
    * Contains information about a hierarchy structure.
    */
  @js.native
  @Factory
  trait HierarchyStructure extends js.Object {
    var LevelFive: js.UndefOr[HierarchyLevel]
    var LevelFour: js.UndefOr[HierarchyLevel]
    var LevelOne: js.UndefOr[HierarchyLevel]
    var LevelThree: js.UndefOr[HierarchyLevel]
    var LevelTwo: js.UndefOr[HierarchyLevel]
  }

  /**
    * Contains information about a historical metric.
    */
  @js.native
  @Factory
  trait HistoricalMetric extends js.Object {
    var Name: js.UndefOr[HistoricalMetricName]
    var Statistic: js.UndefOr[Statistic]
    var Threshold: js.UndefOr[Threshold]
    var Unit: js.UndefOr[Unit]
  }

  /**
    * Contains the data for a historical metric.
    */
  @js.native
  @Factory
  trait HistoricalMetricData extends js.Object {
    var Metric: js.UndefOr[HistoricalMetric]
    var Value: js.UndefOr[Value]
  }

  /**
    * The historical metric names.
    */
  @js.native
  sealed trait HistoricalMetricName extends js.Any
  object HistoricalMetricName extends js.Object {
    val CONTACTS_QUEUED                     = "CONTACTS_QUEUED".asInstanceOf[HistoricalMetricName]
    val CONTACTS_HANDLED                    = "CONTACTS_HANDLED".asInstanceOf[HistoricalMetricName]
    val CONTACTS_ABANDONED                  = "CONTACTS_ABANDONED".asInstanceOf[HistoricalMetricName]
    val CONTACTS_CONSULTED                  = "CONTACTS_CONSULTED".asInstanceOf[HistoricalMetricName]
    val CONTACTS_AGENT_HUNG_UP_FIRST        = "CONTACTS_AGENT_HUNG_UP_FIRST".asInstanceOf[HistoricalMetricName]
    val CONTACTS_HANDLED_INCOMING           = "CONTACTS_HANDLED_INCOMING".asInstanceOf[HistoricalMetricName]
    val CONTACTS_HANDLED_OUTBOUND           = "CONTACTS_HANDLED_OUTBOUND".asInstanceOf[HistoricalMetricName]
    val CONTACTS_HOLD_ABANDONS              = "CONTACTS_HOLD_ABANDONS".asInstanceOf[HistoricalMetricName]
    val CONTACTS_TRANSFERRED_IN             = "CONTACTS_TRANSFERRED_IN".asInstanceOf[HistoricalMetricName]
    val CONTACTS_TRANSFERRED_OUT            = "CONTACTS_TRANSFERRED_OUT".asInstanceOf[HistoricalMetricName]
    val CONTACTS_TRANSFERRED_IN_FROM_QUEUE  = "CONTACTS_TRANSFERRED_IN_FROM_QUEUE".asInstanceOf[HistoricalMetricName]
    val CONTACTS_TRANSFERRED_OUT_FROM_QUEUE = "CONTACTS_TRANSFERRED_OUT_FROM_QUEUE".asInstanceOf[HistoricalMetricName]
    val CONTACTS_MISSED                     = "CONTACTS_MISSED".asInstanceOf[HistoricalMetricName]
    val CALLBACK_CONTACTS_HANDLED           = "CALLBACK_CONTACTS_HANDLED".asInstanceOf[HistoricalMetricName]
    val API_CONTACTS_HANDLED                = "API_CONTACTS_HANDLED".asInstanceOf[HistoricalMetricName]
    val OCCUPANCY                           = "OCCUPANCY".asInstanceOf[HistoricalMetricName]
    val HANDLE_TIME                         = "HANDLE_TIME".asInstanceOf[HistoricalMetricName]
    val AFTER_CONTACT_WORK_TIME             = "AFTER_CONTACT_WORK_TIME".asInstanceOf[HistoricalMetricName]
    val QUEUED_TIME                         = "QUEUED_TIME".asInstanceOf[HistoricalMetricName]
    val ABANDON_TIME                        = "ABANDON_TIME".asInstanceOf[HistoricalMetricName]
    val QUEUE_ANSWER_TIME                   = "QUEUE_ANSWER_TIME".asInstanceOf[HistoricalMetricName]
    val HOLD_TIME                           = "HOLD_TIME".asInstanceOf[HistoricalMetricName]
    val INTERACTION_TIME                    = "INTERACTION_TIME".asInstanceOf[HistoricalMetricName]
    val INTERACTION_AND_HOLD_TIME           = "INTERACTION_AND_HOLD_TIME".asInstanceOf[HistoricalMetricName]
    val SERVICE_LEVEL                       = "SERVICE_LEVEL".asInstanceOf[HistoricalMetricName]

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
    * Contains information about the historical metrics retrieved.
    */
  @js.native
  @Factory
  trait HistoricalMetricResult extends js.Object {
    var Collections: js.UndefOr[HistoricalMetricDataCollections]
    var Dimensions: js.UndefOr[Dimensions]
  }

  /**
    * Contains summary information about hours of operation for a contact center.
    */
  @js.native
  @Factory
  trait HoursOfOperationSummary extends js.Object {
    var Arn: js.UndefOr[ARN]
    var Id: js.UndefOr[HoursOfOperationId]
    var Name: js.UndefOr[HoursOfOperationName]
  }

  @js.native
  @Factory
  trait ListContactFlowsRequest extends js.Object {
    var InstanceId: InstanceId
    var ContactFlowTypes: js.UndefOr[ContactFlowTypes]
    var MaxResults: js.UndefOr[MaxResult1000]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListContactFlowsResponse extends js.Object {
    var ContactFlowSummaryList: js.UndefOr[ContactFlowSummaryList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListHoursOfOperationsRequest extends js.Object {
    var InstanceId: InstanceId
    var MaxResults: js.UndefOr[MaxResult1000]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListHoursOfOperationsResponse extends js.Object {
    var HoursOfOperationSummaryList: js.UndefOr[HoursOfOperationSummaryList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListPhoneNumbersRequest extends js.Object {
    var InstanceId: InstanceId
    var MaxResults: js.UndefOr[MaxResult1000]
    var NextToken: js.UndefOr[NextToken]
    var PhoneNumberCountryCodes: js.UndefOr[PhoneNumberCountryCodes]
    var PhoneNumberTypes: js.UndefOr[PhoneNumberTypes]
  }

  @js.native
  @Factory
  trait ListPhoneNumbersResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var PhoneNumberSummaryList: js.UndefOr[PhoneNumberSummaryList]
  }

  @js.native
  @Factory
  trait ListQueuesRequest extends js.Object {
    var InstanceId: InstanceId
    var MaxResults: js.UndefOr[MaxResult1000]
    var NextToken: js.UndefOr[NextToken]
    var QueueTypes: js.UndefOr[QueueTypes]
  }

  @js.native
  @Factory
  trait ListQueuesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var QueueSummaryList: js.UndefOr[QueueSummaryList]
  }

  @js.native
  @Factory
  trait ListRoutingProfilesRequest extends js.Object {
    var InstanceId: InstanceId
    var MaxResults: js.UndefOr[MaxResult1000]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListRoutingProfilesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var RoutingProfileSummaryList: js.UndefOr[RoutingProfileSummaryList]
  }

  @js.native
  @Factory
  trait ListSecurityProfilesRequest extends js.Object {
    var InstanceId: InstanceId
    var MaxResults: js.UndefOr[MaxResult1000]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListSecurityProfilesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var SecurityProfileSummaryList: js.UndefOr[SecurityProfileSummaryList]
  }

  @js.native
  @Factory
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: ARN
  }

  @js.native
  @Factory
  trait ListTagsForResourceResponse extends js.Object {
    var tags: js.UndefOr[TagMap]
  }

  @js.native
  @Factory
  trait ListUserHierarchyGroupsRequest extends js.Object {
    var InstanceId: InstanceId
    var MaxResults: js.UndefOr[MaxResult1000]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListUserHierarchyGroupsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var UserHierarchyGroupSummaryList: js.UndefOr[HierarchyGroupSummaryList]
  }

  @js.native
  @Factory
  trait ListUsersRequest extends js.Object {
    var InstanceId: InstanceId
    var MaxResults: js.UndefOr[MaxResult1000]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListUsersResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var UserSummaryList: js.UndefOr[UserSummaryList]
  }

  /**
    * The customer's details.
    */
  @js.native
  @Factory
  trait ParticipantDetails extends js.Object {
    var DisplayName: DisplayName
  }

  @js.native
  sealed trait PhoneNumberCountryCode extends js.Any
  object PhoneNumberCountryCode extends js.Object {
    val AF = "AF".asInstanceOf[PhoneNumberCountryCode]
    val AL = "AL".asInstanceOf[PhoneNumberCountryCode]
    val DZ = "DZ".asInstanceOf[PhoneNumberCountryCode]
    val AS = "AS".asInstanceOf[PhoneNumberCountryCode]
    val AD = "AD".asInstanceOf[PhoneNumberCountryCode]
    val AO = "AO".asInstanceOf[PhoneNumberCountryCode]
    val AI = "AI".asInstanceOf[PhoneNumberCountryCode]
    val AQ = "AQ".asInstanceOf[PhoneNumberCountryCode]
    val AG = "AG".asInstanceOf[PhoneNumberCountryCode]
    val AR = "AR".asInstanceOf[PhoneNumberCountryCode]
    val AM = "AM".asInstanceOf[PhoneNumberCountryCode]
    val AW = "AW".asInstanceOf[PhoneNumberCountryCode]
    val AU = "AU".asInstanceOf[PhoneNumberCountryCode]
    val AT = "AT".asInstanceOf[PhoneNumberCountryCode]
    val AZ = "AZ".asInstanceOf[PhoneNumberCountryCode]
    val BS = "BS".asInstanceOf[PhoneNumberCountryCode]
    val BH = "BH".asInstanceOf[PhoneNumberCountryCode]
    val BD = "BD".asInstanceOf[PhoneNumberCountryCode]
    val BB = "BB".asInstanceOf[PhoneNumberCountryCode]
    val BY = "BY".asInstanceOf[PhoneNumberCountryCode]
    val BE = "BE".asInstanceOf[PhoneNumberCountryCode]
    val BZ = "BZ".asInstanceOf[PhoneNumberCountryCode]
    val BJ = "BJ".asInstanceOf[PhoneNumberCountryCode]
    val BM = "BM".asInstanceOf[PhoneNumberCountryCode]
    val BT = "BT".asInstanceOf[PhoneNumberCountryCode]
    val BO = "BO".asInstanceOf[PhoneNumberCountryCode]
    val BA = "BA".asInstanceOf[PhoneNumberCountryCode]
    val BW = "BW".asInstanceOf[PhoneNumberCountryCode]
    val BR = "BR".asInstanceOf[PhoneNumberCountryCode]
    val IO = "IO".asInstanceOf[PhoneNumberCountryCode]
    val VG = "VG".asInstanceOf[PhoneNumberCountryCode]
    val BN = "BN".asInstanceOf[PhoneNumberCountryCode]
    val BG = "BG".asInstanceOf[PhoneNumberCountryCode]
    val BF = "BF".asInstanceOf[PhoneNumberCountryCode]
    val BI = "BI".asInstanceOf[PhoneNumberCountryCode]
    val KH = "KH".asInstanceOf[PhoneNumberCountryCode]
    val CM = "CM".asInstanceOf[PhoneNumberCountryCode]
    val CA = "CA".asInstanceOf[PhoneNumberCountryCode]
    val CV = "CV".asInstanceOf[PhoneNumberCountryCode]
    val KY = "KY".asInstanceOf[PhoneNumberCountryCode]
    val CF = "CF".asInstanceOf[PhoneNumberCountryCode]
    val TD = "TD".asInstanceOf[PhoneNumberCountryCode]
    val CL = "CL".asInstanceOf[PhoneNumberCountryCode]
    val CN = "CN".asInstanceOf[PhoneNumberCountryCode]
    val CX = "CX".asInstanceOf[PhoneNumberCountryCode]
    val CC = "CC".asInstanceOf[PhoneNumberCountryCode]
    val CO = "CO".asInstanceOf[PhoneNumberCountryCode]
    val KM = "KM".asInstanceOf[PhoneNumberCountryCode]
    val CK = "CK".asInstanceOf[PhoneNumberCountryCode]
    val CR = "CR".asInstanceOf[PhoneNumberCountryCode]
    val HR = "HR".asInstanceOf[PhoneNumberCountryCode]
    val CU = "CU".asInstanceOf[PhoneNumberCountryCode]
    val CW = "CW".asInstanceOf[PhoneNumberCountryCode]
    val CY = "CY".asInstanceOf[PhoneNumberCountryCode]
    val CZ = "CZ".asInstanceOf[PhoneNumberCountryCode]
    val CD = "CD".asInstanceOf[PhoneNumberCountryCode]
    val DK = "DK".asInstanceOf[PhoneNumberCountryCode]
    val DJ = "DJ".asInstanceOf[PhoneNumberCountryCode]
    val DM = "DM".asInstanceOf[PhoneNumberCountryCode]
    val DO = "DO".asInstanceOf[PhoneNumberCountryCode]
    val TL = "TL".asInstanceOf[PhoneNumberCountryCode]
    val EC = "EC".asInstanceOf[PhoneNumberCountryCode]
    val EG = "EG".asInstanceOf[PhoneNumberCountryCode]
    val SV = "SV".asInstanceOf[PhoneNumberCountryCode]
    val GQ = "GQ".asInstanceOf[PhoneNumberCountryCode]
    val ER = "ER".asInstanceOf[PhoneNumberCountryCode]
    val EE = "EE".asInstanceOf[PhoneNumberCountryCode]
    val ET = "ET".asInstanceOf[PhoneNumberCountryCode]
    val FK = "FK".asInstanceOf[PhoneNumberCountryCode]
    val FO = "FO".asInstanceOf[PhoneNumberCountryCode]
    val FJ = "FJ".asInstanceOf[PhoneNumberCountryCode]
    val FI = "FI".asInstanceOf[PhoneNumberCountryCode]
    val FR = "FR".asInstanceOf[PhoneNumberCountryCode]
    val PF = "PF".asInstanceOf[PhoneNumberCountryCode]
    val GA = "GA".asInstanceOf[PhoneNumberCountryCode]
    val GM = "GM".asInstanceOf[PhoneNumberCountryCode]
    val GE = "GE".asInstanceOf[PhoneNumberCountryCode]
    val DE = "DE".asInstanceOf[PhoneNumberCountryCode]
    val GH = "GH".asInstanceOf[PhoneNumberCountryCode]
    val GI = "GI".asInstanceOf[PhoneNumberCountryCode]
    val GR = "GR".asInstanceOf[PhoneNumberCountryCode]
    val GL = "GL".asInstanceOf[PhoneNumberCountryCode]
    val GD = "GD".asInstanceOf[PhoneNumberCountryCode]
    val GU = "GU".asInstanceOf[PhoneNumberCountryCode]
    val GT = "GT".asInstanceOf[PhoneNumberCountryCode]
    val GG = "GG".asInstanceOf[PhoneNumberCountryCode]
    val GN = "GN".asInstanceOf[PhoneNumberCountryCode]
    val GW = "GW".asInstanceOf[PhoneNumberCountryCode]
    val GY = "GY".asInstanceOf[PhoneNumberCountryCode]
    val HT = "HT".asInstanceOf[PhoneNumberCountryCode]
    val HN = "HN".asInstanceOf[PhoneNumberCountryCode]
    val HK = "HK".asInstanceOf[PhoneNumberCountryCode]
    val HU = "HU".asInstanceOf[PhoneNumberCountryCode]
    val IS = "IS".asInstanceOf[PhoneNumberCountryCode]
    val IN = "IN".asInstanceOf[PhoneNumberCountryCode]
    val ID = "ID".asInstanceOf[PhoneNumberCountryCode]
    val IR = "IR".asInstanceOf[PhoneNumberCountryCode]
    val IQ = "IQ".asInstanceOf[PhoneNumberCountryCode]
    val IE = "IE".asInstanceOf[PhoneNumberCountryCode]
    val IM = "IM".asInstanceOf[PhoneNumberCountryCode]
    val IL = "IL".asInstanceOf[PhoneNumberCountryCode]
    val IT = "IT".asInstanceOf[PhoneNumberCountryCode]
    val CI = "CI".asInstanceOf[PhoneNumberCountryCode]
    val JM = "JM".asInstanceOf[PhoneNumberCountryCode]
    val JP = "JP".asInstanceOf[PhoneNumberCountryCode]
    val JE = "JE".asInstanceOf[PhoneNumberCountryCode]
    val JO = "JO".asInstanceOf[PhoneNumberCountryCode]
    val KZ = "KZ".asInstanceOf[PhoneNumberCountryCode]
    val KE = "KE".asInstanceOf[PhoneNumberCountryCode]
    val KI = "KI".asInstanceOf[PhoneNumberCountryCode]
    val KW = "KW".asInstanceOf[PhoneNumberCountryCode]
    val KG = "KG".asInstanceOf[PhoneNumberCountryCode]
    val LA = "LA".asInstanceOf[PhoneNumberCountryCode]
    val LV = "LV".asInstanceOf[PhoneNumberCountryCode]
    val LB = "LB".asInstanceOf[PhoneNumberCountryCode]
    val LS = "LS".asInstanceOf[PhoneNumberCountryCode]
    val LR = "LR".asInstanceOf[PhoneNumberCountryCode]
    val LY = "LY".asInstanceOf[PhoneNumberCountryCode]
    val LI = "LI".asInstanceOf[PhoneNumberCountryCode]
    val LT = "LT".asInstanceOf[PhoneNumberCountryCode]
    val LU = "LU".asInstanceOf[PhoneNumberCountryCode]
    val MO = "MO".asInstanceOf[PhoneNumberCountryCode]
    val MK = "MK".asInstanceOf[PhoneNumberCountryCode]
    val MG = "MG".asInstanceOf[PhoneNumberCountryCode]
    val MW = "MW".asInstanceOf[PhoneNumberCountryCode]
    val MY = "MY".asInstanceOf[PhoneNumberCountryCode]
    val MV = "MV".asInstanceOf[PhoneNumberCountryCode]
    val ML = "ML".asInstanceOf[PhoneNumberCountryCode]
    val MT = "MT".asInstanceOf[PhoneNumberCountryCode]
    val MH = "MH".asInstanceOf[PhoneNumberCountryCode]
    val MR = "MR".asInstanceOf[PhoneNumberCountryCode]
    val MU = "MU".asInstanceOf[PhoneNumberCountryCode]
    val YT = "YT".asInstanceOf[PhoneNumberCountryCode]
    val MX = "MX".asInstanceOf[PhoneNumberCountryCode]
    val FM = "FM".asInstanceOf[PhoneNumberCountryCode]
    val MD = "MD".asInstanceOf[PhoneNumberCountryCode]
    val MC = "MC".asInstanceOf[PhoneNumberCountryCode]
    val MN = "MN".asInstanceOf[PhoneNumberCountryCode]
    val ME = "ME".asInstanceOf[PhoneNumberCountryCode]
    val MS = "MS".asInstanceOf[PhoneNumberCountryCode]
    val MA = "MA".asInstanceOf[PhoneNumberCountryCode]
    val MZ = "MZ".asInstanceOf[PhoneNumberCountryCode]
    val MM = "MM".asInstanceOf[PhoneNumberCountryCode]
    val NA = "NA".asInstanceOf[PhoneNumberCountryCode]
    val NR = "NR".asInstanceOf[PhoneNumberCountryCode]
    val NP = "NP".asInstanceOf[PhoneNumberCountryCode]
    val NL = "NL".asInstanceOf[PhoneNumberCountryCode]
    val AN = "AN".asInstanceOf[PhoneNumberCountryCode]
    val NC = "NC".asInstanceOf[PhoneNumberCountryCode]
    val NZ = "NZ".asInstanceOf[PhoneNumberCountryCode]
    val NI = "NI".asInstanceOf[PhoneNumberCountryCode]
    val NE = "NE".asInstanceOf[PhoneNumberCountryCode]
    val NG = "NG".asInstanceOf[PhoneNumberCountryCode]
    val NU = "NU".asInstanceOf[PhoneNumberCountryCode]
    val KP = "KP".asInstanceOf[PhoneNumberCountryCode]
    val MP = "MP".asInstanceOf[PhoneNumberCountryCode]
    val NO = "NO".asInstanceOf[PhoneNumberCountryCode]
    val OM = "OM".asInstanceOf[PhoneNumberCountryCode]
    val PK = "PK".asInstanceOf[PhoneNumberCountryCode]
    val PW = "PW".asInstanceOf[PhoneNumberCountryCode]
    val PA = "PA".asInstanceOf[PhoneNumberCountryCode]
    val PG = "PG".asInstanceOf[PhoneNumberCountryCode]
    val PY = "PY".asInstanceOf[PhoneNumberCountryCode]
    val PE = "PE".asInstanceOf[PhoneNumberCountryCode]
    val PH = "PH".asInstanceOf[PhoneNumberCountryCode]
    val PN = "PN".asInstanceOf[PhoneNumberCountryCode]
    val PL = "PL".asInstanceOf[PhoneNumberCountryCode]
    val PT = "PT".asInstanceOf[PhoneNumberCountryCode]
    val PR = "PR".asInstanceOf[PhoneNumberCountryCode]
    val QA = "QA".asInstanceOf[PhoneNumberCountryCode]
    val CG = "CG".asInstanceOf[PhoneNumberCountryCode]
    val RE = "RE".asInstanceOf[PhoneNumberCountryCode]
    val RO = "RO".asInstanceOf[PhoneNumberCountryCode]
    val RU = "RU".asInstanceOf[PhoneNumberCountryCode]
    val RW = "RW".asInstanceOf[PhoneNumberCountryCode]
    val BL = "BL".asInstanceOf[PhoneNumberCountryCode]
    val SH = "SH".asInstanceOf[PhoneNumberCountryCode]
    val KN = "KN".asInstanceOf[PhoneNumberCountryCode]
    val LC = "LC".asInstanceOf[PhoneNumberCountryCode]
    val MF = "MF".asInstanceOf[PhoneNumberCountryCode]
    val PM = "PM".asInstanceOf[PhoneNumberCountryCode]
    val VC = "VC".asInstanceOf[PhoneNumberCountryCode]
    val WS = "WS".asInstanceOf[PhoneNumberCountryCode]
    val SM = "SM".asInstanceOf[PhoneNumberCountryCode]
    val ST = "ST".asInstanceOf[PhoneNumberCountryCode]
    val SA = "SA".asInstanceOf[PhoneNumberCountryCode]
    val SN = "SN".asInstanceOf[PhoneNumberCountryCode]
    val RS = "RS".asInstanceOf[PhoneNumberCountryCode]
    val SC = "SC".asInstanceOf[PhoneNumberCountryCode]
    val SL = "SL".asInstanceOf[PhoneNumberCountryCode]
    val SG = "SG".asInstanceOf[PhoneNumberCountryCode]
    val SX = "SX".asInstanceOf[PhoneNumberCountryCode]
    val SK = "SK".asInstanceOf[PhoneNumberCountryCode]
    val SI = "SI".asInstanceOf[PhoneNumberCountryCode]
    val SB = "SB".asInstanceOf[PhoneNumberCountryCode]
    val SO = "SO".asInstanceOf[PhoneNumberCountryCode]
    val ZA = "ZA".asInstanceOf[PhoneNumberCountryCode]
    val KR = "KR".asInstanceOf[PhoneNumberCountryCode]
    val ES = "ES".asInstanceOf[PhoneNumberCountryCode]
    val LK = "LK".asInstanceOf[PhoneNumberCountryCode]
    val SD = "SD".asInstanceOf[PhoneNumberCountryCode]
    val SR = "SR".asInstanceOf[PhoneNumberCountryCode]
    val SJ = "SJ".asInstanceOf[PhoneNumberCountryCode]
    val SZ = "SZ".asInstanceOf[PhoneNumberCountryCode]
    val SE = "SE".asInstanceOf[PhoneNumberCountryCode]
    val CH = "CH".asInstanceOf[PhoneNumberCountryCode]
    val SY = "SY".asInstanceOf[PhoneNumberCountryCode]
    val TW = "TW".asInstanceOf[PhoneNumberCountryCode]
    val TJ = "TJ".asInstanceOf[PhoneNumberCountryCode]
    val TZ = "TZ".asInstanceOf[PhoneNumberCountryCode]
    val TH = "TH".asInstanceOf[PhoneNumberCountryCode]
    val TG = "TG".asInstanceOf[PhoneNumberCountryCode]
    val TK = "TK".asInstanceOf[PhoneNumberCountryCode]
    val TO = "TO".asInstanceOf[PhoneNumberCountryCode]
    val TT = "TT".asInstanceOf[PhoneNumberCountryCode]
    val TN = "TN".asInstanceOf[PhoneNumberCountryCode]
    val TR = "TR".asInstanceOf[PhoneNumberCountryCode]
    val TM = "TM".asInstanceOf[PhoneNumberCountryCode]
    val TC = "TC".asInstanceOf[PhoneNumberCountryCode]
    val TV = "TV".asInstanceOf[PhoneNumberCountryCode]
    val VI = "VI".asInstanceOf[PhoneNumberCountryCode]
    val UG = "UG".asInstanceOf[PhoneNumberCountryCode]
    val UA = "UA".asInstanceOf[PhoneNumberCountryCode]
    val AE = "AE".asInstanceOf[PhoneNumberCountryCode]
    val GB = "GB".asInstanceOf[PhoneNumberCountryCode]
    val US = "US".asInstanceOf[PhoneNumberCountryCode]
    val UY = "UY".asInstanceOf[PhoneNumberCountryCode]
    val UZ = "UZ".asInstanceOf[PhoneNumberCountryCode]
    val VU = "VU".asInstanceOf[PhoneNumberCountryCode]
    val VA = "VA".asInstanceOf[PhoneNumberCountryCode]
    val VE = "VE".asInstanceOf[PhoneNumberCountryCode]
    val VN = "VN".asInstanceOf[PhoneNumberCountryCode]
    val WF = "WF".asInstanceOf[PhoneNumberCountryCode]
    val EH = "EH".asInstanceOf[PhoneNumberCountryCode]
    val YE = "YE".asInstanceOf[PhoneNumberCountryCode]
    val ZM = "ZM".asInstanceOf[PhoneNumberCountryCode]
    val ZW = "ZW".asInstanceOf[PhoneNumberCountryCode]

    val values = js.Object.freeze(
      js.Array(
        AF,
        AL,
        DZ,
        AS,
        AD,
        AO,
        AI,
        AQ,
        AG,
        AR,
        AM,
        AW,
        AU,
        AT,
        AZ,
        BS,
        BH,
        BD,
        BB,
        BY,
        BE,
        BZ,
        BJ,
        BM,
        BT,
        BO,
        BA,
        BW,
        BR,
        IO,
        VG,
        BN,
        BG,
        BF,
        BI,
        KH,
        CM,
        CA,
        CV,
        KY,
        CF,
        TD,
        CL,
        CN,
        CX,
        CC,
        CO,
        KM,
        CK,
        CR,
        HR,
        CU,
        CW,
        CY,
        CZ,
        CD,
        DK,
        DJ,
        DM,
        DO,
        TL,
        EC,
        EG,
        SV,
        GQ,
        ER,
        EE,
        ET,
        FK,
        FO,
        FJ,
        FI,
        FR,
        PF,
        GA,
        GM,
        GE,
        DE,
        GH,
        GI,
        GR,
        GL,
        GD,
        GU,
        GT,
        GG,
        GN,
        GW,
        GY,
        HT,
        HN,
        HK,
        HU,
        IS,
        IN,
        ID,
        IR,
        IQ,
        IE,
        IM,
        IL,
        IT,
        CI,
        JM,
        JP,
        JE,
        JO,
        KZ,
        KE,
        KI,
        KW,
        KG,
        LA,
        LV,
        LB,
        LS,
        LR,
        LY,
        LI,
        LT,
        LU,
        MO,
        MK,
        MG,
        MW,
        MY,
        MV,
        ML,
        MT,
        MH,
        MR,
        MU,
        YT,
        MX,
        FM,
        MD,
        MC,
        MN,
        ME,
        MS,
        MA,
        MZ,
        MM,
        NA,
        NR,
        NP,
        NL,
        AN,
        NC,
        NZ,
        NI,
        NE,
        NG,
        NU,
        KP,
        MP,
        NO,
        OM,
        PK,
        PW,
        PA,
        PG,
        PY,
        PE,
        PH,
        PN,
        PL,
        PT,
        PR,
        QA,
        CG,
        RE,
        RO,
        RU,
        RW,
        BL,
        SH,
        KN,
        LC,
        MF,
        PM,
        VC,
        WS,
        SM,
        ST,
        SA,
        SN,
        RS,
        SC,
        SL,
        SG,
        SX,
        SK,
        SI,
        SB,
        SO,
        ZA,
        KR,
        ES,
        LK,
        SD,
        SR,
        SJ,
        SZ,
        SE,
        CH,
        SY,
        TW,
        TJ,
        TZ,
        TH,
        TG,
        TK,
        TO,
        TT,
        TN,
        TR,
        TM,
        TC,
        TV,
        VI,
        UG,
        UA,
        AE,
        GB,
        US,
        UY,
        UZ,
        VU,
        VA,
        VE,
        VN,
        WF,
        EH,
        YE,
        ZM,
        ZW
      )
    )
  }

  /**
    * Contains summary information about a phone number for a contact center.
    */
  @js.native
  @Factory
  trait PhoneNumberSummary extends js.Object {
    var Arn: js.UndefOr[ARN]
    var Id: js.UndefOr[PhoneNumberId]
    var PhoneNumber: js.UndefOr[PhoneNumber]
    var PhoneNumberCountryCode: js.UndefOr[PhoneNumberCountryCode]
    var PhoneNumberType: js.UndefOr[PhoneNumberType]
  }

  @js.native
  sealed trait PhoneNumberType extends js.Any
  object PhoneNumberType extends js.Object {
    val TOLL_FREE = "TOLL_FREE".asInstanceOf[PhoneNumberType]
    val DID       = "DID".asInstanceOf[PhoneNumberType]

    val values = js.Object.freeze(js.Array(TOLL_FREE, DID))
  }

  @js.native
  sealed trait PhoneType extends js.Any
  object PhoneType extends js.Object {
    val SOFT_PHONE = "SOFT_PHONE".asInstanceOf[PhoneType]
    val DESK_PHONE = "DESK_PHONE".asInstanceOf[PhoneType]

    val values = js.Object.freeze(js.Array(SOFT_PHONE, DESK_PHONE))
  }

  /**
    * Contains information about a queue resource for which metrics are returned.
    */
  @js.native
  @Factory
  trait QueueReference extends js.Object {
    var Arn: js.UndefOr[ARN]
    var Id: js.UndefOr[QueueId]
  }

  /**
    * Contains summary information about a queue.
    */
  @js.native
  @Factory
  trait QueueSummary extends js.Object {
    var Arn: js.UndefOr[ARN]
    var Id: js.UndefOr[QueueId]
    var Name: js.UndefOr[QueueName]
    var QueueType: js.UndefOr[QueueType]
  }

  @js.native
  sealed trait QueueType extends js.Any
  object QueueType extends js.Object {
    val STANDARD = "STANDARD".asInstanceOf[QueueType]
    val AGENT    = "AGENT".asInstanceOf[QueueType]

    val values = js.Object.freeze(js.Array(STANDARD, AGENT))
  }

  /**
    * Contains summary information about a routing profile.
    */
  @js.native
  @Factory
  trait RoutingProfileSummary extends js.Object {
    var Arn: js.UndefOr[ARN]
    var Id: js.UndefOr[RoutingProfileId]
    var Name: js.UndefOr[RoutingProfileName]
  }

  /**
    * Contains information about a security profile.
    */
  @js.native
  @Factory
  trait SecurityProfileSummary extends js.Object {
    var Arn: js.UndefOr[ARN]
    var Id: js.UndefOr[SecurityProfileId]
    var Name: js.UndefOr[SecurityProfileName]
  }

  @js.native
  @Factory
  trait StartChatContactRequest extends js.Object {
    var ContactFlowId: ContactFlowId
    var InstanceId: InstanceId
    var ParticipantDetails: ParticipantDetails
    var Attributes: js.UndefOr[Attributes]
    var ClientToken: js.UndefOr[ClientToken]
    var InitialMessage: js.UndefOr[ChatMessage]
  }

  @js.native
  @Factory
  trait StartChatContactResponse extends js.Object {
    var ContactId: js.UndefOr[ContactId]
    var ParticipantId: js.UndefOr[ParticipantId]
    var ParticipantToken: js.UndefOr[ParticipantToken]
  }

  @js.native
  @Factory
  trait StartOutboundVoiceContactRequest extends js.Object {
    var ContactFlowId: ContactFlowId
    var DestinationPhoneNumber: PhoneNumber
    var InstanceId: InstanceId
    var Attributes: js.UndefOr[Attributes]
    var ClientToken: js.UndefOr[ClientToken]
    var QueueId: js.UndefOr[QueueId]
    var SourcePhoneNumber: js.UndefOr[PhoneNumber]
  }

  @js.native
  @Factory
  trait StartOutboundVoiceContactResponse extends js.Object {
    var ContactId: js.UndefOr[ContactId]
  }

  @js.native
  sealed trait Statistic extends js.Any
  object Statistic extends js.Object {
    val SUM = "SUM".asInstanceOf[Statistic]
    val MAX = "MAX".asInstanceOf[Statistic]
    val AVG = "AVG".asInstanceOf[Statistic]

    val values = js.Object.freeze(js.Array(SUM, MAX, AVG))
  }

  @js.native
  @Factory
  trait StopContactRequest extends js.Object {
    var ContactId: ContactId
    var InstanceId: InstanceId
  }

  @js.native
  @Factory
  trait StopContactResponse extends js.Object {}

  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var resourceArn: ARN
    var tags: TagMap
  }

  /**
    * Contains information about the threshold for service level metrics.
    */
  @js.native
  @Factory
  trait Threshold extends js.Object {
    var Comparison: js.UndefOr[Comparison]
    var ThresholdValue: js.UndefOr[ThresholdValue]
  }

  @js.native
  sealed trait Unit extends js.Any
  object Unit extends js.Object {
    val SECONDS = "SECONDS".asInstanceOf[Unit]
    val COUNT   = "COUNT".asInstanceOf[Unit]
    val PERCENT = "PERCENT".asInstanceOf[Unit]

    val values = js.Object.freeze(js.Array(SECONDS, COUNT, PERCENT))
  }

  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var resourceArn: ARN
    var tagKeys: TagKeyList
  }

  @js.native
  @Factory
  trait UpdateContactAttributesRequest extends js.Object {
    var Attributes: Attributes
    var InitialContactId: ContactId
    var InstanceId: InstanceId
  }

  @js.native
  @Factory
  trait UpdateContactAttributesResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateUserHierarchyRequest extends js.Object {
    var InstanceId: InstanceId
    var UserId: UserId
    var HierarchyGroupId: js.UndefOr[HierarchyGroupId]
  }

  @js.native
  @Factory
  trait UpdateUserIdentityInfoRequest extends js.Object {
    var IdentityInfo: UserIdentityInfo
    var InstanceId: InstanceId
    var UserId: UserId
  }

  @js.native
  @Factory
  trait UpdateUserPhoneConfigRequest extends js.Object {
    var InstanceId: InstanceId
    var PhoneConfig: UserPhoneConfig
    var UserId: UserId
  }

  @js.native
  @Factory
  trait UpdateUserRoutingProfileRequest extends js.Object {
    var InstanceId: InstanceId
    var RoutingProfileId: RoutingProfileId
    var UserId: UserId
  }

  @js.native
  @Factory
  trait UpdateUserSecurityProfilesRequest extends js.Object {
    var InstanceId: InstanceId
    var SecurityProfileIds: SecurityProfileIds
    var UserId: UserId
  }

  /**
    * Contains information about a user account for a Amazon Connect instance.
    */
  @js.native
  @Factory
  trait User extends js.Object {
    var Arn: js.UndefOr[ARN]
    var DirectoryUserId: js.UndefOr[DirectoryUserId]
    var HierarchyGroupId: js.UndefOr[HierarchyGroupId]
    var Id: js.UndefOr[UserId]
    var IdentityInfo: js.UndefOr[UserIdentityInfo]
    var PhoneConfig: js.UndefOr[UserPhoneConfig]
    var RoutingProfileId: js.UndefOr[RoutingProfileId]
    var SecurityProfileIds: js.UndefOr[SecurityProfileIds]
    var Tags: js.UndefOr[TagMap]
    var Username: js.UndefOr[AgentUsername]
  }

  /**
    * Contains information about the identity of a user.
    */
  @js.native
  @Factory
  trait UserIdentityInfo extends js.Object {
    var Email: js.UndefOr[Email]
    var FirstName: js.UndefOr[AgentFirstName]
    var LastName: js.UndefOr[AgentLastName]
  }

  /**
    * Contains information about the phone configuration settings for a user.
    */
  @js.native
  @Factory
  trait UserPhoneConfig extends js.Object {
    var PhoneType: PhoneType
    var AfterContactWorkTimeLimit: js.UndefOr[AfterContactWorkTimeLimit]
    var AutoAccept: js.UndefOr[AutoAccept]
    var DeskPhoneNumber: js.UndefOr[PhoneNumber]
  }

  /**
    * Contains summary information about a user.
    */
  @js.native
  @Factory
  trait UserSummary extends js.Object {
    var Arn: js.UndefOr[ARN]
    var Id: js.UndefOr[UserId]
    var Username: js.UndefOr[AgentUsername]
  }
}
