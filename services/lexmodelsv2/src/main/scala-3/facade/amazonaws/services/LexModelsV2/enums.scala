package facade.amazonaws.services.lexmodelsv2

import scalajs._

type BotAliasStatus = "Creating" | "Available" | "Deleting" | "Failed"
object BotAliasStatus {
  val Creating: "Creating" = "Creating"
  val Available: "Available" = "Available"
  val Deleting: "Deleting" = "Deleting"
  val Failed: "Failed" = "Failed"

  @inline def values = js.Array[BotAliasStatus](Creating, Available, Deleting, Failed)
}

type BotFilterName = "BotName"
object BotFilterName {
  val BotName: "BotName" = "BotName"

  @inline def values = js.Array[BotFilterName](BotName)
}

type BotFilterOperator = "CO" | "EQ"
object BotFilterOperator {
  val CO: "CO" = "CO"
  val EQ: "EQ" = "EQ"

  @inline def values = js.Array[BotFilterOperator](CO, EQ)
}

type BotLocaleFilterName = "BotLocaleName"
object BotLocaleFilterName {
  val BotLocaleName: "BotLocaleName" = "BotLocaleName"

  @inline def values = js.Array[BotLocaleFilterName](BotLocaleName)
}

type BotLocaleFilterOperator = "CO" | "EQ"
object BotLocaleFilterOperator {
  val CO: "CO" = "CO"
  val EQ: "EQ" = "EQ"

  @inline def values = js.Array[BotLocaleFilterOperator](CO, EQ)
}

type BotLocaleSortAttribute = "BotLocaleName"
object BotLocaleSortAttribute {
  val BotLocaleName: "BotLocaleName" = "BotLocaleName"

  @inline def values = js.Array[BotLocaleSortAttribute](BotLocaleName)
}

type BotLocaleStatus = "Creating" | "Building" | "Built" | "ReadyExpressTesting" | "Failed" | "Deleting" | "NotBuilt"
object BotLocaleStatus {
  val Creating: "Creating" = "Creating"
  val Building: "Building" = "Building"
  val Built: "Built" = "Built"
  val ReadyExpressTesting: "ReadyExpressTesting" = "ReadyExpressTesting"
  val Failed: "Failed" = "Failed"
  val Deleting: "Deleting" = "Deleting"
  val NotBuilt: "NotBuilt" = "NotBuilt"

  @inline def values = js.Array[BotLocaleStatus](Creating, Building, Built, ReadyExpressTesting, Failed, Deleting, NotBuilt)
}

type BotSortAttribute = "BotName"
object BotSortAttribute {
  val BotName: "BotName" = "BotName"

  @inline def values = js.Array[BotSortAttribute](BotName)
}

type BotStatus = "Creating" | "Available" | "Inactive" | "Deleting" | "Failed" | "Versioning"
object BotStatus {
  val Creating: "Creating" = "Creating"
  val Available: "Available" = "Available"
  val Inactive: "Inactive" = "Inactive"
  val Deleting: "Deleting" = "Deleting"
  val Failed: "Failed" = "Failed"
  val Versioning: "Versioning" = "Versioning"

  @inline def values = js.Array[BotStatus](Creating, Available, Inactive, Deleting, Failed, Versioning)
}

type BotVersionSortAttribute = "BotVersion"
object BotVersionSortAttribute {
  val BotVersion: "BotVersion" = "BotVersion"

  @inline def values = js.Array[BotVersionSortAttribute](BotVersion)
}

type BuiltInIntentSortAttribute = "IntentSignature"
object BuiltInIntentSortAttribute {
  val IntentSignature: "IntentSignature" = "IntentSignature"

  @inline def values = js.Array[BuiltInIntentSortAttribute](IntentSignature)
}

type BuiltInSlotTypeSortAttribute = "SlotTypeSignature"
object BuiltInSlotTypeSortAttribute {
  val SlotTypeSignature: "SlotTypeSignature" = "SlotTypeSignature"

  @inline def values = js.Array[BuiltInSlotTypeSortAttribute](SlotTypeSignature)
}

type IntentFilterName = "IntentName"
object IntentFilterName {
  val IntentName: "IntentName" = "IntentName"

  @inline def values = js.Array[IntentFilterName](IntentName)
}

type IntentFilterOperator = "CO" | "EQ"
object IntentFilterOperator {
  val CO: "CO" = "CO"
  val EQ: "EQ" = "EQ"

  @inline def values = js.Array[IntentFilterOperator](CO, EQ)
}

type IntentSortAttribute = "IntentName" | "LastUpdatedDateTime"
object IntentSortAttribute {
  val IntentName: "IntentName" = "IntentName"
  val LastUpdatedDateTime: "LastUpdatedDateTime" = "LastUpdatedDateTime"

  @inline def values = js.Array[IntentSortAttribute](IntentName, LastUpdatedDateTime)
}

type ObfuscationSettingType = "None" | "DefaultObfuscation"
object ObfuscationSettingType {
  val None: "None" = "None"
  val DefaultObfuscation: "DefaultObfuscation" = "DefaultObfuscation"

  @inline def values = js.Array[ObfuscationSettingType](None, DefaultObfuscation)
}

type SlotConstraint = "Required" | "Optional"
object SlotConstraint {
  val Required: "Required" = "Required"
  val Optional: "Optional" = "Optional"

  @inline def values = js.Array[SlotConstraint](Required, Optional)
}

type SlotFilterName = "SlotName"
object SlotFilterName {
  val SlotName: "SlotName" = "SlotName"

  @inline def values = js.Array[SlotFilterName](SlotName)
}

type SlotFilterOperator = "CO" | "EQ"
object SlotFilterOperator {
  val CO: "CO" = "CO"
  val EQ: "EQ" = "EQ"

  @inline def values = js.Array[SlotFilterOperator](CO, EQ)
}

type SlotSortAttribute = "SlotName" | "LastUpdatedDateTime"
object SlotSortAttribute {
  val SlotName: "SlotName" = "SlotName"
  val LastUpdatedDateTime: "LastUpdatedDateTime" = "LastUpdatedDateTime"

  @inline def values = js.Array[SlotSortAttribute](SlotName, LastUpdatedDateTime)
}

type SlotTypeFilterName = "SlotTypeName"
object SlotTypeFilterName {
  val SlotTypeName: "SlotTypeName" = "SlotTypeName"

  @inline def values = js.Array[SlotTypeFilterName](SlotTypeName)
}

type SlotTypeFilterOperator = "CO" | "EQ"
object SlotTypeFilterOperator {
  val CO: "CO" = "CO"
  val EQ: "EQ" = "EQ"

  @inline def values = js.Array[SlotTypeFilterOperator](CO, EQ)
}

type SlotTypeSortAttribute = "SlotTypeName" | "LastUpdatedDateTime"
object SlotTypeSortAttribute {
  val SlotTypeName: "SlotTypeName" = "SlotTypeName"
  val LastUpdatedDateTime: "LastUpdatedDateTime" = "LastUpdatedDateTime"

  @inline def values = js.Array[SlotTypeSortAttribute](SlotTypeName, LastUpdatedDateTime)
}

type SlotValueResolutionStrategy = "OriginalValue" | "TopResolution"
object SlotValueResolutionStrategy {
  val OriginalValue: "OriginalValue" = "OriginalValue"
  val TopResolution: "TopResolution" = "TopResolution"

  @inline def values = js.Array[SlotValueResolutionStrategy](OriginalValue, TopResolution)
}

type SortOrder = "Ascending" | "Descending"
object SortOrder {
  val Ascending: "Ascending" = "Ascending"
  val Descending: "Descending" = "Descending"

  @inline def values = js.Array[SortOrder](Ascending, Descending)
}
