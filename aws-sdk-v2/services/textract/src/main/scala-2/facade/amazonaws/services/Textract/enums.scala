package facade.amazonaws.services.textract

import scalajs.js

@js.native
sealed trait BlockType extends js.Any
object BlockType {
  val KEY_VALUE_SET = "KEY_VALUE_SET".asInstanceOf[BlockType]
  val PAGE = "PAGE".asInstanceOf[BlockType]
  val LINE = "LINE".asInstanceOf[BlockType]
  val WORD = "WORD".asInstanceOf[BlockType]
  val TABLE = "TABLE".asInstanceOf[BlockType]
  val CELL = "CELL".asInstanceOf[BlockType]
  val SELECTION_ELEMENT = "SELECTION_ELEMENT".asInstanceOf[BlockType]

  @inline def values: js.Array[BlockType] = js.Array(KEY_VALUE_SET, PAGE, LINE, WORD, TABLE, CELL, SELECTION_ELEMENT)
}

@js.native
sealed trait ContentClassifier extends js.Any
object ContentClassifier {
  val FreeOfPersonallyIdentifiableInformation = "FreeOfPersonallyIdentifiableInformation".asInstanceOf[ContentClassifier]
  val FreeOfAdultContent = "FreeOfAdultContent".asInstanceOf[ContentClassifier]

  @inline def values: js.Array[ContentClassifier] = js.Array(FreeOfPersonallyIdentifiableInformation, FreeOfAdultContent)
}

@js.native
sealed trait EntityType extends js.Any
object EntityType {
  val KEY = "KEY".asInstanceOf[EntityType]
  val VALUE = "VALUE".asInstanceOf[EntityType]

  @inline def values: js.Array[EntityType] = js.Array(KEY, VALUE)
}

@js.native
sealed trait FeatureType extends js.Any
object FeatureType {
  val TABLES = "TABLES".asInstanceOf[FeatureType]
  val FORMS = "FORMS".asInstanceOf[FeatureType]

  @inline def values: js.Array[FeatureType] = js.Array(TABLES, FORMS)
}

@js.native
sealed trait JobStatus extends js.Any
object JobStatus {
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[JobStatus]
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[JobStatus]
  val FAILED = "FAILED".asInstanceOf[JobStatus]
  val PARTIAL_SUCCESS = "PARTIAL_SUCCESS".asInstanceOf[JobStatus]

  @inline def values: js.Array[JobStatus] = js.Array(IN_PROGRESS, SUCCEEDED, FAILED, PARTIAL_SUCCESS)
}

@js.native
sealed trait RelationshipType extends js.Any
object RelationshipType {
  val VALUE = "VALUE".asInstanceOf[RelationshipType]
  val CHILD = "CHILD".asInstanceOf[RelationshipType]
  val COMPLEX_FEATURES = "COMPLEX_FEATURES".asInstanceOf[RelationshipType]

  @inline def values: js.Array[RelationshipType] = js.Array(VALUE, CHILD, COMPLEX_FEATURES)
}

@js.native
sealed trait SelectionStatus extends js.Any
object SelectionStatus {
  val SELECTED = "SELECTED".asInstanceOf[SelectionStatus]
  val NOT_SELECTED = "NOT_SELECTED".asInstanceOf[SelectionStatus]

  @inline def values: js.Array[SelectionStatus] = js.Array(SELECTED, NOT_SELECTED)
}

@js.native
sealed trait TextType extends js.Any
object TextType {
  val HANDWRITING = "HANDWRITING".asInstanceOf[TextType]
  val PRINTED = "PRINTED".asInstanceOf[TextType]

  @inline def values: js.Array[TextType] = js.Array(HANDWRITING, PRINTED)
}

@js.native
sealed trait ValueType extends js.Any
object ValueType {
  val DATE = "DATE".asInstanceOf[ValueType]

  @inline def values: js.Array[ValueType] = js.Array(DATE)
}
