package facade.amazonaws.services.dynamodb.shared

import scala.scalajs.js

/** Represents the data for an attribute. Each attribute value is described as a name-value pair. The name is the data type, and the value is the data itself. For more information, see [[https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/HowItWorks.NamingRulesDataTypes.html#HowItWorks.DataTypes|Data Types]] in the <i>Amazon DynamoDB Developer Guide</i>.
  */
@js.native
trait AttributeValue extends js.Object {
  var B: js.UndefOr[BinaryAttributeValue]
  var BOOL: js.UndefOr[BooleanAttributeValue]
  var BS: js.UndefOr[BinarySetAttributeValue]
  var L: js.UndefOr[ListAttributeValue]
  var M: js.UndefOr[MapAttributeValue]
  var N: js.UndefOr[NumberAttributeValue]
  var NS: js.UndefOr[NumberSetAttributeValue]
  var NULL: js.UndefOr[NullAttributeValue]
  var S: js.UndefOr[StringAttributeValue]
  var SS: js.UndefOr[StringSetAttributeValue]
}

object AttributeValue {
  @inline
  def apply(
      B: js.UndefOr[BinaryAttributeValue] = js.undefined,
      BOOL: js.UndefOr[BooleanAttributeValue] = js.undefined,
      BS: js.UndefOr[BinarySetAttributeValue] = js.undefined,
      L: js.UndefOr[ListAttributeValue] = js.undefined,
      M: js.UndefOr[MapAttributeValue] = js.undefined,
      N: js.UndefOr[NumberAttributeValue] = js.undefined,
      NS: js.UndefOr[NumberSetAttributeValue] = js.undefined,
      NULL: js.UndefOr[NullAttributeValue] = js.undefined,
      S: js.UndefOr[StringAttributeValue] = js.undefined,
      SS: js.UndefOr[StringSetAttributeValue] = js.undefined
  ): AttributeValue = {
    val __obj = js.Dynamic.literal()
    B.foreach(__v => __obj.updateDynamic("B")(__v.asInstanceOf[js.Any]))
    BOOL.foreach(__v => __obj.updateDynamic("BOOL")(__v.asInstanceOf[js.Any]))
    BS.foreach(__v => __obj.updateDynamic("BS")(__v.asInstanceOf[js.Any]))
    L.foreach(__v => __obj.updateDynamic("L")(__v.asInstanceOf[js.Any]))
    M.foreach(__v => __obj.updateDynamic("M")(__v.asInstanceOf[js.Any]))
    N.foreach(__v => __obj.updateDynamic("N")(__v.asInstanceOf[js.Any]))
    NS.foreach(__v => __obj.updateDynamic("NS")(__v.asInstanceOf[js.Any]))
    NULL.foreach(__v => __obj.updateDynamic("NULL")(__v.asInstanceOf[js.Any]))
    S.foreach(__v => __obj.updateDynamic("S")(__v.asInstanceOf[js.Any]))
    SS.foreach(__v => __obj.updateDynamic("SS")(__v.asInstanceOf[js.Any]))
    __obj.asInstanceOf[AttributeValue]
  }
  def S(value: StringAttributeValue): AttributeValue = js.Dynamic.literal("S" -> value).asInstanceOf[AttributeValue]
  def NFromInt(value: Int): AttributeValue = js.Dynamic.literal("N" -> value.toString).asInstanceOf[AttributeValue]
  def NFromLong(value: Long): AttributeValue = js.Dynamic.literal("N" -> value.toString).asInstanceOf[AttributeValue]
  def NFromDouble(value: Double): AttributeValue = js.Dynamic.literal("N" -> value.toString).asInstanceOf[AttributeValue]
  def NFromBigInt(value: BigInt): AttributeValue = js.Dynamic.literal("N" -> value.toString).asInstanceOf[AttributeValue]
  def NFromBigDecimal(value: BigDecimal): AttributeValue = js.Dynamic.literal("N" -> value.toString).asInstanceOf[AttributeValue]
  def BOOL(value: BooleanAttributeValue): AttributeValue = js.Dynamic.literal("BOOL" -> value).asInstanceOf[AttributeValue]
  def M(value: js.UndefOr[MapAttributeValue]): AttributeValue = if (value.isEmpty) AttributeValue.NULL(true) else js.Dynamic.literal("M" -> value.asInstanceOf[js.Any]).asInstanceOf[AttributeValue]
  def M(value: Option[MapAttributeValue]): AttributeValue = if (value.isEmpty) AttributeValue.NULL(true) else js.Dynamic.literal("M" -> value.get).asInstanceOf[AttributeValue]
  def MFromMap[T](value: Map[String, T])(implicit valueType: AttributeValueMapper[T]): AttributeValue = AttributeValueMapper.AttributeValueTypeMapT[T].apply(value)
  def L(value: ListAttributeValue): AttributeValue = js.Dynamic.literal("L" -> value).asInstanceOf[AttributeValue]
  def LFromSeq[T](value: Seq[T])(implicit valueType: AttributeValueMapper[T]): AttributeValue = AttributeValueMapper.AttributeValueTypeSeqT[T].apply(value)
  def NULL(value: NullAttributeValue): AttributeValue = js.Dynamic.literal("NULL" -> value).asInstanceOf[AttributeValue]
  def B(value: BinaryAttributeValue): AttributeValue = js.Dynamic.literal("B" -> value.asInstanceOf[js.Any]).asInstanceOf[AttributeValue]
  def NS(value: NumberSetAttributeValue): AttributeValue = js.Dynamic.literal("NS" -> value).asInstanceOf[AttributeValue]
  def BS(value: BinarySetAttributeValue): AttributeValue = js.Dynamic.literal("BS" -> value).asInstanceOf[AttributeValue]
  def SS(value: StringSetAttributeValue): AttributeValue = js.Dynamic.literal("SS" -> value).asInstanceOf[AttributeValue]

  def OptionAsValueOrNull[T](opt: Option[T])(implicit valueType: AttributeValueMapper[T]): AttributeValue = {
    opt match {
      case None    => NULL(true)
      case Some(s) => valueType(s)
    }
  }
  def OptionAsList[T](opt: Option[T])(implicit valueType: AttributeValueMapper[T]): AttributeValue = {
    opt match {
      case None    => js.Dynamic.literal("L" -> js.Array()).asInstanceOf[AttributeValue]
      case Some(s) => js.Dynamic.literal("L" -> js.Array(valueType(s))).asInstanceOf[AttributeValue]
    }
  }
}
