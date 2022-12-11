package facade.amazonaws.services.lakeformation

import scalajs.js

type ComparisonOperator = "EQ" | "NE" | "LE" | "LT" | "GE" | "GT" | "CONTAINS" | "NOT_CONTAINS" | "BEGINS_WITH" | "IN" | "BETWEEN"
object ComparisonOperator {
  inline val EQ: "EQ" = "EQ"
  inline val NE: "NE" = "NE"
  inline val LE: "LE" = "LE"
  inline val LT: "LT" = "LT"
  inline val GE: "GE" = "GE"
  inline val GT: "GT" = "GT"
  inline val CONTAINS: "CONTAINS" = "CONTAINS"
  inline val NOT_CONTAINS: "NOT_CONTAINS" = "NOT_CONTAINS"
  inline val BEGINS_WITH: "BEGINS_WITH" = "BEGINS_WITH"
  inline val IN: "IN" = "IN"
  inline val BETWEEN: "BETWEEN" = "BETWEEN"

  inline def values: js.Array[ComparisonOperator] = js.Array(EQ, NE, LE, LT, GE, GT, CONTAINS, NOT_CONTAINS, BEGINS_WITH, IN, BETWEEN)
}

type DataLakeResourceType = "CATALOG" | "DATABASE" | "TABLE" | "DATA_LOCATION" | "LF_TAG" | "LF_TAG_POLICY" | "LF_TAG_POLICY_DATABASE" | "LF_TAG_POLICY_TABLE"
object DataLakeResourceType {
  inline val CATALOG: "CATALOG" = "CATALOG"
  inline val DATABASE: "DATABASE" = "DATABASE"
  inline val TABLE: "TABLE" = "TABLE"
  inline val DATA_LOCATION: "DATA_LOCATION" = "DATA_LOCATION"
  inline val LF_TAG: "LF_TAG" = "LF_TAG"
  inline val LF_TAG_POLICY: "LF_TAG_POLICY" = "LF_TAG_POLICY"
  inline val LF_TAG_POLICY_DATABASE: "LF_TAG_POLICY_DATABASE" = "LF_TAG_POLICY_DATABASE"
  inline val LF_TAG_POLICY_TABLE: "LF_TAG_POLICY_TABLE" = "LF_TAG_POLICY_TABLE"

  inline def values: js.Array[DataLakeResourceType] = js.Array(CATALOG, DATABASE, TABLE, DATA_LOCATION, LF_TAG, LF_TAG_POLICY, LF_TAG_POLICY_DATABASE, LF_TAG_POLICY_TABLE)
}

type FieldNameString = "RESOURCE_ARN" | "ROLE_ARN" | "LAST_MODIFIED"
object FieldNameString {
  inline val RESOURCE_ARN: "RESOURCE_ARN" = "RESOURCE_ARN"
  inline val ROLE_ARN: "ROLE_ARN" = "ROLE_ARN"
  inline val LAST_MODIFIED: "LAST_MODIFIED" = "LAST_MODIFIED"

  inline def values: js.Array[FieldNameString] = js.Array(RESOURCE_ARN, ROLE_ARN, LAST_MODIFIED)
}

type OptimizerType = "COMPACTION" | "GARBAGE_COLLECTION" | "ALL"
object OptimizerType {
  inline val COMPACTION: "COMPACTION" = "COMPACTION"
  inline val GARBAGE_COLLECTION: "GARBAGE_COLLECTION" = "GARBAGE_COLLECTION"
  inline val ALL: "ALL" = "ALL"

  inline def values: js.Array[OptimizerType] = js.Array(COMPACTION, GARBAGE_COLLECTION, ALL)
}

type Permission = "ALL" | "SELECT" | "ALTER" | "DROP" | "DELETE" | "INSERT" | "DESCRIBE" | "CREATE_DATABASE" | "CREATE_TABLE" | "DATA_LOCATION_ACCESS" | "CREATE_TAG" | "ASSOCIATE"
object Permission {
  inline val ALL: "ALL" = "ALL"
  inline val SELECT: "SELECT" = "SELECT"
  inline val ALTER: "ALTER" = "ALTER"
  inline val DROP: "DROP" = "DROP"
  inline val DELETE: "DELETE" = "DELETE"
  inline val INSERT: "INSERT" = "INSERT"
  inline val DESCRIBE: "DESCRIBE" = "DESCRIBE"
  inline val CREATE_DATABASE: "CREATE_DATABASE" = "CREATE_DATABASE"
  inline val CREATE_TABLE: "CREATE_TABLE" = "CREATE_TABLE"
  inline val DATA_LOCATION_ACCESS: "DATA_LOCATION_ACCESS" = "DATA_LOCATION_ACCESS"
  inline val CREATE_TAG: "CREATE_TAG" = "CREATE_TAG"
  inline val ASSOCIATE: "ASSOCIATE" = "ASSOCIATE"

  inline def values: js.Array[Permission] = js.Array(ALL, SELECT, ALTER, DROP, DELETE, INSERT, DESCRIBE, CREATE_DATABASE, CREATE_TABLE, DATA_LOCATION_ACCESS, CREATE_TAG, ASSOCIATE)
}

type PermissionType = "COLUMN_PERMISSION" | "CELL_FILTER_PERMISSION"
object PermissionType {
  inline val COLUMN_PERMISSION: "COLUMN_PERMISSION" = "COLUMN_PERMISSION"
  inline val CELL_FILTER_PERMISSION: "CELL_FILTER_PERMISSION" = "CELL_FILTER_PERMISSION"

  inline def values: js.Array[PermissionType] = js.Array(COLUMN_PERMISSION, CELL_FILTER_PERMISSION)
}

type QueryStateString = "PENDING" | "WORKUNITS_AVAILABLE" | "ERROR" | "FINISHED" | "EXPIRED"
object QueryStateString {
  inline val PENDING: "PENDING" = "PENDING"
  inline val WORKUNITS_AVAILABLE: "WORKUNITS_AVAILABLE" = "WORKUNITS_AVAILABLE"
  inline val ERROR: "ERROR" = "ERROR"
  inline val FINISHED: "FINISHED" = "FINISHED"
  inline val EXPIRED: "EXPIRED" = "EXPIRED"

  inline def values: js.Array[QueryStateString] = js.Array(PENDING, WORKUNITS_AVAILABLE, ERROR, FINISHED, EXPIRED)
}

type ResourceShareType = "FOREIGN" | "ALL"
object ResourceShareType {
  inline val FOREIGN: "FOREIGN" = "FOREIGN"
  inline val ALL: "ALL" = "ALL"

  inline def values: js.Array[ResourceShareType] = js.Array(FOREIGN, ALL)
}

type ResourceType = "DATABASE" | "TABLE"
object ResourceType {
  inline val DATABASE: "DATABASE" = "DATABASE"
  inline val TABLE: "TABLE" = "TABLE"

  inline def values: js.Array[ResourceType] = js.Array(DATABASE, TABLE)
}

type TransactionStatus = "ACTIVE" | "COMMITTED" | "ABORTED" | "COMMIT_IN_PROGRESS"
object TransactionStatus {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val COMMITTED: "COMMITTED" = "COMMITTED"
  inline val ABORTED: "ABORTED" = "ABORTED"
  inline val COMMIT_IN_PROGRESS: "COMMIT_IN_PROGRESS" = "COMMIT_IN_PROGRESS"

  inline def values: js.Array[TransactionStatus] = js.Array(ACTIVE, COMMITTED, ABORTED, COMMIT_IN_PROGRESS)
}

type TransactionStatusFilter = "ALL" | "COMPLETED" | "ACTIVE" | "COMMITTED" | "ABORTED"
object TransactionStatusFilter {
  inline val ALL: "ALL" = "ALL"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val COMMITTED: "COMMITTED" = "COMMITTED"
  inline val ABORTED: "ABORTED" = "ABORTED"

  inline def values: js.Array[TransactionStatusFilter] = js.Array(ALL, COMPLETED, ACTIVE, COMMITTED, ABORTED)
}

type TransactionType = "READ_AND_WRITE" | "READ_ONLY"
object TransactionType {
  inline val READ_AND_WRITE: "READ_AND_WRITE" = "READ_AND_WRITE"
  inline val READ_ONLY: "READ_ONLY" = "READ_ONLY"

  inline def values: js.Array[TransactionType] = js.Array(READ_AND_WRITE, READ_ONLY)
}
