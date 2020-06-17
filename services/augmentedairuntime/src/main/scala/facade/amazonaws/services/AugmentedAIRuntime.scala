package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

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
      service.deleteHumanLoop(params).promise.toFuture
    @inline def describeHumanLoopFuture(params: DescribeHumanLoopRequest): Future[DescribeHumanLoopResponse] =
      service.describeHumanLoop(params).promise.toFuture
    @inline def listHumanLoopsFuture(params: ListHumanLoopsRequest): Future[ListHumanLoopsResponse] =
      service.listHumanLoops(params).promise.toFuture
    @inline def startHumanLoopFuture(params: StartHumanLoopRequest): Future[StartHumanLoopResponse] =
      service.startHumanLoop(params).promise.toFuture
    @inline def stopHumanLoopFuture(params: StopHumanLoopRequest): Future[StopHumanLoopResponse] =
      service.stopHumanLoop(params).promise.toFuture
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
  trait DeleteHumanLoopRequest extends js.Object {
    var HumanLoopName: HumanLoopName
  }

  object DeleteHumanLoopRequest {
    @inline
    def apply(
        HumanLoopName: HumanLoopName
    ): DeleteHumanLoopRequest = {
      val __obj = js.Dynamic.literal(
        "HumanLoopName" -> HumanLoopName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteHumanLoopRequest]
    }
  }

  @js.native
  trait DeleteHumanLoopResponse extends js.Object {}

  object DeleteHumanLoopResponse {
    @inline
    def apply(
    ): DeleteHumanLoopResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteHumanLoopResponse]
    }
  }

  @js.native
  trait DescribeHumanLoopRequest extends js.Object {
    var HumanLoopName: HumanLoopName
  }

  object DescribeHumanLoopRequest {
    @inline
    def apply(
        HumanLoopName: HumanLoopName
    ): DescribeHumanLoopRequest = {
      val __obj = js.Dynamic.literal(
        "HumanLoopName" -> HumanLoopName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeHumanLoopRequest]
    }
  }

  @js.native
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

  object DescribeHumanLoopResponse {
    @inline
    def apply(
        CreationTimestamp: Timestamp,
        FlowDefinitionArn: FlowDefinitionArn,
        HumanLoopArn: HumanLoopArn,
        HumanLoopInput: HumanLoopInputContent,
        HumanLoopName: HumanLoopName,
        HumanLoopStatus: HumanLoopStatus,
        FailureCode: js.UndefOr[String] = js.undefined,
        FailureReason: js.UndefOr[String] = js.undefined,
        HumanLoopOutput: js.UndefOr[HumanLoopOutputContent] = js.undefined
    ): DescribeHumanLoopResponse = {
      val __obj = js.Dynamic.literal(
        "CreationTimestamp" -> CreationTimestamp.asInstanceOf[js.Any],
        "FlowDefinitionArn" -> FlowDefinitionArn.asInstanceOf[js.Any],
        "HumanLoopArn"      -> HumanLoopArn.asInstanceOf[js.Any],
        "HumanLoopInput"    -> HumanLoopInput.asInstanceOf[js.Any],
        "HumanLoopName"     -> HumanLoopName.asInstanceOf[js.Any],
        "HumanLoopStatus"   -> HumanLoopStatus.asInstanceOf[js.Any]
      )

      FailureCode.foreach(__v => __obj.updateDynamic("FailureCode")(__v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      HumanLoopOutput.foreach(__v => __obj.updateDynamic("HumanLoopOutput")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeHumanLoopResponse]
    }
  }

  /**
    * Contains information about why a human loop was triggered. If at least one activation reason is evaluated to be true, the human loop is activated.
    */
  @js.native
  trait HumanLoopActivationReason extends js.Object {
    var ConditionsMatched: js.UndefOr[Boolean]
  }

  object HumanLoopActivationReason {
    @inline
    def apply(
        ConditionsMatched: js.UndefOr[Boolean] = js.undefined
    ): HumanLoopActivationReason = {
      val __obj = js.Dynamic.literal()
      ConditionsMatched.foreach(__v => __obj.updateDynamic("ConditionsMatched")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HumanLoopActivationReason]
    }
  }

  /**
    * Information about the corresponding flow definition's human loop activation condition evaluation. Null if <code>StartHumanLoop</code> was invoked directly.
    */
  @js.native
  trait HumanLoopActivationResults extends js.Object {
    var HumanLoopActivationConditionsEvaluationResults: js.UndefOr[String]
    var HumanLoopActivationReason: js.UndefOr[HumanLoopActivationReason]
  }

  object HumanLoopActivationResults {
    @inline
    def apply(
        HumanLoopActivationConditionsEvaluationResults: js.UndefOr[String] = js.undefined,
        HumanLoopActivationReason: js.UndefOr[HumanLoopActivationReason] = js.undefined
    ): HumanLoopActivationResults = {
      val __obj = js.Dynamic.literal()
      HumanLoopActivationConditionsEvaluationResults.foreach(__v =>
        __obj.updateDynamic("HumanLoopActivationConditionsEvaluationResults")(__v.asInstanceOf[js.Any])
      )
      HumanLoopActivationReason.foreach(__v =>
        __obj.updateDynamic("HumanLoopActivationReason")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[HumanLoopActivationResults]
    }
  }

  /**
    * An object containing the input.
    */
  @js.native
  trait HumanLoopInputContent extends js.Object {
    var InputContent: InputContent
  }

  object HumanLoopInputContent {
    @inline
    def apply(
        InputContent: InputContent
    ): HumanLoopInputContent = {
      val __obj = js.Dynamic.literal(
        "InputContent" -> InputContent.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[HumanLoopInputContent]
    }
  }

  /**
    * Information about where the human output will be stored.
    */
  @js.native
  trait HumanLoopOutputContent extends js.Object {
    var OutputS3Uri: String
  }

  object HumanLoopOutputContent {
    @inline
    def apply(
        OutputS3Uri: String
    ): HumanLoopOutputContent = {
      val __obj = js.Dynamic.literal(
        "OutputS3Uri" -> OutputS3Uri.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[HumanLoopOutputContent]
    }
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
  trait HumanLoopSummary extends js.Object {
    var CreationTime: js.UndefOr[Timestamp]
    var FailureReason: js.UndefOr[FailureReason]
    var FlowDefinitionArn: js.UndefOr[FlowDefinitionArn]
    var HumanLoopName: js.UndefOr[HumanLoopName]
    var HumanLoopStatus: js.UndefOr[HumanLoopStatus]
  }

  object HumanLoopSummary {
    @inline
    def apply(
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        FailureReason: js.UndefOr[FailureReason] = js.undefined,
        FlowDefinitionArn: js.UndefOr[FlowDefinitionArn] = js.undefined,
        HumanLoopName: js.UndefOr[HumanLoopName] = js.undefined,
        HumanLoopStatus: js.UndefOr[HumanLoopStatus] = js.undefined
    ): HumanLoopSummary = {
      val __obj = js.Dynamic.literal()
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      FlowDefinitionArn.foreach(__v => __obj.updateDynamic("FlowDefinitionArn")(__v.asInstanceOf[js.Any]))
      HumanLoopName.foreach(__v => __obj.updateDynamic("HumanLoopName")(__v.asInstanceOf[js.Any]))
      HumanLoopStatus.foreach(__v => __obj.updateDynamic("HumanLoopStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HumanLoopSummary]
    }
  }

  /**
    * Attributes of the data specified by the customer. Use these to describe the data to be labeled.
    */
  @js.native
  trait HumanReviewDataAttributes extends js.Object {
    var ContentClassifiers: ContentClassifiers
  }

  object HumanReviewDataAttributes {
    @inline
    def apply(
        ContentClassifiers: ContentClassifiers
    ): HumanReviewDataAttributes = {
      val __obj = js.Dynamic.literal(
        "ContentClassifiers" -> ContentClassifiers.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[HumanReviewDataAttributes]
    }
  }

  @js.native
  trait ListHumanLoopsRequest extends js.Object {
    var CreationTimeAfter: js.UndefOr[Timestamp]
    var CreationTimeBefore: js.UndefOr[Timestamp]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var SortOrder: js.UndefOr[SortOrder]
  }

  object ListHumanLoopsRequest {
    @inline
    def apply(
        CreationTimeAfter: js.UndefOr[Timestamp] = js.undefined,
        CreationTimeBefore: js.UndefOr[Timestamp] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SortOrder: js.UndefOr[SortOrder] = js.undefined
    ): ListHumanLoopsRequest = {
      val __obj = js.Dynamic.literal()
      CreationTimeAfter.foreach(__v => __obj.updateDynamic("CreationTimeAfter")(__v.asInstanceOf[js.Any]))
      CreationTimeBefore.foreach(__v => __obj.updateDynamic("CreationTimeBefore")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SortOrder.foreach(__v => __obj.updateDynamic("SortOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListHumanLoopsRequest]
    }
  }

  @js.native
  trait ListHumanLoopsResponse extends js.Object {
    var HumanLoopSummaries: HumanLoopSummaries
    var NextToken: js.UndefOr[NextToken]
  }

  object ListHumanLoopsResponse {
    @inline
    def apply(
        HumanLoopSummaries: HumanLoopSummaries,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListHumanLoopsResponse = {
      val __obj = js.Dynamic.literal(
        "HumanLoopSummaries" -> HumanLoopSummaries.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListHumanLoopsResponse]
    }
  }

  @js.native
  sealed trait SortOrder extends js.Any
  object SortOrder extends js.Object {
    val Ascending  = "Ascending".asInstanceOf[SortOrder]
    val Descending = "Descending".asInstanceOf[SortOrder]

    val values = js.Object.freeze(js.Array(Ascending, Descending))
  }

  @js.native
  trait StartHumanLoopRequest extends js.Object {
    var FlowDefinitionArn: FlowDefinitionArn
    var HumanLoopInput: HumanLoopInputContent
    var HumanLoopName: HumanLoopName
    var DataAttributes: js.UndefOr[HumanReviewDataAttributes]
  }

  object StartHumanLoopRequest {
    @inline
    def apply(
        FlowDefinitionArn: FlowDefinitionArn,
        HumanLoopInput: HumanLoopInputContent,
        HumanLoopName: HumanLoopName,
        DataAttributes: js.UndefOr[HumanReviewDataAttributes] = js.undefined
    ): StartHumanLoopRequest = {
      val __obj = js.Dynamic.literal(
        "FlowDefinitionArn" -> FlowDefinitionArn.asInstanceOf[js.Any],
        "HumanLoopInput"    -> HumanLoopInput.asInstanceOf[js.Any],
        "HumanLoopName"     -> HumanLoopName.asInstanceOf[js.Any]
      )

      DataAttributes.foreach(__v => __obj.updateDynamic("DataAttributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartHumanLoopRequest]
    }
  }

  @js.native
  trait StartHumanLoopResponse extends js.Object {
    var HumanLoopActivationResults: js.UndefOr[HumanLoopActivationResults]
    var HumanLoopArn: js.UndefOr[HumanLoopArn]
  }

  object StartHumanLoopResponse {
    @inline
    def apply(
        HumanLoopActivationResults: js.UndefOr[HumanLoopActivationResults] = js.undefined,
        HumanLoopArn: js.UndefOr[HumanLoopArn] = js.undefined
    ): StartHumanLoopResponse = {
      val __obj = js.Dynamic.literal()
      HumanLoopActivationResults.foreach(__v =>
        __obj.updateDynamic("HumanLoopActivationResults")(__v.asInstanceOf[js.Any])
      )
      HumanLoopArn.foreach(__v => __obj.updateDynamic("HumanLoopArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartHumanLoopResponse]
    }
  }

  @js.native
  trait StopHumanLoopRequest extends js.Object {
    var HumanLoopName: HumanLoopName
  }

  object StopHumanLoopRequest {
    @inline
    def apply(
        HumanLoopName: HumanLoopName
    ): StopHumanLoopRequest = {
      val __obj = js.Dynamic.literal(
        "HumanLoopName" -> HumanLoopName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StopHumanLoopRequest]
    }
  }

  @js.native
  trait StopHumanLoopResponse extends js.Object {}

  object StopHumanLoopResponse {
    @inline
    def apply(
    ): StopHumanLoopResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[StopHumanLoopResponse]
    }
  }
}
