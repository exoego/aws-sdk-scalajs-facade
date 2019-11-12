package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object directoryservice {
  type AccessUrl                                  = String
  type AddedDateTime                              = js.Date
  type AliasName                                  = String
  type AttributeName                              = String
  type AttributeValue                             = String
  type Attributes                                 = js.Array[Attribute]
  type AvailabilityZone                           = String
  type AvailabilityZones                          = js.Array[AvailabilityZone]
  type CidrIp                                     = String
  type CidrIps                                    = js.Array[CidrIp]
  type CloudOnlyDirectoriesLimitReached           = Boolean
  type ComputerName                               = String
  type ComputerPassword                           = String
  type ConditionalForwarders                      = js.Array[ConditionalForwarder]
  type ConnectPassword                            = String
  type ConnectedDirectoriesLimitReached           = Boolean
  type CreateSnapshotBeforeSchemaExtension        = Boolean
  type CreatedDateTime                            = js.Date
  type CustomerId                                 = String
  type CustomerUserName                           = String
  type DeleteAssociatedConditionalForwarder       = Boolean
  type Description                                = String
  type DesiredNumberOfDomainControllers           = Int
  type DirectoryDescriptions                      = js.Array[DirectoryDescription]
  type DirectoryEdition                           = String
  type DirectoryId                                = String
  type DirectoryIds                               = js.Array[DirectoryId]
  type DirectoryName                              = String
  type DirectoryShortName                         = String
  type DirectorySize                              = String
  type DirectoryStage                             = String
  type DirectoryType                              = String
  type DnsIpAddrs                                 = js.Array[IpAddr]
  type DomainControllerId                         = String
  type DomainControllerIds                        = js.Array[DomainControllerId]
  type DomainControllerStatus                     = String
  type DomainControllerStatusReason               = String
  type DomainControllers                          = js.Array[DomainController]
  type EndDateTime                                = js.Date
  type EventTopics                                = js.Array[EventTopic]
  type IpAddr                                     = String
  type IpAddrs                                    = js.Array[IpAddr]
  type IpRouteStatusMsg                           = String
  type IpRouteStatusReason                        = String
  type IpRoutes                                   = js.Array[IpRoute]
  type IpRoutesInfo                               = js.Array[IpRouteInfo]
  type LastUpdatedDateTime                        = js.Date
  type LaunchTime                                 = js.Date
  type LdifContent                                = String
  type Limit                                      = Int
  type LogGroupName                               = String
  type LogSubscriptions                           = js.Array[LogSubscription]
  type ManualSnapshotsLimitReached                = Boolean
  type NextToken                                  = String
  type Notes                                      = String
  type OrganizationalUnitDN                       = String
  type Password                                   = String
  type PortNumber                                 = Int
  type RadiusAuthenticationProtocol               = String
  type RadiusDisplayLabel                         = String
  type RadiusRetries                              = Int
  type RadiusSharedSecret                         = String
  type RadiusStatus                               = String
  type RadiusTimeout                              = Int
  type RemoteDomainName                           = String
  type RemoteDomainNames                          = js.Array[RemoteDomainName]
  type ReplicationScope                           = String
  type RequestId                                  = String
  type ResourceId                                 = String
  type SID                                        = String
  type SchemaExtensionId                          = String
  type SchemaExtensionStatus                      = String
  type SchemaExtensionStatusReason                = String
  type SchemaExtensionsInfo                       = js.Array[SchemaExtensionInfo]
  type SecurityGroupId                            = String
  type SelectiveAuth                              = String
  type Server                                     = String
  type Servers                                    = js.Array[Server]
  type ShareMethod                                = String
  type ShareStatus                                = String
  type SharedDirectories                          = js.Array[SharedDirectory]
  type SnapshotId                                 = String
  type SnapshotIds                                = js.Array[SnapshotId]
  type SnapshotName                               = String
  type SnapshotStatus                             = String
  type SnapshotType                               = String
  type Snapshots                                  = js.Array[Snapshot]
  type SsoEnabled                                 = Boolean
  type StageReason                                = String
  type StartDateTime                              = js.Date
  type StartTime                                  = js.Date
  type StateLastUpdatedDateTime                   = js.Date
  type SubnetId                                   = String
  type SubnetIds                                  = js.Array[SubnetId]
  type SubscriptionCreatedDateTime                = js.Date
  type TagKey                                     = String
  type TagKeys                                    = js.Array[TagKey]
  type TagValue                                   = String
  type Tags                                       = js.Array[Tag]
  type TargetId                                   = String
  type TargetType                                 = String
  type TopicArn                                   = String
  type TopicName                                  = String
  type TopicNames                                 = js.Array[TopicName]
  type TopicStatus                                = String
  type TrustDirection                             = String
  type TrustId                                    = String
  type TrustIds                                   = js.Array[TrustId]
  type TrustPassword                              = String
  type TrustState                                 = String
  type TrustStateReason                           = String
  type TrustType                                  = String
  type Trusts                                     = js.Array[Trust]
  type UpdateSecurityGroupForDirectoryControllers = Boolean
  type UseSameUsername                            = Boolean
  type UserName                                   = String
  type UserPassword                               = String
  type VpcId                                      = String

  implicit final class DirectoryServiceOps(private val service: DirectoryService) extends AnyVal {
    @inline def acceptSharedDirectoryFuture(params: AcceptSharedDirectoryRequest): Future[AcceptSharedDirectoryResult] =
      service.acceptSharedDirectory(params).promise.toFuture
    @inline def addIpRoutesFuture(params: AddIpRoutesRequest): Future[AddIpRoutesResult] =
      service.addIpRoutes(params).promise.toFuture
    @inline def addTagsToResourceFuture(params: AddTagsToResourceRequest): Future[AddTagsToResourceResult] =
      service.addTagsToResource(params).promise.toFuture
    @inline def cancelSchemaExtensionFuture(params: CancelSchemaExtensionRequest): Future[CancelSchemaExtensionResult] =
      service.cancelSchemaExtension(params).promise.toFuture
    @inline def connectDirectoryFuture(params: ConnectDirectoryRequest): Future[ConnectDirectoryResult] =
      service.connectDirectory(params).promise.toFuture
    @inline def createAliasFuture(params: CreateAliasRequest): Future[CreateAliasResult] =
      service.createAlias(params).promise.toFuture
    @inline def createComputerFuture(params: CreateComputerRequest): Future[CreateComputerResult] =
      service.createComputer(params).promise.toFuture
    @inline def createConditionalForwarderFuture(
        params: CreateConditionalForwarderRequest
    ): Future[CreateConditionalForwarderResult] = service.createConditionalForwarder(params).promise.toFuture
    @inline def createDirectoryFuture(params: CreateDirectoryRequest): Future[CreateDirectoryResult] =
      service.createDirectory(params).promise.toFuture
    @inline def createLogSubscriptionFuture(params: CreateLogSubscriptionRequest): Future[CreateLogSubscriptionResult] =
      service.createLogSubscription(params).promise.toFuture
    @inline def createMicrosoftADFuture(params: CreateMicrosoftADRequest): Future[CreateMicrosoftADResult] =
      service.createMicrosoftAD(params).promise.toFuture
    @inline def createSnapshotFuture(params: CreateSnapshotRequest): Future[CreateSnapshotResult] =
      service.createSnapshot(params).promise.toFuture
    @inline def createTrustFuture(params: CreateTrustRequest): Future[CreateTrustResult] =
      service.createTrust(params).promise.toFuture
    @inline def deleteConditionalForwarderFuture(
        params: DeleteConditionalForwarderRequest
    ): Future[DeleteConditionalForwarderResult] = service.deleteConditionalForwarder(params).promise.toFuture
    @inline def deleteDirectoryFuture(params: DeleteDirectoryRequest): Future[DeleteDirectoryResult] =
      service.deleteDirectory(params).promise.toFuture
    @inline def deleteLogSubscriptionFuture(params: DeleteLogSubscriptionRequest): Future[DeleteLogSubscriptionResult] =
      service.deleteLogSubscription(params).promise.toFuture
    @inline def deleteSnapshotFuture(params: DeleteSnapshotRequest): Future[DeleteSnapshotResult] =
      service.deleteSnapshot(params).promise.toFuture
    @inline def deleteTrustFuture(params: DeleteTrustRequest): Future[DeleteTrustResult] =
      service.deleteTrust(params).promise.toFuture
    @inline def deregisterEventTopicFuture(params: DeregisterEventTopicRequest): Future[DeregisterEventTopicResult] =
      service.deregisterEventTopic(params).promise.toFuture
    @inline def describeConditionalForwardersFuture(
        params: DescribeConditionalForwardersRequest
    ): Future[DescribeConditionalForwardersResult] = service.describeConditionalForwarders(params).promise.toFuture
    @inline def describeDirectoriesFuture(params: DescribeDirectoriesRequest): Future[DescribeDirectoriesResult] =
      service.describeDirectories(params).promise.toFuture
    @inline def describeDomainControllersFuture(
        params: DescribeDomainControllersRequest
    ): Future[DescribeDomainControllersResult] = service.describeDomainControllers(params).promise.toFuture
    @inline def describeEventTopicsFuture(params: DescribeEventTopicsRequest): Future[DescribeEventTopicsResult] =
      service.describeEventTopics(params).promise.toFuture
    @inline def describeSharedDirectoriesFuture(
        params: DescribeSharedDirectoriesRequest
    ): Future[DescribeSharedDirectoriesResult] = service.describeSharedDirectories(params).promise.toFuture
    @inline def describeSnapshotsFuture(params: DescribeSnapshotsRequest): Future[DescribeSnapshotsResult] =
      service.describeSnapshots(params).promise.toFuture
    @inline def describeTrustsFuture(params: DescribeTrustsRequest): Future[DescribeTrustsResult] =
      service.describeTrusts(params).promise.toFuture
    @inline def disableRadiusFuture(params: DisableRadiusRequest): Future[DisableRadiusResult] =
      service.disableRadius(params).promise.toFuture
    @inline def disableSsoFuture(params: DisableSsoRequest): Future[DisableSsoResult] =
      service.disableSso(params).promise.toFuture
    @inline def enableRadiusFuture(params: EnableRadiusRequest): Future[EnableRadiusResult] =
      service.enableRadius(params).promise.toFuture
    @inline def enableSsoFuture(params: EnableSsoRequest): Future[EnableSsoResult] =
      service.enableSso(params).promise.toFuture
    @inline def getDirectoryLimitsFuture(params: GetDirectoryLimitsRequest): Future[GetDirectoryLimitsResult] =
      service.getDirectoryLimits(params).promise.toFuture
    @inline def getSnapshotLimitsFuture(params: GetSnapshotLimitsRequest): Future[GetSnapshotLimitsResult] =
      service.getSnapshotLimits(params).promise.toFuture
    @inline def listIpRoutesFuture(params: ListIpRoutesRequest): Future[ListIpRoutesResult] =
      service.listIpRoutes(params).promise.toFuture
    @inline def listLogSubscriptionsFuture(params: ListLogSubscriptionsRequest): Future[ListLogSubscriptionsResult] =
      service.listLogSubscriptions(params).promise.toFuture
    @inline def listSchemaExtensionsFuture(params: ListSchemaExtensionsRequest): Future[ListSchemaExtensionsResult] =
      service.listSchemaExtensions(params).promise.toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResult] =
      service.listTagsForResource(params).promise.toFuture
    @inline def registerEventTopicFuture(params: RegisterEventTopicRequest): Future[RegisterEventTopicResult] =
      service.registerEventTopic(params).promise.toFuture
    @inline def rejectSharedDirectoryFuture(params: RejectSharedDirectoryRequest): Future[RejectSharedDirectoryResult] =
      service.rejectSharedDirectory(params).promise.toFuture
    @inline def removeIpRoutesFuture(params: RemoveIpRoutesRequest): Future[RemoveIpRoutesResult] =
      service.removeIpRoutes(params).promise.toFuture
    @inline def removeTagsFromResourceFuture(
        params: RemoveTagsFromResourceRequest
    ): Future[RemoveTagsFromResourceResult] = service.removeTagsFromResource(params).promise.toFuture
    @inline def resetUserPasswordFuture(params: ResetUserPasswordRequest): Future[ResetUserPasswordResult] =
      service.resetUserPassword(params).promise.toFuture
    @inline def restoreFromSnapshotFuture(params: RestoreFromSnapshotRequest): Future[RestoreFromSnapshotResult] =
      service.restoreFromSnapshot(params).promise.toFuture
    @inline def shareDirectoryFuture(params: ShareDirectoryRequest): Future[ShareDirectoryResult] =
      service.shareDirectory(params).promise.toFuture
    @inline def startSchemaExtensionFuture(params: StartSchemaExtensionRequest): Future[StartSchemaExtensionResult] =
      service.startSchemaExtension(params).promise.toFuture
    @inline def unshareDirectoryFuture(params: UnshareDirectoryRequest): Future[UnshareDirectoryResult] =
      service.unshareDirectory(params).promise.toFuture
    @inline def updateConditionalForwarderFuture(
        params: UpdateConditionalForwarderRequest
    ): Future[UpdateConditionalForwarderResult] = service.updateConditionalForwarder(params).promise.toFuture
    @inline def updateNumberOfDomainControllersFuture(
        params: UpdateNumberOfDomainControllersRequest
    ): Future[UpdateNumberOfDomainControllersResult] = service.updateNumberOfDomainControllers(params).promise.toFuture
    @inline def updateRadiusFuture(params: UpdateRadiusRequest): Future[UpdateRadiusResult] =
      service.updateRadius(params).promise.toFuture
    @inline def updateTrustFuture(params: UpdateTrustRequest): Future[UpdateTrustResult] =
      service.updateTrust(params).promise.toFuture
    @inline def verifyTrustFuture(params: VerifyTrustRequest): Future[VerifyTrustResult] =
      service.verifyTrust(params).promise.toFuture
  }
}

package directoryservice {
  @js.native
  @JSImport("aws-sdk", "DirectoryService")
  class DirectoryService() extends js.Object {
    def this(config: AWSConfig) = this()

    def acceptSharedDirectory(params: AcceptSharedDirectoryRequest): Request[AcceptSharedDirectoryResult] = js.native
    def addIpRoutes(params: AddIpRoutesRequest): Request[AddIpRoutesResult]                               = js.native
    def addTagsToResource(params: AddTagsToResourceRequest): Request[AddTagsToResourceResult]             = js.native
    def cancelSchemaExtension(params: CancelSchemaExtensionRequest): Request[CancelSchemaExtensionResult] = js.native
    def connectDirectory(params: ConnectDirectoryRequest): Request[ConnectDirectoryResult]                = js.native
    def createAlias(params: CreateAliasRequest): Request[CreateAliasResult]                               = js.native
    def createComputer(params: CreateComputerRequest): Request[CreateComputerResult]                      = js.native
    def createConditionalForwarder(
        params: CreateConditionalForwarderRequest
    ): Request[CreateConditionalForwarderResult]                                                          = js.native
    def createDirectory(params: CreateDirectoryRequest): Request[CreateDirectoryResult]                   = js.native
    def createLogSubscription(params: CreateLogSubscriptionRequest): Request[CreateLogSubscriptionResult] = js.native
    def createMicrosoftAD(params: CreateMicrosoftADRequest): Request[CreateMicrosoftADResult]             = js.native
    def createSnapshot(params: CreateSnapshotRequest): Request[CreateSnapshotResult]                      = js.native
    def createTrust(params: CreateTrustRequest): Request[CreateTrustResult]                               = js.native
    def deleteConditionalForwarder(
        params: DeleteConditionalForwarderRequest
    ): Request[DeleteConditionalForwarderResult]                                                          = js.native
    def deleteDirectory(params: DeleteDirectoryRequest): Request[DeleteDirectoryResult]                   = js.native
    def deleteLogSubscription(params: DeleteLogSubscriptionRequest): Request[DeleteLogSubscriptionResult] = js.native
    def deleteSnapshot(params: DeleteSnapshotRequest): Request[DeleteSnapshotResult]                      = js.native
    def deleteTrust(params: DeleteTrustRequest): Request[DeleteTrustResult]                               = js.native
    def deregisterEventTopic(params: DeregisterEventTopicRequest): Request[DeregisterEventTopicResult]    = js.native
    def describeConditionalForwarders(
        params: DescribeConditionalForwardersRequest
    ): Request[DescribeConditionalForwardersResult]                                                 = js.native
    def describeDirectories(params: DescribeDirectoriesRequest): Request[DescribeDirectoriesResult] = js.native
    def describeDomainControllers(params: DescribeDomainControllersRequest): Request[DescribeDomainControllersResult] =
      js.native
    def describeEventTopics(params: DescribeEventTopicsRequest): Request[DescribeEventTopicsResult] = js.native
    def describeSharedDirectories(params: DescribeSharedDirectoriesRequest): Request[DescribeSharedDirectoriesResult] =
      js.native
    def describeSnapshots(params: DescribeSnapshotsRequest): Request[DescribeSnapshotsResult]                = js.native
    def describeTrusts(params: DescribeTrustsRequest): Request[DescribeTrustsResult]                         = js.native
    def disableRadius(params: DisableRadiusRequest): Request[DisableRadiusResult]                            = js.native
    def disableSso(params: DisableSsoRequest): Request[DisableSsoResult]                                     = js.native
    def enableRadius(params: EnableRadiusRequest): Request[EnableRadiusResult]                               = js.native
    def enableSso(params: EnableSsoRequest): Request[EnableSsoResult]                                        = js.native
    def getDirectoryLimits(params: GetDirectoryLimitsRequest): Request[GetDirectoryLimitsResult]             = js.native
    def getSnapshotLimits(params: GetSnapshotLimitsRequest): Request[GetSnapshotLimitsResult]                = js.native
    def listIpRoutes(params: ListIpRoutesRequest): Request[ListIpRoutesResult]                               = js.native
    def listLogSubscriptions(params: ListLogSubscriptionsRequest): Request[ListLogSubscriptionsResult]       = js.native
    def listSchemaExtensions(params: ListSchemaExtensionsRequest): Request[ListSchemaExtensionsResult]       = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResult]          = js.native
    def registerEventTopic(params: RegisterEventTopicRequest): Request[RegisterEventTopicResult]             = js.native
    def rejectSharedDirectory(params: RejectSharedDirectoryRequest): Request[RejectSharedDirectoryResult]    = js.native
    def removeIpRoutes(params: RemoveIpRoutesRequest): Request[RemoveIpRoutesResult]                         = js.native
    def removeTagsFromResource(params: RemoveTagsFromResourceRequest): Request[RemoveTagsFromResourceResult] = js.native
    def resetUserPassword(params: ResetUserPasswordRequest): Request[ResetUserPasswordResult]                = js.native
    def restoreFromSnapshot(params: RestoreFromSnapshotRequest): Request[RestoreFromSnapshotResult]          = js.native
    def shareDirectory(params: ShareDirectoryRequest): Request[ShareDirectoryResult]                         = js.native
    def startSchemaExtension(params: StartSchemaExtensionRequest): Request[StartSchemaExtensionResult]       = js.native
    def unshareDirectory(params: UnshareDirectoryRequest): Request[UnshareDirectoryResult]                   = js.native
    def updateConditionalForwarder(
        params: UpdateConditionalForwarderRequest
    ): Request[UpdateConditionalForwarderResult] = js.native
    def updateNumberOfDomainControllers(
        params: UpdateNumberOfDomainControllersRequest
    ): Request[UpdateNumberOfDomainControllersResult]                          = js.native
    def updateRadius(params: UpdateRadiusRequest): Request[UpdateRadiusResult] = js.native
    def updateTrust(params: UpdateTrustRequest): Request[UpdateTrustResult]    = js.native
    def verifyTrust(params: VerifyTrustRequest): Request[VerifyTrustResult]    = js.native
  }

  @js.native
  trait AcceptSharedDirectoryRequest extends js.Object {
    var SharedDirectoryId: DirectoryId
  }

  object AcceptSharedDirectoryRequest {
    @inline
    def apply(
        SharedDirectoryId: DirectoryId
    ): AcceptSharedDirectoryRequest = {
      val __obj = js.Dynamic.literal(
        "SharedDirectoryId" -> SharedDirectoryId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AcceptSharedDirectoryRequest]
    }
  }

  @js.native
  trait AcceptSharedDirectoryResult extends js.Object {
    var SharedDirectory: js.UndefOr[SharedDirectory]
  }

  object AcceptSharedDirectoryResult {
    @inline
    def apply(
        SharedDirectory: js.UndefOr[SharedDirectory] = js.undefined
    ): AcceptSharedDirectoryResult = {
      val __obj = js.Dynamic.literal()
      SharedDirectory.foreach(__v => __obj.updateDynamic("SharedDirectory")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AcceptSharedDirectoryResult]
    }
  }

  @js.native
  trait AddIpRoutesRequest extends js.Object {
    var DirectoryId: DirectoryId
    var IpRoutes: IpRoutes
    var UpdateSecurityGroupForDirectoryControllers: js.UndefOr[UpdateSecurityGroupForDirectoryControllers]
  }

  object AddIpRoutesRequest {
    @inline
    def apply(
        DirectoryId: DirectoryId,
        IpRoutes: IpRoutes,
        UpdateSecurityGroupForDirectoryControllers: js.UndefOr[UpdateSecurityGroupForDirectoryControllers] =
          js.undefined
    ): AddIpRoutesRequest = {
      val __obj = js.Dynamic.literal(
        "DirectoryId" -> DirectoryId.asInstanceOf[js.Any],
        "IpRoutes"    -> IpRoutes.asInstanceOf[js.Any]
      )

      UpdateSecurityGroupForDirectoryControllers.foreach(
        __v => __obj.updateDynamic("UpdateSecurityGroupForDirectoryControllers")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[AddIpRoutesRequest]
    }
  }

  @js.native
  trait AddIpRoutesResult extends js.Object {}

  object AddIpRoutesResult {
    @inline
    def apply(
        ): AddIpRoutesResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[AddIpRoutesResult]
    }
  }

  @js.native
  trait AddTagsToResourceRequest extends js.Object {
    var ResourceId: ResourceId
    var Tags: Tags
  }

  object AddTagsToResourceRequest {
    @inline
    def apply(
        ResourceId: ResourceId,
        Tags: Tags
    ): AddTagsToResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "Tags"       -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AddTagsToResourceRequest]
    }
  }

  @js.native
  trait AddTagsToResourceResult extends js.Object {}

  object AddTagsToResourceResult {
    @inline
    def apply(
        ): AddTagsToResourceResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[AddTagsToResourceResult]
    }
  }

  /**
    * Represents a named directory attribute.
    */
  @js.native
  trait Attribute extends js.Object {
    var Name: js.UndefOr[AttributeName]
    var Value: js.UndefOr[AttributeValue]
  }

  object Attribute {
    @inline
    def apply(
        Name: js.UndefOr[AttributeName] = js.undefined,
        Value: js.UndefOr[AttributeValue] = js.undefined
    ): Attribute = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Attribute]
    }
  }

  @js.native
  trait CancelSchemaExtensionRequest extends js.Object {
    var DirectoryId: DirectoryId
    var SchemaExtensionId: SchemaExtensionId
  }

  object CancelSchemaExtensionRequest {
    @inline
    def apply(
        DirectoryId: DirectoryId,
        SchemaExtensionId: SchemaExtensionId
    ): CancelSchemaExtensionRequest = {
      val __obj = js.Dynamic.literal(
        "DirectoryId"       -> DirectoryId.asInstanceOf[js.Any],
        "SchemaExtensionId" -> SchemaExtensionId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CancelSchemaExtensionRequest]
    }
  }

  @js.native
  trait CancelSchemaExtensionResult extends js.Object {}

  object CancelSchemaExtensionResult {
    @inline
    def apply(
        ): CancelSchemaExtensionResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[CancelSchemaExtensionResult]
    }
  }

  /**
    * Contains information about a computer account in a directory.
    */
  @js.native
  trait Computer extends js.Object {
    var ComputerAttributes: js.UndefOr[Attributes]
    var ComputerId: js.UndefOr[SID]
    var ComputerName: js.UndefOr[ComputerName]
  }

  object Computer {
    @inline
    def apply(
        ComputerAttributes: js.UndefOr[Attributes] = js.undefined,
        ComputerId: js.UndefOr[SID] = js.undefined,
        ComputerName: js.UndefOr[ComputerName] = js.undefined
    ): Computer = {
      val __obj = js.Dynamic.literal()
      ComputerAttributes.foreach(__v => __obj.updateDynamic("ComputerAttributes")(__v.asInstanceOf[js.Any]))
      ComputerId.foreach(__v => __obj.updateDynamic("ComputerId")(__v.asInstanceOf[js.Any]))
      ComputerName.foreach(__v => __obj.updateDynamic("ComputerName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Computer]
    }
  }

  /**
    * Points to a remote domain with which you are setting up a trust relationship. Conditional forwarders are required in order to set up a trust relationship with another domain.
    */
  @js.native
  trait ConditionalForwarder extends js.Object {
    var DnsIpAddrs: js.UndefOr[DnsIpAddrs]
    var RemoteDomainName: js.UndefOr[RemoteDomainName]
    var ReplicationScope: js.UndefOr[ReplicationScope]
  }

  object ConditionalForwarder {
    @inline
    def apply(
        DnsIpAddrs: js.UndefOr[DnsIpAddrs] = js.undefined,
        RemoteDomainName: js.UndefOr[RemoteDomainName] = js.undefined,
        ReplicationScope: js.UndefOr[ReplicationScope] = js.undefined
    ): ConditionalForwarder = {
      val __obj = js.Dynamic.literal()
      DnsIpAddrs.foreach(__v => __obj.updateDynamic("DnsIpAddrs")(__v.asInstanceOf[js.Any]))
      RemoteDomainName.foreach(__v => __obj.updateDynamic("RemoteDomainName")(__v.asInstanceOf[js.Any]))
      ReplicationScope.foreach(__v => __obj.updateDynamic("ReplicationScope")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConditionalForwarder]
    }
  }

  /**
    * Contains the inputs for the <a>ConnectDirectory</a> operation.
    */
  @js.native
  trait ConnectDirectoryRequest extends js.Object {
    var ConnectSettings: DirectoryConnectSettings
    var Name: DirectoryName
    var Password: ConnectPassword
    var Size: DirectorySize
    var Description: js.UndefOr[Description]
    var ShortName: js.UndefOr[DirectoryShortName]
    var Tags: js.UndefOr[Tags]
  }

  object ConnectDirectoryRequest {
    @inline
    def apply(
        ConnectSettings: DirectoryConnectSettings,
        Name: DirectoryName,
        Password: ConnectPassword,
        Size: DirectorySize,
        Description: js.UndefOr[Description] = js.undefined,
        ShortName: js.UndefOr[DirectoryShortName] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): ConnectDirectoryRequest = {
      val __obj = js.Dynamic.literal(
        "ConnectSettings" -> ConnectSettings.asInstanceOf[js.Any],
        "Name"            -> Name.asInstanceOf[js.Any],
        "Password"        -> Password.asInstanceOf[js.Any],
        "Size"            -> Size.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      ShortName.foreach(__v => __obj.updateDynamic("ShortName")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConnectDirectoryRequest]
    }
  }

  /**
    * Contains the results of the <a>ConnectDirectory</a> operation.
    */
  @js.native
  trait ConnectDirectoryResult extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
  }

  object ConnectDirectoryResult {
    @inline
    def apply(
        DirectoryId: js.UndefOr[DirectoryId] = js.undefined
    ): ConnectDirectoryResult = {
      val __obj = js.Dynamic.literal()
      DirectoryId.foreach(__v => __obj.updateDynamic("DirectoryId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConnectDirectoryResult]
    }
  }

  /**
    * Contains the inputs for the <a>CreateAlias</a> operation.
    */
  @js.native
  trait CreateAliasRequest extends js.Object {
    var Alias: AliasName
    var DirectoryId: DirectoryId
  }

  object CreateAliasRequest {
    @inline
    def apply(
        Alias: AliasName,
        DirectoryId: DirectoryId
    ): CreateAliasRequest = {
      val __obj = js.Dynamic.literal(
        "Alias"       -> Alias.asInstanceOf[js.Any],
        "DirectoryId" -> DirectoryId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateAliasRequest]
    }
  }

  /**
    * Contains the results of the <a>CreateAlias</a> operation.
    */
  @js.native
  trait CreateAliasResult extends js.Object {
    var Alias: js.UndefOr[AliasName]
    var DirectoryId: js.UndefOr[DirectoryId]
  }

  object CreateAliasResult {
    @inline
    def apply(
        Alias: js.UndefOr[AliasName] = js.undefined,
        DirectoryId: js.UndefOr[DirectoryId] = js.undefined
    ): CreateAliasResult = {
      val __obj = js.Dynamic.literal()
      Alias.foreach(__v => __obj.updateDynamic("Alias")(__v.asInstanceOf[js.Any]))
      DirectoryId.foreach(__v => __obj.updateDynamic("DirectoryId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAliasResult]
    }
  }

  /**
    * Contains the inputs for the <a>CreateComputer</a> operation.
    */
  @js.native
  trait CreateComputerRequest extends js.Object {
    var ComputerName: ComputerName
    var DirectoryId: DirectoryId
    var Password: ComputerPassword
    var ComputerAttributes: js.UndefOr[Attributes]
    var OrganizationalUnitDistinguishedName: js.UndefOr[OrganizationalUnitDN]
  }

  object CreateComputerRequest {
    @inline
    def apply(
        ComputerName: ComputerName,
        DirectoryId: DirectoryId,
        Password: ComputerPassword,
        ComputerAttributes: js.UndefOr[Attributes] = js.undefined,
        OrganizationalUnitDistinguishedName: js.UndefOr[OrganizationalUnitDN] = js.undefined
    ): CreateComputerRequest = {
      val __obj = js.Dynamic.literal(
        "ComputerName" -> ComputerName.asInstanceOf[js.Any],
        "DirectoryId"  -> DirectoryId.asInstanceOf[js.Any],
        "Password"     -> Password.asInstanceOf[js.Any]
      )

      ComputerAttributes.foreach(__v => __obj.updateDynamic("ComputerAttributes")(__v.asInstanceOf[js.Any]))
      OrganizationalUnitDistinguishedName.foreach(
        __v => __obj.updateDynamic("OrganizationalUnitDistinguishedName")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[CreateComputerRequest]
    }
  }

  /**
    * Contains the results for the <a>CreateComputer</a> operation.
    */
  @js.native
  trait CreateComputerResult extends js.Object {
    var Computer: js.UndefOr[Computer]
  }

  object CreateComputerResult {
    @inline
    def apply(
        Computer: js.UndefOr[Computer] = js.undefined
    ): CreateComputerResult = {
      val __obj = js.Dynamic.literal()
      Computer.foreach(__v => __obj.updateDynamic("Computer")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateComputerResult]
    }
  }

  /**
    * Initiates the creation of a conditional forwarder for your AWS Directory Service for Microsoft Active Directory. Conditional forwarders are required in order to set up a trust relationship with another domain.
    */
  @js.native
  trait CreateConditionalForwarderRequest extends js.Object {
    var DirectoryId: DirectoryId
    var DnsIpAddrs: DnsIpAddrs
    var RemoteDomainName: RemoteDomainName
  }

  object CreateConditionalForwarderRequest {
    @inline
    def apply(
        DirectoryId: DirectoryId,
        DnsIpAddrs: DnsIpAddrs,
        RemoteDomainName: RemoteDomainName
    ): CreateConditionalForwarderRequest = {
      val __obj = js.Dynamic.literal(
        "DirectoryId"      -> DirectoryId.asInstanceOf[js.Any],
        "DnsIpAddrs"       -> DnsIpAddrs.asInstanceOf[js.Any],
        "RemoteDomainName" -> RemoteDomainName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateConditionalForwarderRequest]
    }
  }

  /**
    * The result of a CreateConditinalForwarder request.
    */
  @js.native
  trait CreateConditionalForwarderResult extends js.Object {}

  object CreateConditionalForwarderResult {
    @inline
    def apply(
        ): CreateConditionalForwarderResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[CreateConditionalForwarderResult]
    }
  }

  /**
    * Contains the inputs for the <a>CreateDirectory</a> operation.
    */
  @js.native
  trait CreateDirectoryRequest extends js.Object {
    var Name: DirectoryName
    var Password: Password
    var Size: DirectorySize
    var Description: js.UndefOr[Description]
    var ShortName: js.UndefOr[DirectoryShortName]
    var Tags: js.UndefOr[Tags]
    var VpcSettings: js.UndefOr[DirectoryVpcSettings]
  }

  object CreateDirectoryRequest {
    @inline
    def apply(
        Name: DirectoryName,
        Password: Password,
        Size: DirectorySize,
        Description: js.UndefOr[Description] = js.undefined,
        ShortName: js.UndefOr[DirectoryShortName] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        VpcSettings: js.UndefOr[DirectoryVpcSettings] = js.undefined
    ): CreateDirectoryRequest = {
      val __obj = js.Dynamic.literal(
        "Name"     -> Name.asInstanceOf[js.Any],
        "Password" -> Password.asInstanceOf[js.Any],
        "Size"     -> Size.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      ShortName.foreach(__v => __obj.updateDynamic("ShortName")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      VpcSettings.foreach(__v => __obj.updateDynamic("VpcSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDirectoryRequest]
    }
  }

  /**
    * Contains the results of the <a>CreateDirectory</a> operation.
    */
  @js.native
  trait CreateDirectoryResult extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
  }

  object CreateDirectoryResult {
    @inline
    def apply(
        DirectoryId: js.UndefOr[DirectoryId] = js.undefined
    ): CreateDirectoryResult = {
      val __obj = js.Dynamic.literal()
      DirectoryId.foreach(__v => __obj.updateDynamic("DirectoryId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDirectoryResult]
    }
  }

  @js.native
  trait CreateLogSubscriptionRequest extends js.Object {
    var DirectoryId: DirectoryId
    var LogGroupName: LogGroupName
  }

  object CreateLogSubscriptionRequest {
    @inline
    def apply(
        DirectoryId: DirectoryId,
        LogGroupName: LogGroupName
    ): CreateLogSubscriptionRequest = {
      val __obj = js.Dynamic.literal(
        "DirectoryId"  -> DirectoryId.asInstanceOf[js.Any],
        "LogGroupName" -> LogGroupName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateLogSubscriptionRequest]
    }
  }

  @js.native
  trait CreateLogSubscriptionResult extends js.Object {}

  object CreateLogSubscriptionResult {
    @inline
    def apply(
        ): CreateLogSubscriptionResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[CreateLogSubscriptionResult]
    }
  }

  /**
    * Creates an AWS Managed Microsoft AD directory.
    */
  @js.native
  trait CreateMicrosoftADRequest extends js.Object {
    var Name: DirectoryName
    var Password: Password
    var VpcSettings: DirectoryVpcSettings
    var Description: js.UndefOr[Description]
    var Edition: js.UndefOr[DirectoryEdition]
    var ShortName: js.UndefOr[DirectoryShortName]
    var Tags: js.UndefOr[Tags]
  }

  object CreateMicrosoftADRequest {
    @inline
    def apply(
        Name: DirectoryName,
        Password: Password,
        VpcSettings: DirectoryVpcSettings,
        Description: js.UndefOr[Description] = js.undefined,
        Edition: js.UndefOr[DirectoryEdition] = js.undefined,
        ShortName: js.UndefOr[DirectoryShortName] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateMicrosoftADRequest = {
      val __obj = js.Dynamic.literal(
        "Name"        -> Name.asInstanceOf[js.Any],
        "Password"    -> Password.asInstanceOf[js.Any],
        "VpcSettings" -> VpcSettings.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Edition.foreach(__v => __obj.updateDynamic("Edition")(__v.asInstanceOf[js.Any]))
      ShortName.foreach(__v => __obj.updateDynamic("ShortName")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateMicrosoftADRequest]
    }
  }

  /**
    * Result of a CreateMicrosoftAD request.
    */
  @js.native
  trait CreateMicrosoftADResult extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
  }

  object CreateMicrosoftADResult {
    @inline
    def apply(
        DirectoryId: js.UndefOr[DirectoryId] = js.undefined
    ): CreateMicrosoftADResult = {
      val __obj = js.Dynamic.literal()
      DirectoryId.foreach(__v => __obj.updateDynamic("DirectoryId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateMicrosoftADResult]
    }
  }

  /**
    * Contains the inputs for the <a>CreateSnapshot</a> operation.
    */
  @js.native
  trait CreateSnapshotRequest extends js.Object {
    var DirectoryId: DirectoryId
    var Name: js.UndefOr[SnapshotName]
  }

  object CreateSnapshotRequest {
    @inline
    def apply(
        DirectoryId: DirectoryId,
        Name: js.UndefOr[SnapshotName] = js.undefined
    ): CreateSnapshotRequest = {
      val __obj = js.Dynamic.literal(
        "DirectoryId" -> DirectoryId.asInstanceOf[js.Any]
      )

      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSnapshotRequest]
    }
  }

  /**
    * Contains the results of the <a>CreateSnapshot</a> operation.
    */
  @js.native
  trait CreateSnapshotResult extends js.Object {
    var SnapshotId: js.UndefOr[SnapshotId]
  }

  object CreateSnapshotResult {
    @inline
    def apply(
        SnapshotId: js.UndefOr[SnapshotId] = js.undefined
    ): CreateSnapshotResult = {
      val __obj = js.Dynamic.literal()
      SnapshotId.foreach(__v => __obj.updateDynamic("SnapshotId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSnapshotResult]
    }
  }

  /**
    * AWS Directory Service for Microsoft Active Directory allows you to configure trust relationships. For example, you can establish a trust between your AWS Managed Microsoft AD directory, and your existing on-premises Microsoft Active Directory. This would allow you to provide users and groups access to resources in either domain, with a single set of credentials.
    *  This action initiates the creation of the AWS side of a trust relationship between an AWS Managed Microsoft AD directory and an external domain.
    */
  @js.native
  trait CreateTrustRequest extends js.Object {
    var DirectoryId: DirectoryId
    var RemoteDomainName: RemoteDomainName
    var TrustDirection: TrustDirection
    var TrustPassword: TrustPassword
    var ConditionalForwarderIpAddrs: js.UndefOr[DnsIpAddrs]
    var SelectiveAuth: js.UndefOr[SelectiveAuth]
    var TrustType: js.UndefOr[TrustType]
  }

  object CreateTrustRequest {
    @inline
    def apply(
        DirectoryId: DirectoryId,
        RemoteDomainName: RemoteDomainName,
        TrustDirection: TrustDirection,
        TrustPassword: TrustPassword,
        ConditionalForwarderIpAddrs: js.UndefOr[DnsIpAddrs] = js.undefined,
        SelectiveAuth: js.UndefOr[SelectiveAuth] = js.undefined,
        TrustType: js.UndefOr[TrustType] = js.undefined
    ): CreateTrustRequest = {
      val __obj = js.Dynamic.literal(
        "DirectoryId"      -> DirectoryId.asInstanceOf[js.Any],
        "RemoteDomainName" -> RemoteDomainName.asInstanceOf[js.Any],
        "TrustDirection"   -> TrustDirection.asInstanceOf[js.Any],
        "TrustPassword"    -> TrustPassword.asInstanceOf[js.Any]
      )

      ConditionalForwarderIpAddrs.foreach(
        __v => __obj.updateDynamic("ConditionalForwarderIpAddrs")(__v.asInstanceOf[js.Any])
      )
      SelectiveAuth.foreach(__v => __obj.updateDynamic("SelectiveAuth")(__v.asInstanceOf[js.Any]))
      TrustType.foreach(__v => __obj.updateDynamic("TrustType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTrustRequest]
    }
  }

  /**
    * The result of a CreateTrust request.
    */
  @js.native
  trait CreateTrustResult extends js.Object {
    var TrustId: js.UndefOr[TrustId]
  }

  object CreateTrustResult {
    @inline
    def apply(
        TrustId: js.UndefOr[TrustId] = js.undefined
    ): CreateTrustResult = {
      val __obj = js.Dynamic.literal()
      TrustId.foreach(__v => __obj.updateDynamic("TrustId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTrustResult]
    }
  }

  /**
    * Deletes a conditional forwarder.
    */
  @js.native
  trait DeleteConditionalForwarderRequest extends js.Object {
    var DirectoryId: DirectoryId
    var RemoteDomainName: RemoteDomainName
  }

  object DeleteConditionalForwarderRequest {
    @inline
    def apply(
        DirectoryId: DirectoryId,
        RemoteDomainName: RemoteDomainName
    ): DeleteConditionalForwarderRequest = {
      val __obj = js.Dynamic.literal(
        "DirectoryId"      -> DirectoryId.asInstanceOf[js.Any],
        "RemoteDomainName" -> RemoteDomainName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteConditionalForwarderRequest]
    }
  }

  /**
    * The result of a DeleteConditionalForwarder request.
    */
  @js.native
  trait DeleteConditionalForwarderResult extends js.Object {}

  object DeleteConditionalForwarderResult {
    @inline
    def apply(
        ): DeleteConditionalForwarderResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteConditionalForwarderResult]
    }
  }

  /**
    * Contains the inputs for the <a>DeleteDirectory</a> operation.
    */
  @js.native
  trait DeleteDirectoryRequest extends js.Object {
    var DirectoryId: DirectoryId
  }

  object DeleteDirectoryRequest {
    @inline
    def apply(
        DirectoryId: DirectoryId
    ): DeleteDirectoryRequest = {
      val __obj = js.Dynamic.literal(
        "DirectoryId" -> DirectoryId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteDirectoryRequest]
    }
  }

  /**
    * Contains the results of the <a>DeleteDirectory</a> operation.
    */
  @js.native
  trait DeleteDirectoryResult extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
  }

  object DeleteDirectoryResult {
    @inline
    def apply(
        DirectoryId: js.UndefOr[DirectoryId] = js.undefined
    ): DeleteDirectoryResult = {
      val __obj = js.Dynamic.literal()
      DirectoryId.foreach(__v => __obj.updateDynamic("DirectoryId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteDirectoryResult]
    }
  }

  @js.native
  trait DeleteLogSubscriptionRequest extends js.Object {
    var DirectoryId: DirectoryId
  }

  object DeleteLogSubscriptionRequest {
    @inline
    def apply(
        DirectoryId: DirectoryId
    ): DeleteLogSubscriptionRequest = {
      val __obj = js.Dynamic.literal(
        "DirectoryId" -> DirectoryId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteLogSubscriptionRequest]
    }
  }

  @js.native
  trait DeleteLogSubscriptionResult extends js.Object {}

  object DeleteLogSubscriptionResult {
    @inline
    def apply(
        ): DeleteLogSubscriptionResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteLogSubscriptionResult]
    }
  }

  /**
    * Contains the inputs for the <a>DeleteSnapshot</a> operation.
    */
  @js.native
  trait DeleteSnapshotRequest extends js.Object {
    var SnapshotId: SnapshotId
  }

  object DeleteSnapshotRequest {
    @inline
    def apply(
        SnapshotId: SnapshotId
    ): DeleteSnapshotRequest = {
      val __obj = js.Dynamic.literal(
        "SnapshotId" -> SnapshotId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteSnapshotRequest]
    }
  }

  /**
    * Contains the results of the <a>DeleteSnapshot</a> operation.
    */
  @js.native
  trait DeleteSnapshotResult extends js.Object {
    var SnapshotId: js.UndefOr[SnapshotId]
  }

  object DeleteSnapshotResult {
    @inline
    def apply(
        SnapshotId: js.UndefOr[SnapshotId] = js.undefined
    ): DeleteSnapshotResult = {
      val __obj = js.Dynamic.literal()
      SnapshotId.foreach(__v => __obj.updateDynamic("SnapshotId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteSnapshotResult]
    }
  }

  /**
    * Deletes the local side of an existing trust relationship between the AWS Managed Microsoft AD directory and the external domain.
    */
  @js.native
  trait DeleteTrustRequest extends js.Object {
    var TrustId: TrustId
    var DeleteAssociatedConditionalForwarder: js.UndefOr[DeleteAssociatedConditionalForwarder]
  }

  object DeleteTrustRequest {
    @inline
    def apply(
        TrustId: TrustId,
        DeleteAssociatedConditionalForwarder: js.UndefOr[DeleteAssociatedConditionalForwarder] = js.undefined
    ): DeleteTrustRequest = {
      val __obj = js.Dynamic.literal(
        "TrustId" -> TrustId.asInstanceOf[js.Any]
      )

      DeleteAssociatedConditionalForwarder.foreach(
        __v => __obj.updateDynamic("DeleteAssociatedConditionalForwarder")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DeleteTrustRequest]
    }
  }

  /**
    * The result of a DeleteTrust request.
    */
  @js.native
  trait DeleteTrustResult extends js.Object {
    var TrustId: js.UndefOr[TrustId]
  }

  object DeleteTrustResult {
    @inline
    def apply(
        TrustId: js.UndefOr[TrustId] = js.undefined
    ): DeleteTrustResult = {
      val __obj = js.Dynamic.literal()
      TrustId.foreach(__v => __obj.updateDynamic("TrustId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteTrustResult]
    }
  }

  /**
    * Removes the specified directory as a publisher to the specified SNS topic.
    */
  @js.native
  trait DeregisterEventTopicRequest extends js.Object {
    var DirectoryId: DirectoryId
    var TopicName: TopicName
  }

  object DeregisterEventTopicRequest {
    @inline
    def apply(
        DirectoryId: DirectoryId,
        TopicName: TopicName
    ): DeregisterEventTopicRequest = {
      val __obj = js.Dynamic.literal(
        "DirectoryId" -> DirectoryId.asInstanceOf[js.Any],
        "TopicName"   -> TopicName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeregisterEventTopicRequest]
    }
  }

  /**
    * The result of a DeregisterEventTopic request.
    */
  @js.native
  trait DeregisterEventTopicResult extends js.Object {}

  object DeregisterEventTopicResult {
    @inline
    def apply(
        ): DeregisterEventTopicResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeregisterEventTopicResult]
    }
  }

  /**
    * Describes a conditional forwarder.
    */
  @js.native
  trait DescribeConditionalForwardersRequest extends js.Object {
    var DirectoryId: DirectoryId
    var RemoteDomainNames: js.UndefOr[RemoteDomainNames]
  }

  object DescribeConditionalForwardersRequest {
    @inline
    def apply(
        DirectoryId: DirectoryId,
        RemoteDomainNames: js.UndefOr[RemoteDomainNames] = js.undefined
    ): DescribeConditionalForwardersRequest = {
      val __obj = js.Dynamic.literal(
        "DirectoryId" -> DirectoryId.asInstanceOf[js.Any]
      )

      RemoteDomainNames.foreach(__v => __obj.updateDynamic("RemoteDomainNames")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeConditionalForwardersRequest]
    }
  }

  /**
    * The result of a DescribeConditionalForwarder request.
    */
  @js.native
  trait DescribeConditionalForwardersResult extends js.Object {
    var ConditionalForwarders: js.UndefOr[ConditionalForwarders]
  }

  object DescribeConditionalForwardersResult {
    @inline
    def apply(
        ConditionalForwarders: js.UndefOr[ConditionalForwarders] = js.undefined
    ): DescribeConditionalForwardersResult = {
      val __obj = js.Dynamic.literal()
      ConditionalForwarders.foreach(__v => __obj.updateDynamic("ConditionalForwarders")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeConditionalForwardersResult]
    }
  }

  /**
    * Contains the inputs for the <a>DescribeDirectories</a> operation.
    */
  @js.native
  trait DescribeDirectoriesRequest extends js.Object {
    var DirectoryIds: js.UndefOr[DirectoryIds]
    var Limit: js.UndefOr[Limit]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeDirectoriesRequest {
    @inline
    def apply(
        DirectoryIds: js.UndefOr[DirectoryIds] = js.undefined,
        Limit: js.UndefOr[Limit] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeDirectoriesRequest = {
      val __obj = js.Dynamic.literal()
      DirectoryIds.foreach(__v => __obj.updateDynamic("DirectoryIds")(__v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDirectoriesRequest]
    }
  }

  /**
    * Contains the results of the <a>DescribeDirectories</a> operation.
    */
  @js.native
  trait DescribeDirectoriesResult extends js.Object {
    var DirectoryDescriptions: js.UndefOr[DirectoryDescriptions]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeDirectoriesResult {
    @inline
    def apply(
        DirectoryDescriptions: js.UndefOr[DirectoryDescriptions] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeDirectoriesResult = {
      val __obj = js.Dynamic.literal()
      DirectoryDescriptions.foreach(__v => __obj.updateDynamic("DirectoryDescriptions")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDirectoriesResult]
    }
  }

  @js.native
  trait DescribeDomainControllersRequest extends js.Object {
    var DirectoryId: DirectoryId
    var DomainControllerIds: js.UndefOr[DomainControllerIds]
    var Limit: js.UndefOr[Limit]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeDomainControllersRequest {
    @inline
    def apply(
        DirectoryId: DirectoryId,
        DomainControllerIds: js.UndefOr[DomainControllerIds] = js.undefined,
        Limit: js.UndefOr[Limit] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeDomainControllersRequest = {
      val __obj = js.Dynamic.literal(
        "DirectoryId" -> DirectoryId.asInstanceOf[js.Any]
      )

      DomainControllerIds.foreach(__v => __obj.updateDynamic("DomainControllerIds")(__v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDomainControllersRequest]
    }
  }

  @js.native
  trait DescribeDomainControllersResult extends js.Object {
    var DomainControllers: js.UndefOr[DomainControllers]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeDomainControllersResult {
    @inline
    def apply(
        DomainControllers: js.UndefOr[DomainControllers] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeDomainControllersResult = {
      val __obj = js.Dynamic.literal()
      DomainControllers.foreach(__v => __obj.updateDynamic("DomainControllers")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDomainControllersResult]
    }
  }

  /**
    * Describes event topics.
    */
  @js.native
  trait DescribeEventTopicsRequest extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
    var TopicNames: js.UndefOr[TopicNames]
  }

  object DescribeEventTopicsRequest {
    @inline
    def apply(
        DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
        TopicNames: js.UndefOr[TopicNames] = js.undefined
    ): DescribeEventTopicsRequest = {
      val __obj = js.Dynamic.literal()
      DirectoryId.foreach(__v => __obj.updateDynamic("DirectoryId")(__v.asInstanceOf[js.Any]))
      TopicNames.foreach(__v => __obj.updateDynamic("TopicNames")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEventTopicsRequest]
    }
  }

  /**
    * The result of a DescribeEventTopic request.
    */
  @js.native
  trait DescribeEventTopicsResult extends js.Object {
    var EventTopics: js.UndefOr[EventTopics]
  }

  object DescribeEventTopicsResult {
    @inline
    def apply(
        EventTopics: js.UndefOr[EventTopics] = js.undefined
    ): DescribeEventTopicsResult = {
      val __obj = js.Dynamic.literal()
      EventTopics.foreach(__v => __obj.updateDynamic("EventTopics")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEventTopicsResult]
    }
  }

  @js.native
  trait DescribeSharedDirectoriesRequest extends js.Object {
    var OwnerDirectoryId: DirectoryId
    var Limit: js.UndefOr[Limit]
    var NextToken: js.UndefOr[NextToken]
    var SharedDirectoryIds: js.UndefOr[DirectoryIds]
  }

  object DescribeSharedDirectoriesRequest {
    @inline
    def apply(
        OwnerDirectoryId: DirectoryId,
        Limit: js.UndefOr[Limit] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SharedDirectoryIds: js.UndefOr[DirectoryIds] = js.undefined
    ): DescribeSharedDirectoriesRequest = {
      val __obj = js.Dynamic.literal(
        "OwnerDirectoryId" -> OwnerDirectoryId.asInstanceOf[js.Any]
      )

      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SharedDirectoryIds.foreach(__v => __obj.updateDynamic("SharedDirectoryIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSharedDirectoriesRequest]
    }
  }

  @js.native
  trait DescribeSharedDirectoriesResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var SharedDirectories: js.UndefOr[SharedDirectories]
  }

  object DescribeSharedDirectoriesResult {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SharedDirectories: js.UndefOr[SharedDirectories] = js.undefined
    ): DescribeSharedDirectoriesResult = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SharedDirectories.foreach(__v => __obj.updateDynamic("SharedDirectories")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSharedDirectoriesResult]
    }
  }

  /**
    * Contains the inputs for the <a>DescribeSnapshots</a> operation.
    */
  @js.native
  trait DescribeSnapshotsRequest extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
    var Limit: js.UndefOr[Limit]
    var NextToken: js.UndefOr[NextToken]
    var SnapshotIds: js.UndefOr[SnapshotIds]
  }

  object DescribeSnapshotsRequest {
    @inline
    def apply(
        DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
        Limit: js.UndefOr[Limit] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SnapshotIds: js.UndefOr[SnapshotIds] = js.undefined
    ): DescribeSnapshotsRequest = {
      val __obj = js.Dynamic.literal()
      DirectoryId.foreach(__v => __obj.updateDynamic("DirectoryId")(__v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SnapshotIds.foreach(__v => __obj.updateDynamic("SnapshotIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSnapshotsRequest]
    }
  }

  /**
    * Contains the results of the <a>DescribeSnapshots</a> operation.
    */
  @js.native
  trait DescribeSnapshotsResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Snapshots: js.UndefOr[Snapshots]
  }

  object DescribeSnapshotsResult {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Snapshots: js.UndefOr[Snapshots] = js.undefined
    ): DescribeSnapshotsResult = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Snapshots.foreach(__v => __obj.updateDynamic("Snapshots")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSnapshotsResult]
    }
  }

  /**
    * Describes the trust relationships for a particular AWS Managed Microsoft AD directory. If no input parameters are are provided, such as directory ID or trust ID, this request describes all the trust relationships.
    */
  @js.native
  trait DescribeTrustsRequest extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
    var Limit: js.UndefOr[Limit]
    var NextToken: js.UndefOr[NextToken]
    var TrustIds: js.UndefOr[TrustIds]
  }

  object DescribeTrustsRequest {
    @inline
    def apply(
        DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
        Limit: js.UndefOr[Limit] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        TrustIds: js.UndefOr[TrustIds] = js.undefined
    ): DescribeTrustsRequest = {
      val __obj = js.Dynamic.literal()
      DirectoryId.foreach(__v => __obj.updateDynamic("DirectoryId")(__v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      TrustIds.foreach(__v => __obj.updateDynamic("TrustIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTrustsRequest]
    }
  }

  /**
    * The result of a DescribeTrust request.
    */
  @js.native
  trait DescribeTrustsResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Trusts: js.UndefOr[Trusts]
  }

  object DescribeTrustsResult {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Trusts: js.UndefOr[Trusts] = js.undefined
    ): DescribeTrustsResult = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Trusts.foreach(__v => __obj.updateDynamic("Trusts")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTrustsResult]
    }
  }

  /**
    * Contains information for the <a>ConnectDirectory</a> operation when an AD Connector directory is being created.
    */
  @js.native
  trait DirectoryConnectSettings extends js.Object {
    var CustomerDnsIps: DnsIpAddrs
    var CustomerUserName: UserName
    var SubnetIds: SubnetIds
    var VpcId: VpcId
  }

  object DirectoryConnectSettings {
    @inline
    def apply(
        CustomerDnsIps: DnsIpAddrs,
        CustomerUserName: UserName,
        SubnetIds: SubnetIds,
        VpcId: VpcId
    ): DirectoryConnectSettings = {
      val __obj = js.Dynamic.literal(
        "CustomerDnsIps"   -> CustomerDnsIps.asInstanceOf[js.Any],
        "CustomerUserName" -> CustomerUserName.asInstanceOf[js.Any],
        "SubnetIds"        -> SubnetIds.asInstanceOf[js.Any],
        "VpcId"            -> VpcId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DirectoryConnectSettings]
    }
  }

  /**
    * Contains information about an AD Connector directory.
    */
  @js.native
  trait DirectoryConnectSettingsDescription extends js.Object {
    var AvailabilityZones: js.UndefOr[AvailabilityZones]
    var ConnectIps: js.UndefOr[IpAddrs]
    var CustomerUserName: js.UndefOr[UserName]
    var SecurityGroupId: js.UndefOr[SecurityGroupId]
    var SubnetIds: js.UndefOr[SubnetIds]
    var VpcId: js.UndefOr[VpcId]
  }

  object DirectoryConnectSettingsDescription {
    @inline
    def apply(
        AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined,
        ConnectIps: js.UndefOr[IpAddrs] = js.undefined,
        CustomerUserName: js.UndefOr[UserName] = js.undefined,
        SecurityGroupId: js.UndefOr[SecurityGroupId] = js.undefined,
        SubnetIds: js.UndefOr[SubnetIds] = js.undefined,
        VpcId: js.UndefOr[VpcId] = js.undefined
    ): DirectoryConnectSettingsDescription = {
      val __obj = js.Dynamic.literal()
      AvailabilityZones.foreach(__v => __obj.updateDynamic("AvailabilityZones")(__v.asInstanceOf[js.Any]))
      ConnectIps.foreach(__v => __obj.updateDynamic("ConnectIps")(__v.asInstanceOf[js.Any]))
      CustomerUserName.foreach(__v => __obj.updateDynamic("CustomerUserName")(__v.asInstanceOf[js.Any]))
      SecurityGroupId.foreach(__v => __obj.updateDynamic("SecurityGroupId")(__v.asInstanceOf[js.Any]))
      SubnetIds.foreach(__v => __obj.updateDynamic("SubnetIds")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DirectoryConnectSettingsDescription]
    }
  }

  /**
    * Contains information about an AWS Directory Service directory.
    */
  @js.native
  trait DirectoryDescription extends js.Object {
    var AccessUrl: js.UndefOr[AccessUrl]
    var Alias: js.UndefOr[AliasName]
    var ConnectSettings: js.UndefOr[DirectoryConnectSettingsDescription]
    var Description: js.UndefOr[Description]
    var DesiredNumberOfDomainControllers: js.UndefOr[DesiredNumberOfDomainControllers]
    var DirectoryId: js.UndefOr[DirectoryId]
    var DnsIpAddrs: js.UndefOr[DnsIpAddrs]
    var Edition: js.UndefOr[DirectoryEdition]
    var LaunchTime: js.UndefOr[LaunchTime]
    var Name: js.UndefOr[DirectoryName]
    var OwnerDirectoryDescription: js.UndefOr[OwnerDirectoryDescription]
    var RadiusSettings: js.UndefOr[RadiusSettings]
    var RadiusStatus: js.UndefOr[RadiusStatus]
    var ShareMethod: js.UndefOr[ShareMethod]
    var ShareNotes: js.UndefOr[Notes]
    var ShareStatus: js.UndefOr[ShareStatus]
    var ShortName: js.UndefOr[DirectoryShortName]
    var Size: js.UndefOr[DirectorySize]
    var SsoEnabled: js.UndefOr[SsoEnabled]
    var Stage: js.UndefOr[DirectoryStage]
    var StageLastUpdatedDateTime: js.UndefOr[LastUpdatedDateTime]
    var StageReason: js.UndefOr[StageReason]
    var Type: js.UndefOr[DirectoryType]
    var VpcSettings: js.UndefOr[DirectoryVpcSettingsDescription]
  }

  object DirectoryDescription {
    @inline
    def apply(
        AccessUrl: js.UndefOr[AccessUrl] = js.undefined,
        Alias: js.UndefOr[AliasName] = js.undefined,
        ConnectSettings: js.UndefOr[DirectoryConnectSettingsDescription] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        DesiredNumberOfDomainControllers: js.UndefOr[DesiredNumberOfDomainControllers] = js.undefined,
        DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
        DnsIpAddrs: js.UndefOr[DnsIpAddrs] = js.undefined,
        Edition: js.UndefOr[DirectoryEdition] = js.undefined,
        LaunchTime: js.UndefOr[LaunchTime] = js.undefined,
        Name: js.UndefOr[DirectoryName] = js.undefined,
        OwnerDirectoryDescription: js.UndefOr[OwnerDirectoryDescription] = js.undefined,
        RadiusSettings: js.UndefOr[RadiusSettings] = js.undefined,
        RadiusStatus: js.UndefOr[RadiusStatus] = js.undefined,
        ShareMethod: js.UndefOr[ShareMethod] = js.undefined,
        ShareNotes: js.UndefOr[Notes] = js.undefined,
        ShareStatus: js.UndefOr[ShareStatus] = js.undefined,
        ShortName: js.UndefOr[DirectoryShortName] = js.undefined,
        Size: js.UndefOr[DirectorySize] = js.undefined,
        SsoEnabled: js.UndefOr[SsoEnabled] = js.undefined,
        Stage: js.UndefOr[DirectoryStage] = js.undefined,
        StageLastUpdatedDateTime: js.UndefOr[LastUpdatedDateTime] = js.undefined,
        StageReason: js.UndefOr[StageReason] = js.undefined,
        Type: js.UndefOr[DirectoryType] = js.undefined,
        VpcSettings: js.UndefOr[DirectoryVpcSettingsDescription] = js.undefined
    ): DirectoryDescription = {
      val __obj = js.Dynamic.literal()
      AccessUrl.foreach(__v => __obj.updateDynamic("AccessUrl")(__v.asInstanceOf[js.Any]))
      Alias.foreach(__v => __obj.updateDynamic("Alias")(__v.asInstanceOf[js.Any]))
      ConnectSettings.foreach(__v => __obj.updateDynamic("ConnectSettings")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DesiredNumberOfDomainControllers.foreach(
        __v => __obj.updateDynamic("DesiredNumberOfDomainControllers")(__v.asInstanceOf[js.Any])
      )
      DirectoryId.foreach(__v => __obj.updateDynamic("DirectoryId")(__v.asInstanceOf[js.Any]))
      DnsIpAddrs.foreach(__v => __obj.updateDynamic("DnsIpAddrs")(__v.asInstanceOf[js.Any]))
      Edition.foreach(__v => __obj.updateDynamic("Edition")(__v.asInstanceOf[js.Any]))
      LaunchTime.foreach(__v => __obj.updateDynamic("LaunchTime")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      OwnerDirectoryDescription.foreach(
        __v => __obj.updateDynamic("OwnerDirectoryDescription")(__v.asInstanceOf[js.Any])
      )
      RadiusSettings.foreach(__v => __obj.updateDynamic("RadiusSettings")(__v.asInstanceOf[js.Any]))
      RadiusStatus.foreach(__v => __obj.updateDynamic("RadiusStatus")(__v.asInstanceOf[js.Any]))
      ShareMethod.foreach(__v => __obj.updateDynamic("ShareMethod")(__v.asInstanceOf[js.Any]))
      ShareNotes.foreach(__v => __obj.updateDynamic("ShareNotes")(__v.asInstanceOf[js.Any]))
      ShareStatus.foreach(__v => __obj.updateDynamic("ShareStatus")(__v.asInstanceOf[js.Any]))
      ShortName.foreach(__v => __obj.updateDynamic("ShortName")(__v.asInstanceOf[js.Any]))
      Size.foreach(__v => __obj.updateDynamic("Size")(__v.asInstanceOf[js.Any]))
      SsoEnabled.foreach(__v => __obj.updateDynamic("SsoEnabled")(__v.asInstanceOf[js.Any]))
      Stage.foreach(__v => __obj.updateDynamic("Stage")(__v.asInstanceOf[js.Any]))
      StageLastUpdatedDateTime.foreach(__v => __obj.updateDynamic("StageLastUpdatedDateTime")(__v.asInstanceOf[js.Any]))
      StageReason.foreach(__v => __obj.updateDynamic("StageReason")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      VpcSettings.foreach(__v => __obj.updateDynamic("VpcSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DirectoryDescription]
    }
  }

  object DirectoryEditionEnum {
    val Enterprise = "Enterprise"
    val Standard   = "Standard"

    val values = js.Object.freeze(js.Array(Enterprise, Standard))
  }

  /**
    * Contains directory limit information for a region.
    */
  @js.native
  trait DirectoryLimits extends js.Object {
    var CloudOnlyDirectoriesCurrentCount: js.UndefOr[Limit]
    var CloudOnlyDirectoriesLimit: js.UndefOr[Limit]
    var CloudOnlyDirectoriesLimitReached: js.UndefOr[CloudOnlyDirectoriesLimitReached]
    var CloudOnlyMicrosoftADCurrentCount: js.UndefOr[Limit]
    var CloudOnlyMicrosoftADLimit: js.UndefOr[Limit]
    var CloudOnlyMicrosoftADLimitReached: js.UndefOr[CloudOnlyDirectoriesLimitReached]
    var ConnectedDirectoriesCurrentCount: js.UndefOr[Limit]
    var ConnectedDirectoriesLimit: js.UndefOr[Limit]
    var ConnectedDirectoriesLimitReached: js.UndefOr[ConnectedDirectoriesLimitReached]
  }

  object DirectoryLimits {
    @inline
    def apply(
        CloudOnlyDirectoriesCurrentCount: js.UndefOr[Limit] = js.undefined,
        CloudOnlyDirectoriesLimit: js.UndefOr[Limit] = js.undefined,
        CloudOnlyDirectoriesLimitReached: js.UndefOr[CloudOnlyDirectoriesLimitReached] = js.undefined,
        CloudOnlyMicrosoftADCurrentCount: js.UndefOr[Limit] = js.undefined,
        CloudOnlyMicrosoftADLimit: js.UndefOr[Limit] = js.undefined,
        CloudOnlyMicrosoftADLimitReached: js.UndefOr[CloudOnlyDirectoriesLimitReached] = js.undefined,
        ConnectedDirectoriesCurrentCount: js.UndefOr[Limit] = js.undefined,
        ConnectedDirectoriesLimit: js.UndefOr[Limit] = js.undefined,
        ConnectedDirectoriesLimitReached: js.UndefOr[ConnectedDirectoriesLimitReached] = js.undefined
    ): DirectoryLimits = {
      val __obj = js.Dynamic.literal()
      CloudOnlyDirectoriesCurrentCount.foreach(
        __v => __obj.updateDynamic("CloudOnlyDirectoriesCurrentCount")(__v.asInstanceOf[js.Any])
      )
      CloudOnlyDirectoriesLimit.foreach(
        __v => __obj.updateDynamic("CloudOnlyDirectoriesLimit")(__v.asInstanceOf[js.Any])
      )
      CloudOnlyDirectoriesLimitReached.foreach(
        __v => __obj.updateDynamic("CloudOnlyDirectoriesLimitReached")(__v.asInstanceOf[js.Any])
      )
      CloudOnlyMicrosoftADCurrentCount.foreach(
        __v => __obj.updateDynamic("CloudOnlyMicrosoftADCurrentCount")(__v.asInstanceOf[js.Any])
      )
      CloudOnlyMicrosoftADLimit.foreach(
        __v => __obj.updateDynamic("CloudOnlyMicrosoftADLimit")(__v.asInstanceOf[js.Any])
      )
      CloudOnlyMicrosoftADLimitReached.foreach(
        __v => __obj.updateDynamic("CloudOnlyMicrosoftADLimitReached")(__v.asInstanceOf[js.Any])
      )
      ConnectedDirectoriesCurrentCount.foreach(
        __v => __obj.updateDynamic("ConnectedDirectoriesCurrentCount")(__v.asInstanceOf[js.Any])
      )
      ConnectedDirectoriesLimit.foreach(
        __v => __obj.updateDynamic("ConnectedDirectoriesLimit")(__v.asInstanceOf[js.Any])
      )
      ConnectedDirectoriesLimitReached.foreach(
        __v => __obj.updateDynamic("ConnectedDirectoriesLimitReached")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DirectoryLimits]
    }
  }

  object DirectorySizeEnum {
    val Small = "Small"
    val Large = "Large"

    val values = js.Object.freeze(js.Array(Small, Large))
  }

  object DirectoryStageEnum {
    val Requested     = "Requested"
    val Creating      = "Creating"
    val Created       = "Created"
    val Active        = "Active"
    val Inoperable    = "Inoperable"
    val Impaired      = "Impaired"
    val Restoring     = "Restoring"
    val RestoreFailed = "RestoreFailed"
    val Deleting      = "Deleting"
    val Deleted       = "Deleted"
    val Failed        = "Failed"

    val values = js.Object.freeze(
      js.Array(
        Requested,
        Creating,
        Created,
        Active,
        Inoperable,
        Impaired,
        Restoring,
        RestoreFailed,
        Deleting,
        Deleted,
        Failed
      )
    )
  }

  object DirectoryTypeEnum {
    val SimpleAD          = "SimpleAD"
    val ADConnector       = "ADConnector"
    val MicrosoftAD       = "MicrosoftAD"
    val SharedMicrosoftAD = "SharedMicrosoftAD"

    val values = js.Object.freeze(js.Array(SimpleAD, ADConnector, MicrosoftAD, SharedMicrosoftAD))
  }

  /**
    * Contains VPC information for the <a>CreateDirectory</a> or <a>CreateMicrosoftAD</a> operation.
    */
  @js.native
  trait DirectoryVpcSettings extends js.Object {
    var SubnetIds: SubnetIds
    var VpcId: VpcId
  }

  object DirectoryVpcSettings {
    @inline
    def apply(
        SubnetIds: SubnetIds,
        VpcId: VpcId
    ): DirectoryVpcSettings = {
      val __obj = js.Dynamic.literal(
        "SubnetIds" -> SubnetIds.asInstanceOf[js.Any],
        "VpcId"     -> VpcId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DirectoryVpcSettings]
    }
  }

  /**
    * Contains information about the directory.
    */
  @js.native
  trait DirectoryVpcSettingsDescription extends js.Object {
    var AvailabilityZones: js.UndefOr[AvailabilityZones]
    var SecurityGroupId: js.UndefOr[SecurityGroupId]
    var SubnetIds: js.UndefOr[SubnetIds]
    var VpcId: js.UndefOr[VpcId]
  }

  object DirectoryVpcSettingsDescription {
    @inline
    def apply(
        AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined,
        SecurityGroupId: js.UndefOr[SecurityGroupId] = js.undefined,
        SubnetIds: js.UndefOr[SubnetIds] = js.undefined,
        VpcId: js.UndefOr[VpcId] = js.undefined
    ): DirectoryVpcSettingsDescription = {
      val __obj = js.Dynamic.literal()
      AvailabilityZones.foreach(__v => __obj.updateDynamic("AvailabilityZones")(__v.asInstanceOf[js.Any]))
      SecurityGroupId.foreach(__v => __obj.updateDynamic("SecurityGroupId")(__v.asInstanceOf[js.Any]))
      SubnetIds.foreach(__v => __obj.updateDynamic("SubnetIds")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DirectoryVpcSettingsDescription]
    }
  }

  /**
    * Contains the inputs for the <a>DisableRadius</a> operation.
    */
  @js.native
  trait DisableRadiusRequest extends js.Object {
    var DirectoryId: DirectoryId
  }

  object DisableRadiusRequest {
    @inline
    def apply(
        DirectoryId: DirectoryId
    ): DisableRadiusRequest = {
      val __obj = js.Dynamic.literal(
        "DirectoryId" -> DirectoryId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DisableRadiusRequest]
    }
  }

  /**
    * Contains the results of the <a>DisableRadius</a> operation.
    */
  @js.native
  trait DisableRadiusResult extends js.Object {}

  object DisableRadiusResult {
    @inline
    def apply(
        ): DisableRadiusResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DisableRadiusResult]
    }
  }

  /**
    * Contains the inputs for the <a>DisableSso</a> operation.
    */
  @js.native
  trait DisableSsoRequest extends js.Object {
    var DirectoryId: DirectoryId
    var Password: js.UndefOr[ConnectPassword]
    var UserName: js.UndefOr[UserName]
  }

  object DisableSsoRequest {
    @inline
    def apply(
        DirectoryId: DirectoryId,
        Password: js.UndefOr[ConnectPassword] = js.undefined,
        UserName: js.UndefOr[UserName] = js.undefined
    ): DisableSsoRequest = {
      val __obj = js.Dynamic.literal(
        "DirectoryId" -> DirectoryId.asInstanceOf[js.Any]
      )

      Password.foreach(__v => __obj.updateDynamic("Password")(__v.asInstanceOf[js.Any]))
      UserName.foreach(__v => __obj.updateDynamic("UserName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisableSsoRequest]
    }
  }

  /**
    * Contains the results of the <a>DisableSso</a> operation.
    */
  @js.native
  trait DisableSsoResult extends js.Object {}

  object DisableSsoResult {
    @inline
    def apply(
        ): DisableSsoResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DisableSsoResult]
    }
  }

  /**
    * Contains information about the domain controllers for a specified directory.
    */
  @js.native
  trait DomainController extends js.Object {
    var AvailabilityZone: js.UndefOr[AvailabilityZone]
    var DirectoryId: js.UndefOr[DirectoryId]
    var DnsIpAddr: js.UndefOr[IpAddr]
    var DomainControllerId: js.UndefOr[DomainControllerId]
    var LaunchTime: js.UndefOr[LaunchTime]
    var Status: js.UndefOr[DomainControllerStatus]
    var StatusLastUpdatedDateTime: js.UndefOr[LastUpdatedDateTime]
    var StatusReason: js.UndefOr[DomainControllerStatusReason]
    var SubnetId: js.UndefOr[SubnetId]
    var VpcId: js.UndefOr[VpcId]
  }

  object DomainController {
    @inline
    def apply(
        AvailabilityZone: js.UndefOr[AvailabilityZone] = js.undefined,
        DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
        DnsIpAddr: js.UndefOr[IpAddr] = js.undefined,
        DomainControllerId: js.UndefOr[DomainControllerId] = js.undefined,
        LaunchTime: js.UndefOr[LaunchTime] = js.undefined,
        Status: js.UndefOr[DomainControllerStatus] = js.undefined,
        StatusLastUpdatedDateTime: js.UndefOr[LastUpdatedDateTime] = js.undefined,
        StatusReason: js.UndefOr[DomainControllerStatusReason] = js.undefined,
        SubnetId: js.UndefOr[SubnetId] = js.undefined,
        VpcId: js.UndefOr[VpcId] = js.undefined
    ): DomainController = {
      val __obj = js.Dynamic.literal()
      AvailabilityZone.foreach(__v => __obj.updateDynamic("AvailabilityZone")(__v.asInstanceOf[js.Any]))
      DirectoryId.foreach(__v => __obj.updateDynamic("DirectoryId")(__v.asInstanceOf[js.Any]))
      DnsIpAddr.foreach(__v => __obj.updateDynamic("DnsIpAddr")(__v.asInstanceOf[js.Any]))
      DomainControllerId.foreach(__v => __obj.updateDynamic("DomainControllerId")(__v.asInstanceOf[js.Any]))
      LaunchTime.foreach(__v => __obj.updateDynamic("LaunchTime")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusLastUpdatedDateTime.foreach(
        __v => __obj.updateDynamic("StatusLastUpdatedDateTime")(__v.asInstanceOf[js.Any])
      )
      StatusReason.foreach(__v => __obj.updateDynamic("StatusReason")(__v.asInstanceOf[js.Any]))
      SubnetId.foreach(__v => __obj.updateDynamic("SubnetId")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DomainController]
    }
  }

  object DomainControllerStatusEnum {
    val Creating  = "Creating"
    val Active    = "Active"
    val Impaired  = "Impaired"
    val Restoring = "Restoring"
    val Deleting  = "Deleting"
    val Deleted   = "Deleted"
    val Failed    = "Failed"

    val values = js.Object.freeze(js.Array(Creating, Active, Impaired, Restoring, Deleting, Deleted, Failed))
  }

  /**
    * Contains the inputs for the <a>EnableRadius</a> operation.
    */
  @js.native
  trait EnableRadiusRequest extends js.Object {
    var DirectoryId: DirectoryId
    var RadiusSettings: RadiusSettings
  }

  object EnableRadiusRequest {
    @inline
    def apply(
        DirectoryId: DirectoryId,
        RadiusSettings: RadiusSettings
    ): EnableRadiusRequest = {
      val __obj = js.Dynamic.literal(
        "DirectoryId"    -> DirectoryId.asInstanceOf[js.Any],
        "RadiusSettings" -> RadiusSettings.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[EnableRadiusRequest]
    }
  }

  /**
    * Contains the results of the <a>EnableRadius</a> operation.
    */
  @js.native
  trait EnableRadiusResult extends js.Object {}

  object EnableRadiusResult {
    @inline
    def apply(
        ): EnableRadiusResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[EnableRadiusResult]
    }
  }

  /**
    * Contains the inputs for the <a>EnableSso</a> operation.
    */
  @js.native
  trait EnableSsoRequest extends js.Object {
    var DirectoryId: DirectoryId
    var Password: js.UndefOr[ConnectPassword]
    var UserName: js.UndefOr[UserName]
  }

  object EnableSsoRequest {
    @inline
    def apply(
        DirectoryId: DirectoryId,
        Password: js.UndefOr[ConnectPassword] = js.undefined,
        UserName: js.UndefOr[UserName] = js.undefined
    ): EnableSsoRequest = {
      val __obj = js.Dynamic.literal(
        "DirectoryId" -> DirectoryId.asInstanceOf[js.Any]
      )

      Password.foreach(__v => __obj.updateDynamic("Password")(__v.asInstanceOf[js.Any]))
      UserName.foreach(__v => __obj.updateDynamic("UserName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EnableSsoRequest]
    }
  }

  /**
    * Contains the results of the <a>EnableSso</a> operation.
    */
  @js.native
  trait EnableSsoResult extends js.Object {}

  object EnableSsoResult {
    @inline
    def apply(
        ): EnableSsoResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[EnableSsoResult]
    }
  }

  /**
    * Information about SNS topic and AWS Directory Service directory associations.
    */
  @js.native
  trait EventTopic extends js.Object {
    var CreatedDateTime: js.UndefOr[CreatedDateTime]
    var DirectoryId: js.UndefOr[DirectoryId]
    var Status: js.UndefOr[TopicStatus]
    var TopicArn: js.UndefOr[TopicArn]
    var TopicName: js.UndefOr[TopicName]
  }

  object EventTopic {
    @inline
    def apply(
        CreatedDateTime: js.UndefOr[CreatedDateTime] = js.undefined,
        DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
        Status: js.UndefOr[TopicStatus] = js.undefined,
        TopicArn: js.UndefOr[TopicArn] = js.undefined,
        TopicName: js.UndefOr[TopicName] = js.undefined
    ): EventTopic = {
      val __obj = js.Dynamic.literal()
      CreatedDateTime.foreach(__v => __obj.updateDynamic("CreatedDateTime")(__v.asInstanceOf[js.Any]))
      DirectoryId.foreach(__v => __obj.updateDynamic("DirectoryId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TopicArn.foreach(__v => __obj.updateDynamic("TopicArn")(__v.asInstanceOf[js.Any]))
      TopicName.foreach(__v => __obj.updateDynamic("TopicName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventTopic]
    }
  }

  /**
    * Contains the inputs for the <a>GetDirectoryLimits</a> operation.
    */
  @js.native
  trait GetDirectoryLimitsRequest extends js.Object {}

  object GetDirectoryLimitsRequest {
    @inline
    def apply(
        ): GetDirectoryLimitsRequest = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[GetDirectoryLimitsRequest]
    }
  }

  /**
    * Contains the results of the <a>GetDirectoryLimits</a> operation.
    */
  @js.native
  trait GetDirectoryLimitsResult extends js.Object {
    var DirectoryLimits: js.UndefOr[DirectoryLimits]
  }

  object GetDirectoryLimitsResult {
    @inline
    def apply(
        DirectoryLimits: js.UndefOr[DirectoryLimits] = js.undefined
    ): GetDirectoryLimitsResult = {
      val __obj = js.Dynamic.literal()
      DirectoryLimits.foreach(__v => __obj.updateDynamic("DirectoryLimits")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDirectoryLimitsResult]
    }
  }

  /**
    * Contains the inputs for the <a>GetSnapshotLimits</a> operation.
    */
  @js.native
  trait GetSnapshotLimitsRequest extends js.Object {
    var DirectoryId: DirectoryId
  }

  object GetSnapshotLimitsRequest {
    @inline
    def apply(
        DirectoryId: DirectoryId
    ): GetSnapshotLimitsRequest = {
      val __obj = js.Dynamic.literal(
        "DirectoryId" -> DirectoryId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetSnapshotLimitsRequest]
    }
  }

  /**
    * Contains the results of the <a>GetSnapshotLimits</a> operation.
    */
  @js.native
  trait GetSnapshotLimitsResult extends js.Object {
    var SnapshotLimits: js.UndefOr[SnapshotLimits]
  }

  object GetSnapshotLimitsResult {
    @inline
    def apply(
        SnapshotLimits: js.UndefOr[SnapshotLimits] = js.undefined
    ): GetSnapshotLimitsResult = {
      val __obj = js.Dynamic.literal()
      SnapshotLimits.foreach(__v => __obj.updateDynamic("SnapshotLimits")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSnapshotLimitsResult]
    }
  }

  /**
    * IP address block. This is often the address block of the DNS server used for your on-premises domain.
    */
  @js.native
  trait IpRoute extends js.Object {
    var CidrIp: js.UndefOr[CidrIp]
    var Description: js.UndefOr[Description]
  }

  object IpRoute {
    @inline
    def apply(
        CidrIp: js.UndefOr[CidrIp] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined
    ): IpRoute = {
      val __obj = js.Dynamic.literal()
      CidrIp.foreach(__v => __obj.updateDynamic("CidrIp")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IpRoute]
    }
  }

  /**
    * Information about one or more IP address blocks.
    */
  @js.native
  trait IpRouteInfo extends js.Object {
    var AddedDateTime: js.UndefOr[AddedDateTime]
    var CidrIp: js.UndefOr[CidrIp]
    var Description: js.UndefOr[Description]
    var DirectoryId: js.UndefOr[DirectoryId]
    var IpRouteStatusMsg: js.UndefOr[IpRouteStatusMsg]
    var IpRouteStatusReason: js.UndefOr[IpRouteStatusReason]
  }

  object IpRouteInfo {
    @inline
    def apply(
        AddedDateTime: js.UndefOr[AddedDateTime] = js.undefined,
        CidrIp: js.UndefOr[CidrIp] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
        IpRouteStatusMsg: js.UndefOr[IpRouteStatusMsg] = js.undefined,
        IpRouteStatusReason: js.UndefOr[IpRouteStatusReason] = js.undefined
    ): IpRouteInfo = {
      val __obj = js.Dynamic.literal()
      AddedDateTime.foreach(__v => __obj.updateDynamic("AddedDateTime")(__v.asInstanceOf[js.Any]))
      CidrIp.foreach(__v => __obj.updateDynamic("CidrIp")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DirectoryId.foreach(__v => __obj.updateDynamic("DirectoryId")(__v.asInstanceOf[js.Any]))
      IpRouteStatusMsg.foreach(__v => __obj.updateDynamic("IpRouteStatusMsg")(__v.asInstanceOf[js.Any]))
      IpRouteStatusReason.foreach(__v => __obj.updateDynamic("IpRouteStatusReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IpRouteInfo]
    }
  }

  object IpRouteStatusMsgEnum {
    val Adding       = "Adding"
    val Added        = "Added"
    val Removing     = "Removing"
    val Removed      = "Removed"
    val AddFailed    = "AddFailed"
    val RemoveFailed = "RemoveFailed"

    val values = js.Object.freeze(js.Array(Adding, Added, Removing, Removed, AddFailed, RemoveFailed))
  }

  @js.native
  trait ListIpRoutesRequest extends js.Object {
    var DirectoryId: DirectoryId
    var Limit: js.UndefOr[Limit]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListIpRoutesRequest {
    @inline
    def apply(
        DirectoryId: DirectoryId,
        Limit: js.UndefOr[Limit] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListIpRoutesRequest = {
      val __obj = js.Dynamic.literal(
        "DirectoryId" -> DirectoryId.asInstanceOf[js.Any]
      )

      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListIpRoutesRequest]
    }
  }

  @js.native
  trait ListIpRoutesResult extends js.Object {
    var IpRoutesInfo: js.UndefOr[IpRoutesInfo]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListIpRoutesResult {
    @inline
    def apply(
        IpRoutesInfo: js.UndefOr[IpRoutesInfo] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListIpRoutesResult = {
      val __obj = js.Dynamic.literal()
      IpRoutesInfo.foreach(__v => __obj.updateDynamic("IpRoutesInfo")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListIpRoutesResult]
    }
  }

  @js.native
  trait ListLogSubscriptionsRequest extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
    var Limit: js.UndefOr[Limit]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListLogSubscriptionsRequest {
    @inline
    def apply(
        DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
        Limit: js.UndefOr[Limit] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListLogSubscriptionsRequest = {
      val __obj = js.Dynamic.literal()
      DirectoryId.foreach(__v => __obj.updateDynamic("DirectoryId")(__v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLogSubscriptionsRequest]
    }
  }

  @js.native
  trait ListLogSubscriptionsResult extends js.Object {
    var LogSubscriptions: js.UndefOr[LogSubscriptions]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListLogSubscriptionsResult {
    @inline
    def apply(
        LogSubscriptions: js.UndefOr[LogSubscriptions] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListLogSubscriptionsResult = {
      val __obj = js.Dynamic.literal()
      LogSubscriptions.foreach(__v => __obj.updateDynamic("LogSubscriptions")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLogSubscriptionsResult]
    }
  }

  @js.native
  trait ListSchemaExtensionsRequest extends js.Object {
    var DirectoryId: DirectoryId
    var Limit: js.UndefOr[Limit]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListSchemaExtensionsRequest {
    @inline
    def apply(
        DirectoryId: DirectoryId,
        Limit: js.UndefOr[Limit] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListSchemaExtensionsRequest = {
      val __obj = js.Dynamic.literal(
        "DirectoryId" -> DirectoryId.asInstanceOf[js.Any]
      )

      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSchemaExtensionsRequest]
    }
  }

  @js.native
  trait ListSchemaExtensionsResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var SchemaExtensionsInfo: js.UndefOr[SchemaExtensionsInfo]
  }

  object ListSchemaExtensionsResult {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        SchemaExtensionsInfo: js.UndefOr[SchemaExtensionsInfo] = js.undefined
    ): ListSchemaExtensionsResult = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SchemaExtensionsInfo.foreach(__v => __obj.updateDynamic("SchemaExtensionsInfo")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSchemaExtensionsResult]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceId: ResourceId
    var Limit: js.UndefOr[Limit]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceId: ResourceId,
        Limit: js.UndefOr[Limit] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceId" -> ResourceId.asInstanceOf[js.Any]
      )

      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Tags: js.UndefOr[Tags]
  }

  object ListTagsForResourceResult {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): ListTagsForResourceResult = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResult]
    }
  }

  /**
    * Represents a log subscription, which tracks real-time data from a chosen log group to a specified destination.
    */
  @js.native
  trait LogSubscription extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
    var LogGroupName: js.UndefOr[LogGroupName]
    var SubscriptionCreatedDateTime: js.UndefOr[SubscriptionCreatedDateTime]
  }

  object LogSubscription {
    @inline
    def apply(
        DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
        LogGroupName: js.UndefOr[LogGroupName] = js.undefined,
        SubscriptionCreatedDateTime: js.UndefOr[SubscriptionCreatedDateTime] = js.undefined
    ): LogSubscription = {
      val __obj = js.Dynamic.literal()
      DirectoryId.foreach(__v => __obj.updateDynamic("DirectoryId")(__v.asInstanceOf[js.Any]))
      LogGroupName.foreach(__v => __obj.updateDynamic("LogGroupName")(__v.asInstanceOf[js.Any]))
      SubscriptionCreatedDateTime.foreach(
        __v => __obj.updateDynamic("SubscriptionCreatedDateTime")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[LogSubscription]
    }
  }

  /**
    * Describes the directory owner account details that have been shared to the directory consumer account.
    */
  @js.native
  trait OwnerDirectoryDescription extends js.Object {
    var AccountId: js.UndefOr[CustomerId]
    var DirectoryId: js.UndefOr[DirectoryId]
    var DnsIpAddrs: js.UndefOr[DnsIpAddrs]
    var RadiusSettings: js.UndefOr[RadiusSettings]
    var RadiusStatus: js.UndefOr[RadiusStatus]
    var VpcSettings: js.UndefOr[DirectoryVpcSettingsDescription]
  }

  object OwnerDirectoryDescription {
    @inline
    def apply(
        AccountId: js.UndefOr[CustomerId] = js.undefined,
        DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
        DnsIpAddrs: js.UndefOr[DnsIpAddrs] = js.undefined,
        RadiusSettings: js.UndefOr[RadiusSettings] = js.undefined,
        RadiusStatus: js.UndefOr[RadiusStatus] = js.undefined,
        VpcSettings: js.UndefOr[DirectoryVpcSettingsDescription] = js.undefined
    ): OwnerDirectoryDescription = {
      val __obj = js.Dynamic.literal()
      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      DirectoryId.foreach(__v => __obj.updateDynamic("DirectoryId")(__v.asInstanceOf[js.Any]))
      DnsIpAddrs.foreach(__v => __obj.updateDynamic("DnsIpAddrs")(__v.asInstanceOf[js.Any]))
      RadiusSettings.foreach(__v => __obj.updateDynamic("RadiusSettings")(__v.asInstanceOf[js.Any]))
      RadiusStatus.foreach(__v => __obj.updateDynamic("RadiusStatus")(__v.asInstanceOf[js.Any]))
      VpcSettings.foreach(__v => __obj.updateDynamic("VpcSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OwnerDirectoryDescription]
    }
  }

  object RadiusAuthenticationProtocolEnum {
    val PAP         = "PAP"
    val CHAP        = "CHAP"
    val `MS-CHAPv1` = "MS-CHAPv1"
    val `MS-CHAPv2` = "MS-CHAPv2"

    val values = js.Object.freeze(js.Array(PAP, CHAP, `MS-CHAPv1`, `MS-CHAPv2`))
  }

  /**
    * Contains information about a Remote Authentication Dial In User Service (RADIUS) server.
    */
  @js.native
  trait RadiusSettings extends js.Object {
    var AuthenticationProtocol: js.UndefOr[RadiusAuthenticationProtocol]
    var DisplayLabel: js.UndefOr[RadiusDisplayLabel]
    var RadiusPort: js.UndefOr[PortNumber]
    var RadiusRetries: js.UndefOr[RadiusRetries]
    var RadiusServers: js.UndefOr[Servers]
    var RadiusTimeout: js.UndefOr[RadiusTimeout]
    var SharedSecret: js.UndefOr[RadiusSharedSecret]
    var UseSameUsername: js.UndefOr[UseSameUsername]
  }

  object RadiusSettings {
    @inline
    def apply(
        AuthenticationProtocol: js.UndefOr[RadiusAuthenticationProtocol] = js.undefined,
        DisplayLabel: js.UndefOr[RadiusDisplayLabel] = js.undefined,
        RadiusPort: js.UndefOr[PortNumber] = js.undefined,
        RadiusRetries: js.UndefOr[RadiusRetries] = js.undefined,
        RadiusServers: js.UndefOr[Servers] = js.undefined,
        RadiusTimeout: js.UndefOr[RadiusTimeout] = js.undefined,
        SharedSecret: js.UndefOr[RadiusSharedSecret] = js.undefined,
        UseSameUsername: js.UndefOr[UseSameUsername] = js.undefined
    ): RadiusSettings = {
      val __obj = js.Dynamic.literal()
      AuthenticationProtocol.foreach(__v => __obj.updateDynamic("AuthenticationProtocol")(__v.asInstanceOf[js.Any]))
      DisplayLabel.foreach(__v => __obj.updateDynamic("DisplayLabel")(__v.asInstanceOf[js.Any]))
      RadiusPort.foreach(__v => __obj.updateDynamic("RadiusPort")(__v.asInstanceOf[js.Any]))
      RadiusRetries.foreach(__v => __obj.updateDynamic("RadiusRetries")(__v.asInstanceOf[js.Any]))
      RadiusServers.foreach(__v => __obj.updateDynamic("RadiusServers")(__v.asInstanceOf[js.Any]))
      RadiusTimeout.foreach(__v => __obj.updateDynamic("RadiusTimeout")(__v.asInstanceOf[js.Any]))
      SharedSecret.foreach(__v => __obj.updateDynamic("SharedSecret")(__v.asInstanceOf[js.Any]))
      UseSameUsername.foreach(__v => __obj.updateDynamic("UseSameUsername")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RadiusSettings]
    }
  }

  object RadiusStatusEnum {
    val Creating  = "Creating"
    val Completed = "Completed"
    val Failed    = "Failed"

    val values = js.Object.freeze(js.Array(Creating, Completed, Failed))
  }

  /**
    * Registers a new event topic.
    */
  @js.native
  trait RegisterEventTopicRequest extends js.Object {
    var DirectoryId: DirectoryId
    var TopicName: TopicName
  }

  object RegisterEventTopicRequest {
    @inline
    def apply(
        DirectoryId: DirectoryId,
        TopicName: TopicName
    ): RegisterEventTopicRequest = {
      val __obj = js.Dynamic.literal(
        "DirectoryId" -> DirectoryId.asInstanceOf[js.Any],
        "TopicName"   -> TopicName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RegisterEventTopicRequest]
    }
  }

  /**
    * The result of a RegisterEventTopic request.
    */
  @js.native
  trait RegisterEventTopicResult extends js.Object {}

  object RegisterEventTopicResult {
    @inline
    def apply(
        ): RegisterEventTopicResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[RegisterEventTopicResult]
    }
  }

  @js.native
  trait RejectSharedDirectoryRequest extends js.Object {
    var SharedDirectoryId: DirectoryId
  }

  object RejectSharedDirectoryRequest {
    @inline
    def apply(
        SharedDirectoryId: DirectoryId
    ): RejectSharedDirectoryRequest = {
      val __obj = js.Dynamic.literal(
        "SharedDirectoryId" -> SharedDirectoryId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RejectSharedDirectoryRequest]
    }
  }

  @js.native
  trait RejectSharedDirectoryResult extends js.Object {
    var SharedDirectoryId: js.UndefOr[DirectoryId]
  }

  object RejectSharedDirectoryResult {
    @inline
    def apply(
        SharedDirectoryId: js.UndefOr[DirectoryId] = js.undefined
    ): RejectSharedDirectoryResult = {
      val __obj = js.Dynamic.literal()
      SharedDirectoryId.foreach(__v => __obj.updateDynamic("SharedDirectoryId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RejectSharedDirectoryResult]
    }
  }

  @js.native
  trait RemoveIpRoutesRequest extends js.Object {
    var CidrIps: CidrIps
    var DirectoryId: DirectoryId
  }

  object RemoveIpRoutesRequest {
    @inline
    def apply(
        CidrIps: CidrIps,
        DirectoryId: DirectoryId
    ): RemoveIpRoutesRequest = {
      val __obj = js.Dynamic.literal(
        "CidrIps"     -> CidrIps.asInstanceOf[js.Any],
        "DirectoryId" -> DirectoryId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RemoveIpRoutesRequest]
    }
  }

  @js.native
  trait RemoveIpRoutesResult extends js.Object {}

  object RemoveIpRoutesResult {
    @inline
    def apply(
        ): RemoveIpRoutesResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[RemoveIpRoutesResult]
    }
  }

  @js.native
  trait RemoveTagsFromResourceRequest extends js.Object {
    var ResourceId: ResourceId
    var TagKeys: TagKeys
  }

  object RemoveTagsFromResourceRequest {
    @inline
    def apply(
        ResourceId: ResourceId,
        TagKeys: TagKeys
    ): RemoveTagsFromResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "TagKeys"    -> TagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RemoveTagsFromResourceRequest]
    }
  }

  @js.native
  trait RemoveTagsFromResourceResult extends js.Object {}

  object RemoveTagsFromResourceResult {
    @inline
    def apply(
        ): RemoveTagsFromResourceResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[RemoveTagsFromResourceResult]
    }
  }

  object ReplicationScopeEnum {
    val Domain = "Domain"

    val values = js.Object.freeze(js.Array(Domain))
  }

  @js.native
  trait ResetUserPasswordRequest extends js.Object {
    var DirectoryId: DirectoryId
    var NewPassword: UserPassword
    var UserName: CustomerUserName
  }

  object ResetUserPasswordRequest {
    @inline
    def apply(
        DirectoryId: DirectoryId,
        NewPassword: UserPassword,
        UserName: CustomerUserName
    ): ResetUserPasswordRequest = {
      val __obj = js.Dynamic.literal(
        "DirectoryId" -> DirectoryId.asInstanceOf[js.Any],
        "NewPassword" -> NewPassword.asInstanceOf[js.Any],
        "UserName"    -> UserName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ResetUserPasswordRequest]
    }
  }

  @js.native
  trait ResetUserPasswordResult extends js.Object {}

  object ResetUserPasswordResult {
    @inline
    def apply(
        ): ResetUserPasswordResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[ResetUserPasswordResult]
    }
  }

  /**
    * An object representing the inputs for the <a>RestoreFromSnapshot</a> operation.
    */
  @js.native
  trait RestoreFromSnapshotRequest extends js.Object {
    var SnapshotId: SnapshotId
  }

  object RestoreFromSnapshotRequest {
    @inline
    def apply(
        SnapshotId: SnapshotId
    ): RestoreFromSnapshotRequest = {
      val __obj = js.Dynamic.literal(
        "SnapshotId" -> SnapshotId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RestoreFromSnapshotRequest]
    }
  }

  /**
    * Contains the results of the <a>RestoreFromSnapshot</a> operation.
    */
  @js.native
  trait RestoreFromSnapshotResult extends js.Object {}

  object RestoreFromSnapshotResult {
    @inline
    def apply(
        ): RestoreFromSnapshotResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[RestoreFromSnapshotResult]
    }
  }

  /**
    * Information about a schema extension.
    */
  @js.native
  trait SchemaExtensionInfo extends js.Object {
    var Description: js.UndefOr[Description]
    var DirectoryId: js.UndefOr[DirectoryId]
    var EndDateTime: js.UndefOr[EndDateTime]
    var SchemaExtensionId: js.UndefOr[SchemaExtensionId]
    var SchemaExtensionStatus: js.UndefOr[SchemaExtensionStatus]
    var SchemaExtensionStatusReason: js.UndefOr[SchemaExtensionStatusReason]
    var StartDateTime: js.UndefOr[StartDateTime]
  }

  object SchemaExtensionInfo {
    @inline
    def apply(
        Description: js.UndefOr[Description] = js.undefined,
        DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
        EndDateTime: js.UndefOr[EndDateTime] = js.undefined,
        SchemaExtensionId: js.UndefOr[SchemaExtensionId] = js.undefined,
        SchemaExtensionStatus: js.UndefOr[SchemaExtensionStatus] = js.undefined,
        SchemaExtensionStatusReason: js.UndefOr[SchemaExtensionStatusReason] = js.undefined,
        StartDateTime: js.UndefOr[StartDateTime] = js.undefined
    ): SchemaExtensionInfo = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DirectoryId.foreach(__v => __obj.updateDynamic("DirectoryId")(__v.asInstanceOf[js.Any]))
      EndDateTime.foreach(__v => __obj.updateDynamic("EndDateTime")(__v.asInstanceOf[js.Any]))
      SchemaExtensionId.foreach(__v => __obj.updateDynamic("SchemaExtensionId")(__v.asInstanceOf[js.Any]))
      SchemaExtensionStatus.foreach(__v => __obj.updateDynamic("SchemaExtensionStatus")(__v.asInstanceOf[js.Any]))
      SchemaExtensionStatusReason.foreach(
        __v => __obj.updateDynamic("SchemaExtensionStatusReason")(__v.asInstanceOf[js.Any])
      )
      StartDateTime.foreach(__v => __obj.updateDynamic("StartDateTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SchemaExtensionInfo]
    }
  }

  object SchemaExtensionStatusEnum {
    val Initializing       = "Initializing"
    val CreatingSnapshot   = "CreatingSnapshot"
    val UpdatingSchema     = "UpdatingSchema"
    val Replicating        = "Replicating"
    val CancelInProgress   = "CancelInProgress"
    val RollbackInProgress = "RollbackInProgress"
    val Cancelled          = "Cancelled"
    val Failed             = "Failed"
    val Completed          = "Completed"

    val values = js.Object.freeze(
      js.Array(
        Initializing,
        CreatingSnapshot,
        UpdatingSchema,
        Replicating,
        CancelInProgress,
        RollbackInProgress,
        Cancelled,
        Failed,
        Completed
      )
    )
  }

  object SelectiveAuthEnum {
    val Enabled  = "Enabled"
    val Disabled = "Disabled"

    val values = js.Object.freeze(js.Array(Enabled, Disabled))
  }

  @js.native
  trait ShareDirectoryRequest extends js.Object {
    var DirectoryId: DirectoryId
    var ShareMethod: ShareMethod
    var ShareTarget: ShareTarget
    var ShareNotes: js.UndefOr[Notes]
  }

  object ShareDirectoryRequest {
    @inline
    def apply(
        DirectoryId: DirectoryId,
        ShareMethod: ShareMethod,
        ShareTarget: ShareTarget,
        ShareNotes: js.UndefOr[Notes] = js.undefined
    ): ShareDirectoryRequest = {
      val __obj = js.Dynamic.literal(
        "DirectoryId" -> DirectoryId.asInstanceOf[js.Any],
        "ShareMethod" -> ShareMethod.asInstanceOf[js.Any],
        "ShareTarget" -> ShareTarget.asInstanceOf[js.Any]
      )

      ShareNotes.foreach(__v => __obj.updateDynamic("ShareNotes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ShareDirectoryRequest]
    }
  }

  @js.native
  trait ShareDirectoryResult extends js.Object {
    var SharedDirectoryId: js.UndefOr[DirectoryId]
  }

  object ShareDirectoryResult {
    @inline
    def apply(
        SharedDirectoryId: js.UndefOr[DirectoryId] = js.undefined
    ): ShareDirectoryResult = {
      val __obj = js.Dynamic.literal()
      SharedDirectoryId.foreach(__v => __obj.updateDynamic("SharedDirectoryId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ShareDirectoryResult]
    }
  }

  object ShareMethodEnum {
    val ORGANIZATIONS = "ORGANIZATIONS"
    val HANDSHAKE     = "HANDSHAKE"

    val values = js.Object.freeze(js.Array(ORGANIZATIONS, HANDSHAKE))
  }

  object ShareStatusEnum {
    val Shared            = "Shared"
    val PendingAcceptance = "PendingAcceptance"
    val Rejected          = "Rejected"
    val Rejecting         = "Rejecting"
    val RejectFailed      = "RejectFailed"
    val Sharing           = "Sharing"
    val ShareFailed       = "ShareFailed"
    val Deleted           = "Deleted"
    val Deleting          = "Deleting"

    val values = js.Object.freeze(
      js.Array(Shared, PendingAcceptance, Rejected, Rejecting, RejectFailed, Sharing, ShareFailed, Deleted, Deleting)
    )
  }

  /**
    * Identifier that contains details about the directory consumer account.
    */
  @js.native
  trait ShareTarget extends js.Object {
    var Id: TargetId
    var Type: TargetType
  }

  object ShareTarget {
    @inline
    def apply(
        Id: TargetId,
        Type: TargetType
    ): ShareTarget = {
      val __obj = js.Dynamic.literal(
        "Id"   -> Id.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ShareTarget]
    }
  }

  /**
    * Details about the shared directory in the directory owner account for which the share request in the directory consumer account has been accepted.
    */
  @js.native
  trait SharedDirectory extends js.Object {
    var CreatedDateTime: js.UndefOr[CreatedDateTime]
    var LastUpdatedDateTime: js.UndefOr[LastUpdatedDateTime]
    var OwnerAccountId: js.UndefOr[CustomerId]
    var OwnerDirectoryId: js.UndefOr[DirectoryId]
    var ShareMethod: js.UndefOr[ShareMethod]
    var ShareNotes: js.UndefOr[Notes]
    var ShareStatus: js.UndefOr[ShareStatus]
    var SharedAccountId: js.UndefOr[CustomerId]
    var SharedDirectoryId: js.UndefOr[DirectoryId]
  }

  object SharedDirectory {
    @inline
    def apply(
        CreatedDateTime: js.UndefOr[CreatedDateTime] = js.undefined,
        LastUpdatedDateTime: js.UndefOr[LastUpdatedDateTime] = js.undefined,
        OwnerAccountId: js.UndefOr[CustomerId] = js.undefined,
        OwnerDirectoryId: js.UndefOr[DirectoryId] = js.undefined,
        ShareMethod: js.UndefOr[ShareMethod] = js.undefined,
        ShareNotes: js.UndefOr[Notes] = js.undefined,
        ShareStatus: js.UndefOr[ShareStatus] = js.undefined,
        SharedAccountId: js.UndefOr[CustomerId] = js.undefined,
        SharedDirectoryId: js.UndefOr[DirectoryId] = js.undefined
    ): SharedDirectory = {
      val __obj = js.Dynamic.literal()
      CreatedDateTime.foreach(__v => __obj.updateDynamic("CreatedDateTime")(__v.asInstanceOf[js.Any]))
      LastUpdatedDateTime.foreach(__v => __obj.updateDynamic("LastUpdatedDateTime")(__v.asInstanceOf[js.Any]))
      OwnerAccountId.foreach(__v => __obj.updateDynamic("OwnerAccountId")(__v.asInstanceOf[js.Any]))
      OwnerDirectoryId.foreach(__v => __obj.updateDynamic("OwnerDirectoryId")(__v.asInstanceOf[js.Any]))
      ShareMethod.foreach(__v => __obj.updateDynamic("ShareMethod")(__v.asInstanceOf[js.Any]))
      ShareNotes.foreach(__v => __obj.updateDynamic("ShareNotes")(__v.asInstanceOf[js.Any]))
      ShareStatus.foreach(__v => __obj.updateDynamic("ShareStatus")(__v.asInstanceOf[js.Any]))
      SharedAccountId.foreach(__v => __obj.updateDynamic("SharedAccountId")(__v.asInstanceOf[js.Any]))
      SharedDirectoryId.foreach(__v => __obj.updateDynamic("SharedDirectoryId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SharedDirectory]
    }
  }

  /**
    * Describes a directory snapshot.
    */
  @js.native
  trait Snapshot extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
    var Name: js.UndefOr[SnapshotName]
    var SnapshotId: js.UndefOr[SnapshotId]
    var StartTime: js.UndefOr[StartTime]
    var Status: js.UndefOr[SnapshotStatus]
    var Type: js.UndefOr[SnapshotType]
  }

  object Snapshot {
    @inline
    def apply(
        DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
        Name: js.UndefOr[SnapshotName] = js.undefined,
        SnapshotId: js.UndefOr[SnapshotId] = js.undefined,
        StartTime: js.UndefOr[StartTime] = js.undefined,
        Status: js.UndefOr[SnapshotStatus] = js.undefined,
        Type: js.UndefOr[SnapshotType] = js.undefined
    ): Snapshot = {
      val __obj = js.Dynamic.literal()
      DirectoryId.foreach(__v => __obj.updateDynamic("DirectoryId")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      SnapshotId.foreach(__v => __obj.updateDynamic("SnapshotId")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Snapshot]
    }
  }

  /**
    * Contains manual snapshot limit information for a directory.
    */
  @js.native
  trait SnapshotLimits extends js.Object {
    var ManualSnapshotsCurrentCount: js.UndefOr[Limit]
    var ManualSnapshotsLimit: js.UndefOr[Limit]
    var ManualSnapshotsLimitReached: js.UndefOr[ManualSnapshotsLimitReached]
  }

  object SnapshotLimits {
    @inline
    def apply(
        ManualSnapshotsCurrentCount: js.UndefOr[Limit] = js.undefined,
        ManualSnapshotsLimit: js.UndefOr[Limit] = js.undefined,
        ManualSnapshotsLimitReached: js.UndefOr[ManualSnapshotsLimitReached] = js.undefined
    ): SnapshotLimits = {
      val __obj = js.Dynamic.literal()
      ManualSnapshotsCurrentCount.foreach(
        __v => __obj.updateDynamic("ManualSnapshotsCurrentCount")(__v.asInstanceOf[js.Any])
      )
      ManualSnapshotsLimit.foreach(__v => __obj.updateDynamic("ManualSnapshotsLimit")(__v.asInstanceOf[js.Any]))
      ManualSnapshotsLimitReached.foreach(
        __v => __obj.updateDynamic("ManualSnapshotsLimitReached")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[SnapshotLimits]
    }
  }

  object SnapshotStatusEnum {
    val Creating  = "Creating"
    val Completed = "Completed"
    val Failed    = "Failed"

    val values = js.Object.freeze(js.Array(Creating, Completed, Failed))
  }

  object SnapshotTypeEnum {
    val Auto   = "Auto"
    val Manual = "Manual"

    val values = js.Object.freeze(js.Array(Auto, Manual))
  }

  @js.native
  trait StartSchemaExtensionRequest extends js.Object {
    var CreateSnapshotBeforeSchemaExtension: CreateSnapshotBeforeSchemaExtension
    var Description: Description
    var DirectoryId: DirectoryId
    var LdifContent: LdifContent
  }

  object StartSchemaExtensionRequest {
    @inline
    def apply(
        CreateSnapshotBeforeSchemaExtension: CreateSnapshotBeforeSchemaExtension,
        Description: Description,
        DirectoryId: DirectoryId,
        LdifContent: LdifContent
    ): StartSchemaExtensionRequest = {
      val __obj = js.Dynamic.literal(
        "CreateSnapshotBeforeSchemaExtension" -> CreateSnapshotBeforeSchemaExtension.asInstanceOf[js.Any],
        "Description"                         -> Description.asInstanceOf[js.Any],
        "DirectoryId"                         -> DirectoryId.asInstanceOf[js.Any],
        "LdifContent"                         -> LdifContent.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StartSchemaExtensionRequest]
    }
  }

  @js.native
  trait StartSchemaExtensionResult extends js.Object {
    var SchemaExtensionId: js.UndefOr[SchemaExtensionId]
  }

  object StartSchemaExtensionResult {
    @inline
    def apply(
        SchemaExtensionId: js.UndefOr[SchemaExtensionId] = js.undefined
    ): StartSchemaExtensionResult = {
      val __obj = js.Dynamic.literal()
      SchemaExtensionId.foreach(__v => __obj.updateDynamic("SchemaExtensionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartSchemaExtensionResult]
    }
  }

  /**
    * Metadata assigned to a directory consisting of a key-value pair.
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
        "Key"   -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Tag]
    }
  }

  object TargetTypeEnum {
    val ACCOUNT = "ACCOUNT"

    val values = js.Object.freeze(js.Array(ACCOUNT))
  }

  object TopicStatusEnum {
    val Registered        = "Registered"
    val `Topic not found` = "Topic not found"
    val Failed            = "Failed"
    val Deleted           = "Deleted"

    val values = js.Object.freeze(js.Array(Registered, `Topic not found`, Failed, Deleted))
  }

  /**
    * Describes a trust relationship between an AWS Managed Microsoft AD directory and an external domain.
    */
  @js.native
  trait Trust extends js.Object {
    var CreatedDateTime: js.UndefOr[CreatedDateTime]
    var DirectoryId: js.UndefOr[DirectoryId]
    var LastUpdatedDateTime: js.UndefOr[LastUpdatedDateTime]
    var RemoteDomainName: js.UndefOr[RemoteDomainName]
    var SelectiveAuth: js.UndefOr[SelectiveAuth]
    var StateLastUpdatedDateTime: js.UndefOr[StateLastUpdatedDateTime]
    var TrustDirection: js.UndefOr[TrustDirection]
    var TrustId: js.UndefOr[TrustId]
    var TrustState: js.UndefOr[TrustState]
    var TrustStateReason: js.UndefOr[TrustStateReason]
    var TrustType: js.UndefOr[TrustType]
  }

  object Trust {
    @inline
    def apply(
        CreatedDateTime: js.UndefOr[CreatedDateTime] = js.undefined,
        DirectoryId: js.UndefOr[DirectoryId] = js.undefined,
        LastUpdatedDateTime: js.UndefOr[LastUpdatedDateTime] = js.undefined,
        RemoteDomainName: js.UndefOr[RemoteDomainName] = js.undefined,
        SelectiveAuth: js.UndefOr[SelectiveAuth] = js.undefined,
        StateLastUpdatedDateTime: js.UndefOr[StateLastUpdatedDateTime] = js.undefined,
        TrustDirection: js.UndefOr[TrustDirection] = js.undefined,
        TrustId: js.UndefOr[TrustId] = js.undefined,
        TrustState: js.UndefOr[TrustState] = js.undefined,
        TrustStateReason: js.UndefOr[TrustStateReason] = js.undefined,
        TrustType: js.UndefOr[TrustType] = js.undefined
    ): Trust = {
      val __obj = js.Dynamic.literal()
      CreatedDateTime.foreach(__v => __obj.updateDynamic("CreatedDateTime")(__v.asInstanceOf[js.Any]))
      DirectoryId.foreach(__v => __obj.updateDynamic("DirectoryId")(__v.asInstanceOf[js.Any]))
      LastUpdatedDateTime.foreach(__v => __obj.updateDynamic("LastUpdatedDateTime")(__v.asInstanceOf[js.Any]))
      RemoteDomainName.foreach(__v => __obj.updateDynamic("RemoteDomainName")(__v.asInstanceOf[js.Any]))
      SelectiveAuth.foreach(__v => __obj.updateDynamic("SelectiveAuth")(__v.asInstanceOf[js.Any]))
      StateLastUpdatedDateTime.foreach(__v => __obj.updateDynamic("StateLastUpdatedDateTime")(__v.asInstanceOf[js.Any]))
      TrustDirection.foreach(__v => __obj.updateDynamic("TrustDirection")(__v.asInstanceOf[js.Any]))
      TrustId.foreach(__v => __obj.updateDynamic("TrustId")(__v.asInstanceOf[js.Any]))
      TrustState.foreach(__v => __obj.updateDynamic("TrustState")(__v.asInstanceOf[js.Any]))
      TrustStateReason.foreach(__v => __obj.updateDynamic("TrustStateReason")(__v.asInstanceOf[js.Any]))
      TrustType.foreach(__v => __obj.updateDynamic("TrustType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Trust]
    }
  }

  object TrustDirectionEnum {
    val `One-Way: Outgoing` = "One-Way: Outgoing"
    val `One-Way: Incoming` = "One-Way: Incoming"
    val `Two-Way`           = "Two-Way"

    val values = js.Object.freeze(js.Array(`One-Way: Outgoing`, `One-Way: Incoming`, `Two-Way`))
  }

  object TrustStateEnum {
    val Creating     = "Creating"
    val Created      = "Created"
    val Verifying    = "Verifying"
    val VerifyFailed = "VerifyFailed"
    val Verified     = "Verified"
    val Updating     = "Updating"
    val UpdateFailed = "UpdateFailed"
    val Updated      = "Updated"
    val Deleting     = "Deleting"
    val Deleted      = "Deleted"
    val Failed       = "Failed"

    val values = js.Object.freeze(
      js.Array(
        Creating,
        Created,
        Verifying,
        VerifyFailed,
        Verified,
        Updating,
        UpdateFailed,
        Updated,
        Deleting,
        Deleted,
        Failed
      )
    )
  }

  object TrustTypeEnum {
    val Forest   = "Forest"
    val External = "External"

    val values = js.Object.freeze(js.Array(Forest, External))
  }

  @js.native
  trait UnshareDirectoryRequest extends js.Object {
    var DirectoryId: DirectoryId
    var UnshareTarget: UnshareTarget
  }

  object UnshareDirectoryRequest {
    @inline
    def apply(
        DirectoryId: DirectoryId,
        UnshareTarget: UnshareTarget
    ): UnshareDirectoryRequest = {
      val __obj = js.Dynamic.literal(
        "DirectoryId"   -> DirectoryId.asInstanceOf[js.Any],
        "UnshareTarget" -> UnshareTarget.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UnshareDirectoryRequest]
    }
  }

  @js.native
  trait UnshareDirectoryResult extends js.Object {
    var SharedDirectoryId: js.UndefOr[DirectoryId]
  }

  object UnshareDirectoryResult {
    @inline
    def apply(
        SharedDirectoryId: js.UndefOr[DirectoryId] = js.undefined
    ): UnshareDirectoryResult = {
      val __obj = js.Dynamic.literal()
      SharedDirectoryId.foreach(__v => __obj.updateDynamic("SharedDirectoryId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UnshareDirectoryResult]
    }
  }

  /**
    * Identifier that contains details about the directory consumer account with whom the directory is being unshared.
    */
  @js.native
  trait UnshareTarget extends js.Object {
    var Id: TargetId
    var Type: TargetType
  }

  object UnshareTarget {
    @inline
    def apply(
        Id: TargetId,
        Type: TargetType
    ): UnshareTarget = {
      val __obj = js.Dynamic.literal(
        "Id"   -> Id.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UnshareTarget]
    }
  }

  /**
    * Updates a conditional forwarder.
    */
  @js.native
  trait UpdateConditionalForwarderRequest extends js.Object {
    var DirectoryId: DirectoryId
    var DnsIpAddrs: DnsIpAddrs
    var RemoteDomainName: RemoteDomainName
  }

  object UpdateConditionalForwarderRequest {
    @inline
    def apply(
        DirectoryId: DirectoryId,
        DnsIpAddrs: DnsIpAddrs,
        RemoteDomainName: RemoteDomainName
    ): UpdateConditionalForwarderRequest = {
      val __obj = js.Dynamic.literal(
        "DirectoryId"      -> DirectoryId.asInstanceOf[js.Any],
        "DnsIpAddrs"       -> DnsIpAddrs.asInstanceOf[js.Any],
        "RemoteDomainName" -> RemoteDomainName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateConditionalForwarderRequest]
    }
  }

  /**
    * The result of an UpdateConditionalForwarder request.
    */
  @js.native
  trait UpdateConditionalForwarderResult extends js.Object {}

  object UpdateConditionalForwarderResult {
    @inline
    def apply(
        ): UpdateConditionalForwarderResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateConditionalForwarderResult]
    }
  }

  @js.native
  trait UpdateNumberOfDomainControllersRequest extends js.Object {
    var DesiredNumber: DesiredNumberOfDomainControllers
    var DirectoryId: DirectoryId
  }

  object UpdateNumberOfDomainControllersRequest {
    @inline
    def apply(
        DesiredNumber: DesiredNumberOfDomainControllers,
        DirectoryId: DirectoryId
    ): UpdateNumberOfDomainControllersRequest = {
      val __obj = js.Dynamic.literal(
        "DesiredNumber" -> DesiredNumber.asInstanceOf[js.Any],
        "DirectoryId"   -> DirectoryId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateNumberOfDomainControllersRequest]
    }
  }

  @js.native
  trait UpdateNumberOfDomainControllersResult extends js.Object {}

  object UpdateNumberOfDomainControllersResult {
    @inline
    def apply(
        ): UpdateNumberOfDomainControllersResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateNumberOfDomainControllersResult]
    }
  }

  /**
    * Contains the inputs for the <a>UpdateRadius</a> operation.
    */
  @js.native
  trait UpdateRadiusRequest extends js.Object {
    var DirectoryId: DirectoryId
    var RadiusSettings: RadiusSettings
  }

  object UpdateRadiusRequest {
    @inline
    def apply(
        DirectoryId: DirectoryId,
        RadiusSettings: RadiusSettings
    ): UpdateRadiusRequest = {
      val __obj = js.Dynamic.literal(
        "DirectoryId"    -> DirectoryId.asInstanceOf[js.Any],
        "RadiusSettings" -> RadiusSettings.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateRadiusRequest]
    }
  }

  /**
    * Contains the results of the <a>UpdateRadius</a> operation.
    */
  @js.native
  trait UpdateRadiusResult extends js.Object {}

  object UpdateRadiusResult {
    @inline
    def apply(
        ): UpdateRadiusResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateRadiusResult]
    }
  }

  @js.native
  trait UpdateTrustRequest extends js.Object {
    var TrustId: TrustId
    var SelectiveAuth: js.UndefOr[SelectiveAuth]
  }

  object UpdateTrustRequest {
    @inline
    def apply(
        TrustId: TrustId,
        SelectiveAuth: js.UndefOr[SelectiveAuth] = js.undefined
    ): UpdateTrustRequest = {
      val __obj = js.Dynamic.literal(
        "TrustId" -> TrustId.asInstanceOf[js.Any]
      )

      SelectiveAuth.foreach(__v => __obj.updateDynamic("SelectiveAuth")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateTrustRequest]
    }
  }

  @js.native
  trait UpdateTrustResult extends js.Object {
    var RequestId: js.UndefOr[RequestId]
    var TrustId: js.UndefOr[TrustId]
  }

  object UpdateTrustResult {
    @inline
    def apply(
        RequestId: js.UndefOr[RequestId] = js.undefined,
        TrustId: js.UndefOr[TrustId] = js.undefined
    ): UpdateTrustResult = {
      val __obj = js.Dynamic.literal()
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      TrustId.foreach(__v => __obj.updateDynamic("TrustId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateTrustResult]
    }
  }

  /**
    * Initiates the verification of an existing trust relationship between an AWS Managed Microsoft AD directory and an external domain.
    */
  @js.native
  trait VerifyTrustRequest extends js.Object {
    var TrustId: TrustId
  }

  object VerifyTrustRequest {
    @inline
    def apply(
        TrustId: TrustId
    ): VerifyTrustRequest = {
      val __obj = js.Dynamic.literal(
        "TrustId" -> TrustId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[VerifyTrustRequest]
    }
  }

  /**
    * Result of a VerifyTrust request.
    */
  @js.native
  trait VerifyTrustResult extends js.Object {
    var TrustId: js.UndefOr[TrustId]
  }

  object VerifyTrustResult {
    @inline
    def apply(
        TrustId: js.UndefOr[TrustId] = js.undefined
    ): VerifyTrustResult = {
      val __obj = js.Dynamic.literal()
      TrustId.foreach(__v => __obj.updateDynamic("TrustId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VerifyTrustResult]
    }
  }
}
