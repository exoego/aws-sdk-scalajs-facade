package facade.amazonaws.services.kendra

import scalajs._

type AdditionalResultAttributeValueType = "TEXT_WITH_HIGHLIGHTS_VALUE"
object AdditionalResultAttributeValueType {
  val TEXT_WITH_HIGHLIGHTS_VALUE: "TEXT_WITH_HIGHLIGHTS_VALUE" = "TEXT_WITH_HIGHLIGHTS_VALUE"

  @inline def values = js.Array[AdditionalResultAttributeValueType](TEXT_WITH_HIGHLIGHTS_VALUE)
}

type ConfluenceAttachmentFieldName = "AUTHOR" | "CONTENT_TYPE" | "CREATED_DATE" | "DISPLAY_URL" | "FILE_SIZE" | "ITEM_TYPE" | "PARENT_ID" | "SPACE_KEY" | "SPACE_NAME" | "URL" | "VERSION"
object ConfluenceAttachmentFieldName {
  val AUTHOR: "AUTHOR" = "AUTHOR"
  val CONTENT_TYPE: "CONTENT_TYPE" = "CONTENT_TYPE"
  val CREATED_DATE: "CREATED_DATE" = "CREATED_DATE"
  val DISPLAY_URL: "DISPLAY_URL" = "DISPLAY_URL"
  val FILE_SIZE: "FILE_SIZE" = "FILE_SIZE"
  val ITEM_TYPE: "ITEM_TYPE" = "ITEM_TYPE"
  val PARENT_ID: "PARENT_ID" = "PARENT_ID"
  val SPACE_KEY: "SPACE_KEY" = "SPACE_KEY"
  val SPACE_NAME: "SPACE_NAME" = "SPACE_NAME"
  val URL: "URL" = "URL"
  val VERSION: "VERSION" = "VERSION"

  @inline def values = js.Array[ConfluenceAttachmentFieldName](AUTHOR, CONTENT_TYPE, CREATED_DATE, DISPLAY_URL, FILE_SIZE, ITEM_TYPE, PARENT_ID, SPACE_KEY, SPACE_NAME, URL, VERSION)
}

type ConfluenceBlogFieldName = "AUTHOR" | "DISPLAY_URL" | "ITEM_TYPE" | "LABELS" | "PUBLISH_DATE" | "SPACE_KEY" | "SPACE_NAME" | "URL" | "VERSION"
object ConfluenceBlogFieldName {
  val AUTHOR: "AUTHOR" = "AUTHOR"
  val DISPLAY_URL: "DISPLAY_URL" = "DISPLAY_URL"
  val ITEM_TYPE: "ITEM_TYPE" = "ITEM_TYPE"
  val LABELS: "LABELS" = "LABELS"
  val PUBLISH_DATE: "PUBLISH_DATE" = "PUBLISH_DATE"
  val SPACE_KEY: "SPACE_KEY" = "SPACE_KEY"
  val SPACE_NAME: "SPACE_NAME" = "SPACE_NAME"
  val URL: "URL" = "URL"
  val VERSION: "VERSION" = "VERSION"

  @inline def values = js.Array[ConfluenceBlogFieldName](AUTHOR, DISPLAY_URL, ITEM_TYPE, LABELS, PUBLISH_DATE, SPACE_KEY, SPACE_NAME, URL, VERSION)
}

type ConfluencePageFieldName = "AUTHOR" | "CONTENT_STATUS" | "CREATED_DATE" | "DISPLAY_URL" | "ITEM_TYPE" | "LABELS" | "MODIFIED_DATE" | "PARENT_ID" | "SPACE_KEY" | "SPACE_NAME" | "URL" | "VERSION"
object ConfluencePageFieldName {
  val AUTHOR: "AUTHOR" = "AUTHOR"
  val CONTENT_STATUS: "CONTENT_STATUS" = "CONTENT_STATUS"
  val CREATED_DATE: "CREATED_DATE" = "CREATED_DATE"
  val DISPLAY_URL: "DISPLAY_URL" = "DISPLAY_URL"
  val ITEM_TYPE: "ITEM_TYPE" = "ITEM_TYPE"
  val LABELS: "LABELS" = "LABELS"
  val MODIFIED_DATE: "MODIFIED_DATE" = "MODIFIED_DATE"
  val PARENT_ID: "PARENT_ID" = "PARENT_ID"
  val SPACE_KEY: "SPACE_KEY" = "SPACE_KEY"
  val SPACE_NAME: "SPACE_NAME" = "SPACE_NAME"
  val URL: "URL" = "URL"
  val VERSION: "VERSION" = "VERSION"

  @inline def values = js.Array[ConfluencePageFieldName](AUTHOR, CONTENT_STATUS, CREATED_DATE, DISPLAY_URL, ITEM_TYPE, LABELS, MODIFIED_DATE, PARENT_ID, SPACE_KEY, SPACE_NAME, URL, VERSION)
}

type ConfluenceSpaceFieldName = "DISPLAY_URL" | "ITEM_TYPE" | "SPACE_KEY" | "URL"
object ConfluenceSpaceFieldName {
  val DISPLAY_URL: "DISPLAY_URL" = "DISPLAY_URL"
  val ITEM_TYPE: "ITEM_TYPE" = "ITEM_TYPE"
  val SPACE_KEY: "SPACE_KEY" = "SPACE_KEY"
  val URL: "URL" = "URL"

  @inline def values = js.Array[ConfluenceSpaceFieldName](DISPLAY_URL, ITEM_TYPE, SPACE_KEY, URL)
}

type ConfluenceVersion = "CLOUD" | "SERVER"
object ConfluenceVersion {
  val CLOUD: "CLOUD" = "CLOUD"
  val SERVER: "SERVER" = "SERVER"

  @inline def values = js.Array[ConfluenceVersion](CLOUD, SERVER)
}

type ContentType = "PDF" | "HTML" | "MS_WORD" | "PLAIN_TEXT" | "PPT"
object ContentType {
  val PDF: "PDF" = "PDF"
  val HTML: "HTML" = "HTML"
  val MS_WORD: "MS_WORD" = "MS_WORD"
  val PLAIN_TEXT: "PLAIN_TEXT" = "PLAIN_TEXT"
  val PPT: "PPT" = "PPT"

  @inline def values = js.Array[ContentType](PDF, HTML, MS_WORD, PLAIN_TEXT, PPT)
}

type DataSourceStatus = "CREATING" | "DELETING" | "FAILED" | "UPDATING" | "ACTIVE"
object DataSourceStatus {
  val CREATING: "CREATING" = "CREATING"
  val DELETING: "DELETING" = "DELETING"
  val FAILED: "FAILED" = "FAILED"
  val UPDATING: "UPDATING" = "UPDATING"
  val ACTIVE: "ACTIVE" = "ACTIVE"

  @inline def values = js.Array[DataSourceStatus](CREATING, DELETING, FAILED, UPDATING, ACTIVE)
}

type DataSourceSyncJobStatus = "FAILED" | "SUCCEEDED" | "SYNCING" | "INCOMPLETE" | "STOPPING" | "ABORTED" | "SYNCING_INDEXING"
object DataSourceSyncJobStatus {
  val FAILED: "FAILED" = "FAILED"
  val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  val SYNCING: "SYNCING" = "SYNCING"
  val INCOMPLETE: "INCOMPLETE" = "INCOMPLETE"
  val STOPPING: "STOPPING" = "STOPPING"
  val ABORTED: "ABORTED" = "ABORTED"
  val SYNCING_INDEXING: "SYNCING_INDEXING" = "SYNCING_INDEXING"

  @inline def values = js.Array[DataSourceSyncJobStatus](FAILED, SUCCEEDED, SYNCING, INCOMPLETE, STOPPING, ABORTED, SYNCING_INDEXING)
}

type DataSourceType = "S3" | "SHAREPOINT" | "DATABASE" | "SALESFORCE" | "ONEDRIVE" | "SERVICENOW" | "CUSTOM" | "CONFLUENCE" | "GOOGLEDRIVE"
object DataSourceType {
  val S3: "S3" = "S3"
  val SHAREPOINT: "SHAREPOINT" = "SHAREPOINT"
  val DATABASE: "DATABASE" = "DATABASE"
  val SALESFORCE: "SALESFORCE" = "SALESFORCE"
  val ONEDRIVE: "ONEDRIVE" = "ONEDRIVE"
  val SERVICENOW: "SERVICENOW" = "SERVICENOW"
  val CUSTOM: "CUSTOM" = "CUSTOM"
  val CONFLUENCE: "CONFLUENCE" = "CONFLUENCE"
  val GOOGLEDRIVE: "GOOGLEDRIVE" = "GOOGLEDRIVE"

  @inline def values = js.Array[DataSourceType](S3, SHAREPOINT, DATABASE, SALESFORCE, ONEDRIVE, SERVICENOW, CUSTOM, CONFLUENCE, GOOGLEDRIVE)
}

type DatabaseEngineType = "RDS_AURORA_MYSQL" | "RDS_AURORA_POSTGRESQL" | "RDS_MYSQL" | "RDS_POSTGRESQL"
object DatabaseEngineType {
  val RDS_AURORA_MYSQL: "RDS_AURORA_MYSQL" = "RDS_AURORA_MYSQL"
  val RDS_AURORA_POSTGRESQL: "RDS_AURORA_POSTGRESQL" = "RDS_AURORA_POSTGRESQL"
  val RDS_MYSQL: "RDS_MYSQL" = "RDS_MYSQL"
  val RDS_POSTGRESQL: "RDS_POSTGRESQL" = "RDS_POSTGRESQL"

  @inline def values = js.Array[DatabaseEngineType](RDS_AURORA_MYSQL, RDS_AURORA_POSTGRESQL, RDS_MYSQL, RDS_POSTGRESQL)
}

type DocumentAttributeValueType = "STRING_VALUE" | "STRING_LIST_VALUE" | "LONG_VALUE" | "DATE_VALUE"
object DocumentAttributeValueType {
  val STRING_VALUE: "STRING_VALUE" = "STRING_VALUE"
  val STRING_LIST_VALUE: "STRING_LIST_VALUE" = "STRING_LIST_VALUE"
  val LONG_VALUE: "LONG_VALUE" = "LONG_VALUE"
  val DATE_VALUE: "DATE_VALUE" = "DATE_VALUE"

  @inline def values = js.Array[DocumentAttributeValueType](STRING_VALUE, STRING_LIST_VALUE, LONG_VALUE, DATE_VALUE)
}

type ErrorCode = "InternalError" | "InvalidRequest"
object ErrorCode {
  val InternalError: "InternalError" = "InternalError"
  val InvalidRequest: "InvalidRequest" = "InvalidRequest"

  @inline def values = js.Array[ErrorCode](InternalError, InvalidRequest)
}

type FaqFileFormat = "CSV" | "CSV_WITH_HEADER" | "JSON"
object FaqFileFormat {
  val CSV: "CSV" = "CSV"
  val CSV_WITH_HEADER: "CSV_WITH_HEADER" = "CSV_WITH_HEADER"
  val JSON: "JSON" = "JSON"

  @inline def values = js.Array[FaqFileFormat](CSV, CSV_WITH_HEADER, JSON)
}

type FaqStatus = "CREATING" | "UPDATING" | "ACTIVE" | "DELETING" | "FAILED"
object FaqStatus {
  val CREATING: "CREATING" = "CREATING"
  val UPDATING: "UPDATING" = "UPDATING"
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val DELETING: "DELETING" = "DELETING"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[FaqStatus](CREATING, UPDATING, ACTIVE, DELETING, FAILED)
}

type HighlightType = "STANDARD" | "THESAURUS_SYNONYM"
object HighlightType {
  val STANDARD: "STANDARD" = "STANDARD"
  val THESAURUS_SYNONYM: "THESAURUS_SYNONYM" = "THESAURUS_SYNONYM"

  @inline def values = js.Array[HighlightType](STANDARD, THESAURUS_SYNONYM)
}

type IndexEdition = "DEVELOPER_EDITION" | "ENTERPRISE_EDITION"
object IndexEdition {
  val DEVELOPER_EDITION: "DEVELOPER_EDITION" = "DEVELOPER_EDITION"
  val ENTERPRISE_EDITION: "ENTERPRISE_EDITION" = "ENTERPRISE_EDITION"

  @inline def values = js.Array[IndexEdition](DEVELOPER_EDITION, ENTERPRISE_EDITION)
}

type IndexStatus = "CREATING" | "ACTIVE" | "DELETING" | "FAILED" | "UPDATING" | "SYSTEM_UPDATING"
object IndexStatus {
  val CREATING: "CREATING" = "CREATING"
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val DELETING: "DELETING" = "DELETING"
  val FAILED: "FAILED" = "FAILED"
  val UPDATING: "UPDATING" = "UPDATING"
  val SYSTEM_UPDATING: "SYSTEM_UPDATING" = "SYSTEM_UPDATING"

  @inline def values = js.Array[IndexStatus](CREATING, ACTIVE, DELETING, FAILED, UPDATING, SYSTEM_UPDATING)
}

type KeyLocation = "URL" | "SECRET_MANAGER"
object KeyLocation {
  val URL: "URL" = "URL"
  val SECRET_MANAGER: "SECRET_MANAGER" = "SECRET_MANAGER"

  @inline def values = js.Array[KeyLocation](URL, SECRET_MANAGER)
}

type Order = "ASCENDING" | "DESCENDING"
object Order {
  val ASCENDING: "ASCENDING" = "ASCENDING"
  val DESCENDING: "DESCENDING" = "DESCENDING"

  @inline def values = js.Array[Order](ASCENDING, DESCENDING)
}

type PrincipalType = "USER" | "GROUP"
object PrincipalType {
  val USER: "USER" = "USER"
  val GROUP: "GROUP" = "GROUP"

  @inline def values = js.Array[PrincipalType](USER, GROUP)
}

type QueryIdentifiersEnclosingOption = "DOUBLE_QUOTES" | "NONE"
object QueryIdentifiersEnclosingOption {
  val DOUBLE_QUOTES: "DOUBLE_QUOTES" = "DOUBLE_QUOTES"
  val NONE: "NONE" = "NONE"

  @inline def values = js.Array[QueryIdentifiersEnclosingOption](DOUBLE_QUOTES, NONE)
}

type QueryResultType = "DOCUMENT" | "QUESTION_ANSWER" | "ANSWER"
object QueryResultType {
  val DOCUMENT: "DOCUMENT" = "DOCUMENT"
  val QUESTION_ANSWER: "QUESTION_ANSWER" = "QUESTION_ANSWER"
  val ANSWER: "ANSWER" = "ANSWER"

  @inline def values = js.Array[QueryResultType](DOCUMENT, QUESTION_ANSWER, ANSWER)
}

type ReadAccessType = "ALLOW" | "DENY"
object ReadAccessType {
  val ALLOW: "ALLOW" = "ALLOW"
  val DENY: "DENY" = "DENY"

  @inline def values = js.Array[ReadAccessType](ALLOW, DENY)
}

type RelevanceType = "RELEVANT" | "NOT_RELEVANT"
object RelevanceType {
  val RELEVANT: "RELEVANT" = "RELEVANT"
  val NOT_RELEVANT: "NOT_RELEVANT" = "NOT_RELEVANT"

  @inline def values = js.Array[RelevanceType](RELEVANT, NOT_RELEVANT)
}

type SalesforceChatterFeedIncludeFilterType = "ACTIVE_USER" | "STANDARD_USER"
object SalesforceChatterFeedIncludeFilterType {
  val ACTIVE_USER: "ACTIVE_USER" = "ACTIVE_USER"
  val STANDARD_USER: "STANDARD_USER" = "STANDARD_USER"

  @inline def values = js.Array[SalesforceChatterFeedIncludeFilterType](ACTIVE_USER, STANDARD_USER)
}

type SalesforceKnowledgeArticleState = "DRAFT" | "PUBLISHED" | "ARCHIVED"
object SalesforceKnowledgeArticleState {
  val DRAFT: "DRAFT" = "DRAFT"
  val PUBLISHED: "PUBLISHED" = "PUBLISHED"
  val ARCHIVED: "ARCHIVED" = "ARCHIVED"

  @inline def values = js.Array[SalesforceKnowledgeArticleState](DRAFT, PUBLISHED, ARCHIVED)
}

type SalesforceStandardObjectName = "ACCOUNT" | "CAMPAIGN" | "CASE" | "CONTACT" | "CONTRACT" | "DOCUMENT" | "GROUP" | "IDEA" | "LEAD" | "OPPORTUNITY" | "PARTNER" | "PRICEBOOK" | "PRODUCT" | "PROFILE" | "SOLUTION" | "TASK" | "USER"
object SalesforceStandardObjectName {
  val ACCOUNT: "ACCOUNT" = "ACCOUNT"
  val CAMPAIGN: "CAMPAIGN" = "CAMPAIGN"
  val CASE: "CASE" = "CASE"
  val CONTACT: "CONTACT" = "CONTACT"
  val CONTRACT: "CONTRACT" = "CONTRACT"
  val DOCUMENT: "DOCUMENT" = "DOCUMENT"
  val GROUP: "GROUP" = "GROUP"
  val IDEA: "IDEA" = "IDEA"
  val LEAD: "LEAD" = "LEAD"
  val OPPORTUNITY: "OPPORTUNITY" = "OPPORTUNITY"
  val PARTNER: "PARTNER" = "PARTNER"
  val PRICEBOOK: "PRICEBOOK" = "PRICEBOOK"
  val PRODUCT: "PRODUCT" = "PRODUCT"
  val PROFILE: "PROFILE" = "PROFILE"
  val SOLUTION: "SOLUTION" = "SOLUTION"
  val TASK: "TASK" = "TASK"
  val USER: "USER" = "USER"

  @inline def values = js.Array[SalesforceStandardObjectName](ACCOUNT, CAMPAIGN, CASE, CONTACT, CONTRACT, DOCUMENT, GROUP, IDEA, LEAD, OPPORTUNITY, PARTNER, PRICEBOOK, PRODUCT, PROFILE, SOLUTION, TASK, USER)
}

/** Enumeration for query score confidence.
  */
type ScoreConfidence = "VERY_HIGH" | "HIGH" | "MEDIUM" | "LOW"
object ScoreConfidence {
  val VERY_HIGH: "VERY_HIGH" = "VERY_HIGH"
  val HIGH: "HIGH" = "HIGH"
  val MEDIUM: "MEDIUM" = "MEDIUM"
  val LOW: "LOW" = "LOW"

  @inline def values = js.Array[ScoreConfidence](VERY_HIGH, HIGH, MEDIUM, LOW)
}

type ServiceNowAuthenticationType = "HTTP_BASIC" | "OAUTH2"
object ServiceNowAuthenticationType {
  val HTTP_BASIC: "HTTP_BASIC" = "HTTP_BASIC"
  val OAUTH2: "OAUTH2" = "OAUTH2"

  @inline def values = js.Array[ServiceNowAuthenticationType](HTTP_BASIC, OAUTH2)
}

type ServiceNowBuildVersionType = "LONDON" | "OTHERS"
object ServiceNowBuildVersionType {
  val LONDON: "LONDON" = "LONDON"
  val OTHERS: "OTHERS" = "OTHERS"

  @inline def values = js.Array[ServiceNowBuildVersionType](LONDON, OTHERS)
}

type SharePointVersion = "SHAREPOINT_ONLINE"
object SharePointVersion {
  val SHAREPOINT_ONLINE: "SHAREPOINT_ONLINE" = "SHAREPOINT_ONLINE"

  @inline def values = js.Array[SharePointVersion](SHAREPOINT_ONLINE)
}

type SortOrder = "DESC" | "ASC"
object SortOrder {
  val DESC: "DESC" = "DESC"
  val ASC: "ASC" = "ASC"

  @inline def values = js.Array[SortOrder](DESC, ASC)
}

type ThesaurusStatus = "CREATING" | "ACTIVE" | "DELETING" | "UPDATING" | "ACTIVE_BUT_UPDATE_FAILED" | "FAILED"
object ThesaurusStatus {
  val CREATING: "CREATING" = "CREATING"
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val DELETING: "DELETING" = "DELETING"
  val UPDATING: "UPDATING" = "UPDATING"
  val ACTIVE_BUT_UPDATE_FAILED: "ACTIVE_BUT_UPDATE_FAILED" = "ACTIVE_BUT_UPDATE_FAILED"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[ThesaurusStatus](CREATING, ACTIVE, DELETING, UPDATING, ACTIVE_BUT_UPDATE_FAILED, FAILED)
}

type UserContextPolicy = "ATTRIBUTE_FILTER" | "USER_TOKEN"
object UserContextPolicy {
  val ATTRIBUTE_FILTER: "ATTRIBUTE_FILTER" = "ATTRIBUTE_FILTER"
  val USER_TOKEN: "USER_TOKEN" = "USER_TOKEN"

  @inline def values = js.Array[UserContextPolicy](ATTRIBUTE_FILTER, USER_TOKEN)
}
