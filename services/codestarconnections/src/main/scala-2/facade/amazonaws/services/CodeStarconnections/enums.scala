package facade.amazonaws.services.codestarconnections

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait ConnectionStatus extends js.Any
object ConnectionStatus {
  val PENDING = "PENDING".asInstanceOf[ConnectionStatus]
  val AVAILABLE = "AVAILABLE".asInstanceOf[ConnectionStatus]
  val ERROR = "ERROR".asInstanceOf[ConnectionStatus]

  @inline def values = js.Array(PENDING, AVAILABLE, ERROR)
}

@js.native
sealed trait ProviderType extends js.Any
object ProviderType {
  val Bitbucket = "Bitbucket".asInstanceOf[ProviderType]
  val GitHub = "GitHub".asInstanceOf[ProviderType]
  val GitHubEnterpriseServer = "GitHubEnterpriseServer".asInstanceOf[ProviderType]

  @inline def values = js.Array(Bitbucket, GitHub, GitHubEnterpriseServer)
}

