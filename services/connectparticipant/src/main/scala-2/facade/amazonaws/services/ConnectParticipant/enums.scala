package facade.amazonaws.services.connectparticipant

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait ArtifactStatus extends js.Any
object ArtifactStatus {
  val APPROVED = "APPROVED".asInstanceOf[ArtifactStatus]
  val REJECTED = "REJECTED".asInstanceOf[ArtifactStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[ArtifactStatus]

  @inline def values = js.Array(APPROVED, REJECTED, IN_PROGRESS)
}

@js.native
sealed trait ChatItemType extends js.Any
object ChatItemType {
  val TYPING = "TYPING".asInstanceOf[ChatItemType]
  val PARTICIPANT_JOINED = "PARTICIPANT_JOINED".asInstanceOf[ChatItemType]
  val PARTICIPANT_LEFT = "PARTICIPANT_LEFT".asInstanceOf[ChatItemType]
  val CHAT_ENDED = "CHAT_ENDED".asInstanceOf[ChatItemType]
  val TRANSFER_SUCCEEDED = "TRANSFER_SUCCEEDED".asInstanceOf[ChatItemType]
  val TRANSFER_FAILED = "TRANSFER_FAILED".asInstanceOf[ChatItemType]
  val MESSAGE = "MESSAGE".asInstanceOf[ChatItemType]
  val EVENT = "EVENT".asInstanceOf[ChatItemType]
  val ATTACHMENT = "ATTACHMENT".asInstanceOf[ChatItemType]
  val CONNECTION_ACK = "CONNECTION_ACK".asInstanceOf[ChatItemType]

  @inline def values = js.Array(TYPING, PARTICIPANT_JOINED, PARTICIPANT_LEFT, CHAT_ENDED, TRANSFER_SUCCEEDED, TRANSFER_FAILED, MESSAGE, EVENT, ATTACHMENT, CONNECTION_ACK)
}

@js.native
sealed trait ConnectionType extends js.Any
object ConnectionType {
  val WEBSOCKET = "WEBSOCKET".asInstanceOf[ConnectionType]
  val CONNECTION_CREDENTIALS = "CONNECTION_CREDENTIALS".asInstanceOf[ConnectionType]

  @inline def values = js.Array(WEBSOCKET, CONNECTION_CREDENTIALS)
}

@js.native
sealed trait ParticipantRole extends js.Any
object ParticipantRole {
  val AGENT = "AGENT".asInstanceOf[ParticipantRole]
  val CUSTOMER = "CUSTOMER".asInstanceOf[ParticipantRole]
  val SYSTEM = "SYSTEM".asInstanceOf[ParticipantRole]

  @inline def values = js.Array(AGENT, CUSTOMER, SYSTEM)
}

@js.native
sealed trait ScanDirection extends js.Any
object ScanDirection {
  val FORWARD = "FORWARD".asInstanceOf[ScanDirection]
  val BACKWARD = "BACKWARD".asInstanceOf[ScanDirection]

  @inline def values = js.Array(FORWARD, BACKWARD)
}

@js.native
sealed trait SortKey extends js.Any
object SortKey {
  val DESCENDING = "DESCENDING".asInstanceOf[SortKey]
  val ASCENDING = "ASCENDING".asInstanceOf[SortKey]

  @inline def values = js.Array(DESCENDING, ASCENDING)
}

