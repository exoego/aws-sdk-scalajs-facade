package facade.amazonaws.services.lexmodelsv2

import scalajs.js

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

type BotLocaleStatus = "Creating" | "Building" | "Built" | "ReadyExpressTesting" | "Failed" | "Deleting" | "NotBuilt"
object BotLocaleStatus {
  inline val Creating: "Creating" = "Creating"
  inline val Building: "Building" = "Building"
  inline val Built: "Built" = "Built"
  inline val ReadyExpressTesting: "ReadyExpressTesting" = "ReadyExpressTesting"
  inline val Failed: "Failed" = "Failed"
  inline val Deleting: "Deleting" = "Deleting"
  inline val NotBuilt: "NotBuilt" = "NotBuilt"

  inline def values: js.Array[BotLocaleStatus] = js.Array(Creating, Building, Built, ReadyExpressTesting, Failed, Deleting, NotBuilt)
}

type BotSortAttribute = "BotName"
object BotSortAttribute {
  inline val BotName: "BotName" = "BotName"

  inline def values: js.Array[BotSortAttribute] = js.Array(BotName)
}

type BotStatus = "Creating" | "Available" | "Inactive" | "Deleting" | "Failed" | "Versioning"
object BotStatus {
  inline val Creating: "Creating" = "Creating"
  inline val Available: "Available" = "Available"
  inline val Inactive: "Inactive" = "Inactive"
  inline val Deleting: "Deleting" = "Deleting"
  inline val Failed: "Failed" = "Failed"
  inline val Versioning: "Versioning" = "Versioning"

  inline def values: js.Array[BotStatus] = js.Array(Creating, Available, Inactive, Deleting, Failed, Versioning)
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

type ObfuscationSettingType = "None" | "DefaultObfuscation"
object ObfuscationSettingType {
  inline val None: "None" = "None"
  inline val DefaultObfuscation: "DefaultObfuscation" = "DefaultObfuscation"

  inline def values: js.Array[ObfuscationSettingType] = js.Array(None, DefaultObfuscation)
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

type SlotSortAttribute = "SlotName" | "LastUpdatedDateTime"
object SlotSortAttribute {
  inline val SlotName: "SlotName" = "SlotName"
  inline val LastUpdatedDateTime: "LastUpdatedDateTime" = "LastUpdatedDateTime"

  inline def values: js.Array[SlotSortAttribute] = js.Array(SlotName, LastUpdatedDateTime)
}

type SlotTypeFilterName = "SlotTypeName"
object SlotTypeFilterName {
  inline val SlotTypeName: "SlotTypeName" = "SlotTypeName"

  inline def values: js.Array[SlotTypeFilterName] = js.Array(SlotTypeName)
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

type SlotValueResolutionStrategy = "OriginalValue" | "TopResolution"
object SlotValueResolutionStrategy {
  inline val OriginalValue: "OriginalValue" = "OriginalValue"
  inline val TopResolution: "TopResolution" = "TopResolution"

  inline def values: js.Array[SlotValueResolutionStrategy] = js.Array(OriginalValue, TopResolution)
}

type SortOrder = "Ascending" | "Descending"
object SortOrder {
  inline val Ascending: "Ascending" = "Ascending"
  inline val Descending: "Descending" = "Descending"

  inline def values: js.Array[SortOrder] = js.Array(Ascending, Descending)
}
