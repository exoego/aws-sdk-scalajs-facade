package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object eks {
  type AutoScalingGroupList             = js.Array[AutoScalingGroup]
  type BoxedBoolean                     = Boolean
  type BoxedInteger                     = Int
  type Capacity                         = Int
  type ClusterName                      = String
  type ErrorDetails                     = js.Array[ErrorDetail]
  type FargateProfileLabel              = js.Dictionary[String]
  type FargateProfileSelectors          = js.Array[FargateProfileSelector]
  type FargateProfilesRequestMaxResults = Int
  type IssueList                        = js.Array[Issue]
  type ListClustersRequestMaxResults    = Int
  type ListNodegroupsRequestMaxResults  = Int
  type ListUpdatesRequestMaxResults     = Int
  type LogSetups                        = js.Array[LogSetup]
  type LogTypes                         = js.Array[LogType]
  type StringList                       = js.Array[String]
  type TagKey                           = String
  type TagKeyList                       = js.Array[TagKey]
  type TagMap                           = js.Dictionary[TagValue]
  type TagValue                         = String
  type Timestamp                        = js.Date
  type UpdateParams                     = js.Array[UpdateParam]
  type labelKey                         = String
  type labelValue                       = String
  type labelsKeyList                    = js.Array[String]
  type labelsMap                        = js.Dictionary[labelValue]

  implicit final class EKSOps(private val service: EKS) extends AnyVal {

    @inline def createClusterFuture(params: CreateClusterRequest): Future[CreateClusterResponse] =
      service.createCluster(params).promise().toFuture
    @inline def createFargateProfileFuture(params: CreateFargateProfileRequest): Future[CreateFargateProfileResponse] =
      service.createFargateProfile(params).promise().toFuture
    @inline def createNodegroupFuture(params: CreateNodegroupRequest): Future[CreateNodegroupResponse] =
      service.createNodegroup(params).promise().toFuture
    @inline def deleteClusterFuture(params: DeleteClusterRequest): Future[DeleteClusterResponse] =
      service.deleteCluster(params).promise().toFuture
    @inline def deleteFargateProfileFuture(params: DeleteFargateProfileRequest): Future[DeleteFargateProfileResponse] =
      service.deleteFargateProfile(params).promise().toFuture
    @inline def deleteNodegroupFuture(params: DeleteNodegroupRequest): Future[DeleteNodegroupResponse] =
      service.deleteNodegroup(params).promise().toFuture
    @inline def describeClusterFuture(params: DescribeClusterRequest): Future[DescribeClusterResponse] =
      service.describeCluster(params).promise().toFuture
    @inline def describeFargateProfileFuture(
        params: DescribeFargateProfileRequest
    ): Future[DescribeFargateProfileResponse] = service.describeFargateProfile(params).promise().toFuture
    @inline def describeNodegroupFuture(params: DescribeNodegroupRequest): Future[DescribeNodegroupResponse] =
      service.describeNodegroup(params).promise().toFuture
    @inline def describeUpdateFuture(params: DescribeUpdateRequest): Future[DescribeUpdateResponse] =
      service.describeUpdate(params).promise().toFuture
    @inline def listClustersFuture(params: ListClustersRequest): Future[ListClustersResponse] =
      service.listClusters(params).promise().toFuture
    @inline def listFargateProfilesFuture(params: ListFargateProfilesRequest): Future[ListFargateProfilesResponse] =
      service.listFargateProfiles(params).promise().toFuture
    @inline def listNodegroupsFuture(params: ListNodegroupsRequest): Future[ListNodegroupsResponse] =
      service.listNodegroups(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise().toFuture
    @inline def listUpdatesFuture(params: ListUpdatesRequest): Future[ListUpdatesResponse] =
      service.listUpdates(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise().toFuture
    @inline def updateClusterConfigFuture(params: UpdateClusterConfigRequest): Future[UpdateClusterConfigResponse] =
      service.updateClusterConfig(params).promise().toFuture
    @inline def updateClusterVersionFuture(params: UpdateClusterVersionRequest): Future[UpdateClusterVersionResponse] =
      service.updateClusterVersion(params).promise().toFuture
    @inline def updateNodegroupConfigFuture(
        params: UpdateNodegroupConfigRequest
    ): Future[UpdateNodegroupConfigResponse] = service.updateNodegroupConfig(params).promise().toFuture
    @inline def updateNodegroupVersionFuture(
        params: UpdateNodegroupVersionRequest
    ): Future[UpdateNodegroupVersionResponse] = service.updateNodegroupVersion(params).promise().toFuture
  }
}

package eks {
  @js.native
  @JSImport("aws-sdk", "EKS")
  class EKS() extends js.Object {
    def this(config: AWSConfig) = this()

    def createCluster(params: CreateClusterRequest): Request[CreateClusterResponse]                      = js.native
    def createFargateProfile(params: CreateFargateProfileRequest): Request[CreateFargateProfileResponse] = js.native
    def createNodegroup(params: CreateNodegroupRequest): Request[CreateNodegroupResponse]                = js.native
    def deleteCluster(params: DeleteClusterRequest): Request[DeleteClusterResponse]                      = js.native
    def deleteFargateProfile(params: DeleteFargateProfileRequest): Request[DeleteFargateProfileResponse] = js.native
    def deleteNodegroup(params: DeleteNodegroupRequest): Request[DeleteNodegroupResponse]                = js.native
    def describeCluster(params: DescribeClusterRequest): Request[DescribeClusterResponse]                = js.native
    def describeFargateProfile(params: DescribeFargateProfileRequest): Request[DescribeFargateProfileResponse] =
      js.native
    def describeNodegroup(params: DescribeNodegroupRequest): Request[DescribeNodegroupResponse]             = js.native
    def describeUpdate(params: DescribeUpdateRequest): Request[DescribeUpdateResponse]                      = js.native
    def listClusters(params: ListClustersRequest): Request[ListClustersResponse]                            = js.native
    def listFargateProfiles(params: ListFargateProfilesRequest): Request[ListFargateProfilesResponse]       = js.native
    def listNodegroups(params: ListNodegroupsRequest): Request[ListNodegroupsResponse]                      = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse]       = js.native
    def listUpdates(params: ListUpdatesRequest): Request[ListUpdatesResponse]                               = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse]                               = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse]                         = js.native
    def updateClusterConfig(params: UpdateClusterConfigRequest): Request[UpdateClusterConfigResponse]       = js.native
    def updateClusterVersion(params: UpdateClusterVersionRequest): Request[UpdateClusterVersionResponse]    = js.native
    def updateNodegroupConfig(params: UpdateNodegroupConfigRequest): Request[UpdateNodegroupConfigResponse] = js.native
    def updateNodegroupVersion(params: UpdateNodegroupVersionRequest): Request[UpdateNodegroupVersionResponse] =
      js.native
  }

  @js.native
  sealed trait AMITypes extends js.Any
  object AMITypes extends js.Object {
    val AL2_x86_64     = "AL2_x86_64".asInstanceOf[AMITypes]
    val AL2_x86_64_GPU = "AL2_x86_64_GPU".asInstanceOf[AMITypes]

    val values = js.Object.freeze(js.Array(AL2_x86_64, AL2_x86_64_GPU))
  }

  /**
    * An Auto Scaling group that is associated with an Amazon EKS managed node group.
    */
  @js.native
  @Factory
  trait AutoScalingGroup extends js.Object {
    var name: js.UndefOr[String]
  }

  /**
    * An object representing the <code>certificate-authority-data</code> for your cluster.
    */
  @js.native
  @Factory
  trait Certificate extends js.Object {
    var data: js.UndefOr[String]
  }

  /**
    * An object representing an Amazon EKS cluster.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait ClusterStatus extends js.Any
  object ClusterStatus extends js.Object {
    val CREATING = "CREATING".asInstanceOf[ClusterStatus]
    val ACTIVE   = "ACTIVE".asInstanceOf[ClusterStatus]
    val DELETING = "DELETING".asInstanceOf[ClusterStatus]
    val FAILED   = "FAILED".asInstanceOf[ClusterStatus]
    val UPDATING = "UPDATING".asInstanceOf[ClusterStatus]

    val values = js.Object.freeze(js.Array(CREATING, ACTIVE, DELETING, FAILED, UPDATING))
  }

  @js.native
  @Factory
  trait CreateClusterRequest extends js.Object {
    var name: ClusterName
    var resourcesVpcConfig: VpcConfigRequest
    var roleArn: String
    var clientRequestToken: js.UndefOr[String]
    var logging: js.UndefOr[Logging]
    var tags: js.UndefOr[TagMap]
    var version: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait CreateClusterResponse extends js.Object {
    var cluster: js.UndefOr[Cluster]
  }

  @js.native
  @Factory
  trait CreateFargateProfileRequest extends js.Object {
    var clusterName: String
    var fargateProfileName: String
    var podExecutionRoleArn: String
    var clientRequestToken: js.UndefOr[String]
    var selectors: js.UndefOr[FargateProfileSelectors]
    var subnets: js.UndefOr[StringList]
    var tags: js.UndefOr[TagMap]
  }

  @js.native
  @Factory
  trait CreateFargateProfileResponse extends js.Object {
    var fargateProfile: js.UndefOr[FargateProfile]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait CreateNodegroupResponse extends js.Object {
    var nodegroup: js.UndefOr[Nodegroup]
  }

  @js.native
  @Factory
  trait DeleteClusterRequest extends js.Object {
    var name: String
  }

  @js.native
  @Factory
  trait DeleteClusterResponse extends js.Object {
    var cluster: js.UndefOr[Cluster]
  }

  @js.native
  @Factory
  trait DeleteFargateProfileRequest extends js.Object {
    var clusterName: String
    var fargateProfileName: String
  }

  @js.native
  @Factory
  trait DeleteFargateProfileResponse extends js.Object {
    var fargateProfile: js.UndefOr[FargateProfile]
  }

  @js.native
  @Factory
  trait DeleteNodegroupRequest extends js.Object {
    var clusterName: String
    var nodegroupName: String
  }

  @js.native
  @Factory
  trait DeleteNodegroupResponse extends js.Object {
    var nodegroup: js.UndefOr[Nodegroup]
  }

  @js.native
  @Factory
  trait DescribeClusterRequest extends js.Object {
    var name: String
  }

  @js.native
  @Factory
  trait DescribeClusterResponse extends js.Object {
    var cluster: js.UndefOr[Cluster]
  }

  @js.native
  @Factory
  trait DescribeFargateProfileRequest extends js.Object {
    var clusterName: String
    var fargateProfileName: String
  }

  @js.native
  @Factory
  trait DescribeFargateProfileResponse extends js.Object {
    var fargateProfile: js.UndefOr[FargateProfile]
  }

  @js.native
  @Factory
  trait DescribeNodegroupRequest extends js.Object {
    var clusterName: String
    var nodegroupName: String
  }

  @js.native
  @Factory
  trait DescribeNodegroupResponse extends js.Object {
    var nodegroup: js.UndefOr[Nodegroup]
  }

  @js.native
  @Factory
  trait DescribeUpdateRequest extends js.Object {
    var name: String
    var updateId: String
    var nodegroupName: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeUpdateResponse extends js.Object {
    var update: js.UndefOr[Update]
  }

  @js.native
  sealed trait ErrorCode extends js.Any
  object ErrorCode extends js.Object {
    val SubnetNotFound            = "SubnetNotFound".asInstanceOf[ErrorCode]
    val SecurityGroupNotFound     = "SecurityGroupNotFound".asInstanceOf[ErrorCode]
    val EniLimitReached           = "EniLimitReached".asInstanceOf[ErrorCode]
    val IpNotAvailable            = "IpNotAvailable".asInstanceOf[ErrorCode]
    val AccessDenied              = "AccessDenied".asInstanceOf[ErrorCode]
    val OperationNotPermitted     = "OperationNotPermitted".asInstanceOf[ErrorCode]
    val VpcIdNotFound             = "VpcIdNotFound".asInstanceOf[ErrorCode]
    val Unknown                   = "Unknown".asInstanceOf[ErrorCode]
    val NodeCreationFailure       = "NodeCreationFailure".asInstanceOf[ErrorCode]
    val PodEvictionFailure        = "PodEvictionFailure".asInstanceOf[ErrorCode]
    val InsufficientFreeAddresses = "InsufficientFreeAddresses".asInstanceOf[ErrorCode]

    val values = js.Object.freeze(
      js.Array(
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
      )
    )
  }

  /**
    * An object representing an error when an asynchronous operation fails.
    */
  @js.native
  @Factory
  trait ErrorDetail extends js.Object {
    var errorCode: js.UndefOr[ErrorCode]
    var errorMessage: js.UndefOr[String]
    var resourceIds: js.UndefOr[StringList]
  }

  /**
    * An object representing an AWS Fargate profile.
    */
  @js.native
  @Factory
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

  /**
    * An object representing an AWS Fargate profile selector.
    */
  @js.native
  @Factory
  trait FargateProfileSelector extends js.Object {
    var labels: js.UndefOr[FargateProfileLabel]
    var namespace: js.UndefOr[String]
  }

  @js.native
  sealed trait FargateProfileStatus extends js.Any
  object FargateProfileStatus extends js.Object {
    val CREATING      = "CREATING".asInstanceOf[FargateProfileStatus]
    val ACTIVE        = "ACTIVE".asInstanceOf[FargateProfileStatus]
    val DELETING      = "DELETING".asInstanceOf[FargateProfileStatus]
    val CREATE_FAILED = "CREATE_FAILED".asInstanceOf[FargateProfileStatus]
    val DELETE_FAILED = "DELETE_FAILED".asInstanceOf[FargateProfileStatus]

    val values = js.Object.freeze(js.Array(CREATING, ACTIVE, DELETING, CREATE_FAILED, DELETE_FAILED))
  }

  /**
    * An object representing an identity provider for authentication credentials.
    */
  @js.native
  @Factory
  trait Identity extends js.Object {
    var oidc: js.UndefOr[OIDC]
  }

  /**
    * An object representing an issue with an Amazon EKS resource.
    */
  @js.native
  @Factory
  trait Issue extends js.Object {
    var code: js.UndefOr[NodegroupIssueCode]
    var message: js.UndefOr[String]
    var resourceIds: js.UndefOr[StringList]
  }

  @js.native
  @Factory
  trait ListClustersRequest extends js.Object {
    var maxResults: js.UndefOr[ListClustersRequestMaxResults]
    var nextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListClustersResponse extends js.Object {
    var clusters: js.UndefOr[StringList]
    var nextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListFargateProfilesRequest extends js.Object {
    var clusterName: String
    var maxResults: js.UndefOr[FargateProfilesRequestMaxResults]
    var nextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListFargateProfilesResponse extends js.Object {
    var fargateProfileNames: js.UndefOr[StringList]
    var nextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListNodegroupsRequest extends js.Object {
    var clusterName: String
    var maxResults: js.UndefOr[ListNodegroupsRequestMaxResults]
    var nextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListNodegroupsResponse extends js.Object {
    var nextToken: js.UndefOr[String]
    var nodegroups: js.UndefOr[StringList]
  }

  @js.native
  @Factory
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: String
  }

  @js.native
  @Factory
  trait ListTagsForResourceResponse extends js.Object {
    var tags: js.UndefOr[TagMap]
  }

  @js.native
  @Factory
  trait ListUpdatesRequest extends js.Object {
    var name: String
    var maxResults: js.UndefOr[ListUpdatesRequestMaxResults]
    var nextToken: js.UndefOr[String]
    var nodegroupName: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListUpdatesResponse extends js.Object {
    var nextToken: js.UndefOr[String]
    var updateIds: js.UndefOr[StringList]
  }

  /**
    * An object representing the enabled or disabled Kubernetes control plane logs for your cluster.
    */
  @js.native
  @Factory
  trait LogSetup extends js.Object {
    var enabled: js.UndefOr[BoxedBoolean]
    var types: js.UndefOr[LogTypes]
  }

  @js.native
  sealed trait LogType extends js.Any
  object LogType extends js.Object {
    val api               = "api".asInstanceOf[LogType]
    val audit             = "audit".asInstanceOf[LogType]
    val authenticator     = "authenticator".asInstanceOf[LogType]
    val controllerManager = "controllerManager".asInstanceOf[LogType]
    val scheduler         = "scheduler".asInstanceOf[LogType]

    val values = js.Object.freeze(js.Array(api, audit, authenticator, controllerManager, scheduler))
  }

  /**
    * An object representing the logging configuration for resources in your cluster.
    */
  @js.native
  @Factory
  trait Logging extends js.Object {
    var clusterLogging: js.UndefOr[LogSetups]
  }

  /**
    * An object representing an Amazon EKS managed node group.
    */
  @js.native
  @Factory
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

  /**
    * An object representing the health status of the node group.
    */
  @js.native
  @Factory
  trait NodegroupHealth extends js.Object {
    var issues: js.UndefOr[IssueList]
  }

  @js.native
  sealed trait NodegroupIssueCode extends js.Any
  object NodegroupIssueCode extends js.Object {
    val AutoScalingGroupNotFound             = "AutoScalingGroupNotFound".asInstanceOf[NodegroupIssueCode]
    val AutoScalingGroupInvalidConfiguration = "AutoScalingGroupInvalidConfiguration".asInstanceOf[NodegroupIssueCode]
    val Ec2SecurityGroupNotFound             = "Ec2SecurityGroupNotFound".asInstanceOf[NodegroupIssueCode]
    val Ec2SecurityGroupDeletionFailure      = "Ec2SecurityGroupDeletionFailure".asInstanceOf[NodegroupIssueCode]
    val Ec2LaunchTemplateNotFound            = "Ec2LaunchTemplateNotFound".asInstanceOf[NodegroupIssueCode]
    val Ec2LaunchTemplateVersionMismatch     = "Ec2LaunchTemplateVersionMismatch".asInstanceOf[NodegroupIssueCode]
    val Ec2SubnetNotFound                    = "Ec2SubnetNotFound".asInstanceOf[NodegroupIssueCode]
    val IamInstanceProfileNotFound           = "IamInstanceProfileNotFound".asInstanceOf[NodegroupIssueCode]
    val IamNodeRoleNotFound                  = "IamNodeRoleNotFound".asInstanceOf[NodegroupIssueCode]
    val AsgInstanceLaunchFailures            = "AsgInstanceLaunchFailures".asInstanceOf[NodegroupIssueCode]
    val InstanceLimitExceeded                = "InstanceLimitExceeded".asInstanceOf[NodegroupIssueCode]
    val InsufficientFreeAddresses            = "InsufficientFreeAddresses".asInstanceOf[NodegroupIssueCode]
    val AccessDenied                         = "AccessDenied".asInstanceOf[NodegroupIssueCode]
    val InternalFailure                      = "InternalFailure".asInstanceOf[NodegroupIssueCode]

    val values = js.Object.freeze(
      js.Array(
        AutoScalingGroupNotFound,
        AutoScalingGroupInvalidConfiguration,
        Ec2SecurityGroupNotFound,
        Ec2SecurityGroupDeletionFailure,
        Ec2LaunchTemplateNotFound,
        Ec2LaunchTemplateVersionMismatch,
        Ec2SubnetNotFound,
        IamInstanceProfileNotFound,
        IamNodeRoleNotFound,
        AsgInstanceLaunchFailures,
        InstanceLimitExceeded,
        InsufficientFreeAddresses,
        AccessDenied,
        InternalFailure
      )
    )
  }

  /**
    * An object representing the resources associated with the node group, such as Auto Scaling groups and security groups for remote access.
    */
  @js.native
  @Factory
  trait NodegroupResources extends js.Object {
    var autoScalingGroups: js.UndefOr[AutoScalingGroupList]
    var remoteAccessSecurityGroup: js.UndefOr[String]
  }

  /**
    * An object representing the scaling configuration details for the Auto Scaling group that is associated with your node group.
    */
  @js.native
  @Factory
  trait NodegroupScalingConfig extends js.Object {
    var desiredSize: js.UndefOr[Capacity]
    var maxSize: js.UndefOr[Capacity]
    var minSize: js.UndefOr[Capacity]
  }

  @js.native
  sealed trait NodegroupStatus extends js.Any
  object NodegroupStatus extends js.Object {
    val CREATING      = "CREATING".asInstanceOf[NodegroupStatus]
    val ACTIVE        = "ACTIVE".asInstanceOf[NodegroupStatus]
    val UPDATING      = "UPDATING".asInstanceOf[NodegroupStatus]
    val DELETING      = "DELETING".asInstanceOf[NodegroupStatus]
    val CREATE_FAILED = "CREATE_FAILED".asInstanceOf[NodegroupStatus]
    val DELETE_FAILED = "DELETE_FAILED".asInstanceOf[NodegroupStatus]
    val DEGRADED      = "DEGRADED".asInstanceOf[NodegroupStatus]

    val values =
      js.Object.freeze(js.Array(CREATING, ACTIVE, UPDATING, DELETING, CREATE_FAILED, DELETE_FAILED, DEGRADED))
  }

  /**
    * An object representing the [[https://openid.net/connect/|OpenID Connect]] identity provider information for the cluster.
    */
  @js.native
  @Factory
  trait OIDC extends js.Object {
    var issuer: js.UndefOr[String]
  }

  /**
    * An object representing the remote access configuration for the managed node group.
    */
  @js.native
  @Factory
  trait RemoteAccessConfig extends js.Object {
    var ec2SshKey: js.UndefOr[String]
    var sourceSecurityGroups: js.UndefOr[StringList]
  }

  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var resourceArn: String
    var tags: TagMap
  }

  @js.native
  @Factory
  trait TagResourceResponse extends js.Object {}

  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var resourceArn: String
    var tagKeys: TagKeyList
  }

  @js.native
  @Factory
  trait UntagResourceResponse extends js.Object {}

  /**
    * An object representing an asynchronous update.
    */
  @js.native
  @Factory
  trait Update extends js.Object {
    var createdAt: js.UndefOr[Timestamp]
    var errors: js.UndefOr[ErrorDetails]
    var id: js.UndefOr[String]
    var params: js.UndefOr[UpdateParams]
    var status: js.UndefOr[UpdateStatus]
    var `type`: js.UndefOr[UpdateType]
  }

  @js.native
  @Factory
  trait UpdateClusterConfigRequest extends js.Object {
    var name: String
    var clientRequestToken: js.UndefOr[String]
    var logging: js.UndefOr[Logging]
    var resourcesVpcConfig: js.UndefOr[VpcConfigRequest]
  }

  @js.native
  @Factory
  trait UpdateClusterConfigResponse extends js.Object {
    var update: js.UndefOr[Update]
  }

  @js.native
  @Factory
  trait UpdateClusterVersionRequest extends js.Object {
    var name: String
    var version: String
    var clientRequestToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait UpdateClusterVersionResponse extends js.Object {
    var update: js.UndefOr[Update]
  }

  /**
    * An object representing a Kubernetes label change for a managed node group.
    */
  @js.native
  @Factory
  trait UpdateLabelsPayload extends js.Object {
    var addOrUpdateLabels: js.UndefOr[labelsMap]
    var removeLabels: js.UndefOr[labelsKeyList]
  }

  @js.native
  @Factory
  trait UpdateNodegroupConfigRequest extends js.Object {
    var clusterName: String
    var nodegroupName: String
    var clientRequestToken: js.UndefOr[String]
    var labels: js.UndefOr[UpdateLabelsPayload]
    var scalingConfig: js.UndefOr[NodegroupScalingConfig]
  }

  @js.native
  @Factory
  trait UpdateNodegroupConfigResponse extends js.Object {
    var update: js.UndefOr[Update]
  }

  @js.native
  @Factory
  trait UpdateNodegroupVersionRequest extends js.Object {
    var clusterName: String
    var nodegroupName: String
    var clientRequestToken: js.UndefOr[String]
    var force: js.UndefOr[Boolean]
    var releaseVersion: js.UndefOr[String]
    var version: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait UpdateNodegroupVersionResponse extends js.Object {
    var update: js.UndefOr[Update]
  }

  /**
    * An object representing the details of an update request.
    */
  @js.native
  @Factory
  trait UpdateParam extends js.Object {
    var `type`: js.UndefOr[UpdateParamType]
    var value: js.UndefOr[String]
  }

  @js.native
  sealed trait UpdateParamType extends js.Any
  object UpdateParamType extends js.Object {
    val Version               = "Version".asInstanceOf[UpdateParamType]
    val PlatformVersion       = "PlatformVersion".asInstanceOf[UpdateParamType]
    val EndpointPrivateAccess = "EndpointPrivateAccess".asInstanceOf[UpdateParamType]
    val EndpointPublicAccess  = "EndpointPublicAccess".asInstanceOf[UpdateParamType]
    val ClusterLogging        = "ClusterLogging".asInstanceOf[UpdateParamType]
    val DesiredSize           = "DesiredSize".asInstanceOf[UpdateParamType]
    val LabelsToAdd           = "LabelsToAdd".asInstanceOf[UpdateParamType]
    val LabelsToRemove        = "LabelsToRemove".asInstanceOf[UpdateParamType]
    val MaxSize               = "MaxSize".asInstanceOf[UpdateParamType]
    val MinSize               = "MinSize".asInstanceOf[UpdateParamType]
    val ReleaseVersion        = "ReleaseVersion".asInstanceOf[UpdateParamType]
    val PublicAccessCidrs     = "PublicAccessCidrs".asInstanceOf[UpdateParamType]

    val values = js.Object.freeze(
      js.Array(
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
      )
    )
  }

  @js.native
  sealed trait UpdateStatus extends js.Any
  object UpdateStatus extends js.Object {
    val InProgress = "InProgress".asInstanceOf[UpdateStatus]
    val Failed     = "Failed".asInstanceOf[UpdateStatus]
    val Cancelled  = "Cancelled".asInstanceOf[UpdateStatus]
    val Successful = "Successful".asInstanceOf[UpdateStatus]

    val values = js.Object.freeze(js.Array(InProgress, Failed, Cancelled, Successful))
  }

  @js.native
  sealed trait UpdateType extends js.Any
  object UpdateType extends js.Object {
    val VersionUpdate        = "VersionUpdate".asInstanceOf[UpdateType]
    val EndpointAccessUpdate = "EndpointAccessUpdate".asInstanceOf[UpdateType]
    val LoggingUpdate        = "LoggingUpdate".asInstanceOf[UpdateType]
    val ConfigUpdate         = "ConfigUpdate".asInstanceOf[UpdateType]

    val values = js.Object.freeze(js.Array(VersionUpdate, EndpointAccessUpdate, LoggingUpdate, ConfigUpdate))
  }

  /**
    * An object representing the VPC configuration to use for an Amazon EKS cluster.
    */
  @js.native
  @Factory
  trait VpcConfigRequest extends js.Object {
    var endpointPrivateAccess: js.UndefOr[BoxedBoolean]
    var endpointPublicAccess: js.UndefOr[BoxedBoolean]
    var publicAccessCidrs: js.UndefOr[StringList]
    var securityGroupIds: js.UndefOr[StringList]
    var subnetIds: js.UndefOr[StringList]
  }

  /**
    * An object representing an Amazon EKS cluster VPC configuration response.
    */
  @js.native
  @Factory
  trait VpcConfigResponse extends js.Object {
    var clusterSecurityGroupId: js.UndefOr[String]
    var endpointPrivateAccess: js.UndefOr[Boolean]
    var endpointPublicAccess: js.UndefOr[Boolean]
    var publicAccessCidrs: js.UndefOr[StringList]
    var securityGroupIds: js.UndefOr[StringList]
    var subnetIds: js.UndefOr[StringList]
    var vpcId: js.UndefOr[String]
  }
}
