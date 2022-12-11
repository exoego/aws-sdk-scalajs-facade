package facade.amazonaws.services.lexmodelsv2

import scalajs.js

type AggregatedUtterancesFilterName = "Utterance"
object AggregatedUtterancesFilterName {
  inline val Utterance: "Utterance" = "Utterance"

  inline def values: js.Array[AggregatedUtterancesFilterName] = js.Array(Utterance)
}

type AggregatedUtterancesFilterOperator = "CO" | "EQ"
object AggregatedUtterancesFilterOperator {
  inline val CO: "CO" = "CO"
  inline val EQ: "EQ" = "EQ"

  inline def values: js.Array[AggregatedUtterancesFilterOperator] = js.Array(CO, EQ)
}

type AggregatedUtterancesSortAttribute = "HitCount" | "MissedCount"
object AggregatedUtterancesSortAttribute {
  inline val HitCount: "HitCount" = "HitCount"
  inline val MissedCount: "MissedCount" = "MissedCount"

  inline def values: js.Array[AggregatedUtterancesSortAttribute] = js.Array(HitCount, MissedCount)
}

type AssociatedTranscriptFilterName = "IntentId" | "SlotTypeId"
object AssociatedTranscriptFilterName {
  inline val IntentId: "IntentId" = "IntentId"
  inline val SlotTypeId: "SlotTypeId" = "SlotTypeId"

  inline def values: js.Array[AssociatedTranscriptFilterName] = js.Array(IntentId, SlotTypeId)
}

type AudioRecognitionStrategy = "UseSlotValuesAsCustomVocabulary"
object AudioRecognitionStrategy {
  inline val UseSlotValuesAsCustomVocabulary: "UseSlotValuesAsCustomVocabulary" = "UseSlotValuesAsCustomVocabulary"

  inline def values: js.Array[AudioRecognitionStrategy] = js.Array(UseSlotValuesAsCustomVocabulary)
}

type BotAliasStatus = "Creating" | "Available" | "Deleting" | "Failed"
object BotAliasStatus {
  inline val Creating: "Creating" = "Creating"
  inline val Available: "Available" = "Available"
  inline val Deleting: "Deleting" = "Deleting"
  inline val Failed: "Failed" = "Failed"

  inline def values: js.Array[BotAliasStatus] = js.Array(Creating, Available, Deleting, Failed)
}

type BotFilterName = "BotName"
object BotFilterName {
  inline val BotName: "BotName" = "BotName"

  inline def values: js.Array[BotFilterName] = js.Array(BotName)
}

type BotFilterOperator = "CO" | "EQ"
object BotFilterOperator {
  inline val CO: "CO" = "CO"
  inline val EQ: "EQ" = "EQ"

  inline def values: js.Array[BotFilterOperator] = js.Array(CO, EQ)
}

type BotLocaleFilterName = "BotLocaleName"
object BotLocaleFilterName {
  inline val BotLocaleName: "BotLocaleName" = "BotLocaleName"

  inline def values: js.Array[BotLocaleFilterName] = js.Array(BotLocaleName)
}

type BotLocaleFilterOperator = "CO" | "EQ"
object BotLocaleFilterOperator {
  inline val CO: "CO" = "CO"
  inline val EQ: "EQ" = "EQ"

  inline def values: js.Array[BotLocaleFilterOperator] = js.Array(CO, EQ)
}

type BotLocaleSortAttribute = "BotLocaleName"
object BotLocaleSortAttribute {
  inline val BotLocaleName: "BotLocaleName" = "BotLocaleName"

  inline def values: js.Array[BotLocaleSortAttribute] = js.Array(BotLocaleName)
}

type BotLocaleStatus = "Creating" | "Building" | "Built" | "ReadyExpressTesting" | "Failed" | "Deleting" | "NotBuilt" | "Importing" | "Processing"
object BotLocaleStatus {
  inline val Creating: "Creating" = "Creating"
  inline val Building: "Building" = "Building"
  inline val Built: "Built" = "Built"
  inline val ReadyExpressTesting: "ReadyExpressTesting" = "ReadyExpressTesting"
  inline val Failed: "Failed" = "Failed"
  inline val Deleting: "Deleting" = "Deleting"
  inline val NotBuilt: "NotBuilt" = "NotBuilt"
  inline val Importing: "Importing" = "Importing"
  inline val Processing: "Processing" = "Processing"

  inline def values: js.Array[BotLocaleStatus] = js.Array(Creating, Building, Built, ReadyExpressTesting, Failed, Deleting, NotBuilt, Importing, Processing)
}

type BotRecommendationStatus = "Processing" | "Deleting" | "Deleted" | "Downloading" | "Updating" | "Available" | "Failed" | "Stopping" | "Stopped"
object BotRecommendationStatus {
  inline val Processing: "Processing" = "Processing"
  inline val Deleting: "Deleting" = "Deleting"
  inline val Deleted: "Deleted" = "Deleted"
  inline val Downloading: "Downloading" = "Downloading"
  inline val Updating: "Updating" = "Updating"
  inline val Available: "Available" = "Available"
  inline val Failed: "Failed" = "Failed"
  inline val Stopping: "Stopping" = "Stopping"
  inline val Stopped: "Stopped" = "Stopped"

  inline def values: js.Array[BotRecommendationStatus] = js.Array(Processing, Deleting, Deleted, Downloading, Updating, Available, Failed, Stopping, Stopped)
}

type BotSortAttribute = "BotName"
object BotSortAttribute {
  inline val BotName: "BotName" = "BotName"

  inline def values: js.Array[BotSortAttribute] = js.Array(BotName)
}

type BotStatus = "Creating" | "Available" | "Inactive" | "Deleting" | "Failed" | "Versioning" | "Importing"
object BotStatus {
  inline val Creating: "Creating" = "Creating"
  inline val Available: "Available" = "Available"
  inline val Inactive: "Inactive" = "Inactive"
  inline val Deleting: "Deleting" = "Deleting"
  inline val Failed: "Failed" = "Failed"
  inline val Versioning: "Versioning" = "Versioning"
  inline val Importing: "Importing" = "Importing"

  inline def values: js.Array[BotStatus] = js.Array(Creating, Available, Inactive, Deleting, Failed, Versioning, Importing)
}

type BotVersionSortAttribute = "BotVersion"
object BotVersionSortAttribute {
  inline val BotVersion: "BotVersion" = "BotVersion"

  inline def values: js.Array[BotVersionSortAttribute] = js.Array(BotVersion)
}

type BuiltInIntentSortAttribute = "IntentSignature"
object BuiltInIntentSortAttribute {
  inline val IntentSignature: "IntentSignature" = "IntentSignature"

  inline def values: js.Array[BuiltInIntentSortAttribute] = js.Array(IntentSignature)
}

type BuiltInSlotTypeSortAttribute = "SlotTypeSignature"
object BuiltInSlotTypeSortAttribute {
  inline val SlotTypeSignature: "SlotTypeSignature" = "SlotTypeSignature"

  inline def values: js.Array[BuiltInSlotTypeSortAttribute] = js.Array(SlotTypeSignature)
}

type CustomVocabularyStatus = "Ready" | "Deleting" | "Exporting" | "Importing" | "Creating"
object CustomVocabularyStatus {
  inline val Ready: "Ready" = "Ready"
  inline val Deleting: "Deleting" = "Deleting"
  inline val Exporting: "Exporting" = "Exporting"
  inline val Importing: "Importing" = "Importing"
  inline val Creating: "Creating" = "Creating"

  inline def values: js.Array[CustomVocabularyStatus] = js.Array(Ready, Deleting, Exporting, Importing, Creating)
}

type DialogActionType = "ElicitIntent" | "StartIntent" | "ElicitSlot" | "EvaluateConditional" | "InvokeDialogCodeHook" | "ConfirmIntent" | "FulfillIntent" | "CloseIntent" | "EndConversation"
object DialogActionType {
  inline val ElicitIntent: "ElicitIntent" = "ElicitIntent"
  inline val StartIntent: "StartIntent" = "StartIntent"
  inline val ElicitSlot: "ElicitSlot" = "ElicitSlot"
  inline val EvaluateConditional: "EvaluateConditional" = "EvaluateConditional"
  inline val InvokeDialogCodeHook: "InvokeDialogCodeHook" = "InvokeDialogCodeHook"
  inline val ConfirmIntent: "ConfirmIntent" = "ConfirmIntent"
  inline val FulfillIntent: "FulfillIntent" = "FulfillIntent"
  inline val CloseIntent: "CloseIntent" = "CloseIntent"
  inline val EndConversation: "EndConversation" = "EndConversation"

  inline def values: js.Array[DialogActionType] = js.Array(ElicitIntent, StartIntent, ElicitSlot, EvaluateConditional, InvokeDialogCodeHook, ConfirmIntent, FulfillIntent, CloseIntent, EndConversation)
}

type Effect = "Allow" | "Deny"
object Effect {
  inline val Allow: "Allow" = "Allow"
  inline val Deny: "Deny" = "Deny"

  inline def values: js.Array[Effect] = js.Array(Allow, Deny)
}

type ErrorCode = "DUPLICATE_INPUT" | "RESOURCE_DOES_NOT_EXIST" | "RESOURCE_ALREADY_EXISTS" | "INTERNAL_SERVER_FAILURE"
object ErrorCode {
  inline val DUPLICATE_INPUT: "DUPLICATE_INPUT" = "DUPLICATE_INPUT"
  inline val RESOURCE_DOES_NOT_EXIST: "RESOURCE_DOES_NOT_EXIST" = "RESOURCE_DOES_NOT_EXIST"
  inline val RESOURCE_ALREADY_EXISTS: "RESOURCE_ALREADY_EXISTS" = "RESOURCE_ALREADY_EXISTS"
  inline val INTERNAL_SERVER_FAILURE: "INTERNAL_SERVER_FAILURE" = "INTERNAL_SERVER_FAILURE"

  inline def values: js.Array[ErrorCode] = js.Array(DUPLICATE_INPUT, RESOURCE_DOES_NOT_EXIST, RESOURCE_ALREADY_EXISTS, INTERNAL_SERVER_FAILURE)
}

type ExportFilterName = "ExportResourceType"
object ExportFilterName {
  inline val ExportResourceType: "ExportResourceType" = "ExportResourceType"

  inline def values: js.Array[ExportFilterName] = js.Array(ExportResourceType)
}

type ExportFilterOperator = "CO" | "EQ"
object ExportFilterOperator {
  inline val CO: "CO" = "CO"
  inline val EQ: "EQ" = "EQ"

  inline def values: js.Array[ExportFilterOperator] = js.Array(CO, EQ)
}

type ExportSortAttribute = "LastUpdatedDateTime"
object ExportSortAttribute {
  inline val LastUpdatedDateTime: "LastUpdatedDateTime" = "LastUpdatedDateTime"

  inline def values: js.Array[ExportSortAttribute] = js.Array(LastUpdatedDateTime)
}

type ExportStatus = "InProgress" | "Completed" | "Failed" | "Deleting"
object ExportStatus {
  inline val InProgress: "InProgress" = "InProgress"
  inline val Completed: "Completed" = "Completed"
  inline val Failed: "Failed" = "Failed"
  inline val Deleting: "Deleting" = "Deleting"

  inline def values: js.Array[ExportStatus] = js.Array(InProgress, Completed, Failed, Deleting)
}

type ImportExportFileFormat = "LexJson" | "TSV"
object ImportExportFileFormat {
  inline val LexJson: "LexJson" = "LexJson"
  inline val TSV: "TSV" = "TSV"

  inline def values: js.Array[ImportExportFileFormat] = js.Array(LexJson, TSV)
}

type ImportFilterName = "ImportResourceType"
object ImportFilterName {
  inline val ImportResourceType: "ImportResourceType" = "ImportResourceType"

  inline def values: js.Array[ImportFilterName] = js.Array(ImportResourceType)
}

type ImportFilterOperator = "CO" | "EQ"
object ImportFilterOperator {
  inline val CO: "CO" = "CO"
  inline val EQ: "EQ" = "EQ"

  inline def values: js.Array[ImportFilterOperator] = js.Array(CO, EQ)
}

type ImportResourceType = "Bot" | "BotLocale" | "CustomVocabulary"
object ImportResourceType {
  inline val Bot: "Bot" = "Bot"
  inline val BotLocale: "BotLocale" = "BotLocale"
  inline val CustomVocabulary: "CustomVocabulary" = "CustomVocabulary"

  inline def values: js.Array[ImportResourceType] = js.Array(Bot, BotLocale, CustomVocabulary)
}

type ImportSortAttribute = "LastUpdatedDateTime"
object ImportSortAttribute {
  inline val LastUpdatedDateTime: "LastUpdatedDateTime" = "LastUpdatedDateTime"

  inline def values: js.Array[ImportSortAttribute] = js.Array(LastUpdatedDateTime)
}

type ImportStatus = "InProgress" | "Completed" | "Failed" | "Deleting"
object ImportStatus {
  inline val InProgress: "InProgress" = "InProgress"
  inline val Completed: "Completed" = "Completed"
  inline val Failed: "Failed" = "Failed"
  inline val Deleting: "Deleting" = "Deleting"

  inline def values: js.Array[ImportStatus] = js.Array(InProgress, Completed, Failed, Deleting)
}

type IntentFilterName = "IntentName"
object IntentFilterName {
  inline val IntentName: "IntentName" = "IntentName"

  inline def values: js.Array[IntentFilterName] = js.Array(IntentName)
}

type IntentFilterOperator = "CO" | "EQ"
object IntentFilterOperator {
  inline val CO: "CO" = "CO"
  inline val EQ: "EQ" = "EQ"

  inline def values: js.Array[IntentFilterOperator] = js.Array(CO, EQ)
}

type IntentSortAttribute = "IntentName" | "LastUpdatedDateTime"
object IntentSortAttribute {
  inline val IntentName: "IntentName" = "IntentName"
  inline val LastUpdatedDateTime: "LastUpdatedDateTime" = "LastUpdatedDateTime"

  inline def values: js.Array[IntentSortAttribute] = js.Array(IntentName, LastUpdatedDateTime)
}

type MergeStrategy = "Overwrite" | "FailOnConflict" | "Append"
object MergeStrategy {
  inline val Overwrite: "Overwrite" = "Overwrite"
  inline val FailOnConflict: "FailOnConflict" = "FailOnConflict"
  inline val Append: "Append" = "Append"

  inline def values: js.Array[MergeStrategy] = js.Array(Overwrite, FailOnConflict, Append)
}

type MessageSelectionStrategy = "Random" | "Ordered"
object MessageSelectionStrategy {
  inline val Random: "Random" = "Random"
  inline val Ordered: "Ordered" = "Ordered"

  inline def values: js.Array[MessageSelectionStrategy] = js.Array(Random, Ordered)
}

type ObfuscationSettingType = "None" | "DefaultObfuscation"
object ObfuscationSettingType {
  inline val None: "None" = "None"
  inline val DefaultObfuscation: "DefaultObfuscation" = "DefaultObfuscation"

  inline def values: js.Array[ObfuscationSettingType] = js.Array(None, DefaultObfuscation)
}

/** The attempt name of attempts of a prompt.
  */
type PromptAttempt = "Initial" | "Retry1" | "Retry2" | "Retry3" | "Retry4" | "Retry5"
object PromptAttempt {
  inline val Initial: "Initial" = "Initial"
  inline val Retry1: "Retry1" = "Retry1"
  inline val Retry2: "Retry2" = "Retry2"
  inline val Retry3: "Retry3" = "Retry3"
  inline val Retry4: "Retry4" = "Retry4"
  inline val Retry5: "Retry5" = "Retry5"

  inline def values: js.Array[PromptAttempt] = js.Array(Initial, Retry1, Retry2, Retry3, Retry4, Retry5)
}

type SearchOrder = "Ascending" | "Descending"
object SearchOrder {
  inline val Ascending: "Ascending" = "Ascending"
  inline val Descending: "Descending" = "Descending"

  inline def values: js.Array[SearchOrder] = js.Array(Ascending, Descending)
}

type SlotConstraint = "Required" | "Optional"
object SlotConstraint {
  inline val Required: "Required" = "Required"
  inline val Optional: "Optional" = "Optional"

  inline def values: js.Array[SlotConstraint] = js.Array(Required, Optional)
}

type SlotFilterName = "SlotName"
object SlotFilterName {
  inline val SlotName: "SlotName" = "SlotName"

  inline def values: js.Array[SlotFilterName] = js.Array(SlotName)
}

type SlotFilterOperator = "CO" | "EQ"
object SlotFilterOperator {
  inline val CO: "CO" = "CO"
  inline val EQ: "EQ" = "EQ"

  inline def values: js.Array[SlotFilterOperator] = js.Array(CO, EQ)
}

type SlotShape = "Scalar" | "List"
object SlotShape {
  inline val Scalar: "Scalar" = "Scalar"
  inline val List: "List" = "List"

  inline def values: js.Array[SlotShape] = js.Array(Scalar, List)
}

type SlotSortAttribute = "SlotName" | "LastUpdatedDateTime"
object SlotSortAttribute {
  inline val SlotName: "SlotName" = "SlotName"
  inline val LastUpdatedDateTime: "LastUpdatedDateTime" = "LastUpdatedDateTime"

  inline def values: js.Array[SlotSortAttribute] = js.Array(SlotName, LastUpdatedDateTime)
}

type SlotTypeCategory = "Custom" | "Extended" | "ExternalGrammar" | "Composite"
object SlotTypeCategory {
  inline val Custom: "Custom" = "Custom"
  inline val Extended: "Extended" = "Extended"
  inline val ExternalGrammar: "ExternalGrammar" = "ExternalGrammar"
  inline val Composite: "Composite" = "Composite"

  inline def values: js.Array[SlotTypeCategory] = js.Array(Custom, Extended, ExternalGrammar, Composite)
}

type SlotTypeFilterName = "SlotTypeName" | "ExternalSourceType"
object SlotTypeFilterName {
  inline val SlotTypeName: "SlotTypeName" = "SlotTypeName"
  inline val ExternalSourceType: "ExternalSourceType" = "ExternalSourceType"

  inline def values: js.Array[SlotTypeFilterName] = js.Array(SlotTypeName, ExternalSourceType)
}

type SlotTypeFilterOperator = "CO" | "EQ"
object SlotTypeFilterOperator {
  inline val CO: "CO" = "CO"
  inline val EQ: "EQ" = "EQ"

  inline def values: js.Array[SlotTypeFilterOperator] = js.Array(CO, EQ)
}

type SlotTypeSortAttribute = "SlotTypeName" | "LastUpdatedDateTime"
object SlotTypeSortAttribute {
  inline val SlotTypeName: "SlotTypeName" = "SlotTypeName"
  inline val LastUpdatedDateTime: "LastUpdatedDateTime" = "LastUpdatedDateTime"

  inline def values: js.Array[SlotTypeSortAttribute] = js.Array(SlotTypeName, LastUpdatedDateTime)
}

type SlotValueResolutionStrategy = "OriginalValue" | "TopResolution" | "Concatenation"
object SlotValueResolutionStrategy {
  inline val OriginalValue: "OriginalValue" = "OriginalValue"
  inline val TopResolution: "TopResolution" = "TopResolution"
  inline val Concatenation: "Concatenation" = "Concatenation"

  inline def values: js.Array[SlotValueResolutionStrategy] = js.Array(OriginalValue, TopResolution, Concatenation)
}

type SortOrder = "Ascending" | "Descending"
object SortOrder {
  inline val Ascending: "Ascending" = "Ascending"
  inline val Descending: "Descending" = "Descending"

  inline def values: js.Array[SortOrder] = js.Array(Ascending, Descending)
}

type TimeDimension = "Hours" | "Days" | "Weeks"
object TimeDimension {
  inline val Hours: "Hours" = "Hours"
  inline val Days: "Days" = "Days"
  inline val Weeks: "Weeks" = "Weeks"

  inline def values: js.Array[TimeDimension] = js.Array(Hours, Days, Weeks)
}

type TranscriptFormat = "Lex"
object TranscriptFormat {
  inline val Lex: "Lex" = "Lex"

  inline def values: js.Array[TranscriptFormat] = js.Array(Lex)
}

type VoiceEngine = "standard" | "neural"
object VoiceEngine {
  inline val standard: "standard" = "standard"
  inline val neural: "neural" = "neural"

  inline def values: js.Array[VoiceEngine] = js.Array(standard, neural)
}
