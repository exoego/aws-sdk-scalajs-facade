package facade.amazonaws.services.lakeformation

import scalajs._

type ComparisonOperator = "EQ" | "NE" | "LE" | "LT" | "GE" | "GT" | "CONTAINS" | "NOT_CONTAINS" | "BEGINS_WITH" | "IN" | "BETWEEN"
object ComparisonOperator {
  val EQ: "EQ" = "EQ"
  val NE: "NE" = "NE"
  val LE: "LE" = "LE"
  val LT: "LT" = "LT"
  val GE: "GE" = "GE"
  val GT: "GT" = "GT"
  val CONTAINS: "CONTAINS" = "CONTAINS"
  val NOT_CONTAINS: "NOT_CONTAINS" = "NOT_CONTAINS"
  val BEGINS_WITH: "BEGINS_WITH" = "BEGINS_WITH"
  val IN: "IN" = "IN"
  val BETWEEN: "BETWEEN" = "BETWEEN"

  @inline def values = js.Array[ComparisonOperator](EQ, NE, LE, LT, GE, GT, CONTAINS, NOT_CONTAINS, BEGINS_WITH, IN, BETWEEN)
}

type DataLakeResourceType = "CATALOG" | "DATABASE" | "TABLE" | "DATA_LOCATION"
object DataLakeResourceType {
  val CATALOG: "CATALOG" = "CATALOG"
  val DATABASE: "DATABASE" = "DATABASE"
  val TABLE: "TABLE" = "TABLE"
  val DATA_LOCATION: "DATA_LOCATION" = "DATA_LOCATION"

  @inline def values = js.Array[DataLakeResourceType](CATALOG, DATABASE, TABLE, DATA_LOCATION)
}

type FieldNameString = "RESOURCE_ARN" | "ROLE_ARN" | "LAST_MODIFIED"
object FieldNameString {
  val RESOURCE_ARN: "RESOURCE_ARN" = "RESOURCE_ARN"
  val ROLE_ARN: "ROLE_ARN" = "ROLE_ARN"
  val LAST_MODIFIED: "LAST_MODIFIED" = "LAST_MODIFIED"

  @inline def values = js.Array[FieldNameString](RESOURCE_ARN, ROLE_ARN, LAST_MODIFIED)
}

type Permission = "ALL" | "SELECT" | "ALTER" | "DROP" | "DELETE" | "INSERT" | "DESCRIBE" | "CREATE_DATABASE" | "CREATE_TABLE" | "DATA_LOCATION_ACCESS"
object Permission {
  val ALL: "ALL" = "ALL"
  val SELECT: "SELECT" = "SELECT"
  val ALTER: "ALTER" = "ALTER"
  val DROP: "DROP" = "DROP"
  val DELETE: "DELETE" = "DELETE"
  val INSERT: "INSERT" = "INSERT"
  val DESCRIBE: "DESCRIBE" = "DESCRIBE"
  val CREATE_DATABASE: "CREATE_DATABASE" = "CREATE_DATABASE"
  val CREATE_TABLE: "CREATE_TABLE" = "CREATE_TABLE"
  val DATA_LOCATION_ACCESS: "DATA_LOCATION_ACCESS" = "DATA_LOCATION_ACCESS"

  @inline def values = js.Array[Permission](ALL, SELECT, ALTER, DROP, DELETE, INSERT, DESCRIBE, CREATE_DATABASE, CREATE_TABLE, DATA_LOCATION_ACCESS)
}
