package facade.amazonaws.services.codestarconnections

import scalajs._

type ConnectionStatus = "PENDING" | "AVAILABLE" | "ERROR"
object ConnectionStatus {
  val PENDING: "PENDING" = "PENDING"
  val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  val ERROR: "ERROR" = "ERROR"

  @inline def values = js.Array[ConnectionStatus](PENDING, AVAILABLE, ERROR)
}

type ProviderType = "Bitbucket" | "GitHub" | "GitHubEnterpriseServer"
object ProviderType {
  val Bitbucket: "Bitbucket" = "Bitbucket"
  val GitHub: "GitHub" = "GitHub"
  val GitHubEnterpriseServer: "GitHubEnterpriseServer" = "GitHubEnterpriseServer"

  @inline def values = js.Array[ProviderType](Bitbucket, GitHub, GitHubEnterpriseServer)
}
