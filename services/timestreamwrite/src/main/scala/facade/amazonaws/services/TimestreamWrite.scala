package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object timestreamwrite {
  type AmazonResourceName = String
  type DatabaseList = js.Array[Database]
  type Date = js.Date
  type Dimensions = js.Array[Dimension]
  type Endpoints = js.Array[Endpoint]
  type MagneticStoreRetentionPeriodInDays = Double
  type MemoryStoreRetentionPeriodInHours = Double
  type PaginationLimit = Int
  type Records = js.Array[Record]
  type ResourceName = String
  type StringValue2048 = String
  type StringValue256 = String
  type TableList = js.Array[Table]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String

  implicit final class TimestreamWriteOps(private val service: TimestreamWrite) extends AnyVal {

    @inline def createDatabaseFuture(params: CreateDatabaseRequest): Future[CreateDatabaseResponse] = service.createDatabase(params).promise().toFuture
    @inline def createTableFuture(params: CreateTableRequest): Future[CreateTableResponse] = service.createTable(params).promise().toFuture
    @inline def deleteDatabaseFuture(params: DeleteDatabaseRequest): Future[js.Object] = service.deleteDatabase(params).promise().toFuture
    @inline def deleteTableFuture(params: DeleteTableRequest): Future[js.Object] = service.deleteTable(params).promise().toFuture
    @inline def describeDatabaseFuture(params: DescribeDatabaseRequest): Future[DescribeDatabaseResponse] = service.describeDatabase(params).promise().toFuture
    @inline def describeEndpointsFuture(params: DescribeEndpointsRequest): Future[DescribeEndpointsResponse] = service.describeEndpoints(params).promise().toFuture
    @inline def describeTableFuture(params: DescribeTableRequest): Future[DescribeTableResponse] = service.describeTable(params).promise().toFuture
    @inline def listDatabasesFuture(params: ListDatabasesRequest): Future[ListDatabasesResponse] = service.listDatabases(params).promise().toFuture
    @inline def listTablesFuture(params: ListTablesRequest): Future[ListTablesResponse] = service.listTables(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateDatabaseFuture(params: UpdateDatabaseRequest): Future[UpdateDatabaseResponse] = service.updateDatabase(params).promise().toFuture
    @inline def updateTableFuture(params: UpdateTableRequest): Future[UpdateTableResponse] = service.updateTable(params).promise().toFuture
    @inline def writeRecordsFuture(params: WriteRecordsRequest): Future[js.Object] = service.writeRecords(params).promise().toFuture

  }
}

package timestreamwrite {
  @js.native
  @JSImport("aws-sdk/clients/timestreamwrite", JSImport.Namespace, "AWS.TimestreamWrite")
  class TimestreamWrite() extends js.Object {
    def this(config: AWSConfig) = this()

    def createDatabase(params: CreateDatabaseRequest): Request[CreateDatabaseResponse] = js.native
    def createTable(params: CreateTableRequest): Request[CreateTableResponse] = js.native
    def deleteDatabase(params: DeleteDatabaseRequest): Request[js.Object] = js.native
    def deleteTable(params: DeleteTableRequest): Request[js.Object] = js.native
    def describeDatabase(params: DescribeDatabaseRequest): Request[DescribeDatabaseResponse] = js.native
    def describeEndpoints(params: DescribeEndpointsRequest): Request[DescribeEndpointsResponse] = js.native
    def describeTable(params: DescribeTableRequest): Request[DescribeTableResponse] = js.native
    def listDatabases(params: ListDatabasesRequest): Request[ListDatabasesResponse] = js.native
    def listTables(params: ListTablesRequest): Request[ListTablesResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateDatabase(params: UpdateDatabaseRequest): Request[UpdateDatabaseResponse] = js.native
    def updateTable(params: UpdateTableRequest): Request[UpdateTableResponse] = js.native
    def writeRecords(params: WriteRecordsRequest): Request[js.Object] = js.native
  }

  @js.native
  trait CreateDatabaseRequest extends js.Object {
    var DatabaseName: ResourceName
    var KmsKeyId: js.UndefOr[StringValue2048]
    var Tags: js.UndefOr[TagList]
  }

  object CreateDatabaseRequest {
    @inline
    def apply(
        DatabaseName: ResourceName,
        KmsKeyId: js.UndefOr[StringValue2048] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateDatabaseRequest = {
      val __obj = js.Dynamic.literal(
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any]
      )

      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDatabaseRequest]
    }
  }

  @js.native
  trait CreateDatabaseResponse extends js.Object {
    var Database: js.UndefOr[Database]
  }

  object CreateDatabaseResponse {
    @inline
    def apply(
        Database: js.UndefOr[Database] = js.undefined
    ): CreateDatabaseResponse = {
      val __obj = js.Dynamic.literal()
      Database.foreach(__v => __obj.updateDynamic("Database")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDatabaseResponse]
    }
  }

  @js.native
  trait CreateTableRequest extends js.Object {
    var DatabaseName: ResourceName
    var TableName: ResourceName
    var RetentionProperties: js.UndefOr[RetentionProperties]
    var Tags: js.UndefOr[TagList]
  }

  object CreateTableRequest {
    @inline
    def apply(
        DatabaseName: ResourceName,
        TableName: ResourceName,
        RetentionProperties: js.UndefOr[RetentionProperties] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateTableRequest = {
      val __obj = js.Dynamic.literal(
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "TableName" -> TableName.asInstanceOf[js.Any]
      )

      RetentionProperties.foreach(__v => __obj.updateDynamic("RetentionProperties")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTableRequest]
    }
  }

  @js.native
  trait CreateTableResponse extends js.Object {
    var Table: js.UndefOr[Table]
  }

  object CreateTableResponse {
    @inline
    def apply(
        Table: js.UndefOr[Table] = js.undefined
    ): CreateTableResponse = {
      val __obj = js.Dynamic.literal()
      Table.foreach(__v => __obj.updateDynamic("Table")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTableResponse]
    }
  }

  /** A top level container for a table. Databases and tables are the fundamental management concepts in Amazon Timestream. All tables in a database are encrypted with the same KMS key.
    */
  @js.native
  trait Database extends js.Object {
    var Arn: js.UndefOr[String]
    var CreationTime: js.UndefOr[Date]
    var DatabaseName: js.UndefOr[ResourceName]
    var KmsKeyId: js.UndefOr[StringValue2048]
    var LastUpdatedTime: js.UndefOr[Date]
    var TableCount: js.UndefOr[Double]
  }

  object Database {
    @inline
    def apply(
        Arn: js.UndefOr[String] = js.undefined,
        CreationTime: js.UndefOr[Date] = js.undefined,
        DatabaseName: js.UndefOr[ResourceName] = js.undefined,
        KmsKeyId: js.UndefOr[StringValue2048] = js.undefined,
        LastUpdatedTime: js.UndefOr[Date] = js.undefined,
        TableCount: js.UndefOr[Double] = js.undefined
    ): Database = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      DatabaseName.foreach(__v => __obj.updateDynamic("DatabaseName")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      LastUpdatedTime.foreach(__v => __obj.updateDynamic("LastUpdatedTime")(__v.asInstanceOf[js.Any]))
      TableCount.foreach(__v => __obj.updateDynamic("TableCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Database]
    }
  }

  @js.native
  trait DeleteDatabaseRequest extends js.Object {
    var DatabaseName: ResourceName
  }

  object DeleteDatabaseRequest {
    @inline
    def apply(
        DatabaseName: ResourceName
    ): DeleteDatabaseRequest = {
      val __obj = js.Dynamic.literal(
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteDatabaseRequest]
    }
  }

  @js.native
  trait DeleteTableRequest extends js.Object {
    var DatabaseName: ResourceName
    var TableName: ResourceName
  }

  object DeleteTableRequest {
    @inline
    def apply(
        DatabaseName: ResourceName,
        TableName: ResourceName
    ): DeleteTableRequest = {
      val __obj = js.Dynamic.literal(
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "TableName" -> TableName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteTableRequest]
    }
  }

  @js.native
  trait DescribeDatabaseRequest extends js.Object {
    var DatabaseName: ResourceName
  }

  object DescribeDatabaseRequest {
    @inline
    def apply(
        DatabaseName: ResourceName
    ): DescribeDatabaseRequest = {
      val __obj = js.Dynamic.literal(
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeDatabaseRequest]
    }
  }

  @js.native
  trait DescribeDatabaseResponse extends js.Object {
    var Database: js.UndefOr[Database]
  }

  object DescribeDatabaseResponse {
    @inline
    def apply(
        Database: js.UndefOr[Database] = js.undefined
    ): DescribeDatabaseResponse = {
      val __obj = js.Dynamic.literal()
      Database.foreach(__v => __obj.updateDynamic("Database")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDatabaseResponse]
    }
  }

  @js.native
  trait DescribeEndpointsRequest extends js.Object

  object DescribeEndpointsRequest {
    @inline
    def apply(): DescribeEndpointsRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DescribeEndpointsRequest]
    }
  }

  @js.native
  trait DescribeEndpointsResponse extends js.Object {
    var Endpoints: Endpoints
  }

  object DescribeEndpointsResponse {
    @inline
    def apply(
        Endpoints: Endpoints
    ): DescribeEndpointsResponse = {
      val __obj = js.Dynamic.literal(
        "Endpoints" -> Endpoints.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeEndpointsResponse]
    }
  }

  @js.native
  trait DescribeTableRequest extends js.Object {
    var DatabaseName: ResourceName
    var TableName: ResourceName
  }

  object DescribeTableRequest {
    @inline
    def apply(
        DatabaseName: ResourceName,
        TableName: ResourceName
    ): DescribeTableRequest = {
      val __obj = js.Dynamic.literal(
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "TableName" -> TableName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeTableRequest]
    }
  }

  @js.native
  trait DescribeTableResponse extends js.Object {
    var Table: js.UndefOr[Table]
  }

  object DescribeTableResponse {
    @inline
    def apply(
        Table: js.UndefOr[Table] = js.undefined
    ): DescribeTableResponse = {
      val __obj = js.Dynamic.literal()
      Table.foreach(__v => __obj.updateDynamic("Table")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTableResponse]
    }
  }

  /** Dimension represents the meta data attributes of the time series. For example, the name and availability zone of an EC2 instance or the name of the manufacturer of a wind turbine are dimensions.
    */
  @js.native
  trait Dimension extends js.Object {
    var Name: StringValue256
    var Value: StringValue2048
    var DimensionValueType: js.UndefOr[DimensionValueType]
  }

  object Dimension {
    @inline
    def apply(
        Name: StringValue256,
        Value: StringValue2048,
        DimensionValueType: js.UndefOr[DimensionValueType] = js.undefined
    ): Dimension = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )

      DimensionValueType.foreach(__v => __obj.updateDynamic("DimensionValueType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Dimension]
    }
  }

  @js.native
  sealed trait DimensionValueType extends js.Any
  object DimensionValueType {
    val VARCHAR = "VARCHAR".asInstanceOf[DimensionValueType]

    @inline def values = js.Array(VARCHAR)
  }

  /** Represents an available endpoint against which to make API calls agaisnt, as well as the TTL for that endpoint.
    */
  @js.native
  trait Endpoint extends js.Object {
    var Address: String
    var CachePeriodInMinutes: Double
  }

  object Endpoint {
    @inline
    def apply(
        Address: String,
        CachePeriodInMinutes: Double
    ): Endpoint = {
      val __obj = js.Dynamic.literal(
        "Address" -> Address.asInstanceOf[js.Any],
        "CachePeriodInMinutes" -> CachePeriodInMinutes.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Endpoint]
    }
  }

  @js.native
  trait ListDatabasesRequest extends js.Object {
    var MaxResults: js.UndefOr[PaginationLimit]
    var NextToken: js.UndefOr[String]
  }

  object ListDatabasesRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[PaginationLimit] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListDatabasesRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDatabasesRequest]
    }
  }

  @js.native
  trait ListDatabasesResponse extends js.Object {
    var Databases: js.UndefOr[DatabaseList]
    var NextToken: js.UndefOr[String]
  }

  object ListDatabasesResponse {
    @inline
    def apply(
        Databases: js.UndefOr[DatabaseList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListDatabasesResponse = {
      val __obj = js.Dynamic.literal()
      Databases.foreach(__v => __obj.updateDynamic("Databases")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDatabasesResponse]
    }
  }

  @js.native
  trait ListTablesRequest extends js.Object {
    var DatabaseName: js.UndefOr[ResourceName]
    var MaxResults: js.UndefOr[PaginationLimit]
    var NextToken: js.UndefOr[String]
  }

  object ListTablesRequest {
    @inline
    def apply(
        DatabaseName: js.UndefOr[ResourceName] = js.undefined,
        MaxResults: js.UndefOr[PaginationLimit] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListTablesRequest = {
      val __obj = js.Dynamic.literal()
      DatabaseName.foreach(__v => __obj.updateDynamic("DatabaseName")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTablesRequest]
    }
  }

  @js.native
  trait ListTablesResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var Tables: js.UndefOr[TableList]
  }

  object ListTablesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        Tables: js.UndefOr[TableList] = js.undefined
    ): ListTablesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Tables.foreach(__v => __obj.updateDynamic("Tables")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTablesResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceARN: AmazonResourceName
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceARN: AmazonResourceName
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[TagList]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        Tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  @js.native
  sealed trait MeasureValueType extends js.Any
  object MeasureValueType {
    val DOUBLE = "DOUBLE".asInstanceOf[MeasureValueType]
    val BIGINT = "BIGINT".asInstanceOf[MeasureValueType]
    val VARCHAR = "VARCHAR".asInstanceOf[MeasureValueType]
    val BOOLEAN = "BOOLEAN".asInstanceOf[MeasureValueType]

    @inline def values = js.Array(DOUBLE, BIGINT, VARCHAR, BOOLEAN)
  }

  /** Record represents a time series data point being written into Timestream. Each record contains an array of dimensions. Dimensions represent the meta data attributes of a time series data point such as the instance name or availability zone of an EC2 instance. A record also contains the measure name which is the name of the measure being collected for example the CPU utilization of an EC2 instance. A record also contains the measure value and the value type which is the data type of the measure value. In addition, the record contains the timestamp when the measure was collected that the timestamp unit which represents the granularity of the timestamp.
    */
  @js.native
  trait Record extends js.Object {
    var Dimensions: js.UndefOr[Dimensions]
    var MeasureName: js.UndefOr[StringValue256]
    var MeasureValue: js.UndefOr[StringValue2048]
    var MeasureValueType: js.UndefOr[MeasureValueType]
    var Time: js.UndefOr[StringValue256]
    var TimeUnit: js.UndefOr[TimeUnit]
  }

  object Record {
    @inline
    def apply(
        Dimensions: js.UndefOr[Dimensions] = js.undefined,
        MeasureName: js.UndefOr[StringValue256] = js.undefined,
        MeasureValue: js.UndefOr[StringValue2048] = js.undefined,
        MeasureValueType: js.UndefOr[MeasureValueType] = js.undefined,
        Time: js.UndefOr[StringValue256] = js.undefined,
        TimeUnit: js.UndefOr[TimeUnit] = js.undefined
    ): Record = {
      val __obj = js.Dynamic.literal()
      Dimensions.foreach(__v => __obj.updateDynamic("Dimensions")(__v.asInstanceOf[js.Any]))
      MeasureName.foreach(__v => __obj.updateDynamic("MeasureName")(__v.asInstanceOf[js.Any]))
      MeasureValue.foreach(__v => __obj.updateDynamic("MeasureValue")(__v.asInstanceOf[js.Any]))
      MeasureValueType.foreach(__v => __obj.updateDynamic("MeasureValueType")(__v.asInstanceOf[js.Any]))
      Time.foreach(__v => __obj.updateDynamic("Time")(__v.asInstanceOf[js.Any]))
      TimeUnit.foreach(__v => __obj.updateDynamic("TimeUnit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Record]
    }
  }

  /** Retention properties contain the duration for which your time series data must be stored in the magnetic store and the memory store.
    */
  @js.native
  trait RetentionProperties extends js.Object {
    var MagneticStoreRetentionPeriodInDays: MagneticStoreRetentionPeriodInDays
    var MemoryStoreRetentionPeriodInHours: MemoryStoreRetentionPeriodInHours
  }

  object RetentionProperties {
    @inline
    def apply(
        MagneticStoreRetentionPeriodInDays: MagneticStoreRetentionPeriodInDays,
        MemoryStoreRetentionPeriodInHours: MemoryStoreRetentionPeriodInHours
    ): RetentionProperties = {
      val __obj = js.Dynamic.literal(
        "MagneticStoreRetentionPeriodInDays" -> MagneticStoreRetentionPeriodInDays.asInstanceOf[js.Any],
        "MemoryStoreRetentionPeriodInHours" -> MemoryStoreRetentionPeriodInHours.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RetentionProperties]
    }
  }

  /** Table represents a database table in Timestream. Tables contain one or more related time series. You can modify the retention duration of the memory store and the magnetic store for a table.
    */
  @js.native
  trait Table extends js.Object {
    var Arn: js.UndefOr[String]
    var CreationTime: js.UndefOr[Date]
    var DatabaseName: js.UndefOr[ResourceName]
    var LastUpdatedTime: js.UndefOr[Date]
    var RetentionProperties: js.UndefOr[RetentionProperties]
    var TableName: js.UndefOr[ResourceName]
    var TableStatus: js.UndefOr[TableStatus]
  }

  object Table {
    @inline
    def apply(
        Arn: js.UndefOr[String] = js.undefined,
        CreationTime: js.UndefOr[Date] = js.undefined,
        DatabaseName: js.UndefOr[ResourceName] = js.undefined,
        LastUpdatedTime: js.UndefOr[Date] = js.undefined,
        RetentionProperties: js.UndefOr[RetentionProperties] = js.undefined,
        TableName: js.UndefOr[ResourceName] = js.undefined,
        TableStatus: js.UndefOr[TableStatus] = js.undefined
    ): Table = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      DatabaseName.foreach(__v => __obj.updateDynamic("DatabaseName")(__v.asInstanceOf[js.Any]))
      LastUpdatedTime.foreach(__v => __obj.updateDynamic("LastUpdatedTime")(__v.asInstanceOf[js.Any]))
      RetentionProperties.foreach(__v => __obj.updateDynamic("RetentionProperties")(__v.asInstanceOf[js.Any]))
      TableName.foreach(__v => __obj.updateDynamic("TableName")(__v.asInstanceOf[js.Any]))
      TableStatus.foreach(__v => __obj.updateDynamic("TableStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Table]
    }
  }

  @js.native
  sealed trait TableStatus extends js.Any
  object TableStatus {
    val ACTIVE = "ACTIVE".asInstanceOf[TableStatus]
    val DELETING = "DELETING".asInstanceOf[TableStatus]

    @inline def values = js.Array(ACTIVE, DELETING)
  }

  /** A tag is a label that you assign to a Timestream database and/or table. Each tag consists of a key and an optional value, both of which you define. Tags enable you to categorize databases and/or tables, for example, by purpose, owner, or environment.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  object Tag {
    @inline
    def apply(
        Key: TagKey,
        Value: TagValue
    ): Tag = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceARN: AmazonResourceName
    var Tags: TagList
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceARN: AmazonResourceName,
        Tags: TagList
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object

  object TagResourceResponse {
    @inline
    def apply(): TagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  @js.native
  sealed trait TimeUnit extends js.Any
  object TimeUnit {
    val MILLISECONDS = "MILLISECONDS".asInstanceOf[TimeUnit]
    val SECONDS = "SECONDS".asInstanceOf[TimeUnit]
    val MICROSECONDS = "MICROSECONDS".asInstanceOf[TimeUnit]
    val NANOSECONDS = "NANOSECONDS".asInstanceOf[TimeUnit]

    @inline def values = js.Array(MILLISECONDS, SECONDS, MICROSECONDS, NANOSECONDS)
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceARN: AmazonResourceName
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceARN: AmazonResourceName,
        TagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object

  object UntagResourceResponse {
    @inline
    def apply(): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  @js.native
  trait UpdateDatabaseRequest extends js.Object {
    var DatabaseName: ResourceName
    var KmsKeyId: StringValue2048
  }

  object UpdateDatabaseRequest {
    @inline
    def apply(
        DatabaseName: ResourceName,
        KmsKeyId: StringValue2048
    ): UpdateDatabaseRequest = {
      val __obj = js.Dynamic.literal(
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "KmsKeyId" -> KmsKeyId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateDatabaseRequest]
    }
  }

  @js.native
  trait UpdateDatabaseResponse extends js.Object {
    var Database: js.UndefOr[Database]
  }

  object UpdateDatabaseResponse {
    @inline
    def apply(
        Database: js.UndefOr[Database] = js.undefined
    ): UpdateDatabaseResponse = {
      val __obj = js.Dynamic.literal()
      Database.foreach(__v => __obj.updateDynamic("Database")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDatabaseResponse]
    }
  }

  @js.native
  trait UpdateTableRequest extends js.Object {
    var DatabaseName: ResourceName
    var RetentionProperties: RetentionProperties
    var TableName: ResourceName
  }

  object UpdateTableRequest {
    @inline
    def apply(
        DatabaseName: ResourceName,
        RetentionProperties: RetentionProperties,
        TableName: ResourceName
    ): UpdateTableRequest = {
      val __obj = js.Dynamic.literal(
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "RetentionProperties" -> RetentionProperties.asInstanceOf[js.Any],
        "TableName" -> TableName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateTableRequest]
    }
  }

  @js.native
  trait UpdateTableResponse extends js.Object {
    var Table: js.UndefOr[Table]
  }

  object UpdateTableResponse {
    @inline
    def apply(
        Table: js.UndefOr[Table] = js.undefined
    ): UpdateTableResponse = {
      val __obj = js.Dynamic.literal()
      Table.foreach(__v => __obj.updateDynamic("Table")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateTableResponse]
    }
  }

  @js.native
  trait WriteRecordsRequest extends js.Object {
    var DatabaseName: ResourceName
    var Records: Records
    var TableName: ResourceName
    var CommonAttributes: js.UndefOr[Record]
  }

  object WriteRecordsRequest {
    @inline
    def apply(
        DatabaseName: ResourceName,
        Records: Records,
        TableName: ResourceName,
        CommonAttributes: js.UndefOr[Record] = js.undefined
    ): WriteRecordsRequest = {
      val __obj = js.Dynamic.literal(
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "Records" -> Records.asInstanceOf[js.Any],
        "TableName" -> TableName.asInstanceOf[js.Any]
      )

      CommonAttributes.foreach(__v => __obj.updateDynamic("CommonAttributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WriteRecordsRequest]
    }
  }
}
