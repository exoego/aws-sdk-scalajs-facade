package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object sns {
  type ActionsList = js.Array[action]
  type AmazonResourceName = String
  type Binary = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type DelegatesList = js.Array[delegate]
  type ListOfEndpoints = js.Array[Endpoint]
  type ListOfPlatformApplications = js.Array[PlatformApplication]
  type ListString = js.Array[String]
  type MapStringToString = js.Dictionary[String]
  type MessageAttributeMap = js.Dictionary[MessageAttributeValue]
  type PhoneNumber = String
  type PhoneNumberList = js.Array[PhoneNumber]
  type SubscriptionAttributesMap = js.Dictionary[attributeValue]
  type SubscriptionsList = js.Array[Subscription]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type TopicAttributesMap = js.Dictionary[attributeValue]
  type TopicsList = js.Array[Topic]
  type account = String
  type action = String
  type attributeName = String
  type attributeValue = String
  type authenticateOnUnsubscribe = String
  type delegate = String
  type endpoint = String
  type label = String
  type message = String
  type messageId = String
  type messageStructure = String
  type nextToken = String
  type protocol = String
  type subject = String
  type subscriptionARN = String
  type token = String
  type topicARN = String
  type topicName = String

  final class SNSOps(private val service: SNS) extends AnyVal {

    @inline def addPermissionFuture(params: AddPermissionInput): Future[js.Object] = service.addPermission(params).promise().toFuture
    @inline def checkIfPhoneNumberIsOptedOutFuture(params: CheckIfPhoneNumberIsOptedOutInput): Future[CheckIfPhoneNumberIsOptedOutResponse] = service.checkIfPhoneNumberIsOptedOut(params).promise().toFuture
    @inline def confirmSubscriptionFuture(params: ConfirmSubscriptionInput): Future[ConfirmSubscriptionResponse] = service.confirmSubscription(params).promise().toFuture
    @inline def createPlatformApplicationFuture(params: CreatePlatformApplicationInput): Future[CreatePlatformApplicationResponse] = service.createPlatformApplication(params).promise().toFuture
    @inline def createPlatformEndpointFuture(params: CreatePlatformEndpointInput): Future[CreateEndpointResponse] = service.createPlatformEndpoint(params).promise().toFuture
    @inline def createTopicFuture(params: CreateTopicInput): Future[CreateTopicResponse] = service.createTopic(params).promise().toFuture
    @inline def deleteEndpointFuture(params: DeleteEndpointInput): Future[js.Object] = service.deleteEndpoint(params).promise().toFuture
    @inline def deletePlatformApplicationFuture(params: DeletePlatformApplicationInput): Future[js.Object] = service.deletePlatformApplication(params).promise().toFuture
    @inline def deleteTopicFuture(params: DeleteTopicInput): Future[js.Object] = service.deleteTopic(params).promise().toFuture
    @inline def getEndpointAttributesFuture(params: GetEndpointAttributesInput): Future[GetEndpointAttributesResponse] = service.getEndpointAttributes(params).promise().toFuture
    @inline def getPlatformApplicationAttributesFuture(params: GetPlatformApplicationAttributesInput): Future[GetPlatformApplicationAttributesResponse] = service.getPlatformApplicationAttributes(params).promise().toFuture
    @inline def getSMSAttributesFuture(params: GetSMSAttributesInput): Future[GetSMSAttributesResponse] = service.getSMSAttributes(params).promise().toFuture
    @inline def getSubscriptionAttributesFuture(params: GetSubscriptionAttributesInput): Future[GetSubscriptionAttributesResponse] = service.getSubscriptionAttributes(params).promise().toFuture
    @inline def getTopicAttributesFuture(params: GetTopicAttributesInput): Future[GetTopicAttributesResponse] = service.getTopicAttributes(params).promise().toFuture
    @inline def listEndpointsByPlatformApplicationFuture(params: ListEndpointsByPlatformApplicationInput): Future[ListEndpointsByPlatformApplicationResponse] = service.listEndpointsByPlatformApplication(params).promise().toFuture
    @inline def listPhoneNumbersOptedOutFuture(params: ListPhoneNumbersOptedOutInput): Future[ListPhoneNumbersOptedOutResponse] = service.listPhoneNumbersOptedOut(params).promise().toFuture
    @inline def listPlatformApplicationsFuture(params: ListPlatformApplicationsInput): Future[ListPlatformApplicationsResponse] = service.listPlatformApplications(params).promise().toFuture
    @inline def listSubscriptionsByTopicFuture(params: ListSubscriptionsByTopicInput): Future[ListSubscriptionsByTopicResponse] = service.listSubscriptionsByTopic(params).promise().toFuture
    @inline def listSubscriptionsFuture(params: ListSubscriptionsInput): Future[ListSubscriptionsResponse] = service.listSubscriptions(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def listTopicsFuture(params: ListTopicsInput): Future[ListTopicsResponse] = service.listTopics(params).promise().toFuture
    @inline def optInPhoneNumberFuture(params: OptInPhoneNumberInput): Future[OptInPhoneNumberResponse] = service.optInPhoneNumber(params).promise().toFuture
    @inline def publishFuture(params: PublishInput): Future[PublishResponse] = service.publish(params).promise().toFuture
    @inline def removePermissionFuture(params: RemovePermissionInput): Future[js.Object] = service.removePermission(params).promise().toFuture
    @inline def setEndpointAttributesFuture(params: SetEndpointAttributesInput): Future[js.Object] = service.setEndpointAttributes(params).promise().toFuture
    @inline def setPlatformApplicationAttributesFuture(params: SetPlatformApplicationAttributesInput): Future[js.Object] = service.setPlatformApplicationAttributes(params).promise().toFuture
    @inline def setSMSAttributesFuture(params: SetSMSAttributesInput): Future[SetSMSAttributesResponse] = service.setSMSAttributes(params).promise().toFuture
    @inline def setSubscriptionAttributesFuture(params: SetSubscriptionAttributesInput): Future[js.Object] = service.setSubscriptionAttributes(params).promise().toFuture
    @inline def setTopicAttributesFuture(params: SetTopicAttributesInput): Future[js.Object] = service.setTopicAttributes(params).promise().toFuture
    @inline def subscribeFuture(params: SubscribeInput): Future[SubscribeResponse] = service.subscribe(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def unsubscribeFuture(params: UnsubscribeInput): Future[js.Object] = service.unsubscribe(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/sns", JSImport.Namespace, "AWS.SNS")
  class SNS() extends js.Object {
    def this(config: AWSConfig) = this()

    def addPermission(params: AddPermissionInput): Request[js.Object] = js.native
    def checkIfPhoneNumberIsOptedOut(params: CheckIfPhoneNumberIsOptedOutInput): Request[CheckIfPhoneNumberIsOptedOutResponse] = js.native
    def confirmSubscription(params: ConfirmSubscriptionInput): Request[ConfirmSubscriptionResponse] = js.native
    def createPlatformApplication(params: CreatePlatformApplicationInput): Request[CreatePlatformApplicationResponse] = js.native
    def createPlatformEndpoint(params: CreatePlatformEndpointInput): Request[CreateEndpointResponse] = js.native
    def createTopic(params: CreateTopicInput): Request[CreateTopicResponse] = js.native
    def deleteEndpoint(params: DeleteEndpointInput): Request[js.Object] = js.native
    def deletePlatformApplication(params: DeletePlatformApplicationInput): Request[js.Object] = js.native
    def deleteTopic(params: DeleteTopicInput): Request[js.Object] = js.native
    def getEndpointAttributes(params: GetEndpointAttributesInput): Request[GetEndpointAttributesResponse] = js.native
    def getPlatformApplicationAttributes(params: GetPlatformApplicationAttributesInput): Request[GetPlatformApplicationAttributesResponse] = js.native
    def getSMSAttributes(params: GetSMSAttributesInput): Request[GetSMSAttributesResponse] = js.native
    def getSubscriptionAttributes(params: GetSubscriptionAttributesInput): Request[GetSubscriptionAttributesResponse] = js.native
    def getTopicAttributes(params: GetTopicAttributesInput): Request[GetTopicAttributesResponse] = js.native
    def listEndpointsByPlatformApplication(params: ListEndpointsByPlatformApplicationInput): Request[ListEndpointsByPlatformApplicationResponse] = js.native
    def listPhoneNumbersOptedOut(params: ListPhoneNumbersOptedOutInput): Request[ListPhoneNumbersOptedOutResponse] = js.native
    def listPlatformApplications(params: ListPlatformApplicationsInput): Request[ListPlatformApplicationsResponse] = js.native
    def listSubscriptions(params: ListSubscriptionsInput): Request[ListSubscriptionsResponse] = js.native
    def listSubscriptionsByTopic(params: ListSubscriptionsByTopicInput): Request[ListSubscriptionsByTopicResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def listTopics(params: ListTopicsInput): Request[ListTopicsResponse] = js.native
    def optInPhoneNumber(params: OptInPhoneNumberInput): Request[OptInPhoneNumberResponse] = js.native
    def publish(params: PublishInput): Request[PublishResponse] = js.native
    def removePermission(params: RemovePermissionInput): Request[js.Object] = js.native
    def setEndpointAttributes(params: SetEndpointAttributesInput): Request[js.Object] = js.native
    def setPlatformApplicationAttributes(params: SetPlatformApplicationAttributesInput): Request[js.Object] = js.native
    def setSMSAttributes(params: SetSMSAttributesInput): Request[SetSMSAttributesResponse] = js.native
    def setSubscriptionAttributes(params: SetSubscriptionAttributesInput): Request[js.Object] = js.native
    def setTopicAttributes(params: SetTopicAttributesInput): Request[js.Object] = js.native
    def subscribe(params: SubscribeInput): Request[SubscribeResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def unsubscribe(params: UnsubscribeInput): Request[js.Object] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
  }
  object SNS {
    @inline implicit def toOps(service: SNS): SNSOps = {
      new SNSOps(service)
    }
  }

  @js.native
  trait AddPermissionInput extends js.Object {
    var AWSAccountId: DelegatesList
    var ActionName: ActionsList
    var Label: label
    var TopicArn: topicARN
  }

  object AddPermissionInput {
    @inline
    def apply(
        AWSAccountId: DelegatesList,
        ActionName: ActionsList,
        Label: label,
        TopicArn: topicARN
    ): AddPermissionInput = {
      val __obj = js.Dynamic.literal(
        "AWSAccountId" -> AWSAccountId.asInstanceOf[js.Any],
        "ActionName" -> ActionName.asInstanceOf[js.Any],
        "Label" -> Label.asInstanceOf[js.Any],
        "TopicArn" -> TopicArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AddPermissionInput]
    }
  }

  /** The input for the <code>CheckIfPhoneNumberIsOptedOut</code> action.
    */
  @js.native
  trait CheckIfPhoneNumberIsOptedOutInput extends js.Object {
    var phoneNumber: PhoneNumber
  }

  object CheckIfPhoneNumberIsOptedOutInput {
    @inline
    def apply(
        phoneNumber: PhoneNumber
    ): CheckIfPhoneNumberIsOptedOutInput = {
      val __obj = js.Dynamic.literal(
        "phoneNumber" -> phoneNumber.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CheckIfPhoneNumberIsOptedOutInput]
    }
  }

  /** The response from the <code>CheckIfPhoneNumberIsOptedOut</code> action.
    */
  @js.native
  trait CheckIfPhoneNumberIsOptedOutResponse extends js.Object {
    var isOptedOut: js.UndefOr[Boolean]
  }

  object CheckIfPhoneNumberIsOptedOutResponse {
    @inline
    def apply(
        isOptedOut: js.UndefOr[Boolean] = js.undefined
    ): CheckIfPhoneNumberIsOptedOutResponse = {
      val __obj = js.Dynamic.literal()
      isOptedOut.foreach(__v => __obj.updateDynamic("isOptedOut")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CheckIfPhoneNumberIsOptedOutResponse]
    }
  }

  /** Input for ConfirmSubscription action.
    */
  @js.native
  trait ConfirmSubscriptionInput extends js.Object {
    var Token: token
    var TopicArn: topicARN
    var AuthenticateOnUnsubscribe: js.UndefOr[authenticateOnUnsubscribe]
  }

  object ConfirmSubscriptionInput {
    @inline
    def apply(
        Token: token,
        TopicArn: topicARN,
        AuthenticateOnUnsubscribe: js.UndefOr[authenticateOnUnsubscribe] = js.undefined
    ): ConfirmSubscriptionInput = {
      val __obj = js.Dynamic.literal(
        "Token" -> Token.asInstanceOf[js.Any],
        "TopicArn" -> TopicArn.asInstanceOf[js.Any]
      )

      AuthenticateOnUnsubscribe.foreach(__v => __obj.updateDynamic("AuthenticateOnUnsubscribe")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfirmSubscriptionInput]
    }
  }

  /** Response for ConfirmSubscriptions action.
    */
  @js.native
  trait ConfirmSubscriptionResponse extends js.Object {
    var SubscriptionArn: js.UndefOr[subscriptionARN]
  }

  object ConfirmSubscriptionResponse {
    @inline
    def apply(
        SubscriptionArn: js.UndefOr[subscriptionARN] = js.undefined
    ): ConfirmSubscriptionResponse = {
      val __obj = js.Dynamic.literal()
      SubscriptionArn.foreach(__v => __obj.updateDynamic("SubscriptionArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfirmSubscriptionResponse]
    }
  }

  /** Response from CreateEndpoint action.
    */
  @js.native
  trait CreateEndpointResponse extends js.Object {
    var EndpointArn: js.UndefOr[String]
  }

  object CreateEndpointResponse {
    @inline
    def apply(
        EndpointArn: js.UndefOr[String] = js.undefined
    ): CreateEndpointResponse = {
      val __obj = js.Dynamic.literal()
      EndpointArn.foreach(__v => __obj.updateDynamic("EndpointArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateEndpointResponse]
    }
  }

  /** Input for CreatePlatformApplication action.
    */
  @js.native
  trait CreatePlatformApplicationInput extends js.Object {
    var Attributes: MapStringToString
    var Name: String
    var Platform: String
  }

  object CreatePlatformApplicationInput {
    @inline
    def apply(
        Attributes: MapStringToString,
        Name: String,
        Platform: String
    ): CreatePlatformApplicationInput = {
      val __obj = js.Dynamic.literal(
        "Attributes" -> Attributes.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Platform" -> Platform.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreatePlatformApplicationInput]
    }
  }

  /** Response from CreatePlatformApplication action.
    */
  @js.native
  trait CreatePlatformApplicationResponse extends js.Object {
    var PlatformApplicationArn: js.UndefOr[String]
  }

  object CreatePlatformApplicationResponse {
    @inline
    def apply(
        PlatformApplicationArn: js.UndefOr[String] = js.undefined
    ): CreatePlatformApplicationResponse = {
      val __obj = js.Dynamic.literal()
      PlatformApplicationArn.foreach(__v => __obj.updateDynamic("PlatformApplicationArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePlatformApplicationResponse]
    }
  }

  /** Input for CreatePlatformEndpoint action.
    */
  @js.native
  trait CreatePlatformEndpointInput extends js.Object {
    var PlatformApplicationArn: String
    var Token: String
    var Attributes: js.UndefOr[MapStringToString]
    var CustomUserData: js.UndefOr[String]
  }

  object CreatePlatformEndpointInput {
    @inline
    def apply(
        PlatformApplicationArn: String,
        Token: String,
        Attributes: js.UndefOr[MapStringToString] = js.undefined,
        CustomUserData: js.UndefOr[String] = js.undefined
    ): CreatePlatformEndpointInput = {
      val __obj = js.Dynamic.literal(
        "PlatformApplicationArn" -> PlatformApplicationArn.asInstanceOf[js.Any],
        "Token" -> Token.asInstanceOf[js.Any]
      )

      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      CustomUserData.foreach(__v => __obj.updateDynamic("CustomUserData")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePlatformEndpointInput]
    }
  }

  /** Input for CreateTopic action.
    */
  @js.native
  trait CreateTopicInput extends js.Object {
    var Name: topicName
    var Attributes: js.UndefOr[TopicAttributesMap]
    var Tags: js.UndefOr[TagList]
  }

  object CreateTopicInput {
    @inline
    def apply(
        Name: topicName,
        Attributes: js.UndefOr[TopicAttributesMap] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateTopicInput = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTopicInput]
    }
  }

  /** Response from CreateTopic action.
    */
  @js.native
  trait CreateTopicResponse extends js.Object {
    var TopicArn: js.UndefOr[topicARN]
  }

  object CreateTopicResponse {
    @inline
    def apply(
        TopicArn: js.UndefOr[topicARN] = js.undefined
    ): CreateTopicResponse = {
      val __obj = js.Dynamic.literal()
      TopicArn.foreach(__v => __obj.updateDynamic("TopicArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTopicResponse]
    }
  }

  /** Input for DeleteEndpoint action.
    */
  @js.native
  trait DeleteEndpointInput extends js.Object {
    var EndpointArn: String
  }

  object DeleteEndpointInput {
    @inline
    def apply(
        EndpointArn: String
    ): DeleteEndpointInput = {
      val __obj = js.Dynamic.literal(
        "EndpointArn" -> EndpointArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteEndpointInput]
    }
  }

  /** Input for DeletePlatformApplication action.
    */
  @js.native
  trait DeletePlatformApplicationInput extends js.Object {
    var PlatformApplicationArn: String
  }

  object DeletePlatformApplicationInput {
    @inline
    def apply(
        PlatformApplicationArn: String
    ): DeletePlatformApplicationInput = {
      val __obj = js.Dynamic.literal(
        "PlatformApplicationArn" -> PlatformApplicationArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeletePlatformApplicationInput]
    }
  }

  @js.native
  trait DeleteTopicInput extends js.Object {
    var TopicArn: topicARN
  }

  object DeleteTopicInput {
    @inline
    def apply(
        TopicArn: topicARN
    ): DeleteTopicInput = {
      val __obj = js.Dynamic.literal(
        "TopicArn" -> TopicArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteTopicInput]
    }
  }

  /** Endpoint for mobile app and device.
    */
  @js.native
  trait Endpoint extends js.Object {
    var Attributes: js.UndefOr[MapStringToString]
    var EndpointArn: js.UndefOr[String]
  }

  object Endpoint {
    @inline
    def apply(
        Attributes: js.UndefOr[MapStringToString] = js.undefined,
        EndpointArn: js.UndefOr[String] = js.undefined
    ): Endpoint = {
      val __obj = js.Dynamic.literal()
      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      EndpointArn.foreach(__v => __obj.updateDynamic("EndpointArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Endpoint]
    }
  }

  /** Input for GetEndpointAttributes action.
    */
  @js.native
  trait GetEndpointAttributesInput extends js.Object {
    var EndpointArn: String
  }

  object GetEndpointAttributesInput {
    @inline
    def apply(
        EndpointArn: String
    ): GetEndpointAttributesInput = {
      val __obj = js.Dynamic.literal(
        "EndpointArn" -> EndpointArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetEndpointAttributesInput]
    }
  }

  /** Response from GetEndpointAttributes of the EndpointArn.
    */
  @js.native
  trait GetEndpointAttributesResponse extends js.Object {
    var Attributes: js.UndefOr[MapStringToString]
  }

  object GetEndpointAttributesResponse {
    @inline
    def apply(
        Attributes: js.UndefOr[MapStringToString] = js.undefined
    ): GetEndpointAttributesResponse = {
      val __obj = js.Dynamic.literal()
      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetEndpointAttributesResponse]
    }
  }

  /** Input for GetPlatformApplicationAttributes action.
    */
  @js.native
  trait GetPlatformApplicationAttributesInput extends js.Object {
    var PlatformApplicationArn: String
  }

  object GetPlatformApplicationAttributesInput {
    @inline
    def apply(
        PlatformApplicationArn: String
    ): GetPlatformApplicationAttributesInput = {
      val __obj = js.Dynamic.literal(
        "PlatformApplicationArn" -> PlatformApplicationArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetPlatformApplicationAttributesInput]
    }
  }

  /** Response for GetPlatformApplicationAttributes action.
    */
  @js.native
  trait GetPlatformApplicationAttributesResponse extends js.Object {
    var Attributes: js.UndefOr[MapStringToString]
  }

  object GetPlatformApplicationAttributesResponse {
    @inline
    def apply(
        Attributes: js.UndefOr[MapStringToString] = js.undefined
    ): GetPlatformApplicationAttributesResponse = {
      val __obj = js.Dynamic.literal()
      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPlatformApplicationAttributesResponse]
    }
  }

  /** The input for the <code>GetSMSAttributes</code> request.
    */
  @js.native
  trait GetSMSAttributesInput extends js.Object {
    var attributes: js.UndefOr[ListString]
  }

  object GetSMSAttributesInput {
    @inline
    def apply(
        attributes: js.UndefOr[ListString] = js.undefined
    ): GetSMSAttributesInput = {
      val __obj = js.Dynamic.literal()
      attributes.foreach(__v => __obj.updateDynamic("attributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSMSAttributesInput]
    }
  }

  /** The response from the <code>GetSMSAttributes</code> request.
    */
  @js.native
  trait GetSMSAttributesResponse extends js.Object {
    var attributes: js.UndefOr[MapStringToString]
  }

  object GetSMSAttributesResponse {
    @inline
    def apply(
        attributes: js.UndefOr[MapStringToString] = js.undefined
    ): GetSMSAttributesResponse = {
      val __obj = js.Dynamic.literal()
      attributes.foreach(__v => __obj.updateDynamic("attributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSMSAttributesResponse]
    }
  }

  /** Input for GetSubscriptionAttributes.
    */
  @js.native
  trait GetSubscriptionAttributesInput extends js.Object {
    var SubscriptionArn: subscriptionARN
  }

  object GetSubscriptionAttributesInput {
    @inline
    def apply(
        SubscriptionArn: subscriptionARN
    ): GetSubscriptionAttributesInput = {
      val __obj = js.Dynamic.literal(
        "SubscriptionArn" -> SubscriptionArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetSubscriptionAttributesInput]
    }
  }

  /** Response for GetSubscriptionAttributes action.
    */
  @js.native
  trait GetSubscriptionAttributesResponse extends js.Object {
    var Attributes: js.UndefOr[SubscriptionAttributesMap]
  }

  object GetSubscriptionAttributesResponse {
    @inline
    def apply(
        Attributes: js.UndefOr[SubscriptionAttributesMap] = js.undefined
    ): GetSubscriptionAttributesResponse = {
      val __obj = js.Dynamic.literal()
      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSubscriptionAttributesResponse]
    }
  }

  /** Input for GetTopicAttributes action.
    */
  @js.native
  trait GetTopicAttributesInput extends js.Object {
    var TopicArn: topicARN
  }

  object GetTopicAttributesInput {
    @inline
    def apply(
        TopicArn: topicARN
    ): GetTopicAttributesInput = {
      val __obj = js.Dynamic.literal(
        "TopicArn" -> TopicArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetTopicAttributesInput]
    }
  }

  /** Response for GetTopicAttributes action.
    */
  @js.native
  trait GetTopicAttributesResponse extends js.Object {
    var Attributes: js.UndefOr[TopicAttributesMap]
  }

  object GetTopicAttributesResponse {
    @inline
    def apply(
        Attributes: js.UndefOr[TopicAttributesMap] = js.undefined
    ): GetTopicAttributesResponse = {
      val __obj = js.Dynamic.literal()
      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTopicAttributesResponse]
    }
  }

  /** Input for ListEndpointsByPlatformApplication action.
    */
  @js.native
  trait ListEndpointsByPlatformApplicationInput extends js.Object {
    var PlatformApplicationArn: String
    var NextToken: js.UndefOr[String]
  }

  object ListEndpointsByPlatformApplicationInput {
    @inline
    def apply(
        PlatformApplicationArn: String,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListEndpointsByPlatformApplicationInput = {
      val __obj = js.Dynamic.literal(
        "PlatformApplicationArn" -> PlatformApplicationArn.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEndpointsByPlatformApplicationInput]
    }
  }

  /** Response for ListEndpointsByPlatformApplication action.
    */
  @js.native
  trait ListEndpointsByPlatformApplicationResponse extends js.Object {
    var Endpoints: js.UndefOr[ListOfEndpoints]
    var NextToken: js.UndefOr[String]
  }

  object ListEndpointsByPlatformApplicationResponse {
    @inline
    def apply(
        Endpoints: js.UndefOr[ListOfEndpoints] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListEndpointsByPlatformApplicationResponse = {
      val __obj = js.Dynamic.literal()
      Endpoints.foreach(__v => __obj.updateDynamic("Endpoints")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEndpointsByPlatformApplicationResponse]
    }
  }

  /** The input for the <code>ListPhoneNumbersOptedOut</code> action.
    */
  @js.native
  trait ListPhoneNumbersOptedOutInput extends js.Object {
    var nextToken: js.UndefOr[String]
  }

  object ListPhoneNumbersOptedOutInput {
    @inline
    def apply(
        nextToken: js.UndefOr[String] = js.undefined
    ): ListPhoneNumbersOptedOutInput = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPhoneNumbersOptedOutInput]
    }
  }

  /** The response from the <code>ListPhoneNumbersOptedOut</code> action.
    */
  @js.native
  trait ListPhoneNumbersOptedOutResponse extends js.Object {
    var nextToken: js.UndefOr[String]
    var phoneNumbers: js.UndefOr[PhoneNumberList]
  }

  object ListPhoneNumbersOptedOutResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[String] = js.undefined,
        phoneNumbers: js.UndefOr[PhoneNumberList] = js.undefined
    ): ListPhoneNumbersOptedOutResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      phoneNumbers.foreach(__v => __obj.updateDynamic("phoneNumbers")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPhoneNumbersOptedOutResponse]
    }
  }

  /** Input for ListPlatformApplications action.
    */
  @js.native
  trait ListPlatformApplicationsInput extends js.Object {
    var NextToken: js.UndefOr[String]
  }

  object ListPlatformApplicationsInput {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined
    ): ListPlatformApplicationsInput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPlatformApplicationsInput]
    }
  }

  /** Response for ListPlatformApplications action.
    */
  @js.native
  trait ListPlatformApplicationsResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var PlatformApplications: js.UndefOr[ListOfPlatformApplications]
  }

  object ListPlatformApplicationsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        PlatformApplications: js.UndefOr[ListOfPlatformApplications] = js.undefined
    ): ListPlatformApplicationsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PlatformApplications.foreach(__v => __obj.updateDynamic("PlatformApplications")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPlatformApplicationsResponse]
    }
  }

  /** Input for ListSubscriptionsByTopic action.
    */
  @js.native
  trait ListSubscriptionsByTopicInput extends js.Object {
    var TopicArn: topicARN
    var NextToken: js.UndefOr[nextToken]
  }

  object ListSubscriptionsByTopicInput {
    @inline
    def apply(
        TopicArn: topicARN,
        NextToken: js.UndefOr[nextToken] = js.undefined
    ): ListSubscriptionsByTopicInput = {
      val __obj = js.Dynamic.literal(
        "TopicArn" -> TopicArn.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSubscriptionsByTopicInput]
    }
  }

  /** Response for ListSubscriptionsByTopic action.
    */
  @js.native
  trait ListSubscriptionsByTopicResponse extends js.Object {
    var NextToken: js.UndefOr[nextToken]
    var Subscriptions: js.UndefOr[SubscriptionsList]
  }

  object ListSubscriptionsByTopicResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[nextToken] = js.undefined,
        Subscriptions: js.UndefOr[SubscriptionsList] = js.undefined
    ): ListSubscriptionsByTopicResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Subscriptions.foreach(__v => __obj.updateDynamic("Subscriptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSubscriptionsByTopicResponse]
    }
  }

  /** Input for ListSubscriptions action.
    */
  @js.native
  trait ListSubscriptionsInput extends js.Object {
    var NextToken: js.UndefOr[nextToken]
  }

  object ListSubscriptionsInput {
    @inline
    def apply(
        NextToken: js.UndefOr[nextToken] = js.undefined
    ): ListSubscriptionsInput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSubscriptionsInput]
    }
  }

  /** Response for ListSubscriptions action
    */
  @js.native
  trait ListSubscriptionsResponse extends js.Object {
    var NextToken: js.UndefOr[nextToken]
    var Subscriptions: js.UndefOr[SubscriptionsList]
  }

  object ListSubscriptionsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[nextToken] = js.undefined,
        Subscriptions: js.UndefOr[SubscriptionsList] = js.undefined
    ): ListSubscriptionsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Subscriptions.foreach(__v => __obj.updateDynamic("Subscriptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSubscriptionsResponse]
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
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[TagList]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        Tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  @js.native
  trait ListTopicsInput extends js.Object {
    var NextToken: js.UndefOr[nextToken]
  }

  object ListTopicsInput {
    @inline
    def apply(
        NextToken: js.UndefOr[nextToken] = js.undefined
    ): ListTopicsInput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTopicsInput]
    }
  }

  /** Response for ListTopics action.
    */
  @js.native
  trait ListTopicsResponse extends js.Object {
    var NextToken: js.UndefOr[nextToken]
    var Topics: js.UndefOr[TopicsList]
  }

  object ListTopicsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[nextToken] = js.undefined,
        Topics: js.UndefOr[TopicsList] = js.undefined
    ): ListTopicsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Topics.foreach(__v => __obj.updateDynamic("Topics")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTopicsResponse]
    }
  }

  /** The user-specified message attribute value. For string data types, the value attribute has the same restrictions on the content as the message body. For more information, see [[https://docs.aws.amazon.com/sns/latest/api/API_Publish.html|Publish]]. Name, type, and value must not be empty or null. In addition, the message body should not be empty or null. All parts of the message attribute, including name, type, and value, are included in the message size restriction, which is currently 256 KB (262,144 bytes). For more information, see [[https://docs.aws.amazon.com/sns/latest/dg/SNSMessageAttributes.html|Amazon SNS message attributes]] and [[https://docs.aws.amazon.com/sns/latest/dg/sms_publish-to-phone.html|Publishing to a mobile phone]] in the <i>Amazon SNS Developer Guide.</i>
    */
  @js.native
  trait MessageAttributeValue extends js.Object {
    var DataType: String
    var BinaryValue: js.UndefOr[Binary]
    var StringValue: js.UndefOr[String]
  }

  object MessageAttributeValue {
    @inline
    def apply(
        DataType: String,
        BinaryValue: js.UndefOr[Binary] = js.undefined,
        StringValue: js.UndefOr[String] = js.undefined
    ): MessageAttributeValue = {
      val __obj = js.Dynamic.literal(
        "DataType" -> DataType.asInstanceOf[js.Any]
      )

      BinaryValue.foreach(__v => __obj.updateDynamic("BinaryValue")(__v.asInstanceOf[js.Any]))
      StringValue.foreach(__v => __obj.updateDynamic("StringValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MessageAttributeValue]
    }
  }

  /** Input for the OptInPhoneNumber action.
    */
  @js.native
  trait OptInPhoneNumberInput extends js.Object {
    var phoneNumber: PhoneNumber
  }

  object OptInPhoneNumberInput {
    @inline
    def apply(
        phoneNumber: PhoneNumber
    ): OptInPhoneNumberInput = {
      val __obj = js.Dynamic.literal(
        "phoneNumber" -> phoneNumber.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[OptInPhoneNumberInput]
    }
  }

  /** The response for the OptInPhoneNumber action.
    */
  @js.native
  trait OptInPhoneNumberResponse extends js.Object

  object OptInPhoneNumberResponse {
    @inline
    def apply(): OptInPhoneNumberResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptInPhoneNumberResponse]
    }
  }

  /** Platform application object.
    */
  @js.native
  trait PlatformApplication extends js.Object {
    var Attributes: js.UndefOr[MapStringToString]
    var PlatformApplicationArn: js.UndefOr[String]
  }

  object PlatformApplication {
    @inline
    def apply(
        Attributes: js.UndefOr[MapStringToString] = js.undefined,
        PlatformApplicationArn: js.UndefOr[String] = js.undefined
    ): PlatformApplication = {
      val __obj = js.Dynamic.literal()
      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      PlatformApplicationArn.foreach(__v => __obj.updateDynamic("PlatformApplicationArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PlatformApplication]
    }
  }

  /** Input for Publish action.
    */
  @js.native
  trait PublishInput extends js.Object {
    var Message: message
    var MessageAttributes: js.UndefOr[MessageAttributeMap]
    var MessageDeduplicationId: js.UndefOr[String]
    var MessageGroupId: js.UndefOr[String]
    var MessageStructure: js.UndefOr[messageStructure]
    var PhoneNumber: js.UndefOr[String]
    var Subject: js.UndefOr[subject]
    var TargetArn: js.UndefOr[String]
    var TopicArn: js.UndefOr[topicARN]
  }

  object PublishInput {
    @inline
    def apply(
        Message: message,
        MessageAttributes: js.UndefOr[MessageAttributeMap] = js.undefined,
        MessageDeduplicationId: js.UndefOr[String] = js.undefined,
        MessageGroupId: js.UndefOr[String] = js.undefined,
        MessageStructure: js.UndefOr[messageStructure] = js.undefined,
        PhoneNumber: js.UndefOr[String] = js.undefined,
        Subject: js.UndefOr[subject] = js.undefined,
        TargetArn: js.UndefOr[String] = js.undefined,
        TopicArn: js.UndefOr[topicARN] = js.undefined
    ): PublishInput = {
      val __obj = js.Dynamic.literal(
        "Message" -> Message.asInstanceOf[js.Any]
      )

      MessageAttributes.foreach(__v => __obj.updateDynamic("MessageAttributes")(__v.asInstanceOf[js.Any]))
      MessageDeduplicationId.foreach(__v => __obj.updateDynamic("MessageDeduplicationId")(__v.asInstanceOf[js.Any]))
      MessageGroupId.foreach(__v => __obj.updateDynamic("MessageGroupId")(__v.asInstanceOf[js.Any]))
      MessageStructure.foreach(__v => __obj.updateDynamic("MessageStructure")(__v.asInstanceOf[js.Any]))
      PhoneNumber.foreach(__v => __obj.updateDynamic("PhoneNumber")(__v.asInstanceOf[js.Any]))
      Subject.foreach(__v => __obj.updateDynamic("Subject")(__v.asInstanceOf[js.Any]))
      TargetArn.foreach(__v => __obj.updateDynamic("TargetArn")(__v.asInstanceOf[js.Any]))
      TopicArn.foreach(__v => __obj.updateDynamic("TopicArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PublishInput]
    }
  }

  /** Response for Publish action.
    */
  @js.native
  trait PublishResponse extends js.Object {
    var MessageId: js.UndefOr[messageId]
    var SequenceNumber: js.UndefOr[String]
  }

  object PublishResponse {
    @inline
    def apply(
        MessageId: js.UndefOr[messageId] = js.undefined,
        SequenceNumber: js.UndefOr[String] = js.undefined
    ): PublishResponse = {
      val __obj = js.Dynamic.literal()
      MessageId.foreach(__v => __obj.updateDynamic("MessageId")(__v.asInstanceOf[js.Any]))
      SequenceNumber.foreach(__v => __obj.updateDynamic("SequenceNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PublishResponse]
    }
  }

  /** Input for RemovePermission action.
    */
  @js.native
  trait RemovePermissionInput extends js.Object {
    var Label: label
    var TopicArn: topicARN
  }

  object RemovePermissionInput {
    @inline
    def apply(
        Label: label,
        TopicArn: topicARN
    ): RemovePermissionInput = {
      val __obj = js.Dynamic.literal(
        "Label" -> Label.asInstanceOf[js.Any],
        "TopicArn" -> TopicArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RemovePermissionInput]
    }
  }

  /** Input for SetEndpointAttributes action.
    */
  @js.native
  trait SetEndpointAttributesInput extends js.Object {
    var Attributes: MapStringToString
    var EndpointArn: String
  }

  object SetEndpointAttributesInput {
    @inline
    def apply(
        Attributes: MapStringToString,
        EndpointArn: String
    ): SetEndpointAttributesInput = {
      val __obj = js.Dynamic.literal(
        "Attributes" -> Attributes.asInstanceOf[js.Any],
        "EndpointArn" -> EndpointArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SetEndpointAttributesInput]
    }
  }

  /** Input for SetPlatformApplicationAttributes action.
    */
  @js.native
  trait SetPlatformApplicationAttributesInput extends js.Object {
    var Attributes: MapStringToString
    var PlatformApplicationArn: String
  }

  object SetPlatformApplicationAttributesInput {
    @inline
    def apply(
        Attributes: MapStringToString,
        PlatformApplicationArn: String
    ): SetPlatformApplicationAttributesInput = {
      val __obj = js.Dynamic.literal(
        "Attributes" -> Attributes.asInstanceOf[js.Any],
        "PlatformApplicationArn" -> PlatformApplicationArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SetPlatformApplicationAttributesInput]
    }
  }

  /** The input for the SetSMSAttributes action.
    */
  @js.native
  trait SetSMSAttributesInput extends js.Object {
    var attributes: MapStringToString
  }

  object SetSMSAttributesInput {
    @inline
    def apply(
        attributes: MapStringToString
    ): SetSMSAttributesInput = {
      val __obj = js.Dynamic.literal(
        "attributes" -> attributes.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SetSMSAttributesInput]
    }
  }

  /** The response for the SetSMSAttributes action.
    */
  @js.native
  trait SetSMSAttributesResponse extends js.Object

  object SetSMSAttributesResponse {
    @inline
    def apply(): SetSMSAttributesResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SetSMSAttributesResponse]
    }
  }

  /** Input for SetSubscriptionAttributes action.
    */
  @js.native
  trait SetSubscriptionAttributesInput extends js.Object {
    var AttributeName: attributeName
    var SubscriptionArn: subscriptionARN
    var AttributeValue: js.UndefOr[attributeValue]
  }

  object SetSubscriptionAttributesInput {
    @inline
    def apply(
        AttributeName: attributeName,
        SubscriptionArn: subscriptionARN,
        AttributeValue: js.UndefOr[attributeValue] = js.undefined
    ): SetSubscriptionAttributesInput = {
      val __obj = js.Dynamic.literal(
        "AttributeName" -> AttributeName.asInstanceOf[js.Any],
        "SubscriptionArn" -> SubscriptionArn.asInstanceOf[js.Any]
      )

      AttributeValue.foreach(__v => __obj.updateDynamic("AttributeValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SetSubscriptionAttributesInput]
    }
  }

  /** Input for SetTopicAttributes action.
    */
  @js.native
  trait SetTopicAttributesInput extends js.Object {
    var AttributeName: attributeName
    var TopicArn: topicARN
    var AttributeValue: js.UndefOr[attributeValue]
  }

  object SetTopicAttributesInput {
    @inline
    def apply(
        AttributeName: attributeName,
        TopicArn: topicARN,
        AttributeValue: js.UndefOr[attributeValue] = js.undefined
    ): SetTopicAttributesInput = {
      val __obj = js.Dynamic.literal(
        "AttributeName" -> AttributeName.asInstanceOf[js.Any],
        "TopicArn" -> TopicArn.asInstanceOf[js.Any]
      )

      AttributeValue.foreach(__v => __obj.updateDynamic("AttributeValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SetTopicAttributesInput]
    }
  }

  /** Input for Subscribe action.
    */
  @js.native
  trait SubscribeInput extends js.Object {
    var Protocol: protocol
    var TopicArn: topicARN
    var Attributes: js.UndefOr[SubscriptionAttributesMap]
    var Endpoint: js.UndefOr[endpoint]
    var ReturnSubscriptionArn: js.UndefOr[Boolean]
  }

  object SubscribeInput {
    @inline
    def apply(
        Protocol: protocol,
        TopicArn: topicARN,
        Attributes: js.UndefOr[SubscriptionAttributesMap] = js.undefined,
        Endpoint: js.UndefOr[endpoint] = js.undefined,
        ReturnSubscriptionArn: js.UndefOr[Boolean] = js.undefined
    ): SubscribeInput = {
      val __obj = js.Dynamic.literal(
        "Protocol" -> Protocol.asInstanceOf[js.Any],
        "TopicArn" -> TopicArn.asInstanceOf[js.Any]
      )

      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      Endpoint.foreach(__v => __obj.updateDynamic("Endpoint")(__v.asInstanceOf[js.Any]))
      ReturnSubscriptionArn.foreach(__v => __obj.updateDynamic("ReturnSubscriptionArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SubscribeInput]
    }
  }

  /** Response for Subscribe action.
    */
  @js.native
  trait SubscribeResponse extends js.Object {
    var SubscriptionArn: js.UndefOr[subscriptionARN]
  }

  object SubscribeResponse {
    @inline
    def apply(
        SubscriptionArn: js.UndefOr[subscriptionARN] = js.undefined
    ): SubscribeResponse = {
      val __obj = js.Dynamic.literal()
      SubscriptionArn.foreach(__v => __obj.updateDynamic("SubscriptionArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SubscribeResponse]
    }
  }

  /** A wrapper type for the attributes of an Amazon SNS subscription.
    */
  @js.native
  trait Subscription extends js.Object {
    var Endpoint: js.UndefOr[endpoint]
    var Owner: js.UndefOr[account]
    var Protocol: js.UndefOr[protocol]
    var SubscriptionArn: js.UndefOr[subscriptionARN]
    var TopicArn: js.UndefOr[topicARN]
  }

  object Subscription {
    @inline
    def apply(
        Endpoint: js.UndefOr[endpoint] = js.undefined,
        Owner: js.UndefOr[account] = js.undefined,
        Protocol: js.UndefOr[protocol] = js.undefined,
        SubscriptionArn: js.UndefOr[subscriptionARN] = js.undefined,
        TopicArn: js.UndefOr[topicARN] = js.undefined
    ): Subscription = {
      val __obj = js.Dynamic.literal()
      Endpoint.foreach(__v => __obj.updateDynamic("Endpoint")(__v.asInstanceOf[js.Any]))
      Owner.foreach(__v => __obj.updateDynamic("Owner")(__v.asInstanceOf[js.Any]))
      Protocol.foreach(__v => __obj.updateDynamic("Protocol")(__v.asInstanceOf[js.Any]))
      SubscriptionArn.foreach(__v => __obj.updateDynamic("SubscriptionArn")(__v.asInstanceOf[js.Any]))
      TopicArn.foreach(__v => __obj.updateDynamic("TopicArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Subscription]
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
    var Tags: TagList
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceArn: AmazonResourceName,
        Tags: TagList
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object

  object TagResourceResponse {
    @inline
    def apply(): TagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  /** A wrapper type for the topic's Amazon Resource Name (ARN). To retrieve a topic's attributes, use <code>GetTopicAttributes</code>.
    */
  @js.native
  trait Topic extends js.Object {
    var TopicArn: js.UndefOr[topicARN]
  }

  object Topic {
    @inline
    def apply(
        TopicArn: js.UndefOr[topicARN] = js.undefined
    ): Topic = {
      val __obj = js.Dynamic.literal()
      TopicArn.foreach(__v => __obj.updateDynamic("TopicArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Topic]
    }
  }

  /** Input for Unsubscribe action.
    */
  @js.native
  trait UnsubscribeInput extends js.Object {
    var SubscriptionArn: subscriptionARN
  }

  object UnsubscribeInput {
    @inline
    def apply(
        SubscriptionArn: subscriptionARN
    ): UnsubscribeInput = {
      val __obj = js.Dynamic.literal(
        "SubscriptionArn" -> SubscriptionArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UnsubscribeInput]
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
  trait UntagResourceResponse extends js.Object

  object UntagResourceResponse {
    @inline
    def apply(): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UntagResourceResponse]
    }
  }
}
