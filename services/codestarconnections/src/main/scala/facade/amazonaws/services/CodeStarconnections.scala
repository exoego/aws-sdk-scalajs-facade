package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object codestarconnections {
  type AccountId      = String
  type ConnectionArn  = String
  type ConnectionList = js.Array[Connection]
  type ConnectionName = String
  type MaxResults     = Int
  type NextToken      = String

  implicit final class CodeStarconnectionsOps(private val service: CodeStarconnections) extends AnyVal {

    @inline def createConnectionFuture(params: CreateConnectionInput): Future[CreateConnectionOutput] =
      service.createConnection(params).promise().toFuture
    @inline def deleteConnectionFuture(params: DeleteConnectionInput): Future[DeleteConnectionOutput] =
      service.deleteConnection(params).promise().toFuture
    @inline def getConnectionFuture(params: GetConnectionInput): Future[GetConnectionOutput] =
      service.getConnection(params).promise().toFuture
    @inline def listConnectionsFuture(params: ListConnectionsInput): Future[ListConnectionsOutput] =
      service.listConnections(params).promise().toFuture
  }
}

package codestarconnections {
  @js.native
  @JSImport("aws-sdk", "CodeStarconnections")
  class CodeStarconnections() extends js.Object {
    def this(config: AWSConfig) = this()

    def createConnection(params: CreateConnectionInput): Request[CreateConnectionOutput] = js.native
    def deleteConnection(params: DeleteConnectionInput): Request[DeleteConnectionOutput] = js.native
    def getConnection(params: GetConnectionInput): Request[GetConnectionOutput]          = js.native
    def listConnections(params: ListConnectionsInput): Request[ListConnectionsOutput]    = js.native
  }

  /**
    * The configuration that allows a service such as CodePipeline to connect to a third-party code repository.
    */
  @js.native
  @Factory
  trait Connection extends js.Object {
    var ConnectionArn: js.UndefOr[ConnectionArn]
    var ConnectionName: js.UndefOr[ConnectionName]
    var ConnectionStatus: js.UndefOr[ConnectionStatus]
    var OwnerAccountId: js.UndefOr[AccountId]
    var ProviderType: js.UndefOr[ProviderType]
  }

  @js.native
  sealed trait ConnectionStatus extends js.Any
  object ConnectionStatus extends js.Object {
    val PENDING   = "PENDING".asInstanceOf[ConnectionStatus]
    val AVAILABLE = "AVAILABLE".asInstanceOf[ConnectionStatus]
    val ERROR     = "ERROR".asInstanceOf[ConnectionStatus]

    val values = js.Object.freeze(js.Array(PENDING, AVAILABLE, ERROR))
  }

  @js.native
  @Factory
  trait CreateConnectionInput extends js.Object {
    var ConnectionName: ConnectionName
    var ProviderType: ProviderType
  }

  @js.native
  @Factory
  trait CreateConnectionOutput extends js.Object {
    var ConnectionArn: ConnectionArn
  }

  @js.native
  @Factory
  trait DeleteConnectionInput extends js.Object {
    var ConnectionArn: ConnectionArn
  }

  @js.native
  @Factory
  trait DeleteConnectionOutput extends js.Object {}

  @js.native
  @Factory
  trait GetConnectionInput extends js.Object {
    var ConnectionArn: ConnectionArn
  }

  @js.native
  @Factory
  trait GetConnectionOutput extends js.Object {
    var Connection: js.UndefOr[Connection]
  }

  @js.native
  @Factory
  trait ListConnectionsInput extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var ProviderTypeFilter: js.UndefOr[ProviderType]
  }

  @js.native
  @Factory
  trait ListConnectionsOutput extends js.Object {
    var Connections: js.UndefOr[ConnectionList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  sealed trait ProviderType extends js.Any
  object ProviderType extends js.Object {
    val Bitbucket = "Bitbucket".asInstanceOf[ProviderType]

    val values = js.Object.freeze(js.Array(Bitbucket))
  }
}
