package facade.amazonaws.services.codecommit

import scalajs._

type ApprovalState = "APPROVE" | "REVOKE"
object ApprovalState {
  inline val APPROVE: "APPROVE" = "APPROVE"
  inline val REVOKE: "REVOKE" = "REVOKE"

  inline def values: js.Array[ApprovalState] = js.Array(APPROVE, REVOKE)
}

type ChangeTypeEnum = "A" | "M" | "D"
object ChangeTypeEnum {
  inline val A: "A" = "A"
  inline val M: "M" = "M"
  inline val D: "D" = "D"

  inline def values: js.Array[ChangeTypeEnum] = js.Array(A, M, D)
}

type ConflictDetailLevelTypeEnum = "FILE_LEVEL" | "LINE_LEVEL"
object ConflictDetailLevelTypeEnum {
  inline val FILE_LEVEL: "FILE_LEVEL" = "FILE_LEVEL"
  inline val LINE_LEVEL: "LINE_LEVEL" = "LINE_LEVEL"

  inline def values: js.Array[ConflictDetailLevelTypeEnum] = js.Array(FILE_LEVEL, LINE_LEVEL)
}

type ConflictResolutionStrategyTypeEnum = "NONE" | "ACCEPT_SOURCE" | "ACCEPT_DESTINATION" | "AUTOMERGE"
object ConflictResolutionStrategyTypeEnum {
  inline val NONE: "NONE" = "NONE"
  inline val ACCEPT_SOURCE: "ACCEPT_SOURCE" = "ACCEPT_SOURCE"
  inline val ACCEPT_DESTINATION: "ACCEPT_DESTINATION" = "ACCEPT_DESTINATION"
  inline val AUTOMERGE: "AUTOMERGE" = "AUTOMERGE"

  inline def values: js.Array[ConflictResolutionStrategyTypeEnum] = js.Array(NONE, ACCEPT_SOURCE, ACCEPT_DESTINATION, AUTOMERGE)
}

type FileModeTypeEnum = "EXECUTABLE" | "NORMAL" | "SYMLINK"
object FileModeTypeEnum {
  inline val EXECUTABLE: "EXECUTABLE" = "EXECUTABLE"
  inline val NORMAL: "NORMAL" = "NORMAL"
  inline val SYMLINK: "SYMLINK" = "SYMLINK"

  inline def values: js.Array[FileModeTypeEnum] = js.Array(EXECUTABLE, NORMAL, SYMLINK)
}

type MergeOptionTypeEnum = "FAST_FORWARD_MERGE" | "SQUASH_MERGE" | "THREE_WAY_MERGE"
object MergeOptionTypeEnum {
  inline val FAST_FORWARD_MERGE: "FAST_FORWARD_MERGE" = "FAST_FORWARD_MERGE"
  inline val SQUASH_MERGE: "SQUASH_MERGE" = "SQUASH_MERGE"
  inline val THREE_WAY_MERGE: "THREE_WAY_MERGE" = "THREE_WAY_MERGE"

  inline def values: js.Array[MergeOptionTypeEnum] = js.Array(FAST_FORWARD_MERGE, SQUASH_MERGE, THREE_WAY_MERGE)
}

type ObjectTypeEnum = "FILE" | "DIRECTORY" | "GIT_LINK" | "SYMBOLIC_LINK"
object ObjectTypeEnum {
  inline val FILE: "FILE" = "FILE"
  inline val DIRECTORY: "DIRECTORY" = "DIRECTORY"
  inline val GIT_LINK: "GIT_LINK" = "GIT_LINK"
  inline val SYMBOLIC_LINK: "SYMBOLIC_LINK" = "SYMBOLIC_LINK"

  inline def values: js.Array[ObjectTypeEnum] = js.Array(FILE, DIRECTORY, GIT_LINK, SYMBOLIC_LINK)
}

type OrderEnum = "ascending" | "descending"
object OrderEnum {
  inline val ascending: "ascending" = "ascending"
  inline val descending: "descending" = "descending"

  inline def values: js.Array[OrderEnum] = js.Array(ascending, descending)
}

type OverrideStatus = "OVERRIDE" | "REVOKE"
object OverrideStatus {
  inline val OVERRIDE: "OVERRIDE" = "OVERRIDE"
  inline val REVOKE: "REVOKE" = "REVOKE"

  inline def values: js.Array[OverrideStatus] = js.Array(OVERRIDE, REVOKE)
}

type PullRequestEventType = "PULL_REQUEST_CREATED" | "PULL_REQUEST_STATUS_CHANGED" | "PULL_REQUEST_SOURCE_REFERENCE_UPDATED" | "PULL_REQUEST_MERGE_STATE_CHANGED" | "PULL_REQUEST_APPROVAL_RULE_CREATED" | "PULL_REQUEST_APPROVAL_RULE_UPDATED" | "PULL_REQUEST_APPROVAL_RULE_DELETED" | "PULL_REQUEST_APPROVAL_RULE_OVERRIDDEN" | "PULL_REQUEST_APPROVAL_STATE_CHANGED"
object PullRequestEventType {
  inline val PULL_REQUEST_CREATED: "PULL_REQUEST_CREATED" = "PULL_REQUEST_CREATED"
  inline val PULL_REQUEST_STATUS_CHANGED: "PULL_REQUEST_STATUS_CHANGED" = "PULL_REQUEST_STATUS_CHANGED"
  inline val PULL_REQUEST_SOURCE_REFERENCE_UPDATED: "PULL_REQUEST_SOURCE_REFERENCE_UPDATED" = "PULL_REQUEST_SOURCE_REFERENCE_UPDATED"
  inline val PULL_REQUEST_MERGE_STATE_CHANGED: "PULL_REQUEST_MERGE_STATE_CHANGED" = "PULL_REQUEST_MERGE_STATE_CHANGED"
  inline val PULL_REQUEST_APPROVAL_RULE_CREATED: "PULL_REQUEST_APPROVAL_RULE_CREATED" = "PULL_REQUEST_APPROVAL_RULE_CREATED"
  inline val PULL_REQUEST_APPROVAL_RULE_UPDATED: "PULL_REQUEST_APPROVAL_RULE_UPDATED" = "PULL_REQUEST_APPROVAL_RULE_UPDATED"
  inline val PULL_REQUEST_APPROVAL_RULE_DELETED: "PULL_REQUEST_APPROVAL_RULE_DELETED" = "PULL_REQUEST_APPROVAL_RULE_DELETED"
  inline val PULL_REQUEST_APPROVAL_RULE_OVERRIDDEN: "PULL_REQUEST_APPROVAL_RULE_OVERRIDDEN" = "PULL_REQUEST_APPROVAL_RULE_OVERRIDDEN"
  inline val PULL_REQUEST_APPROVAL_STATE_CHANGED: "PULL_REQUEST_APPROVAL_STATE_CHANGED" = "PULL_REQUEST_APPROVAL_STATE_CHANGED"

  inline def values: js.Array[PullRequestEventType] = js.Array(
    PULL_REQUEST_CREATED,
    PULL_REQUEST_STATUS_CHANGED,
    PULL_REQUEST_SOURCE_REFERENCE_UPDATED,
    PULL_REQUEST_MERGE_STATE_CHANGED,
    PULL_REQUEST_APPROVAL_RULE_CREATED,
    PULL_REQUEST_APPROVAL_RULE_UPDATED,
    PULL_REQUEST_APPROVAL_RULE_DELETED,
    PULL_REQUEST_APPROVAL_RULE_OVERRIDDEN,
    PULL_REQUEST_APPROVAL_STATE_CHANGED
  )
}

type PullRequestStatusEnum = "OPEN" | "CLOSED"
object PullRequestStatusEnum {
  inline val OPEN: "OPEN" = "OPEN"
  inline val CLOSED: "CLOSED" = "CLOSED"

  inline def values: js.Array[PullRequestStatusEnum] = js.Array(OPEN, CLOSED)
}

type RelativeFileVersionEnum = "BEFORE" | "AFTER"
object RelativeFileVersionEnum {
  inline val BEFORE: "BEFORE" = "BEFORE"
  inline val AFTER: "AFTER" = "AFTER"

  inline def values: js.Array[RelativeFileVersionEnum] = js.Array(BEFORE, AFTER)
}

type ReplacementTypeEnum = "KEEP_BASE" | "KEEP_SOURCE" | "KEEP_DESTINATION" | "USE_NEW_CONTENT"
object ReplacementTypeEnum {
  inline val KEEP_BASE: "KEEP_BASE" = "KEEP_BASE"
  inline val KEEP_SOURCE: "KEEP_SOURCE" = "KEEP_SOURCE"
  inline val KEEP_DESTINATION: "KEEP_DESTINATION" = "KEEP_DESTINATION"
  inline val USE_NEW_CONTENT: "USE_NEW_CONTENT" = "USE_NEW_CONTENT"

  inline def values: js.Array[ReplacementTypeEnum] = js.Array(KEEP_BASE, KEEP_SOURCE, KEEP_DESTINATION, USE_NEW_CONTENT)
}

type RepositoryTriggerEventEnum = "all" | "updateReference" | "createReference" | "deleteReference"
object RepositoryTriggerEventEnum {
  inline val all: "all" = "all"
  inline val updateReference: "updateReference" = "updateReference"
  inline val createReference: "createReference" = "createReference"
  inline val deleteReference: "deleteReference" = "deleteReference"

  inline def values: js.Array[RepositoryTriggerEventEnum] = js.Array(all, updateReference, createReference, deleteReference)
}

type SortByEnum = "repositoryName" | "lastModifiedDate"
object SortByEnum {
  inline val repositoryName: "repositoryName" = "repositoryName"
  inline val lastModifiedDate: "lastModifiedDate" = "lastModifiedDate"

  inline def values: js.Array[SortByEnum] = js.Array(repositoryName, lastModifiedDate)
}
