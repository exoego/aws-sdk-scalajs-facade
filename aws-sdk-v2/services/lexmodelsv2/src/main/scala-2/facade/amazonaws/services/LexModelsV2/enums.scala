package facade.amazonaws.services.lexmodelsv2

import scalajs.js

@js.native
sealed trait AggregatedUtterancesFilterName extends js.Any
object AggregatedUtterancesFilterName {
  val Utterance = "Utterance".asInstanceOf[AggregatedUtterancesFilterName]

  @inline def values: js.Array[AggregatedUtterancesFilterName] = js.Array(Utterance)
}

@js.native
sealed trait AggregatedUtterancesFilterOperator extends js.Any
object AggregatedUtterancesFilterOperator {
  val CO = "CO".asInstanceOf[AggregatedUtterancesFilterOperator]
  val EQ = "EQ".asInstanceOf[AggregatedUtterancesFilterOperator]

  @inline def values: js.Array[AggregatedUtterancesFilterOperator] = js.Array(CO, EQ)
}

@js.native
sealed trait AggregatedUtterancesSortAttribute extends js.Any
object AggregatedUtterancesSortAttribute {
  val HitCount = "HitCount".asInstanceOf[AggregatedUtterancesSortAttribute]
  val MissedCount = "MissedCount".asInstanceOf[AggregatedUtterancesSortAttribute]

  @inline def values: js.Array[AggregatedUtterancesSortAttribute] = js.Array(HitCount, MissedCount)
}

@js.native
sealed trait AssociatedTranscriptFilterName extends js.Any
object AssociatedTranscriptFilterName {
  val IntentId = "IntentId".asInstanceOf[AssociatedTranscriptFilterName]
  val SlotTypeId = "SlotTypeId".asInstanceOf[AssociatedTranscriptFilterName]

  @inline def values: js.Array[AssociatedTranscriptFilterName] = js.Array(IntentId, SlotTypeId)
}

@js.native
sealed trait AudioRecognitionStrategy extends js.Any
object AudioRecognitionStrategy {
  val UseSlotValuesAsCustomVocabulary = "UseSlotValuesAsCustomVocabulary".asInstanceOf[AudioRecognitionStrategy]

  @inline def values: js.Array[AudioRecognitionStrategy] = js.Array(UseSlotValuesAsCustomVocabulary)
}

@js.native
sealed trait BotAliasStatus extends js.Any
object BotAliasStatus {
  val Creating = "Creating".asInstanceOf[BotAliasStatus]
  val Available = "Available".asInstanceOf[BotAliasStatus]
  val Deleting = "Deleting".asInstanceOf[BotAliasStatus]
  val Failed = "Failed".asInstanceOf[BotAliasStatus]

  @inline def values: js.Array[BotAliasStatus] = js.Array(Creating, Available, Deleting, Failed)
}

@js.native
sealed trait BotFilterName extends js.Any
object BotFilterName {
  val BotName = "BotName".asInstanceOf[BotFilterName]

  @inline def values: js.Array[BotFilterName] = js.Array(BotName)
}

@js.native
sealed trait BotFilterOperator extends js.Any
object BotFilterOperator {
  val CO = "CO".asInstanceOf[BotFilterOperator]
  val EQ = "EQ".asInstanceOf[BotFilterOperator]

  @inline def values: js.Array[BotFilterOperator] = js.Array(CO, EQ)
}

@js.native
sealed trait BotLocaleFilterName extends js.Any
object BotLocaleFilterName {
  val BotLocaleName = "BotLocaleName".asInstanceOf[BotLocaleFilterName]

  @inline def values: js.Array[BotLocaleFilterName] = js.Array(BotLocaleName)
}

@js.native
sealed trait BotLocaleFilterOperator extends js.Any
object BotLocaleFilterOperator {
  val CO = "CO".asInstanceOf[BotLocaleFilterOperator]
  val EQ = "EQ".asInstanceOf[BotLocaleFilterOperator]

  @inline def values: js.Array[BotLocaleFilterOperator] = js.Array(CO, EQ)
}

@js.native
sealed trait BotLocaleSortAttribute extends js.Any
object BotLocaleSortAttribute {
  val BotLocaleName = "BotLocaleName".asInstanceOf[BotLocaleSortAttribute]

  @inline def values: js.Array[BotLocaleSortAttribute] = js.Array(BotLocaleName)
}

@js.native
sealed trait BotLocaleStatus extends js.Any
object BotLocaleStatus {
  val Creating = "Creating".asInstanceOf[BotLocaleStatus]
  val Building = "Building".asInstanceOf[BotLocaleStatus]
  val Built = "Built".asInstanceOf[BotLocaleStatus]
  val ReadyExpressTesting = "ReadyExpressTesting".asInstanceOf[BotLocaleStatus]
  val Failed = "Failed".asInstanceOf[BotLocaleStatus]
  val Deleting = "Deleting".asInstanceOf[BotLocaleStatus]
  val NotBuilt = "NotBuilt".asInstanceOf[BotLocaleStatus]
  val Importing = "Importing".asInstanceOf[BotLocaleStatus]
  val Processing = "Processing".asInstanceOf[BotLocaleStatus]

  @inline def values: js.Array[BotLocaleStatus] = js.Array(Creating, Building, Built, ReadyExpressTesting, Failed, Deleting, NotBuilt, Importing, Processing)
}

@js.native
sealed trait BotRecommendationStatus extends js.Any
object BotRecommendationStatus {
  val Processing = "Processing".asInstanceOf[BotRecommendationStatus]
  val Deleting = "Deleting".asInstanceOf[BotRecommendationStatus]
  val Deleted = "Deleted".asInstanceOf[BotRecommendationStatus]
  val Downloading = "Downloading".asInstanceOf[BotRecommendationStatus]
  val Updating = "Updating".asInstanceOf[BotRecommendationStatus]
  val Available = "Available".asInstanceOf[BotRecommendationStatus]
  val Failed = "Failed".asInstanceOf[BotRecommendationStatus]
  val Stopping = "Stopping".asInstanceOf[BotRecommendationStatus]
  val Stopped = "Stopped".asInstanceOf[BotRecommendationStatus]

  @inline def values: js.Array[BotRecommendationStatus] = js.Array(Processing, Deleting, Deleted, Downloading, Updating, Available, Failed, Stopping, Stopped)
}

@js.native
sealed trait BotSortAttribute extends js.Any
object BotSortAttribute {
  val BotName = "BotName".asInstanceOf[BotSortAttribute]

  @inline def values: js.Array[BotSortAttribute] = js.Array(BotName)
}

@js.native
sealed trait BotStatus extends js.Any
object BotStatus {
  val Creating = "Creating".asInstanceOf[BotStatus]
  val Available = "Available".asInstanceOf[BotStatus]
  val Inactive = "Inactive".asInstanceOf[BotStatus]
  val Deleting = "Deleting".asInstanceOf[BotStatus]
  val Failed = "Failed".asInstanceOf[BotStatus]
  val Versioning = "Versioning".asInstanceOf[BotStatus]
  val Importing = "Importing".asInstanceOf[BotStatus]

  @inline def values: js.Array[BotStatus] = js.Array(Creating, Available, Inactive, Deleting, Failed, Versioning, Importing)
}

@js.native
sealed trait BotVersionSortAttribute extends js.Any
object BotVersionSortAttribute {
  val BotVersion = "BotVersion".asInstanceOf[BotVersionSortAttribute]

  @inline def values: js.Array[BotVersionSortAttribute] = js.Array(BotVersion)
}

@js.native
sealed trait BuiltInIntentSortAttribute extends js.Any
object BuiltInIntentSortAttribute {
  val IntentSignature = "IntentSignature".asInstanceOf[BuiltInIntentSortAttribute]

  @inline def values: js.Array[BuiltInIntentSortAttribute] = js.Array(IntentSignature)
}

@js.native
sealed trait BuiltInSlotTypeSortAttribute extends js.Any
object BuiltInSlotTypeSortAttribute {
  val SlotTypeSignature = "SlotTypeSignature".asInstanceOf[BuiltInSlotTypeSortAttribute]

  @inline def values: js.Array[BuiltInSlotTypeSortAttribute] = js.Array(SlotTypeSignature)
}

@js.native
sealed trait CustomVocabularyStatus extends js.Any
object CustomVocabularyStatus {
  val Ready = "Ready".asInstanceOf[CustomVocabularyStatus]
  val Deleting = "Deleting".asInstanceOf[CustomVocabularyStatus]
  val Exporting = "Exporting".asInstanceOf[CustomVocabularyStatus]
  val Importing = "Importing".asInstanceOf[CustomVocabularyStatus]
  val Creating = "Creating".asInstanceOf[CustomVocabularyStatus]

  @inline def values: js.Array[CustomVocabularyStatus] = js.Array(Ready, Deleting, Exporting, Importing, Creating)
}

@js.native
sealed trait DialogActionType extends js.Any
object DialogActionType {
  val ElicitIntent = "ElicitIntent".asInstanceOf[DialogActionType]
  val StartIntent = "StartIntent".asInstanceOf[DialogActionType]
  val ElicitSlot = "ElicitSlot".asInstanceOf[DialogActionType]
  val EvaluateConditional = "EvaluateConditional".asInstanceOf[DialogActionType]
  val InvokeDialogCodeHook = "InvokeDialogCodeHook".asInstanceOf[DialogActionType]
  val ConfirmIntent = "ConfirmIntent".asInstanceOf[DialogActionType]
  val FulfillIntent = "FulfillIntent".asInstanceOf[DialogActionType]
  val CloseIntent = "CloseIntent".asInstanceOf[DialogActionType]
  val EndConversation = "EndConversation".asInstanceOf[DialogActionType]

  @inline def values: js.Array[DialogActionType] = js.Array(ElicitIntent, StartIntent, ElicitSlot, EvaluateConditional, InvokeDialogCodeHook, ConfirmIntent, FulfillIntent, CloseIntent, EndConversation)
}

@js.native
sealed trait Effect extends js.Any
object Effect {
  val Allow = "Allow".asInstanceOf[Effect]
  val Deny = "Deny".asInstanceOf[Effect]

  @inline def values: js.Array[Effect] = js.Array(Allow, Deny)
}

@js.native
sealed trait ErrorCode extends js.Any
object ErrorCode {
  val DUPLICATE_INPUT = "DUPLICATE_INPUT".asInstanceOf[ErrorCode]
  val RESOURCE_DOES_NOT_EXIST = "RESOURCE_DOES_NOT_EXIST".asInstanceOf[ErrorCode]
  val RESOURCE_ALREADY_EXISTS = "RESOURCE_ALREADY_EXISTS".asInstanceOf[ErrorCode]
  val INTERNAL_SERVER_FAILURE = "INTERNAL_SERVER_FAILURE".asInstanceOf[ErrorCode]

  @inline def values: js.Array[ErrorCode] = js.Array(DUPLICATE_INPUT, RESOURCE_DOES_NOT_EXIST, RESOURCE_ALREADY_EXISTS, INTERNAL_SERVER_FAILURE)
}

@js.native
sealed trait ExportFilterName extends js.Any
object ExportFilterName {
  val ExportResourceType = "ExportResourceType".asInstanceOf[ExportFilterName]

  @inline def values: js.Array[ExportFilterName] = js.Array(ExportResourceType)
}

@js.native
sealed trait ExportFilterOperator extends js.Any
object ExportFilterOperator {
  val CO = "CO".asInstanceOf[ExportFilterOperator]
  val EQ = "EQ".asInstanceOf[ExportFilterOperator]

  @inline def values: js.Array[ExportFilterOperator] = js.Array(CO, EQ)
}

@js.native
sealed trait ExportSortAttribute extends js.Any
object ExportSortAttribute {
  val LastUpdatedDateTime = "LastUpdatedDateTime".asInstanceOf[ExportSortAttribute]

  @inline def values: js.Array[ExportSortAttribute] = js.Array(LastUpdatedDateTime)
}

@js.native
sealed trait ExportStatus extends js.Any
object ExportStatus {
  val InProgress = "InProgress".asInstanceOf[ExportStatus]
  val Completed = "Completed".asInstanceOf[ExportStatus]
  val Failed = "Failed".asInstanceOf[ExportStatus]
  val Deleting = "Deleting".asInstanceOf[ExportStatus]

  @inline def values: js.Array[ExportStatus] = js.Array(InProgress, Completed, Failed, Deleting)
}

@js.native
sealed trait ImportExportFileFormat extends js.Any
object ImportExportFileFormat {
  val LexJson = "LexJson".asInstanceOf[ImportExportFileFormat]
  val TSV = "TSV".asInstanceOf[ImportExportFileFormat]

  @inline def values: js.Array[ImportExportFileFormat] = js.Array(LexJson, TSV)
}

@js.native
sealed trait ImportFilterName extends js.Any
object ImportFilterName {
  val ImportResourceType = "ImportResourceType".asInstanceOf[ImportFilterName]

  @inline def values: js.Array[ImportFilterName] = js.Array(ImportResourceType)
}

@js.native
sealed trait ImportFilterOperator extends js.Any
object ImportFilterOperator {
  val CO = "CO".asInstanceOf[ImportFilterOperator]
  val EQ = "EQ".asInstanceOf[ImportFilterOperator]

  @inline def values: js.Array[ImportFilterOperator] = js.Array(CO, EQ)
}

@js.native
sealed trait ImportResourceType extends js.Any
object ImportResourceType {
  val Bot = "Bot".asInstanceOf[ImportResourceType]
  val BotLocale = "BotLocale".asInstanceOf[ImportResourceType]
  val CustomVocabulary = "CustomVocabulary".asInstanceOf[ImportResourceType]

  @inline def values: js.Array[ImportResourceType] = js.Array(Bot, BotLocale, CustomVocabulary)
}

@js.native
sealed trait ImportSortAttribute extends js.Any
object ImportSortAttribute {
  val LastUpdatedDateTime = "LastUpdatedDateTime".asInstanceOf[ImportSortAttribute]

  @inline def values: js.Array[ImportSortAttribute] = js.Array(LastUpdatedDateTime)
}

@js.native
sealed trait ImportStatus extends js.Any
object ImportStatus {
  val InProgress = "InProgress".asInstanceOf[ImportStatus]
  val Completed = "Completed".asInstanceOf[ImportStatus]
  val Failed = "Failed".asInstanceOf[ImportStatus]
  val Deleting = "Deleting".asInstanceOf[ImportStatus]

  @inline def values: js.Array[ImportStatus] = js.Array(InProgress, Completed, Failed, Deleting)
}

@js.native
sealed trait IntentFilterName extends js.Any
object IntentFilterName {
  val IntentName = "IntentName".asInstanceOf[IntentFilterName]

  @inline def values: js.Array[IntentFilterName] = js.Array(IntentName)
}

@js.native
sealed trait IntentFilterOperator extends js.Any
object IntentFilterOperator {
  val CO = "CO".asInstanceOf[IntentFilterOperator]
  val EQ = "EQ".asInstanceOf[IntentFilterOperator]

  @inline def values: js.Array[IntentFilterOperator] = js.Array(CO, EQ)
}

@js.native
sealed trait IntentSortAttribute extends js.Any
object IntentSortAttribute {
  val IntentName = "IntentName".asInstanceOf[IntentSortAttribute]
  val LastUpdatedDateTime = "LastUpdatedDateTime".asInstanceOf[IntentSortAttribute]

  @inline def values: js.Array[IntentSortAttribute] = js.Array(IntentName, LastUpdatedDateTime)
}

@js.native
sealed trait MergeStrategy extends js.Any
object MergeStrategy {
  val Overwrite = "Overwrite".asInstanceOf[MergeStrategy]
  val FailOnConflict = "FailOnConflict".asInstanceOf[MergeStrategy]
  val Append = "Append".asInstanceOf[MergeStrategy]

  @inline def values: js.Array[MergeStrategy] = js.Array(Overwrite, FailOnConflict, Append)
}

@js.native
sealed trait MessageSelectionStrategy extends js.Any
object MessageSelectionStrategy {
  val Random = "Random".asInstanceOf[MessageSelectionStrategy]
  val Ordered = "Ordered".asInstanceOf[MessageSelectionStrategy]

  @inline def values: js.Array[MessageSelectionStrategy] = js.Array(Random, Ordered)
}

@js.native
sealed trait ObfuscationSettingType extends js.Any
object ObfuscationSettingType {
  val None = "None".asInstanceOf[ObfuscationSettingType]
  val DefaultObfuscation = "DefaultObfuscation".asInstanceOf[ObfuscationSettingType]

  @inline def values: js.Array[ObfuscationSettingType] = js.Array(None, DefaultObfuscation)
}

/** The attempt name of attempts of a prompt.
  */
@js.native
sealed trait PromptAttempt extends js.Any
object PromptAttempt {
  val Initial = "Initial".asInstanceOf[PromptAttempt]
  val Retry1 = "Retry1".asInstanceOf[PromptAttempt]
  val Retry2 = "Retry2".asInstanceOf[PromptAttempt]
  val Retry3 = "Retry3".asInstanceOf[PromptAttempt]
  val Retry4 = "Retry4".asInstanceOf[PromptAttempt]
  val Retry5 = "Retry5".asInstanceOf[PromptAttempt]

  @inline def values: js.Array[PromptAttempt] = js.Array(Initial, Retry1, Retry2, Retry3, Retry4, Retry5)
}

@js.native
sealed trait SearchOrder extends js.Any
object SearchOrder {
  val Ascending = "Ascending".asInstanceOf[SearchOrder]
  val Descending = "Descending".asInstanceOf[SearchOrder]

  @inline def values: js.Array[SearchOrder] = js.Array(Ascending, Descending)
}

@js.native
sealed trait SlotConstraint extends js.Any
object SlotConstraint {
  val Required = "Required".asInstanceOf[SlotConstraint]
  val Optional = "Optional".asInstanceOf[SlotConstraint]

  @inline def values: js.Array[SlotConstraint] = js.Array(Required, Optional)
}

@js.native
sealed trait SlotFilterName extends js.Any
object SlotFilterName {
  val SlotName = "SlotName".asInstanceOf[SlotFilterName]

  @inline def values: js.Array[SlotFilterName] = js.Array(SlotName)
}

@js.native
sealed trait SlotFilterOperator extends js.Any
object SlotFilterOperator {
  val CO = "CO".asInstanceOf[SlotFilterOperator]
  val EQ = "EQ".asInstanceOf[SlotFilterOperator]

  @inline def values: js.Array[SlotFilterOperator] = js.Array(CO, EQ)
}

@js.native
sealed trait SlotShape extends js.Any
object SlotShape {
  val Scalar = "Scalar".asInstanceOf[SlotShape]
  val List = "List".asInstanceOf[SlotShape]

  @inline def values: js.Array[SlotShape] = js.Array(Scalar, List)
}

@js.native
sealed trait SlotSortAttribute extends js.Any
object SlotSortAttribute {
  val SlotName = "SlotName".asInstanceOf[SlotSortAttribute]
  val LastUpdatedDateTime = "LastUpdatedDateTime".asInstanceOf[SlotSortAttribute]

  @inline def values: js.Array[SlotSortAttribute] = js.Array(SlotName, LastUpdatedDateTime)
}

@js.native
sealed trait SlotTypeCategory extends js.Any
object SlotTypeCategory {
  val Custom = "Custom".asInstanceOf[SlotTypeCategory]
  val Extended = "Extended".asInstanceOf[SlotTypeCategory]
  val ExternalGrammar = "ExternalGrammar".asInstanceOf[SlotTypeCategory]
  val Composite = "Composite".asInstanceOf[SlotTypeCategory]

  @inline def values: js.Array[SlotTypeCategory] = js.Array(Custom, Extended, ExternalGrammar, Composite)
}

@js.native
sealed trait SlotTypeFilterName extends js.Any
object SlotTypeFilterName {
  val SlotTypeName = "SlotTypeName".asInstanceOf[SlotTypeFilterName]
  val ExternalSourceType = "ExternalSourceType".asInstanceOf[SlotTypeFilterName]

  @inline def values: js.Array[SlotTypeFilterName] = js.Array(SlotTypeName, ExternalSourceType)
}

@js.native
sealed trait SlotTypeFilterOperator extends js.Any
object SlotTypeFilterOperator {
  val CO = "CO".asInstanceOf[SlotTypeFilterOperator]
  val EQ = "EQ".asInstanceOf[SlotTypeFilterOperator]

  @inline def values: js.Array[SlotTypeFilterOperator] = js.Array(CO, EQ)
}

@js.native
sealed trait SlotTypeSortAttribute extends js.Any
object SlotTypeSortAttribute {
  val SlotTypeName = "SlotTypeName".asInstanceOf[SlotTypeSortAttribute]
  val LastUpdatedDateTime = "LastUpdatedDateTime".asInstanceOf[SlotTypeSortAttribute]

  @inline def values: js.Array[SlotTypeSortAttribute] = js.Array(SlotTypeName, LastUpdatedDateTime)
}

@js.native
sealed trait SlotValueResolutionStrategy extends js.Any
object SlotValueResolutionStrategy {
  val OriginalValue = "OriginalValue".asInstanceOf[SlotValueResolutionStrategy]
  val TopResolution = "TopResolution".asInstanceOf[SlotValueResolutionStrategy]
  val Concatenation = "Concatenation".asInstanceOf[SlotValueResolutionStrategy]

  @inline def values: js.Array[SlotValueResolutionStrategy] = js.Array(OriginalValue, TopResolution, Concatenation)
}

@js.native
sealed trait SortOrder extends js.Any
object SortOrder {
  val Ascending = "Ascending".asInstanceOf[SortOrder]
  val Descending = "Descending".asInstanceOf[SortOrder]

  @inline def values: js.Array[SortOrder] = js.Array(Ascending, Descending)
}

@js.native
sealed trait TimeDimension extends js.Any
object TimeDimension {
  val Hours = "Hours".asInstanceOf[TimeDimension]
  val Days = "Days".asInstanceOf[TimeDimension]
  val Weeks = "Weeks".asInstanceOf[TimeDimension]

  @inline def values: js.Array[TimeDimension] = js.Array(Hours, Days, Weeks)
}

@js.native
sealed trait TranscriptFormat extends js.Any
object TranscriptFormat {
  val Lex = "Lex".asInstanceOf[TranscriptFormat]

  @inline def values: js.Array[TranscriptFormat] = js.Array(Lex)
}

@js.native
sealed trait VoiceEngine extends js.Any
object VoiceEngine {
  val standard = "standard".asInstanceOf[VoiceEngine]
  val neural = "neural".asInstanceOf[VoiceEngine]

  @inline def values: js.Array[VoiceEngine] = js.Array(standard, neural)
}
