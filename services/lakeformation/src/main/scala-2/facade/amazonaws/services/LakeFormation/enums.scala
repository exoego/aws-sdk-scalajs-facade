package facade.amazonaws.services.lakeformation

import scalajs.js

@js.native
sealed trait ComparisonOperator extends js.Any
object ComparisonOperator {
  val EQ = "EQ".asInstanceOf[ComparisonOperator]
  val NE = "NE".asInstanceOf[ComparisonOperator]
  val LE = "LE".asInstanceOf[ComparisonOperator]
  val LT = "LT".asInstanceOf[ComparisonOperator]
  val GE = "GE".asInstanceOf[ComparisonOperator]
  val GT = "GT".asInstanceOf[ComparisonOperator]
  val CONTAINS = "CONTAINS".asInstanceOf[ComparisonOperator]
  val NOT_CONTAINS = "NOT_CONTAINS".asInstanceOf[ComparisonOperator]
  val BEGINS_WITH = "BEGINS_WITH".asInstanceOf[ComparisonOperator]
  val IN = "IN".asInstanceOf[ComparisonOperator]
  val BETWEEN = "BETWEEN".asInstanceOf[ComparisonOperator]

  @inline def values: js.Array[ComparisonOperator] = js.Array(EQ, NE, LE, LT, GE, GT, CONTAINS, NOT_CONTAINS, BEGINS_WITH, IN, BETWEEN)
}

@js.native
sealed trait DataLakeResourceType extends js.Any
object DataLakeResourceType {
  val CATALOG = "CATALOG".asInstanceOf[DataLakeResourceType]
  val DATABASE = "DATABASE".asInstanceOf[DataLakeResourceType]
  val TABLE = "TABLE".asInstanceOf[DataLakeResourceType]
  val DATA_LOCATION = "DATA_LOCATION".asInstanceOf[DataLakeResourceType]
  val LF_TAG = "LF_TAG".asInstanceOf[DataLakeResourceType]
  val LF_TAG_POLICY = "LF_TAG_POLICY".asInstanceOf[DataLakeResourceType]
  val LF_TAG_POLICY_DATABASE = "LF_TAG_POLICY_DATABASE".asInstanceOf[DataLakeResourceType]
  val LF_TAG_POLICY_TABLE = "LF_TAG_POLICY_TABLE".asInstanceOf[DataLakeResourceType]

  @inline def values: js.Array[DataLakeResourceType] = js.Array(CATALOG, DATABASE, TABLE, DATA_LOCATION, LF_TAG, LF_TAG_POLICY, LF_TAG_POLICY_DATABASE, LF_TAG_POLICY_TABLE)
}

@js.native
sealed trait FieldNameString extends js.Any
object FieldNameString {
  val RESOURCE_ARN = "RESOURCE_ARN".asInstanceOf[FieldNameString]
  val ROLE_ARN = "ROLE_ARN".asInstanceOf[FieldNameString]
  val LAST_MODIFIED = "LAST_MODIFIED".asInstanceOf[FieldNameString]

  @inline def values: js.Array[FieldNameString] = js.Array(RESOURCE_ARN, ROLE_ARN, LAST_MODIFIED)
}

@js.native
sealed trait OptimizerType extends js.Any
object OptimizerType {
  val COMPACTION = "COMPACTION".asInstanceOf[OptimizerType]
  val GARBAGE_COLLECTION = "GARBAGE_COLLECTION".asInstanceOf[OptimizerType]
  val ALL = "ALL".asInstanceOf[OptimizerType]

  @inline def values: js.Array[OptimizerType] = js.Array(COMPACTION, GARBAGE_COLLECTION, ALL)
}

@js.native
sealed trait Permission extends js.Any
object Permission {
  val ALL = "ALL".asInstanceOf[Permission]
  val SELECT = "SELECT".asInstanceOf[Permission]
  val ALTER = "ALTER".asInstanceOf[Permission]
  val DROP = "DROP".asInstanceOf[Permission]
  val DELETE = "DELETE".asInstanceOf[Permission]
  val INSERT = "INSERT".asInstanceOf[Permission]
  val DESCRIBE = "DESCRIBE".asInstanceOf[Permission]
  val CREATE_DATABASE = "CREATE_DATABASE".asInstanceOf[Permission]
  val CREATE_TABLE = "CREATE_TABLE".asInstanceOf[Permission]
  val DATA_LOCATION_ACCESS = "DATA_LOCATION_ACCESS".asInstanceOf[Permission]
  val CREATE_TAG = "CREATE_TAG".asInstanceOf[Permission]
  val ALTER_TAG = "ALTER_TAG".asInstanceOf[Permission]
  val DELETE_TAG = "DELETE_TAG".asInstanceOf[Permission]
  val DESCRIBE_TAG = "DESCRIBE_TAG".asInstanceOf[Permission]
  val ASSOCIATE_TAG = "ASSOCIATE_TAG".asInstanceOf[Permission]

  @inline def values: js.Array[Permission] = js.Array(
    ALL,
    SELECT,
    ALTER,
    DROP,
    DELETE,
    INSERT,
    DESCRIBE,
    CREATE_DATABASE,
    CREATE_TABLE,
    DATA_LOCATION_ACCESS,
    CREATE_TAG,
    ALTER_TAG,
    DELETE_TAG,
    DESCRIBE_TAG,
    ASSOCIATE_TAG
  )
}

@js.native
sealed trait QueryStateString extends js.Any
object QueryStateString {
  val PENDING = "PENDING".asInstanceOf[QueryStateString]
  val WORKUNITS_AVAILABLE = "WORKUNITS_AVAILABLE".asInstanceOf[QueryStateString]
  val ERROR = "ERROR".asInstanceOf[QueryStateString]
  val FINISHED = "FINISHED".asInstanceOf[QueryStateString]
  val EXPIRED = "EXPIRED".asInstanceOf[QueryStateString]

  @inline def values: js.Array[QueryStateString] = js.Array(PENDING, WORKUNITS_AVAILABLE, ERROR, FINISHED, EXPIRED)
}

@js.native
sealed trait ResourceShareType extends js.Any
object ResourceShareType {
  val FOREIGN = "FOREIGN".asInstanceOf[ResourceShareType]
  val ALL = "ALL".asInstanceOf[ResourceShareType]

  @inline def values: js.Array[ResourceShareType] = js.Array(FOREIGN, ALL)
}

@js.native
sealed trait ResourceType extends js.Any
object ResourceType {
  val DATABASE = "DATABASE".asInstanceOf[ResourceType]
  val TABLE = "TABLE".asInstanceOf[ResourceType]

  @inline def values: js.Array[ResourceType] = js.Array(DATABASE, TABLE)
}

@js.native
sealed trait TransactionStatus extends js.Any
object TransactionStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[TransactionStatus]
  val COMMITTED = "COMMITTED".asInstanceOf[TransactionStatus]
  val ABORTED = "ABORTED".asInstanceOf[TransactionStatus]
  val COMMIT_IN_PROGRESS = "COMMIT_IN_PROGRESS".asInstanceOf[TransactionStatus]

  @inline def values: js.Array[TransactionStatus] = js.Array(ACTIVE, COMMITTED, ABORTED, COMMIT_IN_PROGRESS)
}

@js.native
sealed trait TransactionStatusFilter extends js.Any
object TransactionStatusFilter {
  val ALL = "ALL".asInstanceOf[TransactionStatusFilter]
  val COMPLETED = "COMPLETED".asInstanceOf[TransactionStatusFilter]
  val ACTIVE = "ACTIVE".asInstanceOf[TransactionStatusFilter]
  val COMMITTED = "COMMITTED".asInstanceOf[TransactionStatusFilter]
  val ABORTED = "ABORTED".asInstanceOf[TransactionStatusFilter]

  @inline def values: js.Array[TransactionStatusFilter] = js.Array(ALL, COMPLETED, ACTIVE, COMMITTED, ABORTED)
}

@js.native
sealed trait TransactionType extends js.Any
object TransactionType {
  val READ_AND_WRITE = "READ_AND_WRITE".asInstanceOf[TransactionType]
  val READ_ONLY = "READ_ONLY".asInstanceOf[TransactionType]

  @inline def values: js.Array[TransactionType] = js.Array(READ_AND_WRITE, READ_ONLY)
}
