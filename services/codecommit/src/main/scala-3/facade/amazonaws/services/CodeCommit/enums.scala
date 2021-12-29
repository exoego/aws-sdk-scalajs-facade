package facade.amazonaws.services.codecommit

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait ApprovalState extends js.Any
object ApprovalState {
  val APPROVE = "APPROVE".asInstanceOf[ApprovalState]
  val REVOKE = "REVOKE".asInstanceOf[ApprovalState]

  @inline def values = js.Array(APPROVE, REVOKE)
}

@js.native
sealed trait ChangeTypeEnum extends js.Any
object ChangeTypeEnum {
  val A = "A".asInstanceOf[ChangeTypeEnum]
  val M = "M".asInstanceOf[ChangeTypeEnum]
  val D = "D".asInstanceOf[ChangeTypeEnum]

  @inline def values = js.Array(A, M, D)
}

@js.native
sealed trait ConflictDetailLevelTypeEnum extends js.Any
object ConflictDetailLevelTypeEnum {
  val FILE_LEVEL = "FILE_LEVEL".asInstanceOf[ConflictDetailLevelTypeEnum]
  val LINE_LEVEL = "LINE_LEVEL".asInstanceOf[ConflictDetailLevelTypeEnum]

  @inline def values = js.Array(FILE_LEVEL, LINE_LEVEL)
}

@js.native
sealed trait ConflictResolutionStrategyTypeEnum extends js.Any
object ConflictResolutionStrategyTypeEnum {
  val NONE = "NONE".asInstanceOf[ConflictResolutionStrategyTypeEnum]
  val ACCEPT_SOURCE = "ACCEPT_SOURCE".asInstanceOf[ConflictResolutionStrategyTypeEnum]
  val ACCEPT_DESTINATION = "ACCEPT_DESTINATION".asInstanceOf[ConflictResolutionStrategyTypeEnum]
  val AUTOMERGE = "AUTOMERGE".asInstanceOf[ConflictResolutionStrategyTypeEnum]

  @inline def values = js.Array(NONE, ACCEPT_SOURCE, ACCEPT_DESTINATION, AUTOMERGE)
}

@js.native
sealed trait FileModeTypeEnum extends js.Any
object FileModeTypeEnum {
  val EXECUTABLE = "EXECUTABLE".asInstanceOf[FileModeTypeEnum]
  val NORMAL = "NORMAL".asInstanceOf[FileModeTypeEnum]
  val SYMLINK = "SYMLINK".asInstanceOf[FileModeTypeEnum]

  @inline def values = js.Array(EXECUTABLE, NORMAL, SYMLINK)
}

@js.native
sealed trait MergeOptionTypeEnum extends js.Any
object MergeOptionTypeEnum {
  val FAST_FORWARD_MERGE = "FAST_FORWARD_MERGE".asInstanceOf[MergeOptionTypeEnum]
  val SQUASH_MERGE = "SQUASH_MERGE".asInstanceOf[MergeOptionTypeEnum]
  val THREE_WAY_MERGE = "THREE_WAY_MERGE".asInstanceOf[MergeOptionTypeEnum]

  @inline def values = js.Array(FAST_FORWARD_MERGE, SQUASH_MERGE, THREE_WAY_MERGE)
}

@js.native
sealed trait ObjectTypeEnum extends js.Any
object ObjectTypeEnum {
  val FILE = "FILE".asInstanceOf[ObjectTypeEnum]
  val DIRECTORY = "DIRECTORY".asInstanceOf[ObjectTypeEnum]
  val GIT_LINK = "GIT_LINK".asInstanceOf[ObjectTypeEnum]
  val SYMBOLIC_LINK = "SYMBOLIC_LINK".asInstanceOf[ObjectTypeEnum]

  @inline def values = js.Array(FILE, DIRECTORY, GIT_LINK, SYMBOLIC_LINK)
}

@js.native
sealed trait OrderEnum extends js.Any
object OrderEnum {
  val ascending = "ascending".asInstanceOf[OrderEnum]
  val descending = "descending".asInstanceOf[OrderEnum]

  @inline def values = js.Array(ascending, descending)
}

@js.native
sealed trait OverrideStatus extends js.Any
object OverrideStatus {
  val OVERRIDE = "OVERRIDE".asInstanceOf[OverrideStatus]
  val REVOKE = "REVOKE".asInstanceOf[OverrideStatus]

  @inline def values = js.Array(OVERRIDE, REVOKE)
}

@js.native
sealed trait PullRequestEventType extends js.Any
object PullRequestEventType {
  val PULL_REQUEST_CREATED = "PULL_REQUEST_CREATED".asInstanceOf[PullRequestEventType]
  val PULL_REQUEST_STATUS_CHANGED = "PULL_REQUEST_STATUS_CHANGED".asInstanceOf[PullRequestEventType]
  val PULL_REQUEST_SOURCE_REFERENCE_UPDATED = "PULL_REQUEST_SOURCE_REFERENCE_UPDATED".asInstanceOf[PullRequestEventType]
  val PULL_REQUEST_MERGE_STATE_CHANGED = "PULL_REQUEST_MERGE_STATE_CHANGED".asInstanceOf[PullRequestEventType]
  val PULL_REQUEST_APPROVAL_RULE_CREATED = "PULL_REQUEST_APPROVAL_RULE_CREATED".asInstanceOf[PullRequestEventType]
  val PULL_REQUEST_APPROVAL_RULE_UPDATED = "PULL_REQUEST_APPROVAL_RULE_UPDATED".asInstanceOf[PullRequestEventType]
  val PULL_REQUEST_APPROVAL_RULE_DELETED = "PULL_REQUEST_APPROVAL_RULE_DELETED".asInstanceOf[PullRequestEventType]
  val PULL_REQUEST_APPROVAL_RULE_OVERRIDDEN = "PULL_REQUEST_APPROVAL_RULE_OVERRIDDEN".asInstanceOf[PullRequestEventType]
  val PULL_REQUEST_APPROVAL_STATE_CHANGED = "PULL_REQUEST_APPROVAL_STATE_CHANGED".asInstanceOf[PullRequestEventType]

  @inline def values = js.Array(
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

@js.native
sealed trait PullRequestStatusEnum extends js.Any
object PullRequestStatusEnum {
  val OPEN = "OPEN".asInstanceOf[PullRequestStatusEnum]
  val CLOSED = "CLOSED".asInstanceOf[PullRequestStatusEnum]

  @inline def values = js.Array(OPEN, CLOSED)
}

@js.native
sealed trait RelativeFileVersionEnum extends js.Any
object RelativeFileVersionEnum {
  val BEFORE = "BEFORE".asInstanceOf[RelativeFileVersionEnum]
  val AFTER = "AFTER".asInstanceOf[RelativeFileVersionEnum]

  @inline def values = js.Array(BEFORE, AFTER)
}

@js.native
sealed trait ReplacementTypeEnum extends js.Any
object ReplacementTypeEnum {
  val KEEP_BASE = "KEEP_BASE".asInstanceOf[ReplacementTypeEnum]
  val KEEP_SOURCE = "KEEP_SOURCE".asInstanceOf[ReplacementTypeEnum]
  val KEEP_DESTINATION = "KEEP_DESTINATION".asInstanceOf[ReplacementTypeEnum]
  val USE_NEW_CONTENT = "USE_NEW_CONTENT".asInstanceOf[ReplacementTypeEnum]

  @inline def values = js.Array(KEEP_BASE, KEEP_SOURCE, KEEP_DESTINATION, USE_NEW_CONTENT)
}

@js.native
sealed trait RepositoryTriggerEventEnum extends js.Any
object RepositoryTriggerEventEnum {
  val all = "all".asInstanceOf[RepositoryTriggerEventEnum]
  val updateReference = "updateReference".asInstanceOf[RepositoryTriggerEventEnum]
  val createReference = "createReference".asInstanceOf[RepositoryTriggerEventEnum]
  val deleteReference = "deleteReference".asInstanceOf[RepositoryTriggerEventEnum]

  @inline def values = js.Array(all, updateReference, createReference, deleteReference)
}

@js.native
sealed trait SortByEnum extends js.Any
object SortByEnum {
  val repositoryName = "repositoryName".asInstanceOf[SortByEnum]
  val lastModifiedDate = "lastModifiedDate".asInstanceOf[SortByEnum]

  @inline def values = js.Array(repositoryName, lastModifiedDate)
}
