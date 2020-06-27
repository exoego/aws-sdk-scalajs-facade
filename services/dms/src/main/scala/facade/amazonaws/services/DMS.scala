package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object dms {
  type AccountQuotaList                        = js.Array[AccountQuota]
  type AvailabilityZonesList                   = js.Array[String]
  type BooleanOptional                         = Boolean
  type CertificateList                         = js.Array[Certificate]
  type CertificateWallet                       = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type ConnectionList                          = js.Array[Connection]
  type EndpointList                            = js.Array[Endpoint]
  type EventCategoriesList                     = js.Array[String]
  type EventCategoryGroupList                  = js.Array[EventCategoryGroup]
  type EventList                               = js.Array[Event]
  type EventSubscriptionsList                  = js.Array[EventSubscription]
  type FilterList                              = js.Array[Filter]
  type FilterValueList                         = js.Array[String]
  type IntegerOptional                         = Int
  type KeyList                                 = js.Array[String]
  type OrderableReplicationInstanceList        = js.Array[OrderableReplicationInstance]
  type PendingMaintenanceActionDetails         = js.Array[PendingMaintenanceAction]
  type PendingMaintenanceActions               = js.Array[ResourcePendingMaintenanceActions]
  type ReplicationInstanceList                 = js.Array[ReplicationInstance]
  type ReplicationInstancePrivateIpAddressList = js.Array[String]
  type ReplicationInstancePublicIpAddressList  = js.Array[String]
  type ReplicationInstanceTaskLogsList         = js.Array[ReplicationInstanceTaskLog]
  type ReplicationSubnetGroups                 = js.Array[ReplicationSubnetGroup]
  type ReplicationTaskAssessmentResultList     = js.Array[ReplicationTaskAssessmentResult]
  type ReplicationTaskList                     = js.Array[ReplicationTask]
  type SchemaList                              = js.Array[String]
  type SecretString                            = String
  type SourceIdsList                           = js.Array[String]
  type SubnetIdentifierList                    = js.Array[String]
  type SubnetList                              = js.Array[Subnet]
  type SupportedEndpointTypeList               = js.Array[SupportedEndpointType]
  type TStamp                                  = js.Date
  type TableListToReload                       = js.Array[TableToReload]
  type TableStatisticsList                     = js.Array[TableStatistics]
  type TagList                                 = js.Array[Tag]
  type VpcSecurityGroupIdList                  = js.Array[String]
  type VpcSecurityGroupMembershipList          = js.Array[VpcSecurityGroupMembership]

  implicit final class DMSOps(private val service: DMS) extends AnyVal {

    @inline def addTagsToResourceFuture(params: AddTagsToResourceMessage): Future[AddTagsToResourceResponse] =
      service.addTagsToResource(params).promise().toFuture
    @inline def applyPendingMaintenanceActionFuture(
        params: ApplyPendingMaintenanceActionMessage
    ): Future[ApplyPendingMaintenanceActionResponse] = service.applyPendingMaintenanceAction(params).promise().toFuture
    @inline def createEndpointFuture(params: CreateEndpointMessage): Future[CreateEndpointResponse] =
      service.createEndpoint(params).promise().toFuture
    @inline def createEventSubscriptionFuture(
        params: CreateEventSubscriptionMessage
    ): Future[CreateEventSubscriptionResponse] = service.createEventSubscription(params).promise().toFuture
    @inline def createReplicationInstanceFuture(
        params: CreateReplicationInstanceMessage
    ): Future[CreateReplicationInstanceResponse] = service.createReplicationInstance(params).promise().toFuture
    @inline def createReplicationSubnetGroupFuture(
        params: CreateReplicationSubnetGroupMessage
    ): Future[CreateReplicationSubnetGroupResponse] = service.createReplicationSubnetGroup(params).promise().toFuture
    @inline def createReplicationTaskFuture(
        params: CreateReplicationTaskMessage
    ): Future[CreateReplicationTaskResponse] = service.createReplicationTask(params).promise().toFuture
    @inline def deleteCertificateFuture(params: DeleteCertificateMessage): Future[DeleteCertificateResponse] =
      service.deleteCertificate(params).promise().toFuture
    @inline def deleteConnectionFuture(params: DeleteConnectionMessage): Future[DeleteConnectionResponse] =
      service.deleteConnection(params).promise().toFuture
    @inline def deleteEndpointFuture(params: DeleteEndpointMessage): Future[DeleteEndpointResponse] =
      service.deleteEndpoint(params).promise().toFuture
    @inline def deleteEventSubscriptionFuture(
        params: DeleteEventSubscriptionMessage
    ): Future[DeleteEventSubscriptionResponse] = service.deleteEventSubscription(params).promise().toFuture
    @inline def deleteReplicationInstanceFuture(
        params: DeleteReplicationInstanceMessage
    ): Future[DeleteReplicationInstanceResponse] = service.deleteReplicationInstance(params).promise().toFuture
    @inline def deleteReplicationSubnetGroupFuture(
        params: DeleteReplicationSubnetGroupMessage
    ): Future[DeleteReplicationSubnetGroupResponse] = service.deleteReplicationSubnetGroup(params).promise().toFuture
    @inline def deleteReplicationTaskFuture(
        params: DeleteReplicationTaskMessage
    ): Future[DeleteReplicationTaskResponse] = service.deleteReplicationTask(params).promise().toFuture
    @inline def describeAccountAttributesFuture(
        params: DescribeAccountAttributesMessage
    ): Future[DescribeAccountAttributesResponse] = service.describeAccountAttributes(params).promise().toFuture
    @inline def describeCertificatesFuture(params: DescribeCertificatesMessage): Future[DescribeCertificatesResponse] =
      service.describeCertificates(params).promise().toFuture
    @inline def describeConnectionsFuture(params: DescribeConnectionsMessage): Future[DescribeConnectionsResponse] =
      service.describeConnections(params).promise().toFuture
    @inline def describeEndpointTypesFuture(
        params: DescribeEndpointTypesMessage
    ): Future[DescribeEndpointTypesResponse] = service.describeEndpointTypes(params).promise().toFuture
    @inline def describeEndpointsFuture(params: DescribeEndpointsMessage): Future[DescribeEndpointsResponse] =
      service.describeEndpoints(params).promise().toFuture
    @inline def describeEventCategoriesFuture(
        params: DescribeEventCategoriesMessage
    ): Future[DescribeEventCategoriesResponse] = service.describeEventCategories(params).promise().toFuture
    @inline def describeEventSubscriptionsFuture(
        params: DescribeEventSubscriptionsMessage
    ): Future[DescribeEventSubscriptionsResponse] = service.describeEventSubscriptions(params).promise().toFuture
    @inline def describeEventsFuture(params: DescribeEventsMessage): Future[DescribeEventsResponse] =
      service.describeEvents(params).promise().toFuture
    @inline def describeOrderableReplicationInstancesFuture(
        params: DescribeOrderableReplicationInstancesMessage
    ): Future[DescribeOrderableReplicationInstancesResponse] =
      service.describeOrderableReplicationInstances(params).promise().toFuture
    @inline def describePendingMaintenanceActionsFuture(
        params: DescribePendingMaintenanceActionsMessage
    ): Future[DescribePendingMaintenanceActionsResponse] =
      service.describePendingMaintenanceActions(params).promise().toFuture
    @inline def describeRefreshSchemasStatusFuture(
        params: DescribeRefreshSchemasStatusMessage
    ): Future[DescribeRefreshSchemasStatusResponse] = service.describeRefreshSchemasStatus(params).promise().toFuture
    @inline def describeReplicationInstanceTaskLogsFuture(
        params: DescribeReplicationInstanceTaskLogsMessage
    ): Future[DescribeReplicationInstanceTaskLogsResponse] =
      service.describeReplicationInstanceTaskLogs(params).promise().toFuture
    @inline def describeReplicationInstancesFuture(
        params: DescribeReplicationInstancesMessage
    ): Future[DescribeReplicationInstancesResponse] = service.describeReplicationInstances(params).promise().toFuture
    @inline def describeReplicationSubnetGroupsFuture(
        params: DescribeReplicationSubnetGroupsMessage
    ): Future[DescribeReplicationSubnetGroupsResponse] =
      service.describeReplicationSubnetGroups(params).promise().toFuture
    @inline def describeReplicationTaskAssessmentResultsFuture(
        params: DescribeReplicationTaskAssessmentResultsMessage
    ): Future[DescribeReplicationTaskAssessmentResultsResponse] =
      service.describeReplicationTaskAssessmentResults(params).promise().toFuture
    @inline def describeReplicationTasksFuture(
        params: DescribeReplicationTasksMessage
    ): Future[DescribeReplicationTasksResponse] = service.describeReplicationTasks(params).promise().toFuture
    @inline def describeSchemasFuture(params: DescribeSchemasMessage): Future[DescribeSchemasResponse] =
      service.describeSchemas(params).promise().toFuture
    @inline def describeTableStatisticsFuture(
        params: DescribeTableStatisticsMessage
    ): Future[DescribeTableStatisticsResponse] = service.describeTableStatistics(params).promise().toFuture
    @inline def importCertificateFuture(params: ImportCertificateMessage): Future[ImportCertificateResponse] =
      service.importCertificate(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceMessage): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise().toFuture
    @inline def modifyEndpointFuture(params: ModifyEndpointMessage): Future[ModifyEndpointResponse] =
      service.modifyEndpoint(params).promise().toFuture
    @inline def modifyEventSubscriptionFuture(
        params: ModifyEventSubscriptionMessage
    ): Future[ModifyEventSubscriptionResponse] = service.modifyEventSubscription(params).promise().toFuture
    @inline def modifyReplicationInstanceFuture(
        params: ModifyReplicationInstanceMessage
    ): Future[ModifyReplicationInstanceResponse] = service.modifyReplicationInstance(params).promise().toFuture
    @inline def modifyReplicationSubnetGroupFuture(
        params: ModifyReplicationSubnetGroupMessage
    ): Future[ModifyReplicationSubnetGroupResponse] = service.modifyReplicationSubnetGroup(params).promise().toFuture
    @inline def modifyReplicationTaskFuture(
        params: ModifyReplicationTaskMessage
    ): Future[ModifyReplicationTaskResponse] = service.modifyReplicationTask(params).promise().toFuture
    @inline def rebootReplicationInstanceFuture(
        params: RebootReplicationInstanceMessage
    ): Future[RebootReplicationInstanceResponse] = service.rebootReplicationInstance(params).promise().toFuture
    @inline def refreshSchemasFuture(params: RefreshSchemasMessage): Future[RefreshSchemasResponse] =
      service.refreshSchemas(params).promise().toFuture
    @inline def reloadTablesFuture(params: ReloadTablesMessage): Future[ReloadTablesResponse] =
      service.reloadTables(params).promise().toFuture
    @inline def removeTagsFromResourceFuture(
        params: RemoveTagsFromResourceMessage
    ): Future[RemoveTagsFromResourceResponse] = service.removeTagsFromResource(params).promise().toFuture
    @inline def startReplicationTaskAssessmentFuture(
        params: StartReplicationTaskAssessmentMessage
    ): Future[StartReplicationTaskAssessmentResponse] =
      service.startReplicationTaskAssessment(params).promise().toFuture
    @inline def startReplicationTaskFuture(params: StartReplicationTaskMessage): Future[StartReplicationTaskResponse] =
      service.startReplicationTask(params).promise().toFuture
    @inline def stopReplicationTaskFuture(params: StopReplicationTaskMessage): Future[StopReplicationTaskResponse] =
      service.stopReplicationTask(params).promise().toFuture
    @inline def testConnectionFuture(params: TestConnectionMessage): Future[TestConnectionResponse] =
      service.testConnection(params).promise().toFuture
  }
}

package dms {
  @js.native
  @JSImport("aws-sdk", "DMS")
  class DMS() extends js.Object {
    def this(config: AWSConfig) = this()

    def addTagsToResource(params: AddTagsToResourceMessage): Request[AddTagsToResourceResponse] = js.native
    def applyPendingMaintenanceAction(
        params: ApplyPendingMaintenanceActionMessage
    ): Request[ApplyPendingMaintenanceActionResponse]                                  = js.native
    def createEndpoint(params: CreateEndpointMessage): Request[CreateEndpointResponse] = js.native
    def createEventSubscription(params: CreateEventSubscriptionMessage): Request[CreateEventSubscriptionResponse] =
      js.native
    def createReplicationInstance(
        params: CreateReplicationInstanceMessage
    ): Request[CreateReplicationInstanceResponse] = js.native
    def createReplicationSubnetGroup(
        params: CreateReplicationSubnetGroupMessage
    ): Request[CreateReplicationSubnetGroupResponse]                                                        = js.native
    def createReplicationTask(params: CreateReplicationTaskMessage): Request[CreateReplicationTaskResponse] = js.native
    def deleteCertificate(params: DeleteCertificateMessage): Request[DeleteCertificateResponse]             = js.native
    def deleteConnection(params: DeleteConnectionMessage): Request[DeleteConnectionResponse]                = js.native
    def deleteEndpoint(params: DeleteEndpointMessage): Request[DeleteEndpointResponse]                      = js.native
    def deleteEventSubscription(params: DeleteEventSubscriptionMessage): Request[DeleteEventSubscriptionResponse] =
      js.native
    def deleteReplicationInstance(
        params: DeleteReplicationInstanceMessage
    ): Request[DeleteReplicationInstanceResponse] = js.native
    def deleteReplicationSubnetGroup(
        params: DeleteReplicationSubnetGroupMessage
    ): Request[DeleteReplicationSubnetGroupResponse]                                                        = js.native
    def deleteReplicationTask(params: DeleteReplicationTaskMessage): Request[DeleteReplicationTaskResponse] = js.native
    def describeAccountAttributes(
        params: DescribeAccountAttributesMessage
    ): Request[DescribeAccountAttributesResponse]                                                           = js.native
    def describeCertificates(params: DescribeCertificatesMessage): Request[DescribeCertificatesResponse]    = js.native
    def describeConnections(params: DescribeConnectionsMessage): Request[DescribeConnectionsResponse]       = js.native
    def describeEndpointTypes(params: DescribeEndpointTypesMessage): Request[DescribeEndpointTypesResponse] = js.native
    def describeEndpoints(params: DescribeEndpointsMessage): Request[DescribeEndpointsResponse]             = js.native
    def describeEventCategories(params: DescribeEventCategoriesMessage): Request[DescribeEventCategoriesResponse] =
      js.native
    def describeEventSubscriptions(
        params: DescribeEventSubscriptionsMessage
    ): Request[DescribeEventSubscriptionsResponse]                                     = js.native
    def describeEvents(params: DescribeEventsMessage): Request[DescribeEventsResponse] = js.native
    def describeOrderableReplicationInstances(
        params: DescribeOrderableReplicationInstancesMessage
    ): Request[DescribeOrderableReplicationInstancesResponse] = js.native
    def describePendingMaintenanceActions(
        params: DescribePendingMaintenanceActionsMessage
    ): Request[DescribePendingMaintenanceActionsResponse] = js.native
    def describeRefreshSchemasStatus(
        params: DescribeRefreshSchemasStatusMessage
    ): Request[DescribeRefreshSchemasStatusResponse] = js.native
    def describeReplicationInstanceTaskLogs(
        params: DescribeReplicationInstanceTaskLogsMessage
    ): Request[DescribeReplicationInstanceTaskLogsResponse] = js.native
    def describeReplicationInstances(
        params: DescribeReplicationInstancesMessage
    ): Request[DescribeReplicationInstancesResponse] = js.native
    def describeReplicationSubnetGroups(
        params: DescribeReplicationSubnetGroupsMessage
    ): Request[DescribeReplicationSubnetGroupsResponse] = js.native
    def describeReplicationTaskAssessmentResults(
        params: DescribeReplicationTaskAssessmentResultsMessage
    ): Request[DescribeReplicationTaskAssessmentResultsResponse] = js.native
    def describeReplicationTasks(params: DescribeReplicationTasksMessage): Request[DescribeReplicationTasksResponse] =
      js.native
    def describeSchemas(params: DescribeSchemasMessage): Request[DescribeSchemasResponse] = js.native
    def describeTableStatistics(params: DescribeTableStatisticsMessage): Request[DescribeTableStatisticsResponse] =
      js.native
    def importCertificate(params: ImportCertificateMessage): Request[ImportCertificateResponse]       = js.native
    def listTagsForResource(params: ListTagsForResourceMessage): Request[ListTagsForResourceResponse] = js.native
    def modifyEndpoint(params: ModifyEndpointMessage): Request[ModifyEndpointResponse]                = js.native
    def modifyEventSubscription(params: ModifyEventSubscriptionMessage): Request[ModifyEventSubscriptionResponse] =
      js.native
    def modifyReplicationInstance(
        params: ModifyReplicationInstanceMessage
    ): Request[ModifyReplicationInstanceResponse] = js.native
    def modifyReplicationSubnetGroup(
        params: ModifyReplicationSubnetGroupMessage
    ): Request[ModifyReplicationSubnetGroupResponse]                                                        = js.native
    def modifyReplicationTask(params: ModifyReplicationTaskMessage): Request[ModifyReplicationTaskResponse] = js.native
    def rebootReplicationInstance(
        params: RebootReplicationInstanceMessage
    ): Request[RebootReplicationInstanceResponse]                                      = js.native
    def refreshSchemas(params: RefreshSchemasMessage): Request[RefreshSchemasResponse] = js.native
    def reloadTables(params: ReloadTablesMessage): Request[ReloadTablesResponse]       = js.native
    def removeTagsFromResource(params: RemoveTagsFromResourceMessage): Request[RemoveTagsFromResourceResponse] =
      js.native
    def startReplicationTask(params: StartReplicationTaskMessage): Request[StartReplicationTaskResponse] = js.native
    def startReplicationTaskAssessment(
        params: StartReplicationTaskAssessmentMessage
    ): Request[StartReplicationTaskAssessmentResponse]                                                = js.native
    def stopReplicationTask(params: StopReplicationTaskMessage): Request[StopReplicationTaskResponse] = js.native
    def testConnection(params: TestConnectionMessage): Request[TestConnectionResponse]                = js.native
  }

  /**
    * Describes a quota for an AWS account, for example, the number of replication instances allowed.
    */
  @js.native
  @Factory
  trait AccountQuota extends js.Object {
    var AccountQuotaName: js.UndefOr[String]
    var Max: js.UndefOr[Double]
    var Used: js.UndefOr[Double]
  }

  /**
    * Associates a set of tags with an AWS DMS resource.
    */
  @js.native
  @Factory
  trait AddTagsToResourceMessage extends js.Object {
    var ResourceArn: String
    var Tags: TagList
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait AddTagsToResourceResponse extends js.Object {}

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait ApplyPendingMaintenanceActionMessage extends js.Object {
    var ApplyAction: String
    var OptInType: String
    var ReplicationInstanceArn: String
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait ApplyPendingMaintenanceActionResponse extends js.Object {
    var ResourcePendingMaintenanceActions: js.UndefOr[ResourcePendingMaintenanceActions]
  }

  @js.native
  sealed trait AuthMechanismValue extends js.Any
  object AuthMechanismValue extends js.Object {
    val default     = "default".asInstanceOf[AuthMechanismValue]
    val mongodb_cr  = "mongodb_cr".asInstanceOf[AuthMechanismValue]
    val scram_sha_1 = "scram_sha_1".asInstanceOf[AuthMechanismValue]

    val values = js.Object.freeze(js.Array(default, mongodb_cr, scram_sha_1))
  }

  @js.native
  sealed trait AuthTypeValue extends js.Any
  object AuthTypeValue extends js.Object {
    val no       = "no".asInstanceOf[AuthTypeValue]
    val password = "password".asInstanceOf[AuthTypeValue]

    val values = js.Object.freeze(js.Array(no, password))
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait AvailabilityZone extends js.Object {
    var Name: js.UndefOr[String]
  }

  /**
    * The SSL certificate that can be used to encrypt connections between the endpoints and the replication instance.
    */
  @js.native
  @Factory
  trait Certificate extends js.Object {
    var CertificateArn: js.UndefOr[String]
    var CertificateCreationDate: js.UndefOr[TStamp]
    var CertificateIdentifier: js.UndefOr[String]
    var CertificateOwner: js.UndefOr[String]
    var CertificatePem: js.UndefOr[String]
    var CertificateWallet: js.UndefOr[CertificateWallet]
    var KeyLength: js.UndefOr[IntegerOptional]
    var SigningAlgorithm: js.UndefOr[String]
    var ValidFromDate: js.UndefOr[TStamp]
    var ValidToDate: js.UndefOr[TStamp]
  }

  @js.native
  sealed trait CompressionTypeValue extends js.Any
  object CompressionTypeValue extends js.Object {
    val none = "none".asInstanceOf[CompressionTypeValue]
    val gzip = "gzip".asInstanceOf[CompressionTypeValue]

    val values = js.Object.freeze(js.Array(none, gzip))
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait Connection extends js.Object {
    var EndpointArn: js.UndefOr[String]
    var EndpointIdentifier: js.UndefOr[String]
    var LastFailureMessage: js.UndefOr[String]
    var ReplicationInstanceArn: js.UndefOr[String]
    var ReplicationInstanceIdentifier: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait CreateEndpointMessage extends js.Object {
    var EndpointIdentifier: String
    var EndpointType: ReplicationEndpointTypeValue
    var EngineName: String
    var CertificateArn: js.UndefOr[String]
    var DatabaseName: js.UndefOr[String]
    var DmsTransferSettings: js.UndefOr[DmsTransferSettings]
    var DynamoDbSettings: js.UndefOr[DynamoDbSettings]
    var ElasticsearchSettings: js.UndefOr[ElasticsearchSettings]
    var ExternalTableDefinition: js.UndefOr[String]
    var ExtraConnectionAttributes: js.UndefOr[String]
    var KinesisSettings: js.UndefOr[KinesisSettings]
    var KmsKeyId: js.UndefOr[String]
    var MongoDbSettings: js.UndefOr[MongoDbSettings]
    var Password: js.UndefOr[SecretString]
    var Port: js.UndefOr[IntegerOptional]
    var RedshiftSettings: js.UndefOr[RedshiftSettings]
    var S3Settings: js.UndefOr[S3Settings]
    var ServerName: js.UndefOr[String]
    var ServiceAccessRoleArn: js.UndefOr[String]
    var SslMode: js.UndefOr[DmsSslModeValue]
    var Tags: js.UndefOr[TagList]
    var Username: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait CreateEndpointResponse extends js.Object {
    var Endpoint: js.UndefOr[Endpoint]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait CreateEventSubscriptionMessage extends js.Object {
    var SnsTopicArn: String
    var SubscriptionName: String
    var Enabled: js.UndefOr[BooleanOptional]
    var EventCategories: js.UndefOr[EventCategoriesList]
    var SourceIds: js.UndefOr[SourceIdsList]
    var SourceType: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait CreateEventSubscriptionResponse extends js.Object {
    var EventSubscription: js.UndefOr[EventSubscription]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait CreateReplicationInstanceMessage extends js.Object {
    var ReplicationInstanceClass: String
    var ReplicationInstanceIdentifier: String
    var AllocatedStorage: js.UndefOr[IntegerOptional]
    var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional]
    var AvailabilityZone: js.UndefOr[String]
    var DnsNameServers: js.UndefOr[String]
    var EngineVersion: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var MultiAZ: js.UndefOr[BooleanOptional]
    var PreferredMaintenanceWindow: js.UndefOr[String]
    var PubliclyAccessible: js.UndefOr[BooleanOptional]
    var ReplicationSubnetGroupIdentifier: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
    var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait CreateReplicationInstanceResponse extends js.Object {
    var ReplicationInstance: js.UndefOr[ReplicationInstance]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait CreateReplicationSubnetGroupMessage extends js.Object {
    var ReplicationSubnetGroupDescription: String
    var ReplicationSubnetGroupIdentifier: String
    var SubnetIds: SubnetIdentifierList
    var Tags: js.UndefOr[TagList]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait CreateReplicationSubnetGroupResponse extends js.Object {
    var ReplicationSubnetGroup: js.UndefOr[ReplicationSubnetGroup]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait CreateReplicationTaskMessage extends js.Object {
    var MigrationType: MigrationTypeValue
    var ReplicationInstanceArn: String
    var ReplicationTaskIdentifier: String
    var SourceEndpointArn: String
    var TableMappings: String
    var TargetEndpointArn: String
    var CdcStartPosition: js.UndefOr[String]
    var CdcStartTime: js.UndefOr[TStamp]
    var CdcStopPosition: js.UndefOr[String]
    var ReplicationTaskSettings: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait CreateReplicationTaskResponse extends js.Object {
    var ReplicationTask: js.UndefOr[ReplicationTask]
  }

  @js.native
  sealed trait DataFormatValue extends js.Any
  object DataFormatValue extends js.Object {
    val csv     = "csv".asInstanceOf[DataFormatValue]
    val parquet = "parquet".asInstanceOf[DataFormatValue]

    val values = js.Object.freeze(js.Array(csv, parquet))
  }

  @js.native
  @Factory
  trait DeleteCertificateMessage extends js.Object {
    var CertificateArn: String
  }

  @js.native
  @Factory
  trait DeleteCertificateResponse extends js.Object {
    var Certificate: js.UndefOr[Certificate]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DeleteConnectionMessage extends js.Object {
    var EndpointArn: String
    var ReplicationInstanceArn: String
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DeleteConnectionResponse extends js.Object {
    var Connection: js.UndefOr[Connection]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DeleteEndpointMessage extends js.Object {
    var EndpointArn: String
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DeleteEndpointResponse extends js.Object {
    var Endpoint: js.UndefOr[Endpoint]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DeleteEventSubscriptionMessage extends js.Object {
    var SubscriptionName: String
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DeleteEventSubscriptionResponse extends js.Object {
    var EventSubscription: js.UndefOr[EventSubscription]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DeleteReplicationInstanceMessage extends js.Object {
    var ReplicationInstanceArn: String
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DeleteReplicationInstanceResponse extends js.Object {
    var ReplicationInstance: js.UndefOr[ReplicationInstance]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DeleteReplicationSubnetGroupMessage extends js.Object {
    var ReplicationSubnetGroupIdentifier: String
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DeleteReplicationSubnetGroupResponse extends js.Object {}

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DeleteReplicationTaskMessage extends js.Object {
    var ReplicationTaskArn: String
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DeleteReplicationTaskResponse extends js.Object {
    var ReplicationTask: js.UndefOr[ReplicationTask]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeAccountAttributesMessage extends js.Object {}

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeAccountAttributesResponse extends js.Object {
    var AccountQuotas: js.UndefOr[AccountQuotaList]
    var UniqueAccountIdentifier: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeCertificatesMessage extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  @js.native
  @Factory
  trait DescribeCertificatesResponse extends js.Object {
    var Certificates: js.UndefOr[CertificateList]
    var Marker: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeConnectionsMessage extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeConnectionsResponse extends js.Object {
    var Connections: js.UndefOr[ConnectionList]
    var Marker: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeEndpointTypesMessage extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeEndpointTypesResponse extends js.Object {
    var Marker: js.UndefOr[String]
    var SupportedEndpointTypes: js.UndefOr[SupportedEndpointTypeList]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeEndpointsMessage extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeEndpointsResponse extends js.Object {
    var Endpoints: js.UndefOr[EndpointList]
    var Marker: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeEventCategoriesMessage extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var SourceType: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeEventCategoriesResponse extends js.Object {
    var EventCategoryGroupList: js.UndefOr[EventCategoryGroupList]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeEventSubscriptionsMessage extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var SubscriptionName: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeEventSubscriptionsResponse extends js.Object {
    var EventSubscriptionsList: js.UndefOr[EventSubscriptionsList]
    var Marker: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeEventsMessage extends js.Object {
    var Duration: js.UndefOr[IntegerOptional]
    var EndTime: js.UndefOr[TStamp]
    var EventCategories: js.UndefOr[EventCategoriesList]
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var SourceIdentifier: js.UndefOr[String]
    var SourceType: js.UndefOr[SourceType]
    var StartTime: js.UndefOr[TStamp]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeEventsResponse extends js.Object {
    var Events: js.UndefOr[EventList]
    var Marker: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeOrderableReplicationInstancesMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeOrderableReplicationInstancesResponse extends js.Object {
    var Marker: js.UndefOr[String]
    var OrderableReplicationInstances: js.UndefOr[OrderableReplicationInstanceList]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribePendingMaintenanceActionsMessage extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var ReplicationInstanceArn: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribePendingMaintenanceActionsResponse extends js.Object {
    var Marker: js.UndefOr[String]
    var PendingMaintenanceActions: js.UndefOr[PendingMaintenanceActions]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeRefreshSchemasStatusMessage extends js.Object {
    var EndpointArn: String
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeRefreshSchemasStatusResponse extends js.Object {
    var RefreshSchemasStatus: js.UndefOr[RefreshSchemasStatus]
  }

  @js.native
  @Factory
  trait DescribeReplicationInstanceTaskLogsMessage extends js.Object {
    var ReplicationInstanceArn: String
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  @js.native
  @Factory
  trait DescribeReplicationInstanceTaskLogsResponse extends js.Object {
    var Marker: js.UndefOr[String]
    var ReplicationInstanceArn: js.UndefOr[String]
    var ReplicationInstanceTaskLogs: js.UndefOr[ReplicationInstanceTaskLogsList]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeReplicationInstancesMessage extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeReplicationInstancesResponse extends js.Object {
    var Marker: js.UndefOr[String]
    var ReplicationInstances: js.UndefOr[ReplicationInstanceList]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeReplicationSubnetGroupsMessage extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeReplicationSubnetGroupsResponse extends js.Object {
    var Marker: js.UndefOr[String]
    var ReplicationSubnetGroups: js.UndefOr[ReplicationSubnetGroups]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeReplicationTaskAssessmentResultsMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var ReplicationTaskArn: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeReplicationTaskAssessmentResultsResponse extends js.Object {
    var BucketName: js.UndefOr[String]
    var Marker: js.UndefOr[String]
    var ReplicationTaskAssessmentResults: js.UndefOr[ReplicationTaskAssessmentResultList]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeReplicationTasksMessage extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var WithoutSettings: js.UndefOr[BooleanOptional]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeReplicationTasksResponse extends js.Object {
    var Marker: js.UndefOr[String]
    var ReplicationTasks: js.UndefOr[ReplicationTaskList]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeSchemasMessage extends js.Object {
    var EndpointArn: String
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeSchemasResponse extends js.Object {
    var Marker: js.UndefOr[String]
    var Schemas: js.UndefOr[SchemaList]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeTableStatisticsMessage extends js.Object {
    var ReplicationTaskArn: String
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeTableStatisticsResponse extends js.Object {
    var Marker: js.UndefOr[String]
    var ReplicationTaskArn: js.UndefOr[String]
    var TableStatistics: js.UndefOr[TableStatisticsList]
  }

  @js.native
  sealed trait DmsSslModeValue extends js.Any
  object DmsSslModeValue extends js.Object {
    val none          = "none".asInstanceOf[DmsSslModeValue]
    val require       = "require".asInstanceOf[DmsSslModeValue]
    val `verify-ca`   = "verify-ca".asInstanceOf[DmsSslModeValue]
    val `verify-full` = "verify-full".asInstanceOf[DmsSslModeValue]

    val values = js.Object.freeze(js.Array(none, require, `verify-ca`, `verify-full`))
  }

  /**
    * The settings in JSON format for the DMS Transfer type source endpoint.
    */
  @js.native
  @Factory
  trait DmsTransferSettings extends js.Object {
    var BucketName: js.UndefOr[String]
    var ServiceAccessRoleArn: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DynamoDbSettings extends js.Object {
    var ServiceAccessRoleArn: String
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait ElasticsearchSettings extends js.Object {
    var EndpointUri: String
    var ServiceAccessRoleArn: String
    var ErrorRetryDuration: js.UndefOr[IntegerOptional]
    var FullLoadErrorPercentage: js.UndefOr[IntegerOptional]
  }

  @js.native
  sealed trait EncodingTypeValue extends js.Any
  object EncodingTypeValue extends js.Object {
    val plain              = "plain".asInstanceOf[EncodingTypeValue]
    val `plain-dictionary` = "plain-dictionary".asInstanceOf[EncodingTypeValue]
    val `rle-dictionary`   = "rle-dictionary".asInstanceOf[EncodingTypeValue]

    val values = js.Object.freeze(js.Array(plain, `plain-dictionary`, `rle-dictionary`))
  }

  @js.native
  sealed trait EncryptionModeValue extends js.Any
  object EncryptionModeValue extends js.Object {
    val `sse-s3`  = "sse-s3".asInstanceOf[EncryptionModeValue]
    val `sse-kms` = "sse-kms".asInstanceOf[EncryptionModeValue]

    val values = js.Object.freeze(js.Array(`sse-s3`, `sse-kms`))
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait Endpoint extends js.Object {
    var CertificateArn: js.UndefOr[String]
    var DatabaseName: js.UndefOr[String]
    var DmsTransferSettings: js.UndefOr[DmsTransferSettings]
    var DynamoDbSettings: js.UndefOr[DynamoDbSettings]
    var ElasticsearchSettings: js.UndefOr[ElasticsearchSettings]
    var EndpointArn: js.UndefOr[String]
    var EndpointIdentifier: js.UndefOr[String]
    var EndpointType: js.UndefOr[ReplicationEndpointTypeValue]
    var EngineDisplayName: js.UndefOr[String]
    var EngineName: js.UndefOr[String]
    var ExternalId: js.UndefOr[String]
    var ExternalTableDefinition: js.UndefOr[String]
    var ExtraConnectionAttributes: js.UndefOr[String]
    var KinesisSettings: js.UndefOr[KinesisSettings]
    var KmsKeyId: js.UndefOr[String]
    var MongoDbSettings: js.UndefOr[MongoDbSettings]
    var Port: js.UndefOr[IntegerOptional]
    var RedshiftSettings: js.UndefOr[RedshiftSettings]
    var S3Settings: js.UndefOr[S3Settings]
    var ServerName: js.UndefOr[String]
    var ServiceAccessRoleArn: js.UndefOr[String]
    var SslMode: js.UndefOr[DmsSslModeValue]
    var Status: js.UndefOr[String]
    var Username: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait Event extends js.Object {
    var Date: js.UndefOr[TStamp]
    var EventCategories: js.UndefOr[EventCategoriesList]
    var Message: js.UndefOr[String]
    var SourceIdentifier: js.UndefOr[String]
    var SourceType: js.UndefOr[SourceType]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait EventCategoryGroup extends js.Object {
    var EventCategories: js.UndefOr[EventCategoriesList]
    var SourceType: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait EventSubscription extends js.Object {
    var CustSubscriptionId: js.UndefOr[String]
    var CustomerAwsId: js.UndefOr[String]
    var Enabled: js.UndefOr[Boolean]
    var EventCategoriesList: js.UndefOr[EventCategoriesList]
    var SnsTopicArn: js.UndefOr[String]
    var SourceIdsList: js.UndefOr[SourceIdsList]
    var SourceType: js.UndefOr[String]
    var Status: js.UndefOr[String]
    var SubscriptionCreationTime: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait Filter extends js.Object {
    var Name: String
    var Values: FilterValueList
  }

  @js.native
  @Factory
  trait ImportCertificateMessage extends js.Object {
    var CertificateIdentifier: String
    var CertificatePem: js.UndefOr[String]
    var CertificateWallet: js.UndefOr[CertificateWallet]
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait ImportCertificateResponse extends js.Object {
    var Certificate: js.UndefOr[Certificate]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait KinesisSettings extends js.Object {
    var MessageFormat: js.UndefOr[MessageFormatValue]
    var ServiceAccessRoleArn: js.UndefOr[String]
    var StreamArn: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait ListTagsForResourceMessage extends js.Object {
    var ResourceArn: String
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait ListTagsForResourceResponse extends js.Object {
    var TagList: js.UndefOr[TagList]
  }

  @js.native
  sealed trait MessageFormatValue extends js.Any
  object MessageFormatValue extends js.Object {
    val json = "json".asInstanceOf[MessageFormatValue]

    val values = js.Object.freeze(js.Array(json))
  }

  @js.native
  sealed trait MigrationTypeValue extends js.Any
  object MigrationTypeValue extends js.Object {
    val `full-load`         = "full-load".asInstanceOf[MigrationTypeValue]
    val cdc                 = "cdc".asInstanceOf[MigrationTypeValue]
    val `full-load-and-cdc` = "full-load-and-cdc".asInstanceOf[MigrationTypeValue]

    val values = js.Object.freeze(js.Array(`full-load`, cdc, `full-load-and-cdc`))
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait ModifyEndpointMessage extends js.Object {
    var EndpointArn: String
    var CertificateArn: js.UndefOr[String]
    var DatabaseName: js.UndefOr[String]
    var DmsTransferSettings: js.UndefOr[DmsTransferSettings]
    var DynamoDbSettings: js.UndefOr[DynamoDbSettings]
    var ElasticsearchSettings: js.UndefOr[ElasticsearchSettings]
    var EndpointIdentifier: js.UndefOr[String]
    var EndpointType: js.UndefOr[ReplicationEndpointTypeValue]
    var EngineName: js.UndefOr[String]
    var ExternalTableDefinition: js.UndefOr[String]
    var ExtraConnectionAttributes: js.UndefOr[String]
    var KinesisSettings: js.UndefOr[KinesisSettings]
    var MongoDbSettings: js.UndefOr[MongoDbSettings]
    var Password: js.UndefOr[SecretString]
    var Port: js.UndefOr[IntegerOptional]
    var RedshiftSettings: js.UndefOr[RedshiftSettings]
    var S3Settings: js.UndefOr[S3Settings]
    var ServerName: js.UndefOr[String]
    var ServiceAccessRoleArn: js.UndefOr[String]
    var SslMode: js.UndefOr[DmsSslModeValue]
    var Username: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait ModifyEndpointResponse extends js.Object {
    var Endpoint: js.UndefOr[Endpoint]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait ModifyEventSubscriptionMessage extends js.Object {
    var SubscriptionName: String
    var Enabled: js.UndefOr[BooleanOptional]
    var EventCategories: js.UndefOr[EventCategoriesList]
    var SnsTopicArn: js.UndefOr[String]
    var SourceType: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait ModifyEventSubscriptionResponse extends js.Object {
    var EventSubscription: js.UndefOr[EventSubscription]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait ModifyReplicationInstanceMessage extends js.Object {
    var ReplicationInstanceArn: String
    var AllocatedStorage: js.UndefOr[IntegerOptional]
    var AllowMajorVersionUpgrade: js.UndefOr[Boolean]
    var ApplyImmediately: js.UndefOr[Boolean]
    var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional]
    var EngineVersion: js.UndefOr[String]
    var MultiAZ: js.UndefOr[BooleanOptional]
    var PreferredMaintenanceWindow: js.UndefOr[String]
    var ReplicationInstanceClass: js.UndefOr[String]
    var ReplicationInstanceIdentifier: js.UndefOr[String]
    var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait ModifyReplicationInstanceResponse extends js.Object {
    var ReplicationInstance: js.UndefOr[ReplicationInstance]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait ModifyReplicationSubnetGroupMessage extends js.Object {
    var ReplicationSubnetGroupIdentifier: String
    var SubnetIds: SubnetIdentifierList
    var ReplicationSubnetGroupDescription: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait ModifyReplicationSubnetGroupResponse extends js.Object {
    var ReplicationSubnetGroup: js.UndefOr[ReplicationSubnetGroup]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait ModifyReplicationTaskMessage extends js.Object {
    var ReplicationTaskArn: String
    var CdcStartPosition: js.UndefOr[String]
    var CdcStartTime: js.UndefOr[TStamp]
    var CdcStopPosition: js.UndefOr[String]
    var MigrationType: js.UndefOr[MigrationTypeValue]
    var ReplicationTaskIdentifier: js.UndefOr[String]
    var ReplicationTaskSettings: js.UndefOr[String]
    var TableMappings: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait ModifyReplicationTaskResponse extends js.Object {
    var ReplicationTask: js.UndefOr[ReplicationTask]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait MongoDbSettings extends js.Object {
    var AuthMechanism: js.UndefOr[AuthMechanismValue]
    var AuthSource: js.UndefOr[String]
    var AuthType: js.UndefOr[AuthTypeValue]
    var DatabaseName: js.UndefOr[String]
    var DocsToInvestigate: js.UndefOr[String]
    var ExtractDocId: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var NestingLevel: js.UndefOr[NestingLevelValue]
    var Password: js.UndefOr[SecretString]
    var Port: js.UndefOr[IntegerOptional]
    var ServerName: js.UndefOr[String]
    var Username: js.UndefOr[String]
  }

  @js.native
  sealed trait NestingLevelValue extends js.Any
  object NestingLevelValue extends js.Object {
    val none = "none".asInstanceOf[NestingLevelValue]
    val one  = "one".asInstanceOf[NestingLevelValue]

    val values = js.Object.freeze(js.Array(none, one))
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait OrderableReplicationInstance extends js.Object {
    var AvailabilityZones: js.UndefOr[AvailabilityZonesList]
    var DefaultAllocatedStorage: js.UndefOr[Int]
    var EngineVersion: js.UndefOr[String]
    var IncludedAllocatedStorage: js.UndefOr[Int]
    var MaxAllocatedStorage: js.UndefOr[Int]
    var MinAllocatedStorage: js.UndefOr[Int]
    var ReleaseStatus: js.UndefOr[ReleaseStatusValues]
    var ReplicationInstanceClass: js.UndefOr[String]
    var StorageType: js.UndefOr[String]
  }

  @js.native
  sealed trait ParquetVersionValue extends js.Any
  object ParquetVersionValue extends js.Object {
    val `parquet-1-0` = "parquet-1-0".asInstanceOf[ParquetVersionValue]
    val `parquet-2-0` = "parquet-2-0".asInstanceOf[ParquetVersionValue]

    val values = js.Object.freeze(js.Array(`parquet-1-0`, `parquet-2-0`))
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait PendingMaintenanceAction extends js.Object {
    var Action: js.UndefOr[String]
    var AutoAppliedAfterDate: js.UndefOr[TStamp]
    var CurrentApplyDate: js.UndefOr[TStamp]
    var Description: js.UndefOr[String]
    var ForcedApplyDate: js.UndefOr[TStamp]
    var OptInStatus: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait RebootReplicationInstanceMessage extends js.Object {
    var ReplicationInstanceArn: String
    var ForceFailover: js.UndefOr[BooleanOptional]
  }

  @js.native
  @Factory
  trait RebootReplicationInstanceResponse extends js.Object {
    var ReplicationInstance: js.UndefOr[ReplicationInstance]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait RedshiftSettings extends js.Object {
    var AcceptAnyDate: js.UndefOr[BooleanOptional]
    var AfterConnectScript: js.UndefOr[String]
    var BucketFolder: js.UndefOr[String]
    var BucketName: js.UndefOr[String]
    var ConnectionTimeout: js.UndefOr[IntegerOptional]
    var DatabaseName: js.UndefOr[String]
    var DateFormat: js.UndefOr[String]
    var EmptyAsNull: js.UndefOr[BooleanOptional]
    var EncryptionMode: js.UndefOr[EncryptionModeValue]
    var FileTransferUploadStreams: js.UndefOr[IntegerOptional]
    var LoadTimeout: js.UndefOr[IntegerOptional]
    var MaxFileSize: js.UndefOr[IntegerOptional]
    var Password: js.UndefOr[SecretString]
    var Port: js.UndefOr[IntegerOptional]
    var RemoveQuotes: js.UndefOr[BooleanOptional]
    var ReplaceChars: js.UndefOr[String]
    var ReplaceInvalidChars: js.UndefOr[String]
    var ServerName: js.UndefOr[String]
    var ServerSideEncryptionKmsKeyId: js.UndefOr[String]
    var ServiceAccessRoleArn: js.UndefOr[String]
    var TimeFormat: js.UndefOr[String]
    var TrimBlanks: js.UndefOr[BooleanOptional]
    var TruncateColumns: js.UndefOr[BooleanOptional]
    var Username: js.UndefOr[String]
    var WriteBufferSize: js.UndefOr[IntegerOptional]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait RefreshSchemasMessage extends js.Object {
    var EndpointArn: String
    var ReplicationInstanceArn: String
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait RefreshSchemasResponse extends js.Object {
    var RefreshSchemasStatus: js.UndefOr[RefreshSchemasStatus]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait RefreshSchemasStatus extends js.Object {
    var EndpointArn: js.UndefOr[String]
    var LastFailureMessage: js.UndefOr[String]
    var LastRefreshDate: js.UndefOr[TStamp]
    var ReplicationInstanceArn: js.UndefOr[String]
    var Status: js.UndefOr[RefreshSchemasStatusTypeValue]
  }

  @js.native
  sealed trait RefreshSchemasStatusTypeValue extends js.Any
  object RefreshSchemasStatusTypeValue extends js.Object {
    val successful = "successful".asInstanceOf[RefreshSchemasStatusTypeValue]
    val failed     = "failed".asInstanceOf[RefreshSchemasStatusTypeValue]
    val refreshing = "refreshing".asInstanceOf[RefreshSchemasStatusTypeValue]

    val values = js.Object.freeze(js.Array(successful, failed, refreshing))
  }

  @js.native
  sealed trait ReleaseStatusValues extends js.Any
  object ReleaseStatusValues extends js.Object {
    val beta = "beta".asInstanceOf[ReleaseStatusValues]

    val values = js.Object.freeze(js.Array(beta))
  }

  @js.native
  sealed trait ReloadOptionValue extends js.Any
  object ReloadOptionValue extends js.Object {
    val `data-reload`   = "data-reload".asInstanceOf[ReloadOptionValue]
    val `validate-only` = "validate-only".asInstanceOf[ReloadOptionValue]

    val values = js.Object.freeze(js.Array(`data-reload`, `validate-only`))
  }

  @js.native
  @Factory
  trait ReloadTablesMessage extends js.Object {
    var ReplicationTaskArn: String
    var TablesToReload: TableListToReload
    var ReloadOption: js.UndefOr[ReloadOptionValue]
  }

  @js.native
  @Factory
  trait ReloadTablesResponse extends js.Object {
    var ReplicationTaskArn: js.UndefOr[String]
  }

  /**
    * Removes one or more tags from an AWS DMS resource.
    */
  @js.native
  @Factory
  trait RemoveTagsFromResourceMessage extends js.Object {
    var ResourceArn: String
    var TagKeys: KeyList
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait RemoveTagsFromResourceResponse extends js.Object {}

  @js.native
  sealed trait ReplicationEndpointTypeValue extends js.Any
  object ReplicationEndpointTypeValue extends js.Object {
    val source = "source".asInstanceOf[ReplicationEndpointTypeValue]
    val target = "target".asInstanceOf[ReplicationEndpointTypeValue]

    val values = js.Object.freeze(js.Array(source, target))
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait ReplicationInstance extends js.Object {
    var AllocatedStorage: js.UndefOr[Int]
    var AutoMinorVersionUpgrade: js.UndefOr[Boolean]
    var AvailabilityZone: js.UndefOr[String]
    var DnsNameServers: js.UndefOr[String]
    var EngineVersion: js.UndefOr[String]
    var FreeUntil: js.UndefOr[TStamp]
    var InstanceCreateTime: js.UndefOr[TStamp]
    var KmsKeyId: js.UndefOr[String]
    var MultiAZ: js.UndefOr[Boolean]
    var PendingModifiedValues: js.UndefOr[ReplicationPendingModifiedValues]
    var PreferredMaintenanceWindow: js.UndefOr[String]
    var PubliclyAccessible: js.UndefOr[Boolean]
    var ReplicationInstanceArn: js.UndefOr[String]
    var ReplicationInstanceClass: js.UndefOr[String]
    var ReplicationInstanceIdentifier: js.UndefOr[String]
    var ReplicationInstancePrivateIpAddress: js.UndefOr[String]
    var ReplicationInstancePrivateIpAddresses: js.UndefOr[ReplicationInstancePrivateIpAddressList]
    var ReplicationInstancePublicIpAddress: js.UndefOr[String]
    var ReplicationInstancePublicIpAddresses: js.UndefOr[ReplicationInstancePublicIpAddressList]
    var ReplicationInstanceStatus: js.UndefOr[String]
    var ReplicationSubnetGroup: js.UndefOr[ReplicationSubnetGroup]
    var SecondaryAvailabilityZone: js.UndefOr[String]
    var VpcSecurityGroups: js.UndefOr[VpcSecurityGroupMembershipList]
  }

  /**
    * Contains metadata for a replication instance task log.
    */
  @js.native
  @Factory
  trait ReplicationInstanceTaskLog extends js.Object {
    var ReplicationInstanceTaskLogSize: js.UndefOr[Double]
    var ReplicationTaskArn: js.UndefOr[String]
    var ReplicationTaskName: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait ReplicationPendingModifiedValues extends js.Object {
    var AllocatedStorage: js.UndefOr[IntegerOptional]
    var EngineVersion: js.UndefOr[String]
    var MultiAZ: js.UndefOr[BooleanOptional]
    var ReplicationInstanceClass: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait ReplicationSubnetGroup extends js.Object {
    var ReplicationSubnetGroupDescription: js.UndefOr[String]
    var ReplicationSubnetGroupIdentifier: js.UndefOr[String]
    var SubnetGroupStatus: js.UndefOr[String]
    var Subnets: js.UndefOr[SubnetList]
    var VpcId: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait ReplicationTask extends js.Object {
    var CdcStartPosition: js.UndefOr[String]
    var CdcStopPosition: js.UndefOr[String]
    var LastFailureMessage: js.UndefOr[String]
    var MigrationType: js.UndefOr[MigrationTypeValue]
    var RecoveryCheckpoint: js.UndefOr[String]
    var ReplicationInstanceArn: js.UndefOr[String]
    var ReplicationTaskArn: js.UndefOr[String]
    var ReplicationTaskCreationDate: js.UndefOr[TStamp]
    var ReplicationTaskIdentifier: js.UndefOr[String]
    var ReplicationTaskSettings: js.UndefOr[String]
    var ReplicationTaskStartDate: js.UndefOr[TStamp]
    var ReplicationTaskStats: js.UndefOr[ReplicationTaskStats]
    var SourceEndpointArn: js.UndefOr[String]
    var Status: js.UndefOr[String]
    var StopReason: js.UndefOr[String]
    var TableMappings: js.UndefOr[String]
    var TargetEndpointArn: js.UndefOr[String]
  }

  /**
    * The task assessment report in JSON format.
    */
  @js.native
  @Factory
  trait ReplicationTaskAssessmentResult extends js.Object {
    var AssessmentResults: js.UndefOr[String]
    var AssessmentResultsFile: js.UndefOr[String]
    var AssessmentStatus: js.UndefOr[String]
    var ReplicationTaskArn: js.UndefOr[String]
    var ReplicationTaskIdentifier: js.UndefOr[String]
    var ReplicationTaskLastAssessmentDate: js.UndefOr[TStamp]
    var S3ObjectUrl: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait ReplicationTaskStats extends js.Object {
    var ElapsedTimeMillis: js.UndefOr[Double]
    var FreshStartDate: js.UndefOr[TStamp]
    var FullLoadFinishDate: js.UndefOr[TStamp]
    var FullLoadProgressPercent: js.UndefOr[Int]
    var FullLoadStartDate: js.UndefOr[TStamp]
    var StartDate: js.UndefOr[TStamp]
    var StopDate: js.UndefOr[TStamp]
    var TablesErrored: js.UndefOr[Int]
    var TablesLoaded: js.UndefOr[Int]
    var TablesLoading: js.UndefOr[Int]
    var TablesQueued: js.UndefOr[Int]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait ResourcePendingMaintenanceActions extends js.Object {
    var PendingMaintenanceActionDetails: js.UndefOr[PendingMaintenanceActionDetails]
    var ResourceIdentifier: js.UndefOr[String]
  }

  /**
    * Settings for exporting data to Amazon S3.
    */
  @js.native
  @Factory
  trait S3Settings extends js.Object {
    var BucketFolder: js.UndefOr[String]
    var BucketName: js.UndefOr[String]
    var CdcInsertsOnly: js.UndefOr[BooleanOptional]
    var CompressionType: js.UndefOr[CompressionTypeValue]
    var CsvDelimiter: js.UndefOr[String]
    var CsvRowDelimiter: js.UndefOr[String]
    var DataFormat: js.UndefOr[DataFormatValue]
    var DataPageSize: js.UndefOr[IntegerOptional]
    var DictPageSizeLimit: js.UndefOr[IntegerOptional]
    var EnableStatistics: js.UndefOr[BooleanOptional]
    var EncodingType: js.UndefOr[EncodingTypeValue]
    var EncryptionMode: js.UndefOr[EncryptionModeValue]
    var ExternalTableDefinition: js.UndefOr[String]
    var IncludeOpForFullLoad: js.UndefOr[BooleanOptional]
    var ParquetTimestampInMillisecond: js.UndefOr[BooleanOptional]
    var ParquetVersion: js.UndefOr[ParquetVersionValue]
    var RowGroupLength: js.UndefOr[IntegerOptional]
    var ServerSideEncryptionKmsKeyId: js.UndefOr[String]
    var ServiceAccessRoleArn: js.UndefOr[String]
    var TimestampColumnName: js.UndefOr[String]
  }

  @js.native
  sealed trait SourceType extends js.Any
  object SourceType extends js.Object {
    val `replication-instance` = "replication-instance".asInstanceOf[SourceType]

    val values = js.Object.freeze(js.Array(`replication-instance`))
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait StartReplicationTaskAssessmentMessage extends js.Object {
    var ReplicationTaskArn: String
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait StartReplicationTaskAssessmentResponse extends js.Object {
    var ReplicationTask: js.UndefOr[ReplicationTask]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait StartReplicationTaskMessage extends js.Object {
    var ReplicationTaskArn: String
    var StartReplicationTaskType: StartReplicationTaskTypeValue
    var CdcStartPosition: js.UndefOr[String]
    var CdcStartTime: js.UndefOr[TStamp]
    var CdcStopPosition: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait StartReplicationTaskResponse extends js.Object {
    var ReplicationTask: js.UndefOr[ReplicationTask]
  }

  @js.native
  sealed trait StartReplicationTaskTypeValue extends js.Any
  object StartReplicationTaskTypeValue extends js.Object {
    val `start-replication` = "start-replication".asInstanceOf[StartReplicationTaskTypeValue]
    val `resume-processing` = "resume-processing".asInstanceOf[StartReplicationTaskTypeValue]
    val `reload-target`     = "reload-target".asInstanceOf[StartReplicationTaskTypeValue]

    val values = js.Object.freeze(js.Array(`start-replication`, `resume-processing`, `reload-target`))
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait StopReplicationTaskMessage extends js.Object {
    var ReplicationTaskArn: String
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait StopReplicationTaskResponse extends js.Object {
    var ReplicationTask: js.UndefOr[ReplicationTask]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait Subnet extends js.Object {
    var SubnetAvailabilityZone: js.UndefOr[AvailabilityZone]
    var SubnetIdentifier: js.UndefOr[String]
    var SubnetStatus: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait SupportedEndpointType extends js.Object {
    var EndpointType: js.UndefOr[ReplicationEndpointTypeValue]
    var EngineDisplayName: js.UndefOr[String]
    var EngineName: js.UndefOr[String]
    var SupportsCDC: js.UndefOr[Boolean]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait TableStatistics extends js.Object {
    var Ddls: js.UndefOr[Double]
    var Deletes: js.UndefOr[Double]
    var FullLoadCondtnlChkFailedRows: js.UndefOr[Double]
    var FullLoadErrorRows: js.UndefOr[Double]
    var FullLoadRows: js.UndefOr[Double]
    var Inserts: js.UndefOr[Double]
    var LastUpdateTime: js.UndefOr[TStamp]
    var SchemaName: js.UndefOr[String]
    var TableName: js.UndefOr[String]
    var TableState: js.UndefOr[String]
    var Updates: js.UndefOr[Double]
    var ValidationFailedRecords: js.UndefOr[Double]
    var ValidationPendingRecords: js.UndefOr[Double]
    var ValidationState: js.UndefOr[String]
    var ValidationStateDetails: js.UndefOr[String]
    var ValidationSuspendedRecords: js.UndefOr[Double]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait TableToReload extends js.Object {
    var SchemaName: js.UndefOr[String]
    var TableName: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var Key: js.UndefOr[String]
    var Value: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait TestConnectionMessage extends js.Object {
    var EndpointArn: String
    var ReplicationInstanceArn: String
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait TestConnectionResponse extends js.Object {
    var Connection: js.UndefOr[Connection]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait VpcSecurityGroupMembership extends js.Object {
    var Status: js.UndefOr[String]
    var VpcSecurityGroupId: js.UndefOr[String]
  }
}
