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
      val _fields = IndexedSeq[(String, js.Any)](
        "CodeSizeUnzipped" -> CodeSizeUnzipped.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CodeSizeZipped" -> CodeSizeZipped.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ConcurrentExecutions" -> ConcurrentExecutions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TotalCodeSize" -> TotalCodeSize.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UnreservedConcurrentExecutions" -> UnreservedConcurrentExecutions.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AccountLimit]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "FunctionCount" -> FunctionCount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TotalCodeSize" -> TotalCodeSize.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AccountUsage]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Action"        -> Action.asInstanceOf[js.Any],
        "LayerName"     -> LayerName.asInstanceOf[js.Any],
        "Principal"     -> Principal.asInstanceOf[js.Any],
        "StatementId"   -> StatementId.asInstanceOf[js.Any],
        "VersionNumber" -> VersionNumber.asInstanceOf[js.Any],
        "OrganizationId" -> OrganizationId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RevisionId" -> RevisionId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddLayerVersionPermissionRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "RevisionId" -> RevisionId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Statement" -> Statement.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddLayerVersionPermissionResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Action"       -> Action.asInstanceOf[js.Any],
        "FunctionName" -> FunctionName.asInstanceOf[js.Any],
        "Principal"    -> Principal.asInstanceOf[js.Any],
        "StatementId"  -> StatementId.asInstanceOf[js.Any],
        "EventSourceToken" -> EventSourceToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Qualifier" -> Qualifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RevisionId" -> RevisionId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SourceAccount" -> SourceAccount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SourceArn" -> SourceArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddPermissionRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Statement" -> Statement.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddPermissionResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "AliasArn" -> AliasArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FunctionVersion" -> FunctionVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RevisionId" -> RevisionId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RoutingConfig" -> RoutingConfig.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AliasConfiguration]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "AdditionalVersionWeights" -> AdditionalVersionWeights.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AliasRoutingConfiguration]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "ReservedConcurrentExecutions" -> ReservedConcurrentExecutions.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Concurrency]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "FunctionName"    -> FunctionName.asInstanceOf[js.Any],
        "FunctionVersion" -> FunctionVersion.asInstanceOf[js.Any],
        "Name"            -> Name.asInstanceOf[js.Any],
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RoutingConfig" -> RoutingConfig.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAliasRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "EventSourceArn" -> EventSourceArn.asInstanceOf[js.Any],
        "FunctionName"   -> FunctionName.asInstanceOf[js.Any],
        "BatchSize" -> BatchSize.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Enabled" -> Enabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StartingPosition" -> StartingPosition.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StartingPositionTimestamp" -> StartingPositionTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateEventSourceMappingRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Code"         -> Code.asInstanceOf[js.Any],
        "FunctionName" -> FunctionName.asInstanceOf[js.Any],
        "Handler"      -> Handler.asInstanceOf[js.Any],
        "Role"         -> Role.asInstanceOf[js.Any],
        "Runtime"      -> Runtime.asInstanceOf[js.Any],
        "DeadLetterConfig" -> DeadLetterConfig.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Environment" -> Environment.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KMSKeyArn" -> KMSKeyArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Layers" -> Layers.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MemorySize" -> MemorySize.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Publish" -> Publish.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Timeout" -> Timeout.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TracingConfig" -> TracingConfig.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VpcConfig" -> VpcConfig.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateFunctionRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "TargetArn" -> TargetArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeadLetterConfig]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "FunctionName" -> FunctionName.asInstanceOf[js.Any],
        "Name"         -> Name.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAliasRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "UUID" -> UUID.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteEventSourceMappingRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "FunctionName" -> FunctionName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteFunctionConcurrencyRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "FunctionName" -> FunctionName.asInstanceOf[js.Any],
        "Qualifier" -> Qualifier.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteFunctionRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "LayerName"     -> LayerName.asInstanceOf[js.Any],
        "VersionNumber" -> VersionNumber.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteLayerVersionRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Variables" -> Variables.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Environment]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "ErrorCode" -> ErrorCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Message" -> Message.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnvironmentError]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Error" -> Error.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Variables" -> Variables.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnvironmentResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "BatchSize" -> BatchSize.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EventSourceArn" -> EventSourceArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FunctionArn" -> FunctionArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastModified" -> LastModified.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastProcessingResult" -> LastProcessingResult.map { x =>
          x.asInstanceOf[js.Any]
        },
        "State" -> State.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StateTransitionReason" -> StateTransitionReason.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UUID" -> UUID.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventSourceMappingConfiguration]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "S3Bucket" -> S3Bucket.map { x =>
          x.asInstanceOf[js.Any]
        },
        "S3Key" -> S3Key.map { x =>
          x.asInstanceOf[js.Any]
        },
        "S3ObjectVersion" -> S3ObjectVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ZipFile" -> ZipFile.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FunctionCode]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Location" -> Location.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RepositoryType" -> RepositoryType.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FunctionCodeLocation]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "CodeSha256" -> CodeSha256.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CodeSize" -> CodeSize.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeadLetterConfig" -> DeadLetterConfig.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Environment" -> Environment.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FunctionArn" -> FunctionArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FunctionName" -> FunctionName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Handler" -> Handler.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KMSKeyArn" -> KMSKeyArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastModified" -> LastModified.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Layers" -> Layers.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MasterArn" -> MasterArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MemorySize" -> MemorySize.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RevisionId" -> RevisionId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Role" -> Role.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Runtime" -> Runtime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Timeout" -> Timeout.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TracingConfig" -> TracingConfig.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Version" -> Version.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VpcConfig" -> VpcConfig.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FunctionConfiguration]
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
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

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
        AccountUsage: js.UndefOr[AccountUsage] = js.undefined
    ): GetAccountSettingsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountLimit" -> AccountLimit.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AccountUsage" -> AccountUsage.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAccountSettingsResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "FunctionName" -> FunctionName.asInstanceOf[js.Any],
        "Name"         -> Name.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAliasRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "UUID" -> UUID.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetEventSourceMappingRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "FunctionName" -> FunctionName.asInstanceOf[js.Any],
        "Qualifier" -> Qualifier.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetFunctionConfigurationRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "FunctionName" -> FunctionName.asInstanceOf[js.Any],
        "Qualifier" -> Qualifier.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetFunctionRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Code" -> Code.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Concurrency" -> Concurrency.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Configuration" -> Configuration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetFunctionResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "LayerName"     -> LayerName.asInstanceOf[js.Any],
        "VersionNumber" -> VersionNumber.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

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
        RevisionId: js.UndefOr[String] = js.undefined
    ): GetLayerVersionPolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Policy" -> Policy.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RevisionId" -> RevisionId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLayerVersionPolicyResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "LayerName"     -> LayerName.asInstanceOf[js.Any],
        "VersionNumber" -> VersionNumber.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLayerVersionRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "CompatibleRuntimes" -> CompatibleRuntimes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Content" -> Content.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreatedDate" -> CreatedDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LayerArn" -> LayerArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LayerVersionArn" -> LayerVersionArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LicenseInfo" -> LicenseInfo.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Version" -> Version.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLayerVersionResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "FunctionName" -> FunctionName.asInstanceOf[js.Any],
        "Qualifier" -> Qualifier.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        RevisionId: js.UndefOr[String] = js.undefined
    ): GetPolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Policy" -> Policy.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RevisionId" -> RevisionId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPolicyResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "FunctionName" -> FunctionName.asInstanceOf[js.Any],
        "ClientContext" -> ClientContext.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InvocationType" -> InvocationType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LogType" -> LogType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Payload" -> Payload.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Qualifier" -> Qualifier.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InvocationRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "ExecutedVersion" -> ExecutedVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FunctionError" -> FunctionError.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LogResult" -> LogResult.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Payload" -> Payload.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StatusCode" -> StatusCode.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InvocationResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "FunctionName" -> FunctionName.asInstanceOf[js.Any],
        "InvokeArgs"   -> InvokeArgs.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InvokeAsyncRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InvokeAsyncResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CodeSize" -> CodeSize.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Layer]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "S3Bucket" -> S3Bucket.map { x =>
          x.asInstanceOf[js.Any]
        },
        "S3Key" -> S3Key.map { x =>
          x.asInstanceOf[js.Any]
        },
        "S3ObjectVersion" -> S3ObjectVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ZipFile" -> ZipFile.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LayerVersionContentInput]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "CodeSha256" -> CodeSha256.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CodeSize" -> CodeSize.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Location" -> Location.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LayerVersionContentOutput]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "CompatibleRuntimes" -> CompatibleRuntimes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreatedDate" -> CreatedDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LayerVersionArn" -> LayerVersionArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LicenseInfo" -> LicenseInfo.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Version" -> Version.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LayerVersionsListItem]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "LatestMatchingVersion" -> LatestMatchingVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LayerArn" -> LayerArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LayerName" -> LayerName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LayersListItem]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "FunctionName" -> FunctionName.asInstanceOf[js.Any],
        "FunctionVersion" -> FunctionVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxItems" -> MaxItems.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAliasesRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Aliases" -> Aliases.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextMarker" -> NextMarker.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        MaxItems: js.UndefOr[MaxListItems] = js.undefined
    ): ListEventSourceMappingsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EventSourceArn" -> EventSourceArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FunctionName" -> FunctionName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxItems" -> MaxItems.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListEventSourceMappingsRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "EventSourceMappings" -> EventSourceMappings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextMarker" -> NextMarker.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListEventSourceMappingsResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "FunctionVersion" -> FunctionVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MasterRegion" -> MasterRegion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxItems" -> MaxItems.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListFunctionsRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Functions" -> Functions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextMarker" -> NextMarker.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListFunctionsResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "LayerName" -> LayerName.asInstanceOf[js.Any],
        "CompatibleRuntime" -> CompatibleRuntime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxItems" -> MaxItems.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListLayerVersionsRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "LayerVersions" -> LayerVersions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextMarker" -> NextMarker.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        MaxItems: js.UndefOr[MaxLayerListItems] = js.undefined
    ): ListLayersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CompatibleRuntime" -> CompatibleRuntime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxItems" -> MaxItems.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListLayersRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Layers" -> Layers.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextMarker" -> NextMarker.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListLayersResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Resource" -> Resource.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "FunctionName" -> FunctionName.asInstanceOf[js.Any],
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxItems" -> MaxItems.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
        Versions: js.UndefOr[FunctionList] = js.undefined
    ): ListVersionsByFunctionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextMarker" -> NextMarker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Versions" -> Versions.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

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
      val _fields = IndexedSeq[(String, js.Any)](
        "Content"   -> Content.asInstanceOf[js.Any],
        "LayerName" -> LayerName.asInstanceOf[js.Any],
        "CompatibleRuntimes" -> CompatibleRuntimes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LicenseInfo" -> LicenseInfo.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PublishLayerVersionRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "CompatibleRuntimes" -> CompatibleRuntimes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Content" -> Content.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreatedDate" -> CreatedDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LayerArn" -> LayerArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LayerVersionArn" -> LayerVersionArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LicenseInfo" -> LicenseInfo.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Version" -> Version.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PublishLayerVersionResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "FunctionName" -> FunctionName.asInstanceOf[js.Any],
        "CodeSha256" -> CodeSha256.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RevisionId" -> RevisionId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PublishVersionRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "FunctionName"                 -> FunctionName.asInstanceOf[js.Any],
        "ReservedConcurrentExecutions" -> ReservedConcurrentExecutions.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutFunctionConcurrencyRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "LayerName"     -> LayerName.asInstanceOf[js.Any],
        "StatementId"   -> StatementId.asInstanceOf[js.Any],
        "VersionNumber" -> VersionNumber.asInstanceOf[js.Any],
        "RevisionId" -> RevisionId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveLayerVersionPermissionRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "FunctionName" -> FunctionName.asInstanceOf[js.Any],
        "StatementId"  -> StatementId.asInstanceOf[js.Any],
        "Qualifier" -> Qualifier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RevisionId" -> RevisionId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemovePermissionRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Resource" -> Resource.asInstanceOf[js.Any],
        "Tags"     -> Tags.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagResourceRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Mode" -> Mode.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TracingConfig]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Mode" -> Mode.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TracingConfigResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Resource" -> Resource.asInstanceOf[js.Any],
        "TagKeys"  -> TagKeys.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagResourceRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "FunctionName" -> FunctionName.asInstanceOf[js.Any],
        "Name"         -> Name.asInstanceOf[js.Any],
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FunctionVersion" -> FunctionVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RevisionId" -> RevisionId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RoutingConfig" -> RoutingConfig.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAliasRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "UUID" -> UUID.asInstanceOf[js.Any],
        "BatchSize" -> BatchSize.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Enabled" -> Enabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FunctionName" -> FunctionName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateEventSourceMappingRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "FunctionName" -> FunctionName.asInstanceOf[js.Any],
        "DryRun" -> DryRun.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Publish" -> Publish.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RevisionId" -> RevisionId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "S3Bucket" -> S3Bucket.map { x =>
          x.asInstanceOf[js.Any]
        },
        "S3Key" -> S3Key.map { x =>
          x.asInstanceOf[js.Any]
        },
        "S3ObjectVersion" -> S3ObjectVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ZipFile" -> ZipFile.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateFunctionCodeRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "FunctionName" -> FunctionName.asInstanceOf[js.Any],
        "DeadLetterConfig" -> DeadLetterConfig.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Environment" -> Environment.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Handler" -> Handler.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KMSKeyArn" -> KMSKeyArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Layers" -> Layers.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MemorySize" -> MemorySize.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RevisionId" -> RevisionId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Role" -> Role.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Runtime" -> Runtime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Timeout" -> Timeout.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TracingConfig" -> TracingConfig.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VpcConfig" -> VpcConfig.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateFunctionConfigurationRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "SecurityGroupIds" -> SecurityGroupIds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SubnetIds" -> SubnetIds.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VpcConfig]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "SecurityGroupIds" -> SecurityGroupIds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SubnetIds" -> SubnetIds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VpcId" -> VpcId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VpcConfigResponse]
    }
  }
}
