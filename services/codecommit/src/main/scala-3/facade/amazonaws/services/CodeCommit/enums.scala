package facade.amazonaws.services.codecommit

import scalajs._

type ApprovalState = "APPROVE" | "REVOKE"
object ApprovalState {
  val APPROVE: "APPROVE" = "APPROVE"
  val REVOKE: "REVOKE" = "REVOKE"

  @inline def values = js.Array[ApprovalState](APPROVE, REVOKE)
}

type ChangeTypeEnum = "A" | "M" | "D"
object ChangeTypeEnum {
  val A: "A" = "A"
  val M: "M" = "M"
  val D: "D" = "D"

  @inline def values = js.Array[ChangeTypeEnum](A, M, D)
}

type ConflictDetailLevelTypeEnum = "FILE_LEVEL" | "LINE_LEVEL"
object ConflictDetailLevelTypeEnum {
  val FILE_LEVEL: "FILE_LEVEL" = "FILE_LEVEL"
  val LINE_LEVEL: "LINE_LEVEL" = "LINE_LEVEL"

  @inline def values = js.Array[ConflictDetailLevelTypeEnum](FILE_LEVEL, LINE_LEVEL)
}

type ConflictResolutionStrategyTypeEnum = "NONE" | "ACCEPT_SOURCE" | "ACCEPT_DESTINATION" | "AUTOMERGE"
object ConflictResolutionStrategyTypeEnum {
  val NONE: "NONE" = "NONE"
  val ACCEPT_SOURCE: "ACCEPT_SOURCE" = "ACCEPT_SOURCE"
  val ACCEPT_DESTINATION: "ACCEPT_DESTINATION" = "ACCEPT_DESTINATION"
  val AUTOMERGE: "AUTOMERGE" = "AUTOMERGE"

  @inline def values = js.Array[ConflictResolutionStrategyTypeEnum](NONE, ACCEPT_SOURCE, ACCEPT_DESTINATION, AUTOMERGE)
}

type FileModeTypeEnum = "EXECUTABLE" | "NORMAL" | "SYMLINK"
object FileModeTypeEnum {
  val EXECUTABLE: "EXECUTABLE" = "EXECUTABLE"
  val NORMAL: "NORMAL" = "NORMAL"
  val SYMLINK: "SYMLINK" = "SYMLINK"

  @inline def values = js.Array[FileModeTypeEnum](EXECUTABLE, NORMAL, SYMLINK)
}

type MergeOptionTypeEnum = "FAST_FORWARD_MERGE" | "SQUASH_MERGE" | "THREE_WAY_MERGE"
object MergeOptionTypeEnum {
  val FAST_FORWARD_MERGE: "FAST_FORWARD_MERGE" = "FAST_FORWARD_MERGE"
  val SQUASH_MERGE: "SQUASH_MERGE" = "SQUASH_MERGE"
  val THREE_WAY_MERGE: "THREE_WAY_MERGE" = "THREE_WAY_MERGE"

  @inline def values = js.Array[MergeOptionTypeEnum](FAST_FORWARD_MERGE, SQUASH_MERGE, THREE_WAY_MERGE)
}

type ObjectTypeEnum = "FILE" | "DIRECTORY" | "GIT_LINK" | "SYMBOLIC_LINK"
object ObjectTypeEnum {
  val FILE: "FILE" = "FILE"
  val DIRECTORY: "DIRECTORY" = "DIRECTORY"
  val GIT_LINK: "GIT_LINK" = "GIT_LINK"
  val SYMBOLIC_LINK: "SYMBOLIC_LINK" = "SYMBOLIC_LINK"

  @inline def values = js.Array[ObjectTypeEnum](FILE, DIRECTORY, GIT_LINK, SYMBOLIC_LINK)
}

type OrderEnum = "ascending" | "descending"
object OrderEnum {
  val ascending: "ascending" = "ascending"
  val descending: "descending" = "descending"

  @inline def values = js.Array[OrderEnum](ascending, descending)
}

type OverrideStatus = "OVERRIDE" | "REVOKE"
object OverrideStatus {
  val OVERRIDE: "OVERRIDE" = "OVERRIDE"
  val REVOKE: "REVOKE" = "REVOKE"

  @inline def values = js.Array[OverrideStatus](OVERRIDE, REVOKE)
}

type PullRequestEventType = "PULL_REQUEST_CREATED" | "PULL_REQUEST_STATUS_CHANGED" | "PULL_REQUEST_SOURCE_REFERENCE_UPDATED" | "PULL_REQUEST_MERGE_STATE_CHANGED" | "PULL_REQUEST_APPROVAL_RULE_CREATED" | "PULL_REQUEST_APPROVAL_RULE_UPDATED" | "PULL_REQUEST_APPROVAL_RULE_DELETED" | "PULL_REQUEST_APPROVAL_RULE_OVERRIDDEN" | "PULL_REQUEST_APPROVAL_STATE_CHANGED"
object PullRequestEventType {
  val PULL_REQUEST_CREATED: "PULL_REQUEST_CREATED" = "PULL_REQUEST_CREATED"
  val PULL_REQUEST_STATUS_CHANGED: "PULL_REQUEST_STATUS_CHANGED" = "PULL_REQUEST_STATUS_CHANGED"
  val PULL_REQUEST_SOURCE_REFERENCE_UPDATED: "PULL_REQUEST_SOURCE_REFERENCE_UPDATED" = "PULL_REQUEST_SOURCE_REFERENCE_UPDATED"
  val PULL_REQUEST_MERGE_STATE_CHANGED: "PULL_REQUEST_MERGE_STATE_CHANGED" = "PULL_REQUEST_MERGE_STATE_CHANGED"
  val PULL_REQUEST_APPROVAL_RULE_CREATED: "PULL_REQUEST_APPROVAL_RULE_CREATED" = "PULL_REQUEST_APPROVAL_RULE_CREATED"
  val PULL_REQUEST_APPROVAL_RULE_UPDATED: "PULL_REQUEST_APPROVAL_RULE_UPDATED" = "PULL_REQUEST_APPROVAL_RULE_UPDATED"
  val PULL_REQUEST_APPROVAL_RULE_DELETED: "PULL_REQUEST_APPROVAL_RULE_DELETED" = "PULL_REQUEST_APPROVAL_RULE_DELETED"
  val PULL_REQUEST_APPROVAL_RULE_OVERRIDDEN: "PULL_REQUEST_APPROVAL_RULE_OVERRIDDEN" = "PULL_REQUEST_APPROVAL_RULE_OVERRIDDEN"
  val PULL_REQUEST_APPROVAL_STATE_CHANGED: "PULL_REQUEST_APPROVAL_STATE_CHANGED" = "PULL_REQUEST_APPROVAL_STATE_CHANGED"

  @inline def values = js.Array[PullRequestEventType](
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
  val OPEN: "OPEN" = "OPEN"
  val CLOSED: "CLOSED" = "CLOSED"

  @inline def values = js.Array[PullRequestStatusEnum](OPEN, CLOSED)
}

type RelativeFileVersionEnum = "BEFORE" | "AFTER"
object RelativeFileVersionEnum {
  val BEFORE: "BEFORE" = "BEFORE"
  val AFTER: "AFTER" = "AFTER"

  @inline def values = js.Array[RelativeFileVersionEnum](BEFORE, AFTER)
}

type ReplacementTypeEnum = "KEEP_BASE" | "KEEP_SOURCE" | "KEEP_DESTINATION" | "USE_NEW_CONTENT"
object ReplacementTypeEnum {
  val KEEP_BASE: "KEEP_BASE" = "KEEP_BASE"
  val KEEP_SOURCE: "KEEP_SOURCE" = "KEEP_SOURCE"
  val KEEP_DESTINATION: "KEEP_DESTINATION" = "KEEP_DESTINATION"
  val USE_NEW_CONTENT: "USE_NEW_CONTENT" = "USE_NEW_CONTENT"

  @inline def values = js.Array[ReplacementTypeEnum](KEEP_BASE, KEEP_SOURCE, KEEP_DESTINATION, USE_NEW_CONTENT)
}

type RepositoryTriggerEventEnum = "all" | "updateReference" | "createReference" | "deleteReference"
object RepositoryTriggerEventEnum {
  val all: "all" = "all"
  val updateReference: "updateReference" = "updateReference"
  val createReference: "createReference" = "createReference"
  val deleteReference: "deleteReference" = "deleteReference"

  @inline def values = js.Array[RepositoryTriggerEventEnum](all, updateReference, createReference, deleteReference)
}

type SortByEnum = "repositoryName" | "lastModifiedDate"
object SortByEnum {
  val repositoryName: "repositoryName" = "repositoryName"
  val lastModifiedDate: "lastModifiedDate" = "lastModifiedDate"

  @inline def values = js.Array[SortByEnum](repositoryName, lastModifiedDate)
}
