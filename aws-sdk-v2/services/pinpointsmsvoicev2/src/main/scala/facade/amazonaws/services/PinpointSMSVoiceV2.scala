package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object pinpointsmsvoicev2 {
  type AccountAttributeList = js.Array[AccountAttribute]
  type AccountLimitList = js.Array[AccountLimit]
  type AmazonResourceName = String
  type ClientToken = String
  type ConfigurationSetFilterList = js.Array[ConfigurationSetFilter]
  type ConfigurationSetInformationList = js.Array[ConfigurationSetInformation]
  type ConfigurationSetName = String
  type ConfigurationSetNameList = js.Array[ConfigurationSetNameOrArn]
  type ConfigurationSetNameOrArn = String
  type ContextKey = String
  type ContextMap = js.Dictionary[ContextValue]
  type ContextValue = String
  type DeliveryStreamArn = String
  type DestinationCountryParameterValue = String
  type DestinationCountryParameters = js.Dictionary[DestinationCountryParameterValue]
  type EventDestinationList = js.Array[EventDestination]
  type EventDestinationName = String
  type EventTypeList = js.Array[EventType]
  type FilterValue = String
  type FilterValueList = js.Array[FilterValue]
  type IamRoleArn = String
  type IsoCountryCode = String
  type Keyword = String
  type KeywordFilterList = js.Array[KeywordFilter]
  type KeywordInformationList = js.Array[KeywordInformation]
  type KeywordList = js.Array[Keyword]
  type KeywordMessage = String
  type LogGroupArn = String
  type MaxPrice = String
  type MaxResults = Int
  type MessageTypeList = js.Array[MessageType]
  type MonthlyLimit = Double
  type NextToken = String
  type NonEmptyTagList = js.Array[Tag]
  type NumberCapabilityList = js.Array[NumberCapability]
  type OptOutListInformationList = js.Array[OptOutListInformation]
  type OptOutListName = String
  type OptOutListNameList = js.Array[OptOutListNameOrArn]
  type OptOutListNameOrArn = String
  type OptedOutFilterList = js.Array[OptedOutFilter]
  type OptedOutNumberInformationList = js.Array[OptedOutNumberInformation]
  type OptedOutNumberList = js.Array[PhoneNumber]
  type OriginationIdentityMetadataList = js.Array[OriginationIdentityMetadata]
  type PhoneNumber = String
  type PhoneNumberFilterList = js.Array[PhoneNumberFilter]
  type PhoneNumberIdList = js.Array[PhoneNumberIdOrArn]
  type PhoneNumberIdOrArn = String
  type PhoneNumberInformationList = js.Array[PhoneNumberInformation]
  type PhoneOrPoolIdOrArn = String
  type PhoneOrSenderIdOrArn = String
  type PoolFilterList = js.Array[PoolFilter]
  type PoolIdList = js.Array[PoolIdOrArn]
  type PoolIdOrArn = String
  type PoolInformationList = js.Array[PoolInformation]
  type PoolOriginationIdentitiesFilterList = js.Array[PoolOriginationIdentitiesFilter]
  type PrimitiveBoolean = Boolean
  type PrimitiveLong = Double
  type RegistrationId = String
  type SenderId = String
  type SenderIdFilterList = js.Array[SenderIdFilter]
  type SenderIdInformationList = js.Array[SenderIdInformation]
  type SenderIdList = js.Array[SenderIdAndCountry]
  type SenderIdOrArn = String
  type SnsTopicArn = String
  type SpendLimitList = js.Array[SpendLimit]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type TextMessageBody = String
  type TextMessageOriginationIdentity = String
  type TimeToLive = Int
  type Timestamp = js.Date
  type TwoWayChannelArn = String
  type VoiceMessageBody = String
  type VoiceMessageOriginationIdentity = String

  final class PinpointSMSVoiceV2Ops(private val service: PinpointSMSVoiceV2) extends AnyVal {

    @inline def associateOriginationIdentityFuture(params: AssociateOriginationIdentityRequest): Future[AssociateOriginationIdentityResult] = service.associateOriginationIdentity(params).promise().toFuture
    @inline def createConfigurationSetFuture(params: CreateConfigurationSetRequest): Future[CreateConfigurationSetResult] = service.createConfigurationSet(params).promise().toFuture
    @inline def createEventDestinationFuture(params: CreateEventDestinationRequest): Future[CreateEventDestinationResult] = service.createEventDestination(params).promise().toFuture
    @inline def createOptOutListFuture(params: CreateOptOutListRequest): Future[CreateOptOutListResult] = service.createOptOutList(params).promise().toFuture
    @inline def createPoolFuture(params: CreatePoolRequest): Future[CreatePoolResult] = service.createPool(params).promise().toFuture
    @inline def deleteConfigurationSetFuture(params: DeleteConfigurationSetRequest): Future[DeleteConfigurationSetResult] = service.deleteConfigurationSet(params).promise().toFuture
    @inline def deleteDefaultMessageTypeFuture(params: DeleteDefaultMessageTypeRequest): Future[DeleteDefaultMessageTypeResult] = service.deleteDefaultMessageType(params).promise().toFuture
    @inline def deleteDefaultSenderIdFuture(params: DeleteDefaultSenderIdRequest): Future[DeleteDefaultSenderIdResult] = service.deleteDefaultSenderId(params).promise().toFuture
    @inline def deleteEventDestinationFuture(params: DeleteEventDestinationRequest): Future[DeleteEventDestinationResult] = service.deleteEventDestination(params).promise().toFuture
    @inline def deleteKeywordFuture(params: DeleteKeywordRequest): Future[DeleteKeywordResult] = service.deleteKeyword(params).promise().toFuture
    @inline def deleteOptOutListFuture(params: DeleteOptOutListRequest): Future[DeleteOptOutListResult] = service.deleteOptOutList(params).promise().toFuture
    @inline def deleteOptedOutNumberFuture(params: DeleteOptedOutNumberRequest): Future[DeleteOptedOutNumberResult] = service.deleteOptedOutNumber(params).promise().toFuture
    @inline def deletePoolFuture(params: DeletePoolRequest): Future[DeletePoolResult] = service.deletePool(params).promise().toFuture
    @inline def deleteTextMessageSpendLimitOverrideFuture(params: DeleteTextMessageSpendLimitOverrideRequest): Future[DeleteTextMessageSpendLimitOverrideResult] = service.deleteTextMessageSpendLimitOverride(params).promise().toFuture
    @inline def deleteVoiceMessageSpendLimitOverrideFuture(params: DeleteVoiceMessageSpendLimitOverrideRequest): Future[DeleteVoiceMessageSpendLimitOverrideResult] = service.deleteVoiceMessageSpendLimitOverride(params).promise().toFuture
    @inline def describeAccountAttributesFuture(params: DescribeAccountAttributesRequest): Future[DescribeAccountAttributesResult] = service.describeAccountAttributes(params).promise().toFuture
    @inline def describeAccountLimitsFuture(params: DescribeAccountLimitsRequest): Future[DescribeAccountLimitsResult] = service.describeAccountLimits(params).promise().toFuture
    @inline def describeConfigurationSetsFuture(params: DescribeConfigurationSetsRequest): Future[DescribeConfigurationSetsResult] = service.describeConfigurationSets(params).promise().toFuture
    @inline def describeKeywordsFuture(params: DescribeKeywordsRequest): Future[DescribeKeywordsResult] = service.describeKeywords(params).promise().toFuture
    @inline def describeOptOutListsFuture(params: DescribeOptOutListsRequest): Future[DescribeOptOutListsResult] = service.describeOptOutLists(params).promise().toFuture
    @inline def describeOptedOutNumbersFuture(params: DescribeOptedOutNumbersRequest): Future[DescribeOptedOutNumbersResult] = service.describeOptedOutNumbers(params).promise().toFuture
    @inline def describePhoneNumbersFuture(params: DescribePhoneNumbersRequest): Future[DescribePhoneNumbersResult] = service.describePhoneNumbers(params).promise().toFuture
    @inline def describePoolsFuture(params: DescribePoolsRequest): Future[DescribePoolsResult] = service.describePools(params).promise().toFuture
    @inline def describeSenderIdsFuture(params: DescribeSenderIdsRequest): Future[DescribeSenderIdsResult] = service.describeSenderIds(params).promise().toFuture
    @inline def describeSpendLimitsFuture(params: DescribeSpendLimitsRequest): Future[DescribeSpendLimitsResult] = service.describeSpendLimits(params).promise().toFuture
    @inline def disassociateOriginationIdentityFuture(params: DisassociateOriginationIdentityRequest): Future[DisassociateOriginationIdentityResult] = service.disassociateOriginationIdentity(params).promise().toFuture
    @inline def listPoolOriginationIdentitiesFuture(params: ListPoolOriginationIdentitiesRequest): Future[ListPoolOriginationIdentitiesResult] = service.listPoolOriginationIdentities(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResult] = service.listTagsForResource(params).promise().toFuture
    @inline def putKeywordFuture(params: PutKeywordRequest): Future[PutKeywordResult] = service.putKeyword(params).promise().toFuture
    @inline def putOptedOutNumberFuture(params: PutOptedOutNumberRequest): Future[PutOptedOutNumberResult] = service.putOptedOutNumber(params).promise().toFuture
    @inline def releasePhoneNumberFuture(params: ReleasePhoneNumberRequest): Future[ReleasePhoneNumberResult] = service.releasePhoneNumber(params).promise().toFuture
    @inline def requestPhoneNumberFuture(params: RequestPhoneNumberRequest): Future[RequestPhoneNumberResult] = service.requestPhoneNumber(params).promise().toFuture
    @inline def sendTextMessageFuture(params: SendTextMessageRequest): Future[SendTextMessageResult] = service.sendTextMessage(params).promise().toFuture
    @inline def sendVoiceMessageFuture(params: SendVoiceMessageRequest): Future[SendVoiceMessageResult] = service.sendVoiceMessage(params).promise().toFuture
    @inline def setDefaultMessageTypeFuture(params: SetDefaultMessageTypeRequest): Future[SetDefaultMessageTypeResult] = service.setDefaultMessageType(params).promise().toFuture
    @inline def setDefaultSenderIdFuture(params: SetDefaultSenderIdRequest): Future[SetDefaultSenderIdResult] = service.setDefaultSenderId(params).promise().toFuture
    @inline def setTextMessageSpendLimitOverrideFuture(params: SetTextMessageSpendLimitOverrideRequest): Future[SetTextMessageSpendLimitOverrideResult] = service.setTextMessageSpendLimitOverride(params).promise().toFuture
    @inline def setVoiceMessageSpendLimitOverrideFuture(params: SetVoiceMessageSpendLimitOverrideRequest): Future[SetVoiceMessageSpendLimitOverrideResult] = service.setVoiceMessageSpendLimitOverride(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResult] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResult] = service.untagResource(params).promise().toFuture
    @inline def updateEventDestinationFuture(params: UpdateEventDestinationRequest): Future[UpdateEventDestinationResult] = service.updateEventDestination(params).promise().toFuture
    @inline def updatePhoneNumberFuture(params: UpdatePhoneNumberRequest): Future[UpdatePhoneNumberResult] = service.updatePhoneNumber(params).promise().toFuture
    @inline def updatePoolFuture(params: UpdatePoolRequest): Future[UpdatePoolResult] = service.updatePool(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/pinpointsmsvoicev2", JSImport.Namespace, "AWS.PinpointSMSVoiceV2")
  class PinpointSMSVoiceV2() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateOriginationIdentity(params: AssociateOriginationIdentityRequest): Request[AssociateOriginationIdentityResult] = js.native
    def createConfigurationSet(params: CreateConfigurationSetRequest): Request[CreateConfigurationSetResult] = js.native
    def createEventDestination(params: CreateEventDestinationRequest): Request[CreateEventDestinationResult] = js.native
    def createOptOutList(params: CreateOptOutListRequest): Request[CreateOptOutListResult] = js.native
    def createPool(params: CreatePoolRequest): Request[CreatePoolResult] = js.native
    def deleteConfigurationSet(params: DeleteConfigurationSetRequest): Request[DeleteConfigurationSetResult] = js.native
    def deleteDefaultMessageType(params: DeleteDefaultMessageTypeRequest): Request[DeleteDefaultMessageTypeResult] = js.native
    def deleteDefaultSenderId(params: DeleteDefaultSenderIdRequest): Request[DeleteDefaultSenderIdResult] = js.native
    def deleteEventDestination(params: DeleteEventDestinationRequest): Request[DeleteEventDestinationResult] = js.native
    def deleteKeyword(params: DeleteKeywordRequest): Request[DeleteKeywordResult] = js.native
    def deleteOptOutList(params: DeleteOptOutListRequest): Request[DeleteOptOutListResult] = js.native
    def deleteOptedOutNumber(params: DeleteOptedOutNumberRequest): Request[DeleteOptedOutNumberResult] = js.native
    def deletePool(params: DeletePoolRequest): Request[DeletePoolResult] = js.native
    def deleteTextMessageSpendLimitOverride(params: DeleteTextMessageSpendLimitOverrideRequest): Request[DeleteTextMessageSpendLimitOverrideResult] = js.native
    def deleteVoiceMessageSpendLimitOverride(params: DeleteVoiceMessageSpendLimitOverrideRequest): Request[DeleteVoiceMessageSpendLimitOverrideResult] = js.native
    def describeAccountAttributes(params: DescribeAccountAttributesRequest): Request[DescribeAccountAttributesResult] = js.native
    def describeAccountLimits(params: DescribeAccountLimitsRequest): Request[DescribeAccountLimitsResult] = js.native
    def describeConfigurationSets(params: DescribeConfigurationSetsRequest): Request[DescribeConfigurationSetsResult] = js.native
    def describeKeywords(params: DescribeKeywordsRequest): Request[DescribeKeywordsResult] = js.native
    def describeOptOutLists(params: DescribeOptOutListsRequest): Request[DescribeOptOutListsResult] = js.native
    def describeOptedOutNumbers(params: DescribeOptedOutNumbersRequest): Request[DescribeOptedOutNumbersResult] = js.native
    def describePhoneNumbers(params: DescribePhoneNumbersRequest): Request[DescribePhoneNumbersResult] = js.native
    def describePools(params: DescribePoolsRequest): Request[DescribePoolsResult] = js.native
    def describeSenderIds(params: DescribeSenderIdsRequest): Request[DescribeSenderIdsResult] = js.native
    def describeSpendLimits(params: DescribeSpendLimitsRequest): Request[DescribeSpendLimitsResult] = js.native
    def disassociateOriginationIdentity(params: DisassociateOriginationIdentityRequest): Request[DisassociateOriginationIdentityResult] = js.native
    def listPoolOriginationIdentities(params: ListPoolOriginationIdentitiesRequest): Request[ListPoolOriginationIdentitiesResult] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResult] = js.native
    def putKeyword(params: PutKeywordRequest): Request[PutKeywordResult] = js.native
    def putOptedOutNumber(params: PutOptedOutNumberRequest): Request[PutOptedOutNumberResult] = js.native
    def releasePhoneNumber(params: ReleasePhoneNumberRequest): Request[ReleasePhoneNumberResult] = js.native
    def requestPhoneNumber(params: RequestPhoneNumberRequest): Request[RequestPhoneNumberResult] = js.native
    def sendTextMessage(params: SendTextMessageRequest): Request[SendTextMessageResult] = js.native
    def sendVoiceMessage(params: SendVoiceMessageRequest): Request[SendVoiceMessageResult] = js.native
    def setDefaultMessageType(params: SetDefaultMessageTypeRequest): Request[SetDefaultMessageTypeResult] = js.native
    def setDefaultSenderId(params: SetDefaultSenderIdRequest): Request[SetDefaultSenderIdResult] = js.native
    def setTextMessageSpendLimitOverride(params: SetTextMessageSpendLimitOverrideRequest): Request[SetTextMessageSpendLimitOverrideResult] = js.native
    def setVoiceMessageSpendLimitOverride(params: SetVoiceMessageSpendLimitOverrideRequest): Request[SetVoiceMessageSpendLimitOverrideResult] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResult] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResult] = js.native
    def updateEventDestination(params: UpdateEventDestinationRequest): Request[UpdateEventDestinationResult] = js.native
    def updatePhoneNumber(params: UpdatePhoneNumberRequest): Request[UpdatePhoneNumberResult] = js.native
    def updatePool(params: UpdatePoolRequest): Request[UpdatePoolResult] = js.native
  }
  object PinpointSMSVoiceV2 {
    @inline implicit def toOps(service: PinpointSMSVoiceV2): PinpointSMSVoiceV2Ops = {
      new PinpointSMSVoiceV2Ops(service)
    }
  }

  /** Displays the attributes associated with a single Amazon Web Services account.
    */
  @js.native
  trait AccountAttribute extends js.Object {
    var Name: AccountAttributeName
    var Value: String
  }

  object AccountAttribute {
    @inline
    def apply(
        Name: AccountAttributeName,
        Value: String
    ): AccountAttribute = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AccountAttribute]
    }
  }

  /** The current resource quotas associated with an Amazon Web Services account.
    */
  @js.native
  trait AccountLimit extends js.Object {
    var Max: PrimitiveLong
    var Name: AccountLimitName
    var Used: PrimitiveLong
  }

  object AccountLimit {
    @inline
    def apply(
        Max: PrimitiveLong,
        Name: AccountLimitName,
        Used: PrimitiveLong
    ): AccountLimit = {
      val __obj = js.Dynamic.literal(
        "Max" -> Max.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Used" -> Used.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AccountLimit]
    }
  }

  @js.native
  trait AssociateOriginationIdentityRequest extends js.Object {
    var IsoCountryCode: IsoCountryCode
    var OriginationIdentity: PhoneOrSenderIdOrArn
    var PoolId: PoolIdOrArn
    var ClientToken: js.UndefOr[ClientToken]
  }

  object AssociateOriginationIdentityRequest {
    @inline
    def apply(
        IsoCountryCode: IsoCountryCode,
        OriginationIdentity: PhoneOrSenderIdOrArn,
        PoolId: PoolIdOrArn,
        ClientToken: js.UndefOr[ClientToken] = js.undefined
    ): AssociateOriginationIdentityRequest = {
      val __obj = js.Dynamic.literal(
        "IsoCountryCode" -> IsoCountryCode.asInstanceOf[js.Any],
        "OriginationIdentity" -> OriginationIdentity.asInstanceOf[js.Any],
        "PoolId" -> PoolId.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateOriginationIdentityRequest]
    }
  }

  @js.native
  trait AssociateOriginationIdentityResult extends js.Object {
    var IsoCountryCode: js.UndefOr[IsoCountryCode]
    var OriginationIdentity: js.UndefOr[String]
    var OriginationIdentityArn: js.UndefOr[String]
    var PoolArn: js.UndefOr[String]
    var PoolId: js.UndefOr[String]
  }

  object AssociateOriginationIdentityResult {
    @inline
    def apply(
        IsoCountryCode: js.UndefOr[IsoCountryCode] = js.undefined,
        OriginationIdentity: js.UndefOr[String] = js.undefined,
        OriginationIdentityArn: js.UndefOr[String] = js.undefined,
        PoolArn: js.UndefOr[String] = js.undefined,
        PoolId: js.UndefOr[String] = js.undefined
    ): AssociateOriginationIdentityResult = {
      val __obj = js.Dynamic.literal()
      IsoCountryCode.foreach(__v => __obj.updateDynamic("IsoCountryCode")(__v.asInstanceOf[js.Any]))
      OriginationIdentity.foreach(__v => __obj.updateDynamic("OriginationIdentity")(__v.asInstanceOf[js.Any]))
      OriginationIdentityArn.foreach(__v => __obj.updateDynamic("OriginationIdentityArn")(__v.asInstanceOf[js.Any]))
      PoolArn.foreach(__v => __obj.updateDynamic("PoolArn")(__v.asInstanceOf[js.Any]))
      PoolId.foreach(__v => __obj.updateDynamic("PoolId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateOriginationIdentityResult]
    }
  }

  /** Contains the destination configuration to use when publishing message sending events.
    */
  @js.native
  trait CloudWatchLogsDestination extends js.Object {
    var IamRoleArn: IamRoleArn
    var LogGroupArn: LogGroupArn
  }

  object CloudWatchLogsDestination {
    @inline
    def apply(
        IamRoleArn: IamRoleArn,
        LogGroupArn: LogGroupArn
    ): CloudWatchLogsDestination = {
      val __obj = js.Dynamic.literal(
        "IamRoleArn" -> IamRoleArn.asInstanceOf[js.Any],
        "LogGroupArn" -> LogGroupArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CloudWatchLogsDestination]
    }
  }

  /** The information for configuration sets that meet a specified criteria.
    */
  @js.native
  trait ConfigurationSetFilter extends js.Object {
    var Name: ConfigurationSetFilterName
    var Values: FilterValueList
  }

  object ConfigurationSetFilter {
    @inline
    def apply(
        Name: ConfigurationSetFilterName,
        Values: FilterValueList
    ): ConfigurationSetFilter = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ConfigurationSetFilter]
    }
  }

  /** Information related to a given configuration set in your Amazon Web Services account.
    */
  @js.native
  trait ConfigurationSetInformation extends js.Object {
    var ConfigurationSetArn: String
    var ConfigurationSetName: ConfigurationSetName
    var CreatedTimestamp: Timestamp
    var EventDestinations: EventDestinationList
    var DefaultMessageType: js.UndefOr[MessageType]
    var DefaultSenderId: js.UndefOr[SenderId]
  }

  object ConfigurationSetInformation {
    @inline
    def apply(
        ConfigurationSetArn: String,
        ConfigurationSetName: ConfigurationSetName,
        CreatedTimestamp: Timestamp,
        EventDestinations: EventDestinationList,
        DefaultMessageType: js.UndefOr[MessageType] = js.undefined,
        DefaultSenderId: js.UndefOr[SenderId] = js.undefined
    ): ConfigurationSetInformation = {
      val __obj = js.Dynamic.literal(
        "ConfigurationSetArn" -> ConfigurationSetArn.asInstanceOf[js.Any],
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any],
        "CreatedTimestamp" -> CreatedTimestamp.asInstanceOf[js.Any],
        "EventDestinations" -> EventDestinations.asInstanceOf[js.Any]
      )

      DefaultMessageType.foreach(__v => __obj.updateDynamic("DefaultMessageType")(__v.asInstanceOf[js.Any]))
      DefaultSenderId.foreach(__v => __obj.updateDynamic("DefaultSenderId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfigurationSetInformation]
    }
  }

  @js.native
  trait CreateConfigurationSetRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetName
    var ClientToken: js.UndefOr[ClientToken]
    var Tags: js.UndefOr[TagList]
  }

  object CreateConfigurationSetRequest {
    @inline
    def apply(
        ConfigurationSetName: ConfigurationSetName,
        ClientToken: js.UndefOr[ClientToken] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateConfigurationSetRequest = {
      val __obj = js.Dynamic.literal(
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateConfigurationSetRequest]
    }
  }

  @js.native
  trait CreateConfigurationSetResult extends js.Object {
    var ConfigurationSetArn: js.UndefOr[String]
    var ConfigurationSetName: js.UndefOr[ConfigurationSetName]
    var CreatedTimestamp: js.UndefOr[Timestamp]
    var Tags: js.UndefOr[TagList]
  }

  object CreateConfigurationSetResult {
    @inline
    def apply(
        ConfigurationSetArn: js.UndefOr[String] = js.undefined,
        ConfigurationSetName: js.UndefOr[ConfigurationSetName] = js.undefined,
        CreatedTimestamp: js.UndefOr[Timestamp] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateConfigurationSetResult = {
      val __obj = js.Dynamic.literal()
      ConfigurationSetArn.foreach(__v => __obj.updateDynamic("ConfigurationSetArn")(__v.asInstanceOf[js.Any]))
      ConfigurationSetName.foreach(__v => __obj.updateDynamic("ConfigurationSetName")(__v.asInstanceOf[js.Any]))
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateConfigurationSetResult]
    }
  }

  @js.native
  trait CreateEventDestinationRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetNameOrArn
    var EventDestinationName: EventDestinationName
    var MatchingEventTypes: EventTypeList
    var ClientToken: js.UndefOr[ClientToken]
    var CloudWatchLogsDestination: js.UndefOr[CloudWatchLogsDestination]
    var KinesisFirehoseDestination: js.UndefOr[KinesisFirehoseDestination]
    var SnsDestination: js.UndefOr[SnsDestination]
  }

  object CreateEventDestinationRequest {
    @inline
    def apply(
        ConfigurationSetName: ConfigurationSetNameOrArn,
        EventDestinationName: EventDestinationName,
        MatchingEventTypes: EventTypeList,
        ClientToken: js.UndefOr[ClientToken] = js.undefined,
        CloudWatchLogsDestination: js.UndefOr[CloudWatchLogsDestination] = js.undefined,
        KinesisFirehoseDestination: js.UndefOr[KinesisFirehoseDestination] = js.undefined,
        SnsDestination: js.UndefOr[SnsDestination] = js.undefined
    ): CreateEventDestinationRequest = {
      val __obj = js.Dynamic.literal(
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any],
        "EventDestinationName" -> EventDestinationName.asInstanceOf[js.Any],
        "MatchingEventTypes" -> MatchingEventTypes.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      CloudWatchLogsDestination.foreach(__v => __obj.updateDynamic("CloudWatchLogsDestination")(__v.asInstanceOf[js.Any]))
      KinesisFirehoseDestination.foreach(__v => __obj.updateDynamic("KinesisFirehoseDestination")(__v.asInstanceOf[js.Any]))
      SnsDestination.foreach(__v => __obj.updateDynamic("SnsDestination")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateEventDestinationRequest]
    }
  }

  @js.native
  trait CreateEventDestinationResult extends js.Object {
    var ConfigurationSetArn: js.UndefOr[String]
    var ConfigurationSetName: js.UndefOr[ConfigurationSetName]
    var EventDestination: js.UndefOr[EventDestination]
  }

  object CreateEventDestinationResult {
    @inline
    def apply(
        ConfigurationSetArn: js.UndefOr[String] = js.undefined,
        ConfigurationSetName: js.UndefOr[ConfigurationSetName] = js.undefined,
        EventDestination: js.UndefOr[EventDestination] = js.undefined
    ): CreateEventDestinationResult = {
      val __obj = js.Dynamic.literal()
      ConfigurationSetArn.foreach(__v => __obj.updateDynamic("ConfigurationSetArn")(__v.asInstanceOf[js.Any]))
      ConfigurationSetName.foreach(__v => __obj.updateDynamic("ConfigurationSetName")(__v.asInstanceOf[js.Any]))
      EventDestination.foreach(__v => __obj.updateDynamic("EventDestination")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateEventDestinationResult]
    }
  }

  @js.native
  trait CreateOptOutListRequest extends js.Object {
    var OptOutListName: OptOutListName
    var ClientToken: js.UndefOr[ClientToken]
    var Tags: js.UndefOr[TagList]
  }

  object CreateOptOutListRequest {
    @inline
    def apply(
        OptOutListName: OptOutListName,
        ClientToken: js.UndefOr[ClientToken] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateOptOutListRequest = {
      val __obj = js.Dynamic.literal(
        "OptOutListName" -> OptOutListName.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateOptOutListRequest]
    }
  }

  @js.native
  trait CreateOptOutListResult extends js.Object {
    var CreatedTimestamp: js.UndefOr[Timestamp]
    var OptOutListArn: js.UndefOr[String]
    var OptOutListName: js.UndefOr[OptOutListName]
    var Tags: js.UndefOr[TagList]
  }

  object CreateOptOutListResult {
    @inline
    def apply(
        CreatedTimestamp: js.UndefOr[Timestamp] = js.undefined,
        OptOutListArn: js.UndefOr[String] = js.undefined,
        OptOutListName: js.UndefOr[OptOutListName] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateOptOutListResult = {
      val __obj = js.Dynamic.literal()
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      OptOutListArn.foreach(__v => __obj.updateDynamic("OptOutListArn")(__v.asInstanceOf[js.Any]))
      OptOutListName.foreach(__v => __obj.updateDynamic("OptOutListName")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateOptOutListResult]
    }
  }

  @js.native
  trait CreatePoolRequest extends js.Object {
    var IsoCountryCode: IsoCountryCode
    var MessageType: MessageType
    var OriginationIdentity: PhoneOrSenderIdOrArn
    var ClientToken: js.UndefOr[ClientToken]
    var DeletionProtectionEnabled: js.UndefOr[Boolean]
    var Tags: js.UndefOr[TagList]
  }

  object CreatePoolRequest {
    @inline
    def apply(
        IsoCountryCode: IsoCountryCode,
        MessageType: MessageType,
        OriginationIdentity: PhoneOrSenderIdOrArn,
        ClientToken: js.UndefOr[ClientToken] = js.undefined,
        DeletionProtectionEnabled: js.UndefOr[Boolean] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreatePoolRequest = {
      val __obj = js.Dynamic.literal(
        "IsoCountryCode" -> IsoCountryCode.asInstanceOf[js.Any],
        "MessageType" -> MessageType.asInstanceOf[js.Any],
        "OriginationIdentity" -> OriginationIdentity.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      DeletionProtectionEnabled.foreach(__v => __obj.updateDynamic("DeletionProtectionEnabled")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePoolRequest]
    }
  }

  @js.native
  trait CreatePoolResult extends js.Object {
    var CreatedTimestamp: js.UndefOr[Timestamp]
    var DeletionProtectionEnabled: js.UndefOr[PrimitiveBoolean]
    var MessageType: js.UndefOr[MessageType]
    var OptOutListName: js.UndefOr[OptOutListName]
    var PoolArn: js.UndefOr[String]
    var PoolId: js.UndefOr[String]
    var SelfManagedOptOutsEnabled: js.UndefOr[PrimitiveBoolean]
    var SharedRoutesEnabled: js.UndefOr[PrimitiveBoolean]
    var Status: js.UndefOr[PoolStatus]
    var Tags: js.UndefOr[TagList]
    var TwoWayChannelArn: js.UndefOr[TwoWayChannelArn]
    var TwoWayEnabled: js.UndefOr[PrimitiveBoolean]
  }

  object CreatePoolResult {
    @inline
    def apply(
        CreatedTimestamp: js.UndefOr[Timestamp] = js.undefined,
        DeletionProtectionEnabled: js.UndefOr[PrimitiveBoolean] = js.undefined,
        MessageType: js.UndefOr[MessageType] = js.undefined,
        OptOutListName: js.UndefOr[OptOutListName] = js.undefined,
        PoolArn: js.UndefOr[String] = js.undefined,
        PoolId: js.UndefOr[String] = js.undefined,
        SelfManagedOptOutsEnabled: js.UndefOr[PrimitiveBoolean] = js.undefined,
        SharedRoutesEnabled: js.UndefOr[PrimitiveBoolean] = js.undefined,
        Status: js.UndefOr[PoolStatus] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        TwoWayChannelArn: js.UndefOr[TwoWayChannelArn] = js.undefined,
        TwoWayEnabled: js.UndefOr[PrimitiveBoolean] = js.undefined
    ): CreatePoolResult = {
      val __obj = js.Dynamic.literal()
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      DeletionProtectionEnabled.foreach(__v => __obj.updateDynamic("DeletionProtectionEnabled")(__v.asInstanceOf[js.Any]))
      MessageType.foreach(__v => __obj.updateDynamic("MessageType")(__v.asInstanceOf[js.Any]))
      OptOutListName.foreach(__v => __obj.updateDynamic("OptOutListName")(__v.asInstanceOf[js.Any]))
      PoolArn.foreach(__v => __obj.updateDynamic("PoolArn")(__v.asInstanceOf[js.Any]))
      PoolId.foreach(__v => __obj.updateDynamic("PoolId")(__v.asInstanceOf[js.Any]))
      SelfManagedOptOutsEnabled.foreach(__v => __obj.updateDynamic("SelfManagedOptOutsEnabled")(__v.asInstanceOf[js.Any]))
      SharedRoutesEnabled.foreach(__v => __obj.updateDynamic("SharedRoutesEnabled")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TwoWayChannelArn.foreach(__v => __obj.updateDynamic("TwoWayChannelArn")(__v.asInstanceOf[js.Any]))
      TwoWayEnabled.foreach(__v => __obj.updateDynamic("TwoWayEnabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePoolResult]
    }
  }

  @js.native
  trait DeleteConfigurationSetRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetNameOrArn
  }

  object DeleteConfigurationSetRequest {
    @inline
    def apply(
        ConfigurationSetName: ConfigurationSetNameOrArn
    ): DeleteConfigurationSetRequest = {
      val __obj = js.Dynamic.literal(
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteConfigurationSetRequest]
    }
  }

  @js.native
  trait DeleteConfigurationSetResult extends js.Object {
    var ConfigurationSetArn: js.UndefOr[String]
    var ConfigurationSetName: js.UndefOr[ConfigurationSetName]
    var CreatedTimestamp: js.UndefOr[Timestamp]
    var DefaultMessageType: js.UndefOr[MessageType]
    var DefaultSenderId: js.UndefOr[SenderId]
    var EventDestinations: js.UndefOr[EventDestinationList]
  }

  object DeleteConfigurationSetResult {
    @inline
    def apply(
        ConfigurationSetArn: js.UndefOr[String] = js.undefined,
        ConfigurationSetName: js.UndefOr[ConfigurationSetName] = js.undefined,
        CreatedTimestamp: js.UndefOr[Timestamp] = js.undefined,
        DefaultMessageType: js.UndefOr[MessageType] = js.undefined,
        DefaultSenderId: js.UndefOr[SenderId] = js.undefined,
        EventDestinations: js.UndefOr[EventDestinationList] = js.undefined
    ): DeleteConfigurationSetResult = {
      val __obj = js.Dynamic.literal()
      ConfigurationSetArn.foreach(__v => __obj.updateDynamic("ConfigurationSetArn")(__v.asInstanceOf[js.Any]))
      ConfigurationSetName.foreach(__v => __obj.updateDynamic("ConfigurationSetName")(__v.asInstanceOf[js.Any]))
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      DefaultMessageType.foreach(__v => __obj.updateDynamic("DefaultMessageType")(__v.asInstanceOf[js.Any]))
      DefaultSenderId.foreach(__v => __obj.updateDynamic("DefaultSenderId")(__v.asInstanceOf[js.Any]))
      EventDestinations.foreach(__v => __obj.updateDynamic("EventDestinations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteConfigurationSetResult]
    }
  }

  @js.native
  trait DeleteDefaultMessageTypeRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetNameOrArn
  }

  object DeleteDefaultMessageTypeRequest {
    @inline
    def apply(
        ConfigurationSetName: ConfigurationSetNameOrArn
    ): DeleteDefaultMessageTypeRequest = {
      val __obj = js.Dynamic.literal(
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteDefaultMessageTypeRequest]
    }
  }

  @js.native
  trait DeleteDefaultMessageTypeResult extends js.Object {
    var ConfigurationSetArn: js.UndefOr[String]
    var ConfigurationSetName: js.UndefOr[ConfigurationSetName]
    var MessageType: js.UndefOr[MessageType]
  }

  object DeleteDefaultMessageTypeResult {
    @inline
    def apply(
        ConfigurationSetArn: js.UndefOr[String] = js.undefined,
        ConfigurationSetName: js.UndefOr[ConfigurationSetName] = js.undefined,
        MessageType: js.UndefOr[MessageType] = js.undefined
    ): DeleteDefaultMessageTypeResult = {
      val __obj = js.Dynamic.literal()
      ConfigurationSetArn.foreach(__v => __obj.updateDynamic("ConfigurationSetArn")(__v.asInstanceOf[js.Any]))
      ConfigurationSetName.foreach(__v => __obj.updateDynamic("ConfigurationSetName")(__v.asInstanceOf[js.Any]))
      MessageType.foreach(__v => __obj.updateDynamic("MessageType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteDefaultMessageTypeResult]
    }
  }

  @js.native
  trait DeleteDefaultSenderIdRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetNameOrArn
  }

  object DeleteDefaultSenderIdRequest {
    @inline
    def apply(
        ConfigurationSetName: ConfigurationSetNameOrArn
    ): DeleteDefaultSenderIdRequest = {
      val __obj = js.Dynamic.literal(
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteDefaultSenderIdRequest]
    }
  }

  @js.native
  trait DeleteDefaultSenderIdResult extends js.Object {
    var ConfigurationSetArn: js.UndefOr[String]
    var ConfigurationSetName: js.UndefOr[ConfigurationSetName]
    var SenderId: js.UndefOr[SenderId]
  }

  object DeleteDefaultSenderIdResult {
    @inline
    def apply(
        ConfigurationSetArn: js.UndefOr[String] = js.undefined,
        ConfigurationSetName: js.UndefOr[ConfigurationSetName] = js.undefined,
        SenderId: js.UndefOr[SenderId] = js.undefined
    ): DeleteDefaultSenderIdResult = {
      val __obj = js.Dynamic.literal()
      ConfigurationSetArn.foreach(__v => __obj.updateDynamic("ConfigurationSetArn")(__v.asInstanceOf[js.Any]))
      ConfigurationSetName.foreach(__v => __obj.updateDynamic("ConfigurationSetName")(__v.asInstanceOf[js.Any]))
      SenderId.foreach(__v => __obj.updateDynamic("SenderId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteDefaultSenderIdResult]
    }
  }

  @js.native
  trait DeleteEventDestinationRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetNameOrArn
    var EventDestinationName: EventDestinationName
  }

  object DeleteEventDestinationRequest {
    @inline
    def apply(
        ConfigurationSetName: ConfigurationSetNameOrArn,
        EventDestinationName: EventDestinationName
    ): DeleteEventDestinationRequest = {
      val __obj = js.Dynamic.literal(
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any],
        "EventDestinationName" -> EventDestinationName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteEventDestinationRequest]
    }
  }

  @js.native
  trait DeleteEventDestinationResult extends js.Object {
    var ConfigurationSetArn: js.UndefOr[String]
    var ConfigurationSetName: js.UndefOr[ConfigurationSetName]
    var EventDestination: js.UndefOr[EventDestination]
  }

  object DeleteEventDestinationResult {
    @inline
    def apply(
        ConfigurationSetArn: js.UndefOr[String] = js.undefined,
        ConfigurationSetName: js.UndefOr[ConfigurationSetName] = js.undefined,
        EventDestination: js.UndefOr[EventDestination] = js.undefined
    ): DeleteEventDestinationResult = {
      val __obj = js.Dynamic.literal()
      ConfigurationSetArn.foreach(__v => __obj.updateDynamic("ConfigurationSetArn")(__v.asInstanceOf[js.Any]))
      ConfigurationSetName.foreach(__v => __obj.updateDynamic("ConfigurationSetName")(__v.asInstanceOf[js.Any]))
      EventDestination.foreach(__v => __obj.updateDynamic("EventDestination")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteEventDestinationResult]
    }
  }

  @js.native
  trait DeleteKeywordRequest extends js.Object {
    var Keyword: Keyword
    var OriginationIdentity: PhoneOrPoolIdOrArn
  }

  object DeleteKeywordRequest {
    @inline
    def apply(
        Keyword: Keyword,
        OriginationIdentity: PhoneOrPoolIdOrArn
    ): DeleteKeywordRequest = {
      val __obj = js.Dynamic.literal(
        "Keyword" -> Keyword.asInstanceOf[js.Any],
        "OriginationIdentity" -> OriginationIdentity.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteKeywordRequest]
    }
  }

  @js.native
  trait DeleteKeywordResult extends js.Object {
    var Keyword: js.UndefOr[Keyword]
    var KeywordAction: js.UndefOr[KeywordAction]
    var KeywordMessage: js.UndefOr[KeywordMessage]
    var OriginationIdentity: js.UndefOr[String]
    var OriginationIdentityArn: js.UndefOr[String]
  }

  object DeleteKeywordResult {
    @inline
    def apply(
        Keyword: js.UndefOr[Keyword] = js.undefined,
        KeywordAction: js.UndefOr[KeywordAction] = js.undefined,
        KeywordMessage: js.UndefOr[KeywordMessage] = js.undefined,
        OriginationIdentity: js.UndefOr[String] = js.undefined,
        OriginationIdentityArn: js.UndefOr[String] = js.undefined
    ): DeleteKeywordResult = {
      val __obj = js.Dynamic.literal()
      Keyword.foreach(__v => __obj.updateDynamic("Keyword")(__v.asInstanceOf[js.Any]))
      KeywordAction.foreach(__v => __obj.updateDynamic("KeywordAction")(__v.asInstanceOf[js.Any]))
      KeywordMessage.foreach(__v => __obj.updateDynamic("KeywordMessage")(__v.asInstanceOf[js.Any]))
      OriginationIdentity.foreach(__v => __obj.updateDynamic("OriginationIdentity")(__v.asInstanceOf[js.Any]))
      OriginationIdentityArn.foreach(__v => __obj.updateDynamic("OriginationIdentityArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteKeywordResult]
    }
  }

  @js.native
  trait DeleteOptOutListRequest extends js.Object {
    var OptOutListName: OptOutListNameOrArn
  }

  object DeleteOptOutListRequest {
    @inline
    def apply(
        OptOutListName: OptOutListNameOrArn
    ): DeleteOptOutListRequest = {
      val __obj = js.Dynamic.literal(
        "OptOutListName" -> OptOutListName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteOptOutListRequest]
    }
  }

  @js.native
  trait DeleteOptOutListResult extends js.Object {
    var CreatedTimestamp: js.UndefOr[Timestamp]
    var OptOutListArn: js.UndefOr[String]
    var OptOutListName: js.UndefOr[OptOutListName]
  }

  object DeleteOptOutListResult {
    @inline
    def apply(
        CreatedTimestamp: js.UndefOr[Timestamp] = js.undefined,
        OptOutListArn: js.UndefOr[String] = js.undefined,
        OptOutListName: js.UndefOr[OptOutListName] = js.undefined
    ): DeleteOptOutListResult = {
      val __obj = js.Dynamic.literal()
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      OptOutListArn.foreach(__v => __obj.updateDynamic("OptOutListArn")(__v.asInstanceOf[js.Any]))
      OptOutListName.foreach(__v => __obj.updateDynamic("OptOutListName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteOptOutListResult]
    }
  }

  @js.native
  trait DeleteOptedOutNumberRequest extends js.Object {
    var OptOutListName: OptOutListNameOrArn
    var OptedOutNumber: PhoneNumber
  }

  object DeleteOptedOutNumberRequest {
    @inline
    def apply(
        OptOutListName: OptOutListNameOrArn,
        OptedOutNumber: PhoneNumber
    ): DeleteOptedOutNumberRequest = {
      val __obj = js.Dynamic.literal(
        "OptOutListName" -> OptOutListName.asInstanceOf[js.Any],
        "OptedOutNumber" -> OptedOutNumber.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteOptedOutNumberRequest]
    }
  }

  @js.native
  trait DeleteOptedOutNumberResult extends js.Object {
    var EndUserOptedOut: js.UndefOr[PrimitiveBoolean]
    var OptOutListArn: js.UndefOr[String]
    var OptOutListName: js.UndefOr[OptOutListName]
    var OptedOutNumber: js.UndefOr[PhoneNumber]
    var OptedOutTimestamp: js.UndefOr[Timestamp]
  }

  object DeleteOptedOutNumberResult {
    @inline
    def apply(
        EndUserOptedOut: js.UndefOr[PrimitiveBoolean] = js.undefined,
        OptOutListArn: js.UndefOr[String] = js.undefined,
        OptOutListName: js.UndefOr[OptOutListName] = js.undefined,
        OptedOutNumber: js.UndefOr[PhoneNumber] = js.undefined,
        OptedOutTimestamp: js.UndefOr[Timestamp] = js.undefined
    ): DeleteOptedOutNumberResult = {
      val __obj = js.Dynamic.literal()
      EndUserOptedOut.foreach(__v => __obj.updateDynamic("EndUserOptedOut")(__v.asInstanceOf[js.Any]))
      OptOutListArn.foreach(__v => __obj.updateDynamic("OptOutListArn")(__v.asInstanceOf[js.Any]))
      OptOutListName.foreach(__v => __obj.updateDynamic("OptOutListName")(__v.asInstanceOf[js.Any]))
      OptedOutNumber.foreach(__v => __obj.updateDynamic("OptedOutNumber")(__v.asInstanceOf[js.Any]))
      OptedOutTimestamp.foreach(__v => __obj.updateDynamic("OptedOutTimestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteOptedOutNumberResult]
    }
  }

  @js.native
  trait DeletePoolRequest extends js.Object {
    var PoolId: PoolIdOrArn
  }

  object DeletePoolRequest {
    @inline
    def apply(
        PoolId: PoolIdOrArn
    ): DeletePoolRequest = {
      val __obj = js.Dynamic.literal(
        "PoolId" -> PoolId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeletePoolRequest]
    }
  }

  @js.native
  trait DeletePoolResult extends js.Object {
    var CreatedTimestamp: js.UndefOr[Timestamp]
    var MessageType: js.UndefOr[MessageType]
    var OptOutListName: js.UndefOr[OptOutListName]
    var PoolArn: js.UndefOr[String]
    var PoolId: js.UndefOr[String]
    var SelfManagedOptOutsEnabled: js.UndefOr[PrimitiveBoolean]
    var SharedRoutesEnabled: js.UndefOr[PrimitiveBoolean]
    var Status: js.UndefOr[PoolStatus]
    var TwoWayChannelArn: js.UndefOr[TwoWayChannelArn]
    var TwoWayEnabled: js.UndefOr[PrimitiveBoolean]
  }

  object DeletePoolResult {
    @inline
    def apply(
        CreatedTimestamp: js.UndefOr[Timestamp] = js.undefined,
        MessageType: js.UndefOr[MessageType] = js.undefined,
        OptOutListName: js.UndefOr[OptOutListName] = js.undefined,
        PoolArn: js.UndefOr[String] = js.undefined,
        PoolId: js.UndefOr[String] = js.undefined,
        SelfManagedOptOutsEnabled: js.UndefOr[PrimitiveBoolean] = js.undefined,
        SharedRoutesEnabled: js.UndefOr[PrimitiveBoolean] = js.undefined,
        Status: js.UndefOr[PoolStatus] = js.undefined,
        TwoWayChannelArn: js.UndefOr[TwoWayChannelArn] = js.undefined,
        TwoWayEnabled: js.UndefOr[PrimitiveBoolean] = js.undefined
    ): DeletePoolResult = {
      val __obj = js.Dynamic.literal()
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      MessageType.foreach(__v => __obj.updateDynamic("MessageType")(__v.asInstanceOf[js.Any]))
      OptOutListName.foreach(__v => __obj.updateDynamic("OptOutListName")(__v.asInstanceOf[js.Any]))
      PoolArn.foreach(__v => __obj.updateDynamic("PoolArn")(__v.asInstanceOf[js.Any]))
      PoolId.foreach(__v => __obj.updateDynamic("PoolId")(__v.asInstanceOf[js.Any]))
      SelfManagedOptOutsEnabled.foreach(__v => __obj.updateDynamic("SelfManagedOptOutsEnabled")(__v.asInstanceOf[js.Any]))
      SharedRoutesEnabled.foreach(__v => __obj.updateDynamic("SharedRoutesEnabled")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TwoWayChannelArn.foreach(__v => __obj.updateDynamic("TwoWayChannelArn")(__v.asInstanceOf[js.Any]))
      TwoWayEnabled.foreach(__v => __obj.updateDynamic("TwoWayEnabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeletePoolResult]
    }
  }

  @js.native
  trait DeleteTextMessageSpendLimitOverrideRequest extends js.Object

  object DeleteTextMessageSpendLimitOverrideRequest {
    @inline
    def apply(): DeleteTextMessageSpendLimitOverrideRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteTextMessageSpendLimitOverrideRequest]
    }
  }

  @js.native
  trait DeleteTextMessageSpendLimitOverrideResult extends js.Object {
    var MonthlyLimit: js.UndefOr[MonthlyLimit]
  }

  object DeleteTextMessageSpendLimitOverrideResult {
    @inline
    def apply(
        MonthlyLimit: js.UndefOr[MonthlyLimit] = js.undefined
    ): DeleteTextMessageSpendLimitOverrideResult = {
      val __obj = js.Dynamic.literal()
      MonthlyLimit.foreach(__v => __obj.updateDynamic("MonthlyLimit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteTextMessageSpendLimitOverrideResult]
    }
  }

  @js.native
  trait DeleteVoiceMessageSpendLimitOverrideRequest extends js.Object

  object DeleteVoiceMessageSpendLimitOverrideRequest {
    @inline
    def apply(): DeleteVoiceMessageSpendLimitOverrideRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteVoiceMessageSpendLimitOverrideRequest]
    }
  }

  @js.native
  trait DeleteVoiceMessageSpendLimitOverrideResult extends js.Object {
    var MonthlyLimit: js.UndefOr[MonthlyLimit]
  }

  object DeleteVoiceMessageSpendLimitOverrideResult {
    @inline
    def apply(
        MonthlyLimit: js.UndefOr[MonthlyLimit] = js.undefined
    ): DeleteVoiceMessageSpendLimitOverrideResult = {
      val __obj = js.Dynamic.literal()
      MonthlyLimit.foreach(__v => __obj.updateDynamic("MonthlyLimit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteVoiceMessageSpendLimitOverrideResult]
    }
  }

  @js.native
  trait DescribeAccountAttributesRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeAccountAttributesRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeAccountAttributesRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAccountAttributesRequest]
    }
  }

  @js.native
  trait DescribeAccountAttributesResult extends js.Object {
    var AccountAttributes: js.UndefOr[AccountAttributeList]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeAccountAttributesResult {
    @inline
    def apply(
        AccountAttributes: js.UndefOr[AccountAttributeList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeAccountAttributesResult = {
      val __obj = js.Dynamic.literal()
      AccountAttributes.foreach(__v => __obj.updateDynamic("AccountAttributes")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAccountAttributesResult]
    }
  }

  @js.native
  trait DescribeAccountLimitsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeAccountLimitsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeAccountLimitsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAccountLimitsRequest]
    }
  }

  @js.native
  trait DescribeAccountLimitsResult extends js.Object {
    var AccountLimits: js.UndefOr[AccountLimitList]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeAccountLimitsResult {
    @inline
    def apply(
        AccountLimits: js.UndefOr[AccountLimitList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeAccountLimitsResult = {
      val __obj = js.Dynamic.literal()
      AccountLimits.foreach(__v => __obj.updateDynamic("AccountLimits")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAccountLimitsResult]
    }
  }

  @js.native
  trait DescribeConfigurationSetsRequest extends js.Object {
    var ConfigurationSetNames: js.UndefOr[ConfigurationSetNameList]
    var Filters: js.UndefOr[ConfigurationSetFilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeConfigurationSetsRequest {
    @inline
    def apply(
        ConfigurationSetNames: js.UndefOr[ConfigurationSetNameList] = js.undefined,
        Filters: js.UndefOr[ConfigurationSetFilterList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeConfigurationSetsRequest = {
      val __obj = js.Dynamic.literal()
      ConfigurationSetNames.foreach(__v => __obj.updateDynamic("ConfigurationSetNames")(__v.asInstanceOf[js.Any]))
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeConfigurationSetsRequest]
    }
  }

  @js.native
  trait DescribeConfigurationSetsResult extends js.Object {
    var ConfigurationSets: js.UndefOr[ConfigurationSetInformationList]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeConfigurationSetsResult {
    @inline
    def apply(
        ConfigurationSets: js.UndefOr[ConfigurationSetInformationList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeConfigurationSetsResult = {
      val __obj = js.Dynamic.literal()
      ConfigurationSets.foreach(__v => __obj.updateDynamic("ConfigurationSets")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeConfigurationSetsResult]
    }
  }

  @js.native
  trait DescribeKeywordsRequest extends js.Object {
    var OriginationIdentity: PhoneOrPoolIdOrArn
    var Filters: js.UndefOr[KeywordFilterList]
    var Keywords: js.UndefOr[KeywordList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeKeywordsRequest {
    @inline
    def apply(
        OriginationIdentity: PhoneOrPoolIdOrArn,
        Filters: js.UndefOr[KeywordFilterList] = js.undefined,
        Keywords: js.UndefOr[KeywordList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeKeywordsRequest = {
      val __obj = js.Dynamic.literal(
        "OriginationIdentity" -> OriginationIdentity.asInstanceOf[js.Any]
      )

      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      Keywords.foreach(__v => __obj.updateDynamic("Keywords")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeKeywordsRequest]
    }
  }

  @js.native
  trait DescribeKeywordsResult extends js.Object {
    var Keywords: js.UndefOr[KeywordInformationList]
    var NextToken: js.UndefOr[NextToken]
    var OriginationIdentity: js.UndefOr[String]
    var OriginationIdentityArn: js.UndefOr[String]
  }

  object DescribeKeywordsResult {
    @inline
    def apply(
        Keywords: js.UndefOr[KeywordInformationList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        OriginationIdentity: js.UndefOr[String] = js.undefined,
        OriginationIdentityArn: js.UndefOr[String] = js.undefined
    ): DescribeKeywordsResult = {
      val __obj = js.Dynamic.literal()
      Keywords.foreach(__v => __obj.updateDynamic("Keywords")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      OriginationIdentity.foreach(__v => __obj.updateDynamic("OriginationIdentity")(__v.asInstanceOf[js.Any]))
      OriginationIdentityArn.foreach(__v => __obj.updateDynamic("OriginationIdentityArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeKeywordsResult]
    }
  }

  @js.native
  trait DescribeOptOutListsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var OptOutListNames: js.UndefOr[OptOutListNameList]
  }

  object DescribeOptOutListsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        OptOutListNames: js.UndefOr[OptOutListNameList] = js.undefined
    ): DescribeOptOutListsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      OptOutListNames.foreach(__v => __obj.updateDynamic("OptOutListNames")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeOptOutListsRequest]
    }
  }

  @js.native
  trait DescribeOptOutListsResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var OptOutLists: js.UndefOr[OptOutListInformationList]
  }

  object DescribeOptOutListsResult {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        OptOutLists: js.UndefOr[OptOutListInformationList] = js.undefined
    ): DescribeOptOutListsResult = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      OptOutLists.foreach(__v => __obj.updateDynamic("OptOutLists")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeOptOutListsResult]
    }
  }

  @js.native
  trait DescribeOptedOutNumbersRequest extends js.Object {
    var OptOutListName: OptOutListNameOrArn
    var Filters: js.UndefOr[OptedOutFilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var OptedOutNumbers: js.UndefOr[OptedOutNumberList]
  }

  object DescribeOptedOutNumbersRequest {
    @inline
    def apply(
        OptOutListName: OptOutListNameOrArn,
        Filters: js.UndefOr[OptedOutFilterList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        OptedOutNumbers: js.UndefOr[OptedOutNumberList] = js.undefined
    ): DescribeOptedOutNumbersRequest = {
      val __obj = js.Dynamic.literal(
        "OptOutListName" -> OptOutListName.asInstanceOf[js.Any]
      )

      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      OptedOutNumbers.foreach(__v => __obj.updateDynamic("OptedOutNumbers")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeOptedOutNumbersRequest]
    }
  }

  @js.native
  trait DescribeOptedOutNumbersResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var OptOutListArn: js.UndefOr[String]
    var OptOutListName: js.UndefOr[OptOutListName]
    var OptedOutNumbers: js.UndefOr[OptedOutNumberInformationList]
  }

  object DescribeOptedOutNumbersResult {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        OptOutListArn: js.UndefOr[String] = js.undefined,
        OptOutListName: js.UndefOr[OptOutListName] = js.undefined,
        OptedOutNumbers: js.UndefOr[OptedOutNumberInformationList] = js.undefined
    ): DescribeOptedOutNumbersResult = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      OptOutListArn.foreach(__v => __obj.updateDynamic("OptOutListArn")(__v.asInstanceOf[js.Any]))
      OptOutListName.foreach(__v => __obj.updateDynamic("OptOutListName")(__v.asInstanceOf[js.Any]))
      OptedOutNumbers.foreach(__v => __obj.updateDynamic("OptedOutNumbers")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeOptedOutNumbersResult]
    }
  }

  @js.native
  trait DescribePhoneNumbersRequest extends js.Object {
    var Filters: js.UndefOr[PhoneNumberFilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var PhoneNumberIds: js.UndefOr[PhoneNumberIdList]
  }

  object DescribePhoneNumbersRequest {
    @inline
    def apply(
        Filters: js.UndefOr[PhoneNumberFilterList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        PhoneNumberIds: js.UndefOr[PhoneNumberIdList] = js.undefined
    ): DescribePhoneNumbersRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PhoneNumberIds.foreach(__v => __obj.updateDynamic("PhoneNumberIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePhoneNumbersRequest]
    }
  }

  @js.native
  trait DescribePhoneNumbersResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var PhoneNumbers: js.UndefOr[PhoneNumberInformationList]
  }

  object DescribePhoneNumbersResult {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        PhoneNumbers: js.UndefOr[PhoneNumberInformationList] = js.undefined
    ): DescribePhoneNumbersResult = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PhoneNumbers.foreach(__v => __obj.updateDynamic("PhoneNumbers")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePhoneNumbersResult]
    }
  }

  @js.native
  trait DescribePoolsRequest extends js.Object {
    var Filters: js.UndefOr[PoolFilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var PoolIds: js.UndefOr[PoolIdList]
  }

  object DescribePoolsRequest {
    @inline
    def apply(
        Filters: js.UndefOr[PoolFilterList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        PoolIds: js.UndefOr[PoolIdList] = js.undefined
    ): DescribePoolsRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PoolIds.foreach(__v => __obj.updateDynamic("PoolIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePoolsRequest]
    }
  }

  @js.native
  trait DescribePoolsResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Pools: js.UndefOr[PoolInformationList]
  }

  object DescribePoolsResult {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Pools: js.UndefOr[PoolInformationList] = js.undefined
    ): DescribePoolsResult = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Pools.foreach(__v => __obj.updateDynamic("Pools")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePoolsResult]
    }
  }

  @js.native
  trait DescribeSenderIdsRequest extends js.Object {
    var Filters: js.UndefOr[SenderIdFilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var SenderIds: js.UndefOr[SenderIdList]
  }

  object DescribeSenderIdsRequest {
    @inline
    def apply(
        Filters: js.UndefOr[SenderIdFilterList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SenderIds: js.UndefOr[SenderIdList] = js.undefined
    ): DescribeSenderIdsRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SenderIds.foreach(__v => __obj.updateDynamic("SenderIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSenderIdsRequest]
    }
  }

  @js.native
  trait DescribeSenderIdsResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var SenderIds: js.UndefOr[SenderIdInformationList]
  }

  object DescribeSenderIdsResult {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SenderIds: js.UndefOr[SenderIdInformationList] = js.undefined
    ): DescribeSenderIdsResult = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SenderIds.foreach(__v => __obj.updateDynamic("SenderIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSenderIdsResult]
    }
  }

  @js.native
  trait DescribeSpendLimitsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeSpendLimitsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeSpendLimitsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSpendLimitsRequest]
    }
  }

  @js.native
  trait DescribeSpendLimitsResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var SpendLimits: js.UndefOr[SpendLimitList]
  }

  object DescribeSpendLimitsResult {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SpendLimits: js.UndefOr[SpendLimitList] = js.undefined
    ): DescribeSpendLimitsResult = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SpendLimits.foreach(__v => __obj.updateDynamic("SpendLimits")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSpendLimitsResult]
    }
  }

  @js.native
  trait DisassociateOriginationIdentityRequest extends js.Object {
    var IsoCountryCode: IsoCountryCode
    var OriginationIdentity: PhoneOrSenderIdOrArn
    var PoolId: PoolIdOrArn
    var ClientToken: js.UndefOr[ClientToken]
  }

  object DisassociateOriginationIdentityRequest {
    @inline
    def apply(
        IsoCountryCode: IsoCountryCode,
        OriginationIdentity: PhoneOrSenderIdOrArn,
        PoolId: PoolIdOrArn,
        ClientToken: js.UndefOr[ClientToken] = js.undefined
    ): DisassociateOriginationIdentityRequest = {
      val __obj = js.Dynamic.literal(
        "IsoCountryCode" -> IsoCountryCode.asInstanceOf[js.Any],
        "OriginationIdentity" -> OriginationIdentity.asInstanceOf[js.Any],
        "PoolId" -> PoolId.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociateOriginationIdentityRequest]
    }
  }

  @js.native
  trait DisassociateOriginationIdentityResult extends js.Object {
    var IsoCountryCode: js.UndefOr[IsoCountryCode]
    var OriginationIdentity: js.UndefOr[String]
    var OriginationIdentityArn: js.UndefOr[String]
    var PoolArn: js.UndefOr[String]
    var PoolId: js.UndefOr[String]
  }

  object DisassociateOriginationIdentityResult {
    @inline
    def apply(
        IsoCountryCode: js.UndefOr[IsoCountryCode] = js.undefined,
        OriginationIdentity: js.UndefOr[String] = js.undefined,
        OriginationIdentityArn: js.UndefOr[String] = js.undefined,
        PoolArn: js.UndefOr[String] = js.undefined,
        PoolId: js.UndefOr[String] = js.undefined
    ): DisassociateOriginationIdentityResult = {
      val __obj = js.Dynamic.literal()
      IsoCountryCode.foreach(__v => __obj.updateDynamic("IsoCountryCode")(__v.asInstanceOf[js.Any]))
      OriginationIdentity.foreach(__v => __obj.updateDynamic("OriginationIdentity")(__v.asInstanceOf[js.Any]))
      OriginationIdentityArn.foreach(__v => __obj.updateDynamic("OriginationIdentityArn")(__v.asInstanceOf[js.Any]))
      PoolArn.foreach(__v => __obj.updateDynamic("PoolArn")(__v.asInstanceOf[js.Any]))
      PoolId.foreach(__v => __obj.updateDynamic("PoolId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociateOriginationIdentityResult]
    }
  }

  /** Contains information about an event destination. Event destinations are associated with configuration sets, which enable you to publish message sending events to Amazon CloudWatch, Amazon Kinesis Data Firehose, or Amazon SNS.
    */
  @js.native
  trait EventDestination extends js.Object {
    var Enabled: Boolean
    var EventDestinationName: EventDestinationName
    var MatchingEventTypes: EventTypeList
    var CloudWatchLogsDestination: js.UndefOr[CloudWatchLogsDestination]
    var KinesisFirehoseDestination: js.UndefOr[KinesisFirehoseDestination]
    var SnsDestination: js.UndefOr[SnsDestination]
  }

  object EventDestination {
    @inline
    def apply(
        Enabled: Boolean,
        EventDestinationName: EventDestinationName,
        MatchingEventTypes: EventTypeList,
        CloudWatchLogsDestination: js.UndefOr[CloudWatchLogsDestination] = js.undefined,
        KinesisFirehoseDestination: js.UndefOr[KinesisFirehoseDestination] = js.undefined,
        SnsDestination: js.UndefOr[SnsDestination] = js.undefined
    ): EventDestination = {
      val __obj = js.Dynamic.literal(
        "Enabled" -> Enabled.asInstanceOf[js.Any],
        "EventDestinationName" -> EventDestinationName.asInstanceOf[js.Any],
        "MatchingEventTypes" -> MatchingEventTypes.asInstanceOf[js.Any]
      )

      CloudWatchLogsDestination.foreach(__v => __obj.updateDynamic("CloudWatchLogsDestination")(__v.asInstanceOf[js.Any]))
      KinesisFirehoseDestination.foreach(__v => __obj.updateDynamic("KinesisFirehoseDestination")(__v.asInstanceOf[js.Any]))
      SnsDestination.foreach(__v => __obj.updateDynamic("SnsDestination")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventDestination]
    }
  }

  /** The information for keywords that meet a specified criteria.
    */
  @js.native
  trait KeywordFilter extends js.Object {
    var Name: KeywordFilterName
    var Values: FilterValueList
  }

  object KeywordFilter {
    @inline
    def apply(
        Name: KeywordFilterName,
        Values: FilterValueList
    ): KeywordFilter = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[KeywordFilter]
    }
  }

  /** The information for all keywords in a pool.
    */
  @js.native
  trait KeywordInformation extends js.Object {
    var Keyword: Keyword
    var KeywordAction: KeywordAction
    var KeywordMessage: KeywordMessage
  }

  object KeywordInformation {
    @inline
    def apply(
        Keyword: Keyword,
        KeywordAction: KeywordAction,
        KeywordMessage: KeywordMessage
    ): KeywordInformation = {
      val __obj = js.Dynamic.literal(
        "Keyword" -> Keyword.asInstanceOf[js.Any],
        "KeywordAction" -> KeywordAction.asInstanceOf[js.Any],
        "KeywordMessage" -> KeywordMessage.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[KeywordInformation]
    }
  }

  /** Contains the delivery stream Amazon Resource Name (ARN), and the ARN of the Identity and Access Management (IAM) role associated with an Kinesis Data Firehose event destination. Event destinations, such as Kinesis Data Firehose, are associated with configuration sets, which enable you to publish message sending events.
    */
  @js.native
  trait KinesisFirehoseDestination extends js.Object {
    var DeliveryStreamArn: DeliveryStreamArn
    var IamRoleArn: IamRoleArn
  }

  object KinesisFirehoseDestination {
    @inline
    def apply(
        DeliveryStreamArn: DeliveryStreamArn,
        IamRoleArn: IamRoleArn
    ): KinesisFirehoseDestination = {
      val __obj = js.Dynamic.literal(
        "DeliveryStreamArn" -> DeliveryStreamArn.asInstanceOf[js.Any],
        "IamRoleArn" -> IamRoleArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[KinesisFirehoseDestination]
    }
  }

  @js.native
  trait ListPoolOriginationIdentitiesRequest extends js.Object {
    var PoolId: PoolIdOrArn
    var Filters: js.UndefOr[PoolOriginationIdentitiesFilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListPoolOriginationIdentitiesRequest {
    @inline
    def apply(
        PoolId: PoolIdOrArn,
        Filters: js.UndefOr[PoolOriginationIdentitiesFilterList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListPoolOriginationIdentitiesRequest = {
      val __obj = js.Dynamic.literal(
        "PoolId" -> PoolId.asInstanceOf[js.Any]
      )

      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPoolOriginationIdentitiesRequest]
    }
  }

  @js.native
  trait ListPoolOriginationIdentitiesResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var OriginationIdentities: js.UndefOr[OriginationIdentityMetadataList]
    var PoolArn: js.UndefOr[String]
    var PoolId: js.UndefOr[String]
  }

  object ListPoolOriginationIdentitiesResult {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        OriginationIdentities: js.UndefOr[OriginationIdentityMetadataList] = js.undefined,
        PoolArn: js.UndefOr[String] = js.undefined,
        PoolId: js.UndefOr[String] = js.undefined
    ): ListPoolOriginationIdentitiesResult = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      OriginationIdentities.foreach(__v => __obj.updateDynamic("OriginationIdentities")(__v.asInstanceOf[js.Any]))
      PoolArn.foreach(__v => __obj.updateDynamic("PoolArn")(__v.asInstanceOf[js.Any]))
      PoolId.foreach(__v => __obj.updateDynamic("PoolId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPoolOriginationIdentitiesResult]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: AmazonResourceName
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceArn: AmazonResourceName
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResult extends js.Object {
    var ResourceArn: js.UndefOr[AmazonResourceName]
    var Tags: js.UndefOr[TagList]
  }

  object ListTagsForResourceResult {
    @inline
    def apply(
        ResourceArn: js.UndefOr[AmazonResourceName] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceResult = {
      val __obj = js.Dynamic.literal()
      ResourceArn.foreach(__v => __obj.updateDynamic("ResourceArn")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResult]
    }
  }

  /** The information for all OptOutList in an Amazon Web Services account.
    */
  @js.native
  trait OptOutListInformation extends js.Object {
    var CreatedTimestamp: Timestamp
    var OptOutListArn: String
    var OptOutListName: OptOutListName
  }

  object OptOutListInformation {
    @inline
    def apply(
        CreatedTimestamp: Timestamp,
        OptOutListArn: String,
        OptOutListName: OptOutListName
    ): OptOutListInformation = {
      val __obj = js.Dynamic.literal(
        "CreatedTimestamp" -> CreatedTimestamp.asInstanceOf[js.Any],
        "OptOutListArn" -> OptOutListArn.asInstanceOf[js.Any],
        "OptOutListName" -> OptOutListName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[OptOutListInformation]
    }
  }

  /** The information for opted out numbers that meet a specified criteria.
    */
  @js.native
  trait OptedOutFilter extends js.Object {
    var Name: OptedOutFilterName
    var Values: FilterValueList
  }

  object OptedOutFilter {
    @inline
    def apply(
        Name: OptedOutFilterName,
        Values: FilterValueList
    ): OptedOutFilter = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[OptedOutFilter]
    }
  }

  /** The information for an opted out number in an Amazon Web Services account.
    */
  @js.native
  trait OptedOutNumberInformation extends js.Object {
    var EndUserOptedOut: PrimitiveBoolean
    var OptedOutNumber: PhoneNumber
    var OptedOutTimestamp: Timestamp
  }

  object OptedOutNumberInformation {
    @inline
    def apply(
        EndUserOptedOut: PrimitiveBoolean,
        OptedOutNumber: PhoneNumber,
        OptedOutTimestamp: Timestamp
    ): OptedOutNumberInformation = {
      val __obj = js.Dynamic.literal(
        "EndUserOptedOut" -> EndUserOptedOut.asInstanceOf[js.Any],
        "OptedOutNumber" -> OptedOutNumber.asInstanceOf[js.Any],
        "OptedOutTimestamp" -> OptedOutTimestamp.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[OptedOutNumberInformation]
    }
  }

  /** The metadata for an origination identity associated with a pool.
    */
  @js.native
  trait OriginationIdentityMetadata extends js.Object {
    var IsoCountryCode: IsoCountryCode
    var NumberCapabilities: NumberCapabilityList
    var OriginationIdentity: String
    var OriginationIdentityArn: String
  }

  object OriginationIdentityMetadata {
    @inline
    def apply(
        IsoCountryCode: IsoCountryCode,
        NumberCapabilities: NumberCapabilityList,
        OriginationIdentity: String,
        OriginationIdentityArn: String
    ): OriginationIdentityMetadata = {
      val __obj = js.Dynamic.literal(
        "IsoCountryCode" -> IsoCountryCode.asInstanceOf[js.Any],
        "NumberCapabilities" -> NumberCapabilities.asInstanceOf[js.Any],
        "OriginationIdentity" -> OriginationIdentity.asInstanceOf[js.Any],
        "OriginationIdentityArn" -> OriginationIdentityArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[OriginationIdentityMetadata]
    }
  }

  /** The information for a phone number that meets a specified criteria.
    */
  @js.native
  trait PhoneNumberFilter extends js.Object {
    var Name: PhoneNumberFilterName
    var Values: FilterValueList
  }

  object PhoneNumberFilter {
    @inline
    def apply(
        Name: PhoneNumberFilterName,
        Values: FilterValueList
    ): PhoneNumberFilter = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PhoneNumberFilter]
    }
  }

  /** The information for a phone number in an Amazon Web Services account.
    */
  @js.native
  trait PhoneNumberInformation extends js.Object {
    var CreatedTimestamp: Timestamp
    var DeletionProtectionEnabled: PrimitiveBoolean
    var IsoCountryCode: IsoCountryCode
    var MessageType: MessageType
    var MonthlyLeasingPrice: String
    var NumberCapabilities: NumberCapabilityList
    var NumberType: NumberType
    var OptOutListName: OptOutListName
    var PhoneNumber: PhoneNumber
    var PhoneNumberArn: String
    var SelfManagedOptOutsEnabled: PrimitiveBoolean
    var Status: NumberStatus
    var TwoWayEnabled: PrimitiveBoolean
    var PhoneNumberId: js.UndefOr[String]
    var PoolId: js.UndefOr[String]
    var TwoWayChannelArn: js.UndefOr[TwoWayChannelArn]
  }

  object PhoneNumberInformation {
    @inline
    def apply(
        CreatedTimestamp: Timestamp,
        DeletionProtectionEnabled: PrimitiveBoolean,
        IsoCountryCode: IsoCountryCode,
        MessageType: MessageType,
        MonthlyLeasingPrice: String,
        NumberCapabilities: NumberCapabilityList,
        NumberType: NumberType,
        OptOutListName: OptOutListName,
        PhoneNumber: PhoneNumber,
        PhoneNumberArn: String,
        SelfManagedOptOutsEnabled: PrimitiveBoolean,
        Status: NumberStatus,
        TwoWayEnabled: PrimitiveBoolean,
        PhoneNumberId: js.UndefOr[String] = js.undefined,
        PoolId: js.UndefOr[String] = js.undefined,
        TwoWayChannelArn: js.UndefOr[TwoWayChannelArn] = js.undefined
    ): PhoneNumberInformation = {
      val __obj = js.Dynamic.literal(
        "CreatedTimestamp" -> CreatedTimestamp.asInstanceOf[js.Any],
        "DeletionProtectionEnabled" -> DeletionProtectionEnabled.asInstanceOf[js.Any],
        "IsoCountryCode" -> IsoCountryCode.asInstanceOf[js.Any],
        "MessageType" -> MessageType.asInstanceOf[js.Any],
        "MonthlyLeasingPrice" -> MonthlyLeasingPrice.asInstanceOf[js.Any],
        "NumberCapabilities" -> NumberCapabilities.asInstanceOf[js.Any],
        "NumberType" -> NumberType.asInstanceOf[js.Any],
        "OptOutListName" -> OptOutListName.asInstanceOf[js.Any],
        "PhoneNumber" -> PhoneNumber.asInstanceOf[js.Any],
        "PhoneNumberArn" -> PhoneNumberArn.asInstanceOf[js.Any],
        "SelfManagedOptOutsEnabled" -> SelfManagedOptOutsEnabled.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any],
        "TwoWayEnabled" -> TwoWayEnabled.asInstanceOf[js.Any]
      )

      PhoneNumberId.foreach(__v => __obj.updateDynamic("PhoneNumberId")(__v.asInstanceOf[js.Any]))
      PoolId.foreach(__v => __obj.updateDynamic("PoolId")(__v.asInstanceOf[js.Any]))
      TwoWayChannelArn.foreach(__v => __obj.updateDynamic("TwoWayChannelArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PhoneNumberInformation]
    }
  }

  /** The information for a pool that meets a specified criteria.
    */
  @js.native
  trait PoolFilter extends js.Object {
    var Name: PoolFilterName
    var Values: FilterValueList
  }

  object PoolFilter {
    @inline
    def apply(
        Name: PoolFilterName,
        Values: FilterValueList
    ): PoolFilter = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PoolFilter]
    }
  }

  /** The information for a pool in an Amazon Web Services account.
    */
  @js.native
  trait PoolInformation extends js.Object {
    var CreatedTimestamp: Timestamp
    var DeletionProtectionEnabled: PrimitiveBoolean
    var MessageType: MessageType
    var OptOutListName: OptOutListName
    var PoolArn: String
    var PoolId: String
    var SelfManagedOptOutsEnabled: PrimitiveBoolean
    var SharedRoutesEnabled: PrimitiveBoolean
    var Status: PoolStatus
    var TwoWayEnabled: PrimitiveBoolean
    var TwoWayChannelArn: js.UndefOr[TwoWayChannelArn]
  }

  object PoolInformation {
    @inline
    def apply(
        CreatedTimestamp: Timestamp,
        DeletionProtectionEnabled: PrimitiveBoolean,
        MessageType: MessageType,
        OptOutListName: OptOutListName,
        PoolArn: String,
        PoolId: String,
        SelfManagedOptOutsEnabled: PrimitiveBoolean,
        SharedRoutesEnabled: PrimitiveBoolean,
        Status: PoolStatus,
        TwoWayEnabled: PrimitiveBoolean,
        TwoWayChannelArn: js.UndefOr[TwoWayChannelArn] = js.undefined
    ): PoolInformation = {
      val __obj = js.Dynamic.literal(
        "CreatedTimestamp" -> CreatedTimestamp.asInstanceOf[js.Any],
        "DeletionProtectionEnabled" -> DeletionProtectionEnabled.asInstanceOf[js.Any],
        "MessageType" -> MessageType.asInstanceOf[js.Any],
        "OptOutListName" -> OptOutListName.asInstanceOf[js.Any],
        "PoolArn" -> PoolArn.asInstanceOf[js.Any],
        "PoolId" -> PoolId.asInstanceOf[js.Any],
        "SelfManagedOptOutsEnabled" -> SelfManagedOptOutsEnabled.asInstanceOf[js.Any],
        "SharedRoutesEnabled" -> SharedRoutesEnabled.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any],
        "TwoWayEnabled" -> TwoWayEnabled.asInstanceOf[js.Any]
      )

      TwoWayChannelArn.foreach(__v => __obj.updateDynamic("TwoWayChannelArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PoolInformation]
    }
  }

  /** Information about origination identities associated with a pool that meets a specified criteria.
    */
  @js.native
  trait PoolOriginationIdentitiesFilter extends js.Object {
    var Name: PoolOriginationIdentitiesFilterName
    var Values: FilterValueList
  }

  object PoolOriginationIdentitiesFilter {
    @inline
    def apply(
        Name: PoolOriginationIdentitiesFilterName,
        Values: FilterValueList
    ): PoolOriginationIdentitiesFilter = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PoolOriginationIdentitiesFilter]
    }
  }

  @js.native
  trait PutKeywordRequest extends js.Object {
    var Keyword: Keyword
    var KeywordMessage: KeywordMessage
    var OriginationIdentity: PhoneOrPoolIdOrArn
    var KeywordAction: js.UndefOr[KeywordAction]
  }

  object PutKeywordRequest {
    @inline
    def apply(
        Keyword: Keyword,
        KeywordMessage: KeywordMessage,
        OriginationIdentity: PhoneOrPoolIdOrArn,
        KeywordAction: js.UndefOr[KeywordAction] = js.undefined
    ): PutKeywordRequest = {
      val __obj = js.Dynamic.literal(
        "Keyword" -> Keyword.asInstanceOf[js.Any],
        "KeywordMessage" -> KeywordMessage.asInstanceOf[js.Any],
        "OriginationIdentity" -> OriginationIdentity.asInstanceOf[js.Any]
      )

      KeywordAction.foreach(__v => __obj.updateDynamic("KeywordAction")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutKeywordRequest]
    }
  }

  @js.native
  trait PutKeywordResult extends js.Object {
    var Keyword: js.UndefOr[Keyword]
    var KeywordAction: js.UndefOr[KeywordAction]
    var KeywordMessage: js.UndefOr[KeywordMessage]
    var OriginationIdentity: js.UndefOr[String]
    var OriginationIdentityArn: js.UndefOr[String]
  }

  object PutKeywordResult {
    @inline
    def apply(
        Keyword: js.UndefOr[Keyword] = js.undefined,
        KeywordAction: js.UndefOr[KeywordAction] = js.undefined,
        KeywordMessage: js.UndefOr[KeywordMessage] = js.undefined,
        OriginationIdentity: js.UndefOr[String] = js.undefined,
        OriginationIdentityArn: js.UndefOr[String] = js.undefined
    ): PutKeywordResult = {
      val __obj = js.Dynamic.literal()
      Keyword.foreach(__v => __obj.updateDynamic("Keyword")(__v.asInstanceOf[js.Any]))
      KeywordAction.foreach(__v => __obj.updateDynamic("KeywordAction")(__v.asInstanceOf[js.Any]))
      KeywordMessage.foreach(__v => __obj.updateDynamic("KeywordMessage")(__v.asInstanceOf[js.Any]))
      OriginationIdentity.foreach(__v => __obj.updateDynamic("OriginationIdentity")(__v.asInstanceOf[js.Any]))
      OriginationIdentityArn.foreach(__v => __obj.updateDynamic("OriginationIdentityArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutKeywordResult]
    }
  }

  @js.native
  trait PutOptedOutNumberRequest extends js.Object {
    var OptOutListName: OptOutListNameOrArn
    var OptedOutNumber: PhoneNumber
  }

  object PutOptedOutNumberRequest {
    @inline
    def apply(
        OptOutListName: OptOutListNameOrArn,
        OptedOutNumber: PhoneNumber
    ): PutOptedOutNumberRequest = {
      val __obj = js.Dynamic.literal(
        "OptOutListName" -> OptOutListName.asInstanceOf[js.Any],
        "OptedOutNumber" -> OptedOutNumber.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutOptedOutNumberRequest]
    }
  }

  @js.native
  trait PutOptedOutNumberResult extends js.Object {
    var EndUserOptedOut: js.UndefOr[PrimitiveBoolean]
    var OptOutListArn: js.UndefOr[String]
    var OptOutListName: js.UndefOr[OptOutListName]
    var OptedOutNumber: js.UndefOr[PhoneNumber]
    var OptedOutTimestamp: js.UndefOr[Timestamp]
  }

  object PutOptedOutNumberResult {
    @inline
    def apply(
        EndUserOptedOut: js.UndefOr[PrimitiveBoolean] = js.undefined,
        OptOutListArn: js.UndefOr[String] = js.undefined,
        OptOutListName: js.UndefOr[OptOutListName] = js.undefined,
        OptedOutNumber: js.UndefOr[PhoneNumber] = js.undefined,
        OptedOutTimestamp: js.UndefOr[Timestamp] = js.undefined
    ): PutOptedOutNumberResult = {
      val __obj = js.Dynamic.literal()
      EndUserOptedOut.foreach(__v => __obj.updateDynamic("EndUserOptedOut")(__v.asInstanceOf[js.Any]))
      OptOutListArn.foreach(__v => __obj.updateDynamic("OptOutListArn")(__v.asInstanceOf[js.Any]))
      OptOutListName.foreach(__v => __obj.updateDynamic("OptOutListName")(__v.asInstanceOf[js.Any]))
      OptedOutNumber.foreach(__v => __obj.updateDynamic("OptedOutNumber")(__v.asInstanceOf[js.Any]))
      OptedOutTimestamp.foreach(__v => __obj.updateDynamic("OptedOutTimestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutOptedOutNumberResult]
    }
  }

  @js.native
  trait ReleasePhoneNumberRequest extends js.Object {
    var PhoneNumberId: PhoneNumberIdOrArn
  }

  object ReleasePhoneNumberRequest {
    @inline
    def apply(
        PhoneNumberId: PhoneNumberIdOrArn
    ): ReleasePhoneNumberRequest = {
      val __obj = js.Dynamic.literal(
        "PhoneNumberId" -> PhoneNumberId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ReleasePhoneNumberRequest]
    }
  }

  @js.native
  trait ReleasePhoneNumberResult extends js.Object {
    var CreatedTimestamp: js.UndefOr[Timestamp]
    var IsoCountryCode: js.UndefOr[IsoCountryCode]
    var MessageType: js.UndefOr[MessageType]
    var MonthlyLeasingPrice: js.UndefOr[String]
    var NumberCapabilities: js.UndefOr[NumberCapabilityList]
    var NumberType: js.UndefOr[NumberType]
    var OptOutListName: js.UndefOr[OptOutListName]
    var PhoneNumber: js.UndefOr[PhoneNumber]
    var PhoneNumberArn: js.UndefOr[String]
    var PhoneNumberId: js.UndefOr[String]
    var SelfManagedOptOutsEnabled: js.UndefOr[PrimitiveBoolean]
    var Status: js.UndefOr[NumberStatus]
    var TwoWayChannelArn: js.UndefOr[TwoWayChannelArn]
    var TwoWayEnabled: js.UndefOr[PrimitiveBoolean]
  }

  object ReleasePhoneNumberResult {
    @inline
    def apply(
        CreatedTimestamp: js.UndefOr[Timestamp] = js.undefined,
        IsoCountryCode: js.UndefOr[IsoCountryCode] = js.undefined,
        MessageType: js.UndefOr[MessageType] = js.undefined,
        MonthlyLeasingPrice: js.UndefOr[String] = js.undefined,
        NumberCapabilities: js.UndefOr[NumberCapabilityList] = js.undefined,
        NumberType: js.UndefOr[NumberType] = js.undefined,
        OptOutListName: js.UndefOr[OptOutListName] = js.undefined,
        PhoneNumber: js.UndefOr[PhoneNumber] = js.undefined,
        PhoneNumberArn: js.UndefOr[String] = js.undefined,
        PhoneNumberId: js.UndefOr[String] = js.undefined,
        SelfManagedOptOutsEnabled: js.UndefOr[PrimitiveBoolean] = js.undefined,
        Status: js.UndefOr[NumberStatus] = js.undefined,
        TwoWayChannelArn: js.UndefOr[TwoWayChannelArn] = js.undefined,
        TwoWayEnabled: js.UndefOr[PrimitiveBoolean] = js.undefined
    ): ReleasePhoneNumberResult = {
      val __obj = js.Dynamic.literal()
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      IsoCountryCode.foreach(__v => __obj.updateDynamic("IsoCountryCode")(__v.asInstanceOf[js.Any]))
      MessageType.foreach(__v => __obj.updateDynamic("MessageType")(__v.asInstanceOf[js.Any]))
      MonthlyLeasingPrice.foreach(__v => __obj.updateDynamic("MonthlyLeasingPrice")(__v.asInstanceOf[js.Any]))
      NumberCapabilities.foreach(__v => __obj.updateDynamic("NumberCapabilities")(__v.asInstanceOf[js.Any]))
      NumberType.foreach(__v => __obj.updateDynamic("NumberType")(__v.asInstanceOf[js.Any]))
      OptOutListName.foreach(__v => __obj.updateDynamic("OptOutListName")(__v.asInstanceOf[js.Any]))
      PhoneNumber.foreach(__v => __obj.updateDynamic("PhoneNumber")(__v.asInstanceOf[js.Any]))
      PhoneNumberArn.foreach(__v => __obj.updateDynamic("PhoneNumberArn")(__v.asInstanceOf[js.Any]))
      PhoneNumberId.foreach(__v => __obj.updateDynamic("PhoneNumberId")(__v.asInstanceOf[js.Any]))
      SelfManagedOptOutsEnabled.foreach(__v => __obj.updateDynamic("SelfManagedOptOutsEnabled")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TwoWayChannelArn.foreach(__v => __obj.updateDynamic("TwoWayChannelArn")(__v.asInstanceOf[js.Any]))
      TwoWayEnabled.foreach(__v => __obj.updateDynamic("TwoWayEnabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReleasePhoneNumberResult]
    }
  }

  @js.native
  trait RequestPhoneNumberRequest extends js.Object {
    var IsoCountryCode: IsoCountryCode
    var MessageType: MessageType
    var NumberCapabilities: NumberCapabilityList
    var NumberType: RequestableNumberType
    var ClientToken: js.UndefOr[ClientToken]
    var DeletionProtectionEnabled: js.UndefOr[Boolean]
    var OptOutListName: js.UndefOr[OptOutListNameOrArn]
    var PoolId: js.UndefOr[PoolIdOrArn]
    var RegistrationId: js.UndefOr[RegistrationId]
    var Tags: js.UndefOr[TagList]
  }

  object RequestPhoneNumberRequest {
    @inline
    def apply(
        IsoCountryCode: IsoCountryCode,
        MessageType: MessageType,
        NumberCapabilities: NumberCapabilityList,
        NumberType: RequestableNumberType,
        ClientToken: js.UndefOr[ClientToken] = js.undefined,
        DeletionProtectionEnabled: js.UndefOr[Boolean] = js.undefined,
        OptOutListName: js.UndefOr[OptOutListNameOrArn] = js.undefined,
        PoolId: js.UndefOr[PoolIdOrArn] = js.undefined,
        RegistrationId: js.UndefOr[RegistrationId] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): RequestPhoneNumberRequest = {
      val __obj = js.Dynamic.literal(
        "IsoCountryCode" -> IsoCountryCode.asInstanceOf[js.Any],
        "MessageType" -> MessageType.asInstanceOf[js.Any],
        "NumberCapabilities" -> NumberCapabilities.asInstanceOf[js.Any],
        "NumberType" -> NumberType.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      DeletionProtectionEnabled.foreach(__v => __obj.updateDynamic("DeletionProtectionEnabled")(__v.asInstanceOf[js.Any]))
      OptOutListName.foreach(__v => __obj.updateDynamic("OptOutListName")(__v.asInstanceOf[js.Any]))
      PoolId.foreach(__v => __obj.updateDynamic("PoolId")(__v.asInstanceOf[js.Any]))
      RegistrationId.foreach(__v => __obj.updateDynamic("RegistrationId")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RequestPhoneNumberRequest]
    }
  }

  @js.native
  trait RequestPhoneNumberResult extends js.Object {
    var CreatedTimestamp: js.UndefOr[Timestamp]
    var DeletionProtectionEnabled: js.UndefOr[PrimitiveBoolean]
    var IsoCountryCode: js.UndefOr[IsoCountryCode]
    var MessageType: js.UndefOr[MessageType]
    var MonthlyLeasingPrice: js.UndefOr[String]
    var NumberCapabilities: js.UndefOr[NumberCapabilityList]
    var NumberType: js.UndefOr[RequestableNumberType]
    var OptOutListName: js.UndefOr[OptOutListName]
    var PhoneNumber: js.UndefOr[PhoneNumber]
    var PhoneNumberArn: js.UndefOr[String]
    var PhoneNumberId: js.UndefOr[String]
    var PoolId: js.UndefOr[String]
    var SelfManagedOptOutsEnabled: js.UndefOr[PrimitiveBoolean]
    var Status: js.UndefOr[NumberStatus]
    var Tags: js.UndefOr[TagList]
    var TwoWayChannelArn: js.UndefOr[TwoWayChannelArn]
    var TwoWayEnabled: js.UndefOr[PrimitiveBoolean]
  }

  object RequestPhoneNumberResult {
    @inline
    def apply(
        CreatedTimestamp: js.UndefOr[Timestamp] = js.undefined,
        DeletionProtectionEnabled: js.UndefOr[PrimitiveBoolean] = js.undefined,
        IsoCountryCode: js.UndefOr[IsoCountryCode] = js.undefined,
        MessageType: js.UndefOr[MessageType] = js.undefined,
        MonthlyLeasingPrice: js.UndefOr[String] = js.undefined,
        NumberCapabilities: js.UndefOr[NumberCapabilityList] = js.undefined,
        NumberType: js.UndefOr[RequestableNumberType] = js.undefined,
        OptOutListName: js.UndefOr[OptOutListName] = js.undefined,
        PhoneNumber: js.UndefOr[PhoneNumber] = js.undefined,
        PhoneNumberArn: js.UndefOr[String] = js.undefined,
        PhoneNumberId: js.UndefOr[String] = js.undefined,
        PoolId: js.UndefOr[String] = js.undefined,
        SelfManagedOptOutsEnabled: js.UndefOr[PrimitiveBoolean] = js.undefined,
        Status: js.UndefOr[NumberStatus] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        TwoWayChannelArn: js.UndefOr[TwoWayChannelArn] = js.undefined,
        TwoWayEnabled: js.UndefOr[PrimitiveBoolean] = js.undefined
    ): RequestPhoneNumberResult = {
      val __obj = js.Dynamic.literal()
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      DeletionProtectionEnabled.foreach(__v => __obj.updateDynamic("DeletionProtectionEnabled")(__v.asInstanceOf[js.Any]))
      IsoCountryCode.foreach(__v => __obj.updateDynamic("IsoCountryCode")(__v.asInstanceOf[js.Any]))
      MessageType.foreach(__v => __obj.updateDynamic("MessageType")(__v.asInstanceOf[js.Any]))
      MonthlyLeasingPrice.foreach(__v => __obj.updateDynamic("MonthlyLeasingPrice")(__v.asInstanceOf[js.Any]))
      NumberCapabilities.foreach(__v => __obj.updateDynamic("NumberCapabilities")(__v.asInstanceOf[js.Any]))
      NumberType.foreach(__v => __obj.updateDynamic("NumberType")(__v.asInstanceOf[js.Any]))
      OptOutListName.foreach(__v => __obj.updateDynamic("OptOutListName")(__v.asInstanceOf[js.Any]))
      PhoneNumber.foreach(__v => __obj.updateDynamic("PhoneNumber")(__v.asInstanceOf[js.Any]))
      PhoneNumberArn.foreach(__v => __obj.updateDynamic("PhoneNumberArn")(__v.asInstanceOf[js.Any]))
      PhoneNumberId.foreach(__v => __obj.updateDynamic("PhoneNumberId")(__v.asInstanceOf[js.Any]))
      PoolId.foreach(__v => __obj.updateDynamic("PoolId")(__v.asInstanceOf[js.Any]))
      SelfManagedOptOutsEnabled.foreach(__v => __obj.updateDynamic("SelfManagedOptOutsEnabled")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TwoWayChannelArn.foreach(__v => __obj.updateDynamic("TwoWayChannelArn")(__v.asInstanceOf[js.Any]))
      TwoWayEnabled.foreach(__v => __obj.updateDynamic("TwoWayEnabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RequestPhoneNumberResult]
    }
  }

  @js.native
  trait SendTextMessageRequest extends js.Object {
    var DestinationPhoneNumber: PhoneNumber
    var ConfigurationSetName: js.UndefOr[ConfigurationSetNameOrArn]
    var Context: js.UndefOr[ContextMap]
    var DestinationCountryParameters: js.UndefOr[DestinationCountryParameters]
    var DryRun: js.UndefOr[PrimitiveBoolean]
    var Keyword: js.UndefOr[Keyword]
    var MaxPrice: js.UndefOr[MaxPrice]
    var MessageBody: js.UndefOr[TextMessageBody]
    var MessageType: js.UndefOr[MessageType]
    var OriginationIdentity: js.UndefOr[TextMessageOriginationIdentity]
    var TimeToLive: js.UndefOr[TimeToLive]
  }

  object SendTextMessageRequest {
    @inline
    def apply(
        DestinationPhoneNumber: PhoneNumber,
        ConfigurationSetName: js.UndefOr[ConfigurationSetNameOrArn] = js.undefined,
        Context: js.UndefOr[ContextMap] = js.undefined,
        DestinationCountryParameters: js.UndefOr[DestinationCountryParameters] = js.undefined,
        DryRun: js.UndefOr[PrimitiveBoolean] = js.undefined,
        Keyword: js.UndefOr[Keyword] = js.undefined,
        MaxPrice: js.UndefOr[MaxPrice] = js.undefined,
        MessageBody: js.UndefOr[TextMessageBody] = js.undefined,
        MessageType: js.UndefOr[MessageType] = js.undefined,
        OriginationIdentity: js.UndefOr[TextMessageOriginationIdentity] = js.undefined,
        TimeToLive: js.UndefOr[TimeToLive] = js.undefined
    ): SendTextMessageRequest = {
      val __obj = js.Dynamic.literal(
        "DestinationPhoneNumber" -> DestinationPhoneNumber.asInstanceOf[js.Any]
      )

      ConfigurationSetName.foreach(__v => __obj.updateDynamic("ConfigurationSetName")(__v.asInstanceOf[js.Any]))
      Context.foreach(__v => __obj.updateDynamic("Context")(__v.asInstanceOf[js.Any]))
      DestinationCountryParameters.foreach(__v => __obj.updateDynamic("DestinationCountryParameters")(__v.asInstanceOf[js.Any]))
      DryRun.foreach(__v => __obj.updateDynamic("DryRun")(__v.asInstanceOf[js.Any]))
      Keyword.foreach(__v => __obj.updateDynamic("Keyword")(__v.asInstanceOf[js.Any]))
      MaxPrice.foreach(__v => __obj.updateDynamic("MaxPrice")(__v.asInstanceOf[js.Any]))
      MessageBody.foreach(__v => __obj.updateDynamic("MessageBody")(__v.asInstanceOf[js.Any]))
      MessageType.foreach(__v => __obj.updateDynamic("MessageType")(__v.asInstanceOf[js.Any]))
      OriginationIdentity.foreach(__v => __obj.updateDynamic("OriginationIdentity")(__v.asInstanceOf[js.Any]))
      TimeToLive.foreach(__v => __obj.updateDynamic("TimeToLive")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendTextMessageRequest]
    }
  }

  @js.native
  trait SendTextMessageResult extends js.Object {
    var MessageId: js.UndefOr[String]
  }

  object SendTextMessageResult {
    @inline
    def apply(
        MessageId: js.UndefOr[String] = js.undefined
    ): SendTextMessageResult = {
      val __obj = js.Dynamic.literal()
      MessageId.foreach(__v => __obj.updateDynamic("MessageId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendTextMessageResult]
    }
  }

  @js.native
  trait SendVoiceMessageRequest extends js.Object {
    var DestinationPhoneNumber: PhoneNumber
    var OriginationIdentity: VoiceMessageOriginationIdentity
    var ConfigurationSetName: js.UndefOr[ConfigurationSetNameOrArn]
    var Context: js.UndefOr[ContextMap]
    var DryRun: js.UndefOr[PrimitiveBoolean]
    var MaxPricePerMinute: js.UndefOr[MaxPrice]
    var MessageBody: js.UndefOr[VoiceMessageBody]
    var MessageBodyTextType: js.UndefOr[VoiceMessageBodyTextType]
    var TimeToLive: js.UndefOr[TimeToLive]
    var VoiceId: js.UndefOr[VoiceId]
  }

  object SendVoiceMessageRequest {
    @inline
    def apply(
        DestinationPhoneNumber: PhoneNumber,
        OriginationIdentity: VoiceMessageOriginationIdentity,
        ConfigurationSetName: js.UndefOr[ConfigurationSetNameOrArn] = js.undefined,
        Context: js.UndefOr[ContextMap] = js.undefined,
        DryRun: js.UndefOr[PrimitiveBoolean] = js.undefined,
        MaxPricePerMinute: js.UndefOr[MaxPrice] = js.undefined,
        MessageBody: js.UndefOr[VoiceMessageBody] = js.undefined,
        MessageBodyTextType: js.UndefOr[VoiceMessageBodyTextType] = js.undefined,
        TimeToLive: js.UndefOr[TimeToLive] = js.undefined,
        VoiceId: js.UndefOr[VoiceId] = js.undefined
    ): SendVoiceMessageRequest = {
      val __obj = js.Dynamic.literal(
        "DestinationPhoneNumber" -> DestinationPhoneNumber.asInstanceOf[js.Any],
        "OriginationIdentity" -> OriginationIdentity.asInstanceOf[js.Any]
      )

      ConfigurationSetName.foreach(__v => __obj.updateDynamic("ConfigurationSetName")(__v.asInstanceOf[js.Any]))
      Context.foreach(__v => __obj.updateDynamic("Context")(__v.asInstanceOf[js.Any]))
      DryRun.foreach(__v => __obj.updateDynamic("DryRun")(__v.asInstanceOf[js.Any]))
      MaxPricePerMinute.foreach(__v => __obj.updateDynamic("MaxPricePerMinute")(__v.asInstanceOf[js.Any]))
      MessageBody.foreach(__v => __obj.updateDynamic("MessageBody")(__v.asInstanceOf[js.Any]))
      MessageBodyTextType.foreach(__v => __obj.updateDynamic("MessageBodyTextType")(__v.asInstanceOf[js.Any]))
      TimeToLive.foreach(__v => __obj.updateDynamic("TimeToLive")(__v.asInstanceOf[js.Any]))
      VoiceId.foreach(__v => __obj.updateDynamic("VoiceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendVoiceMessageRequest]
    }
  }

  @js.native
  trait SendVoiceMessageResult extends js.Object {
    var MessageId: js.UndefOr[String]
  }

  object SendVoiceMessageResult {
    @inline
    def apply(
        MessageId: js.UndefOr[String] = js.undefined
    ): SendVoiceMessageResult = {
      val __obj = js.Dynamic.literal()
      MessageId.foreach(__v => __obj.updateDynamic("MessageId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendVoiceMessageResult]
    }
  }

  /** The alphanumeric sender ID in a specific country that you want to describe. For more information on sender IDs see [[https://docs.aws.amazon.com/pinpoint/latest/userguide/channels-sms-awssupport-sender-id.html|Requesting sender IDs for SMS messaging with Amazon Pinpoint]] in the <i>Amazon Pinpoint User Guide</i>.
    */
  @js.native
  trait SenderIdAndCountry extends js.Object {
    var IsoCountryCode: IsoCountryCode
    var SenderId: SenderIdOrArn
  }

  object SenderIdAndCountry {
    @inline
    def apply(
        IsoCountryCode: IsoCountryCode,
        SenderId: SenderIdOrArn
    ): SenderIdAndCountry = {
      val __obj = js.Dynamic.literal(
        "IsoCountryCode" -> IsoCountryCode.asInstanceOf[js.Any],
        "SenderId" -> SenderId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SenderIdAndCountry]
    }
  }

  /** The information for a sender ID that meets a specified criteria.
    */
  @js.native
  trait SenderIdFilter extends js.Object {
    var Name: SenderIdFilterName
    var Values: FilterValueList
  }

  object SenderIdFilter {
    @inline
    def apply(
        Name: SenderIdFilterName,
        Values: FilterValueList
    ): SenderIdFilter = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SenderIdFilter]
    }
  }

  /** The information for all SenderIds in an Amazon Web Services account.
    */
  @js.native
  trait SenderIdInformation extends js.Object {
    var IsoCountryCode: IsoCountryCode
    var MessageTypes: MessageTypeList
    var MonthlyLeasingPrice: String
    var SenderId: SenderId
    var SenderIdArn: String
  }

  object SenderIdInformation {
    @inline
    def apply(
        IsoCountryCode: IsoCountryCode,
        MessageTypes: MessageTypeList,
        MonthlyLeasingPrice: String,
        SenderId: SenderId,
        SenderIdArn: String
    ): SenderIdInformation = {
      val __obj = js.Dynamic.literal(
        "IsoCountryCode" -> IsoCountryCode.asInstanceOf[js.Any],
        "MessageTypes" -> MessageTypes.asInstanceOf[js.Any],
        "MonthlyLeasingPrice" -> MonthlyLeasingPrice.asInstanceOf[js.Any],
        "SenderId" -> SenderId.asInstanceOf[js.Any],
        "SenderIdArn" -> SenderIdArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SenderIdInformation]
    }
  }

  @js.native
  trait SetDefaultMessageTypeRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetNameOrArn
    var MessageType: MessageType
  }

  object SetDefaultMessageTypeRequest {
    @inline
    def apply(
        ConfigurationSetName: ConfigurationSetNameOrArn,
        MessageType: MessageType
    ): SetDefaultMessageTypeRequest = {
      val __obj = js.Dynamic.literal(
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any],
        "MessageType" -> MessageType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SetDefaultMessageTypeRequest]
    }
  }

  @js.native
  trait SetDefaultMessageTypeResult extends js.Object {
    var ConfigurationSetArn: js.UndefOr[String]
    var ConfigurationSetName: js.UndefOr[ConfigurationSetName]
    var MessageType: js.UndefOr[MessageType]
  }

  object SetDefaultMessageTypeResult {
    @inline
    def apply(
        ConfigurationSetArn: js.UndefOr[String] = js.undefined,
        ConfigurationSetName: js.UndefOr[ConfigurationSetName] = js.undefined,
        MessageType: js.UndefOr[MessageType] = js.undefined
    ): SetDefaultMessageTypeResult = {
      val __obj = js.Dynamic.literal()
      ConfigurationSetArn.foreach(__v => __obj.updateDynamic("ConfigurationSetArn")(__v.asInstanceOf[js.Any]))
      ConfigurationSetName.foreach(__v => __obj.updateDynamic("ConfigurationSetName")(__v.asInstanceOf[js.Any]))
      MessageType.foreach(__v => __obj.updateDynamic("MessageType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SetDefaultMessageTypeResult]
    }
  }

  @js.native
  trait SetDefaultSenderIdRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetNameOrArn
    var SenderId: SenderId
  }

  object SetDefaultSenderIdRequest {
    @inline
    def apply(
        ConfigurationSetName: ConfigurationSetNameOrArn,
        SenderId: SenderId
    ): SetDefaultSenderIdRequest = {
      val __obj = js.Dynamic.literal(
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any],
        "SenderId" -> SenderId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SetDefaultSenderIdRequest]
    }
  }

  @js.native
  trait SetDefaultSenderIdResult extends js.Object {
    var ConfigurationSetArn: js.UndefOr[String]
    var ConfigurationSetName: js.UndefOr[ConfigurationSetName]
    var SenderId: js.UndefOr[SenderId]
  }

  object SetDefaultSenderIdResult {
    @inline
    def apply(
        ConfigurationSetArn: js.UndefOr[String] = js.undefined,
        ConfigurationSetName: js.UndefOr[ConfigurationSetName] = js.undefined,
        SenderId: js.UndefOr[SenderId] = js.undefined
    ): SetDefaultSenderIdResult = {
      val __obj = js.Dynamic.literal()
      ConfigurationSetArn.foreach(__v => __obj.updateDynamic("ConfigurationSetArn")(__v.asInstanceOf[js.Any]))
      ConfigurationSetName.foreach(__v => __obj.updateDynamic("ConfigurationSetName")(__v.asInstanceOf[js.Any]))
      SenderId.foreach(__v => __obj.updateDynamic("SenderId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SetDefaultSenderIdResult]
    }
  }

  @js.native
  trait SetTextMessageSpendLimitOverrideRequest extends js.Object {
    var MonthlyLimit: MonthlyLimit
  }

  object SetTextMessageSpendLimitOverrideRequest {
    @inline
    def apply(
        MonthlyLimit: MonthlyLimit
    ): SetTextMessageSpendLimitOverrideRequest = {
      val __obj = js.Dynamic.literal(
        "MonthlyLimit" -> MonthlyLimit.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SetTextMessageSpendLimitOverrideRequest]
    }
  }

  @js.native
  trait SetTextMessageSpendLimitOverrideResult extends js.Object {
    var MonthlyLimit: js.UndefOr[MonthlyLimit]
  }

  object SetTextMessageSpendLimitOverrideResult {
    @inline
    def apply(
        MonthlyLimit: js.UndefOr[MonthlyLimit] = js.undefined
    ): SetTextMessageSpendLimitOverrideResult = {
      val __obj = js.Dynamic.literal()
      MonthlyLimit.foreach(__v => __obj.updateDynamic("MonthlyLimit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SetTextMessageSpendLimitOverrideResult]
    }
  }

  @js.native
  trait SetVoiceMessageSpendLimitOverrideRequest extends js.Object {
    var MonthlyLimit: MonthlyLimit
  }

  object SetVoiceMessageSpendLimitOverrideRequest {
    @inline
    def apply(
        MonthlyLimit: MonthlyLimit
    ): SetVoiceMessageSpendLimitOverrideRequest = {
      val __obj = js.Dynamic.literal(
        "MonthlyLimit" -> MonthlyLimit.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SetVoiceMessageSpendLimitOverrideRequest]
    }
  }

  @js.native
  trait SetVoiceMessageSpendLimitOverrideResult extends js.Object {
    var MonthlyLimit: js.UndefOr[MonthlyLimit]
  }

  object SetVoiceMessageSpendLimitOverrideResult {
    @inline
    def apply(
        MonthlyLimit: js.UndefOr[MonthlyLimit] = js.undefined
    ): SetVoiceMessageSpendLimitOverrideResult = {
      val __obj = js.Dynamic.literal()
      MonthlyLimit.foreach(__v => __obj.updateDynamic("MonthlyLimit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SetVoiceMessageSpendLimitOverrideResult]
    }
  }

  /** An object that defines an Amazon SNS destination for events. You can use Amazon SNS to send notification when certain events occur.
    */
  @js.native
  trait SnsDestination extends js.Object {
    var TopicArn: SnsTopicArn
  }

  object SnsDestination {
    @inline
    def apply(
        TopicArn: SnsTopicArn
    ): SnsDestination = {
      val __obj = js.Dynamic.literal(
        "TopicArn" -> TopicArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SnsDestination]
    }
  }

  /** Describes the current Amazon Pinpoint monthly spend limits for sending voice and text messages. For more information on increasing your monthly spend limit, see [[https://docs.aws.amazon.com/pinpoint/latest/userguide/channels-sms-awssupport-spend-threshold.html| Requesting increases to your monthly SMS spending quota for Amazon Pinpoint]] in the <i>Amazon Pinpoint User Guide</i>.
    */
  @js.native
  trait SpendLimit extends js.Object {
    var EnforcedLimit: PrimitiveLong
    var MaxLimit: PrimitiveLong
    var Name: SpendLimitName
    var Overridden: PrimitiveBoolean
  }

  object SpendLimit {
    @inline
    def apply(
        EnforcedLimit: PrimitiveLong,
        MaxLimit: PrimitiveLong,
        Name: SpendLimitName,
        Overridden: PrimitiveBoolean
    ): SpendLimit = {
      val __obj = js.Dynamic.literal(
        "EnforcedLimit" -> EnforcedLimit.asInstanceOf[js.Any],
        "MaxLimit" -> MaxLimit.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Overridden" -> Overridden.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SpendLimit]
    }
  }

  /** The list of tags to be added to the specified topic.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  object Tag {
    @inline
    def apply(
        Key: TagKey,
        Value: TagValue
    ): Tag = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: AmazonResourceName
    var Tags: NonEmptyTagList
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceArn: AmazonResourceName,
        Tags: NonEmptyTagList
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResult extends js.Object

  object TagResourceResult {
    @inline
    def apply(): TagResourceResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagResourceResult]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: AmazonResourceName
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceArn: AmazonResourceName,
        TagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResult extends js.Object

  object UntagResourceResult {
    @inline
    def apply(): UntagResourceResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UntagResourceResult]
    }
  }

  @js.native
  trait UpdateEventDestinationRequest extends js.Object {
    var ConfigurationSetName: ConfigurationSetNameOrArn
    var EventDestinationName: EventDestinationName
    var CloudWatchLogsDestination: js.UndefOr[CloudWatchLogsDestination]
    var Enabled: js.UndefOr[Boolean]
    var KinesisFirehoseDestination: js.UndefOr[KinesisFirehoseDestination]
    var MatchingEventTypes: js.UndefOr[EventTypeList]
    var SnsDestination: js.UndefOr[SnsDestination]
  }

  object UpdateEventDestinationRequest {
    @inline
    def apply(
        ConfigurationSetName: ConfigurationSetNameOrArn,
        EventDestinationName: EventDestinationName,
        CloudWatchLogsDestination: js.UndefOr[CloudWatchLogsDestination] = js.undefined,
        Enabled: js.UndefOr[Boolean] = js.undefined,
        KinesisFirehoseDestination: js.UndefOr[KinesisFirehoseDestination] = js.undefined,
        MatchingEventTypes: js.UndefOr[EventTypeList] = js.undefined,
        SnsDestination: js.UndefOr[SnsDestination] = js.undefined
    ): UpdateEventDestinationRequest = {
      val __obj = js.Dynamic.literal(
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any],
        "EventDestinationName" -> EventDestinationName.asInstanceOf[js.Any]
      )

      CloudWatchLogsDestination.foreach(__v => __obj.updateDynamic("CloudWatchLogsDestination")(__v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      KinesisFirehoseDestination.foreach(__v => __obj.updateDynamic("KinesisFirehoseDestination")(__v.asInstanceOf[js.Any]))
      MatchingEventTypes.foreach(__v => __obj.updateDynamic("MatchingEventTypes")(__v.asInstanceOf[js.Any]))
      SnsDestination.foreach(__v => __obj.updateDynamic("SnsDestination")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateEventDestinationRequest]
    }
  }

  @js.native
  trait UpdateEventDestinationResult extends js.Object {
    var ConfigurationSetArn: js.UndefOr[String]
    var ConfigurationSetName: js.UndefOr[ConfigurationSetName]
    var EventDestination: js.UndefOr[EventDestination]
  }

  object UpdateEventDestinationResult {
    @inline
    def apply(
        ConfigurationSetArn: js.UndefOr[String] = js.undefined,
        ConfigurationSetName: js.UndefOr[ConfigurationSetName] = js.undefined,
        EventDestination: js.UndefOr[EventDestination] = js.undefined
    ): UpdateEventDestinationResult = {
      val __obj = js.Dynamic.literal()
      ConfigurationSetArn.foreach(__v => __obj.updateDynamic("ConfigurationSetArn")(__v.asInstanceOf[js.Any]))
      ConfigurationSetName.foreach(__v => __obj.updateDynamic("ConfigurationSetName")(__v.asInstanceOf[js.Any]))
      EventDestination.foreach(__v => __obj.updateDynamic("EventDestination")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateEventDestinationResult]
    }
  }

  @js.native
  trait UpdatePhoneNumberRequest extends js.Object {
    var PhoneNumberId: PhoneNumberIdOrArn
    var DeletionProtectionEnabled: js.UndefOr[Boolean]
    var OptOutListName: js.UndefOr[OptOutListNameOrArn]
    var SelfManagedOptOutsEnabled: js.UndefOr[Boolean]
    var TwoWayChannelArn: js.UndefOr[TwoWayChannelArn]
    var TwoWayEnabled: js.UndefOr[Boolean]
  }

  object UpdatePhoneNumberRequest {
    @inline
    def apply(
        PhoneNumberId: PhoneNumberIdOrArn,
        DeletionProtectionEnabled: js.UndefOr[Boolean] = js.undefined,
        OptOutListName: js.UndefOr[OptOutListNameOrArn] = js.undefined,
        SelfManagedOptOutsEnabled: js.UndefOr[Boolean] = js.undefined,
        TwoWayChannelArn: js.UndefOr[TwoWayChannelArn] = js.undefined,
        TwoWayEnabled: js.UndefOr[Boolean] = js.undefined
    ): UpdatePhoneNumberRequest = {
      val __obj = js.Dynamic.literal(
        "PhoneNumberId" -> PhoneNumberId.asInstanceOf[js.Any]
      )

      DeletionProtectionEnabled.foreach(__v => __obj.updateDynamic("DeletionProtectionEnabled")(__v.asInstanceOf[js.Any]))
      OptOutListName.foreach(__v => __obj.updateDynamic("OptOutListName")(__v.asInstanceOf[js.Any]))
      SelfManagedOptOutsEnabled.foreach(__v => __obj.updateDynamic("SelfManagedOptOutsEnabled")(__v.asInstanceOf[js.Any]))
      TwoWayChannelArn.foreach(__v => __obj.updateDynamic("TwoWayChannelArn")(__v.asInstanceOf[js.Any]))
      TwoWayEnabled.foreach(__v => __obj.updateDynamic("TwoWayEnabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePhoneNumberRequest]
    }
  }

  @js.native
  trait UpdatePhoneNumberResult extends js.Object {
    var CreatedTimestamp: js.UndefOr[Timestamp]
    var DeletionProtectionEnabled: js.UndefOr[PrimitiveBoolean]
    var IsoCountryCode: js.UndefOr[IsoCountryCode]
    var MessageType: js.UndefOr[MessageType]
    var MonthlyLeasingPrice: js.UndefOr[String]
    var NumberCapabilities: js.UndefOr[NumberCapabilityList]
    var NumberType: js.UndefOr[NumberType]
    var OptOutListName: js.UndefOr[OptOutListName]
    var PhoneNumber: js.UndefOr[PhoneNumber]
    var PhoneNumberArn: js.UndefOr[String]
    var PhoneNumberId: js.UndefOr[String]
    var SelfManagedOptOutsEnabled: js.UndefOr[PrimitiveBoolean]
    var Status: js.UndefOr[NumberStatus]
    var TwoWayChannelArn: js.UndefOr[TwoWayChannelArn]
    var TwoWayEnabled: js.UndefOr[PrimitiveBoolean]
  }

  object UpdatePhoneNumberResult {
    @inline
    def apply(
        CreatedTimestamp: js.UndefOr[Timestamp] = js.undefined,
        DeletionProtectionEnabled: js.UndefOr[PrimitiveBoolean] = js.undefined,
        IsoCountryCode: js.UndefOr[IsoCountryCode] = js.undefined,
        MessageType: js.UndefOr[MessageType] = js.undefined,
        MonthlyLeasingPrice: js.UndefOr[String] = js.undefined,
        NumberCapabilities: js.UndefOr[NumberCapabilityList] = js.undefined,
        NumberType: js.UndefOr[NumberType] = js.undefined,
        OptOutListName: js.UndefOr[OptOutListName] = js.undefined,
        PhoneNumber: js.UndefOr[PhoneNumber] = js.undefined,
        PhoneNumberArn: js.UndefOr[String] = js.undefined,
        PhoneNumberId: js.UndefOr[String] = js.undefined,
        SelfManagedOptOutsEnabled: js.UndefOr[PrimitiveBoolean] = js.undefined,
        Status: js.UndefOr[NumberStatus] = js.undefined,
        TwoWayChannelArn: js.UndefOr[TwoWayChannelArn] = js.undefined,
        TwoWayEnabled: js.UndefOr[PrimitiveBoolean] = js.undefined
    ): UpdatePhoneNumberResult = {
      val __obj = js.Dynamic.literal()
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      DeletionProtectionEnabled.foreach(__v => __obj.updateDynamic("DeletionProtectionEnabled")(__v.asInstanceOf[js.Any]))
      IsoCountryCode.foreach(__v => __obj.updateDynamic("IsoCountryCode")(__v.asInstanceOf[js.Any]))
      MessageType.foreach(__v => __obj.updateDynamic("MessageType")(__v.asInstanceOf[js.Any]))
      MonthlyLeasingPrice.foreach(__v => __obj.updateDynamic("MonthlyLeasingPrice")(__v.asInstanceOf[js.Any]))
      NumberCapabilities.foreach(__v => __obj.updateDynamic("NumberCapabilities")(__v.asInstanceOf[js.Any]))
      NumberType.foreach(__v => __obj.updateDynamic("NumberType")(__v.asInstanceOf[js.Any]))
      OptOutListName.foreach(__v => __obj.updateDynamic("OptOutListName")(__v.asInstanceOf[js.Any]))
      PhoneNumber.foreach(__v => __obj.updateDynamic("PhoneNumber")(__v.asInstanceOf[js.Any]))
      PhoneNumberArn.foreach(__v => __obj.updateDynamic("PhoneNumberArn")(__v.asInstanceOf[js.Any]))
      PhoneNumberId.foreach(__v => __obj.updateDynamic("PhoneNumberId")(__v.asInstanceOf[js.Any]))
      SelfManagedOptOutsEnabled.foreach(__v => __obj.updateDynamic("SelfManagedOptOutsEnabled")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TwoWayChannelArn.foreach(__v => __obj.updateDynamic("TwoWayChannelArn")(__v.asInstanceOf[js.Any]))
      TwoWayEnabled.foreach(__v => __obj.updateDynamic("TwoWayEnabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePhoneNumberResult]
    }
  }

  @js.native
  trait UpdatePoolRequest extends js.Object {
    var PoolId: PoolIdOrArn
    var DeletionProtectionEnabled: js.UndefOr[Boolean]
    var OptOutListName: js.UndefOr[OptOutListNameOrArn]
    var SelfManagedOptOutsEnabled: js.UndefOr[Boolean]
    var SharedRoutesEnabled: js.UndefOr[Boolean]
    var TwoWayChannelArn: js.UndefOr[TwoWayChannelArn]
    var TwoWayEnabled: js.UndefOr[Boolean]
  }

  object UpdatePoolRequest {
    @inline
    def apply(
        PoolId: PoolIdOrArn,
        DeletionProtectionEnabled: js.UndefOr[Boolean] = js.undefined,
        OptOutListName: js.UndefOr[OptOutListNameOrArn] = js.undefined,
        SelfManagedOptOutsEnabled: js.UndefOr[Boolean] = js.undefined,
        SharedRoutesEnabled: js.UndefOr[Boolean] = js.undefined,
        TwoWayChannelArn: js.UndefOr[TwoWayChannelArn] = js.undefined,
        TwoWayEnabled: js.UndefOr[Boolean] = js.undefined
    ): UpdatePoolRequest = {
      val __obj = js.Dynamic.literal(
        "PoolId" -> PoolId.asInstanceOf[js.Any]
      )

      DeletionProtectionEnabled.foreach(__v => __obj.updateDynamic("DeletionProtectionEnabled")(__v.asInstanceOf[js.Any]))
      OptOutListName.foreach(__v => __obj.updateDynamic("OptOutListName")(__v.asInstanceOf[js.Any]))
      SelfManagedOptOutsEnabled.foreach(__v => __obj.updateDynamic("SelfManagedOptOutsEnabled")(__v.asInstanceOf[js.Any]))
      SharedRoutesEnabled.foreach(__v => __obj.updateDynamic("SharedRoutesEnabled")(__v.asInstanceOf[js.Any]))
      TwoWayChannelArn.foreach(__v => __obj.updateDynamic("TwoWayChannelArn")(__v.asInstanceOf[js.Any]))
      TwoWayEnabled.foreach(__v => __obj.updateDynamic("TwoWayEnabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePoolRequest]
    }
  }

  @js.native
  trait UpdatePoolResult extends js.Object {
    var CreatedTimestamp: js.UndefOr[Timestamp]
    var DeletionProtectionEnabled: js.UndefOr[PrimitiveBoolean]
    var MessageType: js.UndefOr[MessageType]
    var OptOutListName: js.UndefOr[OptOutListName]
    var PoolArn: js.UndefOr[String]
    var PoolId: js.UndefOr[String]
    var SelfManagedOptOutsEnabled: js.UndefOr[PrimitiveBoolean]
    var SharedRoutesEnabled: js.UndefOr[PrimitiveBoolean]
    var Status: js.UndefOr[PoolStatus]
    var TwoWayChannelArn: js.UndefOr[TwoWayChannelArn]
    var TwoWayEnabled: js.UndefOr[PrimitiveBoolean]
  }

  object UpdatePoolResult {
    @inline
    def apply(
        CreatedTimestamp: js.UndefOr[Timestamp] = js.undefined,
        DeletionProtectionEnabled: js.UndefOr[PrimitiveBoolean] = js.undefined,
        MessageType: js.UndefOr[MessageType] = js.undefined,
        OptOutListName: js.UndefOr[OptOutListName] = js.undefined,
        PoolArn: js.UndefOr[String] = js.undefined,
        PoolId: js.UndefOr[String] = js.undefined,
        SelfManagedOptOutsEnabled: js.UndefOr[PrimitiveBoolean] = js.undefined,
        SharedRoutesEnabled: js.UndefOr[PrimitiveBoolean] = js.undefined,
        Status: js.UndefOr[PoolStatus] = js.undefined,
        TwoWayChannelArn: js.UndefOr[TwoWayChannelArn] = js.undefined,
        TwoWayEnabled: js.UndefOr[PrimitiveBoolean] = js.undefined
    ): UpdatePoolResult = {
      val __obj = js.Dynamic.literal()
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      DeletionProtectionEnabled.foreach(__v => __obj.updateDynamic("DeletionProtectionEnabled")(__v.asInstanceOf[js.Any]))
      MessageType.foreach(__v => __obj.updateDynamic("MessageType")(__v.asInstanceOf[js.Any]))
      OptOutListName.foreach(__v => __obj.updateDynamic("OptOutListName")(__v.asInstanceOf[js.Any]))
      PoolArn.foreach(__v => __obj.updateDynamic("PoolArn")(__v.asInstanceOf[js.Any]))
      PoolId.foreach(__v => __obj.updateDynamic("PoolId")(__v.asInstanceOf[js.Any]))
      SelfManagedOptOutsEnabled.foreach(__v => __obj.updateDynamic("SelfManagedOptOutsEnabled")(__v.asInstanceOf[js.Any]))
      SharedRoutesEnabled.foreach(__v => __obj.updateDynamic("SharedRoutesEnabled")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TwoWayChannelArn.foreach(__v => __obj.updateDynamic("TwoWayChannelArn")(__v.asInstanceOf[js.Any]))
      TwoWayEnabled.foreach(__v => __obj.updateDynamic("TwoWayEnabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePoolResult]
    }
  }
}
