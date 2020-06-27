package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object lambda {
  type Action                                   = String
  type AdditionalVersion                        = String
  type AdditionalVersionWeights                 = js.Dictionary[Weight]
  type Alias                                    = String
  type AliasList                                = js.Array[AliasConfiguration]
  type Arn                                      = String
  type BatchSize                                = Int
  type BisectBatchOnFunctionError               = Boolean
  type Blob                                     = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type BlobStream                               = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type CompatibleRuntimes                       = js.Array[Runtime]
  type Date                                     = js.Date
  type Description                              = String
  type DestinationArn                           = String
  type Enabled                                  = Boolean
  type EnvironmentVariableName                  = String
  type EnvironmentVariableValue                 = String
  type EnvironmentVariables                     = js.Dictionary[EnvironmentVariableValue]
  type EventSourceMappingsList                  = js.Array[EventSourceMappingConfiguration]
  type EventSourceToken                         = String
  type FunctionArn                              = String
  type FunctionEventInvokeConfigList            = js.Array[FunctionEventInvokeConfig]
  type FunctionList                             = js.Array[FunctionConfiguration]
  type FunctionName                             = String
  type Handler                                  = String
  type HttpStatus                               = Int
  type KMSKeyArn                                = String
  type LastUpdateStatusReason                   = String
  type LayerArn                                 = String
  type LayerList                                = js.Array[LayerVersionArn]
  type LayerName                                = String
  type LayerPermissionAllowedAction             = String
  type LayerPermissionAllowedPrincipal          = String
  type LayerVersionArn                          = String
  type LayerVersionNumber                       = Double
  type LayerVersionsList                        = js.Array[LayerVersionsListItem]
  type LayersList                               = js.Array[LayersListItem]
  type LayersReferenceList                      = js.Array[Layer]
  type LicenseInfo                              = String
  type MasterRegion                             = String
  type MaxFunctionEventInvokeConfigListItems    = Int
  type MaxLayerListItems                        = Int
  type MaxListItems                             = Int
  type MaxProvisionedConcurrencyConfigListItems = Int
  type MaximumBatchingWindowInSeconds           = Int
  type MaximumEventAgeInSeconds                 = Int
  type MaximumRecordAgeInSeconds                = Int
  type MaximumRetryAttempts                     = Int
  type MaximumRetryAttemptsEventSourceMapping   = Int
  type MemorySize                               = Int
  type NameSpacedFunctionArn                    = String
  type NamespacedFunctionName                   = String
  type NamespacedStatementId                    = String
  type NonNegativeInteger                       = Int
  type OrganizationId                           = String
  type ParallelizationFactor                    = Int
  type PositiveInteger                          = Int
  type Principal                                = String
  type ProvisionedConcurrencyConfigList         = js.Array[ProvisionedConcurrencyConfigListItem]
  type Qualifier                                = String
  type ReservedConcurrentExecutions             = Int
  type ResourceArn                              = String
  type RoleArn                                  = String
  type S3Bucket                                 = String
  type S3Key                                    = String
  type S3ObjectVersion                          = String
  type SecurityGroupId                          = String
  type SecurityGroupIds                         = js.Array[SecurityGroupId]
  type SensitiveString                          = String
  type SourceOwner                              = String
  type StateReason                              = String
  type StatementId                              = String
  type SubnetId                                 = String
  type SubnetIds                                = js.Array[SubnetId]
  type TagKey                                   = String
  type TagKeyList                               = js.Array[TagKey]
  type TagValue                                 = String
  type Tags                                     = js.Dictionary[TagValue]
  type Timeout                                  = Int
  type Timestamp                                = String
  type UnreservedConcurrentExecutions           = Int
  type Version                                  = String
  type VpcId                                    = String
  type Weight                                   = Double

  implicit final class LambdaOps(private val service: Lambda) extends AnyVal {

    @inline def addLayerVersionPermissionFuture(
        params: AddLayerVersionPermissionRequest
    ): Future[AddLayerVersionPermissionResponse] = service.addLayerVersionPermission(params).promise().toFuture
    @inline def addPermissionFuture(params: AddPermissionRequest): Future[AddPermissionResponse] =
      service.addPermission(params).promise().toFuture
    @inline def createAliasFuture(params: CreateAliasRequest): Future[AliasConfiguration] =
      service.createAlias(params).promise().toFuture
    @inline def createEventSourceMappingFuture(
        params: CreateEventSourceMappingRequest
    ): Future[EventSourceMappingConfiguration] = service.createEventSourceMapping(params).promise().toFuture
    @inline def createFunctionFuture(params: CreateFunctionRequest): Future[FunctionConfiguration] =
      service.createFunction(params).promise().toFuture
    @inline def deleteAliasFuture(params: DeleteAliasRequest): Future[js.Object] =
      service.deleteAlias(params).promise().toFuture
    @inline def deleteEventSourceMappingFuture(
        params: DeleteEventSourceMappingRequest
    ): Future[EventSourceMappingConfiguration] = service.deleteEventSourceMapping(params).promise().toFuture
    @inline def deleteFunctionConcurrencyFuture(params: DeleteFunctionConcurrencyRequest): Future[js.Object] =
      service.deleteFunctionConcurrency(params).promise().toFuture
    @inline def deleteFunctionEventInvokeConfigFuture(
        params: DeleteFunctionEventInvokeConfigRequest
    ): Future[js.Object] = service.deleteFunctionEventInvokeConfig(params).promise().toFuture
    @inline def deleteFunctionFuture(params: DeleteFunctionRequest): Future[js.Object] =
      service.deleteFunction(params).promise().toFuture
    @inline def deleteLayerVersionFuture(params: DeleteLayerVersionRequest): Future[js.Object] =
      service.deleteLayerVersion(params).promise().toFuture
    @inline def deleteProvisionedConcurrencyConfigFuture(
        params: DeleteProvisionedConcurrencyConfigRequest
    ): Future[js.Object] = service.deleteProvisionedConcurrencyConfig(params).promise().toFuture
    @inline def getAccountSettingsFuture(params: GetAccountSettingsRequest): Future[GetAccountSettingsResponse] =
      service.getAccountSettings(params).promise().toFuture
    @inline def getAliasFuture(params: GetAliasRequest): Future[AliasConfiguration] =
      service.getAlias(params).promise().toFuture
    @inline def getEventSourceMappingFuture(
        params: GetEventSourceMappingRequest
    ): Future[EventSourceMappingConfiguration] = service.getEventSourceMapping(params).promise().toFuture
    @inline def getFunctionConcurrencyFuture(
        params: GetFunctionConcurrencyRequest
    ): Future[GetFunctionConcurrencyResponse] = service.getFunctionConcurrency(params).promise().toFuture
    @inline def getFunctionConfigurationFuture(params: GetFunctionConfigurationRequest): Future[FunctionConfiguration] =
      service.getFunctionConfiguration(params).promise().toFuture
    @inline def getFunctionEventInvokeConfigFuture(
        params: GetFunctionEventInvokeConfigRequest
    ): Future[FunctionEventInvokeConfig] = service.getFunctionEventInvokeConfig(params).promise().toFuture
    @inline def getFunctionFuture(params: GetFunctionRequest): Future[GetFunctionResponse] =
      service.getFunction(params).promise().toFuture
    @inline def getLayerVersionByArnFuture(params: GetLayerVersionByArnRequest): Future[GetLayerVersionResponse] =
      service.getLayerVersionByArn(params).promise().toFuture
    @inline def getLayerVersionFuture(params: GetLayerVersionRequest): Future[GetLayerVersionResponse] =
      service.getLayerVersion(params).promise().toFuture
    @inline def getLayerVersionPolicyFuture(
        params: GetLayerVersionPolicyRequest
    ): Future[GetLayerVersionPolicyResponse] = service.getLayerVersionPolicy(params).promise().toFuture
    @inline def getPolicyFuture(params: GetPolicyRequest): Future[GetPolicyResponse] =
      service.getPolicy(params).promise().toFuture
    @inline def getProvisionedConcurrencyConfigFuture(
        params: GetProvisionedConcurrencyConfigRequest
    ): Future[GetProvisionedConcurrencyConfigResponse] =
      service.getProvisionedConcurrencyConfig(params).promise().toFuture
    @inline def invokeFuture(params: InvocationRequest): Future[InvocationResponse] =
      service.invoke(params).promise().toFuture
    @inline def listAliasesFuture(params: ListAliasesRequest): Future[ListAliasesResponse] =
      service.listAliases(params).promise().toFuture
    @inline def listEventSourceMappingsFuture(
        params: ListEventSourceMappingsRequest
    ): Future[ListEventSourceMappingsResponse] = service.listEventSourceMappings(params).promise().toFuture
    @inline def listFunctionEventInvokeConfigsFuture(
        params: ListFunctionEventInvokeConfigsRequest
    ): Future[ListFunctionEventInvokeConfigsResponse] =
      service.listFunctionEventInvokeConfigs(params).promise().toFuture
    @inline def listFunctionsFuture(params: ListFunctionsRequest): Future[ListFunctionsResponse] =
      service.listFunctions(params).promise().toFuture
    @inline def listLayerVersionsFuture(params: ListLayerVersionsRequest): Future[ListLayerVersionsResponse] =
      service.listLayerVersions(params).promise().toFuture
    @inline def listLayersFuture(params: ListLayersRequest): Future[ListLayersResponse] =
      service.listLayers(params).promise().toFuture
    @inline def listProvisionedConcurrencyConfigsFuture(
        params: ListProvisionedConcurrencyConfigsRequest
    ): Future[ListProvisionedConcurrencyConfigsResponse] =
      service.listProvisionedConcurrencyConfigs(params).promise().toFuture
    @inline def listTagsFuture(params: ListTagsRequest): Future[ListTagsResponse] =
      service.listTags(params).promise().toFuture
    @inline def listVersionsByFunctionFuture(
        params: ListVersionsByFunctionRequest
    ): Future[ListVersionsByFunctionResponse] = service.listVersionsByFunction(params).promise().toFuture
    @inline def publishLayerVersionFuture(params: PublishLayerVersionRequest): Future[PublishLayerVersionResponse] =
      service.publishLayerVersion(params).promise().toFuture
    @inline def publishVersionFuture(params: PublishVersionRequest): Future[FunctionConfiguration] =
      service.publishVersion(params).promise().toFuture
    @inline def putFunctionConcurrencyFuture(params: PutFunctionConcurrencyRequest): Future[Concurrency] =
      service.putFunctionConcurrency(params).promise().toFuture
    @inline def putFunctionEventInvokeConfigFuture(
        params: PutFunctionEventInvokeConfigRequest
    ): Future[FunctionEventInvokeConfig] = service.putFunctionEventInvokeConfig(params).promise().toFuture
    @inline def putProvisionedConcurrencyConfigFuture(
        params: PutProvisionedConcurrencyConfigRequest
    ): Future[PutProvisionedConcurrencyConfigResponse] =
      service.putProvisionedConcurrencyConfig(params).promise().toFuture
    @inline def removeLayerVersionPermissionFuture(params: RemoveLayerVersionPermissionRequest): Future[js.Object] =
      service.removeLayerVersionPermission(params).promise().toFuture
    @inline def removePermissionFuture(params: RemovePermissionRequest): Future[js.Object] =
      service.removePermission(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[js.Object] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[js.Object] =
      service.untagResource(params).promise().toFuture
    @inline def updateAliasFuture(params: UpdateAliasRequest): Future[AliasConfiguration] =
      service.updateAlias(params).promise().toFuture
    @inline def updateEventSourceMappingFuture(
        params: UpdateEventSourceMappingRequest
    ): Future[EventSourceMappingConfiguration] = service.updateEventSourceMapping(params).promise().toFuture
    @inline def updateFunctionCodeFuture(params: UpdateFunctionCodeRequest): Future[FunctionConfiguration] =
      service.updateFunctionCode(params).promise().toFuture
    @inline def updateFunctionConfigurationFuture(
        params: UpdateFunctionConfigurationRequest
    ): Future[FunctionConfiguration] = service.updateFunctionConfiguration(params).promise().toFuture
    @inline def updateFunctionEventInvokeConfigFuture(
        params: UpdateFunctionEventInvokeConfigRequest
    ): Future[FunctionEventInvokeConfig] = service.updateFunctionEventInvokeConfig(params).promise().toFuture
  }
}

package lambda {
  @js.native
  @JSImport("aws-sdk", "Lambda")
  class Lambda() extends js.Object {
    def this(config: AWSConfig) = this()

    def addLayerVersionPermission(
        params: AddLayerVersionPermissionRequest
    ): Request[AddLayerVersionPermissionResponse]                                   = js.native
    def addPermission(params: AddPermissionRequest): Request[AddPermissionResponse] = js.native
    def createAlias(params: CreateAliasRequest): Request[AliasConfiguration]        = js.native
    def createEventSourceMapping(params: CreateEventSourceMappingRequest): Request[EventSourceMappingConfiguration] =
      js.native
    def createFunction(params: CreateFunctionRequest): Request[FunctionConfiguration] = js.native
    def deleteAlias(params: DeleteAliasRequest): Request[js.Object]                   = js.native
    def deleteEventSourceMapping(params: DeleteEventSourceMappingRequest): Request[EventSourceMappingConfiguration] =
      js.native
    def deleteFunction(params: DeleteFunctionRequest): Request[js.Object]                                   = js.native
    def deleteFunctionConcurrency(params: DeleteFunctionConcurrencyRequest): Request[js.Object]             = js.native
    def deleteFunctionEventInvokeConfig(params: DeleteFunctionEventInvokeConfigRequest): Request[js.Object] = js.native
    def deleteLayerVersion(params: DeleteLayerVersionRequest): Request[js.Object]                           = js.native
    def deleteProvisionedConcurrencyConfig(params: DeleteProvisionedConcurrencyConfigRequest): Request[js.Object] =
      js.native
    def getAccountSettings(params: GetAccountSettingsRequest): Request[GetAccountSettingsResponse] = js.native
    def getAlias(params: GetAliasRequest): Request[AliasConfiguration]                             = js.native
    def getEventSourceMapping(params: GetEventSourceMappingRequest): Request[EventSourceMappingConfiguration] =
      js.native
    def getFunction(params: GetFunctionRequest): Request[GetFunctionResponse] = js.native
    def getFunctionConcurrency(params: GetFunctionConcurrencyRequest): Request[GetFunctionConcurrencyResponse] =
      js.native
    def getFunctionConfiguration(params: GetFunctionConfigurationRequest): Request[FunctionConfiguration] = js.native
    def getFunctionEventInvokeConfig(params: GetFunctionEventInvokeConfigRequest): Request[FunctionEventInvokeConfig] =
      js.native
    def getLayerVersion(params: GetLayerVersionRequest): Request[GetLayerVersionResponse]                   = js.native
    def getLayerVersionByArn(params: GetLayerVersionByArnRequest): Request[GetLayerVersionResponse]         = js.native
    def getLayerVersionPolicy(params: GetLayerVersionPolicyRequest): Request[GetLayerVersionPolicyResponse] = js.native
    def getPolicy(params: GetPolicyRequest): Request[GetPolicyResponse]                                     = js.native
    def getProvisionedConcurrencyConfig(
        params: GetProvisionedConcurrencyConfigRequest
    ): Request[GetProvisionedConcurrencyConfigResponse]                       = js.native
    def invoke(params: InvocationRequest): Request[InvocationResponse]        = js.native
    def listAliases(params: ListAliasesRequest): Request[ListAliasesResponse] = js.native
    def listEventSourceMappings(params: ListEventSourceMappingsRequest): Request[ListEventSourceMappingsResponse] =
      js.native
    def listFunctionEventInvokeConfigs(
        params: ListFunctionEventInvokeConfigsRequest
    ): Request[ListFunctionEventInvokeConfigsResponse]                                          = js.native
    def listFunctions(params: ListFunctionsRequest): Request[ListFunctionsResponse]             = js.native
    def listLayerVersions(params: ListLayerVersionsRequest): Request[ListLayerVersionsResponse] = js.native
    def listLayers(params: ListLayersRequest): Request[ListLayersResponse]                      = js.native
    def listProvisionedConcurrencyConfigs(
        params: ListProvisionedConcurrencyConfigsRequest
    ): Request[ListProvisionedConcurrencyConfigsResponse]            = js.native
    def listTags(params: ListTagsRequest): Request[ListTagsResponse] = js.native
    def listVersionsByFunction(params: ListVersionsByFunctionRequest): Request[ListVersionsByFunctionResponse] =
      js.native
    def publishLayerVersion(params: PublishLayerVersionRequest): Request[PublishLayerVersionResponse] = js.native
    def publishVersion(params: PublishVersionRequest): Request[FunctionConfiguration]                 = js.native
    def putFunctionConcurrency(params: PutFunctionConcurrencyRequest): Request[Concurrency]           = js.native
    def putFunctionEventInvokeConfig(params: PutFunctionEventInvokeConfigRequest): Request[FunctionEventInvokeConfig] =
      js.native
    def putProvisionedConcurrencyConfig(
        params: PutProvisionedConcurrencyConfigRequest
    ): Request[PutProvisionedConcurrencyConfigResponse]                                               = js.native
    def removeLayerVersionPermission(params: RemoveLayerVersionPermissionRequest): Request[js.Object] = js.native
    def removePermission(params: RemovePermissionRequest): Request[js.Object]                         = js.native
    def tagResource(params: TagResourceRequest): Request[js.Object]                                   = js.native
    def untagResource(params: UntagResourceRequest): Request[js.Object]                               = js.native
    def updateAlias(params: UpdateAliasRequest): Request[AliasConfiguration]                          = js.native
    def updateEventSourceMapping(params: UpdateEventSourceMappingRequest): Request[EventSourceMappingConfiguration] =
      js.native
    def updateFunctionCode(params: UpdateFunctionCodeRequest): Request[FunctionConfiguration] = js.native
    def updateFunctionConfiguration(params: UpdateFunctionConfigurationRequest): Request[FunctionConfiguration] =
      js.native
    def updateFunctionEventInvokeConfig(
        params: UpdateFunctionEventInvokeConfigRequest
    ): Request[FunctionEventInvokeConfig] = js.native
    @deprecated("Deprecated in AWS SDK", "forever") def invokeAsync(
        params: InvokeAsyncRequest
    ): Request[InvokeAsyncResponse] = js.native
  }

  /**
    * Limits that are related to concurrency and storage. All file and storage sizes are in bytes.
    */
  @js.native
  @Factory
  trait AccountLimit extends js.Object {
    var CodeSizeUnzipped: js.UndefOr[Double]
    var CodeSizeZipped: js.UndefOr[Double]
    var ConcurrentExecutions: js.UndefOr[Int]
    var TotalCodeSize: js.UndefOr[Double]
    var UnreservedConcurrentExecutions: js.UndefOr[UnreservedConcurrentExecutions]
  }

  /**
    * The number of functions and amount of storage in use.
    */
  @js.native
  @Factory
  trait AccountUsage extends js.Object {
    var FunctionCount: js.UndefOr[Double]
    var TotalCodeSize: js.UndefOr[Double]
  }

  @js.native
  @Factory
  trait AddLayerVersionPermissionRequest extends js.Object {
    var Action: LayerPermissionAllowedAction
    var LayerName: LayerName
    var Principal: LayerPermissionAllowedPrincipal
    var StatementId: StatementId
    var VersionNumber: LayerVersionNumber
    var OrganizationId: js.UndefOr[OrganizationId]
    var RevisionId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait AddLayerVersionPermissionResponse extends js.Object {
    var RevisionId: js.UndefOr[String]
    var Statement: js.UndefOr[String]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait AddPermissionResponse extends js.Object {
    var Statement: js.UndefOr[String]
  }

  /**
    * Provides configuration information about a Lambda function [[https://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html|alias]].
    */
  @js.native
  @Factory
  trait AliasConfiguration extends js.Object {
    var AliasArn: js.UndefOr[FunctionArn]
    var Description: js.UndefOr[Description]
    var FunctionVersion: js.UndefOr[Version]
    var Name: js.UndefOr[Alias]
    var RevisionId: js.UndefOr[String]
    var RoutingConfig: js.UndefOr[AliasRoutingConfiguration]
  }

  /**
    * The [[https://docs.aws.amazon.com/lambda/latest/dg/lambda-traffic-shifting-using-aliases.html|traffic-shifting]] configuration of a Lambda function alias.
    */
  @js.native
  @Factory
  trait AliasRoutingConfiguration extends js.Object {
    var AdditionalVersionWeights: js.UndefOr[AdditionalVersionWeights]
  }

  @js.native
  @Factory
  trait Concurrency extends js.Object {
    var ReservedConcurrentExecutions: js.UndefOr[ReservedConcurrentExecutions]
  }

  @js.native
  @Factory
  trait CreateAliasRequest extends js.Object {
    var FunctionName: FunctionName
    var FunctionVersion: Version
    var Name: Alias
    var Description: js.UndefOr[Description]
    var RoutingConfig: js.UndefOr[AliasRoutingConfiguration]
  }

  @js.native
  @Factory
  trait CreateEventSourceMappingRequest extends js.Object {
    var EventSourceArn: Arn
    var FunctionName: FunctionName
    var BatchSize: js.UndefOr[BatchSize]
    var BisectBatchOnFunctionError: js.UndefOr[BisectBatchOnFunctionError]
    var DestinationConfig: js.UndefOr[DestinationConfig]
    var Enabled: js.UndefOr[Enabled]
    var MaximumBatchingWindowInSeconds: js.UndefOr[MaximumBatchingWindowInSeconds]
    var MaximumRecordAgeInSeconds: js.UndefOr[MaximumRecordAgeInSeconds]
    var MaximumRetryAttempts: js.UndefOr[MaximumRetryAttemptsEventSourceMapping]
    var ParallelizationFactor: js.UndefOr[ParallelizationFactor]
    var StartingPosition: js.UndefOr[EventSourcePosition]
    var StartingPositionTimestamp: js.UndefOr[Date]
  }

  @js.native
  @Factory
  trait CreateFunctionRequest extends js.Object {
    var Code: FunctionCode
    var FunctionName: FunctionName
    var Handler: Handler
    var Role: RoleArn
    var Runtime: Runtime
    var DeadLetterConfig: js.UndefOr[DeadLetterConfig]
    var Description: js.UndefOr[Description]
    var Environment: js.UndefOr[Environment]
    var KMSKeyArn: js.UndefOr[KMSKeyArn]
    var Layers: js.UndefOr[LayerList]
    var MemorySize: js.UndefOr[MemorySize]
    var Publish: js.UndefOr[Boolean]
    var Tags: js.UndefOr[Tags]
    var Timeout: js.UndefOr[Timeout]
    var TracingConfig: js.UndefOr[TracingConfig]
    var VpcConfig: js.UndefOr[VpcConfig]
  }

  /**
    * The [[https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html#dlq|dead-letter queue]] for failed asynchronous invocations.
    */
  @js.native
  @Factory
  trait DeadLetterConfig extends js.Object {
    var TargetArn: js.UndefOr[ResourceArn]
  }

  @js.native
  @Factory
  trait DeleteAliasRequest extends js.Object {
    var FunctionName: FunctionName
    var Name: Alias
  }

  @js.native
  @Factory
  trait DeleteEventSourceMappingRequest extends js.Object {
    var UUID: String
  }

  @js.native
  @Factory
  trait DeleteFunctionConcurrencyRequest extends js.Object {
    var FunctionName: FunctionName
  }

  @js.native
  @Factory
  trait DeleteFunctionEventInvokeConfigRequest extends js.Object {
    var FunctionName: FunctionName
    var Qualifier: js.UndefOr[Qualifier]
  }

  @js.native
  @Factory
  trait DeleteFunctionRequest extends js.Object {
    var FunctionName: FunctionName
    var Qualifier: js.UndefOr[Qualifier]
  }

  @js.native
  @Factory
  trait DeleteLayerVersionRequest extends js.Object {
    var LayerName: LayerName
    var VersionNumber: LayerVersionNumber
  }

  @js.native
  @Factory
  trait DeleteProvisionedConcurrencyConfigRequest extends js.Object {
    var FunctionName: FunctionName
    var Qualifier: Qualifier
  }

  /**
    * A configuration object that specifies the destination of an event after Lambda processes it.
    */
  @js.native
  @Factory
  trait DestinationConfig extends js.Object {
    var OnFailure: js.UndefOr[OnFailure]
    var OnSuccess: js.UndefOr[OnSuccess]
  }

  /**
    * A function's environment variable settings.
    */
  @js.native
  @Factory
  trait Environment extends js.Object {
    var Variables: js.UndefOr[EnvironmentVariables]
  }

  /**
    * Error messages for environment variables that couldn't be applied.
    */
  @js.native
  @Factory
  trait EnvironmentError extends js.Object {
    var ErrorCode: js.UndefOr[String]
    var Message: js.UndefOr[SensitiveString]
  }

  /**
    * The results of an operation to update or read environment variables. If the operation is successful, the response contains the environment variables. If it failed, the response contains details about the error.
    */
  @js.native
  @Factory
  trait EnvironmentResponse extends js.Object {
    var Error: js.UndefOr[EnvironmentError]
    var Variables: js.UndefOr[EnvironmentVariables]
  }

  /**
    * A mapping between an AWS resource and an AWS Lambda function. See <a>CreateEventSourceMapping</a> for details.
    */
  @js.native
  @Factory
  trait EventSourceMappingConfiguration extends js.Object {
    var BatchSize: js.UndefOr[BatchSize]
    var BisectBatchOnFunctionError: js.UndefOr[BisectBatchOnFunctionError]
    var DestinationConfig: js.UndefOr[DestinationConfig]
    var EventSourceArn: js.UndefOr[Arn]
    var FunctionArn: js.UndefOr[FunctionArn]
    var LastModified: js.UndefOr[Date]
    var LastProcessingResult: js.UndefOr[String]
    var MaximumBatchingWindowInSeconds: js.UndefOr[MaximumBatchingWindowInSeconds]
    var MaximumRecordAgeInSeconds: js.UndefOr[MaximumRecordAgeInSeconds]
    var MaximumRetryAttempts: js.UndefOr[MaximumRetryAttemptsEventSourceMapping]
    var ParallelizationFactor: js.UndefOr[ParallelizationFactor]
    var State: js.UndefOr[String]
    var StateTransitionReason: js.UndefOr[String]
    var UUID: js.UndefOr[String]
  }

  @js.native
  sealed trait EventSourcePosition extends js.Any
  object EventSourcePosition extends js.Object {
    val TRIM_HORIZON = "TRIM_HORIZON".asInstanceOf[EventSourcePosition]
    val LATEST       = "LATEST".asInstanceOf[EventSourcePosition]
    val AT_TIMESTAMP = "AT_TIMESTAMP".asInstanceOf[EventSourcePosition]

    val values = js.Object.freeze(js.Array(TRIM_HORIZON, LATEST, AT_TIMESTAMP))
  }

  /**
    * The code for the Lambda function. You can specify either an object in Amazon S3, or upload a deployment package directly.
    */
  @js.native
  @Factory
  trait FunctionCode extends js.Object {
    var S3Bucket: js.UndefOr[S3Bucket]
    var S3Key: js.UndefOr[S3Key]
    var S3ObjectVersion: js.UndefOr[S3ObjectVersion]
    var ZipFile: js.UndefOr[Blob]
  }

  /**
    * Details about a function's deployment package.
    */
  @js.native
  @Factory
  trait FunctionCodeLocation extends js.Object {
    var Location: js.UndefOr[String]
    var RepositoryType: js.UndefOr[String]
  }

  /**
    * Details about a function's configuration.
    */
  @js.native
  @Factory
  trait FunctionConfiguration extends js.Object {
    var CodeSha256: js.UndefOr[String]
    var CodeSize: js.UndefOr[Double]
    var DeadLetterConfig: js.UndefOr[DeadLetterConfig]
    var Description: js.UndefOr[Description]
    var Environment: js.UndefOr[EnvironmentResponse]
    var FunctionArn: js.UndefOr[NameSpacedFunctionArn]
    var FunctionName: js.UndefOr[NamespacedFunctionName]
    var Handler: js.UndefOr[Handler]
    var KMSKeyArn: js.UndefOr[KMSKeyArn]
    var LastModified: js.UndefOr[Timestamp]
    var LastUpdateStatus: js.UndefOr[LastUpdateStatus]
    var LastUpdateStatusReason: js.UndefOr[LastUpdateStatusReason]
    var LastUpdateStatusReasonCode: js.UndefOr[LastUpdateStatusReasonCode]
    var Layers: js.UndefOr[LayersReferenceList]
    var MasterArn: js.UndefOr[FunctionArn]
    var MemorySize: js.UndefOr[MemorySize]
    var RevisionId: js.UndefOr[String]
    var Role: js.UndefOr[RoleArn]
    var Runtime: js.UndefOr[Runtime]
    var State: js.UndefOr[State]
    var StateReason: js.UndefOr[StateReason]
    var StateReasonCode: js.UndefOr[StateReasonCode]
    var Timeout: js.UndefOr[Timeout]
    var TracingConfig: js.UndefOr[TracingConfigResponse]
    var Version: js.UndefOr[Version]
    var VpcConfig: js.UndefOr[VpcConfigResponse]
  }

  @js.native
  @Factory
  trait FunctionEventInvokeConfig extends js.Object {
    var DestinationConfig: js.UndefOr[DestinationConfig]
    var FunctionArn: js.UndefOr[FunctionArn]
    var LastModified: js.UndefOr[Date]
    var MaximumEventAgeInSeconds: js.UndefOr[MaximumEventAgeInSeconds]
    var MaximumRetryAttempts: js.UndefOr[MaximumRetryAttempts]
  }

  @js.native
  sealed trait FunctionVersion extends js.Any
  object FunctionVersion extends js.Object {
    val ALL = "ALL".asInstanceOf[FunctionVersion]

    val values = js.Object.freeze(js.Array(ALL))
  }

  @js.native
  @Factory
  trait GetAccountSettingsRequest extends js.Object {}

  @js.native
  @Factory
  trait GetAccountSettingsResponse extends js.Object {
    var AccountLimit: js.UndefOr[AccountLimit]
    var AccountUsage: js.UndefOr[AccountUsage]
  }

  @js.native
  @Factory
  trait GetAliasRequest extends js.Object {
    var FunctionName: FunctionName
    var Name: Alias
  }

  @js.native
  @Factory
  trait GetEventSourceMappingRequest extends js.Object {
    var UUID: String
  }

  @js.native
  @Factory
  trait GetFunctionConcurrencyRequest extends js.Object {
    var FunctionName: FunctionName
  }

  @js.native
  @Factory
  trait GetFunctionConcurrencyResponse extends js.Object {
    var ReservedConcurrentExecutions: js.UndefOr[ReservedConcurrentExecutions]
  }

  @js.native
  @Factory
  trait GetFunctionConfigurationRequest extends js.Object {
    var FunctionName: NamespacedFunctionName
    var Qualifier: js.UndefOr[Qualifier]
  }

  @js.native
  @Factory
  trait GetFunctionEventInvokeConfigRequest extends js.Object {
    var FunctionName: FunctionName
    var Qualifier: js.UndefOr[Qualifier]
  }

  @js.native
  @Factory
  trait GetFunctionRequest extends js.Object {
    var FunctionName: NamespacedFunctionName
    var Qualifier: js.UndefOr[Qualifier]
  }

  @js.native
  @Factory
  trait GetFunctionResponse extends js.Object {
    var Code: js.UndefOr[FunctionCodeLocation]
    var Concurrency: js.UndefOr[Concurrency]
    var Configuration: js.UndefOr[FunctionConfiguration]
    var Tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
  trait GetLayerVersionByArnRequest extends js.Object {
    var Arn: LayerVersionArn
  }

  @js.native
  @Factory
  trait GetLayerVersionPolicyRequest extends js.Object {
    var LayerName: LayerName
    var VersionNumber: LayerVersionNumber
  }

  @js.native
  @Factory
  trait GetLayerVersionPolicyResponse extends js.Object {
    var Policy: js.UndefOr[String]
    var RevisionId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetLayerVersionRequest extends js.Object {
    var LayerName: LayerName
    var VersionNumber: LayerVersionNumber
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait GetPolicyRequest extends js.Object {
    var FunctionName: NamespacedFunctionName
    var Qualifier: js.UndefOr[Qualifier]
  }

  @js.native
  @Factory
  trait GetPolicyResponse extends js.Object {
    var Policy: js.UndefOr[String]
    var RevisionId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetProvisionedConcurrencyConfigRequest extends js.Object {
    var FunctionName: FunctionName
    var Qualifier: Qualifier
  }

  @js.native
  @Factory
  trait GetProvisionedConcurrencyConfigResponse extends js.Object {
    var AllocatedProvisionedConcurrentExecutions: js.UndefOr[NonNegativeInteger]
    var AvailableProvisionedConcurrentExecutions: js.UndefOr[NonNegativeInteger]
    var LastModified: js.UndefOr[Timestamp]
    var RequestedProvisionedConcurrentExecutions: js.UndefOr[PositiveInteger]
    var Status: js.UndefOr[ProvisionedConcurrencyStatusEnum]
    var StatusReason: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait InvocationRequest extends js.Object {
    var FunctionName: NamespacedFunctionName
    var ClientContext: js.UndefOr[String]
    var InvocationType: js.UndefOr[InvocationType]
    var LogType: js.UndefOr[LogType]
    var Payload: js.UndefOr[Blob]
    var Qualifier: js.UndefOr[Qualifier]
  }

  @js.native
  @Factory
  trait InvocationResponse extends js.Object {
    var ExecutedVersion: js.UndefOr[Version]
    var FunctionError: js.UndefOr[String]
    var LogResult: js.UndefOr[String]
    var Payload: js.UndefOr[Blob]
    var StatusCode: js.UndefOr[Int]
  }

  @js.native
  sealed trait InvocationType extends js.Any
  object InvocationType extends js.Object {
    val Event           = "Event".asInstanceOf[InvocationType]
    val RequestResponse = "RequestResponse".asInstanceOf[InvocationType]
    val DryRun          = "DryRun".asInstanceOf[InvocationType]

    val values = js.Object.freeze(js.Array(Event, RequestResponse, DryRun))
  }

  @deprecated("Deprecated in AWS SDK", "forever")
  @js.native
  @Factory
  trait InvokeAsyncRequest extends js.Object {
    var FunctionName: NamespacedFunctionName
    var InvokeArgs: BlobStream
  }

  /**
    * A success response (<code>202 Accepted</code>) indicates that the request is queued for invocation.
    */
  @deprecated("Deprecated in AWS SDK", "forever")
  @js.native
  @Factory
  trait InvokeAsyncResponse extends js.Object {
    var Status: js.UndefOr[HttpStatus]
  }

  @js.native
  sealed trait LastUpdateStatus extends js.Any
  object LastUpdateStatus extends js.Object {
    val Successful = "Successful".asInstanceOf[LastUpdateStatus]
    val Failed     = "Failed".asInstanceOf[LastUpdateStatus]
    val InProgress = "InProgress".asInstanceOf[LastUpdateStatus]

    val values = js.Object.freeze(js.Array(Successful, Failed, InProgress))
  }

  @js.native
  sealed trait LastUpdateStatusReasonCode extends js.Any
  object LastUpdateStatusReasonCode extends js.Object {
    val EniLimitExceeded            = "EniLimitExceeded".asInstanceOf[LastUpdateStatusReasonCode]
    val InsufficientRolePermissions = "InsufficientRolePermissions".asInstanceOf[LastUpdateStatusReasonCode]
    val InvalidConfiguration        = "InvalidConfiguration".asInstanceOf[LastUpdateStatusReasonCode]
    val InternalError               = "InternalError".asInstanceOf[LastUpdateStatusReasonCode]
    val SubnetOutOfIPAddresses      = "SubnetOutOfIPAddresses".asInstanceOf[LastUpdateStatusReasonCode]
    val InvalidSubnet               = "InvalidSubnet".asInstanceOf[LastUpdateStatusReasonCode]
    val InvalidSecurityGroup        = "InvalidSecurityGroup".asInstanceOf[LastUpdateStatusReasonCode]

    val values = js.Object.freeze(
      js.Array(
        EniLimitExceeded,
        InsufficientRolePermissions,
        InvalidConfiguration,
        InternalError,
        SubnetOutOfIPAddresses,
        InvalidSubnet,
        InvalidSecurityGroup
      )
    )
  }

  /**
    * An [[https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html|AWS Lambda layer]].
    */
  @js.native
  @Factory
  trait Layer extends js.Object {
    var Arn: js.UndefOr[LayerVersionArn]
    var CodeSize: js.UndefOr[Double]
  }

  /**
    * A ZIP archive that contains the contents of an [[https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html|AWS Lambda layer]]. You can specify either an Amazon S3 location, or upload a layer archive directly.
    */
  @js.native
  @Factory
  trait LayerVersionContentInput extends js.Object {
    var S3Bucket: js.UndefOr[S3Bucket]
    var S3Key: js.UndefOr[S3Key]
    var S3ObjectVersion: js.UndefOr[S3ObjectVersion]
    var ZipFile: js.UndefOr[Blob]
  }

  /**
    * Details about a version of an [[https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html|AWS Lambda layer]].
    */
  @js.native
  @Factory
  trait LayerVersionContentOutput extends js.Object {
    var CodeSha256: js.UndefOr[String]
    var CodeSize: js.UndefOr[Double]
    var Location: js.UndefOr[String]
  }

  /**
    * Details about a version of an [[https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html|AWS Lambda layer]].
    */
  @js.native
  @Factory
  trait LayerVersionsListItem extends js.Object {
    var CompatibleRuntimes: js.UndefOr[CompatibleRuntimes]
    var CreatedDate: js.UndefOr[Timestamp]
    var Description: js.UndefOr[Description]
    var LayerVersionArn: js.UndefOr[LayerVersionArn]
    var LicenseInfo: js.UndefOr[LicenseInfo]
    var Version: js.UndefOr[LayerVersionNumber]
  }

  /**
    * Details about an [[https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html|AWS Lambda layer]].
    */
  @js.native
  @Factory
  trait LayersListItem extends js.Object {
    var LatestMatchingVersion: js.UndefOr[LayerVersionsListItem]
    var LayerArn: js.UndefOr[LayerArn]
    var LayerName: js.UndefOr[LayerName]
  }

  @js.native
  @Factory
  trait ListAliasesRequest extends js.Object {
    var FunctionName: FunctionName
    var FunctionVersion: js.UndefOr[Version]
    var Marker: js.UndefOr[String]
    var MaxItems: js.UndefOr[MaxListItems]
  }

  @js.native
  @Factory
  trait ListAliasesResponse extends js.Object {
    var Aliases: js.UndefOr[AliasList]
    var NextMarker: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListEventSourceMappingsRequest extends js.Object {
    var EventSourceArn: js.UndefOr[Arn]
    var FunctionName: js.UndefOr[FunctionName]
    var Marker: js.UndefOr[String]
    var MaxItems: js.UndefOr[MaxListItems]
  }

  @js.native
  @Factory
  trait ListEventSourceMappingsResponse extends js.Object {
    var EventSourceMappings: js.UndefOr[EventSourceMappingsList]
    var NextMarker: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListFunctionEventInvokeConfigsRequest extends js.Object {
    var FunctionName: FunctionName
    var Marker: js.UndefOr[String]
    var MaxItems: js.UndefOr[MaxFunctionEventInvokeConfigListItems]
  }

  @js.native
  @Factory
  trait ListFunctionEventInvokeConfigsResponse extends js.Object {
    var FunctionEventInvokeConfigs: js.UndefOr[FunctionEventInvokeConfigList]
    var NextMarker: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListFunctionsRequest extends js.Object {
    var FunctionVersion: js.UndefOr[FunctionVersion]
    var Marker: js.UndefOr[String]
    var MasterRegion: js.UndefOr[MasterRegion]
    var MaxItems: js.UndefOr[MaxListItems]
  }

  /**
    * A list of Lambda functions.
    */
  @js.native
  @Factory
  trait ListFunctionsResponse extends js.Object {
    var Functions: js.UndefOr[FunctionList]
    var NextMarker: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListLayerVersionsRequest extends js.Object {
    var LayerName: LayerName
    var CompatibleRuntime: js.UndefOr[Runtime]
    var Marker: js.UndefOr[String]
    var MaxItems: js.UndefOr[MaxLayerListItems]
  }

  @js.native
  @Factory
  trait ListLayerVersionsResponse extends js.Object {
    var LayerVersions: js.UndefOr[LayerVersionsList]
    var NextMarker: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListLayersRequest extends js.Object {
    var CompatibleRuntime: js.UndefOr[Runtime]
    var Marker: js.UndefOr[String]
    var MaxItems: js.UndefOr[MaxLayerListItems]
  }

  @js.native
  @Factory
  trait ListLayersResponse extends js.Object {
    var Layers: js.UndefOr[LayersList]
    var NextMarker: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListProvisionedConcurrencyConfigsRequest extends js.Object {
    var FunctionName: FunctionName
    var Marker: js.UndefOr[String]
    var MaxItems: js.UndefOr[MaxProvisionedConcurrencyConfigListItems]
  }

  @js.native
  @Factory
  trait ListProvisionedConcurrencyConfigsResponse extends js.Object {
    var NextMarker: js.UndefOr[String]
    var ProvisionedConcurrencyConfigs: js.UndefOr[ProvisionedConcurrencyConfigList]
  }

  @js.native
  @Factory
  trait ListTagsRequest extends js.Object {
    var Resource: FunctionArn
  }

  @js.native
  @Factory
  trait ListTagsResponse extends js.Object {
    var Tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
  trait ListVersionsByFunctionRequest extends js.Object {
    var FunctionName: NamespacedFunctionName
    var Marker: js.UndefOr[String]
    var MaxItems: js.UndefOr[MaxListItems]
  }

  @js.native
  @Factory
  trait ListVersionsByFunctionResponse extends js.Object {
    var NextMarker: js.UndefOr[String]
    var Versions: js.UndefOr[FunctionList]
  }

  @js.native
  sealed trait LogType extends js.Any
  object LogType extends js.Object {
    val None = "None".asInstanceOf[LogType]
    val Tail = "Tail".asInstanceOf[LogType]

    val values = js.Object.freeze(js.Array(None, Tail))
  }

  /**
    * A destination for events that failed processing.
    */
  @js.native
  @Factory
  trait OnFailure extends js.Object {
    var Destination: js.UndefOr[DestinationArn]
  }

  /**
    * A destination for events that were processed successfully.
    */
  @js.native
  @Factory
  trait OnSuccess extends js.Object {
    var Destination: js.UndefOr[DestinationArn]
  }

  /**
    * Details about the provisioned concurrency configuration for a function alias or version.
    */
  @js.native
  @Factory
  trait ProvisionedConcurrencyConfigListItem extends js.Object {
    var AllocatedProvisionedConcurrentExecutions: js.UndefOr[NonNegativeInteger]
    var AvailableProvisionedConcurrentExecutions: js.UndefOr[NonNegativeInteger]
    var FunctionArn: js.UndefOr[FunctionArn]
    var LastModified: js.UndefOr[Timestamp]
    var RequestedProvisionedConcurrentExecutions: js.UndefOr[PositiveInteger]
    var Status: js.UndefOr[ProvisionedConcurrencyStatusEnum]
    var StatusReason: js.UndefOr[String]
  }

  @js.native
  sealed trait ProvisionedConcurrencyStatusEnum extends js.Any
  object ProvisionedConcurrencyStatusEnum extends js.Object {
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[ProvisionedConcurrencyStatusEnum]
    val READY       = "READY".asInstanceOf[ProvisionedConcurrencyStatusEnum]
    val FAILED      = "FAILED".asInstanceOf[ProvisionedConcurrencyStatusEnum]

    val values = js.Object.freeze(js.Array(IN_PROGRESS, READY, FAILED))
  }

  @js.native
  @Factory
  trait PublishLayerVersionRequest extends js.Object {
    var Content: LayerVersionContentInput
    var LayerName: LayerName
    var CompatibleRuntimes: js.UndefOr[CompatibleRuntimes]
    var Description: js.UndefOr[Description]
    var LicenseInfo: js.UndefOr[LicenseInfo]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait PublishVersionRequest extends js.Object {
    var FunctionName: FunctionName
    var CodeSha256: js.UndefOr[String]
    var Description: js.UndefOr[Description]
    var RevisionId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait PutFunctionConcurrencyRequest extends js.Object {
    var FunctionName: FunctionName
    var ReservedConcurrentExecutions: ReservedConcurrentExecutions
  }

  @js.native
  @Factory
  trait PutFunctionEventInvokeConfigRequest extends js.Object {
    var FunctionName: FunctionName
    var DestinationConfig: js.UndefOr[DestinationConfig]
    var MaximumEventAgeInSeconds: js.UndefOr[MaximumEventAgeInSeconds]
    var MaximumRetryAttempts: js.UndefOr[MaximumRetryAttempts]
    var Qualifier: js.UndefOr[Qualifier]
  }

  @js.native
  @Factory
  trait PutProvisionedConcurrencyConfigRequest extends js.Object {
    var FunctionName: FunctionName
    var ProvisionedConcurrentExecutions: PositiveInteger
    var Qualifier: Qualifier
  }

  @js.native
  @Factory
  trait PutProvisionedConcurrencyConfigResponse extends js.Object {
    var AllocatedProvisionedConcurrentExecutions: js.UndefOr[NonNegativeInteger]
    var AvailableProvisionedConcurrentExecutions: js.UndefOr[NonNegativeInteger]
    var LastModified: js.UndefOr[Timestamp]
    var RequestedProvisionedConcurrentExecutions: js.UndefOr[PositiveInteger]
    var Status: js.UndefOr[ProvisionedConcurrencyStatusEnum]
    var StatusReason: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait RemoveLayerVersionPermissionRequest extends js.Object {
    var LayerName: LayerName
    var StatementId: StatementId
    var VersionNumber: LayerVersionNumber
    var RevisionId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait RemovePermissionRequest extends js.Object {
    var FunctionName: FunctionName
    var StatementId: NamespacedStatementId
    var Qualifier: js.UndefOr[Qualifier]
    var RevisionId: js.UndefOr[String]
  }

  @js.native
  sealed trait Runtime extends js.Any
  object Runtime extends js.Object {
    val nodejs           = "nodejs".asInstanceOf[Runtime]
    val `nodejs4.3`      = "nodejs4.3".asInstanceOf[Runtime]
    val `nodejs6.10`     = "nodejs6.10".asInstanceOf[Runtime]
    val `nodejs8.10`     = "nodejs8.10".asInstanceOf[Runtime]
    val `nodejs10.x`     = "nodejs10.x".asInstanceOf[Runtime]
    val `nodejs12.x`     = "nodejs12.x".asInstanceOf[Runtime]
    val java8            = "java8".asInstanceOf[Runtime]
    val java11           = "java11".asInstanceOf[Runtime]
    val `python2.7`      = "python2.7".asInstanceOf[Runtime]
    val `python3.6`      = "python3.6".asInstanceOf[Runtime]
    val `python3.7`      = "python3.7".asInstanceOf[Runtime]
    val `python3.8`      = "python3.8".asInstanceOf[Runtime]
    val `dotnetcore1.0`  = "dotnetcore1.0".asInstanceOf[Runtime]
    val `dotnetcore2.0`  = "dotnetcore2.0".asInstanceOf[Runtime]
    val `dotnetcore2.1`  = "dotnetcore2.1".asInstanceOf[Runtime]
    val `nodejs4.3-edge` = "nodejs4.3-edge".asInstanceOf[Runtime]
    val `go1.x`          = "go1.x".asInstanceOf[Runtime]
    val `ruby2.5`        = "ruby2.5".asInstanceOf[Runtime]
    val `ruby2.7`        = "ruby2.7".asInstanceOf[Runtime]
    val provided         = "provided".asInstanceOf[Runtime]

    val values = js.Object.freeze(
      js.Array(
        nodejs,
        `nodejs4.3`,
        `nodejs6.10`,
        `nodejs8.10`,
        `nodejs10.x`,
        `nodejs12.x`,
        java8,
        java11,
        `python2.7`,
        `python3.6`,
        `python3.7`,
        `python3.8`,
        `dotnetcore1.0`,
        `dotnetcore2.0`,
        `dotnetcore2.1`,
        `nodejs4.3-edge`,
        `go1.x`,
        `ruby2.5`,
        `ruby2.7`,
        provided
      )
    )
  }

  @js.native
  sealed trait State extends js.Any
  object State extends js.Object {
    val Pending  = "Pending".asInstanceOf[State]
    val Active   = "Active".asInstanceOf[State]
    val Inactive = "Inactive".asInstanceOf[State]
    val Failed   = "Failed".asInstanceOf[State]

    val values = js.Object.freeze(js.Array(Pending, Active, Inactive, Failed))
  }

  @js.native
  sealed trait StateReasonCode extends js.Any
  object StateReasonCode extends js.Object {
    val Idle                        = "Idle".asInstanceOf[StateReasonCode]
    val Creating                    = "Creating".asInstanceOf[StateReasonCode]
    val Restoring                   = "Restoring".asInstanceOf[StateReasonCode]
    val EniLimitExceeded            = "EniLimitExceeded".asInstanceOf[StateReasonCode]
    val InsufficientRolePermissions = "InsufficientRolePermissions".asInstanceOf[StateReasonCode]
    val InvalidConfiguration        = "InvalidConfiguration".asInstanceOf[StateReasonCode]
    val InternalError               = "InternalError".asInstanceOf[StateReasonCode]
    val SubnetOutOfIPAddresses      = "SubnetOutOfIPAddresses".asInstanceOf[StateReasonCode]
    val InvalidSubnet               = "InvalidSubnet".asInstanceOf[StateReasonCode]
    val InvalidSecurityGroup        = "InvalidSecurityGroup".asInstanceOf[StateReasonCode]

    val values = js.Object.freeze(
      js.Array(
        Idle,
        Creating,
        Restoring,
        EniLimitExceeded,
        InsufficientRolePermissions,
        InvalidConfiguration,
        InternalError,
        SubnetOutOfIPAddresses,
        InvalidSubnet,
        InvalidSecurityGroup
      )
    )
  }

  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var Resource: FunctionArn
    var Tags: Tags
  }

  /**
    * The function's AWS X-Ray tracing configuration. To sample and record incoming requests, set <code>Mode</code> to <code>Active</code>.
    */
  @js.native
  @Factory
  trait TracingConfig extends js.Object {
    var Mode: js.UndefOr[TracingMode]
  }

  /**
    * The function's AWS X-Ray tracing configuration.
    */
  @js.native
  @Factory
  trait TracingConfigResponse extends js.Object {
    var Mode: js.UndefOr[TracingMode]
  }

  @js.native
  sealed trait TracingMode extends js.Any
  object TracingMode extends js.Object {
    val Active      = "Active".asInstanceOf[TracingMode]
    val PassThrough = "PassThrough".asInstanceOf[TracingMode]

    val values = js.Object.freeze(js.Array(Active, PassThrough))
  }

  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var Resource: FunctionArn
    var TagKeys: TagKeyList
  }

  @js.native
  @Factory
  trait UpdateAliasRequest extends js.Object {
    var FunctionName: FunctionName
    var Name: Alias
    var Description: js.UndefOr[Description]
    var FunctionVersion: js.UndefOr[Version]
    var RevisionId: js.UndefOr[String]
    var RoutingConfig: js.UndefOr[AliasRoutingConfiguration]
  }

  @js.native
  @Factory
  trait UpdateEventSourceMappingRequest extends js.Object {
    var UUID: String
    var BatchSize: js.UndefOr[BatchSize]
    var BisectBatchOnFunctionError: js.UndefOr[BisectBatchOnFunctionError]
    var DestinationConfig: js.UndefOr[DestinationConfig]
    var Enabled: js.UndefOr[Enabled]
    var FunctionName: js.UndefOr[FunctionName]
    var MaximumBatchingWindowInSeconds: js.UndefOr[MaximumBatchingWindowInSeconds]
    var MaximumRecordAgeInSeconds: js.UndefOr[MaximumRecordAgeInSeconds]
    var MaximumRetryAttempts: js.UndefOr[MaximumRetryAttemptsEventSourceMapping]
    var ParallelizationFactor: js.UndefOr[ParallelizationFactor]
  }

  @js.native
  @Factory
  trait UpdateFunctionCodeRequest extends js.Object {
    var FunctionName: FunctionName
    var DryRun: js.UndefOr[Boolean]
    var Publish: js.UndefOr[Boolean]
    var RevisionId: js.UndefOr[String]
    var S3Bucket: js.UndefOr[S3Bucket]
    var S3Key: js.UndefOr[S3Key]
    var S3ObjectVersion: js.UndefOr[S3ObjectVersion]
    var ZipFile: js.UndefOr[Blob]
  }

  @js.native
  @Factory
  trait UpdateFunctionConfigurationRequest extends js.Object {
    var FunctionName: FunctionName
    var DeadLetterConfig: js.UndefOr[DeadLetterConfig]
    var Description: js.UndefOr[Description]
    var Environment: js.UndefOr[Environment]
    var Handler: js.UndefOr[Handler]
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

  @js.native
  @Factory
  trait UpdateFunctionEventInvokeConfigRequest extends js.Object {
    var FunctionName: FunctionName
    var DestinationConfig: js.UndefOr[DestinationConfig]
    var MaximumEventAgeInSeconds: js.UndefOr[MaximumEventAgeInSeconds]
    var MaximumRetryAttempts: js.UndefOr[MaximumRetryAttempts]
    var Qualifier: js.UndefOr[Qualifier]
  }

  /**
    * The VPC security groups and subnets that are attached to a Lambda function. For more information, see [[https://docs.aws.amazon.com/lambda/latest/dg/configuration-vpc.html|VPC Settings]].
    */
  @js.native
  @Factory
  trait VpcConfig extends js.Object {
    var SecurityGroupIds: js.UndefOr[SecurityGroupIds]
    var SubnetIds: js.UndefOr[SubnetIds]
  }

  /**
    * The VPC security groups and subnets that are attached to a Lambda function.
    */
  @js.native
  @Factory
  trait VpcConfigResponse extends js.Object {
    var SecurityGroupIds: js.UndefOr[SecurityGroupIds]
    var SubnetIds: js.UndefOr[SubnetIds]
    var VpcId: js.UndefOr[VpcId]
  }
}
