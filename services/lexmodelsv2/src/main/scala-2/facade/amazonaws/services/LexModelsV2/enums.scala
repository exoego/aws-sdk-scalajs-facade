package facade.amazonaws.services.lexmodelsv2

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait BotAliasStatus extends js.Any
object BotAliasStatus {
  val Creating = "Creating".asInstanceOf[BotAliasStatus]
  val Available = "Available".asInstanceOf[BotAliasStatus]
  val Deleting = "Deleting".asInstanceOf[BotAliasStatus]
  val Failed = "Failed".asInstanceOf[BotAliasStatus]

  @inline def values = js.Array(Creating, Available, Deleting, Failed)
}

@js.native
sealed trait BotFilterName extends js.Any
object BotFilterName {
  val BotName = "BotName".asInstanceOf[BotFilterName]

  @inline def values = js.Array(BotName)
}

@js.native
sealed trait BotFilterOperator extends js.Any
object BotFilterOperator {
  val CO = "CO".asInstanceOf[BotFilterOperator]
  val EQ = "EQ".asInstanceOf[BotFilterOperator]

  @inline def values = js.Array(CO, EQ)
}

@js.native
sealed trait BotLocaleFilterName extends js.Any
object BotLocaleFilterName {
  val BotLocaleName = "BotLocaleName".asInstanceOf[BotLocaleFilterName]

  @inline def values = js.Array(BotLocaleName)
}

@js.native
sealed trait BotLocaleFilterOperator extends js.Any
object BotLocaleFilterOperator {
  val CO = "CO".asInstanceOf[BotLocaleFilterOperator]
  val EQ = "EQ".asInstanceOf[BotLocaleFilterOperator]

  @inline def values = js.Array(CO, EQ)
}

@js.native
sealed trait BotLocaleSortAttribute extends js.Any
object BotLocaleSortAttribute {
  val BotLocaleName = "BotLocaleName".asInstanceOf[BotLocaleSortAttribute]

  @inline def values = js.Array(BotLocaleName)
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

  @inline def values = js.Array(Creating, Building, Built, ReadyExpressTesting, Failed, Deleting, NotBuilt)
}

@js.native
sealed trait BotSortAttribute extends js.Any
object BotSortAttribute {
  val BotName = "BotName".asInstanceOf[BotSortAttribute]

  @inline def values = js.Array(BotName)
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

  @inline def values = js.Array(Creating, Available, Inactive, Deleting, Failed, Versioning)
}

@js.native
sealed trait BotVersionSortAttribute extends js.Any
object BotVersionSortAttribute {
  val BotVersion = "BotVersion".asInstanceOf[BotVersionSortAttribute]

  @inline def values = js.Array(BotVersion)
}

@js.native
sealed trait BuiltInIntentSortAttribute extends js.Any
object BuiltInIntentSortAttribute {
  val IntentSignature = "IntentSignature".asInstanceOf[BuiltInIntentSortAttribute]

  @inline def values = js.Array(IntentSignature)
}

@js.native
sealed trait BuiltInSlotTypeSortAttribute extends js.Any
object BuiltInSlotTypeSortAttribute {
  val SlotTypeSignature = "SlotTypeSignature".asInstanceOf[BuiltInSlotTypeSortAttribute]

  @inline def values = js.Array(SlotTypeSignature)
}

@js.native
sealed trait IntentFilterName extends js.Any
object IntentFilterName {
  val IntentName = "IntentName".asInstanceOf[IntentFilterName]

  @inline def values = js.Array(IntentName)
}

@js.native
sealed trait IntentFilterOperator extends js.Any
object IntentFilterOperator {
  val CO = "CO".asInstanceOf[IntentFilterOperator]
  val EQ = "EQ".asInstanceOf[IntentFilterOperator]

  @inline def values = js.Array(CO, EQ)
}

@js.native
sealed trait IntentSortAttribute extends js.Any
object IntentSortAttribute {
  val IntentName = "IntentName".asInstanceOf[IntentSortAttribute]
  val LastUpdatedDateTime = "LastUpdatedDateTime".asInstanceOf[IntentSortAttribute]

  @inline def values = js.Array(IntentName, LastUpdatedDateTime)
}

@js.native
sealed trait ObfuscationSettingType extends js.Any
object ObfuscationSettingType {
  val None = "None".asInstanceOf[ObfuscationSettingType]
  val DefaultObfuscation = "DefaultObfuscation".asInstanceOf[ObfuscationSettingType]

  @inline def values = js.Array(None, DefaultObfuscation)
}

@js.native
sealed trait SlotConstraint extends js.Any
object SlotConstraint {
  val Required = "Required".asInstanceOf[SlotConstraint]
  val Optional = "Optional".asInstanceOf[SlotConstraint]

  @inline def values = js.Array(Required, Optional)
}

@js.native
sealed trait SlotFilterName extends js.Any
object SlotFilterName {
  val SlotName = "SlotName".asInstanceOf[SlotFilterName]

  @inline def values = js.Array(SlotName)
}

@js.native
sealed trait SlotFilterOperator extends js.Any
object SlotFilterOperator {
  val CO = "CO".asInstanceOf[SlotFilterOperator]
  val EQ = "EQ".asInstanceOf[SlotFilterOperator]

  @inline def values = js.Array(CO, EQ)
}

@js.native
sealed trait SlotSortAttribute extends js.Any
object SlotSortAttribute {
  val SlotName = "SlotName".asInstanceOf[SlotSortAttribute]
  val LastUpdatedDateTime = "LastUpdatedDateTime".asInstanceOf[SlotSortAttribute]

  @inline def values = js.Array(SlotName, LastUpdatedDateTime)
}

@js.native
sealed trait SlotTypeFilterName extends js.Any
object SlotTypeFilterName {
  val SlotTypeName = "SlotTypeName".asInstanceOf[SlotTypeFilterName]

  @inline def values = js.Array(SlotTypeName)
}

@js.native
sealed trait SlotTypeFilterOperator extends js.Any
object SlotTypeFilterOperator {
  val CO = "CO".asInstanceOf[SlotTypeFilterOperator]
  val EQ = "EQ".asInstanceOf[SlotTypeFilterOperator]

  @inline def values = js.Array(CO, EQ)
}

@js.native
sealed trait SlotTypeSortAttribute extends js.Any
object SlotTypeSortAttribute {
  val SlotTypeName = "SlotTypeName".asInstanceOf[SlotTypeSortAttribute]
  val LastUpdatedDateTime = "LastUpdatedDateTime".asInstanceOf[SlotTypeSortAttribute]

  @inline def values = js.Array(SlotTypeName, LastUpdatedDateTime)
}

@js.native
sealed trait SlotValueResolutionStrategy extends js.Any
object SlotValueResolutionStrategy {
  val OriginalValue = "OriginalValue".asInstanceOf[SlotValueResolutionStrategy]
  val TopResolution = "TopResolution".asInstanceOf[SlotValueResolutionStrategy]

  @inline def values = js.Array(OriginalValue, TopResolution)
}

@js.native
sealed trait SortOrder extends js.Any
object SortOrder {
  val Ascending = "Ascending".asInstanceOf[SortOrder]
  val Descending = "Descending".asInstanceOf[SortOrder]

  @inline def values = js.Array(Ascending, Descending)
}
