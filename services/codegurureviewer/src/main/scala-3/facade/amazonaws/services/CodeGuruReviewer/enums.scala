package facade.amazonaws.services.codegurureviewer

import scalajs._

type JobState = "Completed" | "Pending" | "Failed" | "Deleting"
object JobState {
  inline val Completed: "Completed" = "Completed"
  inline val Pending: "Pending" = "Pending"
  inline val Failed: "Failed" = "Failed"
  inline val Deleting: "Deleting" = "Deleting"

  inline def values: js.Array[JobState] = js.Array(Completed, Pending, Failed, Deleting)
}

type ProviderType = "CodeCommit" | "GitHub" | "Bitbucket" | "GitHubEnterpriseServer"
object ProviderType {
  inline val CodeCommit: "CodeCommit" = "CodeCommit"
  inline val GitHub: "GitHub" = "GitHub"
  inline val Bitbucket: "Bitbucket" = "Bitbucket"
  inline val GitHubEnterpriseServer: "GitHubEnterpriseServer" = "GitHubEnterpriseServer"

  inline def values: js.Array[ProviderType] = js.Array(CodeCommit, GitHub, Bitbucket, GitHubEnterpriseServer)
}

type Reaction = "ThumbsUp" | "ThumbsDown"
object Reaction {
  inline val ThumbsUp: "ThumbsUp" = "ThumbsUp"
  inline val ThumbsDown: "ThumbsDown" = "ThumbsDown"

  inline def values: js.Array[Reaction] = js.Array(ThumbsUp, ThumbsDown)
}

type RepositoryAssociationState = "Associated" | "Associating" | "Failed" | "Disassociating" | "Disassociated"
object RepositoryAssociationState {
  inline val Associated: "Associated" = "Associated"
  inline val Associating: "Associating" = "Associating"
  inline val Failed: "Failed" = "Failed"
  inline val Disassociating: "Disassociating" = "Disassociating"
  inline val Disassociated: "Disassociated" = "Disassociated"

  inline def values: js.Array[RepositoryAssociationState] = js.Array(Associated, Associating, Failed, Disassociating, Disassociated)
}

type Type = "PullRequest" | "RepositoryAnalysis"
object Type {
  inline val PullRequest: "PullRequest" = "PullRequest"
  inline val RepositoryAnalysis: "RepositoryAnalysis" = "RepositoryAnalysis"

  inline def values: js.Array[Type] = js.Array(PullRequest, RepositoryAnalysis)
}
