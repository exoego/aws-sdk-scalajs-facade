package facade.amazonaws.services.wisdom

import scalajs.js

type AssistantStatus = "CREATE_IN_PROGRESS" | "CREATE_FAILED" | "ACTIVE" | "DELETE_IN_PROGRESS" | "DELETE_FAILED" | "DELETED"
object AssistantStatus {
  inline val CREATE_IN_PROGRESS: "CREATE_IN_PROGRESS" = "CREATE_IN_PROGRESS"
  inline val CREATE_FAILED: "CREATE_FAILED" = "CREATE_FAILED"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val DELETE_IN_PROGRESS: "DELETE_IN_PROGRESS" = "DELETE_IN_PROGRESS"
  inline val DELETE_FAILED: "DELETE_FAILED" = "DELETE_FAILED"
  inline val DELETED: "DELETED" = "DELETED"

  inline def values: js.Array[AssistantStatus] = js.Array(CREATE_IN_PROGRESS, CREATE_FAILED, ACTIVE, DELETE_IN_PROGRESS, DELETE_FAILED, DELETED)
}

type AssistantType = "AGENT"
object AssistantType {
  inline val AGENT: "AGENT" = "AGENT"

  inline def values: js.Array[AssistantType] = js.Array(AGENT)
}

type AssociationType = "KNOWLEDGE_BASE"
object AssociationType {
  inline val KNOWLEDGE_BASE: "KNOWLEDGE_BASE" = "KNOWLEDGE_BASE"

  inline def values: js.Array[AssociationType] = js.Array(KNOWLEDGE_BASE)
}

type ContentStatus = "CREATE_IN_PROGRESS" | "CREATE_FAILED" | "ACTIVE" | "DELETE_IN_PROGRESS" | "DELETE_FAILED" | "DELETED" | "UPDATE_FAILED"
object ContentStatus {
  inline val CREATE_IN_PROGRESS: "CREATE_IN_PROGRESS" = "CREATE_IN_PROGRESS"
  inline val CREATE_FAILED: "CREATE_FAILED" = "CREATE_FAILED"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val DELETE_IN_PROGRESS: "DELETE_IN_PROGRESS" = "DELETE_IN_PROGRESS"
  inline val DELETE_FAILED: "DELETE_FAILED" = "DELETE_FAILED"
  inline val DELETED: "DELETED" = "DELETED"
  inline val UPDATE_FAILED: "UPDATE_FAILED" = "UPDATE_FAILED"

  inline def values: js.Array[ContentStatus] = js.Array(CREATE_IN_PROGRESS, CREATE_FAILED, ACTIVE, DELETE_IN_PROGRESS, DELETE_FAILED, DELETED, UPDATE_FAILED)
}

type FilterField = "NAME"
object FilterField {
  inline val NAME: "NAME" = "NAME"

  inline def values: js.Array[FilterField] = js.Array(NAME)
}

type FilterOperator = "EQUALS"
object FilterOperator {
  inline val EQUALS: "EQUALS" = "EQUALS"

  inline def values: js.Array[FilterOperator] = js.Array(EQUALS)
}

type KnowledgeBaseStatus = "CREATE_IN_PROGRESS" | "CREATE_FAILED" | "ACTIVE" | "DELETE_IN_PROGRESS" | "DELETE_FAILED" | "DELETED"
object KnowledgeBaseStatus {
  inline val CREATE_IN_PROGRESS: "CREATE_IN_PROGRESS" = "CREATE_IN_PROGRESS"
  inline val CREATE_FAILED: "CREATE_FAILED" = "CREATE_FAILED"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val DELETE_IN_PROGRESS: "DELETE_IN_PROGRESS" = "DELETE_IN_PROGRESS"
  inline val DELETE_FAILED: "DELETE_FAILED" = "DELETE_FAILED"
  inline val DELETED: "DELETED" = "DELETED"

  inline def values: js.Array[KnowledgeBaseStatus] = js.Array(CREATE_IN_PROGRESS, CREATE_FAILED, ACTIVE, DELETE_IN_PROGRESS, DELETE_FAILED, DELETED)
}

type KnowledgeBaseType = "EXTERNAL" | "CUSTOM"
object KnowledgeBaseType {
  inline val EXTERNAL: "EXTERNAL" = "EXTERNAL"
  inline val CUSTOM: "CUSTOM" = "CUSTOM"

  inline def values: js.Array[KnowledgeBaseType] = js.Array(EXTERNAL, CUSTOM)
}

type RecommendationSourceType = "ISSUE_DETECTION" | "RULE_EVALUATION" | "OTHER"
object RecommendationSourceType {
  inline val ISSUE_DETECTION: "ISSUE_DETECTION" = "ISSUE_DETECTION"
  inline val RULE_EVALUATION: "RULE_EVALUATION" = "RULE_EVALUATION"
  inline val OTHER: "OTHER" = "OTHER"

  inline def values: js.Array[RecommendationSourceType] = js.Array(ISSUE_DETECTION, RULE_EVALUATION, OTHER)
}

type RecommendationTriggerType = "QUERY"
object RecommendationTriggerType {
  inline val QUERY: "QUERY" = "QUERY"

  inline def values: js.Array[RecommendationTriggerType] = js.Array(QUERY)
}

type RecommendationType = "KNOWLEDGE_CONTENT"
object RecommendationType {
  inline val KNOWLEDGE_CONTENT: "KNOWLEDGE_CONTENT" = "KNOWLEDGE_CONTENT"

  inline def values: js.Array[RecommendationType] = js.Array(KNOWLEDGE_CONTENT)
}

type RelevanceLevel = "HIGH" | "MEDIUM" | "LOW"
object RelevanceLevel {
  inline val HIGH: "HIGH" = "HIGH"
  inline val MEDIUM: "MEDIUM" = "MEDIUM"
  inline val LOW: "LOW" = "LOW"

  inline def values: js.Array[RelevanceLevel] = js.Array(HIGH, MEDIUM, LOW)
}
