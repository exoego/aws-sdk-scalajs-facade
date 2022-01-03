package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object route53recoverycontrolconfig {
  type MaxResults = Int
  type __boolean = Boolean
  type __integer = Int
  type __listOfCluster = js.Array[Cluster]
  type __listOfClusterEndpoint = js.Array[ClusterEndpoint]
  type __listOfControlPanel = js.Array[ControlPanel]
  type __listOfRoutingControl = js.Array[RoutingControl]
  type __listOfRule = js.Array[Rule]
  type __listOf__string = js.Array[__string]
  type __listOf__stringMax36PatternS = js.Array[__stringMax36PatternS]
  type __listOf__stringMin1Max256PatternAZaZ09 = js.Array[__stringMin1Max256PatternAZaZ09]
  type __mapOf__stringMin0Max256PatternS = js.Dictionary[__stringMin0Max256PatternS]
  type __string = String
  type __stringMax36PatternS = String
  type __stringMin0Max256PatternS = String
  type __stringMin1Max128PatternAZaZ09 = String
  type __stringMin1Max256PatternAZaZ09 = String
  type __stringMin1Max32PatternS = String
  type __stringMin1Max64PatternS = String
  type __stringMin1Max8096PatternS = String

  final class Route53RecoveryControlConfigOps(private val service: Route53RecoveryControlConfig) extends AnyVal {

    @inline def createClusterFuture(params: CreateClusterRequest): Future[CreateClusterResponse] = service.createCluster(params).promise().toFuture
    @inline def createControlPanelFuture(params: CreateControlPanelRequest): Future[CreateControlPanelResponse] = service.createControlPanel(params).promise().toFuture
    @inline def createRoutingControlFuture(params: CreateRoutingControlRequest): Future[CreateRoutingControlResponse] = service.createRoutingControl(params).promise().toFuture
    @inline def createSafetyRuleFuture(params: CreateSafetyRuleRequest): Future[CreateSafetyRuleResponse] = service.createSafetyRule(params).promise().toFuture
    @inline def deleteClusterFuture(params: DeleteClusterRequest): Future[DeleteClusterResponse] = service.deleteCluster(params).promise().toFuture
    @inline def deleteControlPanelFuture(params: DeleteControlPanelRequest): Future[DeleteControlPanelResponse] = service.deleteControlPanel(params).promise().toFuture
    @inline def deleteRoutingControlFuture(params: DeleteRoutingControlRequest): Future[DeleteRoutingControlResponse] = service.deleteRoutingControl(params).promise().toFuture
    @inline def deleteSafetyRuleFuture(params: DeleteSafetyRuleRequest): Future[DeleteSafetyRuleResponse] = service.deleteSafetyRule(params).promise().toFuture
    @inline def describeClusterFuture(params: DescribeClusterRequest): Future[DescribeClusterResponse] = service.describeCluster(params).promise().toFuture
    @inline def describeControlPanelFuture(params: DescribeControlPanelRequest): Future[DescribeControlPanelResponse] = service.describeControlPanel(params).promise().toFuture
    @inline def describeRoutingControlFuture(params: DescribeRoutingControlRequest): Future[DescribeRoutingControlResponse] = service.describeRoutingControl(params).promise().toFuture
    @inline def describeSafetyRuleFuture(params: DescribeSafetyRuleRequest): Future[DescribeSafetyRuleResponse] = service.describeSafetyRule(params).promise().toFuture
    @inline def listAssociatedRoute53HealthChecksFuture(params: ListAssociatedRoute53HealthChecksRequest): Future[ListAssociatedRoute53HealthChecksResponse] = service.listAssociatedRoute53HealthChecks(params).promise().toFuture
    @inline def listClustersFuture(params: ListClustersRequest): Future[ListClustersResponse] = service.listClusters(params).promise().toFuture
    @inline def listControlPanelsFuture(params: ListControlPanelsRequest): Future[ListControlPanelsResponse] = service.listControlPanels(params).promise().toFuture
    @inline def listRoutingControlsFuture(params: ListRoutingControlsRequest): Future[ListRoutingControlsResponse] = service.listRoutingControls(params).promise().toFuture
    @inline def listSafetyRulesFuture(params: ListSafetyRulesRequest): Future[ListSafetyRulesResponse] = service.listSafetyRules(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateControlPanelFuture(params: UpdateControlPanelRequest): Future[UpdateControlPanelResponse] = service.updateControlPanel(params).promise().toFuture
    @inline def updateRoutingControlFuture(params: UpdateRoutingControlRequest): Future[UpdateRoutingControlResponse] = service.updateRoutingControl(params).promise().toFuture
    @inline def updateSafetyRuleFuture(params: UpdateSafetyRuleRequest): Future[UpdateSafetyRuleResponse] = service.updateSafetyRule(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/route53recoverycontrolconfig", JSImport.Namespace, "AWS.Route53RecoveryControlConfig")
  class Route53RecoveryControlConfig() extends js.Object {
    def this(config: AWSConfig) = this()

    def createCluster(params: CreateClusterRequest): Request[CreateClusterResponse] = js.native
    def createControlPanel(params: CreateControlPanelRequest): Request[CreateControlPanelResponse] = js.native
    def createRoutingControl(params: CreateRoutingControlRequest): Request[CreateRoutingControlResponse] = js.native
    def createSafetyRule(params: CreateSafetyRuleRequest): Request[CreateSafetyRuleResponse] = js.native
    def deleteCluster(params: DeleteClusterRequest): Request[DeleteClusterResponse] = js.native
    def deleteControlPanel(params: DeleteControlPanelRequest): Request[DeleteControlPanelResponse] = js.native
    def deleteRoutingControl(params: DeleteRoutingControlRequest): Request[DeleteRoutingControlResponse] = js.native
    def deleteSafetyRule(params: DeleteSafetyRuleRequest): Request[DeleteSafetyRuleResponse] = js.native
    def describeCluster(params: DescribeClusterRequest): Request[DescribeClusterResponse] = js.native
    def describeControlPanel(params: DescribeControlPanelRequest): Request[DescribeControlPanelResponse] = js.native
    def describeRoutingControl(params: DescribeRoutingControlRequest): Request[DescribeRoutingControlResponse] = js.native
    def describeSafetyRule(params: DescribeSafetyRuleRequest): Request[DescribeSafetyRuleResponse] = js.native
    def listAssociatedRoute53HealthChecks(params: ListAssociatedRoute53HealthChecksRequest): Request[ListAssociatedRoute53HealthChecksResponse] = js.native
    def listClusters(params: ListClustersRequest): Request[ListClustersResponse] = js.native
    def listControlPanels(params: ListControlPanelsRequest): Request[ListControlPanelsResponse] = js.native
    def listRoutingControls(params: ListRoutingControlsRequest): Request[ListRoutingControlsResponse] = js.native
    def listSafetyRules(params: ListSafetyRulesRequest): Request[ListSafetyRulesResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateControlPanel(params: UpdateControlPanelRequest): Request[UpdateControlPanelResponse] = js.native
    def updateRoutingControl(params: UpdateRoutingControlRequest): Request[UpdateRoutingControlResponse] = js.native
    def updateSafetyRule(params: UpdateSafetyRuleRequest): Request[UpdateSafetyRuleResponse] = js.native
  }
  object Route53RecoveryControlConfig {
    @inline implicit def toOps(service: Route53RecoveryControlConfig): Route53RecoveryControlConfigOps = {
      new Route53RecoveryControlConfigOps(service)
    }
  }

  /** An assertion rule enforces that, when you change a routing control state, that the criteria that you set in the rule configuration is met. Otherwise, the change to the routing control is not accepted. For example, the criteria might be that at least one routing control state is On after the transation so that traffic continues to flow to at least one cell for the application. This ensures that you avoid a fail-open scenario.
    */
  @js.native
  trait AssertionRule extends js.Object {
    var AssertedControls: __listOf__stringMin1Max256PatternAZaZ09
    var ControlPanelArn: __stringMin1Max256PatternAZaZ09
    var Name: __stringMin1Max64PatternS
    var RuleConfig: RuleConfig
    var SafetyRuleArn: __stringMin1Max256PatternAZaZ09
    var Status: Status
    var WaitPeriodMs: __integer
  }

  object AssertionRule {
    @inline
    def apply(
        AssertedControls: __listOf__stringMin1Max256PatternAZaZ09,
        ControlPanelArn: __stringMin1Max256PatternAZaZ09,
        Name: __stringMin1Max64PatternS,
        RuleConfig: RuleConfig,
        SafetyRuleArn: __stringMin1Max256PatternAZaZ09,
        Status: Status,
        WaitPeriodMs: __integer
    ): AssertionRule = {
      val __obj = js.Dynamic.literal(
        "AssertedControls" -> AssertedControls.asInstanceOf[js.Any],
        "ControlPanelArn" -> ControlPanelArn.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "RuleConfig" -> RuleConfig.asInstanceOf[js.Any],
        "SafetyRuleArn" -> SafetyRuleArn.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any],
        "WaitPeriodMs" -> WaitPeriodMs.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssertionRule]
    }
  }

  /** An update to an assertion rule. You can update the name or the evaluation period (wait period). If you don't specify one of the items to update, the item is unchanged.
    */
  @js.native
  trait AssertionRuleUpdate extends js.Object {
    var Name: __stringMin1Max64PatternS
    var SafetyRuleArn: __stringMin1Max256PatternAZaZ09
    var WaitPeriodMs: __integer
  }

  object AssertionRuleUpdate {
    @inline
    def apply(
        Name: __stringMin1Max64PatternS,
        SafetyRuleArn: __stringMin1Max256PatternAZaZ09,
        WaitPeriodMs: __integer
    ): AssertionRuleUpdate = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "SafetyRuleArn" -> SafetyRuleArn.asInstanceOf[js.Any],
        "WaitPeriodMs" -> WaitPeriodMs.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssertionRuleUpdate]
    }
  }

  /** A set of five redundant Regional endpoints against which you can execute API calls to update or get the state of routing controls. You can host multiple control panels and routing controls on one cluster.
    */
  @js.native
  trait Cluster extends js.Object {
    var ClusterArn: js.UndefOr[__stringMin1Max256PatternAZaZ09]
    var ClusterEndpoints: js.UndefOr[__listOfClusterEndpoint]
    var Name: js.UndefOr[__stringMin1Max64PatternS]
    var Status: js.UndefOr[Status]
  }

  object Cluster {
    @inline
    def apply(
        ClusterArn: js.UndefOr[__stringMin1Max256PatternAZaZ09] = js.undefined,
        ClusterEndpoints: js.UndefOr[__listOfClusterEndpoint] = js.undefined,
        Name: js.UndefOr[__stringMin1Max64PatternS] = js.undefined,
        Status: js.UndefOr[Status] = js.undefined
    ): Cluster = {
      val __obj = js.Dynamic.literal()
      ClusterArn.foreach(__v => __obj.updateDynamic("ClusterArn")(__v.asInstanceOf[js.Any]))
      ClusterEndpoints.foreach(__v => __obj.updateDynamic("ClusterEndpoints")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Cluster]
    }
  }

  /** A cluster endpoint. Specify an endpoint when you want to set or retrieve a routing control state in the cluster.
    */
  @js.native
  trait ClusterEndpoint extends js.Object {
    var Endpoint: js.UndefOr[__stringMin1Max128PatternAZaZ09]
    var Region: js.UndefOr[__stringMin1Max32PatternS]
  }

  object ClusterEndpoint {
    @inline
    def apply(
        Endpoint: js.UndefOr[__stringMin1Max128PatternAZaZ09] = js.undefined,
        Region: js.UndefOr[__stringMin1Max32PatternS] = js.undefined
    ): ClusterEndpoint = {
      val __obj = js.Dynamic.literal()
      Endpoint.foreach(__v => __obj.updateDynamic("Endpoint")(__v.asInstanceOf[js.Any]))
      Region.foreach(__v => __obj.updateDynamic("Region")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClusterEndpoint]
    }
  }

  /** A control panel represents a group of routing controls that can be changed together in a single transaction.
    */
  @js.native
  trait ControlPanel extends js.Object {
    var ClusterArn: js.UndefOr[__stringMin1Max256PatternAZaZ09]
    var ControlPanelArn: js.UndefOr[__stringMin1Max256PatternAZaZ09]
    var DefaultControlPanel: js.UndefOr[__boolean]
    var Name: js.UndefOr[__stringMin1Max64PatternS]
    var RoutingControlCount: js.UndefOr[__integer]
    var Status: js.UndefOr[Status]
  }

  object ControlPanel {
    @inline
    def apply(
        ClusterArn: js.UndefOr[__stringMin1Max256PatternAZaZ09] = js.undefined,
        ControlPanelArn: js.UndefOr[__stringMin1Max256PatternAZaZ09] = js.undefined,
        DefaultControlPanel: js.UndefOr[__boolean] = js.undefined,
        Name: js.UndefOr[__stringMin1Max64PatternS] = js.undefined,
        RoutingControlCount: js.UndefOr[__integer] = js.undefined,
        Status: js.UndefOr[Status] = js.undefined
    ): ControlPanel = {
      val __obj = js.Dynamic.literal()
      ClusterArn.foreach(__v => __obj.updateDynamic("ClusterArn")(__v.asInstanceOf[js.Any]))
      ControlPanelArn.foreach(__v => __obj.updateDynamic("ControlPanelArn")(__v.asInstanceOf[js.Any]))
      DefaultControlPanel.foreach(__v => __obj.updateDynamic("DefaultControlPanel")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      RoutingControlCount.foreach(__v => __obj.updateDynamic("RoutingControlCount")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ControlPanel]
    }
  }

  /** Creates a cluster.
    */
  @js.native
  trait CreateClusterRequest extends js.Object {
    var ClusterName: __stringMin1Max64PatternS
    var ClientToken: js.UndefOr[__stringMin1Max64PatternS]
    var Tags: js.UndefOr[__mapOf__stringMin0Max256PatternS]
  }

  object CreateClusterRequest {
    @inline
    def apply(
        ClusterName: __stringMin1Max64PatternS,
        ClientToken: js.UndefOr[__stringMin1Max64PatternS] = js.undefined,
        Tags: js.UndefOr[__mapOf__stringMin0Max256PatternS] = js.undefined
    ): CreateClusterRequest = {
      val __obj = js.Dynamic.literal(
        "ClusterName" -> ClusterName.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateClusterRequest]
    }
  }

  @js.native
  trait CreateClusterResponse extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  object CreateClusterResponse {
    @inline
    def apply(
        Cluster: js.UndefOr[Cluster] = js.undefined
    ): CreateClusterResponse = {
      val __obj = js.Dynamic.literal()
      Cluster.foreach(__v => __obj.updateDynamic("Cluster")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateClusterResponse]
    }
  }

  /** The details of the control panel that you're creating.
    */
  @js.native
  trait CreateControlPanelRequest extends js.Object {
    var ClusterArn: __stringMin1Max256PatternAZaZ09
    var ControlPanelName: __stringMin1Max64PatternS
    var ClientToken: js.UndefOr[__stringMin1Max64PatternS]
    var Tags: js.UndefOr[__mapOf__stringMin0Max256PatternS]
  }

  object CreateControlPanelRequest {
    @inline
    def apply(
        ClusterArn: __stringMin1Max256PatternAZaZ09,
        ControlPanelName: __stringMin1Max64PatternS,
        ClientToken: js.UndefOr[__stringMin1Max64PatternS] = js.undefined,
        Tags: js.UndefOr[__mapOf__stringMin0Max256PatternS] = js.undefined
    ): CreateControlPanelRequest = {
      val __obj = js.Dynamic.literal(
        "ClusterArn" -> ClusterArn.asInstanceOf[js.Any],
        "ControlPanelName" -> ControlPanelName.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateControlPanelRequest]
    }
  }

  @js.native
  trait CreateControlPanelResponse extends js.Object {
    var ControlPanel: js.UndefOr[ControlPanel]
  }

  object CreateControlPanelResponse {
    @inline
    def apply(
        ControlPanel: js.UndefOr[ControlPanel] = js.undefined
    ): CreateControlPanelResponse = {
      val __obj = js.Dynamic.literal()
      ControlPanel.foreach(__v => __obj.updateDynamic("ControlPanel")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateControlPanelResponse]
    }
  }

  /** The details of the routing control that you're creating.
    */
  @js.native
  trait CreateRoutingControlRequest extends js.Object {
    var ClusterArn: __stringMin1Max256PatternAZaZ09
    var RoutingControlName: __stringMin1Max64PatternS
    var ClientToken: js.UndefOr[__stringMin1Max64PatternS]
    var ControlPanelArn: js.UndefOr[__stringMin1Max256PatternAZaZ09]
  }

  object CreateRoutingControlRequest {
    @inline
    def apply(
        ClusterArn: __stringMin1Max256PatternAZaZ09,
        RoutingControlName: __stringMin1Max64PatternS,
        ClientToken: js.UndefOr[__stringMin1Max64PatternS] = js.undefined,
        ControlPanelArn: js.UndefOr[__stringMin1Max256PatternAZaZ09] = js.undefined
    ): CreateRoutingControlRequest = {
      val __obj = js.Dynamic.literal(
        "ClusterArn" -> ClusterArn.asInstanceOf[js.Any],
        "RoutingControlName" -> RoutingControlName.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      ControlPanelArn.foreach(__v => __obj.updateDynamic("ControlPanelArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRoutingControlRequest]
    }
  }

  @js.native
  trait CreateRoutingControlResponse extends js.Object {
    var RoutingControl: js.UndefOr[RoutingControl]
  }

  object CreateRoutingControlResponse {
    @inline
    def apply(
        RoutingControl: js.UndefOr[RoutingControl] = js.undefined
    ): CreateRoutingControlResponse = {
      val __obj = js.Dynamic.literal()
      RoutingControl.foreach(__v => __obj.updateDynamic("RoutingControl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRoutingControlResponse]
    }
  }

  /** The request body that you include when you create a safety rule.
    */
  @js.native
  trait CreateSafetyRuleRequest extends js.Object {
    var AssertionRule: js.UndefOr[NewAssertionRule]
    var ClientToken: js.UndefOr[__stringMin1Max64PatternS]
    var GatingRule: js.UndefOr[NewGatingRule]
    var Tags: js.UndefOr[__mapOf__stringMin0Max256PatternS]
  }

  object CreateSafetyRuleRequest {
    @inline
    def apply(
        AssertionRule: js.UndefOr[NewAssertionRule] = js.undefined,
        ClientToken: js.UndefOr[__stringMin1Max64PatternS] = js.undefined,
        GatingRule: js.UndefOr[NewGatingRule] = js.undefined,
        Tags: js.UndefOr[__mapOf__stringMin0Max256PatternS] = js.undefined
    ): CreateSafetyRuleRequest = {
      val __obj = js.Dynamic.literal()
      AssertionRule.foreach(__v => __obj.updateDynamic("AssertionRule")(__v.asInstanceOf[js.Any]))
      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      GatingRule.foreach(__v => __obj.updateDynamic("GatingRule")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSafetyRuleRequest]
    }
  }

  @js.native
  trait CreateSafetyRuleResponse extends js.Object {
    var AssertionRule: js.UndefOr[AssertionRule]
    var GatingRule: js.UndefOr[GatingRule]
  }

  object CreateSafetyRuleResponse {
    @inline
    def apply(
        AssertionRule: js.UndefOr[AssertionRule] = js.undefined,
        GatingRule: js.UndefOr[GatingRule] = js.undefined
    ): CreateSafetyRuleResponse = {
      val __obj = js.Dynamic.literal()
      AssertionRule.foreach(__v => __obj.updateDynamic("AssertionRule")(__v.asInstanceOf[js.Any]))
      GatingRule.foreach(__v => __obj.updateDynamic("GatingRule")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSafetyRuleResponse]
    }
  }

  @js.native
  trait DeleteClusterRequest extends js.Object {
    var ClusterArn: __string
  }

  object DeleteClusterRequest {
    @inline
    def apply(
        ClusterArn: __string
    ): DeleteClusterRequest = {
      val __obj = js.Dynamic.literal(
        "ClusterArn" -> ClusterArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteClusterRequest]
    }
  }

  @js.native
  trait DeleteClusterResponse extends js.Object

  object DeleteClusterResponse {
    @inline
    def apply(): DeleteClusterResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteClusterResponse]
    }
  }

  @js.native
  trait DeleteControlPanelRequest extends js.Object {
    var ControlPanelArn: __string
  }

  object DeleteControlPanelRequest {
    @inline
    def apply(
        ControlPanelArn: __string
    ): DeleteControlPanelRequest = {
      val __obj = js.Dynamic.literal(
        "ControlPanelArn" -> ControlPanelArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteControlPanelRequest]
    }
  }

  @js.native
  trait DeleteControlPanelResponse extends js.Object

  object DeleteControlPanelResponse {
    @inline
    def apply(): DeleteControlPanelResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteControlPanelResponse]
    }
  }

  @js.native
  trait DeleteRoutingControlRequest extends js.Object {
    var RoutingControlArn: __string
  }

  object DeleteRoutingControlRequest {
    @inline
    def apply(
        RoutingControlArn: __string
    ): DeleteRoutingControlRequest = {
      val __obj = js.Dynamic.literal(
        "RoutingControlArn" -> RoutingControlArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteRoutingControlRequest]
    }
  }

  @js.native
  trait DeleteRoutingControlResponse extends js.Object

  object DeleteRoutingControlResponse {
    @inline
    def apply(): DeleteRoutingControlResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteRoutingControlResponse]
    }
  }

  @js.native
  trait DeleteSafetyRuleRequest extends js.Object {
    var SafetyRuleArn: __string
  }

  object DeleteSafetyRuleRequest {
    @inline
    def apply(
        SafetyRuleArn: __string
    ): DeleteSafetyRuleRequest = {
      val __obj = js.Dynamic.literal(
        "SafetyRuleArn" -> SafetyRuleArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteSafetyRuleRequest]
    }
  }

  @js.native
  trait DeleteSafetyRuleResponse extends js.Object

  object DeleteSafetyRuleResponse {
    @inline
    def apply(): DeleteSafetyRuleResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteSafetyRuleResponse]
    }
  }

  @js.native
  trait DescribeClusterRequest extends js.Object {
    var ClusterArn: __string
  }

  object DescribeClusterRequest {
    @inline
    def apply(
        ClusterArn: __string
    ): DescribeClusterRequest = {
      val __obj = js.Dynamic.literal(
        "ClusterArn" -> ClusterArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeClusterRequest]
    }
  }

  @js.native
  trait DescribeClusterResponse extends js.Object {
    var Cluster: js.UndefOr[Cluster]
  }

  object DescribeClusterResponse {
    @inline
    def apply(
        Cluster: js.UndefOr[Cluster] = js.undefined
    ): DescribeClusterResponse = {
      val __obj = js.Dynamic.literal()
      Cluster.foreach(__v => __obj.updateDynamic("Cluster")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeClusterResponse]
    }
  }

  @js.native
  trait DescribeControlPanelRequest extends js.Object {
    var ControlPanelArn: __string
  }

  object DescribeControlPanelRequest {
    @inline
    def apply(
        ControlPanelArn: __string
    ): DescribeControlPanelRequest = {
      val __obj = js.Dynamic.literal(
        "ControlPanelArn" -> ControlPanelArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeControlPanelRequest]
    }
  }

  @js.native
  trait DescribeControlPanelResponse extends js.Object {
    var ControlPanel: js.UndefOr[ControlPanel]
  }

  object DescribeControlPanelResponse {
    @inline
    def apply(
        ControlPanel: js.UndefOr[ControlPanel] = js.undefined
    ): DescribeControlPanelResponse = {
      val __obj = js.Dynamic.literal()
      ControlPanel.foreach(__v => __obj.updateDynamic("ControlPanel")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeControlPanelResponse]
    }
  }

  @js.native
  trait DescribeRoutingControlRequest extends js.Object {
    var RoutingControlArn: __string
  }

  object DescribeRoutingControlRequest {
    @inline
    def apply(
        RoutingControlArn: __string
    ): DescribeRoutingControlRequest = {
      val __obj = js.Dynamic.literal(
        "RoutingControlArn" -> RoutingControlArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeRoutingControlRequest]
    }
  }

  @js.native
  trait DescribeRoutingControlResponse extends js.Object {
    var RoutingControl: js.UndefOr[RoutingControl]
  }

  object DescribeRoutingControlResponse {
    @inline
    def apply(
        RoutingControl: js.UndefOr[RoutingControl] = js.undefined
    ): DescribeRoutingControlResponse = {
      val __obj = js.Dynamic.literal()
      RoutingControl.foreach(__v => __obj.updateDynamic("RoutingControl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRoutingControlResponse]
    }
  }

  @js.native
  trait DescribeSafetyRuleRequest extends js.Object {
    var SafetyRuleArn: __string
  }

  object DescribeSafetyRuleRequest {
    @inline
    def apply(
        SafetyRuleArn: __string
    ): DescribeSafetyRuleRequest = {
      val __obj = js.Dynamic.literal(
        "SafetyRuleArn" -> SafetyRuleArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeSafetyRuleRequest]
    }
  }

  @js.native
  trait DescribeSafetyRuleResponse extends js.Object {
    var AssertionRule: js.UndefOr[AssertionRule]
    var GatingRule: js.UndefOr[GatingRule]
  }

  object DescribeSafetyRuleResponse {
    @inline
    def apply(
        AssertionRule: js.UndefOr[AssertionRule] = js.undefined,
        GatingRule: js.UndefOr[GatingRule] = js.undefined
    ): DescribeSafetyRuleResponse = {
      val __obj = js.Dynamic.literal()
      AssertionRule.foreach(__v => __obj.updateDynamic("AssertionRule")(__v.asInstanceOf[js.Any]))
      GatingRule.foreach(__v => __obj.updateDynamic("GatingRule")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSafetyRuleResponse]
    }
  }

  /** A gating rule verifies that a gating routing control or set of gating rounting controls, evaluates as true, based on a rule configuration that you specify, which allows a set of routing control state changes to complete. For example, if you specify one gating routing control and you set the Type in the rule configuration to OR, that indicates that you must set the gating routing control to On for the rule to evaluate as true; that is, for the gating control "switch" to be "On". When you do that, then you can update the routing control states for the target routing controls that you specify in the gating rule.
    */
  @js.native
  trait GatingRule extends js.Object {
    var ControlPanelArn: __stringMin1Max256PatternAZaZ09
    var GatingControls: __listOf__stringMin1Max256PatternAZaZ09
    var Name: __stringMin1Max64PatternS
    var RuleConfig: RuleConfig
    var SafetyRuleArn: __stringMin1Max256PatternAZaZ09
    var Status: Status
    var TargetControls: __listOf__stringMin1Max256PatternAZaZ09
    var WaitPeriodMs: __integer
  }

  object GatingRule {
    @inline
    def apply(
        ControlPanelArn: __stringMin1Max256PatternAZaZ09,
        GatingControls: __listOf__stringMin1Max256PatternAZaZ09,
        Name: __stringMin1Max64PatternS,
        RuleConfig: RuleConfig,
        SafetyRuleArn: __stringMin1Max256PatternAZaZ09,
        Status: Status,
        TargetControls: __listOf__stringMin1Max256PatternAZaZ09,
        WaitPeriodMs: __integer
    ): GatingRule = {
      val __obj = js.Dynamic.literal(
        "ControlPanelArn" -> ControlPanelArn.asInstanceOf[js.Any],
        "GatingControls" -> GatingControls.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "RuleConfig" -> RuleConfig.asInstanceOf[js.Any],
        "SafetyRuleArn" -> SafetyRuleArn.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any],
        "TargetControls" -> TargetControls.asInstanceOf[js.Any],
        "WaitPeriodMs" -> WaitPeriodMs.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GatingRule]
    }
  }

  /** Update to a gating rule. You can update the name or the evaluation period (wait period). If you don't specify one of the items to update, the item is unchanged.
    */
  @js.native
  trait GatingRuleUpdate extends js.Object {
    var Name: __stringMin1Max64PatternS
    var SafetyRuleArn: __stringMin1Max256PatternAZaZ09
    var WaitPeriodMs: __integer
  }

  object GatingRuleUpdate {
    @inline
    def apply(
        Name: __stringMin1Max64PatternS,
        SafetyRuleArn: __stringMin1Max256PatternAZaZ09,
        WaitPeriodMs: __integer
    ): GatingRuleUpdate = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "SafetyRuleArn" -> SafetyRuleArn.asInstanceOf[js.Any],
        "WaitPeriodMs" -> WaitPeriodMs.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GatingRuleUpdate]
    }
  }

  @js.native
  trait ListAssociatedRoute53HealthChecksRequest extends js.Object {
    var RoutingControlArn: __string
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListAssociatedRoute53HealthChecksRequest {
    @inline
    def apply(
        RoutingControlArn: __string,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListAssociatedRoute53HealthChecksRequest = {
      val __obj = js.Dynamic.literal(
        "RoutingControlArn" -> RoutingControlArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAssociatedRoute53HealthChecksRequest]
    }
  }

  @js.native
  trait ListAssociatedRoute53HealthChecksResponse extends js.Object {
    var HealthCheckIds: js.UndefOr[__listOf__stringMax36PatternS]
    var NextToken: js.UndefOr[__stringMin1Max8096PatternS]
  }

  object ListAssociatedRoute53HealthChecksResponse {
    @inline
    def apply(
        HealthCheckIds: js.UndefOr[__listOf__stringMax36PatternS] = js.undefined,
        NextToken: js.UndefOr[__stringMin1Max8096PatternS] = js.undefined
    ): ListAssociatedRoute53HealthChecksResponse = {
      val __obj = js.Dynamic.literal()
      HealthCheckIds.foreach(__v => __obj.updateDynamic("HealthCheckIds")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAssociatedRoute53HealthChecksResponse]
    }
  }

  @js.native
  trait ListClustersRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListClustersRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListClustersRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListClustersRequest]
    }
  }

  @js.native
  trait ListClustersResponse extends js.Object {
    var Clusters: js.UndefOr[__listOfCluster]
    var NextToken: js.UndefOr[__stringMin1Max8096PatternS]
  }

  object ListClustersResponse {
    @inline
    def apply(
        Clusters: js.UndefOr[__listOfCluster] = js.undefined,
        NextToken: js.UndefOr[__stringMin1Max8096PatternS] = js.undefined
    ): ListClustersResponse = {
      val __obj = js.Dynamic.literal()
      Clusters.foreach(__v => __obj.updateDynamic("Clusters")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListClustersResponse]
    }
  }

  @js.native
  trait ListControlPanelsRequest extends js.Object {
    var ClusterArn: js.UndefOr[__string]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListControlPanelsRequest {
    @inline
    def apply(
        ClusterArn: js.UndefOr[__string] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListControlPanelsRequest = {
      val __obj = js.Dynamic.literal()
      ClusterArn.foreach(__v => __obj.updateDynamic("ClusterArn")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListControlPanelsRequest]
    }
  }

  @js.native
  trait ListControlPanelsResponse extends js.Object {
    var ControlPanels: js.UndefOr[__listOfControlPanel]
    var NextToken: js.UndefOr[__stringMin1Max8096PatternS]
  }

  object ListControlPanelsResponse {
    @inline
    def apply(
        ControlPanels: js.UndefOr[__listOfControlPanel] = js.undefined,
        NextToken: js.UndefOr[__stringMin1Max8096PatternS] = js.undefined
    ): ListControlPanelsResponse = {
      val __obj = js.Dynamic.literal()
      ControlPanels.foreach(__v => __obj.updateDynamic("ControlPanels")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListControlPanelsResponse]
    }
  }

  @js.native
  trait ListRoutingControlsRequest extends js.Object {
    var ControlPanelArn: __string
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListRoutingControlsRequest {
    @inline
    def apply(
        ControlPanelArn: __string,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListRoutingControlsRequest = {
      val __obj = js.Dynamic.literal(
        "ControlPanelArn" -> ControlPanelArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRoutingControlsRequest]
    }
  }

  @js.native
  trait ListRoutingControlsResponse extends js.Object {
    var NextToken: js.UndefOr[__stringMin1Max8096PatternS]
    var RoutingControls: js.UndefOr[__listOfRoutingControl]
  }

  object ListRoutingControlsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[__stringMin1Max8096PatternS] = js.undefined,
        RoutingControls: js.UndefOr[__listOfRoutingControl] = js.undefined
    ): ListRoutingControlsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RoutingControls.foreach(__v => __obj.updateDynamic("RoutingControls")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRoutingControlsResponse]
    }
  }

  @js.native
  trait ListSafetyRulesRequest extends js.Object {
    var ControlPanelArn: __string
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListSafetyRulesRequest {
    @inline
    def apply(
        ControlPanelArn: __string,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListSafetyRulesRequest = {
      val __obj = js.Dynamic.literal(
        "ControlPanelArn" -> ControlPanelArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSafetyRulesRequest]
    }
  }

  @js.native
  trait ListSafetyRulesResponse extends js.Object {
    var NextToken: js.UndefOr[__stringMin1Max8096PatternS]
    var SafetyRules: js.UndefOr[__listOfRule]
  }

  object ListSafetyRulesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[__stringMin1Max8096PatternS] = js.undefined,
        SafetyRules: js.UndefOr[__listOfRule] = js.undefined
    ): ListSafetyRulesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SafetyRules.foreach(__v => __obj.updateDynamic("SafetyRules")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSafetyRulesResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: __string
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceArn: __string
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[__mapOf__stringMin0Max256PatternS]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        Tags: js.UndefOr[__mapOf__stringMin0Max256PatternS] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /** A new assertion rule for a control panel.
    */
  @js.native
  trait NewAssertionRule extends js.Object {
    var AssertedControls: __listOf__stringMin1Max256PatternAZaZ09
    var ControlPanelArn: __stringMin1Max256PatternAZaZ09
    var Name: __stringMin1Max64PatternS
    var RuleConfig: RuleConfig
    var WaitPeriodMs: __integer
  }

  object NewAssertionRule {
    @inline
    def apply(
        AssertedControls: __listOf__stringMin1Max256PatternAZaZ09,
        ControlPanelArn: __stringMin1Max256PatternAZaZ09,
        Name: __stringMin1Max64PatternS,
        RuleConfig: RuleConfig,
        WaitPeriodMs: __integer
    ): NewAssertionRule = {
      val __obj = js.Dynamic.literal(
        "AssertedControls" -> AssertedControls.asInstanceOf[js.Any],
        "ControlPanelArn" -> ControlPanelArn.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "RuleConfig" -> RuleConfig.asInstanceOf[js.Any],
        "WaitPeriodMs" -> WaitPeriodMs.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[NewAssertionRule]
    }
  }

  /** A new gating rule for a control panel.
    */
  @js.native
  trait NewGatingRule extends js.Object {
    var ControlPanelArn: __stringMin1Max256PatternAZaZ09
    var GatingControls: __listOf__stringMin1Max256PatternAZaZ09
    var Name: __stringMin1Max64PatternS
    var RuleConfig: RuleConfig
    var TargetControls: __listOf__stringMin1Max256PatternAZaZ09
    var WaitPeriodMs: __integer
  }

  object NewGatingRule {
    @inline
    def apply(
        ControlPanelArn: __stringMin1Max256PatternAZaZ09,
        GatingControls: __listOf__stringMin1Max256PatternAZaZ09,
        Name: __stringMin1Max64PatternS,
        RuleConfig: RuleConfig,
        TargetControls: __listOf__stringMin1Max256PatternAZaZ09,
        WaitPeriodMs: __integer
    ): NewGatingRule = {
      val __obj = js.Dynamic.literal(
        "ControlPanelArn" -> ControlPanelArn.asInstanceOf[js.Any],
        "GatingControls" -> GatingControls.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "RuleConfig" -> RuleConfig.asInstanceOf[js.Any],
        "TargetControls" -> TargetControls.asInstanceOf[js.Any],
        "WaitPeriodMs" -> WaitPeriodMs.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[NewGatingRule]
    }
  }

  /** A routing control has one of two states: ON and OFF. You can map the routing control state to the state of an Amazon Route 53 health check, which can be used to control traffic routing.
    */
  @js.native
  trait RoutingControl extends js.Object {
    var ControlPanelArn: js.UndefOr[__stringMin1Max256PatternAZaZ09]
    var Name: js.UndefOr[__stringMin1Max64PatternS]
    var RoutingControlArn: js.UndefOr[__stringMin1Max256PatternAZaZ09]
    var Status: js.UndefOr[Status]
  }

  object RoutingControl {
    @inline
    def apply(
        ControlPanelArn: js.UndefOr[__stringMin1Max256PatternAZaZ09] = js.undefined,
        Name: js.UndefOr[__stringMin1Max64PatternS] = js.undefined,
        RoutingControlArn: js.UndefOr[__stringMin1Max256PatternAZaZ09] = js.undefined,
        Status: js.UndefOr[Status] = js.undefined
    ): RoutingControl = {
      val __obj = js.Dynamic.literal()
      ControlPanelArn.foreach(__v => __obj.updateDynamic("ControlPanelArn")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      RoutingControlArn.foreach(__v => __obj.updateDynamic("RoutingControlArn")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RoutingControl]
    }
  }

  /** A safety rule. A safety rule can be an assertion rule or a gating rule.
    */
  @js.native
  trait Rule extends js.Object {
    var ASSERTION: js.UndefOr[AssertionRule]
    var GATING: js.UndefOr[GatingRule]
  }

  object Rule {
    @inline
    def apply(
        ASSERTION: js.UndefOr[AssertionRule] = js.undefined,
        GATING: js.UndefOr[GatingRule] = js.undefined
    ): Rule = {
      val __obj = js.Dynamic.literal()
      ASSERTION.foreach(__v => __obj.updateDynamic("ASSERTION")(__v.asInstanceOf[js.Any]))
      GATING.foreach(__v => __obj.updateDynamic("GATING")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Rule]
    }
  }

  /** The rule configuration for an assertion rule. That is, the criteria that you set for specific assertion controls (routing controls) that specify how many control states must be ON after a transaction completes.
    */
  @js.native
  trait RuleConfig extends js.Object {
    var Inverted: __boolean
    var Threshold: __integer
    var Type: RuleType
  }

  object RuleConfig {
    @inline
    def apply(
        Inverted: __boolean,
        Threshold: __integer,
        Type: RuleType
    ): RuleConfig = {
      val __obj = js.Dynamic.literal(
        "Inverted" -> Inverted.asInstanceOf[js.Any],
        "Threshold" -> Threshold.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RuleConfig]
    }
  }

  /** Request of adding tag to the resource
    */
  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: __string
    var Tags: __mapOf__stringMin0Max256PatternS
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceArn: __string,
        Tags: __mapOf__stringMin0Max256PatternS
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
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

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: __string
    var TagKeys: __listOf__string
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceArn: __string,
        TagKeys: __listOf__string
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
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

  /** The details of the control panel that you're updating.
    */
  @js.native
  trait UpdateControlPanelRequest extends js.Object {
    var ControlPanelArn: __stringMin1Max256PatternAZaZ09
    var ControlPanelName: __stringMin1Max64PatternS
  }

  object UpdateControlPanelRequest {
    @inline
    def apply(
        ControlPanelArn: __stringMin1Max256PatternAZaZ09,
        ControlPanelName: __stringMin1Max64PatternS
    ): UpdateControlPanelRequest = {
      val __obj = js.Dynamic.literal(
        "ControlPanelArn" -> ControlPanelArn.asInstanceOf[js.Any],
        "ControlPanelName" -> ControlPanelName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateControlPanelRequest]
    }
  }

  @js.native
  trait UpdateControlPanelResponse extends js.Object {
    var ControlPanel: js.UndefOr[ControlPanel]
  }

  object UpdateControlPanelResponse {
    @inline
    def apply(
        ControlPanel: js.UndefOr[ControlPanel] = js.undefined
    ): UpdateControlPanelResponse = {
      val __obj = js.Dynamic.literal()
      ControlPanel.foreach(__v => __obj.updateDynamic("ControlPanel")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateControlPanelResponse]
    }
  }

  /** The details of the routing control that you're updating.
    */
  @js.native
  trait UpdateRoutingControlRequest extends js.Object {
    var RoutingControlArn: __stringMin1Max256PatternAZaZ09
    var RoutingControlName: __stringMin1Max64PatternS
  }

  object UpdateRoutingControlRequest {
    @inline
    def apply(
        RoutingControlArn: __stringMin1Max256PatternAZaZ09,
        RoutingControlName: __stringMin1Max64PatternS
    ): UpdateRoutingControlRequest = {
      val __obj = js.Dynamic.literal(
        "RoutingControlArn" -> RoutingControlArn.asInstanceOf[js.Any],
        "RoutingControlName" -> RoutingControlName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateRoutingControlRequest]
    }
  }

  @js.native
  trait UpdateRoutingControlResponse extends js.Object {
    var RoutingControl: js.UndefOr[RoutingControl]
  }

  object UpdateRoutingControlResponse {
    @inline
    def apply(
        RoutingControl: js.UndefOr[RoutingControl] = js.undefined
    ): UpdateRoutingControlResponse = {
      val __obj = js.Dynamic.literal()
      RoutingControl.foreach(__v => __obj.updateDynamic("RoutingControl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRoutingControlResponse]
    }
  }

  /** A rule that you add to Application Recovery Controller to ensure that recovery actions don't accidentally impair your application's availability.
    */
  @js.native
  trait UpdateSafetyRuleRequest extends js.Object {
    var AssertionRuleUpdate: js.UndefOr[AssertionRuleUpdate]
    var GatingRuleUpdate: js.UndefOr[GatingRuleUpdate]
  }

  object UpdateSafetyRuleRequest {
    @inline
    def apply(
        AssertionRuleUpdate: js.UndefOr[AssertionRuleUpdate] = js.undefined,
        GatingRuleUpdate: js.UndefOr[GatingRuleUpdate] = js.undefined
    ): UpdateSafetyRuleRequest = {
      val __obj = js.Dynamic.literal()
      AssertionRuleUpdate.foreach(__v => __obj.updateDynamic("AssertionRuleUpdate")(__v.asInstanceOf[js.Any]))
      GatingRuleUpdate.foreach(__v => __obj.updateDynamic("GatingRuleUpdate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSafetyRuleRequest]
    }
  }

  @js.native
  trait UpdateSafetyRuleResponse extends js.Object {
    var AssertionRule: js.UndefOr[AssertionRule]
    var GatingRule: js.UndefOr[GatingRule]
  }

  object UpdateSafetyRuleResponse {
    @inline
    def apply(
        AssertionRule: js.UndefOr[AssertionRule] = js.undefined,
        GatingRule: js.UndefOr[GatingRule] = js.undefined
    ): UpdateSafetyRuleResponse = {
      val __obj = js.Dynamic.literal()
      AssertionRule.foreach(__v => __obj.updateDynamic("AssertionRule")(__v.asInstanceOf[js.Any]))
      GatingRule.foreach(__v => __obj.updateDynamic("GatingRule")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSafetyRuleResponse]
    }
  }
}
