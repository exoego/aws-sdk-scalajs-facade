package facade.amazonaws.services.workdocs

import scalajs._

type ActivityType = "DOCUMENT_CHECKED_IN" | "DOCUMENT_CHECKED_OUT" | "DOCUMENT_RENAMED" | "DOCUMENT_VERSION_UPLOADED" | "DOCUMENT_VERSION_DELETED" | "DOCUMENT_VERSION_VIEWED" | "DOCUMENT_VERSION_DOWNLOADED" | "DOCUMENT_RECYCLED" | "DOCUMENT_RESTORED" | "DOCUMENT_REVERTED" | "DOCUMENT_SHARED" | "DOCUMENT_UNSHARED" | "DOCUMENT_SHARE_PERMISSION_CHANGED" | "DOCUMENT_SHAREABLE_LINK_CREATED" | "DOCUMENT_SHAREABLE_LINK_REMOVED" | "DOCUMENT_SHAREABLE_LINK_PERMISSION_CHANGED" | "DOCUMENT_MOVED" | "DOCUMENT_COMMENT_ADDED" | "DOCUMENT_COMMENT_DELETED" | "DOCUMENT_ANNOTATION_ADDED" | "DOCUMENT_ANNOTATION_DELETED" | "FOLDER_CREATED" | "FOLDER_DELETED" | "FOLDER_RENAMED" | "FOLDER_RECYCLED" | "FOLDER_RESTORED" | "FOLDER_SHARED" | "FOLDER_UNSHARED" | "FOLDER_SHARE_PERMISSION_CHANGED" | "FOLDER_SHAREABLE_LINK_CREATED" | "FOLDER_SHAREABLE_LINK_REMOVED" | "FOLDER_SHAREABLE_LINK_PERMISSION_CHANGED" | "FOLDER_MOVED"
object ActivityType {
  inline val DOCUMENT_CHECKED_IN: "DOCUMENT_CHECKED_IN" = "DOCUMENT_CHECKED_IN"
  inline val DOCUMENT_CHECKED_OUT: "DOCUMENT_CHECKED_OUT" = "DOCUMENT_CHECKED_OUT"
  inline val DOCUMENT_RENAMED: "DOCUMENT_RENAMED" = "DOCUMENT_RENAMED"
  inline val DOCUMENT_VERSION_UPLOADED: "DOCUMENT_VERSION_UPLOADED" = "DOCUMENT_VERSION_UPLOADED"
  inline val DOCUMENT_VERSION_DELETED: "DOCUMENT_VERSION_DELETED" = "DOCUMENT_VERSION_DELETED"
  inline val DOCUMENT_VERSION_VIEWED: "DOCUMENT_VERSION_VIEWED" = "DOCUMENT_VERSION_VIEWED"
  inline val DOCUMENT_VERSION_DOWNLOADED: "DOCUMENT_VERSION_DOWNLOADED" = "DOCUMENT_VERSION_DOWNLOADED"
  inline val DOCUMENT_RECYCLED: "DOCUMENT_RECYCLED" = "DOCUMENT_RECYCLED"
  inline val DOCUMENT_RESTORED: "DOCUMENT_RESTORED" = "DOCUMENT_RESTORED"
  inline val DOCUMENT_REVERTED: "DOCUMENT_REVERTED" = "DOCUMENT_REVERTED"
  inline val DOCUMENT_SHARED: "DOCUMENT_SHARED" = "DOCUMENT_SHARED"
  inline val DOCUMENT_UNSHARED: "DOCUMENT_UNSHARED" = "DOCUMENT_UNSHARED"
  inline val DOCUMENT_SHARE_PERMISSION_CHANGED: "DOCUMENT_SHARE_PERMISSION_CHANGED" = "DOCUMENT_SHARE_PERMISSION_CHANGED"
  inline val DOCUMENT_SHAREABLE_LINK_CREATED: "DOCUMENT_SHAREABLE_LINK_CREATED" = "DOCUMENT_SHAREABLE_LINK_CREATED"
  inline val DOCUMENT_SHAREABLE_LINK_REMOVED: "DOCUMENT_SHAREABLE_LINK_REMOVED" = "DOCUMENT_SHAREABLE_LINK_REMOVED"
  inline val DOCUMENT_SHAREABLE_LINK_PERMISSION_CHANGED: "DOCUMENT_SHAREABLE_LINK_PERMISSION_CHANGED" = "DOCUMENT_SHAREABLE_LINK_PERMISSION_CHANGED"
  inline val DOCUMENT_MOVED: "DOCUMENT_MOVED" = "DOCUMENT_MOVED"
  inline val DOCUMENT_COMMENT_ADDED: "DOCUMENT_COMMENT_ADDED" = "DOCUMENT_COMMENT_ADDED"
  inline val DOCUMENT_COMMENT_DELETED: "DOCUMENT_COMMENT_DELETED" = "DOCUMENT_COMMENT_DELETED"
  inline val DOCUMENT_ANNOTATION_ADDED: "DOCUMENT_ANNOTATION_ADDED" = "DOCUMENT_ANNOTATION_ADDED"
  inline val DOCUMENT_ANNOTATION_DELETED: "DOCUMENT_ANNOTATION_DELETED" = "DOCUMENT_ANNOTATION_DELETED"
  inline val FOLDER_CREATED: "FOLDER_CREATED" = "FOLDER_CREATED"
  inline val FOLDER_DELETED: "FOLDER_DELETED" = "FOLDER_DELETED"
  inline val FOLDER_RENAMED: "FOLDER_RENAMED" = "FOLDER_RENAMED"
  inline val FOLDER_RECYCLED: "FOLDER_RECYCLED" = "FOLDER_RECYCLED"
  inline val FOLDER_RESTORED: "FOLDER_RESTORED" = "FOLDER_RESTORED"
  inline val FOLDER_SHARED: "FOLDER_SHARED" = "FOLDER_SHARED"
  inline val FOLDER_UNSHARED: "FOLDER_UNSHARED" = "FOLDER_UNSHARED"
  inline val FOLDER_SHARE_PERMISSION_CHANGED: "FOLDER_SHARE_PERMISSION_CHANGED" = "FOLDER_SHARE_PERMISSION_CHANGED"
  inline val FOLDER_SHAREABLE_LINK_CREATED: "FOLDER_SHAREABLE_LINK_CREATED" = "FOLDER_SHAREABLE_LINK_CREATED"
  inline val FOLDER_SHAREABLE_LINK_REMOVED: "FOLDER_SHAREABLE_LINK_REMOVED" = "FOLDER_SHAREABLE_LINK_REMOVED"
  inline val FOLDER_SHAREABLE_LINK_PERMISSION_CHANGED: "FOLDER_SHAREABLE_LINK_PERMISSION_CHANGED" = "FOLDER_SHAREABLE_LINK_PERMISSION_CHANGED"
  inline val FOLDER_MOVED: "FOLDER_MOVED" = "FOLDER_MOVED"

  inline def values: js.Array[ActivityType] = js.Array(
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

type BooleanEnumType = "TRUE" | "FALSE"
object BooleanEnumType {
  inline val TRUE: "TRUE" = "TRUE"
  inline val FALSE: "FALSE" = "FALSE"

  inline def values: js.Array[BooleanEnumType] = js.Array(TRUE, FALSE)
}

type CommentStatusType = "DRAFT" | "PUBLISHED" | "DELETED"
object CommentStatusType {
  inline val DRAFT: "DRAFT" = "DRAFT"
  inline val PUBLISHED: "PUBLISHED" = "PUBLISHED"
  inline val DELETED: "DELETED" = "DELETED"

  inline def values: js.Array[CommentStatusType] = js.Array(DRAFT, PUBLISHED, DELETED)
}

type CommentVisibilityType = "PUBLIC" | "PRIVATE"
object CommentVisibilityType {
  inline val PUBLIC: "PUBLIC" = "PUBLIC"
  inline val PRIVATE: "PRIVATE" = "PRIVATE"

  inline def values: js.Array[CommentVisibilityType] = js.Array(PUBLIC, PRIVATE)
}

type DocumentSourceType = "ORIGINAL" | "WITH_COMMENTS"
object DocumentSourceType {
  inline val ORIGINAL: "ORIGINAL" = "ORIGINAL"
  inline val WITH_COMMENTS: "WITH_COMMENTS" = "WITH_COMMENTS"

  inline def values: js.Array[DocumentSourceType] = js.Array(ORIGINAL, WITH_COMMENTS)
}

type DocumentStatusType = "INITIALIZED" | "ACTIVE"
object DocumentStatusType {
  inline val INITIALIZED: "INITIALIZED" = "INITIALIZED"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"

  inline def values: js.Array[DocumentStatusType] = js.Array(INITIALIZED, ACTIVE)
}

type DocumentThumbnailType = "SMALL" | "SMALL_HQ" | "LARGE"
object DocumentThumbnailType {
  inline val SMALL: "SMALL" = "SMALL"
  inline val SMALL_HQ: "SMALL_HQ" = "SMALL_HQ"
  inline val LARGE: "LARGE" = "LARGE"

  inline def values: js.Array[DocumentThumbnailType] = js.Array(SMALL, SMALL_HQ, LARGE)
}

type DocumentVersionStatus = "ACTIVE"
object DocumentVersionStatus {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"

  inline def values: js.Array[DocumentVersionStatus] = js.Array(ACTIVE)
}

type FolderContentType = "ALL" | "DOCUMENT" | "FOLDER"
object FolderContentType {
  inline val ALL: "ALL" = "ALL"
  inline val DOCUMENT: "DOCUMENT" = "DOCUMENT"
  inline val FOLDER: "FOLDER" = "FOLDER"

  inline def values: js.Array[FolderContentType] = js.Array(ALL, DOCUMENT, FOLDER)
}

type LocaleType = "en" | "fr" | "ko" | "de" | "es" | "ja" | "ru" | "zh_CN" | "zh_TW" | "pt_BR" | "default"
object LocaleType {
  inline val en: "en" = "en"
  inline val fr: "fr" = "fr"
  inline val ko: "ko" = "ko"
  inline val de: "de" = "de"
  inline val es: "es" = "es"
  inline val ja: "ja" = "ja"
  inline val ru: "ru" = "ru"
  inline val zh_CN: "zh_CN" = "zh_CN"
  inline val zh_TW: "zh_TW" = "zh_TW"
  inline val pt_BR: "pt_BR" = "pt_BR"
  inline val default: "default" = "default"

  inline def values: js.Array[LocaleType] = js.Array(en, fr, ko, de, es, ja, ru, zh_CN, zh_TW, pt_BR, default)
}

type OrderType = "ASCENDING" | "DESCENDING"
object OrderType {
  inline val ASCENDING: "ASCENDING" = "ASCENDING"
  inline val DESCENDING: "DESCENDING" = "DESCENDING"

  inline def values: js.Array[OrderType] = js.Array(ASCENDING, DESCENDING)
}

type PrincipalType = "USER" | "GROUP" | "INVITE" | "ANONYMOUS" | "ORGANIZATION"
object PrincipalType {
  inline val USER: "USER" = "USER"
  inline val GROUP: "GROUP" = "GROUP"
  inline val INVITE: "INVITE" = "INVITE"
  inline val ANONYMOUS: "ANONYMOUS" = "ANONYMOUS"
  inline val ORGANIZATION: "ORGANIZATION" = "ORGANIZATION"

  inline def values: js.Array[PrincipalType] = js.Array(USER, GROUP, INVITE, ANONYMOUS, ORGANIZATION)
}

type ResourceCollectionType = "SHARED_WITH_ME"
object ResourceCollectionType {
  inline val SHARED_WITH_ME: "SHARED_WITH_ME" = "SHARED_WITH_ME"

  inline def values: js.Array[ResourceCollectionType] = js.Array(SHARED_WITH_ME)
}

type ResourceSortType = "DATE" | "NAME"
object ResourceSortType {
  inline val DATE: "DATE" = "DATE"
  inline val NAME: "NAME" = "NAME"

  inline def values: js.Array[ResourceSortType] = js.Array(DATE, NAME)
}

type ResourceStateType = "ACTIVE" | "RESTORING" | "RECYCLING" | "RECYCLED"
object ResourceStateType {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val RESTORING: "RESTORING" = "RESTORING"
  inline val RECYCLING: "RECYCLING" = "RECYCLING"
  inline val RECYCLED: "RECYCLED" = "RECYCLED"

  inline def values: js.Array[ResourceStateType] = js.Array(ACTIVE, RESTORING, RECYCLING, RECYCLED)
}

type ResourceType = "FOLDER" | "DOCUMENT"
object ResourceType {
  inline val FOLDER: "FOLDER" = "FOLDER"
  inline val DOCUMENT: "DOCUMENT" = "DOCUMENT"

  inline def values: js.Array[ResourceType] = js.Array(FOLDER, DOCUMENT)
}

type RolePermissionType = "DIRECT" | "INHERITED"
object RolePermissionType {
  inline val DIRECT: "DIRECT" = "DIRECT"
  inline val INHERITED: "INHERITED" = "INHERITED"

  inline def values: js.Array[RolePermissionType] = js.Array(DIRECT, INHERITED)
}

type RoleType = "VIEWER" | "CONTRIBUTOR" | "OWNER" | "COOWNER"
object RoleType {
  inline val VIEWER: "VIEWER" = "VIEWER"
  inline val CONTRIBUTOR: "CONTRIBUTOR" = "CONTRIBUTOR"
  inline val OWNER: "OWNER" = "OWNER"
  inline val COOWNER: "COOWNER" = "COOWNER"

  inline def values: js.Array[RoleType] = js.Array(VIEWER, CONTRIBUTOR, OWNER, COOWNER)
}

type ShareStatusType = "SUCCESS" | "FAILURE"
object ShareStatusType {
  inline val SUCCESS: "SUCCESS" = "SUCCESS"
  inline val FAILURE: "FAILURE" = "FAILURE"

  inline def values: js.Array[ShareStatusType] = js.Array(SUCCESS, FAILURE)
}

type StorageType = "UNLIMITED" | "QUOTA"
object StorageType {
  inline val UNLIMITED: "UNLIMITED" = "UNLIMITED"
  inline val QUOTA: "QUOTA" = "QUOTA"

  inline def values: js.Array[StorageType] = js.Array(UNLIMITED, QUOTA)
}

type SubscriptionProtocolType = "HTTPS"
object SubscriptionProtocolType {
  inline val HTTPS: "HTTPS" = "HTTPS"

  inline def values: js.Array[SubscriptionProtocolType] = js.Array(HTTPS)
}

type SubscriptionType = "ALL"
object SubscriptionType {
  inline val ALL: "ALL" = "ALL"

  inline def values: js.Array[SubscriptionType] = js.Array(ALL)
}

type UserFilterType = "ALL" | "ACTIVE_PENDING"
object UserFilterType {
  inline val ALL: "ALL" = "ALL"
  inline val ACTIVE_PENDING: "ACTIVE_PENDING" = "ACTIVE_PENDING"

  inline def values: js.Array[UserFilterType] = js.Array(ALL, ACTIVE_PENDING)
}

type UserSortType = "USER_NAME" | "FULL_NAME" | "STORAGE_LIMIT" | "USER_STATUS" | "STORAGE_USED"
object UserSortType {
  inline val USER_NAME: "USER_NAME" = "USER_NAME"
  inline val FULL_NAME: "FULL_NAME" = "FULL_NAME"
  inline val STORAGE_LIMIT: "STORAGE_LIMIT" = "STORAGE_LIMIT"
  inline val USER_STATUS: "USER_STATUS" = "USER_STATUS"
  inline val STORAGE_USED: "STORAGE_USED" = "STORAGE_USED"

  inline def values: js.Array[UserSortType] = js.Array(USER_NAME, FULL_NAME, STORAGE_LIMIT, USER_STATUS, STORAGE_USED)
}

type UserStatusType = "ACTIVE" | "INACTIVE" | "PENDING"
object UserStatusType {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val INACTIVE: "INACTIVE" = "INACTIVE"
  inline val PENDING: "PENDING" = "PENDING"

  inline def values: js.Array[UserStatusType] = js.Array(ACTIVE, INACTIVE, PENDING)
}

type UserType = "USER" | "ADMIN" | "POWERUSER" | "MINIMALUSER" | "WORKSPACESUSER"
object UserType {
  inline val USER: "USER" = "USER"
  inline val ADMIN: "ADMIN" = "ADMIN"
  inline val POWERUSER: "POWERUSER" = "POWERUSER"
  inline val MINIMALUSER: "MINIMALUSER" = "MINIMALUSER"
  inline val WORKSPACESUSER: "WORKSPACESUSER" = "WORKSPACESUSER"

  inline def values: js.Array[UserType] = js.Array(USER, ADMIN, POWERUSER, MINIMALUSER, WORKSPACESUSER)
}
