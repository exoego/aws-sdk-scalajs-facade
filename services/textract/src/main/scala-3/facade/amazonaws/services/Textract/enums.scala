package facade.amazonaws.services.textract

import scalajs._

type BlockType = "KEY_VALUE_SET" | "PAGE" | "LINE" | "WORD" | "TABLE" | "CELL" | "SELECTION_ELEMENT"
object BlockType {
  val KEY_VALUE_SET: "KEY_VALUE_SET" = "KEY_VALUE_SET"
  val PAGE: "PAGE" = "PAGE"
  val LINE: "LINE" = "LINE"
  val WORD: "WORD" = "WORD"
  val TABLE: "TABLE" = "TABLE"
  val CELL: "CELL" = "CELL"
  val SELECTION_ELEMENT: "SELECTION_ELEMENT" = "SELECTION_ELEMENT"

  @inline def values = js.Array[BlockType](KEY_VALUE_SET, PAGE, LINE, WORD, TABLE, CELL, SELECTION_ELEMENT)
}

type ContentClassifier = "FreeOfPersonallyIdentifiableInformation" | "FreeOfAdultContent"
object ContentClassifier {
  val FreeOfPersonallyIdentifiableInformation: "FreeOfPersonallyIdentifiableInformation" = "FreeOfPersonallyIdentifiableInformation"
  val FreeOfAdultContent: "FreeOfAdultContent" = "FreeOfAdultContent"

  @inline def values = js.Array[ContentClassifier](FreeOfPersonallyIdentifiableInformation, FreeOfAdultContent)
}

type EntityType = "KEY" | "VALUE"
object EntityType {
  val KEY: "KEY" = "KEY"
  val VALUE: "VALUE" = "VALUE"

  @inline def values = js.Array[EntityType](KEY, VALUE)
}

type FeatureType = "TABLES" | "FORMS"
object FeatureType {
  val TABLES: "TABLES" = "TABLES"
  val FORMS: "FORMS" = "FORMS"

  @inline def values = js.Array[FeatureType](TABLES, FORMS)
}

type JobStatus = "IN_PROGRESS" | "SUCCEEDED" | "FAILED" | "PARTIAL_SUCCESS"
object JobStatus {
  val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  val FAILED: "FAILED" = "FAILED"
  val PARTIAL_SUCCESS: "PARTIAL_SUCCESS" = "PARTIAL_SUCCESS"

  @inline def values = js.Array[JobStatus](IN_PROGRESS, SUCCEEDED, FAILED, PARTIAL_SUCCESS)
}

type RelationshipType = "VALUE" | "CHILD" | "COMPLEX_FEATURES"
object RelationshipType {
  val VALUE: "VALUE" = "VALUE"
  val CHILD: "CHILD" = "CHILD"
  val COMPLEX_FEATURES: "COMPLEX_FEATURES" = "COMPLEX_FEATURES"

  @inline def values = js.Array[RelationshipType](VALUE, CHILD, COMPLEX_FEATURES)
}

type SelectionStatus = "SELECTED" | "NOT_SELECTED"
object SelectionStatus {
  val SELECTED: "SELECTED" = "SELECTED"
  val NOT_SELECTED: "NOT_SELECTED" = "NOT_SELECTED"

  @inline def values = js.Array[SelectionStatus](SELECTED, NOT_SELECTED)
}

type TextType = "HANDWRITING" | "PRINTED"
object TextType {
  val HANDWRITING: "HANDWRITING" = "HANDWRITING"
  val PRINTED: "PRINTED" = "PRINTED"

  @inline def values = js.Array[TextType](HANDWRITING, PRINTED)
}
