package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object dms {
  type AccountQuotaList = js.Array[AccountQuota]
  type AuthMechanismValue = String
  type AuthTypeValue = String
  type BooleanOptional = Boolean
  type CertificateList = js.Array[Certificate]
  type CertificateWallet = nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type CompressionTypeValue = String
  type ConnectionList = js.Array[Connection]
  type DmsSslModeValue = String
  type EndpointList = js.Array[Endpoint]
  type EventCategoriesList = js.Array[String]
  type EventCategoryGroupList = js.Array[EventCategoryGroup]
  type EventList = js.Array[Event]
  type EventSubscriptionsList = js.Array[EventSubscription]
  type FilterList = js.Array[Filter]
  type FilterValueList = js.Array[String]
  type IntegerOptional = Int
  type KeyList = js.Array[String]
  type MessageFormatValue = String
  type MigrationTypeValue = String
  type NestingLevelValue = String
  type OrderableReplicationInstanceList = js.Array[OrderableReplicationInstance]
  type RefreshSchemasStatusTypeValue = String
  type ReloadOptionValue = String
  type ReplicationEndpointTypeValue = String
  type ReplicationInstanceList = js.Array[ReplicationInstance]
  type ReplicationInstancePrivateIpAddressList = js.Array[String]
  type ReplicationInstancePublicIpAddressList = js.Array[String]
  type ReplicationInstanceTaskLogsList = js.Array[ReplicationInstanceTaskLog]
  type ReplicationSubnetGroups = js.Array[ReplicationSubnetGroup]
  type ReplicationTaskAssessmentResultList = js.Array[ReplicationTaskAssessmentResult]
  type ReplicationTaskList = js.Array[ReplicationTask]
  type SchemaList = js.Array[String]
  type SecretString = String
  type SourceIdsList = js.Array[String]
  type SourceType = String
  type StartReplicationTaskTypeValue = String
  type SubnetIdentifierList = js.Array[String]
  type SubnetList = js.Array[Subnet]
  type SupportedEndpointTypeList = js.Array[SupportedEndpointType]
  type TStamp = js.Date
  type TableListToReload = js.Array[TableToReload]
  type TableStatisticsList = js.Array[TableStatistics]
  type TagList = js.Array[Tag]
  type VpcSecurityGroupIdList = js.Array[String]
  type VpcSecurityGroupMembershipList = js.Array[VpcSecurityGroupMembership]
}

package dms {
  @js.native
  @JSImport("aws-sdk", "DMS")
  class DMS(config: AWSConfig) extends js.Object {
    def addTagsToResource(params: AddTagsToResourceMessage): Request[AddTagsToResourceResponse] = js.native
    def createEndpoint(params: CreateEndpointMessage): Request[CreateEndpointResponse] = js.native
    def createEventSubscription(params: CreateEventSubscriptionMessage): Request[CreateEventSubscriptionResponse] = js.native
    def createReplicationInstance(params: CreateReplicationInstanceMessage): Request[CreateReplicationInstanceResponse] = js.native
    def createReplicationSubnetGroup(params: CreateReplicationSubnetGroupMessage): Request[CreateReplicationSubnetGroupResponse] = js.native
    def createReplicationTask(params: CreateReplicationTaskMessage): Request[CreateReplicationTaskResponse] = js.native
    def deleteCertificate(params: DeleteCertificateMessage): Request[DeleteCertificateResponse] = js.native
    def deleteEndpoint(params: DeleteEndpointMessage): Request[DeleteEndpointResponse] = js.native
    def deleteEventSubscription(params: DeleteEventSubscriptionMessage): Request[DeleteEventSubscriptionResponse] = js.native
    def deleteReplicationInstance(params: DeleteReplicationInstanceMessage): Request[DeleteReplicationInstanceResponse] = js.native
    def deleteReplicationSubnetGroup(params: DeleteReplicationSubnetGroupMessage): Request[DeleteReplicationSubnetGroupResponse] = js.native
    def deleteReplicationTask(params: DeleteReplicationTaskMessage): Request[DeleteReplicationTaskResponse] = js.native
    def describeAccountAttributes(params: DescribeAccountAttributesMessage): Request[DescribeAccountAttributesResponse] = js.native
    def describeCertificates(params: DescribeCertificatesMessage): Request[DescribeCertificatesResponse] = js.native
    def describeConnections(params: DescribeConnectionsMessage): Request[DescribeConnectionsResponse] = js.native
    def describeEndpointTypes(params: DescribeEndpointTypesMessage): Request[DescribeEndpointTypesResponse] = js.native
    def describeEndpoints(params: DescribeEndpointsMessage): Request[DescribeEndpointsResponse] = js.native
    def describeEventCategories(params: DescribeEventCategoriesMessage): Request[DescribeEventCategoriesResponse] = js.native
    def describeEventSubscriptions(params: DescribeEventSubscriptionsMessage): Request[DescribeEventSubscriptionsResponse] = js.native
    def describeEvents(params: DescribeEventsMessage): Request[DescribeEventsResponse] = js.native
    def describeOrderableReplicationInstances(params: DescribeOrderableReplicationInstancesMessage): Request[DescribeOrderableReplicationInstancesResponse] = js.native
    def describeRefreshSchemasStatus(params: DescribeRefreshSchemasStatusMessage): Request[DescribeRefreshSchemasStatusResponse] = js.native
    def describeReplicationInstanceTaskLogs(params: DescribeReplicationInstanceTaskLogsMessage): Request[DescribeReplicationInstanceTaskLogsResponse] = js.native
    def describeReplicationInstances(params: DescribeReplicationInstancesMessage): Request[DescribeReplicationInstancesResponse] = js.native
    def describeReplicationSubnetGroups(params: DescribeReplicationSubnetGroupsMessage): Request[DescribeReplicationSubnetGroupsResponse] = js.native
    def describeReplicationTaskAssessmentResults(params: DescribeReplicationTaskAssessmentResultsMessage): Request[DescribeReplicationTaskAssessmentResultsResponse] = js.native
    def describeReplicationTasks(params: DescribeReplicationTasksMessage): Request[DescribeReplicationTasksResponse] = js.native
    def describeSchemas(params: DescribeSchemasMessage): Request[DescribeSchemasResponse] = js.native
    def describeTableStatistics(params: DescribeTableStatisticsMessage): Request[DescribeTableStatisticsResponse] = js.native
    def importCertificate(params: ImportCertificateMessage): Request[ImportCertificateResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceMessage): Request[ListTagsForResourceResponse] = js.native
    def modifyEndpoint(params: ModifyEndpointMessage): Request[ModifyEndpointResponse] = js.native
    def modifyEventSubscription(params: ModifyEventSubscriptionMessage): Request[ModifyEventSubscriptionResponse] = js.native
    def modifyReplicationInstance(params: ModifyReplicationInstanceMessage): Request[ModifyReplicationInstanceResponse] = js.native
    def modifyReplicationSubnetGroup(params: ModifyReplicationSubnetGroupMessage): Request[ModifyReplicationSubnetGroupResponse] = js.native
    def modifyReplicationTask(params: ModifyReplicationTaskMessage): Request[ModifyReplicationTaskResponse] = js.native
    def rebootReplicationInstance(params: RebootReplicationInstanceMessage): Request[RebootReplicationInstanceResponse] = js.native
    def refreshSchemas(params: RefreshSchemasMessage): Request[RefreshSchemasResponse] = js.native
    def reloadTables(params: ReloadTablesMessage): Request[ReloadTablesResponse] = js.native
    def removeTagsFromResource(params: RemoveTagsFromResourceMessage): Request[RemoveTagsFromResourceResponse] = js.native
    def startReplicationTask(params: StartReplicationTaskMessage): Request[StartReplicationTaskResponse] = js.native
    def startReplicationTaskAssessment(params: StartReplicationTaskAssessmentMessage): Request[StartReplicationTaskAssessmentResponse] = js.native
    def stopReplicationTask(params: StopReplicationTaskMessage): Request[StopReplicationTaskResponse] = js.native
    def testConnection(params: TestConnectionMessage): Request[TestConnectionResponse] = js.native
  }

  /**
   * <p>Describes a quota for an AWS account, for example, the number of replication instances allowed.</p>
   */
  @js.native
  trait AccountQuota extends js.Object {
    var AccountQuotaName: js.UndefOr[String]
    var Used: js.UndefOr[Double]
    var Max: js.UndefOr[Double]
  }

  object AccountQuota {
    def apply(
      AccountQuotaName: js.UndefOr[String] = js.undefined,
      Used: js.UndefOr[Double] = js.undefined,
      Max: js.UndefOr[Double] = js.undefined): AccountQuota = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountQuotaName" -> AccountQuotaName.map { x => x.asInstanceOf[js.Any] },
        "Used" -> Used.map { x => x.asInstanceOf[js.Any] },
        "Max" -> Max.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AccountQuota]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait AddTagsToResourceMessage extends js.Object {
    var ResourceArn: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  object AddTagsToResourceMessage {
    def apply(
      ResourceArn: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): AddTagsToResourceMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddTagsToResourceMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait AddTagsToResourceResponse extends js.Object {

  }

  object AddTagsToResourceResponse {
    def apply(): AddTagsToResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddTagsToResourceResponse]
    }
  }

  object AuthMechanismValueEnum {
    val default = "default"
    val mongodb_cr = "mongodb_cr"
    val scram_sha_1 = "scram_sha_1"

    val values = IndexedSeq(default, mongodb_cr, scram_sha_1)
  }

  object AuthTypeValueEnum {
    val no = "no"
    val password = "password"

    val values = IndexedSeq(no, password)
  }

  /**
   * <p/>
   */
  @js.native
  trait AvailabilityZone extends js.Object {
    var Name: js.UndefOr[String]
  }

  object AvailabilityZone {
    def apply(
      Name: js.UndefOr[String] = js.undefined): AvailabilityZone = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AvailabilityZone]
    }
  }

  /**
   * <p>The SSL certificate that can be used to encrypt connections between the endpoints and the replication instance.</p>
   */
  @js.native
  trait Certificate extends js.Object {
    var CertificateOwner: js.UndefOr[String]
    var SigningAlgorithm: js.UndefOr[String]
    var ValidToDate: js.UndefOr[TStamp]
    var CertificatePem: js.UndefOr[String]
    var CertificateArn: js.UndefOr[String]
    var KeyLength: js.UndefOr[IntegerOptional]
    var CertificateCreationDate: js.UndefOr[TStamp]
    var CertificateIdentifier: js.UndefOr[String]
    var ValidFromDate: js.UndefOr[TStamp]
    var CertificateWallet: js.UndefOr[CertificateWallet]
  }

  object Certificate {
    def apply(
      CertificateOwner: js.UndefOr[String] = js.undefined,
      SigningAlgorithm: js.UndefOr[String] = js.undefined,
      ValidToDate: js.UndefOr[TStamp] = js.undefined,
      CertificatePem: js.UndefOr[String] = js.undefined,
      CertificateArn: js.UndefOr[String] = js.undefined,
      KeyLength: js.UndefOr[IntegerOptional] = js.undefined,
      CertificateCreationDate: js.UndefOr[TStamp] = js.undefined,
      CertificateIdentifier: js.UndefOr[String] = js.undefined,
      ValidFromDate: js.UndefOr[TStamp] = js.undefined,
      CertificateWallet: js.UndefOr[CertificateWallet] = js.undefined): Certificate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CertificateOwner" -> CertificateOwner.map { x => x.asInstanceOf[js.Any] },
        "SigningAlgorithm" -> SigningAlgorithm.map { x => x.asInstanceOf[js.Any] },
        "ValidToDate" -> ValidToDate.map { x => x.asInstanceOf[js.Any] },
        "CertificatePem" -> CertificatePem.map { x => x.asInstanceOf[js.Any] },
        "CertificateArn" -> CertificateArn.map { x => x.asInstanceOf[js.Any] },
        "KeyLength" -> KeyLength.map { x => x.asInstanceOf[js.Any] },
        "CertificateCreationDate" -> CertificateCreationDate.map { x => x.asInstanceOf[js.Any] },
        "CertificateIdentifier" -> CertificateIdentifier.map { x => x.asInstanceOf[js.Any] },
        "ValidFromDate" -> ValidFromDate.map { x => x.asInstanceOf[js.Any] },
        "CertificateWallet" -> CertificateWallet.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Certificate]
    }
  }

  object CompressionTypeValueEnum {
    val none = "none"
    val gzip = "gzip"

    val values = IndexedSeq(none, gzip)
  }

  /**
   * <p/>
   */
  @js.native
  trait Connection extends js.Object {
    var LastFailureMessage: js.UndefOr[String]
    var EndpointIdentifier: js.UndefOr[String]
    var EndpointArn: js.UndefOr[String]
    var ReplicationInstanceIdentifier: js.UndefOr[String]
    var ReplicationInstanceArn: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  object Connection {
    def apply(
      LastFailureMessage: js.UndefOr[String] = js.undefined,
      EndpointIdentifier: js.UndefOr[String] = js.undefined,
      EndpointArn: js.UndefOr[String] = js.undefined,
      ReplicationInstanceIdentifier: js.UndefOr[String] = js.undefined,
      ReplicationInstanceArn: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[String] = js.undefined): Connection = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LastFailureMessage" -> LastFailureMessage.map { x => x.asInstanceOf[js.Any] },
        "EndpointIdentifier" -> EndpointIdentifier.map { x => x.asInstanceOf[js.Any] },
        "EndpointArn" -> EndpointArn.map { x => x.asInstanceOf[js.Any] },
        "ReplicationInstanceIdentifier" -> ReplicationInstanceIdentifier.map { x => x.asInstanceOf[js.Any] },
        "ReplicationInstanceArn" -> ReplicationInstanceArn.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Connection]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait CreateEndpointMessage extends js.Object {
    var MongoDbSettings: js.UndefOr[MongoDbSettings]
    var Username: js.UndefOr[String]
    var ExtraConnectionAttributes: js.UndefOr[String]
    var DatabaseName: js.UndefOr[String]
    var DynamoDbSettings: js.UndefOr[DynamoDbSettings]
    var S3Settings: js.UndefOr[S3Settings]
    var ElasticsearchSettings: js.UndefOr[ElasticsearchSettings]
    var EndpointIdentifier: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var KinesisSettings: js.UndefOr[KinesisSettings]
    var CertificateArn: js.UndefOr[String]
    var ServerName: js.UndefOr[String]
    var Password: js.UndefOr[SecretString]
    var EngineName: js.UndefOr[String]
    var ExternalTableDefinition: js.UndefOr[String]
    var EndpointType: js.UndefOr[ReplicationEndpointTypeValue]
    var Port: js.UndefOr[IntegerOptional]
    var ServiceAccessRoleArn: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
    var DmsTransferSettings: js.UndefOr[DmsTransferSettings]
    var SslMode: js.UndefOr[DmsSslModeValue]
  }

  object CreateEndpointMessage {
    def apply(
      MongoDbSettings: js.UndefOr[MongoDbSettings] = js.undefined,
      Username: js.UndefOr[String] = js.undefined,
      ExtraConnectionAttributes: js.UndefOr[String] = js.undefined,
      DatabaseName: js.UndefOr[String] = js.undefined,
      DynamoDbSettings: js.UndefOr[DynamoDbSettings] = js.undefined,
      S3Settings: js.UndefOr[S3Settings] = js.undefined,
      ElasticsearchSettings: js.UndefOr[ElasticsearchSettings] = js.undefined,
      EndpointIdentifier: js.UndefOr[String] = js.undefined,
      KmsKeyId: js.UndefOr[String] = js.undefined,
      KinesisSettings: js.UndefOr[KinesisSettings] = js.undefined,
      CertificateArn: js.UndefOr[String] = js.undefined,
      ServerName: js.UndefOr[String] = js.undefined,
      Password: js.UndefOr[SecretString] = js.undefined,
      EngineName: js.UndefOr[String] = js.undefined,
      ExternalTableDefinition: js.UndefOr[String] = js.undefined,
      EndpointType: js.UndefOr[ReplicationEndpointTypeValue] = js.undefined,
      Port: js.UndefOr[IntegerOptional] = js.undefined,
      ServiceAccessRoleArn: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      DmsTransferSettings: js.UndefOr[DmsTransferSettings] = js.undefined,
      SslMode: js.UndefOr[DmsSslModeValue] = js.undefined): CreateEndpointMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MongoDbSettings" -> MongoDbSettings.map { x => x.asInstanceOf[js.Any] },
        "Username" -> Username.map { x => x.asInstanceOf[js.Any] },
        "ExtraConnectionAttributes" -> ExtraConnectionAttributes.map { x => x.asInstanceOf[js.Any] },
        "DatabaseName" -> DatabaseName.map { x => x.asInstanceOf[js.Any] },
        "DynamoDbSettings" -> DynamoDbSettings.map { x => x.asInstanceOf[js.Any] },
        "S3Settings" -> S3Settings.map { x => x.asInstanceOf[js.Any] },
        "ElasticsearchSettings" -> ElasticsearchSettings.map { x => x.asInstanceOf[js.Any] },
        "EndpointIdentifier" -> EndpointIdentifier.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "KinesisSettings" -> KinesisSettings.map { x => x.asInstanceOf[js.Any] },
        "CertificateArn" -> CertificateArn.map { x => x.asInstanceOf[js.Any] },
        "ServerName" -> ServerName.map { x => x.asInstanceOf[js.Any] },
        "Password" -> Password.map { x => x.asInstanceOf[js.Any] },
        "EngineName" -> EngineName.map { x => x.asInstanceOf[js.Any] },
        "ExternalTableDefinition" -> ExternalTableDefinition.map { x => x.asInstanceOf[js.Any] },
        "EndpointType" -> EndpointType.map { x => x.asInstanceOf[js.Any] },
        "Port" -> Port.map { x => x.asInstanceOf[js.Any] },
        "ServiceAccessRoleArn" -> ServiceAccessRoleArn.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "DmsTransferSettings" -> DmsTransferSettings.map { x => x.asInstanceOf[js.Any] },
        "SslMode" -> SslMode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateEndpointMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait CreateEndpointResponse extends js.Object {
    var Endpoint: js.UndefOr[Endpoint]
  }

  object CreateEndpointResponse {
    def apply(
      Endpoint: js.UndefOr[Endpoint] = js.undefined): CreateEndpointResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Endpoint" -> Endpoint.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateEndpointResponse]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait CreateEventSubscriptionMessage extends js.Object {
    var Enabled: js.UndefOr[BooleanOptional]
    var SourceIds: js.UndefOr[SourceIdsList]
    var SubscriptionName: js.UndefOr[String]
    var SnsTopicArn: js.UndefOr[String]
    var EventCategories: js.UndefOr[EventCategoriesList]
    var Tags: js.UndefOr[TagList]
    var SourceType: js.UndefOr[String]
  }

  object CreateEventSubscriptionMessage {
    def apply(
      Enabled: js.UndefOr[BooleanOptional] = js.undefined,
      SourceIds: js.UndefOr[SourceIdsList] = js.undefined,
      SubscriptionName: js.UndefOr[String] = js.undefined,
      SnsTopicArn: js.UndefOr[String] = js.undefined,
      EventCategories: js.UndefOr[EventCategoriesList] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      SourceType: js.UndefOr[String] = js.undefined): CreateEventSubscriptionMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Enabled" -> Enabled.map { x => x.asInstanceOf[js.Any] },
        "SourceIds" -> SourceIds.map { x => x.asInstanceOf[js.Any] },
        "SubscriptionName" -> SubscriptionName.map { x => x.asInstanceOf[js.Any] },
        "SnsTopicArn" -> SnsTopicArn.map { x => x.asInstanceOf[js.Any] },
        "EventCategories" -> EventCategories.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "SourceType" -> SourceType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateEventSubscriptionMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait CreateEventSubscriptionResponse extends js.Object {
    var EventSubscription: js.UndefOr[EventSubscription]
  }

  object CreateEventSubscriptionResponse {
    def apply(
      EventSubscription: js.UndefOr[EventSubscription] = js.undefined): CreateEventSubscriptionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EventSubscription" -> EventSubscription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateEventSubscriptionResponse]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait CreateReplicationInstanceMessage extends js.Object {
    var PreferredMaintenanceWindow: js.UndefOr[String]
    var MultiAZ: js.UndefOr[BooleanOptional]
    var KmsKeyId: js.UndefOr[String]
    var ReplicationSubnetGroupIdentifier: js.UndefOr[String]
    var AllocatedStorage: js.UndefOr[IntegerOptional]
    var ReplicationInstanceIdentifier: js.UndefOr[String]
    var AvailabilityZone: js.UndefOr[String]
    var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional]
    var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList]
    var EngineVersion: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
    var PubliclyAccessible: js.UndefOr[BooleanOptional]
    var DnsNameServers: js.UndefOr[String]
    var ReplicationInstanceClass: js.UndefOr[String]
  }

  object CreateReplicationInstanceMessage {
    def apply(
      PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
      MultiAZ: js.UndefOr[BooleanOptional] = js.undefined,
      KmsKeyId: js.UndefOr[String] = js.undefined,
      ReplicationSubnetGroupIdentifier: js.UndefOr[String] = js.undefined,
      AllocatedStorage: js.UndefOr[IntegerOptional] = js.undefined,
      ReplicationInstanceIdentifier: js.UndefOr[String] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined,
      VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined,
      EngineVersion: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      PubliclyAccessible: js.UndefOr[BooleanOptional] = js.undefined,
      DnsNameServers: js.UndefOr[String] = js.undefined,
      ReplicationInstanceClass: js.UndefOr[String] = js.undefined): CreateReplicationInstanceMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PreferredMaintenanceWindow" -> PreferredMaintenanceWindow.map { x => x.asInstanceOf[js.Any] },
        "MultiAZ" -> MultiAZ.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "ReplicationSubnetGroupIdentifier" -> ReplicationSubnetGroupIdentifier.map { x => x.asInstanceOf[js.Any] },
        "AllocatedStorage" -> AllocatedStorage.map { x => x.asInstanceOf[js.Any] },
        "ReplicationInstanceIdentifier" -> ReplicationInstanceIdentifier.map { x => x.asInstanceOf[js.Any] },
        "AvailabilityZone" -> AvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "AutoMinorVersionUpgrade" -> AutoMinorVersionUpgrade.map { x => x.asInstanceOf[js.Any] },
        "VpcSecurityGroupIds" -> VpcSecurityGroupIds.map { x => x.asInstanceOf[js.Any] },
        "EngineVersion" -> EngineVersion.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "PubliclyAccessible" -> PubliclyAccessible.map { x => x.asInstanceOf[js.Any] },
        "DnsNameServers" -> DnsNameServers.map { x => x.asInstanceOf[js.Any] },
        "ReplicationInstanceClass" -> ReplicationInstanceClass.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateReplicationInstanceMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait CreateReplicationInstanceResponse extends js.Object {
    var ReplicationInstance: js.UndefOr[ReplicationInstance]
  }

  object CreateReplicationInstanceResponse {
    def apply(
      ReplicationInstance: js.UndefOr[ReplicationInstance] = js.undefined): CreateReplicationInstanceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReplicationInstance" -> ReplicationInstance.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateReplicationInstanceResponse]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait CreateReplicationSubnetGroupMessage extends js.Object {
    var ReplicationSubnetGroupIdentifier: js.UndefOr[String]
    var ReplicationSubnetGroupDescription: js.UndefOr[String]
    var SubnetIds: js.UndefOr[SubnetIdentifierList]
    var Tags: js.UndefOr[TagList]
  }

  object CreateReplicationSubnetGroupMessage {
    def apply(
      ReplicationSubnetGroupIdentifier: js.UndefOr[String] = js.undefined,
      ReplicationSubnetGroupDescription: js.UndefOr[String] = js.undefined,
      SubnetIds: js.UndefOr[SubnetIdentifierList] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): CreateReplicationSubnetGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReplicationSubnetGroupIdentifier" -> ReplicationSubnetGroupIdentifier.map { x => x.asInstanceOf[js.Any] },
        "ReplicationSubnetGroupDescription" -> ReplicationSubnetGroupDescription.map { x => x.asInstanceOf[js.Any] },
        "SubnetIds" -> SubnetIds.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateReplicationSubnetGroupMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait CreateReplicationSubnetGroupResponse extends js.Object {
    var ReplicationSubnetGroup: js.UndefOr[ReplicationSubnetGroup]
  }

  object CreateReplicationSubnetGroupResponse {
    def apply(
      ReplicationSubnetGroup: js.UndefOr[ReplicationSubnetGroup] = js.undefined): CreateReplicationSubnetGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReplicationSubnetGroup" -> ReplicationSubnetGroup.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateReplicationSubnetGroupResponse]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait CreateReplicationTaskMessage extends js.Object {
    var ReplicationTaskSettings: js.UndefOr[String]
    var CdcStopPosition: js.UndefOr[String]
    var MigrationType: js.UndefOr[MigrationTypeValue]
    var SourceEndpointArn: js.UndefOr[String]
    var ReplicationTaskIdentifier: js.UndefOr[String]
    var CdcStartPosition: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
    var TableMappings: js.UndefOr[String]
    var ReplicationInstanceArn: js.UndefOr[String]
    var TargetEndpointArn: js.UndefOr[String]
    var CdcStartTime: js.UndefOr[TStamp]
  }

  object CreateReplicationTaskMessage {
    def apply(
      ReplicationTaskSettings: js.UndefOr[String] = js.undefined,
      CdcStopPosition: js.UndefOr[String] = js.undefined,
      MigrationType: js.UndefOr[MigrationTypeValue] = js.undefined,
      SourceEndpointArn: js.UndefOr[String] = js.undefined,
      ReplicationTaskIdentifier: js.UndefOr[String] = js.undefined,
      CdcStartPosition: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      TableMappings: js.UndefOr[String] = js.undefined,
      ReplicationInstanceArn: js.UndefOr[String] = js.undefined,
      TargetEndpointArn: js.UndefOr[String] = js.undefined,
      CdcStartTime: js.UndefOr[TStamp] = js.undefined): CreateReplicationTaskMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReplicationTaskSettings" -> ReplicationTaskSettings.map { x => x.asInstanceOf[js.Any] },
        "CdcStopPosition" -> CdcStopPosition.map { x => x.asInstanceOf[js.Any] },
        "MigrationType" -> MigrationType.map { x => x.asInstanceOf[js.Any] },
        "SourceEndpointArn" -> SourceEndpointArn.map { x => x.asInstanceOf[js.Any] },
        "ReplicationTaskIdentifier" -> ReplicationTaskIdentifier.map { x => x.asInstanceOf[js.Any] },
        "CdcStartPosition" -> CdcStartPosition.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "TableMappings" -> TableMappings.map { x => x.asInstanceOf[js.Any] },
        "ReplicationInstanceArn" -> ReplicationInstanceArn.map { x => x.asInstanceOf[js.Any] },
        "TargetEndpointArn" -> TargetEndpointArn.map { x => x.asInstanceOf[js.Any] },
        "CdcStartTime" -> CdcStartTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateReplicationTaskMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait CreateReplicationTaskResponse extends js.Object {
    var ReplicationTask: js.UndefOr[ReplicationTask]
  }

  object CreateReplicationTaskResponse {
    def apply(
      ReplicationTask: js.UndefOr[ReplicationTask] = js.undefined): CreateReplicationTaskResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReplicationTask" -> ReplicationTask.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateReplicationTaskResponse]
    }
  }

  @js.native
  trait DeleteCertificateMessage extends js.Object {
    var CertificateArn: js.UndefOr[String]
  }

  object DeleteCertificateMessage {
    def apply(
      CertificateArn: js.UndefOr[String] = js.undefined): DeleteCertificateMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CertificateArn" -> CertificateArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteCertificateMessage]
    }
  }

  @js.native
  trait DeleteCertificateResponse extends js.Object {
    var Certificate: js.UndefOr[Certificate]
  }

  object DeleteCertificateResponse {
    def apply(
      Certificate: js.UndefOr[Certificate] = js.undefined): DeleteCertificateResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Certificate" -> Certificate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteCertificateResponse]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DeleteEndpointMessage extends js.Object {
    var EndpointArn: js.UndefOr[String]
  }

  object DeleteEndpointMessage {
    def apply(
      EndpointArn: js.UndefOr[String] = js.undefined): DeleteEndpointMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndpointArn" -> EndpointArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteEndpointMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DeleteEndpointResponse extends js.Object {
    var Endpoint: js.UndefOr[Endpoint]
  }

  object DeleteEndpointResponse {
    def apply(
      Endpoint: js.UndefOr[Endpoint] = js.undefined): DeleteEndpointResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Endpoint" -> Endpoint.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteEndpointResponse]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DeleteEventSubscriptionMessage extends js.Object {
    var SubscriptionName: js.UndefOr[String]
  }

  object DeleteEventSubscriptionMessage {
    def apply(
      SubscriptionName: js.UndefOr[String] = js.undefined): DeleteEventSubscriptionMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SubscriptionName" -> SubscriptionName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteEventSubscriptionMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DeleteEventSubscriptionResponse extends js.Object {
    var EventSubscription: js.UndefOr[EventSubscription]
  }

  object DeleteEventSubscriptionResponse {
    def apply(
      EventSubscription: js.UndefOr[EventSubscription] = js.undefined): DeleteEventSubscriptionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EventSubscription" -> EventSubscription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteEventSubscriptionResponse]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DeleteReplicationInstanceMessage extends js.Object {
    var ReplicationInstanceArn: js.UndefOr[String]
  }

  object DeleteReplicationInstanceMessage {
    def apply(
      ReplicationInstanceArn: js.UndefOr[String] = js.undefined): DeleteReplicationInstanceMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReplicationInstanceArn" -> ReplicationInstanceArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteReplicationInstanceMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DeleteReplicationInstanceResponse extends js.Object {
    var ReplicationInstance: js.UndefOr[ReplicationInstance]
  }

  object DeleteReplicationInstanceResponse {
    def apply(
      ReplicationInstance: js.UndefOr[ReplicationInstance] = js.undefined): DeleteReplicationInstanceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReplicationInstance" -> ReplicationInstance.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteReplicationInstanceResponse]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DeleteReplicationSubnetGroupMessage extends js.Object {
    var ReplicationSubnetGroupIdentifier: js.UndefOr[String]
  }

  object DeleteReplicationSubnetGroupMessage {
    def apply(
      ReplicationSubnetGroupIdentifier: js.UndefOr[String] = js.undefined): DeleteReplicationSubnetGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReplicationSubnetGroupIdentifier" -> ReplicationSubnetGroupIdentifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteReplicationSubnetGroupMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DeleteReplicationSubnetGroupResponse extends js.Object {

  }

  object DeleteReplicationSubnetGroupResponse {
    def apply(): DeleteReplicationSubnetGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteReplicationSubnetGroupResponse]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DeleteReplicationTaskMessage extends js.Object {
    var ReplicationTaskArn: js.UndefOr[String]
  }

  object DeleteReplicationTaskMessage {
    def apply(
      ReplicationTaskArn: js.UndefOr[String] = js.undefined): DeleteReplicationTaskMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReplicationTaskArn" -> ReplicationTaskArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteReplicationTaskMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DeleteReplicationTaskResponse extends js.Object {
    var ReplicationTask: js.UndefOr[ReplicationTask]
  }

  object DeleteReplicationTaskResponse {
    def apply(
      ReplicationTask: js.UndefOr[ReplicationTask] = js.undefined): DeleteReplicationTaskResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReplicationTask" -> ReplicationTask.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteReplicationTaskResponse]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeAccountAttributesMessage extends js.Object {

  }

  object DescribeAccountAttributesMessage {
    def apply(): DescribeAccountAttributesMessage = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAccountAttributesMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeAccountAttributesResponse extends js.Object {
    var AccountQuotas: js.UndefOr[AccountQuotaList]
  }

  object DescribeAccountAttributesResponse {
    def apply(
      AccountQuotas: js.UndefOr[AccountQuotaList] = js.undefined): DescribeAccountAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountQuotas" -> AccountQuotas.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAccountAttributesResponse]
    }
  }

  @js.native
  trait DescribeCertificatesMessage extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var Marker: js.UndefOr[String]
  }

  object DescribeCertificatesMessage {
    def apply(
      Filters: js.UndefOr[FilterList] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeCertificatesMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCertificatesMessage]
    }
  }

  @js.native
  trait DescribeCertificatesResponse extends js.Object {
    var Marker: js.UndefOr[String]
    var Certificates: js.UndefOr[CertificateList]
  }

  object DescribeCertificatesResponse {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      Certificates: js.UndefOr[CertificateList] = js.undefined): DescribeCertificatesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "Certificates" -> Certificates.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCertificatesResponse]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeConnectionsMessage extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var Marker: js.UndefOr[String]
  }

  object DescribeConnectionsMessage {
    def apply(
      Filters: js.UndefOr[FilterList] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeConnectionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeConnectionsMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeConnectionsResponse extends js.Object {
    var Marker: js.UndefOr[String]
    var Connections: js.UndefOr[ConnectionList]
  }

  object DescribeConnectionsResponse {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      Connections: js.UndefOr[ConnectionList] = js.undefined): DescribeConnectionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "Connections" -> Connections.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeConnectionsResponse]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeEndpointTypesMessage extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var Marker: js.UndefOr[String]
  }

  object DescribeEndpointTypesMessage {
    def apply(
      Filters: js.UndefOr[FilterList] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeEndpointTypesMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEndpointTypesMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeEndpointTypesResponse extends js.Object {
    var Marker: js.UndefOr[String]
    var SupportedEndpointTypes: js.UndefOr[SupportedEndpointTypeList]
  }

  object DescribeEndpointTypesResponse {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      SupportedEndpointTypes: js.UndefOr[SupportedEndpointTypeList] = js.undefined): DescribeEndpointTypesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "SupportedEndpointTypes" -> SupportedEndpointTypes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEndpointTypesResponse]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeEndpointsMessage extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var Marker: js.UndefOr[String]
  }

  object DescribeEndpointsMessage {
    def apply(
      Filters: js.UndefOr[FilterList] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeEndpointsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEndpointsMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeEndpointsResponse extends js.Object {
    var Marker: js.UndefOr[String]
    var Endpoints: js.UndefOr[EndpointList]
  }

  object DescribeEndpointsResponse {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      Endpoints: js.UndefOr[EndpointList] = js.undefined): DescribeEndpointsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "Endpoints" -> Endpoints.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEndpointsResponse]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeEventCategoriesMessage extends js.Object {
    var SourceType: js.UndefOr[String]
    var Filters: js.UndefOr[FilterList]
  }

  object DescribeEventCategoriesMessage {
    def apply(
      SourceType: js.UndefOr[String] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined): DescribeEventCategoriesMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SourceType" -> SourceType.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEventCategoriesMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeEventCategoriesResponse extends js.Object {
    var EventCategoryGroupList: js.UndefOr[EventCategoryGroupList]
  }

  object DescribeEventCategoriesResponse {
    def apply(
      EventCategoryGroupList: js.UndefOr[EventCategoryGroupList] = js.undefined): DescribeEventCategoriesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EventCategoryGroupList" -> EventCategoryGroupList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEventCategoriesResponse]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeEventSubscriptionsMessage extends js.Object {
    var SubscriptionName: js.UndefOr[String]
    var Filters: js.UndefOr[FilterList]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var Marker: js.UndefOr[String]
  }

  object DescribeEventSubscriptionsMessage {
    def apply(
      SubscriptionName: js.UndefOr[String] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeEventSubscriptionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SubscriptionName" -> SubscriptionName.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEventSubscriptionsMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeEventSubscriptionsResponse extends js.Object {
    var Marker: js.UndefOr[String]
    var EventSubscriptionsList: js.UndefOr[EventSubscriptionsList]
  }

  object DescribeEventSubscriptionsResponse {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      EventSubscriptionsList: js.UndefOr[EventSubscriptionsList] = js.undefined): DescribeEventSubscriptionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "EventSubscriptionsList" -> EventSubscriptionsList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEventSubscriptionsResponse]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeEventsMessage extends js.Object {
    var Duration: js.UndefOr[IntegerOptional]
    var SourceIdentifier: js.UndefOr[String]
    var StartTime: js.UndefOr[TStamp]
    var EndTime: js.UndefOr[TStamp]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var EventCategories: js.UndefOr[EventCategoriesList]
    var SourceType: js.UndefOr[SourceType]
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
  }

  object DescribeEventsMessage {
    def apply(
      Duration: js.UndefOr[IntegerOptional] = js.undefined,
      SourceIdentifier: js.UndefOr[String] = js.undefined,
      StartTime: js.UndefOr[TStamp] = js.undefined,
      EndTime: js.UndefOr[TStamp] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      EventCategories: js.UndefOr[EventCategoriesList] = js.undefined,
      SourceType: js.UndefOr[SourceType] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeEventsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Duration" -> Duration.map { x => x.asInstanceOf[js.Any] },
        "SourceIdentifier" -> SourceIdentifier.map { x => x.asInstanceOf[js.Any] },
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] },
        "EndTime" -> EndTime.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "EventCategories" -> EventCategories.map { x => x.asInstanceOf[js.Any] },
        "SourceType" -> SourceType.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEventsMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeEventsResponse extends js.Object {
    var Marker: js.UndefOr[String]
    var Events: js.UndefOr[EventList]
  }

  object DescribeEventsResponse {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      Events: js.UndefOr[EventList] = js.undefined): DescribeEventsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "Events" -> Events.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEventsResponse]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeOrderableReplicationInstancesMessage extends js.Object {
    var MaxRecords: js.UndefOr[IntegerOptional]
    var Marker: js.UndefOr[String]
  }

  object DescribeOrderableReplicationInstancesMessage {
    def apply(
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeOrderableReplicationInstancesMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeOrderableReplicationInstancesMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeOrderableReplicationInstancesResponse extends js.Object {
    var OrderableReplicationInstances: js.UndefOr[OrderableReplicationInstanceList]
    var Marker: js.UndefOr[String]
  }

  object DescribeOrderableReplicationInstancesResponse {
    def apply(
      OrderableReplicationInstances: js.UndefOr[OrderableReplicationInstanceList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeOrderableReplicationInstancesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OrderableReplicationInstances" -> OrderableReplicationInstances.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeOrderableReplicationInstancesResponse]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeRefreshSchemasStatusMessage extends js.Object {
    var EndpointArn: js.UndefOr[String]
  }

  object DescribeRefreshSchemasStatusMessage {
    def apply(
      EndpointArn: js.UndefOr[String] = js.undefined): DescribeRefreshSchemasStatusMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndpointArn" -> EndpointArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeRefreshSchemasStatusMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeRefreshSchemasStatusResponse extends js.Object {
    var RefreshSchemasStatus: js.UndefOr[RefreshSchemasStatus]
  }

  object DescribeRefreshSchemasStatusResponse {
    def apply(
      RefreshSchemasStatus: js.UndefOr[RefreshSchemasStatus] = js.undefined): DescribeRefreshSchemasStatusResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RefreshSchemasStatus" -> RefreshSchemasStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeRefreshSchemasStatusResponse]
    }
  }

  @js.native
  trait DescribeReplicationInstanceTaskLogsMessage extends js.Object {
    var ReplicationInstanceArn: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var Marker: js.UndefOr[String]
  }

  object DescribeReplicationInstanceTaskLogsMessage {
    def apply(
      ReplicationInstanceArn: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeReplicationInstanceTaskLogsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReplicationInstanceArn" -> ReplicationInstanceArn.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeReplicationInstanceTaskLogsMessage]
    }
  }

  @js.native
  trait DescribeReplicationInstanceTaskLogsResponse extends js.Object {
    var ReplicationInstanceArn: js.UndefOr[String]
    var ReplicationInstanceTaskLogs: js.UndefOr[ReplicationInstanceTaskLogsList]
    var Marker: js.UndefOr[String]
  }

  object DescribeReplicationInstanceTaskLogsResponse {
    def apply(
      ReplicationInstanceArn: js.UndefOr[String] = js.undefined,
      ReplicationInstanceTaskLogs: js.UndefOr[ReplicationInstanceTaskLogsList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeReplicationInstanceTaskLogsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReplicationInstanceArn" -> ReplicationInstanceArn.map { x => x.asInstanceOf[js.Any] },
        "ReplicationInstanceTaskLogs" -> ReplicationInstanceTaskLogs.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeReplicationInstanceTaskLogsResponse]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeReplicationInstancesMessage extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var Marker: js.UndefOr[String]
  }

  object DescribeReplicationInstancesMessage {
    def apply(
      Filters: js.UndefOr[FilterList] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeReplicationInstancesMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeReplicationInstancesMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeReplicationInstancesResponse extends js.Object {
    var Marker: js.UndefOr[String]
    var ReplicationInstances: js.UndefOr[ReplicationInstanceList]
  }

  object DescribeReplicationInstancesResponse {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      ReplicationInstances: js.UndefOr[ReplicationInstanceList] = js.undefined): DescribeReplicationInstancesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "ReplicationInstances" -> ReplicationInstances.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeReplicationInstancesResponse]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeReplicationSubnetGroupsMessage extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var Marker: js.UndefOr[String]
  }

  object DescribeReplicationSubnetGroupsMessage {
    def apply(
      Filters: js.UndefOr[FilterList] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeReplicationSubnetGroupsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeReplicationSubnetGroupsMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeReplicationSubnetGroupsResponse extends js.Object {
    var Marker: js.UndefOr[String]
    var ReplicationSubnetGroups: js.UndefOr[ReplicationSubnetGroups]
  }

  object DescribeReplicationSubnetGroupsResponse {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      ReplicationSubnetGroups: js.UndefOr[ReplicationSubnetGroups] = js.undefined): DescribeReplicationSubnetGroupsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "ReplicationSubnetGroups" -> ReplicationSubnetGroups.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeReplicationSubnetGroupsResponse]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeReplicationTaskAssessmentResultsMessage extends js.Object {
    var ReplicationTaskArn: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var Marker: js.UndefOr[String]
  }

  object DescribeReplicationTaskAssessmentResultsMessage {
    def apply(
      ReplicationTaskArn: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeReplicationTaskAssessmentResultsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReplicationTaskArn" -> ReplicationTaskArn.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeReplicationTaskAssessmentResultsMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeReplicationTaskAssessmentResultsResponse extends js.Object {
    var Marker: js.UndefOr[String]
    var BucketName: js.UndefOr[String]
    var ReplicationTaskAssessmentResults: js.UndefOr[ReplicationTaskAssessmentResultList]
  }

  object DescribeReplicationTaskAssessmentResultsResponse {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      BucketName: js.UndefOr[String] = js.undefined,
      ReplicationTaskAssessmentResults: js.UndefOr[ReplicationTaskAssessmentResultList] = js.undefined): DescribeReplicationTaskAssessmentResultsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "BucketName" -> BucketName.map { x => x.asInstanceOf[js.Any] },
        "ReplicationTaskAssessmentResults" -> ReplicationTaskAssessmentResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeReplicationTaskAssessmentResultsResponse]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeReplicationTasksMessage extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var Marker: js.UndefOr[String]
  }

  object DescribeReplicationTasksMessage {
    def apply(
      Filters: js.UndefOr[FilterList] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeReplicationTasksMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeReplicationTasksMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeReplicationTasksResponse extends js.Object {
    var Marker: js.UndefOr[String]
    var ReplicationTasks: js.UndefOr[ReplicationTaskList]
  }

  object DescribeReplicationTasksResponse {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      ReplicationTasks: js.UndefOr[ReplicationTaskList] = js.undefined): DescribeReplicationTasksResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "ReplicationTasks" -> ReplicationTasks.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeReplicationTasksResponse]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeSchemasMessage extends js.Object {
    var EndpointArn: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var Marker: js.UndefOr[String]
  }

  object DescribeSchemasMessage {
    def apply(
      EndpointArn: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeSchemasMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndpointArn" -> EndpointArn.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSchemasMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeSchemasResponse extends js.Object {
    var Marker: js.UndefOr[String]
    var Schemas: js.UndefOr[SchemaList]
  }

  object DescribeSchemasResponse {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      Schemas: js.UndefOr[SchemaList] = js.undefined): DescribeSchemasResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "Schemas" -> Schemas.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSchemasResponse]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeTableStatisticsMessage extends js.Object {
    var ReplicationTaskArn: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var Marker: js.UndefOr[String]
    var Filters: js.UndefOr[FilterList]
  }

  object DescribeTableStatisticsMessage {
    def apply(
      ReplicationTaskArn: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined): DescribeTableStatisticsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReplicationTaskArn" -> ReplicationTaskArn.map { x => x.asInstanceOf[js.Any] },
        "MaxRecords" -> MaxRecords.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTableStatisticsMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DescribeTableStatisticsResponse extends js.Object {
    var ReplicationTaskArn: js.UndefOr[String]
    var TableStatistics: js.UndefOr[TableStatisticsList]
    var Marker: js.UndefOr[String]
  }

  object DescribeTableStatisticsResponse {
    def apply(
      ReplicationTaskArn: js.UndefOr[String] = js.undefined,
      TableStatistics: js.UndefOr[TableStatisticsList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined): DescribeTableStatisticsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReplicationTaskArn" -> ReplicationTaskArn.map { x => x.asInstanceOf[js.Any] },
        "TableStatistics" -> TableStatistics.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTableStatisticsResponse]
    }
  }

  object DmsSslModeValueEnum {
    val none = "none"
    val require = "require"
    val `verify-ca` = "verify-ca"
    val `verify-full` = "verify-full"

    val values = IndexedSeq(none, require, `verify-ca`, `verify-full`)
  }

  /**
   * <p> The settings in JSON format for the DMS Transfer type source endpoint. </p>
   */
  @js.native
  trait DmsTransferSettings extends js.Object {
    var ServiceAccessRoleArn: js.UndefOr[String]
    var BucketName: js.UndefOr[String]
  }

  object DmsTransferSettings {
    def apply(
      ServiceAccessRoleArn: js.UndefOr[String] = js.undefined,
      BucketName: js.UndefOr[String] = js.undefined): DmsTransferSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServiceAccessRoleArn" -> ServiceAccessRoleArn.map { x => x.asInstanceOf[js.Any] },
        "BucketName" -> BucketName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DmsTransferSettings]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DynamoDbSettings extends js.Object {
    var ServiceAccessRoleArn: js.UndefOr[String]
  }

  object DynamoDbSettings {
    def apply(
      ServiceAccessRoleArn: js.UndefOr[String] = js.undefined): DynamoDbSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServiceAccessRoleArn" -> ServiceAccessRoleArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DynamoDbSettings]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait ElasticsearchSettings extends js.Object {
    var ServiceAccessRoleArn: js.UndefOr[String]
    var EndpointUri: js.UndefOr[String]
    var FullLoadErrorPercentage: js.UndefOr[IntegerOptional]
    var ErrorRetryDuration: js.UndefOr[IntegerOptional]
  }

  object ElasticsearchSettings {
    def apply(
      ServiceAccessRoleArn: js.UndefOr[String] = js.undefined,
      EndpointUri: js.UndefOr[String] = js.undefined,
      FullLoadErrorPercentage: js.UndefOr[IntegerOptional] = js.undefined,
      ErrorRetryDuration: js.UndefOr[IntegerOptional] = js.undefined): ElasticsearchSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServiceAccessRoleArn" -> ServiceAccessRoleArn.map { x => x.asInstanceOf[js.Any] },
        "EndpointUri" -> EndpointUri.map { x => x.asInstanceOf[js.Any] },
        "FullLoadErrorPercentage" -> FullLoadErrorPercentage.map { x => x.asInstanceOf[js.Any] },
        "ErrorRetryDuration" -> ErrorRetryDuration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ElasticsearchSettings]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait Endpoint extends js.Object {
    var MongoDbSettings: js.UndefOr[MongoDbSettings]
    var Username: js.UndefOr[String]
    var ExternalId: js.UndefOr[String]
    var ExtraConnectionAttributes: js.UndefOr[String]
    var DatabaseName: js.UndefOr[String]
    var DynamoDbSettings: js.UndefOr[DynamoDbSettings]
    var S3Settings: js.UndefOr[S3Settings]
    var ElasticsearchSettings: js.UndefOr[ElasticsearchSettings]
    var EndpointIdentifier: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var KinesisSettings: js.UndefOr[KinesisSettings]
    var CertificateArn: js.UndefOr[String]
    var ServerName: js.UndefOr[String]
    var EndpointArn: js.UndefOr[String]
    var EngineName: js.UndefOr[String]
    var ExternalTableDefinition: js.UndefOr[String]
    var EndpointType: js.UndefOr[ReplicationEndpointTypeValue]
    var Port: js.UndefOr[IntegerOptional]
    var ServiceAccessRoleArn: js.UndefOr[String]
    var EngineDisplayName: js.UndefOr[String]
    var DmsTransferSettings: js.UndefOr[DmsTransferSettings]
    var SslMode: js.UndefOr[DmsSslModeValue]
    var Status: js.UndefOr[String]
  }

  object Endpoint {
    def apply(
      MongoDbSettings: js.UndefOr[MongoDbSettings] = js.undefined,
      Username: js.UndefOr[String] = js.undefined,
      ExternalId: js.UndefOr[String] = js.undefined,
      ExtraConnectionAttributes: js.UndefOr[String] = js.undefined,
      DatabaseName: js.UndefOr[String] = js.undefined,
      DynamoDbSettings: js.UndefOr[DynamoDbSettings] = js.undefined,
      S3Settings: js.UndefOr[S3Settings] = js.undefined,
      ElasticsearchSettings: js.UndefOr[ElasticsearchSettings] = js.undefined,
      EndpointIdentifier: js.UndefOr[String] = js.undefined,
      KmsKeyId: js.UndefOr[String] = js.undefined,
      KinesisSettings: js.UndefOr[KinesisSettings] = js.undefined,
      CertificateArn: js.UndefOr[String] = js.undefined,
      ServerName: js.UndefOr[String] = js.undefined,
      EndpointArn: js.UndefOr[String] = js.undefined,
      EngineName: js.UndefOr[String] = js.undefined,
      ExternalTableDefinition: js.UndefOr[String] = js.undefined,
      EndpointType: js.UndefOr[ReplicationEndpointTypeValue] = js.undefined,
      Port: js.UndefOr[IntegerOptional] = js.undefined,
      ServiceAccessRoleArn: js.UndefOr[String] = js.undefined,
      EngineDisplayName: js.UndefOr[String] = js.undefined,
      DmsTransferSettings: js.UndefOr[DmsTransferSettings] = js.undefined,
      SslMode: js.UndefOr[DmsSslModeValue] = js.undefined,
      Status: js.UndefOr[String] = js.undefined): Endpoint = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MongoDbSettings" -> MongoDbSettings.map { x => x.asInstanceOf[js.Any] },
        "Username" -> Username.map { x => x.asInstanceOf[js.Any] },
        "ExternalId" -> ExternalId.map { x => x.asInstanceOf[js.Any] },
        "ExtraConnectionAttributes" -> ExtraConnectionAttributes.map { x => x.asInstanceOf[js.Any] },
        "DatabaseName" -> DatabaseName.map { x => x.asInstanceOf[js.Any] },
        "DynamoDbSettings" -> DynamoDbSettings.map { x => x.asInstanceOf[js.Any] },
        "S3Settings" -> S3Settings.map { x => x.asInstanceOf[js.Any] },
        "ElasticsearchSettings" -> ElasticsearchSettings.map { x => x.asInstanceOf[js.Any] },
        "EndpointIdentifier" -> EndpointIdentifier.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "KinesisSettings" -> KinesisSettings.map { x => x.asInstanceOf[js.Any] },
        "CertificateArn" -> CertificateArn.map { x => x.asInstanceOf[js.Any] },
        "ServerName" -> ServerName.map { x => x.asInstanceOf[js.Any] },
        "EndpointArn" -> EndpointArn.map { x => x.asInstanceOf[js.Any] },
        "EngineName" -> EngineName.map { x => x.asInstanceOf[js.Any] },
        "ExternalTableDefinition" -> ExternalTableDefinition.map { x => x.asInstanceOf[js.Any] },
        "EndpointType" -> EndpointType.map { x => x.asInstanceOf[js.Any] },
        "Port" -> Port.map { x => x.asInstanceOf[js.Any] },
        "ServiceAccessRoleArn" -> ServiceAccessRoleArn.map { x => x.asInstanceOf[js.Any] },
        "EngineDisplayName" -> EngineDisplayName.map { x => x.asInstanceOf[js.Any] },
        "DmsTransferSettings" -> DmsTransferSettings.map { x => x.asInstanceOf[js.Any] },
        "SslMode" -> SslMode.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Endpoint]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait Event extends js.Object {
    var SourceIdentifier: js.UndefOr[String]
    var EventCategories: js.UndefOr[EventCategoriesList]
    var Message: js.UndefOr[String]
    var SourceType: js.UndefOr[SourceType]
    var Date: js.UndefOr[TStamp]
  }

  object Event {
    def apply(
      SourceIdentifier: js.UndefOr[String] = js.undefined,
      EventCategories: js.UndefOr[EventCategoriesList] = js.undefined,
      Message: js.UndefOr[String] = js.undefined,
      SourceType: js.UndefOr[SourceType] = js.undefined,
      Date: js.UndefOr[TStamp] = js.undefined): Event = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SourceIdentifier" -> SourceIdentifier.map { x => x.asInstanceOf[js.Any] },
        "EventCategories" -> EventCategories.map { x => x.asInstanceOf[js.Any] },
        "Message" -> Message.map { x => x.asInstanceOf[js.Any] },
        "SourceType" -> SourceType.map { x => x.asInstanceOf[js.Any] },
        "Date" -> Date.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Event]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait EventCategoryGroup extends js.Object {
    var SourceType: js.UndefOr[String]
    var EventCategories: js.UndefOr[EventCategoriesList]
  }

  object EventCategoryGroup {
    def apply(
      SourceType: js.UndefOr[String] = js.undefined,
      EventCategories: js.UndefOr[EventCategoriesList] = js.undefined): EventCategoryGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SourceType" -> SourceType.map { x => x.asInstanceOf[js.Any] },
        "EventCategories" -> EventCategories.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventCategoryGroup]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait EventSubscription extends js.Object {
    var CustomerAwsId: js.UndefOr[String]
    var Enabled: js.UndefOr[Boolean]
    var CustSubscriptionId: js.UndefOr[String]
    var SnsTopicArn: js.UndefOr[String]
    var SourceType: js.UndefOr[String]
    var EventCategoriesList: js.UndefOr[EventCategoriesList]
    var SourceIdsList: js.UndefOr[SourceIdsList]
    var SubscriptionCreationTime: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  object EventSubscription {
    def apply(
      CustomerAwsId: js.UndefOr[String] = js.undefined,
      Enabled: js.UndefOr[Boolean] = js.undefined,
      CustSubscriptionId: js.UndefOr[String] = js.undefined,
      SnsTopicArn: js.UndefOr[String] = js.undefined,
      SourceType: js.UndefOr[String] = js.undefined,
      EventCategoriesList: js.UndefOr[EventCategoriesList] = js.undefined,
      SourceIdsList: js.UndefOr[SourceIdsList] = js.undefined,
      SubscriptionCreationTime: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[String] = js.undefined): EventSubscription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CustomerAwsId" -> CustomerAwsId.map { x => x.asInstanceOf[js.Any] },
        "Enabled" -> Enabled.map { x => x.asInstanceOf[js.Any] },
        "CustSubscriptionId" -> CustSubscriptionId.map { x => x.asInstanceOf[js.Any] },
        "SnsTopicArn" -> SnsTopicArn.map { x => x.asInstanceOf[js.Any] },
        "SourceType" -> SourceType.map { x => x.asInstanceOf[js.Any] },
        "EventCategoriesList" -> EventCategoriesList.map { x => x.asInstanceOf[js.Any] },
        "SourceIdsList" -> SourceIdsList.map { x => x.asInstanceOf[js.Any] },
        "SubscriptionCreationTime" -> SubscriptionCreationTime.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventSubscription]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait Filter extends js.Object {
    var Name: js.UndefOr[String]
    var Values: js.UndefOr[FilterValueList]
  }

  object Filter {
    def apply(
      Name: js.UndefOr[String] = js.undefined,
      Values: js.UndefOr[FilterValueList] = js.undefined): Filter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Values" -> Values.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Filter]
    }
  }

  @js.native
  trait ImportCertificateMessage extends js.Object {
    var CertificateIdentifier: js.UndefOr[String]
    var CertificatePem: js.UndefOr[String]
    var CertificateWallet: js.UndefOr[CertificateWallet]
    var Tags: js.UndefOr[TagList]
  }

  object ImportCertificateMessage {
    def apply(
      CertificateIdentifier: js.UndefOr[String] = js.undefined,
      CertificatePem: js.UndefOr[String] = js.undefined,
      CertificateWallet: js.UndefOr[CertificateWallet] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): ImportCertificateMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CertificateIdentifier" -> CertificateIdentifier.map { x => x.asInstanceOf[js.Any] },
        "CertificatePem" -> CertificatePem.map { x => x.asInstanceOf[js.Any] },
        "CertificateWallet" -> CertificateWallet.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportCertificateMessage]
    }
  }

  @js.native
  trait ImportCertificateResponse extends js.Object {
    var Certificate: js.UndefOr[Certificate]
  }

  object ImportCertificateResponse {
    def apply(
      Certificate: js.UndefOr[Certificate] = js.undefined): ImportCertificateResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Certificate" -> Certificate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportCertificateResponse]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait KinesisSettings extends js.Object {
    var StreamArn: js.UndefOr[String]
    var MessageFormat: js.UndefOr[MessageFormatValue]
    var ServiceAccessRoleArn: js.UndefOr[String]
  }

  object KinesisSettings {
    def apply(
      StreamArn: js.UndefOr[String] = js.undefined,
      MessageFormat: js.UndefOr[MessageFormatValue] = js.undefined,
      ServiceAccessRoleArn: js.UndefOr[String] = js.undefined): KinesisSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StreamArn" -> StreamArn.map { x => x.asInstanceOf[js.Any] },
        "MessageFormat" -> MessageFormat.map { x => x.asInstanceOf[js.Any] },
        "ServiceAccessRoleArn" -> ServiceAccessRoleArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KinesisSettings]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait ListTagsForResourceMessage extends js.Object {
    var ResourceArn: js.UndefOr[String]
  }

  object ListTagsForResourceMessage {
    def apply(
      ResourceArn: js.UndefOr[String] = js.undefined): ListTagsForResourceMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var TagList: js.UndefOr[TagList]
  }

  object ListTagsForResourceResponse {
    def apply(
      TagList: js.UndefOr[TagList] = js.undefined): ListTagsForResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TagList" -> TagList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceResponse]
    }
  }

  object MessageFormatValueEnum {
    val json = "json"

    val values = IndexedSeq(json)
  }

  object MigrationTypeValueEnum {
    val `full-load` = "full-load"
    val cdc = "cdc"
    val `full-load-and-cdc` = "full-load-and-cdc"

    val values = IndexedSeq(`full-load`, cdc, `full-load-and-cdc`)
  }

  /**
   * <p/>
   */
  @js.native
  trait ModifyEndpointMessage extends js.Object {
    var MongoDbSettings: js.UndefOr[MongoDbSettings]
    var Username: js.UndefOr[String]
    var ExtraConnectionAttributes: js.UndefOr[String]
    var DatabaseName: js.UndefOr[String]
    var DynamoDbSettings: js.UndefOr[DynamoDbSettings]
    var S3Settings: js.UndefOr[S3Settings]
    var ElasticsearchSettings: js.UndefOr[ElasticsearchSettings]
    var EndpointIdentifier: js.UndefOr[String]
    var KinesisSettings: js.UndefOr[KinesisSettings]
    var CertificateArn: js.UndefOr[String]
    var ServerName: js.UndefOr[String]
    var Password: js.UndefOr[SecretString]
    var EndpointArn: js.UndefOr[String]
    var EngineName: js.UndefOr[String]
    var ExternalTableDefinition: js.UndefOr[String]
    var EndpointType: js.UndefOr[ReplicationEndpointTypeValue]
    var Port: js.UndefOr[IntegerOptional]
    var ServiceAccessRoleArn: js.UndefOr[String]
    var DmsTransferSettings: js.UndefOr[DmsTransferSettings]
    var SslMode: js.UndefOr[DmsSslModeValue]
  }

  object ModifyEndpointMessage {
    def apply(
      MongoDbSettings: js.UndefOr[MongoDbSettings] = js.undefined,
      Username: js.UndefOr[String] = js.undefined,
      ExtraConnectionAttributes: js.UndefOr[String] = js.undefined,
      DatabaseName: js.UndefOr[String] = js.undefined,
      DynamoDbSettings: js.UndefOr[DynamoDbSettings] = js.undefined,
      S3Settings: js.UndefOr[S3Settings] = js.undefined,
      ElasticsearchSettings: js.UndefOr[ElasticsearchSettings] = js.undefined,
      EndpointIdentifier: js.UndefOr[String] = js.undefined,
      KinesisSettings: js.UndefOr[KinesisSettings] = js.undefined,
      CertificateArn: js.UndefOr[String] = js.undefined,
      ServerName: js.UndefOr[String] = js.undefined,
      Password: js.UndefOr[SecretString] = js.undefined,
      EndpointArn: js.UndefOr[String] = js.undefined,
      EngineName: js.UndefOr[String] = js.undefined,
      ExternalTableDefinition: js.UndefOr[String] = js.undefined,
      EndpointType: js.UndefOr[ReplicationEndpointTypeValue] = js.undefined,
      Port: js.UndefOr[IntegerOptional] = js.undefined,
      ServiceAccessRoleArn: js.UndefOr[String] = js.undefined,
      DmsTransferSettings: js.UndefOr[DmsTransferSettings] = js.undefined,
      SslMode: js.UndefOr[DmsSslModeValue] = js.undefined): ModifyEndpointMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MongoDbSettings" -> MongoDbSettings.map { x => x.asInstanceOf[js.Any] },
        "Username" -> Username.map { x => x.asInstanceOf[js.Any] },
        "ExtraConnectionAttributes" -> ExtraConnectionAttributes.map { x => x.asInstanceOf[js.Any] },
        "DatabaseName" -> DatabaseName.map { x => x.asInstanceOf[js.Any] },
        "DynamoDbSettings" -> DynamoDbSettings.map { x => x.asInstanceOf[js.Any] },
        "S3Settings" -> S3Settings.map { x => x.asInstanceOf[js.Any] },
        "ElasticsearchSettings" -> ElasticsearchSettings.map { x => x.asInstanceOf[js.Any] },
        "EndpointIdentifier" -> EndpointIdentifier.map { x => x.asInstanceOf[js.Any] },
        "KinesisSettings" -> KinesisSettings.map { x => x.asInstanceOf[js.Any] },
        "CertificateArn" -> CertificateArn.map { x => x.asInstanceOf[js.Any] },
        "ServerName" -> ServerName.map { x => x.asInstanceOf[js.Any] },
        "Password" -> Password.map { x => x.asInstanceOf[js.Any] },
        "EndpointArn" -> EndpointArn.map { x => x.asInstanceOf[js.Any] },
        "EngineName" -> EngineName.map { x => x.asInstanceOf[js.Any] },
        "ExternalTableDefinition" -> ExternalTableDefinition.map { x => x.asInstanceOf[js.Any] },
        "EndpointType" -> EndpointType.map { x => x.asInstanceOf[js.Any] },
        "Port" -> Port.map { x => x.asInstanceOf[js.Any] },
        "ServiceAccessRoleArn" -> ServiceAccessRoleArn.map { x => x.asInstanceOf[js.Any] },
        "DmsTransferSettings" -> DmsTransferSettings.map { x => x.asInstanceOf[js.Any] },
        "SslMode" -> SslMode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyEndpointMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait ModifyEndpointResponse extends js.Object {
    var Endpoint: js.UndefOr[Endpoint]
  }

  object ModifyEndpointResponse {
    def apply(
      Endpoint: js.UndefOr[Endpoint] = js.undefined): ModifyEndpointResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Endpoint" -> Endpoint.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyEndpointResponse]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait ModifyEventSubscriptionMessage extends js.Object {
    var Enabled: js.UndefOr[BooleanOptional]
    var SubscriptionName: js.UndefOr[String]
    var SnsTopicArn: js.UndefOr[String]
    var EventCategories: js.UndefOr[EventCategoriesList]
    var SourceType: js.UndefOr[String]
  }

  object ModifyEventSubscriptionMessage {
    def apply(
      Enabled: js.UndefOr[BooleanOptional] = js.undefined,
      SubscriptionName: js.UndefOr[String] = js.undefined,
      SnsTopicArn: js.UndefOr[String] = js.undefined,
      EventCategories: js.UndefOr[EventCategoriesList] = js.undefined,
      SourceType: js.UndefOr[String] = js.undefined): ModifyEventSubscriptionMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Enabled" -> Enabled.map { x => x.asInstanceOf[js.Any] },
        "SubscriptionName" -> SubscriptionName.map { x => x.asInstanceOf[js.Any] },
        "SnsTopicArn" -> SnsTopicArn.map { x => x.asInstanceOf[js.Any] },
        "EventCategories" -> EventCategories.map { x => x.asInstanceOf[js.Any] },
        "SourceType" -> SourceType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyEventSubscriptionMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait ModifyEventSubscriptionResponse extends js.Object {
    var EventSubscription: js.UndefOr[EventSubscription]
  }

  object ModifyEventSubscriptionResponse {
    def apply(
      EventSubscription: js.UndefOr[EventSubscription] = js.undefined): ModifyEventSubscriptionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EventSubscription" -> EventSubscription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyEventSubscriptionResponse]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait ModifyReplicationInstanceMessage extends js.Object {
    var PreferredMaintenanceWindow: js.UndefOr[String]
    var AllowMajorVersionUpgrade: js.UndefOr[Boolean]
    var MultiAZ: js.UndefOr[BooleanOptional]
    var AllocatedStorage: js.UndefOr[IntegerOptional]
    var ReplicationInstanceIdentifier: js.UndefOr[String]
    var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional]
    var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList]
    var EngineVersion: js.UndefOr[String]
    var ApplyImmediately: js.UndefOr[Boolean]
    var ReplicationInstanceArn: js.UndefOr[String]
    var ReplicationInstanceClass: js.UndefOr[String]
  }

  object ModifyReplicationInstanceMessage {
    def apply(
      PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
      AllowMajorVersionUpgrade: js.UndefOr[Boolean] = js.undefined,
      MultiAZ: js.UndefOr[BooleanOptional] = js.undefined,
      AllocatedStorage: js.UndefOr[IntegerOptional] = js.undefined,
      ReplicationInstanceIdentifier: js.UndefOr[String] = js.undefined,
      AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined,
      VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined,
      EngineVersion: js.UndefOr[String] = js.undefined,
      ApplyImmediately: js.UndefOr[Boolean] = js.undefined,
      ReplicationInstanceArn: js.UndefOr[String] = js.undefined,
      ReplicationInstanceClass: js.UndefOr[String] = js.undefined): ModifyReplicationInstanceMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PreferredMaintenanceWindow" -> PreferredMaintenanceWindow.map { x => x.asInstanceOf[js.Any] },
        "AllowMajorVersionUpgrade" -> AllowMajorVersionUpgrade.map { x => x.asInstanceOf[js.Any] },
        "MultiAZ" -> MultiAZ.map { x => x.asInstanceOf[js.Any] },
        "AllocatedStorage" -> AllocatedStorage.map { x => x.asInstanceOf[js.Any] },
        "ReplicationInstanceIdentifier" -> ReplicationInstanceIdentifier.map { x => x.asInstanceOf[js.Any] },
        "AutoMinorVersionUpgrade" -> AutoMinorVersionUpgrade.map { x => x.asInstanceOf[js.Any] },
        "VpcSecurityGroupIds" -> VpcSecurityGroupIds.map { x => x.asInstanceOf[js.Any] },
        "EngineVersion" -> EngineVersion.map { x => x.asInstanceOf[js.Any] },
        "ApplyImmediately" -> ApplyImmediately.map { x => x.asInstanceOf[js.Any] },
        "ReplicationInstanceArn" -> ReplicationInstanceArn.map { x => x.asInstanceOf[js.Any] },
        "ReplicationInstanceClass" -> ReplicationInstanceClass.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyReplicationInstanceMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait ModifyReplicationInstanceResponse extends js.Object {
    var ReplicationInstance: js.UndefOr[ReplicationInstance]
  }

  object ModifyReplicationInstanceResponse {
    def apply(
      ReplicationInstance: js.UndefOr[ReplicationInstance] = js.undefined): ModifyReplicationInstanceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReplicationInstance" -> ReplicationInstance.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyReplicationInstanceResponse]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait ModifyReplicationSubnetGroupMessage extends js.Object {
    var ReplicationSubnetGroupIdentifier: js.UndefOr[String]
    var ReplicationSubnetGroupDescription: js.UndefOr[String]
    var SubnetIds: js.UndefOr[SubnetIdentifierList]
  }

  object ModifyReplicationSubnetGroupMessage {
    def apply(
      ReplicationSubnetGroupIdentifier: js.UndefOr[String] = js.undefined,
      ReplicationSubnetGroupDescription: js.UndefOr[String] = js.undefined,
      SubnetIds: js.UndefOr[SubnetIdentifierList] = js.undefined): ModifyReplicationSubnetGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReplicationSubnetGroupIdentifier" -> ReplicationSubnetGroupIdentifier.map { x => x.asInstanceOf[js.Any] },
        "ReplicationSubnetGroupDescription" -> ReplicationSubnetGroupDescription.map { x => x.asInstanceOf[js.Any] },
        "SubnetIds" -> SubnetIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyReplicationSubnetGroupMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait ModifyReplicationSubnetGroupResponse extends js.Object {
    var ReplicationSubnetGroup: js.UndefOr[ReplicationSubnetGroup]
  }

  object ModifyReplicationSubnetGroupResponse {
    def apply(
      ReplicationSubnetGroup: js.UndefOr[ReplicationSubnetGroup] = js.undefined): ModifyReplicationSubnetGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReplicationSubnetGroup" -> ReplicationSubnetGroup.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyReplicationSubnetGroupResponse]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait ModifyReplicationTaskMessage extends js.Object {
    var ReplicationTaskSettings: js.UndefOr[String]
    var CdcStopPosition: js.UndefOr[String]
    var MigrationType: js.UndefOr[MigrationTypeValue]
    var ReplicationTaskIdentifier: js.UndefOr[String]
    var CdcStartPosition: js.UndefOr[String]
    var TableMappings: js.UndefOr[String]
    var ReplicationTaskArn: js.UndefOr[String]
    var CdcStartTime: js.UndefOr[TStamp]
  }

  object ModifyReplicationTaskMessage {
    def apply(
      ReplicationTaskSettings: js.UndefOr[String] = js.undefined,
      CdcStopPosition: js.UndefOr[String] = js.undefined,
      MigrationType: js.UndefOr[MigrationTypeValue] = js.undefined,
      ReplicationTaskIdentifier: js.UndefOr[String] = js.undefined,
      CdcStartPosition: js.UndefOr[String] = js.undefined,
      TableMappings: js.UndefOr[String] = js.undefined,
      ReplicationTaskArn: js.UndefOr[String] = js.undefined,
      CdcStartTime: js.UndefOr[TStamp] = js.undefined): ModifyReplicationTaskMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReplicationTaskSettings" -> ReplicationTaskSettings.map { x => x.asInstanceOf[js.Any] },
        "CdcStopPosition" -> CdcStopPosition.map { x => x.asInstanceOf[js.Any] },
        "MigrationType" -> MigrationType.map { x => x.asInstanceOf[js.Any] },
        "ReplicationTaskIdentifier" -> ReplicationTaskIdentifier.map { x => x.asInstanceOf[js.Any] },
        "CdcStartPosition" -> CdcStartPosition.map { x => x.asInstanceOf[js.Any] },
        "TableMappings" -> TableMappings.map { x => x.asInstanceOf[js.Any] },
        "ReplicationTaskArn" -> ReplicationTaskArn.map { x => x.asInstanceOf[js.Any] },
        "CdcStartTime" -> CdcStartTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyReplicationTaskMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait ModifyReplicationTaskResponse extends js.Object {
    var ReplicationTask: js.UndefOr[ReplicationTask]
  }

  object ModifyReplicationTaskResponse {
    def apply(
      ReplicationTask: js.UndefOr[ReplicationTask] = js.undefined): ModifyReplicationTaskResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReplicationTask" -> ReplicationTask.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyReplicationTaskResponse]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait MongoDbSettings extends js.Object {
    var Username: js.UndefOr[String]
    var DatabaseName: js.UndefOr[String]
    var DocsToInvestigate: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var AuthType: js.UndefOr[AuthTypeValue]
    var ServerName: js.UndefOr[String]
    var Password: js.UndefOr[SecretString]
    var NestingLevel: js.UndefOr[NestingLevelValue]
    var AuthMechanism: js.UndefOr[AuthMechanismValue]
    var Port: js.UndefOr[IntegerOptional]
    var ExtractDocId: js.UndefOr[String]
    var AuthSource: js.UndefOr[String]
  }

  object MongoDbSettings {
    def apply(
      Username: js.UndefOr[String] = js.undefined,
      DatabaseName: js.UndefOr[String] = js.undefined,
      DocsToInvestigate: js.UndefOr[String] = js.undefined,
      KmsKeyId: js.UndefOr[String] = js.undefined,
      AuthType: js.UndefOr[AuthTypeValue] = js.undefined,
      ServerName: js.UndefOr[String] = js.undefined,
      Password: js.UndefOr[SecretString] = js.undefined,
      NestingLevel: js.UndefOr[NestingLevelValue] = js.undefined,
      AuthMechanism: js.UndefOr[AuthMechanismValue] = js.undefined,
      Port: js.UndefOr[IntegerOptional] = js.undefined,
      ExtractDocId: js.UndefOr[String] = js.undefined,
      AuthSource: js.UndefOr[String] = js.undefined): MongoDbSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Username" -> Username.map { x => x.asInstanceOf[js.Any] },
        "DatabaseName" -> DatabaseName.map { x => x.asInstanceOf[js.Any] },
        "DocsToInvestigate" -> DocsToInvestigate.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "AuthType" -> AuthType.map { x => x.asInstanceOf[js.Any] },
        "ServerName" -> ServerName.map { x => x.asInstanceOf[js.Any] },
        "Password" -> Password.map { x => x.asInstanceOf[js.Any] },
        "NestingLevel" -> NestingLevel.map { x => x.asInstanceOf[js.Any] },
        "AuthMechanism" -> AuthMechanism.map { x => x.asInstanceOf[js.Any] },
        "Port" -> Port.map { x => x.asInstanceOf[js.Any] },
        "ExtractDocId" -> ExtractDocId.map { x => x.asInstanceOf[js.Any] },
        "AuthSource" -> AuthSource.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MongoDbSettings]
    }
  }

  object NestingLevelValueEnum {
    val none = "none"
    val one = "one"

    val values = IndexedSeq(none, one)
  }

  /**
   * <p/>
   */
  @js.native
  trait OrderableReplicationInstance extends js.Object {
    var DefaultAllocatedStorage: js.UndefOr[Int]
    var MinAllocatedStorage: js.UndefOr[Int]
    var EngineVersion: js.UndefOr[String]
    var IncludedAllocatedStorage: js.UndefOr[Int]
    var MaxAllocatedStorage: js.UndefOr[Int]
    var StorageType: js.UndefOr[String]
    var ReplicationInstanceClass: js.UndefOr[String]
  }

  object OrderableReplicationInstance {
    def apply(
      DefaultAllocatedStorage: js.UndefOr[Int] = js.undefined,
      MinAllocatedStorage: js.UndefOr[Int] = js.undefined,
      EngineVersion: js.UndefOr[String] = js.undefined,
      IncludedAllocatedStorage: js.UndefOr[Int] = js.undefined,
      MaxAllocatedStorage: js.UndefOr[Int] = js.undefined,
      StorageType: js.UndefOr[String] = js.undefined,
      ReplicationInstanceClass: js.UndefOr[String] = js.undefined): OrderableReplicationInstance = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DefaultAllocatedStorage" -> DefaultAllocatedStorage.map { x => x.asInstanceOf[js.Any] },
        "MinAllocatedStorage" -> MinAllocatedStorage.map { x => x.asInstanceOf[js.Any] },
        "EngineVersion" -> EngineVersion.map { x => x.asInstanceOf[js.Any] },
        "IncludedAllocatedStorage" -> IncludedAllocatedStorage.map { x => x.asInstanceOf[js.Any] },
        "MaxAllocatedStorage" -> MaxAllocatedStorage.map { x => x.asInstanceOf[js.Any] },
        "StorageType" -> StorageType.map { x => x.asInstanceOf[js.Any] },
        "ReplicationInstanceClass" -> ReplicationInstanceClass.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OrderableReplicationInstance]
    }
  }

  @js.native
  trait RebootReplicationInstanceMessage extends js.Object {
    var ReplicationInstanceArn: js.UndefOr[String]
    var ForceFailover: js.UndefOr[BooleanOptional]
  }

  object RebootReplicationInstanceMessage {
    def apply(
      ReplicationInstanceArn: js.UndefOr[String] = js.undefined,
      ForceFailover: js.UndefOr[BooleanOptional] = js.undefined): RebootReplicationInstanceMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReplicationInstanceArn" -> ReplicationInstanceArn.map { x => x.asInstanceOf[js.Any] },
        "ForceFailover" -> ForceFailover.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RebootReplicationInstanceMessage]
    }
  }

  @js.native
  trait RebootReplicationInstanceResponse extends js.Object {
    var ReplicationInstance: js.UndefOr[ReplicationInstance]
  }

  object RebootReplicationInstanceResponse {
    def apply(
      ReplicationInstance: js.UndefOr[ReplicationInstance] = js.undefined): RebootReplicationInstanceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReplicationInstance" -> ReplicationInstance.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RebootReplicationInstanceResponse]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait RefreshSchemasMessage extends js.Object {
    var EndpointArn: js.UndefOr[String]
    var ReplicationInstanceArn: js.UndefOr[String]
  }

  object RefreshSchemasMessage {
    def apply(
      EndpointArn: js.UndefOr[String] = js.undefined,
      ReplicationInstanceArn: js.UndefOr[String] = js.undefined): RefreshSchemasMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndpointArn" -> EndpointArn.map { x => x.asInstanceOf[js.Any] },
        "ReplicationInstanceArn" -> ReplicationInstanceArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RefreshSchemasMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait RefreshSchemasResponse extends js.Object {
    var RefreshSchemasStatus: js.UndefOr[RefreshSchemasStatus]
  }

  object RefreshSchemasResponse {
    def apply(
      RefreshSchemasStatus: js.UndefOr[RefreshSchemasStatus] = js.undefined): RefreshSchemasResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RefreshSchemasStatus" -> RefreshSchemasStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RefreshSchemasResponse]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait RefreshSchemasStatus extends js.Object {
    var LastFailureMessage: js.UndefOr[String]
    var EndpointArn: js.UndefOr[String]
    var ReplicationInstanceArn: js.UndefOr[String]
    var LastRefreshDate: js.UndefOr[TStamp]
    var Status: js.UndefOr[RefreshSchemasStatusTypeValue]
  }

  object RefreshSchemasStatus {
    def apply(
      LastFailureMessage: js.UndefOr[String] = js.undefined,
      EndpointArn: js.UndefOr[String] = js.undefined,
      ReplicationInstanceArn: js.UndefOr[String] = js.undefined,
      LastRefreshDate: js.UndefOr[TStamp] = js.undefined,
      Status: js.UndefOr[RefreshSchemasStatusTypeValue] = js.undefined): RefreshSchemasStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LastFailureMessage" -> LastFailureMessage.map { x => x.asInstanceOf[js.Any] },
        "EndpointArn" -> EndpointArn.map { x => x.asInstanceOf[js.Any] },
        "ReplicationInstanceArn" -> ReplicationInstanceArn.map { x => x.asInstanceOf[js.Any] },
        "LastRefreshDate" -> LastRefreshDate.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RefreshSchemasStatus]
    }
  }

  object RefreshSchemasStatusTypeValueEnum {
    val successful = "successful"
    val failed = "failed"
    val refreshing = "refreshing"

    val values = IndexedSeq(successful, failed, refreshing)
  }

  object ReloadOptionValueEnum {
    val `data-reload` = "data-reload"
    val `validate-only` = "validate-only"

    val values = IndexedSeq(`data-reload`, `validate-only`)
  }

  @js.native
  trait ReloadTablesMessage extends js.Object {
    var ReplicationTaskArn: js.UndefOr[String]
    var TablesToReload: js.UndefOr[TableListToReload]
    var ReloadOption: js.UndefOr[ReloadOptionValue]
  }

  object ReloadTablesMessage {
    def apply(
      ReplicationTaskArn: js.UndefOr[String] = js.undefined,
      TablesToReload: js.UndefOr[TableListToReload] = js.undefined,
      ReloadOption: js.UndefOr[ReloadOptionValue] = js.undefined): ReloadTablesMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReplicationTaskArn" -> ReplicationTaskArn.map { x => x.asInstanceOf[js.Any] },
        "TablesToReload" -> TablesToReload.map { x => x.asInstanceOf[js.Any] },
        "ReloadOption" -> ReloadOption.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReloadTablesMessage]
    }
  }

  @js.native
  trait ReloadTablesResponse extends js.Object {
    var ReplicationTaskArn: js.UndefOr[String]
  }

  object ReloadTablesResponse {
    def apply(
      ReplicationTaskArn: js.UndefOr[String] = js.undefined): ReloadTablesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReplicationTaskArn" -> ReplicationTaskArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReloadTablesResponse]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait RemoveTagsFromResourceMessage extends js.Object {
    var ResourceArn: js.UndefOr[String]
    var TagKeys: js.UndefOr[KeyList]
  }

  object RemoveTagsFromResourceMessage {
    def apply(
      ResourceArn: js.UndefOr[String] = js.undefined,
      TagKeys: js.UndefOr[KeyList] = js.undefined): RemoveTagsFromResourceMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.map { x => x.asInstanceOf[js.Any] },
        "TagKeys" -> TagKeys.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveTagsFromResourceMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait RemoveTagsFromResourceResponse extends js.Object {

  }

  object RemoveTagsFromResourceResponse {
    def apply(): RemoveTagsFromResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveTagsFromResourceResponse]
    }
  }

  object ReplicationEndpointTypeValueEnum {
    val source = "source"
    val target = "target"

    val values = IndexedSeq(source, target)
  }

  /**
   * <p/>
   */
  @js.native
  trait ReplicationInstance extends js.Object {
    var PreferredMaintenanceWindow: js.UndefOr[String]
    var ReplicationInstanceStatus: js.UndefOr[String]
    var MultiAZ: js.UndefOr[Boolean]
    var KmsKeyId: js.UndefOr[String]
    var AllocatedStorage: js.UndefOr[Int]
    var PendingModifiedValues: js.UndefOr[ReplicationPendingModifiedValues]
    var ReplicationInstancePublicIpAddress: js.UndefOr[String]
    var ReplicationInstanceIdentifier: js.UndefOr[String]
    var FreeUntil: js.UndefOr[TStamp]
    var AvailabilityZone: js.UndefOr[String]
    var VpcSecurityGroups: js.UndefOr[VpcSecurityGroupMembershipList]
    var AutoMinorVersionUpgrade: js.UndefOr[Boolean]
    var EngineVersion: js.UndefOr[String]
    var InstanceCreateTime: js.UndefOr[TStamp]
    var ReplicationInstancePublicIpAddresses: js.UndefOr[ReplicationInstancePublicIpAddressList]
    var ReplicationInstancePrivateIpAddresses: js.UndefOr[ReplicationInstancePrivateIpAddressList]
    var ReplicationSubnetGroup: js.UndefOr[ReplicationSubnetGroup]
    var ReplicationInstancePrivateIpAddress: js.UndefOr[String]
    var PubliclyAccessible: js.UndefOr[Boolean]
    var SecondaryAvailabilityZone: js.UndefOr[String]
    var DnsNameServers: js.UndefOr[String]
    var ReplicationInstanceArn: js.UndefOr[String]
    var ReplicationInstanceClass: js.UndefOr[String]
  }

  object ReplicationInstance {
    def apply(
      PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
      ReplicationInstanceStatus: js.UndefOr[String] = js.undefined,
      MultiAZ: js.UndefOr[Boolean] = js.undefined,
      KmsKeyId: js.UndefOr[String] = js.undefined,
      AllocatedStorage: js.UndefOr[Int] = js.undefined,
      PendingModifiedValues: js.UndefOr[ReplicationPendingModifiedValues] = js.undefined,
      ReplicationInstancePublicIpAddress: js.UndefOr[String] = js.undefined,
      ReplicationInstanceIdentifier: js.UndefOr[String] = js.undefined,
      FreeUntil: js.UndefOr[TStamp] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      VpcSecurityGroups: js.UndefOr[VpcSecurityGroupMembershipList] = js.undefined,
      AutoMinorVersionUpgrade: js.UndefOr[Boolean] = js.undefined,
      EngineVersion: js.UndefOr[String] = js.undefined,
      InstanceCreateTime: js.UndefOr[TStamp] = js.undefined,
      ReplicationInstancePublicIpAddresses: js.UndefOr[ReplicationInstancePublicIpAddressList] = js.undefined,
      ReplicationInstancePrivateIpAddresses: js.UndefOr[ReplicationInstancePrivateIpAddressList] = js.undefined,
      ReplicationSubnetGroup: js.UndefOr[ReplicationSubnetGroup] = js.undefined,
      ReplicationInstancePrivateIpAddress: js.UndefOr[String] = js.undefined,
      PubliclyAccessible: js.UndefOr[Boolean] = js.undefined,
      SecondaryAvailabilityZone: js.UndefOr[String] = js.undefined,
      DnsNameServers: js.UndefOr[String] = js.undefined,
      ReplicationInstanceArn: js.UndefOr[String] = js.undefined,
      ReplicationInstanceClass: js.UndefOr[String] = js.undefined): ReplicationInstance = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PreferredMaintenanceWindow" -> PreferredMaintenanceWindow.map { x => x.asInstanceOf[js.Any] },
        "ReplicationInstanceStatus" -> ReplicationInstanceStatus.map { x => x.asInstanceOf[js.Any] },
        "MultiAZ" -> MultiAZ.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "AllocatedStorage" -> AllocatedStorage.map { x => x.asInstanceOf[js.Any] },
        "PendingModifiedValues" -> PendingModifiedValues.map { x => x.asInstanceOf[js.Any] },
        "ReplicationInstancePublicIpAddress" -> ReplicationInstancePublicIpAddress.map { x => x.asInstanceOf[js.Any] },
        "ReplicationInstanceIdentifier" -> ReplicationInstanceIdentifier.map { x => x.asInstanceOf[js.Any] },
        "FreeUntil" -> FreeUntil.map { x => x.asInstanceOf[js.Any] },
        "AvailabilityZone" -> AvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "VpcSecurityGroups" -> VpcSecurityGroups.map { x => x.asInstanceOf[js.Any] },
        "AutoMinorVersionUpgrade" -> AutoMinorVersionUpgrade.map { x => x.asInstanceOf[js.Any] },
        "EngineVersion" -> EngineVersion.map { x => x.asInstanceOf[js.Any] },
        "InstanceCreateTime" -> InstanceCreateTime.map { x => x.asInstanceOf[js.Any] },
        "ReplicationInstancePublicIpAddresses" -> ReplicationInstancePublicIpAddresses.map { x => x.asInstanceOf[js.Any] },
        "ReplicationInstancePrivateIpAddresses" -> ReplicationInstancePrivateIpAddresses.map { x => x.asInstanceOf[js.Any] },
        "ReplicationSubnetGroup" -> ReplicationSubnetGroup.map { x => x.asInstanceOf[js.Any] },
        "ReplicationInstancePrivateIpAddress" -> ReplicationInstancePrivateIpAddress.map { x => x.asInstanceOf[js.Any] },
        "PubliclyAccessible" -> PubliclyAccessible.map { x => x.asInstanceOf[js.Any] },
        "SecondaryAvailabilityZone" -> SecondaryAvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "DnsNameServers" -> DnsNameServers.map { x => x.asInstanceOf[js.Any] },
        "ReplicationInstanceArn" -> ReplicationInstanceArn.map { x => x.asInstanceOf[js.Any] },
        "ReplicationInstanceClass" -> ReplicationInstanceClass.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReplicationInstance]
    }
  }

  /**
   * <p>Contains metadata for a replication instance task log.</p>
   */
  @js.native
  trait ReplicationInstanceTaskLog extends js.Object {
    var ReplicationTaskName: js.UndefOr[String]
    var ReplicationTaskArn: js.UndefOr[String]
    var ReplicationInstanceTaskLogSize: js.UndefOr[Double]
  }

  object ReplicationInstanceTaskLog {
    def apply(
      ReplicationTaskName: js.UndefOr[String] = js.undefined,
      ReplicationTaskArn: js.UndefOr[String] = js.undefined,
      ReplicationInstanceTaskLogSize: js.UndefOr[Double] = js.undefined): ReplicationInstanceTaskLog = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReplicationTaskName" -> ReplicationTaskName.map { x => x.asInstanceOf[js.Any] },
        "ReplicationTaskArn" -> ReplicationTaskArn.map { x => x.asInstanceOf[js.Any] },
        "ReplicationInstanceTaskLogSize" -> ReplicationInstanceTaskLogSize.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReplicationInstanceTaskLog]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait ReplicationPendingModifiedValues extends js.Object {
    var ReplicationInstanceClass: js.UndefOr[String]
    var AllocatedStorage: js.UndefOr[IntegerOptional]
    var MultiAZ: js.UndefOr[BooleanOptional]
    var EngineVersion: js.UndefOr[String]
  }

  object ReplicationPendingModifiedValues {
    def apply(
      ReplicationInstanceClass: js.UndefOr[String] = js.undefined,
      AllocatedStorage: js.UndefOr[IntegerOptional] = js.undefined,
      MultiAZ: js.UndefOr[BooleanOptional] = js.undefined,
      EngineVersion: js.UndefOr[String] = js.undefined): ReplicationPendingModifiedValues = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReplicationInstanceClass" -> ReplicationInstanceClass.map { x => x.asInstanceOf[js.Any] },
        "AllocatedStorage" -> AllocatedStorage.map { x => x.asInstanceOf[js.Any] },
        "MultiAZ" -> MultiAZ.map { x => x.asInstanceOf[js.Any] },
        "EngineVersion" -> EngineVersion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReplicationPendingModifiedValues]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait ReplicationSubnetGroup extends js.Object {
    var SubnetGroupStatus: js.UndefOr[String]
    var Subnets: js.UndefOr[SubnetList]
    var ReplicationSubnetGroupIdentifier: js.UndefOr[String]
    var ReplicationSubnetGroupDescription: js.UndefOr[String]
    var VpcId: js.UndefOr[String]
  }

  object ReplicationSubnetGroup {
    def apply(
      SubnetGroupStatus: js.UndefOr[String] = js.undefined,
      Subnets: js.UndefOr[SubnetList] = js.undefined,
      ReplicationSubnetGroupIdentifier: js.UndefOr[String] = js.undefined,
      ReplicationSubnetGroupDescription: js.UndefOr[String] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined): ReplicationSubnetGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SubnetGroupStatus" -> SubnetGroupStatus.map { x => x.asInstanceOf[js.Any] },
        "Subnets" -> Subnets.map { x => x.asInstanceOf[js.Any] },
        "ReplicationSubnetGroupIdentifier" -> ReplicationSubnetGroupIdentifier.map { x => x.asInstanceOf[js.Any] },
        "ReplicationSubnetGroupDescription" -> ReplicationSubnetGroupDescription.map { x => x.asInstanceOf[js.Any] },
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReplicationSubnetGroup]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait ReplicationTask extends js.Object {
    var LastFailureMessage: js.UndefOr[String]
    var ReplicationTaskSettings: js.UndefOr[String]
    var CdcStopPosition: js.UndefOr[String]
    var StopReason: js.UndefOr[String]
    var RecoveryCheckpoint: js.UndefOr[String]
    var MigrationType: js.UndefOr[MigrationTypeValue]
    var ReplicationTaskStats: js.UndefOr[ReplicationTaskStats]
    var ReplicationTaskStartDate: js.UndefOr[TStamp]
    var SourceEndpointArn: js.UndefOr[String]
    var ReplicationTaskIdentifier: js.UndefOr[String]
    var CdcStartPosition: js.UndefOr[String]
    var TableMappings: js.UndefOr[String]
    var ReplicationTaskCreationDate: js.UndefOr[TStamp]
    var ReplicationInstanceArn: js.UndefOr[String]
    var TargetEndpointArn: js.UndefOr[String]
    var ReplicationTaskArn: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  object ReplicationTask {
    def apply(
      LastFailureMessage: js.UndefOr[String] = js.undefined,
      ReplicationTaskSettings: js.UndefOr[String] = js.undefined,
      CdcStopPosition: js.UndefOr[String] = js.undefined,
      StopReason: js.UndefOr[String] = js.undefined,
      RecoveryCheckpoint: js.UndefOr[String] = js.undefined,
      MigrationType: js.UndefOr[MigrationTypeValue] = js.undefined,
      ReplicationTaskStats: js.UndefOr[ReplicationTaskStats] = js.undefined,
      ReplicationTaskStartDate: js.UndefOr[TStamp] = js.undefined,
      SourceEndpointArn: js.UndefOr[String] = js.undefined,
      ReplicationTaskIdentifier: js.UndefOr[String] = js.undefined,
      CdcStartPosition: js.UndefOr[String] = js.undefined,
      TableMappings: js.UndefOr[String] = js.undefined,
      ReplicationTaskCreationDate: js.UndefOr[TStamp] = js.undefined,
      ReplicationInstanceArn: js.UndefOr[String] = js.undefined,
      TargetEndpointArn: js.UndefOr[String] = js.undefined,
      ReplicationTaskArn: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[String] = js.undefined): ReplicationTask = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LastFailureMessage" -> LastFailureMessage.map { x => x.asInstanceOf[js.Any] },
        "ReplicationTaskSettings" -> ReplicationTaskSettings.map { x => x.asInstanceOf[js.Any] },
        "CdcStopPosition" -> CdcStopPosition.map { x => x.asInstanceOf[js.Any] },
        "StopReason" -> StopReason.map { x => x.asInstanceOf[js.Any] },
        "RecoveryCheckpoint" -> RecoveryCheckpoint.map { x => x.asInstanceOf[js.Any] },
        "MigrationType" -> MigrationType.map { x => x.asInstanceOf[js.Any] },
        "ReplicationTaskStats" -> ReplicationTaskStats.map { x => x.asInstanceOf[js.Any] },
        "ReplicationTaskStartDate" -> ReplicationTaskStartDate.map { x => x.asInstanceOf[js.Any] },
        "SourceEndpointArn" -> SourceEndpointArn.map { x => x.asInstanceOf[js.Any] },
        "ReplicationTaskIdentifier" -> ReplicationTaskIdentifier.map { x => x.asInstanceOf[js.Any] },
        "CdcStartPosition" -> CdcStartPosition.map { x => x.asInstanceOf[js.Any] },
        "TableMappings" -> TableMappings.map { x => x.asInstanceOf[js.Any] },
        "ReplicationTaskCreationDate" -> ReplicationTaskCreationDate.map { x => x.asInstanceOf[js.Any] },
        "ReplicationInstanceArn" -> ReplicationInstanceArn.map { x => x.asInstanceOf[js.Any] },
        "TargetEndpointArn" -> TargetEndpointArn.map { x => x.asInstanceOf[js.Any] },
        "ReplicationTaskArn" -> ReplicationTaskArn.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReplicationTask]
    }
  }

  /**
   * <p> The task assessment report in JSON format. </p>
   */
  @js.native
  trait ReplicationTaskAssessmentResult extends js.Object {
    var S3ObjectUrl: js.UndefOr[String]
    var AssessmentResultsFile: js.UndefOr[String]
    var ReplicationTaskLastAssessmentDate: js.UndefOr[TStamp]
    var AssessmentResults: js.UndefOr[String]
    var ReplicationTaskIdentifier: js.UndefOr[String]
    var AssessmentStatus: js.UndefOr[String]
    var ReplicationTaskArn: js.UndefOr[String]
  }

  object ReplicationTaskAssessmentResult {
    def apply(
      S3ObjectUrl: js.UndefOr[String] = js.undefined,
      AssessmentResultsFile: js.UndefOr[String] = js.undefined,
      ReplicationTaskLastAssessmentDate: js.UndefOr[TStamp] = js.undefined,
      AssessmentResults: js.UndefOr[String] = js.undefined,
      ReplicationTaskIdentifier: js.UndefOr[String] = js.undefined,
      AssessmentStatus: js.UndefOr[String] = js.undefined,
      ReplicationTaskArn: js.UndefOr[String] = js.undefined): ReplicationTaskAssessmentResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "S3ObjectUrl" -> S3ObjectUrl.map { x => x.asInstanceOf[js.Any] },
        "AssessmentResultsFile" -> AssessmentResultsFile.map { x => x.asInstanceOf[js.Any] },
        "ReplicationTaskLastAssessmentDate" -> ReplicationTaskLastAssessmentDate.map { x => x.asInstanceOf[js.Any] },
        "AssessmentResults" -> AssessmentResults.map { x => x.asInstanceOf[js.Any] },
        "ReplicationTaskIdentifier" -> ReplicationTaskIdentifier.map { x => x.asInstanceOf[js.Any] },
        "AssessmentStatus" -> AssessmentStatus.map { x => x.asInstanceOf[js.Any] },
        "ReplicationTaskArn" -> ReplicationTaskArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReplicationTaskAssessmentResult]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait ReplicationTaskStats extends js.Object {
    var TablesQueued: js.UndefOr[Int]
    var TablesErrored: js.UndefOr[Int]
    var TablesLoaded: js.UndefOr[Int]
    var TablesLoading: js.UndefOr[Int]
    var ElapsedTimeMillis: js.UndefOr[Double]
    var FullLoadProgressPercent: js.UndefOr[Int]
  }

  object ReplicationTaskStats {
    def apply(
      TablesQueued: js.UndefOr[Int] = js.undefined,
      TablesErrored: js.UndefOr[Int] = js.undefined,
      TablesLoaded: js.UndefOr[Int] = js.undefined,
      TablesLoading: js.UndefOr[Int] = js.undefined,
      ElapsedTimeMillis: js.UndefOr[Double] = js.undefined,
      FullLoadProgressPercent: js.UndefOr[Int] = js.undefined): ReplicationTaskStats = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TablesQueued" -> TablesQueued.map { x => x.asInstanceOf[js.Any] },
        "TablesErrored" -> TablesErrored.map { x => x.asInstanceOf[js.Any] },
        "TablesLoaded" -> TablesLoaded.map { x => x.asInstanceOf[js.Any] },
        "TablesLoading" -> TablesLoading.map { x => x.asInstanceOf[js.Any] },
        "ElapsedTimeMillis" -> ElapsedTimeMillis.map { x => x.asInstanceOf[js.Any] },
        "FullLoadProgressPercent" -> FullLoadProgressPercent.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReplicationTaskStats]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait S3Settings extends js.Object {
    var CsvDelimiter: js.UndefOr[String]
    var BucketName: js.UndefOr[String]
    var CompressionType: js.UndefOr[CompressionTypeValue]
    var ExternalTableDefinition: js.UndefOr[String]
    var CsvRowDelimiter: js.UndefOr[String]
    var ServiceAccessRoleArn: js.UndefOr[String]
    var BucketFolder: js.UndefOr[String]
  }

  object S3Settings {
    def apply(
      CsvDelimiter: js.UndefOr[String] = js.undefined,
      BucketName: js.UndefOr[String] = js.undefined,
      CompressionType: js.UndefOr[CompressionTypeValue] = js.undefined,
      ExternalTableDefinition: js.UndefOr[String] = js.undefined,
      CsvRowDelimiter: js.UndefOr[String] = js.undefined,
      ServiceAccessRoleArn: js.UndefOr[String] = js.undefined,
      BucketFolder: js.UndefOr[String] = js.undefined): S3Settings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CsvDelimiter" -> CsvDelimiter.map { x => x.asInstanceOf[js.Any] },
        "BucketName" -> BucketName.map { x => x.asInstanceOf[js.Any] },
        "CompressionType" -> CompressionType.map { x => x.asInstanceOf[js.Any] },
        "ExternalTableDefinition" -> ExternalTableDefinition.map { x => x.asInstanceOf[js.Any] },
        "CsvRowDelimiter" -> CsvRowDelimiter.map { x => x.asInstanceOf[js.Any] },
        "ServiceAccessRoleArn" -> ServiceAccessRoleArn.map { x => x.asInstanceOf[js.Any] },
        "BucketFolder" -> BucketFolder.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3Settings]
    }
  }

  object SourceTypeEnum {
    val `replication-instance` = "replication-instance"

    val values = IndexedSeq(`replication-instance`)
  }

  /**
   * <p/>
   */
  @js.native
  trait StartReplicationTaskAssessmentMessage extends js.Object {
    var ReplicationTaskArn: js.UndefOr[String]
  }

  object StartReplicationTaskAssessmentMessage {
    def apply(
      ReplicationTaskArn: js.UndefOr[String] = js.undefined): StartReplicationTaskAssessmentMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReplicationTaskArn" -> ReplicationTaskArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartReplicationTaskAssessmentMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait StartReplicationTaskAssessmentResponse extends js.Object {
    var ReplicationTask: js.UndefOr[ReplicationTask]
  }

  object StartReplicationTaskAssessmentResponse {
    def apply(
      ReplicationTask: js.UndefOr[ReplicationTask] = js.undefined): StartReplicationTaskAssessmentResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReplicationTask" -> ReplicationTask.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartReplicationTaskAssessmentResponse]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait StartReplicationTaskMessage extends js.Object {
    var CdcStopPosition: js.UndefOr[String]
    var StartReplicationTaskType: js.UndefOr[StartReplicationTaskTypeValue]
    var CdcStartPosition: js.UndefOr[String]
    var ReplicationTaskArn: js.UndefOr[String]
    var CdcStartTime: js.UndefOr[TStamp]
  }

  object StartReplicationTaskMessage {
    def apply(
      CdcStopPosition: js.UndefOr[String] = js.undefined,
      StartReplicationTaskType: js.UndefOr[StartReplicationTaskTypeValue] = js.undefined,
      CdcStartPosition: js.UndefOr[String] = js.undefined,
      ReplicationTaskArn: js.UndefOr[String] = js.undefined,
      CdcStartTime: js.UndefOr[TStamp] = js.undefined): StartReplicationTaskMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CdcStopPosition" -> CdcStopPosition.map { x => x.asInstanceOf[js.Any] },
        "StartReplicationTaskType" -> StartReplicationTaskType.map { x => x.asInstanceOf[js.Any] },
        "CdcStartPosition" -> CdcStartPosition.map { x => x.asInstanceOf[js.Any] },
        "ReplicationTaskArn" -> ReplicationTaskArn.map { x => x.asInstanceOf[js.Any] },
        "CdcStartTime" -> CdcStartTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartReplicationTaskMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait StartReplicationTaskResponse extends js.Object {
    var ReplicationTask: js.UndefOr[ReplicationTask]
  }

  object StartReplicationTaskResponse {
    def apply(
      ReplicationTask: js.UndefOr[ReplicationTask] = js.undefined): StartReplicationTaskResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReplicationTask" -> ReplicationTask.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartReplicationTaskResponse]
    }
  }

  object StartReplicationTaskTypeValueEnum {
    val `start-replication` = "start-replication"
    val `resume-processing` = "resume-processing"
    val `reload-target` = "reload-target"

    val values = IndexedSeq(`start-replication`, `resume-processing`, `reload-target`)
  }

  /**
   * <p/>
   */
  @js.native
  trait StopReplicationTaskMessage extends js.Object {
    var ReplicationTaskArn: js.UndefOr[String]
  }

  object StopReplicationTaskMessage {
    def apply(
      ReplicationTaskArn: js.UndefOr[String] = js.undefined): StopReplicationTaskMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReplicationTaskArn" -> ReplicationTaskArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopReplicationTaskMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait StopReplicationTaskResponse extends js.Object {
    var ReplicationTask: js.UndefOr[ReplicationTask]
  }

  object StopReplicationTaskResponse {
    def apply(
      ReplicationTask: js.UndefOr[ReplicationTask] = js.undefined): StopReplicationTaskResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReplicationTask" -> ReplicationTask.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopReplicationTaskResponse]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait Subnet extends js.Object {
    var SubnetIdentifier: js.UndefOr[String]
    var SubnetAvailabilityZone: js.UndefOr[AvailabilityZone]
    var SubnetStatus: js.UndefOr[String]
  }

  object Subnet {
    def apply(
      SubnetIdentifier: js.UndefOr[String] = js.undefined,
      SubnetAvailabilityZone: js.UndefOr[AvailabilityZone] = js.undefined,
      SubnetStatus: js.UndefOr[String] = js.undefined): Subnet = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SubnetIdentifier" -> SubnetIdentifier.map { x => x.asInstanceOf[js.Any] },
        "SubnetAvailabilityZone" -> SubnetAvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "SubnetStatus" -> SubnetStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Subnet]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait SupportedEndpointType extends js.Object {
    var EngineName: js.UndefOr[String]
    var SupportsCDC: js.UndefOr[Boolean]
    var EndpointType: js.UndefOr[ReplicationEndpointTypeValue]
    var EngineDisplayName: js.UndefOr[String]
  }

  object SupportedEndpointType {
    def apply(
      EngineName: js.UndefOr[String] = js.undefined,
      SupportsCDC: js.UndefOr[Boolean] = js.undefined,
      EndpointType: js.UndefOr[ReplicationEndpointTypeValue] = js.undefined,
      EngineDisplayName: js.UndefOr[String] = js.undefined): SupportedEndpointType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EngineName" -> EngineName.map { x => x.asInstanceOf[js.Any] },
        "SupportsCDC" -> SupportsCDC.map { x => x.asInstanceOf[js.Any] },
        "EndpointType" -> EndpointType.map { x => x.asInstanceOf[js.Any] },
        "EngineDisplayName" -> EngineDisplayName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SupportedEndpointType]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait TableStatistics extends js.Object {
    var LastUpdateTime: js.UndefOr[TStamp]
    var FullLoadErrorRows: js.UndefOr[Double]
    var Inserts: js.UndefOr[Double]
    var Deletes: js.UndefOr[Double]
    var ValidationState: js.UndefOr[String]
    var ValidationSuspendedRecords: js.UndefOr[Double]
    var Updates: js.UndefOr[Double]
    var ValidationFailedRecords: js.UndefOr[Double]
    var TableState: js.UndefOr[String]
    var SchemaName: js.UndefOr[String]
    var ValidationPendingRecords: js.UndefOr[Double]
    var ValidationStateDetails: js.UndefOr[String]
    var Ddls: js.UndefOr[Double]
    var FullLoadCondtnlChkFailedRows: js.UndefOr[Double]
    var FullLoadRows: js.UndefOr[Double]
    var TableName: js.UndefOr[String]
  }

  object TableStatistics {
    def apply(
      LastUpdateTime: js.UndefOr[TStamp] = js.undefined,
      FullLoadErrorRows: js.UndefOr[Double] = js.undefined,
      Inserts: js.UndefOr[Double] = js.undefined,
      Deletes: js.UndefOr[Double] = js.undefined,
      ValidationState: js.UndefOr[String] = js.undefined,
      ValidationSuspendedRecords: js.UndefOr[Double] = js.undefined,
      Updates: js.UndefOr[Double] = js.undefined,
      ValidationFailedRecords: js.UndefOr[Double] = js.undefined,
      TableState: js.UndefOr[String] = js.undefined,
      SchemaName: js.UndefOr[String] = js.undefined,
      ValidationPendingRecords: js.UndefOr[Double] = js.undefined,
      ValidationStateDetails: js.UndefOr[String] = js.undefined,
      Ddls: js.UndefOr[Double] = js.undefined,
      FullLoadCondtnlChkFailedRows: js.UndefOr[Double] = js.undefined,
      FullLoadRows: js.UndefOr[Double] = js.undefined,
      TableName: js.UndefOr[String] = js.undefined): TableStatistics = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LastUpdateTime" -> LastUpdateTime.map { x => x.asInstanceOf[js.Any] },
        "FullLoadErrorRows" -> FullLoadErrorRows.map { x => x.asInstanceOf[js.Any] },
        "Inserts" -> Inserts.map { x => x.asInstanceOf[js.Any] },
        "Deletes" -> Deletes.map { x => x.asInstanceOf[js.Any] },
        "ValidationState" -> ValidationState.map { x => x.asInstanceOf[js.Any] },
        "ValidationSuspendedRecords" -> ValidationSuspendedRecords.map { x => x.asInstanceOf[js.Any] },
        "Updates" -> Updates.map { x => x.asInstanceOf[js.Any] },
        "ValidationFailedRecords" -> ValidationFailedRecords.map { x => x.asInstanceOf[js.Any] },
        "TableState" -> TableState.map { x => x.asInstanceOf[js.Any] },
        "SchemaName" -> SchemaName.map { x => x.asInstanceOf[js.Any] },
        "ValidationPendingRecords" -> ValidationPendingRecords.map { x => x.asInstanceOf[js.Any] },
        "ValidationStateDetails" -> ValidationStateDetails.map { x => x.asInstanceOf[js.Any] },
        "Ddls" -> Ddls.map { x => x.asInstanceOf[js.Any] },
        "FullLoadCondtnlChkFailedRows" -> FullLoadCondtnlChkFailedRows.map { x => x.asInstanceOf[js.Any] },
        "FullLoadRows" -> FullLoadRows.map { x => x.asInstanceOf[js.Any] },
        "TableName" -> TableName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TableStatistics]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait TableToReload extends js.Object {
    var SchemaName: js.UndefOr[String]
    var TableName: js.UndefOr[String]
  }

  object TableToReload {
    def apply(
      SchemaName: js.UndefOr[String] = js.undefined,
      TableName: js.UndefOr[String] = js.undefined): TableToReload = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SchemaName" -> SchemaName.map { x => x.asInstanceOf[js.Any] },
        "TableName" -> TableName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TableToReload]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait Tag extends js.Object {
    var Key: js.UndefOr[String]
    var Value: js.UndefOr[String]
  }

  object Tag {
    def apply(
      Key: js.UndefOr[String] = js.undefined,
      Value: js.UndefOr[String] = js.undefined): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait TestConnectionMessage extends js.Object {
    var ReplicationInstanceArn: js.UndefOr[String]
    var EndpointArn: js.UndefOr[String]
  }

  object TestConnectionMessage {
    def apply(
      ReplicationInstanceArn: js.UndefOr[String] = js.undefined,
      EndpointArn: js.UndefOr[String] = js.undefined): TestConnectionMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReplicationInstanceArn" -> ReplicationInstanceArn.map { x => x.asInstanceOf[js.Any] },
        "EndpointArn" -> EndpointArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TestConnectionMessage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait TestConnectionResponse extends js.Object {
    var Connection: js.UndefOr[Connection]
  }

  object TestConnectionResponse {
    def apply(
      Connection: js.UndefOr[Connection] = js.undefined): TestConnectionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Connection" -> Connection.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TestConnectionResponse]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait VpcSecurityGroupMembership extends js.Object {
    var VpcSecurityGroupId: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  object VpcSecurityGroupMembership {
    def apply(
      VpcSecurityGroupId: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[String] = js.undefined): VpcSecurityGroupMembership = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VpcSecurityGroupId" -> VpcSecurityGroupId.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VpcSecurityGroupMembership]
    }
  }
}
