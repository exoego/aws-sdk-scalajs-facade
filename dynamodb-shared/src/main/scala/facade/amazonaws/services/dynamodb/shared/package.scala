package facade.amazonaws.services.dynamodb

import scala.scalajs.js
import scala.scalajs.js.|

package object shared {
  type BinaryAttributeValue = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type BinarySetAttributeValue = js.Array[BinaryAttributeValue]
  type BooleanAttributeValue = Boolean
  type ListAttributeValue = js.Array[AttributeValue]
  type MapAttributeValue = js.Dictionary[AttributeValue]
  type NullAttributeValue = Boolean
  type NumberAttributeValue = String
  type NumberSetAttributeValue = js.Array[NumberAttributeValue]
  type StringAttributeValue = String
  type StringSetAttributeValue = js.Array[StringAttributeValue]
}
