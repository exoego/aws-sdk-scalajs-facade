package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object controltower {
  type ControlIdentifier = String
  type EnabledControls = js.Array[EnabledControlSummary]
  type MaxResults = Int
  type OperationIdentifier = String
  type SyntheticTimestamp_date_time = js.Date
  type TargetIdentifier = String

  final class ControlTowerOps(private val service: ControlTower) extends AnyVal {

    @inline def disableControlFuture(params: DisableControlInput): Future[DisableControlOutput] = service.disableControl(params).promise().toFuture
    @inline def enableControlFuture(params: EnableControlInput): Future[EnableControlOutput] = service.enableControl(params).promise().toFuture
    @inline def getControlOperationFuture(params: GetControlOperationInput): Future[GetControlOperationOutput] = service.getControlOperation(params).promise().toFuture
    @inline def listEnabledControlsFuture(params: ListEnabledControlsInput): Future[ListEnabledControlsOutput] = service.listEnabledControls(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/controltower", JSImport.Namespace, "AWS.ControlTower")
  class ControlTower() extends js.Object {
    def this(config: AWSConfig) = this()

    def disableControl(params: DisableControlInput): Request[DisableControlOutput] = js.native
    def enableControl(params: EnableControlInput): Request[EnableControlOutput] = js.native
    def getControlOperation(params: GetControlOperationInput): Request[GetControlOperationOutput] = js.native
    def listEnabledControls(params: ListEnabledControlsInput): Request[ListEnabledControlsOutput] = js.native
  }
  object ControlTower {
    @inline implicit def toOps(service: ControlTower): ControlTowerOps = {
      new ControlTowerOps(service)
    }
  }

  /** An operation performed by the control.
    */
  @js.native
  trait ControlOperation extends js.Object {
    var endTime: js.UndefOr[SyntheticTimestamp_date_time]
    var operationType: js.UndefOr[ControlOperationType]
    var startTime: js.UndefOr[SyntheticTimestamp_date_time]
    var status: js.UndefOr[ControlOperationStatus]
    var statusMessage: js.UndefOr[String]
  }

  object ControlOperation {
    @inline
    def apply(
        endTime: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined,
        operationType: js.UndefOr[ControlOperationType] = js.undefined,
        startTime: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined,
        status: js.UndefOr[ControlOperationStatus] = js.undefined,
        statusMessage: js.UndefOr[String] = js.undefined
    ): ControlOperation = {
      val __obj = js.Dynamic.literal()
      endTime.foreach(__v => __obj.updateDynamic("endTime")(__v.asInstanceOf[js.Any]))
      operationType.foreach(__v => __obj.updateDynamic("operationType")(__v.asInstanceOf[js.Any]))
      startTime.foreach(__v => __obj.updateDynamic("startTime")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      statusMessage.foreach(__v => __obj.updateDynamic("statusMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ControlOperation]
    }
  }

  @js.native
  trait DisableControlInput extends js.Object {
    var controlIdentifier: ControlIdentifier
    var targetIdentifier: TargetIdentifier
  }

  object DisableControlInput {
    @inline
    def apply(
        controlIdentifier: ControlIdentifier,
        targetIdentifier: TargetIdentifier
    ): DisableControlInput = {
      val __obj = js.Dynamic.literal(
        "controlIdentifier" -> controlIdentifier.asInstanceOf[js.Any],
        "targetIdentifier" -> targetIdentifier.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisableControlInput]
    }
  }

  @js.native
  trait DisableControlOutput extends js.Object {
    var operationIdentifier: OperationIdentifier
  }

  object DisableControlOutput {
    @inline
    def apply(
        operationIdentifier: OperationIdentifier
    ): DisableControlOutput = {
      val __obj = js.Dynamic.literal(
        "operationIdentifier" -> operationIdentifier.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisableControlOutput]
    }
  }

  @js.native
  trait EnableControlInput extends js.Object {
    var controlIdentifier: ControlIdentifier
    var targetIdentifier: TargetIdentifier
  }

  object EnableControlInput {
    @inline
    def apply(
        controlIdentifier: ControlIdentifier,
        targetIdentifier: TargetIdentifier
    ): EnableControlInput = {
      val __obj = js.Dynamic.literal(
        "controlIdentifier" -> controlIdentifier.asInstanceOf[js.Any],
        "targetIdentifier" -> targetIdentifier.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[EnableControlInput]
    }
  }

  @js.native
  trait EnableControlOutput extends js.Object {
    var operationIdentifier: OperationIdentifier
  }

  object EnableControlOutput {
    @inline
    def apply(
        operationIdentifier: OperationIdentifier
    ): EnableControlOutput = {
      val __obj = js.Dynamic.literal(
        "operationIdentifier" -> operationIdentifier.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[EnableControlOutput]
    }
  }

  /** A summary of enabled controls.
    */
  @js.native
  trait EnabledControlSummary extends js.Object {
    var controlIdentifier: js.UndefOr[ControlIdentifier]
  }

  object EnabledControlSummary {
    @inline
    def apply(
        controlIdentifier: js.UndefOr[ControlIdentifier] = js.undefined
    ): EnabledControlSummary = {
      val __obj = js.Dynamic.literal()
      controlIdentifier.foreach(__v => __obj.updateDynamic("controlIdentifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EnabledControlSummary]
    }
  }

  @js.native
  trait GetControlOperationInput extends js.Object {
    var operationIdentifier: OperationIdentifier
  }

  object GetControlOperationInput {
    @inline
    def apply(
        operationIdentifier: OperationIdentifier
    ): GetControlOperationInput = {
      val __obj = js.Dynamic.literal(
        "operationIdentifier" -> operationIdentifier.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetControlOperationInput]
    }
  }

  @js.native
  trait GetControlOperationOutput extends js.Object {
    var controlOperation: ControlOperation
  }

  object GetControlOperationOutput {
    @inline
    def apply(
        controlOperation: ControlOperation
    ): GetControlOperationOutput = {
      val __obj = js.Dynamic.literal(
        "controlOperation" -> controlOperation.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetControlOperationOutput]
    }
  }

  @js.native
  trait ListEnabledControlsInput extends js.Object {
    var targetIdentifier: TargetIdentifier
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[String]
  }

  object ListEnabledControlsInput {
    @inline
    def apply(
        targetIdentifier: TargetIdentifier,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListEnabledControlsInput = {
      val __obj = js.Dynamic.literal(
        "targetIdentifier" -> targetIdentifier.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEnabledControlsInput]
    }
  }

  @js.native
  trait ListEnabledControlsOutput extends js.Object {
    var enabledControls: EnabledControls
    var nextToken: js.UndefOr[String]
  }

  object ListEnabledControlsOutput {
    @inline
    def apply(
        enabledControls: EnabledControls,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListEnabledControlsOutput = {
      val __obj = js.Dynamic.literal(
        "enabledControls" -> enabledControls.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEnabledControlsOutput]
    }
  }
}
