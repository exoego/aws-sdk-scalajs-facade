package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object cloudcontrol {
  type ClientToken = String
  type HandlerNextToken = String
  type Identifier = String
  type MaxResults = Int
  type NextToken = String
  type OperationStatuses = js.Array[OperationStatus]
  type Operations = js.Array[Operation]
  type PatchDocument = String
  type Properties = String
  type RequestToken = String
  type ResourceDescriptions = js.Array[ResourceDescription]
  type ResourceRequestStatusSummaries = js.Array[ProgressEvent]
  type RoleArn = String
  type StatusMessage = String
  type Timestamp = js.Date
  type TypeName = String
  type TypeVersionId = String

  final class CloudControlOps(private val service: CloudControl) extends AnyVal {

    @inline def cancelResourceRequestFuture(params: CancelResourceRequestInput): Future[CancelResourceRequestOutput] = service.cancelResourceRequest(params).promise().toFuture
    @inline def createResourceFuture(params: CreateResourceInput): Future[CreateResourceOutput] = service.createResource(params).promise().toFuture
    @inline def deleteResourceFuture(params: DeleteResourceInput): Future[DeleteResourceOutput] = service.deleteResource(params).promise().toFuture
    @inline def getResourceFuture(params: GetResourceInput): Future[GetResourceOutput] = service.getResource(params).promise().toFuture
    @inline def getResourceRequestStatusFuture(params: GetResourceRequestStatusInput): Future[GetResourceRequestStatusOutput] = service.getResourceRequestStatus(params).promise().toFuture
    @inline def listResourceRequestsFuture(params: ListResourceRequestsInput): Future[ListResourceRequestsOutput] = service.listResourceRequests(params).promise().toFuture
    @inline def listResourcesFuture(params: ListResourcesInput): Future[ListResourcesOutput] = service.listResources(params).promise().toFuture
    @inline def updateResourceFuture(params: UpdateResourceInput): Future[UpdateResourceOutput] = service.updateResource(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/cloudcontrol", JSImport.Namespace, "AWS.CloudControl")
  class CloudControl() extends js.Object {
    def this(config: AWSConfig) = this()

    def cancelResourceRequest(params: CancelResourceRequestInput): Request[CancelResourceRequestOutput] = js.native
    def createResource(params: CreateResourceInput): Request[CreateResourceOutput] = js.native
    def deleteResource(params: DeleteResourceInput): Request[DeleteResourceOutput] = js.native
    def getResource(params: GetResourceInput): Request[GetResourceOutput] = js.native
    def getResourceRequestStatus(params: GetResourceRequestStatusInput): Request[GetResourceRequestStatusOutput] = js.native
    def listResourceRequests(params: ListResourceRequestsInput): Request[ListResourceRequestsOutput] = js.native
    def listResources(params: ListResourcesInput): Request[ListResourcesOutput] = js.native
    def updateResource(params: UpdateResourceInput): Request[UpdateResourceOutput] = js.native
  }
  object CloudControl {
    @inline implicit def toOps(service: CloudControl): CloudControlOps = {
      new CloudControlOps(service)
    }
  }

  @js.native
  trait CancelResourceRequestInput extends js.Object {
    var RequestToken: RequestToken
  }

  object CancelResourceRequestInput {
    @inline
    def apply(
        RequestToken: RequestToken
    ): CancelResourceRequestInput = {
      val __obj = js.Dynamic.literal(
        "RequestToken" -> RequestToken.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CancelResourceRequestInput]
    }
  }

  @js.native
  trait CancelResourceRequestOutput extends js.Object {
    var ProgressEvent: js.UndefOr[ProgressEvent]
  }

  object CancelResourceRequestOutput {
    @inline
    def apply(
        ProgressEvent: js.UndefOr[ProgressEvent] = js.undefined
    ): CancelResourceRequestOutput = {
      val __obj = js.Dynamic.literal()
      ProgressEvent.foreach(__v => __obj.updateDynamic("ProgressEvent")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CancelResourceRequestOutput]
    }
  }

  @js.native
  trait CreateResourceInput extends js.Object {
    var DesiredState: Properties
    var TypeName: TypeName
    var ClientToken: js.UndefOr[ClientToken]
    var RoleArn: js.UndefOr[RoleArn]
    var TypeVersionId: js.UndefOr[TypeVersionId]
  }

  object CreateResourceInput {
    @inline
    def apply(
        DesiredState: Properties,
        TypeName: TypeName,
        ClientToken: js.UndefOr[ClientToken] = js.undefined,
        RoleArn: js.UndefOr[RoleArn] = js.undefined,
        TypeVersionId: js.UndefOr[TypeVersionId] = js.undefined
    ): CreateResourceInput = {
      val __obj = js.Dynamic.literal(
        "DesiredState" -> DesiredState.asInstanceOf[js.Any],
        "TypeName" -> TypeName.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      TypeVersionId.foreach(__v => __obj.updateDynamic("TypeVersionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateResourceInput]
    }
  }

  @js.native
  trait CreateResourceOutput extends js.Object {
    var ProgressEvent: js.UndefOr[ProgressEvent]
  }

  object CreateResourceOutput {
    @inline
    def apply(
        ProgressEvent: js.UndefOr[ProgressEvent] = js.undefined
    ): CreateResourceOutput = {
      val __obj = js.Dynamic.literal()
      ProgressEvent.foreach(__v => __obj.updateDynamic("ProgressEvent")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateResourceOutput]
    }
  }

  @js.native
  trait DeleteResourceInput extends js.Object {
    var Identifier: Identifier
    var TypeName: TypeName
    var ClientToken: js.UndefOr[ClientToken]
    var RoleArn: js.UndefOr[RoleArn]
    var TypeVersionId: js.UndefOr[TypeVersionId]
  }

  object DeleteResourceInput {
    @inline
    def apply(
        Identifier: Identifier,
        TypeName: TypeName,
        ClientToken: js.UndefOr[ClientToken] = js.undefined,
        RoleArn: js.UndefOr[RoleArn] = js.undefined,
        TypeVersionId: js.UndefOr[TypeVersionId] = js.undefined
    ): DeleteResourceInput = {
      val __obj = js.Dynamic.literal(
        "Identifier" -> Identifier.asInstanceOf[js.Any],
        "TypeName" -> TypeName.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      TypeVersionId.foreach(__v => __obj.updateDynamic("TypeVersionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteResourceInput]
    }
  }

  @js.native
  trait DeleteResourceOutput extends js.Object {
    var ProgressEvent: js.UndefOr[ProgressEvent]
  }

  object DeleteResourceOutput {
    @inline
    def apply(
        ProgressEvent: js.UndefOr[ProgressEvent] = js.undefined
    ): DeleteResourceOutput = {
      val __obj = js.Dynamic.literal()
      ProgressEvent.foreach(__v => __obj.updateDynamic("ProgressEvent")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteResourceOutput]
    }
  }

  @js.native
  trait GetResourceInput extends js.Object {
    var Identifier: Identifier
    var TypeName: TypeName
    var RoleArn: js.UndefOr[RoleArn]
    var TypeVersionId: js.UndefOr[TypeVersionId]
  }

  object GetResourceInput {
    @inline
    def apply(
        Identifier: Identifier,
        TypeName: TypeName,
        RoleArn: js.UndefOr[RoleArn] = js.undefined,
        TypeVersionId: js.UndefOr[TypeVersionId] = js.undefined
    ): GetResourceInput = {
      val __obj = js.Dynamic.literal(
        "Identifier" -> Identifier.asInstanceOf[js.Any],
        "TypeName" -> TypeName.asInstanceOf[js.Any]
      )

      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      TypeVersionId.foreach(__v => __obj.updateDynamic("TypeVersionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetResourceInput]
    }
  }

  @js.native
  trait GetResourceOutput extends js.Object {
    var ResourceDescription: js.UndefOr[ResourceDescription]
    var TypeName: js.UndefOr[TypeName]
  }

  object GetResourceOutput {
    @inline
    def apply(
        ResourceDescription: js.UndefOr[ResourceDescription] = js.undefined,
        TypeName: js.UndefOr[TypeName] = js.undefined
    ): GetResourceOutput = {
      val __obj = js.Dynamic.literal()
      ResourceDescription.foreach(__v => __obj.updateDynamic("ResourceDescription")(__v.asInstanceOf[js.Any]))
      TypeName.foreach(__v => __obj.updateDynamic("TypeName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetResourceOutput]
    }
  }

  @js.native
  trait GetResourceRequestStatusInput extends js.Object {
    var RequestToken: RequestToken
  }

  object GetResourceRequestStatusInput {
    @inline
    def apply(
        RequestToken: RequestToken
    ): GetResourceRequestStatusInput = {
      val __obj = js.Dynamic.literal(
        "RequestToken" -> RequestToken.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetResourceRequestStatusInput]
    }
  }

  @js.native
  trait GetResourceRequestStatusOutput extends js.Object {
    var ProgressEvent: js.UndefOr[ProgressEvent]
  }

  object GetResourceRequestStatusOutput {
    @inline
    def apply(
        ProgressEvent: js.UndefOr[ProgressEvent] = js.undefined
    ): GetResourceRequestStatusOutput = {
      val __obj = js.Dynamic.literal()
      ProgressEvent.foreach(__v => __obj.updateDynamic("ProgressEvent")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetResourceRequestStatusOutput]
    }
  }

  @js.native
  trait ListResourceRequestsInput extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var ResourceRequestStatusFilter: js.UndefOr[ResourceRequestStatusFilter]
  }

  object ListResourceRequestsInput {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ResourceRequestStatusFilter: js.UndefOr[ResourceRequestStatusFilter] = js.undefined
    ): ListResourceRequestsInput = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ResourceRequestStatusFilter.foreach(__v => __obj.updateDynamic("ResourceRequestStatusFilter")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResourceRequestsInput]
    }
  }

  @js.native
  trait ListResourceRequestsOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var ResourceRequestStatusSummaries: js.UndefOr[ResourceRequestStatusSummaries]
  }

  object ListResourceRequestsOutput {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ResourceRequestStatusSummaries: js.UndefOr[ResourceRequestStatusSummaries] = js.undefined
    ): ListResourceRequestsOutput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ResourceRequestStatusSummaries.foreach(__v => __obj.updateDynamic("ResourceRequestStatusSummaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResourceRequestsOutput]
    }
  }

  @js.native
  trait ListResourcesInput extends js.Object {
    var TypeName: TypeName
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[HandlerNextToken]
    var ResourceModel: js.UndefOr[Properties]
    var RoleArn: js.UndefOr[RoleArn]
    var TypeVersionId: js.UndefOr[TypeVersionId]
  }

  object ListResourcesInput {
    @inline
    def apply(
        TypeName: TypeName,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[HandlerNextToken] = js.undefined,
        ResourceModel: js.UndefOr[Properties] = js.undefined,
        RoleArn: js.UndefOr[RoleArn] = js.undefined,
        TypeVersionId: js.UndefOr[TypeVersionId] = js.undefined
    ): ListResourcesInput = {
      val __obj = js.Dynamic.literal(
        "TypeName" -> TypeName.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ResourceModel.foreach(__v => __obj.updateDynamic("ResourceModel")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      TypeVersionId.foreach(__v => __obj.updateDynamic("TypeVersionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResourcesInput]
    }
  }

  @js.native
  trait ListResourcesOutput extends js.Object {
    var NextToken: js.UndefOr[HandlerNextToken]
    var ResourceDescriptions: js.UndefOr[ResourceDescriptions]
    var TypeName: js.UndefOr[TypeName]
  }

  object ListResourcesOutput {
    @inline
    def apply(
        NextToken: js.UndefOr[HandlerNextToken] = js.undefined,
        ResourceDescriptions: js.UndefOr[ResourceDescriptions] = js.undefined,
        TypeName: js.UndefOr[TypeName] = js.undefined
    ): ListResourcesOutput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ResourceDescriptions.foreach(__v => __obj.updateDynamic("ResourceDescriptions")(__v.asInstanceOf[js.Any]))
      TypeName.foreach(__v => __obj.updateDynamic("TypeName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResourcesOutput]
    }
  }

  /** Represents the current status of a resource operation request. For more information, see [[https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-operations-manage-requests.html|Managing resource operation requests]] in the <i>Amazon Web Services Cloud Control API User Guide</i>.
    */
  @js.native
  trait ProgressEvent extends js.Object {
    var ErrorCode: js.UndefOr[HandlerErrorCode]
    var EventTime: js.UndefOr[Timestamp]
    var Identifier: js.UndefOr[Identifier]
    var Operation: js.UndefOr[Operation]
    var OperationStatus: js.UndefOr[OperationStatus]
    var RequestToken: js.UndefOr[RequestToken]
    var ResourceModel: js.UndefOr[Properties]
    var RetryAfter: js.UndefOr[Timestamp]
    var StatusMessage: js.UndefOr[StatusMessage]
    var TypeName: js.UndefOr[TypeName]
  }

  object ProgressEvent {
    @inline
    def apply(
        ErrorCode: js.UndefOr[HandlerErrorCode] = js.undefined,
        EventTime: js.UndefOr[Timestamp] = js.undefined,
        Identifier: js.UndefOr[Identifier] = js.undefined,
        Operation: js.UndefOr[Operation] = js.undefined,
        OperationStatus: js.UndefOr[OperationStatus] = js.undefined,
        RequestToken: js.UndefOr[RequestToken] = js.undefined,
        ResourceModel: js.UndefOr[Properties] = js.undefined,
        RetryAfter: js.UndefOr[Timestamp] = js.undefined,
        StatusMessage: js.UndefOr[StatusMessage] = js.undefined,
        TypeName: js.UndefOr[TypeName] = js.undefined
    ): ProgressEvent = {
      val __obj = js.Dynamic.literal()
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      EventTime.foreach(__v => __obj.updateDynamic("EventTime")(__v.asInstanceOf[js.Any]))
      Identifier.foreach(__v => __obj.updateDynamic("Identifier")(__v.asInstanceOf[js.Any]))
      Operation.foreach(__v => __obj.updateDynamic("Operation")(__v.asInstanceOf[js.Any]))
      OperationStatus.foreach(__v => __obj.updateDynamic("OperationStatus")(__v.asInstanceOf[js.Any]))
      RequestToken.foreach(__v => __obj.updateDynamic("RequestToken")(__v.asInstanceOf[js.Any]))
      ResourceModel.foreach(__v => __obj.updateDynamic("ResourceModel")(__v.asInstanceOf[js.Any]))
      RetryAfter.foreach(__v => __obj.updateDynamic("RetryAfter")(__v.asInstanceOf[js.Any]))
      StatusMessage.foreach(__v => __obj.updateDynamic("StatusMessage")(__v.asInstanceOf[js.Any]))
      TypeName.foreach(__v => __obj.updateDynamic("TypeName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProgressEvent]
    }
  }

  /** Represents information about a provisioned resource.
    */
  @js.native
  trait ResourceDescription extends js.Object {
    var Identifier: js.UndefOr[Identifier]
    var Properties: js.UndefOr[Properties]
  }

  object ResourceDescription {
    @inline
    def apply(
        Identifier: js.UndefOr[Identifier] = js.undefined,
        Properties: js.UndefOr[Properties] = js.undefined
    ): ResourceDescription = {
      val __obj = js.Dynamic.literal()
      Identifier.foreach(__v => __obj.updateDynamic("Identifier")(__v.asInstanceOf[js.Any]))
      Properties.foreach(__v => __obj.updateDynamic("Properties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceDescription]
    }
  }

  /** The filter criteria to use in determining the requests returned.
    */
  @js.native
  trait ResourceRequestStatusFilter extends js.Object {
    var OperationStatuses: js.UndefOr[OperationStatuses]
    var Operations: js.UndefOr[Operations]
  }

  object ResourceRequestStatusFilter {
    @inline
    def apply(
        OperationStatuses: js.UndefOr[OperationStatuses] = js.undefined,
        Operations: js.UndefOr[Operations] = js.undefined
    ): ResourceRequestStatusFilter = {
      val __obj = js.Dynamic.literal()
      OperationStatuses.foreach(__v => __obj.updateDynamic("OperationStatuses")(__v.asInstanceOf[js.Any]))
      Operations.foreach(__v => __obj.updateDynamic("Operations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceRequestStatusFilter]
    }
  }

  @js.native
  trait UpdateResourceInput extends js.Object {
    var Identifier: Identifier
    var PatchDocument: PatchDocument
    var TypeName: TypeName
    var ClientToken: js.UndefOr[ClientToken]
    var RoleArn: js.UndefOr[RoleArn]
    var TypeVersionId: js.UndefOr[TypeVersionId]
  }

  object UpdateResourceInput {
    @inline
    def apply(
        Identifier: Identifier,
        PatchDocument: PatchDocument,
        TypeName: TypeName,
        ClientToken: js.UndefOr[ClientToken] = js.undefined,
        RoleArn: js.UndefOr[RoleArn] = js.undefined,
        TypeVersionId: js.UndefOr[TypeVersionId] = js.undefined
    ): UpdateResourceInput = {
      val __obj = js.Dynamic.literal(
        "Identifier" -> Identifier.asInstanceOf[js.Any],
        "PatchDocument" -> PatchDocument.asInstanceOf[js.Any],
        "TypeName" -> TypeName.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      TypeVersionId.foreach(__v => __obj.updateDynamic("TypeVersionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateResourceInput]
    }
  }

  @js.native
  trait UpdateResourceOutput extends js.Object {
    var ProgressEvent: js.UndefOr[ProgressEvent]
  }

  object UpdateResourceOutput {
    @inline
    def apply(
        ProgressEvent: js.UndefOr[ProgressEvent] = js.undefined
    ): UpdateResourceOutput = {
      val __obj = js.Dynamic.literal()
      ProgressEvent.foreach(__v => __obj.updateDynamic("ProgressEvent")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateResourceOutput]
    }
  }
}
