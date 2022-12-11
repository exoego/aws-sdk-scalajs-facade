package facade.amazonaws.services.oam

import scalajs.js

type ResourceType = "AWS::CloudWatch::Metric" | "AWS::Logs::LogGroup" | "AWS::XRay::Trace"
object ResourceType {
  inline val `AWS::CloudWatch::Metric`: "AWS::CloudWatch::Metric" = "AWS::CloudWatch::Metric"
  inline val `AWS::Logs::LogGroup`: "AWS::Logs::LogGroup" = "AWS::Logs::LogGroup"
  inline val `AWS::XRay::Trace`: "AWS::XRay::Trace" = "AWS::XRay::Trace"

  inline def values: js.Array[ResourceType] = js.Array(`AWS::CloudWatch::Metric`, `AWS::Logs::LogGroup`, `AWS::XRay::Trace`)
}
