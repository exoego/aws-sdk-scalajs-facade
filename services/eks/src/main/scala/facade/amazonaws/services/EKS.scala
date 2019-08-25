package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object eks {
  type BoxedBoolean                  = Boolean
  type ClusterName                   = String
  type ClusterStatus                 = String
  type ErrorCode                     = String
  type ErrorDetails                  = js.Array[ErrorDetail]
  type ListClustersRequestMaxResults = Int
  type ListUpdatesRequestMaxResults  = Int
  type LogSetups                     = js.Array[LogSetup]
  type LogType                       = String
  type LogTypes                      = js.Array[LogType]
  type StringList                    = js.Array[String]
  type Timestamp                     = js.Date
  type UpdateParamType               = String
  type UpdateParams                  = js.Array[UpdateParam]
  type UpdateStatus                  = String
  type UpdateType                    = String

  implicit final class EKSOps(val service: EKS) extends AnyVal {

    def createClusterFuture(params: CreateClusterRequest): Future[CreateClusterResponse] =
      service.createCluster(params).promise.toFuture
    def deleteClusterFuture(params: DeleteClusterRequest): Future[DeleteClusterResponse] =
      service.deleteCluster(params).promise.toFuture
    def describeClusterFuture(params: DescribeClusterRequest): Future[DescribeClusterResponse] =
      service.describeCluster(params).promise.toFuture
    def describeUpdateFuture(params: DescribeUpdateRequest): Future[DescribeUpdateResponse] =
      service.describeUpdate(params).promise.toFuture
    def listClustersFuture(params: ListClustersRequest): Future[ListClustersResponse] =
      service.listClusters(params).promise.toFuture
    def listUpdatesFuture(params: ListUpdatesRequest): Future[ListUpdatesResponse] =
      service.listUpdates(params).promise.toFuture
    def updateClusterConfigFuture(params: UpdateClusterConfigRequest): Future[UpdateClusterConfigResponse] =
      service.updateClusterConfig(params).promise.toFuture
    def updateClusterVersionFuture(params: UpdateClusterVersionRequest): Future[UpdateClusterVersionResponse] =
      service.updateClusterVersion(params).promise.toFuture
  }
}

package eks {
  @js.native
  @JSImport("aws-sdk", "EKS")
  class EKS() extends js.Object {
    def this(config: AWSConfig) = this()

    def createCluster(params: CreateClusterRequest): Request[CreateClusterResponse]                      = js.native
    def deleteCluster(params: DeleteClusterRequest): Request[DeleteClusterResponse]                      = js.native
    def describeCluster(params: DescribeClusterRequest): Request[DescribeClusterResponse]                = js.native
    def describeUpdate(params: DescribeUpdateRequest): Request[DescribeUpdateResponse]                   = js.native
    def listClusters(params: ListClustersRequest): Request[ListClustersResponse]                         = js.native
    def listUpdates(params: ListUpdatesRequest): Request[ListUpdatesResponse]                            = js.native
    def updateClusterConfig(params: UpdateClusterConfigRequest): Request[UpdateClusterConfigResponse]    = js.native
    def updateClusterVersion(params: UpdateClusterVersionRequest): Request[UpdateClusterVersionResponse] = js.native
  }

  /**
    * An object representing the <code>certificate-authority-data</code> for your cluster.
    */
  @js.native
  trait Certificate extends js.Object {
    var data: js.UndefOr[String]
  }

  object Certificate {
    def apply(
        data: js.UndefOr[String] = js.undefined
    ): Certificate = {
      val __obj = js.Dictionary.empty[js.Any]
      data.foreach(__v => __obj.update("data", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Certificate]
    }
  }

  /**
    * An object representing an Amazon EKS cluster.
    */
  @js.native
  trait Cluster extends js.Object {
    var arn: js.UndefOr[String]
    var certificateAuthority: js.UndefOr[Certificate]
    var clientRequestToken: js.UndefOr[String]
    var createdAt: js.UndefOr[Timestamp]
    var endpoint: js.UndefOr[String]
    var logging: js.UndefOr[Logging]
    var name: js.UndefOr[String]
    var platformVersion: js.UndefOr[String]
    var resourcesVpcConfig: js.UndefOr[VpcConfigResponse]
    var roleArn: js.UndefOr[String]
    var status: js.UndefOr[ClusterStatus]
    var version: js.UndefOr[String]
  }

  object Cluster {
    def apply(
        arn: js.UndefOr[String] = js.undefined,
        certificateAuthority: js.UndefOr[Certificate] = js.undefined,
        clientRequestToken: js.UndefOr[String] = js.undefined,
        createdAt: js.UndefOr[Timestamp] = js.undefined,
        endpoint: js.UndefOr[String] = js.undefined,
        logging: js.UndefOr[Logging] = js.undefined,
        name: js.UndefOr[String] = js.undefined,
        platformVersion: js.UndefOr[String] = js.undefined,
        resourcesVpcConfig: js.UndefOr[VpcConfigResponse] = js.undefined,
        roleArn: js.UndefOr[String] = js.undefined,
        status: js.UndefOr[ClusterStatus] = js.undefined,
        version: js.UndefOr[String] = js.undefined
    ): Cluster = {
      val __obj = js.Dictionary.empty[js.Any]
      arn.foreach(__v => __obj.update("arn", __v.asInstanceOf[js.Any]))
      certificateAuthority.foreach(__v => __obj.update("certificateAuthority", __v.asInstanceOf[js.Any]))
      clientRequestToken.foreach(__v => __obj.update("clientRequestToken", __v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.update("createdAt", __v.asInstanceOf[js.Any]))
      endpoint.foreach(__v => __obj.update("endpoint", __v.asInstanceOf[js.Any]))
      logging.foreach(__v => __obj.update("logging", __v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      platformVersion.foreach(__v => __obj.update("platformVersion", __v.asInstanceOf[js.Any]))
      resourcesVpcConfig.foreach(__v => __obj.update("resourcesVpcConfig", __v.asInstanceOf[js.Any]))
      roleArn.foreach(__v => __obj.update("roleArn", __v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.update("status", __v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.update("version", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Cluster]
    }
  }

  object ClusterStatusEnum {
    val CREATING = "CREATING"
    val ACTIVE   = "ACTIVE"
    val DELETING = "DELETING"
    val FAILED   = "FAILED"

    val values = IndexedSeq(CREATING, ACTIVE, DELETING, FAILED)
  }

  @js.native
  trait CreateClusterRequest extends js.Object {
    var name: ClusterName
    var resourcesVpcConfig: VpcConfigRequest
    var roleArn: String
    var clientRequestToken: js.UndefOr[String]
    var logging: js.UndefOr[Logging]
    var version: js.UndefOr[String]
  }

  object CreateClusterRequest {
    def apply(
        name: ClusterName,
        resourcesVpcConfig: VpcConfigRequest,
        roleArn: String,
        clientRequestToken: js.UndefOr[String] = js.undefined,
        logging: js.UndefOr[Logging] = js.undefined,
        version: js.UndefOr[String] = js.undefined
    ): CreateClusterRequest = {
      val __obj = js.Dictionary[js.Any](
        "name"               -> name.asInstanceOf[js.Any],
        "resourcesVpcConfig" -> resourcesVpcConfig.asInstanceOf[js.Any],
        "roleArn"            -> roleArn.asInstanceOf[js.Any]
      )

      clientRequestToken.foreach(__v => __obj.update("clientRequestToken", __v.asInstanceOf[js.Any]))
      logging.foreach(__v => __obj.update("logging", __v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.update("version", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateClusterRequest]
    }
  }

  @js.native
  trait CreateClusterResponse extends js.Object {
    var cluster: js.UndefOr[Cluster]
  }

  object CreateClusterResponse {
    def apply(
        cluster: js.UndefOr[Cluster] = js.undefined
    ): CreateClusterResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      cluster.foreach(__v => __obj.update("cluster", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateClusterResponse]
    }
  }

  @js.native
  trait DeleteClusterRequest extends js.Object {
    var name: String
  }

  object DeleteClusterRequest {
    def apply(
        name: String
    ): DeleteClusterRequest = {
      val __obj = js.Dictionary[js.Any](
        "name" -> name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteClusterRequest]
    }
  }

  @js.native
  trait DeleteClusterResponse extends js.Object {
    var cluster: js.UndefOr[Cluster]
  }

  object DeleteClusterResponse {
    def apply(
        cluster: js.UndefOr[Cluster] = js.undefined
    ): DeleteClusterResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      cluster.foreach(__v => __obj.update("cluster", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteClusterResponse]
    }
  }

  @js.native
  trait DescribeClusterRequest extends js.Object {
    var name: String
  }

  object DescribeClusterRequest {
    def apply(
        name: String
    ): DescribeClusterRequest = {
      val __obj = js.Dictionary[js.Any](
        "name" -> name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeClusterRequest]
    }
  }

  @js.native
  trait DescribeClusterResponse extends js.Object {
    var cluster: js.UndefOr[Cluster]
  }

  object DescribeClusterResponse {
    def apply(
        cluster: js.UndefOr[Cluster] = js.undefined
    ): DescribeClusterResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      cluster.foreach(__v => __obj.update("cluster", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeClusterResponse]
    }
  }

  @js.native
  trait DescribeUpdateRequest extends js.Object {
    var name: String
    var updateId: String
  }

  object DescribeUpdateRequest {
    def apply(
        name: String,
        updateId: String
    ): DescribeUpdateRequest = {
      val __obj = js.Dictionary[js.Any](
        "name"     -> name.asInstanceOf[js.Any],
        "updateId" -> updateId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeUpdateRequest]
    }
  }

  @js.native
  trait DescribeUpdateResponse extends js.Object {
    var update: js.UndefOr[Update]
  }

  object DescribeUpdateResponse {
    def apply(
        update: js.UndefOr[Update] = js.undefined
    ): DescribeUpdateResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      update.foreach(__v => __obj.update("update", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeUpdateResponse]
    }
  }

  object ErrorCodeEnum {
    val SubnetNotFound        = "SubnetNotFound"
    val SecurityGroupNotFound = "SecurityGroupNotFound"
    val EniLimitReached       = "EniLimitReached"
    val IpNotAvailable        = "IpNotAvailable"
    val AccessDenied          = "AccessDenied"
    val OperationNotPermitted = "OperationNotPermitted"
    val VpcIdNotFound         = "VpcIdNotFound"
    val Unknown               = "Unknown"

    val values = IndexedSeq(
      SubnetNotFound,
      SecurityGroupNotFound,
      EniLimitReached,
      IpNotAvailable,
      AccessDenied,
      OperationNotPermitted,
      VpcIdNotFound,
      Unknown
    )
  }

  /**
    * An object representing an error when an asynchronous operation fails.
    */
  @js.native
  trait ErrorDetail extends js.Object {
    var errorCode: js.UndefOr[ErrorCode]
    var errorMessage: js.UndefOr[String]
    var resourceIds: js.UndefOr[StringList]
  }

  object ErrorDetail {
    def apply(
        errorCode: js.UndefOr[ErrorCode] = js.undefined,
        errorMessage: js.UndefOr[String] = js.undefined,
        resourceIds: js.UndefOr[StringList] = js.undefined
    ): ErrorDetail = {
      val __obj = js.Dictionary.empty[js.Any]
      errorCode.foreach(__v => __obj.update("errorCode", __v.asInstanceOf[js.Any]))
      errorMessage.foreach(__v => __obj.update("errorMessage", __v.asInstanceOf[js.Any]))
      resourceIds.foreach(__v => __obj.update("resourceIds", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ErrorDetail]
    }
  }

  @js.native
  trait ListClustersRequest extends js.Object {
    var maxResults: js.UndefOr[ListClustersRequestMaxResults]
    var nextToken: js.UndefOr[String]
  }

  object ListClustersRequest {
    def apply(
        maxResults: js.UndefOr[ListClustersRequestMaxResults] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListClustersRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      maxResults.foreach(__v => __obj.update("maxResults", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListClustersRequest]
    }
  }

  @js.native
  trait ListClustersResponse extends js.Object {
    var clusters: js.UndefOr[StringList]
    var nextToken: js.UndefOr[String]
  }

  object ListClustersResponse {
    def apply(
        clusters: js.UndefOr[StringList] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListClustersResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      clusters.foreach(__v => __obj.update("clusters", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListClustersResponse]
    }
  }

  @js.native
  trait ListUpdatesRequest extends js.Object {
    var name: String
    var maxResults: js.UndefOr[ListUpdatesRequestMaxResults]
    var nextToken: js.UndefOr[String]
  }

  object ListUpdatesRequest {
    def apply(
        name: String,
        maxResults: js.UndefOr[ListUpdatesRequestMaxResults] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListUpdatesRequest = {
      val __obj = js.Dictionary[js.Any](
        "name" -> name.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.update("maxResults", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUpdatesRequest]
    }
  }

  @js.native
  trait ListUpdatesResponse extends js.Object {
    var nextToken: js.UndefOr[String]
    var updateIds: js.UndefOr[StringList]
  }

  object ListUpdatesResponse {
    def apply(
        nextToken: js.UndefOr[String] = js.undefined,
        updateIds: js.UndefOr[StringList] = js.undefined
    ): ListUpdatesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      updateIds.foreach(__v => __obj.update("updateIds", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUpdatesResponse]
    }
  }

  /**
    * An object representing the enabled or disabled Kubernetes control plane logs for your cluster.
    */
  @js.native
  trait LogSetup extends js.Object {
    var enabled: js.UndefOr[BoxedBoolean]
    var types: js.UndefOr[LogTypes]
  }

  object LogSetup {
    def apply(
        enabled: js.UndefOr[BoxedBoolean] = js.undefined,
        types: js.UndefOr[LogTypes] = js.undefined
    ): LogSetup = {
      val __obj = js.Dictionary.empty[js.Any]
      enabled.foreach(__v => __obj.update("enabled", __v.asInstanceOf[js.Any]))
      types.foreach(__v => __obj.update("types", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LogSetup]
    }
  }

  object LogTypeEnum {
    val api               = "api"
    val audit             = "audit"
    val authenticator     = "authenticator"
    val controllerManager = "controllerManager"
    val scheduler         = "scheduler"

    val values = IndexedSeq(api, audit, authenticator, controllerManager, scheduler)
  }

  /**
    * An object representing the logging configuration for resources in your cluster.
    */
  @js.native
  trait Logging extends js.Object {
    var clusterLogging: js.UndefOr[LogSetups]
  }

  object Logging {
    def apply(
        clusterLogging: js.UndefOr[LogSetups] = js.undefined
    ): Logging = {
      val __obj = js.Dictionary.empty[js.Any]
      clusterLogging.foreach(__v => __obj.update("clusterLogging", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Logging]
    }
  }

  /**
    * An object representing an asynchronous update.
    */
  @js.native
  trait Update extends js.Object {
    var createdAt: js.UndefOr[Timestamp]
    var errors: js.UndefOr[ErrorDetails]
    var id: js.UndefOr[String]
    var params: js.UndefOr[UpdateParams]
    var status: js.UndefOr[UpdateStatus]
    var `type`: js.UndefOr[UpdateType]
  }

  object Update {
    def apply(
        createdAt: js.UndefOr[Timestamp] = js.undefined,
        errors: js.UndefOr[ErrorDetails] = js.undefined,
        id: js.UndefOr[String] = js.undefined,
        params: js.UndefOr[UpdateParams] = js.undefined,
        status: js.UndefOr[UpdateStatus] = js.undefined,
        `type`: js.UndefOr[UpdateType] = js.undefined
    ): Update = {
      val __obj = js.Dictionary.empty[js.Any]
      createdAt.foreach(__v => __obj.update("createdAt", __v.asInstanceOf[js.Any]))
      errors.foreach(__v => __obj.update("errors", __v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.update("id", __v.asInstanceOf[js.Any]))
      params.foreach(__v => __obj.update("params", __v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.update("status", __v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.update("type", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Update]
    }
  }

  @js.native
  trait UpdateClusterConfigRequest extends js.Object {
    var name: String
    var clientRequestToken: js.UndefOr[String]
    var logging: js.UndefOr[Logging]
    var resourcesVpcConfig: js.UndefOr[VpcConfigRequest]
  }

  object UpdateClusterConfigRequest {
    def apply(
        name: String,
        clientRequestToken: js.UndefOr[String] = js.undefined,
        logging: js.UndefOr[Logging] = js.undefined,
        resourcesVpcConfig: js.UndefOr[VpcConfigRequest] = js.undefined
    ): UpdateClusterConfigRequest = {
      val __obj = js.Dictionary[js.Any](
        "name" -> name.asInstanceOf[js.Any]
      )

      clientRequestToken.foreach(__v => __obj.update("clientRequestToken", __v.asInstanceOf[js.Any]))
      logging.foreach(__v => __obj.update("logging", __v.asInstanceOf[js.Any]))
      resourcesVpcConfig.foreach(__v => __obj.update("resourcesVpcConfig", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateClusterConfigRequest]
    }
  }

  @js.native
  trait UpdateClusterConfigResponse extends js.Object {
    var update: js.UndefOr[Update]
  }

  object UpdateClusterConfigResponse {
    def apply(
        update: js.UndefOr[Update] = js.undefined
    ): UpdateClusterConfigResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      update.foreach(__v => __obj.update("update", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateClusterConfigResponse]
    }
  }

  @js.native
  trait UpdateClusterVersionRequest extends js.Object {
    var name: String
    var version: String
    var clientRequestToken: js.UndefOr[String]
  }

  object UpdateClusterVersionRequest {
    def apply(
        name: String,
        version: String,
        clientRequestToken: js.UndefOr[String] = js.undefined
    ): UpdateClusterVersionRequest = {
      val __obj = js.Dictionary[js.Any](
        "name"    -> name.asInstanceOf[js.Any],
        "version" -> version.asInstanceOf[js.Any]
      )

      clientRequestToken.foreach(__v => __obj.update("clientRequestToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateClusterVersionRequest]
    }
  }

  @js.native
  trait UpdateClusterVersionResponse extends js.Object {
    var update: js.UndefOr[Update]
  }

  object UpdateClusterVersionResponse {
    def apply(
        update: js.UndefOr[Update] = js.undefined
    ): UpdateClusterVersionResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      update.foreach(__v => __obj.update("update", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateClusterVersionResponse]
    }
  }

  /**
    * An object representing the details of an update request.
    */
  @js.native
  trait UpdateParam extends js.Object {
    var `type`: js.UndefOr[UpdateParamType]
    var value: js.UndefOr[String]
  }

  object UpdateParam {
    def apply(
        `type`: js.UndefOr[UpdateParamType] = js.undefined,
        value: js.UndefOr[String] = js.undefined
    ): UpdateParam = {
      val __obj = js.Dictionary.empty[js.Any]
      `type`.foreach(__v => __obj.update("type", __v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.update("value", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateParam]
    }
  }

  object UpdateParamTypeEnum {
    val Version               = "Version"
    val PlatformVersion       = "PlatformVersion"
    val EndpointPrivateAccess = "EndpointPrivateAccess"
    val EndpointPublicAccess  = "EndpointPublicAccess"
    val ClusterLogging        = "ClusterLogging"

    val values = IndexedSeq(Version, PlatformVersion, EndpointPrivateAccess, EndpointPublicAccess, ClusterLogging)
  }

  object UpdateStatusEnum {
    val InProgress = "InProgress"
    val Failed     = "Failed"
    val Cancelled  = "Cancelled"
    val Successful = "Successful"

    val values = IndexedSeq(InProgress, Failed, Cancelled, Successful)
  }

  object UpdateTypeEnum {
    val VersionUpdate        = "VersionUpdate"
    val EndpointAccessUpdate = "EndpointAccessUpdate"
    val LoggingUpdate        = "LoggingUpdate"

    val values = IndexedSeq(VersionUpdate, EndpointAccessUpdate, LoggingUpdate)
  }

  /**
    * An object representing the VPC configuration to use for an Amazon EKS cluster.
    */
  @js.native
  trait VpcConfigRequest extends js.Object {
    var endpointPrivateAccess: js.UndefOr[BoxedBoolean]
    var endpointPublicAccess: js.UndefOr[BoxedBoolean]
    var securityGroupIds: js.UndefOr[StringList]
    var subnetIds: js.UndefOr[StringList]
  }

  object VpcConfigRequest {
    def apply(
        endpointPrivateAccess: js.UndefOr[BoxedBoolean] = js.undefined,
        endpointPublicAccess: js.UndefOr[BoxedBoolean] = js.undefined,
        securityGroupIds: js.UndefOr[StringList] = js.undefined,
        subnetIds: js.UndefOr[StringList] = js.undefined
    ): VpcConfigRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      endpointPrivateAccess.foreach(__v => __obj.update("endpointPrivateAccess", __v.asInstanceOf[js.Any]))
      endpointPublicAccess.foreach(__v => __obj.update("endpointPublicAccess", __v.asInstanceOf[js.Any]))
      securityGroupIds.foreach(__v => __obj.update("securityGroupIds", __v.asInstanceOf[js.Any]))
      subnetIds.foreach(__v => __obj.update("subnetIds", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VpcConfigRequest]
    }
  }

  /**
    * An object representing an Amazon EKS cluster VPC configuration response.
    */
  @js.native
  trait VpcConfigResponse extends js.Object {
    var endpointPrivateAccess: js.UndefOr[Boolean]
    var endpointPublicAccess: js.UndefOr[Boolean]
    var securityGroupIds: js.UndefOr[StringList]
    var subnetIds: js.UndefOr[StringList]
    var vpcId: js.UndefOr[String]
  }

  object VpcConfigResponse {
    def apply(
        endpointPrivateAccess: js.UndefOr[Boolean] = js.undefined,
        endpointPublicAccess: js.UndefOr[Boolean] = js.undefined,
        securityGroupIds: js.UndefOr[StringList] = js.undefined,
        subnetIds: js.UndefOr[StringList] = js.undefined,
        vpcId: js.UndefOr[String] = js.undefined
    ): VpcConfigResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      endpointPrivateAccess.foreach(__v => __obj.update("endpointPrivateAccess", __v.asInstanceOf[js.Any]))
      endpointPublicAccess.foreach(__v => __obj.update("endpointPublicAccess", __v.asInstanceOf[js.Any]))
      securityGroupIds.foreach(__v => __obj.update("securityGroupIds", __v.asInstanceOf[js.Any]))
      subnetIds.foreach(__v => __obj.update("subnetIds", __v.asInstanceOf[js.Any]))
      vpcId.foreach(__v => __obj.update("vpcId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VpcConfigResponse]
    }
  }
}
