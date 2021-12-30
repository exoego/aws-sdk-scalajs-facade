package facade.amazonaws.services.codegurureviewer

import scalajs.js

@js.native
sealed trait JobState extends js.Any
object JobState {
  val Completed = "Completed".asInstanceOf[JobState]
  val Pending = "Pending".asInstanceOf[JobState]
  val Failed = "Failed".asInstanceOf[JobState]
  val Deleting = "Deleting".asInstanceOf[JobState]

  @inline def values: js.Array[JobState] = js.Array(Completed, Pending, Failed, Deleting)
}

@js.native
sealed trait ProviderType extends js.Any
object ProviderType {
  val CodeCommit = "CodeCommit".asInstanceOf[ProviderType]
  val GitHub = "GitHub".asInstanceOf[ProviderType]
  val Bitbucket = "Bitbucket".asInstanceOf[ProviderType]
  val GitHubEnterpriseServer = "GitHubEnterpriseServer".asInstanceOf[ProviderType]

  @inline def values: js.Array[ProviderType] = js.Array(CodeCommit, GitHub, Bitbucket, GitHubEnterpriseServer)
}

@js.native
sealed trait Reaction extends js.Any
object Reaction {
  val ThumbsUp = "ThumbsUp".asInstanceOf[Reaction]
  val ThumbsDown = "ThumbsDown".asInstanceOf[Reaction]

  @inline def values: js.Array[Reaction] = js.Array(ThumbsUp, ThumbsDown)
}

@js.native
sealed trait RepositoryAssociationState extends js.Any
object RepositoryAssociationState {
  val Associated = "Associated".asInstanceOf[RepositoryAssociationState]
  val Associating = "Associating".asInstanceOf[RepositoryAssociationState]
  val Failed = "Failed".asInstanceOf[RepositoryAssociationState]
  val Disassociating = "Disassociating".asInstanceOf[RepositoryAssociationState]
  val Disassociated = "Disassociated".asInstanceOf[RepositoryAssociationState]

  @inline def values: js.Array[RepositoryAssociationState] = js.Array(Associated, Associating, Failed, Disassociating, Disassociated)
}

@js.native
sealed trait Type extends js.Any
object Type {
  val PullRequest = "PullRequest".asInstanceOf[Type]
  val RepositoryAnalysis = "RepositoryAnalysis".asInstanceOf[Type]

  @inline def values: js.Array[Type] = js.Array(PullRequest, RepositoryAnalysis)
}
