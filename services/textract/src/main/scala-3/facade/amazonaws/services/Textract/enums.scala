package facade.amazonaws.services.textract

import scalajs._

type BlockType = "KEY_VALUE_SET" | "PAGE" | "LINE" | "WORD" | "TABLE" | "CELL" | "SELECTION_ELEMENT"
object BlockType {
  inline val KEY_VALUE_SET: "KEY_VALUE_SET" = "KEY_VALUE_SET"
  inline val PAGE: "PAGE" = "PAGE"
  inline val LINE: "LINE" = "LINE"
  inline val WORD: "WORD" = "WORD"
  inline val TABLE: "TABLE" = "TABLE"
  inline val CELL: "CELL" = "CELL"
  inline val SELECTION_ELEMENT: "SELECTION_ELEMENT" = "SELECTION_ELEMENT"

  inline def values: js.Array[BlockType] = js.Array(KEY_VALUE_SET, PAGE, LINE, WORD, TABLE, CELL, SELECTION_ELEMENT)
}

type ContentClassifier = "FreeOfPersonallyIdentifiableInformation" | "FreeOfAdultContent"
object ContentClassifier {
  inline val FreeOfPersonallyIdentifiableInformation: "FreeOfPersonallyIdentifiableInformation" = "FreeOfPersonallyIdentifiableInformation"
  inline val FreeOfAdultContent: "FreeOfAdultContent" = "FreeOfAdultContent"

  inline def values: js.Array[ContentClassifier] = js.Array(FreeOfPersonallyIdentifiableInformation, FreeOfAdultContent)
}

type EntityType = "KEY" | "VALUE"
object EntityType {
  inline val KEY: "KEY" = "KEY"
  inline val VALUE: "VALUE" = "VALUE"

  inline def values: js.Array[EntityType] = js.Array(KEY, VALUE)
}

type FeatureType = "TABLES" | "FORMS"
object FeatureType {
  inline val TABLES: "TABLES" = "TABLES"
  inline val FORMS: "FORMS" = "FORMS"

  inline def values: js.Array[FeatureType] = js.Array(TABLES, FORMS)
}

type JobStatus = "IN_PROGRESS" | "SUCCEEDED" | "FAILED" | "PARTIAL_SUCCESS"
object JobStatus {
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val PARTIAL_SUCCESS: "PARTIAL_SUCCESS" = "PARTIAL_SUCCESS"

  inline def values: js.Array[JobStatus] = js.Array(IN_PROGRESS, SUCCEEDED, FAILED, PARTIAL_SUCCESS)
}

type RelationshipType = "VALUE" | "CHILD" | "COMPLEX_FEATURES"
object RelationshipType {
  inline val VALUE: "VALUE" = "VALUE"
  inline val CHILD: "CHILD" = "CHILD"
  inline val COMPLEX_FEATURES: "COMPLEX_FEATURES" = "COMPLEX_FEATURES"

  inline def values: js.Array[RelationshipType] = js.Array(VALUE, CHILD, COMPLEX_FEATURES)
}

type SelectionStatus = "SELECTED" | "NOT_SELECTED"
object SelectionStatus {
  inline val SELECTED: "SELECTED" = "SELECTED"
  inline val NOT_SELECTED: "NOT_SELECTED" = "NOT_SELECTED"

  inline def values: js.Array[SelectionStatus] = js.Array(SELECTED, NOT_SELECTED)
}

type TextType = "HANDWRITING" | "PRINTED"
object TextType {
  inline val HANDWRITING: "HANDWRITING" = "HANDWRITING"
  inline val PRINTED: "PRINTED" = "PRINTED"

  inline def values: js.Array[TextType] = js.Array(HANDWRITING, PRINTED)
}
