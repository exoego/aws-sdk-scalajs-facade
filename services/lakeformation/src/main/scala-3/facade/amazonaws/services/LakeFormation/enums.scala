package facade.amazonaws.services.lakeformation

import scalajs._
import scala.scalajs.js.|

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

  @inline def values = js.Array(EQ, NE, LE, LT, GE, GT, CONTAINS, NOT_CONTAINS, BEGINS_WITH, IN, BETWEEN)
}

@js.native
sealed trait DataLakeResourceType extends js.Any
object DataLakeResourceType {
  val CATALOG = "CATALOG".asInstanceOf[DataLakeResourceType]
  val DATABASE = "DATABASE".asInstanceOf[DataLakeResourceType]
  val TABLE = "TABLE".asInstanceOf[DataLakeResourceType]
  val DATA_LOCATION = "DATA_LOCATION".asInstanceOf[DataLakeResourceType]

  @inline def values = js.Array(CATALOG, DATABASE, TABLE, DATA_LOCATION)
}

@js.native
sealed trait FieldNameString extends js.Any
object FieldNameString {
  val RESOURCE_ARN = "RESOURCE_ARN".asInstanceOf[FieldNameString]
  val ROLE_ARN = "ROLE_ARN".asInstanceOf[FieldNameString]
  val LAST_MODIFIED = "LAST_MODIFIED".asInstanceOf[FieldNameString]

  @inline def values = js.Array(RESOURCE_ARN, ROLE_ARN, LAST_MODIFIED)
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

  @inline def values = js.Array(ALL, SELECT, ALTER, DROP, DELETE, INSERT, DESCRIBE, CREATE_DATABASE, CREATE_TABLE, DATA_LOCATION_ACCESS)
}
