package facade.amazonaws.services.workdocs

import scalajs.js

@js.native
sealed trait ActivityType extends js.Any
object ActivityType {
  val DOCUMENT_CHECKED_IN = "DOCUMENT_CHECKED_IN".asInstanceOf[ActivityType]
  val DOCUMENT_CHECKED_OUT = "DOCUMENT_CHECKED_OUT".asInstanceOf[ActivityType]
  val DOCUMENT_RENAMED = "DOCUMENT_RENAMED".asInstanceOf[ActivityType]
  val DOCUMENT_VERSION_UPLOADED = "DOCUMENT_VERSION_UPLOADED".asInstanceOf[ActivityType]
  val DOCUMENT_VERSION_DELETED = "DOCUMENT_VERSION_DELETED".asInstanceOf[ActivityType]
  val DOCUMENT_VERSION_VIEWED = "DOCUMENT_VERSION_VIEWED".asInstanceOf[ActivityType]
  val DOCUMENT_VERSION_DOWNLOADED = "DOCUMENT_VERSION_DOWNLOADED".asInstanceOf[ActivityType]
  val DOCUMENT_RECYCLED = "DOCUMENT_RECYCLED".asInstanceOf[ActivityType]
  val DOCUMENT_RESTORED = "DOCUMENT_RESTORED".asInstanceOf[ActivityType]
  val DOCUMENT_REVERTED = "DOCUMENT_REVERTED".asInstanceOf[ActivityType]
  val DOCUMENT_SHARED = "DOCUMENT_SHARED".asInstanceOf[ActivityType]
  val DOCUMENT_UNSHARED = "DOCUMENT_UNSHARED".asInstanceOf[ActivityType]
  val DOCUMENT_SHARE_PERMISSION_CHANGED = "DOCUMENT_SHARE_PERMISSION_CHANGED".asInstanceOf[ActivityType]
  val DOCUMENT_SHAREABLE_LINK_CREATED = "DOCUMENT_SHAREABLE_LINK_CREATED".asInstanceOf[ActivityType]
  val DOCUMENT_SHAREABLE_LINK_REMOVED = "DOCUMENT_SHAREABLE_LINK_REMOVED".asInstanceOf[ActivityType]
  val DOCUMENT_SHAREABLE_LINK_PERMISSION_CHANGED = "DOCUMENT_SHAREABLE_LINK_PERMISSION_CHANGED".asInstanceOf[ActivityType]
  val DOCUMENT_MOVED = "DOCUMENT_MOVED".asInstanceOf[ActivityType]
  val DOCUMENT_COMMENT_ADDED = "DOCUMENT_COMMENT_ADDED".asInstanceOf[ActivityType]
  val DOCUMENT_COMMENT_DELETED = "DOCUMENT_COMMENT_DELETED".asInstanceOf[ActivityType]
  val DOCUMENT_ANNOTATION_ADDED = "DOCUMENT_ANNOTATION_ADDED".asInstanceOf[ActivityType]
  val DOCUMENT_ANNOTATION_DELETED = "DOCUMENT_ANNOTATION_DELETED".asInstanceOf[ActivityType]
  val FOLDER_CREATED = "FOLDER_CREATED".asInstanceOf[ActivityType]
  val FOLDER_DELETED = "FOLDER_DELETED".asInstanceOf[ActivityType]
  val FOLDER_RENAMED = "FOLDER_RENAMED".asInstanceOf[ActivityType]
  val FOLDER_RECYCLED = "FOLDER_RECYCLED".asInstanceOf[ActivityType]
  val FOLDER_RESTORED = "FOLDER_RESTORED".asInstanceOf[ActivityType]
  val FOLDER_SHARED = "FOLDER_SHARED".asInstanceOf[ActivityType]
  val FOLDER_UNSHARED = "FOLDER_UNSHARED".asInstanceOf[ActivityType]
  val FOLDER_SHARE_PERMISSION_CHANGED = "FOLDER_SHARE_PERMISSION_CHANGED".asInstanceOf[ActivityType]
  val FOLDER_SHAREABLE_LINK_CREATED = "FOLDER_SHAREABLE_LINK_CREATED".asInstanceOf[ActivityType]
  val FOLDER_SHAREABLE_LINK_REMOVED = "FOLDER_SHAREABLE_LINK_REMOVED".asInstanceOf[ActivityType]
  val FOLDER_SHAREABLE_LINK_PERMISSION_CHANGED = "FOLDER_SHAREABLE_LINK_PERMISSION_CHANGED".asInstanceOf[ActivityType]
  val FOLDER_MOVED = "FOLDER_MOVED".asInstanceOf[ActivityType]

  @inline def values: js.Array[ActivityType] = js.Array(
    DOCUMENT_CHECKED_IN,
    DOCUMENT_CHECKED_OUT,
    DOCUMENT_RENAMED,
    DOCUMENT_VERSION_UPLOADED,
    DOCUMENT_VERSION_DELETED,
    DOCUMENT_VERSION_VIEWED,
    DOCUMENT_VERSION_DOWNLOADED,
    DOCUMENT_RECYCLED,
    DOCUMENT_RESTORED,
    DOCUMENT_REVERTED,
    DOCUMENT_SHARED,
    DOCUMENT_UNSHARED,
    DOCUMENT_SHARE_PERMISSION_CHANGED,
    DOCUMENT_SHAREABLE_LINK_CREATED,
    DOCUMENT_SHAREABLE_LINK_REMOVED,
    DOCUMENT_SHAREABLE_LINK_PERMISSION_CHANGED,
    DOCUMENT_MOVED,
    DOCUMENT_COMMENT_ADDED,
    DOCUMENT_COMMENT_DELETED,
    DOCUMENT_ANNOTATION_ADDED,
    DOCUMENT_ANNOTATION_DELETED,
    FOLDER_CREATED,
    FOLDER_DELETED,
    FOLDER_RENAMED,
    FOLDER_RECYCLED,
    FOLDER_RESTORED,
    FOLDER_SHARED,
    FOLDER_UNSHARED,
    FOLDER_SHARE_PERMISSION_CHANGED,
    FOLDER_SHAREABLE_LINK_CREATED,
    FOLDER_SHAREABLE_LINK_REMOVED,
    FOLDER_SHAREABLE_LINK_PERMISSION_CHANGED,
    FOLDER_MOVED
  )
}

@js.native
sealed trait BooleanEnumType extends js.Any
object BooleanEnumType {
  val TRUE = "TRUE".asInstanceOf[BooleanEnumType]
  val FALSE = "FALSE".asInstanceOf[BooleanEnumType]

  @inline def values: js.Array[BooleanEnumType] = js.Array(TRUE, FALSE)
}

@js.native
sealed trait CommentStatusType extends js.Any
object CommentStatusType {
  val DRAFT = "DRAFT".asInstanceOf[CommentStatusType]
  val PUBLISHED = "PUBLISHED".asInstanceOf[CommentStatusType]
  val DELETED = "DELETED".asInstanceOf[CommentStatusType]

  @inline def values: js.Array[CommentStatusType] = js.Array(DRAFT, PUBLISHED, DELETED)
}

@js.native
sealed trait CommentVisibilityType extends js.Any
object CommentVisibilityType {
  val PUBLIC = "PUBLIC".asInstanceOf[CommentVisibilityType]
  val PRIVATE = "PRIVATE".asInstanceOf[CommentVisibilityType]

  @inline def values: js.Array[CommentVisibilityType] = js.Array(PUBLIC, PRIVATE)
}

@js.native
sealed trait DocumentSourceType extends js.Any
object DocumentSourceType {
  val ORIGINAL = "ORIGINAL".asInstanceOf[DocumentSourceType]
  val WITH_COMMENTS = "WITH_COMMENTS".asInstanceOf[DocumentSourceType]

  @inline def values: js.Array[DocumentSourceType] = js.Array(ORIGINAL, WITH_COMMENTS)
}

@js.native
sealed trait DocumentStatusType extends js.Any
object DocumentStatusType {
  val INITIALIZED = "INITIALIZED".asInstanceOf[DocumentStatusType]
  val ACTIVE = "ACTIVE".asInstanceOf[DocumentStatusType]

  @inline def values: js.Array[DocumentStatusType] = js.Array(INITIALIZED, ACTIVE)
}

@js.native
sealed trait DocumentThumbnailType extends js.Any
object DocumentThumbnailType {
  val SMALL = "SMALL".asInstanceOf[DocumentThumbnailType]
  val SMALL_HQ = "SMALL_HQ".asInstanceOf[DocumentThumbnailType]
  val LARGE = "LARGE".asInstanceOf[DocumentThumbnailType]

  @inline def values: js.Array[DocumentThumbnailType] = js.Array(SMALL, SMALL_HQ, LARGE)
}

@js.native
sealed trait DocumentVersionStatus extends js.Any
object DocumentVersionStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[DocumentVersionStatus]

  @inline def values: js.Array[DocumentVersionStatus] = js.Array(ACTIVE)
}

@js.native
sealed trait FolderContentType extends js.Any
object FolderContentType {
  val ALL = "ALL".asInstanceOf[FolderContentType]
  val DOCUMENT = "DOCUMENT".asInstanceOf[FolderContentType]
  val FOLDER = "FOLDER".asInstanceOf[FolderContentType]

  @inline def values: js.Array[FolderContentType] = js.Array(ALL, DOCUMENT, FOLDER)
}

@js.native
sealed trait LocaleType extends js.Any
object LocaleType {
  val en = "en".asInstanceOf[LocaleType]
  val fr = "fr".asInstanceOf[LocaleType]
  val ko = "ko".asInstanceOf[LocaleType]
  val de = "de".asInstanceOf[LocaleType]
  val es = "es".asInstanceOf[LocaleType]
  val ja = "ja".asInstanceOf[LocaleType]
  val ru = "ru".asInstanceOf[LocaleType]
  val zh_CN = "zh_CN".asInstanceOf[LocaleType]
  val zh_TW = "zh_TW".asInstanceOf[LocaleType]
  val pt_BR = "pt_BR".asInstanceOf[LocaleType]
  val default = "default".asInstanceOf[LocaleType]

  @inline def values: js.Array[LocaleType] = js.Array(en, fr, ko, de, es, ja, ru, zh_CN, zh_TW, pt_BR, default)
}

@js.native
sealed trait OrderType extends js.Any
object OrderType {
  val ASCENDING = "ASCENDING".asInstanceOf[OrderType]
  val DESCENDING = "DESCENDING".asInstanceOf[OrderType]

  @inline def values: js.Array[OrderType] = js.Array(ASCENDING, DESCENDING)
}

@js.native
sealed trait PrincipalType extends js.Any
object PrincipalType {
  val USER = "USER".asInstanceOf[PrincipalType]
  val GROUP = "GROUP".asInstanceOf[PrincipalType]
  val INVITE = "INVITE".asInstanceOf[PrincipalType]
  val ANONYMOUS = "ANONYMOUS".asInstanceOf[PrincipalType]
  val ORGANIZATION = "ORGANIZATION".asInstanceOf[PrincipalType]

  @inline def values: js.Array[PrincipalType] = js.Array(USER, GROUP, INVITE, ANONYMOUS, ORGANIZATION)
}

@js.native
sealed trait ResourceCollectionType extends js.Any
object ResourceCollectionType {
  val SHARED_WITH_ME = "SHARED_WITH_ME".asInstanceOf[ResourceCollectionType]

  @inline def values: js.Array[ResourceCollectionType] = js.Array(SHARED_WITH_ME)
}

@js.native
sealed trait ResourceSortType extends js.Any
object ResourceSortType {
  val DATE = "DATE".asInstanceOf[ResourceSortType]
  val NAME = "NAME".asInstanceOf[ResourceSortType]

  @inline def values: js.Array[ResourceSortType] = js.Array(DATE, NAME)
}

@js.native
sealed trait ResourceStateType extends js.Any
object ResourceStateType {
  val ACTIVE = "ACTIVE".asInstanceOf[ResourceStateType]
  val RESTORING = "RESTORING".asInstanceOf[ResourceStateType]
  val RECYCLING = "RECYCLING".asInstanceOf[ResourceStateType]
  val RECYCLED = "RECYCLED".asInstanceOf[ResourceStateType]

  @inline def values: js.Array[ResourceStateType] = js.Array(ACTIVE, RESTORING, RECYCLING, RECYCLED)
}

@js.native
sealed trait ResourceType extends js.Any
object ResourceType {
  val FOLDER = "FOLDER".asInstanceOf[ResourceType]
  val DOCUMENT = "DOCUMENT".asInstanceOf[ResourceType]

  @inline def values: js.Array[ResourceType] = js.Array(FOLDER, DOCUMENT)
}

@js.native
sealed trait RolePermissionType extends js.Any
object RolePermissionType {
  val DIRECT = "DIRECT".asInstanceOf[RolePermissionType]
  val INHERITED = "INHERITED".asInstanceOf[RolePermissionType]

  @inline def values: js.Array[RolePermissionType] = js.Array(DIRECT, INHERITED)
}

@js.native
sealed trait RoleType extends js.Any
object RoleType {
  val VIEWER = "VIEWER".asInstanceOf[RoleType]
  val CONTRIBUTOR = "CONTRIBUTOR".asInstanceOf[RoleType]
  val OWNER = "OWNER".asInstanceOf[RoleType]
  val COOWNER = "COOWNER".asInstanceOf[RoleType]

  @inline def values: js.Array[RoleType] = js.Array(VIEWER, CONTRIBUTOR, OWNER, COOWNER)
}

@js.native
sealed trait ShareStatusType extends js.Any
object ShareStatusType {
  val SUCCESS = "SUCCESS".asInstanceOf[ShareStatusType]
  val FAILURE = "FAILURE".asInstanceOf[ShareStatusType]

  @inline def values: js.Array[ShareStatusType] = js.Array(SUCCESS, FAILURE)
}

@js.native
sealed trait StorageType extends js.Any
object StorageType {
  val UNLIMITED = "UNLIMITED".asInstanceOf[StorageType]
  val QUOTA = "QUOTA".asInstanceOf[StorageType]

  @inline def values: js.Array[StorageType] = js.Array(UNLIMITED, QUOTA)
}

@js.native
sealed trait SubscriptionProtocolType extends js.Any
object SubscriptionProtocolType {
  val HTTPS = "HTTPS".asInstanceOf[SubscriptionProtocolType]

  @inline def values: js.Array[SubscriptionProtocolType] = js.Array(HTTPS)
}

@js.native
sealed trait SubscriptionType extends js.Any
object SubscriptionType {
  val ALL = "ALL".asInstanceOf[SubscriptionType]

  @inline def values: js.Array[SubscriptionType] = js.Array(ALL)
}

@js.native
sealed trait UserFilterType extends js.Any
object UserFilterType {
  val ALL = "ALL".asInstanceOf[UserFilterType]
  val ACTIVE_PENDING = "ACTIVE_PENDING".asInstanceOf[UserFilterType]

  @inline def values: js.Array[UserFilterType] = js.Array(ALL, ACTIVE_PENDING)
}

@js.native
sealed trait UserSortType extends js.Any
object UserSortType {
  val USER_NAME = "USER_NAME".asInstanceOf[UserSortType]
  val FULL_NAME = "FULL_NAME".asInstanceOf[UserSortType]
  val STORAGE_LIMIT = "STORAGE_LIMIT".asInstanceOf[UserSortType]
  val USER_STATUS = "USER_STATUS".asInstanceOf[UserSortType]
  val STORAGE_USED = "STORAGE_USED".asInstanceOf[UserSortType]

  @inline def values: js.Array[UserSortType] = js.Array(USER_NAME, FULL_NAME, STORAGE_LIMIT, USER_STATUS, STORAGE_USED)
}

@js.native
sealed trait UserStatusType extends js.Any
object UserStatusType {
  val ACTIVE = "ACTIVE".asInstanceOf[UserStatusType]
  val INACTIVE = "INACTIVE".asInstanceOf[UserStatusType]
  val PENDING = "PENDING".asInstanceOf[UserStatusType]

  @inline def values: js.Array[UserStatusType] = js.Array(ACTIVE, INACTIVE, PENDING)
}

@js.native
sealed trait UserType extends js.Any
object UserType {
  val USER = "USER".asInstanceOf[UserType]
  val ADMIN = "ADMIN".asInstanceOf[UserType]
  val POWERUSER = "POWERUSER".asInstanceOf[UserType]
  val MINIMALUSER = "MINIMALUSER".asInstanceOf[UserType]
  val WORKSPACESUSER = "WORKSPACESUSER".asInstanceOf[UserType]

  @inline def values: js.Array[UserType] = js.Array(USER, ADMIN, POWERUSER, MINIMALUSER, WORKSPACESUSER)
}
