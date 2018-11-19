package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object lexmodelbuildingservice {
  type AliasName = String
  type AliasNameOrListAll = String
  type Blob = nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type BotAliasMetadataList = js.Array[BotAliasMetadata]
  type BotChannelAssociationList = js.Array[BotChannelAssociation]
  type BotChannelName = String
  type BotMetadataList = js.Array[BotMetadata]
  type BotName = String
  type BotVersions = js.Array[Version]
  type BuiltinIntentMetadataList = js.Array[BuiltinIntentMetadata]
  type BuiltinIntentSignature = String
  type BuiltinIntentSlotList = js.Array[BuiltinIntentSlot]
  type BuiltinSlotTypeMetadataList = js.Array[BuiltinSlotTypeMetadata]
  type BuiltinSlotTypeSignature = String
  type ChannelConfigurationMap = js.Dictionary[String]
  type ChannelStatus = String
  type ChannelType = String
  type ContentString = String
  type ContentType = String
  type Count = Int
  type CustomOrBuiltinSlotTypeName = String
  type Description = String
  type EnumerationValues = js.Array[EnumerationValue]
  type ExportStatus = String
  type ExportType = String
  type FulfillmentActivityType = String
  type GroupNumber = Int
  type ImportStatus = String
  type IntentList = js.Array[Intent]
  type IntentMetadataList = js.Array[IntentMetadata]
  type IntentName = String
  type IntentUtteranceList = js.Array[Utterance]
  type LambdaARN = String
  type ListOfUtterance = js.Array[UtteranceData]
  type ListsOfUtterances = js.Array[UtteranceList]
  type Locale = String
  type LocaleList = js.Array[Locale]
  type MaxResults = Int
  type MergeStrategy = String
  type MessageList = js.Array[Message]
  type MessageVersion = String
  type Name = String
  type NextToken = String
  type NumericalVersion = String
  type Priority = Int
  type ProcessBehavior = String
  type PromptMaxAttempts = Int
  type ResourceType = String
  type ResponseCard = String
  type SessionTTL = Int
  type SlotConstraint = String
  type SlotList = js.Array[Slot]
  type SlotName = String
  type SlotTypeMetadataList = js.Array[SlotTypeMetadata]
  type SlotTypeName = String
  type SlotUtteranceList = js.Array[Utterance]
  type SlotValueSelectionStrategy = String
  type Status = String
  type StatusType = String
  type StringList = js.Array[String]
  type SynonymList = js.Array[Value]
  type Timestamp = js.Date
  type UserId = String
  type Utterance = String
  type UtteranceString = String
  type Value = String
  type Version = String
}

package lexmodelbuildingservice {
  @js.native
  @JSImport("aws-sdk", "LexModelBuildingService")
  class LexModelBuildingService(config: AWSConfig) extends js.Object {
    def createBotVersion(params: CreateBotVersionRequest): Request[CreateBotVersionResponse] = js.native
    def createIntentVersion(params: CreateIntentVersionRequest): Request[CreateIntentVersionResponse] = js.native
    def createSlotTypeVersion(params: CreateSlotTypeVersionRequest): Request[CreateSlotTypeVersionResponse] = js.native
    def deleteBot(params: DeleteBotRequest): Request[js.Object] = js.native
    def deleteBotAlias(params: DeleteBotAliasRequest): Request[js.Object] = js.native
    def deleteBotChannelAssociation(params: DeleteBotChannelAssociationRequest): Request[js.Object] = js.native
    def deleteBotVersion(params: DeleteBotVersionRequest): Request[js.Object] = js.native
    def deleteIntent(params: DeleteIntentRequest): Request[js.Object] = js.native
    def deleteIntentVersion(params: DeleteIntentVersionRequest): Request[js.Object] = js.native
    def deleteSlotType(params: DeleteSlotTypeRequest): Request[js.Object] = js.native
    def deleteSlotTypeVersion(params: DeleteSlotTypeVersionRequest): Request[js.Object] = js.native
    def deleteUtterances(params: DeleteUtterancesRequest): Request[js.Object] = js.native
    def getBot(params: GetBotRequest): Request[GetBotResponse] = js.native
    def getBotAlias(params: GetBotAliasRequest): Request[GetBotAliasResponse] = js.native
    def getBotAliases(params: GetBotAliasesRequest): Request[GetBotAliasesResponse] = js.native
    def getBotChannelAssociation(params: GetBotChannelAssociationRequest): Request[GetBotChannelAssociationResponse] = js.native
    def getBotChannelAssociations(params: GetBotChannelAssociationsRequest): Request[GetBotChannelAssociationsResponse] = js.native
    def getBotVersions(params: GetBotVersionsRequest): Request[GetBotVersionsResponse] = js.native
    def getBots(params: GetBotsRequest): Request[GetBotsResponse] = js.native
    def getBuiltinIntent(params: GetBuiltinIntentRequest): Request[GetBuiltinIntentResponse] = js.native
    def getBuiltinIntents(params: GetBuiltinIntentsRequest): Request[GetBuiltinIntentsResponse] = js.native
    def getBuiltinSlotTypes(params: GetBuiltinSlotTypesRequest): Request[GetBuiltinSlotTypesResponse] = js.native
    def getExport(params: GetExportRequest): Request[GetExportResponse] = js.native
    def getImport(params: GetImportRequest): Request[GetImportResponse] = js.native
    def getIntent(params: GetIntentRequest): Request[GetIntentResponse] = js.native
    def getIntentVersions(params: GetIntentVersionsRequest): Request[GetIntentVersionsResponse] = js.native
    def getIntents(params: GetIntentsRequest): Request[GetIntentsResponse] = js.native
    def getSlotType(params: GetSlotTypeRequest): Request[GetSlotTypeResponse] = js.native
    def getSlotTypeVersions(params: GetSlotTypeVersionsRequest): Request[GetSlotTypeVersionsResponse] = js.native
    def getSlotTypes(params: GetSlotTypesRequest): Request[GetSlotTypesResponse] = js.native
    def getUtterancesView(params: GetUtterancesViewRequest): Request[GetUtterancesViewResponse] = js.native
    def putBot(params: PutBotRequest): Request[PutBotResponse] = js.native
    def putBotAlias(params: PutBotAliasRequest): Request[PutBotAliasResponse] = js.native
    def putIntent(params: PutIntentRequest): Request[PutIntentResponse] = js.native
    def putSlotType(params: PutSlotTypeRequest): Request[PutSlotTypeResponse] = js.native
    def startImport(params: StartImportRequest): Request[StartImportResponse] = js.native
  }

  /**
   * <p>Provides information about a bot alias.</p>
   */
  @js.native
  trait BotAliasMetadata extends js.Object {
    var name: js.UndefOr[AliasName]
    var description: js.UndefOr[Description]
    var botName: js.UndefOr[BotName]
    var botVersion: js.UndefOr[Version]
    var checksum: js.UndefOr[String]
    var lastUpdatedDate: js.UndefOr[Timestamp]
    var createdDate: js.UndefOr[Timestamp]
  }

  object BotAliasMetadata {
    def apply(
      name: js.UndefOr[AliasName] = js.undefined,
      description: js.UndefOr[Description] = js.undefined,
      botName: js.UndefOr[BotName] = js.undefined,
      botVersion: js.UndefOr[Version] = js.undefined,
      checksum: js.UndefOr[String] = js.undefined,
      lastUpdatedDate: js.UndefOr[Timestamp] = js.undefined,
      createdDate: js.UndefOr[Timestamp] = js.undefined): BotAliasMetadata = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "botName" -> botName.map { x => x.asInstanceOf[js.Any] },
        "botVersion" -> botVersion.map { x => x.asInstanceOf[js.Any] },
        "checksum" -> checksum.map { x => x.asInstanceOf[js.Any] },
        "lastUpdatedDate" -> lastUpdatedDate.map { x => x.asInstanceOf[js.Any] },
        "createdDate" -> createdDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BotAliasMetadata]
    }
  }

  /**
   * <p>Represents an association between an Amazon Lex bot and an external messaging platform.</p>
   */
  @js.native
  trait BotChannelAssociation extends js.Object {
    var name: js.UndefOr[BotChannelName]
    var failureReason: js.UndefOr[String]
    var description: js.UndefOr[Description]
    var botName: js.UndefOr[BotName]
    var botConfiguration: js.UndefOr[ChannelConfigurationMap]
    var status: js.UndefOr[ChannelStatus]
    var botAlias: js.UndefOr[AliasName]
    var `type`: js.UndefOr[ChannelType]
    var createdDate: js.UndefOr[Timestamp]
  }

  object BotChannelAssociation {
    def apply(
      name: js.UndefOr[BotChannelName] = js.undefined,
      failureReason: js.UndefOr[String] = js.undefined,
      description: js.UndefOr[Description] = js.undefined,
      botName: js.UndefOr[BotName] = js.undefined,
      botConfiguration: js.UndefOr[ChannelConfigurationMap] = js.undefined,
      status: js.UndefOr[ChannelStatus] = js.undefined,
      botAlias: js.UndefOr[AliasName] = js.undefined,
      `type`: js.UndefOr[ChannelType] = js.undefined,
      createdDate: js.UndefOr[Timestamp] = js.undefined): BotChannelAssociation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "failureReason" -> failureReason.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "botName" -> botName.map { x => x.asInstanceOf[js.Any] },
        "botConfiguration" -> botConfiguration.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "botAlias" -> botAlias.map { x => x.asInstanceOf[js.Any] },
        "`type`" -> `type`.map { x => x.asInstanceOf[js.Any] },
        "createdDate" -> createdDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BotChannelAssociation]
    }
  }

  /**
   * <p>Provides information about a bot. .</p>
   */
  @js.native
  trait BotMetadata extends js.Object {
    var name: js.UndefOr[BotName]
    var description: js.UndefOr[Description]
    var version: js.UndefOr[Version]
    var lastUpdatedDate: js.UndefOr[Timestamp]
    var status: js.UndefOr[Status]
    var createdDate: js.UndefOr[Timestamp]
  }

  object BotMetadata {
    def apply(
      name: js.UndefOr[BotName] = js.undefined,
      description: js.UndefOr[Description] = js.undefined,
      version: js.UndefOr[Version] = js.undefined,
      lastUpdatedDate: js.UndefOr[Timestamp] = js.undefined,
      status: js.UndefOr[Status] = js.undefined,
      createdDate: js.UndefOr[Timestamp] = js.undefined): BotMetadata = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "version" -> version.map { x => x.asInstanceOf[js.Any] },
        "lastUpdatedDate" -> lastUpdatedDate.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "createdDate" -> createdDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BotMetadata]
    }
  }

  /**
   * <p>Provides metadata for a built-in intent.</p>
   */
  @js.native
  trait BuiltinIntentMetadata extends js.Object {
    var signature: js.UndefOr[BuiltinIntentSignature]
    var supportedLocales: js.UndefOr[LocaleList]
  }

  object BuiltinIntentMetadata {
    def apply(
      signature: js.UndefOr[BuiltinIntentSignature] = js.undefined,
      supportedLocales: js.UndefOr[LocaleList] = js.undefined): BuiltinIntentMetadata = {
      val _fields = IndexedSeq[(String, js.Any)](
        "signature" -> signature.map { x => x.asInstanceOf[js.Any] },
        "supportedLocales" -> supportedLocales.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BuiltinIntentMetadata]
    }
  }

  /**
   * <p>Provides information about a slot used in a built-in intent.</p>
   */
  @js.native
  trait BuiltinIntentSlot extends js.Object {
    var name: js.UndefOr[String]
  }

  object BuiltinIntentSlot {
    def apply(
      name: js.UndefOr[String] = js.undefined): BuiltinIntentSlot = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BuiltinIntentSlot]
    }
  }

  /**
   * <p>Provides information about a built in slot type.</p>
   */
  @js.native
  trait BuiltinSlotTypeMetadata extends js.Object {
    var signature: js.UndefOr[BuiltinSlotTypeSignature]
    var supportedLocales: js.UndefOr[LocaleList]
  }

  object BuiltinSlotTypeMetadata {
    def apply(
      signature: js.UndefOr[BuiltinSlotTypeSignature] = js.undefined,
      supportedLocales: js.UndefOr[LocaleList] = js.undefined): BuiltinSlotTypeMetadata = {
      val _fields = IndexedSeq[(String, js.Any)](
        "signature" -> signature.map { x => x.asInstanceOf[js.Any] },
        "supportedLocales" -> supportedLocales.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BuiltinSlotTypeMetadata]
    }
  }

  object ChannelStatusEnum {
    val IN_PROGRESS = "IN_PROGRESS"
    val CREATED = "CREATED"
    val FAILED = "FAILED"

    val values = IndexedSeq(IN_PROGRESS, CREATED, FAILED)
  }

  object ChannelTypeEnum {
    val Facebook = "Facebook"
    val Slack = "Slack"
    val `Twilio-Sms` = "Twilio-Sms"
    val Kik = "Kik"

    val values = IndexedSeq(Facebook, Slack, `Twilio-Sms`, Kik)
  }

  /**
   * <p>Specifies a Lambda function that verifies requests to a bot or fulfills the user's request to a bot..</p>
   */
  @js.native
  trait CodeHook extends js.Object {
    var uri: js.UndefOr[LambdaARN]
    var messageVersion: js.UndefOr[MessageVersion]
  }

  object CodeHook {
    def apply(
      uri: js.UndefOr[LambdaARN] = js.undefined,
      messageVersion: js.UndefOr[MessageVersion] = js.undefined): CodeHook = {
      val _fields = IndexedSeq[(String, js.Any)](
        "uri" -> uri.map { x => x.asInstanceOf[js.Any] },
        "messageVersion" -> messageVersion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CodeHook]
    }
  }

  object ContentTypeEnum {
    val PlainText = "PlainText"
    val SSML = "SSML"
    val CustomPayload = "CustomPayload"

    val values = IndexedSeq(PlainText, SSML, CustomPayload)
  }

  @js.native
  trait CreateBotVersionRequest extends js.Object {
    var name: js.UndefOr[BotName]
    var checksum: js.UndefOr[String]
  }

  object CreateBotVersionRequest {
    def apply(
      name: js.UndefOr[BotName] = js.undefined,
      checksum: js.UndefOr[String] = js.undefined): CreateBotVersionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "checksum" -> checksum.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateBotVersionRequest]
    }
  }

  @js.native
  trait CreateBotVersionResponse extends js.Object {
    var idleSessionTTLInSeconds: js.UndefOr[SessionTTL]
    var name: js.UndefOr[BotName]
    var failureReason: js.UndefOr[String]
    var description: js.UndefOr[Description]
    var abortStatement: js.UndefOr[Statement]
    var voiceId: js.UndefOr[String]
    var clarificationPrompt: js.UndefOr[Prompt]
    var locale: js.UndefOr[Locale]
    var intents: js.UndefOr[IntentList]
    var version: js.UndefOr[Version]
    var checksum: js.UndefOr[String]
    var lastUpdatedDate: js.UndefOr[Timestamp]
    var status: js.UndefOr[Status]
    var childDirected: js.UndefOr[Boolean]
    var createdDate: js.UndefOr[Timestamp]
  }

  object CreateBotVersionResponse {
    def apply(
      idleSessionTTLInSeconds: js.UndefOr[SessionTTL] = js.undefined,
      name: js.UndefOr[BotName] = js.undefined,
      failureReason: js.UndefOr[String] = js.undefined,
      description: js.UndefOr[Description] = js.undefined,
      abortStatement: js.UndefOr[Statement] = js.undefined,
      voiceId: js.UndefOr[String] = js.undefined,
      clarificationPrompt: js.UndefOr[Prompt] = js.undefined,
      locale: js.UndefOr[Locale] = js.undefined,
      intents: js.UndefOr[IntentList] = js.undefined,
      version: js.UndefOr[Version] = js.undefined,
      checksum: js.UndefOr[String] = js.undefined,
      lastUpdatedDate: js.UndefOr[Timestamp] = js.undefined,
      status: js.UndefOr[Status] = js.undefined,
      childDirected: js.UndefOr[Boolean] = js.undefined,
      createdDate: js.UndefOr[Timestamp] = js.undefined): CreateBotVersionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "idleSessionTTLInSeconds" -> idleSessionTTLInSeconds.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "failureReason" -> failureReason.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "abortStatement" -> abortStatement.map { x => x.asInstanceOf[js.Any] },
        "voiceId" -> voiceId.map { x => x.asInstanceOf[js.Any] },
        "clarificationPrompt" -> clarificationPrompt.map { x => x.asInstanceOf[js.Any] },
        "locale" -> locale.map { x => x.asInstanceOf[js.Any] },
        "intents" -> intents.map { x => x.asInstanceOf[js.Any] },
        "version" -> version.map { x => x.asInstanceOf[js.Any] },
        "checksum" -> checksum.map { x => x.asInstanceOf[js.Any] },
        "lastUpdatedDate" -> lastUpdatedDate.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "childDirected" -> childDirected.map { x => x.asInstanceOf[js.Any] },
        "createdDate" -> createdDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateBotVersionResponse]
    }
  }

  @js.native
  trait CreateIntentVersionRequest extends js.Object {
    var name: js.UndefOr[IntentName]
    var checksum: js.UndefOr[String]
  }

  object CreateIntentVersionRequest {
    def apply(
      name: js.UndefOr[IntentName] = js.undefined,
      checksum: js.UndefOr[String] = js.undefined): CreateIntentVersionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "checksum" -> checksum.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateIntentVersionRequest]
    }
  }

  @js.native
  trait CreateIntentVersionResponse extends js.Object {
    var name: js.UndefOr[IntentName]
    var dialogCodeHook: js.UndefOr[CodeHook]
    var rejectionStatement: js.UndefOr[Statement]
    var conclusionStatement: js.UndefOr[Statement]
    var description: js.UndefOr[Description]
    var parentIntentSignature: js.UndefOr[BuiltinIntentSignature]
    var sampleUtterances: js.UndefOr[IntentUtteranceList]
    var version: js.UndefOr[Version]
    var checksum: js.UndefOr[String]
    var lastUpdatedDate: js.UndefOr[Timestamp]
    var slots: js.UndefOr[SlotList]
    var fulfillmentActivity: js.UndefOr[FulfillmentActivity]
    var followUpPrompt: js.UndefOr[FollowUpPrompt]
    var confirmationPrompt: js.UndefOr[Prompt]
    var createdDate: js.UndefOr[Timestamp]
  }

  object CreateIntentVersionResponse {
    def apply(
      name: js.UndefOr[IntentName] = js.undefined,
      dialogCodeHook: js.UndefOr[CodeHook] = js.undefined,
      rejectionStatement: js.UndefOr[Statement] = js.undefined,
      conclusionStatement: js.UndefOr[Statement] = js.undefined,
      description: js.UndefOr[Description] = js.undefined,
      parentIntentSignature: js.UndefOr[BuiltinIntentSignature] = js.undefined,
      sampleUtterances: js.UndefOr[IntentUtteranceList] = js.undefined,
      version: js.UndefOr[Version] = js.undefined,
      checksum: js.UndefOr[String] = js.undefined,
      lastUpdatedDate: js.UndefOr[Timestamp] = js.undefined,
      slots: js.UndefOr[SlotList] = js.undefined,
      fulfillmentActivity: js.UndefOr[FulfillmentActivity] = js.undefined,
      followUpPrompt: js.UndefOr[FollowUpPrompt] = js.undefined,
      confirmationPrompt: js.UndefOr[Prompt] = js.undefined,
      createdDate: js.UndefOr[Timestamp] = js.undefined): CreateIntentVersionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "dialogCodeHook" -> dialogCodeHook.map { x => x.asInstanceOf[js.Any] },
        "rejectionStatement" -> rejectionStatement.map { x => x.asInstanceOf[js.Any] },
        "conclusionStatement" -> conclusionStatement.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "parentIntentSignature" -> parentIntentSignature.map { x => x.asInstanceOf[js.Any] },
        "sampleUtterances" -> sampleUtterances.map { x => x.asInstanceOf[js.Any] },
        "version" -> version.map { x => x.asInstanceOf[js.Any] },
        "checksum" -> checksum.map { x => x.asInstanceOf[js.Any] },
        "lastUpdatedDate" -> lastUpdatedDate.map { x => x.asInstanceOf[js.Any] },
        "slots" -> slots.map { x => x.asInstanceOf[js.Any] },
        "fulfillmentActivity" -> fulfillmentActivity.map { x => x.asInstanceOf[js.Any] },
        "followUpPrompt" -> followUpPrompt.map { x => x.asInstanceOf[js.Any] },
        "confirmationPrompt" -> confirmationPrompt.map { x => x.asInstanceOf[js.Any] },
        "createdDate" -> createdDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateIntentVersionResponse]
    }
  }

  @js.native
  trait CreateSlotTypeVersionRequest extends js.Object {
    var name: js.UndefOr[SlotTypeName]
    var checksum: js.UndefOr[String]
  }

  object CreateSlotTypeVersionRequest {
    def apply(
      name: js.UndefOr[SlotTypeName] = js.undefined,
      checksum: js.UndefOr[String] = js.undefined): CreateSlotTypeVersionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "checksum" -> checksum.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSlotTypeVersionRequest]
    }
  }

  @js.native
  trait CreateSlotTypeVersionResponse extends js.Object {
    var name: js.UndefOr[SlotTypeName]
    var enumerationValues: js.UndefOr[EnumerationValues]
    var description: js.UndefOr[Description]
    var version: js.UndefOr[Version]
    var checksum: js.UndefOr[String]
    var lastUpdatedDate: js.UndefOr[Timestamp]
    var valueSelectionStrategy: js.UndefOr[SlotValueSelectionStrategy]
    var createdDate: js.UndefOr[Timestamp]
  }

  object CreateSlotTypeVersionResponse {
    def apply(
      name: js.UndefOr[SlotTypeName] = js.undefined,
      enumerationValues: js.UndefOr[EnumerationValues] = js.undefined,
      description: js.UndefOr[Description] = js.undefined,
      version: js.UndefOr[Version] = js.undefined,
      checksum: js.UndefOr[String] = js.undefined,
      lastUpdatedDate: js.UndefOr[Timestamp] = js.undefined,
      valueSelectionStrategy: js.UndefOr[SlotValueSelectionStrategy] = js.undefined,
      createdDate: js.UndefOr[Timestamp] = js.undefined): CreateSlotTypeVersionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "enumerationValues" -> enumerationValues.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "version" -> version.map { x => x.asInstanceOf[js.Any] },
        "checksum" -> checksum.map { x => x.asInstanceOf[js.Any] },
        "lastUpdatedDate" -> lastUpdatedDate.map { x => x.asInstanceOf[js.Any] },
        "valueSelectionStrategy" -> valueSelectionStrategy.map { x => x.asInstanceOf[js.Any] },
        "createdDate" -> createdDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSlotTypeVersionResponse]
    }
  }

  @js.native
  trait DeleteBotAliasRequest extends js.Object {
    var name: js.UndefOr[AliasName]
    var botName: js.UndefOr[BotName]
  }

  object DeleteBotAliasRequest {
    def apply(
      name: js.UndefOr[AliasName] = js.undefined,
      botName: js.UndefOr[BotName] = js.undefined): DeleteBotAliasRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "botName" -> botName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteBotAliasRequest]
    }
  }

  @js.native
  trait DeleteBotChannelAssociationRequest extends js.Object {
    var name: js.UndefOr[BotChannelName]
    var botName: js.UndefOr[BotName]
    var botAlias: js.UndefOr[AliasName]
  }

  object DeleteBotChannelAssociationRequest {
    def apply(
      name: js.UndefOr[BotChannelName] = js.undefined,
      botName: js.UndefOr[BotName] = js.undefined,
      botAlias: js.UndefOr[AliasName] = js.undefined): DeleteBotChannelAssociationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "botName" -> botName.map { x => x.asInstanceOf[js.Any] },
        "botAlias" -> botAlias.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteBotChannelAssociationRequest]
    }
  }

  @js.native
  trait DeleteBotRequest extends js.Object {
    var name: js.UndefOr[BotName]
  }

  object DeleteBotRequest {
    def apply(
      name: js.UndefOr[BotName] = js.undefined): DeleteBotRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteBotRequest]
    }
  }

  @js.native
  trait DeleteBotVersionRequest extends js.Object {
    var name: js.UndefOr[BotName]
    var version: js.UndefOr[NumericalVersion]
  }

  object DeleteBotVersionRequest {
    def apply(
      name: js.UndefOr[BotName] = js.undefined,
      version: js.UndefOr[NumericalVersion] = js.undefined): DeleteBotVersionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "version" -> version.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteBotVersionRequest]
    }
  }

  @js.native
  trait DeleteIntentRequest extends js.Object {
    var name: js.UndefOr[IntentName]
  }

  object DeleteIntentRequest {
    def apply(
      name: js.UndefOr[IntentName] = js.undefined): DeleteIntentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteIntentRequest]
    }
  }

  @js.native
  trait DeleteIntentVersionRequest extends js.Object {
    var name: js.UndefOr[IntentName]
    var version: js.UndefOr[NumericalVersion]
  }

  object DeleteIntentVersionRequest {
    def apply(
      name: js.UndefOr[IntentName] = js.undefined,
      version: js.UndefOr[NumericalVersion] = js.undefined): DeleteIntentVersionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "version" -> version.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteIntentVersionRequest]
    }
  }

  @js.native
  trait DeleteSlotTypeRequest extends js.Object {
    var name: js.UndefOr[SlotTypeName]
  }

  object DeleteSlotTypeRequest {
    def apply(
      name: js.UndefOr[SlotTypeName] = js.undefined): DeleteSlotTypeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSlotTypeRequest]
    }
  }

  @js.native
  trait DeleteSlotTypeVersionRequest extends js.Object {
    var name: js.UndefOr[SlotTypeName]
    var version: js.UndefOr[NumericalVersion]
  }

  object DeleteSlotTypeVersionRequest {
    def apply(
      name: js.UndefOr[SlotTypeName] = js.undefined,
      version: js.UndefOr[NumericalVersion] = js.undefined): DeleteSlotTypeVersionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "version" -> version.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSlotTypeVersionRequest]
    }
  }

  @js.native
  trait DeleteUtterancesRequest extends js.Object {
    var botName: js.UndefOr[BotName]
    var userId: js.UndefOr[UserId]
  }

  object DeleteUtterancesRequest {
    def apply(
      botName: js.UndefOr[BotName] = js.undefined,
      userId: js.UndefOr[UserId] = js.undefined): DeleteUtterancesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "botName" -> botName.map { x => x.asInstanceOf[js.Any] },
        "userId" -> userId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteUtterancesRequest]
    }
  }

  /**
   * <p>Each slot type can have a set of values. Each enumeration value represents a value the slot type can take. </p> <p>For example, a pizza ordering bot could have a slot type that specifies the type of crust that the pizza should have. The slot type could include the values </p> <ul> <li> <p>thick</p> </li> <li> <p>thin</p> </li> <li> <p>stuffed</p> </li> </ul>
   */
  @js.native
  trait EnumerationValue extends js.Object {
    var value: js.UndefOr[Value]
    var synonyms: js.UndefOr[SynonymList]
  }

  object EnumerationValue {
    def apply(
      value: js.UndefOr[Value] = js.undefined,
      synonyms: js.UndefOr[SynonymList] = js.undefined): EnumerationValue = {
      val _fields = IndexedSeq[(String, js.Any)](
        "value" -> value.map { x => x.asInstanceOf[js.Any] },
        "synonyms" -> synonyms.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnumerationValue]
    }
  }

  object ExportStatusEnum {
    val IN_PROGRESS = "IN_PROGRESS"
    val READY = "READY"
    val FAILED = "FAILED"

    val values = IndexedSeq(IN_PROGRESS, READY, FAILED)
  }

  object ExportTypeEnum {
    val ALEXA_SKILLS_KIT = "ALEXA_SKILLS_KIT"
    val LEX = "LEX"

    val values = IndexedSeq(ALEXA_SKILLS_KIT, LEX)
  }

  /**
   * <p>A prompt for additional activity after an intent is fulfilled. For example, after the <code>OrderPizza</code> intent is fulfilled, you might prompt the user to find out whether the user wants to order drinks.</p>
   */
  @js.native
  trait FollowUpPrompt extends js.Object {
    var prompt: js.UndefOr[Prompt]
    var rejectionStatement: js.UndefOr[Statement]
  }

  object FollowUpPrompt {
    def apply(
      prompt: js.UndefOr[Prompt] = js.undefined,
      rejectionStatement: js.UndefOr[Statement] = js.undefined): FollowUpPrompt = {
      val _fields = IndexedSeq[(String, js.Any)](
        "prompt" -> prompt.map { x => x.asInstanceOf[js.Any] },
        "rejectionStatement" -> rejectionStatement.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FollowUpPrompt]
    }
  }

  /**
   * <p> Describes how the intent is fulfilled after the user provides all of the information required for the intent. You can provide a Lambda function to process the intent, or you can return the intent information to the client application. We recommend that you use a Lambda function so that the relevant logic lives in the Cloud and limit the client-side code primarily to presentation. If you need to update the logic, you only update the Lambda function; you don't need to upgrade your client application. </p> <p>Consider the following examples:</p> <ul> <li> <p>In a pizza ordering application, after the user provides all of the information for placing an order, you use a Lambda function to place an order with a pizzeria. </p> </li> <li> <p>In a gaming application, when a user says "pick up a rock," this information must go back to the client application so that it can perform the operation and update the graphics. In this case, you want Amazon Lex to return the intent data to the client. </p> </li> </ul>
   */
  @js.native
  trait FulfillmentActivity extends js.Object {
    var `type`: js.UndefOr[FulfillmentActivityType]
    var codeHook: js.UndefOr[CodeHook]
  }

  object FulfillmentActivity {
    def apply(
      `type`: js.UndefOr[FulfillmentActivityType] = js.undefined,
      codeHook: js.UndefOr[CodeHook] = js.undefined): FulfillmentActivity = {
      val _fields = IndexedSeq[(String, js.Any)](
        "`type`" -> `type`.map { x => x.asInstanceOf[js.Any] },
        "codeHook" -> codeHook.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FulfillmentActivity]
    }
  }

  object FulfillmentActivityTypeEnum {
    val ReturnIntent = "ReturnIntent"
    val CodeHook = "CodeHook"

    val values = IndexedSeq(ReturnIntent, CodeHook)
  }

  @js.native
  trait GetBotAliasRequest extends js.Object {
    var name: js.UndefOr[AliasName]
    var botName: js.UndefOr[BotName]
  }

  object GetBotAliasRequest {
    def apply(
      name: js.UndefOr[AliasName] = js.undefined,
      botName: js.UndefOr[BotName] = js.undefined): GetBotAliasRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "botName" -> botName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBotAliasRequest]
    }
  }

  @js.native
  trait GetBotAliasResponse extends js.Object {
    var name: js.UndefOr[AliasName]
    var description: js.UndefOr[Description]
    var botName: js.UndefOr[BotName]
    var botVersion: js.UndefOr[Version]
    var checksum: js.UndefOr[String]
    var lastUpdatedDate: js.UndefOr[Timestamp]
    var createdDate: js.UndefOr[Timestamp]
  }

  object GetBotAliasResponse {
    def apply(
      name: js.UndefOr[AliasName] = js.undefined,
      description: js.UndefOr[Description] = js.undefined,
      botName: js.UndefOr[BotName] = js.undefined,
      botVersion: js.UndefOr[Version] = js.undefined,
      checksum: js.UndefOr[String] = js.undefined,
      lastUpdatedDate: js.UndefOr[Timestamp] = js.undefined,
      createdDate: js.UndefOr[Timestamp] = js.undefined): GetBotAliasResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "botName" -> botName.map { x => x.asInstanceOf[js.Any] },
        "botVersion" -> botVersion.map { x => x.asInstanceOf[js.Any] },
        "checksum" -> checksum.map { x => x.asInstanceOf[js.Any] },
        "lastUpdatedDate" -> lastUpdatedDate.map { x => x.asInstanceOf[js.Any] },
        "createdDate" -> createdDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBotAliasResponse]
    }
  }

  @js.native
  trait GetBotAliasesRequest extends js.Object {
    var botName: js.UndefOr[BotName]
    var nextToken: js.UndefOr[NextToken]
    var maxResults: js.UndefOr[MaxResults]
    var nameContains: js.UndefOr[AliasName]
  }

  object GetBotAliasesRequest {
    def apply(
      botName: js.UndefOr[BotName] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined,
      nameContains: js.UndefOr[AliasName] = js.undefined): GetBotAliasesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "botName" -> botName.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nameContains" -> nameContains.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBotAliasesRequest]
    }
  }

  @js.native
  trait GetBotAliasesResponse extends js.Object {
    var BotAliases: js.UndefOr[BotAliasMetadataList]
    var nextToken: js.UndefOr[NextToken]
  }

  object GetBotAliasesResponse {
    def apply(
      BotAliases: js.UndefOr[BotAliasMetadataList] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): GetBotAliasesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BotAliases" -> BotAliases.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBotAliasesResponse]
    }
  }

  @js.native
  trait GetBotChannelAssociationRequest extends js.Object {
    var name: js.UndefOr[BotChannelName]
    var botName: js.UndefOr[BotName]
    var botAlias: js.UndefOr[AliasName]
  }

  object GetBotChannelAssociationRequest {
    def apply(
      name: js.UndefOr[BotChannelName] = js.undefined,
      botName: js.UndefOr[BotName] = js.undefined,
      botAlias: js.UndefOr[AliasName] = js.undefined): GetBotChannelAssociationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "botName" -> botName.map { x => x.asInstanceOf[js.Any] },
        "botAlias" -> botAlias.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBotChannelAssociationRequest]
    }
  }

  @js.native
  trait GetBotChannelAssociationResponse extends js.Object {
    var name: js.UndefOr[BotChannelName]
    var failureReason: js.UndefOr[String]
    var description: js.UndefOr[Description]
    var botName: js.UndefOr[BotName]
    var botConfiguration: js.UndefOr[ChannelConfigurationMap]
    var status: js.UndefOr[ChannelStatus]
    var botAlias: js.UndefOr[AliasName]
    var `type`: js.UndefOr[ChannelType]
    var createdDate: js.UndefOr[Timestamp]
  }

  object GetBotChannelAssociationResponse {
    def apply(
      name: js.UndefOr[BotChannelName] = js.undefined,
      failureReason: js.UndefOr[String] = js.undefined,
      description: js.UndefOr[Description] = js.undefined,
      botName: js.UndefOr[BotName] = js.undefined,
      botConfiguration: js.UndefOr[ChannelConfigurationMap] = js.undefined,
      status: js.UndefOr[ChannelStatus] = js.undefined,
      botAlias: js.UndefOr[AliasName] = js.undefined,
      `type`: js.UndefOr[ChannelType] = js.undefined,
      createdDate: js.UndefOr[Timestamp] = js.undefined): GetBotChannelAssociationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "failureReason" -> failureReason.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "botName" -> botName.map { x => x.asInstanceOf[js.Any] },
        "botConfiguration" -> botConfiguration.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "botAlias" -> botAlias.map { x => x.asInstanceOf[js.Any] },
        "`type`" -> `type`.map { x => x.asInstanceOf[js.Any] },
        "createdDate" -> createdDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBotChannelAssociationResponse]
    }
  }

  @js.native
  trait GetBotChannelAssociationsRequest extends js.Object {
    var nameContains: js.UndefOr[BotChannelName]
    var maxResults: js.UndefOr[MaxResults]
    var botName: js.UndefOr[BotName]
    var nextToken: js.UndefOr[NextToken]
    var botAlias: js.UndefOr[AliasNameOrListAll]
  }

  object GetBotChannelAssociationsRequest {
    def apply(
      nameContains: js.UndefOr[BotChannelName] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined,
      botName: js.UndefOr[BotName] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      botAlias: js.UndefOr[AliasNameOrListAll] = js.undefined): GetBotChannelAssociationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nameContains" -> nameContains.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "botName" -> botName.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "botAlias" -> botAlias.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBotChannelAssociationsRequest]
    }
  }

  @js.native
  trait GetBotChannelAssociationsResponse extends js.Object {
    var botChannelAssociations: js.UndefOr[BotChannelAssociationList]
    var nextToken: js.UndefOr[NextToken]
  }

  object GetBotChannelAssociationsResponse {
    def apply(
      botChannelAssociations: js.UndefOr[BotChannelAssociationList] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): GetBotChannelAssociationsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "botChannelAssociations" -> botChannelAssociations.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBotChannelAssociationsResponse]
    }
  }

  @js.native
  trait GetBotRequest extends js.Object {
    var name: js.UndefOr[BotName]
    var versionOrAlias: js.UndefOr[String]
  }

  object GetBotRequest {
    def apply(
      name: js.UndefOr[BotName] = js.undefined,
      versionOrAlias: js.UndefOr[String] = js.undefined): GetBotRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "versionOrAlias" -> versionOrAlias.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBotRequest]
    }
  }

  @js.native
  trait GetBotResponse extends js.Object {
    var idleSessionTTLInSeconds: js.UndefOr[SessionTTL]
    var name: js.UndefOr[BotName]
    var failureReason: js.UndefOr[String]
    var description: js.UndefOr[Description]
    var abortStatement: js.UndefOr[Statement]
    var voiceId: js.UndefOr[String]
    var clarificationPrompt: js.UndefOr[Prompt]
    var locale: js.UndefOr[Locale]
    var intents: js.UndefOr[IntentList]
    var version: js.UndefOr[Version]
    var checksum: js.UndefOr[String]
    var lastUpdatedDate: js.UndefOr[Timestamp]
    var status: js.UndefOr[Status]
    var childDirected: js.UndefOr[Boolean]
    var createdDate: js.UndefOr[Timestamp]
  }

  object GetBotResponse {
    def apply(
      idleSessionTTLInSeconds: js.UndefOr[SessionTTL] = js.undefined,
      name: js.UndefOr[BotName] = js.undefined,
      failureReason: js.UndefOr[String] = js.undefined,
      description: js.UndefOr[Description] = js.undefined,
      abortStatement: js.UndefOr[Statement] = js.undefined,
      voiceId: js.UndefOr[String] = js.undefined,
      clarificationPrompt: js.UndefOr[Prompt] = js.undefined,
      locale: js.UndefOr[Locale] = js.undefined,
      intents: js.UndefOr[IntentList] = js.undefined,
      version: js.UndefOr[Version] = js.undefined,
      checksum: js.UndefOr[String] = js.undefined,
      lastUpdatedDate: js.UndefOr[Timestamp] = js.undefined,
      status: js.UndefOr[Status] = js.undefined,
      childDirected: js.UndefOr[Boolean] = js.undefined,
      createdDate: js.UndefOr[Timestamp] = js.undefined): GetBotResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "idleSessionTTLInSeconds" -> idleSessionTTLInSeconds.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "failureReason" -> failureReason.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "abortStatement" -> abortStatement.map { x => x.asInstanceOf[js.Any] },
        "voiceId" -> voiceId.map { x => x.asInstanceOf[js.Any] },
        "clarificationPrompt" -> clarificationPrompt.map { x => x.asInstanceOf[js.Any] },
        "locale" -> locale.map { x => x.asInstanceOf[js.Any] },
        "intents" -> intents.map { x => x.asInstanceOf[js.Any] },
        "version" -> version.map { x => x.asInstanceOf[js.Any] },
        "checksum" -> checksum.map { x => x.asInstanceOf[js.Any] },
        "lastUpdatedDate" -> lastUpdatedDate.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "childDirected" -> childDirected.map { x => x.asInstanceOf[js.Any] },
        "createdDate" -> createdDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBotResponse]
    }
  }

  @js.native
  trait GetBotVersionsRequest extends js.Object {
    var name: js.UndefOr[BotName]
    var nextToken: js.UndefOr[NextToken]
    var maxResults: js.UndefOr[MaxResults]
  }

  object GetBotVersionsRequest {
    def apply(
      name: js.UndefOr[BotName] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined): GetBotVersionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBotVersionsRequest]
    }
  }

  @js.native
  trait GetBotVersionsResponse extends js.Object {
    var bots: js.UndefOr[BotMetadataList]
    var nextToken: js.UndefOr[NextToken]
  }

  object GetBotVersionsResponse {
    def apply(
      bots: js.UndefOr[BotMetadataList] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): GetBotVersionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "bots" -> bots.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBotVersionsResponse]
    }
  }

  @js.native
  trait GetBotsRequest extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var maxResults: js.UndefOr[MaxResults]
    var nameContains: js.UndefOr[BotName]
  }

  object GetBotsRequest {
    def apply(
      nextToken: js.UndefOr[NextToken] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined,
      nameContains: js.UndefOr[BotName] = js.undefined): GetBotsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nameContains" -> nameContains.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBotsRequest]
    }
  }

  @js.native
  trait GetBotsResponse extends js.Object {
    var bots: js.UndefOr[BotMetadataList]
    var nextToken: js.UndefOr[NextToken]
  }

  object GetBotsResponse {
    def apply(
      bots: js.UndefOr[BotMetadataList] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): GetBotsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "bots" -> bots.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBotsResponse]
    }
  }

  @js.native
  trait GetBuiltinIntentRequest extends js.Object {
    var signature: js.UndefOr[BuiltinIntentSignature]
  }

  object GetBuiltinIntentRequest {
    def apply(
      signature: js.UndefOr[BuiltinIntentSignature] = js.undefined): GetBuiltinIntentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "signature" -> signature.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBuiltinIntentRequest]
    }
  }

  @js.native
  trait GetBuiltinIntentResponse extends js.Object {
    var signature: js.UndefOr[BuiltinIntentSignature]
    var supportedLocales: js.UndefOr[LocaleList]
    var slots: js.UndefOr[BuiltinIntentSlotList]
  }

  object GetBuiltinIntentResponse {
    def apply(
      signature: js.UndefOr[BuiltinIntentSignature] = js.undefined,
      supportedLocales: js.UndefOr[LocaleList] = js.undefined,
      slots: js.UndefOr[BuiltinIntentSlotList] = js.undefined): GetBuiltinIntentResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "signature" -> signature.map { x => x.asInstanceOf[js.Any] },
        "supportedLocales" -> supportedLocales.map { x => x.asInstanceOf[js.Any] },
        "slots" -> slots.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBuiltinIntentResponse]
    }
  }

  @js.native
  trait GetBuiltinIntentsRequest extends js.Object {
    var locale: js.UndefOr[Locale]
    var signatureContains: js.UndefOr[String]
    var nextToken: js.UndefOr[NextToken]
    var maxResults: js.UndefOr[MaxResults]
  }

  object GetBuiltinIntentsRequest {
    def apply(
      locale: js.UndefOr[Locale] = js.undefined,
      signatureContains: js.UndefOr[String] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined): GetBuiltinIntentsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "locale" -> locale.map { x => x.asInstanceOf[js.Any] },
        "signatureContains" -> signatureContains.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBuiltinIntentsRequest]
    }
  }

  @js.native
  trait GetBuiltinIntentsResponse extends js.Object {
    var intents: js.UndefOr[BuiltinIntentMetadataList]
    var nextToken: js.UndefOr[NextToken]
  }

  object GetBuiltinIntentsResponse {
    def apply(
      intents: js.UndefOr[BuiltinIntentMetadataList] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): GetBuiltinIntentsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "intents" -> intents.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBuiltinIntentsResponse]
    }
  }

  @js.native
  trait GetBuiltinSlotTypesRequest extends js.Object {
    var locale: js.UndefOr[Locale]
    var signatureContains: js.UndefOr[String]
    var nextToken: js.UndefOr[NextToken]
    var maxResults: js.UndefOr[MaxResults]
  }

  object GetBuiltinSlotTypesRequest {
    def apply(
      locale: js.UndefOr[Locale] = js.undefined,
      signatureContains: js.UndefOr[String] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined): GetBuiltinSlotTypesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "locale" -> locale.map { x => x.asInstanceOf[js.Any] },
        "signatureContains" -> signatureContains.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBuiltinSlotTypesRequest]
    }
  }

  @js.native
  trait GetBuiltinSlotTypesResponse extends js.Object {
    var slotTypes: js.UndefOr[BuiltinSlotTypeMetadataList]
    var nextToken: js.UndefOr[NextToken]
  }

  object GetBuiltinSlotTypesResponse {
    def apply(
      slotTypes: js.UndefOr[BuiltinSlotTypeMetadataList] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): GetBuiltinSlotTypesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "slotTypes" -> slotTypes.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBuiltinSlotTypesResponse]
    }
  }

  @js.native
  trait GetExportRequest extends js.Object {
    var name: js.UndefOr[Name]
    var version: js.UndefOr[NumericalVersion]
    var resourceType: js.UndefOr[ResourceType]
    var exportType: js.UndefOr[ExportType]
  }

  object GetExportRequest {
    def apply(
      name: js.UndefOr[Name] = js.undefined,
      version: js.UndefOr[NumericalVersion] = js.undefined,
      resourceType: js.UndefOr[ResourceType] = js.undefined,
      exportType: js.UndefOr[ExportType] = js.undefined): GetExportRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "version" -> version.map { x => x.asInstanceOf[js.Any] },
        "resourceType" -> resourceType.map { x => x.asInstanceOf[js.Any] },
        "exportType" -> exportType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetExportRequest]
    }
  }

  @js.native
  trait GetExportResponse extends js.Object {
    var exportType: js.UndefOr[ExportType]
    var name: js.UndefOr[Name]
    var failureReason: js.UndefOr[String]
    var url: js.UndefOr[String]
    var resourceType: js.UndefOr[ResourceType]
    var version: js.UndefOr[NumericalVersion]
    var exportStatus: js.UndefOr[ExportStatus]
  }

  object GetExportResponse {
    def apply(
      exportType: js.UndefOr[ExportType] = js.undefined,
      name: js.UndefOr[Name] = js.undefined,
      failureReason: js.UndefOr[String] = js.undefined,
      url: js.UndefOr[String] = js.undefined,
      resourceType: js.UndefOr[ResourceType] = js.undefined,
      version: js.UndefOr[NumericalVersion] = js.undefined,
      exportStatus: js.UndefOr[ExportStatus] = js.undefined): GetExportResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "exportType" -> exportType.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "failureReason" -> failureReason.map { x => x.asInstanceOf[js.Any] },
        "url" -> url.map { x => x.asInstanceOf[js.Any] },
        "resourceType" -> resourceType.map { x => x.asInstanceOf[js.Any] },
        "version" -> version.map { x => x.asInstanceOf[js.Any] },
        "exportStatus" -> exportStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetExportResponse]
    }
  }

  @js.native
  trait GetImportRequest extends js.Object {
    var importId: js.UndefOr[String]
  }

  object GetImportRequest {
    def apply(
      importId: js.UndefOr[String] = js.undefined): GetImportRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "importId" -> importId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetImportRequest]
    }
  }

  @js.native
  trait GetImportResponse extends js.Object {
    var name: js.UndefOr[Name]
    var failureReason: js.UndefOr[StringList]
    var resourceType: js.UndefOr[ResourceType]
    var mergeStrategy: js.UndefOr[MergeStrategy]
    var importStatus: js.UndefOr[ImportStatus]
    var createdDate: js.UndefOr[Timestamp]
    var importId: js.UndefOr[String]
  }

  object GetImportResponse {
    def apply(
      name: js.UndefOr[Name] = js.undefined,
      failureReason: js.UndefOr[StringList] = js.undefined,
      resourceType: js.UndefOr[ResourceType] = js.undefined,
      mergeStrategy: js.UndefOr[MergeStrategy] = js.undefined,
      importStatus: js.UndefOr[ImportStatus] = js.undefined,
      createdDate: js.UndefOr[Timestamp] = js.undefined,
      importId: js.UndefOr[String] = js.undefined): GetImportResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "failureReason" -> failureReason.map { x => x.asInstanceOf[js.Any] },
        "resourceType" -> resourceType.map { x => x.asInstanceOf[js.Any] },
        "mergeStrategy" -> mergeStrategy.map { x => x.asInstanceOf[js.Any] },
        "importStatus" -> importStatus.map { x => x.asInstanceOf[js.Any] },
        "createdDate" -> createdDate.map { x => x.asInstanceOf[js.Any] },
        "importId" -> importId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetImportResponse]
    }
  }

  @js.native
  trait GetIntentRequest extends js.Object {
    var name: js.UndefOr[IntentName]
    var version: js.UndefOr[Version]
  }

  object GetIntentRequest {
    def apply(
      name: js.UndefOr[IntentName] = js.undefined,
      version: js.UndefOr[Version] = js.undefined): GetIntentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "version" -> version.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetIntentRequest]
    }
  }

  @js.native
  trait GetIntentResponse extends js.Object {
    var name: js.UndefOr[IntentName]
    var dialogCodeHook: js.UndefOr[CodeHook]
    var rejectionStatement: js.UndefOr[Statement]
    var conclusionStatement: js.UndefOr[Statement]
    var description: js.UndefOr[Description]
    var parentIntentSignature: js.UndefOr[BuiltinIntentSignature]
    var sampleUtterances: js.UndefOr[IntentUtteranceList]
    var version: js.UndefOr[Version]
    var checksum: js.UndefOr[String]
    var lastUpdatedDate: js.UndefOr[Timestamp]
    var slots: js.UndefOr[SlotList]
    var fulfillmentActivity: js.UndefOr[FulfillmentActivity]
    var followUpPrompt: js.UndefOr[FollowUpPrompt]
    var confirmationPrompt: js.UndefOr[Prompt]
    var createdDate: js.UndefOr[Timestamp]
  }

  object GetIntentResponse {
    def apply(
      name: js.UndefOr[IntentName] = js.undefined,
      dialogCodeHook: js.UndefOr[CodeHook] = js.undefined,
      rejectionStatement: js.UndefOr[Statement] = js.undefined,
      conclusionStatement: js.UndefOr[Statement] = js.undefined,
      description: js.UndefOr[Description] = js.undefined,
      parentIntentSignature: js.UndefOr[BuiltinIntentSignature] = js.undefined,
      sampleUtterances: js.UndefOr[IntentUtteranceList] = js.undefined,
      version: js.UndefOr[Version] = js.undefined,
      checksum: js.UndefOr[String] = js.undefined,
      lastUpdatedDate: js.UndefOr[Timestamp] = js.undefined,
      slots: js.UndefOr[SlotList] = js.undefined,
      fulfillmentActivity: js.UndefOr[FulfillmentActivity] = js.undefined,
      followUpPrompt: js.UndefOr[FollowUpPrompt] = js.undefined,
      confirmationPrompt: js.UndefOr[Prompt] = js.undefined,
      createdDate: js.UndefOr[Timestamp] = js.undefined): GetIntentResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "dialogCodeHook" -> dialogCodeHook.map { x => x.asInstanceOf[js.Any] },
        "rejectionStatement" -> rejectionStatement.map { x => x.asInstanceOf[js.Any] },
        "conclusionStatement" -> conclusionStatement.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "parentIntentSignature" -> parentIntentSignature.map { x => x.asInstanceOf[js.Any] },
        "sampleUtterances" -> sampleUtterances.map { x => x.asInstanceOf[js.Any] },
        "version" -> version.map { x => x.asInstanceOf[js.Any] },
        "checksum" -> checksum.map { x => x.asInstanceOf[js.Any] },
        "lastUpdatedDate" -> lastUpdatedDate.map { x => x.asInstanceOf[js.Any] },
        "slots" -> slots.map { x => x.asInstanceOf[js.Any] },
        "fulfillmentActivity" -> fulfillmentActivity.map { x => x.asInstanceOf[js.Any] },
        "followUpPrompt" -> followUpPrompt.map { x => x.asInstanceOf[js.Any] },
        "confirmationPrompt" -> confirmationPrompt.map { x => x.asInstanceOf[js.Any] },
        "createdDate" -> createdDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetIntentResponse]
    }
  }

  @js.native
  trait GetIntentVersionsRequest extends js.Object {
    var name: js.UndefOr[IntentName]
    var nextToken: js.UndefOr[NextToken]
    var maxResults: js.UndefOr[MaxResults]
  }

  object GetIntentVersionsRequest {
    def apply(
      name: js.UndefOr[IntentName] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined): GetIntentVersionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetIntentVersionsRequest]
    }
  }

  @js.native
  trait GetIntentVersionsResponse extends js.Object {
    var intents: js.UndefOr[IntentMetadataList]
    var nextToken: js.UndefOr[NextToken]
  }

  object GetIntentVersionsResponse {
    def apply(
      intents: js.UndefOr[IntentMetadataList] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): GetIntentVersionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "intents" -> intents.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetIntentVersionsResponse]
    }
  }

  @js.native
  trait GetIntentsRequest extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var maxResults: js.UndefOr[MaxResults]
    var nameContains: js.UndefOr[IntentName]
  }

  object GetIntentsRequest {
    def apply(
      nextToken: js.UndefOr[NextToken] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined,
      nameContains: js.UndefOr[IntentName] = js.undefined): GetIntentsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nameContains" -> nameContains.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetIntentsRequest]
    }
  }

  @js.native
  trait GetIntentsResponse extends js.Object {
    var intents: js.UndefOr[IntentMetadataList]
    var nextToken: js.UndefOr[NextToken]
  }

  object GetIntentsResponse {
    def apply(
      intents: js.UndefOr[IntentMetadataList] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): GetIntentsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "intents" -> intents.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetIntentsResponse]
    }
  }

  @js.native
  trait GetSlotTypeRequest extends js.Object {
    var name: js.UndefOr[SlotTypeName]
    var version: js.UndefOr[Version]
  }

  object GetSlotTypeRequest {
    def apply(
      name: js.UndefOr[SlotTypeName] = js.undefined,
      version: js.UndefOr[Version] = js.undefined): GetSlotTypeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "version" -> version.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSlotTypeRequest]
    }
  }

  @js.native
  trait GetSlotTypeResponse extends js.Object {
    var name: js.UndefOr[SlotTypeName]
    var enumerationValues: js.UndefOr[EnumerationValues]
    var description: js.UndefOr[Description]
    var version: js.UndefOr[Version]
    var checksum: js.UndefOr[String]
    var lastUpdatedDate: js.UndefOr[Timestamp]
    var valueSelectionStrategy: js.UndefOr[SlotValueSelectionStrategy]
    var createdDate: js.UndefOr[Timestamp]
  }

  object GetSlotTypeResponse {
    def apply(
      name: js.UndefOr[SlotTypeName] = js.undefined,
      enumerationValues: js.UndefOr[EnumerationValues] = js.undefined,
      description: js.UndefOr[Description] = js.undefined,
      version: js.UndefOr[Version] = js.undefined,
      checksum: js.UndefOr[String] = js.undefined,
      lastUpdatedDate: js.UndefOr[Timestamp] = js.undefined,
      valueSelectionStrategy: js.UndefOr[SlotValueSelectionStrategy] = js.undefined,
      createdDate: js.UndefOr[Timestamp] = js.undefined): GetSlotTypeResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "enumerationValues" -> enumerationValues.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "version" -> version.map { x => x.asInstanceOf[js.Any] },
        "checksum" -> checksum.map { x => x.asInstanceOf[js.Any] },
        "lastUpdatedDate" -> lastUpdatedDate.map { x => x.asInstanceOf[js.Any] },
        "valueSelectionStrategy" -> valueSelectionStrategy.map { x => x.asInstanceOf[js.Any] },
        "createdDate" -> createdDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSlotTypeResponse]
    }
  }

  @js.native
  trait GetSlotTypeVersionsRequest extends js.Object {
    var name: js.UndefOr[SlotTypeName]
    var nextToken: js.UndefOr[NextToken]
    var maxResults: js.UndefOr[MaxResults]
  }

  object GetSlotTypeVersionsRequest {
    def apply(
      name: js.UndefOr[SlotTypeName] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined): GetSlotTypeVersionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSlotTypeVersionsRequest]
    }
  }

  @js.native
  trait GetSlotTypeVersionsResponse extends js.Object {
    var slotTypes: js.UndefOr[SlotTypeMetadataList]
    var nextToken: js.UndefOr[NextToken]
  }

  object GetSlotTypeVersionsResponse {
    def apply(
      slotTypes: js.UndefOr[SlotTypeMetadataList] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): GetSlotTypeVersionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "slotTypes" -> slotTypes.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSlotTypeVersionsResponse]
    }
  }

  @js.native
  trait GetSlotTypesRequest extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var maxResults: js.UndefOr[MaxResults]
    var nameContains: js.UndefOr[SlotTypeName]
  }

  object GetSlotTypesRequest {
    def apply(
      nextToken: js.UndefOr[NextToken] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined,
      nameContains: js.UndefOr[SlotTypeName] = js.undefined): GetSlotTypesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nameContains" -> nameContains.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSlotTypesRequest]
    }
  }

  @js.native
  trait GetSlotTypesResponse extends js.Object {
    var slotTypes: js.UndefOr[SlotTypeMetadataList]
    var nextToken: js.UndefOr[NextToken]
  }

  object GetSlotTypesResponse {
    def apply(
      slotTypes: js.UndefOr[SlotTypeMetadataList] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): GetSlotTypesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "slotTypes" -> slotTypes.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSlotTypesResponse]
    }
  }

  @js.native
  trait GetUtterancesViewRequest extends js.Object {
    var botName: js.UndefOr[BotName]
    var botVersions: js.UndefOr[BotVersions]
    var statusType: js.UndefOr[StatusType]
  }

  object GetUtterancesViewRequest {
    def apply(
      botName: js.UndefOr[BotName] = js.undefined,
      botVersions: js.UndefOr[BotVersions] = js.undefined,
      statusType: js.UndefOr[StatusType] = js.undefined): GetUtterancesViewRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "botName" -> botName.map { x => x.asInstanceOf[js.Any] },
        "botVersions" -> botVersions.map { x => x.asInstanceOf[js.Any] },
        "statusType" -> statusType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetUtterancesViewRequest]
    }
  }

  @js.native
  trait GetUtterancesViewResponse extends js.Object {
    var botName: js.UndefOr[BotName]
    var utterances: js.UndefOr[ListsOfUtterances]
  }

  object GetUtterancesViewResponse {
    def apply(
      botName: js.UndefOr[BotName] = js.undefined,
      utterances: js.UndefOr[ListsOfUtterances] = js.undefined): GetUtterancesViewResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "botName" -> botName.map { x => x.asInstanceOf[js.Any] },
        "utterances" -> utterances.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetUtterancesViewResponse]
    }
  }

  object ImportStatusEnum {
    val IN_PROGRESS = "IN_PROGRESS"
    val COMPLETE = "COMPLETE"
    val FAILED = "FAILED"

    val values = IndexedSeq(IN_PROGRESS, COMPLETE, FAILED)
  }

  /**
   * <p>Identifies the specific version of an intent.</p>
   */
  @js.native
  trait Intent extends js.Object {
    var intentName: js.UndefOr[IntentName]
    var intentVersion: js.UndefOr[Version]
  }

  object Intent {
    def apply(
      intentName: js.UndefOr[IntentName] = js.undefined,
      intentVersion: js.UndefOr[Version] = js.undefined): Intent = {
      val _fields = IndexedSeq[(String, js.Any)](
        "intentName" -> intentName.map { x => x.asInstanceOf[js.Any] },
        "intentVersion" -> intentVersion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Intent]
    }
  }

  /**
   * <p>Provides information about an intent.</p>
   */
  @js.native
  trait IntentMetadata extends js.Object {
    var name: js.UndefOr[IntentName]
    var description: js.UndefOr[Description]
    var version: js.UndefOr[Version]
    var lastUpdatedDate: js.UndefOr[Timestamp]
    var createdDate: js.UndefOr[Timestamp]
  }

  object IntentMetadata {
    def apply(
      name: js.UndefOr[IntentName] = js.undefined,
      description: js.UndefOr[Description] = js.undefined,
      version: js.UndefOr[Version] = js.undefined,
      lastUpdatedDate: js.UndefOr[Timestamp] = js.undefined,
      createdDate: js.UndefOr[Timestamp] = js.undefined): IntentMetadata = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "version" -> version.map { x => x.asInstanceOf[js.Any] },
        "lastUpdatedDate" -> lastUpdatedDate.map { x => x.asInstanceOf[js.Any] },
        "createdDate" -> createdDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IntentMetadata]
    }
  }

  object LocaleEnum {
    val `en-US` = "en-US"
    val `en-GB` = "en-GB"
    val `de-DE` = "de-DE"

    val values = IndexedSeq(`en-US`, `en-GB`, `de-DE`)
  }

  object MergeStrategyEnum {
    val OVERWRITE_LATEST = "OVERWRITE_LATEST"
    val FAIL_ON_CONFLICT = "FAIL_ON_CONFLICT"

    val values = IndexedSeq(OVERWRITE_LATEST, FAIL_ON_CONFLICT)
  }

  /**
   * <p>The message object that provides the message text and its type.</p>
   */
  @js.native
  trait Message extends js.Object {
    var contentType: js.UndefOr[ContentType]
    var content: js.UndefOr[ContentString]
    var groupNumber: js.UndefOr[GroupNumber]
  }

  object Message {
    def apply(
      contentType: js.UndefOr[ContentType] = js.undefined,
      content: js.UndefOr[ContentString] = js.undefined,
      groupNumber: js.UndefOr[GroupNumber] = js.undefined): Message = {
      val _fields = IndexedSeq[(String, js.Any)](
        "contentType" -> contentType.map { x => x.asInstanceOf[js.Any] },
        "content" -> content.map { x => x.asInstanceOf[js.Any] },
        "groupNumber" -> groupNumber.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Message]
    }
  }

  object ProcessBehaviorEnum {
    val SAVE = "SAVE"
    val BUILD = "BUILD"

    val values = IndexedSeq(SAVE, BUILD)
  }

  /**
   * <p>Obtains information from the user. To define a prompt, provide one or more messages and specify the number of attempts to get information from the user. If you provide more than one message, Amazon Lex chooses one of the messages to use to prompt the user. For more information, see <a>how-it-works</a>.</p>
   */
  @js.native
  trait Prompt extends js.Object {
    var messages: js.UndefOr[MessageList]
    var maxAttempts: js.UndefOr[PromptMaxAttempts]
    var responseCard: js.UndefOr[ResponseCard]
  }

  object Prompt {
    def apply(
      messages: js.UndefOr[MessageList] = js.undefined,
      maxAttempts: js.UndefOr[PromptMaxAttempts] = js.undefined,
      responseCard: js.UndefOr[ResponseCard] = js.undefined): Prompt = {
      val _fields = IndexedSeq[(String, js.Any)](
        "messages" -> messages.map { x => x.asInstanceOf[js.Any] },
        "maxAttempts" -> maxAttempts.map { x => x.asInstanceOf[js.Any] },
        "responseCard" -> responseCard.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Prompt]
    }
  }

  @js.native
  trait PutBotAliasRequest extends js.Object {
    var name: js.UndefOr[AliasName]
    var description: js.UndefOr[Description]
    var botName: js.UndefOr[BotName]
    var botVersion: js.UndefOr[Version]
    var checksum: js.UndefOr[String]
  }

  object PutBotAliasRequest {
    def apply(
      name: js.UndefOr[AliasName] = js.undefined,
      description: js.UndefOr[Description] = js.undefined,
      botName: js.UndefOr[BotName] = js.undefined,
      botVersion: js.UndefOr[Version] = js.undefined,
      checksum: js.UndefOr[String] = js.undefined): PutBotAliasRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "botName" -> botName.map { x => x.asInstanceOf[js.Any] },
        "botVersion" -> botVersion.map { x => x.asInstanceOf[js.Any] },
        "checksum" -> checksum.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutBotAliasRequest]
    }
  }

  @js.native
  trait PutBotAliasResponse extends js.Object {
    var name: js.UndefOr[AliasName]
    var description: js.UndefOr[Description]
    var botName: js.UndefOr[BotName]
    var botVersion: js.UndefOr[Version]
    var checksum: js.UndefOr[String]
    var lastUpdatedDate: js.UndefOr[Timestamp]
    var createdDate: js.UndefOr[Timestamp]
  }

  object PutBotAliasResponse {
    def apply(
      name: js.UndefOr[AliasName] = js.undefined,
      description: js.UndefOr[Description] = js.undefined,
      botName: js.UndefOr[BotName] = js.undefined,
      botVersion: js.UndefOr[Version] = js.undefined,
      checksum: js.UndefOr[String] = js.undefined,
      lastUpdatedDate: js.UndefOr[Timestamp] = js.undefined,
      createdDate: js.UndefOr[Timestamp] = js.undefined): PutBotAliasResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "botName" -> botName.map { x => x.asInstanceOf[js.Any] },
        "botVersion" -> botVersion.map { x => x.asInstanceOf[js.Any] },
        "checksum" -> checksum.map { x => x.asInstanceOf[js.Any] },
        "lastUpdatedDate" -> lastUpdatedDate.map { x => x.asInstanceOf[js.Any] },
        "createdDate" -> createdDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutBotAliasResponse]
    }
  }

  @js.native
  trait PutBotRequest extends js.Object {
    var idleSessionTTLInSeconds: js.UndefOr[SessionTTL]
    var createVersion: js.UndefOr[Boolean]
    var name: js.UndefOr[BotName]
    var description: js.UndefOr[Description]
    var abortStatement: js.UndefOr[Statement]
    var voiceId: js.UndefOr[String]
    var clarificationPrompt: js.UndefOr[Prompt]
    var locale: js.UndefOr[Locale]
    var intents: js.UndefOr[IntentList]
    var checksum: js.UndefOr[String]
    var childDirected: js.UndefOr[Boolean]
    var processBehavior: js.UndefOr[ProcessBehavior]
  }

  object PutBotRequest {
    def apply(
      idleSessionTTLInSeconds: js.UndefOr[SessionTTL] = js.undefined,
      createVersion: js.UndefOr[Boolean] = js.undefined,
      name: js.UndefOr[BotName] = js.undefined,
      description: js.UndefOr[Description] = js.undefined,
      abortStatement: js.UndefOr[Statement] = js.undefined,
      voiceId: js.UndefOr[String] = js.undefined,
      clarificationPrompt: js.UndefOr[Prompt] = js.undefined,
      locale: js.UndefOr[Locale] = js.undefined,
      intents: js.UndefOr[IntentList] = js.undefined,
      checksum: js.UndefOr[String] = js.undefined,
      childDirected: js.UndefOr[Boolean] = js.undefined,
      processBehavior: js.UndefOr[ProcessBehavior] = js.undefined): PutBotRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "idleSessionTTLInSeconds" -> idleSessionTTLInSeconds.map { x => x.asInstanceOf[js.Any] },
        "createVersion" -> createVersion.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "abortStatement" -> abortStatement.map { x => x.asInstanceOf[js.Any] },
        "voiceId" -> voiceId.map { x => x.asInstanceOf[js.Any] },
        "clarificationPrompt" -> clarificationPrompt.map { x => x.asInstanceOf[js.Any] },
        "locale" -> locale.map { x => x.asInstanceOf[js.Any] },
        "intents" -> intents.map { x => x.asInstanceOf[js.Any] },
        "checksum" -> checksum.map { x => x.asInstanceOf[js.Any] },
        "childDirected" -> childDirected.map { x => x.asInstanceOf[js.Any] },
        "processBehavior" -> processBehavior.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutBotRequest]
    }
  }

  @js.native
  trait PutBotResponse extends js.Object {
    var idleSessionTTLInSeconds: js.UndefOr[SessionTTL]
    var createVersion: js.UndefOr[Boolean]
    var name: js.UndefOr[BotName]
    var failureReason: js.UndefOr[String]
    var description: js.UndefOr[Description]
    var abortStatement: js.UndefOr[Statement]
    var voiceId: js.UndefOr[String]
    var clarificationPrompt: js.UndefOr[Prompt]
    var locale: js.UndefOr[Locale]
    var intents: js.UndefOr[IntentList]
    var version: js.UndefOr[Version]
    var checksum: js.UndefOr[String]
    var lastUpdatedDate: js.UndefOr[Timestamp]
    var status: js.UndefOr[Status]
    var childDirected: js.UndefOr[Boolean]
    var createdDate: js.UndefOr[Timestamp]
  }

  object PutBotResponse {
    def apply(
      idleSessionTTLInSeconds: js.UndefOr[SessionTTL] = js.undefined,
      createVersion: js.UndefOr[Boolean] = js.undefined,
      name: js.UndefOr[BotName] = js.undefined,
      failureReason: js.UndefOr[String] = js.undefined,
      description: js.UndefOr[Description] = js.undefined,
      abortStatement: js.UndefOr[Statement] = js.undefined,
      voiceId: js.UndefOr[String] = js.undefined,
      clarificationPrompt: js.UndefOr[Prompt] = js.undefined,
      locale: js.UndefOr[Locale] = js.undefined,
      intents: js.UndefOr[IntentList] = js.undefined,
      version: js.UndefOr[Version] = js.undefined,
      checksum: js.UndefOr[String] = js.undefined,
      lastUpdatedDate: js.UndefOr[Timestamp] = js.undefined,
      status: js.UndefOr[Status] = js.undefined,
      childDirected: js.UndefOr[Boolean] = js.undefined,
      createdDate: js.UndefOr[Timestamp] = js.undefined): PutBotResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "idleSessionTTLInSeconds" -> idleSessionTTLInSeconds.map { x => x.asInstanceOf[js.Any] },
        "createVersion" -> createVersion.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "failureReason" -> failureReason.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "abortStatement" -> abortStatement.map { x => x.asInstanceOf[js.Any] },
        "voiceId" -> voiceId.map { x => x.asInstanceOf[js.Any] },
        "clarificationPrompt" -> clarificationPrompt.map { x => x.asInstanceOf[js.Any] },
        "locale" -> locale.map { x => x.asInstanceOf[js.Any] },
        "intents" -> intents.map { x => x.asInstanceOf[js.Any] },
        "version" -> version.map { x => x.asInstanceOf[js.Any] },
        "checksum" -> checksum.map { x => x.asInstanceOf[js.Any] },
        "lastUpdatedDate" -> lastUpdatedDate.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "childDirected" -> childDirected.map { x => x.asInstanceOf[js.Any] },
        "createdDate" -> createdDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutBotResponse]
    }
  }

  @js.native
  trait PutIntentRequest extends js.Object {
    var createVersion: js.UndefOr[Boolean]
    var name: js.UndefOr[IntentName]
    var dialogCodeHook: js.UndefOr[CodeHook]
    var rejectionStatement: js.UndefOr[Statement]
    var conclusionStatement: js.UndefOr[Statement]
    var description: js.UndefOr[Description]
    var parentIntentSignature: js.UndefOr[BuiltinIntentSignature]
    var sampleUtterances: js.UndefOr[IntentUtteranceList]
    var checksum: js.UndefOr[String]
    var slots: js.UndefOr[SlotList]
    var fulfillmentActivity: js.UndefOr[FulfillmentActivity]
    var followUpPrompt: js.UndefOr[FollowUpPrompt]
    var confirmationPrompt: js.UndefOr[Prompt]
  }

  object PutIntentRequest {
    def apply(
      createVersion: js.UndefOr[Boolean] = js.undefined,
      name: js.UndefOr[IntentName] = js.undefined,
      dialogCodeHook: js.UndefOr[CodeHook] = js.undefined,
      rejectionStatement: js.UndefOr[Statement] = js.undefined,
      conclusionStatement: js.UndefOr[Statement] = js.undefined,
      description: js.UndefOr[Description] = js.undefined,
      parentIntentSignature: js.UndefOr[BuiltinIntentSignature] = js.undefined,
      sampleUtterances: js.UndefOr[IntentUtteranceList] = js.undefined,
      checksum: js.UndefOr[String] = js.undefined,
      slots: js.UndefOr[SlotList] = js.undefined,
      fulfillmentActivity: js.UndefOr[FulfillmentActivity] = js.undefined,
      followUpPrompt: js.UndefOr[FollowUpPrompt] = js.undefined,
      confirmationPrompt: js.UndefOr[Prompt] = js.undefined): PutIntentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "createVersion" -> createVersion.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "dialogCodeHook" -> dialogCodeHook.map { x => x.asInstanceOf[js.Any] },
        "rejectionStatement" -> rejectionStatement.map { x => x.asInstanceOf[js.Any] },
        "conclusionStatement" -> conclusionStatement.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "parentIntentSignature" -> parentIntentSignature.map { x => x.asInstanceOf[js.Any] },
        "sampleUtterances" -> sampleUtterances.map { x => x.asInstanceOf[js.Any] },
        "checksum" -> checksum.map { x => x.asInstanceOf[js.Any] },
        "slots" -> slots.map { x => x.asInstanceOf[js.Any] },
        "fulfillmentActivity" -> fulfillmentActivity.map { x => x.asInstanceOf[js.Any] },
        "followUpPrompt" -> followUpPrompt.map { x => x.asInstanceOf[js.Any] },
        "confirmationPrompt" -> confirmationPrompt.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutIntentRequest]
    }
  }

  @js.native
  trait PutIntentResponse extends js.Object {
    var createVersion: js.UndefOr[Boolean]
    var name: js.UndefOr[IntentName]
    var dialogCodeHook: js.UndefOr[CodeHook]
    var rejectionStatement: js.UndefOr[Statement]
    var conclusionStatement: js.UndefOr[Statement]
    var description: js.UndefOr[Description]
    var parentIntentSignature: js.UndefOr[BuiltinIntentSignature]
    var sampleUtterances: js.UndefOr[IntentUtteranceList]
    var version: js.UndefOr[Version]
    var checksum: js.UndefOr[String]
    var lastUpdatedDate: js.UndefOr[Timestamp]
    var slots: js.UndefOr[SlotList]
    var fulfillmentActivity: js.UndefOr[FulfillmentActivity]
    var followUpPrompt: js.UndefOr[FollowUpPrompt]
    var confirmationPrompt: js.UndefOr[Prompt]
    var createdDate: js.UndefOr[Timestamp]
  }

  object PutIntentResponse {
    def apply(
      createVersion: js.UndefOr[Boolean] = js.undefined,
      name: js.UndefOr[IntentName] = js.undefined,
      dialogCodeHook: js.UndefOr[CodeHook] = js.undefined,
      rejectionStatement: js.UndefOr[Statement] = js.undefined,
      conclusionStatement: js.UndefOr[Statement] = js.undefined,
      description: js.UndefOr[Description] = js.undefined,
      parentIntentSignature: js.UndefOr[BuiltinIntentSignature] = js.undefined,
      sampleUtterances: js.UndefOr[IntentUtteranceList] = js.undefined,
      version: js.UndefOr[Version] = js.undefined,
      checksum: js.UndefOr[String] = js.undefined,
      lastUpdatedDate: js.UndefOr[Timestamp] = js.undefined,
      slots: js.UndefOr[SlotList] = js.undefined,
      fulfillmentActivity: js.UndefOr[FulfillmentActivity] = js.undefined,
      followUpPrompt: js.UndefOr[FollowUpPrompt] = js.undefined,
      confirmationPrompt: js.UndefOr[Prompt] = js.undefined,
      createdDate: js.UndefOr[Timestamp] = js.undefined): PutIntentResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "createVersion" -> createVersion.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "dialogCodeHook" -> dialogCodeHook.map { x => x.asInstanceOf[js.Any] },
        "rejectionStatement" -> rejectionStatement.map { x => x.asInstanceOf[js.Any] },
        "conclusionStatement" -> conclusionStatement.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "parentIntentSignature" -> parentIntentSignature.map { x => x.asInstanceOf[js.Any] },
        "sampleUtterances" -> sampleUtterances.map { x => x.asInstanceOf[js.Any] },
        "version" -> version.map { x => x.asInstanceOf[js.Any] },
        "checksum" -> checksum.map { x => x.asInstanceOf[js.Any] },
        "lastUpdatedDate" -> lastUpdatedDate.map { x => x.asInstanceOf[js.Any] },
        "slots" -> slots.map { x => x.asInstanceOf[js.Any] },
        "fulfillmentActivity" -> fulfillmentActivity.map { x => x.asInstanceOf[js.Any] },
        "followUpPrompt" -> followUpPrompt.map { x => x.asInstanceOf[js.Any] },
        "confirmationPrompt" -> confirmationPrompt.map { x => x.asInstanceOf[js.Any] },
        "createdDate" -> createdDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutIntentResponse]
    }
  }

  @js.native
  trait PutSlotTypeRequest extends js.Object {
    var createVersion: js.UndefOr[Boolean]
    var name: js.UndefOr[SlotTypeName]
    var enumerationValues: js.UndefOr[EnumerationValues]
    var description: js.UndefOr[Description]
    var checksum: js.UndefOr[String]
    var valueSelectionStrategy: js.UndefOr[SlotValueSelectionStrategy]
  }

  object PutSlotTypeRequest {
    def apply(
      createVersion: js.UndefOr[Boolean] = js.undefined,
      name: js.UndefOr[SlotTypeName] = js.undefined,
      enumerationValues: js.UndefOr[EnumerationValues] = js.undefined,
      description: js.UndefOr[Description] = js.undefined,
      checksum: js.UndefOr[String] = js.undefined,
      valueSelectionStrategy: js.UndefOr[SlotValueSelectionStrategy] = js.undefined): PutSlotTypeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "createVersion" -> createVersion.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "enumerationValues" -> enumerationValues.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "checksum" -> checksum.map { x => x.asInstanceOf[js.Any] },
        "valueSelectionStrategy" -> valueSelectionStrategy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutSlotTypeRequest]
    }
  }

  @js.native
  trait PutSlotTypeResponse extends js.Object {
    var createVersion: js.UndefOr[Boolean]
    var name: js.UndefOr[SlotTypeName]
    var enumerationValues: js.UndefOr[EnumerationValues]
    var description: js.UndefOr[Description]
    var version: js.UndefOr[Version]
    var checksum: js.UndefOr[String]
    var lastUpdatedDate: js.UndefOr[Timestamp]
    var valueSelectionStrategy: js.UndefOr[SlotValueSelectionStrategy]
    var createdDate: js.UndefOr[Timestamp]
  }

  object PutSlotTypeResponse {
    def apply(
      createVersion: js.UndefOr[Boolean] = js.undefined,
      name: js.UndefOr[SlotTypeName] = js.undefined,
      enumerationValues: js.UndefOr[EnumerationValues] = js.undefined,
      description: js.UndefOr[Description] = js.undefined,
      version: js.UndefOr[Version] = js.undefined,
      checksum: js.UndefOr[String] = js.undefined,
      lastUpdatedDate: js.UndefOr[Timestamp] = js.undefined,
      valueSelectionStrategy: js.UndefOr[SlotValueSelectionStrategy] = js.undefined,
      createdDate: js.UndefOr[Timestamp] = js.undefined): PutSlotTypeResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "createVersion" -> createVersion.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "enumerationValues" -> enumerationValues.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "version" -> version.map { x => x.asInstanceOf[js.Any] },
        "checksum" -> checksum.map { x => x.asInstanceOf[js.Any] },
        "lastUpdatedDate" -> lastUpdatedDate.map { x => x.asInstanceOf[js.Any] },
        "valueSelectionStrategy" -> valueSelectionStrategy.map { x => x.asInstanceOf[js.Any] },
        "createdDate" -> createdDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutSlotTypeResponse]
    }
  }

  object ResourceTypeEnum {
    val BOT = "BOT"
    val INTENT = "INTENT"
    val SLOT_TYPE = "SLOT_TYPE"

    val values = IndexedSeq(BOT, INTENT, SLOT_TYPE)
  }

  /**
   * <p>Identifies the version of a specific slot.</p>
   */
  @js.native
  trait Slot extends js.Object {
    var name: js.UndefOr[SlotName]
    var valueElicitationPrompt: js.UndefOr[Prompt]
    var priority: js.UndefOr[Priority]
    var description: js.UndefOr[Description]
    var slotConstraint: js.UndefOr[SlotConstraint]
    var responseCard: js.UndefOr[ResponseCard]
    var slotType: js.UndefOr[CustomOrBuiltinSlotTypeName]
    var sampleUtterances: js.UndefOr[SlotUtteranceList]
    var slotTypeVersion: js.UndefOr[Version]
  }

  object Slot {
    def apply(
      name: js.UndefOr[SlotName] = js.undefined,
      valueElicitationPrompt: js.UndefOr[Prompt] = js.undefined,
      priority: js.UndefOr[Priority] = js.undefined,
      description: js.UndefOr[Description] = js.undefined,
      slotConstraint: js.UndefOr[SlotConstraint] = js.undefined,
      responseCard: js.UndefOr[ResponseCard] = js.undefined,
      slotType: js.UndefOr[CustomOrBuiltinSlotTypeName] = js.undefined,
      sampleUtterances: js.UndefOr[SlotUtteranceList] = js.undefined,
      slotTypeVersion: js.UndefOr[Version] = js.undefined): Slot = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "valueElicitationPrompt" -> valueElicitationPrompt.map { x => x.asInstanceOf[js.Any] },
        "priority" -> priority.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "slotConstraint" -> slotConstraint.map { x => x.asInstanceOf[js.Any] },
        "responseCard" -> responseCard.map { x => x.asInstanceOf[js.Any] },
        "slotType" -> slotType.map { x => x.asInstanceOf[js.Any] },
        "sampleUtterances" -> sampleUtterances.map { x => x.asInstanceOf[js.Any] },
        "slotTypeVersion" -> slotTypeVersion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Slot]
    }
  }

  object SlotConstraintEnum {
    val Required = "Required"
    val Optional = "Optional"

    val values = IndexedSeq(Required, Optional)
  }

  /**
   * <p>Provides information about a slot type..</p>
   */
  @js.native
  trait SlotTypeMetadata extends js.Object {
    var name: js.UndefOr[SlotTypeName]
    var description: js.UndefOr[Description]
    var version: js.UndefOr[Version]
    var lastUpdatedDate: js.UndefOr[Timestamp]
    var createdDate: js.UndefOr[Timestamp]
  }

  object SlotTypeMetadata {
    def apply(
      name: js.UndefOr[SlotTypeName] = js.undefined,
      description: js.UndefOr[Description] = js.undefined,
      version: js.UndefOr[Version] = js.undefined,
      lastUpdatedDate: js.UndefOr[Timestamp] = js.undefined,
      createdDate: js.UndefOr[Timestamp] = js.undefined): SlotTypeMetadata = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "version" -> version.map { x => x.asInstanceOf[js.Any] },
        "lastUpdatedDate" -> lastUpdatedDate.map { x => x.asInstanceOf[js.Any] },
        "createdDate" -> createdDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SlotTypeMetadata]
    }
  }

  object SlotValueSelectionStrategyEnum {
    val ORIGINAL_VALUE = "ORIGINAL_VALUE"
    val TOP_RESOLUTION = "TOP_RESOLUTION"

    val values = IndexedSeq(ORIGINAL_VALUE, TOP_RESOLUTION)
  }

  @js.native
  trait StartImportRequest extends js.Object {
    var payload: js.UndefOr[Blob]
    var resourceType: js.UndefOr[ResourceType]
    var mergeStrategy: js.UndefOr[MergeStrategy]
  }

  object StartImportRequest {
    def apply(
      payload: js.UndefOr[Blob] = js.undefined,
      resourceType: js.UndefOr[ResourceType] = js.undefined,
      mergeStrategy: js.UndefOr[MergeStrategy] = js.undefined): StartImportRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "payload" -> payload.map { x => x.asInstanceOf[js.Any] },
        "resourceType" -> resourceType.map { x => x.asInstanceOf[js.Any] },
        "mergeStrategy" -> mergeStrategy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartImportRequest]
    }
  }

  @js.native
  trait StartImportResponse extends js.Object {
    var name: js.UndefOr[Name]
    var resourceType: js.UndefOr[ResourceType]
    var mergeStrategy: js.UndefOr[MergeStrategy]
    var importStatus: js.UndefOr[ImportStatus]
    var createdDate: js.UndefOr[Timestamp]
    var importId: js.UndefOr[String]
  }

  object StartImportResponse {
    def apply(
      name: js.UndefOr[Name] = js.undefined,
      resourceType: js.UndefOr[ResourceType] = js.undefined,
      mergeStrategy: js.UndefOr[MergeStrategy] = js.undefined,
      importStatus: js.UndefOr[ImportStatus] = js.undefined,
      createdDate: js.UndefOr[Timestamp] = js.undefined,
      importId: js.UndefOr[String] = js.undefined): StartImportResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "resourceType" -> resourceType.map { x => x.asInstanceOf[js.Any] },
        "mergeStrategy" -> mergeStrategy.map { x => x.asInstanceOf[js.Any] },
        "importStatus" -> importStatus.map { x => x.asInstanceOf[js.Any] },
        "createdDate" -> createdDate.map { x => x.asInstanceOf[js.Any] },
        "importId" -> importId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartImportResponse]
    }
  }

  /**
   * <p>A collection of messages that convey information to the user. At runtime, Amazon Lex selects the message to convey. </p>
   */
  @js.native
  trait Statement extends js.Object {
    var messages: js.UndefOr[MessageList]
    var responseCard: js.UndefOr[ResponseCard]
  }

  object Statement {
    def apply(
      messages: js.UndefOr[MessageList] = js.undefined,
      responseCard: js.UndefOr[ResponseCard] = js.undefined): Statement = {
      val _fields = IndexedSeq[(String, js.Any)](
        "messages" -> messages.map { x => x.asInstanceOf[js.Any] },
        "responseCard" -> responseCard.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Statement]
    }
  }

  object StatusEnum {
    val BUILDING = "BUILDING"
    val READY = "READY"
    val READY_BASIC_TESTING = "READY_BASIC_TESTING"
    val FAILED = "FAILED"
    val NOT_BUILT = "NOT_BUILT"

    val values = IndexedSeq(BUILDING, READY, READY_BASIC_TESTING, FAILED, NOT_BUILT)
  }

  object StatusTypeEnum {
    val Detected = "Detected"
    val Missed = "Missed"

    val values = IndexedSeq(Detected, Missed)
  }

  /**
   * <p>Provides information about a single utterance that was made to your bot. </p>
   */
  @js.native
  trait UtteranceData extends js.Object {
    var count: js.UndefOr[Count]
    var firstUtteredDate: js.UndefOr[Timestamp]
    var utteranceString: js.UndefOr[UtteranceString]
    var distinctUsers: js.UndefOr[Count]
    var lastUtteredDate: js.UndefOr[Timestamp]
  }

  object UtteranceData {
    def apply(
      count: js.UndefOr[Count] = js.undefined,
      firstUtteredDate: js.UndefOr[Timestamp] = js.undefined,
      utteranceString: js.UndefOr[UtteranceString] = js.undefined,
      distinctUsers: js.UndefOr[Count] = js.undefined,
      lastUtteredDate: js.UndefOr[Timestamp] = js.undefined): UtteranceData = {
      val _fields = IndexedSeq[(String, js.Any)](
        "count" -> count.map { x => x.asInstanceOf[js.Any] },
        "firstUtteredDate" -> firstUtteredDate.map { x => x.asInstanceOf[js.Any] },
        "utteranceString" -> utteranceString.map { x => x.asInstanceOf[js.Any] },
        "distinctUsers" -> distinctUsers.map { x => x.asInstanceOf[js.Any] },
        "lastUtteredDate" -> lastUtteredDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UtteranceData]
    }
  }

  /**
   * <p>Provides a list of utterances that have been made to a specific version of your bot. The list contains a maximum of 100 utterances.</p>
   */
  @js.native
  trait UtteranceList extends js.Object {
    var botVersion: js.UndefOr[Version]
    var utterances: js.UndefOr[ListOfUtterance]
  }

  object UtteranceList {
    def apply(
      botVersion: js.UndefOr[Version] = js.undefined,
      utterances: js.UndefOr[ListOfUtterance] = js.undefined): UtteranceList = {
      val _fields = IndexedSeq[(String, js.Any)](
        "botVersion" -> botVersion.map { x => x.asInstanceOf[js.Any] },
        "utterances" -> utterances.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UtteranceList]
    }
  }
}
