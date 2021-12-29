package facade.amazonaws.services.cloudsearchdomain

import scalajs._

type ContentType = "application/json" | "application/xml"
object ContentType {
  inline val `application/json`: "application/json" = "application/json"
  inline val `application/xml`: "application/xml" = "application/xml"

  inline def values: js.Array[ContentType] = js.Array(`application/json`, `application/xml`)
}

type QueryParser = "simple" | "structured" | "lucene" | "dismax"
object QueryParser {
  inline val simple: "simple" = "simple"
  inline val structured: "structured" = "structured"
  inline val lucene: "lucene" = "lucene"
  inline val dismax: "dismax" = "dismax"

  inline def values: js.Array[QueryParser] = js.Array(simple, structured, lucene, dismax)
}
