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
  type TagKey                        = String
  type TagKeyList                    = js.Array[TagKey]
  type TagMap                        = js.Dictionary[TagValue]
  type TagValue                      = String
  type Timestamp                     = js.Date
  type UpdateParamType               = String
  type UpdateParams                  = js.Array[UpdateParam]
  type UpdateStatus                  = String
  type UpdateType                    = String

  implicit final class EKSOps(private val service: EKS) extends AnyVal {
    @inline def createClusterFuture(params: CreateClusterRequest): Future[CreateClusterResponse] =
      service.createCluster(params).promise.toFuture
    @inline def deleteClusterFuture(params: DeleteClusterRequest): Future[DeleteClusterResponse] =
      service.deleteCluster(params).promise.toFuture
    @inline def describeClusterFuture(params: DescribeClusterRequest): Future[DescribeClusterResponse] =
      service.describeCluster(params).promise.toFuture
    @inline def describeUpdateFuture(params: DescribeUpdateRequest): Future[DescribeUpdateResponse] =
      service.describeUpdate(params).promise.toFuture
    @inline def listClustersFuture(params: ListClustersRequest): Future[ListClustersResponse] =
      service.listClusters(params).promise.toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise.toFuture
    @inline def listUpdatesFuture(params: ListUpdatesRequest): Future[ListUpdatesResponse] =
      service.listUpdates(params).promise.toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise.toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise.toFuture
    @inline def updateClusterConfigFuture(params: UpdateClusterConfigRequest): Future[UpdateClusterConfigResponse] =
      service.updateClusterConfig(params).promise.toFuture
    @inline def updateClusterVersionFuture(params: UpdateClusterVersionRequest): Future[UpdateClusterVersionResponse] =
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
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse]    = js.native
    def listUpdates(params: ListUpdatesRequest): Request[ListUpdatesResponse]                            = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse]                            = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse]                      = js.native
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
    @inline
    def apply(
        data: js.UndefOr[String] = js.undefined
    ): Certificate = {
      val __obj = js.Dynamic.literal()
      data.foreach(__v => __obj.updateDynamic("data")(__v.asInstanceOf[js.Any]))
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
    var identity: js.UndefOr[Identity]
    var logging: js.UndefOr[Logging]
    var name: js.UndefOr[String]
    var platformVersion: js.UndefOr[String]
    var resourcesVpcConfig: js.UndefOr[VpcConfigResponse]
    var roleArn: js.UndefOr[String]
    var status: js.UndefOr[ClusterStatus]
    var tags: js.UndefOr[TagMap]
    var version: js.UndefOr[String]
  }

  object Cluster {
    @inline
    def apply(
        arn: js.UndefOr[String] = js.undefined,
        certificateAuthority: js.UndefOr[Certificate] = js.undefined,
        clientRequestToken: js.UndefOr[String] = js.undefined,
        createdAt: js.UndefOr[Timestamp] = js.undefined,
        endpoint: js.UndefOr[String] = js.undefined,
        identity: js.UndefOr[Identity] = js.undefined,
        logging: js.UndefOr[Logging] = js.undefined,
        name: js.UndefOr[String] = js.undefined,
        platformVersion: js.UndefOr[String] = js.undefined,
        resourcesVpcConfig: js.UndefOr[VpcConfigResponse] = js.undefined,
        roleArn: js.UndefOr[String] = js.undefined,
        status: js.UndefOr[ClusterStatus] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined,
        version: js.UndefOr[String] = js.undefined
    ): Cluster = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      certificateAuthority.foreach(__v => __obj.updateDynamic("certificateAuthority")(__v.asInstanceOf[js.Any]))
      clientRequestToken.foreach(__v => __obj.updateDynamic("clientRequestToken")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      endpoint.foreach(__v => __obj.updateDynamic("endpoint")(__v.asInstanceOf[js.Any]))
      identity.foreach(__v => __obj.updateDynamic("identity")(__v.asInstanceOf[js.Any]))
      logging.foreach(__v => __obj.updateDynamic("logging")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      platformVersion.foreach(__v => __obj.updateDynamic("platformVersion")(__v.asInstanceOf[js.Any]))
      resourcesVpcConfig.foreach(__v => __obj.updateDynamic("resourcesVpcConfig")(__v.asInstanceOf[js.Any]))
      roleArn.foreach(__v => __obj.updateDynamic("roleArn")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Cluster]
    }
  }

  object ClusterStatusEnum {
    val CREATING = "CREATING"
    val ACTIVE   = "ACTIVE"
    val DELETING = "DELETING"
    val FAILED   = "FAILED"

    val values = js.Object.freeze(js.Array(CREATING, ACTIVE, DELETING, FAILED))
  }

  @js.native
  trait CreateClusterRequest extends js.Object {
    var name: ClusterName
    var resourcesVpcConfig: VpcConfigRequest
    var roleArn: String
    var clientRequestToken: js.UndefOr[String]
    var logging: js.UndefOr[Logging]
    var tags: js.UndefOr[TagMap]
    var version: js.UndefOr[String]
  }

  object CreateClusterRequest {
    @inline
    def apply(
        name: ClusterName,
        resourcesVpcConfig: VpcConfigRequest,
        roleArn: String,
        clientRequestToken: js.UndefOr[String] = js.undefined,
        logging: js.UndefOr[Logging] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined,
        version: js.UndefOr[String] = js.undefined
    ): CreateClusterRequest = {
      val __obj = js.Dynamic.literal(
        "name"               -> name.asInstanceOf[js.Any],
        "resourcesVpcConfig" -> resourcesVpcConfig.asInstanceOf[js.Any],
        "roleArn"            -> roleArn.asInstanceOf[js.Any]
      )

      clientRequestToken.foreach(__v => __obj.updateDynamic("clientRequestToken")(__v.asInstanceOf[js.Any]))
      logging.foreach(__v => __obj.updateDynamic("logging")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateClusterRequest]
    }
  }

  @js.native
  trait CreateClusterResponse extends js.Object {
    var cluster: js.UndefOr[Cluster]
  }

  object CreateClusterResponse {
    @inline
    def apply(
        cluster: js.UndefOr[Cluster] = js.undefined
    ): CreateClusterResponse = {
      val __obj = js.Dynamic.literal()
      cluster.foreach(__v => __obj.updateDynamic("cluster")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateClusterResponse]
    }
  }

  @js.native
  trait DeleteClusterRequest extends js.Object {
    var name: String
  }

  object DeleteClusterRequest {
    @inline
    def apply(
        name: String
    ): DeleteClusterRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        cluster: js.UndefOr[Cluster] = js.undefined
    ): DeleteClusterResponse = {
      val __obj = js.Dynamic.literal()
      cluster.foreach(__v => __obj.updateDynamic("cluster")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteClusterResponse]
    }
  }

  @js.native
  trait DescribeClusterRequest extends js.Object {
    var name: String
  }

  object DescribeClusterRequest {
    @inline
    def apply(
        name: String
    ): DescribeClusterRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        cluster: js.UndefOr[Cluster] = js.undefined
    ): DescribeClusterResponse = {
      val __obj = js.Dynamic.literal()
      cluster.foreach(__v => __obj.updateDynamic("cluster")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeClusterResponse]
    }
  }

  @js.native
  trait DescribeUpdateRequest extends js.Object {
    var name: String
    var updateId: String
  }

  object DescribeUpdateRequest {
    @inline
    def apply(
        name: String,
        updateId: String
    ): DescribeUpdateRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        update: js.UndefOr[Update] = js.undefined
    ): DescribeUpdateResponse = {
      val __obj = js.Dynamic.literal()
      update.foreach(__v => __obj.updateDynamic("update")(__v.asInstanceOf[js.Any]))
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

    val values = js.Object.freeze(
      js.Array(
        SubnetNotFound,
        SecurityGroupNotFound,
        EniLimitReached,
        IpNotAvailable,
        AccessDenied,
        OperationNotPermitted,
        VpcIdNotFound,
        Unknown
      )
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
    @inline
    def apply(
        errorCode: js.UndefOr[ErrorCode] = js.undefined,
        errorMessage: js.UndefOr[String] = js.undefined,
        resourceIds: js.UndefOr[StringList] = js.undefined
    ): ErrorDetail = {
      val __obj = js.Dynamic.literal()
      errorCode.foreach(__v => __obj.updateDynamic("errorCode")(__v.asInstanceOf[js.Any]))
      errorMessage.foreach(__v => __obj.updateDynamic("errorMessage")(__v.asInstanceOf[js.Any]))
      resourceIds.foreach(__v => __obj.updateDynamic("resourceIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ErrorDetail]
    }
  }

  /**
    * An object representing an identity provider for authentication credentials.
    */
  @js.native
  trait Identity extends js.Object {
    var oidc: js.UndefOr[OIDC]
  }

  object Identity {
    @inline
    def apply(
        oidc: js.UndefOr[OIDC] = js.undefined
    ): Identity = {
      val __obj = js.Dynamic.literal()
      oidc.foreach(__v => __obj.updateDynamic("oidc")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Identity]
    }
  }

  @js.native
  trait ListClustersRequest extends js.Object {
    var maxResults: js.UndefOr[ListClustersRequestMaxResults]
    var nextToken: js.UndefOr[String]
  }

  object ListClustersRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[ListClustersRequestMaxResults] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListClustersRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListClustersRequest]
    }
  }

  @js.native
  trait ListClustersResponse extends js.Object {
    var clusters: js.UndefOr[StringList]
    var nextToken: js.UndefOr[String]
  }

  object ListClustersResponse {
    @inline
    def apply(
        clusters: js.UndefOr[StringList] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListClustersResponse = {
      val __obj = js.Dynamic.literal()
      clusters.foreach(__v => __obj.updateDynamic("clusters")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListClustersResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: String
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        resourceArn: String
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var tags: js.UndefOr[TagMap]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        tags: js.UndefOr[TagMap] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  @js.native
  trait ListUpdatesRequest extends js.Object {
    var name: String
    var maxResults: js.UndefOr[ListUpdatesRequestMaxResults]
    var nextToken: js.UndefOr[String]
  }

  object ListUpdatesRequest {
    @inline
    def apply(
        name: String,
        maxResults: js.UndefOr[ListUpdatesRequestMaxResults] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListUpdatesRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUpdatesRequest]
    }
  }

  @js.native
  trait ListUpdatesResponse extends js.Object {
    var nextToken: js.UndefOr[String]
    var updateIds: js.UndefOr[StringList]
  }

  object ListUpdatesResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[String] = js.undefined,
        updateIds: js.UndefOr[StringList] = js.undefined
    ): ListUpdatesResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      updateIds.foreach(__v => __obj.updateDynamic("updateIds")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        enabled: js.UndefOr[BoxedBoolean] = js.undefined,
        types: js.UndefOr[LogTypes] = js.undefined
    ): LogSetup = {
      val __obj = js.Dynamic.literal()
      enabled.foreach(__v => __obj.updateDynamic("enabled")(__v.asInstanceOf[js.Any]))
      types.foreach(__v => __obj.updateDynamic("types")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LogSetup]
    }
  }

  object LogTypeEnum {
    val api               = "api"
    val audit             = "audit"
    val authenticator     = "authenticator"
    val controllerManager = "controllerManager"
    val scheduler         = "scheduler"

    val values = js.Object.freeze(js.Array(api, audit, authenticator, controllerManager, scheduler))
  }

  /**
    * An object representing the logging configuration for resources in your cluster.
    */
  @js.native
  trait Logging extends js.Object {
    var clusterLogging: js.UndefOr[LogSetups]
  }

  object Logging {
    @inline
    def apply(
        clusterLogging: js.UndefOr[LogSetups] = js.undefined
    ): Logging = {
      val __obj = js.Dynamic.literal()
      clusterLogging.foreach(__v => __obj.updateDynamic("clusterLogging")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Logging]
    }
  }

  /**
    * An object representing the [[https://openid.net/connect/|OpenID Connect]] identity provider information for the cluster.
    */
  @js.native
  trait OIDC extends js.Object {
    var issuer: js.UndefOr[String]
  }

  object OIDC {
    @inline
    def apply(
        issuer: js.UndefOr[String] = js.undefined
    ): OIDC = {
      val __obj = js.Dynamic.literal()
      issuer.foreach(__v => __obj.updateDynamic("issuer")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OIDC]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: String
    var tags: TagMap
  }

  object TagResourceRequest {
    @inline
    def apply(
        resourceArn: String,
        tags: TagMap
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tags"        -> tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object {}

  object TagResourceResponse {
    @inline
    def apply(
        ): TagResourceResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var resourceArn: String
    var tagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        resourceArn: String,
        tagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tagKeys"     -> tagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object {}

  object UntagResourceResponse {
    @inline
    def apply(
        ): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UntagResourceResponse]
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
    @inline
    def apply(
        createdAt: js.UndefOr[Timestamp] = js.undefined,
        errors: js.UndefOr[ErrorDetails] = js.undefined,
        id: js.UndefOr[String] = js.undefined,
        params: js.UndefOr[UpdateParams] = js.undefined,
        status: js.UndefOr[UpdateStatus] = js.undefined,
        `type`: js.UndefOr[UpdateType] = js.undefined
    ): Update = {
      val __obj = js.Dynamic.literal()
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      errors.foreach(__v => __obj.updateDynamic("errors")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      params.foreach(__v => __obj.updateDynamic("params")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        name: String,
        clientRequestToken: js.UndefOr[String] = js.undefined,
        logging: js.UndefOr[Logging] = js.undefined,
        resourcesVpcConfig: js.UndefOr[VpcConfigRequest] = js.undefined
    ): UpdateClusterConfigRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      clientRequestToken.foreach(__v => __obj.updateDynamic("clientRequestToken")(__v.asInstanceOf[js.Any]))
      logging.foreach(__v => __obj.updateDynamic("logging")(__v.asInstanceOf[js.Any]))
      resourcesVpcConfig.foreach(__v => __obj.updateDynamic("resourcesVpcConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateClusterConfigRequest]
    }
  }

  @js.native
  trait UpdateClusterConfigResponse extends js.Object {
    var update: js.UndefOr[Update]
  }

  object UpdateClusterConfigResponse {
    @inline
    def apply(
        update: js.UndefOr[Update] = js.undefined
    ): UpdateClusterConfigResponse = {
      val __obj = js.Dynamic.literal()
      update.foreach(__v => __obj.updateDynamic("update")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        name: String,
        version: String,
        clientRequestToken: js.UndefOr[String] = js.undefined
    ): UpdateClusterVersionRequest = {
      val __obj = js.Dynamic.literal(
        "name"    -> name.asInstanceOf[js.Any],
        "version" -> version.asInstanceOf[js.Any]
      )

      clientRequestToken.foreach(__v => __obj.updateDynamic("clientRequestToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateClusterVersionRequest]
    }
  }

  @js.native
  trait UpdateClusterVersionResponse extends js.Object {
    var update: js.UndefOr[Update]
  }

  object UpdateClusterVersionResponse {
    @inline
    def apply(
        update: js.UndefOr[Update] = js.undefined
    ): UpdateClusterVersionResponse = {
      val __obj = js.Dynamic.literal()
      update.foreach(__v => __obj.updateDynamic("update")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        `type`: js.UndefOr[UpdateParamType] = js.undefined,
        value: js.UndefOr[String] = js.undefined
    ): UpdateParam = {
      val __obj = js.Dynamic.literal()
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateParam]
    }
  }

  object UpdateParamTypeEnum {
    val Version               = "Version"
    val PlatformVersion       = "PlatformVersion"
    val EndpointPrivateAccess = "EndpointPrivateAccess"
    val EndpointPublicAccess  = "EndpointPublicAccess"
    val ClusterLogging        = "ClusterLogging"

    val values =
      js.Object.freeze(js.Array(Version, PlatformVersion, EndpointPrivateAccess, EndpointPublicAccess, ClusterLogging))
  }

  object UpdateStatusEnum {
    val InProgress = "InProgress"
    val Failed     = "Failed"
    val Cancelled  = "Cancelled"
    val Successful = "Successful"

    val values = js.Object.freeze(js.Array(InProgress, Failed, Cancelled, Successful))
  }

  object UpdateTypeEnum {
    val VersionUpdate        = "VersionUpdate"
    val EndpointAccessUpdate = "EndpointAccessUpdate"
    val LoggingUpdate        = "LoggingUpdate"

    val values = js.Object.freeze(js.Array(VersionUpdate, EndpointAccessUpdate, LoggingUpdate))
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
    @inline
    def apply(
        endpointPrivateAccess: js.UndefOr[BoxedBoolean] = js.undefined,
        endpointPublicAccess: js.UndefOr[BoxedBoolean] = js.undefined,
        securityGroupIds: js.UndefOr[StringList] = js.undefined,
        subnetIds: js.UndefOr[StringList] = js.undefined
    ): VpcConfigRequest = {
      val __obj = js.Dynamic.literal()
      endpointPrivateAccess.foreach(__v => __obj.updateDynamic("endpointPrivateAccess")(__v.asInstanceOf[js.Any]))
      endpointPublicAccess.foreach(__v => __obj.updateDynamic("endpointPublicAccess")(__v.asInstanceOf[js.Any]))
      securityGroupIds.foreach(__v => __obj.updateDynamic("securityGroupIds")(__v.asInstanceOf[js.Any]))
      subnetIds.foreach(__v => __obj.updateDynamic("subnetIds")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        endpointPrivateAccess: js.UndefOr[Boolean] = js.undefined,
        endpointPublicAccess: js.UndefOr[Boolean] = js.undefined,
        securityGroupIds: js.UndefOr[StringList] = js.undefined,
        subnetIds: js.UndefOr[StringList] = js.undefined,
        vpcId: js.UndefOr[String] = js.undefined
    ): VpcConfigResponse = {
      val __obj = js.Dynamic.literal()
      endpointPrivateAccess.foreach(__v => __obj.updateDynamic("endpointPrivateAccess")(__v.asInstanceOf[js.Any]))
      endpointPublicAccess.foreach(__v => __obj.updateDynamic("endpointPublicAccess")(__v.asInstanceOf[js.Any]))
      securityGroupIds.foreach(__v => __obj.updateDynamic("securityGroupIds")(__v.asInstanceOf[js.Any]))
      subnetIds.foreach(__v => __obj.updateDynamic("subnetIds")(__v.asInstanceOf[js.Any]))
      vpcId.foreach(__v => __obj.updateDynamic("vpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VpcConfigResponse]
    }
  }
}
