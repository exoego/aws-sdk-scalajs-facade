package facade.amazonaws.services.textract

import scalajs.js

type BlockType = "KEY_VALUE_SET" | "PAGE" | "LINE" | "WORD" | "TABLE" | "CELL" | "SELECTION_ELEMENT" | "MERGED_CELL" | "TITLE" | "QUERY" | "QUERY_RESULT" | "SIGNATURE"
object BlockType {
  inline val KEY_VALUE_SET: "KEY_VALUE_SET" = "KEY_VALUE_SET"
  inline val PAGE: "PAGE" = "PAGE"
  inline val LINE: "LINE" = "LINE"
  inline val WORD: "WORD" = "WORD"
  inline val TABLE: "TABLE" = "TABLE"
  inline val CELL: "CELL" = "CELL"
  inline val SELECTION_ELEMENT: "SELECTION_ELEMENT" = "SELECTION_ELEMENT"
  inline val MERGED_CELL: "MERGED_CELL" = "MERGED_CELL"
  inline val TITLE: "TITLE" = "TITLE"
  inline val QUERY: "QUERY" = "QUERY"
  inline val QUERY_RESULT: "QUERY_RESULT" = "QUERY_RESULT"
  inline val SIGNATURE: "SIGNATURE" = "SIGNATURE"

  inline def values: js.Array[BlockType] = js.Array(KEY_VALUE_SET, PAGE, LINE, WORD, TABLE, CELL, SELECTION_ELEMENT, MERGED_CELL, TITLE, QUERY, QUERY_RESULT, SIGNATURE)
}

type ContentClassifier = "FreeOfPersonallyIdentifiableInformation" | "FreeOfAdultContent"
object ContentClassifier {
  inline val FreeOfPersonallyIdentifiableInformation: "FreeOfPersonallyIdentifiableInformation" = "FreeOfPersonallyIdentifiableInformation"
  inline val FreeOfAdultContent: "FreeOfAdultContent" = "FreeOfAdultContent"

  inline def values: js.Array[ContentClassifier] = js.Array(FreeOfPersonallyIdentifiableInformation, FreeOfAdultContent)
}

type EntityType = "KEY" | "VALUE" | "COLUMN_HEADER"
object EntityType {
  inline val KEY: "KEY" = "KEY"
  inline val VALUE: "VALUE" = "VALUE"
  inline val COLUMN_HEADER: "COLUMN_HEADER" = "COLUMN_HEADER"

  inline def values: js.Array[EntityType] = js.Array(KEY, VALUE, COLUMN_HEADER)
}

type FeatureType = "TABLES" | "FORMS" | "QUERIES" | "SIGNATURES"
object FeatureType {
  inline val TABLES: "TABLES" = "TABLES"
  inline val FORMS: "FORMS" = "FORMS"
  inline val QUERIES: "QUERIES" = "QUERIES"
  inline val SIGNATURES: "SIGNATURES" = "SIGNATURES"

  inline def values: js.Array[FeatureType] = js.Array(TABLES, FORMS, QUERIES, SIGNATURES)
}

type JobStatus = "IN_PROGRESS" | "SUCCEEDED" | "FAILED" | "PARTIAL_SUCCESS"
object JobStatus {
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val PARTIAL_SUCCESS: "PARTIAL_SUCCESS" = "PARTIAL_SUCCESS"

  inline def values: js.Array[JobStatus] = js.Array(IN_PROGRESS, SUCCEEDED, FAILED, PARTIAL_SUCCESS)
}

type RelationshipType = "VALUE" | "CHILD" | "COMPLEX_FEATURES" | "MERGED_CELL" | "TITLE" | "ANSWER"
object RelationshipType {
  inline val VALUE: "VALUE" = "VALUE"
  inline val CHILD: "CHILD" = "CHILD"
  inline val COMPLEX_FEATURES: "COMPLEX_FEATURES" = "COMPLEX_FEATURES"
  inline val MERGED_CELL: "MERGED_CELL" = "MERGED_CELL"
  inline val TITLE: "TITLE" = "TITLE"
  inline val ANSWER: "ANSWER" = "ANSWER"

  inline def values: js.Array[RelationshipType] = js.Array(VALUE, CHILD, COMPLEX_FEATURES, MERGED_CELL, TITLE, ANSWER)
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

type ValueType = "DATE"
object ValueType {
  inline val DATE: "DATE" = "DATE"

  inline def values: js.Array[ValueType] = js.Array(DATE)
}
