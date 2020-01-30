package facade.amazonaws.services

import facade.amazonaws.services.dynamodb.{AttributeValue, AttributeValueMapper}
import facade.amazonaws.services.dynamodb.AttributeValueMapper._

import net.exoego.scalajs.scalatest.structural._
import org.scalatest.funsuite.AnyFunSuite

import scala.scalajs.js

class AttributeValueMapperTest extends AnyFunSuite {
  test("AttributeValueTypeString") {
    assert(AttributeValueTypeString("foo") === AttributeValue.S("foo"))
    assert(AttributeValueTypeString("") === AttributeValue.S(""))
    assert(AttributeValueTypeString(null) === AttributeValue.S(null))
  }

  test("AttributeValueTypeBoolean") {
    assert(AttributeValueTypeBoolean(true) === AttributeValue.BOOL(true))
    assert(AttributeValueTypeBoolean(false) === AttributeValue.BOOL(false))
  }

  test("AttributeValueTypeMap") {
    val attributeValue = AttributeValueTypeMap(
      js.Dictionary(
        "name"  -> AttributeValue.S("john"),
        "age"   -> AttributeValue.NFromInt(1),
        "isFoo" -> AttributeValue.BOOL(true)
      )
    )
    assert(
      attributeValue === AttributeValue.M(
        js.Dictionary(
          "name"  -> AttributeValue.S("john"),
          "age"   -> AttributeValue.NFromInt(1),
          "isFoo" -> AttributeValue.BOOL(true)
        )
      )
    )
  }

  test("AttributeValueTypeList") {
    val attributeValue = AttributeValueTypeList(
      js.Array(
        AttributeValue.S("john"),
        AttributeValue.NFromInt(1),
        AttributeValue.BOOL(true)
      )
    )
    assert(
      attributeValue === AttributeValue.L(
        js.Array(
          AttributeValue.S("john"),
          AttributeValue.NFromInt(1),
          AttributeValue.BOOL(true)
        )
      )
    )
  }

  test("AttributeValueTypeInt") {
    assert(AttributeValueTypeInt(42) === AttributeValue.NFromInt(42))
    assert(AttributeValueTypeInt(Int.MaxValue) === AttributeValue.NFromInt(Int.MaxValue))
  }

  test("AttributeValueTypeDouble") {
    assert(AttributeValueTypeDouble(42) === AttributeValue.NFromDouble(42))
    assert(AttributeValueTypeDouble(Double.MaxValue) === AttributeValue.NFromDouble(Double.MaxValue))
  }

  test("AttributeValueTypeScalaBigInt") {
    assert(
      AttributeValueTypeScalaBigInt(BigInt(Long.MaxValue) + BigInt(1)) === AttributeValue(N = "9223372036854775808")
    )
  }

  test("AttributeValueTypeScalaBigDecimal") {
    assert(AttributeValueTypeScalaBigDecimal(BigDecimal("1.67")) === AttributeValue(N = "1.67"))
  }

  test("AttributeValueTypeMapT") {
    val mapper = AttributeValueTypeMapT[String]
    assert(
      mapper(Map("foo" -> "bar")) === AttributeValue.M(
        js.Dictionary(
          "foo" -> AttributeValue.S("bar")
        )
      )
    )
  }

  test("AttributeValueTypeSeqT") {
    val mapper = AttributeValueTypeSeqT[String]
    assert(
      mapper(List("foo", "bar", "buz")) === AttributeValue.L(
        js.Array(
          AttributeValue.S("foo"),
          AttributeValue.S("bar"),
          AttributeValue.S("buz")
        )
      )
    )
  }
}
