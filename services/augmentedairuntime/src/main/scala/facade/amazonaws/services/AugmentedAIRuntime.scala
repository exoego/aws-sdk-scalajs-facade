package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object augmentedairuntime {
  type ContentClassifiers = js.Array[ContentClassifier]
  type FailureReason      = String
  type FlowDefinitionArn  = String
  type HumanLoopArn       = String
  type HumanLoopName      = String
  type HumanLoopSummaries = js.Array[HumanLoopSummary]
  type InputContent       = String
  type MaxResults         = Int
  type NextToken          = String
  type Timestamp          = js.Date

  implicit final class AugmentedAIRuntimeOps(private val service: AugmentedAIRuntime) extends AnyVal {

    @inline def deleteHumanLoopFuture(params: DeleteHumanLoopRequest): Future[DeleteHumanLoopResponse] =
      service.deleteHumanLoop(params).promise().toFuture
    @inline def describeHumanLoopFuture(params: DescribeHumanLoopRequest): Future[DescribeHumanLoopResponse] =
      service.describeHumanLoop(params).promise().toFuture
    @inline def listHumanLoopsFuture(params: ListHumanLoopsRequest): Future[ListHumanLoopsResponse] =
      service.listHumanLoops(params).promise().toFuture
    @inline def startHumanLoopFuture(params: StartHumanLoopRequest): Future[StartHumanLoopResponse] =
      service.startHumanLoop(params).promise().toFuture
    @inline def stopHumanLoopFuture(params: StopHumanLoopRequest): Future[StopHumanLoopResponse] =
      service.stopHumanLoop(params).promise().toFuture
  }
}

package augmentedairuntime {
  @js.native
  @JSImport("aws-sdk", "AugmentedAIRuntime")
  class AugmentedAIRuntime() extends js.Object {
    def this(config: AWSConfig) = this()

    def deleteHumanLoop(params: DeleteHumanLoopRequest): Request[DeleteHumanLoopResponse]       = js.native
    def describeHumanLoop(params: DescribeHumanLoopRequest): Request[DescribeHumanLoopResponse] = js.native
    def listHumanLoops(params: ListHumanLoopsRequest): Request[ListHumanLoopsResponse]          = js.native
    def startHumanLoop(params: StartHumanLoopRequest): Request[StartHumanLoopResponse]          = js.native
    def stopHumanLoop(params: StopHumanLoopRequest): Request[StopHumanLoopResponse]             = js.native
  }

  @js.native
  sealed trait ContentClassifier extends js.Any
  object ContentClassifier extends js.Object {
    val FreeOfPersonallyIdentifiableInformation =
      "FreeOfPersonallyIdentifiableInformation".asInstanceOf[ContentClassifier]
    val FreeOfAdultContent = "FreeOfAdultContent".asInstanceOf[ContentClassifier]

    val values = js.Object.freeze(js.Array(FreeOfPersonallyIdentifiableInformation, FreeOfAdultContent))
  }

  @js.native
  @Factory
  trait DeleteHumanLoopRequest extends js.Object {
    var HumanLoopName: HumanLoopName
  }

  @js.native
  @Factory
  trait DeleteHumanLoopResponse extends js.Object {}

  @js.native
  @Factory
  trait DescribeHumanLoopRequest extends js.Object {
    var HumanLoopName: HumanLoopName
  }

  @js.native
  @Factory
  trait DescribeHumanLoopResponse extends js.Object {
    var CreationTimestamp: Timestamp
    var FlowDefinitionArn: FlowDefinitionArn
    var HumanLoopArn: HumanLoopArn
    var HumanLoopInput: HumanLoopInputContent
    var HumanLoopName: HumanLoopName
    var HumanLoopStatus: HumanLoopStatus
    var FailureCode: js.UndefOr[String]
    var FailureReason: js.UndefOr[String]
    var HumanLoopOutput: js.UndefOr[HumanLoopOutputContent]
  }

  /**
    * Contains information about why a human loop was triggered. If at least one activation reason is evaluated to be true, the human loop is activated.
    */
  @js.native
  @Factory
  trait HumanLoopActivationReason extends js.Object {
    var ConditionsMatched: js.UndefOr[Boolean]
  }

  /**
    * Information about the corresponding flow definition's human loop activation condition evaluation. Null if <code>StartHumanLoop</code> was invoked directly.
    */
  @js.native
  @Factory
  trait HumanLoopActivationResults extends js.Object {
    var HumanLoopActivationConditionsEvaluationResults: js.UndefOr[String]
    var HumanLoopActivationReason: js.UndefOr[HumanLoopActivationReason]
  }

  /**
    * An object containing the input.
    */
  @js.native
  @Factory
  trait HumanLoopInputContent extends js.Object {
    var InputContent: InputContent
  }

  /**
    * Information about where the human output will be stored.
    */
  @js.native
  @Factory
  trait HumanLoopOutputContent extends js.Object {
    var OutputS3Uri: String
  }

  @js.native
  sealed trait HumanLoopStatus extends js.Any
  object HumanLoopStatus extends js.Object {
    val InProgress = "InProgress".asInstanceOf[HumanLoopStatus]
    val Failed     = "Failed".asInstanceOf[HumanLoopStatus]
    val Completed  = "Completed".asInstanceOf[HumanLoopStatus]
    val Stopped    = "Stopped".asInstanceOf[HumanLoopStatus]
    val Stopping   = "Stopping".asInstanceOf[HumanLoopStatus]

    val values = js.Object.freeze(js.Array(InProgress, Failed, Completed, Stopped, Stopping))
  }

  /**
    * Summary information about the human loop.
    */
  @js.native
  @Factory
  trait HumanLoopSummary extends js.Object {
    var CreationTime: js.UndefOr[Timestamp]
    var FailureReason: js.UndefOr[FailureReason]
    var FlowDefinitionArn: js.UndefOr[FlowDefinitionArn]
    var HumanLoopName: js.UndefOr[HumanLoopName]
    var HumanLoopStatus: js.UndefOr[HumanLoopStatus]
  }

  /**
    * Attributes of the data specified by the customer. Use these to describe the data to be labeled.
    */
  @js.native
  @Factory
  trait HumanReviewDataAttributes extends js.Object {
    var ContentClassifiers: ContentClassifiers
  }

  @js.native
  @Factory
  trait ListHumanLoopsRequest extends js.Object {
    var CreationTimeAfter: js.UndefOr[Timestamp]
    var CreationTimeBefore: js.UndefOr[Timestamp]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var SortOrder: js.UndefOr[SortOrder]
  }

  @js.native
  @Factory
  trait ListHumanLoopsResponse extends js.Object {
    var HumanLoopSummaries: HumanLoopSummaries
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  sealed trait SortOrder extends js.Any
  object SortOrder extends js.Object {
    val Ascending  = "Ascending".asInstanceOf[SortOrder]
    val Descending = "Descending".asInstanceOf[SortOrder]

    val values = js.Object.freeze(js.Array(Ascending, Descending))
  }

  @js.native
  @Factory
  trait StartHumanLoopRequest extends js.Object {
    var FlowDefinitionArn: FlowDefinitionArn
    var HumanLoopInput: HumanLoopInputContent
    var HumanLoopName: HumanLoopName
    var DataAttributes: js.UndefOr[HumanReviewDataAttributes]
  }

  @js.native
  @Factory
  trait StartHumanLoopResponse extends js.Object {
    var HumanLoopActivationResults: js.UndefOr[HumanLoopActivationResults]
    var HumanLoopArn: js.UndefOr[HumanLoopArn]
  }

  @js.native
  @Factory
  trait StopHumanLoopRequest extends js.Object {
    var HumanLoopName: HumanLoopName
  }

  @js.native
  @Factory
  trait StopHumanLoopResponse extends js.Object {}
}
