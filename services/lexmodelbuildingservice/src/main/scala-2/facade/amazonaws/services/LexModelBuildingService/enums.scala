package facade.amazonaws.services.lexmodelbuildingservice

import scalajs.js

@js.native
sealed trait ChannelStatus extends js.Any
object ChannelStatus {
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[ChannelStatus]
  val CREATED = "CREATED".asInstanceOf[ChannelStatus]
  val FAILED = "FAILED".asInstanceOf[ChannelStatus]

  @inline def values: js.Array[ChannelStatus] = js.Array(IN_PROGRESS, CREATED, FAILED)
}

@js.native
sealed trait ChannelType extends js.Any
object ChannelType {
  val Facebook = "Facebook".asInstanceOf[ChannelType]
  val Slack = "Slack".asInstanceOf[ChannelType]
  val `Twilio-Sms` = "Twilio-Sms".asInstanceOf[ChannelType]
  val Kik = "Kik".asInstanceOf[ChannelType]

  @inline def values: js.Array[ChannelType] = js.Array(Facebook, Slack, `Twilio-Sms`, Kik)
}

@js.native
sealed trait ContentType extends js.Any
object ContentType {
  val PlainText = "PlainText".asInstanceOf[ContentType]
  val SSML = "SSML".asInstanceOf[ContentType]
  val CustomPayload = "CustomPayload".asInstanceOf[ContentType]

  @inline def values: js.Array[ContentType] = js.Array(PlainText, SSML, CustomPayload)
}

@js.native
sealed trait Destination extends js.Any
object Destination {
  val CLOUDWATCH_LOGS = "CLOUDWATCH_LOGS".asInstanceOf[Destination]
  val S3 = "S3".asInstanceOf[Destination]

  @inline def values: js.Array[Destination] = js.Array(CLOUDWATCH_LOGS, S3)
}

@js.native
sealed trait ExportStatus extends js.Any
object ExportStatus {
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[ExportStatus]
  val READY = "READY".asInstanceOf[ExportStatus]
  val FAILED = "FAILED".asInstanceOf[ExportStatus]

  @inline def values: js.Array[ExportStatus] = js.Array(IN_PROGRESS, READY, FAILED)
}

@js.native
sealed trait ExportType extends js.Any
object ExportType {
  val ALEXA_SKILLS_KIT = "ALEXA_SKILLS_KIT".asInstanceOf[ExportType]
  val LEX = "LEX".asInstanceOf[ExportType]

  @inline def values: js.Array[ExportType] = js.Array(ALEXA_SKILLS_KIT, LEX)
}

@js.native
sealed trait FulfillmentActivityType extends js.Any
object FulfillmentActivityType {
  val ReturnIntent = "ReturnIntent".asInstanceOf[FulfillmentActivityType]
  val CodeHook = "CodeHook".asInstanceOf[FulfillmentActivityType]

  @inline def values: js.Array[FulfillmentActivityType] = js.Array(ReturnIntent, CodeHook)
}

@js.native
sealed trait ImportStatus extends js.Any
object ImportStatus {
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[ImportStatus]
  val COMPLETE = "COMPLETE".asInstanceOf[ImportStatus]
  val FAILED = "FAILED".asInstanceOf[ImportStatus]

  @inline def values: js.Array[ImportStatus] = js.Array(IN_PROGRESS, COMPLETE, FAILED)
}

@js.native
sealed trait Locale extends js.Any
object Locale {
  val `de-DE` = "de-DE".asInstanceOf[Locale]
  val `en-AU` = "en-AU".asInstanceOf[Locale]
  val `en-GB` = "en-GB".asInstanceOf[Locale]
  val `en-US` = "en-US".asInstanceOf[Locale]
  val `es-419` = "es-419".asInstanceOf[Locale]
  val `es-ES` = "es-ES".asInstanceOf[Locale]
  val `es-US` = "es-US".asInstanceOf[Locale]
  val `fr-FR` = "fr-FR".asInstanceOf[Locale]
  val `fr-CA` = "fr-CA".asInstanceOf[Locale]
  val `it-IT` = "it-IT".asInstanceOf[Locale]
  val `ja-JP` = "ja-JP".asInstanceOf[Locale]

  @inline def values: js.Array[Locale] = js.Array(`de-DE`, `en-AU`, `en-GB`, `en-US`, `es-419`, `es-ES`, `es-US`, `fr-FR`, `fr-CA`, `it-IT`, `ja-JP`)
}

@js.native
sealed trait LogType extends js.Any
object LogType {
  val AUDIO = "AUDIO".asInstanceOf[LogType]
  val TEXT = "TEXT".asInstanceOf[LogType]

  @inline def values: js.Array[LogType] = js.Array(AUDIO, TEXT)
}

@js.native
sealed trait MergeStrategy extends js.Any
object MergeStrategy {
  val OVERWRITE_LATEST = "OVERWRITE_LATEST".asInstanceOf[MergeStrategy]
  val FAIL_ON_CONFLICT = "FAIL_ON_CONFLICT".asInstanceOf[MergeStrategy]

  @inline def values: js.Array[MergeStrategy] = js.Array(OVERWRITE_LATEST, FAIL_ON_CONFLICT)
}

@js.native
sealed trait ObfuscationSetting extends js.Any
object ObfuscationSetting {
  val NONE = "NONE".asInstanceOf[ObfuscationSetting]
  val DEFAULT_OBFUSCATION = "DEFAULT_OBFUSCATION".asInstanceOf[ObfuscationSetting]

  @inline def values: js.Array[ObfuscationSetting] = js.Array(NONE, DEFAULT_OBFUSCATION)
}

@js.native
sealed trait ProcessBehavior extends js.Any
object ProcessBehavior {
  val SAVE = "SAVE".asInstanceOf[ProcessBehavior]
  val BUILD = "BUILD".asInstanceOf[ProcessBehavior]

  @inline def values: js.Array[ProcessBehavior] = js.Array(SAVE, BUILD)
}

@js.native
sealed trait ResourceType extends js.Any
object ResourceType {
  val BOT = "BOT".asInstanceOf[ResourceType]
  val INTENT = "INTENT".asInstanceOf[ResourceType]
  val SLOT_TYPE = "SLOT_TYPE".asInstanceOf[ResourceType]

  @inline def values: js.Array[ResourceType] = js.Array(BOT, INTENT, SLOT_TYPE)
}

@js.native
sealed trait SlotConstraint extends js.Any
object SlotConstraint {
  val Required = "Required".asInstanceOf[SlotConstraint]
  val Optional = "Optional".asInstanceOf[SlotConstraint]

  @inline def values: js.Array[SlotConstraint] = js.Array(Required, Optional)
}

@js.native
sealed trait SlotValueSelectionStrategy extends js.Any
object SlotValueSelectionStrategy {
  val ORIGINAL_VALUE = "ORIGINAL_VALUE".asInstanceOf[SlotValueSelectionStrategy]
  val TOP_RESOLUTION = "TOP_RESOLUTION".asInstanceOf[SlotValueSelectionStrategy]

  @inline def values: js.Array[SlotValueSelectionStrategy] = js.Array(ORIGINAL_VALUE, TOP_RESOLUTION)
}

@js.native
sealed trait Status extends js.Any
object Status {
  val BUILDING = "BUILDING".asInstanceOf[Status]
  val READY = "READY".asInstanceOf[Status]
  val READY_BASIC_TESTING = "READY_BASIC_TESTING".asInstanceOf[Status]
  val FAILED = "FAILED".asInstanceOf[Status]
  val NOT_BUILT = "NOT_BUILT".asInstanceOf[Status]

  @inline def values: js.Array[Status] = js.Array(BUILDING, READY, READY_BASIC_TESTING, FAILED, NOT_BUILT)
}

@js.native
sealed trait StatusType extends js.Any
object StatusType {
  val Detected = "Detected".asInstanceOf[StatusType]
  val Missed = "Missed".asInstanceOf[StatusType]

  @inline def values: js.Array[StatusType] = js.Array(Detected, Missed)
}
