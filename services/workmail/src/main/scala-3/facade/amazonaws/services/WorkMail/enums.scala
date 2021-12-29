package facade.amazonaws.services.workmail

import scalajs._

type AccessControlRuleEffect = "ALLOW" | "DENY"
object AccessControlRuleEffect {
  inline val ALLOW: "ALLOW" = "ALLOW"
  inline val DENY: "DENY" = "DENY"

  inline def values: js.Array[AccessControlRuleEffect] = js.Array(ALLOW, DENY)
}

type EntityState = "ENABLED" | "DISABLED" | "DELETED"
object EntityState {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val DELETED: "DELETED" = "DELETED"

  inline def values: js.Array[EntityState] = js.Array(ENABLED, DISABLED, DELETED)
}

type FolderName = "INBOX" | "DELETED_ITEMS" | "SENT_ITEMS" | "DRAFTS" | "JUNK_EMAIL"
object FolderName {
  inline val INBOX: "INBOX" = "INBOX"
  inline val DELETED_ITEMS: "DELETED_ITEMS" = "DELETED_ITEMS"
  inline val SENT_ITEMS: "SENT_ITEMS" = "SENT_ITEMS"
  inline val DRAFTS: "DRAFTS" = "DRAFTS"
  inline val JUNK_EMAIL: "JUNK_EMAIL" = "JUNK_EMAIL"

  inline def values: js.Array[FolderName] = js.Array(INBOX, DELETED_ITEMS, SENT_ITEMS, DRAFTS, JUNK_EMAIL)
}

type MailboxExportJobState = "RUNNING" | "COMPLETED" | "FAILED" | "CANCELLED"
object MailboxExportJobState {
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val CANCELLED: "CANCELLED" = "CANCELLED"

  inline def values: js.Array[MailboxExportJobState] = js.Array(RUNNING, COMPLETED, FAILED, CANCELLED)
}

type MemberType = "GROUP" | "USER"
object MemberType {
  inline val GROUP: "GROUP" = "GROUP"
  inline val USER: "USER" = "USER"

  inline def values: js.Array[MemberType] = js.Array(GROUP, USER)
}

type MobileDeviceAccessRuleEffect = "ALLOW" | "DENY"
object MobileDeviceAccessRuleEffect {
  inline val ALLOW: "ALLOW" = "ALLOW"
  inline val DENY: "DENY" = "DENY"

  inline def values: js.Array[MobileDeviceAccessRuleEffect] = js.Array(ALLOW, DENY)
}

type PermissionType = "FULL_ACCESS" | "SEND_AS" | "SEND_ON_BEHALF"
object PermissionType {
  inline val FULL_ACCESS: "FULL_ACCESS" = "FULL_ACCESS"
  inline val SEND_AS: "SEND_AS" = "SEND_AS"
  inline val SEND_ON_BEHALF: "SEND_ON_BEHALF" = "SEND_ON_BEHALF"

  inline def values: js.Array[PermissionType] = js.Array(FULL_ACCESS, SEND_AS, SEND_ON_BEHALF)
}

type ResourceType = "ROOM" | "EQUIPMENT"
object ResourceType {
  inline val ROOM: "ROOM" = "ROOM"
  inline val EQUIPMENT: "EQUIPMENT" = "EQUIPMENT"

  inline def values: js.Array[ResourceType] = js.Array(ROOM, EQUIPMENT)
}

type RetentionAction = "NONE" | "DELETE" | "PERMANENTLY_DELETE"
object RetentionAction {
  inline val NONE: "NONE" = "NONE"
  inline val DELETE: "DELETE" = "DELETE"
  inline val PERMANENTLY_DELETE: "PERMANENTLY_DELETE" = "PERMANENTLY_DELETE"

  inline def values: js.Array[RetentionAction] = js.Array(NONE, DELETE, PERMANENTLY_DELETE)
}

type UserRole = "USER" | "RESOURCE" | "SYSTEM_USER"
object UserRole {
  inline val USER: "USER" = "USER"
  inline val RESOURCE: "RESOURCE" = "RESOURCE"
  inline val SYSTEM_USER: "SYSTEM_USER" = "SYSTEM_USER"

  inline def values: js.Array[UserRole] = js.Array(USER, RESOURCE, SYSTEM_USER)
}
