package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object augmentedairuntime {
  type ContentClassifiers = js.Array[ContentClassifier]
  type FailureReason = String
  type FlowDefinitionArn = String
  type HumanLoopArn = String
  type HumanLoopName = String
  type HumanLoopSummaries = js.Array[HumanLoopSummary]
  type InputContent = String
  type MaxResults = Int
  type NextToken = String
  type Timestamp = js.Date

  final class AugmentedAIRuntimeOps(private val service: AugmentedAIRuntime) extends AnyVal {

    @inline def deleteHumanLoopFuture(params: DeleteHumanLoopRequest): Future[DeleteHumanLoopResponse] = service.deleteHumanLoop(params).promise().toFuture
    @inline def describeHumanLoopFuture(params: DescribeHumanLoopRequest): Future[DescribeHumanLoopResponse] = service.describeHumanLoop(params).promise().toFuture
    @inline def listHumanLoopsFuture(params: ListHumanLoopsRequest): Future[ListHumanLoopsResponse] = service.listHumanLoops(params).promise().toFuture
    @inline def startHumanLoopFuture(params: StartHumanLoopRequest): Future[StartHumanLoopResponse] = service.startHumanLoop(params).promise().toFuture
    @inline def stopHumanLoopFuture(params: StopHumanLoopRequest): Future[StopHumanLoopResponse] = service.stopHumanLoop(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/augmentedairuntime", JSImport.Namespace, "AWS.AugmentedAIRuntime")
  class AugmentedAIRuntime() extends js.Object {
    def this(config: AWSConfig) = this()

    def deleteHumanLoop(params: DeleteHumanLoopRequest): Request[DeleteHumanLoopResponse] = js.native
    def describeHumanLoop(params: DescribeHumanLoopRequest): Request[DescribeHumanLoopResponse] = js.native
    def listHumanLoops(params: ListHumanLoopsRequest): Request[ListHumanLoopsResponse] = js.native
    def startHumanLoop(params: StartHumanLoopRequest): Request[StartHumanLoopResponse] = js.native
    def stopHumanLoop(params: StopHumanLoopRequest): Request[StopHumanLoopResponse] = js.native
  }
  object AugmentedAIRuntime {
    @inline implicit def toOps(service: AugmentedAIRuntime): AugmentedAIRuntimeOps = {
      new AugmentedAIRuntimeOps(service)
    }
  }

  @js.native
  sealed trait ContentClassifier extends js.Any
  object ContentClassifier {
    val FreeOfPersonallyIdentifiableInformation = "FreeOfPersonallyIdentifiableInformation".asInstanceOf[ContentClassifier]
    val FreeOfAdultContent = "FreeOfAdultContent".asInstanceOf[ContentClassifier]

    @inline def values = js.Array(FreeOfPersonallyIdentifiableInformation, FreeOfAdultContent)
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
  trait DeleteHumanLoopResponse extends js.Object

  object DeleteHumanLoopResponse {
    @inline
    def apply(): DeleteHumanLoopResponse = {
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
    var CreationTime: Timestamp
    var FlowDefinitionArn: FlowDefinitionArn
    var HumanLoopArn: HumanLoopArn
    var HumanLoopName: HumanLoopName
    var HumanLoopStatus: HumanLoopStatus
    var FailureCode: js.UndefOr[String]
    var FailureReason: js.UndefOr[String]
    var HumanLoopOutput: js.UndefOr[HumanLoopOutput]
  }

  object DescribeHumanLoopResponse {
    @inline
    def apply(
        CreationTime: Timestamp,
        FlowDefinitionArn: FlowDefinitionArn,
        HumanLoopArn: HumanLoopArn,
        HumanLoopName: HumanLoopName,
        HumanLoopStatus: HumanLoopStatus,
        FailureCode: js.UndefOr[String] = js.undefined,
        FailureReason: js.UndefOr[String] = js.undefined,
        HumanLoopOutput: js.UndefOr[HumanLoopOutput] = js.undefined
    ): DescribeHumanLoopResponse = {
      val __obj = js.Dynamic.literal(
        "CreationTime" -> CreationTime.asInstanceOf[js.Any],
        "FlowDefinitionArn" -> FlowDefinitionArn.asInstanceOf[js.Any],
        "HumanLoopArn" -> HumanLoopArn.asInstanceOf[js.Any],
        "HumanLoopName" -> HumanLoopName.asInstanceOf[js.Any],
        "HumanLoopStatus" -> HumanLoopStatus.asInstanceOf[js.Any]
      )

      FailureCode.foreach(__v => __obj.updateDynamic("FailureCode")(__v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      HumanLoopOutput.foreach(__v => __obj.updateDynamic("HumanLoopOutput")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeHumanLoopResponse]
    }
  }

  /** Attributes of the data specified by the customer. Use these to describe the data to be labeled.
    */
  @js.native
  trait HumanLoopDataAttributes extends js.Object {
    var ContentClassifiers: ContentClassifiers
  }

  object HumanLoopDataAttributes {
    @inline
    def apply(
        ContentClassifiers: ContentClassifiers
    ): HumanLoopDataAttributes = {
      val __obj = js.Dynamic.literal(
        "ContentClassifiers" -> ContentClassifiers.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[HumanLoopDataAttributes]
    }
  }

  /** An object containing the human loop input in JSON format.
    */
  @js.native
  trait HumanLoopInput extends js.Object {
    var InputContent: InputContent
  }

  object HumanLoopInput {
    @inline
    def apply(
        InputContent: InputContent
    ): HumanLoopInput = {
      val __obj = js.Dynamic.literal(
        "InputContent" -> InputContent.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[HumanLoopInput]
    }
  }

  /** Information about where the human output will be stored.
    */
  @js.native
  trait HumanLoopOutput extends js.Object {
    var OutputS3Uri: String
  }

  object HumanLoopOutput {
    @inline
    def apply(
        OutputS3Uri: String
    ): HumanLoopOutput = {
      val __obj = js.Dynamic.literal(
        "OutputS3Uri" -> OutputS3Uri.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[HumanLoopOutput]
    }
  }

  @js.native
  sealed trait HumanLoopStatus extends js.Any
  object HumanLoopStatus {
    val InProgress = "InProgress".asInstanceOf[HumanLoopStatus]
    val Failed = "Failed".asInstanceOf[HumanLoopStatus]
    val Completed = "Completed".asInstanceOf[HumanLoopStatus]
    val Stopped = "Stopped".asInstanceOf[HumanLoopStatus]
    val Stopping = "Stopping".asInstanceOf[HumanLoopStatus]

    @inline def values = js.Array(InProgress, Failed, Completed, Stopped, Stopping)
  }

  /** Summary information about the human loop.
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

  @js.native
  trait ListHumanLoopsRequest extends js.Object {
    var FlowDefinitionArn: FlowDefinitionArn
    var CreationTimeAfter: js.UndefOr[Timestamp]
    var CreationTimeBefore: js.UndefOr[Timestamp]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var SortOrder: js.UndefOr[SortOrder]
  }

  object ListHumanLoopsRequest {
    @inline
    def apply(
        FlowDefinitionArn: FlowDefinitionArn,
        CreationTimeAfter: js.UndefOr[Timestamp] = js.undefined,
        CreationTimeBefore: js.UndefOr[Timestamp] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SortOrder: js.UndefOr[SortOrder] = js.undefined
    ): ListHumanLoopsRequest = {
      val __obj = js.Dynamic.literal(
        "FlowDefinitionArn" -> FlowDefinitionArn.asInstanceOf[js.Any]
      )

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
  object SortOrder {
    val Ascending = "Ascending".asInstanceOf[SortOrder]
    val Descending = "Descending".asInstanceOf[SortOrder]

    @inline def values = js.Array(Ascending, Descending)
  }

  @js.native
  trait StartHumanLoopRequest extends js.Object {
    var FlowDefinitionArn: FlowDefinitionArn
    var HumanLoopInput: HumanLoopInput
    var HumanLoopName: HumanLoopName
    var DataAttributes: js.UndefOr[HumanLoopDataAttributes]
  }

  object StartHumanLoopRequest {
    @inline
    def apply(
        FlowDefinitionArn: FlowDefinitionArn,
        HumanLoopInput: HumanLoopInput,
        HumanLoopName: HumanLoopName,
        DataAttributes: js.UndefOr[HumanLoopDataAttributes] = js.undefined
    ): StartHumanLoopRequest = {
      val __obj = js.Dynamic.literal(
        "FlowDefinitionArn" -> FlowDefinitionArn.asInstanceOf[js.Any],
        "HumanLoopInput" -> HumanLoopInput.asInstanceOf[js.Any],
        "HumanLoopName" -> HumanLoopName.asInstanceOf[js.Any]
      )

      DataAttributes.foreach(__v => __obj.updateDynamic("DataAttributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartHumanLoopRequest]
    }
  }

  @js.native
  trait StartHumanLoopResponse extends js.Object {
    var HumanLoopArn: js.UndefOr[HumanLoopArn]
  }

  object StartHumanLoopResponse {
    @inline
    def apply(
        HumanLoopArn: js.UndefOr[HumanLoopArn] = js.undefined
    ): StartHumanLoopResponse = {
      val __obj = js.Dynamic.literal()
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
  trait StopHumanLoopResponse extends js.Object

  object StopHumanLoopResponse {
    @inline
    def apply(): StopHumanLoopResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StopHumanLoopResponse]
    }
  }
}
