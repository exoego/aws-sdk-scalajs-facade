package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object eks {
  type AutoScalingGroupList = js.Array[AutoScalingGroup]
  type BoxedBoolean = Boolean
  type BoxedInteger = Int
  type Capacity = Int
  type ClusterName = String
  type EncryptionConfigList = js.Array[EncryptionConfig]
  type ErrorDetails = js.Array[ErrorDetail]
  type FargateProfileLabel = js.Dictionary[String]
  type FargateProfileSelectors = js.Array[FargateProfileSelector]
  type FargateProfilesRequestMaxResults = Int
  type IssueList = js.Array[Issue]
  type ListClustersRequestMaxResults = Int
  type ListNodegroupsRequestMaxResults = Int
  type ListUpdatesRequestMaxResults = Int
  type LogSetups = js.Array[LogSetup]
  type LogTypes = js.Array[LogType]
  type StringList = js.Array[String]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagMap = js.Dictionary[TagValue]
  type TagValue = String
  type Timestamp = js.Date
  type UpdateParams = js.Array[UpdateParam]
  type labelKey = String
  type labelValue = String
  type labelsKeyList = js.Array[String]
  type labelsMap = js.Dictionary[labelValue]

  implicit final class EKSOps(private val service: EKS) extends AnyVal {

    @inline def createClusterFuture(params: CreateClusterRequest): Future[CreateClusterResponse] = service.createCluster(params).promise().toFuture
    @inline def createFargateProfileFuture(params: CreateFargateProfileRequest): Future[CreateFargateProfileResponse] = service.createFargateProfile(params).promise().toFuture
    @inline def createNodegroupFuture(params: CreateNodegroupRequest): Future[CreateNodegroupResponse] = service.createNodegroup(params).promise().toFuture
    @inline def deleteClusterFuture(params: DeleteClusterRequest): Future[DeleteClusterResponse] = service.deleteCluster(params).promise().toFuture
    @inline def deleteFargateProfileFuture(params: DeleteFargateProfileRequest): Future[DeleteFargateProfileResponse] = service.deleteFargateProfile(params).promise().toFuture
    @inline def deleteNodegroupFuture(params: DeleteNodegroupRequest): Future[DeleteNodegroupResponse] = service.deleteNodegroup(params).promise().toFuture
    @inline def describeClusterFuture(params: DescribeClusterRequest): Future[DescribeClusterResponse] = service.describeCluster(params).promise().toFuture
    @inline def describeFargateProfileFuture(params: DescribeFargateProfileRequest): Future[DescribeFargateProfileResponse] = service.describeFargateProfile(params).promise().toFuture
    @inline def describeNodegroupFuture(params: DescribeNodegroupRequest): Future[DescribeNodegroupResponse] = service.describeNodegroup(params).promise().toFuture
    @inline def describeUpdateFuture(params: DescribeUpdateRequest): Future[DescribeUpdateResponse] = service.describeUpdate(params).promise().toFuture
    @inline def listClustersFuture(params: ListClustersRequest): Future[ListClustersResponse] = service.listClusters(params).promise().toFuture
    @inline def listFargateProfilesFuture(params: ListFargateProfilesRequest): Future[ListFargateProfilesResponse] = service.listFargateProfiles(params).promise().toFuture
    @inline def listNodegroupsFuture(params: ListNodegroupsRequest): Future[ListNodegroupsResponse] = service.listNodegroups(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def listUpdatesFuture(params: ListUpdatesRequest): Future[ListUpdatesResponse] = service.listUpdates(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateClusterConfigFuture(params: UpdateClusterConfigRequest): Future[UpdateClusterConfigResponse] = service.updateClusterConfig(params).promise().toFuture
    @inline def updateClusterVersionFuture(params: UpdateClusterVersionRequest): Future[UpdateClusterVersionResponse] = service.updateClusterVersion(params).promise().toFuture
    @inline def updateNodegroupConfigFuture(params: UpdateNodegroupConfigRequest): Future[UpdateNodegroupConfigResponse] = service.updateNodegroupConfig(params).promise().toFuture
    @inline def updateNodegroupVersionFuture(params: UpdateNodegroupVersionRequest): Future[UpdateNodegroupVersionResponse] = service.updateNodegroupVersion(params).promise().toFuture
  }
}

package eks {
  @js.native
  @JSImport("aws-sdk", "EKS", "AWS.EKS")
  class EKS() extends js.Object {
    def this(config: AWSConfig) = this()

    def createCluster(params: CreateClusterRequest): Request[CreateClusterResponse] = js.native
    def createFargateProfile(params: CreateFargateProfileRequest): Request[CreateFargateProfileResponse] = js.native
    def createNodegroup(params: CreateNodegroupRequest): Request[CreateNodegroupResponse] = js.native
    def deleteCluster(params: DeleteClusterRequest): Request[DeleteClusterResponse] = js.native
    def deleteFargateProfile(params: DeleteFargateProfileRequest): Request[DeleteFargateProfileResponse] = js.native
    def deleteNodegroup(params: DeleteNodegroupRequest): Request[DeleteNodegroupResponse] = js.native
    def describeCluster(params: DescribeClusterRequest): Request[DescribeClusterResponse] = js.native
    def describeFargateProfile(params: DescribeFargateProfileRequest): Request[DescribeFargateProfileResponse] = js.native
    def describeNodegroup(params: DescribeNodegroupRequest): Request[DescribeNodegroupResponse] = js.native
    def describeUpdate(params: DescribeUpdateRequest): Request[DescribeUpdateResponse] = js.native
    def listClusters(params: ListClustersRequest): Request[ListClustersResponse] = js.native
    def listFargateProfiles(params: ListFargateProfilesRequest): Request[ListFargateProfilesResponse] = js.native
    def listNodegroups(params: ListNodegroupsRequest): Request[ListNodegroupsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def listUpdates(params: ListUpdatesRequest): Request[ListUpdatesResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateClusterConfig(params: UpdateClusterConfigRequest): Request[UpdateClusterConfigResponse] = js.native
    def updateClusterVersion(params: UpdateClusterVersionRequest): Request[UpdateClusterVersionResponse] = js.native
    def updateNodegroupConfig(params: UpdateNodegroupConfigRequest): Request[UpdateNodegroupConfigResponse] = js.native
    def updateNodegroupVersion(params: UpdateNodegroupVersionRequest): Request[UpdateNodegroupVersionResponse] = js.native
  }

  @js.native
  sealed trait AMITypes extends js.Any
  object AMITypes {
    @inline def AL2_x86_64 = "AL2_x86_64".asInstanceOf[AMITypes]
    @inline def AL2_x86_64_GPU = "AL2_x86_64_GPU".asInstanceOf[AMITypes]

    @inline def values = js.Object.freeze(js.Array(AL2_x86_64, AL2_x86_64_GPU))
  }

  /**
    * An Auto Scaling group that is associated with an Amazon EKS managed node group.
    */
  @js.native
  trait AutoScalingGroup extends js.Object {
    var name: js.UndefOr[String]
  }

  object AutoScalingGroup {
    @inline
    def apply(
        name: js.UndefOr[String] = js.undefined
    ): AutoScalingGroup = {
      val __obj = js.Dynamic.literal()
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutoScalingGroup]
    }
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
    var encryptionConfig: js.UndefOr[EncryptionConfigList]
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
        encryptionConfig: js.UndefOr[EncryptionConfigList] = js.undefined,
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
      encryptionConfig.foreach(__v => __obj.updateDynamic("encryptionConfig")(__v.asInstanceOf[js.Any]))
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

  @js.native
  sealed trait ClusterStatus extends js.Any
  object ClusterStatus {
    @inline def CREATING = "CREATING".asInstanceOf[ClusterStatus]
    @inline def ACTIVE = "ACTIVE".asInstanceOf[ClusterStatus]
    @inline def DELETING = "DELETING".asInstanceOf[ClusterStatus]
    @inline def FAILED = "FAILED".asInstanceOf[ClusterStatus]
    @inline def UPDATING = "UPDATING".asInstanceOf[ClusterStatus]

    @inline def values = js.Object.freeze(js.Array(CREATING, ACTIVE, DELETING, FAILED, UPDATING))
  }

  @js.native
  trait CreateClusterRequest extends js.Object {
    var name: ClusterName
    var resourcesVpcConfig: VpcConfigRequest
    var roleArn: String
    var clientRequestToken: js.UndefOr[String]
    var encryptionConfig: js.UndefOr[EncryptionConfigList]
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
        encryptionConfig: js.UndefOr[EncryptionConfigList] = js.undefined,
        logging: js.UndefOr[Logging] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined,
        version: js.UndefOr[String] = js.undefined
    ): CreateClusterRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "resourcesVpcConfig" -> resourcesVpcConfig.asInstanceOf[js.Any],
        "roleArn" -> roleArn.asInstanceOf[js.Any]
      )

      clientRequestToken.foreach(__v => __obj.updateDynamic("clientRequestToken")(__v.asInstanceOf[js.Any]))
      encryptionConfig.foreach(__v => __obj.updateDynamic("encryptionConfig")(__v.asInstanceOf[js.Any]))
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
  trait CreateFargateProfileRequest extends js.Object {
    var clusterName: String
    var fargateProfileName: String
    var podExecutionRoleArn: String
    var clientRequestToken: js.UndefOr[String]
    var selectors: js.UndefOr[FargateProfileSelectors]
    var subnets: js.UndefOr[StringList]
    var tags: js.UndefOr[TagMap]
  }

  object CreateFargateProfileRequest {
    @inline
    def apply(
        clusterName: String,
        fargateProfileName: String,
        podExecutionRoleArn: String,
        clientRequestToken: js.UndefOr[String] = js.undefined,
        selectors: js.UndefOr[FargateProfileSelectors] = js.undefined,
        subnets: js.UndefOr[StringList] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateFargateProfileRequest = {
      val __obj = js.Dynamic.literal(
        "clusterName" -> clusterName.asInstanceOf[js.Any],
        "fargateProfileName" -> fargateProfileName.asInstanceOf[js.Any],
        "podExecutionRoleArn" -> podExecutionRoleArn.asInstanceOf[js.Any]
      )

      clientRequestToken.foreach(__v => __obj.updateDynamic("clientRequestToken")(__v.asInstanceOf[js.Any]))
      selectors.foreach(__v => __obj.updateDynamic("selectors")(__v.asInstanceOf[js.Any]))
      subnets.foreach(__v => __obj.updateDynamic("subnets")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFargateProfileRequest]
    }
  }

  @js.native
  trait CreateFargateProfileResponse extends js.Object {
    var fargateProfile: js.UndefOr[FargateProfile]
  }

  object CreateFargateProfileResponse {
    @inline
    def apply(
        fargateProfile: js.UndefOr[FargateProfile] = js.undefined
    ): CreateFargateProfileResponse = {
      val __obj = js.Dynamic.literal()
      fargateProfile.foreach(__v => __obj.updateDynamic("fargateProfile")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFargateProfileResponse]
    }
  }

  @js.native
  trait CreateNodegroupRequest extends js.Object {
    var clusterName: String
    var nodeRole: String
    var nodegroupName: String
    var subnets: StringList
    var amiType: js.UndefOr[AMITypes]
    var clientRequestToken: js.UndefOr[String]
    var diskSize: js.UndefOr[BoxedInteger]
    var instanceTypes: js.UndefOr[StringList]
    var labels: js.UndefOr[labelsMap]
    var releaseVersion: js.UndefOr[String]
    var remoteAccess: js.UndefOr[RemoteAccessConfig]
    var scalingConfig: js.UndefOr[NodegroupScalingConfig]
    var tags: js.UndefOr[TagMap]
    var version: js.UndefOr[String]
  }

  object CreateNodegroupRequest {
    @inline
    def apply(
        clusterName: String,
        nodeRole: String,
        nodegroupName: String,
        subnets: StringList,
        amiType: js.UndefOr[AMITypes] = js.undefined,
        clientRequestToken: js.UndefOr[String] = js.undefined,
        diskSize: js.UndefOr[BoxedInteger] = js.undefined,
        instanceTypes: js.UndefOr[StringList] = js.undefined,
        labels: js.UndefOr[labelsMap] = js.undefined,
        releaseVersion: js.UndefOr[String] = js.undefined,
        remoteAccess: js.UndefOr[RemoteAccessConfig] = js.undefined,
        scalingConfig: js.UndefOr[NodegroupScalingConfig] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined,
        version: js.UndefOr[String] = js.undefined
    ): CreateNodegroupRequest = {
      val __obj = js.Dynamic.literal(
        "clusterName" -> clusterName.asInstanceOf[js.Any],
        "nodeRole" -> nodeRole.asInstanceOf[js.Any],
        "nodegroupName" -> nodegroupName.asInstanceOf[js.Any],
        "subnets" -> subnets.asInstanceOf[js.Any]
      )

      amiType.foreach(__v => __obj.updateDynamic("amiType")(__v.asInstanceOf[js.Any]))
      clientRequestToken.foreach(__v => __obj.updateDynamic("clientRequestToken")(__v.asInstanceOf[js.Any]))
      diskSize.foreach(__v => __obj.updateDynamic("diskSize")(__v.asInstanceOf[js.Any]))
      instanceTypes.foreach(__v => __obj.updateDynamic("instanceTypes")(__v.asInstanceOf[js.Any]))
      labels.foreach(__v => __obj.updateDynamic("labels")(__v.asInstanceOf[js.Any]))
      releaseVersion.foreach(__v => __obj.updateDynamic("releaseVersion")(__v.asInstanceOf[js.Any]))
      remoteAccess.foreach(__v => __obj.updateDynamic("remoteAccess")(__v.asInstanceOf[js.Any]))
      scalingConfig.foreach(__v => __obj.updateDynamic("scalingConfig")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateNodegroupRequest]
    }
  }

  @js.native
  trait CreateNodegroupResponse extends js.Object {
    var nodegroup: js.UndefOr[Nodegroup]
  }

  object CreateNodegroupResponse {
    @inline
    def apply(
        nodegroup: js.UndefOr[Nodegroup] = js.undefined
    ): CreateNodegroupResponse = {
      val __obj = js.Dynamic.literal()
      nodegroup.foreach(__v => __obj.updateDynamic("nodegroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateNodegroupResponse]
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
  trait DeleteFargateProfileRequest extends js.Object {
    var clusterName: String
    var fargateProfileName: String
  }

  object DeleteFargateProfileRequest {
    @inline
    def apply(
        clusterName: String,
        fargateProfileName: String
    ): DeleteFargateProfileRequest = {
      val __obj = js.Dynamic.literal(
        "clusterName" -> clusterName.asInstanceOf[js.Any],
        "fargateProfileName" -> fargateProfileName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteFargateProfileRequest]
    }
  }

  @js.native
  trait DeleteFargateProfileResponse extends js.Object {
    var fargateProfile: js.UndefOr[FargateProfile]
  }

  object DeleteFargateProfileResponse {
    @inline
    def apply(
        fargateProfile: js.UndefOr[FargateProfile] = js.undefined
    ): DeleteFargateProfileResponse = {
      val __obj = js.Dynamic.literal()
      fargateProfile.foreach(__v => __obj.updateDynamic("fargateProfile")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteFargateProfileResponse]
    }
  }

  @js.native
  trait DeleteNodegroupRequest extends js.Object {
    var clusterName: String
    var nodegroupName: String
  }

  object DeleteNodegroupRequest {
    @inline
    def apply(
        clusterName: String,
        nodegroupName: String
    ): DeleteNodegroupRequest = {
      val __obj = js.Dynamic.literal(
        "clusterName" -> clusterName.asInstanceOf[js.Any],
        "nodegroupName" -> nodegroupName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteNodegroupRequest]
    }
  }

  @js.native
  trait DeleteNodegroupResponse extends js.Object {
    var nodegroup: js.UndefOr[Nodegroup]
  }

  object DeleteNodegroupResponse {
    @inline
    def apply(
        nodegroup: js.UndefOr[Nodegroup] = js.undefined
    ): DeleteNodegroupResponse = {
      val __obj = js.Dynamic.literal()
      nodegroup.foreach(__v => __obj.updateDynamic("nodegroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteNodegroupResponse]
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
  trait DescribeFargateProfileRequest extends js.Object {
    var clusterName: String
    var fargateProfileName: String
  }

  object DescribeFargateProfileRequest {
    @inline
    def apply(
        clusterName: String,
        fargateProfileName: String
    ): DescribeFargateProfileRequest = {
      val __obj = js.Dynamic.literal(
        "clusterName" -> clusterName.asInstanceOf[js.Any],
        "fargateProfileName" -> fargateProfileName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeFargateProfileRequest]
    }
  }

  @js.native
  trait DescribeFargateProfileResponse extends js.Object {
    var fargateProfile: js.UndefOr[FargateProfile]
  }

  object DescribeFargateProfileResponse {
    @inline
    def apply(
        fargateProfile: js.UndefOr[FargateProfile] = js.undefined
    ): DescribeFargateProfileResponse = {
      val __obj = js.Dynamic.literal()
      fargateProfile.foreach(__v => __obj.updateDynamic("fargateProfile")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeFargateProfileResponse]
    }
  }

  @js.native
  trait DescribeNodegroupRequest extends js.Object {
    var clusterName: String
    var nodegroupName: String
  }

  object DescribeNodegroupRequest {
    @inline
    def apply(
        clusterName: String,
        nodegroupName: String
    ): DescribeNodegroupRequest = {
      val __obj = js.Dynamic.literal(
        "clusterName" -> clusterName.asInstanceOf[js.Any],
        "nodegroupName" -> nodegroupName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeNodegroupRequest]
    }
  }

  @js.native
  trait DescribeNodegroupResponse extends js.Object {
    var nodegroup: js.UndefOr[Nodegroup]
  }

  object DescribeNodegroupResponse {
    @inline
    def apply(
        nodegroup: js.UndefOr[Nodegroup] = js.undefined
    ): DescribeNodegroupResponse = {
      val __obj = js.Dynamic.literal()
      nodegroup.foreach(__v => __obj.updateDynamic("nodegroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeNodegroupResponse]
    }
  }

  @js.native
  trait DescribeUpdateRequest extends js.Object {
    var name: String
    var updateId: String
    var nodegroupName: js.UndefOr[String]
  }

  object DescribeUpdateRequest {
    @inline
    def apply(
        name: String,
        updateId: String,
        nodegroupName: js.UndefOr[String] = js.undefined
    ): DescribeUpdateRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "updateId" -> updateId.asInstanceOf[js.Any]
      )

      nodegroupName.foreach(__v => __obj.updateDynamic("nodegroupName")(__v.asInstanceOf[js.Any]))
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

  /**
    * The encryption configuration for the cluster.
    */
  @js.native
  trait EncryptionConfig extends js.Object {
    var provider: js.UndefOr[Provider]
    var resources: js.UndefOr[StringList]
  }

  object EncryptionConfig {
    @inline
    def apply(
        provider: js.UndefOr[Provider] = js.undefined,
        resources: js.UndefOr[StringList] = js.undefined
    ): EncryptionConfig = {
      val __obj = js.Dynamic.literal()
      provider.foreach(__v => __obj.updateDynamic("provider")(__v.asInstanceOf[js.Any]))
      resources.foreach(__v => __obj.updateDynamic("resources")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EncryptionConfig]
    }
  }

  @js.native
  sealed trait ErrorCode extends js.Any
  object ErrorCode {
    @inline def SubnetNotFound = "SubnetNotFound".asInstanceOf[ErrorCode]
    @inline def SecurityGroupNotFound = "SecurityGroupNotFound".asInstanceOf[ErrorCode]
    @inline def EniLimitReached = "EniLimitReached".asInstanceOf[ErrorCode]
    @inline def IpNotAvailable = "IpNotAvailable".asInstanceOf[ErrorCode]
    @inline def AccessDenied = "AccessDenied".asInstanceOf[ErrorCode]
    @inline def OperationNotPermitted = "OperationNotPermitted".asInstanceOf[ErrorCode]
    @inline def VpcIdNotFound = "VpcIdNotFound".asInstanceOf[ErrorCode]
    @inline def Unknown = "Unknown".asInstanceOf[ErrorCode]
    @inline def NodeCreationFailure = "NodeCreationFailure".asInstanceOf[ErrorCode]
    @inline def PodEvictionFailure = "PodEvictionFailure".asInstanceOf[ErrorCode]
    @inline def InsufficientFreeAddresses = "InsufficientFreeAddresses".asInstanceOf[ErrorCode]

    @inline def values =
      js.Object.freeze(js.Array(
        SubnetNotFound,
        SecurityGroupNotFound,
        EniLimitReached,
        IpNotAvailable,
        AccessDenied,
        OperationNotPermitted,
        VpcIdNotFound,
        Unknown,
        NodeCreationFailure,
        PodEvictionFailure,
        InsufficientFreeAddresses
      ))
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
    * An object representing an AWS Fargate profile.
    */
  @js.native
  trait FargateProfile extends js.Object {
    var clusterName: js.UndefOr[String]
    var createdAt: js.UndefOr[Timestamp]
    var fargateProfileArn: js.UndefOr[String]
    var fargateProfileName: js.UndefOr[String]
    var podExecutionRoleArn: js.UndefOr[String]
    var selectors: js.UndefOr[FargateProfileSelectors]
    var status: js.UndefOr[FargateProfileStatus]
    var subnets: js.UndefOr[StringList]
    var tags: js.UndefOr[TagMap]
  }

  object FargateProfile {
    @inline
    def apply(
        clusterName: js.UndefOr[String] = js.undefined,
        createdAt: js.UndefOr[Timestamp] = js.undefined,
        fargateProfileArn: js.UndefOr[String] = js.undefined,
        fargateProfileName: js.UndefOr[String] = js.undefined,
        podExecutionRoleArn: js.UndefOr[String] = js.undefined,
        selectors: js.UndefOr[FargateProfileSelectors] = js.undefined,
        status: js.UndefOr[FargateProfileStatus] = js.undefined,
        subnets: js.UndefOr[StringList] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): FargateProfile = {
      val __obj = js.Dynamic.literal()
      clusterName.foreach(__v => __obj.updateDynamic("clusterName")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      fargateProfileArn.foreach(__v => __obj.updateDynamic("fargateProfileArn")(__v.asInstanceOf[js.Any]))
      fargateProfileName.foreach(__v => __obj.updateDynamic("fargateProfileName")(__v.asInstanceOf[js.Any]))
      podExecutionRoleArn.foreach(__v => __obj.updateDynamic("podExecutionRoleArn")(__v.asInstanceOf[js.Any]))
      selectors.foreach(__v => __obj.updateDynamic("selectors")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      subnets.foreach(__v => __obj.updateDynamic("subnets")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FargateProfile]
    }
  }

  /**
    * An object representing an AWS Fargate profile selector.
    */
  @js.native
  trait FargateProfileSelector extends js.Object {
    var labels: js.UndefOr[FargateProfileLabel]
    var namespace: js.UndefOr[String]
  }

  object FargateProfileSelector {
    @inline
    def apply(
        labels: js.UndefOr[FargateProfileLabel] = js.undefined,
        namespace: js.UndefOr[String] = js.undefined
    ): FargateProfileSelector = {
      val __obj = js.Dynamic.literal()
      labels.foreach(__v => __obj.updateDynamic("labels")(__v.asInstanceOf[js.Any]))
      namespace.foreach(__v => __obj.updateDynamic("namespace")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FargateProfileSelector]
    }
  }

  @js.native
  sealed trait FargateProfileStatus extends js.Any
  object FargateProfileStatus {
    @inline def CREATING = "CREATING".asInstanceOf[FargateProfileStatus]
    @inline def ACTIVE = "ACTIVE".asInstanceOf[FargateProfileStatus]
    @inline def DELETING = "DELETING".asInstanceOf[FargateProfileStatus]
    @inline def CREATE_FAILED = "CREATE_FAILED".asInstanceOf[FargateProfileStatus]
    @inline def DELETE_FAILED = "DELETE_FAILED".asInstanceOf[FargateProfileStatus]

    @inline def values = js.Object.freeze(js.Array(CREATING, ACTIVE, DELETING, CREATE_FAILED, DELETE_FAILED))
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

  /**
    * An object representing an issue with an Amazon EKS resource.
    */
  @js.native
  trait Issue extends js.Object {
    var code: js.UndefOr[NodegroupIssueCode]
    var message: js.UndefOr[String]
    var resourceIds: js.UndefOr[StringList]
  }

  object Issue {
    @inline
    def apply(
        code: js.UndefOr[NodegroupIssueCode] = js.undefined,
        message: js.UndefOr[String] = js.undefined,
        resourceIds: js.UndefOr[StringList] = js.undefined
    ): Issue = {
      val __obj = js.Dynamic.literal()
      code.foreach(__v => __obj.updateDynamic("code")(__v.asInstanceOf[js.Any]))
      message.foreach(__v => __obj.updateDynamic("message")(__v.asInstanceOf[js.Any]))
      resourceIds.foreach(__v => __obj.updateDynamic("resourceIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Issue]
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
  trait ListFargateProfilesRequest extends js.Object {
    var clusterName: String
    var maxResults: js.UndefOr[FargateProfilesRequestMaxResults]
    var nextToken: js.UndefOr[String]
  }

  object ListFargateProfilesRequest {
    @inline
    def apply(
        clusterName: String,
        maxResults: js.UndefOr[FargateProfilesRequestMaxResults] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListFargateProfilesRequest = {
      val __obj = js.Dynamic.literal(
        "clusterName" -> clusterName.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFargateProfilesRequest]
    }
  }

  @js.native
  trait ListFargateProfilesResponse extends js.Object {
    var fargateProfileNames: js.UndefOr[StringList]
    var nextToken: js.UndefOr[String]
  }

  object ListFargateProfilesResponse {
    @inline
    def apply(
        fargateProfileNames: js.UndefOr[StringList] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListFargateProfilesResponse = {
      val __obj = js.Dynamic.literal()
      fargateProfileNames.foreach(__v => __obj.updateDynamic("fargateProfileNames")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFargateProfilesResponse]
    }
  }

  @js.native
  trait ListNodegroupsRequest extends js.Object {
    var clusterName: String
    var maxResults: js.UndefOr[ListNodegroupsRequestMaxResults]
    var nextToken: js.UndefOr[String]
  }

  object ListNodegroupsRequest {
    @inline
    def apply(
        clusterName: String,
        maxResults: js.UndefOr[ListNodegroupsRequestMaxResults] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListNodegroupsRequest = {
      val __obj = js.Dynamic.literal(
        "clusterName" -> clusterName.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListNodegroupsRequest]
    }
  }

  @js.native
  trait ListNodegroupsResponse extends js.Object {
    var nextToken: js.UndefOr[String]
    var nodegroups: js.UndefOr[StringList]
  }

  object ListNodegroupsResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[String] = js.undefined,
        nodegroups: js.UndefOr[StringList] = js.undefined
    ): ListNodegroupsResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      nodegroups.foreach(__v => __obj.updateDynamic("nodegroups")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListNodegroupsResponse]
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
    var nodegroupName: js.UndefOr[String]
  }

  object ListUpdatesRequest {
    @inline
    def apply(
        name: String,
        maxResults: js.UndefOr[ListUpdatesRequestMaxResults] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined,
        nodegroupName: js.UndefOr[String] = js.undefined
    ): ListUpdatesRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      nodegroupName.foreach(__v => __obj.updateDynamic("nodegroupName")(__v.asInstanceOf[js.Any]))
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

  @js.native
  sealed trait LogType extends js.Any
  object LogType {
    @inline def api = "api".asInstanceOf[LogType]
    @inline def audit = "audit".asInstanceOf[LogType]
    @inline def authenticator = "authenticator".asInstanceOf[LogType]
    @inline def controllerManager = "controllerManager".asInstanceOf[LogType]
    @inline def scheduler = "scheduler".asInstanceOf[LogType]

    @inline def values = js.Object.freeze(js.Array(api, audit, authenticator, controllerManager, scheduler))
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
    * An object representing an Amazon EKS managed node group.
    */
  @js.native
  trait Nodegroup extends js.Object {
    var amiType: js.UndefOr[AMITypes]
    var clusterName: js.UndefOr[String]
    var createdAt: js.UndefOr[Timestamp]
    var diskSize: js.UndefOr[BoxedInteger]
    var health: js.UndefOr[NodegroupHealth]
    var instanceTypes: js.UndefOr[StringList]
    var labels: js.UndefOr[labelsMap]
    var modifiedAt: js.UndefOr[Timestamp]
    var nodeRole: js.UndefOr[String]
    var nodegroupArn: js.UndefOr[String]
    var nodegroupName: js.UndefOr[String]
    var releaseVersion: js.UndefOr[String]
    var remoteAccess: js.UndefOr[RemoteAccessConfig]
    var resources: js.UndefOr[NodegroupResources]
    var scalingConfig: js.UndefOr[NodegroupScalingConfig]
    var status: js.UndefOr[NodegroupStatus]
    var subnets: js.UndefOr[StringList]
    var tags: js.UndefOr[TagMap]
    var version: js.UndefOr[String]
  }

  object Nodegroup {
    @inline
    def apply(
        amiType: js.UndefOr[AMITypes] = js.undefined,
        clusterName: js.UndefOr[String] = js.undefined,
        createdAt: js.UndefOr[Timestamp] = js.undefined,
        diskSize: js.UndefOr[BoxedInteger] = js.undefined,
        health: js.UndefOr[NodegroupHealth] = js.undefined,
        instanceTypes: js.UndefOr[StringList] = js.undefined,
        labels: js.UndefOr[labelsMap] = js.undefined,
        modifiedAt: js.UndefOr[Timestamp] = js.undefined,
        nodeRole: js.UndefOr[String] = js.undefined,
        nodegroupArn: js.UndefOr[String] = js.undefined,
        nodegroupName: js.UndefOr[String] = js.undefined,
        releaseVersion: js.UndefOr[String] = js.undefined,
        remoteAccess: js.UndefOr[RemoteAccessConfig] = js.undefined,
        resources: js.UndefOr[NodegroupResources] = js.undefined,
        scalingConfig: js.UndefOr[NodegroupScalingConfig] = js.undefined,
        status: js.UndefOr[NodegroupStatus] = js.undefined,
        subnets: js.UndefOr[StringList] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined,
        version: js.UndefOr[String] = js.undefined
    ): Nodegroup = {
      val __obj = js.Dynamic.literal()
      amiType.foreach(__v => __obj.updateDynamic("amiType")(__v.asInstanceOf[js.Any]))
      clusterName.foreach(__v => __obj.updateDynamic("clusterName")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      diskSize.foreach(__v => __obj.updateDynamic("diskSize")(__v.asInstanceOf[js.Any]))
      health.foreach(__v => __obj.updateDynamic("health")(__v.asInstanceOf[js.Any]))
      instanceTypes.foreach(__v => __obj.updateDynamic("instanceTypes")(__v.asInstanceOf[js.Any]))
      labels.foreach(__v => __obj.updateDynamic("labels")(__v.asInstanceOf[js.Any]))
      modifiedAt.foreach(__v => __obj.updateDynamic("modifiedAt")(__v.asInstanceOf[js.Any]))
      nodeRole.foreach(__v => __obj.updateDynamic("nodeRole")(__v.asInstanceOf[js.Any]))
      nodegroupArn.foreach(__v => __obj.updateDynamic("nodegroupArn")(__v.asInstanceOf[js.Any]))
      nodegroupName.foreach(__v => __obj.updateDynamic("nodegroupName")(__v.asInstanceOf[js.Any]))
      releaseVersion.foreach(__v => __obj.updateDynamic("releaseVersion")(__v.asInstanceOf[js.Any]))
      remoteAccess.foreach(__v => __obj.updateDynamic("remoteAccess")(__v.asInstanceOf[js.Any]))
      resources.foreach(__v => __obj.updateDynamic("resources")(__v.asInstanceOf[js.Any]))
      scalingConfig.foreach(__v => __obj.updateDynamic("scalingConfig")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      subnets.foreach(__v => __obj.updateDynamic("subnets")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Nodegroup]
    }
  }

  /**
    * An object representing the health status of the node group.
    */
  @js.native
  trait NodegroupHealth extends js.Object {
    var issues: js.UndefOr[IssueList]
  }

  object NodegroupHealth {
    @inline
    def apply(
        issues: js.UndefOr[IssueList] = js.undefined
    ): NodegroupHealth = {
      val __obj = js.Dynamic.literal()
      issues.foreach(__v => __obj.updateDynamic("issues")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NodegroupHealth]
    }
  }

  @js.native
  sealed trait NodegroupIssueCode extends js.Any
  object NodegroupIssueCode {
    @inline def AutoScalingGroupNotFound = "AutoScalingGroupNotFound".asInstanceOf[NodegroupIssueCode]
    @inline def AutoScalingGroupInvalidConfiguration = "AutoScalingGroupInvalidConfiguration".asInstanceOf[NodegroupIssueCode]
    @inline def Ec2SecurityGroupNotFound = "Ec2SecurityGroupNotFound".asInstanceOf[NodegroupIssueCode]
    @inline def Ec2SecurityGroupDeletionFailure = "Ec2SecurityGroupDeletionFailure".asInstanceOf[NodegroupIssueCode]
    @inline def Ec2LaunchTemplateNotFound = "Ec2LaunchTemplateNotFound".asInstanceOf[NodegroupIssueCode]
    @inline def Ec2LaunchTemplateVersionMismatch = "Ec2LaunchTemplateVersionMismatch".asInstanceOf[NodegroupIssueCode]
    @inline def Ec2SubnetNotFound = "Ec2SubnetNotFound".asInstanceOf[NodegroupIssueCode]
    @inline def Ec2SubnetInvalidConfiguration = "Ec2SubnetInvalidConfiguration".asInstanceOf[NodegroupIssueCode]
    @inline def IamInstanceProfileNotFound = "IamInstanceProfileNotFound".asInstanceOf[NodegroupIssueCode]
    @inline def IamLimitExceeded = "IamLimitExceeded".asInstanceOf[NodegroupIssueCode]
    @inline def IamNodeRoleNotFound = "IamNodeRoleNotFound".asInstanceOf[NodegroupIssueCode]
    @inline def NodeCreationFailure = "NodeCreationFailure".asInstanceOf[NodegroupIssueCode]
    @inline def AsgInstanceLaunchFailures = "AsgInstanceLaunchFailures".asInstanceOf[NodegroupIssueCode]
    @inline def InstanceLimitExceeded = "InstanceLimitExceeded".asInstanceOf[NodegroupIssueCode]
    @inline def InsufficientFreeAddresses = "InsufficientFreeAddresses".asInstanceOf[NodegroupIssueCode]
    @inline def AccessDenied = "AccessDenied".asInstanceOf[NodegroupIssueCode]
    @inline def InternalFailure = "InternalFailure".asInstanceOf[NodegroupIssueCode]

    @inline def values =
      js.Object.freeze(js.Array(
        AutoScalingGroupNotFound,
        AutoScalingGroupInvalidConfiguration,
        Ec2SecurityGroupNotFound,
        Ec2SecurityGroupDeletionFailure,
        Ec2LaunchTemplateNotFound,
        Ec2LaunchTemplateVersionMismatch,
        Ec2SubnetNotFound,
        Ec2SubnetInvalidConfiguration,
        IamInstanceProfileNotFound,
        IamLimitExceeded,
        IamNodeRoleNotFound,
        NodeCreationFailure,
        AsgInstanceLaunchFailures,
        InstanceLimitExceeded,
        InsufficientFreeAddresses,
        AccessDenied,
        InternalFailure
      ))
  }

  /**
    * An object representing the resources associated with the node group, such as Auto Scaling groups and security groups for remote access.
    */
  @js.native
  trait NodegroupResources extends js.Object {
    var autoScalingGroups: js.UndefOr[AutoScalingGroupList]
    var remoteAccessSecurityGroup: js.UndefOr[String]
  }

  object NodegroupResources {
    @inline
    def apply(
        autoScalingGroups: js.UndefOr[AutoScalingGroupList] = js.undefined,
        remoteAccessSecurityGroup: js.UndefOr[String] = js.undefined
    ): NodegroupResources = {
      val __obj = js.Dynamic.literal()
      autoScalingGroups.foreach(__v => __obj.updateDynamic("autoScalingGroups")(__v.asInstanceOf[js.Any]))
      remoteAccessSecurityGroup.foreach(__v => __obj.updateDynamic("remoteAccessSecurityGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NodegroupResources]
    }
  }

  /**
    * An object representing the scaling configuration details for the Auto Scaling group that is associated with your node group.
    */
  @js.native
  trait NodegroupScalingConfig extends js.Object {
    var desiredSize: js.UndefOr[Capacity]
    var maxSize: js.UndefOr[Capacity]
    var minSize: js.UndefOr[Capacity]
  }

  object NodegroupScalingConfig {
    @inline
    def apply(
        desiredSize: js.UndefOr[Capacity] = js.undefined,
        maxSize: js.UndefOr[Capacity] = js.undefined,
        minSize: js.UndefOr[Capacity] = js.undefined
    ): NodegroupScalingConfig = {
      val __obj = js.Dynamic.literal()
      desiredSize.foreach(__v => __obj.updateDynamic("desiredSize")(__v.asInstanceOf[js.Any]))
      maxSize.foreach(__v => __obj.updateDynamic("maxSize")(__v.asInstanceOf[js.Any]))
      minSize.foreach(__v => __obj.updateDynamic("minSize")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NodegroupScalingConfig]
    }
  }

  @js.native
  sealed trait NodegroupStatus extends js.Any
  object NodegroupStatus {
    @inline def CREATING = "CREATING".asInstanceOf[NodegroupStatus]
    @inline def ACTIVE = "ACTIVE".asInstanceOf[NodegroupStatus]
    @inline def UPDATING = "UPDATING".asInstanceOf[NodegroupStatus]
    @inline def DELETING = "DELETING".asInstanceOf[NodegroupStatus]
    @inline def CREATE_FAILED = "CREATE_FAILED".asInstanceOf[NodegroupStatus]
    @inline def DELETE_FAILED = "DELETE_FAILED".asInstanceOf[NodegroupStatus]
    @inline def DEGRADED = "DEGRADED".asInstanceOf[NodegroupStatus]

    @inline def values = js.Object.freeze(js.Array(CREATING, ACTIVE, UPDATING, DELETING, CREATE_FAILED, DELETE_FAILED, DEGRADED))
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

  /**
    * Identifies the AWS Key Management Service (AWS KMS) customer master key (CMK) used to encrypt the secrets.
    */
  @js.native
  trait Provider extends js.Object {
    var keyArn: js.UndefOr[String]
  }

  object Provider {
    @inline
    def apply(
        keyArn: js.UndefOr[String] = js.undefined
    ): Provider = {
      val __obj = js.Dynamic.literal()
      keyArn.foreach(__v => __obj.updateDynamic("keyArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Provider]
    }
  }

  /**
    * An object representing the remote access configuration for the managed node group.
    */
  @js.native
  trait RemoteAccessConfig extends js.Object {
    var ec2SshKey: js.UndefOr[String]
    var sourceSecurityGroups: js.UndefOr[StringList]
  }

  object RemoteAccessConfig {
    @inline
    def apply(
        ec2SshKey: js.UndefOr[String] = js.undefined,
        sourceSecurityGroups: js.UndefOr[StringList] = js.undefined
    ): RemoteAccessConfig = {
      val __obj = js.Dynamic.literal()
      ec2SshKey.foreach(__v => __obj.updateDynamic("ec2SshKey")(__v.asInstanceOf[js.Any]))
      sourceSecurityGroups.foreach(__v => __obj.updateDynamic("sourceSecurityGroups")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RemoteAccessConfig]
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
        "tags" -> tags.asInstanceOf[js.Any]
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
        "tagKeys" -> tagKeys.asInstanceOf[js.Any]
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
        "name" -> name.asInstanceOf[js.Any],
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
    * An object representing a Kubernetes label change for a managed node group.
    */
  @js.native
  trait UpdateLabelsPayload extends js.Object {
    var addOrUpdateLabels: js.UndefOr[labelsMap]
    var removeLabels: js.UndefOr[labelsKeyList]
  }

  object UpdateLabelsPayload {
    @inline
    def apply(
        addOrUpdateLabels: js.UndefOr[labelsMap] = js.undefined,
        removeLabels: js.UndefOr[labelsKeyList] = js.undefined
    ): UpdateLabelsPayload = {
      val __obj = js.Dynamic.literal()
      addOrUpdateLabels.foreach(__v => __obj.updateDynamic("addOrUpdateLabels")(__v.asInstanceOf[js.Any]))
      removeLabels.foreach(__v => __obj.updateDynamic("removeLabels")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateLabelsPayload]
    }
  }

  @js.native
  trait UpdateNodegroupConfigRequest extends js.Object {
    var clusterName: String
    var nodegroupName: String
    var clientRequestToken: js.UndefOr[String]
    var labels: js.UndefOr[UpdateLabelsPayload]
    var scalingConfig: js.UndefOr[NodegroupScalingConfig]
  }

  object UpdateNodegroupConfigRequest {
    @inline
    def apply(
        clusterName: String,
        nodegroupName: String,
        clientRequestToken: js.UndefOr[String] = js.undefined,
        labels: js.UndefOr[UpdateLabelsPayload] = js.undefined,
        scalingConfig: js.UndefOr[NodegroupScalingConfig] = js.undefined
    ): UpdateNodegroupConfigRequest = {
      val __obj = js.Dynamic.literal(
        "clusterName" -> clusterName.asInstanceOf[js.Any],
        "nodegroupName" -> nodegroupName.asInstanceOf[js.Any]
      )

      clientRequestToken.foreach(__v => __obj.updateDynamic("clientRequestToken")(__v.asInstanceOf[js.Any]))
      labels.foreach(__v => __obj.updateDynamic("labels")(__v.asInstanceOf[js.Any]))
      scalingConfig.foreach(__v => __obj.updateDynamic("scalingConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateNodegroupConfigRequest]
    }
  }

  @js.native
  trait UpdateNodegroupConfigResponse extends js.Object {
    var update: js.UndefOr[Update]
  }

  object UpdateNodegroupConfigResponse {
    @inline
    def apply(
        update: js.UndefOr[Update] = js.undefined
    ): UpdateNodegroupConfigResponse = {
      val __obj = js.Dynamic.literal()
      update.foreach(__v => __obj.updateDynamic("update")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateNodegroupConfigResponse]
    }
  }

  @js.native
  trait UpdateNodegroupVersionRequest extends js.Object {
    var clusterName: String
    var nodegroupName: String
    var clientRequestToken: js.UndefOr[String]
    var force: js.UndefOr[Boolean]
    var releaseVersion: js.UndefOr[String]
    var version: js.UndefOr[String]
  }

  object UpdateNodegroupVersionRequest {
    @inline
    def apply(
        clusterName: String,
        nodegroupName: String,
        clientRequestToken: js.UndefOr[String] = js.undefined,
        force: js.UndefOr[Boolean] = js.undefined,
        releaseVersion: js.UndefOr[String] = js.undefined,
        version: js.UndefOr[String] = js.undefined
    ): UpdateNodegroupVersionRequest = {
      val __obj = js.Dynamic.literal(
        "clusterName" -> clusterName.asInstanceOf[js.Any],
        "nodegroupName" -> nodegroupName.asInstanceOf[js.Any]
      )

      clientRequestToken.foreach(__v => __obj.updateDynamic("clientRequestToken")(__v.asInstanceOf[js.Any]))
      force.foreach(__v => __obj.updateDynamic("force")(__v.asInstanceOf[js.Any]))
      releaseVersion.foreach(__v => __obj.updateDynamic("releaseVersion")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateNodegroupVersionRequest]
    }
  }

  @js.native
  trait UpdateNodegroupVersionResponse extends js.Object {
    var update: js.UndefOr[Update]
  }

  object UpdateNodegroupVersionResponse {
    @inline
    def apply(
        update: js.UndefOr[Update] = js.undefined
    ): UpdateNodegroupVersionResponse = {
      val __obj = js.Dynamic.literal()
      update.foreach(__v => __obj.updateDynamic("update")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateNodegroupVersionResponse]
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

  @js.native
  sealed trait UpdateParamType extends js.Any
  object UpdateParamType {
    @inline def Version = "Version".asInstanceOf[UpdateParamType]
    @inline def PlatformVersion = "PlatformVersion".asInstanceOf[UpdateParamType]
    @inline def EndpointPrivateAccess = "EndpointPrivateAccess".asInstanceOf[UpdateParamType]
    @inline def EndpointPublicAccess = "EndpointPublicAccess".asInstanceOf[UpdateParamType]
    @inline def ClusterLogging = "ClusterLogging".asInstanceOf[UpdateParamType]
    @inline def DesiredSize = "DesiredSize".asInstanceOf[UpdateParamType]
    @inline def LabelsToAdd = "LabelsToAdd".asInstanceOf[UpdateParamType]
    @inline def LabelsToRemove = "LabelsToRemove".asInstanceOf[UpdateParamType]
    @inline def MaxSize = "MaxSize".asInstanceOf[UpdateParamType]
    @inline def MinSize = "MinSize".asInstanceOf[UpdateParamType]
    @inline def ReleaseVersion = "ReleaseVersion".asInstanceOf[UpdateParamType]
    @inline def PublicAccessCidrs = "PublicAccessCidrs".asInstanceOf[UpdateParamType]

    @inline def values =
      js.Object.freeze(js.Array(
        Version,
        PlatformVersion,
        EndpointPrivateAccess,
        EndpointPublicAccess,
        ClusterLogging,
        DesiredSize,
        LabelsToAdd,
        LabelsToRemove,
        MaxSize,
        MinSize,
        ReleaseVersion,
        PublicAccessCidrs
      ))
  }

  @js.native
  sealed trait UpdateStatus extends js.Any
  object UpdateStatus {
    @inline def InProgress = "InProgress".asInstanceOf[UpdateStatus]
    @inline def Failed = "Failed".asInstanceOf[UpdateStatus]
    @inline def Cancelled = "Cancelled".asInstanceOf[UpdateStatus]
    @inline def Successful = "Successful".asInstanceOf[UpdateStatus]

    @inline def values = js.Object.freeze(js.Array(InProgress, Failed, Cancelled, Successful))
  }

  @js.native
  sealed trait UpdateType extends js.Any
  object UpdateType {
    @inline def VersionUpdate = "VersionUpdate".asInstanceOf[UpdateType]
    @inline def EndpointAccessUpdate = "EndpointAccessUpdate".asInstanceOf[UpdateType]
    @inline def LoggingUpdate = "LoggingUpdate".asInstanceOf[UpdateType]
    @inline def ConfigUpdate = "ConfigUpdate".asInstanceOf[UpdateType]

    @inline def values = js.Object.freeze(js.Array(VersionUpdate, EndpointAccessUpdate, LoggingUpdate, ConfigUpdate))
  }

  /**
    * An object representing the VPC configuration to use for an Amazon EKS cluster.
    */
  @js.native
  trait VpcConfigRequest extends js.Object {
    var endpointPrivateAccess: js.UndefOr[BoxedBoolean]
    var endpointPublicAccess: js.UndefOr[BoxedBoolean]
    var publicAccessCidrs: js.UndefOr[StringList]
    var securityGroupIds: js.UndefOr[StringList]
    var subnetIds: js.UndefOr[StringList]
  }

  object VpcConfigRequest {
    @inline
    def apply(
        endpointPrivateAccess: js.UndefOr[BoxedBoolean] = js.undefined,
        endpointPublicAccess: js.UndefOr[BoxedBoolean] = js.undefined,
        publicAccessCidrs: js.UndefOr[StringList] = js.undefined,
        securityGroupIds: js.UndefOr[StringList] = js.undefined,
        subnetIds: js.UndefOr[StringList] = js.undefined
    ): VpcConfigRequest = {
      val __obj = js.Dynamic.literal()
      endpointPrivateAccess.foreach(__v => __obj.updateDynamic("endpointPrivateAccess")(__v.asInstanceOf[js.Any]))
      endpointPublicAccess.foreach(__v => __obj.updateDynamic("endpointPublicAccess")(__v.asInstanceOf[js.Any]))
      publicAccessCidrs.foreach(__v => __obj.updateDynamic("publicAccessCidrs")(__v.asInstanceOf[js.Any]))
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
    var clusterSecurityGroupId: js.UndefOr[String]
    var endpointPrivateAccess: js.UndefOr[Boolean]
    var endpointPublicAccess: js.UndefOr[Boolean]
    var publicAccessCidrs: js.UndefOr[StringList]
    var securityGroupIds: js.UndefOr[StringList]
    var subnetIds: js.UndefOr[StringList]
    var vpcId: js.UndefOr[String]
  }

  object VpcConfigResponse {
    @inline
    def apply(
        clusterSecurityGroupId: js.UndefOr[String] = js.undefined,
        endpointPrivateAccess: js.UndefOr[Boolean] = js.undefined,
        endpointPublicAccess: js.UndefOr[Boolean] = js.undefined,
        publicAccessCidrs: js.UndefOr[StringList] = js.undefined,
        securityGroupIds: js.UndefOr[StringList] = js.undefined,
        subnetIds: js.UndefOr[StringList] = js.undefined,
        vpcId: js.UndefOr[String] = js.undefined
    ): VpcConfigResponse = {
      val __obj = js.Dynamic.literal()
      clusterSecurityGroupId.foreach(__v => __obj.updateDynamic("clusterSecurityGroupId")(__v.asInstanceOf[js.Any]))
      endpointPrivateAccess.foreach(__v => __obj.updateDynamic("endpointPrivateAccess")(__v.asInstanceOf[js.Any]))
      endpointPublicAccess.foreach(__v => __obj.updateDynamic("endpointPublicAccess")(__v.asInstanceOf[js.Any]))
      publicAccessCidrs.foreach(__v => __obj.updateDynamic("publicAccessCidrs")(__v.asInstanceOf[js.Any]))
      securityGroupIds.foreach(__v => __obj.updateDynamic("securityGroupIds")(__v.asInstanceOf[js.Any]))
      subnetIds.foreach(__v => __obj.updateDynamic("subnetIds")(__v.asInstanceOf[js.Any]))
      vpcId.foreach(__v => __obj.updateDynamic("vpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VpcConfigResponse]
    }
  }
}
