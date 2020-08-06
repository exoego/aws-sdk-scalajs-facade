package facade.amazonaws.services

import facade.amazonaws.services.dynamodb.AttributeValue
import facade.amazonaws.services.dynamodb.DynamoDBConverter
import facade.amazonaws.services.dynamodb.DynamoDBConverterOptions
import net.exoego.scalajs.scalatest.structural._
import org.scalatest.funsuite.AnyFunSuite

import scala.scalajs.js

class DynamoDBConverterTest extends AnyFunSuite {
  test("input") {
    assert(DynamoDBConverter.input("foo") === AttributeValue.S("foo"))
    assert(DynamoDBConverter.input(js.Dictionary(
      "a" -> 42,
      "b" -> true
    )) === AttributeValue.M(js.Dictionary[AttributeValue](
      "a" -> AttributeValue.NFromInt(42),
      "b" -> AttributeValue.BOOL(true)
    )))
  }

  test("output") {
    assert(DynamoDBConverter.output(AttributeValue.S("foo")) === "foo")
    assert(DynamoDBConverter.output(AttributeValue.M(js.Dictionary[AttributeValue](
      "a" -> AttributeValue.NFromInt(42),
      "b" -> AttributeValue.BOOL(true)
    ))).asInstanceOf[js.Object] === js.Dictionary(
      "a" -> 42,
      "b" -> true
    ))
  }

  test("marshall") {
    assert(DynamoDBConverter.marshall(js.Dictionary[js.Any](
      "a" -> 42,
      "b" -> true
    ).asInstanceOf[js.Object]).asInstanceOf[js.Object] === js.Dictionary[AttributeValue](
      "a" -> AttributeValue.NFromInt(42),
      "b" -> AttributeValue.BOOL(true)
    ).asInstanceOf[js.Object])
  }

  test("unmarshall") {
    assert(DynamoDBConverter.unmarshall(js.Dictionary[AttributeValue](
      "a" -> AttributeValue.NFromInt(42),
      "b" -> AttributeValue.BOOL(true)
    )) === js.Dictionary[js.Any](
      "a" -> 42,
      "b" -> true
    ).asInstanceOf[js.Object])
  }

  test("ConverterOptions: convertEmptyValues") {
    assert(DynamoDBConverter.input("") === AttributeValue.S(""))
    assert(DynamoDBConverter.input("", DynamoDBConverterOptions(convertEmptyValues = true)) === AttributeValue.NULL(true))
  }

  test("ConverterOptions: wrapNumbers") {
    trait NumberValue extends js.Object {
      var wrapperName: String
      var value: String
    }

    val source = AttributeValue.NFromInt(42)
    assert(DynamoDBConverter.output(source) === 42)
    val wrapped = DynamoDBConverter.output(source, DynamoDBConverterOptions(wrapNumbers = true)).asInstanceOf[NumberValue]
    assert(wrapped.wrapperName === "NumberValue")
    assert(wrapped.value === "42")
  }
}
