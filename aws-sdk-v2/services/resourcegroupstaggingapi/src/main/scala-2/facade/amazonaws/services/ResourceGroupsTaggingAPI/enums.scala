package facade.amazonaws.services.resourcegroupstaggingapi

import scalajs.js

@js.native
sealed trait ErrorCode extends js.Any
object ErrorCode {
  val InternalServiceException = "InternalServiceException".asInstanceOf[ErrorCode]
  val InvalidParameterException = "InvalidParameterException".asInstanceOf[ErrorCode]

  @inline def values: js.Array[ErrorCode] = js.Array(InternalServiceException, InvalidParameterException)
}

@js.native
sealed trait GroupByAttribute extends js.Any
object GroupByAttribute {
  val TARGET_ID = "TARGET_ID".asInstanceOf[GroupByAttribute]
  val REGION = "REGION".asInstanceOf[GroupByAttribute]
  val RESOURCE_TYPE = "RESOURCE_TYPE".asInstanceOf[GroupByAttribute]

  @inline def values: js.Array[GroupByAttribute] = js.Array(TARGET_ID, REGION, RESOURCE_TYPE)
}

@js.native
sealed trait TargetIdType extends js.Any
object TargetIdType {
  val ACCOUNT = "ACCOUNT".asInstanceOf[TargetIdType]
  val OU = "OU".asInstanceOf[TargetIdType]
  val ROOT = "ROOT".asInstanceOf[TargetIdType]

  @inline def values: js.Array[TargetIdType] = js.Array(ACCOUNT, OU, ROOT)
}
