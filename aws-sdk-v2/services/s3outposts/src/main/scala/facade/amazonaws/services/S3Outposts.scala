package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object s3outposts {
  type CidrBlock = String
  type CreationTime = js.Date
  type CustomerOwnedIpv4Pool = String
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
  type VpcId = String

  final class S3OutpostsOps(private val service: S3Outposts) extends AnyVal {

    @inline def createEndpointFuture(params: CreateEndpointRequest): Future[CreateEndpointResult] = service.createEndpoint(params).promise().toFuture
    @inline def deleteEndpointFuture(params: DeleteEndpointRequest): Future[js.Object] = service.deleteEndpoint(params).promise().toFuture
    @inline def listEndpointsFuture(params: ListEndpointsRequest): Future[ListEndpointsResult] = service.listEndpoints(params).promise().toFuture
    @inline def listSharedEndpointsFuture(params: ListSharedEndpointsRequest): Future[ListSharedEndpointsResult] = service.listSharedEndpoints(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/s3outposts", JSImport.Namespace, "AWS.S3Outposts")
  class S3Outposts() extends js.Object {
    def this(config: AWSConfig) = this()

    def createEndpoint(params: CreateEndpointRequest): Request[CreateEndpointResult] = js.native
    def deleteEndpoint(params: DeleteEndpointRequest): Request[js.Object] = js.native
    def listEndpoints(params: ListEndpointsRequest): Request[ListEndpointsResult] = js.native
    def listSharedEndpoints(params: ListSharedEndpointsRequest): Request[ListSharedEndpointsResult] = js.native
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
    var AccessType: js.UndefOr[EndpointAccessType]
    var CustomerOwnedIpv4Pool: js.UndefOr[CustomerOwnedIpv4Pool]
  }

  object CreateEndpointRequest {
    @inline
    def apply(
        OutpostId: OutpostId,
        SecurityGroupId: SecurityGroupId,
        SubnetId: SubnetId,
        AccessType: js.UndefOr[EndpointAccessType] = js.undefined,
        CustomerOwnedIpv4Pool: js.UndefOr[CustomerOwnedIpv4Pool] = js.undefined
    ): CreateEndpointRequest = {
      val __obj = js.Dynamic.literal(
        "OutpostId" -> OutpostId.asInstanceOf[js.Any],
        "SecurityGroupId" -> SecurityGroupId.asInstanceOf[js.Any],
        "SubnetId" -> SubnetId.asInstanceOf[js.Any]
      )

      AccessType.foreach(__v => __obj.updateDynamic("AccessType")(__v.asInstanceOf[js.Any]))
      CustomerOwnedIpv4Pool.foreach(__v => __obj.updateDynamic("CustomerOwnedIpv4Pool")(__v.asInstanceOf[js.Any]))
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

  /** Amazon S3 on Outposts Access Points simplify managing data access at scale for shared datasets in S3 on Outposts. S3 on Outposts uses endpoints to connect to Outposts buckets so that you can perform actions within your virtual private cloud (VPC). For more information, see [[https://docs.aws.amazon.com/AmazonS3/latest/userguide/WorkingWithS3Outposts.html| Accessing S3 on Outposts using VPC-only access points]] in the <i>Amazon Simple Storage Service User Guide</i>.
    */
  @js.native
  trait Endpoint extends js.Object {
    var AccessType: js.UndefOr[EndpointAccessType]
    var CidrBlock: js.UndefOr[CidrBlock]
    var CreationTime: js.UndefOr[CreationTime]
    var CustomerOwnedIpv4Pool: js.UndefOr[CustomerOwnedIpv4Pool]
    var EndpointArn: js.UndefOr[EndpointArn]
    var NetworkInterfaces: js.UndefOr[NetworkInterfaces]
    var OutpostsId: js.UndefOr[OutpostId]
    var SecurityGroupId: js.UndefOr[SecurityGroupId]
    var Status: js.UndefOr[EndpointStatus]
    var SubnetId: js.UndefOr[SubnetId]
    var VpcId: js.UndefOr[VpcId]
  }

  object Endpoint {
    @inline
    def apply(
        AccessType: js.UndefOr[EndpointAccessType] = js.undefined,
        CidrBlock: js.UndefOr[CidrBlock] = js.undefined,
        CreationTime: js.UndefOr[CreationTime] = js.undefined,
        CustomerOwnedIpv4Pool: js.UndefOr[CustomerOwnedIpv4Pool] = js.undefined,
        EndpointArn: js.UndefOr[EndpointArn] = js.undefined,
        NetworkInterfaces: js.UndefOr[NetworkInterfaces] = js.undefined,
        OutpostsId: js.UndefOr[OutpostId] = js.undefined,
        SecurityGroupId: js.UndefOr[SecurityGroupId] = js.undefined,
        Status: js.UndefOr[EndpointStatus] = js.undefined,
        SubnetId: js.UndefOr[SubnetId] = js.undefined,
        VpcId: js.UndefOr[VpcId] = js.undefined
    ): Endpoint = {
      val __obj = js.Dynamic.literal()
      AccessType.foreach(__v => __obj.updateDynamic("AccessType")(__v.asInstanceOf[js.Any]))
      CidrBlock.foreach(__v => __obj.updateDynamic("CidrBlock")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      CustomerOwnedIpv4Pool.foreach(__v => __obj.updateDynamic("CustomerOwnedIpv4Pool")(__v.asInstanceOf[js.Any]))
      EndpointArn.foreach(__v => __obj.updateDynamic("EndpointArn")(__v.asInstanceOf[js.Any]))
      NetworkInterfaces.foreach(__v => __obj.updateDynamic("NetworkInterfaces")(__v.asInstanceOf[js.Any]))
      OutpostsId.foreach(__v => __obj.updateDynamic("OutpostsId")(__v.asInstanceOf[js.Any]))
      SecurityGroupId.foreach(__v => __obj.updateDynamic("SecurityGroupId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      SubnetId.foreach(__v => __obj.updateDynamic("SubnetId")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
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

  @js.native
  trait ListSharedEndpointsRequest extends js.Object {
    var OutpostId: OutpostId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListSharedEndpointsRequest {
    @inline
    def apply(
        OutpostId: OutpostId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListSharedEndpointsRequest = {
      val __obj = js.Dynamic.literal(
        "OutpostId" -> OutpostId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSharedEndpointsRequest]
    }
  }

  @js.native
  trait ListSharedEndpointsResult extends js.Object {
    var Endpoints: js.UndefOr[Endpoints]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListSharedEndpointsResult {
    @inline
    def apply(
        Endpoints: js.UndefOr[Endpoints] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListSharedEndpointsResult = {
      val __obj = js.Dynamic.literal()
      Endpoints.foreach(__v => __obj.updateDynamic("Endpoints")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSharedEndpointsResult]
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
