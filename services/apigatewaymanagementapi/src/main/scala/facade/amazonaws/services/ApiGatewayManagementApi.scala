package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object apigatewaymanagementapi {
  type Data = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type __string = String
  type __timestampIso8601 = js.Date

  implicit final class ApiGatewayManagementApiOps(private val service: ApiGatewayManagementApi) extends AnyVal {

    @inline def deleteConnectionFuture(params: DeleteConnectionRequest): Future[js.Object] = service.deleteConnection(params).promise().toFuture
    @inline def getConnectionFuture(params: GetConnectionRequest): Future[GetConnectionResponse] = service.getConnection(params).promise().toFuture
    @inline def postToConnectionFuture(params: PostToConnectionRequest): Future[js.Object] = service.postToConnection(params).promise().toFuture

  }
}

package apigatewaymanagementapi {
  @js.native
  @JSImport("aws-sdk", "ApiGatewayManagementApi", "AWS.ApiGatewayManagementApi")
  class ApiGatewayManagementApi() extends js.Object {
    def this(config: AWSConfig) = this()

    def deleteConnection(params: DeleteConnectionRequest): Request[js.Object] = js.native
    def getConnection(params: GetConnectionRequest): Request[GetConnectionResponse] = js.native
    def postToConnection(params: PostToConnectionRequest): Request[js.Object] = js.native
  }

  @js.native
  trait DeleteConnectionRequest extends js.Object {
    var ConnectionId: __string
  }

  object DeleteConnectionRequest {
    @inline
    def apply(
        ConnectionId: __string
    ): DeleteConnectionRequest = {
      val __obj = js.Dynamic.literal(
        "ConnectionId" -> ConnectionId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteConnectionRequest]
    }
  }

  @js.native
  trait GetConnectionRequest extends js.Object {
    var ConnectionId: __string
  }

  object GetConnectionRequest {
    @inline
    def apply(
        ConnectionId: __string
    ): GetConnectionRequest = {
      val __obj = js.Dynamic.literal(
        "ConnectionId" -> ConnectionId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetConnectionRequest]
    }
  }

  @js.native
  trait GetConnectionResponse extends js.Object {
    var ConnectedAt: js.UndefOr[__timestampIso8601]
    var Identity: js.UndefOr[Identity]
    var LastActiveAt: js.UndefOr[__timestampIso8601]
  }

  object GetConnectionResponse {
    @inline
    def apply(
        ConnectedAt: js.UndefOr[__timestampIso8601] = js.undefined,
        Identity: js.UndefOr[Identity] = js.undefined,
        LastActiveAt: js.UndefOr[__timestampIso8601] = js.undefined
    ): GetConnectionResponse = {
      val __obj = js.Dynamic.literal()
      ConnectedAt.foreach(__v => __obj.updateDynamic("ConnectedAt")(__v.asInstanceOf[js.Any]))
      Identity.foreach(__v => __obj.updateDynamic("Identity")(__v.asInstanceOf[js.Any]))
      LastActiveAt.foreach(__v => __obj.updateDynamic("LastActiveAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetConnectionResponse]
    }
  }

  @js.native
  trait Identity extends js.Object {
    var SourceIp: __string
    var UserAgent: __string
  }

  object Identity {
    @inline
    def apply(
        SourceIp: __string,
        UserAgent: __string
    ): Identity = {
      val __obj = js.Dynamic.literal(
        "SourceIp" -> SourceIp.asInstanceOf[js.Any],
        "UserAgent" -> UserAgent.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Identity]
    }
  }

  @js.native
  trait PostToConnectionRequest extends js.Object {
    var ConnectionId: __string
    var Data: Data
  }

  object PostToConnectionRequest {
    @inline
    def apply(
        ConnectionId: __string,
        Data: Data
    ): PostToConnectionRequest = {
      val __obj = js.Dynamic.literal(
        "ConnectionId" -> ConnectionId.asInstanceOf[js.Any],
        "Data" -> Data.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PostToConnectionRequest]
    }
  }
}
