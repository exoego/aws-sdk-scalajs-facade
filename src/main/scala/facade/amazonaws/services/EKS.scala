package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object eks {
  type ClusterName = String
  type ClusterStatus = String
  type ListClustersRequestMaxResults = Int
  type StringList = js.Array[String]
  type Timestamp = js.Date
}

package eks {
  @js.native
  @JSImport("aws-sdk", "EKS")
  class EKS(config: AWSConfig) extends js.Object {
    def createCluster(params: CreateClusterRequest): Request[CreateClusterResponse] = js.native
    def deleteCluster(params: DeleteClusterRequest): Request[DeleteClusterResponse] = js.native
    def describeCluster(params: DescribeClusterRequest): Request[DescribeClusterResponse] = js.native
    def listClusters(params: ListClustersRequest): Request[ListClustersResponse] = js.native
  }

  /**
   * <p>An object representing the <code>certificate-authority-data</code> for your cluster.</p>
   */
  @js.native
  trait Certificate extends js.Object {
    var data: js.UndefOr[String]
  }

  object Certificate {
    def apply(
      data: js.UndefOr[String] = js.undefined): Certificate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "data" -> data.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Certificate]
    }
  }

  /**
   * <p>An object representing an Amazon EKS cluster.</p>
   */
  @js.native
  trait Cluster extends js.Object {
    var certificateAuthority: js.UndefOr[Certificate]
    var arn: js.UndefOr[String]
    var name: js.UndefOr[String]
    var platformVersion: js.UndefOr[String]
    var version: js.UndefOr[String]
    var clientRequestToken: js.UndefOr[String]
    var roleArn: js.UndefOr[String]
    var status: js.UndefOr[ClusterStatus]
    var createdAt: js.UndefOr[Timestamp]
    var endpoint: js.UndefOr[String]
    var resourcesVpcConfig: js.UndefOr[VpcConfigResponse]
  }

  object Cluster {
    def apply(
      certificateAuthority: js.UndefOr[Certificate] = js.undefined,
      arn: js.UndefOr[String] = js.undefined,
      name: js.UndefOr[String] = js.undefined,
      platformVersion: js.UndefOr[String] = js.undefined,
      version: js.UndefOr[String] = js.undefined,
      clientRequestToken: js.UndefOr[String] = js.undefined,
      roleArn: js.UndefOr[String] = js.undefined,
      status: js.UndefOr[ClusterStatus] = js.undefined,
      createdAt: js.UndefOr[Timestamp] = js.undefined,
      endpoint: js.UndefOr[String] = js.undefined,
      resourcesVpcConfig: js.UndefOr[VpcConfigResponse] = js.undefined): Cluster = {
      val _fields = IndexedSeq[(String, js.Any)](
        "certificateAuthority" -> certificateAuthority.map { x => x.asInstanceOf[js.Any] },
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "platformVersion" -> platformVersion.map { x => x.asInstanceOf[js.Any] },
        "version" -> version.map { x => x.asInstanceOf[js.Any] },
        "clientRequestToken" -> clientRequestToken.map { x => x.asInstanceOf[js.Any] },
        "roleArn" -> roleArn.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "createdAt" -> createdAt.map { x => x.asInstanceOf[js.Any] },
        "endpoint" -> endpoint.map { x => x.asInstanceOf[js.Any] },
        "resourcesVpcConfig" -> resourcesVpcConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Cluster]
    }
  }

  object ClusterStatusEnum {
    val CREATING = "CREATING"
    val ACTIVE = "ACTIVE"
    val DELETING = "DELETING"
    val FAILED = "FAILED"

    val values = IndexedSeq(CREATING, ACTIVE, DELETING, FAILED)
  }

  @js.native
  trait CreateClusterRequest extends js.Object {
    var name: js.UndefOr[ClusterName]
    var version: js.UndefOr[String]
    var clientRequestToken: js.UndefOr[String]
    var roleArn: js.UndefOr[String]
    var resourcesVpcConfig: js.UndefOr[VpcConfigRequest]
  }

  object CreateClusterRequest {
    def apply(
      name: js.UndefOr[ClusterName] = js.undefined,
      version: js.UndefOr[String] = js.undefined,
      clientRequestToken: js.UndefOr[String] = js.undefined,
      roleArn: js.UndefOr[String] = js.undefined,
      resourcesVpcConfig: js.UndefOr[VpcConfigRequest] = js.undefined): CreateClusterRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "version" -> version.map { x => x.asInstanceOf[js.Any] },
        "clientRequestToken" -> clientRequestToken.map { x => x.asInstanceOf[js.Any] },
        "roleArn" -> roleArn.map { x => x.asInstanceOf[js.Any] },
        "resourcesVpcConfig" -> resourcesVpcConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateClusterRequest]
    }
  }

  @js.native
  trait CreateClusterResponse extends js.Object {
    var cluster: js.UndefOr[Cluster]
  }

  object CreateClusterResponse {
    def apply(
      cluster: js.UndefOr[Cluster] = js.undefined): CreateClusterResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "cluster" -> cluster.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateClusterResponse]
    }
  }

  @js.native
  trait DeleteClusterRequest extends js.Object {
    var name: js.UndefOr[String]
  }

  object DeleteClusterRequest {
    def apply(
      name: js.UndefOr[String] = js.undefined): DeleteClusterRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteClusterRequest]
    }
  }

  @js.native
  trait DeleteClusterResponse extends js.Object {
    var cluster: js.UndefOr[Cluster]
  }

  object DeleteClusterResponse {
    def apply(
      cluster: js.UndefOr[Cluster] = js.undefined): DeleteClusterResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "cluster" -> cluster.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteClusterResponse]
    }
  }

  @js.native
  trait DescribeClusterRequest extends js.Object {
    var name: js.UndefOr[String]
  }

  object DescribeClusterRequest {
    def apply(
      name: js.UndefOr[String] = js.undefined): DescribeClusterRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeClusterRequest]
    }
  }

  @js.native
  trait DescribeClusterResponse extends js.Object {
    var cluster: js.UndefOr[Cluster]
  }

  object DescribeClusterResponse {
    def apply(
      cluster: js.UndefOr[Cluster] = js.undefined): DescribeClusterResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "cluster" -> cluster.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeClusterResponse]
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
      nextToken: js.UndefOr[String] = js.undefined): ListClustersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListClustersRequest]
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
      nextToken: js.UndefOr[String] = js.undefined): ListClustersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "clusters" -> clusters.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListClustersResponse]
    }
  }

  /**
   * <p>An object representing an Amazon EKS cluster VPC configuration request.</p>
   */
  @js.native
  trait VpcConfigRequest extends js.Object {
    var subnetIds: js.UndefOr[StringList]
    var securityGroupIds: js.UndefOr[StringList]
  }

  object VpcConfigRequest {
    def apply(
      subnetIds: js.UndefOr[StringList] = js.undefined,
      securityGroupIds: js.UndefOr[StringList] = js.undefined): VpcConfigRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "subnetIds" -> subnetIds.map { x => x.asInstanceOf[js.Any] },
        "securityGroupIds" -> securityGroupIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VpcConfigRequest]
    }
  }

  /**
   * <p>An object representing an Amazon EKS cluster VPC configuration response.</p>
   */
  @js.native
  trait VpcConfigResponse extends js.Object {
    var subnetIds: js.UndefOr[StringList]
    var securityGroupIds: js.UndefOr[StringList]
    var vpcId: js.UndefOr[String]
  }

  object VpcConfigResponse {
    def apply(
      subnetIds: js.UndefOr[StringList] = js.undefined,
      securityGroupIds: js.UndefOr[StringList] = js.undefined,
      vpcId: js.UndefOr[String] = js.undefined): VpcConfigResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "subnetIds" -> subnetIds.map { x => x.asInstanceOf[js.Any] },
        "securityGroupIds" -> securityGroupIds.map { x => x.asInstanceOf[js.Any] },
        "vpcId" -> vpcId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VpcConfigResponse]
    }
  }
}
