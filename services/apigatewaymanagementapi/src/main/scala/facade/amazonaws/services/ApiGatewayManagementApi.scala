package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object apigatewaymanagementapi {
  type Data               = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type __string           = String
  type __timestampIso8601 = js.Date

  implicit final class ApiGatewayManagementApiOps(private val service: ApiGatewayManagementApi) extends AnyVal {

    @inline def deleteConnectionFuture(params: DeleteConnectionRequest): Future[js.Object] =
      service.deleteConnection(params).promise().toFuture
    @inline def getConnectionFuture(params: GetConnectionRequest): Future[GetConnectionResponse] =
      service.getConnection(params).promise().toFuture
    @inline def postToConnectionFuture(params: PostToConnectionRequest): Future[js.Object] =
      service.postToConnection(params).promise().toFuture
  }
}

package apigatewaymanagementapi {
  @js.native
  @JSImport("aws-sdk", "ApiGatewayManagementApi")
  class ApiGatewayManagementApi() extends js.Object {
    def this(config: AWSConfig) = this()

    def deleteConnection(params: DeleteConnectionRequest): Request[js.Object]       = js.native
    def getConnection(params: GetConnectionRequest): Request[GetConnectionResponse] = js.native
    def postToConnection(params: PostToConnectionRequest): Request[js.Object]       = js.native
  }

  @js.native
  @Factory
  trait DeleteConnectionRequest extends js.Object {
    var ConnectionId: __string
  }

  @js.native
  @Factory
  trait GetConnectionRequest extends js.Object {
    var ConnectionId: __string
  }

  @js.native
  @Factory
  trait GetConnectionResponse extends js.Object {
    var ConnectedAt: js.UndefOr[__timestampIso8601]
    var Identity: js.UndefOr[Identity]
    var LastActiveAt: js.UndefOr[__timestampIso8601]
  }

  @js.native
  @Factory
  trait Identity extends js.Object {
    var SourceIp: __string
    var UserAgent: __string
  }

  @js.native
  @Factory
  trait PostToConnectionRequest extends js.Object {
    var ConnectionId: __string
    var Data: Data
  }
}
