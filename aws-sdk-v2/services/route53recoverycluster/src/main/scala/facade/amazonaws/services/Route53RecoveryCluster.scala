package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object route53recoverycluster {
  type Arn = String
  type Arns = js.Array[Arn]
  type ControlPanelName = String
  type MaxResults = Int
  type PageToken = String
  type RoutingControlName = String
  type RoutingControls = js.Array[RoutingControl]
  type UpdateRoutingControlStateEntries = js.Array[UpdateRoutingControlStateEntry]

  final class Route53RecoveryClusterOps(private val service: Route53RecoveryCluster) extends AnyVal {

    @inline def getRoutingControlStateFuture(params: GetRoutingControlStateRequest): Future[GetRoutingControlStateResponse] = service.getRoutingControlState(params).promise().toFuture
    @inline def listRoutingControlsFuture(params: ListRoutingControlsRequest): Future[ListRoutingControlsResponse] = service.listRoutingControls(params).promise().toFuture
    @inline def updateRoutingControlStateFuture(params: UpdateRoutingControlStateRequest): Future[UpdateRoutingControlStateResponse] = service.updateRoutingControlState(params).promise().toFuture
    @inline def updateRoutingControlStatesFuture(params: UpdateRoutingControlStatesRequest): Future[UpdateRoutingControlStatesResponse] = service.updateRoutingControlStates(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/route53recoverycluster", JSImport.Namespace, "AWS.Route53RecoveryCluster")
  class Route53RecoveryCluster() extends js.Object {
    def this(config: AWSConfig) = this()

    def getRoutingControlState(params: GetRoutingControlStateRequest): Request[GetRoutingControlStateResponse] = js.native
    def listRoutingControls(params: ListRoutingControlsRequest): Request[ListRoutingControlsResponse] = js.native
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
    var RoutingControlName: js.UndefOr[RoutingControlName]
  }

  object GetRoutingControlStateResponse {
    @inline
    def apply(
        RoutingControlArn: Arn,
        RoutingControlState: RoutingControlState,
        RoutingControlName: js.UndefOr[RoutingControlName] = js.undefined
    ): GetRoutingControlStateResponse = {
      val __obj = js.Dynamic.literal(
        "RoutingControlArn" -> RoutingControlArn.asInstanceOf[js.Any],
        "RoutingControlState" -> RoutingControlState.asInstanceOf[js.Any]
      )

      RoutingControlName.foreach(__v => __obj.updateDynamic("RoutingControlName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRoutingControlStateResponse]
    }
  }

  @js.native
  trait ListRoutingControlsRequest extends js.Object {
    var ControlPanelArn: js.UndefOr[Arn]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[PageToken]
  }

  object ListRoutingControlsRequest {
    @inline
    def apply(
        ControlPanelArn: js.UndefOr[Arn] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[PageToken] = js.undefined
    ): ListRoutingControlsRequest = {
      val __obj = js.Dynamic.literal()
      ControlPanelArn.foreach(__v => __obj.updateDynamic("ControlPanelArn")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRoutingControlsRequest]
    }
  }

  @js.native
  trait ListRoutingControlsResponse extends js.Object {
    var RoutingControls: RoutingControls
    var NextToken: js.UndefOr[PageToken]
  }

  object ListRoutingControlsResponse {
    @inline
    def apply(
        RoutingControls: RoutingControls,
        NextToken: js.UndefOr[PageToken] = js.undefined
    ): ListRoutingControlsResponse = {
      val __obj = js.Dynamic.literal(
        "RoutingControls" -> RoutingControls.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRoutingControlsResponse]
    }
  }

  /** A routing control, which is a simple on/off switch that you can use to route traffic to cells. When a routing control state is On, traffic flows to a cell. When the state is Off, traffic does not flow.
    */
  @js.native
  trait RoutingControl extends js.Object {
    var ControlPanelArn: js.UndefOr[Arn]
    var ControlPanelName: js.UndefOr[ControlPanelName]
    var RoutingControlArn: js.UndefOr[Arn]
    var RoutingControlName: js.UndefOr[RoutingControlName]
    var RoutingControlState: js.UndefOr[RoutingControlState]
  }

  object RoutingControl {
    @inline
    def apply(
        ControlPanelArn: js.UndefOr[Arn] = js.undefined,
        ControlPanelName: js.UndefOr[ControlPanelName] = js.undefined,
        RoutingControlArn: js.UndefOr[Arn] = js.undefined,
        RoutingControlName: js.UndefOr[RoutingControlName] = js.undefined,
        RoutingControlState: js.UndefOr[RoutingControlState] = js.undefined
    ): RoutingControl = {
      val __obj = js.Dynamic.literal()
      ControlPanelArn.foreach(__v => __obj.updateDynamic("ControlPanelArn")(__v.asInstanceOf[js.Any]))
      ControlPanelName.foreach(__v => __obj.updateDynamic("ControlPanelName")(__v.asInstanceOf[js.Any]))
      RoutingControlArn.foreach(__v => __obj.updateDynamic("RoutingControlArn")(__v.asInstanceOf[js.Any]))
      RoutingControlName.foreach(__v => __obj.updateDynamic("RoutingControlName")(__v.asInstanceOf[js.Any]))
      RoutingControlState.foreach(__v => __obj.updateDynamic("RoutingControlState")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RoutingControl]
    }
  }

  /** A routing control state entry.
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
    var SafetyRulesToOverride: js.UndefOr[Arns]
  }

  object UpdateRoutingControlStateRequest {
    @inline
    def apply(
        RoutingControlArn: Arn,
        RoutingControlState: RoutingControlState,
        SafetyRulesToOverride: js.UndefOr[Arns] = js.undefined
    ): UpdateRoutingControlStateRequest = {
      val __obj = js.Dynamic.literal(
        "RoutingControlArn" -> RoutingControlArn.asInstanceOf[js.Any],
        "RoutingControlState" -> RoutingControlState.asInstanceOf[js.Any]
      )

      SafetyRulesToOverride.foreach(__v => __obj.updateDynamic("SafetyRulesToOverride")(__v.asInstanceOf[js.Any]))
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
    var SafetyRulesToOverride: js.UndefOr[Arns]
  }

  object UpdateRoutingControlStatesRequest {
    @inline
    def apply(
        UpdateRoutingControlStateEntries: UpdateRoutingControlStateEntries,
        SafetyRulesToOverride: js.UndefOr[Arns] = js.undefined
    ): UpdateRoutingControlStatesRequest = {
      val __obj = js.Dynamic.literal(
        "UpdateRoutingControlStateEntries" -> UpdateRoutingControlStateEntries.asInstanceOf[js.Any]
      )

      SafetyRulesToOverride.foreach(__v => __obj.updateDynamic("SafetyRulesToOverride")(__v.asInstanceOf[js.Any]))
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
