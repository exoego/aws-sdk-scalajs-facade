package facade.amazonaws.services.kendra

import scalajs.js

@js.native
sealed trait AdditionalResultAttributeValueType extends js.Any
object AdditionalResultAttributeValueType {
  val TEXT_WITH_HIGHLIGHTS_VALUE = "TEXT_WITH_HIGHLIGHTS_VALUE".asInstanceOf[AdditionalResultAttributeValueType]

  @inline def values: js.Array[AdditionalResultAttributeValueType] = js.Array(TEXT_WITH_HIGHLIGHTS_VALUE)
}

@js.native
sealed trait ConfluenceAttachmentFieldName extends js.Any
object ConfluenceAttachmentFieldName {
  val AUTHOR = "AUTHOR".asInstanceOf[ConfluenceAttachmentFieldName]
  val CONTENT_TYPE = "CONTENT_TYPE".asInstanceOf[ConfluenceAttachmentFieldName]
  val CREATED_DATE = "CREATED_DATE".asInstanceOf[ConfluenceAttachmentFieldName]
  val DISPLAY_URL = "DISPLAY_URL".asInstanceOf[ConfluenceAttachmentFieldName]
  val FILE_SIZE = "FILE_SIZE".asInstanceOf[ConfluenceAttachmentFieldName]
  val ITEM_TYPE = "ITEM_TYPE".asInstanceOf[ConfluenceAttachmentFieldName]
  val PARENT_ID = "PARENT_ID".asInstanceOf[ConfluenceAttachmentFieldName]
  val SPACE_KEY = "SPACE_KEY".asInstanceOf[ConfluenceAttachmentFieldName]
  val SPACE_NAME = "SPACE_NAME".asInstanceOf[ConfluenceAttachmentFieldName]
  val URL = "URL".asInstanceOf[ConfluenceAttachmentFieldName]
  val VERSION = "VERSION".asInstanceOf[ConfluenceAttachmentFieldName]

  @inline def values: js.Array[ConfluenceAttachmentFieldName] = js.Array(AUTHOR, CONTENT_TYPE, CREATED_DATE, DISPLAY_URL, FILE_SIZE, ITEM_TYPE, PARENT_ID, SPACE_KEY, SPACE_NAME, URL, VERSION)
}

@js.native
sealed trait ConfluenceBlogFieldName extends js.Any
object ConfluenceBlogFieldName {
  val AUTHOR = "AUTHOR".asInstanceOf[ConfluenceBlogFieldName]
  val DISPLAY_URL = "DISPLAY_URL".asInstanceOf[ConfluenceBlogFieldName]
  val ITEM_TYPE = "ITEM_TYPE".asInstanceOf[ConfluenceBlogFieldName]
  val LABELS = "LABELS".asInstanceOf[ConfluenceBlogFieldName]
  val PUBLISH_DATE = "PUBLISH_DATE".asInstanceOf[ConfluenceBlogFieldName]
  val SPACE_KEY = "SPACE_KEY".asInstanceOf[ConfluenceBlogFieldName]
  val SPACE_NAME = "SPACE_NAME".asInstanceOf[ConfluenceBlogFieldName]
  val URL = "URL".asInstanceOf[ConfluenceBlogFieldName]
  val VERSION = "VERSION".asInstanceOf[ConfluenceBlogFieldName]

  @inline def values: js.Array[ConfluenceBlogFieldName] = js.Array(AUTHOR, DISPLAY_URL, ITEM_TYPE, LABELS, PUBLISH_DATE, SPACE_KEY, SPACE_NAME, URL, VERSION)
}

@js.native
sealed trait ConfluencePageFieldName extends js.Any
object ConfluencePageFieldName {
  val AUTHOR = "AUTHOR".asInstanceOf[ConfluencePageFieldName]
  val CONTENT_STATUS = "CONTENT_STATUS".asInstanceOf[ConfluencePageFieldName]
  val CREATED_DATE = "CREATED_DATE".asInstanceOf[ConfluencePageFieldName]
  val DISPLAY_URL = "DISPLAY_URL".asInstanceOf[ConfluencePageFieldName]
  val ITEM_TYPE = "ITEM_TYPE".asInstanceOf[ConfluencePageFieldName]
  val LABELS = "LABELS".asInstanceOf[ConfluencePageFieldName]
  val MODIFIED_DATE = "MODIFIED_DATE".asInstanceOf[ConfluencePageFieldName]
  val PARENT_ID = "PARENT_ID".asInstanceOf[ConfluencePageFieldName]
  val SPACE_KEY = "SPACE_KEY".asInstanceOf[ConfluencePageFieldName]
  val SPACE_NAME = "SPACE_NAME".asInstanceOf[ConfluencePageFieldName]
  val URL = "URL".asInstanceOf[ConfluencePageFieldName]
  val VERSION = "VERSION".asInstanceOf[ConfluencePageFieldName]

  @inline def values: js.Array[ConfluencePageFieldName] = js.Array(AUTHOR, CONTENT_STATUS, CREATED_DATE, DISPLAY_URL, ITEM_TYPE, LABELS, MODIFIED_DATE, PARENT_ID, SPACE_KEY, SPACE_NAME, URL, VERSION)
}

@js.native
sealed trait ConfluenceSpaceFieldName extends js.Any
object ConfluenceSpaceFieldName {
  val DISPLAY_URL = "DISPLAY_URL".asInstanceOf[ConfluenceSpaceFieldName]
  val ITEM_TYPE = "ITEM_TYPE".asInstanceOf[ConfluenceSpaceFieldName]
  val SPACE_KEY = "SPACE_KEY".asInstanceOf[ConfluenceSpaceFieldName]
  val URL = "URL".asInstanceOf[ConfluenceSpaceFieldName]

  @inline def values: js.Array[ConfluenceSpaceFieldName] = js.Array(DISPLAY_URL, ITEM_TYPE, SPACE_KEY, URL)
}

@js.native
sealed trait ConfluenceVersion extends js.Any
object ConfluenceVersion {
  val CLOUD = "CLOUD".asInstanceOf[ConfluenceVersion]
  val SERVER = "SERVER".asInstanceOf[ConfluenceVersion]

  @inline def values: js.Array[ConfluenceVersion] = js.Array(CLOUD, SERVER)
}

@js.native
sealed trait ContentType extends js.Any
object ContentType {
  val PDF = "PDF".asInstanceOf[ContentType]
  val HTML = "HTML".asInstanceOf[ContentType]
  val MS_WORD = "MS_WORD".asInstanceOf[ContentType]
  val PLAIN_TEXT = "PLAIN_TEXT".asInstanceOf[ContentType]
  val PPT = "PPT".asInstanceOf[ContentType]

  @inline def values: js.Array[ContentType] = js.Array(PDF, HTML, MS_WORD, PLAIN_TEXT, PPT)
}

@js.native
sealed trait DataSourceStatus extends js.Any
object DataSourceStatus {
  val CREATING = "CREATING".asInstanceOf[DataSourceStatus]
  val DELETING = "DELETING".asInstanceOf[DataSourceStatus]
  val FAILED = "FAILED".asInstanceOf[DataSourceStatus]
  val UPDATING = "UPDATING".asInstanceOf[DataSourceStatus]
  val ACTIVE = "ACTIVE".asInstanceOf[DataSourceStatus]

  @inline def values: js.Array[DataSourceStatus] = js.Array(CREATING, DELETING, FAILED, UPDATING, ACTIVE)
}

@js.native
sealed trait DataSourceSyncJobStatus extends js.Any
object DataSourceSyncJobStatus {
  val FAILED = "FAILED".asInstanceOf[DataSourceSyncJobStatus]
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[DataSourceSyncJobStatus]
  val SYNCING = "SYNCING".asInstanceOf[DataSourceSyncJobStatus]
  val INCOMPLETE = "INCOMPLETE".asInstanceOf[DataSourceSyncJobStatus]
  val STOPPING = "STOPPING".asInstanceOf[DataSourceSyncJobStatus]
  val ABORTED = "ABORTED".asInstanceOf[DataSourceSyncJobStatus]
  val SYNCING_INDEXING = "SYNCING_INDEXING".asInstanceOf[DataSourceSyncJobStatus]

  @inline def values: js.Array[DataSourceSyncJobStatus] = js.Array(FAILED, SUCCEEDED, SYNCING, INCOMPLETE, STOPPING, ABORTED, SYNCING_INDEXING)
}

@js.native
sealed trait DataSourceType extends js.Any
object DataSourceType {
  val S3 = "S3".asInstanceOf[DataSourceType]
  val SHAREPOINT = "SHAREPOINT".asInstanceOf[DataSourceType]
  val DATABASE = "DATABASE".asInstanceOf[DataSourceType]
  val SALESFORCE = "SALESFORCE".asInstanceOf[DataSourceType]
  val ONEDRIVE = "ONEDRIVE".asInstanceOf[DataSourceType]
  val SERVICENOW = "SERVICENOW".asInstanceOf[DataSourceType]
  val CUSTOM = "CUSTOM".asInstanceOf[DataSourceType]
  val CONFLUENCE = "CONFLUENCE".asInstanceOf[DataSourceType]
  val GOOGLEDRIVE = "GOOGLEDRIVE".asInstanceOf[DataSourceType]

  @inline def values: js.Array[DataSourceType] = js.Array(S3, SHAREPOINT, DATABASE, SALESFORCE, ONEDRIVE, SERVICENOW, CUSTOM, CONFLUENCE, GOOGLEDRIVE)
}

@js.native
sealed trait DatabaseEngineType extends js.Any
object DatabaseEngineType {
  val RDS_AURORA_MYSQL = "RDS_AURORA_MYSQL".asInstanceOf[DatabaseEngineType]
  val RDS_AURORA_POSTGRESQL = "RDS_AURORA_POSTGRESQL".asInstanceOf[DatabaseEngineType]
  val RDS_MYSQL = "RDS_MYSQL".asInstanceOf[DatabaseEngineType]
  val RDS_POSTGRESQL = "RDS_POSTGRESQL".asInstanceOf[DatabaseEngineType]

  @inline def values: js.Array[DatabaseEngineType] = js.Array(RDS_AURORA_MYSQL, RDS_AURORA_POSTGRESQL, RDS_MYSQL, RDS_POSTGRESQL)
}

@js.native
sealed trait DocumentAttributeValueType extends js.Any
object DocumentAttributeValueType {
  val STRING_VALUE = "STRING_VALUE".asInstanceOf[DocumentAttributeValueType]
  val STRING_LIST_VALUE = "STRING_LIST_VALUE".asInstanceOf[DocumentAttributeValueType]
  val LONG_VALUE = "LONG_VALUE".asInstanceOf[DocumentAttributeValueType]
  val DATE_VALUE = "DATE_VALUE".asInstanceOf[DocumentAttributeValueType]

  @inline def values: js.Array[DocumentAttributeValueType] = js.Array(STRING_VALUE, STRING_LIST_VALUE, LONG_VALUE, DATE_VALUE)
}

@js.native
sealed trait ErrorCode extends js.Any
object ErrorCode {
  val InternalError = "InternalError".asInstanceOf[ErrorCode]
  val InvalidRequest = "InvalidRequest".asInstanceOf[ErrorCode]

  @inline def values: js.Array[ErrorCode] = js.Array(InternalError, InvalidRequest)
}

@js.native
sealed trait FaqFileFormat extends js.Any
object FaqFileFormat {
  val CSV = "CSV".asInstanceOf[FaqFileFormat]
  val CSV_WITH_HEADER = "CSV_WITH_HEADER".asInstanceOf[FaqFileFormat]
  val JSON = "JSON".asInstanceOf[FaqFileFormat]

  @inline def values: js.Array[FaqFileFormat] = js.Array(CSV, CSV_WITH_HEADER, JSON)
}

@js.native
sealed trait FaqStatus extends js.Any
object FaqStatus {
  val CREATING = "CREATING".asInstanceOf[FaqStatus]
  val UPDATING = "UPDATING".asInstanceOf[FaqStatus]
  val ACTIVE = "ACTIVE".asInstanceOf[FaqStatus]
  val DELETING = "DELETING".asInstanceOf[FaqStatus]
  val FAILED = "FAILED".asInstanceOf[FaqStatus]

  @inline def values: js.Array[FaqStatus] = js.Array(CREATING, UPDATING, ACTIVE, DELETING, FAILED)
}

@js.native
sealed trait HighlightType extends js.Any
object HighlightType {
  val STANDARD = "STANDARD".asInstanceOf[HighlightType]
  val THESAURUS_SYNONYM = "THESAURUS_SYNONYM".asInstanceOf[HighlightType]

  @inline def values: js.Array[HighlightType] = js.Array(STANDARD, THESAURUS_SYNONYM)
}

@js.native
sealed trait IndexEdition extends js.Any
object IndexEdition {
  val DEVELOPER_EDITION = "DEVELOPER_EDITION".asInstanceOf[IndexEdition]
  val ENTERPRISE_EDITION = "ENTERPRISE_EDITION".asInstanceOf[IndexEdition]

  @inline def values: js.Array[IndexEdition] = js.Array(DEVELOPER_EDITION, ENTERPRISE_EDITION)
}

@js.native
sealed trait IndexStatus extends js.Any
object IndexStatus {
  val CREATING = "CREATING".asInstanceOf[IndexStatus]
  val ACTIVE = "ACTIVE".asInstanceOf[IndexStatus]
  val DELETING = "DELETING".asInstanceOf[IndexStatus]
  val FAILED = "FAILED".asInstanceOf[IndexStatus]
  val UPDATING = "UPDATING".asInstanceOf[IndexStatus]
  val SYSTEM_UPDATING = "SYSTEM_UPDATING".asInstanceOf[IndexStatus]

  @inline def values: js.Array[IndexStatus] = js.Array(CREATING, ACTIVE, DELETING, FAILED, UPDATING, SYSTEM_UPDATING)
}

@js.native
sealed trait KeyLocation extends js.Any
object KeyLocation {
  val URL = "URL".asInstanceOf[KeyLocation]
  val SECRET_MANAGER = "SECRET_MANAGER".asInstanceOf[KeyLocation]

  @inline def values: js.Array[KeyLocation] = js.Array(URL, SECRET_MANAGER)
}

@js.native
sealed trait Order extends js.Any
object Order {
  val ASCENDING = "ASCENDING".asInstanceOf[Order]
  val DESCENDING = "DESCENDING".asInstanceOf[Order]

  @inline def values: js.Array[Order] = js.Array(ASCENDING, DESCENDING)
}

@js.native
sealed trait PrincipalType extends js.Any
object PrincipalType {
  val USER = "USER".asInstanceOf[PrincipalType]
  val GROUP = "GROUP".asInstanceOf[PrincipalType]

  @inline def values: js.Array[PrincipalType] = js.Array(USER, GROUP)
}

@js.native
sealed trait QueryIdentifiersEnclosingOption extends js.Any
object QueryIdentifiersEnclosingOption {
  val DOUBLE_QUOTES = "DOUBLE_QUOTES".asInstanceOf[QueryIdentifiersEnclosingOption]
  val NONE = "NONE".asInstanceOf[QueryIdentifiersEnclosingOption]

  @inline def values: js.Array[QueryIdentifiersEnclosingOption] = js.Array(DOUBLE_QUOTES, NONE)
}

@js.native
sealed trait QueryResultType extends js.Any
object QueryResultType {
  val DOCUMENT = "DOCUMENT".asInstanceOf[QueryResultType]
  val QUESTION_ANSWER = "QUESTION_ANSWER".asInstanceOf[QueryResultType]
  val ANSWER = "ANSWER".asInstanceOf[QueryResultType]

  @inline def values: js.Array[QueryResultType] = js.Array(DOCUMENT, QUESTION_ANSWER, ANSWER)
}

@js.native
sealed trait ReadAccessType extends js.Any
object ReadAccessType {
  val ALLOW = "ALLOW".asInstanceOf[ReadAccessType]
  val DENY = "DENY".asInstanceOf[ReadAccessType]

  @inline def values: js.Array[ReadAccessType] = js.Array(ALLOW, DENY)
}

@js.native
sealed trait RelevanceType extends js.Any
object RelevanceType {
  val RELEVANT = "RELEVANT".asInstanceOf[RelevanceType]
  val NOT_RELEVANT = "NOT_RELEVANT".asInstanceOf[RelevanceType]

  @inline def values: js.Array[RelevanceType] = js.Array(RELEVANT, NOT_RELEVANT)
}

@js.native
sealed trait SalesforceChatterFeedIncludeFilterType extends js.Any
object SalesforceChatterFeedIncludeFilterType {
  val ACTIVE_USER = "ACTIVE_USER".asInstanceOf[SalesforceChatterFeedIncludeFilterType]
  val STANDARD_USER = "STANDARD_USER".asInstanceOf[SalesforceChatterFeedIncludeFilterType]

  @inline def values: js.Array[SalesforceChatterFeedIncludeFilterType] = js.Array(ACTIVE_USER, STANDARD_USER)
}

@js.native
sealed trait SalesforceKnowledgeArticleState extends js.Any
object SalesforceKnowledgeArticleState {
  val DRAFT = "DRAFT".asInstanceOf[SalesforceKnowledgeArticleState]
  val PUBLISHED = "PUBLISHED".asInstanceOf[SalesforceKnowledgeArticleState]
  val ARCHIVED = "ARCHIVED".asInstanceOf[SalesforceKnowledgeArticleState]

  @inline def values: js.Array[SalesforceKnowledgeArticleState] = js.Array(DRAFT, PUBLISHED, ARCHIVED)
}

@js.native
sealed trait SalesforceStandardObjectName extends js.Any
object SalesforceStandardObjectName {
  val ACCOUNT = "ACCOUNT".asInstanceOf[SalesforceStandardObjectName]
  val CAMPAIGN = "CAMPAIGN".asInstanceOf[SalesforceStandardObjectName]
  val CASE = "CASE".asInstanceOf[SalesforceStandardObjectName]
  val CONTACT = "CONTACT".asInstanceOf[SalesforceStandardObjectName]
  val CONTRACT = "CONTRACT".asInstanceOf[SalesforceStandardObjectName]
  val DOCUMENT = "DOCUMENT".asInstanceOf[SalesforceStandardObjectName]
  val GROUP = "GROUP".asInstanceOf[SalesforceStandardObjectName]
  val IDEA = "IDEA".asInstanceOf[SalesforceStandardObjectName]
  val LEAD = "LEAD".asInstanceOf[SalesforceStandardObjectName]
  val OPPORTUNITY = "OPPORTUNITY".asInstanceOf[SalesforceStandardObjectName]
  val PARTNER = "PARTNER".asInstanceOf[SalesforceStandardObjectName]
  val PRICEBOOK = "PRICEBOOK".asInstanceOf[SalesforceStandardObjectName]
  val PRODUCT = "PRODUCT".asInstanceOf[SalesforceStandardObjectName]
  val PROFILE = "PROFILE".asInstanceOf[SalesforceStandardObjectName]
  val SOLUTION = "SOLUTION".asInstanceOf[SalesforceStandardObjectName]
  val TASK = "TASK".asInstanceOf[SalesforceStandardObjectName]
  val USER = "USER".asInstanceOf[SalesforceStandardObjectName]

  @inline def values: js.Array[SalesforceStandardObjectName] = js.Array(ACCOUNT, CAMPAIGN, CASE, CONTACT, CONTRACT, DOCUMENT, GROUP, IDEA, LEAD, OPPORTUNITY, PARTNER, PRICEBOOK, PRODUCT, PROFILE, SOLUTION, TASK, USER)
}

/** Enumeration for query score confidence.
  */
@js.native
sealed trait ScoreConfidence extends js.Any
object ScoreConfidence {
  val VERY_HIGH = "VERY_HIGH".asInstanceOf[ScoreConfidence]
  val HIGH = "HIGH".asInstanceOf[ScoreConfidence]
  val MEDIUM = "MEDIUM".asInstanceOf[ScoreConfidence]
  val LOW = "LOW".asInstanceOf[ScoreConfidence]

  @inline def values: js.Array[ScoreConfidence] = js.Array(VERY_HIGH, HIGH, MEDIUM, LOW)
}

@js.native
sealed trait ServiceNowAuthenticationType extends js.Any
object ServiceNowAuthenticationType {
  val HTTP_BASIC = "HTTP_BASIC".asInstanceOf[ServiceNowAuthenticationType]
  val OAUTH2 = "OAUTH2".asInstanceOf[ServiceNowAuthenticationType]

  @inline def values: js.Array[ServiceNowAuthenticationType] = js.Array(HTTP_BASIC, OAUTH2)
}

@js.native
sealed trait ServiceNowBuildVersionType extends js.Any
object ServiceNowBuildVersionType {
  val LONDON = "LONDON".asInstanceOf[ServiceNowBuildVersionType]
  val OTHERS = "OTHERS".asInstanceOf[ServiceNowBuildVersionType]

  @inline def values: js.Array[ServiceNowBuildVersionType] = js.Array(LONDON, OTHERS)
}

@js.native
sealed trait SharePointVersion extends js.Any
object SharePointVersion {
  val SHAREPOINT_ONLINE = "SHAREPOINT_ONLINE".asInstanceOf[SharePointVersion]

  @inline def values: js.Array[SharePointVersion] = js.Array(SHAREPOINT_ONLINE)
}

@js.native
sealed trait SortOrder extends js.Any
object SortOrder {
  val DESC = "DESC".asInstanceOf[SortOrder]
  val ASC = "ASC".asInstanceOf[SortOrder]

  @inline def values: js.Array[SortOrder] = js.Array(DESC, ASC)
}

@js.native
sealed trait ThesaurusStatus extends js.Any
object ThesaurusStatus {
  val CREATING = "CREATING".asInstanceOf[ThesaurusStatus]
  val ACTIVE = "ACTIVE".asInstanceOf[ThesaurusStatus]
  val DELETING = "DELETING".asInstanceOf[ThesaurusStatus]
  val UPDATING = "UPDATING".asInstanceOf[ThesaurusStatus]
  val ACTIVE_BUT_UPDATE_FAILED = "ACTIVE_BUT_UPDATE_FAILED".asInstanceOf[ThesaurusStatus]
  val FAILED = "FAILED".asInstanceOf[ThesaurusStatus]

  @inline def values: js.Array[ThesaurusStatus] = js.Array(CREATING, ACTIVE, DELETING, UPDATING, ACTIVE_BUT_UPDATE_FAILED, FAILED)
}

@js.native
sealed trait UserContextPolicy extends js.Any
object UserContextPolicy {
  val ATTRIBUTE_FILTER = "ATTRIBUTE_FILTER".asInstanceOf[UserContextPolicy]
  val USER_TOKEN = "USER_TOKEN".asInstanceOf[UserContextPolicy]

  @inline def values: js.Array[UserContextPolicy] = js.Array(ATTRIBUTE_FILTER, USER_TOKEN)
}
