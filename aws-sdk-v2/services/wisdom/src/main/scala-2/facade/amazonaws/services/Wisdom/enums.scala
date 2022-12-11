package facade.amazonaws.services.wisdom

import scalajs.js

@js.native
sealed trait AssistantStatus extends js.Any
object AssistantStatus {
  val CREATE_IN_PROGRESS = "CREATE_IN_PROGRESS".asInstanceOf[AssistantStatus]
  val CREATE_FAILED = "CREATE_FAILED".asInstanceOf[AssistantStatus]
  val ACTIVE = "ACTIVE".asInstanceOf[AssistantStatus]
  val DELETE_IN_PROGRESS = "DELETE_IN_PROGRESS".asInstanceOf[AssistantStatus]
  val DELETE_FAILED = "DELETE_FAILED".asInstanceOf[AssistantStatus]
  val DELETED = "DELETED".asInstanceOf[AssistantStatus]

  @inline def values: js.Array[AssistantStatus] = js.Array(CREATE_IN_PROGRESS, CREATE_FAILED, ACTIVE, DELETE_IN_PROGRESS, DELETE_FAILED, DELETED)
}

@js.native
sealed trait AssistantType extends js.Any
object AssistantType {
  val AGENT = "AGENT".asInstanceOf[AssistantType]

  @inline def values: js.Array[AssistantType] = js.Array(AGENT)
}

@js.native
sealed trait AssociationType extends js.Any
object AssociationType {
  val KNOWLEDGE_BASE = "KNOWLEDGE_BASE".asInstanceOf[AssociationType]

  @inline def values: js.Array[AssociationType] = js.Array(KNOWLEDGE_BASE)
}

@js.native
sealed trait ContentStatus extends js.Any
object ContentStatus {
  val CREATE_IN_PROGRESS = "CREATE_IN_PROGRESS".asInstanceOf[ContentStatus]
  val CREATE_FAILED = "CREATE_FAILED".asInstanceOf[ContentStatus]
  val ACTIVE = "ACTIVE".asInstanceOf[ContentStatus]
  val DELETE_IN_PROGRESS = "DELETE_IN_PROGRESS".asInstanceOf[ContentStatus]
  val DELETE_FAILED = "DELETE_FAILED".asInstanceOf[ContentStatus]
  val DELETED = "DELETED".asInstanceOf[ContentStatus]
  val UPDATE_FAILED = "UPDATE_FAILED".asInstanceOf[ContentStatus]

  @inline def values: js.Array[ContentStatus] = js.Array(CREATE_IN_PROGRESS, CREATE_FAILED, ACTIVE, DELETE_IN_PROGRESS, DELETE_FAILED, DELETED, UPDATE_FAILED)
}

@js.native
sealed trait FilterField extends js.Any
object FilterField {
  val NAME = "NAME".asInstanceOf[FilterField]

  @inline def values: js.Array[FilterField] = js.Array(NAME)
}

@js.native
sealed trait FilterOperator extends js.Any
object FilterOperator {
  val EQUALS = "EQUALS".asInstanceOf[FilterOperator]

  @inline def values: js.Array[FilterOperator] = js.Array(EQUALS)
}

@js.native
sealed trait KnowledgeBaseStatus extends js.Any
object KnowledgeBaseStatus {
  val CREATE_IN_PROGRESS = "CREATE_IN_PROGRESS".asInstanceOf[KnowledgeBaseStatus]
  val CREATE_FAILED = "CREATE_FAILED".asInstanceOf[KnowledgeBaseStatus]
  val ACTIVE = "ACTIVE".asInstanceOf[KnowledgeBaseStatus]
  val DELETE_IN_PROGRESS = "DELETE_IN_PROGRESS".asInstanceOf[KnowledgeBaseStatus]
  val DELETE_FAILED = "DELETE_FAILED".asInstanceOf[KnowledgeBaseStatus]
  val DELETED = "DELETED".asInstanceOf[KnowledgeBaseStatus]

  @inline def values: js.Array[KnowledgeBaseStatus] = js.Array(CREATE_IN_PROGRESS, CREATE_FAILED, ACTIVE, DELETE_IN_PROGRESS, DELETE_FAILED, DELETED)
}

@js.native
sealed trait KnowledgeBaseType extends js.Any
object KnowledgeBaseType {
  val EXTERNAL = "EXTERNAL".asInstanceOf[KnowledgeBaseType]
  val CUSTOM = "CUSTOM".asInstanceOf[KnowledgeBaseType]

  @inline def values: js.Array[KnowledgeBaseType] = js.Array(EXTERNAL, CUSTOM)
}

@js.native
sealed trait RecommendationSourceType extends js.Any
object RecommendationSourceType {
  val ISSUE_DETECTION = "ISSUE_DETECTION".asInstanceOf[RecommendationSourceType]
  val RULE_EVALUATION = "RULE_EVALUATION".asInstanceOf[RecommendationSourceType]
  val OTHER = "OTHER".asInstanceOf[RecommendationSourceType]

  @inline def values: js.Array[RecommendationSourceType] = js.Array(ISSUE_DETECTION, RULE_EVALUATION, OTHER)
}

@js.native
sealed trait RecommendationTriggerType extends js.Any
object RecommendationTriggerType {
  val QUERY = "QUERY".asInstanceOf[RecommendationTriggerType]

  @inline def values: js.Array[RecommendationTriggerType] = js.Array(QUERY)
}

@js.native
sealed trait RecommendationType extends js.Any
object RecommendationType {
  val KNOWLEDGE_CONTENT = "KNOWLEDGE_CONTENT".asInstanceOf[RecommendationType]

  @inline def values: js.Array[RecommendationType] = js.Array(KNOWLEDGE_CONTENT)
}

@js.native
sealed trait RelevanceLevel extends js.Any
object RelevanceLevel {
  val HIGH = "HIGH".asInstanceOf[RelevanceLevel]
  val MEDIUM = "MEDIUM".asInstanceOf[RelevanceLevel]
  val LOW = "LOW".asInstanceOf[RelevanceLevel]

  @inline def values: js.Array[RelevanceLevel] = js.Array(HIGH, MEDIUM, LOW)
}
