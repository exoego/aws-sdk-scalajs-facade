package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object codestarconnections {
  type AccountId = String
  type AmazonResourceName = String
  type ConnectionArn = String
  type ConnectionList = js.Array[Connection]
  type ConnectionName = String
  type HostArn = String
  type HostList = js.Array[Host]
  type HostName = String
  type HostStatus = String
  type HostStatusMessage = String
  type MaxResults = Int
  type NextToken = String
  type SecurityGroupId = String
  type SecurityGroupIds = js.Array[SecurityGroupId]
  type SubnetId = String
  type SubnetIds = js.Array[SubnetId]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type TlsCertificate = String
  type Url = String
  type VpcId = String

  implicit final class CodeStarconnectionsOps(private val service: CodeStarconnections) extends AnyVal {

    @inline def createConnectionFuture(params: CreateConnectionInput): Future[CreateConnectionOutput] = service.createConnection(params).promise().toFuture
    @inline def createHostFuture(params: CreateHostInput): Future[CreateHostOutput] = service.createHost(params).promise().toFuture
    @inline def deleteConnectionFuture(params: DeleteConnectionInput): Future[DeleteConnectionOutput] = service.deleteConnection(params).promise().toFuture
    @inline def deleteHostFuture(params: DeleteHostInput): Future[DeleteHostOutput] = service.deleteHost(params).promise().toFuture
    @inline def getConnectionFuture(params: GetConnectionInput): Future[GetConnectionOutput] = service.getConnection(params).promise().toFuture
    @inline def getHostFuture(params: GetHostInput): Future[GetHostOutput] = service.getHost(params).promise().toFuture
    @inline def listConnectionsFuture(params: ListConnectionsInput): Future[ListConnectionsOutput] = service.listConnections(params).promise().toFuture
    @inline def listHostsFuture(params: ListHostsInput): Future[ListHostsOutput] = service.listHosts(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceInput): Future[ListTagsForResourceOutput] = service.listTagsForResource(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceInput): Future[TagResourceOutput] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceInput): Future[UntagResourceOutput] = service.untagResource(params).promise().toFuture
  }
}

package codestarconnections {
  @js.native
  @JSImport("aws-sdk", "CodeStarconnections", "AWS.CodeStarconnections")
  class CodeStarconnections() extends js.Object {
    def this(config: AWSConfig) = this()

    def createConnection(params: CreateConnectionInput): Request[CreateConnectionOutput] = js.native
    def createHost(params: CreateHostInput): Request[CreateHostOutput] = js.native
    def deleteConnection(params: DeleteConnectionInput): Request[DeleteConnectionOutput] = js.native
    def deleteHost(params: DeleteHostInput): Request[DeleteHostOutput] = js.native
    def getConnection(params: GetConnectionInput): Request[GetConnectionOutput] = js.native
    def getHost(params: GetHostInput): Request[GetHostOutput] = js.native
    def listConnections(params: ListConnectionsInput): Request[ListConnectionsOutput] = js.native
    def listHosts(params: ListHostsInput): Request[ListHostsOutput] = js.native
    def listTagsForResource(params: ListTagsForResourceInput): Request[ListTagsForResourceOutput] = js.native
    def tagResource(params: TagResourceInput): Request[TagResourceOutput] = js.native
    def untagResource(params: UntagResourceInput): Request[UntagResourceOutput] = js.native
  }

  /**
    * A resource that is used to connect third-party source providers with services like AWS CodePipeline.
    *  Note: A connection created through CloudFormation, the CLI, or the SDK is in `PENDING` status by default. You can make its status `AVAILABLE` by updating the connection in the console.
    */
  @js.native
  trait Connection extends js.Object {
    var ConnectionArn: js.UndefOr[ConnectionArn]
    var ConnectionName: js.UndefOr[ConnectionName]
    var ConnectionStatus: js.UndefOr[ConnectionStatus]
    var HostArn: js.UndefOr[HostArn]
    var OwnerAccountId: js.UndefOr[AccountId]
    var ProviderType: js.UndefOr[ProviderType]
  }

  object Connection {
    @inline
    def apply(
        ConnectionArn: js.UndefOr[ConnectionArn] = js.undefined,
        ConnectionName: js.UndefOr[ConnectionName] = js.undefined,
        ConnectionStatus: js.UndefOr[ConnectionStatus] = js.undefined,
        HostArn: js.UndefOr[HostArn] = js.undefined,
        OwnerAccountId: js.UndefOr[AccountId] = js.undefined,
        ProviderType: js.UndefOr[ProviderType] = js.undefined
    ): Connection = {
      val __obj = js.Dynamic.literal()
      ConnectionArn.foreach(__v => __obj.updateDynamic("ConnectionArn")(__v.asInstanceOf[js.Any]))
      ConnectionName.foreach(__v => __obj.updateDynamic("ConnectionName")(__v.asInstanceOf[js.Any]))
      ConnectionStatus.foreach(__v => __obj.updateDynamic("ConnectionStatus")(__v.asInstanceOf[js.Any]))
      HostArn.foreach(__v => __obj.updateDynamic("HostArn")(__v.asInstanceOf[js.Any]))
      OwnerAccountId.foreach(__v => __obj.updateDynamic("OwnerAccountId")(__v.asInstanceOf[js.Any]))
      ProviderType.foreach(__v => __obj.updateDynamic("ProviderType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Connection]
    }
  }

  @js.native
  sealed trait ConnectionStatus extends js.Any
  object ConnectionStatus {
    val PENDING = "PENDING".asInstanceOf[ConnectionStatus]
    val AVAILABLE = "AVAILABLE".asInstanceOf[ConnectionStatus]
    val ERROR = "ERROR".asInstanceOf[ConnectionStatus]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(PENDING, AVAILABLE, ERROR))
  }

  @js.native
  trait CreateConnectionInput extends js.Object {
    var ConnectionName: ConnectionName
    var HostArn: js.UndefOr[HostArn]
    var ProviderType: js.UndefOr[ProviderType]
    var Tags: js.UndefOr[TagList]
  }

  object CreateConnectionInput {
    @inline
    def apply(
        ConnectionName: ConnectionName,
        HostArn: js.UndefOr[HostArn] = js.undefined,
        ProviderType: js.UndefOr[ProviderType] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateConnectionInput = {
      val __obj = js.Dynamic.literal(
        "ConnectionName" -> ConnectionName.asInstanceOf[js.Any]
      )

      HostArn.foreach(__v => __obj.updateDynamic("HostArn")(__v.asInstanceOf[js.Any]))
      ProviderType.foreach(__v => __obj.updateDynamic("ProviderType")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateConnectionInput]
    }
  }

  @js.native
  trait CreateConnectionOutput extends js.Object {
    var ConnectionArn: ConnectionArn
    var Tags: js.UndefOr[TagList]
  }

  object CreateConnectionOutput {
    @inline
    def apply(
        ConnectionArn: ConnectionArn,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateConnectionOutput = {
      val __obj = js.Dynamic.literal(
        "ConnectionArn" -> ConnectionArn.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateConnectionOutput]
    }
  }

  @js.native
  trait CreateHostInput extends js.Object {
    var Name: HostName
    var ProviderEndpoint: Url
    var ProviderType: ProviderType
    var VpcConfiguration: js.UndefOr[VpcConfiguration]
  }

  object CreateHostInput {
    @inline
    def apply(
        Name: HostName,
        ProviderEndpoint: Url,
        ProviderType: ProviderType,
        VpcConfiguration: js.UndefOr[VpcConfiguration] = js.undefined
    ): CreateHostInput = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "ProviderEndpoint" -> ProviderEndpoint.asInstanceOf[js.Any],
        "ProviderType" -> ProviderType.asInstanceOf[js.Any]
      )

      VpcConfiguration.foreach(__v => __obj.updateDynamic("VpcConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateHostInput]
    }
  }

  @js.native
  trait CreateHostOutput extends js.Object {
    var HostArn: js.UndefOr[HostArn]
  }

  object CreateHostOutput {
    @inline
    def apply(
        HostArn: js.UndefOr[HostArn] = js.undefined
    ): CreateHostOutput = {
      val __obj = js.Dynamic.literal()
      HostArn.foreach(__v => __obj.updateDynamic("HostArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateHostOutput]
    }
  }

  @js.native
  trait DeleteConnectionInput extends js.Object {
    var ConnectionArn: ConnectionArn
  }

  object DeleteConnectionInput {
    @inline
    def apply(
        ConnectionArn: ConnectionArn
    ): DeleteConnectionInput = {
      val __obj = js.Dynamic.literal(
        "ConnectionArn" -> ConnectionArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteConnectionInput]
    }
  }

  @js.native
  trait DeleteConnectionOutput extends js.Object {}

  object DeleteConnectionOutput {
    @inline
    def apply(
    ): DeleteConnectionOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteConnectionOutput]
    }
  }

  @js.native
  trait DeleteHostInput extends js.Object {
    var HostArn: HostArn
  }

  object DeleteHostInput {
    @inline
    def apply(
        HostArn: HostArn
    ): DeleteHostInput = {
      val __obj = js.Dynamic.literal(
        "HostArn" -> HostArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteHostInput]
    }
  }

  @js.native
  trait DeleteHostOutput extends js.Object {}

  object DeleteHostOutput {
    @inline
    def apply(
    ): DeleteHostOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteHostOutput]
    }
  }

  @js.native
  trait GetConnectionInput extends js.Object {
    var ConnectionArn: ConnectionArn
  }

  object GetConnectionInput {
    @inline
    def apply(
        ConnectionArn: ConnectionArn
    ): GetConnectionInput = {
      val __obj = js.Dynamic.literal(
        "ConnectionArn" -> ConnectionArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetConnectionInput]
    }
  }

  @js.native
  trait GetConnectionOutput extends js.Object {
    var Connection: js.UndefOr[Connection]
  }

  object GetConnectionOutput {
    @inline
    def apply(
        Connection: js.UndefOr[Connection] = js.undefined
    ): GetConnectionOutput = {
      val __obj = js.Dynamic.literal()
      Connection.foreach(__v => __obj.updateDynamic("Connection")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetConnectionOutput]
    }
  }

  @js.native
  trait GetHostInput extends js.Object {
    var HostArn: HostArn
  }

  object GetHostInput {
    @inline
    def apply(
        HostArn: HostArn
    ): GetHostInput = {
      val __obj = js.Dynamic.literal(
        "HostArn" -> HostArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetHostInput]
    }
  }

  @js.native
  trait GetHostOutput extends js.Object {
    var Name: js.UndefOr[HostName]
    var ProviderEndpoint: js.UndefOr[Url]
    var ProviderType: js.UndefOr[ProviderType]
    var Status: js.UndefOr[HostStatus]
    var VpcConfiguration: js.UndefOr[VpcConfiguration]
  }

  object GetHostOutput {
    @inline
    def apply(
        Name: js.UndefOr[HostName] = js.undefined,
        ProviderEndpoint: js.UndefOr[Url] = js.undefined,
        ProviderType: js.UndefOr[ProviderType] = js.undefined,
        Status: js.UndefOr[HostStatus] = js.undefined,
        VpcConfiguration: js.UndefOr[VpcConfiguration] = js.undefined
    ): GetHostOutput = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ProviderEndpoint.foreach(__v => __obj.updateDynamic("ProviderEndpoint")(__v.asInstanceOf[js.Any]))
      ProviderType.foreach(__v => __obj.updateDynamic("ProviderType")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      VpcConfiguration.foreach(__v => __obj.updateDynamic("VpcConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetHostOutput]
    }
  }

  /**
    * A resource that represents the infrastructure where a third-party provider is installed. The host is used when you create connections to an installed third-party provider type, such as GitHub Enterprise Server. You create one host for all connections to that provider.
    *
    * '''Note:'''A host created through the CLI or the SDK is in `PENDING` status by default. You can make its status `AVAILABLE` by setting up the host in the console.
    */
  @js.native
  trait Host extends js.Object {
    var HostArn: js.UndefOr[HostArn]
    var Name: js.UndefOr[HostName]
    var ProviderEndpoint: js.UndefOr[Url]
    var ProviderType: js.UndefOr[ProviderType]
    var Status: js.UndefOr[HostStatus]
    var StatusMessage: js.UndefOr[HostStatusMessage]
    var VpcConfiguration: js.UndefOr[VpcConfiguration]
  }

  object Host {
    @inline
    def apply(
        HostArn: js.UndefOr[HostArn] = js.undefined,
        Name: js.UndefOr[HostName] = js.undefined,
        ProviderEndpoint: js.UndefOr[Url] = js.undefined,
        ProviderType: js.UndefOr[ProviderType] = js.undefined,
        Status: js.UndefOr[HostStatus] = js.undefined,
        StatusMessage: js.UndefOr[HostStatusMessage] = js.undefined,
        VpcConfiguration: js.UndefOr[VpcConfiguration] = js.undefined
    ): Host = {
      val __obj = js.Dynamic.literal()
      HostArn.foreach(__v => __obj.updateDynamic("HostArn")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ProviderEndpoint.foreach(__v => __obj.updateDynamic("ProviderEndpoint")(__v.asInstanceOf[js.Any]))
      ProviderType.foreach(__v => __obj.updateDynamic("ProviderType")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusMessage.foreach(__v => __obj.updateDynamic("StatusMessage")(__v.asInstanceOf[js.Any]))
      VpcConfiguration.foreach(__v => __obj.updateDynamic("VpcConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Host]
    }
  }

  @js.native
  trait ListConnectionsInput extends js.Object {
    var HostArnFilter: js.UndefOr[HostArn]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var ProviderTypeFilter: js.UndefOr[ProviderType]
  }

  object ListConnectionsInput {
    @inline
    def apply(
        HostArnFilter: js.UndefOr[HostArn] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ProviderTypeFilter: js.UndefOr[ProviderType] = js.undefined
    ): ListConnectionsInput = {
      val __obj = js.Dynamic.literal()
      HostArnFilter.foreach(__v => __obj.updateDynamic("HostArnFilter")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ProviderTypeFilter.foreach(__v => __obj.updateDynamic("ProviderTypeFilter")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListConnectionsInput]
    }
  }

  @js.native
  trait ListConnectionsOutput extends js.Object {
    var Connections: js.UndefOr[ConnectionList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListConnectionsOutput {
    @inline
    def apply(
        Connections: js.UndefOr[ConnectionList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListConnectionsOutput = {
      val __obj = js.Dynamic.literal()
      Connections.foreach(__v => __obj.updateDynamic("Connections")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListConnectionsOutput]
    }
  }

  @js.native
  trait ListHostsInput extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListHostsInput {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListHostsInput = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListHostsInput]
    }
  }

  @js.native
  trait ListHostsOutput extends js.Object {
    var Hosts: js.UndefOr[HostList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListHostsOutput {
    @inline
    def apply(
        Hosts: js.UndefOr[HostList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListHostsOutput = {
      val __obj = js.Dynamic.literal()
      Hosts.foreach(__v => __obj.updateDynamic("Hosts")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListHostsOutput]
    }
  }

  @js.native
  trait ListTagsForResourceInput extends js.Object {
    var ResourceArn: AmazonResourceName
  }

  object ListTagsForResourceInput {
    @inline
    def apply(
        ResourceArn: AmazonResourceName
    ): ListTagsForResourceInput = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListTagsForResourceInput]
    }
  }

  @js.native
  trait ListTagsForResourceOutput extends js.Object {
    var Tags: js.UndefOr[TagList]
  }

  object ListTagsForResourceOutput {
    @inline
    def apply(
        Tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceOutput = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceOutput]
    }
  }

  @js.native
  sealed trait ProviderType extends js.Any
  object ProviderType {
    val Bitbucket = "Bitbucket".asInstanceOf[ProviderType]
    val GitHubEnterpriseServer = "GitHubEnterpriseServer".asInstanceOf[ProviderType]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(Bitbucket, GitHubEnterpriseServer))
  }

  /**
    * A tag is a key-value pair that is used to manage the resource.
    *  This tag is available for use by AWS services that support tags.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  object Tag {
    @inline
    def apply(
        Key: TagKey,
        Value: TagValue
    ): Tag = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceInput extends js.Object {
    var ResourceArn: AmazonResourceName
    var Tags: TagList
  }

  object TagResourceInput {
    @inline
    def apply(
        ResourceArn: AmazonResourceName,
        Tags: TagList
    ): TagResourceInput = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceInput]
    }
  }

  @js.native
  trait TagResourceOutput extends js.Object {}

  object TagResourceOutput {
    @inline
    def apply(
    ): TagResourceOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[TagResourceOutput]
    }
  }

  @js.native
  trait UntagResourceInput extends js.Object {
    var ResourceArn: AmazonResourceName
    var TagKeys: TagKeyList
  }

  object UntagResourceInput {
    @inline
    def apply(
        ResourceArn: AmazonResourceName,
        TagKeys: TagKeyList
    ): UntagResourceInput = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceInput]
    }
  }

  @js.native
  trait UntagResourceOutput extends js.Object {}

  object UntagResourceOutput {
    @inline
    def apply(
    ): UntagResourceOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UntagResourceOutput]
    }
  }

  /**
    * The VPC configuration provisioned for the host.
    */
  @js.native
  trait VpcConfiguration extends js.Object {
    var SecurityGroupIds: SecurityGroupIds
    var SubnetIds: SubnetIds
    var VpcId: VpcId
    var TlsCertificate: js.UndefOr[TlsCertificate]
  }

  object VpcConfiguration {
    @inline
    def apply(
        SecurityGroupIds: SecurityGroupIds,
        SubnetIds: SubnetIds,
        VpcId: VpcId,
        TlsCertificate: js.UndefOr[TlsCertificate] = js.undefined
    ): VpcConfiguration = {
      val __obj = js.Dynamic.literal(
        "SecurityGroupIds" -> SecurityGroupIds.asInstanceOf[js.Any],
        "SubnetIds" -> SubnetIds.asInstanceOf[js.Any],
        "VpcId" -> VpcId.asInstanceOf[js.Any]
      )

      TlsCertificate.foreach(__v => __obj.updateDynamic("TlsCertificate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VpcConfiguration]
    }
  }
}
