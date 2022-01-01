package facade.amazonaws.services.kendra

import scalajs.js

type AdditionalResultAttributeValueType = "TEXT_WITH_HIGHLIGHTS_VALUE"
object AdditionalResultAttributeValueType {
  inline val TEXT_WITH_HIGHLIGHTS_VALUE: "TEXT_WITH_HIGHLIGHTS_VALUE" = "TEXT_WITH_HIGHLIGHTS_VALUE"

  inline def values: js.Array[AdditionalResultAttributeValueType] = js.Array(TEXT_WITH_HIGHLIGHTS_VALUE)
}

type ConditionOperator = "GreaterThan" | "GreaterThanOrEquals" | "LessThan" | "LessThanOrEquals" | "Equals" | "NotEquals" | "Contains" | "NotContains" | "Exists" | "NotExists" | "BeginsWith"
object ConditionOperator {
  inline val GreaterThan: "GreaterThan" = "GreaterThan"
  inline val GreaterThanOrEquals: "GreaterThanOrEquals" = "GreaterThanOrEquals"
  inline val LessThan: "LessThan" = "LessThan"
  inline val LessThanOrEquals: "LessThanOrEquals" = "LessThanOrEquals"
  inline val Equals: "Equals" = "Equals"
  inline val NotEquals: "NotEquals" = "NotEquals"
  inline val Contains: "Contains" = "Contains"
  inline val NotContains: "NotContains" = "NotContains"
  inline val Exists: "Exists" = "Exists"
  inline val NotExists: "NotExists" = "NotExists"
  inline val BeginsWith: "BeginsWith" = "BeginsWith"

  inline def values: js.Array[ConditionOperator] = js.Array(GreaterThan, GreaterThanOrEquals, LessThan, LessThanOrEquals, Equals, NotEquals, Contains, NotContains, Exists, NotExists, BeginsWith)
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

type DataSourceType = "S3" | "SHAREPOINT" | "DATABASE" | "SALESFORCE" | "ONEDRIVE" | "SERVICENOW" | "CUSTOM" | "CONFLUENCE" | "GOOGLEDRIVE" | "WEBCRAWLER" | "WORKDOCS"
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
  inline val WEBCRAWLER: "WEBCRAWLER" = "WEBCRAWLER"
  inline val WORKDOCS: "WORKDOCS" = "WORKDOCS"

  inline def values: js.Array[DataSourceType] = js.Array(S3, SHAREPOINT, DATABASE, SALESFORCE, ONEDRIVE, SERVICENOW, CUSTOM, CONFLUENCE, GOOGLEDRIVE, WEBCRAWLER, WORKDOCS)
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

type DocumentStatus = "NOT_FOUND" | "PROCESSING" | "INDEXED" | "UPDATED" | "FAILED" | "UPDATE_FAILED"
object DocumentStatus {
  inline val NOT_FOUND: "NOT_FOUND" = "NOT_FOUND"
  inline val PROCESSING: "PROCESSING" = "PROCESSING"
  inline val INDEXED: "INDEXED" = "INDEXED"
  inline val UPDATED: "UPDATED" = "UPDATED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val UPDATE_FAILED: "UPDATE_FAILED" = "UPDATE_FAILED"

  inline def values: js.Array[DocumentStatus] = js.Array(NOT_FOUND, PROCESSING, INDEXED, UPDATED, FAILED, UPDATE_FAILED)
}

type EndpointType = "HOME"
object EndpointType {
  inline val HOME: "HOME" = "HOME"

  inline def values: js.Array[EndpointType] = js.Array(HOME)
}

type EntityType = "USER" | "GROUP"
object EntityType {
  inline val USER: "USER" = "USER"
  inline val GROUP: "GROUP" = "GROUP"

  inline def values: js.Array[EntityType] = js.Array(USER, GROUP)
}

type ErrorCode = "InternalError" | "InvalidRequest"
object ErrorCode {
  inline val InternalError: "InternalError" = "InternalError"
  inline val InvalidRequest: "InvalidRequest" = "InvalidRequest"

  inline def values: js.Array[ErrorCode] = js.Array(InternalError, InvalidRequest)
}

type ExperienceStatus = "CREATING" | "ACTIVE" | "DELETING" | "FAILED"
object ExperienceStatus {
  inline val CREATING: "CREATING" = "CREATING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val DELETING: "DELETING" = "DELETING"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[ExperienceStatus] = js.Array(CREATING, ACTIVE, DELETING, FAILED)
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

type Interval = "THIS_MONTH" | "THIS_WEEK" | "ONE_WEEK_AGO" | "TWO_WEEKS_AGO" | "ONE_MONTH_AGO" | "TWO_MONTHS_AGO"
object Interval {
  inline val THIS_MONTH: "THIS_MONTH" = "THIS_MONTH"
  inline val THIS_WEEK: "THIS_WEEK" = "THIS_WEEK"
  inline val ONE_WEEK_AGO: "ONE_WEEK_AGO" = "ONE_WEEK_AGO"
  inline val TWO_WEEKS_AGO: "TWO_WEEKS_AGO" = "TWO_WEEKS_AGO"
  inline val ONE_MONTH_AGO: "ONE_MONTH_AGO" = "ONE_MONTH_AGO"
  inline val TWO_MONTHS_AGO: "TWO_MONTHS_AGO" = "TWO_MONTHS_AGO"

  inline def values: js.Array[Interval] = js.Array(THIS_MONTH, THIS_WEEK, ONE_WEEK_AGO, TWO_WEEKS_AGO, ONE_MONTH_AGO, TWO_MONTHS_AGO)
}

type KeyLocation = "URL" | "SECRET_MANAGER"
object KeyLocation {
  inline val URL: "URL" = "URL"
  inline val SECRET_MANAGER: "SECRET_MANAGER" = "SECRET_MANAGER"

  inline def values: js.Array[KeyLocation] = js.Array(URL, SECRET_MANAGER)
}

type MetricType = "QUERIES_BY_COUNT" | "QUERIES_BY_ZERO_CLICK_RATE" | "QUERIES_BY_ZERO_RESULT_RATE" | "DOCS_BY_CLICK_COUNT" | "AGG_QUERY_DOC_METRICS" | "TREND_QUERY_DOC_METRICS"
object MetricType {
  inline val QUERIES_BY_COUNT: "QUERIES_BY_COUNT" = "QUERIES_BY_COUNT"
  inline val QUERIES_BY_ZERO_CLICK_RATE: "QUERIES_BY_ZERO_CLICK_RATE" = "QUERIES_BY_ZERO_CLICK_RATE"
  inline val QUERIES_BY_ZERO_RESULT_RATE: "QUERIES_BY_ZERO_RESULT_RATE" = "QUERIES_BY_ZERO_RESULT_RATE"
  inline val DOCS_BY_CLICK_COUNT: "DOCS_BY_CLICK_COUNT" = "DOCS_BY_CLICK_COUNT"
  inline val AGG_QUERY_DOC_METRICS: "AGG_QUERY_DOC_METRICS" = "AGG_QUERY_DOC_METRICS"
  inline val TREND_QUERY_DOC_METRICS: "TREND_QUERY_DOC_METRICS" = "TREND_QUERY_DOC_METRICS"

  inline def values: js.Array[MetricType] = js.Array(QUERIES_BY_COUNT, QUERIES_BY_ZERO_CLICK_RATE, QUERIES_BY_ZERO_RESULT_RATE, DOCS_BY_CLICK_COUNT, AGG_QUERY_DOC_METRICS, TREND_QUERY_DOC_METRICS)
}

type Mode = "ENABLED" | "LEARN_ONLY"
object Mode {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val LEARN_ONLY: "LEARN_ONLY" = "LEARN_ONLY"

  inline def values: js.Array[Mode] = js.Array(ENABLED, LEARN_ONLY)
}

type Order = "ASCENDING" | "DESCENDING"
object Order {
  inline val ASCENDING: "ASCENDING" = "ASCENDING"
  inline val DESCENDING: "DESCENDING" = "DESCENDING"

  inline def values: js.Array[Order] = js.Array(ASCENDING, DESCENDING)
}

type Persona = "OWNER" | "VIEWER"
object Persona {
  inline val OWNER: "OWNER" = "OWNER"
  inline val VIEWER: "VIEWER" = "VIEWER"

  inline def values: js.Array[Persona] = js.Array(OWNER, VIEWER)
}

type PrincipalMappingStatus = "FAILED" | "SUCCEEDED" | "PROCESSING" | "DELETING" | "DELETED"
object PrincipalMappingStatus {
  inline val FAILED: "FAILED" = "FAILED"
  inline val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  inline val PROCESSING: "PROCESSING" = "PROCESSING"
  inline val DELETING: "DELETING" = "DELETING"
  inline val DELETED: "DELETED" = "DELETED"

  inline def values: js.Array[PrincipalMappingStatus] = js.Array(FAILED, SUCCEEDED, PROCESSING, DELETING, DELETED)
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

type QuerySuggestionsBlockListStatus = "ACTIVE" | "CREATING" | "DELETING" | "UPDATING" | "ACTIVE_BUT_UPDATE_FAILED" | "FAILED"
object QuerySuggestionsBlockListStatus {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val CREATING: "CREATING" = "CREATING"
  inline val DELETING: "DELETING" = "DELETING"
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val ACTIVE_BUT_UPDATE_FAILED: "ACTIVE_BUT_UPDATE_FAILED" = "ACTIVE_BUT_UPDATE_FAILED"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[QuerySuggestionsBlockListStatus] = js.Array(ACTIVE, CREATING, DELETING, UPDATING, ACTIVE_BUT_UPDATE_FAILED, FAILED)
}

type QuerySuggestionsStatus = "ACTIVE" | "UPDATING"
object QuerySuggestionsStatus {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val UPDATING: "UPDATING" = "UPDATING"

  inline def values: js.Array[QuerySuggestionsStatus] = js.Array(ACTIVE, UPDATING)
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
type ScoreConfidence = "VERY_HIGH" | "HIGH" | "MEDIUM" | "LOW" | "NOT_AVAILABLE"
object ScoreConfidence {
  inline val VERY_HIGH: "VERY_HIGH" = "VERY_HIGH"
  inline val HIGH: "HIGH" = "HIGH"
  inline val MEDIUM: "MEDIUM" = "MEDIUM"
  inline val LOW: "LOW" = "LOW"
  inline val NOT_AVAILABLE: "NOT_AVAILABLE" = "NOT_AVAILABLE"

  inline def values: js.Array[ScoreConfidence] = js.Array(VERY_HIGH, HIGH, MEDIUM, LOW, NOT_AVAILABLE)
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

type SharePointVersion = "SHAREPOINT_2013" | "SHAREPOINT_2016" | "SHAREPOINT_ONLINE"
object SharePointVersion {
  inline val SHAREPOINT_2013: "SHAREPOINT_2013" = "SHAREPOINT_2013"
  inline val SHAREPOINT_2016: "SHAREPOINT_2016" = "SHAREPOINT_2016"
  inline val SHAREPOINT_ONLINE: "SHAREPOINT_ONLINE" = "SHAREPOINT_ONLINE"

  inline def values: js.Array[SharePointVersion] = js.Array(SHAREPOINT_2013, SHAREPOINT_2016, SHAREPOINT_ONLINE)
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

type UserGroupResolutionMode = "AWS_SSO" | "NONE"
object UserGroupResolutionMode {
  inline val AWS_SSO: "AWS_SSO" = "AWS_SSO"
  inline val NONE: "NONE" = "NONE"

  inline def values: js.Array[UserGroupResolutionMode] = js.Array(AWS_SSO, NONE)
}

type WebCrawlerMode = "HOST_ONLY" | "SUBDOMAINS" | "EVERYTHING"
object WebCrawlerMode {
  inline val HOST_ONLY: "HOST_ONLY" = "HOST_ONLY"
  inline val SUBDOMAINS: "SUBDOMAINS" = "SUBDOMAINS"
  inline val EVERYTHING: "EVERYTHING" = "EVERYTHING"

  inline def values: js.Array[WebCrawlerMode] = js.Array(HOST_ONLY, SUBDOMAINS, EVERYTHING)
}
