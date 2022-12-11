package facade.amazonaws.services.oam

import scalajs.js

@js.native
sealed trait ResourceType extends js.Any
object ResourceType {
  val `AWS::CloudWatch::Metric` = "AWS::CloudWatch::Metric".asInstanceOf[ResourceType]
  val `AWS::Logs::LogGroup` = "AWS::Logs::LogGroup".asInstanceOf[ResourceType]
  val `AWS::XRay::Trace` = "AWS::XRay::Trace".asInstanceOf[ResourceType]

  @inline def values: js.Array[ResourceType] = js.Array(`AWS::CloudWatch::Metric`, `AWS::Logs::LogGroup`, `AWS::XRay::Trace`)
}
