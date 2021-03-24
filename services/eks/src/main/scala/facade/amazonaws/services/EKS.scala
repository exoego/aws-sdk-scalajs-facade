package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object eks {
  type AddonIssueList = js.Array[AddonIssue]
  type AddonVersionInfoList = js.Array[AddonVersionInfo]
  type Addons = js.Array[AddonInfo]
  type AutoScalingGroupList = js.Array[AutoScalingGroup]
  type BoxedBoolean = Boolean
  type BoxedInteger = Int
  type Capacity = Int
  type ClusterName = String
  type Compatibilities = js.Array[Compatibility]
  type DescribeAddonVersionsRequestMaxResults = Int
  type EncryptionConfigList = js.Array[EncryptionConfig]
  type ErrorDetails = js.Array[ErrorDetail]
  type FargateProfileLabel = js.Dictionary[String]
  type FargateProfileSelectors = js.Array[FargateProfileSelector]
  type FargateProfilesRequestMaxResults = Int
  type IdentityProviderConfigs = js.Array[IdentityProviderConfig]
  type IssueList = js.Array[Issue]
  type ListAddonsRequestMaxResults = Int
  type ListClustersRequestMaxResults = Int
  type ListIdentityProviderConfigsRequestMaxResults = Int
  type ListNodegroupsRequestMaxResults = Int
  type ListUpdatesRequestMaxResults = Int
  type LogSetups = js.Array[LogSetup]
  type LogTypes = js.Array[LogType]
  type RoleArn = String
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
  type requiredClaimsKey = String
  type requiredClaimsMap = js.Dictionary[requiredClaimsValue]
  type requiredClaimsValue = String

  implicit final class EKSOps(private val service: EKS) extends AnyVal {

    @inline def associateEncryptionConfigFuture(params: AssociateEncryptionConfigRequest): Future[AssociateEncryptionConfigResponse] = service.associateEncryptionConfig(params).promise().toFuture
    @inline def associateIdentityProviderConfigFuture(params: AssociateIdentityProviderConfigRequest): Future[AssociateIdentityProviderConfigResponse] = service.associateIdentityProviderConfig(params).promise().toFuture
    @inline def createAddonFuture(params: CreateAddonRequest): Future[CreateAddonResponse] = service.createAddon(params).promise().toFuture
    @inline def createClusterFuture(params: CreateClusterRequest): Future[CreateClusterResponse] = service.createCluster(params).promise().toFuture
    @inline def createFargateProfileFuture(params: CreateFargateProfileRequest): Future[CreateFargateProfileResponse] = service.createFargateProfile(params).promise().toFuture
    @inline def createNodegroupFuture(params: CreateNodegroupRequest): Future[CreateNodegroupResponse] = service.createNodegroup(params).promise().toFuture
    @inline def deleteAddonFuture(params: DeleteAddonRequest): Future[DeleteAddonResponse] = service.deleteAddon(params).promise().toFuture
    @inline def deleteClusterFuture(params: DeleteClusterRequest): Future[DeleteClusterResponse] = service.deleteCluster(params).promise().toFuture
    @inline def deleteFargateProfileFuture(params: DeleteFargateProfileRequest): Future[DeleteFargateProfileResponse] = service.deleteFargateProfile(params).promise().toFuture
    @inline def deleteNodegroupFuture(params: DeleteNodegroupRequest): Future[DeleteNodegroupResponse] = service.deleteNodegroup(params).promise().toFuture
    @inline def describeAddonFuture(params: DescribeAddonRequest): Future[DescribeAddonResponse] = service.describeAddon(params).promise().toFuture
    @inline def describeAddonVersionsFuture(params: DescribeAddonVersionsRequest): Future[DescribeAddonVersionsResponse] = service.describeAddonVersions(params).promise().toFuture
    @inline def describeClusterFuture(params: DescribeClusterRequest): Future[DescribeClusterResponse] = service.describeCluster(params).promise().toFuture
    @inline def describeFargateProfileFuture(params: DescribeFargateProfileRequest): Future[DescribeFargateProfileResponse] = service.describeFargateProfile(params).promise().toFuture
    @inline def describeIdentityProviderConfigFuture(params: DescribeIdentityProviderConfigRequest): Future[DescribeIdentityProviderConfigResponse] = service.describeIdentityProviderConfig(params).promise().toFuture
    @inline def describeNodegroupFuture(params: DescribeNodegroupRequest): Future[DescribeNodegroupResponse] = service.describeNodegroup(params).promise().toFuture
    @inline def describeUpdateFuture(params: DescribeUpdateRequest): Future[DescribeUpdateResponse] = service.describeUpdate(params).promise().toFuture
    @inline def disassociateIdentityProviderConfigFuture(params: DisassociateIdentityProviderConfigRequest): Future[DisassociateIdentityProviderConfigResponse] = service.disassociateIdentityProviderConfig(params).promise().toFuture
    @inline def listAddonsFuture(params: ListAddonsRequest): Future[ListAddonsResponse] = service.listAddons(params).promise().toFuture
    @inline def listClustersFuture(params: ListClustersRequest): Future[ListClustersResponse] = service.listClusters(params).promise().toFuture
    @inline def listFargateProfilesFuture(params: ListFargateProfilesRequest): Future[ListFargateProfilesResponse] = service.listFargateProfiles(params).promise().toFuture
    @inline def listIdentityProviderConfigsFuture(params: ListIdentityProviderConfigsRequest): Future[ListIdentityProviderConfigsResponse] = service.listIdentityProviderConfigs(params).promise().toFuture
    @inline def listNodegroupsFuture(params: ListNodegroupsRequest): Future[ListNodegroupsResponse] = service.listNodegroups(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def listUpdatesFuture(params: ListUpdatesRequest): Future[ListUpdatesResponse] = service.listUpdates(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateAddonFuture(params: UpdateAddonRequest): Future[UpdateAddonResponse] = service.updateAddon(params).promise().toFuture
    @inline def updateClusterConfigFuture(params: UpdateClusterConfigRequest): Future[UpdateClusterConfigResponse] = service.updateClusterConfig(params).promise().toFuture
    @inline def updateClusterVersionFuture(params: UpdateClusterVersionRequest): Future[UpdateClusterVersionResponse] = service.updateClusterVersion(params).promise().toFuture
    @inline def updateNodegroupConfigFuture(params: UpdateNodegroupConfigRequest): Future[UpdateNodegroupConfigResponse] = service.updateNodegroupConfig(params).promise().toFuture
    @inline def updateNodegroupVersionFuture(params: UpdateNodegroupVersionRequest): Future[UpdateNodegroupVersionResponse] = service.updateNodegroupVersion(params).promise().toFuture

  }
}

package eks {
  @js.native
  @JSImport("aws-sdk/clients/eks", JSImport.Namespace, "AWS.EKS")
  class EKS() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateEncryptionConfig(params: AssociateEncryptionConfigRequest): Request[AssociateEncryptionConfigResponse] = js.native
    def associateIdentityProviderConfig(params: AssociateIdentityProviderConfigRequest): Request[AssociateIdentityProviderConfigResponse] = js.native
    def createAddon(params: CreateAddonRequest): Request[CreateAddonResponse] = js.native
    def createCluster(params: CreateClusterRequest): Request[CreateClusterResponse] = js.native
    def createFargateProfile(params: CreateFargateProfileRequest): Request[CreateFargateProfileResponse] = js.native
    def createNodegroup(params: CreateNodegroupRequest): Request[CreateNodegroupResponse] = js.native
    def deleteAddon(params: DeleteAddonRequest): Request[DeleteAddonResponse] = js.native
    def deleteCluster(params: DeleteClusterRequest): Request[DeleteClusterResponse] = js.native
    def deleteFargateProfile(params: DeleteFargateProfileRequest): Request[DeleteFargateProfileResponse] = js.native
    def deleteNodegroup(params: DeleteNodegroupRequest): Request[DeleteNodegroupResponse] = js.native
    def describeAddon(params: DescribeAddonRequest): Request[DescribeAddonResponse] = js.native
    def describeAddonVersions(params: DescribeAddonVersionsRequest): Request[DescribeAddonVersionsResponse] = js.native
    def describeCluster(params: DescribeClusterRequest): Request[DescribeClusterResponse] = js.native
    def describeFargateProfile(params: DescribeFargateProfileRequest): Request[DescribeFargateProfileResponse] = js.native
    def describeIdentityProviderConfig(params: DescribeIdentityProviderConfigRequest): Request[DescribeIdentityProviderConfigResponse] = js.native
    def describeNodegroup(params: DescribeNodegroupRequest): Request[DescribeNodegroupResponse] = js.native
    def describeUpdate(params: DescribeUpdateRequest): Request[DescribeUpdateResponse] = js.native
    def disassociateIdentityProviderConfig(params: DisassociateIdentityProviderConfigRequest): Request[DisassociateIdentityProviderConfigResponse] = js.native
    def listAddons(params: ListAddonsRequest): Request[ListAddonsResponse] = js.native
    def listClusters(params: ListClustersRequest): Request[ListClustersResponse] = js.native
    def listFargateProfiles(params: ListFargateProfilesRequest): Request[ListFargateProfilesResponse] = js.native
    def listIdentityProviderConfigs(params: ListIdentityProviderConfigsRequest): Request[ListIdentityProviderConfigsResponse] = js.native
    def listNodegroups(params: ListNodegroupsRequest): Request[ListNodegroupsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def listUpdates(params: ListUpdatesRequest): Request[ListUpdatesResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateAddon(params: UpdateAddonRequest): Request[UpdateAddonResponse] = js.native
    def updateClusterConfig(params: UpdateClusterConfigRequest): Request[UpdateClusterConfigResponse] = js.native
    def updateClusterVersion(params: UpdateClusterVersionRequest): Request[UpdateClusterVersionResponse] = js.native
    def updateNodegroupConfig(params: UpdateNodegroupConfigRequest): Request[UpdateNodegroupConfigResponse] = js.native
    def updateNodegroupVersion(params: UpdateNodegroupVersionRequest): Request[UpdateNodegroupVersionResponse] = js.native
  }

  @js.native
  sealed trait AMITypes extends js.Any
  object AMITypes {
    val AL2_x86_64 = "AL2_x86_64".asInstanceOf[AMITypes]
    val AL2_x86_64_GPU = "AL2_x86_64_GPU".asInstanceOf[AMITypes]
    val AL2_ARM_64 = "AL2_ARM_64".asInstanceOf[AMITypes]

    @inline def values = js.Array(AL2_x86_64, AL2_x86_64_GPU, AL2_ARM_64)
  }

  /** An Amazon EKS add-on.
    */
  @js.native
  trait Addon extends js.Object {
    var addonArn: js.UndefOr[String]
    var addonName: js.UndefOr[String]
    var addonVersion: js.UndefOr[String]
    var clusterName: js.UndefOr[ClusterName]
    var createdAt: js.UndefOr[Timestamp]
    var health: js.UndefOr[AddonHealth]
    var modifiedAt: js.UndefOr[Timestamp]
    var serviceAccountRoleArn: js.UndefOr[String]
    var status: js.UndefOr[AddonStatus]
    var tags: js.UndefOr[TagMap]
  }

  object Addon {
    @inline
    def apply(
        addonArn: js.UndefOr[String] = js.undefined,
        addonName: js.UndefOr[String] = js.undefined,
        addonVersion: js.UndefOr[String] = js.undefined,
        clusterName: js.UndefOr[ClusterName] = js.undefined,
        createdAt: js.UndefOr[Timestamp] = js.undefined,
        health: js.UndefOr[AddonHealth] = js.undefined,
        modifiedAt: js.UndefOr[Timestamp] = js.undefined,
        serviceAccountRoleArn: js.UndefOr[String] = js.undefined,
        status: js.UndefOr[AddonStatus] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): Addon = {
      val __obj = js.Dynamic.literal()
      addonArn.foreach(__v => __obj.updateDynamic("addonArn")(__v.asInstanceOf[js.Any]))
      addonName.foreach(__v => __obj.updateDynamic("addonName")(__v.asInstanceOf[js.Any]))
      addonVersion.foreach(__v => __obj.updateDynamic("addonVersion")(__v.asInstanceOf[js.Any]))
      clusterName.foreach(__v => __obj.updateDynamic("clusterName")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      health.foreach(__v => __obj.updateDynamic("health")(__v.asInstanceOf[js.Any]))
      modifiedAt.foreach(__v => __obj.updateDynamic("modifiedAt")(__v.asInstanceOf[js.Any]))
      serviceAccountRoleArn.foreach(__v => __obj.updateDynamic("serviceAccountRoleArn")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Addon]
    }
  }

  /** The health of the add-on.
    */
  @js.native
  trait AddonHealth extends js.Object {
    var issues: js.UndefOr[AddonIssueList]
  }

  object AddonHealth {
    @inline
    def apply(
        issues: js.UndefOr[AddonIssueList] = js.undefined
    ): AddonHealth = {
      val __obj = js.Dynamic.literal()
      issues.foreach(__v => __obj.updateDynamic("issues")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AddonHealth]
    }
  }

  /** Information about an add-on.
    */
  @js.native
  trait AddonInfo extends js.Object {
    var addonName: js.UndefOr[String]
    var addonVersions: js.UndefOr[AddonVersionInfoList]
    var `type`: js.UndefOr[String]
  }

  object AddonInfo {
    @inline
    def apply(
        addonName: js.UndefOr[String] = js.undefined,
        addonVersions: js.UndefOr[AddonVersionInfoList] = js.undefined,
        `type`: js.UndefOr[String] = js.undefined
    ): AddonInfo = {
      val __obj = js.Dynamic.literal()
      addonName.foreach(__v => __obj.updateDynamic("addonName")(__v.asInstanceOf[js.Any]))
      addonVersions.foreach(__v => __obj.updateDynamic("addonVersions")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AddonInfo]
    }
  }

  /** An issue related to an add-on.
    */
  @js.native
  trait AddonIssue extends js.Object {
    var code: js.UndefOr[AddonIssueCode]
    var message: js.UndefOr[String]
    var resourceIds: js.UndefOr[StringList]
  }

  object AddonIssue {
    @inline
    def apply(
        code: js.UndefOr[AddonIssueCode] = js.undefined,
        message: js.UndefOr[String] = js.undefined,
        resourceIds: js.UndefOr[StringList] = js.undefined
    ): AddonIssue = {
      val __obj = js.Dynamic.literal()
      code.foreach(__v => __obj.updateDynamic("code")(__v.asInstanceOf[js.Any]))
      message.foreach(__v => __obj.updateDynamic("message")(__v.asInstanceOf[js.Any]))
      resourceIds.foreach(__v => __obj.updateDynamic("resourceIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AddonIssue]
    }
  }

  @js.native
  sealed trait AddonIssueCode extends js.Any
  object AddonIssueCode {
    val AccessDenied = "AccessDenied".asInstanceOf[AddonIssueCode]
    val InternalFailure = "InternalFailure".asInstanceOf[AddonIssueCode]
    val ClusterUnreachable = "ClusterUnreachable".asInstanceOf[AddonIssueCode]
    val InsufficientNumberOfReplicas = "InsufficientNumberOfReplicas".asInstanceOf[AddonIssueCode]
    val ConfigurationConflict = "ConfigurationConflict".asInstanceOf[AddonIssueCode]
    val AdmissionRequestDenied = "AdmissionRequestDenied".asInstanceOf[AddonIssueCode]

    @inline def values = js.Array(AccessDenied, InternalFailure, ClusterUnreachable, InsufficientNumberOfReplicas, ConfigurationConflict, AdmissionRequestDenied)
  }

  @js.native
  sealed trait AddonStatus extends js.Any
  object AddonStatus {
    val CREATING = "CREATING".asInstanceOf[AddonStatus]
    val ACTIVE = "ACTIVE".asInstanceOf[AddonStatus]
    val CREATE_FAILED = "CREATE_FAILED".asInstanceOf[AddonStatus]
    val UPDATING = "UPDATING".asInstanceOf[AddonStatus]
    val DELETING = "DELETING".asInstanceOf[AddonStatus]
    val DELETE_FAILED = "DELETE_FAILED".asInstanceOf[AddonStatus]
    val DEGRADED = "DEGRADED".asInstanceOf[AddonStatus]

    @inline def values = js.Array(CREATING, ACTIVE, CREATE_FAILED, UPDATING, DELETING, DELETE_FAILED, DEGRADED)
  }

  /** Information about an add-on version.
    */
  @js.native
  trait AddonVersionInfo extends js.Object {
    var addonVersion: js.UndefOr[String]
    var architecture: js.UndefOr[StringList]
    var compatibilities: js.UndefOr[Compatibilities]
  }

  object AddonVersionInfo {
    @inline
    def apply(
        addonVersion: js.UndefOr[String] = js.undefined,
        architecture: js.UndefOr[StringList] = js.undefined,
        compatibilities: js.UndefOr[Compatibilities] = js.undefined
    ): AddonVersionInfo = {
      val __obj = js.Dynamic.literal()
      addonVersion.foreach(__v => __obj.updateDynamic("addonVersion")(__v.asInstanceOf[js.Any]))
      architecture.foreach(__v => __obj.updateDynamic("architecture")(__v.asInstanceOf[js.Any]))
      compatibilities.foreach(__v => __obj.updateDynamic("compatibilities")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AddonVersionInfo]
    }
  }

  @js.native
  trait AssociateEncryptionConfigRequest extends js.Object {
    var clusterName: String
    var encryptionConfig: EncryptionConfigList
    var clientRequestToken: js.UndefOr[String]
  }

  object AssociateEncryptionConfigRequest {
    @inline
    def apply(
        clusterName: String,
        encryptionConfig: EncryptionConfigList,
        clientRequestToken: js.UndefOr[String] = js.undefined
    ): AssociateEncryptionConfigRequest = {
      val __obj = js.Dynamic.literal(
        "clusterName" -> clusterName.asInstanceOf[js.Any],
        "encryptionConfig" -> encryptionConfig.asInstanceOf[js.Any]
      )

      clientRequestToken.foreach(__v => __obj.updateDynamic("clientRequestToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateEncryptionConfigRequest]
    }
  }

  @js.native
  trait AssociateEncryptionConfigResponse extends js.Object {
    var update: js.UndefOr[Update]
  }

  object AssociateEncryptionConfigResponse {
    @inline
    def apply(
        update: js.UndefOr[Update] = js.undefined
    ): AssociateEncryptionConfigResponse = {
      val __obj = js.Dynamic.literal()
      update.foreach(__v => __obj.updateDynamic("update")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateEncryptionConfigResponse]
    }
  }

  @js.native
  trait AssociateIdentityProviderConfigRequest extends js.Object {
    var clusterName: String
    var oidc: OidcIdentityProviderConfigRequest
    var clientRequestToken: js.UndefOr[String]
    var tags: js.UndefOr[TagMap]
  }

  object AssociateIdentityProviderConfigRequest {
    @inline
    def apply(
        clusterName: String,
        oidc: OidcIdentityProviderConfigRequest,
        clientRequestToken: js.UndefOr[String] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): AssociateIdentityProviderConfigRequest = {
      val __obj = js.Dynamic.literal(
        "clusterName" -> clusterName.asInstanceOf[js.Any],
        "oidc" -> oidc.asInstanceOf[js.Any]
      )

      clientRequestToken.foreach(__v => __obj.updateDynamic("clientRequestToken")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateIdentityProviderConfigRequest]
    }
  }

  @js.native
  trait AssociateIdentityProviderConfigResponse extends js.Object {
    var tags: js.UndefOr[TagMap]
    var update: js.UndefOr[Update]
  }

  object AssociateIdentityProviderConfigResponse {
    @inline
    def apply(
        tags: js.UndefOr[TagMap] = js.undefined,
        update: js.UndefOr[Update] = js.undefined
    ): AssociateIdentityProviderConfigResponse = {
      val __obj = js.Dynamic.literal()
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      update.foreach(__v => __obj.updateDynamic("update")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateIdentityProviderConfigResponse]
    }
  }

  /** An Auto Scaling group that is associated with an Amazon EKS managed node group.
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

  @js.native
  sealed trait CapacityTypes extends js.Any
  object CapacityTypes {
    val ON_DEMAND = "ON_DEMAND".asInstanceOf[CapacityTypes]
    val SPOT = "SPOT".asInstanceOf[CapacityTypes]

    @inline def values = js.Array(ON_DEMAND, SPOT)
  }

  /** An object representing the <code>certificate-authority-data</code> for your cluster.
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

  /** An object representing an Amazon EKS cluster.
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
    var kubernetesNetworkConfig: js.UndefOr[KubernetesNetworkConfigResponse]
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
        kubernetesNetworkConfig: js.UndefOr[KubernetesNetworkConfigResponse] = js.undefined,
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
      kubernetesNetworkConfig.foreach(__v => __obj.updateDynamic("kubernetesNetworkConfig")(__v.asInstanceOf[js.Any]))
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
    val CREATING = "CREATING".asInstanceOf[ClusterStatus]
    val ACTIVE = "ACTIVE".asInstanceOf[ClusterStatus]
    val DELETING = "DELETING".asInstanceOf[ClusterStatus]
    val FAILED = "FAILED".asInstanceOf[ClusterStatus]
    val UPDATING = "UPDATING".asInstanceOf[ClusterStatus]

    @inline def values = js.Array(CREATING, ACTIVE, DELETING, FAILED, UPDATING)
  }

  /** Compatibility information.
    */
  @js.native
  trait Compatibility extends js.Object {
    var clusterVersion: js.UndefOr[String]
    var defaultVersion: js.UndefOr[Boolean]
    var platformVersions: js.UndefOr[StringList]
  }

  object Compatibility {
    @inline
    def apply(
        clusterVersion: js.UndefOr[String] = js.undefined,
        defaultVersion: js.UndefOr[Boolean] = js.undefined,
        platformVersions: js.UndefOr[StringList] = js.undefined
    ): Compatibility = {
      val __obj = js.Dynamic.literal()
      clusterVersion.foreach(__v => __obj.updateDynamic("clusterVersion")(__v.asInstanceOf[js.Any]))
      defaultVersion.foreach(__v => __obj.updateDynamic("defaultVersion")(__v.asInstanceOf[js.Any]))
      platformVersions.foreach(__v => __obj.updateDynamic("platformVersions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Compatibility]
    }
  }

  @js.native
  trait CreateAddonRequest extends js.Object {
    var addonName: String
    var clusterName: ClusterName
    var addonVersion: js.UndefOr[String]
    var clientRequestToken: js.UndefOr[String]
    var resolveConflicts: js.UndefOr[ResolveConflicts]
    var serviceAccountRoleArn: js.UndefOr[RoleArn]
    var tags: js.UndefOr[TagMap]
  }

  object CreateAddonRequest {
    @inline
    def apply(
        addonName: String,
        clusterName: ClusterName,
        addonVersion: js.UndefOr[String] = js.undefined,
        clientRequestToken: js.UndefOr[String] = js.undefined,
        resolveConflicts: js.UndefOr[ResolveConflicts] = js.undefined,
        serviceAccountRoleArn: js.UndefOr[RoleArn] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateAddonRequest = {
      val __obj = js.Dynamic.literal(
        "addonName" -> addonName.asInstanceOf[js.Any],
        "clusterName" -> clusterName.asInstanceOf[js.Any]
      )

      addonVersion.foreach(__v => __obj.updateDynamic("addonVersion")(__v.asInstanceOf[js.Any]))
      clientRequestToken.foreach(__v => __obj.updateDynamic("clientRequestToken")(__v.asInstanceOf[js.Any]))
      resolveConflicts.foreach(__v => __obj.updateDynamic("resolveConflicts")(__v.asInstanceOf[js.Any]))
      serviceAccountRoleArn.foreach(__v => __obj.updateDynamic("serviceAccountRoleArn")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAddonRequest]
    }
  }

  @js.native
  trait CreateAddonResponse extends js.Object {
    var addon: js.UndefOr[Addon]
  }

  object CreateAddonResponse {
    @inline
    def apply(
        addon: js.UndefOr[Addon] = js.undefined
    ): CreateAddonResponse = {
      val __obj = js.Dynamic.literal()
      addon.foreach(__v => __obj.updateDynamic("addon")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAddonResponse]
    }
  }

  @js.native
  trait CreateClusterRequest extends js.Object {
    var name: ClusterName
    var resourcesVpcConfig: VpcConfigRequest
    var roleArn: String
    var clientRequestToken: js.UndefOr[String]
    var encryptionConfig: js.UndefOr[EncryptionConfigList]
    var kubernetesNetworkConfig: js.UndefOr[KubernetesNetworkConfigRequest]
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
        kubernetesNetworkConfig: js.UndefOr[KubernetesNetworkConfigRequest] = js.undefined,
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
      kubernetesNetworkConfig.foreach(__v => __obj.updateDynamic("kubernetesNetworkConfig")(__v.asInstanceOf[js.Any]))
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
    var capacityType: js.UndefOr[CapacityTypes]
    var clientRequestToken: js.UndefOr[String]
    var diskSize: js.UndefOr[BoxedInteger]
    var instanceTypes: js.UndefOr[StringList]
    var labels: js.UndefOr[labelsMap]
    var launchTemplate: js.UndefOr[LaunchTemplateSpecification]
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
        capacityType: js.UndefOr[CapacityTypes] = js.undefined,
        clientRequestToken: js.UndefOr[String] = js.undefined,
        diskSize: js.UndefOr[BoxedInteger] = js.undefined,
        instanceTypes: js.UndefOr[StringList] = js.undefined,
        labels: js.UndefOr[labelsMap] = js.undefined,
        launchTemplate: js.UndefOr[LaunchTemplateSpecification] = js.undefined,
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
      capacityType.foreach(__v => __obj.updateDynamic("capacityType")(__v.asInstanceOf[js.Any]))
      clientRequestToken.foreach(__v => __obj.updateDynamic("clientRequestToken")(__v.asInstanceOf[js.Any]))
      diskSize.foreach(__v => __obj.updateDynamic("diskSize")(__v.asInstanceOf[js.Any]))
      instanceTypes.foreach(__v => __obj.updateDynamic("instanceTypes")(__v.asInstanceOf[js.Any]))
      labels.foreach(__v => __obj.updateDynamic("labels")(__v.asInstanceOf[js.Any]))
      launchTemplate.foreach(__v => __obj.updateDynamic("launchTemplate")(__v.asInstanceOf[js.Any]))
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
  trait DeleteAddonRequest extends js.Object {
    var addonName: String
    var clusterName: ClusterName
  }

  object DeleteAddonRequest {
    @inline
    def apply(
        addonName: String,
        clusterName: ClusterName
    ): DeleteAddonRequest = {
      val __obj = js.Dynamic.literal(
        "addonName" -> addonName.asInstanceOf[js.Any],
        "clusterName" -> clusterName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteAddonRequest]
    }
  }

  @js.native
  trait DeleteAddonResponse extends js.Object {
    var addon: js.UndefOr[Addon]
  }

  object DeleteAddonResponse {
    @inline
    def apply(
        addon: js.UndefOr[Addon] = js.undefined
    ): DeleteAddonResponse = {
      val __obj = js.Dynamic.literal()
      addon.foreach(__v => __obj.updateDynamic("addon")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteAddonResponse]
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
  trait DescribeAddonRequest extends js.Object {
    var addonName: String
    var clusterName: ClusterName
  }

  object DescribeAddonRequest {
    @inline
    def apply(
        addonName: String,
        clusterName: ClusterName
    ): DescribeAddonRequest = {
      val __obj = js.Dynamic.literal(
        "addonName" -> addonName.asInstanceOf[js.Any],
        "clusterName" -> clusterName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeAddonRequest]
    }
  }

  @js.native
  trait DescribeAddonResponse extends js.Object {
    var addon: js.UndefOr[Addon]
  }

  object DescribeAddonResponse {
    @inline
    def apply(
        addon: js.UndefOr[Addon] = js.undefined
    ): DescribeAddonResponse = {
      val __obj = js.Dynamic.literal()
      addon.foreach(__v => __obj.updateDynamic("addon")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAddonResponse]
    }
  }

  @js.native
  trait DescribeAddonVersionsRequest extends js.Object {
    var addonName: js.UndefOr[String]
    var kubernetesVersion: js.UndefOr[String]
    var maxResults: js.UndefOr[DescribeAddonVersionsRequestMaxResults]
    var nextToken: js.UndefOr[String]
  }

  object DescribeAddonVersionsRequest {
    @inline
    def apply(
        addonName: js.UndefOr[String] = js.undefined,
        kubernetesVersion: js.UndefOr[String] = js.undefined,
        maxResults: js.UndefOr[DescribeAddonVersionsRequestMaxResults] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): DescribeAddonVersionsRequest = {
      val __obj = js.Dynamic.literal()
      addonName.foreach(__v => __obj.updateDynamic("addonName")(__v.asInstanceOf[js.Any]))
      kubernetesVersion.foreach(__v => __obj.updateDynamic("kubernetesVersion")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAddonVersionsRequest]
    }
  }

  @js.native
  trait DescribeAddonVersionsResponse extends js.Object {
    var addons: js.UndefOr[Addons]
    var nextToken: js.UndefOr[String]
  }

  object DescribeAddonVersionsResponse {
    @inline
    def apply(
        addons: js.UndefOr[Addons] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): DescribeAddonVersionsResponse = {
      val __obj = js.Dynamic.literal()
      addons.foreach(__v => __obj.updateDynamic("addons")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAddonVersionsResponse]
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
  trait DescribeIdentityProviderConfigRequest extends js.Object {
    var clusterName: String
    var identityProviderConfig: IdentityProviderConfig
  }

  object DescribeIdentityProviderConfigRequest {
    @inline
    def apply(
        clusterName: String,
        identityProviderConfig: IdentityProviderConfig
    ): DescribeIdentityProviderConfigRequest = {
      val __obj = js.Dynamic.literal(
        "clusterName" -> clusterName.asInstanceOf[js.Any],
        "identityProviderConfig" -> identityProviderConfig.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeIdentityProviderConfigRequest]
    }
  }

  @js.native
  trait DescribeIdentityProviderConfigResponse extends js.Object {
    var identityProviderConfig: js.UndefOr[IdentityProviderConfigResponse]
  }

  object DescribeIdentityProviderConfigResponse {
    @inline
    def apply(
        identityProviderConfig: js.UndefOr[IdentityProviderConfigResponse] = js.undefined
    ): DescribeIdentityProviderConfigResponse = {
      val __obj = js.Dynamic.literal()
      identityProviderConfig.foreach(__v => __obj.updateDynamic("identityProviderConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeIdentityProviderConfigResponse]
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
    var addonName: js.UndefOr[String]
    var nodegroupName: js.UndefOr[String]
  }

  object DescribeUpdateRequest {
    @inline
    def apply(
        name: String,
        updateId: String,
        addonName: js.UndefOr[String] = js.undefined,
        nodegroupName: js.UndefOr[String] = js.undefined
    ): DescribeUpdateRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "updateId" -> updateId.asInstanceOf[js.Any]
      )

      addonName.foreach(__v => __obj.updateDynamic("addonName")(__v.asInstanceOf[js.Any]))
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

  @js.native
  trait DisassociateIdentityProviderConfigRequest extends js.Object {
    var clusterName: String
    var identityProviderConfig: IdentityProviderConfig
    var clientRequestToken: js.UndefOr[String]
  }

  object DisassociateIdentityProviderConfigRequest {
    @inline
    def apply(
        clusterName: String,
        identityProviderConfig: IdentityProviderConfig,
        clientRequestToken: js.UndefOr[String] = js.undefined
    ): DisassociateIdentityProviderConfigRequest = {
      val __obj = js.Dynamic.literal(
        "clusterName" -> clusterName.asInstanceOf[js.Any],
        "identityProviderConfig" -> identityProviderConfig.asInstanceOf[js.Any]
      )

      clientRequestToken.foreach(__v => __obj.updateDynamic("clientRequestToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociateIdentityProviderConfigRequest]
    }
  }

  @js.native
  trait DisassociateIdentityProviderConfigResponse extends js.Object {
    var update: js.UndefOr[Update]
  }

  object DisassociateIdentityProviderConfigResponse {
    @inline
    def apply(
        update: js.UndefOr[Update] = js.undefined
    ): DisassociateIdentityProviderConfigResponse = {
      val __obj = js.Dynamic.literal()
      update.foreach(__v => __obj.updateDynamic("update")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociateIdentityProviderConfigResponse]
    }
  }

  /** The encryption configuration for the cluster.
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
    val SubnetNotFound = "SubnetNotFound".asInstanceOf[ErrorCode]
    val SecurityGroupNotFound = "SecurityGroupNotFound".asInstanceOf[ErrorCode]
    val EniLimitReached = "EniLimitReached".asInstanceOf[ErrorCode]
    val IpNotAvailable = "IpNotAvailable".asInstanceOf[ErrorCode]
    val AccessDenied = "AccessDenied".asInstanceOf[ErrorCode]
    val OperationNotPermitted = "OperationNotPermitted".asInstanceOf[ErrorCode]
    val VpcIdNotFound = "VpcIdNotFound".asInstanceOf[ErrorCode]
    val Unknown = "Unknown".asInstanceOf[ErrorCode]
    val NodeCreationFailure = "NodeCreationFailure".asInstanceOf[ErrorCode]
    val PodEvictionFailure = "PodEvictionFailure".asInstanceOf[ErrorCode]
    val InsufficientFreeAddresses = "InsufficientFreeAddresses".asInstanceOf[ErrorCode]
    val ClusterUnreachable = "ClusterUnreachable".asInstanceOf[ErrorCode]
    val InsufficientNumberOfReplicas = "InsufficientNumberOfReplicas".asInstanceOf[ErrorCode]
    val ConfigurationConflict = "ConfigurationConflict".asInstanceOf[ErrorCode]
    val AdmissionRequestDenied = "AdmissionRequestDenied".asInstanceOf[ErrorCode]

    @inline def values = js.Array(
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
      InsufficientFreeAddresses,
      ClusterUnreachable,
      InsufficientNumberOfReplicas,
      ConfigurationConflict,
      AdmissionRequestDenied
    )
  }

  /** An object representing an error when an asynchronous operation fails.
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

  /** An object representing an AWS Fargate profile.
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

  /** An object representing an AWS Fargate profile selector.
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
    val CREATING = "CREATING".asInstanceOf[FargateProfileStatus]
    val ACTIVE = "ACTIVE".asInstanceOf[FargateProfileStatus]
    val DELETING = "DELETING".asInstanceOf[FargateProfileStatus]
    val CREATE_FAILED = "CREATE_FAILED".asInstanceOf[FargateProfileStatus]
    val DELETE_FAILED = "DELETE_FAILED".asInstanceOf[FargateProfileStatus]

    @inline def values = js.Array(CREATING, ACTIVE, DELETING, CREATE_FAILED, DELETE_FAILED)
  }

  /** An object representing an identity provider.
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

  /** An object representing an identity provider configuration.
    */
  @js.native
  trait IdentityProviderConfig extends js.Object {
    var name: String
    var `type`: String
  }

  object IdentityProviderConfig {
    @inline
    def apply(
        name: String,
        `type`: String
    ): IdentityProviderConfig = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[IdentityProviderConfig]
    }
  }

  /** An object that represents an identity configuration.
    */
  @js.native
  trait IdentityProviderConfigResponse extends js.Object {
    var oidc: js.UndefOr[OidcIdentityProviderConfig]
  }

  object IdentityProviderConfigResponse {
    @inline
    def apply(
        oidc: js.UndefOr[OidcIdentityProviderConfig] = js.undefined
    ): IdentityProviderConfigResponse = {
      val __obj = js.Dynamic.literal()
      oidc.foreach(__v => __obj.updateDynamic("oidc")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IdentityProviderConfigResponse]
    }
  }

  /** An object representing an issue with an Amazon EKS resource.
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

  /** The Kubernetes network configuration for the cluster.
    */
  @js.native
  trait KubernetesNetworkConfigRequest extends js.Object {
    var serviceIpv4Cidr: js.UndefOr[String]
  }

  object KubernetesNetworkConfigRequest {
    @inline
    def apply(
        serviceIpv4Cidr: js.UndefOr[String] = js.undefined
    ): KubernetesNetworkConfigRequest = {
      val __obj = js.Dynamic.literal()
      serviceIpv4Cidr.foreach(__v => __obj.updateDynamic("serviceIpv4Cidr")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KubernetesNetworkConfigRequest]
    }
  }

  /** The Kubernetes network configuration for the cluster.
    */
  @js.native
  trait KubernetesNetworkConfigResponse extends js.Object {
    var serviceIpv4Cidr: js.UndefOr[String]
  }

  object KubernetesNetworkConfigResponse {
    @inline
    def apply(
        serviceIpv4Cidr: js.UndefOr[String] = js.undefined
    ): KubernetesNetworkConfigResponse = {
      val __obj = js.Dynamic.literal()
      serviceIpv4Cidr.foreach(__v => __obj.updateDynamic("serviceIpv4Cidr")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KubernetesNetworkConfigResponse]
    }
  }

  /** An object representing a node group launch template specification. The launch template cannot include <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateNetworkInterface.html"> <code>SubnetId</code> </a>, <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_IamInstanceProfile.html"> <code>IamInstanceProfile</code> </a>, <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RequestSpotInstances.html"> <code>RequestSpotInstances</code> </a>, <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_HibernationOptionsRequest.html"> <code>HibernationOptions</code> </a>, or <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_TerminateInstances.html"> <code>TerminateInstances</code> </a>, or the node group deployment or update will fail. For more information about launch templates, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateLaunchTemplate.html"> <code>CreateLaunchTemplate</code> </a> in the Amazon EC2 API Reference. For more information about using launch templates with Amazon EKS, see [[https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html|Launch template support]] in the Amazon EKS User Guide.
    * Specify either <code>name</code> or <code>id</code>, but not both.
    */
  @js.native
  trait LaunchTemplateSpecification extends js.Object {
    var id: js.UndefOr[String]
    var name: js.UndefOr[String]
    var version: js.UndefOr[String]
  }

  object LaunchTemplateSpecification {
    @inline
    def apply(
        id: js.UndefOr[String] = js.undefined,
        name: js.UndefOr[String] = js.undefined,
        version: js.UndefOr[String] = js.undefined
    ): LaunchTemplateSpecification = {
      val __obj = js.Dynamic.literal()
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LaunchTemplateSpecification]
    }
  }

  @js.native
  trait ListAddonsRequest extends js.Object {
    var clusterName: ClusterName
    var maxResults: js.UndefOr[ListAddonsRequestMaxResults]
    var nextToken: js.UndefOr[String]
  }

  object ListAddonsRequest {
    @inline
    def apply(
        clusterName: ClusterName,
        maxResults: js.UndefOr[ListAddonsRequestMaxResults] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListAddonsRequest = {
      val __obj = js.Dynamic.literal(
        "clusterName" -> clusterName.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAddonsRequest]
    }
  }

  @js.native
  trait ListAddonsResponse extends js.Object {
    var addons: js.UndefOr[StringList]
    var nextToken: js.UndefOr[String]
  }

  object ListAddonsResponse {
    @inline
    def apply(
        addons: js.UndefOr[StringList] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListAddonsResponse = {
      val __obj = js.Dynamic.literal()
      addons.foreach(__v => __obj.updateDynamic("addons")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAddonsResponse]
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
  trait ListIdentityProviderConfigsRequest extends js.Object {
    var clusterName: String
    var maxResults: js.UndefOr[ListIdentityProviderConfigsRequestMaxResults]
    var nextToken: js.UndefOr[String]
  }

  object ListIdentityProviderConfigsRequest {
    @inline
    def apply(
        clusterName: String,
        maxResults: js.UndefOr[ListIdentityProviderConfigsRequestMaxResults] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListIdentityProviderConfigsRequest = {
      val __obj = js.Dynamic.literal(
        "clusterName" -> clusterName.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListIdentityProviderConfigsRequest]
    }
  }

  @js.native
  trait ListIdentityProviderConfigsResponse extends js.Object {
    var identityProviderConfigs: js.UndefOr[IdentityProviderConfigs]
    var nextToken: js.UndefOr[String]
  }

  object ListIdentityProviderConfigsResponse {
    @inline
    def apply(
        identityProviderConfigs: js.UndefOr[IdentityProviderConfigs] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListIdentityProviderConfigsResponse = {
      val __obj = js.Dynamic.literal()
      identityProviderConfigs.foreach(__v => __obj.updateDynamic("identityProviderConfigs")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListIdentityProviderConfigsResponse]
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
    var addonName: js.UndefOr[String]
    var maxResults: js.UndefOr[ListUpdatesRequestMaxResults]
    var nextToken: js.UndefOr[String]
    var nodegroupName: js.UndefOr[String]
  }

  object ListUpdatesRequest {
    @inline
    def apply(
        name: String,
        addonName: js.UndefOr[String] = js.undefined,
        maxResults: js.UndefOr[ListUpdatesRequestMaxResults] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined,
        nodegroupName: js.UndefOr[String] = js.undefined
    ): ListUpdatesRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      addonName.foreach(__v => __obj.updateDynamic("addonName")(__v.asInstanceOf[js.Any]))
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

  /** An object representing the enabled or disabled Kubernetes control plane logs for your cluster.
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
    val api = "api".asInstanceOf[LogType]
    val audit = "audit".asInstanceOf[LogType]
    val authenticator = "authenticator".asInstanceOf[LogType]
    val controllerManager = "controllerManager".asInstanceOf[LogType]
    val scheduler = "scheduler".asInstanceOf[LogType]

    @inline def values = js.Array(api, audit, authenticator, controllerManager, scheduler)
  }

  /** An object representing the logging configuration for resources in your cluster.
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

  /** An object representing an Amazon EKS managed node group.
    */
  @js.native
  trait Nodegroup extends js.Object {
    var amiType: js.UndefOr[AMITypes]
    var capacityType: js.UndefOr[CapacityTypes]
    var clusterName: js.UndefOr[String]
    var createdAt: js.UndefOr[Timestamp]
    var diskSize: js.UndefOr[BoxedInteger]
    var health: js.UndefOr[NodegroupHealth]
    var instanceTypes: js.UndefOr[StringList]
    var labels: js.UndefOr[labelsMap]
    var launchTemplate: js.UndefOr[LaunchTemplateSpecification]
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
        capacityType: js.UndefOr[CapacityTypes] = js.undefined,
        clusterName: js.UndefOr[String] = js.undefined,
        createdAt: js.UndefOr[Timestamp] = js.undefined,
        diskSize: js.UndefOr[BoxedInteger] = js.undefined,
        health: js.UndefOr[NodegroupHealth] = js.undefined,
        instanceTypes: js.UndefOr[StringList] = js.undefined,
        labels: js.UndefOr[labelsMap] = js.undefined,
        launchTemplate: js.UndefOr[LaunchTemplateSpecification] = js.undefined,
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
      capacityType.foreach(__v => __obj.updateDynamic("capacityType")(__v.asInstanceOf[js.Any]))
      clusterName.foreach(__v => __obj.updateDynamic("clusterName")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      diskSize.foreach(__v => __obj.updateDynamic("diskSize")(__v.asInstanceOf[js.Any]))
      health.foreach(__v => __obj.updateDynamic("health")(__v.asInstanceOf[js.Any]))
      instanceTypes.foreach(__v => __obj.updateDynamic("instanceTypes")(__v.asInstanceOf[js.Any]))
      labels.foreach(__v => __obj.updateDynamic("labels")(__v.asInstanceOf[js.Any]))
      launchTemplate.foreach(__v => __obj.updateDynamic("launchTemplate")(__v.asInstanceOf[js.Any]))
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

  /** An object representing the health status of the node group.
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
    val AutoScalingGroupNotFound = "AutoScalingGroupNotFound".asInstanceOf[NodegroupIssueCode]
    val AutoScalingGroupInvalidConfiguration = "AutoScalingGroupInvalidConfiguration".asInstanceOf[NodegroupIssueCode]
    val Ec2SecurityGroupNotFound = "Ec2SecurityGroupNotFound".asInstanceOf[NodegroupIssueCode]
    val Ec2SecurityGroupDeletionFailure = "Ec2SecurityGroupDeletionFailure".asInstanceOf[NodegroupIssueCode]
    val Ec2LaunchTemplateNotFound = "Ec2LaunchTemplateNotFound".asInstanceOf[NodegroupIssueCode]
    val Ec2LaunchTemplateVersionMismatch = "Ec2LaunchTemplateVersionMismatch".asInstanceOf[NodegroupIssueCode]
    val Ec2SubnetNotFound = "Ec2SubnetNotFound".asInstanceOf[NodegroupIssueCode]
    val Ec2SubnetInvalidConfiguration = "Ec2SubnetInvalidConfiguration".asInstanceOf[NodegroupIssueCode]
    val IamInstanceProfileNotFound = "IamInstanceProfileNotFound".asInstanceOf[NodegroupIssueCode]
    val IamLimitExceeded = "IamLimitExceeded".asInstanceOf[NodegroupIssueCode]
    val IamNodeRoleNotFound = "IamNodeRoleNotFound".asInstanceOf[NodegroupIssueCode]
    val NodeCreationFailure = "NodeCreationFailure".asInstanceOf[NodegroupIssueCode]
    val AsgInstanceLaunchFailures = "AsgInstanceLaunchFailures".asInstanceOf[NodegroupIssueCode]
    val InstanceLimitExceeded = "InstanceLimitExceeded".asInstanceOf[NodegroupIssueCode]
    val InsufficientFreeAddresses = "InsufficientFreeAddresses".asInstanceOf[NodegroupIssueCode]
    val AccessDenied = "AccessDenied".asInstanceOf[NodegroupIssueCode]
    val InternalFailure = "InternalFailure".asInstanceOf[NodegroupIssueCode]
    val ClusterUnreachable = "ClusterUnreachable".asInstanceOf[NodegroupIssueCode]

    @inline def values = js.Array(
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
      InternalFailure,
      ClusterUnreachable
    )
  }

  /** An object representing the resources associated with the node group, such as Auto Scaling groups and security groups for remote access.
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

  /** An object representing the scaling configuration details for the Auto Scaling group that is associated with your node group. If you specify a value for any property, then you must specify values for all of the properties.
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
    val CREATING = "CREATING".asInstanceOf[NodegroupStatus]
    val ACTIVE = "ACTIVE".asInstanceOf[NodegroupStatus]
    val UPDATING = "UPDATING".asInstanceOf[NodegroupStatus]
    val DELETING = "DELETING".asInstanceOf[NodegroupStatus]
    val CREATE_FAILED = "CREATE_FAILED".asInstanceOf[NodegroupStatus]
    val DELETE_FAILED = "DELETE_FAILED".asInstanceOf[NodegroupStatus]
    val DEGRADED = "DEGRADED".asInstanceOf[NodegroupStatus]

    @inline def values = js.Array(CREATING, ACTIVE, UPDATING, DELETING, CREATE_FAILED, DELETE_FAILED, DEGRADED)
  }

  /** An object representing the [[https://openid.net/connect/|OpenID Connect]] (OIDC) identity provider information for the cluster.
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

  /** An object that represents the configuration for an OpenID Connect (OIDC) identity provider.
    */
  @js.native
  trait OidcIdentityProviderConfig extends js.Object {
    var clientId: js.UndefOr[String]
    var clusterName: js.UndefOr[String]
    var groupsClaim: js.UndefOr[String]
    var groupsPrefix: js.UndefOr[String]
    var identityProviderConfigArn: js.UndefOr[String]
    var identityProviderConfigName: js.UndefOr[String]
    var issuerUrl: js.UndefOr[String]
    var requiredClaims: js.UndefOr[requiredClaimsMap]
    var status: js.UndefOr[configStatus]
    var tags: js.UndefOr[TagMap]
    var usernameClaim: js.UndefOr[String]
    var usernamePrefix: js.UndefOr[String]
  }

  object OidcIdentityProviderConfig {
    @inline
    def apply(
        clientId: js.UndefOr[String] = js.undefined,
        clusterName: js.UndefOr[String] = js.undefined,
        groupsClaim: js.UndefOr[String] = js.undefined,
        groupsPrefix: js.UndefOr[String] = js.undefined,
        identityProviderConfigArn: js.UndefOr[String] = js.undefined,
        identityProviderConfigName: js.UndefOr[String] = js.undefined,
        issuerUrl: js.UndefOr[String] = js.undefined,
        requiredClaims: js.UndefOr[requiredClaimsMap] = js.undefined,
        status: js.UndefOr[configStatus] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined,
        usernameClaim: js.UndefOr[String] = js.undefined,
        usernamePrefix: js.UndefOr[String] = js.undefined
    ): OidcIdentityProviderConfig = {
      val __obj = js.Dynamic.literal()
      clientId.foreach(__v => __obj.updateDynamic("clientId")(__v.asInstanceOf[js.Any]))
      clusterName.foreach(__v => __obj.updateDynamic("clusterName")(__v.asInstanceOf[js.Any]))
      groupsClaim.foreach(__v => __obj.updateDynamic("groupsClaim")(__v.asInstanceOf[js.Any]))
      groupsPrefix.foreach(__v => __obj.updateDynamic("groupsPrefix")(__v.asInstanceOf[js.Any]))
      identityProviderConfigArn.foreach(__v => __obj.updateDynamic("identityProviderConfigArn")(__v.asInstanceOf[js.Any]))
      identityProviderConfigName.foreach(__v => __obj.updateDynamic("identityProviderConfigName")(__v.asInstanceOf[js.Any]))
      issuerUrl.foreach(__v => __obj.updateDynamic("issuerUrl")(__v.asInstanceOf[js.Any]))
      requiredClaims.foreach(__v => __obj.updateDynamic("requiredClaims")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      usernameClaim.foreach(__v => __obj.updateDynamic("usernameClaim")(__v.asInstanceOf[js.Any]))
      usernamePrefix.foreach(__v => __obj.updateDynamic("usernamePrefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OidcIdentityProviderConfig]
    }
  }

  /** An object representing an OpenID Connect (OIDC) configuration. Before associating an OIDC identity provider to your cluster, review the considerations in [[https://docs.aws.amazon.com/eks/latest/userguide/authenticate-oidc-identity-provider.html|Authenticating users for your cluster from an OpenID Connect identity provider]] in the <i>Amazon EKS User Guide</i>.
    */
  @js.native
  trait OidcIdentityProviderConfigRequest extends js.Object {
    var clientId: String
    var identityProviderConfigName: String
    var issuerUrl: String
    var groupsClaim: js.UndefOr[String]
    var groupsPrefix: js.UndefOr[String]
    var requiredClaims: js.UndefOr[requiredClaimsMap]
    var usernameClaim: js.UndefOr[String]
    var usernamePrefix: js.UndefOr[String]
  }

  object OidcIdentityProviderConfigRequest {
    @inline
    def apply(
        clientId: String,
        identityProviderConfigName: String,
        issuerUrl: String,
        groupsClaim: js.UndefOr[String] = js.undefined,
        groupsPrefix: js.UndefOr[String] = js.undefined,
        requiredClaims: js.UndefOr[requiredClaimsMap] = js.undefined,
        usernameClaim: js.UndefOr[String] = js.undefined,
        usernamePrefix: js.UndefOr[String] = js.undefined
    ): OidcIdentityProviderConfigRequest = {
      val __obj = js.Dynamic.literal(
        "clientId" -> clientId.asInstanceOf[js.Any],
        "identityProviderConfigName" -> identityProviderConfigName.asInstanceOf[js.Any],
        "issuerUrl" -> issuerUrl.asInstanceOf[js.Any]
      )

      groupsClaim.foreach(__v => __obj.updateDynamic("groupsClaim")(__v.asInstanceOf[js.Any]))
      groupsPrefix.foreach(__v => __obj.updateDynamic("groupsPrefix")(__v.asInstanceOf[js.Any]))
      requiredClaims.foreach(__v => __obj.updateDynamic("requiredClaims")(__v.asInstanceOf[js.Any]))
      usernameClaim.foreach(__v => __obj.updateDynamic("usernameClaim")(__v.asInstanceOf[js.Any]))
      usernamePrefix.foreach(__v => __obj.updateDynamic("usernamePrefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OidcIdentityProviderConfigRequest]
    }
  }

  /** Identifies the AWS Key Management Service (AWS KMS) customer master key (CMK) used to encrypt the secrets.
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

  /** An object representing the remote access configuration for the managed node group.
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
  sealed trait ResolveConflicts extends js.Any
  object ResolveConflicts {
    val OVERWRITE = "OVERWRITE".asInstanceOf[ResolveConflicts]
    val NONE = "NONE".asInstanceOf[ResolveConflicts]

    @inline def values = js.Array(OVERWRITE, NONE)
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
  trait UntagResourceResponse extends js.Object

  object UntagResourceResponse {
    @inline
    def apply(): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  /** An object representing an asynchronous update.
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
  trait UpdateAddonRequest extends js.Object {
    var addonName: String
    var clusterName: ClusterName
    var addonVersion: js.UndefOr[String]
    var clientRequestToken: js.UndefOr[String]
    var resolveConflicts: js.UndefOr[ResolveConflicts]
    var serviceAccountRoleArn: js.UndefOr[RoleArn]
  }

  object UpdateAddonRequest {
    @inline
    def apply(
        addonName: String,
        clusterName: ClusterName,
        addonVersion: js.UndefOr[String] = js.undefined,
        clientRequestToken: js.UndefOr[String] = js.undefined,
        resolveConflicts: js.UndefOr[ResolveConflicts] = js.undefined,
        serviceAccountRoleArn: js.UndefOr[RoleArn] = js.undefined
    ): UpdateAddonRequest = {
      val __obj = js.Dynamic.literal(
        "addonName" -> addonName.asInstanceOf[js.Any],
        "clusterName" -> clusterName.asInstanceOf[js.Any]
      )

      addonVersion.foreach(__v => __obj.updateDynamic("addonVersion")(__v.asInstanceOf[js.Any]))
      clientRequestToken.foreach(__v => __obj.updateDynamic("clientRequestToken")(__v.asInstanceOf[js.Any]))
      resolveConflicts.foreach(__v => __obj.updateDynamic("resolveConflicts")(__v.asInstanceOf[js.Any]))
      serviceAccountRoleArn.foreach(__v => __obj.updateDynamic("serviceAccountRoleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAddonRequest]
    }
  }

  @js.native
  trait UpdateAddonResponse extends js.Object {
    var update: js.UndefOr[Update]
  }

  object UpdateAddonResponse {
    @inline
    def apply(
        update: js.UndefOr[Update] = js.undefined
    ): UpdateAddonResponse = {
      val __obj = js.Dynamic.literal()
      update.foreach(__v => __obj.updateDynamic("update")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAddonResponse]
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

  /** An object representing a Kubernetes label change for a managed node group.
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
    var launchTemplate: js.UndefOr[LaunchTemplateSpecification]
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
        launchTemplate: js.UndefOr[LaunchTemplateSpecification] = js.undefined,
        releaseVersion: js.UndefOr[String] = js.undefined,
        version: js.UndefOr[String] = js.undefined
    ): UpdateNodegroupVersionRequest = {
      val __obj = js.Dynamic.literal(
        "clusterName" -> clusterName.asInstanceOf[js.Any],
        "nodegroupName" -> nodegroupName.asInstanceOf[js.Any]
      )

      clientRequestToken.foreach(__v => __obj.updateDynamic("clientRequestToken")(__v.asInstanceOf[js.Any]))
      force.foreach(__v => __obj.updateDynamic("force")(__v.asInstanceOf[js.Any]))
      launchTemplate.foreach(__v => __obj.updateDynamic("launchTemplate")(__v.asInstanceOf[js.Any]))
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

  /** An object representing the details of an update request.
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
    val Version = "Version".asInstanceOf[UpdateParamType]
    val PlatformVersion = "PlatformVersion".asInstanceOf[UpdateParamType]
    val EndpointPrivateAccess = "EndpointPrivateAccess".asInstanceOf[UpdateParamType]
    val EndpointPublicAccess = "EndpointPublicAccess".asInstanceOf[UpdateParamType]
    val ClusterLogging = "ClusterLogging".asInstanceOf[UpdateParamType]
    val DesiredSize = "DesiredSize".asInstanceOf[UpdateParamType]
    val LabelsToAdd = "LabelsToAdd".asInstanceOf[UpdateParamType]
    val LabelsToRemove = "LabelsToRemove".asInstanceOf[UpdateParamType]
    val MaxSize = "MaxSize".asInstanceOf[UpdateParamType]
    val MinSize = "MinSize".asInstanceOf[UpdateParamType]
    val ReleaseVersion = "ReleaseVersion".asInstanceOf[UpdateParamType]
    val PublicAccessCidrs = "PublicAccessCidrs".asInstanceOf[UpdateParamType]
    val IdentityProviderConfig = "IdentityProviderConfig".asInstanceOf[UpdateParamType]
    val EncryptionConfig = "EncryptionConfig".asInstanceOf[UpdateParamType]
    val AddonVersion = "AddonVersion".asInstanceOf[UpdateParamType]
    val ServiceAccountRoleArn = "ServiceAccountRoleArn".asInstanceOf[UpdateParamType]
    val ResolveConflicts = "ResolveConflicts".asInstanceOf[UpdateParamType]

    @inline def values = js.Array(
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
      PublicAccessCidrs,
      IdentityProviderConfig,
      EncryptionConfig,
      AddonVersion,
      ServiceAccountRoleArn,
      ResolveConflicts
    )
  }

  @js.native
  sealed trait UpdateStatus extends js.Any
  object UpdateStatus {
    val InProgress = "InProgress".asInstanceOf[UpdateStatus]
    val Failed = "Failed".asInstanceOf[UpdateStatus]
    val Cancelled = "Cancelled".asInstanceOf[UpdateStatus]
    val Successful = "Successful".asInstanceOf[UpdateStatus]

    @inline def values = js.Array(InProgress, Failed, Cancelled, Successful)
  }

  @js.native
  sealed trait UpdateType extends js.Any
  object UpdateType {
    val VersionUpdate = "VersionUpdate".asInstanceOf[UpdateType]
    val EndpointAccessUpdate = "EndpointAccessUpdate".asInstanceOf[UpdateType]
    val LoggingUpdate = "LoggingUpdate".asInstanceOf[UpdateType]
    val ConfigUpdate = "ConfigUpdate".asInstanceOf[UpdateType]
    val AssociateIdentityProviderConfig = "AssociateIdentityProviderConfig".asInstanceOf[UpdateType]
    val DisassociateIdentityProviderConfig = "DisassociateIdentityProviderConfig".asInstanceOf[UpdateType]
    val AssociateEncryptionConfig = "AssociateEncryptionConfig".asInstanceOf[UpdateType]
    val AddonUpdate = "AddonUpdate".asInstanceOf[UpdateType]

    @inline def values = js.Array(
      VersionUpdate,
      EndpointAccessUpdate,
      LoggingUpdate,
      ConfigUpdate,
      AssociateIdentityProviderConfig,
      DisassociateIdentityProviderConfig,
      AssociateEncryptionConfig,
      AddonUpdate
    )
  }

  /** An object representing the VPC configuration to use for an Amazon EKS cluster.
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

  /** An object representing an Amazon EKS cluster VPC configuration response.
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

  @js.native
  sealed trait configStatus extends js.Any
  object configStatus {
    val CREATING = "CREATING".asInstanceOf[configStatus]
    val DELETING = "DELETING".asInstanceOf[configStatus]
    val ACTIVE = "ACTIVE".asInstanceOf[configStatus]

    @inline def values = js.Array(CREATING, DELETING, ACTIVE)
  }
}
