package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object sns {
  type ActionsList                = js.Array[action]
  type AmazonResourceName         = String
  type Binary                     = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type DelegatesList              = js.Array[delegate]
  type ListOfEndpoints            = js.Array[Endpoint]
  type ListOfPlatformApplications = js.Array[PlatformApplication]
  type ListString                 = js.Array[String]
  type MapStringToString          = js.Dictionary[String]
  type MessageAttributeMap        = js.Dictionary[MessageAttributeValue]
  type PhoneNumber                = String
  type PhoneNumberList            = js.Array[PhoneNumber]
  type SubscriptionAttributesMap  = js.Dictionary[attributeValue]
  type SubscriptionsList          = js.Array[Subscription]
  type TagKey                     = String
  type TagKeyList                 = js.Array[TagKey]
  type TagList                    = js.Array[Tag]
  type TagValue                   = String
  type TopicAttributesMap         = js.Dictionary[attributeValue]
  type TopicsList                 = js.Array[Topic]
  type account                    = String
  type action                     = String
  type attributeName              = String
  type attributeValue             = String
  type authenticateOnUnsubscribe  = String
  type delegate                   = String
  type endpoint                   = String
  type label                      = String
  type message                    = String
  type messageId                  = String
  type messageStructure           = String
  type nextToken                  = String
  type protocol                   = String
  type subject                    = String
  type subscriptionARN            = String
  type token                      = String
  type topicARN                   = String
  type topicName                  = String

  implicit final class SNSOps(private val service: SNS) extends AnyVal {

    @inline def addPermissionFuture(params: AddPermissionInput): Future[js.Object] =
      service.addPermission(params).promise().toFuture
    @inline def checkIfPhoneNumberIsOptedOutFuture(
        params: CheckIfPhoneNumberIsOptedOutInput
    ): Future[CheckIfPhoneNumberIsOptedOutResponse] = service.checkIfPhoneNumberIsOptedOut(params).promise().toFuture
    @inline def confirmSubscriptionFuture(params: ConfirmSubscriptionInput): Future[ConfirmSubscriptionResponse] =
      service.confirmSubscription(params).promise().toFuture
    @inline def createPlatformApplicationFuture(
        params: CreatePlatformApplicationInput
    ): Future[CreatePlatformApplicationResponse] = service.createPlatformApplication(params).promise().toFuture
    @inline def createPlatformEndpointFuture(params: CreatePlatformEndpointInput): Future[CreateEndpointResponse] =
      service.createPlatformEndpoint(params).promise().toFuture
    @inline def createTopicFuture(params: CreateTopicInput): Future[CreateTopicResponse] =
      service.createTopic(params).promise().toFuture
    @inline def deleteEndpointFuture(params: DeleteEndpointInput): Future[js.Object] =
      service.deleteEndpoint(params).promise().toFuture
    @inline def deletePlatformApplicationFuture(params: DeletePlatformApplicationInput): Future[js.Object] =
      service.deletePlatformApplication(params).promise().toFuture
    @inline def deleteTopicFuture(params: DeleteTopicInput): Future[js.Object] =
      service.deleteTopic(params).promise().toFuture
    @inline def getEndpointAttributesFuture(params: GetEndpointAttributesInput): Future[GetEndpointAttributesResponse] =
      service.getEndpointAttributes(params).promise().toFuture
    @inline def getPlatformApplicationAttributesFuture(
        params: GetPlatformApplicationAttributesInput
    ): Future[GetPlatformApplicationAttributesResponse] =
      service.getPlatformApplicationAttributes(params).promise().toFuture
    @inline def getSMSAttributesFuture(params: GetSMSAttributesInput): Future[GetSMSAttributesResponse] =
      service.getSMSAttributes(params).promise().toFuture
    @inline def getSubscriptionAttributesFuture(
        params: GetSubscriptionAttributesInput
    ): Future[GetSubscriptionAttributesResponse] = service.getSubscriptionAttributes(params).promise().toFuture
    @inline def getTopicAttributesFuture(params: GetTopicAttributesInput): Future[GetTopicAttributesResponse] =
      service.getTopicAttributes(params).promise().toFuture
    @inline def listEndpointsByPlatformApplicationFuture(
        params: ListEndpointsByPlatformApplicationInput
    ): Future[ListEndpointsByPlatformApplicationResponse] =
      service.listEndpointsByPlatformApplication(params).promise().toFuture
    @inline def listPhoneNumbersOptedOutFuture(
        params: ListPhoneNumbersOptedOutInput
    ): Future[ListPhoneNumbersOptedOutResponse] = service.listPhoneNumbersOptedOut(params).promise().toFuture
    @inline def listPlatformApplicationsFuture(
        params: ListPlatformApplicationsInput
    ): Future[ListPlatformApplicationsResponse] = service.listPlatformApplications(params).promise().toFuture
    @inline def listSubscriptionsByTopicFuture(
        params: ListSubscriptionsByTopicInput
    ): Future[ListSubscriptionsByTopicResponse] = service.listSubscriptionsByTopic(params).promise().toFuture
    @inline def listSubscriptionsFuture(params: ListSubscriptionsInput): Future[ListSubscriptionsResponse] =
      service.listSubscriptions(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise().toFuture
    @inline def listTopicsFuture(params: ListTopicsInput): Future[ListTopicsResponse] =
      service.listTopics(params).promise().toFuture
    @inline def optInPhoneNumberFuture(params: OptInPhoneNumberInput): Future[OptInPhoneNumberResponse] =
      service.optInPhoneNumber(params).promise().toFuture
    @inline def publishFuture(params: PublishInput): Future[PublishResponse] =
      service.publish(params).promise().toFuture
    @inline def removePermissionFuture(params: RemovePermissionInput): Future[js.Object] =
      service.removePermission(params).promise().toFuture
    @inline def setEndpointAttributesFuture(params: SetEndpointAttributesInput): Future[js.Object] =
      service.setEndpointAttributes(params).promise().toFuture
    @inline def setPlatformApplicationAttributesFuture(
        params: SetPlatformApplicationAttributesInput
    ): Future[js.Object] = service.setPlatformApplicationAttributes(params).promise().toFuture
    @inline def setSMSAttributesFuture(params: SetSMSAttributesInput): Future[SetSMSAttributesResponse] =
      service.setSMSAttributes(params).promise().toFuture
    @inline def setSubscriptionAttributesFuture(params: SetSubscriptionAttributesInput): Future[js.Object] =
      service.setSubscriptionAttributes(params).promise().toFuture
    @inline def setTopicAttributesFuture(params: SetTopicAttributesInput): Future[js.Object] =
      service.setTopicAttributes(params).promise().toFuture
    @inline def subscribeFuture(params: SubscribeInput): Future[SubscribeResponse] =
      service.subscribe(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise().toFuture
    @inline def unsubscribeFuture(params: UnsubscribeInput): Future[js.Object] =
      service.unsubscribe(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise().toFuture
  }
}

package sns {
  @js.native
  @JSImport("aws-sdk", "SNS")
  class SNS() extends js.Object {
    def this(config: AWSConfig) = this()

    def addPermission(params: AddPermissionInput): Request[js.Object] = js.native
    def checkIfPhoneNumberIsOptedOut(
        params: CheckIfPhoneNumberIsOptedOutInput
    ): Request[CheckIfPhoneNumberIsOptedOutResponse]                                                = js.native
    def confirmSubscription(params: ConfirmSubscriptionInput): Request[ConfirmSubscriptionResponse] = js.native
    def createPlatformApplication(params: CreatePlatformApplicationInput): Request[CreatePlatformApplicationResponse] =
      js.native
    def createPlatformEndpoint(params: CreatePlatformEndpointInput): Request[CreateEndpointResponse]      = js.native
    def createTopic(params: CreateTopicInput): Request[CreateTopicResponse]                               = js.native
    def deleteEndpoint(params: DeleteEndpointInput): Request[js.Object]                                   = js.native
    def deletePlatformApplication(params: DeletePlatformApplicationInput): Request[js.Object]             = js.native
    def deleteTopic(params: DeleteTopicInput): Request[js.Object]                                         = js.native
    def getEndpointAttributes(params: GetEndpointAttributesInput): Request[GetEndpointAttributesResponse] = js.native
    def getPlatformApplicationAttributes(
        params: GetPlatformApplicationAttributesInput
    ): Request[GetPlatformApplicationAttributesResponse]                                   = js.native
    def getSMSAttributes(params: GetSMSAttributesInput): Request[GetSMSAttributesResponse] = js.native
    def getSubscriptionAttributes(params: GetSubscriptionAttributesInput): Request[GetSubscriptionAttributesResponse] =
      js.native
    def getTopicAttributes(params: GetTopicAttributesInput): Request[GetTopicAttributesResponse] = js.native
    def listEndpointsByPlatformApplication(
        params: ListEndpointsByPlatformApplicationInput
    ): Request[ListEndpointsByPlatformApplicationResponse] = js.native
    def listPhoneNumbersOptedOut(params: ListPhoneNumbersOptedOutInput): Request[ListPhoneNumbersOptedOutResponse] =
      js.native
    def listPlatformApplications(params: ListPlatformApplicationsInput): Request[ListPlatformApplicationsResponse] =
      js.native
    def listSubscriptions(params: ListSubscriptionsInput): Request[ListSubscriptionsResponse] = js.native
    def listSubscriptionsByTopic(params: ListSubscriptionsByTopicInput): Request[ListSubscriptionsByTopicResponse] =
      js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse]       = js.native
    def listTopics(params: ListTopicsInput): Request[ListTopicsResponse]                                    = js.native
    def optInPhoneNumber(params: OptInPhoneNumberInput): Request[OptInPhoneNumberResponse]                  = js.native
    def publish(params: PublishInput): Request[PublishResponse]                                             = js.native
    def removePermission(params: RemovePermissionInput): Request[js.Object]                                 = js.native
    def setEndpointAttributes(params: SetEndpointAttributesInput): Request[js.Object]                       = js.native
    def setPlatformApplicationAttributes(params: SetPlatformApplicationAttributesInput): Request[js.Object] = js.native
    def setSMSAttributes(params: SetSMSAttributesInput): Request[SetSMSAttributesResponse]                  = js.native
    def setSubscriptionAttributes(params: SetSubscriptionAttributesInput): Request[js.Object]               = js.native
    def setTopicAttributes(params: SetTopicAttributesInput): Request[js.Object]                             = js.native
    def subscribe(params: SubscribeInput): Request[SubscribeResponse]                                       = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse]                               = js.native
    def unsubscribe(params: UnsubscribeInput): Request[js.Object]                                           = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse]                         = js.native
  }

  @js.native
  @Factory
  trait AddPermissionInput extends js.Object {
    var AWSAccountId: DelegatesList
    var ActionName: ActionsList
    var Label: label
    var TopicArn: topicARN
  }

  /**
    * The input for the <code>CheckIfPhoneNumberIsOptedOut</code> action.
    */
  @js.native
  @Factory
  trait CheckIfPhoneNumberIsOptedOutInput extends js.Object {
    var phoneNumber: PhoneNumber
  }

  /**
    * The response from the <code>CheckIfPhoneNumberIsOptedOut</code> action.
    */
  @js.native
  @Factory
  trait CheckIfPhoneNumberIsOptedOutResponse extends js.Object {
    var isOptedOut: js.UndefOr[Boolean]
  }

  /**
    * Input for ConfirmSubscription action.
    */
  @js.native
  @Factory
  trait ConfirmSubscriptionInput extends js.Object {
    var Token: token
    var TopicArn: topicARN
    var AuthenticateOnUnsubscribe: js.UndefOr[authenticateOnUnsubscribe]
  }

  /**
    * Response for ConfirmSubscriptions action.
    */
  @js.native
  @Factory
  trait ConfirmSubscriptionResponse extends js.Object {
    var SubscriptionArn: js.UndefOr[subscriptionARN]
  }

  /**
    * Response from CreateEndpoint action.
    */
  @js.native
  @Factory
  trait CreateEndpointResponse extends js.Object {
    var EndpointArn: js.UndefOr[String]
  }

  /**
    * Input for CreatePlatformApplication action.
    */
  @js.native
  @Factory
  trait CreatePlatformApplicationInput extends js.Object {
    var Attributes: MapStringToString
    var Name: String
    var Platform: String
  }

  /**
    * Response from CreatePlatformApplication action.
    */
  @js.native
  @Factory
  trait CreatePlatformApplicationResponse extends js.Object {
    var PlatformApplicationArn: js.UndefOr[String]
  }

  /**
    * Input for CreatePlatformEndpoint action.
    */
  @js.native
  @Factory
  trait CreatePlatformEndpointInput extends js.Object {
    var PlatformApplicationArn: String
    var Token: String
    var Attributes: js.UndefOr[MapStringToString]
    var CustomUserData: js.UndefOr[String]
  }

  /**
    * Input for CreateTopic action.
    */
  @js.native
  @Factory
  trait CreateTopicInput extends js.Object {
    var Name: topicName
    var Attributes: js.UndefOr[TopicAttributesMap]
    var Tags: js.UndefOr[TagList]
  }

  /**
    * Response from CreateTopic action.
    */
  @js.native
  @Factory
  trait CreateTopicResponse extends js.Object {
    var TopicArn: js.UndefOr[topicARN]
  }

  /**
    * Input for DeleteEndpoint action.
    */
  @js.native
  @Factory
  trait DeleteEndpointInput extends js.Object {
    var EndpointArn: String
  }

  /**
    * Input for DeletePlatformApplication action.
    */
  @js.native
  @Factory
  trait DeletePlatformApplicationInput extends js.Object {
    var PlatformApplicationArn: String
  }

  @js.native
  @Factory
  trait DeleteTopicInput extends js.Object {
    var TopicArn: topicARN
  }

  /**
    * Endpoint for mobile app and device.
    */
  @js.native
  @Factory
  trait Endpoint extends js.Object {
    var Attributes: js.UndefOr[MapStringToString]
    var EndpointArn: js.UndefOr[String]
  }

  /**
    * Input for GetEndpointAttributes action.
    */
  @js.native
  @Factory
  trait GetEndpointAttributesInput extends js.Object {
    var EndpointArn: String
  }

  /**
    * Response from GetEndpointAttributes of the EndpointArn.
    */
  @js.native
  @Factory
  trait GetEndpointAttributesResponse extends js.Object {
    var Attributes: js.UndefOr[MapStringToString]
  }

  /**
    * Input for GetPlatformApplicationAttributes action.
    */
  @js.native
  @Factory
  trait GetPlatformApplicationAttributesInput extends js.Object {
    var PlatformApplicationArn: String
  }

  /**
    * Response for GetPlatformApplicationAttributes action.
    */
  @js.native
  @Factory
  trait GetPlatformApplicationAttributesResponse extends js.Object {
    var Attributes: js.UndefOr[MapStringToString]
  }

  /**
    * The input for the <code>GetSMSAttributes</code> request.
    */
  @js.native
  @Factory
  trait GetSMSAttributesInput extends js.Object {
    var attributes: js.UndefOr[ListString]
  }

  /**
    * The response from the <code>GetSMSAttributes</code> request.
    */
  @js.native
  @Factory
  trait GetSMSAttributesResponse extends js.Object {
    var attributes: js.UndefOr[MapStringToString]
  }

  /**
    * Input for GetSubscriptionAttributes.
    */
  @js.native
  @Factory
  trait GetSubscriptionAttributesInput extends js.Object {
    var SubscriptionArn: subscriptionARN
  }

  /**
    * Response for GetSubscriptionAttributes action.
    */
  @js.native
  @Factory
  trait GetSubscriptionAttributesResponse extends js.Object {
    var Attributes: js.UndefOr[SubscriptionAttributesMap]
  }

  /**
    * Input for GetTopicAttributes action.
    */
  @js.native
  @Factory
  trait GetTopicAttributesInput extends js.Object {
    var TopicArn: topicARN
  }

  /**
    * Response for GetTopicAttributes action.
    */
  @js.native
  @Factory
  trait GetTopicAttributesResponse extends js.Object {
    var Attributes: js.UndefOr[TopicAttributesMap]
  }

  /**
    * Input for ListEndpointsByPlatformApplication action.
    */
  @js.native
  @Factory
  trait ListEndpointsByPlatformApplicationInput extends js.Object {
    var PlatformApplicationArn: String
    var NextToken: js.UndefOr[String]
  }

  /**
    * Response for ListEndpointsByPlatformApplication action.
    */
  @js.native
  @Factory
  trait ListEndpointsByPlatformApplicationResponse extends js.Object {
    var Endpoints: js.UndefOr[ListOfEndpoints]
    var NextToken: js.UndefOr[String]
  }

  /**
    * The input for the <code>ListPhoneNumbersOptedOut</code> action.
    */
  @js.native
  @Factory
  trait ListPhoneNumbersOptedOutInput extends js.Object {
    var nextToken: js.UndefOr[String]
  }

  /**
    * The response from the <code>ListPhoneNumbersOptedOut</code> action.
    */
  @js.native
  @Factory
  trait ListPhoneNumbersOptedOutResponse extends js.Object {
    var nextToken: js.UndefOr[String]
    var phoneNumbers: js.UndefOr[PhoneNumberList]
  }

  /**
    * Input for ListPlatformApplications action.
    */
  @js.native
  @Factory
  trait ListPlatformApplicationsInput extends js.Object {
    var NextToken: js.UndefOr[String]
  }

  /**
    * Response for ListPlatformApplications action.
    */
  @js.native
  @Factory
  trait ListPlatformApplicationsResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var PlatformApplications: js.UndefOr[ListOfPlatformApplications]
  }

  /**
    * Input for ListSubscriptionsByTopic action.
    */
  @js.native
  @Factory
  trait ListSubscriptionsByTopicInput extends js.Object {
    var TopicArn: topicARN
    var NextToken: js.UndefOr[nextToken]
  }

  /**
    * Response for ListSubscriptionsByTopic action.
    */
  @js.native
  @Factory
  trait ListSubscriptionsByTopicResponse extends js.Object {
    var NextToken: js.UndefOr[nextToken]
    var Subscriptions: js.UndefOr[SubscriptionsList]
  }

  /**
    * Input for ListSubscriptions action.
    */
  @js.native
  @Factory
  trait ListSubscriptionsInput extends js.Object {
    var NextToken: js.UndefOr[nextToken]
  }

  /**
    * Response for ListSubscriptions action
    */
  @js.native
  @Factory
  trait ListSubscriptionsResponse extends js.Object {
    var NextToken: js.UndefOr[nextToken]
    var Subscriptions: js.UndefOr[SubscriptionsList]
  }

  @js.native
  @Factory
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: AmazonResourceName
  }

  @js.native
  @Factory
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait ListTopicsInput extends js.Object {
    var NextToken: js.UndefOr[nextToken]
  }

  /**
    * Response for ListTopics action.
    */
  @js.native
  @Factory
  trait ListTopicsResponse extends js.Object {
    var NextToken: js.UndefOr[nextToken]
    var Topics: js.UndefOr[TopicsList]
  }

  /**
    * The user-specified message attribute value. For string data types, the value attribute has the same restrictions on the content as the message body. For more information, see [[https://docs.aws.amazon.com/sns/latest/api/API_Publish.html|Publish]].
    *  Name, type, and value must not be empty or null. In addition, the message body should not be empty or null. All parts of the message attribute, including name, type, and value, are included in the message size restriction, which is currently 256 KB (262,144 bytes). For more information, see [[https://docs.aws.amazon.com/sns/latest/dg/SNSMessageAttributes.html|Using Amazon SNS Message Attributes]].
    */
  @js.native
  @Factory
  trait MessageAttributeValue extends js.Object {
    var DataType: String
    var BinaryValue: js.UndefOr[Binary]
    var StringValue: js.UndefOr[String]
  }

  /**
    * Input for the OptInPhoneNumber action.
    */
  @js.native
  @Factory
  trait OptInPhoneNumberInput extends js.Object {
    var phoneNumber: PhoneNumber
  }

  /**
    * The response for the OptInPhoneNumber action.
    */
  @js.native
  @Factory
  trait OptInPhoneNumberResponse extends js.Object {}

  /**
    * Platform application object.
    */
  @js.native
  @Factory
  trait PlatformApplication extends js.Object {
    var Attributes: js.UndefOr[MapStringToString]
    var PlatformApplicationArn: js.UndefOr[String]
  }

  /**
    * Input for Publish action.
    */
  @js.native
  @Factory
  trait PublishInput extends js.Object {
    var Message: message
    var MessageAttributes: js.UndefOr[MessageAttributeMap]
    var MessageStructure: js.UndefOr[messageStructure]
    var PhoneNumber: js.UndefOr[String]
    var Subject: js.UndefOr[subject]
    var TargetArn: js.UndefOr[String]
    var TopicArn: js.UndefOr[topicARN]
  }

  /**
    * Response for Publish action.
    */
  @js.native
  @Factory
  trait PublishResponse extends js.Object {
    var MessageId: js.UndefOr[messageId]
  }

  /**
    * Input for RemovePermission action.
    */
  @js.native
  @Factory
  trait RemovePermissionInput extends js.Object {
    var Label: label
    var TopicArn: topicARN
  }

  /**
    * Input for SetEndpointAttributes action.
    */
  @js.native
  @Factory
  trait SetEndpointAttributesInput extends js.Object {
    var Attributes: MapStringToString
    var EndpointArn: String
  }

  /**
    * Input for SetPlatformApplicationAttributes action.
    */
  @js.native
  @Factory
  trait SetPlatformApplicationAttributesInput extends js.Object {
    var Attributes: MapStringToString
    var PlatformApplicationArn: String
  }

  /**
    * The input for the SetSMSAttributes action.
    */
  @js.native
  @Factory
  trait SetSMSAttributesInput extends js.Object {
    var attributes: MapStringToString
  }

  /**
    * The response for the SetSMSAttributes action.
    */
  @js.native
  @Factory
  trait SetSMSAttributesResponse extends js.Object {}

  /**
    * Input for SetSubscriptionAttributes action.
    */
  @js.native
  @Factory
  trait SetSubscriptionAttributesInput extends js.Object {
    var AttributeName: attributeName
    var SubscriptionArn: subscriptionARN
    var AttributeValue: js.UndefOr[attributeValue]
  }

  /**
    * Input for SetTopicAttributes action.
    */
  @js.native
  @Factory
  trait SetTopicAttributesInput extends js.Object {
    var AttributeName: attributeName
    var TopicArn: topicARN
    var AttributeValue: js.UndefOr[attributeValue]
  }

  /**
    * Input for Subscribe action.
    */
  @js.native
  @Factory
  trait SubscribeInput extends js.Object {
    var Protocol: protocol
    var TopicArn: topicARN
    var Attributes: js.UndefOr[SubscriptionAttributesMap]
    var Endpoint: js.UndefOr[endpoint]
    var ReturnSubscriptionArn: js.UndefOr[Boolean]
  }

  /**
    * Response for Subscribe action.
    */
  @js.native
  @Factory
  trait SubscribeResponse extends js.Object {
    var SubscriptionArn: js.UndefOr[subscriptionARN]
  }

  /**
    * A wrapper type for the attributes of an Amazon SNS subscription.
    */
  @js.native
  @Factory
  trait Subscription extends js.Object {
    var Endpoint: js.UndefOr[endpoint]
    var Owner: js.UndefOr[account]
    var Protocol: js.UndefOr[protocol]
    var SubscriptionArn: js.UndefOr[subscriptionARN]
    var TopicArn: js.UndefOr[topicARN]
  }

  /**
    * The list of tags to be added to the specified topic.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var ResourceArn: AmazonResourceName
    var Tags: TagList
  }

  @js.native
  @Factory
  trait TagResourceResponse extends js.Object {}

  /**
    * A wrapper type for the topic's Amazon Resource Name (ARN). To retrieve a topic's attributes, use <code>GetTopicAttributes</code>.
    */
  @js.native
  @Factory
  trait Topic extends js.Object {
    var TopicArn: js.UndefOr[topicARN]
  }

  /**
    * Input for Unsubscribe action.
    */
  @js.native
  @Factory
  trait UnsubscribeInput extends js.Object {
    var SubscriptionArn: subscriptionARN
  }

  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: AmazonResourceName
    var TagKeys: TagKeyList
  }

  @js.native
  @Factory
  trait UntagResourceResponse extends js.Object {}
}
