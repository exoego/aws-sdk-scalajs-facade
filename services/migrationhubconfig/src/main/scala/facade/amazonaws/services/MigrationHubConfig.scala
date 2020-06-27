package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object migrationhubconfig {
  type ControlId                            = String
  type DescribeHomeRegionControlsMaxResults = Int
  type DryRun                               = Boolean
  type HomeRegion                           = String
  type HomeRegionControls                   = js.Array[HomeRegionControl]
  type RequestedTime                        = js.Date
  type TargetId                             = String
  type Token                                = String

  implicit final class MigrationHubConfigOps(private val service: MigrationHubConfig) extends AnyVal {

    @inline def createHomeRegionControlFuture(
        params: CreateHomeRegionControlRequest
    ): Future[CreateHomeRegionControlResult] = service.createHomeRegionControl(params).promise().toFuture
    @inline def describeHomeRegionControlsFuture(
        params: DescribeHomeRegionControlsRequest
    ): Future[DescribeHomeRegionControlsResult] = service.describeHomeRegionControls(params).promise().toFuture
    @inline def getHomeRegionFuture(params: GetHomeRegionRequest): Future[GetHomeRegionResult] =
      service.getHomeRegion(params).promise().toFuture
  }
}

package migrationhubconfig {
  @js.native
  @JSImport("aws-sdk", "MigrationHubConfig")
  class MigrationHubConfig() extends js.Object {
    def this(config: AWSConfig) = this()

    def createHomeRegionControl(params: CreateHomeRegionControlRequest): Request[CreateHomeRegionControlResult] =
      js.native
    def describeHomeRegionControls(
        params: DescribeHomeRegionControlsRequest
    ): Request[DescribeHomeRegionControlsResult]                                  = js.native
    def getHomeRegion(params: GetHomeRegionRequest): Request[GetHomeRegionResult] = js.native
  }

  @js.native
  @Factory
  trait CreateHomeRegionControlRequest extends js.Object {
    var HomeRegion: HomeRegion
    var Target: Target
    var DryRun: js.UndefOr[DryRun]
  }

  @js.native
  @Factory
  trait CreateHomeRegionControlResult extends js.Object {
    var HomeRegionControl: js.UndefOr[HomeRegionControl]
  }

  @js.native
  @Factory
  trait DescribeHomeRegionControlsRequest extends js.Object {
    var ControlId: js.UndefOr[ControlId]
    var HomeRegion: js.UndefOr[HomeRegion]
    var MaxResults: js.UndefOr[DescribeHomeRegionControlsMaxResults]
    var NextToken: js.UndefOr[Token]
    var Target: js.UndefOr[Target]
  }

  @js.native
  @Factory
  trait DescribeHomeRegionControlsResult extends js.Object {
    var HomeRegionControls: js.UndefOr[HomeRegionControls]
    var NextToken: js.UndefOr[Token]
  }

  @js.native
  @Factory
  trait GetHomeRegionRequest extends js.Object {}

  @js.native
  @Factory
  trait GetHomeRegionResult extends js.Object {
    var HomeRegion: js.UndefOr[HomeRegion]
  }

  /**
    * A home region control is an object that specifies the home region for an account, with some additional information. It contains a target (always of type <code>ACCOUNT</code>), an ID, and a time at which the home region was set.
    */
  @js.native
  @Factory
  trait HomeRegionControl extends js.Object {
    var ControlId: js.UndefOr[ControlId]
    var HomeRegion: js.UndefOr[HomeRegion]
    var RequestedTime: js.UndefOr[RequestedTime]
    var Target: js.UndefOr[Target]
  }

  /**
    * The target parameter specifies the identifier to which the home region is applied, which is always an <code>ACCOUNT</code>. It applies the home region to the current <code>ACCOUNT</code>.
    */
  @js.native
  @Factory
  trait Target extends js.Object {
    var Type: TargetType
    var Id: js.UndefOr[TargetId]
  }

  @js.native
  sealed trait TargetType extends js.Any
  object TargetType extends js.Object {
    val ACCOUNT = "ACCOUNT".asInstanceOf[TargetType]

    val values = js.Object.freeze(js.Array(ACCOUNT))
  }
}
