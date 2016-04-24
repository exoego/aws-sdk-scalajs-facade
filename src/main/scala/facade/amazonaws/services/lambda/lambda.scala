package facade.amazonaws.services

import scalajs._
import facade.amazonaws._

package object lambda {
  type Action = String
  type Arn = String
  type BatchSize = Integer
  type Blob = js.Array[Byte]
  type BlobStream = js.Array[Byte]
  type Date = js.Date
  type Description = String
  type Enabled = Boolean
  type EventSourceMappingsList = js.Array[EventSourceMappingConfiguration]
  type EventSourcePosition = String
  type FunctionArn = String
  type FunctionList = js.Array[FunctionConfiguration]
  type FunctionName = String
  type Handler = String
  type HttpStatus = Integer
  type InvocationType = String
  type LogType = String
  type MaxListItems = Integer
  type MemorySize = Integer
  type Principal = String
  type RoleArn = String
  type Runtime = String
  type SourceOwner = String
  type StatementId = String
  type Timeout = Integer
  type Timestamp = String
}

package lambda {
  @js.native
  trait Lambda extends js.Object {
    def addPermission(params: AddPermissionRequest, callback: Callback[AddPermissionResponse]): Unit = js.native
    def addPermission(params: AddPermissionRequest): Request[AddPermissionResponse] = js.native
    def createEventSourceMapping(params: CreateEventSourceMappingRequest, callback: Callback[EventSourceMappingConfiguration]): Unit = js.native
    def createEventSourceMapping(params: CreateEventSourceMappingRequest): Request[EventSourceMappingConfiguration] = js.native
    def createFunction(params: CreateFunctionRequest, callback: Callback[FunctionConfiguration]): Unit = js.native
    def createFunction(params: CreateFunctionRequest): Request[FunctionConfiguration] = js.native
    def deleteEventSourceMapping(params: DeleteEventSourceMappingRequest, callback: Callback[EventSourceMappingConfiguration]): Unit = js.native
    def deleteEventSourceMapping(params: DeleteEventSourceMappingRequest): Request[EventSourceMappingConfiguration] = js.native
    def deleteFunction(params: DeleteFunctionRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteFunction(params: DeleteFunctionRequest): Request[js.Object] = js.native
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
    def listEventSourceMappings(params: ListEventSourceMappingsRequest, callback: Callback[ListEventSourceMappingsResponse]): Unit = js.native
    def listEventSourceMappings(params: ListEventSourceMappingsRequest): Request[ListEventSourceMappingsResponse] = js.native
    def listFunctions(params: ListFunctionsRequest, callback: Callback[ListFunctionsResponse]): Unit = js.native
    def listFunctions(params: ListFunctionsRequest): Request[ListFunctionsResponse] = js.native
    def removePermission(params: RemovePermissionRequest, callback: Callback[js.Object]): Unit = js.native
    def removePermission(params: RemovePermissionRequest): Request[js.Object] = js.native
    def updateEventSourceMapping(params: UpdateEventSourceMappingRequest, callback: Callback[EventSourceMappingConfiguration]): Unit = js.native
    def updateEventSourceMapping(params: UpdateEventSourceMappingRequest): Request[EventSourceMappingConfiguration] = js.native
    def updateFunctionCode(params: UpdateFunctionCodeRequest, callback: Callback[FunctionConfiguration]): Unit = js.native
    def updateFunctionCode(params: UpdateFunctionCodeRequest): Request[FunctionConfiguration] = js.native
    def updateFunctionConfiguration(params: UpdateFunctionConfigurationRequest, callback: Callback[FunctionConfiguration]): Unit = js.native
    def updateFunctionConfiguration(params: UpdateFunctionConfigurationRequest): Request[FunctionConfiguration] = js.native
  }

  @js.native
  trait AddPermissionRequest extends js.Object {
    var Principal: Principal
    var FunctionName: FunctionName
    var StatementId: StatementId
    var SourceAccount: SourceOwner
    var SourceArn: Arn
    var Action: Action
  }

  object AddPermissionRequest {
    def apply(
      Principal: js.UndefOr[Principal] = js.undefined,
      FunctionName: js.UndefOr[FunctionName] = js.undefined,
      StatementId: js.UndefOr[StatementId] = js.undefined,
      SourceAccount: js.UndefOr[SourceOwner] = js.undefined,
      SourceArn: js.UndefOr[Arn] = js.undefined,
      Action: js.UndefOr[Action] = js.undefined
    ): AddPermissionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Principal" -> Principal.map { x => x: js.Any }),
        ("FunctionName" -> FunctionName.map { x => x: js.Any }),
        ("StatementId" -> StatementId.map { x => x: js.Any }),
        ("SourceAccount" -> SourceAccount.map { x => x: js.Any }),
        ("SourceArn" -> SourceArn.map { x => x: js.Any }),
        ("Action" -> Action.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddPermissionRequest]
    }
  }

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

  @js.native
  trait CreateEventSourceMappingRequest extends js.Object {
    var Enabled: Enabled
    var FunctionName: FunctionName
    var StartingPosition: EventSourcePosition
    var EventSourceArn: Arn
    var BatchSize: BatchSize
  }

  object CreateEventSourceMappingRequest {
    def apply(
      Enabled: js.UndefOr[Enabled] = js.undefined,
      FunctionName: js.UndefOr[FunctionName] = js.undefined,
      StartingPosition: js.UndefOr[EventSourcePosition] = js.undefined,
      EventSourceArn: js.UndefOr[Arn] = js.undefined,
      BatchSize: js.UndefOr[BatchSize] = js.undefined
    ): CreateEventSourceMappingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Enabled" -> Enabled.map { x => x: js.Any }),
        ("FunctionName" -> FunctionName.map { x => x: js.Any }),
        ("StartingPosition" -> StartingPosition.map { x => x: js.Any }),
        ("EventSourceArn" -> EventSourceArn.map { x => x: js.Any }),
        ("BatchSize" -> BatchSize.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateEventSourceMappingRequest]
    }
  }

  @js.native
  trait CreateFunctionRequest extends js.Object {
    var Role: RoleArn
    var Handler: Handler
    var Code: FunctionCode
    var FunctionName: FunctionName
    var Description: Description
    var MemorySize: MemorySize
    var Runtime: Runtime
    var Timeout: Timeout
  }

  object CreateFunctionRequest {
    def apply(
      Role: js.UndefOr[RoleArn] = js.undefined,
      Handler: js.UndefOr[Handler] = js.undefined,
      Code: js.UndefOr[FunctionCode] = js.undefined,
      FunctionName: js.UndefOr[FunctionName] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined,
      MemorySize: js.UndefOr[MemorySize] = js.undefined,
      Runtime: js.UndefOr[Runtime] = js.undefined,
      Timeout: js.UndefOr[Timeout] = js.undefined
    ): CreateFunctionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Role" -> Role.map { x => x: js.Any }),
        ("Handler" -> Handler.map { x => x: js.Any }),
        ("Code" -> Code.map { x => x: js.Any }),
        ("FunctionName" -> FunctionName.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("MemorySize" -> MemorySize.map { x => x: js.Any }),
        ("Runtime" -> Runtime.map { x => x: js.Any }),
        ("Timeout" -> Timeout.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateFunctionRequest]
    }
  }

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
  }

  object DeleteFunctionRequest {
    def apply(
      FunctionName: js.UndefOr[FunctionName] = js.undefined
    ): DeleteFunctionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("FunctionName" -> FunctionName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteFunctionRequest]
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

    val values = IndexedSeq(`TRIM_HORIZON`, LATEST)
  }

  /**
   * <p>The code for the Lambda function.</p>
   */
  @js.native
  trait FunctionCode extends js.Object {
    var ZipFile: Blob
  }

  object FunctionCode {
    def apply(
      ZipFile: js.UndefOr[Blob] = js.undefined
    ): FunctionCode = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ZipFile" -> ZipFile.map { x => x: js.Any })
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
    var Role: RoleArn
    var Handler: Handler
    var FunctionArn: FunctionArn
    var FunctionName: FunctionName
    var Description: Description
    var LastModified: Timestamp
    var MemorySize: MemorySize
    var Runtime: Runtime
    var CodeSize: Long
    var Timeout: Timeout
  }

  object FunctionConfiguration {
    def apply(
      Role: js.UndefOr[RoleArn] = js.undefined,
      Handler: js.UndefOr[Handler] = js.undefined,
      FunctionArn: js.UndefOr[FunctionArn] = js.undefined,
      FunctionName: js.UndefOr[FunctionName] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined,
      LastModified: js.UndefOr[Timestamp] = js.undefined,
      MemorySize: js.UndefOr[MemorySize] = js.undefined,
      Runtime: js.UndefOr[Runtime] = js.undefined,
      CodeSize: js.UndefOr[Long] = js.undefined,
      Timeout: js.UndefOr[Timeout] = js.undefined
    ): FunctionConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Role" -> Role.map { x => x: js.Any }),
        ("Handler" -> Handler.map { x => x: js.Any }),
        ("FunctionArn" -> FunctionArn.map { x => x: js.Any }),
        ("FunctionName" -> FunctionName.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("LastModified" -> LastModified.map { x => x: js.Any }),
        ("MemorySize" -> MemorySize.map { x => x: js.Any }),
        ("Runtime" -> Runtime.map { x => x: js.Any }),
        ("CodeSize" -> CodeSize.map { x => x: js.Any }),
        ("Timeout" -> Timeout.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FunctionConfiguration]
    }
  }

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

  @js.native
  trait GetFunctionConfigurationRequest extends js.Object {
    var FunctionName: FunctionName
  }

  object GetFunctionConfigurationRequest {
    def apply(
      FunctionName: js.UndefOr[FunctionName] = js.undefined
    ): GetFunctionConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("FunctionName" -> FunctionName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetFunctionConfigurationRequest]
    }
  }

  @js.native
  trait GetFunctionRequest extends js.Object {
    var FunctionName: FunctionName
  }

  object GetFunctionRequest {
    def apply(
      FunctionName: js.UndefOr[FunctionName] = js.undefined
    ): GetFunctionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("FunctionName" -> FunctionName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetFunctionRequest]
    }
  }

  /**
   * <p>This response contains the object for the Lambda function location (see <a>API_FunctionCodeLocation</a></p>
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

  @js.native
  trait GetPolicyRequest extends js.Object {
    var FunctionName: FunctionName
  }

  object GetPolicyRequest {
    def apply(
      FunctionName: js.UndefOr[FunctionName] = js.undefined
    ): GetPolicyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("FunctionName" -> FunctionName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPolicyRequest]
    }
  }

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

  @js.native
  trait InvocationRequest extends js.Object {
    var FunctionName: FunctionName
    var ClientContext: String
    var InvocationType: InvocationType
    var Payload: Blob
    var LogType: LogType
  }

  object InvocationRequest {
    def apply(
      FunctionName: js.UndefOr[FunctionName] = js.undefined,
      ClientContext: js.UndefOr[String] = js.undefined,
      InvocationType: js.UndefOr[InvocationType] = js.undefined,
      Payload: js.UndefOr[Blob] = js.undefined,
      LogType: js.UndefOr[LogType] = js.undefined
    ): InvocationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
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
   * <p>Contains a list of event sources (see <a>API_EventSourceMappingConfiguration</a>)</p>
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

  @js.native
  trait RemovePermissionRequest extends js.Object {
    var FunctionName: FunctionName
    var StatementId: StatementId
  }

  object RemovePermissionRequest {
    def apply(
      FunctionName: js.UndefOr[FunctionName] = js.undefined,
      StatementId: js.UndefOr[StatementId] = js.undefined
    ): RemovePermissionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("FunctionName" -> FunctionName.map { x => x: js.Any }),
        ("StatementId" -> StatementId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemovePermissionRequest]
    }
  }

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
    val jvm = "jvm"
    val python = "python"

    val values = IndexedSeq(nodejs, jvm, python)
  }

  /**
   * <p>The AWS Lambda service encountered an internal error.</p>
   */
  @js.native
  trait ServiceExceptionException extends js.Object {
    var Type: String
    var Message: String
  }

  @js.native
  trait TooManyRequestsExceptionException extends js.Object {
    var retryAfterSeconds: String
    var Type: String
    var message: String
  }

  @js.native
  trait UnsupportedMediaTypeExceptionException extends js.Object {
    var Type: String
    var message: String
  }

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

  @js.native
  trait UpdateFunctionCodeRequest extends js.Object {
    var FunctionName: FunctionName
    var ZipFile: Blob
  }

  object UpdateFunctionCodeRequest {
    def apply(
      FunctionName: js.UndefOr[FunctionName] = js.undefined,
      ZipFile: js.UndefOr[Blob] = js.undefined
    ): UpdateFunctionCodeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("FunctionName" -> FunctionName.map { x => x: js.Any }),
        ("ZipFile" -> ZipFile.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateFunctionCodeRequest]
    }
  }

  @js.native
  trait UpdateFunctionConfigurationRequest extends js.Object {
    var Role: RoleArn
    var Handler: Handler
    var FunctionName: FunctionName
    var Description: Description
    var MemorySize: MemorySize
    var Timeout: Timeout
  }

  object UpdateFunctionConfigurationRequest {
    def apply(
      Role: js.UndefOr[RoleArn] = js.undefined,
      Handler: js.UndefOr[Handler] = js.undefined,
      FunctionName: js.UndefOr[FunctionName] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined,
      MemorySize: js.UndefOr[MemorySize] = js.undefined,
      Timeout: js.UndefOr[Timeout] = js.undefined
    ): UpdateFunctionConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Role" -> Role.map { x => x: js.Any }),
        ("Handler" -> Handler.map { x => x: js.Any }),
        ("FunctionName" -> FunctionName.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("MemorySize" -> MemorySize.map { x => x: js.Any }),
        ("Timeout" -> Timeout.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateFunctionConfigurationRequest]
    }
  }
}
