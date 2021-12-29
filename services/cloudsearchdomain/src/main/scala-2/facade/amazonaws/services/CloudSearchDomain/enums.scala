package facade.amazonaws.services.cloudsearchdomain

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait ContentType extends js.Any
object ContentType {
  val `application/json` = "application/json".asInstanceOf[ContentType]
  val `application/xml` = "application/xml".asInstanceOf[ContentType]

  @inline def values = js.Array(`application/json`, `application/xml`)
}

@js.native
sealed trait QueryParser extends js.Any
object QueryParser {
  val simple = "simple".asInstanceOf[QueryParser]
  val structured = "structured".asInstanceOf[QueryParser]
  val lucene = "lucene".asInstanceOf[QueryParser]
  val dismax = "dismax".asInstanceOf[QueryParser]

  @inline def values = js.Array(simple, structured, lucene, dismax)
}

