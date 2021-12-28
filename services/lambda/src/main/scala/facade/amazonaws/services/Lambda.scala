package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object lambda {
  type Action = String
  type AdditionalVersion = String
  type AdditionalVersionWeights = js.Dictionary[Weight]
  type Alias = String
  type AliasList = js.Array[AliasConfiguration]
  type Arn = String
  type BatchSize = Int
  type BisectBatchOnFunctionError = Boolean
  type Blob = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type BlobStream = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type CodeSigningConfigArn = String
  type CodeSigningConfigId = String
  type CodeSigningConfigList = js.Array[CodeSigningConfig]
  type CompatibleRuntimes = js.Array[Runtime]
  type Date = js.Date
  type Description = String
  type DestinationArn = String
  type Enabled = Boolean
  type Endpoint = String
  type EndpointLists = js.Array[Endpoint]
  type Endpoints = js.Dictionary[EndpointLists]
  type EnvironmentVariableName = String
  type EnvironmentVariableValue = String
  type EnvironmentVariables = js.Dictionary[EnvironmentVariableValue]
  type EventSourceMappingsList = js.Array[EventSourceMappingConfiguration]
  type EventSourceToken = String
  type FileSystemArn = String
  type FileSystemConfigList = js.Array[FileSystemConfig]
  type FunctionArn = String
  type FunctionArnList = js.Array[FunctionArn]
  type FunctionEventInvokeConfigList = js.Array[FunctionEventInvokeConfig]
  type FunctionList = js.Array[FunctionConfiguration]
  type FunctionName = String
  type FunctionResponseTypeList = js.Array[FunctionResponseType]
  type Handler = String
  type HttpStatus = Int
  type KMSKeyArn = String
  type LastUpdateStatusReason = String
  type LayerArn = String
  type LayerList = js.Array[LayerVersionArn]
  type LayerName = String
  type LayerPermissionAllowedAction = String
  type LayerPermissionAllowedPrincipal = String
  type LayerVersionArn = String
  type LayerVersionNumber = Double
  type LayerVersionsList = js.Array[LayerVersionsListItem]
  type LayersList = js.Array[LayersListItem]
  type LayersReferenceList = js.Array[Layer]
  type LicenseInfo = String
  type LocalMountPath = String
  type MasterRegion = String
  type MaxFunctionEventInvokeConfigListItems = Int
  type MaxLayerListItems = Int
  type MaxListItems = Int
  type MaxProvisionedConcurrencyConfigListItems = Int
  type MaximumBatchingWindowInSeconds = Int
  type MaximumEventAgeInSeconds = Int
  type MaximumRecordAgeInSeconds = Int
  type MaximumRetryAttempts = Int
  type MaximumRetryAttemptsEventSourceMapping = Int
  type MemorySize = Int
  type NameSpacedFunctionArn = String
  type NamespacedFunctionName = String
  type NamespacedStatementId = String
  type NonNegativeInteger = Int
  type OrganizationId = String
  type ParallelizationFactor = Int
  type PositiveInteger = Int
  type Principal = String
  type ProvisionedConcurrencyConfigList = js.Array[ProvisionedConcurrencyConfigListItem]
  type Qualifier = String
  type Queue = String
  type Queues = js.Array[Queue]
  type ReservedConcurrentExecutions = Int
  type ResourceArn = String
  type RoleArn = String
  type S3Bucket = String
  type S3Key = String
  type S3ObjectVersion = String
  type SecurityGroupId = String
  type SecurityGroupIds = js.Array[SecurityGroupId]
  type SensitiveString = String
  type SigningProfileVersionArns = js.Array[Arn]
  type SourceAccessConfigurations = js.Array[SourceAccessConfiguration]
  type SourceOwner = String
  type StateReason = String
  type StatementId = String
  type StringList = js.Array[String]
  type SubnetId = String
  type SubnetIds = js.Array[SubnetId]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagValue = String
  type Tags = js.Dictionary[TagValue]
  type Timeout = Int
  type Timestamp = String
  type Topic = String
  type Topics = js.Array[Topic]
  type TumblingWindowInSeconds = Int
  type URI = String
  type UnreservedConcurrentExecutions = Int
  type Version = String
  type VpcId = String
  type Weight = Double
  type WorkingDirectory = String

  final class LambdaOps(private val service: Lambda) extends AnyVal {

    @inline def addLayerVersionPermissionFuture(params: AddLayerVersionPermissionRequest): Future[AddLayerVersionPermissionResponse] = service.addLayerVersionPermission(params).promise().toFuture
    @inline def addPermissionFuture(params: AddPermissionRequest): Future[AddPermissionResponse] = service.addPermission(params).promise().toFuture
    @inline def createAliasFuture(params: CreateAliasRequest): Future[AliasConfiguration] = service.createAlias(params).promise().toFuture
    @inline def createCodeSigningConfigFuture(params: CreateCodeSigningConfigRequest): Future[CreateCodeSigningConfigResponse] = service.createCodeSigningConfig(params).promise().toFuture
    @inline def createEventSourceMappingFuture(params: CreateEventSourceMappingRequest): Future[EventSourceMappingConfiguration] = service.createEventSourceMapping(params).promise().toFuture
    @inline def createFunctionFuture(params: CreateFunctionRequest): Future[FunctionConfiguration] = service.createFunction(params).promise().toFuture
    @inline def deleteAliasFuture(params: DeleteAliasRequest): Future[js.Object] = service.deleteAlias(params).promise().toFuture
    @inline def deleteCodeSigningConfigFuture(params: DeleteCodeSigningConfigRequest): Future[DeleteCodeSigningConfigResponse] = service.deleteCodeSigningConfig(params).promise().toFuture
    @inline def deleteEventSourceMappingFuture(params: DeleteEventSourceMappingRequest): Future[EventSourceMappingConfiguration] = service.deleteEventSourceMapping(params).promise().toFuture
    @inline def deleteFunctionCodeSigningConfigFuture(params: DeleteFunctionCodeSigningConfigRequest): Future[js.Object] = service.deleteFunctionCodeSigningConfig(params).promise().toFuture
    @inline def deleteFunctionConcurrencyFuture(params: DeleteFunctionConcurrencyRequest): Future[js.Object] = service.deleteFunctionConcurrency(params).promise().toFuture
    @inline def deleteFunctionEventInvokeConfigFuture(params: DeleteFunctionEventInvokeConfigRequest): Future[js.Object] = service.deleteFunctionEventInvokeConfig(params).promise().toFuture
    @inline def deleteFunctionFuture(params: DeleteFunctionRequest): Future[js.Object] = service.deleteFunction(params).promise().toFuture
    @inline def deleteLayerVersionFuture(params: DeleteLayerVersionRequest): Future[js.Object] = service.deleteLayerVersion(params).promise().toFuture
    @inline def deleteProvisionedConcurrencyConfigFuture(params: DeleteProvisionedConcurrencyConfigRequest): Future[js.Object] = service.deleteProvisionedConcurrencyConfig(params).promise().toFuture
    @inline def getAccountSettingsFuture(params: GetAccountSettingsRequest): Future[GetAccountSettingsResponse] = service.getAccountSettings(params).promise().toFuture
    @inline def getAliasFuture(params: GetAliasRequest): Future[AliasConfiguration] = service.getAlias(params).promise().toFuture
    @inline def getCodeSigningConfigFuture(params: GetCodeSigningConfigRequest): Future[GetCodeSigningConfigResponse] = service.getCodeSigningConfig(params).promise().toFuture
    @inline def getEventSourceMappingFuture(params: GetEventSourceMappingRequest): Future[EventSourceMappingConfiguration] = service.getEventSourceMapping(params).promise().toFuture
    @inline def getFunctionCodeSigningConfigFuture(params: GetFunctionCodeSigningConfigRequest): Future[GetFunctionCodeSigningConfigResponse] = service.getFunctionCodeSigningConfig(params).promise().toFuture
    @inline def getFunctionConcurrencyFuture(params: GetFunctionConcurrencyRequest): Future[GetFunctionConcurrencyResponse] = service.getFunctionConcurrency(params).promise().toFuture
    @inline def getFunctionConfigurationFuture(params: GetFunctionConfigurationRequest): Future[FunctionConfiguration] = service.getFunctionConfiguration(params).promise().toFuture
    @inline def getFunctionEventInvokeConfigFuture(params: GetFunctionEventInvokeConfigRequest): Future[FunctionEventInvokeConfig] = service.getFunctionEventInvokeConfig(params).promise().toFuture
    @inline def getFunctionFuture(params: GetFunctionRequest): Future[GetFunctionResponse] = service.getFunction(params).promise().toFuture
    @inline def getLayerVersionByArnFuture(params: GetLayerVersionByArnRequest): Future[GetLayerVersionResponse] = service.getLayerVersionByArn(params).promise().toFuture
    @inline def getLayerVersionFuture(params: GetLayerVersionRequest): Future[GetLayerVersionResponse] = service.getLayerVersion(params).promise().toFuture
    @inline def getLayerVersionPolicyFuture(params: GetLayerVersionPolicyRequest): Future[GetLayerVersionPolicyResponse] = service.getLayerVersionPolicy(params).promise().toFuture
    @inline def getPolicyFuture(params: GetPolicyRequest): Future[GetPolicyResponse] = service.getPolicy(params).promise().toFuture
    @inline def getProvisionedConcurrencyConfigFuture(params: GetProvisionedConcurrencyConfigRequest): Future[GetProvisionedConcurrencyConfigResponse] = service.getProvisionedConcurrencyConfig(params).promise().toFuture
    @inline def invokeFuture(params: InvocationRequest): Future[InvocationResponse] = service.invoke(params).promise().toFuture
    @inline def listAliasesFuture(params: ListAliasesRequest): Future[ListAliasesResponse] = service.listAliases(params).promise().toFuture
    @inline def listCodeSigningConfigsFuture(params: ListCodeSigningConfigsRequest): Future[ListCodeSigningConfigsResponse] = service.listCodeSigningConfigs(params).promise().toFuture
    @inline def listEventSourceMappingsFuture(params: ListEventSourceMappingsRequest): Future[ListEventSourceMappingsResponse] = service.listEventSourceMappings(params).promise().toFuture
    @inline def listFunctionEventInvokeConfigsFuture(params: ListFunctionEventInvokeConfigsRequest): Future[ListFunctionEventInvokeConfigsResponse] = service.listFunctionEventInvokeConfigs(params).promise().toFuture
    @inline def listFunctionsByCodeSigningConfigFuture(params: ListFunctionsByCodeSigningConfigRequest): Future[ListFunctionsByCodeSigningConfigResponse] = service.listFunctionsByCodeSigningConfig(params).promise().toFuture
    @inline def listFunctionsFuture(params: ListFunctionsRequest): Future[ListFunctionsResponse] = service.listFunctions(params).promise().toFuture
    @inline def listLayerVersionsFuture(params: ListLayerVersionsRequest): Future[ListLayerVersionsResponse] = service.listLayerVersions(params).promise().toFuture
    @inline def listLayersFuture(params: ListLayersRequest): Future[ListLayersResponse] = service.listLayers(params).promise().toFuture
    @inline def listProvisionedConcurrencyConfigsFuture(params: ListProvisionedConcurrencyConfigsRequest): Future[ListProvisionedConcurrencyConfigsResponse] = service.listProvisionedConcurrencyConfigs(params).promise().toFuture
    @inline def listTagsFuture(params: ListTagsRequest): Future[ListTagsResponse] = service.listTags(params).promise().toFuture
    @inline def listVersionsByFunctionFuture(params: ListVersionsByFunctionRequest): Future[ListVersionsByFunctionResponse] = service.listVersionsByFunction(params).promise().toFuture
    @inline def publishLayerVersionFuture(params: PublishLayerVersionRequest): Future[PublishLayerVersionResponse] = service.publishLayerVersion(params).promise().toFuture
    @inline def publishVersionFuture(params: PublishVersionRequest): Future[FunctionConfiguration] = service.publishVersion(params).promise().toFuture
    @inline def putFunctionCodeSigningConfigFuture(params: PutFunctionCodeSigningConfigRequest): Future[PutFunctionCodeSigningConfigResponse] = service.putFunctionCodeSigningConfig(params).promise().toFuture
    @inline def putFunctionConcurrencyFuture(params: PutFunctionConcurrencyRequest): Future[Concurrency] = service.putFunctionConcurrency(params).promise().toFuture
    @inline def putFunctionEventInvokeConfigFuture(params: PutFunctionEventInvokeConfigRequest): Future[FunctionEventInvokeConfig] = service.putFunctionEventInvokeConfig(params).promise().toFuture
    @inline def putProvisionedConcurrencyConfigFuture(params: PutProvisionedConcurrencyConfigRequest): Future[PutProvisionedConcurrencyConfigResponse] = service.putProvisionedConcurrencyConfig(params).promise().toFuture
    @inline def removeLayerVersionPermissionFuture(params: RemoveLayerVersionPermissionRequest): Future[js.Object] = service.removeLayerVersionPermission(params).promise().toFuture
    @inline def removePermissionFuture(params: RemovePermissionRequest): Future[js.Object] = service.removePermission(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[js.Object] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[js.Object] = service.untagResource(params).promise().toFuture
    @inline def updateAliasFuture(params: UpdateAliasRequest): Future[AliasConfiguration] = service.updateAlias(params).promise().toFuture
    @inline def updateCodeSigningConfigFuture(params: UpdateCodeSigningConfigRequest): Future[UpdateCodeSigningConfigResponse] = service.updateCodeSigningConfig(params).promise().toFuture
    @inline def updateEventSourceMappingFuture(params: UpdateEventSourceMappingRequest): Future[EventSourceMappingConfiguration] = service.updateEventSourceMapping(params).promise().toFuture
    @inline def updateFunctionCodeFuture(params: UpdateFunctionCodeRequest): Future[FunctionConfiguration] = service.updateFunctionCode(params).promise().toFuture
    @inline def updateFunctionConfigurationFuture(params: UpdateFunctionConfigurationRequest): Future[FunctionConfiguration] = service.updateFunctionConfiguration(params).promise().toFuture
    @inline def updateFunctionEventInvokeConfigFuture(params: UpdateFunctionEventInvokeConfigRequest): Future[FunctionEventInvokeConfig] = service.updateFunctionEventInvokeConfig(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/lambda", JSImport.Namespace, "AWS.Lambda")
  class Lambda() extends js.Object {
    def this(config: AWSConfig) = this()

    @deprecated("Deprecated in AWS SDK", "forever") def invokeAsync(params: InvokeAsyncRequest): Request[InvokeAsyncResponse] = js.native
    def addLayerVersionPermission(params: AddLayerVersionPermissionRequest): Request[AddLayerVersionPermissionResponse] = js.native
    def addPermission(params: AddPermissionRequest): Request[AddPermissionResponse] = js.native
    def createAlias(params: CreateAliasRequest): Request[AliasConfiguration] = js.native
    def createCodeSigningConfig(params: CreateCodeSigningConfigRequest): Request[CreateCodeSigningConfigResponse] = js.native
    def createEventSourceMapping(params: CreateEventSourceMappingRequest): Request[EventSourceMappingConfiguration] = js.native
    def createFunction(params: CreateFunctionRequest): Request[FunctionConfiguration] = js.native
    def deleteAlias(params: DeleteAliasRequest): Request[js.Object] = js.native
    def deleteCodeSigningConfig(params: DeleteCodeSigningConfigRequest): Request[DeleteCodeSigningConfigResponse] = js.native
    def deleteEventSourceMapping(params: DeleteEventSourceMappingRequest): Request[EventSourceMappingConfiguration] = js.native
    def deleteFunction(params: DeleteFunctionRequest): Request[js.Object] = js.native
    def deleteFunctionCodeSigningConfig(params: DeleteFunctionCodeSigningConfigRequest): Request[js.Object] = js.native
    def deleteFunctionConcurrency(params: DeleteFunctionConcurrencyRequest): Request[js.Object] = js.native
    def deleteFunctionEventInvokeConfig(params: DeleteFunctionEventInvokeConfigRequest): Request[js.Object] = js.native
    def deleteLayerVersion(params: DeleteLayerVersionRequest): Request[js.Object] = js.native
    def deleteProvisionedConcurrencyConfig(params: DeleteProvisionedConcurrencyConfigRequest): Request[js.Object] = js.native
    def getAccountSettings(params: GetAccountSettingsRequest): Request[GetAccountSettingsResponse] = js.native
    def getAlias(params: GetAliasRequest): Request[AliasConfiguration] = js.native
    def getCodeSigningConfig(params: GetCodeSigningConfigRequest): Request[GetCodeSigningConfigResponse] = js.native
    def getEventSourceMapping(params: GetEventSourceMappingRequest): Request[EventSourceMappingConfiguration] = js.native
    def getFunction(params: GetFunctionRequest): Request[GetFunctionResponse] = js.native
    def getFunctionCodeSigningConfig(params: GetFunctionCodeSigningConfigRequest): Request[GetFunctionCodeSigningConfigResponse] = js.native
    def getFunctionConcurrency(params: GetFunctionConcurrencyRequest): Request[GetFunctionConcurrencyResponse] = js.native
    def getFunctionConfiguration(params: GetFunctionConfigurationRequest): Request[FunctionConfiguration] = js.native
    def getFunctionEventInvokeConfig(params: GetFunctionEventInvokeConfigRequest): Request[FunctionEventInvokeConfig] = js.native
    def getLayerVersion(params: GetLayerVersionRequest): Request[GetLayerVersionResponse] = js.native
    def getLayerVersionByArn(params: GetLayerVersionByArnRequest): Request[GetLayerVersionResponse] = js.native
    def getLayerVersionPolicy(params: GetLayerVersionPolicyRequest): Request[GetLayerVersionPolicyResponse] = js.native
    def getPolicy(params: GetPolicyRequest): Request[GetPolicyResponse] = js.native
    def getProvisionedConcurrencyConfig(params: GetProvisionedConcurrencyConfigRequest): Request[GetProvisionedConcurrencyConfigResponse] = js.native
    def invoke(params: InvocationRequest): Request[InvocationResponse] = js.native
    def listAliases(params: ListAliasesRequest): Request[ListAliasesResponse] = js.native
    def listCodeSigningConfigs(params: ListCodeSigningConfigsRequest): Request[ListCodeSigningConfigsResponse] = js.native
    def listEventSourceMappings(params: ListEventSourceMappingsRequest): Request[ListEventSourceMappingsResponse] = js.native
    def listFunctionEventInvokeConfigs(params: ListFunctionEventInvokeConfigsRequest): Request[ListFunctionEventInvokeConfigsResponse] = js.native
    def listFunctions(params: ListFunctionsRequest): Request[ListFunctionsResponse] = js.native
    def listFunctionsByCodeSigningConfig(params: ListFunctionsByCodeSigningConfigRequest): Request[ListFunctionsByCodeSigningConfigResponse] = js.native
    def listLayerVersions(params: ListLayerVersionsRequest): Request[ListLayerVersionsResponse] = js.native
    def listLayers(params: ListLayersRequest): Request[ListLayersResponse] = js.native
    def listProvisionedConcurrencyConfigs(params: ListProvisionedConcurrencyConfigsRequest): Request[ListProvisionedConcurrencyConfigsResponse] = js.native
    def listTags(params: ListTagsRequest): Request[ListTagsResponse] = js.native
    def listVersionsByFunction(params: ListVersionsByFunctionRequest): Request[ListVersionsByFunctionResponse] = js.native
    def publishLayerVersion(params: PublishLayerVersionRequest): Request[PublishLayerVersionResponse] = js.native
    def publishVersion(params: PublishVersionRequest): Request[FunctionConfiguration] = js.native
    def putFunctionCodeSigningConfig(params: PutFunctionCodeSigningConfigRequest): Request[PutFunctionCodeSigningConfigResponse] = js.native
    def putFunctionConcurrency(params: PutFunctionConcurrencyRequest): Request[Concurrency] = js.native
    def putFunctionEventInvokeConfig(params: PutFunctionEventInvokeConfigRequest): Request[FunctionEventInvokeConfig] = js.native
    def putProvisionedConcurrencyConfig(params: PutProvisionedConcurrencyConfigRequest): Request[PutProvisionedConcurrencyConfigResponse] = js.native
    def removeLayerVersionPermission(params: RemoveLayerVersionPermissionRequest): Request[js.Object] = js.native
    def removePermission(params: RemovePermissionRequest): Request[js.Object] = js.native
    def tagResource(params: TagResourceRequest): Request[js.Object] = js.native
    def untagResource(params: UntagResourceRequest): Request[js.Object] = js.native
    def updateAlias(params: UpdateAliasRequest): Request[AliasConfiguration] = js.native
    def updateCodeSigningConfig(params: UpdateCodeSigningConfigRequest): Request[UpdateCodeSigningConfigResponse] = js.native
    def updateEventSourceMapping(params: UpdateEventSourceMappingRequest): Request[EventSourceMappingConfiguration] = js.native
    def updateFunctionCode(params: UpdateFunctionCodeRequest): Request[FunctionConfiguration] = js.native
    def updateFunctionConfiguration(params: UpdateFunctionConfigurationRequest): Request[FunctionConfiguration] = js.native
    def updateFunctionEventInvokeConfig(params: UpdateFunctionEventInvokeConfigRequest): Request[FunctionEventInvokeConfig] = js.native
  }
  object Lambda {
    @inline implicit def toOps(service: Lambda): LambdaOps = {
      new LambdaOps(service)
    }
  }

  /** Limits that are related to concurrency and storage. All file and storage sizes are in bytes.
    */
  @js.native
  trait AccountLimit extends js.Object {
    var CodeSizeUnzipped: js.UndefOr[Double]
    var CodeSizeZipped: js.UndefOr[Double]
    var ConcurrentExecutions: js.UndefOr[Int]
    var TotalCodeSize: js.UndefOr[Double]
    var UnreservedConcurrentExecutions: js.UndefOr[UnreservedConcurrentExecutions]
  }

  object AccountLimit {
    @inline
    def apply(
        CodeSizeUnzipped: js.UndefOr[Double] = js.undefined,
        CodeSizeZipped: js.UndefOr[Double] = js.undefined,
        ConcurrentExecutions: js.UndefOr[Int] = js.undefined,
        TotalCodeSize: js.UndefOr[Double] = js.undefined,
        UnreservedConcurrentExecutions: js.UndefOr[UnreservedConcurrentExecutions] = js.undefined
    ): AccountLimit = {
      val __obj = js.Dynamic.literal()
      CodeSizeUnzipped.foreach(__v => __obj.updateDynamic("CodeSizeUnzipped")(__v.asInstanceOf[js.Any]))
      CodeSizeZipped.foreach(__v => __obj.updateDynamic("CodeSizeZipped")(__v.asInstanceOf[js.Any]))
      ConcurrentExecutions.foreach(__v => __obj.updateDynamic("ConcurrentExecutions")(__v.asInstanceOf[js.Any]))
      TotalCodeSize.foreach(__v => __obj.updateDynamic("TotalCodeSize")(__v.asInstanceOf[js.Any]))
      UnreservedConcurrentExecutions.foreach(__v => __obj.updateDynamic("UnreservedConcurrentExecutions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccountLimit]
    }
  }

  /** The number of functions and amount of storage in use.
    */
  @js.native
  trait AccountUsage extends js.Object {
    var FunctionCount: js.UndefOr[Double]
    var TotalCodeSize: js.UndefOr[Double]
  }

  object AccountUsage {
    @inline
    def apply(
        FunctionCount: js.UndefOr[Double] = js.undefined,
        TotalCodeSize: js.UndefOr[Double] = js.undefined
    ): AccountUsage = {
      val __obj = js.Dynamic.literal()
      FunctionCount.foreach(__v => __obj.updateDynamic("FunctionCount")(__v.asInstanceOf[js.Any]))
      TotalCodeSize.foreach(__v => __obj.updateDynamic("TotalCodeSize")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccountUsage]
    }
  }

  @js.native
  trait AddLayerVersionPermissionRequest extends js.Object {
    var Action: LayerPermissionAllowedAction
    var LayerName: LayerName
    var Principal: LayerPermissionAllowedPrincipal
    var StatementId: StatementId
    var VersionNumber: LayerVersionNumber
    var OrganizationId: js.UndefOr[OrganizationId]
    var RevisionId: js.UndefOr[String]
  }

  object AddLayerVersionPermissionRequest {
    @inline
    def apply(
        Action: LayerPermissionAllowedAction,
        LayerName: LayerName,
        Principal: LayerPermissionAllowedPrincipal,
        StatementId: StatementId,
        VersionNumber: LayerVersionNumber,
        OrganizationId: js.UndefOr[OrganizationId] = js.undefined,
        RevisionId: js.UndefOr[String] = js.undefined
    ): AddLayerVersionPermissionRequest = {
      val __obj = js.Dynamic.literal(
        "Action" -> Action.asInstanceOf[js.Any],
        "LayerName" -> LayerName.asInstanceOf[js.Any],
        "Principal" -> Principal.asInstanceOf[js.Any],
        "StatementId" -> StatementId.asInstanceOf[js.Any],
        "VersionNumber" -> VersionNumber.asInstanceOf[js.Any]
      )

      OrganizationId.foreach(__v => __obj.updateDynamic("OrganizationId")(__v.asInstanceOf[js.Any]))
      RevisionId.foreach(__v => __obj.updateDynamic("RevisionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AddLayerVersionPermissionRequest]
    }
  }

  @js.native
  trait AddLayerVersionPermissionResponse extends js.Object {
    var RevisionId: js.UndefOr[String]
    var Statement: js.UndefOr[String]
  }

  object AddLayerVersionPermissionResponse {
    @inline
    def apply(
        RevisionId: js.UndefOr[String] = js.undefined,
        Statement: js.UndefOr[String] = js.undefined
    ): AddLayerVersionPermissionResponse = {
      val __obj = js.Dynamic.literal()
      RevisionId.foreach(__v => __obj.updateDynamic("RevisionId")(__v.asInstanceOf[js.Any]))
      Statement.foreach(__v => __obj.updateDynamic("Statement")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AddLayerVersionPermissionResponse]
    }
  }

  @js.native
  trait AddPermissionRequest extends js.Object {
    var Action: Action
    var FunctionName: FunctionName
    var Principal: Principal
    var StatementId: StatementId
    var EventSourceToken: js.UndefOr[EventSourceToken]
    var Qualifier: js.UndefOr[Qualifier]
    var RevisionId: js.UndefOr[String]
    var SourceAccount: js.UndefOr[SourceOwner]
    var SourceArn: js.UndefOr[Arn]
  }

  object AddPermissionRequest {
    @inline
    def apply(
        Action: Action,
        FunctionName: FunctionName,
        Principal: Principal,
        StatementId: StatementId,
        EventSourceToken: js.UndefOr[EventSourceToken] = js.undefined,
        Qualifier: js.UndefOr[Qualifier] = js.undefined,
        RevisionId: js.UndefOr[String] = js.undefined,
        SourceAccount: js.UndefOr[SourceOwner] = js.undefined,
        SourceArn: js.UndefOr[Arn] = js.undefined
    ): AddPermissionRequest = {
      val __obj = js.Dynamic.literal(
        "Action" -> Action.asInstanceOf[js.Any],
        "FunctionName" -> FunctionName.asInstanceOf[js.Any],
        "Principal" -> Principal.asInstanceOf[js.Any],
        "StatementId" -> StatementId.asInstanceOf[js.Any]
      )

      EventSourceToken.foreach(__v => __obj.updateDynamic("EventSourceToken")(__v.asInstanceOf[js.Any]))
      Qualifier.foreach(__v => __obj.updateDynamic("Qualifier")(__v.asInstanceOf[js.Any]))
      RevisionId.foreach(__v => __obj.updateDynamic("RevisionId")(__v.asInstanceOf[js.Any]))
      SourceAccount.foreach(__v => __obj.updateDynamic("SourceAccount")(__v.asInstanceOf[js.Any]))
      SourceArn.foreach(__v => __obj.updateDynamic("SourceArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AddPermissionRequest]
    }
  }

  @js.native
  trait AddPermissionResponse extends js.Object {
    var Statement: js.UndefOr[String]
  }

  object AddPermissionResponse {
    @inline
    def apply(
        Statement: js.UndefOr[String] = js.undefined
    ): AddPermissionResponse = {
      val __obj = js.Dynamic.literal()
      Statement.foreach(__v => __obj.updateDynamic("Statement")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AddPermissionResponse]
    }
  }

  /** Provides configuration information about a Lambda function [[https://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html|alias]].
    */
  @js.native
  trait AliasConfiguration extends js.Object {
    var AliasArn: js.UndefOr[FunctionArn]
    var Description: js.UndefOr[Description]
    var FunctionVersion: js.UndefOr[Version]
    var Name: js.UndefOr[Alias]
    var RevisionId: js.UndefOr[String]
    var RoutingConfig: js.UndefOr[AliasRoutingConfiguration]
  }

  object AliasConfiguration {
    @inline
    def apply(
        AliasArn: js.UndefOr[FunctionArn] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        FunctionVersion: js.UndefOr[Version] = js.undefined,
        Name: js.UndefOr[Alias] = js.undefined,
        RevisionId: js.UndefOr[String] = js.undefined,
        RoutingConfig: js.UndefOr[AliasRoutingConfiguration] = js.undefined
    ): AliasConfiguration = {
      val __obj = js.Dynamic.literal()
      AliasArn.foreach(__v => __obj.updateDynamic("AliasArn")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      FunctionVersion.foreach(__v => __obj.updateDynamic("FunctionVersion")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      RevisionId.foreach(__v => __obj.updateDynamic("RevisionId")(__v.asInstanceOf[js.Any]))
      RoutingConfig.foreach(__v => __obj.updateDynamic("RoutingConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AliasConfiguration]
    }
  }

  /** The [[https://docs.aws.amazon.com/lambda/latest/dg/lambda-traffic-shifting-using-aliases.html|traffic-shifting]] configuration of a Lambda function alias.
    */
  @js.native
  trait AliasRoutingConfiguration extends js.Object {
    var AdditionalVersionWeights: js.UndefOr[AdditionalVersionWeights]
  }

  object AliasRoutingConfiguration {
    @inline
    def apply(
        AdditionalVersionWeights: js.UndefOr[AdditionalVersionWeights] = js.undefined
    ): AliasRoutingConfiguration = {
      val __obj = js.Dynamic.literal()
      AdditionalVersionWeights.foreach(__v => __obj.updateDynamic("AdditionalVersionWeights")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AliasRoutingConfiguration]
    }
  }

  /** List of signing profiles that can sign a code package.
    */
  @js.native
  trait AllowedPublishers extends js.Object {
    var SigningProfileVersionArns: SigningProfileVersionArns
  }

  object AllowedPublishers {
    @inline
    def apply(
        SigningProfileVersionArns: SigningProfileVersionArns
    ): AllowedPublishers = {
      val __obj = js.Dynamic.literal(
        "SigningProfileVersionArns" -> SigningProfileVersionArns.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AllowedPublishers]
    }
  }

  /** Details about a Code signing configuration.
    */
  @js.native
  trait CodeSigningConfig extends js.Object {
    var AllowedPublishers: AllowedPublishers
    var CodeSigningConfigArn: CodeSigningConfigArn
    var CodeSigningConfigId: CodeSigningConfigId
    var CodeSigningPolicies: CodeSigningPolicies
    var LastModified: Timestamp
    var Description: js.UndefOr[Description]
  }

  object CodeSigningConfig {
    @inline
    def apply(
        AllowedPublishers: AllowedPublishers,
        CodeSigningConfigArn: CodeSigningConfigArn,
        CodeSigningConfigId: CodeSigningConfigId,
        CodeSigningPolicies: CodeSigningPolicies,
        LastModified: Timestamp,
        Description: js.UndefOr[Description] = js.undefined
    ): CodeSigningConfig = {
      val __obj = js.Dynamic.literal(
        "AllowedPublishers" -> AllowedPublishers.asInstanceOf[js.Any],
        "CodeSigningConfigArn" -> CodeSigningConfigArn.asInstanceOf[js.Any],
        "CodeSigningConfigId" -> CodeSigningConfigId.asInstanceOf[js.Any],
        "CodeSigningPolicies" -> CodeSigningPolicies.asInstanceOf[js.Any],
        "LastModified" -> LastModified.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CodeSigningConfig]
    }
  }

  /** Code signing configuration policies specifies the validation failure action for signature mismatch or expiry.
    */
  @js.native
  trait CodeSigningPolicies extends js.Object {
    var UntrustedArtifactOnDeployment: js.UndefOr[CodeSigningPolicy]
  }

  object CodeSigningPolicies {
    @inline
    def apply(
        UntrustedArtifactOnDeployment: js.UndefOr[CodeSigningPolicy] = js.undefined
    ): CodeSigningPolicies = {
      val __obj = js.Dynamic.literal()
      UntrustedArtifactOnDeployment.foreach(__v => __obj.updateDynamic("UntrustedArtifactOnDeployment")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CodeSigningPolicies]
    }
  }

  @js.native
  sealed trait CodeSigningPolicy extends js.Any
  object CodeSigningPolicy {
    val Warn = "Warn".asInstanceOf[CodeSigningPolicy]
    val Enforce = "Enforce".asInstanceOf[CodeSigningPolicy]

    @inline def values = js.Array(Warn, Enforce)
  }

  @js.native
  trait Concurrency extends js.Object {
    var ReservedConcurrentExecutions: js.UndefOr[ReservedConcurrentExecutions]
  }

  object Concurrency {
    @inline
    def apply(
        ReservedConcurrentExecutions: js.UndefOr[ReservedConcurrentExecutions] = js.undefined
    ): Concurrency = {
      val __obj = js.Dynamic.literal()
      ReservedConcurrentExecutions.foreach(__v => __obj.updateDynamic("ReservedConcurrentExecutions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Concurrency]
    }
  }

  @js.native
  trait CreateAliasRequest extends js.Object {
    var FunctionName: FunctionName
    var FunctionVersion: Version
    var Name: Alias
    var Description: js.UndefOr[Description]
    var RoutingConfig: js.UndefOr[AliasRoutingConfiguration]
  }

  object CreateAliasRequest {
    @inline
    def apply(
        FunctionName: FunctionName,
        FunctionVersion: Version,
        Name: Alias,
        Description: js.UndefOr[Description] = js.undefined,
        RoutingConfig: js.UndefOr[AliasRoutingConfiguration] = js.undefined
    ): CreateAliasRequest = {
      val __obj = js.Dynamic.literal(
        "FunctionName" -> FunctionName.asInstanceOf[js.Any],
        "FunctionVersion" -> FunctionVersion.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      RoutingConfig.foreach(__v => __obj.updateDynamic("RoutingConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAliasRequest]
    }
  }

  @js.native
  trait CreateCodeSigningConfigRequest extends js.Object {
    var AllowedPublishers: AllowedPublishers
    var CodeSigningPolicies: js.UndefOr[CodeSigningPolicies]
    var Description: js.UndefOr[Description]
  }

  object CreateCodeSigningConfigRequest {
    @inline
    def apply(
        AllowedPublishers: AllowedPublishers,
        CodeSigningPolicies: js.UndefOr[CodeSigningPolicies] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined
    ): CreateCodeSigningConfigRequest = {
      val __obj = js.Dynamic.literal(
        "AllowedPublishers" -> AllowedPublishers.asInstanceOf[js.Any]
      )

      CodeSigningPolicies.foreach(__v => __obj.updateDynamic("CodeSigningPolicies")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCodeSigningConfigRequest]
    }
  }

  @js.native
  trait CreateCodeSigningConfigResponse extends js.Object {
    var CodeSigningConfig: CodeSigningConfig
  }

  object CreateCodeSigningConfigResponse {
    @inline
    def apply(
        CodeSigningConfig: CodeSigningConfig
    ): CreateCodeSigningConfigResponse = {
      val __obj = js.Dynamic.literal(
        "CodeSigningConfig" -> CodeSigningConfig.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateCodeSigningConfigResponse]
    }
  }

  @js.native
  trait CreateEventSourceMappingRequest extends js.Object {
    var FunctionName: FunctionName
    var BatchSize: js.UndefOr[BatchSize]
    var BisectBatchOnFunctionError: js.UndefOr[BisectBatchOnFunctionError]
    var DestinationConfig: js.UndefOr[DestinationConfig]
    var Enabled: js.UndefOr[Enabled]
    var EventSourceArn: js.UndefOr[Arn]
    var FunctionResponseTypes: js.UndefOr[FunctionResponseTypeList]
    var MaximumBatchingWindowInSeconds: js.UndefOr[MaximumBatchingWindowInSeconds]
    var MaximumRecordAgeInSeconds: js.UndefOr[MaximumRecordAgeInSeconds]
    var MaximumRetryAttempts: js.UndefOr[MaximumRetryAttemptsEventSourceMapping]
    var ParallelizationFactor: js.UndefOr[ParallelizationFactor]
    var Queues: js.UndefOr[Queues]
    var SelfManagedEventSource: js.UndefOr[SelfManagedEventSource]
    var SourceAccessConfigurations: js.UndefOr[SourceAccessConfigurations]
    var StartingPosition: js.UndefOr[EventSourcePosition]
    var StartingPositionTimestamp: js.UndefOr[Date]
    var Topics: js.UndefOr[Topics]
    var TumblingWindowInSeconds: js.UndefOr[TumblingWindowInSeconds]
  }

  object CreateEventSourceMappingRequest {
    @inline
    def apply(
        FunctionName: FunctionName,
        BatchSize: js.UndefOr[BatchSize] = js.undefined,
        BisectBatchOnFunctionError: js.UndefOr[BisectBatchOnFunctionError] = js.undefined,
        DestinationConfig: js.UndefOr[DestinationConfig] = js.undefined,
        Enabled: js.UndefOr[Enabled] = js.undefined,
        EventSourceArn: js.UndefOr[Arn] = js.undefined,
        FunctionResponseTypes: js.UndefOr[FunctionResponseTypeList] = js.undefined,
        MaximumBatchingWindowInSeconds: js.UndefOr[MaximumBatchingWindowInSeconds] = js.undefined,
        MaximumRecordAgeInSeconds: js.UndefOr[MaximumRecordAgeInSeconds] = js.undefined,
        MaximumRetryAttempts: js.UndefOr[MaximumRetryAttemptsEventSourceMapping] = js.undefined,
        ParallelizationFactor: js.UndefOr[ParallelizationFactor] = js.undefined,
        Queues: js.UndefOr[Queues] = js.undefined,
        SelfManagedEventSource: js.UndefOr[SelfManagedEventSource] = js.undefined,
        SourceAccessConfigurations: js.UndefOr[SourceAccessConfigurations] = js.undefined,
        StartingPosition: js.UndefOr[EventSourcePosition] = js.undefined,
        StartingPositionTimestamp: js.UndefOr[Date] = js.undefined,
        Topics: js.UndefOr[Topics] = js.undefined,
        TumblingWindowInSeconds: js.UndefOr[TumblingWindowInSeconds] = js.undefined
    ): CreateEventSourceMappingRequest = {
      val __obj = js.Dynamic.literal(
        "FunctionName" -> FunctionName.asInstanceOf[js.Any]
      )

      BatchSize.foreach(__v => __obj.updateDynamic("BatchSize")(__v.asInstanceOf[js.Any]))
      BisectBatchOnFunctionError.foreach(__v => __obj.updateDynamic("BisectBatchOnFunctionError")(__v.asInstanceOf[js.Any]))
      DestinationConfig.foreach(__v => __obj.updateDynamic("DestinationConfig")(__v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      EventSourceArn.foreach(__v => __obj.updateDynamic("EventSourceArn")(__v.asInstanceOf[js.Any]))
      FunctionResponseTypes.foreach(__v => __obj.updateDynamic("FunctionResponseTypes")(__v.asInstanceOf[js.Any]))
      MaximumBatchingWindowInSeconds.foreach(__v => __obj.updateDynamic("MaximumBatchingWindowInSeconds")(__v.asInstanceOf[js.Any]))
      MaximumRecordAgeInSeconds.foreach(__v => __obj.updateDynamic("MaximumRecordAgeInSeconds")(__v.asInstanceOf[js.Any]))
      MaximumRetryAttempts.foreach(__v => __obj.updateDynamic("MaximumRetryAttempts")(__v.asInstanceOf[js.Any]))
      ParallelizationFactor.foreach(__v => __obj.updateDynamic("ParallelizationFactor")(__v.asInstanceOf[js.Any]))
      Queues.foreach(__v => __obj.updateDynamic("Queues")(__v.asInstanceOf[js.Any]))
      SelfManagedEventSource.foreach(__v => __obj.updateDynamic("SelfManagedEventSource")(__v.asInstanceOf[js.Any]))
      SourceAccessConfigurations.foreach(__v => __obj.updateDynamic("SourceAccessConfigurations")(__v.asInstanceOf[js.Any]))
      StartingPosition.foreach(__v => __obj.updateDynamic("StartingPosition")(__v.asInstanceOf[js.Any]))
      StartingPositionTimestamp.foreach(__v => __obj.updateDynamic("StartingPositionTimestamp")(__v.asInstanceOf[js.Any]))
      Topics.foreach(__v => __obj.updateDynamic("Topics")(__v.asInstanceOf[js.Any]))
      TumblingWindowInSeconds.foreach(__v => __obj.updateDynamic("TumblingWindowInSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateEventSourceMappingRequest]
    }
  }

  @js.native
  trait CreateFunctionRequest extends js.Object {
    var Code: FunctionCode
    var FunctionName: FunctionName
    var Role: RoleArn
    var CodeSigningConfigArn: js.UndefOr[CodeSigningConfigArn]
    var DeadLetterConfig: js.UndefOr[DeadLetterConfig]
    var Description: js.UndefOr[Description]
    var Environment: js.UndefOr[Environment]
    var FileSystemConfigs: js.UndefOr[FileSystemConfigList]
    var Handler: js.UndefOr[Handler]
    var ImageConfig: js.UndefOr[ImageConfig]
    var KMSKeyArn: js.UndefOr[KMSKeyArn]
    var Layers: js.UndefOr[LayerList]
    var MemorySize: js.UndefOr[MemorySize]
    var PackageType: js.UndefOr[PackageType]
    var Publish: js.UndefOr[Boolean]
    var Runtime: js.UndefOr[Runtime]
    var Tags: js.UndefOr[Tags]
    var Timeout: js.UndefOr[Timeout]
    var TracingConfig: js.UndefOr[TracingConfig]
    var VpcConfig: js.UndefOr[VpcConfig]
  }

  object CreateFunctionRequest {
    @inline
    def apply(
        Code: FunctionCode,
        FunctionName: FunctionName,
        Role: RoleArn,
        CodeSigningConfigArn: js.UndefOr[CodeSigningConfigArn] = js.undefined,
        DeadLetterConfig: js.UndefOr[DeadLetterConfig] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        Environment: js.UndefOr[Environment] = js.undefined,
        FileSystemConfigs: js.UndefOr[FileSystemConfigList] = js.undefined,
        Handler: js.UndefOr[Handler] = js.undefined,
        ImageConfig: js.UndefOr[ImageConfig] = js.undefined,
        KMSKeyArn: js.UndefOr[KMSKeyArn] = js.undefined,
        Layers: js.UndefOr[LayerList] = js.undefined,
        MemorySize: js.UndefOr[MemorySize] = js.undefined,
        PackageType: js.UndefOr[PackageType] = js.undefined,
        Publish: js.UndefOr[Boolean] = js.undefined,
        Runtime: js.UndefOr[Runtime] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        Timeout: js.UndefOr[Timeout] = js.undefined,
        TracingConfig: js.UndefOr[TracingConfig] = js.undefined,
        VpcConfig: js.UndefOr[VpcConfig] = js.undefined
    ): CreateFunctionRequest = {
      val __obj = js.Dynamic.literal(
        "Code" -> Code.asInstanceOf[js.Any],
        "FunctionName" -> FunctionName.asInstanceOf[js.Any],
        "Role" -> Role.asInstanceOf[js.Any]
      )

      CodeSigningConfigArn.foreach(__v => __obj.updateDynamic("CodeSigningConfigArn")(__v.asInstanceOf[js.Any]))
      DeadLetterConfig.foreach(__v => __obj.updateDynamic("DeadLetterConfig")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Environment.foreach(__v => __obj.updateDynamic("Environment")(__v.asInstanceOf[js.Any]))
      FileSystemConfigs.foreach(__v => __obj.updateDynamic("FileSystemConfigs")(__v.asInstanceOf[js.Any]))
      Handler.foreach(__v => __obj.updateDynamic("Handler")(__v.asInstanceOf[js.Any]))
      ImageConfig.foreach(__v => __obj.updateDynamic("ImageConfig")(__v.asInstanceOf[js.Any]))
      KMSKeyArn.foreach(__v => __obj.updateDynamic("KMSKeyArn")(__v.asInstanceOf[js.Any]))
      Layers.foreach(__v => __obj.updateDynamic("Layers")(__v.asInstanceOf[js.Any]))
      MemorySize.foreach(__v => __obj.updateDynamic("MemorySize")(__v.asInstanceOf[js.Any]))
      PackageType.foreach(__v => __obj.updateDynamic("PackageType")(__v.asInstanceOf[js.Any]))
      Publish.foreach(__v => __obj.updateDynamic("Publish")(__v.asInstanceOf[js.Any]))
      Runtime.foreach(__v => __obj.updateDynamic("Runtime")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      Timeout.foreach(__v => __obj.updateDynamic("Timeout")(__v.asInstanceOf[js.Any]))
      TracingConfig.foreach(__v => __obj.updateDynamic("TracingConfig")(__v.asInstanceOf[js.Any]))
      VpcConfig.foreach(__v => __obj.updateDynamic("VpcConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFunctionRequest]
    }
  }

  /** The [[https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html#dlq|dead-letter queue]] for failed asynchronous invocations.
    */
  @js.native
  trait DeadLetterConfig extends js.Object {
    var TargetArn: js.UndefOr[ResourceArn]
  }

  object DeadLetterConfig {
    @inline
    def apply(
        TargetArn: js.UndefOr[ResourceArn] = js.undefined
    ): DeadLetterConfig = {
      val __obj = js.Dynamic.literal()
      TargetArn.foreach(__v => __obj.updateDynamic("TargetArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeadLetterConfig]
    }
  }

  @js.native
  trait DeleteAliasRequest extends js.Object {
    var FunctionName: FunctionName
    var Name: Alias
  }

  object DeleteAliasRequest {
    @inline
    def apply(
        FunctionName: FunctionName,
        Name: Alias
    ): DeleteAliasRequest = {
      val __obj = js.Dynamic.literal(
        "FunctionName" -> FunctionName.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteAliasRequest]
    }
  }

  @js.native
  trait DeleteCodeSigningConfigRequest extends js.Object {
    var CodeSigningConfigArn: CodeSigningConfigArn
  }

  object DeleteCodeSigningConfigRequest {
    @inline
    def apply(
        CodeSigningConfigArn: CodeSigningConfigArn
    ): DeleteCodeSigningConfigRequest = {
      val __obj = js.Dynamic.literal(
        "CodeSigningConfigArn" -> CodeSigningConfigArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteCodeSigningConfigRequest]
    }
  }

  @js.native
  trait DeleteCodeSigningConfigResponse extends js.Object

  object DeleteCodeSigningConfigResponse {
    @inline
    def apply(): DeleteCodeSigningConfigResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteCodeSigningConfigResponse]
    }
  }

  @js.native
  trait DeleteEventSourceMappingRequest extends js.Object {
    var UUID: String
  }

  object DeleteEventSourceMappingRequest {
    @inline
    def apply(
        UUID: String
    ): DeleteEventSourceMappingRequest = {
      val __obj = js.Dynamic.literal(
        "UUID" -> UUID.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteEventSourceMappingRequest]
    }
  }

  @js.native
  trait DeleteFunctionCodeSigningConfigRequest extends js.Object {
    var FunctionName: FunctionName
  }

  object DeleteFunctionCodeSigningConfigRequest {
    @inline
    def apply(
        FunctionName: FunctionName
    ): DeleteFunctionCodeSigningConfigRequest = {
      val __obj = js.Dynamic.literal(
        "FunctionName" -> FunctionName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteFunctionCodeSigningConfigRequest]
    }
  }

  @js.native
  trait DeleteFunctionConcurrencyRequest extends js.Object {
    var FunctionName: FunctionName
  }

  object DeleteFunctionConcurrencyRequest {
    @inline
    def apply(
        FunctionName: FunctionName
    ): DeleteFunctionConcurrencyRequest = {
      val __obj = js.Dynamic.literal(
        "FunctionName" -> FunctionName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteFunctionConcurrencyRequest]
    }
  }

  @js.native
  trait DeleteFunctionEventInvokeConfigRequest extends js.Object {
    var FunctionName: FunctionName
    var Qualifier: js.UndefOr[Qualifier]
  }

  object DeleteFunctionEventInvokeConfigRequest {
    @inline
    def apply(
        FunctionName: FunctionName,
        Qualifier: js.UndefOr[Qualifier] = js.undefined
    ): DeleteFunctionEventInvokeConfigRequest = {
      val __obj = js.Dynamic.literal(
        "FunctionName" -> FunctionName.asInstanceOf[js.Any]
      )

      Qualifier.foreach(__v => __obj.updateDynamic("Qualifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteFunctionEventInvokeConfigRequest]
    }
  }

  @js.native
  trait DeleteFunctionRequest extends js.Object {
    var FunctionName: FunctionName
    var Qualifier: js.UndefOr[Qualifier]
  }

  object DeleteFunctionRequest {
    @inline
    def apply(
        FunctionName: FunctionName,
        Qualifier: js.UndefOr[Qualifier] = js.undefined
    ): DeleteFunctionRequest = {
      val __obj = js.Dynamic.literal(
        "FunctionName" -> FunctionName.asInstanceOf[js.Any]
      )

      Qualifier.foreach(__v => __obj.updateDynamic("Qualifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteFunctionRequest]
    }
  }

  @js.native
  trait DeleteLayerVersionRequest extends js.Object {
    var LayerName: LayerName
    var VersionNumber: LayerVersionNumber
  }

  object DeleteLayerVersionRequest {
    @inline
    def apply(
        LayerName: LayerName,
        VersionNumber: LayerVersionNumber
    ): DeleteLayerVersionRequest = {
      val __obj = js.Dynamic.literal(
        "LayerName" -> LayerName.asInstanceOf[js.Any],
        "VersionNumber" -> VersionNumber.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteLayerVersionRequest]
    }
  }

  @js.native
  trait DeleteProvisionedConcurrencyConfigRequest extends js.Object {
    var FunctionName: FunctionName
    var Qualifier: Qualifier
  }

  object DeleteProvisionedConcurrencyConfigRequest {
    @inline
    def apply(
        FunctionName: FunctionName,
        Qualifier: Qualifier
    ): DeleteProvisionedConcurrencyConfigRequest = {
      val __obj = js.Dynamic.literal(
        "FunctionName" -> FunctionName.asInstanceOf[js.Any],
        "Qualifier" -> Qualifier.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteProvisionedConcurrencyConfigRequest]
    }
  }

  /** A configuration object that specifies the destination of an event after Lambda processes it.
    */
  @js.native
  trait DestinationConfig extends js.Object {
    var OnFailure: js.UndefOr[OnFailure]
    var OnSuccess: js.UndefOr[OnSuccess]
  }

  object DestinationConfig {
    @inline
    def apply(
        OnFailure: js.UndefOr[OnFailure] = js.undefined,
        OnSuccess: js.UndefOr[OnSuccess] = js.undefined
    ): DestinationConfig = {
      val __obj = js.Dynamic.literal()
      OnFailure.foreach(__v => __obj.updateDynamic("OnFailure")(__v.asInstanceOf[js.Any]))
      OnSuccess.foreach(__v => __obj.updateDynamic("OnSuccess")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DestinationConfig]
    }
  }

  @js.native
  sealed trait EndPointType extends js.Any
  object EndPointType {
    val KAFKA_BOOTSTRAP_SERVERS = "KAFKA_BOOTSTRAP_SERVERS".asInstanceOf[EndPointType]

    @inline def values = js.Array(KAFKA_BOOTSTRAP_SERVERS)
  }

  /** A function's environment variable settings.
    */
  @js.native
  trait Environment extends js.Object {
    var Variables: js.UndefOr[EnvironmentVariables]
  }

  object Environment {
    @inline
    def apply(
        Variables: js.UndefOr[EnvironmentVariables] = js.undefined
    ): Environment = {
      val __obj = js.Dynamic.literal()
      Variables.foreach(__v => __obj.updateDynamic("Variables")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Environment]
    }
  }

  /** Error messages for environment variables that couldn't be applied.
    */
  @js.native
  trait EnvironmentError extends js.Object {
    var ErrorCode: js.UndefOr[String]
    var Message: js.UndefOr[SensitiveString]
  }

  object EnvironmentError {
    @inline
    def apply(
        ErrorCode: js.UndefOr[String] = js.undefined,
        Message: js.UndefOr[SensitiveString] = js.undefined
    ): EnvironmentError = {
      val __obj = js.Dynamic.literal()
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EnvironmentError]
    }
  }

  /** The results of an operation to update or read environment variables. If the operation is successful, the response contains the environment variables. If it failed, the response contains details about the error.
    */
  @js.native
  trait EnvironmentResponse extends js.Object {
    var Error: js.UndefOr[EnvironmentError]
    var Variables: js.UndefOr[EnvironmentVariables]
  }

  object EnvironmentResponse {
    @inline
    def apply(
        Error: js.UndefOr[EnvironmentError] = js.undefined,
        Variables: js.UndefOr[EnvironmentVariables] = js.undefined
    ): EnvironmentResponse = {
      val __obj = js.Dynamic.literal()
      Error.foreach(__v => __obj.updateDynamic("Error")(__v.asInstanceOf[js.Any]))
      Variables.foreach(__v => __obj.updateDynamic("Variables")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EnvironmentResponse]
    }
  }

  /** A mapping between an AWS resource and an AWS Lambda function. See <a>CreateEventSourceMapping</a> for details.
    */
  @js.native
  trait EventSourceMappingConfiguration extends js.Object {
    var BatchSize: js.UndefOr[BatchSize]
    var BisectBatchOnFunctionError: js.UndefOr[BisectBatchOnFunctionError]
    var DestinationConfig: js.UndefOr[DestinationConfig]
    var EventSourceArn: js.UndefOr[Arn]
    var FunctionArn: js.UndefOr[FunctionArn]
    var FunctionResponseTypes: js.UndefOr[FunctionResponseTypeList]
    var LastModified: js.UndefOr[Date]
    var LastProcessingResult: js.UndefOr[String]
    var MaximumBatchingWindowInSeconds: js.UndefOr[MaximumBatchingWindowInSeconds]
    var MaximumRecordAgeInSeconds: js.UndefOr[MaximumRecordAgeInSeconds]
    var MaximumRetryAttempts: js.UndefOr[MaximumRetryAttemptsEventSourceMapping]
    var ParallelizationFactor: js.UndefOr[ParallelizationFactor]
    var Queues: js.UndefOr[Queues]
    var SelfManagedEventSource: js.UndefOr[SelfManagedEventSource]
    var SourceAccessConfigurations: js.UndefOr[SourceAccessConfigurations]
    var StartingPosition: js.UndefOr[EventSourcePosition]
    var StartingPositionTimestamp: js.UndefOr[Date]
    var State: js.UndefOr[String]
    var StateTransitionReason: js.UndefOr[String]
    var Topics: js.UndefOr[Topics]
    var TumblingWindowInSeconds: js.UndefOr[TumblingWindowInSeconds]
    var UUID: js.UndefOr[String]
  }

  object EventSourceMappingConfiguration {
    @inline
    def apply(
        BatchSize: js.UndefOr[BatchSize] = js.undefined,
        BisectBatchOnFunctionError: js.UndefOr[BisectBatchOnFunctionError] = js.undefined,
        DestinationConfig: js.UndefOr[DestinationConfig] = js.undefined,
        EventSourceArn: js.UndefOr[Arn] = js.undefined,
        FunctionArn: js.UndefOr[FunctionArn] = js.undefined,
        FunctionResponseTypes: js.UndefOr[FunctionResponseTypeList] = js.undefined,
        LastModified: js.UndefOr[Date] = js.undefined,
        LastProcessingResult: js.UndefOr[String] = js.undefined,
        MaximumBatchingWindowInSeconds: js.UndefOr[MaximumBatchingWindowInSeconds] = js.undefined,
        MaximumRecordAgeInSeconds: js.UndefOr[MaximumRecordAgeInSeconds] = js.undefined,
        MaximumRetryAttempts: js.UndefOr[MaximumRetryAttemptsEventSourceMapping] = js.undefined,
        ParallelizationFactor: js.UndefOr[ParallelizationFactor] = js.undefined,
        Queues: js.UndefOr[Queues] = js.undefined,
        SelfManagedEventSource: js.UndefOr[SelfManagedEventSource] = js.undefined,
        SourceAccessConfigurations: js.UndefOr[SourceAccessConfigurations] = js.undefined,
        StartingPosition: js.UndefOr[EventSourcePosition] = js.undefined,
        StartingPositionTimestamp: js.UndefOr[Date] = js.undefined,
        State: js.UndefOr[String] = js.undefined,
        StateTransitionReason: js.UndefOr[String] = js.undefined,
        Topics: js.UndefOr[Topics] = js.undefined,
        TumblingWindowInSeconds: js.UndefOr[TumblingWindowInSeconds] = js.undefined,
        UUID: js.UndefOr[String] = js.undefined
    ): EventSourceMappingConfiguration = {
      val __obj = js.Dynamic.literal()
      BatchSize.foreach(__v => __obj.updateDynamic("BatchSize")(__v.asInstanceOf[js.Any]))
      BisectBatchOnFunctionError.foreach(__v => __obj.updateDynamic("BisectBatchOnFunctionError")(__v.asInstanceOf[js.Any]))
      DestinationConfig.foreach(__v => __obj.updateDynamic("DestinationConfig")(__v.asInstanceOf[js.Any]))
      EventSourceArn.foreach(__v => __obj.updateDynamic("EventSourceArn")(__v.asInstanceOf[js.Any]))
      FunctionArn.foreach(__v => __obj.updateDynamic("FunctionArn")(__v.asInstanceOf[js.Any]))
      FunctionResponseTypes.foreach(__v => __obj.updateDynamic("FunctionResponseTypes")(__v.asInstanceOf[js.Any]))
      LastModified.foreach(__v => __obj.updateDynamic("LastModified")(__v.asInstanceOf[js.Any]))
      LastProcessingResult.foreach(__v => __obj.updateDynamic("LastProcessingResult")(__v.asInstanceOf[js.Any]))
      MaximumBatchingWindowInSeconds.foreach(__v => __obj.updateDynamic("MaximumBatchingWindowInSeconds")(__v.asInstanceOf[js.Any]))
      MaximumRecordAgeInSeconds.foreach(__v => __obj.updateDynamic("MaximumRecordAgeInSeconds")(__v.asInstanceOf[js.Any]))
      MaximumRetryAttempts.foreach(__v => __obj.updateDynamic("MaximumRetryAttempts")(__v.asInstanceOf[js.Any]))
      ParallelizationFactor.foreach(__v => __obj.updateDynamic("ParallelizationFactor")(__v.asInstanceOf[js.Any]))
      Queues.foreach(__v => __obj.updateDynamic("Queues")(__v.asInstanceOf[js.Any]))
      SelfManagedEventSource.foreach(__v => __obj.updateDynamic("SelfManagedEventSource")(__v.asInstanceOf[js.Any]))
      SourceAccessConfigurations.foreach(__v => __obj.updateDynamic("SourceAccessConfigurations")(__v.asInstanceOf[js.Any]))
      StartingPosition.foreach(__v => __obj.updateDynamic("StartingPosition")(__v.asInstanceOf[js.Any]))
      StartingPositionTimestamp.foreach(__v => __obj.updateDynamic("StartingPositionTimestamp")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      StateTransitionReason.foreach(__v => __obj.updateDynamic("StateTransitionReason")(__v.asInstanceOf[js.Any]))
      Topics.foreach(__v => __obj.updateDynamic("Topics")(__v.asInstanceOf[js.Any]))
      TumblingWindowInSeconds.foreach(__v => __obj.updateDynamic("TumblingWindowInSeconds")(__v.asInstanceOf[js.Any]))
      UUID.foreach(__v => __obj.updateDynamic("UUID")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventSourceMappingConfiguration]
    }
  }

  @js.native
  sealed trait EventSourcePosition extends js.Any
  object EventSourcePosition {
    val TRIM_HORIZON = "TRIM_HORIZON".asInstanceOf[EventSourcePosition]
    val LATEST = "LATEST".asInstanceOf[EventSourcePosition]
    val AT_TIMESTAMP = "AT_TIMESTAMP".asInstanceOf[EventSourcePosition]

    @inline def values = js.Array(TRIM_HORIZON, LATEST, AT_TIMESTAMP)
  }

  /** Details about the connection between a Lambda function and an Amazon EFS file system.
    */
  @js.native
  trait FileSystemConfig extends js.Object {
    var Arn: FileSystemArn
    var LocalMountPath: LocalMountPath
  }

  object FileSystemConfig {
    @inline
    def apply(
        Arn: FileSystemArn,
        LocalMountPath: LocalMountPath
    ): FileSystemConfig = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any],
        "LocalMountPath" -> LocalMountPath.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[FileSystemConfig]
    }
  }

  /** The code for the Lambda function. You can specify either an object in Amazon S3, upload a .zip file archive deployment package directly, or specify the URI of a container image.
    */
  @js.native
  trait FunctionCode extends js.Object {
    var ImageUri: js.UndefOr[String]
    var S3Bucket: js.UndefOr[S3Bucket]
    var S3Key: js.UndefOr[S3Key]
    var S3ObjectVersion: js.UndefOr[S3ObjectVersion]
    var ZipFile: js.UndefOr[Blob]
  }

  object FunctionCode {
    @inline
    def apply(
        ImageUri: js.UndefOr[String] = js.undefined,
        S3Bucket: js.UndefOr[S3Bucket] = js.undefined,
        S3Key: js.UndefOr[S3Key] = js.undefined,
        S3ObjectVersion: js.UndefOr[S3ObjectVersion] = js.undefined,
        ZipFile: js.UndefOr[Blob] = js.undefined
    ): FunctionCode = {
      val __obj = js.Dynamic.literal()
      ImageUri.foreach(__v => __obj.updateDynamic("ImageUri")(__v.asInstanceOf[js.Any]))
      S3Bucket.foreach(__v => __obj.updateDynamic("S3Bucket")(__v.asInstanceOf[js.Any]))
      S3Key.foreach(__v => __obj.updateDynamic("S3Key")(__v.asInstanceOf[js.Any]))
      S3ObjectVersion.foreach(__v => __obj.updateDynamic("S3ObjectVersion")(__v.asInstanceOf[js.Any]))
      ZipFile.foreach(__v => __obj.updateDynamic("ZipFile")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FunctionCode]
    }
  }

  /** Details about a function's deployment package.
    */
  @js.native
  trait FunctionCodeLocation extends js.Object {
    var ImageUri: js.UndefOr[String]
    var Location: js.UndefOr[String]
    var RepositoryType: js.UndefOr[String]
    var ResolvedImageUri: js.UndefOr[String]
  }

  object FunctionCodeLocation {
    @inline
    def apply(
        ImageUri: js.UndefOr[String] = js.undefined,
        Location: js.UndefOr[String] = js.undefined,
        RepositoryType: js.UndefOr[String] = js.undefined,
        ResolvedImageUri: js.UndefOr[String] = js.undefined
    ): FunctionCodeLocation = {
      val __obj = js.Dynamic.literal()
      ImageUri.foreach(__v => __obj.updateDynamic("ImageUri")(__v.asInstanceOf[js.Any]))
      Location.foreach(__v => __obj.updateDynamic("Location")(__v.asInstanceOf[js.Any]))
      RepositoryType.foreach(__v => __obj.updateDynamic("RepositoryType")(__v.asInstanceOf[js.Any]))
      ResolvedImageUri.foreach(__v => __obj.updateDynamic("ResolvedImageUri")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FunctionCodeLocation]
    }
  }

  /** Details about a function's configuration.
    */
  @js.native
  trait FunctionConfiguration extends js.Object {
    var CodeSha256: js.UndefOr[String]
    var CodeSize: js.UndefOr[Double]
    var DeadLetterConfig: js.UndefOr[DeadLetterConfig]
    var Description: js.UndefOr[Description]
    var Environment: js.UndefOr[EnvironmentResponse]
    var FileSystemConfigs: js.UndefOr[FileSystemConfigList]
    var FunctionArn: js.UndefOr[NameSpacedFunctionArn]
    var FunctionName: js.UndefOr[NamespacedFunctionName]
    var Handler: js.UndefOr[Handler]
    var ImageConfigResponse: js.UndefOr[ImageConfigResponse]
    var KMSKeyArn: js.UndefOr[KMSKeyArn]
    var LastModified: js.UndefOr[Timestamp]
    var LastUpdateStatus: js.UndefOr[LastUpdateStatus]
    var LastUpdateStatusReason: js.UndefOr[LastUpdateStatusReason]
    var LastUpdateStatusReasonCode: js.UndefOr[LastUpdateStatusReasonCode]
    var Layers: js.UndefOr[LayersReferenceList]
    var MasterArn: js.UndefOr[FunctionArn]
    var MemorySize: js.UndefOr[MemorySize]
    var PackageType: js.UndefOr[PackageType]
    var RevisionId: js.UndefOr[String]
    var Role: js.UndefOr[RoleArn]
    var Runtime: js.UndefOr[Runtime]
    var SigningJobArn: js.UndefOr[Arn]
    var SigningProfileVersionArn: js.UndefOr[Arn]
    var State: js.UndefOr[State]
    var StateReason: js.UndefOr[StateReason]
    var StateReasonCode: js.UndefOr[StateReasonCode]
    var Timeout: js.UndefOr[Timeout]
    var TracingConfig: js.UndefOr[TracingConfigResponse]
    var Version: js.UndefOr[Version]
    var VpcConfig: js.UndefOr[VpcConfigResponse]
  }

  object FunctionConfiguration {
    @inline
    def apply(
        CodeSha256: js.UndefOr[String] = js.undefined,
        CodeSize: js.UndefOr[Double] = js.undefined,
        DeadLetterConfig: js.UndefOr[DeadLetterConfig] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        Environment: js.UndefOr[EnvironmentResponse] = js.undefined,
        FileSystemConfigs: js.UndefOr[FileSystemConfigList] = js.undefined,
        FunctionArn: js.UndefOr[NameSpacedFunctionArn] = js.undefined,
        FunctionName: js.UndefOr[NamespacedFunctionName] = js.undefined,
        Handler: js.UndefOr[Handler] = js.undefined,
        ImageConfigResponse: js.UndefOr[ImageConfigResponse] = js.undefined,
        KMSKeyArn: js.UndefOr[KMSKeyArn] = js.undefined,
        LastModified: js.UndefOr[Timestamp] = js.undefined,
        LastUpdateStatus: js.UndefOr[LastUpdateStatus] = js.undefined,
        LastUpdateStatusReason: js.UndefOr[LastUpdateStatusReason] = js.undefined,
        LastUpdateStatusReasonCode: js.UndefOr[LastUpdateStatusReasonCode] = js.undefined,
        Layers: js.UndefOr[LayersReferenceList] = js.undefined,
        MasterArn: js.UndefOr[FunctionArn] = js.undefined,
        MemorySize: js.UndefOr[MemorySize] = js.undefined,
        PackageType: js.UndefOr[PackageType] = js.undefined,
        RevisionId: js.UndefOr[String] = js.undefined,
        Role: js.UndefOr[RoleArn] = js.undefined,
        Runtime: js.UndefOr[Runtime] = js.undefined,
        SigningJobArn: js.UndefOr[Arn] = js.undefined,
        SigningProfileVersionArn: js.UndefOr[Arn] = js.undefined,
        State: js.UndefOr[State] = js.undefined,
        StateReason: js.UndefOr[StateReason] = js.undefined,
        StateReasonCode: js.UndefOr[StateReasonCode] = js.undefined,
        Timeout: js.UndefOr[Timeout] = js.undefined,
        TracingConfig: js.UndefOr[TracingConfigResponse] = js.undefined,
        Version: js.UndefOr[Version] = js.undefined,
        VpcConfig: js.UndefOr[VpcConfigResponse] = js.undefined
    ): FunctionConfiguration = {
      val __obj = js.Dynamic.literal()
      CodeSha256.foreach(__v => __obj.updateDynamic("CodeSha256")(__v.asInstanceOf[js.Any]))
      CodeSize.foreach(__v => __obj.updateDynamic("CodeSize")(__v.asInstanceOf[js.Any]))
      DeadLetterConfig.foreach(__v => __obj.updateDynamic("DeadLetterConfig")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Environment.foreach(__v => __obj.updateDynamic("Environment")(__v.asInstanceOf[js.Any]))
      FileSystemConfigs.foreach(__v => __obj.updateDynamic("FileSystemConfigs")(__v.asInstanceOf[js.Any]))
      FunctionArn.foreach(__v => __obj.updateDynamic("FunctionArn")(__v.asInstanceOf[js.Any]))
      FunctionName.foreach(__v => __obj.updateDynamic("FunctionName")(__v.asInstanceOf[js.Any]))
      Handler.foreach(__v => __obj.updateDynamic("Handler")(__v.asInstanceOf[js.Any]))
      ImageConfigResponse.foreach(__v => __obj.updateDynamic("ImageConfigResponse")(__v.asInstanceOf[js.Any]))
      KMSKeyArn.foreach(__v => __obj.updateDynamic("KMSKeyArn")(__v.asInstanceOf[js.Any]))
      LastModified.foreach(__v => __obj.updateDynamic("LastModified")(__v.asInstanceOf[js.Any]))
      LastUpdateStatus.foreach(__v => __obj.updateDynamic("LastUpdateStatus")(__v.asInstanceOf[js.Any]))
      LastUpdateStatusReason.foreach(__v => __obj.updateDynamic("LastUpdateStatusReason")(__v.asInstanceOf[js.Any]))
      LastUpdateStatusReasonCode.foreach(__v => __obj.updateDynamic("LastUpdateStatusReasonCode")(__v.asInstanceOf[js.Any]))
      Layers.foreach(__v => __obj.updateDynamic("Layers")(__v.asInstanceOf[js.Any]))
      MasterArn.foreach(__v => __obj.updateDynamic("MasterArn")(__v.asInstanceOf[js.Any]))
      MemorySize.foreach(__v => __obj.updateDynamic("MemorySize")(__v.asInstanceOf[js.Any]))
      PackageType.foreach(__v => __obj.updateDynamic("PackageType")(__v.asInstanceOf[js.Any]))
      RevisionId.foreach(__v => __obj.updateDynamic("RevisionId")(__v.asInstanceOf[js.Any]))
      Role.foreach(__v => __obj.updateDynamic("Role")(__v.asInstanceOf[js.Any]))
      Runtime.foreach(__v => __obj.updateDynamic("Runtime")(__v.asInstanceOf[js.Any]))
      SigningJobArn.foreach(__v => __obj.updateDynamic("SigningJobArn")(__v.asInstanceOf[js.Any]))
      SigningProfileVersionArn.foreach(__v => __obj.updateDynamic("SigningProfileVersionArn")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      StateReason.foreach(__v => __obj.updateDynamic("StateReason")(__v.asInstanceOf[js.Any]))
      StateReasonCode.foreach(__v => __obj.updateDynamic("StateReasonCode")(__v.asInstanceOf[js.Any]))
      Timeout.foreach(__v => __obj.updateDynamic("Timeout")(__v.asInstanceOf[js.Any]))
      TracingConfig.foreach(__v => __obj.updateDynamic("TracingConfig")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      VpcConfig.foreach(__v => __obj.updateDynamic("VpcConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FunctionConfiguration]
    }
  }

  @js.native
  trait FunctionEventInvokeConfig extends js.Object {
    var DestinationConfig: js.UndefOr[DestinationConfig]
    var FunctionArn: js.UndefOr[FunctionArn]
    var LastModified: js.UndefOr[Date]
    var MaximumEventAgeInSeconds: js.UndefOr[MaximumEventAgeInSeconds]
    var MaximumRetryAttempts: js.UndefOr[MaximumRetryAttempts]
  }

  object FunctionEventInvokeConfig {
    @inline
    def apply(
        DestinationConfig: js.UndefOr[DestinationConfig] = js.undefined,
        FunctionArn: js.UndefOr[FunctionArn] = js.undefined,
        LastModified: js.UndefOr[Date] = js.undefined,
        MaximumEventAgeInSeconds: js.UndefOr[MaximumEventAgeInSeconds] = js.undefined,
        MaximumRetryAttempts: js.UndefOr[MaximumRetryAttempts] = js.undefined
    ): FunctionEventInvokeConfig = {
      val __obj = js.Dynamic.literal()
      DestinationConfig.foreach(__v => __obj.updateDynamic("DestinationConfig")(__v.asInstanceOf[js.Any]))
      FunctionArn.foreach(__v => __obj.updateDynamic("FunctionArn")(__v.asInstanceOf[js.Any]))
      LastModified.foreach(__v => __obj.updateDynamic("LastModified")(__v.asInstanceOf[js.Any]))
      MaximumEventAgeInSeconds.foreach(__v => __obj.updateDynamic("MaximumEventAgeInSeconds")(__v.asInstanceOf[js.Any]))
      MaximumRetryAttempts.foreach(__v => __obj.updateDynamic("MaximumRetryAttempts")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FunctionEventInvokeConfig]
    }
  }

  @js.native
  sealed trait FunctionResponseType extends js.Any
  object FunctionResponseType {
    val ReportBatchItemFailures = "ReportBatchItemFailures".asInstanceOf[FunctionResponseType]

    @inline def values = js.Array(ReportBatchItemFailures)
  }

  @js.native
  sealed trait FunctionVersion extends js.Any
  object FunctionVersion {
    val ALL = "ALL".asInstanceOf[FunctionVersion]

    @inline def values = js.Array(ALL)
  }

  @js.native
  trait GetAccountSettingsRequest extends js.Object

  object GetAccountSettingsRequest {
    @inline
    def apply(): GetAccountSettingsRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetAccountSettingsRequest]
    }
  }

  @js.native
  trait GetAccountSettingsResponse extends js.Object {
    var AccountLimit: js.UndefOr[AccountLimit]
    var AccountUsage: js.UndefOr[AccountUsage]
  }

  object GetAccountSettingsResponse {
    @inline
    def apply(
        AccountLimit: js.UndefOr[AccountLimit] = js.undefined,
        AccountUsage: js.UndefOr[AccountUsage] = js.undefined
    ): GetAccountSettingsResponse = {
      val __obj = js.Dynamic.literal()
      AccountLimit.foreach(__v => __obj.updateDynamic("AccountLimit")(__v.asInstanceOf[js.Any]))
      AccountUsage.foreach(__v => __obj.updateDynamic("AccountUsage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAccountSettingsResponse]
    }
  }

  @js.native
  trait GetAliasRequest extends js.Object {
    var FunctionName: FunctionName
    var Name: Alias
  }

  object GetAliasRequest {
    @inline
    def apply(
        FunctionName: FunctionName,
        Name: Alias
    ): GetAliasRequest = {
      val __obj = js.Dynamic.literal(
        "FunctionName" -> FunctionName.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetAliasRequest]
    }
  }

  @js.native
  trait GetCodeSigningConfigRequest extends js.Object {
    var CodeSigningConfigArn: CodeSigningConfigArn
  }

  object GetCodeSigningConfigRequest {
    @inline
    def apply(
        CodeSigningConfigArn: CodeSigningConfigArn
    ): GetCodeSigningConfigRequest = {
      val __obj = js.Dynamic.literal(
        "CodeSigningConfigArn" -> CodeSigningConfigArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetCodeSigningConfigRequest]
    }
  }

  @js.native
  trait GetCodeSigningConfigResponse extends js.Object {
    var CodeSigningConfig: CodeSigningConfig
  }

  object GetCodeSigningConfigResponse {
    @inline
    def apply(
        CodeSigningConfig: CodeSigningConfig
    ): GetCodeSigningConfigResponse = {
      val __obj = js.Dynamic.literal(
        "CodeSigningConfig" -> CodeSigningConfig.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetCodeSigningConfigResponse]
    }
  }

  @js.native
  trait GetEventSourceMappingRequest extends js.Object {
    var UUID: String
  }

  object GetEventSourceMappingRequest {
    @inline
    def apply(
        UUID: String
    ): GetEventSourceMappingRequest = {
      val __obj = js.Dynamic.literal(
        "UUID" -> UUID.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetEventSourceMappingRequest]
    }
  }

  @js.native
  trait GetFunctionCodeSigningConfigRequest extends js.Object {
    var FunctionName: FunctionName
  }

  object GetFunctionCodeSigningConfigRequest {
    @inline
    def apply(
        FunctionName: FunctionName
    ): GetFunctionCodeSigningConfigRequest = {
      val __obj = js.Dynamic.literal(
        "FunctionName" -> FunctionName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetFunctionCodeSigningConfigRequest]
    }
  }

  @js.native
  trait GetFunctionCodeSigningConfigResponse extends js.Object {
    var CodeSigningConfigArn: CodeSigningConfigArn
    var FunctionName: FunctionName
  }

  object GetFunctionCodeSigningConfigResponse {
    @inline
    def apply(
        CodeSigningConfigArn: CodeSigningConfigArn,
        FunctionName: FunctionName
    ): GetFunctionCodeSigningConfigResponse = {
      val __obj = js.Dynamic.literal(
        "CodeSigningConfigArn" -> CodeSigningConfigArn.asInstanceOf[js.Any],
        "FunctionName" -> FunctionName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetFunctionCodeSigningConfigResponse]
    }
  }

  @js.native
  trait GetFunctionConcurrencyRequest extends js.Object {
    var FunctionName: FunctionName
  }

  object GetFunctionConcurrencyRequest {
    @inline
    def apply(
        FunctionName: FunctionName
    ): GetFunctionConcurrencyRequest = {
      val __obj = js.Dynamic.literal(
        "FunctionName" -> FunctionName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetFunctionConcurrencyRequest]
    }
  }

  @js.native
  trait GetFunctionConcurrencyResponse extends js.Object {
    var ReservedConcurrentExecutions: js.UndefOr[ReservedConcurrentExecutions]
  }

  object GetFunctionConcurrencyResponse {
    @inline
    def apply(
        ReservedConcurrentExecutions: js.UndefOr[ReservedConcurrentExecutions] = js.undefined
    ): GetFunctionConcurrencyResponse = {
      val __obj = js.Dynamic.literal()
      ReservedConcurrentExecutions.foreach(__v => __obj.updateDynamic("ReservedConcurrentExecutions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFunctionConcurrencyResponse]
    }
  }

  @js.native
  trait GetFunctionConfigurationRequest extends js.Object {
    var FunctionName: NamespacedFunctionName
    var Qualifier: js.UndefOr[Qualifier]
  }

  object GetFunctionConfigurationRequest {
    @inline
    def apply(
        FunctionName: NamespacedFunctionName,
        Qualifier: js.UndefOr[Qualifier] = js.undefined
    ): GetFunctionConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "FunctionName" -> FunctionName.asInstanceOf[js.Any]
      )

      Qualifier.foreach(__v => __obj.updateDynamic("Qualifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFunctionConfigurationRequest]
    }
  }

  @js.native
  trait GetFunctionEventInvokeConfigRequest extends js.Object {
    var FunctionName: FunctionName
    var Qualifier: js.UndefOr[Qualifier]
  }

  object GetFunctionEventInvokeConfigRequest {
    @inline
    def apply(
        FunctionName: FunctionName,
        Qualifier: js.UndefOr[Qualifier] = js.undefined
    ): GetFunctionEventInvokeConfigRequest = {
      val __obj = js.Dynamic.literal(
        "FunctionName" -> FunctionName.asInstanceOf[js.Any]
      )

      Qualifier.foreach(__v => __obj.updateDynamic("Qualifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFunctionEventInvokeConfigRequest]
    }
  }

  @js.native
  trait GetFunctionRequest extends js.Object {
    var FunctionName: NamespacedFunctionName
    var Qualifier: js.UndefOr[Qualifier]
  }

  object GetFunctionRequest {
    @inline
    def apply(
        FunctionName: NamespacedFunctionName,
        Qualifier: js.UndefOr[Qualifier] = js.undefined
    ): GetFunctionRequest = {
      val __obj = js.Dynamic.literal(
        "FunctionName" -> FunctionName.asInstanceOf[js.Any]
      )

      Qualifier.foreach(__v => __obj.updateDynamic("Qualifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFunctionRequest]
    }
  }

  @js.native
  trait GetFunctionResponse extends js.Object {
    var Code: js.UndefOr[FunctionCodeLocation]
    var Concurrency: js.UndefOr[Concurrency]
    var Configuration: js.UndefOr[FunctionConfiguration]
    var Tags: js.UndefOr[Tags]
  }

  object GetFunctionResponse {
    @inline
    def apply(
        Code: js.UndefOr[FunctionCodeLocation] = js.undefined,
        Concurrency: js.UndefOr[Concurrency] = js.undefined,
        Configuration: js.UndefOr[FunctionConfiguration] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): GetFunctionResponse = {
      val __obj = js.Dynamic.literal()
      Code.foreach(__v => __obj.updateDynamic("Code")(__v.asInstanceOf[js.Any]))
      Concurrency.foreach(__v => __obj.updateDynamic("Concurrency")(__v.asInstanceOf[js.Any]))
      Configuration.foreach(__v => __obj.updateDynamic("Configuration")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFunctionResponse]
    }
  }

  @js.native
  trait GetLayerVersionByArnRequest extends js.Object {
    var Arn: LayerVersionArn
  }

  object GetLayerVersionByArnRequest {
    @inline
    def apply(
        Arn: LayerVersionArn
    ): GetLayerVersionByArnRequest = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetLayerVersionByArnRequest]
    }
  }

  @js.native
  trait GetLayerVersionPolicyRequest extends js.Object {
    var LayerName: LayerName
    var VersionNumber: LayerVersionNumber
  }

  object GetLayerVersionPolicyRequest {
    @inline
    def apply(
        LayerName: LayerName,
        VersionNumber: LayerVersionNumber
    ): GetLayerVersionPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "LayerName" -> LayerName.asInstanceOf[js.Any],
        "VersionNumber" -> VersionNumber.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetLayerVersionPolicyRequest]
    }
  }

  @js.native
  trait GetLayerVersionPolicyResponse extends js.Object {
    var Policy: js.UndefOr[String]
    var RevisionId: js.UndefOr[String]
  }

  object GetLayerVersionPolicyResponse {
    @inline
    def apply(
        Policy: js.UndefOr[String] = js.undefined,
        RevisionId: js.UndefOr[String] = js.undefined
    ): GetLayerVersionPolicyResponse = {
      val __obj = js.Dynamic.literal()
      Policy.foreach(__v => __obj.updateDynamic("Policy")(__v.asInstanceOf[js.Any]))
      RevisionId.foreach(__v => __obj.updateDynamic("RevisionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLayerVersionPolicyResponse]
    }
  }

  @js.native
  trait GetLayerVersionRequest extends js.Object {
    var LayerName: LayerName
    var VersionNumber: LayerVersionNumber
  }

  object GetLayerVersionRequest {
    @inline
    def apply(
        LayerName: LayerName,
        VersionNumber: LayerVersionNumber
    ): GetLayerVersionRequest = {
      val __obj = js.Dynamic.literal(
        "LayerName" -> LayerName.asInstanceOf[js.Any],
        "VersionNumber" -> VersionNumber.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetLayerVersionRequest]
    }
  }

  @js.native
  trait GetLayerVersionResponse extends js.Object {
    var CompatibleRuntimes: js.UndefOr[CompatibleRuntimes]
    var Content: js.UndefOr[LayerVersionContentOutput]
    var CreatedDate: js.UndefOr[Timestamp]
    var Description: js.UndefOr[Description]
    var LayerArn: js.UndefOr[LayerArn]
    var LayerVersionArn: js.UndefOr[LayerVersionArn]
    var LicenseInfo: js.UndefOr[LicenseInfo]
    var Version: js.UndefOr[LayerVersionNumber]
  }

  object GetLayerVersionResponse {
    @inline
    def apply(
        CompatibleRuntimes: js.UndefOr[CompatibleRuntimes] = js.undefined,
        Content: js.UndefOr[LayerVersionContentOutput] = js.undefined,
        CreatedDate: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        LayerArn: js.UndefOr[LayerArn] = js.undefined,
        LayerVersionArn: js.UndefOr[LayerVersionArn] = js.undefined,
        LicenseInfo: js.UndefOr[LicenseInfo] = js.undefined,
        Version: js.UndefOr[LayerVersionNumber] = js.undefined
    ): GetLayerVersionResponse = {
      val __obj = js.Dynamic.literal()
      CompatibleRuntimes.foreach(__v => __obj.updateDynamic("CompatibleRuntimes")(__v.asInstanceOf[js.Any]))
      Content.foreach(__v => __obj.updateDynamic("Content")(__v.asInstanceOf[js.Any]))
      CreatedDate.foreach(__v => __obj.updateDynamic("CreatedDate")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LayerArn.foreach(__v => __obj.updateDynamic("LayerArn")(__v.asInstanceOf[js.Any]))
      LayerVersionArn.foreach(__v => __obj.updateDynamic("LayerVersionArn")(__v.asInstanceOf[js.Any]))
      LicenseInfo.foreach(__v => __obj.updateDynamic("LicenseInfo")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLayerVersionResponse]
    }
  }

  @js.native
  trait GetPolicyRequest extends js.Object {
    var FunctionName: NamespacedFunctionName
    var Qualifier: js.UndefOr[Qualifier]
  }

  object GetPolicyRequest {
    @inline
    def apply(
        FunctionName: NamespacedFunctionName,
        Qualifier: js.UndefOr[Qualifier] = js.undefined
    ): GetPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "FunctionName" -> FunctionName.asInstanceOf[js.Any]
      )

      Qualifier.foreach(__v => __obj.updateDynamic("Qualifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPolicyRequest]
    }
  }

  @js.native
  trait GetPolicyResponse extends js.Object {
    var Policy: js.UndefOr[String]
    var RevisionId: js.UndefOr[String]
  }

  object GetPolicyResponse {
    @inline
    def apply(
        Policy: js.UndefOr[String] = js.undefined,
        RevisionId: js.UndefOr[String] = js.undefined
    ): GetPolicyResponse = {
      val __obj = js.Dynamic.literal()
      Policy.foreach(__v => __obj.updateDynamic("Policy")(__v.asInstanceOf[js.Any]))
      RevisionId.foreach(__v => __obj.updateDynamic("RevisionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPolicyResponse]
    }
  }

  @js.native
  trait GetProvisionedConcurrencyConfigRequest extends js.Object {
    var FunctionName: FunctionName
    var Qualifier: Qualifier
  }

  object GetProvisionedConcurrencyConfigRequest {
    @inline
    def apply(
        FunctionName: FunctionName,
        Qualifier: Qualifier
    ): GetProvisionedConcurrencyConfigRequest = {
      val __obj = js.Dynamic.literal(
        "FunctionName" -> FunctionName.asInstanceOf[js.Any],
        "Qualifier" -> Qualifier.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetProvisionedConcurrencyConfigRequest]
    }
  }

  @js.native
  trait GetProvisionedConcurrencyConfigResponse extends js.Object {
    var AllocatedProvisionedConcurrentExecutions: js.UndefOr[NonNegativeInteger]
    var AvailableProvisionedConcurrentExecutions: js.UndefOr[NonNegativeInteger]
    var LastModified: js.UndefOr[Timestamp]
    var RequestedProvisionedConcurrentExecutions: js.UndefOr[PositiveInteger]
    var Status: js.UndefOr[ProvisionedConcurrencyStatusEnum]
    var StatusReason: js.UndefOr[String]
  }

  object GetProvisionedConcurrencyConfigResponse {
    @inline
    def apply(
        AllocatedProvisionedConcurrentExecutions: js.UndefOr[NonNegativeInteger] = js.undefined,
        AvailableProvisionedConcurrentExecutions: js.UndefOr[NonNegativeInteger] = js.undefined,
        LastModified: js.UndefOr[Timestamp] = js.undefined,
        RequestedProvisionedConcurrentExecutions: js.UndefOr[PositiveInteger] = js.undefined,
        Status: js.UndefOr[ProvisionedConcurrencyStatusEnum] = js.undefined,
        StatusReason: js.UndefOr[String] = js.undefined
    ): GetProvisionedConcurrencyConfigResponse = {
      val __obj = js.Dynamic.literal()
      AllocatedProvisionedConcurrentExecutions.foreach(__v => __obj.updateDynamic("AllocatedProvisionedConcurrentExecutions")(__v.asInstanceOf[js.Any]))
      AvailableProvisionedConcurrentExecutions.foreach(__v => __obj.updateDynamic("AvailableProvisionedConcurrentExecutions")(__v.asInstanceOf[js.Any]))
      LastModified.foreach(__v => __obj.updateDynamic("LastModified")(__v.asInstanceOf[js.Any]))
      RequestedProvisionedConcurrentExecutions.foreach(__v => __obj.updateDynamic("RequestedProvisionedConcurrentExecutions")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusReason.foreach(__v => __obj.updateDynamic("StatusReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetProvisionedConcurrencyConfigResponse]
    }
  }

  /** Configuration values that override the container image Dockerfile settings. See [[https://docs.aws.amazon.com/lambda/latest/dg/images-create.html#images-parms|Container settings]].
    */
  @js.native
  trait ImageConfig extends js.Object {
    var Command: js.UndefOr[StringList]
    var EntryPoint: js.UndefOr[StringList]
    var WorkingDirectory: js.UndefOr[WorkingDirectory]
  }

  object ImageConfig {
    @inline
    def apply(
        Command: js.UndefOr[StringList] = js.undefined,
        EntryPoint: js.UndefOr[StringList] = js.undefined,
        WorkingDirectory: js.UndefOr[WorkingDirectory] = js.undefined
    ): ImageConfig = {
      val __obj = js.Dynamic.literal()
      Command.foreach(__v => __obj.updateDynamic("Command")(__v.asInstanceOf[js.Any]))
      EntryPoint.foreach(__v => __obj.updateDynamic("EntryPoint")(__v.asInstanceOf[js.Any]))
      WorkingDirectory.foreach(__v => __obj.updateDynamic("WorkingDirectory")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImageConfig]
    }
  }

  /** Error response to GetFunctionConfiguration.
    */
  @js.native
  trait ImageConfigError extends js.Object {
    var ErrorCode: js.UndefOr[String]
    var Message: js.UndefOr[SensitiveString]
  }

  object ImageConfigError {
    @inline
    def apply(
        ErrorCode: js.UndefOr[String] = js.undefined,
        Message: js.UndefOr[SensitiveString] = js.undefined
    ): ImageConfigError = {
      val __obj = js.Dynamic.literal()
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImageConfigError]
    }
  }

  /** Response to GetFunctionConfiguration request.
    */
  @js.native
  trait ImageConfigResponse extends js.Object {
    var Error: js.UndefOr[ImageConfigError]
    var ImageConfig: js.UndefOr[ImageConfig]
  }

  object ImageConfigResponse {
    @inline
    def apply(
        Error: js.UndefOr[ImageConfigError] = js.undefined,
        ImageConfig: js.UndefOr[ImageConfig] = js.undefined
    ): ImageConfigResponse = {
      val __obj = js.Dynamic.literal()
      Error.foreach(__v => __obj.updateDynamic("Error")(__v.asInstanceOf[js.Any]))
      ImageConfig.foreach(__v => __obj.updateDynamic("ImageConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImageConfigResponse]
    }
  }

  @js.native
  trait InvocationRequest extends js.Object {
    var FunctionName: NamespacedFunctionName
    var ClientContext: js.UndefOr[String]
    var InvocationType: js.UndefOr[InvocationType]
    var LogType: js.UndefOr[LogType]
    var Payload: js.UndefOr[Blob]
    var Qualifier: js.UndefOr[Qualifier]
  }

  object InvocationRequest {
    @inline
    def apply(
        FunctionName: NamespacedFunctionName,
        ClientContext: js.UndefOr[String] = js.undefined,
        InvocationType: js.UndefOr[InvocationType] = js.undefined,
        LogType: js.UndefOr[LogType] = js.undefined,
        Payload: js.UndefOr[Blob] = js.undefined,
        Qualifier: js.UndefOr[Qualifier] = js.undefined
    ): InvocationRequest = {
      val __obj = js.Dynamic.literal(
        "FunctionName" -> FunctionName.asInstanceOf[js.Any]
      )

      ClientContext.foreach(__v => __obj.updateDynamic("ClientContext")(__v.asInstanceOf[js.Any]))
      InvocationType.foreach(__v => __obj.updateDynamic("InvocationType")(__v.asInstanceOf[js.Any]))
      LogType.foreach(__v => __obj.updateDynamic("LogType")(__v.asInstanceOf[js.Any]))
      Payload.foreach(__v => __obj.updateDynamic("Payload")(__v.asInstanceOf[js.Any]))
      Qualifier.foreach(__v => __obj.updateDynamic("Qualifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InvocationRequest]
    }
  }

  @js.native
  trait InvocationResponse extends js.Object {
    var ExecutedVersion: js.UndefOr[Version]
    var FunctionError: js.UndefOr[String]
    var LogResult: js.UndefOr[String]
    var Payload: js.UndefOr[Blob]
    var StatusCode: js.UndefOr[Int]
  }

  object InvocationResponse {
    @inline
    def apply(
        ExecutedVersion: js.UndefOr[Version] = js.undefined,
        FunctionError: js.UndefOr[String] = js.undefined,
        LogResult: js.UndefOr[String] = js.undefined,
        Payload: js.UndefOr[Blob] = js.undefined,
        StatusCode: js.UndefOr[Int] = js.undefined
    ): InvocationResponse = {
      val __obj = js.Dynamic.literal()
      ExecutedVersion.foreach(__v => __obj.updateDynamic("ExecutedVersion")(__v.asInstanceOf[js.Any]))
      FunctionError.foreach(__v => __obj.updateDynamic("FunctionError")(__v.asInstanceOf[js.Any]))
      LogResult.foreach(__v => __obj.updateDynamic("LogResult")(__v.asInstanceOf[js.Any]))
      Payload.foreach(__v => __obj.updateDynamic("Payload")(__v.asInstanceOf[js.Any]))
      StatusCode.foreach(__v => __obj.updateDynamic("StatusCode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InvocationResponse]
    }
  }

  @js.native
  sealed trait InvocationType extends js.Any
  object InvocationType {
    val Event = "Event".asInstanceOf[InvocationType]
    val RequestResponse = "RequestResponse".asInstanceOf[InvocationType]
    val DryRun = "DryRun".asInstanceOf[InvocationType]

    @inline def values = js.Array(Event, RequestResponse, DryRun)
  }

  @deprecated("Deprecated in AWS SDK", "forever")
  @js.native
  trait InvokeAsyncRequest extends js.Object {
    var FunctionName: NamespacedFunctionName
    var InvokeArgs: BlobStream
  }

  object InvokeAsyncRequest {
    @inline
    def apply(
        FunctionName: NamespacedFunctionName,
        InvokeArgs: BlobStream
    ): InvokeAsyncRequest = {
      val __obj = js.Dynamic.literal(
        "FunctionName" -> FunctionName.asInstanceOf[js.Any],
        "InvokeArgs" -> InvokeArgs.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[InvokeAsyncRequest]
    }
  }

  /** A success response (<code>202 Accepted</code>) indicates that the request is queued for invocation.
    */
  @deprecated("Deprecated in AWS SDK", "forever")
  @js.native
  trait InvokeAsyncResponse extends js.Object {
    var Status: js.UndefOr[HttpStatus]
  }

  object InvokeAsyncResponse {
    @inline
    def apply(
        Status: js.UndefOr[HttpStatus] = js.undefined
    ): InvokeAsyncResponse = {
      val __obj = js.Dynamic.literal()
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InvokeAsyncResponse]
    }
  }

  @js.native
  sealed trait LastUpdateStatus extends js.Any
  object LastUpdateStatus {
    val Successful = "Successful".asInstanceOf[LastUpdateStatus]
    val Failed = "Failed".asInstanceOf[LastUpdateStatus]
    val InProgress = "InProgress".asInstanceOf[LastUpdateStatus]

    @inline def values = js.Array(Successful, Failed, InProgress)
  }

  @js.native
  sealed trait LastUpdateStatusReasonCode extends js.Any
  object LastUpdateStatusReasonCode {
    val EniLimitExceeded = "EniLimitExceeded".asInstanceOf[LastUpdateStatusReasonCode]
    val InsufficientRolePermissions = "InsufficientRolePermissions".asInstanceOf[LastUpdateStatusReasonCode]
    val InvalidConfiguration = "InvalidConfiguration".asInstanceOf[LastUpdateStatusReasonCode]
    val InternalError = "InternalError".asInstanceOf[LastUpdateStatusReasonCode]
    val SubnetOutOfIPAddresses = "SubnetOutOfIPAddresses".asInstanceOf[LastUpdateStatusReasonCode]
    val InvalidSubnet = "InvalidSubnet".asInstanceOf[LastUpdateStatusReasonCode]
    val InvalidSecurityGroup = "InvalidSecurityGroup".asInstanceOf[LastUpdateStatusReasonCode]
    val ImageDeleted = "ImageDeleted".asInstanceOf[LastUpdateStatusReasonCode]
    val ImageAccessDenied = "ImageAccessDenied".asInstanceOf[LastUpdateStatusReasonCode]
    val InvalidImage = "InvalidImage".asInstanceOf[LastUpdateStatusReasonCode]

    @inline def values = js.Array(
      EniLimitExceeded,
      InsufficientRolePermissions,
      InvalidConfiguration,
      InternalError,
      SubnetOutOfIPAddresses,
      InvalidSubnet,
      InvalidSecurityGroup,
      ImageDeleted,
      ImageAccessDenied,
      InvalidImage
    )
  }

  /** An [[https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html|AWS Lambda layer]].
    */
  @js.native
  trait Layer extends js.Object {
    var Arn: js.UndefOr[LayerVersionArn]
    var CodeSize: js.UndefOr[Double]
    var SigningJobArn: js.UndefOr[Arn]
    var SigningProfileVersionArn: js.UndefOr[Arn]
  }

  object Layer {
    @inline
    def apply(
        Arn: js.UndefOr[LayerVersionArn] = js.undefined,
        CodeSize: js.UndefOr[Double] = js.undefined,
        SigningJobArn: js.UndefOr[Arn] = js.undefined,
        SigningProfileVersionArn: js.UndefOr[Arn] = js.undefined
    ): Layer = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CodeSize.foreach(__v => __obj.updateDynamic("CodeSize")(__v.asInstanceOf[js.Any]))
      SigningJobArn.foreach(__v => __obj.updateDynamic("SigningJobArn")(__v.asInstanceOf[js.Any]))
      SigningProfileVersionArn.foreach(__v => __obj.updateDynamic("SigningProfileVersionArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Layer]
    }
  }

  /** A ZIP archive that contains the contents of an [[https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html|AWS Lambda layer]]. You can specify either an Amazon S3 location, or upload a layer archive directly.
    */
  @js.native
  trait LayerVersionContentInput extends js.Object {
    var S3Bucket: js.UndefOr[S3Bucket]
    var S3Key: js.UndefOr[S3Key]
    var S3ObjectVersion: js.UndefOr[S3ObjectVersion]
    var ZipFile: js.UndefOr[Blob]
  }

  object LayerVersionContentInput {
    @inline
    def apply(
        S3Bucket: js.UndefOr[S3Bucket] = js.undefined,
        S3Key: js.UndefOr[S3Key] = js.undefined,
        S3ObjectVersion: js.UndefOr[S3ObjectVersion] = js.undefined,
        ZipFile: js.UndefOr[Blob] = js.undefined
    ): LayerVersionContentInput = {
      val __obj = js.Dynamic.literal()
      S3Bucket.foreach(__v => __obj.updateDynamic("S3Bucket")(__v.asInstanceOf[js.Any]))
      S3Key.foreach(__v => __obj.updateDynamic("S3Key")(__v.asInstanceOf[js.Any]))
      S3ObjectVersion.foreach(__v => __obj.updateDynamic("S3ObjectVersion")(__v.asInstanceOf[js.Any]))
      ZipFile.foreach(__v => __obj.updateDynamic("ZipFile")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LayerVersionContentInput]
    }
  }

  /** Details about a version of an [[https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html|AWS Lambda layer]].
    */
  @js.native
  trait LayerVersionContentOutput extends js.Object {
    var CodeSha256: js.UndefOr[String]
    var CodeSize: js.UndefOr[Double]
    var Location: js.UndefOr[String]
    var SigningJobArn: js.UndefOr[String]
    var SigningProfileVersionArn: js.UndefOr[String]
  }

  object LayerVersionContentOutput {
    @inline
    def apply(
        CodeSha256: js.UndefOr[String] = js.undefined,
        CodeSize: js.UndefOr[Double] = js.undefined,
        Location: js.UndefOr[String] = js.undefined,
        SigningJobArn: js.UndefOr[String] = js.undefined,
        SigningProfileVersionArn: js.UndefOr[String] = js.undefined
    ): LayerVersionContentOutput = {
      val __obj = js.Dynamic.literal()
      CodeSha256.foreach(__v => __obj.updateDynamic("CodeSha256")(__v.asInstanceOf[js.Any]))
      CodeSize.foreach(__v => __obj.updateDynamic("CodeSize")(__v.asInstanceOf[js.Any]))
      Location.foreach(__v => __obj.updateDynamic("Location")(__v.asInstanceOf[js.Any]))
      SigningJobArn.foreach(__v => __obj.updateDynamic("SigningJobArn")(__v.asInstanceOf[js.Any]))
      SigningProfileVersionArn.foreach(__v => __obj.updateDynamic("SigningProfileVersionArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LayerVersionContentOutput]
    }
  }

  /** Details about a version of an [[https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html|AWS Lambda layer]].
    */
  @js.native
  trait LayerVersionsListItem extends js.Object {
    var CompatibleRuntimes: js.UndefOr[CompatibleRuntimes]
    var CreatedDate: js.UndefOr[Timestamp]
    var Description: js.UndefOr[Description]
    var LayerVersionArn: js.UndefOr[LayerVersionArn]
    var LicenseInfo: js.UndefOr[LicenseInfo]
    var Version: js.UndefOr[LayerVersionNumber]
  }

  object LayerVersionsListItem {
    @inline
    def apply(
        CompatibleRuntimes: js.UndefOr[CompatibleRuntimes] = js.undefined,
        CreatedDate: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        LayerVersionArn: js.UndefOr[LayerVersionArn] = js.undefined,
        LicenseInfo: js.UndefOr[LicenseInfo] = js.undefined,
        Version: js.UndefOr[LayerVersionNumber] = js.undefined
    ): LayerVersionsListItem = {
      val __obj = js.Dynamic.literal()
      CompatibleRuntimes.foreach(__v => __obj.updateDynamic("CompatibleRuntimes")(__v.asInstanceOf[js.Any]))
      CreatedDate.foreach(__v => __obj.updateDynamic("CreatedDate")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LayerVersionArn.foreach(__v => __obj.updateDynamic("LayerVersionArn")(__v.asInstanceOf[js.Any]))
      LicenseInfo.foreach(__v => __obj.updateDynamic("LicenseInfo")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LayerVersionsListItem]
    }
  }

  /** Details about an [[https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html|AWS Lambda layer]].
    */
  @js.native
  trait LayersListItem extends js.Object {
    var LatestMatchingVersion: js.UndefOr[LayerVersionsListItem]
    var LayerArn: js.UndefOr[LayerArn]
    var LayerName: js.UndefOr[LayerName]
  }

  object LayersListItem {
    @inline
    def apply(
        LatestMatchingVersion: js.UndefOr[LayerVersionsListItem] = js.undefined,
        LayerArn: js.UndefOr[LayerArn] = js.undefined,
        LayerName: js.UndefOr[LayerName] = js.undefined
    ): LayersListItem = {
      val __obj = js.Dynamic.literal()
      LatestMatchingVersion.foreach(__v => __obj.updateDynamic("LatestMatchingVersion")(__v.asInstanceOf[js.Any]))
      LayerArn.foreach(__v => __obj.updateDynamic("LayerArn")(__v.asInstanceOf[js.Any]))
      LayerName.foreach(__v => __obj.updateDynamic("LayerName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LayersListItem]
    }
  }

  @js.native
  trait ListAliasesRequest extends js.Object {
    var FunctionName: FunctionName
    var FunctionVersion: js.UndefOr[Version]
    var Marker: js.UndefOr[String]
    var MaxItems: js.UndefOr[MaxListItems]
  }

  object ListAliasesRequest {
    @inline
    def apply(
        FunctionName: FunctionName,
        FunctionVersion: js.UndefOr[Version] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxItems: js.UndefOr[MaxListItems] = js.undefined
    ): ListAliasesRequest = {
      val __obj = js.Dynamic.literal(
        "FunctionName" -> FunctionName.asInstanceOf[js.Any]
      )

      FunctionVersion.foreach(__v => __obj.updateDynamic("FunctionVersion")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.updateDynamic("MaxItems")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAliasesRequest]
    }
  }

  @js.native
  trait ListAliasesResponse extends js.Object {
    var Aliases: js.UndefOr[AliasList]
    var NextMarker: js.UndefOr[String]
  }

  object ListAliasesResponse {
    @inline
    def apply(
        Aliases: js.UndefOr[AliasList] = js.undefined,
        NextMarker: js.UndefOr[String] = js.undefined
    ): ListAliasesResponse = {
      val __obj = js.Dynamic.literal()
      Aliases.foreach(__v => __obj.updateDynamic("Aliases")(__v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAliasesResponse]
    }
  }

  @js.native
  trait ListCodeSigningConfigsRequest extends js.Object {
    var Marker: js.UndefOr[String]
    var MaxItems: js.UndefOr[MaxListItems]
  }

  object ListCodeSigningConfigsRequest {
    @inline
    def apply(
        Marker: js.UndefOr[String] = js.undefined,
        MaxItems: js.UndefOr[MaxListItems] = js.undefined
    ): ListCodeSigningConfigsRequest = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.updateDynamic("MaxItems")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCodeSigningConfigsRequest]
    }
  }

  @js.native
  trait ListCodeSigningConfigsResponse extends js.Object {
    var CodeSigningConfigs: js.UndefOr[CodeSigningConfigList]
    var NextMarker: js.UndefOr[String]
  }

  object ListCodeSigningConfigsResponse {
    @inline
    def apply(
        CodeSigningConfigs: js.UndefOr[CodeSigningConfigList] = js.undefined,
        NextMarker: js.UndefOr[String] = js.undefined
    ): ListCodeSigningConfigsResponse = {
      val __obj = js.Dynamic.literal()
      CodeSigningConfigs.foreach(__v => __obj.updateDynamic("CodeSigningConfigs")(__v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCodeSigningConfigsResponse]
    }
  }

  @js.native
  trait ListEventSourceMappingsRequest extends js.Object {
    var EventSourceArn: js.UndefOr[Arn]
    var FunctionName: js.UndefOr[FunctionName]
    var Marker: js.UndefOr[String]
    var MaxItems: js.UndefOr[MaxListItems]
  }

  object ListEventSourceMappingsRequest {
    @inline
    def apply(
        EventSourceArn: js.UndefOr[Arn] = js.undefined,
        FunctionName: js.UndefOr[FunctionName] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxItems: js.UndefOr[MaxListItems] = js.undefined
    ): ListEventSourceMappingsRequest = {
      val __obj = js.Dynamic.literal()
      EventSourceArn.foreach(__v => __obj.updateDynamic("EventSourceArn")(__v.asInstanceOf[js.Any]))
      FunctionName.foreach(__v => __obj.updateDynamic("FunctionName")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.updateDynamic("MaxItems")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEventSourceMappingsRequest]
    }
  }

  @js.native
  trait ListEventSourceMappingsResponse extends js.Object {
    var EventSourceMappings: js.UndefOr[EventSourceMappingsList]
    var NextMarker: js.UndefOr[String]
  }

  object ListEventSourceMappingsResponse {
    @inline
    def apply(
        EventSourceMappings: js.UndefOr[EventSourceMappingsList] = js.undefined,
        NextMarker: js.UndefOr[String] = js.undefined
    ): ListEventSourceMappingsResponse = {
      val __obj = js.Dynamic.literal()
      EventSourceMappings.foreach(__v => __obj.updateDynamic("EventSourceMappings")(__v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEventSourceMappingsResponse]
    }
  }

  @js.native
  trait ListFunctionEventInvokeConfigsRequest extends js.Object {
    var FunctionName: FunctionName
    var Marker: js.UndefOr[String]
    var MaxItems: js.UndefOr[MaxFunctionEventInvokeConfigListItems]
  }

  object ListFunctionEventInvokeConfigsRequest {
    @inline
    def apply(
        FunctionName: FunctionName,
        Marker: js.UndefOr[String] = js.undefined,
        MaxItems: js.UndefOr[MaxFunctionEventInvokeConfigListItems] = js.undefined
    ): ListFunctionEventInvokeConfigsRequest = {
      val __obj = js.Dynamic.literal(
        "FunctionName" -> FunctionName.asInstanceOf[js.Any]
      )

      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.updateDynamic("MaxItems")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFunctionEventInvokeConfigsRequest]
    }
  }

  @js.native
  trait ListFunctionEventInvokeConfigsResponse extends js.Object {
    var FunctionEventInvokeConfigs: js.UndefOr[FunctionEventInvokeConfigList]
    var NextMarker: js.UndefOr[String]
  }

  object ListFunctionEventInvokeConfigsResponse {
    @inline
    def apply(
        FunctionEventInvokeConfigs: js.UndefOr[FunctionEventInvokeConfigList] = js.undefined,
        NextMarker: js.UndefOr[String] = js.undefined
    ): ListFunctionEventInvokeConfigsResponse = {
      val __obj = js.Dynamic.literal()
      FunctionEventInvokeConfigs.foreach(__v => __obj.updateDynamic("FunctionEventInvokeConfigs")(__v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFunctionEventInvokeConfigsResponse]
    }
  }

  @js.native
  trait ListFunctionsByCodeSigningConfigRequest extends js.Object {
    var CodeSigningConfigArn: CodeSigningConfigArn
    var Marker: js.UndefOr[String]
    var MaxItems: js.UndefOr[MaxListItems]
  }

  object ListFunctionsByCodeSigningConfigRequest {
    @inline
    def apply(
        CodeSigningConfigArn: CodeSigningConfigArn,
        Marker: js.UndefOr[String] = js.undefined,
        MaxItems: js.UndefOr[MaxListItems] = js.undefined
    ): ListFunctionsByCodeSigningConfigRequest = {
      val __obj = js.Dynamic.literal(
        "CodeSigningConfigArn" -> CodeSigningConfigArn.asInstanceOf[js.Any]
      )

      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.updateDynamic("MaxItems")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFunctionsByCodeSigningConfigRequest]
    }
  }

  @js.native
  trait ListFunctionsByCodeSigningConfigResponse extends js.Object {
    var FunctionArns: js.UndefOr[FunctionArnList]
    var NextMarker: js.UndefOr[String]
  }

  object ListFunctionsByCodeSigningConfigResponse {
    @inline
    def apply(
        FunctionArns: js.UndefOr[FunctionArnList] = js.undefined,
        NextMarker: js.UndefOr[String] = js.undefined
    ): ListFunctionsByCodeSigningConfigResponse = {
      val __obj = js.Dynamic.literal()
      FunctionArns.foreach(__v => __obj.updateDynamic("FunctionArns")(__v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFunctionsByCodeSigningConfigResponse]
    }
  }

  @js.native
  trait ListFunctionsRequest extends js.Object {
    var FunctionVersion: js.UndefOr[FunctionVersion]
    var Marker: js.UndefOr[String]
    var MasterRegion: js.UndefOr[MasterRegion]
    var MaxItems: js.UndefOr[MaxListItems]
  }

  object ListFunctionsRequest {
    @inline
    def apply(
        FunctionVersion: js.UndefOr[FunctionVersion] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MasterRegion: js.UndefOr[MasterRegion] = js.undefined,
        MaxItems: js.UndefOr[MaxListItems] = js.undefined
    ): ListFunctionsRequest = {
      val __obj = js.Dynamic.literal()
      FunctionVersion.foreach(__v => __obj.updateDynamic("FunctionVersion")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MasterRegion.foreach(__v => __obj.updateDynamic("MasterRegion")(__v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.updateDynamic("MaxItems")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFunctionsRequest]
    }
  }

  /** A list of Lambda functions.
    */
  @js.native
  trait ListFunctionsResponse extends js.Object {
    var Functions: js.UndefOr[FunctionList]
    var NextMarker: js.UndefOr[String]
  }

  object ListFunctionsResponse {
    @inline
    def apply(
        Functions: js.UndefOr[FunctionList] = js.undefined,
        NextMarker: js.UndefOr[String] = js.undefined
    ): ListFunctionsResponse = {
      val __obj = js.Dynamic.literal()
      Functions.foreach(__v => __obj.updateDynamic("Functions")(__v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFunctionsResponse]
    }
  }

  @js.native
  trait ListLayerVersionsRequest extends js.Object {
    var LayerName: LayerName
    var CompatibleRuntime: js.UndefOr[Runtime]
    var Marker: js.UndefOr[String]
    var MaxItems: js.UndefOr[MaxLayerListItems]
  }

  object ListLayerVersionsRequest {
    @inline
    def apply(
        LayerName: LayerName,
        CompatibleRuntime: js.UndefOr[Runtime] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxItems: js.UndefOr[MaxLayerListItems] = js.undefined
    ): ListLayerVersionsRequest = {
      val __obj = js.Dynamic.literal(
        "LayerName" -> LayerName.asInstanceOf[js.Any]
      )

      CompatibleRuntime.foreach(__v => __obj.updateDynamic("CompatibleRuntime")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.updateDynamic("MaxItems")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLayerVersionsRequest]
    }
  }

  @js.native
  trait ListLayerVersionsResponse extends js.Object {
    var LayerVersions: js.UndefOr[LayerVersionsList]
    var NextMarker: js.UndefOr[String]
  }

  object ListLayerVersionsResponse {
    @inline
    def apply(
        LayerVersions: js.UndefOr[LayerVersionsList] = js.undefined,
        NextMarker: js.UndefOr[String] = js.undefined
    ): ListLayerVersionsResponse = {
      val __obj = js.Dynamic.literal()
      LayerVersions.foreach(__v => __obj.updateDynamic("LayerVersions")(__v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLayerVersionsResponse]
    }
  }

  @js.native
  trait ListLayersRequest extends js.Object {
    var CompatibleRuntime: js.UndefOr[Runtime]
    var Marker: js.UndefOr[String]
    var MaxItems: js.UndefOr[MaxLayerListItems]
  }

  object ListLayersRequest {
    @inline
    def apply(
        CompatibleRuntime: js.UndefOr[Runtime] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxItems: js.UndefOr[MaxLayerListItems] = js.undefined
    ): ListLayersRequest = {
      val __obj = js.Dynamic.literal()
      CompatibleRuntime.foreach(__v => __obj.updateDynamic("CompatibleRuntime")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.updateDynamic("MaxItems")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLayersRequest]
    }
  }

  @js.native
  trait ListLayersResponse extends js.Object {
    var Layers: js.UndefOr[LayersList]
    var NextMarker: js.UndefOr[String]
  }

  object ListLayersResponse {
    @inline
    def apply(
        Layers: js.UndefOr[LayersList] = js.undefined,
        NextMarker: js.UndefOr[String] = js.undefined
    ): ListLayersResponse = {
      val __obj = js.Dynamic.literal()
      Layers.foreach(__v => __obj.updateDynamic("Layers")(__v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLayersResponse]
    }
  }

  @js.native
  trait ListProvisionedConcurrencyConfigsRequest extends js.Object {
    var FunctionName: FunctionName
    var Marker: js.UndefOr[String]
    var MaxItems: js.UndefOr[MaxProvisionedConcurrencyConfigListItems]
  }

  object ListProvisionedConcurrencyConfigsRequest {
    @inline
    def apply(
        FunctionName: FunctionName,
        Marker: js.UndefOr[String] = js.undefined,
        MaxItems: js.UndefOr[MaxProvisionedConcurrencyConfigListItems] = js.undefined
    ): ListProvisionedConcurrencyConfigsRequest = {
      val __obj = js.Dynamic.literal(
        "FunctionName" -> FunctionName.asInstanceOf[js.Any]
      )

      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.updateDynamic("MaxItems")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProvisionedConcurrencyConfigsRequest]
    }
  }

  @js.native
  trait ListProvisionedConcurrencyConfigsResponse extends js.Object {
    var NextMarker: js.UndefOr[String]
    var ProvisionedConcurrencyConfigs: js.UndefOr[ProvisionedConcurrencyConfigList]
  }

  object ListProvisionedConcurrencyConfigsResponse {
    @inline
    def apply(
        NextMarker: js.UndefOr[String] = js.undefined,
        ProvisionedConcurrencyConfigs: js.UndefOr[ProvisionedConcurrencyConfigList] = js.undefined
    ): ListProvisionedConcurrencyConfigsResponse = {
      val __obj = js.Dynamic.literal()
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      ProvisionedConcurrencyConfigs.foreach(__v => __obj.updateDynamic("ProvisionedConcurrencyConfigs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProvisionedConcurrencyConfigsResponse]
    }
  }

  @js.native
  trait ListTagsRequest extends js.Object {
    var Resource: FunctionArn
  }

  object ListTagsRequest {
    @inline
    def apply(
        Resource: FunctionArn
    ): ListTagsRequest = {
      val __obj = js.Dynamic.literal(
        "Resource" -> Resource.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsRequest]
    }
  }

  @js.native
  trait ListTagsResponse extends js.Object {
    var Tags: js.UndefOr[Tags]
  }

  object ListTagsResponse {
    @inline
    def apply(
        Tags: js.UndefOr[Tags] = js.undefined
    ): ListTagsResponse = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsResponse]
    }
  }

  @js.native
  trait ListVersionsByFunctionRequest extends js.Object {
    var FunctionName: NamespacedFunctionName
    var Marker: js.UndefOr[String]
    var MaxItems: js.UndefOr[MaxListItems]
  }

  object ListVersionsByFunctionRequest {
    @inline
    def apply(
        FunctionName: NamespacedFunctionName,
        Marker: js.UndefOr[String] = js.undefined,
        MaxItems: js.UndefOr[MaxListItems] = js.undefined
    ): ListVersionsByFunctionRequest = {
      val __obj = js.Dynamic.literal(
        "FunctionName" -> FunctionName.asInstanceOf[js.Any]
      )

      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.updateDynamic("MaxItems")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVersionsByFunctionRequest]
    }
  }

  @js.native
  trait ListVersionsByFunctionResponse extends js.Object {
    var NextMarker: js.UndefOr[String]
    var Versions: js.UndefOr[FunctionList]
  }

  object ListVersionsByFunctionResponse {
    @inline
    def apply(
        NextMarker: js.UndefOr[String] = js.undefined,
        Versions: js.UndefOr[FunctionList] = js.undefined
    ): ListVersionsByFunctionResponse = {
      val __obj = js.Dynamic.literal()
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      Versions.foreach(__v => __obj.updateDynamic("Versions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVersionsByFunctionResponse]
    }
  }

  @js.native
  sealed trait LogType extends js.Any
  object LogType {
    val None = "None".asInstanceOf[LogType]
    val Tail = "Tail".asInstanceOf[LogType]

    @inline def values = js.Array(None, Tail)
  }

  /** A destination for events that failed processing.
    */
  @js.native
  trait OnFailure extends js.Object {
    var Destination: js.UndefOr[DestinationArn]
  }

  object OnFailure {
    @inline
    def apply(
        Destination: js.UndefOr[DestinationArn] = js.undefined
    ): OnFailure = {
      val __obj = js.Dynamic.literal()
      Destination.foreach(__v => __obj.updateDynamic("Destination")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OnFailure]
    }
  }

  /** A destination for events that were processed successfully.
    */
  @js.native
  trait OnSuccess extends js.Object {
    var Destination: js.UndefOr[DestinationArn]
  }

  object OnSuccess {
    @inline
    def apply(
        Destination: js.UndefOr[DestinationArn] = js.undefined
    ): OnSuccess = {
      val __obj = js.Dynamic.literal()
      Destination.foreach(__v => __obj.updateDynamic("Destination")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OnSuccess]
    }
  }

  @js.native
  sealed trait PackageType extends js.Any
  object PackageType {
    val Zip = "Zip".asInstanceOf[PackageType]
    val Image = "Image".asInstanceOf[PackageType]

    @inline def values = js.Array(Zip, Image)
  }

  /** Details about the provisioned concurrency configuration for a function alias or version.
    */
  @js.native
  trait ProvisionedConcurrencyConfigListItem extends js.Object {
    var AllocatedProvisionedConcurrentExecutions: js.UndefOr[NonNegativeInteger]
    var AvailableProvisionedConcurrentExecutions: js.UndefOr[NonNegativeInteger]
    var FunctionArn: js.UndefOr[FunctionArn]
    var LastModified: js.UndefOr[Timestamp]
    var RequestedProvisionedConcurrentExecutions: js.UndefOr[PositiveInteger]
    var Status: js.UndefOr[ProvisionedConcurrencyStatusEnum]
    var StatusReason: js.UndefOr[String]
  }

  object ProvisionedConcurrencyConfigListItem {
    @inline
    def apply(
        AllocatedProvisionedConcurrentExecutions: js.UndefOr[NonNegativeInteger] = js.undefined,
        AvailableProvisionedConcurrentExecutions: js.UndefOr[NonNegativeInteger] = js.undefined,
        FunctionArn: js.UndefOr[FunctionArn] = js.undefined,
        LastModified: js.UndefOr[Timestamp] = js.undefined,
        RequestedProvisionedConcurrentExecutions: js.UndefOr[PositiveInteger] = js.undefined,
        Status: js.UndefOr[ProvisionedConcurrencyStatusEnum] = js.undefined,
        StatusReason: js.UndefOr[String] = js.undefined
    ): ProvisionedConcurrencyConfigListItem = {
      val __obj = js.Dynamic.literal()
      AllocatedProvisionedConcurrentExecutions.foreach(__v => __obj.updateDynamic("AllocatedProvisionedConcurrentExecutions")(__v.asInstanceOf[js.Any]))
      AvailableProvisionedConcurrentExecutions.foreach(__v => __obj.updateDynamic("AvailableProvisionedConcurrentExecutions")(__v.asInstanceOf[js.Any]))
      FunctionArn.foreach(__v => __obj.updateDynamic("FunctionArn")(__v.asInstanceOf[js.Any]))
      LastModified.foreach(__v => __obj.updateDynamic("LastModified")(__v.asInstanceOf[js.Any]))
      RequestedProvisionedConcurrentExecutions.foreach(__v => __obj.updateDynamic("RequestedProvisionedConcurrentExecutions")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusReason.foreach(__v => __obj.updateDynamic("StatusReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProvisionedConcurrencyConfigListItem]
    }
  }

  @js.native
  sealed trait ProvisionedConcurrencyStatusEnum extends js.Any
  object ProvisionedConcurrencyStatusEnum {
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[ProvisionedConcurrencyStatusEnum]
    val READY = "READY".asInstanceOf[ProvisionedConcurrencyStatusEnum]
    val FAILED = "FAILED".asInstanceOf[ProvisionedConcurrencyStatusEnum]

    @inline def values = js.Array(IN_PROGRESS, READY, FAILED)
  }

  @js.native
  trait PublishLayerVersionRequest extends js.Object {
    var Content: LayerVersionContentInput
    var LayerName: LayerName
    var CompatibleRuntimes: js.UndefOr[CompatibleRuntimes]
    var Description: js.UndefOr[Description]
    var LicenseInfo: js.UndefOr[LicenseInfo]
  }

  object PublishLayerVersionRequest {
    @inline
    def apply(
        Content: LayerVersionContentInput,
        LayerName: LayerName,
        CompatibleRuntimes: js.UndefOr[CompatibleRuntimes] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        LicenseInfo: js.UndefOr[LicenseInfo] = js.undefined
    ): PublishLayerVersionRequest = {
      val __obj = js.Dynamic.literal(
        "Content" -> Content.asInstanceOf[js.Any],
        "LayerName" -> LayerName.asInstanceOf[js.Any]
      )

      CompatibleRuntimes.foreach(__v => __obj.updateDynamic("CompatibleRuntimes")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LicenseInfo.foreach(__v => __obj.updateDynamic("LicenseInfo")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PublishLayerVersionRequest]
    }
  }

  @js.native
  trait PublishLayerVersionResponse extends js.Object {
    var CompatibleRuntimes: js.UndefOr[CompatibleRuntimes]
    var Content: js.UndefOr[LayerVersionContentOutput]
    var CreatedDate: js.UndefOr[Timestamp]
    var Description: js.UndefOr[Description]
    var LayerArn: js.UndefOr[LayerArn]
    var LayerVersionArn: js.UndefOr[LayerVersionArn]
    var LicenseInfo: js.UndefOr[LicenseInfo]
    var Version: js.UndefOr[LayerVersionNumber]
  }

  object PublishLayerVersionResponse {
    @inline
    def apply(
        CompatibleRuntimes: js.UndefOr[CompatibleRuntimes] = js.undefined,
        Content: js.UndefOr[LayerVersionContentOutput] = js.undefined,
        CreatedDate: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        LayerArn: js.UndefOr[LayerArn] = js.undefined,
        LayerVersionArn: js.UndefOr[LayerVersionArn] = js.undefined,
        LicenseInfo: js.UndefOr[LicenseInfo] = js.undefined,
        Version: js.UndefOr[LayerVersionNumber] = js.undefined
    ): PublishLayerVersionResponse = {
      val __obj = js.Dynamic.literal()
      CompatibleRuntimes.foreach(__v => __obj.updateDynamic("CompatibleRuntimes")(__v.asInstanceOf[js.Any]))
      Content.foreach(__v => __obj.updateDynamic("Content")(__v.asInstanceOf[js.Any]))
      CreatedDate.foreach(__v => __obj.updateDynamic("CreatedDate")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LayerArn.foreach(__v => __obj.updateDynamic("LayerArn")(__v.asInstanceOf[js.Any]))
      LayerVersionArn.foreach(__v => __obj.updateDynamic("LayerVersionArn")(__v.asInstanceOf[js.Any]))
      LicenseInfo.foreach(__v => __obj.updateDynamic("LicenseInfo")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PublishLayerVersionResponse]
    }
  }

  @js.native
  trait PublishVersionRequest extends js.Object {
    var FunctionName: FunctionName
    var CodeSha256: js.UndefOr[String]
    var Description: js.UndefOr[Description]
    var RevisionId: js.UndefOr[String]
  }

  object PublishVersionRequest {
    @inline
    def apply(
        FunctionName: FunctionName,
        CodeSha256: js.UndefOr[String] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        RevisionId: js.UndefOr[String] = js.undefined
    ): PublishVersionRequest = {
      val __obj = js.Dynamic.literal(
        "FunctionName" -> FunctionName.asInstanceOf[js.Any]
      )

      CodeSha256.foreach(__v => __obj.updateDynamic("CodeSha256")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      RevisionId.foreach(__v => __obj.updateDynamic("RevisionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PublishVersionRequest]
    }
  }

  @js.native
  trait PutFunctionCodeSigningConfigRequest extends js.Object {
    var CodeSigningConfigArn: CodeSigningConfigArn
    var FunctionName: FunctionName
  }

  object PutFunctionCodeSigningConfigRequest {
    @inline
    def apply(
        CodeSigningConfigArn: CodeSigningConfigArn,
        FunctionName: FunctionName
    ): PutFunctionCodeSigningConfigRequest = {
      val __obj = js.Dynamic.literal(
        "CodeSigningConfigArn" -> CodeSigningConfigArn.asInstanceOf[js.Any],
        "FunctionName" -> FunctionName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutFunctionCodeSigningConfigRequest]
    }
  }

  @js.native
  trait PutFunctionCodeSigningConfigResponse extends js.Object {
    var CodeSigningConfigArn: CodeSigningConfigArn
    var FunctionName: FunctionName
  }

  object PutFunctionCodeSigningConfigResponse {
    @inline
    def apply(
        CodeSigningConfigArn: CodeSigningConfigArn,
        FunctionName: FunctionName
    ): PutFunctionCodeSigningConfigResponse = {
      val __obj = js.Dynamic.literal(
        "CodeSigningConfigArn" -> CodeSigningConfigArn.asInstanceOf[js.Any],
        "FunctionName" -> FunctionName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutFunctionCodeSigningConfigResponse]
    }
  }

  @js.native
  trait PutFunctionConcurrencyRequest extends js.Object {
    var FunctionName: FunctionName
    var ReservedConcurrentExecutions: ReservedConcurrentExecutions
  }

  object PutFunctionConcurrencyRequest {
    @inline
    def apply(
        FunctionName: FunctionName,
        ReservedConcurrentExecutions: ReservedConcurrentExecutions
    ): PutFunctionConcurrencyRequest = {
      val __obj = js.Dynamic.literal(
        "FunctionName" -> FunctionName.asInstanceOf[js.Any],
        "ReservedConcurrentExecutions" -> ReservedConcurrentExecutions.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutFunctionConcurrencyRequest]
    }
  }

  @js.native
  trait PutFunctionEventInvokeConfigRequest extends js.Object {
    var FunctionName: FunctionName
    var DestinationConfig: js.UndefOr[DestinationConfig]
    var MaximumEventAgeInSeconds: js.UndefOr[MaximumEventAgeInSeconds]
    var MaximumRetryAttempts: js.UndefOr[MaximumRetryAttempts]
    var Qualifier: js.UndefOr[Qualifier]
  }

  object PutFunctionEventInvokeConfigRequest {
    @inline
    def apply(
        FunctionName: FunctionName,
        DestinationConfig: js.UndefOr[DestinationConfig] = js.undefined,
        MaximumEventAgeInSeconds: js.UndefOr[MaximumEventAgeInSeconds] = js.undefined,
        MaximumRetryAttempts: js.UndefOr[MaximumRetryAttempts] = js.undefined,
        Qualifier: js.UndefOr[Qualifier] = js.undefined
    ): PutFunctionEventInvokeConfigRequest = {
      val __obj = js.Dynamic.literal(
        "FunctionName" -> FunctionName.asInstanceOf[js.Any]
      )

      DestinationConfig.foreach(__v => __obj.updateDynamic("DestinationConfig")(__v.asInstanceOf[js.Any]))
      MaximumEventAgeInSeconds.foreach(__v => __obj.updateDynamic("MaximumEventAgeInSeconds")(__v.asInstanceOf[js.Any]))
      MaximumRetryAttempts.foreach(__v => __obj.updateDynamic("MaximumRetryAttempts")(__v.asInstanceOf[js.Any]))
      Qualifier.foreach(__v => __obj.updateDynamic("Qualifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutFunctionEventInvokeConfigRequest]
    }
  }

  @js.native
  trait PutProvisionedConcurrencyConfigRequest extends js.Object {
    var FunctionName: FunctionName
    var ProvisionedConcurrentExecutions: PositiveInteger
    var Qualifier: Qualifier
  }

  object PutProvisionedConcurrencyConfigRequest {
    @inline
    def apply(
        FunctionName: FunctionName,
        ProvisionedConcurrentExecutions: PositiveInteger,
        Qualifier: Qualifier
    ): PutProvisionedConcurrencyConfigRequest = {
      val __obj = js.Dynamic.literal(
        "FunctionName" -> FunctionName.asInstanceOf[js.Any],
        "ProvisionedConcurrentExecutions" -> ProvisionedConcurrentExecutions.asInstanceOf[js.Any],
        "Qualifier" -> Qualifier.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutProvisionedConcurrencyConfigRequest]
    }
  }

  @js.native
  trait PutProvisionedConcurrencyConfigResponse extends js.Object {
    var AllocatedProvisionedConcurrentExecutions: js.UndefOr[NonNegativeInteger]
    var AvailableProvisionedConcurrentExecutions: js.UndefOr[NonNegativeInteger]
    var LastModified: js.UndefOr[Timestamp]
    var RequestedProvisionedConcurrentExecutions: js.UndefOr[PositiveInteger]
    var Status: js.UndefOr[ProvisionedConcurrencyStatusEnum]
    var StatusReason: js.UndefOr[String]
  }

  object PutProvisionedConcurrencyConfigResponse {
    @inline
    def apply(
        AllocatedProvisionedConcurrentExecutions: js.UndefOr[NonNegativeInteger] = js.undefined,
        AvailableProvisionedConcurrentExecutions: js.UndefOr[NonNegativeInteger] = js.undefined,
        LastModified: js.UndefOr[Timestamp] = js.undefined,
        RequestedProvisionedConcurrentExecutions: js.UndefOr[PositiveInteger] = js.undefined,
        Status: js.UndefOr[ProvisionedConcurrencyStatusEnum] = js.undefined,
        StatusReason: js.UndefOr[String] = js.undefined
    ): PutProvisionedConcurrencyConfigResponse = {
      val __obj = js.Dynamic.literal()
      AllocatedProvisionedConcurrentExecutions.foreach(__v => __obj.updateDynamic("AllocatedProvisionedConcurrentExecutions")(__v.asInstanceOf[js.Any]))
      AvailableProvisionedConcurrentExecutions.foreach(__v => __obj.updateDynamic("AvailableProvisionedConcurrentExecutions")(__v.asInstanceOf[js.Any]))
      LastModified.foreach(__v => __obj.updateDynamic("LastModified")(__v.asInstanceOf[js.Any]))
      RequestedProvisionedConcurrentExecutions.foreach(__v => __obj.updateDynamic("RequestedProvisionedConcurrentExecutions")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusReason.foreach(__v => __obj.updateDynamic("StatusReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutProvisionedConcurrencyConfigResponse]
    }
  }

  @js.native
  trait RemoveLayerVersionPermissionRequest extends js.Object {
    var LayerName: LayerName
    var StatementId: StatementId
    var VersionNumber: LayerVersionNumber
    var RevisionId: js.UndefOr[String]
  }

  object RemoveLayerVersionPermissionRequest {
    @inline
    def apply(
        LayerName: LayerName,
        StatementId: StatementId,
        VersionNumber: LayerVersionNumber,
        RevisionId: js.UndefOr[String] = js.undefined
    ): RemoveLayerVersionPermissionRequest = {
      val __obj = js.Dynamic.literal(
        "LayerName" -> LayerName.asInstanceOf[js.Any],
        "StatementId" -> StatementId.asInstanceOf[js.Any],
        "VersionNumber" -> VersionNumber.asInstanceOf[js.Any]
      )

      RevisionId.foreach(__v => __obj.updateDynamic("RevisionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RemoveLayerVersionPermissionRequest]
    }
  }

  @js.native
  trait RemovePermissionRequest extends js.Object {
    var FunctionName: FunctionName
    var StatementId: NamespacedStatementId
    var Qualifier: js.UndefOr[Qualifier]
    var RevisionId: js.UndefOr[String]
  }

  object RemovePermissionRequest {
    @inline
    def apply(
        FunctionName: FunctionName,
        StatementId: NamespacedStatementId,
        Qualifier: js.UndefOr[Qualifier] = js.undefined,
        RevisionId: js.UndefOr[String] = js.undefined
    ): RemovePermissionRequest = {
      val __obj = js.Dynamic.literal(
        "FunctionName" -> FunctionName.asInstanceOf[js.Any],
        "StatementId" -> StatementId.asInstanceOf[js.Any]
      )

      Qualifier.foreach(__v => __obj.updateDynamic("Qualifier")(__v.asInstanceOf[js.Any]))
      RevisionId.foreach(__v => __obj.updateDynamic("RevisionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RemovePermissionRequest]
    }
  }

  @js.native
  sealed trait Runtime extends js.Any
  object Runtime {
    val nodejs = "nodejs".asInstanceOf[Runtime]
    val `nodejs4.3` = "nodejs4.3".asInstanceOf[Runtime]
    val `nodejs6.10` = "nodejs6.10".asInstanceOf[Runtime]
    val `nodejs8.10` = "nodejs8.10".asInstanceOf[Runtime]
    val `nodejs10.x` = "nodejs10.x".asInstanceOf[Runtime]
    val `nodejs12.x` = "nodejs12.x".asInstanceOf[Runtime]
    val `nodejs14.x` = "nodejs14.x".asInstanceOf[Runtime]
    val java8 = "java8".asInstanceOf[Runtime]
    val `java8.al2` = "java8.al2".asInstanceOf[Runtime]
    val java11 = "java11".asInstanceOf[Runtime]
    val `python2.7` = "python2.7".asInstanceOf[Runtime]
    val `python3.6` = "python3.6".asInstanceOf[Runtime]
    val `python3.7` = "python3.7".asInstanceOf[Runtime]
    val `python3.8` = "python3.8".asInstanceOf[Runtime]
    val `dotnetcore1.0` = "dotnetcore1.0".asInstanceOf[Runtime]
    val `dotnetcore2.0` = "dotnetcore2.0".asInstanceOf[Runtime]
    val `dotnetcore2.1` = "dotnetcore2.1".asInstanceOf[Runtime]
    val `dotnetcore3.1` = "dotnetcore3.1".asInstanceOf[Runtime]
    val `nodejs4.3-edge` = "nodejs4.3-edge".asInstanceOf[Runtime]
    val `go1.x` = "go1.x".asInstanceOf[Runtime]
    val `ruby2.5` = "ruby2.5".asInstanceOf[Runtime]
    val `ruby2.7` = "ruby2.7".asInstanceOf[Runtime]
    val provided = "provided".asInstanceOf[Runtime]
    val `provided.al2` = "provided.al2".asInstanceOf[Runtime]

    @inline def values = js.Array(
      nodejs,
      `nodejs4.3`,
      `nodejs6.10`,
      `nodejs8.10`,
      `nodejs10.x`,
      `nodejs12.x`,
      `nodejs14.x`,
      java8,
      `java8.al2`,
      java11,
      `python2.7`,
      `python3.6`,
      `python3.7`,
      `python3.8`,
      `dotnetcore1.0`,
      `dotnetcore2.0`,
      `dotnetcore2.1`,
      `dotnetcore3.1`,
      `nodejs4.3-edge`,
      `go1.x`,
      `ruby2.5`,
      `ruby2.7`,
      provided,
      `provided.al2`
    )
  }

  /** The Self-Managed Apache Kafka cluster for your event source.
    */
  @js.native
  trait SelfManagedEventSource extends js.Object {
    var Endpoints: js.UndefOr[Endpoints]
  }

  object SelfManagedEventSource {
    @inline
    def apply(
        Endpoints: js.UndefOr[Endpoints] = js.undefined
    ): SelfManagedEventSource = {
      val __obj = js.Dynamic.literal()
      Endpoints.foreach(__v => __obj.updateDynamic("Endpoints")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SelfManagedEventSource]
    }
  }

  /** You can specify the authentication protocol, or the VPC components to secure access to your event source.
    */
  @js.native
  trait SourceAccessConfiguration extends js.Object {
    var Type: js.UndefOr[SourceAccessType]
    var URI: js.UndefOr[URI]
  }

  object SourceAccessConfiguration {
    @inline
    def apply(
        Type: js.UndefOr[SourceAccessType] = js.undefined,
        URI: js.UndefOr[URI] = js.undefined
    ): SourceAccessConfiguration = {
      val __obj = js.Dynamic.literal()
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      URI.foreach(__v => __obj.updateDynamic("URI")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SourceAccessConfiguration]
    }
  }

  @js.native
  sealed trait SourceAccessType extends js.Any
  object SourceAccessType {
    val BASIC_AUTH = "BASIC_AUTH".asInstanceOf[SourceAccessType]
    val VPC_SUBNET = "VPC_SUBNET".asInstanceOf[SourceAccessType]
    val VPC_SECURITY_GROUP = "VPC_SECURITY_GROUP".asInstanceOf[SourceAccessType]
    val SASL_SCRAM_512_AUTH = "SASL_SCRAM_512_AUTH".asInstanceOf[SourceAccessType]
    val SASL_SCRAM_256_AUTH = "SASL_SCRAM_256_AUTH".asInstanceOf[SourceAccessType]

    @inline def values = js.Array(BASIC_AUTH, VPC_SUBNET, VPC_SECURITY_GROUP, SASL_SCRAM_512_AUTH, SASL_SCRAM_256_AUTH)
  }

  @js.native
  sealed trait State extends js.Any
  object State {
    val Pending = "Pending".asInstanceOf[State]
    val Active = "Active".asInstanceOf[State]
    val Inactive = "Inactive".asInstanceOf[State]
    val Failed = "Failed".asInstanceOf[State]

    @inline def values = js.Array(Pending, Active, Inactive, Failed)
  }

  @js.native
  sealed trait StateReasonCode extends js.Any
  object StateReasonCode {
    val Idle = "Idle".asInstanceOf[StateReasonCode]
    val Creating = "Creating".asInstanceOf[StateReasonCode]
    val Restoring = "Restoring".asInstanceOf[StateReasonCode]
    val EniLimitExceeded = "EniLimitExceeded".asInstanceOf[StateReasonCode]
    val InsufficientRolePermissions = "InsufficientRolePermissions".asInstanceOf[StateReasonCode]
    val InvalidConfiguration = "InvalidConfiguration".asInstanceOf[StateReasonCode]
    val InternalError = "InternalError".asInstanceOf[StateReasonCode]
    val SubnetOutOfIPAddresses = "SubnetOutOfIPAddresses".asInstanceOf[StateReasonCode]
    val InvalidSubnet = "InvalidSubnet".asInstanceOf[StateReasonCode]
    val InvalidSecurityGroup = "InvalidSecurityGroup".asInstanceOf[StateReasonCode]
    val ImageDeleted = "ImageDeleted".asInstanceOf[StateReasonCode]
    val ImageAccessDenied = "ImageAccessDenied".asInstanceOf[StateReasonCode]
    val InvalidImage = "InvalidImage".asInstanceOf[StateReasonCode]

    @inline def values = js.Array(
      Idle,
      Creating,
      Restoring,
      EniLimitExceeded,
      InsufficientRolePermissions,
      InvalidConfiguration,
      InternalError,
      SubnetOutOfIPAddresses,
      InvalidSubnet,
      InvalidSecurityGroup,
      ImageDeleted,
      ImageAccessDenied,
      InvalidImage
    )
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var Resource: FunctionArn
    var Tags: Tags
  }

  object TagResourceRequest {
    @inline
    def apply(
        Resource: FunctionArn,
        Tags: Tags
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "Resource" -> Resource.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  /** The function's AWS X-Ray tracing configuration. To sample and record incoming requests, set <code>Mode</code> to <code>Active</code>.
    */
  @js.native
  trait TracingConfig extends js.Object {
    var Mode: js.UndefOr[TracingMode]
  }

  object TracingConfig {
    @inline
    def apply(
        Mode: js.UndefOr[TracingMode] = js.undefined
    ): TracingConfig = {
      val __obj = js.Dynamic.literal()
      Mode.foreach(__v => __obj.updateDynamic("Mode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TracingConfig]
    }
  }

  /** The function's AWS X-Ray tracing configuration.
    */
  @js.native
  trait TracingConfigResponse extends js.Object {
    var Mode: js.UndefOr[TracingMode]
  }

  object TracingConfigResponse {
    @inline
    def apply(
        Mode: js.UndefOr[TracingMode] = js.undefined
    ): TracingConfigResponse = {
      val __obj = js.Dynamic.literal()
      Mode.foreach(__v => __obj.updateDynamic("Mode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TracingConfigResponse]
    }
  }

  @js.native
  sealed trait TracingMode extends js.Any
  object TracingMode {
    val Active = "Active".asInstanceOf[TracingMode]
    val PassThrough = "PassThrough".asInstanceOf[TracingMode]

    @inline def values = js.Array(Active, PassThrough)
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var Resource: FunctionArn
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        Resource: FunctionArn,
        TagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "Resource" -> Resource.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UpdateAliasRequest extends js.Object {
    var FunctionName: FunctionName
    var Name: Alias
    var Description: js.UndefOr[Description]
    var FunctionVersion: js.UndefOr[Version]
    var RevisionId: js.UndefOr[String]
    var RoutingConfig: js.UndefOr[AliasRoutingConfiguration]
  }

  object UpdateAliasRequest {
    @inline
    def apply(
        FunctionName: FunctionName,
        Name: Alias,
        Description: js.UndefOr[Description] = js.undefined,
        FunctionVersion: js.UndefOr[Version] = js.undefined,
        RevisionId: js.UndefOr[String] = js.undefined,
        RoutingConfig: js.UndefOr[AliasRoutingConfiguration] = js.undefined
    ): UpdateAliasRequest = {
      val __obj = js.Dynamic.literal(
        "FunctionName" -> FunctionName.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      FunctionVersion.foreach(__v => __obj.updateDynamic("FunctionVersion")(__v.asInstanceOf[js.Any]))
      RevisionId.foreach(__v => __obj.updateDynamic("RevisionId")(__v.asInstanceOf[js.Any]))
      RoutingConfig.foreach(__v => __obj.updateDynamic("RoutingConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAliasRequest]
    }
  }

  @js.native
  trait UpdateCodeSigningConfigRequest extends js.Object {
    var CodeSigningConfigArn: CodeSigningConfigArn
    var AllowedPublishers: js.UndefOr[AllowedPublishers]
    var CodeSigningPolicies: js.UndefOr[CodeSigningPolicies]
    var Description: js.UndefOr[Description]
  }

  object UpdateCodeSigningConfigRequest {
    @inline
    def apply(
        CodeSigningConfigArn: CodeSigningConfigArn,
        AllowedPublishers: js.UndefOr[AllowedPublishers] = js.undefined,
        CodeSigningPolicies: js.UndefOr[CodeSigningPolicies] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined
    ): UpdateCodeSigningConfigRequest = {
      val __obj = js.Dynamic.literal(
        "CodeSigningConfigArn" -> CodeSigningConfigArn.asInstanceOf[js.Any]
      )

      AllowedPublishers.foreach(__v => __obj.updateDynamic("AllowedPublishers")(__v.asInstanceOf[js.Any]))
      CodeSigningPolicies.foreach(__v => __obj.updateDynamic("CodeSigningPolicies")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateCodeSigningConfigRequest]
    }
  }

  @js.native
  trait UpdateCodeSigningConfigResponse extends js.Object {
    var CodeSigningConfig: CodeSigningConfig
  }

  object UpdateCodeSigningConfigResponse {
    @inline
    def apply(
        CodeSigningConfig: CodeSigningConfig
    ): UpdateCodeSigningConfigResponse = {
      val __obj = js.Dynamic.literal(
        "CodeSigningConfig" -> CodeSigningConfig.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateCodeSigningConfigResponse]
    }
  }

  @js.native
  trait UpdateEventSourceMappingRequest extends js.Object {
    var UUID: String
    var BatchSize: js.UndefOr[BatchSize]
    var BisectBatchOnFunctionError: js.UndefOr[BisectBatchOnFunctionError]
    var DestinationConfig: js.UndefOr[DestinationConfig]
    var Enabled: js.UndefOr[Enabled]
    var FunctionName: js.UndefOr[FunctionName]
    var FunctionResponseTypes: js.UndefOr[FunctionResponseTypeList]
    var MaximumBatchingWindowInSeconds: js.UndefOr[MaximumBatchingWindowInSeconds]
    var MaximumRecordAgeInSeconds: js.UndefOr[MaximumRecordAgeInSeconds]
    var MaximumRetryAttempts: js.UndefOr[MaximumRetryAttemptsEventSourceMapping]
    var ParallelizationFactor: js.UndefOr[ParallelizationFactor]
    var SourceAccessConfigurations: js.UndefOr[SourceAccessConfigurations]
    var TumblingWindowInSeconds: js.UndefOr[TumblingWindowInSeconds]
  }

  object UpdateEventSourceMappingRequest {
    @inline
    def apply(
        UUID: String,
        BatchSize: js.UndefOr[BatchSize] = js.undefined,
        BisectBatchOnFunctionError: js.UndefOr[BisectBatchOnFunctionError] = js.undefined,
        DestinationConfig: js.UndefOr[DestinationConfig] = js.undefined,
        Enabled: js.UndefOr[Enabled] = js.undefined,
        FunctionName: js.UndefOr[FunctionName] = js.undefined,
        FunctionResponseTypes: js.UndefOr[FunctionResponseTypeList] = js.undefined,
        MaximumBatchingWindowInSeconds: js.UndefOr[MaximumBatchingWindowInSeconds] = js.undefined,
        MaximumRecordAgeInSeconds: js.UndefOr[MaximumRecordAgeInSeconds] = js.undefined,
        MaximumRetryAttempts: js.UndefOr[MaximumRetryAttemptsEventSourceMapping] = js.undefined,
        ParallelizationFactor: js.UndefOr[ParallelizationFactor] = js.undefined,
        SourceAccessConfigurations: js.UndefOr[SourceAccessConfigurations] = js.undefined,
        TumblingWindowInSeconds: js.UndefOr[TumblingWindowInSeconds] = js.undefined
    ): UpdateEventSourceMappingRequest = {
      val __obj = js.Dynamic.literal(
        "UUID" -> UUID.asInstanceOf[js.Any]
      )

      BatchSize.foreach(__v => __obj.updateDynamic("BatchSize")(__v.asInstanceOf[js.Any]))
      BisectBatchOnFunctionError.foreach(__v => __obj.updateDynamic("BisectBatchOnFunctionError")(__v.asInstanceOf[js.Any]))
      DestinationConfig.foreach(__v => __obj.updateDynamic("DestinationConfig")(__v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      FunctionName.foreach(__v => __obj.updateDynamic("FunctionName")(__v.asInstanceOf[js.Any]))
      FunctionResponseTypes.foreach(__v => __obj.updateDynamic("FunctionResponseTypes")(__v.asInstanceOf[js.Any]))
      MaximumBatchingWindowInSeconds.foreach(__v => __obj.updateDynamic("MaximumBatchingWindowInSeconds")(__v.asInstanceOf[js.Any]))
      MaximumRecordAgeInSeconds.foreach(__v => __obj.updateDynamic("MaximumRecordAgeInSeconds")(__v.asInstanceOf[js.Any]))
      MaximumRetryAttempts.foreach(__v => __obj.updateDynamic("MaximumRetryAttempts")(__v.asInstanceOf[js.Any]))
      ParallelizationFactor.foreach(__v => __obj.updateDynamic("ParallelizationFactor")(__v.asInstanceOf[js.Any]))
      SourceAccessConfigurations.foreach(__v => __obj.updateDynamic("SourceAccessConfigurations")(__v.asInstanceOf[js.Any]))
      TumblingWindowInSeconds.foreach(__v => __obj.updateDynamic("TumblingWindowInSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateEventSourceMappingRequest]
    }
  }

  @js.native
  trait UpdateFunctionCodeRequest extends js.Object {
    var FunctionName: FunctionName
    var DryRun: js.UndefOr[Boolean]
    var ImageUri: js.UndefOr[String]
    var Publish: js.UndefOr[Boolean]
    var RevisionId: js.UndefOr[String]
    var S3Bucket: js.UndefOr[S3Bucket]
    var S3Key: js.UndefOr[S3Key]
    var S3ObjectVersion: js.UndefOr[S3ObjectVersion]
    var ZipFile: js.UndefOr[Blob]
  }

  object UpdateFunctionCodeRequest {
    @inline
    def apply(
        FunctionName: FunctionName,
        DryRun: js.UndefOr[Boolean] = js.undefined,
        ImageUri: js.UndefOr[String] = js.undefined,
        Publish: js.UndefOr[Boolean] = js.undefined,
        RevisionId: js.UndefOr[String] = js.undefined,
        S3Bucket: js.UndefOr[S3Bucket] = js.undefined,
        S3Key: js.UndefOr[S3Key] = js.undefined,
        S3ObjectVersion: js.UndefOr[S3ObjectVersion] = js.undefined,
        ZipFile: js.UndefOr[Blob] = js.undefined
    ): UpdateFunctionCodeRequest = {
      val __obj = js.Dynamic.literal(
        "FunctionName" -> FunctionName.asInstanceOf[js.Any]
      )

      DryRun.foreach(__v => __obj.updateDynamic("DryRun")(__v.asInstanceOf[js.Any]))
      ImageUri.foreach(__v => __obj.updateDynamic("ImageUri")(__v.asInstanceOf[js.Any]))
      Publish.foreach(__v => __obj.updateDynamic("Publish")(__v.asInstanceOf[js.Any]))
      RevisionId.foreach(__v => __obj.updateDynamic("RevisionId")(__v.asInstanceOf[js.Any]))
      S3Bucket.foreach(__v => __obj.updateDynamic("S3Bucket")(__v.asInstanceOf[js.Any]))
      S3Key.foreach(__v => __obj.updateDynamic("S3Key")(__v.asInstanceOf[js.Any]))
      S3ObjectVersion.foreach(__v => __obj.updateDynamic("S3ObjectVersion")(__v.asInstanceOf[js.Any]))
      ZipFile.foreach(__v => __obj.updateDynamic("ZipFile")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFunctionCodeRequest]
    }
  }

  @js.native
  trait UpdateFunctionConfigurationRequest extends js.Object {
    var FunctionName: FunctionName
    var DeadLetterConfig: js.UndefOr[DeadLetterConfig]
    var Description: js.UndefOr[Description]
    var Environment: js.UndefOr[Environment]
    var FileSystemConfigs: js.UndefOr[FileSystemConfigList]
    var Handler: js.UndefOr[Handler]
    var ImageConfig: js.UndefOr[ImageConfig]
    var KMSKeyArn: js.UndefOr[KMSKeyArn]
    var Layers: js.UndefOr[LayerList]
    var MemorySize: js.UndefOr[MemorySize]
    var RevisionId: js.UndefOr[String]
    var Role: js.UndefOr[RoleArn]
    var Runtime: js.UndefOr[Runtime]
    var Timeout: js.UndefOr[Timeout]
    var TracingConfig: js.UndefOr[TracingConfig]
    var VpcConfig: js.UndefOr[VpcConfig]
  }

  object UpdateFunctionConfigurationRequest {
    @inline
    def apply(
        FunctionName: FunctionName,
        DeadLetterConfig: js.UndefOr[DeadLetterConfig] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        Environment: js.UndefOr[Environment] = js.undefined,
        FileSystemConfigs: js.UndefOr[FileSystemConfigList] = js.undefined,
        Handler: js.UndefOr[Handler] = js.undefined,
        ImageConfig: js.UndefOr[ImageConfig] = js.undefined,
        KMSKeyArn: js.UndefOr[KMSKeyArn] = js.undefined,
        Layers: js.UndefOr[LayerList] = js.undefined,
        MemorySize: js.UndefOr[MemorySize] = js.undefined,
        RevisionId: js.UndefOr[String] = js.undefined,
        Role: js.UndefOr[RoleArn] = js.undefined,
        Runtime: js.UndefOr[Runtime] = js.undefined,
        Timeout: js.UndefOr[Timeout] = js.undefined,
        TracingConfig: js.UndefOr[TracingConfig] = js.undefined,
        VpcConfig: js.UndefOr[VpcConfig] = js.undefined
    ): UpdateFunctionConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "FunctionName" -> FunctionName.asInstanceOf[js.Any]
      )

      DeadLetterConfig.foreach(__v => __obj.updateDynamic("DeadLetterConfig")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Environment.foreach(__v => __obj.updateDynamic("Environment")(__v.asInstanceOf[js.Any]))
      FileSystemConfigs.foreach(__v => __obj.updateDynamic("FileSystemConfigs")(__v.asInstanceOf[js.Any]))
      Handler.foreach(__v => __obj.updateDynamic("Handler")(__v.asInstanceOf[js.Any]))
      ImageConfig.foreach(__v => __obj.updateDynamic("ImageConfig")(__v.asInstanceOf[js.Any]))
      KMSKeyArn.foreach(__v => __obj.updateDynamic("KMSKeyArn")(__v.asInstanceOf[js.Any]))
      Layers.foreach(__v => __obj.updateDynamic("Layers")(__v.asInstanceOf[js.Any]))
      MemorySize.foreach(__v => __obj.updateDynamic("MemorySize")(__v.asInstanceOf[js.Any]))
      RevisionId.foreach(__v => __obj.updateDynamic("RevisionId")(__v.asInstanceOf[js.Any]))
      Role.foreach(__v => __obj.updateDynamic("Role")(__v.asInstanceOf[js.Any]))
      Runtime.foreach(__v => __obj.updateDynamic("Runtime")(__v.asInstanceOf[js.Any]))
      Timeout.foreach(__v => __obj.updateDynamic("Timeout")(__v.asInstanceOf[js.Any]))
      TracingConfig.foreach(__v => __obj.updateDynamic("TracingConfig")(__v.asInstanceOf[js.Any]))
      VpcConfig.foreach(__v => __obj.updateDynamic("VpcConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFunctionConfigurationRequest]
    }
  }

  @js.native
  trait UpdateFunctionEventInvokeConfigRequest extends js.Object {
    var FunctionName: FunctionName
    var DestinationConfig: js.UndefOr[DestinationConfig]
    var MaximumEventAgeInSeconds: js.UndefOr[MaximumEventAgeInSeconds]
    var MaximumRetryAttempts: js.UndefOr[MaximumRetryAttempts]
    var Qualifier: js.UndefOr[Qualifier]
  }

  object UpdateFunctionEventInvokeConfigRequest {
    @inline
    def apply(
        FunctionName: FunctionName,
        DestinationConfig: js.UndefOr[DestinationConfig] = js.undefined,
        MaximumEventAgeInSeconds: js.UndefOr[MaximumEventAgeInSeconds] = js.undefined,
        MaximumRetryAttempts: js.UndefOr[MaximumRetryAttempts] = js.undefined,
        Qualifier: js.UndefOr[Qualifier] = js.undefined
    ): UpdateFunctionEventInvokeConfigRequest = {
      val __obj = js.Dynamic.literal(
        "FunctionName" -> FunctionName.asInstanceOf[js.Any]
      )

      DestinationConfig.foreach(__v => __obj.updateDynamic("DestinationConfig")(__v.asInstanceOf[js.Any]))
      MaximumEventAgeInSeconds.foreach(__v => __obj.updateDynamic("MaximumEventAgeInSeconds")(__v.asInstanceOf[js.Any]))
      MaximumRetryAttempts.foreach(__v => __obj.updateDynamic("MaximumRetryAttempts")(__v.asInstanceOf[js.Any]))
      Qualifier.foreach(__v => __obj.updateDynamic("Qualifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFunctionEventInvokeConfigRequest]
    }
  }

  /** The VPC security groups and subnets that are attached to a Lambda function. For more information, see [[https://docs.aws.amazon.com/lambda/latest/dg/configuration-vpc.html|VPC Settings]].
    */
  @js.native
  trait VpcConfig extends js.Object {
    var SecurityGroupIds: js.UndefOr[SecurityGroupIds]
    var SubnetIds: js.UndefOr[SubnetIds]
  }

  object VpcConfig {
    @inline
    def apply(
        SecurityGroupIds: js.UndefOr[SecurityGroupIds] = js.undefined,
        SubnetIds: js.UndefOr[SubnetIds] = js.undefined
    ): VpcConfig = {
      val __obj = js.Dynamic.literal()
      SecurityGroupIds.foreach(__v => __obj.updateDynamic("SecurityGroupIds")(__v.asInstanceOf[js.Any]))
      SubnetIds.foreach(__v => __obj.updateDynamic("SubnetIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VpcConfig]
    }
  }

  /** The VPC security groups and subnets that are attached to a Lambda function.
    */
  @js.native
  trait VpcConfigResponse extends js.Object {
    var SecurityGroupIds: js.UndefOr[SecurityGroupIds]
    var SubnetIds: js.UndefOr[SubnetIds]
    var VpcId: js.UndefOr[VpcId]
  }

  object VpcConfigResponse {
    @inline
    def apply(
        SecurityGroupIds: js.UndefOr[SecurityGroupIds] = js.undefined,
        SubnetIds: js.UndefOr[SubnetIds] = js.undefined,
        VpcId: js.UndefOr[VpcId] = js.undefined
    ): VpcConfigResponse = {
      val __obj = js.Dynamic.literal()
      SecurityGroupIds.foreach(__v => __obj.updateDynamic("SecurityGroupIds")(__v.asInstanceOf[js.Any]))
      SubnetIds.foreach(__v => __obj.updateDynamic("SubnetIds")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VpcConfigResponse]
    }
  }
}
