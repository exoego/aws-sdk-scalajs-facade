package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object iotfleetwise {
  type AmazonResourceName = String
  type CanInterfaceName = String
  type CanSignalName = String
  type CloudWatchLogGroupName = String
  type DataExtraDimensionNodePathList = js.Array[NodePath]
  type Fqns = js.Array[FullyQualifiedName]
  type FullyQualifiedName = String
  type IAMRoleArn = String
  type InterfaceId = String
  type InterfaceIds = js.Array[InterfaceId]
  type ModelSignalsMap = js.Dictionary[String]
  type NetworkFileBlob = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type NetworkFileDefinitions = js.Array[NetworkFileDefinition]
  type NetworkFilesList = js.Array[NetworkFileBlob]
  type NetworkInterfaces = js.Array[NetworkInterface]
  type NodePath = String
  type NodePaths = js.Array[NodePath]
  type Nodes = js.Array[Node]
  type ObdBitmaskLength = Int
  type ObdByteLength = Int
  type ObdInterfaceName = String
  type ObdStandard = String
  type ProtocolName = String
  type ProtocolVersion = String
  type SignalDecoders = js.Array[SignalDecoder]
  type SignalInformationList = js.Array[SignalInformation]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type TimestreamDatabaseName = String
  type TimestreamTableName = String
  type VehicleStatusList = js.Array[VehicleStatus]
  type arn = String
  type attributeName = String
  type attributeValue = String
  type attributesMap = js.Dictionary[attributeValue]
  type campaignName = String
  type campaignSummaries = js.Array[CampaignSummary]
  type collectionPeriodMs = Double
  type createVehicleErrors = js.Array[CreateVehicleError]
  type createVehicleRequestItems = js.Array[CreateVehicleRequestItem]
  type createVehicleResponses = js.Array[CreateVehicleResponseItem]
  type customerAccountId = String
  type decoderManifestSummaries = js.Array[DecoderManifestSummary]
  type description = String
  type double = Double
  type errorMessage = String
  type eventExpression = String
  type fleetId = String
  type fleetSummaries = js.Array[FleetSummary]
  type fleets = js.Array[fleetId]
  type languageVersion = Int
  type listOfStrings = js.Array[String]
  type listVehiclesMaxResults = Int
  type maxResults = Int
  type maxSampleCount = Double
  type modelManifestSummaries = js.Array[ModelManifestSummary]
  type nextToken = String
  type nonNegativeInteger = Int
  type number = Int
  type positiveInteger = Int
  type priority = Int
  type resourceName = String
  type signalCatalogSummaries = js.Array[SignalCatalogSummary]
  type status = String
  type timestamp = js.Date
  type uint32 = Double
  type updateVehicleErrors = js.Array[UpdateVehicleError]
  type updateVehicleRequestItems = js.Array[UpdateVehicleRequestItem]
  type updateVehicleResponseItems = js.Array[UpdateVehicleResponseItem]
  type vehicleName = String
  type vehicleSummaries = js.Array[VehicleSummary]
  type vehicles = js.Array[vehicleName]
  type wildcardSignalName = String

  final class IoTFleetWiseOps(private val service: IoTFleetWise) extends AnyVal {

    @inline def associateVehicleFleetFuture(params: AssociateVehicleFleetRequest): Future[AssociateVehicleFleetResponse] = service.associateVehicleFleet(params).promise().toFuture
    @inline def batchCreateVehicleFuture(params: BatchCreateVehicleRequest): Future[BatchCreateVehicleResponse] = service.batchCreateVehicle(params).promise().toFuture
    @inline def batchUpdateVehicleFuture(params: BatchUpdateVehicleRequest): Future[BatchUpdateVehicleResponse] = service.batchUpdateVehicle(params).promise().toFuture
    @inline def createCampaignFuture(params: CreateCampaignRequest): Future[CreateCampaignResponse] = service.createCampaign(params).promise().toFuture
    @inline def createDecoderManifestFuture(params: CreateDecoderManifestRequest): Future[CreateDecoderManifestResponse] = service.createDecoderManifest(params).promise().toFuture
    @inline def createFleetFuture(params: CreateFleetRequest): Future[CreateFleetResponse] = service.createFleet(params).promise().toFuture
    @inline def createModelManifestFuture(params: CreateModelManifestRequest): Future[CreateModelManifestResponse] = service.createModelManifest(params).promise().toFuture
    @inline def createSignalCatalogFuture(params: CreateSignalCatalogRequest): Future[CreateSignalCatalogResponse] = service.createSignalCatalog(params).promise().toFuture
    @inline def createVehicleFuture(params: CreateVehicleRequest): Future[CreateVehicleResponse] = service.createVehicle(params).promise().toFuture
    @inline def deleteCampaignFuture(params: DeleteCampaignRequest): Future[DeleteCampaignResponse] = service.deleteCampaign(params).promise().toFuture
    @inline def deleteDecoderManifestFuture(params: DeleteDecoderManifestRequest): Future[DeleteDecoderManifestResponse] = service.deleteDecoderManifest(params).promise().toFuture
    @inline def deleteFleetFuture(params: DeleteFleetRequest): Future[DeleteFleetResponse] = service.deleteFleet(params).promise().toFuture
    @inline def deleteModelManifestFuture(params: DeleteModelManifestRequest): Future[DeleteModelManifestResponse] = service.deleteModelManifest(params).promise().toFuture
    @inline def deleteSignalCatalogFuture(params: DeleteSignalCatalogRequest): Future[DeleteSignalCatalogResponse] = service.deleteSignalCatalog(params).promise().toFuture
    @inline def deleteVehicleFuture(params: DeleteVehicleRequest): Future[DeleteVehicleResponse] = service.deleteVehicle(params).promise().toFuture
    @inline def disassociateVehicleFleetFuture(params: DisassociateVehicleFleetRequest): Future[DisassociateVehicleFleetResponse] = service.disassociateVehicleFleet(params).promise().toFuture
    @inline def getCampaignFuture(params: GetCampaignRequest): Future[GetCampaignResponse] = service.getCampaign(params).promise().toFuture
    @inline def getDecoderManifestFuture(params: GetDecoderManifestRequest): Future[GetDecoderManifestResponse] = service.getDecoderManifest(params).promise().toFuture
    @inline def getFleetFuture(params: GetFleetRequest): Future[GetFleetResponse] = service.getFleet(params).promise().toFuture
    @inline def getLoggingOptionsFuture(params: GetLoggingOptionsRequest): Future[GetLoggingOptionsResponse] = service.getLoggingOptions(params).promise().toFuture
    @inline def getModelManifestFuture(params: GetModelManifestRequest): Future[GetModelManifestResponse] = service.getModelManifest(params).promise().toFuture
    @inline def getRegisterAccountStatusFuture(params: GetRegisterAccountStatusRequest): Future[GetRegisterAccountStatusResponse] = service.getRegisterAccountStatus(params).promise().toFuture
    @inline def getSignalCatalogFuture(params: GetSignalCatalogRequest): Future[GetSignalCatalogResponse] = service.getSignalCatalog(params).promise().toFuture
    @inline def getVehicleFuture(params: GetVehicleRequest): Future[GetVehicleResponse] = service.getVehicle(params).promise().toFuture
    @inline def getVehicleStatusFuture(params: GetVehicleStatusRequest): Future[GetVehicleStatusResponse] = service.getVehicleStatus(params).promise().toFuture
    @inline def importDecoderManifestFuture(params: ImportDecoderManifestRequest): Future[ImportDecoderManifestResponse] = service.importDecoderManifest(params).promise().toFuture
    @inline def importSignalCatalogFuture(params: ImportSignalCatalogRequest): Future[ImportSignalCatalogResponse] = service.importSignalCatalog(params).promise().toFuture
    @inline def listCampaignsFuture(params: ListCampaignsRequest): Future[ListCampaignsResponse] = service.listCampaigns(params).promise().toFuture
    @inline def listDecoderManifestNetworkInterfacesFuture(params: ListDecoderManifestNetworkInterfacesRequest): Future[ListDecoderManifestNetworkInterfacesResponse] = service.listDecoderManifestNetworkInterfaces(params).promise().toFuture
    @inline def listDecoderManifestSignalsFuture(params: ListDecoderManifestSignalsRequest): Future[ListDecoderManifestSignalsResponse] = service.listDecoderManifestSignals(params).promise().toFuture
    @inline def listDecoderManifestsFuture(params: ListDecoderManifestsRequest): Future[ListDecoderManifestsResponse] = service.listDecoderManifests(params).promise().toFuture
    @inline def listFleetsForVehicleFuture(params: ListFleetsForVehicleRequest): Future[ListFleetsForVehicleResponse] = service.listFleetsForVehicle(params).promise().toFuture
    @inline def listFleetsFuture(params: ListFleetsRequest): Future[ListFleetsResponse] = service.listFleets(params).promise().toFuture
    @inline def listModelManifestNodesFuture(params: ListModelManifestNodesRequest): Future[ListModelManifestNodesResponse] = service.listModelManifestNodes(params).promise().toFuture
    @inline def listModelManifestsFuture(params: ListModelManifestsRequest): Future[ListModelManifestsResponse] = service.listModelManifests(params).promise().toFuture
    @inline def listSignalCatalogNodesFuture(params: ListSignalCatalogNodesRequest): Future[ListSignalCatalogNodesResponse] = service.listSignalCatalogNodes(params).promise().toFuture
    @inline def listSignalCatalogsFuture(params: ListSignalCatalogsRequest): Future[ListSignalCatalogsResponse] = service.listSignalCatalogs(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def listVehiclesFuture(params: ListVehiclesRequest): Future[ListVehiclesResponse] = service.listVehicles(params).promise().toFuture
    @inline def listVehiclesInFleetFuture(params: ListVehiclesInFleetRequest): Future[ListVehiclesInFleetResponse] = service.listVehiclesInFleet(params).promise().toFuture
    @inline def putLoggingOptionsFuture(params: PutLoggingOptionsRequest): Future[PutLoggingOptionsResponse] = service.putLoggingOptions(params).promise().toFuture
    @inline def registerAccountFuture(params: RegisterAccountRequest): Future[RegisterAccountResponse] = service.registerAccount(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateCampaignFuture(params: UpdateCampaignRequest): Future[UpdateCampaignResponse] = service.updateCampaign(params).promise().toFuture
    @inline def updateDecoderManifestFuture(params: UpdateDecoderManifestRequest): Future[UpdateDecoderManifestResponse] = service.updateDecoderManifest(params).promise().toFuture
    @inline def updateFleetFuture(params: UpdateFleetRequest): Future[UpdateFleetResponse] = service.updateFleet(params).promise().toFuture
    @inline def updateModelManifestFuture(params: UpdateModelManifestRequest): Future[UpdateModelManifestResponse] = service.updateModelManifest(params).promise().toFuture
    @inline def updateSignalCatalogFuture(params: UpdateSignalCatalogRequest): Future[UpdateSignalCatalogResponse] = service.updateSignalCatalog(params).promise().toFuture
    @inline def updateVehicleFuture(params: UpdateVehicleRequest): Future[UpdateVehicleResponse] = service.updateVehicle(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/iotfleetwise", JSImport.Namespace, "AWS.IoTFleetWise")
  class IoTFleetWise() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateVehicleFleet(params: AssociateVehicleFleetRequest): Request[AssociateVehicleFleetResponse] = js.native
    def batchCreateVehicle(params: BatchCreateVehicleRequest): Request[BatchCreateVehicleResponse] = js.native
    def batchUpdateVehicle(params: BatchUpdateVehicleRequest): Request[BatchUpdateVehicleResponse] = js.native
    def createCampaign(params: CreateCampaignRequest): Request[CreateCampaignResponse] = js.native
    def createDecoderManifest(params: CreateDecoderManifestRequest): Request[CreateDecoderManifestResponse] = js.native
    def createFleet(params: CreateFleetRequest): Request[CreateFleetResponse] = js.native
    def createModelManifest(params: CreateModelManifestRequest): Request[CreateModelManifestResponse] = js.native
    def createSignalCatalog(params: CreateSignalCatalogRequest): Request[CreateSignalCatalogResponse] = js.native
    def createVehicle(params: CreateVehicleRequest): Request[CreateVehicleResponse] = js.native
    def deleteCampaign(params: DeleteCampaignRequest): Request[DeleteCampaignResponse] = js.native
    def deleteDecoderManifest(params: DeleteDecoderManifestRequest): Request[DeleteDecoderManifestResponse] = js.native
    def deleteFleet(params: DeleteFleetRequest): Request[DeleteFleetResponse] = js.native
    def deleteModelManifest(params: DeleteModelManifestRequest): Request[DeleteModelManifestResponse] = js.native
    def deleteSignalCatalog(params: DeleteSignalCatalogRequest): Request[DeleteSignalCatalogResponse] = js.native
    def deleteVehicle(params: DeleteVehicleRequest): Request[DeleteVehicleResponse] = js.native
    def disassociateVehicleFleet(params: DisassociateVehicleFleetRequest): Request[DisassociateVehicleFleetResponse] = js.native
    def getCampaign(params: GetCampaignRequest): Request[GetCampaignResponse] = js.native
    def getDecoderManifest(params: GetDecoderManifestRequest): Request[GetDecoderManifestResponse] = js.native
    def getFleet(params: GetFleetRequest): Request[GetFleetResponse] = js.native
    def getLoggingOptions(params: GetLoggingOptionsRequest): Request[GetLoggingOptionsResponse] = js.native
    def getModelManifest(params: GetModelManifestRequest): Request[GetModelManifestResponse] = js.native
    def getRegisterAccountStatus(params: GetRegisterAccountStatusRequest): Request[GetRegisterAccountStatusResponse] = js.native
    def getSignalCatalog(params: GetSignalCatalogRequest): Request[GetSignalCatalogResponse] = js.native
    def getVehicle(params: GetVehicleRequest): Request[GetVehicleResponse] = js.native
    def getVehicleStatus(params: GetVehicleStatusRequest): Request[GetVehicleStatusResponse] = js.native
    def importDecoderManifest(params: ImportDecoderManifestRequest): Request[ImportDecoderManifestResponse] = js.native
    def importSignalCatalog(params: ImportSignalCatalogRequest): Request[ImportSignalCatalogResponse] = js.native
    def listCampaigns(params: ListCampaignsRequest): Request[ListCampaignsResponse] = js.native
    def listDecoderManifestNetworkInterfaces(params: ListDecoderManifestNetworkInterfacesRequest): Request[ListDecoderManifestNetworkInterfacesResponse] = js.native
    def listDecoderManifestSignals(params: ListDecoderManifestSignalsRequest): Request[ListDecoderManifestSignalsResponse] = js.native
    def listDecoderManifests(params: ListDecoderManifestsRequest): Request[ListDecoderManifestsResponse] = js.native
    def listFleets(params: ListFleetsRequest): Request[ListFleetsResponse] = js.native
    def listFleetsForVehicle(params: ListFleetsForVehicleRequest): Request[ListFleetsForVehicleResponse] = js.native
    def listModelManifestNodes(params: ListModelManifestNodesRequest): Request[ListModelManifestNodesResponse] = js.native
    def listModelManifests(params: ListModelManifestsRequest): Request[ListModelManifestsResponse] = js.native
    def listSignalCatalogNodes(params: ListSignalCatalogNodesRequest): Request[ListSignalCatalogNodesResponse] = js.native
    def listSignalCatalogs(params: ListSignalCatalogsRequest): Request[ListSignalCatalogsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def listVehicles(params: ListVehiclesRequest): Request[ListVehiclesResponse] = js.native
    def listVehiclesInFleet(params: ListVehiclesInFleetRequest): Request[ListVehiclesInFleetResponse] = js.native
    def putLoggingOptions(params: PutLoggingOptionsRequest): Request[PutLoggingOptionsResponse] = js.native
    def registerAccount(params: RegisterAccountRequest): Request[RegisterAccountResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateCampaign(params: UpdateCampaignRequest): Request[UpdateCampaignResponse] = js.native
    def updateDecoderManifest(params: UpdateDecoderManifestRequest): Request[UpdateDecoderManifestResponse] = js.native
    def updateFleet(params: UpdateFleetRequest): Request[UpdateFleetResponse] = js.native
    def updateModelManifest(params: UpdateModelManifestRequest): Request[UpdateModelManifestResponse] = js.native
    def updateSignalCatalog(params: UpdateSignalCatalogRequest): Request[UpdateSignalCatalogResponse] = js.native
    def updateVehicle(params: UpdateVehicleRequest): Request[UpdateVehicleResponse] = js.native
  }
  object IoTFleetWise {
    @inline implicit def toOps(service: IoTFleetWise): IoTFleetWiseOps = {
      new IoTFleetWiseOps(service)
    }
  }

  /** A signal that represents a vehicle device such as the engine, heater, and door locks. Data from an actuator reports the state of a certain vehicle device.
    *
    * '''Note:'''Updating actuator data can change the state of a device. For example, you can turn on or off the heater by updating its actuator data.
    */
  @js.native
  trait Actuator extends js.Object {
    var dataType: NodeDataType
    var fullyQualifiedName: String
    var allowedValues: js.UndefOr[listOfStrings]
    var assignedValue: js.UndefOr[String]
    var description: js.UndefOr[description]
    var max: js.UndefOr[double]
    var min: js.UndefOr[double]
    var unit: js.UndefOr[String]
  }

  object Actuator {
    @inline
    def apply(
        dataType: NodeDataType,
        fullyQualifiedName: String,
        allowedValues: js.UndefOr[listOfStrings] = js.undefined,
        assignedValue: js.UndefOr[String] = js.undefined,
        description: js.UndefOr[description] = js.undefined,
        max: js.UndefOr[double] = js.undefined,
        min: js.UndefOr[double] = js.undefined,
        unit: js.UndefOr[String] = js.undefined
    ): Actuator = {
      val __obj = js.Dynamic.literal(
        "dataType" -> dataType.asInstanceOf[js.Any],
        "fullyQualifiedName" -> fullyQualifiedName.asInstanceOf[js.Any]
      )

      allowedValues.foreach(__v => __obj.updateDynamic("allowedValues")(__v.asInstanceOf[js.Any]))
      assignedValue.foreach(__v => __obj.updateDynamic("assignedValue")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      max.foreach(__v => __obj.updateDynamic("max")(__v.asInstanceOf[js.Any]))
      min.foreach(__v => __obj.updateDynamic("min")(__v.asInstanceOf[js.Any]))
      unit.foreach(__v => __obj.updateDynamic("unit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Actuator]
    }
  }

  @js.native
  trait AssociateVehicleFleetRequest extends js.Object {
    var fleetId: fleetId
    var vehicleName: vehicleName
  }

  object AssociateVehicleFleetRequest {
    @inline
    def apply(
        fleetId: fleetId,
        vehicleName: vehicleName
    ): AssociateVehicleFleetRequest = {
      val __obj = js.Dynamic.literal(
        "fleetId" -> fleetId.asInstanceOf[js.Any],
        "vehicleName" -> vehicleName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociateVehicleFleetRequest]
    }
  }

  @js.native
  trait AssociateVehicleFleetResponse extends js.Object

  object AssociateVehicleFleetResponse {
    @inline
    def apply(): AssociateVehicleFleetResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssociateVehicleFleetResponse]
    }
  }

  /** A signal that represents static information about the vehicle, such as engine type or manufacturing date.
    */
  @js.native
  trait Attribute extends js.Object {
    var dataType: NodeDataType
    var fullyQualifiedName: String
    var allowedValues: js.UndefOr[listOfStrings]
    var assignedValue: js.UndefOr[String]
    var defaultValue: js.UndefOr[String]
    var description: js.UndefOr[description]
    var max: js.UndefOr[double]
    var min: js.UndefOr[double]
    var unit: js.UndefOr[String]
  }

  object Attribute {
    @inline
    def apply(
        dataType: NodeDataType,
        fullyQualifiedName: String,
        allowedValues: js.UndefOr[listOfStrings] = js.undefined,
        assignedValue: js.UndefOr[String] = js.undefined,
        defaultValue: js.UndefOr[String] = js.undefined,
        description: js.UndefOr[description] = js.undefined,
        max: js.UndefOr[double] = js.undefined,
        min: js.UndefOr[double] = js.undefined,
        unit: js.UndefOr[String] = js.undefined
    ): Attribute = {
      val __obj = js.Dynamic.literal(
        "dataType" -> dataType.asInstanceOf[js.Any],
        "fullyQualifiedName" -> fullyQualifiedName.asInstanceOf[js.Any]
      )

      allowedValues.foreach(__v => __obj.updateDynamic("allowedValues")(__v.asInstanceOf[js.Any]))
      assignedValue.foreach(__v => __obj.updateDynamic("assignedValue")(__v.asInstanceOf[js.Any]))
      defaultValue.foreach(__v => __obj.updateDynamic("defaultValue")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      max.foreach(__v => __obj.updateDynamic("max")(__v.asInstanceOf[js.Any]))
      min.foreach(__v => __obj.updateDynamic("min")(__v.asInstanceOf[js.Any]))
      unit.foreach(__v => __obj.updateDynamic("unit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Attribute]
    }
  }

  @js.native
  trait BatchCreateVehicleRequest extends js.Object {
    var vehicles: createVehicleRequestItems
  }

  object BatchCreateVehicleRequest {
    @inline
    def apply(
        vehicles: createVehicleRequestItems
    ): BatchCreateVehicleRequest = {
      val __obj = js.Dynamic.literal(
        "vehicles" -> vehicles.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchCreateVehicleRequest]
    }
  }

  @js.native
  trait BatchCreateVehicleResponse extends js.Object {
    var errors: js.UndefOr[createVehicleErrors]
    var vehicles: js.UndefOr[createVehicleResponses]
  }

  object BatchCreateVehicleResponse {
    @inline
    def apply(
        errors: js.UndefOr[createVehicleErrors] = js.undefined,
        vehicles: js.UndefOr[createVehicleResponses] = js.undefined
    ): BatchCreateVehicleResponse = {
      val __obj = js.Dynamic.literal()
      errors.foreach(__v => __obj.updateDynamic("errors")(__v.asInstanceOf[js.Any]))
      vehicles.foreach(__v => __obj.updateDynamic("vehicles")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchCreateVehicleResponse]
    }
  }

  @js.native
  trait BatchUpdateVehicleRequest extends js.Object {
    var vehicles: updateVehicleRequestItems
  }

  object BatchUpdateVehicleRequest {
    @inline
    def apply(
        vehicles: updateVehicleRequestItems
    ): BatchUpdateVehicleRequest = {
      val __obj = js.Dynamic.literal(
        "vehicles" -> vehicles.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchUpdateVehicleRequest]
    }
  }

  @js.native
  trait BatchUpdateVehicleResponse extends js.Object {
    var errors: js.UndefOr[updateVehicleErrors]
    var vehicles: js.UndefOr[updateVehicleResponseItems]
  }

  object BatchUpdateVehicleResponse {
    @inline
    def apply(
        errors: js.UndefOr[updateVehicleErrors] = js.undefined,
        vehicles: js.UndefOr[updateVehicleResponseItems] = js.undefined
    ): BatchUpdateVehicleResponse = {
      val __obj = js.Dynamic.literal()
      errors.foreach(__v => __obj.updateDynamic("errors")(__v.asInstanceOf[js.Any]))
      vehicles.foreach(__v => __obj.updateDynamic("vehicles")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchUpdateVehicleResponse]
    }
  }

  /** A group of signals that are defined in a hierarchical structure.
    */
  @js.native
  trait Branch extends js.Object {
    var fullyQualifiedName: String
    var description: js.UndefOr[description]
  }

  object Branch {
    @inline
    def apply(
        fullyQualifiedName: String,
        description: js.UndefOr[description] = js.undefined
    ): Branch = {
      val __obj = js.Dynamic.literal(
        "fullyQualifiedName" -> fullyQualifiedName.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Branch]
    }
  }

  /** Information about a campaign. You can use the API operation to return this information about multiple created campaigns.
    */
  @js.native
  trait CampaignSummary extends js.Object {
    var creationTime: timestamp
    var lastModificationTime: timestamp
    var arn: js.UndefOr[arn]
    var description: js.UndefOr[description]
    var name: js.UndefOr[campaignName]
    var signalCatalogArn: js.UndefOr[arn]
    var status: js.UndefOr[CampaignStatus]
    var targetArn: js.UndefOr[arn]
  }

  object CampaignSummary {
    @inline
    def apply(
        creationTime: timestamp,
        lastModificationTime: timestamp,
        arn: js.UndefOr[arn] = js.undefined,
        description: js.UndefOr[description] = js.undefined,
        name: js.UndefOr[campaignName] = js.undefined,
        signalCatalogArn: js.UndefOr[arn] = js.undefined,
        status: js.UndefOr[CampaignStatus] = js.undefined,
        targetArn: js.UndefOr[arn] = js.undefined
    ): CampaignSummary = {
      val __obj = js.Dynamic.literal(
        "creationTime" -> creationTime.asInstanceOf[js.Any],
        "lastModificationTime" -> lastModificationTime.asInstanceOf[js.Any]
      )

      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      signalCatalogArn.foreach(__v => __obj.updateDynamic("signalCatalogArn")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      targetArn.foreach(__v => __obj.updateDynamic("targetArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CampaignSummary]
    }
  }

  /** Configurations used to create a decoder manifest.
    */
  @js.native
  trait CanDbcDefinition extends js.Object {
    var canDbcFiles: NetworkFilesList
    var networkInterface: InterfaceId
    var signalsMap: js.UndefOr[ModelSignalsMap]
  }

  object CanDbcDefinition {
    @inline
    def apply(
        canDbcFiles: NetworkFilesList,
        networkInterface: InterfaceId,
        signalsMap: js.UndefOr[ModelSignalsMap] = js.undefined
    ): CanDbcDefinition = {
      val __obj = js.Dynamic.literal(
        "canDbcFiles" -> canDbcFiles.asInstanceOf[js.Any],
        "networkInterface" -> networkInterface.asInstanceOf[js.Any]
      )

      signalsMap.foreach(__v => __obj.updateDynamic("signalsMap")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CanDbcDefinition]
    }
  }

  /** A single controller area network (CAN) device interface.
    */
  @js.native
  trait CanInterface extends js.Object {
    var name: CanInterfaceName
    var protocolName: js.UndefOr[ProtocolName]
    var protocolVersion: js.UndefOr[ProtocolVersion]
  }

  object CanInterface {
    @inline
    def apply(
        name: CanInterfaceName,
        protocolName: js.UndefOr[ProtocolName] = js.undefined,
        protocolVersion: js.UndefOr[ProtocolVersion] = js.undefined
    ): CanInterface = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      protocolName.foreach(__v => __obj.updateDynamic("protocolName")(__v.asInstanceOf[js.Any]))
      protocolVersion.foreach(__v => __obj.updateDynamic("protocolVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CanInterface]
    }
  }

  /** Information about a single controller area network (CAN) signal and the messages it receives and transmits.
    */
  @js.native
  trait CanSignal extends js.Object {
    var factor: double
    var isBigEndian: Boolean
    var isSigned: Boolean
    var length: nonNegativeInteger
    var messageId: nonNegativeInteger
    var offset: double
    var startBit: nonNegativeInteger
    var name: js.UndefOr[CanSignalName]
  }

  object CanSignal {
    @inline
    def apply(
        factor: double,
        isBigEndian: Boolean,
        isSigned: Boolean,
        length: nonNegativeInteger,
        messageId: nonNegativeInteger,
        offset: double,
        startBit: nonNegativeInteger,
        name: js.UndefOr[CanSignalName] = js.undefined
    ): CanSignal = {
      val __obj = js.Dynamic.literal(
        "factor" -> factor.asInstanceOf[js.Any],
        "isBigEndian" -> isBigEndian.asInstanceOf[js.Any],
        "isSigned" -> isSigned.asInstanceOf[js.Any],
        "length" -> length.asInstanceOf[js.Any],
        "messageId" -> messageId.asInstanceOf[js.Any],
        "offset" -> offset.asInstanceOf[js.Any],
        "startBit" -> startBit.asInstanceOf[js.Any]
      )

      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CanSignal]
    }
  }

  /** The log delivery option to send data to Amazon CloudWatch Logs.
    */
  @js.native
  trait CloudWatchLogDeliveryOptions extends js.Object {
    var logType: LogType
    var logGroupName: js.UndefOr[CloudWatchLogGroupName]
  }

  object CloudWatchLogDeliveryOptions {
    @inline
    def apply(
        logType: LogType,
        logGroupName: js.UndefOr[CloudWatchLogGroupName] = js.undefined
    ): CloudWatchLogDeliveryOptions = {
      val __obj = js.Dynamic.literal(
        "logType" -> logType.asInstanceOf[js.Any]
      )

      logGroupName.foreach(__v => __obj.updateDynamic("logGroupName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CloudWatchLogDeliveryOptions]
    }
  }

  /** Specifies what data to collect and how often or when to collect it.
    */
  @js.native
  trait CollectionScheme extends js.Object {
    var conditionBasedCollectionScheme: js.UndefOr[ConditionBasedCollectionScheme]
    var timeBasedCollectionScheme: js.UndefOr[TimeBasedCollectionScheme]
  }

  object CollectionScheme {
    @inline
    def apply(
        conditionBasedCollectionScheme: js.UndefOr[ConditionBasedCollectionScheme] = js.undefined,
        timeBasedCollectionScheme: js.UndefOr[TimeBasedCollectionScheme] = js.undefined
    ): CollectionScheme = {
      val __obj = js.Dynamic.literal()
      conditionBasedCollectionScheme.foreach(__v => __obj.updateDynamic("conditionBasedCollectionScheme")(__v.asInstanceOf[js.Any]))
      timeBasedCollectionScheme.foreach(__v => __obj.updateDynamic("timeBasedCollectionScheme")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CollectionScheme]
    }
  }

  /** Information about a collection scheme that uses a simple logical expression to recognize what data to collect.
    */
  @js.native
  trait ConditionBasedCollectionScheme extends js.Object {
    var expression: eventExpression
    var conditionLanguageVersion: js.UndefOr[languageVersion]
    var minimumTriggerIntervalMs: js.UndefOr[uint32]
    var triggerMode: js.UndefOr[TriggerMode]
  }

  object ConditionBasedCollectionScheme {
    @inline
    def apply(
        expression: eventExpression,
        conditionLanguageVersion: js.UndefOr[languageVersion] = js.undefined,
        minimumTriggerIntervalMs: js.UndefOr[uint32] = js.undefined,
        triggerMode: js.UndefOr[TriggerMode] = js.undefined
    ): ConditionBasedCollectionScheme = {
      val __obj = js.Dynamic.literal(
        "expression" -> expression.asInstanceOf[js.Any]
      )

      conditionLanguageVersion.foreach(__v => __obj.updateDynamic("conditionLanguageVersion")(__v.asInstanceOf[js.Any]))
      minimumTriggerIntervalMs.foreach(__v => __obj.updateDynamic("minimumTriggerIntervalMs")(__v.asInstanceOf[js.Any]))
      triggerMode.foreach(__v => __obj.updateDynamic("triggerMode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConditionBasedCollectionScheme]
    }
  }

  @js.native
  trait CreateCampaignRequest extends js.Object {
    var collectionScheme: CollectionScheme
    var name: campaignName
    var signalCatalogArn: arn
    var targetArn: arn
    var compression: js.UndefOr[Compression]
    var dataExtraDimensions: js.UndefOr[DataExtraDimensionNodePathList]
    var description: js.UndefOr[description]
    var diagnosticsMode: js.UndefOr[DiagnosticsMode]
    var expiryTime: js.UndefOr[timestamp]
    var postTriggerCollectionDuration: js.UndefOr[uint32]
    var priority: js.UndefOr[priority]
    var signalsToCollect: js.UndefOr[SignalInformationList]
    var spoolingMode: js.UndefOr[SpoolingMode]
    var startTime: js.UndefOr[timestamp]
    var tags: js.UndefOr[TagList]
  }

  object CreateCampaignRequest {
    @inline
    def apply(
        collectionScheme: CollectionScheme,
        name: campaignName,
        signalCatalogArn: arn,
        targetArn: arn,
        compression: js.UndefOr[Compression] = js.undefined,
        dataExtraDimensions: js.UndefOr[DataExtraDimensionNodePathList] = js.undefined,
        description: js.UndefOr[description] = js.undefined,
        diagnosticsMode: js.UndefOr[DiagnosticsMode] = js.undefined,
        expiryTime: js.UndefOr[timestamp] = js.undefined,
        postTriggerCollectionDuration: js.UndefOr[uint32] = js.undefined,
        priority: js.UndefOr[priority] = js.undefined,
        signalsToCollect: js.UndefOr[SignalInformationList] = js.undefined,
        spoolingMode: js.UndefOr[SpoolingMode] = js.undefined,
        startTime: js.UndefOr[timestamp] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateCampaignRequest = {
      val __obj = js.Dynamic.literal(
        "collectionScheme" -> collectionScheme.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "signalCatalogArn" -> signalCatalogArn.asInstanceOf[js.Any],
        "targetArn" -> targetArn.asInstanceOf[js.Any]
      )

      compression.foreach(__v => __obj.updateDynamic("compression")(__v.asInstanceOf[js.Any]))
      dataExtraDimensions.foreach(__v => __obj.updateDynamic("dataExtraDimensions")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      diagnosticsMode.foreach(__v => __obj.updateDynamic("diagnosticsMode")(__v.asInstanceOf[js.Any]))
      expiryTime.foreach(__v => __obj.updateDynamic("expiryTime")(__v.asInstanceOf[js.Any]))
      postTriggerCollectionDuration.foreach(__v => __obj.updateDynamic("postTriggerCollectionDuration")(__v.asInstanceOf[js.Any]))
      priority.foreach(__v => __obj.updateDynamic("priority")(__v.asInstanceOf[js.Any]))
      signalsToCollect.foreach(__v => __obj.updateDynamic("signalsToCollect")(__v.asInstanceOf[js.Any]))
      spoolingMode.foreach(__v => __obj.updateDynamic("spoolingMode")(__v.asInstanceOf[js.Any]))
      startTime.foreach(__v => __obj.updateDynamic("startTime")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCampaignRequest]
    }
  }

  @js.native
  trait CreateCampaignResponse extends js.Object {
    var arn: js.UndefOr[arn]
    var name: js.UndefOr[campaignName]
  }

  object CreateCampaignResponse {
    @inline
    def apply(
        arn: js.UndefOr[arn] = js.undefined,
        name: js.UndefOr[campaignName] = js.undefined
    ): CreateCampaignResponse = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCampaignResponse]
    }
  }

  @js.native
  trait CreateDecoderManifestRequest extends js.Object {
    var modelManifestArn: arn
    var name: resourceName
    var description: js.UndefOr[description]
    var networkInterfaces: js.UndefOr[NetworkInterfaces]
    var signalDecoders: js.UndefOr[SignalDecoders]
    var tags: js.UndefOr[TagList]
  }

  object CreateDecoderManifestRequest {
    @inline
    def apply(
        modelManifestArn: arn,
        name: resourceName,
        description: js.UndefOr[description] = js.undefined,
        networkInterfaces: js.UndefOr[NetworkInterfaces] = js.undefined,
        signalDecoders: js.UndefOr[SignalDecoders] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateDecoderManifestRequest = {
      val __obj = js.Dynamic.literal(
        "modelManifestArn" -> modelManifestArn.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      networkInterfaces.foreach(__v => __obj.updateDynamic("networkInterfaces")(__v.asInstanceOf[js.Any]))
      signalDecoders.foreach(__v => __obj.updateDynamic("signalDecoders")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDecoderManifestRequest]
    }
  }

  @js.native
  trait CreateDecoderManifestResponse extends js.Object {
    var arn: arn
    var name: resourceName
  }

  object CreateDecoderManifestResponse {
    @inline
    def apply(
        arn: arn,
        name: resourceName
    ): CreateDecoderManifestResponse = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateDecoderManifestResponse]
    }
  }

  @js.native
  trait CreateFleetRequest extends js.Object {
    var fleetId: fleetId
    var signalCatalogArn: arn
    var description: js.UndefOr[description]
    var tags: js.UndefOr[TagList]
  }

  object CreateFleetRequest {
    @inline
    def apply(
        fleetId: fleetId,
        signalCatalogArn: arn,
        description: js.UndefOr[description] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateFleetRequest = {
      val __obj = js.Dynamic.literal(
        "fleetId" -> fleetId.asInstanceOf[js.Any],
        "signalCatalogArn" -> signalCatalogArn.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFleetRequest]
    }
  }

  @js.native
  trait CreateFleetResponse extends js.Object {
    var arn: arn
    var id: fleetId
  }

  object CreateFleetResponse {
    @inline
    def apply(
        arn: arn,
        id: fleetId
    ): CreateFleetResponse = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateFleetResponse]
    }
  }

  @js.native
  trait CreateModelManifestRequest extends js.Object {
    var name: resourceName
    var nodes: listOfStrings
    var signalCatalogArn: arn
    var description: js.UndefOr[description]
    var tags: js.UndefOr[TagList]
  }

  object CreateModelManifestRequest {
    @inline
    def apply(
        name: resourceName,
        nodes: listOfStrings,
        signalCatalogArn: arn,
        description: js.UndefOr[description] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateModelManifestRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "nodes" -> nodes.asInstanceOf[js.Any],
        "signalCatalogArn" -> signalCatalogArn.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateModelManifestRequest]
    }
  }

  @js.native
  trait CreateModelManifestResponse extends js.Object {
    var arn: arn
    var name: resourceName
  }

  object CreateModelManifestResponse {
    @inline
    def apply(
        arn: arn,
        name: resourceName
    ): CreateModelManifestResponse = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateModelManifestResponse]
    }
  }

  @js.native
  trait CreateSignalCatalogRequest extends js.Object {
    var name: resourceName
    var description: js.UndefOr[description]
    var nodes: js.UndefOr[Nodes]
    var tags: js.UndefOr[TagList]
  }

  object CreateSignalCatalogRequest {
    @inline
    def apply(
        name: resourceName,
        description: js.UndefOr[description] = js.undefined,
        nodes: js.UndefOr[Nodes] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateSignalCatalogRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      nodes.foreach(__v => __obj.updateDynamic("nodes")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSignalCatalogRequest]
    }
  }

  @js.native
  trait CreateSignalCatalogResponse extends js.Object {
    var arn: arn
    var name: resourceName
  }

  object CreateSignalCatalogResponse {
    @inline
    def apply(
        arn: arn,
        name: resourceName
    ): CreateSignalCatalogResponse = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateSignalCatalogResponse]
    }
  }

  /** An HTTP error resulting from creating a vehicle.
    */
  @js.native
  trait CreateVehicleError extends js.Object {
    var code: js.UndefOr[String]
    var message: js.UndefOr[String]
    var vehicleName: js.UndefOr[vehicleName]
  }

  object CreateVehicleError {
    @inline
    def apply(
        code: js.UndefOr[String] = js.undefined,
        message: js.UndefOr[String] = js.undefined,
        vehicleName: js.UndefOr[vehicleName] = js.undefined
    ): CreateVehicleError = {
      val __obj = js.Dynamic.literal()
      code.foreach(__v => __obj.updateDynamic("code")(__v.asInstanceOf[js.Any]))
      message.foreach(__v => __obj.updateDynamic("message")(__v.asInstanceOf[js.Any]))
      vehicleName.foreach(__v => __obj.updateDynamic("vehicleName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateVehicleError]
    }
  }

  @js.native
  trait CreateVehicleRequest extends js.Object {
    var decoderManifestArn: arn
    var modelManifestArn: arn
    var vehicleName: vehicleName
    var associationBehavior: js.UndefOr[VehicleAssociationBehavior]
    var attributes: js.UndefOr[attributesMap]
    var tags: js.UndefOr[TagList]
  }

  object CreateVehicleRequest {
    @inline
    def apply(
        decoderManifestArn: arn,
        modelManifestArn: arn,
        vehicleName: vehicleName,
        associationBehavior: js.UndefOr[VehicleAssociationBehavior] = js.undefined,
        attributes: js.UndefOr[attributesMap] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateVehicleRequest = {
      val __obj = js.Dynamic.literal(
        "decoderManifestArn" -> decoderManifestArn.asInstanceOf[js.Any],
        "modelManifestArn" -> modelManifestArn.asInstanceOf[js.Any],
        "vehicleName" -> vehicleName.asInstanceOf[js.Any]
      )

      associationBehavior.foreach(__v => __obj.updateDynamic("associationBehavior")(__v.asInstanceOf[js.Any]))
      attributes.foreach(__v => __obj.updateDynamic("attributes")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateVehicleRequest]
    }
  }

  /** Information about the vehicle to create.
    */
  @js.native
  trait CreateVehicleRequestItem extends js.Object {
    var decoderManifestArn: arn
    var modelManifestArn: arn
    var vehicleName: vehicleName
    var associationBehavior: js.UndefOr[VehicleAssociationBehavior]
    var attributes: js.UndefOr[attributesMap]
    var tags: js.UndefOr[TagList]
  }

  object CreateVehicleRequestItem {
    @inline
    def apply(
        decoderManifestArn: arn,
        modelManifestArn: arn,
        vehicleName: vehicleName,
        associationBehavior: js.UndefOr[VehicleAssociationBehavior] = js.undefined,
        attributes: js.UndefOr[attributesMap] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateVehicleRequestItem = {
      val __obj = js.Dynamic.literal(
        "decoderManifestArn" -> decoderManifestArn.asInstanceOf[js.Any],
        "modelManifestArn" -> modelManifestArn.asInstanceOf[js.Any],
        "vehicleName" -> vehicleName.asInstanceOf[js.Any]
      )

      associationBehavior.foreach(__v => __obj.updateDynamic("associationBehavior")(__v.asInstanceOf[js.Any]))
      attributes.foreach(__v => __obj.updateDynamic("attributes")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateVehicleRequestItem]
    }
  }

  @js.native
  trait CreateVehicleResponse extends js.Object {
    var arn: js.UndefOr[arn]
    var thingArn: js.UndefOr[arn]
    var vehicleName: js.UndefOr[vehicleName]
  }

  object CreateVehicleResponse {
    @inline
    def apply(
        arn: js.UndefOr[arn] = js.undefined,
        thingArn: js.UndefOr[arn] = js.undefined,
        vehicleName: js.UndefOr[vehicleName] = js.undefined
    ): CreateVehicleResponse = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      thingArn.foreach(__v => __obj.updateDynamic("thingArn")(__v.asInstanceOf[js.Any]))
      vehicleName.foreach(__v => __obj.updateDynamic("vehicleName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateVehicleResponse]
    }
  }

  /** Information about a created vehicle.
    */
  @js.native
  trait CreateVehicleResponseItem extends js.Object {
    var arn: js.UndefOr[arn]
    var thingArn: js.UndefOr[arn]
    var vehicleName: js.UndefOr[vehicleName]
  }

  object CreateVehicleResponseItem {
    @inline
    def apply(
        arn: js.UndefOr[arn] = js.undefined,
        thingArn: js.UndefOr[arn] = js.undefined,
        vehicleName: js.UndefOr[vehicleName] = js.undefined
    ): CreateVehicleResponseItem = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      thingArn.foreach(__v => __obj.updateDynamic("thingArn")(__v.asInstanceOf[js.Any]))
      vehicleName.foreach(__v => __obj.updateDynamic("vehicleName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateVehicleResponseItem]
    }
  }

  /** Information about a created decoder manifest. You can use the API operation to return this information about multiple decoder manifests.
    */
  @js.native
  trait DecoderManifestSummary extends js.Object {
    var creationTime: timestamp
    var lastModificationTime: timestamp
    var arn: js.UndefOr[arn]
    var description: js.UndefOr[description]
    var modelManifestArn: js.UndefOr[arn]
    var name: js.UndefOr[String]
    var status: js.UndefOr[ManifestStatus]
  }

  object DecoderManifestSummary {
    @inline
    def apply(
        creationTime: timestamp,
        lastModificationTime: timestamp,
        arn: js.UndefOr[arn] = js.undefined,
        description: js.UndefOr[description] = js.undefined,
        modelManifestArn: js.UndefOr[arn] = js.undefined,
        name: js.UndefOr[String] = js.undefined,
        status: js.UndefOr[ManifestStatus] = js.undefined
    ): DecoderManifestSummary = {
      val __obj = js.Dynamic.literal(
        "creationTime" -> creationTime.asInstanceOf[js.Any],
        "lastModificationTime" -> lastModificationTime.asInstanceOf[js.Any]
      )

      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      modelManifestArn.foreach(__v => __obj.updateDynamic("modelManifestArn")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DecoderManifestSummary]
    }
  }

  @js.native
  trait DeleteCampaignRequest extends js.Object {
    var name: campaignName
  }

  object DeleteCampaignRequest {
    @inline
    def apply(
        name: campaignName
    ): DeleteCampaignRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteCampaignRequest]
    }
  }

  @js.native
  trait DeleteCampaignResponse extends js.Object {
    var arn: js.UndefOr[arn]
    var name: js.UndefOr[campaignName]
  }

  object DeleteCampaignResponse {
    @inline
    def apply(
        arn: js.UndefOr[arn] = js.undefined,
        name: js.UndefOr[campaignName] = js.undefined
    ): DeleteCampaignResponse = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteCampaignResponse]
    }
  }

  @js.native
  trait DeleteDecoderManifestRequest extends js.Object {
    var name: resourceName
  }

  object DeleteDecoderManifestRequest {
    @inline
    def apply(
        name: resourceName
    ): DeleteDecoderManifestRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteDecoderManifestRequest]
    }
  }

  @js.native
  trait DeleteDecoderManifestResponse extends js.Object {
    var arn: arn
    var name: resourceName
  }

  object DeleteDecoderManifestResponse {
    @inline
    def apply(
        arn: arn,
        name: resourceName
    ): DeleteDecoderManifestResponse = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteDecoderManifestResponse]
    }
  }

  @js.native
  trait DeleteFleetRequest extends js.Object {
    var fleetId: fleetId
  }

  object DeleteFleetRequest {
    @inline
    def apply(
        fleetId: fleetId
    ): DeleteFleetRequest = {
      val __obj = js.Dynamic.literal(
        "fleetId" -> fleetId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteFleetRequest]
    }
  }

  @js.native
  trait DeleteFleetResponse extends js.Object {
    var arn: js.UndefOr[arn]
    var id: js.UndefOr[fleetId]
  }

  object DeleteFleetResponse {
    @inline
    def apply(
        arn: js.UndefOr[arn] = js.undefined,
        id: js.UndefOr[fleetId] = js.undefined
    ): DeleteFleetResponse = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteFleetResponse]
    }
  }

  @js.native
  trait DeleteModelManifestRequest extends js.Object {
    var name: resourceName
  }

  object DeleteModelManifestRequest {
    @inline
    def apply(
        name: resourceName
    ): DeleteModelManifestRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteModelManifestRequest]
    }
  }

  @js.native
  trait DeleteModelManifestResponse extends js.Object {
    var arn: arn
    var name: resourceName
  }

  object DeleteModelManifestResponse {
    @inline
    def apply(
        arn: arn,
        name: resourceName
    ): DeleteModelManifestResponse = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteModelManifestResponse]
    }
  }

  @js.native
  trait DeleteSignalCatalogRequest extends js.Object {
    var name: resourceName
  }

  object DeleteSignalCatalogRequest {
    @inline
    def apply(
        name: resourceName
    ): DeleteSignalCatalogRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteSignalCatalogRequest]
    }
  }

  @js.native
  trait DeleteSignalCatalogResponse extends js.Object {
    var arn: arn
    var name: resourceName
  }

  object DeleteSignalCatalogResponse {
    @inline
    def apply(
        arn: arn,
        name: resourceName
    ): DeleteSignalCatalogResponse = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteSignalCatalogResponse]
    }
  }

  @js.native
  trait DeleteVehicleRequest extends js.Object {
    var vehicleName: vehicleName
  }

  object DeleteVehicleRequest {
    @inline
    def apply(
        vehicleName: vehicleName
    ): DeleteVehicleRequest = {
      val __obj = js.Dynamic.literal(
        "vehicleName" -> vehicleName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteVehicleRequest]
    }
  }

  @js.native
  trait DeleteVehicleResponse extends js.Object {
    var arn: arn
    var vehicleName: vehicleName
  }

  object DeleteVehicleResponse {
    @inline
    def apply(
        arn: arn,
        vehicleName: vehicleName
    ): DeleteVehicleResponse = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "vehicleName" -> vehicleName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteVehicleResponse]
    }
  }

  @js.native
  trait DisassociateVehicleFleetRequest extends js.Object {
    var fleetId: fleetId
    var vehicleName: vehicleName
  }

  object DisassociateVehicleFleetRequest {
    @inline
    def apply(
        fleetId: fleetId,
        vehicleName: vehicleName
    ): DisassociateVehicleFleetRequest = {
      val __obj = js.Dynamic.literal(
        "fleetId" -> fleetId.asInstanceOf[js.Any],
        "vehicleName" -> vehicleName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociateVehicleFleetRequest]
    }
  }

  @js.native
  trait DisassociateVehicleFleetResponse extends js.Object

  object DisassociateVehicleFleetResponse {
    @inline
    def apply(): DisassociateVehicleFleetResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisassociateVehicleFleetResponse]
    }
  }

  /** Information about a fleet. You can use the API operation to return this information about multiple fleets.
    */
  @js.native
  trait FleetSummary extends js.Object {
    var arn: arn
    var creationTime: timestamp
    var id: fleetId
    var signalCatalogArn: arn
    var description: js.UndefOr[description]
    var lastModificationTime: js.UndefOr[timestamp]
  }

  object FleetSummary {
    @inline
    def apply(
        arn: arn,
        creationTime: timestamp,
        id: fleetId,
        signalCatalogArn: arn,
        description: js.UndefOr[description] = js.undefined,
        lastModificationTime: js.UndefOr[timestamp] = js.undefined
    ): FleetSummary = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "creationTime" -> creationTime.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "signalCatalogArn" -> signalCatalogArn.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      lastModificationTime.foreach(__v => __obj.updateDynamic("lastModificationTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FleetSummary]
    }
  }

  /** Vehicle Signal Specification (VSS) is a precise language used to describe and model signals in vehicle networks. The JSON file collects signal specificiations in a VSS format.
    */
  @js.native
  trait FormattedVss extends js.Object {
    var vssJson: js.UndefOr[String]
  }

  object FormattedVss {
    @inline
    def apply(
        vssJson: js.UndefOr[String] = js.undefined
    ): FormattedVss = {
      val __obj = js.Dynamic.literal()
      vssJson.foreach(__v => __obj.updateDynamic("vssJson")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FormattedVss]
    }
  }

  @js.native
  trait GetCampaignRequest extends js.Object {
    var name: campaignName
  }

  object GetCampaignRequest {
    @inline
    def apply(
        name: campaignName
    ): GetCampaignRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetCampaignRequest]
    }
  }

  @js.native
  trait GetCampaignResponse extends js.Object {
    var arn: js.UndefOr[arn]
    var collectionScheme: js.UndefOr[CollectionScheme]
    var compression: js.UndefOr[Compression]
    var creationTime: js.UndefOr[timestamp]
    var dataExtraDimensions: js.UndefOr[DataExtraDimensionNodePathList]
    var description: js.UndefOr[description]
    var diagnosticsMode: js.UndefOr[DiagnosticsMode]
    var expiryTime: js.UndefOr[timestamp]
    var lastModificationTime: js.UndefOr[timestamp]
    var name: js.UndefOr[campaignName]
    var postTriggerCollectionDuration: js.UndefOr[uint32]
    var priority: js.UndefOr[priority]
    var signalCatalogArn: js.UndefOr[arn]
    var signalsToCollect: js.UndefOr[SignalInformationList]
    var spoolingMode: js.UndefOr[SpoolingMode]
    var startTime: js.UndefOr[timestamp]
    var status: js.UndefOr[CampaignStatus]
    var targetArn: js.UndefOr[arn]
  }

  object GetCampaignResponse {
    @inline
    def apply(
        arn: js.UndefOr[arn] = js.undefined,
        collectionScheme: js.UndefOr[CollectionScheme] = js.undefined,
        compression: js.UndefOr[Compression] = js.undefined,
        creationTime: js.UndefOr[timestamp] = js.undefined,
        dataExtraDimensions: js.UndefOr[DataExtraDimensionNodePathList] = js.undefined,
        description: js.UndefOr[description] = js.undefined,
        diagnosticsMode: js.UndefOr[DiagnosticsMode] = js.undefined,
        expiryTime: js.UndefOr[timestamp] = js.undefined,
        lastModificationTime: js.UndefOr[timestamp] = js.undefined,
        name: js.UndefOr[campaignName] = js.undefined,
        postTriggerCollectionDuration: js.UndefOr[uint32] = js.undefined,
        priority: js.UndefOr[priority] = js.undefined,
        signalCatalogArn: js.UndefOr[arn] = js.undefined,
        signalsToCollect: js.UndefOr[SignalInformationList] = js.undefined,
        spoolingMode: js.UndefOr[SpoolingMode] = js.undefined,
        startTime: js.UndefOr[timestamp] = js.undefined,
        status: js.UndefOr[CampaignStatus] = js.undefined,
        targetArn: js.UndefOr[arn] = js.undefined
    ): GetCampaignResponse = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      collectionScheme.foreach(__v => __obj.updateDynamic("collectionScheme")(__v.asInstanceOf[js.Any]))
      compression.foreach(__v => __obj.updateDynamic("compression")(__v.asInstanceOf[js.Any]))
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      dataExtraDimensions.foreach(__v => __obj.updateDynamic("dataExtraDimensions")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      diagnosticsMode.foreach(__v => __obj.updateDynamic("diagnosticsMode")(__v.asInstanceOf[js.Any]))
      expiryTime.foreach(__v => __obj.updateDynamic("expiryTime")(__v.asInstanceOf[js.Any]))
      lastModificationTime.foreach(__v => __obj.updateDynamic("lastModificationTime")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      postTriggerCollectionDuration.foreach(__v => __obj.updateDynamic("postTriggerCollectionDuration")(__v.asInstanceOf[js.Any]))
      priority.foreach(__v => __obj.updateDynamic("priority")(__v.asInstanceOf[js.Any]))
      signalCatalogArn.foreach(__v => __obj.updateDynamic("signalCatalogArn")(__v.asInstanceOf[js.Any]))
      signalsToCollect.foreach(__v => __obj.updateDynamic("signalsToCollect")(__v.asInstanceOf[js.Any]))
      spoolingMode.foreach(__v => __obj.updateDynamic("spoolingMode")(__v.asInstanceOf[js.Any]))
      startTime.foreach(__v => __obj.updateDynamic("startTime")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      targetArn.foreach(__v => __obj.updateDynamic("targetArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCampaignResponse]
    }
  }

  @js.native
  trait GetDecoderManifestRequest extends js.Object {
    var name: resourceName
  }

  object GetDecoderManifestRequest {
    @inline
    def apply(
        name: resourceName
    ): GetDecoderManifestRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetDecoderManifestRequest]
    }
  }

  @js.native
  trait GetDecoderManifestResponse extends js.Object {
    var arn: arn
    var creationTime: timestamp
    var lastModificationTime: timestamp
    var name: String
    var description: js.UndefOr[description]
    var modelManifestArn: js.UndefOr[arn]
    var status: js.UndefOr[ManifestStatus]
  }

  object GetDecoderManifestResponse {
    @inline
    def apply(
        arn: arn,
        creationTime: timestamp,
        lastModificationTime: timestamp,
        name: String,
        description: js.UndefOr[description] = js.undefined,
        modelManifestArn: js.UndefOr[arn] = js.undefined,
        status: js.UndefOr[ManifestStatus] = js.undefined
    ): GetDecoderManifestResponse = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "creationTime" -> creationTime.asInstanceOf[js.Any],
        "lastModificationTime" -> lastModificationTime.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      modelManifestArn.foreach(__v => __obj.updateDynamic("modelManifestArn")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDecoderManifestResponse]
    }
  }

  @js.native
  trait GetFleetRequest extends js.Object {
    var fleetId: fleetId
  }

  object GetFleetRequest {
    @inline
    def apply(
        fleetId: fleetId
    ): GetFleetRequest = {
      val __obj = js.Dynamic.literal(
        "fleetId" -> fleetId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetFleetRequest]
    }
  }

  @js.native
  trait GetFleetResponse extends js.Object {
    var arn: arn
    var creationTime: timestamp
    var id: fleetId
    var lastModificationTime: timestamp
    var signalCatalogArn: arn
    var description: js.UndefOr[description]
  }

  object GetFleetResponse {
    @inline
    def apply(
        arn: arn,
        creationTime: timestamp,
        id: fleetId,
        lastModificationTime: timestamp,
        signalCatalogArn: arn,
        description: js.UndefOr[description] = js.undefined
    ): GetFleetResponse = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "creationTime" -> creationTime.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "lastModificationTime" -> lastModificationTime.asInstanceOf[js.Any],
        "signalCatalogArn" -> signalCatalogArn.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFleetResponse]
    }
  }

  @js.native
  trait GetLoggingOptionsRequest extends js.Object

  object GetLoggingOptionsRequest {
    @inline
    def apply(): GetLoggingOptionsRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetLoggingOptionsRequest]
    }
  }

  @js.native
  trait GetLoggingOptionsResponse extends js.Object {
    var cloudWatchLogDelivery: CloudWatchLogDeliveryOptions
  }

  object GetLoggingOptionsResponse {
    @inline
    def apply(
        cloudWatchLogDelivery: CloudWatchLogDeliveryOptions
    ): GetLoggingOptionsResponse = {
      val __obj = js.Dynamic.literal(
        "cloudWatchLogDelivery" -> cloudWatchLogDelivery.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetLoggingOptionsResponse]
    }
  }

  @js.native
  trait GetModelManifestRequest extends js.Object {
    var name: resourceName
  }

  object GetModelManifestRequest {
    @inline
    def apply(
        name: resourceName
    ): GetModelManifestRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetModelManifestRequest]
    }
  }

  @js.native
  trait GetModelManifestResponse extends js.Object {
    var arn: arn
    var creationTime: timestamp
    var lastModificationTime: timestamp
    var name: resourceName
    var description: js.UndefOr[description]
    var signalCatalogArn: js.UndefOr[arn]
    var status: js.UndefOr[ManifestStatus]
  }

  object GetModelManifestResponse {
    @inline
    def apply(
        arn: arn,
        creationTime: timestamp,
        lastModificationTime: timestamp,
        name: resourceName,
        description: js.UndefOr[description] = js.undefined,
        signalCatalogArn: js.UndefOr[arn] = js.undefined,
        status: js.UndefOr[ManifestStatus] = js.undefined
    ): GetModelManifestResponse = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "creationTime" -> creationTime.asInstanceOf[js.Any],
        "lastModificationTime" -> lastModificationTime.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      signalCatalogArn.foreach(__v => __obj.updateDynamic("signalCatalogArn")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetModelManifestResponse]
    }
  }

  @js.native
  trait GetRegisterAccountStatusRequest extends js.Object

  object GetRegisterAccountStatusRequest {
    @inline
    def apply(): GetRegisterAccountStatusRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetRegisterAccountStatusRequest]
    }
  }

  @js.native
  trait GetRegisterAccountStatusResponse extends js.Object {
    var accountStatus: RegistrationStatus
    var creationTime: timestamp
    var customerAccountId: customerAccountId
    var iamRegistrationResponse: IamRegistrationResponse
    var lastModificationTime: timestamp
    var timestreamRegistrationResponse: TimestreamRegistrationResponse
  }

  object GetRegisterAccountStatusResponse {
    @inline
    def apply(
        accountStatus: RegistrationStatus,
        creationTime: timestamp,
        customerAccountId: customerAccountId,
        iamRegistrationResponse: IamRegistrationResponse,
        lastModificationTime: timestamp,
        timestreamRegistrationResponse: TimestreamRegistrationResponse
    ): GetRegisterAccountStatusResponse = {
      val __obj = js.Dynamic.literal(
        "accountStatus" -> accountStatus.asInstanceOf[js.Any],
        "creationTime" -> creationTime.asInstanceOf[js.Any],
        "customerAccountId" -> customerAccountId.asInstanceOf[js.Any],
        "iamRegistrationResponse" -> iamRegistrationResponse.asInstanceOf[js.Any],
        "lastModificationTime" -> lastModificationTime.asInstanceOf[js.Any],
        "timestreamRegistrationResponse" -> timestreamRegistrationResponse.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetRegisterAccountStatusResponse]
    }
  }

  @js.native
  trait GetSignalCatalogRequest extends js.Object {
    var name: resourceName
  }

  object GetSignalCatalogRequest {
    @inline
    def apply(
        name: resourceName
    ): GetSignalCatalogRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetSignalCatalogRequest]
    }
  }

  @js.native
  trait GetSignalCatalogResponse extends js.Object {
    var arn: arn
    var creationTime: timestamp
    var lastModificationTime: timestamp
    var name: resourceName
    var description: js.UndefOr[description]
    var nodeCounts: js.UndefOr[NodeCounts]
  }

  object GetSignalCatalogResponse {
    @inline
    def apply(
        arn: arn,
        creationTime: timestamp,
        lastModificationTime: timestamp,
        name: resourceName,
        description: js.UndefOr[description] = js.undefined,
        nodeCounts: js.UndefOr[NodeCounts] = js.undefined
    ): GetSignalCatalogResponse = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "creationTime" -> creationTime.asInstanceOf[js.Any],
        "lastModificationTime" -> lastModificationTime.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      nodeCounts.foreach(__v => __obj.updateDynamic("nodeCounts")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSignalCatalogResponse]
    }
  }

  @js.native
  trait GetVehicleRequest extends js.Object {
    var vehicleName: vehicleName
  }

  object GetVehicleRequest {
    @inline
    def apply(
        vehicleName: vehicleName
    ): GetVehicleRequest = {
      val __obj = js.Dynamic.literal(
        "vehicleName" -> vehicleName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetVehicleRequest]
    }
  }

  @js.native
  trait GetVehicleResponse extends js.Object {
    var arn: js.UndefOr[arn]
    var attributes: js.UndefOr[attributesMap]
    var creationTime: js.UndefOr[timestamp]
    var decoderManifestArn: js.UndefOr[arn]
    var lastModificationTime: js.UndefOr[timestamp]
    var modelManifestArn: js.UndefOr[arn]
    var vehicleName: js.UndefOr[vehicleName]
  }

  object GetVehicleResponse {
    @inline
    def apply(
        arn: js.UndefOr[arn] = js.undefined,
        attributes: js.UndefOr[attributesMap] = js.undefined,
        creationTime: js.UndefOr[timestamp] = js.undefined,
        decoderManifestArn: js.UndefOr[arn] = js.undefined,
        lastModificationTime: js.UndefOr[timestamp] = js.undefined,
        modelManifestArn: js.UndefOr[arn] = js.undefined,
        vehicleName: js.UndefOr[vehicleName] = js.undefined
    ): GetVehicleResponse = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      attributes.foreach(__v => __obj.updateDynamic("attributes")(__v.asInstanceOf[js.Any]))
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      decoderManifestArn.foreach(__v => __obj.updateDynamic("decoderManifestArn")(__v.asInstanceOf[js.Any]))
      lastModificationTime.foreach(__v => __obj.updateDynamic("lastModificationTime")(__v.asInstanceOf[js.Any]))
      modelManifestArn.foreach(__v => __obj.updateDynamic("modelManifestArn")(__v.asInstanceOf[js.Any]))
      vehicleName.foreach(__v => __obj.updateDynamic("vehicleName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetVehicleResponse]
    }
  }

  @js.native
  trait GetVehicleStatusRequest extends js.Object {
    var vehicleName: vehicleName
    var maxResults: js.UndefOr[maxResults]
    var nextToken: js.UndefOr[nextToken]
  }

  object GetVehicleStatusRequest {
    @inline
    def apply(
        vehicleName: vehicleName,
        maxResults: js.UndefOr[maxResults] = js.undefined,
        nextToken: js.UndefOr[nextToken] = js.undefined
    ): GetVehicleStatusRequest = {
      val __obj = js.Dynamic.literal(
        "vehicleName" -> vehicleName.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetVehicleStatusRequest]
    }
  }

  @js.native
  trait GetVehicleStatusResponse extends js.Object {
    var campaigns: js.UndefOr[VehicleStatusList]
    var nextToken: js.UndefOr[nextToken]
  }

  object GetVehicleStatusResponse {
    @inline
    def apply(
        campaigns: js.UndefOr[VehicleStatusList] = js.undefined,
        nextToken: js.UndefOr[nextToken] = js.undefined
    ): GetVehicleStatusResponse = {
      val __obj = js.Dynamic.literal()
      campaigns.foreach(__v => __obj.updateDynamic("campaigns")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetVehicleStatusResponse]
    }
  }

  /** Information about registering an Identity and Access Management (IAM) resource so Amazon Web Services IoT FleetWise edge agent software can transfer your vehicle data to Amazon Timestream.
    */
  @js.native
  trait IamRegistrationResponse extends js.Object {
    var registrationStatus: RegistrationStatus
    var roleArn: arn
    var errorMessage: js.UndefOr[errorMessage]
  }

  object IamRegistrationResponse {
    @inline
    def apply(
        registrationStatus: RegistrationStatus,
        roleArn: arn,
        errorMessage: js.UndefOr[errorMessage] = js.undefined
    ): IamRegistrationResponse = {
      val __obj = js.Dynamic.literal(
        "registrationStatus" -> registrationStatus.asInstanceOf[js.Any],
        "roleArn" -> roleArn.asInstanceOf[js.Any]
      )

      errorMessage.foreach(__v => __obj.updateDynamic("errorMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IamRegistrationResponse]
    }
  }

  /** The IAM resource that enables Amazon Web Services IoT FleetWise edge agent software to send data to Amazon Timestream. For more information, see [[https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html|IAM roles]] in the <i>Identity and Access Management User Guide</i>.
    */
  @js.native
  trait IamResources extends js.Object {
    var roleArn: IAMRoleArn
  }

  object IamResources {
    @inline
    def apply(
        roleArn: IAMRoleArn
    ): IamResources = {
      val __obj = js.Dynamic.literal(
        "roleArn" -> roleArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[IamResources]
    }
  }

  @js.native
  trait ImportDecoderManifestRequest extends js.Object {
    var name: resourceName
    var networkFileDefinitions: NetworkFileDefinitions
  }

  object ImportDecoderManifestRequest {
    @inline
    def apply(
        name: resourceName,
        networkFileDefinitions: NetworkFileDefinitions
    ): ImportDecoderManifestRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "networkFileDefinitions" -> networkFileDefinitions.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ImportDecoderManifestRequest]
    }
  }

  @js.native
  trait ImportDecoderManifestResponse extends js.Object {
    var arn: arn
    var name: resourceName
  }

  object ImportDecoderManifestResponse {
    @inline
    def apply(
        arn: arn,
        name: resourceName
    ): ImportDecoderManifestResponse = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ImportDecoderManifestResponse]
    }
  }

  @js.native
  trait ImportSignalCatalogRequest extends js.Object {
    var name: resourceName
    var description: js.UndefOr[description]
    var tags: js.UndefOr[TagList]
    var vss: js.UndefOr[FormattedVss]
  }

  object ImportSignalCatalogRequest {
    @inline
    def apply(
        name: resourceName,
        description: js.UndefOr[description] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined,
        vss: js.UndefOr[FormattedVss] = js.undefined
    ): ImportSignalCatalogRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      vss.foreach(__v => __obj.updateDynamic("vss")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportSignalCatalogRequest]
    }
  }

  @js.native
  trait ImportSignalCatalogResponse extends js.Object {
    var arn: arn
    var name: resourceName
  }

  object ImportSignalCatalogResponse {
    @inline
    def apply(
        arn: arn,
        name: resourceName
    ): ImportSignalCatalogResponse = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ImportSignalCatalogResponse]
    }
  }

  @js.native
  trait ListCampaignsRequest extends js.Object {
    var maxResults: js.UndefOr[maxResults]
    var nextToken: js.UndefOr[nextToken]
    var status: js.UndefOr[status]
  }

  object ListCampaignsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[maxResults] = js.undefined,
        nextToken: js.UndefOr[nextToken] = js.undefined,
        status: js.UndefOr[status] = js.undefined
    ): ListCampaignsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCampaignsRequest]
    }
  }

  @js.native
  trait ListCampaignsResponse extends js.Object {
    var campaignSummaries: js.UndefOr[campaignSummaries]
    var nextToken: js.UndefOr[nextToken]
  }

  object ListCampaignsResponse {
    @inline
    def apply(
        campaignSummaries: js.UndefOr[campaignSummaries] = js.undefined,
        nextToken: js.UndefOr[nextToken] = js.undefined
    ): ListCampaignsResponse = {
      val __obj = js.Dynamic.literal()
      campaignSummaries.foreach(__v => __obj.updateDynamic("campaignSummaries")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCampaignsResponse]
    }
  }

  @js.native
  trait ListDecoderManifestNetworkInterfacesRequest extends js.Object {
    var name: resourceName
    var maxResults: js.UndefOr[maxResults]
    var nextToken: js.UndefOr[nextToken]
  }

  object ListDecoderManifestNetworkInterfacesRequest {
    @inline
    def apply(
        name: resourceName,
        maxResults: js.UndefOr[maxResults] = js.undefined,
        nextToken: js.UndefOr[nextToken] = js.undefined
    ): ListDecoderManifestNetworkInterfacesRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDecoderManifestNetworkInterfacesRequest]
    }
  }

  @js.native
  trait ListDecoderManifestNetworkInterfacesResponse extends js.Object {
    var networkInterfaces: js.UndefOr[NetworkInterfaces]
    var nextToken: js.UndefOr[nextToken]
  }

  object ListDecoderManifestNetworkInterfacesResponse {
    @inline
    def apply(
        networkInterfaces: js.UndefOr[NetworkInterfaces] = js.undefined,
        nextToken: js.UndefOr[nextToken] = js.undefined
    ): ListDecoderManifestNetworkInterfacesResponse = {
      val __obj = js.Dynamic.literal()
      networkInterfaces.foreach(__v => __obj.updateDynamic("networkInterfaces")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDecoderManifestNetworkInterfacesResponse]
    }
  }

  @js.native
  trait ListDecoderManifestSignalsRequest extends js.Object {
    var name: resourceName
    var maxResults: js.UndefOr[maxResults]
    var nextToken: js.UndefOr[nextToken]
  }

  object ListDecoderManifestSignalsRequest {
    @inline
    def apply(
        name: resourceName,
        maxResults: js.UndefOr[maxResults] = js.undefined,
        nextToken: js.UndefOr[nextToken] = js.undefined
    ): ListDecoderManifestSignalsRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDecoderManifestSignalsRequest]
    }
  }

  @js.native
  trait ListDecoderManifestSignalsResponse extends js.Object {
    var nextToken: js.UndefOr[nextToken]
    var signalDecoders: js.UndefOr[SignalDecoders]
  }

  object ListDecoderManifestSignalsResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[nextToken] = js.undefined,
        signalDecoders: js.UndefOr[SignalDecoders] = js.undefined
    ): ListDecoderManifestSignalsResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      signalDecoders.foreach(__v => __obj.updateDynamic("signalDecoders")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDecoderManifestSignalsResponse]
    }
  }

  @js.native
  trait ListDecoderManifestsRequest extends js.Object {
    var maxResults: js.UndefOr[maxResults]
    var modelManifestArn: js.UndefOr[arn]
    var nextToken: js.UndefOr[nextToken]
  }

  object ListDecoderManifestsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[maxResults] = js.undefined,
        modelManifestArn: js.UndefOr[arn] = js.undefined,
        nextToken: js.UndefOr[nextToken] = js.undefined
    ): ListDecoderManifestsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      modelManifestArn.foreach(__v => __obj.updateDynamic("modelManifestArn")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDecoderManifestsRequest]
    }
  }

  @js.native
  trait ListDecoderManifestsResponse extends js.Object {
    var nextToken: js.UndefOr[nextToken]
    var summaries: js.UndefOr[decoderManifestSummaries]
  }

  object ListDecoderManifestsResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[nextToken] = js.undefined,
        summaries: js.UndefOr[decoderManifestSummaries] = js.undefined
    ): ListDecoderManifestsResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      summaries.foreach(__v => __obj.updateDynamic("summaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDecoderManifestsResponse]
    }
  }

  @js.native
  trait ListFleetsForVehicleRequest extends js.Object {
    var vehicleName: vehicleName
    var maxResults: js.UndefOr[maxResults]
    var nextToken: js.UndefOr[nextToken]
  }

  object ListFleetsForVehicleRequest {
    @inline
    def apply(
        vehicleName: vehicleName,
        maxResults: js.UndefOr[maxResults] = js.undefined,
        nextToken: js.UndefOr[nextToken] = js.undefined
    ): ListFleetsForVehicleRequest = {
      val __obj = js.Dynamic.literal(
        "vehicleName" -> vehicleName.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFleetsForVehicleRequest]
    }
  }

  @js.native
  trait ListFleetsForVehicleResponse extends js.Object {
    var fleets: js.UndefOr[fleets]
    var nextToken: js.UndefOr[nextToken]
  }

  object ListFleetsForVehicleResponse {
    @inline
    def apply(
        fleets: js.UndefOr[fleets] = js.undefined,
        nextToken: js.UndefOr[nextToken] = js.undefined
    ): ListFleetsForVehicleResponse = {
      val __obj = js.Dynamic.literal()
      fleets.foreach(__v => __obj.updateDynamic("fleets")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFleetsForVehicleResponse]
    }
  }

  @js.native
  trait ListFleetsRequest extends js.Object {
    var maxResults: js.UndefOr[maxResults]
    var nextToken: js.UndefOr[nextToken]
  }

  object ListFleetsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[maxResults] = js.undefined,
        nextToken: js.UndefOr[nextToken] = js.undefined
    ): ListFleetsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFleetsRequest]
    }
  }

  @js.native
  trait ListFleetsResponse extends js.Object {
    var fleetSummaries: js.UndefOr[fleetSummaries]
    var nextToken: js.UndefOr[nextToken]
  }

  object ListFleetsResponse {
    @inline
    def apply(
        fleetSummaries: js.UndefOr[fleetSummaries] = js.undefined,
        nextToken: js.UndefOr[nextToken] = js.undefined
    ): ListFleetsResponse = {
      val __obj = js.Dynamic.literal()
      fleetSummaries.foreach(__v => __obj.updateDynamic("fleetSummaries")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFleetsResponse]
    }
  }

  @js.native
  trait ListModelManifestNodesRequest extends js.Object {
    var name: resourceName
    var maxResults: js.UndefOr[maxResults]
    var nextToken: js.UndefOr[nextToken]
  }

  object ListModelManifestNodesRequest {
    @inline
    def apply(
        name: resourceName,
        maxResults: js.UndefOr[maxResults] = js.undefined,
        nextToken: js.UndefOr[nextToken] = js.undefined
    ): ListModelManifestNodesRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListModelManifestNodesRequest]
    }
  }

  @js.native
  trait ListModelManifestNodesResponse extends js.Object {
    var nextToken: js.UndefOr[nextToken]
    var nodes: js.UndefOr[Nodes]
  }

  object ListModelManifestNodesResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[nextToken] = js.undefined,
        nodes: js.UndefOr[Nodes] = js.undefined
    ): ListModelManifestNodesResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      nodes.foreach(__v => __obj.updateDynamic("nodes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListModelManifestNodesResponse]
    }
  }

  @js.native
  trait ListModelManifestsRequest extends js.Object {
    var maxResults: js.UndefOr[maxResults]
    var nextToken: js.UndefOr[nextToken]
    var signalCatalogArn: js.UndefOr[arn]
  }

  object ListModelManifestsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[maxResults] = js.undefined,
        nextToken: js.UndefOr[nextToken] = js.undefined,
        signalCatalogArn: js.UndefOr[arn] = js.undefined
    ): ListModelManifestsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      signalCatalogArn.foreach(__v => __obj.updateDynamic("signalCatalogArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListModelManifestsRequest]
    }
  }

  @js.native
  trait ListModelManifestsResponse extends js.Object {
    var nextToken: js.UndefOr[nextToken]
    var summaries: js.UndefOr[modelManifestSummaries]
  }

  object ListModelManifestsResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[nextToken] = js.undefined,
        summaries: js.UndefOr[modelManifestSummaries] = js.undefined
    ): ListModelManifestsResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      summaries.foreach(__v => __obj.updateDynamic("summaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListModelManifestsResponse]
    }
  }

  @js.native
  trait ListSignalCatalogNodesRequest extends js.Object {
    var name: resourceName
    var maxResults: js.UndefOr[maxResults]
    var nextToken: js.UndefOr[nextToken]
  }

  object ListSignalCatalogNodesRequest {
    @inline
    def apply(
        name: resourceName,
        maxResults: js.UndefOr[maxResults] = js.undefined,
        nextToken: js.UndefOr[nextToken] = js.undefined
    ): ListSignalCatalogNodesRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSignalCatalogNodesRequest]
    }
  }

  @js.native
  trait ListSignalCatalogNodesResponse extends js.Object {
    var nextToken: js.UndefOr[nextToken]
    var nodes: js.UndefOr[Nodes]
  }

  object ListSignalCatalogNodesResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[nextToken] = js.undefined,
        nodes: js.UndefOr[Nodes] = js.undefined
    ): ListSignalCatalogNodesResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      nodes.foreach(__v => __obj.updateDynamic("nodes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSignalCatalogNodesResponse]
    }
  }

  @js.native
  trait ListSignalCatalogsRequest extends js.Object {
    var maxResults: js.UndefOr[maxResults]
    var nextToken: js.UndefOr[nextToken]
  }

  object ListSignalCatalogsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[maxResults] = js.undefined,
        nextToken: js.UndefOr[nextToken] = js.undefined
    ): ListSignalCatalogsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSignalCatalogsRequest]
    }
  }

  @js.native
  trait ListSignalCatalogsResponse extends js.Object {
    var nextToken: js.UndefOr[nextToken]
    var summaries: js.UndefOr[signalCatalogSummaries]
  }

  object ListSignalCatalogsResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[nextToken] = js.undefined,
        summaries: js.UndefOr[signalCatalogSummaries] = js.undefined
    ): ListSignalCatalogsResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      summaries.foreach(__v => __obj.updateDynamic("summaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSignalCatalogsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceARN: AmazonResourceName
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceARN: AmazonResourceName
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[TagList]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        Tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  @js.native
  trait ListVehiclesInFleetRequest extends js.Object {
    var fleetId: fleetId
    var maxResults: js.UndefOr[maxResults]
    var nextToken: js.UndefOr[nextToken]
  }

  object ListVehiclesInFleetRequest {
    @inline
    def apply(
        fleetId: fleetId,
        maxResults: js.UndefOr[maxResults] = js.undefined,
        nextToken: js.UndefOr[nextToken] = js.undefined
    ): ListVehiclesInFleetRequest = {
      val __obj = js.Dynamic.literal(
        "fleetId" -> fleetId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVehiclesInFleetRequest]
    }
  }

  @js.native
  trait ListVehiclesInFleetResponse extends js.Object {
    var nextToken: js.UndefOr[nextToken]
    var vehicles: js.UndefOr[vehicles]
  }

  object ListVehiclesInFleetResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[nextToken] = js.undefined,
        vehicles: js.UndefOr[vehicles] = js.undefined
    ): ListVehiclesInFleetResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      vehicles.foreach(__v => __obj.updateDynamic("vehicles")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVehiclesInFleetResponse]
    }
  }

  @js.native
  trait ListVehiclesRequest extends js.Object {
    var maxResults: js.UndefOr[listVehiclesMaxResults]
    var modelManifestArn: js.UndefOr[arn]
    var nextToken: js.UndefOr[nextToken]
  }

  object ListVehiclesRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[listVehiclesMaxResults] = js.undefined,
        modelManifestArn: js.UndefOr[arn] = js.undefined,
        nextToken: js.UndefOr[nextToken] = js.undefined
    ): ListVehiclesRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      modelManifestArn.foreach(__v => __obj.updateDynamic("modelManifestArn")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVehiclesRequest]
    }
  }

  @js.native
  trait ListVehiclesResponse extends js.Object {
    var nextToken: js.UndefOr[nextToken]
    var vehicleSummaries: js.UndefOr[vehicleSummaries]
  }

  object ListVehiclesResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[nextToken] = js.undefined,
        vehicleSummaries: js.UndefOr[vehicleSummaries] = js.undefined
    ): ListVehiclesResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      vehicleSummaries.foreach(__v => __obj.updateDynamic("vehicleSummaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVehiclesResponse]
    }
  }

  /** Information about a vehicle model (model manifest). You can use the API operation to return this information about multiple vehicle models.
    */
  @js.native
  trait ModelManifestSummary extends js.Object {
    var creationTime: timestamp
    var lastModificationTime: timestamp
    var arn: js.UndefOr[arn]
    var description: js.UndefOr[description]
    var name: js.UndefOr[String]
    var signalCatalogArn: js.UndefOr[arn]
    var status: js.UndefOr[ManifestStatus]
  }

  object ModelManifestSummary {
    @inline
    def apply(
        creationTime: timestamp,
        lastModificationTime: timestamp,
        arn: js.UndefOr[arn] = js.undefined,
        description: js.UndefOr[description] = js.undefined,
        name: js.UndefOr[String] = js.undefined,
        signalCatalogArn: js.UndefOr[arn] = js.undefined,
        status: js.UndefOr[ManifestStatus] = js.undefined
    ): ModelManifestSummary = {
      val __obj = js.Dynamic.literal(
        "creationTime" -> creationTime.asInstanceOf[js.Any],
        "lastModificationTime" -> lastModificationTime.asInstanceOf[js.Any]
      )

      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      signalCatalogArn.foreach(__v => __obj.updateDynamic("signalCatalogArn")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModelManifestSummary]
    }
  }

  /** Specifications for defining a vehicle network.
    */
  @js.native
  trait NetworkFileDefinition extends js.Object {
    var canDbc: js.UndefOr[CanDbcDefinition]
  }

  object NetworkFileDefinition {
    @inline
    def apply(
        canDbc: js.UndefOr[CanDbcDefinition] = js.undefined
    ): NetworkFileDefinition = {
      val __obj = js.Dynamic.literal()
      canDbc.foreach(__v => __obj.updateDynamic("canDbc")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkFileDefinition]
    }
  }

  /** Represents a node and its specifications in an in-vehicle communication network. All signal decoders must be associated with a network node. To return this information about all the network interfaces specified in a decoder manifest, use the API operation.
    */
  @js.native
  trait NetworkInterface extends js.Object {
    var interfaceId: InterfaceId
    var `type`: NetworkInterfaceType
    var canInterface: js.UndefOr[CanInterface]
    var obdInterface: js.UndefOr[ObdInterface]
  }

  object NetworkInterface {
    @inline
    def apply(
        interfaceId: InterfaceId,
        `type`: NetworkInterfaceType,
        canInterface: js.UndefOr[CanInterface] = js.undefined,
        obdInterface: js.UndefOr[ObdInterface] = js.undefined
    ): NetworkInterface = {
      val __obj = js.Dynamic.literal(
        "interfaceId" -> interfaceId.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )

      canInterface.foreach(__v => __obj.updateDynamic("canInterface")(__v.asInstanceOf[js.Any]))
      obdInterface.foreach(__v => __obj.updateDynamic("obdInterface")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkInterface]
    }
  }

  /** A general abstraction of a signal. A node can be specified as an actuator, attribute, branch, or sensor.
    */
  @js.native
  trait Node extends js.Object {
    var actuator: js.UndefOr[Actuator]
    var attribute: js.UndefOr[Attribute]
    var branch: js.UndefOr[Branch]
    var sensor: js.UndefOr[Sensor]
  }

  object Node {
    @inline
    def apply(
        actuator: js.UndefOr[Actuator] = js.undefined,
        attribute: js.UndefOr[Attribute] = js.undefined,
        branch: js.UndefOr[Branch] = js.undefined,
        sensor: js.UndefOr[Sensor] = js.undefined
    ): Node = {
      val __obj = js.Dynamic.literal()
      actuator.foreach(__v => __obj.updateDynamic("actuator")(__v.asInstanceOf[js.Any]))
      attribute.foreach(__v => __obj.updateDynamic("attribute")(__v.asInstanceOf[js.Any]))
      branch.foreach(__v => __obj.updateDynamic("branch")(__v.asInstanceOf[js.Any]))
      sensor.foreach(__v => __obj.updateDynamic("sensor")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Node]
    }
  }

  /** Information about the number of nodes and node types in a vehicle network.
    */
  @js.native
  trait NodeCounts extends js.Object {
    var totalActuators: js.UndefOr[number]
    var totalAttributes: js.UndefOr[number]
    var totalBranches: js.UndefOr[number]
    var totalNodes: js.UndefOr[number]
    var totalSensors: js.UndefOr[number]
  }

  object NodeCounts {
    @inline
    def apply(
        totalActuators: js.UndefOr[number] = js.undefined,
        totalAttributes: js.UndefOr[number] = js.undefined,
        totalBranches: js.UndefOr[number] = js.undefined,
        totalNodes: js.UndefOr[number] = js.undefined,
        totalSensors: js.UndefOr[number] = js.undefined
    ): NodeCounts = {
      val __obj = js.Dynamic.literal()
      totalActuators.foreach(__v => __obj.updateDynamic("totalActuators")(__v.asInstanceOf[js.Any]))
      totalAttributes.foreach(__v => __obj.updateDynamic("totalAttributes")(__v.asInstanceOf[js.Any]))
      totalBranches.foreach(__v => __obj.updateDynamic("totalBranches")(__v.asInstanceOf[js.Any]))
      totalNodes.foreach(__v => __obj.updateDynamic("totalNodes")(__v.asInstanceOf[js.Any]))
      totalSensors.foreach(__v => __obj.updateDynamic("totalSensors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NodeCounts]
    }
  }

  /** A network interface that specifies the On-board diagnostic (OBD) II network protocol.
    */
  @js.native
  trait ObdInterface extends js.Object {
    var name: ObdInterfaceName
    var requestMessageId: nonNegativeInteger
    var dtcRequestIntervalSeconds: js.UndefOr[nonNegativeInteger]
    var hasTransmissionEcu: js.UndefOr[Boolean]
    var obdStandard: js.UndefOr[ObdStandard]
    var pidRequestIntervalSeconds: js.UndefOr[nonNegativeInteger]
    var useExtendedIds: js.UndefOr[Boolean]
  }

  object ObdInterface {
    @inline
    def apply(
        name: ObdInterfaceName,
        requestMessageId: nonNegativeInteger,
        dtcRequestIntervalSeconds: js.UndefOr[nonNegativeInteger] = js.undefined,
        hasTransmissionEcu: js.UndefOr[Boolean] = js.undefined,
        obdStandard: js.UndefOr[ObdStandard] = js.undefined,
        pidRequestIntervalSeconds: js.UndefOr[nonNegativeInteger] = js.undefined,
        useExtendedIds: js.UndefOr[Boolean] = js.undefined
    ): ObdInterface = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "requestMessageId" -> requestMessageId.asInstanceOf[js.Any]
      )

      dtcRequestIntervalSeconds.foreach(__v => __obj.updateDynamic("dtcRequestIntervalSeconds")(__v.asInstanceOf[js.Any]))
      hasTransmissionEcu.foreach(__v => __obj.updateDynamic("hasTransmissionEcu")(__v.asInstanceOf[js.Any]))
      obdStandard.foreach(__v => __obj.updateDynamic("obdStandard")(__v.asInstanceOf[js.Any]))
      pidRequestIntervalSeconds.foreach(__v => __obj.updateDynamic("pidRequestIntervalSeconds")(__v.asInstanceOf[js.Any]))
      useExtendedIds.foreach(__v => __obj.updateDynamic("useExtendedIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ObdInterface]
    }
  }

  /** Information about signal messages using the on-board diagnostics (OBD) II protocol in a vehicle.
    */
  @js.native
  trait ObdSignal extends js.Object {
    var byteLength: ObdByteLength
    var offset: double
    var pid: nonNegativeInteger
    var pidResponseLength: positiveInteger
    var scaling: double
    var serviceMode: nonNegativeInteger
    var startByte: nonNegativeInteger
    var bitMaskLength: js.UndefOr[ObdBitmaskLength]
    var bitRightShift: js.UndefOr[nonNegativeInteger]
  }

  object ObdSignal {
    @inline
    def apply(
        byteLength: ObdByteLength,
        offset: double,
        pid: nonNegativeInteger,
        pidResponseLength: positiveInteger,
        scaling: double,
        serviceMode: nonNegativeInteger,
        startByte: nonNegativeInteger,
        bitMaskLength: js.UndefOr[ObdBitmaskLength] = js.undefined,
        bitRightShift: js.UndefOr[nonNegativeInteger] = js.undefined
    ): ObdSignal = {
      val __obj = js.Dynamic.literal(
        "byteLength" -> byteLength.asInstanceOf[js.Any],
        "offset" -> offset.asInstanceOf[js.Any],
        "pid" -> pid.asInstanceOf[js.Any],
        "pidResponseLength" -> pidResponseLength.asInstanceOf[js.Any],
        "scaling" -> scaling.asInstanceOf[js.Any],
        "serviceMode" -> serviceMode.asInstanceOf[js.Any],
        "startByte" -> startByte.asInstanceOf[js.Any]
      )

      bitMaskLength.foreach(__v => __obj.updateDynamic("bitMaskLength")(__v.asInstanceOf[js.Any]))
      bitRightShift.foreach(__v => __obj.updateDynamic("bitRightShift")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ObdSignal]
    }
  }

  @js.native
  trait PutLoggingOptionsRequest extends js.Object {
    var cloudWatchLogDelivery: CloudWatchLogDeliveryOptions
  }

  object PutLoggingOptionsRequest {
    @inline
    def apply(
        cloudWatchLogDelivery: CloudWatchLogDeliveryOptions
    ): PutLoggingOptionsRequest = {
      val __obj = js.Dynamic.literal(
        "cloudWatchLogDelivery" -> cloudWatchLogDelivery.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutLoggingOptionsRequest]
    }
  }

  @js.native
  trait PutLoggingOptionsResponse extends js.Object

  object PutLoggingOptionsResponse {
    @inline
    def apply(): PutLoggingOptionsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutLoggingOptionsResponse]
    }
  }

  @js.native
  trait RegisterAccountRequest extends js.Object {
    var timestreamResources: TimestreamResources
    var iamResources: js.UndefOr[IamResources]
  }

  object RegisterAccountRequest {
    @inline
    def apply(
        timestreamResources: TimestreamResources,
        iamResources: js.UndefOr[IamResources] = js.undefined
    ): RegisterAccountRequest = {
      val __obj = js.Dynamic.literal(
        "timestreamResources" -> timestreamResources.asInstanceOf[js.Any]
      )

      iamResources.foreach(__v => __obj.updateDynamic("iamResources")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterAccountRequest]
    }
  }

  @js.native
  trait RegisterAccountResponse extends js.Object {
    var creationTime: timestamp
    var iamResources: IamResources
    var lastModificationTime: timestamp
    var registerAccountStatus: RegistrationStatus
    var timestreamResources: TimestreamResources
  }

  object RegisterAccountResponse {
    @inline
    def apply(
        creationTime: timestamp,
        iamResources: IamResources,
        lastModificationTime: timestamp,
        registerAccountStatus: RegistrationStatus,
        timestreamResources: TimestreamResources
    ): RegisterAccountResponse = {
      val __obj = js.Dynamic.literal(
        "creationTime" -> creationTime.asInstanceOf[js.Any],
        "iamResources" -> iamResources.asInstanceOf[js.Any],
        "lastModificationTime" -> lastModificationTime.asInstanceOf[js.Any],
        "registerAccountStatus" -> registerAccountStatus.asInstanceOf[js.Any],
        "timestreamResources" -> timestreamResources.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RegisterAccountResponse]
    }
  }

  /** An input component that reports the environmental condition of a vehicle.
    *
    * '''Note:'''You can collect data about fluid levels, temperatures, vibrations, or battery voltage from sensors.
    */
  @js.native
  trait Sensor extends js.Object {
    var dataType: NodeDataType
    var fullyQualifiedName: String
    var allowedValues: js.UndefOr[listOfStrings]
    var description: js.UndefOr[description]
    var max: js.UndefOr[double]
    var min: js.UndefOr[double]
    var unit: js.UndefOr[String]
  }

  object Sensor {
    @inline
    def apply(
        dataType: NodeDataType,
        fullyQualifiedName: String,
        allowedValues: js.UndefOr[listOfStrings] = js.undefined,
        description: js.UndefOr[description] = js.undefined,
        max: js.UndefOr[double] = js.undefined,
        min: js.UndefOr[double] = js.undefined,
        unit: js.UndefOr[String] = js.undefined
    ): Sensor = {
      val __obj = js.Dynamic.literal(
        "dataType" -> dataType.asInstanceOf[js.Any],
        "fullyQualifiedName" -> fullyQualifiedName.asInstanceOf[js.Any]
      )

      allowedValues.foreach(__v => __obj.updateDynamic("allowedValues")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      max.foreach(__v => __obj.updateDynamic("max")(__v.asInstanceOf[js.Any]))
      min.foreach(__v => __obj.updateDynamic("min")(__v.asInstanceOf[js.Any]))
      unit.foreach(__v => __obj.updateDynamic("unit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Sensor]
    }
  }

  /** Information about a collection of standardized signals, which can be attributes, branches, sensors, or actuators.
    */
  @js.native
  trait SignalCatalogSummary extends js.Object {
    var arn: js.UndefOr[arn]
    var creationTime: js.UndefOr[timestamp]
    var lastModificationTime: js.UndefOr[timestamp]
    var name: js.UndefOr[String]
  }

  object SignalCatalogSummary {
    @inline
    def apply(
        arn: js.UndefOr[arn] = js.undefined,
        creationTime: js.UndefOr[timestamp] = js.undefined,
        lastModificationTime: js.UndefOr[timestamp] = js.undefined,
        name: js.UndefOr[String] = js.undefined
    ): SignalCatalogSummary = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      lastModificationTime.foreach(__v => __obj.updateDynamic("lastModificationTime")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SignalCatalogSummary]
    }
  }

  /** Information about a signal decoder.
    */
  @js.native
  trait SignalDecoder extends js.Object {
    var fullyQualifiedName: FullyQualifiedName
    var interfaceId: InterfaceId
    var `type`: SignalDecoderType
    var canSignal: js.UndefOr[CanSignal]
    var obdSignal: js.UndefOr[ObdSignal]
  }

  object SignalDecoder {
    @inline
    def apply(
        fullyQualifiedName: FullyQualifiedName,
        interfaceId: InterfaceId,
        `type`: SignalDecoderType,
        canSignal: js.UndefOr[CanSignal] = js.undefined,
        obdSignal: js.UndefOr[ObdSignal] = js.undefined
    ): SignalDecoder = {
      val __obj = js.Dynamic.literal(
        "fullyQualifiedName" -> fullyQualifiedName.asInstanceOf[js.Any],
        "interfaceId" -> interfaceId.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )

      canSignal.foreach(__v => __obj.updateDynamic("canSignal")(__v.asInstanceOf[js.Any]))
      obdSignal.foreach(__v => __obj.updateDynamic("obdSignal")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SignalDecoder]
    }
  }

  /** Information about a signal.
    */
  @js.native
  trait SignalInformation extends js.Object {
    var name: wildcardSignalName
    var maxSampleCount: js.UndefOr[maxSampleCount]
    var minimumSamplingIntervalMs: js.UndefOr[uint32]
  }

  object SignalInformation {
    @inline
    def apply(
        name: wildcardSignalName,
        maxSampleCount: js.UndefOr[maxSampleCount] = js.undefined,
        minimumSamplingIntervalMs: js.UndefOr[uint32] = js.undefined
    ): SignalInformation = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      maxSampleCount.foreach(__v => __obj.updateDynamic("maxSampleCount")(__v.asInstanceOf[js.Any]))
      minimumSamplingIntervalMs.foreach(__v => __obj.updateDynamic("minimumSamplingIntervalMs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SignalInformation]
    }
  }

  /** A set of key/value pairs that are used to manage the resource.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  object Tag {
    @inline
    def apply(
        Key: TagKey,
        Value: TagValue
    ): Tag = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceARN: AmazonResourceName
    var Tags: TagList
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceARN: AmazonResourceName,
        Tags: TagList
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
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

  /** Information about a collection scheme that uses a time period to decide how often to collect data.
    */
  @js.native
  trait TimeBasedCollectionScheme extends js.Object {
    var periodMs: collectionPeriodMs
  }

  object TimeBasedCollectionScheme {
    @inline
    def apply(
        periodMs: collectionPeriodMs
    ): TimeBasedCollectionScheme = {
      val __obj = js.Dynamic.literal(
        "periodMs" -> periodMs.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TimeBasedCollectionScheme]
    }
  }

  /** Information about the registered Amazon Timestream resources or errors, if any.
    */
  @js.native
  trait TimestreamRegistrationResponse extends js.Object {
    var registrationStatus: RegistrationStatus
    var timestreamDatabaseName: TimestreamDatabaseName
    var timestreamTableName: TimestreamTableName
    var errorMessage: js.UndefOr[errorMessage]
    var timestreamDatabaseArn: js.UndefOr[arn]
    var timestreamTableArn: js.UndefOr[arn]
  }

  object TimestreamRegistrationResponse {
    @inline
    def apply(
        registrationStatus: RegistrationStatus,
        timestreamDatabaseName: TimestreamDatabaseName,
        timestreamTableName: TimestreamTableName,
        errorMessage: js.UndefOr[errorMessage] = js.undefined,
        timestreamDatabaseArn: js.UndefOr[arn] = js.undefined,
        timestreamTableArn: js.UndefOr[arn] = js.undefined
    ): TimestreamRegistrationResponse = {
      val __obj = js.Dynamic.literal(
        "registrationStatus" -> registrationStatus.asInstanceOf[js.Any],
        "timestreamDatabaseName" -> timestreamDatabaseName.asInstanceOf[js.Any],
        "timestreamTableName" -> timestreamTableName.asInstanceOf[js.Any]
      )

      errorMessage.foreach(__v => __obj.updateDynamic("errorMessage")(__v.asInstanceOf[js.Any]))
      timestreamDatabaseArn.foreach(__v => __obj.updateDynamic("timestreamDatabaseArn")(__v.asInstanceOf[js.Any]))
      timestreamTableArn.foreach(__v => __obj.updateDynamic("timestreamTableArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TimestreamRegistrationResponse]
    }
  }

  /** The registered Amazon Timestream resources that Amazon Web Services IoT FleetWise edge agent software can transfer your vehicle data to.
    */
  @js.native
  trait TimestreamResources extends js.Object {
    var timestreamDatabaseName: TimestreamDatabaseName
    var timestreamTableName: TimestreamTableName
  }

  object TimestreamResources {
    @inline
    def apply(
        timestreamDatabaseName: TimestreamDatabaseName,
        timestreamTableName: TimestreamTableName
    ): TimestreamResources = {
      val __obj = js.Dynamic.literal(
        "timestreamDatabaseName" -> timestreamDatabaseName.asInstanceOf[js.Any],
        "timestreamTableName" -> timestreamTableName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TimestreamResources]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceARN: AmazonResourceName
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceARN: AmazonResourceName,
        TagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
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
  trait UpdateCampaignRequest extends js.Object {
    var action: UpdateCampaignAction
    var name: campaignName
    var dataExtraDimensions: js.UndefOr[DataExtraDimensionNodePathList]
    var description: js.UndefOr[description]
  }

  object UpdateCampaignRequest {
    @inline
    def apply(
        action: UpdateCampaignAction,
        name: campaignName,
        dataExtraDimensions: js.UndefOr[DataExtraDimensionNodePathList] = js.undefined,
        description: js.UndefOr[description] = js.undefined
    ): UpdateCampaignRequest = {
      val __obj = js.Dynamic.literal(
        "action" -> action.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )

      dataExtraDimensions.foreach(__v => __obj.updateDynamic("dataExtraDimensions")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateCampaignRequest]
    }
  }

  @js.native
  trait UpdateCampaignResponse extends js.Object {
    var arn: js.UndefOr[arn]
    var name: js.UndefOr[campaignName]
    var status: js.UndefOr[CampaignStatus]
  }

  object UpdateCampaignResponse {
    @inline
    def apply(
        arn: js.UndefOr[arn] = js.undefined,
        name: js.UndefOr[campaignName] = js.undefined,
        status: js.UndefOr[CampaignStatus] = js.undefined
    ): UpdateCampaignResponse = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateCampaignResponse]
    }
  }

  @js.native
  trait UpdateDecoderManifestRequest extends js.Object {
    var name: resourceName
    var description: js.UndefOr[description]
    var networkInterfacesToAdd: js.UndefOr[NetworkInterfaces]
    var networkInterfacesToRemove: js.UndefOr[InterfaceIds]
    var networkInterfacesToUpdate: js.UndefOr[NetworkInterfaces]
    var signalDecodersToAdd: js.UndefOr[SignalDecoders]
    var signalDecodersToRemove: js.UndefOr[Fqns]
    var signalDecodersToUpdate: js.UndefOr[SignalDecoders]
    var status: js.UndefOr[ManifestStatus]
  }

  object UpdateDecoderManifestRequest {
    @inline
    def apply(
        name: resourceName,
        description: js.UndefOr[description] = js.undefined,
        networkInterfacesToAdd: js.UndefOr[NetworkInterfaces] = js.undefined,
        networkInterfacesToRemove: js.UndefOr[InterfaceIds] = js.undefined,
        networkInterfacesToUpdate: js.UndefOr[NetworkInterfaces] = js.undefined,
        signalDecodersToAdd: js.UndefOr[SignalDecoders] = js.undefined,
        signalDecodersToRemove: js.UndefOr[Fqns] = js.undefined,
        signalDecodersToUpdate: js.UndefOr[SignalDecoders] = js.undefined,
        status: js.UndefOr[ManifestStatus] = js.undefined
    ): UpdateDecoderManifestRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      networkInterfacesToAdd.foreach(__v => __obj.updateDynamic("networkInterfacesToAdd")(__v.asInstanceOf[js.Any]))
      networkInterfacesToRemove.foreach(__v => __obj.updateDynamic("networkInterfacesToRemove")(__v.asInstanceOf[js.Any]))
      networkInterfacesToUpdate.foreach(__v => __obj.updateDynamic("networkInterfacesToUpdate")(__v.asInstanceOf[js.Any]))
      signalDecodersToAdd.foreach(__v => __obj.updateDynamic("signalDecodersToAdd")(__v.asInstanceOf[js.Any]))
      signalDecodersToRemove.foreach(__v => __obj.updateDynamic("signalDecodersToRemove")(__v.asInstanceOf[js.Any]))
      signalDecodersToUpdate.foreach(__v => __obj.updateDynamic("signalDecodersToUpdate")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDecoderManifestRequest]
    }
  }

  @js.native
  trait UpdateDecoderManifestResponse extends js.Object {
    var arn: arn
    var name: resourceName
  }

  object UpdateDecoderManifestResponse {
    @inline
    def apply(
        arn: arn,
        name: resourceName
    ): UpdateDecoderManifestResponse = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateDecoderManifestResponse]
    }
  }

  @js.native
  trait UpdateFleetRequest extends js.Object {
    var fleetId: fleetId
    var description: js.UndefOr[description]
  }

  object UpdateFleetRequest {
    @inline
    def apply(
        fleetId: fleetId,
        description: js.UndefOr[description] = js.undefined
    ): UpdateFleetRequest = {
      val __obj = js.Dynamic.literal(
        "fleetId" -> fleetId.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFleetRequest]
    }
  }

  @js.native
  trait UpdateFleetResponse extends js.Object {
    var arn: js.UndefOr[arn]
    var id: js.UndefOr[fleetId]
  }

  object UpdateFleetResponse {
    @inline
    def apply(
        arn: js.UndefOr[arn] = js.undefined,
        id: js.UndefOr[fleetId] = js.undefined
    ): UpdateFleetResponse = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFleetResponse]
    }
  }

  @js.native
  trait UpdateModelManifestRequest extends js.Object {
    var name: resourceName
    var description: js.UndefOr[description]
    var nodesToAdd: js.UndefOr[NodePaths]
    var nodesToRemove: js.UndefOr[NodePaths]
    var status: js.UndefOr[ManifestStatus]
  }

  object UpdateModelManifestRequest {
    @inline
    def apply(
        name: resourceName,
        description: js.UndefOr[description] = js.undefined,
        nodesToAdd: js.UndefOr[NodePaths] = js.undefined,
        nodesToRemove: js.UndefOr[NodePaths] = js.undefined,
        status: js.UndefOr[ManifestStatus] = js.undefined
    ): UpdateModelManifestRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      nodesToAdd.foreach(__v => __obj.updateDynamic("nodesToAdd")(__v.asInstanceOf[js.Any]))
      nodesToRemove.foreach(__v => __obj.updateDynamic("nodesToRemove")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateModelManifestRequest]
    }
  }

  @js.native
  trait UpdateModelManifestResponse extends js.Object {
    var arn: arn
    var name: resourceName
  }

  object UpdateModelManifestResponse {
    @inline
    def apply(
        arn: arn,
        name: resourceName
    ): UpdateModelManifestResponse = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateModelManifestResponse]
    }
  }

  @js.native
  trait UpdateSignalCatalogRequest extends js.Object {
    var name: resourceName
    var description: js.UndefOr[description]
    var nodesToAdd: js.UndefOr[Nodes]
    var nodesToRemove: js.UndefOr[NodePaths]
    var nodesToUpdate: js.UndefOr[Nodes]
  }

  object UpdateSignalCatalogRequest {
    @inline
    def apply(
        name: resourceName,
        description: js.UndefOr[description] = js.undefined,
        nodesToAdd: js.UndefOr[Nodes] = js.undefined,
        nodesToRemove: js.UndefOr[NodePaths] = js.undefined,
        nodesToUpdate: js.UndefOr[Nodes] = js.undefined
    ): UpdateSignalCatalogRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      nodesToAdd.foreach(__v => __obj.updateDynamic("nodesToAdd")(__v.asInstanceOf[js.Any]))
      nodesToRemove.foreach(__v => __obj.updateDynamic("nodesToRemove")(__v.asInstanceOf[js.Any]))
      nodesToUpdate.foreach(__v => __obj.updateDynamic("nodesToUpdate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSignalCatalogRequest]
    }
  }

  @js.native
  trait UpdateSignalCatalogResponse extends js.Object {
    var arn: arn
    var name: resourceName
  }

  object UpdateSignalCatalogResponse {
    @inline
    def apply(
        arn: arn,
        name: resourceName
    ): UpdateSignalCatalogResponse = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateSignalCatalogResponse]
    }
  }

  /** An HTTP error resulting from updating the description for a vehicle.
    */
  @js.native
  trait UpdateVehicleError extends js.Object {
    var code: js.UndefOr[number]
    var message: js.UndefOr[String]
    var vehicleName: js.UndefOr[vehicleName]
  }

  object UpdateVehicleError {
    @inline
    def apply(
        code: js.UndefOr[number] = js.undefined,
        message: js.UndefOr[String] = js.undefined,
        vehicleName: js.UndefOr[vehicleName] = js.undefined
    ): UpdateVehicleError = {
      val __obj = js.Dynamic.literal()
      code.foreach(__v => __obj.updateDynamic("code")(__v.asInstanceOf[js.Any]))
      message.foreach(__v => __obj.updateDynamic("message")(__v.asInstanceOf[js.Any]))
      vehicleName.foreach(__v => __obj.updateDynamic("vehicleName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateVehicleError]
    }
  }

  @js.native
  trait UpdateVehicleRequest extends js.Object {
    var vehicleName: vehicleName
    var attributeUpdateMode: js.UndefOr[UpdateMode]
    var attributes: js.UndefOr[attributesMap]
    var decoderManifestArn: js.UndefOr[arn]
    var modelManifestArn: js.UndefOr[arn]
  }

  object UpdateVehicleRequest {
    @inline
    def apply(
        vehicleName: vehicleName,
        attributeUpdateMode: js.UndefOr[UpdateMode] = js.undefined,
        attributes: js.UndefOr[attributesMap] = js.undefined,
        decoderManifestArn: js.UndefOr[arn] = js.undefined,
        modelManifestArn: js.UndefOr[arn] = js.undefined
    ): UpdateVehicleRequest = {
      val __obj = js.Dynamic.literal(
        "vehicleName" -> vehicleName.asInstanceOf[js.Any]
      )

      attributeUpdateMode.foreach(__v => __obj.updateDynamic("attributeUpdateMode")(__v.asInstanceOf[js.Any]))
      attributes.foreach(__v => __obj.updateDynamic("attributes")(__v.asInstanceOf[js.Any]))
      decoderManifestArn.foreach(__v => __obj.updateDynamic("decoderManifestArn")(__v.asInstanceOf[js.Any]))
      modelManifestArn.foreach(__v => __obj.updateDynamic("modelManifestArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateVehicleRequest]
    }
  }

  /** Information about the vehicle to update.
    */
  @js.native
  trait UpdateVehicleRequestItem extends js.Object {
    var vehicleName: vehicleName
    var attributeUpdateMode: js.UndefOr[UpdateMode]
    var attributes: js.UndefOr[attributesMap]
    var decoderManifestArn: js.UndefOr[arn]
    var modelManifestArn: js.UndefOr[arn]
  }

  object UpdateVehicleRequestItem {
    @inline
    def apply(
        vehicleName: vehicleName,
        attributeUpdateMode: js.UndefOr[UpdateMode] = js.undefined,
        attributes: js.UndefOr[attributesMap] = js.undefined,
        decoderManifestArn: js.UndefOr[arn] = js.undefined,
        modelManifestArn: js.UndefOr[arn] = js.undefined
    ): UpdateVehicleRequestItem = {
      val __obj = js.Dynamic.literal(
        "vehicleName" -> vehicleName.asInstanceOf[js.Any]
      )

      attributeUpdateMode.foreach(__v => __obj.updateDynamic("attributeUpdateMode")(__v.asInstanceOf[js.Any]))
      attributes.foreach(__v => __obj.updateDynamic("attributes")(__v.asInstanceOf[js.Any]))
      decoderManifestArn.foreach(__v => __obj.updateDynamic("decoderManifestArn")(__v.asInstanceOf[js.Any]))
      modelManifestArn.foreach(__v => __obj.updateDynamic("modelManifestArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateVehicleRequestItem]
    }
  }

  @js.native
  trait UpdateVehicleResponse extends js.Object {
    var arn: js.UndefOr[arn]
    var vehicleName: js.UndefOr[vehicleName]
  }

  object UpdateVehicleResponse {
    @inline
    def apply(
        arn: js.UndefOr[arn] = js.undefined,
        vehicleName: js.UndefOr[vehicleName] = js.undefined
    ): UpdateVehicleResponse = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      vehicleName.foreach(__v => __obj.updateDynamic("vehicleName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateVehicleResponse]
    }
  }

  /** Information about the updated vehicle.
    */
  @js.native
  trait UpdateVehicleResponseItem extends js.Object {
    var arn: js.UndefOr[arn]
    var vehicleName: js.UndefOr[vehicleName]
  }

  object UpdateVehicleResponseItem {
    @inline
    def apply(
        arn: js.UndefOr[arn] = js.undefined,
        vehicleName: js.UndefOr[vehicleName] = js.undefined
    ): UpdateVehicleResponseItem = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      vehicleName.foreach(__v => __obj.updateDynamic("vehicleName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateVehicleResponseItem]
    }
  }

  /** Information about the state of a vehicle and how it relates to the status of a campaign.
    */
  @js.native
  trait VehicleStatus extends js.Object {
    var campaignName: js.UndefOr[String]
    var status: js.UndefOr[VehicleState]
    var vehicleName: js.UndefOr[vehicleName]
  }

  object VehicleStatus {
    @inline
    def apply(
        campaignName: js.UndefOr[String] = js.undefined,
        status: js.UndefOr[VehicleState] = js.undefined,
        vehicleName: js.UndefOr[vehicleName] = js.undefined
    ): VehicleStatus = {
      val __obj = js.Dynamic.literal()
      campaignName.foreach(__v => __obj.updateDynamic("campaignName")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      vehicleName.foreach(__v => __obj.updateDynamic("vehicleName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VehicleStatus]
    }
  }

  /** Information about a vehicle. To return this information about vehicles in your account, you can use the API operation.
    */
  @js.native
  trait VehicleSummary extends js.Object {
    var arn: arn
    var creationTime: timestamp
    var decoderManifestArn: arn
    var lastModificationTime: timestamp
    var modelManifestArn: arn
    var vehicleName: vehicleName
  }

  object VehicleSummary {
    @inline
    def apply(
        arn: arn,
        creationTime: timestamp,
        decoderManifestArn: arn,
        lastModificationTime: timestamp,
        modelManifestArn: arn,
        vehicleName: vehicleName
    ): VehicleSummary = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "creationTime" -> creationTime.asInstanceOf[js.Any],
        "decoderManifestArn" -> decoderManifestArn.asInstanceOf[js.Any],
        "lastModificationTime" -> lastModificationTime.asInstanceOf[js.Any],
        "modelManifestArn" -> modelManifestArn.asInstanceOf[js.Any],
        "vehicleName" -> vehicleName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[VehicleSummary]
    }
  }
}
