package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object lambda {
  type Action = String
  type AdditionalVersion = String
  type AdditionalVersionWeights = js.Dictionary[Weight]
  type Alias = String
  type AliasList = js.Array[AliasConfiguration]
  type Arn = String
  type BatchSize = Int
  type Blob = nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type BlobStream = nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type CompatibleRuntimes = js.Array[Runtime]
  type Date = js.Date
  type Description = String
  type Enabled = Boolean
  type EnvironmentVariableName = String
  type EnvironmentVariableValue = String
  type EnvironmentVariables = js.Dictionary[EnvironmentVariableValue]
  type EventSourceMappingsList = js.Array[EventSourceMappingConfiguration]
  type EventSourcePosition = String
  type EventSourceToken = String
  type FunctionArn = String
  type FunctionList = js.Array[FunctionConfiguration]
  type FunctionName = String
  type FunctionVersion = String
  type Handler = String
  type HttpStatus = Int
  type InvocationType = String
  type KMSKeyArn = String
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
  type LogType = String
  type MasterRegion = String
  type MaxLayerListItems = Int
  type MaxListItems = Int
  type MemorySize = Int
  type NameSpacedFunctionArn = String
  type NamespacedFunctionName = String
  type NamespacedStatementId = String
  type OrganizationId = String
  type Principal = String
  type Qualifier = String
  type ReservedConcurrentExecutions = Int
  type ResourceArn = String
  type RoleArn = String
  type Runtime = String
  type S3Bucket = String
  type S3Key = String
  type S3ObjectVersion = String
  type SecurityGroupId = String
  type SecurityGroupIds = js.Array[SecurityGroupId]
  type SensitiveString = String
  type SourceOwner = String
  type StatementId = String
  type SubnetId = String
  type SubnetIds = js.Array[SubnetId]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagValue = String
  type Tags = js.Dictionary[TagValue]
  type Timeout = Int
  type Timestamp = String
  type TracingMode = String
  type UnreservedConcurrentExecutions = Int
  type Version = String
  type VpcId = String
  type Weight = Double
}

package lambda {
  @js.native
  @JSImport("aws-sdk", "Lambda")
  class Lambda(config: AWSConfig) extends js.Object {
    def addLayerVersionPermission(params: AddLayerVersionPermissionRequest): Request[AddLayerVersionPermissionResponse] = js.native
    def addPermission(params: AddPermissionRequest): Request[AddPermissionResponse] = js.native
    def createAlias(params: CreateAliasRequest): Request[AliasConfiguration] = js.native
    def createEventSourceMapping(params: CreateEventSourceMappingRequest): Request[EventSourceMappingConfiguration] = js.native
    def createFunction(params: CreateFunctionRequest): Request[FunctionConfiguration] = js.native
    def deleteAlias(params: DeleteAliasRequest): Request[js.Object] = js.native
    def deleteEventSourceMapping(params: DeleteEventSourceMappingRequest): Request[EventSourceMappingConfiguration] = js.native
    def deleteFunction(params: DeleteFunctionRequest): Request[js.Object] = js.native
    def deleteFunctionConcurrency(params: DeleteFunctionConcurrencyRequest): Request[js.Object] = js.native
    def deleteLayerVersion(params: DeleteLayerVersionRequest): Request[js.Object] = js.native
    def getAccountSettings(params: GetAccountSettingsRequest): Request[GetAccountSettingsResponse] = js.native
    def getAlias(params: GetAliasRequest): Request[AliasConfiguration] = js.native
    def getEventSourceMapping(params: GetEventSourceMappingRequest): Request[EventSourceMappingConfiguration] = js.native
    def getFunction(params: GetFunctionRequest): Request[GetFunctionResponse] = js.native
    def getFunctionConfiguration(params: GetFunctionConfigurationRequest): Request[FunctionConfiguration] = js.native
    def getLayerVersion(params: GetLayerVersionRequest): Request[GetLayerVersionResponse] = js.native
    def getLayerVersionPolicy(params: GetLayerVersionPolicyRequest): Request[GetLayerVersionPolicyResponse] = js.native
    def getPolicy(params: GetPolicyRequest): Request[GetPolicyResponse] = js.native
    def invoke(params: InvocationRequest): Request[InvocationResponse] = js.native
    def invokeAsync(params: InvokeAsyncRequest): Request[InvokeAsyncResponse] = js.native
    def listAliases(params: ListAliasesRequest): Request[ListAliasesResponse] = js.native
    def listEventSourceMappings(params: ListEventSourceMappingsRequest): Request[ListEventSourceMappingsResponse] = js.native
    def listFunctions(params: ListFunctionsRequest): Request[ListFunctionsResponse] = js.native
    def listLayerVersions(params: ListLayerVersionsRequest): Request[ListLayerVersionsResponse] = js.native
    def listLayers(params: ListLayersRequest): Request[ListLayersResponse] = js.native
    def listTags(params: ListTagsRequest): Request[ListTagsResponse] = js.native
    def listVersionsByFunction(params: ListVersionsByFunctionRequest): Request[ListVersionsByFunctionResponse] = js.native
    def publishLayerVersion(params: PublishLayerVersionRequest): Request[PublishLayerVersionResponse] = js.native
    def publishVersion(params: PublishVersionRequest): Request[FunctionConfiguration] = js.native
    def putFunctionConcurrency(params: PutFunctionConcurrencyRequest): Request[Concurrency] = js.native
    def removeLayerVersionPermission(params: RemoveLayerVersionPermissionRequest): Request[js.Object] = js.native
    def removePermission(params: RemovePermissionRequest): Request[js.Object] = js.native
    def tagResource(params: TagResourceRequest): Request[js.Object] = js.native
    def untagResource(params: UntagResourceRequest): Request[js.Object] = js.native
    def updateAlias(params: UpdateAliasRequest): Request[AliasConfiguration] = js.native
    def updateEventSourceMapping(params: UpdateEventSourceMappingRequest): Request[EventSourceMappingConfiguration] = js.native
    def updateFunctionCode(params: UpdateFunctionCodeRequest): Request[FunctionConfiguration] = js.native
    def updateFunctionConfiguration(params: UpdateFunctionConfigurationRequest): Request[FunctionConfiguration] = js.native
  }

  /**
   * <p>Provides limits of code size and concurrency associated with the current account and region. For more information or to request a limit increase for concurrent executions, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/limits.html">Lambda Limits</a>. </p>
   */
  @js.native
  trait AccountLimit extends js.Object {
    var CodeSizeZipped: js.UndefOr[Double]
    var ConcurrentExecutions: js.UndefOr[Int]
    var TotalCodeSize: js.UndefOr[Double]
    var CodeSizeUnzipped: js.UndefOr[Double]
    var UnreservedConcurrentExecutions: js.UndefOr[UnreservedConcurrentExecutions]
  }

  object AccountLimit {
    def apply(
      CodeSizeZipped: js.UndefOr[Double] = js.undefined,
      ConcurrentExecutions: js.UndefOr[Int] = js.undefined,
      TotalCodeSize: js.UndefOr[Double] = js.undefined,
      CodeSizeUnzipped: js.UndefOr[Double] = js.undefined,
      UnreservedConcurrentExecutions: js.UndefOr[UnreservedConcurrentExecutions] = js.undefined): AccountLimit = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CodeSizeZipped" -> CodeSizeZipped.map { x => x.asInstanceOf[js.Any] },
        "ConcurrentExecutions" -> ConcurrentExecutions.map { x => x.asInstanceOf[js.Any] },
        "TotalCodeSize" -> TotalCodeSize.map { x => x.asInstanceOf[js.Any] },
        "CodeSizeUnzipped" -> CodeSizeUnzipped.map { x => x.asInstanceOf[js.Any] },
        "UnreservedConcurrentExecutions" -> UnreservedConcurrentExecutions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AccountLimit]
    }
  }

  /**
   * <p>Provides code size usage and function count associated with the current account and region.</p>
   */
  @js.native
  trait AccountUsage extends js.Object {
    var TotalCodeSize: js.UndefOr[Double]
    var FunctionCount: js.UndefOr[Double]
  }

  object AccountUsage {
    def apply(
      TotalCodeSize: js.UndefOr[Double] = js.undefined,
      FunctionCount: js.UndefOr[Double] = js.undefined): AccountUsage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TotalCodeSize" -> TotalCodeSize.map { x => x.asInstanceOf[js.Any] },
        "FunctionCount" -> FunctionCount.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AccountUsage]
    }
  }

  @js.native
  trait AddLayerVersionPermissionRequest extends js.Object {
    var Principal: js.UndefOr[LayerPermissionAllowedPrincipal]
    var LayerName: js.UndefOr[LayerName]
    var VersionNumber: js.UndefOr[LayerVersionNumber]
    var OrganizationId: js.UndefOr[OrganizationId]
    var RevisionId: js.UndefOr[String]
    var StatementId: js.UndefOr[StatementId]
    var Action: js.UndefOr[LayerPermissionAllowedAction]
  }

  object AddLayerVersionPermissionRequest {
    def apply(
      Principal: js.UndefOr[LayerPermissionAllowedPrincipal] = js.undefined,
      LayerName: js.UndefOr[LayerName] = js.undefined,
      VersionNumber: js.UndefOr[LayerVersionNumber] = js.undefined,
      OrganizationId: js.UndefOr[OrganizationId] = js.undefined,
      RevisionId: js.UndefOr[String] = js.undefined,
      StatementId: js.UndefOr[StatementId] = js.undefined,
      Action: js.UndefOr[LayerPermissionAllowedAction] = js.undefined): AddLayerVersionPermissionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Principal" -> Principal.map { x => x.asInstanceOf[js.Any] },
        "LayerName" -> LayerName.map { x => x.asInstanceOf[js.Any] },
        "VersionNumber" -> VersionNumber.map { x => x.asInstanceOf[js.Any] },
        "OrganizationId" -> OrganizationId.map { x => x.asInstanceOf[js.Any] },
        "RevisionId" -> RevisionId.map { x => x.asInstanceOf[js.Any] },
        "StatementId" -> StatementId.map { x => x.asInstanceOf[js.Any] },
        "Action" -> Action.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddLayerVersionPermissionRequest]
    }
  }

  @js.native
  trait AddLayerVersionPermissionResponse extends js.Object {
    var Statement: js.UndefOr[String]
    var RevisionId: js.UndefOr[String]
  }

  object AddLayerVersionPermissionResponse {
    def apply(
      Statement: js.UndefOr[String] = js.undefined,
      RevisionId: js.UndefOr[String] = js.undefined): AddLayerVersionPermissionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Statement" -> Statement.map { x => x.asInstanceOf[js.Any] },
        "RevisionId" -> RevisionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddLayerVersionPermissionResponse]
    }
  }

  @js.native
  trait AddPermissionRequest extends js.Object {
    var EventSourceToken: js.UndefOr[EventSourceToken]
    var Principal: js.UndefOr[Principal]
    var Qualifier: js.UndefOr[Qualifier]
    var FunctionName: js.UndefOr[FunctionName]
    var RevisionId: js.UndefOr[String]
    var StatementId: js.UndefOr[StatementId]
    var SourceAccount: js.UndefOr[SourceOwner]
    var SourceArn: js.UndefOr[Arn]
    var Action: js.UndefOr[Action]
  }

  object AddPermissionRequest {
    def apply(
      EventSourceToken: js.UndefOr[EventSourceToken] = js.undefined,
      Principal: js.UndefOr[Principal] = js.undefined,
      Qualifier: js.UndefOr[Qualifier] = js.undefined,
      FunctionName: js.UndefOr[FunctionName] = js.undefined,
      RevisionId: js.UndefOr[String] = js.undefined,
      StatementId: js.UndefOr[StatementId] = js.undefined,
      SourceAccount: js.UndefOr[SourceOwner] = js.undefined,
      SourceArn: js.UndefOr[Arn] = js.undefined,
      Action: js.UndefOr[Action] = js.undefined): AddPermissionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EventSourceToken" -> EventSourceToken.map { x => x.asInstanceOf[js.Any] },
        "Principal" -> Principal.map { x => x.asInstanceOf[js.Any] },
        "Qualifier" -> Qualifier.map { x => x.asInstanceOf[js.Any] },
        "FunctionName" -> FunctionName.map { x => x.asInstanceOf[js.Any] },
        "RevisionId" -> RevisionId.map { x => x.asInstanceOf[js.Any] },
        "StatementId" -> StatementId.map { x => x.asInstanceOf[js.Any] },
        "SourceAccount" -> SourceAccount.map { x => x.asInstanceOf[js.Any] },
        "SourceArn" -> SourceArn.map { x => x.asInstanceOf[js.Any] },
        "Action" -> Action.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddPermissionRequest]
    }
  }

  @js.native
  trait AddPermissionResponse extends js.Object {
    var Statement: js.UndefOr[String]
  }

  object AddPermissionResponse {
    def apply(
      Statement: js.UndefOr[String] = js.undefined): AddPermissionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Statement" -> Statement.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddPermissionResponse]
    }
  }

  /**
   * <p>Provides configuration information about a Lambda function version alias.</p>
   */
  @js.native
  trait AliasConfiguration extends js.Object {
    var Name: js.UndefOr[Alias]
    var Description: js.UndefOr[Description]
    var RoutingConfig: js.UndefOr[AliasRoutingConfiguration]
    var RevisionId: js.UndefOr[String]
    var FunctionVersion: js.UndefOr[Version]
    var AliasArn: js.UndefOr[FunctionArn]
  }

  object AliasConfiguration {
    def apply(
      Name: js.UndefOr[Alias] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined,
      RoutingConfig: js.UndefOr[AliasRoutingConfiguration] = js.undefined,
      RevisionId: js.UndefOr[String] = js.undefined,
      FunctionVersion: js.UndefOr[Version] = js.undefined,
      AliasArn: js.UndefOr[FunctionArn] = js.undefined): AliasConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "RoutingConfig" -> RoutingConfig.map { x => x.asInstanceOf[js.Any] },
        "RevisionId" -> RevisionId.map { x => x.asInstanceOf[js.Any] },
        "FunctionVersion" -> FunctionVersion.map { x => x.asInstanceOf[js.Any] },
        "AliasArn" -> AliasArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AliasConfiguration]
    }
  }

  /**
   * <p>The alias's <a href="http://docs.aws.amazon.com/lambda/latest/dg/lambda-traffic-shifting-using-aliases.html">traffic shifting</a> configuration.</p>
   */
  @js.native
  trait AliasRoutingConfiguration extends js.Object {
    var AdditionalVersionWeights: js.UndefOr[AdditionalVersionWeights]
  }

  object AliasRoutingConfiguration {
    def apply(
      AdditionalVersionWeights: js.UndefOr[AdditionalVersionWeights] = js.undefined): AliasRoutingConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AdditionalVersionWeights" -> AdditionalVersionWeights.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AliasRoutingConfiguration]
    }
  }

  @js.native
  trait Concurrency extends js.Object {
    var ReservedConcurrentExecutions: js.UndefOr[ReservedConcurrentExecutions]
  }

  object Concurrency {
    def apply(
      ReservedConcurrentExecutions: js.UndefOr[ReservedConcurrentExecutions] = js.undefined): Concurrency = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReservedConcurrentExecutions" -> ReservedConcurrentExecutions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Concurrency]
    }
  }

  @js.native
  trait CreateAliasRequest extends js.Object {
    var Name: js.UndefOr[Alias]
    var FunctionName: js.UndefOr[FunctionName]
    var Description: js.UndefOr[Description]
    var RoutingConfig: js.UndefOr[AliasRoutingConfiguration]
    var FunctionVersion: js.UndefOr[Version]
  }

  object CreateAliasRequest {
    def apply(
      Name: js.UndefOr[Alias] = js.undefined,
      FunctionName: js.UndefOr[FunctionName] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined,
      RoutingConfig: js.UndefOr[AliasRoutingConfiguration] = js.undefined,
      FunctionVersion: js.UndefOr[Version] = js.undefined): CreateAliasRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "FunctionName" -> FunctionName.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "RoutingConfig" -> RoutingConfig.map { x => x.asInstanceOf[js.Any] },
        "FunctionVersion" -> FunctionVersion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAliasRequest]
    }
  }

  @js.native
  trait CreateEventSourceMappingRequest extends js.Object {
    var StartingPositionTimestamp: js.UndefOr[Date]
    var Enabled: js.UndefOr[Enabled]
    var FunctionName: js.UndefOr[FunctionName]
    var StartingPosition: js.UndefOr[EventSourcePosition]
    var EventSourceArn: js.UndefOr[Arn]
    var BatchSize: js.UndefOr[BatchSize]
  }

  object CreateEventSourceMappingRequest {
    def apply(
      StartingPositionTimestamp: js.UndefOr[Date] = js.undefined,
      Enabled: js.UndefOr[Enabled] = js.undefined,
      FunctionName: js.UndefOr[FunctionName] = js.undefined,
      StartingPosition: js.UndefOr[EventSourcePosition] = js.undefined,
      EventSourceArn: js.UndefOr[Arn] = js.undefined,
      BatchSize: js.UndefOr[BatchSize] = js.undefined): CreateEventSourceMappingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StartingPositionTimestamp" -> StartingPositionTimestamp.map { x => x.asInstanceOf[js.Any] },
        "Enabled" -> Enabled.map { x => x.asInstanceOf[js.Any] },
        "FunctionName" -> FunctionName.map { x => x.asInstanceOf[js.Any] },
        "StartingPosition" -> StartingPosition.map { x => x.asInstanceOf[js.Any] },
        "EventSourceArn" -> EventSourceArn.map { x => x.asInstanceOf[js.Any] },
        "BatchSize" -> BatchSize.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateEventSourceMappingRequest]
    }
  }

  @js.native
  trait CreateFunctionRequest extends js.Object {
    var Environment: js.UndefOr[Environment]
    var DeadLetterConfig: js.UndefOr[DeadLetterConfig]
    var Role: js.UndefOr[RoleArn]
    var Handler: js.UndefOr[Handler]
    var Code: js.UndefOr[FunctionCode]
    var FunctionName: js.UndefOr[FunctionName]
    var Description: js.UndefOr[Description]
    var MemorySize: js.UndefOr[MemorySize]
    var Layers: js.UndefOr[LayerList]
    var VpcConfig: js.UndefOr[VpcConfig]
    var Runtime: js.UndefOr[Runtime]
    var Tags: js.UndefOr[Tags]
    var KMSKeyArn: js.UndefOr[KMSKeyArn]
    var TracingConfig: js.UndefOr[TracingConfig]
    var Publish: js.UndefOr[Boolean]
    var Timeout: js.UndefOr[Timeout]
  }

  object CreateFunctionRequest {
    def apply(
      Environment: js.UndefOr[Environment] = js.undefined,
      DeadLetterConfig: js.UndefOr[DeadLetterConfig] = js.undefined,
      Role: js.UndefOr[RoleArn] = js.undefined,
      Handler: js.UndefOr[Handler] = js.undefined,
      Code: js.UndefOr[FunctionCode] = js.undefined,
      FunctionName: js.UndefOr[FunctionName] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined,
      MemorySize: js.UndefOr[MemorySize] = js.undefined,
      Layers: js.UndefOr[LayerList] = js.undefined,
      VpcConfig: js.UndefOr[VpcConfig] = js.undefined,
      Runtime: js.UndefOr[Runtime] = js.undefined,
      Tags: js.UndefOr[Tags] = js.undefined,
      KMSKeyArn: js.UndefOr[KMSKeyArn] = js.undefined,
      TracingConfig: js.UndefOr[TracingConfig] = js.undefined,
      Publish: js.UndefOr[Boolean] = js.undefined,
      Timeout: js.UndefOr[Timeout] = js.undefined): CreateFunctionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Environment" -> Environment.map { x => x.asInstanceOf[js.Any] },
        "DeadLetterConfig" -> DeadLetterConfig.map { x => x.asInstanceOf[js.Any] },
        "Role" -> Role.map { x => x.asInstanceOf[js.Any] },
        "Handler" -> Handler.map { x => x.asInstanceOf[js.Any] },
        "Code" -> Code.map { x => x.asInstanceOf[js.Any] },
        "FunctionName" -> FunctionName.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "MemorySize" -> MemorySize.map { x => x.asInstanceOf[js.Any] },
        "Layers" -> Layers.map { x => x.asInstanceOf[js.Any] },
        "VpcConfig" -> VpcConfig.map { x => x.asInstanceOf[js.Any] },
        "Runtime" -> Runtime.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "KMSKeyArn" -> KMSKeyArn.map { x => x.asInstanceOf[js.Any] },
        "TracingConfig" -> TracingConfig.map { x => x.asInstanceOf[js.Any] },
        "Publish" -> Publish.map { x => x.asInstanceOf[js.Any] },
        "Timeout" -> Timeout.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateFunctionRequest]
    }
  }

  /**
   * <p>The <a href="http://docs.aws.amazon.com/lambda/latest/dg/dlq.html">dead letter queue</a> for failed asynchronous invocations.</p>
   */
  @js.native
  trait DeadLetterConfig extends js.Object {
    var TargetArn: js.UndefOr[ResourceArn]
  }

  object DeadLetterConfig {
    def apply(
      TargetArn: js.UndefOr[ResourceArn] = js.undefined): DeadLetterConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TargetArn" -> TargetArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeadLetterConfig]
    }
  }

  @js.native
  trait DeleteAliasRequest extends js.Object {
    var FunctionName: js.UndefOr[FunctionName]
    var Name: js.UndefOr[Alias]
  }

  object DeleteAliasRequest {
    def apply(
      FunctionName: js.UndefOr[FunctionName] = js.undefined,
      Name: js.UndefOr[Alias] = js.undefined): DeleteAliasRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FunctionName" -> FunctionName.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAliasRequest]
    }
  }

  @js.native
  trait DeleteEventSourceMappingRequest extends js.Object {
    var UUID: js.UndefOr[String]
  }

  object DeleteEventSourceMappingRequest {
    def apply(
      UUID: js.UndefOr[String] = js.undefined): DeleteEventSourceMappingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UUID" -> UUID.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteEventSourceMappingRequest]
    }
  }

  @js.native
  trait DeleteFunctionConcurrencyRequest extends js.Object {
    var FunctionName: js.UndefOr[FunctionName]
  }

  object DeleteFunctionConcurrencyRequest {
    def apply(
      FunctionName: js.UndefOr[FunctionName] = js.undefined): DeleteFunctionConcurrencyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FunctionName" -> FunctionName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteFunctionConcurrencyRequest]
    }
  }

  @js.native
  trait DeleteFunctionRequest extends js.Object {
    var FunctionName: js.UndefOr[FunctionName]
    var Qualifier: js.UndefOr[Qualifier]
  }

  object DeleteFunctionRequest {
    def apply(
      FunctionName: js.UndefOr[FunctionName] = js.undefined,
      Qualifier: js.UndefOr[Qualifier] = js.undefined): DeleteFunctionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FunctionName" -> FunctionName.map { x => x.asInstanceOf[js.Any] },
        "Qualifier" -> Qualifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteFunctionRequest]
    }
  }

  @js.native
  trait DeleteLayerVersionRequest extends js.Object {
    var LayerName: js.UndefOr[LayerName]
    var VersionNumber: js.UndefOr[LayerVersionNumber]
  }

  object DeleteLayerVersionRequest {
    def apply(
      LayerName: js.UndefOr[LayerName] = js.undefined,
      VersionNumber: js.UndefOr[LayerVersionNumber] = js.undefined): DeleteLayerVersionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LayerName" -> LayerName.map { x => x.asInstanceOf[js.Any] },
        "VersionNumber" -> VersionNumber.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteLayerVersionRequest]
    }
  }

  /**
   * <p>A function's environment variable settings.</p>
   */
  @js.native
  trait Environment extends js.Object {
    var Variables: js.UndefOr[EnvironmentVariables]
  }

  object Environment {
    def apply(
      Variables: js.UndefOr[EnvironmentVariables] = js.undefined): Environment = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Variables" -> Variables.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Environment]
    }
  }

  /**
   * <p>Error messages for environment variables that could not be applied.</p>
   */
  @js.native
  trait EnvironmentError extends js.Object {
    var ErrorCode: js.UndefOr[String]
    var Message: js.UndefOr[SensitiveString]
  }

  object EnvironmentError {
    def apply(
      ErrorCode: js.UndefOr[String] = js.undefined,
      Message: js.UndefOr[SensitiveString] = js.undefined): EnvironmentError = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ErrorCode" -> ErrorCode.map { x => x.asInstanceOf[js.Any] },
        "Message" -> Message.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnvironmentError]
    }
  }

  /**
   * <p>The results of a configuration update that applied environment variables.</p>
   */
  @js.native
  trait EnvironmentResponse extends js.Object {
    var Variables: js.UndefOr[EnvironmentVariables]
    var Error: js.UndefOr[EnvironmentError]
  }

  object EnvironmentResponse {
    def apply(
      Variables: js.UndefOr[EnvironmentVariables] = js.undefined,
      Error: js.UndefOr[EnvironmentError] = js.undefined): EnvironmentResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Variables" -> Variables.map { x => x.asInstanceOf[js.Any] },
        "Error" -> Error.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnvironmentResponse]
    }
  }

  /**
   * <p>A mapping between an AWS resource and an AWS Lambda function. See <a>CreateEventSourceMapping</a> for details.</p>
   */
  @js.native
  trait EventSourceMappingConfiguration extends js.Object {
    var LastProcessingResult: js.UndefOr[String]
    var UUID: js.UndefOr[String]
    var FunctionArn: js.UndefOr[FunctionArn]
    var LastModified: js.UndefOr[Date]
    var EventSourceArn: js.UndefOr[Arn]
    var StateTransitionReason: js.UndefOr[String]
    var State: js.UndefOr[String]
    var BatchSize: js.UndefOr[BatchSize]
  }

  object EventSourceMappingConfiguration {
    def apply(
      LastProcessingResult: js.UndefOr[String] = js.undefined,
      UUID: js.UndefOr[String] = js.undefined,
      FunctionArn: js.UndefOr[FunctionArn] = js.undefined,
      LastModified: js.UndefOr[Date] = js.undefined,
      EventSourceArn: js.UndefOr[Arn] = js.undefined,
      StateTransitionReason: js.UndefOr[String] = js.undefined,
      State: js.UndefOr[String] = js.undefined,
      BatchSize: js.UndefOr[BatchSize] = js.undefined): EventSourceMappingConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LastProcessingResult" -> LastProcessingResult.map { x => x.asInstanceOf[js.Any] },
        "UUID" -> UUID.map { x => x.asInstanceOf[js.Any] },
        "FunctionArn" -> FunctionArn.map { x => x.asInstanceOf[js.Any] },
        "LastModified" -> LastModified.map { x => x.asInstanceOf[js.Any] },
        "EventSourceArn" -> EventSourceArn.map { x => x.asInstanceOf[js.Any] },
        "StateTransitionReason" -> StateTransitionReason.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] },
        "BatchSize" -> BatchSize.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventSourceMappingConfiguration]
    }
  }

  object EventSourcePositionEnum {
    val TRIM_HORIZON = "TRIM_HORIZON"
    val LATEST = "LATEST"
    val AT_TIMESTAMP = "AT_TIMESTAMP"

    val values = IndexedSeq(TRIM_HORIZON, LATEST, AT_TIMESTAMP)
  }

  /**
   * <p>The code for the Lambda function. You can specify either an S3 location, or upload a deployment package directly.</p>
   */
  @js.native
  trait FunctionCode extends js.Object {
    var ZipFile: js.UndefOr[Blob]
    var S3Bucket: js.UndefOr[S3Bucket]
    var S3Key: js.UndefOr[S3Key]
    var S3ObjectVersion: js.UndefOr[S3ObjectVersion]
  }

  object FunctionCode {
    def apply(
      ZipFile: js.UndefOr[Blob] = js.undefined,
      S3Bucket: js.UndefOr[S3Bucket] = js.undefined,
      S3Key: js.UndefOr[S3Key] = js.undefined,
      S3ObjectVersion: js.UndefOr[S3ObjectVersion] = js.undefined): FunctionCode = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ZipFile" -> ZipFile.map { x => x.asInstanceOf[js.Any] },
        "S3Bucket" -> S3Bucket.map { x => x.asInstanceOf[js.Any] },
        "S3Key" -> S3Key.map { x => x.asInstanceOf[js.Any] },
        "S3ObjectVersion" -> S3ObjectVersion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FunctionCode]
    }
  }

  /**
   * <p>The object for the Lambda function location.</p>
   */
  @js.native
  trait FunctionCodeLocation extends js.Object {
    var RepositoryType: js.UndefOr[String]
    var Location: js.UndefOr[String]
  }

  object FunctionCodeLocation {
    def apply(
      RepositoryType: js.UndefOr[String] = js.undefined,
      Location: js.UndefOr[String] = js.undefined): FunctionCodeLocation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RepositoryType" -> RepositoryType.map { x => x.asInstanceOf[js.Any] },
        "Location" -> Location.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FunctionCodeLocation]
    }
  }

  /**
   * <p>A Lambda function's configuration settings.</p>
   */
  @js.native
  trait FunctionConfiguration extends js.Object {
    var Environment: js.UndefOr[EnvironmentResponse]
    var DeadLetterConfig: js.UndefOr[DeadLetterConfig]
    var Role: js.UndefOr[RoleArn]
    var Handler: js.UndefOr[Handler]
    var FunctionArn: js.UndefOr[NameSpacedFunctionArn]
    var FunctionName: js.UndefOr[NamespacedFunctionName]
    var Version: js.UndefOr[Version]
    var Description: js.UndefOr[Description]
    var LastModified: js.UndefOr[Timestamp]
    var MasterArn: js.UndefOr[FunctionArn]
    var MemorySize: js.UndefOr[MemorySize]
    var RevisionId: js.UndefOr[String]
    var Layers: js.UndefOr[LayersReferenceList]
    var CodeSha256: js.UndefOr[String]
    var VpcConfig: js.UndefOr[VpcConfigResponse]
    var Runtime: js.UndefOr[Runtime]
    var KMSKeyArn: js.UndefOr[KMSKeyArn]
    var TracingConfig: js.UndefOr[TracingConfigResponse]
    var CodeSize: js.UndefOr[Double]
    var Timeout: js.UndefOr[Timeout]
  }

  object FunctionConfiguration {
    def apply(
      Environment: js.UndefOr[EnvironmentResponse] = js.undefined,
      DeadLetterConfig: js.UndefOr[DeadLetterConfig] = js.undefined,
      Role: js.UndefOr[RoleArn] = js.undefined,
      Handler: js.UndefOr[Handler] = js.undefined,
      FunctionArn: js.UndefOr[NameSpacedFunctionArn] = js.undefined,
      FunctionName: js.UndefOr[NamespacedFunctionName] = js.undefined,
      Version: js.UndefOr[Version] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined,
      LastModified: js.UndefOr[Timestamp] = js.undefined,
      MasterArn: js.UndefOr[FunctionArn] = js.undefined,
      MemorySize: js.UndefOr[MemorySize] = js.undefined,
      RevisionId: js.UndefOr[String] = js.undefined,
      Layers: js.UndefOr[LayersReferenceList] = js.undefined,
      CodeSha256: js.UndefOr[String] = js.undefined,
      VpcConfig: js.UndefOr[VpcConfigResponse] = js.undefined,
      Runtime: js.UndefOr[Runtime] = js.undefined,
      KMSKeyArn: js.UndefOr[KMSKeyArn] = js.undefined,
      TracingConfig: js.UndefOr[TracingConfigResponse] = js.undefined,
      CodeSize: js.UndefOr[Double] = js.undefined,
      Timeout: js.UndefOr[Timeout] = js.undefined): FunctionConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Environment" -> Environment.map { x => x.asInstanceOf[js.Any] },
        "DeadLetterConfig" -> DeadLetterConfig.map { x => x.asInstanceOf[js.Any] },
        "Role" -> Role.map { x => x.asInstanceOf[js.Any] },
        "Handler" -> Handler.map { x => x.asInstanceOf[js.Any] },
        "FunctionArn" -> FunctionArn.map { x => x.asInstanceOf[js.Any] },
        "FunctionName" -> FunctionName.map { x => x.asInstanceOf[js.Any] },
        "Version" -> Version.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "LastModified" -> LastModified.map { x => x.asInstanceOf[js.Any] },
        "MasterArn" -> MasterArn.map { x => x.asInstanceOf[js.Any] },
        "MemorySize" -> MemorySize.map { x => x.asInstanceOf[js.Any] },
        "RevisionId" -> RevisionId.map { x => x.asInstanceOf[js.Any] },
        "Layers" -> Layers.map { x => x.asInstanceOf[js.Any] },
        "CodeSha256" -> CodeSha256.map { x => x.asInstanceOf[js.Any] },
        "VpcConfig" -> VpcConfig.map { x => x.asInstanceOf[js.Any] },
        "Runtime" -> Runtime.map { x => x.asInstanceOf[js.Any] },
        "KMSKeyArn" -> KMSKeyArn.map { x => x.asInstanceOf[js.Any] },
        "TracingConfig" -> TracingConfig.map { x => x.asInstanceOf[js.Any] },
        "CodeSize" -> CodeSize.map { x => x.asInstanceOf[js.Any] },
        "Timeout" -> Timeout.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FunctionConfiguration]
    }
  }

  object FunctionVersionEnum {
    val ALL = "ALL"

    val values = IndexedSeq(ALL)
  }

  @js.native
  trait GetAccountSettingsRequest extends js.Object {

  }

  object GetAccountSettingsRequest {
    def apply(): GetAccountSettingsRequest = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAccountSettingsRequest]
    }
  }

  @js.native
  trait GetAccountSettingsResponse extends js.Object {
    var AccountLimit: js.UndefOr[AccountLimit]
    var AccountUsage: js.UndefOr[AccountUsage]
  }

  object GetAccountSettingsResponse {
    def apply(
      AccountLimit: js.UndefOr[AccountLimit] = js.undefined,
      AccountUsage: js.UndefOr[AccountUsage] = js.undefined): GetAccountSettingsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountLimit" -> AccountLimit.map { x => x.asInstanceOf[js.Any] },
        "AccountUsage" -> AccountUsage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAccountSettingsResponse]
    }
  }

  @js.native
  trait GetAliasRequest extends js.Object {
    var FunctionName: js.UndefOr[FunctionName]
    var Name: js.UndefOr[Alias]
  }

  object GetAliasRequest {
    def apply(
      FunctionName: js.UndefOr[FunctionName] = js.undefined,
      Name: js.UndefOr[Alias] = js.undefined): GetAliasRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FunctionName" -> FunctionName.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAliasRequest]
    }
  }

  @js.native
  trait GetEventSourceMappingRequest extends js.Object {
    var UUID: js.UndefOr[String]
  }

  object GetEventSourceMappingRequest {
    def apply(
      UUID: js.UndefOr[String] = js.undefined): GetEventSourceMappingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UUID" -> UUID.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetEventSourceMappingRequest]
    }
  }

  @js.native
  trait GetFunctionConfigurationRequest extends js.Object {
    var FunctionName: js.UndefOr[NamespacedFunctionName]
    var Qualifier: js.UndefOr[Qualifier]
  }

  object GetFunctionConfigurationRequest {
    def apply(
      FunctionName: js.UndefOr[NamespacedFunctionName] = js.undefined,
      Qualifier: js.UndefOr[Qualifier] = js.undefined): GetFunctionConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FunctionName" -> FunctionName.map { x => x.asInstanceOf[js.Any] },
        "Qualifier" -> Qualifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetFunctionConfigurationRequest]
    }
  }

  @js.native
  trait GetFunctionRequest extends js.Object {
    var FunctionName: js.UndefOr[NamespacedFunctionName]
    var Qualifier: js.UndefOr[Qualifier]
  }

  object GetFunctionRequest {
    def apply(
      FunctionName: js.UndefOr[NamespacedFunctionName] = js.undefined,
      Qualifier: js.UndefOr[Qualifier] = js.undefined): GetFunctionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FunctionName" -> FunctionName.map { x => x.asInstanceOf[js.Any] },
        "Qualifier" -> Qualifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetFunctionRequest]
    }
  }

  /**
   * <p>This response contains the object for the Lambda function location (see <a>FunctionCodeLocation</a>.</p>
   */
  @js.native
  trait GetFunctionResponse extends js.Object {
    var Configuration: js.UndefOr[FunctionConfiguration]
    var Code: js.UndefOr[FunctionCodeLocation]
    var Tags: js.UndefOr[Tags]
    var Concurrency: js.UndefOr[Concurrency]
  }

  object GetFunctionResponse {
    def apply(
      Configuration: js.UndefOr[FunctionConfiguration] = js.undefined,
      Code: js.UndefOr[FunctionCodeLocation] = js.undefined,
      Tags: js.UndefOr[Tags] = js.undefined,
      Concurrency: js.UndefOr[Concurrency] = js.undefined): GetFunctionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Configuration" -> Configuration.map { x => x.asInstanceOf[js.Any] },
        "Code" -> Code.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "Concurrency" -> Concurrency.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetFunctionResponse]
    }
  }

  @js.native
  trait GetLayerVersionPolicyRequest extends js.Object {
    var LayerName: js.UndefOr[LayerName]
    var VersionNumber: js.UndefOr[LayerVersionNumber]
  }

  object GetLayerVersionPolicyRequest {
    def apply(
      LayerName: js.UndefOr[LayerName] = js.undefined,
      VersionNumber: js.UndefOr[LayerVersionNumber] = js.undefined): GetLayerVersionPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LayerName" -> LayerName.map { x => x.asInstanceOf[js.Any] },
        "VersionNumber" -> VersionNumber.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLayerVersionPolicyRequest]
    }
  }

  @js.native
  trait GetLayerVersionPolicyResponse extends js.Object {
    var Policy: js.UndefOr[String]
    var RevisionId: js.UndefOr[String]
  }

  object GetLayerVersionPolicyResponse {
    def apply(
      Policy: js.UndefOr[String] = js.undefined,
      RevisionId: js.UndefOr[String] = js.undefined): GetLayerVersionPolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Policy" -> Policy.map { x => x.asInstanceOf[js.Any] },
        "RevisionId" -> RevisionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLayerVersionPolicyResponse]
    }
  }

  @js.native
  trait GetLayerVersionRequest extends js.Object {
    var LayerName: js.UndefOr[LayerName]
    var VersionNumber: js.UndefOr[LayerVersionNumber]
  }

  object GetLayerVersionRequest {
    def apply(
      LayerName: js.UndefOr[LayerName] = js.undefined,
      VersionNumber: js.UndefOr[LayerVersionNumber] = js.undefined): GetLayerVersionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LayerName" -> LayerName.map { x => x.asInstanceOf[js.Any] },
        "VersionNumber" -> VersionNumber.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLayerVersionRequest]
    }
  }

  @js.native
  trait GetLayerVersionResponse extends js.Object {
    var Content: js.UndefOr[LayerVersionContentOutput]
    var CreatedDate: js.UndefOr[Timestamp]
    var CompatibleRuntimes: js.UndefOr[CompatibleRuntimes]
    var Version: js.UndefOr[LayerVersionNumber]
    var Description: js.UndefOr[Description]
    var LayerVersionArn: js.UndefOr[LayerVersionArn]
    var LicenseInfo: js.UndefOr[LicenseInfo]
    var LayerArn: js.UndefOr[LayerArn]
  }

  object GetLayerVersionResponse {
    def apply(
      Content: js.UndefOr[LayerVersionContentOutput] = js.undefined,
      CreatedDate: js.UndefOr[Timestamp] = js.undefined,
      CompatibleRuntimes: js.UndefOr[CompatibleRuntimes] = js.undefined,
      Version: js.UndefOr[LayerVersionNumber] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined,
      LayerVersionArn: js.UndefOr[LayerVersionArn] = js.undefined,
      LicenseInfo: js.UndefOr[LicenseInfo] = js.undefined,
      LayerArn: js.UndefOr[LayerArn] = js.undefined): GetLayerVersionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Content" -> Content.map { x => x.asInstanceOf[js.Any] },
        "CreatedDate" -> CreatedDate.map { x => x.asInstanceOf[js.Any] },
        "CompatibleRuntimes" -> CompatibleRuntimes.map { x => x.asInstanceOf[js.Any] },
        "Version" -> Version.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "LayerVersionArn" -> LayerVersionArn.map { x => x.asInstanceOf[js.Any] },
        "LicenseInfo" -> LicenseInfo.map { x => x.asInstanceOf[js.Any] },
        "LayerArn" -> LayerArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLayerVersionResponse]
    }
  }

  @js.native
  trait GetPolicyRequest extends js.Object {
    var FunctionName: js.UndefOr[NamespacedFunctionName]
    var Qualifier: js.UndefOr[Qualifier]
  }

  object GetPolicyRequest {
    def apply(
      FunctionName: js.UndefOr[NamespacedFunctionName] = js.undefined,
      Qualifier: js.UndefOr[Qualifier] = js.undefined): GetPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FunctionName" -> FunctionName.map { x => x.asInstanceOf[js.Any] },
        "Qualifier" -> Qualifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPolicyRequest]
    }
  }

  @js.native
  trait GetPolicyResponse extends js.Object {
    var Policy: js.UndefOr[String]
    var RevisionId: js.UndefOr[String]
  }

  object GetPolicyResponse {
    def apply(
      Policy: js.UndefOr[String] = js.undefined,
      RevisionId: js.UndefOr[String] = js.undefined): GetPolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Policy" -> Policy.map { x => x.asInstanceOf[js.Any] },
        "RevisionId" -> RevisionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPolicyResponse]
    }
  }

  @js.native
  trait InvocationRequest extends js.Object {
    var Qualifier: js.UndefOr[Qualifier]
    var FunctionName: js.UndefOr[NamespacedFunctionName]
    var ClientContext: js.UndefOr[String]
    var InvocationType: js.UndefOr[InvocationType]
    var Payload: js.UndefOr[Blob]
    var LogType: js.UndefOr[LogType]
  }

  object InvocationRequest {
    def apply(
      Qualifier: js.UndefOr[Qualifier] = js.undefined,
      FunctionName: js.UndefOr[NamespacedFunctionName] = js.undefined,
      ClientContext: js.UndefOr[String] = js.undefined,
      InvocationType: js.UndefOr[InvocationType] = js.undefined,
      Payload: js.UndefOr[Blob] = js.undefined,
      LogType: js.UndefOr[LogType] = js.undefined): InvocationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Qualifier" -> Qualifier.map { x => x.asInstanceOf[js.Any] },
        "FunctionName" -> FunctionName.map { x => x.asInstanceOf[js.Any] },
        "ClientContext" -> ClientContext.map { x => x.asInstanceOf[js.Any] },
        "InvocationType" -> InvocationType.map { x => x.asInstanceOf[js.Any] },
        "Payload" -> Payload.map { x => x.asInstanceOf[js.Any] },
        "LogType" -> LogType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InvocationRequest]
    }
  }

  /**
   * <p>Upon success, returns an empty response. Otherwise, throws an exception.</p>
   */
  @js.native
  trait InvocationResponse extends js.Object {
    var FunctionError: js.UndefOr[String]
    var StatusCode: js.UndefOr[Int]
    var LogResult: js.UndefOr[String]
    var Payload: js.UndefOr[Blob]
    var ExecutedVersion: js.UndefOr[Version]
  }

  object InvocationResponse {
    def apply(
      FunctionError: js.UndefOr[String] = js.undefined,
      StatusCode: js.UndefOr[Int] = js.undefined,
      LogResult: js.UndefOr[String] = js.undefined,
      Payload: js.UndefOr[Blob] = js.undefined,
      ExecutedVersion: js.UndefOr[Version] = js.undefined): InvocationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FunctionError" -> FunctionError.map { x => x.asInstanceOf[js.Any] },
        "StatusCode" -> StatusCode.map { x => x.asInstanceOf[js.Any] },
        "LogResult" -> LogResult.map { x => x.asInstanceOf[js.Any] },
        "Payload" -> Payload.map { x => x.asInstanceOf[js.Any] },
        "ExecutedVersion" -> ExecutedVersion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InvocationResponse]
    }
  }

  object InvocationTypeEnum {
    val Event = "Event"
    val RequestResponse = "RequestResponse"
    val DryRun = "DryRun"

    val values = IndexedSeq(Event, RequestResponse, DryRun)
  }

  @deprecated
  @js.native
  trait InvokeAsyncRequest extends js.Object {
    var FunctionName: js.UndefOr[NamespacedFunctionName]
    var InvokeArgs: js.UndefOr[BlobStream]
  }

  object InvokeAsyncRequest {
    def apply(
      FunctionName: js.UndefOr[NamespacedFunctionName] = js.undefined,
      InvokeArgs: js.UndefOr[BlobStream] = js.undefined): InvokeAsyncRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FunctionName" -> FunctionName.map { x => x.asInstanceOf[js.Any] },
        "InvokeArgs" -> InvokeArgs.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InvokeAsyncRequest]
    }
  }

  /**
   * <p>Upon success, it returns empty response. Otherwise, throws an exception.</p>
   */
  @deprecated
  @js.native
  trait InvokeAsyncResponse extends js.Object {
    var Status: js.UndefOr[HttpStatus]
  }

  object InvokeAsyncResponse {
    def apply(
      Status: js.UndefOr[HttpStatus] = js.undefined): InvokeAsyncResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InvokeAsyncResponse]
    }
  }

  /**
   * <p>A function layer.</p>
   */
  @js.native
  trait Layer extends js.Object {
    var Arn: js.UndefOr[LayerVersionArn]
    var CodeSize: js.UndefOr[Double]
  }

  object Layer {
    def apply(
      Arn: js.UndefOr[LayerVersionArn] = js.undefined,
      CodeSize: js.UndefOr[Double] = js.undefined): Layer = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "CodeSize" -> CodeSize.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Layer]
    }
  }

  /**
   * <p>A ZIP archive that contains the contents of the function layer. You can specify either an Amazon S3 location, or upload a layer archive directly.</p>
   */
  @js.native
  trait LayerVersionContentInput extends js.Object {
    var S3Bucket: js.UndefOr[S3Bucket]
    var S3Key: js.UndefOr[S3Key]
    var S3ObjectVersion: js.UndefOr[S3ObjectVersion]
    var ZipFile: js.UndefOr[Blob]
  }

  object LayerVersionContentInput {
    def apply(
      S3Bucket: js.UndefOr[S3Bucket] = js.undefined,
      S3Key: js.UndefOr[S3Key] = js.undefined,
      S3ObjectVersion: js.UndefOr[S3ObjectVersion] = js.undefined,
      ZipFile: js.UndefOr[Blob] = js.undefined): LayerVersionContentInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "S3Bucket" -> S3Bucket.map { x => x.asInstanceOf[js.Any] },
        "S3Key" -> S3Key.map { x => x.asInstanceOf[js.Any] },
        "S3ObjectVersion" -> S3ObjectVersion.map { x => x.asInstanceOf[js.Any] },
        "ZipFile" -> ZipFile.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LayerVersionContentInput]
    }
  }

  /**
   * <p>Details about a layer version.</p>
   */
  @js.native
  trait LayerVersionContentOutput extends js.Object {
    var Location: js.UndefOr[String]
    var CodeSha256: js.UndefOr[String]
    var CodeSize: js.UndefOr[Double]
  }

  object LayerVersionContentOutput {
    def apply(
      Location: js.UndefOr[String] = js.undefined,
      CodeSha256: js.UndefOr[String] = js.undefined,
      CodeSize: js.UndefOr[Double] = js.undefined): LayerVersionContentOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Location" -> Location.map { x => x.asInstanceOf[js.Any] },
        "CodeSha256" -> CodeSha256.map { x => x.asInstanceOf[js.Any] },
        "CodeSize" -> CodeSize.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LayerVersionContentOutput]
    }
  }

  /**
   * <p>Details about a layer version.</p>
   */
  @js.native
  trait LayerVersionsListItem extends js.Object {
    var CreatedDate: js.UndefOr[Timestamp]
    var CompatibleRuntimes: js.UndefOr[CompatibleRuntimes]
    var Version: js.UndefOr[LayerVersionNumber]
    var Description: js.UndefOr[Description]
    var LayerVersionArn: js.UndefOr[LayerVersionArn]
    var LicenseInfo: js.UndefOr[LicenseInfo]
  }

  object LayerVersionsListItem {
    def apply(
      CreatedDate: js.UndefOr[Timestamp] = js.undefined,
      CompatibleRuntimes: js.UndefOr[CompatibleRuntimes] = js.undefined,
      Version: js.UndefOr[LayerVersionNumber] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined,
      LayerVersionArn: js.UndefOr[LayerVersionArn] = js.undefined,
      LicenseInfo: js.UndefOr[LicenseInfo] = js.undefined): LayerVersionsListItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreatedDate" -> CreatedDate.map { x => x.asInstanceOf[js.Any] },
        "CompatibleRuntimes" -> CompatibleRuntimes.map { x => x.asInstanceOf[js.Any] },
        "Version" -> Version.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "LayerVersionArn" -> LayerVersionArn.map { x => x.asInstanceOf[js.Any] },
        "LicenseInfo" -> LicenseInfo.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LayerVersionsListItem]
    }
  }

  /**
   * <p>Details about a function layer.</p>
   */
  @js.native
  trait LayersListItem extends js.Object {
    var LayerName: js.UndefOr[LayerName]
    var LayerArn: js.UndefOr[LayerArn]
    var LatestMatchingVersion: js.UndefOr[LayerVersionsListItem]
  }

  object LayersListItem {
    def apply(
      LayerName: js.UndefOr[LayerName] = js.undefined,
      LayerArn: js.UndefOr[LayerArn] = js.undefined,
      LatestMatchingVersion: js.UndefOr[LayerVersionsListItem] = js.undefined): LayersListItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LayerName" -> LayerName.map { x => x.asInstanceOf[js.Any] },
        "LayerArn" -> LayerArn.map { x => x.asInstanceOf[js.Any] },
        "LatestMatchingVersion" -> LatestMatchingVersion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LayersListItem]
    }
  }

  @js.native
  trait ListAliasesRequest extends js.Object {
    var FunctionName: js.UndefOr[FunctionName]
    var FunctionVersion: js.UndefOr[Version]
    var Marker: js.UndefOr[String]
    var MaxItems: js.UndefOr[MaxListItems]
  }

  object ListAliasesRequest {
    def apply(
      FunctionName: js.UndefOr[FunctionName] = js.undefined,
      FunctionVersion: js.UndefOr[Version] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined,
      MaxItems: js.UndefOr[MaxListItems] = js.undefined): ListAliasesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FunctionName" -> FunctionName.map { x => x.asInstanceOf[js.Any] },
        "FunctionVersion" -> FunctionVersion.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAliasesRequest]
    }
  }

  @js.native
  trait ListAliasesResponse extends js.Object {
    var NextMarker: js.UndefOr[String]
    var Aliases: js.UndefOr[AliasList]
  }

  object ListAliasesResponse {
    def apply(
      NextMarker: js.UndefOr[String] = js.undefined,
      Aliases: js.UndefOr[AliasList] = js.undefined): ListAliasesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] },
        "Aliases" -> Aliases.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAliasesResponse]
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
    def apply(
      EventSourceArn: js.UndefOr[Arn] = js.undefined,
      FunctionName: js.UndefOr[FunctionName] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined,
      MaxItems: js.UndefOr[MaxListItems] = js.undefined): ListEventSourceMappingsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EventSourceArn" -> EventSourceArn.map { x => x.asInstanceOf[js.Any] },
        "FunctionName" -> FunctionName.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListEventSourceMappingsRequest]
    }
  }

  @js.native
  trait ListEventSourceMappingsResponse extends js.Object {
    var NextMarker: js.UndefOr[String]
    var EventSourceMappings: js.UndefOr[EventSourceMappingsList]
  }

  object ListEventSourceMappingsResponse {
    def apply(
      NextMarker: js.UndefOr[String] = js.undefined,
      EventSourceMappings: js.UndefOr[EventSourceMappingsList] = js.undefined): ListEventSourceMappingsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] },
        "EventSourceMappings" -> EventSourceMappings.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListEventSourceMappingsResponse]
    }
  }

  @js.native
  trait ListFunctionsRequest extends js.Object {
    var MasterRegion: js.UndefOr[MasterRegion]
    var FunctionVersion: js.UndefOr[FunctionVersion]
    var Marker: js.UndefOr[String]
    var MaxItems: js.UndefOr[MaxListItems]
  }

  object ListFunctionsRequest {
    def apply(
      MasterRegion: js.UndefOr[MasterRegion] = js.undefined,
      FunctionVersion: js.UndefOr[FunctionVersion] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined,
      MaxItems: js.UndefOr[MaxListItems] = js.undefined): ListFunctionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MasterRegion" -> MasterRegion.map { x => x.asInstanceOf[js.Any] },
        "FunctionVersion" -> FunctionVersion.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListFunctionsRequest]
    }
  }

  /**
   * <p>A list of Lambda functions.</p>
   */
  @js.native
  trait ListFunctionsResponse extends js.Object {
    var NextMarker: js.UndefOr[String]
    var Functions: js.UndefOr[FunctionList]
  }

  object ListFunctionsResponse {
    def apply(
      NextMarker: js.UndefOr[String] = js.undefined,
      Functions: js.UndefOr[FunctionList] = js.undefined): ListFunctionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] },
        "Functions" -> Functions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListFunctionsResponse]
    }
  }

  @js.native
  trait ListLayerVersionsRequest extends js.Object {
    var CompatibleRuntime: js.UndefOr[Runtime]
    var LayerName: js.UndefOr[LayerName]
    var Marker: js.UndefOr[String]
    var MaxItems: js.UndefOr[MaxLayerListItems]
  }

  object ListLayerVersionsRequest {
    def apply(
      CompatibleRuntime: js.UndefOr[Runtime] = js.undefined,
      LayerName: js.UndefOr[LayerName] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined,
      MaxItems: js.UndefOr[MaxLayerListItems] = js.undefined): ListLayerVersionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CompatibleRuntime" -> CompatibleRuntime.map { x => x.asInstanceOf[js.Any] },
        "LayerName" -> LayerName.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListLayerVersionsRequest]
    }
  }

  @js.native
  trait ListLayerVersionsResponse extends js.Object {
    var NextMarker: js.UndefOr[String]
    var LayerVersions: js.UndefOr[LayerVersionsList]
  }

  object ListLayerVersionsResponse {
    def apply(
      NextMarker: js.UndefOr[String] = js.undefined,
      LayerVersions: js.UndefOr[LayerVersionsList] = js.undefined): ListLayerVersionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] },
        "LayerVersions" -> LayerVersions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListLayerVersionsResponse]
    }
  }

  @js.native
  trait ListLayersRequest extends js.Object {
    var CompatibleRuntime: js.UndefOr[Runtime]
    var Marker: js.UndefOr[String]
    var MaxItems: js.UndefOr[MaxLayerListItems]
  }

  object ListLayersRequest {
    def apply(
      CompatibleRuntime: js.UndefOr[Runtime] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined,
      MaxItems: js.UndefOr[MaxLayerListItems] = js.undefined): ListLayersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CompatibleRuntime" -> CompatibleRuntime.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListLayersRequest]
    }
  }

  @js.native
  trait ListLayersResponse extends js.Object {
    var NextMarker: js.UndefOr[String]
    var Layers: js.UndefOr[LayersList]
  }

  object ListLayersResponse {
    def apply(
      NextMarker: js.UndefOr[String] = js.undefined,
      Layers: js.UndefOr[LayersList] = js.undefined): ListLayersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] },
        "Layers" -> Layers.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListLayersResponse]
    }
  }

  @js.native
  trait ListTagsRequest extends js.Object {
    var Resource: js.UndefOr[FunctionArn]
  }

  object ListTagsRequest {
    def apply(
      Resource: js.UndefOr[FunctionArn] = js.undefined): ListTagsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Resource" -> Resource.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsRequest]
    }
  }

  @js.native
  trait ListTagsResponse extends js.Object {
    var Tags: js.UndefOr[Tags]
  }

  object ListTagsResponse {
    def apply(
      Tags: js.UndefOr[Tags] = js.undefined): ListTagsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsResponse]
    }
  }

  @js.native
  trait ListVersionsByFunctionRequest extends js.Object {
    var FunctionName: js.UndefOr[NamespacedFunctionName]
    var Marker: js.UndefOr[String]
    var MaxItems: js.UndefOr[MaxListItems]
  }

  object ListVersionsByFunctionRequest {
    def apply(
      FunctionName: js.UndefOr[NamespacedFunctionName] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined,
      MaxItems: js.UndefOr[MaxListItems] = js.undefined): ListVersionsByFunctionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FunctionName" -> FunctionName.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "MaxItems" -> MaxItems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListVersionsByFunctionRequest]
    }
  }

  @js.native
  trait ListVersionsByFunctionResponse extends js.Object {
    var NextMarker: js.UndefOr[String]
    var Versions: js.UndefOr[FunctionList]
  }

  object ListVersionsByFunctionResponse {
    def apply(
      NextMarker: js.UndefOr[String] = js.undefined,
      Versions: js.UndefOr[FunctionList] = js.undefined): ListVersionsByFunctionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] },
        "Versions" -> Versions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListVersionsByFunctionResponse]
    }
  }

  object LogTypeEnum {
    val None = "None"
    val Tail = "Tail"

    val values = IndexedSeq(None, Tail)
  }

  @js.native
  trait PublishLayerVersionRequest extends js.Object {
    var Content: js.UndefOr[LayerVersionContentInput]
    var CompatibleRuntimes: js.UndefOr[CompatibleRuntimes]
    var Description: js.UndefOr[Description]
    var LayerName: js.UndefOr[LayerName]
    var LicenseInfo: js.UndefOr[LicenseInfo]
  }

  object PublishLayerVersionRequest {
    def apply(
      Content: js.UndefOr[LayerVersionContentInput] = js.undefined,
      CompatibleRuntimes: js.UndefOr[CompatibleRuntimes] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined,
      LayerName: js.UndefOr[LayerName] = js.undefined,
      LicenseInfo: js.UndefOr[LicenseInfo] = js.undefined): PublishLayerVersionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Content" -> Content.map { x => x.asInstanceOf[js.Any] },
        "CompatibleRuntimes" -> CompatibleRuntimes.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "LayerName" -> LayerName.map { x => x.asInstanceOf[js.Any] },
        "LicenseInfo" -> LicenseInfo.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PublishLayerVersionRequest]
    }
  }

  @js.native
  trait PublishLayerVersionResponse extends js.Object {
    var Content: js.UndefOr[LayerVersionContentOutput]
    var CreatedDate: js.UndefOr[Timestamp]
    var CompatibleRuntimes: js.UndefOr[CompatibleRuntimes]
    var Version: js.UndefOr[LayerVersionNumber]
    var Description: js.UndefOr[Description]
    var LayerVersionArn: js.UndefOr[LayerVersionArn]
    var LicenseInfo: js.UndefOr[LicenseInfo]
    var LayerArn: js.UndefOr[LayerArn]
  }

  object PublishLayerVersionResponse {
    def apply(
      Content: js.UndefOr[LayerVersionContentOutput] = js.undefined,
      CreatedDate: js.UndefOr[Timestamp] = js.undefined,
      CompatibleRuntimes: js.UndefOr[CompatibleRuntimes] = js.undefined,
      Version: js.UndefOr[LayerVersionNumber] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined,
      LayerVersionArn: js.UndefOr[LayerVersionArn] = js.undefined,
      LicenseInfo: js.UndefOr[LicenseInfo] = js.undefined,
      LayerArn: js.UndefOr[LayerArn] = js.undefined): PublishLayerVersionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Content" -> Content.map { x => x.asInstanceOf[js.Any] },
        "CreatedDate" -> CreatedDate.map { x => x.asInstanceOf[js.Any] },
        "CompatibleRuntimes" -> CompatibleRuntimes.map { x => x.asInstanceOf[js.Any] },
        "Version" -> Version.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "LayerVersionArn" -> LayerVersionArn.map { x => x.asInstanceOf[js.Any] },
        "LicenseInfo" -> LicenseInfo.map { x => x.asInstanceOf[js.Any] },
        "LayerArn" -> LayerArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PublishLayerVersionResponse]
    }
  }

  @js.native
  trait PublishVersionRequest extends js.Object {
    var FunctionName: js.UndefOr[FunctionName]
    var CodeSha256: js.UndefOr[String]
    var Description: js.UndefOr[Description]
    var RevisionId: js.UndefOr[String]
  }

  object PublishVersionRequest {
    def apply(
      FunctionName: js.UndefOr[FunctionName] = js.undefined,
      CodeSha256: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined,
      RevisionId: js.UndefOr[String] = js.undefined): PublishVersionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FunctionName" -> FunctionName.map { x => x.asInstanceOf[js.Any] },
        "CodeSha256" -> CodeSha256.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "RevisionId" -> RevisionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PublishVersionRequest]
    }
  }

  @js.native
  trait PutFunctionConcurrencyRequest extends js.Object {
    var FunctionName: js.UndefOr[FunctionName]
    var ReservedConcurrentExecutions: js.UndefOr[ReservedConcurrentExecutions]
  }

  object PutFunctionConcurrencyRequest {
    def apply(
      FunctionName: js.UndefOr[FunctionName] = js.undefined,
      ReservedConcurrentExecutions: js.UndefOr[ReservedConcurrentExecutions] = js.undefined): PutFunctionConcurrencyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FunctionName" -> FunctionName.map { x => x.asInstanceOf[js.Any] },
        "ReservedConcurrentExecutions" -> ReservedConcurrentExecutions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutFunctionConcurrencyRequest]
    }
  }

  @js.native
  trait RemoveLayerVersionPermissionRequest extends js.Object {
    var LayerName: js.UndefOr[LayerName]
    var VersionNumber: js.UndefOr[LayerVersionNumber]
    var StatementId: js.UndefOr[StatementId]
    var RevisionId: js.UndefOr[String]
  }

  object RemoveLayerVersionPermissionRequest {
    def apply(
      LayerName: js.UndefOr[LayerName] = js.undefined,
      VersionNumber: js.UndefOr[LayerVersionNumber] = js.undefined,
      StatementId: js.UndefOr[StatementId] = js.undefined,
      RevisionId: js.UndefOr[String] = js.undefined): RemoveLayerVersionPermissionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LayerName" -> LayerName.map { x => x.asInstanceOf[js.Any] },
        "VersionNumber" -> VersionNumber.map { x => x.asInstanceOf[js.Any] },
        "StatementId" -> StatementId.map { x => x.asInstanceOf[js.Any] },
        "RevisionId" -> RevisionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveLayerVersionPermissionRequest]
    }
  }

  @js.native
  trait RemovePermissionRequest extends js.Object {
    var FunctionName: js.UndefOr[FunctionName]
    var StatementId: js.UndefOr[NamespacedStatementId]
    var Qualifier: js.UndefOr[Qualifier]
    var RevisionId: js.UndefOr[String]
  }

  object RemovePermissionRequest {
    def apply(
      FunctionName: js.UndefOr[FunctionName] = js.undefined,
      StatementId: js.UndefOr[NamespacedStatementId] = js.undefined,
      Qualifier: js.UndefOr[Qualifier] = js.undefined,
      RevisionId: js.UndefOr[String] = js.undefined): RemovePermissionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FunctionName" -> FunctionName.map { x => x.asInstanceOf[js.Any] },
        "StatementId" -> StatementId.map { x => x.asInstanceOf[js.Any] },
        "Qualifier" -> Qualifier.map { x => x.asInstanceOf[js.Any] },
        "RevisionId" -> RevisionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemovePermissionRequest]
    }
  }

  object RuntimeEnum {
    val nodejs = "nodejs"
    val `nodejs4.3` = "nodejs4.3"
    val `nodejs6.10` = "nodejs6.10"
    val `nodejs8.10` = "nodejs8.10"
    val java8 = "java8"
    val `python2.7` = "python2.7"
    val `python3.6` = "python3.6"
    val `python3.7` = "python3.7"
    val `dotnetcore1.0` = "dotnetcore1.0"
    val `dotnetcore2.0` = "dotnetcore2.0"
    val `dotnetcore2.1` = "dotnetcore2.1"
    val `nodejs4.3-edge` = "nodejs4.3-edge"
    val `go1.x` = "go1.x"
    val `ruby2.5` = "ruby2.5"
    val provided = "provided"

    val values = IndexedSeq(nodejs, `nodejs4.3`, `nodejs6.10`, `nodejs8.10`, java8, `python2.7`, `python3.6`, `python3.7`, `dotnetcore1.0`, `dotnetcore2.0`, `dotnetcore2.1`, `nodejs4.3-edge`, `go1.x`, `ruby2.5`, provided)
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var Resource: js.UndefOr[FunctionArn]
    var Tags: js.UndefOr[Tags]
  }

  object TagResourceRequest {
    def apply(
      Resource: js.UndefOr[FunctionArn] = js.undefined,
      Tags: js.UndefOr[Tags] = js.undefined): TagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Resource" -> Resource.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagResourceRequest]
    }
  }

  /**
   * <p>The function's AWS X-Ray tracing configuration.</p>
   */
  @js.native
  trait TracingConfig extends js.Object {
    var Mode: js.UndefOr[TracingMode]
  }

  object TracingConfig {
    def apply(
      Mode: js.UndefOr[TracingMode] = js.undefined): TracingConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Mode" -> Mode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TracingConfig]
    }
  }

  /**
   * <p>The function's AWS X-Ray tracing configuration.</p>
   */
  @js.native
  trait TracingConfigResponse extends js.Object {
    var Mode: js.UndefOr[TracingMode]
  }

  object TracingConfigResponse {
    def apply(
      Mode: js.UndefOr[TracingMode] = js.undefined): TracingConfigResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Mode" -> Mode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TracingConfigResponse]
    }
  }

  object TracingModeEnum {
    val Active = "Active"
    val PassThrough = "PassThrough"

    val values = IndexedSeq(Active, PassThrough)
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var Resource: js.UndefOr[FunctionArn]
    var TagKeys: js.UndefOr[TagKeyList]
  }

  object UntagResourceRequest {
    def apply(
      Resource: js.UndefOr[FunctionArn] = js.undefined,
      TagKeys: js.UndefOr[TagKeyList] = js.undefined): UntagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Resource" -> Resource.map { x => x.asInstanceOf[js.Any] },
        "TagKeys" -> TagKeys.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UpdateAliasRequest extends js.Object {
    var Name: js.UndefOr[Alias]
    var FunctionName: js.UndefOr[FunctionName]
    var Description: js.UndefOr[Description]
    var RoutingConfig: js.UndefOr[AliasRoutingConfiguration]
    var RevisionId: js.UndefOr[String]
    var FunctionVersion: js.UndefOr[Version]
  }

  object UpdateAliasRequest {
    def apply(
      Name: js.UndefOr[Alias] = js.undefined,
      FunctionName: js.UndefOr[FunctionName] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined,
      RoutingConfig: js.UndefOr[AliasRoutingConfiguration] = js.undefined,
      RevisionId: js.UndefOr[String] = js.undefined,
      FunctionVersion: js.UndefOr[Version] = js.undefined): UpdateAliasRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "FunctionName" -> FunctionName.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "RoutingConfig" -> RoutingConfig.map { x => x.asInstanceOf[js.Any] },
        "RevisionId" -> RevisionId.map { x => x.asInstanceOf[js.Any] },
        "FunctionVersion" -> FunctionVersion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAliasRequest]
    }
  }

  @js.native
  trait UpdateEventSourceMappingRequest extends js.Object {
    var UUID: js.UndefOr[String]
    var FunctionName: js.UndefOr[FunctionName]
    var Enabled: js.UndefOr[Enabled]
    var BatchSize: js.UndefOr[BatchSize]
  }

  object UpdateEventSourceMappingRequest {
    def apply(
      UUID: js.UndefOr[String] = js.undefined,
      FunctionName: js.UndefOr[FunctionName] = js.undefined,
      Enabled: js.UndefOr[Enabled] = js.undefined,
      BatchSize: js.UndefOr[BatchSize] = js.undefined): UpdateEventSourceMappingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UUID" -> UUID.map { x => x.asInstanceOf[js.Any] },
        "FunctionName" -> FunctionName.map { x => x.asInstanceOf[js.Any] },
        "Enabled" -> Enabled.map { x => x.asInstanceOf[js.Any] },
        "BatchSize" -> BatchSize.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateEventSourceMappingRequest]
    }
  }

  @js.native
  trait UpdateFunctionCodeRequest extends js.Object {
    var S3Key: js.UndefOr[S3Key]
    var ZipFile: js.UndefOr[Blob]
    var DryRun: js.UndefOr[Boolean]
    var S3Bucket: js.UndefOr[S3Bucket]
    var FunctionName: js.UndefOr[FunctionName]
    var S3ObjectVersion: js.UndefOr[S3ObjectVersion]
    var RevisionId: js.UndefOr[String]
    var Publish: js.UndefOr[Boolean]
  }

  object UpdateFunctionCodeRequest {
    def apply(
      S3Key: js.UndefOr[S3Key] = js.undefined,
      ZipFile: js.UndefOr[Blob] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined,
      S3Bucket: js.UndefOr[S3Bucket] = js.undefined,
      FunctionName: js.UndefOr[FunctionName] = js.undefined,
      S3ObjectVersion: js.UndefOr[S3ObjectVersion] = js.undefined,
      RevisionId: js.UndefOr[String] = js.undefined,
      Publish: js.UndefOr[Boolean] = js.undefined): UpdateFunctionCodeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "S3Key" -> S3Key.map { x => x.asInstanceOf[js.Any] },
        "ZipFile" -> ZipFile.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "S3Bucket" -> S3Bucket.map { x => x.asInstanceOf[js.Any] },
        "FunctionName" -> FunctionName.map { x => x.asInstanceOf[js.Any] },
        "S3ObjectVersion" -> S3ObjectVersion.map { x => x.asInstanceOf[js.Any] },
        "RevisionId" -> RevisionId.map { x => x.asInstanceOf[js.Any] },
        "Publish" -> Publish.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateFunctionCodeRequest]
    }
  }

  @js.native
  trait UpdateFunctionConfigurationRequest extends js.Object {
    var Environment: js.UndefOr[Environment]
    var DeadLetterConfig: js.UndefOr[DeadLetterConfig]
    var Role: js.UndefOr[RoleArn]
    var Handler: js.UndefOr[Handler]
    var FunctionName: js.UndefOr[FunctionName]
    var Description: js.UndefOr[Description]
    var MemorySize: js.UndefOr[MemorySize]
    var RevisionId: js.UndefOr[String]
    var Layers: js.UndefOr[LayerList]
    var VpcConfig: js.UndefOr[VpcConfig]
    var Runtime: js.UndefOr[Runtime]
    var KMSKeyArn: js.UndefOr[KMSKeyArn]
    var TracingConfig: js.UndefOr[TracingConfig]
    var Timeout: js.UndefOr[Timeout]
  }

  object UpdateFunctionConfigurationRequest {
    def apply(
      Environment: js.UndefOr[Environment] = js.undefined,
      DeadLetterConfig: js.UndefOr[DeadLetterConfig] = js.undefined,
      Role: js.UndefOr[RoleArn] = js.undefined,
      Handler: js.UndefOr[Handler] = js.undefined,
      FunctionName: js.UndefOr[FunctionName] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined,
      MemorySize: js.UndefOr[MemorySize] = js.undefined,
      RevisionId: js.UndefOr[String] = js.undefined,
      Layers: js.UndefOr[LayerList] = js.undefined,
      VpcConfig: js.UndefOr[VpcConfig] = js.undefined,
      Runtime: js.UndefOr[Runtime] = js.undefined,
      KMSKeyArn: js.UndefOr[KMSKeyArn] = js.undefined,
      TracingConfig: js.UndefOr[TracingConfig] = js.undefined,
      Timeout: js.UndefOr[Timeout] = js.undefined): UpdateFunctionConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Environment" -> Environment.map { x => x.asInstanceOf[js.Any] },
        "DeadLetterConfig" -> DeadLetterConfig.map { x => x.asInstanceOf[js.Any] },
        "Role" -> Role.map { x => x.asInstanceOf[js.Any] },
        "Handler" -> Handler.map { x => x.asInstanceOf[js.Any] },
        "FunctionName" -> FunctionName.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "MemorySize" -> MemorySize.map { x => x.asInstanceOf[js.Any] },
        "RevisionId" -> RevisionId.map { x => x.asInstanceOf[js.Any] },
        "Layers" -> Layers.map { x => x.asInstanceOf[js.Any] },
        "VpcConfig" -> VpcConfig.map { x => x.asInstanceOf[js.Any] },
        "Runtime" -> Runtime.map { x => x.asInstanceOf[js.Any] },
        "KMSKeyArn" -> KMSKeyArn.map { x => x.asInstanceOf[js.Any] },
        "TracingConfig" -> TracingConfig.map { x => x.asInstanceOf[js.Any] },
        "Timeout" -> Timeout.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateFunctionConfigurationRequest]
    }
  }

  /**
   * <p>The VPC security groups and subnets attached to a Lambda function.</p>
   */
  @js.native
  trait VpcConfig extends js.Object {
    var SubnetIds: js.UndefOr[SubnetIds]
    var SecurityGroupIds: js.UndefOr[SecurityGroupIds]
  }

  object VpcConfig {
    def apply(
      SubnetIds: js.UndefOr[SubnetIds] = js.undefined,
      SecurityGroupIds: js.UndefOr[SecurityGroupIds] = js.undefined): VpcConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SubnetIds" -> SubnetIds.map { x => x.asInstanceOf[js.Any] },
        "SecurityGroupIds" -> SecurityGroupIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VpcConfig]
    }
  }

  /**
   * <p>The VPC security groups and subnets attached to a Lambda function.</p>
   */
  @js.native
  trait VpcConfigResponse extends js.Object {
    var SubnetIds: js.UndefOr[SubnetIds]
    var SecurityGroupIds: js.UndefOr[SecurityGroupIds]
    var VpcId: js.UndefOr[VpcId]
  }

  object VpcConfigResponse {
    def apply(
      SubnetIds: js.UndefOr[SubnetIds] = js.undefined,
      SecurityGroupIds: js.UndefOr[SecurityGroupIds] = js.undefined,
      VpcId: js.UndefOr[VpcId] = js.undefined): VpcConfigResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SubnetIds" -> SubnetIds.map { x => x.asInstanceOf[js.Any] },
        "SecurityGroupIds" -> SecurityGroupIds.map { x => x.asInstanceOf[js.Any] },
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VpcConfigResponse]
    }
  }
}
