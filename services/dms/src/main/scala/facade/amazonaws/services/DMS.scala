package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object dms {
  type AccountQuotaList = js.Array[AccountQuota]
  type AvailabilityZonesList = js.Array[String]
  type BooleanOptional = Boolean
  type CertificateList = js.Array[Certificate]
  type CertificateWallet = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type ConnectionList = js.Array[Connection]
  type EndpointList = js.Array[Endpoint]
  type EventCategoriesList = js.Array[String]
  type EventCategoryGroupList = js.Array[EventCategoryGroup]
  type EventList = js.Array[Event]
  type EventSubscriptionsList = js.Array[EventSubscription]
  type ExcludeTestList = js.Array[String]
  type FilterList = js.Array[Filter]
  type FilterValueList = js.Array[String]
  type IncludeTestList = js.Array[String]
  type IndividualAssessmentNameList = js.Array[String]
  type IntegerOptional = Int
  type KeyList = js.Array[String]
  type OrderableReplicationInstanceList = js.Array[OrderableReplicationInstance]
  type PendingMaintenanceActionDetails = js.Array[PendingMaintenanceAction]
  type PendingMaintenanceActions = js.Array[ResourcePendingMaintenanceActions]
  type ReplicationInstanceList = js.Array[ReplicationInstance]
  type ReplicationInstancePrivateIpAddressList = js.Array[String]
  type ReplicationInstancePublicIpAddressList = js.Array[String]
  type ReplicationInstanceTaskLogsList = js.Array[ReplicationInstanceTaskLog]
  type ReplicationSubnetGroups = js.Array[ReplicationSubnetGroup]
  type ReplicationTaskAssessmentResultList = js.Array[ReplicationTaskAssessmentResult]
  type ReplicationTaskAssessmentRunList = js.Array[ReplicationTaskAssessmentRun]
  type ReplicationTaskIndividualAssessmentList = js.Array[ReplicationTaskIndividualAssessment]
  type ReplicationTaskList = js.Array[ReplicationTask]
  type SchemaList = js.Array[String]
  type SecretString = String
  type SourceIdsList = js.Array[String]
  type SubnetIdentifierList = js.Array[String]
  type SubnetList = js.Array[Subnet]
  type SupportedEndpointTypeList = js.Array[SupportedEndpointType]
  type TStamp = js.Date
  type TableListToReload = js.Array[TableToReload]
  type TableStatisticsList = js.Array[TableStatistics]
  type TagList = js.Array[Tag]
  type VpcSecurityGroupIdList = js.Array[String]
  type VpcSecurityGroupMembershipList = js.Array[VpcSecurityGroupMembership]

  implicit final class DMSOps(private val service: DMS) extends AnyVal {

    @inline def addTagsToResourceFuture(params: AddTagsToResourceMessage): Future[AddTagsToResourceResponse] = service.addTagsToResource(params).promise().toFuture
    @inline def applyPendingMaintenanceActionFuture(params: ApplyPendingMaintenanceActionMessage): Future[ApplyPendingMaintenanceActionResponse] = service.applyPendingMaintenanceAction(params).promise().toFuture
    @inline def cancelReplicationTaskAssessmentRunFuture(params: CancelReplicationTaskAssessmentRunMessage): Future[CancelReplicationTaskAssessmentRunResponse] = service.cancelReplicationTaskAssessmentRun(params).promise().toFuture
    @inline def createEndpointFuture(params: CreateEndpointMessage): Future[CreateEndpointResponse] = service.createEndpoint(params).promise().toFuture
    @inline def createEventSubscriptionFuture(params: CreateEventSubscriptionMessage): Future[CreateEventSubscriptionResponse] = service.createEventSubscription(params).promise().toFuture
    @inline def createReplicationInstanceFuture(params: CreateReplicationInstanceMessage): Future[CreateReplicationInstanceResponse] = service.createReplicationInstance(params).promise().toFuture
    @inline def createReplicationSubnetGroupFuture(params: CreateReplicationSubnetGroupMessage): Future[CreateReplicationSubnetGroupResponse] = service.createReplicationSubnetGroup(params).promise().toFuture
    @inline def createReplicationTaskFuture(params: CreateReplicationTaskMessage): Future[CreateReplicationTaskResponse] = service.createReplicationTask(params).promise().toFuture
    @inline def deleteCertificateFuture(params: DeleteCertificateMessage): Future[DeleteCertificateResponse] = service.deleteCertificate(params).promise().toFuture
    @inline def deleteConnectionFuture(params: DeleteConnectionMessage): Future[DeleteConnectionResponse] = service.deleteConnection(params).promise().toFuture
    @inline def deleteEndpointFuture(params: DeleteEndpointMessage): Future[DeleteEndpointResponse] = service.deleteEndpoint(params).promise().toFuture
    @inline def deleteEventSubscriptionFuture(params: DeleteEventSubscriptionMessage): Future[DeleteEventSubscriptionResponse] = service.deleteEventSubscription(params).promise().toFuture
    @inline def deleteReplicationInstanceFuture(params: DeleteReplicationInstanceMessage): Future[DeleteReplicationInstanceResponse] = service.deleteReplicationInstance(params).promise().toFuture
    @inline def deleteReplicationSubnetGroupFuture(params: DeleteReplicationSubnetGroupMessage): Future[DeleteReplicationSubnetGroupResponse] = service.deleteReplicationSubnetGroup(params).promise().toFuture
    @inline def deleteReplicationTaskAssessmentRunFuture(params: DeleteReplicationTaskAssessmentRunMessage): Future[DeleteReplicationTaskAssessmentRunResponse] = service.deleteReplicationTaskAssessmentRun(params).promise().toFuture
    @inline def deleteReplicationTaskFuture(params: DeleteReplicationTaskMessage): Future[DeleteReplicationTaskResponse] = service.deleteReplicationTask(params).promise().toFuture
    @inline def describeAccountAttributesFuture(params: DescribeAccountAttributesMessage): Future[DescribeAccountAttributesResponse] = service.describeAccountAttributes(params).promise().toFuture
    @inline def describeApplicableIndividualAssessmentsFuture(params: DescribeApplicableIndividualAssessmentsMessage): Future[DescribeApplicableIndividualAssessmentsResponse] = service.describeApplicableIndividualAssessments(params).promise().toFuture
    @inline def describeCertificatesFuture(params: DescribeCertificatesMessage): Future[DescribeCertificatesResponse] = service.describeCertificates(params).promise().toFuture
    @inline def describeConnectionsFuture(params: DescribeConnectionsMessage): Future[DescribeConnectionsResponse] = service.describeConnections(params).promise().toFuture
    @inline def describeEndpointTypesFuture(params: DescribeEndpointTypesMessage): Future[DescribeEndpointTypesResponse] = service.describeEndpointTypes(params).promise().toFuture
    @inline def describeEndpointsFuture(params: DescribeEndpointsMessage): Future[DescribeEndpointsResponse] = service.describeEndpoints(params).promise().toFuture
    @inline def describeEventCategoriesFuture(params: DescribeEventCategoriesMessage): Future[DescribeEventCategoriesResponse] = service.describeEventCategories(params).promise().toFuture
    @inline def describeEventSubscriptionsFuture(params: DescribeEventSubscriptionsMessage): Future[DescribeEventSubscriptionsResponse] = service.describeEventSubscriptions(params).promise().toFuture
    @inline def describeEventsFuture(params: DescribeEventsMessage): Future[DescribeEventsResponse] = service.describeEvents(params).promise().toFuture
    @inline def describeOrderableReplicationInstancesFuture(params: DescribeOrderableReplicationInstancesMessage): Future[DescribeOrderableReplicationInstancesResponse] = service.describeOrderableReplicationInstances(params).promise().toFuture
    @inline def describePendingMaintenanceActionsFuture(params: DescribePendingMaintenanceActionsMessage): Future[DescribePendingMaintenanceActionsResponse] = service.describePendingMaintenanceActions(params).promise().toFuture
    @inline def describeRefreshSchemasStatusFuture(params: DescribeRefreshSchemasStatusMessage): Future[DescribeRefreshSchemasStatusResponse] = service.describeRefreshSchemasStatus(params).promise().toFuture
    @inline def describeReplicationInstanceTaskLogsFuture(params: DescribeReplicationInstanceTaskLogsMessage): Future[DescribeReplicationInstanceTaskLogsResponse] = service.describeReplicationInstanceTaskLogs(params).promise().toFuture
    @inline def describeReplicationInstancesFuture(params: DescribeReplicationInstancesMessage): Future[DescribeReplicationInstancesResponse] = service.describeReplicationInstances(params).promise().toFuture
    @inline def describeReplicationSubnetGroupsFuture(params: DescribeReplicationSubnetGroupsMessage): Future[DescribeReplicationSubnetGroupsResponse] = service.describeReplicationSubnetGroups(params).promise().toFuture
    @inline def describeReplicationTaskAssessmentResultsFuture(params: DescribeReplicationTaskAssessmentResultsMessage): Future[DescribeReplicationTaskAssessmentResultsResponse] = service.describeReplicationTaskAssessmentResults(params).promise().toFuture
    @inline def describeReplicationTaskAssessmentRunsFuture(params: DescribeReplicationTaskAssessmentRunsMessage): Future[DescribeReplicationTaskAssessmentRunsResponse] = service.describeReplicationTaskAssessmentRuns(params).promise().toFuture
    @inline def describeReplicationTaskIndividualAssessmentsFuture(params: DescribeReplicationTaskIndividualAssessmentsMessage): Future[DescribeReplicationTaskIndividualAssessmentsResponse] = service.describeReplicationTaskIndividualAssessments(params).promise().toFuture
    @inline def describeReplicationTasksFuture(params: DescribeReplicationTasksMessage): Future[DescribeReplicationTasksResponse] = service.describeReplicationTasks(params).promise().toFuture
    @inline def describeSchemasFuture(params: DescribeSchemasMessage): Future[DescribeSchemasResponse] = service.describeSchemas(params).promise().toFuture
    @inline def describeTableStatisticsFuture(params: DescribeTableStatisticsMessage): Future[DescribeTableStatisticsResponse] = service.describeTableStatistics(params).promise().toFuture
    @inline def importCertificateFuture(params: ImportCertificateMessage): Future[ImportCertificateResponse] = service.importCertificate(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceMessage): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def modifyEndpointFuture(params: ModifyEndpointMessage): Future[ModifyEndpointResponse] = service.modifyEndpoint(params).promise().toFuture
    @inline def modifyEventSubscriptionFuture(params: ModifyEventSubscriptionMessage): Future[ModifyEventSubscriptionResponse] = service.modifyEventSubscription(params).promise().toFuture
    @inline def modifyReplicationInstanceFuture(params: ModifyReplicationInstanceMessage): Future[ModifyReplicationInstanceResponse] = service.modifyReplicationInstance(params).promise().toFuture
    @inline def modifyReplicationSubnetGroupFuture(params: ModifyReplicationSubnetGroupMessage): Future[ModifyReplicationSubnetGroupResponse] = service.modifyReplicationSubnetGroup(params).promise().toFuture
    @inline def modifyReplicationTaskFuture(params: ModifyReplicationTaskMessage): Future[ModifyReplicationTaskResponse] = service.modifyReplicationTask(params).promise().toFuture
    @inline def moveReplicationTaskFuture(params: MoveReplicationTaskMessage): Future[MoveReplicationTaskResponse] = service.moveReplicationTask(params).promise().toFuture
    @inline def rebootReplicationInstanceFuture(params: RebootReplicationInstanceMessage): Future[RebootReplicationInstanceResponse] = service.rebootReplicationInstance(params).promise().toFuture
    @inline def refreshSchemasFuture(params: RefreshSchemasMessage): Future[RefreshSchemasResponse] = service.refreshSchemas(params).promise().toFuture
    @inline def reloadTablesFuture(params: ReloadTablesMessage): Future[ReloadTablesResponse] = service.reloadTables(params).promise().toFuture
    @inline def removeTagsFromResourceFuture(params: RemoveTagsFromResourceMessage): Future[RemoveTagsFromResourceResponse] = service.removeTagsFromResource(params).promise().toFuture
    @inline def startReplicationTaskAssessmentFuture(params: StartReplicationTaskAssessmentMessage): Future[StartReplicationTaskAssessmentResponse] = service.startReplicationTaskAssessment(params).promise().toFuture
    @inline def startReplicationTaskAssessmentRunFuture(params: StartReplicationTaskAssessmentRunMessage): Future[StartReplicationTaskAssessmentRunResponse] = service.startReplicationTaskAssessmentRun(params).promise().toFuture
    @inline def startReplicationTaskFuture(params: StartReplicationTaskMessage): Future[StartReplicationTaskResponse] = service.startReplicationTask(params).promise().toFuture
    @inline def stopReplicationTaskFuture(params: StopReplicationTaskMessage): Future[StopReplicationTaskResponse] = service.stopReplicationTask(params).promise().toFuture
    @inline def testConnectionFuture(params: TestConnectionMessage): Future[TestConnectionResponse] = service.testConnection(params).promise().toFuture

  }
}

package dms {
  @js.native
  @JSImport("aws-sdk/clients/dms", JSImport.Namespace, "AWS.DMS")
  class DMS() extends js.Object {
    def this(config: AWSConfig) = this()

    def addTagsToResource(params: AddTagsToResourceMessage): Request[AddTagsToResourceResponse] = js.native
    def applyPendingMaintenanceAction(params: ApplyPendingMaintenanceActionMessage): Request[ApplyPendingMaintenanceActionResponse] = js.native
    def cancelReplicationTaskAssessmentRun(params: CancelReplicationTaskAssessmentRunMessage): Request[CancelReplicationTaskAssessmentRunResponse] = js.native
    def createEndpoint(params: CreateEndpointMessage): Request[CreateEndpointResponse] = js.native
    def createEventSubscription(params: CreateEventSubscriptionMessage): Request[CreateEventSubscriptionResponse] = js.native
    def createReplicationInstance(params: CreateReplicationInstanceMessage): Request[CreateReplicationInstanceResponse] = js.native
    def createReplicationSubnetGroup(params: CreateReplicationSubnetGroupMessage): Request[CreateReplicationSubnetGroupResponse] = js.native
    def createReplicationTask(params: CreateReplicationTaskMessage): Request[CreateReplicationTaskResponse] = js.native
    def deleteCertificate(params: DeleteCertificateMessage): Request[DeleteCertificateResponse] = js.native
    def deleteConnection(params: DeleteConnectionMessage): Request[DeleteConnectionResponse] = js.native
    def deleteEndpoint(params: DeleteEndpointMessage): Request[DeleteEndpointResponse] = js.native
    def deleteEventSubscription(params: DeleteEventSubscriptionMessage): Request[DeleteEventSubscriptionResponse] = js.native
    def deleteReplicationInstance(params: DeleteReplicationInstanceMessage): Request[DeleteReplicationInstanceResponse] = js.native
    def deleteReplicationSubnetGroup(params: DeleteReplicationSubnetGroupMessage): Request[DeleteReplicationSubnetGroupResponse] = js.native
    def deleteReplicationTask(params: DeleteReplicationTaskMessage): Request[DeleteReplicationTaskResponse] = js.native
    def deleteReplicationTaskAssessmentRun(params: DeleteReplicationTaskAssessmentRunMessage): Request[DeleteReplicationTaskAssessmentRunResponse] = js.native
    def describeAccountAttributes(params: DescribeAccountAttributesMessage): Request[DescribeAccountAttributesResponse] = js.native
    def describeApplicableIndividualAssessments(params: DescribeApplicableIndividualAssessmentsMessage): Request[DescribeApplicableIndividualAssessmentsResponse] = js.native
    def describeCertificates(params: DescribeCertificatesMessage): Request[DescribeCertificatesResponse] = js.native
    def describeConnections(params: DescribeConnectionsMessage): Request[DescribeConnectionsResponse] = js.native
    def describeEndpointTypes(params: DescribeEndpointTypesMessage): Request[DescribeEndpointTypesResponse] = js.native
    def describeEndpoints(params: DescribeEndpointsMessage): Request[DescribeEndpointsResponse] = js.native
    def describeEventCategories(params: DescribeEventCategoriesMessage): Request[DescribeEventCategoriesResponse] = js.native
    def describeEventSubscriptions(params: DescribeEventSubscriptionsMessage): Request[DescribeEventSubscriptionsResponse] = js.native
    def describeEvents(params: DescribeEventsMessage): Request[DescribeEventsResponse] = js.native
    def describeOrderableReplicationInstances(params: DescribeOrderableReplicationInstancesMessage): Request[DescribeOrderableReplicationInstancesResponse] = js.native
    def describePendingMaintenanceActions(params: DescribePendingMaintenanceActionsMessage): Request[DescribePendingMaintenanceActionsResponse] = js.native
    def describeRefreshSchemasStatus(params: DescribeRefreshSchemasStatusMessage): Request[DescribeRefreshSchemasStatusResponse] = js.native
    def describeReplicationInstanceTaskLogs(params: DescribeReplicationInstanceTaskLogsMessage): Request[DescribeReplicationInstanceTaskLogsResponse] = js.native
    def describeReplicationInstances(params: DescribeReplicationInstancesMessage): Request[DescribeReplicationInstancesResponse] = js.native
    def describeReplicationSubnetGroups(params: DescribeReplicationSubnetGroupsMessage): Request[DescribeReplicationSubnetGroupsResponse] = js.native
    def describeReplicationTaskAssessmentResults(params: DescribeReplicationTaskAssessmentResultsMessage): Request[DescribeReplicationTaskAssessmentResultsResponse] = js.native
    def describeReplicationTaskAssessmentRuns(params: DescribeReplicationTaskAssessmentRunsMessage): Request[DescribeReplicationTaskAssessmentRunsResponse] = js.native
    def describeReplicationTaskIndividualAssessments(params: DescribeReplicationTaskIndividualAssessmentsMessage): Request[DescribeReplicationTaskIndividualAssessmentsResponse] = js.native
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
    def moveReplicationTask(params: MoveReplicationTaskMessage): Request[MoveReplicationTaskResponse] = js.native
    def rebootReplicationInstance(params: RebootReplicationInstanceMessage): Request[RebootReplicationInstanceResponse] = js.native
    def refreshSchemas(params: RefreshSchemasMessage): Request[RefreshSchemasResponse] = js.native
    def reloadTables(params: ReloadTablesMessage): Request[ReloadTablesResponse] = js.native
    def removeTagsFromResource(params: RemoveTagsFromResourceMessage): Request[RemoveTagsFromResourceResponse] = js.native
    def startReplicationTask(params: StartReplicationTaskMessage): Request[StartReplicationTaskResponse] = js.native
    def startReplicationTaskAssessment(params: StartReplicationTaskAssessmentMessage): Request[StartReplicationTaskAssessmentResponse] = js.native
    def startReplicationTaskAssessmentRun(params: StartReplicationTaskAssessmentRunMessage): Request[StartReplicationTaskAssessmentRunResponse] = js.native
    def stopReplicationTask(params: StopReplicationTaskMessage): Request[StopReplicationTaskResponse] = js.native
    def testConnection(params: TestConnectionMessage): Request[TestConnectionResponse] = js.native
  }

  /** Describes a quota for an AWS account, for example, the number of replication instances allowed.
    */
  @js.native
  trait AccountQuota extends js.Object {
    var AccountQuotaName: js.UndefOr[String]
    var Max: js.UndefOr[Double]
    var Used: js.UndefOr[Double]
  }

  object AccountQuota {
    @inline
    def apply(
        AccountQuotaName: js.UndefOr[String] = js.undefined,
        Max: js.UndefOr[Double] = js.undefined,
        Used: js.UndefOr[Double] = js.undefined
    ): AccountQuota = {
      val __obj = js.Dynamic.literal()
      AccountQuotaName.foreach(__v => __obj.updateDynamic("AccountQuotaName")(__v.asInstanceOf[js.Any]))
      Max.foreach(__v => __obj.updateDynamic("Max")(__v.asInstanceOf[js.Any]))
      Used.foreach(__v => __obj.updateDynamic("Used")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccountQuota]
    }
  }

  /** Associates a set of tags with an AWS DMS resource.
    */
  @js.native
  trait AddTagsToResourceMessage extends js.Object {
    var ResourceArn: String
    var Tags: TagList
  }

  object AddTagsToResourceMessage {
    @inline
    def apply(
        ResourceArn: String,
        Tags: TagList
    ): AddTagsToResourceMessage = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AddTagsToResourceMessage]
    }
  }

  /** <p/>
    */
  @js.native
  trait AddTagsToResourceResponse extends js.Object

  object AddTagsToResourceResponse {
    @inline
    def apply(): AddTagsToResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddTagsToResourceResponse]
    }
  }

  /** <p/>
    */
  @js.native
  trait ApplyPendingMaintenanceActionMessage extends js.Object {
    var ApplyAction: String
    var OptInType: String
    var ReplicationInstanceArn: String
  }

  object ApplyPendingMaintenanceActionMessage {
    @inline
    def apply(
        ApplyAction: String,
        OptInType: String,
        ReplicationInstanceArn: String
    ): ApplyPendingMaintenanceActionMessage = {
      val __obj = js.Dynamic.literal(
        "ApplyAction" -> ApplyAction.asInstanceOf[js.Any],
        "OptInType" -> OptInType.asInstanceOf[js.Any],
        "ReplicationInstanceArn" -> ReplicationInstanceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ApplyPendingMaintenanceActionMessage]
    }
  }

  /** <p/>
    */
  @js.native
  trait ApplyPendingMaintenanceActionResponse extends js.Object {
    var ResourcePendingMaintenanceActions: js.UndefOr[ResourcePendingMaintenanceActions]
  }

  object ApplyPendingMaintenanceActionResponse {
    @inline
    def apply(
        ResourcePendingMaintenanceActions: js.UndefOr[ResourcePendingMaintenanceActions] = js.undefined
    ): ApplyPendingMaintenanceActionResponse = {
      val __obj = js.Dynamic.literal()
      ResourcePendingMaintenanceActions.foreach(__v => __obj.updateDynamic("ResourcePendingMaintenanceActions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApplyPendingMaintenanceActionResponse]
    }
  }

  @js.native
  sealed trait AuthMechanismValue extends js.Any
  object AuthMechanismValue {
    val default = "default".asInstanceOf[AuthMechanismValue]
    val mongodb_cr = "mongodb_cr".asInstanceOf[AuthMechanismValue]
    val scram_sha_1 = "scram_sha_1".asInstanceOf[AuthMechanismValue]

    @inline def values = js.Array(default, mongodb_cr, scram_sha_1)
  }

  @js.native
  sealed trait AuthTypeValue extends js.Any
  object AuthTypeValue {
    val no = "no".asInstanceOf[AuthTypeValue]
    val password = "password".asInstanceOf[AuthTypeValue]

    @inline def values = js.Array(no, password)
  }

  /** The name of an Availability Zone for use during database migration. <code>AvailabilityZone</code> is an optional parameter to the <a href="https://docs.aws.amazon.com/dms/latest/APIReference/API_CreateReplicationInstance.html"> <code>CreateReplicationInstance</code> </a> operation, and it’s value relates to the AWS Region of an endpoint. For example, the availability zone of an endpoint in the us-east-1 region might be us-east-1a, us-east-1b, us-east-1c, or us-east-1d.
    */
  @js.native
  trait AvailabilityZone extends js.Object {
    var Name: js.UndefOr[String]
  }

  object AvailabilityZone {
    @inline
    def apply(
        Name: js.UndefOr[String] = js.undefined
    ): AvailabilityZone = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AvailabilityZone]
    }
  }

  /** <p/>
    */
  @js.native
  trait CancelReplicationTaskAssessmentRunMessage extends js.Object {
    var ReplicationTaskAssessmentRunArn: String
  }

  object CancelReplicationTaskAssessmentRunMessage {
    @inline
    def apply(
        ReplicationTaskAssessmentRunArn: String
    ): CancelReplicationTaskAssessmentRunMessage = {
      val __obj = js.Dynamic.literal(
        "ReplicationTaskAssessmentRunArn" -> ReplicationTaskAssessmentRunArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CancelReplicationTaskAssessmentRunMessage]
    }
  }

  /** <p/>
    */
  @js.native
  trait CancelReplicationTaskAssessmentRunResponse extends js.Object {
    var ReplicationTaskAssessmentRun: js.UndefOr[ReplicationTaskAssessmentRun]
  }

  object CancelReplicationTaskAssessmentRunResponse {
    @inline
    def apply(
        ReplicationTaskAssessmentRun: js.UndefOr[ReplicationTaskAssessmentRun] = js.undefined
    ): CancelReplicationTaskAssessmentRunResponse = {
      val __obj = js.Dynamic.literal()
      ReplicationTaskAssessmentRun.foreach(__v => __obj.updateDynamic("ReplicationTaskAssessmentRun")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CancelReplicationTaskAssessmentRunResponse]
    }
  }

  /** The SSL certificate that can be used to encrypt connections between the endpoints and the replication instance.
    */
  @js.native
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

  object Certificate {
    @inline
    def apply(
        CertificateArn: js.UndefOr[String] = js.undefined,
        CertificateCreationDate: js.UndefOr[TStamp] = js.undefined,
        CertificateIdentifier: js.UndefOr[String] = js.undefined,
        CertificateOwner: js.UndefOr[String] = js.undefined,
        CertificatePem: js.UndefOr[String] = js.undefined,
        CertificateWallet: js.UndefOr[CertificateWallet] = js.undefined,
        KeyLength: js.UndefOr[IntegerOptional] = js.undefined,
        SigningAlgorithm: js.UndefOr[String] = js.undefined,
        ValidFromDate: js.UndefOr[TStamp] = js.undefined,
        ValidToDate: js.UndefOr[TStamp] = js.undefined
    ): Certificate = {
      val __obj = js.Dynamic.literal()
      CertificateArn.foreach(__v => __obj.updateDynamic("CertificateArn")(__v.asInstanceOf[js.Any]))
      CertificateCreationDate.foreach(__v => __obj.updateDynamic("CertificateCreationDate")(__v.asInstanceOf[js.Any]))
      CertificateIdentifier.foreach(__v => __obj.updateDynamic("CertificateIdentifier")(__v.asInstanceOf[js.Any]))
      CertificateOwner.foreach(__v => __obj.updateDynamic("CertificateOwner")(__v.asInstanceOf[js.Any]))
      CertificatePem.foreach(__v => __obj.updateDynamic("CertificatePem")(__v.asInstanceOf[js.Any]))
      CertificateWallet.foreach(__v => __obj.updateDynamic("CertificateWallet")(__v.asInstanceOf[js.Any]))
      KeyLength.foreach(__v => __obj.updateDynamic("KeyLength")(__v.asInstanceOf[js.Any]))
      SigningAlgorithm.foreach(__v => __obj.updateDynamic("SigningAlgorithm")(__v.asInstanceOf[js.Any]))
      ValidFromDate.foreach(__v => __obj.updateDynamic("ValidFromDate")(__v.asInstanceOf[js.Any]))
      ValidToDate.foreach(__v => __obj.updateDynamic("ValidToDate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Certificate]
    }
  }

  @js.native
  sealed trait CharLengthSemantics extends js.Any
  object CharLengthSemantics {
    val default = "default".asInstanceOf[CharLengthSemantics]
    val char = "char".asInstanceOf[CharLengthSemantics]
    val byte = "byte".asInstanceOf[CharLengthSemantics]

    @inline def values = js.Array(default, char, byte)
  }

  @js.native
  sealed trait CompressionTypeValue extends js.Any
  object CompressionTypeValue {
    val none = "none".asInstanceOf[CompressionTypeValue]
    val gzip = "gzip".asInstanceOf[CompressionTypeValue]

    @inline def values = js.Array(none, gzip)
  }

  /** Status of the connection between an endpoint and a replication instance, including Amazon Resource Names (ARNs) and the last error message issued.
    */
  @js.native
  trait Connection extends js.Object {
    var EndpointArn: js.UndefOr[String]
    var EndpointIdentifier: js.UndefOr[String]
    var LastFailureMessage: js.UndefOr[String]
    var ReplicationInstanceArn: js.UndefOr[String]
    var ReplicationInstanceIdentifier: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  object Connection {
    @inline
    def apply(
        EndpointArn: js.UndefOr[String] = js.undefined,
        EndpointIdentifier: js.UndefOr[String] = js.undefined,
        LastFailureMessage: js.UndefOr[String] = js.undefined,
        ReplicationInstanceArn: js.UndefOr[String] = js.undefined,
        ReplicationInstanceIdentifier: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[String] = js.undefined
    ): Connection = {
      val __obj = js.Dynamic.literal()
      EndpointArn.foreach(__v => __obj.updateDynamic("EndpointArn")(__v.asInstanceOf[js.Any]))
      EndpointIdentifier.foreach(__v => __obj.updateDynamic("EndpointIdentifier")(__v.asInstanceOf[js.Any]))
      LastFailureMessage.foreach(__v => __obj.updateDynamic("LastFailureMessage")(__v.asInstanceOf[js.Any]))
      ReplicationInstanceArn.foreach(__v => __obj.updateDynamic("ReplicationInstanceArn")(__v.asInstanceOf[js.Any]))
      ReplicationInstanceIdentifier.foreach(__v => __obj.updateDynamic("ReplicationInstanceIdentifier")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Connection]
    }
  }

  /** <p/>
    */
  @js.native
  trait CreateEndpointMessage extends js.Object {
    var EndpointIdentifier: String
    var EndpointType: ReplicationEndpointTypeValue
    var EngineName: String
    var CertificateArn: js.UndefOr[String]
    var DatabaseName: js.UndefOr[String]
    var DmsTransferSettings: js.UndefOr[DmsTransferSettings]
    var DocDbSettings: js.UndefOr[DocDbSettings]
    var DynamoDbSettings: js.UndefOr[DynamoDbSettings]
    var ElasticsearchSettings: js.UndefOr[ElasticsearchSettings]
    var ExternalTableDefinition: js.UndefOr[String]
    var ExtraConnectionAttributes: js.UndefOr[String]
    var IBMDb2Settings: js.UndefOr[IBMDb2Settings]
    var KafkaSettings: js.UndefOr[KafkaSettings]
    var KinesisSettings: js.UndefOr[KinesisSettings]
    var KmsKeyId: js.UndefOr[String]
    var MicrosoftSQLServerSettings: js.UndefOr[MicrosoftSQLServerSettings]
    var MongoDbSettings: js.UndefOr[MongoDbSettings]
    var MySQLSettings: js.UndefOr[MySQLSettings]
    var NeptuneSettings: js.UndefOr[NeptuneSettings]
    var OracleSettings: js.UndefOr[OracleSettings]
    var Password: js.UndefOr[SecretString]
    var Port: js.UndefOr[IntegerOptional]
    var PostgreSQLSettings: js.UndefOr[PostgreSQLSettings]
    var RedshiftSettings: js.UndefOr[RedshiftSettings]
    var ResourceIdentifier: js.UndefOr[String]
    var S3Settings: js.UndefOr[S3Settings]
    var ServerName: js.UndefOr[String]
    var ServiceAccessRoleArn: js.UndefOr[String]
    var SslMode: js.UndefOr[DmsSslModeValue]
    var SybaseSettings: js.UndefOr[SybaseSettings]
    var Tags: js.UndefOr[TagList]
    var Username: js.UndefOr[String]
  }

  object CreateEndpointMessage {
    @inline
    def apply(
        EndpointIdentifier: String,
        EndpointType: ReplicationEndpointTypeValue,
        EngineName: String,
        CertificateArn: js.UndefOr[String] = js.undefined,
        DatabaseName: js.UndefOr[String] = js.undefined,
        DmsTransferSettings: js.UndefOr[DmsTransferSettings] = js.undefined,
        DocDbSettings: js.UndefOr[DocDbSettings] = js.undefined,
        DynamoDbSettings: js.UndefOr[DynamoDbSettings] = js.undefined,
        ElasticsearchSettings: js.UndefOr[ElasticsearchSettings] = js.undefined,
        ExternalTableDefinition: js.UndefOr[String] = js.undefined,
        ExtraConnectionAttributes: js.UndefOr[String] = js.undefined,
        IBMDb2Settings: js.UndefOr[IBMDb2Settings] = js.undefined,
        KafkaSettings: js.UndefOr[KafkaSettings] = js.undefined,
        KinesisSettings: js.UndefOr[KinesisSettings] = js.undefined,
        KmsKeyId: js.UndefOr[String] = js.undefined,
        MicrosoftSQLServerSettings: js.UndefOr[MicrosoftSQLServerSettings] = js.undefined,
        MongoDbSettings: js.UndefOr[MongoDbSettings] = js.undefined,
        MySQLSettings: js.UndefOr[MySQLSettings] = js.undefined,
        NeptuneSettings: js.UndefOr[NeptuneSettings] = js.undefined,
        OracleSettings: js.UndefOr[OracleSettings] = js.undefined,
        Password: js.UndefOr[SecretString] = js.undefined,
        Port: js.UndefOr[IntegerOptional] = js.undefined,
        PostgreSQLSettings: js.UndefOr[PostgreSQLSettings] = js.undefined,
        RedshiftSettings: js.UndefOr[RedshiftSettings] = js.undefined,
        ResourceIdentifier: js.UndefOr[String] = js.undefined,
        S3Settings: js.UndefOr[S3Settings] = js.undefined,
        ServerName: js.UndefOr[String] = js.undefined,
        ServiceAccessRoleArn: js.UndefOr[String] = js.undefined,
        SslMode: js.UndefOr[DmsSslModeValue] = js.undefined,
        SybaseSettings: js.UndefOr[SybaseSettings] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        Username: js.UndefOr[String] = js.undefined
    ): CreateEndpointMessage = {
      val __obj = js.Dynamic.literal(
        "EndpointIdentifier" -> EndpointIdentifier.asInstanceOf[js.Any],
        "EndpointType" -> EndpointType.asInstanceOf[js.Any],
        "EngineName" -> EngineName.asInstanceOf[js.Any]
      )

      CertificateArn.foreach(__v => __obj.updateDynamic("CertificateArn")(__v.asInstanceOf[js.Any]))
      DatabaseName.foreach(__v => __obj.updateDynamic("DatabaseName")(__v.asInstanceOf[js.Any]))
      DmsTransferSettings.foreach(__v => __obj.updateDynamic("DmsTransferSettings")(__v.asInstanceOf[js.Any]))
      DocDbSettings.foreach(__v => __obj.updateDynamic("DocDbSettings")(__v.asInstanceOf[js.Any]))
      DynamoDbSettings.foreach(__v => __obj.updateDynamic("DynamoDbSettings")(__v.asInstanceOf[js.Any]))
      ElasticsearchSettings.foreach(__v => __obj.updateDynamic("ElasticsearchSettings")(__v.asInstanceOf[js.Any]))
      ExternalTableDefinition.foreach(__v => __obj.updateDynamic("ExternalTableDefinition")(__v.asInstanceOf[js.Any]))
      ExtraConnectionAttributes.foreach(__v => __obj.updateDynamic("ExtraConnectionAttributes")(__v.asInstanceOf[js.Any]))
      IBMDb2Settings.foreach(__v => __obj.updateDynamic("IBMDb2Settings")(__v.asInstanceOf[js.Any]))
      KafkaSettings.foreach(__v => __obj.updateDynamic("KafkaSettings")(__v.asInstanceOf[js.Any]))
      KinesisSettings.foreach(__v => __obj.updateDynamic("KinesisSettings")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      MicrosoftSQLServerSettings.foreach(__v => __obj.updateDynamic("MicrosoftSQLServerSettings")(__v.asInstanceOf[js.Any]))
      MongoDbSettings.foreach(__v => __obj.updateDynamic("MongoDbSettings")(__v.asInstanceOf[js.Any]))
      MySQLSettings.foreach(__v => __obj.updateDynamic("MySQLSettings")(__v.asInstanceOf[js.Any]))
      NeptuneSettings.foreach(__v => __obj.updateDynamic("NeptuneSettings")(__v.asInstanceOf[js.Any]))
      OracleSettings.foreach(__v => __obj.updateDynamic("OracleSettings")(__v.asInstanceOf[js.Any]))
      Password.foreach(__v => __obj.updateDynamic("Password")(__v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      PostgreSQLSettings.foreach(__v => __obj.updateDynamic("PostgreSQLSettings")(__v.asInstanceOf[js.Any]))
      RedshiftSettings.foreach(__v => __obj.updateDynamic("RedshiftSettings")(__v.asInstanceOf[js.Any]))
      ResourceIdentifier.foreach(__v => __obj.updateDynamic("ResourceIdentifier")(__v.asInstanceOf[js.Any]))
      S3Settings.foreach(__v => __obj.updateDynamic("S3Settings")(__v.asInstanceOf[js.Any]))
      ServerName.foreach(__v => __obj.updateDynamic("ServerName")(__v.asInstanceOf[js.Any]))
      ServiceAccessRoleArn.foreach(__v => __obj.updateDynamic("ServiceAccessRoleArn")(__v.asInstanceOf[js.Any]))
      SslMode.foreach(__v => __obj.updateDynamic("SslMode")(__v.asInstanceOf[js.Any]))
      SybaseSettings.foreach(__v => __obj.updateDynamic("SybaseSettings")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      Username.foreach(__v => __obj.updateDynamic("Username")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateEndpointMessage]
    }
  }

  /** <p/>
    */
  @js.native
  trait CreateEndpointResponse extends js.Object {
    var Endpoint: js.UndefOr[Endpoint]
  }

  object CreateEndpointResponse {
    @inline
    def apply(
        Endpoint: js.UndefOr[Endpoint] = js.undefined
    ): CreateEndpointResponse = {
      val __obj = js.Dynamic.literal()
      Endpoint.foreach(__v => __obj.updateDynamic("Endpoint")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateEndpointResponse]
    }
  }

  /** <p/>
    */
  @js.native
  trait CreateEventSubscriptionMessage extends js.Object {
    var SnsTopicArn: String
    var SubscriptionName: String
    var Enabled: js.UndefOr[BooleanOptional]
    var EventCategories: js.UndefOr[EventCategoriesList]
    var SourceIds: js.UndefOr[SourceIdsList]
    var SourceType: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  object CreateEventSubscriptionMessage {
    @inline
    def apply(
        SnsTopicArn: String,
        SubscriptionName: String,
        Enabled: js.UndefOr[BooleanOptional] = js.undefined,
        EventCategories: js.UndefOr[EventCategoriesList] = js.undefined,
        SourceIds: js.UndefOr[SourceIdsList] = js.undefined,
        SourceType: js.UndefOr[String] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateEventSubscriptionMessage = {
      val __obj = js.Dynamic.literal(
        "SnsTopicArn" -> SnsTopicArn.asInstanceOf[js.Any],
        "SubscriptionName" -> SubscriptionName.asInstanceOf[js.Any]
      )

      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      EventCategories.foreach(__v => __obj.updateDynamic("EventCategories")(__v.asInstanceOf[js.Any]))
      SourceIds.foreach(__v => __obj.updateDynamic("SourceIds")(__v.asInstanceOf[js.Any]))
      SourceType.foreach(__v => __obj.updateDynamic("SourceType")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateEventSubscriptionMessage]
    }
  }

  /** <p/>
    */
  @js.native
  trait CreateEventSubscriptionResponse extends js.Object {
    var EventSubscription: js.UndefOr[EventSubscription]
  }

  object CreateEventSubscriptionResponse {
    @inline
    def apply(
        EventSubscription: js.UndefOr[EventSubscription] = js.undefined
    ): CreateEventSubscriptionResponse = {
      val __obj = js.Dynamic.literal()
      EventSubscription.foreach(__v => __obj.updateDynamic("EventSubscription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateEventSubscriptionResponse]
    }
  }

  /** <p/>
    */
  @js.native
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
    var ResourceIdentifier: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
    var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList]
  }

  object CreateReplicationInstanceMessage {
    @inline
    def apply(
        ReplicationInstanceClass: String,
        ReplicationInstanceIdentifier: String,
        AllocatedStorage: js.UndefOr[IntegerOptional] = js.undefined,
        AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined,
        AvailabilityZone: js.UndefOr[String] = js.undefined,
        DnsNameServers: js.UndefOr[String] = js.undefined,
        EngineVersion: js.UndefOr[String] = js.undefined,
        KmsKeyId: js.UndefOr[String] = js.undefined,
        MultiAZ: js.UndefOr[BooleanOptional] = js.undefined,
        PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
        PubliclyAccessible: js.UndefOr[BooleanOptional] = js.undefined,
        ReplicationSubnetGroupIdentifier: js.UndefOr[String] = js.undefined,
        ResourceIdentifier: js.UndefOr[String] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
    ): CreateReplicationInstanceMessage = {
      val __obj = js.Dynamic.literal(
        "ReplicationInstanceClass" -> ReplicationInstanceClass.asInstanceOf[js.Any],
        "ReplicationInstanceIdentifier" -> ReplicationInstanceIdentifier.asInstanceOf[js.Any]
      )

      AllocatedStorage.foreach(__v => __obj.updateDynamic("AllocatedStorage")(__v.asInstanceOf[js.Any]))
      AutoMinorVersionUpgrade.foreach(__v => __obj.updateDynamic("AutoMinorVersionUpgrade")(__v.asInstanceOf[js.Any]))
      AvailabilityZone.foreach(__v => __obj.updateDynamic("AvailabilityZone")(__v.asInstanceOf[js.Any]))
      DnsNameServers.foreach(__v => __obj.updateDynamic("DnsNameServers")(__v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      MultiAZ.foreach(__v => __obj.updateDynamic("MultiAZ")(__v.asInstanceOf[js.Any]))
      PreferredMaintenanceWindow.foreach(__v => __obj.updateDynamic("PreferredMaintenanceWindow")(__v.asInstanceOf[js.Any]))
      PubliclyAccessible.foreach(__v => __obj.updateDynamic("PubliclyAccessible")(__v.asInstanceOf[js.Any]))
      ReplicationSubnetGroupIdentifier.foreach(__v => __obj.updateDynamic("ReplicationSubnetGroupIdentifier")(__v.asInstanceOf[js.Any]))
      ResourceIdentifier.foreach(__v => __obj.updateDynamic("ResourceIdentifier")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      VpcSecurityGroupIds.foreach(__v => __obj.updateDynamic("VpcSecurityGroupIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateReplicationInstanceMessage]
    }
  }

  /** <p/>
    */
  @js.native
  trait CreateReplicationInstanceResponse extends js.Object {
    var ReplicationInstance: js.UndefOr[ReplicationInstance]
  }

  object CreateReplicationInstanceResponse {
    @inline
    def apply(
        ReplicationInstance: js.UndefOr[ReplicationInstance] = js.undefined
    ): CreateReplicationInstanceResponse = {
      val __obj = js.Dynamic.literal()
      ReplicationInstance.foreach(__v => __obj.updateDynamic("ReplicationInstance")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateReplicationInstanceResponse]
    }
  }

  /** <p/>
    */
  @js.native
  trait CreateReplicationSubnetGroupMessage extends js.Object {
    var ReplicationSubnetGroupDescription: String
    var ReplicationSubnetGroupIdentifier: String
    var SubnetIds: SubnetIdentifierList
    var Tags: js.UndefOr[TagList]
  }

  object CreateReplicationSubnetGroupMessage {
    @inline
    def apply(
        ReplicationSubnetGroupDescription: String,
        ReplicationSubnetGroupIdentifier: String,
        SubnetIds: SubnetIdentifierList,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateReplicationSubnetGroupMessage = {
      val __obj = js.Dynamic.literal(
        "ReplicationSubnetGroupDescription" -> ReplicationSubnetGroupDescription.asInstanceOf[js.Any],
        "ReplicationSubnetGroupIdentifier" -> ReplicationSubnetGroupIdentifier.asInstanceOf[js.Any],
        "SubnetIds" -> SubnetIds.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateReplicationSubnetGroupMessage]
    }
  }

  /** <p/>
    */
  @js.native
  trait CreateReplicationSubnetGroupResponse extends js.Object {
    var ReplicationSubnetGroup: js.UndefOr[ReplicationSubnetGroup]
  }

  object CreateReplicationSubnetGroupResponse {
    @inline
    def apply(
        ReplicationSubnetGroup: js.UndefOr[ReplicationSubnetGroup] = js.undefined
    ): CreateReplicationSubnetGroupResponse = {
      val __obj = js.Dynamic.literal()
      ReplicationSubnetGroup.foreach(__v => __obj.updateDynamic("ReplicationSubnetGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateReplicationSubnetGroupResponse]
    }
  }

  /** <p/>
    */
  @js.native
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
    var ResourceIdentifier: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
    var TaskData: js.UndefOr[String]
  }

  object CreateReplicationTaskMessage {
    @inline
    def apply(
        MigrationType: MigrationTypeValue,
        ReplicationInstanceArn: String,
        ReplicationTaskIdentifier: String,
        SourceEndpointArn: String,
        TableMappings: String,
        TargetEndpointArn: String,
        CdcStartPosition: js.UndefOr[String] = js.undefined,
        CdcStartTime: js.UndefOr[TStamp] = js.undefined,
        CdcStopPosition: js.UndefOr[String] = js.undefined,
        ReplicationTaskSettings: js.UndefOr[String] = js.undefined,
        ResourceIdentifier: js.UndefOr[String] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        TaskData: js.UndefOr[String] = js.undefined
    ): CreateReplicationTaskMessage = {
      val __obj = js.Dynamic.literal(
        "MigrationType" -> MigrationType.asInstanceOf[js.Any],
        "ReplicationInstanceArn" -> ReplicationInstanceArn.asInstanceOf[js.Any],
        "ReplicationTaskIdentifier" -> ReplicationTaskIdentifier.asInstanceOf[js.Any],
        "SourceEndpointArn" -> SourceEndpointArn.asInstanceOf[js.Any],
        "TableMappings" -> TableMappings.asInstanceOf[js.Any],
        "TargetEndpointArn" -> TargetEndpointArn.asInstanceOf[js.Any]
      )

      CdcStartPosition.foreach(__v => __obj.updateDynamic("CdcStartPosition")(__v.asInstanceOf[js.Any]))
      CdcStartTime.foreach(__v => __obj.updateDynamic("CdcStartTime")(__v.asInstanceOf[js.Any]))
      CdcStopPosition.foreach(__v => __obj.updateDynamic("CdcStopPosition")(__v.asInstanceOf[js.Any]))
      ReplicationTaskSettings.foreach(__v => __obj.updateDynamic("ReplicationTaskSettings")(__v.asInstanceOf[js.Any]))
      ResourceIdentifier.foreach(__v => __obj.updateDynamic("ResourceIdentifier")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TaskData.foreach(__v => __obj.updateDynamic("TaskData")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateReplicationTaskMessage]
    }
  }

  /** <p/>
    */
  @js.native
  trait CreateReplicationTaskResponse extends js.Object {
    var ReplicationTask: js.UndefOr[ReplicationTask]
  }

  object CreateReplicationTaskResponse {
    @inline
    def apply(
        ReplicationTask: js.UndefOr[ReplicationTask] = js.undefined
    ): CreateReplicationTaskResponse = {
      val __obj = js.Dynamic.literal()
      ReplicationTask.foreach(__v => __obj.updateDynamic("ReplicationTask")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateReplicationTaskResponse]
    }
  }

  @js.native
  sealed trait DataFormatValue extends js.Any
  object DataFormatValue {
    val csv = "csv".asInstanceOf[DataFormatValue]
    val parquet = "parquet".asInstanceOf[DataFormatValue]

    @inline def values = js.Array(csv, parquet)
  }

  @js.native
  sealed trait DatePartitionDelimiterValue extends js.Any
  object DatePartitionDelimiterValue {
    val SLASH = "SLASH".asInstanceOf[DatePartitionDelimiterValue]
    val UNDERSCORE = "UNDERSCORE".asInstanceOf[DatePartitionDelimiterValue]
    val DASH = "DASH".asInstanceOf[DatePartitionDelimiterValue]
    val NONE = "NONE".asInstanceOf[DatePartitionDelimiterValue]

    @inline def values = js.Array(SLASH, UNDERSCORE, DASH, NONE)
  }

  @js.native
  sealed trait DatePartitionSequenceValue extends js.Any
  object DatePartitionSequenceValue {
    val YYYYMMDD = "YYYYMMDD".asInstanceOf[DatePartitionSequenceValue]
    val YYYYMMDDHH = "YYYYMMDDHH".asInstanceOf[DatePartitionSequenceValue]
    val YYYYMM = "YYYYMM".asInstanceOf[DatePartitionSequenceValue]
    val MMYYYYDD = "MMYYYYDD".asInstanceOf[DatePartitionSequenceValue]
    val DDMMYYYY = "DDMMYYYY".asInstanceOf[DatePartitionSequenceValue]

    @inline def values = js.Array(YYYYMMDD, YYYYMMDDHH, YYYYMM, MMYYYYDD, DDMMYYYY)
  }

  @js.native
  trait DeleteCertificateMessage extends js.Object {
    var CertificateArn: String
  }

  object DeleteCertificateMessage {
    @inline
    def apply(
        CertificateArn: String
    ): DeleteCertificateMessage = {
      val __obj = js.Dynamic.literal(
        "CertificateArn" -> CertificateArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteCertificateMessage]
    }
  }

  @js.native
  trait DeleteCertificateResponse extends js.Object {
    var Certificate: js.UndefOr[Certificate]
  }

  object DeleteCertificateResponse {
    @inline
    def apply(
        Certificate: js.UndefOr[Certificate] = js.undefined
    ): DeleteCertificateResponse = {
      val __obj = js.Dynamic.literal()
      Certificate.foreach(__v => __obj.updateDynamic("Certificate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteCertificateResponse]
    }
  }

  /** <p/>
    */
  @js.native
  trait DeleteConnectionMessage extends js.Object {
    var EndpointArn: String
    var ReplicationInstanceArn: String
  }

  object DeleteConnectionMessage {
    @inline
    def apply(
        EndpointArn: String,
        ReplicationInstanceArn: String
    ): DeleteConnectionMessage = {
      val __obj = js.Dynamic.literal(
        "EndpointArn" -> EndpointArn.asInstanceOf[js.Any],
        "ReplicationInstanceArn" -> ReplicationInstanceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteConnectionMessage]
    }
  }

  /** <p/>
    */
  @js.native
  trait DeleteConnectionResponse extends js.Object {
    var Connection: js.UndefOr[Connection]
  }

  object DeleteConnectionResponse {
    @inline
    def apply(
        Connection: js.UndefOr[Connection] = js.undefined
    ): DeleteConnectionResponse = {
      val __obj = js.Dynamic.literal()
      Connection.foreach(__v => __obj.updateDynamic("Connection")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteConnectionResponse]
    }
  }

  /** <p/>
    */
  @js.native
  trait DeleteEndpointMessage extends js.Object {
    var EndpointArn: String
  }

  object DeleteEndpointMessage {
    @inline
    def apply(
        EndpointArn: String
    ): DeleteEndpointMessage = {
      val __obj = js.Dynamic.literal(
        "EndpointArn" -> EndpointArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteEndpointMessage]
    }
  }

  /** <p/>
    */
  @js.native
  trait DeleteEndpointResponse extends js.Object {
    var Endpoint: js.UndefOr[Endpoint]
  }

  object DeleteEndpointResponse {
    @inline
    def apply(
        Endpoint: js.UndefOr[Endpoint] = js.undefined
    ): DeleteEndpointResponse = {
      val __obj = js.Dynamic.literal()
      Endpoint.foreach(__v => __obj.updateDynamic("Endpoint")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteEndpointResponse]
    }
  }

  /** <p/>
    */
  @js.native
  trait DeleteEventSubscriptionMessage extends js.Object {
    var SubscriptionName: String
  }

  object DeleteEventSubscriptionMessage {
    @inline
    def apply(
        SubscriptionName: String
    ): DeleteEventSubscriptionMessage = {
      val __obj = js.Dynamic.literal(
        "SubscriptionName" -> SubscriptionName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteEventSubscriptionMessage]
    }
  }

  /** <p/>
    */
  @js.native
  trait DeleteEventSubscriptionResponse extends js.Object {
    var EventSubscription: js.UndefOr[EventSubscription]
  }

  object DeleteEventSubscriptionResponse {
    @inline
    def apply(
        EventSubscription: js.UndefOr[EventSubscription] = js.undefined
    ): DeleteEventSubscriptionResponse = {
      val __obj = js.Dynamic.literal()
      EventSubscription.foreach(__v => __obj.updateDynamic("EventSubscription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteEventSubscriptionResponse]
    }
  }

  /** <p/>
    */
  @js.native
  trait DeleteReplicationInstanceMessage extends js.Object {
    var ReplicationInstanceArn: String
  }

  object DeleteReplicationInstanceMessage {
    @inline
    def apply(
        ReplicationInstanceArn: String
    ): DeleteReplicationInstanceMessage = {
      val __obj = js.Dynamic.literal(
        "ReplicationInstanceArn" -> ReplicationInstanceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteReplicationInstanceMessage]
    }
  }

  /** <p/>
    */
  @js.native
  trait DeleteReplicationInstanceResponse extends js.Object {
    var ReplicationInstance: js.UndefOr[ReplicationInstance]
  }

  object DeleteReplicationInstanceResponse {
    @inline
    def apply(
        ReplicationInstance: js.UndefOr[ReplicationInstance] = js.undefined
    ): DeleteReplicationInstanceResponse = {
      val __obj = js.Dynamic.literal()
      ReplicationInstance.foreach(__v => __obj.updateDynamic("ReplicationInstance")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteReplicationInstanceResponse]
    }
  }

  /** <p/>
    */
  @js.native
  trait DeleteReplicationSubnetGroupMessage extends js.Object {
    var ReplicationSubnetGroupIdentifier: String
  }

  object DeleteReplicationSubnetGroupMessage {
    @inline
    def apply(
        ReplicationSubnetGroupIdentifier: String
    ): DeleteReplicationSubnetGroupMessage = {
      val __obj = js.Dynamic.literal(
        "ReplicationSubnetGroupIdentifier" -> ReplicationSubnetGroupIdentifier.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteReplicationSubnetGroupMessage]
    }
  }

  /** <p/>
    */
  @js.native
  trait DeleteReplicationSubnetGroupResponse extends js.Object

  object DeleteReplicationSubnetGroupResponse {
    @inline
    def apply(): DeleteReplicationSubnetGroupResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteReplicationSubnetGroupResponse]
    }
  }

  /** <p/>
    */
  @js.native
  trait DeleteReplicationTaskAssessmentRunMessage extends js.Object {
    var ReplicationTaskAssessmentRunArn: String
  }

  object DeleteReplicationTaskAssessmentRunMessage {
    @inline
    def apply(
        ReplicationTaskAssessmentRunArn: String
    ): DeleteReplicationTaskAssessmentRunMessage = {
      val __obj = js.Dynamic.literal(
        "ReplicationTaskAssessmentRunArn" -> ReplicationTaskAssessmentRunArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteReplicationTaskAssessmentRunMessage]
    }
  }

  /** <p/>
    */
  @js.native
  trait DeleteReplicationTaskAssessmentRunResponse extends js.Object {
    var ReplicationTaskAssessmentRun: js.UndefOr[ReplicationTaskAssessmentRun]
  }

  object DeleteReplicationTaskAssessmentRunResponse {
    @inline
    def apply(
        ReplicationTaskAssessmentRun: js.UndefOr[ReplicationTaskAssessmentRun] = js.undefined
    ): DeleteReplicationTaskAssessmentRunResponse = {
      val __obj = js.Dynamic.literal()
      ReplicationTaskAssessmentRun.foreach(__v => __obj.updateDynamic("ReplicationTaskAssessmentRun")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteReplicationTaskAssessmentRunResponse]
    }
  }

  /** <p/>
    */
  @js.native
  trait DeleteReplicationTaskMessage extends js.Object {
    var ReplicationTaskArn: String
  }

  object DeleteReplicationTaskMessage {
    @inline
    def apply(
        ReplicationTaskArn: String
    ): DeleteReplicationTaskMessage = {
      val __obj = js.Dynamic.literal(
        "ReplicationTaskArn" -> ReplicationTaskArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteReplicationTaskMessage]
    }
  }

  /** <p/>
    */
  @js.native
  trait DeleteReplicationTaskResponse extends js.Object {
    var ReplicationTask: js.UndefOr[ReplicationTask]
  }

  object DeleteReplicationTaskResponse {
    @inline
    def apply(
        ReplicationTask: js.UndefOr[ReplicationTask] = js.undefined
    ): DeleteReplicationTaskResponse = {
      val __obj = js.Dynamic.literal()
      ReplicationTask.foreach(__v => __obj.updateDynamic("ReplicationTask")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteReplicationTaskResponse]
    }
  }

  /** <p/>
    */
  @js.native
  trait DescribeAccountAttributesMessage extends js.Object

  object DescribeAccountAttributesMessage {
    @inline
    def apply(): DescribeAccountAttributesMessage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DescribeAccountAttributesMessage]
    }
  }

  /** <p/>
    */
  @js.native
  trait DescribeAccountAttributesResponse extends js.Object {
    var AccountQuotas: js.UndefOr[AccountQuotaList]
    var UniqueAccountIdentifier: js.UndefOr[String]
  }

  object DescribeAccountAttributesResponse {
    @inline
    def apply(
        AccountQuotas: js.UndefOr[AccountQuotaList] = js.undefined,
        UniqueAccountIdentifier: js.UndefOr[String] = js.undefined
    ): DescribeAccountAttributesResponse = {
      val __obj = js.Dynamic.literal()
      AccountQuotas.foreach(__v => __obj.updateDynamic("AccountQuotas")(__v.asInstanceOf[js.Any]))
      UniqueAccountIdentifier.foreach(__v => __obj.updateDynamic("UniqueAccountIdentifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAccountAttributesResponse]
    }
  }

  /** <p/>
    */
  @js.native
  trait DescribeApplicableIndividualAssessmentsMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var MigrationType: js.UndefOr[MigrationTypeValue]
    var ReplicationInstanceArn: js.UndefOr[String]
    var ReplicationTaskArn: js.UndefOr[String]
    var SourceEngineName: js.UndefOr[String]
    var TargetEngineName: js.UndefOr[String]
  }

  object DescribeApplicableIndividualAssessmentsMessage {
    @inline
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
        MigrationType: js.UndefOr[MigrationTypeValue] = js.undefined,
        ReplicationInstanceArn: js.UndefOr[String] = js.undefined,
        ReplicationTaskArn: js.UndefOr[String] = js.undefined,
        SourceEngineName: js.UndefOr[String] = js.undefined,
        TargetEngineName: js.UndefOr[String] = js.undefined
    ): DescribeApplicableIndividualAssessmentsMessage = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      MigrationType.foreach(__v => __obj.updateDynamic("MigrationType")(__v.asInstanceOf[js.Any]))
      ReplicationInstanceArn.foreach(__v => __obj.updateDynamic("ReplicationInstanceArn")(__v.asInstanceOf[js.Any]))
      ReplicationTaskArn.foreach(__v => __obj.updateDynamic("ReplicationTaskArn")(__v.asInstanceOf[js.Any]))
      SourceEngineName.foreach(__v => __obj.updateDynamic("SourceEngineName")(__v.asInstanceOf[js.Any]))
      TargetEngineName.foreach(__v => __obj.updateDynamic("TargetEngineName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeApplicableIndividualAssessmentsMessage]
    }
  }

  /** <p/>
    */
  @js.native
  trait DescribeApplicableIndividualAssessmentsResponse extends js.Object {
    var IndividualAssessmentNames: js.UndefOr[IndividualAssessmentNameList]
    var Marker: js.UndefOr[String]
  }

  object DescribeApplicableIndividualAssessmentsResponse {
    @inline
    def apply(
        IndividualAssessmentNames: js.UndefOr[IndividualAssessmentNameList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined
    ): DescribeApplicableIndividualAssessmentsResponse = {
      val __obj = js.Dynamic.literal()
      IndividualAssessmentNames.foreach(__v => __obj.updateDynamic("IndividualAssessmentNames")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeApplicableIndividualAssessmentsResponse]
    }
  }

  @js.native
  trait DescribeCertificatesMessage extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  object DescribeCertificatesMessage {
    @inline
    def apply(
        Filters: js.UndefOr[FilterList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    ): DescribeCertificatesMessage = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeCertificatesMessage]
    }
  }

  @js.native
  trait DescribeCertificatesResponse extends js.Object {
    var Certificates: js.UndefOr[CertificateList]
    var Marker: js.UndefOr[String]
  }

  object DescribeCertificatesResponse {
    @inline
    def apply(
        Certificates: js.UndefOr[CertificateList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined
    ): DescribeCertificatesResponse = {
      val __obj = js.Dynamic.literal()
      Certificates.foreach(__v => __obj.updateDynamic("Certificates")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeCertificatesResponse]
    }
  }

  /** <p/>
    */
  @js.native
  trait DescribeConnectionsMessage extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  object DescribeConnectionsMessage {
    @inline
    def apply(
        Filters: js.UndefOr[FilterList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    ): DescribeConnectionsMessage = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeConnectionsMessage]
    }
  }

  /** <p/>
    */
  @js.native
  trait DescribeConnectionsResponse extends js.Object {
    var Connections: js.UndefOr[ConnectionList]
    var Marker: js.UndefOr[String]
  }

  object DescribeConnectionsResponse {
    @inline
    def apply(
        Connections: js.UndefOr[ConnectionList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined
    ): DescribeConnectionsResponse = {
      val __obj = js.Dynamic.literal()
      Connections.foreach(__v => __obj.updateDynamic("Connections")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeConnectionsResponse]
    }
  }

  /** <p/>
    */
  @js.native
  trait DescribeEndpointTypesMessage extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  object DescribeEndpointTypesMessage {
    @inline
    def apply(
        Filters: js.UndefOr[FilterList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    ): DescribeEndpointTypesMessage = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEndpointTypesMessage]
    }
  }

  /** <p/>
    */
  @js.native
  trait DescribeEndpointTypesResponse extends js.Object {
    var Marker: js.UndefOr[String]
    var SupportedEndpointTypes: js.UndefOr[SupportedEndpointTypeList]
  }

  object DescribeEndpointTypesResponse {
    @inline
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        SupportedEndpointTypes: js.UndefOr[SupportedEndpointTypeList] = js.undefined
    ): DescribeEndpointTypesResponse = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      SupportedEndpointTypes.foreach(__v => __obj.updateDynamic("SupportedEndpointTypes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEndpointTypesResponse]
    }
  }

  /** <p/>
    */
  @js.native
  trait DescribeEndpointsMessage extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  object DescribeEndpointsMessage {
    @inline
    def apply(
        Filters: js.UndefOr[FilterList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    ): DescribeEndpointsMessage = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEndpointsMessage]
    }
  }

  /** <p/>
    */
  @js.native
  trait DescribeEndpointsResponse extends js.Object {
    var Endpoints: js.UndefOr[EndpointList]
    var Marker: js.UndefOr[String]
  }

  object DescribeEndpointsResponse {
    @inline
    def apply(
        Endpoints: js.UndefOr[EndpointList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined
    ): DescribeEndpointsResponse = {
      val __obj = js.Dynamic.literal()
      Endpoints.foreach(__v => __obj.updateDynamic("Endpoints")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEndpointsResponse]
    }
  }

  /** <p/>
    */
  @js.native
  trait DescribeEventCategoriesMessage extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var SourceType: js.UndefOr[String]
  }

  object DescribeEventCategoriesMessage {
    @inline
    def apply(
        Filters: js.UndefOr[FilterList] = js.undefined,
        SourceType: js.UndefOr[String] = js.undefined
    ): DescribeEventCategoriesMessage = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      SourceType.foreach(__v => __obj.updateDynamic("SourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEventCategoriesMessage]
    }
  }

  /** <p/>
    */
  @js.native
  trait DescribeEventCategoriesResponse extends js.Object {
    var EventCategoryGroupList: js.UndefOr[EventCategoryGroupList]
  }

  object DescribeEventCategoriesResponse {
    @inline
    def apply(
        EventCategoryGroupList: js.UndefOr[EventCategoryGroupList] = js.undefined
    ): DescribeEventCategoriesResponse = {
      val __obj = js.Dynamic.literal()
      EventCategoryGroupList.foreach(__v => __obj.updateDynamic("EventCategoryGroupList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEventCategoriesResponse]
    }
  }

  /** <p/>
    */
  @js.native
  trait DescribeEventSubscriptionsMessage extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var SubscriptionName: js.UndefOr[String]
  }

  object DescribeEventSubscriptionsMessage {
    @inline
    def apply(
        Filters: js.UndefOr[FilterList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
        SubscriptionName: js.UndefOr[String] = js.undefined
    ): DescribeEventSubscriptionsMessage = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      SubscriptionName.foreach(__v => __obj.updateDynamic("SubscriptionName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEventSubscriptionsMessage]
    }
  }

  /** <p/>
    */
  @js.native
  trait DescribeEventSubscriptionsResponse extends js.Object {
    var EventSubscriptionsList: js.UndefOr[EventSubscriptionsList]
    var Marker: js.UndefOr[String]
  }

  object DescribeEventSubscriptionsResponse {
    @inline
    def apply(
        EventSubscriptionsList: js.UndefOr[EventSubscriptionsList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined
    ): DescribeEventSubscriptionsResponse = {
      val __obj = js.Dynamic.literal()
      EventSubscriptionsList.foreach(__v => __obj.updateDynamic("EventSubscriptionsList")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEventSubscriptionsResponse]
    }
  }

  /** <p/>
    */
  @js.native
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

  object DescribeEventsMessage {
    @inline
    def apply(
        Duration: js.UndefOr[IntegerOptional] = js.undefined,
        EndTime: js.UndefOr[TStamp] = js.undefined,
        EventCategories: js.UndefOr[EventCategoriesList] = js.undefined,
        Filters: js.UndefOr[FilterList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
        SourceIdentifier: js.UndefOr[String] = js.undefined,
        SourceType: js.UndefOr[SourceType] = js.undefined,
        StartTime: js.UndefOr[TStamp] = js.undefined
    ): DescribeEventsMessage = {
      val __obj = js.Dynamic.literal()
      Duration.foreach(__v => __obj.updateDynamic("Duration")(__v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      EventCategories.foreach(__v => __obj.updateDynamic("EventCategories")(__v.asInstanceOf[js.Any]))
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      SourceIdentifier.foreach(__v => __obj.updateDynamic("SourceIdentifier")(__v.asInstanceOf[js.Any]))
      SourceType.foreach(__v => __obj.updateDynamic("SourceType")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEventsMessage]
    }
  }

  /** <p/>
    */
  @js.native
  trait DescribeEventsResponse extends js.Object {
    var Events: js.UndefOr[EventList]
    var Marker: js.UndefOr[String]
  }

  object DescribeEventsResponse {
    @inline
    def apply(
        Events: js.UndefOr[EventList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined
    ): DescribeEventsResponse = {
      val __obj = js.Dynamic.literal()
      Events.foreach(__v => __obj.updateDynamic("Events")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEventsResponse]
    }
  }

  /** <p/>
    */
  @js.native
  trait DescribeOrderableReplicationInstancesMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  object DescribeOrderableReplicationInstancesMessage {
    @inline
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    ): DescribeOrderableReplicationInstancesMessage = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeOrderableReplicationInstancesMessage]
    }
  }

  /** <p/>
    */
  @js.native
  trait DescribeOrderableReplicationInstancesResponse extends js.Object {
    var Marker: js.UndefOr[String]
    var OrderableReplicationInstances: js.UndefOr[OrderableReplicationInstanceList]
  }

  object DescribeOrderableReplicationInstancesResponse {
    @inline
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        OrderableReplicationInstances: js.UndefOr[OrderableReplicationInstanceList] = js.undefined
    ): DescribeOrderableReplicationInstancesResponse = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      OrderableReplicationInstances.foreach(__v => __obj.updateDynamic("OrderableReplicationInstances")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeOrderableReplicationInstancesResponse]
    }
  }

  /** <p/>
    */
  @js.native
  trait DescribePendingMaintenanceActionsMessage extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var ReplicationInstanceArn: js.UndefOr[String]
  }

  object DescribePendingMaintenanceActionsMessage {
    @inline
    def apply(
        Filters: js.UndefOr[FilterList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
        ReplicationInstanceArn: js.UndefOr[String] = js.undefined
    ): DescribePendingMaintenanceActionsMessage = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      ReplicationInstanceArn.foreach(__v => __obj.updateDynamic("ReplicationInstanceArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePendingMaintenanceActionsMessage]
    }
  }

  /** <p/>
    */
  @js.native
  trait DescribePendingMaintenanceActionsResponse extends js.Object {
    var Marker: js.UndefOr[String]
    var PendingMaintenanceActions: js.UndefOr[PendingMaintenanceActions]
  }

  object DescribePendingMaintenanceActionsResponse {
    @inline
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        PendingMaintenanceActions: js.UndefOr[PendingMaintenanceActions] = js.undefined
    ): DescribePendingMaintenanceActionsResponse = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      PendingMaintenanceActions.foreach(__v => __obj.updateDynamic("PendingMaintenanceActions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePendingMaintenanceActionsResponse]
    }
  }

  /** <p/>
    */
  @js.native
  trait DescribeRefreshSchemasStatusMessage extends js.Object {
    var EndpointArn: String
  }

  object DescribeRefreshSchemasStatusMessage {
    @inline
    def apply(
        EndpointArn: String
    ): DescribeRefreshSchemasStatusMessage = {
      val __obj = js.Dynamic.literal(
        "EndpointArn" -> EndpointArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeRefreshSchemasStatusMessage]
    }
  }

  /** <p/>
    */
  @js.native
  trait DescribeRefreshSchemasStatusResponse extends js.Object {
    var RefreshSchemasStatus: js.UndefOr[RefreshSchemasStatus]
  }

  object DescribeRefreshSchemasStatusResponse {
    @inline
    def apply(
        RefreshSchemasStatus: js.UndefOr[RefreshSchemasStatus] = js.undefined
    ): DescribeRefreshSchemasStatusResponse = {
      val __obj = js.Dynamic.literal()
      RefreshSchemasStatus.foreach(__v => __obj.updateDynamic("RefreshSchemasStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRefreshSchemasStatusResponse]
    }
  }

  @js.native
  trait DescribeReplicationInstanceTaskLogsMessage extends js.Object {
    var ReplicationInstanceArn: String
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  object DescribeReplicationInstanceTaskLogsMessage {
    @inline
    def apply(
        ReplicationInstanceArn: String,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    ): DescribeReplicationInstanceTaskLogsMessage = {
      val __obj = js.Dynamic.literal(
        "ReplicationInstanceArn" -> ReplicationInstanceArn.asInstanceOf[js.Any]
      )

      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeReplicationInstanceTaskLogsMessage]
    }
  }

  @js.native
  trait DescribeReplicationInstanceTaskLogsResponse extends js.Object {
    var Marker: js.UndefOr[String]
    var ReplicationInstanceArn: js.UndefOr[String]
    var ReplicationInstanceTaskLogs: js.UndefOr[ReplicationInstanceTaskLogsList]
  }

  object DescribeReplicationInstanceTaskLogsResponse {
    @inline
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        ReplicationInstanceArn: js.UndefOr[String] = js.undefined,
        ReplicationInstanceTaskLogs: js.UndefOr[ReplicationInstanceTaskLogsList] = js.undefined
    ): DescribeReplicationInstanceTaskLogsResponse = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      ReplicationInstanceArn.foreach(__v => __obj.updateDynamic("ReplicationInstanceArn")(__v.asInstanceOf[js.Any]))
      ReplicationInstanceTaskLogs.foreach(__v => __obj.updateDynamic("ReplicationInstanceTaskLogs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeReplicationInstanceTaskLogsResponse]
    }
  }

  /** <p/>
    */
  @js.native
  trait DescribeReplicationInstancesMessage extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  object DescribeReplicationInstancesMessage {
    @inline
    def apply(
        Filters: js.UndefOr[FilterList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    ): DescribeReplicationInstancesMessage = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeReplicationInstancesMessage]
    }
  }

  /** <p/>
    */
  @js.native
  trait DescribeReplicationInstancesResponse extends js.Object {
    var Marker: js.UndefOr[String]
    var ReplicationInstances: js.UndefOr[ReplicationInstanceList]
  }

  object DescribeReplicationInstancesResponse {
    @inline
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        ReplicationInstances: js.UndefOr[ReplicationInstanceList] = js.undefined
    ): DescribeReplicationInstancesResponse = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      ReplicationInstances.foreach(__v => __obj.updateDynamic("ReplicationInstances")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeReplicationInstancesResponse]
    }
  }

  /** <p/>
    */
  @js.native
  trait DescribeReplicationSubnetGroupsMessage extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  object DescribeReplicationSubnetGroupsMessage {
    @inline
    def apply(
        Filters: js.UndefOr[FilterList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    ): DescribeReplicationSubnetGroupsMessage = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeReplicationSubnetGroupsMessage]
    }
  }

  /** <p/>
    */
  @js.native
  trait DescribeReplicationSubnetGroupsResponse extends js.Object {
    var Marker: js.UndefOr[String]
    var ReplicationSubnetGroups: js.UndefOr[ReplicationSubnetGroups]
  }

  object DescribeReplicationSubnetGroupsResponse {
    @inline
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        ReplicationSubnetGroups: js.UndefOr[ReplicationSubnetGroups] = js.undefined
    ): DescribeReplicationSubnetGroupsResponse = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      ReplicationSubnetGroups.foreach(__v => __obj.updateDynamic("ReplicationSubnetGroups")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeReplicationSubnetGroupsResponse]
    }
  }

  /** <p/>
    */
  @js.native
  trait DescribeReplicationTaskAssessmentResultsMessage extends js.Object {
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var ReplicationTaskArn: js.UndefOr[String]
  }

  object DescribeReplicationTaskAssessmentResultsMessage {
    @inline
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
        ReplicationTaskArn: js.UndefOr[String] = js.undefined
    ): DescribeReplicationTaskAssessmentResultsMessage = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      ReplicationTaskArn.foreach(__v => __obj.updateDynamic("ReplicationTaskArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeReplicationTaskAssessmentResultsMessage]
    }
  }

  /** <p/>
    */
  @js.native
  trait DescribeReplicationTaskAssessmentResultsResponse extends js.Object {
    var BucketName: js.UndefOr[String]
    var Marker: js.UndefOr[String]
    var ReplicationTaskAssessmentResults: js.UndefOr[ReplicationTaskAssessmentResultList]
  }

  object DescribeReplicationTaskAssessmentResultsResponse {
    @inline
    def apply(
        BucketName: js.UndefOr[String] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        ReplicationTaskAssessmentResults: js.UndefOr[ReplicationTaskAssessmentResultList] = js.undefined
    ): DescribeReplicationTaskAssessmentResultsResponse = {
      val __obj = js.Dynamic.literal()
      BucketName.foreach(__v => __obj.updateDynamic("BucketName")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      ReplicationTaskAssessmentResults.foreach(__v => __obj.updateDynamic("ReplicationTaskAssessmentResults")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeReplicationTaskAssessmentResultsResponse]
    }
  }

  /** <p/>
    */
  @js.native
  trait DescribeReplicationTaskAssessmentRunsMessage extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  object DescribeReplicationTaskAssessmentRunsMessage {
    @inline
    def apply(
        Filters: js.UndefOr[FilterList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    ): DescribeReplicationTaskAssessmentRunsMessage = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeReplicationTaskAssessmentRunsMessage]
    }
  }

  /** <p/>
    */
  @js.native
  trait DescribeReplicationTaskAssessmentRunsResponse extends js.Object {
    var Marker: js.UndefOr[String]
    var ReplicationTaskAssessmentRuns: js.UndefOr[ReplicationTaskAssessmentRunList]
  }

  object DescribeReplicationTaskAssessmentRunsResponse {
    @inline
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        ReplicationTaskAssessmentRuns: js.UndefOr[ReplicationTaskAssessmentRunList] = js.undefined
    ): DescribeReplicationTaskAssessmentRunsResponse = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      ReplicationTaskAssessmentRuns.foreach(__v => __obj.updateDynamic("ReplicationTaskAssessmentRuns")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeReplicationTaskAssessmentRunsResponse]
    }
  }

  /** <p/>
    */
  @js.native
  trait DescribeReplicationTaskIndividualAssessmentsMessage extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  object DescribeReplicationTaskIndividualAssessmentsMessage {
    @inline
    def apply(
        Filters: js.UndefOr[FilterList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    ): DescribeReplicationTaskIndividualAssessmentsMessage = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeReplicationTaskIndividualAssessmentsMessage]
    }
  }

  /** <p/>
    */
  @js.native
  trait DescribeReplicationTaskIndividualAssessmentsResponse extends js.Object {
    var Marker: js.UndefOr[String]
    var ReplicationTaskIndividualAssessments: js.UndefOr[ReplicationTaskIndividualAssessmentList]
  }

  object DescribeReplicationTaskIndividualAssessmentsResponse {
    @inline
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        ReplicationTaskIndividualAssessments: js.UndefOr[ReplicationTaskIndividualAssessmentList] = js.undefined
    ): DescribeReplicationTaskIndividualAssessmentsResponse = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      ReplicationTaskIndividualAssessments.foreach(__v => __obj.updateDynamic("ReplicationTaskIndividualAssessments")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeReplicationTaskIndividualAssessmentsResponse]
    }
  }

  /** <p/>
    */
  @js.native
  trait DescribeReplicationTasksMessage extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
    var WithoutSettings: js.UndefOr[BooleanOptional]
  }

  object DescribeReplicationTasksMessage {
    @inline
    def apply(
        Filters: js.UndefOr[FilterList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
        WithoutSettings: js.UndefOr[BooleanOptional] = js.undefined
    ): DescribeReplicationTasksMessage = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      WithoutSettings.foreach(__v => __obj.updateDynamic("WithoutSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeReplicationTasksMessage]
    }
  }

  /** <p/>
    */
  @js.native
  trait DescribeReplicationTasksResponse extends js.Object {
    var Marker: js.UndefOr[String]
    var ReplicationTasks: js.UndefOr[ReplicationTaskList]
  }

  object DescribeReplicationTasksResponse {
    @inline
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        ReplicationTasks: js.UndefOr[ReplicationTaskList] = js.undefined
    ): DescribeReplicationTasksResponse = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      ReplicationTasks.foreach(__v => __obj.updateDynamic("ReplicationTasks")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeReplicationTasksResponse]
    }
  }

  /** <p/>
    */
  @js.native
  trait DescribeSchemasMessage extends js.Object {
    var EndpointArn: String
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  object DescribeSchemasMessage {
    @inline
    def apply(
        EndpointArn: String,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    ): DescribeSchemasMessage = {
      val __obj = js.Dynamic.literal(
        "EndpointArn" -> EndpointArn.asInstanceOf[js.Any]
      )

      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSchemasMessage]
    }
  }

  /** <p/>
    */
  @js.native
  trait DescribeSchemasResponse extends js.Object {
    var Marker: js.UndefOr[String]
    var Schemas: js.UndefOr[SchemaList]
  }

  object DescribeSchemasResponse {
    @inline
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        Schemas: js.UndefOr[SchemaList] = js.undefined
    ): DescribeSchemasResponse = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      Schemas.foreach(__v => __obj.updateDynamic("Schemas")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSchemasResponse]
    }
  }

  /** <p/>
    */
  @js.native
  trait DescribeTableStatisticsMessage extends js.Object {
    var ReplicationTaskArn: String
    var Filters: js.UndefOr[FilterList]
    var Marker: js.UndefOr[String]
    var MaxRecords: js.UndefOr[IntegerOptional]
  }

  object DescribeTableStatisticsMessage {
    @inline
    def apply(
        ReplicationTaskArn: String,
        Filters: js.UndefOr[FilterList] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    ): DescribeTableStatisticsMessage = {
      val __obj = js.Dynamic.literal(
        "ReplicationTaskArn" -> ReplicationTaskArn.asInstanceOf[js.Any]
      )

      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTableStatisticsMessage]
    }
  }

  /** <p/>
    */
  @js.native
  trait DescribeTableStatisticsResponse extends js.Object {
    var Marker: js.UndefOr[String]
    var ReplicationTaskArn: js.UndefOr[String]
    var TableStatistics: js.UndefOr[TableStatisticsList]
  }

  object DescribeTableStatisticsResponse {
    @inline
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        ReplicationTaskArn: js.UndefOr[String] = js.undefined,
        TableStatistics: js.UndefOr[TableStatisticsList] = js.undefined
    ): DescribeTableStatisticsResponse = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      ReplicationTaskArn.foreach(__v => __obj.updateDynamic("ReplicationTaskArn")(__v.asInstanceOf[js.Any]))
      TableStatistics.foreach(__v => __obj.updateDynamic("TableStatistics")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTableStatisticsResponse]
    }
  }

  @js.native
  sealed trait DmsSslModeValue extends js.Any
  object DmsSslModeValue {
    val none = "none".asInstanceOf[DmsSslModeValue]
    val require = "require".asInstanceOf[DmsSslModeValue]
    val `verify-ca` = "verify-ca".asInstanceOf[DmsSslModeValue]
    val `verify-full` = "verify-full".asInstanceOf[DmsSslModeValue]

    @inline def values = js.Array(none, require, `verify-ca`, `verify-full`)
  }

  /** The settings in JSON format for the DMS Transfer type source endpoint.
    */
  @js.native
  trait DmsTransferSettings extends js.Object {
    var BucketName: js.UndefOr[String]
    var ServiceAccessRoleArn: js.UndefOr[String]
  }

  object DmsTransferSettings {
    @inline
    def apply(
        BucketName: js.UndefOr[String] = js.undefined,
        ServiceAccessRoleArn: js.UndefOr[String] = js.undefined
    ): DmsTransferSettings = {
      val __obj = js.Dynamic.literal()
      BucketName.foreach(__v => __obj.updateDynamic("BucketName")(__v.asInstanceOf[js.Any]))
      ServiceAccessRoleArn.foreach(__v => __obj.updateDynamic("ServiceAccessRoleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DmsTransferSettings]
    }
  }

  /** Provides information that defines a DocumentDB endpoint.
    */
  @js.native
  trait DocDbSettings extends js.Object {
    var DatabaseName: js.UndefOr[String]
    var DocsToInvestigate: js.UndefOr[IntegerOptional]
    var ExtractDocId: js.UndefOr[BooleanOptional]
    var KmsKeyId: js.UndefOr[String]
    var NestingLevel: js.UndefOr[NestingLevelValue]
    var Password: js.UndefOr[SecretString]
    var Port: js.UndefOr[IntegerOptional]
    var ServerName: js.UndefOr[String]
    var Username: js.UndefOr[String]
  }

  object DocDbSettings {
    @inline
    def apply(
        DatabaseName: js.UndefOr[String] = js.undefined,
        DocsToInvestigate: js.UndefOr[IntegerOptional] = js.undefined,
        ExtractDocId: js.UndefOr[BooleanOptional] = js.undefined,
        KmsKeyId: js.UndefOr[String] = js.undefined,
        NestingLevel: js.UndefOr[NestingLevelValue] = js.undefined,
        Password: js.UndefOr[SecretString] = js.undefined,
        Port: js.UndefOr[IntegerOptional] = js.undefined,
        ServerName: js.UndefOr[String] = js.undefined,
        Username: js.UndefOr[String] = js.undefined
    ): DocDbSettings = {
      val __obj = js.Dynamic.literal()
      DatabaseName.foreach(__v => __obj.updateDynamic("DatabaseName")(__v.asInstanceOf[js.Any]))
      DocsToInvestigate.foreach(__v => __obj.updateDynamic("DocsToInvestigate")(__v.asInstanceOf[js.Any]))
      ExtractDocId.foreach(__v => __obj.updateDynamic("ExtractDocId")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      NestingLevel.foreach(__v => __obj.updateDynamic("NestingLevel")(__v.asInstanceOf[js.Any]))
      Password.foreach(__v => __obj.updateDynamic("Password")(__v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      ServerName.foreach(__v => __obj.updateDynamic("ServerName")(__v.asInstanceOf[js.Any]))
      Username.foreach(__v => __obj.updateDynamic("Username")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DocDbSettings]
    }
  }

  /** Provides the Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role used to define an Amazon DynamoDB target endpoint.
    */
  @js.native
  trait DynamoDbSettings extends js.Object {
    var ServiceAccessRoleArn: String
  }

  object DynamoDbSettings {
    @inline
    def apply(
        ServiceAccessRoleArn: String
    ): DynamoDbSettings = {
      val __obj = js.Dynamic.literal(
        "ServiceAccessRoleArn" -> ServiceAccessRoleArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DynamoDbSettings]
    }
  }

  /** Provides information that defines an Elasticsearch endpoint.
    */
  @js.native
  trait ElasticsearchSettings extends js.Object {
    var EndpointUri: String
    var ServiceAccessRoleArn: String
    var ErrorRetryDuration: js.UndefOr[IntegerOptional]
    var FullLoadErrorPercentage: js.UndefOr[IntegerOptional]
  }

  object ElasticsearchSettings {
    @inline
    def apply(
        EndpointUri: String,
        ServiceAccessRoleArn: String,
        ErrorRetryDuration: js.UndefOr[IntegerOptional] = js.undefined,
        FullLoadErrorPercentage: js.UndefOr[IntegerOptional] = js.undefined
    ): ElasticsearchSettings = {
      val __obj = js.Dynamic.literal(
        "EndpointUri" -> EndpointUri.asInstanceOf[js.Any],
        "ServiceAccessRoleArn" -> ServiceAccessRoleArn.asInstanceOf[js.Any]
      )

      ErrorRetryDuration.foreach(__v => __obj.updateDynamic("ErrorRetryDuration")(__v.asInstanceOf[js.Any]))
      FullLoadErrorPercentage.foreach(__v => __obj.updateDynamic("FullLoadErrorPercentage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ElasticsearchSettings]
    }
  }

  @js.native
  sealed trait EncodingTypeValue extends js.Any
  object EncodingTypeValue {
    val plain = "plain".asInstanceOf[EncodingTypeValue]
    val `plain-dictionary` = "plain-dictionary".asInstanceOf[EncodingTypeValue]
    val `rle-dictionary` = "rle-dictionary".asInstanceOf[EncodingTypeValue]

    @inline def values = js.Array(plain, `plain-dictionary`, `rle-dictionary`)
  }

  @js.native
  sealed trait EncryptionModeValue extends js.Any
  object EncryptionModeValue {
    val `sse-s3` = "sse-s3".asInstanceOf[EncryptionModeValue]
    val `sse-kms` = "sse-kms".asInstanceOf[EncryptionModeValue]

    @inline def values = js.Array(`sse-s3`, `sse-kms`)
  }

  /** Describes an endpoint of a database instance in response to operations such as the following:
    * * <code>CreateEndpoint</code>
    * * <code>DescribeEndpoint</code>
    * * <code>DescribeEndpointTypes</code>
    * * <code>ModifyEndpoint</code>
    */
  @js.native
  trait Endpoint extends js.Object {
    var CertificateArn: js.UndefOr[String]
    var DatabaseName: js.UndefOr[String]
    var DmsTransferSettings: js.UndefOr[DmsTransferSettings]
    var DocDbSettings: js.UndefOr[DocDbSettings]
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
    var IBMDb2Settings: js.UndefOr[IBMDb2Settings]
    var KafkaSettings: js.UndefOr[KafkaSettings]
    var KinesisSettings: js.UndefOr[KinesisSettings]
    var KmsKeyId: js.UndefOr[String]
    var MicrosoftSQLServerSettings: js.UndefOr[MicrosoftSQLServerSettings]
    var MongoDbSettings: js.UndefOr[MongoDbSettings]
    var MySQLSettings: js.UndefOr[MySQLSettings]
    var NeptuneSettings: js.UndefOr[NeptuneSettings]
    var OracleSettings: js.UndefOr[OracleSettings]
    var Port: js.UndefOr[IntegerOptional]
    var PostgreSQLSettings: js.UndefOr[PostgreSQLSettings]
    var RedshiftSettings: js.UndefOr[RedshiftSettings]
    var S3Settings: js.UndefOr[S3Settings]
    var ServerName: js.UndefOr[String]
    var ServiceAccessRoleArn: js.UndefOr[String]
    var SslMode: js.UndefOr[DmsSslModeValue]
    var Status: js.UndefOr[String]
    var SybaseSettings: js.UndefOr[SybaseSettings]
    var Username: js.UndefOr[String]
  }

  object Endpoint {
    @inline
    def apply(
        CertificateArn: js.UndefOr[String] = js.undefined,
        DatabaseName: js.UndefOr[String] = js.undefined,
        DmsTransferSettings: js.UndefOr[DmsTransferSettings] = js.undefined,
        DocDbSettings: js.UndefOr[DocDbSettings] = js.undefined,
        DynamoDbSettings: js.UndefOr[DynamoDbSettings] = js.undefined,
        ElasticsearchSettings: js.UndefOr[ElasticsearchSettings] = js.undefined,
        EndpointArn: js.UndefOr[String] = js.undefined,
        EndpointIdentifier: js.UndefOr[String] = js.undefined,
        EndpointType: js.UndefOr[ReplicationEndpointTypeValue] = js.undefined,
        EngineDisplayName: js.UndefOr[String] = js.undefined,
        EngineName: js.UndefOr[String] = js.undefined,
        ExternalId: js.UndefOr[String] = js.undefined,
        ExternalTableDefinition: js.UndefOr[String] = js.undefined,
        ExtraConnectionAttributes: js.UndefOr[String] = js.undefined,
        IBMDb2Settings: js.UndefOr[IBMDb2Settings] = js.undefined,
        KafkaSettings: js.UndefOr[KafkaSettings] = js.undefined,
        KinesisSettings: js.UndefOr[KinesisSettings] = js.undefined,
        KmsKeyId: js.UndefOr[String] = js.undefined,
        MicrosoftSQLServerSettings: js.UndefOr[MicrosoftSQLServerSettings] = js.undefined,
        MongoDbSettings: js.UndefOr[MongoDbSettings] = js.undefined,
        MySQLSettings: js.UndefOr[MySQLSettings] = js.undefined,
        NeptuneSettings: js.UndefOr[NeptuneSettings] = js.undefined,
        OracleSettings: js.UndefOr[OracleSettings] = js.undefined,
        Port: js.UndefOr[IntegerOptional] = js.undefined,
        PostgreSQLSettings: js.UndefOr[PostgreSQLSettings] = js.undefined,
        RedshiftSettings: js.UndefOr[RedshiftSettings] = js.undefined,
        S3Settings: js.UndefOr[S3Settings] = js.undefined,
        ServerName: js.UndefOr[String] = js.undefined,
        ServiceAccessRoleArn: js.UndefOr[String] = js.undefined,
        SslMode: js.UndefOr[DmsSslModeValue] = js.undefined,
        Status: js.UndefOr[String] = js.undefined,
        SybaseSettings: js.UndefOr[SybaseSettings] = js.undefined,
        Username: js.UndefOr[String] = js.undefined
    ): Endpoint = {
      val __obj = js.Dynamic.literal()
      CertificateArn.foreach(__v => __obj.updateDynamic("CertificateArn")(__v.asInstanceOf[js.Any]))
      DatabaseName.foreach(__v => __obj.updateDynamic("DatabaseName")(__v.asInstanceOf[js.Any]))
      DmsTransferSettings.foreach(__v => __obj.updateDynamic("DmsTransferSettings")(__v.asInstanceOf[js.Any]))
      DocDbSettings.foreach(__v => __obj.updateDynamic("DocDbSettings")(__v.asInstanceOf[js.Any]))
      DynamoDbSettings.foreach(__v => __obj.updateDynamic("DynamoDbSettings")(__v.asInstanceOf[js.Any]))
      ElasticsearchSettings.foreach(__v => __obj.updateDynamic("ElasticsearchSettings")(__v.asInstanceOf[js.Any]))
      EndpointArn.foreach(__v => __obj.updateDynamic("EndpointArn")(__v.asInstanceOf[js.Any]))
      EndpointIdentifier.foreach(__v => __obj.updateDynamic("EndpointIdentifier")(__v.asInstanceOf[js.Any]))
      EndpointType.foreach(__v => __obj.updateDynamic("EndpointType")(__v.asInstanceOf[js.Any]))
      EngineDisplayName.foreach(__v => __obj.updateDynamic("EngineDisplayName")(__v.asInstanceOf[js.Any]))
      EngineName.foreach(__v => __obj.updateDynamic("EngineName")(__v.asInstanceOf[js.Any]))
      ExternalId.foreach(__v => __obj.updateDynamic("ExternalId")(__v.asInstanceOf[js.Any]))
      ExternalTableDefinition.foreach(__v => __obj.updateDynamic("ExternalTableDefinition")(__v.asInstanceOf[js.Any]))
      ExtraConnectionAttributes.foreach(__v => __obj.updateDynamic("ExtraConnectionAttributes")(__v.asInstanceOf[js.Any]))
      IBMDb2Settings.foreach(__v => __obj.updateDynamic("IBMDb2Settings")(__v.asInstanceOf[js.Any]))
      KafkaSettings.foreach(__v => __obj.updateDynamic("KafkaSettings")(__v.asInstanceOf[js.Any]))
      KinesisSettings.foreach(__v => __obj.updateDynamic("KinesisSettings")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      MicrosoftSQLServerSettings.foreach(__v => __obj.updateDynamic("MicrosoftSQLServerSettings")(__v.asInstanceOf[js.Any]))
      MongoDbSettings.foreach(__v => __obj.updateDynamic("MongoDbSettings")(__v.asInstanceOf[js.Any]))
      MySQLSettings.foreach(__v => __obj.updateDynamic("MySQLSettings")(__v.asInstanceOf[js.Any]))
      NeptuneSettings.foreach(__v => __obj.updateDynamic("NeptuneSettings")(__v.asInstanceOf[js.Any]))
      OracleSettings.foreach(__v => __obj.updateDynamic("OracleSettings")(__v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      PostgreSQLSettings.foreach(__v => __obj.updateDynamic("PostgreSQLSettings")(__v.asInstanceOf[js.Any]))
      RedshiftSettings.foreach(__v => __obj.updateDynamic("RedshiftSettings")(__v.asInstanceOf[js.Any]))
      S3Settings.foreach(__v => __obj.updateDynamic("S3Settings")(__v.asInstanceOf[js.Any]))
      ServerName.foreach(__v => __obj.updateDynamic("ServerName")(__v.asInstanceOf[js.Any]))
      ServiceAccessRoleArn.foreach(__v => __obj.updateDynamic("ServiceAccessRoleArn")(__v.asInstanceOf[js.Any]))
      SslMode.foreach(__v => __obj.updateDynamic("SslMode")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      SybaseSettings.foreach(__v => __obj.updateDynamic("SybaseSettings")(__v.asInstanceOf[js.Any]))
      Username.foreach(__v => __obj.updateDynamic("Username")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Endpoint]
    }
  }

  /** Describes an identifiable significant activity that affects a replication instance or task. This object can provide the message, the available event categories, the date and source of the event, and the AWS DMS resource type.
    */
  @js.native
  trait Event extends js.Object {
    var Date: js.UndefOr[TStamp]
    var EventCategories: js.UndefOr[EventCategoriesList]
    var Message: js.UndefOr[String]
    var SourceIdentifier: js.UndefOr[String]
    var SourceType: js.UndefOr[SourceType]
  }

  object Event {
    @inline
    def apply(
        Date: js.UndefOr[TStamp] = js.undefined,
        EventCategories: js.UndefOr[EventCategoriesList] = js.undefined,
        Message: js.UndefOr[String] = js.undefined,
        SourceIdentifier: js.UndefOr[String] = js.undefined,
        SourceType: js.UndefOr[SourceType] = js.undefined
    ): Event = {
      val __obj = js.Dynamic.literal()
      Date.foreach(__v => __obj.updateDynamic("Date")(__v.asInstanceOf[js.Any]))
      EventCategories.foreach(__v => __obj.updateDynamic("EventCategories")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      SourceIdentifier.foreach(__v => __obj.updateDynamic("SourceIdentifier")(__v.asInstanceOf[js.Any]))
      SourceType.foreach(__v => __obj.updateDynamic("SourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Event]
    }
  }

  /** Lists categories of events subscribed to, and generated by, the applicable AWS DMS resource type. This data type appears in response to the <a href="https://docs.aws.amazon.com/dms/latest/APIReference/API_EventCategoryGroup.html"> <code>DescribeEventCategories</code> </a> action.
    */
  @js.native
  trait EventCategoryGroup extends js.Object {
    var EventCategories: js.UndefOr[EventCategoriesList]
    var SourceType: js.UndefOr[String]
  }

  object EventCategoryGroup {
    @inline
    def apply(
        EventCategories: js.UndefOr[EventCategoriesList] = js.undefined,
        SourceType: js.UndefOr[String] = js.undefined
    ): EventCategoryGroup = {
      val __obj = js.Dynamic.literal()
      EventCategories.foreach(__v => __obj.updateDynamic("EventCategories")(__v.asInstanceOf[js.Any]))
      SourceType.foreach(__v => __obj.updateDynamic("SourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventCategoryGroup]
    }
  }

  /** Describes an event notification subscription created by the <code>CreateEventSubscription</code> operation.
    */
  @js.native
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

  object EventSubscription {
    @inline
    def apply(
        CustSubscriptionId: js.UndefOr[String] = js.undefined,
        CustomerAwsId: js.UndefOr[String] = js.undefined,
        Enabled: js.UndefOr[Boolean] = js.undefined,
        EventCategoriesList: js.UndefOr[EventCategoriesList] = js.undefined,
        SnsTopicArn: js.UndefOr[String] = js.undefined,
        SourceIdsList: js.UndefOr[SourceIdsList] = js.undefined,
        SourceType: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[String] = js.undefined,
        SubscriptionCreationTime: js.UndefOr[String] = js.undefined
    ): EventSubscription = {
      val __obj = js.Dynamic.literal()
      CustSubscriptionId.foreach(__v => __obj.updateDynamic("CustSubscriptionId")(__v.asInstanceOf[js.Any]))
      CustomerAwsId.foreach(__v => __obj.updateDynamic("CustomerAwsId")(__v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      EventCategoriesList.foreach(__v => __obj.updateDynamic("EventCategoriesList")(__v.asInstanceOf[js.Any]))
      SnsTopicArn.foreach(__v => __obj.updateDynamic("SnsTopicArn")(__v.asInstanceOf[js.Any]))
      SourceIdsList.foreach(__v => __obj.updateDynamic("SourceIdsList")(__v.asInstanceOf[js.Any]))
      SourceType.foreach(__v => __obj.updateDynamic("SourceType")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      SubscriptionCreationTime.foreach(__v => __obj.updateDynamic("SubscriptionCreationTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventSubscription]
    }
  }

  /** Identifies the name and value of a filter object. This filter is used to limit the number and type of AWS DMS objects that are returned for a particular <code>Describe*</code> call or similar operation. Filters are used as an optional parameter to the following APIs.
    */
  @js.native
  trait Filter extends js.Object {
    var Name: String
    var Values: FilterValueList
  }

  object Filter {
    @inline
    def apply(
        Name: String,
        Values: FilterValueList
    ): Filter = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Filter]
    }
  }

  /** Provides information that defines an IBM Db2 LUW endpoint.
    */
  @js.native
  trait IBMDb2Settings extends js.Object {
    var CurrentLsn: js.UndefOr[String]
    var DatabaseName: js.UndefOr[String]
    var MaxKBytesPerRead: js.UndefOr[IntegerOptional]
    var Password: js.UndefOr[SecretString]
    var Port: js.UndefOr[IntegerOptional]
    var ServerName: js.UndefOr[String]
    var SetDataCaptureChanges: js.UndefOr[BooleanOptional]
    var Username: js.UndefOr[String]
  }

  object IBMDb2Settings {
    @inline
    def apply(
        CurrentLsn: js.UndefOr[String] = js.undefined,
        DatabaseName: js.UndefOr[String] = js.undefined,
        MaxKBytesPerRead: js.UndefOr[IntegerOptional] = js.undefined,
        Password: js.UndefOr[SecretString] = js.undefined,
        Port: js.UndefOr[IntegerOptional] = js.undefined,
        ServerName: js.UndefOr[String] = js.undefined,
        SetDataCaptureChanges: js.UndefOr[BooleanOptional] = js.undefined,
        Username: js.UndefOr[String] = js.undefined
    ): IBMDb2Settings = {
      val __obj = js.Dynamic.literal()
      CurrentLsn.foreach(__v => __obj.updateDynamic("CurrentLsn")(__v.asInstanceOf[js.Any]))
      DatabaseName.foreach(__v => __obj.updateDynamic("DatabaseName")(__v.asInstanceOf[js.Any]))
      MaxKBytesPerRead.foreach(__v => __obj.updateDynamic("MaxKBytesPerRead")(__v.asInstanceOf[js.Any]))
      Password.foreach(__v => __obj.updateDynamic("Password")(__v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      ServerName.foreach(__v => __obj.updateDynamic("ServerName")(__v.asInstanceOf[js.Any]))
      SetDataCaptureChanges.foreach(__v => __obj.updateDynamic("SetDataCaptureChanges")(__v.asInstanceOf[js.Any]))
      Username.foreach(__v => __obj.updateDynamic("Username")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IBMDb2Settings]
    }
  }

  @js.native
  trait ImportCertificateMessage extends js.Object {
    var CertificateIdentifier: String
    var CertificatePem: js.UndefOr[String]
    var CertificateWallet: js.UndefOr[CertificateWallet]
    var Tags: js.UndefOr[TagList]
  }

  object ImportCertificateMessage {
    @inline
    def apply(
        CertificateIdentifier: String,
        CertificatePem: js.UndefOr[String] = js.undefined,
        CertificateWallet: js.UndefOr[CertificateWallet] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): ImportCertificateMessage = {
      val __obj = js.Dynamic.literal(
        "CertificateIdentifier" -> CertificateIdentifier.asInstanceOf[js.Any]
      )

      CertificatePem.foreach(__v => __obj.updateDynamic("CertificatePem")(__v.asInstanceOf[js.Any]))
      CertificateWallet.foreach(__v => __obj.updateDynamic("CertificateWallet")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportCertificateMessage]
    }
  }

  @js.native
  trait ImportCertificateResponse extends js.Object {
    var Certificate: js.UndefOr[Certificate]
  }

  object ImportCertificateResponse {
    @inline
    def apply(
        Certificate: js.UndefOr[Certificate] = js.undefined
    ): ImportCertificateResponse = {
      val __obj = js.Dynamic.literal()
      Certificate.foreach(__v => __obj.updateDynamic("Certificate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportCertificateResponse]
    }
  }

  /** Provides information that describes an Apache Kafka endpoint. This information includes the output format of records applied to the endpoint and details of transaction and control table data information.
    */
  @js.native
  trait KafkaSettings extends js.Object {
    var Broker: js.UndefOr[String]
    var IncludeControlDetails: js.UndefOr[BooleanOptional]
    var IncludeNullAndEmpty: js.UndefOr[BooleanOptional]
    var IncludePartitionValue: js.UndefOr[BooleanOptional]
    var IncludeTableAlterOperations: js.UndefOr[BooleanOptional]
    var IncludeTransactionDetails: js.UndefOr[BooleanOptional]
    var MessageFormat: js.UndefOr[MessageFormatValue]
    var MessageMaxBytes: js.UndefOr[IntegerOptional]
    var PartitionIncludeSchemaTable: js.UndefOr[BooleanOptional]
    var Topic: js.UndefOr[String]
  }

  object KafkaSettings {
    @inline
    def apply(
        Broker: js.UndefOr[String] = js.undefined,
        IncludeControlDetails: js.UndefOr[BooleanOptional] = js.undefined,
        IncludeNullAndEmpty: js.UndefOr[BooleanOptional] = js.undefined,
        IncludePartitionValue: js.UndefOr[BooleanOptional] = js.undefined,
        IncludeTableAlterOperations: js.UndefOr[BooleanOptional] = js.undefined,
        IncludeTransactionDetails: js.UndefOr[BooleanOptional] = js.undefined,
        MessageFormat: js.UndefOr[MessageFormatValue] = js.undefined,
        MessageMaxBytes: js.UndefOr[IntegerOptional] = js.undefined,
        PartitionIncludeSchemaTable: js.UndefOr[BooleanOptional] = js.undefined,
        Topic: js.UndefOr[String] = js.undefined
    ): KafkaSettings = {
      val __obj = js.Dynamic.literal()
      Broker.foreach(__v => __obj.updateDynamic("Broker")(__v.asInstanceOf[js.Any]))
      IncludeControlDetails.foreach(__v => __obj.updateDynamic("IncludeControlDetails")(__v.asInstanceOf[js.Any]))
      IncludeNullAndEmpty.foreach(__v => __obj.updateDynamic("IncludeNullAndEmpty")(__v.asInstanceOf[js.Any]))
      IncludePartitionValue.foreach(__v => __obj.updateDynamic("IncludePartitionValue")(__v.asInstanceOf[js.Any]))
      IncludeTableAlterOperations.foreach(__v => __obj.updateDynamic("IncludeTableAlterOperations")(__v.asInstanceOf[js.Any]))
      IncludeTransactionDetails.foreach(__v => __obj.updateDynamic("IncludeTransactionDetails")(__v.asInstanceOf[js.Any]))
      MessageFormat.foreach(__v => __obj.updateDynamic("MessageFormat")(__v.asInstanceOf[js.Any]))
      MessageMaxBytes.foreach(__v => __obj.updateDynamic("MessageMaxBytes")(__v.asInstanceOf[js.Any]))
      PartitionIncludeSchemaTable.foreach(__v => __obj.updateDynamic("PartitionIncludeSchemaTable")(__v.asInstanceOf[js.Any]))
      Topic.foreach(__v => __obj.updateDynamic("Topic")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KafkaSettings]
    }
  }

  /** Provides information that describes an Amazon Kinesis Data Stream endpoint. This information includes the output format of records applied to the endpoint and details of transaction and control table data information.
    */
  @js.native
  trait KinesisSettings extends js.Object {
    var IncludeControlDetails: js.UndefOr[BooleanOptional]
    var IncludeNullAndEmpty: js.UndefOr[BooleanOptional]
    var IncludePartitionValue: js.UndefOr[BooleanOptional]
    var IncludeTableAlterOperations: js.UndefOr[BooleanOptional]
    var IncludeTransactionDetails: js.UndefOr[BooleanOptional]
    var MessageFormat: js.UndefOr[MessageFormatValue]
    var PartitionIncludeSchemaTable: js.UndefOr[BooleanOptional]
    var ServiceAccessRoleArn: js.UndefOr[String]
    var StreamArn: js.UndefOr[String]
  }

  object KinesisSettings {
    @inline
    def apply(
        IncludeControlDetails: js.UndefOr[BooleanOptional] = js.undefined,
        IncludeNullAndEmpty: js.UndefOr[BooleanOptional] = js.undefined,
        IncludePartitionValue: js.UndefOr[BooleanOptional] = js.undefined,
        IncludeTableAlterOperations: js.UndefOr[BooleanOptional] = js.undefined,
        IncludeTransactionDetails: js.UndefOr[BooleanOptional] = js.undefined,
        MessageFormat: js.UndefOr[MessageFormatValue] = js.undefined,
        PartitionIncludeSchemaTable: js.UndefOr[BooleanOptional] = js.undefined,
        ServiceAccessRoleArn: js.UndefOr[String] = js.undefined,
        StreamArn: js.UndefOr[String] = js.undefined
    ): KinesisSettings = {
      val __obj = js.Dynamic.literal()
      IncludeControlDetails.foreach(__v => __obj.updateDynamic("IncludeControlDetails")(__v.asInstanceOf[js.Any]))
      IncludeNullAndEmpty.foreach(__v => __obj.updateDynamic("IncludeNullAndEmpty")(__v.asInstanceOf[js.Any]))
      IncludePartitionValue.foreach(__v => __obj.updateDynamic("IncludePartitionValue")(__v.asInstanceOf[js.Any]))
      IncludeTableAlterOperations.foreach(__v => __obj.updateDynamic("IncludeTableAlterOperations")(__v.asInstanceOf[js.Any]))
      IncludeTransactionDetails.foreach(__v => __obj.updateDynamic("IncludeTransactionDetails")(__v.asInstanceOf[js.Any]))
      MessageFormat.foreach(__v => __obj.updateDynamic("MessageFormat")(__v.asInstanceOf[js.Any]))
      PartitionIncludeSchemaTable.foreach(__v => __obj.updateDynamic("PartitionIncludeSchemaTable")(__v.asInstanceOf[js.Any]))
      ServiceAccessRoleArn.foreach(__v => __obj.updateDynamic("ServiceAccessRoleArn")(__v.asInstanceOf[js.Any]))
      StreamArn.foreach(__v => __obj.updateDynamic("StreamArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KinesisSettings]
    }
  }

  /** <p/>
    */
  @js.native
  trait ListTagsForResourceMessage extends js.Object {
    var ResourceArn: String
  }

  object ListTagsForResourceMessage {
    @inline
    def apply(
        ResourceArn: String
    ): ListTagsForResourceMessage = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceMessage]
    }
  }

  /** <p/>
    */
  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var TagList: js.UndefOr[TagList]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        TagList: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      TagList.foreach(__v => __obj.updateDynamic("TagList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  @js.native
  sealed trait MessageFormatValue extends js.Any
  object MessageFormatValue {
    val json = "json".asInstanceOf[MessageFormatValue]
    val `json-unformatted` = "json-unformatted".asInstanceOf[MessageFormatValue]

    @inline def values = js.Array(json, `json-unformatted`)
  }

  /** Provides information that defines a Microsoft SQL Server endpoint.
    */
  @js.native
  trait MicrosoftSQLServerSettings extends js.Object {
    var BcpPacketSize: js.UndefOr[IntegerOptional]
    var ControlTablesFileGroup: js.UndefOr[String]
    var DatabaseName: js.UndefOr[String]
    var Password: js.UndefOr[SecretString]
    var Port: js.UndefOr[IntegerOptional]
    var ReadBackupOnly: js.UndefOr[BooleanOptional]
    var SafeguardPolicy: js.UndefOr[SafeguardPolicy]
    var ServerName: js.UndefOr[String]
    var UseBcpFullLoad: js.UndefOr[BooleanOptional]
    var Username: js.UndefOr[String]
  }

  object MicrosoftSQLServerSettings {
    @inline
    def apply(
        BcpPacketSize: js.UndefOr[IntegerOptional] = js.undefined,
        ControlTablesFileGroup: js.UndefOr[String] = js.undefined,
        DatabaseName: js.UndefOr[String] = js.undefined,
        Password: js.UndefOr[SecretString] = js.undefined,
        Port: js.UndefOr[IntegerOptional] = js.undefined,
        ReadBackupOnly: js.UndefOr[BooleanOptional] = js.undefined,
        SafeguardPolicy: js.UndefOr[SafeguardPolicy] = js.undefined,
        ServerName: js.UndefOr[String] = js.undefined,
        UseBcpFullLoad: js.UndefOr[BooleanOptional] = js.undefined,
        Username: js.UndefOr[String] = js.undefined
    ): MicrosoftSQLServerSettings = {
      val __obj = js.Dynamic.literal()
      BcpPacketSize.foreach(__v => __obj.updateDynamic("BcpPacketSize")(__v.asInstanceOf[js.Any]))
      ControlTablesFileGroup.foreach(__v => __obj.updateDynamic("ControlTablesFileGroup")(__v.asInstanceOf[js.Any]))
      DatabaseName.foreach(__v => __obj.updateDynamic("DatabaseName")(__v.asInstanceOf[js.Any]))
      Password.foreach(__v => __obj.updateDynamic("Password")(__v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      ReadBackupOnly.foreach(__v => __obj.updateDynamic("ReadBackupOnly")(__v.asInstanceOf[js.Any]))
      SafeguardPolicy.foreach(__v => __obj.updateDynamic("SafeguardPolicy")(__v.asInstanceOf[js.Any]))
      ServerName.foreach(__v => __obj.updateDynamic("ServerName")(__v.asInstanceOf[js.Any]))
      UseBcpFullLoad.foreach(__v => __obj.updateDynamic("UseBcpFullLoad")(__v.asInstanceOf[js.Any]))
      Username.foreach(__v => __obj.updateDynamic("Username")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MicrosoftSQLServerSettings]
    }
  }

  @js.native
  sealed trait MigrationTypeValue extends js.Any
  object MigrationTypeValue {
    val `full-load` = "full-load".asInstanceOf[MigrationTypeValue]
    val cdc = "cdc".asInstanceOf[MigrationTypeValue]
    val `full-load-and-cdc` = "full-load-and-cdc".asInstanceOf[MigrationTypeValue]

    @inline def values = js.Array(`full-load`, cdc, `full-load-and-cdc`)
  }

  /** <p/>
    */
  @js.native
  trait ModifyEndpointMessage extends js.Object {
    var EndpointArn: String
    var CertificateArn: js.UndefOr[String]
    var DatabaseName: js.UndefOr[String]
    var DmsTransferSettings: js.UndefOr[DmsTransferSettings]
    var DocDbSettings: js.UndefOr[DocDbSettings]
    var DynamoDbSettings: js.UndefOr[DynamoDbSettings]
    var ElasticsearchSettings: js.UndefOr[ElasticsearchSettings]
    var EndpointIdentifier: js.UndefOr[String]
    var EndpointType: js.UndefOr[ReplicationEndpointTypeValue]
    var EngineName: js.UndefOr[String]
    var ExternalTableDefinition: js.UndefOr[String]
    var ExtraConnectionAttributes: js.UndefOr[String]
    var IBMDb2Settings: js.UndefOr[IBMDb2Settings]
    var KafkaSettings: js.UndefOr[KafkaSettings]
    var KinesisSettings: js.UndefOr[KinesisSettings]
    var MicrosoftSQLServerSettings: js.UndefOr[MicrosoftSQLServerSettings]
    var MongoDbSettings: js.UndefOr[MongoDbSettings]
    var MySQLSettings: js.UndefOr[MySQLSettings]
    var NeptuneSettings: js.UndefOr[NeptuneSettings]
    var OracleSettings: js.UndefOr[OracleSettings]
    var Password: js.UndefOr[SecretString]
    var Port: js.UndefOr[IntegerOptional]
    var PostgreSQLSettings: js.UndefOr[PostgreSQLSettings]
    var RedshiftSettings: js.UndefOr[RedshiftSettings]
    var S3Settings: js.UndefOr[S3Settings]
    var ServerName: js.UndefOr[String]
    var ServiceAccessRoleArn: js.UndefOr[String]
    var SslMode: js.UndefOr[DmsSslModeValue]
    var SybaseSettings: js.UndefOr[SybaseSettings]
    var Username: js.UndefOr[String]
  }

  object ModifyEndpointMessage {
    @inline
    def apply(
        EndpointArn: String,
        CertificateArn: js.UndefOr[String] = js.undefined,
        DatabaseName: js.UndefOr[String] = js.undefined,
        DmsTransferSettings: js.UndefOr[DmsTransferSettings] = js.undefined,
        DocDbSettings: js.UndefOr[DocDbSettings] = js.undefined,
        DynamoDbSettings: js.UndefOr[DynamoDbSettings] = js.undefined,
        ElasticsearchSettings: js.UndefOr[ElasticsearchSettings] = js.undefined,
        EndpointIdentifier: js.UndefOr[String] = js.undefined,
        EndpointType: js.UndefOr[ReplicationEndpointTypeValue] = js.undefined,
        EngineName: js.UndefOr[String] = js.undefined,
        ExternalTableDefinition: js.UndefOr[String] = js.undefined,
        ExtraConnectionAttributes: js.UndefOr[String] = js.undefined,
        IBMDb2Settings: js.UndefOr[IBMDb2Settings] = js.undefined,
        KafkaSettings: js.UndefOr[KafkaSettings] = js.undefined,
        KinesisSettings: js.UndefOr[KinesisSettings] = js.undefined,
        MicrosoftSQLServerSettings: js.UndefOr[MicrosoftSQLServerSettings] = js.undefined,
        MongoDbSettings: js.UndefOr[MongoDbSettings] = js.undefined,
        MySQLSettings: js.UndefOr[MySQLSettings] = js.undefined,
        NeptuneSettings: js.UndefOr[NeptuneSettings] = js.undefined,
        OracleSettings: js.UndefOr[OracleSettings] = js.undefined,
        Password: js.UndefOr[SecretString] = js.undefined,
        Port: js.UndefOr[IntegerOptional] = js.undefined,
        PostgreSQLSettings: js.UndefOr[PostgreSQLSettings] = js.undefined,
        RedshiftSettings: js.UndefOr[RedshiftSettings] = js.undefined,
        S3Settings: js.UndefOr[S3Settings] = js.undefined,
        ServerName: js.UndefOr[String] = js.undefined,
        ServiceAccessRoleArn: js.UndefOr[String] = js.undefined,
        SslMode: js.UndefOr[DmsSslModeValue] = js.undefined,
        SybaseSettings: js.UndefOr[SybaseSettings] = js.undefined,
        Username: js.UndefOr[String] = js.undefined
    ): ModifyEndpointMessage = {
      val __obj = js.Dynamic.literal(
        "EndpointArn" -> EndpointArn.asInstanceOf[js.Any]
      )

      CertificateArn.foreach(__v => __obj.updateDynamic("CertificateArn")(__v.asInstanceOf[js.Any]))
      DatabaseName.foreach(__v => __obj.updateDynamic("DatabaseName")(__v.asInstanceOf[js.Any]))
      DmsTransferSettings.foreach(__v => __obj.updateDynamic("DmsTransferSettings")(__v.asInstanceOf[js.Any]))
      DocDbSettings.foreach(__v => __obj.updateDynamic("DocDbSettings")(__v.asInstanceOf[js.Any]))
      DynamoDbSettings.foreach(__v => __obj.updateDynamic("DynamoDbSettings")(__v.asInstanceOf[js.Any]))
      ElasticsearchSettings.foreach(__v => __obj.updateDynamic("ElasticsearchSettings")(__v.asInstanceOf[js.Any]))
      EndpointIdentifier.foreach(__v => __obj.updateDynamic("EndpointIdentifier")(__v.asInstanceOf[js.Any]))
      EndpointType.foreach(__v => __obj.updateDynamic("EndpointType")(__v.asInstanceOf[js.Any]))
      EngineName.foreach(__v => __obj.updateDynamic("EngineName")(__v.asInstanceOf[js.Any]))
      ExternalTableDefinition.foreach(__v => __obj.updateDynamic("ExternalTableDefinition")(__v.asInstanceOf[js.Any]))
      ExtraConnectionAttributes.foreach(__v => __obj.updateDynamic("ExtraConnectionAttributes")(__v.asInstanceOf[js.Any]))
      IBMDb2Settings.foreach(__v => __obj.updateDynamic("IBMDb2Settings")(__v.asInstanceOf[js.Any]))
      KafkaSettings.foreach(__v => __obj.updateDynamic("KafkaSettings")(__v.asInstanceOf[js.Any]))
      KinesisSettings.foreach(__v => __obj.updateDynamic("KinesisSettings")(__v.asInstanceOf[js.Any]))
      MicrosoftSQLServerSettings.foreach(__v => __obj.updateDynamic("MicrosoftSQLServerSettings")(__v.asInstanceOf[js.Any]))
      MongoDbSettings.foreach(__v => __obj.updateDynamic("MongoDbSettings")(__v.asInstanceOf[js.Any]))
      MySQLSettings.foreach(__v => __obj.updateDynamic("MySQLSettings")(__v.asInstanceOf[js.Any]))
      NeptuneSettings.foreach(__v => __obj.updateDynamic("NeptuneSettings")(__v.asInstanceOf[js.Any]))
      OracleSettings.foreach(__v => __obj.updateDynamic("OracleSettings")(__v.asInstanceOf[js.Any]))
      Password.foreach(__v => __obj.updateDynamic("Password")(__v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      PostgreSQLSettings.foreach(__v => __obj.updateDynamic("PostgreSQLSettings")(__v.asInstanceOf[js.Any]))
      RedshiftSettings.foreach(__v => __obj.updateDynamic("RedshiftSettings")(__v.asInstanceOf[js.Any]))
      S3Settings.foreach(__v => __obj.updateDynamic("S3Settings")(__v.asInstanceOf[js.Any]))
      ServerName.foreach(__v => __obj.updateDynamic("ServerName")(__v.asInstanceOf[js.Any]))
      ServiceAccessRoleArn.foreach(__v => __obj.updateDynamic("ServiceAccessRoleArn")(__v.asInstanceOf[js.Any]))
      SslMode.foreach(__v => __obj.updateDynamic("SslMode")(__v.asInstanceOf[js.Any]))
      SybaseSettings.foreach(__v => __obj.updateDynamic("SybaseSettings")(__v.asInstanceOf[js.Any]))
      Username.foreach(__v => __obj.updateDynamic("Username")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyEndpointMessage]
    }
  }

  /** <p/>
    */
  @js.native
  trait ModifyEndpointResponse extends js.Object {
    var Endpoint: js.UndefOr[Endpoint]
  }

  object ModifyEndpointResponse {
    @inline
    def apply(
        Endpoint: js.UndefOr[Endpoint] = js.undefined
    ): ModifyEndpointResponse = {
      val __obj = js.Dynamic.literal()
      Endpoint.foreach(__v => __obj.updateDynamic("Endpoint")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyEndpointResponse]
    }
  }

  /** <p/>
    */
  @js.native
  trait ModifyEventSubscriptionMessage extends js.Object {
    var SubscriptionName: String
    var Enabled: js.UndefOr[BooleanOptional]
    var EventCategories: js.UndefOr[EventCategoriesList]
    var SnsTopicArn: js.UndefOr[String]
    var SourceType: js.UndefOr[String]
  }

  object ModifyEventSubscriptionMessage {
    @inline
    def apply(
        SubscriptionName: String,
        Enabled: js.UndefOr[BooleanOptional] = js.undefined,
        EventCategories: js.UndefOr[EventCategoriesList] = js.undefined,
        SnsTopicArn: js.UndefOr[String] = js.undefined,
        SourceType: js.UndefOr[String] = js.undefined
    ): ModifyEventSubscriptionMessage = {
      val __obj = js.Dynamic.literal(
        "SubscriptionName" -> SubscriptionName.asInstanceOf[js.Any]
      )

      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      EventCategories.foreach(__v => __obj.updateDynamic("EventCategories")(__v.asInstanceOf[js.Any]))
      SnsTopicArn.foreach(__v => __obj.updateDynamic("SnsTopicArn")(__v.asInstanceOf[js.Any]))
      SourceType.foreach(__v => __obj.updateDynamic("SourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyEventSubscriptionMessage]
    }
  }

  /** <p/>
    */
  @js.native
  trait ModifyEventSubscriptionResponse extends js.Object {
    var EventSubscription: js.UndefOr[EventSubscription]
  }

  object ModifyEventSubscriptionResponse {
    @inline
    def apply(
        EventSubscription: js.UndefOr[EventSubscription] = js.undefined
    ): ModifyEventSubscriptionResponse = {
      val __obj = js.Dynamic.literal()
      EventSubscription.foreach(__v => __obj.updateDynamic("EventSubscription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyEventSubscriptionResponse]
    }
  }

  /** <p/>
    */
  @js.native
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

  object ModifyReplicationInstanceMessage {
    @inline
    def apply(
        ReplicationInstanceArn: String,
        AllocatedStorage: js.UndefOr[IntegerOptional] = js.undefined,
        AllowMajorVersionUpgrade: js.UndefOr[Boolean] = js.undefined,
        ApplyImmediately: js.UndefOr[Boolean] = js.undefined,
        AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined,
        EngineVersion: js.UndefOr[String] = js.undefined,
        MultiAZ: js.UndefOr[BooleanOptional] = js.undefined,
        PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
        ReplicationInstanceClass: js.UndefOr[String] = js.undefined,
        ReplicationInstanceIdentifier: js.UndefOr[String] = js.undefined,
        VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
    ): ModifyReplicationInstanceMessage = {
      val __obj = js.Dynamic.literal(
        "ReplicationInstanceArn" -> ReplicationInstanceArn.asInstanceOf[js.Any]
      )

      AllocatedStorage.foreach(__v => __obj.updateDynamic("AllocatedStorage")(__v.asInstanceOf[js.Any]))
      AllowMajorVersionUpgrade.foreach(__v => __obj.updateDynamic("AllowMajorVersionUpgrade")(__v.asInstanceOf[js.Any]))
      ApplyImmediately.foreach(__v => __obj.updateDynamic("ApplyImmediately")(__v.asInstanceOf[js.Any]))
      AutoMinorVersionUpgrade.foreach(__v => __obj.updateDynamic("AutoMinorVersionUpgrade")(__v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
      MultiAZ.foreach(__v => __obj.updateDynamic("MultiAZ")(__v.asInstanceOf[js.Any]))
      PreferredMaintenanceWindow.foreach(__v => __obj.updateDynamic("PreferredMaintenanceWindow")(__v.asInstanceOf[js.Any]))
      ReplicationInstanceClass.foreach(__v => __obj.updateDynamic("ReplicationInstanceClass")(__v.asInstanceOf[js.Any]))
      ReplicationInstanceIdentifier.foreach(__v => __obj.updateDynamic("ReplicationInstanceIdentifier")(__v.asInstanceOf[js.Any]))
      VpcSecurityGroupIds.foreach(__v => __obj.updateDynamic("VpcSecurityGroupIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyReplicationInstanceMessage]
    }
  }

  /** <p/>
    */
  @js.native
  trait ModifyReplicationInstanceResponse extends js.Object {
    var ReplicationInstance: js.UndefOr[ReplicationInstance]
  }

  object ModifyReplicationInstanceResponse {
    @inline
    def apply(
        ReplicationInstance: js.UndefOr[ReplicationInstance] = js.undefined
    ): ModifyReplicationInstanceResponse = {
      val __obj = js.Dynamic.literal()
      ReplicationInstance.foreach(__v => __obj.updateDynamic("ReplicationInstance")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyReplicationInstanceResponse]
    }
  }

  /** <p/>
    */
  @js.native
  trait ModifyReplicationSubnetGroupMessage extends js.Object {
    var ReplicationSubnetGroupIdentifier: String
    var SubnetIds: SubnetIdentifierList
    var ReplicationSubnetGroupDescription: js.UndefOr[String]
  }

  object ModifyReplicationSubnetGroupMessage {
    @inline
    def apply(
        ReplicationSubnetGroupIdentifier: String,
        SubnetIds: SubnetIdentifierList,
        ReplicationSubnetGroupDescription: js.UndefOr[String] = js.undefined
    ): ModifyReplicationSubnetGroupMessage = {
      val __obj = js.Dynamic.literal(
        "ReplicationSubnetGroupIdentifier" -> ReplicationSubnetGroupIdentifier.asInstanceOf[js.Any],
        "SubnetIds" -> SubnetIds.asInstanceOf[js.Any]
      )

      ReplicationSubnetGroupDescription.foreach(__v => __obj.updateDynamic("ReplicationSubnetGroupDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyReplicationSubnetGroupMessage]
    }
  }

  /** <p/>
    */
  @js.native
  trait ModifyReplicationSubnetGroupResponse extends js.Object {
    var ReplicationSubnetGroup: js.UndefOr[ReplicationSubnetGroup]
  }

  object ModifyReplicationSubnetGroupResponse {
    @inline
    def apply(
        ReplicationSubnetGroup: js.UndefOr[ReplicationSubnetGroup] = js.undefined
    ): ModifyReplicationSubnetGroupResponse = {
      val __obj = js.Dynamic.literal()
      ReplicationSubnetGroup.foreach(__v => __obj.updateDynamic("ReplicationSubnetGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyReplicationSubnetGroupResponse]
    }
  }

  /** <p/>
    */
  @js.native
  trait ModifyReplicationTaskMessage extends js.Object {
    var ReplicationTaskArn: String
    var CdcStartPosition: js.UndefOr[String]
    var CdcStartTime: js.UndefOr[TStamp]
    var CdcStopPosition: js.UndefOr[String]
    var MigrationType: js.UndefOr[MigrationTypeValue]
    var ReplicationTaskIdentifier: js.UndefOr[String]
    var ReplicationTaskSettings: js.UndefOr[String]
    var TableMappings: js.UndefOr[String]
    var TaskData: js.UndefOr[String]
  }

  object ModifyReplicationTaskMessage {
    @inline
    def apply(
        ReplicationTaskArn: String,
        CdcStartPosition: js.UndefOr[String] = js.undefined,
        CdcStartTime: js.UndefOr[TStamp] = js.undefined,
        CdcStopPosition: js.UndefOr[String] = js.undefined,
        MigrationType: js.UndefOr[MigrationTypeValue] = js.undefined,
        ReplicationTaskIdentifier: js.UndefOr[String] = js.undefined,
        ReplicationTaskSettings: js.UndefOr[String] = js.undefined,
        TableMappings: js.UndefOr[String] = js.undefined,
        TaskData: js.UndefOr[String] = js.undefined
    ): ModifyReplicationTaskMessage = {
      val __obj = js.Dynamic.literal(
        "ReplicationTaskArn" -> ReplicationTaskArn.asInstanceOf[js.Any]
      )

      CdcStartPosition.foreach(__v => __obj.updateDynamic("CdcStartPosition")(__v.asInstanceOf[js.Any]))
      CdcStartTime.foreach(__v => __obj.updateDynamic("CdcStartTime")(__v.asInstanceOf[js.Any]))
      CdcStopPosition.foreach(__v => __obj.updateDynamic("CdcStopPosition")(__v.asInstanceOf[js.Any]))
      MigrationType.foreach(__v => __obj.updateDynamic("MigrationType")(__v.asInstanceOf[js.Any]))
      ReplicationTaskIdentifier.foreach(__v => __obj.updateDynamic("ReplicationTaskIdentifier")(__v.asInstanceOf[js.Any]))
      ReplicationTaskSettings.foreach(__v => __obj.updateDynamic("ReplicationTaskSettings")(__v.asInstanceOf[js.Any]))
      TableMappings.foreach(__v => __obj.updateDynamic("TableMappings")(__v.asInstanceOf[js.Any]))
      TaskData.foreach(__v => __obj.updateDynamic("TaskData")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyReplicationTaskMessage]
    }
  }

  /** <p/>
    */
  @js.native
  trait ModifyReplicationTaskResponse extends js.Object {
    var ReplicationTask: js.UndefOr[ReplicationTask]
  }

  object ModifyReplicationTaskResponse {
    @inline
    def apply(
        ReplicationTask: js.UndefOr[ReplicationTask] = js.undefined
    ): ModifyReplicationTaskResponse = {
      val __obj = js.Dynamic.literal()
      ReplicationTask.foreach(__v => __obj.updateDynamic("ReplicationTask")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyReplicationTaskResponse]
    }
  }

  /** Provides information that defines a MongoDB endpoint.
    */
  @js.native
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

  object MongoDbSettings {
    @inline
    def apply(
        AuthMechanism: js.UndefOr[AuthMechanismValue] = js.undefined,
        AuthSource: js.UndefOr[String] = js.undefined,
        AuthType: js.UndefOr[AuthTypeValue] = js.undefined,
        DatabaseName: js.UndefOr[String] = js.undefined,
        DocsToInvestigate: js.UndefOr[String] = js.undefined,
        ExtractDocId: js.UndefOr[String] = js.undefined,
        KmsKeyId: js.UndefOr[String] = js.undefined,
        NestingLevel: js.UndefOr[NestingLevelValue] = js.undefined,
        Password: js.UndefOr[SecretString] = js.undefined,
        Port: js.UndefOr[IntegerOptional] = js.undefined,
        ServerName: js.UndefOr[String] = js.undefined,
        Username: js.UndefOr[String] = js.undefined
    ): MongoDbSettings = {
      val __obj = js.Dynamic.literal()
      AuthMechanism.foreach(__v => __obj.updateDynamic("AuthMechanism")(__v.asInstanceOf[js.Any]))
      AuthSource.foreach(__v => __obj.updateDynamic("AuthSource")(__v.asInstanceOf[js.Any]))
      AuthType.foreach(__v => __obj.updateDynamic("AuthType")(__v.asInstanceOf[js.Any]))
      DatabaseName.foreach(__v => __obj.updateDynamic("DatabaseName")(__v.asInstanceOf[js.Any]))
      DocsToInvestigate.foreach(__v => __obj.updateDynamic("DocsToInvestigate")(__v.asInstanceOf[js.Any]))
      ExtractDocId.foreach(__v => __obj.updateDynamic("ExtractDocId")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      NestingLevel.foreach(__v => __obj.updateDynamic("NestingLevel")(__v.asInstanceOf[js.Any]))
      Password.foreach(__v => __obj.updateDynamic("Password")(__v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      ServerName.foreach(__v => __obj.updateDynamic("ServerName")(__v.asInstanceOf[js.Any]))
      Username.foreach(__v => __obj.updateDynamic("Username")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MongoDbSettings]
    }
  }

  /** <p/>
    */
  @js.native
  trait MoveReplicationTaskMessage extends js.Object {
    var ReplicationTaskArn: String
    var TargetReplicationInstanceArn: String
  }

  object MoveReplicationTaskMessage {
    @inline
    def apply(
        ReplicationTaskArn: String,
        TargetReplicationInstanceArn: String
    ): MoveReplicationTaskMessage = {
      val __obj = js.Dynamic.literal(
        "ReplicationTaskArn" -> ReplicationTaskArn.asInstanceOf[js.Any],
        "TargetReplicationInstanceArn" -> TargetReplicationInstanceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[MoveReplicationTaskMessage]
    }
  }

  /** <p/>
    */
  @js.native
  trait MoveReplicationTaskResponse extends js.Object {
    var ReplicationTask: js.UndefOr[ReplicationTask]
  }

  object MoveReplicationTaskResponse {
    @inline
    def apply(
        ReplicationTask: js.UndefOr[ReplicationTask] = js.undefined
    ): MoveReplicationTaskResponse = {
      val __obj = js.Dynamic.literal()
      ReplicationTask.foreach(__v => __obj.updateDynamic("ReplicationTask")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MoveReplicationTaskResponse]
    }
  }

  /** Provides information that defines a MySQL endpoint.
    */
  @js.native
  trait MySQLSettings extends js.Object {
    var AfterConnectScript: js.UndefOr[String]
    var DatabaseName: js.UndefOr[String]
    var EventsPollInterval: js.UndefOr[IntegerOptional]
    var MaxFileSize: js.UndefOr[IntegerOptional]
    var ParallelLoadThreads: js.UndefOr[IntegerOptional]
    var Password: js.UndefOr[SecretString]
    var Port: js.UndefOr[IntegerOptional]
    var ServerName: js.UndefOr[String]
    var ServerTimezone: js.UndefOr[String]
    var TargetDbType: js.UndefOr[TargetDbType]
    var Username: js.UndefOr[String]
  }

  object MySQLSettings {
    @inline
    def apply(
        AfterConnectScript: js.UndefOr[String] = js.undefined,
        DatabaseName: js.UndefOr[String] = js.undefined,
        EventsPollInterval: js.UndefOr[IntegerOptional] = js.undefined,
        MaxFileSize: js.UndefOr[IntegerOptional] = js.undefined,
        ParallelLoadThreads: js.UndefOr[IntegerOptional] = js.undefined,
        Password: js.UndefOr[SecretString] = js.undefined,
        Port: js.UndefOr[IntegerOptional] = js.undefined,
        ServerName: js.UndefOr[String] = js.undefined,
        ServerTimezone: js.UndefOr[String] = js.undefined,
        TargetDbType: js.UndefOr[TargetDbType] = js.undefined,
        Username: js.UndefOr[String] = js.undefined
    ): MySQLSettings = {
      val __obj = js.Dynamic.literal()
      AfterConnectScript.foreach(__v => __obj.updateDynamic("AfterConnectScript")(__v.asInstanceOf[js.Any]))
      DatabaseName.foreach(__v => __obj.updateDynamic("DatabaseName")(__v.asInstanceOf[js.Any]))
      EventsPollInterval.foreach(__v => __obj.updateDynamic("EventsPollInterval")(__v.asInstanceOf[js.Any]))
      MaxFileSize.foreach(__v => __obj.updateDynamic("MaxFileSize")(__v.asInstanceOf[js.Any]))
      ParallelLoadThreads.foreach(__v => __obj.updateDynamic("ParallelLoadThreads")(__v.asInstanceOf[js.Any]))
      Password.foreach(__v => __obj.updateDynamic("Password")(__v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      ServerName.foreach(__v => __obj.updateDynamic("ServerName")(__v.asInstanceOf[js.Any]))
      ServerTimezone.foreach(__v => __obj.updateDynamic("ServerTimezone")(__v.asInstanceOf[js.Any]))
      TargetDbType.foreach(__v => __obj.updateDynamic("TargetDbType")(__v.asInstanceOf[js.Any]))
      Username.foreach(__v => __obj.updateDynamic("Username")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MySQLSettings]
    }
  }

  /** Provides information that defines an Amazon Neptune endpoint.
    */
  @js.native
  trait NeptuneSettings extends js.Object {
    var S3BucketFolder: String
    var S3BucketName: String
    var ErrorRetryDuration: js.UndefOr[IntegerOptional]
    var IamAuthEnabled: js.UndefOr[BooleanOptional]
    var MaxFileSize: js.UndefOr[IntegerOptional]
    var MaxRetryCount: js.UndefOr[IntegerOptional]
    var ServiceAccessRoleArn: js.UndefOr[String]
  }

  object NeptuneSettings {
    @inline
    def apply(
        S3BucketFolder: String,
        S3BucketName: String,
        ErrorRetryDuration: js.UndefOr[IntegerOptional] = js.undefined,
        IamAuthEnabled: js.UndefOr[BooleanOptional] = js.undefined,
        MaxFileSize: js.UndefOr[IntegerOptional] = js.undefined,
        MaxRetryCount: js.UndefOr[IntegerOptional] = js.undefined,
        ServiceAccessRoleArn: js.UndefOr[String] = js.undefined
    ): NeptuneSettings = {
      val __obj = js.Dynamic.literal(
        "S3BucketFolder" -> S3BucketFolder.asInstanceOf[js.Any],
        "S3BucketName" -> S3BucketName.asInstanceOf[js.Any]
      )

      ErrorRetryDuration.foreach(__v => __obj.updateDynamic("ErrorRetryDuration")(__v.asInstanceOf[js.Any]))
      IamAuthEnabled.foreach(__v => __obj.updateDynamic("IamAuthEnabled")(__v.asInstanceOf[js.Any]))
      MaxFileSize.foreach(__v => __obj.updateDynamic("MaxFileSize")(__v.asInstanceOf[js.Any]))
      MaxRetryCount.foreach(__v => __obj.updateDynamic("MaxRetryCount")(__v.asInstanceOf[js.Any]))
      ServiceAccessRoleArn.foreach(__v => __obj.updateDynamic("ServiceAccessRoleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NeptuneSettings]
    }
  }

  @js.native
  sealed trait NestingLevelValue extends js.Any
  object NestingLevelValue {
    val none = "none".asInstanceOf[NestingLevelValue]
    val one = "one".asInstanceOf[NestingLevelValue]

    @inline def values = js.Array(none, one)
  }

  /** Provides information that defines an Oracle endpoint.
    */
  @js.native
  trait OracleSettings extends js.Object {
    var AccessAlternateDirectly: js.UndefOr[BooleanOptional]
    var AddSupplementalLogging: js.UndefOr[BooleanOptional]
    var AdditionalArchivedLogDestId: js.UndefOr[IntegerOptional]
    var AllowSelectNestedTables: js.UndefOr[BooleanOptional]
    var ArchivedLogDestId: js.UndefOr[IntegerOptional]
    var ArchivedLogsOnly: js.UndefOr[BooleanOptional]
    var AsmPassword: js.UndefOr[SecretString]
    var AsmServer: js.UndefOr[String]
    var AsmUser: js.UndefOr[String]
    var CharLengthSemantics: js.UndefOr[CharLengthSemantics]
    var DatabaseName: js.UndefOr[String]
    var DirectPathNoLog: js.UndefOr[BooleanOptional]
    var DirectPathParallelLoad: js.UndefOr[BooleanOptional]
    var EnableHomogenousTablespace: js.UndefOr[BooleanOptional]
    var FailTasksOnLobTruncation: js.UndefOr[BooleanOptional]
    var NumberDatatypeScale: js.UndefOr[IntegerOptional]
    var OraclePathPrefix: js.UndefOr[String]
    var ParallelAsmReadThreads: js.UndefOr[IntegerOptional]
    var Password: js.UndefOr[SecretString]
    var Port: js.UndefOr[IntegerOptional]
    var ReadAheadBlocks: js.UndefOr[IntegerOptional]
    var ReadTableSpaceName: js.UndefOr[BooleanOptional]
    var ReplacePathPrefix: js.UndefOr[BooleanOptional]
    var RetryInterval: js.UndefOr[IntegerOptional]
    var SecurityDbEncryption: js.UndefOr[SecretString]
    var SecurityDbEncryptionName: js.UndefOr[String]
    var ServerName: js.UndefOr[String]
    var UseAlternateFolderForOnline: js.UndefOr[BooleanOptional]
    var UsePathPrefix: js.UndefOr[String]
    var Username: js.UndefOr[String]
  }

  object OracleSettings {
    @inline
    def apply(
        AccessAlternateDirectly: js.UndefOr[BooleanOptional] = js.undefined,
        AddSupplementalLogging: js.UndefOr[BooleanOptional] = js.undefined,
        AdditionalArchivedLogDestId: js.UndefOr[IntegerOptional] = js.undefined,
        AllowSelectNestedTables: js.UndefOr[BooleanOptional] = js.undefined,
        ArchivedLogDestId: js.UndefOr[IntegerOptional] = js.undefined,
        ArchivedLogsOnly: js.UndefOr[BooleanOptional] = js.undefined,
        AsmPassword: js.UndefOr[SecretString] = js.undefined,
        AsmServer: js.UndefOr[String] = js.undefined,
        AsmUser: js.UndefOr[String] = js.undefined,
        CharLengthSemantics: js.UndefOr[CharLengthSemantics] = js.undefined,
        DatabaseName: js.UndefOr[String] = js.undefined,
        DirectPathNoLog: js.UndefOr[BooleanOptional] = js.undefined,
        DirectPathParallelLoad: js.UndefOr[BooleanOptional] = js.undefined,
        EnableHomogenousTablespace: js.UndefOr[BooleanOptional] = js.undefined,
        FailTasksOnLobTruncation: js.UndefOr[BooleanOptional] = js.undefined,
        NumberDatatypeScale: js.UndefOr[IntegerOptional] = js.undefined,
        OraclePathPrefix: js.UndefOr[String] = js.undefined,
        ParallelAsmReadThreads: js.UndefOr[IntegerOptional] = js.undefined,
        Password: js.UndefOr[SecretString] = js.undefined,
        Port: js.UndefOr[IntegerOptional] = js.undefined,
        ReadAheadBlocks: js.UndefOr[IntegerOptional] = js.undefined,
        ReadTableSpaceName: js.UndefOr[BooleanOptional] = js.undefined,
        ReplacePathPrefix: js.UndefOr[BooleanOptional] = js.undefined,
        RetryInterval: js.UndefOr[IntegerOptional] = js.undefined,
        SecurityDbEncryption: js.UndefOr[SecretString] = js.undefined,
        SecurityDbEncryptionName: js.UndefOr[String] = js.undefined,
        ServerName: js.UndefOr[String] = js.undefined,
        UseAlternateFolderForOnline: js.UndefOr[BooleanOptional] = js.undefined,
        UsePathPrefix: js.UndefOr[String] = js.undefined,
        Username: js.UndefOr[String] = js.undefined
    ): OracleSettings = {
      val __obj = js.Dynamic.literal()
      AccessAlternateDirectly.foreach(__v => __obj.updateDynamic("AccessAlternateDirectly")(__v.asInstanceOf[js.Any]))
      AddSupplementalLogging.foreach(__v => __obj.updateDynamic("AddSupplementalLogging")(__v.asInstanceOf[js.Any]))
      AdditionalArchivedLogDestId.foreach(__v => __obj.updateDynamic("AdditionalArchivedLogDestId")(__v.asInstanceOf[js.Any]))
      AllowSelectNestedTables.foreach(__v => __obj.updateDynamic("AllowSelectNestedTables")(__v.asInstanceOf[js.Any]))
      ArchivedLogDestId.foreach(__v => __obj.updateDynamic("ArchivedLogDestId")(__v.asInstanceOf[js.Any]))
      ArchivedLogsOnly.foreach(__v => __obj.updateDynamic("ArchivedLogsOnly")(__v.asInstanceOf[js.Any]))
      AsmPassword.foreach(__v => __obj.updateDynamic("AsmPassword")(__v.asInstanceOf[js.Any]))
      AsmServer.foreach(__v => __obj.updateDynamic("AsmServer")(__v.asInstanceOf[js.Any]))
      AsmUser.foreach(__v => __obj.updateDynamic("AsmUser")(__v.asInstanceOf[js.Any]))
      CharLengthSemantics.foreach(__v => __obj.updateDynamic("CharLengthSemantics")(__v.asInstanceOf[js.Any]))
      DatabaseName.foreach(__v => __obj.updateDynamic("DatabaseName")(__v.asInstanceOf[js.Any]))
      DirectPathNoLog.foreach(__v => __obj.updateDynamic("DirectPathNoLog")(__v.asInstanceOf[js.Any]))
      DirectPathParallelLoad.foreach(__v => __obj.updateDynamic("DirectPathParallelLoad")(__v.asInstanceOf[js.Any]))
      EnableHomogenousTablespace.foreach(__v => __obj.updateDynamic("EnableHomogenousTablespace")(__v.asInstanceOf[js.Any]))
      FailTasksOnLobTruncation.foreach(__v => __obj.updateDynamic("FailTasksOnLobTruncation")(__v.asInstanceOf[js.Any]))
      NumberDatatypeScale.foreach(__v => __obj.updateDynamic("NumberDatatypeScale")(__v.asInstanceOf[js.Any]))
      OraclePathPrefix.foreach(__v => __obj.updateDynamic("OraclePathPrefix")(__v.asInstanceOf[js.Any]))
      ParallelAsmReadThreads.foreach(__v => __obj.updateDynamic("ParallelAsmReadThreads")(__v.asInstanceOf[js.Any]))
      Password.foreach(__v => __obj.updateDynamic("Password")(__v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      ReadAheadBlocks.foreach(__v => __obj.updateDynamic("ReadAheadBlocks")(__v.asInstanceOf[js.Any]))
      ReadTableSpaceName.foreach(__v => __obj.updateDynamic("ReadTableSpaceName")(__v.asInstanceOf[js.Any]))
      ReplacePathPrefix.foreach(__v => __obj.updateDynamic("ReplacePathPrefix")(__v.asInstanceOf[js.Any]))
      RetryInterval.foreach(__v => __obj.updateDynamic("RetryInterval")(__v.asInstanceOf[js.Any]))
      SecurityDbEncryption.foreach(__v => __obj.updateDynamic("SecurityDbEncryption")(__v.asInstanceOf[js.Any]))
      SecurityDbEncryptionName.foreach(__v => __obj.updateDynamic("SecurityDbEncryptionName")(__v.asInstanceOf[js.Any]))
      ServerName.foreach(__v => __obj.updateDynamic("ServerName")(__v.asInstanceOf[js.Any]))
      UseAlternateFolderForOnline.foreach(__v => __obj.updateDynamic("UseAlternateFolderForOnline")(__v.asInstanceOf[js.Any]))
      UsePathPrefix.foreach(__v => __obj.updateDynamic("UsePathPrefix")(__v.asInstanceOf[js.Any]))
      Username.foreach(__v => __obj.updateDynamic("Username")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OracleSettings]
    }
  }

  /** In response to the <code>DescribeOrderableReplicationInstances</code> operation, this object describes an available replication instance. This description includes the replication instance's type, engine version, and allocated storage.
    */
  @js.native
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

  object OrderableReplicationInstance {
    @inline
    def apply(
        AvailabilityZones: js.UndefOr[AvailabilityZonesList] = js.undefined,
        DefaultAllocatedStorage: js.UndefOr[Int] = js.undefined,
        EngineVersion: js.UndefOr[String] = js.undefined,
        IncludedAllocatedStorage: js.UndefOr[Int] = js.undefined,
        MaxAllocatedStorage: js.UndefOr[Int] = js.undefined,
        MinAllocatedStorage: js.UndefOr[Int] = js.undefined,
        ReleaseStatus: js.UndefOr[ReleaseStatusValues] = js.undefined,
        ReplicationInstanceClass: js.UndefOr[String] = js.undefined,
        StorageType: js.UndefOr[String] = js.undefined
    ): OrderableReplicationInstance = {
      val __obj = js.Dynamic.literal()
      AvailabilityZones.foreach(__v => __obj.updateDynamic("AvailabilityZones")(__v.asInstanceOf[js.Any]))
      DefaultAllocatedStorage.foreach(__v => __obj.updateDynamic("DefaultAllocatedStorage")(__v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
      IncludedAllocatedStorage.foreach(__v => __obj.updateDynamic("IncludedAllocatedStorage")(__v.asInstanceOf[js.Any]))
      MaxAllocatedStorage.foreach(__v => __obj.updateDynamic("MaxAllocatedStorage")(__v.asInstanceOf[js.Any]))
      MinAllocatedStorage.foreach(__v => __obj.updateDynamic("MinAllocatedStorage")(__v.asInstanceOf[js.Any]))
      ReleaseStatus.foreach(__v => __obj.updateDynamic("ReleaseStatus")(__v.asInstanceOf[js.Any]))
      ReplicationInstanceClass.foreach(__v => __obj.updateDynamic("ReplicationInstanceClass")(__v.asInstanceOf[js.Any]))
      StorageType.foreach(__v => __obj.updateDynamic("StorageType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OrderableReplicationInstance]
    }
  }

  @js.native
  sealed trait ParquetVersionValue extends js.Any
  object ParquetVersionValue {
    val `parquet-1-0` = "parquet-1-0".asInstanceOf[ParquetVersionValue]
    val `parquet-2-0` = "parquet-2-0".asInstanceOf[ParquetVersionValue]

    @inline def values = js.Array(`parquet-1-0`, `parquet-2-0`)
  }

  /** Describes a maintenance action pending for an AWS DMS resource, including when and how it will be applied. This data type is a response element to the <code>DescribePendingMaintenanceActions</code> operation.
    */
  @js.native
  trait PendingMaintenanceAction extends js.Object {
    var Action: js.UndefOr[String]
    var AutoAppliedAfterDate: js.UndefOr[TStamp]
    var CurrentApplyDate: js.UndefOr[TStamp]
    var Description: js.UndefOr[String]
    var ForcedApplyDate: js.UndefOr[TStamp]
    var OptInStatus: js.UndefOr[String]
  }

  object PendingMaintenanceAction {
    @inline
    def apply(
        Action: js.UndefOr[String] = js.undefined,
        AutoAppliedAfterDate: js.UndefOr[TStamp] = js.undefined,
        CurrentApplyDate: js.UndefOr[TStamp] = js.undefined,
        Description: js.UndefOr[String] = js.undefined,
        ForcedApplyDate: js.UndefOr[TStamp] = js.undefined,
        OptInStatus: js.UndefOr[String] = js.undefined
    ): PendingMaintenanceAction = {
      val __obj = js.Dynamic.literal()
      Action.foreach(__v => __obj.updateDynamic("Action")(__v.asInstanceOf[js.Any]))
      AutoAppliedAfterDate.foreach(__v => __obj.updateDynamic("AutoAppliedAfterDate")(__v.asInstanceOf[js.Any]))
      CurrentApplyDate.foreach(__v => __obj.updateDynamic("CurrentApplyDate")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      ForcedApplyDate.foreach(__v => __obj.updateDynamic("ForcedApplyDate")(__v.asInstanceOf[js.Any]))
      OptInStatus.foreach(__v => __obj.updateDynamic("OptInStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PendingMaintenanceAction]
    }
  }

  /** Provides information that defines a PostgreSQL endpoint.
    */
  @js.native
  trait PostgreSQLSettings extends js.Object {
    var AfterConnectScript: js.UndefOr[String]
    var CaptureDdls: js.UndefOr[BooleanOptional]
    var DatabaseName: js.UndefOr[String]
    var DdlArtifactsSchema: js.UndefOr[String]
    var ExecuteTimeout: js.UndefOr[IntegerOptional]
    var FailTasksOnLobTruncation: js.UndefOr[BooleanOptional]
    var MaxFileSize: js.UndefOr[IntegerOptional]
    var Password: js.UndefOr[SecretString]
    var Port: js.UndefOr[IntegerOptional]
    var ServerName: js.UndefOr[String]
    var SlotName: js.UndefOr[String]
    var Username: js.UndefOr[String]
  }

  object PostgreSQLSettings {
    @inline
    def apply(
        AfterConnectScript: js.UndefOr[String] = js.undefined,
        CaptureDdls: js.UndefOr[BooleanOptional] = js.undefined,
        DatabaseName: js.UndefOr[String] = js.undefined,
        DdlArtifactsSchema: js.UndefOr[String] = js.undefined,
        ExecuteTimeout: js.UndefOr[IntegerOptional] = js.undefined,
        FailTasksOnLobTruncation: js.UndefOr[BooleanOptional] = js.undefined,
        MaxFileSize: js.UndefOr[IntegerOptional] = js.undefined,
        Password: js.UndefOr[SecretString] = js.undefined,
        Port: js.UndefOr[IntegerOptional] = js.undefined,
        ServerName: js.UndefOr[String] = js.undefined,
        SlotName: js.UndefOr[String] = js.undefined,
        Username: js.UndefOr[String] = js.undefined
    ): PostgreSQLSettings = {
      val __obj = js.Dynamic.literal()
      AfterConnectScript.foreach(__v => __obj.updateDynamic("AfterConnectScript")(__v.asInstanceOf[js.Any]))
      CaptureDdls.foreach(__v => __obj.updateDynamic("CaptureDdls")(__v.asInstanceOf[js.Any]))
      DatabaseName.foreach(__v => __obj.updateDynamic("DatabaseName")(__v.asInstanceOf[js.Any]))
      DdlArtifactsSchema.foreach(__v => __obj.updateDynamic("DdlArtifactsSchema")(__v.asInstanceOf[js.Any]))
      ExecuteTimeout.foreach(__v => __obj.updateDynamic("ExecuteTimeout")(__v.asInstanceOf[js.Any]))
      FailTasksOnLobTruncation.foreach(__v => __obj.updateDynamic("FailTasksOnLobTruncation")(__v.asInstanceOf[js.Any]))
      MaxFileSize.foreach(__v => __obj.updateDynamic("MaxFileSize")(__v.asInstanceOf[js.Any]))
      Password.foreach(__v => __obj.updateDynamic("Password")(__v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      ServerName.foreach(__v => __obj.updateDynamic("ServerName")(__v.asInstanceOf[js.Any]))
      SlotName.foreach(__v => __obj.updateDynamic("SlotName")(__v.asInstanceOf[js.Any]))
      Username.foreach(__v => __obj.updateDynamic("Username")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PostgreSQLSettings]
    }
  }

  @js.native
  trait RebootReplicationInstanceMessage extends js.Object {
    var ReplicationInstanceArn: String
    var ForceFailover: js.UndefOr[BooleanOptional]
  }

  object RebootReplicationInstanceMessage {
    @inline
    def apply(
        ReplicationInstanceArn: String,
        ForceFailover: js.UndefOr[BooleanOptional] = js.undefined
    ): RebootReplicationInstanceMessage = {
      val __obj = js.Dynamic.literal(
        "ReplicationInstanceArn" -> ReplicationInstanceArn.asInstanceOf[js.Any]
      )

      ForceFailover.foreach(__v => __obj.updateDynamic("ForceFailover")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RebootReplicationInstanceMessage]
    }
  }

  @js.native
  trait RebootReplicationInstanceResponse extends js.Object {
    var ReplicationInstance: js.UndefOr[ReplicationInstance]
  }

  object RebootReplicationInstanceResponse {
    @inline
    def apply(
        ReplicationInstance: js.UndefOr[ReplicationInstance] = js.undefined
    ): RebootReplicationInstanceResponse = {
      val __obj = js.Dynamic.literal()
      ReplicationInstance.foreach(__v => __obj.updateDynamic("ReplicationInstance")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RebootReplicationInstanceResponse]
    }
  }

  /** Provides information that defines an Amazon Redshift endpoint.
    */
  @js.native
  trait RedshiftSettings extends js.Object {
    var AcceptAnyDate: js.UndefOr[BooleanOptional]
    var AfterConnectScript: js.UndefOr[String]
    var BucketFolder: js.UndefOr[String]
    var BucketName: js.UndefOr[String]
    var CaseSensitiveNames: js.UndefOr[BooleanOptional]
    var CompUpdate: js.UndefOr[BooleanOptional]
    var ConnectionTimeout: js.UndefOr[IntegerOptional]
    var DatabaseName: js.UndefOr[String]
    var DateFormat: js.UndefOr[String]
    var EmptyAsNull: js.UndefOr[BooleanOptional]
    var EncryptionMode: js.UndefOr[EncryptionModeValue]
    var ExplicitIds: js.UndefOr[BooleanOptional]
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

  object RedshiftSettings {
    @inline
    def apply(
        AcceptAnyDate: js.UndefOr[BooleanOptional] = js.undefined,
        AfterConnectScript: js.UndefOr[String] = js.undefined,
        BucketFolder: js.UndefOr[String] = js.undefined,
        BucketName: js.UndefOr[String] = js.undefined,
        CaseSensitiveNames: js.UndefOr[BooleanOptional] = js.undefined,
        CompUpdate: js.UndefOr[BooleanOptional] = js.undefined,
        ConnectionTimeout: js.UndefOr[IntegerOptional] = js.undefined,
        DatabaseName: js.UndefOr[String] = js.undefined,
        DateFormat: js.UndefOr[String] = js.undefined,
        EmptyAsNull: js.UndefOr[BooleanOptional] = js.undefined,
        EncryptionMode: js.UndefOr[EncryptionModeValue] = js.undefined,
        ExplicitIds: js.UndefOr[BooleanOptional] = js.undefined,
        FileTransferUploadStreams: js.UndefOr[IntegerOptional] = js.undefined,
        LoadTimeout: js.UndefOr[IntegerOptional] = js.undefined,
        MaxFileSize: js.UndefOr[IntegerOptional] = js.undefined,
        Password: js.UndefOr[SecretString] = js.undefined,
        Port: js.UndefOr[IntegerOptional] = js.undefined,
        RemoveQuotes: js.UndefOr[BooleanOptional] = js.undefined,
        ReplaceChars: js.UndefOr[String] = js.undefined,
        ReplaceInvalidChars: js.UndefOr[String] = js.undefined,
        ServerName: js.UndefOr[String] = js.undefined,
        ServerSideEncryptionKmsKeyId: js.UndefOr[String] = js.undefined,
        ServiceAccessRoleArn: js.UndefOr[String] = js.undefined,
        TimeFormat: js.UndefOr[String] = js.undefined,
        TrimBlanks: js.UndefOr[BooleanOptional] = js.undefined,
        TruncateColumns: js.UndefOr[BooleanOptional] = js.undefined,
        Username: js.UndefOr[String] = js.undefined,
        WriteBufferSize: js.UndefOr[IntegerOptional] = js.undefined
    ): RedshiftSettings = {
      val __obj = js.Dynamic.literal()
      AcceptAnyDate.foreach(__v => __obj.updateDynamic("AcceptAnyDate")(__v.asInstanceOf[js.Any]))
      AfterConnectScript.foreach(__v => __obj.updateDynamic("AfterConnectScript")(__v.asInstanceOf[js.Any]))
      BucketFolder.foreach(__v => __obj.updateDynamic("BucketFolder")(__v.asInstanceOf[js.Any]))
      BucketName.foreach(__v => __obj.updateDynamic("BucketName")(__v.asInstanceOf[js.Any]))
      CaseSensitiveNames.foreach(__v => __obj.updateDynamic("CaseSensitiveNames")(__v.asInstanceOf[js.Any]))
      CompUpdate.foreach(__v => __obj.updateDynamic("CompUpdate")(__v.asInstanceOf[js.Any]))
      ConnectionTimeout.foreach(__v => __obj.updateDynamic("ConnectionTimeout")(__v.asInstanceOf[js.Any]))
      DatabaseName.foreach(__v => __obj.updateDynamic("DatabaseName")(__v.asInstanceOf[js.Any]))
      DateFormat.foreach(__v => __obj.updateDynamic("DateFormat")(__v.asInstanceOf[js.Any]))
      EmptyAsNull.foreach(__v => __obj.updateDynamic("EmptyAsNull")(__v.asInstanceOf[js.Any]))
      EncryptionMode.foreach(__v => __obj.updateDynamic("EncryptionMode")(__v.asInstanceOf[js.Any]))
      ExplicitIds.foreach(__v => __obj.updateDynamic("ExplicitIds")(__v.asInstanceOf[js.Any]))
      FileTransferUploadStreams.foreach(__v => __obj.updateDynamic("FileTransferUploadStreams")(__v.asInstanceOf[js.Any]))
      LoadTimeout.foreach(__v => __obj.updateDynamic("LoadTimeout")(__v.asInstanceOf[js.Any]))
      MaxFileSize.foreach(__v => __obj.updateDynamic("MaxFileSize")(__v.asInstanceOf[js.Any]))
      Password.foreach(__v => __obj.updateDynamic("Password")(__v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      RemoveQuotes.foreach(__v => __obj.updateDynamic("RemoveQuotes")(__v.asInstanceOf[js.Any]))
      ReplaceChars.foreach(__v => __obj.updateDynamic("ReplaceChars")(__v.asInstanceOf[js.Any]))
      ReplaceInvalidChars.foreach(__v => __obj.updateDynamic("ReplaceInvalidChars")(__v.asInstanceOf[js.Any]))
      ServerName.foreach(__v => __obj.updateDynamic("ServerName")(__v.asInstanceOf[js.Any]))
      ServerSideEncryptionKmsKeyId.foreach(__v => __obj.updateDynamic("ServerSideEncryptionKmsKeyId")(__v.asInstanceOf[js.Any]))
      ServiceAccessRoleArn.foreach(__v => __obj.updateDynamic("ServiceAccessRoleArn")(__v.asInstanceOf[js.Any]))
      TimeFormat.foreach(__v => __obj.updateDynamic("TimeFormat")(__v.asInstanceOf[js.Any]))
      TrimBlanks.foreach(__v => __obj.updateDynamic("TrimBlanks")(__v.asInstanceOf[js.Any]))
      TruncateColumns.foreach(__v => __obj.updateDynamic("TruncateColumns")(__v.asInstanceOf[js.Any]))
      Username.foreach(__v => __obj.updateDynamic("Username")(__v.asInstanceOf[js.Any]))
      WriteBufferSize.foreach(__v => __obj.updateDynamic("WriteBufferSize")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RedshiftSettings]
    }
  }

  /** <p/>
    */
  @js.native
  trait RefreshSchemasMessage extends js.Object {
    var EndpointArn: String
    var ReplicationInstanceArn: String
  }

  object RefreshSchemasMessage {
    @inline
    def apply(
        EndpointArn: String,
        ReplicationInstanceArn: String
    ): RefreshSchemasMessage = {
      val __obj = js.Dynamic.literal(
        "EndpointArn" -> EndpointArn.asInstanceOf[js.Any],
        "ReplicationInstanceArn" -> ReplicationInstanceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RefreshSchemasMessage]
    }
  }

  /** <p/>
    */
  @js.native
  trait RefreshSchemasResponse extends js.Object {
    var RefreshSchemasStatus: js.UndefOr[RefreshSchemasStatus]
  }

  object RefreshSchemasResponse {
    @inline
    def apply(
        RefreshSchemasStatus: js.UndefOr[RefreshSchemasStatus] = js.undefined
    ): RefreshSchemasResponse = {
      val __obj = js.Dynamic.literal()
      RefreshSchemasStatus.foreach(__v => __obj.updateDynamic("RefreshSchemasStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RefreshSchemasResponse]
    }
  }

  /** Provides information that describes status of a schema at an endpoint specified by the <code>DescribeRefreshSchemaStatus</code> operation.
    */
  @js.native
  trait RefreshSchemasStatus extends js.Object {
    var EndpointArn: js.UndefOr[String]
    var LastFailureMessage: js.UndefOr[String]
    var LastRefreshDate: js.UndefOr[TStamp]
    var ReplicationInstanceArn: js.UndefOr[String]
    var Status: js.UndefOr[RefreshSchemasStatusTypeValue]
  }

  object RefreshSchemasStatus {
    @inline
    def apply(
        EndpointArn: js.UndefOr[String] = js.undefined,
        LastFailureMessage: js.UndefOr[String] = js.undefined,
        LastRefreshDate: js.UndefOr[TStamp] = js.undefined,
        ReplicationInstanceArn: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[RefreshSchemasStatusTypeValue] = js.undefined
    ): RefreshSchemasStatus = {
      val __obj = js.Dynamic.literal()
      EndpointArn.foreach(__v => __obj.updateDynamic("EndpointArn")(__v.asInstanceOf[js.Any]))
      LastFailureMessage.foreach(__v => __obj.updateDynamic("LastFailureMessage")(__v.asInstanceOf[js.Any]))
      LastRefreshDate.foreach(__v => __obj.updateDynamic("LastRefreshDate")(__v.asInstanceOf[js.Any]))
      ReplicationInstanceArn.foreach(__v => __obj.updateDynamic("ReplicationInstanceArn")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RefreshSchemasStatus]
    }
  }

  @js.native
  sealed trait RefreshSchemasStatusTypeValue extends js.Any
  object RefreshSchemasStatusTypeValue {
    val successful = "successful".asInstanceOf[RefreshSchemasStatusTypeValue]
    val failed = "failed".asInstanceOf[RefreshSchemasStatusTypeValue]
    val refreshing = "refreshing".asInstanceOf[RefreshSchemasStatusTypeValue]

    @inline def values = js.Array(successful, failed, refreshing)
  }

  @js.native
  sealed trait ReleaseStatusValues extends js.Any
  object ReleaseStatusValues {
    val beta = "beta".asInstanceOf[ReleaseStatusValues]

    @inline def values = js.Array(beta)
  }

  @js.native
  sealed trait ReloadOptionValue extends js.Any
  object ReloadOptionValue {
    val `data-reload` = "data-reload".asInstanceOf[ReloadOptionValue]
    val `validate-only` = "validate-only".asInstanceOf[ReloadOptionValue]

    @inline def values = js.Array(`data-reload`, `validate-only`)
  }

  @js.native
  trait ReloadTablesMessage extends js.Object {
    var ReplicationTaskArn: String
    var TablesToReload: TableListToReload
    var ReloadOption: js.UndefOr[ReloadOptionValue]
  }

  object ReloadTablesMessage {
    @inline
    def apply(
        ReplicationTaskArn: String,
        TablesToReload: TableListToReload,
        ReloadOption: js.UndefOr[ReloadOptionValue] = js.undefined
    ): ReloadTablesMessage = {
      val __obj = js.Dynamic.literal(
        "ReplicationTaskArn" -> ReplicationTaskArn.asInstanceOf[js.Any],
        "TablesToReload" -> TablesToReload.asInstanceOf[js.Any]
      )

      ReloadOption.foreach(__v => __obj.updateDynamic("ReloadOption")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReloadTablesMessage]
    }
  }

  @js.native
  trait ReloadTablesResponse extends js.Object {
    var ReplicationTaskArn: js.UndefOr[String]
  }

  object ReloadTablesResponse {
    @inline
    def apply(
        ReplicationTaskArn: js.UndefOr[String] = js.undefined
    ): ReloadTablesResponse = {
      val __obj = js.Dynamic.literal()
      ReplicationTaskArn.foreach(__v => __obj.updateDynamic("ReplicationTaskArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReloadTablesResponse]
    }
  }

  /** Removes one or more tags from an AWS DMS resource.
    */
  @js.native
  trait RemoveTagsFromResourceMessage extends js.Object {
    var ResourceArn: String
    var TagKeys: KeyList
  }

  object RemoveTagsFromResourceMessage {
    @inline
    def apply(
        ResourceArn: String,
        TagKeys: KeyList
    ): RemoveTagsFromResourceMessage = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RemoveTagsFromResourceMessage]
    }
  }

  /** <p/>
    */
  @js.native
  trait RemoveTagsFromResourceResponse extends js.Object

  object RemoveTagsFromResourceResponse {
    @inline
    def apply(): RemoveTagsFromResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RemoveTagsFromResourceResponse]
    }
  }

  @js.native
  sealed trait ReplicationEndpointTypeValue extends js.Any
  object ReplicationEndpointTypeValue {
    val source = "source".asInstanceOf[ReplicationEndpointTypeValue]
    val target = "target".asInstanceOf[ReplicationEndpointTypeValue]

    @inline def values = js.Array(source, target)
  }

  /** Provides information that defines a replication instance.
    */
  @js.native
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

  object ReplicationInstance {
    @inline
    def apply(
        AllocatedStorage: js.UndefOr[Int] = js.undefined,
        AutoMinorVersionUpgrade: js.UndefOr[Boolean] = js.undefined,
        AvailabilityZone: js.UndefOr[String] = js.undefined,
        DnsNameServers: js.UndefOr[String] = js.undefined,
        EngineVersion: js.UndefOr[String] = js.undefined,
        FreeUntil: js.UndefOr[TStamp] = js.undefined,
        InstanceCreateTime: js.UndefOr[TStamp] = js.undefined,
        KmsKeyId: js.UndefOr[String] = js.undefined,
        MultiAZ: js.UndefOr[Boolean] = js.undefined,
        PendingModifiedValues: js.UndefOr[ReplicationPendingModifiedValues] = js.undefined,
        PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
        PubliclyAccessible: js.UndefOr[Boolean] = js.undefined,
        ReplicationInstanceArn: js.UndefOr[String] = js.undefined,
        ReplicationInstanceClass: js.UndefOr[String] = js.undefined,
        ReplicationInstanceIdentifier: js.UndefOr[String] = js.undefined,
        ReplicationInstancePrivateIpAddress: js.UndefOr[String] = js.undefined,
        ReplicationInstancePrivateIpAddresses: js.UndefOr[ReplicationInstancePrivateIpAddressList] = js.undefined,
        ReplicationInstancePublicIpAddress: js.UndefOr[String] = js.undefined,
        ReplicationInstancePublicIpAddresses: js.UndefOr[ReplicationInstancePublicIpAddressList] = js.undefined,
        ReplicationInstanceStatus: js.UndefOr[String] = js.undefined,
        ReplicationSubnetGroup: js.UndefOr[ReplicationSubnetGroup] = js.undefined,
        SecondaryAvailabilityZone: js.UndefOr[String] = js.undefined,
        VpcSecurityGroups: js.UndefOr[VpcSecurityGroupMembershipList] = js.undefined
    ): ReplicationInstance = {
      val __obj = js.Dynamic.literal()
      AllocatedStorage.foreach(__v => __obj.updateDynamic("AllocatedStorage")(__v.asInstanceOf[js.Any]))
      AutoMinorVersionUpgrade.foreach(__v => __obj.updateDynamic("AutoMinorVersionUpgrade")(__v.asInstanceOf[js.Any]))
      AvailabilityZone.foreach(__v => __obj.updateDynamic("AvailabilityZone")(__v.asInstanceOf[js.Any]))
      DnsNameServers.foreach(__v => __obj.updateDynamic("DnsNameServers")(__v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
      FreeUntil.foreach(__v => __obj.updateDynamic("FreeUntil")(__v.asInstanceOf[js.Any]))
      InstanceCreateTime.foreach(__v => __obj.updateDynamic("InstanceCreateTime")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      MultiAZ.foreach(__v => __obj.updateDynamic("MultiAZ")(__v.asInstanceOf[js.Any]))
      PendingModifiedValues.foreach(__v => __obj.updateDynamic("PendingModifiedValues")(__v.asInstanceOf[js.Any]))
      PreferredMaintenanceWindow.foreach(__v => __obj.updateDynamic("PreferredMaintenanceWindow")(__v.asInstanceOf[js.Any]))
      PubliclyAccessible.foreach(__v => __obj.updateDynamic("PubliclyAccessible")(__v.asInstanceOf[js.Any]))
      ReplicationInstanceArn.foreach(__v => __obj.updateDynamic("ReplicationInstanceArn")(__v.asInstanceOf[js.Any]))
      ReplicationInstanceClass.foreach(__v => __obj.updateDynamic("ReplicationInstanceClass")(__v.asInstanceOf[js.Any]))
      ReplicationInstanceIdentifier.foreach(__v => __obj.updateDynamic("ReplicationInstanceIdentifier")(__v.asInstanceOf[js.Any]))
      ReplicationInstancePrivateIpAddress.foreach(__v => __obj.updateDynamic("ReplicationInstancePrivateIpAddress")(__v.asInstanceOf[js.Any]))
      ReplicationInstancePrivateIpAddresses.foreach(__v => __obj.updateDynamic("ReplicationInstancePrivateIpAddresses")(__v.asInstanceOf[js.Any]))
      ReplicationInstancePublicIpAddress.foreach(__v => __obj.updateDynamic("ReplicationInstancePublicIpAddress")(__v.asInstanceOf[js.Any]))
      ReplicationInstancePublicIpAddresses.foreach(__v => __obj.updateDynamic("ReplicationInstancePublicIpAddresses")(__v.asInstanceOf[js.Any]))
      ReplicationInstanceStatus.foreach(__v => __obj.updateDynamic("ReplicationInstanceStatus")(__v.asInstanceOf[js.Any]))
      ReplicationSubnetGroup.foreach(__v => __obj.updateDynamic("ReplicationSubnetGroup")(__v.asInstanceOf[js.Any]))
      SecondaryAvailabilityZone.foreach(__v => __obj.updateDynamic("SecondaryAvailabilityZone")(__v.asInstanceOf[js.Any]))
      VpcSecurityGroups.foreach(__v => __obj.updateDynamic("VpcSecurityGroups")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReplicationInstance]
    }
  }

  /** Contains metadata for a replication instance task log.
    */
  @js.native
  trait ReplicationInstanceTaskLog extends js.Object {
    var ReplicationInstanceTaskLogSize: js.UndefOr[Double]
    var ReplicationTaskArn: js.UndefOr[String]
    var ReplicationTaskName: js.UndefOr[String]
  }

  object ReplicationInstanceTaskLog {
    @inline
    def apply(
        ReplicationInstanceTaskLogSize: js.UndefOr[Double] = js.undefined,
        ReplicationTaskArn: js.UndefOr[String] = js.undefined,
        ReplicationTaskName: js.UndefOr[String] = js.undefined
    ): ReplicationInstanceTaskLog = {
      val __obj = js.Dynamic.literal()
      ReplicationInstanceTaskLogSize.foreach(__v => __obj.updateDynamic("ReplicationInstanceTaskLogSize")(__v.asInstanceOf[js.Any]))
      ReplicationTaskArn.foreach(__v => __obj.updateDynamic("ReplicationTaskArn")(__v.asInstanceOf[js.Any]))
      ReplicationTaskName.foreach(__v => __obj.updateDynamic("ReplicationTaskName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReplicationInstanceTaskLog]
    }
  }

  /** Provides information about the values of pending modifications to a replication instance. This data type is an object of the <a href="https://docs.aws.amazon.com/dms/latest/APIReference/API_ReplicationInstance.html"> <code>ReplicationInstance</code> </a> user-defined data type.
    */
  @js.native
  trait ReplicationPendingModifiedValues extends js.Object {
    var AllocatedStorage: js.UndefOr[IntegerOptional]
    var EngineVersion: js.UndefOr[String]
    var MultiAZ: js.UndefOr[BooleanOptional]
    var ReplicationInstanceClass: js.UndefOr[String]
  }

  object ReplicationPendingModifiedValues {
    @inline
    def apply(
        AllocatedStorage: js.UndefOr[IntegerOptional] = js.undefined,
        EngineVersion: js.UndefOr[String] = js.undefined,
        MultiAZ: js.UndefOr[BooleanOptional] = js.undefined,
        ReplicationInstanceClass: js.UndefOr[String] = js.undefined
    ): ReplicationPendingModifiedValues = {
      val __obj = js.Dynamic.literal()
      AllocatedStorage.foreach(__v => __obj.updateDynamic("AllocatedStorage")(__v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
      MultiAZ.foreach(__v => __obj.updateDynamic("MultiAZ")(__v.asInstanceOf[js.Any]))
      ReplicationInstanceClass.foreach(__v => __obj.updateDynamic("ReplicationInstanceClass")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReplicationPendingModifiedValues]
    }
  }

  /** Describes a subnet group in response to a request by the <code>DescribeReplicationSubnetGroups</code> operation.
    */
  @js.native
  trait ReplicationSubnetGroup extends js.Object {
    var ReplicationSubnetGroupDescription: js.UndefOr[String]
    var ReplicationSubnetGroupIdentifier: js.UndefOr[String]
    var SubnetGroupStatus: js.UndefOr[String]
    var Subnets: js.UndefOr[SubnetList]
    var VpcId: js.UndefOr[String]
  }

  object ReplicationSubnetGroup {
    @inline
    def apply(
        ReplicationSubnetGroupDescription: js.UndefOr[String] = js.undefined,
        ReplicationSubnetGroupIdentifier: js.UndefOr[String] = js.undefined,
        SubnetGroupStatus: js.UndefOr[String] = js.undefined,
        Subnets: js.UndefOr[SubnetList] = js.undefined,
        VpcId: js.UndefOr[String] = js.undefined
    ): ReplicationSubnetGroup = {
      val __obj = js.Dynamic.literal()
      ReplicationSubnetGroupDescription.foreach(__v => __obj.updateDynamic("ReplicationSubnetGroupDescription")(__v.asInstanceOf[js.Any]))
      ReplicationSubnetGroupIdentifier.foreach(__v => __obj.updateDynamic("ReplicationSubnetGroupIdentifier")(__v.asInstanceOf[js.Any]))
      SubnetGroupStatus.foreach(__v => __obj.updateDynamic("SubnetGroupStatus")(__v.asInstanceOf[js.Any]))
      Subnets.foreach(__v => __obj.updateDynamic("Subnets")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReplicationSubnetGroup]
    }
  }

  /** Provides information that describes a replication task created by the <code>CreateReplicationTask</code> operation.
    */
  @js.native
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
    var TargetReplicationInstanceArn: js.UndefOr[String]
    var TaskData: js.UndefOr[String]
  }

  object ReplicationTask {
    @inline
    def apply(
        CdcStartPosition: js.UndefOr[String] = js.undefined,
        CdcStopPosition: js.UndefOr[String] = js.undefined,
        LastFailureMessage: js.UndefOr[String] = js.undefined,
        MigrationType: js.UndefOr[MigrationTypeValue] = js.undefined,
        RecoveryCheckpoint: js.UndefOr[String] = js.undefined,
        ReplicationInstanceArn: js.UndefOr[String] = js.undefined,
        ReplicationTaskArn: js.UndefOr[String] = js.undefined,
        ReplicationTaskCreationDate: js.UndefOr[TStamp] = js.undefined,
        ReplicationTaskIdentifier: js.UndefOr[String] = js.undefined,
        ReplicationTaskSettings: js.UndefOr[String] = js.undefined,
        ReplicationTaskStartDate: js.UndefOr[TStamp] = js.undefined,
        ReplicationTaskStats: js.UndefOr[ReplicationTaskStats] = js.undefined,
        SourceEndpointArn: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[String] = js.undefined,
        StopReason: js.UndefOr[String] = js.undefined,
        TableMappings: js.UndefOr[String] = js.undefined,
        TargetEndpointArn: js.UndefOr[String] = js.undefined,
        TargetReplicationInstanceArn: js.UndefOr[String] = js.undefined,
        TaskData: js.UndefOr[String] = js.undefined
    ): ReplicationTask = {
      val __obj = js.Dynamic.literal()
      CdcStartPosition.foreach(__v => __obj.updateDynamic("CdcStartPosition")(__v.asInstanceOf[js.Any]))
      CdcStopPosition.foreach(__v => __obj.updateDynamic("CdcStopPosition")(__v.asInstanceOf[js.Any]))
      LastFailureMessage.foreach(__v => __obj.updateDynamic("LastFailureMessage")(__v.asInstanceOf[js.Any]))
      MigrationType.foreach(__v => __obj.updateDynamic("MigrationType")(__v.asInstanceOf[js.Any]))
      RecoveryCheckpoint.foreach(__v => __obj.updateDynamic("RecoveryCheckpoint")(__v.asInstanceOf[js.Any]))
      ReplicationInstanceArn.foreach(__v => __obj.updateDynamic("ReplicationInstanceArn")(__v.asInstanceOf[js.Any]))
      ReplicationTaskArn.foreach(__v => __obj.updateDynamic("ReplicationTaskArn")(__v.asInstanceOf[js.Any]))
      ReplicationTaskCreationDate.foreach(__v => __obj.updateDynamic("ReplicationTaskCreationDate")(__v.asInstanceOf[js.Any]))
      ReplicationTaskIdentifier.foreach(__v => __obj.updateDynamic("ReplicationTaskIdentifier")(__v.asInstanceOf[js.Any]))
      ReplicationTaskSettings.foreach(__v => __obj.updateDynamic("ReplicationTaskSettings")(__v.asInstanceOf[js.Any]))
      ReplicationTaskStartDate.foreach(__v => __obj.updateDynamic("ReplicationTaskStartDate")(__v.asInstanceOf[js.Any]))
      ReplicationTaskStats.foreach(__v => __obj.updateDynamic("ReplicationTaskStats")(__v.asInstanceOf[js.Any]))
      SourceEndpointArn.foreach(__v => __obj.updateDynamic("SourceEndpointArn")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StopReason.foreach(__v => __obj.updateDynamic("StopReason")(__v.asInstanceOf[js.Any]))
      TableMappings.foreach(__v => __obj.updateDynamic("TableMappings")(__v.asInstanceOf[js.Any]))
      TargetEndpointArn.foreach(__v => __obj.updateDynamic("TargetEndpointArn")(__v.asInstanceOf[js.Any]))
      TargetReplicationInstanceArn.foreach(__v => __obj.updateDynamic("TargetReplicationInstanceArn")(__v.asInstanceOf[js.Any]))
      TaskData.foreach(__v => __obj.updateDynamic("TaskData")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReplicationTask]
    }
  }

  /** The task assessment report in JSON format.
    */
  @js.native
  trait ReplicationTaskAssessmentResult extends js.Object {
    var AssessmentResults: js.UndefOr[String]
    var AssessmentResultsFile: js.UndefOr[String]
    var AssessmentStatus: js.UndefOr[String]
    var ReplicationTaskArn: js.UndefOr[String]
    var ReplicationTaskIdentifier: js.UndefOr[String]
    var ReplicationTaskLastAssessmentDate: js.UndefOr[TStamp]
    var S3ObjectUrl: js.UndefOr[String]
  }

  object ReplicationTaskAssessmentResult {
    @inline
    def apply(
        AssessmentResults: js.UndefOr[String] = js.undefined,
        AssessmentResultsFile: js.UndefOr[String] = js.undefined,
        AssessmentStatus: js.UndefOr[String] = js.undefined,
        ReplicationTaskArn: js.UndefOr[String] = js.undefined,
        ReplicationTaskIdentifier: js.UndefOr[String] = js.undefined,
        ReplicationTaskLastAssessmentDate: js.UndefOr[TStamp] = js.undefined,
        S3ObjectUrl: js.UndefOr[String] = js.undefined
    ): ReplicationTaskAssessmentResult = {
      val __obj = js.Dynamic.literal()
      AssessmentResults.foreach(__v => __obj.updateDynamic("AssessmentResults")(__v.asInstanceOf[js.Any]))
      AssessmentResultsFile.foreach(__v => __obj.updateDynamic("AssessmentResultsFile")(__v.asInstanceOf[js.Any]))
      AssessmentStatus.foreach(__v => __obj.updateDynamic("AssessmentStatus")(__v.asInstanceOf[js.Any]))
      ReplicationTaskArn.foreach(__v => __obj.updateDynamic("ReplicationTaskArn")(__v.asInstanceOf[js.Any]))
      ReplicationTaskIdentifier.foreach(__v => __obj.updateDynamic("ReplicationTaskIdentifier")(__v.asInstanceOf[js.Any]))
      ReplicationTaskLastAssessmentDate.foreach(__v => __obj.updateDynamic("ReplicationTaskLastAssessmentDate")(__v.asInstanceOf[js.Any]))
      S3ObjectUrl.foreach(__v => __obj.updateDynamic("S3ObjectUrl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReplicationTaskAssessmentResult]
    }
  }

  /** Provides information that describes a premigration assessment run that you have started using the <code>StartReplicationTaskAssessmentRun</code> operation.
    * Some of the information appears based on other operations that can return the <code>ReplicationTaskAssessmentRun</code> object.
    */
  @js.native
  trait ReplicationTaskAssessmentRun extends js.Object {
    var AssessmentProgress: js.UndefOr[ReplicationTaskAssessmentRunProgress]
    var AssessmentRunName: js.UndefOr[String]
    var LastFailureMessage: js.UndefOr[String]
    var ReplicationTaskArn: js.UndefOr[String]
    var ReplicationTaskAssessmentRunArn: js.UndefOr[String]
    var ReplicationTaskAssessmentRunCreationDate: js.UndefOr[TStamp]
    var ResultEncryptionMode: js.UndefOr[String]
    var ResultKmsKeyArn: js.UndefOr[String]
    var ResultLocationBucket: js.UndefOr[String]
    var ResultLocationFolder: js.UndefOr[String]
    var ServiceAccessRoleArn: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  object ReplicationTaskAssessmentRun {
    @inline
    def apply(
        AssessmentProgress: js.UndefOr[ReplicationTaskAssessmentRunProgress] = js.undefined,
        AssessmentRunName: js.UndefOr[String] = js.undefined,
        LastFailureMessage: js.UndefOr[String] = js.undefined,
        ReplicationTaskArn: js.UndefOr[String] = js.undefined,
        ReplicationTaskAssessmentRunArn: js.UndefOr[String] = js.undefined,
        ReplicationTaskAssessmentRunCreationDate: js.UndefOr[TStamp] = js.undefined,
        ResultEncryptionMode: js.UndefOr[String] = js.undefined,
        ResultKmsKeyArn: js.UndefOr[String] = js.undefined,
        ResultLocationBucket: js.UndefOr[String] = js.undefined,
        ResultLocationFolder: js.UndefOr[String] = js.undefined,
        ServiceAccessRoleArn: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[String] = js.undefined
    ): ReplicationTaskAssessmentRun = {
      val __obj = js.Dynamic.literal()
      AssessmentProgress.foreach(__v => __obj.updateDynamic("AssessmentProgress")(__v.asInstanceOf[js.Any]))
      AssessmentRunName.foreach(__v => __obj.updateDynamic("AssessmentRunName")(__v.asInstanceOf[js.Any]))
      LastFailureMessage.foreach(__v => __obj.updateDynamic("LastFailureMessage")(__v.asInstanceOf[js.Any]))
      ReplicationTaskArn.foreach(__v => __obj.updateDynamic("ReplicationTaskArn")(__v.asInstanceOf[js.Any]))
      ReplicationTaskAssessmentRunArn.foreach(__v => __obj.updateDynamic("ReplicationTaskAssessmentRunArn")(__v.asInstanceOf[js.Any]))
      ReplicationTaskAssessmentRunCreationDate.foreach(__v => __obj.updateDynamic("ReplicationTaskAssessmentRunCreationDate")(__v.asInstanceOf[js.Any]))
      ResultEncryptionMode.foreach(__v => __obj.updateDynamic("ResultEncryptionMode")(__v.asInstanceOf[js.Any]))
      ResultKmsKeyArn.foreach(__v => __obj.updateDynamic("ResultKmsKeyArn")(__v.asInstanceOf[js.Any]))
      ResultLocationBucket.foreach(__v => __obj.updateDynamic("ResultLocationBucket")(__v.asInstanceOf[js.Any]))
      ResultLocationFolder.foreach(__v => __obj.updateDynamic("ResultLocationFolder")(__v.asInstanceOf[js.Any]))
      ServiceAccessRoleArn.foreach(__v => __obj.updateDynamic("ServiceAccessRoleArn")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReplicationTaskAssessmentRun]
    }
  }

  /** The progress values reported by the <code>AssessmentProgress</code> response element.
    */
  @js.native
  trait ReplicationTaskAssessmentRunProgress extends js.Object {
    var IndividualAssessmentCompletedCount: js.UndefOr[Int]
    var IndividualAssessmentCount: js.UndefOr[Int]
  }

  object ReplicationTaskAssessmentRunProgress {
    @inline
    def apply(
        IndividualAssessmentCompletedCount: js.UndefOr[Int] = js.undefined,
        IndividualAssessmentCount: js.UndefOr[Int] = js.undefined
    ): ReplicationTaskAssessmentRunProgress = {
      val __obj = js.Dynamic.literal()
      IndividualAssessmentCompletedCount.foreach(__v => __obj.updateDynamic("IndividualAssessmentCompletedCount")(__v.asInstanceOf[js.Any]))
      IndividualAssessmentCount.foreach(__v => __obj.updateDynamic("IndividualAssessmentCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReplicationTaskAssessmentRunProgress]
    }
  }

  /** Provides information that describes an individual assessment from a premigration assessment run.
    */
  @js.native
  trait ReplicationTaskIndividualAssessment extends js.Object {
    var IndividualAssessmentName: js.UndefOr[String]
    var ReplicationTaskAssessmentRunArn: js.UndefOr[String]
    var ReplicationTaskIndividualAssessmentArn: js.UndefOr[String]
    var ReplicationTaskIndividualAssessmentStartDate: js.UndefOr[TStamp]
    var Status: js.UndefOr[String]
  }

  object ReplicationTaskIndividualAssessment {
    @inline
    def apply(
        IndividualAssessmentName: js.UndefOr[String] = js.undefined,
        ReplicationTaskAssessmentRunArn: js.UndefOr[String] = js.undefined,
        ReplicationTaskIndividualAssessmentArn: js.UndefOr[String] = js.undefined,
        ReplicationTaskIndividualAssessmentStartDate: js.UndefOr[TStamp] = js.undefined,
        Status: js.UndefOr[String] = js.undefined
    ): ReplicationTaskIndividualAssessment = {
      val __obj = js.Dynamic.literal()
      IndividualAssessmentName.foreach(__v => __obj.updateDynamic("IndividualAssessmentName")(__v.asInstanceOf[js.Any]))
      ReplicationTaskAssessmentRunArn.foreach(__v => __obj.updateDynamic("ReplicationTaskAssessmentRunArn")(__v.asInstanceOf[js.Any]))
      ReplicationTaskIndividualAssessmentArn.foreach(__v => __obj.updateDynamic("ReplicationTaskIndividualAssessmentArn")(__v.asInstanceOf[js.Any]))
      ReplicationTaskIndividualAssessmentStartDate.foreach(__v => __obj.updateDynamic("ReplicationTaskIndividualAssessmentStartDate")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReplicationTaskIndividualAssessment]
    }
  }

  /** In response to a request by the <code>DescribeReplicationTasks</code> operation, this object provides a collection of statistics about a replication task.
    */
  @js.native
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

  object ReplicationTaskStats {
    @inline
    def apply(
        ElapsedTimeMillis: js.UndefOr[Double] = js.undefined,
        FreshStartDate: js.UndefOr[TStamp] = js.undefined,
        FullLoadFinishDate: js.UndefOr[TStamp] = js.undefined,
        FullLoadProgressPercent: js.UndefOr[Int] = js.undefined,
        FullLoadStartDate: js.UndefOr[TStamp] = js.undefined,
        StartDate: js.UndefOr[TStamp] = js.undefined,
        StopDate: js.UndefOr[TStamp] = js.undefined,
        TablesErrored: js.UndefOr[Int] = js.undefined,
        TablesLoaded: js.UndefOr[Int] = js.undefined,
        TablesLoading: js.UndefOr[Int] = js.undefined,
        TablesQueued: js.UndefOr[Int] = js.undefined
    ): ReplicationTaskStats = {
      val __obj = js.Dynamic.literal()
      ElapsedTimeMillis.foreach(__v => __obj.updateDynamic("ElapsedTimeMillis")(__v.asInstanceOf[js.Any]))
      FreshStartDate.foreach(__v => __obj.updateDynamic("FreshStartDate")(__v.asInstanceOf[js.Any]))
      FullLoadFinishDate.foreach(__v => __obj.updateDynamic("FullLoadFinishDate")(__v.asInstanceOf[js.Any]))
      FullLoadProgressPercent.foreach(__v => __obj.updateDynamic("FullLoadProgressPercent")(__v.asInstanceOf[js.Any]))
      FullLoadStartDate.foreach(__v => __obj.updateDynamic("FullLoadStartDate")(__v.asInstanceOf[js.Any]))
      StartDate.foreach(__v => __obj.updateDynamic("StartDate")(__v.asInstanceOf[js.Any]))
      StopDate.foreach(__v => __obj.updateDynamic("StopDate")(__v.asInstanceOf[js.Any]))
      TablesErrored.foreach(__v => __obj.updateDynamic("TablesErrored")(__v.asInstanceOf[js.Any]))
      TablesLoaded.foreach(__v => __obj.updateDynamic("TablesLoaded")(__v.asInstanceOf[js.Any]))
      TablesLoading.foreach(__v => __obj.updateDynamic("TablesLoading")(__v.asInstanceOf[js.Any]))
      TablesQueued.foreach(__v => __obj.updateDynamic("TablesQueued")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReplicationTaskStats]
    }
  }

  /** Identifies an AWS DMS resource and any pending actions for it.
    */
  @js.native
  trait ResourcePendingMaintenanceActions extends js.Object {
    var PendingMaintenanceActionDetails: js.UndefOr[PendingMaintenanceActionDetails]
    var ResourceIdentifier: js.UndefOr[String]
  }

  object ResourcePendingMaintenanceActions {
    @inline
    def apply(
        PendingMaintenanceActionDetails: js.UndefOr[PendingMaintenanceActionDetails] = js.undefined,
        ResourceIdentifier: js.UndefOr[String] = js.undefined
    ): ResourcePendingMaintenanceActions = {
      val __obj = js.Dynamic.literal()
      PendingMaintenanceActionDetails.foreach(__v => __obj.updateDynamic("PendingMaintenanceActionDetails")(__v.asInstanceOf[js.Any]))
      ResourceIdentifier.foreach(__v => __obj.updateDynamic("ResourceIdentifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourcePendingMaintenanceActions]
    }
  }

  /** Settings for exporting data to Amazon S3.
    */
  @js.native
  trait S3Settings extends js.Object {
    var BucketFolder: js.UndefOr[String]
    var BucketName: js.UndefOr[String]
    var CdcInsertsAndUpdates: js.UndefOr[BooleanOptional]
    var CdcInsertsOnly: js.UndefOr[BooleanOptional]
    var CompressionType: js.UndefOr[CompressionTypeValue]
    var CsvDelimiter: js.UndefOr[String]
    var CsvRowDelimiter: js.UndefOr[String]
    var DataFormat: js.UndefOr[DataFormatValue]
    var DataPageSize: js.UndefOr[IntegerOptional]
    var DatePartitionDelimiter: js.UndefOr[DatePartitionDelimiterValue]
    var DatePartitionEnabled: js.UndefOr[BooleanOptional]
    var DatePartitionSequence: js.UndefOr[DatePartitionSequenceValue]
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

  object S3Settings {
    @inline
    def apply(
        BucketFolder: js.UndefOr[String] = js.undefined,
        BucketName: js.UndefOr[String] = js.undefined,
        CdcInsertsAndUpdates: js.UndefOr[BooleanOptional] = js.undefined,
        CdcInsertsOnly: js.UndefOr[BooleanOptional] = js.undefined,
        CompressionType: js.UndefOr[CompressionTypeValue] = js.undefined,
        CsvDelimiter: js.UndefOr[String] = js.undefined,
        CsvRowDelimiter: js.UndefOr[String] = js.undefined,
        DataFormat: js.UndefOr[DataFormatValue] = js.undefined,
        DataPageSize: js.UndefOr[IntegerOptional] = js.undefined,
        DatePartitionDelimiter: js.UndefOr[DatePartitionDelimiterValue] = js.undefined,
        DatePartitionEnabled: js.UndefOr[BooleanOptional] = js.undefined,
        DatePartitionSequence: js.UndefOr[DatePartitionSequenceValue] = js.undefined,
        DictPageSizeLimit: js.UndefOr[IntegerOptional] = js.undefined,
        EnableStatistics: js.UndefOr[BooleanOptional] = js.undefined,
        EncodingType: js.UndefOr[EncodingTypeValue] = js.undefined,
        EncryptionMode: js.UndefOr[EncryptionModeValue] = js.undefined,
        ExternalTableDefinition: js.UndefOr[String] = js.undefined,
        IncludeOpForFullLoad: js.UndefOr[BooleanOptional] = js.undefined,
        ParquetTimestampInMillisecond: js.UndefOr[BooleanOptional] = js.undefined,
        ParquetVersion: js.UndefOr[ParquetVersionValue] = js.undefined,
        RowGroupLength: js.UndefOr[IntegerOptional] = js.undefined,
        ServerSideEncryptionKmsKeyId: js.UndefOr[String] = js.undefined,
        ServiceAccessRoleArn: js.UndefOr[String] = js.undefined,
        TimestampColumnName: js.UndefOr[String] = js.undefined
    ): S3Settings = {
      val __obj = js.Dynamic.literal()
      BucketFolder.foreach(__v => __obj.updateDynamic("BucketFolder")(__v.asInstanceOf[js.Any]))
      BucketName.foreach(__v => __obj.updateDynamic("BucketName")(__v.asInstanceOf[js.Any]))
      CdcInsertsAndUpdates.foreach(__v => __obj.updateDynamic("CdcInsertsAndUpdates")(__v.asInstanceOf[js.Any]))
      CdcInsertsOnly.foreach(__v => __obj.updateDynamic("CdcInsertsOnly")(__v.asInstanceOf[js.Any]))
      CompressionType.foreach(__v => __obj.updateDynamic("CompressionType")(__v.asInstanceOf[js.Any]))
      CsvDelimiter.foreach(__v => __obj.updateDynamic("CsvDelimiter")(__v.asInstanceOf[js.Any]))
      CsvRowDelimiter.foreach(__v => __obj.updateDynamic("CsvRowDelimiter")(__v.asInstanceOf[js.Any]))
      DataFormat.foreach(__v => __obj.updateDynamic("DataFormat")(__v.asInstanceOf[js.Any]))
      DataPageSize.foreach(__v => __obj.updateDynamic("DataPageSize")(__v.asInstanceOf[js.Any]))
      DatePartitionDelimiter.foreach(__v => __obj.updateDynamic("DatePartitionDelimiter")(__v.asInstanceOf[js.Any]))
      DatePartitionEnabled.foreach(__v => __obj.updateDynamic("DatePartitionEnabled")(__v.asInstanceOf[js.Any]))
      DatePartitionSequence.foreach(__v => __obj.updateDynamic("DatePartitionSequence")(__v.asInstanceOf[js.Any]))
      DictPageSizeLimit.foreach(__v => __obj.updateDynamic("DictPageSizeLimit")(__v.asInstanceOf[js.Any]))
      EnableStatistics.foreach(__v => __obj.updateDynamic("EnableStatistics")(__v.asInstanceOf[js.Any]))
      EncodingType.foreach(__v => __obj.updateDynamic("EncodingType")(__v.asInstanceOf[js.Any]))
      EncryptionMode.foreach(__v => __obj.updateDynamic("EncryptionMode")(__v.asInstanceOf[js.Any]))
      ExternalTableDefinition.foreach(__v => __obj.updateDynamic("ExternalTableDefinition")(__v.asInstanceOf[js.Any]))
      IncludeOpForFullLoad.foreach(__v => __obj.updateDynamic("IncludeOpForFullLoad")(__v.asInstanceOf[js.Any]))
      ParquetTimestampInMillisecond.foreach(__v => __obj.updateDynamic("ParquetTimestampInMillisecond")(__v.asInstanceOf[js.Any]))
      ParquetVersion.foreach(__v => __obj.updateDynamic("ParquetVersion")(__v.asInstanceOf[js.Any]))
      RowGroupLength.foreach(__v => __obj.updateDynamic("RowGroupLength")(__v.asInstanceOf[js.Any]))
      ServerSideEncryptionKmsKeyId.foreach(__v => __obj.updateDynamic("ServerSideEncryptionKmsKeyId")(__v.asInstanceOf[js.Any]))
      ServiceAccessRoleArn.foreach(__v => __obj.updateDynamic("ServiceAccessRoleArn")(__v.asInstanceOf[js.Any]))
      TimestampColumnName.foreach(__v => __obj.updateDynamic("TimestampColumnName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3Settings]
    }
  }

  @js.native
  sealed trait SafeguardPolicy extends js.Any
  object SafeguardPolicy {
    val `rely-on-sql-server-replication-agent` = "rely-on-sql-server-replication-agent".asInstanceOf[SafeguardPolicy]
    val `exclusive-automatic-truncation` = "exclusive-automatic-truncation".asInstanceOf[SafeguardPolicy]
    val `shared-automatic-truncation` = "shared-automatic-truncation".asInstanceOf[SafeguardPolicy]

    @inline def values = js.Array(`rely-on-sql-server-replication-agent`, `exclusive-automatic-truncation`, `shared-automatic-truncation`)
  }

  @js.native
  sealed trait SourceType extends js.Any
  object SourceType {
    val `replication-instance` = "replication-instance".asInstanceOf[SourceType]

    @inline def values = js.Array(`replication-instance`)
  }

  /** <p/>
    */
  @js.native
  trait StartReplicationTaskAssessmentMessage extends js.Object {
    var ReplicationTaskArn: String
  }

  object StartReplicationTaskAssessmentMessage {
    @inline
    def apply(
        ReplicationTaskArn: String
    ): StartReplicationTaskAssessmentMessage = {
      val __obj = js.Dynamic.literal(
        "ReplicationTaskArn" -> ReplicationTaskArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartReplicationTaskAssessmentMessage]
    }
  }

  /** <p/>
    */
  @js.native
  trait StartReplicationTaskAssessmentResponse extends js.Object {
    var ReplicationTask: js.UndefOr[ReplicationTask]
  }

  object StartReplicationTaskAssessmentResponse {
    @inline
    def apply(
        ReplicationTask: js.UndefOr[ReplicationTask] = js.undefined
    ): StartReplicationTaskAssessmentResponse = {
      val __obj = js.Dynamic.literal()
      ReplicationTask.foreach(__v => __obj.updateDynamic("ReplicationTask")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartReplicationTaskAssessmentResponse]
    }
  }

  /** <p/>
    */
  @js.native
  trait StartReplicationTaskAssessmentRunMessage extends js.Object {
    var AssessmentRunName: String
    var ReplicationTaskArn: String
    var ResultLocationBucket: String
    var ServiceAccessRoleArn: String
    var Exclude: js.UndefOr[ExcludeTestList]
    var IncludeOnly: js.UndefOr[IncludeTestList]
    var ResultEncryptionMode: js.UndefOr[String]
    var ResultKmsKeyArn: js.UndefOr[String]
    var ResultLocationFolder: js.UndefOr[String]
  }

  object StartReplicationTaskAssessmentRunMessage {
    @inline
    def apply(
        AssessmentRunName: String,
        ReplicationTaskArn: String,
        ResultLocationBucket: String,
        ServiceAccessRoleArn: String,
        Exclude: js.UndefOr[ExcludeTestList] = js.undefined,
        IncludeOnly: js.UndefOr[IncludeTestList] = js.undefined,
        ResultEncryptionMode: js.UndefOr[String] = js.undefined,
        ResultKmsKeyArn: js.UndefOr[String] = js.undefined,
        ResultLocationFolder: js.UndefOr[String] = js.undefined
    ): StartReplicationTaskAssessmentRunMessage = {
      val __obj = js.Dynamic.literal(
        "AssessmentRunName" -> AssessmentRunName.asInstanceOf[js.Any],
        "ReplicationTaskArn" -> ReplicationTaskArn.asInstanceOf[js.Any],
        "ResultLocationBucket" -> ResultLocationBucket.asInstanceOf[js.Any],
        "ServiceAccessRoleArn" -> ServiceAccessRoleArn.asInstanceOf[js.Any]
      )

      Exclude.foreach(__v => __obj.updateDynamic("Exclude")(__v.asInstanceOf[js.Any]))
      IncludeOnly.foreach(__v => __obj.updateDynamic("IncludeOnly")(__v.asInstanceOf[js.Any]))
      ResultEncryptionMode.foreach(__v => __obj.updateDynamic("ResultEncryptionMode")(__v.asInstanceOf[js.Any]))
      ResultKmsKeyArn.foreach(__v => __obj.updateDynamic("ResultKmsKeyArn")(__v.asInstanceOf[js.Any]))
      ResultLocationFolder.foreach(__v => __obj.updateDynamic("ResultLocationFolder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartReplicationTaskAssessmentRunMessage]
    }
  }

  /** <p/>
    */
  @js.native
  trait StartReplicationTaskAssessmentRunResponse extends js.Object {
    var ReplicationTaskAssessmentRun: js.UndefOr[ReplicationTaskAssessmentRun]
  }

  object StartReplicationTaskAssessmentRunResponse {
    @inline
    def apply(
        ReplicationTaskAssessmentRun: js.UndefOr[ReplicationTaskAssessmentRun] = js.undefined
    ): StartReplicationTaskAssessmentRunResponse = {
      val __obj = js.Dynamic.literal()
      ReplicationTaskAssessmentRun.foreach(__v => __obj.updateDynamic("ReplicationTaskAssessmentRun")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartReplicationTaskAssessmentRunResponse]
    }
  }

  /** <p/>
    */
  @js.native
  trait StartReplicationTaskMessage extends js.Object {
    var ReplicationTaskArn: String
    var StartReplicationTaskType: StartReplicationTaskTypeValue
    var CdcStartPosition: js.UndefOr[String]
    var CdcStartTime: js.UndefOr[TStamp]
    var CdcStopPosition: js.UndefOr[String]
  }

  object StartReplicationTaskMessage {
    @inline
    def apply(
        ReplicationTaskArn: String,
        StartReplicationTaskType: StartReplicationTaskTypeValue,
        CdcStartPosition: js.UndefOr[String] = js.undefined,
        CdcStartTime: js.UndefOr[TStamp] = js.undefined,
        CdcStopPosition: js.UndefOr[String] = js.undefined
    ): StartReplicationTaskMessage = {
      val __obj = js.Dynamic.literal(
        "ReplicationTaskArn" -> ReplicationTaskArn.asInstanceOf[js.Any],
        "StartReplicationTaskType" -> StartReplicationTaskType.asInstanceOf[js.Any]
      )

      CdcStartPosition.foreach(__v => __obj.updateDynamic("CdcStartPosition")(__v.asInstanceOf[js.Any]))
      CdcStartTime.foreach(__v => __obj.updateDynamic("CdcStartTime")(__v.asInstanceOf[js.Any]))
      CdcStopPosition.foreach(__v => __obj.updateDynamic("CdcStopPosition")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartReplicationTaskMessage]
    }
  }

  /** <p/>
    */
  @js.native
  trait StartReplicationTaskResponse extends js.Object {
    var ReplicationTask: js.UndefOr[ReplicationTask]
  }

  object StartReplicationTaskResponse {
    @inline
    def apply(
        ReplicationTask: js.UndefOr[ReplicationTask] = js.undefined
    ): StartReplicationTaskResponse = {
      val __obj = js.Dynamic.literal()
      ReplicationTask.foreach(__v => __obj.updateDynamic("ReplicationTask")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartReplicationTaskResponse]
    }
  }

  @js.native
  sealed trait StartReplicationTaskTypeValue extends js.Any
  object StartReplicationTaskTypeValue {
    val `start-replication` = "start-replication".asInstanceOf[StartReplicationTaskTypeValue]
    val `resume-processing` = "resume-processing".asInstanceOf[StartReplicationTaskTypeValue]
    val `reload-target` = "reload-target".asInstanceOf[StartReplicationTaskTypeValue]

    @inline def values = js.Array(`start-replication`, `resume-processing`, `reload-target`)
  }

  /** <p/>
    */
  @js.native
  trait StopReplicationTaskMessage extends js.Object {
    var ReplicationTaskArn: String
  }

  object StopReplicationTaskMessage {
    @inline
    def apply(
        ReplicationTaskArn: String
    ): StopReplicationTaskMessage = {
      val __obj = js.Dynamic.literal(
        "ReplicationTaskArn" -> ReplicationTaskArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StopReplicationTaskMessage]
    }
  }

  /** <p/>
    */
  @js.native
  trait StopReplicationTaskResponse extends js.Object {
    var ReplicationTask: js.UndefOr[ReplicationTask]
  }

  object StopReplicationTaskResponse {
    @inline
    def apply(
        ReplicationTask: js.UndefOr[ReplicationTask] = js.undefined
    ): StopReplicationTaskResponse = {
      val __obj = js.Dynamic.literal()
      ReplicationTask.foreach(__v => __obj.updateDynamic("ReplicationTask")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopReplicationTaskResponse]
    }
  }

  /** In response to a request by the <code>DescribeReplicationSubnetGroups</code> operation, this object identifies a subnet by its given Availability Zone, subnet identifier, and status.
    */
  @js.native
  trait Subnet extends js.Object {
    var SubnetAvailabilityZone: js.UndefOr[AvailabilityZone]
    var SubnetIdentifier: js.UndefOr[String]
    var SubnetStatus: js.UndefOr[String]
  }

  object Subnet {
    @inline
    def apply(
        SubnetAvailabilityZone: js.UndefOr[AvailabilityZone] = js.undefined,
        SubnetIdentifier: js.UndefOr[String] = js.undefined,
        SubnetStatus: js.UndefOr[String] = js.undefined
    ): Subnet = {
      val __obj = js.Dynamic.literal()
      SubnetAvailabilityZone.foreach(__v => __obj.updateDynamic("SubnetAvailabilityZone")(__v.asInstanceOf[js.Any]))
      SubnetIdentifier.foreach(__v => __obj.updateDynamic("SubnetIdentifier")(__v.asInstanceOf[js.Any]))
      SubnetStatus.foreach(__v => __obj.updateDynamic("SubnetStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Subnet]
    }
  }

  /** Provides information about types of supported endpoints in response to a request by the <code>DescribeEndpointTypes</code> operation. This information includes the type of endpoint, the database engine name, and whether change data capture (CDC) is supported.
    */
  @js.native
  trait SupportedEndpointType extends js.Object {
    var EndpointType: js.UndefOr[ReplicationEndpointTypeValue]
    var EngineDisplayName: js.UndefOr[String]
    var EngineName: js.UndefOr[String]
    var ReplicationInstanceEngineMinimumVersion: js.UndefOr[String]
    var SupportsCDC: js.UndefOr[Boolean]
  }

  object SupportedEndpointType {
    @inline
    def apply(
        EndpointType: js.UndefOr[ReplicationEndpointTypeValue] = js.undefined,
        EngineDisplayName: js.UndefOr[String] = js.undefined,
        EngineName: js.UndefOr[String] = js.undefined,
        ReplicationInstanceEngineMinimumVersion: js.UndefOr[String] = js.undefined,
        SupportsCDC: js.UndefOr[Boolean] = js.undefined
    ): SupportedEndpointType = {
      val __obj = js.Dynamic.literal()
      EndpointType.foreach(__v => __obj.updateDynamic("EndpointType")(__v.asInstanceOf[js.Any]))
      EngineDisplayName.foreach(__v => __obj.updateDynamic("EngineDisplayName")(__v.asInstanceOf[js.Any]))
      EngineName.foreach(__v => __obj.updateDynamic("EngineName")(__v.asInstanceOf[js.Any]))
      ReplicationInstanceEngineMinimumVersion.foreach(__v => __obj.updateDynamic("ReplicationInstanceEngineMinimumVersion")(__v.asInstanceOf[js.Any]))
      SupportsCDC.foreach(__v => __obj.updateDynamic("SupportsCDC")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SupportedEndpointType]
    }
  }

  /** Provides information that defines a SAP ASE endpoint.
    */
  @js.native
  trait SybaseSettings extends js.Object {
    var DatabaseName: js.UndefOr[String]
    var Password: js.UndefOr[SecretString]
    var Port: js.UndefOr[IntegerOptional]
    var ServerName: js.UndefOr[String]
    var Username: js.UndefOr[String]
  }

  object SybaseSettings {
    @inline
    def apply(
        DatabaseName: js.UndefOr[String] = js.undefined,
        Password: js.UndefOr[SecretString] = js.undefined,
        Port: js.UndefOr[IntegerOptional] = js.undefined,
        ServerName: js.UndefOr[String] = js.undefined,
        Username: js.UndefOr[String] = js.undefined
    ): SybaseSettings = {
      val __obj = js.Dynamic.literal()
      DatabaseName.foreach(__v => __obj.updateDynamic("DatabaseName")(__v.asInstanceOf[js.Any]))
      Password.foreach(__v => __obj.updateDynamic("Password")(__v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      ServerName.foreach(__v => __obj.updateDynamic("ServerName")(__v.asInstanceOf[js.Any]))
      Username.foreach(__v => __obj.updateDynamic("Username")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SybaseSettings]
    }
  }

  /** Provides a collection of table statistics in response to a request by the <code>DescribeTableStatistics</code> operation.
    */
  @js.native
  trait TableStatistics extends js.Object {
    var Ddls: js.UndefOr[Double]
    var Deletes: js.UndefOr[Double]
    var FullLoadCondtnlChkFailedRows: js.UndefOr[Double]
    var FullLoadEndTime: js.UndefOr[TStamp]
    var FullLoadErrorRows: js.UndefOr[Double]
    var FullLoadReloaded: js.UndefOr[BooleanOptional]
    var FullLoadRows: js.UndefOr[Double]
    var FullLoadStartTime: js.UndefOr[TStamp]
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

  object TableStatistics {
    @inline
    def apply(
        Ddls: js.UndefOr[Double] = js.undefined,
        Deletes: js.UndefOr[Double] = js.undefined,
        FullLoadCondtnlChkFailedRows: js.UndefOr[Double] = js.undefined,
        FullLoadEndTime: js.UndefOr[TStamp] = js.undefined,
        FullLoadErrorRows: js.UndefOr[Double] = js.undefined,
        FullLoadReloaded: js.UndefOr[BooleanOptional] = js.undefined,
        FullLoadRows: js.UndefOr[Double] = js.undefined,
        FullLoadStartTime: js.UndefOr[TStamp] = js.undefined,
        Inserts: js.UndefOr[Double] = js.undefined,
        LastUpdateTime: js.UndefOr[TStamp] = js.undefined,
        SchemaName: js.UndefOr[String] = js.undefined,
        TableName: js.UndefOr[String] = js.undefined,
        TableState: js.UndefOr[String] = js.undefined,
        Updates: js.UndefOr[Double] = js.undefined,
        ValidationFailedRecords: js.UndefOr[Double] = js.undefined,
        ValidationPendingRecords: js.UndefOr[Double] = js.undefined,
        ValidationState: js.UndefOr[String] = js.undefined,
        ValidationStateDetails: js.UndefOr[String] = js.undefined,
        ValidationSuspendedRecords: js.UndefOr[Double] = js.undefined
    ): TableStatistics = {
      val __obj = js.Dynamic.literal()
      Ddls.foreach(__v => __obj.updateDynamic("Ddls")(__v.asInstanceOf[js.Any]))
      Deletes.foreach(__v => __obj.updateDynamic("Deletes")(__v.asInstanceOf[js.Any]))
      FullLoadCondtnlChkFailedRows.foreach(__v => __obj.updateDynamic("FullLoadCondtnlChkFailedRows")(__v.asInstanceOf[js.Any]))
      FullLoadEndTime.foreach(__v => __obj.updateDynamic("FullLoadEndTime")(__v.asInstanceOf[js.Any]))
      FullLoadErrorRows.foreach(__v => __obj.updateDynamic("FullLoadErrorRows")(__v.asInstanceOf[js.Any]))
      FullLoadReloaded.foreach(__v => __obj.updateDynamic("FullLoadReloaded")(__v.asInstanceOf[js.Any]))
      FullLoadRows.foreach(__v => __obj.updateDynamic("FullLoadRows")(__v.asInstanceOf[js.Any]))
      FullLoadStartTime.foreach(__v => __obj.updateDynamic("FullLoadStartTime")(__v.asInstanceOf[js.Any]))
      Inserts.foreach(__v => __obj.updateDynamic("Inserts")(__v.asInstanceOf[js.Any]))
      LastUpdateTime.foreach(__v => __obj.updateDynamic("LastUpdateTime")(__v.asInstanceOf[js.Any]))
      SchemaName.foreach(__v => __obj.updateDynamic("SchemaName")(__v.asInstanceOf[js.Any]))
      TableName.foreach(__v => __obj.updateDynamic("TableName")(__v.asInstanceOf[js.Any]))
      TableState.foreach(__v => __obj.updateDynamic("TableState")(__v.asInstanceOf[js.Any]))
      Updates.foreach(__v => __obj.updateDynamic("Updates")(__v.asInstanceOf[js.Any]))
      ValidationFailedRecords.foreach(__v => __obj.updateDynamic("ValidationFailedRecords")(__v.asInstanceOf[js.Any]))
      ValidationPendingRecords.foreach(__v => __obj.updateDynamic("ValidationPendingRecords")(__v.asInstanceOf[js.Any]))
      ValidationState.foreach(__v => __obj.updateDynamic("ValidationState")(__v.asInstanceOf[js.Any]))
      ValidationStateDetails.foreach(__v => __obj.updateDynamic("ValidationStateDetails")(__v.asInstanceOf[js.Any]))
      ValidationSuspendedRecords.foreach(__v => __obj.updateDynamic("ValidationSuspendedRecords")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TableStatistics]
    }
  }

  /** Provides the name of the schema and table to be reloaded.
    */
  @js.native
  trait TableToReload extends js.Object {
    var SchemaName: String
    var TableName: String
  }

  object TableToReload {
    @inline
    def apply(
        SchemaName: String,
        TableName: String
    ): TableToReload = {
      val __obj = js.Dynamic.literal(
        "SchemaName" -> SchemaName.asInstanceOf[js.Any],
        "TableName" -> TableName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TableToReload]
    }
  }

  /** A user-defined key-value pair that describes metadata added to an AWS DMS resource and that is used by operations such as the following:
    * * <code>AddTagsToResource</code>
    * * <code>ListTagsForResource</code>
    * * <code>RemoveTagsFromResource</code>
    */
  @js.native
  trait Tag extends js.Object {
    var Key: js.UndefOr[String]
    var Value: js.UndefOr[String]
  }

  object Tag {
    @inline
    def apply(
        Key: js.UndefOr[String] = js.undefined,
        Value: js.UndefOr[String] = js.undefined
    ): Tag = {
      val __obj = js.Dynamic.literal()
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  sealed trait TargetDbType extends js.Any
  object TargetDbType {
    val `specific-database` = "specific-database".asInstanceOf[TargetDbType]
    val `multiple-databases` = "multiple-databases".asInstanceOf[TargetDbType]

    @inline def values = js.Array(`specific-database`, `multiple-databases`)
  }

  /** <p/>
    */
  @js.native
  trait TestConnectionMessage extends js.Object {
    var EndpointArn: String
    var ReplicationInstanceArn: String
  }

  object TestConnectionMessage {
    @inline
    def apply(
        EndpointArn: String,
        ReplicationInstanceArn: String
    ): TestConnectionMessage = {
      val __obj = js.Dynamic.literal(
        "EndpointArn" -> EndpointArn.asInstanceOf[js.Any],
        "ReplicationInstanceArn" -> ReplicationInstanceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TestConnectionMessage]
    }
  }

  /** <p/>
    */
  @js.native
  trait TestConnectionResponse extends js.Object {
    var Connection: js.UndefOr[Connection]
  }

  object TestConnectionResponse {
    @inline
    def apply(
        Connection: js.UndefOr[Connection] = js.undefined
    ): TestConnectionResponse = {
      val __obj = js.Dynamic.literal()
      Connection.foreach(__v => __obj.updateDynamic("Connection")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TestConnectionResponse]
    }
  }

  /** Describes the status of a security group associated with the virtual private cloud (VPC) hosting your replication and DB instances.
    */
  @js.native
  trait VpcSecurityGroupMembership extends js.Object {
    var Status: js.UndefOr[String]
    var VpcSecurityGroupId: js.UndefOr[String]
  }

  object VpcSecurityGroupMembership {
    @inline
    def apply(
        Status: js.UndefOr[String] = js.undefined,
        VpcSecurityGroupId: js.UndefOr[String] = js.undefined
    ): VpcSecurityGroupMembership = {
      val __obj = js.Dynamic.literal()
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      VpcSecurityGroupId.foreach(__v => __obj.updateDynamic("VpcSecurityGroupId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VpcSecurityGroupMembership]
    }
  }
}
