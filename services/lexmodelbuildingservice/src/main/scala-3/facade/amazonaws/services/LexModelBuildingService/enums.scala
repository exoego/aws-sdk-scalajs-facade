package facade.amazonaws.services.lexmodelbuildingservice

import scalajs._

type ChannelStatus = "IN_PROGRESS" | "CREATED" | "FAILED"
object ChannelStatus {
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val CREATED: "CREATED" = "CREATED"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[ChannelStatus] = js.Array(IN_PROGRESS, CREATED, FAILED)
}

type ChannelType = "Facebook" | "Slack" | "Twilio-Sms" | "Kik"
object ChannelType {
  inline val Facebook: "Facebook" = "Facebook"
  inline val Slack: "Slack" = "Slack"
  inline val `Twilio-Sms`: "Twilio-Sms" = "Twilio-Sms"
  inline val Kik: "Kik" = "Kik"

  inline def values: js.Array[ChannelType] = js.Array(Facebook, Slack, `Twilio-Sms`, Kik)
}

type ContentType = "PlainText" | "SSML" | "CustomPayload"
object ContentType {
  inline val PlainText: "PlainText" = "PlainText"
  inline val SSML: "SSML" = "SSML"
  inline val CustomPayload: "CustomPayload" = "CustomPayload"

  inline def values: js.Array[ContentType] = js.Array(PlainText, SSML, CustomPayload)
}

type Destination = "CLOUDWATCH_LOGS" | "S3"
object Destination {
  inline val CLOUDWATCH_LOGS: "CLOUDWATCH_LOGS" = "CLOUDWATCH_LOGS"
  inline val S3: "S3" = "S3"

  inline def values: js.Array[Destination] = js.Array(CLOUDWATCH_LOGS, S3)
}

type ExportStatus = "IN_PROGRESS" | "READY" | "FAILED"
object ExportStatus {
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val READY: "READY" = "READY"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[ExportStatus] = js.Array(IN_PROGRESS, READY, FAILED)
}

type ExportType = "ALEXA_SKILLS_KIT" | "LEX"
object ExportType {
  inline val ALEXA_SKILLS_KIT: "ALEXA_SKILLS_KIT" = "ALEXA_SKILLS_KIT"
  inline val LEX: "LEX" = "LEX"

  inline def values: js.Array[ExportType] = js.Array(ALEXA_SKILLS_KIT, LEX)
}

type FulfillmentActivityType = "ReturnIntent" | "CodeHook"
object FulfillmentActivityType {
  inline val ReturnIntent: "ReturnIntent" = "ReturnIntent"
  inline val CodeHook: "CodeHook" = "CodeHook"

  inline def values: js.Array[FulfillmentActivityType] = js.Array(ReturnIntent, CodeHook)
}

type ImportStatus = "IN_PROGRESS" | "COMPLETE" | "FAILED"
object ImportStatus {
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val COMPLETE: "COMPLETE" = "COMPLETE"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[ImportStatus] = js.Array(IN_PROGRESS, COMPLETE, FAILED)
}

type Locale = "de-DE" | "en-AU" | "en-GB" | "en-US" | "es-419" | "es-ES" | "es-US" | "fr-FR" | "fr-CA" | "it-IT" | "ja-JP"
object Locale {
  inline val `de-DE`: "de-DE" = "de-DE"
  inline val `en-AU`: "en-AU" = "en-AU"
  inline val `en-GB`: "en-GB" = "en-GB"
  inline val `en-US`: "en-US" = "en-US"
  inline val `es-419`: "es-419" = "es-419"
  inline val `es-ES`: "es-ES" = "es-ES"
  inline val `es-US`: "es-US" = "es-US"
  inline val `fr-FR`: "fr-FR" = "fr-FR"
  inline val `fr-CA`: "fr-CA" = "fr-CA"
  inline val `it-IT`: "it-IT" = "it-IT"
  inline val `ja-JP`: "ja-JP" = "ja-JP"

  inline def values: js.Array[Locale] = js.Array(`de-DE`, `en-AU`, `en-GB`, `en-US`, `es-419`, `es-ES`, `es-US`, `fr-FR`, `fr-CA`, `it-IT`, `ja-JP`)
}

type LogType = "AUDIO" | "TEXT"
object LogType {
  inline val AUDIO: "AUDIO" = "AUDIO"
  inline val TEXT: "TEXT" = "TEXT"

  inline def values: js.Array[LogType] = js.Array(AUDIO, TEXT)
}

type MergeStrategy = "OVERWRITE_LATEST" | "FAIL_ON_CONFLICT"
object MergeStrategy {
  inline val OVERWRITE_LATEST: "OVERWRITE_LATEST" = "OVERWRITE_LATEST"
  inline val FAIL_ON_CONFLICT: "FAIL_ON_CONFLICT" = "FAIL_ON_CONFLICT"

  inline def values: js.Array[MergeStrategy] = js.Array(OVERWRITE_LATEST, FAIL_ON_CONFLICT)
}

type ObfuscationSetting = "NONE" | "DEFAULT_OBFUSCATION"
object ObfuscationSetting {
  inline val NONE: "NONE" = "NONE"
  inline val DEFAULT_OBFUSCATION: "DEFAULT_OBFUSCATION" = "DEFAULT_OBFUSCATION"

  inline def values: js.Array[ObfuscationSetting] = js.Array(NONE, DEFAULT_OBFUSCATION)
}

type ProcessBehavior = "SAVE" | "BUILD"
object ProcessBehavior {
  inline val SAVE: "SAVE" = "SAVE"
  inline val BUILD: "BUILD" = "BUILD"

  inline def values: js.Array[ProcessBehavior] = js.Array(SAVE, BUILD)
}

type ResourceType = "BOT" | "INTENT" | "SLOT_TYPE"
object ResourceType {
  inline val BOT: "BOT" = "BOT"
  inline val INTENT: "INTENT" = "INTENT"
  inline val SLOT_TYPE: "SLOT_TYPE" = "SLOT_TYPE"

  inline def values: js.Array[ResourceType] = js.Array(BOT, INTENT, SLOT_TYPE)
}

type SlotConstraint = "Required" | "Optional"
object SlotConstraint {
  inline val Required: "Required" = "Required"
  inline val Optional: "Optional" = "Optional"

  inline def values: js.Array[SlotConstraint] = js.Array(Required, Optional)
}

type SlotValueSelectionStrategy = "ORIGINAL_VALUE" | "TOP_RESOLUTION"
object SlotValueSelectionStrategy {
  inline val ORIGINAL_VALUE: "ORIGINAL_VALUE" = "ORIGINAL_VALUE"
  inline val TOP_RESOLUTION: "TOP_RESOLUTION" = "TOP_RESOLUTION"

  inline def values: js.Array[SlotValueSelectionStrategy] = js.Array(ORIGINAL_VALUE, TOP_RESOLUTION)
}

type Status = "BUILDING" | "READY" | "READY_BASIC_TESTING" | "FAILED" | "NOT_BUILT"
object Status {
  inline val BUILDING: "BUILDING" = "BUILDING"
  inline val READY: "READY" = "READY"
  inline val READY_BASIC_TESTING: "READY_BASIC_TESTING" = "READY_BASIC_TESTING"
  inline val FAILED: "FAILED" = "FAILED"
  inline val NOT_BUILT: "NOT_BUILT" = "NOT_BUILT"

  inline def values: js.Array[Status] = js.Array(BUILDING, READY, READY_BASIC_TESTING, FAILED, NOT_BUILT)
}

type StatusType = "Detected" | "Missed"
object StatusType {
  inline val Detected: "Detected" = "Detected"
  inline val Missed: "Missed" = "Missed"

  inline def values: js.Array[StatusType] = js.Array(Detected, Missed)
}
