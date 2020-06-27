package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object lexmodelbuildingservice {
  type AliasName                   = String
  type AliasNameOrListAll          = String
  type Blob                        = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type BotAliasMetadataList        = js.Array[BotAliasMetadata]
  type BotChannelAssociationList   = js.Array[BotChannelAssociation]
  type BotChannelName              = String
  type BotMetadataList             = js.Array[BotMetadata]
  type BotName                     = String
  type BotVersions                 = js.Array[Version]
  type BuiltinIntentMetadataList   = js.Array[BuiltinIntentMetadata]
  type BuiltinIntentSignature      = String
  type BuiltinIntentSlotList       = js.Array[BuiltinIntentSlot]
  type BuiltinSlotTypeMetadataList = js.Array[BuiltinSlotTypeMetadata]
  type BuiltinSlotTypeSignature    = String
  type ChannelConfigurationMap     = js.Dictionary[String]
  type ContentString               = String
  type Count                       = Int
  type CustomOrBuiltinSlotTypeName = String
  type Description                 = String
  type EnumerationValues           = js.Array[EnumerationValue]
  type GroupNumber                 = Int
  type IamRoleArn                  = String
  type IntentList                  = js.Array[Intent]
  type IntentMetadataList          = js.Array[IntentMetadata]
  type IntentName                  = String
  type IntentUtteranceList         = js.Array[Utterance]
  type KmsKeyArn                   = String
  type LambdaARN                   = String
  type ListOfUtterance             = js.Array[UtteranceData]
  type ListsOfUtterances           = js.Array[UtteranceList]
  type LocaleList                  = js.Array[Locale]
  type LogSettingsRequestList      = js.Array[LogSettingsRequest]
  type LogSettingsResponseList     = js.Array[LogSettingsResponse]
  type MaxResults                  = Int
  type MessageList                 = js.Array[Message]
  type MessageVersion              = String
  type Name                        = String
  type NextToken                   = String
  type NumericalVersion            = String
  type Priority                    = Int
  type PromptMaxAttempts           = Int
  type RegexPattern                = String
  type ResourceArn                 = String
  type ResourcePrefix              = String
  type ResponseCard                = String
  type SessionTTL                  = Int
  type SlotList                    = js.Array[Slot]
  type SlotName                    = String
  type SlotTypeConfigurations      = js.Array[SlotTypeConfiguration]
  type SlotTypeMetadataList        = js.Array[SlotTypeMetadata]
  type SlotTypeName                = String
  type SlotUtteranceList           = js.Array[Utterance]
  type StringList                  = js.Array[String]
  type SynonymList                 = js.Array[Value]
  type Timestamp                   = js.Date
  type UserId                      = String
  type Utterance                   = String
  type UtteranceString             = String
  type Value                       = String
  type Version                     = String

  implicit final class LexModelBuildingServiceOps(private val service: LexModelBuildingService) extends AnyVal {

    @inline def createBotVersionFuture(params: CreateBotVersionRequest): Future[CreateBotVersionResponse] =
      service.createBotVersion(params).promise().toFuture
    @inline def createIntentVersionFuture(params: CreateIntentVersionRequest): Future[CreateIntentVersionResponse] =
      service.createIntentVersion(params).promise().toFuture
    @inline def createSlotTypeVersionFuture(
        params: CreateSlotTypeVersionRequest
    ): Future[CreateSlotTypeVersionResponse] = service.createSlotTypeVersion(params).promise().toFuture
    @inline def deleteBotAliasFuture(params: DeleteBotAliasRequest): Future[js.Object] =
      service.deleteBotAlias(params).promise().toFuture
    @inline def deleteBotChannelAssociationFuture(params: DeleteBotChannelAssociationRequest): Future[js.Object] =
      service.deleteBotChannelAssociation(params).promise().toFuture
    @inline def deleteBotFuture(params: DeleteBotRequest): Future[js.Object] =
      service.deleteBot(params).promise().toFuture
    @inline def deleteBotVersionFuture(params: DeleteBotVersionRequest): Future[js.Object] =
      service.deleteBotVersion(params).promise().toFuture
    @inline def deleteIntentFuture(params: DeleteIntentRequest): Future[js.Object] =
      service.deleteIntent(params).promise().toFuture
    @inline def deleteIntentVersionFuture(params: DeleteIntentVersionRequest): Future[js.Object] =
      service.deleteIntentVersion(params).promise().toFuture
    @inline def deleteSlotTypeFuture(params: DeleteSlotTypeRequest): Future[js.Object] =
      service.deleteSlotType(params).promise().toFuture
    @inline def deleteSlotTypeVersionFuture(params: DeleteSlotTypeVersionRequest): Future[js.Object] =
      service.deleteSlotTypeVersion(params).promise().toFuture
    @inline def deleteUtterancesFuture(params: DeleteUtterancesRequest): Future[js.Object] =
      service.deleteUtterances(params).promise().toFuture
    @inline def getBotAliasFuture(params: GetBotAliasRequest): Future[GetBotAliasResponse] =
      service.getBotAlias(params).promise().toFuture
    @inline def getBotAliasesFuture(params: GetBotAliasesRequest): Future[GetBotAliasesResponse] =
      service.getBotAliases(params).promise().toFuture
    @inline def getBotChannelAssociationFuture(
        params: GetBotChannelAssociationRequest
    ): Future[GetBotChannelAssociationResponse] = service.getBotChannelAssociation(params).promise().toFuture
    @inline def getBotChannelAssociationsFuture(
        params: GetBotChannelAssociationsRequest
    ): Future[GetBotChannelAssociationsResponse]                            = service.getBotChannelAssociations(params).promise().toFuture
    @inline def getBotFuture(params: GetBotRequest): Future[GetBotResponse] = service.getBot(params).promise().toFuture
    @inline def getBotVersionsFuture(params: GetBotVersionsRequest): Future[GetBotVersionsResponse] =
      service.getBotVersions(params).promise().toFuture
    @inline def getBotsFuture(params: GetBotsRequest): Future[GetBotsResponse] =
      service.getBots(params).promise().toFuture
    @inline def getBuiltinIntentFuture(params: GetBuiltinIntentRequest): Future[GetBuiltinIntentResponse] =
      service.getBuiltinIntent(params).promise().toFuture
    @inline def getBuiltinIntentsFuture(params: GetBuiltinIntentsRequest): Future[GetBuiltinIntentsResponse] =
      service.getBuiltinIntents(params).promise().toFuture
    @inline def getBuiltinSlotTypesFuture(params: GetBuiltinSlotTypesRequest): Future[GetBuiltinSlotTypesResponse] =
      service.getBuiltinSlotTypes(params).promise().toFuture
    @inline def getExportFuture(params: GetExportRequest): Future[GetExportResponse] =
      service.getExport(params).promise().toFuture
    @inline def getImportFuture(params: GetImportRequest): Future[GetImportResponse] =
      service.getImport(params).promise().toFuture
    @inline def getIntentFuture(params: GetIntentRequest): Future[GetIntentResponse] =
      service.getIntent(params).promise().toFuture
    @inline def getIntentVersionsFuture(params: GetIntentVersionsRequest): Future[GetIntentVersionsResponse] =
      service.getIntentVersions(params).promise().toFuture
    @inline def getIntentsFuture(params: GetIntentsRequest): Future[GetIntentsResponse] =
      service.getIntents(params).promise().toFuture
    @inline def getSlotTypeFuture(params: GetSlotTypeRequest): Future[GetSlotTypeResponse] =
      service.getSlotType(params).promise().toFuture
    @inline def getSlotTypeVersionsFuture(params: GetSlotTypeVersionsRequest): Future[GetSlotTypeVersionsResponse] =
      service.getSlotTypeVersions(params).promise().toFuture
    @inline def getSlotTypesFuture(params: GetSlotTypesRequest): Future[GetSlotTypesResponse] =
      service.getSlotTypes(params).promise().toFuture
    @inline def getUtterancesViewFuture(params: GetUtterancesViewRequest): Future[GetUtterancesViewResponse] =
      service.getUtterancesView(params).promise().toFuture
    @inline def putBotAliasFuture(params: PutBotAliasRequest): Future[PutBotAliasResponse] =
      service.putBotAlias(params).promise().toFuture
    @inline def putBotFuture(params: PutBotRequest): Future[PutBotResponse] = service.putBot(params).promise().toFuture
    @inline def putIntentFuture(params: PutIntentRequest): Future[PutIntentResponse] =
      service.putIntent(params).promise().toFuture
    @inline def putSlotTypeFuture(params: PutSlotTypeRequest): Future[PutSlotTypeResponse] =
      service.putSlotType(params).promise().toFuture
    @inline def startImportFuture(params: StartImportRequest): Future[StartImportResponse] =
      service.startImport(params).promise().toFuture
  }
}

package lexmodelbuildingservice {
  @js.native
  @JSImport("aws-sdk", "LexModelBuildingService")
  class LexModelBuildingService() extends js.Object {
    def this(config: AWSConfig) = this()

    def createBotVersion(params: CreateBotVersionRequest): Request[CreateBotVersionResponse]                = js.native
    def createIntentVersion(params: CreateIntentVersionRequest): Request[CreateIntentVersionResponse]       = js.native
    def createSlotTypeVersion(params: CreateSlotTypeVersionRequest): Request[CreateSlotTypeVersionResponse] = js.native
    def deleteBot(params: DeleteBotRequest): Request[js.Object]                                             = js.native
    def deleteBotAlias(params: DeleteBotAliasRequest): Request[js.Object]                                   = js.native
    def deleteBotChannelAssociation(params: DeleteBotChannelAssociationRequest): Request[js.Object]         = js.native
    def deleteBotVersion(params: DeleteBotVersionRequest): Request[js.Object]                               = js.native
    def deleteIntent(params: DeleteIntentRequest): Request[js.Object]                                       = js.native
    def deleteIntentVersion(params: DeleteIntentVersionRequest): Request[js.Object]                         = js.native
    def deleteSlotType(params: DeleteSlotTypeRequest): Request[js.Object]                                   = js.native
    def deleteSlotTypeVersion(params: DeleteSlotTypeVersionRequest): Request[js.Object]                     = js.native
    def deleteUtterances(params: DeleteUtterancesRequest): Request[js.Object]                               = js.native
    def getBot(params: GetBotRequest): Request[GetBotResponse]                                              = js.native
    def getBotAlias(params: GetBotAliasRequest): Request[GetBotAliasResponse]                               = js.native
    def getBotAliases(params: GetBotAliasesRequest): Request[GetBotAliasesResponse]                         = js.native
    def getBotChannelAssociation(params: GetBotChannelAssociationRequest): Request[GetBotChannelAssociationResponse] =
      js.native
    def getBotChannelAssociations(
        params: GetBotChannelAssociationsRequest
    ): Request[GetBotChannelAssociationsResponse]                                                     = js.native
    def getBotVersions(params: GetBotVersionsRequest): Request[GetBotVersionsResponse]                = js.native
    def getBots(params: GetBotsRequest): Request[GetBotsResponse]                                     = js.native
    def getBuiltinIntent(params: GetBuiltinIntentRequest): Request[GetBuiltinIntentResponse]          = js.native
    def getBuiltinIntents(params: GetBuiltinIntentsRequest): Request[GetBuiltinIntentsResponse]       = js.native
    def getBuiltinSlotTypes(params: GetBuiltinSlotTypesRequest): Request[GetBuiltinSlotTypesResponse] = js.native
    def getExport(params: GetExportRequest): Request[GetExportResponse]                               = js.native
    def getImport(params: GetImportRequest): Request[GetImportResponse]                               = js.native
    def getIntent(params: GetIntentRequest): Request[GetIntentResponse]                               = js.native
    def getIntentVersions(params: GetIntentVersionsRequest): Request[GetIntentVersionsResponse]       = js.native
    def getIntents(params: GetIntentsRequest): Request[GetIntentsResponse]                            = js.native
    def getSlotType(params: GetSlotTypeRequest): Request[GetSlotTypeResponse]                         = js.native
    def getSlotTypeVersions(params: GetSlotTypeVersionsRequest): Request[GetSlotTypeVersionsResponse] = js.native
    def getSlotTypes(params: GetSlotTypesRequest): Request[GetSlotTypesResponse]                      = js.native
    def getUtterancesView(params: GetUtterancesViewRequest): Request[GetUtterancesViewResponse]       = js.native
    def putBot(params: PutBotRequest): Request[PutBotResponse]                                        = js.native
    def putBotAlias(params: PutBotAliasRequest): Request[PutBotAliasResponse]                         = js.native
    def putIntent(params: PutIntentRequest): Request[PutIntentResponse]                               = js.native
    def putSlotType(params: PutSlotTypeRequest): Request[PutSlotTypeResponse]                         = js.native
    def startImport(params: StartImportRequest): Request[StartImportResponse]                         = js.native
  }

  /**
    * Provides information about a bot alias.
    */
  @js.native
  @Factory
  trait BotAliasMetadata extends js.Object {
    var botName: js.UndefOr[BotName]
    var botVersion: js.UndefOr[Version]
    var checksum: js.UndefOr[String]
    var conversationLogs: js.UndefOr[ConversationLogsResponse]
    var createdDate: js.UndefOr[Timestamp]
    var description: js.UndefOr[Description]
    var lastUpdatedDate: js.UndefOr[Timestamp]
    var name: js.UndefOr[AliasName]
  }

  /**
    * Represents an association between an Amazon Lex bot and an external messaging platform.
    */
  @js.native
  @Factory
  trait BotChannelAssociation extends js.Object {
    var botAlias: js.UndefOr[AliasName]
    var botConfiguration: js.UndefOr[ChannelConfigurationMap]
    var botName: js.UndefOr[BotName]
    var createdDate: js.UndefOr[Timestamp]
    var description: js.UndefOr[Description]
    var failureReason: js.UndefOr[String]
    var name: js.UndefOr[BotChannelName]
    var status: js.UndefOr[ChannelStatus]
    var `type`: js.UndefOr[ChannelType]
  }

  /**
    * Provides information about a bot. .
    */
  @js.native
  @Factory
  trait BotMetadata extends js.Object {
    var createdDate: js.UndefOr[Timestamp]
    var description: js.UndefOr[Description]
    var lastUpdatedDate: js.UndefOr[Timestamp]
    var name: js.UndefOr[BotName]
    var status: js.UndefOr[Status]
    var version: js.UndefOr[Version]
  }

  /**
    * Provides metadata for a built-in intent.
    */
  @js.native
  @Factory
  trait BuiltinIntentMetadata extends js.Object {
    var signature: js.UndefOr[BuiltinIntentSignature]
    var supportedLocales: js.UndefOr[LocaleList]
  }

  /**
    * Provides information about a slot used in a built-in intent.
    */
  @js.native
  @Factory
  trait BuiltinIntentSlot extends js.Object {
    var name: js.UndefOr[String]
  }

  /**
    * Provides information about a built in slot type.
    */
  @js.native
  @Factory
  trait BuiltinSlotTypeMetadata extends js.Object {
    var signature: js.UndefOr[BuiltinSlotTypeSignature]
    var supportedLocales: js.UndefOr[LocaleList]
  }

  @js.native
  sealed trait ChannelStatus extends js.Any
  object ChannelStatus extends js.Object {
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[ChannelStatus]
    val CREATED     = "CREATED".asInstanceOf[ChannelStatus]
    val FAILED      = "FAILED".asInstanceOf[ChannelStatus]

    val values = js.Object.freeze(js.Array(IN_PROGRESS, CREATED, FAILED))
  }

  @js.native
  sealed trait ChannelType extends js.Any
  object ChannelType extends js.Object {
    val Facebook     = "Facebook".asInstanceOf[ChannelType]
    val Slack        = "Slack".asInstanceOf[ChannelType]
    val `Twilio-Sms` = "Twilio-Sms".asInstanceOf[ChannelType]
    val Kik          = "Kik".asInstanceOf[ChannelType]

    val values = js.Object.freeze(js.Array(Facebook, Slack, `Twilio-Sms`, Kik))
  }

  /**
    * Specifies a Lambda function that verifies requests to a bot or fulfills the user's request to a bot..
    */
  @js.native
  @Factory
  trait CodeHook extends js.Object {
    var messageVersion: MessageVersion
    var uri: LambdaARN
  }

  @js.native
  sealed trait ContentType extends js.Any
  object ContentType extends js.Object {
    val PlainText     = "PlainText".asInstanceOf[ContentType]
    val SSML          = "SSML".asInstanceOf[ContentType]
    val CustomPayload = "CustomPayload".asInstanceOf[ContentType]

    val values = js.Object.freeze(js.Array(PlainText, SSML, CustomPayload))
  }

  /**
    * Provides the settings needed for conversation logs.
    */
  @js.native
  @Factory
  trait ConversationLogsRequest extends js.Object {
    var iamRoleArn: IamRoleArn
    var logSettings: LogSettingsRequestList
  }

  /**
    * Contains information about conversation log settings.
    */
  @js.native
  @Factory
  trait ConversationLogsResponse extends js.Object {
    var iamRoleArn: js.UndefOr[IamRoleArn]
    var logSettings: js.UndefOr[LogSettingsResponseList]
  }

  @js.native
  @Factory
  trait CreateBotVersionRequest extends js.Object {
    var name: BotName
    var checksum: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait CreateBotVersionResponse extends js.Object {
    var abortStatement: js.UndefOr[Statement]
    var checksum: js.UndefOr[String]
    var childDirected: js.UndefOr[Boolean]
    var clarificationPrompt: js.UndefOr[Prompt]
    var createdDate: js.UndefOr[Timestamp]
    var description: js.UndefOr[Description]
    var detectSentiment: js.UndefOr[Boolean]
    var failureReason: js.UndefOr[String]
    var idleSessionTTLInSeconds: js.UndefOr[SessionTTL]
    var intents: js.UndefOr[IntentList]
    var lastUpdatedDate: js.UndefOr[Timestamp]
    var locale: js.UndefOr[Locale]
    var name: js.UndefOr[BotName]
    var status: js.UndefOr[Status]
    var version: js.UndefOr[Version]
    var voiceId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait CreateIntentVersionRequest extends js.Object {
    var name: IntentName
    var checksum: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait CreateIntentVersionResponse extends js.Object {
    var checksum: js.UndefOr[String]
    var conclusionStatement: js.UndefOr[Statement]
    var confirmationPrompt: js.UndefOr[Prompt]
    var createdDate: js.UndefOr[Timestamp]
    var description: js.UndefOr[Description]
    var dialogCodeHook: js.UndefOr[CodeHook]
    var followUpPrompt: js.UndefOr[FollowUpPrompt]
    var fulfillmentActivity: js.UndefOr[FulfillmentActivity]
    var lastUpdatedDate: js.UndefOr[Timestamp]
    var name: js.UndefOr[IntentName]
    var parentIntentSignature: js.UndefOr[BuiltinIntentSignature]
    var rejectionStatement: js.UndefOr[Statement]
    var sampleUtterances: js.UndefOr[IntentUtteranceList]
    var slots: js.UndefOr[SlotList]
    var version: js.UndefOr[Version]
  }

  @js.native
  @Factory
  trait CreateSlotTypeVersionRequest extends js.Object {
    var name: SlotTypeName
    var checksum: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait CreateSlotTypeVersionResponse extends js.Object {
    var checksum: js.UndefOr[String]
    var createdDate: js.UndefOr[Timestamp]
    var description: js.UndefOr[Description]
    var enumerationValues: js.UndefOr[EnumerationValues]
    var lastUpdatedDate: js.UndefOr[Timestamp]
    var name: js.UndefOr[SlotTypeName]
    var parentSlotTypeSignature: js.UndefOr[CustomOrBuiltinSlotTypeName]
    var slotTypeConfigurations: js.UndefOr[SlotTypeConfigurations]
    var valueSelectionStrategy: js.UndefOr[SlotValueSelectionStrategy]
    var version: js.UndefOr[Version]
  }

  @js.native
  @Factory
  trait DeleteBotAliasRequest extends js.Object {
    var botName: BotName
    var name: AliasName
  }

  @js.native
  @Factory
  trait DeleteBotChannelAssociationRequest extends js.Object {
    var botAlias: AliasName
    var botName: BotName
    var name: BotChannelName
  }

  @js.native
  @Factory
  trait DeleteBotRequest extends js.Object {
    var name: BotName
  }

  @js.native
  @Factory
  trait DeleteBotVersionRequest extends js.Object {
    var name: BotName
    var version: NumericalVersion
  }

  @js.native
  @Factory
  trait DeleteIntentRequest extends js.Object {
    var name: IntentName
  }

  @js.native
  @Factory
  trait DeleteIntentVersionRequest extends js.Object {
    var name: IntentName
    var version: NumericalVersion
  }

  @js.native
  @Factory
  trait DeleteSlotTypeRequest extends js.Object {
    var name: SlotTypeName
  }

  @js.native
  @Factory
  trait DeleteSlotTypeVersionRequest extends js.Object {
    var name: SlotTypeName
    var version: NumericalVersion
  }

  @js.native
  @Factory
  trait DeleteUtterancesRequest extends js.Object {
    var botName: BotName
    var userId: UserId
  }

  @js.native
  sealed trait Destination extends js.Any
  object Destination extends js.Object {
    val CLOUDWATCH_LOGS = "CLOUDWATCH_LOGS".asInstanceOf[Destination]
    val S3              = "S3".asInstanceOf[Destination]

    val values = js.Object.freeze(js.Array(CLOUDWATCH_LOGS, S3))
  }

  /**
    * Each slot type can have a set of values. Each enumeration value represents a value the slot type can take.
    *  For example, a pizza ordering bot could have a slot type that specifies the type of crust that the pizza should have. The slot type could include the values
    * * thick
    *  * thin
    *  * stuffed
    */
  @js.native
  @Factory
  trait EnumerationValue extends js.Object {
    var value: Value
    var synonyms: js.UndefOr[SynonymList]
  }

  @js.native
  sealed trait ExportStatus extends js.Any
  object ExportStatus extends js.Object {
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[ExportStatus]
    val READY       = "READY".asInstanceOf[ExportStatus]
    val FAILED      = "FAILED".asInstanceOf[ExportStatus]

    val values = js.Object.freeze(js.Array(IN_PROGRESS, READY, FAILED))
  }

  @js.native
  sealed trait ExportType extends js.Any
  object ExportType extends js.Object {
    val ALEXA_SKILLS_KIT = "ALEXA_SKILLS_KIT".asInstanceOf[ExportType]
    val LEX              = "LEX".asInstanceOf[ExportType]

    val values = js.Object.freeze(js.Array(ALEXA_SKILLS_KIT, LEX))
  }

  /**
    * A prompt for additional activity after an intent is fulfilled. For example, after the <code>OrderPizza</code> intent is fulfilled, you might prompt the user to find out whether the user wants to order drinks.
    */
  @js.native
  @Factory
  trait FollowUpPrompt extends js.Object {
    var prompt: Prompt
    var rejectionStatement: Statement
  }

  /**
    * Describes how the intent is fulfilled after the user provides all of the information required for the intent. You can provide a Lambda function to process the intent, or you can return the intent information to the client application. We recommend that you use a Lambda function so that the relevant logic lives in the Cloud and limit the client-side code primarily to presentation. If you need to update the logic, you only update the Lambda function; you don't need to upgrade your client application.
    *  Consider the following examples:
    * * In a pizza ordering application, after the user provides all of the information for placing an order, you use a Lambda function to place an order with a pizzeria.
    *  * In a gaming application, when a user says "pick up a rock," this information must go back to the client application so that it can perform the operation and update the graphics. In this case, you want Amazon Lex to return the intent data to the client.
    */
  @js.native
  @Factory
  trait FulfillmentActivity extends js.Object {
    var `type`: FulfillmentActivityType
    var codeHook: js.UndefOr[CodeHook]
  }

  @js.native
  sealed trait FulfillmentActivityType extends js.Any
  object FulfillmentActivityType extends js.Object {
    val ReturnIntent = "ReturnIntent".asInstanceOf[FulfillmentActivityType]
    val CodeHook     = "CodeHook".asInstanceOf[FulfillmentActivityType]

    val values = js.Object.freeze(js.Array(ReturnIntent, CodeHook))
  }

  @js.native
  @Factory
  trait GetBotAliasRequest extends js.Object {
    var botName: BotName
    var name: AliasName
  }

  @js.native
  @Factory
  trait GetBotAliasResponse extends js.Object {
    var botName: js.UndefOr[BotName]
    var botVersion: js.UndefOr[Version]
    var checksum: js.UndefOr[String]
    var conversationLogs: js.UndefOr[ConversationLogsResponse]
    var createdDate: js.UndefOr[Timestamp]
    var description: js.UndefOr[Description]
    var lastUpdatedDate: js.UndefOr[Timestamp]
    var name: js.UndefOr[AliasName]
  }

  @js.native
  @Factory
  trait GetBotAliasesRequest extends js.Object {
    var botName: BotName
    var maxResults: js.UndefOr[MaxResults]
    var nameContains: js.UndefOr[AliasName]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait GetBotAliasesResponse extends js.Object {
    var BotAliases: js.UndefOr[BotAliasMetadataList]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait GetBotChannelAssociationRequest extends js.Object {
    var botAlias: AliasName
    var botName: BotName
    var name: BotChannelName
  }

  @js.native
  @Factory
  trait GetBotChannelAssociationResponse extends js.Object {
    var botAlias: js.UndefOr[AliasName]
    var botConfiguration: js.UndefOr[ChannelConfigurationMap]
    var botName: js.UndefOr[BotName]
    var createdDate: js.UndefOr[Timestamp]
    var description: js.UndefOr[Description]
    var failureReason: js.UndefOr[String]
    var name: js.UndefOr[BotChannelName]
    var status: js.UndefOr[ChannelStatus]
    var `type`: js.UndefOr[ChannelType]
  }

  @js.native
  @Factory
  trait GetBotChannelAssociationsRequest extends js.Object {
    var botAlias: AliasNameOrListAll
    var botName: BotName
    var maxResults: js.UndefOr[MaxResults]
    var nameContains: js.UndefOr[BotChannelName]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait GetBotChannelAssociationsResponse extends js.Object {
    var botChannelAssociations: js.UndefOr[BotChannelAssociationList]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait GetBotRequest extends js.Object {
    var name: BotName
    var versionOrAlias: String
  }

  @js.native
  @Factory
  trait GetBotResponse extends js.Object {
    var abortStatement: js.UndefOr[Statement]
    var checksum: js.UndefOr[String]
    var childDirected: js.UndefOr[Boolean]
    var clarificationPrompt: js.UndefOr[Prompt]
    var createdDate: js.UndefOr[Timestamp]
    var description: js.UndefOr[Description]
    var detectSentiment: js.UndefOr[Boolean]
    var failureReason: js.UndefOr[String]
    var idleSessionTTLInSeconds: js.UndefOr[SessionTTL]
    var intents: js.UndefOr[IntentList]
    var lastUpdatedDate: js.UndefOr[Timestamp]
    var locale: js.UndefOr[Locale]
    var name: js.UndefOr[BotName]
    var status: js.UndefOr[Status]
    var version: js.UndefOr[Version]
    var voiceId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetBotVersionsRequest extends js.Object {
    var name: BotName
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait GetBotVersionsResponse extends js.Object {
    var bots: js.UndefOr[BotMetadataList]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait GetBotsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nameContains: js.UndefOr[BotName]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait GetBotsResponse extends js.Object {
    var bots: js.UndefOr[BotMetadataList]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait GetBuiltinIntentRequest extends js.Object {
    var signature: BuiltinIntentSignature
  }

  @js.native
  @Factory
  trait GetBuiltinIntentResponse extends js.Object {
    var signature: js.UndefOr[BuiltinIntentSignature]
    var slots: js.UndefOr[BuiltinIntentSlotList]
    var supportedLocales: js.UndefOr[LocaleList]
  }

  @js.native
  @Factory
  trait GetBuiltinIntentsRequest extends js.Object {
    var locale: js.UndefOr[Locale]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var signatureContains: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetBuiltinIntentsResponse extends js.Object {
    var intents: js.UndefOr[BuiltinIntentMetadataList]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait GetBuiltinSlotTypesRequest extends js.Object {
    var locale: js.UndefOr[Locale]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var signatureContains: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetBuiltinSlotTypesResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var slotTypes: js.UndefOr[BuiltinSlotTypeMetadataList]
  }

  @js.native
  @Factory
  trait GetExportRequest extends js.Object {
    var exportType: ExportType
    var name: Name
    var resourceType: ResourceType
    var version: NumericalVersion
  }

  @js.native
  @Factory
  trait GetExportResponse extends js.Object {
    var exportStatus: js.UndefOr[ExportStatus]
    var exportType: js.UndefOr[ExportType]
    var failureReason: js.UndefOr[String]
    var name: js.UndefOr[Name]
    var resourceType: js.UndefOr[ResourceType]
    var url: js.UndefOr[String]
    var version: js.UndefOr[NumericalVersion]
  }

  @js.native
  @Factory
  trait GetImportRequest extends js.Object {
    var importId: String
  }

  @js.native
  @Factory
  trait GetImportResponse extends js.Object {
    var createdDate: js.UndefOr[Timestamp]
    var failureReason: js.UndefOr[StringList]
    var importId: js.UndefOr[String]
    var importStatus: js.UndefOr[ImportStatus]
    var mergeStrategy: js.UndefOr[MergeStrategy]
    var name: js.UndefOr[Name]
    var resourceType: js.UndefOr[ResourceType]
  }

  @js.native
  @Factory
  trait GetIntentRequest extends js.Object {
    var name: IntentName
    var version: Version
  }

  @js.native
  @Factory
  trait GetIntentResponse extends js.Object {
    var checksum: js.UndefOr[String]
    var conclusionStatement: js.UndefOr[Statement]
    var confirmationPrompt: js.UndefOr[Prompt]
    var createdDate: js.UndefOr[Timestamp]
    var description: js.UndefOr[Description]
    var dialogCodeHook: js.UndefOr[CodeHook]
    var followUpPrompt: js.UndefOr[FollowUpPrompt]
    var fulfillmentActivity: js.UndefOr[FulfillmentActivity]
    var lastUpdatedDate: js.UndefOr[Timestamp]
    var name: js.UndefOr[IntentName]
    var parentIntentSignature: js.UndefOr[BuiltinIntentSignature]
    var rejectionStatement: js.UndefOr[Statement]
    var sampleUtterances: js.UndefOr[IntentUtteranceList]
    var slots: js.UndefOr[SlotList]
    var version: js.UndefOr[Version]
  }

  @js.native
  @Factory
  trait GetIntentVersionsRequest extends js.Object {
    var name: IntentName
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait GetIntentVersionsResponse extends js.Object {
    var intents: js.UndefOr[IntentMetadataList]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait GetIntentsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nameContains: js.UndefOr[IntentName]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait GetIntentsResponse extends js.Object {
    var intents: js.UndefOr[IntentMetadataList]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait GetSlotTypeRequest extends js.Object {
    var name: SlotTypeName
    var version: Version
  }

  @js.native
  @Factory
  trait GetSlotTypeResponse extends js.Object {
    var checksum: js.UndefOr[String]
    var createdDate: js.UndefOr[Timestamp]
    var description: js.UndefOr[Description]
    var enumerationValues: js.UndefOr[EnumerationValues]
    var lastUpdatedDate: js.UndefOr[Timestamp]
    var name: js.UndefOr[SlotTypeName]
    var parentSlotTypeSignature: js.UndefOr[CustomOrBuiltinSlotTypeName]
    var slotTypeConfigurations: js.UndefOr[SlotTypeConfigurations]
    var valueSelectionStrategy: js.UndefOr[SlotValueSelectionStrategy]
    var version: js.UndefOr[Version]
  }

  @js.native
  @Factory
  trait GetSlotTypeVersionsRequest extends js.Object {
    var name: SlotTypeName
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait GetSlotTypeVersionsResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var slotTypes: js.UndefOr[SlotTypeMetadataList]
  }

  @js.native
  @Factory
  trait GetSlotTypesRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nameContains: js.UndefOr[SlotTypeName]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait GetSlotTypesResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var slotTypes: js.UndefOr[SlotTypeMetadataList]
  }

  @js.native
  @Factory
  trait GetUtterancesViewRequest extends js.Object {
    var botName: BotName
    var botVersions: BotVersions
    var statusType: StatusType
  }

  @js.native
  @Factory
  trait GetUtterancesViewResponse extends js.Object {
    var botName: js.UndefOr[BotName]
    var utterances: js.UndefOr[ListsOfUtterances]
  }

  @js.native
  sealed trait ImportStatus extends js.Any
  object ImportStatus extends js.Object {
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[ImportStatus]
    val COMPLETE    = "COMPLETE".asInstanceOf[ImportStatus]
    val FAILED      = "FAILED".asInstanceOf[ImportStatus]

    val values = js.Object.freeze(js.Array(IN_PROGRESS, COMPLETE, FAILED))
  }

  /**
    * Identifies the specific version of an intent.
    */
  @js.native
  @Factory
  trait Intent extends js.Object {
    var intentName: IntentName
    var intentVersion: Version
  }

  /**
    * Provides information about an intent.
    */
  @js.native
  @Factory
  trait IntentMetadata extends js.Object {
    var createdDate: js.UndefOr[Timestamp]
    var description: js.UndefOr[Description]
    var lastUpdatedDate: js.UndefOr[Timestamp]
    var name: js.UndefOr[IntentName]
    var version: js.UndefOr[Version]
  }

  @js.native
  sealed trait Locale extends js.Any
  object Locale extends js.Object {
    val `en-US` = "en-US".asInstanceOf[Locale]
    val `en-GB` = "en-GB".asInstanceOf[Locale]
    val `de-DE` = "de-DE".asInstanceOf[Locale]

    val values = js.Object.freeze(js.Array(`en-US`, `en-GB`, `de-DE`))
  }

  /**
    * Settings used to configure delivery mode and destination for conversation logs.
    */
  @js.native
  @Factory
  trait LogSettingsRequest extends js.Object {
    var destination: Destination
    var logType: LogType
    var resourceArn: ResourceArn
    var kmsKeyArn: js.UndefOr[KmsKeyArn]
  }

  /**
    * The settings for conversation logs.
    */
  @js.native
  @Factory
  trait LogSettingsResponse extends js.Object {
    var destination: js.UndefOr[Destination]
    var kmsKeyArn: js.UndefOr[KmsKeyArn]
    var logType: js.UndefOr[LogType]
    var resourceArn: js.UndefOr[ResourceArn]
    var resourcePrefix: js.UndefOr[ResourcePrefix]
  }

  @js.native
  sealed trait LogType extends js.Any
  object LogType extends js.Object {
    val AUDIO = "AUDIO".asInstanceOf[LogType]
    val TEXT  = "TEXT".asInstanceOf[LogType]

    val values = js.Object.freeze(js.Array(AUDIO, TEXT))
  }

  @js.native
  sealed trait MergeStrategy extends js.Any
  object MergeStrategy extends js.Object {
    val OVERWRITE_LATEST = "OVERWRITE_LATEST".asInstanceOf[MergeStrategy]
    val FAIL_ON_CONFLICT = "FAIL_ON_CONFLICT".asInstanceOf[MergeStrategy]

    val values = js.Object.freeze(js.Array(OVERWRITE_LATEST, FAIL_ON_CONFLICT))
  }

  /**
    * The message object that provides the message text and its type.
    */
  @js.native
  @Factory
  trait Message extends js.Object {
    var content: ContentString
    var contentType: ContentType
    var groupNumber: js.UndefOr[GroupNumber]
  }

  @js.native
  sealed trait ObfuscationSetting extends js.Any
  object ObfuscationSetting extends js.Object {
    val NONE                = "NONE".asInstanceOf[ObfuscationSetting]
    val DEFAULT_OBFUSCATION = "DEFAULT_OBFUSCATION".asInstanceOf[ObfuscationSetting]

    val values = js.Object.freeze(js.Array(NONE, DEFAULT_OBFUSCATION))
  }

  @js.native
  sealed trait ProcessBehavior extends js.Any
  object ProcessBehavior extends js.Object {
    val SAVE  = "SAVE".asInstanceOf[ProcessBehavior]
    val BUILD = "BUILD".asInstanceOf[ProcessBehavior]

    val values = js.Object.freeze(js.Array(SAVE, BUILD))
  }

  /**
    * Obtains information from the user. To define a prompt, provide one or more messages and specify the number of attempts to get information from the user. If you provide more than one message, Amazon Lex chooses one of the messages to use to prompt the user. For more information, see <a>how-it-works</a>.
    */
  @js.native
  @Factory
  trait Prompt extends js.Object {
    var maxAttempts: PromptMaxAttempts
    var messages: MessageList
    var responseCard: js.UndefOr[ResponseCard]
  }

  @js.native
  @Factory
  trait PutBotAliasRequest extends js.Object {
    var botName: BotName
    var botVersion: Version
    var name: AliasName
    var checksum: js.UndefOr[String]
    var conversationLogs: js.UndefOr[ConversationLogsRequest]
    var description: js.UndefOr[Description]
  }

  @js.native
  @Factory
  trait PutBotAliasResponse extends js.Object {
    var botName: js.UndefOr[BotName]
    var botVersion: js.UndefOr[Version]
    var checksum: js.UndefOr[String]
    var conversationLogs: js.UndefOr[ConversationLogsResponse]
    var createdDate: js.UndefOr[Timestamp]
    var description: js.UndefOr[Description]
    var lastUpdatedDate: js.UndefOr[Timestamp]
    var name: js.UndefOr[AliasName]
  }

  @js.native
  @Factory
  trait PutBotRequest extends js.Object {
    var childDirected: Boolean
    var locale: Locale
    var name: BotName
    var abortStatement: js.UndefOr[Statement]
    var checksum: js.UndefOr[String]
    var clarificationPrompt: js.UndefOr[Prompt]
    var createVersion: js.UndefOr[Boolean]
    var description: js.UndefOr[Description]
    var detectSentiment: js.UndefOr[Boolean]
    var idleSessionTTLInSeconds: js.UndefOr[SessionTTL]
    var intents: js.UndefOr[IntentList]
    var processBehavior: js.UndefOr[ProcessBehavior]
    var voiceId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait PutBotResponse extends js.Object {
    var abortStatement: js.UndefOr[Statement]
    var checksum: js.UndefOr[String]
    var childDirected: js.UndefOr[Boolean]
    var clarificationPrompt: js.UndefOr[Prompt]
    var createVersion: js.UndefOr[Boolean]
    var createdDate: js.UndefOr[Timestamp]
    var description: js.UndefOr[Description]
    var detectSentiment: js.UndefOr[Boolean]
    var failureReason: js.UndefOr[String]
    var idleSessionTTLInSeconds: js.UndefOr[SessionTTL]
    var intents: js.UndefOr[IntentList]
    var lastUpdatedDate: js.UndefOr[Timestamp]
    var locale: js.UndefOr[Locale]
    var name: js.UndefOr[BotName]
    var status: js.UndefOr[Status]
    var version: js.UndefOr[Version]
    var voiceId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait PutIntentRequest extends js.Object {
    var name: IntentName
    var checksum: js.UndefOr[String]
    var conclusionStatement: js.UndefOr[Statement]
    var confirmationPrompt: js.UndefOr[Prompt]
    var createVersion: js.UndefOr[Boolean]
    var description: js.UndefOr[Description]
    var dialogCodeHook: js.UndefOr[CodeHook]
    var followUpPrompt: js.UndefOr[FollowUpPrompt]
    var fulfillmentActivity: js.UndefOr[FulfillmentActivity]
    var parentIntentSignature: js.UndefOr[BuiltinIntentSignature]
    var rejectionStatement: js.UndefOr[Statement]
    var sampleUtterances: js.UndefOr[IntentUtteranceList]
    var slots: js.UndefOr[SlotList]
  }

  @js.native
  @Factory
  trait PutIntentResponse extends js.Object {
    var checksum: js.UndefOr[String]
    var conclusionStatement: js.UndefOr[Statement]
    var confirmationPrompt: js.UndefOr[Prompt]
    var createVersion: js.UndefOr[Boolean]
    var createdDate: js.UndefOr[Timestamp]
    var description: js.UndefOr[Description]
    var dialogCodeHook: js.UndefOr[CodeHook]
    var followUpPrompt: js.UndefOr[FollowUpPrompt]
    var fulfillmentActivity: js.UndefOr[FulfillmentActivity]
    var lastUpdatedDate: js.UndefOr[Timestamp]
    var name: js.UndefOr[IntentName]
    var parentIntentSignature: js.UndefOr[BuiltinIntentSignature]
    var rejectionStatement: js.UndefOr[Statement]
    var sampleUtterances: js.UndefOr[IntentUtteranceList]
    var slots: js.UndefOr[SlotList]
    var version: js.UndefOr[Version]
  }

  @js.native
  @Factory
  trait PutSlotTypeRequest extends js.Object {
    var name: SlotTypeName
    var checksum: js.UndefOr[String]
    var createVersion: js.UndefOr[Boolean]
    var description: js.UndefOr[Description]
    var enumerationValues: js.UndefOr[EnumerationValues]
    var parentSlotTypeSignature: js.UndefOr[CustomOrBuiltinSlotTypeName]
    var slotTypeConfigurations: js.UndefOr[SlotTypeConfigurations]
    var valueSelectionStrategy: js.UndefOr[SlotValueSelectionStrategy]
  }

  @js.native
  @Factory
  trait PutSlotTypeResponse extends js.Object {
    var checksum: js.UndefOr[String]
    var createVersion: js.UndefOr[Boolean]
    var createdDate: js.UndefOr[Timestamp]
    var description: js.UndefOr[Description]
    var enumerationValues: js.UndefOr[EnumerationValues]
    var lastUpdatedDate: js.UndefOr[Timestamp]
    var name: js.UndefOr[SlotTypeName]
    var parentSlotTypeSignature: js.UndefOr[CustomOrBuiltinSlotTypeName]
    var slotTypeConfigurations: js.UndefOr[SlotTypeConfigurations]
    var valueSelectionStrategy: js.UndefOr[SlotValueSelectionStrategy]
    var version: js.UndefOr[Version]
  }

  @js.native
  sealed trait ResourceType extends js.Any
  object ResourceType extends js.Object {
    val BOT       = "BOT".asInstanceOf[ResourceType]
    val INTENT    = "INTENT".asInstanceOf[ResourceType]
    val SLOT_TYPE = "SLOT_TYPE".asInstanceOf[ResourceType]

    val values = js.Object.freeze(js.Array(BOT, INTENT, SLOT_TYPE))
  }

  /**
    * Identifies the version of a specific slot.
    */
  @js.native
  @Factory
  trait Slot extends js.Object {
    var name: SlotName
    var slotConstraint: SlotConstraint
    var description: js.UndefOr[Description]
    var obfuscationSetting: js.UndefOr[ObfuscationSetting]
    var priority: js.UndefOr[Priority]
    var responseCard: js.UndefOr[ResponseCard]
    var sampleUtterances: js.UndefOr[SlotUtteranceList]
    var slotType: js.UndefOr[CustomOrBuiltinSlotTypeName]
    var slotTypeVersion: js.UndefOr[Version]
    var valueElicitationPrompt: js.UndefOr[Prompt]
  }

  @js.native
  sealed trait SlotConstraint extends js.Any
  object SlotConstraint extends js.Object {
    val Required = "Required".asInstanceOf[SlotConstraint]
    val Optional = "Optional".asInstanceOf[SlotConstraint]

    val values = js.Object.freeze(js.Array(Required, Optional))
  }

  /**
    * Provides configuration information for a slot type.
    */
  @js.native
  @Factory
  trait SlotTypeConfiguration extends js.Object {
    var regexConfiguration: js.UndefOr[SlotTypeRegexConfiguration]
  }

  /**
    * Provides information about a slot type..
    */
  @js.native
  @Factory
  trait SlotTypeMetadata extends js.Object {
    var createdDate: js.UndefOr[Timestamp]
    var description: js.UndefOr[Description]
    var lastUpdatedDate: js.UndefOr[Timestamp]
    var name: js.UndefOr[SlotTypeName]
    var version: js.UndefOr[Version]
  }

  /**
    * Provides a regular expression used to validate the value of a slot.
    */
  @js.native
  @Factory
  trait SlotTypeRegexConfiguration extends js.Object {
    var pattern: RegexPattern
  }

  @js.native
  sealed trait SlotValueSelectionStrategy extends js.Any
  object SlotValueSelectionStrategy extends js.Object {
    val ORIGINAL_VALUE = "ORIGINAL_VALUE".asInstanceOf[SlotValueSelectionStrategy]
    val TOP_RESOLUTION = "TOP_RESOLUTION".asInstanceOf[SlotValueSelectionStrategy]

    val values = js.Object.freeze(js.Array(ORIGINAL_VALUE, TOP_RESOLUTION))
  }

  @js.native
  @Factory
  trait StartImportRequest extends js.Object {
    var mergeStrategy: MergeStrategy
    var payload: Blob
    var resourceType: ResourceType
  }

  @js.native
  @Factory
  trait StartImportResponse extends js.Object {
    var createdDate: js.UndefOr[Timestamp]
    var importId: js.UndefOr[String]
    var importStatus: js.UndefOr[ImportStatus]
    var mergeStrategy: js.UndefOr[MergeStrategy]
    var name: js.UndefOr[Name]
    var resourceType: js.UndefOr[ResourceType]
  }

  /**
    * A collection of messages that convey information to the user. At runtime, Amazon Lex selects the message to convey.
    */
  @js.native
  @Factory
  trait Statement extends js.Object {
    var messages: MessageList
    var responseCard: js.UndefOr[ResponseCard]
  }

  @js.native
  sealed trait Status extends js.Any
  object Status extends js.Object {
    val BUILDING            = "BUILDING".asInstanceOf[Status]
    val READY               = "READY".asInstanceOf[Status]
    val READY_BASIC_TESTING = "READY_BASIC_TESTING".asInstanceOf[Status]
    val FAILED              = "FAILED".asInstanceOf[Status]
    val NOT_BUILT           = "NOT_BUILT".asInstanceOf[Status]

    val values = js.Object.freeze(js.Array(BUILDING, READY, READY_BASIC_TESTING, FAILED, NOT_BUILT))
  }

  @js.native
  sealed trait StatusType extends js.Any
  object StatusType extends js.Object {
    val Detected = "Detected".asInstanceOf[StatusType]
    val Missed   = "Missed".asInstanceOf[StatusType]

    val values = js.Object.freeze(js.Array(Detected, Missed))
  }

  /**
    * Provides information about a single utterance that was made to your bot.
    */
  @js.native
  @Factory
  trait UtteranceData extends js.Object {
    var count: js.UndefOr[Count]
    var distinctUsers: js.UndefOr[Count]
    var firstUtteredDate: js.UndefOr[Timestamp]
    var lastUtteredDate: js.UndefOr[Timestamp]
    var utteranceString: js.UndefOr[UtteranceString]
  }

  /**
    * Provides a list of utterances that have been made to a specific version of your bot. The list contains a maximum of 100 utterances.
    */
  @js.native
  @Factory
  trait UtteranceList extends js.Object {
    var botVersion: js.UndefOr[Version]
    var utterances: js.UndefOr[ListOfUtterance]
  }
}
