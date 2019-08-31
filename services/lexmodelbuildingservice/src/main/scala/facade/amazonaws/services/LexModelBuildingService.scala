package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object lexmodelbuildingservice {
  type AliasName                   = String
  type AliasNameOrListAll          = String
  type Blob                        = nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
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
  type ChannelStatus               = String
  type ChannelType                 = String
  type ContentString               = String
  type ContentType                 = String
  type Count                       = Int
  type CustomOrBuiltinSlotTypeName = String
  type Description                 = String
  type EnumerationValues           = js.Array[EnumerationValue]
  type ExportStatus                = String
  type ExportType                  = String
  type FulfillmentActivityType     = String
  type GroupNumber                 = Int
  type ImportStatus                = String
  type IntentList                  = js.Array[Intent]
  type IntentMetadataList          = js.Array[IntentMetadata]
  type IntentName                  = String
  type IntentUtteranceList         = js.Array[Utterance]
  type LambdaARN                   = String
  type ListOfUtterance             = js.Array[UtteranceData]
  type ListsOfUtterances           = js.Array[UtteranceList]
  type Locale                      = String
  type LocaleList                  = js.Array[Locale]
  type MaxResults                  = Int
  type MergeStrategy               = String
  type MessageList                 = js.Array[Message]
  type MessageVersion              = String
  type Name                        = String
  type NextToken                   = String
  type NumericalVersion            = String
  type Priority                    = Int
  type ProcessBehavior             = String
  type PromptMaxAttempts           = Int
  type ResourceType                = String
  type ResponseCard                = String
  type SessionTTL                  = Int
  type SlotConstraint              = String
  type SlotList                    = js.Array[Slot]
  type SlotName                    = String
  type SlotTypeMetadataList        = js.Array[SlotTypeMetadata]
  type SlotTypeName                = String
  type SlotUtteranceList           = js.Array[Utterance]
  type SlotValueSelectionStrategy  = String
  type Status                      = String
  type StatusType                  = String
  type StringList                  = js.Array[String]
  type SynonymList                 = js.Array[Value]
  type Timestamp                   = js.Date
  type UserId                      = String
  type Utterance                   = String
  type UtteranceString             = String
  type Value                       = String
  type Version                     = String

  implicit final class LexModelBuildingServiceOps(private val service: LexModelBuildingService) extends AnyVal {

    def createBotVersionFuture(params: CreateBotVersionRequest): Future[CreateBotVersionResponse] =
      service.createBotVersion(params).promise.toFuture
    def createIntentVersionFuture(params: CreateIntentVersionRequest): Future[CreateIntentVersionResponse] =
      service.createIntentVersion(params).promise.toFuture
    def createSlotTypeVersionFuture(params: CreateSlotTypeVersionRequest): Future[CreateSlotTypeVersionResponse] =
      service.createSlotTypeVersion(params).promise.toFuture
    def deleteBotAliasFuture(params: DeleteBotAliasRequest): Future[js.Object] =
      service.deleteBotAlias(params).promise.toFuture
    def deleteBotChannelAssociationFuture(params: DeleteBotChannelAssociationRequest): Future[js.Object] =
      service.deleteBotChannelAssociation(params).promise.toFuture
    def deleteBotFuture(params: DeleteBotRequest): Future[js.Object] = service.deleteBot(params).promise.toFuture
    def deleteBotVersionFuture(params: DeleteBotVersionRequest): Future[js.Object] =
      service.deleteBotVersion(params).promise.toFuture
    def deleteIntentFuture(params: DeleteIntentRequest): Future[js.Object] =
      service.deleteIntent(params).promise.toFuture
    def deleteIntentVersionFuture(params: DeleteIntentVersionRequest): Future[js.Object] =
      service.deleteIntentVersion(params).promise.toFuture
    def deleteSlotTypeFuture(params: DeleteSlotTypeRequest): Future[js.Object] =
      service.deleteSlotType(params).promise.toFuture
    def deleteSlotTypeVersionFuture(params: DeleteSlotTypeVersionRequest): Future[js.Object] =
      service.deleteSlotTypeVersion(params).promise.toFuture
    def deleteUtterancesFuture(params: DeleteUtterancesRequest): Future[js.Object] =
      service.deleteUtterances(params).promise.toFuture
    def getBotAliasFuture(params: GetBotAliasRequest): Future[GetBotAliasResponse] =
      service.getBotAlias(params).promise.toFuture
    def getBotAliasesFuture(params: GetBotAliasesRequest): Future[GetBotAliasesResponse] =
      service.getBotAliases(params).promise.toFuture
    def getBotChannelAssociationFuture(
        params: GetBotChannelAssociationRequest
    ): Future[GetBotChannelAssociationResponse] = service.getBotChannelAssociation(params).promise.toFuture
    def getBotChannelAssociationsFuture(
        params: GetBotChannelAssociationsRequest
    ): Future[GetBotChannelAssociationsResponse]                    = service.getBotChannelAssociations(params).promise.toFuture
    def getBotFuture(params: GetBotRequest): Future[GetBotResponse] = service.getBot(params).promise.toFuture
    def getBotVersionsFuture(params: GetBotVersionsRequest): Future[GetBotVersionsResponse] =
      service.getBotVersions(params).promise.toFuture
    def getBotsFuture(params: GetBotsRequest): Future[GetBotsResponse] = service.getBots(params).promise.toFuture
    def getBuiltinIntentFuture(params: GetBuiltinIntentRequest): Future[GetBuiltinIntentResponse] =
      service.getBuiltinIntent(params).promise.toFuture
    def getBuiltinIntentsFuture(params: GetBuiltinIntentsRequest): Future[GetBuiltinIntentsResponse] =
      service.getBuiltinIntents(params).promise.toFuture
    def getBuiltinSlotTypesFuture(params: GetBuiltinSlotTypesRequest): Future[GetBuiltinSlotTypesResponse] =
      service.getBuiltinSlotTypes(params).promise.toFuture
    def getExportFuture(params: GetExportRequest): Future[GetExportResponse] =
      service.getExport(params).promise.toFuture
    def getImportFuture(params: GetImportRequest): Future[GetImportResponse] =
      service.getImport(params).promise.toFuture
    def getIntentFuture(params: GetIntentRequest): Future[GetIntentResponse] =
      service.getIntent(params).promise.toFuture
    def getIntentVersionsFuture(params: GetIntentVersionsRequest): Future[GetIntentVersionsResponse] =
      service.getIntentVersions(params).promise.toFuture
    def getIntentsFuture(params: GetIntentsRequest): Future[GetIntentsResponse] =
      service.getIntents(params).promise.toFuture
    def getSlotTypeFuture(params: GetSlotTypeRequest): Future[GetSlotTypeResponse] =
      service.getSlotType(params).promise.toFuture
    def getSlotTypeVersionsFuture(params: GetSlotTypeVersionsRequest): Future[GetSlotTypeVersionsResponse] =
      service.getSlotTypeVersions(params).promise.toFuture
    def getSlotTypesFuture(params: GetSlotTypesRequest): Future[GetSlotTypesResponse] =
      service.getSlotTypes(params).promise.toFuture
    def getUtterancesViewFuture(params: GetUtterancesViewRequest): Future[GetUtterancesViewResponse] =
      service.getUtterancesView(params).promise.toFuture
    def putBotAliasFuture(params: PutBotAliasRequest): Future[PutBotAliasResponse] =
      service.putBotAlias(params).promise.toFuture
    def putBotFuture(params: PutBotRequest): Future[PutBotResponse] = service.putBot(params).promise.toFuture
    def putIntentFuture(params: PutIntentRequest): Future[PutIntentResponse] =
      service.putIntent(params).promise.toFuture
    def putSlotTypeFuture(params: PutSlotTypeRequest): Future[PutSlotTypeResponse] =
      service.putSlotType(params).promise.toFuture
    def startImportFuture(params: StartImportRequest): Future[StartImportResponse] =
      service.startImport(params).promise.toFuture
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
  trait BotAliasMetadata extends js.Object {
    var botName: js.UndefOr[BotName]
    var botVersion: js.UndefOr[Version]
    var checksum: js.UndefOr[String]
    var createdDate: js.UndefOr[Timestamp]
    var description: js.UndefOr[Description]
    var lastUpdatedDate: js.UndefOr[Timestamp]
    var name: js.UndefOr[AliasName]
  }

  object BotAliasMetadata {
    @inline
    def apply(
        botName: js.UndefOr[BotName] = js.undefined,
        botVersion: js.UndefOr[Version] = js.undefined,
        checksum: js.UndefOr[String] = js.undefined,
        createdDate: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        lastUpdatedDate: js.UndefOr[Timestamp] = js.undefined,
        name: js.UndefOr[AliasName] = js.undefined
    ): BotAliasMetadata = {
      val __obj = js.Dynamic.literal()
      botName.foreach(__v => __obj.updateDynamic("botName")(__v.asInstanceOf[js.Any]))
      botVersion.foreach(__v => __obj.updateDynamic("botVersion")(__v.asInstanceOf[js.Any]))
      checksum.foreach(__v => __obj.updateDynamic("checksum")(__v.asInstanceOf[js.Any]))
      createdDate.foreach(__v => __obj.updateDynamic("createdDate")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      lastUpdatedDate.foreach(__v => __obj.updateDynamic("lastUpdatedDate")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BotAliasMetadata]
    }
  }

  /**
    * Represents an association between an Amazon Lex bot and an external messaging platform.
    */
  @js.native
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

  object BotChannelAssociation {
    @inline
    def apply(
        botAlias: js.UndefOr[AliasName] = js.undefined,
        botConfiguration: js.UndefOr[ChannelConfigurationMap] = js.undefined,
        botName: js.UndefOr[BotName] = js.undefined,
        createdDate: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        failureReason: js.UndefOr[String] = js.undefined,
        name: js.UndefOr[BotChannelName] = js.undefined,
        status: js.UndefOr[ChannelStatus] = js.undefined,
        `type`: js.UndefOr[ChannelType] = js.undefined
    ): BotChannelAssociation = {
      val __obj = js.Dynamic.literal()
      botAlias.foreach(__v => __obj.updateDynamic("botAlias")(__v.asInstanceOf[js.Any]))
      botConfiguration.foreach(__v => __obj.updateDynamic("botConfiguration")(__v.asInstanceOf[js.Any]))
      botName.foreach(__v => __obj.updateDynamic("botName")(__v.asInstanceOf[js.Any]))
      createdDate.foreach(__v => __obj.updateDynamic("createdDate")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      failureReason.foreach(__v => __obj.updateDynamic("failureReason")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BotChannelAssociation]
    }
  }

  /**
    * Provides information about a bot. .
    */
  @js.native
  trait BotMetadata extends js.Object {
    var createdDate: js.UndefOr[Timestamp]
    var description: js.UndefOr[Description]
    var lastUpdatedDate: js.UndefOr[Timestamp]
    var name: js.UndefOr[BotName]
    var status: js.UndefOr[Status]
    var version: js.UndefOr[Version]
  }

  object BotMetadata {
    @inline
    def apply(
        createdDate: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        lastUpdatedDate: js.UndefOr[Timestamp] = js.undefined,
        name: js.UndefOr[BotName] = js.undefined,
        status: js.UndefOr[Status] = js.undefined,
        version: js.UndefOr[Version] = js.undefined
    ): BotMetadata = {
      val __obj = js.Dynamic.literal()
      createdDate.foreach(__v => __obj.updateDynamic("createdDate")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      lastUpdatedDate.foreach(__v => __obj.updateDynamic("lastUpdatedDate")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BotMetadata]
    }
  }

  /**
    * Provides metadata for a built-in intent.
    */
  @js.native
  trait BuiltinIntentMetadata extends js.Object {
    var signature: js.UndefOr[BuiltinIntentSignature]
    var supportedLocales: js.UndefOr[LocaleList]
  }

  object BuiltinIntentMetadata {
    @inline
    def apply(
        signature: js.UndefOr[BuiltinIntentSignature] = js.undefined,
        supportedLocales: js.UndefOr[LocaleList] = js.undefined
    ): BuiltinIntentMetadata = {
      val __obj = js.Dynamic.literal()
      signature.foreach(__v => __obj.updateDynamic("signature")(__v.asInstanceOf[js.Any]))
      supportedLocales.foreach(__v => __obj.updateDynamic("supportedLocales")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BuiltinIntentMetadata]
    }
  }

  /**
    * Provides information about a slot used in a built-in intent.
    */
  @js.native
  trait BuiltinIntentSlot extends js.Object {
    var name: js.UndefOr[String]
  }

  object BuiltinIntentSlot {
    @inline
    def apply(
        name: js.UndefOr[String] = js.undefined
    ): BuiltinIntentSlot = {
      val __obj = js.Dynamic.literal()
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BuiltinIntentSlot]
    }
  }

  /**
    * Provides information about a built in slot type.
    */
  @js.native
  trait BuiltinSlotTypeMetadata extends js.Object {
    var signature: js.UndefOr[BuiltinSlotTypeSignature]
    var supportedLocales: js.UndefOr[LocaleList]
  }

  object BuiltinSlotTypeMetadata {
    @inline
    def apply(
        signature: js.UndefOr[BuiltinSlotTypeSignature] = js.undefined,
        supportedLocales: js.UndefOr[LocaleList] = js.undefined
    ): BuiltinSlotTypeMetadata = {
      val __obj = js.Dynamic.literal()
      signature.foreach(__v => __obj.updateDynamic("signature")(__v.asInstanceOf[js.Any]))
      supportedLocales.foreach(__v => __obj.updateDynamic("supportedLocales")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BuiltinSlotTypeMetadata]
    }
  }

  object ChannelStatusEnum {
    val IN_PROGRESS = "IN_PROGRESS"
    val CREATED     = "CREATED"
    val FAILED      = "FAILED"

    val values = js.Object.freeze(js.Array(IN_PROGRESS, CREATED, FAILED))
  }

  object ChannelTypeEnum {
    val Facebook     = "Facebook"
    val Slack        = "Slack"
    val `Twilio-Sms` = "Twilio-Sms"
    val Kik          = "Kik"

    val values = js.Object.freeze(js.Array(Facebook, Slack, `Twilio-Sms`, Kik))
  }

  /**
    * Specifies a Lambda function that verifies requests to a bot or fulfills the user's request to a bot..
    */
  @js.native
  trait CodeHook extends js.Object {
    var messageVersion: MessageVersion
    var uri: LambdaARN
  }

  object CodeHook {
    @inline
    def apply(
        messageVersion: MessageVersion,
        uri: LambdaARN
    ): CodeHook = {
      val __obj = js.Dynamic.literal(
        "messageVersion" -> messageVersion.asInstanceOf[js.Any],
        "uri"            -> uri.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CodeHook]
    }
  }

  object ContentTypeEnum {
    val PlainText     = "PlainText"
    val SSML          = "SSML"
    val CustomPayload = "CustomPayload"

    val values = js.Object.freeze(js.Array(PlainText, SSML, CustomPayload))
  }

  @js.native
  trait CreateBotVersionRequest extends js.Object {
    var name: BotName
    var checksum: js.UndefOr[String]
  }

  object CreateBotVersionRequest {
    @inline
    def apply(
        name: BotName,
        checksum: js.UndefOr[String] = js.undefined
    ): CreateBotVersionRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      checksum.foreach(__v => __obj.updateDynamic("checksum")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateBotVersionRequest]
    }
  }

  @js.native
  trait CreateBotVersionResponse extends js.Object {
    var abortStatement: js.UndefOr[Statement]
    var checksum: js.UndefOr[String]
    var childDirected: js.UndefOr[Boolean]
    var clarificationPrompt: js.UndefOr[Prompt]
    var createdDate: js.UndefOr[Timestamp]
    var description: js.UndefOr[Description]
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

  object CreateBotVersionResponse {
    @inline
    def apply(
        abortStatement: js.UndefOr[Statement] = js.undefined,
        checksum: js.UndefOr[String] = js.undefined,
        childDirected: js.UndefOr[Boolean] = js.undefined,
        clarificationPrompt: js.UndefOr[Prompt] = js.undefined,
        createdDate: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        failureReason: js.UndefOr[String] = js.undefined,
        idleSessionTTLInSeconds: js.UndefOr[SessionTTL] = js.undefined,
        intents: js.UndefOr[IntentList] = js.undefined,
        lastUpdatedDate: js.UndefOr[Timestamp] = js.undefined,
        locale: js.UndefOr[Locale] = js.undefined,
        name: js.UndefOr[BotName] = js.undefined,
        status: js.UndefOr[Status] = js.undefined,
        version: js.UndefOr[Version] = js.undefined,
        voiceId: js.UndefOr[String] = js.undefined
    ): CreateBotVersionResponse = {
      val __obj = js.Dynamic.literal()
      abortStatement.foreach(__v => __obj.updateDynamic("abortStatement")(__v.asInstanceOf[js.Any]))
      checksum.foreach(__v => __obj.updateDynamic("checksum")(__v.asInstanceOf[js.Any]))
      childDirected.foreach(__v => __obj.updateDynamic("childDirected")(__v.asInstanceOf[js.Any]))
      clarificationPrompt.foreach(__v => __obj.updateDynamic("clarificationPrompt")(__v.asInstanceOf[js.Any]))
      createdDate.foreach(__v => __obj.updateDynamic("createdDate")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      failureReason.foreach(__v => __obj.updateDynamic("failureReason")(__v.asInstanceOf[js.Any]))
      idleSessionTTLInSeconds.foreach(__v => __obj.updateDynamic("idleSessionTTLInSeconds")(__v.asInstanceOf[js.Any]))
      intents.foreach(__v => __obj.updateDynamic("intents")(__v.asInstanceOf[js.Any]))
      lastUpdatedDate.foreach(__v => __obj.updateDynamic("lastUpdatedDate")(__v.asInstanceOf[js.Any]))
      locale.foreach(__v => __obj.updateDynamic("locale")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      voiceId.foreach(__v => __obj.updateDynamic("voiceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateBotVersionResponse]
    }
  }

  @js.native
  trait CreateIntentVersionRequest extends js.Object {
    var name: IntentName
    var checksum: js.UndefOr[String]
  }

  object CreateIntentVersionRequest {
    @inline
    def apply(
        name: IntentName,
        checksum: js.UndefOr[String] = js.undefined
    ): CreateIntentVersionRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      checksum.foreach(__v => __obj.updateDynamic("checksum")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateIntentVersionRequest]
    }
  }

  @js.native
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

  object CreateIntentVersionResponse {
    @inline
    def apply(
        checksum: js.UndefOr[String] = js.undefined,
        conclusionStatement: js.UndefOr[Statement] = js.undefined,
        confirmationPrompt: js.UndefOr[Prompt] = js.undefined,
        createdDate: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        dialogCodeHook: js.UndefOr[CodeHook] = js.undefined,
        followUpPrompt: js.UndefOr[FollowUpPrompt] = js.undefined,
        fulfillmentActivity: js.UndefOr[FulfillmentActivity] = js.undefined,
        lastUpdatedDate: js.UndefOr[Timestamp] = js.undefined,
        name: js.UndefOr[IntentName] = js.undefined,
        parentIntentSignature: js.UndefOr[BuiltinIntentSignature] = js.undefined,
        rejectionStatement: js.UndefOr[Statement] = js.undefined,
        sampleUtterances: js.UndefOr[IntentUtteranceList] = js.undefined,
        slots: js.UndefOr[SlotList] = js.undefined,
        version: js.UndefOr[Version] = js.undefined
    ): CreateIntentVersionResponse = {
      val __obj = js.Dynamic.literal()
      checksum.foreach(__v => __obj.updateDynamic("checksum")(__v.asInstanceOf[js.Any]))
      conclusionStatement.foreach(__v => __obj.updateDynamic("conclusionStatement")(__v.asInstanceOf[js.Any]))
      confirmationPrompt.foreach(__v => __obj.updateDynamic("confirmationPrompt")(__v.asInstanceOf[js.Any]))
      createdDate.foreach(__v => __obj.updateDynamic("createdDate")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      dialogCodeHook.foreach(__v => __obj.updateDynamic("dialogCodeHook")(__v.asInstanceOf[js.Any]))
      followUpPrompt.foreach(__v => __obj.updateDynamic("followUpPrompt")(__v.asInstanceOf[js.Any]))
      fulfillmentActivity.foreach(__v => __obj.updateDynamic("fulfillmentActivity")(__v.asInstanceOf[js.Any]))
      lastUpdatedDate.foreach(__v => __obj.updateDynamic("lastUpdatedDate")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      parentIntentSignature.foreach(__v => __obj.updateDynamic("parentIntentSignature")(__v.asInstanceOf[js.Any]))
      rejectionStatement.foreach(__v => __obj.updateDynamic("rejectionStatement")(__v.asInstanceOf[js.Any]))
      sampleUtterances.foreach(__v => __obj.updateDynamic("sampleUtterances")(__v.asInstanceOf[js.Any]))
      slots.foreach(__v => __obj.updateDynamic("slots")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateIntentVersionResponse]
    }
  }

  @js.native
  trait CreateSlotTypeVersionRequest extends js.Object {
    var name: SlotTypeName
    var checksum: js.UndefOr[String]
  }

  object CreateSlotTypeVersionRequest {
    @inline
    def apply(
        name: SlotTypeName,
        checksum: js.UndefOr[String] = js.undefined
    ): CreateSlotTypeVersionRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      checksum.foreach(__v => __obj.updateDynamic("checksum")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSlotTypeVersionRequest]
    }
  }

  @js.native
  trait CreateSlotTypeVersionResponse extends js.Object {
    var checksum: js.UndefOr[String]
    var createdDate: js.UndefOr[Timestamp]
    var description: js.UndefOr[Description]
    var enumerationValues: js.UndefOr[EnumerationValues]
    var lastUpdatedDate: js.UndefOr[Timestamp]
    var name: js.UndefOr[SlotTypeName]
    var valueSelectionStrategy: js.UndefOr[SlotValueSelectionStrategy]
    var version: js.UndefOr[Version]
  }

  object CreateSlotTypeVersionResponse {
    @inline
    def apply(
        checksum: js.UndefOr[String] = js.undefined,
        createdDate: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        enumerationValues: js.UndefOr[EnumerationValues] = js.undefined,
        lastUpdatedDate: js.UndefOr[Timestamp] = js.undefined,
        name: js.UndefOr[SlotTypeName] = js.undefined,
        valueSelectionStrategy: js.UndefOr[SlotValueSelectionStrategy] = js.undefined,
        version: js.UndefOr[Version] = js.undefined
    ): CreateSlotTypeVersionResponse = {
      val __obj = js.Dynamic.literal()
      checksum.foreach(__v => __obj.updateDynamic("checksum")(__v.asInstanceOf[js.Any]))
      createdDate.foreach(__v => __obj.updateDynamic("createdDate")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      enumerationValues.foreach(__v => __obj.updateDynamic("enumerationValues")(__v.asInstanceOf[js.Any]))
      lastUpdatedDate.foreach(__v => __obj.updateDynamic("lastUpdatedDate")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      valueSelectionStrategy.foreach(__v => __obj.updateDynamic("valueSelectionStrategy")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSlotTypeVersionResponse]
    }
  }

  @js.native
  trait DeleteBotAliasRequest extends js.Object {
    var botName: BotName
    var name: AliasName
  }

  object DeleteBotAliasRequest {
    @inline
    def apply(
        botName: BotName,
        name: AliasName
    ): DeleteBotAliasRequest = {
      val __obj = js.Dynamic.literal(
        "botName" -> botName.asInstanceOf[js.Any],
        "name"    -> name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteBotAliasRequest]
    }
  }

  @js.native
  trait DeleteBotChannelAssociationRequest extends js.Object {
    var botAlias: AliasName
    var botName: BotName
    var name: BotChannelName
  }

  object DeleteBotChannelAssociationRequest {
    @inline
    def apply(
        botAlias: AliasName,
        botName: BotName,
        name: BotChannelName
    ): DeleteBotChannelAssociationRequest = {
      val __obj = js.Dynamic.literal(
        "botAlias" -> botAlias.asInstanceOf[js.Any],
        "botName"  -> botName.asInstanceOf[js.Any],
        "name"     -> name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteBotChannelAssociationRequest]
    }
  }

  @js.native
  trait DeleteBotRequest extends js.Object {
    var name: BotName
  }

  object DeleteBotRequest {
    @inline
    def apply(
        name: BotName
    ): DeleteBotRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteBotRequest]
    }
  }

  @js.native
  trait DeleteBotVersionRequest extends js.Object {
    var name: BotName
    var version: NumericalVersion
  }

  object DeleteBotVersionRequest {
    @inline
    def apply(
        name: BotName,
        version: NumericalVersion
    ): DeleteBotVersionRequest = {
      val __obj = js.Dynamic.literal(
        "name"    -> name.asInstanceOf[js.Any],
        "version" -> version.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteBotVersionRequest]
    }
  }

  @js.native
  trait DeleteIntentRequest extends js.Object {
    var name: IntentName
  }

  object DeleteIntentRequest {
    @inline
    def apply(
        name: IntentName
    ): DeleteIntentRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteIntentRequest]
    }
  }

  @js.native
  trait DeleteIntentVersionRequest extends js.Object {
    var name: IntentName
    var version: NumericalVersion
  }

  object DeleteIntentVersionRequest {
    @inline
    def apply(
        name: IntentName,
        version: NumericalVersion
    ): DeleteIntentVersionRequest = {
      val __obj = js.Dynamic.literal(
        "name"    -> name.asInstanceOf[js.Any],
        "version" -> version.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteIntentVersionRequest]
    }
  }

  @js.native
  trait DeleteSlotTypeRequest extends js.Object {
    var name: SlotTypeName
  }

  object DeleteSlotTypeRequest {
    @inline
    def apply(
        name: SlotTypeName
    ): DeleteSlotTypeRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteSlotTypeRequest]
    }
  }

  @js.native
  trait DeleteSlotTypeVersionRequest extends js.Object {
    var name: SlotTypeName
    var version: NumericalVersion
  }

  object DeleteSlotTypeVersionRequest {
    @inline
    def apply(
        name: SlotTypeName,
        version: NumericalVersion
    ): DeleteSlotTypeVersionRequest = {
      val __obj = js.Dynamic.literal(
        "name"    -> name.asInstanceOf[js.Any],
        "version" -> version.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteSlotTypeVersionRequest]
    }
  }

  @js.native
  trait DeleteUtterancesRequest extends js.Object {
    var botName: BotName
    var userId: UserId
  }

  object DeleteUtterancesRequest {
    @inline
    def apply(
        botName: BotName,
        userId: UserId
    ): DeleteUtterancesRequest = {
      val __obj = js.Dynamic.literal(
        "botName" -> botName.asInstanceOf[js.Any],
        "userId"  -> userId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteUtterancesRequest]
    }
  }

  /**
    * Each slot type can have a set of values. Each enumeration value represents a value the slot type can take.
    *  For example, a pizza ordering bot could have a slot type that specifies the type of crust that the pizza should have. The slot type could include the values
    * * thick
    *  * thin
    *  * stuffed
    */
  @js.native
  trait EnumerationValue extends js.Object {
    var value: Value
    var synonyms: js.UndefOr[SynonymList]
  }

  object EnumerationValue {
    @inline
    def apply(
        value: Value,
        synonyms: js.UndefOr[SynonymList] = js.undefined
    ): EnumerationValue = {
      val __obj = js.Dynamic.literal(
        "value" -> value.asInstanceOf[js.Any]
      )

      synonyms.foreach(__v => __obj.updateDynamic("synonyms")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EnumerationValue]
    }
  }

  object ExportStatusEnum {
    val IN_PROGRESS = "IN_PROGRESS"
    val READY       = "READY"
    val FAILED      = "FAILED"

    val values = js.Object.freeze(js.Array(IN_PROGRESS, READY, FAILED))
  }

  object ExportTypeEnum {
    val ALEXA_SKILLS_KIT = "ALEXA_SKILLS_KIT"
    val LEX              = "LEX"

    val values = js.Object.freeze(js.Array(ALEXA_SKILLS_KIT, LEX))
  }

  /**
    * A prompt for additional activity after an intent is fulfilled. For example, after the <code>OrderPizza</code> intent is fulfilled, you might prompt the user to find out whether the user wants to order drinks.
    */
  @js.native
  trait FollowUpPrompt extends js.Object {
    var prompt: Prompt
    var rejectionStatement: Statement
  }

  object FollowUpPrompt {
    @inline
    def apply(
        prompt: Prompt,
        rejectionStatement: Statement
    ): FollowUpPrompt = {
      val __obj = js.Dynamic.literal(
        "prompt"             -> prompt.asInstanceOf[js.Any],
        "rejectionStatement" -> rejectionStatement.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[FollowUpPrompt]
    }
  }

  /**
    * Describes how the intent is fulfilled after the user provides all of the information required for the intent. You can provide a Lambda function to process the intent, or you can return the intent information to the client application. We recommend that you use a Lambda function so that the relevant logic lives in the Cloud and limit the client-side code primarily to presentation. If you need to update the logic, you only update the Lambda function; you don't need to upgrade your client application.
    *  Consider the following examples:
    * * In a pizza ordering application, after the user provides all of the information for placing an order, you use a Lambda function to place an order with a pizzeria.
    *  * In a gaming application, when a user says "pick up a rock," this information must go back to the client application so that it can perform the operation and update the graphics. In this case, you want Amazon Lex to return the intent data to the client.
    */
  @js.native
  trait FulfillmentActivity extends js.Object {
    var `type`: FulfillmentActivityType
    var codeHook: js.UndefOr[CodeHook]
  }

  object FulfillmentActivity {
    @inline
    def apply(
        `type`: FulfillmentActivityType,
        codeHook: js.UndefOr[CodeHook] = js.undefined
    ): FulfillmentActivity = {
      val __obj = js.Dynamic.literal(
        "type" -> `type`.asInstanceOf[js.Any]
      )

      codeHook.foreach(__v => __obj.updateDynamic("codeHook")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FulfillmentActivity]
    }
  }

  object FulfillmentActivityTypeEnum {
    val ReturnIntent = "ReturnIntent"
    val CodeHook     = "CodeHook"

    val values = js.Object.freeze(js.Array(ReturnIntent, CodeHook))
  }

  @js.native
  trait GetBotAliasRequest extends js.Object {
    var botName: BotName
    var name: AliasName
  }

  object GetBotAliasRequest {
    @inline
    def apply(
        botName: BotName,
        name: AliasName
    ): GetBotAliasRequest = {
      val __obj = js.Dynamic.literal(
        "botName" -> botName.asInstanceOf[js.Any],
        "name"    -> name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetBotAliasRequest]
    }
  }

  @js.native
  trait GetBotAliasResponse extends js.Object {
    var botName: js.UndefOr[BotName]
    var botVersion: js.UndefOr[Version]
    var checksum: js.UndefOr[String]
    var createdDate: js.UndefOr[Timestamp]
    var description: js.UndefOr[Description]
    var lastUpdatedDate: js.UndefOr[Timestamp]
    var name: js.UndefOr[AliasName]
  }

  object GetBotAliasResponse {
    @inline
    def apply(
        botName: js.UndefOr[BotName] = js.undefined,
        botVersion: js.UndefOr[Version] = js.undefined,
        checksum: js.UndefOr[String] = js.undefined,
        createdDate: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        lastUpdatedDate: js.UndefOr[Timestamp] = js.undefined,
        name: js.UndefOr[AliasName] = js.undefined
    ): GetBotAliasResponse = {
      val __obj = js.Dynamic.literal()
      botName.foreach(__v => __obj.updateDynamic("botName")(__v.asInstanceOf[js.Any]))
      botVersion.foreach(__v => __obj.updateDynamic("botVersion")(__v.asInstanceOf[js.Any]))
      checksum.foreach(__v => __obj.updateDynamic("checksum")(__v.asInstanceOf[js.Any]))
      createdDate.foreach(__v => __obj.updateDynamic("createdDate")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      lastUpdatedDate.foreach(__v => __obj.updateDynamic("lastUpdatedDate")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBotAliasResponse]
    }
  }

  @js.native
  trait GetBotAliasesRequest extends js.Object {
    var botName: BotName
    var maxResults: js.UndefOr[MaxResults]
    var nameContains: js.UndefOr[AliasName]
    var nextToken: js.UndefOr[NextToken]
  }

  object GetBotAliasesRequest {
    @inline
    def apply(
        botName: BotName,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nameContains: js.UndefOr[AliasName] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): GetBotAliasesRequest = {
      val __obj = js.Dynamic.literal(
        "botName" -> botName.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nameContains.foreach(__v => __obj.updateDynamic("nameContains")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBotAliasesRequest]
    }
  }

  @js.native
  trait GetBotAliasesResponse extends js.Object {
    var BotAliases: js.UndefOr[BotAliasMetadataList]
    var nextToken: js.UndefOr[NextToken]
  }

  object GetBotAliasesResponse {
    @inline
    def apply(
        BotAliases: js.UndefOr[BotAliasMetadataList] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): GetBotAliasesResponse = {
      val __obj = js.Dynamic.literal()
      BotAliases.foreach(__v => __obj.updateDynamic("BotAliases")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBotAliasesResponse]
    }
  }

  @js.native
  trait GetBotChannelAssociationRequest extends js.Object {
    var botAlias: AliasName
    var botName: BotName
    var name: BotChannelName
  }

  object GetBotChannelAssociationRequest {
    @inline
    def apply(
        botAlias: AliasName,
        botName: BotName,
        name: BotChannelName
    ): GetBotChannelAssociationRequest = {
      val __obj = js.Dynamic.literal(
        "botAlias" -> botAlias.asInstanceOf[js.Any],
        "botName"  -> botName.asInstanceOf[js.Any],
        "name"     -> name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetBotChannelAssociationRequest]
    }
  }

  @js.native
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

  object GetBotChannelAssociationResponse {
    @inline
    def apply(
        botAlias: js.UndefOr[AliasName] = js.undefined,
        botConfiguration: js.UndefOr[ChannelConfigurationMap] = js.undefined,
        botName: js.UndefOr[BotName] = js.undefined,
        createdDate: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        failureReason: js.UndefOr[String] = js.undefined,
        name: js.UndefOr[BotChannelName] = js.undefined,
        status: js.UndefOr[ChannelStatus] = js.undefined,
        `type`: js.UndefOr[ChannelType] = js.undefined
    ): GetBotChannelAssociationResponse = {
      val __obj = js.Dynamic.literal()
      botAlias.foreach(__v => __obj.updateDynamic("botAlias")(__v.asInstanceOf[js.Any]))
      botConfiguration.foreach(__v => __obj.updateDynamic("botConfiguration")(__v.asInstanceOf[js.Any]))
      botName.foreach(__v => __obj.updateDynamic("botName")(__v.asInstanceOf[js.Any]))
      createdDate.foreach(__v => __obj.updateDynamic("createdDate")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      failureReason.foreach(__v => __obj.updateDynamic("failureReason")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBotChannelAssociationResponse]
    }
  }

  @js.native
  trait GetBotChannelAssociationsRequest extends js.Object {
    var botAlias: AliasNameOrListAll
    var botName: BotName
    var maxResults: js.UndefOr[MaxResults]
    var nameContains: js.UndefOr[BotChannelName]
    var nextToken: js.UndefOr[NextToken]
  }

  object GetBotChannelAssociationsRequest {
    @inline
    def apply(
        botAlias: AliasNameOrListAll,
        botName: BotName,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nameContains: js.UndefOr[BotChannelName] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): GetBotChannelAssociationsRequest = {
      val __obj = js.Dynamic.literal(
        "botAlias" -> botAlias.asInstanceOf[js.Any],
        "botName"  -> botName.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nameContains.foreach(__v => __obj.updateDynamic("nameContains")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBotChannelAssociationsRequest]
    }
  }

  @js.native
  trait GetBotChannelAssociationsResponse extends js.Object {
    var botChannelAssociations: js.UndefOr[BotChannelAssociationList]
    var nextToken: js.UndefOr[NextToken]
  }

  object GetBotChannelAssociationsResponse {
    @inline
    def apply(
        botChannelAssociations: js.UndefOr[BotChannelAssociationList] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): GetBotChannelAssociationsResponse = {
      val __obj = js.Dynamic.literal()
      botChannelAssociations.foreach(__v => __obj.updateDynamic("botChannelAssociations")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBotChannelAssociationsResponse]
    }
  }

  @js.native
  trait GetBotRequest extends js.Object {
    var name: BotName
    var versionOrAlias: String
  }

  object GetBotRequest {
    @inline
    def apply(
        name: BotName,
        versionOrAlias: String
    ): GetBotRequest = {
      val __obj = js.Dynamic.literal(
        "name"           -> name.asInstanceOf[js.Any],
        "versionOrAlias" -> versionOrAlias.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetBotRequest]
    }
  }

  @js.native
  trait GetBotResponse extends js.Object {
    var abortStatement: js.UndefOr[Statement]
    var checksum: js.UndefOr[String]
    var childDirected: js.UndefOr[Boolean]
    var clarificationPrompt: js.UndefOr[Prompt]
    var createdDate: js.UndefOr[Timestamp]
    var description: js.UndefOr[Description]
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

  object GetBotResponse {
    @inline
    def apply(
        abortStatement: js.UndefOr[Statement] = js.undefined,
        checksum: js.UndefOr[String] = js.undefined,
        childDirected: js.UndefOr[Boolean] = js.undefined,
        clarificationPrompt: js.UndefOr[Prompt] = js.undefined,
        createdDate: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        failureReason: js.UndefOr[String] = js.undefined,
        idleSessionTTLInSeconds: js.UndefOr[SessionTTL] = js.undefined,
        intents: js.UndefOr[IntentList] = js.undefined,
        lastUpdatedDate: js.UndefOr[Timestamp] = js.undefined,
        locale: js.UndefOr[Locale] = js.undefined,
        name: js.UndefOr[BotName] = js.undefined,
        status: js.UndefOr[Status] = js.undefined,
        version: js.UndefOr[Version] = js.undefined,
        voiceId: js.UndefOr[String] = js.undefined
    ): GetBotResponse = {
      val __obj = js.Dynamic.literal()
      abortStatement.foreach(__v => __obj.updateDynamic("abortStatement")(__v.asInstanceOf[js.Any]))
      checksum.foreach(__v => __obj.updateDynamic("checksum")(__v.asInstanceOf[js.Any]))
      childDirected.foreach(__v => __obj.updateDynamic("childDirected")(__v.asInstanceOf[js.Any]))
      clarificationPrompt.foreach(__v => __obj.updateDynamic("clarificationPrompt")(__v.asInstanceOf[js.Any]))
      createdDate.foreach(__v => __obj.updateDynamic("createdDate")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      failureReason.foreach(__v => __obj.updateDynamic("failureReason")(__v.asInstanceOf[js.Any]))
      idleSessionTTLInSeconds.foreach(__v => __obj.updateDynamic("idleSessionTTLInSeconds")(__v.asInstanceOf[js.Any]))
      intents.foreach(__v => __obj.updateDynamic("intents")(__v.asInstanceOf[js.Any]))
      lastUpdatedDate.foreach(__v => __obj.updateDynamic("lastUpdatedDate")(__v.asInstanceOf[js.Any]))
      locale.foreach(__v => __obj.updateDynamic("locale")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      voiceId.foreach(__v => __obj.updateDynamic("voiceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBotResponse]
    }
  }

  @js.native
  trait GetBotVersionsRequest extends js.Object {
    var name: BotName
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object GetBotVersionsRequest {
    @inline
    def apply(
        name: BotName,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): GetBotVersionsRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBotVersionsRequest]
    }
  }

  @js.native
  trait GetBotVersionsResponse extends js.Object {
    var bots: js.UndefOr[BotMetadataList]
    var nextToken: js.UndefOr[NextToken]
  }

  object GetBotVersionsResponse {
    @inline
    def apply(
        bots: js.UndefOr[BotMetadataList] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): GetBotVersionsResponse = {
      val __obj = js.Dynamic.literal()
      bots.foreach(__v => __obj.updateDynamic("bots")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBotVersionsResponse]
    }
  }

  @js.native
  trait GetBotsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nameContains: js.UndefOr[BotName]
    var nextToken: js.UndefOr[NextToken]
  }

  object GetBotsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nameContains: js.UndefOr[BotName] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): GetBotsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nameContains.foreach(__v => __obj.updateDynamic("nameContains")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBotsRequest]
    }
  }

  @js.native
  trait GetBotsResponse extends js.Object {
    var bots: js.UndefOr[BotMetadataList]
    var nextToken: js.UndefOr[NextToken]
  }

  object GetBotsResponse {
    @inline
    def apply(
        bots: js.UndefOr[BotMetadataList] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): GetBotsResponse = {
      val __obj = js.Dynamic.literal()
      bots.foreach(__v => __obj.updateDynamic("bots")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBotsResponse]
    }
  }

  @js.native
  trait GetBuiltinIntentRequest extends js.Object {
    var signature: BuiltinIntentSignature
  }

  object GetBuiltinIntentRequest {
    @inline
    def apply(
        signature: BuiltinIntentSignature
    ): GetBuiltinIntentRequest = {
      val __obj = js.Dynamic.literal(
        "signature" -> signature.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetBuiltinIntentRequest]
    }
  }

  @js.native
  trait GetBuiltinIntentResponse extends js.Object {
    var signature: js.UndefOr[BuiltinIntentSignature]
    var slots: js.UndefOr[BuiltinIntentSlotList]
    var supportedLocales: js.UndefOr[LocaleList]
  }

  object GetBuiltinIntentResponse {
    @inline
    def apply(
        signature: js.UndefOr[BuiltinIntentSignature] = js.undefined,
        slots: js.UndefOr[BuiltinIntentSlotList] = js.undefined,
        supportedLocales: js.UndefOr[LocaleList] = js.undefined
    ): GetBuiltinIntentResponse = {
      val __obj = js.Dynamic.literal()
      signature.foreach(__v => __obj.updateDynamic("signature")(__v.asInstanceOf[js.Any]))
      slots.foreach(__v => __obj.updateDynamic("slots")(__v.asInstanceOf[js.Any]))
      supportedLocales.foreach(__v => __obj.updateDynamic("supportedLocales")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBuiltinIntentResponse]
    }
  }

  @js.native
  trait GetBuiltinIntentsRequest extends js.Object {
    var locale: js.UndefOr[Locale]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var signatureContains: js.UndefOr[String]
  }

  object GetBuiltinIntentsRequest {
    @inline
    def apply(
        locale: js.UndefOr[Locale] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        signatureContains: js.UndefOr[String] = js.undefined
    ): GetBuiltinIntentsRequest = {
      val __obj = js.Dynamic.literal()
      locale.foreach(__v => __obj.updateDynamic("locale")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      signatureContains.foreach(__v => __obj.updateDynamic("signatureContains")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBuiltinIntentsRequest]
    }
  }

  @js.native
  trait GetBuiltinIntentsResponse extends js.Object {
    var intents: js.UndefOr[BuiltinIntentMetadataList]
    var nextToken: js.UndefOr[NextToken]
  }

  object GetBuiltinIntentsResponse {
    @inline
    def apply(
        intents: js.UndefOr[BuiltinIntentMetadataList] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): GetBuiltinIntentsResponse = {
      val __obj = js.Dynamic.literal()
      intents.foreach(__v => __obj.updateDynamic("intents")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBuiltinIntentsResponse]
    }
  }

  @js.native
  trait GetBuiltinSlotTypesRequest extends js.Object {
    var locale: js.UndefOr[Locale]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var signatureContains: js.UndefOr[String]
  }

  object GetBuiltinSlotTypesRequest {
    @inline
    def apply(
        locale: js.UndefOr[Locale] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        signatureContains: js.UndefOr[String] = js.undefined
    ): GetBuiltinSlotTypesRequest = {
      val __obj = js.Dynamic.literal()
      locale.foreach(__v => __obj.updateDynamic("locale")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      signatureContains.foreach(__v => __obj.updateDynamic("signatureContains")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBuiltinSlotTypesRequest]
    }
  }

  @js.native
  trait GetBuiltinSlotTypesResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var slotTypes: js.UndefOr[BuiltinSlotTypeMetadataList]
  }

  object GetBuiltinSlotTypesResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        slotTypes: js.UndefOr[BuiltinSlotTypeMetadataList] = js.undefined
    ): GetBuiltinSlotTypesResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      slotTypes.foreach(__v => __obj.updateDynamic("slotTypes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBuiltinSlotTypesResponse]
    }
  }

  @js.native
  trait GetExportRequest extends js.Object {
    var exportType: ExportType
    var name: Name
    var resourceType: ResourceType
    var version: NumericalVersion
  }

  object GetExportRequest {
    @inline
    def apply(
        exportType: ExportType,
        name: Name,
        resourceType: ResourceType,
        version: NumericalVersion
    ): GetExportRequest = {
      val __obj = js.Dynamic.literal(
        "exportType"   -> exportType.asInstanceOf[js.Any],
        "name"         -> name.asInstanceOf[js.Any],
        "resourceType" -> resourceType.asInstanceOf[js.Any],
        "version"      -> version.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetExportRequest]
    }
  }

  @js.native
  trait GetExportResponse extends js.Object {
    var exportStatus: js.UndefOr[ExportStatus]
    var exportType: js.UndefOr[ExportType]
    var failureReason: js.UndefOr[String]
    var name: js.UndefOr[Name]
    var resourceType: js.UndefOr[ResourceType]
    var url: js.UndefOr[String]
    var version: js.UndefOr[NumericalVersion]
  }

  object GetExportResponse {
    @inline
    def apply(
        exportStatus: js.UndefOr[ExportStatus] = js.undefined,
        exportType: js.UndefOr[ExportType] = js.undefined,
        failureReason: js.UndefOr[String] = js.undefined,
        name: js.UndefOr[Name] = js.undefined,
        resourceType: js.UndefOr[ResourceType] = js.undefined,
        url: js.UndefOr[String] = js.undefined,
        version: js.UndefOr[NumericalVersion] = js.undefined
    ): GetExportResponse = {
      val __obj = js.Dynamic.literal()
      exportStatus.foreach(__v => __obj.updateDynamic("exportStatus")(__v.asInstanceOf[js.Any]))
      exportType.foreach(__v => __obj.updateDynamic("exportType")(__v.asInstanceOf[js.Any]))
      failureReason.foreach(__v => __obj.updateDynamic("failureReason")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      resourceType.foreach(__v => __obj.updateDynamic("resourceType")(__v.asInstanceOf[js.Any]))
      url.foreach(__v => __obj.updateDynamic("url")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetExportResponse]
    }
  }

  @js.native
  trait GetImportRequest extends js.Object {
    var importId: String
  }

  object GetImportRequest {
    @inline
    def apply(
        importId: String
    ): GetImportRequest = {
      val __obj = js.Dynamic.literal(
        "importId" -> importId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetImportRequest]
    }
  }

  @js.native
  trait GetImportResponse extends js.Object {
    var createdDate: js.UndefOr[Timestamp]
    var failureReason: js.UndefOr[StringList]
    var importId: js.UndefOr[String]
    var importStatus: js.UndefOr[ImportStatus]
    var mergeStrategy: js.UndefOr[MergeStrategy]
    var name: js.UndefOr[Name]
    var resourceType: js.UndefOr[ResourceType]
  }

  object GetImportResponse {
    @inline
    def apply(
        createdDate: js.UndefOr[Timestamp] = js.undefined,
        failureReason: js.UndefOr[StringList] = js.undefined,
        importId: js.UndefOr[String] = js.undefined,
        importStatus: js.UndefOr[ImportStatus] = js.undefined,
        mergeStrategy: js.UndefOr[MergeStrategy] = js.undefined,
        name: js.UndefOr[Name] = js.undefined,
        resourceType: js.UndefOr[ResourceType] = js.undefined
    ): GetImportResponse = {
      val __obj = js.Dynamic.literal()
      createdDate.foreach(__v => __obj.updateDynamic("createdDate")(__v.asInstanceOf[js.Any]))
      failureReason.foreach(__v => __obj.updateDynamic("failureReason")(__v.asInstanceOf[js.Any]))
      importId.foreach(__v => __obj.updateDynamic("importId")(__v.asInstanceOf[js.Any]))
      importStatus.foreach(__v => __obj.updateDynamic("importStatus")(__v.asInstanceOf[js.Any]))
      mergeStrategy.foreach(__v => __obj.updateDynamic("mergeStrategy")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      resourceType.foreach(__v => __obj.updateDynamic("resourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetImportResponse]
    }
  }

  @js.native
  trait GetIntentRequest extends js.Object {
    var name: IntentName
    var version: Version
  }

  object GetIntentRequest {
    @inline
    def apply(
        name: IntentName,
        version: Version
    ): GetIntentRequest = {
      val __obj = js.Dynamic.literal(
        "name"    -> name.asInstanceOf[js.Any],
        "version" -> version.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetIntentRequest]
    }
  }

  @js.native
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

  object GetIntentResponse {
    @inline
    def apply(
        checksum: js.UndefOr[String] = js.undefined,
        conclusionStatement: js.UndefOr[Statement] = js.undefined,
        confirmationPrompt: js.UndefOr[Prompt] = js.undefined,
        createdDate: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        dialogCodeHook: js.UndefOr[CodeHook] = js.undefined,
        followUpPrompt: js.UndefOr[FollowUpPrompt] = js.undefined,
        fulfillmentActivity: js.UndefOr[FulfillmentActivity] = js.undefined,
        lastUpdatedDate: js.UndefOr[Timestamp] = js.undefined,
        name: js.UndefOr[IntentName] = js.undefined,
        parentIntentSignature: js.UndefOr[BuiltinIntentSignature] = js.undefined,
        rejectionStatement: js.UndefOr[Statement] = js.undefined,
        sampleUtterances: js.UndefOr[IntentUtteranceList] = js.undefined,
        slots: js.UndefOr[SlotList] = js.undefined,
        version: js.UndefOr[Version] = js.undefined
    ): GetIntentResponse = {
      val __obj = js.Dynamic.literal()
      checksum.foreach(__v => __obj.updateDynamic("checksum")(__v.asInstanceOf[js.Any]))
      conclusionStatement.foreach(__v => __obj.updateDynamic("conclusionStatement")(__v.asInstanceOf[js.Any]))
      confirmationPrompt.foreach(__v => __obj.updateDynamic("confirmationPrompt")(__v.asInstanceOf[js.Any]))
      createdDate.foreach(__v => __obj.updateDynamic("createdDate")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      dialogCodeHook.foreach(__v => __obj.updateDynamic("dialogCodeHook")(__v.asInstanceOf[js.Any]))
      followUpPrompt.foreach(__v => __obj.updateDynamic("followUpPrompt")(__v.asInstanceOf[js.Any]))
      fulfillmentActivity.foreach(__v => __obj.updateDynamic("fulfillmentActivity")(__v.asInstanceOf[js.Any]))
      lastUpdatedDate.foreach(__v => __obj.updateDynamic("lastUpdatedDate")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      parentIntentSignature.foreach(__v => __obj.updateDynamic("parentIntentSignature")(__v.asInstanceOf[js.Any]))
      rejectionStatement.foreach(__v => __obj.updateDynamic("rejectionStatement")(__v.asInstanceOf[js.Any]))
      sampleUtterances.foreach(__v => __obj.updateDynamic("sampleUtterances")(__v.asInstanceOf[js.Any]))
      slots.foreach(__v => __obj.updateDynamic("slots")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetIntentResponse]
    }
  }

  @js.native
  trait GetIntentVersionsRequest extends js.Object {
    var name: IntentName
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object GetIntentVersionsRequest {
    @inline
    def apply(
        name: IntentName,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): GetIntentVersionsRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetIntentVersionsRequest]
    }
  }

  @js.native
  trait GetIntentVersionsResponse extends js.Object {
    var intents: js.UndefOr[IntentMetadataList]
    var nextToken: js.UndefOr[NextToken]
  }

  object GetIntentVersionsResponse {
    @inline
    def apply(
        intents: js.UndefOr[IntentMetadataList] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): GetIntentVersionsResponse = {
      val __obj = js.Dynamic.literal()
      intents.foreach(__v => __obj.updateDynamic("intents")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetIntentVersionsResponse]
    }
  }

  @js.native
  trait GetIntentsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nameContains: js.UndefOr[IntentName]
    var nextToken: js.UndefOr[NextToken]
  }

  object GetIntentsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nameContains: js.UndefOr[IntentName] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): GetIntentsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nameContains.foreach(__v => __obj.updateDynamic("nameContains")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetIntentsRequest]
    }
  }

  @js.native
  trait GetIntentsResponse extends js.Object {
    var intents: js.UndefOr[IntentMetadataList]
    var nextToken: js.UndefOr[NextToken]
  }

  object GetIntentsResponse {
    @inline
    def apply(
        intents: js.UndefOr[IntentMetadataList] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): GetIntentsResponse = {
      val __obj = js.Dynamic.literal()
      intents.foreach(__v => __obj.updateDynamic("intents")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetIntentsResponse]
    }
  }

  @js.native
  trait GetSlotTypeRequest extends js.Object {
    var name: SlotTypeName
    var version: Version
  }

  object GetSlotTypeRequest {
    @inline
    def apply(
        name: SlotTypeName,
        version: Version
    ): GetSlotTypeRequest = {
      val __obj = js.Dynamic.literal(
        "name"    -> name.asInstanceOf[js.Any],
        "version" -> version.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetSlotTypeRequest]
    }
  }

  @js.native
  trait GetSlotTypeResponse extends js.Object {
    var checksum: js.UndefOr[String]
    var createdDate: js.UndefOr[Timestamp]
    var description: js.UndefOr[Description]
    var enumerationValues: js.UndefOr[EnumerationValues]
    var lastUpdatedDate: js.UndefOr[Timestamp]
    var name: js.UndefOr[SlotTypeName]
    var valueSelectionStrategy: js.UndefOr[SlotValueSelectionStrategy]
    var version: js.UndefOr[Version]
  }

  object GetSlotTypeResponse {
    @inline
    def apply(
        checksum: js.UndefOr[String] = js.undefined,
        createdDate: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        enumerationValues: js.UndefOr[EnumerationValues] = js.undefined,
        lastUpdatedDate: js.UndefOr[Timestamp] = js.undefined,
        name: js.UndefOr[SlotTypeName] = js.undefined,
        valueSelectionStrategy: js.UndefOr[SlotValueSelectionStrategy] = js.undefined,
        version: js.UndefOr[Version] = js.undefined
    ): GetSlotTypeResponse = {
      val __obj = js.Dynamic.literal()
      checksum.foreach(__v => __obj.updateDynamic("checksum")(__v.asInstanceOf[js.Any]))
      createdDate.foreach(__v => __obj.updateDynamic("createdDate")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      enumerationValues.foreach(__v => __obj.updateDynamic("enumerationValues")(__v.asInstanceOf[js.Any]))
      lastUpdatedDate.foreach(__v => __obj.updateDynamic("lastUpdatedDate")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      valueSelectionStrategy.foreach(__v => __obj.updateDynamic("valueSelectionStrategy")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSlotTypeResponse]
    }
  }

  @js.native
  trait GetSlotTypeVersionsRequest extends js.Object {
    var name: SlotTypeName
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object GetSlotTypeVersionsRequest {
    @inline
    def apply(
        name: SlotTypeName,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): GetSlotTypeVersionsRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSlotTypeVersionsRequest]
    }
  }

  @js.native
  trait GetSlotTypeVersionsResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var slotTypes: js.UndefOr[SlotTypeMetadataList]
  }

  object GetSlotTypeVersionsResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        slotTypes: js.UndefOr[SlotTypeMetadataList] = js.undefined
    ): GetSlotTypeVersionsResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      slotTypes.foreach(__v => __obj.updateDynamic("slotTypes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSlotTypeVersionsResponse]
    }
  }

  @js.native
  trait GetSlotTypesRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nameContains: js.UndefOr[SlotTypeName]
    var nextToken: js.UndefOr[NextToken]
  }

  object GetSlotTypesRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nameContains: js.UndefOr[SlotTypeName] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): GetSlotTypesRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nameContains.foreach(__v => __obj.updateDynamic("nameContains")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSlotTypesRequest]
    }
  }

  @js.native
  trait GetSlotTypesResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var slotTypes: js.UndefOr[SlotTypeMetadataList]
  }

  object GetSlotTypesResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        slotTypes: js.UndefOr[SlotTypeMetadataList] = js.undefined
    ): GetSlotTypesResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      slotTypes.foreach(__v => __obj.updateDynamic("slotTypes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSlotTypesResponse]
    }
  }

  @js.native
  trait GetUtterancesViewRequest extends js.Object {
    var botName: BotName
    var botVersions: BotVersions
    var statusType: StatusType
  }

  object GetUtterancesViewRequest {
    @inline
    def apply(
        botName: BotName,
        botVersions: BotVersions,
        statusType: StatusType
    ): GetUtterancesViewRequest = {
      val __obj = js.Dynamic.literal(
        "botName"     -> botName.asInstanceOf[js.Any],
        "botVersions" -> botVersions.asInstanceOf[js.Any],
        "statusType"  -> statusType.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetUtterancesViewRequest]
    }
  }

  @js.native
  trait GetUtterancesViewResponse extends js.Object {
    var botName: js.UndefOr[BotName]
    var utterances: js.UndefOr[ListsOfUtterances]
  }

  object GetUtterancesViewResponse {
    @inline
    def apply(
        botName: js.UndefOr[BotName] = js.undefined,
        utterances: js.UndefOr[ListsOfUtterances] = js.undefined
    ): GetUtterancesViewResponse = {
      val __obj = js.Dynamic.literal()
      botName.foreach(__v => __obj.updateDynamic("botName")(__v.asInstanceOf[js.Any]))
      utterances.foreach(__v => __obj.updateDynamic("utterances")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetUtterancesViewResponse]
    }
  }

  object ImportStatusEnum {
    val IN_PROGRESS = "IN_PROGRESS"
    val COMPLETE    = "COMPLETE"
    val FAILED      = "FAILED"

    val values = js.Object.freeze(js.Array(IN_PROGRESS, COMPLETE, FAILED))
  }

  /**
    * Identifies the specific version of an intent.
    */
  @js.native
  trait Intent extends js.Object {
    var intentName: IntentName
    var intentVersion: Version
  }

  object Intent {
    @inline
    def apply(
        intentName: IntentName,
        intentVersion: Version
    ): Intent = {
      val __obj = js.Dynamic.literal(
        "intentName"    -> intentName.asInstanceOf[js.Any],
        "intentVersion" -> intentVersion.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Intent]
    }
  }

  /**
    * Provides information about an intent.
    */
  @js.native
  trait IntentMetadata extends js.Object {
    var createdDate: js.UndefOr[Timestamp]
    var description: js.UndefOr[Description]
    var lastUpdatedDate: js.UndefOr[Timestamp]
    var name: js.UndefOr[IntentName]
    var version: js.UndefOr[Version]
  }

  object IntentMetadata {
    @inline
    def apply(
        createdDate: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        lastUpdatedDate: js.UndefOr[Timestamp] = js.undefined,
        name: js.UndefOr[IntentName] = js.undefined,
        version: js.UndefOr[Version] = js.undefined
    ): IntentMetadata = {
      val __obj = js.Dynamic.literal()
      createdDate.foreach(__v => __obj.updateDynamic("createdDate")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      lastUpdatedDate.foreach(__v => __obj.updateDynamic("lastUpdatedDate")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IntentMetadata]
    }
  }

  object LocaleEnum {
    val `en-US` = "en-US"
    val `en-GB` = "en-GB"
    val `de-DE` = "de-DE"

    val values = js.Object.freeze(js.Array(`en-US`, `en-GB`, `de-DE`))
  }

  object MergeStrategyEnum {
    val OVERWRITE_LATEST = "OVERWRITE_LATEST"
    val FAIL_ON_CONFLICT = "FAIL_ON_CONFLICT"

    val values = js.Object.freeze(js.Array(OVERWRITE_LATEST, FAIL_ON_CONFLICT))
  }

  /**
    * The message object that provides the message text and its type.
    */
  @js.native
  trait Message extends js.Object {
    var content: ContentString
    var contentType: ContentType
    var groupNumber: js.UndefOr[GroupNumber]
  }

  object Message {
    @inline
    def apply(
        content: ContentString,
        contentType: ContentType,
        groupNumber: js.UndefOr[GroupNumber] = js.undefined
    ): Message = {
      val __obj = js.Dynamic.literal(
        "content"     -> content.asInstanceOf[js.Any],
        "contentType" -> contentType.asInstanceOf[js.Any]
      )

      groupNumber.foreach(__v => __obj.updateDynamic("groupNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Message]
    }
  }

  object ProcessBehaviorEnum {
    val SAVE  = "SAVE"
    val BUILD = "BUILD"

    val values = js.Object.freeze(js.Array(SAVE, BUILD))
  }

  /**
    * Obtains information from the user. To define a prompt, provide one or more messages and specify the number of attempts to get information from the user. If you provide more than one message, Amazon Lex chooses one of the messages to use to prompt the user. For more information, see <a>how-it-works</a>.
    */
  @js.native
  trait Prompt extends js.Object {
    var maxAttempts: PromptMaxAttempts
    var messages: MessageList
    var responseCard: js.UndefOr[ResponseCard]
  }

  object Prompt {
    @inline
    def apply(
        maxAttempts: PromptMaxAttempts,
        messages: MessageList,
        responseCard: js.UndefOr[ResponseCard] = js.undefined
    ): Prompt = {
      val __obj = js.Dynamic.literal(
        "maxAttempts" -> maxAttempts.asInstanceOf[js.Any],
        "messages"    -> messages.asInstanceOf[js.Any]
      )

      responseCard.foreach(__v => __obj.updateDynamic("responseCard")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Prompt]
    }
  }

  @js.native
  trait PutBotAliasRequest extends js.Object {
    var botName: BotName
    var botVersion: Version
    var name: AliasName
    var checksum: js.UndefOr[String]
    var description: js.UndefOr[Description]
  }

  object PutBotAliasRequest {
    @inline
    def apply(
        botName: BotName,
        botVersion: Version,
        name: AliasName,
        checksum: js.UndefOr[String] = js.undefined,
        description: js.UndefOr[Description] = js.undefined
    ): PutBotAliasRequest = {
      val __obj = js.Dynamic.literal(
        "botName"    -> botName.asInstanceOf[js.Any],
        "botVersion" -> botVersion.asInstanceOf[js.Any],
        "name"       -> name.asInstanceOf[js.Any]
      )

      checksum.foreach(__v => __obj.updateDynamic("checksum")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutBotAliasRequest]
    }
  }

  @js.native
  trait PutBotAliasResponse extends js.Object {
    var botName: js.UndefOr[BotName]
    var botVersion: js.UndefOr[Version]
    var checksum: js.UndefOr[String]
    var createdDate: js.UndefOr[Timestamp]
    var description: js.UndefOr[Description]
    var lastUpdatedDate: js.UndefOr[Timestamp]
    var name: js.UndefOr[AliasName]
  }

  object PutBotAliasResponse {
    @inline
    def apply(
        botName: js.UndefOr[BotName] = js.undefined,
        botVersion: js.UndefOr[Version] = js.undefined,
        checksum: js.UndefOr[String] = js.undefined,
        createdDate: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        lastUpdatedDate: js.UndefOr[Timestamp] = js.undefined,
        name: js.UndefOr[AliasName] = js.undefined
    ): PutBotAliasResponse = {
      val __obj = js.Dynamic.literal()
      botName.foreach(__v => __obj.updateDynamic("botName")(__v.asInstanceOf[js.Any]))
      botVersion.foreach(__v => __obj.updateDynamic("botVersion")(__v.asInstanceOf[js.Any]))
      checksum.foreach(__v => __obj.updateDynamic("checksum")(__v.asInstanceOf[js.Any]))
      createdDate.foreach(__v => __obj.updateDynamic("createdDate")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      lastUpdatedDate.foreach(__v => __obj.updateDynamic("lastUpdatedDate")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutBotAliasResponse]
    }
  }

  @js.native
  trait PutBotRequest extends js.Object {
    var childDirected: Boolean
    var locale: Locale
    var name: BotName
    var abortStatement: js.UndefOr[Statement]
    var checksum: js.UndefOr[String]
    var clarificationPrompt: js.UndefOr[Prompt]
    var createVersion: js.UndefOr[Boolean]
    var description: js.UndefOr[Description]
    var idleSessionTTLInSeconds: js.UndefOr[SessionTTL]
    var intents: js.UndefOr[IntentList]
    var processBehavior: js.UndefOr[ProcessBehavior]
    var voiceId: js.UndefOr[String]
  }

  object PutBotRequest {
    @inline
    def apply(
        childDirected: Boolean,
        locale: Locale,
        name: BotName,
        abortStatement: js.UndefOr[Statement] = js.undefined,
        checksum: js.UndefOr[String] = js.undefined,
        clarificationPrompt: js.UndefOr[Prompt] = js.undefined,
        createVersion: js.UndefOr[Boolean] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        idleSessionTTLInSeconds: js.UndefOr[SessionTTL] = js.undefined,
        intents: js.UndefOr[IntentList] = js.undefined,
        processBehavior: js.UndefOr[ProcessBehavior] = js.undefined,
        voiceId: js.UndefOr[String] = js.undefined
    ): PutBotRequest = {
      val __obj = js.Dynamic.literal(
        "childDirected" -> childDirected.asInstanceOf[js.Any],
        "locale"        -> locale.asInstanceOf[js.Any],
        "name"          -> name.asInstanceOf[js.Any]
      )

      abortStatement.foreach(__v => __obj.updateDynamic("abortStatement")(__v.asInstanceOf[js.Any]))
      checksum.foreach(__v => __obj.updateDynamic("checksum")(__v.asInstanceOf[js.Any]))
      clarificationPrompt.foreach(__v => __obj.updateDynamic("clarificationPrompt")(__v.asInstanceOf[js.Any]))
      createVersion.foreach(__v => __obj.updateDynamic("createVersion")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      idleSessionTTLInSeconds.foreach(__v => __obj.updateDynamic("idleSessionTTLInSeconds")(__v.asInstanceOf[js.Any]))
      intents.foreach(__v => __obj.updateDynamic("intents")(__v.asInstanceOf[js.Any]))
      processBehavior.foreach(__v => __obj.updateDynamic("processBehavior")(__v.asInstanceOf[js.Any]))
      voiceId.foreach(__v => __obj.updateDynamic("voiceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutBotRequest]
    }
  }

  @js.native
  trait PutBotResponse extends js.Object {
    var abortStatement: js.UndefOr[Statement]
    var checksum: js.UndefOr[String]
    var childDirected: js.UndefOr[Boolean]
    var clarificationPrompt: js.UndefOr[Prompt]
    var createVersion: js.UndefOr[Boolean]
    var createdDate: js.UndefOr[Timestamp]
    var description: js.UndefOr[Description]
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

  object PutBotResponse {
    @inline
    def apply(
        abortStatement: js.UndefOr[Statement] = js.undefined,
        checksum: js.UndefOr[String] = js.undefined,
        childDirected: js.UndefOr[Boolean] = js.undefined,
        clarificationPrompt: js.UndefOr[Prompt] = js.undefined,
        createVersion: js.UndefOr[Boolean] = js.undefined,
        createdDate: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        failureReason: js.UndefOr[String] = js.undefined,
        idleSessionTTLInSeconds: js.UndefOr[SessionTTL] = js.undefined,
        intents: js.UndefOr[IntentList] = js.undefined,
        lastUpdatedDate: js.UndefOr[Timestamp] = js.undefined,
        locale: js.UndefOr[Locale] = js.undefined,
        name: js.UndefOr[BotName] = js.undefined,
        status: js.UndefOr[Status] = js.undefined,
        version: js.UndefOr[Version] = js.undefined,
        voiceId: js.UndefOr[String] = js.undefined
    ): PutBotResponse = {
      val __obj = js.Dynamic.literal()
      abortStatement.foreach(__v => __obj.updateDynamic("abortStatement")(__v.asInstanceOf[js.Any]))
      checksum.foreach(__v => __obj.updateDynamic("checksum")(__v.asInstanceOf[js.Any]))
      childDirected.foreach(__v => __obj.updateDynamic("childDirected")(__v.asInstanceOf[js.Any]))
      clarificationPrompt.foreach(__v => __obj.updateDynamic("clarificationPrompt")(__v.asInstanceOf[js.Any]))
      createVersion.foreach(__v => __obj.updateDynamic("createVersion")(__v.asInstanceOf[js.Any]))
      createdDate.foreach(__v => __obj.updateDynamic("createdDate")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      failureReason.foreach(__v => __obj.updateDynamic("failureReason")(__v.asInstanceOf[js.Any]))
      idleSessionTTLInSeconds.foreach(__v => __obj.updateDynamic("idleSessionTTLInSeconds")(__v.asInstanceOf[js.Any]))
      intents.foreach(__v => __obj.updateDynamic("intents")(__v.asInstanceOf[js.Any]))
      lastUpdatedDate.foreach(__v => __obj.updateDynamic("lastUpdatedDate")(__v.asInstanceOf[js.Any]))
      locale.foreach(__v => __obj.updateDynamic("locale")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      voiceId.foreach(__v => __obj.updateDynamic("voiceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutBotResponse]
    }
  }

  @js.native
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

  object PutIntentRequest {
    @inline
    def apply(
        name: IntentName,
        checksum: js.UndefOr[String] = js.undefined,
        conclusionStatement: js.UndefOr[Statement] = js.undefined,
        confirmationPrompt: js.UndefOr[Prompt] = js.undefined,
        createVersion: js.UndefOr[Boolean] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        dialogCodeHook: js.UndefOr[CodeHook] = js.undefined,
        followUpPrompt: js.UndefOr[FollowUpPrompt] = js.undefined,
        fulfillmentActivity: js.UndefOr[FulfillmentActivity] = js.undefined,
        parentIntentSignature: js.UndefOr[BuiltinIntentSignature] = js.undefined,
        rejectionStatement: js.UndefOr[Statement] = js.undefined,
        sampleUtterances: js.UndefOr[IntentUtteranceList] = js.undefined,
        slots: js.UndefOr[SlotList] = js.undefined
    ): PutIntentRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      checksum.foreach(__v => __obj.updateDynamic("checksum")(__v.asInstanceOf[js.Any]))
      conclusionStatement.foreach(__v => __obj.updateDynamic("conclusionStatement")(__v.asInstanceOf[js.Any]))
      confirmationPrompt.foreach(__v => __obj.updateDynamic("confirmationPrompt")(__v.asInstanceOf[js.Any]))
      createVersion.foreach(__v => __obj.updateDynamic("createVersion")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      dialogCodeHook.foreach(__v => __obj.updateDynamic("dialogCodeHook")(__v.asInstanceOf[js.Any]))
      followUpPrompt.foreach(__v => __obj.updateDynamic("followUpPrompt")(__v.asInstanceOf[js.Any]))
      fulfillmentActivity.foreach(__v => __obj.updateDynamic("fulfillmentActivity")(__v.asInstanceOf[js.Any]))
      parentIntentSignature.foreach(__v => __obj.updateDynamic("parentIntentSignature")(__v.asInstanceOf[js.Any]))
      rejectionStatement.foreach(__v => __obj.updateDynamic("rejectionStatement")(__v.asInstanceOf[js.Any]))
      sampleUtterances.foreach(__v => __obj.updateDynamic("sampleUtterances")(__v.asInstanceOf[js.Any]))
      slots.foreach(__v => __obj.updateDynamic("slots")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutIntentRequest]
    }
  }

  @js.native
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

  object PutIntentResponse {
    @inline
    def apply(
        checksum: js.UndefOr[String] = js.undefined,
        conclusionStatement: js.UndefOr[Statement] = js.undefined,
        confirmationPrompt: js.UndefOr[Prompt] = js.undefined,
        createVersion: js.UndefOr[Boolean] = js.undefined,
        createdDate: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        dialogCodeHook: js.UndefOr[CodeHook] = js.undefined,
        followUpPrompt: js.UndefOr[FollowUpPrompt] = js.undefined,
        fulfillmentActivity: js.UndefOr[FulfillmentActivity] = js.undefined,
        lastUpdatedDate: js.UndefOr[Timestamp] = js.undefined,
        name: js.UndefOr[IntentName] = js.undefined,
        parentIntentSignature: js.UndefOr[BuiltinIntentSignature] = js.undefined,
        rejectionStatement: js.UndefOr[Statement] = js.undefined,
        sampleUtterances: js.UndefOr[IntentUtteranceList] = js.undefined,
        slots: js.UndefOr[SlotList] = js.undefined,
        version: js.UndefOr[Version] = js.undefined
    ): PutIntentResponse = {
      val __obj = js.Dynamic.literal()
      checksum.foreach(__v => __obj.updateDynamic("checksum")(__v.asInstanceOf[js.Any]))
      conclusionStatement.foreach(__v => __obj.updateDynamic("conclusionStatement")(__v.asInstanceOf[js.Any]))
      confirmationPrompt.foreach(__v => __obj.updateDynamic("confirmationPrompt")(__v.asInstanceOf[js.Any]))
      createVersion.foreach(__v => __obj.updateDynamic("createVersion")(__v.asInstanceOf[js.Any]))
      createdDate.foreach(__v => __obj.updateDynamic("createdDate")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      dialogCodeHook.foreach(__v => __obj.updateDynamic("dialogCodeHook")(__v.asInstanceOf[js.Any]))
      followUpPrompt.foreach(__v => __obj.updateDynamic("followUpPrompt")(__v.asInstanceOf[js.Any]))
      fulfillmentActivity.foreach(__v => __obj.updateDynamic("fulfillmentActivity")(__v.asInstanceOf[js.Any]))
      lastUpdatedDate.foreach(__v => __obj.updateDynamic("lastUpdatedDate")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      parentIntentSignature.foreach(__v => __obj.updateDynamic("parentIntentSignature")(__v.asInstanceOf[js.Any]))
      rejectionStatement.foreach(__v => __obj.updateDynamic("rejectionStatement")(__v.asInstanceOf[js.Any]))
      sampleUtterances.foreach(__v => __obj.updateDynamic("sampleUtterances")(__v.asInstanceOf[js.Any]))
      slots.foreach(__v => __obj.updateDynamic("slots")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutIntentResponse]
    }
  }

  @js.native
  trait PutSlotTypeRequest extends js.Object {
    var name: SlotTypeName
    var checksum: js.UndefOr[String]
    var createVersion: js.UndefOr[Boolean]
    var description: js.UndefOr[Description]
    var enumerationValues: js.UndefOr[EnumerationValues]
    var valueSelectionStrategy: js.UndefOr[SlotValueSelectionStrategy]
  }

  object PutSlotTypeRequest {
    @inline
    def apply(
        name: SlotTypeName,
        checksum: js.UndefOr[String] = js.undefined,
        createVersion: js.UndefOr[Boolean] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        enumerationValues: js.UndefOr[EnumerationValues] = js.undefined,
        valueSelectionStrategy: js.UndefOr[SlotValueSelectionStrategy] = js.undefined
    ): PutSlotTypeRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      checksum.foreach(__v => __obj.updateDynamic("checksum")(__v.asInstanceOf[js.Any]))
      createVersion.foreach(__v => __obj.updateDynamic("createVersion")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      enumerationValues.foreach(__v => __obj.updateDynamic("enumerationValues")(__v.asInstanceOf[js.Any]))
      valueSelectionStrategy.foreach(__v => __obj.updateDynamic("valueSelectionStrategy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutSlotTypeRequest]
    }
  }

  @js.native
  trait PutSlotTypeResponse extends js.Object {
    var checksum: js.UndefOr[String]
    var createVersion: js.UndefOr[Boolean]
    var createdDate: js.UndefOr[Timestamp]
    var description: js.UndefOr[Description]
    var enumerationValues: js.UndefOr[EnumerationValues]
    var lastUpdatedDate: js.UndefOr[Timestamp]
    var name: js.UndefOr[SlotTypeName]
    var valueSelectionStrategy: js.UndefOr[SlotValueSelectionStrategy]
    var version: js.UndefOr[Version]
  }

  object PutSlotTypeResponse {
    @inline
    def apply(
        checksum: js.UndefOr[String] = js.undefined,
        createVersion: js.UndefOr[Boolean] = js.undefined,
        createdDate: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        enumerationValues: js.UndefOr[EnumerationValues] = js.undefined,
        lastUpdatedDate: js.UndefOr[Timestamp] = js.undefined,
        name: js.UndefOr[SlotTypeName] = js.undefined,
        valueSelectionStrategy: js.UndefOr[SlotValueSelectionStrategy] = js.undefined,
        version: js.UndefOr[Version] = js.undefined
    ): PutSlotTypeResponse = {
      val __obj = js.Dynamic.literal()
      checksum.foreach(__v => __obj.updateDynamic("checksum")(__v.asInstanceOf[js.Any]))
      createVersion.foreach(__v => __obj.updateDynamic("createVersion")(__v.asInstanceOf[js.Any]))
      createdDate.foreach(__v => __obj.updateDynamic("createdDate")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      enumerationValues.foreach(__v => __obj.updateDynamic("enumerationValues")(__v.asInstanceOf[js.Any]))
      lastUpdatedDate.foreach(__v => __obj.updateDynamic("lastUpdatedDate")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      valueSelectionStrategy.foreach(__v => __obj.updateDynamic("valueSelectionStrategy")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutSlotTypeResponse]
    }
  }

  object ResourceTypeEnum {
    val BOT       = "BOT"
    val INTENT    = "INTENT"
    val SLOT_TYPE = "SLOT_TYPE"

    val values = js.Object.freeze(js.Array(BOT, INTENT, SLOT_TYPE))
  }

  /**
    * Identifies the version of a specific slot.
    */
  @js.native
  trait Slot extends js.Object {
    var name: SlotName
    var slotConstraint: SlotConstraint
    var description: js.UndefOr[Description]
    var priority: js.UndefOr[Priority]
    var responseCard: js.UndefOr[ResponseCard]
    var sampleUtterances: js.UndefOr[SlotUtteranceList]
    var slotType: js.UndefOr[CustomOrBuiltinSlotTypeName]
    var slotTypeVersion: js.UndefOr[Version]
    var valueElicitationPrompt: js.UndefOr[Prompt]
  }

  object Slot {
    @inline
    def apply(
        name: SlotName,
        slotConstraint: SlotConstraint,
        description: js.UndefOr[Description] = js.undefined,
        priority: js.UndefOr[Priority] = js.undefined,
        responseCard: js.UndefOr[ResponseCard] = js.undefined,
        sampleUtterances: js.UndefOr[SlotUtteranceList] = js.undefined,
        slotType: js.UndefOr[CustomOrBuiltinSlotTypeName] = js.undefined,
        slotTypeVersion: js.UndefOr[Version] = js.undefined,
        valueElicitationPrompt: js.UndefOr[Prompt] = js.undefined
    ): Slot = {
      val __obj = js.Dynamic.literal(
        "name"           -> name.asInstanceOf[js.Any],
        "slotConstraint" -> slotConstraint.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      priority.foreach(__v => __obj.updateDynamic("priority")(__v.asInstanceOf[js.Any]))
      responseCard.foreach(__v => __obj.updateDynamic("responseCard")(__v.asInstanceOf[js.Any]))
      sampleUtterances.foreach(__v => __obj.updateDynamic("sampleUtterances")(__v.asInstanceOf[js.Any]))
      slotType.foreach(__v => __obj.updateDynamic("slotType")(__v.asInstanceOf[js.Any]))
      slotTypeVersion.foreach(__v => __obj.updateDynamic("slotTypeVersion")(__v.asInstanceOf[js.Any]))
      valueElicitationPrompt.foreach(__v => __obj.updateDynamic("valueElicitationPrompt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Slot]
    }
  }

  object SlotConstraintEnum {
    val Required = "Required"
    val Optional = "Optional"

    val values = js.Object.freeze(js.Array(Required, Optional))
  }

  /**
    * Provides information about a slot type..
    */
  @js.native
  trait SlotTypeMetadata extends js.Object {
    var createdDate: js.UndefOr[Timestamp]
    var description: js.UndefOr[Description]
    var lastUpdatedDate: js.UndefOr[Timestamp]
    var name: js.UndefOr[SlotTypeName]
    var version: js.UndefOr[Version]
  }

  object SlotTypeMetadata {
    @inline
    def apply(
        createdDate: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        lastUpdatedDate: js.UndefOr[Timestamp] = js.undefined,
        name: js.UndefOr[SlotTypeName] = js.undefined,
        version: js.UndefOr[Version] = js.undefined
    ): SlotTypeMetadata = {
      val __obj = js.Dynamic.literal()
      createdDate.foreach(__v => __obj.updateDynamic("createdDate")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      lastUpdatedDate.foreach(__v => __obj.updateDynamic("lastUpdatedDate")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SlotTypeMetadata]
    }
  }

  object SlotValueSelectionStrategyEnum {
    val ORIGINAL_VALUE = "ORIGINAL_VALUE"
    val TOP_RESOLUTION = "TOP_RESOLUTION"

    val values = js.Object.freeze(js.Array(ORIGINAL_VALUE, TOP_RESOLUTION))
  }

  @js.native
  trait StartImportRequest extends js.Object {
    var mergeStrategy: MergeStrategy
    var payload: Blob
    var resourceType: ResourceType
  }

  object StartImportRequest {
    @inline
    def apply(
        mergeStrategy: MergeStrategy,
        payload: Blob,
        resourceType: ResourceType
    ): StartImportRequest = {
      val __obj = js.Dynamic.literal(
        "mergeStrategy" -> mergeStrategy.asInstanceOf[js.Any],
        "payload"       -> payload.asInstanceOf[js.Any],
        "resourceType"  -> resourceType.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StartImportRequest]
    }
  }

  @js.native
  trait StartImportResponse extends js.Object {
    var createdDate: js.UndefOr[Timestamp]
    var importId: js.UndefOr[String]
    var importStatus: js.UndefOr[ImportStatus]
    var mergeStrategy: js.UndefOr[MergeStrategy]
    var name: js.UndefOr[Name]
    var resourceType: js.UndefOr[ResourceType]
  }

  object StartImportResponse {
    @inline
    def apply(
        createdDate: js.UndefOr[Timestamp] = js.undefined,
        importId: js.UndefOr[String] = js.undefined,
        importStatus: js.UndefOr[ImportStatus] = js.undefined,
        mergeStrategy: js.UndefOr[MergeStrategy] = js.undefined,
        name: js.UndefOr[Name] = js.undefined,
        resourceType: js.UndefOr[ResourceType] = js.undefined
    ): StartImportResponse = {
      val __obj = js.Dynamic.literal()
      createdDate.foreach(__v => __obj.updateDynamic("createdDate")(__v.asInstanceOf[js.Any]))
      importId.foreach(__v => __obj.updateDynamic("importId")(__v.asInstanceOf[js.Any]))
      importStatus.foreach(__v => __obj.updateDynamic("importStatus")(__v.asInstanceOf[js.Any]))
      mergeStrategy.foreach(__v => __obj.updateDynamic("mergeStrategy")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      resourceType.foreach(__v => __obj.updateDynamic("resourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartImportResponse]
    }
  }

  /**
    * A collection of messages that convey information to the user. At runtime, Amazon Lex selects the message to convey.
    */
  @js.native
  trait Statement extends js.Object {
    var messages: MessageList
    var responseCard: js.UndefOr[ResponseCard]
  }

  object Statement {
    @inline
    def apply(
        messages: MessageList,
        responseCard: js.UndefOr[ResponseCard] = js.undefined
    ): Statement = {
      val __obj = js.Dynamic.literal(
        "messages" -> messages.asInstanceOf[js.Any]
      )

      responseCard.foreach(__v => __obj.updateDynamic("responseCard")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Statement]
    }
  }

  object StatusEnum {
    val BUILDING            = "BUILDING"
    val READY               = "READY"
    val READY_BASIC_TESTING = "READY_BASIC_TESTING"
    val FAILED              = "FAILED"
    val NOT_BUILT           = "NOT_BUILT"

    val values = js.Object.freeze(js.Array(BUILDING, READY, READY_BASIC_TESTING, FAILED, NOT_BUILT))
  }

  object StatusTypeEnum {
    val Detected = "Detected"
    val Missed   = "Missed"

    val values = js.Object.freeze(js.Array(Detected, Missed))
  }

  /**
    * Provides information about a single utterance that was made to your bot.
    */
  @js.native
  trait UtteranceData extends js.Object {
    var count: js.UndefOr[Count]
    var distinctUsers: js.UndefOr[Count]
    var firstUtteredDate: js.UndefOr[Timestamp]
    var lastUtteredDate: js.UndefOr[Timestamp]
    var utteranceString: js.UndefOr[UtteranceString]
  }

  object UtteranceData {
    @inline
    def apply(
        count: js.UndefOr[Count] = js.undefined,
        distinctUsers: js.UndefOr[Count] = js.undefined,
        firstUtteredDate: js.UndefOr[Timestamp] = js.undefined,
        lastUtteredDate: js.UndefOr[Timestamp] = js.undefined,
        utteranceString: js.UndefOr[UtteranceString] = js.undefined
    ): UtteranceData = {
      val __obj = js.Dynamic.literal()
      count.foreach(__v => __obj.updateDynamic("count")(__v.asInstanceOf[js.Any]))
      distinctUsers.foreach(__v => __obj.updateDynamic("distinctUsers")(__v.asInstanceOf[js.Any]))
      firstUtteredDate.foreach(__v => __obj.updateDynamic("firstUtteredDate")(__v.asInstanceOf[js.Any]))
      lastUtteredDate.foreach(__v => __obj.updateDynamic("lastUtteredDate")(__v.asInstanceOf[js.Any]))
      utteranceString.foreach(__v => __obj.updateDynamic("utteranceString")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UtteranceData]
    }
  }

  /**
    * Provides a list of utterances that have been made to a specific version of your bot. The list contains a maximum of 100 utterances.
    */
  @js.native
  trait UtteranceList extends js.Object {
    var botVersion: js.UndefOr[Version]
    var utterances: js.UndefOr[ListOfUtterance]
  }

  object UtteranceList {
    @inline
    def apply(
        botVersion: js.UndefOr[Version] = js.undefined,
        utterances: js.UndefOr[ListOfUtterance] = js.undefined
    ): UtteranceList = {
      val __obj = js.Dynamic.literal()
      botVersion.foreach(__v => __obj.updateDynamic("botVersion")(__v.asInstanceOf[js.Any]))
      utterances.foreach(__v => __obj.updateDynamic("utterances")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UtteranceList]
    }
  }
}
