package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object lexmodelsv2 {
  type AmazonResourceName = String
  type AttachmentTitle = String
  type AttachmentUrl = String
  type AudioLogSettingsList = js.Array[AudioLogSetting]
  type BotAliasHistoryEventsList = js.Array[BotAliasHistoryEvent]
  type BotAliasId = String
  type BotAliasLocaleSettingsMap = js.Dictionary[BotAliasLocaleSettings]
  type BotAliasSummaryList = js.Array[BotAliasSummary]
  type BotFilters = js.Array[BotFilter]
  type BotLocaleFilters = js.Array[BotLocaleFilter]
  type BotLocaleHistoryEventDescription = String
  type BotLocaleHistoryEventsList = js.Array[BotLocaleHistoryEvent]
  type BotLocaleSummaryList = js.Array[BotLocaleSummary]
  type BotSummaryList = js.Array[BotSummary]
  type BotVersion = String
  type BotVersionLocaleSpecification = js.Dictionary[BotVersionLocaleDetails]
  type BotVersionSummaryList = js.Array[BotVersionSummary]
  type BoxedBoolean = Boolean
  type BuiltInIntentSummaryList = js.Array[BuiltInIntentSummary]
  type BuiltInOrCustomSlotTypeId = String
  type BuiltInSlotTypeSummaryList = js.Array[BuiltInSlotTypeSummary]
  type BuiltInsMaxResults = Int
  type ButtonText = String
  type ButtonValue = String
  type ButtonsList = js.Array[Button]
  type ChildDirected = Boolean
  type CloudWatchLogGroupArn = String
  type CodeHookInterfaceVersion = String
  type ConfidenceThreshold = Double
  type ContextTimeToLiveInSeconds = Int
  type ContextTurnsToLive = Int
  type CustomPayloadValue = String
  type Description = String
  type DraftBotVersion = String
  type FailureReason = String
  type FailureReasons = js.Array[FailureReason]
  type FilterValue = String
  type FilterValues = js.Array[FilterValue]
  type Id = String
  type InputContextsList = js.Array[InputContext]
  type IntentFilters = js.Array[IntentFilter]
  type IntentSignature = String
  type IntentSummaryList = js.Array[IntentSummary]
  type KendraIndexArn = String
  type KmsKeyArn = String
  type LambdaARN = String
  type LocaleId = String
  type LocaleName = String
  type LogPrefix = String
  type MaxResults = Int
  type MessageGroupsList = js.Array[MessageGroup]
  type MessageVariationsList = js.Array[Message]
  type Name = String
  type NextToken = String
  type NumericalBotVersion = String
  type OutputContextsList = js.Array[OutputContext]
  type PlainTextMessageValue = String
  type PriorityValue = Int
  type PromptMaxRetries = Int
  type QueryFilterString = String
  type RegexPattern = String
  type ResourceCount = Int
  type RoleArn = String
  type S3BucketArn = String
  type SSMLMessageValue = String
  type SampleUtterancesList = js.Array[SampleUtterance]
  type SessionTTL = Int
  type SkipResourceInUseCheck = Boolean
  type SlotDefaultValueList = js.Array[SlotDefaultValue]
  type SlotDefaultValueString = String
  type SlotFilters = js.Array[SlotFilter]
  type SlotPrioritiesList = js.Array[SlotPriority]
  type SlotSummaryList = js.Array[SlotSummary]
  type SlotTypeFilters = js.Array[SlotTypeFilter]
  type SlotTypeSignature = String
  type SlotTypeSummaryList = js.Array[SlotTypeSummary]
  type SlotTypeValues = js.Array[SlotTypeValue]
  type StillWaitingResponseFrequency = Int
  type StillWaitingResponseTimeout = Int
  type SynonymList = js.Array[SampleValue]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagMap = js.Dictionary[TagValue]
  type TagValue = String
  type TextLogSettingsList = js.Array[TextLogSetting]
  type Timestamp = js.Date
  type Utterance = String
  type Value = String
  type VoiceId = String

  final class LexModelsV2Ops(private val service: LexModelsV2) extends AnyVal {

    @inline def buildBotLocaleFuture(params: BuildBotLocaleRequest): Future[BuildBotLocaleResponse] = service.buildBotLocale(params).promise().toFuture
    @inline def createBotAliasFuture(params: CreateBotAliasRequest): Future[CreateBotAliasResponse] = service.createBotAlias(params).promise().toFuture
    @inline def createBotFuture(params: CreateBotRequest): Future[CreateBotResponse] = service.createBot(params).promise().toFuture
    @inline def createBotLocaleFuture(params: CreateBotLocaleRequest): Future[CreateBotLocaleResponse] = service.createBotLocale(params).promise().toFuture
    @inline def createBotVersionFuture(params: CreateBotVersionRequest): Future[CreateBotVersionResponse] = service.createBotVersion(params).promise().toFuture
    @inline def createIntentFuture(params: CreateIntentRequest): Future[CreateIntentResponse] = service.createIntent(params).promise().toFuture
    @inline def createSlotFuture(params: CreateSlotRequest): Future[CreateSlotResponse] = service.createSlot(params).promise().toFuture
    @inline def createSlotTypeFuture(params: CreateSlotTypeRequest): Future[CreateSlotTypeResponse] = service.createSlotType(params).promise().toFuture
    @inline def deleteBotAliasFuture(params: DeleteBotAliasRequest): Future[DeleteBotAliasResponse] = service.deleteBotAlias(params).promise().toFuture
    @inline def deleteBotFuture(params: DeleteBotRequest): Future[DeleteBotResponse] = service.deleteBot(params).promise().toFuture
    @inline def deleteBotLocaleFuture(params: DeleteBotLocaleRequest): Future[DeleteBotLocaleResponse] = service.deleteBotLocale(params).promise().toFuture
    @inline def deleteBotVersionFuture(params: DeleteBotVersionRequest): Future[DeleteBotVersionResponse] = service.deleteBotVersion(params).promise().toFuture
    @inline def deleteIntentFuture(params: DeleteIntentRequest): Future[js.Object] = service.deleteIntent(params).promise().toFuture
    @inline def deleteSlotFuture(params: DeleteSlotRequest): Future[js.Object] = service.deleteSlot(params).promise().toFuture
    @inline def deleteSlotTypeFuture(params: DeleteSlotTypeRequest): Future[js.Object] = service.deleteSlotType(params).promise().toFuture
    @inline def describeBotAliasFuture(params: DescribeBotAliasRequest): Future[DescribeBotAliasResponse] = service.describeBotAlias(params).promise().toFuture
    @inline def describeBotFuture(params: DescribeBotRequest): Future[DescribeBotResponse] = service.describeBot(params).promise().toFuture
    @inline def describeBotLocaleFuture(params: DescribeBotLocaleRequest): Future[DescribeBotLocaleResponse] = service.describeBotLocale(params).promise().toFuture
    @inline def describeBotVersionFuture(params: DescribeBotVersionRequest): Future[DescribeBotVersionResponse] = service.describeBotVersion(params).promise().toFuture
    @inline def describeIntentFuture(params: DescribeIntentRequest): Future[DescribeIntentResponse] = service.describeIntent(params).promise().toFuture
    @inline def describeSlotFuture(params: DescribeSlotRequest): Future[DescribeSlotResponse] = service.describeSlot(params).promise().toFuture
    @inline def describeSlotTypeFuture(params: DescribeSlotTypeRequest): Future[DescribeSlotTypeResponse] = service.describeSlotType(params).promise().toFuture
    @inline def listBotAliasesFuture(params: ListBotAliasesRequest): Future[ListBotAliasesResponse] = service.listBotAliases(params).promise().toFuture
    @inline def listBotLocalesFuture(params: ListBotLocalesRequest): Future[ListBotLocalesResponse] = service.listBotLocales(params).promise().toFuture
    @inline def listBotVersionsFuture(params: ListBotVersionsRequest): Future[ListBotVersionsResponse] = service.listBotVersions(params).promise().toFuture
    @inline def listBotsFuture(params: ListBotsRequest): Future[ListBotsResponse] = service.listBots(params).promise().toFuture
    @inline def listBuiltInIntentsFuture(params: ListBuiltInIntentsRequest): Future[ListBuiltInIntentsResponse] = service.listBuiltInIntents(params).promise().toFuture
    @inline def listBuiltInSlotTypesFuture(params: ListBuiltInSlotTypesRequest): Future[ListBuiltInSlotTypesResponse] = service.listBuiltInSlotTypes(params).promise().toFuture
    @inline def listIntentsFuture(params: ListIntentsRequest): Future[ListIntentsResponse] = service.listIntents(params).promise().toFuture
    @inline def listSlotTypesFuture(params: ListSlotTypesRequest): Future[ListSlotTypesResponse] = service.listSlotTypes(params).promise().toFuture
    @inline def listSlotsFuture(params: ListSlotsRequest): Future[ListSlotsResponse] = service.listSlots(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateBotAliasFuture(params: UpdateBotAliasRequest): Future[UpdateBotAliasResponse] = service.updateBotAlias(params).promise().toFuture
    @inline def updateBotFuture(params: UpdateBotRequest): Future[UpdateBotResponse] = service.updateBot(params).promise().toFuture
    @inline def updateBotLocaleFuture(params: UpdateBotLocaleRequest): Future[UpdateBotLocaleResponse] = service.updateBotLocale(params).promise().toFuture
    @inline def updateIntentFuture(params: UpdateIntentRequest): Future[UpdateIntentResponse] = service.updateIntent(params).promise().toFuture
    @inline def updateSlotFuture(params: UpdateSlotRequest): Future[UpdateSlotResponse] = service.updateSlot(params).promise().toFuture
    @inline def updateSlotTypeFuture(params: UpdateSlotTypeRequest): Future[UpdateSlotTypeResponse] = service.updateSlotType(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/lexmodelsv2", JSImport.Namespace, "AWS.LexModelsV2")
  class LexModelsV2() extends js.Object {
    def this(config: AWSConfig) = this()

    def buildBotLocale(params: BuildBotLocaleRequest): Request[BuildBotLocaleResponse] = js.native
    def createBot(params: CreateBotRequest): Request[CreateBotResponse] = js.native
    def createBotAlias(params: CreateBotAliasRequest): Request[CreateBotAliasResponse] = js.native
    def createBotLocale(params: CreateBotLocaleRequest): Request[CreateBotLocaleResponse] = js.native
    def createBotVersion(params: CreateBotVersionRequest): Request[CreateBotVersionResponse] = js.native
    def createIntent(params: CreateIntentRequest): Request[CreateIntentResponse] = js.native
    def createSlot(params: CreateSlotRequest): Request[CreateSlotResponse] = js.native
    def createSlotType(params: CreateSlotTypeRequest): Request[CreateSlotTypeResponse] = js.native
    def deleteBot(params: DeleteBotRequest): Request[DeleteBotResponse] = js.native
    def deleteBotAlias(params: DeleteBotAliasRequest): Request[DeleteBotAliasResponse] = js.native
    def deleteBotLocale(params: DeleteBotLocaleRequest): Request[DeleteBotLocaleResponse] = js.native
    def deleteBotVersion(params: DeleteBotVersionRequest): Request[DeleteBotVersionResponse] = js.native
    def deleteIntent(params: DeleteIntentRequest): Request[js.Object] = js.native
    def deleteSlot(params: DeleteSlotRequest): Request[js.Object] = js.native
    def deleteSlotType(params: DeleteSlotTypeRequest): Request[js.Object] = js.native
    def describeBot(params: DescribeBotRequest): Request[DescribeBotResponse] = js.native
    def describeBotAlias(params: DescribeBotAliasRequest): Request[DescribeBotAliasResponse] = js.native
    def describeBotLocale(params: DescribeBotLocaleRequest): Request[DescribeBotLocaleResponse] = js.native
    def describeBotVersion(params: DescribeBotVersionRequest): Request[DescribeBotVersionResponse] = js.native
    def describeIntent(params: DescribeIntentRequest): Request[DescribeIntentResponse] = js.native
    def describeSlot(params: DescribeSlotRequest): Request[DescribeSlotResponse] = js.native
    def describeSlotType(params: DescribeSlotTypeRequest): Request[DescribeSlotTypeResponse] = js.native
    def listBotAliases(params: ListBotAliasesRequest): Request[ListBotAliasesResponse] = js.native
    def listBotLocales(params: ListBotLocalesRequest): Request[ListBotLocalesResponse] = js.native
    def listBotVersions(params: ListBotVersionsRequest): Request[ListBotVersionsResponse] = js.native
    def listBots(params: ListBotsRequest): Request[ListBotsResponse] = js.native
    def listBuiltInIntents(params: ListBuiltInIntentsRequest): Request[ListBuiltInIntentsResponse] = js.native
    def listBuiltInSlotTypes(params: ListBuiltInSlotTypesRequest): Request[ListBuiltInSlotTypesResponse] = js.native
    def listIntents(params: ListIntentsRequest): Request[ListIntentsResponse] = js.native
    def listSlotTypes(params: ListSlotTypesRequest): Request[ListSlotTypesResponse] = js.native
    def listSlots(params: ListSlotsRequest): Request[ListSlotsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateBot(params: UpdateBotRequest): Request[UpdateBotResponse] = js.native
    def updateBotAlias(params: UpdateBotAliasRequest): Request[UpdateBotAliasResponse] = js.native
    def updateBotLocale(params: UpdateBotLocaleRequest): Request[UpdateBotLocaleResponse] = js.native
    def updateIntent(params: UpdateIntentRequest): Request[UpdateIntentResponse] = js.native
    def updateSlot(params: UpdateSlotRequest): Request[UpdateSlotResponse] = js.native
    def updateSlotType(params: UpdateSlotTypeRequest): Request[UpdateSlotTypeResponse] = js.native
  }
  object LexModelsV2 {
    @inline implicit def toOps(service: LexModelsV2): LexModelsV2Ops = {
      new LexModelsV2Ops(service)
    }
  }

  /** The location of audio log files collected when conversation logging is enabled for a bot.
    */
  @js.native
  trait AudioLogDestination extends js.Object {
    var s3Bucket: S3BucketLogDestination
  }

  object AudioLogDestination {
    @inline
    def apply(
        s3Bucket: S3BucketLogDestination
    ): AudioLogDestination = {
      val __obj = js.Dynamic.literal(
        "s3Bucket" -> s3Bucket.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AudioLogDestination]
    }
  }

  /** Settings for logging audio of conversations between Amazon Lex and a user. You specify whether to log audio and the Amazon S3 bucket where the audio file is stored.
    */
  @js.native
  trait AudioLogSetting extends js.Object {
    var destination: AudioLogDestination
    var enabled: Boolean
  }

  object AudioLogSetting {
    @inline
    def apply(
        destination: AudioLogDestination,
        enabled: Boolean
    ): AudioLogSetting = {
      val __obj = js.Dynamic.literal(
        "destination" -> destination.asInstanceOf[js.Any],
        "enabled" -> enabled.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AudioLogSetting]
    }
  }

  /** Provides a record of an event that affects a bot alias. For example, when the version of a bot that the alias points to changes.
    */
  @js.native
  trait BotAliasHistoryEvent extends js.Object {
    var botVersion: js.UndefOr[BotVersion]
    var endDate: js.UndefOr[Timestamp]
    var startDate: js.UndefOr[Timestamp]
  }

  object BotAliasHistoryEvent {
    @inline
    def apply(
        botVersion: js.UndefOr[BotVersion] = js.undefined,
        endDate: js.UndefOr[Timestamp] = js.undefined,
        startDate: js.UndefOr[Timestamp] = js.undefined
    ): BotAliasHistoryEvent = {
      val __obj = js.Dynamic.literal()
      botVersion.foreach(__v => __obj.updateDynamic("botVersion")(__v.asInstanceOf[js.Any]))
      endDate.foreach(__v => __obj.updateDynamic("endDate")(__v.asInstanceOf[js.Any]))
      startDate.foreach(__v => __obj.updateDynamic("startDate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BotAliasHistoryEvent]
    }
  }

  /** Specifies settings that are unique to a locale. For example, you can use different Lambda function depending on the bot's locale.
    */
  @js.native
  trait BotAliasLocaleSettings extends js.Object {
    var enabled: Boolean
    var codeHookSpecification: js.UndefOr[CodeHookSpecification]
  }

  object BotAliasLocaleSettings {
    @inline
    def apply(
        enabled: Boolean,
        codeHookSpecification: js.UndefOr[CodeHookSpecification] = js.undefined
    ): BotAliasLocaleSettings = {
      val __obj = js.Dynamic.literal(
        "enabled" -> enabled.asInstanceOf[js.Any]
      )

      codeHookSpecification.foreach(__v => __obj.updateDynamic("codeHookSpecification")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BotAliasLocaleSettings]
    }
  }

  /** Summary information about bot aliases returned from the <a>ListBotAliases</a> operation.
    */
  @js.native
  trait BotAliasSummary extends js.Object {
    var botAliasId: js.UndefOr[BotAliasId]
    var botAliasName: js.UndefOr[Name]
    var botAliasStatus: js.UndefOr[BotAliasStatus]
    var botVersion: js.UndefOr[BotVersion]
    var creationDateTime: js.UndefOr[Timestamp]
    var description: js.UndefOr[Description]
    var lastUpdatedDateTime: js.UndefOr[Timestamp]
  }

  object BotAliasSummary {
    @inline
    def apply(
        botAliasId: js.UndefOr[BotAliasId] = js.undefined,
        botAliasName: js.UndefOr[Name] = js.undefined,
        botAliasStatus: js.UndefOr[BotAliasStatus] = js.undefined,
        botVersion: js.UndefOr[BotVersion] = js.undefined,
        creationDateTime: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        lastUpdatedDateTime: js.UndefOr[Timestamp] = js.undefined
    ): BotAliasSummary = {
      val __obj = js.Dynamic.literal()
      botAliasId.foreach(__v => __obj.updateDynamic("botAliasId")(__v.asInstanceOf[js.Any]))
      botAliasName.foreach(__v => __obj.updateDynamic("botAliasName")(__v.asInstanceOf[js.Any]))
      botAliasStatus.foreach(__v => __obj.updateDynamic("botAliasStatus")(__v.asInstanceOf[js.Any]))
      botVersion.foreach(__v => __obj.updateDynamic("botVersion")(__v.asInstanceOf[js.Any]))
      creationDateTime.foreach(__v => __obj.updateDynamic("creationDateTime")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      lastUpdatedDateTime.foreach(__v => __obj.updateDynamic("lastUpdatedDateTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BotAliasSummary]
    }
  }

  /** Filters the responses returned by the <code>ListBots</code> operation.
    */
  @js.native
  trait BotFilter extends js.Object {
    var name: BotFilterName
    var operator: BotFilterOperator
    var values: FilterValues
  }

  object BotFilter {
    @inline
    def apply(
        name: BotFilterName,
        operator: BotFilterOperator,
        values: FilterValues
    ): BotFilter = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "operator" -> operator.asInstanceOf[js.Any],
        "values" -> values.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BotFilter]
    }
  }

  /** Filters responses returned by the <code>ListBotLocales</code> operation.
    */
  @js.native
  trait BotLocaleFilter extends js.Object {
    var name: BotLocaleFilterName
    var operator: BotLocaleFilterOperator
    var values: FilterValues
  }

  object BotLocaleFilter {
    @inline
    def apply(
        name: BotLocaleFilterName,
        operator: BotLocaleFilterOperator,
        values: FilterValues
    ): BotLocaleFilter = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "operator" -> operator.asInstanceOf[js.Any],
        "values" -> values.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BotLocaleFilter]
    }
  }

  /** Provides information about an event that occurred affecting the bot locale.
    */
  @js.native
  trait BotLocaleHistoryEvent extends js.Object {
    var event: BotLocaleHistoryEventDescription
    var eventDate: Timestamp
  }

  object BotLocaleHistoryEvent {
    @inline
    def apply(
        event: BotLocaleHistoryEventDescription,
        eventDate: Timestamp
    ): BotLocaleHistoryEvent = {
      val __obj = js.Dynamic.literal(
        "event" -> event.asInstanceOf[js.Any],
        "eventDate" -> eventDate.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BotLocaleHistoryEvent]
    }
  }

  /** Specifies attributes for sorting a list of bot locales.
    */
  @js.native
  trait BotLocaleSortBy extends js.Object {
    var attribute: BotLocaleSortAttribute
    var order: SortOrder
  }

  object BotLocaleSortBy {
    @inline
    def apply(
        attribute: BotLocaleSortAttribute,
        order: SortOrder
    ): BotLocaleSortBy = {
      val __obj = js.Dynamic.literal(
        "attribute" -> attribute.asInstanceOf[js.Any],
        "order" -> order.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BotLocaleSortBy]
    }
  }

  /** Summary information about bot locales returned by the <a>ListBotLocales</a> operation.
    */
  @js.native
  trait BotLocaleSummary extends js.Object {
    var botLocaleStatus: js.UndefOr[BotLocaleStatus]
    var description: js.UndefOr[Description]
    var lastBuildSubmittedDateTime: js.UndefOr[Timestamp]
    var lastUpdatedDateTime: js.UndefOr[Timestamp]
    var localeId: js.UndefOr[LocaleId]
    var localeName: js.UndefOr[LocaleName]
  }

  object BotLocaleSummary {
    @inline
    def apply(
        botLocaleStatus: js.UndefOr[BotLocaleStatus] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        lastBuildSubmittedDateTime: js.UndefOr[Timestamp] = js.undefined,
        lastUpdatedDateTime: js.UndefOr[Timestamp] = js.undefined,
        localeId: js.UndefOr[LocaleId] = js.undefined,
        localeName: js.UndefOr[LocaleName] = js.undefined
    ): BotLocaleSummary = {
      val __obj = js.Dynamic.literal()
      botLocaleStatus.foreach(__v => __obj.updateDynamic("botLocaleStatus")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      lastBuildSubmittedDateTime.foreach(__v => __obj.updateDynamic("lastBuildSubmittedDateTime")(__v.asInstanceOf[js.Any]))
      lastUpdatedDateTime.foreach(__v => __obj.updateDynamic("lastUpdatedDateTime")(__v.asInstanceOf[js.Any]))
      localeId.foreach(__v => __obj.updateDynamic("localeId")(__v.asInstanceOf[js.Any]))
      localeName.foreach(__v => __obj.updateDynamic("localeName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BotLocaleSummary]
    }
  }

  /** Specifies attributes for sorting a list of bots.
    */
  @js.native
  trait BotSortBy extends js.Object {
    var attribute: BotSortAttribute
    var order: SortOrder
  }

  object BotSortBy {
    @inline
    def apply(
        attribute: BotSortAttribute,
        order: SortOrder
    ): BotSortBy = {
      val __obj = js.Dynamic.literal(
        "attribute" -> attribute.asInstanceOf[js.Any],
        "order" -> order.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BotSortBy]
    }
  }

  /** Summary information about a bot returned by the <a>ListBots</a> operation.
    */
  @js.native
  trait BotSummary extends js.Object {
    var botId: js.UndefOr[Id]
    var botName: js.UndefOr[Name]
    var botStatus: js.UndefOr[BotStatus]
    var description: js.UndefOr[Description]
    var lastUpdatedDateTime: js.UndefOr[Timestamp]
    var latestBotVersion: js.UndefOr[NumericalBotVersion]
  }

  object BotSummary {
    @inline
    def apply(
        botId: js.UndefOr[Id] = js.undefined,
        botName: js.UndefOr[Name] = js.undefined,
        botStatus: js.UndefOr[BotStatus] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        lastUpdatedDateTime: js.UndefOr[Timestamp] = js.undefined,
        latestBotVersion: js.UndefOr[NumericalBotVersion] = js.undefined
    ): BotSummary = {
      val __obj = js.Dynamic.literal()
      botId.foreach(__v => __obj.updateDynamic("botId")(__v.asInstanceOf[js.Any]))
      botName.foreach(__v => __obj.updateDynamic("botName")(__v.asInstanceOf[js.Any]))
      botStatus.foreach(__v => __obj.updateDynamic("botStatus")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      lastUpdatedDateTime.foreach(__v => __obj.updateDynamic("lastUpdatedDateTime")(__v.asInstanceOf[js.Any]))
      latestBotVersion.foreach(__v => __obj.updateDynamic("latestBotVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BotSummary]
    }
  }

  /** The version of a bot used for a bot locale.
    */
  @js.native
  trait BotVersionLocaleDetails extends js.Object {
    var sourceBotVersion: BotVersion
  }

  object BotVersionLocaleDetails {
    @inline
    def apply(
        sourceBotVersion: BotVersion
    ): BotVersionLocaleDetails = {
      val __obj = js.Dynamic.literal(
        "sourceBotVersion" -> sourceBotVersion.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BotVersionLocaleDetails]
    }
  }

  /** Specifies attributes for sorting a list of bot versions.
    */
  @js.native
  trait BotVersionSortBy extends js.Object {
    var attribute: BotVersionSortAttribute
    var order: SortOrder
  }

  object BotVersionSortBy {
    @inline
    def apply(
        attribute: BotVersionSortAttribute,
        order: SortOrder
    ): BotVersionSortBy = {
      val __obj = js.Dynamic.literal(
        "attribute" -> attribute.asInstanceOf[js.Any],
        "order" -> order.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BotVersionSortBy]
    }
  }

  /** Summary information about a bot version returned by the <a>ListBotVersions</a> operation.
    */
  @js.native
  trait BotVersionSummary extends js.Object {
    var botName: js.UndefOr[Name]
    var botStatus: js.UndefOr[BotStatus]
    var botVersion: js.UndefOr[BotVersion]
    var creationDateTime: js.UndefOr[Timestamp]
    var description: js.UndefOr[Description]
  }

  object BotVersionSummary {
    @inline
    def apply(
        botName: js.UndefOr[Name] = js.undefined,
        botStatus: js.UndefOr[BotStatus] = js.undefined,
        botVersion: js.UndefOr[BotVersion] = js.undefined,
        creationDateTime: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[Description] = js.undefined
    ): BotVersionSummary = {
      val __obj = js.Dynamic.literal()
      botName.foreach(__v => __obj.updateDynamic("botName")(__v.asInstanceOf[js.Any]))
      botStatus.foreach(__v => __obj.updateDynamic("botStatus")(__v.asInstanceOf[js.Any]))
      botVersion.foreach(__v => __obj.updateDynamic("botVersion")(__v.asInstanceOf[js.Any]))
      creationDateTime.foreach(__v => __obj.updateDynamic("creationDateTime")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BotVersionSummary]
    }
  }

  @js.native
  trait BuildBotLocaleRequest extends js.Object {
    var botId: Id
    var botVersion: DraftBotVersion
    var localeId: LocaleId
  }

  object BuildBotLocaleRequest {
    @inline
    def apply(
        botId: Id,
        botVersion: DraftBotVersion,
        localeId: LocaleId
    ): BuildBotLocaleRequest = {
      val __obj = js.Dynamic.literal(
        "botId" -> botId.asInstanceOf[js.Any],
        "botVersion" -> botVersion.asInstanceOf[js.Any],
        "localeId" -> localeId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BuildBotLocaleRequest]
    }
  }

  @js.native
  trait BuildBotLocaleResponse extends js.Object {
    var botId: js.UndefOr[Id]
    var botLocaleStatus: js.UndefOr[BotLocaleStatus]
    var botVersion: js.UndefOr[DraftBotVersion]
    var lastBuildSubmittedDateTime: js.UndefOr[Timestamp]
    var localeId: js.UndefOr[LocaleId]
  }

  object BuildBotLocaleResponse {
    @inline
    def apply(
        botId: js.UndefOr[Id] = js.undefined,
        botLocaleStatus: js.UndefOr[BotLocaleStatus] = js.undefined,
        botVersion: js.UndefOr[DraftBotVersion] = js.undefined,
        lastBuildSubmittedDateTime: js.UndefOr[Timestamp] = js.undefined,
        localeId: js.UndefOr[LocaleId] = js.undefined
    ): BuildBotLocaleResponse = {
      val __obj = js.Dynamic.literal()
      botId.foreach(__v => __obj.updateDynamic("botId")(__v.asInstanceOf[js.Any]))
      botLocaleStatus.foreach(__v => __obj.updateDynamic("botLocaleStatus")(__v.asInstanceOf[js.Any]))
      botVersion.foreach(__v => __obj.updateDynamic("botVersion")(__v.asInstanceOf[js.Any]))
      lastBuildSubmittedDateTime.foreach(__v => __obj.updateDynamic("lastBuildSubmittedDateTime")(__v.asInstanceOf[js.Any]))
      localeId.foreach(__v => __obj.updateDynamic("localeId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BuildBotLocaleResponse]
    }
  }

  /** Specifies attributes for sorting a list of built-in intents.
    */
  @js.native
  trait BuiltInIntentSortBy extends js.Object {
    var attribute: BuiltInIntentSortAttribute
    var order: SortOrder
  }

  object BuiltInIntentSortBy {
    @inline
    def apply(
        attribute: BuiltInIntentSortAttribute,
        order: SortOrder
    ): BuiltInIntentSortBy = {
      val __obj = js.Dynamic.literal(
        "attribute" -> attribute.asInstanceOf[js.Any],
        "order" -> order.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BuiltInIntentSortBy]
    }
  }

  /** Provides summary information about a built-in intent for the <a>ListBuiltInIntents</a> operation.
    */
  @js.native
  trait BuiltInIntentSummary extends js.Object {
    var description: js.UndefOr[Description]
    var intentSignature: js.UndefOr[IntentSignature]
  }

  object BuiltInIntentSummary {
    @inline
    def apply(
        description: js.UndefOr[Description] = js.undefined,
        intentSignature: js.UndefOr[IntentSignature] = js.undefined
    ): BuiltInIntentSummary = {
      val __obj = js.Dynamic.literal()
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      intentSignature.foreach(__v => __obj.updateDynamic("intentSignature")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BuiltInIntentSummary]
    }
  }

  /** Specifies attributes for sorting a list of built-in slot types.
    */
  @js.native
  trait BuiltInSlotTypeSortBy extends js.Object {
    var attribute: BuiltInSlotTypeSortAttribute
    var order: SortOrder
  }

  object BuiltInSlotTypeSortBy {
    @inline
    def apply(
        attribute: BuiltInSlotTypeSortAttribute,
        order: SortOrder
    ): BuiltInSlotTypeSortBy = {
      val __obj = js.Dynamic.literal(
        "attribute" -> attribute.asInstanceOf[js.Any],
        "order" -> order.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BuiltInSlotTypeSortBy]
    }
  }

  /** Provides summary information about a built-in slot type for the <a>ListBuiltInSlotTypes</a> operation.
    */
  @js.native
  trait BuiltInSlotTypeSummary extends js.Object {
    var description: js.UndefOr[Description]
    var slotTypeSignature: js.UndefOr[SlotTypeSignature]
  }

  object BuiltInSlotTypeSummary {
    @inline
    def apply(
        description: js.UndefOr[Description] = js.undefined,
        slotTypeSignature: js.UndefOr[SlotTypeSignature] = js.undefined
    ): BuiltInSlotTypeSummary = {
      val __obj = js.Dynamic.literal()
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      slotTypeSignature.foreach(__v => __obj.updateDynamic("slotTypeSignature")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BuiltInSlotTypeSummary]
    }
  }

  /** Describes a button to use on a response card used to gather slot values from a user.
    */
  @js.native
  trait Button extends js.Object {
    var text: ButtonText
    var value: ButtonValue
  }

  object Button {
    @inline
    def apply(
        text: ButtonText,
        value: ButtonValue
    ): Button = {
      val __obj = js.Dynamic.literal(
        "text" -> text.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Button]
    }
  }

  /** The Amazon CloudWatch Logs log group where the text and metadata logs are delivered. The log group must exist before you enable logging.
    */
  @js.native
  trait CloudWatchLogGroupLogDestination extends js.Object {
    var cloudWatchLogGroupArn: CloudWatchLogGroupArn
    var logPrefix: LogPrefix
  }

  object CloudWatchLogGroupLogDestination {
    @inline
    def apply(
        cloudWatchLogGroupArn: CloudWatchLogGroupArn,
        logPrefix: LogPrefix
    ): CloudWatchLogGroupLogDestination = {
      val __obj = js.Dynamic.literal(
        "cloudWatchLogGroupArn" -> cloudWatchLogGroupArn.asInstanceOf[js.Any],
        "logPrefix" -> logPrefix.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CloudWatchLogGroupLogDestination]
    }
  }

  /** Contains information about code hooks that Amazon Lex calls during a conversation.
    */
  @js.native
  trait CodeHookSpecification extends js.Object {
    var lambdaCodeHook: LambdaCodeHook
  }

  object CodeHookSpecification {
    @inline
    def apply(
        lambdaCodeHook: LambdaCodeHook
    ): CodeHookSpecification = {
      val __obj = js.Dynamic.literal(
        "lambdaCodeHook" -> lambdaCodeHook.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CodeHookSpecification]
    }
  }

  /** Configures conversation logging that saves audio, text, and metadata for the conversations with your users.
    */
  @js.native
  trait ConversationLogSettings extends js.Object {
    var audioLogSettings: js.UndefOr[AudioLogSettingsList]
    var textLogSettings: js.UndefOr[TextLogSettingsList]
  }

  object ConversationLogSettings {
    @inline
    def apply(
        audioLogSettings: js.UndefOr[AudioLogSettingsList] = js.undefined,
        textLogSettings: js.UndefOr[TextLogSettingsList] = js.undefined
    ): ConversationLogSettings = {
      val __obj = js.Dynamic.literal()
      audioLogSettings.foreach(__v => __obj.updateDynamic("audioLogSettings")(__v.asInstanceOf[js.Any]))
      textLogSettings.foreach(__v => __obj.updateDynamic("textLogSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConversationLogSettings]
    }
  }

  @js.native
  trait CreateBotAliasRequest extends js.Object {
    var botAliasName: Name
    var botId: Id
    var botAliasLocaleSettings: js.UndefOr[BotAliasLocaleSettingsMap]
    var botVersion: js.UndefOr[NumericalBotVersion]
    var conversationLogSettings: js.UndefOr[ConversationLogSettings]
    var description: js.UndefOr[Description]
    var sentimentAnalysisSettings: js.UndefOr[SentimentAnalysisSettings]
    var tags: js.UndefOr[TagMap]
  }

  object CreateBotAliasRequest {
    @inline
    def apply(
        botAliasName: Name,
        botId: Id,
        botAliasLocaleSettings: js.UndefOr[BotAliasLocaleSettingsMap] = js.undefined,
        botVersion: js.UndefOr[NumericalBotVersion] = js.undefined,
        conversationLogSettings: js.UndefOr[ConversationLogSettings] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        sentimentAnalysisSettings: js.UndefOr[SentimentAnalysisSettings] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateBotAliasRequest = {
      val __obj = js.Dynamic.literal(
        "botAliasName" -> botAliasName.asInstanceOf[js.Any],
        "botId" -> botId.asInstanceOf[js.Any]
      )

      botAliasLocaleSettings.foreach(__v => __obj.updateDynamic("botAliasLocaleSettings")(__v.asInstanceOf[js.Any]))
      botVersion.foreach(__v => __obj.updateDynamic("botVersion")(__v.asInstanceOf[js.Any]))
      conversationLogSettings.foreach(__v => __obj.updateDynamic("conversationLogSettings")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      sentimentAnalysisSettings.foreach(__v => __obj.updateDynamic("sentimentAnalysisSettings")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateBotAliasRequest]
    }
  }

  @js.native
  trait CreateBotAliasResponse extends js.Object {
    var botAliasId: js.UndefOr[BotAliasId]
    var botAliasLocaleSettings: js.UndefOr[BotAliasLocaleSettingsMap]
    var botAliasName: js.UndefOr[Name]
    var botAliasStatus: js.UndefOr[BotAliasStatus]
    var botId: js.UndefOr[Id]
    var botVersion: js.UndefOr[NumericalBotVersion]
    var conversationLogSettings: js.UndefOr[ConversationLogSettings]
    var creationDateTime: js.UndefOr[Timestamp]
    var description: js.UndefOr[Description]
    var sentimentAnalysisSettings: js.UndefOr[SentimentAnalysisSettings]
    var tags: js.UndefOr[TagMap]
  }

  object CreateBotAliasResponse {
    @inline
    def apply(
        botAliasId: js.UndefOr[BotAliasId] = js.undefined,
        botAliasLocaleSettings: js.UndefOr[BotAliasLocaleSettingsMap] = js.undefined,
        botAliasName: js.UndefOr[Name] = js.undefined,
        botAliasStatus: js.UndefOr[BotAliasStatus] = js.undefined,
        botId: js.UndefOr[Id] = js.undefined,
        botVersion: js.UndefOr[NumericalBotVersion] = js.undefined,
        conversationLogSettings: js.UndefOr[ConversationLogSettings] = js.undefined,
        creationDateTime: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        sentimentAnalysisSettings: js.UndefOr[SentimentAnalysisSettings] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateBotAliasResponse = {
      val __obj = js.Dynamic.literal()
      botAliasId.foreach(__v => __obj.updateDynamic("botAliasId")(__v.asInstanceOf[js.Any]))
      botAliasLocaleSettings.foreach(__v => __obj.updateDynamic("botAliasLocaleSettings")(__v.asInstanceOf[js.Any]))
      botAliasName.foreach(__v => __obj.updateDynamic("botAliasName")(__v.asInstanceOf[js.Any]))
      botAliasStatus.foreach(__v => __obj.updateDynamic("botAliasStatus")(__v.asInstanceOf[js.Any]))
      botId.foreach(__v => __obj.updateDynamic("botId")(__v.asInstanceOf[js.Any]))
      botVersion.foreach(__v => __obj.updateDynamic("botVersion")(__v.asInstanceOf[js.Any]))
      conversationLogSettings.foreach(__v => __obj.updateDynamic("conversationLogSettings")(__v.asInstanceOf[js.Any]))
      creationDateTime.foreach(__v => __obj.updateDynamic("creationDateTime")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      sentimentAnalysisSettings.foreach(__v => __obj.updateDynamic("sentimentAnalysisSettings")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateBotAliasResponse]
    }
  }

  @js.native
  trait CreateBotLocaleRequest extends js.Object {
    var botId: Id
    var botVersion: DraftBotVersion
    var localeId: LocaleId
    var nluIntentConfidenceThreshold: ConfidenceThreshold
    var description: js.UndefOr[Description]
    var voiceSettings: js.UndefOr[VoiceSettings]
  }

  object CreateBotLocaleRequest {
    @inline
    def apply(
        botId: Id,
        botVersion: DraftBotVersion,
        localeId: LocaleId,
        nluIntentConfidenceThreshold: ConfidenceThreshold,
        description: js.UndefOr[Description] = js.undefined,
        voiceSettings: js.UndefOr[VoiceSettings] = js.undefined
    ): CreateBotLocaleRequest = {
      val __obj = js.Dynamic.literal(
        "botId" -> botId.asInstanceOf[js.Any],
        "botVersion" -> botVersion.asInstanceOf[js.Any],
        "localeId" -> localeId.asInstanceOf[js.Any],
        "nluIntentConfidenceThreshold" -> nluIntentConfidenceThreshold.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      voiceSettings.foreach(__v => __obj.updateDynamic("voiceSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateBotLocaleRequest]
    }
  }

  @js.native
  trait CreateBotLocaleResponse extends js.Object {
    var botId: js.UndefOr[Id]
    var botLocaleStatus: js.UndefOr[BotLocaleStatus]
    var botVersion: js.UndefOr[DraftBotVersion]
    var creationDateTime: js.UndefOr[Timestamp]
    var description: js.UndefOr[Description]
    var localeId: js.UndefOr[LocaleId]
    var localeName: js.UndefOr[LocaleName]
    var nluIntentConfidenceThreshold: js.UndefOr[ConfidenceThreshold]
    var voiceSettings: js.UndefOr[VoiceSettings]
  }

  object CreateBotLocaleResponse {
    @inline
    def apply(
        botId: js.UndefOr[Id] = js.undefined,
        botLocaleStatus: js.UndefOr[BotLocaleStatus] = js.undefined,
        botVersion: js.UndefOr[DraftBotVersion] = js.undefined,
        creationDateTime: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        localeId: js.UndefOr[LocaleId] = js.undefined,
        localeName: js.UndefOr[LocaleName] = js.undefined,
        nluIntentConfidenceThreshold: js.UndefOr[ConfidenceThreshold] = js.undefined,
        voiceSettings: js.UndefOr[VoiceSettings] = js.undefined
    ): CreateBotLocaleResponse = {
      val __obj = js.Dynamic.literal()
      botId.foreach(__v => __obj.updateDynamic("botId")(__v.asInstanceOf[js.Any]))
      botLocaleStatus.foreach(__v => __obj.updateDynamic("botLocaleStatus")(__v.asInstanceOf[js.Any]))
      botVersion.foreach(__v => __obj.updateDynamic("botVersion")(__v.asInstanceOf[js.Any]))
      creationDateTime.foreach(__v => __obj.updateDynamic("creationDateTime")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      localeId.foreach(__v => __obj.updateDynamic("localeId")(__v.asInstanceOf[js.Any]))
      localeName.foreach(__v => __obj.updateDynamic("localeName")(__v.asInstanceOf[js.Any]))
      nluIntentConfidenceThreshold.foreach(__v => __obj.updateDynamic("nluIntentConfidenceThreshold")(__v.asInstanceOf[js.Any]))
      voiceSettings.foreach(__v => __obj.updateDynamic("voiceSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateBotLocaleResponse]
    }
  }

  @js.native
  trait CreateBotRequest extends js.Object {
    var botName: Name
    var dataPrivacy: DataPrivacy
    var idleSessionTTLInSeconds: SessionTTL
    var roleArn: RoleArn
    var botTags: js.UndefOr[TagMap]
    var description: js.UndefOr[Description]
    var testBotAliasTags: js.UndefOr[TagMap]
  }

  object CreateBotRequest {
    @inline
    def apply(
        botName: Name,
        dataPrivacy: DataPrivacy,
        idleSessionTTLInSeconds: SessionTTL,
        roleArn: RoleArn,
        botTags: js.UndefOr[TagMap] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        testBotAliasTags: js.UndefOr[TagMap] = js.undefined
    ): CreateBotRequest = {
      val __obj = js.Dynamic.literal(
        "botName" -> botName.asInstanceOf[js.Any],
        "dataPrivacy" -> dataPrivacy.asInstanceOf[js.Any],
        "idleSessionTTLInSeconds" -> idleSessionTTLInSeconds.asInstanceOf[js.Any],
        "roleArn" -> roleArn.asInstanceOf[js.Any]
      )

      botTags.foreach(__v => __obj.updateDynamic("botTags")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      testBotAliasTags.foreach(__v => __obj.updateDynamic("testBotAliasTags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateBotRequest]
    }
  }

  @js.native
  trait CreateBotResponse extends js.Object {
    var botId: js.UndefOr[Id]
    var botName: js.UndefOr[Name]
    var botStatus: js.UndefOr[BotStatus]
    var botTags: js.UndefOr[TagMap]
    var creationDateTime: js.UndefOr[Timestamp]
    var dataPrivacy: js.UndefOr[DataPrivacy]
    var description: js.UndefOr[Description]
    var idleSessionTTLInSeconds: js.UndefOr[SessionTTL]
    var roleArn: js.UndefOr[RoleArn]
    var testBotAliasTags: js.UndefOr[TagMap]
  }

  object CreateBotResponse {
    @inline
    def apply(
        botId: js.UndefOr[Id] = js.undefined,
        botName: js.UndefOr[Name] = js.undefined,
        botStatus: js.UndefOr[BotStatus] = js.undefined,
        botTags: js.UndefOr[TagMap] = js.undefined,
        creationDateTime: js.UndefOr[Timestamp] = js.undefined,
        dataPrivacy: js.UndefOr[DataPrivacy] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        idleSessionTTLInSeconds: js.UndefOr[SessionTTL] = js.undefined,
        roleArn: js.UndefOr[RoleArn] = js.undefined,
        testBotAliasTags: js.UndefOr[TagMap] = js.undefined
    ): CreateBotResponse = {
      val __obj = js.Dynamic.literal()
      botId.foreach(__v => __obj.updateDynamic("botId")(__v.asInstanceOf[js.Any]))
      botName.foreach(__v => __obj.updateDynamic("botName")(__v.asInstanceOf[js.Any]))
      botStatus.foreach(__v => __obj.updateDynamic("botStatus")(__v.asInstanceOf[js.Any]))
      botTags.foreach(__v => __obj.updateDynamic("botTags")(__v.asInstanceOf[js.Any]))
      creationDateTime.foreach(__v => __obj.updateDynamic("creationDateTime")(__v.asInstanceOf[js.Any]))
      dataPrivacy.foreach(__v => __obj.updateDynamic("dataPrivacy")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      idleSessionTTLInSeconds.foreach(__v => __obj.updateDynamic("idleSessionTTLInSeconds")(__v.asInstanceOf[js.Any]))
      roleArn.foreach(__v => __obj.updateDynamic("roleArn")(__v.asInstanceOf[js.Any]))
      testBotAliasTags.foreach(__v => __obj.updateDynamic("testBotAliasTags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateBotResponse]
    }
  }

  @js.native
  trait CreateBotVersionRequest extends js.Object {
    var botId: Id
    var botVersionLocaleSpecification: BotVersionLocaleSpecification
    var description: js.UndefOr[Description]
  }

  object CreateBotVersionRequest {
    @inline
    def apply(
        botId: Id,
        botVersionLocaleSpecification: BotVersionLocaleSpecification,
        description: js.UndefOr[Description] = js.undefined
    ): CreateBotVersionRequest = {
      val __obj = js.Dynamic.literal(
        "botId" -> botId.asInstanceOf[js.Any],
        "botVersionLocaleSpecification" -> botVersionLocaleSpecification.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateBotVersionRequest]
    }
  }

  @js.native
  trait CreateBotVersionResponse extends js.Object {
    var botId: js.UndefOr[Id]
    var botStatus: js.UndefOr[BotStatus]
    var botVersion: js.UndefOr[NumericalBotVersion]
    var botVersionLocaleSpecification: js.UndefOr[BotVersionLocaleSpecification]
    var creationDateTime: js.UndefOr[Timestamp]
    var description: js.UndefOr[Description]
  }

  object CreateBotVersionResponse {
    @inline
    def apply(
        botId: js.UndefOr[Id] = js.undefined,
        botStatus: js.UndefOr[BotStatus] = js.undefined,
        botVersion: js.UndefOr[NumericalBotVersion] = js.undefined,
        botVersionLocaleSpecification: js.UndefOr[BotVersionLocaleSpecification] = js.undefined,
        creationDateTime: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[Description] = js.undefined
    ): CreateBotVersionResponse = {
      val __obj = js.Dynamic.literal()
      botId.foreach(__v => __obj.updateDynamic("botId")(__v.asInstanceOf[js.Any]))
      botStatus.foreach(__v => __obj.updateDynamic("botStatus")(__v.asInstanceOf[js.Any]))
      botVersion.foreach(__v => __obj.updateDynamic("botVersion")(__v.asInstanceOf[js.Any]))
      botVersionLocaleSpecification.foreach(__v => __obj.updateDynamic("botVersionLocaleSpecification")(__v.asInstanceOf[js.Any]))
      creationDateTime.foreach(__v => __obj.updateDynamic("creationDateTime")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateBotVersionResponse]
    }
  }

  @js.native
  trait CreateIntentRequest extends js.Object {
    var botId: Id
    var botVersion: DraftBotVersion
    var intentName: Name
    var localeId: LocaleId
    var description: js.UndefOr[Description]
    var dialogCodeHook: js.UndefOr[DialogCodeHookSettings]
    var fulfillmentCodeHook: js.UndefOr[FulfillmentCodeHookSettings]
    var inputContexts: js.UndefOr[InputContextsList]
    var intentClosingSetting: js.UndefOr[IntentClosingSetting]
    var intentConfirmationSetting: js.UndefOr[IntentConfirmationSetting]
    var kendraConfiguration: js.UndefOr[KendraConfiguration]
    var outputContexts: js.UndefOr[OutputContextsList]
    var parentIntentSignature: js.UndefOr[IntentSignature]
    var sampleUtterances: js.UndefOr[SampleUtterancesList]
  }

  object CreateIntentRequest {
    @inline
    def apply(
        botId: Id,
        botVersion: DraftBotVersion,
        intentName: Name,
        localeId: LocaleId,
        description: js.UndefOr[Description] = js.undefined,
        dialogCodeHook: js.UndefOr[DialogCodeHookSettings] = js.undefined,
        fulfillmentCodeHook: js.UndefOr[FulfillmentCodeHookSettings] = js.undefined,
        inputContexts: js.UndefOr[InputContextsList] = js.undefined,
        intentClosingSetting: js.UndefOr[IntentClosingSetting] = js.undefined,
        intentConfirmationSetting: js.UndefOr[IntentConfirmationSetting] = js.undefined,
        kendraConfiguration: js.UndefOr[KendraConfiguration] = js.undefined,
        outputContexts: js.UndefOr[OutputContextsList] = js.undefined,
        parentIntentSignature: js.UndefOr[IntentSignature] = js.undefined,
        sampleUtterances: js.UndefOr[SampleUtterancesList] = js.undefined
    ): CreateIntentRequest = {
      val __obj = js.Dynamic.literal(
        "botId" -> botId.asInstanceOf[js.Any],
        "botVersion" -> botVersion.asInstanceOf[js.Any],
        "intentName" -> intentName.asInstanceOf[js.Any],
        "localeId" -> localeId.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      dialogCodeHook.foreach(__v => __obj.updateDynamic("dialogCodeHook")(__v.asInstanceOf[js.Any]))
      fulfillmentCodeHook.foreach(__v => __obj.updateDynamic("fulfillmentCodeHook")(__v.asInstanceOf[js.Any]))
      inputContexts.foreach(__v => __obj.updateDynamic("inputContexts")(__v.asInstanceOf[js.Any]))
      intentClosingSetting.foreach(__v => __obj.updateDynamic("intentClosingSetting")(__v.asInstanceOf[js.Any]))
      intentConfirmationSetting.foreach(__v => __obj.updateDynamic("intentConfirmationSetting")(__v.asInstanceOf[js.Any]))
      kendraConfiguration.foreach(__v => __obj.updateDynamic("kendraConfiguration")(__v.asInstanceOf[js.Any]))
      outputContexts.foreach(__v => __obj.updateDynamic("outputContexts")(__v.asInstanceOf[js.Any]))
      parentIntentSignature.foreach(__v => __obj.updateDynamic("parentIntentSignature")(__v.asInstanceOf[js.Any]))
      sampleUtterances.foreach(__v => __obj.updateDynamic("sampleUtterances")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateIntentRequest]
    }
  }

  @js.native
  trait CreateIntentResponse extends js.Object {
    var botId: js.UndefOr[Id]
    var botVersion: js.UndefOr[DraftBotVersion]
    var creationDateTime: js.UndefOr[Timestamp]
    var description: js.UndefOr[Description]
    var dialogCodeHook: js.UndefOr[DialogCodeHookSettings]
    var fulfillmentCodeHook: js.UndefOr[FulfillmentCodeHookSettings]
    var inputContexts: js.UndefOr[InputContextsList]
    var intentClosingSetting: js.UndefOr[IntentClosingSetting]
    var intentConfirmationSetting: js.UndefOr[IntentConfirmationSetting]
    var intentId: js.UndefOr[Id]
    var intentName: js.UndefOr[Name]
    var kendraConfiguration: js.UndefOr[KendraConfiguration]
    var localeId: js.UndefOr[LocaleId]
    var outputContexts: js.UndefOr[OutputContextsList]
    var parentIntentSignature: js.UndefOr[IntentSignature]
    var sampleUtterances: js.UndefOr[SampleUtterancesList]
  }

  object CreateIntentResponse {
    @inline
    def apply(
        botId: js.UndefOr[Id] = js.undefined,
        botVersion: js.UndefOr[DraftBotVersion] = js.undefined,
        creationDateTime: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        dialogCodeHook: js.UndefOr[DialogCodeHookSettings] = js.undefined,
        fulfillmentCodeHook: js.UndefOr[FulfillmentCodeHookSettings] = js.undefined,
        inputContexts: js.UndefOr[InputContextsList] = js.undefined,
        intentClosingSetting: js.UndefOr[IntentClosingSetting] = js.undefined,
        intentConfirmationSetting: js.UndefOr[IntentConfirmationSetting] = js.undefined,
        intentId: js.UndefOr[Id] = js.undefined,
        intentName: js.UndefOr[Name] = js.undefined,
        kendraConfiguration: js.UndefOr[KendraConfiguration] = js.undefined,
        localeId: js.UndefOr[LocaleId] = js.undefined,
        outputContexts: js.UndefOr[OutputContextsList] = js.undefined,
        parentIntentSignature: js.UndefOr[IntentSignature] = js.undefined,
        sampleUtterances: js.UndefOr[SampleUtterancesList] = js.undefined
    ): CreateIntentResponse = {
      val __obj = js.Dynamic.literal()
      botId.foreach(__v => __obj.updateDynamic("botId")(__v.asInstanceOf[js.Any]))
      botVersion.foreach(__v => __obj.updateDynamic("botVersion")(__v.asInstanceOf[js.Any]))
      creationDateTime.foreach(__v => __obj.updateDynamic("creationDateTime")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      dialogCodeHook.foreach(__v => __obj.updateDynamic("dialogCodeHook")(__v.asInstanceOf[js.Any]))
      fulfillmentCodeHook.foreach(__v => __obj.updateDynamic("fulfillmentCodeHook")(__v.asInstanceOf[js.Any]))
      inputContexts.foreach(__v => __obj.updateDynamic("inputContexts")(__v.asInstanceOf[js.Any]))
      intentClosingSetting.foreach(__v => __obj.updateDynamic("intentClosingSetting")(__v.asInstanceOf[js.Any]))
      intentConfirmationSetting.foreach(__v => __obj.updateDynamic("intentConfirmationSetting")(__v.asInstanceOf[js.Any]))
      intentId.foreach(__v => __obj.updateDynamic("intentId")(__v.asInstanceOf[js.Any]))
      intentName.foreach(__v => __obj.updateDynamic("intentName")(__v.asInstanceOf[js.Any]))
      kendraConfiguration.foreach(__v => __obj.updateDynamic("kendraConfiguration")(__v.asInstanceOf[js.Any]))
      localeId.foreach(__v => __obj.updateDynamic("localeId")(__v.asInstanceOf[js.Any]))
      outputContexts.foreach(__v => __obj.updateDynamic("outputContexts")(__v.asInstanceOf[js.Any]))
      parentIntentSignature.foreach(__v => __obj.updateDynamic("parentIntentSignature")(__v.asInstanceOf[js.Any]))
      sampleUtterances.foreach(__v => __obj.updateDynamic("sampleUtterances")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateIntentResponse]
    }
  }

  @js.native
  trait CreateSlotRequest extends js.Object {
    var botId: Id
    var botVersion: DraftBotVersion
    var intentId: Id
    var localeId: LocaleId
    var slotName: Name
    var slotTypeId: BuiltInOrCustomSlotTypeId
    var valueElicitationSetting: SlotValueElicitationSetting
    var description: js.UndefOr[Description]
    var obfuscationSetting: js.UndefOr[ObfuscationSetting]
  }

  object CreateSlotRequest {
    @inline
    def apply(
        botId: Id,
        botVersion: DraftBotVersion,
        intentId: Id,
        localeId: LocaleId,
        slotName: Name,
        slotTypeId: BuiltInOrCustomSlotTypeId,
        valueElicitationSetting: SlotValueElicitationSetting,
        description: js.UndefOr[Description] = js.undefined,
        obfuscationSetting: js.UndefOr[ObfuscationSetting] = js.undefined
    ): CreateSlotRequest = {
      val __obj = js.Dynamic.literal(
        "botId" -> botId.asInstanceOf[js.Any],
        "botVersion" -> botVersion.asInstanceOf[js.Any],
        "intentId" -> intentId.asInstanceOf[js.Any],
        "localeId" -> localeId.asInstanceOf[js.Any],
        "slotName" -> slotName.asInstanceOf[js.Any],
        "slotTypeId" -> slotTypeId.asInstanceOf[js.Any],
        "valueElicitationSetting" -> valueElicitationSetting.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      obfuscationSetting.foreach(__v => __obj.updateDynamic("obfuscationSetting")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSlotRequest]
    }
  }

  @js.native
  trait CreateSlotResponse extends js.Object {
    var botId: js.UndefOr[Id]
    var botVersion: js.UndefOr[DraftBotVersion]
    var creationDateTime: js.UndefOr[Timestamp]
    var description: js.UndefOr[Description]
    var intentId: js.UndefOr[Id]
    var localeId: js.UndefOr[LocaleId]
    var obfuscationSetting: js.UndefOr[ObfuscationSetting]
    var slotId: js.UndefOr[Id]
    var slotName: js.UndefOr[Name]
    var slotTypeId: js.UndefOr[BuiltInOrCustomSlotTypeId]
    var valueElicitationSetting: js.UndefOr[SlotValueElicitationSetting]
  }

  object CreateSlotResponse {
    @inline
    def apply(
        botId: js.UndefOr[Id] = js.undefined,
        botVersion: js.UndefOr[DraftBotVersion] = js.undefined,
        creationDateTime: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        intentId: js.UndefOr[Id] = js.undefined,
        localeId: js.UndefOr[LocaleId] = js.undefined,
        obfuscationSetting: js.UndefOr[ObfuscationSetting] = js.undefined,
        slotId: js.UndefOr[Id] = js.undefined,
        slotName: js.UndefOr[Name] = js.undefined,
        slotTypeId: js.UndefOr[BuiltInOrCustomSlotTypeId] = js.undefined,
        valueElicitationSetting: js.UndefOr[SlotValueElicitationSetting] = js.undefined
    ): CreateSlotResponse = {
      val __obj = js.Dynamic.literal()
      botId.foreach(__v => __obj.updateDynamic("botId")(__v.asInstanceOf[js.Any]))
      botVersion.foreach(__v => __obj.updateDynamic("botVersion")(__v.asInstanceOf[js.Any]))
      creationDateTime.foreach(__v => __obj.updateDynamic("creationDateTime")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      intentId.foreach(__v => __obj.updateDynamic("intentId")(__v.asInstanceOf[js.Any]))
      localeId.foreach(__v => __obj.updateDynamic("localeId")(__v.asInstanceOf[js.Any]))
      obfuscationSetting.foreach(__v => __obj.updateDynamic("obfuscationSetting")(__v.asInstanceOf[js.Any]))
      slotId.foreach(__v => __obj.updateDynamic("slotId")(__v.asInstanceOf[js.Any]))
      slotName.foreach(__v => __obj.updateDynamic("slotName")(__v.asInstanceOf[js.Any]))
      slotTypeId.foreach(__v => __obj.updateDynamic("slotTypeId")(__v.asInstanceOf[js.Any]))
      valueElicitationSetting.foreach(__v => __obj.updateDynamic("valueElicitationSetting")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSlotResponse]
    }
  }

  @js.native
  trait CreateSlotTypeRequest extends js.Object {
    var botId: Id
    var botVersion: DraftBotVersion
    var localeId: LocaleId
    var slotTypeName: Name
    var valueSelectionSetting: SlotValueSelectionSetting
    var description: js.UndefOr[Description]
    var parentSlotTypeSignature: js.UndefOr[SlotTypeSignature]
    var slotTypeValues: js.UndefOr[SlotTypeValues]
  }

  object CreateSlotTypeRequest {
    @inline
    def apply(
        botId: Id,
        botVersion: DraftBotVersion,
        localeId: LocaleId,
        slotTypeName: Name,
        valueSelectionSetting: SlotValueSelectionSetting,
        description: js.UndefOr[Description] = js.undefined,
        parentSlotTypeSignature: js.UndefOr[SlotTypeSignature] = js.undefined,
        slotTypeValues: js.UndefOr[SlotTypeValues] = js.undefined
    ): CreateSlotTypeRequest = {
      val __obj = js.Dynamic.literal(
        "botId" -> botId.asInstanceOf[js.Any],
        "botVersion" -> botVersion.asInstanceOf[js.Any],
        "localeId" -> localeId.asInstanceOf[js.Any],
        "slotTypeName" -> slotTypeName.asInstanceOf[js.Any],
        "valueSelectionSetting" -> valueSelectionSetting.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      parentSlotTypeSignature.foreach(__v => __obj.updateDynamic("parentSlotTypeSignature")(__v.asInstanceOf[js.Any]))
      slotTypeValues.foreach(__v => __obj.updateDynamic("slotTypeValues")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSlotTypeRequest]
    }
  }

  @js.native
  trait CreateSlotTypeResponse extends js.Object {
    var botId: js.UndefOr[Id]
    var botVersion: js.UndefOr[DraftBotVersion]
    var creationDateTime: js.UndefOr[Timestamp]
    var description: js.UndefOr[Description]
    var localeId: js.UndefOr[LocaleId]
    var parentSlotTypeSignature: js.UndefOr[SlotTypeSignature]
    var slotTypeId: js.UndefOr[Id]
    var slotTypeName: js.UndefOr[Name]
    var slotTypeValues: js.UndefOr[SlotTypeValues]
    var valueSelectionSetting: js.UndefOr[SlotValueSelectionSetting]
  }

  object CreateSlotTypeResponse {
    @inline
    def apply(
        botId: js.UndefOr[Id] = js.undefined,
        botVersion: js.UndefOr[DraftBotVersion] = js.undefined,
        creationDateTime: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        localeId: js.UndefOr[LocaleId] = js.undefined,
        parentSlotTypeSignature: js.UndefOr[SlotTypeSignature] = js.undefined,
        slotTypeId: js.UndefOr[Id] = js.undefined,
        slotTypeName: js.UndefOr[Name] = js.undefined,
        slotTypeValues: js.UndefOr[SlotTypeValues] = js.undefined,
        valueSelectionSetting: js.UndefOr[SlotValueSelectionSetting] = js.undefined
    ): CreateSlotTypeResponse = {
      val __obj = js.Dynamic.literal()
      botId.foreach(__v => __obj.updateDynamic("botId")(__v.asInstanceOf[js.Any]))
      botVersion.foreach(__v => __obj.updateDynamic("botVersion")(__v.asInstanceOf[js.Any]))
      creationDateTime.foreach(__v => __obj.updateDynamic("creationDateTime")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      localeId.foreach(__v => __obj.updateDynamic("localeId")(__v.asInstanceOf[js.Any]))
      parentSlotTypeSignature.foreach(__v => __obj.updateDynamic("parentSlotTypeSignature")(__v.asInstanceOf[js.Any]))
      slotTypeId.foreach(__v => __obj.updateDynamic("slotTypeId")(__v.asInstanceOf[js.Any]))
      slotTypeName.foreach(__v => __obj.updateDynamic("slotTypeName")(__v.asInstanceOf[js.Any]))
      slotTypeValues.foreach(__v => __obj.updateDynamic("slotTypeValues")(__v.asInstanceOf[js.Any]))
      valueSelectionSetting.foreach(__v => __obj.updateDynamic("valueSelectionSetting")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSlotTypeResponse]
    }
  }

  /** A custom response string that Amazon Lex sends to your application. You define the content and structure the string.
    */
  @js.native
  trait CustomPayload extends js.Object {
    var value: CustomPayloadValue
  }

  object CustomPayload {
    @inline
    def apply(
        value: CustomPayloadValue
    ): CustomPayload = {
      val __obj = js.Dynamic.literal(
        "value" -> value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CustomPayload]
    }
  }

  /** By default, data stored by Amazon Lex is encrypted. The <code>DataPrivacy</code> structure provides settings that determine how Amazon Lex handles special cases of securing the data for your bot.
    */
  @js.native
  trait DataPrivacy extends js.Object {
    var childDirected: ChildDirected
  }

  object DataPrivacy {
    @inline
    def apply(
        childDirected: ChildDirected
    ): DataPrivacy = {
      val __obj = js.Dynamic.literal(
        "childDirected" -> childDirected.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DataPrivacy]
    }
  }

  @js.native
  trait DeleteBotAliasRequest extends js.Object {
    var botAliasId: BotAliasId
    var botId: Id
    var skipResourceInUseCheck: js.UndefOr[SkipResourceInUseCheck]
  }

  object DeleteBotAliasRequest {
    @inline
    def apply(
        botAliasId: BotAliasId,
        botId: Id,
        skipResourceInUseCheck: js.UndefOr[SkipResourceInUseCheck] = js.undefined
    ): DeleteBotAliasRequest = {
      val __obj = js.Dynamic.literal(
        "botAliasId" -> botAliasId.asInstanceOf[js.Any],
        "botId" -> botId.asInstanceOf[js.Any]
      )

      skipResourceInUseCheck.foreach(__v => __obj.updateDynamic("skipResourceInUseCheck")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteBotAliasRequest]
    }
  }

  @js.native
  trait DeleteBotAliasResponse extends js.Object {
    var botAliasId: js.UndefOr[BotAliasId]
    var botAliasStatus: js.UndefOr[BotAliasStatus]
    var botId: js.UndefOr[Id]
  }

  object DeleteBotAliasResponse {
    @inline
    def apply(
        botAliasId: js.UndefOr[BotAliasId] = js.undefined,
        botAliasStatus: js.UndefOr[BotAliasStatus] = js.undefined,
        botId: js.UndefOr[Id] = js.undefined
    ): DeleteBotAliasResponse = {
      val __obj = js.Dynamic.literal()
      botAliasId.foreach(__v => __obj.updateDynamic("botAliasId")(__v.asInstanceOf[js.Any]))
      botAliasStatus.foreach(__v => __obj.updateDynamic("botAliasStatus")(__v.asInstanceOf[js.Any]))
      botId.foreach(__v => __obj.updateDynamic("botId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteBotAliasResponse]
    }
  }

  @js.native
  trait DeleteBotLocaleRequest extends js.Object {
    var botId: Id
    var botVersion: DraftBotVersion
    var localeId: LocaleId
  }

  object DeleteBotLocaleRequest {
    @inline
    def apply(
        botId: Id,
        botVersion: DraftBotVersion,
        localeId: LocaleId
    ): DeleteBotLocaleRequest = {
      val __obj = js.Dynamic.literal(
        "botId" -> botId.asInstanceOf[js.Any],
        "botVersion" -> botVersion.asInstanceOf[js.Any],
        "localeId" -> localeId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteBotLocaleRequest]
    }
  }

  @js.native
  trait DeleteBotLocaleResponse extends js.Object {
    var botId: js.UndefOr[Id]
    var botLocaleStatus: js.UndefOr[BotLocaleStatus]
    var botVersion: js.UndefOr[DraftBotVersion]
    var localeId: js.UndefOr[LocaleId]
  }

  object DeleteBotLocaleResponse {
    @inline
    def apply(
        botId: js.UndefOr[Id] = js.undefined,
        botLocaleStatus: js.UndefOr[BotLocaleStatus] = js.undefined,
        botVersion: js.UndefOr[DraftBotVersion] = js.undefined,
        localeId: js.UndefOr[LocaleId] = js.undefined
    ): DeleteBotLocaleResponse = {
      val __obj = js.Dynamic.literal()
      botId.foreach(__v => __obj.updateDynamic("botId")(__v.asInstanceOf[js.Any]))
      botLocaleStatus.foreach(__v => __obj.updateDynamic("botLocaleStatus")(__v.asInstanceOf[js.Any]))
      botVersion.foreach(__v => __obj.updateDynamic("botVersion")(__v.asInstanceOf[js.Any]))
      localeId.foreach(__v => __obj.updateDynamic("localeId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteBotLocaleResponse]
    }
  }

  @js.native
  trait DeleteBotRequest extends js.Object {
    var botId: Id
    var skipResourceInUseCheck: js.UndefOr[SkipResourceInUseCheck]
  }

  object DeleteBotRequest {
    @inline
    def apply(
        botId: Id,
        skipResourceInUseCheck: js.UndefOr[SkipResourceInUseCheck] = js.undefined
    ): DeleteBotRequest = {
      val __obj = js.Dynamic.literal(
        "botId" -> botId.asInstanceOf[js.Any]
      )

      skipResourceInUseCheck.foreach(__v => __obj.updateDynamic("skipResourceInUseCheck")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteBotRequest]
    }
  }

  @js.native
  trait DeleteBotResponse extends js.Object {
    var botId: js.UndefOr[Id]
    var botStatus: js.UndefOr[BotStatus]
  }

  object DeleteBotResponse {
    @inline
    def apply(
        botId: js.UndefOr[Id] = js.undefined,
        botStatus: js.UndefOr[BotStatus] = js.undefined
    ): DeleteBotResponse = {
      val __obj = js.Dynamic.literal()
      botId.foreach(__v => __obj.updateDynamic("botId")(__v.asInstanceOf[js.Any]))
      botStatus.foreach(__v => __obj.updateDynamic("botStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteBotResponse]
    }
  }

  @js.native
  trait DeleteBotVersionRequest extends js.Object {
    var botId: Id
    var botVersion: NumericalBotVersion
    var skipResourceInUseCheck: js.UndefOr[SkipResourceInUseCheck]
  }

  object DeleteBotVersionRequest {
    @inline
    def apply(
        botId: Id,
        botVersion: NumericalBotVersion,
        skipResourceInUseCheck: js.UndefOr[SkipResourceInUseCheck] = js.undefined
    ): DeleteBotVersionRequest = {
      val __obj = js.Dynamic.literal(
        "botId" -> botId.asInstanceOf[js.Any],
        "botVersion" -> botVersion.asInstanceOf[js.Any]
      )

      skipResourceInUseCheck.foreach(__v => __obj.updateDynamic("skipResourceInUseCheck")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteBotVersionRequest]
    }
  }

  @js.native
  trait DeleteBotVersionResponse extends js.Object {
    var botId: js.UndefOr[Id]
    var botStatus: js.UndefOr[BotStatus]
    var botVersion: js.UndefOr[NumericalBotVersion]
  }

  object DeleteBotVersionResponse {
    @inline
    def apply(
        botId: js.UndefOr[Id] = js.undefined,
        botStatus: js.UndefOr[BotStatus] = js.undefined,
        botVersion: js.UndefOr[NumericalBotVersion] = js.undefined
    ): DeleteBotVersionResponse = {
      val __obj = js.Dynamic.literal()
      botId.foreach(__v => __obj.updateDynamic("botId")(__v.asInstanceOf[js.Any]))
      botStatus.foreach(__v => __obj.updateDynamic("botStatus")(__v.asInstanceOf[js.Any]))
      botVersion.foreach(__v => __obj.updateDynamic("botVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteBotVersionResponse]
    }
  }

  @js.native
  trait DeleteIntentRequest extends js.Object {
    var botId: Id
    var botVersion: DraftBotVersion
    var intentId: Id
    var localeId: LocaleId
  }

  object DeleteIntentRequest {
    @inline
    def apply(
        botId: Id,
        botVersion: DraftBotVersion,
        intentId: Id,
        localeId: LocaleId
    ): DeleteIntentRequest = {
      val __obj = js.Dynamic.literal(
        "botId" -> botId.asInstanceOf[js.Any],
        "botVersion" -> botVersion.asInstanceOf[js.Any],
        "intentId" -> intentId.asInstanceOf[js.Any],
        "localeId" -> localeId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteIntentRequest]
    }
  }

  @js.native
  trait DeleteSlotRequest extends js.Object {
    var botId: Id
    var botVersion: DraftBotVersion
    var intentId: Id
    var localeId: LocaleId
    var slotId: Id
  }

  object DeleteSlotRequest {
    @inline
    def apply(
        botId: Id,
        botVersion: DraftBotVersion,
        intentId: Id,
        localeId: LocaleId,
        slotId: Id
    ): DeleteSlotRequest = {
      val __obj = js.Dynamic.literal(
        "botId" -> botId.asInstanceOf[js.Any],
        "botVersion" -> botVersion.asInstanceOf[js.Any],
        "intentId" -> intentId.asInstanceOf[js.Any],
        "localeId" -> localeId.asInstanceOf[js.Any],
        "slotId" -> slotId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteSlotRequest]
    }
  }

  @js.native
  trait DeleteSlotTypeRequest extends js.Object {
    var botId: Id
    var botVersion: DraftBotVersion
    var localeId: LocaleId
    var slotTypeId: Id
    var skipResourceInUseCheck: js.UndefOr[SkipResourceInUseCheck]
  }

  object DeleteSlotTypeRequest {
    @inline
    def apply(
        botId: Id,
        botVersion: DraftBotVersion,
        localeId: LocaleId,
        slotTypeId: Id,
        skipResourceInUseCheck: js.UndefOr[SkipResourceInUseCheck] = js.undefined
    ): DeleteSlotTypeRequest = {
      val __obj = js.Dynamic.literal(
        "botId" -> botId.asInstanceOf[js.Any],
        "botVersion" -> botVersion.asInstanceOf[js.Any],
        "localeId" -> localeId.asInstanceOf[js.Any],
        "slotTypeId" -> slotTypeId.asInstanceOf[js.Any]
      )

      skipResourceInUseCheck.foreach(__v => __obj.updateDynamic("skipResourceInUseCheck")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteSlotTypeRequest]
    }
  }

  @js.native
  trait DescribeBotAliasRequest extends js.Object {
    var botAliasId: BotAliasId
    var botId: Id
  }

  object DescribeBotAliasRequest {
    @inline
    def apply(
        botAliasId: BotAliasId,
        botId: Id
    ): DescribeBotAliasRequest = {
      val __obj = js.Dynamic.literal(
        "botAliasId" -> botAliasId.asInstanceOf[js.Any],
        "botId" -> botId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeBotAliasRequest]
    }
  }

  @js.native
  trait DescribeBotAliasResponse extends js.Object {
    var botAliasHistoryEvents: js.UndefOr[BotAliasHistoryEventsList]
    var botAliasId: js.UndefOr[BotAliasId]
    var botAliasLocaleSettings: js.UndefOr[BotAliasLocaleSettingsMap]
    var botAliasName: js.UndefOr[Name]
    var botAliasStatus: js.UndefOr[BotAliasStatus]
    var botId: js.UndefOr[Id]
    var botVersion: js.UndefOr[BotVersion]
    var conversationLogSettings: js.UndefOr[ConversationLogSettings]
    var creationDateTime: js.UndefOr[Timestamp]
    var description: js.UndefOr[Description]
    var lastUpdatedDateTime: js.UndefOr[Timestamp]
    var sentimentAnalysisSettings: js.UndefOr[SentimentAnalysisSettings]
  }

  object DescribeBotAliasResponse {
    @inline
    def apply(
        botAliasHistoryEvents: js.UndefOr[BotAliasHistoryEventsList] = js.undefined,
        botAliasId: js.UndefOr[BotAliasId] = js.undefined,
        botAliasLocaleSettings: js.UndefOr[BotAliasLocaleSettingsMap] = js.undefined,
        botAliasName: js.UndefOr[Name] = js.undefined,
        botAliasStatus: js.UndefOr[BotAliasStatus] = js.undefined,
        botId: js.UndefOr[Id] = js.undefined,
        botVersion: js.UndefOr[BotVersion] = js.undefined,
        conversationLogSettings: js.UndefOr[ConversationLogSettings] = js.undefined,
        creationDateTime: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        lastUpdatedDateTime: js.UndefOr[Timestamp] = js.undefined,
        sentimentAnalysisSettings: js.UndefOr[SentimentAnalysisSettings] = js.undefined
    ): DescribeBotAliasResponse = {
      val __obj = js.Dynamic.literal()
      botAliasHistoryEvents.foreach(__v => __obj.updateDynamic("botAliasHistoryEvents")(__v.asInstanceOf[js.Any]))
      botAliasId.foreach(__v => __obj.updateDynamic("botAliasId")(__v.asInstanceOf[js.Any]))
      botAliasLocaleSettings.foreach(__v => __obj.updateDynamic("botAliasLocaleSettings")(__v.asInstanceOf[js.Any]))
      botAliasName.foreach(__v => __obj.updateDynamic("botAliasName")(__v.asInstanceOf[js.Any]))
      botAliasStatus.foreach(__v => __obj.updateDynamic("botAliasStatus")(__v.asInstanceOf[js.Any]))
      botId.foreach(__v => __obj.updateDynamic("botId")(__v.asInstanceOf[js.Any]))
      botVersion.foreach(__v => __obj.updateDynamic("botVersion")(__v.asInstanceOf[js.Any]))
      conversationLogSettings.foreach(__v => __obj.updateDynamic("conversationLogSettings")(__v.asInstanceOf[js.Any]))
      creationDateTime.foreach(__v => __obj.updateDynamic("creationDateTime")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      lastUpdatedDateTime.foreach(__v => __obj.updateDynamic("lastUpdatedDateTime")(__v.asInstanceOf[js.Any]))
      sentimentAnalysisSettings.foreach(__v => __obj.updateDynamic("sentimentAnalysisSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeBotAliasResponse]
    }
  }

  @js.native
  trait DescribeBotLocaleRequest extends js.Object {
    var botId: Id
    var botVersion: BotVersion
    var localeId: LocaleId
  }

  object DescribeBotLocaleRequest {
    @inline
    def apply(
        botId: Id,
        botVersion: BotVersion,
        localeId: LocaleId
    ): DescribeBotLocaleRequest = {
      val __obj = js.Dynamic.literal(
        "botId" -> botId.asInstanceOf[js.Any],
        "botVersion" -> botVersion.asInstanceOf[js.Any],
        "localeId" -> localeId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeBotLocaleRequest]
    }
  }

  @js.native
  trait DescribeBotLocaleResponse extends js.Object {
    var botId: js.UndefOr[Id]
    var botLocaleHistoryEvents: js.UndefOr[BotLocaleHistoryEventsList]
    var botLocaleStatus: js.UndefOr[BotLocaleStatus]
    var botVersion: js.UndefOr[BotVersion]
    var creationDateTime: js.UndefOr[Timestamp]
    var description: js.UndefOr[Description]
    var failureReasons: js.UndefOr[FailureReasons]
    var intentsCount: js.UndefOr[ResourceCount]
    var lastBuildSubmittedDateTime: js.UndefOr[Timestamp]
    var lastUpdatedDateTime: js.UndefOr[Timestamp]
    var localeId: js.UndefOr[LocaleId]
    var localeName: js.UndefOr[LocaleName]
    var nluIntentConfidenceThreshold: js.UndefOr[ConfidenceThreshold]
    var slotTypesCount: js.UndefOr[ResourceCount]
    var voiceSettings: js.UndefOr[VoiceSettings]
  }

  object DescribeBotLocaleResponse {
    @inline
    def apply(
        botId: js.UndefOr[Id] = js.undefined,
        botLocaleHistoryEvents: js.UndefOr[BotLocaleHistoryEventsList] = js.undefined,
        botLocaleStatus: js.UndefOr[BotLocaleStatus] = js.undefined,
        botVersion: js.UndefOr[BotVersion] = js.undefined,
        creationDateTime: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        failureReasons: js.UndefOr[FailureReasons] = js.undefined,
        intentsCount: js.UndefOr[ResourceCount] = js.undefined,
        lastBuildSubmittedDateTime: js.UndefOr[Timestamp] = js.undefined,
        lastUpdatedDateTime: js.UndefOr[Timestamp] = js.undefined,
        localeId: js.UndefOr[LocaleId] = js.undefined,
        localeName: js.UndefOr[LocaleName] = js.undefined,
        nluIntentConfidenceThreshold: js.UndefOr[ConfidenceThreshold] = js.undefined,
        slotTypesCount: js.UndefOr[ResourceCount] = js.undefined,
        voiceSettings: js.UndefOr[VoiceSettings] = js.undefined
    ): DescribeBotLocaleResponse = {
      val __obj = js.Dynamic.literal()
      botId.foreach(__v => __obj.updateDynamic("botId")(__v.asInstanceOf[js.Any]))
      botLocaleHistoryEvents.foreach(__v => __obj.updateDynamic("botLocaleHistoryEvents")(__v.asInstanceOf[js.Any]))
      botLocaleStatus.foreach(__v => __obj.updateDynamic("botLocaleStatus")(__v.asInstanceOf[js.Any]))
      botVersion.foreach(__v => __obj.updateDynamic("botVersion")(__v.asInstanceOf[js.Any]))
      creationDateTime.foreach(__v => __obj.updateDynamic("creationDateTime")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      failureReasons.foreach(__v => __obj.updateDynamic("failureReasons")(__v.asInstanceOf[js.Any]))
      intentsCount.foreach(__v => __obj.updateDynamic("intentsCount")(__v.asInstanceOf[js.Any]))
      lastBuildSubmittedDateTime.foreach(__v => __obj.updateDynamic("lastBuildSubmittedDateTime")(__v.asInstanceOf[js.Any]))
      lastUpdatedDateTime.foreach(__v => __obj.updateDynamic("lastUpdatedDateTime")(__v.asInstanceOf[js.Any]))
      localeId.foreach(__v => __obj.updateDynamic("localeId")(__v.asInstanceOf[js.Any]))
      localeName.foreach(__v => __obj.updateDynamic("localeName")(__v.asInstanceOf[js.Any]))
      nluIntentConfidenceThreshold.foreach(__v => __obj.updateDynamic("nluIntentConfidenceThreshold")(__v.asInstanceOf[js.Any]))
      slotTypesCount.foreach(__v => __obj.updateDynamic("slotTypesCount")(__v.asInstanceOf[js.Any]))
      voiceSettings.foreach(__v => __obj.updateDynamic("voiceSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeBotLocaleResponse]
    }
  }

  @js.native
  trait DescribeBotRequest extends js.Object {
    var botId: Id
  }

  object DescribeBotRequest {
    @inline
    def apply(
        botId: Id
    ): DescribeBotRequest = {
      val __obj = js.Dynamic.literal(
        "botId" -> botId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeBotRequest]
    }
  }

  @js.native
  trait DescribeBotResponse extends js.Object {
    var botId: js.UndefOr[Id]
    var botName: js.UndefOr[Name]
    var botStatus: js.UndefOr[BotStatus]
    var creationDateTime: js.UndefOr[Timestamp]
    var dataPrivacy: js.UndefOr[DataPrivacy]
    var description: js.UndefOr[Description]
    var idleSessionTTLInSeconds: js.UndefOr[SessionTTL]
    var lastUpdatedDateTime: js.UndefOr[Timestamp]
    var roleArn: js.UndefOr[RoleArn]
  }

  object DescribeBotResponse {
    @inline
    def apply(
        botId: js.UndefOr[Id] = js.undefined,
        botName: js.UndefOr[Name] = js.undefined,
        botStatus: js.UndefOr[BotStatus] = js.undefined,
        creationDateTime: js.UndefOr[Timestamp] = js.undefined,
        dataPrivacy: js.UndefOr[DataPrivacy] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        idleSessionTTLInSeconds: js.UndefOr[SessionTTL] = js.undefined,
        lastUpdatedDateTime: js.UndefOr[Timestamp] = js.undefined,
        roleArn: js.UndefOr[RoleArn] = js.undefined
    ): DescribeBotResponse = {
      val __obj = js.Dynamic.literal()
      botId.foreach(__v => __obj.updateDynamic("botId")(__v.asInstanceOf[js.Any]))
      botName.foreach(__v => __obj.updateDynamic("botName")(__v.asInstanceOf[js.Any]))
      botStatus.foreach(__v => __obj.updateDynamic("botStatus")(__v.asInstanceOf[js.Any]))
      creationDateTime.foreach(__v => __obj.updateDynamic("creationDateTime")(__v.asInstanceOf[js.Any]))
      dataPrivacy.foreach(__v => __obj.updateDynamic("dataPrivacy")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      idleSessionTTLInSeconds.foreach(__v => __obj.updateDynamic("idleSessionTTLInSeconds")(__v.asInstanceOf[js.Any]))
      lastUpdatedDateTime.foreach(__v => __obj.updateDynamic("lastUpdatedDateTime")(__v.asInstanceOf[js.Any]))
      roleArn.foreach(__v => __obj.updateDynamic("roleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeBotResponse]
    }
  }

  @js.native
  trait DescribeBotVersionRequest extends js.Object {
    var botId: Id
    var botVersion: NumericalBotVersion
  }

  object DescribeBotVersionRequest {
    @inline
    def apply(
        botId: Id,
        botVersion: NumericalBotVersion
    ): DescribeBotVersionRequest = {
      val __obj = js.Dynamic.literal(
        "botId" -> botId.asInstanceOf[js.Any],
        "botVersion" -> botVersion.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeBotVersionRequest]
    }
  }

  @js.native
  trait DescribeBotVersionResponse extends js.Object {
    var botId: js.UndefOr[Id]
    var botName: js.UndefOr[Name]
    var botStatus: js.UndefOr[BotStatus]
    var botVersion: js.UndefOr[NumericalBotVersion]
    var creationDateTime: js.UndefOr[Timestamp]
    var dataPrivacy: js.UndefOr[DataPrivacy]
    var description: js.UndefOr[Description]
    var failureReasons: js.UndefOr[FailureReasons]
    var idleSessionTTLInSeconds: js.UndefOr[SessionTTL]
    var roleArn: js.UndefOr[RoleArn]
  }

  object DescribeBotVersionResponse {
    @inline
    def apply(
        botId: js.UndefOr[Id] = js.undefined,
        botName: js.UndefOr[Name] = js.undefined,
        botStatus: js.UndefOr[BotStatus] = js.undefined,
        botVersion: js.UndefOr[NumericalBotVersion] = js.undefined,
        creationDateTime: js.UndefOr[Timestamp] = js.undefined,
        dataPrivacy: js.UndefOr[DataPrivacy] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        failureReasons: js.UndefOr[FailureReasons] = js.undefined,
        idleSessionTTLInSeconds: js.UndefOr[SessionTTL] = js.undefined,
        roleArn: js.UndefOr[RoleArn] = js.undefined
    ): DescribeBotVersionResponse = {
      val __obj = js.Dynamic.literal()
      botId.foreach(__v => __obj.updateDynamic("botId")(__v.asInstanceOf[js.Any]))
      botName.foreach(__v => __obj.updateDynamic("botName")(__v.asInstanceOf[js.Any]))
      botStatus.foreach(__v => __obj.updateDynamic("botStatus")(__v.asInstanceOf[js.Any]))
      botVersion.foreach(__v => __obj.updateDynamic("botVersion")(__v.asInstanceOf[js.Any]))
      creationDateTime.foreach(__v => __obj.updateDynamic("creationDateTime")(__v.asInstanceOf[js.Any]))
      dataPrivacy.foreach(__v => __obj.updateDynamic("dataPrivacy")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      failureReasons.foreach(__v => __obj.updateDynamic("failureReasons")(__v.asInstanceOf[js.Any]))
      idleSessionTTLInSeconds.foreach(__v => __obj.updateDynamic("idleSessionTTLInSeconds")(__v.asInstanceOf[js.Any]))
      roleArn.foreach(__v => __obj.updateDynamic("roleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeBotVersionResponse]
    }
  }

  @js.native
  trait DescribeIntentRequest extends js.Object {
    var botId: Id
    var botVersion: BotVersion
    var intentId: Id
    var localeId: LocaleId
  }

  object DescribeIntentRequest {
    @inline
    def apply(
        botId: Id,
        botVersion: BotVersion,
        intentId: Id,
        localeId: LocaleId
    ): DescribeIntentRequest = {
      val __obj = js.Dynamic.literal(
        "botId" -> botId.asInstanceOf[js.Any],
        "botVersion" -> botVersion.asInstanceOf[js.Any],
        "intentId" -> intentId.asInstanceOf[js.Any],
        "localeId" -> localeId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeIntentRequest]
    }
  }

  @js.native
  trait DescribeIntentResponse extends js.Object {
    var botId: js.UndefOr[Id]
    var botVersion: js.UndefOr[DraftBotVersion]
    var creationDateTime: js.UndefOr[Timestamp]
    var description: js.UndefOr[Description]
    var dialogCodeHook: js.UndefOr[DialogCodeHookSettings]
    var fulfillmentCodeHook: js.UndefOr[FulfillmentCodeHookSettings]
    var inputContexts: js.UndefOr[InputContextsList]
    var intentClosingSetting: js.UndefOr[IntentClosingSetting]
    var intentConfirmationSetting: js.UndefOr[IntentConfirmationSetting]
    var intentId: js.UndefOr[Id]
    var intentName: js.UndefOr[Name]
    var kendraConfiguration: js.UndefOr[KendraConfiguration]
    var lastUpdatedDateTime: js.UndefOr[Timestamp]
    var localeId: js.UndefOr[LocaleId]
    var outputContexts: js.UndefOr[OutputContextsList]
    var parentIntentSignature: js.UndefOr[IntentSignature]
    var sampleUtterances: js.UndefOr[SampleUtterancesList]
    var slotPriorities: js.UndefOr[SlotPrioritiesList]
  }

  object DescribeIntentResponse {
    @inline
    def apply(
        botId: js.UndefOr[Id] = js.undefined,
        botVersion: js.UndefOr[DraftBotVersion] = js.undefined,
        creationDateTime: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        dialogCodeHook: js.UndefOr[DialogCodeHookSettings] = js.undefined,
        fulfillmentCodeHook: js.UndefOr[FulfillmentCodeHookSettings] = js.undefined,
        inputContexts: js.UndefOr[InputContextsList] = js.undefined,
        intentClosingSetting: js.UndefOr[IntentClosingSetting] = js.undefined,
        intentConfirmationSetting: js.UndefOr[IntentConfirmationSetting] = js.undefined,
        intentId: js.UndefOr[Id] = js.undefined,
        intentName: js.UndefOr[Name] = js.undefined,
        kendraConfiguration: js.UndefOr[KendraConfiguration] = js.undefined,
        lastUpdatedDateTime: js.UndefOr[Timestamp] = js.undefined,
        localeId: js.UndefOr[LocaleId] = js.undefined,
        outputContexts: js.UndefOr[OutputContextsList] = js.undefined,
        parentIntentSignature: js.UndefOr[IntentSignature] = js.undefined,
        sampleUtterances: js.UndefOr[SampleUtterancesList] = js.undefined,
        slotPriorities: js.UndefOr[SlotPrioritiesList] = js.undefined
    ): DescribeIntentResponse = {
      val __obj = js.Dynamic.literal()
      botId.foreach(__v => __obj.updateDynamic("botId")(__v.asInstanceOf[js.Any]))
      botVersion.foreach(__v => __obj.updateDynamic("botVersion")(__v.asInstanceOf[js.Any]))
      creationDateTime.foreach(__v => __obj.updateDynamic("creationDateTime")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      dialogCodeHook.foreach(__v => __obj.updateDynamic("dialogCodeHook")(__v.asInstanceOf[js.Any]))
      fulfillmentCodeHook.foreach(__v => __obj.updateDynamic("fulfillmentCodeHook")(__v.asInstanceOf[js.Any]))
      inputContexts.foreach(__v => __obj.updateDynamic("inputContexts")(__v.asInstanceOf[js.Any]))
      intentClosingSetting.foreach(__v => __obj.updateDynamic("intentClosingSetting")(__v.asInstanceOf[js.Any]))
      intentConfirmationSetting.foreach(__v => __obj.updateDynamic("intentConfirmationSetting")(__v.asInstanceOf[js.Any]))
      intentId.foreach(__v => __obj.updateDynamic("intentId")(__v.asInstanceOf[js.Any]))
      intentName.foreach(__v => __obj.updateDynamic("intentName")(__v.asInstanceOf[js.Any]))
      kendraConfiguration.foreach(__v => __obj.updateDynamic("kendraConfiguration")(__v.asInstanceOf[js.Any]))
      lastUpdatedDateTime.foreach(__v => __obj.updateDynamic("lastUpdatedDateTime")(__v.asInstanceOf[js.Any]))
      localeId.foreach(__v => __obj.updateDynamic("localeId")(__v.asInstanceOf[js.Any]))
      outputContexts.foreach(__v => __obj.updateDynamic("outputContexts")(__v.asInstanceOf[js.Any]))
      parentIntentSignature.foreach(__v => __obj.updateDynamic("parentIntentSignature")(__v.asInstanceOf[js.Any]))
      sampleUtterances.foreach(__v => __obj.updateDynamic("sampleUtterances")(__v.asInstanceOf[js.Any]))
      slotPriorities.foreach(__v => __obj.updateDynamic("slotPriorities")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeIntentResponse]
    }
  }

  @js.native
  trait DescribeSlotRequest extends js.Object {
    var botId: Id
    var botVersion: BotVersion
    var intentId: Id
    var localeId: LocaleId
    var slotId: Id
  }

  object DescribeSlotRequest {
    @inline
    def apply(
        botId: Id,
        botVersion: BotVersion,
        intentId: Id,
        localeId: LocaleId,
        slotId: Id
    ): DescribeSlotRequest = {
      val __obj = js.Dynamic.literal(
        "botId" -> botId.asInstanceOf[js.Any],
        "botVersion" -> botVersion.asInstanceOf[js.Any],
        "intentId" -> intentId.asInstanceOf[js.Any],
        "localeId" -> localeId.asInstanceOf[js.Any],
        "slotId" -> slotId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeSlotRequest]
    }
  }

  @js.native
  trait DescribeSlotResponse extends js.Object {
    var botId: js.UndefOr[Id]
    var botVersion: js.UndefOr[BotVersion]
    var creationDateTime: js.UndefOr[Timestamp]
    var description: js.UndefOr[Description]
    var intentId: js.UndefOr[Id]
    var lastUpdatedDateTime: js.UndefOr[Timestamp]
    var localeId: js.UndefOr[LocaleId]
    var obfuscationSetting: js.UndefOr[ObfuscationSetting]
    var slotId: js.UndefOr[Id]
    var slotName: js.UndefOr[Name]
    var slotTypeId: js.UndefOr[BuiltInOrCustomSlotTypeId]
    var valueElicitationSetting: js.UndefOr[SlotValueElicitationSetting]
  }

  object DescribeSlotResponse {
    @inline
    def apply(
        botId: js.UndefOr[Id] = js.undefined,
        botVersion: js.UndefOr[BotVersion] = js.undefined,
        creationDateTime: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        intentId: js.UndefOr[Id] = js.undefined,
        lastUpdatedDateTime: js.UndefOr[Timestamp] = js.undefined,
        localeId: js.UndefOr[LocaleId] = js.undefined,
        obfuscationSetting: js.UndefOr[ObfuscationSetting] = js.undefined,
        slotId: js.UndefOr[Id] = js.undefined,
        slotName: js.UndefOr[Name] = js.undefined,
        slotTypeId: js.UndefOr[BuiltInOrCustomSlotTypeId] = js.undefined,
        valueElicitationSetting: js.UndefOr[SlotValueElicitationSetting] = js.undefined
    ): DescribeSlotResponse = {
      val __obj = js.Dynamic.literal()
      botId.foreach(__v => __obj.updateDynamic("botId")(__v.asInstanceOf[js.Any]))
      botVersion.foreach(__v => __obj.updateDynamic("botVersion")(__v.asInstanceOf[js.Any]))
      creationDateTime.foreach(__v => __obj.updateDynamic("creationDateTime")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      intentId.foreach(__v => __obj.updateDynamic("intentId")(__v.asInstanceOf[js.Any]))
      lastUpdatedDateTime.foreach(__v => __obj.updateDynamic("lastUpdatedDateTime")(__v.asInstanceOf[js.Any]))
      localeId.foreach(__v => __obj.updateDynamic("localeId")(__v.asInstanceOf[js.Any]))
      obfuscationSetting.foreach(__v => __obj.updateDynamic("obfuscationSetting")(__v.asInstanceOf[js.Any]))
      slotId.foreach(__v => __obj.updateDynamic("slotId")(__v.asInstanceOf[js.Any]))
      slotName.foreach(__v => __obj.updateDynamic("slotName")(__v.asInstanceOf[js.Any]))
      slotTypeId.foreach(__v => __obj.updateDynamic("slotTypeId")(__v.asInstanceOf[js.Any]))
      valueElicitationSetting.foreach(__v => __obj.updateDynamic("valueElicitationSetting")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSlotResponse]
    }
  }

  @js.native
  trait DescribeSlotTypeRequest extends js.Object {
    var botId: Id
    var botVersion: BotVersion
    var localeId: LocaleId
    var slotTypeId: Id
  }

  object DescribeSlotTypeRequest {
    @inline
    def apply(
        botId: Id,
        botVersion: BotVersion,
        localeId: LocaleId,
        slotTypeId: Id
    ): DescribeSlotTypeRequest = {
      val __obj = js.Dynamic.literal(
        "botId" -> botId.asInstanceOf[js.Any],
        "botVersion" -> botVersion.asInstanceOf[js.Any],
        "localeId" -> localeId.asInstanceOf[js.Any],
        "slotTypeId" -> slotTypeId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeSlotTypeRequest]
    }
  }

  @js.native
  trait DescribeSlotTypeResponse extends js.Object {
    var botId: js.UndefOr[Id]
    var botVersion: js.UndefOr[BotVersion]
    var creationDateTime: js.UndefOr[Timestamp]
    var description: js.UndefOr[Description]
    var lastUpdatedDateTime: js.UndefOr[Timestamp]
    var localeId: js.UndefOr[LocaleId]
    var parentSlotTypeSignature: js.UndefOr[SlotTypeSignature]
    var slotTypeId: js.UndefOr[Id]
    var slotTypeName: js.UndefOr[Name]
    var slotTypeValues: js.UndefOr[SlotTypeValues]
    var valueSelectionSetting: js.UndefOr[SlotValueSelectionSetting]
  }

  object DescribeSlotTypeResponse {
    @inline
    def apply(
        botId: js.UndefOr[Id] = js.undefined,
        botVersion: js.UndefOr[BotVersion] = js.undefined,
        creationDateTime: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        lastUpdatedDateTime: js.UndefOr[Timestamp] = js.undefined,
        localeId: js.UndefOr[LocaleId] = js.undefined,
        parentSlotTypeSignature: js.UndefOr[SlotTypeSignature] = js.undefined,
        slotTypeId: js.UndefOr[Id] = js.undefined,
        slotTypeName: js.UndefOr[Name] = js.undefined,
        slotTypeValues: js.UndefOr[SlotTypeValues] = js.undefined,
        valueSelectionSetting: js.UndefOr[SlotValueSelectionSetting] = js.undefined
    ): DescribeSlotTypeResponse = {
      val __obj = js.Dynamic.literal()
      botId.foreach(__v => __obj.updateDynamic("botId")(__v.asInstanceOf[js.Any]))
      botVersion.foreach(__v => __obj.updateDynamic("botVersion")(__v.asInstanceOf[js.Any]))
      creationDateTime.foreach(__v => __obj.updateDynamic("creationDateTime")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      lastUpdatedDateTime.foreach(__v => __obj.updateDynamic("lastUpdatedDateTime")(__v.asInstanceOf[js.Any]))
      localeId.foreach(__v => __obj.updateDynamic("localeId")(__v.asInstanceOf[js.Any]))
      parentSlotTypeSignature.foreach(__v => __obj.updateDynamic("parentSlotTypeSignature")(__v.asInstanceOf[js.Any]))
      slotTypeId.foreach(__v => __obj.updateDynamic("slotTypeId")(__v.asInstanceOf[js.Any]))
      slotTypeName.foreach(__v => __obj.updateDynamic("slotTypeName")(__v.asInstanceOf[js.Any]))
      slotTypeValues.foreach(__v => __obj.updateDynamic("slotTypeValues")(__v.asInstanceOf[js.Any]))
      valueSelectionSetting.foreach(__v => __obj.updateDynamic("valueSelectionSetting")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSlotTypeResponse]
    }
  }

  /** Settings that determine the Lambda function that Amazon Lex uses for processing user responses.
    */
  @js.native
  trait DialogCodeHookSettings extends js.Object {
    var enabled: Boolean
  }

  object DialogCodeHookSettings {
    @inline
    def apply(
        enabled: Boolean
    ): DialogCodeHookSettings = {
      val __obj = js.Dynamic.literal(
        "enabled" -> enabled.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DialogCodeHookSettings]
    }
  }

  /** Determines if a Lambda function should be invoked for a specific intent.
    */
  @js.native
  trait FulfillmentCodeHookSettings extends js.Object {
    var enabled: Boolean
  }

  object FulfillmentCodeHookSettings {
    @inline
    def apply(
        enabled: Boolean
    ): FulfillmentCodeHookSettings = {
      val __obj = js.Dynamic.literal(
        "enabled" -> enabled.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[FulfillmentCodeHookSettings]
    }
  }

  /** A card that is shown to the user by a messaging platform. You define the contents of the card, the card is displayed by the platform. When you use a response card, the response from the user is constrained to the text associated with a button on the card.
    */
  @js.native
  trait ImageResponseCard extends js.Object {
    var title: AttachmentTitle
    var buttons: js.UndefOr[ButtonsList]
    var imageUrl: js.UndefOr[AttachmentUrl]
    var subtitle: js.UndefOr[AttachmentTitle]
  }

  object ImageResponseCard {
    @inline
    def apply(
        title: AttachmentTitle,
        buttons: js.UndefOr[ButtonsList] = js.undefined,
        imageUrl: js.UndefOr[AttachmentUrl] = js.undefined,
        subtitle: js.UndefOr[AttachmentTitle] = js.undefined
    ): ImageResponseCard = {
      val __obj = js.Dynamic.literal(
        "title" -> title.asInstanceOf[js.Any]
      )

      buttons.foreach(__v => __obj.updateDynamic("buttons")(__v.asInstanceOf[js.Any]))
      imageUrl.foreach(__v => __obj.updateDynamic("imageUrl")(__v.asInstanceOf[js.Any]))
      subtitle.foreach(__v => __obj.updateDynamic("subtitle")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImageResponseCard]
    }
  }

  /** The name of a context that must be active for an intent to be selected by Amazon Lex.
    */
  @js.native
  trait InputContext extends js.Object {
    var name: Name
  }

  object InputContext {
    @inline
    def apply(
        name: Name
    ): InputContext = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[InputContext]
    }
  }

  /** Provides a statement the Amazon Lex conveys to the user when the intent is successfully fulfilled.
    */
  @js.native
  trait IntentClosingSetting extends js.Object {
    var closingResponse: ResponseSpecification
  }

  object IntentClosingSetting {
    @inline
    def apply(
        closingResponse: ResponseSpecification
    ): IntentClosingSetting = {
      val __obj = js.Dynamic.literal(
        "closingResponse" -> closingResponse.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[IntentClosingSetting]
    }
  }

  /** Provides a prompt for making sure that the user is ready for the intent to be fulfilled.
    */
  @js.native
  trait IntentConfirmationSetting extends js.Object {
    var declinationResponse: ResponseSpecification
    var promptSpecification: PromptSpecification
  }

  object IntentConfirmationSetting {
    @inline
    def apply(
        declinationResponse: ResponseSpecification,
        promptSpecification: PromptSpecification
    ): IntentConfirmationSetting = {
      val __obj = js.Dynamic.literal(
        "declinationResponse" -> declinationResponse.asInstanceOf[js.Any],
        "promptSpecification" -> promptSpecification.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[IntentConfirmationSetting]
    }
  }

  /** Filters the response from the <code>ListIntents</code> operation.
    */
  @js.native
  trait IntentFilter extends js.Object {
    var name: IntentFilterName
    var operator: IntentFilterOperator
    var values: FilterValues
  }

  object IntentFilter {
    @inline
    def apply(
        name: IntentFilterName,
        operator: IntentFilterOperator,
        values: FilterValues
    ): IntentFilter = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "operator" -> operator.asInstanceOf[js.Any],
        "values" -> values.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[IntentFilter]
    }
  }

  /** Specifies attributes for sorting a list of intents.
    */
  @js.native
  trait IntentSortBy extends js.Object {
    var attribute: IntentSortAttribute
    var order: SortOrder
  }

  object IntentSortBy {
    @inline
    def apply(
        attribute: IntentSortAttribute,
        order: SortOrder
    ): IntentSortBy = {
      val __obj = js.Dynamic.literal(
        "attribute" -> attribute.asInstanceOf[js.Any],
        "order" -> order.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[IntentSortBy]
    }
  }

  /** Summary information about an intent returned by the <code>ListIntents</code> operation.
    */
  @js.native
  trait IntentSummary extends js.Object {
    var description: js.UndefOr[Description]
    var inputContexts: js.UndefOr[InputContextsList]
    var intentId: js.UndefOr[Id]
    var intentName: js.UndefOr[Name]
    var lastUpdatedDateTime: js.UndefOr[Timestamp]
    var outputContexts: js.UndefOr[OutputContextsList]
    var parentIntentSignature: js.UndefOr[IntentSignature]
  }

  object IntentSummary {
    @inline
    def apply(
        description: js.UndefOr[Description] = js.undefined,
        inputContexts: js.UndefOr[InputContextsList] = js.undefined,
        intentId: js.UndefOr[Id] = js.undefined,
        intentName: js.UndefOr[Name] = js.undefined,
        lastUpdatedDateTime: js.UndefOr[Timestamp] = js.undefined,
        outputContexts: js.UndefOr[OutputContextsList] = js.undefined,
        parentIntentSignature: js.UndefOr[IntentSignature] = js.undefined
    ): IntentSummary = {
      val __obj = js.Dynamic.literal()
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      inputContexts.foreach(__v => __obj.updateDynamic("inputContexts")(__v.asInstanceOf[js.Any]))
      intentId.foreach(__v => __obj.updateDynamic("intentId")(__v.asInstanceOf[js.Any]))
      intentName.foreach(__v => __obj.updateDynamic("intentName")(__v.asInstanceOf[js.Any]))
      lastUpdatedDateTime.foreach(__v => __obj.updateDynamic("lastUpdatedDateTime")(__v.asInstanceOf[js.Any]))
      outputContexts.foreach(__v => __obj.updateDynamic("outputContexts")(__v.asInstanceOf[js.Any]))
      parentIntentSignature.foreach(__v => __obj.updateDynamic("parentIntentSignature")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IntentSummary]
    }
  }

  /** Provides configuration information for the AMAZON.KendraSearchIntent intent. When you use this intent, Amazon Lex searches the specified Amazon Kendra index and returns documents from the index that match the user's utterance.
    */
  @js.native
  trait KendraConfiguration extends js.Object {
    var kendraIndex: KendraIndexArn
    var queryFilterString: js.UndefOr[QueryFilterString]
    var queryFilterStringEnabled: js.UndefOr[Boolean]
  }

  object KendraConfiguration {
    @inline
    def apply(
        kendraIndex: KendraIndexArn,
        queryFilterString: js.UndefOr[QueryFilterString] = js.undefined,
        queryFilterStringEnabled: js.UndefOr[Boolean] = js.undefined
    ): KendraConfiguration = {
      val __obj = js.Dynamic.literal(
        "kendraIndex" -> kendraIndex.asInstanceOf[js.Any]
      )

      queryFilterString.foreach(__v => __obj.updateDynamic("queryFilterString")(__v.asInstanceOf[js.Any]))
      queryFilterStringEnabled.foreach(__v => __obj.updateDynamic("queryFilterStringEnabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KendraConfiguration]
    }
  }

  /** Specifies a Lambda function that verifies requests to a bot or fulfilles the user's request to a bot.
    */
  @js.native
  trait LambdaCodeHook extends js.Object {
    var codeHookInterfaceVersion: CodeHookInterfaceVersion
    var lambdaARN: LambdaARN
  }

  object LambdaCodeHook {
    @inline
    def apply(
        codeHookInterfaceVersion: CodeHookInterfaceVersion,
        lambdaARN: LambdaARN
    ): LambdaCodeHook = {
      val __obj = js.Dynamic.literal(
        "codeHookInterfaceVersion" -> codeHookInterfaceVersion.asInstanceOf[js.Any],
        "lambdaARN" -> lambdaARN.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[LambdaCodeHook]
    }
  }

  @js.native
  trait ListBotAliasesRequest extends js.Object {
    var botId: Id
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListBotAliasesRequest {
    @inline
    def apply(
        botId: Id,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListBotAliasesRequest = {
      val __obj = js.Dynamic.literal(
        "botId" -> botId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBotAliasesRequest]
    }
  }

  @js.native
  trait ListBotAliasesResponse extends js.Object {
    var botAliasSummaries: js.UndefOr[BotAliasSummaryList]
    var botId: js.UndefOr[Id]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListBotAliasesResponse {
    @inline
    def apply(
        botAliasSummaries: js.UndefOr[BotAliasSummaryList] = js.undefined,
        botId: js.UndefOr[Id] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListBotAliasesResponse = {
      val __obj = js.Dynamic.literal()
      botAliasSummaries.foreach(__v => __obj.updateDynamic("botAliasSummaries")(__v.asInstanceOf[js.Any]))
      botId.foreach(__v => __obj.updateDynamic("botId")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBotAliasesResponse]
    }
  }

  @js.native
  trait ListBotLocalesRequest extends js.Object {
    var botId: Id
    var botVersion: BotVersion
    var filters: js.UndefOr[BotLocaleFilters]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var sortBy: js.UndefOr[BotLocaleSortBy]
  }

  object ListBotLocalesRequest {
    @inline
    def apply(
        botId: Id,
        botVersion: BotVersion,
        filters: js.UndefOr[BotLocaleFilters] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        sortBy: js.UndefOr[BotLocaleSortBy] = js.undefined
    ): ListBotLocalesRequest = {
      val __obj = js.Dynamic.literal(
        "botId" -> botId.asInstanceOf[js.Any],
        "botVersion" -> botVersion.asInstanceOf[js.Any]
      )

      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      sortBy.foreach(__v => __obj.updateDynamic("sortBy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBotLocalesRequest]
    }
  }

  @js.native
  trait ListBotLocalesResponse extends js.Object {
    var botId: js.UndefOr[Id]
    var botLocaleSummaries: js.UndefOr[BotLocaleSummaryList]
    var botVersion: js.UndefOr[BotVersion]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListBotLocalesResponse {
    @inline
    def apply(
        botId: js.UndefOr[Id] = js.undefined,
        botLocaleSummaries: js.UndefOr[BotLocaleSummaryList] = js.undefined,
        botVersion: js.UndefOr[BotVersion] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListBotLocalesResponse = {
      val __obj = js.Dynamic.literal()
      botId.foreach(__v => __obj.updateDynamic("botId")(__v.asInstanceOf[js.Any]))
      botLocaleSummaries.foreach(__v => __obj.updateDynamic("botLocaleSummaries")(__v.asInstanceOf[js.Any]))
      botVersion.foreach(__v => __obj.updateDynamic("botVersion")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBotLocalesResponse]
    }
  }

  @js.native
  trait ListBotVersionsRequest extends js.Object {
    var botId: Id
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var sortBy: js.UndefOr[BotVersionSortBy]
  }

  object ListBotVersionsRequest {
    @inline
    def apply(
        botId: Id,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        sortBy: js.UndefOr[BotVersionSortBy] = js.undefined
    ): ListBotVersionsRequest = {
      val __obj = js.Dynamic.literal(
        "botId" -> botId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      sortBy.foreach(__v => __obj.updateDynamic("sortBy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBotVersionsRequest]
    }
  }

  @js.native
  trait ListBotVersionsResponse extends js.Object {
    var botId: js.UndefOr[Id]
    var botVersionSummaries: js.UndefOr[BotVersionSummaryList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListBotVersionsResponse {
    @inline
    def apply(
        botId: js.UndefOr[Id] = js.undefined,
        botVersionSummaries: js.UndefOr[BotVersionSummaryList] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListBotVersionsResponse = {
      val __obj = js.Dynamic.literal()
      botId.foreach(__v => __obj.updateDynamic("botId")(__v.asInstanceOf[js.Any]))
      botVersionSummaries.foreach(__v => __obj.updateDynamic("botVersionSummaries")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBotVersionsResponse]
    }
  }

  @js.native
  trait ListBotsRequest extends js.Object {
    var filters: js.UndefOr[BotFilters]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var sortBy: js.UndefOr[BotSortBy]
  }

  object ListBotsRequest {
    @inline
    def apply(
        filters: js.UndefOr[BotFilters] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        sortBy: js.UndefOr[BotSortBy] = js.undefined
    ): ListBotsRequest = {
      val __obj = js.Dynamic.literal()
      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      sortBy.foreach(__v => __obj.updateDynamic("sortBy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBotsRequest]
    }
  }

  @js.native
  trait ListBotsResponse extends js.Object {
    var botSummaries: js.UndefOr[BotSummaryList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListBotsResponse {
    @inline
    def apply(
        botSummaries: js.UndefOr[BotSummaryList] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListBotsResponse = {
      val __obj = js.Dynamic.literal()
      botSummaries.foreach(__v => __obj.updateDynamic("botSummaries")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBotsResponse]
    }
  }

  @js.native
  trait ListBuiltInIntentsRequest extends js.Object {
    var localeId: LocaleId
    var maxResults: js.UndefOr[BuiltInsMaxResults]
    var nextToken: js.UndefOr[NextToken]
    var sortBy: js.UndefOr[BuiltInIntentSortBy]
  }

  object ListBuiltInIntentsRequest {
    @inline
    def apply(
        localeId: LocaleId,
        maxResults: js.UndefOr[BuiltInsMaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        sortBy: js.UndefOr[BuiltInIntentSortBy] = js.undefined
    ): ListBuiltInIntentsRequest = {
      val __obj = js.Dynamic.literal(
        "localeId" -> localeId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      sortBy.foreach(__v => __obj.updateDynamic("sortBy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBuiltInIntentsRequest]
    }
  }

  @js.native
  trait ListBuiltInIntentsResponse extends js.Object {
    var builtInIntentSummaries: js.UndefOr[BuiltInIntentSummaryList]
    var localeId: js.UndefOr[LocaleId]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListBuiltInIntentsResponse {
    @inline
    def apply(
        builtInIntentSummaries: js.UndefOr[BuiltInIntentSummaryList] = js.undefined,
        localeId: js.UndefOr[LocaleId] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListBuiltInIntentsResponse = {
      val __obj = js.Dynamic.literal()
      builtInIntentSummaries.foreach(__v => __obj.updateDynamic("builtInIntentSummaries")(__v.asInstanceOf[js.Any]))
      localeId.foreach(__v => __obj.updateDynamic("localeId")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBuiltInIntentsResponse]
    }
  }

  @js.native
  trait ListBuiltInSlotTypesRequest extends js.Object {
    var localeId: LocaleId
    var maxResults: js.UndefOr[BuiltInsMaxResults]
    var nextToken: js.UndefOr[NextToken]
    var sortBy: js.UndefOr[BuiltInSlotTypeSortBy]
  }

  object ListBuiltInSlotTypesRequest {
    @inline
    def apply(
        localeId: LocaleId,
        maxResults: js.UndefOr[BuiltInsMaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        sortBy: js.UndefOr[BuiltInSlotTypeSortBy] = js.undefined
    ): ListBuiltInSlotTypesRequest = {
      val __obj = js.Dynamic.literal(
        "localeId" -> localeId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      sortBy.foreach(__v => __obj.updateDynamic("sortBy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBuiltInSlotTypesRequest]
    }
  }

  @js.native
  trait ListBuiltInSlotTypesResponse extends js.Object {
    var builtInSlotTypeSummaries: js.UndefOr[BuiltInSlotTypeSummaryList]
    var localeId: js.UndefOr[LocaleId]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListBuiltInSlotTypesResponse {
    @inline
    def apply(
        builtInSlotTypeSummaries: js.UndefOr[BuiltInSlotTypeSummaryList] = js.undefined,
        localeId: js.UndefOr[LocaleId] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListBuiltInSlotTypesResponse = {
      val __obj = js.Dynamic.literal()
      builtInSlotTypeSummaries.foreach(__v => __obj.updateDynamic("builtInSlotTypeSummaries")(__v.asInstanceOf[js.Any]))
      localeId.foreach(__v => __obj.updateDynamic("localeId")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBuiltInSlotTypesResponse]
    }
  }

  @js.native
  trait ListIntentsRequest extends js.Object {
    var botId: Id
    var botVersion: BotVersion
    var localeId: LocaleId
    var filters: js.UndefOr[IntentFilters]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var sortBy: js.UndefOr[IntentSortBy]
  }

  object ListIntentsRequest {
    @inline
    def apply(
        botId: Id,
        botVersion: BotVersion,
        localeId: LocaleId,
        filters: js.UndefOr[IntentFilters] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        sortBy: js.UndefOr[IntentSortBy] = js.undefined
    ): ListIntentsRequest = {
      val __obj = js.Dynamic.literal(
        "botId" -> botId.asInstanceOf[js.Any],
        "botVersion" -> botVersion.asInstanceOf[js.Any],
        "localeId" -> localeId.asInstanceOf[js.Any]
      )

      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      sortBy.foreach(__v => __obj.updateDynamic("sortBy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListIntentsRequest]
    }
  }

  @js.native
  trait ListIntentsResponse extends js.Object {
    var botId: js.UndefOr[Id]
    var botVersion: js.UndefOr[BotVersion]
    var intentSummaries: js.UndefOr[IntentSummaryList]
    var localeId: js.UndefOr[LocaleId]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListIntentsResponse {
    @inline
    def apply(
        botId: js.UndefOr[Id] = js.undefined,
        botVersion: js.UndefOr[BotVersion] = js.undefined,
        intentSummaries: js.UndefOr[IntentSummaryList] = js.undefined,
        localeId: js.UndefOr[LocaleId] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListIntentsResponse = {
      val __obj = js.Dynamic.literal()
      botId.foreach(__v => __obj.updateDynamic("botId")(__v.asInstanceOf[js.Any]))
      botVersion.foreach(__v => __obj.updateDynamic("botVersion")(__v.asInstanceOf[js.Any]))
      intentSummaries.foreach(__v => __obj.updateDynamic("intentSummaries")(__v.asInstanceOf[js.Any]))
      localeId.foreach(__v => __obj.updateDynamic("localeId")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListIntentsResponse]
    }
  }

  @js.native
  trait ListSlotTypesRequest extends js.Object {
    var botId: Id
    var botVersion: BotVersion
    var localeId: LocaleId
    var filters: js.UndefOr[SlotTypeFilters]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var sortBy: js.UndefOr[SlotTypeSortBy]
  }

  object ListSlotTypesRequest {
    @inline
    def apply(
        botId: Id,
        botVersion: BotVersion,
        localeId: LocaleId,
        filters: js.UndefOr[SlotTypeFilters] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        sortBy: js.UndefOr[SlotTypeSortBy] = js.undefined
    ): ListSlotTypesRequest = {
      val __obj = js.Dynamic.literal(
        "botId" -> botId.asInstanceOf[js.Any],
        "botVersion" -> botVersion.asInstanceOf[js.Any],
        "localeId" -> localeId.asInstanceOf[js.Any]
      )

      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      sortBy.foreach(__v => __obj.updateDynamic("sortBy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSlotTypesRequest]
    }
  }

  @js.native
  trait ListSlotTypesResponse extends js.Object {
    var botId: js.UndefOr[Id]
    var botVersion: js.UndefOr[BotVersion]
    var localeId: js.UndefOr[LocaleId]
    var nextToken: js.UndefOr[NextToken]
    var slotTypeSummaries: js.UndefOr[SlotTypeSummaryList]
  }

  object ListSlotTypesResponse {
    @inline
    def apply(
        botId: js.UndefOr[Id] = js.undefined,
        botVersion: js.UndefOr[BotVersion] = js.undefined,
        localeId: js.UndefOr[LocaleId] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        slotTypeSummaries: js.UndefOr[SlotTypeSummaryList] = js.undefined
    ): ListSlotTypesResponse = {
      val __obj = js.Dynamic.literal()
      botId.foreach(__v => __obj.updateDynamic("botId")(__v.asInstanceOf[js.Any]))
      botVersion.foreach(__v => __obj.updateDynamic("botVersion")(__v.asInstanceOf[js.Any]))
      localeId.foreach(__v => __obj.updateDynamic("localeId")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      slotTypeSummaries.foreach(__v => __obj.updateDynamic("slotTypeSummaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSlotTypesResponse]
    }
  }

  @js.native
  trait ListSlotsRequest extends js.Object {
    var botId: Id
    var botVersion: BotVersion
    var intentId: Id
    var localeId: LocaleId
    var filters: js.UndefOr[SlotFilters]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var sortBy: js.UndefOr[SlotSortBy]
  }

  object ListSlotsRequest {
    @inline
    def apply(
        botId: Id,
        botVersion: BotVersion,
        intentId: Id,
        localeId: LocaleId,
        filters: js.UndefOr[SlotFilters] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        sortBy: js.UndefOr[SlotSortBy] = js.undefined
    ): ListSlotsRequest = {
      val __obj = js.Dynamic.literal(
        "botId" -> botId.asInstanceOf[js.Any],
        "botVersion" -> botVersion.asInstanceOf[js.Any],
        "intentId" -> intentId.asInstanceOf[js.Any],
        "localeId" -> localeId.asInstanceOf[js.Any]
      )

      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      sortBy.foreach(__v => __obj.updateDynamic("sortBy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSlotsRequest]
    }
  }

  @js.native
  trait ListSlotsResponse extends js.Object {
    var botId: js.UndefOr[Id]
    var botVersion: js.UndefOr[BotVersion]
    var intentId: js.UndefOr[Id]
    var localeId: js.UndefOr[LocaleId]
    var nextToken: js.UndefOr[NextToken]
    var slotSummaries: js.UndefOr[SlotSummaryList]
  }

  object ListSlotsResponse {
    @inline
    def apply(
        botId: js.UndefOr[Id] = js.undefined,
        botVersion: js.UndefOr[BotVersion] = js.undefined,
        intentId: js.UndefOr[Id] = js.undefined,
        localeId: js.UndefOr[LocaleId] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        slotSummaries: js.UndefOr[SlotSummaryList] = js.undefined
    ): ListSlotsResponse = {
      val __obj = js.Dynamic.literal()
      botId.foreach(__v => __obj.updateDynamic("botId")(__v.asInstanceOf[js.Any]))
      botVersion.foreach(__v => __obj.updateDynamic("botVersion")(__v.asInstanceOf[js.Any]))
      intentId.foreach(__v => __obj.updateDynamic("intentId")(__v.asInstanceOf[js.Any]))
      localeId.foreach(__v => __obj.updateDynamic("localeId")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      slotSummaries.foreach(__v => __obj.updateDynamic("slotSummaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSlotsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceARN: AmazonResourceName
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        resourceARN: AmazonResourceName
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceARN" -> resourceARN.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var tags: js.UndefOr[TagMap]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        tags: js.UndefOr[TagMap] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /** The object that provides message text and it's type.
    */
  @js.native
  trait Message extends js.Object {
    var customPayload: js.UndefOr[CustomPayload]
    var imageResponseCard: js.UndefOr[ImageResponseCard]
    var plainTextMessage: js.UndefOr[PlainTextMessage]
    var ssmlMessage: js.UndefOr[SSMLMessage]
  }

  object Message {
    @inline
    def apply(
        customPayload: js.UndefOr[CustomPayload] = js.undefined,
        imageResponseCard: js.UndefOr[ImageResponseCard] = js.undefined,
        plainTextMessage: js.UndefOr[PlainTextMessage] = js.undefined,
        ssmlMessage: js.UndefOr[SSMLMessage] = js.undefined
    ): Message = {
      val __obj = js.Dynamic.literal()
      customPayload.foreach(__v => __obj.updateDynamic("customPayload")(__v.asInstanceOf[js.Any]))
      imageResponseCard.foreach(__v => __obj.updateDynamic("imageResponseCard")(__v.asInstanceOf[js.Any]))
      plainTextMessage.foreach(__v => __obj.updateDynamic("plainTextMessage")(__v.asInstanceOf[js.Any]))
      ssmlMessage.foreach(__v => __obj.updateDynamic("ssmlMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Message]
    }
  }

  /** Provides one or more messages that Amazon Lex should send to the user.
    */
  @js.native
  trait MessageGroup extends js.Object {
    var message: Message
    var variations: js.UndefOr[MessageVariationsList]
  }

  object MessageGroup {
    @inline
    def apply(
        message: Message,
        variations: js.UndefOr[MessageVariationsList] = js.undefined
    ): MessageGroup = {
      val __obj = js.Dynamic.literal(
        "message" -> message.asInstanceOf[js.Any]
      )

      variations.foreach(__v => __obj.updateDynamic("variations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MessageGroup]
    }
  }

  /** Determines whether Amazon Lex obscures slot values in conversation logs.
    */
  @js.native
  trait ObfuscationSetting extends js.Object {
    var obfuscationSettingType: ObfuscationSettingType
  }

  object ObfuscationSetting {
    @inline
    def apply(
        obfuscationSettingType: ObfuscationSettingType
    ): ObfuscationSetting = {
      val __obj = js.Dynamic.literal(
        "obfuscationSettingType" -> obfuscationSettingType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ObfuscationSetting]
    }
  }

  /** Describes a session context that is activated when an intent is fulfilled.
    */
  @js.native
  trait OutputContext extends js.Object {
    var name: Name
    var timeToLiveInSeconds: ContextTimeToLiveInSeconds
    var turnsToLive: ContextTurnsToLive
  }

  object OutputContext {
    @inline
    def apply(
        name: Name,
        timeToLiveInSeconds: ContextTimeToLiveInSeconds,
        turnsToLive: ContextTurnsToLive
    ): OutputContext = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "timeToLiveInSeconds" -> timeToLiveInSeconds.asInstanceOf[js.Any],
        "turnsToLive" -> turnsToLive.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[OutputContext]
    }
  }

  /** Defines an ASCII text message to send to the user.
    */
  @js.native
  trait PlainTextMessage extends js.Object {
    var value: PlainTextMessageValue
  }

  object PlainTextMessage {
    @inline
    def apply(
        value: PlainTextMessageValue
    ): PlainTextMessage = {
      val __obj = js.Dynamic.literal(
        "value" -> value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PlainTextMessage]
    }
  }

  /** Specifies a list of message groups that Amazon Lex sends to a user to elicit a response.
    */
  @js.native
  trait PromptSpecification extends js.Object {
    var maxRetries: PromptMaxRetries
    var messageGroups: MessageGroupsList
    var allowInterrupt: js.UndefOr[BoxedBoolean]
  }

  object PromptSpecification {
    @inline
    def apply(
        maxRetries: PromptMaxRetries,
        messageGroups: MessageGroupsList,
        allowInterrupt: js.UndefOr[BoxedBoolean] = js.undefined
    ): PromptSpecification = {
      val __obj = js.Dynamic.literal(
        "maxRetries" -> maxRetries.asInstanceOf[js.Any],
        "messageGroups" -> messageGroups.asInstanceOf[js.Any]
      )

      allowInterrupt.foreach(__v => __obj.updateDynamic("allowInterrupt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PromptSpecification]
    }
  }

  /** Specifies a list of message groups that Amazon Lex uses to respond the user input.
    */
  @js.native
  trait ResponseSpecification extends js.Object {
    var messageGroups: MessageGroupsList
    var allowInterrupt: js.UndefOr[BoxedBoolean]
  }

  object ResponseSpecification {
    @inline
    def apply(
        messageGroups: MessageGroupsList,
        allowInterrupt: js.UndefOr[BoxedBoolean] = js.undefined
    ): ResponseSpecification = {
      val __obj = js.Dynamic.literal(
        "messageGroups" -> messageGroups.asInstanceOf[js.Any]
      )

      allowInterrupt.foreach(__v => __obj.updateDynamic("allowInterrupt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResponseSpecification]
    }
  }

  /** Specifies an Amazon S3 bucket for logging audio conversations
    */
  @js.native
  trait S3BucketLogDestination extends js.Object {
    var logPrefix: LogPrefix
    var s3BucketArn: S3BucketArn
    var kmsKeyArn: js.UndefOr[KmsKeyArn]
  }

  object S3BucketLogDestination {
    @inline
    def apply(
        logPrefix: LogPrefix,
        s3BucketArn: S3BucketArn,
        kmsKeyArn: js.UndefOr[KmsKeyArn] = js.undefined
    ): S3BucketLogDestination = {
      val __obj = js.Dynamic.literal(
        "logPrefix" -> logPrefix.asInstanceOf[js.Any],
        "s3BucketArn" -> s3BucketArn.asInstanceOf[js.Any]
      )

      kmsKeyArn.foreach(__v => __obj.updateDynamic("kmsKeyArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3BucketLogDestination]
    }
  }

  /** Defines a Speech Synthesis Markup Language (SSML) prompt.
    */
  @js.native
  trait SSMLMessage extends js.Object {
    var value: SSMLMessageValue
  }

  object SSMLMessage {
    @inline
    def apply(
        value: SSMLMessageValue
    ): SSMLMessage = {
      val __obj = js.Dynamic.literal(
        "value" -> value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SSMLMessage]
    }
  }

  /** A sample utterance that invokes an intent or respond to a slot elicitation prompt.
    */
  @js.native
  trait SampleUtterance extends js.Object {
    var utterance: Utterance
  }

  object SampleUtterance {
    @inline
    def apply(
        utterance: Utterance
    ): SampleUtterance = {
      val __obj = js.Dynamic.literal(
        "utterance" -> utterance.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SampleUtterance]
    }
  }

  /** Defines one of the values for a slot type.
    */
  @js.native
  trait SampleValue extends js.Object {
    var value: Value
  }

  object SampleValue {
    @inline
    def apply(
        value: Value
    ): SampleValue = {
      val __obj = js.Dynamic.literal(
        "value" -> value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SampleValue]
    }
  }

  /** Determines whether Amazon Lex will use Amazon Comprehend to detect the sentiment of user utterances.
    */
  @js.native
  trait SentimentAnalysisSettings extends js.Object {
    var detectSentiment: Boolean
  }

  object SentimentAnalysisSettings {
    @inline
    def apply(
        detectSentiment: Boolean
    ): SentimentAnalysisSettings = {
      val __obj = js.Dynamic.literal(
        "detectSentiment" -> detectSentiment.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SentimentAnalysisSettings]
    }
  }

  /** Specifies the default value to use when a user doesn't provide a value for a slot.
    */
  @js.native
  trait SlotDefaultValue extends js.Object {
    var defaultValue: SlotDefaultValueString
  }

  object SlotDefaultValue {
    @inline
    def apply(
        defaultValue: SlotDefaultValueString
    ): SlotDefaultValue = {
      val __obj = js.Dynamic.literal(
        "defaultValue" -> defaultValue.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SlotDefaultValue]
    }
  }

  /** Defines a list of values that Amazon Lex should use as the default value for a slot.
    */
  @js.native
  trait SlotDefaultValueSpecification extends js.Object {
    var defaultValueList: SlotDefaultValueList
  }

  object SlotDefaultValueSpecification {
    @inline
    def apply(
        defaultValueList: SlotDefaultValueList
    ): SlotDefaultValueSpecification = {
      val __obj = js.Dynamic.literal(
        "defaultValueList" -> defaultValueList.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SlotDefaultValueSpecification]
    }
  }

  /** Filters the response from the <code>ListSlots</code> operation.
    */
  @js.native
  trait SlotFilter extends js.Object {
    var name: SlotFilterName
    var operator: SlotFilterOperator
    var values: FilterValues
  }

  object SlotFilter {
    @inline
    def apply(
        name: SlotFilterName,
        operator: SlotFilterOperator,
        values: FilterValues
    ): SlotFilter = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "operator" -> operator.asInstanceOf[js.Any],
        "values" -> values.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SlotFilter]
    }
  }

  /** Sets the priority that Amazon Lex should use when eliciting slot values from a user.
    */
  @js.native
  trait SlotPriority extends js.Object {
    var priority: PriorityValue
    var slotId: Id
  }

  object SlotPriority {
    @inline
    def apply(
        priority: PriorityValue,
        slotId: Id
    ): SlotPriority = {
      val __obj = js.Dynamic.literal(
        "priority" -> priority.asInstanceOf[js.Any],
        "slotId" -> slotId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SlotPriority]
    }
  }

  /** Specifies attributes for sorting a list of bots.
    */
  @js.native
  trait SlotSortBy extends js.Object {
    var attribute: SlotSortAttribute
    var order: SortOrder
  }

  object SlotSortBy {
    @inline
    def apply(
        attribute: SlotSortAttribute,
        order: SortOrder
    ): SlotSortBy = {
      val __obj = js.Dynamic.literal(
        "attribute" -> attribute.asInstanceOf[js.Any],
        "order" -> order.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SlotSortBy]
    }
  }

  /** Summary information about a slot, a value that the bot elicits from the user.
    */
  @js.native
  trait SlotSummary extends js.Object {
    var description: js.UndefOr[Description]
    var lastUpdatedDateTime: js.UndefOr[Timestamp]
    var slotConstraint: js.UndefOr[SlotConstraint]
    var slotId: js.UndefOr[Id]
    var slotName: js.UndefOr[Name]
    var slotTypeId: js.UndefOr[BuiltInOrCustomSlotTypeId]
    var valueElicitationPromptSpecification: js.UndefOr[PromptSpecification]
  }

  object SlotSummary {
    @inline
    def apply(
        description: js.UndefOr[Description] = js.undefined,
        lastUpdatedDateTime: js.UndefOr[Timestamp] = js.undefined,
        slotConstraint: js.UndefOr[SlotConstraint] = js.undefined,
        slotId: js.UndefOr[Id] = js.undefined,
        slotName: js.UndefOr[Name] = js.undefined,
        slotTypeId: js.UndefOr[BuiltInOrCustomSlotTypeId] = js.undefined,
        valueElicitationPromptSpecification: js.UndefOr[PromptSpecification] = js.undefined
    ): SlotSummary = {
      val __obj = js.Dynamic.literal()
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      lastUpdatedDateTime.foreach(__v => __obj.updateDynamic("lastUpdatedDateTime")(__v.asInstanceOf[js.Any]))
      slotConstraint.foreach(__v => __obj.updateDynamic("slotConstraint")(__v.asInstanceOf[js.Any]))
      slotId.foreach(__v => __obj.updateDynamic("slotId")(__v.asInstanceOf[js.Any]))
      slotName.foreach(__v => __obj.updateDynamic("slotName")(__v.asInstanceOf[js.Any]))
      slotTypeId.foreach(__v => __obj.updateDynamic("slotTypeId")(__v.asInstanceOf[js.Any]))
      valueElicitationPromptSpecification.foreach(__v => __obj.updateDynamic("valueElicitationPromptSpecification")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SlotSummary]
    }
  }

  /** Filters the response from the <code>ListSlotTypes</code> operation.
    */
  @js.native
  trait SlotTypeFilter extends js.Object {
    var name: SlotTypeFilterName
    var operator: SlotTypeFilterOperator
    var values: FilterValues
  }

  object SlotTypeFilter {
    @inline
    def apply(
        name: SlotTypeFilterName,
        operator: SlotTypeFilterOperator,
        values: FilterValues
    ): SlotTypeFilter = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "operator" -> operator.asInstanceOf[js.Any],
        "values" -> values.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SlotTypeFilter]
    }
  }

  /** Specifies attributes for sorting a list of slot types.
    */
  @js.native
  trait SlotTypeSortBy extends js.Object {
    var attribute: SlotTypeSortAttribute
    var order: SortOrder
  }

  object SlotTypeSortBy {
    @inline
    def apply(
        attribute: SlotTypeSortAttribute,
        order: SortOrder
    ): SlotTypeSortBy = {
      val __obj = js.Dynamic.literal(
        "attribute" -> attribute.asInstanceOf[js.Any],
        "order" -> order.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SlotTypeSortBy]
    }
  }

  /** Provides summary information about a slot type.
    */
  @js.native
  trait SlotTypeSummary extends js.Object {
    var description: js.UndefOr[Description]
    var lastUpdatedDateTime: js.UndefOr[Timestamp]
    var parentSlotTypeSignature: js.UndefOr[SlotTypeSignature]
    var slotTypeId: js.UndefOr[Id]
    var slotTypeName: js.UndefOr[Name]
  }

  object SlotTypeSummary {
    @inline
    def apply(
        description: js.UndefOr[Description] = js.undefined,
        lastUpdatedDateTime: js.UndefOr[Timestamp] = js.undefined,
        parentSlotTypeSignature: js.UndefOr[SlotTypeSignature] = js.undefined,
        slotTypeId: js.UndefOr[Id] = js.undefined,
        slotTypeName: js.UndefOr[Name] = js.undefined
    ): SlotTypeSummary = {
      val __obj = js.Dynamic.literal()
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      lastUpdatedDateTime.foreach(__v => __obj.updateDynamic("lastUpdatedDateTime")(__v.asInstanceOf[js.Any]))
      parentSlotTypeSignature.foreach(__v => __obj.updateDynamic("parentSlotTypeSignature")(__v.asInstanceOf[js.Any]))
      slotTypeId.foreach(__v => __obj.updateDynamic("slotTypeId")(__v.asInstanceOf[js.Any]))
      slotTypeName.foreach(__v => __obj.updateDynamic("slotTypeName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SlotTypeSummary]
    }
  }

  /** Each slot type can have a set of values. Each <code>SlotTypeValue</code> represents a value that the slot type can take.
    */
  @js.native
  trait SlotTypeValue extends js.Object {
    var sampleValue: js.UndefOr[SampleValue]
    var synonyms: js.UndefOr[SynonymList]
  }

  object SlotTypeValue {
    @inline
    def apply(
        sampleValue: js.UndefOr[SampleValue] = js.undefined,
        synonyms: js.UndefOr[SynonymList] = js.undefined
    ): SlotTypeValue = {
      val __obj = js.Dynamic.literal()
      sampleValue.foreach(__v => __obj.updateDynamic("sampleValue")(__v.asInstanceOf[js.Any]))
      synonyms.foreach(__v => __obj.updateDynamic("synonyms")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SlotTypeValue]
    }
  }

  /** Settings that you can use for eliciting a slot value.
    */
  @js.native
  trait SlotValueElicitationSetting extends js.Object {
    var slotConstraint: SlotConstraint
    var defaultValueSpecification: js.UndefOr[SlotDefaultValueSpecification]
    var promptSpecification: js.UndefOr[PromptSpecification]
    var sampleUtterances: js.UndefOr[SampleUtterancesList]
    var waitAndContinueSpecification: js.UndefOr[WaitAndContinueSpecification]
  }

  object SlotValueElicitationSetting {
    @inline
    def apply(
        slotConstraint: SlotConstraint,
        defaultValueSpecification: js.UndefOr[SlotDefaultValueSpecification] = js.undefined,
        promptSpecification: js.UndefOr[PromptSpecification] = js.undefined,
        sampleUtterances: js.UndefOr[SampleUtterancesList] = js.undefined,
        waitAndContinueSpecification: js.UndefOr[WaitAndContinueSpecification] = js.undefined
    ): SlotValueElicitationSetting = {
      val __obj = js.Dynamic.literal(
        "slotConstraint" -> slotConstraint.asInstanceOf[js.Any]
      )

      defaultValueSpecification.foreach(__v => __obj.updateDynamic("defaultValueSpecification")(__v.asInstanceOf[js.Any]))
      promptSpecification.foreach(__v => __obj.updateDynamic("promptSpecification")(__v.asInstanceOf[js.Any]))
      sampleUtterances.foreach(__v => __obj.updateDynamic("sampleUtterances")(__v.asInstanceOf[js.Any]))
      waitAndContinueSpecification.foreach(__v => __obj.updateDynamic("waitAndContinueSpecification")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SlotValueElicitationSetting]
    }
  }

  /** Provides a regular expression used to validate the value of a slot.
    */
  @js.native
  trait SlotValueRegexFilter extends js.Object {
    var pattern: RegexPattern
  }

  object SlotValueRegexFilter {
    @inline
    def apply(
        pattern: RegexPattern
    ): SlotValueRegexFilter = {
      val __obj = js.Dynamic.literal(
        "pattern" -> pattern.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SlotValueRegexFilter]
    }
  }

  /** Contains settings used by Amazon Lex to select a slot value.
    */
  @js.native
  trait SlotValueSelectionSetting extends js.Object {
    var resolutionStrategy: SlotValueResolutionStrategy
    var regexFilter: js.UndefOr[SlotValueRegexFilter]
  }

  object SlotValueSelectionSetting {
    @inline
    def apply(
        resolutionStrategy: SlotValueResolutionStrategy,
        regexFilter: js.UndefOr[SlotValueRegexFilter] = js.undefined
    ): SlotValueSelectionSetting = {
      val __obj = js.Dynamic.literal(
        "resolutionStrategy" -> resolutionStrategy.asInstanceOf[js.Any]
      )

      regexFilter.foreach(__v => __obj.updateDynamic("regexFilter")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SlotValueSelectionSetting]
    }
  }

  /** Defines the messages that Amazon Lex sends to a user to remind them that the bot is waiting for a response.
    */
  @js.native
  trait StillWaitingResponseSpecification extends js.Object {
    var frequencyInSeconds: StillWaitingResponseFrequency
    var messageGroups: MessageGroupsList
    var timeoutInSeconds: StillWaitingResponseTimeout
    var allowInterrupt: js.UndefOr[BoxedBoolean]
  }

  object StillWaitingResponseSpecification {
    @inline
    def apply(
        frequencyInSeconds: StillWaitingResponseFrequency,
        messageGroups: MessageGroupsList,
        timeoutInSeconds: StillWaitingResponseTimeout,
        allowInterrupt: js.UndefOr[BoxedBoolean] = js.undefined
    ): StillWaitingResponseSpecification = {
      val __obj = js.Dynamic.literal(
        "frequencyInSeconds" -> frequencyInSeconds.asInstanceOf[js.Any],
        "messageGroups" -> messageGroups.asInstanceOf[js.Any],
        "timeoutInSeconds" -> timeoutInSeconds.asInstanceOf[js.Any]
      )

      allowInterrupt.foreach(__v => __obj.updateDynamic("allowInterrupt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StillWaitingResponseSpecification]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceARN: AmazonResourceName
    var tags: TagMap
  }

  object TagResourceRequest {
    @inline
    def apply(
        resourceARN: AmazonResourceName,
        tags: TagMap
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceARN" -> resourceARN.asInstanceOf[js.Any],
        "tags" -> tags.asInstanceOf[js.Any]
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

  /** Defines the Amazon CloudWatch Logs destination log group for conversation text logs.
    */
  @js.native
  trait TextLogDestination extends js.Object {
    var cloudWatch: CloudWatchLogGroupLogDestination
  }

  object TextLogDestination {
    @inline
    def apply(
        cloudWatch: CloudWatchLogGroupLogDestination
    ): TextLogDestination = {
      val __obj = js.Dynamic.literal(
        "cloudWatch" -> cloudWatch.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TextLogDestination]
    }
  }

  /** Defines settings to enable text conversation logs.
    */
  @js.native
  trait TextLogSetting extends js.Object {
    var destination: TextLogDestination
    var enabled: Boolean
  }

  object TextLogSetting {
    @inline
    def apply(
        destination: TextLogDestination,
        enabled: Boolean
    ): TextLogSetting = {
      val __obj = js.Dynamic.literal(
        "destination" -> destination.asInstanceOf[js.Any],
        "enabled" -> enabled.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TextLogSetting]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var resourceARN: AmazonResourceName
    var tagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        resourceARN: AmazonResourceName,
        tagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceARN" -> resourceARN.asInstanceOf[js.Any],
        "tagKeys" -> tagKeys.asInstanceOf[js.Any]
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

  @js.native
  trait UpdateBotAliasRequest extends js.Object {
    var botAliasId: BotAliasId
    var botAliasName: Name
    var botId: Id
    var botAliasLocaleSettings: js.UndefOr[BotAliasLocaleSettingsMap]
    var botVersion: js.UndefOr[BotVersion]
    var conversationLogSettings: js.UndefOr[ConversationLogSettings]
    var description: js.UndefOr[Description]
    var sentimentAnalysisSettings: js.UndefOr[SentimentAnalysisSettings]
  }

  object UpdateBotAliasRequest {
    @inline
    def apply(
        botAliasId: BotAliasId,
        botAliasName: Name,
        botId: Id,
        botAliasLocaleSettings: js.UndefOr[BotAliasLocaleSettingsMap] = js.undefined,
        botVersion: js.UndefOr[BotVersion] = js.undefined,
        conversationLogSettings: js.UndefOr[ConversationLogSettings] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        sentimentAnalysisSettings: js.UndefOr[SentimentAnalysisSettings] = js.undefined
    ): UpdateBotAliasRequest = {
      val __obj = js.Dynamic.literal(
        "botAliasId" -> botAliasId.asInstanceOf[js.Any],
        "botAliasName" -> botAliasName.asInstanceOf[js.Any],
        "botId" -> botId.asInstanceOf[js.Any]
      )

      botAliasLocaleSettings.foreach(__v => __obj.updateDynamic("botAliasLocaleSettings")(__v.asInstanceOf[js.Any]))
      botVersion.foreach(__v => __obj.updateDynamic("botVersion")(__v.asInstanceOf[js.Any]))
      conversationLogSettings.foreach(__v => __obj.updateDynamic("conversationLogSettings")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      sentimentAnalysisSettings.foreach(__v => __obj.updateDynamic("sentimentAnalysisSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateBotAliasRequest]
    }
  }

  @js.native
  trait UpdateBotAliasResponse extends js.Object {
    var botAliasId: js.UndefOr[BotAliasId]
    var botAliasLocaleSettings: js.UndefOr[BotAliasLocaleSettingsMap]
    var botAliasName: js.UndefOr[Name]
    var botAliasStatus: js.UndefOr[BotAliasStatus]
    var botId: js.UndefOr[Id]
    var botVersion: js.UndefOr[BotVersion]
    var conversationLogSettings: js.UndefOr[ConversationLogSettings]
    var creationDateTime: js.UndefOr[Timestamp]
    var description: js.UndefOr[Description]
    var lastUpdatedDateTime: js.UndefOr[Timestamp]
    var sentimentAnalysisSettings: js.UndefOr[SentimentAnalysisSettings]
  }

  object UpdateBotAliasResponse {
    @inline
    def apply(
        botAliasId: js.UndefOr[BotAliasId] = js.undefined,
        botAliasLocaleSettings: js.UndefOr[BotAliasLocaleSettingsMap] = js.undefined,
        botAliasName: js.UndefOr[Name] = js.undefined,
        botAliasStatus: js.UndefOr[BotAliasStatus] = js.undefined,
        botId: js.UndefOr[Id] = js.undefined,
        botVersion: js.UndefOr[BotVersion] = js.undefined,
        conversationLogSettings: js.UndefOr[ConversationLogSettings] = js.undefined,
        creationDateTime: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        lastUpdatedDateTime: js.UndefOr[Timestamp] = js.undefined,
        sentimentAnalysisSettings: js.UndefOr[SentimentAnalysisSettings] = js.undefined
    ): UpdateBotAliasResponse = {
      val __obj = js.Dynamic.literal()
      botAliasId.foreach(__v => __obj.updateDynamic("botAliasId")(__v.asInstanceOf[js.Any]))
      botAliasLocaleSettings.foreach(__v => __obj.updateDynamic("botAliasLocaleSettings")(__v.asInstanceOf[js.Any]))
      botAliasName.foreach(__v => __obj.updateDynamic("botAliasName")(__v.asInstanceOf[js.Any]))
      botAliasStatus.foreach(__v => __obj.updateDynamic("botAliasStatus")(__v.asInstanceOf[js.Any]))
      botId.foreach(__v => __obj.updateDynamic("botId")(__v.asInstanceOf[js.Any]))
      botVersion.foreach(__v => __obj.updateDynamic("botVersion")(__v.asInstanceOf[js.Any]))
      conversationLogSettings.foreach(__v => __obj.updateDynamic("conversationLogSettings")(__v.asInstanceOf[js.Any]))
      creationDateTime.foreach(__v => __obj.updateDynamic("creationDateTime")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      lastUpdatedDateTime.foreach(__v => __obj.updateDynamic("lastUpdatedDateTime")(__v.asInstanceOf[js.Any]))
      sentimentAnalysisSettings.foreach(__v => __obj.updateDynamic("sentimentAnalysisSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateBotAliasResponse]
    }
  }

  @js.native
  trait UpdateBotLocaleRequest extends js.Object {
    var botId: Id
    var botVersion: DraftBotVersion
    var localeId: LocaleId
    var nluIntentConfidenceThreshold: ConfidenceThreshold
    var description: js.UndefOr[Description]
    var voiceSettings: js.UndefOr[VoiceSettings]
  }

  object UpdateBotLocaleRequest {
    @inline
    def apply(
        botId: Id,
        botVersion: DraftBotVersion,
        localeId: LocaleId,
        nluIntentConfidenceThreshold: ConfidenceThreshold,
        description: js.UndefOr[Description] = js.undefined,
        voiceSettings: js.UndefOr[VoiceSettings] = js.undefined
    ): UpdateBotLocaleRequest = {
      val __obj = js.Dynamic.literal(
        "botId" -> botId.asInstanceOf[js.Any],
        "botVersion" -> botVersion.asInstanceOf[js.Any],
        "localeId" -> localeId.asInstanceOf[js.Any],
        "nluIntentConfidenceThreshold" -> nluIntentConfidenceThreshold.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      voiceSettings.foreach(__v => __obj.updateDynamic("voiceSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateBotLocaleRequest]
    }
  }

  @js.native
  trait UpdateBotLocaleResponse extends js.Object {
    var botId: js.UndefOr[Id]
    var botLocaleStatus: js.UndefOr[BotLocaleStatus]
    var botVersion: js.UndefOr[DraftBotVersion]
    var creationDateTime: js.UndefOr[Timestamp]
    var description: js.UndefOr[Description]
    var failureReasons: js.UndefOr[FailureReasons]
    var lastUpdatedDateTime: js.UndefOr[Timestamp]
    var localeId: js.UndefOr[LocaleId]
    var localeName: js.UndefOr[LocaleName]
    var nluIntentConfidenceThreshold: js.UndefOr[ConfidenceThreshold]
    var voiceSettings: js.UndefOr[VoiceSettings]
  }

  object UpdateBotLocaleResponse {
    @inline
    def apply(
        botId: js.UndefOr[Id] = js.undefined,
        botLocaleStatus: js.UndefOr[BotLocaleStatus] = js.undefined,
        botVersion: js.UndefOr[DraftBotVersion] = js.undefined,
        creationDateTime: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        failureReasons: js.UndefOr[FailureReasons] = js.undefined,
        lastUpdatedDateTime: js.UndefOr[Timestamp] = js.undefined,
        localeId: js.UndefOr[LocaleId] = js.undefined,
        localeName: js.UndefOr[LocaleName] = js.undefined,
        nluIntentConfidenceThreshold: js.UndefOr[ConfidenceThreshold] = js.undefined,
        voiceSettings: js.UndefOr[VoiceSettings] = js.undefined
    ): UpdateBotLocaleResponse = {
      val __obj = js.Dynamic.literal()
      botId.foreach(__v => __obj.updateDynamic("botId")(__v.asInstanceOf[js.Any]))
      botLocaleStatus.foreach(__v => __obj.updateDynamic("botLocaleStatus")(__v.asInstanceOf[js.Any]))
      botVersion.foreach(__v => __obj.updateDynamic("botVersion")(__v.asInstanceOf[js.Any]))
      creationDateTime.foreach(__v => __obj.updateDynamic("creationDateTime")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      failureReasons.foreach(__v => __obj.updateDynamic("failureReasons")(__v.asInstanceOf[js.Any]))
      lastUpdatedDateTime.foreach(__v => __obj.updateDynamic("lastUpdatedDateTime")(__v.asInstanceOf[js.Any]))
      localeId.foreach(__v => __obj.updateDynamic("localeId")(__v.asInstanceOf[js.Any]))
      localeName.foreach(__v => __obj.updateDynamic("localeName")(__v.asInstanceOf[js.Any]))
      nluIntentConfidenceThreshold.foreach(__v => __obj.updateDynamic("nluIntentConfidenceThreshold")(__v.asInstanceOf[js.Any]))
      voiceSettings.foreach(__v => __obj.updateDynamic("voiceSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateBotLocaleResponse]
    }
  }

  @js.native
  trait UpdateBotRequest extends js.Object {
    var botId: Id
    var botName: Name
    var dataPrivacy: DataPrivacy
    var idleSessionTTLInSeconds: SessionTTL
    var roleArn: RoleArn
    var description: js.UndefOr[Description]
  }

  object UpdateBotRequest {
    @inline
    def apply(
        botId: Id,
        botName: Name,
        dataPrivacy: DataPrivacy,
        idleSessionTTLInSeconds: SessionTTL,
        roleArn: RoleArn,
        description: js.UndefOr[Description] = js.undefined
    ): UpdateBotRequest = {
      val __obj = js.Dynamic.literal(
        "botId" -> botId.asInstanceOf[js.Any],
        "botName" -> botName.asInstanceOf[js.Any],
        "dataPrivacy" -> dataPrivacy.asInstanceOf[js.Any],
        "idleSessionTTLInSeconds" -> idleSessionTTLInSeconds.asInstanceOf[js.Any],
        "roleArn" -> roleArn.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateBotRequest]
    }
  }

  @js.native
  trait UpdateBotResponse extends js.Object {
    var botId: js.UndefOr[Id]
    var botName: js.UndefOr[Name]
    var botStatus: js.UndefOr[BotStatus]
    var creationDateTime: js.UndefOr[Timestamp]
    var dataPrivacy: js.UndefOr[DataPrivacy]
    var description: js.UndefOr[Description]
    var idleSessionTTLInSeconds: js.UndefOr[SessionTTL]
    var lastUpdatedDateTime: js.UndefOr[Timestamp]
    var roleArn: js.UndefOr[RoleArn]
  }

  object UpdateBotResponse {
    @inline
    def apply(
        botId: js.UndefOr[Id] = js.undefined,
        botName: js.UndefOr[Name] = js.undefined,
        botStatus: js.UndefOr[BotStatus] = js.undefined,
        creationDateTime: js.UndefOr[Timestamp] = js.undefined,
        dataPrivacy: js.UndefOr[DataPrivacy] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        idleSessionTTLInSeconds: js.UndefOr[SessionTTL] = js.undefined,
        lastUpdatedDateTime: js.UndefOr[Timestamp] = js.undefined,
        roleArn: js.UndefOr[RoleArn] = js.undefined
    ): UpdateBotResponse = {
      val __obj = js.Dynamic.literal()
      botId.foreach(__v => __obj.updateDynamic("botId")(__v.asInstanceOf[js.Any]))
      botName.foreach(__v => __obj.updateDynamic("botName")(__v.asInstanceOf[js.Any]))
      botStatus.foreach(__v => __obj.updateDynamic("botStatus")(__v.asInstanceOf[js.Any]))
      creationDateTime.foreach(__v => __obj.updateDynamic("creationDateTime")(__v.asInstanceOf[js.Any]))
      dataPrivacy.foreach(__v => __obj.updateDynamic("dataPrivacy")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      idleSessionTTLInSeconds.foreach(__v => __obj.updateDynamic("idleSessionTTLInSeconds")(__v.asInstanceOf[js.Any]))
      lastUpdatedDateTime.foreach(__v => __obj.updateDynamic("lastUpdatedDateTime")(__v.asInstanceOf[js.Any]))
      roleArn.foreach(__v => __obj.updateDynamic("roleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateBotResponse]
    }
  }

  @js.native
  trait UpdateIntentRequest extends js.Object {
    var botId: Id
    var botVersion: DraftBotVersion
    var intentId: Id
    var intentName: Name
    var localeId: LocaleId
    var description: js.UndefOr[Description]
    var dialogCodeHook: js.UndefOr[DialogCodeHookSettings]
    var fulfillmentCodeHook: js.UndefOr[FulfillmentCodeHookSettings]
    var inputContexts: js.UndefOr[InputContextsList]
    var intentClosingSetting: js.UndefOr[IntentClosingSetting]
    var intentConfirmationSetting: js.UndefOr[IntentConfirmationSetting]
    var kendraConfiguration: js.UndefOr[KendraConfiguration]
    var outputContexts: js.UndefOr[OutputContextsList]
    var parentIntentSignature: js.UndefOr[IntentSignature]
    var sampleUtterances: js.UndefOr[SampleUtterancesList]
    var slotPriorities: js.UndefOr[SlotPrioritiesList]
  }

  object UpdateIntentRequest {
    @inline
    def apply(
        botId: Id,
        botVersion: DraftBotVersion,
        intentId: Id,
        intentName: Name,
        localeId: LocaleId,
        description: js.UndefOr[Description] = js.undefined,
        dialogCodeHook: js.UndefOr[DialogCodeHookSettings] = js.undefined,
        fulfillmentCodeHook: js.UndefOr[FulfillmentCodeHookSettings] = js.undefined,
        inputContexts: js.UndefOr[InputContextsList] = js.undefined,
        intentClosingSetting: js.UndefOr[IntentClosingSetting] = js.undefined,
        intentConfirmationSetting: js.UndefOr[IntentConfirmationSetting] = js.undefined,
        kendraConfiguration: js.UndefOr[KendraConfiguration] = js.undefined,
        outputContexts: js.UndefOr[OutputContextsList] = js.undefined,
        parentIntentSignature: js.UndefOr[IntentSignature] = js.undefined,
        sampleUtterances: js.UndefOr[SampleUtterancesList] = js.undefined,
        slotPriorities: js.UndefOr[SlotPrioritiesList] = js.undefined
    ): UpdateIntentRequest = {
      val __obj = js.Dynamic.literal(
        "botId" -> botId.asInstanceOf[js.Any],
        "botVersion" -> botVersion.asInstanceOf[js.Any],
        "intentId" -> intentId.asInstanceOf[js.Any],
        "intentName" -> intentName.asInstanceOf[js.Any],
        "localeId" -> localeId.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      dialogCodeHook.foreach(__v => __obj.updateDynamic("dialogCodeHook")(__v.asInstanceOf[js.Any]))
      fulfillmentCodeHook.foreach(__v => __obj.updateDynamic("fulfillmentCodeHook")(__v.asInstanceOf[js.Any]))
      inputContexts.foreach(__v => __obj.updateDynamic("inputContexts")(__v.asInstanceOf[js.Any]))
      intentClosingSetting.foreach(__v => __obj.updateDynamic("intentClosingSetting")(__v.asInstanceOf[js.Any]))
      intentConfirmationSetting.foreach(__v => __obj.updateDynamic("intentConfirmationSetting")(__v.asInstanceOf[js.Any]))
      kendraConfiguration.foreach(__v => __obj.updateDynamic("kendraConfiguration")(__v.asInstanceOf[js.Any]))
      outputContexts.foreach(__v => __obj.updateDynamic("outputContexts")(__v.asInstanceOf[js.Any]))
      parentIntentSignature.foreach(__v => __obj.updateDynamic("parentIntentSignature")(__v.asInstanceOf[js.Any]))
      sampleUtterances.foreach(__v => __obj.updateDynamic("sampleUtterances")(__v.asInstanceOf[js.Any]))
      slotPriorities.foreach(__v => __obj.updateDynamic("slotPriorities")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateIntentRequest]
    }
  }

  @js.native
  trait UpdateIntentResponse extends js.Object {
    var botId: js.UndefOr[Id]
    var botVersion: js.UndefOr[DraftBotVersion]
    var creationDateTime: js.UndefOr[Timestamp]
    var description: js.UndefOr[Description]
    var dialogCodeHook: js.UndefOr[DialogCodeHookSettings]
    var fulfillmentCodeHook: js.UndefOr[FulfillmentCodeHookSettings]
    var inputContexts: js.UndefOr[InputContextsList]
    var intentClosingSetting: js.UndefOr[IntentClosingSetting]
    var intentConfirmationSetting: js.UndefOr[IntentConfirmationSetting]
    var intentId: js.UndefOr[Id]
    var intentName: js.UndefOr[Name]
    var kendraConfiguration: js.UndefOr[KendraConfiguration]
    var lastUpdatedDateTime: js.UndefOr[Timestamp]
    var localeId: js.UndefOr[LocaleId]
    var outputContexts: js.UndefOr[OutputContextsList]
    var parentIntentSignature: js.UndefOr[IntentSignature]
    var sampleUtterances: js.UndefOr[SampleUtterancesList]
    var slotPriorities: js.UndefOr[SlotPrioritiesList]
  }

  object UpdateIntentResponse {
    @inline
    def apply(
        botId: js.UndefOr[Id] = js.undefined,
        botVersion: js.UndefOr[DraftBotVersion] = js.undefined,
        creationDateTime: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        dialogCodeHook: js.UndefOr[DialogCodeHookSettings] = js.undefined,
        fulfillmentCodeHook: js.UndefOr[FulfillmentCodeHookSettings] = js.undefined,
        inputContexts: js.UndefOr[InputContextsList] = js.undefined,
        intentClosingSetting: js.UndefOr[IntentClosingSetting] = js.undefined,
        intentConfirmationSetting: js.UndefOr[IntentConfirmationSetting] = js.undefined,
        intentId: js.UndefOr[Id] = js.undefined,
        intentName: js.UndefOr[Name] = js.undefined,
        kendraConfiguration: js.UndefOr[KendraConfiguration] = js.undefined,
        lastUpdatedDateTime: js.UndefOr[Timestamp] = js.undefined,
        localeId: js.UndefOr[LocaleId] = js.undefined,
        outputContexts: js.UndefOr[OutputContextsList] = js.undefined,
        parentIntentSignature: js.UndefOr[IntentSignature] = js.undefined,
        sampleUtterances: js.UndefOr[SampleUtterancesList] = js.undefined,
        slotPriorities: js.UndefOr[SlotPrioritiesList] = js.undefined
    ): UpdateIntentResponse = {
      val __obj = js.Dynamic.literal()
      botId.foreach(__v => __obj.updateDynamic("botId")(__v.asInstanceOf[js.Any]))
      botVersion.foreach(__v => __obj.updateDynamic("botVersion")(__v.asInstanceOf[js.Any]))
      creationDateTime.foreach(__v => __obj.updateDynamic("creationDateTime")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      dialogCodeHook.foreach(__v => __obj.updateDynamic("dialogCodeHook")(__v.asInstanceOf[js.Any]))
      fulfillmentCodeHook.foreach(__v => __obj.updateDynamic("fulfillmentCodeHook")(__v.asInstanceOf[js.Any]))
      inputContexts.foreach(__v => __obj.updateDynamic("inputContexts")(__v.asInstanceOf[js.Any]))
      intentClosingSetting.foreach(__v => __obj.updateDynamic("intentClosingSetting")(__v.asInstanceOf[js.Any]))
      intentConfirmationSetting.foreach(__v => __obj.updateDynamic("intentConfirmationSetting")(__v.asInstanceOf[js.Any]))
      intentId.foreach(__v => __obj.updateDynamic("intentId")(__v.asInstanceOf[js.Any]))
      intentName.foreach(__v => __obj.updateDynamic("intentName")(__v.asInstanceOf[js.Any]))
      kendraConfiguration.foreach(__v => __obj.updateDynamic("kendraConfiguration")(__v.asInstanceOf[js.Any]))
      lastUpdatedDateTime.foreach(__v => __obj.updateDynamic("lastUpdatedDateTime")(__v.asInstanceOf[js.Any]))
      localeId.foreach(__v => __obj.updateDynamic("localeId")(__v.asInstanceOf[js.Any]))
      outputContexts.foreach(__v => __obj.updateDynamic("outputContexts")(__v.asInstanceOf[js.Any]))
      parentIntentSignature.foreach(__v => __obj.updateDynamic("parentIntentSignature")(__v.asInstanceOf[js.Any]))
      sampleUtterances.foreach(__v => __obj.updateDynamic("sampleUtterances")(__v.asInstanceOf[js.Any]))
      slotPriorities.foreach(__v => __obj.updateDynamic("slotPriorities")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateIntentResponse]
    }
  }

  @js.native
  trait UpdateSlotRequest extends js.Object {
    var botId: Id
    var botVersion: DraftBotVersion
    var intentId: Id
    var localeId: LocaleId
    var slotId: Id
    var slotName: Name
    var slotTypeId: BuiltInOrCustomSlotTypeId
    var valueElicitationSetting: SlotValueElicitationSetting
    var description: js.UndefOr[Description]
    var obfuscationSetting: js.UndefOr[ObfuscationSetting]
  }

  object UpdateSlotRequest {
    @inline
    def apply(
        botId: Id,
        botVersion: DraftBotVersion,
        intentId: Id,
        localeId: LocaleId,
        slotId: Id,
        slotName: Name,
        slotTypeId: BuiltInOrCustomSlotTypeId,
        valueElicitationSetting: SlotValueElicitationSetting,
        description: js.UndefOr[Description] = js.undefined,
        obfuscationSetting: js.UndefOr[ObfuscationSetting] = js.undefined
    ): UpdateSlotRequest = {
      val __obj = js.Dynamic.literal(
        "botId" -> botId.asInstanceOf[js.Any],
        "botVersion" -> botVersion.asInstanceOf[js.Any],
        "intentId" -> intentId.asInstanceOf[js.Any],
        "localeId" -> localeId.asInstanceOf[js.Any],
        "slotId" -> slotId.asInstanceOf[js.Any],
        "slotName" -> slotName.asInstanceOf[js.Any],
        "slotTypeId" -> slotTypeId.asInstanceOf[js.Any],
        "valueElicitationSetting" -> valueElicitationSetting.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      obfuscationSetting.foreach(__v => __obj.updateDynamic("obfuscationSetting")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSlotRequest]
    }
  }

  @js.native
  trait UpdateSlotResponse extends js.Object {
    var botId: js.UndefOr[Id]
    var botVersion: js.UndefOr[DraftBotVersion]
    var creationDateTime: js.UndefOr[Timestamp]
    var description: js.UndefOr[Description]
    var intentId: js.UndefOr[Id]
    var lastUpdatedDateTime: js.UndefOr[Timestamp]
    var localeId: js.UndefOr[LocaleId]
    var obfuscationSetting: js.UndefOr[ObfuscationSetting]
    var slotId: js.UndefOr[Id]
    var slotName: js.UndefOr[Name]
    var slotTypeId: js.UndefOr[BuiltInOrCustomSlotTypeId]
    var valueElicitationSetting: js.UndefOr[SlotValueElicitationSetting]
  }

  object UpdateSlotResponse {
    @inline
    def apply(
        botId: js.UndefOr[Id] = js.undefined,
        botVersion: js.UndefOr[DraftBotVersion] = js.undefined,
        creationDateTime: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        intentId: js.UndefOr[Id] = js.undefined,
        lastUpdatedDateTime: js.UndefOr[Timestamp] = js.undefined,
        localeId: js.UndefOr[LocaleId] = js.undefined,
        obfuscationSetting: js.UndefOr[ObfuscationSetting] = js.undefined,
        slotId: js.UndefOr[Id] = js.undefined,
        slotName: js.UndefOr[Name] = js.undefined,
        slotTypeId: js.UndefOr[BuiltInOrCustomSlotTypeId] = js.undefined,
        valueElicitationSetting: js.UndefOr[SlotValueElicitationSetting] = js.undefined
    ): UpdateSlotResponse = {
      val __obj = js.Dynamic.literal()
      botId.foreach(__v => __obj.updateDynamic("botId")(__v.asInstanceOf[js.Any]))
      botVersion.foreach(__v => __obj.updateDynamic("botVersion")(__v.asInstanceOf[js.Any]))
      creationDateTime.foreach(__v => __obj.updateDynamic("creationDateTime")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      intentId.foreach(__v => __obj.updateDynamic("intentId")(__v.asInstanceOf[js.Any]))
      lastUpdatedDateTime.foreach(__v => __obj.updateDynamic("lastUpdatedDateTime")(__v.asInstanceOf[js.Any]))
      localeId.foreach(__v => __obj.updateDynamic("localeId")(__v.asInstanceOf[js.Any]))
      obfuscationSetting.foreach(__v => __obj.updateDynamic("obfuscationSetting")(__v.asInstanceOf[js.Any]))
      slotId.foreach(__v => __obj.updateDynamic("slotId")(__v.asInstanceOf[js.Any]))
      slotName.foreach(__v => __obj.updateDynamic("slotName")(__v.asInstanceOf[js.Any]))
      slotTypeId.foreach(__v => __obj.updateDynamic("slotTypeId")(__v.asInstanceOf[js.Any]))
      valueElicitationSetting.foreach(__v => __obj.updateDynamic("valueElicitationSetting")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSlotResponse]
    }
  }

  @js.native
  trait UpdateSlotTypeRequest extends js.Object {
    var botId: Id
    var botVersion: DraftBotVersion
    var localeId: LocaleId
    var slotTypeId: Id
    var slotTypeName: Name
    var valueSelectionSetting: SlotValueSelectionSetting
    var description: js.UndefOr[Description]
    var parentSlotTypeSignature: js.UndefOr[SlotTypeSignature]
    var slotTypeValues: js.UndefOr[SlotTypeValues]
  }

  object UpdateSlotTypeRequest {
    @inline
    def apply(
        botId: Id,
        botVersion: DraftBotVersion,
        localeId: LocaleId,
        slotTypeId: Id,
        slotTypeName: Name,
        valueSelectionSetting: SlotValueSelectionSetting,
        description: js.UndefOr[Description] = js.undefined,
        parentSlotTypeSignature: js.UndefOr[SlotTypeSignature] = js.undefined,
        slotTypeValues: js.UndefOr[SlotTypeValues] = js.undefined
    ): UpdateSlotTypeRequest = {
      val __obj = js.Dynamic.literal(
        "botId" -> botId.asInstanceOf[js.Any],
        "botVersion" -> botVersion.asInstanceOf[js.Any],
        "localeId" -> localeId.asInstanceOf[js.Any],
        "slotTypeId" -> slotTypeId.asInstanceOf[js.Any],
        "slotTypeName" -> slotTypeName.asInstanceOf[js.Any],
        "valueSelectionSetting" -> valueSelectionSetting.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      parentSlotTypeSignature.foreach(__v => __obj.updateDynamic("parentSlotTypeSignature")(__v.asInstanceOf[js.Any]))
      slotTypeValues.foreach(__v => __obj.updateDynamic("slotTypeValues")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSlotTypeRequest]
    }
  }

  @js.native
  trait UpdateSlotTypeResponse extends js.Object {
    var botId: js.UndefOr[Id]
    var botVersion: js.UndefOr[DraftBotVersion]
    var creationDateTime: js.UndefOr[Timestamp]
    var description: js.UndefOr[Description]
    var lastUpdatedDateTime: js.UndefOr[Timestamp]
    var localeId: js.UndefOr[LocaleId]
    var parentSlotTypeSignature: js.UndefOr[SlotTypeSignature]
    var slotTypeId: js.UndefOr[Id]
    var slotTypeName: js.UndefOr[Name]
    var slotTypeValues: js.UndefOr[SlotTypeValues]
    var valueSelectionSetting: js.UndefOr[SlotValueSelectionSetting]
  }

  object UpdateSlotTypeResponse {
    @inline
    def apply(
        botId: js.UndefOr[Id] = js.undefined,
        botVersion: js.UndefOr[DraftBotVersion] = js.undefined,
        creationDateTime: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        lastUpdatedDateTime: js.UndefOr[Timestamp] = js.undefined,
        localeId: js.UndefOr[LocaleId] = js.undefined,
        parentSlotTypeSignature: js.UndefOr[SlotTypeSignature] = js.undefined,
        slotTypeId: js.UndefOr[Id] = js.undefined,
        slotTypeName: js.UndefOr[Name] = js.undefined,
        slotTypeValues: js.UndefOr[SlotTypeValues] = js.undefined,
        valueSelectionSetting: js.UndefOr[SlotValueSelectionSetting] = js.undefined
    ): UpdateSlotTypeResponse = {
      val __obj = js.Dynamic.literal()
      botId.foreach(__v => __obj.updateDynamic("botId")(__v.asInstanceOf[js.Any]))
      botVersion.foreach(__v => __obj.updateDynamic("botVersion")(__v.asInstanceOf[js.Any]))
      creationDateTime.foreach(__v => __obj.updateDynamic("creationDateTime")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      lastUpdatedDateTime.foreach(__v => __obj.updateDynamic("lastUpdatedDateTime")(__v.asInstanceOf[js.Any]))
      localeId.foreach(__v => __obj.updateDynamic("localeId")(__v.asInstanceOf[js.Any]))
      parentSlotTypeSignature.foreach(__v => __obj.updateDynamic("parentSlotTypeSignature")(__v.asInstanceOf[js.Any]))
      slotTypeId.foreach(__v => __obj.updateDynamic("slotTypeId")(__v.asInstanceOf[js.Any]))
      slotTypeName.foreach(__v => __obj.updateDynamic("slotTypeName")(__v.asInstanceOf[js.Any]))
      slotTypeValues.foreach(__v => __obj.updateDynamic("slotTypeValues")(__v.asInstanceOf[js.Any]))
      valueSelectionSetting.foreach(__v => __obj.updateDynamic("valueSelectionSetting")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSlotTypeResponse]
    }
  }

  /** Defines settings for using an Amazon Polly voice to communicate with a user.
    */
  @js.native
  trait VoiceSettings extends js.Object {
    var voiceId: VoiceId
  }

  object VoiceSettings {
    @inline
    def apply(
        voiceId: VoiceId
    ): VoiceSettings = {
      val __obj = js.Dynamic.literal(
        "voiceId" -> voiceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[VoiceSettings]
    }
  }

  /** Specifies the prompts that Amazon Lex uses while a bot is waiting for customer input.
    */
  @js.native
  trait WaitAndContinueSpecification extends js.Object {
    var continueResponse: ResponseSpecification
    var waitingResponse: ResponseSpecification
    var stillWaitingResponse: js.UndefOr[StillWaitingResponseSpecification]
  }

  object WaitAndContinueSpecification {
    @inline
    def apply(
        continueResponse: ResponseSpecification,
        waitingResponse: ResponseSpecification,
        stillWaitingResponse: js.UndefOr[StillWaitingResponseSpecification] = js.undefined
    ): WaitAndContinueSpecification = {
      val __obj = js.Dynamic.literal(
        "continueResponse" -> continueResponse.asInstanceOf[js.Any],
        "waitingResponse" -> waitingResponse.asInstanceOf[js.Any]
      )

      stillWaitingResponse.foreach(__v => __obj.updateDynamic("stillWaitingResponse")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WaitAndContinueSpecification]
    }
  }
}
