package facade.amazonaws.services.codegurureviewer

import scalajs._

type JobState = "Completed" | "Pending" | "Failed" | "Deleting"
object JobState {
  val Completed: "Completed" = "Completed"
  val Pending: "Pending" = "Pending"
  val Failed: "Failed" = "Failed"
  val Deleting: "Deleting" = "Deleting"

  @inline def values = js.Array[JobState](Completed, Pending, Failed, Deleting)
}

type ProviderType = "CodeCommit" | "GitHub" | "Bitbucket" | "GitHubEnterpriseServer"
object ProviderType {
  val CodeCommit: "CodeCommit" = "CodeCommit"
  val GitHub: "GitHub" = "GitHub"
  val Bitbucket: "Bitbucket" = "Bitbucket"
  val GitHubEnterpriseServer: "GitHubEnterpriseServer" = "GitHubEnterpriseServer"

  @inline def values = js.Array[ProviderType](CodeCommit, GitHub, Bitbucket, GitHubEnterpriseServer)
}

type Reaction = "ThumbsUp" | "ThumbsDown"
object Reaction {
  val ThumbsUp: "ThumbsUp" = "ThumbsUp"
  val ThumbsDown: "ThumbsDown" = "ThumbsDown"

  @inline def values = js.Array[Reaction](ThumbsUp, ThumbsDown)
}

type RepositoryAssociationState = "Associated" | "Associating" | "Failed" | "Disassociating" | "Disassociated"
object RepositoryAssociationState {
  val Associated: "Associated" = "Associated"
  val Associating: "Associating" = "Associating"
  val Failed: "Failed" = "Failed"
  val Disassociating: "Disassociating" = "Disassociating"
  val Disassociated: "Disassociated" = "Disassociated"

  @inline def values = js.Array[RepositoryAssociationState](Associated, Associating, Failed, Disassociating, Disassociated)
}

type Type = "PullRequest" | "RepositoryAnalysis"
object Type {
  val PullRequest: "PullRequest" = "PullRequest"
  val RepositoryAnalysis: "RepositoryAnalysis" = "RepositoryAnalysis"

  @inline def values = js.Array[Type](PullRequest, RepositoryAnalysis)
}
