package facade.amazonaws.services.workmail

import scalajs._

type AccessControlRuleEffect = "ALLOW" | "DENY"
object AccessControlRuleEffect {
  val ALLOW: "ALLOW" = "ALLOW"
  val DENY: "DENY" = "DENY"

  @inline def values = js.Array[AccessControlRuleEffect](ALLOW, DENY)
}

type EntityState = "ENABLED" | "DISABLED" | "DELETED"
object EntityState {
  val ENABLED: "ENABLED" = "ENABLED"
  val DISABLED: "DISABLED" = "DISABLED"
  val DELETED: "DELETED" = "DELETED"

  @inline def values = js.Array[EntityState](ENABLED, DISABLED, DELETED)
}

type FolderName = "INBOX" | "DELETED_ITEMS" | "SENT_ITEMS" | "DRAFTS" | "JUNK_EMAIL"
object FolderName {
  val INBOX: "INBOX" = "INBOX"
  val DELETED_ITEMS: "DELETED_ITEMS" = "DELETED_ITEMS"
  val SENT_ITEMS: "SENT_ITEMS" = "SENT_ITEMS"
  val DRAFTS: "DRAFTS" = "DRAFTS"
  val JUNK_EMAIL: "JUNK_EMAIL" = "JUNK_EMAIL"

  @inline def values = js.Array[FolderName](INBOX, DELETED_ITEMS, SENT_ITEMS, DRAFTS, JUNK_EMAIL)
}

type MailboxExportJobState = "RUNNING" | "COMPLETED" | "FAILED" | "CANCELLED"
object MailboxExportJobState {
  val RUNNING: "RUNNING" = "RUNNING"
  val COMPLETED: "COMPLETED" = "COMPLETED"
  val FAILED: "FAILED" = "FAILED"
  val CANCELLED: "CANCELLED" = "CANCELLED"

  @inline def values = js.Array[MailboxExportJobState](RUNNING, COMPLETED, FAILED, CANCELLED)
}

type MemberType = "GROUP" | "USER"
object MemberType {
  val GROUP: "GROUP" = "GROUP"
  val USER: "USER" = "USER"

  @inline def values = js.Array[MemberType](GROUP, USER)
}

type MobileDeviceAccessRuleEffect = "ALLOW" | "DENY"
object MobileDeviceAccessRuleEffect {
  val ALLOW: "ALLOW" = "ALLOW"
  val DENY: "DENY" = "DENY"

  @inline def values = js.Array[MobileDeviceAccessRuleEffect](ALLOW, DENY)
}

type PermissionType = "FULL_ACCESS" | "SEND_AS" | "SEND_ON_BEHALF"
object PermissionType {
  val FULL_ACCESS: "FULL_ACCESS" = "FULL_ACCESS"
  val SEND_AS: "SEND_AS" = "SEND_AS"
  val SEND_ON_BEHALF: "SEND_ON_BEHALF" = "SEND_ON_BEHALF"

  @inline def values = js.Array[PermissionType](FULL_ACCESS, SEND_AS, SEND_ON_BEHALF)
}

type ResourceType = "ROOM" | "EQUIPMENT"
object ResourceType {
  val ROOM: "ROOM" = "ROOM"
  val EQUIPMENT: "EQUIPMENT" = "EQUIPMENT"

  @inline def values = js.Array[ResourceType](ROOM, EQUIPMENT)
}

type RetentionAction = "NONE" | "DELETE" | "PERMANENTLY_DELETE"
object RetentionAction {
  val NONE: "NONE" = "NONE"
  val DELETE: "DELETE" = "DELETE"
  val PERMANENTLY_DELETE: "PERMANENTLY_DELETE" = "PERMANENTLY_DELETE"

  @inline def values = js.Array[RetentionAction](NONE, DELETE, PERMANENTLY_DELETE)
}

type UserRole = "USER" | "RESOURCE" | "SYSTEM_USER"
object UserRole {
  val USER: "USER" = "USER"
  val RESOURCE: "RESOURCE" = "RESOURCE"
  val SYSTEM_USER: "SYSTEM_USER" = "SYSTEM_USER"

  @inline def values = js.Array[UserRole](USER, RESOURCE, SYSTEM_USER)
}
