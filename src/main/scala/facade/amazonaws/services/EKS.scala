package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object eks {
  type ClusterName                   = String
  type ClusterStatus                 = String
  type ErrorCode                     = String
  type ErrorDetails                  = js.Array[ErrorDetail]
  type ListClustersRequestMaxResults = Int
  type ListUpdatesRequestMaxResults  = Int
  type StringList                    = js.Array[String]
  type Timestamp                     = js.Date
  type UpdateParamType               = String
  type UpdateParams                  = js.Array[UpdateParam]
  type UpdateStatus                  = String
  type UpdateType                    = String
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
    def apply(data: js.UndefOr[String] = js.undefined): Certificate = {
      val _fields = IndexedSeq[(String, js.Any)]("data" -> data.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Certificate]
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
    var name: js.UndefOr[String]
    var platformVersion: js.UndefOr[String]
    var resourcesVpcConfig: js.UndefOr[VpcConfigResponse]
    var roleArn: js.UndefOr[String]
    var status: js.UndefOr[ClusterStatus]
    var version: js.UndefOr[String]
  }

  object Cluster {
    def apply(arn: js.UndefOr[String] = js.undefined,
              certificateAuthority: js.UndefOr[Certificate] = js.undefined,
              clientRequestToken: js.UndefOr[String] = js.undefined,
              createdAt: js.UndefOr[Timestamp] = js.undefined,
              endpoint: js.UndefOr[String] = js.undefined,
              name: js.UndefOr[String] = js.undefined,
              platformVersion: js.UndefOr[String] = js.undefined,
              resourcesVpcConfig: js.UndefOr[VpcConfigResponse] = js.undefined,
              roleArn: js.UndefOr[String] = js.undefined,
              status: js.UndefOr[ClusterStatus] = js.undefined,
              version: js.UndefOr[String] = js.undefined): Cluster = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "certificateAuthority" -> certificateAuthority.map { x =>
          x.asInstanceOf[js.Any]
        },
        "clientRequestToken" -> clientRequestToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "createdAt" -> createdAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "endpoint" -> endpoint.map { x =>
          x.asInstanceOf[js.Any]
        },
        "name" -> name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "platformVersion" -> platformVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "resourcesVpcConfig" -> resourcesVpcConfig.map { x =>
          x.asInstanceOf[js.Any]
        },
        "roleArn" -> roleArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "status" -> status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "version" -> version.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Cluster]
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
    var version: js.UndefOr[String]
  }

  object CreateClusterRequest {
    def apply(name: ClusterName,
              resourcesVpcConfig: VpcConfigRequest,
              roleArn: String,
              clientRequestToken: js.UndefOr[String] = js.undefined,
              version: js.UndefOr[String] = js.undefined): CreateClusterRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name"               -> name.asInstanceOf[js.Any],
        "resourcesVpcConfig" -> resourcesVpcConfig.asInstanceOf[js.Any],
        "roleArn"            -> roleArn.asInstanceOf[js.Any],
        "clientRequestToken" -> clientRequestToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "version" -> version.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateClusterRequest]
    }
  }

  @js.native
  trait CreateClusterResponse extends js.Object {
    var cluster: js.UndefOr[Cluster]
  }

  object CreateClusterResponse {
    def apply(cluster: js.UndefOr[Cluster] = js.undefined): CreateClusterResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("cluster" -> cluster.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateClusterResponse]
    }
  }

  @js.native
  trait DeleteClusterRequest extends js.Object {
    var name: String
  }

  object DeleteClusterRequest {
    def apply(name: String): DeleteClusterRequest = {
      val _fields =
        IndexedSeq[(String, js.Any)]("name" -> name.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteClusterRequest]
    }
  }

  @js.native
  trait DeleteClusterResponse extends js.Object {
    var cluster: js.UndefOr[Cluster]
  }

  object DeleteClusterResponse {
    def apply(cluster: js.UndefOr[Cluster] = js.undefined): DeleteClusterResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("cluster" -> cluster.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteClusterResponse]
    }
  }

  @js.native
  trait DescribeClusterRequest extends js.Object {
    var name: String
  }

  object DescribeClusterRequest {
    def apply(name: String): DescribeClusterRequest = {
      val _fields =
        IndexedSeq[(String, js.Any)]("name" -> name.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeClusterRequest]
    }
  }

  @js.native
  trait DescribeClusterResponse extends js.Object {
    var cluster: js.UndefOr[Cluster]
  }

  object DescribeClusterResponse {
    def apply(cluster: js.UndefOr[Cluster] = js.undefined): DescribeClusterResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("cluster" -> cluster.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeClusterResponse]
    }
  }

  @js.native
  trait DescribeUpdateRequest extends js.Object {
    var name: String
    var updateId: String
  }

  object DescribeUpdateRequest {
    def apply(name: String, updateId: String): DescribeUpdateRequest = {
      val _fields =
        IndexedSeq[(String, js.Any)]("name" -> name.asInstanceOf[js.Any], "updateId" -> updateId.asInstanceOf[js.Any])
          .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeUpdateRequest]
    }
  }

  @js.native
  trait DescribeUpdateResponse extends js.Object {
    var update: js.UndefOr[Update]
  }

  object DescribeUpdateResponse {
    def apply(update: js.UndefOr[Update] = js.undefined): DescribeUpdateResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("update" -> update.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeUpdateResponse]
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
    def apply(errorCode: js.UndefOr[ErrorCode] = js.undefined,
              errorMessage: js.UndefOr[String] = js.undefined,
              resourceIds: js.UndefOr[StringList] = js.undefined): ErrorDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "errorCode" -> errorCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "errorMessage" -> errorMessage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "resourceIds" -> resourceIds.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ErrorDetail]
    }
  }

  @js.native
  trait ListClustersRequest extends js.Object {
    var maxResults: js.UndefOr[ListClustersRequestMaxResults]
    var nextToken: js.UndefOr[String]
  }

  object ListClustersRequest {
    def apply(maxResults: js.UndefOr[ListClustersRequestMaxResults] = js.undefined,
              nextToken: js.UndefOr[String] = js.undefined): ListClustersRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("maxResults" -> maxResults.map { x =>
        x.asInstanceOf[js.Any]
      }, "nextToken" -> nextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListClustersRequest]
    }
  }

  @js.native
  trait ListClustersResponse extends js.Object {
    var clusters: js.UndefOr[StringList]
    var nextToken: js.UndefOr[String]
  }

  object ListClustersResponse {
    def apply(clusters: js.UndefOr[StringList] = js.undefined,
              nextToken: js.UndefOr[String] = js.undefined): ListClustersResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("clusters" -> clusters.map { x =>
        x.asInstanceOf[js.Any]
      }, "nextToken" -> nextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListClustersResponse]
    }
  }

  @js.native
  trait ListUpdatesRequest extends js.Object {
    var name: String
    var maxResults: js.UndefOr[ListUpdatesRequestMaxResults]
    var nextToken: js.UndefOr[String]
  }

  object ListUpdatesRequest {
    def apply(name: String,
              maxResults: js.UndefOr[ListUpdatesRequestMaxResults] = js.undefined,
              nextToken: js.UndefOr[String] = js.undefined): ListUpdatesRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("name" -> name.asInstanceOf[js.Any], "maxResults" -> maxResults.map {
        x =>
          x.asInstanceOf[js.Any]
      }, "nextToken" -> nextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListUpdatesRequest]
    }
  }

  @js.native
  trait ListUpdatesResponse extends js.Object {
    var nextToken: js.UndefOr[String]
    var updateIds: js.UndefOr[StringList]
  }

  object ListUpdatesResponse {
    def apply(nextToken: js.UndefOr[String] = js.undefined,
              updateIds: js.UndefOr[StringList] = js.undefined): ListUpdatesResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("nextToken" -> nextToken.map { x =>
        x.asInstanceOf[js.Any]
      }, "updateIds" -> updateIds.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListUpdatesResponse]
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
    def apply(createdAt: js.UndefOr[Timestamp] = js.undefined,
              errors: js.UndefOr[ErrorDetails] = js.undefined,
              id: js.UndefOr[String] = js.undefined,
              params: js.UndefOr[UpdateParams] = js.undefined,
              status: js.UndefOr[UpdateStatus] = js.undefined,
              `type`: js.UndefOr[UpdateType] = js.undefined): Update = {
      val _fields = IndexedSeq[(String, js.Any)](
        "createdAt" -> createdAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "errors" -> errors.map { x =>
          x.asInstanceOf[js.Any]
        },
        "id" -> id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "params" -> params.map { x =>
          x.asInstanceOf[js.Any]
        },
        "status" -> status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "`type`" -> `type`.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Update]
    }
  }

  @js.native
  trait UpdateClusterVersionRequest extends js.Object {
    var name: String
    var version: String
    var clientRequestToken: js.UndefOr[String]
  }

  object UpdateClusterVersionRequest {
    def apply(name: String,
              version: String,
              clientRequestToken: js.UndefOr[String] = js.undefined): UpdateClusterVersionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name"    -> name.asInstanceOf[js.Any],
        "version" -> version.asInstanceOf[js.Any],
        "clientRequestToken" -> clientRequestToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateClusterVersionRequest]
    }
  }

  @js.native
  trait UpdateClusterVersionResponse extends js.Object {
    var update: js.UndefOr[Update]
  }

  object UpdateClusterVersionResponse {
    def apply(update: js.UndefOr[Update] = js.undefined): UpdateClusterVersionResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("update" -> update.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateClusterVersionResponse]
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
    def apply(`type`: js.UndefOr[UpdateParamType] = js.undefined,
              value: js.UndefOr[String] = js.undefined): UpdateParam = {
      val _fields = IndexedSeq[(String, js.Any)]("`type`" -> `type`.map { x =>
        x.asInstanceOf[js.Any]
      }, "value" -> value.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateParam]
    }
  }

  object UpdateParamTypeEnum {
    val Version         = "Version"
    val PlatformVersion = "PlatformVersion"

    val values = IndexedSeq(Version, PlatformVersion)
  }

  object UpdateStatusEnum {
    val InProgress = "InProgress"
    val Failed     = "Failed"
    val Cancelled  = "Cancelled"
    val Successful = "Successful"

    val values = IndexedSeq(InProgress, Failed, Cancelled, Successful)
  }

  object UpdateTypeEnum {
    val VersionUpdate = "VersionUpdate"

    val values = IndexedSeq(VersionUpdate)
  }

  /**
    * An object representing an Amazon EKS cluster VPC configuration request.
    */
  @js.native
  trait VpcConfigRequest extends js.Object {
    var subnetIds: StringList
    var securityGroupIds: js.UndefOr[StringList]
  }

  object VpcConfigRequest {
    def apply(subnetIds: StringList, securityGroupIds: js.UndefOr[StringList] = js.undefined): VpcConfigRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "subnetIds" -> subnetIds.asInstanceOf[js.Any],
        "securityGroupIds" -> securityGroupIds.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VpcConfigRequest]
    }
  }

  /**
    * An object representing an Amazon EKS cluster VPC configuration response.
    */
  @js.native
  trait VpcConfigResponse extends js.Object {
    var securityGroupIds: js.UndefOr[StringList]
    var subnetIds: js.UndefOr[StringList]
    var vpcId: js.UndefOr[String]
  }

  object VpcConfigResponse {
    def apply(securityGroupIds: js.UndefOr[StringList] = js.undefined,
              subnetIds: js.UndefOr[StringList] = js.undefined,
              vpcId: js.UndefOr[String] = js.undefined): VpcConfigResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "securityGroupIds" -> securityGroupIds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "subnetIds" -> subnetIds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "vpcId" -> vpcId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VpcConfigResponse]
    }
  }
}
