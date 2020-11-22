package facade.amazonaws

import org.scalatest.funsuite.AnyFunSuite

class CoreTest extends AnyFunSuite {
  test("AWS Object is defined") {
    assert(AWS.config !== null)
  }
}
