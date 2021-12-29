package facade.amazonaws.services.resourcegroupstaggingapi

import scalajs._

type ErrorCode = "InternalServiceException" | "InvalidParameterException"
object ErrorCode {
  inline val InternalServiceException: "InternalServiceException" = "InternalServiceException"
  inline val InvalidParameterException: "InvalidParameterException" = "InvalidParameterException"

  inline def values: js.Array[ErrorCode] = js.Array(InternalServiceException, InvalidParameterException)
}

type GroupByAttribute = "TARGET_ID" | "REGION" | "RESOURCE_TYPE"
object GroupByAttribute {
  inline val TARGET_ID: "TARGET_ID" = "TARGET_ID"
  inline val REGION: "REGION" = "REGION"
  inline val RESOURCE_TYPE: "RESOURCE_TYPE" = "RESOURCE_TYPE"

  inline def values: js.Array[GroupByAttribute] = js.Array(TARGET_ID, REGION, RESOURCE_TYPE)
}

type TargetIdType = "ACCOUNT" | "OU" | "ROOT"
object TargetIdType {
  inline val ACCOUNT: "ACCOUNT" = "ACCOUNT"
  inline val OU: "OU" = "OU"
  inline val ROOT: "ROOT" = "ROOT"

  inline def values: js.Array[TargetIdType] = js.Array(ACCOUNT, OU, ROOT)
}
