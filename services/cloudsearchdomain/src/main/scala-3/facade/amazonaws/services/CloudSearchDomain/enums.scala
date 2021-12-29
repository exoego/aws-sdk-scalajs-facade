package facade.amazonaws.services.cloudsearchdomain

import scalajs._

type ContentType = "application/json" | "application/xml"
object ContentType {
  val `application/json`: "application/json" = "application/json"
  val `application/xml`: "application/xml" = "application/xml"

  @inline def values = js.Array[ContentType](`application/json`, `application/xml`)
}

type QueryParser = "simple" | "structured" | "lucene" | "dismax"
object QueryParser {
  val simple: "simple" = "simple"
  val structured: "structured" = "structured"
  val lucene: "lucene" = "lucene"
  val dismax: "dismax" = "dismax"

  @inline def values = js.Array[QueryParser](simple, structured, lucene, dismax)
}
