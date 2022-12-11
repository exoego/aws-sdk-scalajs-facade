package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object redshiftserverless {
  type AccountIdList = js.Array[String]
  type AmazonResourceName = String
  type ConfigParameterList = js.Array[ConfigParameter]
  type DbName = String
  type DbPassword = String
  type DbUser = String
  type EndpointAccessList = js.Array[EndpointAccess]
  type IamRoleArn = String
  type IamRoleArnList = js.Array[IamRoleArn]
  type KmsKeyId = String
  type ListEndpointAccessRequestMaxResultsInteger = Int
  type ListNamespacesRequestMaxResultsInteger = Int
  type ListRecoveryPointsRequestMaxResultsInteger = Int
  type ListSnapshotsRequestMaxResultsInteger = Int
  type ListTableRestoreStatusRequestMaxResultsInteger = Int
  type ListUsageLimitsRequestMaxResultsInteger = Int
  type ListWorkgroupsRequestMaxResultsInteger = Int
  type LogExportList = js.Array[LogExport]
  type NamespaceList = js.Array[Namespace]
  type NamespaceName = String
  type NetworkInterfaceList = js.Array[NetworkInterface]
  type PaginationToken = String
  type ParameterKey = String
  type ParameterValue = String
  type RecoveryPointList = js.Array[RecoveryPoint]
  type SecurityGroupId = String
  type SecurityGroupIdList = js.Array[SecurityGroupId]
  type SnapshotList = js.Array[Snapshot]
  type SubnetId = String
  type SubnetIdList = js.Array[SubnetId]
  type SyntheticTimestamp_date_time = js.Date
  type TableRestoreStatusList = js.Array[TableRestoreStatus]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type Timestamp = js.Date
  type UsageLimits = js.Array[UsageLimit]
  type VpcEndpointList = js.Array[VpcEndpoint]
  type VpcSecurityGroupId = String
  type VpcSecurityGroupIdList = js.Array[VpcSecurityGroupId]
  type VpcSecurityGroupMembershipList = js.Array[VpcSecurityGroupMembership]
  type WorkgroupList = js.Array[Workgroup]
  type WorkgroupName = String

  final class RedshiftServerlessOps(private val service: RedshiftServerless) extends AnyVal {

    @inline def convertRecoveryPointToSnapshotFuture(params: ConvertRecoveryPointToSnapshotRequest): Future[ConvertRecoveryPointToSnapshotResponse] = service.convertRecoveryPointToSnapshot(params).promise().toFuture
    @inline def createEndpointAccessFuture(params: CreateEndpointAccessRequest): Future[CreateEndpointAccessResponse] = service.createEndpointAccess(params).promise().toFuture
    @inline def createNamespaceFuture(params: CreateNamespaceRequest): Future[CreateNamespaceResponse] = service.createNamespace(params).promise().toFuture
    @inline def createSnapshotFuture(params: CreateSnapshotRequest): Future[CreateSnapshotResponse] = service.createSnapshot(params).promise().toFuture
    @inline def createUsageLimitFuture(params: CreateUsageLimitRequest): Future[CreateUsageLimitResponse] = service.createUsageLimit(params).promise().toFuture
    @inline def createWorkgroupFuture(params: CreateWorkgroupRequest): Future[CreateWorkgroupResponse] = service.createWorkgroup(params).promise().toFuture
    @inline def deleteEndpointAccessFuture(params: DeleteEndpointAccessRequest): Future[DeleteEndpointAccessResponse] = service.deleteEndpointAccess(params).promise().toFuture
    @inline def deleteNamespaceFuture(params: DeleteNamespaceRequest): Future[DeleteNamespaceResponse] = service.deleteNamespace(params).promise().toFuture
    @inline def deleteResourcePolicyFuture(params: DeleteResourcePolicyRequest): Future[DeleteResourcePolicyResponse] = service.deleteResourcePolicy(params).promise().toFuture
    @inline def deleteSnapshotFuture(params: DeleteSnapshotRequest): Future[DeleteSnapshotResponse] = service.deleteSnapshot(params).promise().toFuture
    @inline def deleteUsageLimitFuture(params: DeleteUsageLimitRequest): Future[DeleteUsageLimitResponse] = service.deleteUsageLimit(params).promise().toFuture
    @inline def deleteWorkgroupFuture(params: DeleteWorkgroupRequest): Future[DeleteWorkgroupResponse] = service.deleteWorkgroup(params).promise().toFuture
    @inline def getCredentialsFuture(params: GetCredentialsRequest): Future[GetCredentialsResponse] = service.getCredentials(params).promise().toFuture
    @inline def getEndpointAccessFuture(params: GetEndpointAccessRequest): Future[GetEndpointAccessResponse] = service.getEndpointAccess(params).promise().toFuture
    @inline def getNamespaceFuture(params: GetNamespaceRequest): Future[GetNamespaceResponse] = service.getNamespace(params).promise().toFuture
    @inline def getRecoveryPointFuture(params: GetRecoveryPointRequest): Future[GetRecoveryPointResponse] = service.getRecoveryPoint(params).promise().toFuture
    @inline def getResourcePolicyFuture(params: GetResourcePolicyRequest): Future[GetResourcePolicyResponse] = service.getResourcePolicy(params).promise().toFuture
    @inline def getSnapshotFuture(params: GetSnapshotRequest): Future[GetSnapshotResponse] = service.getSnapshot(params).promise().toFuture
    @inline def getTableRestoreStatusFuture(params: GetTableRestoreStatusRequest): Future[GetTableRestoreStatusResponse] = service.getTableRestoreStatus(params).promise().toFuture
    @inline def getUsageLimitFuture(params: GetUsageLimitRequest): Future[GetUsageLimitResponse] = service.getUsageLimit(params).promise().toFuture
    @inline def getWorkgroupFuture(params: GetWorkgroupRequest): Future[GetWorkgroupResponse] = service.getWorkgroup(params).promise().toFuture
    @inline def listEndpointAccessFuture(params: ListEndpointAccessRequest): Future[ListEndpointAccessResponse] = service.listEndpointAccess(params).promise().toFuture
    @inline def listNamespacesFuture(params: ListNamespacesRequest): Future[ListNamespacesResponse] = service.listNamespaces(params).promise().toFuture
    @inline def listRecoveryPointsFuture(params: ListRecoveryPointsRequest): Future[ListRecoveryPointsResponse] = service.listRecoveryPoints(params).promise().toFuture
    @inline def listSnapshotsFuture(params: ListSnapshotsRequest): Future[ListSnapshotsResponse] = service.listSnapshots(params).promise().toFuture
    @inline def listTableRestoreStatusFuture(params: ListTableRestoreStatusRequest): Future[ListTableRestoreStatusResponse] = service.listTableRestoreStatus(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def listUsageLimitsFuture(params: ListUsageLimitsRequest): Future[ListUsageLimitsResponse] = service.listUsageLimits(params).promise().toFuture
    @inline def listWorkgroupsFuture(params: ListWorkgroupsRequest): Future[ListWorkgroupsResponse] = service.listWorkgroups(params).promise().toFuture
    @inline def putResourcePolicyFuture(params: PutResourcePolicyRequest): Future[PutResourcePolicyResponse] = service.putResourcePolicy(params).promise().toFuture
    @inline def restoreFromRecoveryPointFuture(params: RestoreFromRecoveryPointRequest): Future[RestoreFromRecoveryPointResponse] = service.restoreFromRecoveryPoint(params).promise().toFuture
    @inline def restoreFromSnapshotFuture(params: RestoreFromSnapshotRequest): Future[RestoreFromSnapshotResponse] = service.restoreFromSnapshot(params).promise().toFuture
    @inline def restoreTableFromSnapshotFuture(params: RestoreTableFromSnapshotRequest): Future[RestoreTableFromSnapshotResponse] = service.restoreTableFromSnapshot(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateEndpointAccessFuture(params: UpdateEndpointAccessRequest): Future[UpdateEndpointAccessResponse] = service.updateEndpointAccess(params).promise().toFuture
    @inline def updateNamespaceFuture(params: UpdateNamespaceRequest): Future[UpdateNamespaceResponse] = service.updateNamespace(params).promise().toFuture
    @inline def updateSnapshotFuture(params: UpdateSnapshotRequest): Future[UpdateSnapshotResponse] = service.updateSnapshot(params).promise().toFuture
    @inline def updateUsageLimitFuture(params: UpdateUsageLimitRequest): Future[UpdateUsageLimitResponse] = service.updateUsageLimit(params).promise().toFuture
    @inline def updateWorkgroupFuture(params: UpdateWorkgroupRequest): Future[UpdateWorkgroupResponse] = service.updateWorkgroup(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/redshiftserverless", JSImport.Namespace, "AWS.RedshiftServerless")
  class RedshiftServerless() extends js.Object {
    def this(config: AWSConfig) = this()

    def convertRecoveryPointToSnapshot(params: ConvertRecoveryPointToSnapshotRequest): Request[ConvertRecoveryPointToSnapshotResponse] = js.native
    def createEndpointAccess(params: CreateEndpointAccessRequest): Request[CreateEndpointAccessResponse] = js.native
    def createNamespace(params: CreateNamespaceRequest): Request[CreateNamespaceResponse] = js.native
    def createSnapshot(params: CreateSnapshotRequest): Request[CreateSnapshotResponse] = js.native
    def createUsageLimit(params: CreateUsageLimitRequest): Request[CreateUsageLimitResponse] = js.native
    def createWorkgroup(params: CreateWorkgroupRequest): Request[CreateWorkgroupResponse] = js.native
    def deleteEndpointAccess(params: DeleteEndpointAccessRequest): Request[DeleteEndpointAccessResponse] = js.native
    def deleteNamespace(params: DeleteNamespaceRequest): Request[DeleteNamespaceResponse] = js.native
    def deleteResourcePolicy(params: DeleteResourcePolicyRequest): Request[DeleteResourcePolicyResponse] = js.native
    def deleteSnapshot(params: DeleteSnapshotRequest): Request[DeleteSnapshotResponse] = js.native
    def deleteUsageLimit(params: DeleteUsageLimitRequest): Request[DeleteUsageLimitResponse] = js.native
    def deleteWorkgroup(params: DeleteWorkgroupRequest): Request[DeleteWorkgroupResponse] = js.native
    def getCredentials(params: GetCredentialsRequest): Request[GetCredentialsResponse] = js.native
    def getEndpointAccess(params: GetEndpointAccessRequest): Request[GetEndpointAccessResponse] = js.native
    def getNamespace(params: GetNamespaceRequest): Request[GetNamespaceResponse] = js.native
    def getRecoveryPoint(params: GetRecoveryPointRequest): Request[GetRecoveryPointResponse] = js.native
    def getResourcePolicy(params: GetResourcePolicyRequest): Request[GetResourcePolicyResponse] = js.native
    def getSnapshot(params: GetSnapshotRequest): Request[GetSnapshotResponse] = js.native
    def getTableRestoreStatus(params: GetTableRestoreStatusRequest): Request[GetTableRestoreStatusResponse] = js.native
    def getUsageLimit(params: GetUsageLimitRequest): Request[GetUsageLimitResponse] = js.native
    def getWorkgroup(params: GetWorkgroupRequest): Request[GetWorkgroupResponse] = js.native
    def listEndpointAccess(params: ListEndpointAccessRequest): Request[ListEndpointAccessResponse] = js.native
    def listNamespaces(params: ListNamespacesRequest): Request[ListNamespacesResponse] = js.native
    def listRecoveryPoints(params: ListRecoveryPointsRequest): Request[ListRecoveryPointsResponse] = js.native
    def listSnapshots(params: ListSnapshotsRequest): Request[ListSnapshotsResponse] = js.native
    def listTableRestoreStatus(params: ListTableRestoreStatusRequest): Request[ListTableRestoreStatusResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def listUsageLimits(params: ListUsageLimitsRequest): Request[ListUsageLimitsResponse] = js.native
    def listWorkgroups(params: ListWorkgroupsRequest): Request[ListWorkgroupsResponse] = js.native
    def putResourcePolicy(params: PutResourcePolicyRequest): Request[PutResourcePolicyResponse] = js.native
    def restoreFromRecoveryPoint(params: RestoreFromRecoveryPointRequest): Request[RestoreFromRecoveryPointResponse] = js.native
    def restoreFromSnapshot(params: RestoreFromSnapshotRequest): Request[RestoreFromSnapshotResponse] = js.native
    def restoreTableFromSnapshot(params: RestoreTableFromSnapshotRequest): Request[RestoreTableFromSnapshotResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateEndpointAccess(params: UpdateEndpointAccessRequest): Request[UpdateEndpointAccessResponse] = js.native
    def updateNamespace(params: UpdateNamespaceRequest): Request[UpdateNamespaceResponse] = js.native
    def updateSnapshot(params: UpdateSnapshotRequest): Request[UpdateSnapshotResponse] = js.native
    def updateUsageLimit(params: UpdateUsageLimitRequest): Request[UpdateUsageLimitResponse] = js.native
    def updateWorkgroup(params: UpdateWorkgroupRequest): Request[UpdateWorkgroupResponse] = js.native
  }
  object RedshiftServerless {
    @inline implicit def toOps(service: RedshiftServerless): RedshiftServerlessOps = {
      new RedshiftServerlessOps(service)
    }
  }

  /** An array of key-value pairs to set for advanced control over Amazon Redshift Serverless.
    */
  @js.native
  trait ConfigParameter extends js.Object {
    var parameterKey: js.UndefOr[ParameterKey]
    var parameterValue: js.UndefOr[ParameterValue]
  }

  object ConfigParameter {
    @inline
    def apply(
        parameterKey: js.UndefOr[ParameterKey] = js.undefined,
        parameterValue: js.UndefOr[ParameterValue] = js.undefined
    ): ConfigParameter = {
      val __obj = js.Dynamic.literal()
      parameterKey.foreach(__v => __obj.updateDynamic("parameterKey")(__v.asInstanceOf[js.Any]))
      parameterValue.foreach(__v => __obj.updateDynamic("parameterValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfigParameter]
    }
  }

  @js.native
  trait ConvertRecoveryPointToSnapshotRequest extends js.Object {
    var recoveryPointId: String
    var snapshotName: String
    var retentionPeriod: js.UndefOr[Int]
    var tags: js.UndefOr[TagList]
  }

  object ConvertRecoveryPointToSnapshotRequest {
    @inline
    def apply(
        recoveryPointId: String,
        snapshotName: String,
        retentionPeriod: js.UndefOr[Int] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): ConvertRecoveryPointToSnapshotRequest = {
      val __obj = js.Dynamic.literal(
        "recoveryPointId" -> recoveryPointId.asInstanceOf[js.Any],
        "snapshotName" -> snapshotName.asInstanceOf[js.Any]
      )

      retentionPeriod.foreach(__v => __obj.updateDynamic("retentionPeriod")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConvertRecoveryPointToSnapshotRequest]
    }
  }

  @js.native
  trait ConvertRecoveryPointToSnapshotResponse extends js.Object {
    var snapshot: js.UndefOr[Snapshot]
  }

  object ConvertRecoveryPointToSnapshotResponse {
    @inline
    def apply(
        snapshot: js.UndefOr[Snapshot] = js.undefined
    ): ConvertRecoveryPointToSnapshotResponse = {
      val __obj = js.Dynamic.literal()
      snapshot.foreach(__v => __obj.updateDynamic("snapshot")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConvertRecoveryPointToSnapshotResponse]
    }
  }

  @js.native
  trait CreateEndpointAccessRequest extends js.Object {
    var endpointName: String
    var subnetIds: SubnetIdList
    var workgroupName: String
    var vpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList]
  }

  object CreateEndpointAccessRequest {
    @inline
    def apply(
        endpointName: String,
        subnetIds: SubnetIdList,
        workgroupName: String,
        vpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
    ): CreateEndpointAccessRequest = {
      val __obj = js.Dynamic.literal(
        "endpointName" -> endpointName.asInstanceOf[js.Any],
        "subnetIds" -> subnetIds.asInstanceOf[js.Any],
        "workgroupName" -> workgroupName.asInstanceOf[js.Any]
      )

      vpcSecurityGroupIds.foreach(__v => __obj.updateDynamic("vpcSecurityGroupIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateEndpointAccessRequest]
    }
  }

  @js.native
  trait CreateEndpointAccessResponse extends js.Object {
    var endpoint: js.UndefOr[EndpointAccess]
  }

  object CreateEndpointAccessResponse {
    @inline
    def apply(
        endpoint: js.UndefOr[EndpointAccess] = js.undefined
    ): CreateEndpointAccessResponse = {
      val __obj = js.Dynamic.literal()
      endpoint.foreach(__v => __obj.updateDynamic("endpoint")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateEndpointAccessResponse]
    }
  }

  @js.native
  trait CreateNamespaceRequest extends js.Object {
    var namespaceName: NamespaceName
    var adminUserPassword: js.UndefOr[DbPassword]
    var adminUsername: js.UndefOr[DbUser]
    var dbName: js.UndefOr[String]
    var defaultIamRoleArn: js.UndefOr[String]
    var iamRoles: js.UndefOr[IamRoleArnList]
    var kmsKeyId: js.UndefOr[String]
    var logExports: js.UndefOr[LogExportList]
    var tags: js.UndefOr[TagList]
  }

  object CreateNamespaceRequest {
    @inline
    def apply(
        namespaceName: NamespaceName,
        adminUserPassword: js.UndefOr[DbPassword] = js.undefined,
        adminUsername: js.UndefOr[DbUser] = js.undefined,
        dbName: js.UndefOr[String] = js.undefined,
        defaultIamRoleArn: js.UndefOr[String] = js.undefined,
        iamRoles: js.UndefOr[IamRoleArnList] = js.undefined,
        kmsKeyId: js.UndefOr[String] = js.undefined,
        logExports: js.UndefOr[LogExportList] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateNamespaceRequest = {
      val __obj = js.Dynamic.literal(
        "namespaceName" -> namespaceName.asInstanceOf[js.Any]
      )

      adminUserPassword.foreach(__v => __obj.updateDynamic("adminUserPassword")(__v.asInstanceOf[js.Any]))
      adminUsername.foreach(__v => __obj.updateDynamic("adminUsername")(__v.asInstanceOf[js.Any]))
      dbName.foreach(__v => __obj.updateDynamic("dbName")(__v.asInstanceOf[js.Any]))
      defaultIamRoleArn.foreach(__v => __obj.updateDynamic("defaultIamRoleArn")(__v.asInstanceOf[js.Any]))
      iamRoles.foreach(__v => __obj.updateDynamic("iamRoles")(__v.asInstanceOf[js.Any]))
      kmsKeyId.foreach(__v => __obj.updateDynamic("kmsKeyId")(__v.asInstanceOf[js.Any]))
      logExports.foreach(__v => __obj.updateDynamic("logExports")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateNamespaceRequest]
    }
  }

  @js.native
  trait CreateNamespaceResponse extends js.Object {
    var namespace: js.UndefOr[Namespace]
  }

  object CreateNamespaceResponse {
    @inline
    def apply(
        namespace: js.UndefOr[Namespace] = js.undefined
    ): CreateNamespaceResponse = {
      val __obj = js.Dynamic.literal()
      namespace.foreach(__v => __obj.updateDynamic("namespace")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateNamespaceResponse]
    }
  }

  @js.native
  trait CreateSnapshotRequest extends js.Object {
    var namespaceName: String
    var snapshotName: String
    var retentionPeriod: js.UndefOr[Int]
    var tags: js.UndefOr[TagList]
  }

  object CreateSnapshotRequest {
    @inline
    def apply(
        namespaceName: String,
        snapshotName: String,
        retentionPeriod: js.UndefOr[Int] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateSnapshotRequest = {
      val __obj = js.Dynamic.literal(
        "namespaceName" -> namespaceName.asInstanceOf[js.Any],
        "snapshotName" -> snapshotName.asInstanceOf[js.Any]
      )

      retentionPeriod.foreach(__v => __obj.updateDynamic("retentionPeriod")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSnapshotRequest]
    }
  }

  @js.native
  trait CreateSnapshotResponse extends js.Object {
    var snapshot: js.UndefOr[Snapshot]
  }

  object CreateSnapshotResponse {
    @inline
    def apply(
        snapshot: js.UndefOr[Snapshot] = js.undefined
    ): CreateSnapshotResponse = {
      val __obj = js.Dynamic.literal()
      snapshot.foreach(__v => __obj.updateDynamic("snapshot")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSnapshotResponse]
    }
  }

  @js.native
  trait CreateUsageLimitRequest extends js.Object {
    var amount: Double
    var resourceArn: String
    var usageType: UsageLimitUsageType
    var breachAction: js.UndefOr[UsageLimitBreachAction]
    var period: js.UndefOr[UsageLimitPeriod]
  }

  object CreateUsageLimitRequest {
    @inline
    def apply(
        amount: Double,
        resourceArn: String,
        usageType: UsageLimitUsageType,
        breachAction: js.UndefOr[UsageLimitBreachAction] = js.undefined,
        period: js.UndefOr[UsageLimitPeriod] = js.undefined
    ): CreateUsageLimitRequest = {
      val __obj = js.Dynamic.literal(
        "amount" -> amount.asInstanceOf[js.Any],
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "usageType" -> usageType.asInstanceOf[js.Any]
      )

      breachAction.foreach(__v => __obj.updateDynamic("breachAction")(__v.asInstanceOf[js.Any]))
      period.foreach(__v => __obj.updateDynamic("period")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateUsageLimitRequest]
    }
  }

  @js.native
  trait CreateUsageLimitResponse extends js.Object {
    var usageLimit: js.UndefOr[UsageLimit]
  }

  object CreateUsageLimitResponse {
    @inline
    def apply(
        usageLimit: js.UndefOr[UsageLimit] = js.undefined
    ): CreateUsageLimitResponse = {
      val __obj = js.Dynamic.literal()
      usageLimit.foreach(__v => __obj.updateDynamic("usageLimit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateUsageLimitResponse]
    }
  }

  @js.native
  trait CreateWorkgroupRequest extends js.Object {
    var namespaceName: NamespaceName
    var workgroupName: WorkgroupName
    var baseCapacity: js.UndefOr[Int]
    var configParameters: js.UndefOr[ConfigParameterList]
    var enhancedVpcRouting: js.UndefOr[Boolean]
    var port: js.UndefOr[Int]
    var publiclyAccessible: js.UndefOr[Boolean]
    var securityGroupIds: js.UndefOr[SecurityGroupIdList]
    var subnetIds: js.UndefOr[SubnetIdList]
    var tags: js.UndefOr[TagList]
  }

  object CreateWorkgroupRequest {
    @inline
    def apply(
        namespaceName: NamespaceName,
        workgroupName: WorkgroupName,
        baseCapacity: js.UndefOr[Int] = js.undefined,
        configParameters: js.UndefOr[ConfigParameterList] = js.undefined,
        enhancedVpcRouting: js.UndefOr[Boolean] = js.undefined,
        port: js.UndefOr[Int] = js.undefined,
        publiclyAccessible: js.UndefOr[Boolean] = js.undefined,
        securityGroupIds: js.UndefOr[SecurityGroupIdList] = js.undefined,
        subnetIds: js.UndefOr[SubnetIdList] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateWorkgroupRequest = {
      val __obj = js.Dynamic.literal(
        "namespaceName" -> namespaceName.asInstanceOf[js.Any],
        "workgroupName" -> workgroupName.asInstanceOf[js.Any]
      )

      baseCapacity.foreach(__v => __obj.updateDynamic("baseCapacity")(__v.asInstanceOf[js.Any]))
      configParameters.foreach(__v => __obj.updateDynamic("configParameters")(__v.asInstanceOf[js.Any]))
      enhancedVpcRouting.foreach(__v => __obj.updateDynamic("enhancedVpcRouting")(__v.asInstanceOf[js.Any]))
      port.foreach(__v => __obj.updateDynamic("port")(__v.asInstanceOf[js.Any]))
      publiclyAccessible.foreach(__v => __obj.updateDynamic("publiclyAccessible")(__v.asInstanceOf[js.Any]))
      securityGroupIds.foreach(__v => __obj.updateDynamic("securityGroupIds")(__v.asInstanceOf[js.Any]))
      subnetIds.foreach(__v => __obj.updateDynamic("subnetIds")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateWorkgroupRequest]
    }
  }

  @js.native
  trait CreateWorkgroupResponse extends js.Object {
    var workgroup: js.UndefOr[Workgroup]
  }

  object CreateWorkgroupResponse {
    @inline
    def apply(
        workgroup: js.UndefOr[Workgroup] = js.undefined
    ): CreateWorkgroupResponse = {
      val __obj = js.Dynamic.literal()
      workgroup.foreach(__v => __obj.updateDynamic("workgroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateWorkgroupResponse]
    }
  }

  @js.native
  trait DeleteEndpointAccessRequest extends js.Object {
    var endpointName: String
  }

  object DeleteEndpointAccessRequest {
    @inline
    def apply(
        endpointName: String
    ): DeleteEndpointAccessRequest = {
      val __obj = js.Dynamic.literal(
        "endpointName" -> endpointName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteEndpointAccessRequest]
    }
  }

  @js.native
  trait DeleteEndpointAccessResponse extends js.Object {
    var endpoint: js.UndefOr[EndpointAccess]
  }

  object DeleteEndpointAccessResponse {
    @inline
    def apply(
        endpoint: js.UndefOr[EndpointAccess] = js.undefined
    ): DeleteEndpointAccessResponse = {
      val __obj = js.Dynamic.literal()
      endpoint.foreach(__v => __obj.updateDynamic("endpoint")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteEndpointAccessResponse]
    }
  }

  @js.native
  trait DeleteNamespaceRequest extends js.Object {
    var namespaceName: NamespaceName
    var finalSnapshotName: js.UndefOr[String]
    var finalSnapshotRetentionPeriod: js.UndefOr[Int]
  }

  object DeleteNamespaceRequest {
    @inline
    def apply(
        namespaceName: NamespaceName,
        finalSnapshotName: js.UndefOr[String] = js.undefined,
        finalSnapshotRetentionPeriod: js.UndefOr[Int] = js.undefined
    ): DeleteNamespaceRequest = {
      val __obj = js.Dynamic.literal(
        "namespaceName" -> namespaceName.asInstanceOf[js.Any]
      )

      finalSnapshotName.foreach(__v => __obj.updateDynamic("finalSnapshotName")(__v.asInstanceOf[js.Any]))
      finalSnapshotRetentionPeriod.foreach(__v => __obj.updateDynamic("finalSnapshotRetentionPeriod")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteNamespaceRequest]
    }
  }

  @js.native
  trait DeleteNamespaceResponse extends js.Object {
    var namespace: Namespace
  }

  object DeleteNamespaceResponse {
    @inline
    def apply(
        namespace: Namespace
    ): DeleteNamespaceResponse = {
      val __obj = js.Dynamic.literal(
        "namespace" -> namespace.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteNamespaceResponse]
    }
  }

  @js.native
  trait DeleteResourcePolicyRequest extends js.Object {
    var resourceArn: String
  }

  object DeleteResourcePolicyRequest {
    @inline
    def apply(
        resourceArn: String
    ): DeleteResourcePolicyRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteResourcePolicyRequest]
    }
  }

  @js.native
  trait DeleteResourcePolicyResponse extends js.Object

  object DeleteResourcePolicyResponse {
    @inline
    def apply(): DeleteResourcePolicyResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteResourcePolicyResponse]
    }
  }

  @js.native
  trait DeleteSnapshotRequest extends js.Object {
    var snapshotName: String
  }

  object DeleteSnapshotRequest {
    @inline
    def apply(
        snapshotName: String
    ): DeleteSnapshotRequest = {
      val __obj = js.Dynamic.literal(
        "snapshotName" -> snapshotName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteSnapshotRequest]
    }
  }

  @js.native
  trait DeleteSnapshotResponse extends js.Object {
    var snapshot: js.UndefOr[Snapshot]
  }

  object DeleteSnapshotResponse {
    @inline
    def apply(
        snapshot: js.UndefOr[Snapshot] = js.undefined
    ): DeleteSnapshotResponse = {
      val __obj = js.Dynamic.literal()
      snapshot.foreach(__v => __obj.updateDynamic("snapshot")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteSnapshotResponse]
    }
  }

  @js.native
  trait DeleteUsageLimitRequest extends js.Object {
    var usageLimitId: String
  }

  object DeleteUsageLimitRequest {
    @inline
    def apply(
        usageLimitId: String
    ): DeleteUsageLimitRequest = {
      val __obj = js.Dynamic.literal(
        "usageLimitId" -> usageLimitId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteUsageLimitRequest]
    }
  }

  @js.native
  trait DeleteUsageLimitResponse extends js.Object {
    var usageLimit: js.UndefOr[UsageLimit]
  }

  object DeleteUsageLimitResponse {
    @inline
    def apply(
        usageLimit: js.UndefOr[UsageLimit] = js.undefined
    ): DeleteUsageLimitResponse = {
      val __obj = js.Dynamic.literal()
      usageLimit.foreach(__v => __obj.updateDynamic("usageLimit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteUsageLimitResponse]
    }
  }

  @js.native
  trait DeleteWorkgroupRequest extends js.Object {
    var workgroupName: WorkgroupName
  }

  object DeleteWorkgroupRequest {
    @inline
    def apply(
        workgroupName: WorkgroupName
    ): DeleteWorkgroupRequest = {
      val __obj = js.Dynamic.literal(
        "workgroupName" -> workgroupName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteWorkgroupRequest]
    }
  }

  @js.native
  trait DeleteWorkgroupResponse extends js.Object {
    var workgroup: Workgroup
  }

  object DeleteWorkgroupResponse {
    @inline
    def apply(
        workgroup: Workgroup
    ): DeleteWorkgroupResponse = {
      val __obj = js.Dynamic.literal(
        "workgroup" -> workgroup.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteWorkgroupResponse]
    }
  }

  /** The VPC endpoint object.
    */
  @js.native
  trait Endpoint extends js.Object {
    var address: js.UndefOr[String]
    var port: js.UndefOr[Int]
    var vpcEndpoints: js.UndefOr[VpcEndpointList]
  }

  object Endpoint {
    @inline
    def apply(
        address: js.UndefOr[String] = js.undefined,
        port: js.UndefOr[Int] = js.undefined,
        vpcEndpoints: js.UndefOr[VpcEndpointList] = js.undefined
    ): Endpoint = {
      val __obj = js.Dynamic.literal()
      address.foreach(__v => __obj.updateDynamic("address")(__v.asInstanceOf[js.Any]))
      port.foreach(__v => __obj.updateDynamic("port")(__v.asInstanceOf[js.Any]))
      vpcEndpoints.foreach(__v => __obj.updateDynamic("vpcEndpoints")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Endpoint]
    }
  }

  /** Information about an Amazon Redshift Serverless VPC endpoint.
    */
  @js.native
  trait EndpointAccess extends js.Object {
    var address: js.UndefOr[String]
    var endpointArn: js.UndefOr[String]
    var endpointCreateTime: js.UndefOr[SyntheticTimestamp_date_time]
    var endpointName: js.UndefOr[String]
    var endpointStatus: js.UndefOr[String]
    var port: js.UndefOr[Int]
    var subnetIds: js.UndefOr[SubnetIdList]
    var vpcEndpoint: js.UndefOr[VpcEndpoint]
    var vpcSecurityGroups: js.UndefOr[VpcSecurityGroupMembershipList]
    var workgroupName: js.UndefOr[String]
  }

  object EndpointAccess {
    @inline
    def apply(
        address: js.UndefOr[String] = js.undefined,
        endpointArn: js.UndefOr[String] = js.undefined,
        endpointCreateTime: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined,
        endpointName: js.UndefOr[String] = js.undefined,
        endpointStatus: js.UndefOr[String] = js.undefined,
        port: js.UndefOr[Int] = js.undefined,
        subnetIds: js.UndefOr[SubnetIdList] = js.undefined,
        vpcEndpoint: js.UndefOr[VpcEndpoint] = js.undefined,
        vpcSecurityGroups: js.UndefOr[VpcSecurityGroupMembershipList] = js.undefined,
        workgroupName: js.UndefOr[String] = js.undefined
    ): EndpointAccess = {
      val __obj = js.Dynamic.literal()
      address.foreach(__v => __obj.updateDynamic("address")(__v.asInstanceOf[js.Any]))
      endpointArn.foreach(__v => __obj.updateDynamic("endpointArn")(__v.asInstanceOf[js.Any]))
      endpointCreateTime.foreach(__v => __obj.updateDynamic("endpointCreateTime")(__v.asInstanceOf[js.Any]))
      endpointName.foreach(__v => __obj.updateDynamic("endpointName")(__v.asInstanceOf[js.Any]))
      endpointStatus.foreach(__v => __obj.updateDynamic("endpointStatus")(__v.asInstanceOf[js.Any]))
      port.foreach(__v => __obj.updateDynamic("port")(__v.asInstanceOf[js.Any]))
      subnetIds.foreach(__v => __obj.updateDynamic("subnetIds")(__v.asInstanceOf[js.Any]))
      vpcEndpoint.foreach(__v => __obj.updateDynamic("vpcEndpoint")(__v.asInstanceOf[js.Any]))
      vpcSecurityGroups.foreach(__v => __obj.updateDynamic("vpcSecurityGroups")(__v.asInstanceOf[js.Any]))
      workgroupName.foreach(__v => __obj.updateDynamic("workgroupName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EndpointAccess]
    }
  }

  @js.native
  trait GetCredentialsRequest extends js.Object {
    var workgroupName: WorkgroupName
    var dbName: js.UndefOr[DbName]
    var durationSeconds: js.UndefOr[Int]
  }

  object GetCredentialsRequest {
    @inline
    def apply(
        workgroupName: WorkgroupName,
        dbName: js.UndefOr[DbName] = js.undefined,
        durationSeconds: js.UndefOr[Int] = js.undefined
    ): GetCredentialsRequest = {
      val __obj = js.Dynamic.literal(
        "workgroupName" -> workgroupName.asInstanceOf[js.Any]
      )

      dbName.foreach(__v => __obj.updateDynamic("dbName")(__v.asInstanceOf[js.Any]))
      durationSeconds.foreach(__v => __obj.updateDynamic("durationSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCredentialsRequest]
    }
  }

  @js.native
  trait GetCredentialsResponse extends js.Object {
    var dbPassword: js.UndefOr[DbPassword]
    var dbUser: js.UndefOr[DbUser]
    var expiration: js.UndefOr[Timestamp]
    var nextRefreshTime: js.UndefOr[Timestamp]
  }

  object GetCredentialsResponse {
    @inline
    def apply(
        dbPassword: js.UndefOr[DbPassword] = js.undefined,
        dbUser: js.UndefOr[DbUser] = js.undefined,
        expiration: js.UndefOr[Timestamp] = js.undefined,
        nextRefreshTime: js.UndefOr[Timestamp] = js.undefined
    ): GetCredentialsResponse = {
      val __obj = js.Dynamic.literal()
      dbPassword.foreach(__v => __obj.updateDynamic("dbPassword")(__v.asInstanceOf[js.Any]))
      dbUser.foreach(__v => __obj.updateDynamic("dbUser")(__v.asInstanceOf[js.Any]))
      expiration.foreach(__v => __obj.updateDynamic("expiration")(__v.asInstanceOf[js.Any]))
      nextRefreshTime.foreach(__v => __obj.updateDynamic("nextRefreshTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCredentialsResponse]
    }
  }

  @js.native
  trait GetEndpointAccessRequest extends js.Object {
    var endpointName: String
  }

  object GetEndpointAccessRequest {
    @inline
    def apply(
        endpointName: String
    ): GetEndpointAccessRequest = {
      val __obj = js.Dynamic.literal(
        "endpointName" -> endpointName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetEndpointAccessRequest]
    }
  }

  @js.native
  trait GetEndpointAccessResponse extends js.Object {
    var endpoint: js.UndefOr[EndpointAccess]
  }

  object GetEndpointAccessResponse {
    @inline
    def apply(
        endpoint: js.UndefOr[EndpointAccess] = js.undefined
    ): GetEndpointAccessResponse = {
      val __obj = js.Dynamic.literal()
      endpoint.foreach(__v => __obj.updateDynamic("endpoint")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetEndpointAccessResponse]
    }
  }

  @js.native
  trait GetNamespaceRequest extends js.Object {
    var namespaceName: NamespaceName
  }

  object GetNamespaceRequest {
    @inline
    def apply(
        namespaceName: NamespaceName
    ): GetNamespaceRequest = {
      val __obj = js.Dynamic.literal(
        "namespaceName" -> namespaceName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetNamespaceRequest]
    }
  }

  @js.native
  trait GetNamespaceResponse extends js.Object {
    var namespace: Namespace
  }

  object GetNamespaceResponse {
    @inline
    def apply(
        namespace: Namespace
    ): GetNamespaceResponse = {
      val __obj = js.Dynamic.literal(
        "namespace" -> namespace.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetNamespaceResponse]
    }
  }

  @js.native
  trait GetRecoveryPointRequest extends js.Object {
    var recoveryPointId: String
  }

  object GetRecoveryPointRequest {
    @inline
    def apply(
        recoveryPointId: String
    ): GetRecoveryPointRequest = {
      val __obj = js.Dynamic.literal(
        "recoveryPointId" -> recoveryPointId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetRecoveryPointRequest]
    }
  }

  @js.native
  trait GetRecoveryPointResponse extends js.Object {
    var recoveryPoint: js.UndefOr[RecoveryPoint]
  }

  object GetRecoveryPointResponse {
    @inline
    def apply(
        recoveryPoint: js.UndefOr[RecoveryPoint] = js.undefined
    ): GetRecoveryPointResponse = {
      val __obj = js.Dynamic.literal()
      recoveryPoint.foreach(__v => __obj.updateDynamic("recoveryPoint")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRecoveryPointResponse]
    }
  }

  @js.native
  trait GetResourcePolicyRequest extends js.Object {
    var resourceArn: String
  }

  object GetResourcePolicyRequest {
    @inline
    def apply(
        resourceArn: String
    ): GetResourcePolicyRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetResourcePolicyRequest]
    }
  }

  @js.native
  trait GetResourcePolicyResponse extends js.Object {
    var resourcePolicy: js.UndefOr[ResourcePolicy]
  }

  object GetResourcePolicyResponse {
    @inline
    def apply(
        resourcePolicy: js.UndefOr[ResourcePolicy] = js.undefined
    ): GetResourcePolicyResponse = {
      val __obj = js.Dynamic.literal()
      resourcePolicy.foreach(__v => __obj.updateDynamic("resourcePolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetResourcePolicyResponse]
    }
  }

  @js.native
  trait GetSnapshotRequest extends js.Object {
    var ownerAccount: js.UndefOr[String]
    var snapshotArn: js.UndefOr[String]
    var snapshotName: js.UndefOr[String]
  }

  object GetSnapshotRequest {
    @inline
    def apply(
        ownerAccount: js.UndefOr[String] = js.undefined,
        snapshotArn: js.UndefOr[String] = js.undefined,
        snapshotName: js.UndefOr[String] = js.undefined
    ): GetSnapshotRequest = {
      val __obj = js.Dynamic.literal()
      ownerAccount.foreach(__v => __obj.updateDynamic("ownerAccount")(__v.asInstanceOf[js.Any]))
      snapshotArn.foreach(__v => __obj.updateDynamic("snapshotArn")(__v.asInstanceOf[js.Any]))
      snapshotName.foreach(__v => __obj.updateDynamic("snapshotName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSnapshotRequest]
    }
  }

  @js.native
  trait GetSnapshotResponse extends js.Object {
    var snapshot: js.UndefOr[Snapshot]
  }

  object GetSnapshotResponse {
    @inline
    def apply(
        snapshot: js.UndefOr[Snapshot] = js.undefined
    ): GetSnapshotResponse = {
      val __obj = js.Dynamic.literal()
      snapshot.foreach(__v => __obj.updateDynamic("snapshot")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSnapshotResponse]
    }
  }

  @js.native
  trait GetTableRestoreStatusRequest extends js.Object {
    var tableRestoreRequestId: String
  }

  object GetTableRestoreStatusRequest {
    @inline
    def apply(
        tableRestoreRequestId: String
    ): GetTableRestoreStatusRequest = {
      val __obj = js.Dynamic.literal(
        "tableRestoreRequestId" -> tableRestoreRequestId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetTableRestoreStatusRequest]
    }
  }

  @js.native
  trait GetTableRestoreStatusResponse extends js.Object {
    var tableRestoreStatus: js.UndefOr[TableRestoreStatus]
  }

  object GetTableRestoreStatusResponse {
    @inline
    def apply(
        tableRestoreStatus: js.UndefOr[TableRestoreStatus] = js.undefined
    ): GetTableRestoreStatusResponse = {
      val __obj = js.Dynamic.literal()
      tableRestoreStatus.foreach(__v => __obj.updateDynamic("tableRestoreStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTableRestoreStatusResponse]
    }
  }

  @js.native
  trait GetUsageLimitRequest extends js.Object {
    var usageLimitId: String
  }

  object GetUsageLimitRequest {
    @inline
    def apply(
        usageLimitId: String
    ): GetUsageLimitRequest = {
      val __obj = js.Dynamic.literal(
        "usageLimitId" -> usageLimitId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetUsageLimitRequest]
    }
  }

  @js.native
  trait GetUsageLimitResponse extends js.Object {
    var usageLimit: js.UndefOr[UsageLimit]
  }

  object GetUsageLimitResponse {
    @inline
    def apply(
        usageLimit: js.UndefOr[UsageLimit] = js.undefined
    ): GetUsageLimitResponse = {
      val __obj = js.Dynamic.literal()
      usageLimit.foreach(__v => __obj.updateDynamic("usageLimit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetUsageLimitResponse]
    }
  }

  @js.native
  trait GetWorkgroupRequest extends js.Object {
    var workgroupName: WorkgroupName
  }

  object GetWorkgroupRequest {
    @inline
    def apply(
        workgroupName: WorkgroupName
    ): GetWorkgroupRequest = {
      val __obj = js.Dynamic.literal(
        "workgroupName" -> workgroupName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetWorkgroupRequest]
    }
  }

  @js.native
  trait GetWorkgroupResponse extends js.Object {
    var workgroup: Workgroup
  }

  object GetWorkgroupResponse {
    @inline
    def apply(
        workgroup: Workgroup
    ): GetWorkgroupResponse = {
      val __obj = js.Dynamic.literal(
        "workgroup" -> workgroup.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetWorkgroupResponse]
    }
  }

  @js.native
  trait ListEndpointAccessRequest extends js.Object {
    var maxResults: js.UndefOr[ListEndpointAccessRequestMaxResultsInteger]
    var nextToken: js.UndefOr[String]
    var vpcId: js.UndefOr[String]
    var workgroupName: js.UndefOr[String]
  }

  object ListEndpointAccessRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[ListEndpointAccessRequestMaxResultsInteger] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined,
        vpcId: js.UndefOr[String] = js.undefined,
        workgroupName: js.UndefOr[String] = js.undefined
    ): ListEndpointAccessRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      vpcId.foreach(__v => __obj.updateDynamic("vpcId")(__v.asInstanceOf[js.Any]))
      workgroupName.foreach(__v => __obj.updateDynamic("workgroupName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEndpointAccessRequest]
    }
  }

  @js.native
  trait ListEndpointAccessResponse extends js.Object {
    var endpoints: EndpointAccessList
    var nextToken: js.UndefOr[String]
  }

  object ListEndpointAccessResponse {
    @inline
    def apply(
        endpoints: EndpointAccessList,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListEndpointAccessResponse = {
      val __obj = js.Dynamic.literal(
        "endpoints" -> endpoints.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEndpointAccessResponse]
    }
  }

  @js.native
  trait ListNamespacesRequest extends js.Object {
    var maxResults: js.UndefOr[ListNamespacesRequestMaxResultsInteger]
    var nextToken: js.UndefOr[String]
  }

  object ListNamespacesRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[ListNamespacesRequestMaxResultsInteger] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListNamespacesRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListNamespacesRequest]
    }
  }

  @js.native
  trait ListNamespacesResponse extends js.Object {
    var namespaces: NamespaceList
    var nextToken: js.UndefOr[String]
  }

  object ListNamespacesResponse {
    @inline
    def apply(
        namespaces: NamespaceList,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListNamespacesResponse = {
      val __obj = js.Dynamic.literal(
        "namespaces" -> namespaces.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListNamespacesResponse]
    }
  }

  @js.native
  trait ListRecoveryPointsRequest extends js.Object {
    var endTime: js.UndefOr[Timestamp]
    var maxResults: js.UndefOr[ListRecoveryPointsRequestMaxResultsInteger]
    var namespaceArn: js.UndefOr[String]
    var namespaceName: js.UndefOr[NamespaceName]
    var nextToken: js.UndefOr[String]
    var startTime: js.UndefOr[Timestamp]
  }

  object ListRecoveryPointsRequest {
    @inline
    def apply(
        endTime: js.UndefOr[Timestamp] = js.undefined,
        maxResults: js.UndefOr[ListRecoveryPointsRequestMaxResultsInteger] = js.undefined,
        namespaceArn: js.UndefOr[String] = js.undefined,
        namespaceName: js.UndefOr[NamespaceName] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined,
        startTime: js.UndefOr[Timestamp] = js.undefined
    ): ListRecoveryPointsRequest = {
      val __obj = js.Dynamic.literal()
      endTime.foreach(__v => __obj.updateDynamic("endTime")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      namespaceArn.foreach(__v => __obj.updateDynamic("namespaceArn")(__v.asInstanceOf[js.Any]))
      namespaceName.foreach(__v => __obj.updateDynamic("namespaceName")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      startTime.foreach(__v => __obj.updateDynamic("startTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRecoveryPointsRequest]
    }
  }

  @js.native
  trait ListRecoveryPointsResponse extends js.Object {
    var nextToken: js.UndefOr[String]
    var recoveryPoints: js.UndefOr[RecoveryPointList]
  }

  object ListRecoveryPointsResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[String] = js.undefined,
        recoveryPoints: js.UndefOr[RecoveryPointList] = js.undefined
    ): ListRecoveryPointsResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      recoveryPoints.foreach(__v => __obj.updateDynamic("recoveryPoints")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRecoveryPointsResponse]
    }
  }

  @js.native
  trait ListSnapshotsRequest extends js.Object {
    var endTime: js.UndefOr[Timestamp]
    var maxResults: js.UndefOr[ListSnapshotsRequestMaxResultsInteger]
    var namespaceArn: js.UndefOr[String]
    var namespaceName: js.UndefOr[String]
    var nextToken: js.UndefOr[String]
    var ownerAccount: js.UndefOr[String]
    var startTime: js.UndefOr[Timestamp]
  }

  object ListSnapshotsRequest {
    @inline
    def apply(
        endTime: js.UndefOr[Timestamp] = js.undefined,
        maxResults: js.UndefOr[ListSnapshotsRequestMaxResultsInteger] = js.undefined,
        namespaceArn: js.UndefOr[String] = js.undefined,
        namespaceName: js.UndefOr[String] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined,
        ownerAccount: js.UndefOr[String] = js.undefined,
        startTime: js.UndefOr[Timestamp] = js.undefined
    ): ListSnapshotsRequest = {
      val __obj = js.Dynamic.literal()
      endTime.foreach(__v => __obj.updateDynamic("endTime")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      namespaceArn.foreach(__v => __obj.updateDynamic("namespaceArn")(__v.asInstanceOf[js.Any]))
      namespaceName.foreach(__v => __obj.updateDynamic("namespaceName")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      ownerAccount.foreach(__v => __obj.updateDynamic("ownerAccount")(__v.asInstanceOf[js.Any]))
      startTime.foreach(__v => __obj.updateDynamic("startTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSnapshotsRequest]
    }
  }

  @js.native
  trait ListSnapshotsResponse extends js.Object {
    var nextToken: js.UndefOr[String]
    var snapshots: js.UndefOr[SnapshotList]
  }

  object ListSnapshotsResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[String] = js.undefined,
        snapshots: js.UndefOr[SnapshotList] = js.undefined
    ): ListSnapshotsResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      snapshots.foreach(__v => __obj.updateDynamic("snapshots")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSnapshotsResponse]
    }
  }

  @js.native
  trait ListTableRestoreStatusRequest extends js.Object {
    var maxResults: js.UndefOr[ListTableRestoreStatusRequestMaxResultsInteger]
    var namespaceName: js.UndefOr[String]
    var nextToken: js.UndefOr[PaginationToken]
    var workgroupName: js.UndefOr[String]
  }

  object ListTableRestoreStatusRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[ListTableRestoreStatusRequestMaxResultsInteger] = js.undefined,
        namespaceName: js.UndefOr[String] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        workgroupName: js.UndefOr[String] = js.undefined
    ): ListTableRestoreStatusRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      namespaceName.foreach(__v => __obj.updateDynamic("namespaceName")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      workgroupName.foreach(__v => __obj.updateDynamic("workgroupName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTableRestoreStatusRequest]
    }
  }

  @js.native
  trait ListTableRestoreStatusResponse extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var tableRestoreStatuses: js.UndefOr[TableRestoreStatusList]
  }

  object ListTableRestoreStatusResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        tableRestoreStatuses: js.UndefOr[TableRestoreStatusList] = js.undefined
    ): ListTableRestoreStatusResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      tableRestoreStatuses.foreach(__v => __obj.updateDynamic("tableRestoreStatuses")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTableRestoreStatusResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: AmazonResourceName
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        resourceArn: AmazonResourceName
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var tags: js.UndefOr[TagList]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  @js.native
  trait ListUsageLimitsRequest extends js.Object {
    var maxResults: js.UndefOr[ListUsageLimitsRequestMaxResultsInteger]
    var nextToken: js.UndefOr[PaginationToken]
    var resourceArn: js.UndefOr[String]
    var usageType: js.UndefOr[UsageLimitUsageType]
  }

  object ListUsageLimitsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[ListUsageLimitsRequestMaxResultsInteger] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        resourceArn: js.UndefOr[String] = js.undefined,
        usageType: js.UndefOr[UsageLimitUsageType] = js.undefined
    ): ListUsageLimitsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      resourceArn.foreach(__v => __obj.updateDynamic("resourceArn")(__v.asInstanceOf[js.Any]))
      usageType.foreach(__v => __obj.updateDynamic("usageType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUsageLimitsRequest]
    }
  }

  @js.native
  trait ListUsageLimitsResponse extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var usageLimits: js.UndefOr[UsageLimits]
  }

  object ListUsageLimitsResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        usageLimits: js.UndefOr[UsageLimits] = js.undefined
    ): ListUsageLimitsResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      usageLimits.foreach(__v => __obj.updateDynamic("usageLimits")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUsageLimitsResponse]
    }
  }

  @js.native
  trait ListWorkgroupsRequest extends js.Object {
    var maxResults: js.UndefOr[ListWorkgroupsRequestMaxResultsInteger]
    var nextToken: js.UndefOr[String]
  }

  object ListWorkgroupsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[ListWorkgroupsRequestMaxResultsInteger] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListWorkgroupsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWorkgroupsRequest]
    }
  }

  @js.native
  trait ListWorkgroupsResponse extends js.Object {
    var workgroups: WorkgroupList
    var nextToken: js.UndefOr[String]
  }

  object ListWorkgroupsResponse {
    @inline
    def apply(
        workgroups: WorkgroupList,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListWorkgroupsResponse = {
      val __obj = js.Dynamic.literal(
        "workgroups" -> workgroups.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWorkgroupsResponse]
    }
  }

  /** A collection of database objects and users.
    */
  @js.native
  trait Namespace extends js.Object {
    var adminUsername: js.UndefOr[DbUser]
    var creationDate: js.UndefOr[SyntheticTimestamp_date_time]
    var dbName: js.UndefOr[String]
    var defaultIamRoleArn: js.UndefOr[String]
    var iamRoles: js.UndefOr[IamRoleArnList]
    var kmsKeyId: js.UndefOr[String]
    var logExports: js.UndefOr[LogExportList]
    var namespaceArn: js.UndefOr[String]
    var namespaceId: js.UndefOr[String]
    var namespaceName: js.UndefOr[NamespaceName]
    var status: js.UndefOr[NamespaceStatus]
  }

  object Namespace {
    @inline
    def apply(
        adminUsername: js.UndefOr[DbUser] = js.undefined,
        creationDate: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined,
        dbName: js.UndefOr[String] = js.undefined,
        defaultIamRoleArn: js.UndefOr[String] = js.undefined,
        iamRoles: js.UndefOr[IamRoleArnList] = js.undefined,
        kmsKeyId: js.UndefOr[String] = js.undefined,
        logExports: js.UndefOr[LogExportList] = js.undefined,
        namespaceArn: js.UndefOr[String] = js.undefined,
        namespaceId: js.UndefOr[String] = js.undefined,
        namespaceName: js.UndefOr[NamespaceName] = js.undefined,
        status: js.UndefOr[NamespaceStatus] = js.undefined
    ): Namespace = {
      val __obj = js.Dynamic.literal()
      adminUsername.foreach(__v => __obj.updateDynamic("adminUsername")(__v.asInstanceOf[js.Any]))
      creationDate.foreach(__v => __obj.updateDynamic("creationDate")(__v.asInstanceOf[js.Any]))
      dbName.foreach(__v => __obj.updateDynamic("dbName")(__v.asInstanceOf[js.Any]))
      defaultIamRoleArn.foreach(__v => __obj.updateDynamic("defaultIamRoleArn")(__v.asInstanceOf[js.Any]))
      iamRoles.foreach(__v => __obj.updateDynamic("iamRoles")(__v.asInstanceOf[js.Any]))
      kmsKeyId.foreach(__v => __obj.updateDynamic("kmsKeyId")(__v.asInstanceOf[js.Any]))
      logExports.foreach(__v => __obj.updateDynamic("logExports")(__v.asInstanceOf[js.Any]))
      namespaceArn.foreach(__v => __obj.updateDynamic("namespaceArn")(__v.asInstanceOf[js.Any]))
      namespaceId.foreach(__v => __obj.updateDynamic("namespaceId")(__v.asInstanceOf[js.Any]))
      namespaceName.foreach(__v => __obj.updateDynamic("namespaceName")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Namespace]
    }
  }

  /** Contains information about a network interface in an Amazon Redshift Serverless managed VPC endpoint.
    */
  @js.native
  trait NetworkInterface extends js.Object {
    var availabilityZone: js.UndefOr[String]
    var networkInterfaceId: js.UndefOr[String]
    var privateIpAddress: js.UndefOr[String]
    var subnetId: js.UndefOr[String]
  }

  object NetworkInterface {
    @inline
    def apply(
        availabilityZone: js.UndefOr[String] = js.undefined,
        networkInterfaceId: js.UndefOr[String] = js.undefined,
        privateIpAddress: js.UndefOr[String] = js.undefined,
        subnetId: js.UndefOr[String] = js.undefined
    ): NetworkInterface = {
      val __obj = js.Dynamic.literal()
      availabilityZone.foreach(__v => __obj.updateDynamic("availabilityZone")(__v.asInstanceOf[js.Any]))
      networkInterfaceId.foreach(__v => __obj.updateDynamic("networkInterfaceId")(__v.asInstanceOf[js.Any]))
      privateIpAddress.foreach(__v => __obj.updateDynamic("privateIpAddress")(__v.asInstanceOf[js.Any]))
      subnetId.foreach(__v => __obj.updateDynamic("subnetId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkInterface]
    }
  }

  @js.native
  trait PutResourcePolicyRequest extends js.Object {
    var policy: String
    var resourceArn: String
  }

  object PutResourcePolicyRequest {
    @inline
    def apply(
        policy: String,
        resourceArn: String
    ): PutResourcePolicyRequest = {
      val __obj = js.Dynamic.literal(
        "policy" -> policy.asInstanceOf[js.Any],
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutResourcePolicyRequest]
    }
  }

  @js.native
  trait PutResourcePolicyResponse extends js.Object {
    var resourcePolicy: js.UndefOr[ResourcePolicy]
  }

  object PutResourcePolicyResponse {
    @inline
    def apply(
        resourcePolicy: js.UndefOr[ResourcePolicy] = js.undefined
    ): PutResourcePolicyResponse = {
      val __obj = js.Dynamic.literal()
      resourcePolicy.foreach(__v => __obj.updateDynamic("resourcePolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutResourcePolicyResponse]
    }
  }

  /** The automatically created recovery point of a namespace. Recovery points are created every 30 minutes and kept for 24 hours.
    */
  @js.native
  trait RecoveryPoint extends js.Object {
    var namespaceArn: js.UndefOr[String]
    var namespaceName: js.UndefOr[NamespaceName]
    var recoveryPointCreateTime: js.UndefOr[SyntheticTimestamp_date_time]
    var recoveryPointId: js.UndefOr[String]
    var totalSizeInMegaBytes: js.UndefOr[Double]
    var workgroupName: js.UndefOr[WorkgroupName]
  }

  object RecoveryPoint {
    @inline
    def apply(
        namespaceArn: js.UndefOr[String] = js.undefined,
        namespaceName: js.UndefOr[NamespaceName] = js.undefined,
        recoveryPointCreateTime: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined,
        recoveryPointId: js.UndefOr[String] = js.undefined,
        totalSizeInMegaBytes: js.UndefOr[Double] = js.undefined,
        workgroupName: js.UndefOr[WorkgroupName] = js.undefined
    ): RecoveryPoint = {
      val __obj = js.Dynamic.literal()
      namespaceArn.foreach(__v => __obj.updateDynamic("namespaceArn")(__v.asInstanceOf[js.Any]))
      namespaceName.foreach(__v => __obj.updateDynamic("namespaceName")(__v.asInstanceOf[js.Any]))
      recoveryPointCreateTime.foreach(__v => __obj.updateDynamic("recoveryPointCreateTime")(__v.asInstanceOf[js.Any]))
      recoveryPointId.foreach(__v => __obj.updateDynamic("recoveryPointId")(__v.asInstanceOf[js.Any]))
      totalSizeInMegaBytes.foreach(__v => __obj.updateDynamic("totalSizeInMegaBytes")(__v.asInstanceOf[js.Any]))
      workgroupName.foreach(__v => __obj.updateDynamic("workgroupName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecoveryPoint]
    }
  }

  /** The resource policy object. Currently, you can use policies to share snapshots across Amazon Web Services accounts.
    */
  @js.native
  trait ResourcePolicy extends js.Object {
    var policy: js.UndefOr[String]
    var resourceArn: js.UndefOr[String]
  }

  object ResourcePolicy {
    @inline
    def apply(
        policy: js.UndefOr[String] = js.undefined,
        resourceArn: js.UndefOr[String] = js.undefined
    ): ResourcePolicy = {
      val __obj = js.Dynamic.literal()
      policy.foreach(__v => __obj.updateDynamic("policy")(__v.asInstanceOf[js.Any]))
      resourceArn.foreach(__v => __obj.updateDynamic("resourceArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourcePolicy]
    }
  }

  @js.native
  trait RestoreFromRecoveryPointRequest extends js.Object {
    var namespaceName: NamespaceName
    var recoveryPointId: String
    var workgroupName: WorkgroupName
  }

  object RestoreFromRecoveryPointRequest {
    @inline
    def apply(
        namespaceName: NamespaceName,
        recoveryPointId: String,
        workgroupName: WorkgroupName
    ): RestoreFromRecoveryPointRequest = {
      val __obj = js.Dynamic.literal(
        "namespaceName" -> namespaceName.asInstanceOf[js.Any],
        "recoveryPointId" -> recoveryPointId.asInstanceOf[js.Any],
        "workgroupName" -> workgroupName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RestoreFromRecoveryPointRequest]
    }
  }

  @js.native
  trait RestoreFromRecoveryPointResponse extends js.Object {
    var namespace: js.UndefOr[Namespace]
    var recoveryPointId: js.UndefOr[String]
  }

  object RestoreFromRecoveryPointResponse {
    @inline
    def apply(
        namespace: js.UndefOr[Namespace] = js.undefined,
        recoveryPointId: js.UndefOr[String] = js.undefined
    ): RestoreFromRecoveryPointResponse = {
      val __obj = js.Dynamic.literal()
      namespace.foreach(__v => __obj.updateDynamic("namespace")(__v.asInstanceOf[js.Any]))
      recoveryPointId.foreach(__v => __obj.updateDynamic("recoveryPointId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RestoreFromRecoveryPointResponse]
    }
  }

  @js.native
  trait RestoreFromSnapshotRequest extends js.Object {
    var namespaceName: NamespaceName
    var workgroupName: WorkgroupName
    var ownerAccount: js.UndefOr[String]
    var snapshotArn: js.UndefOr[String]
    var snapshotName: js.UndefOr[String]
  }

  object RestoreFromSnapshotRequest {
    @inline
    def apply(
        namespaceName: NamespaceName,
        workgroupName: WorkgroupName,
        ownerAccount: js.UndefOr[String] = js.undefined,
        snapshotArn: js.UndefOr[String] = js.undefined,
        snapshotName: js.UndefOr[String] = js.undefined
    ): RestoreFromSnapshotRequest = {
      val __obj = js.Dynamic.literal(
        "namespaceName" -> namespaceName.asInstanceOf[js.Any],
        "workgroupName" -> workgroupName.asInstanceOf[js.Any]
      )

      ownerAccount.foreach(__v => __obj.updateDynamic("ownerAccount")(__v.asInstanceOf[js.Any]))
      snapshotArn.foreach(__v => __obj.updateDynamic("snapshotArn")(__v.asInstanceOf[js.Any]))
      snapshotName.foreach(__v => __obj.updateDynamic("snapshotName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RestoreFromSnapshotRequest]
    }
  }

  @js.native
  trait RestoreFromSnapshotResponse extends js.Object {
    var namespace: js.UndefOr[Namespace]
    var ownerAccount: js.UndefOr[String]
    var snapshotName: js.UndefOr[String]
  }

  object RestoreFromSnapshotResponse {
    @inline
    def apply(
        namespace: js.UndefOr[Namespace] = js.undefined,
        ownerAccount: js.UndefOr[String] = js.undefined,
        snapshotName: js.UndefOr[String] = js.undefined
    ): RestoreFromSnapshotResponse = {
      val __obj = js.Dynamic.literal()
      namespace.foreach(__v => __obj.updateDynamic("namespace")(__v.asInstanceOf[js.Any]))
      ownerAccount.foreach(__v => __obj.updateDynamic("ownerAccount")(__v.asInstanceOf[js.Any]))
      snapshotName.foreach(__v => __obj.updateDynamic("snapshotName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RestoreFromSnapshotResponse]
    }
  }

  @js.native
  trait RestoreTableFromSnapshotRequest extends js.Object {
    var namespaceName: String
    var newTableName: String
    var snapshotName: String
    var sourceDatabaseName: String
    var sourceTableName: String
    var workgroupName: String
    var activateCaseSensitiveIdentifier: js.UndefOr[Boolean]
    var sourceSchemaName: js.UndefOr[String]
    var targetDatabaseName: js.UndefOr[String]
    var targetSchemaName: js.UndefOr[String]
  }

  object RestoreTableFromSnapshotRequest {
    @inline
    def apply(
        namespaceName: String,
        newTableName: String,
        snapshotName: String,
        sourceDatabaseName: String,
        sourceTableName: String,
        workgroupName: String,
        activateCaseSensitiveIdentifier: js.UndefOr[Boolean] = js.undefined,
        sourceSchemaName: js.UndefOr[String] = js.undefined,
        targetDatabaseName: js.UndefOr[String] = js.undefined,
        targetSchemaName: js.UndefOr[String] = js.undefined
    ): RestoreTableFromSnapshotRequest = {
      val __obj = js.Dynamic.literal(
        "namespaceName" -> namespaceName.asInstanceOf[js.Any],
        "newTableName" -> newTableName.asInstanceOf[js.Any],
        "snapshotName" -> snapshotName.asInstanceOf[js.Any],
        "sourceDatabaseName" -> sourceDatabaseName.asInstanceOf[js.Any],
        "sourceTableName" -> sourceTableName.asInstanceOf[js.Any],
        "workgroupName" -> workgroupName.asInstanceOf[js.Any]
      )

      activateCaseSensitiveIdentifier.foreach(__v => __obj.updateDynamic("activateCaseSensitiveIdentifier")(__v.asInstanceOf[js.Any]))
      sourceSchemaName.foreach(__v => __obj.updateDynamic("sourceSchemaName")(__v.asInstanceOf[js.Any]))
      targetDatabaseName.foreach(__v => __obj.updateDynamic("targetDatabaseName")(__v.asInstanceOf[js.Any]))
      targetSchemaName.foreach(__v => __obj.updateDynamic("targetSchemaName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RestoreTableFromSnapshotRequest]
    }
  }

  @js.native
  trait RestoreTableFromSnapshotResponse extends js.Object {
    var tableRestoreStatus: js.UndefOr[TableRestoreStatus]
  }

  object RestoreTableFromSnapshotResponse {
    @inline
    def apply(
        tableRestoreStatus: js.UndefOr[TableRestoreStatus] = js.undefined
    ): RestoreTableFromSnapshotResponse = {
      val __obj = js.Dynamic.literal()
      tableRestoreStatus.foreach(__v => __obj.updateDynamic("tableRestoreStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RestoreTableFromSnapshotResponse]
    }
  }

  /** A snapshot object that contains databases.
    */
  @js.native
  trait Snapshot extends js.Object {
    var accountsWithProvisionedRestoreAccess: js.UndefOr[AccountIdList]
    var accountsWithRestoreAccess: js.UndefOr[AccountIdList]
    var actualIncrementalBackupSizeInMegaBytes: js.UndefOr[Double]
    var adminUsername: js.UndefOr[String]
    var backupProgressInMegaBytes: js.UndefOr[Double]
    var currentBackupRateInMegaBytesPerSecond: js.UndefOr[Double]
    var elapsedTimeInSeconds: js.UndefOr[Double]
    var estimatedSecondsToCompletion: js.UndefOr[Double]
    var kmsKeyId: js.UndefOr[KmsKeyId]
    var namespaceArn: js.UndefOr[String]
    var namespaceName: js.UndefOr[String]
    var ownerAccount: js.UndefOr[String]
    var snapshotArn: js.UndefOr[String]
    var snapshotCreateTime: js.UndefOr[SyntheticTimestamp_date_time]
    var snapshotName: js.UndefOr[String]
    var snapshotRemainingDays: js.UndefOr[Int]
    var snapshotRetentionPeriod: js.UndefOr[Int]
    var snapshotRetentionStartTime: js.UndefOr[SyntheticTimestamp_date_time]
    var status: js.UndefOr[SnapshotStatus]
    var totalBackupSizeInMegaBytes: js.UndefOr[Double]
  }

  object Snapshot {
    @inline
    def apply(
        accountsWithProvisionedRestoreAccess: js.UndefOr[AccountIdList] = js.undefined,
        accountsWithRestoreAccess: js.UndefOr[AccountIdList] = js.undefined,
        actualIncrementalBackupSizeInMegaBytes: js.UndefOr[Double] = js.undefined,
        adminUsername: js.UndefOr[String] = js.undefined,
        backupProgressInMegaBytes: js.UndefOr[Double] = js.undefined,
        currentBackupRateInMegaBytesPerSecond: js.UndefOr[Double] = js.undefined,
        elapsedTimeInSeconds: js.UndefOr[Double] = js.undefined,
        estimatedSecondsToCompletion: js.UndefOr[Double] = js.undefined,
        kmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        namespaceArn: js.UndefOr[String] = js.undefined,
        namespaceName: js.UndefOr[String] = js.undefined,
        ownerAccount: js.UndefOr[String] = js.undefined,
        snapshotArn: js.UndefOr[String] = js.undefined,
        snapshotCreateTime: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined,
        snapshotName: js.UndefOr[String] = js.undefined,
        snapshotRemainingDays: js.UndefOr[Int] = js.undefined,
        snapshotRetentionPeriod: js.UndefOr[Int] = js.undefined,
        snapshotRetentionStartTime: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined,
        status: js.UndefOr[SnapshotStatus] = js.undefined,
        totalBackupSizeInMegaBytes: js.UndefOr[Double] = js.undefined
    ): Snapshot = {
      val __obj = js.Dynamic.literal()
      accountsWithProvisionedRestoreAccess.foreach(__v => __obj.updateDynamic("accountsWithProvisionedRestoreAccess")(__v.asInstanceOf[js.Any]))
      accountsWithRestoreAccess.foreach(__v => __obj.updateDynamic("accountsWithRestoreAccess")(__v.asInstanceOf[js.Any]))
      actualIncrementalBackupSizeInMegaBytes.foreach(__v => __obj.updateDynamic("actualIncrementalBackupSizeInMegaBytes")(__v.asInstanceOf[js.Any]))
      adminUsername.foreach(__v => __obj.updateDynamic("adminUsername")(__v.asInstanceOf[js.Any]))
      backupProgressInMegaBytes.foreach(__v => __obj.updateDynamic("backupProgressInMegaBytes")(__v.asInstanceOf[js.Any]))
      currentBackupRateInMegaBytesPerSecond.foreach(__v => __obj.updateDynamic("currentBackupRateInMegaBytesPerSecond")(__v.asInstanceOf[js.Any]))
      elapsedTimeInSeconds.foreach(__v => __obj.updateDynamic("elapsedTimeInSeconds")(__v.asInstanceOf[js.Any]))
      estimatedSecondsToCompletion.foreach(__v => __obj.updateDynamic("estimatedSecondsToCompletion")(__v.asInstanceOf[js.Any]))
      kmsKeyId.foreach(__v => __obj.updateDynamic("kmsKeyId")(__v.asInstanceOf[js.Any]))
      namespaceArn.foreach(__v => __obj.updateDynamic("namespaceArn")(__v.asInstanceOf[js.Any]))
      namespaceName.foreach(__v => __obj.updateDynamic("namespaceName")(__v.asInstanceOf[js.Any]))
      ownerAccount.foreach(__v => __obj.updateDynamic("ownerAccount")(__v.asInstanceOf[js.Any]))
      snapshotArn.foreach(__v => __obj.updateDynamic("snapshotArn")(__v.asInstanceOf[js.Any]))
      snapshotCreateTime.foreach(__v => __obj.updateDynamic("snapshotCreateTime")(__v.asInstanceOf[js.Any]))
      snapshotName.foreach(__v => __obj.updateDynamic("snapshotName")(__v.asInstanceOf[js.Any]))
      snapshotRemainingDays.foreach(__v => __obj.updateDynamic("snapshotRemainingDays")(__v.asInstanceOf[js.Any]))
      snapshotRetentionPeriod.foreach(__v => __obj.updateDynamic("snapshotRetentionPeriod")(__v.asInstanceOf[js.Any]))
      snapshotRetentionStartTime.foreach(__v => __obj.updateDynamic("snapshotRetentionStartTime")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      totalBackupSizeInMegaBytes.foreach(__v => __obj.updateDynamic("totalBackupSizeInMegaBytes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Snapshot]
    }
  }

  /** Contains information about a table restore request.
    */
  @js.native
  trait TableRestoreStatus extends js.Object {
    var message: js.UndefOr[String]
    var namespaceName: js.UndefOr[String]
    var newTableName: js.UndefOr[String]
    var progressInMegaBytes: js.UndefOr[Double]
    var requestTime: js.UndefOr[Timestamp]
    var snapshotName: js.UndefOr[String]
    var sourceDatabaseName: js.UndefOr[String]
    var sourceSchemaName: js.UndefOr[String]
    var sourceTableName: js.UndefOr[String]
    var status: js.UndefOr[String]
    var tableRestoreRequestId: js.UndefOr[String]
    var targetDatabaseName: js.UndefOr[String]
    var targetSchemaName: js.UndefOr[String]
    var totalDataInMegaBytes: js.UndefOr[Double]
    var workgroupName: js.UndefOr[String]
  }

  object TableRestoreStatus {
    @inline
    def apply(
        message: js.UndefOr[String] = js.undefined,
        namespaceName: js.UndefOr[String] = js.undefined,
        newTableName: js.UndefOr[String] = js.undefined,
        progressInMegaBytes: js.UndefOr[Double] = js.undefined,
        requestTime: js.UndefOr[Timestamp] = js.undefined,
        snapshotName: js.UndefOr[String] = js.undefined,
        sourceDatabaseName: js.UndefOr[String] = js.undefined,
        sourceSchemaName: js.UndefOr[String] = js.undefined,
        sourceTableName: js.UndefOr[String] = js.undefined,
        status: js.UndefOr[String] = js.undefined,
        tableRestoreRequestId: js.UndefOr[String] = js.undefined,
        targetDatabaseName: js.UndefOr[String] = js.undefined,
        targetSchemaName: js.UndefOr[String] = js.undefined,
        totalDataInMegaBytes: js.UndefOr[Double] = js.undefined,
        workgroupName: js.UndefOr[String] = js.undefined
    ): TableRestoreStatus = {
      val __obj = js.Dynamic.literal()
      message.foreach(__v => __obj.updateDynamic("message")(__v.asInstanceOf[js.Any]))
      namespaceName.foreach(__v => __obj.updateDynamic("namespaceName")(__v.asInstanceOf[js.Any]))
      newTableName.foreach(__v => __obj.updateDynamic("newTableName")(__v.asInstanceOf[js.Any]))
      progressInMegaBytes.foreach(__v => __obj.updateDynamic("progressInMegaBytes")(__v.asInstanceOf[js.Any]))
      requestTime.foreach(__v => __obj.updateDynamic("requestTime")(__v.asInstanceOf[js.Any]))
      snapshotName.foreach(__v => __obj.updateDynamic("snapshotName")(__v.asInstanceOf[js.Any]))
      sourceDatabaseName.foreach(__v => __obj.updateDynamic("sourceDatabaseName")(__v.asInstanceOf[js.Any]))
      sourceSchemaName.foreach(__v => __obj.updateDynamic("sourceSchemaName")(__v.asInstanceOf[js.Any]))
      sourceTableName.foreach(__v => __obj.updateDynamic("sourceTableName")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      tableRestoreRequestId.foreach(__v => __obj.updateDynamic("tableRestoreRequestId")(__v.asInstanceOf[js.Any]))
      targetDatabaseName.foreach(__v => __obj.updateDynamic("targetDatabaseName")(__v.asInstanceOf[js.Any]))
      targetSchemaName.foreach(__v => __obj.updateDynamic("targetSchemaName")(__v.asInstanceOf[js.Any]))
      totalDataInMegaBytes.foreach(__v => __obj.updateDynamic("totalDataInMegaBytes")(__v.asInstanceOf[js.Any]))
      workgroupName.foreach(__v => __obj.updateDynamic("workgroupName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TableRestoreStatus]
    }
  }

  /** A map of key-value pairs.
    */
  @js.native
  trait Tag extends js.Object {
    var key: TagKey
    var value: TagValue
  }

  object Tag {
    @inline
    def apply(
        key: TagKey,
        value: TagValue
    ): Tag = {
      val __obj = js.Dynamic.literal(
        "key" -> key.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: AmazonResourceName
    var tags: TagList
  }

  object TagResourceRequest {
    @inline
    def apply(
        resourceArn: AmazonResourceName,
        tags: TagList
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tags" -> tags.asInstanceOf[js.Any]
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
  trait UntagResourceRequest extends js.Object {
    var resourceArn: AmazonResourceName
    var tagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        resourceArn: AmazonResourceName,
        tagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tagKeys" -> tagKeys.asInstanceOf[js.Any]
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
  trait UpdateEndpointAccessRequest extends js.Object {
    var endpointName: String
    var vpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList]
  }

  object UpdateEndpointAccessRequest {
    @inline
    def apply(
        endpointName: String,
        vpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
    ): UpdateEndpointAccessRequest = {
      val __obj = js.Dynamic.literal(
        "endpointName" -> endpointName.asInstanceOf[js.Any]
      )

      vpcSecurityGroupIds.foreach(__v => __obj.updateDynamic("vpcSecurityGroupIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateEndpointAccessRequest]
    }
  }

  @js.native
  trait UpdateEndpointAccessResponse extends js.Object {
    var endpoint: js.UndefOr[EndpointAccess]
  }

  object UpdateEndpointAccessResponse {
    @inline
    def apply(
        endpoint: js.UndefOr[EndpointAccess] = js.undefined
    ): UpdateEndpointAccessResponse = {
      val __obj = js.Dynamic.literal()
      endpoint.foreach(__v => __obj.updateDynamic("endpoint")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateEndpointAccessResponse]
    }
  }

  @js.native
  trait UpdateNamespaceRequest extends js.Object {
    var namespaceName: NamespaceName
    var adminUserPassword: js.UndefOr[DbPassword]
    var adminUsername: js.UndefOr[DbUser]
    var defaultIamRoleArn: js.UndefOr[String]
    var iamRoles: js.UndefOr[IamRoleArnList]
    var kmsKeyId: js.UndefOr[String]
    var logExports: js.UndefOr[LogExportList]
  }

  object UpdateNamespaceRequest {
    @inline
    def apply(
        namespaceName: NamespaceName,
        adminUserPassword: js.UndefOr[DbPassword] = js.undefined,
        adminUsername: js.UndefOr[DbUser] = js.undefined,
        defaultIamRoleArn: js.UndefOr[String] = js.undefined,
        iamRoles: js.UndefOr[IamRoleArnList] = js.undefined,
        kmsKeyId: js.UndefOr[String] = js.undefined,
        logExports: js.UndefOr[LogExportList] = js.undefined
    ): UpdateNamespaceRequest = {
      val __obj = js.Dynamic.literal(
        "namespaceName" -> namespaceName.asInstanceOf[js.Any]
      )

      adminUserPassword.foreach(__v => __obj.updateDynamic("adminUserPassword")(__v.asInstanceOf[js.Any]))
      adminUsername.foreach(__v => __obj.updateDynamic("adminUsername")(__v.asInstanceOf[js.Any]))
      defaultIamRoleArn.foreach(__v => __obj.updateDynamic("defaultIamRoleArn")(__v.asInstanceOf[js.Any]))
      iamRoles.foreach(__v => __obj.updateDynamic("iamRoles")(__v.asInstanceOf[js.Any]))
      kmsKeyId.foreach(__v => __obj.updateDynamic("kmsKeyId")(__v.asInstanceOf[js.Any]))
      logExports.foreach(__v => __obj.updateDynamic("logExports")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateNamespaceRequest]
    }
  }

  @js.native
  trait UpdateNamespaceResponse extends js.Object {
    var namespace: Namespace
  }

  object UpdateNamespaceResponse {
    @inline
    def apply(
        namespace: Namespace
    ): UpdateNamespaceResponse = {
      val __obj = js.Dynamic.literal(
        "namespace" -> namespace.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateNamespaceResponse]
    }
  }

  @js.native
  trait UpdateSnapshotRequest extends js.Object {
    var snapshotName: String
    var retentionPeriod: js.UndefOr[Int]
  }

  object UpdateSnapshotRequest {
    @inline
    def apply(
        snapshotName: String,
        retentionPeriod: js.UndefOr[Int] = js.undefined
    ): UpdateSnapshotRequest = {
      val __obj = js.Dynamic.literal(
        "snapshotName" -> snapshotName.asInstanceOf[js.Any]
      )

      retentionPeriod.foreach(__v => __obj.updateDynamic("retentionPeriod")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSnapshotRequest]
    }
  }

  @js.native
  trait UpdateSnapshotResponse extends js.Object {
    var snapshot: js.UndefOr[Snapshot]
  }

  object UpdateSnapshotResponse {
    @inline
    def apply(
        snapshot: js.UndefOr[Snapshot] = js.undefined
    ): UpdateSnapshotResponse = {
      val __obj = js.Dynamic.literal()
      snapshot.foreach(__v => __obj.updateDynamic("snapshot")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSnapshotResponse]
    }
  }

  @js.native
  trait UpdateUsageLimitRequest extends js.Object {
    var usageLimitId: String
    var amount: js.UndefOr[Double]
    var breachAction: js.UndefOr[UsageLimitBreachAction]
  }

  object UpdateUsageLimitRequest {
    @inline
    def apply(
        usageLimitId: String,
        amount: js.UndefOr[Double] = js.undefined,
        breachAction: js.UndefOr[UsageLimitBreachAction] = js.undefined
    ): UpdateUsageLimitRequest = {
      val __obj = js.Dynamic.literal(
        "usageLimitId" -> usageLimitId.asInstanceOf[js.Any]
      )

      amount.foreach(__v => __obj.updateDynamic("amount")(__v.asInstanceOf[js.Any]))
      breachAction.foreach(__v => __obj.updateDynamic("breachAction")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateUsageLimitRequest]
    }
  }

  @js.native
  trait UpdateUsageLimitResponse extends js.Object {
    var usageLimit: js.UndefOr[UsageLimit]
  }

  object UpdateUsageLimitResponse {
    @inline
    def apply(
        usageLimit: js.UndefOr[UsageLimit] = js.undefined
    ): UpdateUsageLimitResponse = {
      val __obj = js.Dynamic.literal()
      usageLimit.foreach(__v => __obj.updateDynamic("usageLimit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateUsageLimitResponse]
    }
  }

  @js.native
  trait UpdateWorkgroupRequest extends js.Object {
    var workgroupName: WorkgroupName
    var baseCapacity: js.UndefOr[Int]
    var configParameters: js.UndefOr[ConfigParameterList]
    var enhancedVpcRouting: js.UndefOr[Boolean]
    var port: js.UndefOr[Int]
    var publiclyAccessible: js.UndefOr[Boolean]
    var securityGroupIds: js.UndefOr[SecurityGroupIdList]
    var subnetIds: js.UndefOr[SubnetIdList]
  }

  object UpdateWorkgroupRequest {
    @inline
    def apply(
        workgroupName: WorkgroupName,
        baseCapacity: js.UndefOr[Int] = js.undefined,
        configParameters: js.UndefOr[ConfigParameterList] = js.undefined,
        enhancedVpcRouting: js.UndefOr[Boolean] = js.undefined,
        port: js.UndefOr[Int] = js.undefined,
        publiclyAccessible: js.UndefOr[Boolean] = js.undefined,
        securityGroupIds: js.UndefOr[SecurityGroupIdList] = js.undefined,
        subnetIds: js.UndefOr[SubnetIdList] = js.undefined
    ): UpdateWorkgroupRequest = {
      val __obj = js.Dynamic.literal(
        "workgroupName" -> workgroupName.asInstanceOf[js.Any]
      )

      baseCapacity.foreach(__v => __obj.updateDynamic("baseCapacity")(__v.asInstanceOf[js.Any]))
      configParameters.foreach(__v => __obj.updateDynamic("configParameters")(__v.asInstanceOf[js.Any]))
      enhancedVpcRouting.foreach(__v => __obj.updateDynamic("enhancedVpcRouting")(__v.asInstanceOf[js.Any]))
      port.foreach(__v => __obj.updateDynamic("port")(__v.asInstanceOf[js.Any]))
      publiclyAccessible.foreach(__v => __obj.updateDynamic("publiclyAccessible")(__v.asInstanceOf[js.Any]))
      securityGroupIds.foreach(__v => __obj.updateDynamic("securityGroupIds")(__v.asInstanceOf[js.Any]))
      subnetIds.foreach(__v => __obj.updateDynamic("subnetIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateWorkgroupRequest]
    }
  }

  @js.native
  trait UpdateWorkgroupResponse extends js.Object {
    var workgroup: Workgroup
  }

  object UpdateWorkgroupResponse {
    @inline
    def apply(
        workgroup: Workgroup
    ): UpdateWorkgroupResponse = {
      val __obj = js.Dynamic.literal(
        "workgroup" -> workgroup.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateWorkgroupResponse]
    }
  }

  /** The usage limit object.
    */
  @js.native
  trait UsageLimit extends js.Object {
    var amount: js.UndefOr[Double]
    var breachAction: js.UndefOr[UsageLimitBreachAction]
    var period: js.UndefOr[UsageLimitPeriod]
    var resourceArn: js.UndefOr[String]
    var usageLimitArn: js.UndefOr[String]
    var usageLimitId: js.UndefOr[String]
    var usageType: js.UndefOr[UsageLimitUsageType]
  }

  object UsageLimit {
    @inline
    def apply(
        amount: js.UndefOr[Double] = js.undefined,
        breachAction: js.UndefOr[UsageLimitBreachAction] = js.undefined,
        period: js.UndefOr[UsageLimitPeriod] = js.undefined,
        resourceArn: js.UndefOr[String] = js.undefined,
        usageLimitArn: js.UndefOr[String] = js.undefined,
        usageLimitId: js.UndefOr[String] = js.undefined,
        usageType: js.UndefOr[UsageLimitUsageType] = js.undefined
    ): UsageLimit = {
      val __obj = js.Dynamic.literal()
      amount.foreach(__v => __obj.updateDynamic("amount")(__v.asInstanceOf[js.Any]))
      breachAction.foreach(__v => __obj.updateDynamic("breachAction")(__v.asInstanceOf[js.Any]))
      period.foreach(__v => __obj.updateDynamic("period")(__v.asInstanceOf[js.Any]))
      resourceArn.foreach(__v => __obj.updateDynamic("resourceArn")(__v.asInstanceOf[js.Any]))
      usageLimitArn.foreach(__v => __obj.updateDynamic("usageLimitArn")(__v.asInstanceOf[js.Any]))
      usageLimitId.foreach(__v => __obj.updateDynamic("usageLimitId")(__v.asInstanceOf[js.Any]))
      usageType.foreach(__v => __obj.updateDynamic("usageType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UsageLimit]
    }
  }

  /** The connection endpoint for connecting to Amazon Redshift Serverless through the proxy.
    */
  @js.native
  trait VpcEndpoint extends js.Object {
    var networkInterfaces: js.UndefOr[NetworkInterfaceList]
    var vpcEndpointId: js.UndefOr[String]
    var vpcId: js.UndefOr[String]
  }

  object VpcEndpoint {
    @inline
    def apply(
        networkInterfaces: js.UndefOr[NetworkInterfaceList] = js.undefined,
        vpcEndpointId: js.UndefOr[String] = js.undefined,
        vpcId: js.UndefOr[String] = js.undefined
    ): VpcEndpoint = {
      val __obj = js.Dynamic.literal()
      networkInterfaces.foreach(__v => __obj.updateDynamic("networkInterfaces")(__v.asInstanceOf[js.Any]))
      vpcEndpointId.foreach(__v => __obj.updateDynamic("vpcEndpointId")(__v.asInstanceOf[js.Any]))
      vpcId.foreach(__v => __obj.updateDynamic("vpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VpcEndpoint]
    }
  }

  /** Describes the members of a VPC security group.
    */
  @js.native
  trait VpcSecurityGroupMembership extends js.Object {
    var status: js.UndefOr[String]
    var vpcSecurityGroupId: js.UndefOr[VpcSecurityGroupId]
  }

  object VpcSecurityGroupMembership {
    @inline
    def apply(
        status: js.UndefOr[String] = js.undefined,
        vpcSecurityGroupId: js.UndefOr[VpcSecurityGroupId] = js.undefined
    ): VpcSecurityGroupMembership = {
      val __obj = js.Dynamic.literal()
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      vpcSecurityGroupId.foreach(__v => __obj.updateDynamic("vpcSecurityGroupId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VpcSecurityGroupMembership]
    }
  }

  /** The collection of computing resources from which an endpoint is created.
    */
  @js.native
  trait Workgroup extends js.Object {
    var baseCapacity: js.UndefOr[Int]
    var configParameters: js.UndefOr[ConfigParameterList]
    var creationDate: js.UndefOr[SyntheticTimestamp_date_time]
    var endpoint: js.UndefOr[Endpoint]
    var enhancedVpcRouting: js.UndefOr[Boolean]
    var namespaceName: js.UndefOr[String]
    var port: js.UndefOr[Int]
    var publiclyAccessible: js.UndefOr[Boolean]
    var securityGroupIds: js.UndefOr[SecurityGroupIdList]
    var status: js.UndefOr[WorkgroupStatus]
    var subnetIds: js.UndefOr[SubnetIdList]
    var workgroupArn: js.UndefOr[String]
    var workgroupId: js.UndefOr[String]
    var workgroupName: js.UndefOr[WorkgroupName]
  }

  object Workgroup {
    @inline
    def apply(
        baseCapacity: js.UndefOr[Int] = js.undefined,
        configParameters: js.UndefOr[ConfigParameterList] = js.undefined,
        creationDate: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined,
        endpoint: js.UndefOr[Endpoint] = js.undefined,
        enhancedVpcRouting: js.UndefOr[Boolean] = js.undefined,
        namespaceName: js.UndefOr[String] = js.undefined,
        port: js.UndefOr[Int] = js.undefined,
        publiclyAccessible: js.UndefOr[Boolean] = js.undefined,
        securityGroupIds: js.UndefOr[SecurityGroupIdList] = js.undefined,
        status: js.UndefOr[WorkgroupStatus] = js.undefined,
        subnetIds: js.UndefOr[SubnetIdList] = js.undefined,
        workgroupArn: js.UndefOr[String] = js.undefined,
        workgroupId: js.UndefOr[String] = js.undefined,
        workgroupName: js.UndefOr[WorkgroupName] = js.undefined
    ): Workgroup = {
      val __obj = js.Dynamic.literal()
      baseCapacity.foreach(__v => __obj.updateDynamic("baseCapacity")(__v.asInstanceOf[js.Any]))
      configParameters.foreach(__v => __obj.updateDynamic("configParameters")(__v.asInstanceOf[js.Any]))
      creationDate.foreach(__v => __obj.updateDynamic("creationDate")(__v.asInstanceOf[js.Any]))
      endpoint.foreach(__v => __obj.updateDynamic("endpoint")(__v.asInstanceOf[js.Any]))
      enhancedVpcRouting.foreach(__v => __obj.updateDynamic("enhancedVpcRouting")(__v.asInstanceOf[js.Any]))
      namespaceName.foreach(__v => __obj.updateDynamic("namespaceName")(__v.asInstanceOf[js.Any]))
      port.foreach(__v => __obj.updateDynamic("port")(__v.asInstanceOf[js.Any]))
      publiclyAccessible.foreach(__v => __obj.updateDynamic("publiclyAccessible")(__v.asInstanceOf[js.Any]))
      securityGroupIds.foreach(__v => __obj.updateDynamic("securityGroupIds")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      subnetIds.foreach(__v => __obj.updateDynamic("subnetIds")(__v.asInstanceOf[js.Any]))
      workgroupArn.foreach(__v => __obj.updateDynamic("workgroupArn")(__v.asInstanceOf[js.Any]))
      workgroupId.foreach(__v => __obj.updateDynamic("workgroupId")(__v.asInstanceOf[js.Any]))
      workgroupName.foreach(__v => __obj.updateDynamic("workgroupName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Workgroup]
    }
  }
}
