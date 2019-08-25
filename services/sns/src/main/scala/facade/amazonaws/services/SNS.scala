package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object sns {
  type ActionsList                = js.Array[action]
  type Binary                     = nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
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

  implicit final class SNSOps(val service: SNS) extends AnyVal {

    def addPermissionFuture(params: AddPermissionInput): Future[js.Object] =
      service.addPermission(params).promise.toFuture
    def checkIfPhoneNumberIsOptedOutFuture(
        params: CheckIfPhoneNumberIsOptedOutInput
    ): Future[CheckIfPhoneNumberIsOptedOutResponse] = service.checkIfPhoneNumberIsOptedOut(params).promise.toFuture
    def confirmSubscriptionFuture(params: ConfirmSubscriptionInput): Future[ConfirmSubscriptionResponse] =
      service.confirmSubscription(params).promise.toFuture
    def createPlatformApplicationFuture(
        params: CreatePlatformApplicationInput
    ): Future[CreatePlatformApplicationResponse] = service.createPlatformApplication(params).promise.toFuture
    def createPlatformEndpointFuture(params: CreatePlatformEndpointInput): Future[CreateEndpointResponse] =
      service.createPlatformEndpoint(params).promise.toFuture
    def createTopicFuture(params: CreateTopicInput): Future[CreateTopicResponse] =
      service.createTopic(params).promise.toFuture
    def deleteEndpointFuture(params: DeleteEndpointInput): Future[js.Object] =
      service.deleteEndpoint(params).promise.toFuture
    def deletePlatformApplicationFuture(params: DeletePlatformApplicationInput): Future[js.Object] =
      service.deletePlatformApplication(params).promise.toFuture
    def deleteTopicFuture(params: DeleteTopicInput): Future[js.Object] = service.deleteTopic(params).promise.toFuture
    def getEndpointAttributesFuture(params: GetEndpointAttributesInput): Future[GetEndpointAttributesResponse] =
      service.getEndpointAttributes(params).promise.toFuture
    def getPlatformApplicationAttributesFuture(
        params: GetPlatformApplicationAttributesInput
    ): Future[GetPlatformApplicationAttributesResponse] =
      service.getPlatformApplicationAttributes(params).promise.toFuture
    def getSMSAttributesFuture(params: GetSMSAttributesInput): Future[GetSMSAttributesResponse] =
      service.getSMSAttributes(params).promise.toFuture
    def getSubscriptionAttributesFuture(
        params: GetSubscriptionAttributesInput
    ): Future[GetSubscriptionAttributesResponse] = service.getSubscriptionAttributes(params).promise.toFuture
    def getTopicAttributesFuture(params: GetTopicAttributesInput): Future[GetTopicAttributesResponse] =
      service.getTopicAttributes(params).promise.toFuture
    def listEndpointsByPlatformApplicationFuture(
        params: ListEndpointsByPlatformApplicationInput
    ): Future[ListEndpointsByPlatformApplicationResponse] =
      service.listEndpointsByPlatformApplication(params).promise.toFuture
    def listPhoneNumbersOptedOutFuture(
        params: ListPhoneNumbersOptedOutInput
    ): Future[ListPhoneNumbersOptedOutResponse] = service.listPhoneNumbersOptedOut(params).promise.toFuture
    def listPlatformApplicationsFuture(
        params: ListPlatformApplicationsInput
    ): Future[ListPlatformApplicationsResponse] = service.listPlatformApplications(params).promise.toFuture
    def listSubscriptionsByTopicFuture(
        params: ListSubscriptionsByTopicInput
    ): Future[ListSubscriptionsByTopicResponse] = service.listSubscriptionsByTopic(params).promise.toFuture
    def listSubscriptionsFuture(params: ListSubscriptionsInput): Future[ListSubscriptionsResponse] =
      service.listSubscriptions(params).promise.toFuture
    def listTopicsFuture(params: ListTopicsInput): Future[ListTopicsResponse] =
      service.listTopics(params).promise.toFuture
    def optInPhoneNumberFuture(params: OptInPhoneNumberInput): Future[OptInPhoneNumberResponse] =
      service.optInPhoneNumber(params).promise.toFuture
    def publishFuture(params: PublishInput): Future[PublishResponse] = service.publish(params).promise.toFuture
    def removePermissionFuture(params: RemovePermissionInput): Future[js.Object] =
      service.removePermission(params).promise.toFuture
    def setEndpointAttributesFuture(params: SetEndpointAttributesInput): Future[js.Object] =
      service.setEndpointAttributes(params).promise.toFuture
    def setPlatformApplicationAttributesFuture(params: SetPlatformApplicationAttributesInput): Future[js.Object] =
      service.setPlatformApplicationAttributes(params).promise.toFuture
    def setSMSAttributesFuture(params: SetSMSAttributesInput): Future[SetSMSAttributesResponse] =
      service.setSMSAttributes(params).promise.toFuture
    def setSubscriptionAttributesFuture(params: SetSubscriptionAttributesInput): Future[js.Object] =
      service.setSubscriptionAttributes(params).promise.toFuture
    def setTopicAttributesFuture(params: SetTopicAttributesInput): Future[js.Object] =
      service.setTopicAttributes(params).promise.toFuture
    def subscribeFuture(params: SubscribeInput): Future[SubscribeResponse] = service.subscribe(params).promise.toFuture
    def unsubscribeFuture(params: UnsubscribeInput): Future[js.Object]     = service.unsubscribe(params).promise.toFuture
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
    def unsubscribe(params: UnsubscribeInput): Request[js.Object]                                           = js.native
  }

  @js.native
  trait AddPermissionInput extends js.Object {
    var AWSAccountId: DelegatesList
    var ActionName: ActionsList
    var Label: label
    var TopicArn: topicARN
  }

  object AddPermissionInput {
    def apply(
        AWSAccountId: DelegatesList,
        ActionName: ActionsList,
        Label: label,
        TopicArn: topicARN
    ): AddPermissionInput = {
      val __obj = js.Dictionary[js.Any](
        "AWSAccountId" -> AWSAccountId.asInstanceOf[js.Any],
        "ActionName"   -> ActionName.asInstanceOf[js.Any],
        "Label"        -> Label.asInstanceOf[js.Any],
        "TopicArn"     -> TopicArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AddPermissionInput]
    }
  }

  /**
    * The input for the <code>CheckIfPhoneNumberIsOptedOut</code> action.
    */
  @js.native
  trait CheckIfPhoneNumberIsOptedOutInput extends js.Object {
    var phoneNumber: PhoneNumber
  }

  object CheckIfPhoneNumberIsOptedOutInput {
    def apply(
        phoneNumber: PhoneNumber
    ): CheckIfPhoneNumberIsOptedOutInput = {
      val __obj = js.Dictionary[js.Any](
        "phoneNumber" -> phoneNumber.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CheckIfPhoneNumberIsOptedOutInput]
    }
  }

  /**
    * The response from the <code>CheckIfPhoneNumberIsOptedOut</code> action.
    */
  @js.native
  trait CheckIfPhoneNumberIsOptedOutResponse extends js.Object {
    var isOptedOut: js.UndefOr[Boolean]
  }

  object CheckIfPhoneNumberIsOptedOutResponse {
    def apply(
        isOptedOut: js.UndefOr[Boolean] = js.undefined
    ): CheckIfPhoneNumberIsOptedOutResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      isOptedOut.foreach(__v => __obj.update("isOptedOut", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CheckIfPhoneNumberIsOptedOutResponse]
    }
  }

  /**
    * Input for ConfirmSubscription action.
    */
  @js.native
  trait ConfirmSubscriptionInput extends js.Object {
    var Token: token
    var TopicArn: topicARN
    var AuthenticateOnUnsubscribe: js.UndefOr[authenticateOnUnsubscribe]
  }

  object ConfirmSubscriptionInput {
    def apply(
        Token: token,
        TopicArn: topicARN,
        AuthenticateOnUnsubscribe: js.UndefOr[authenticateOnUnsubscribe] = js.undefined
    ): ConfirmSubscriptionInput = {
      val __obj = js.Dictionary[js.Any](
        "Token"    -> Token.asInstanceOf[js.Any],
        "TopicArn" -> TopicArn.asInstanceOf[js.Any]
      )

      AuthenticateOnUnsubscribe.foreach(__v => __obj.update("AuthenticateOnUnsubscribe", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfirmSubscriptionInput]
    }
  }

  /**
    * Response for ConfirmSubscriptions action.
    */
  @js.native
  trait ConfirmSubscriptionResponse extends js.Object {
    var SubscriptionArn: js.UndefOr[subscriptionARN]
  }

  object ConfirmSubscriptionResponse {
    def apply(
        SubscriptionArn: js.UndefOr[subscriptionARN] = js.undefined
    ): ConfirmSubscriptionResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      SubscriptionArn.foreach(__v => __obj.update("SubscriptionArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfirmSubscriptionResponse]
    }
  }

  /**
    * Response from CreateEndpoint action.
    */
  @js.native
  trait CreateEndpointResponse extends js.Object {
    var EndpointArn: js.UndefOr[String]
  }

  object CreateEndpointResponse {
    def apply(
        EndpointArn: js.UndefOr[String] = js.undefined
    ): CreateEndpointResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      EndpointArn.foreach(__v => __obj.update("EndpointArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateEndpointResponse]
    }
  }

  /**
    * Input for CreatePlatformApplication action.
    */
  @js.native
  trait CreatePlatformApplicationInput extends js.Object {
    var Attributes: MapStringToString
    var Name: String
    var Platform: String
  }

  object CreatePlatformApplicationInput {
    def apply(
        Attributes: MapStringToString,
        Name: String,
        Platform: String
    ): CreatePlatformApplicationInput = {
      val __obj = js.Dictionary[js.Any](
        "Attributes" -> Attributes.asInstanceOf[js.Any],
        "Name"       -> Name.asInstanceOf[js.Any],
        "Platform"   -> Platform.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreatePlatformApplicationInput]
    }
  }

  /**
    * Response from CreatePlatformApplication action.
    */
  @js.native
  trait CreatePlatformApplicationResponse extends js.Object {
    var PlatformApplicationArn: js.UndefOr[String]
  }

  object CreatePlatformApplicationResponse {
    def apply(
        PlatformApplicationArn: js.UndefOr[String] = js.undefined
    ): CreatePlatformApplicationResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      PlatformApplicationArn.foreach(__v => __obj.update("PlatformApplicationArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePlatformApplicationResponse]
    }
  }

  /**
    * Input for CreatePlatformEndpoint action.
    */
  @js.native
  trait CreatePlatformEndpointInput extends js.Object {
    var PlatformApplicationArn: String
    var Token: String
    var Attributes: js.UndefOr[MapStringToString]
    var CustomUserData: js.UndefOr[String]
  }

  object CreatePlatformEndpointInput {
    def apply(
        PlatformApplicationArn: String,
        Token: String,
        Attributes: js.UndefOr[MapStringToString] = js.undefined,
        CustomUserData: js.UndefOr[String] = js.undefined
    ): CreatePlatformEndpointInput = {
      val __obj = js.Dictionary[js.Any](
        "PlatformApplicationArn" -> PlatformApplicationArn.asInstanceOf[js.Any],
        "Token"                  -> Token.asInstanceOf[js.Any]
      )

      Attributes.foreach(__v => __obj.update("Attributes", __v.asInstanceOf[js.Any]))
      CustomUserData.foreach(__v => __obj.update("CustomUserData", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePlatformEndpointInput]
    }
  }

  /**
    * Input for CreateTopic action.
    */
  @js.native
  trait CreateTopicInput extends js.Object {
    var Name: topicName
    var Attributes: js.UndefOr[TopicAttributesMap]
  }

  object CreateTopicInput {
    def apply(
        Name: topicName,
        Attributes: js.UndefOr[TopicAttributesMap] = js.undefined
    ): CreateTopicInput = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Attributes.foreach(__v => __obj.update("Attributes", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTopicInput]
    }
  }

  /**
    * Response from CreateTopic action.
    */
  @js.native
  trait CreateTopicResponse extends js.Object {
    var TopicArn: js.UndefOr[topicARN]
  }

  object CreateTopicResponse {
    def apply(
        TopicArn: js.UndefOr[topicARN] = js.undefined
    ): CreateTopicResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      TopicArn.foreach(__v => __obj.update("TopicArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTopicResponse]
    }
  }

  /**
    * Input for DeleteEndpoint action.
    */
  @js.native
  trait DeleteEndpointInput extends js.Object {
    var EndpointArn: String
  }

  object DeleteEndpointInput {
    def apply(
        EndpointArn: String
    ): DeleteEndpointInput = {
      val __obj = js.Dictionary[js.Any](
        "EndpointArn" -> EndpointArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteEndpointInput]
    }
  }

  /**
    * Input for DeletePlatformApplication action.
    */
  @js.native
  trait DeletePlatformApplicationInput extends js.Object {
    var PlatformApplicationArn: String
  }

  object DeletePlatformApplicationInput {
    def apply(
        PlatformApplicationArn: String
    ): DeletePlatformApplicationInput = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        TopicArn: topicARN
    ): DeleteTopicInput = {
      val __obj = js.Dictionary[js.Any](
        "TopicArn" -> TopicArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteTopicInput]
    }
  }

  /**
    * Endpoint for mobile app and device.
    */
  @js.native
  trait Endpoint extends js.Object {
    var Attributes: js.UndefOr[MapStringToString]
    var EndpointArn: js.UndefOr[String]
  }

  object Endpoint {
    def apply(
        Attributes: js.UndefOr[MapStringToString] = js.undefined,
        EndpointArn: js.UndefOr[String] = js.undefined
    ): Endpoint = {
      val __obj = js.Dictionary.empty[js.Any]
      Attributes.foreach(__v => __obj.update("Attributes", __v.asInstanceOf[js.Any]))
      EndpointArn.foreach(__v => __obj.update("EndpointArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Endpoint]
    }
  }

  /**
    * Input for GetEndpointAttributes action.
    */
  @js.native
  trait GetEndpointAttributesInput extends js.Object {
    var EndpointArn: String
  }

  object GetEndpointAttributesInput {
    def apply(
        EndpointArn: String
    ): GetEndpointAttributesInput = {
      val __obj = js.Dictionary[js.Any](
        "EndpointArn" -> EndpointArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetEndpointAttributesInput]
    }
  }

  /**
    * Response from GetEndpointAttributes of the EndpointArn.
    */
  @js.native
  trait GetEndpointAttributesResponse extends js.Object {
    var Attributes: js.UndefOr[MapStringToString]
  }

  object GetEndpointAttributesResponse {
    def apply(
        Attributes: js.UndefOr[MapStringToString] = js.undefined
    ): GetEndpointAttributesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Attributes.foreach(__v => __obj.update("Attributes", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetEndpointAttributesResponse]
    }
  }

  /**
    * Input for GetPlatformApplicationAttributes action.
    */
  @js.native
  trait GetPlatformApplicationAttributesInput extends js.Object {
    var PlatformApplicationArn: String
  }

  object GetPlatformApplicationAttributesInput {
    def apply(
        PlatformApplicationArn: String
    ): GetPlatformApplicationAttributesInput = {
      val __obj = js.Dictionary[js.Any](
        "PlatformApplicationArn" -> PlatformApplicationArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetPlatformApplicationAttributesInput]
    }
  }

  /**
    * Response for GetPlatformApplicationAttributes action.
    */
  @js.native
  trait GetPlatformApplicationAttributesResponse extends js.Object {
    var Attributes: js.UndefOr[MapStringToString]
  }

  object GetPlatformApplicationAttributesResponse {
    def apply(
        Attributes: js.UndefOr[MapStringToString] = js.undefined
    ): GetPlatformApplicationAttributesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Attributes.foreach(__v => __obj.update("Attributes", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPlatformApplicationAttributesResponse]
    }
  }

  /**
    * The input for the <code>GetSMSAttributes</code> request.
    */
  @js.native
  trait GetSMSAttributesInput extends js.Object {
    var attributes: js.UndefOr[ListString]
  }

  object GetSMSAttributesInput {
    def apply(
        attributes: js.UndefOr[ListString] = js.undefined
    ): GetSMSAttributesInput = {
      val __obj = js.Dictionary.empty[js.Any]
      attributes.foreach(__v => __obj.update("attributes", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSMSAttributesInput]
    }
  }

  /**
    * The response from the <code>GetSMSAttributes</code> request.
    */
  @js.native
  trait GetSMSAttributesResponse extends js.Object {
    var attributes: js.UndefOr[MapStringToString]
  }

  object GetSMSAttributesResponse {
    def apply(
        attributes: js.UndefOr[MapStringToString] = js.undefined
    ): GetSMSAttributesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      attributes.foreach(__v => __obj.update("attributes", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSMSAttributesResponse]
    }
  }

  /**
    * Input for GetSubscriptionAttributes.
    */
  @js.native
  trait GetSubscriptionAttributesInput extends js.Object {
    var SubscriptionArn: subscriptionARN
  }

  object GetSubscriptionAttributesInput {
    def apply(
        SubscriptionArn: subscriptionARN
    ): GetSubscriptionAttributesInput = {
      val __obj = js.Dictionary[js.Any](
        "SubscriptionArn" -> SubscriptionArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetSubscriptionAttributesInput]
    }
  }

  /**
    * Response for GetSubscriptionAttributes action.
    */
  @js.native
  trait GetSubscriptionAttributesResponse extends js.Object {
    var Attributes: js.UndefOr[SubscriptionAttributesMap]
  }

  object GetSubscriptionAttributesResponse {
    def apply(
        Attributes: js.UndefOr[SubscriptionAttributesMap] = js.undefined
    ): GetSubscriptionAttributesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Attributes.foreach(__v => __obj.update("Attributes", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSubscriptionAttributesResponse]
    }
  }

  /**
    * Input for GetTopicAttributes action.
    */
  @js.native
  trait GetTopicAttributesInput extends js.Object {
    var TopicArn: topicARN
  }

  object GetTopicAttributesInput {
    def apply(
        TopicArn: topicARN
    ): GetTopicAttributesInput = {
      val __obj = js.Dictionary[js.Any](
        "TopicArn" -> TopicArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetTopicAttributesInput]
    }
  }

  /**
    * Response for GetTopicAttributes action.
    */
  @js.native
  trait GetTopicAttributesResponse extends js.Object {
    var Attributes: js.UndefOr[TopicAttributesMap]
  }

  object GetTopicAttributesResponse {
    def apply(
        Attributes: js.UndefOr[TopicAttributesMap] = js.undefined
    ): GetTopicAttributesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Attributes.foreach(__v => __obj.update("Attributes", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTopicAttributesResponse]
    }
  }

  /**
    * Input for ListEndpointsByPlatformApplication action.
    */
  @js.native
  trait ListEndpointsByPlatformApplicationInput extends js.Object {
    var PlatformApplicationArn: String
    var NextToken: js.UndefOr[String]
  }

  object ListEndpointsByPlatformApplicationInput {
    def apply(
        PlatformApplicationArn: String,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListEndpointsByPlatformApplicationInput = {
      val __obj = js.Dictionary[js.Any](
        "PlatformApplicationArn" -> PlatformApplicationArn.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEndpointsByPlatformApplicationInput]
    }
  }

  /**
    * Response for ListEndpointsByPlatformApplication action.
    */
  @js.native
  trait ListEndpointsByPlatformApplicationResponse extends js.Object {
    var Endpoints: js.UndefOr[ListOfEndpoints]
    var NextToken: js.UndefOr[String]
  }

  object ListEndpointsByPlatformApplicationResponse {
    def apply(
        Endpoints: js.UndefOr[ListOfEndpoints] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListEndpointsByPlatformApplicationResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Endpoints.foreach(__v => __obj.update("Endpoints", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEndpointsByPlatformApplicationResponse]
    }
  }

  /**
    * The input for the <code>ListPhoneNumbersOptedOut</code> action.
    */
  @js.native
  trait ListPhoneNumbersOptedOutInput extends js.Object {
    var nextToken: js.UndefOr[String]
  }

  object ListPhoneNumbersOptedOutInput {
    def apply(
        nextToken: js.UndefOr[String] = js.undefined
    ): ListPhoneNumbersOptedOutInput = {
      val __obj = js.Dictionary.empty[js.Any]
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPhoneNumbersOptedOutInput]
    }
  }

  /**
    * The response from the <code>ListPhoneNumbersOptedOut</code> action.
    */
  @js.native
  trait ListPhoneNumbersOptedOutResponse extends js.Object {
    var nextToken: js.UndefOr[String]
    var phoneNumbers: js.UndefOr[PhoneNumberList]
  }

  object ListPhoneNumbersOptedOutResponse {
    def apply(
        nextToken: js.UndefOr[String] = js.undefined,
        phoneNumbers: js.UndefOr[PhoneNumberList] = js.undefined
    ): ListPhoneNumbersOptedOutResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      phoneNumbers.foreach(__v => __obj.update("phoneNumbers", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPhoneNumbersOptedOutResponse]
    }
  }

  /**
    * Input for ListPlatformApplications action.
    */
  @js.native
  trait ListPlatformApplicationsInput extends js.Object {
    var NextToken: js.UndefOr[String]
  }

  object ListPlatformApplicationsInput {
    def apply(
        NextToken: js.UndefOr[String] = js.undefined
    ): ListPlatformApplicationsInput = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPlatformApplicationsInput]
    }
  }

  /**
    * Response for ListPlatformApplications action.
    */
  @js.native
  trait ListPlatformApplicationsResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var PlatformApplications: js.UndefOr[ListOfPlatformApplications]
  }

  object ListPlatformApplicationsResponse {
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        PlatformApplications: js.UndefOr[ListOfPlatformApplications] = js.undefined
    ): ListPlatformApplicationsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      PlatformApplications.foreach(__v => __obj.update("PlatformApplications", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPlatformApplicationsResponse]
    }
  }

  /**
    * Input for ListSubscriptionsByTopic action.
    */
  @js.native
  trait ListSubscriptionsByTopicInput extends js.Object {
    var TopicArn: topicARN
    var NextToken: js.UndefOr[nextToken]
  }

  object ListSubscriptionsByTopicInput {
    def apply(
        TopicArn: topicARN,
        NextToken: js.UndefOr[nextToken] = js.undefined
    ): ListSubscriptionsByTopicInput = {
      val __obj = js.Dictionary[js.Any](
        "TopicArn" -> TopicArn.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSubscriptionsByTopicInput]
    }
  }

  /**
    * Response for ListSubscriptionsByTopic action.
    */
  @js.native
  trait ListSubscriptionsByTopicResponse extends js.Object {
    var NextToken: js.UndefOr[nextToken]
    var Subscriptions: js.UndefOr[SubscriptionsList]
  }

  object ListSubscriptionsByTopicResponse {
    def apply(
        NextToken: js.UndefOr[nextToken] = js.undefined,
        Subscriptions: js.UndefOr[SubscriptionsList] = js.undefined
    ): ListSubscriptionsByTopicResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      Subscriptions.foreach(__v => __obj.update("Subscriptions", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSubscriptionsByTopicResponse]
    }
  }

  /**
    * Input for ListSubscriptions action.
    */
  @js.native
  trait ListSubscriptionsInput extends js.Object {
    var NextToken: js.UndefOr[nextToken]
  }

  object ListSubscriptionsInput {
    def apply(
        NextToken: js.UndefOr[nextToken] = js.undefined
    ): ListSubscriptionsInput = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSubscriptionsInput]
    }
  }

  /**
    * Response for ListSubscriptions action
    */
  @js.native
  trait ListSubscriptionsResponse extends js.Object {
    var NextToken: js.UndefOr[nextToken]
    var Subscriptions: js.UndefOr[SubscriptionsList]
  }

  object ListSubscriptionsResponse {
    def apply(
        NextToken: js.UndefOr[nextToken] = js.undefined,
        Subscriptions: js.UndefOr[SubscriptionsList] = js.undefined
    ): ListSubscriptionsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      Subscriptions.foreach(__v => __obj.update("Subscriptions", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSubscriptionsResponse]
    }
  }

  @js.native
  trait ListTopicsInput extends js.Object {
    var NextToken: js.UndefOr[nextToken]
  }

  object ListTopicsInput {
    def apply(
        NextToken: js.UndefOr[nextToken] = js.undefined
    ): ListTopicsInput = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTopicsInput]
    }
  }

  /**
    * Response for ListTopics action.
    */
  @js.native
  trait ListTopicsResponse extends js.Object {
    var NextToken: js.UndefOr[nextToken]
    var Topics: js.UndefOr[TopicsList]
  }

  object ListTopicsResponse {
    def apply(
        NextToken: js.UndefOr[nextToken] = js.undefined,
        Topics: js.UndefOr[TopicsList] = js.undefined
    ): ListTopicsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      Topics.foreach(__v => __obj.update("Topics", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTopicsResponse]
    }
  }

  /**
    * The user-specified message attribute value. For string data types, the value attribute has the same restrictions on the content as the message body. For more information, see [[http://docs.aws.amazon.com/sns/latest/api/API_Publish.html|Publish]].
    *  Name, type, and value must not be empty or null. In addition, the message body should not be empty or null. All parts of the message attribute, including name, type, and value, are included in the message size restriction, which is currently 256 KB (262,144 bytes). For more information, see [[http://docs.aws.amazon.com/sns/latest/dg/SNSMessageAttributes.html|Using Amazon SNS Message Attributes]].
    */
  @js.native
  trait MessageAttributeValue extends js.Object {
    var DataType: String
    var BinaryValue: js.UndefOr[Binary]
    var StringValue: js.UndefOr[String]
  }

  object MessageAttributeValue {
    def apply(
        DataType: String,
        BinaryValue: js.UndefOr[Binary] = js.undefined,
        StringValue: js.UndefOr[String] = js.undefined
    ): MessageAttributeValue = {
      val __obj = js.Dictionary[js.Any](
        "DataType" -> DataType.asInstanceOf[js.Any]
      )

      BinaryValue.foreach(__v => __obj.update("BinaryValue", __v.asInstanceOf[js.Any]))
      StringValue.foreach(__v => __obj.update("StringValue", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MessageAttributeValue]
    }
  }

  /**
    * Input for the OptInPhoneNumber action.
    */
  @js.native
  trait OptInPhoneNumberInput extends js.Object {
    var phoneNumber: PhoneNumber
  }

  object OptInPhoneNumberInput {
    def apply(
        phoneNumber: PhoneNumber
    ): OptInPhoneNumberInput = {
      val __obj = js.Dictionary[js.Any](
        "phoneNumber" -> phoneNumber.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[OptInPhoneNumberInput]
    }
  }

  /**
    * The response for the OptInPhoneNumber action.
    */
  @js.native
  trait OptInPhoneNumberResponse extends js.Object {}

  object OptInPhoneNumberResponse {
    def apply(
        ): OptInPhoneNumberResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[OptInPhoneNumberResponse]
    }
  }

  /**
    * Platform application object.
    */
  @js.native
  trait PlatformApplication extends js.Object {
    var Attributes: js.UndefOr[MapStringToString]
    var PlatformApplicationArn: js.UndefOr[String]
  }

  object PlatformApplication {
    def apply(
        Attributes: js.UndefOr[MapStringToString] = js.undefined,
        PlatformApplicationArn: js.UndefOr[String] = js.undefined
    ): PlatformApplication = {
      val __obj = js.Dictionary.empty[js.Any]
      Attributes.foreach(__v => __obj.update("Attributes", __v.asInstanceOf[js.Any]))
      PlatformApplicationArn.foreach(__v => __obj.update("PlatformApplicationArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PlatformApplication]
    }
  }

  /**
    * Input for Publish action.
    */
  @js.native
  trait PublishInput extends js.Object {
    var Message: message
    var MessageAttributes: js.UndefOr[MessageAttributeMap]
    var MessageStructure: js.UndefOr[messageStructure]
    var PhoneNumber: js.UndefOr[String]
    var Subject: js.UndefOr[subject]
    var TargetArn: js.UndefOr[String]
    var TopicArn: js.UndefOr[topicARN]
  }

  object PublishInput {
    def apply(
        Message: message,
        MessageAttributes: js.UndefOr[MessageAttributeMap] = js.undefined,
        MessageStructure: js.UndefOr[messageStructure] = js.undefined,
        PhoneNumber: js.UndefOr[String] = js.undefined,
        Subject: js.UndefOr[subject] = js.undefined,
        TargetArn: js.UndefOr[String] = js.undefined,
        TopicArn: js.UndefOr[topicARN] = js.undefined
    ): PublishInput = {
      val __obj = js.Dictionary[js.Any](
        "Message" -> Message.asInstanceOf[js.Any]
      )

      MessageAttributes.foreach(__v => __obj.update("MessageAttributes", __v.asInstanceOf[js.Any]))
      MessageStructure.foreach(__v => __obj.update("MessageStructure", __v.asInstanceOf[js.Any]))
      PhoneNumber.foreach(__v => __obj.update("PhoneNumber", __v.asInstanceOf[js.Any]))
      Subject.foreach(__v => __obj.update("Subject", __v.asInstanceOf[js.Any]))
      TargetArn.foreach(__v => __obj.update("TargetArn", __v.asInstanceOf[js.Any]))
      TopicArn.foreach(__v => __obj.update("TopicArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PublishInput]
    }
  }

  /**
    * Response for Publish action.
    */
  @js.native
  trait PublishResponse extends js.Object {
    var MessageId: js.UndefOr[messageId]
  }

  object PublishResponse {
    def apply(
        MessageId: js.UndefOr[messageId] = js.undefined
    ): PublishResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      MessageId.foreach(__v => __obj.update("MessageId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PublishResponse]
    }
  }

  /**
    * Input for RemovePermission action.
    */
  @js.native
  trait RemovePermissionInput extends js.Object {
    var Label: label
    var TopicArn: topicARN
  }

  object RemovePermissionInput {
    def apply(
        Label: label,
        TopicArn: topicARN
    ): RemovePermissionInput = {
      val __obj = js.Dictionary[js.Any](
        "Label"    -> Label.asInstanceOf[js.Any],
        "TopicArn" -> TopicArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RemovePermissionInput]
    }
  }

  /**
    * Input for SetEndpointAttributes action.
    */
  @js.native
  trait SetEndpointAttributesInput extends js.Object {
    var Attributes: MapStringToString
    var EndpointArn: String
  }

  object SetEndpointAttributesInput {
    def apply(
        Attributes: MapStringToString,
        EndpointArn: String
    ): SetEndpointAttributesInput = {
      val __obj = js.Dictionary[js.Any](
        "Attributes"  -> Attributes.asInstanceOf[js.Any],
        "EndpointArn" -> EndpointArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SetEndpointAttributesInput]
    }
  }

  /**
    * Input for SetPlatformApplicationAttributes action.
    */
  @js.native
  trait SetPlatformApplicationAttributesInput extends js.Object {
    var Attributes: MapStringToString
    var PlatformApplicationArn: String
  }

  object SetPlatformApplicationAttributesInput {
    def apply(
        Attributes: MapStringToString,
        PlatformApplicationArn: String
    ): SetPlatformApplicationAttributesInput = {
      val __obj = js.Dictionary[js.Any](
        "Attributes"             -> Attributes.asInstanceOf[js.Any],
        "PlatformApplicationArn" -> PlatformApplicationArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SetPlatformApplicationAttributesInput]
    }
  }

  /**
    * The input for the SetSMSAttributes action.
    */
  @js.native
  trait SetSMSAttributesInput extends js.Object {
    var attributes: MapStringToString
  }

  object SetSMSAttributesInput {
    def apply(
        attributes: MapStringToString
    ): SetSMSAttributesInput = {
      val __obj = js.Dictionary[js.Any](
        "attributes" -> attributes.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SetSMSAttributesInput]
    }
  }

  /**
    * The response for the SetSMSAttributes action.
    */
  @js.native
  trait SetSMSAttributesResponse extends js.Object {}

  object SetSMSAttributesResponse {
    def apply(
        ): SetSMSAttributesResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[SetSMSAttributesResponse]
    }
  }

  /**
    * Input for SetSubscriptionAttributes action.
    */
  @js.native
  trait SetSubscriptionAttributesInput extends js.Object {
    var AttributeName: attributeName
    var SubscriptionArn: subscriptionARN
    var AttributeValue: js.UndefOr[attributeValue]
  }

  object SetSubscriptionAttributesInput {
    def apply(
        AttributeName: attributeName,
        SubscriptionArn: subscriptionARN,
        AttributeValue: js.UndefOr[attributeValue] = js.undefined
    ): SetSubscriptionAttributesInput = {
      val __obj = js.Dictionary[js.Any](
        "AttributeName"   -> AttributeName.asInstanceOf[js.Any],
        "SubscriptionArn" -> SubscriptionArn.asInstanceOf[js.Any]
      )

      AttributeValue.foreach(__v => __obj.update("AttributeValue", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SetSubscriptionAttributesInput]
    }
  }

  /**
    * Input for SetTopicAttributes action.
    */
  @js.native
  trait SetTopicAttributesInput extends js.Object {
    var AttributeName: attributeName
    var TopicArn: topicARN
    var AttributeValue: js.UndefOr[attributeValue]
  }

  object SetTopicAttributesInput {
    def apply(
        AttributeName: attributeName,
        TopicArn: topicARN,
        AttributeValue: js.UndefOr[attributeValue] = js.undefined
    ): SetTopicAttributesInput = {
      val __obj = js.Dictionary[js.Any](
        "AttributeName" -> AttributeName.asInstanceOf[js.Any],
        "TopicArn"      -> TopicArn.asInstanceOf[js.Any]
      )

      AttributeValue.foreach(__v => __obj.update("AttributeValue", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SetTopicAttributesInput]
    }
  }

  /**
    * Input for Subscribe action.
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
    def apply(
        Protocol: protocol,
        TopicArn: topicARN,
        Attributes: js.UndefOr[SubscriptionAttributesMap] = js.undefined,
        Endpoint: js.UndefOr[endpoint] = js.undefined,
        ReturnSubscriptionArn: js.UndefOr[Boolean] = js.undefined
    ): SubscribeInput = {
      val __obj = js.Dictionary[js.Any](
        "Protocol" -> Protocol.asInstanceOf[js.Any],
        "TopicArn" -> TopicArn.asInstanceOf[js.Any]
      )

      Attributes.foreach(__v => __obj.update("Attributes", __v.asInstanceOf[js.Any]))
      Endpoint.foreach(__v => __obj.update("Endpoint", __v.asInstanceOf[js.Any]))
      ReturnSubscriptionArn.foreach(__v => __obj.update("ReturnSubscriptionArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SubscribeInput]
    }
  }

  /**
    * Response for Subscribe action.
    */
  @js.native
  trait SubscribeResponse extends js.Object {
    var SubscriptionArn: js.UndefOr[subscriptionARN]
  }

  object SubscribeResponse {
    def apply(
        SubscriptionArn: js.UndefOr[subscriptionARN] = js.undefined
    ): SubscribeResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      SubscriptionArn.foreach(__v => __obj.update("SubscriptionArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SubscribeResponse]
    }
  }

  /**
    * A wrapper type for the attributes of an Amazon SNS subscription.
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
    def apply(
        Endpoint: js.UndefOr[endpoint] = js.undefined,
        Owner: js.UndefOr[account] = js.undefined,
        Protocol: js.UndefOr[protocol] = js.undefined,
        SubscriptionArn: js.UndefOr[subscriptionARN] = js.undefined,
        TopicArn: js.UndefOr[topicARN] = js.undefined
    ): Subscription = {
      val __obj = js.Dictionary.empty[js.Any]
      Endpoint.foreach(__v => __obj.update("Endpoint", __v.asInstanceOf[js.Any]))
      Owner.foreach(__v => __obj.update("Owner", __v.asInstanceOf[js.Any]))
      Protocol.foreach(__v => __obj.update("Protocol", __v.asInstanceOf[js.Any]))
      SubscriptionArn.foreach(__v => __obj.update("SubscriptionArn", __v.asInstanceOf[js.Any]))
      TopicArn.foreach(__v => __obj.update("TopicArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Subscription]
    }
  }

  /**
    * A wrapper type for the topic's Amazon Resource Name (ARN). To retrieve a topic's attributes, use <code>GetTopicAttributes</code>.
    */
  @js.native
  trait Topic extends js.Object {
    var TopicArn: js.UndefOr[topicARN]
  }

  object Topic {
    def apply(
        TopicArn: js.UndefOr[topicARN] = js.undefined
    ): Topic = {
      val __obj = js.Dictionary.empty[js.Any]
      TopicArn.foreach(__v => __obj.update("TopicArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Topic]
    }
  }

  /**
    * Input for Unsubscribe action.
    */
  @js.native
  trait UnsubscribeInput extends js.Object {
    var SubscriptionArn: subscriptionARN
  }

  object UnsubscribeInput {
    def apply(
        SubscriptionArn: subscriptionARN
    ): UnsubscribeInput = {
      val __obj = js.Dictionary[js.Any](
        "SubscriptionArn" -> SubscriptionArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UnsubscribeInput]
    }
  }
}
