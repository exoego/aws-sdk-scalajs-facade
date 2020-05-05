package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object codestarconnections {
  type AccountId      = String
  type ConnectionArn  = String
  type ConnectionList = js.Array[Connection]
  type ConnectionName = String
  type MaxResults     = Int
  type NextToken      = String

  implicit final class CodeStarconnectionsOps(private val service: CodeStarconnections) extends AnyVal {

    @inline def createConnectionFuture(params: CreateConnectionInput): Future[CreateConnectionOutput] =
      service.createConnection(params).promise.toFuture
    @inline def deleteConnectionFuture(params: DeleteConnectionInput): Future[DeleteConnectionOutput] =
      service.deleteConnection(params).promise.toFuture
    @inline def getConnectionFuture(params: GetConnectionInput): Future[GetConnectionOutput] =
      service.getConnection(params).promise.toFuture
    @inline def listConnectionsFuture(params: ListConnectionsInput): Future[ListConnectionsOutput] =
      service.listConnections(params).promise.toFuture
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
  trait Connection extends js.Object {
    var ConnectionArn: js.UndefOr[ConnectionArn]
    var ConnectionName: js.UndefOr[ConnectionName]
    var ConnectionStatus: js.UndefOr[ConnectionStatus]
    var OwnerAccountId: js.UndefOr[AccountId]
    var ProviderType: js.UndefOr[ProviderType]
  }

  object Connection {
    @inline
    def apply(
        ConnectionArn: js.UndefOr[ConnectionArn] = js.undefined,
        ConnectionName: js.UndefOr[ConnectionName] = js.undefined,
        ConnectionStatus: js.UndefOr[ConnectionStatus] = js.undefined,
        OwnerAccountId: js.UndefOr[AccountId] = js.undefined,
        ProviderType: js.UndefOr[ProviderType] = js.undefined
    ): Connection = {
      val __obj = js.Dynamic.literal()
      ConnectionArn.foreach(__v => __obj.updateDynamic("ConnectionArn")(__v.asInstanceOf[js.Any]))
      ConnectionName.foreach(__v => __obj.updateDynamic("ConnectionName")(__v.asInstanceOf[js.Any]))
      ConnectionStatus.foreach(__v => __obj.updateDynamic("ConnectionStatus")(__v.asInstanceOf[js.Any]))
      OwnerAccountId.foreach(__v => __obj.updateDynamic("OwnerAccountId")(__v.asInstanceOf[js.Any]))
      ProviderType.foreach(__v => __obj.updateDynamic("ProviderType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Connection]
    }
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
  trait CreateConnectionInput extends js.Object {
    var ConnectionName: ConnectionName
    var ProviderType: ProviderType
  }

  object CreateConnectionInput {
    @inline
    def apply(
        ConnectionName: ConnectionName,
        ProviderType: ProviderType
    ): CreateConnectionInput = {
      val __obj = js.Dynamic.literal(
        "ConnectionName" -> ConnectionName.asInstanceOf[js.Any],
        "ProviderType"   -> ProviderType.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateConnectionInput]
    }
  }

  @js.native
  trait CreateConnectionOutput extends js.Object {
    var ConnectionArn: ConnectionArn
  }

  object CreateConnectionOutput {
    @inline
    def apply(
        ConnectionArn: ConnectionArn
    ): CreateConnectionOutput = {
      val __obj = js.Dynamic.literal(
        "ConnectionArn" -> ConnectionArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateConnectionOutput]
    }
  }

  @js.native
  trait DeleteConnectionInput extends js.Object {
    var ConnectionArn: ConnectionArn
  }

  object DeleteConnectionInput {
    @inline
    def apply(
        ConnectionArn: ConnectionArn
    ): DeleteConnectionInput = {
      val __obj = js.Dynamic.literal(
        "ConnectionArn" -> ConnectionArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteConnectionInput]
    }
  }

  @js.native
  trait DeleteConnectionOutput extends js.Object {}

  object DeleteConnectionOutput {
    @inline
    def apply(
    ): DeleteConnectionOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteConnectionOutput]
    }
  }

  @js.native
  trait GetConnectionInput extends js.Object {
    var ConnectionArn: ConnectionArn
  }

  object GetConnectionInput {
    @inline
    def apply(
        ConnectionArn: ConnectionArn
    ): GetConnectionInput = {
      val __obj = js.Dynamic.literal(
        "ConnectionArn" -> ConnectionArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetConnectionInput]
    }
  }

  @js.native
  trait GetConnectionOutput extends js.Object {
    var Connection: js.UndefOr[Connection]
  }

  object GetConnectionOutput {
    @inline
    def apply(
        Connection: js.UndefOr[Connection] = js.undefined
    ): GetConnectionOutput = {
      val __obj = js.Dynamic.literal()
      Connection.foreach(__v => __obj.updateDynamic("Connection")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetConnectionOutput]
    }
  }

  @js.native
  trait ListConnectionsInput extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var ProviderTypeFilter: js.UndefOr[ProviderType]
  }

  object ListConnectionsInput {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ProviderTypeFilter: js.UndefOr[ProviderType] = js.undefined
    ): ListConnectionsInput = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ProviderTypeFilter.foreach(__v => __obj.updateDynamic("ProviderTypeFilter")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListConnectionsInput]
    }
  }

  @js.native
  trait ListConnectionsOutput extends js.Object {
    var Connections: js.UndefOr[ConnectionList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListConnectionsOutput {
    @inline
    def apply(
        Connections: js.UndefOr[ConnectionList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListConnectionsOutput = {
      val __obj = js.Dynamic.literal()
      Connections.foreach(__v => __obj.updateDynamic("Connections")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListConnectionsOutput]
    }
  }
  @js.native
  sealed trait ProviderType extends js.Any
  object ProviderType extends js.Object {
    val Bitbucket = "Bitbucket".asInstanceOf[ProviderType]

    val values = js.Object.freeze(js.Array(Bitbucket))
  }
}
