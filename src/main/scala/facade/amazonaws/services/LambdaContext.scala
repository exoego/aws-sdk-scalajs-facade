package facade.amazonaws.services.lambda

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

@ScalaJSDefined
trait LambdaContext extends js.Object {
  var callbackWaitsForEmptyEventLoop: Boolean
  var functionName: String
  var invokedFunctionArn: String
  // FIXME: Integerのはずだが、Stringでとれる。Integerにパースしたい
  var memoryLimitInMB: String
  var awsRequestId: String
  var logGroupName: String
  var logStreamName: String
}

object LambdaContext {
  def apply(
    callbackWaitsForEmptyEventLoop: js.UndefOr[Boolean],
    functionName: js.UndefOr[String],
    invokedFunctionArn: js.UndefOr[String],
    memoryLimitInMB: js.UndefOr[String],
    awsRequestId: js.UndefOr[String],
    logGroupName: js.UndefOr[String],
    logStreamName: js.UndefOr[String]): LambdaContext = {
    val _fields = IndexedSeq[(String, js.Any)](
      ("callbackWaitsForEmptyEventLoop" -> callbackWaitsForEmptyEventLoop),
      ("functionName" -> functionName),
      ("invokedFunctionArn" -> invokedFunctionArn),
      ("memoryLimitInMB" -> memoryLimitInMB),
      ("awsRequestId" -> awsRequestId),
      ("logGroupName" -> logGroupName),
      ("logStreamName" -> logStreamName)).filter(_._2 != js.undefined)
    js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LambdaContext]
  }
}
