package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object docdbelastic {
  type Arn = String
  type ClusterList = js.Array[ClusterInList]
  type ClusterSnapshotList = js.Array[ClusterSnapshotInList]
  type CreateClusterSnapshotInputSnapshotNameString = String
  type ListClusterSnapshotsInputMaxResultsInteger = Int
  type ListClustersInputMaxResultsInteger = Int
  type PaginationToken = String
  type Password = String
  type StringList = js.Array[String]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagMap = js.Dictionary[TagValue]
  type TagValue = String

  final class DocDBElasticOps(private val service: DocDBElastic) extends AnyVal {

    @inline def createClusterFuture(params: CreateClusterInput): Future[CreateClusterOutput] = service.createCluster(params).promise().toFuture
    @inline def createClusterSnapshotFuture(params: CreateClusterSnapshotInput): Future[CreateClusterSnapshotOutput] = service.createClusterSnapshot(params).promise().toFuture
    @inline def deleteClusterFuture(params: DeleteClusterInput): Future[DeleteClusterOutput] = service.deleteCluster(params).promise().toFuture
    @inline def deleteClusterSnapshotFuture(params: DeleteClusterSnapshotInput): Future[DeleteClusterSnapshotOutput] = service.deleteClusterSnapshot(params).promise().toFuture
    @inline def getClusterFuture(params: GetClusterInput): Future[GetClusterOutput] = service.getCluster(params).promise().toFuture
    @inline def getClusterSnapshotFuture(params: GetClusterSnapshotInput): Future[GetClusterSnapshotOutput] = service.getClusterSnapshot(params).promise().toFuture
    @inline def listClusterSnapshotsFuture(params: ListClusterSnapshotsInput): Future[ListClusterSnapshotsOutput] = service.listClusterSnapshots(params).promise().toFuture
    @inline def listClustersFuture(params: ListClustersInput): Future[ListClustersOutput] = service.listClusters(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def restoreClusterFromSnapshotFuture(params: RestoreClusterFromSnapshotInput): Future[RestoreClusterFromSnapshotOutput] = service.restoreClusterFromSnapshot(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateClusterFuture(params: UpdateClusterInput): Future[UpdateClusterOutput] = service.updateCluster(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/docdbelastic", JSImport.Namespace, "AWS.DocDBElastic")
  class DocDBElastic() extends js.Object {
    def this(config: AWSConfig) = this()

    def createCluster(params: CreateClusterInput): Request[CreateClusterOutput] = js.native
    def createClusterSnapshot(params: CreateClusterSnapshotInput): Request[CreateClusterSnapshotOutput] = js.native
    def deleteCluster(params: DeleteClusterInput): Request[DeleteClusterOutput] = js.native
    def deleteClusterSnapshot(params: DeleteClusterSnapshotInput): Request[DeleteClusterSnapshotOutput] = js.native
    def getCluster(params: GetClusterInput): Request[GetClusterOutput] = js.native
    def getClusterSnapshot(params: GetClusterSnapshotInput): Request[GetClusterSnapshotOutput] = js.native
    def listClusterSnapshots(params: ListClusterSnapshotsInput): Request[ListClusterSnapshotsOutput] = js.native
    def listClusters(params: ListClustersInput): Request[ListClustersOutput] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def restoreClusterFromSnapshot(params: RestoreClusterFromSnapshotInput): Request[RestoreClusterFromSnapshotOutput] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateCluster(params: UpdateClusterInput): Request[UpdateClusterOutput] = js.native
  }
  object DocDBElastic {
    @inline implicit def toOps(service: DocDBElastic): DocDBElasticOps = {
      new DocDBElasticOps(service)
    }
  }

  /** Returns information about a specific Elastic DocumentDB cluster.
    */
  @js.native
  trait Cluster extends js.Object {
    var adminUserName: String
    var authType: Auth
    var clusterArn: String
    var clusterEndpoint: String
    var clusterName: String
    var createTime: String
    var kmsKeyId: String
    var preferredMaintenanceWindow: String
    var shardCapacity: Int
    var shardCount: Int
    var status: Status
    var subnetIds: StringList
    var vpcSecurityGroupIds: StringList
  }

  object Cluster {
    @inline
    def apply(
        adminUserName: String,
        authType: Auth,
        clusterArn: String,
        clusterEndpoint: String,
        clusterName: String,
        createTime: String,
        kmsKeyId: String,
        preferredMaintenanceWindow: String,
        shardCapacity: Int,
        shardCount: Int,
        status: Status,
        subnetIds: StringList,
        vpcSecurityGroupIds: StringList
    ): Cluster = {
      val __obj = js.Dynamic.literal(
        "adminUserName" -> adminUserName.asInstanceOf[js.Any],
        "authType" -> authType.asInstanceOf[js.Any],
        "clusterArn" -> clusterArn.asInstanceOf[js.Any],
        "clusterEndpoint" -> clusterEndpoint.asInstanceOf[js.Any],
        "clusterName" -> clusterName.asInstanceOf[js.Any],
        "createTime" -> createTime.asInstanceOf[js.Any],
        "kmsKeyId" -> kmsKeyId.asInstanceOf[js.Any],
        "preferredMaintenanceWindow" -> preferredMaintenanceWindow.asInstanceOf[js.Any],
        "shardCapacity" -> shardCapacity.asInstanceOf[js.Any],
        "shardCount" -> shardCount.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any],
        "subnetIds" -> subnetIds.asInstanceOf[js.Any],
        "vpcSecurityGroupIds" -> vpcSecurityGroupIds.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Cluster]
    }
  }

  /** A list of Elastic DocumentDB cluster.
    */
  @js.native
  trait ClusterInList extends js.Object {
    var clusterArn: String
    var clusterName: String
    var status: Status
  }

  object ClusterInList {
    @inline
    def apply(
        clusterArn: String,
        clusterName: String,
        status: Status
    ): ClusterInList = {
      val __obj = js.Dynamic.literal(
        "clusterArn" -> clusterArn.asInstanceOf[js.Any],
        "clusterName" -> clusterName.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ClusterInList]
    }
  }

  /** Returns information about a specific Elastic DocumentDB snapshot.
    */
  @js.native
  trait ClusterSnapshot extends js.Object {
    var adminUserName: String
    var clusterArn: String
    var clusterCreationTime: String
    var kmsKeyId: String
    var snapshotArn: String
    var snapshotCreationTime: String
    var snapshotName: String
    var status: Status
    var subnetIds: StringList
    var vpcSecurityGroupIds: StringList
  }

  object ClusterSnapshot {
    @inline
    def apply(
        adminUserName: String,
        clusterArn: String,
        clusterCreationTime: String,
        kmsKeyId: String,
        snapshotArn: String,
        snapshotCreationTime: String,
        snapshotName: String,
        status: Status,
        subnetIds: StringList,
        vpcSecurityGroupIds: StringList
    ): ClusterSnapshot = {
      val __obj = js.Dynamic.literal(
        "adminUserName" -> adminUserName.asInstanceOf[js.Any],
        "clusterArn" -> clusterArn.asInstanceOf[js.Any],
        "clusterCreationTime" -> clusterCreationTime.asInstanceOf[js.Any],
        "kmsKeyId" -> kmsKeyId.asInstanceOf[js.Any],
        "snapshotArn" -> snapshotArn.asInstanceOf[js.Any],
        "snapshotCreationTime" -> snapshotCreationTime.asInstanceOf[js.Any],
        "snapshotName" -> snapshotName.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any],
        "subnetIds" -> subnetIds.asInstanceOf[js.Any],
        "vpcSecurityGroupIds" -> vpcSecurityGroupIds.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ClusterSnapshot]
    }
  }

  /** A list of Elastic DocumentDB snapshots.
    */
  @js.native
  trait ClusterSnapshotInList extends js.Object {
    var clusterArn: String
    var snapshotArn: String
    var snapshotCreationTime: String
    var snapshotName: String
    var status: Status
  }

  object ClusterSnapshotInList {
    @inline
    def apply(
        clusterArn: String,
        snapshotArn: String,
        snapshotCreationTime: String,
        snapshotName: String,
        status: Status
    ): ClusterSnapshotInList = {
      val __obj = js.Dynamic.literal(
        "clusterArn" -> clusterArn.asInstanceOf[js.Any],
        "snapshotArn" -> snapshotArn.asInstanceOf[js.Any],
        "snapshotCreationTime" -> snapshotCreationTime.asInstanceOf[js.Any],
        "snapshotName" -> snapshotName.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ClusterSnapshotInList]
    }
  }

  @js.native
  trait CreateClusterInput extends js.Object {
    var adminUserName: String
    var adminUserPassword: Password
    var authType: Auth
    var clusterName: String
    var shardCapacity: Int
    var shardCount: Int
    var clientToken: js.UndefOr[String]
    var kmsKeyId: js.UndefOr[String]
    var preferredMaintenanceWindow: js.UndefOr[String]
    var subnetIds: js.UndefOr[StringList]
    var tags: js.UndefOr[TagMap]
    var vpcSecurityGroupIds: js.UndefOr[StringList]
  }

  object CreateClusterInput {
    @inline
    def apply(
        adminUserName: String,
        adminUserPassword: Password,
        authType: Auth,
        clusterName: String,
        shardCapacity: Int,
        shardCount: Int,
        clientToken: js.UndefOr[String] = js.undefined,
        kmsKeyId: js.UndefOr[String] = js.undefined,
        preferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
        subnetIds: js.UndefOr[StringList] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined,
        vpcSecurityGroupIds: js.UndefOr[StringList] = js.undefined
    ): CreateClusterInput = {
      val __obj = js.Dynamic.literal(
        "adminUserName" -> adminUserName.asInstanceOf[js.Any],
        "adminUserPassword" -> adminUserPassword.asInstanceOf[js.Any],
        "authType" -> authType.asInstanceOf[js.Any],
        "clusterName" -> clusterName.asInstanceOf[js.Any],
        "shardCapacity" -> shardCapacity.asInstanceOf[js.Any],
        "shardCount" -> shardCount.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      kmsKeyId.foreach(__v => __obj.updateDynamic("kmsKeyId")(__v.asInstanceOf[js.Any]))
      preferredMaintenanceWindow.foreach(__v => __obj.updateDynamic("preferredMaintenanceWindow")(__v.asInstanceOf[js.Any]))
      subnetIds.foreach(__v => __obj.updateDynamic("subnetIds")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      vpcSecurityGroupIds.foreach(__v => __obj.updateDynamic("vpcSecurityGroupIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateClusterInput]
    }
  }

  @js.native
  trait CreateClusterOutput extends js.Object {
    var cluster: Cluster
  }

  object CreateClusterOutput {
    @inline
    def apply(
        cluster: Cluster
    ): CreateClusterOutput = {
      val __obj = js.Dynamic.literal(
        "cluster" -> cluster.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateClusterOutput]
    }
  }

  @js.native
  trait CreateClusterSnapshotInput extends js.Object {
    var clusterArn: String
    var snapshotName: CreateClusterSnapshotInputSnapshotNameString
    var tags: js.UndefOr[TagMap]
  }

  object CreateClusterSnapshotInput {
    @inline
    def apply(
        clusterArn: String,
        snapshotName: CreateClusterSnapshotInputSnapshotNameString,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateClusterSnapshotInput = {
      val __obj = js.Dynamic.literal(
        "clusterArn" -> clusterArn.asInstanceOf[js.Any],
        "snapshotName" -> snapshotName.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateClusterSnapshotInput]
    }
  }

  @js.native
  trait CreateClusterSnapshotOutput extends js.Object {
    var snapshot: ClusterSnapshot
  }

  object CreateClusterSnapshotOutput {
    @inline
    def apply(
        snapshot: ClusterSnapshot
    ): CreateClusterSnapshotOutput = {
      val __obj = js.Dynamic.literal(
        "snapshot" -> snapshot.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateClusterSnapshotOutput]
    }
  }

  @js.native
  trait DeleteClusterInput extends js.Object {
    var clusterArn: String
  }

  object DeleteClusterInput {
    @inline
    def apply(
        clusterArn: String
    ): DeleteClusterInput = {
      val __obj = js.Dynamic.literal(
        "clusterArn" -> clusterArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteClusterInput]
    }
  }

  @js.native
  trait DeleteClusterOutput extends js.Object {
    var cluster: Cluster
  }

  object DeleteClusterOutput {
    @inline
    def apply(
        cluster: Cluster
    ): DeleteClusterOutput = {
      val __obj = js.Dynamic.literal(
        "cluster" -> cluster.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteClusterOutput]
    }
  }

  @js.native
  trait DeleteClusterSnapshotInput extends js.Object {
    var snapshotArn: String
  }

  object DeleteClusterSnapshotInput {
    @inline
    def apply(
        snapshotArn: String
    ): DeleteClusterSnapshotInput = {
      val __obj = js.Dynamic.literal(
        "snapshotArn" -> snapshotArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteClusterSnapshotInput]
    }
  }

  @js.native
  trait DeleteClusterSnapshotOutput extends js.Object {
    var snapshot: ClusterSnapshot
  }

  object DeleteClusterSnapshotOutput {
    @inline
    def apply(
        snapshot: ClusterSnapshot
    ): DeleteClusterSnapshotOutput = {
      val __obj = js.Dynamic.literal(
        "snapshot" -> snapshot.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteClusterSnapshotOutput]
    }
  }

  @js.native
  trait GetClusterInput extends js.Object {
    var clusterArn: String
  }

  object GetClusterInput {
    @inline
    def apply(
        clusterArn: String
    ): GetClusterInput = {
      val __obj = js.Dynamic.literal(
        "clusterArn" -> clusterArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetClusterInput]
    }
  }

  @js.native
  trait GetClusterOutput extends js.Object {
    var cluster: Cluster
  }

  object GetClusterOutput {
    @inline
    def apply(
        cluster: Cluster
    ): GetClusterOutput = {
      val __obj = js.Dynamic.literal(
        "cluster" -> cluster.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetClusterOutput]
    }
  }

  @js.native
  trait GetClusterSnapshotInput extends js.Object {
    var snapshotArn: String
  }

  object GetClusterSnapshotInput {
    @inline
    def apply(
        snapshotArn: String
    ): GetClusterSnapshotInput = {
      val __obj = js.Dynamic.literal(
        "snapshotArn" -> snapshotArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetClusterSnapshotInput]
    }
  }

  @js.native
  trait GetClusterSnapshotOutput extends js.Object {
    var snapshot: ClusterSnapshot
  }

  object GetClusterSnapshotOutput {
    @inline
    def apply(
        snapshot: ClusterSnapshot
    ): GetClusterSnapshotOutput = {
      val __obj = js.Dynamic.literal(
        "snapshot" -> snapshot.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetClusterSnapshotOutput]
    }
  }

  @js.native
  trait ListClusterSnapshotsInput extends js.Object {
    var clusterArn: js.UndefOr[String]
    var maxResults: js.UndefOr[ListClusterSnapshotsInputMaxResultsInteger]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListClusterSnapshotsInput {
    @inline
    def apply(
        clusterArn: js.UndefOr[String] = js.undefined,
        maxResults: js.UndefOr[ListClusterSnapshotsInputMaxResultsInteger] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListClusterSnapshotsInput = {
      val __obj = js.Dynamic.literal()
      clusterArn.foreach(__v => __obj.updateDynamic("clusterArn")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListClusterSnapshotsInput]
    }
  }

  @js.native
  trait ListClusterSnapshotsOutput extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var snapshots: js.UndefOr[ClusterSnapshotList]
  }

  object ListClusterSnapshotsOutput {
    @inline
    def apply(
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        snapshots: js.UndefOr[ClusterSnapshotList] = js.undefined
    ): ListClusterSnapshotsOutput = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      snapshots.foreach(__v => __obj.updateDynamic("snapshots")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListClusterSnapshotsOutput]
    }
  }

  @js.native
  trait ListClustersInput extends js.Object {
    var maxResults: js.UndefOr[ListClustersInputMaxResultsInteger]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListClustersInput {
    @inline
    def apply(
        maxResults: js.UndefOr[ListClustersInputMaxResultsInteger] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListClustersInput = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListClustersInput]
    }
  }

  @js.native
  trait ListClustersOutput extends js.Object {
    var clusters: js.UndefOr[ClusterList]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListClustersOutput {
    @inline
    def apply(
        clusters: js.UndefOr[ClusterList] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListClustersOutput = {
      val __obj = js.Dynamic.literal()
      clusters.foreach(__v => __obj.updateDynamic("clusters")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListClustersOutput]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: Arn
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        resourceArn: Arn
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
  trait RestoreClusterFromSnapshotInput extends js.Object {
    var clusterName: String
    var snapshotArn: String
    var kmsKeyId: js.UndefOr[String]
    var subnetIds: js.UndefOr[StringList]
    var tags: js.UndefOr[TagMap]
    var vpcSecurityGroupIds: js.UndefOr[StringList]
  }

  object RestoreClusterFromSnapshotInput {
    @inline
    def apply(
        clusterName: String,
        snapshotArn: String,
        kmsKeyId: js.UndefOr[String] = js.undefined,
        subnetIds: js.UndefOr[StringList] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined,
        vpcSecurityGroupIds: js.UndefOr[StringList] = js.undefined
    ): RestoreClusterFromSnapshotInput = {
      val __obj = js.Dynamic.literal(
        "clusterName" -> clusterName.asInstanceOf[js.Any],
        "snapshotArn" -> snapshotArn.asInstanceOf[js.Any]
      )

      kmsKeyId.foreach(__v => __obj.updateDynamic("kmsKeyId")(__v.asInstanceOf[js.Any]))
      subnetIds.foreach(__v => __obj.updateDynamic("subnetIds")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      vpcSecurityGroupIds.foreach(__v => __obj.updateDynamic("vpcSecurityGroupIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RestoreClusterFromSnapshotInput]
    }
  }

  @js.native
  trait RestoreClusterFromSnapshotOutput extends js.Object {
    var cluster: Cluster
  }

  object RestoreClusterFromSnapshotOutput {
    @inline
    def apply(
        cluster: Cluster
    ): RestoreClusterFromSnapshotOutput = {
      val __obj = js.Dynamic.literal(
        "cluster" -> cluster.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RestoreClusterFromSnapshotOutput]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: Arn
    var tags: TagMap
  }

  object TagResourceRequest {
    @inline
    def apply(
        resourceArn: Arn,
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
    var resourceArn: Arn
    var tagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        resourceArn: Arn,
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

  @js.native
  trait UpdateClusterInput extends js.Object {
    var clusterArn: String
    var adminUserPassword: js.UndefOr[Password]
    var authType: js.UndefOr[Auth]
    var clientToken: js.UndefOr[String]
    var preferredMaintenanceWindow: js.UndefOr[String]
    var shardCapacity: js.UndefOr[Int]
    var shardCount: js.UndefOr[Int]
    var subnetIds: js.UndefOr[StringList]
    var vpcSecurityGroupIds: js.UndefOr[StringList]
  }

  object UpdateClusterInput {
    @inline
    def apply(
        clusterArn: String,
        adminUserPassword: js.UndefOr[Password] = js.undefined,
        authType: js.UndefOr[Auth] = js.undefined,
        clientToken: js.UndefOr[String] = js.undefined,
        preferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
        shardCapacity: js.UndefOr[Int] = js.undefined,
        shardCount: js.UndefOr[Int] = js.undefined,
        subnetIds: js.UndefOr[StringList] = js.undefined,
        vpcSecurityGroupIds: js.UndefOr[StringList] = js.undefined
    ): UpdateClusterInput = {
      val __obj = js.Dynamic.literal(
        "clusterArn" -> clusterArn.asInstanceOf[js.Any]
      )

      adminUserPassword.foreach(__v => __obj.updateDynamic("adminUserPassword")(__v.asInstanceOf[js.Any]))
      authType.foreach(__v => __obj.updateDynamic("authType")(__v.asInstanceOf[js.Any]))
      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      preferredMaintenanceWindow.foreach(__v => __obj.updateDynamic("preferredMaintenanceWindow")(__v.asInstanceOf[js.Any]))
      shardCapacity.foreach(__v => __obj.updateDynamic("shardCapacity")(__v.asInstanceOf[js.Any]))
      shardCount.foreach(__v => __obj.updateDynamic("shardCount")(__v.asInstanceOf[js.Any]))
      subnetIds.foreach(__v => __obj.updateDynamic("subnetIds")(__v.asInstanceOf[js.Any]))
      vpcSecurityGroupIds.foreach(__v => __obj.updateDynamic("vpcSecurityGroupIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateClusterInput]
    }
  }

  @js.native
  trait UpdateClusterOutput extends js.Object {
    var cluster: Cluster
  }

  object UpdateClusterOutput {
    @inline
    def apply(
        cluster: Cluster
    ): UpdateClusterOutput = {
      val __obj = js.Dynamic.literal(
        "cluster" -> cluster.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateClusterOutput]
    }
  }
}
