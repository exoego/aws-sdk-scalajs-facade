package facade.amazonaws.services.lakeformation

import scalajs._

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

type DataLakeResourceType = "CATALOG" | "DATABASE" | "TABLE" | "DATA_LOCATION"
object DataLakeResourceType {
  inline val CATALOG: "CATALOG" = "CATALOG"
  inline val DATABASE: "DATABASE" = "DATABASE"
  inline val TABLE: "TABLE" = "TABLE"
  inline val DATA_LOCATION: "DATA_LOCATION" = "DATA_LOCATION"

  inline def values: js.Array[DataLakeResourceType] = js.Array(CATALOG, DATABASE, TABLE, DATA_LOCATION)
}

type FieldNameString = "RESOURCE_ARN" | "ROLE_ARN" | "LAST_MODIFIED"
object FieldNameString {
  inline val RESOURCE_ARN: "RESOURCE_ARN" = "RESOURCE_ARN"
  inline val ROLE_ARN: "ROLE_ARN" = "ROLE_ARN"
  inline val LAST_MODIFIED: "LAST_MODIFIED" = "LAST_MODIFIED"

  inline def values: js.Array[FieldNameString] = js.Array(RESOURCE_ARN, ROLE_ARN, LAST_MODIFIED)
}

type Permission = "ALL" | "SELECT" | "ALTER" | "DROP" | "DELETE" | "INSERT" | "DESCRIBE" | "CREATE_DATABASE" | "CREATE_TABLE" | "DATA_LOCATION_ACCESS"
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

  inline def values: js.Array[Permission] = js.Array(ALL, SELECT, ALTER, DROP, DELETE, INSERT, DESCRIBE, CREATE_DATABASE, CREATE_TABLE, DATA_LOCATION_ACCESS)
}
