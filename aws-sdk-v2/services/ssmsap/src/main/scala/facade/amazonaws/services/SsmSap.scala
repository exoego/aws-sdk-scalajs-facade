package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object ssmsap {
  type AppRegistryArn = String
  type ApplicationCredentialList = js.Array[ApplicationCredential]
  type ApplicationId = String
  type ApplicationSummaryList = js.Array[ApplicationSummary]
  type Arn = String
  type ComponentId = String
  type ComponentIdList = js.Array[ComponentId]
  type ComponentSummaryList = js.Array[ComponentSummary]
  type DatabaseId = String
  type DatabaseIdList = js.Array[DatabaseId]
  type DatabaseName = String
  type DatabaseSummaryList = js.Array[DatabaseSummary]
  type HostList = js.Array[Host]
  type InstanceId = String
  type InstanceList = js.Array[InstanceId]
  type MaxResults = Int
  type NextToken = String
  type OperationId = String
  type OperationIdList = js.Array[OperationId]
  type OperationProperties = js.Dictionary[String]
  type OperationType = String
  type ResourceId = String
  type ResourceType = String
  type SAPInstanceNumber = String
  type SID = String
  type SecretId = String
  type SsmSapArn = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagMap = js.Dictionary[TagValue]
  type TagValue = String
  type Timestamp = js.Date

  final class SsmSapOps(private val service: SsmSap) extends AnyVal {

    @inline def deleteResourcePermissionFuture(params: DeleteResourcePermissionInput): Future[DeleteResourcePermissionOutput] = service.deleteResourcePermission(params).promise().toFuture
    @inline def deregisterApplicationFuture(params: DeregisterApplicationInput): Future[DeregisterApplicationOutput] = service.deregisterApplication(params).promise().toFuture
    @inline def getApplicationFuture(params: GetApplicationInput): Future[GetApplicationOutput] = service.getApplication(params).promise().toFuture
    @inline def getComponentFuture(params: GetComponentInput): Future[GetComponentOutput] = service.getComponent(params).promise().toFuture
    @inline def getDatabaseFuture(params: GetDatabaseInput): Future[GetDatabaseOutput] = service.getDatabase(params).promise().toFuture
    @inline def getOperationFuture(params: GetOperationInput): Future[GetOperationOutput] = service.getOperation(params).promise().toFuture
    @inline def getResourcePermissionFuture(params: GetResourcePermissionInput): Future[GetResourcePermissionOutput] = service.getResourcePermission(params).promise().toFuture
    @inline def listApplicationsFuture(params: ListApplicationsInput): Future[ListApplicationsOutput] = service.listApplications(params).promise().toFuture
    @inline def listComponentsFuture(params: ListComponentsInput): Future[ListComponentsOutput] = service.listComponents(params).promise().toFuture
    @inline def listDatabasesFuture(params: ListDatabasesInput): Future[ListDatabasesOutput] = service.listDatabases(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def putResourcePermissionFuture(params: PutResourcePermissionInput): Future[PutResourcePermissionOutput] = service.putResourcePermission(params).promise().toFuture
    @inline def registerApplicationFuture(params: RegisterApplicationInput): Future[RegisterApplicationOutput] = service.registerApplication(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateApplicationSettingsFuture(params: UpdateApplicationSettingsInput): Future[UpdateApplicationSettingsOutput] = service.updateApplicationSettings(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/ssmsap", JSImport.Namespace, "AWS.SsmSap")
  class SsmSap() extends js.Object {
    def this(config: AWSConfig) = this()

    def deleteResourcePermission(params: DeleteResourcePermissionInput): Request[DeleteResourcePermissionOutput] = js.native
    def deregisterApplication(params: DeregisterApplicationInput): Request[DeregisterApplicationOutput] = js.native
    def getApplication(params: GetApplicationInput): Request[GetApplicationOutput] = js.native
    def getComponent(params: GetComponentInput): Request[GetComponentOutput] = js.native
    def getDatabase(params: GetDatabaseInput): Request[GetDatabaseOutput] = js.native
    def getOperation(params: GetOperationInput): Request[GetOperationOutput] = js.native
    def getResourcePermission(params: GetResourcePermissionInput): Request[GetResourcePermissionOutput] = js.native
    def listApplications(params: ListApplicationsInput): Request[ListApplicationsOutput] = js.native
    def listComponents(params: ListComponentsInput): Request[ListComponentsOutput] = js.native
    def listDatabases(params: ListDatabasesInput): Request[ListDatabasesOutput] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def putResourcePermission(params: PutResourcePermissionInput): Request[PutResourcePermissionOutput] = js.native
    def registerApplication(params: RegisterApplicationInput): Request[RegisterApplicationOutput] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateApplicationSettings(params: UpdateApplicationSettingsInput): Request[UpdateApplicationSettingsOutput] = js.native
  }
  object SsmSap {
    @inline implicit def toOps(service: SsmSap): SsmSapOps = {
      new SsmSapOps(service)
    }
  }

  /** <p/>
    */
  @js.native
  trait Application extends js.Object {
    var AppRegistryArn: js.UndefOr[AppRegistryArn]
    var Arn: js.UndefOr[SsmSapArn]
    var Components: js.UndefOr[ComponentIdList]
    var Id: js.UndefOr[ApplicationId]
    var LastUpdated: js.UndefOr[Timestamp]
    var Status: js.UndefOr[ApplicationStatus]
    var StatusMessage: js.UndefOr[String]
    var Type: js.UndefOr[ApplicationType]
  }

  object Application {
    @inline
    def apply(
        AppRegistryArn: js.UndefOr[AppRegistryArn] = js.undefined,
        Arn: js.UndefOr[SsmSapArn] = js.undefined,
        Components: js.UndefOr[ComponentIdList] = js.undefined,
        Id: js.UndefOr[ApplicationId] = js.undefined,
        LastUpdated: js.UndefOr[Timestamp] = js.undefined,
        Status: js.UndefOr[ApplicationStatus] = js.undefined,
        StatusMessage: js.UndefOr[String] = js.undefined,
        Type: js.UndefOr[ApplicationType] = js.undefined
    ): Application = {
      val __obj = js.Dynamic.literal()
      AppRegistryArn.foreach(__v => __obj.updateDynamic("AppRegistryArn")(__v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Components.foreach(__v => __obj.updateDynamic("Components")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      LastUpdated.foreach(__v => __obj.updateDynamic("LastUpdated")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusMessage.foreach(__v => __obj.updateDynamic("StatusMessage")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Application]
    }
  }

  /** <p/>
    */
  @js.native
  trait ApplicationCredential extends js.Object {
    var CredentialType: CredentialType
    var DatabaseName: DatabaseName
    var SecretId: SecretId
  }

  object ApplicationCredential {
    @inline
    def apply(
        CredentialType: CredentialType,
        DatabaseName: DatabaseName,
        SecretId: SecretId
    ): ApplicationCredential = {
      val __obj = js.Dynamic.literal(
        "CredentialType" -> CredentialType.asInstanceOf[js.Any],
        "DatabaseName" -> DatabaseName.asInstanceOf[js.Any],
        "SecretId" -> SecretId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ApplicationCredential]
    }
  }

  /** <p/>
    */
  @js.native
  trait ApplicationSummary extends js.Object {
    var Arn: js.UndefOr[SsmSapArn]
    var Id: js.UndefOr[ApplicationId]
    var Tags: js.UndefOr[TagMap]
    var Type: js.UndefOr[ApplicationType]
  }

  object ApplicationSummary {
    @inline
    def apply(
        Arn: js.UndefOr[SsmSapArn] = js.undefined,
        Id: js.UndefOr[ApplicationId] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined,
        Type: js.UndefOr[ApplicationType] = js.undefined
    ): ApplicationSummary = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApplicationSummary]
    }
  }

  /** <p/>
    */
  @js.native
  trait Component extends js.Object {
    var ApplicationId: js.UndefOr[ApplicationId]
    var ComponentId: js.UndefOr[ComponentId]
    var ComponentType: js.UndefOr[ComponentType]
    var Databases: js.UndefOr[DatabaseIdList]
    var Hosts: js.UndefOr[HostList]
    var LastUpdated: js.UndefOr[Timestamp]
    var PrimaryHost: js.UndefOr[String]
    var Status: js.UndefOr[ComponentStatus]
  }

  object Component {
    @inline
    def apply(
        ApplicationId: js.UndefOr[ApplicationId] = js.undefined,
        ComponentId: js.UndefOr[ComponentId] = js.undefined,
        ComponentType: js.UndefOr[ComponentType] = js.undefined,
        Databases: js.UndefOr[DatabaseIdList] = js.undefined,
        Hosts: js.UndefOr[HostList] = js.undefined,
        LastUpdated: js.UndefOr[Timestamp] = js.undefined,
        PrimaryHost: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[ComponentStatus] = js.undefined
    ): Component = {
      val __obj = js.Dynamic.literal()
      ApplicationId.foreach(__v => __obj.updateDynamic("ApplicationId")(__v.asInstanceOf[js.Any]))
      ComponentId.foreach(__v => __obj.updateDynamic("ComponentId")(__v.asInstanceOf[js.Any]))
      ComponentType.foreach(__v => __obj.updateDynamic("ComponentType")(__v.asInstanceOf[js.Any]))
      Databases.foreach(__v => __obj.updateDynamic("Databases")(__v.asInstanceOf[js.Any]))
      Hosts.foreach(__v => __obj.updateDynamic("Hosts")(__v.asInstanceOf[js.Any]))
      LastUpdated.foreach(__v => __obj.updateDynamic("LastUpdated")(__v.asInstanceOf[js.Any]))
      PrimaryHost.foreach(__v => __obj.updateDynamic("PrimaryHost")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Component]
    }
  }

  /** <p/>
    */
  @js.native
  trait ComponentSummary extends js.Object {
    var ApplicationId: js.UndefOr[ApplicationId]
    var ComponentId: js.UndefOr[ComponentId]
    var ComponentType: js.UndefOr[ComponentType]
    var Tags: js.UndefOr[TagMap]
  }

  object ComponentSummary {
    @inline
    def apply(
        ApplicationId: js.UndefOr[ApplicationId] = js.undefined,
        ComponentId: js.UndefOr[ComponentId] = js.undefined,
        ComponentType: js.UndefOr[ComponentType] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): ComponentSummary = {
      val __obj = js.Dynamic.literal()
      ApplicationId.foreach(__v => __obj.updateDynamic("ApplicationId")(__v.asInstanceOf[js.Any]))
      ComponentId.foreach(__v => __obj.updateDynamic("ComponentId")(__v.asInstanceOf[js.Any]))
      ComponentType.foreach(__v => __obj.updateDynamic("ComponentType")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ComponentSummary]
    }
  }

  /** <p/>
    */
  @js.native
  trait Database extends js.Object {
    var ApplicationId: js.UndefOr[ApplicationId]
    var Arn: js.UndefOr[SsmSapArn]
    var ComponentId: js.UndefOr[ComponentId]
    var Credentials: js.UndefOr[ApplicationCredentialList]
    var DatabaseId: js.UndefOr[DatabaseId]
    var DatabaseName: js.UndefOr[String]
    var DatabaseType: js.UndefOr[DatabaseType]
    var LastUpdated: js.UndefOr[Timestamp]
    var PrimaryHost: js.UndefOr[String]
    var SQLPort: js.UndefOr[Int]
    var Status: js.UndefOr[DatabaseStatus]
  }

  object Database {
    @inline
    def apply(
        ApplicationId: js.UndefOr[ApplicationId] = js.undefined,
        Arn: js.UndefOr[SsmSapArn] = js.undefined,
        ComponentId: js.UndefOr[ComponentId] = js.undefined,
        Credentials: js.UndefOr[ApplicationCredentialList] = js.undefined,
        DatabaseId: js.UndefOr[DatabaseId] = js.undefined,
        DatabaseName: js.UndefOr[String] = js.undefined,
        DatabaseType: js.UndefOr[DatabaseType] = js.undefined,
        LastUpdated: js.UndefOr[Timestamp] = js.undefined,
        PrimaryHost: js.UndefOr[String] = js.undefined,
        SQLPort: js.UndefOr[Int] = js.undefined,
        Status: js.UndefOr[DatabaseStatus] = js.undefined
    ): Database = {
      val __obj = js.Dynamic.literal()
      ApplicationId.foreach(__v => __obj.updateDynamic("ApplicationId")(__v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      ComponentId.foreach(__v => __obj.updateDynamic("ComponentId")(__v.asInstanceOf[js.Any]))
      Credentials.foreach(__v => __obj.updateDynamic("Credentials")(__v.asInstanceOf[js.Any]))
      DatabaseId.foreach(__v => __obj.updateDynamic("DatabaseId")(__v.asInstanceOf[js.Any]))
      DatabaseName.foreach(__v => __obj.updateDynamic("DatabaseName")(__v.asInstanceOf[js.Any]))
      DatabaseType.foreach(__v => __obj.updateDynamic("DatabaseType")(__v.asInstanceOf[js.Any]))
      LastUpdated.foreach(__v => __obj.updateDynamic("LastUpdated")(__v.asInstanceOf[js.Any]))
      PrimaryHost.foreach(__v => __obj.updateDynamic("PrimaryHost")(__v.asInstanceOf[js.Any]))
      SQLPort.foreach(__v => __obj.updateDynamic("SQLPort")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Database]
    }
  }

  /** <p/>
    */
  @js.native
  trait DatabaseSummary extends js.Object {
    var ApplicationId: js.UndefOr[ApplicationId]
    var Arn: js.UndefOr[SsmSapArn]
    var ComponentId: js.UndefOr[ComponentId]
    var DatabaseId: js.UndefOr[DatabaseId]
    var DatabaseType: js.UndefOr[DatabaseType]
    var Tags: js.UndefOr[TagMap]
  }

  object DatabaseSummary {
    @inline
    def apply(
        ApplicationId: js.UndefOr[ApplicationId] = js.undefined,
        Arn: js.UndefOr[SsmSapArn] = js.undefined,
        ComponentId: js.UndefOr[ComponentId] = js.undefined,
        DatabaseId: js.UndefOr[DatabaseId] = js.undefined,
        DatabaseType: js.UndefOr[DatabaseType] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): DatabaseSummary = {
      val __obj = js.Dynamic.literal()
      ApplicationId.foreach(__v => __obj.updateDynamic("ApplicationId")(__v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      ComponentId.foreach(__v => __obj.updateDynamic("ComponentId")(__v.asInstanceOf[js.Any]))
      DatabaseId.foreach(__v => __obj.updateDynamic("DatabaseId")(__v.asInstanceOf[js.Any]))
      DatabaseType.foreach(__v => __obj.updateDynamic("DatabaseType")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DatabaseSummary]
    }
  }

  @js.native
  trait DeleteResourcePermissionInput extends js.Object {
    var ResourceArn: Arn
    var ActionType: js.UndefOr[PermissionActionType]
    var SourceResourceArn: js.UndefOr[Arn]
  }

  object DeleteResourcePermissionInput {
    @inline
    def apply(
        ResourceArn: Arn,
        ActionType: js.UndefOr[PermissionActionType] = js.undefined,
        SourceResourceArn: js.UndefOr[Arn] = js.undefined
    ): DeleteResourcePermissionInput = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )

      ActionType.foreach(__v => __obj.updateDynamic("ActionType")(__v.asInstanceOf[js.Any]))
      SourceResourceArn.foreach(__v => __obj.updateDynamic("SourceResourceArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteResourcePermissionInput]
    }
  }

  @js.native
  trait DeleteResourcePermissionOutput extends js.Object {
    var Policy: js.UndefOr[String]
  }

  object DeleteResourcePermissionOutput {
    @inline
    def apply(
        Policy: js.UndefOr[String] = js.undefined
    ): DeleteResourcePermissionOutput = {
      val __obj = js.Dynamic.literal()
      Policy.foreach(__v => __obj.updateDynamic("Policy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteResourcePermissionOutput]
    }
  }

  @js.native
  trait DeregisterApplicationInput extends js.Object {
    var ApplicationId: ApplicationId
  }

  object DeregisterApplicationInput {
    @inline
    def apply(
        ApplicationId: ApplicationId
    ): DeregisterApplicationInput = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeregisterApplicationInput]
    }
  }

  @js.native
  trait DeregisterApplicationOutput extends js.Object

  object DeregisterApplicationOutput {
    @inline
    def apply(): DeregisterApplicationOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeregisterApplicationOutput]
    }
  }

  @js.native
  trait GetApplicationInput extends js.Object {
    var ApplicationArn: js.UndefOr[SsmSapArn]
    var ApplicationId: js.UndefOr[ApplicationId]
  }

  object GetApplicationInput {
    @inline
    def apply(
        ApplicationArn: js.UndefOr[SsmSapArn] = js.undefined,
        ApplicationId: js.UndefOr[ApplicationId] = js.undefined
    ): GetApplicationInput = {
      val __obj = js.Dynamic.literal()
      ApplicationArn.foreach(__v => __obj.updateDynamic("ApplicationArn")(__v.asInstanceOf[js.Any]))
      ApplicationId.foreach(__v => __obj.updateDynamic("ApplicationId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetApplicationInput]
    }
  }

  @js.native
  trait GetApplicationOutput extends js.Object {
    var Application: js.UndefOr[Application]
    var Tags: js.UndefOr[TagMap]
  }

  object GetApplicationOutput {
    @inline
    def apply(
        Application: js.UndefOr[Application] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): GetApplicationOutput = {
      val __obj = js.Dynamic.literal()
      Application.foreach(__v => __obj.updateDynamic("Application")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetApplicationOutput]
    }
  }

  @js.native
  trait GetComponentInput extends js.Object {
    var ApplicationId: ApplicationId
    var ComponentId: ComponentId
  }

  object GetComponentInput {
    @inline
    def apply(
        ApplicationId: ApplicationId,
        ComponentId: ComponentId
    ): GetComponentInput = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "ComponentId" -> ComponentId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetComponentInput]
    }
  }

  @js.native
  trait GetComponentOutput extends js.Object {
    var Component: js.UndefOr[Component]
  }

  object GetComponentOutput {
    @inline
    def apply(
        Component: js.UndefOr[Component] = js.undefined
    ): GetComponentOutput = {
      val __obj = js.Dynamic.literal()
      Component.foreach(__v => __obj.updateDynamic("Component")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetComponentOutput]
    }
  }

  @js.native
  trait GetDatabaseInput extends js.Object {
    var ApplicationId: js.UndefOr[ApplicationId]
    var ComponentId: js.UndefOr[ComponentId]
    var DatabaseArn: js.UndefOr[SsmSapArn]
    var DatabaseId: js.UndefOr[DatabaseId]
  }

  object GetDatabaseInput {
    @inline
    def apply(
        ApplicationId: js.UndefOr[ApplicationId] = js.undefined,
        ComponentId: js.UndefOr[ComponentId] = js.undefined,
        DatabaseArn: js.UndefOr[SsmSapArn] = js.undefined,
        DatabaseId: js.UndefOr[DatabaseId] = js.undefined
    ): GetDatabaseInput = {
      val __obj = js.Dynamic.literal()
      ApplicationId.foreach(__v => __obj.updateDynamic("ApplicationId")(__v.asInstanceOf[js.Any]))
      ComponentId.foreach(__v => __obj.updateDynamic("ComponentId")(__v.asInstanceOf[js.Any]))
      DatabaseArn.foreach(__v => __obj.updateDynamic("DatabaseArn")(__v.asInstanceOf[js.Any]))
      DatabaseId.foreach(__v => __obj.updateDynamic("DatabaseId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDatabaseInput]
    }
  }

  @js.native
  trait GetDatabaseOutput extends js.Object {
    var Database: js.UndefOr[Database]
    var Tags: js.UndefOr[TagMap]
  }

  object GetDatabaseOutput {
    @inline
    def apply(
        Database: js.UndefOr[Database] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): GetDatabaseOutput = {
      val __obj = js.Dynamic.literal()
      Database.foreach(__v => __obj.updateDynamic("Database")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDatabaseOutput]
    }
  }

  @js.native
  trait GetOperationInput extends js.Object {
    var OperationId: OperationId
  }

  object GetOperationInput {
    @inline
    def apply(
        OperationId: OperationId
    ): GetOperationInput = {
      val __obj = js.Dynamic.literal(
        "OperationId" -> OperationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetOperationInput]
    }
  }

  @js.native
  trait GetOperationOutput extends js.Object {
    var Operation: js.UndefOr[Operation]
  }

  object GetOperationOutput {
    @inline
    def apply(
        Operation: js.UndefOr[Operation] = js.undefined
    ): GetOperationOutput = {
      val __obj = js.Dynamic.literal()
      Operation.foreach(__v => __obj.updateDynamic("Operation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetOperationOutput]
    }
  }

  @js.native
  trait GetResourcePermissionInput extends js.Object {
    var ResourceArn: Arn
    var ActionType: js.UndefOr[PermissionActionType]
  }

  object GetResourcePermissionInput {
    @inline
    def apply(
        ResourceArn: Arn,
        ActionType: js.UndefOr[PermissionActionType] = js.undefined
    ): GetResourcePermissionInput = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )

      ActionType.foreach(__v => __obj.updateDynamic("ActionType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetResourcePermissionInput]
    }
  }

  @js.native
  trait GetResourcePermissionOutput extends js.Object {
    var Policy: js.UndefOr[String]
  }

  object GetResourcePermissionOutput {
    @inline
    def apply(
        Policy: js.UndefOr[String] = js.undefined
    ): GetResourcePermissionOutput = {
      val __obj = js.Dynamic.literal()
      Policy.foreach(__v => __obj.updateDynamic("Policy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetResourcePermissionOutput]
    }
  }

  /** <p/>
    */
  @js.native
  trait Host extends js.Object {
    var HostIp: js.UndefOr[String]
    var HostName: js.UndefOr[String]
    var HostRole: js.UndefOr[HostRole]
    var InstanceId: js.UndefOr[String]
  }

  object Host {
    @inline
    def apply(
        HostIp: js.UndefOr[String] = js.undefined,
        HostName: js.UndefOr[String] = js.undefined,
        HostRole: js.UndefOr[HostRole] = js.undefined,
        InstanceId: js.UndefOr[String] = js.undefined
    ): Host = {
      val __obj = js.Dynamic.literal()
      HostIp.foreach(__v => __obj.updateDynamic("HostIp")(__v.asInstanceOf[js.Any]))
      HostName.foreach(__v => __obj.updateDynamic("HostName")(__v.asInstanceOf[js.Any]))
      HostRole.foreach(__v => __obj.updateDynamic("HostRole")(__v.asInstanceOf[js.Any]))
      InstanceId.foreach(__v => __obj.updateDynamic("InstanceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Host]
    }
  }

  @js.native
  trait ListApplicationsInput extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListApplicationsInput {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListApplicationsInput = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListApplicationsInput]
    }
  }

  @js.native
  trait ListApplicationsOutput extends js.Object {
    var Applications: js.UndefOr[ApplicationSummaryList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListApplicationsOutput {
    @inline
    def apply(
        Applications: js.UndefOr[ApplicationSummaryList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListApplicationsOutput = {
      val __obj = js.Dynamic.literal()
      Applications.foreach(__v => __obj.updateDynamic("Applications")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListApplicationsOutput]
    }
  }

  @js.native
  trait ListComponentsInput extends js.Object {
    var ApplicationId: js.UndefOr[ApplicationId]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListComponentsInput {
    @inline
    def apply(
        ApplicationId: js.UndefOr[ApplicationId] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListComponentsInput = {
      val __obj = js.Dynamic.literal()
      ApplicationId.foreach(__v => __obj.updateDynamic("ApplicationId")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListComponentsInput]
    }
  }

  @js.native
  trait ListComponentsOutput extends js.Object {
    var Components: js.UndefOr[ComponentSummaryList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListComponentsOutput {
    @inline
    def apply(
        Components: js.UndefOr[ComponentSummaryList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListComponentsOutput = {
      val __obj = js.Dynamic.literal()
      Components.foreach(__v => __obj.updateDynamic("Components")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListComponentsOutput]
    }
  }

  @js.native
  trait ListDatabasesInput extends js.Object {
    var ApplicationId: js.UndefOr[ApplicationId]
    var ComponentId: js.UndefOr[ComponentId]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDatabasesInput {
    @inline
    def apply(
        ApplicationId: js.UndefOr[ApplicationId] = js.undefined,
        ComponentId: js.UndefOr[ComponentId] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDatabasesInput = {
      val __obj = js.Dynamic.literal()
      ApplicationId.foreach(__v => __obj.updateDynamic("ApplicationId")(__v.asInstanceOf[js.Any]))
      ComponentId.foreach(__v => __obj.updateDynamic("ComponentId")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDatabasesInput]
    }
  }

  @js.native
  trait ListDatabasesOutput extends js.Object {
    var Databases: js.UndefOr[DatabaseSummaryList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDatabasesOutput {
    @inline
    def apply(
        Databases: js.UndefOr[DatabaseSummaryList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDatabasesOutput = {
      val __obj = js.Dynamic.literal()
      Databases.foreach(__v => __obj.updateDynamic("Databases")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDatabasesOutput]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: SsmSapArn
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        resourceArn: SsmSapArn
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var tags: js.UndefOr[TagMap]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        tags: js.UndefOr[TagMap] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /** <p/>
    */
  @js.native
  trait Operation extends js.Object {
    var EndTime: js.UndefOr[Timestamp]
    var Id: js.UndefOr[OperationId]
    var LastUpdatedTime: js.UndefOr[Timestamp]
    var Properties: js.UndefOr[OperationProperties]
    var ResourceArn: js.UndefOr[Arn]
    var ResourceId: js.UndefOr[ResourceId]
    var ResourceType: js.UndefOr[ResourceType]
    var StartTime: js.UndefOr[Timestamp]
    var Status: js.UndefOr[OperationStatus]
    var StatusMessage: js.UndefOr[String]
    var Type: js.UndefOr[OperationType]
  }

  object Operation {
    @inline
    def apply(
        EndTime: js.UndefOr[Timestamp] = js.undefined,
        Id: js.UndefOr[OperationId] = js.undefined,
        LastUpdatedTime: js.UndefOr[Timestamp] = js.undefined,
        Properties: js.UndefOr[OperationProperties] = js.undefined,
        ResourceArn: js.UndefOr[Arn] = js.undefined,
        ResourceId: js.UndefOr[ResourceId] = js.undefined,
        ResourceType: js.UndefOr[ResourceType] = js.undefined,
        StartTime: js.UndefOr[Timestamp] = js.undefined,
        Status: js.UndefOr[OperationStatus] = js.undefined,
        StatusMessage: js.UndefOr[String] = js.undefined,
        Type: js.UndefOr[OperationType] = js.undefined
    ): Operation = {
      val __obj = js.Dynamic.literal()
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      LastUpdatedTime.foreach(__v => __obj.updateDynamic("LastUpdatedTime")(__v.asInstanceOf[js.Any]))
      Properties.foreach(__v => __obj.updateDynamic("Properties")(__v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.updateDynamic("ResourceArn")(__v.asInstanceOf[js.Any]))
      ResourceId.foreach(__v => __obj.updateDynamic("ResourceId")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusMessage.foreach(__v => __obj.updateDynamic("StatusMessage")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Operation]
    }
  }

  @js.native
  trait PutResourcePermissionInput extends js.Object {
    var ActionType: PermissionActionType
    var ResourceArn: Arn
    var SourceResourceArn: Arn
  }

  object PutResourcePermissionInput {
    @inline
    def apply(
        ActionType: PermissionActionType,
        ResourceArn: Arn,
        SourceResourceArn: Arn
    ): PutResourcePermissionInput = {
      val __obj = js.Dynamic.literal(
        "ActionType" -> ActionType.asInstanceOf[js.Any],
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "SourceResourceArn" -> SourceResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutResourcePermissionInput]
    }
  }

  @js.native
  trait PutResourcePermissionOutput extends js.Object {
    var Policy: js.UndefOr[String]
  }

  object PutResourcePermissionOutput {
    @inline
    def apply(
        Policy: js.UndefOr[String] = js.undefined
    ): PutResourcePermissionOutput = {
      val __obj = js.Dynamic.literal()
      Policy.foreach(__v => __obj.updateDynamic("Policy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutResourcePermissionOutput]
    }
  }

  @js.native
  trait RegisterApplicationInput extends js.Object {
    var ApplicationId: ApplicationId
    var ApplicationType: ApplicationType
    var Credentials: ApplicationCredentialList
    var Instances: InstanceList
    var SapInstanceNumber: js.UndefOr[SAPInstanceNumber]
    var Sid: js.UndefOr[SID]
    var Tags: js.UndefOr[TagMap]
  }

  object RegisterApplicationInput {
    @inline
    def apply(
        ApplicationId: ApplicationId,
        ApplicationType: ApplicationType,
        Credentials: ApplicationCredentialList,
        Instances: InstanceList,
        SapInstanceNumber: js.UndefOr[SAPInstanceNumber] = js.undefined,
        Sid: js.UndefOr[SID] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): RegisterApplicationInput = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "ApplicationType" -> ApplicationType.asInstanceOf[js.Any],
        "Credentials" -> Credentials.asInstanceOf[js.Any],
        "Instances" -> Instances.asInstanceOf[js.Any]
      )

      SapInstanceNumber.foreach(__v => __obj.updateDynamic("SapInstanceNumber")(__v.asInstanceOf[js.Any]))
      Sid.foreach(__v => __obj.updateDynamic("Sid")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterApplicationInput]
    }
  }

  @js.native
  trait RegisterApplicationOutput extends js.Object {
    var Application: js.UndefOr[Application]
    var OperationId: js.UndefOr[OperationId]
  }

  object RegisterApplicationOutput {
    @inline
    def apply(
        Application: js.UndefOr[Application] = js.undefined,
        OperationId: js.UndefOr[OperationId] = js.undefined
    ): RegisterApplicationOutput = {
      val __obj = js.Dynamic.literal()
      Application.foreach(__v => __obj.updateDynamic("Application")(__v.asInstanceOf[js.Any]))
      OperationId.foreach(__v => __obj.updateDynamic("OperationId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterApplicationOutput]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: SsmSapArn
    var tags: TagMap
  }

  object TagResourceRequest {
    @inline
    def apply(
        resourceArn: SsmSapArn,
        tags: TagMap
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
    var resourceArn: SsmSapArn
    var tagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        resourceArn: SsmSapArn,
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
  trait UpdateApplicationSettingsInput extends js.Object {
    var ApplicationId: ApplicationId
    var CredentialsToAddOrUpdate: js.UndefOr[ApplicationCredentialList]
    var CredentialsToRemove: js.UndefOr[ApplicationCredentialList]
  }

  object UpdateApplicationSettingsInput {
    @inline
    def apply(
        ApplicationId: ApplicationId,
        CredentialsToAddOrUpdate: js.UndefOr[ApplicationCredentialList] = js.undefined,
        CredentialsToRemove: js.UndefOr[ApplicationCredentialList] = js.undefined
    ): UpdateApplicationSettingsInput = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      )

      CredentialsToAddOrUpdate.foreach(__v => __obj.updateDynamic("CredentialsToAddOrUpdate")(__v.asInstanceOf[js.Any]))
      CredentialsToRemove.foreach(__v => __obj.updateDynamic("CredentialsToRemove")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateApplicationSettingsInput]
    }
  }

  @js.native
  trait UpdateApplicationSettingsOutput extends js.Object {
    var Message: js.UndefOr[String]
    var OperationIds: js.UndefOr[OperationIdList]
  }

  object UpdateApplicationSettingsOutput {
    @inline
    def apply(
        Message: js.UndefOr[String] = js.undefined,
        OperationIds: js.UndefOr[OperationIdList] = js.undefined
    ): UpdateApplicationSettingsOutput = {
      val __obj = js.Dynamic.literal()
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      OperationIds.foreach(__v => __obj.updateDynamic("OperationIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateApplicationSettingsOutput]
    }
  }
}
