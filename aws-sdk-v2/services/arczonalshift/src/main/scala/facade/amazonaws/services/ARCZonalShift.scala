package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object arczonalshift {
  type AppliedWeights = js.Dictionary[Weight]
  type AvailabilityZone = String
  type AvailabilityZones = js.Array[AvailabilityZone]
  type ExpiresIn = String
  type ExpiryTime = js.Date
  type ManagedResourceSummaries = js.Array[ManagedResourceSummary]
  type MaxResults = Int
  type ResourceArn = String
  type ResourceIdentifier = String
  type ResourceName = String
  type StartTime = js.Date
  type Weight = Float
  type ZonalShiftComment = String
  type ZonalShiftId = String
  type ZonalShiftSummaries = js.Array[ZonalShiftSummary]
  type ZonalShiftsInResource = js.Array[ZonalShiftInResource]

  final class ARCZonalShiftOps(private val service: ARCZonalShift) extends AnyVal {

    @inline def cancelZonalShiftFuture(params: CancelZonalShiftRequest): Future[ZonalShift] = service.cancelZonalShift(params).promise().toFuture
    @inline def getManagedResourceFuture(params: GetManagedResourceRequest): Future[GetManagedResourceResponse] = service.getManagedResource(params).promise().toFuture
    @inline def listManagedResourcesFuture(params: ListManagedResourcesRequest): Future[ListManagedResourcesResponse] = service.listManagedResources(params).promise().toFuture
    @inline def listZonalShiftsFuture(params: ListZonalShiftsRequest): Future[ListZonalShiftsResponse] = service.listZonalShifts(params).promise().toFuture
    @inline def startZonalShiftFuture(params: StartZonalShiftRequest): Future[ZonalShift] = service.startZonalShift(params).promise().toFuture
    @inline def updateZonalShiftFuture(params: UpdateZonalShiftRequest): Future[ZonalShift] = service.updateZonalShift(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/arczonalshift", JSImport.Namespace, "AWS.ARCZonalShift")
  class ARCZonalShift() extends js.Object {
    def this(config: AWSConfig) = this()

    def cancelZonalShift(params: CancelZonalShiftRequest): Request[ZonalShift] = js.native
    def getManagedResource(params: GetManagedResourceRequest): Request[GetManagedResourceResponse] = js.native
    def listManagedResources(params: ListManagedResourcesRequest): Request[ListManagedResourcesResponse] = js.native
    def listZonalShifts(params: ListZonalShiftsRequest): Request[ListZonalShiftsResponse] = js.native
    def startZonalShift(params: StartZonalShiftRequest): Request[ZonalShift] = js.native
    def updateZonalShift(params: UpdateZonalShiftRequest): Request[ZonalShift] = js.native
  }
  object ARCZonalShift {
    @inline implicit def toOps(service: ARCZonalShift): ARCZonalShiftOps = {
      new ARCZonalShiftOps(service)
    }
  }

  @js.native
  trait CancelZonalShiftRequest extends js.Object {
    var zonalShiftId: ZonalShiftId
  }

  object CancelZonalShiftRequest {
    @inline
    def apply(
        zonalShiftId: ZonalShiftId
    ): CancelZonalShiftRequest = {
      val __obj = js.Dynamic.literal(
        "zonalShiftId" -> zonalShiftId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CancelZonalShiftRequest]
    }
  }

  @js.native
  trait GetManagedResourceRequest extends js.Object {
    var resourceIdentifier: ResourceIdentifier
  }

  object GetManagedResourceRequest {
    @inline
    def apply(
        resourceIdentifier: ResourceIdentifier
    ): GetManagedResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceIdentifier" -> resourceIdentifier.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetManagedResourceRequest]
    }
  }

  @js.native
  trait GetManagedResourceResponse extends js.Object {
    var appliedWeights: AppliedWeights
    var zonalShifts: ZonalShiftsInResource
    var arn: js.UndefOr[ResourceArn]
    var name: js.UndefOr[ResourceName]
  }

  object GetManagedResourceResponse {
    @inline
    def apply(
        appliedWeights: AppliedWeights,
        zonalShifts: ZonalShiftsInResource,
        arn: js.UndefOr[ResourceArn] = js.undefined,
        name: js.UndefOr[ResourceName] = js.undefined
    ): GetManagedResourceResponse = {
      val __obj = js.Dynamic.literal(
        "appliedWeights" -> appliedWeights.asInstanceOf[js.Any],
        "zonalShifts" -> zonalShifts.asInstanceOf[js.Any]
      )

      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetManagedResourceResponse]
    }
  }

  @js.native
  trait ListManagedResourcesRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[String]
  }

  object ListManagedResourcesRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListManagedResourcesRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListManagedResourcesRequest]
    }
  }

  @js.native
  trait ListManagedResourcesResponse extends js.Object {
    var items: ManagedResourceSummaries
    var nextToken: js.UndefOr[String]
  }

  object ListManagedResourcesResponse {
    @inline
    def apply(
        items: ManagedResourceSummaries,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListManagedResourcesResponse = {
      val __obj = js.Dynamic.literal(
        "items" -> items.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListManagedResourcesResponse]
    }
  }

  @js.native
  trait ListZonalShiftsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[String]
    var status: js.UndefOr[ZonalShiftStatus]
  }

  object ListZonalShiftsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined,
        status: js.UndefOr[ZonalShiftStatus] = js.undefined
    ): ListZonalShiftsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListZonalShiftsRequest]
    }
  }

  @js.native
  trait ListZonalShiftsResponse extends js.Object {
    var items: js.UndefOr[ZonalShiftSummaries]
    var nextToken: js.UndefOr[String]
  }

  object ListZonalShiftsResponse {
    @inline
    def apply(
        items: js.UndefOr[ZonalShiftSummaries] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListZonalShiftsResponse = {
      val __obj = js.Dynamic.literal()
      items.foreach(__v => __obj.updateDynamic("items")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListZonalShiftsResponse]
    }
  }

  /** A complex structure for a managed resource in an account. A managed resource is a Network Load Balancer or Application Load Balancer that has been registered with Route 53 ARC by Elastic Load Balancing. You can start a zonal shift in Route 53 ARC for a managed resource to temporarily move traffic for the resource away from an Availability Zone in an AWS Region.
    *
    * '''Note:'''At this time, you can only start a zonal shift for Network Load Balancers and Application Load Balancers with cross-zone load balancing turned off.
    */
  @js.native
  trait ManagedResourceSummary extends js.Object {
    var availabilityZones: AvailabilityZones
    var arn: js.UndefOr[ResourceArn]
    var name: js.UndefOr[ResourceName]
  }

  object ManagedResourceSummary {
    @inline
    def apply(
        availabilityZones: AvailabilityZones,
        arn: js.UndefOr[ResourceArn] = js.undefined,
        name: js.UndefOr[ResourceName] = js.undefined
    ): ManagedResourceSummary = {
      val __obj = js.Dynamic.literal(
        "availabilityZones" -> availabilityZones.asInstanceOf[js.Any]
      )

      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ManagedResourceSummary]
    }
  }

  @js.native
  trait StartZonalShiftRequest extends js.Object {
    var awayFrom: AvailabilityZone
    var comment: ZonalShiftComment
    var expiresIn: ExpiresIn
    var resourceIdentifier: ResourceIdentifier
  }

  object StartZonalShiftRequest {
    @inline
    def apply(
        awayFrom: AvailabilityZone,
        comment: ZonalShiftComment,
        expiresIn: ExpiresIn,
        resourceIdentifier: ResourceIdentifier
    ): StartZonalShiftRequest = {
      val __obj = js.Dynamic.literal(
        "awayFrom" -> awayFrom.asInstanceOf[js.Any],
        "comment" -> comment.asInstanceOf[js.Any],
        "expiresIn" -> expiresIn.asInstanceOf[js.Any],
        "resourceIdentifier" -> resourceIdentifier.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartZonalShiftRequest]
    }
  }

  @js.native
  trait UpdateZonalShiftRequest extends js.Object {
    var zonalShiftId: ZonalShiftId
    var comment: js.UndefOr[ZonalShiftComment]
    var expiresIn: js.UndefOr[ExpiresIn]
  }

  object UpdateZonalShiftRequest {
    @inline
    def apply(
        zonalShiftId: ZonalShiftId,
        comment: js.UndefOr[ZonalShiftComment] = js.undefined,
        expiresIn: js.UndefOr[ExpiresIn] = js.undefined
    ): UpdateZonalShiftRequest = {
      val __obj = js.Dynamic.literal(
        "zonalShiftId" -> zonalShiftId.asInstanceOf[js.Any]
      )

      comment.foreach(__v => __obj.updateDynamic("comment")(__v.asInstanceOf[js.Any]))
      expiresIn.foreach(__v => __obj.updateDynamic("expiresIn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateZonalShiftRequest]
    }
  }

  @js.native
  trait ZonalShift extends js.Object {
    var awayFrom: AvailabilityZone
    var comment: ZonalShiftComment
    var expiryTime: ExpiryTime
    var resourceIdentifier: ResourceIdentifier
    var startTime: StartTime
    var status: ZonalShiftStatus
    var zonalShiftId: ZonalShiftId
  }

  object ZonalShift {
    @inline
    def apply(
        awayFrom: AvailabilityZone,
        comment: ZonalShiftComment,
        expiryTime: ExpiryTime,
        resourceIdentifier: ResourceIdentifier,
        startTime: StartTime,
        status: ZonalShiftStatus,
        zonalShiftId: ZonalShiftId
    ): ZonalShift = {
      val __obj = js.Dynamic.literal(
        "awayFrom" -> awayFrom.asInstanceOf[js.Any],
        "comment" -> comment.asInstanceOf[js.Any],
        "expiryTime" -> expiryTime.asInstanceOf[js.Any],
        "resourceIdentifier" -> resourceIdentifier.asInstanceOf[js.Any],
        "startTime" -> startTime.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any],
        "zonalShiftId" -> zonalShiftId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ZonalShift]
    }
  }

  /** A complex structure that lists the zonal shifts for a managed resource and their statuses for the resource.
    */
  @js.native
  trait ZonalShiftInResource extends js.Object {
    var appliedStatus: AppliedStatus
    var awayFrom: AvailabilityZone
    var comment: ZonalShiftComment
    var expiryTime: ExpiryTime
    var resourceIdentifier: ResourceIdentifier
    var startTime: StartTime
    var zonalShiftId: ZonalShiftId
  }

  object ZonalShiftInResource {
    @inline
    def apply(
        appliedStatus: AppliedStatus,
        awayFrom: AvailabilityZone,
        comment: ZonalShiftComment,
        expiryTime: ExpiryTime,
        resourceIdentifier: ResourceIdentifier,
        startTime: StartTime,
        zonalShiftId: ZonalShiftId
    ): ZonalShiftInResource = {
      val __obj = js.Dynamic.literal(
        "appliedStatus" -> appliedStatus.asInstanceOf[js.Any],
        "awayFrom" -> awayFrom.asInstanceOf[js.Any],
        "comment" -> comment.asInstanceOf[js.Any],
        "expiryTime" -> expiryTime.asInstanceOf[js.Any],
        "resourceIdentifier" -> resourceIdentifier.asInstanceOf[js.Any],
        "startTime" -> startTime.asInstanceOf[js.Any],
        "zonalShiftId" -> zonalShiftId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ZonalShiftInResource]
    }
  }

  /** You start a zonal shift to temporarily move load balancer traffic away from an Availability Zone in a AWS Region. A zonal shift helps your application recover immediately, for example, from a developer's bad code deployment or from an AWS infrastructure failure in a single Availability Zone. You can start a zonal shift in Route 53 ARC only for managed resources in your account in an AWS Region. Supported AWS resources are automatically registered with Route 53 ARC. Zonal shifts are temporary. A zonal shift can be active for up to three days (72 hours). When you start a zonal shift, you specify how long you want it to be active, which Amazon Route 53 Application Recovery Controller converts to an expiry time (expiration time). You can cancel a zonal shift, for example, if you're ready to restore traffic to the Availability Zone. Or you can extend the zonal shift by updating the expiration so the zonal shift is active longer.
    */
  @js.native
  trait ZonalShiftSummary extends js.Object {
    var awayFrom: AvailabilityZone
    var comment: ZonalShiftComment
    var expiryTime: ExpiryTime
    var resourceIdentifier: ResourceIdentifier
    var startTime: StartTime
    var status: ZonalShiftStatus
    var zonalShiftId: ZonalShiftId
  }

  object ZonalShiftSummary {
    @inline
    def apply(
        awayFrom: AvailabilityZone,
        comment: ZonalShiftComment,
        expiryTime: ExpiryTime,
        resourceIdentifier: ResourceIdentifier,
        startTime: StartTime,
        status: ZonalShiftStatus,
        zonalShiftId: ZonalShiftId
    ): ZonalShiftSummary = {
      val __obj = js.Dynamic.literal(
        "awayFrom" -> awayFrom.asInstanceOf[js.Any],
        "comment" -> comment.asInstanceOf[js.Any],
        "expiryTime" -> expiryTime.asInstanceOf[js.Any],
        "resourceIdentifier" -> resourceIdentifier.asInstanceOf[js.Any],
        "startTime" -> startTime.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any],
        "zonalShiftId" -> zonalShiftId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ZonalShiftSummary]
    }
  }
}
