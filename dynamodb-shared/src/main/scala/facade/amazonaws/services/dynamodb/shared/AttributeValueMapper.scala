package facade.amazonaws.services.dynamodb.shared

import scala.scalajs.js

case class AttributeValueMapper[T](name: String, toJSAny: T => js.Any) extends Function[T, AttributeValue] {
  override def apply(t: T): AttributeValue = js.Dynamic.literal(name -> this.toJSAny(t)).asInstanceOf[AttributeValue]
}

object AttributeValueMapper {
  implicit val AttributeValueTypeString: AttributeValueMapper[StringAttributeValue] =
    AttributeValueMapper("S", js.Any.fromString)
  implicit val AttributeValueTypeBoolean: AttributeValueMapper[BooleanAttributeValue] =
    AttributeValueMapper("BOOL", js.Any.fromBoolean)
  implicit val AttributeValueTypeMap: AttributeValueMapper[MapAttributeValue] =
    AttributeValueMapper("M", identity[MapAttributeValue])
  implicit val AttributeValueTypeList: AttributeValueMapper[ListAttributeValue] =
    AttributeValueMapper("L", identity[ListAttributeValue])

  implicit def AttributeValueTypeMapT[T: AttributeValueMapper]: AttributeValueMapper[Map[String, T]] = {
    import scala.collection.compat._
    AttributeValueMapper(
      "M",
      (seq: Map[String, T]) => js.Dictionary(seq.view.mapValues(implicitly[AttributeValueMapper[T]]).toSeq: _*)
    )
  }

  implicit def AttributeValueTypeSeqT[T: AttributeValueMapper]: AttributeValueMapper[Seq[T]] =
    AttributeValueMapper("L", (seq: Seq[T]) => js.Array(seq.map(implicitly[AttributeValueMapper[T]]): _*))

  implicit val AttributeValueTypeInt: AttributeValueMapper[Int] =
    AttributeValueMapper("N", x => js.Any.fromString(x.toString))
  implicit val AttributeValueTypeDouble: AttributeValueMapper[Double] =
    AttributeValueMapper("N", x => js.Any.fromString(x.toString))
  implicit val AttributeValueTypeScalaBigInt: AttributeValueMapper[BigInt] =
    AttributeValueMapper("N", n => js.Any.fromString(n.toString))
  implicit val AttributeValueTypeScalaBigDecimal: AttributeValueMapper[BigDecimal] =
    AttributeValueMapper("N", n => js.Any.fromString(n.toString))
}
