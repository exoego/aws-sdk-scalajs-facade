package facade.amazonaws.services.workmail

import scalajs.js

@js.native
sealed trait AccessControlRuleEffect extends js.Any
object AccessControlRuleEffect {
  val ALLOW = "ALLOW".asInstanceOf[AccessControlRuleEffect]
  val DENY = "DENY".asInstanceOf[AccessControlRuleEffect]

  @inline def values: js.Array[AccessControlRuleEffect] = js.Array(ALLOW, DENY)
}

@js.native
sealed trait EntityState extends js.Any
object EntityState {
  val ENABLED = "ENABLED".asInstanceOf[EntityState]
  val DISABLED = "DISABLED".asInstanceOf[EntityState]
  val DELETED = "DELETED".asInstanceOf[EntityState]

  @inline def values: js.Array[EntityState] = js.Array(ENABLED, DISABLED, DELETED)
}

@js.native
sealed trait FolderName extends js.Any
object FolderName {
  val INBOX = "INBOX".asInstanceOf[FolderName]
  val DELETED_ITEMS = "DELETED_ITEMS".asInstanceOf[FolderName]
  val SENT_ITEMS = "SENT_ITEMS".asInstanceOf[FolderName]
  val DRAFTS = "DRAFTS".asInstanceOf[FolderName]
  val JUNK_EMAIL = "JUNK_EMAIL".asInstanceOf[FolderName]

  @inline def values: js.Array[FolderName] = js.Array(INBOX, DELETED_ITEMS, SENT_ITEMS, DRAFTS, JUNK_EMAIL)
}

@js.native
sealed trait MailboxExportJobState extends js.Any
object MailboxExportJobState {
  val RUNNING = "RUNNING".asInstanceOf[MailboxExportJobState]
  val COMPLETED = "COMPLETED".asInstanceOf[MailboxExportJobState]
  val FAILED = "FAILED".asInstanceOf[MailboxExportJobState]
  val CANCELLED = "CANCELLED".asInstanceOf[MailboxExportJobState]

  @inline def values: js.Array[MailboxExportJobState] = js.Array(RUNNING, COMPLETED, FAILED, CANCELLED)
}

@js.native
sealed trait MemberType extends js.Any
object MemberType {
  val GROUP = "GROUP".asInstanceOf[MemberType]
  val USER = "USER".asInstanceOf[MemberType]

  @inline def values: js.Array[MemberType] = js.Array(GROUP, USER)
}

@js.native
sealed trait MobileDeviceAccessRuleEffect extends js.Any
object MobileDeviceAccessRuleEffect {
  val ALLOW = "ALLOW".asInstanceOf[MobileDeviceAccessRuleEffect]
  val DENY = "DENY".asInstanceOf[MobileDeviceAccessRuleEffect]

  @inline def values: js.Array[MobileDeviceAccessRuleEffect] = js.Array(ALLOW, DENY)
}

@js.native
sealed trait PermissionType extends js.Any
object PermissionType {
  val FULL_ACCESS = "FULL_ACCESS".asInstanceOf[PermissionType]
  val SEND_AS = "SEND_AS".asInstanceOf[PermissionType]
  val SEND_ON_BEHALF = "SEND_ON_BEHALF".asInstanceOf[PermissionType]

  @inline def values: js.Array[PermissionType] = js.Array(FULL_ACCESS, SEND_AS, SEND_ON_BEHALF)
}

@js.native
sealed trait ResourceType extends js.Any
object ResourceType {
  val ROOM = "ROOM".asInstanceOf[ResourceType]
  val EQUIPMENT = "EQUIPMENT".asInstanceOf[ResourceType]

  @inline def values: js.Array[ResourceType] = js.Array(ROOM, EQUIPMENT)
}

@js.native
sealed trait RetentionAction extends js.Any
object RetentionAction {
  val NONE = "NONE".asInstanceOf[RetentionAction]
  val DELETE = "DELETE".asInstanceOf[RetentionAction]
  val PERMANENTLY_DELETE = "PERMANENTLY_DELETE".asInstanceOf[RetentionAction]

  @inline def values: js.Array[RetentionAction] = js.Array(NONE, DELETE, PERMANENTLY_DELETE)
}

@js.native
sealed trait UserRole extends js.Any
object UserRole {
  val USER = "USER".asInstanceOf[UserRole]
  val RESOURCE = "RESOURCE".asInstanceOf[UserRole]
  val SYSTEM_USER = "SYSTEM_USER".asInstanceOf[UserRole]

  @inline def values: js.Array[UserRole] = js.Array(USER, RESOURCE, SYSTEM_USER)
}
