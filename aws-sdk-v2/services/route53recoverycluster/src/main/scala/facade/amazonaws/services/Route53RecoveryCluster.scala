package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object route53recoverycluster {
  type Arn = String
  type UpdateRoutingControlStateEntries = js.Array[UpdateRoutingControlStateEntry]

  final class Route53RecoveryClusterOps(private val service: Route53RecoveryCluster) extends AnyVal {

    @inline def getRoutingControlStateFuture(params: GetRoutingControlStateRequest): Future[GetRoutingControlStateResponse] = service.getRoutingControlState(params).promise().toFuture
    @inline def updateRoutingControlStateFuture(params: UpdateRoutingControlStateRequest): Future[UpdateRoutingControlStateResponse] = service.updateRoutingControlState(params).promise().toFuture
    @inline def updateRoutingControlStatesFuture(params: UpdateRoutingControlStatesRequest): Future[UpdateRoutingControlStatesResponse] = service.updateRoutingControlStates(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/route53recoverycluster", JSImport.Namespace, "AWS.Route53RecoveryCluster")
  class Route53RecoveryCluster() extends js.Object {
    def this(config: AWSConfig) = this()

    def getRoutingControlState(params: GetRoutingControlStateRequest): Request[GetRoutingControlStateResponse] = js.native
    def updateRoutingControlState(params: UpdateRoutingControlStateRequest): Request[UpdateRoutingControlStateResponse] = js.native
    def updateRoutingControlStates(params: UpdateRoutingControlStatesRequest): Request[UpdateRoutingControlStatesResponse] = js.native
  }
  object Route53RecoveryCluster {
    @inline implicit def toOps(service: Route53RecoveryCluster): Route53RecoveryClusterOps = {
      new Route53RecoveryClusterOps(service)
    }
  }

  @js.native
  trait GetRoutingControlStateRequest extends js.Object {
    var RoutingControlArn: Arn
  }

  object GetRoutingControlStateRequest {
    @inline
    def apply(
        RoutingControlArn: Arn
    ): GetRoutingControlStateRequest = {
      val __obj = js.Dynamic.literal(
        "RoutingControlArn" -> RoutingControlArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetRoutingControlStateRequest]
    }
  }

  @js.native
  trait GetRoutingControlStateResponse extends js.Object {
    var RoutingControlArn: Arn
    var RoutingControlState: RoutingControlState
  }

  object GetRoutingControlStateResponse {
    @inline
    def apply(
        RoutingControlArn: Arn,
        RoutingControlState: RoutingControlState
    ): GetRoutingControlStateResponse = {
      val __obj = js.Dynamic.literal(
        "RoutingControlArn" -> RoutingControlArn.asInstanceOf[js.Any],
        "RoutingControlState" -> RoutingControlState.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetRoutingControlStateResponse]
    }
  }

  /** A routing control state.
    */
  @js.native
  trait UpdateRoutingControlStateEntry extends js.Object {
    var RoutingControlArn: Arn
    var RoutingControlState: RoutingControlState
  }

  object UpdateRoutingControlStateEntry {
    @inline
    def apply(
        RoutingControlArn: Arn,
        RoutingControlState: RoutingControlState
    ): UpdateRoutingControlStateEntry = {
      val __obj = js.Dynamic.literal(
        "RoutingControlArn" -> RoutingControlArn.asInstanceOf[js.Any],
        "RoutingControlState" -> RoutingControlState.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateRoutingControlStateEntry]
    }
  }

  @js.native
  trait UpdateRoutingControlStateRequest extends js.Object {
    var RoutingControlArn: Arn
    var RoutingControlState: RoutingControlState
  }

  object UpdateRoutingControlStateRequest {
    @inline
    def apply(
        RoutingControlArn: Arn,
        RoutingControlState: RoutingControlState
    ): UpdateRoutingControlStateRequest = {
      val __obj = js.Dynamic.literal(
        "RoutingControlArn" -> RoutingControlArn.asInstanceOf[js.Any],
        "RoutingControlState" -> RoutingControlState.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateRoutingControlStateRequest]
    }
  }

  @js.native
  trait UpdateRoutingControlStateResponse extends js.Object

  object UpdateRoutingControlStateResponse {
    @inline
    def apply(): UpdateRoutingControlStateResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateRoutingControlStateResponse]
    }
  }

  @js.native
  trait UpdateRoutingControlStatesRequest extends js.Object {
    var UpdateRoutingControlStateEntries: UpdateRoutingControlStateEntries
  }

  object UpdateRoutingControlStatesRequest {
    @inline
    def apply(
        UpdateRoutingControlStateEntries: UpdateRoutingControlStateEntries
    ): UpdateRoutingControlStatesRequest = {
      val __obj = js.Dynamic.literal(
        "UpdateRoutingControlStateEntries" -> UpdateRoutingControlStateEntries.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateRoutingControlStatesRequest]
    }
  }

  @js.native
  trait UpdateRoutingControlStatesResponse extends js.Object

  object UpdateRoutingControlStatesResponse {
    @inline
    def apply(): UpdateRoutingControlStatesResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateRoutingControlStatesResponse]
    }
  }
}
