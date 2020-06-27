package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object directoryservice {
  type AccessUrl                                  = String
  type AddedDateTime                              = js.Date
  type AliasName                                  = String
  type AttributeName                              = String
  type AttributeValue                             = String
  type Attributes                                 = js.Array[Attribute]
  type AvailabilityZone                           = String
  type AvailabilityZones                          = js.Array[AvailabilityZone]
  type CertificateCN                              = String
  type CertificateData                            = String
  type CertificateExpiryDateTime                  = js.Date
  type CertificateId                              = String
  type CertificateRegisteredDateTime              = js.Date
  type CertificateStateReason                     = String
  type CertificatesInfo                           = js.Array[CertificateInfo]
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
  type DirectoryId                                = String
  type DirectoryIds                               = js.Array[DirectoryId]
  type DirectoryName                              = String
  type DirectoryShortName                         = String
  type DnsIpAddrs                                 = js.Array[IpAddr]
  type DomainControllerId                         = String
  type DomainControllerIds                        = js.Array[DomainControllerId]
  type DomainControllerStatusReason               = String
  type DomainControllers                          = js.Array[DomainController]
  type EndDateTime                                = js.Date
  type EventTopics                                = js.Array[EventTopic]
  type IpAddr                                     = String
  type IpAddrs                                    = js.Array[IpAddr]
  type IpRouteStatusReason                        = String
  type IpRoutes                                   = js.Array[IpRoute]
  type IpRoutesInfo                               = js.Array[IpRouteInfo]
  type LDAPSSettingsInfo                          = js.Array[LDAPSSettingInfo]
  type LDAPSStatusReason                          = String
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
  type PageLimit                                  = Int
  type Password                                   = String
  type PortNumber                                 = Int
  type RadiusDisplayLabel                         = String
  type RadiusRetries                              = Int
  type RadiusSharedSecret                         = String
  type RadiusTimeout                              = Int
  type RemoteDomainName                           = String
  type RemoteDomainNames                          = js.Array[RemoteDomainName]
  type RequestId                                  = String
  type ResourceId                                 = String
  type SID                                        = String
  type SchemaExtensionId                          = String
  type SchemaExtensionStatusReason                = String
  type SchemaExtensionsInfo                       = js.Array[SchemaExtensionInfo]
  type SecurityGroupId                            = String
  type Server                                     = String
  type Servers                                    = js.Array[Server]
  type SharedDirectories                          = js.Array[SharedDirectory]
  type SnapshotId                                 = String
  type SnapshotIds                                = js.Array[SnapshotId]
  type SnapshotName                               = String
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
  type TopicArn                                   = String
  type TopicName                                  = String
  type TopicNames                                 = js.Array[TopicName]
  type TrustId                                    = String
  type TrustIds                                   = js.Array[TrustId]
  type TrustPassword                              = String
  type TrustStateReason                           = String
  type Trusts                                     = js.Array[Trust]
  type UpdateSecurityGroupForDirectoryControllers = Boolean
  type UseSameUsername                            = Boolean
  type UserName                                   = String
  type UserPassword                               = String
  type VpcId                                      = String

  implicit final class DirectoryServiceOps(private val service: DirectoryService) extends AnyVal {

    @inline def acceptSharedDirectoryFuture(params: AcceptSharedDirectoryRequest): Future[AcceptSharedDirectoryResult] =
      service.acceptSharedDirectory(params).promise().toFuture
    @inline def addIpRoutesFuture(params: AddIpRoutesRequest): Future[AddIpRoutesResult] =
      service.addIpRoutes(params).promise().toFuture
    @inline def addTagsToResourceFuture(params: AddTagsToResourceRequest): Future[AddTagsToResourceResult] =
      service.addTagsToResource(params).promise().toFuture
    @inline def cancelSchemaExtensionFuture(params: CancelSchemaExtensionRequest): Future[CancelSchemaExtensionResult] =
      service.cancelSchemaExtension(params).promise().toFuture
    @inline def connectDirectoryFuture(params: ConnectDirectoryRequest): Future[ConnectDirectoryResult] =
      service.connectDirectory(params).promise().toFuture
    @inline def createAliasFuture(params: CreateAliasRequest): Future[CreateAliasResult] =
      service.createAlias(params).promise().toFuture
    @inline def createComputerFuture(params: CreateComputerRequest): Future[CreateComputerResult] =
      service.createComputer(params).promise().toFuture
    @inline def createConditionalForwarderFuture(
        params: CreateConditionalForwarderRequest
    ): Future[CreateConditionalForwarderResult] = service.createConditionalForwarder(params).promise().toFuture
    @inline def createDirectoryFuture(params: CreateDirectoryRequest): Future[CreateDirectoryResult] =
      service.createDirectory(params).promise().toFuture
    @inline def createLogSubscriptionFuture(params: CreateLogSubscriptionRequest): Future[CreateLogSubscriptionResult] =
      service.createLogSubscription(params).promise().toFuture
    @inline def createMicrosoftADFuture(params: CreateMicrosoftADRequest): Future[CreateMicrosoftADResult] =
      service.createMicrosoftAD(params).promise().toFuture
    @inline def createSnapshotFuture(params: CreateSnapshotRequest): Future[CreateSnapshotResult] =
      service.createSnapshot(params).promise().toFuture
    @inline def createTrustFuture(params: CreateTrustRequest): Future[CreateTrustResult] =
      service.createTrust(params).promise().toFuture
    @inline def deleteConditionalForwarderFuture(
        params: DeleteConditionalForwarderRequest
    ): Future[DeleteConditionalForwarderResult] = service.deleteConditionalForwarder(params).promise().toFuture
    @inline def deleteDirectoryFuture(params: DeleteDirectoryRequest): Future[DeleteDirectoryResult] =
      service.deleteDirectory(params).promise().toFuture
    @inline def deleteLogSubscriptionFuture(params: DeleteLogSubscriptionRequest): Future[DeleteLogSubscriptionResult] =
      service.deleteLogSubscription(params).promise().toFuture
    @inline def deleteSnapshotFuture(params: DeleteSnapshotRequest): Future[DeleteSnapshotResult] =
      service.deleteSnapshot(params).promise().toFuture
    @inline def deleteTrustFuture(params: DeleteTrustRequest): Future[DeleteTrustResult] =
      service.deleteTrust(params).promise().toFuture
    @inline def deregisterCertificateFuture(params: DeregisterCertificateRequest): Future[DeregisterCertificateResult] =
      service.deregisterCertificate(params).promise().toFuture
    @inline def deregisterEventTopicFuture(params: DeregisterEventTopicRequest): Future[DeregisterEventTopicResult] =
      service.deregisterEventTopic(params).promise().toFuture
    @inline def describeCertificateFuture(params: DescribeCertificateRequest): Future[DescribeCertificateResult] =
      service.describeCertificate(params).promise().toFuture
    @inline def describeConditionalForwardersFuture(
        params: DescribeConditionalForwardersRequest
    ): Future[DescribeConditionalForwardersResult] = service.describeConditionalForwarders(params).promise().toFuture
    @inline def describeDirectoriesFuture(params: DescribeDirectoriesRequest): Future[DescribeDirectoriesResult] =
      service.describeDirectories(params).promise().toFuture
    @inline def describeDomainControllersFuture(
        params: DescribeDomainControllersRequest
    ): Future[DescribeDomainControllersResult] = service.describeDomainControllers(params).promise().toFuture
    @inline def describeEventTopicsFuture(params: DescribeEventTopicsRequest): Future[DescribeEventTopicsResult] =
      service.describeEventTopics(params).promise().toFuture
    @inline def describeLDAPSSettingsFuture(params: DescribeLDAPSSettingsRequest): Future[DescribeLDAPSSettingsResult] =
      service.describeLDAPSSettings(params).promise().toFuture
    @inline def describeSharedDirectoriesFuture(
        params: DescribeSharedDirectoriesRequest
    ): Future[DescribeSharedDirectoriesResult] = service.describeSharedDirectories(params).promise().toFuture
    @inline def describeSnapshotsFuture(params: DescribeSnapshotsRequest): Future[DescribeSnapshotsResult] =
      service.describeSnapshots(params).promise().toFuture
    @inline def describeTrustsFuture(params: DescribeTrustsRequest): Future[DescribeTrustsResult] =
      service.describeTrusts(params).promise().toFuture
    @inline def disableLDAPSFuture(params: DisableLDAPSRequest): Future[DisableLDAPSResult] =
      service.disableLDAPS(params).promise().toFuture
    @inline def disableRadiusFuture(params: DisableRadiusRequest): Future[DisableRadiusResult] =
      service.disableRadius(params).promise().toFuture
    @inline def disableSsoFuture(params: DisableSsoRequest): Future[DisableSsoResult] =
      service.disableSso(params).promise().toFuture
    @inline def enableLDAPSFuture(params: EnableLDAPSRequest): Future[EnableLDAPSResult] =
      service.enableLDAPS(params).promise().toFuture
    @inline def enableRadiusFuture(params: EnableRadiusRequest): Future[EnableRadiusResult] =
      service.enableRadius(params).promise().toFuture
    @inline def enableSsoFuture(params: EnableSsoRequest): Future[EnableSsoResult] =
      service.enableSso(params).promise().toFuture
    @inline def getDirectoryLimitsFuture(params: GetDirectoryLimitsRequest): Future[GetDirectoryLimitsResult] =
      service.getDirectoryLimits(params).promise().toFuture
    @inline def getSnapshotLimitsFuture(params: GetSnapshotLimitsRequest): Future[GetSnapshotLimitsResult] =
      service.getSnapshotLimits(params).promise().toFuture
    @inline def listCertificatesFuture(params: ListCertificatesRequest): Future[ListCertificatesResult] =
      service.listCertificates(params).promise().toFuture
    @inline def listIpRoutesFuture(params: ListIpRoutesRequest): Future[ListIpRoutesResult] =
      service.listIpRoutes(params).promise().toFuture
    @inline def listLogSubscriptionsFuture(params: ListLogSubscriptionsRequest): Future[ListLogSubscriptionsResult] =
      service.listLogSubscriptions(params).promise().toFuture
    @inline def listSchemaExtensionsFuture(params: ListSchemaExtensionsRequest): Future[ListSchemaExtensionsResult] =
      service.listSchemaExtensions(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResult] =
      service.listTagsForResource(params).promise().toFuture
    @inline def registerCertificateFuture(params: RegisterCertificateRequest): Future[RegisterCertificateResult] =
      service.registerCertificate(params).promise().toFuture
    @inline def registerEventTopicFuture(params: RegisterEventTopicRequest): Future[RegisterEventTopicResult] =
      service.registerEventTopic(params).promise().toFuture
    @inline def rejectSharedDirectoryFuture(params: RejectSharedDirectoryRequest): Future[RejectSharedDirectoryResult] =
      service.rejectSharedDirectory(params).promise().toFuture
    @inline def removeIpRoutesFuture(params: RemoveIpRoutesRequest): Future[RemoveIpRoutesResult] =
      service.removeIpRoutes(params).promise().toFuture
    @inline def removeTagsFromResourceFuture(
        params: RemoveTagsFromResourceRequest
    ): Future[RemoveTagsFromResourceResult] = service.removeTagsFromResource(params).promise().toFuture
    @inline def resetUserPasswordFuture(params: ResetUserPasswordRequest): Future[ResetUserPasswordResult] =
      service.resetUserPassword(params).promise().toFuture
    @inline def restoreFromSnapshotFuture(params: RestoreFromSnapshotRequest): Future[RestoreFromSnapshotResult] =
      service.restoreFromSnapshot(params).promise().toFuture
    @inline def shareDirectoryFuture(params: ShareDirectoryRequest): Future[ShareDirectoryResult] =
      service.shareDirectory(params).promise().toFuture
    @inline def startSchemaExtensionFuture(params: StartSchemaExtensionRequest): Future[StartSchemaExtensionResult] =
      service.startSchemaExtension(params).promise().toFuture
    @inline def unshareDirectoryFuture(params: UnshareDirectoryRequest): Future[UnshareDirectoryResult] =
      service.unshareDirectory(params).promise().toFuture
    @inline def updateConditionalForwarderFuture(
        params: UpdateConditionalForwarderRequest
    ): Future[UpdateConditionalForwarderResult] = service.updateConditionalForwarder(params).promise().toFuture
    @inline def updateNumberOfDomainControllersFuture(
        params: UpdateNumberOfDomainControllersRequest
    ): Future[UpdateNumberOfDomainControllersResult] =
      service.updateNumberOfDomainControllers(params).promise().toFuture
    @inline def updateRadiusFuture(params: UpdateRadiusRequest): Future[UpdateRadiusResult] =
      service.updateRadius(params).promise().toFuture
    @inline def updateTrustFuture(params: UpdateTrustRequest): Future[UpdateTrustResult] =
      service.updateTrust(params).promise().toFuture
    @inline def verifyTrustFuture(params: VerifyTrustRequest): Future[VerifyTrustResult] =
      service.verifyTrust(params).promise().toFuture
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
    def deregisterCertificate(params: DeregisterCertificateRequest): Request[DeregisterCertificateResult] = js.native
    def deregisterEventTopic(params: DeregisterEventTopicRequest): Request[DeregisterEventTopicResult]    = js.native
    def describeCertificate(params: DescribeCertificateRequest): Request[DescribeCertificateResult]       = js.native
    def describeConditionalForwarders(
        params: DescribeConditionalForwardersRequest
    ): Request[DescribeConditionalForwardersResult]                                                 = js.native
    def describeDirectories(params: DescribeDirectoriesRequest): Request[DescribeDirectoriesResult] = js.native
    def describeDomainControllers(params: DescribeDomainControllersRequest): Request[DescribeDomainControllersResult] =
      js.native
    def describeEventTopics(params: DescribeEventTopicsRequest): Request[DescribeEventTopicsResult]       = js.native
    def describeLDAPSSettings(params: DescribeLDAPSSettingsRequest): Request[DescribeLDAPSSettingsResult] = js.native
    def describeSharedDirectories(params: DescribeSharedDirectoriesRequest): Request[DescribeSharedDirectoriesResult] =
      js.native
    def describeSnapshots(params: DescribeSnapshotsRequest): Request[DescribeSnapshotsResult]                = js.native
    def describeTrusts(params: DescribeTrustsRequest): Request[DescribeTrustsResult]                         = js.native
    def disableLDAPS(params: DisableLDAPSRequest): Request[DisableLDAPSResult]                               = js.native
    def disableRadius(params: DisableRadiusRequest): Request[DisableRadiusResult]                            = js.native
    def disableSso(params: DisableSsoRequest): Request[DisableSsoResult]                                     = js.native
    def enableLDAPS(params: EnableLDAPSRequest): Request[EnableLDAPSResult]                                  = js.native
    def enableRadius(params: EnableRadiusRequest): Request[EnableRadiusResult]                               = js.native
    def enableSso(params: EnableSsoRequest): Request[EnableSsoResult]                                        = js.native
    def getDirectoryLimits(params: GetDirectoryLimitsRequest): Request[GetDirectoryLimitsResult]             = js.native
    def getSnapshotLimits(params: GetSnapshotLimitsRequest): Request[GetSnapshotLimitsResult]                = js.native
    def listCertificates(params: ListCertificatesRequest): Request[ListCertificatesResult]                   = js.native
    def listIpRoutes(params: ListIpRoutesRequest): Request[ListIpRoutesResult]                               = js.native
    def listLogSubscriptions(params: ListLogSubscriptionsRequest): Request[ListLogSubscriptionsResult]       = js.native
    def listSchemaExtensions(params: ListSchemaExtensionsRequest): Request[ListSchemaExtensionsResult]       = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResult]          = js.native
    def registerCertificate(params: RegisterCertificateRequest): Request[RegisterCertificateResult]          = js.native
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
  @Factory
  trait AcceptSharedDirectoryRequest extends js.Object {
    var SharedDirectoryId: DirectoryId
  }

  @js.native
  @Factory
  trait AcceptSharedDirectoryResult extends js.Object {
    var SharedDirectory: js.UndefOr[SharedDirectory]
  }

  @js.native
  @Factory
  trait AddIpRoutesRequest extends js.Object {
    var DirectoryId: DirectoryId
    var IpRoutes: IpRoutes
    var UpdateSecurityGroupForDirectoryControllers: js.UndefOr[UpdateSecurityGroupForDirectoryControllers]
  }

  @js.native
  @Factory
  trait AddIpRoutesResult extends js.Object {}

  @js.native
  @Factory
  trait AddTagsToResourceRequest extends js.Object {
    var ResourceId: ResourceId
    var Tags: Tags
  }

  @js.native
  @Factory
  trait AddTagsToResourceResult extends js.Object {}

  /**
    * Represents a named directory attribute.
    */
  @js.native
  @Factory
  trait Attribute extends js.Object {
    var Name: js.UndefOr[AttributeName]
    var Value: js.UndefOr[AttributeValue]
  }

  @js.native
  @Factory
  trait CancelSchemaExtensionRequest extends js.Object {
    var DirectoryId: DirectoryId
    var SchemaExtensionId: SchemaExtensionId
  }

  @js.native
  @Factory
  trait CancelSchemaExtensionResult extends js.Object {}

  /**
    * Information about the certificate.
    */
  @js.native
  @Factory
  trait Certificate extends js.Object {
    var CertificateId: js.UndefOr[CertificateId]
    var CommonName: js.UndefOr[CertificateCN]
    var ExpiryDateTime: js.UndefOr[CertificateExpiryDateTime]
    var RegisteredDateTime: js.UndefOr[CertificateRegisteredDateTime]
    var State: js.UndefOr[CertificateState]
    var StateReason: js.UndefOr[CertificateStateReason]
  }

  /**
    * Contains general information about a certificate.
    */
  @js.native
  @Factory
  trait CertificateInfo extends js.Object {
    var CertificateId: js.UndefOr[CertificateId]
    var CommonName: js.UndefOr[CertificateCN]
    var ExpiryDateTime: js.UndefOr[CertificateExpiryDateTime]
    var State: js.UndefOr[CertificateState]
  }

  @js.native
  sealed trait CertificateState extends js.Any
  object CertificateState extends js.Object {
    val Registering      = "Registering".asInstanceOf[CertificateState]
    val Registered       = "Registered".asInstanceOf[CertificateState]
    val RegisterFailed   = "RegisterFailed".asInstanceOf[CertificateState]
    val Deregistering    = "Deregistering".asInstanceOf[CertificateState]
    val Deregistered     = "Deregistered".asInstanceOf[CertificateState]
    val DeregisterFailed = "DeregisterFailed".asInstanceOf[CertificateState]

    val values =
      js.Object.freeze(js.Array(Registering, Registered, RegisterFailed, Deregistering, Deregistered, DeregisterFailed))
  }

  /**
    * Contains information about a computer account in a directory.
    */
  @js.native
  @Factory
  trait Computer extends js.Object {
    var ComputerAttributes: js.UndefOr[Attributes]
    var ComputerId: js.UndefOr[SID]
    var ComputerName: js.UndefOr[ComputerName]
  }

  /**
    * Points to a remote domain with which you are setting up a trust relationship. Conditional forwarders are required in order to set up a trust relationship with another domain.
    */
  @js.native
  @Factory
  trait ConditionalForwarder extends js.Object {
    var DnsIpAddrs: js.UndefOr[DnsIpAddrs]
    var RemoteDomainName: js.UndefOr[RemoteDomainName]
    var ReplicationScope: js.UndefOr[ReplicationScope]
  }

  /**
    * Contains the inputs for the <a>ConnectDirectory</a> operation.
    */
  @js.native
  @Factory
  trait ConnectDirectoryRequest extends js.Object {
    var ConnectSettings: DirectoryConnectSettings
    var Name: DirectoryName
    var Password: ConnectPassword
    var Size: DirectorySize
    var Description: js.UndefOr[Description]
    var ShortName: js.UndefOr[DirectoryShortName]
    var Tags: js.UndefOr[Tags]
  }

  /**
    * Contains the results of the <a>ConnectDirectory</a> operation.
    */
  @js.native
  @Factory
  trait ConnectDirectoryResult extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
  }

  /**
    * Contains the inputs for the <a>CreateAlias</a> operation.
    */
  @js.native
  @Factory
  trait CreateAliasRequest extends js.Object {
    var Alias: AliasName
    var DirectoryId: DirectoryId
  }

  /**
    * Contains the results of the <a>CreateAlias</a> operation.
    */
  @js.native
  @Factory
  trait CreateAliasResult extends js.Object {
    var Alias: js.UndefOr[AliasName]
    var DirectoryId: js.UndefOr[DirectoryId]
  }

  /**
    * Contains the inputs for the <a>CreateComputer</a> operation.
    */
  @js.native
  @Factory
  trait CreateComputerRequest extends js.Object {
    var ComputerName: ComputerName
    var DirectoryId: DirectoryId
    var Password: ComputerPassword
    var ComputerAttributes: js.UndefOr[Attributes]
    var OrganizationalUnitDistinguishedName: js.UndefOr[OrganizationalUnitDN]
  }

  /**
    * Contains the results for the <a>CreateComputer</a> operation.
    */
  @js.native
  @Factory
  trait CreateComputerResult extends js.Object {
    var Computer: js.UndefOr[Computer]
  }

  /**
    * Initiates the creation of a conditional forwarder for your AWS Directory Service for Microsoft Active Directory. Conditional forwarders are required in order to set up a trust relationship with another domain.
    */
  @js.native
  @Factory
  trait CreateConditionalForwarderRequest extends js.Object {
    var DirectoryId: DirectoryId
    var DnsIpAddrs: DnsIpAddrs
    var RemoteDomainName: RemoteDomainName
  }

  /**
    * The result of a CreateConditinalForwarder request.
    */
  @js.native
  @Factory
  trait CreateConditionalForwarderResult extends js.Object {}

  /**
    * Contains the inputs for the <a>CreateDirectory</a> operation.
    */
  @js.native
  @Factory
  trait CreateDirectoryRequest extends js.Object {
    var Name: DirectoryName
    var Password: Password
    var Size: DirectorySize
    var Description: js.UndefOr[Description]
    var ShortName: js.UndefOr[DirectoryShortName]
    var Tags: js.UndefOr[Tags]
    var VpcSettings: js.UndefOr[DirectoryVpcSettings]
  }

  /**
    * Contains the results of the <a>CreateDirectory</a> operation.
    */
  @js.native
  @Factory
  trait CreateDirectoryResult extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
  }

  @js.native
  @Factory
  trait CreateLogSubscriptionRequest extends js.Object {
    var DirectoryId: DirectoryId
    var LogGroupName: LogGroupName
  }

  @js.native
  @Factory
  trait CreateLogSubscriptionResult extends js.Object {}

  /**
    * Creates an AWS Managed Microsoft AD directory.
    */
  @js.native
  @Factory
  trait CreateMicrosoftADRequest extends js.Object {
    var Name: DirectoryName
    var Password: Password
    var VpcSettings: DirectoryVpcSettings
    var Description: js.UndefOr[Description]
    var Edition: js.UndefOr[DirectoryEdition]
    var ShortName: js.UndefOr[DirectoryShortName]
    var Tags: js.UndefOr[Tags]
  }

  /**
    * Result of a CreateMicrosoftAD request.
    */
  @js.native
  @Factory
  trait CreateMicrosoftADResult extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
  }

  /**
    * Contains the inputs for the <a>CreateSnapshot</a> operation.
    */
  @js.native
  @Factory
  trait CreateSnapshotRequest extends js.Object {
    var DirectoryId: DirectoryId
    var Name: js.UndefOr[SnapshotName]
  }

  /**
    * Contains the results of the <a>CreateSnapshot</a> operation.
    */
  @js.native
  @Factory
  trait CreateSnapshotResult extends js.Object {
    var SnapshotId: js.UndefOr[SnapshotId]
  }

  /**
    * AWS Directory Service for Microsoft Active Directory allows you to configure trust relationships. For example, you can establish a trust between your AWS Managed Microsoft AD directory, and your existing on-premises Microsoft Active Directory. This would allow you to provide users and groups access to resources in either domain, with a single set of credentials.
    *  This action initiates the creation of the AWS side of a trust relationship between an AWS Managed Microsoft AD directory and an external domain.
    */
  @js.native
  @Factory
  trait CreateTrustRequest extends js.Object {
    var DirectoryId: DirectoryId
    var RemoteDomainName: RemoteDomainName
    var TrustDirection: TrustDirection
    var TrustPassword: TrustPassword
    var ConditionalForwarderIpAddrs: js.UndefOr[DnsIpAddrs]
    var SelectiveAuth: js.UndefOr[SelectiveAuth]
    var TrustType: js.UndefOr[TrustType]
  }

  /**
    * The result of a CreateTrust request.
    */
  @js.native
  @Factory
  trait CreateTrustResult extends js.Object {
    var TrustId: js.UndefOr[TrustId]
  }

  /**
    * Deletes a conditional forwarder.
    */
  @js.native
  @Factory
  trait DeleteConditionalForwarderRequest extends js.Object {
    var DirectoryId: DirectoryId
    var RemoteDomainName: RemoteDomainName
  }

  /**
    * The result of a DeleteConditionalForwarder request.
    */
  @js.native
  @Factory
  trait DeleteConditionalForwarderResult extends js.Object {}

  /**
    * Contains the inputs for the <a>DeleteDirectory</a> operation.
    */
  @js.native
  @Factory
  trait DeleteDirectoryRequest extends js.Object {
    var DirectoryId: DirectoryId
  }

  /**
    * Contains the results of the <a>DeleteDirectory</a> operation.
    */
  @js.native
  @Factory
  trait DeleteDirectoryResult extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
  }

  @js.native
  @Factory
  trait DeleteLogSubscriptionRequest extends js.Object {
    var DirectoryId: DirectoryId
  }

  @js.native
  @Factory
  trait DeleteLogSubscriptionResult extends js.Object {}

  /**
    * Contains the inputs for the <a>DeleteSnapshot</a> operation.
    */
  @js.native
  @Factory
  trait DeleteSnapshotRequest extends js.Object {
    var SnapshotId: SnapshotId
  }

  /**
    * Contains the results of the <a>DeleteSnapshot</a> operation.
    */
  @js.native
  @Factory
  trait DeleteSnapshotResult extends js.Object {
    var SnapshotId: js.UndefOr[SnapshotId]
  }

  /**
    * Deletes the local side of an existing trust relationship between the AWS Managed Microsoft AD directory and the external domain.
    */
  @js.native
  @Factory
  trait DeleteTrustRequest extends js.Object {
    var TrustId: TrustId
    var DeleteAssociatedConditionalForwarder: js.UndefOr[DeleteAssociatedConditionalForwarder]
  }

  /**
    * The result of a DeleteTrust request.
    */
  @js.native
  @Factory
  trait DeleteTrustResult extends js.Object {
    var TrustId: js.UndefOr[TrustId]
  }

  @js.native
  @Factory
  trait DeregisterCertificateRequest extends js.Object {
    var CertificateId: CertificateId
    var DirectoryId: DirectoryId
  }

  @js.native
  @Factory
  trait DeregisterCertificateResult extends js.Object {}

  /**
    * Removes the specified directory as a publisher to the specified SNS topic.
    */
  @js.native
  @Factory
  trait DeregisterEventTopicRequest extends js.Object {
    var DirectoryId: DirectoryId
    var TopicName: TopicName
  }

  /**
    * The result of a DeregisterEventTopic request.
    */
  @js.native
  @Factory
  trait DeregisterEventTopicResult extends js.Object {}

  @js.native
  @Factory
  trait DescribeCertificateRequest extends js.Object {
    var CertificateId: CertificateId
    var DirectoryId: DirectoryId
  }

  @js.native
  @Factory
  trait DescribeCertificateResult extends js.Object {
    var Certificate: js.UndefOr[Certificate]
  }

  /**
    * Describes a conditional forwarder.
    */
  @js.native
  @Factory
  trait DescribeConditionalForwardersRequest extends js.Object {
    var DirectoryId: DirectoryId
    var RemoteDomainNames: js.UndefOr[RemoteDomainNames]
  }

  /**
    * The result of a DescribeConditionalForwarder request.
    */
  @js.native
  @Factory
  trait DescribeConditionalForwardersResult extends js.Object {
    var ConditionalForwarders: js.UndefOr[ConditionalForwarders]
  }

  /**
    * Contains the inputs for the <a>DescribeDirectories</a> operation.
    */
  @js.native
  @Factory
  trait DescribeDirectoriesRequest extends js.Object {
    var DirectoryIds: js.UndefOr[DirectoryIds]
    var Limit: js.UndefOr[Limit]
    var NextToken: js.UndefOr[NextToken]
  }

  /**
    * Contains the results of the <a>DescribeDirectories</a> operation.
    */
  @js.native
  @Factory
  trait DescribeDirectoriesResult extends js.Object {
    var DirectoryDescriptions: js.UndefOr[DirectoryDescriptions]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeDomainControllersRequest extends js.Object {
    var DirectoryId: DirectoryId
    var DomainControllerIds: js.UndefOr[DomainControllerIds]
    var Limit: js.UndefOr[Limit]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeDomainControllersResult extends js.Object {
    var DomainControllers: js.UndefOr[DomainControllers]
    var NextToken: js.UndefOr[NextToken]
  }

  /**
    * Describes event topics.
    */
  @js.native
  @Factory
  trait DescribeEventTopicsRequest extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
    var TopicNames: js.UndefOr[TopicNames]
  }

  /**
    * The result of a DescribeEventTopic request.
    */
  @js.native
  @Factory
  trait DescribeEventTopicsResult extends js.Object {
    var EventTopics: js.UndefOr[EventTopics]
  }

  @js.native
  @Factory
  trait DescribeLDAPSSettingsRequest extends js.Object {
    var DirectoryId: DirectoryId
    var Limit: js.UndefOr[PageLimit]
    var NextToken: js.UndefOr[NextToken]
    var Type: js.UndefOr[LDAPSType]
  }

  @js.native
  @Factory
  trait DescribeLDAPSSettingsResult extends js.Object {
    var LDAPSSettingsInfo: js.UndefOr[LDAPSSettingsInfo]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeSharedDirectoriesRequest extends js.Object {
    var OwnerDirectoryId: DirectoryId
    var Limit: js.UndefOr[Limit]
    var NextToken: js.UndefOr[NextToken]
    var SharedDirectoryIds: js.UndefOr[DirectoryIds]
  }

  @js.native
  @Factory
  trait DescribeSharedDirectoriesResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var SharedDirectories: js.UndefOr[SharedDirectories]
  }

  /**
    * Contains the inputs for the <a>DescribeSnapshots</a> operation.
    */
  @js.native
  @Factory
  trait DescribeSnapshotsRequest extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
    var Limit: js.UndefOr[Limit]
    var NextToken: js.UndefOr[NextToken]
    var SnapshotIds: js.UndefOr[SnapshotIds]
  }

  /**
    * Contains the results of the <a>DescribeSnapshots</a> operation.
    */
  @js.native
  @Factory
  trait DescribeSnapshotsResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Snapshots: js.UndefOr[Snapshots]
  }

  /**
    * Describes the trust relationships for a particular AWS Managed Microsoft AD directory. If no input parameters are are provided, such as directory ID or trust ID, this request describes all the trust relationships.
    */
  @js.native
  @Factory
  trait DescribeTrustsRequest extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
    var Limit: js.UndefOr[Limit]
    var NextToken: js.UndefOr[NextToken]
    var TrustIds: js.UndefOr[TrustIds]
  }

  /**
    * The result of a DescribeTrust request.
    */
  @js.native
  @Factory
  trait DescribeTrustsResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Trusts: js.UndefOr[Trusts]
  }

  /**
    * Contains information for the <a>ConnectDirectory</a> operation when an AD Connector directory is being created.
    */
  @js.native
  @Factory
  trait DirectoryConnectSettings extends js.Object {
    var CustomerDnsIps: DnsIpAddrs
    var CustomerUserName: UserName
    var SubnetIds: SubnetIds
    var VpcId: VpcId
  }

  /**
    * Contains information about an AD Connector directory.
    */
  @js.native
  @Factory
  trait DirectoryConnectSettingsDescription extends js.Object {
    var AvailabilityZones: js.UndefOr[AvailabilityZones]
    var ConnectIps: js.UndefOr[IpAddrs]
    var CustomerUserName: js.UndefOr[UserName]
    var SecurityGroupId: js.UndefOr[SecurityGroupId]
    var SubnetIds: js.UndefOr[SubnetIds]
    var VpcId: js.UndefOr[VpcId]
  }

  /**
    * Contains information about an AWS Directory Service directory.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait DirectoryEdition extends js.Any
  object DirectoryEdition extends js.Object {
    val Enterprise = "Enterprise".asInstanceOf[DirectoryEdition]
    val Standard   = "Standard".asInstanceOf[DirectoryEdition]

    val values = js.Object.freeze(js.Array(Enterprise, Standard))
  }

  /**
    * Contains directory limit information for a Region.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait DirectorySize extends js.Any
  object DirectorySize extends js.Object {
    val Small = "Small".asInstanceOf[DirectorySize]
    val Large = "Large".asInstanceOf[DirectorySize]

    val values = js.Object.freeze(js.Array(Small, Large))
  }

  @js.native
  sealed trait DirectoryStage extends js.Any
  object DirectoryStage extends js.Object {
    val Requested     = "Requested".asInstanceOf[DirectoryStage]
    val Creating      = "Creating".asInstanceOf[DirectoryStage]
    val Created       = "Created".asInstanceOf[DirectoryStage]
    val Active        = "Active".asInstanceOf[DirectoryStage]
    val Inoperable    = "Inoperable".asInstanceOf[DirectoryStage]
    val Impaired      = "Impaired".asInstanceOf[DirectoryStage]
    val Restoring     = "Restoring".asInstanceOf[DirectoryStage]
    val RestoreFailed = "RestoreFailed".asInstanceOf[DirectoryStage]
    val Deleting      = "Deleting".asInstanceOf[DirectoryStage]
    val Deleted       = "Deleted".asInstanceOf[DirectoryStage]
    val Failed        = "Failed".asInstanceOf[DirectoryStage]

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

  @js.native
  sealed trait DirectoryType extends js.Any
  object DirectoryType extends js.Object {
    val SimpleAD          = "SimpleAD".asInstanceOf[DirectoryType]
    val ADConnector       = "ADConnector".asInstanceOf[DirectoryType]
    val MicrosoftAD       = "MicrosoftAD".asInstanceOf[DirectoryType]
    val SharedMicrosoftAD = "SharedMicrosoftAD".asInstanceOf[DirectoryType]

    val values = js.Object.freeze(js.Array(SimpleAD, ADConnector, MicrosoftAD, SharedMicrosoftAD))
  }

  /**
    * Contains VPC information for the <a>CreateDirectory</a> or <a>CreateMicrosoftAD</a> operation.
    */
  @js.native
  @Factory
  trait DirectoryVpcSettings extends js.Object {
    var SubnetIds: SubnetIds
    var VpcId: VpcId
  }

  /**
    * Contains information about the directory.
    */
  @js.native
  @Factory
  trait DirectoryVpcSettingsDescription extends js.Object {
    var AvailabilityZones: js.UndefOr[AvailabilityZones]
    var SecurityGroupId: js.UndefOr[SecurityGroupId]
    var SubnetIds: js.UndefOr[SubnetIds]
    var VpcId: js.UndefOr[VpcId]
  }

  @js.native
  @Factory
  trait DisableLDAPSRequest extends js.Object {
    var DirectoryId: DirectoryId
    var Type: LDAPSType
  }

  @js.native
  @Factory
  trait DisableLDAPSResult extends js.Object {}

  /**
    * Contains the inputs for the <a>DisableRadius</a> operation.
    */
  @js.native
  @Factory
  trait DisableRadiusRequest extends js.Object {
    var DirectoryId: DirectoryId
  }

  /**
    * Contains the results of the <a>DisableRadius</a> operation.
    */
  @js.native
  @Factory
  trait DisableRadiusResult extends js.Object {}

  /**
    * Contains the inputs for the <a>DisableSso</a> operation.
    */
  @js.native
  @Factory
  trait DisableSsoRequest extends js.Object {
    var DirectoryId: DirectoryId
    var Password: js.UndefOr[ConnectPassword]
    var UserName: js.UndefOr[UserName]
  }

  /**
    * Contains the results of the <a>DisableSso</a> operation.
    */
  @js.native
  @Factory
  trait DisableSsoResult extends js.Object {}

  /**
    * Contains information about the domain controllers for a specified directory.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait DomainControllerStatus extends js.Any
  object DomainControllerStatus extends js.Object {
    val Creating  = "Creating".asInstanceOf[DomainControllerStatus]
    val Active    = "Active".asInstanceOf[DomainControllerStatus]
    val Impaired  = "Impaired".asInstanceOf[DomainControllerStatus]
    val Restoring = "Restoring".asInstanceOf[DomainControllerStatus]
    val Deleting  = "Deleting".asInstanceOf[DomainControllerStatus]
    val Deleted   = "Deleted".asInstanceOf[DomainControllerStatus]
    val Failed    = "Failed".asInstanceOf[DomainControllerStatus]

    val values = js.Object.freeze(js.Array(Creating, Active, Impaired, Restoring, Deleting, Deleted, Failed))
  }

  @js.native
  @Factory
  trait EnableLDAPSRequest extends js.Object {
    var DirectoryId: DirectoryId
    var Type: LDAPSType
  }

  @js.native
  @Factory
  trait EnableLDAPSResult extends js.Object {}

  /**
    * Contains the inputs for the <a>EnableRadius</a> operation.
    */
  @js.native
  @Factory
  trait EnableRadiusRequest extends js.Object {
    var DirectoryId: DirectoryId
    var RadiusSettings: RadiusSettings
  }

  /**
    * Contains the results of the <a>EnableRadius</a> operation.
    */
  @js.native
  @Factory
  trait EnableRadiusResult extends js.Object {}

  /**
    * Contains the inputs for the <a>EnableSso</a> operation.
    */
  @js.native
  @Factory
  trait EnableSsoRequest extends js.Object {
    var DirectoryId: DirectoryId
    var Password: js.UndefOr[ConnectPassword]
    var UserName: js.UndefOr[UserName]
  }

  /**
    * Contains the results of the <a>EnableSso</a> operation.
    */
  @js.native
  @Factory
  trait EnableSsoResult extends js.Object {}

  /**
    * Information about SNS topic and AWS Directory Service directory associations.
    */
  @js.native
  @Factory
  trait EventTopic extends js.Object {
    var CreatedDateTime: js.UndefOr[CreatedDateTime]
    var DirectoryId: js.UndefOr[DirectoryId]
    var Status: js.UndefOr[TopicStatus]
    var TopicArn: js.UndefOr[TopicArn]
    var TopicName: js.UndefOr[TopicName]
  }

  /**
    * Contains the inputs for the <a>GetDirectoryLimits</a> operation.
    */
  @js.native
  @Factory
  trait GetDirectoryLimitsRequest extends js.Object {}

  /**
    * Contains the results of the <a>GetDirectoryLimits</a> operation.
    */
  @js.native
  @Factory
  trait GetDirectoryLimitsResult extends js.Object {
    var DirectoryLimits: js.UndefOr[DirectoryLimits]
  }

  /**
    * Contains the inputs for the <a>GetSnapshotLimits</a> operation.
    */
  @js.native
  @Factory
  trait GetSnapshotLimitsRequest extends js.Object {
    var DirectoryId: DirectoryId
  }

  /**
    * Contains the results of the <a>GetSnapshotLimits</a> operation.
    */
  @js.native
  @Factory
  trait GetSnapshotLimitsResult extends js.Object {
    var SnapshotLimits: js.UndefOr[SnapshotLimits]
  }

  /**
    * IP address block. This is often the address block of the DNS server used for your on-premises domain.
    */
  @js.native
  @Factory
  trait IpRoute extends js.Object {
    var CidrIp: js.UndefOr[CidrIp]
    var Description: js.UndefOr[Description]
  }

  /**
    * Information about one or more IP address blocks.
    */
  @js.native
  @Factory
  trait IpRouteInfo extends js.Object {
    var AddedDateTime: js.UndefOr[AddedDateTime]
    var CidrIp: js.UndefOr[CidrIp]
    var Description: js.UndefOr[Description]
    var DirectoryId: js.UndefOr[DirectoryId]
    var IpRouteStatusMsg: js.UndefOr[IpRouteStatusMsg]
    var IpRouteStatusReason: js.UndefOr[IpRouteStatusReason]
  }

  @js.native
  sealed trait IpRouteStatusMsg extends js.Any
  object IpRouteStatusMsg extends js.Object {
    val Adding       = "Adding".asInstanceOf[IpRouteStatusMsg]
    val Added        = "Added".asInstanceOf[IpRouteStatusMsg]
    val Removing     = "Removing".asInstanceOf[IpRouteStatusMsg]
    val Removed      = "Removed".asInstanceOf[IpRouteStatusMsg]
    val AddFailed    = "AddFailed".asInstanceOf[IpRouteStatusMsg]
    val RemoveFailed = "RemoveFailed".asInstanceOf[IpRouteStatusMsg]

    val values = js.Object.freeze(js.Array(Adding, Added, Removing, Removed, AddFailed, RemoveFailed))
  }

  /**
    * Contains general information about the LDAPS settings.
    */
  @js.native
  @Factory
  trait LDAPSSettingInfo extends js.Object {
    var LDAPSStatus: js.UndefOr[LDAPSStatus]
    var LDAPSStatusReason: js.UndefOr[LDAPSStatusReason]
    var LastUpdatedDateTime: js.UndefOr[LastUpdatedDateTime]
  }

  @js.native
  sealed trait LDAPSStatus extends js.Any
  object LDAPSStatus extends js.Object {
    val Enabling     = "Enabling".asInstanceOf[LDAPSStatus]
    val Enabled      = "Enabled".asInstanceOf[LDAPSStatus]
    val EnableFailed = "EnableFailed".asInstanceOf[LDAPSStatus]
    val Disabled     = "Disabled".asInstanceOf[LDAPSStatus]

    val values = js.Object.freeze(js.Array(Enabling, Enabled, EnableFailed, Disabled))
  }

  @js.native
  sealed trait LDAPSType extends js.Any
  object LDAPSType extends js.Object {
    val Client = "Client".asInstanceOf[LDAPSType]

    val values = js.Object.freeze(js.Array(Client))
  }

  @js.native
  @Factory
  trait ListCertificatesRequest extends js.Object {
    var DirectoryId: DirectoryId
    var Limit: js.UndefOr[PageLimit]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListCertificatesResult extends js.Object {
    var CertificatesInfo: js.UndefOr[CertificatesInfo]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListIpRoutesRequest extends js.Object {
    var DirectoryId: DirectoryId
    var Limit: js.UndefOr[Limit]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListIpRoutesResult extends js.Object {
    var IpRoutesInfo: js.UndefOr[IpRoutesInfo]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListLogSubscriptionsRequest extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
    var Limit: js.UndefOr[Limit]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListLogSubscriptionsResult extends js.Object {
    var LogSubscriptions: js.UndefOr[LogSubscriptions]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListSchemaExtensionsRequest extends js.Object {
    var DirectoryId: DirectoryId
    var Limit: js.UndefOr[Limit]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListSchemaExtensionsResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var SchemaExtensionsInfo: js.UndefOr[SchemaExtensionsInfo]
  }

  @js.native
  @Factory
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceId: ResourceId
    var Limit: js.UndefOr[Limit]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListTagsForResourceResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Tags: js.UndefOr[Tags]
  }

  /**
    * Represents a log subscription, which tracks real-time data from a chosen log group to a specified destination.
    */
  @js.native
  @Factory
  trait LogSubscription extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
    var LogGroupName: js.UndefOr[LogGroupName]
    var SubscriptionCreatedDateTime: js.UndefOr[SubscriptionCreatedDateTime]
  }

  /**
    * Describes the directory owner account details that have been shared to the directory consumer account.
    */
  @js.native
  @Factory
  trait OwnerDirectoryDescription extends js.Object {
    var AccountId: js.UndefOr[CustomerId]
    var DirectoryId: js.UndefOr[DirectoryId]
    var DnsIpAddrs: js.UndefOr[DnsIpAddrs]
    var RadiusSettings: js.UndefOr[RadiusSettings]
    var RadiusStatus: js.UndefOr[RadiusStatus]
    var VpcSettings: js.UndefOr[DirectoryVpcSettingsDescription]
  }

  @js.native
  sealed trait RadiusAuthenticationProtocol extends js.Any
  object RadiusAuthenticationProtocol extends js.Object {
    val PAP         = "PAP".asInstanceOf[RadiusAuthenticationProtocol]
    val CHAP        = "CHAP".asInstanceOf[RadiusAuthenticationProtocol]
    val `MS-CHAPv1` = "MS-CHAPv1".asInstanceOf[RadiusAuthenticationProtocol]
    val `MS-CHAPv2` = "MS-CHAPv2".asInstanceOf[RadiusAuthenticationProtocol]

    val values = js.Object.freeze(js.Array(PAP, CHAP, `MS-CHAPv1`, `MS-CHAPv2`))
  }

  /**
    * Contains information about a Remote Authentication Dial In User Service (RADIUS) server.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait RadiusStatus extends js.Any
  object RadiusStatus extends js.Object {
    val Creating  = "Creating".asInstanceOf[RadiusStatus]
    val Completed = "Completed".asInstanceOf[RadiusStatus]
    val Failed    = "Failed".asInstanceOf[RadiusStatus]

    val values = js.Object.freeze(js.Array(Creating, Completed, Failed))
  }

  @js.native
  @Factory
  trait RegisterCertificateRequest extends js.Object {
    var CertificateData: CertificateData
    var DirectoryId: DirectoryId
  }

  @js.native
  @Factory
  trait RegisterCertificateResult extends js.Object {
    var CertificateId: js.UndefOr[CertificateId]
  }

  /**
    * Registers a new event topic.
    */
  @js.native
  @Factory
  trait RegisterEventTopicRequest extends js.Object {
    var DirectoryId: DirectoryId
    var TopicName: TopicName
  }

  /**
    * The result of a RegisterEventTopic request.
    */
  @js.native
  @Factory
  trait RegisterEventTopicResult extends js.Object {}

  @js.native
  @Factory
  trait RejectSharedDirectoryRequest extends js.Object {
    var SharedDirectoryId: DirectoryId
  }

  @js.native
  @Factory
  trait RejectSharedDirectoryResult extends js.Object {
    var SharedDirectoryId: js.UndefOr[DirectoryId]
  }

  @js.native
  @Factory
  trait RemoveIpRoutesRequest extends js.Object {
    var CidrIps: CidrIps
    var DirectoryId: DirectoryId
  }

  @js.native
  @Factory
  trait RemoveIpRoutesResult extends js.Object {}

  @js.native
  @Factory
  trait RemoveTagsFromResourceRequest extends js.Object {
    var ResourceId: ResourceId
    var TagKeys: TagKeys
  }

  @js.native
  @Factory
  trait RemoveTagsFromResourceResult extends js.Object {}

  @js.native
  sealed trait ReplicationScope extends js.Any
  object ReplicationScope extends js.Object {
    val Domain = "Domain".asInstanceOf[ReplicationScope]

    val values = js.Object.freeze(js.Array(Domain))
  }

  @js.native
  @Factory
  trait ResetUserPasswordRequest extends js.Object {
    var DirectoryId: DirectoryId
    var NewPassword: UserPassword
    var UserName: CustomerUserName
  }

  @js.native
  @Factory
  trait ResetUserPasswordResult extends js.Object {}

  /**
    * An object representing the inputs for the <a>RestoreFromSnapshot</a> operation.
    */
  @js.native
  @Factory
  trait RestoreFromSnapshotRequest extends js.Object {
    var SnapshotId: SnapshotId
  }

  /**
    * Contains the results of the <a>RestoreFromSnapshot</a> operation.
    */
  @js.native
  @Factory
  trait RestoreFromSnapshotResult extends js.Object {}

  /**
    * Information about a schema extension.
    */
  @js.native
  @Factory
  trait SchemaExtensionInfo extends js.Object {
    var Description: js.UndefOr[Description]
    var DirectoryId: js.UndefOr[DirectoryId]
    var EndDateTime: js.UndefOr[EndDateTime]
    var SchemaExtensionId: js.UndefOr[SchemaExtensionId]
    var SchemaExtensionStatus: js.UndefOr[SchemaExtensionStatus]
    var SchemaExtensionStatusReason: js.UndefOr[SchemaExtensionStatusReason]
    var StartDateTime: js.UndefOr[StartDateTime]
  }

  @js.native
  sealed trait SchemaExtensionStatus extends js.Any
  object SchemaExtensionStatus extends js.Object {
    val Initializing       = "Initializing".asInstanceOf[SchemaExtensionStatus]
    val CreatingSnapshot   = "CreatingSnapshot".asInstanceOf[SchemaExtensionStatus]
    val UpdatingSchema     = "UpdatingSchema".asInstanceOf[SchemaExtensionStatus]
    val Replicating        = "Replicating".asInstanceOf[SchemaExtensionStatus]
    val CancelInProgress   = "CancelInProgress".asInstanceOf[SchemaExtensionStatus]
    val RollbackInProgress = "RollbackInProgress".asInstanceOf[SchemaExtensionStatus]
    val Cancelled          = "Cancelled".asInstanceOf[SchemaExtensionStatus]
    val Failed             = "Failed".asInstanceOf[SchemaExtensionStatus]
    val Completed          = "Completed".asInstanceOf[SchemaExtensionStatus]

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

  @js.native
  sealed trait SelectiveAuth extends js.Any
  object SelectiveAuth extends js.Object {
    val Enabled  = "Enabled".asInstanceOf[SelectiveAuth]
    val Disabled = "Disabled".asInstanceOf[SelectiveAuth]

    val values = js.Object.freeze(js.Array(Enabled, Disabled))
  }

  @js.native
  @Factory
  trait ShareDirectoryRequest extends js.Object {
    var DirectoryId: DirectoryId
    var ShareMethod: ShareMethod
    var ShareTarget: ShareTarget
    var ShareNotes: js.UndefOr[Notes]
  }

  @js.native
  @Factory
  trait ShareDirectoryResult extends js.Object {
    var SharedDirectoryId: js.UndefOr[DirectoryId]
  }

  @js.native
  sealed trait ShareMethod extends js.Any
  object ShareMethod extends js.Object {
    val ORGANIZATIONS = "ORGANIZATIONS".asInstanceOf[ShareMethod]
    val HANDSHAKE     = "HANDSHAKE".asInstanceOf[ShareMethod]

    val values = js.Object.freeze(js.Array(ORGANIZATIONS, HANDSHAKE))
  }

  @js.native
  sealed trait ShareStatus extends js.Any
  object ShareStatus extends js.Object {
    val Shared            = "Shared".asInstanceOf[ShareStatus]
    val PendingAcceptance = "PendingAcceptance".asInstanceOf[ShareStatus]
    val Rejected          = "Rejected".asInstanceOf[ShareStatus]
    val Rejecting         = "Rejecting".asInstanceOf[ShareStatus]
    val RejectFailed      = "RejectFailed".asInstanceOf[ShareStatus]
    val Sharing           = "Sharing".asInstanceOf[ShareStatus]
    val ShareFailed       = "ShareFailed".asInstanceOf[ShareStatus]
    val Deleted           = "Deleted".asInstanceOf[ShareStatus]
    val Deleting          = "Deleting".asInstanceOf[ShareStatus]

    val values = js.Object.freeze(
      js.Array(Shared, PendingAcceptance, Rejected, Rejecting, RejectFailed, Sharing, ShareFailed, Deleted, Deleting)
    )
  }

  /**
    * Identifier that contains details about the directory consumer account.
    */
  @js.native
  @Factory
  trait ShareTarget extends js.Object {
    var Id: TargetId
    var Type: TargetType
  }

  /**
    * Details about the shared directory in the directory owner account for which the share request in the directory consumer account has been accepted.
    */
  @js.native
  @Factory
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

  /**
    * Describes a directory snapshot.
    */
  @js.native
  @Factory
  trait Snapshot extends js.Object {
    var DirectoryId: js.UndefOr[DirectoryId]
    var Name: js.UndefOr[SnapshotName]
    var SnapshotId: js.UndefOr[SnapshotId]
    var StartTime: js.UndefOr[StartTime]
    var Status: js.UndefOr[SnapshotStatus]
    var Type: js.UndefOr[SnapshotType]
  }

  /**
    * Contains manual snapshot limit information for a directory.
    */
  @js.native
  @Factory
  trait SnapshotLimits extends js.Object {
    var ManualSnapshotsCurrentCount: js.UndefOr[Limit]
    var ManualSnapshotsLimit: js.UndefOr[Limit]
    var ManualSnapshotsLimitReached: js.UndefOr[ManualSnapshotsLimitReached]
  }

  @js.native
  sealed trait SnapshotStatus extends js.Any
  object SnapshotStatus extends js.Object {
    val Creating  = "Creating".asInstanceOf[SnapshotStatus]
    val Completed = "Completed".asInstanceOf[SnapshotStatus]
    val Failed    = "Failed".asInstanceOf[SnapshotStatus]

    val values = js.Object.freeze(js.Array(Creating, Completed, Failed))
  }

  @js.native
  sealed trait SnapshotType extends js.Any
  object SnapshotType extends js.Object {
    val Auto   = "Auto".asInstanceOf[SnapshotType]
    val Manual = "Manual".asInstanceOf[SnapshotType]

    val values = js.Object.freeze(js.Array(Auto, Manual))
  }

  @js.native
  @Factory
  trait StartSchemaExtensionRequest extends js.Object {
    var CreateSnapshotBeforeSchemaExtension: CreateSnapshotBeforeSchemaExtension
    var Description: Description
    var DirectoryId: DirectoryId
    var LdifContent: LdifContent
  }

  @js.native
  @Factory
  trait StartSchemaExtensionResult extends js.Object {
    var SchemaExtensionId: js.UndefOr[SchemaExtensionId]
  }

  /**
    * Metadata assigned to a directory consisting of a key-value pair.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  @js.native
  sealed trait TargetType extends js.Any
  object TargetType extends js.Object {
    val ACCOUNT = "ACCOUNT".asInstanceOf[TargetType]

    val values = js.Object.freeze(js.Array(ACCOUNT))
  }

  @js.native
  sealed trait TopicStatus extends js.Any
  object TopicStatus extends js.Object {
    val Registered        = "Registered".asInstanceOf[TopicStatus]
    val `Topic not found` = "Topic not found".asInstanceOf[TopicStatus]
    val Failed            = "Failed".asInstanceOf[TopicStatus]
    val Deleted           = "Deleted".asInstanceOf[TopicStatus]

    val values = js.Object.freeze(js.Array(Registered, `Topic not found`, Failed, Deleted))
  }

  /**
    * Describes a trust relationship between an AWS Managed Microsoft AD directory and an external domain.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait TrustDirection extends js.Any
  object TrustDirection extends js.Object {
    val `One-Way: Outgoing` = "One-Way: Outgoing".asInstanceOf[TrustDirection]
    val `One-Way: Incoming` = "One-Way: Incoming".asInstanceOf[TrustDirection]
    val `Two-Way`           = "Two-Way".asInstanceOf[TrustDirection]

    val values = js.Object.freeze(js.Array(`One-Way: Outgoing`, `One-Way: Incoming`, `Two-Way`))
  }

  @js.native
  sealed trait TrustState extends js.Any
  object TrustState extends js.Object {
    val Creating     = "Creating".asInstanceOf[TrustState]
    val Created      = "Created".asInstanceOf[TrustState]
    val Verifying    = "Verifying".asInstanceOf[TrustState]
    val VerifyFailed = "VerifyFailed".asInstanceOf[TrustState]
    val Verified     = "Verified".asInstanceOf[TrustState]
    val Updating     = "Updating".asInstanceOf[TrustState]
    val UpdateFailed = "UpdateFailed".asInstanceOf[TrustState]
    val Updated      = "Updated".asInstanceOf[TrustState]
    val Deleting     = "Deleting".asInstanceOf[TrustState]
    val Deleted      = "Deleted".asInstanceOf[TrustState]
    val Failed       = "Failed".asInstanceOf[TrustState]

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

  @js.native
  sealed trait TrustType extends js.Any
  object TrustType extends js.Object {
    val Forest   = "Forest".asInstanceOf[TrustType]
    val External = "External".asInstanceOf[TrustType]

    val values = js.Object.freeze(js.Array(Forest, External))
  }

  @js.native
  @Factory
  trait UnshareDirectoryRequest extends js.Object {
    var DirectoryId: DirectoryId
    var UnshareTarget: UnshareTarget
  }

  @js.native
  @Factory
  trait UnshareDirectoryResult extends js.Object {
    var SharedDirectoryId: js.UndefOr[DirectoryId]
  }

  /**
    * Identifier that contains details about the directory consumer account with whom the directory is being unshared.
    */
  @js.native
  @Factory
  trait UnshareTarget extends js.Object {
    var Id: TargetId
    var Type: TargetType
  }

  /**
    * Updates a conditional forwarder.
    */
  @js.native
  @Factory
  trait UpdateConditionalForwarderRequest extends js.Object {
    var DirectoryId: DirectoryId
    var DnsIpAddrs: DnsIpAddrs
    var RemoteDomainName: RemoteDomainName
  }

  /**
    * The result of an UpdateConditionalForwarder request.
    */
  @js.native
  @Factory
  trait UpdateConditionalForwarderResult extends js.Object {}

  @js.native
  @Factory
  trait UpdateNumberOfDomainControllersRequest extends js.Object {
    var DesiredNumber: DesiredNumberOfDomainControllers
    var DirectoryId: DirectoryId
  }

  @js.native
  @Factory
  trait UpdateNumberOfDomainControllersResult extends js.Object {}

  /**
    * Contains the inputs for the <a>UpdateRadius</a> operation.
    */
  @js.native
  @Factory
  trait UpdateRadiusRequest extends js.Object {
    var DirectoryId: DirectoryId
    var RadiusSettings: RadiusSettings
  }

  /**
    * Contains the results of the <a>UpdateRadius</a> operation.
    */
  @js.native
  @Factory
  trait UpdateRadiusResult extends js.Object {}

  @js.native
  @Factory
  trait UpdateTrustRequest extends js.Object {
    var TrustId: TrustId
    var SelectiveAuth: js.UndefOr[SelectiveAuth]
  }

  @js.native
  @Factory
  trait UpdateTrustResult extends js.Object {
    var RequestId: js.UndefOr[RequestId]
    var TrustId: js.UndefOr[TrustId]
  }

  /**
    * Initiates the verification of an existing trust relationship between an AWS Managed Microsoft AD directory and an external domain.
    */
  @js.native
  @Factory
  trait VerifyTrustRequest extends js.Object {
    var TrustId: TrustId
  }

  /**
    * Result of a VerifyTrust request.
    */
  @js.native
  @Factory
  trait VerifyTrustResult extends js.Object {
    var TrustId: js.UndefOr[TrustId]
  }
}
