package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
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
  type boolean                    = Boolean
  type delegate                   = String
  type endpoint                   = String
  type label                      = String
  type message                    = String
  type messageId                  = String
  type messageStructure           = String
  type nextToken                  = String
  type protocol                   = String
  type string                     = String
  type subject                    = String
  type subscriptionARN            = String
  type token                      = String
  type topicARN                   = String
  type topicName                  = String
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
      val _fields = IndexedSeq[(String, js.Any)](
        "AWSAccountId" -> AWSAccountId.asInstanceOf[js.Any],
        "ActionName"   -> ActionName.asInstanceOf[js.Any],
        "Label"        -> Label.asInstanceOf[js.Any],
        "TopicArn"     -> TopicArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddPermissionInput]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "phoneNumber" -> phoneNumber.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CheckIfPhoneNumberIsOptedOutInput]
    }
  }

  /**
    * The response from the <code>CheckIfPhoneNumberIsOptedOut</code> action.
    */
  @js.native
  trait CheckIfPhoneNumberIsOptedOutResponse extends js.Object {
    var isOptedOut: js.UndefOr[boolean]
  }

  object CheckIfPhoneNumberIsOptedOutResponse {
    def apply(
        isOptedOut: js.UndefOr[boolean] = js.undefined
    ): CheckIfPhoneNumberIsOptedOutResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "isOptedOut" -> isOptedOut.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CheckIfPhoneNumberIsOptedOutResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Token"    -> Token.asInstanceOf[js.Any],
        "TopicArn" -> TopicArn.asInstanceOf[js.Any],
        "AuthenticateOnUnsubscribe" -> AuthenticateOnUnsubscribe.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfirmSubscriptionInput]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "SubscriptionArn" -> SubscriptionArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfirmSubscriptionResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "EndpointArn" -> EndpointArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateEndpointResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Attributes" -> Attributes.asInstanceOf[js.Any],
        "Name"       -> Name.asInstanceOf[js.Any],
        "Platform"   -> Platform.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePlatformApplicationInput]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "PlatformApplicationArn" -> PlatformApplicationArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePlatformApplicationResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "PlatformApplicationArn" -> PlatformApplicationArn.asInstanceOf[js.Any],
        "Token"                  -> Token.asInstanceOf[js.Any],
        "Attributes" -> Attributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CustomUserData" -> CustomUserData.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePlatformEndpointInput]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "Attributes" -> Attributes.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTopicInput]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "TopicArn" -> TopicArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTopicResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "EndpointArn" -> EndpointArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteEndpointInput]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "PlatformApplicationArn" -> PlatformApplicationArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeletePlatformApplicationInput]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "TopicArn" -> TopicArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTopicInput]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Attributes" -> Attributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EndpointArn" -> EndpointArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Endpoint]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "EndpointArn" -> EndpointArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetEndpointAttributesInput]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Attributes" -> Attributes.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetEndpointAttributesResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "PlatformApplicationArn" -> PlatformApplicationArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPlatformApplicationAttributesInput]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Attributes" -> Attributes.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPlatformApplicationAttributesResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "attributes" -> attributes.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSMSAttributesInput]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "attributes" -> attributes.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSMSAttributesResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "SubscriptionArn" -> SubscriptionArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSubscriptionAttributesInput]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Attributes" -> Attributes.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSubscriptionAttributesResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "TopicArn" -> TopicArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTopicAttributesInput]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Attributes" -> Attributes.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTopicAttributesResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "PlatformApplicationArn" -> PlatformApplicationArn.asInstanceOf[js.Any],
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListEndpointsByPlatformApplicationInput]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Endpoints" -> Endpoints.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[ListEndpointsByPlatformApplicationResponse]
    }
  }

  /**
    * The input for the <code>ListPhoneNumbersOptedOut</code> action.
    */
  @js.native
  trait ListPhoneNumbersOptedOutInput extends js.Object {
    var nextToken: js.UndefOr[string]
  }

  object ListPhoneNumbersOptedOutInput {
    def apply(
        nextToken: js.UndefOr[string] = js.undefined
    ): ListPhoneNumbersOptedOutInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPhoneNumbersOptedOutInput]
    }
  }

  /**
    * The response from the <code>ListPhoneNumbersOptedOut</code> action.
    */
  @js.native
  trait ListPhoneNumbersOptedOutResponse extends js.Object {
    var nextToken: js.UndefOr[string]
    var phoneNumbers: js.UndefOr[PhoneNumberList]
  }

  object ListPhoneNumbersOptedOutResponse {
    def apply(
        nextToken: js.UndefOr[string] = js.undefined,
        phoneNumbers: js.UndefOr[PhoneNumberList] = js.undefined
    ): ListPhoneNumbersOptedOutResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "phoneNumbers" -> phoneNumbers.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPhoneNumbersOptedOutResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPlatformApplicationsInput]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PlatformApplications" -> PlatformApplications.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPlatformApplicationsResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "TopicArn" -> TopicArn.asInstanceOf[js.Any],
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSubscriptionsByTopicInput]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Subscriptions" -> Subscriptions.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSubscriptionsByTopicResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSubscriptionsInput]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Subscriptions" -> Subscriptions.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSubscriptionsResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTopicsInput]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Topics" -> Topics.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTopicsResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "DataType" -> DataType.asInstanceOf[js.Any],
        "BinaryValue" -> BinaryValue.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StringValue" -> StringValue.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MessageAttributeValue]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "phoneNumber" -> phoneNumber.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OptInPhoneNumberInput]
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
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OptInPhoneNumberResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Attributes" -> Attributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PlatformApplicationArn" -> PlatformApplicationArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PlatformApplication]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Message" -> Message.asInstanceOf[js.Any],
        "MessageAttributes" -> MessageAttributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MessageStructure" -> MessageStructure.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PhoneNumber" -> PhoneNumber.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Subject" -> Subject.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TargetArn" -> TargetArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TopicArn" -> TopicArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PublishInput]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "MessageId" -> MessageId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PublishResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Label"    -> Label.asInstanceOf[js.Any],
        "TopicArn" -> TopicArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemovePermissionInput]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Attributes"  -> Attributes.asInstanceOf[js.Any],
        "EndpointArn" -> EndpointArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetEndpointAttributesInput]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Attributes"             -> Attributes.asInstanceOf[js.Any],
        "PlatformApplicationArn" -> PlatformApplicationArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetPlatformApplicationAttributesInput]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "attributes" -> attributes.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetSMSAttributesInput]
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
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetSMSAttributesResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "AttributeName"   -> AttributeName.asInstanceOf[js.Any],
        "SubscriptionArn" -> SubscriptionArn.asInstanceOf[js.Any],
        "AttributeValue" -> AttributeValue.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetSubscriptionAttributesInput]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "AttributeName" -> AttributeName.asInstanceOf[js.Any],
        "TopicArn"      -> TopicArn.asInstanceOf[js.Any],
        "AttributeValue" -> AttributeValue.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetTopicAttributesInput]
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
    var ReturnSubscriptionArn: js.UndefOr[boolean]
  }

  object SubscribeInput {
    def apply(
        Protocol: protocol,
        TopicArn: topicARN,
        Attributes: js.UndefOr[SubscriptionAttributesMap] = js.undefined,
        Endpoint: js.UndefOr[endpoint] = js.undefined,
        ReturnSubscriptionArn: js.UndefOr[boolean] = js.undefined
    ): SubscribeInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Protocol" -> Protocol.asInstanceOf[js.Any],
        "TopicArn" -> TopicArn.asInstanceOf[js.Any],
        "Attributes" -> Attributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Endpoint" -> Endpoint.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReturnSubscriptionArn" -> ReturnSubscriptionArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SubscribeInput]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "SubscriptionArn" -> SubscriptionArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SubscribeResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Endpoint" -> Endpoint.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Owner" -> Owner.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Protocol" -> Protocol.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SubscriptionArn" -> SubscriptionArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TopicArn" -> TopicArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Subscription]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "TopicArn" -> TopicArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Topic]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "SubscriptionArn" -> SubscriptionArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UnsubscribeInput]
    }
  }
}
