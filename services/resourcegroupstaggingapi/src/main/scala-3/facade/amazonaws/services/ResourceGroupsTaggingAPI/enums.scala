package facade.amazonaws.services.resourcegroupstaggingapi

import scalajs._

type ErrorCode = "InternalServiceException" | "InvalidParameterException"
object ErrorCode {
  val InternalServiceException: "InternalServiceException" = "InternalServiceException"
  val InvalidParameterException: "InvalidParameterException" = "InvalidParameterException"

  @inline def values = js.Array[ErrorCode](InternalServiceException, InvalidParameterException)
}

type GroupByAttribute = "TARGET_ID" | "REGION" | "RESOURCE_TYPE"
object GroupByAttribute {
  val TARGET_ID: "TARGET_ID" = "TARGET_ID"
  val REGION: "REGION" = "REGION"
  val RESOURCE_TYPE: "RESOURCE_TYPE" = "RESOURCE_TYPE"

  @inline def values = js.Array[GroupByAttribute](TARGET_ID, REGION, RESOURCE_TYPE)
}

type TargetIdType = "ACCOUNT" | "OU" | "ROOT"
object TargetIdType {
  val ACCOUNT: "ACCOUNT" = "ACCOUNT"
  val OU: "OU" = "OU"
  val ROOT: "ROOT" = "ROOT"

  @inline def values = js.Array[TargetIdType](ACCOUNT, OU, ROOT)
}
