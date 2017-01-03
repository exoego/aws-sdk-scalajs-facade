package facade.amazonaws.services

import scalajs._
import facade.amazonaws._

package object lambda {
  type Action = String
  type Alias = String
  type AliasList = js.Array[AliasConfiguration]
  type Arn = String
  type BatchSize = Integer
  type Blob = js.Array[Byte]
  type BlobStream = js.Array[Byte]
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
  type Handler = String
  type HttpStatus = Integer
  type InvocationType = String
  type KMSKeyArn = String
  type LogType = String
  type MaxListItems = Integer
  type MemorySize = Integer
  type Principal = String
  type Qualifier = String
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
  type ThrottleReason = String
  type Timeout = Integer
  type Timestamp = String
  type Version = String
  type VpcId = String
}

package lambda {
  @js.native
  trait Lambda extends js.Object {
    def addPermission(params: AddPermissionRequest, callback: Callback[AddPermissionResponse]): Unit = js.native
    def addPermission(params: AddPermissionRequest): Request[AddPermissionResponse] = js.native
    def createAlias(params: CreateAliasRequest, callback: Callback[AliasConfiguration]): Unit = js.native
    def createAlias(params: CreateAliasRequest): Request[AliasConfiguration] = js.native
    def createEventSourceMapping(params: CreateEventSourceMappingRequest, callback: Callback[EventSourceMappingConfiguration]): Unit = js.native
    def createEventSourceMapping(params: CreateEventSourceMappingRequest): Request[EventSourceMappingConfiguration] = js.native
    def createFunction(params: CreateFunctionRequest, callback: Callback[FunctionConfiguration]): Unit = js.native
    def createFunction(params: CreateFunctionRequest): Request[FunctionConfiguration] = js.native
    def deleteAlias(params: DeleteAliasRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteAlias(params: DeleteAliasRequest): Request[js.Object] = js.native
    def deleteEventSourceMapping(params: DeleteEventSourceMappingRequest, callback: Callback[EventSourceMappingConfiguration]): Unit = js.native
    def deleteEventSourceMapping(params: DeleteEventSourceMappingRequest): Request[EventSourceMappingConfiguration] = js.native
    def deleteFunction(params: DeleteFunctionRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteFunction(params: DeleteFunctionRequest): Request[js.Object] = js.native
    def getAccountSettings(params: GetAccountSettingsRequest, callback: Callback[GetAccountSettingsResponse]): Unit = js.native
    def getAccountSettings(params: GetAccountSettingsRequest): Request[GetAccountSettingsResponse] = js.native
    def getAlias(params: GetAliasRequest, callback: Callback[AliasConfiguration]): Unit = js.native
    def getAlias(params: GetAliasRequest): Request[AliasConfiguration] = js.native
    def getEventSourceMapping(params: GetEventSourceMappingRequest, callback: Callback[EventSourceMappingConfiguration]): Unit = js.native
    def getEventSourceMapping(params: GetEventSourceMappingRequest): Request[EventSourceMappingConfiguration] = js.native
    def getFunction(params: GetFunctionRequest, callback: Callback[GetFunctionResponse]): Unit = js.native
    def getFunction(params: GetFunctionRequest): Request[GetFunctionResponse] = js.native
    def getFunctionConfiguration(params: GetFunctionConfigurationRequest, callback: Callback[FunctionConfiguration]): Unit = js.native
    def getFunctionConfiguration(params: GetFunctionConfigurationRequest): Request[FunctionConfiguration] = js.native
    def getPolicy(params: GetPolicyRequest, callback: Callback[GetPolicyResponse]): Unit = js.native
    def getPolicy(params: GetPolicyRequest): Request[GetPolicyResponse] = js.native
    def invoke(params: InvocationRequest, callback: Callback[InvocationResponse]): Unit = js.native
    def invoke(params: InvocationRequest): Request[InvocationResponse] = js.native
    def invokeAsync(params: InvokeAsyncRequest, callback: Callback[InvokeAsyncResponse]): Unit = js.native
    def invokeAsync(params: InvokeAsyncRequest): Request[InvokeAsyncResponse] = js.native
    def listAliases(params: ListAliasesRequest, callback: Callback[ListAliasesResponse]): Unit = js.native
    def listAliases(params: ListAliasesRequest): Request[ListAliasesResponse] = js.native
    def listEventSourceMappings(params: ListEventSourceMappingsRequest, callback: Callback[ListEventSourceMappingsResponse]): Unit = js.native
    def listEventSourceMappings(params: ListEventSourceMappingsRequest): Request[ListEventSourceMappingsResponse] = js.native
    def listFunctions(params: ListFunctionsRequest, callback: Callback[ListFunctionsResponse]): Unit = js.native
    def listFunctions(params: ListFunctionsRequest): Request[ListFunctionsResponse] = js.native
    def listVersionsByFunction(params: ListVersionsByFunctionRequest, callback: Callback[ListVersionsByFunctionResponse]): Unit = js.native
    def listVersionsByFunction(params: ListVersionsByFunctionRequest): Request[ListVersionsByFunctionResponse] = js.native
    def publishVersion(params: PublishVersionRequest, callback: Callback[FunctionConfiguration]): Unit = js.native
    def publishVersion(params: PublishVersionRequest): Request[FunctionConfiguration] = js.native
    def removePermission(params: RemovePermissionRequest, callback: Callback[js.Object]): Unit = js.native
    def removePermission(params: RemovePermissionRequest): Request[js.Object] = js.native
    def updateAlias(params: UpdateAliasRequest, callback: Callback[AliasConfiguration]): Unit = js.native
    def updateAlias(params: UpdateAliasRequest): Request[AliasConfiguration] = js.native
    def updateEventSourceMapping(params: UpdateEventSourceMappingRequest, callback: Callback[EventSourceMappingConfiguration]): Unit = js.native
    def updateEventSourceMapping(params: UpdateEventSourceMappingRequest): Request[EventSourceMappingConfiguration] = js.native
    def updateFunctionCode(params: UpdateFunctionCodeRequest, callback: Callback[FunctionConfiguration]): Unit = js.native
    def updateFunctionCode(params: UpdateFunctionCodeRequest): Request[FunctionConfiguration] = js.native
    def updateFunctionConfiguration(params: UpdateFunctionConfigurationRequest, callback: Callback[FunctionConfiguration]): Unit = js.native
    def updateFunctionConfiguration(params: UpdateFunctionConfigurationRequest): Request[FunctionConfiguration] = js.native
  }

  /**
   * <p>Provides limits of code size and concurrency associated with the current account and region.</p>
   */
  @js.native
  trait AccountLimit extends js.Object {
    var TotalCodeSize: Long
    var CodeSizeUnzipped: Long
    var CodeSizeZipped: Long
    var ConcurrentExecutions: Integer
  }

  object AccountLimit {
    def apply(
      TotalCodeSize: js.UndefOr[Long] = js.undefined,
      CodeSizeUnzipped: js.UndefOr[Long] = js.undefined,
      CodeSizeZipped: js.UndefOr[Long] = js.undefined,
      ConcurrentExecutions: js.UndefOr[Integer] = js.undefined
    ): AccountLimit = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TotalCodeSize" -> TotalCodeSize.map { x => x: js.Any }),
        ("CodeSizeUnzipped" -> CodeSizeUnzipped.map { x => x: js.Any }),
        ("CodeSizeZipped" -> CodeSizeZipped.map { x => x: js.Any }),
        ("ConcurrentExecutions" -> ConcurrentExecutions.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AccountLimit]
    }
  }

  /**
   * <p>Provides code size usage and function count associated with the current account and region.</p>
   */
  @js.native
  trait AccountUsage extends js.Object {
    var TotalCodeSize: Long
    var FunctionCount: Long
  }

  object AccountUsage {
    def apply(
      TotalCodeSize: js.UndefOr[Long] = js.undefined,
      FunctionCount: js.UndefOr[Long] = js.undefined
    ): AccountUsage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TotalCodeSize" -> TotalCodeSize.map { x => x: js.Any }),
        ("FunctionCount" -> FunctionCount.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AccountUsage]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait AddPermissionRequest extends js.Object {
    var EventSourceToken: EventSourceToken
    var Principal: Principal
    var Qualifier: Qualifier
    var FunctionName: FunctionName
    var StatementId: StatementId
    var SourceAccount: SourceOwner
    var SourceArn: Arn
    var Action: Action
  }

  object AddPermissionRequest {
    def apply(
      EventSourceToken: js.UndefOr[EventSourceToken] = js.undefined,
      Principal: js.UndefOr[Principal] = js.undefined,
      Qualifier: js.UndefOr[Qualifier] = js.undefined,
      FunctionName: js.UndefOr[FunctionName] = js.undefined,
      StatementId: js.UndefOr[StatementId] = js.undefined,
      SourceAccount: js.UndefOr[SourceOwner] = js.undefined,
      SourceArn: js.UndefOr[Arn] = js.undefined,
      Action: js.UndefOr[Action] = js.undefined
    ): AddPermissionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("EventSourceToken" -> EventSourceToken.map { x => x: js.Any }),
        ("Principal" -> Principal.map { x => x: js.Any }),
        ("Qualifier" -> Qualifier.map { x => x: js.Any }),
        ("FunctionName" -> FunctionName.map { x => x: js.Any }),
        ("StatementId" -> StatementId.map { x => x: js.Any }),
        ("SourceAccount" -> SourceAccount.map { x => x: js.Any }),
        ("SourceArn" -> SourceArn.map { x => x: js.Any }),
        ("Action" -> Action.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddPermissionRequest]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait AddPermissionResponse extends js.Object {
    var Statement: String
  }

  object AddPermissionResponse {
    def apply(
      Statement: js.UndefOr[String] = js.undefined
    ): AddPermissionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Statement" -> Statement.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddPermissionResponse]
    }
  }

  /**
   * <p>Provides configuration information about a Lambda function version alias.</p>
   */
  @js.native
  trait AliasConfiguration extends js.Object {
    var AliasArn: FunctionArn
    var Name: Alias
    var FunctionVersion: Version
    var Description: Description
  }

  object AliasConfiguration {
    def apply(
      AliasArn: js.UndefOr[FunctionArn] = js.undefined,
      Name: js.UndefOr[Alias] = js.undefined,
      FunctionVersion: js.UndefOr[Version] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined
    ): AliasConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AliasArn" -> AliasArn.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("FunctionVersion" -> FunctionVersion.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AliasConfiguration]
    }
  }

  /**
   * <p>You have exceeded your maximum total code size per account. <a href="http://docs.aws.amazon.com/lambda/latest/dg/limits.html">Limits</a> </p>
   */
  @js.native
  trait CodeStorageExceededExceptionException extends js.Object {
    var Type: String
    var message: String
  }

  @js.native
  trait CreateAliasRequest extends js.Object {
    var FunctionName: FunctionName
    var Name: Alias
    var FunctionVersion: Version
    var Description: Description
  }

  object CreateAliasRequest {
    def apply(
      FunctionName: js.UndefOr[FunctionName] = js.undefined,
      Name: js.UndefOr[Alias] = js.undefined,
      FunctionVersion: js.UndefOr[Version] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined
    ): CreateAliasRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("FunctionName" -> FunctionName.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("FunctionVersion" -> FunctionVersion.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAliasRequest]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait CreateEventSourceMappingRequest extends js.Object {
    var StartingPositionTimestamp: Date
    var Enabled: Enabled
    var FunctionName: FunctionName
    var StartingPosition: EventSourcePosition
    var EventSourceArn: Arn
    var BatchSize: BatchSize
  }

  object CreateEventSourceMappingRequest {
    def apply(
      StartingPositionTimestamp: js.UndefOr[Date] = js.undefined,
      Enabled: js.UndefOr[Enabled] = js.undefined,
      FunctionName: js.UndefOr[FunctionName] = js.undefined,
      StartingPosition: js.UndefOr[EventSourcePosition] = js.undefined,
      EventSourceArn: js.UndefOr[Arn] = js.undefined,
      BatchSize: js.UndefOr[BatchSize] = js.undefined
    ): CreateEventSourceMappingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StartingPositionTimestamp" -> StartingPositionTimestamp.map { x => x: js.Any }),
        ("Enabled" -> Enabled.map { x => x: js.Any }),
        ("FunctionName" -> FunctionName.map { x => x: js.Any }),
        ("StartingPosition" -> StartingPosition.map { x => x: js.Any }),
        ("EventSourceArn" -> EventSourceArn.map { x => x: js.Any }),
        ("BatchSize" -> BatchSize.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateEventSourceMappingRequest]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait CreateFunctionRequest extends js.Object {
    var Environment: Environment
    var DeadLetterConfig: DeadLetterConfig
    var Role: RoleArn
    var Handler: Handler
    var Code: FunctionCode
    var FunctionName: FunctionName
    var Description: Description
    var MemorySize: MemorySize
    var VpcConfig: VpcConfig
    var Runtime: Runtime
    var KMSKeyArn: KMSKeyArn
    var Publish: Boolean
    var Timeout: Timeout
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
      VpcConfig: js.UndefOr[VpcConfig] = js.undefined,
      Runtime: js.UndefOr[Runtime] = js.undefined,
      KMSKeyArn: js.UndefOr[KMSKeyArn] = js.undefined,
      Publish: js.UndefOr[Boolean] = js.undefined,
      Timeout: js.UndefOr[Timeout] = js.undefined
    ): CreateFunctionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Environment" -> Environment.map { x => x: js.Any }),
        ("DeadLetterConfig" -> DeadLetterConfig.map { x => x: js.Any }),
        ("Role" -> Role.map { x => x: js.Any }),
        ("Handler" -> Handler.map { x => x: js.Any }),
        ("Code" -> Code.map { x => x: js.Any }),
        ("FunctionName" -> FunctionName.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("MemorySize" -> MemorySize.map { x => x: js.Any }),
        ("VpcConfig" -> VpcConfig.map { x => x: js.Any }),
        ("Runtime" -> Runtime.map { x => x: js.Any }),
        ("KMSKeyArn" -> KMSKeyArn.map { x => x: js.Any }),
        ("Publish" -> Publish.map { x => x: js.Any }),
        ("Timeout" -> Timeout.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateFunctionRequest]
    }
  }

  /**
   * <p>The parent object that contains the target ARN (Amazon Resource Name) of an Amazon SQS queue or Amazon SNS topic.</p>
   */
  @js.native
  trait DeadLetterConfig extends js.Object {
    var TargetArn: ResourceArn
  }

  object DeadLetterConfig {
    def apply(
      TargetArn: js.UndefOr[ResourceArn] = js.undefined
    ): DeadLetterConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TargetArn" -> TargetArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
      FunctionName: js.UndefOr[FunctionName] = js.undefined,
      Name: js.UndefOr[Alias] = js.undefined
    ): DeleteAliasRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("FunctionName" -> FunctionName.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAliasRequest]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait DeleteEventSourceMappingRequest extends js.Object {
    var UUID: String
  }

  object DeleteEventSourceMappingRequest {
    def apply(
      UUID: js.UndefOr[String] = js.undefined
    ): DeleteEventSourceMappingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("UUID" -> UUID.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteEventSourceMappingRequest]
    }
  }

  @js.native
  trait DeleteFunctionRequest extends js.Object {
    var FunctionName: FunctionName
    var Qualifier: Qualifier
  }

  object DeleteFunctionRequest {
    def apply(
      FunctionName: js.UndefOr[FunctionName] = js.undefined,
      Qualifier: js.UndefOr[Qualifier] = js.undefined
    ): DeleteFunctionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("FunctionName" -> FunctionName.map { x => x: js.Any }),
        ("Qualifier" -> Qualifier.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteFunctionRequest]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait EC2AccessDeniedExceptionException extends js.Object {
    var Type: String
    var Message: String
  }

  /**
   * <p>AWS Lambda was throttled by Amazon EC2 during Lambda function initialization using the execution role provided for the Lambda function.</p>
   */
  @js.native
  trait EC2ThrottledExceptionException extends js.Object {
    var Type: String
    var Message: String
  }

  /**
   * <p>AWS Lambda received an unexpected EC2 client exception while setting up for the Lambda function.</p>
   */
  @js.native
  trait EC2UnexpectedExceptionException extends js.Object {
    var Type: String
    var Message: String
    var EC2ErrorCode: String
  }

  /**
   * <p>AWS Lambda was not able to create an Elastic Network Interface (ENI) in the VPC, specified as part of Lambda function configuration, because the limit for network interfaces has been reached.</p>
   */
  @js.native
  trait ENILimitReachedExceptionException extends js.Object {
    var Type: String
    var Message: String
  }

  /**
   * <p>The parent object that contains your environment's configuration settings.</p>
   */
  @js.native
  trait Environment extends js.Object {
    var Variables: EnvironmentVariables
  }

  object Environment {
    def apply(
      Variables: js.UndefOr[EnvironmentVariables] = js.undefined
    ): Environment = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Variables" -> Variables.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Environment]
    }
  }

  /**
   * <p>The parent object that contains error information associated with your configuration settings.</p>
   */
  @js.native
  trait EnvironmentError extends js.Object {
    var ErrorCode: String
    var Message: SensitiveString
  }

  object EnvironmentError {
    def apply(
      ErrorCode: js.UndefOr[String] = js.undefined,
      Message: js.UndefOr[SensitiveString] = js.undefined
    ): EnvironmentError = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ErrorCode" -> ErrorCode.map { x => x: js.Any }),
        ("Message" -> Message.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnvironmentError]
    }
  }

  /**
   * <p>The parent object returned that contains your environment's configuration settings or any error information associated with your configuration settings.</p>
   */
  @js.native
  trait EnvironmentResponse extends js.Object {
    var Variables: EnvironmentVariables
    var Error: EnvironmentError
  }

  object EnvironmentResponse {
    def apply(
      Variables: js.UndefOr[EnvironmentVariables] = js.undefined,
      Error: js.UndefOr[EnvironmentError] = js.undefined
    ): EnvironmentResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Variables" -> Variables.map { x => x: js.Any }),
        ("Error" -> Error.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnvironmentResponse]
    }
  }

  /**
   * <p>Describes mapping between an Amazon Kinesis stream and a Lambda function.</p>
   */
  @js.native
  trait EventSourceMappingConfiguration extends js.Object {
    var LastProcessingResult: String
    var UUID: String
    var FunctionArn: FunctionArn
    var LastModified: Date
    var EventSourceArn: Arn
    var StateTransitionReason: String
    var State: String
    var BatchSize: BatchSize
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
      BatchSize: js.UndefOr[BatchSize] = js.undefined
    ): EventSourceMappingConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LastProcessingResult" -> LastProcessingResult.map { x => x: js.Any }),
        ("UUID" -> UUID.map { x => x: js.Any }),
        ("FunctionArn" -> FunctionArn.map { x => x: js.Any }),
        ("LastModified" -> LastModified.map { x => x: js.Any }),
        ("EventSourceArn" -> EventSourceArn.map { x => x: js.Any }),
        ("StateTransitionReason" -> StateTransitionReason.map { x => x: js.Any }),
        ("State" -> State.map { x => x: js.Any }),
        ("BatchSize" -> BatchSize.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventSourceMappingConfiguration]
    }
  }


  object EventSourcePositionEnum {
    val `TRIM_HORIZON` = "TRIM_HORIZON"
    val LATEST = "LATEST"
    val `AT_TIMESTAMP` = "AT_TIMESTAMP"

    val values = IndexedSeq(`TRIM_HORIZON`, LATEST, `AT_TIMESTAMP`)
  }

  /**
   * <p>The code for the Lambda function.</p>
   */
  @js.native
  trait FunctionCode extends js.Object {
    var ZipFile: Blob
    var S3Bucket: S3Bucket
    var S3Key: S3Key
    var S3ObjectVersion: S3ObjectVersion
  }

  object FunctionCode {
    def apply(
      ZipFile: js.UndefOr[Blob] = js.undefined,
      S3Bucket: js.UndefOr[S3Bucket] = js.undefined,
      S3Key: js.UndefOr[S3Key] = js.undefined,
      S3ObjectVersion: js.UndefOr[S3ObjectVersion] = js.undefined
    ): FunctionCode = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ZipFile" -> ZipFile.map { x => x: js.Any }),
        ("S3Bucket" -> S3Bucket.map { x => x: js.Any }),
        ("S3Key" -> S3Key.map { x => x: js.Any }),
        ("S3ObjectVersion" -> S3ObjectVersion.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FunctionCode]
    }
  }

  /**
   * <p>The object for the Lambda function location.</p>
   */
  @js.native
  trait FunctionCodeLocation extends js.Object {
    var RepositoryType: String
    var Location: String
  }

  object FunctionCodeLocation {
    def apply(
      RepositoryType: js.UndefOr[String] = js.undefined,
      Location: js.UndefOr[String] = js.undefined
    ): FunctionCodeLocation = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("RepositoryType" -> RepositoryType.map { x => x: js.Any }),
        ("Location" -> Location.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FunctionCodeLocation]
    }
  }

  /**
   * <p>A complex type that describes function metadata.</p>
   */
  @js.native
  trait FunctionConfiguration extends js.Object {
    var Environment: EnvironmentResponse
    var DeadLetterConfig: DeadLetterConfig
    var Role: RoleArn
    var Handler: Handler
    var FunctionArn: FunctionArn
    var FunctionName: FunctionName
    var Version: Version
    var Description: Description
    var LastModified: Timestamp
    var MemorySize: MemorySize
    var CodeSha256: String
    var VpcConfig: VpcConfigResponse
    var Runtime: Runtime
    var KMSKeyArn: KMSKeyArn
    var CodeSize: Long
    var Timeout: Timeout
  }

  object FunctionConfiguration {
    def apply(
      Environment: js.UndefOr[EnvironmentResponse] = js.undefined,
      DeadLetterConfig: js.UndefOr[DeadLetterConfig] = js.undefined,
      Role: js.UndefOr[RoleArn] = js.undefined,
      Handler: js.UndefOr[Handler] = js.undefined,
      FunctionArn: js.UndefOr[FunctionArn] = js.undefined,
      FunctionName: js.UndefOr[FunctionName] = js.undefined,
      Version: js.UndefOr[Version] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined,
      LastModified: js.UndefOr[Timestamp] = js.undefined,
      MemorySize: js.UndefOr[MemorySize] = js.undefined,
      CodeSha256: js.UndefOr[String] = js.undefined,
      VpcConfig: js.UndefOr[VpcConfigResponse] = js.undefined,
      Runtime: js.UndefOr[Runtime] = js.undefined,
      KMSKeyArn: js.UndefOr[KMSKeyArn] = js.undefined,
      CodeSize: js.UndefOr[Long] = js.undefined,
      Timeout: js.UndefOr[Timeout] = js.undefined
    ): FunctionConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Environment" -> Environment.map { x => x: js.Any }),
        ("DeadLetterConfig" -> DeadLetterConfig.map { x => x: js.Any }),
        ("Role" -> Role.map { x => x: js.Any }),
        ("Handler" -> Handler.map { x => x: js.Any }),
        ("FunctionArn" -> FunctionArn.map { x => x: js.Any }),
        ("FunctionName" -> FunctionName.map { x => x: js.Any }),
        ("Version" -> Version.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("LastModified" -> LastModified.map { x => x: js.Any }),
        ("MemorySize" -> MemorySize.map { x => x: js.Any }),
        ("CodeSha256" -> CodeSha256.map { x => x: js.Any }),
        ("VpcConfig" -> VpcConfig.map { x => x: js.Any }),
        ("Runtime" -> Runtime.map { x => x: js.Any }),
        ("KMSKeyArn" -> KMSKeyArn.map { x => x: js.Any }),
        ("CodeSize" -> CodeSize.map { x => x: js.Any }),
        ("Timeout" -> Timeout.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FunctionConfiguration]
    }
  }

  @js.native
  trait GetAccountSettingsRequest extends js.Object {

  }

  object GetAccountSettingsRequest {
    def apply(

    ): GetAccountSettingsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAccountSettingsRequest]
    }
  }

  @js.native
  trait GetAccountSettingsResponse extends js.Object {
    var AccountLimit: AccountLimit
    var AccountUsage: AccountUsage
  }

  object GetAccountSettingsResponse {
    def apply(
      AccountLimit: js.UndefOr[AccountLimit] = js.undefined,
      AccountUsage: js.UndefOr[AccountUsage] = js.undefined
    ): GetAccountSettingsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AccountLimit" -> AccountLimit.map { x => x: js.Any }),
        ("AccountUsage" -> AccountUsage.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
      FunctionName: js.UndefOr[FunctionName] = js.undefined,
      Name: js.UndefOr[Alias] = js.undefined
    ): GetAliasRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("FunctionName" -> FunctionName.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAliasRequest]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait GetEventSourceMappingRequest extends js.Object {
    var UUID: String
  }

  object GetEventSourceMappingRequest {
    def apply(
      UUID: js.UndefOr[String] = js.undefined
    ): GetEventSourceMappingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("UUID" -> UUID.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetEventSourceMappingRequest]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait GetFunctionConfigurationRequest extends js.Object {
    var FunctionName: FunctionName
    var Qualifier: Qualifier
  }

  object GetFunctionConfigurationRequest {
    def apply(
      FunctionName: js.UndefOr[FunctionName] = js.undefined,
      Qualifier: js.UndefOr[Qualifier] = js.undefined
    ): GetFunctionConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("FunctionName" -> FunctionName.map { x => x: js.Any }),
        ("Qualifier" -> Qualifier.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetFunctionConfigurationRequest]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait GetFunctionRequest extends js.Object {
    var FunctionName: FunctionName
    var Qualifier: Qualifier
  }

  object GetFunctionRequest {
    def apply(
      FunctionName: js.UndefOr[FunctionName] = js.undefined,
      Qualifier: js.UndefOr[Qualifier] = js.undefined
    ): GetFunctionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("FunctionName" -> FunctionName.map { x => x: js.Any }),
        ("Qualifier" -> Qualifier.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetFunctionRequest]
    }
  }

  /**
   * <p>This response contains the object for the Lambda function location (see <a>FunctionCodeLocation</a>.</p>
   */
  @js.native
  trait GetFunctionResponse extends js.Object {
    var Configuration: FunctionConfiguration
    var Code: FunctionCodeLocation
  }

  object GetFunctionResponse {
    def apply(
      Configuration: js.UndefOr[FunctionConfiguration] = js.undefined,
      Code: js.UndefOr[FunctionCodeLocation] = js.undefined
    ): GetFunctionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Configuration" -> Configuration.map { x => x: js.Any }),
        ("Code" -> Code.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetFunctionResponse]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait GetPolicyRequest extends js.Object {
    var FunctionName: FunctionName
    var Qualifier: Qualifier
  }

  object GetPolicyRequest {
    def apply(
      FunctionName: js.UndefOr[FunctionName] = js.undefined,
      Qualifier: js.UndefOr[Qualifier] = js.undefined
    ): GetPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("FunctionName" -> FunctionName.map { x => x: js.Any }),
        ("Qualifier" -> Qualifier.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPolicyRequest]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait GetPolicyResponse extends js.Object {
    var Policy: String
  }

  object GetPolicyResponse {
    def apply(
      Policy: js.UndefOr[String] = js.undefined
    ): GetPolicyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Policy" -> Policy.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPolicyResponse]
    }
  }

  /**
   * <p>One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that AWS Lambda is unable to assume you will get this exception. </p>
   */
  @js.native
  trait InvalidParameterValueExceptionException extends js.Object {
    var Type: String
    var message: String
  }

  /**
   * <p>The request body could not be parsed as JSON.</p>
   */
  @js.native
  trait InvalidRequestContentExceptionException extends js.Object {
    var Type: String
    var message: String
  }

  /**
   * <p>The Security Group ID provided in the Lambda function VPC configuration is invalid.</p>
   */
  @js.native
  trait InvalidSecurityGroupIDExceptionException extends js.Object {
    var Type: String
    var Message: String
  }

  /**
   * <p>The Subnet ID provided in the Lambda function VPC configuration is invalid.</p>
   */
  @js.native
  trait InvalidSubnetIDExceptionException extends js.Object {
    var Type: String
    var Message: String
  }

  /**
   * <p>AWS Lambda could not unzip the function zip file.</p>
   */
  @js.native
  trait InvalidZipFileExceptionException extends js.Object {
    var Type: String
    var Message: String
  }

  /**
   * <p/>
   */
  @js.native
  trait InvocationRequest extends js.Object {
    var Qualifier: Qualifier
    var FunctionName: FunctionName
    var ClientContext: String
    var InvocationType: InvocationType
    var Payload: Blob
    var LogType: LogType
  }

  object InvocationRequest {
    def apply(
      Qualifier: js.UndefOr[Qualifier] = js.undefined,
      FunctionName: js.UndefOr[FunctionName] = js.undefined,
      ClientContext: js.UndefOr[String] = js.undefined,
      InvocationType: js.UndefOr[InvocationType] = js.undefined,
      Payload: js.UndefOr[Blob] = js.undefined,
      LogType: js.UndefOr[LogType] = js.undefined
    ): InvocationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Qualifier" -> Qualifier.map { x => x: js.Any }),
        ("FunctionName" -> FunctionName.map { x => x: js.Any }),
        ("ClientContext" -> ClientContext.map { x => x: js.Any }),
        ("InvocationType" -> InvocationType.map { x => x: js.Any }),
        ("Payload" -> Payload.map { x => x: js.Any }),
        ("LogType" -> LogType.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InvocationRequest]
    }
  }

  /**
   * <p>Upon success, returns an empty response. Otherwise, throws an exception.</p>
   */
  @js.native
  trait InvocationResponse extends js.Object {
    var StatusCode: Integer
    var FunctionError: String
    var LogResult: String
    var Payload: Blob
  }

  object InvocationResponse {
    def apply(
      StatusCode: js.UndefOr[Integer] = js.undefined,
      FunctionError: js.UndefOr[String] = js.undefined,
      LogResult: js.UndefOr[String] = js.undefined,
      Payload: js.UndefOr[Blob] = js.undefined
    ): InvocationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StatusCode" -> StatusCode.map { x => x: js.Any }),
        ("FunctionError" -> FunctionError.map { x => x: js.Any }),
        ("LogResult" -> LogResult.map { x => x: js.Any }),
        ("Payload" -> Payload.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InvocationResponse]
    }
  }


  object InvocationTypeEnum {
    val Event = "Event"
    val RequestResponse = "RequestResponse"
    val DryRun = "DryRun"

    val values = IndexedSeq(Event, RequestResponse, DryRun)
  }

  /**
   * <p/>
   */
  @deprecated
  @js.native
  trait InvokeAsyncRequest extends js.Object {
    var FunctionName: FunctionName
    var InvokeArgs: BlobStream
  }

  object InvokeAsyncRequest {
    def apply(
      FunctionName: js.UndefOr[FunctionName] = js.undefined,
      InvokeArgs: js.UndefOr[BlobStream] = js.undefined
    ): InvokeAsyncRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("FunctionName" -> FunctionName.map { x => x: js.Any }),
        ("InvokeArgs" -> InvokeArgs.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InvokeAsyncRequest]
    }
  }

  /**
   * <p>Upon success, it returns empty response. Otherwise, throws an exception.</p>
   */
  @deprecated
  @js.native
  trait InvokeAsyncResponse extends js.Object {
    var Status: HttpStatus
  }

  object InvokeAsyncResponse {
    def apply(
      Status: js.UndefOr[HttpStatus] = js.undefined
    ): InvokeAsyncResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InvokeAsyncResponse]
    }
  }

  /**
   * <p>Lambda was unable to decrypt the environment variables because KMS access was denied. Please check the Lambda function's KMS permissions.</p>
   */
  @js.native
  trait KMSAccessDeniedExceptionException extends js.Object {
    var Type: String
    var Message: String
  }

  /**
   * <p>Lambda was unable to decrypt the environment variables because the KMS key used is disabled. Please check the Lambda function's KMS key settings.</p>
   */
  @js.native
  trait KMSDisabledExceptionException extends js.Object {
    var Type: String
    var Message: String
  }

  /**
   * <p>Lambda was unable to decrypt the environment variables because the KMS key used is in an invalid state for Decrypt. Please check the function's KMS key settings.</p>
   */
  @js.native
  trait KMSInvalidStateExceptionException extends js.Object {
    var Type: String
    var Message: String
  }

  /**
   * <p>Lambda was unable to decrypt the environment variables because the KMS key was not found. Please check the function's KMS key settings. </p>
   */
  @js.native
  trait KMSNotFoundExceptionException extends js.Object {
    var Type: String
    var Message: String
  }

  @js.native
  trait ListAliasesRequest extends js.Object {
    var FunctionName: FunctionName
    var FunctionVersion: Version
    var Marker: String
    var MaxItems: MaxListItems
  }

  object ListAliasesRequest {
    def apply(
      FunctionName: js.UndefOr[FunctionName] = js.undefined,
      FunctionVersion: js.UndefOr[Version] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined,
      MaxItems: js.UndefOr[MaxListItems] = js.undefined
    ): ListAliasesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("FunctionName" -> FunctionName.map { x => x: js.Any }),
        ("FunctionVersion" -> FunctionVersion.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("MaxItems" -> MaxItems.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAliasesRequest]
    }
  }

  @js.native
  trait ListAliasesResponse extends js.Object {
    var NextMarker: String
    var Aliases: AliasList
  }

  object ListAliasesResponse {
    def apply(
      NextMarker: js.UndefOr[String] = js.undefined,
      Aliases: js.UndefOr[AliasList] = js.undefined
    ): ListAliasesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("NextMarker" -> NextMarker.map { x => x: js.Any }),
        ("Aliases" -> Aliases.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAliasesResponse]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait ListEventSourceMappingsRequest extends js.Object {
    var EventSourceArn: Arn
    var FunctionName: FunctionName
    var Marker: String
    var MaxItems: MaxListItems
  }

  object ListEventSourceMappingsRequest {
    def apply(
      EventSourceArn: js.UndefOr[Arn] = js.undefined,
      FunctionName: js.UndefOr[FunctionName] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined,
      MaxItems: js.UndefOr[MaxListItems] = js.undefined
    ): ListEventSourceMappingsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("EventSourceArn" -> EventSourceArn.map { x => x: js.Any }),
        ("FunctionName" -> FunctionName.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("MaxItems" -> MaxItems.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListEventSourceMappingsRequest]
    }
  }

  /**
   * <p>Contains a list of event sources (see <a>EventSourceMappingConfiguration</a>)</p>
   */
  @js.native
  trait ListEventSourceMappingsResponse extends js.Object {
    var NextMarker: String
    var EventSourceMappings: EventSourceMappingsList
  }

  object ListEventSourceMappingsResponse {
    def apply(
      NextMarker: js.UndefOr[String] = js.undefined,
      EventSourceMappings: js.UndefOr[EventSourceMappingsList] = js.undefined
    ): ListEventSourceMappingsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("NextMarker" -> NextMarker.map { x => x: js.Any }),
        ("EventSourceMappings" -> EventSourceMappings.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListEventSourceMappingsResponse]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait ListFunctionsRequest extends js.Object {
    var Marker: String
    var MaxItems: MaxListItems
  }

  object ListFunctionsRequest {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      MaxItems: js.UndefOr[MaxListItems] = js.undefined
    ): ListFunctionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("MaxItems" -> MaxItems.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListFunctionsRequest]
    }
  }

  /**
   * <p>Contains a list of AWS Lambda function configurations (see <a>FunctionConfiguration</a>.</p>
   */
  @js.native
  trait ListFunctionsResponse extends js.Object {
    var NextMarker: String
    var Functions: FunctionList
  }

  object ListFunctionsResponse {
    def apply(
      NextMarker: js.UndefOr[String] = js.undefined,
      Functions: js.UndefOr[FunctionList] = js.undefined
    ): ListFunctionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("NextMarker" -> NextMarker.map { x => x: js.Any }),
        ("Functions" -> Functions.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListFunctionsResponse]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait ListVersionsByFunctionRequest extends js.Object {
    var FunctionName: FunctionName
    var Marker: String
    var MaxItems: MaxListItems
  }

  object ListVersionsByFunctionRequest {
    def apply(
      FunctionName: js.UndefOr[FunctionName] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined,
      MaxItems: js.UndefOr[MaxListItems] = js.undefined
    ): ListVersionsByFunctionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("FunctionName" -> FunctionName.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("MaxItems" -> MaxItems.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListVersionsByFunctionRequest]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait ListVersionsByFunctionResponse extends js.Object {
    var NextMarker: String
    var Versions: FunctionList
  }

  object ListVersionsByFunctionResponse {
    def apply(
      NextMarker: js.UndefOr[String] = js.undefined,
      Versions: js.UndefOr[FunctionList] = js.undefined
    ): ListVersionsByFunctionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("NextMarker" -> NextMarker.map { x => x: js.Any }),
        ("Versions" -> Versions.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListVersionsByFunctionResponse]
    }
  }


  object LogTypeEnum {
    val None = "None"
    val Tail = "Tail"

    val values = IndexedSeq(None, Tail)
  }

  /**
   * <p>Lambda function access policy is limited to 20 KB.</p>
   */
  @js.native
  trait PolicyLengthExceededExceptionException extends js.Object {
    var Type: String
    var message: String
  }

  /**
   * <p/>
   */
  @js.native
  trait PublishVersionRequest extends js.Object {
    var FunctionName: FunctionName
    var CodeSha256: String
    var Description: Description
  }

  object PublishVersionRequest {
    def apply(
      FunctionName: js.UndefOr[FunctionName] = js.undefined,
      CodeSha256: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined
    ): PublishVersionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("FunctionName" -> FunctionName.map { x => x: js.Any }),
        ("CodeSha256" -> CodeSha256.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PublishVersionRequest]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait RemovePermissionRequest extends js.Object {
    var FunctionName: FunctionName
    var StatementId: StatementId
    var Qualifier: Qualifier
  }

  object RemovePermissionRequest {
    def apply(
      FunctionName: js.UndefOr[FunctionName] = js.undefined,
      StatementId: js.UndefOr[StatementId] = js.undefined,
      Qualifier: js.UndefOr[Qualifier] = js.undefined
    ): RemovePermissionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("FunctionName" -> FunctionName.map { x => x: js.Any }),
        ("StatementId" -> StatementId.map { x => x: js.Any }),
        ("Qualifier" -> Qualifier.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemovePermissionRequest]
    }
  }

  /**
   * <p>The request payload exceeded the <code>Invoke</code> request body JSON input limit. For more information, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/limits.html">Limits</a>. </p>
   */
  @js.native
  trait RequestTooLargeExceptionException extends js.Object {
    var Type: String
    var message: String
  }

  /**
   * <p>The resource already exists.</p>
   */
  @js.native
  trait ResourceConflictExceptionException extends js.Object {
    var Type: String
    var message: String
  }

  /**
   * <p>The resource (for example, a Lambda function or access policy statement) specified in the request does not exist.</p>
   */
  @js.native
  trait ResourceNotFoundExceptionException extends js.Object {
    var Type: String
    var Message: String
  }


  object RuntimeEnum {
    val nodejs = "nodejs"
    val `nodejs4.3` = "nodejs4.3"
    val java8 = "java8"
    val `python2.7` = "python2.7"
    val `dotnetcore1.0` = "dotnetcore1.0"
    val `nodejs4.3-edge` = "nodejs4.3-edge"

    val values = IndexedSeq(nodejs, `nodejs4.3`, java8, `python2.7`, `dotnetcore1.0`, `nodejs4.3-edge`)
  }

  /**
   * <p>The AWS Lambda service encountered an internal error.</p>
   */
  @js.native
  trait ServiceExceptionException extends js.Object {
    var Type: String
    var Message: String
  }

  /**
   * <p>AWS Lambda was not able to set up VPC access for the Lambda function because one or more configured subnets has no available IP addresses.</p>
   */
  @js.native
  trait SubnetIPAddressLimitReachedExceptionException extends js.Object {
    var Type: String
    var Message: String
  }


  object ThrottleReasonEnum {
    val ConcurrentInvocationLimitExceeded = "ConcurrentInvocationLimitExceeded"
    val FunctionInvocationRateLimitExceeded = "FunctionInvocationRateLimitExceeded"
    val CallerRateLimitExceeded = "CallerRateLimitExceeded"

    val values = IndexedSeq(ConcurrentInvocationLimitExceeded, FunctionInvocationRateLimitExceeded, CallerRateLimitExceeded)
  }

  /**
   * <p/>
   */
  @js.native
  trait TooManyRequestsExceptionException extends js.Object {
    var retryAfterSeconds: String
    var Type: String
    var message: String
    var Reason: ThrottleReason
  }

  /**
   * <p>The content type of the <code>Invoke</code> request body is not JSON.</p>
   */
  @js.native
  trait UnsupportedMediaTypeExceptionException extends js.Object {
    var Type: String
    var message: String
  }

  @js.native
  trait UpdateAliasRequest extends js.Object {
    var FunctionName: FunctionName
    var Name: Alias
    var FunctionVersion: Version
    var Description: Description
  }

  object UpdateAliasRequest {
    def apply(
      FunctionName: js.UndefOr[FunctionName] = js.undefined,
      Name: js.UndefOr[Alias] = js.undefined,
      FunctionVersion: js.UndefOr[Version] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined
    ): UpdateAliasRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("FunctionName" -> FunctionName.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("FunctionVersion" -> FunctionVersion.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAliasRequest]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait UpdateEventSourceMappingRequest extends js.Object {
    var UUID: String
    var FunctionName: FunctionName
    var Enabled: Enabled
    var BatchSize: BatchSize
  }

  object UpdateEventSourceMappingRequest {
    def apply(
      UUID: js.UndefOr[String] = js.undefined,
      FunctionName: js.UndefOr[FunctionName] = js.undefined,
      Enabled: js.UndefOr[Enabled] = js.undefined,
      BatchSize: js.UndefOr[BatchSize] = js.undefined
    ): UpdateEventSourceMappingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("UUID" -> UUID.map { x => x: js.Any }),
        ("FunctionName" -> FunctionName.map { x => x: js.Any }),
        ("Enabled" -> Enabled.map { x => x: js.Any }),
        ("BatchSize" -> BatchSize.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateEventSourceMappingRequest]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait UpdateFunctionCodeRequest extends js.Object {
    var S3Key: S3Key
    var ZipFile: Blob
    var S3Bucket: S3Bucket
    var FunctionName: FunctionName
    var S3ObjectVersion: S3ObjectVersion
    var Publish: Boolean
  }

  object UpdateFunctionCodeRequest {
    def apply(
      S3Key: js.UndefOr[S3Key] = js.undefined,
      ZipFile: js.UndefOr[Blob] = js.undefined,
      S3Bucket: js.UndefOr[S3Bucket] = js.undefined,
      FunctionName: js.UndefOr[FunctionName] = js.undefined,
      S3ObjectVersion: js.UndefOr[S3ObjectVersion] = js.undefined,
      Publish: js.UndefOr[Boolean] = js.undefined
    ): UpdateFunctionCodeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("S3Key" -> S3Key.map { x => x: js.Any }),
        ("ZipFile" -> ZipFile.map { x => x: js.Any }),
        ("S3Bucket" -> S3Bucket.map { x => x: js.Any }),
        ("FunctionName" -> FunctionName.map { x => x: js.Any }),
        ("S3ObjectVersion" -> S3ObjectVersion.map { x => x: js.Any }),
        ("Publish" -> Publish.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateFunctionCodeRequest]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait UpdateFunctionConfigurationRequest extends js.Object {
    var Environment: Environment
    var DeadLetterConfig: DeadLetterConfig
    var Role: RoleArn
    var Handler: Handler
    var FunctionName: FunctionName
    var Description: Description
    var MemorySize: MemorySize
    var VpcConfig: VpcConfig
    var Runtime: Runtime
    var KMSKeyArn: KMSKeyArn
    var Timeout: Timeout
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
      VpcConfig: js.UndefOr[VpcConfig] = js.undefined,
      Runtime: js.UndefOr[Runtime] = js.undefined,
      KMSKeyArn: js.UndefOr[KMSKeyArn] = js.undefined,
      Timeout: js.UndefOr[Timeout] = js.undefined
    ): UpdateFunctionConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Environment" -> Environment.map { x => x: js.Any }),
        ("DeadLetterConfig" -> DeadLetterConfig.map { x => x: js.Any }),
        ("Role" -> Role.map { x => x: js.Any }),
        ("Handler" -> Handler.map { x => x: js.Any }),
        ("FunctionName" -> FunctionName.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("MemorySize" -> MemorySize.map { x => x: js.Any }),
        ("VpcConfig" -> VpcConfig.map { x => x: js.Any }),
        ("Runtime" -> Runtime.map { x => x: js.Any }),
        ("KMSKeyArn" -> KMSKeyArn.map { x => x: js.Any }),
        ("Timeout" -> Timeout.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateFunctionConfigurationRequest]
    }
  }

  /**
   * <p>If your Lambda function accesses resources in a VPC, you provide this parameter identifying the list of security group IDs and subnet IDs. These must belong to the same VPC. You must provide at least one security group and one subnet ID.</p>
   */
  @js.native
  trait VpcConfig extends js.Object {
    var SubnetIds: SubnetIds
    var SecurityGroupIds: SecurityGroupIds
  }

  object VpcConfig {
    def apply(
      SubnetIds: js.UndefOr[SubnetIds] = js.undefined,
      SecurityGroupIds: js.UndefOr[SecurityGroupIds] = js.undefined
    ): VpcConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SubnetIds" -> SubnetIds.map { x => x: js.Any }),
        ("SecurityGroupIds" -> SecurityGroupIds.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VpcConfig]
    }
  }

  /**
   * <p>VPC configuration associated with your Lambda function.</p>
   */
  @js.native
  trait VpcConfigResponse extends js.Object {
    var SubnetIds: SubnetIds
    var SecurityGroupIds: SecurityGroupIds
    var VpcId: VpcId
  }

  object VpcConfigResponse {
    def apply(
      SubnetIds: js.UndefOr[SubnetIds] = js.undefined,
      SecurityGroupIds: js.UndefOr[SecurityGroupIds] = js.undefined,
      VpcId: js.UndefOr[VpcId] = js.undefined
    ): VpcConfigResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SubnetIds" -> SubnetIds.map { x => x: js.Any }),
        ("SecurityGroupIds" -> SecurityGroupIds.map { x => x: js.Any }),
        ("VpcId" -> VpcId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VpcConfigResponse]
    }
  }
}
