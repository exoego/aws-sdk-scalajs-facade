package facade.amazonaws.services.codestarconnections

import scalajs.js

type ConnectionStatus = "PENDING" | "AVAILABLE" | "ERROR"
object ConnectionStatus {
  inline val PENDING: "PENDING" = "PENDING"
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val ERROR: "ERROR" = "ERROR"

  inline def values: js.Array[ConnectionStatus] = js.Array(PENDING, AVAILABLE, ERROR)
}

type ProviderType = "Bitbucket" | "GitHub" | "GitHubEnterpriseServer"
object ProviderType {
  inline val Bitbucket: "Bitbucket" = "Bitbucket"
  inline val GitHub: "GitHub" = "GitHub"
  inline val GitHubEnterpriseServer: "GitHubEnterpriseServer" = "GitHubEnterpriseServer"

  inline def values: js.Array[ProviderType] = js.Array(Bitbucket, GitHub, GitHubEnterpriseServer)
}
