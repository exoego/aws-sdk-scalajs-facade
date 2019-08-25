package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object lambda {
  type Action                   = String
  type AdditionalVersion        = String
  type AdditionalVersionWeights = js.Dictionary[Weight]
  type Alias                    = String
  type AliasList                = js.Array[AliasConfiguration]
  type Arn                      = String
  type BatchSize                = Int
  type Blob                     = nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type BlobStream =
    nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type CompatibleRuntimes              = js.Array[Runtime]
  type Date                            = js.Date
  type Description                     = String
  type Enabled                         = Boolean
  type EnvironmentVariableName         = String
  type EnvironmentVariableValue        = String
  type EnvironmentVariables            = js.Dictionary[EnvironmentVariableValue]
  type EventSourceMappingsList         = js.Array[EventSourceMappingConfiguration]
  type EventSourcePosition             = String
  type EventSourceToken                = String
  type FunctionArn                     = String
  type FunctionList                    = js.Array[FunctionConfiguration]
  type FunctionName                    = String
  type FunctionVersion                 = String
  type Handler                         = String
  type HttpStatus                      = Int
  type InvocationType                  = String
  type KMSKeyArn                       = String
  type LayerArn                        = String
  type LayerList                       = js.Array[LayerVersionArn]
  type LayerName                       = String
  type LayerPermissionAllowedAction    = String
  type LayerPermissionAllowedPrincipal = String
  type LayerVersionArn                 = String
  type LayerVersionNumber              = Double
  type LayerVersionsList               = js.Array[LayerVersionsListItem]
  type LayersList                      = js.Array[LayersListItem]
  type LayersReferenceList             = js.Array[Layer]
  type LicenseInfo                     = String
  type LogType                         = String
  type MasterRegion                    = String
  type MaxLayerListItems               = Int
  type MaxListItems                    = Int
  type MemorySize                      = Int
  type NameSpacedFunctionArn           = String
  type NamespacedFunctionName          = String
  type NamespacedStatementId           = String
  type OrganizationId                  = String
  type Principal                       = String
  type Qualifier                       = String
  type ReservedConcurrentExecutions    = Int
  type ResourceArn                     = String
  type RoleArn                         = String
  type Runtime                         = String
  type S3Bucket                        = String
  type S3Key                           = String
  type S3ObjectVersion                 = String
  type SecurityGroupId                 = String
  type SecurityGroupIds                = js.Array[SecurityGroupId]
  type SensitiveString                 = String
  type SourceOwner                     = String
  type StatementId                     = String
  type SubnetId                        = String
  type SubnetIds                       = js.Array[SubnetId]
  type TagKey                          = String
  type TagKeyList                      = js.Array[TagKey]
  type TagValue                        = String
  type Tags                            = js.Dictionary[TagValue]
  type Timeout                         = Int
  type Timestamp                       = String
  type TracingMode                     = String
  type UnreservedConcurrentExecutions  = Int
  type Version                         = String
  type VpcId                           = String
  type Weight                          = Double

  implicit final class LambdaOps(val service: Lambda) extends AnyVal {

    def addLayerVersionPermissionFuture(
        params: AddLayerVersionPermissionRequest
    ): Future[AddLayerVersionPermissionResponse] = service.addLayerVersionPermission(params).promise.toFuture
    def addPermissionFuture(params: AddPermissionRequest): Future[AddPermissionResponse] =
      service.addPermission(params).promise.toFuture
    def createAliasFuture(params: CreateAliasRequest): Future[AliasConfiguration] =
      service.createAlias(params).promise.toFuture
    def createEventSourceMappingFuture(
        params: CreateEventSourceMappingRequest
    ): Future[EventSourceMappingConfiguration] = service.createEventSourceMapping(params).promise.toFuture
    def createFunctionFuture(params: CreateFunctionRequest): Future[FunctionConfiguration] =
      service.createFunction(params).promise.toFuture
    def deleteAliasFuture(params: DeleteAliasRequest): Future[js.Object] = service.deleteAlias(params).promise.toFuture
    def deleteEventSourceMappingFuture(
        params: DeleteEventSourceMappingRequest
    ): Future[EventSourceMappingConfiguration] = service.deleteEventSourceMapping(params).promise.toFuture
    def deleteFunctionConcurrencyFuture(params: DeleteFunctionConcurrencyRequest): Future[js.Object] =
      service.deleteFunctionConcurrency(params).promise.toFuture
    def deleteFunctionFuture(params: DeleteFunctionRequest): Future[js.Object] =
      service.deleteFunction(params).promise.toFuture
    def deleteLayerVersionFuture(params: DeleteLayerVersionRequest): Future[js.Object] =
      service.deleteLayerVersion(params).promise.toFuture
    def getAccountSettingsFuture(params: GetAccountSettingsRequest): Future[GetAccountSettingsResponse] =
      service.getAccountSettings(params).promise.toFuture
    def getAliasFuture(params: GetAliasRequest): Future[AliasConfiguration] = service.getAlias(params).promise.toFuture
    def getEventSourceMappingFuture(params: GetEventSourceMappingRequest): Future[EventSourceMappingConfiguration] =
      service.getEventSourceMapping(params).promise.toFuture
    def getFunctionConfigurationFuture(params: GetFunctionConfigurationRequest): Future[FunctionConfiguration] =
      service.getFunctionConfiguration(params).promise.toFuture
    def getFunctionFuture(params: GetFunctionRequest): Future[GetFunctionResponse] =
      service.getFunction(params).promise.toFuture
    def getLayerVersionFuture(params: GetLayerVersionRequest): Future[GetLayerVersionResponse] =
      service.getLayerVersion(params).promise.toFuture
    def getLayerVersionPolicyFuture(params: GetLayerVersionPolicyRequest): Future[GetLayerVersionPolicyResponse] =
      service.getLayerVersionPolicy(params).promise.toFuture
    def getPolicyFuture(params: GetPolicyRequest): Future[GetPolicyResponse] =
      service.getPolicy(params).promise.toFuture
    def invokeFuture(params: InvocationRequest): Future[InvocationResponse] = service.invoke(params).promise.toFuture
    def listAliasesFuture(params: ListAliasesRequest): Future[ListAliasesResponse] =
      service.listAliases(params).promise.toFuture
    def listEventSourceMappingsFuture(params: ListEventSourceMappingsRequest): Future[ListEventSourceMappingsResponse] =
      service.listEventSourceMappings(params).promise.toFuture
    def listFunctionsFuture(params: ListFunctionsRequest): Future[ListFunctionsResponse] =
      service.listFunctions(params).promise.toFuture
    def listLayerVersionsFuture(params: ListLayerVersionsRequest): Future[ListLayerVersionsResponse] =
      service.listLayerVersions(params).promise.toFuture
    def listLayersFuture(params: ListLayersRequest): Future[ListLayersResponse] =
      service.listLayers(params).promise.toFuture
    def listTagsFuture(params: ListTagsRequest): Future[ListTagsResponse] = service.listTags(params).promise.toFuture
    def listVersionsByFunctionFuture(params: ListVersionsByFunctionRequest): Future[ListVersionsByFunctionResponse] =
      service.listVersionsByFunction(params).promise.toFuture
    def publishLayerVersionFuture(params: PublishLayerVersionRequest): Future[PublishLayerVersionResponse] =
      service.publishLayerVersion(params).promise.toFuture
    def publishVersionFuture(params: PublishVersionRequest): Future[FunctionConfiguration] =
      service.publishVersion(params).promise.toFuture
    def putFunctionConcurrencyFuture(params: PutFunctionConcurrencyRequest): Future[Concurrency] =
      service.putFunctionConcurrency(params).promise.toFuture
    def removeLayerVersionPermissionFuture(params: RemoveLayerVersionPermissionRequest): Future[js.Object] =
      service.removeLayerVersionPermission(params).promise.toFuture
    def removePermissionFuture(params: RemovePermissionRequest): Future[js.Object] =
      service.removePermission(params).promise.toFuture
    def tagResourceFuture(params: TagResourceRequest): Future[js.Object] = service.tagResource(params).promise.toFuture
    def untagResourceFuture(params: UntagResourceRequest): Future[js.Object] =
      service.untagResource(params).promise.toFuture
    def updateAliasFuture(params: UpdateAliasRequest): Future[AliasConfiguration] =
      service.updateAlias(params).promise.toFuture
    def updateEventSourceMappingFuture(
        params: UpdateEventSourceMappingRequest
    ): Future[EventSourceMappingConfiguration] = service.updateEventSourceMapping(params).promise.toFuture
    def updateFunctionCodeFuture(params: UpdateFunctionCodeRequest): Future[FunctionConfiguration] =
      service.updateFunctionCode(params).promise.toFuture
    def updateFunctionConfigurationFuture(params: UpdateFunctionConfigurationRequest): Future[FunctionConfiguration] =
      service.updateFunctionConfiguration(params).promise.toFuture
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
    def deleteFunction(params: DeleteFunctionRequest): Request[js.Object]                          = js.native
    def deleteFunctionConcurrency(params: DeleteFunctionConcurrencyRequest): Request[js.Object]    = js.native
    def deleteLayerVersion(params: DeleteLayerVersionRequest): Request[js.Object]                  = js.native
    def getAccountSettings(params: GetAccountSettingsRequest): Request[GetAccountSettingsResponse] = js.native
    def getAlias(params: GetAliasRequest): Request[AliasConfiguration]                             = js.native
    def getEventSourceMapping(params: GetEventSourceMappingRequest): Request[EventSourceMappingConfiguration] =
      js.native
    def getFunction(params: GetFunctionRequest): Request[GetFunctionResponse]                               = js.native
    def getFunctionConfiguration(params: GetFunctionConfigurationRequest): Request[FunctionConfiguration]   = js.native
    def getLayerVersion(params: GetLayerVersionRequest): Request[GetLayerVersionResponse]                   = js.native
    def getLayerVersionPolicy(params: GetLayerVersionPolicyRequest): Request[GetLayerVersionPolicyResponse] = js.native
    def getPolicy(params: GetPolicyRequest): Request[GetPolicyResponse]                                     = js.native
    def invoke(params: InvocationRequest): Request[InvocationResponse]                                      = js.native
    def listAliases(params: ListAliasesRequest): Request[ListAliasesResponse]                               = js.native
    def listEventSourceMappings(params: ListEventSourceMappingsRequest): Request[ListEventSourceMappingsResponse] =
      js.native
    def listFunctions(params: ListFunctionsRequest): Request[ListFunctionsResponse]             = js.native
    def listLayerVersions(params: ListLayerVersionsRequest): Request[ListLayerVersionsResponse] = js.native
    def listLayers(params: ListLayersRequest): Request[ListLayersResponse]                      = js.native
    def listTags(params: ListTagsRequest): Request[ListTagsResponse]                            = js.native
    def listVersionsByFunction(params: ListVersionsByFunctionRequest): Request[ListVersionsByFunctionResponse] =
      js.native
    def publishLayerVersion(params: PublishLayerVersionRequest): Request[PublishLayerVersionResponse] = js.native
    def publishVersion(params: PublishVersionRequest): Request[FunctionConfiguration]                 = js.native
    def putFunctionConcurrency(params: PutFunctionConcurrencyRequest): Request[Concurrency]           = js.native
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
    @deprecated("Deprecated in AWS SDK", "forever") def invokeAsync(
        params: InvokeAsyncRequest
    ): Request[InvokeAsyncResponse] = js.native
  }

  /**
    * Limits that are related to concurrency and code storage. All file and storage sizes are in bytes.
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
    def apply(
        CodeSizeUnzipped: js.UndefOr[Double] = js.undefined,
        CodeSizeZipped: js.UndefOr[Double] = js.undefined,
        ConcurrentExecutions: js.UndefOr[Int] = js.undefined,
        TotalCodeSize: js.UndefOr[Double] = js.undefined,
        UnreservedConcurrentExecutions: js.UndefOr[UnreservedConcurrentExecutions] = js.undefined
    ): AccountLimit = {
      val __obj = js.Dictionary.empty[js.Any]
      CodeSizeUnzipped.foreach(__v => __obj.update("CodeSizeUnzipped", __v.asInstanceOf[js.Any]))
      CodeSizeZipped.foreach(__v => __obj.update("CodeSizeZipped", __v.asInstanceOf[js.Any]))
      ConcurrentExecutions.foreach(__v => __obj.update("ConcurrentExecutions", __v.asInstanceOf[js.Any]))
      TotalCodeSize.foreach(__v => __obj.update("TotalCodeSize", __v.asInstanceOf[js.Any]))
      UnreservedConcurrentExecutions.foreach(
        __v => __obj.update("UnreservedConcurrentExecutions", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[AccountLimit]
    }
  }

  /**
    * The number of functions and amount of storage in use.
    */
  @js.native
  trait AccountUsage extends js.Object {
    var FunctionCount: js.UndefOr[Double]
    var TotalCodeSize: js.UndefOr[Double]
  }

  object AccountUsage {
    def apply(
        FunctionCount: js.UndefOr[Double] = js.undefined,
        TotalCodeSize: js.UndefOr[Double] = js.undefined
    ): AccountUsage = {
      val __obj = js.Dictionary.empty[js.Any]
      FunctionCount.foreach(__v => __obj.update("FunctionCount", __v.asInstanceOf[js.Any]))
      TotalCodeSize.foreach(__v => __obj.update("TotalCodeSize", __v.asInstanceOf[js.Any]))
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
    def apply(
        Action: LayerPermissionAllowedAction,
        LayerName: LayerName,
        Principal: LayerPermissionAllowedPrincipal,
        StatementId: StatementId,
        VersionNumber: LayerVersionNumber,
        OrganizationId: js.UndefOr[OrganizationId] = js.undefined,
        RevisionId: js.UndefOr[String] = js.undefined
    ): AddLayerVersionPermissionRequest = {
      val __obj = js.Dictionary[js.Any](
        "Action"        -> Action.asInstanceOf[js.Any],
        "LayerName"     -> LayerName.asInstanceOf[js.Any],
        "Principal"     -> Principal.asInstanceOf[js.Any],
        "StatementId"   -> StatementId.asInstanceOf[js.Any],
        "VersionNumber" -> VersionNumber.asInstanceOf[js.Any]
      )

      OrganizationId.foreach(__v => __obj.update("OrganizationId", __v.asInstanceOf[js.Any]))
      RevisionId.foreach(__v => __obj.update("RevisionId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AddLayerVersionPermissionRequest]
    }
  }

  @js.native
  trait AddLayerVersionPermissionResponse extends js.Object {
    var RevisionId: js.UndefOr[String]
    var Statement: js.UndefOr[String]
  }

  object AddLayerVersionPermissionResponse {
    def apply(
        RevisionId: js.UndefOr[String] = js.undefined,
        Statement: js.UndefOr[String] = js.undefined
    ): AddLayerVersionPermissionResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      RevisionId.foreach(__v => __obj.update("RevisionId", __v.asInstanceOf[js.Any]))
      Statement.foreach(__v => __obj.update("Statement", __v.asInstanceOf[js.Any]))
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
      val __obj = js.Dictionary[js.Any](
        "Action"       -> Action.asInstanceOf[js.Any],
        "FunctionName" -> FunctionName.asInstanceOf[js.Any],
        "Principal"    -> Principal.asInstanceOf[js.Any],
        "StatementId"  -> StatementId.asInstanceOf[js.Any]
      )

      EventSourceToken.foreach(__v => __obj.update("EventSourceToken", __v.asInstanceOf[js.Any]))
      Qualifier.foreach(__v => __obj.update("Qualifier", __v.asInstanceOf[js.Any]))
      RevisionId.foreach(__v => __obj.update("RevisionId", __v.asInstanceOf[js.Any]))
      SourceAccount.foreach(__v => __obj.update("SourceAccount", __v.asInstanceOf[js.Any]))
      SourceArn.foreach(__v => __obj.update("SourceArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AddPermissionRequest]
    }
  }

  @js.native
  trait AddPermissionResponse extends js.Object {
    var Statement: js.UndefOr[String]
  }

  object AddPermissionResponse {
    def apply(
        Statement: js.UndefOr[String] = js.undefined
    ): AddPermissionResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Statement.foreach(__v => __obj.update("Statement", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AddPermissionResponse]
    }
  }

  /**
    * Provides configuration information about a Lambda function [[https://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html|alias]].
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
    def apply(
        AliasArn: js.UndefOr[FunctionArn] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        FunctionVersion: js.UndefOr[Version] = js.undefined,
        Name: js.UndefOr[Alias] = js.undefined,
        RevisionId: js.UndefOr[String] = js.undefined,
        RoutingConfig: js.UndefOr[AliasRoutingConfiguration] = js.undefined
    ): AliasConfiguration = {
      val __obj = js.Dictionary.empty[js.Any]
      AliasArn.foreach(__v => __obj.update("AliasArn", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      FunctionVersion.foreach(__v => __obj.update("FunctionVersion", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      RevisionId.foreach(__v => __obj.update("RevisionId", __v.asInstanceOf[js.Any]))
      RoutingConfig.foreach(__v => __obj.update("RoutingConfig", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AliasConfiguration]
    }
  }

  /**
    * The [[https://docs.aws.amazon.com/lambda/latest/dg/lambda-traffic-shifting-using-aliases.html|traffic-shifting]] configuration of a Lambda function alias.
    */
  @js.native
  trait AliasRoutingConfiguration extends js.Object {
    var AdditionalVersionWeights: js.UndefOr[AdditionalVersionWeights]
  }

  object AliasRoutingConfiguration {
    def apply(
        AdditionalVersionWeights: js.UndefOr[AdditionalVersionWeights] = js.undefined
    ): AliasRoutingConfiguration = {
      val __obj = js.Dictionary.empty[js.Any]
      AdditionalVersionWeights.foreach(__v => __obj.update("AdditionalVersionWeights", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AliasRoutingConfiguration]
    }
  }

  @js.native
  trait Concurrency extends js.Object {
    var ReservedConcurrentExecutions: js.UndefOr[ReservedConcurrentExecutions]
  }

  object Concurrency {
    def apply(
        ReservedConcurrentExecutions: js.UndefOr[ReservedConcurrentExecutions] = js.undefined
    ): Concurrency = {
      val __obj = js.Dictionary.empty[js.Any]
      ReservedConcurrentExecutions.foreach(
        __v => __obj.update("ReservedConcurrentExecutions", __v.asInstanceOf[js.Any])
      )
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
    def apply(
        FunctionName: FunctionName,
        FunctionVersion: Version,
        Name: Alias,
        Description: js.UndefOr[Description] = js.undefined,
        RoutingConfig: js.UndefOr[AliasRoutingConfiguration] = js.undefined
    ): CreateAliasRequest = {
      val __obj = js.Dictionary[js.Any](
        "FunctionName"    -> FunctionName.asInstanceOf[js.Any],
        "FunctionVersion" -> FunctionVersion.asInstanceOf[js.Any],
        "Name"            -> Name.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      RoutingConfig.foreach(__v => __obj.update("RoutingConfig", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAliasRequest]
    }
  }

  @js.native
  trait CreateEventSourceMappingRequest extends js.Object {
    var EventSourceArn: Arn
    var FunctionName: FunctionName
    var BatchSize: js.UndefOr[BatchSize]
    var Enabled: js.UndefOr[Enabled]
    var StartingPosition: js.UndefOr[EventSourcePosition]
    var StartingPositionTimestamp: js.UndefOr[Date]
  }

  object CreateEventSourceMappingRequest {
    def apply(
        EventSourceArn: Arn,
        FunctionName: FunctionName,
        BatchSize: js.UndefOr[BatchSize] = js.undefined,
        Enabled: js.UndefOr[Enabled] = js.undefined,
        StartingPosition: js.UndefOr[EventSourcePosition] = js.undefined,
        StartingPositionTimestamp: js.UndefOr[Date] = js.undefined
    ): CreateEventSourceMappingRequest = {
      val __obj = js.Dictionary[js.Any](
        "EventSourceArn" -> EventSourceArn.asInstanceOf[js.Any],
        "FunctionName"   -> FunctionName.asInstanceOf[js.Any]
      )

      BatchSize.foreach(__v => __obj.update("BatchSize", __v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.update("Enabled", __v.asInstanceOf[js.Any]))
      StartingPosition.foreach(__v => __obj.update("StartingPosition", __v.asInstanceOf[js.Any]))
      StartingPositionTimestamp.foreach(__v => __obj.update("StartingPositionTimestamp", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateEventSourceMappingRequest]
    }
  }

  @js.native
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

  object CreateFunctionRequest {
    def apply(
        Code: FunctionCode,
        FunctionName: FunctionName,
        Handler: Handler,
        Role: RoleArn,
        Runtime: Runtime,
        DeadLetterConfig: js.UndefOr[DeadLetterConfig] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        Environment: js.UndefOr[Environment] = js.undefined,
        KMSKeyArn: js.UndefOr[KMSKeyArn] = js.undefined,
        Layers: js.UndefOr[LayerList] = js.undefined,
        MemorySize: js.UndefOr[MemorySize] = js.undefined,
        Publish: js.UndefOr[Boolean] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        Timeout: js.UndefOr[Timeout] = js.undefined,
        TracingConfig: js.UndefOr[TracingConfig] = js.undefined,
        VpcConfig: js.UndefOr[VpcConfig] = js.undefined
    ): CreateFunctionRequest = {
      val __obj = js.Dictionary[js.Any](
        "Code"         -> Code.asInstanceOf[js.Any],
        "FunctionName" -> FunctionName.asInstanceOf[js.Any],
        "Handler"      -> Handler.asInstanceOf[js.Any],
        "Role"         -> Role.asInstanceOf[js.Any],
        "Runtime"      -> Runtime.asInstanceOf[js.Any]
      )

      DeadLetterConfig.foreach(__v => __obj.update("DeadLetterConfig", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      Environment.foreach(__v => __obj.update("Environment", __v.asInstanceOf[js.Any]))
      KMSKeyArn.foreach(__v => __obj.update("KMSKeyArn", __v.asInstanceOf[js.Any]))
      Layers.foreach(__v => __obj.update("Layers", __v.asInstanceOf[js.Any]))
      MemorySize.foreach(__v => __obj.update("MemorySize", __v.asInstanceOf[js.Any]))
      Publish.foreach(__v => __obj.update("Publish", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      Timeout.foreach(__v => __obj.update("Timeout", __v.asInstanceOf[js.Any]))
      TracingConfig.foreach(__v => __obj.update("TracingConfig", __v.asInstanceOf[js.Any]))
      VpcConfig.foreach(__v => __obj.update("VpcConfig", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFunctionRequest]
    }
  }

  /**
    * The [[https://docs.aws.amazon.com/lambda/latest/dg/dlq.html|dead letter queue]] for failed asynchronous invocations.
    */
  @js.native
  trait DeadLetterConfig extends js.Object {
    var TargetArn: js.UndefOr[ResourceArn]
  }

  object DeadLetterConfig {
    def apply(
        TargetArn: js.UndefOr[ResourceArn] = js.undefined
    ): DeadLetterConfig = {
      val __obj = js.Dictionary.empty[js.Any]
      TargetArn.foreach(__v => __obj.update("TargetArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeadLetterConfig]
    }
  }

  @js.native
  trait DeleteAliasRequest extends js.Object {
    var FunctionName: FunctionName
    var Name: Alias
  }

  object DeleteAliasRequest {
    def apply(
        FunctionName: FunctionName,
        Name: Alias
    ): DeleteAliasRequest = {
      val __obj = js.Dictionary[js.Any](
        "FunctionName" -> FunctionName.asInstanceOf[js.Any],
        "Name"         -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteAliasRequest]
    }
  }

  @js.native
  trait DeleteEventSourceMappingRequest extends js.Object {
    var UUID: String
  }

  object DeleteEventSourceMappingRequest {
    def apply(
        UUID: String
    ): DeleteEventSourceMappingRequest = {
      val __obj = js.Dictionary[js.Any](
        "UUID" -> UUID.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteEventSourceMappingRequest]
    }
  }

  @js.native
  trait DeleteFunctionConcurrencyRequest extends js.Object {
    var FunctionName: FunctionName
  }

  object DeleteFunctionConcurrencyRequest {
    def apply(
        FunctionName: FunctionName
    ): DeleteFunctionConcurrencyRequest = {
      val __obj = js.Dictionary[js.Any](
        "FunctionName" -> FunctionName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteFunctionConcurrencyRequest]
    }
  }

  @js.native
  trait DeleteFunctionRequest extends js.Object {
    var FunctionName: FunctionName
    var Qualifier: js.UndefOr[Qualifier]
  }

  object DeleteFunctionRequest {
    def apply(
        FunctionName: FunctionName,
        Qualifier: js.UndefOr[Qualifier] = js.undefined
    ): DeleteFunctionRequest = {
      val __obj = js.Dictionary[js.Any](
        "FunctionName" -> FunctionName.asInstanceOf[js.Any]
      )

      Qualifier.foreach(__v => __obj.update("Qualifier", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteFunctionRequest]
    }
  }

  @js.native
  trait DeleteLayerVersionRequest extends js.Object {
    var LayerName: LayerName
    var VersionNumber: LayerVersionNumber
  }

  object DeleteLayerVersionRequest {
    def apply(
        LayerName: LayerName,
        VersionNumber: LayerVersionNumber
    ): DeleteLayerVersionRequest = {
      val __obj = js.Dictionary[js.Any](
        "LayerName"     -> LayerName.asInstanceOf[js.Any],
        "VersionNumber" -> VersionNumber.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteLayerVersionRequest]
    }
  }

  /**
    * A function's environment variable settings.
    */
  @js.native
  trait Environment extends js.Object {
    var Variables: js.UndefOr[EnvironmentVariables]
  }

  object Environment {
    def apply(
        Variables: js.UndefOr[EnvironmentVariables] = js.undefined
    ): Environment = {
      val __obj = js.Dictionary.empty[js.Any]
      Variables.foreach(__v => __obj.update("Variables", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Environment]
    }
  }

  /**
    * Error messages for environment variables that couldn't be applied.
    */
  @js.native
  trait EnvironmentError extends js.Object {
    var ErrorCode: js.UndefOr[String]
    var Message: js.UndefOr[SensitiveString]
  }

  object EnvironmentError {
    def apply(
        ErrorCode: js.UndefOr[String] = js.undefined,
        Message: js.UndefOr[SensitiveString] = js.undefined
    ): EnvironmentError = {
      val __obj = js.Dictionary.empty[js.Any]
      ErrorCode.foreach(__v => __obj.update("ErrorCode", __v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.update("Message", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EnvironmentError]
    }
  }

  /**
    * The results of a configuration update that applied environment variables.
    */
  @js.native
  trait EnvironmentResponse extends js.Object {
    var Error: js.UndefOr[EnvironmentError]
    var Variables: js.UndefOr[EnvironmentVariables]
  }

  object EnvironmentResponse {
    def apply(
        Error: js.UndefOr[EnvironmentError] = js.undefined,
        Variables: js.UndefOr[EnvironmentVariables] = js.undefined
    ): EnvironmentResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Error.foreach(__v => __obj.update("Error", __v.asInstanceOf[js.Any]))
      Variables.foreach(__v => __obj.update("Variables", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EnvironmentResponse]
    }
  }

  /**
    * A mapping between an AWS resource and an AWS Lambda function. See <a>CreateEventSourceMapping</a> for details.
    */
  @js.native
  trait EventSourceMappingConfiguration extends js.Object {
    var BatchSize: js.UndefOr[BatchSize]
    var EventSourceArn: js.UndefOr[Arn]
    var FunctionArn: js.UndefOr[FunctionArn]
    var LastModified: js.UndefOr[Date]
    var LastProcessingResult: js.UndefOr[String]
    var State: js.UndefOr[String]
    var StateTransitionReason: js.UndefOr[String]
    var UUID: js.UndefOr[String]
  }

  object EventSourceMappingConfiguration {
    def apply(
        BatchSize: js.UndefOr[BatchSize] = js.undefined,
        EventSourceArn: js.UndefOr[Arn] = js.undefined,
        FunctionArn: js.UndefOr[FunctionArn] = js.undefined,
        LastModified: js.UndefOr[Date] = js.undefined,
        LastProcessingResult: js.UndefOr[String] = js.undefined,
        State: js.UndefOr[String] = js.undefined,
        StateTransitionReason: js.UndefOr[String] = js.undefined,
        UUID: js.UndefOr[String] = js.undefined
    ): EventSourceMappingConfiguration = {
      val __obj = js.Dictionary.empty[js.Any]
      BatchSize.foreach(__v => __obj.update("BatchSize", __v.asInstanceOf[js.Any]))
      EventSourceArn.foreach(__v => __obj.update("EventSourceArn", __v.asInstanceOf[js.Any]))
      FunctionArn.foreach(__v => __obj.update("FunctionArn", __v.asInstanceOf[js.Any]))
      LastModified.foreach(__v => __obj.update("LastModified", __v.asInstanceOf[js.Any]))
      LastProcessingResult.foreach(__v => __obj.update("LastProcessingResult", __v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.update("State", __v.asInstanceOf[js.Any]))
      StateTransitionReason.foreach(__v => __obj.update("StateTransitionReason", __v.asInstanceOf[js.Any]))
      UUID.foreach(__v => __obj.update("UUID", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventSourceMappingConfiguration]
    }
  }

  object EventSourcePositionEnum {
    val TRIM_HORIZON = "TRIM_HORIZON"
    val LATEST       = "LATEST"
    val AT_TIMESTAMP = "AT_TIMESTAMP"

    val values = IndexedSeq(TRIM_HORIZON, LATEST, AT_TIMESTAMP)
  }

  /**
    * The code for the Lambda function. You can specify either an object in Amazon S3, or upload a deployment package directly.
    */
  @js.native
  trait FunctionCode extends js.Object {
    var S3Bucket: js.UndefOr[S3Bucket]
    var S3Key: js.UndefOr[S3Key]
    var S3ObjectVersion: js.UndefOr[S3ObjectVersion]
    var ZipFile: js.UndefOr[Blob]
  }

  object FunctionCode {
    def apply(
        S3Bucket: js.UndefOr[S3Bucket] = js.undefined,
        S3Key: js.UndefOr[S3Key] = js.undefined,
        S3ObjectVersion: js.UndefOr[S3ObjectVersion] = js.undefined,
        ZipFile: js.UndefOr[Blob] = js.undefined
    ): FunctionCode = {
      val __obj = js.Dictionary.empty[js.Any]
      S3Bucket.foreach(__v => __obj.update("S3Bucket", __v.asInstanceOf[js.Any]))
      S3Key.foreach(__v => __obj.update("S3Key", __v.asInstanceOf[js.Any]))
      S3ObjectVersion.foreach(__v => __obj.update("S3ObjectVersion", __v.asInstanceOf[js.Any]))
      ZipFile.foreach(__v => __obj.update("ZipFile", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FunctionCode]
    }
  }

  /**
    * Details about a function's deployment package.
    */
  @js.native
  trait FunctionCodeLocation extends js.Object {
    var Location: js.UndefOr[String]
    var RepositoryType: js.UndefOr[String]
  }

  object FunctionCodeLocation {
    def apply(
        Location: js.UndefOr[String] = js.undefined,
        RepositoryType: js.UndefOr[String] = js.undefined
    ): FunctionCodeLocation = {
      val __obj = js.Dictionary.empty[js.Any]
      Location.foreach(__v => __obj.update("Location", __v.asInstanceOf[js.Any]))
      RepositoryType.foreach(__v => __obj.update("RepositoryType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FunctionCodeLocation]
    }
  }

  /**
    * Details about a function's configuration.
    */
  @js.native
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
    var Layers: js.UndefOr[LayersReferenceList]
    var MasterArn: js.UndefOr[FunctionArn]
    var MemorySize: js.UndefOr[MemorySize]
    var RevisionId: js.UndefOr[String]
    var Role: js.UndefOr[RoleArn]
    var Runtime: js.UndefOr[Runtime]
    var Timeout: js.UndefOr[Timeout]
    var TracingConfig: js.UndefOr[TracingConfigResponse]
    var Version: js.UndefOr[Version]
    var VpcConfig: js.UndefOr[VpcConfigResponse]
  }

  object FunctionConfiguration {
    def apply(
        CodeSha256: js.UndefOr[String] = js.undefined,
        CodeSize: js.UndefOr[Double] = js.undefined,
        DeadLetterConfig: js.UndefOr[DeadLetterConfig] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        Environment: js.UndefOr[EnvironmentResponse] = js.undefined,
        FunctionArn: js.UndefOr[NameSpacedFunctionArn] = js.undefined,
        FunctionName: js.UndefOr[NamespacedFunctionName] = js.undefined,
        Handler: js.UndefOr[Handler] = js.undefined,
        KMSKeyArn: js.UndefOr[KMSKeyArn] = js.undefined,
        LastModified: js.UndefOr[Timestamp] = js.undefined,
        Layers: js.UndefOr[LayersReferenceList] = js.undefined,
        MasterArn: js.UndefOr[FunctionArn] = js.undefined,
        MemorySize: js.UndefOr[MemorySize] = js.undefined,
        RevisionId: js.UndefOr[String] = js.undefined,
        Role: js.UndefOr[RoleArn] = js.undefined,
        Runtime: js.UndefOr[Runtime] = js.undefined,
        Timeout: js.UndefOr[Timeout] = js.undefined,
        TracingConfig: js.UndefOr[TracingConfigResponse] = js.undefined,
        Version: js.UndefOr[Version] = js.undefined,
        VpcConfig: js.UndefOr[VpcConfigResponse] = js.undefined
    ): FunctionConfiguration = {
      val __obj = js.Dictionary.empty[js.Any]
      CodeSha256.foreach(__v => __obj.update("CodeSha256", __v.asInstanceOf[js.Any]))
      CodeSize.foreach(__v => __obj.update("CodeSize", __v.asInstanceOf[js.Any]))
      DeadLetterConfig.foreach(__v => __obj.update("DeadLetterConfig", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      Environment.foreach(__v => __obj.update("Environment", __v.asInstanceOf[js.Any]))
      FunctionArn.foreach(__v => __obj.update("FunctionArn", __v.asInstanceOf[js.Any]))
      FunctionName.foreach(__v => __obj.update("FunctionName", __v.asInstanceOf[js.Any]))
      Handler.foreach(__v => __obj.update("Handler", __v.asInstanceOf[js.Any]))
      KMSKeyArn.foreach(__v => __obj.update("KMSKeyArn", __v.asInstanceOf[js.Any]))
      LastModified.foreach(__v => __obj.update("LastModified", __v.asInstanceOf[js.Any]))
      Layers.foreach(__v => __obj.update("Layers", __v.asInstanceOf[js.Any]))
      MasterArn.foreach(__v => __obj.update("MasterArn", __v.asInstanceOf[js.Any]))
      MemorySize.foreach(__v => __obj.update("MemorySize", __v.asInstanceOf[js.Any]))
      RevisionId.foreach(__v => __obj.update("RevisionId", __v.asInstanceOf[js.Any]))
      Role.foreach(__v => __obj.update("Role", __v.asInstanceOf[js.Any]))
      Runtime.foreach(__v => __obj.update("Runtime", __v.asInstanceOf[js.Any]))
      Timeout.foreach(__v => __obj.update("Timeout", __v.asInstanceOf[js.Any]))
      TracingConfig.foreach(__v => __obj.update("TracingConfig", __v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.update("Version", __v.asInstanceOf[js.Any]))
      VpcConfig.foreach(__v => __obj.update("VpcConfig", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FunctionConfiguration]
    }
  }

  object FunctionVersionEnum {
    val ALL = "ALL"

    val values = IndexedSeq(ALL)
  }

  @js.native
  trait GetAccountSettingsRequest extends js.Object {}

  object GetAccountSettingsRequest {
    def apply(
        ): GetAccountSettingsRequest = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[GetAccountSettingsRequest]
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
        AccountUsage: js.UndefOr[AccountUsage] = js.undefined
    ): GetAccountSettingsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      AccountLimit.foreach(__v => __obj.update("AccountLimit", __v.asInstanceOf[js.Any]))
      AccountUsage.foreach(__v => __obj.update("AccountUsage", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAccountSettingsResponse]
    }
  }

  @js.native
  trait GetAliasRequest extends js.Object {
    var FunctionName: FunctionName
    var Name: Alias
  }

  object GetAliasRequest {
    def apply(
        FunctionName: FunctionName,
        Name: Alias
    ): GetAliasRequest = {
      val __obj = js.Dictionary[js.Any](
        "FunctionName" -> FunctionName.asInstanceOf[js.Any],
        "Name"         -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetAliasRequest]
    }
  }

  @js.native
  trait GetEventSourceMappingRequest extends js.Object {
    var UUID: String
  }

  object GetEventSourceMappingRequest {
    def apply(
        UUID: String
    ): GetEventSourceMappingRequest = {
      val __obj = js.Dictionary[js.Any](
        "UUID" -> UUID.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetEventSourceMappingRequest]
    }
  }

  @js.native
  trait GetFunctionConfigurationRequest extends js.Object {
    var FunctionName: NamespacedFunctionName
    var Qualifier: js.UndefOr[Qualifier]
  }

  object GetFunctionConfigurationRequest {
    def apply(
        FunctionName: NamespacedFunctionName,
        Qualifier: js.UndefOr[Qualifier] = js.undefined
    ): GetFunctionConfigurationRequest = {
      val __obj = js.Dictionary[js.Any](
        "FunctionName" -> FunctionName.asInstanceOf[js.Any]
      )

      Qualifier.foreach(__v => __obj.update("Qualifier", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFunctionConfigurationRequest]
    }
  }

  @js.native
  trait GetFunctionRequest extends js.Object {
    var FunctionName: NamespacedFunctionName
    var Qualifier: js.UndefOr[Qualifier]
  }

  object GetFunctionRequest {
    def apply(
        FunctionName: NamespacedFunctionName,
        Qualifier: js.UndefOr[Qualifier] = js.undefined
    ): GetFunctionRequest = {
      val __obj = js.Dictionary[js.Any](
        "FunctionName" -> FunctionName.asInstanceOf[js.Any]
      )

      Qualifier.foreach(__v => __obj.update("Qualifier", __v.asInstanceOf[js.Any]))
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
    def apply(
        Code: js.UndefOr[FunctionCodeLocation] = js.undefined,
        Concurrency: js.UndefOr[Concurrency] = js.undefined,
        Configuration: js.UndefOr[FunctionConfiguration] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): GetFunctionResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Code.foreach(__v => __obj.update("Code", __v.asInstanceOf[js.Any]))
      Concurrency.foreach(__v => __obj.update("Concurrency", __v.asInstanceOf[js.Any]))
      Configuration.foreach(__v => __obj.update("Configuration", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFunctionResponse]
    }
  }

  @js.native
  trait GetLayerVersionPolicyRequest extends js.Object {
    var LayerName: LayerName
    var VersionNumber: LayerVersionNumber
  }

  object GetLayerVersionPolicyRequest {
    def apply(
        LayerName: LayerName,
        VersionNumber: LayerVersionNumber
    ): GetLayerVersionPolicyRequest = {
      val __obj = js.Dictionary[js.Any](
        "LayerName"     -> LayerName.asInstanceOf[js.Any],
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
    def apply(
        Policy: js.UndefOr[String] = js.undefined,
        RevisionId: js.UndefOr[String] = js.undefined
    ): GetLayerVersionPolicyResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Policy.foreach(__v => __obj.update("Policy", __v.asInstanceOf[js.Any]))
      RevisionId.foreach(__v => __obj.update("RevisionId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLayerVersionPolicyResponse]
    }
  }

  @js.native
  trait GetLayerVersionRequest extends js.Object {
    var LayerName: LayerName
    var VersionNumber: LayerVersionNumber
  }

  object GetLayerVersionRequest {
    def apply(
        LayerName: LayerName,
        VersionNumber: LayerVersionNumber
    ): GetLayerVersionRequest = {
      val __obj = js.Dictionary[js.Any](
        "LayerName"     -> LayerName.asInstanceOf[js.Any],
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
      val __obj = js.Dictionary.empty[js.Any]
      CompatibleRuntimes.foreach(__v => __obj.update("CompatibleRuntimes", __v.asInstanceOf[js.Any]))
      Content.foreach(__v => __obj.update("Content", __v.asInstanceOf[js.Any]))
      CreatedDate.foreach(__v => __obj.update("CreatedDate", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      LayerArn.foreach(__v => __obj.update("LayerArn", __v.asInstanceOf[js.Any]))
      LayerVersionArn.foreach(__v => __obj.update("LayerVersionArn", __v.asInstanceOf[js.Any]))
      LicenseInfo.foreach(__v => __obj.update("LicenseInfo", __v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.update("Version", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLayerVersionResponse]
    }
  }

  @js.native
  trait GetPolicyRequest extends js.Object {
    var FunctionName: NamespacedFunctionName
    var Qualifier: js.UndefOr[Qualifier]
  }

  object GetPolicyRequest {
    def apply(
        FunctionName: NamespacedFunctionName,
        Qualifier: js.UndefOr[Qualifier] = js.undefined
    ): GetPolicyRequest = {
      val __obj = js.Dictionary[js.Any](
        "FunctionName" -> FunctionName.asInstanceOf[js.Any]
      )

      Qualifier.foreach(__v => __obj.update("Qualifier", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPolicyRequest]
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
        RevisionId: js.UndefOr[String] = js.undefined
    ): GetPolicyResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Policy.foreach(__v => __obj.update("Policy", __v.asInstanceOf[js.Any]))
      RevisionId.foreach(__v => __obj.update("RevisionId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPolicyResponse]
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
    def apply(
        FunctionName: NamespacedFunctionName,
        ClientContext: js.UndefOr[String] = js.undefined,
        InvocationType: js.UndefOr[InvocationType] = js.undefined,
        LogType: js.UndefOr[LogType] = js.undefined,
        Payload: js.UndefOr[Blob] = js.undefined,
        Qualifier: js.UndefOr[Qualifier] = js.undefined
    ): InvocationRequest = {
      val __obj = js.Dictionary[js.Any](
        "FunctionName" -> FunctionName.asInstanceOf[js.Any]
      )

      ClientContext.foreach(__v => __obj.update("ClientContext", __v.asInstanceOf[js.Any]))
      InvocationType.foreach(__v => __obj.update("InvocationType", __v.asInstanceOf[js.Any]))
      LogType.foreach(__v => __obj.update("LogType", __v.asInstanceOf[js.Any]))
      Payload.foreach(__v => __obj.update("Payload", __v.asInstanceOf[js.Any]))
      Qualifier.foreach(__v => __obj.update("Qualifier", __v.asInstanceOf[js.Any]))
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
    def apply(
        ExecutedVersion: js.UndefOr[Version] = js.undefined,
        FunctionError: js.UndefOr[String] = js.undefined,
        LogResult: js.UndefOr[String] = js.undefined,
        Payload: js.UndefOr[Blob] = js.undefined,
        StatusCode: js.UndefOr[Int] = js.undefined
    ): InvocationResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ExecutedVersion.foreach(__v => __obj.update("ExecutedVersion", __v.asInstanceOf[js.Any]))
      FunctionError.foreach(__v => __obj.update("FunctionError", __v.asInstanceOf[js.Any]))
      LogResult.foreach(__v => __obj.update("LogResult", __v.asInstanceOf[js.Any]))
      Payload.foreach(__v => __obj.update("Payload", __v.asInstanceOf[js.Any]))
      StatusCode.foreach(__v => __obj.update("StatusCode", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InvocationResponse]
    }
  }

  object InvocationTypeEnum {
    val Event           = "Event"
    val RequestResponse = "RequestResponse"
    val DryRun          = "DryRun"

    val values = IndexedSeq(Event, RequestResponse, DryRun)
  }

  @deprecated("Deprecated in AWS SDK", "forever")
  @js.native
  trait InvokeAsyncRequest extends js.Object {
    var FunctionName: NamespacedFunctionName
    var InvokeArgs: BlobStream
  }

  object InvokeAsyncRequest {
    def apply(
        FunctionName: NamespacedFunctionName,
        InvokeArgs: BlobStream
    ): InvokeAsyncRequest = {
      val __obj = js.Dictionary[js.Any](
        "FunctionName" -> FunctionName.asInstanceOf[js.Any],
        "InvokeArgs"   -> InvokeArgs.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[InvokeAsyncRequest]
    }
  }

  /**
    * A success response (<code>202 Accepted</code>) indicates that the request is queued for invocation.
    */
  @deprecated("Deprecated in AWS SDK", "forever")
  @js.native
  trait InvokeAsyncResponse extends js.Object {
    var Status: js.UndefOr[HttpStatus]
  }

  object InvokeAsyncResponse {
    def apply(
        Status: js.UndefOr[HttpStatus] = js.undefined
    ): InvokeAsyncResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InvokeAsyncResponse]
    }
  }

  /**
    * An [[https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html|AWS Lambda layer]].
    */
  @js.native
  trait Layer extends js.Object {
    var Arn: js.UndefOr[LayerVersionArn]
    var CodeSize: js.UndefOr[Double]
  }

  object Layer {
    def apply(
        Arn: js.UndefOr[LayerVersionArn] = js.undefined,
        CodeSize: js.UndefOr[Double] = js.undefined
    ): Layer = {
      val __obj = js.Dictionary.empty[js.Any]
      Arn.foreach(__v => __obj.update("Arn", __v.asInstanceOf[js.Any]))
      CodeSize.foreach(__v => __obj.update("CodeSize", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Layer]
    }
  }

  /**
    * A ZIP archive that contains the contents of an [[https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html|AWS Lambda layer]]. You can specify either an Amazon S3 location, or upload a layer archive directly.
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
        ZipFile: js.UndefOr[Blob] = js.undefined
    ): LayerVersionContentInput = {
      val __obj = js.Dictionary.empty[js.Any]
      S3Bucket.foreach(__v => __obj.update("S3Bucket", __v.asInstanceOf[js.Any]))
      S3Key.foreach(__v => __obj.update("S3Key", __v.asInstanceOf[js.Any]))
      S3ObjectVersion.foreach(__v => __obj.update("S3ObjectVersion", __v.asInstanceOf[js.Any]))
      ZipFile.foreach(__v => __obj.update("ZipFile", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LayerVersionContentInput]
    }
  }

  /**
    * Details about a version of an [[https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html|AWS Lambda layer]].
    */
  @js.native
  trait LayerVersionContentOutput extends js.Object {
    var CodeSha256: js.UndefOr[String]
    var CodeSize: js.UndefOr[Double]
    var Location: js.UndefOr[String]
  }

  object LayerVersionContentOutput {
    def apply(
        CodeSha256: js.UndefOr[String] = js.undefined,
        CodeSize: js.UndefOr[Double] = js.undefined,
        Location: js.UndefOr[String] = js.undefined
    ): LayerVersionContentOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      CodeSha256.foreach(__v => __obj.update("CodeSha256", __v.asInstanceOf[js.Any]))
      CodeSize.foreach(__v => __obj.update("CodeSize", __v.asInstanceOf[js.Any]))
      Location.foreach(__v => __obj.update("Location", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LayerVersionContentOutput]
    }
  }

  /**
    * Details about a version of an [[https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html|AWS Lambda layer]].
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
    def apply(
        CompatibleRuntimes: js.UndefOr[CompatibleRuntimes] = js.undefined,
        CreatedDate: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        LayerVersionArn: js.UndefOr[LayerVersionArn] = js.undefined,
        LicenseInfo: js.UndefOr[LicenseInfo] = js.undefined,
        Version: js.UndefOr[LayerVersionNumber] = js.undefined
    ): LayerVersionsListItem = {
      val __obj = js.Dictionary.empty[js.Any]
      CompatibleRuntimes.foreach(__v => __obj.update("CompatibleRuntimes", __v.asInstanceOf[js.Any]))
      CreatedDate.foreach(__v => __obj.update("CreatedDate", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      LayerVersionArn.foreach(__v => __obj.update("LayerVersionArn", __v.asInstanceOf[js.Any]))
      LicenseInfo.foreach(__v => __obj.update("LicenseInfo", __v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.update("Version", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LayerVersionsListItem]
    }
  }

  /**
    * Details about an [[https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html|AWS Lambda layer]].
    */
  @js.native
  trait LayersListItem extends js.Object {
    var LatestMatchingVersion: js.UndefOr[LayerVersionsListItem]
    var LayerArn: js.UndefOr[LayerArn]
    var LayerName: js.UndefOr[LayerName]
  }

  object LayersListItem {
    def apply(
        LatestMatchingVersion: js.UndefOr[LayerVersionsListItem] = js.undefined,
        LayerArn: js.UndefOr[LayerArn] = js.undefined,
        LayerName: js.UndefOr[LayerName] = js.undefined
    ): LayersListItem = {
      val __obj = js.Dictionary.empty[js.Any]
      LatestMatchingVersion.foreach(__v => __obj.update("LatestMatchingVersion", __v.asInstanceOf[js.Any]))
      LayerArn.foreach(__v => __obj.update("LayerArn", __v.asInstanceOf[js.Any]))
      LayerName.foreach(__v => __obj.update("LayerName", __v.asInstanceOf[js.Any]))
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
    def apply(
        FunctionName: FunctionName,
        FunctionVersion: js.UndefOr[Version] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxItems: js.UndefOr[MaxListItems] = js.undefined
    ): ListAliasesRequest = {
      val __obj = js.Dictionary[js.Any](
        "FunctionName" -> FunctionName.asInstanceOf[js.Any]
      )

      FunctionVersion.foreach(__v => __obj.update("FunctionVersion", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.update("MaxItems", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAliasesRequest]
    }
  }

  @js.native
  trait ListAliasesResponse extends js.Object {
    var Aliases: js.UndefOr[AliasList]
    var NextMarker: js.UndefOr[String]
  }

  object ListAliasesResponse {
    def apply(
        Aliases: js.UndefOr[AliasList] = js.undefined,
        NextMarker: js.UndefOr[String] = js.undefined
    ): ListAliasesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Aliases.foreach(__v => __obj.update("Aliases", __v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.update("NextMarker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAliasesResponse]
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
        MaxItems: js.UndefOr[MaxListItems] = js.undefined
    ): ListEventSourceMappingsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      EventSourceArn.foreach(__v => __obj.update("EventSourceArn", __v.asInstanceOf[js.Any]))
      FunctionName.foreach(__v => __obj.update("FunctionName", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.update("MaxItems", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEventSourceMappingsRequest]
    }
  }

  @js.native
  trait ListEventSourceMappingsResponse extends js.Object {
    var EventSourceMappings: js.UndefOr[EventSourceMappingsList]
    var NextMarker: js.UndefOr[String]
  }

  object ListEventSourceMappingsResponse {
    def apply(
        EventSourceMappings: js.UndefOr[EventSourceMappingsList] = js.undefined,
        NextMarker: js.UndefOr[String] = js.undefined
    ): ListEventSourceMappingsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      EventSourceMappings.foreach(__v => __obj.update("EventSourceMappings", __v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.update("NextMarker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEventSourceMappingsResponse]
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
    def apply(
        FunctionVersion: js.UndefOr[FunctionVersion] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MasterRegion: js.UndefOr[MasterRegion] = js.undefined,
        MaxItems: js.UndefOr[MaxListItems] = js.undefined
    ): ListFunctionsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      FunctionVersion.foreach(__v => __obj.update("FunctionVersion", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MasterRegion.foreach(__v => __obj.update("MasterRegion", __v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.update("MaxItems", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFunctionsRequest]
    }
  }

  /**
    * A list of Lambda functions.
    */
  @js.native
  trait ListFunctionsResponse extends js.Object {
    var Functions: js.UndefOr[FunctionList]
    var NextMarker: js.UndefOr[String]
  }

  object ListFunctionsResponse {
    def apply(
        Functions: js.UndefOr[FunctionList] = js.undefined,
        NextMarker: js.UndefOr[String] = js.undefined
    ): ListFunctionsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Functions.foreach(__v => __obj.update("Functions", __v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.update("NextMarker", __v.asInstanceOf[js.Any]))
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
    def apply(
        LayerName: LayerName,
        CompatibleRuntime: js.UndefOr[Runtime] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxItems: js.UndefOr[MaxLayerListItems] = js.undefined
    ): ListLayerVersionsRequest = {
      val __obj = js.Dictionary[js.Any](
        "LayerName" -> LayerName.asInstanceOf[js.Any]
      )

      CompatibleRuntime.foreach(__v => __obj.update("CompatibleRuntime", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.update("MaxItems", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLayerVersionsRequest]
    }
  }

  @js.native
  trait ListLayerVersionsResponse extends js.Object {
    var LayerVersions: js.UndefOr[LayerVersionsList]
    var NextMarker: js.UndefOr[String]
  }

  object ListLayerVersionsResponse {
    def apply(
        LayerVersions: js.UndefOr[LayerVersionsList] = js.undefined,
        NextMarker: js.UndefOr[String] = js.undefined
    ): ListLayerVersionsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      LayerVersions.foreach(__v => __obj.update("LayerVersions", __v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.update("NextMarker", __v.asInstanceOf[js.Any]))
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
    def apply(
        CompatibleRuntime: js.UndefOr[Runtime] = js.undefined,
        Marker: js.UndefOr[String] = js.undefined,
        MaxItems: js.UndefOr[MaxLayerListItems] = js.undefined
    ): ListLayersRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      CompatibleRuntime.foreach(__v => __obj.update("CompatibleRuntime", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.update("MaxItems", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLayersRequest]
    }
  }

  @js.native
  trait ListLayersResponse extends js.Object {
    var Layers: js.UndefOr[LayersList]
    var NextMarker: js.UndefOr[String]
  }

  object ListLayersResponse {
    def apply(
        Layers: js.UndefOr[LayersList] = js.undefined,
        NextMarker: js.UndefOr[String] = js.undefined
    ): ListLayersResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Layers.foreach(__v => __obj.update("Layers", __v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.update("NextMarker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLayersResponse]
    }
  }

  @js.native
  trait ListTagsRequest extends js.Object {
    var Resource: FunctionArn
  }

  object ListTagsRequest {
    def apply(
        Resource: FunctionArn
    ): ListTagsRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        Tags: js.UndefOr[Tags] = js.undefined
    ): ListTagsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
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
    def apply(
        FunctionName: NamespacedFunctionName,
        Marker: js.UndefOr[String] = js.undefined,
        MaxItems: js.UndefOr[MaxListItems] = js.undefined
    ): ListVersionsByFunctionRequest = {
      val __obj = js.Dictionary[js.Any](
        "FunctionName" -> FunctionName.asInstanceOf[js.Any]
      )

      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.update("MaxItems", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVersionsByFunctionRequest]
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
        Versions: js.UndefOr[FunctionList] = js.undefined
    ): ListVersionsByFunctionResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NextMarker.foreach(__v => __obj.update("NextMarker", __v.asInstanceOf[js.Any]))
      Versions.foreach(__v => __obj.update("Versions", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVersionsByFunctionResponse]
    }
  }

  object LogTypeEnum {
    val None = "None"
    val Tail = "Tail"

    val values = IndexedSeq(None, Tail)
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
    def apply(
        Content: LayerVersionContentInput,
        LayerName: LayerName,
        CompatibleRuntimes: js.UndefOr[CompatibleRuntimes] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        LicenseInfo: js.UndefOr[LicenseInfo] = js.undefined
    ): PublishLayerVersionRequest = {
      val __obj = js.Dictionary[js.Any](
        "Content"   -> Content.asInstanceOf[js.Any],
        "LayerName" -> LayerName.asInstanceOf[js.Any]
      )

      CompatibleRuntimes.foreach(__v => __obj.update("CompatibleRuntimes", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      LicenseInfo.foreach(__v => __obj.update("LicenseInfo", __v.asInstanceOf[js.Any]))
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
      val __obj = js.Dictionary.empty[js.Any]
      CompatibleRuntimes.foreach(__v => __obj.update("CompatibleRuntimes", __v.asInstanceOf[js.Any]))
      Content.foreach(__v => __obj.update("Content", __v.asInstanceOf[js.Any]))
      CreatedDate.foreach(__v => __obj.update("CreatedDate", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      LayerArn.foreach(__v => __obj.update("LayerArn", __v.asInstanceOf[js.Any]))
      LayerVersionArn.foreach(__v => __obj.update("LayerVersionArn", __v.asInstanceOf[js.Any]))
      LicenseInfo.foreach(__v => __obj.update("LicenseInfo", __v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.update("Version", __v.asInstanceOf[js.Any]))
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
    def apply(
        FunctionName: FunctionName,
        CodeSha256: js.UndefOr[String] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        RevisionId: js.UndefOr[String] = js.undefined
    ): PublishVersionRequest = {
      val __obj = js.Dictionary[js.Any](
        "FunctionName" -> FunctionName.asInstanceOf[js.Any]
      )

      CodeSha256.foreach(__v => __obj.update("CodeSha256", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      RevisionId.foreach(__v => __obj.update("RevisionId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PublishVersionRequest]
    }
  }

  @js.native
  trait PutFunctionConcurrencyRequest extends js.Object {
    var FunctionName: FunctionName
    var ReservedConcurrentExecutions: ReservedConcurrentExecutions
  }

  object PutFunctionConcurrencyRequest {
    def apply(
        FunctionName: FunctionName,
        ReservedConcurrentExecutions: ReservedConcurrentExecutions
    ): PutFunctionConcurrencyRequest = {
      val __obj = js.Dictionary[js.Any](
        "FunctionName"                 -> FunctionName.asInstanceOf[js.Any],
        "ReservedConcurrentExecutions" -> ReservedConcurrentExecutions.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutFunctionConcurrencyRequest]
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
    def apply(
        LayerName: LayerName,
        StatementId: StatementId,
        VersionNumber: LayerVersionNumber,
        RevisionId: js.UndefOr[String] = js.undefined
    ): RemoveLayerVersionPermissionRequest = {
      val __obj = js.Dictionary[js.Any](
        "LayerName"     -> LayerName.asInstanceOf[js.Any],
        "StatementId"   -> StatementId.asInstanceOf[js.Any],
        "VersionNumber" -> VersionNumber.asInstanceOf[js.Any]
      )

      RevisionId.foreach(__v => __obj.update("RevisionId", __v.asInstanceOf[js.Any]))
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
    def apply(
        FunctionName: FunctionName,
        StatementId: NamespacedStatementId,
        Qualifier: js.UndefOr[Qualifier] = js.undefined,
        RevisionId: js.UndefOr[String] = js.undefined
    ): RemovePermissionRequest = {
      val __obj = js.Dictionary[js.Any](
        "FunctionName" -> FunctionName.asInstanceOf[js.Any],
        "StatementId"  -> StatementId.asInstanceOf[js.Any]
      )

      Qualifier.foreach(__v => __obj.update("Qualifier", __v.asInstanceOf[js.Any]))
      RevisionId.foreach(__v => __obj.update("RevisionId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RemovePermissionRequest]
    }
  }

  object RuntimeEnum {
    val nodejs           = "nodejs"
    val `nodejs4.3`      = "nodejs4.3"
    val `nodejs6.10`     = "nodejs6.10"
    val `nodejs8.10`     = "nodejs8.10"
    val java8            = "java8"
    val `python2.7`      = "python2.7"
    val `python3.6`      = "python3.6"
    val `python3.7`      = "python3.7"
    val `dotnetcore1.0`  = "dotnetcore1.0"
    val `dotnetcore2.0`  = "dotnetcore2.0"
    val `dotnetcore2.1`  = "dotnetcore2.1"
    val `nodejs4.3-edge` = "nodejs4.3-edge"
    val `go1.x`          = "go1.x"
    val `ruby2.5`        = "ruby2.5"
    val provided         = "provided"

    val values = IndexedSeq(
      nodejs,
      `nodejs4.3`,
      `nodejs6.10`,
      `nodejs8.10`,
      java8,
      `python2.7`,
      `python3.6`,
      `python3.7`,
      `dotnetcore1.0`,
      `dotnetcore2.0`,
      `dotnetcore2.1`,
      `nodejs4.3-edge`,
      `go1.x`,
      `ruby2.5`,
      provided
    )
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var Resource: FunctionArn
    var Tags: Tags
  }

  object TagResourceRequest {
    def apply(
        Resource: FunctionArn,
        Tags: Tags
    ): TagResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "Resource" -> Resource.asInstanceOf[js.Any],
        "Tags"     -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  /**
    * The function's AWS X-Ray tracing configuration.
    */
  @js.native
  trait TracingConfig extends js.Object {
    var Mode: js.UndefOr[TracingMode]
  }

  object TracingConfig {
    def apply(
        Mode: js.UndefOr[TracingMode] = js.undefined
    ): TracingConfig = {
      val __obj = js.Dictionary.empty[js.Any]
      Mode.foreach(__v => __obj.update("Mode", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TracingConfig]
    }
  }

  /**
    * The function's AWS X-Ray tracing configuration.
    */
  @js.native
  trait TracingConfigResponse extends js.Object {
    var Mode: js.UndefOr[TracingMode]
  }

  object TracingConfigResponse {
    def apply(
        Mode: js.UndefOr[TracingMode] = js.undefined
    ): TracingConfigResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Mode.foreach(__v => __obj.update("Mode", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TracingConfigResponse]
    }
  }

  object TracingModeEnum {
    val Active      = "Active"
    val PassThrough = "PassThrough"

    val values = IndexedSeq(Active, PassThrough)
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var Resource: FunctionArn
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    def apply(
        Resource: FunctionArn,
        TagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "Resource" -> Resource.asInstanceOf[js.Any],
        "TagKeys"  -> TagKeys.asInstanceOf[js.Any]
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
    def apply(
        FunctionName: FunctionName,
        Name: Alias,
        Description: js.UndefOr[Description] = js.undefined,
        FunctionVersion: js.UndefOr[Version] = js.undefined,
        RevisionId: js.UndefOr[String] = js.undefined,
        RoutingConfig: js.UndefOr[AliasRoutingConfiguration] = js.undefined
    ): UpdateAliasRequest = {
      val __obj = js.Dictionary[js.Any](
        "FunctionName" -> FunctionName.asInstanceOf[js.Any],
        "Name"         -> Name.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      FunctionVersion.foreach(__v => __obj.update("FunctionVersion", __v.asInstanceOf[js.Any]))
      RevisionId.foreach(__v => __obj.update("RevisionId", __v.asInstanceOf[js.Any]))
      RoutingConfig.foreach(__v => __obj.update("RoutingConfig", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAliasRequest]
    }
  }

  @js.native
  trait UpdateEventSourceMappingRequest extends js.Object {
    var UUID: String
    var BatchSize: js.UndefOr[BatchSize]
    var Enabled: js.UndefOr[Enabled]
    var FunctionName: js.UndefOr[FunctionName]
  }

  object UpdateEventSourceMappingRequest {
    def apply(
        UUID: String,
        BatchSize: js.UndefOr[BatchSize] = js.undefined,
        Enabled: js.UndefOr[Enabled] = js.undefined,
        FunctionName: js.UndefOr[FunctionName] = js.undefined
    ): UpdateEventSourceMappingRequest = {
      val __obj = js.Dictionary[js.Any](
        "UUID" -> UUID.asInstanceOf[js.Any]
      )

      BatchSize.foreach(__v => __obj.update("BatchSize", __v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.update("Enabled", __v.asInstanceOf[js.Any]))
      FunctionName.foreach(__v => __obj.update("FunctionName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateEventSourceMappingRequest]
    }
  }

  @js.native
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

  object UpdateFunctionCodeRequest {
    def apply(
        FunctionName: FunctionName,
        DryRun: js.UndefOr[Boolean] = js.undefined,
        Publish: js.UndefOr[Boolean] = js.undefined,
        RevisionId: js.UndefOr[String] = js.undefined,
        S3Bucket: js.UndefOr[S3Bucket] = js.undefined,
        S3Key: js.UndefOr[S3Key] = js.undefined,
        S3ObjectVersion: js.UndefOr[S3ObjectVersion] = js.undefined,
        ZipFile: js.UndefOr[Blob] = js.undefined
    ): UpdateFunctionCodeRequest = {
      val __obj = js.Dictionary[js.Any](
        "FunctionName" -> FunctionName.asInstanceOf[js.Any]
      )

      DryRun.foreach(__v => __obj.update("DryRun", __v.asInstanceOf[js.Any]))
      Publish.foreach(__v => __obj.update("Publish", __v.asInstanceOf[js.Any]))
      RevisionId.foreach(__v => __obj.update("RevisionId", __v.asInstanceOf[js.Any]))
      S3Bucket.foreach(__v => __obj.update("S3Bucket", __v.asInstanceOf[js.Any]))
      S3Key.foreach(__v => __obj.update("S3Key", __v.asInstanceOf[js.Any]))
      S3ObjectVersion.foreach(__v => __obj.update("S3ObjectVersion", __v.asInstanceOf[js.Any]))
      ZipFile.foreach(__v => __obj.update("ZipFile", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFunctionCodeRequest]
    }
  }

  @js.native
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

  object UpdateFunctionConfigurationRequest {
    def apply(
        FunctionName: FunctionName,
        DeadLetterConfig: js.UndefOr[DeadLetterConfig] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        Environment: js.UndefOr[Environment] = js.undefined,
        Handler: js.UndefOr[Handler] = js.undefined,
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
      val __obj = js.Dictionary[js.Any](
        "FunctionName" -> FunctionName.asInstanceOf[js.Any]
      )

      DeadLetterConfig.foreach(__v => __obj.update("DeadLetterConfig", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      Environment.foreach(__v => __obj.update("Environment", __v.asInstanceOf[js.Any]))
      Handler.foreach(__v => __obj.update("Handler", __v.asInstanceOf[js.Any]))
      KMSKeyArn.foreach(__v => __obj.update("KMSKeyArn", __v.asInstanceOf[js.Any]))
      Layers.foreach(__v => __obj.update("Layers", __v.asInstanceOf[js.Any]))
      MemorySize.foreach(__v => __obj.update("MemorySize", __v.asInstanceOf[js.Any]))
      RevisionId.foreach(__v => __obj.update("RevisionId", __v.asInstanceOf[js.Any]))
      Role.foreach(__v => __obj.update("Role", __v.asInstanceOf[js.Any]))
      Runtime.foreach(__v => __obj.update("Runtime", __v.asInstanceOf[js.Any]))
      Timeout.foreach(__v => __obj.update("Timeout", __v.asInstanceOf[js.Any]))
      TracingConfig.foreach(__v => __obj.update("TracingConfig", __v.asInstanceOf[js.Any]))
      VpcConfig.foreach(__v => __obj.update("VpcConfig", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFunctionConfigurationRequest]
    }
  }

  /**
    * The VPC security groups and subnets that are attached to a Lambda function.
    */
  @js.native
  trait VpcConfig extends js.Object {
    var SecurityGroupIds: js.UndefOr[SecurityGroupIds]
    var SubnetIds: js.UndefOr[SubnetIds]
  }

  object VpcConfig {
    def apply(
        SecurityGroupIds: js.UndefOr[SecurityGroupIds] = js.undefined,
        SubnetIds: js.UndefOr[SubnetIds] = js.undefined
    ): VpcConfig = {
      val __obj = js.Dictionary.empty[js.Any]
      SecurityGroupIds.foreach(__v => __obj.update("SecurityGroupIds", __v.asInstanceOf[js.Any]))
      SubnetIds.foreach(__v => __obj.update("SubnetIds", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VpcConfig]
    }
  }

  /**
    * The VPC security groups and subnets that are attached to a Lambda function.
    */
  @js.native
  trait VpcConfigResponse extends js.Object {
    var SecurityGroupIds: js.UndefOr[SecurityGroupIds]
    var SubnetIds: js.UndefOr[SubnetIds]
    var VpcId: js.UndefOr[VpcId]
  }

  object VpcConfigResponse {
    def apply(
        SecurityGroupIds: js.UndefOr[SecurityGroupIds] = js.undefined,
        SubnetIds: js.UndefOr[SubnetIds] = js.undefined,
        VpcId: js.UndefOr[VpcId] = js.undefined
    ): VpcConfigResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      SecurityGroupIds.foreach(__v => __obj.update("SecurityGroupIds", __v.asInstanceOf[js.Any]))
      SubnetIds.foreach(__v => __obj.update("SubnetIds", __v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.update("VpcId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VpcConfigResponse]
    }
  }
}
