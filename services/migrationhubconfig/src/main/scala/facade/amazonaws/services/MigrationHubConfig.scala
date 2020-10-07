package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object migrationhubconfig {
  type ControlId = String
  type DescribeHomeRegionControlsMaxResults = Int
  type DryRun = Boolean
  type HomeRegion = String
  type HomeRegionControls = js.Array[HomeRegionControl]
  type RequestedTime = js.Date
  type TargetId = String
  type Token = String

  implicit final class MigrationHubConfigOps(private val service: MigrationHubConfig) extends AnyVal {

    @inline def createHomeRegionControlFuture(params: CreateHomeRegionControlRequest): Future[CreateHomeRegionControlResult] = service.createHomeRegionControl(params).promise().toFuture
    @inline def describeHomeRegionControlsFuture(params: DescribeHomeRegionControlsRequest): Future[DescribeHomeRegionControlsResult] = service.describeHomeRegionControls(params).promise().toFuture
    @inline def getHomeRegionFuture(params: GetHomeRegionRequest): Future[GetHomeRegionResult] = service.getHomeRegion(params).promise().toFuture

  }
}

package migrationhubconfig {
  @js.native
  @JSImport("aws-sdk/clients/migrationhubconfig", JSImport.Namespace, "AWS.MigrationHubConfig")
  class MigrationHubConfig() extends js.Object {
    def this(config: AWSConfig) = this()

    def createHomeRegionControl(params: CreateHomeRegionControlRequest): Request[CreateHomeRegionControlResult] = js.native
    def describeHomeRegionControls(params: DescribeHomeRegionControlsRequest): Request[DescribeHomeRegionControlsResult] = js.native
    def getHomeRegion(params: GetHomeRegionRequest): Request[GetHomeRegionResult] = js.native
  }

  @js.native
  trait CreateHomeRegionControlRequest extends js.Object {
    var HomeRegion: HomeRegion
    var Target: Target
    var DryRun: js.UndefOr[DryRun]
  }

  object CreateHomeRegionControlRequest {
    @inline
    def apply(
        HomeRegion: HomeRegion,
        Target: Target,
        DryRun: js.UndefOr[DryRun] = js.undefined
    ): CreateHomeRegionControlRequest = {
      val __obj = js.Dynamic.literal(
        "HomeRegion" -> HomeRegion.asInstanceOf[js.Any],
        "Target" -> Target.asInstanceOf[js.Any]
      )

      DryRun.foreach(__v => __obj.updateDynamic("DryRun")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateHomeRegionControlRequest]
    }
  }

  @js.native
  trait CreateHomeRegionControlResult extends js.Object {
    var HomeRegionControl: js.UndefOr[HomeRegionControl]
  }

  object CreateHomeRegionControlResult {
    @inline
    def apply(
        HomeRegionControl: js.UndefOr[HomeRegionControl] = js.undefined
    ): CreateHomeRegionControlResult = {
      val __obj = js.Dynamic.literal()
      HomeRegionControl.foreach(__v => __obj.updateDynamic("HomeRegionControl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateHomeRegionControlResult]
    }
  }

  @js.native
  trait DescribeHomeRegionControlsRequest extends js.Object {
    var ControlId: js.UndefOr[ControlId]
    var HomeRegion: js.UndefOr[HomeRegion]
    var MaxResults: js.UndefOr[DescribeHomeRegionControlsMaxResults]
    var NextToken: js.UndefOr[Token]
    var Target: js.UndefOr[Target]
  }

  object DescribeHomeRegionControlsRequest {
    @inline
    def apply(
        ControlId: js.UndefOr[ControlId] = js.undefined,
        HomeRegion: js.UndefOr[HomeRegion] = js.undefined,
        MaxResults: js.UndefOr[DescribeHomeRegionControlsMaxResults] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined,
        Target: js.UndefOr[Target] = js.undefined
    ): DescribeHomeRegionControlsRequest = {
      val __obj = js.Dynamic.literal()
      ControlId.foreach(__v => __obj.updateDynamic("ControlId")(__v.asInstanceOf[js.Any]))
      HomeRegion.foreach(__v => __obj.updateDynamic("HomeRegion")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Target.foreach(__v => __obj.updateDynamic("Target")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeHomeRegionControlsRequest]
    }
  }

  @js.native
  trait DescribeHomeRegionControlsResult extends js.Object {
    var HomeRegionControls: js.UndefOr[HomeRegionControls]
    var NextToken: js.UndefOr[Token]
  }

  object DescribeHomeRegionControlsResult {
    @inline
    def apply(
        HomeRegionControls: js.UndefOr[HomeRegionControls] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): DescribeHomeRegionControlsResult = {
      val __obj = js.Dynamic.literal()
      HomeRegionControls.foreach(__v => __obj.updateDynamic("HomeRegionControls")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeHomeRegionControlsResult]
    }
  }

  @js.native
  trait GetHomeRegionRequest extends js.Object {}

  object GetHomeRegionRequest {
    @inline
    def apply(
    ): GetHomeRegionRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetHomeRegionRequest]
    }
  }

  @js.native
  trait GetHomeRegionResult extends js.Object {
    var HomeRegion: js.UndefOr[HomeRegion]
  }

  object GetHomeRegionResult {
    @inline
    def apply(
        HomeRegion: js.UndefOr[HomeRegion] = js.undefined
    ): GetHomeRegionResult = {
      val __obj = js.Dynamic.literal()
      HomeRegion.foreach(__v => __obj.updateDynamic("HomeRegion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetHomeRegionResult]
    }
  }

  /** A home region control is an object that specifies the home region for an account, with some additional information. It contains a target (always of type <code>ACCOUNT</code>), an ID, and a time at which the home region was set.
    */
  @js.native
  trait HomeRegionControl extends js.Object {
    var ControlId: js.UndefOr[ControlId]
    var HomeRegion: js.UndefOr[HomeRegion]
    var RequestedTime: js.UndefOr[RequestedTime]
    var Target: js.UndefOr[Target]
  }

  object HomeRegionControl {
    @inline
    def apply(
        ControlId: js.UndefOr[ControlId] = js.undefined,
        HomeRegion: js.UndefOr[HomeRegion] = js.undefined,
        RequestedTime: js.UndefOr[RequestedTime] = js.undefined,
        Target: js.UndefOr[Target] = js.undefined
    ): HomeRegionControl = {
      val __obj = js.Dynamic.literal()
      ControlId.foreach(__v => __obj.updateDynamic("ControlId")(__v.asInstanceOf[js.Any]))
      HomeRegion.foreach(__v => __obj.updateDynamic("HomeRegion")(__v.asInstanceOf[js.Any]))
      RequestedTime.foreach(__v => __obj.updateDynamic("RequestedTime")(__v.asInstanceOf[js.Any]))
      Target.foreach(__v => __obj.updateDynamic("Target")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HomeRegionControl]
    }
  }

  /** The target parameter specifies the identifier to which the home region is applied, which is always an <code>ACCOUNT</code>. It applies the home region to the current <code>ACCOUNT</code>.
    */
  @js.native
  trait Target extends js.Object {
    var Type: TargetType
    var Id: js.UndefOr[TargetId]
  }

  object Target {
    @inline
    def apply(
        Type: TargetType,
        Id: js.UndefOr[TargetId] = js.undefined
    ): Target = {
      val __obj = js.Dynamic.literal(
        "Type" -> Type.asInstanceOf[js.Any]
      )

      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Target]
    }
  }

  @js.native
  sealed trait TargetType extends js.Any
  object TargetType {
    val ACCOUNT = "ACCOUNT".asInstanceOf[TargetType]

    @inline def values = js.Array(ACCOUNT)
  }
}
