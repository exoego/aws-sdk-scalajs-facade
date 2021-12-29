package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object s3outposts {
  type CidrBlock = String
  type CreationTime = js.Date
  type EndpointArn = String
  type EndpointId = String
  type Endpoints = js.Array[Endpoint]
  type MaxResults = Int
  type NetworkInterfaceId = String
  type NetworkInterfaces = js.Array[NetworkInterface]
  type NextToken = String
  type OutpostId = String
  type SecurityGroupId = String
  type SubnetId = String

  final class S3OutpostsOps(private val service: S3Outposts) extends AnyVal {

    @inline def createEndpointFuture(params: CreateEndpointRequest): Future[CreateEndpointResult] = service.createEndpoint(params).promise().toFuture
    @inline def deleteEndpointFuture(params: DeleteEndpointRequest): Future[js.Object] = service.deleteEndpoint(params).promise().toFuture
    @inline def listEndpointsFuture(params: ListEndpointsRequest): Future[ListEndpointsResult] = service.listEndpoints(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/s3outposts", JSImport.Namespace, "AWS.S3Outposts")
  class S3Outposts() extends js.Object {
    def this(config: AWSConfig) = this()

    def createEndpoint(params: CreateEndpointRequest): Request[CreateEndpointResult] = js.native
    def deleteEndpoint(params: DeleteEndpointRequest): Request[js.Object] = js.native
    def listEndpoints(params: ListEndpointsRequest): Request[ListEndpointsResult] = js.native
  }
  object S3Outposts {
    @inline implicit def toOps(service: S3Outposts): S3OutpostsOps = {
      new S3OutpostsOps(service)
    }
  }

  @js.native
  trait CreateEndpointRequest extends js.Object {
    var OutpostId: OutpostId
    var SecurityGroupId: SecurityGroupId
    var SubnetId: SubnetId
  }

  object CreateEndpointRequest {
    @inline
    def apply(
        OutpostId: OutpostId,
        SecurityGroupId: SecurityGroupId,
        SubnetId: SubnetId
    ): CreateEndpointRequest = {
      val __obj = js.Dynamic.literal(
        "OutpostId" -> OutpostId.asInstanceOf[js.Any],
        "SecurityGroupId" -> SecurityGroupId.asInstanceOf[js.Any],
        "SubnetId" -> SubnetId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateEndpointRequest]
    }
  }

  @js.native
  trait CreateEndpointResult extends js.Object {
    var EndpointArn: js.UndefOr[EndpointArn]
  }

  object CreateEndpointResult {
    @inline
    def apply(
        EndpointArn: js.UndefOr[EndpointArn] = js.undefined
    ): CreateEndpointResult = {
      val __obj = js.Dynamic.literal()
      EndpointArn.foreach(__v => __obj.updateDynamic("EndpointArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateEndpointResult]
    }
  }

  @js.native
  trait DeleteEndpointRequest extends js.Object {
    var EndpointId: EndpointId
    var OutpostId: OutpostId
  }

  object DeleteEndpointRequest {
    @inline
    def apply(
        EndpointId: EndpointId,
        OutpostId: OutpostId
    ): DeleteEndpointRequest = {
      val __obj = js.Dynamic.literal(
        "EndpointId" -> EndpointId.asInstanceOf[js.Any],
        "OutpostId" -> OutpostId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteEndpointRequest]
    }
  }

  /** S3 on Outposts access points simplify managing data access at scale for shared datasets in Amazon S3 on Outposts. S3 on Outposts uses endpoints to connect to Outposts buckets so that you can perform actions within your virtual private cloud (VPC).
    */
  @js.native
  trait Endpoint extends js.Object {
    var CidrBlock: js.UndefOr[CidrBlock]
    var CreationTime: js.UndefOr[CreationTime]
    var EndpointArn: js.UndefOr[EndpointArn]
    var NetworkInterfaces: js.UndefOr[NetworkInterfaces]
    var OutpostsId: js.UndefOr[OutpostId]
    var Status: js.UndefOr[EndpointStatus]
  }

  object Endpoint {
    @inline
    def apply(
        CidrBlock: js.UndefOr[CidrBlock] = js.undefined,
        CreationTime: js.UndefOr[CreationTime] = js.undefined,
        EndpointArn: js.UndefOr[EndpointArn] = js.undefined,
        NetworkInterfaces: js.UndefOr[NetworkInterfaces] = js.undefined,
        OutpostsId: js.UndefOr[OutpostId] = js.undefined,
        Status: js.UndefOr[EndpointStatus] = js.undefined
    ): Endpoint = {
      val __obj = js.Dynamic.literal()
      CidrBlock.foreach(__v => __obj.updateDynamic("CidrBlock")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      EndpointArn.foreach(__v => __obj.updateDynamic("EndpointArn")(__v.asInstanceOf[js.Any]))
      NetworkInterfaces.foreach(__v => __obj.updateDynamic("NetworkInterfaces")(__v.asInstanceOf[js.Any]))
      OutpostsId.foreach(__v => __obj.updateDynamic("OutpostsId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Endpoint]
    }
  }

  @js.native
  trait ListEndpointsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListEndpointsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListEndpointsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEndpointsRequest]
    }
  }

  @js.native
  trait ListEndpointsResult extends js.Object {
    var Endpoints: js.UndefOr[Endpoints]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListEndpointsResult {
    @inline
    def apply(
        Endpoints: js.UndefOr[Endpoints] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListEndpointsResult = {
      val __obj = js.Dynamic.literal()
      Endpoints.foreach(__v => __obj.updateDynamic("Endpoints")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEndpointsResult]
    }
  }

  /** The container for the network interface.
    */
  @js.native
  trait NetworkInterface extends js.Object {
    var NetworkInterfaceId: js.UndefOr[NetworkInterfaceId]
  }

  object NetworkInterface {
    @inline
    def apply(
        NetworkInterfaceId: js.UndefOr[NetworkInterfaceId] = js.undefined
    ): NetworkInterface = {
      val __obj = js.Dynamic.literal()
      NetworkInterfaceId.foreach(__v => __obj.updateDynamic("NetworkInterfaceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkInterface]
    }
  }
}
