package facade.amazonaws.services.kendra

import scalajs._

type AdditionalResultAttributeValueType = "TEXT_WITH_HIGHLIGHTS_VALUE"
object AdditionalResultAttributeValueType {
  inline val TEXT_WITH_HIGHLIGHTS_VALUE: "TEXT_WITH_HIGHLIGHTS_VALUE" = "TEXT_WITH_HIGHLIGHTS_VALUE"

  inline def values: js.Array[AdditionalResultAttributeValueType] = js.Array(TEXT_WITH_HIGHLIGHTS_VALUE)
}

type ConfluenceAttachmentFieldName = "AUTHOR" | "CONTENT_TYPE" | "CREATED_DATE" | "DISPLAY_URL" | "FILE_SIZE" | "ITEM_TYPE" | "PARENT_ID" | "SPACE_KEY" | "SPACE_NAME" | "URL" | "VERSION"
object ConfluenceAttachmentFieldName {
  inline val AUTHOR: "AUTHOR" = "AUTHOR"
  inline val CONTENT_TYPE: "CONTENT_TYPE" = "CONTENT_TYPE"
  inline val CREATED_DATE: "CREATED_DATE" = "CREATED_DATE"
  inline val DISPLAY_URL: "DISPLAY_URL" = "DISPLAY_URL"
  inline val FILE_SIZE: "FILE_SIZE" = "FILE_SIZE"
  inline val ITEM_TYPE: "ITEM_TYPE" = "ITEM_TYPE"
  inline val PARENT_ID: "PARENT_ID" = "PARENT_ID"
  inline val SPACE_KEY: "SPACE_KEY" = "SPACE_KEY"
  inline val SPACE_NAME: "SPACE_NAME" = "SPACE_NAME"
  inline val URL: "URL" = "URL"
  inline val VERSION: "VERSION" = "VERSION"

  inline def values: js.Array[ConfluenceAttachmentFieldName] = js.Array(AUTHOR, CONTENT_TYPE, CREATED_DATE, DISPLAY_URL, FILE_SIZE, ITEM_TYPE, PARENT_ID, SPACE_KEY, SPACE_NAME, URL, VERSION)
}

type ConfluenceBlogFieldName = "AUTHOR" | "DISPLAY_URL" | "ITEM_TYPE" | "LABELS" | "PUBLISH_DATE" | "SPACE_KEY" | "SPACE_NAME" | "URL" | "VERSION"
object ConfluenceBlogFieldName {
  inline val AUTHOR: "AUTHOR" = "AUTHOR"
  inline val DISPLAY_URL: "DISPLAY_URL" = "DISPLAY_URL"
  inline val ITEM_TYPE: "ITEM_TYPE" = "ITEM_TYPE"
  inline val LABELS: "LABELS" = "LABELS"
  inline val PUBLISH_DATE: "PUBLISH_DATE" = "PUBLISH_DATE"
  inline val SPACE_KEY: "SPACE_KEY" = "SPACE_KEY"
  inline val SPACE_NAME: "SPACE_NAME" = "SPACE_NAME"
  inline val URL: "URL" = "URL"
  inline val VERSION: "VERSION" = "VERSION"

  inline def values: js.Array[ConfluenceBlogFieldName] = js.Array(AUTHOR, DISPLAY_URL, ITEM_TYPE, LABELS, PUBLISH_DATE, SPACE_KEY, SPACE_NAME, URL, VERSION)
}

type ConfluencePageFieldName = "AUTHOR" | "CONTENT_STATUS" | "CREATED_DATE" | "DISPLAY_URL" | "ITEM_TYPE" | "LABELS" | "MODIFIED_DATE" | "PARENT_ID" | "SPACE_KEY" | "SPACE_NAME" | "URL" | "VERSION"
object ConfluencePageFieldName {
  inline val AUTHOR: "AUTHOR" = "AUTHOR"
  inline val CONTENT_STATUS: "CONTENT_STATUS" = "CONTENT_STATUS"
  inline val CREATED_DATE: "CREATED_DATE" = "CREATED_DATE"
  inline val DISPLAY_URL: "DISPLAY_URL" = "DISPLAY_URL"
  inline val ITEM_TYPE: "ITEM_TYPE" = "ITEM_TYPE"
  inline val LABELS: "LABELS" = "LABELS"
  inline val MODIFIED_DATE: "MODIFIED_DATE" = "MODIFIED_DATE"
  inline val PARENT_ID: "PARENT_ID" = "PARENT_ID"
  inline val SPACE_KEY: "SPACE_KEY" = "SPACE_KEY"
  inline val SPACE_NAME: "SPACE_NAME" = "SPACE_NAME"
  inline val URL: "URL" = "URL"
  inline val VERSION: "VERSION" = "VERSION"

  inline def values: js.Array[ConfluencePageFieldName] = js.Array(AUTHOR, CONTENT_STATUS, CREATED_DATE, DISPLAY_URL, ITEM_TYPE, LABELS, MODIFIED_DATE, PARENT_ID, SPACE_KEY, SPACE_NAME, URL, VERSION)
}

type ConfluenceSpaceFieldName = "DISPLAY_URL" | "ITEM_TYPE" | "SPACE_KEY" | "URL"
object ConfluenceSpaceFieldName {
  inline val DISPLAY_URL: "DISPLAY_URL" = "DISPLAY_URL"
  inline val ITEM_TYPE: "ITEM_TYPE" = "ITEM_TYPE"
  inline val SPACE_KEY: "SPACE_KEY" = "SPACE_KEY"
  inline val URL: "URL" = "URL"

  inline def values: js.Array[ConfluenceSpaceFieldName] = js.Array(DISPLAY_URL, ITEM_TYPE, SPACE_KEY, URL)
}

type ConfluenceVersion = "CLOUD" | "SERVER"
object ConfluenceVersion {
  inline val CLOUD: "CLOUD" = "CLOUD"
  inline val SERVER: "SERVER" = "SERVER"

  inline def values: js.Array[ConfluenceVersion] = js.Array(CLOUD, SERVER)
}

type ContentType = "PDF" | "HTML" | "MS_WORD" | "PLAIN_TEXT" | "PPT"
object ContentType {
  inline val PDF: "PDF" = "PDF"
  inline val HTML: "HTML" = "HTML"
  inline val MS_WORD: "MS_WORD" = "MS_WORD"
  inline val PLAIN_TEXT: "PLAIN_TEXT" = "PLAIN_TEXT"
  inline val PPT: "PPT" = "PPT"

  inline def values: js.Array[ContentType] = js.Array(PDF, HTML, MS_WORD, PLAIN_TEXT, PPT)
}

type DataSourceStatus = "CREATING" | "DELETING" | "FAILED" | "UPDATING" | "ACTIVE"
object DataSourceStatus {
  inline val CREATING: "CREATING" = "CREATING"
  inline val DELETING: "DELETING" = "DELETING"
  inline val FAILED: "FAILED" = "FAILED"
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"

  inline def values: js.Array[DataSourceStatus] = js.Array(CREATING, DELETING, FAILED, UPDATING, ACTIVE)
}

type DataSourceSyncJobStatus = "FAILED" | "SUCCEEDED" | "SYNCING" | "INCOMPLETE" | "STOPPING" | "ABORTED" | "SYNCING_INDEXING"
object DataSourceSyncJobStatus {
  inline val FAILED: "FAILED" = "FAILED"
  inline val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  inline val SYNCING: "SYNCING" = "SYNCING"
  inline val INCOMPLETE: "INCOMPLETE" = "INCOMPLETE"
  inline val STOPPING: "STOPPING" = "STOPPING"
  inline val ABORTED: "ABORTED" = "ABORTED"
  inline val SYNCING_INDEXING: "SYNCING_INDEXING" = "SYNCING_INDEXING"

  inline def values: js.Array[DataSourceSyncJobStatus] = js.Array(FAILED, SUCCEEDED, SYNCING, INCOMPLETE, STOPPING, ABORTED, SYNCING_INDEXING)
}

type DataSourceType = "S3" | "SHAREPOINT" | "DATABASE" | "SALESFORCE" | "ONEDRIVE" | "SERVICENOW" | "CUSTOM" | "CONFLUENCE" | "GOOGLEDRIVE"
object DataSourceType {
  inline val S3: "S3" = "S3"
  inline val SHAREPOINT: "SHAREPOINT" = "SHAREPOINT"
  inline val DATABASE: "DATABASE" = "DATABASE"
  inline val SALESFORCE: "SALESFORCE" = "SALESFORCE"
  inline val ONEDRIVE: "ONEDRIVE" = "ONEDRIVE"
  inline val SERVICENOW: "SERVICENOW" = "SERVICENOW"
  inline val CUSTOM: "CUSTOM" = "CUSTOM"
  inline val CONFLUENCE: "CONFLUENCE" = "CONFLUENCE"
  inline val GOOGLEDRIVE: "GOOGLEDRIVE" = "GOOGLEDRIVE"

  inline def values: js.Array[DataSourceType] = js.Array(S3, SHAREPOINT, DATABASE, SALESFORCE, ONEDRIVE, SERVICENOW, CUSTOM, CONFLUENCE, GOOGLEDRIVE)
}

type DatabaseEngineType = "RDS_AURORA_MYSQL" | "RDS_AURORA_POSTGRESQL" | "RDS_MYSQL" | "RDS_POSTGRESQL"
object DatabaseEngineType {
  inline val RDS_AURORA_MYSQL: "RDS_AURORA_MYSQL" = "RDS_AURORA_MYSQL"
  inline val RDS_AURORA_POSTGRESQL: "RDS_AURORA_POSTGRESQL" = "RDS_AURORA_POSTGRESQL"
  inline val RDS_MYSQL: "RDS_MYSQL" = "RDS_MYSQL"
  inline val RDS_POSTGRESQL: "RDS_POSTGRESQL" = "RDS_POSTGRESQL"

  inline def values: js.Array[DatabaseEngineType] = js.Array(RDS_AURORA_MYSQL, RDS_AURORA_POSTGRESQL, RDS_MYSQL, RDS_POSTGRESQL)
}

type DocumentAttributeValueType = "STRING_VALUE" | "STRING_LIST_VALUE" | "LONG_VALUE" | "DATE_VALUE"
object DocumentAttributeValueType {
  inline val STRING_VALUE: "STRING_VALUE" = "STRING_VALUE"
  inline val STRING_LIST_VALUE: "STRING_LIST_VALUE" = "STRING_LIST_VALUE"
  inline val LONG_VALUE: "LONG_VALUE" = "LONG_VALUE"
  inline val DATE_VALUE: "DATE_VALUE" = "DATE_VALUE"

  inline def values: js.Array[DocumentAttributeValueType] = js.Array(STRING_VALUE, STRING_LIST_VALUE, LONG_VALUE, DATE_VALUE)
}

type ErrorCode = "InternalError" | "InvalidRequest"
object ErrorCode {
  inline val InternalError: "InternalError" = "InternalError"
  inline val InvalidRequest: "InvalidRequest" = "InvalidRequest"

  inline def values: js.Array[ErrorCode] = js.Array(InternalError, InvalidRequest)
}

type FaqFileFormat = "CSV" | "CSV_WITH_HEADER" | "JSON"
object FaqFileFormat {
  inline val CSV: "CSV" = "CSV"
  inline val CSV_WITH_HEADER: "CSV_WITH_HEADER" = "CSV_WITH_HEADER"
  inline val JSON: "JSON" = "JSON"

  inline def values: js.Array[FaqFileFormat] = js.Array(CSV, CSV_WITH_HEADER, JSON)
}

type FaqStatus = "CREATING" | "UPDATING" | "ACTIVE" | "DELETING" | "FAILED"
object FaqStatus {
  inline val CREATING: "CREATING" = "CREATING"
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val DELETING: "DELETING" = "DELETING"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[FaqStatus] = js.Array(CREATING, UPDATING, ACTIVE, DELETING, FAILED)
}

type HighlightType = "STANDARD" | "THESAURUS_SYNONYM"
object HighlightType {
  inline val STANDARD: "STANDARD" = "STANDARD"
  inline val THESAURUS_SYNONYM: "THESAURUS_SYNONYM" = "THESAURUS_SYNONYM"

  inline def values: js.Array[HighlightType] = js.Array(STANDARD, THESAURUS_SYNONYM)
}

type IndexEdition = "DEVELOPER_EDITION" | "ENTERPRISE_EDITION"
object IndexEdition {
  inline val DEVELOPER_EDITION: "DEVELOPER_EDITION" = "DEVELOPER_EDITION"
  inline val ENTERPRISE_EDITION: "ENTERPRISE_EDITION" = "ENTERPRISE_EDITION"

  inline def values: js.Array[IndexEdition] = js.Array(DEVELOPER_EDITION, ENTERPRISE_EDITION)
}

type IndexStatus = "CREATING" | "ACTIVE" | "DELETING" | "FAILED" | "UPDATING" | "SYSTEM_UPDATING"
object IndexStatus {
  inline val CREATING: "CREATING" = "CREATING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val DELETING: "DELETING" = "DELETING"
  inline val FAILED: "FAILED" = "FAILED"
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val SYSTEM_UPDATING: "SYSTEM_UPDATING" = "SYSTEM_UPDATING"

  inline def values: js.Array[IndexStatus] = js.Array(CREATING, ACTIVE, DELETING, FAILED, UPDATING, SYSTEM_UPDATING)
}

type KeyLocation = "URL" | "SECRET_MANAGER"
object KeyLocation {
  inline val URL: "URL" = "URL"
  inline val SECRET_MANAGER: "SECRET_MANAGER" = "SECRET_MANAGER"

  inline def values: js.Array[KeyLocation] = js.Array(URL, SECRET_MANAGER)
}

type Order = "ASCENDING" | "DESCENDING"
object Order {
  inline val ASCENDING: "ASCENDING" = "ASCENDING"
  inline val DESCENDING: "DESCENDING" = "DESCENDING"

  inline def values: js.Array[Order] = js.Array(ASCENDING, DESCENDING)
}

type PrincipalType = "USER" | "GROUP"
object PrincipalType {
  inline val USER: "USER" = "USER"
  inline val GROUP: "GROUP" = "GROUP"

  inline def values: js.Array[PrincipalType] = js.Array(USER, GROUP)
}

type QueryIdentifiersEnclosingOption = "DOUBLE_QUOTES" | "NONE"
object QueryIdentifiersEnclosingOption {
  inline val DOUBLE_QUOTES: "DOUBLE_QUOTES" = "DOUBLE_QUOTES"
  inline val NONE: "NONE" = "NONE"

  inline def values: js.Array[QueryIdentifiersEnclosingOption] = js.Array(DOUBLE_QUOTES, NONE)
}

type QueryResultType = "DOCUMENT" | "QUESTION_ANSWER" | "ANSWER"
object QueryResultType {
  inline val DOCUMENT: "DOCUMENT" = "DOCUMENT"
  inline val QUESTION_ANSWER: "QUESTION_ANSWER" = "QUESTION_ANSWER"
  inline val ANSWER: "ANSWER" = "ANSWER"

  inline def values: js.Array[QueryResultType] = js.Array(DOCUMENT, QUESTION_ANSWER, ANSWER)
}

type ReadAccessType = "ALLOW" | "DENY"
object ReadAccessType {
  inline val ALLOW: "ALLOW" = "ALLOW"
  inline val DENY: "DENY" = "DENY"

  inline def values: js.Array[ReadAccessType] = js.Array(ALLOW, DENY)
}

type RelevanceType = "RELEVANT" | "NOT_RELEVANT"
object RelevanceType {
  inline val RELEVANT: "RELEVANT" = "RELEVANT"
  inline val NOT_RELEVANT: "NOT_RELEVANT" = "NOT_RELEVANT"

  inline def values: js.Array[RelevanceType] = js.Array(RELEVANT, NOT_RELEVANT)
}

type SalesforceChatterFeedIncludeFilterType = "ACTIVE_USER" | "STANDARD_USER"
object SalesforceChatterFeedIncludeFilterType {
  inline val ACTIVE_USER: "ACTIVE_USER" = "ACTIVE_USER"
  inline val STANDARD_USER: "STANDARD_USER" = "STANDARD_USER"

  inline def values: js.Array[SalesforceChatterFeedIncludeFilterType] = js.Array(ACTIVE_USER, STANDARD_USER)
}

type SalesforceKnowledgeArticleState = "DRAFT" | "PUBLISHED" | "ARCHIVED"
object SalesforceKnowledgeArticleState {
  inline val DRAFT: "DRAFT" = "DRAFT"
  inline val PUBLISHED: "PUBLISHED" = "PUBLISHED"
  inline val ARCHIVED: "ARCHIVED" = "ARCHIVED"

  inline def values: js.Array[SalesforceKnowledgeArticleState] = js.Array(DRAFT, PUBLISHED, ARCHIVED)
}

type SalesforceStandardObjectName = "ACCOUNT" | "CAMPAIGN" | "CASE" | "CONTACT" | "CONTRACT" | "DOCUMENT" | "GROUP" | "IDEA" | "LEAD" | "OPPORTUNITY" | "PARTNER" | "PRICEBOOK" | "PRODUCT" | "PROFILE" | "SOLUTION" | "TASK" | "USER"
object SalesforceStandardObjectName {
  inline val ACCOUNT: "ACCOUNT" = "ACCOUNT"
  inline val CAMPAIGN: "CAMPAIGN" = "CAMPAIGN"
  inline val CASE: "CASE" = "CASE"
  inline val CONTACT: "CONTACT" = "CONTACT"
  inline val CONTRACT: "CONTRACT" = "CONTRACT"
  inline val DOCUMENT: "DOCUMENT" = "DOCUMENT"
  inline val GROUP: "GROUP" = "GROUP"
  inline val IDEA: "IDEA" = "IDEA"
  inline val LEAD: "LEAD" = "LEAD"
  inline val OPPORTUNITY: "OPPORTUNITY" = "OPPORTUNITY"
  inline val PARTNER: "PARTNER" = "PARTNER"
  inline val PRICEBOOK: "PRICEBOOK" = "PRICEBOOK"
  inline val PRODUCT: "PRODUCT" = "PRODUCT"
  inline val PROFILE: "PROFILE" = "PROFILE"
  inline val SOLUTION: "SOLUTION" = "SOLUTION"
  inline val TASK: "TASK" = "TASK"
  inline val USER: "USER" = "USER"

  inline def values: js.Array[SalesforceStandardObjectName] = js.Array(ACCOUNT, CAMPAIGN, CASE, CONTACT, CONTRACT, DOCUMENT, GROUP, IDEA, LEAD, OPPORTUNITY, PARTNER, PRICEBOOK, PRODUCT, PROFILE, SOLUTION, TASK, USER)
}

/** Enumeration for query score confidence.
  */
type ScoreConfidence = "VERY_HIGH" | "HIGH" | "MEDIUM" | "LOW"
object ScoreConfidence {
  inline val VERY_HIGH: "VERY_HIGH" = "VERY_HIGH"
  inline val HIGH: "HIGH" = "HIGH"
  inline val MEDIUM: "MEDIUM" = "MEDIUM"
  inline val LOW: "LOW" = "LOW"

  inline def values: js.Array[ScoreConfidence] = js.Array(VERY_HIGH, HIGH, MEDIUM, LOW)
}

type ServiceNowAuthenticationType = "HTTP_BASIC" | "OAUTH2"
object ServiceNowAuthenticationType {
  inline val HTTP_BASIC: "HTTP_BASIC" = "HTTP_BASIC"
  inline val OAUTH2: "OAUTH2" = "OAUTH2"

  inline def values: js.Array[ServiceNowAuthenticationType] = js.Array(HTTP_BASIC, OAUTH2)
}

type ServiceNowBuildVersionType = "LONDON" | "OTHERS"
object ServiceNowBuildVersionType {
  inline val LONDON: "LONDON" = "LONDON"
  inline val OTHERS: "OTHERS" = "OTHERS"

  inline def values: js.Array[ServiceNowBuildVersionType] = js.Array(LONDON, OTHERS)
}

type SharePointVersion = "SHAREPOINT_ONLINE"
object SharePointVersion {
  inline val SHAREPOINT_ONLINE: "SHAREPOINT_ONLINE" = "SHAREPOINT_ONLINE"

  inline def values: js.Array[SharePointVersion] = js.Array(SHAREPOINT_ONLINE)
}

type SortOrder = "DESC" | "ASC"
object SortOrder {
  inline val DESC: "DESC" = "DESC"
  inline val ASC: "ASC" = "ASC"

  inline def values: js.Array[SortOrder] = js.Array(DESC, ASC)
}

type ThesaurusStatus = "CREATING" | "ACTIVE" | "DELETING" | "UPDATING" | "ACTIVE_BUT_UPDATE_FAILED" | "FAILED"
object ThesaurusStatus {
  inline val CREATING: "CREATING" = "CREATING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val DELETING: "DELETING" = "DELETING"
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val ACTIVE_BUT_UPDATE_FAILED: "ACTIVE_BUT_UPDATE_FAILED" = "ACTIVE_BUT_UPDATE_FAILED"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[ThesaurusStatus] = js.Array(CREATING, ACTIVE, DELETING, UPDATING, ACTIVE_BUT_UPDATE_FAILED, FAILED)
}

type UserContextPolicy = "ATTRIBUTE_FILTER" | "USER_TOKEN"
object UserContextPolicy {
  inline val ATTRIBUTE_FILTER: "ATTRIBUTE_FILTER" = "ATTRIBUTE_FILTER"
  inline val USER_TOKEN: "USER_TOKEN" = "USER_TOKEN"

  inline def values: js.Array[UserContextPolicy] = js.Array(ATTRIBUTE_FILTER, USER_TOKEN)
}
