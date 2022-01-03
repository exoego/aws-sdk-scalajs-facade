package facade.amazonaws.services.connectparticipant

import scalajs.js

type ArtifactStatus = "APPROVED" | "REJECTED" | "IN_PROGRESS"
object ArtifactStatus {
  inline val APPROVED: "APPROVED" = "APPROVED"
  inline val REJECTED: "REJECTED" = "REJECTED"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"

  inline def values: js.Array[ArtifactStatus] = js.Array(APPROVED, REJECTED, IN_PROGRESS)
}

type ChatItemType = "TYPING" | "PARTICIPANT_JOINED" | "PARTICIPANT_LEFT" | "CHAT_ENDED" | "TRANSFER_SUCCEEDED" | "TRANSFER_FAILED" | "MESSAGE" | "EVENT" | "ATTACHMENT" | "CONNECTION_ACK"
object ChatItemType {
  inline val TYPING: "TYPING" = "TYPING"
  inline val PARTICIPANT_JOINED: "PARTICIPANT_JOINED" = "PARTICIPANT_JOINED"
  inline val PARTICIPANT_LEFT: "PARTICIPANT_LEFT" = "PARTICIPANT_LEFT"
  inline val CHAT_ENDED: "CHAT_ENDED" = "CHAT_ENDED"
  inline val TRANSFER_SUCCEEDED: "TRANSFER_SUCCEEDED" = "TRANSFER_SUCCEEDED"
  inline val TRANSFER_FAILED: "TRANSFER_FAILED" = "TRANSFER_FAILED"
  inline val MESSAGE: "MESSAGE" = "MESSAGE"
  inline val EVENT: "EVENT" = "EVENT"
  inline val ATTACHMENT: "ATTACHMENT" = "ATTACHMENT"
  inline val CONNECTION_ACK: "CONNECTION_ACK" = "CONNECTION_ACK"

  inline def values: js.Array[ChatItemType] = js.Array(TYPING, PARTICIPANT_JOINED, PARTICIPANT_LEFT, CHAT_ENDED, TRANSFER_SUCCEEDED, TRANSFER_FAILED, MESSAGE, EVENT, ATTACHMENT, CONNECTION_ACK)
}

type ConnectionType = "WEBSOCKET" | "CONNECTION_CREDENTIALS"
object ConnectionType {
  inline val WEBSOCKET: "WEBSOCKET" = "WEBSOCKET"
  inline val CONNECTION_CREDENTIALS: "CONNECTION_CREDENTIALS" = "CONNECTION_CREDENTIALS"

  inline def values: js.Array[ConnectionType] = js.Array(WEBSOCKET, CONNECTION_CREDENTIALS)
}

type ParticipantRole = "AGENT" | "CUSTOMER" | "SYSTEM"
object ParticipantRole {
  inline val AGENT: "AGENT" = "AGENT"
  inline val CUSTOMER: "CUSTOMER" = "CUSTOMER"
  inline val SYSTEM: "SYSTEM" = "SYSTEM"

  inline def values: js.Array[ParticipantRole] = js.Array(AGENT, CUSTOMER, SYSTEM)
}

type ScanDirection = "FORWARD" | "BACKWARD"
object ScanDirection {
  inline val FORWARD: "FORWARD" = "FORWARD"
  inline val BACKWARD: "BACKWARD" = "BACKWARD"

  inline def values: js.Array[ScanDirection] = js.Array(FORWARD, BACKWARD)
}

type SortKey = "DESCENDING" | "ASCENDING"
object SortKey {
  inline val DESCENDING: "DESCENDING" = "DESCENDING"
  inline val ASCENDING: "ASCENDING" = "ASCENDING"

  inline def values: js.Array[SortKey] = js.Array(DESCENDING, ASCENDING)
}
