package facade.amazonaws.services.lexmodelbuildingservice

import scalajs._

type ChannelStatus = "IN_PROGRESS" | "CREATED" | "FAILED"
object ChannelStatus {
  val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  val CREATED: "CREATED" = "CREATED"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[ChannelStatus](IN_PROGRESS, CREATED, FAILED)
}

type ChannelType = "Facebook" | "Slack" | "Twilio-Sms" | "Kik"
object ChannelType {
  val Facebook: "Facebook" = "Facebook"
  val Slack: "Slack" = "Slack"
  val `Twilio-Sms`: "Twilio-Sms" = "Twilio-Sms"
  val Kik: "Kik" = "Kik"

  @inline def values = js.Array[ChannelType](Facebook, Slack, `Twilio-Sms`, Kik)
}

type ContentType = "PlainText" | "SSML" | "CustomPayload"
object ContentType {
  val PlainText: "PlainText" = "PlainText"
  val SSML: "SSML" = "SSML"
  val CustomPayload: "CustomPayload" = "CustomPayload"

  @inline def values = js.Array[ContentType](PlainText, SSML, CustomPayload)
}

type Destination = "CLOUDWATCH_LOGS" | "S3"
object Destination {
  val CLOUDWATCH_LOGS: "CLOUDWATCH_LOGS" = "CLOUDWATCH_LOGS"
  val S3: "S3" = "S3"

  @inline def values = js.Array[Destination](CLOUDWATCH_LOGS, S3)
}

type ExportStatus = "IN_PROGRESS" | "READY" | "FAILED"
object ExportStatus {
  val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  val READY: "READY" = "READY"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[ExportStatus](IN_PROGRESS, READY, FAILED)
}

type ExportType = "ALEXA_SKILLS_KIT" | "LEX"
object ExportType {
  val ALEXA_SKILLS_KIT: "ALEXA_SKILLS_KIT" = "ALEXA_SKILLS_KIT"
  val LEX: "LEX" = "LEX"

  @inline def values = js.Array[ExportType](ALEXA_SKILLS_KIT, LEX)
}

type FulfillmentActivityType = "ReturnIntent" | "CodeHook"
object FulfillmentActivityType {
  val ReturnIntent: "ReturnIntent" = "ReturnIntent"
  val CodeHook: "CodeHook" = "CodeHook"

  @inline def values = js.Array[FulfillmentActivityType](ReturnIntent, CodeHook)
}

type ImportStatus = "IN_PROGRESS" | "COMPLETE" | "FAILED"
object ImportStatus {
  val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  val COMPLETE: "COMPLETE" = "COMPLETE"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[ImportStatus](IN_PROGRESS, COMPLETE, FAILED)
}

type Locale = "de-DE" | "en-AU" | "en-GB" | "en-US" | "es-419" | "es-ES" | "es-US" | "fr-FR" | "fr-CA" | "it-IT" | "ja-JP"
object Locale {
  val `de-DE`: "de-DE" = "de-DE"
  val `en-AU`: "en-AU" = "en-AU"
  val `en-GB`: "en-GB" = "en-GB"
  val `en-US`: "en-US" = "en-US"
  val `es-419`: "es-419" = "es-419"
  val `es-ES`: "es-ES" = "es-ES"
  val `es-US`: "es-US" = "es-US"
  val `fr-FR`: "fr-FR" = "fr-FR"
  val `fr-CA`: "fr-CA" = "fr-CA"
  val `it-IT`: "it-IT" = "it-IT"
  val `ja-JP`: "ja-JP" = "ja-JP"

  @inline def values = js.Array[Locale](`de-DE`, `en-AU`, `en-GB`, `en-US`, `es-419`, `es-ES`, `es-US`, `fr-FR`, `fr-CA`, `it-IT`, `ja-JP`)
}

type LogType = "AUDIO" | "TEXT"
object LogType {
  val AUDIO: "AUDIO" = "AUDIO"
  val TEXT: "TEXT" = "TEXT"

  @inline def values = js.Array[LogType](AUDIO, TEXT)
}

type MergeStrategy = "OVERWRITE_LATEST" | "FAIL_ON_CONFLICT"
object MergeStrategy {
  val OVERWRITE_LATEST: "OVERWRITE_LATEST" = "OVERWRITE_LATEST"
  val FAIL_ON_CONFLICT: "FAIL_ON_CONFLICT" = "FAIL_ON_CONFLICT"

  @inline def values = js.Array[MergeStrategy](OVERWRITE_LATEST, FAIL_ON_CONFLICT)
}

type ObfuscationSetting = "NONE" | "DEFAULT_OBFUSCATION"
object ObfuscationSetting {
  val NONE: "NONE" = "NONE"
  val DEFAULT_OBFUSCATION: "DEFAULT_OBFUSCATION" = "DEFAULT_OBFUSCATION"

  @inline def values = js.Array[ObfuscationSetting](NONE, DEFAULT_OBFUSCATION)
}

type ProcessBehavior = "SAVE" | "BUILD"
object ProcessBehavior {
  val SAVE: "SAVE" = "SAVE"
  val BUILD: "BUILD" = "BUILD"

  @inline def values = js.Array[ProcessBehavior](SAVE, BUILD)
}

type ResourceType = "BOT" | "INTENT" | "SLOT_TYPE"
object ResourceType {
  val BOT: "BOT" = "BOT"
  val INTENT: "INTENT" = "INTENT"
  val SLOT_TYPE: "SLOT_TYPE" = "SLOT_TYPE"

  @inline def values = js.Array[ResourceType](BOT, INTENT, SLOT_TYPE)
}

type SlotConstraint = "Required" | "Optional"
object SlotConstraint {
  val Required: "Required" = "Required"
  val Optional: "Optional" = "Optional"

  @inline def values = js.Array[SlotConstraint](Required, Optional)
}

type SlotValueSelectionStrategy = "ORIGINAL_VALUE" | "TOP_RESOLUTION"
object SlotValueSelectionStrategy {
  val ORIGINAL_VALUE: "ORIGINAL_VALUE" = "ORIGINAL_VALUE"
  val TOP_RESOLUTION: "TOP_RESOLUTION" = "TOP_RESOLUTION"

  @inline def values = js.Array[SlotValueSelectionStrategy](ORIGINAL_VALUE, TOP_RESOLUTION)
}

type Status = "BUILDING" | "READY" | "READY_BASIC_TESTING" | "FAILED" | "NOT_BUILT"
object Status {
  val BUILDING: "BUILDING" = "BUILDING"
  val READY: "READY" = "READY"
  val READY_BASIC_TESTING: "READY_BASIC_TESTING" = "READY_BASIC_TESTING"
  val FAILED: "FAILED" = "FAILED"
  val NOT_BUILT: "NOT_BUILT" = "NOT_BUILT"

  @inline def values = js.Array[Status](BUILDING, READY, READY_BASIC_TESTING, FAILED, NOT_BUILT)
}

type StatusType = "Detected" | "Missed"
object StatusType {
  val Detected: "Detected" = "Detected"
  val Missed: "Missed" = "Missed"

  @inline def values = js.Array[StatusType](Detected, Missed)
}
