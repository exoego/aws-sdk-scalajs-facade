package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object iotroborunner {
  type CreatedAtTimestamp = js.Date
  type DestinationAdditionalFixedProperties = String
  type DestinationArn = String
  type DestinationGenericIdentifier = String
  type DestinationId = String
  type Destinations = js.Array[Destination]
  type IdempotencyToken = String
  type ListSitesPageSize = Int
  type ListWorkerFleetsPageSize = Int
  type ListWorkersPageSize = Int
  type Name = String
  type OrientationDegreesDouble = Double
  type PageSize = Int
  type PaginationToken = String
  type SiteArn = String
  type SiteCountryCode = String
  type SiteDescription = String
  type SiteGenericIdentifier = String
  type SiteId = String
  type Sites = js.Array[Site]
  type UpdatedAtTimestamp = js.Date
  type VendorAdditionalFixedPropertiesJson = String
  type VendorAdditionalTransientPropertiesJson = String
  type VendorWorkerId = String
  type VendorWorkerIpAddress = String
  type WorkerAdditionalFixedPropertiesJson = String
  type WorkerAdditionalTransientPropertiesJson = String
  type WorkerArn = String
  type WorkerFleetAdditionalFixedProperties = String
  type WorkerFleetArn = String
  type WorkerFleetGenericIdentifier = String
  type WorkerFleetId = String
  type WorkerFleets = js.Array[WorkerFleet]
  type WorkerGenericIdentifier = String
  type WorkerId = String
  type Workers = js.Array[Worker]

  final class IoTRoboRunnerOps(private val service: IoTRoboRunner) extends AnyVal {

    @inline def createDestinationFuture(params: CreateDestinationRequest): Future[CreateDestinationResponse] = service.createDestination(params).promise().toFuture
    @inline def createSiteFuture(params: CreateSiteRequest): Future[CreateSiteResponse] = service.createSite(params).promise().toFuture
    @inline def createWorkerFleetFuture(params: CreateWorkerFleetRequest): Future[CreateWorkerFleetResponse] = service.createWorkerFleet(params).promise().toFuture
    @inline def createWorkerFuture(params: CreateWorkerRequest): Future[CreateWorkerResponse] = service.createWorker(params).promise().toFuture
    @inline def deleteDestinationFuture(params: DeleteDestinationRequest): Future[DeleteDestinationResponse] = service.deleteDestination(params).promise().toFuture
    @inline def deleteSiteFuture(params: DeleteSiteRequest): Future[DeleteSiteResponse] = service.deleteSite(params).promise().toFuture
    @inline def deleteWorkerFleetFuture(params: DeleteWorkerFleetRequest): Future[DeleteWorkerFleetResponse] = service.deleteWorkerFleet(params).promise().toFuture
    @inline def deleteWorkerFuture(params: DeleteWorkerRequest): Future[DeleteWorkerResponse] = service.deleteWorker(params).promise().toFuture
    @inline def getDestinationFuture(params: GetDestinationRequest): Future[GetDestinationResponse] = service.getDestination(params).promise().toFuture
    @inline def getSiteFuture(params: GetSiteRequest): Future[GetSiteResponse] = service.getSite(params).promise().toFuture
    @inline def getWorkerFleetFuture(params: GetWorkerFleetRequest): Future[GetWorkerFleetResponse] = service.getWorkerFleet(params).promise().toFuture
    @inline def getWorkerFuture(params: GetWorkerRequest): Future[GetWorkerResponse] = service.getWorker(params).promise().toFuture
    @inline def listDestinationsFuture(params: ListDestinationsRequest): Future[ListDestinationsResponse] = service.listDestinations(params).promise().toFuture
    @inline def listSitesFuture(params: ListSitesRequest): Future[ListSitesResponse] = service.listSites(params).promise().toFuture
    @inline def listWorkerFleetsFuture(params: ListWorkerFleetsRequest): Future[ListWorkerFleetsResponse] = service.listWorkerFleets(params).promise().toFuture
    @inline def listWorkersFuture(params: ListWorkersRequest): Future[ListWorkersResponse] = service.listWorkers(params).promise().toFuture
    @inline def updateDestinationFuture(params: UpdateDestinationRequest): Future[UpdateDestinationResponse] = service.updateDestination(params).promise().toFuture
    @inline def updateSiteFuture(params: UpdateSiteRequest): Future[UpdateSiteResponse] = service.updateSite(params).promise().toFuture
    @inline def updateWorkerFleetFuture(params: UpdateWorkerFleetRequest): Future[UpdateWorkerFleetResponse] = service.updateWorkerFleet(params).promise().toFuture
    @inline def updateWorkerFuture(params: UpdateWorkerRequest): Future[UpdateWorkerResponse] = service.updateWorker(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/iotroborunner", JSImport.Namespace, "AWS.IoTRoboRunner")
  class IoTRoboRunner() extends js.Object {
    def this(config: AWSConfig) = this()

    def createDestination(params: CreateDestinationRequest): Request[CreateDestinationResponse] = js.native
    def createSite(params: CreateSiteRequest): Request[CreateSiteResponse] = js.native
    def createWorker(params: CreateWorkerRequest): Request[CreateWorkerResponse] = js.native
    def createWorkerFleet(params: CreateWorkerFleetRequest): Request[CreateWorkerFleetResponse] = js.native
    def deleteDestination(params: DeleteDestinationRequest): Request[DeleteDestinationResponse] = js.native
    def deleteSite(params: DeleteSiteRequest): Request[DeleteSiteResponse] = js.native
    def deleteWorker(params: DeleteWorkerRequest): Request[DeleteWorkerResponse] = js.native
    def deleteWorkerFleet(params: DeleteWorkerFleetRequest): Request[DeleteWorkerFleetResponse] = js.native
    def getDestination(params: GetDestinationRequest): Request[GetDestinationResponse] = js.native
    def getSite(params: GetSiteRequest): Request[GetSiteResponse] = js.native
    def getWorker(params: GetWorkerRequest): Request[GetWorkerResponse] = js.native
    def getWorkerFleet(params: GetWorkerFleetRequest): Request[GetWorkerFleetResponse] = js.native
    def listDestinations(params: ListDestinationsRequest): Request[ListDestinationsResponse] = js.native
    def listSites(params: ListSitesRequest): Request[ListSitesResponse] = js.native
    def listWorkerFleets(params: ListWorkerFleetsRequest): Request[ListWorkerFleetsResponse] = js.native
    def listWorkers(params: ListWorkersRequest): Request[ListWorkersResponse] = js.native
    def updateDestination(params: UpdateDestinationRequest): Request[UpdateDestinationResponse] = js.native
    def updateSite(params: UpdateSiteRequest): Request[UpdateSiteResponse] = js.native
    def updateWorker(params: UpdateWorkerRequest): Request[UpdateWorkerResponse] = js.native
    def updateWorkerFleet(params: UpdateWorkerFleetRequest): Request[UpdateWorkerFleetResponse] = js.native
  }
  object IoTRoboRunner {
    @inline implicit def toOps(service: IoTRoboRunner): IoTRoboRunnerOps = {
      new IoTRoboRunnerOps(service)
    }
  }

  /** Cartesian coordinates in 3D space relative to the RoboRunner origin.
    */
  @js.native
  trait CartesianCoordinates extends js.Object {
    var x: Double
    var y: Double
    var z: js.UndefOr[Double]
  }

  object CartesianCoordinates {
    @inline
    def apply(
        x: Double,
        y: Double,
        z: js.UndefOr[Double] = js.undefined
    ): CartesianCoordinates = {
      val __obj = js.Dynamic.literal(
        "x" -> x.asInstanceOf[js.Any],
        "y" -> y.asInstanceOf[js.Any]
      )

      z.foreach(__v => __obj.updateDynamic("z")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CartesianCoordinates]
    }
  }

  @js.native
  trait CreateDestinationRequest extends js.Object {
    var name: Name
    var site: SiteGenericIdentifier
    var additionalFixedProperties: js.UndefOr[DestinationAdditionalFixedProperties]
    var clientToken: js.UndefOr[IdempotencyToken]
    var state: js.UndefOr[DestinationState]
  }

  object CreateDestinationRequest {
    @inline
    def apply(
        name: Name,
        site: SiteGenericIdentifier,
        additionalFixedProperties: js.UndefOr[DestinationAdditionalFixedProperties] = js.undefined,
        clientToken: js.UndefOr[IdempotencyToken] = js.undefined,
        state: js.UndefOr[DestinationState] = js.undefined
    ): CreateDestinationRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "site" -> site.asInstanceOf[js.Any]
      )

      additionalFixedProperties.foreach(__v => __obj.updateDynamic("additionalFixedProperties")(__v.asInstanceOf[js.Any]))
      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDestinationRequest]
    }
  }

  @js.native
  trait CreateDestinationResponse extends js.Object {
    var arn: DestinationArn
    var createdAt: CreatedAtTimestamp
    var id: DestinationId
    var state: DestinationState
    var updatedAt: UpdatedAtTimestamp
  }

  object CreateDestinationResponse {
    @inline
    def apply(
        arn: DestinationArn,
        createdAt: CreatedAtTimestamp,
        id: DestinationId,
        state: DestinationState,
        updatedAt: UpdatedAtTimestamp
    ): CreateDestinationResponse = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "createdAt" -> createdAt.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "state" -> state.asInstanceOf[js.Any],
        "updatedAt" -> updatedAt.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateDestinationResponse]
    }
  }

  @js.native
  trait CreateSiteRequest extends js.Object {
    var countryCode: SiteCountryCode
    var name: Name
    var clientToken: js.UndefOr[IdempotencyToken]
    var description: js.UndefOr[SiteDescription]
  }

  object CreateSiteRequest {
    @inline
    def apply(
        countryCode: SiteCountryCode,
        name: Name,
        clientToken: js.UndefOr[IdempotencyToken] = js.undefined,
        description: js.UndefOr[SiteDescription] = js.undefined
    ): CreateSiteRequest = {
      val __obj = js.Dynamic.literal(
        "countryCode" -> countryCode.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSiteRequest]
    }
  }

  @js.native
  trait CreateSiteResponse extends js.Object {
    var arn: SiteArn
    var createdAt: CreatedAtTimestamp
    var id: SiteId
    var updatedAt: UpdatedAtTimestamp
  }

  object CreateSiteResponse {
    @inline
    def apply(
        arn: SiteArn,
        createdAt: CreatedAtTimestamp,
        id: SiteId,
        updatedAt: UpdatedAtTimestamp
    ): CreateSiteResponse = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "createdAt" -> createdAt.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "updatedAt" -> updatedAt.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateSiteResponse]
    }
  }

  @js.native
  trait CreateWorkerFleetRequest extends js.Object {
    var name: Name
    var site: SiteGenericIdentifier
    var additionalFixedProperties: js.UndefOr[WorkerFleetAdditionalFixedProperties]
    var clientToken: js.UndefOr[IdempotencyToken]
  }

  object CreateWorkerFleetRequest {
    @inline
    def apply(
        name: Name,
        site: SiteGenericIdentifier,
        additionalFixedProperties: js.UndefOr[WorkerFleetAdditionalFixedProperties] = js.undefined,
        clientToken: js.UndefOr[IdempotencyToken] = js.undefined
    ): CreateWorkerFleetRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "site" -> site.asInstanceOf[js.Any]
      )

      additionalFixedProperties.foreach(__v => __obj.updateDynamic("additionalFixedProperties")(__v.asInstanceOf[js.Any]))
      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateWorkerFleetRequest]
    }
  }

  @js.native
  trait CreateWorkerFleetResponse extends js.Object {
    var arn: WorkerFleetArn
    var createdAt: CreatedAtTimestamp
    var id: WorkerFleetId
    var updatedAt: UpdatedAtTimestamp
  }

  object CreateWorkerFleetResponse {
    @inline
    def apply(
        arn: WorkerFleetArn,
        createdAt: CreatedAtTimestamp,
        id: WorkerFleetId,
        updatedAt: UpdatedAtTimestamp
    ): CreateWorkerFleetResponse = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "createdAt" -> createdAt.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "updatedAt" -> updatedAt.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateWorkerFleetResponse]
    }
  }

  @js.native
  trait CreateWorkerRequest extends js.Object {
    var fleet: WorkerFleetGenericIdentifier
    var name: Name
    var additionalFixedProperties: js.UndefOr[WorkerAdditionalFixedPropertiesJson]
    var additionalTransientProperties: js.UndefOr[WorkerAdditionalTransientPropertiesJson]
    var clientToken: js.UndefOr[IdempotencyToken]
    var orientation: js.UndefOr[Orientation]
    var position: js.UndefOr[PositionCoordinates]
    var vendorProperties: js.UndefOr[VendorProperties]
  }

  object CreateWorkerRequest {
    @inline
    def apply(
        fleet: WorkerFleetGenericIdentifier,
        name: Name,
        additionalFixedProperties: js.UndefOr[WorkerAdditionalFixedPropertiesJson] = js.undefined,
        additionalTransientProperties: js.UndefOr[WorkerAdditionalTransientPropertiesJson] = js.undefined,
        clientToken: js.UndefOr[IdempotencyToken] = js.undefined,
        orientation: js.UndefOr[Orientation] = js.undefined,
        position: js.UndefOr[PositionCoordinates] = js.undefined,
        vendorProperties: js.UndefOr[VendorProperties] = js.undefined
    ): CreateWorkerRequest = {
      val __obj = js.Dynamic.literal(
        "fleet" -> fleet.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )

      additionalFixedProperties.foreach(__v => __obj.updateDynamic("additionalFixedProperties")(__v.asInstanceOf[js.Any]))
      additionalTransientProperties.foreach(__v => __obj.updateDynamic("additionalTransientProperties")(__v.asInstanceOf[js.Any]))
      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      orientation.foreach(__v => __obj.updateDynamic("orientation")(__v.asInstanceOf[js.Any]))
      position.foreach(__v => __obj.updateDynamic("position")(__v.asInstanceOf[js.Any]))
      vendorProperties.foreach(__v => __obj.updateDynamic("vendorProperties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateWorkerRequest]
    }
  }

  @js.native
  trait CreateWorkerResponse extends js.Object {
    var arn: WorkerArn
    var createdAt: CreatedAtTimestamp
    var id: WorkerId
    var site: SiteArn
    var updatedAt: UpdatedAtTimestamp
  }

  object CreateWorkerResponse {
    @inline
    def apply(
        arn: WorkerArn,
        createdAt: CreatedAtTimestamp,
        id: WorkerId,
        site: SiteArn,
        updatedAt: UpdatedAtTimestamp
    ): CreateWorkerResponse = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "createdAt" -> createdAt.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "site" -> site.asInstanceOf[js.Any],
        "updatedAt" -> updatedAt.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateWorkerResponse]
    }
  }

  @js.native
  trait DeleteDestinationRequest extends js.Object {
    var id: DestinationGenericIdentifier
  }

  object DeleteDestinationRequest {
    @inline
    def apply(
        id: DestinationGenericIdentifier
    ): DeleteDestinationRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteDestinationRequest]
    }
  }

  @js.native
  trait DeleteDestinationResponse extends js.Object

  object DeleteDestinationResponse {
    @inline
    def apply(): DeleteDestinationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteDestinationResponse]
    }
  }

  @js.native
  trait DeleteSiteRequest extends js.Object {
    var id: SiteGenericIdentifier
  }

  object DeleteSiteRequest {
    @inline
    def apply(
        id: SiteGenericIdentifier
    ): DeleteSiteRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteSiteRequest]
    }
  }

  @js.native
  trait DeleteSiteResponse extends js.Object

  object DeleteSiteResponse {
    @inline
    def apply(): DeleteSiteResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteSiteResponse]
    }
  }

  @js.native
  trait DeleteWorkerFleetRequest extends js.Object {
    var id: WorkerFleetGenericIdentifier
  }

  object DeleteWorkerFleetRequest {
    @inline
    def apply(
        id: WorkerFleetGenericIdentifier
    ): DeleteWorkerFleetRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteWorkerFleetRequest]
    }
  }

  @js.native
  trait DeleteWorkerFleetResponse extends js.Object

  object DeleteWorkerFleetResponse {
    @inline
    def apply(): DeleteWorkerFleetResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteWorkerFleetResponse]
    }
  }

  @js.native
  trait DeleteWorkerRequest extends js.Object {
    var id: WorkerGenericIdentifier
  }

  object DeleteWorkerRequest {
    @inline
    def apply(
        id: WorkerGenericIdentifier
    ): DeleteWorkerRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteWorkerRequest]
    }
  }

  @js.native
  trait DeleteWorkerResponse extends js.Object

  object DeleteWorkerResponse {
    @inline
    def apply(): DeleteWorkerResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteWorkerResponse]
    }
  }

  /** Area within a facility where work can be performed.
    */
  @js.native
  trait Destination extends js.Object {
    var arn: DestinationArn
    var createdAt: CreatedAtTimestamp
    var id: DestinationId
    var name: Name
    var site: SiteArn
    var state: DestinationState
    var updatedAt: UpdatedAtTimestamp
    var additionalFixedProperties: js.UndefOr[DestinationAdditionalFixedProperties]
  }

  object Destination {
    @inline
    def apply(
        arn: DestinationArn,
        createdAt: CreatedAtTimestamp,
        id: DestinationId,
        name: Name,
        site: SiteArn,
        state: DestinationState,
        updatedAt: UpdatedAtTimestamp,
        additionalFixedProperties: js.UndefOr[DestinationAdditionalFixedProperties] = js.undefined
    ): Destination = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "createdAt" -> createdAt.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "site" -> site.asInstanceOf[js.Any],
        "state" -> state.asInstanceOf[js.Any],
        "updatedAt" -> updatedAt.asInstanceOf[js.Any]
      )

      additionalFixedProperties.foreach(__v => __obj.updateDynamic("additionalFixedProperties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Destination]
    }
  }

  @js.native
  trait GetDestinationRequest extends js.Object {
    var id: DestinationGenericIdentifier
  }

  object GetDestinationRequest {
    @inline
    def apply(
        id: DestinationGenericIdentifier
    ): GetDestinationRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetDestinationRequest]
    }
  }

  @js.native
  trait GetDestinationResponse extends js.Object {
    var arn: DestinationArn
    var createdAt: CreatedAtTimestamp
    var id: DestinationId
    var name: Name
    var site: SiteArn
    var state: DestinationState
    var updatedAt: UpdatedAtTimestamp
    var additionalFixedProperties: js.UndefOr[DestinationAdditionalFixedProperties]
  }

  object GetDestinationResponse {
    @inline
    def apply(
        arn: DestinationArn,
        createdAt: CreatedAtTimestamp,
        id: DestinationId,
        name: Name,
        site: SiteArn,
        state: DestinationState,
        updatedAt: UpdatedAtTimestamp,
        additionalFixedProperties: js.UndefOr[DestinationAdditionalFixedProperties] = js.undefined
    ): GetDestinationResponse = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "createdAt" -> createdAt.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "site" -> site.asInstanceOf[js.Any],
        "state" -> state.asInstanceOf[js.Any],
        "updatedAt" -> updatedAt.asInstanceOf[js.Any]
      )

      additionalFixedProperties.foreach(__v => __obj.updateDynamic("additionalFixedProperties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDestinationResponse]
    }
  }

  @js.native
  trait GetSiteRequest extends js.Object {
    var id: SiteGenericIdentifier
  }

  object GetSiteRequest {
    @inline
    def apply(
        id: SiteGenericIdentifier
    ): GetSiteRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetSiteRequest]
    }
  }

  @js.native
  trait GetSiteResponse extends js.Object {
    var arn: SiteArn
    var countryCode: SiteCountryCode
    var createdAt: CreatedAtTimestamp
    var id: SiteId
    var name: Name
    var updatedAt: UpdatedAtTimestamp
    var description: js.UndefOr[SiteDescription]
  }

  object GetSiteResponse {
    @inline
    def apply(
        arn: SiteArn,
        countryCode: SiteCountryCode,
        createdAt: CreatedAtTimestamp,
        id: SiteId,
        name: Name,
        updatedAt: UpdatedAtTimestamp,
        description: js.UndefOr[SiteDescription] = js.undefined
    ): GetSiteResponse = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "countryCode" -> countryCode.asInstanceOf[js.Any],
        "createdAt" -> createdAt.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "updatedAt" -> updatedAt.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSiteResponse]
    }
  }

  @js.native
  trait GetWorkerFleetRequest extends js.Object {
    var id: WorkerFleetGenericIdentifier
  }

  object GetWorkerFleetRequest {
    @inline
    def apply(
        id: WorkerFleetGenericIdentifier
    ): GetWorkerFleetRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetWorkerFleetRequest]
    }
  }

  @js.native
  trait GetWorkerFleetResponse extends js.Object {
    var arn: WorkerFleetArn
    var createdAt: CreatedAtTimestamp
    var id: WorkerFleetId
    var name: Name
    var site: SiteArn
    var updatedAt: UpdatedAtTimestamp
    var additionalFixedProperties: js.UndefOr[WorkerFleetAdditionalFixedProperties]
  }

  object GetWorkerFleetResponse {
    @inline
    def apply(
        arn: WorkerFleetArn,
        createdAt: CreatedAtTimestamp,
        id: WorkerFleetId,
        name: Name,
        site: SiteArn,
        updatedAt: UpdatedAtTimestamp,
        additionalFixedProperties: js.UndefOr[WorkerFleetAdditionalFixedProperties] = js.undefined
    ): GetWorkerFleetResponse = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "createdAt" -> createdAt.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "site" -> site.asInstanceOf[js.Any],
        "updatedAt" -> updatedAt.asInstanceOf[js.Any]
      )

      additionalFixedProperties.foreach(__v => __obj.updateDynamic("additionalFixedProperties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetWorkerFleetResponse]
    }
  }

  @js.native
  trait GetWorkerRequest extends js.Object {
    var id: WorkerGenericIdentifier
  }

  object GetWorkerRequest {
    @inline
    def apply(
        id: WorkerGenericIdentifier
    ): GetWorkerRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetWorkerRequest]
    }
  }

  @js.native
  trait GetWorkerResponse extends js.Object {
    var arn: WorkerArn
    var createdAt: CreatedAtTimestamp
    var fleet: WorkerFleetArn
    var id: WorkerId
    var name: Name
    var site: SiteArn
    var updatedAt: UpdatedAtTimestamp
    var additionalFixedProperties: js.UndefOr[WorkerAdditionalFixedPropertiesJson]
    var additionalTransientProperties: js.UndefOr[WorkerAdditionalTransientPropertiesJson]
    var orientation: js.UndefOr[Orientation]
    var position: js.UndefOr[PositionCoordinates]
    var vendorProperties: js.UndefOr[VendorProperties]
  }

  object GetWorkerResponse {
    @inline
    def apply(
        arn: WorkerArn,
        createdAt: CreatedAtTimestamp,
        fleet: WorkerFleetArn,
        id: WorkerId,
        name: Name,
        site: SiteArn,
        updatedAt: UpdatedAtTimestamp,
        additionalFixedProperties: js.UndefOr[WorkerAdditionalFixedPropertiesJson] = js.undefined,
        additionalTransientProperties: js.UndefOr[WorkerAdditionalTransientPropertiesJson] = js.undefined,
        orientation: js.UndefOr[Orientation] = js.undefined,
        position: js.UndefOr[PositionCoordinates] = js.undefined,
        vendorProperties: js.UndefOr[VendorProperties] = js.undefined
    ): GetWorkerResponse = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "createdAt" -> createdAt.asInstanceOf[js.Any],
        "fleet" -> fleet.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "site" -> site.asInstanceOf[js.Any],
        "updatedAt" -> updatedAt.asInstanceOf[js.Any]
      )

      additionalFixedProperties.foreach(__v => __obj.updateDynamic("additionalFixedProperties")(__v.asInstanceOf[js.Any]))
      additionalTransientProperties.foreach(__v => __obj.updateDynamic("additionalTransientProperties")(__v.asInstanceOf[js.Any]))
      orientation.foreach(__v => __obj.updateDynamic("orientation")(__v.asInstanceOf[js.Any]))
      position.foreach(__v => __obj.updateDynamic("position")(__v.asInstanceOf[js.Any]))
      vendorProperties.foreach(__v => __obj.updateDynamic("vendorProperties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetWorkerResponse]
    }
  }

  @js.native
  trait ListDestinationsRequest extends js.Object {
    var site: SiteGenericIdentifier
    var maxResults: js.UndefOr[PageSize]
    var nextToken: js.UndefOr[PaginationToken]
    var state: js.UndefOr[DestinationState]
  }

  object ListDestinationsRequest {
    @inline
    def apply(
        site: SiteGenericIdentifier,
        maxResults: js.UndefOr[PageSize] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        state: js.UndefOr[DestinationState] = js.undefined
    ): ListDestinationsRequest = {
      val __obj = js.Dynamic.literal(
        "site" -> site.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDestinationsRequest]
    }
  }

  @js.native
  trait ListDestinationsResponse extends js.Object {
    var destinations: js.UndefOr[Destinations]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListDestinationsResponse {
    @inline
    def apply(
        destinations: js.UndefOr[Destinations] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListDestinationsResponse = {
      val __obj = js.Dynamic.literal()
      destinations.foreach(__v => __obj.updateDynamic("destinations")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDestinationsResponse]
    }
  }

  @js.native
  trait ListSitesRequest extends js.Object {
    var maxResults: js.UndefOr[ListSitesPageSize]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListSitesRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[ListSitesPageSize] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListSitesRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSitesRequest]
    }
  }

  @js.native
  trait ListSitesResponse extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var sites: js.UndefOr[Sites]
  }

  object ListSitesResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        sites: js.UndefOr[Sites] = js.undefined
    ): ListSitesResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      sites.foreach(__v => __obj.updateDynamic("sites")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSitesResponse]
    }
  }

  @js.native
  trait ListWorkerFleetsRequest extends js.Object {
    var site: SiteGenericIdentifier
    var maxResults: js.UndefOr[ListWorkerFleetsPageSize]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListWorkerFleetsRequest {
    @inline
    def apply(
        site: SiteGenericIdentifier,
        maxResults: js.UndefOr[ListWorkerFleetsPageSize] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListWorkerFleetsRequest = {
      val __obj = js.Dynamic.literal(
        "site" -> site.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWorkerFleetsRequest]
    }
  }

  @js.native
  trait ListWorkerFleetsResponse extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var workerFleets: js.UndefOr[WorkerFleets]
  }

  object ListWorkerFleetsResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        workerFleets: js.UndefOr[WorkerFleets] = js.undefined
    ): ListWorkerFleetsResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      workerFleets.foreach(__v => __obj.updateDynamic("workerFleets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWorkerFleetsResponse]
    }
  }

  @js.native
  trait ListWorkersRequest extends js.Object {
    var site: SiteGenericIdentifier
    var fleet: js.UndefOr[WorkerFleetGenericIdentifier]
    var maxResults: js.UndefOr[ListWorkersPageSize]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListWorkersRequest {
    @inline
    def apply(
        site: SiteGenericIdentifier,
        fleet: js.UndefOr[WorkerFleetGenericIdentifier] = js.undefined,
        maxResults: js.UndefOr[ListWorkersPageSize] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListWorkersRequest = {
      val __obj = js.Dynamic.literal(
        "site" -> site.asInstanceOf[js.Any]
      )

      fleet.foreach(__v => __obj.updateDynamic("fleet")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWorkersRequest]
    }
  }

  @js.native
  trait ListWorkersResponse extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var workers: js.UndefOr[Workers]
  }

  object ListWorkersResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        workers: js.UndefOr[Workers] = js.undefined
    ): ListWorkersResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      workers.foreach(__v => __obj.updateDynamic("workers")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWorkersResponse]
    }
  }

  /** Worker orientation measured in units clockwise from north.
    */
  @js.native
  trait Orientation extends js.Object {
    var degrees: js.UndefOr[OrientationDegreesDouble]
  }

  object Orientation {
    @inline
    def apply(
        degrees: js.UndefOr[OrientationDegreesDouble] = js.undefined
    ): Orientation = {
      val __obj = js.Dynamic.literal()
      degrees.foreach(__v => __obj.updateDynamic("degrees")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Orientation]
    }
  }

  /** Supported coordinates for worker position.
    */
  @js.native
  trait PositionCoordinates extends js.Object {
    var cartesianCoordinates: js.UndefOr[CartesianCoordinates]
  }

  object PositionCoordinates {
    @inline
    def apply(
        cartesianCoordinates: js.UndefOr[CartesianCoordinates] = js.undefined
    ): PositionCoordinates = {
      val __obj = js.Dynamic.literal()
      cartesianCoordinates.foreach(__v => __obj.updateDynamic("cartesianCoordinates")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PositionCoordinates]
    }
  }

  /** Facility containing destinations, workers, activities, and tasks.
    */
  @js.native
  trait Site extends js.Object {
    var arn: SiteArn
    var countryCode: SiteCountryCode
    var createdAt: CreatedAtTimestamp
    var name: Name
  }

  object Site {
    @inline
    def apply(
        arn: SiteArn,
        countryCode: SiteCountryCode,
        createdAt: CreatedAtTimestamp,
        name: Name
    ): Site = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "countryCode" -> countryCode.asInstanceOf[js.Any],
        "createdAt" -> createdAt.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Site]
    }
  }

  @js.native
  trait UpdateDestinationRequest extends js.Object {
    var id: DestinationGenericIdentifier
    var additionalFixedProperties: js.UndefOr[DestinationAdditionalFixedProperties]
    var name: js.UndefOr[Name]
    var state: js.UndefOr[DestinationState]
  }

  object UpdateDestinationRequest {
    @inline
    def apply(
        id: DestinationGenericIdentifier,
        additionalFixedProperties: js.UndefOr[DestinationAdditionalFixedProperties] = js.undefined,
        name: js.UndefOr[Name] = js.undefined,
        state: js.UndefOr[DestinationState] = js.undefined
    ): UpdateDestinationRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )

      additionalFixedProperties.foreach(__v => __obj.updateDynamic("additionalFixedProperties")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDestinationRequest]
    }
  }

  @js.native
  trait UpdateDestinationResponse extends js.Object {
    var arn: DestinationArn
    var id: DestinationId
    var name: Name
    var state: DestinationState
    var updatedAt: UpdatedAtTimestamp
    var additionalFixedProperties: js.UndefOr[DestinationAdditionalFixedProperties]
  }

  object UpdateDestinationResponse {
    @inline
    def apply(
        arn: DestinationArn,
        id: DestinationId,
        name: Name,
        state: DestinationState,
        updatedAt: UpdatedAtTimestamp,
        additionalFixedProperties: js.UndefOr[DestinationAdditionalFixedProperties] = js.undefined
    ): UpdateDestinationResponse = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "state" -> state.asInstanceOf[js.Any],
        "updatedAt" -> updatedAt.asInstanceOf[js.Any]
      )

      additionalFixedProperties.foreach(__v => __obj.updateDynamic("additionalFixedProperties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDestinationResponse]
    }
  }

  @js.native
  trait UpdateSiteRequest extends js.Object {
    var id: SiteGenericIdentifier
    var countryCode: js.UndefOr[SiteCountryCode]
    var description: js.UndefOr[SiteDescription]
    var name: js.UndefOr[Name]
  }

  object UpdateSiteRequest {
    @inline
    def apply(
        id: SiteGenericIdentifier,
        countryCode: js.UndefOr[SiteCountryCode] = js.undefined,
        description: js.UndefOr[SiteDescription] = js.undefined,
        name: js.UndefOr[Name] = js.undefined
    ): UpdateSiteRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )

      countryCode.foreach(__v => __obj.updateDynamic("countryCode")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSiteRequest]
    }
  }

  @js.native
  trait UpdateSiteResponse extends js.Object {
    var arn: SiteArn
    var id: SiteId
    var name: Name
    var updatedAt: UpdatedAtTimestamp
    var countryCode: js.UndefOr[SiteCountryCode]
    var description: js.UndefOr[SiteDescription]
  }

  object UpdateSiteResponse {
    @inline
    def apply(
        arn: SiteArn,
        id: SiteId,
        name: Name,
        updatedAt: UpdatedAtTimestamp,
        countryCode: js.UndefOr[SiteCountryCode] = js.undefined,
        description: js.UndefOr[SiteDescription] = js.undefined
    ): UpdateSiteResponse = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "updatedAt" -> updatedAt.asInstanceOf[js.Any]
      )

      countryCode.foreach(__v => __obj.updateDynamic("countryCode")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSiteResponse]
    }
  }

  @js.native
  trait UpdateWorkerFleetRequest extends js.Object {
    var id: WorkerFleetGenericIdentifier
    var additionalFixedProperties: js.UndefOr[WorkerFleetAdditionalFixedProperties]
    var name: js.UndefOr[Name]
  }

  object UpdateWorkerFleetRequest {
    @inline
    def apply(
        id: WorkerFleetGenericIdentifier,
        additionalFixedProperties: js.UndefOr[WorkerFleetAdditionalFixedProperties] = js.undefined,
        name: js.UndefOr[Name] = js.undefined
    ): UpdateWorkerFleetRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )

      additionalFixedProperties.foreach(__v => __obj.updateDynamic("additionalFixedProperties")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateWorkerFleetRequest]
    }
  }

  @js.native
  trait UpdateWorkerFleetResponse extends js.Object {
    var arn: WorkerFleetArn
    var id: WorkerFleetId
    var name: Name
    var updatedAt: UpdatedAtTimestamp
    var additionalFixedProperties: js.UndefOr[WorkerFleetAdditionalFixedProperties]
  }

  object UpdateWorkerFleetResponse {
    @inline
    def apply(
        arn: WorkerFleetArn,
        id: WorkerFleetId,
        name: Name,
        updatedAt: UpdatedAtTimestamp,
        additionalFixedProperties: js.UndefOr[WorkerFleetAdditionalFixedProperties] = js.undefined
    ): UpdateWorkerFleetResponse = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "updatedAt" -> updatedAt.asInstanceOf[js.Any]
      )

      additionalFixedProperties.foreach(__v => __obj.updateDynamic("additionalFixedProperties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateWorkerFleetResponse]
    }
  }

  @js.native
  trait UpdateWorkerRequest extends js.Object {
    var id: WorkerGenericIdentifier
    var additionalFixedProperties: js.UndefOr[WorkerAdditionalFixedPropertiesJson]
    var additionalTransientProperties: js.UndefOr[WorkerAdditionalTransientPropertiesJson]
    var name: js.UndefOr[Name]
    var orientation: js.UndefOr[Orientation]
    var position: js.UndefOr[PositionCoordinates]
    var vendorProperties: js.UndefOr[VendorProperties]
  }

  object UpdateWorkerRequest {
    @inline
    def apply(
        id: WorkerGenericIdentifier,
        additionalFixedProperties: js.UndefOr[WorkerAdditionalFixedPropertiesJson] = js.undefined,
        additionalTransientProperties: js.UndefOr[WorkerAdditionalTransientPropertiesJson] = js.undefined,
        name: js.UndefOr[Name] = js.undefined,
        orientation: js.UndefOr[Orientation] = js.undefined,
        position: js.UndefOr[PositionCoordinates] = js.undefined,
        vendorProperties: js.UndefOr[VendorProperties] = js.undefined
    ): UpdateWorkerRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )

      additionalFixedProperties.foreach(__v => __obj.updateDynamic("additionalFixedProperties")(__v.asInstanceOf[js.Any]))
      additionalTransientProperties.foreach(__v => __obj.updateDynamic("additionalTransientProperties")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      orientation.foreach(__v => __obj.updateDynamic("orientation")(__v.asInstanceOf[js.Any]))
      position.foreach(__v => __obj.updateDynamic("position")(__v.asInstanceOf[js.Any]))
      vendorProperties.foreach(__v => __obj.updateDynamic("vendorProperties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateWorkerRequest]
    }
  }

  @js.native
  trait UpdateWorkerResponse extends js.Object {
    var arn: WorkerArn
    var fleet: WorkerFleetArn
    var id: WorkerId
    var name: Name
    var updatedAt: UpdatedAtTimestamp
    var additionalFixedProperties: js.UndefOr[WorkerAdditionalFixedPropertiesJson]
    var additionalTransientProperties: js.UndefOr[WorkerAdditionalTransientPropertiesJson]
    var orientation: js.UndefOr[Orientation]
    var position: js.UndefOr[PositionCoordinates]
    var vendorProperties: js.UndefOr[VendorProperties]
  }

  object UpdateWorkerResponse {
    @inline
    def apply(
        arn: WorkerArn,
        fleet: WorkerFleetArn,
        id: WorkerId,
        name: Name,
        updatedAt: UpdatedAtTimestamp,
        additionalFixedProperties: js.UndefOr[WorkerAdditionalFixedPropertiesJson] = js.undefined,
        additionalTransientProperties: js.UndefOr[WorkerAdditionalTransientPropertiesJson] = js.undefined,
        orientation: js.UndefOr[Orientation] = js.undefined,
        position: js.UndefOr[PositionCoordinates] = js.undefined,
        vendorProperties: js.UndefOr[VendorProperties] = js.undefined
    ): UpdateWorkerResponse = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "fleet" -> fleet.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "updatedAt" -> updatedAt.asInstanceOf[js.Any]
      )

      additionalFixedProperties.foreach(__v => __obj.updateDynamic("additionalFixedProperties")(__v.asInstanceOf[js.Any]))
      additionalTransientProperties.foreach(__v => __obj.updateDynamic("additionalTransientProperties")(__v.asInstanceOf[js.Any]))
      orientation.foreach(__v => __obj.updateDynamic("orientation")(__v.asInstanceOf[js.Any]))
      position.foreach(__v => __obj.updateDynamic("position")(__v.asInstanceOf[js.Any]))
      vendorProperties.foreach(__v => __obj.updateDynamic("vendorProperties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateWorkerResponse]
    }
  }

  /** Properties of the worker that are provided by the vendor FMS.
    */
  @js.native
  trait VendorProperties extends js.Object {
    var vendorWorkerId: VendorWorkerId
    var vendorAdditionalFixedProperties: js.UndefOr[VendorAdditionalFixedPropertiesJson]
    var vendorAdditionalTransientProperties: js.UndefOr[VendorAdditionalTransientPropertiesJson]
    var vendorWorkerIpAddress: js.UndefOr[VendorWorkerIpAddress]
  }

  object VendorProperties {
    @inline
    def apply(
        vendorWorkerId: VendorWorkerId,
        vendorAdditionalFixedProperties: js.UndefOr[VendorAdditionalFixedPropertiesJson] = js.undefined,
        vendorAdditionalTransientProperties: js.UndefOr[VendorAdditionalTransientPropertiesJson] = js.undefined,
        vendorWorkerIpAddress: js.UndefOr[VendorWorkerIpAddress] = js.undefined
    ): VendorProperties = {
      val __obj = js.Dynamic.literal(
        "vendorWorkerId" -> vendorWorkerId.asInstanceOf[js.Any]
      )

      vendorAdditionalFixedProperties.foreach(__v => __obj.updateDynamic("vendorAdditionalFixedProperties")(__v.asInstanceOf[js.Any]))
      vendorAdditionalTransientProperties.foreach(__v => __obj.updateDynamic("vendorAdditionalTransientProperties")(__v.asInstanceOf[js.Any]))
      vendorWorkerIpAddress.foreach(__v => __obj.updateDynamic("vendorWorkerIpAddress")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VendorProperties]
    }
  }

  /** A unit capable of performing tasks.
    */
  @js.native
  trait Worker extends js.Object {
    var arn: WorkerArn
    var createdAt: CreatedAtTimestamp
    var fleet: WorkerFleetArn
    var id: WorkerId
    var name: Name
    var site: SiteArn
    var updatedAt: UpdatedAtTimestamp
    var additionalFixedProperties: js.UndefOr[WorkerAdditionalFixedPropertiesJson]
    var additionalTransientProperties: js.UndefOr[WorkerAdditionalTransientPropertiesJson]
    var orientation: js.UndefOr[Orientation]
    var position: js.UndefOr[PositionCoordinates]
    var vendorProperties: js.UndefOr[VendorProperties]
  }

  object Worker {
    @inline
    def apply(
        arn: WorkerArn,
        createdAt: CreatedAtTimestamp,
        fleet: WorkerFleetArn,
        id: WorkerId,
        name: Name,
        site: SiteArn,
        updatedAt: UpdatedAtTimestamp,
        additionalFixedProperties: js.UndefOr[WorkerAdditionalFixedPropertiesJson] = js.undefined,
        additionalTransientProperties: js.UndefOr[WorkerAdditionalTransientPropertiesJson] = js.undefined,
        orientation: js.UndefOr[Orientation] = js.undefined,
        position: js.UndefOr[PositionCoordinates] = js.undefined,
        vendorProperties: js.UndefOr[VendorProperties] = js.undefined
    ): Worker = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "createdAt" -> createdAt.asInstanceOf[js.Any],
        "fleet" -> fleet.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "site" -> site.asInstanceOf[js.Any],
        "updatedAt" -> updatedAt.asInstanceOf[js.Any]
      )

      additionalFixedProperties.foreach(__v => __obj.updateDynamic("additionalFixedProperties")(__v.asInstanceOf[js.Any]))
      additionalTransientProperties.foreach(__v => __obj.updateDynamic("additionalTransientProperties")(__v.asInstanceOf[js.Any]))
      orientation.foreach(__v => __obj.updateDynamic("orientation")(__v.asInstanceOf[js.Any]))
      position.foreach(__v => __obj.updateDynamic("position")(__v.asInstanceOf[js.Any]))
      vendorProperties.foreach(__v => __obj.updateDynamic("vendorProperties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Worker]
    }
  }

  /** A collection of workers organized within a facility.
    */
  @js.native
  trait WorkerFleet extends js.Object {
    var arn: WorkerFleetArn
    var createdAt: CreatedAtTimestamp
    var id: WorkerFleetId
    var name: Name
    var site: SiteArn
    var updatedAt: UpdatedAtTimestamp
    var additionalFixedProperties: js.UndefOr[WorkerFleetAdditionalFixedProperties]
  }

  object WorkerFleet {
    @inline
    def apply(
        arn: WorkerFleetArn,
        createdAt: CreatedAtTimestamp,
        id: WorkerFleetId,
        name: Name,
        site: SiteArn,
        updatedAt: UpdatedAtTimestamp,
        additionalFixedProperties: js.UndefOr[WorkerFleetAdditionalFixedProperties] = js.undefined
    ): WorkerFleet = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "createdAt" -> createdAt.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "site" -> site.asInstanceOf[js.Any],
        "updatedAt" -> updatedAt.asInstanceOf[js.Any]
      )

      additionalFixedProperties.foreach(__v => __obj.updateDynamic("additionalFixedProperties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkerFleet]
    }
  }
}
