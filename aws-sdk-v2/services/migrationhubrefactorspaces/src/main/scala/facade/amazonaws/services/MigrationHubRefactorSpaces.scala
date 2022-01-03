package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object migrationhubrefactorspaces {
  type AccountId = String
  type AdditionalDetails = js.Dictionary[AdditionalDetailsValue]
  type AdditionalDetailsKey = String
  type AdditionalDetailsValue = String
  type ApiGatewayId = String
  type ApplicationId = String
  type ApplicationName = String
  type ApplicationSummaries = js.Array[ApplicationSummary]
  type CidrBlock = String
  type CidrBlocks = js.Array[CidrBlock]
  type ClientToken = String
  type Description = String
  type Ec2TagValue = String
  type EnvironmentId = String
  type EnvironmentName = String
  type EnvironmentSummaries = js.Array[EnvironmentSummary]
  type EnvironmentVpcs = js.Array[EnvironmentVpc]
  type ErrorMessage = String
  type HttpMethods = js.Array[HttpMethod]
  type LambdaArn = String
  type MaxResults = Int
  type NextToken = String
  type NlbArn = String
  type NlbName = String
  type PathResourceToId = js.Dictionary[PathResourceToIdValue]
  type PathResourceToIdKey = String
  type PathResourceToIdValue = String
  type PolicyString = String
  type ResourceArn = String
  type ResourceIdentifier = String
  type ResourcePolicyIdentifier = String
  type RouteId = String
  type RouteSummaries = js.Array[RouteSummary]
  type ServiceId = String
  type ServiceName = String
  type ServiceSummaries = js.Array[ServiceSummary]
  type StageName = String
  type TagKeys = js.Array[String]
  type TagMap = js.Dictionary[TagMapValueString]
  type TagMapKeyString = String
  type TagMapValueString = String
  type Timestamp = js.Date
  type TransitGatewayId = String
  type Uri = String
  type UriPath = String
  type VpcId = String
  type VpcLinkId = String

  final class MigrationHubRefactorSpacesOps(private val service: MigrationHubRefactorSpaces) extends AnyVal {

    @inline def createApplicationFuture(params: CreateApplicationRequest): Future[CreateApplicationResponse] = service.createApplication(params).promise().toFuture
    @inline def createEnvironmentFuture(params: CreateEnvironmentRequest): Future[CreateEnvironmentResponse] = service.createEnvironment(params).promise().toFuture
    @inline def createRouteFuture(params: CreateRouteRequest): Future[CreateRouteResponse] = service.createRoute(params).promise().toFuture
    @inline def createServiceFuture(params: CreateServiceRequest): Future[CreateServiceResponse] = service.createService(params).promise().toFuture
    @inline def deleteApplicationFuture(params: DeleteApplicationRequest): Future[DeleteApplicationResponse] = service.deleteApplication(params).promise().toFuture
    @inline def deleteEnvironmentFuture(params: DeleteEnvironmentRequest): Future[DeleteEnvironmentResponse] = service.deleteEnvironment(params).promise().toFuture
    @inline def deleteResourcePolicyFuture(params: DeleteResourcePolicyRequest): Future[DeleteResourcePolicyResponse] = service.deleteResourcePolicy(params).promise().toFuture
    @inline def deleteRouteFuture(params: DeleteRouteRequest): Future[DeleteRouteResponse] = service.deleteRoute(params).promise().toFuture
    @inline def deleteServiceFuture(params: DeleteServiceRequest): Future[DeleteServiceResponse] = service.deleteService(params).promise().toFuture
    @inline def getApplicationFuture(params: GetApplicationRequest): Future[GetApplicationResponse] = service.getApplication(params).promise().toFuture
    @inline def getEnvironmentFuture(params: GetEnvironmentRequest): Future[GetEnvironmentResponse] = service.getEnvironment(params).promise().toFuture
    @inline def getResourcePolicyFuture(params: GetResourcePolicyRequest): Future[GetResourcePolicyResponse] = service.getResourcePolicy(params).promise().toFuture
    @inline def getRouteFuture(params: GetRouteRequest): Future[GetRouteResponse] = service.getRoute(params).promise().toFuture
    @inline def getServiceFuture(params: GetServiceRequest): Future[GetServiceResponse] = service.getService(params).promise().toFuture
    @inline def listApplicationsFuture(params: ListApplicationsRequest): Future[ListApplicationsResponse] = service.listApplications(params).promise().toFuture
    @inline def listEnvironmentVpcsFuture(params: ListEnvironmentVpcsRequest): Future[ListEnvironmentVpcsResponse] = service.listEnvironmentVpcs(params).promise().toFuture
    @inline def listEnvironmentsFuture(params: ListEnvironmentsRequest): Future[ListEnvironmentsResponse] = service.listEnvironments(params).promise().toFuture
    @inline def listRoutesFuture(params: ListRoutesRequest): Future[ListRoutesResponse] = service.listRoutes(params).promise().toFuture
    @inline def listServicesFuture(params: ListServicesRequest): Future[ListServicesResponse] = service.listServices(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def putResourcePolicyFuture(params: PutResourcePolicyRequest): Future[PutResourcePolicyResponse] = service.putResourcePolicy(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/migrationhubrefactorspaces", JSImport.Namespace, "AWS.MigrationHubRefactorSpaces")
  class MigrationHubRefactorSpaces() extends js.Object {
    def this(config: AWSConfig) = this()

    def createApplication(params: CreateApplicationRequest): Request[CreateApplicationResponse] = js.native
    def createEnvironment(params: CreateEnvironmentRequest): Request[CreateEnvironmentResponse] = js.native
    def createRoute(params: CreateRouteRequest): Request[CreateRouteResponse] = js.native
    def createService(params: CreateServiceRequest): Request[CreateServiceResponse] = js.native
    def deleteApplication(params: DeleteApplicationRequest): Request[DeleteApplicationResponse] = js.native
    def deleteEnvironment(params: DeleteEnvironmentRequest): Request[DeleteEnvironmentResponse] = js.native
    def deleteResourcePolicy(params: DeleteResourcePolicyRequest): Request[DeleteResourcePolicyResponse] = js.native
    def deleteRoute(params: DeleteRouteRequest): Request[DeleteRouteResponse] = js.native
    def deleteService(params: DeleteServiceRequest): Request[DeleteServiceResponse] = js.native
    def getApplication(params: GetApplicationRequest): Request[GetApplicationResponse] = js.native
    def getEnvironment(params: GetEnvironmentRequest): Request[GetEnvironmentResponse] = js.native
    def getResourcePolicy(params: GetResourcePolicyRequest): Request[GetResourcePolicyResponse] = js.native
    def getRoute(params: GetRouteRequest): Request[GetRouteResponse] = js.native
    def getService(params: GetServiceRequest): Request[GetServiceResponse] = js.native
    def listApplications(params: ListApplicationsRequest): Request[ListApplicationsResponse] = js.native
    def listEnvironmentVpcs(params: ListEnvironmentVpcsRequest): Request[ListEnvironmentVpcsResponse] = js.native
    def listEnvironments(params: ListEnvironmentsRequest): Request[ListEnvironmentsResponse] = js.native
    def listRoutes(params: ListRoutesRequest): Request[ListRoutesResponse] = js.native
    def listServices(params: ListServicesRequest): Request[ListServicesResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def putResourcePolicy(params: PutResourcePolicyRequest): Request[PutResourcePolicyResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
  }
  object MigrationHubRefactorSpaces {
    @inline implicit def toOps(service: MigrationHubRefactorSpaces): MigrationHubRefactorSpacesOps = {
      new MigrationHubRefactorSpacesOps(service)
    }
  }

  /** A wrapper object holding the Amazon API Gateway proxy configuration.
    */
  @js.native
  trait ApiGatewayProxyConfig extends js.Object {
    var ApiGatewayId: js.UndefOr[ApiGatewayId]
    var EndpointType: js.UndefOr[ApiGatewayEndpointType]
    var NlbArn: js.UndefOr[NlbArn]
    var NlbName: js.UndefOr[NlbName]
    var ProxyUrl: js.UndefOr[Uri]
    var StageName: js.UndefOr[StageName]
    var VpcLinkId: js.UndefOr[VpcLinkId]
  }

  object ApiGatewayProxyConfig {
    @inline
    def apply(
        ApiGatewayId: js.UndefOr[ApiGatewayId] = js.undefined,
        EndpointType: js.UndefOr[ApiGatewayEndpointType] = js.undefined,
        NlbArn: js.UndefOr[NlbArn] = js.undefined,
        NlbName: js.UndefOr[NlbName] = js.undefined,
        ProxyUrl: js.UndefOr[Uri] = js.undefined,
        StageName: js.UndefOr[StageName] = js.undefined,
        VpcLinkId: js.UndefOr[VpcLinkId] = js.undefined
    ): ApiGatewayProxyConfig = {
      val __obj = js.Dynamic.literal()
      ApiGatewayId.foreach(__v => __obj.updateDynamic("ApiGatewayId")(__v.asInstanceOf[js.Any]))
      EndpointType.foreach(__v => __obj.updateDynamic("EndpointType")(__v.asInstanceOf[js.Any]))
      NlbArn.foreach(__v => __obj.updateDynamic("NlbArn")(__v.asInstanceOf[js.Any]))
      NlbName.foreach(__v => __obj.updateDynamic("NlbName")(__v.asInstanceOf[js.Any]))
      ProxyUrl.foreach(__v => __obj.updateDynamic("ProxyUrl")(__v.asInstanceOf[js.Any]))
      StageName.foreach(__v => __obj.updateDynamic("StageName")(__v.asInstanceOf[js.Any]))
      VpcLinkId.foreach(__v => __obj.updateDynamic("VpcLinkId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApiGatewayProxyConfig]
    }
  }

  /** A wrapper object holding the Amazon API Gateway endpoint input.
    */
  @js.native
  trait ApiGatewayProxyInput extends js.Object {
    var EndpointType: js.UndefOr[ApiGatewayEndpointType]
    var StageName: js.UndefOr[StageName]
  }

  object ApiGatewayProxyInput {
    @inline
    def apply(
        EndpointType: js.UndefOr[ApiGatewayEndpointType] = js.undefined,
        StageName: js.UndefOr[StageName] = js.undefined
    ): ApiGatewayProxyInput = {
      val __obj = js.Dynamic.literal()
      EndpointType.foreach(__v => __obj.updateDynamic("EndpointType")(__v.asInstanceOf[js.Any]))
      StageName.foreach(__v => __obj.updateDynamic("StageName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApiGatewayProxyInput]
    }
  }

  /** A wrapper object holding the Amazon API Gateway proxy summary.
    */
  @js.native
  trait ApiGatewayProxySummary extends js.Object {
    var ApiGatewayId: js.UndefOr[ApiGatewayId]
    var EndpointType: js.UndefOr[ApiGatewayEndpointType]
    var NlbArn: js.UndefOr[NlbArn]
    var NlbName: js.UndefOr[NlbName]
    var ProxyUrl: js.UndefOr[Uri]
    var StageName: js.UndefOr[StageName]
    var VpcLinkId: js.UndefOr[VpcLinkId]
  }

  object ApiGatewayProxySummary {
    @inline
    def apply(
        ApiGatewayId: js.UndefOr[ApiGatewayId] = js.undefined,
        EndpointType: js.UndefOr[ApiGatewayEndpointType] = js.undefined,
        NlbArn: js.UndefOr[NlbArn] = js.undefined,
        NlbName: js.UndefOr[NlbName] = js.undefined,
        ProxyUrl: js.UndefOr[Uri] = js.undefined,
        StageName: js.UndefOr[StageName] = js.undefined,
        VpcLinkId: js.UndefOr[VpcLinkId] = js.undefined
    ): ApiGatewayProxySummary = {
      val __obj = js.Dynamic.literal()
      ApiGatewayId.foreach(__v => __obj.updateDynamic("ApiGatewayId")(__v.asInstanceOf[js.Any]))
      EndpointType.foreach(__v => __obj.updateDynamic("EndpointType")(__v.asInstanceOf[js.Any]))
      NlbArn.foreach(__v => __obj.updateDynamic("NlbArn")(__v.asInstanceOf[js.Any]))
      NlbName.foreach(__v => __obj.updateDynamic("NlbName")(__v.asInstanceOf[js.Any]))
      ProxyUrl.foreach(__v => __obj.updateDynamic("ProxyUrl")(__v.asInstanceOf[js.Any]))
      StageName.foreach(__v => __obj.updateDynamic("StageName")(__v.asInstanceOf[js.Any]))
      VpcLinkId.foreach(__v => __obj.updateDynamic("VpcLinkId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApiGatewayProxySummary]
    }
  }

  /** The list of <code>ApplicationSummary</code> objects.
    */
  @js.native
  trait ApplicationSummary extends js.Object {
    var ApiGatewayProxy: js.UndefOr[ApiGatewayProxySummary]
    var ApplicationId: js.UndefOr[ApplicationId]
    var Arn: js.UndefOr[ResourceArn]
    var CreatedByAccountId: js.UndefOr[AccountId]
    var CreatedTime: js.UndefOr[Timestamp]
    var EnvironmentId: js.UndefOr[EnvironmentId]
    var Error: js.UndefOr[ErrorResponse]
    var LastUpdatedTime: js.UndefOr[Timestamp]
    var Name: js.UndefOr[ApplicationName]
    var OwnerAccountId: js.UndefOr[AccountId]
    var ProxyType: js.UndefOr[ProxyType]
    var State: js.UndefOr[ApplicationState]
    var Tags: js.UndefOr[TagMap]
    var VpcId: js.UndefOr[VpcId]
  }

  object ApplicationSummary {
    @inline
    def apply(
        ApiGatewayProxy: js.UndefOr[ApiGatewayProxySummary] = js.undefined,
        ApplicationId: js.UndefOr[ApplicationId] = js.undefined,
        Arn: js.UndefOr[ResourceArn] = js.undefined,
        CreatedByAccountId: js.UndefOr[AccountId] = js.undefined,
        CreatedTime: js.UndefOr[Timestamp] = js.undefined,
        EnvironmentId: js.UndefOr[EnvironmentId] = js.undefined,
        Error: js.UndefOr[ErrorResponse] = js.undefined,
        LastUpdatedTime: js.UndefOr[Timestamp] = js.undefined,
        Name: js.UndefOr[ApplicationName] = js.undefined,
        OwnerAccountId: js.UndefOr[AccountId] = js.undefined,
        ProxyType: js.UndefOr[ProxyType] = js.undefined,
        State: js.UndefOr[ApplicationState] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined,
        VpcId: js.UndefOr[VpcId] = js.undefined
    ): ApplicationSummary = {
      val __obj = js.Dynamic.literal()
      ApiGatewayProxy.foreach(__v => __obj.updateDynamic("ApiGatewayProxy")(__v.asInstanceOf[js.Any]))
      ApplicationId.foreach(__v => __obj.updateDynamic("ApplicationId")(__v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatedByAccountId.foreach(__v => __obj.updateDynamic("CreatedByAccountId")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      EnvironmentId.foreach(__v => __obj.updateDynamic("EnvironmentId")(__v.asInstanceOf[js.Any]))
      Error.foreach(__v => __obj.updateDynamic("Error")(__v.asInstanceOf[js.Any]))
      LastUpdatedTime.foreach(__v => __obj.updateDynamic("LastUpdatedTime")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      OwnerAccountId.foreach(__v => __obj.updateDynamic("OwnerAccountId")(__v.asInstanceOf[js.Any]))
      ProxyType.foreach(__v => __obj.updateDynamic("ProxyType")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApplicationSummary]
    }
  }

  @js.native
  trait CreateApplicationRequest extends js.Object {
    var EnvironmentIdentifier: EnvironmentId
    var Name: ApplicationName
    var ProxyType: ProxyType
    var VpcId: VpcId
    var ApiGatewayProxy: js.UndefOr[ApiGatewayProxyInput]
    var ClientToken: js.UndefOr[ClientToken]
    var Tags: js.UndefOr[TagMap]
  }

  object CreateApplicationRequest {
    @inline
    def apply(
        EnvironmentIdentifier: EnvironmentId,
        Name: ApplicationName,
        ProxyType: ProxyType,
        VpcId: VpcId,
        ApiGatewayProxy: js.UndefOr[ApiGatewayProxyInput] = js.undefined,
        ClientToken: js.UndefOr[ClientToken] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreateApplicationRequest = {
      val __obj = js.Dynamic.literal(
        "EnvironmentIdentifier" -> EnvironmentIdentifier.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "ProxyType" -> ProxyType.asInstanceOf[js.Any],
        "VpcId" -> VpcId.asInstanceOf[js.Any]
      )

      ApiGatewayProxy.foreach(__v => __obj.updateDynamic("ApiGatewayProxy")(__v.asInstanceOf[js.Any]))
      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateApplicationRequest]
    }
  }

  @js.native
  trait CreateApplicationResponse extends js.Object {
    var ApiGatewayProxy: js.UndefOr[ApiGatewayProxyInput]
    var ApplicationId: js.UndefOr[ApplicationId]
    var Arn: js.UndefOr[ResourceArn]
    var CreatedByAccountId: js.UndefOr[AccountId]
    var CreatedTime: js.UndefOr[Timestamp]
    var EnvironmentId: js.UndefOr[EnvironmentId]
    var LastUpdatedTime: js.UndefOr[Timestamp]
    var Name: js.UndefOr[ApplicationName]
    var OwnerAccountId: js.UndefOr[AccountId]
    var ProxyType: js.UndefOr[ProxyType]
    var State: js.UndefOr[ApplicationState]
    var Tags: js.UndefOr[TagMap]
    var VpcId: js.UndefOr[VpcId]
  }

  object CreateApplicationResponse {
    @inline
    def apply(
        ApiGatewayProxy: js.UndefOr[ApiGatewayProxyInput] = js.undefined,
        ApplicationId: js.UndefOr[ApplicationId] = js.undefined,
        Arn: js.UndefOr[ResourceArn] = js.undefined,
        CreatedByAccountId: js.UndefOr[AccountId] = js.undefined,
        CreatedTime: js.UndefOr[Timestamp] = js.undefined,
        EnvironmentId: js.UndefOr[EnvironmentId] = js.undefined,
        LastUpdatedTime: js.UndefOr[Timestamp] = js.undefined,
        Name: js.UndefOr[ApplicationName] = js.undefined,
        OwnerAccountId: js.UndefOr[AccountId] = js.undefined,
        ProxyType: js.UndefOr[ProxyType] = js.undefined,
        State: js.UndefOr[ApplicationState] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined,
        VpcId: js.UndefOr[VpcId] = js.undefined
    ): CreateApplicationResponse = {
      val __obj = js.Dynamic.literal()
      ApiGatewayProxy.foreach(__v => __obj.updateDynamic("ApiGatewayProxy")(__v.asInstanceOf[js.Any]))
      ApplicationId.foreach(__v => __obj.updateDynamic("ApplicationId")(__v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatedByAccountId.foreach(__v => __obj.updateDynamic("CreatedByAccountId")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      EnvironmentId.foreach(__v => __obj.updateDynamic("EnvironmentId")(__v.asInstanceOf[js.Any]))
      LastUpdatedTime.foreach(__v => __obj.updateDynamic("LastUpdatedTime")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      OwnerAccountId.foreach(__v => __obj.updateDynamic("OwnerAccountId")(__v.asInstanceOf[js.Any]))
      ProxyType.foreach(__v => __obj.updateDynamic("ProxyType")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateApplicationResponse]
    }
  }

  @js.native
  trait CreateEnvironmentRequest extends js.Object {
    var Name: EnvironmentName
    var NetworkFabricType: NetworkFabricType
    var ClientToken: js.UndefOr[ClientToken]
    var Description: js.UndefOr[Description]
    var Tags: js.UndefOr[TagMap]
  }

  object CreateEnvironmentRequest {
    @inline
    def apply(
        Name: EnvironmentName,
        NetworkFabricType: NetworkFabricType,
        ClientToken: js.UndefOr[ClientToken] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreateEnvironmentRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "NetworkFabricType" -> NetworkFabricType.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateEnvironmentRequest]
    }
  }

  @js.native
  trait CreateEnvironmentResponse extends js.Object {
    var Arn: js.UndefOr[ResourceArn]
    var CreatedTime: js.UndefOr[Timestamp]
    var Description: js.UndefOr[Description]
    var EnvironmentId: js.UndefOr[EnvironmentId]
    var LastUpdatedTime: js.UndefOr[Timestamp]
    var Name: js.UndefOr[EnvironmentName]
    var NetworkFabricType: js.UndefOr[NetworkFabricType]
    var OwnerAccountId: js.UndefOr[AccountId]
    var State: js.UndefOr[EnvironmentState]
    var Tags: js.UndefOr[TagMap]
  }

  object CreateEnvironmentResponse {
    @inline
    def apply(
        Arn: js.UndefOr[ResourceArn] = js.undefined,
        CreatedTime: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        EnvironmentId: js.UndefOr[EnvironmentId] = js.undefined,
        LastUpdatedTime: js.UndefOr[Timestamp] = js.undefined,
        Name: js.UndefOr[EnvironmentName] = js.undefined,
        NetworkFabricType: js.UndefOr[NetworkFabricType] = js.undefined,
        OwnerAccountId: js.UndefOr[AccountId] = js.undefined,
        State: js.UndefOr[EnvironmentState] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreateEnvironmentResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EnvironmentId.foreach(__v => __obj.updateDynamic("EnvironmentId")(__v.asInstanceOf[js.Any]))
      LastUpdatedTime.foreach(__v => __obj.updateDynamic("LastUpdatedTime")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      NetworkFabricType.foreach(__v => __obj.updateDynamic("NetworkFabricType")(__v.asInstanceOf[js.Any]))
      OwnerAccountId.foreach(__v => __obj.updateDynamic("OwnerAccountId")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateEnvironmentResponse]
    }
  }

  @js.native
  trait CreateRouteRequest extends js.Object {
    var ApplicationIdentifier: ApplicationId
    var EnvironmentIdentifier: EnvironmentId
    var RouteType: RouteType
    var ServiceIdentifier: ServiceId
    var ClientToken: js.UndefOr[ClientToken]
    var Tags: js.UndefOr[TagMap]
    var UriPathRoute: js.UndefOr[UriPathRouteInput]
  }

  object CreateRouteRequest {
    @inline
    def apply(
        ApplicationIdentifier: ApplicationId,
        EnvironmentIdentifier: EnvironmentId,
        RouteType: RouteType,
        ServiceIdentifier: ServiceId,
        ClientToken: js.UndefOr[ClientToken] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined,
        UriPathRoute: js.UndefOr[UriPathRouteInput] = js.undefined
    ): CreateRouteRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationIdentifier" -> ApplicationIdentifier.asInstanceOf[js.Any],
        "EnvironmentIdentifier" -> EnvironmentIdentifier.asInstanceOf[js.Any],
        "RouteType" -> RouteType.asInstanceOf[js.Any],
        "ServiceIdentifier" -> ServiceIdentifier.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      UriPathRoute.foreach(__v => __obj.updateDynamic("UriPathRoute")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRouteRequest]
    }
  }

  @js.native
  trait CreateRouteResponse extends js.Object {
    var ApplicationId: js.UndefOr[ApplicationId]
    var Arn: js.UndefOr[ResourceArn]
    var CreatedByAccountId: js.UndefOr[AccountId]
    var CreatedTime: js.UndefOr[Timestamp]
    var LastUpdatedTime: js.UndefOr[Timestamp]
    var OwnerAccountId: js.UndefOr[AccountId]
    var RouteId: js.UndefOr[RouteId]
    var RouteType: js.UndefOr[RouteType]
    var ServiceId: js.UndefOr[ServiceId]
    var State: js.UndefOr[RouteState]
    var Tags: js.UndefOr[TagMap]
    var UriPathRoute: js.UndefOr[UriPathRouteInput]
  }

  object CreateRouteResponse {
    @inline
    def apply(
        ApplicationId: js.UndefOr[ApplicationId] = js.undefined,
        Arn: js.UndefOr[ResourceArn] = js.undefined,
        CreatedByAccountId: js.UndefOr[AccountId] = js.undefined,
        CreatedTime: js.UndefOr[Timestamp] = js.undefined,
        LastUpdatedTime: js.UndefOr[Timestamp] = js.undefined,
        OwnerAccountId: js.UndefOr[AccountId] = js.undefined,
        RouteId: js.UndefOr[RouteId] = js.undefined,
        RouteType: js.UndefOr[RouteType] = js.undefined,
        ServiceId: js.UndefOr[ServiceId] = js.undefined,
        State: js.UndefOr[RouteState] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined,
        UriPathRoute: js.UndefOr[UriPathRouteInput] = js.undefined
    ): CreateRouteResponse = {
      val __obj = js.Dynamic.literal()
      ApplicationId.foreach(__v => __obj.updateDynamic("ApplicationId")(__v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatedByAccountId.foreach(__v => __obj.updateDynamic("CreatedByAccountId")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      LastUpdatedTime.foreach(__v => __obj.updateDynamic("LastUpdatedTime")(__v.asInstanceOf[js.Any]))
      OwnerAccountId.foreach(__v => __obj.updateDynamic("OwnerAccountId")(__v.asInstanceOf[js.Any]))
      RouteId.foreach(__v => __obj.updateDynamic("RouteId")(__v.asInstanceOf[js.Any]))
      RouteType.foreach(__v => __obj.updateDynamic("RouteType")(__v.asInstanceOf[js.Any]))
      ServiceId.foreach(__v => __obj.updateDynamic("ServiceId")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      UriPathRoute.foreach(__v => __obj.updateDynamic("UriPathRoute")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRouteResponse]
    }
  }

  @js.native
  trait CreateServiceRequest extends js.Object {
    var ApplicationIdentifier: ApplicationId
    var EndpointType: ServiceEndpointType
    var EnvironmentIdentifier: EnvironmentId
    var Name: ServiceName
    var ClientToken: js.UndefOr[ClientToken]
    var Description: js.UndefOr[Description]
    var LambdaEndpoint: js.UndefOr[LambdaEndpointInput]
    var Tags: js.UndefOr[TagMap]
    var UrlEndpoint: js.UndefOr[UrlEndpointInput]
    var VpcId: js.UndefOr[VpcId]
  }

  object CreateServiceRequest {
    @inline
    def apply(
        ApplicationIdentifier: ApplicationId,
        EndpointType: ServiceEndpointType,
        EnvironmentIdentifier: EnvironmentId,
        Name: ServiceName,
        ClientToken: js.UndefOr[ClientToken] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        LambdaEndpoint: js.UndefOr[LambdaEndpointInput] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined,
        UrlEndpoint: js.UndefOr[UrlEndpointInput] = js.undefined,
        VpcId: js.UndefOr[VpcId] = js.undefined
    ): CreateServiceRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationIdentifier" -> ApplicationIdentifier.asInstanceOf[js.Any],
        "EndpointType" -> EndpointType.asInstanceOf[js.Any],
        "EnvironmentIdentifier" -> EnvironmentIdentifier.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LambdaEndpoint.foreach(__v => __obj.updateDynamic("LambdaEndpoint")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      UrlEndpoint.foreach(__v => __obj.updateDynamic("UrlEndpoint")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateServiceRequest]
    }
  }

  @js.native
  trait CreateServiceResponse extends js.Object {
    var ApplicationId: js.UndefOr[ApplicationId]
    var Arn: js.UndefOr[ResourceArn]
    var CreatedByAccountId: js.UndefOr[AccountId]
    var CreatedTime: js.UndefOr[Timestamp]
    var Description: js.UndefOr[Description]
    var EndpointType: js.UndefOr[ServiceEndpointType]
    var EnvironmentId: js.UndefOr[EnvironmentId]
    var LambdaEndpoint: js.UndefOr[LambdaEndpointInput]
    var LastUpdatedTime: js.UndefOr[Timestamp]
    var Name: js.UndefOr[ServiceName]
    var OwnerAccountId: js.UndefOr[AccountId]
    var ServiceId: js.UndefOr[ServiceId]
    var State: js.UndefOr[ServiceState]
    var Tags: js.UndefOr[TagMap]
    var UrlEndpoint: js.UndefOr[UrlEndpointInput]
    var VpcId: js.UndefOr[VpcId]
  }

  object CreateServiceResponse {
    @inline
    def apply(
        ApplicationId: js.UndefOr[ApplicationId] = js.undefined,
        Arn: js.UndefOr[ResourceArn] = js.undefined,
        CreatedByAccountId: js.UndefOr[AccountId] = js.undefined,
        CreatedTime: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        EndpointType: js.UndefOr[ServiceEndpointType] = js.undefined,
        EnvironmentId: js.UndefOr[EnvironmentId] = js.undefined,
        LambdaEndpoint: js.UndefOr[LambdaEndpointInput] = js.undefined,
        LastUpdatedTime: js.UndefOr[Timestamp] = js.undefined,
        Name: js.UndefOr[ServiceName] = js.undefined,
        OwnerAccountId: js.UndefOr[AccountId] = js.undefined,
        ServiceId: js.UndefOr[ServiceId] = js.undefined,
        State: js.UndefOr[ServiceState] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined,
        UrlEndpoint: js.UndefOr[UrlEndpointInput] = js.undefined,
        VpcId: js.UndefOr[VpcId] = js.undefined
    ): CreateServiceResponse = {
      val __obj = js.Dynamic.literal()
      ApplicationId.foreach(__v => __obj.updateDynamic("ApplicationId")(__v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatedByAccountId.foreach(__v => __obj.updateDynamic("CreatedByAccountId")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EndpointType.foreach(__v => __obj.updateDynamic("EndpointType")(__v.asInstanceOf[js.Any]))
      EnvironmentId.foreach(__v => __obj.updateDynamic("EnvironmentId")(__v.asInstanceOf[js.Any]))
      LambdaEndpoint.foreach(__v => __obj.updateDynamic("LambdaEndpoint")(__v.asInstanceOf[js.Any]))
      LastUpdatedTime.foreach(__v => __obj.updateDynamic("LastUpdatedTime")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      OwnerAccountId.foreach(__v => __obj.updateDynamic("OwnerAccountId")(__v.asInstanceOf[js.Any]))
      ServiceId.foreach(__v => __obj.updateDynamic("ServiceId")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      UrlEndpoint.foreach(__v => __obj.updateDynamic("UrlEndpoint")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateServiceResponse]
    }
  }

  @js.native
  trait DeleteApplicationRequest extends js.Object {
    var ApplicationIdentifier: ApplicationId
    var EnvironmentIdentifier: EnvironmentId
  }

  object DeleteApplicationRequest {
    @inline
    def apply(
        ApplicationIdentifier: ApplicationId,
        EnvironmentIdentifier: EnvironmentId
    ): DeleteApplicationRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationIdentifier" -> ApplicationIdentifier.asInstanceOf[js.Any],
        "EnvironmentIdentifier" -> EnvironmentIdentifier.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteApplicationRequest]
    }
  }

  @js.native
  trait DeleteApplicationResponse extends js.Object {
    var ApplicationId: js.UndefOr[ApplicationId]
    var Arn: js.UndefOr[ResourceArn]
    var EnvironmentId: js.UndefOr[EnvironmentId]
    var LastUpdatedTime: js.UndefOr[Timestamp]
    var Name: js.UndefOr[ApplicationName]
    var State: js.UndefOr[ApplicationState]
  }

  object DeleteApplicationResponse {
    @inline
    def apply(
        ApplicationId: js.UndefOr[ApplicationId] = js.undefined,
        Arn: js.UndefOr[ResourceArn] = js.undefined,
        EnvironmentId: js.UndefOr[EnvironmentId] = js.undefined,
        LastUpdatedTime: js.UndefOr[Timestamp] = js.undefined,
        Name: js.UndefOr[ApplicationName] = js.undefined,
        State: js.UndefOr[ApplicationState] = js.undefined
    ): DeleteApplicationResponse = {
      val __obj = js.Dynamic.literal()
      ApplicationId.foreach(__v => __obj.updateDynamic("ApplicationId")(__v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      EnvironmentId.foreach(__v => __obj.updateDynamic("EnvironmentId")(__v.asInstanceOf[js.Any]))
      LastUpdatedTime.foreach(__v => __obj.updateDynamic("LastUpdatedTime")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteApplicationResponse]
    }
  }

  @js.native
  trait DeleteEnvironmentRequest extends js.Object {
    var EnvironmentIdentifier: EnvironmentId
  }

  object DeleteEnvironmentRequest {
    @inline
    def apply(
        EnvironmentIdentifier: EnvironmentId
    ): DeleteEnvironmentRequest = {
      val __obj = js.Dynamic.literal(
        "EnvironmentIdentifier" -> EnvironmentIdentifier.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteEnvironmentRequest]
    }
  }

  @js.native
  trait DeleteEnvironmentResponse extends js.Object {
    var Arn: js.UndefOr[ResourceArn]
    var EnvironmentId: js.UndefOr[EnvironmentId]
    var LastUpdatedTime: js.UndefOr[Timestamp]
    var Name: js.UndefOr[EnvironmentName]
    var State: js.UndefOr[EnvironmentState]
  }

  object DeleteEnvironmentResponse {
    @inline
    def apply(
        Arn: js.UndefOr[ResourceArn] = js.undefined,
        EnvironmentId: js.UndefOr[EnvironmentId] = js.undefined,
        LastUpdatedTime: js.UndefOr[Timestamp] = js.undefined,
        Name: js.UndefOr[EnvironmentName] = js.undefined,
        State: js.UndefOr[EnvironmentState] = js.undefined
    ): DeleteEnvironmentResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      EnvironmentId.foreach(__v => __obj.updateDynamic("EnvironmentId")(__v.asInstanceOf[js.Any]))
      LastUpdatedTime.foreach(__v => __obj.updateDynamic("LastUpdatedTime")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteEnvironmentResponse]
    }
  }

  @js.native
  trait DeleteResourcePolicyRequest extends js.Object {
    var Identifier: ResourcePolicyIdentifier
  }

  object DeleteResourcePolicyRequest {
    @inline
    def apply(
        Identifier: ResourcePolicyIdentifier
    ): DeleteResourcePolicyRequest = {
      val __obj = js.Dynamic.literal(
        "Identifier" -> Identifier.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteResourcePolicyRequest]
    }
  }

  @js.native
  trait DeleteResourcePolicyResponse extends js.Object

  object DeleteResourcePolicyResponse {
    @inline
    def apply(): DeleteResourcePolicyResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteResourcePolicyResponse]
    }
  }

  @js.native
  trait DeleteRouteRequest extends js.Object {
    var ApplicationIdentifier: ApplicationId
    var EnvironmentIdentifier: EnvironmentId
    var RouteIdentifier: RouteId
  }

  object DeleteRouteRequest {
    @inline
    def apply(
        ApplicationIdentifier: ApplicationId,
        EnvironmentIdentifier: EnvironmentId,
        RouteIdentifier: RouteId
    ): DeleteRouteRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationIdentifier" -> ApplicationIdentifier.asInstanceOf[js.Any],
        "EnvironmentIdentifier" -> EnvironmentIdentifier.asInstanceOf[js.Any],
        "RouteIdentifier" -> RouteIdentifier.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteRouteRequest]
    }
  }

  @js.native
  trait DeleteRouteResponse extends js.Object {
    var ApplicationId: js.UndefOr[ApplicationId]
    var Arn: js.UndefOr[ResourceArn]
    var LastUpdatedTime: js.UndefOr[Timestamp]
    var RouteId: js.UndefOr[RouteId]
    var ServiceId: js.UndefOr[ServiceId]
    var State: js.UndefOr[RouteState]
  }

  object DeleteRouteResponse {
    @inline
    def apply(
        ApplicationId: js.UndefOr[ApplicationId] = js.undefined,
        Arn: js.UndefOr[ResourceArn] = js.undefined,
        LastUpdatedTime: js.UndefOr[Timestamp] = js.undefined,
        RouteId: js.UndefOr[RouteId] = js.undefined,
        ServiceId: js.UndefOr[ServiceId] = js.undefined,
        State: js.UndefOr[RouteState] = js.undefined
    ): DeleteRouteResponse = {
      val __obj = js.Dynamic.literal()
      ApplicationId.foreach(__v => __obj.updateDynamic("ApplicationId")(__v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      LastUpdatedTime.foreach(__v => __obj.updateDynamic("LastUpdatedTime")(__v.asInstanceOf[js.Any]))
      RouteId.foreach(__v => __obj.updateDynamic("RouteId")(__v.asInstanceOf[js.Any]))
      ServiceId.foreach(__v => __obj.updateDynamic("ServiceId")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteRouteResponse]
    }
  }

  @js.native
  trait DeleteServiceRequest extends js.Object {
    var ApplicationIdentifier: ApplicationId
    var EnvironmentIdentifier: EnvironmentId
    var ServiceIdentifier: ServiceId
  }

  object DeleteServiceRequest {
    @inline
    def apply(
        ApplicationIdentifier: ApplicationId,
        EnvironmentIdentifier: EnvironmentId,
        ServiceIdentifier: ServiceId
    ): DeleteServiceRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationIdentifier" -> ApplicationIdentifier.asInstanceOf[js.Any],
        "EnvironmentIdentifier" -> EnvironmentIdentifier.asInstanceOf[js.Any],
        "ServiceIdentifier" -> ServiceIdentifier.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteServiceRequest]
    }
  }

  @js.native
  trait DeleteServiceResponse extends js.Object {
    var ApplicationId: js.UndefOr[ApplicationId]
    var Arn: js.UndefOr[ResourceArn]
    var EnvironmentId: js.UndefOr[EnvironmentId]
    var LastUpdatedTime: js.UndefOr[Timestamp]
    var Name: js.UndefOr[ServiceName]
    var ServiceId: js.UndefOr[ServiceId]
    var State: js.UndefOr[ServiceState]
  }

  object DeleteServiceResponse {
    @inline
    def apply(
        ApplicationId: js.UndefOr[ApplicationId] = js.undefined,
        Arn: js.UndefOr[ResourceArn] = js.undefined,
        EnvironmentId: js.UndefOr[EnvironmentId] = js.undefined,
        LastUpdatedTime: js.UndefOr[Timestamp] = js.undefined,
        Name: js.UndefOr[ServiceName] = js.undefined,
        ServiceId: js.UndefOr[ServiceId] = js.undefined,
        State: js.UndefOr[ServiceState] = js.undefined
    ): DeleteServiceResponse = {
      val __obj = js.Dynamic.literal()
      ApplicationId.foreach(__v => __obj.updateDynamic("ApplicationId")(__v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      EnvironmentId.foreach(__v => __obj.updateDynamic("EnvironmentId")(__v.asInstanceOf[js.Any]))
      LastUpdatedTime.foreach(__v => __obj.updateDynamic("LastUpdatedTime")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ServiceId.foreach(__v => __obj.updateDynamic("ServiceId")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteServiceResponse]
    }
  }

  /** The summary information for environments as a response to <code>ListEnvironments</code>.
    */
  @js.native
  trait EnvironmentSummary extends js.Object {
    var Arn: js.UndefOr[ResourceArn]
    var CreatedTime: js.UndefOr[Timestamp]
    var Description: js.UndefOr[Description]
    var EnvironmentId: js.UndefOr[EnvironmentId]
    var Error: js.UndefOr[ErrorResponse]
    var LastUpdatedTime: js.UndefOr[Timestamp]
    var Name: js.UndefOr[EnvironmentName]
    var NetworkFabricType: js.UndefOr[NetworkFabricType]
    var OwnerAccountId: js.UndefOr[AccountId]
    var State: js.UndefOr[EnvironmentState]
    var Tags: js.UndefOr[TagMap]
    var TransitGatewayId: js.UndefOr[TransitGatewayId]
  }

  object EnvironmentSummary {
    @inline
    def apply(
        Arn: js.UndefOr[ResourceArn] = js.undefined,
        CreatedTime: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        EnvironmentId: js.UndefOr[EnvironmentId] = js.undefined,
        Error: js.UndefOr[ErrorResponse] = js.undefined,
        LastUpdatedTime: js.UndefOr[Timestamp] = js.undefined,
        Name: js.UndefOr[EnvironmentName] = js.undefined,
        NetworkFabricType: js.UndefOr[NetworkFabricType] = js.undefined,
        OwnerAccountId: js.UndefOr[AccountId] = js.undefined,
        State: js.UndefOr[EnvironmentState] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined,
        TransitGatewayId: js.UndefOr[TransitGatewayId] = js.undefined
    ): EnvironmentSummary = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EnvironmentId.foreach(__v => __obj.updateDynamic("EnvironmentId")(__v.asInstanceOf[js.Any]))
      Error.foreach(__v => __obj.updateDynamic("Error")(__v.asInstanceOf[js.Any]))
      LastUpdatedTime.foreach(__v => __obj.updateDynamic("LastUpdatedTime")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      NetworkFabricType.foreach(__v => __obj.updateDynamic("NetworkFabricType")(__v.asInstanceOf[js.Any]))
      OwnerAccountId.foreach(__v => __obj.updateDynamic("OwnerAccountId")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TransitGatewayId.foreach(__v => __obj.updateDynamic("TransitGatewayId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EnvironmentSummary]
    }
  }

  /** Provides summary information for the <code>EnvironmentVpc</code> resource as a response to <code>ListEnvironmentVpc</code>.
    */
  @js.native
  trait EnvironmentVpc extends js.Object {
    var AccountId: js.UndefOr[AccountId]
    var CidrBlocks: js.UndefOr[CidrBlocks]
    var CreatedTime: js.UndefOr[Timestamp]
    var EnvironmentId: js.UndefOr[EnvironmentId]
    var LastUpdatedTime: js.UndefOr[Timestamp]
    var VpcId: js.UndefOr[VpcId]
    var VpcName: js.UndefOr[Ec2TagValue]
  }

  object EnvironmentVpc {
    @inline
    def apply(
        AccountId: js.UndefOr[AccountId] = js.undefined,
        CidrBlocks: js.UndefOr[CidrBlocks] = js.undefined,
        CreatedTime: js.UndefOr[Timestamp] = js.undefined,
        EnvironmentId: js.UndefOr[EnvironmentId] = js.undefined,
        LastUpdatedTime: js.UndefOr[Timestamp] = js.undefined,
        VpcId: js.UndefOr[VpcId] = js.undefined,
        VpcName: js.UndefOr[Ec2TagValue] = js.undefined
    ): EnvironmentVpc = {
      val __obj = js.Dynamic.literal()
      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      CidrBlocks.foreach(__v => __obj.updateDynamic("CidrBlocks")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      EnvironmentId.foreach(__v => __obj.updateDynamic("EnvironmentId")(__v.asInstanceOf[js.Any]))
      LastUpdatedTime.foreach(__v => __obj.updateDynamic("LastUpdatedTime")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      VpcName.foreach(__v => __obj.updateDynamic("VpcName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EnvironmentVpc]
    }
  }

  /** Error associated with a resource returned for a Get or List resource response.
    */
  @js.native
  trait ErrorResponse extends js.Object {
    var AccountId: js.UndefOr[AccountId]
    var AdditionalDetails: js.UndefOr[AdditionalDetails]
    var Code: js.UndefOr[ErrorCode]
    var Message: js.UndefOr[ErrorMessage]
    var ResourceIdentifier: js.UndefOr[ResourceIdentifier]
    var ResourceType: js.UndefOr[ErrorResourceType]
  }

  object ErrorResponse {
    @inline
    def apply(
        AccountId: js.UndefOr[AccountId] = js.undefined,
        AdditionalDetails: js.UndefOr[AdditionalDetails] = js.undefined,
        Code: js.UndefOr[ErrorCode] = js.undefined,
        Message: js.UndefOr[ErrorMessage] = js.undefined,
        ResourceIdentifier: js.UndefOr[ResourceIdentifier] = js.undefined,
        ResourceType: js.UndefOr[ErrorResourceType] = js.undefined
    ): ErrorResponse = {
      val __obj = js.Dynamic.literal()
      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      AdditionalDetails.foreach(__v => __obj.updateDynamic("AdditionalDetails")(__v.asInstanceOf[js.Any]))
      Code.foreach(__v => __obj.updateDynamic("Code")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      ResourceIdentifier.foreach(__v => __obj.updateDynamic("ResourceIdentifier")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ErrorResponse]
    }
  }

  @js.native
  trait GetApplicationRequest extends js.Object {
    var ApplicationIdentifier: ApplicationId
    var EnvironmentIdentifier: EnvironmentId
  }

  object GetApplicationRequest {
    @inline
    def apply(
        ApplicationIdentifier: ApplicationId,
        EnvironmentIdentifier: EnvironmentId
    ): GetApplicationRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationIdentifier" -> ApplicationIdentifier.asInstanceOf[js.Any],
        "EnvironmentIdentifier" -> EnvironmentIdentifier.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetApplicationRequest]
    }
  }

  @js.native
  trait GetApplicationResponse extends js.Object {
    var ApiGatewayProxy: js.UndefOr[ApiGatewayProxyConfig]
    var ApplicationId: js.UndefOr[ApplicationId]
    var Arn: js.UndefOr[ResourceArn]
    var CreatedByAccountId: js.UndefOr[AccountId]
    var CreatedTime: js.UndefOr[Timestamp]
    var EnvironmentId: js.UndefOr[EnvironmentId]
    var Error: js.UndefOr[ErrorResponse]
    var LastUpdatedTime: js.UndefOr[Timestamp]
    var Name: js.UndefOr[ApplicationName]
    var OwnerAccountId: js.UndefOr[AccountId]
    var ProxyType: js.UndefOr[ProxyType]
    var State: js.UndefOr[ApplicationState]
    var Tags: js.UndefOr[TagMap]
    var VpcId: js.UndefOr[VpcId]
  }

  object GetApplicationResponse {
    @inline
    def apply(
        ApiGatewayProxy: js.UndefOr[ApiGatewayProxyConfig] = js.undefined,
        ApplicationId: js.UndefOr[ApplicationId] = js.undefined,
        Arn: js.UndefOr[ResourceArn] = js.undefined,
        CreatedByAccountId: js.UndefOr[AccountId] = js.undefined,
        CreatedTime: js.UndefOr[Timestamp] = js.undefined,
        EnvironmentId: js.UndefOr[EnvironmentId] = js.undefined,
        Error: js.UndefOr[ErrorResponse] = js.undefined,
        LastUpdatedTime: js.UndefOr[Timestamp] = js.undefined,
        Name: js.UndefOr[ApplicationName] = js.undefined,
        OwnerAccountId: js.UndefOr[AccountId] = js.undefined,
        ProxyType: js.UndefOr[ProxyType] = js.undefined,
        State: js.UndefOr[ApplicationState] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined,
        VpcId: js.UndefOr[VpcId] = js.undefined
    ): GetApplicationResponse = {
      val __obj = js.Dynamic.literal()
      ApiGatewayProxy.foreach(__v => __obj.updateDynamic("ApiGatewayProxy")(__v.asInstanceOf[js.Any]))
      ApplicationId.foreach(__v => __obj.updateDynamic("ApplicationId")(__v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatedByAccountId.foreach(__v => __obj.updateDynamic("CreatedByAccountId")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      EnvironmentId.foreach(__v => __obj.updateDynamic("EnvironmentId")(__v.asInstanceOf[js.Any]))
      Error.foreach(__v => __obj.updateDynamic("Error")(__v.asInstanceOf[js.Any]))
      LastUpdatedTime.foreach(__v => __obj.updateDynamic("LastUpdatedTime")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      OwnerAccountId.foreach(__v => __obj.updateDynamic("OwnerAccountId")(__v.asInstanceOf[js.Any]))
      ProxyType.foreach(__v => __obj.updateDynamic("ProxyType")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetApplicationResponse]
    }
  }

  @js.native
  trait GetEnvironmentRequest extends js.Object {
    var EnvironmentIdentifier: EnvironmentId
  }

  object GetEnvironmentRequest {
    @inline
    def apply(
        EnvironmentIdentifier: EnvironmentId
    ): GetEnvironmentRequest = {
      val __obj = js.Dynamic.literal(
        "EnvironmentIdentifier" -> EnvironmentIdentifier.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetEnvironmentRequest]
    }
  }

  @js.native
  trait GetEnvironmentResponse extends js.Object {
    var Arn: js.UndefOr[ResourceArn]
    var CreatedTime: js.UndefOr[Timestamp]
    var Description: js.UndefOr[Description]
    var EnvironmentId: js.UndefOr[EnvironmentId]
    var Error: js.UndefOr[ErrorResponse]
    var LastUpdatedTime: js.UndefOr[Timestamp]
    var Name: js.UndefOr[EnvironmentName]
    var NetworkFabricType: js.UndefOr[NetworkFabricType]
    var OwnerAccountId: js.UndefOr[AccountId]
    var State: js.UndefOr[EnvironmentState]
    var Tags: js.UndefOr[TagMap]
    var TransitGatewayId: js.UndefOr[TransitGatewayId]
  }

  object GetEnvironmentResponse {
    @inline
    def apply(
        Arn: js.UndefOr[ResourceArn] = js.undefined,
        CreatedTime: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        EnvironmentId: js.UndefOr[EnvironmentId] = js.undefined,
        Error: js.UndefOr[ErrorResponse] = js.undefined,
        LastUpdatedTime: js.UndefOr[Timestamp] = js.undefined,
        Name: js.UndefOr[EnvironmentName] = js.undefined,
        NetworkFabricType: js.UndefOr[NetworkFabricType] = js.undefined,
        OwnerAccountId: js.UndefOr[AccountId] = js.undefined,
        State: js.UndefOr[EnvironmentState] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined,
        TransitGatewayId: js.UndefOr[TransitGatewayId] = js.undefined
    ): GetEnvironmentResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EnvironmentId.foreach(__v => __obj.updateDynamic("EnvironmentId")(__v.asInstanceOf[js.Any]))
      Error.foreach(__v => __obj.updateDynamic("Error")(__v.asInstanceOf[js.Any]))
      LastUpdatedTime.foreach(__v => __obj.updateDynamic("LastUpdatedTime")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      NetworkFabricType.foreach(__v => __obj.updateDynamic("NetworkFabricType")(__v.asInstanceOf[js.Any]))
      OwnerAccountId.foreach(__v => __obj.updateDynamic("OwnerAccountId")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TransitGatewayId.foreach(__v => __obj.updateDynamic("TransitGatewayId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetEnvironmentResponse]
    }
  }

  @js.native
  trait GetResourcePolicyRequest extends js.Object {
    var Identifier: ResourcePolicyIdentifier
  }

  object GetResourcePolicyRequest {
    @inline
    def apply(
        Identifier: ResourcePolicyIdentifier
    ): GetResourcePolicyRequest = {
      val __obj = js.Dynamic.literal(
        "Identifier" -> Identifier.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetResourcePolicyRequest]
    }
  }

  @js.native
  trait GetResourcePolicyResponse extends js.Object {
    var Policy: js.UndefOr[PolicyString]
  }

  object GetResourcePolicyResponse {
    @inline
    def apply(
        Policy: js.UndefOr[PolicyString] = js.undefined
    ): GetResourcePolicyResponse = {
      val __obj = js.Dynamic.literal()
      Policy.foreach(__v => __obj.updateDynamic("Policy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetResourcePolicyResponse]
    }
  }

  @js.native
  trait GetRouteRequest extends js.Object {
    var ApplicationIdentifier: ApplicationId
    var EnvironmentIdentifier: EnvironmentId
    var RouteIdentifier: RouteId
  }

  object GetRouteRequest {
    @inline
    def apply(
        ApplicationIdentifier: ApplicationId,
        EnvironmentIdentifier: EnvironmentId,
        RouteIdentifier: RouteId
    ): GetRouteRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationIdentifier" -> ApplicationIdentifier.asInstanceOf[js.Any],
        "EnvironmentIdentifier" -> EnvironmentIdentifier.asInstanceOf[js.Any],
        "RouteIdentifier" -> RouteIdentifier.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetRouteRequest]
    }
  }

  @js.native
  trait GetRouteResponse extends js.Object {
    var ApplicationId: js.UndefOr[ApplicationId]
    var Arn: js.UndefOr[ResourceArn]
    var CreatedByAccountId: js.UndefOr[AccountId]
    var CreatedTime: js.UndefOr[Timestamp]
    var EnvironmentId: js.UndefOr[EnvironmentId]
    var Error: js.UndefOr[ErrorResponse]
    var IncludeChildPaths: js.UndefOr[Boolean]
    var LastUpdatedTime: js.UndefOr[Timestamp]
    var Methods: js.UndefOr[HttpMethods]
    var OwnerAccountId: js.UndefOr[AccountId]
    var PathResourceToId: js.UndefOr[PathResourceToId]
    var RouteId: js.UndefOr[RouteId]
    var RouteType: js.UndefOr[RouteType]
    var ServiceId: js.UndefOr[ServiceId]
    var SourcePath: js.UndefOr[UriPath]
    var State: js.UndefOr[RouteState]
    var Tags: js.UndefOr[TagMap]
  }

  object GetRouteResponse {
    @inline
    def apply(
        ApplicationId: js.UndefOr[ApplicationId] = js.undefined,
        Arn: js.UndefOr[ResourceArn] = js.undefined,
        CreatedByAccountId: js.UndefOr[AccountId] = js.undefined,
        CreatedTime: js.UndefOr[Timestamp] = js.undefined,
        EnvironmentId: js.UndefOr[EnvironmentId] = js.undefined,
        Error: js.UndefOr[ErrorResponse] = js.undefined,
        IncludeChildPaths: js.UndefOr[Boolean] = js.undefined,
        LastUpdatedTime: js.UndefOr[Timestamp] = js.undefined,
        Methods: js.UndefOr[HttpMethods] = js.undefined,
        OwnerAccountId: js.UndefOr[AccountId] = js.undefined,
        PathResourceToId: js.UndefOr[PathResourceToId] = js.undefined,
        RouteId: js.UndefOr[RouteId] = js.undefined,
        RouteType: js.UndefOr[RouteType] = js.undefined,
        ServiceId: js.UndefOr[ServiceId] = js.undefined,
        SourcePath: js.UndefOr[UriPath] = js.undefined,
        State: js.UndefOr[RouteState] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): GetRouteResponse = {
      val __obj = js.Dynamic.literal()
      ApplicationId.foreach(__v => __obj.updateDynamic("ApplicationId")(__v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatedByAccountId.foreach(__v => __obj.updateDynamic("CreatedByAccountId")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      EnvironmentId.foreach(__v => __obj.updateDynamic("EnvironmentId")(__v.asInstanceOf[js.Any]))
      Error.foreach(__v => __obj.updateDynamic("Error")(__v.asInstanceOf[js.Any]))
      IncludeChildPaths.foreach(__v => __obj.updateDynamic("IncludeChildPaths")(__v.asInstanceOf[js.Any]))
      LastUpdatedTime.foreach(__v => __obj.updateDynamic("LastUpdatedTime")(__v.asInstanceOf[js.Any]))
      Methods.foreach(__v => __obj.updateDynamic("Methods")(__v.asInstanceOf[js.Any]))
      OwnerAccountId.foreach(__v => __obj.updateDynamic("OwnerAccountId")(__v.asInstanceOf[js.Any]))
      PathResourceToId.foreach(__v => __obj.updateDynamic("PathResourceToId")(__v.asInstanceOf[js.Any]))
      RouteId.foreach(__v => __obj.updateDynamic("RouteId")(__v.asInstanceOf[js.Any]))
      RouteType.foreach(__v => __obj.updateDynamic("RouteType")(__v.asInstanceOf[js.Any]))
      ServiceId.foreach(__v => __obj.updateDynamic("ServiceId")(__v.asInstanceOf[js.Any]))
      SourcePath.foreach(__v => __obj.updateDynamic("SourcePath")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRouteResponse]
    }
  }

  @js.native
  trait GetServiceRequest extends js.Object {
    var ApplicationIdentifier: ApplicationId
    var EnvironmentIdentifier: EnvironmentId
    var ServiceIdentifier: ServiceId
  }

  object GetServiceRequest {
    @inline
    def apply(
        ApplicationIdentifier: ApplicationId,
        EnvironmentIdentifier: EnvironmentId,
        ServiceIdentifier: ServiceId
    ): GetServiceRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationIdentifier" -> ApplicationIdentifier.asInstanceOf[js.Any],
        "EnvironmentIdentifier" -> EnvironmentIdentifier.asInstanceOf[js.Any],
        "ServiceIdentifier" -> ServiceIdentifier.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetServiceRequest]
    }
  }

  @js.native
  trait GetServiceResponse extends js.Object {
    var ApplicationId: js.UndefOr[ApplicationId]
    var Arn: js.UndefOr[ResourceArn]
    var CreatedByAccountId: js.UndefOr[AccountId]
    var CreatedTime: js.UndefOr[Timestamp]
    var Description: js.UndefOr[Description]
    var EndpointType: js.UndefOr[ServiceEndpointType]
    var EnvironmentId: js.UndefOr[EnvironmentId]
    var Error: js.UndefOr[ErrorResponse]
    var LambdaEndpoint: js.UndefOr[LambdaEndpointConfig]
    var LastUpdatedTime: js.UndefOr[Timestamp]
    var Name: js.UndefOr[ServiceName]
    var OwnerAccountId: js.UndefOr[AccountId]
    var ServiceId: js.UndefOr[ServiceId]
    var State: js.UndefOr[ServiceState]
    var Tags: js.UndefOr[TagMap]
    var UrlEndpoint: js.UndefOr[UrlEndpointConfig]
    var VpcId: js.UndefOr[VpcId]
  }

  object GetServiceResponse {
    @inline
    def apply(
        ApplicationId: js.UndefOr[ApplicationId] = js.undefined,
        Arn: js.UndefOr[ResourceArn] = js.undefined,
        CreatedByAccountId: js.UndefOr[AccountId] = js.undefined,
        CreatedTime: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        EndpointType: js.UndefOr[ServiceEndpointType] = js.undefined,
        EnvironmentId: js.UndefOr[EnvironmentId] = js.undefined,
        Error: js.UndefOr[ErrorResponse] = js.undefined,
        LambdaEndpoint: js.UndefOr[LambdaEndpointConfig] = js.undefined,
        LastUpdatedTime: js.UndefOr[Timestamp] = js.undefined,
        Name: js.UndefOr[ServiceName] = js.undefined,
        OwnerAccountId: js.UndefOr[AccountId] = js.undefined,
        ServiceId: js.UndefOr[ServiceId] = js.undefined,
        State: js.UndefOr[ServiceState] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined,
        UrlEndpoint: js.UndefOr[UrlEndpointConfig] = js.undefined,
        VpcId: js.UndefOr[VpcId] = js.undefined
    ): GetServiceResponse = {
      val __obj = js.Dynamic.literal()
      ApplicationId.foreach(__v => __obj.updateDynamic("ApplicationId")(__v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatedByAccountId.foreach(__v => __obj.updateDynamic("CreatedByAccountId")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EndpointType.foreach(__v => __obj.updateDynamic("EndpointType")(__v.asInstanceOf[js.Any]))
      EnvironmentId.foreach(__v => __obj.updateDynamic("EnvironmentId")(__v.asInstanceOf[js.Any]))
      Error.foreach(__v => __obj.updateDynamic("Error")(__v.asInstanceOf[js.Any]))
      LambdaEndpoint.foreach(__v => __obj.updateDynamic("LambdaEndpoint")(__v.asInstanceOf[js.Any]))
      LastUpdatedTime.foreach(__v => __obj.updateDynamic("LastUpdatedTime")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      OwnerAccountId.foreach(__v => __obj.updateDynamic("OwnerAccountId")(__v.asInstanceOf[js.Any]))
      ServiceId.foreach(__v => __obj.updateDynamic("ServiceId")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      UrlEndpoint.foreach(__v => __obj.updateDynamic("UrlEndpoint")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetServiceResponse]
    }
  }

  /** The configuration for the Lambda endpoint type.
    */
  @js.native
  trait LambdaEndpointConfig extends js.Object {
    var Arn: js.UndefOr[LambdaArn]
  }

  object LambdaEndpointConfig {
    @inline
    def apply(
        Arn: js.UndefOr[LambdaArn] = js.undefined
    ): LambdaEndpointConfig = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LambdaEndpointConfig]
    }
  }

  /** The input for the Lambda endpoint type.
    */
  @js.native
  trait LambdaEndpointInput extends js.Object {
    var Arn: LambdaArn
  }

  object LambdaEndpointInput {
    @inline
    def apply(
        Arn: LambdaArn
    ): LambdaEndpointInput = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[LambdaEndpointInput]
    }
  }

  /** The summary for the Lambda endpoint type.
    */
  @js.native
  trait LambdaEndpointSummary extends js.Object {
    var Arn: js.UndefOr[LambdaArn]
  }

  object LambdaEndpointSummary {
    @inline
    def apply(
        Arn: js.UndefOr[LambdaArn] = js.undefined
    ): LambdaEndpointSummary = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LambdaEndpointSummary]
    }
  }

  @js.native
  trait ListApplicationsRequest extends js.Object {
    var EnvironmentIdentifier: EnvironmentId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListApplicationsRequest {
    @inline
    def apply(
        EnvironmentIdentifier: EnvironmentId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListApplicationsRequest = {
      val __obj = js.Dynamic.literal(
        "EnvironmentIdentifier" -> EnvironmentIdentifier.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListApplicationsRequest]
    }
  }

  @js.native
  trait ListApplicationsResponse extends js.Object {
    var ApplicationSummaryList: js.UndefOr[ApplicationSummaries]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListApplicationsResponse {
    @inline
    def apply(
        ApplicationSummaryList: js.UndefOr[ApplicationSummaries] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListApplicationsResponse = {
      val __obj = js.Dynamic.literal()
      ApplicationSummaryList.foreach(__v => __obj.updateDynamic("ApplicationSummaryList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListApplicationsResponse]
    }
  }

  @js.native
  trait ListEnvironmentVpcsRequest extends js.Object {
    var EnvironmentIdentifier: EnvironmentId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListEnvironmentVpcsRequest {
    @inline
    def apply(
        EnvironmentIdentifier: EnvironmentId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListEnvironmentVpcsRequest = {
      val __obj = js.Dynamic.literal(
        "EnvironmentIdentifier" -> EnvironmentIdentifier.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEnvironmentVpcsRequest]
    }
  }

  @js.native
  trait ListEnvironmentVpcsResponse extends js.Object {
    var EnvironmentVpcList: js.UndefOr[EnvironmentVpcs]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListEnvironmentVpcsResponse {
    @inline
    def apply(
        EnvironmentVpcList: js.UndefOr[EnvironmentVpcs] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListEnvironmentVpcsResponse = {
      val __obj = js.Dynamic.literal()
      EnvironmentVpcList.foreach(__v => __obj.updateDynamic("EnvironmentVpcList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEnvironmentVpcsResponse]
    }
  }

  @js.native
  trait ListEnvironmentsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListEnvironmentsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListEnvironmentsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEnvironmentsRequest]
    }
  }

  @js.native
  trait ListEnvironmentsResponse extends js.Object {
    var EnvironmentSummaryList: js.UndefOr[EnvironmentSummaries]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListEnvironmentsResponse {
    @inline
    def apply(
        EnvironmentSummaryList: js.UndefOr[EnvironmentSummaries] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListEnvironmentsResponse = {
      val __obj = js.Dynamic.literal()
      EnvironmentSummaryList.foreach(__v => __obj.updateDynamic("EnvironmentSummaryList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEnvironmentsResponse]
    }
  }

  @js.native
  trait ListRoutesRequest extends js.Object {
    var ApplicationIdentifier: ApplicationId
    var EnvironmentIdentifier: EnvironmentId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListRoutesRequest {
    @inline
    def apply(
        ApplicationIdentifier: ApplicationId,
        EnvironmentIdentifier: EnvironmentId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListRoutesRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationIdentifier" -> ApplicationIdentifier.asInstanceOf[js.Any],
        "EnvironmentIdentifier" -> EnvironmentIdentifier.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRoutesRequest]
    }
  }

  @js.native
  trait ListRoutesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var RouteSummaryList: js.UndefOr[RouteSummaries]
  }

  object ListRoutesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        RouteSummaryList: js.UndefOr[RouteSummaries] = js.undefined
    ): ListRoutesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RouteSummaryList.foreach(__v => __obj.updateDynamic("RouteSummaryList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRoutesResponse]
    }
  }

  @js.native
  trait ListServicesRequest extends js.Object {
    var ApplicationIdentifier: ApplicationId
    var EnvironmentIdentifier: EnvironmentId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListServicesRequest {
    @inline
    def apply(
        ApplicationIdentifier: ApplicationId,
        EnvironmentIdentifier: EnvironmentId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListServicesRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationIdentifier" -> ApplicationIdentifier.asInstanceOf[js.Any],
        "EnvironmentIdentifier" -> EnvironmentIdentifier.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListServicesRequest]
    }
  }

  @js.native
  trait ListServicesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var ServiceSummaryList: js.UndefOr[ServiceSummaries]
  }

  object ListServicesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ServiceSummaryList: js.UndefOr[ServiceSummaries] = js.undefined
    ): ListServicesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ServiceSummaryList.foreach(__v => __obj.updateDynamic("ServiceSummaryList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListServicesResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: String
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceArn: String
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[TagMap]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        Tags: js.UndefOr[TagMap] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  @js.native
  trait PutResourcePolicyRequest extends js.Object {
    var Policy: PolicyString
    var ResourceArn: ResourceArn
  }

  object PutResourcePolicyRequest {
    @inline
    def apply(
        Policy: PolicyString,
        ResourceArn: ResourceArn
    ): PutResourcePolicyRequest = {
      val __obj = js.Dynamic.literal(
        "Policy" -> Policy.asInstanceOf[js.Any],
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutResourcePolicyRequest]
    }
  }

  @js.native
  trait PutResourcePolicyResponse extends js.Object

  object PutResourcePolicyResponse {
    @inline
    def apply(): PutResourcePolicyResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutResourcePolicyResponse]
    }
  }

  /** The summary information for the routes as a response to <code>ListRoutes</code>.
    */
  @js.native
  trait RouteSummary extends js.Object {
    var ApplicationId: js.UndefOr[ApplicationId]
    var Arn: js.UndefOr[ResourceArn]
    var CreatedByAccountId: js.UndefOr[AccountId]
    var CreatedTime: js.UndefOr[Timestamp]
    var EnvironmentId: js.UndefOr[EnvironmentId]
    var Error: js.UndefOr[ErrorResponse]
    var IncludeChildPaths: js.UndefOr[Boolean]
    var LastUpdatedTime: js.UndefOr[Timestamp]
    var Methods: js.UndefOr[HttpMethods]
    var OwnerAccountId: js.UndefOr[AccountId]
    var PathResourceToId: js.UndefOr[PathResourceToId]
    var RouteId: js.UndefOr[RouteId]
    var RouteType: js.UndefOr[RouteType]
    var ServiceId: js.UndefOr[ServiceId]
    var SourcePath: js.UndefOr[UriPath]
    var State: js.UndefOr[RouteState]
    var Tags: js.UndefOr[TagMap]
  }

  object RouteSummary {
    @inline
    def apply(
        ApplicationId: js.UndefOr[ApplicationId] = js.undefined,
        Arn: js.UndefOr[ResourceArn] = js.undefined,
        CreatedByAccountId: js.UndefOr[AccountId] = js.undefined,
        CreatedTime: js.UndefOr[Timestamp] = js.undefined,
        EnvironmentId: js.UndefOr[EnvironmentId] = js.undefined,
        Error: js.UndefOr[ErrorResponse] = js.undefined,
        IncludeChildPaths: js.UndefOr[Boolean] = js.undefined,
        LastUpdatedTime: js.UndefOr[Timestamp] = js.undefined,
        Methods: js.UndefOr[HttpMethods] = js.undefined,
        OwnerAccountId: js.UndefOr[AccountId] = js.undefined,
        PathResourceToId: js.UndefOr[PathResourceToId] = js.undefined,
        RouteId: js.UndefOr[RouteId] = js.undefined,
        RouteType: js.UndefOr[RouteType] = js.undefined,
        ServiceId: js.UndefOr[ServiceId] = js.undefined,
        SourcePath: js.UndefOr[UriPath] = js.undefined,
        State: js.UndefOr[RouteState] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): RouteSummary = {
      val __obj = js.Dynamic.literal()
      ApplicationId.foreach(__v => __obj.updateDynamic("ApplicationId")(__v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatedByAccountId.foreach(__v => __obj.updateDynamic("CreatedByAccountId")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      EnvironmentId.foreach(__v => __obj.updateDynamic("EnvironmentId")(__v.asInstanceOf[js.Any]))
      Error.foreach(__v => __obj.updateDynamic("Error")(__v.asInstanceOf[js.Any]))
      IncludeChildPaths.foreach(__v => __obj.updateDynamic("IncludeChildPaths")(__v.asInstanceOf[js.Any]))
      LastUpdatedTime.foreach(__v => __obj.updateDynamic("LastUpdatedTime")(__v.asInstanceOf[js.Any]))
      Methods.foreach(__v => __obj.updateDynamic("Methods")(__v.asInstanceOf[js.Any]))
      OwnerAccountId.foreach(__v => __obj.updateDynamic("OwnerAccountId")(__v.asInstanceOf[js.Any]))
      PathResourceToId.foreach(__v => __obj.updateDynamic("PathResourceToId")(__v.asInstanceOf[js.Any]))
      RouteId.foreach(__v => __obj.updateDynamic("RouteId")(__v.asInstanceOf[js.Any]))
      RouteType.foreach(__v => __obj.updateDynamic("RouteType")(__v.asInstanceOf[js.Any]))
      ServiceId.foreach(__v => __obj.updateDynamic("ServiceId")(__v.asInstanceOf[js.Any]))
      SourcePath.foreach(__v => __obj.updateDynamic("SourcePath")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RouteSummary]
    }
  }

  /** A summary for the service as a response to <code>ListServices</code>.
    */
  @js.native
  trait ServiceSummary extends js.Object {
    var ApplicationId: js.UndefOr[ApplicationId]
    var Arn: js.UndefOr[ResourceArn]
    var CreatedByAccountId: js.UndefOr[AccountId]
    var CreatedTime: js.UndefOr[Timestamp]
    var Description: js.UndefOr[Description]
    var EndpointType: js.UndefOr[ServiceEndpointType]
    var EnvironmentId: js.UndefOr[EnvironmentId]
    var Error: js.UndefOr[ErrorResponse]
    var LambdaEndpoint: js.UndefOr[LambdaEndpointSummary]
    var LastUpdatedTime: js.UndefOr[Timestamp]
    var Name: js.UndefOr[ServiceName]
    var OwnerAccountId: js.UndefOr[AccountId]
    var ServiceId: js.UndefOr[ServiceId]
    var State: js.UndefOr[ServiceState]
    var Tags: js.UndefOr[TagMap]
    var UrlEndpoint: js.UndefOr[UrlEndpointSummary]
    var VpcId: js.UndefOr[VpcId]
  }

  object ServiceSummary {
    @inline
    def apply(
        ApplicationId: js.UndefOr[ApplicationId] = js.undefined,
        Arn: js.UndefOr[ResourceArn] = js.undefined,
        CreatedByAccountId: js.UndefOr[AccountId] = js.undefined,
        CreatedTime: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        EndpointType: js.UndefOr[ServiceEndpointType] = js.undefined,
        EnvironmentId: js.UndefOr[EnvironmentId] = js.undefined,
        Error: js.UndefOr[ErrorResponse] = js.undefined,
        LambdaEndpoint: js.UndefOr[LambdaEndpointSummary] = js.undefined,
        LastUpdatedTime: js.UndefOr[Timestamp] = js.undefined,
        Name: js.UndefOr[ServiceName] = js.undefined,
        OwnerAccountId: js.UndefOr[AccountId] = js.undefined,
        ServiceId: js.UndefOr[ServiceId] = js.undefined,
        State: js.UndefOr[ServiceState] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined,
        UrlEndpoint: js.UndefOr[UrlEndpointSummary] = js.undefined,
        VpcId: js.UndefOr[VpcId] = js.undefined
    ): ServiceSummary = {
      val __obj = js.Dynamic.literal()
      ApplicationId.foreach(__v => __obj.updateDynamic("ApplicationId")(__v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatedByAccountId.foreach(__v => __obj.updateDynamic("CreatedByAccountId")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EndpointType.foreach(__v => __obj.updateDynamic("EndpointType")(__v.asInstanceOf[js.Any]))
      EnvironmentId.foreach(__v => __obj.updateDynamic("EnvironmentId")(__v.asInstanceOf[js.Any]))
      Error.foreach(__v => __obj.updateDynamic("Error")(__v.asInstanceOf[js.Any]))
      LambdaEndpoint.foreach(__v => __obj.updateDynamic("LambdaEndpoint")(__v.asInstanceOf[js.Any]))
      LastUpdatedTime.foreach(__v => __obj.updateDynamic("LastUpdatedTime")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      OwnerAccountId.foreach(__v => __obj.updateDynamic("OwnerAccountId")(__v.asInstanceOf[js.Any]))
      ServiceId.foreach(__v => __obj.updateDynamic("ServiceId")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      UrlEndpoint.foreach(__v => __obj.updateDynamic("UrlEndpoint")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServiceSummary]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: String
    var Tags: TagMap
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceArn: String,
        Tags: TagMap
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
    var ResourceArn: String
    var TagKeys: TagKeys
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceArn: String,
        TagKeys: TagKeys
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

  /** The configuration for the URI path route type.
    */
  @js.native
  trait UriPathRouteInput extends js.Object {
    var ActivationState: RouteActivationState
    var SourcePath: UriPath
    var IncludeChildPaths: js.UndefOr[Boolean]
    var Methods: js.UndefOr[HttpMethods]
  }

  object UriPathRouteInput {
    @inline
    def apply(
        ActivationState: RouteActivationState,
        SourcePath: UriPath,
        IncludeChildPaths: js.UndefOr[Boolean] = js.undefined,
        Methods: js.UndefOr[HttpMethods] = js.undefined
    ): UriPathRouteInput = {
      val __obj = js.Dynamic.literal(
        "ActivationState" -> ActivationState.asInstanceOf[js.Any],
        "SourcePath" -> SourcePath.asInstanceOf[js.Any]
      )

      IncludeChildPaths.foreach(__v => __obj.updateDynamic("IncludeChildPaths")(__v.asInstanceOf[js.Any]))
      Methods.foreach(__v => __obj.updateDynamic("Methods")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UriPathRouteInput]
    }
  }

  /** The configuration for the URL endpoint type.
    */
  @js.native
  trait UrlEndpointConfig extends js.Object {
    var HealthUrl: js.UndefOr[Uri]
    var Url: js.UndefOr[Uri]
  }

  object UrlEndpointConfig {
    @inline
    def apply(
        HealthUrl: js.UndefOr[Uri] = js.undefined,
        Url: js.UndefOr[Uri] = js.undefined
    ): UrlEndpointConfig = {
      val __obj = js.Dynamic.literal()
      HealthUrl.foreach(__v => __obj.updateDynamic("HealthUrl")(__v.asInstanceOf[js.Any]))
      Url.foreach(__v => __obj.updateDynamic("Url")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UrlEndpointConfig]
    }
  }

  /** The configuration for the URL endpoint type.
    */
  @js.native
  trait UrlEndpointInput extends js.Object {
    var Url: Uri
    var HealthUrl: js.UndefOr[Uri]
  }

  object UrlEndpointInput {
    @inline
    def apply(
        Url: Uri,
        HealthUrl: js.UndefOr[Uri] = js.undefined
    ): UrlEndpointInput = {
      val __obj = js.Dynamic.literal(
        "Url" -> Url.asInstanceOf[js.Any]
      )

      HealthUrl.foreach(__v => __obj.updateDynamic("HealthUrl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UrlEndpointInput]
    }
  }

  /** The summary of the configuration for the URL endpoint type.
    */
  @js.native
  trait UrlEndpointSummary extends js.Object {
    var HealthUrl: js.UndefOr[Uri]
    var Url: js.UndefOr[Uri]
  }

  object UrlEndpointSummary {
    @inline
    def apply(
        HealthUrl: js.UndefOr[Uri] = js.undefined,
        Url: js.UndefOr[Uri] = js.undefined
    ): UrlEndpointSummary = {
      val __obj = js.Dynamic.literal()
      HealthUrl.foreach(__v => __obj.updateDynamic("HealthUrl")(__v.asInstanceOf[js.Any]))
      Url.foreach(__v => __obj.updateDynamic("Url")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UrlEndpointSummary]
    }
  }
}
