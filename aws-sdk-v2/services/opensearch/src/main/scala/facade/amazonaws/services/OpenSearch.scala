package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object opensearch {
  type ARN = String
  type AWSAccount = String
  type AdditionalLimitList = js.Array[AdditionalLimit]
  type AdvancedOptions = js.Dictionary[String]
  type AuthorizedPrincipalList = js.Array[AuthorizedPrincipal]
  type AutoTuneDate = js.Date
  type AutoTuneList = js.Array[AutoTune]
  type AutoTuneMaintenanceScheduleList = js.Array[AutoTuneMaintenanceSchedule]
  type BackendRole = String
  type ChangeProgressStageList = js.Array[ChangeProgressStage]
  type ChangeProgressStageName = String
  type ChangeProgressStageStatus = String
  type ClientToken = String
  type CloudWatchLogsLogGroupArn = String
  type CommitMessage = String
  type CompatibleVersionsList = js.Array[CompatibleVersionsMap]
  type ConnectionAlias = String
  type ConnectionId = String
  type ConnectionStatusMessage = String
  type CreatedAt = js.Date
  type DeploymentCloseDateTimeStamp = js.Date
  type DeploymentType = String
  type DescribePackagesFilterList = js.Array[DescribePackagesFilter]
  type DescribePackagesFilterValue = String
  type DescribePackagesFilterValues = js.Array[DescribePackagesFilterValue]
  type Description = String
  type DisableTimestamp = js.Date
  type DomainArn = String
  type DomainId = String
  type DomainInfoList = js.Array[DomainInfo]
  type DomainName = String
  type DomainNameFqdn = String
  type DomainNameList = js.Array[DomainName]
  type DomainPackageDetailsList = js.Array[DomainPackageDetails]
  type DomainStatusList = js.Array[DomainStatus]
  type DryRun = Boolean
  type DurationValue = Double
  type Endpoint = String
  type EndpointsMap = js.Dictionary[ServiceUrl]
  type ErrorMessage = String
  type ErrorType = String
  type FilterList = js.Array[Filter]
  type GUID = String
  type IdentityPoolId = String
  type InboundConnections = js.Array[InboundConnection]
  type InstanceCount = Int
  type InstanceRole = String
  type InstanceRoleList = js.Array[InstanceRole]
  type InstanceTypeDetailsList = js.Array[InstanceTypeDetails]
  type IntegerClass = Int
  type Issue = String
  type Issues = js.Array[Issue]
  type KmsKeyId = String
  type LastUpdated = js.Date
  type LimitName = String
  type LimitValue = String
  type LimitValueList = js.Array[LimitValue]
  type LimitsByRole = js.Dictionary[Limits]
  type LogPublishingOptions = js.Dictionary[LogPublishingOption]
  type MaxResults = Int
  type MaximumInstanceCount = Int
  type Message = String
  type MinimumInstanceCount = Int
  type NextToken = String
  type NonEmptyString = String
  type OutboundConnections = js.Array[OutboundConnection]
  type OwnerId = String
  type PackageDescription = String
  type PackageDetailsList = js.Array[PackageDetails]
  type PackageID = String
  type PackageName = String
  type PackageVersion = String
  type PackageVersionHistoryList = js.Array[PackageVersionHistory]
  type Password = String
  type PolicyDocument = String
  type RecurringChargeList = js.Array[RecurringCharge]
  type ReferencePath = String
  type Region = String
  type ReservationToken = String
  type ReservedInstanceList = js.Array[ReservedInstance]
  type ReservedInstanceOfferingList = js.Array[ReservedInstanceOffering]
  type RoleArn = String
  type S3BucketName = String
  type S3Key = String
  type SAMLEntityId = String
  type SAMLMetadata = String
  type ScheduledAutoTuneDescription = String
  type ServiceUrl = String
  type StartAt = js.Date
  type StartTimestamp = js.Date
  type StorageSubTypeName = String
  type StorageTypeLimitList = js.Array[StorageTypeLimit]
  type StorageTypeList = js.Array[StorageType]
  type StorageTypeName = String
  type StringList = js.Array[String]
  type TagKey = String
  type TagList = js.Array[Tag]
  type TagValue = String
  type TotalNumberOfStages = Int
  type UIntValue = Int
  type UpdateTimestamp = js.Date
  type UpgradeHistoryList = js.Array[UpgradeHistory]
  type UpgradeName = String
  type UpgradeStepsList = js.Array[UpgradeStepItem]
  type UserPoolId = String
  type Username = String
  type ValueStringList = js.Array[NonEmptyString]
  type VersionList = js.Array[VersionString]
  type VersionString = String
  type VpcEndpointErrorList = js.Array[VpcEndpointError]
  type VpcEndpointId = String
  type VpcEndpointIdList = js.Array[VpcEndpointId]
  type VpcEndpointSummaryList = js.Array[VpcEndpointSummary]
  type VpcEndpoints = js.Array[VpcEndpoint]

  final class OpenSearchOps(private val service: OpenSearch) extends AnyVal {

    @inline def acceptInboundConnectionFuture(params: AcceptInboundConnectionRequest): Future[AcceptInboundConnectionResponse] = service.acceptInboundConnection(params).promise().toFuture
    @inline def addTagsFuture(params: AddTagsRequest): Future[js.Object] = service.addTags(params).promise().toFuture
    @inline def associatePackageFuture(params: AssociatePackageRequest): Future[AssociatePackageResponse] = service.associatePackage(params).promise().toFuture
    @inline def authorizeVpcEndpointAccessFuture(params: AuthorizeVpcEndpointAccessRequest): Future[AuthorizeVpcEndpointAccessResponse] = service.authorizeVpcEndpointAccess(params).promise().toFuture
    @inline def cancelServiceSoftwareUpdateFuture(params: CancelServiceSoftwareUpdateRequest): Future[CancelServiceSoftwareUpdateResponse] = service.cancelServiceSoftwareUpdate(params).promise().toFuture
    @inline def createDomainFuture(params: CreateDomainRequest): Future[CreateDomainResponse] = service.createDomain(params).promise().toFuture
    @inline def createOutboundConnectionFuture(params: CreateOutboundConnectionRequest): Future[CreateOutboundConnectionResponse] = service.createOutboundConnection(params).promise().toFuture
    @inline def createPackageFuture(params: CreatePackageRequest): Future[CreatePackageResponse] = service.createPackage(params).promise().toFuture
    @inline def createVpcEndpointFuture(params: CreateVpcEndpointRequest): Future[CreateVpcEndpointResponse] = service.createVpcEndpoint(params).promise().toFuture
    @inline def deleteDomainFuture(params: DeleteDomainRequest): Future[DeleteDomainResponse] = service.deleteDomain(params).promise().toFuture
    @inline def deleteInboundConnectionFuture(params: DeleteInboundConnectionRequest): Future[DeleteInboundConnectionResponse] = service.deleteInboundConnection(params).promise().toFuture
    @inline def deleteOutboundConnectionFuture(params: DeleteOutboundConnectionRequest): Future[DeleteOutboundConnectionResponse] = service.deleteOutboundConnection(params).promise().toFuture
    @inline def deletePackageFuture(params: DeletePackageRequest): Future[DeletePackageResponse] = service.deletePackage(params).promise().toFuture
    @inline def deleteVpcEndpointFuture(params: DeleteVpcEndpointRequest): Future[DeleteVpcEndpointResponse] = service.deleteVpcEndpoint(params).promise().toFuture
    @inline def describeDomainAutoTunesFuture(params: DescribeDomainAutoTunesRequest): Future[DescribeDomainAutoTunesResponse] = service.describeDomainAutoTunes(params).promise().toFuture
    @inline def describeDomainChangeProgressFuture(params: DescribeDomainChangeProgressRequest): Future[DescribeDomainChangeProgressResponse] = service.describeDomainChangeProgress(params).promise().toFuture
    @inline def describeDomainConfigFuture(params: DescribeDomainConfigRequest): Future[DescribeDomainConfigResponse] = service.describeDomainConfig(params).promise().toFuture
    @inline def describeDomainFuture(params: DescribeDomainRequest): Future[DescribeDomainResponse] = service.describeDomain(params).promise().toFuture
    @inline def describeDomainsFuture(params: DescribeDomainsRequest): Future[DescribeDomainsResponse] = service.describeDomains(params).promise().toFuture
    @inline def describeInboundConnectionsFuture(params: DescribeInboundConnectionsRequest): Future[DescribeInboundConnectionsResponse] = service.describeInboundConnections(params).promise().toFuture
    @inline def describeInstanceTypeLimitsFuture(params: DescribeInstanceTypeLimitsRequest): Future[DescribeInstanceTypeLimitsResponse] = service.describeInstanceTypeLimits(params).promise().toFuture
    @inline def describeOutboundConnectionsFuture(params: DescribeOutboundConnectionsRequest): Future[DescribeOutboundConnectionsResponse] = service.describeOutboundConnections(params).promise().toFuture
    @inline def describePackagesFuture(params: DescribePackagesRequest): Future[DescribePackagesResponse] = service.describePackages(params).promise().toFuture
    @inline def describeReservedInstanceOfferingsFuture(params: DescribeReservedInstanceOfferingsRequest): Future[DescribeReservedInstanceOfferingsResponse] = service.describeReservedInstanceOfferings(params).promise().toFuture
    @inline def describeReservedInstancesFuture(params: DescribeReservedInstancesRequest): Future[DescribeReservedInstancesResponse] = service.describeReservedInstances(params).promise().toFuture
    @inline def describeVpcEndpointsFuture(params: DescribeVpcEndpointsRequest): Future[DescribeVpcEndpointsResponse] = service.describeVpcEndpoints(params).promise().toFuture
    @inline def dissociatePackageFuture(params: DissociatePackageRequest): Future[DissociatePackageResponse] = service.dissociatePackage(params).promise().toFuture
    @inline def getCompatibleVersionsFuture(params: GetCompatibleVersionsRequest): Future[GetCompatibleVersionsResponse] = service.getCompatibleVersions(params).promise().toFuture
    @inline def getPackageVersionHistoryFuture(params: GetPackageVersionHistoryRequest): Future[GetPackageVersionHistoryResponse] = service.getPackageVersionHistory(params).promise().toFuture
    @inline def getUpgradeHistoryFuture(params: GetUpgradeHistoryRequest): Future[GetUpgradeHistoryResponse] = service.getUpgradeHistory(params).promise().toFuture
    @inline def getUpgradeStatusFuture(params: GetUpgradeStatusRequest): Future[GetUpgradeStatusResponse] = service.getUpgradeStatus(params).promise().toFuture
    @inline def listDomainNamesFuture(params: ListDomainNamesRequest): Future[ListDomainNamesResponse] = service.listDomainNames(params).promise().toFuture
    @inline def listDomainsForPackageFuture(params: ListDomainsForPackageRequest): Future[ListDomainsForPackageResponse] = service.listDomainsForPackage(params).promise().toFuture
    @inline def listInstanceTypeDetailsFuture(params: ListInstanceTypeDetailsRequest): Future[ListInstanceTypeDetailsResponse] = service.listInstanceTypeDetails(params).promise().toFuture
    @inline def listPackagesForDomainFuture(params: ListPackagesForDomainRequest): Future[ListPackagesForDomainResponse] = service.listPackagesForDomain(params).promise().toFuture
    @inline def listTagsFuture(params: ListTagsRequest): Future[ListTagsResponse] = service.listTags(params).promise().toFuture
    @inline def listVersionsFuture(params: ListVersionsRequest): Future[ListVersionsResponse] = service.listVersions(params).promise().toFuture
    @inline def listVpcEndpointAccessFuture(params: ListVpcEndpointAccessRequest): Future[ListVpcEndpointAccessResponse] = service.listVpcEndpointAccess(params).promise().toFuture
    @inline def listVpcEndpointsForDomainFuture(params: ListVpcEndpointsForDomainRequest): Future[ListVpcEndpointsForDomainResponse] = service.listVpcEndpointsForDomain(params).promise().toFuture
    @inline def listVpcEndpointsFuture(params: ListVpcEndpointsRequest): Future[ListVpcEndpointsResponse] = service.listVpcEndpoints(params).promise().toFuture
    @inline def purchaseReservedInstanceOfferingFuture(params: PurchaseReservedInstanceOfferingRequest): Future[PurchaseReservedInstanceOfferingResponse] = service.purchaseReservedInstanceOffering(params).promise().toFuture
    @inline def rejectInboundConnectionFuture(params: RejectInboundConnectionRequest): Future[RejectInboundConnectionResponse] = service.rejectInboundConnection(params).promise().toFuture
    @inline def removeTagsFuture(params: RemoveTagsRequest): Future[js.Object] = service.removeTags(params).promise().toFuture
    @inline def revokeVpcEndpointAccessFuture(params: RevokeVpcEndpointAccessRequest): Future[RevokeVpcEndpointAccessResponse] = service.revokeVpcEndpointAccess(params).promise().toFuture
    @inline def startServiceSoftwareUpdateFuture(params: StartServiceSoftwareUpdateRequest): Future[StartServiceSoftwareUpdateResponse] = service.startServiceSoftwareUpdate(params).promise().toFuture
    @inline def updateDomainConfigFuture(params: UpdateDomainConfigRequest): Future[UpdateDomainConfigResponse] = service.updateDomainConfig(params).promise().toFuture
    @inline def updatePackageFuture(params: UpdatePackageRequest): Future[UpdatePackageResponse] = service.updatePackage(params).promise().toFuture
    @inline def updateVpcEndpointFuture(params: UpdateVpcEndpointRequest): Future[UpdateVpcEndpointResponse] = service.updateVpcEndpoint(params).promise().toFuture
    @inline def upgradeDomainFuture(params: UpgradeDomainRequest): Future[UpgradeDomainResponse] = service.upgradeDomain(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/opensearch", JSImport.Namespace, "AWS.OpenSearch")
  class OpenSearch() extends js.Object {
    def this(config: AWSConfig) = this()

    def acceptInboundConnection(params: AcceptInboundConnectionRequest): Request[AcceptInboundConnectionResponse] = js.native
    def addTags(params: AddTagsRequest): Request[js.Object] = js.native
    def associatePackage(params: AssociatePackageRequest): Request[AssociatePackageResponse] = js.native
    def authorizeVpcEndpointAccess(params: AuthorizeVpcEndpointAccessRequest): Request[AuthorizeVpcEndpointAccessResponse] = js.native
    def cancelServiceSoftwareUpdate(params: CancelServiceSoftwareUpdateRequest): Request[CancelServiceSoftwareUpdateResponse] = js.native
    def createDomain(params: CreateDomainRequest): Request[CreateDomainResponse] = js.native
    def createOutboundConnection(params: CreateOutboundConnectionRequest): Request[CreateOutboundConnectionResponse] = js.native
    def createPackage(params: CreatePackageRequest): Request[CreatePackageResponse] = js.native
    def createVpcEndpoint(params: CreateVpcEndpointRequest): Request[CreateVpcEndpointResponse] = js.native
    def deleteDomain(params: DeleteDomainRequest): Request[DeleteDomainResponse] = js.native
    def deleteInboundConnection(params: DeleteInboundConnectionRequest): Request[DeleteInboundConnectionResponse] = js.native
    def deleteOutboundConnection(params: DeleteOutboundConnectionRequest): Request[DeleteOutboundConnectionResponse] = js.native
    def deletePackage(params: DeletePackageRequest): Request[DeletePackageResponse] = js.native
    def deleteVpcEndpoint(params: DeleteVpcEndpointRequest): Request[DeleteVpcEndpointResponse] = js.native
    def describeDomain(params: DescribeDomainRequest): Request[DescribeDomainResponse] = js.native
    def describeDomainAutoTunes(params: DescribeDomainAutoTunesRequest): Request[DescribeDomainAutoTunesResponse] = js.native
    def describeDomainChangeProgress(params: DescribeDomainChangeProgressRequest): Request[DescribeDomainChangeProgressResponse] = js.native
    def describeDomainConfig(params: DescribeDomainConfigRequest): Request[DescribeDomainConfigResponse] = js.native
    def describeDomains(params: DescribeDomainsRequest): Request[DescribeDomainsResponse] = js.native
    def describeInboundConnections(params: DescribeInboundConnectionsRequest): Request[DescribeInboundConnectionsResponse] = js.native
    def describeInstanceTypeLimits(params: DescribeInstanceTypeLimitsRequest): Request[DescribeInstanceTypeLimitsResponse] = js.native
    def describeOutboundConnections(params: DescribeOutboundConnectionsRequest): Request[DescribeOutboundConnectionsResponse] = js.native
    def describePackages(params: DescribePackagesRequest): Request[DescribePackagesResponse] = js.native
    def describeReservedInstanceOfferings(params: DescribeReservedInstanceOfferingsRequest): Request[DescribeReservedInstanceOfferingsResponse] = js.native
    def describeReservedInstances(params: DescribeReservedInstancesRequest): Request[DescribeReservedInstancesResponse] = js.native
    def describeVpcEndpoints(params: DescribeVpcEndpointsRequest): Request[DescribeVpcEndpointsResponse] = js.native
    def dissociatePackage(params: DissociatePackageRequest): Request[DissociatePackageResponse] = js.native
    def getCompatibleVersions(params: GetCompatibleVersionsRequest): Request[GetCompatibleVersionsResponse] = js.native
    def getPackageVersionHistory(params: GetPackageVersionHistoryRequest): Request[GetPackageVersionHistoryResponse] = js.native
    def getUpgradeHistory(params: GetUpgradeHistoryRequest): Request[GetUpgradeHistoryResponse] = js.native
    def getUpgradeStatus(params: GetUpgradeStatusRequest): Request[GetUpgradeStatusResponse] = js.native
    def listDomainNames(params: ListDomainNamesRequest): Request[ListDomainNamesResponse] = js.native
    def listDomainsForPackage(params: ListDomainsForPackageRequest): Request[ListDomainsForPackageResponse] = js.native
    def listInstanceTypeDetails(params: ListInstanceTypeDetailsRequest): Request[ListInstanceTypeDetailsResponse] = js.native
    def listPackagesForDomain(params: ListPackagesForDomainRequest): Request[ListPackagesForDomainResponse] = js.native
    def listTags(params: ListTagsRequest): Request[ListTagsResponse] = js.native
    def listVersions(params: ListVersionsRequest): Request[ListVersionsResponse] = js.native
    def listVpcEndpointAccess(params: ListVpcEndpointAccessRequest): Request[ListVpcEndpointAccessResponse] = js.native
    def listVpcEndpoints(params: ListVpcEndpointsRequest): Request[ListVpcEndpointsResponse] = js.native
    def listVpcEndpointsForDomain(params: ListVpcEndpointsForDomainRequest): Request[ListVpcEndpointsForDomainResponse] = js.native
    def purchaseReservedInstanceOffering(params: PurchaseReservedInstanceOfferingRequest): Request[PurchaseReservedInstanceOfferingResponse] = js.native
    def rejectInboundConnection(params: RejectInboundConnectionRequest): Request[RejectInboundConnectionResponse] = js.native
    def removeTags(params: RemoveTagsRequest): Request[js.Object] = js.native
    def revokeVpcEndpointAccess(params: RevokeVpcEndpointAccessRequest): Request[RevokeVpcEndpointAccessResponse] = js.native
    def startServiceSoftwareUpdate(params: StartServiceSoftwareUpdateRequest): Request[StartServiceSoftwareUpdateResponse] = js.native
    def updateDomainConfig(params: UpdateDomainConfigRequest): Request[UpdateDomainConfigResponse] = js.native
    def updatePackage(params: UpdatePackageRequest): Request[UpdatePackageResponse] = js.native
    def updateVpcEndpoint(params: UpdateVpcEndpointRequest): Request[UpdateVpcEndpointResponse] = js.native
    def upgradeDomain(params: UpgradeDomainRequest): Request[UpgradeDomainResponse] = js.native
  }
  object OpenSearch {
    @inline implicit def toOps(service: OpenSearch): OpenSearchOps = {
      new OpenSearchOps(service)
    }
  }

  /** Information about an Amazon OpenSearch Service domain.
    */
  @js.native
  trait AWSDomainInformation extends js.Object {
    var DomainName: DomainName
    var OwnerId: js.UndefOr[OwnerId]
    var Region: js.UndefOr[Region]
  }

  object AWSDomainInformation {
    @inline
    def apply(
        DomainName: DomainName,
        OwnerId: js.UndefOr[OwnerId] = js.undefined,
        Region: js.UndefOr[Region] = js.undefined
    ): AWSDomainInformation = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      OwnerId.foreach(__v => __obj.updateDynamic("OwnerId")(__v.asInstanceOf[js.Any]))
      Region.foreach(__v => __obj.updateDynamic("Region")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AWSDomainInformation]
    }
  }

  /** Container for the parameters to the <code>AcceptInboundConnection</code> operation.
    */
  @js.native
  trait AcceptInboundConnectionRequest extends js.Object {
    var ConnectionId: ConnectionId
  }

  object AcceptInboundConnectionRequest {
    @inline
    def apply(
        ConnectionId: ConnectionId
    ): AcceptInboundConnectionRequest = {
      val __obj = js.Dynamic.literal(
        "ConnectionId" -> ConnectionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AcceptInboundConnectionRequest]
    }
  }

  /** Contains details about the accepted inbound connection.
    */
  @js.native
  trait AcceptInboundConnectionResponse extends js.Object {
    var Connection: js.UndefOr[InboundConnection]
  }

  object AcceptInboundConnectionResponse {
    @inline
    def apply(
        Connection: js.UndefOr[InboundConnection] = js.undefined
    ): AcceptInboundConnectionResponse = {
      val __obj = js.Dynamic.literal()
      Connection.foreach(__v => __obj.updateDynamic("Connection")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AcceptInboundConnectionResponse]
    }
  }

  /** The configured access rules for the domain's search endpoint, and the current status of those rules.
    */
  @js.native
  trait AccessPoliciesStatus extends js.Object {
    var Options: PolicyDocument
    var Status: OptionStatus
  }

  object AccessPoliciesStatus {
    @inline
    def apply(
        Options: PolicyDocument,
        Status: OptionStatus
    ): AccessPoliciesStatus = {
      val __obj = js.Dynamic.literal(
        "Options" -> Options.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AccessPoliciesStatus]
    }
  }

  /** Container for the parameters to the <code>AddTags</code> operation. Specifies the tags to attach to the domain.
    */
  @js.native
  trait AddTagsRequest extends js.Object {
    var ARN: ARN
    var TagList: TagList
  }

  object AddTagsRequest {
    @inline
    def apply(
        ARN: ARN,
        TagList: TagList
    ): AddTagsRequest = {
      val __obj = js.Dynamic.literal(
        "ARN" -> ARN.asInstanceOf[js.Any],
        "TagList" -> TagList.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AddTagsRequest]
    }
  }

  /** List of limits that are specific to a given instance type.
    */
  @js.native
  trait AdditionalLimit extends js.Object {
    var LimitName: js.UndefOr[LimitName]
    var LimitValues: js.UndefOr[LimitValueList]
  }

  object AdditionalLimit {
    @inline
    def apply(
        LimitName: js.UndefOr[LimitName] = js.undefined,
        LimitValues: js.UndefOr[LimitValueList] = js.undefined
    ): AdditionalLimit = {
      val __obj = js.Dynamic.literal()
      LimitName.foreach(__v => __obj.updateDynamic("LimitName")(__v.asInstanceOf[js.Any]))
      LimitValues.foreach(__v => __obj.updateDynamic("LimitValues")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AdditionalLimit]
    }
  }

  /** Status of the advanced options for the specified domain. The following options are available: * <code>"rest.action.multi.allow_explicit_index": "true" | "false"</code> - Note the use of a string rather than a boolean. Specifies whether explicit references to indexes are allowed inside the body of HTTP requests. If you want to configure access policies for domain sub-resources, such as specific indexes and domain APIs, you must disable this property. Default is true. * <code>"indices.fielddata.cache.size": "80" </code> - Note the use of a string rather than a boolean. Specifies the percentage of heap space allocated to field data. Default is unbounded. * <code>"indices.query.bool.max_clause_count": "1024"</code> - Note the use of a string rather than a boolean. Specifies the maximum number of clauses allowed in a Lucene boolean query. Default is 1,024. Queries with more than the permitted number of clauses result in a <code>TooManyClauses</code> error. *
    * <code>"override_main_response_version": "true" | "false"</code> - Note the use of a string rather than a boolean. Specifies whether the domain reports its version as 7.10 to allow Elasticsearch OSS clients and plugins to continue working with it. Default is false when creating a domain and true when upgrading a domain. For more information, see [[https://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomain-configure-advanced-options|Advanced cluster parameters]].
    */
  @js.native
  trait AdvancedOptionsStatus extends js.Object {
    var Options: AdvancedOptions
    var Status: OptionStatus
  }

  object AdvancedOptionsStatus {
    @inline
    def apply(
        Options: AdvancedOptions,
        Status: OptionStatus
    ): AdvancedOptionsStatus = {
      val __obj = js.Dynamic.literal(
        "Options" -> Options.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AdvancedOptionsStatus]
    }
  }

  /** Container for fine-grained access control settings.
    */
  @js.native
  trait AdvancedSecurityOptions extends js.Object {
    var AnonymousAuthDisableDate: js.UndefOr[DisableTimestamp]
    var AnonymousAuthEnabled: js.UndefOr[Boolean]
    var Enabled: js.UndefOr[Boolean]
    var InternalUserDatabaseEnabled: js.UndefOr[Boolean]
    var SAMLOptions: js.UndefOr[SAMLOptionsOutput]
  }

  object AdvancedSecurityOptions {
    @inline
    def apply(
        AnonymousAuthDisableDate: js.UndefOr[DisableTimestamp] = js.undefined,
        AnonymousAuthEnabled: js.UndefOr[Boolean] = js.undefined,
        Enabled: js.UndefOr[Boolean] = js.undefined,
        InternalUserDatabaseEnabled: js.UndefOr[Boolean] = js.undefined,
        SAMLOptions: js.UndefOr[SAMLOptionsOutput] = js.undefined
    ): AdvancedSecurityOptions = {
      val __obj = js.Dynamic.literal()
      AnonymousAuthDisableDate.foreach(__v => __obj.updateDynamic("AnonymousAuthDisableDate")(__v.asInstanceOf[js.Any]))
      AnonymousAuthEnabled.foreach(__v => __obj.updateDynamic("AnonymousAuthEnabled")(__v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      InternalUserDatabaseEnabled.foreach(__v => __obj.updateDynamic("InternalUserDatabaseEnabled")(__v.asInstanceOf[js.Any]))
      SAMLOptions.foreach(__v => __obj.updateDynamic("SAMLOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AdvancedSecurityOptions]
    }
  }

  /** Options for enabling and configuring fine-grained access control. For more information, see [[https://docs.aws.amazon.com/opensearch-service/latest/developerguide/fgac.html|Fine-grained access control in Amazon OpenSearch Service]].
    */
  @js.native
  trait AdvancedSecurityOptionsInput extends js.Object {
    var AnonymousAuthEnabled: js.UndefOr[Boolean]
    var Enabled: js.UndefOr[Boolean]
    var InternalUserDatabaseEnabled: js.UndefOr[Boolean]
    var MasterUserOptions: js.UndefOr[MasterUserOptions]
    var SAMLOptions: js.UndefOr[SAMLOptionsInput]
  }

  object AdvancedSecurityOptionsInput {
    @inline
    def apply(
        AnonymousAuthEnabled: js.UndefOr[Boolean] = js.undefined,
        Enabled: js.UndefOr[Boolean] = js.undefined,
        InternalUserDatabaseEnabled: js.UndefOr[Boolean] = js.undefined,
        MasterUserOptions: js.UndefOr[MasterUserOptions] = js.undefined,
        SAMLOptions: js.UndefOr[SAMLOptionsInput] = js.undefined
    ): AdvancedSecurityOptionsInput = {
      val __obj = js.Dynamic.literal()
      AnonymousAuthEnabled.foreach(__v => __obj.updateDynamic("AnonymousAuthEnabled")(__v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      InternalUserDatabaseEnabled.foreach(__v => __obj.updateDynamic("InternalUserDatabaseEnabled")(__v.asInstanceOf[js.Any]))
      MasterUserOptions.foreach(__v => __obj.updateDynamic("MasterUserOptions")(__v.asInstanceOf[js.Any]))
      SAMLOptions.foreach(__v => __obj.updateDynamic("SAMLOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AdvancedSecurityOptionsInput]
    }
  }

  /** The status of fine-grained access control settings for a domain.
    */
  @js.native
  trait AdvancedSecurityOptionsStatus extends js.Object {
    var Options: AdvancedSecurityOptions
    var Status: OptionStatus
  }

  object AdvancedSecurityOptionsStatus {
    @inline
    def apply(
        Options: AdvancedSecurityOptions,
        Status: OptionStatus
    ): AdvancedSecurityOptionsStatus = {
      val __obj = js.Dynamic.literal(
        "Options" -> Options.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AdvancedSecurityOptionsStatus]
    }
  }

  /** Container for the request parameters to the <code>AssociatePackage</code> operation.
    */
  @js.native
  trait AssociatePackageRequest extends js.Object {
    var DomainName: DomainName
    var PackageID: PackageID
  }

  object AssociatePackageRequest {
    @inline
    def apply(
        DomainName: DomainName,
        PackageID: PackageID
    ): AssociatePackageRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "PackageID" -> PackageID.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociatePackageRequest]
    }
  }

  /** Container for the response returned by the <code>AssociatePackage</code> operation.
    */
  @js.native
  trait AssociatePackageResponse extends js.Object {
    var DomainPackageDetails: js.UndefOr[DomainPackageDetails]
  }

  object AssociatePackageResponse {
    @inline
    def apply(
        DomainPackageDetails: js.UndefOr[DomainPackageDetails] = js.undefined
    ): AssociatePackageResponse = {
      val __obj = js.Dynamic.literal()
      DomainPackageDetails.foreach(__v => __obj.updateDynamic("DomainPackageDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociatePackageResponse]
    }
  }

  @js.native
  trait AuthorizeVpcEndpointAccessRequest extends js.Object {
    var Account: AWSAccount
    var DomainName: DomainName
  }

  object AuthorizeVpcEndpointAccessRequest {
    @inline
    def apply(
        Account: AWSAccount,
        DomainName: DomainName
    ): AuthorizeVpcEndpointAccessRequest = {
      val __obj = js.Dynamic.literal(
        "Account" -> Account.asInstanceOf[js.Any],
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AuthorizeVpcEndpointAccessRequest]
    }
  }

  @js.native
  trait AuthorizeVpcEndpointAccessResponse extends js.Object {
    var AuthorizedPrincipal: AuthorizedPrincipal
  }

  object AuthorizeVpcEndpointAccessResponse {
    @inline
    def apply(
        AuthorizedPrincipal: AuthorizedPrincipal
    ): AuthorizeVpcEndpointAccessResponse = {
      val __obj = js.Dynamic.literal(
        "AuthorizedPrincipal" -> AuthorizedPrincipal.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AuthorizeVpcEndpointAccessResponse]
    }
  }

  /** Information about an Amazon Web Services account or service that has access to an Amazon OpenSearch Service domain through the use of an interface VPC endpoint.
    */
  @js.native
  trait AuthorizedPrincipal extends js.Object {
    var Principal: js.UndefOr[String]
    var PrincipalType: js.UndefOr[PrincipalType]
  }

  object AuthorizedPrincipal {
    @inline
    def apply(
        Principal: js.UndefOr[String] = js.undefined,
        PrincipalType: js.UndefOr[PrincipalType] = js.undefined
    ): AuthorizedPrincipal = {
      val __obj = js.Dynamic.literal()
      Principal.foreach(__v => __obj.updateDynamic("Principal")(__v.asInstanceOf[js.Any]))
      PrincipalType.foreach(__v => __obj.updateDynamic("PrincipalType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AuthorizedPrincipal]
    }
  }

  /** Information about an Auto-Tune action. For more information, see [[https://docs.aws.amazon.com/opensearch-service/latest/developerguide/auto-tune.html|Auto-Tune for Amazon OpenSearch Service]].
    */
  @js.native
  trait AutoTune extends js.Object {
    var AutoTuneDetails: js.UndefOr[AutoTuneDetails]
    var AutoTuneType: js.UndefOr[AutoTuneType]
  }

  object AutoTune {
    @inline
    def apply(
        AutoTuneDetails: js.UndefOr[AutoTuneDetails] = js.undefined,
        AutoTuneType: js.UndefOr[AutoTuneType] = js.undefined
    ): AutoTune = {
      val __obj = js.Dynamic.literal()
      AutoTuneDetails.foreach(__v => __obj.updateDynamic("AutoTuneDetails")(__v.asInstanceOf[js.Any]))
      AutoTuneType.foreach(__v => __obj.updateDynamic("AutoTuneType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutoTune]
    }
  }

  /** Specifies details about a scheduled Auto-Tune action. For more information, see [[https://docs.aws.amazon.com/opensearch-service/latest/developerguide/auto-tune.html|Auto-Tune for Amazon OpenSearch Service]].
    */
  @js.native
  trait AutoTuneDetails extends js.Object {
    var ScheduledAutoTuneDetails: js.UndefOr[ScheduledAutoTuneDetails]
  }

  object AutoTuneDetails {
    @inline
    def apply(
        ScheduledAutoTuneDetails: js.UndefOr[ScheduledAutoTuneDetails] = js.undefined
    ): AutoTuneDetails = {
      val __obj = js.Dynamic.literal()
      ScheduledAutoTuneDetails.foreach(__v => __obj.updateDynamic("ScheduledAutoTuneDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutoTuneDetails]
    }
  }

  /** The Auto-Tune maintenance schedule. For more information, see [[https://docs.aws.amazon.com/opensearch-service/latest/developerguide/auto-tune.html|Auto-Tune for Amazon OpenSearch Service]].
    */
  @js.native
  trait AutoTuneMaintenanceSchedule extends js.Object {
    var CronExpressionForRecurrence: js.UndefOr[String]
    var Duration: js.UndefOr[Duration]
    var StartAt: js.UndefOr[StartAt]
  }

  object AutoTuneMaintenanceSchedule {
    @inline
    def apply(
        CronExpressionForRecurrence: js.UndefOr[String] = js.undefined,
        Duration: js.UndefOr[Duration] = js.undefined,
        StartAt: js.UndefOr[StartAt] = js.undefined
    ): AutoTuneMaintenanceSchedule = {
      val __obj = js.Dynamic.literal()
      CronExpressionForRecurrence.foreach(__v => __obj.updateDynamic("CronExpressionForRecurrence")(__v.asInstanceOf[js.Any]))
      Duration.foreach(__v => __obj.updateDynamic("Duration")(__v.asInstanceOf[js.Any]))
      StartAt.foreach(__v => __obj.updateDynamic("StartAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutoTuneMaintenanceSchedule]
    }
  }

  /** Auto-Tune settings when updating a domain. For more information, see [[https://docs.aws.amazon.com/opensearch-service/latest/developerguide/auto-tune.html|Auto-Tune for Amazon OpenSearch Service]].
    */
  @js.native
  trait AutoTuneOptions extends js.Object {
    var DesiredState: js.UndefOr[AutoTuneDesiredState]
    var MaintenanceSchedules: js.UndefOr[AutoTuneMaintenanceScheduleList]
    var RollbackOnDisable: js.UndefOr[RollbackOnDisable]
  }

  object AutoTuneOptions {
    @inline
    def apply(
        DesiredState: js.UndefOr[AutoTuneDesiredState] = js.undefined,
        MaintenanceSchedules: js.UndefOr[AutoTuneMaintenanceScheduleList] = js.undefined,
        RollbackOnDisable: js.UndefOr[RollbackOnDisable] = js.undefined
    ): AutoTuneOptions = {
      val __obj = js.Dynamic.literal()
      DesiredState.foreach(__v => __obj.updateDynamic("DesiredState")(__v.asInstanceOf[js.Any]))
      MaintenanceSchedules.foreach(__v => __obj.updateDynamic("MaintenanceSchedules")(__v.asInstanceOf[js.Any]))
      RollbackOnDisable.foreach(__v => __obj.updateDynamic("RollbackOnDisable")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutoTuneOptions]
    }
  }

  /** Options for configuring Auto-Tune. For more information, see [[https://docs.aws.amazon.com/opensearch-service/latest/developerguide/auto-tune.html|Auto-Tune for Amazon OpenSearch Service]].
    */
  @js.native
  trait AutoTuneOptionsInput extends js.Object {
    var DesiredState: js.UndefOr[AutoTuneDesiredState]
    var MaintenanceSchedules: js.UndefOr[AutoTuneMaintenanceScheduleList]
  }

  object AutoTuneOptionsInput {
    @inline
    def apply(
        DesiredState: js.UndefOr[AutoTuneDesiredState] = js.undefined,
        MaintenanceSchedules: js.UndefOr[AutoTuneMaintenanceScheduleList] = js.undefined
    ): AutoTuneOptionsInput = {
      val __obj = js.Dynamic.literal()
      DesiredState.foreach(__v => __obj.updateDynamic("DesiredState")(__v.asInstanceOf[js.Any]))
      MaintenanceSchedules.foreach(__v => __obj.updateDynamic("MaintenanceSchedules")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutoTuneOptionsInput]
    }
  }

  /** The Auto-Tune settings for a domain, displayed when enabling or disabling Auto-Tune.
    */
  @js.native
  trait AutoTuneOptionsOutput extends js.Object {
    var ErrorMessage: js.UndefOr[String]
    var State: js.UndefOr[AutoTuneState]
  }

  object AutoTuneOptionsOutput {
    @inline
    def apply(
        ErrorMessage: js.UndefOr[String] = js.undefined,
        State: js.UndefOr[AutoTuneState] = js.undefined
    ): AutoTuneOptionsOutput = {
      val __obj = js.Dynamic.literal()
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutoTuneOptionsOutput]
    }
  }

  /** The Auto-Tune status for the domain.
    */
  @js.native
  trait AutoTuneOptionsStatus extends js.Object {
    var Options: js.UndefOr[AutoTuneOptions]
    var Status: js.UndefOr[AutoTuneStatus]
  }

  object AutoTuneOptionsStatus {
    @inline
    def apply(
        Options: js.UndefOr[AutoTuneOptions] = js.undefined,
        Status: js.UndefOr[AutoTuneStatus] = js.undefined
    ): AutoTuneOptionsStatus = {
      val __obj = js.Dynamic.literal()
      Options.foreach(__v => __obj.updateDynamic("Options")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutoTuneOptionsStatus]
    }
  }

  /** The current status of Auto-Tune for the domain. For more information, see [[https://docs.aws.amazon.com/opensearch-service/latest/developerguide/auto-tune.html|Auto-Tune for Amazon OpenSearch Service]].
    */
  @js.native
  trait AutoTuneStatus extends js.Object {
    var CreationDate: UpdateTimestamp
    var State: AutoTuneState
    var UpdateDate: UpdateTimestamp
    var ErrorMessage: js.UndefOr[String]
    var PendingDeletion: js.UndefOr[Boolean]
    var UpdateVersion: js.UndefOr[UIntValue]
  }

  object AutoTuneStatus {
    @inline
    def apply(
        CreationDate: UpdateTimestamp,
        State: AutoTuneState,
        UpdateDate: UpdateTimestamp,
        ErrorMessage: js.UndefOr[String] = js.undefined,
        PendingDeletion: js.UndefOr[Boolean] = js.undefined,
        UpdateVersion: js.UndefOr[UIntValue] = js.undefined
    ): AutoTuneStatus = {
      val __obj = js.Dynamic.literal(
        "CreationDate" -> CreationDate.asInstanceOf[js.Any],
        "State" -> State.asInstanceOf[js.Any],
        "UpdateDate" -> UpdateDate.asInstanceOf[js.Any]
      )

      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      PendingDeletion.foreach(__v => __obj.updateDynamic("PendingDeletion")(__v.asInstanceOf[js.Any]))
      UpdateVersion.foreach(__v => __obj.updateDynamic("UpdateVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutoTuneStatus]
    }
  }

  /** Container for the request parameters to cancel a service software update.
    */
  @js.native
  trait CancelServiceSoftwareUpdateRequest extends js.Object {
    var DomainName: DomainName
  }

  object CancelServiceSoftwareUpdateRequest {
    @inline
    def apply(
        DomainName: DomainName
    ): CancelServiceSoftwareUpdateRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CancelServiceSoftwareUpdateRequest]
    }
  }

  /** Container for the response to a <code>CancelServiceSoftwareUpdate</code> operation. Contains the status of the update.
    */
  @js.native
  trait CancelServiceSoftwareUpdateResponse extends js.Object {
    var ServiceSoftwareOptions: js.UndefOr[ServiceSoftwareOptions]
  }

  object CancelServiceSoftwareUpdateResponse {
    @inline
    def apply(
        ServiceSoftwareOptions: js.UndefOr[ServiceSoftwareOptions] = js.undefined
    ): CancelServiceSoftwareUpdateResponse = {
      val __obj = js.Dynamic.literal()
      ServiceSoftwareOptions.foreach(__v => __obj.updateDynamic("ServiceSoftwareOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CancelServiceSoftwareUpdateResponse]
    }
  }

  /** Container for information about a configuration change happening on a domain.
    */
  @js.native
  trait ChangeProgressDetails extends js.Object {
    var ChangeId: js.UndefOr[GUID]
    var Message: js.UndefOr[Message]
  }

  object ChangeProgressDetails {
    @inline
    def apply(
        ChangeId: js.UndefOr[GUID] = js.undefined,
        Message: js.UndefOr[Message] = js.undefined
    ): ChangeProgressDetails = {
      val __obj = js.Dynamic.literal()
      ChangeId.foreach(__v => __obj.updateDynamic("ChangeId")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChangeProgressDetails]
    }
  }

  /** Progress details for each stage of a domain update.
    */
  @js.native
  trait ChangeProgressStage extends js.Object {
    var Description: js.UndefOr[Description]
    var LastUpdated: js.UndefOr[LastUpdated]
    var Name: js.UndefOr[ChangeProgressStageName]
    var Status: js.UndefOr[ChangeProgressStageStatus]
  }

  object ChangeProgressStage {
    @inline
    def apply(
        Description: js.UndefOr[Description] = js.undefined,
        LastUpdated: js.UndefOr[LastUpdated] = js.undefined,
        Name: js.UndefOr[ChangeProgressStageName] = js.undefined,
        Status: js.UndefOr[ChangeProgressStageStatus] = js.undefined
    ): ChangeProgressStage = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LastUpdated.foreach(__v => __obj.updateDynamic("LastUpdated")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChangeProgressStage]
    }
  }

  /** The progress details of a specific domain configuration change.
    */
  @js.native
  trait ChangeProgressStatusDetails extends js.Object {
    var ChangeId: js.UndefOr[GUID]
    var ChangeProgressStages: js.UndefOr[ChangeProgressStageList]
    var CompletedProperties: js.UndefOr[StringList]
    var PendingProperties: js.UndefOr[StringList]
    var StartTime: js.UndefOr[UpdateTimestamp]
    var Status: js.UndefOr[OverallChangeStatus]
    var TotalNumberOfStages: js.UndefOr[TotalNumberOfStages]
  }

  object ChangeProgressStatusDetails {
    @inline
    def apply(
        ChangeId: js.UndefOr[GUID] = js.undefined,
        ChangeProgressStages: js.UndefOr[ChangeProgressStageList] = js.undefined,
        CompletedProperties: js.UndefOr[StringList] = js.undefined,
        PendingProperties: js.UndefOr[StringList] = js.undefined,
        StartTime: js.UndefOr[UpdateTimestamp] = js.undefined,
        Status: js.UndefOr[OverallChangeStatus] = js.undefined,
        TotalNumberOfStages: js.UndefOr[TotalNumberOfStages] = js.undefined
    ): ChangeProgressStatusDetails = {
      val __obj = js.Dynamic.literal()
      ChangeId.foreach(__v => __obj.updateDynamic("ChangeId")(__v.asInstanceOf[js.Any]))
      ChangeProgressStages.foreach(__v => __obj.updateDynamic("ChangeProgressStages")(__v.asInstanceOf[js.Any]))
      CompletedProperties.foreach(__v => __obj.updateDynamic("CompletedProperties")(__v.asInstanceOf[js.Any]))
      PendingProperties.foreach(__v => __obj.updateDynamic("PendingProperties")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TotalNumberOfStages.foreach(__v => __obj.updateDynamic("TotalNumberOfStages")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChangeProgressStatusDetails]
    }
  }

  /** Container for the cluster configuration of an OpenSearch Service domain. For more information, see [[https://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html|Creating and managing Amazon OpenSearch Service domains]].
    */
  @js.native
  trait ClusterConfig extends js.Object {
    var ColdStorageOptions: js.UndefOr[ColdStorageOptions]
    var DedicatedMasterCount: js.UndefOr[IntegerClass]
    var DedicatedMasterEnabled: js.UndefOr[Boolean]
    var DedicatedMasterType: js.UndefOr[OpenSearchPartitionInstanceType]
    var InstanceCount: js.UndefOr[IntegerClass]
    var InstanceType: js.UndefOr[OpenSearchPartitionInstanceType]
    var WarmCount: js.UndefOr[IntegerClass]
    var WarmEnabled: js.UndefOr[Boolean]
    var WarmType: js.UndefOr[OpenSearchWarmPartitionInstanceType]
    var ZoneAwarenessConfig: js.UndefOr[ZoneAwarenessConfig]
    var ZoneAwarenessEnabled: js.UndefOr[Boolean]
  }

  object ClusterConfig {
    @inline
    def apply(
        ColdStorageOptions: js.UndefOr[ColdStorageOptions] = js.undefined,
        DedicatedMasterCount: js.UndefOr[IntegerClass] = js.undefined,
        DedicatedMasterEnabled: js.UndefOr[Boolean] = js.undefined,
        DedicatedMasterType: js.UndefOr[OpenSearchPartitionInstanceType] = js.undefined,
        InstanceCount: js.UndefOr[IntegerClass] = js.undefined,
        InstanceType: js.UndefOr[OpenSearchPartitionInstanceType] = js.undefined,
        WarmCount: js.UndefOr[IntegerClass] = js.undefined,
        WarmEnabled: js.UndefOr[Boolean] = js.undefined,
        WarmType: js.UndefOr[OpenSearchWarmPartitionInstanceType] = js.undefined,
        ZoneAwarenessConfig: js.UndefOr[ZoneAwarenessConfig] = js.undefined,
        ZoneAwarenessEnabled: js.UndefOr[Boolean] = js.undefined
    ): ClusterConfig = {
      val __obj = js.Dynamic.literal()
      ColdStorageOptions.foreach(__v => __obj.updateDynamic("ColdStorageOptions")(__v.asInstanceOf[js.Any]))
      DedicatedMasterCount.foreach(__v => __obj.updateDynamic("DedicatedMasterCount")(__v.asInstanceOf[js.Any]))
      DedicatedMasterEnabled.foreach(__v => __obj.updateDynamic("DedicatedMasterEnabled")(__v.asInstanceOf[js.Any]))
      DedicatedMasterType.foreach(__v => __obj.updateDynamic("DedicatedMasterType")(__v.asInstanceOf[js.Any]))
      InstanceCount.foreach(__v => __obj.updateDynamic("InstanceCount")(__v.asInstanceOf[js.Any]))
      InstanceType.foreach(__v => __obj.updateDynamic("InstanceType")(__v.asInstanceOf[js.Any]))
      WarmCount.foreach(__v => __obj.updateDynamic("WarmCount")(__v.asInstanceOf[js.Any]))
      WarmEnabled.foreach(__v => __obj.updateDynamic("WarmEnabled")(__v.asInstanceOf[js.Any]))
      WarmType.foreach(__v => __obj.updateDynamic("WarmType")(__v.asInstanceOf[js.Any]))
      ZoneAwarenessConfig.foreach(__v => __obj.updateDynamic("ZoneAwarenessConfig")(__v.asInstanceOf[js.Any]))
      ZoneAwarenessEnabled.foreach(__v => __obj.updateDynamic("ZoneAwarenessEnabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClusterConfig]
    }
  }

  /** The cluster configuration status for a domain.
    */
  @js.native
  trait ClusterConfigStatus extends js.Object {
    var Options: ClusterConfig
    var Status: OptionStatus
  }

  object ClusterConfigStatus {
    @inline
    def apply(
        Options: ClusterConfig,
        Status: OptionStatus
    ): ClusterConfigStatus = {
      val __obj = js.Dynamic.literal(
        "Options" -> Options.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ClusterConfigStatus]
    }
  }

  /** Container for the parameters required to enable Cognito authentication for an OpenSearch Service domain. For more information, see [[https://docs.aws.amazon.com/opensearch-service/latest/developerguide/cognito-auth.html|Configuring Amazon Cognito authentication for OpenSearch Dashboards]].
    */
  @js.native
  trait CognitoOptions extends js.Object {
    var Enabled: js.UndefOr[Boolean]
    var IdentityPoolId: js.UndefOr[IdentityPoolId]
    var RoleArn: js.UndefOr[RoleArn]
    var UserPoolId: js.UndefOr[UserPoolId]
  }

  object CognitoOptions {
    @inline
    def apply(
        Enabled: js.UndefOr[Boolean] = js.undefined,
        IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined,
        RoleArn: js.UndefOr[RoleArn] = js.undefined,
        UserPoolId: js.UndefOr[UserPoolId] = js.undefined
    ): CognitoOptions = {
      val __obj = js.Dynamic.literal()
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      IdentityPoolId.foreach(__v => __obj.updateDynamic("IdentityPoolId")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      UserPoolId.foreach(__v => __obj.updateDynamic("UserPoolId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CognitoOptions]
    }
  }

  /** The status of the Cognito options for the specified domain.
    */
  @js.native
  trait CognitoOptionsStatus extends js.Object {
    var Options: CognitoOptions
    var Status: OptionStatus
  }

  object CognitoOptionsStatus {
    @inline
    def apply(
        Options: CognitoOptions,
        Status: OptionStatus
    ): CognitoOptionsStatus = {
      val __obj = js.Dynamic.literal(
        "Options" -> Options.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CognitoOptionsStatus]
    }
  }

  /** Container for the parameters required to enable cold storage for an OpenSearch Service domain. For more information, see [[https://docs.aws.amazon.com/opensearch-service/latest/developerguide/cold-storage.html|Cold storage for Amazon OpenSearch Service]].
    */
  @js.native
  trait ColdStorageOptions extends js.Object {
    var Enabled: Boolean
  }

  object ColdStorageOptions {
    @inline
    def apply(
        Enabled: Boolean
    ): ColdStorageOptions = {
      val __obj = js.Dynamic.literal(
        "Enabled" -> Enabled.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ColdStorageOptions]
    }
  }

  /** A map of OpenSearch or Elasticsearch versions and the versions you can upgrade them to.
    */
  @js.native
  trait CompatibleVersionsMap extends js.Object {
    var SourceVersion: js.UndefOr[VersionString]
    var TargetVersions: js.UndefOr[VersionList]
  }

  object CompatibleVersionsMap {
    @inline
    def apply(
        SourceVersion: js.UndefOr[VersionString] = js.undefined,
        TargetVersions: js.UndefOr[VersionList] = js.undefined
    ): CompatibleVersionsMap = {
      val __obj = js.Dynamic.literal()
      SourceVersion.foreach(__v => __obj.updateDynamic("SourceVersion")(__v.asInstanceOf[js.Any]))
      TargetVersions.foreach(__v => __obj.updateDynamic("TargetVersions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CompatibleVersionsMap]
    }
  }

  @js.native
  trait CreateDomainRequest extends js.Object {
    var DomainName: DomainName
    var AccessPolicies: js.UndefOr[PolicyDocument]
    var AdvancedOptions: js.UndefOr[AdvancedOptions]
    var AdvancedSecurityOptions: js.UndefOr[AdvancedSecurityOptionsInput]
    var AutoTuneOptions: js.UndefOr[AutoTuneOptionsInput]
    var ClusterConfig: js.UndefOr[ClusterConfig]
    var CognitoOptions: js.UndefOr[CognitoOptions]
    var DomainEndpointOptions: js.UndefOr[DomainEndpointOptions]
    var EBSOptions: js.UndefOr[EBSOptions]
    var EncryptionAtRestOptions: js.UndefOr[EncryptionAtRestOptions]
    var EngineVersion: js.UndefOr[VersionString]
    var LogPublishingOptions: js.UndefOr[LogPublishingOptions]
    var NodeToNodeEncryptionOptions: js.UndefOr[NodeToNodeEncryptionOptions]
    var SnapshotOptions: js.UndefOr[SnapshotOptions]
    var TagList: js.UndefOr[TagList]
    var VPCOptions: js.UndefOr[VPCOptions]
  }

  object CreateDomainRequest {
    @inline
    def apply(
        DomainName: DomainName,
        AccessPolicies: js.UndefOr[PolicyDocument] = js.undefined,
        AdvancedOptions: js.UndefOr[AdvancedOptions] = js.undefined,
        AdvancedSecurityOptions: js.UndefOr[AdvancedSecurityOptionsInput] = js.undefined,
        AutoTuneOptions: js.UndefOr[AutoTuneOptionsInput] = js.undefined,
        ClusterConfig: js.UndefOr[ClusterConfig] = js.undefined,
        CognitoOptions: js.UndefOr[CognitoOptions] = js.undefined,
        DomainEndpointOptions: js.UndefOr[DomainEndpointOptions] = js.undefined,
        EBSOptions: js.UndefOr[EBSOptions] = js.undefined,
        EncryptionAtRestOptions: js.UndefOr[EncryptionAtRestOptions] = js.undefined,
        EngineVersion: js.UndefOr[VersionString] = js.undefined,
        LogPublishingOptions: js.UndefOr[LogPublishingOptions] = js.undefined,
        NodeToNodeEncryptionOptions: js.UndefOr[NodeToNodeEncryptionOptions] = js.undefined,
        SnapshotOptions: js.UndefOr[SnapshotOptions] = js.undefined,
        TagList: js.UndefOr[TagList] = js.undefined,
        VPCOptions: js.UndefOr[VPCOptions] = js.undefined
    ): CreateDomainRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      AccessPolicies.foreach(__v => __obj.updateDynamic("AccessPolicies")(__v.asInstanceOf[js.Any]))
      AdvancedOptions.foreach(__v => __obj.updateDynamic("AdvancedOptions")(__v.asInstanceOf[js.Any]))
      AdvancedSecurityOptions.foreach(__v => __obj.updateDynamic("AdvancedSecurityOptions")(__v.asInstanceOf[js.Any]))
      AutoTuneOptions.foreach(__v => __obj.updateDynamic("AutoTuneOptions")(__v.asInstanceOf[js.Any]))
      ClusterConfig.foreach(__v => __obj.updateDynamic("ClusterConfig")(__v.asInstanceOf[js.Any]))
      CognitoOptions.foreach(__v => __obj.updateDynamic("CognitoOptions")(__v.asInstanceOf[js.Any]))
      DomainEndpointOptions.foreach(__v => __obj.updateDynamic("DomainEndpointOptions")(__v.asInstanceOf[js.Any]))
      EBSOptions.foreach(__v => __obj.updateDynamic("EBSOptions")(__v.asInstanceOf[js.Any]))
      EncryptionAtRestOptions.foreach(__v => __obj.updateDynamic("EncryptionAtRestOptions")(__v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
      LogPublishingOptions.foreach(__v => __obj.updateDynamic("LogPublishingOptions")(__v.asInstanceOf[js.Any]))
      NodeToNodeEncryptionOptions.foreach(__v => __obj.updateDynamic("NodeToNodeEncryptionOptions")(__v.asInstanceOf[js.Any]))
      SnapshotOptions.foreach(__v => __obj.updateDynamic("SnapshotOptions")(__v.asInstanceOf[js.Any]))
      TagList.foreach(__v => __obj.updateDynamic("TagList")(__v.asInstanceOf[js.Any]))
      VPCOptions.foreach(__v => __obj.updateDynamic("VPCOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDomainRequest]
    }
  }

  /** The result of a <code>CreateDomain</code> operation. Contains the status of the newly created domain.
    */
  @js.native
  trait CreateDomainResponse extends js.Object {
    var DomainStatus: js.UndefOr[DomainStatus]
  }

  object CreateDomainResponse {
    @inline
    def apply(
        DomainStatus: js.UndefOr[DomainStatus] = js.undefined
    ): CreateDomainResponse = {
      val __obj = js.Dynamic.literal()
      DomainStatus.foreach(__v => __obj.updateDynamic("DomainStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDomainResponse]
    }
  }

  /** Container for the parameters to the <code>CreateOutboundConnection</code> operation.
    */
  @js.native
  trait CreateOutboundConnectionRequest extends js.Object {
    var ConnectionAlias: ConnectionAlias
    var LocalDomainInfo: DomainInformationContainer
    var RemoteDomainInfo: DomainInformationContainer
  }

  object CreateOutboundConnectionRequest {
    @inline
    def apply(
        ConnectionAlias: ConnectionAlias,
        LocalDomainInfo: DomainInformationContainer,
        RemoteDomainInfo: DomainInformationContainer
    ): CreateOutboundConnectionRequest = {
      val __obj = js.Dynamic.literal(
        "ConnectionAlias" -> ConnectionAlias.asInstanceOf[js.Any],
        "LocalDomainInfo" -> LocalDomainInfo.asInstanceOf[js.Any],
        "RemoteDomainInfo" -> RemoteDomainInfo.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateOutboundConnectionRequest]
    }
  }

  /** The result of a <code>CreateOutboundConnection</code> request. Contains details about the newly created cross-cluster connection.
    */
  @js.native
  trait CreateOutboundConnectionResponse extends js.Object {
    var ConnectionAlias: js.UndefOr[ConnectionAlias]
    var ConnectionId: js.UndefOr[ConnectionId]
    var ConnectionStatus: js.UndefOr[OutboundConnectionStatus]
    var LocalDomainInfo: js.UndefOr[DomainInformationContainer]
    var RemoteDomainInfo: js.UndefOr[DomainInformationContainer]
  }

  object CreateOutboundConnectionResponse {
    @inline
    def apply(
        ConnectionAlias: js.UndefOr[ConnectionAlias] = js.undefined,
        ConnectionId: js.UndefOr[ConnectionId] = js.undefined,
        ConnectionStatus: js.UndefOr[OutboundConnectionStatus] = js.undefined,
        LocalDomainInfo: js.UndefOr[DomainInformationContainer] = js.undefined,
        RemoteDomainInfo: js.UndefOr[DomainInformationContainer] = js.undefined
    ): CreateOutboundConnectionResponse = {
      val __obj = js.Dynamic.literal()
      ConnectionAlias.foreach(__v => __obj.updateDynamic("ConnectionAlias")(__v.asInstanceOf[js.Any]))
      ConnectionId.foreach(__v => __obj.updateDynamic("ConnectionId")(__v.asInstanceOf[js.Any]))
      ConnectionStatus.foreach(__v => __obj.updateDynamic("ConnectionStatus")(__v.asInstanceOf[js.Any]))
      LocalDomainInfo.foreach(__v => __obj.updateDynamic("LocalDomainInfo")(__v.asInstanceOf[js.Any]))
      RemoteDomainInfo.foreach(__v => __obj.updateDynamic("RemoteDomainInfo")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateOutboundConnectionResponse]
    }
  }

  /** Container for request parameters to the <code>CreatePackage</code> operation.
    */
  @js.native
  trait CreatePackageRequest extends js.Object {
    var PackageName: PackageName
    var PackageSource: PackageSource
    var PackageType: PackageType
    var PackageDescription: js.UndefOr[PackageDescription]
  }

  object CreatePackageRequest {
    @inline
    def apply(
        PackageName: PackageName,
        PackageSource: PackageSource,
        PackageType: PackageType,
        PackageDescription: js.UndefOr[PackageDescription] = js.undefined
    ): CreatePackageRequest = {
      val __obj = js.Dynamic.literal(
        "PackageName" -> PackageName.asInstanceOf[js.Any],
        "PackageSource" -> PackageSource.asInstanceOf[js.Any],
        "PackageType" -> PackageType.asInstanceOf[js.Any]
      )

      PackageDescription.foreach(__v => __obj.updateDynamic("PackageDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePackageRequest]
    }
  }

  /** Container for the response returned by the <code>CreatePackage</code> operation.
    */
  @js.native
  trait CreatePackageResponse extends js.Object {
    var PackageDetails: js.UndefOr[PackageDetails]
  }

  object CreatePackageResponse {
    @inline
    def apply(
        PackageDetails: js.UndefOr[PackageDetails] = js.undefined
    ): CreatePackageResponse = {
      val __obj = js.Dynamic.literal()
      PackageDetails.foreach(__v => __obj.updateDynamic("PackageDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePackageResponse]
    }
  }

  @js.native
  trait CreateVpcEndpointRequest extends js.Object {
    var DomainArn: DomainArn
    var VpcOptions: VPCOptions
    var ClientToken: js.UndefOr[ClientToken]
  }

  object CreateVpcEndpointRequest {
    @inline
    def apply(
        DomainArn: DomainArn,
        VpcOptions: VPCOptions,
        ClientToken: js.UndefOr[ClientToken] = js.undefined
    ): CreateVpcEndpointRequest = {
      val __obj = js.Dynamic.literal(
        "DomainArn" -> DomainArn.asInstanceOf[js.Any],
        "VpcOptions" -> VpcOptions.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateVpcEndpointRequest]
    }
  }

  @js.native
  trait CreateVpcEndpointResponse extends js.Object {
    var VpcEndpoint: VpcEndpoint
  }

  object CreateVpcEndpointResponse {
    @inline
    def apply(
        VpcEndpoint: VpcEndpoint
    ): CreateVpcEndpointResponse = {
      val __obj = js.Dynamic.literal(
        "VpcEndpoint" -> VpcEndpoint.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateVpcEndpointResponse]
    }
  }

  /** Container for the parameters to the <code>DeleteDomain</code> operation.
    */
  @js.native
  trait DeleteDomainRequest extends js.Object {
    var DomainName: DomainName
  }

  object DeleteDomainRequest {
    @inline
    def apply(
        DomainName: DomainName
    ): DeleteDomainRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteDomainRequest]
    }
  }

  /** The results of a <code>DeleteDomain</code> request. Contains the status of the pending deletion, or a "domain not found" error if the domain and all of its resources have been deleted.
    */
  @js.native
  trait DeleteDomainResponse extends js.Object {
    var DomainStatus: js.UndefOr[DomainStatus]
  }

  object DeleteDomainResponse {
    @inline
    def apply(
        DomainStatus: js.UndefOr[DomainStatus] = js.undefined
    ): DeleteDomainResponse = {
      val __obj = js.Dynamic.literal()
      DomainStatus.foreach(__v => __obj.updateDynamic("DomainStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteDomainResponse]
    }
  }

  /** Container for the parameters to the <code>DeleteInboundConnection</code> operation.
    */
  @js.native
  trait DeleteInboundConnectionRequest extends js.Object {
    var ConnectionId: ConnectionId
  }

  object DeleteInboundConnectionRequest {
    @inline
    def apply(
        ConnectionId: ConnectionId
    ): DeleteInboundConnectionRequest = {
      val __obj = js.Dynamic.literal(
        "ConnectionId" -> ConnectionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteInboundConnectionRequest]
    }
  }

  /** The results of a <code>DeleteInboundConnection</code> operation. Contains details about the deleted inbound connection.
    */
  @js.native
  trait DeleteInboundConnectionResponse extends js.Object {
    var Connection: js.UndefOr[InboundConnection]
  }

  object DeleteInboundConnectionResponse {
    @inline
    def apply(
        Connection: js.UndefOr[InboundConnection] = js.undefined
    ): DeleteInboundConnectionResponse = {
      val __obj = js.Dynamic.literal()
      Connection.foreach(__v => __obj.updateDynamic("Connection")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteInboundConnectionResponse]
    }
  }

  /** Container for the parameters to the <code>DeleteOutboundConnection</code> operation.
    */
  @js.native
  trait DeleteOutboundConnectionRequest extends js.Object {
    var ConnectionId: ConnectionId
  }

  object DeleteOutboundConnectionRequest {
    @inline
    def apply(
        ConnectionId: ConnectionId
    ): DeleteOutboundConnectionRequest = {
      val __obj = js.Dynamic.literal(
        "ConnectionId" -> ConnectionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteOutboundConnectionRequest]
    }
  }

  /** Details about the deleted outbound connection.
    */
  @js.native
  trait DeleteOutboundConnectionResponse extends js.Object {
    var Connection: js.UndefOr[OutboundConnection]
  }

  object DeleteOutboundConnectionResponse {
    @inline
    def apply(
        Connection: js.UndefOr[OutboundConnection] = js.undefined
    ): DeleteOutboundConnectionResponse = {
      val __obj = js.Dynamic.literal()
      Connection.foreach(__v => __obj.updateDynamic("Connection")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteOutboundConnectionResponse]
    }
  }

  /** Deletes a package from OpenSearch Service. The package can't be associated with any OpenSearch Service domain.
    */
  @js.native
  trait DeletePackageRequest extends js.Object {
    var PackageID: PackageID
  }

  object DeletePackageRequest {
    @inline
    def apply(
        PackageID: PackageID
    ): DeletePackageRequest = {
      val __obj = js.Dynamic.literal(
        "PackageID" -> PackageID.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeletePackageRequest]
    }
  }

  /** Container for the response parameters to the <code>DeletePackage</code> operation.
    */
  @js.native
  trait DeletePackageResponse extends js.Object {
    var PackageDetails: js.UndefOr[PackageDetails]
  }

  object DeletePackageResponse {
    @inline
    def apply(
        PackageDetails: js.UndefOr[PackageDetails] = js.undefined
    ): DeletePackageResponse = {
      val __obj = js.Dynamic.literal()
      PackageDetails.foreach(__v => __obj.updateDynamic("PackageDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeletePackageResponse]
    }
  }

  @js.native
  trait DeleteVpcEndpointRequest extends js.Object {
    var VpcEndpointId: VpcEndpointId
  }

  object DeleteVpcEndpointRequest {
    @inline
    def apply(
        VpcEndpointId: VpcEndpointId
    ): DeleteVpcEndpointRequest = {
      val __obj = js.Dynamic.literal(
        "VpcEndpointId" -> VpcEndpointId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteVpcEndpointRequest]
    }
  }

  @js.native
  trait DeleteVpcEndpointResponse extends js.Object {
    var VpcEndpointSummary: VpcEndpointSummary
  }

  object DeleteVpcEndpointResponse {
    @inline
    def apply(
        VpcEndpointSummary: VpcEndpointSummary
    ): DeleteVpcEndpointResponse = {
      val __obj = js.Dynamic.literal(
        "VpcEndpointSummary" -> VpcEndpointSummary.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteVpcEndpointResponse]
    }
  }

  /** Container for the parameters to the <code>DescribeDomainAutoTunes</code> operation.
    */
  @js.native
  trait DescribeDomainAutoTunesRequest extends js.Object {
    var DomainName: DomainName
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeDomainAutoTunesRequest {
    @inline
    def apply(
        DomainName: DomainName,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeDomainAutoTunesRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDomainAutoTunesRequest]
    }
  }

  /** The result of a <code>DescribeDomainAutoTunes</code> request.
    */
  @js.native
  trait DescribeDomainAutoTunesResponse extends js.Object {
    var AutoTunes: js.UndefOr[AutoTuneList]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeDomainAutoTunesResponse {
    @inline
    def apply(
        AutoTunes: js.UndefOr[AutoTuneList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeDomainAutoTunesResponse = {
      val __obj = js.Dynamic.literal()
      AutoTunes.foreach(__v => __obj.updateDynamic("AutoTunes")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDomainAutoTunesResponse]
    }
  }

  /** Container for the parameters to the <code>DescribeDomainChangeProgress</code> operation.
    */
  @js.native
  trait DescribeDomainChangeProgressRequest extends js.Object {
    var DomainName: DomainName
    var ChangeId: js.UndefOr[GUID]
  }

  object DescribeDomainChangeProgressRequest {
    @inline
    def apply(
        DomainName: DomainName,
        ChangeId: js.UndefOr[GUID] = js.undefined
    ): DescribeDomainChangeProgressRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      ChangeId.foreach(__v => __obj.updateDynamic("ChangeId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDomainChangeProgressRequest]
    }
  }

  /** The result of a <code>DescribeDomainChangeProgress</code> request. Contains progress information for the requested domain change.
    */
  @js.native
  trait DescribeDomainChangeProgressResponse extends js.Object {
    var ChangeProgressStatus: js.UndefOr[ChangeProgressStatusDetails]
  }

  object DescribeDomainChangeProgressResponse {
    @inline
    def apply(
        ChangeProgressStatus: js.UndefOr[ChangeProgressStatusDetails] = js.undefined
    ): DescribeDomainChangeProgressResponse = {
      val __obj = js.Dynamic.literal()
      ChangeProgressStatus.foreach(__v => __obj.updateDynamic("ChangeProgressStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDomainChangeProgressResponse]
    }
  }

  /** Container for the parameters to the <code>DescribeDomainConfig</code> operation.
    */
  @js.native
  trait DescribeDomainConfigRequest extends js.Object {
    var DomainName: DomainName
  }

  object DescribeDomainConfigRequest {
    @inline
    def apply(
        DomainName: DomainName
    ): DescribeDomainConfigRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeDomainConfigRequest]
    }
  }

  /** Contains the configuration information of the requested domain.
    */
  @js.native
  trait DescribeDomainConfigResponse extends js.Object {
    var DomainConfig: DomainConfig
  }

  object DescribeDomainConfigResponse {
    @inline
    def apply(
        DomainConfig: DomainConfig
    ): DescribeDomainConfigResponse = {
      val __obj = js.Dynamic.literal(
        "DomainConfig" -> DomainConfig.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeDomainConfigResponse]
    }
  }

  /** Container for the parameters to the <code>DescribeDomain</code> operation.
    */
  @js.native
  trait DescribeDomainRequest extends js.Object {
    var DomainName: DomainName
  }

  object DescribeDomainRequest {
    @inline
    def apply(
        DomainName: DomainName
    ): DescribeDomainRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeDomainRequest]
    }
  }

  /** Contains the status of the domain specified in the request.
    */
  @js.native
  trait DescribeDomainResponse extends js.Object {
    var DomainStatus: DomainStatus
  }

  object DescribeDomainResponse {
    @inline
    def apply(
        DomainStatus: DomainStatus
    ): DescribeDomainResponse = {
      val __obj = js.Dynamic.literal(
        "DomainStatus" -> DomainStatus.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeDomainResponse]
    }
  }

  /** Container for the parameters to the <code>DescribeDomains</code> operation.
    */
  @js.native
  trait DescribeDomainsRequest extends js.Object {
    var DomainNames: DomainNameList
  }

  object DescribeDomainsRequest {
    @inline
    def apply(
        DomainNames: DomainNameList
    ): DescribeDomainsRequest = {
      val __obj = js.Dynamic.literal(
        "DomainNames" -> DomainNames.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeDomainsRequest]
    }
  }

  /** Contains the status of the specified domains or all domains owned by the account.
    */
  @js.native
  trait DescribeDomainsResponse extends js.Object {
    var DomainStatusList: DomainStatusList
  }

  object DescribeDomainsResponse {
    @inline
    def apply(
        DomainStatusList: DomainStatusList
    ): DescribeDomainsResponse = {
      val __obj = js.Dynamic.literal(
        "DomainStatusList" -> DomainStatusList.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeDomainsResponse]
    }
  }

  /** Container for the parameters to the <code>DescribeInboundConnections</code> operation.
    */
  @js.native
  trait DescribeInboundConnectionsRequest extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeInboundConnectionsRequest {
    @inline
    def apply(
        Filters: js.UndefOr[FilterList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeInboundConnectionsRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeInboundConnectionsRequest]
    }
  }

  /** Contains a list of connections matching the filter criteria.
    */
  @js.native
  trait DescribeInboundConnectionsResponse extends js.Object {
    var Connections: js.UndefOr[InboundConnections]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeInboundConnectionsResponse {
    @inline
    def apply(
        Connections: js.UndefOr[InboundConnections] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeInboundConnectionsResponse = {
      val __obj = js.Dynamic.literal()
      Connections.foreach(__v => __obj.updateDynamic("Connections")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeInboundConnectionsResponse]
    }
  }

  /** Container for the parameters to the <code>DescribeInstanceTypeLimits</code> operation.
    */
  @js.native
  trait DescribeInstanceTypeLimitsRequest extends js.Object {
    var EngineVersion: VersionString
    var InstanceType: OpenSearchPartitionInstanceType
    var DomainName: js.UndefOr[DomainName]
  }

  object DescribeInstanceTypeLimitsRequest {
    @inline
    def apply(
        EngineVersion: VersionString,
        InstanceType: OpenSearchPartitionInstanceType,
        DomainName: js.UndefOr[DomainName] = js.undefined
    ): DescribeInstanceTypeLimitsRequest = {
      val __obj = js.Dynamic.literal(
        "EngineVersion" -> EngineVersion.asInstanceOf[js.Any],
        "InstanceType" -> InstanceType.asInstanceOf[js.Any]
      )

      DomainName.foreach(__v => __obj.updateDynamic("DomainName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeInstanceTypeLimitsRequest]
    }
  }

  /** Container for the parameters received from the <code>DescribeInstanceTypeLimits</code> operation.
    */
  @js.native
  trait DescribeInstanceTypeLimitsResponse extends js.Object {
    var LimitsByRole: js.UndefOr[LimitsByRole]
  }

  object DescribeInstanceTypeLimitsResponse {
    @inline
    def apply(
        LimitsByRole: js.UndefOr[LimitsByRole] = js.undefined
    ): DescribeInstanceTypeLimitsResponse = {
      val __obj = js.Dynamic.literal()
      LimitsByRole.foreach(__v => __obj.updateDynamic("LimitsByRole")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeInstanceTypeLimitsResponse]
    }
  }

  /** Container for the parameters to the <code>DescribeOutboundConnections</code> operation.
    */
  @js.native
  trait DescribeOutboundConnectionsRequest extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeOutboundConnectionsRequest {
    @inline
    def apply(
        Filters: js.UndefOr[FilterList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeOutboundConnectionsRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeOutboundConnectionsRequest]
    }
  }

  /** Contains a list of connections matching the filter criteria.
    */
  @js.native
  trait DescribeOutboundConnectionsResponse extends js.Object {
    var Connections: js.UndefOr[OutboundConnections]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeOutboundConnectionsResponse {
    @inline
    def apply(
        Connections: js.UndefOr[OutboundConnections] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeOutboundConnectionsResponse = {
      val __obj = js.Dynamic.literal()
      Connections.foreach(__v => __obj.updateDynamic("Connections")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeOutboundConnectionsResponse]
    }
  }

  /** A filter to apply to the <code>DescribePackage</code> response.
    */
  @js.native
  trait DescribePackagesFilter extends js.Object {
    var Name: js.UndefOr[DescribePackagesFilterName]
    var Value: js.UndefOr[DescribePackagesFilterValues]
  }

  object DescribePackagesFilter {
    @inline
    def apply(
        Name: js.UndefOr[DescribePackagesFilterName] = js.undefined,
        Value: js.UndefOr[DescribePackagesFilterValues] = js.undefined
    ): DescribePackagesFilter = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePackagesFilter]
    }
  }

  /** Container for the request parameters to the <code>DescribePackage</code> operation.
    */
  @js.native
  trait DescribePackagesRequest extends js.Object {
    var Filters: js.UndefOr[DescribePackagesFilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribePackagesRequest {
    @inline
    def apply(
        Filters: js.UndefOr[DescribePackagesFilterList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribePackagesRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePackagesRequest]
    }
  }

  /** Container for the response returned by the <code>DescribePackages</code> operation.
    */
  @js.native
  trait DescribePackagesResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var PackageDetailsList: js.UndefOr[PackageDetailsList]
  }

  object DescribePackagesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        PackageDetailsList: js.UndefOr[PackageDetailsList] = js.undefined
    ): DescribePackagesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PackageDetailsList.foreach(__v => __obj.updateDynamic("PackageDetailsList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePackagesResponse]
    }
  }

  /** Container for the request parameters to a <code>DescribeReservedInstanceOfferings</code> operation.
    */
  @js.native
  trait DescribeReservedInstanceOfferingsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var ReservedInstanceOfferingId: js.UndefOr[GUID]
  }

  object DescribeReservedInstanceOfferingsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ReservedInstanceOfferingId: js.UndefOr[GUID] = js.undefined
    ): DescribeReservedInstanceOfferingsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ReservedInstanceOfferingId.foreach(__v => __obj.updateDynamic("ReservedInstanceOfferingId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeReservedInstanceOfferingsRequest]
    }
  }

  /** Container for results of a <code>DescribeReservedInstanceOfferings</code> request.
    */
  @js.native
  trait DescribeReservedInstanceOfferingsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var ReservedInstanceOfferings: js.UndefOr[ReservedInstanceOfferingList]
  }

  object DescribeReservedInstanceOfferingsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ReservedInstanceOfferings: js.UndefOr[ReservedInstanceOfferingList] = js.undefined
    ): DescribeReservedInstanceOfferingsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ReservedInstanceOfferings.foreach(__v => __obj.updateDynamic("ReservedInstanceOfferings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeReservedInstanceOfferingsResponse]
    }
  }

  /** Container for the request parameters to the <code>DescribeReservedInstances</code> operation.
    */
  @js.native
  trait DescribeReservedInstancesRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var ReservedInstanceId: js.UndefOr[GUID]
  }

  object DescribeReservedInstancesRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ReservedInstanceId: js.UndefOr[GUID] = js.undefined
    ): DescribeReservedInstancesRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ReservedInstanceId.foreach(__v => __obj.updateDynamic("ReservedInstanceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeReservedInstancesRequest]
    }
  }

  /** Container for results from <code>DescribeReservedInstances</code>
    */
  @js.native
  trait DescribeReservedInstancesResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var ReservedInstances: js.UndefOr[ReservedInstanceList]
  }

  object DescribeReservedInstancesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        ReservedInstances: js.UndefOr[ReservedInstanceList] = js.undefined
    ): DescribeReservedInstancesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ReservedInstances.foreach(__v => __obj.updateDynamic("ReservedInstances")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeReservedInstancesResponse]
    }
  }

  @js.native
  trait DescribeVpcEndpointsRequest extends js.Object {
    var VpcEndpointIds: VpcEndpointIdList
  }

  object DescribeVpcEndpointsRequest {
    @inline
    def apply(
        VpcEndpointIds: VpcEndpointIdList
    ): DescribeVpcEndpointsRequest = {
      val __obj = js.Dynamic.literal(
        "VpcEndpointIds" -> VpcEndpointIds.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeVpcEndpointsRequest]
    }
  }

  @js.native
  trait DescribeVpcEndpointsResponse extends js.Object {
    var VpcEndpointErrors: VpcEndpointErrorList
    var VpcEndpoints: VpcEndpoints
  }

  object DescribeVpcEndpointsResponse {
    @inline
    def apply(
        VpcEndpointErrors: VpcEndpointErrorList,
        VpcEndpoints: VpcEndpoints
    ): DescribeVpcEndpointsResponse = {
      val __obj = js.Dynamic.literal(
        "VpcEndpointErrors" -> VpcEndpointErrors.asInstanceOf[js.Any],
        "VpcEndpoints" -> VpcEndpoints.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeVpcEndpointsResponse]
    }
  }

  /** Container for the request parameters to the <code>DissociatePackage</code> operation.
    */
  @js.native
  trait DissociatePackageRequest extends js.Object {
    var DomainName: DomainName
    var PackageID: PackageID
  }

  object DissociatePackageRequest {
    @inline
    def apply(
        DomainName: DomainName,
        PackageID: PackageID
    ): DissociatePackageRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "PackageID" -> PackageID.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DissociatePackageRequest]
    }
  }

  /** Container for the response returned by an <code>DissociatePackage</code> operation.
    */
  @js.native
  trait DissociatePackageResponse extends js.Object {
    var DomainPackageDetails: js.UndefOr[DomainPackageDetails]
  }

  object DissociatePackageResponse {
    @inline
    def apply(
        DomainPackageDetails: js.UndefOr[DomainPackageDetails] = js.undefined
    ): DissociatePackageResponse = {
      val __obj = js.Dynamic.literal()
      DomainPackageDetails.foreach(__v => __obj.updateDynamic("DomainPackageDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DissociatePackageResponse]
    }
  }

  /** Container for the configuration of an OpenSearch Service domain.
    */
  @js.native
  trait DomainConfig extends js.Object {
    var AccessPolicies: js.UndefOr[AccessPoliciesStatus]
    var AdvancedOptions: js.UndefOr[AdvancedOptionsStatus]
    var AdvancedSecurityOptions: js.UndefOr[AdvancedSecurityOptionsStatus]
    var AutoTuneOptions: js.UndefOr[AutoTuneOptionsStatus]
    var ChangeProgressDetails: js.UndefOr[ChangeProgressDetails]
    var ClusterConfig: js.UndefOr[ClusterConfigStatus]
    var CognitoOptions: js.UndefOr[CognitoOptionsStatus]
    var DomainEndpointOptions: js.UndefOr[DomainEndpointOptionsStatus]
    var EBSOptions: js.UndefOr[EBSOptionsStatus]
    var EncryptionAtRestOptions: js.UndefOr[EncryptionAtRestOptionsStatus]
    var EngineVersion: js.UndefOr[VersionStatus]
    var LogPublishingOptions: js.UndefOr[LogPublishingOptionsStatus]
    var NodeToNodeEncryptionOptions: js.UndefOr[NodeToNodeEncryptionOptionsStatus]
    var SnapshotOptions: js.UndefOr[SnapshotOptionsStatus]
    var VPCOptions: js.UndefOr[VPCDerivedInfoStatus]
  }

  object DomainConfig {
    @inline
    def apply(
        AccessPolicies: js.UndefOr[AccessPoliciesStatus] = js.undefined,
        AdvancedOptions: js.UndefOr[AdvancedOptionsStatus] = js.undefined,
        AdvancedSecurityOptions: js.UndefOr[AdvancedSecurityOptionsStatus] = js.undefined,
        AutoTuneOptions: js.UndefOr[AutoTuneOptionsStatus] = js.undefined,
        ChangeProgressDetails: js.UndefOr[ChangeProgressDetails] = js.undefined,
        ClusterConfig: js.UndefOr[ClusterConfigStatus] = js.undefined,
        CognitoOptions: js.UndefOr[CognitoOptionsStatus] = js.undefined,
        DomainEndpointOptions: js.UndefOr[DomainEndpointOptionsStatus] = js.undefined,
        EBSOptions: js.UndefOr[EBSOptionsStatus] = js.undefined,
        EncryptionAtRestOptions: js.UndefOr[EncryptionAtRestOptionsStatus] = js.undefined,
        EngineVersion: js.UndefOr[VersionStatus] = js.undefined,
        LogPublishingOptions: js.UndefOr[LogPublishingOptionsStatus] = js.undefined,
        NodeToNodeEncryptionOptions: js.UndefOr[NodeToNodeEncryptionOptionsStatus] = js.undefined,
        SnapshotOptions: js.UndefOr[SnapshotOptionsStatus] = js.undefined,
        VPCOptions: js.UndefOr[VPCDerivedInfoStatus] = js.undefined
    ): DomainConfig = {
      val __obj = js.Dynamic.literal()
      AccessPolicies.foreach(__v => __obj.updateDynamic("AccessPolicies")(__v.asInstanceOf[js.Any]))
      AdvancedOptions.foreach(__v => __obj.updateDynamic("AdvancedOptions")(__v.asInstanceOf[js.Any]))
      AdvancedSecurityOptions.foreach(__v => __obj.updateDynamic("AdvancedSecurityOptions")(__v.asInstanceOf[js.Any]))
      AutoTuneOptions.foreach(__v => __obj.updateDynamic("AutoTuneOptions")(__v.asInstanceOf[js.Any]))
      ChangeProgressDetails.foreach(__v => __obj.updateDynamic("ChangeProgressDetails")(__v.asInstanceOf[js.Any]))
      ClusterConfig.foreach(__v => __obj.updateDynamic("ClusterConfig")(__v.asInstanceOf[js.Any]))
      CognitoOptions.foreach(__v => __obj.updateDynamic("CognitoOptions")(__v.asInstanceOf[js.Any]))
      DomainEndpointOptions.foreach(__v => __obj.updateDynamic("DomainEndpointOptions")(__v.asInstanceOf[js.Any]))
      EBSOptions.foreach(__v => __obj.updateDynamic("EBSOptions")(__v.asInstanceOf[js.Any]))
      EncryptionAtRestOptions.foreach(__v => __obj.updateDynamic("EncryptionAtRestOptions")(__v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
      LogPublishingOptions.foreach(__v => __obj.updateDynamic("LogPublishingOptions")(__v.asInstanceOf[js.Any]))
      NodeToNodeEncryptionOptions.foreach(__v => __obj.updateDynamic("NodeToNodeEncryptionOptions")(__v.asInstanceOf[js.Any]))
      SnapshotOptions.foreach(__v => __obj.updateDynamic("SnapshotOptions")(__v.asInstanceOf[js.Any]))
      VPCOptions.foreach(__v => __obj.updateDynamic("VPCOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DomainConfig]
    }
  }

  /** Options to configure a custom endpoint for an OpenSearch Service domain.
    */
  @js.native
  trait DomainEndpointOptions extends js.Object {
    var CustomEndpoint: js.UndefOr[DomainNameFqdn]
    var CustomEndpointCertificateArn: js.UndefOr[ARN]
    var CustomEndpointEnabled: js.UndefOr[Boolean]
    var EnforceHTTPS: js.UndefOr[Boolean]
    var TLSSecurityPolicy: js.UndefOr[TLSSecurityPolicy]
  }

  object DomainEndpointOptions {
    @inline
    def apply(
        CustomEndpoint: js.UndefOr[DomainNameFqdn] = js.undefined,
        CustomEndpointCertificateArn: js.UndefOr[ARN] = js.undefined,
        CustomEndpointEnabled: js.UndefOr[Boolean] = js.undefined,
        EnforceHTTPS: js.UndefOr[Boolean] = js.undefined,
        TLSSecurityPolicy: js.UndefOr[TLSSecurityPolicy] = js.undefined
    ): DomainEndpointOptions = {
      val __obj = js.Dynamic.literal()
      CustomEndpoint.foreach(__v => __obj.updateDynamic("CustomEndpoint")(__v.asInstanceOf[js.Any]))
      CustomEndpointCertificateArn.foreach(__v => __obj.updateDynamic("CustomEndpointCertificateArn")(__v.asInstanceOf[js.Any]))
      CustomEndpointEnabled.foreach(__v => __obj.updateDynamic("CustomEndpointEnabled")(__v.asInstanceOf[js.Any]))
      EnforceHTTPS.foreach(__v => __obj.updateDynamic("EnforceHTTPS")(__v.asInstanceOf[js.Any]))
      TLSSecurityPolicy.foreach(__v => __obj.updateDynamic("TLSSecurityPolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DomainEndpointOptions]
    }
  }

  /** The configured endpoint options for a domain and their current status.
    */
  @js.native
  trait DomainEndpointOptionsStatus extends js.Object {
    var Options: DomainEndpointOptions
    var Status: OptionStatus
  }

  object DomainEndpointOptionsStatus {
    @inline
    def apply(
        Options: DomainEndpointOptions,
        Status: OptionStatus
    ): DomainEndpointOptionsStatus = {
      val __obj = js.Dynamic.literal(
        "Options" -> Options.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DomainEndpointOptionsStatus]
    }
  }

  /** Information about an OpenSearch Service domain.
    */
  @js.native
  trait DomainInfo extends js.Object {
    var DomainName: js.UndefOr[DomainName]
    var EngineType: js.UndefOr[EngineType]
  }

  object DomainInfo {
    @inline
    def apply(
        DomainName: js.UndefOr[DomainName] = js.undefined,
        EngineType: js.UndefOr[EngineType] = js.undefined
    ): DomainInfo = {
      val __obj = js.Dynamic.literal()
      DomainName.foreach(__v => __obj.updateDynamic("DomainName")(__v.asInstanceOf[js.Any]))
      EngineType.foreach(__v => __obj.updateDynamic("EngineType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DomainInfo]
    }
  }

  /** Container for information about an OpenSearch Service domain.
    */
  @js.native
  trait DomainInformationContainer extends js.Object {
    var AWSDomainInformation: js.UndefOr[AWSDomainInformation]
  }

  object DomainInformationContainer {
    @inline
    def apply(
        AWSDomainInformation: js.UndefOr[AWSDomainInformation] = js.undefined
    ): DomainInformationContainer = {
      val __obj = js.Dynamic.literal()
      AWSDomainInformation.foreach(__v => __obj.updateDynamic("AWSDomainInformation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DomainInformationContainer]
    }
  }

  /** Information about a package that is associated with a domain. For more information, see [[https://docs.aws.amazon.com/opensearch-service/latest/developerguide/custom-packages.html|Custom packages for Amazon OpenSearch Service]].
    */
  @js.native
  trait DomainPackageDetails extends js.Object {
    var DomainName: js.UndefOr[DomainName]
    var DomainPackageStatus: js.UndefOr[DomainPackageStatus]
    var ErrorDetails: js.UndefOr[ErrorDetails]
    var LastUpdated: js.UndefOr[LastUpdated]
    var PackageID: js.UndefOr[PackageID]
    var PackageName: js.UndefOr[PackageName]
    var PackageType: js.UndefOr[PackageType]
    var PackageVersion: js.UndefOr[PackageVersion]
    var ReferencePath: js.UndefOr[ReferencePath]
  }

  object DomainPackageDetails {
    @inline
    def apply(
        DomainName: js.UndefOr[DomainName] = js.undefined,
        DomainPackageStatus: js.UndefOr[DomainPackageStatus] = js.undefined,
        ErrorDetails: js.UndefOr[ErrorDetails] = js.undefined,
        LastUpdated: js.UndefOr[LastUpdated] = js.undefined,
        PackageID: js.UndefOr[PackageID] = js.undefined,
        PackageName: js.UndefOr[PackageName] = js.undefined,
        PackageType: js.UndefOr[PackageType] = js.undefined,
        PackageVersion: js.UndefOr[PackageVersion] = js.undefined,
        ReferencePath: js.UndefOr[ReferencePath] = js.undefined
    ): DomainPackageDetails = {
      val __obj = js.Dynamic.literal()
      DomainName.foreach(__v => __obj.updateDynamic("DomainName")(__v.asInstanceOf[js.Any]))
      DomainPackageStatus.foreach(__v => __obj.updateDynamic("DomainPackageStatus")(__v.asInstanceOf[js.Any]))
      ErrorDetails.foreach(__v => __obj.updateDynamic("ErrorDetails")(__v.asInstanceOf[js.Any]))
      LastUpdated.foreach(__v => __obj.updateDynamic("LastUpdated")(__v.asInstanceOf[js.Any]))
      PackageID.foreach(__v => __obj.updateDynamic("PackageID")(__v.asInstanceOf[js.Any]))
      PackageName.foreach(__v => __obj.updateDynamic("PackageName")(__v.asInstanceOf[js.Any]))
      PackageType.foreach(__v => __obj.updateDynamic("PackageType")(__v.asInstanceOf[js.Any]))
      PackageVersion.foreach(__v => __obj.updateDynamic("PackageVersion")(__v.asInstanceOf[js.Any]))
      ReferencePath.foreach(__v => __obj.updateDynamic("ReferencePath")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DomainPackageDetails]
    }
  }

  /** The current status of an OpenSearch Service domain.
    */
  @js.native
  trait DomainStatus extends js.Object {
    var ARN: ARN
    var ClusterConfig: ClusterConfig
    var DomainId: DomainId
    var DomainName: DomainName
    var AccessPolicies: js.UndefOr[PolicyDocument]
    var AdvancedOptions: js.UndefOr[AdvancedOptions]
    var AdvancedSecurityOptions: js.UndefOr[AdvancedSecurityOptions]
    var AutoTuneOptions: js.UndefOr[AutoTuneOptionsOutput]
    var ChangeProgressDetails: js.UndefOr[ChangeProgressDetails]
    var CognitoOptions: js.UndefOr[CognitoOptions]
    var Created: js.UndefOr[Boolean]
    var Deleted: js.UndefOr[Boolean]
    var DomainEndpointOptions: js.UndefOr[DomainEndpointOptions]
    var EBSOptions: js.UndefOr[EBSOptions]
    var EncryptionAtRestOptions: js.UndefOr[EncryptionAtRestOptions]
    var Endpoint: js.UndefOr[ServiceUrl]
    var Endpoints: js.UndefOr[EndpointsMap]
    var EngineVersion: js.UndefOr[VersionString]
    var LogPublishingOptions: js.UndefOr[LogPublishingOptions]
    var NodeToNodeEncryptionOptions: js.UndefOr[NodeToNodeEncryptionOptions]
    var Processing: js.UndefOr[Boolean]
    var ServiceSoftwareOptions: js.UndefOr[ServiceSoftwareOptions]
    var SnapshotOptions: js.UndefOr[SnapshotOptions]
    var UpgradeProcessing: js.UndefOr[Boolean]
    var VPCOptions: js.UndefOr[VPCDerivedInfo]
  }

  object DomainStatus {
    @inline
    def apply(
        ARN: ARN,
        ClusterConfig: ClusterConfig,
        DomainId: DomainId,
        DomainName: DomainName,
        AccessPolicies: js.UndefOr[PolicyDocument] = js.undefined,
        AdvancedOptions: js.UndefOr[AdvancedOptions] = js.undefined,
        AdvancedSecurityOptions: js.UndefOr[AdvancedSecurityOptions] = js.undefined,
        AutoTuneOptions: js.UndefOr[AutoTuneOptionsOutput] = js.undefined,
        ChangeProgressDetails: js.UndefOr[ChangeProgressDetails] = js.undefined,
        CognitoOptions: js.UndefOr[CognitoOptions] = js.undefined,
        Created: js.UndefOr[Boolean] = js.undefined,
        Deleted: js.UndefOr[Boolean] = js.undefined,
        DomainEndpointOptions: js.UndefOr[DomainEndpointOptions] = js.undefined,
        EBSOptions: js.UndefOr[EBSOptions] = js.undefined,
        EncryptionAtRestOptions: js.UndefOr[EncryptionAtRestOptions] = js.undefined,
        Endpoint: js.UndefOr[ServiceUrl] = js.undefined,
        Endpoints: js.UndefOr[EndpointsMap] = js.undefined,
        EngineVersion: js.UndefOr[VersionString] = js.undefined,
        LogPublishingOptions: js.UndefOr[LogPublishingOptions] = js.undefined,
        NodeToNodeEncryptionOptions: js.UndefOr[NodeToNodeEncryptionOptions] = js.undefined,
        Processing: js.UndefOr[Boolean] = js.undefined,
        ServiceSoftwareOptions: js.UndefOr[ServiceSoftwareOptions] = js.undefined,
        SnapshotOptions: js.UndefOr[SnapshotOptions] = js.undefined,
        UpgradeProcessing: js.UndefOr[Boolean] = js.undefined,
        VPCOptions: js.UndefOr[VPCDerivedInfo] = js.undefined
    ): DomainStatus = {
      val __obj = js.Dynamic.literal(
        "ARN" -> ARN.asInstanceOf[js.Any],
        "ClusterConfig" -> ClusterConfig.asInstanceOf[js.Any],
        "DomainId" -> DomainId.asInstanceOf[js.Any],
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      AccessPolicies.foreach(__v => __obj.updateDynamic("AccessPolicies")(__v.asInstanceOf[js.Any]))
      AdvancedOptions.foreach(__v => __obj.updateDynamic("AdvancedOptions")(__v.asInstanceOf[js.Any]))
      AdvancedSecurityOptions.foreach(__v => __obj.updateDynamic("AdvancedSecurityOptions")(__v.asInstanceOf[js.Any]))
      AutoTuneOptions.foreach(__v => __obj.updateDynamic("AutoTuneOptions")(__v.asInstanceOf[js.Any]))
      ChangeProgressDetails.foreach(__v => __obj.updateDynamic("ChangeProgressDetails")(__v.asInstanceOf[js.Any]))
      CognitoOptions.foreach(__v => __obj.updateDynamic("CognitoOptions")(__v.asInstanceOf[js.Any]))
      Created.foreach(__v => __obj.updateDynamic("Created")(__v.asInstanceOf[js.Any]))
      Deleted.foreach(__v => __obj.updateDynamic("Deleted")(__v.asInstanceOf[js.Any]))
      DomainEndpointOptions.foreach(__v => __obj.updateDynamic("DomainEndpointOptions")(__v.asInstanceOf[js.Any]))
      EBSOptions.foreach(__v => __obj.updateDynamic("EBSOptions")(__v.asInstanceOf[js.Any]))
      EncryptionAtRestOptions.foreach(__v => __obj.updateDynamic("EncryptionAtRestOptions")(__v.asInstanceOf[js.Any]))
      Endpoint.foreach(__v => __obj.updateDynamic("Endpoint")(__v.asInstanceOf[js.Any]))
      Endpoints.foreach(__v => __obj.updateDynamic("Endpoints")(__v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
      LogPublishingOptions.foreach(__v => __obj.updateDynamic("LogPublishingOptions")(__v.asInstanceOf[js.Any]))
      NodeToNodeEncryptionOptions.foreach(__v => __obj.updateDynamic("NodeToNodeEncryptionOptions")(__v.asInstanceOf[js.Any]))
      Processing.foreach(__v => __obj.updateDynamic("Processing")(__v.asInstanceOf[js.Any]))
      ServiceSoftwareOptions.foreach(__v => __obj.updateDynamic("ServiceSoftwareOptions")(__v.asInstanceOf[js.Any]))
      SnapshotOptions.foreach(__v => __obj.updateDynamic("SnapshotOptions")(__v.asInstanceOf[js.Any]))
      UpgradeProcessing.foreach(__v => __obj.updateDynamic("UpgradeProcessing")(__v.asInstanceOf[js.Any]))
      VPCOptions.foreach(__v => __obj.updateDynamic("VPCOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DomainStatus]
    }
  }

  /** Results of a dry run performed in an update domain request.
    */
  @js.native
  trait DryRunResults extends js.Object {
    var DeploymentType: js.UndefOr[DeploymentType]
    var Message: js.UndefOr[Message]
  }

  object DryRunResults {
    @inline
    def apply(
        DeploymentType: js.UndefOr[DeploymentType] = js.undefined,
        Message: js.UndefOr[Message] = js.undefined
    ): DryRunResults = {
      val __obj = js.Dynamic.literal()
      DeploymentType.foreach(__v => __obj.updateDynamic("DeploymentType")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DryRunResults]
    }
  }

  /** The duration of a maintenance schedule. For more information, see [[https://docs.aws.amazon.com/opensearch-service/latest/developerguide/auto-tune.html|Auto-Tune for Amazon OpenSearch Service]].
    */
  @js.native
  trait Duration extends js.Object {
    var Unit: js.UndefOr[TimeUnit]
    var Value: js.UndefOr[DurationValue]
  }

  object Duration {
    @inline
    def apply(
        Unit: js.UndefOr[TimeUnit] = js.undefined,
        Value: js.UndefOr[DurationValue] = js.undefined
    ): Duration = {
      val __obj = js.Dynamic.literal()
      Unit.foreach(__v => __obj.updateDynamic("Unit")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Duration]
    }
  }

  /** Container for the parameters required to enable EBS-based storage for an OpenSearch Service domain.
    */
  @js.native
  trait EBSOptions extends js.Object {
    var EBSEnabled: js.UndefOr[Boolean]
    var Iops: js.UndefOr[IntegerClass]
    var Throughput: js.UndefOr[IntegerClass]
    var VolumeSize: js.UndefOr[IntegerClass]
    var VolumeType: js.UndefOr[VolumeType]
  }

  object EBSOptions {
    @inline
    def apply(
        EBSEnabled: js.UndefOr[Boolean] = js.undefined,
        Iops: js.UndefOr[IntegerClass] = js.undefined,
        Throughput: js.UndefOr[IntegerClass] = js.undefined,
        VolumeSize: js.UndefOr[IntegerClass] = js.undefined,
        VolumeType: js.UndefOr[VolumeType] = js.undefined
    ): EBSOptions = {
      val __obj = js.Dynamic.literal()
      EBSEnabled.foreach(__v => __obj.updateDynamic("EBSEnabled")(__v.asInstanceOf[js.Any]))
      Iops.foreach(__v => __obj.updateDynamic("Iops")(__v.asInstanceOf[js.Any]))
      Throughput.foreach(__v => __obj.updateDynamic("Throughput")(__v.asInstanceOf[js.Any]))
      VolumeSize.foreach(__v => __obj.updateDynamic("VolumeSize")(__v.asInstanceOf[js.Any]))
      VolumeType.foreach(__v => __obj.updateDynamic("VolumeType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EBSOptions]
    }
  }

  /** The status of the EBS options for the specified OpenSearch Service domain.
    */
  @js.native
  trait EBSOptionsStatus extends js.Object {
    var Options: EBSOptions
    var Status: OptionStatus
  }

  object EBSOptionsStatus {
    @inline
    def apply(
        Options: EBSOptions,
        Status: OptionStatus
    ): EBSOptionsStatus = {
      val __obj = js.Dynamic.literal(
        "Options" -> Options.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[EBSOptionsStatus]
    }
  }

  /** Specifies whether the domain should encrypt data at rest, and if so, the Key Management Service (KMS) key to use. Can be used only to create a new domain, not update an existing one.
    */
  @js.native
  trait EncryptionAtRestOptions extends js.Object {
    var Enabled: js.UndefOr[Boolean]
    var KmsKeyId: js.UndefOr[KmsKeyId]
  }

  object EncryptionAtRestOptions {
    @inline
    def apply(
        Enabled: js.UndefOr[Boolean] = js.undefined,
        KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
    ): EncryptionAtRestOptions = {
      val __obj = js.Dynamic.literal()
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EncryptionAtRestOptions]
    }
  }

  /** Status of the encryption at rest options for the specified OpenSearch Service domain.
    */
  @js.native
  trait EncryptionAtRestOptionsStatus extends js.Object {
    var Options: EncryptionAtRestOptions
    var Status: OptionStatus
  }

  object EncryptionAtRestOptionsStatus {
    @inline
    def apply(
        Options: EncryptionAtRestOptions,
        Status: OptionStatus
    ): EncryptionAtRestOptionsStatus = {
      val __obj = js.Dynamic.literal(
        "Options" -> Options.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[EncryptionAtRestOptionsStatus]
    }
  }

  /** Additional information if the package is in an error state. Null otherwise.
    */
  @js.native
  trait ErrorDetails extends js.Object {
    var ErrorMessage: js.UndefOr[ErrorMessage]
    var ErrorType: js.UndefOr[ErrorType]
  }

  object ErrorDetails {
    @inline
    def apply(
        ErrorMessage: js.UndefOr[ErrorMessage] = js.undefined,
        ErrorType: js.UndefOr[ErrorType] = js.undefined
    ): ErrorDetails = {
      val __obj = js.Dynamic.literal()
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      ErrorType.foreach(__v => __obj.updateDynamic("ErrorType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ErrorDetails]
    }
  }

  /** A filter used to limit results when describing inbound or outbound cross-cluster connections. You can specify multiple values per filter. A cross-cluster connection must match at least one of the specified values for it to be returned from an operation.
    */
  @js.native
  trait Filter extends js.Object {
    var Name: js.UndefOr[NonEmptyString]
    var Values: js.UndefOr[ValueStringList]
  }

  object Filter {
    @inline
    def apply(
        Name: js.UndefOr[NonEmptyString] = js.undefined,
        Values: js.UndefOr[ValueStringList] = js.undefined
    ): Filter = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.updateDynamic("Values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Filter]
    }
  }

  /** Container for the request parameters to <code>GetCompatibleVersions</code> operation.
    */
  @js.native
  trait GetCompatibleVersionsRequest extends js.Object {
    var DomainName: js.UndefOr[DomainName]
  }

  object GetCompatibleVersionsRequest {
    @inline
    def apply(
        DomainName: js.UndefOr[DomainName] = js.undefined
    ): GetCompatibleVersionsRequest = {
      val __obj = js.Dynamic.literal()
      DomainName.foreach(__v => __obj.updateDynamic("DomainName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCompatibleVersionsRequest]
    }
  }

  /** Container for the response returned by the <code>GetCompatibleVersions</code> operation.
    */
  @js.native
  trait GetCompatibleVersionsResponse extends js.Object {
    var CompatibleVersions: js.UndefOr[CompatibleVersionsList]
  }

  object GetCompatibleVersionsResponse {
    @inline
    def apply(
        CompatibleVersions: js.UndefOr[CompatibleVersionsList] = js.undefined
    ): GetCompatibleVersionsResponse = {
      val __obj = js.Dynamic.literal()
      CompatibleVersions.foreach(__v => __obj.updateDynamic("CompatibleVersions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCompatibleVersionsResponse]
    }
  }

  /** Container for the request parameters to the <code>GetPackageVersionHistory</code> operation.
    */
  @js.native
  trait GetPackageVersionHistoryRequest extends js.Object {
    var PackageID: PackageID
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetPackageVersionHistoryRequest {
    @inline
    def apply(
        PackageID: PackageID,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetPackageVersionHistoryRequest = {
      val __obj = js.Dynamic.literal(
        "PackageID" -> PackageID.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPackageVersionHistoryRequest]
    }
  }

  /** Container for response returned by <code>GetPackageVersionHistory</code> operation.
    */
  @js.native
  trait GetPackageVersionHistoryResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var PackageID: js.UndefOr[PackageID]
    var PackageVersionHistoryList: js.UndefOr[PackageVersionHistoryList]
  }

  object GetPackageVersionHistoryResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        PackageID: js.UndefOr[PackageID] = js.undefined,
        PackageVersionHistoryList: js.UndefOr[PackageVersionHistoryList] = js.undefined
    ): GetPackageVersionHistoryResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PackageID.foreach(__v => __obj.updateDynamic("PackageID")(__v.asInstanceOf[js.Any]))
      PackageVersionHistoryList.foreach(__v => __obj.updateDynamic("PackageVersionHistoryList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPackageVersionHistoryResponse]
    }
  }

  /** Container for the request parameters to the <code>GetUpgradeHistory</code> operation.
    */
  @js.native
  trait GetUpgradeHistoryRequest extends js.Object {
    var DomainName: DomainName
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetUpgradeHistoryRequest {
    @inline
    def apply(
        DomainName: DomainName,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetUpgradeHistoryRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetUpgradeHistoryRequest]
    }
  }

  /** Container for the response returned by the <code>GetUpgradeHistory</code> operation.
    */
  @js.native
  trait GetUpgradeHistoryResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var UpgradeHistories: js.UndefOr[UpgradeHistoryList]
  }

  object GetUpgradeHistoryResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        UpgradeHistories: js.UndefOr[UpgradeHistoryList] = js.undefined
    ): GetUpgradeHistoryResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      UpgradeHistories.foreach(__v => __obj.updateDynamic("UpgradeHistories")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetUpgradeHistoryResponse]
    }
  }

  /** Container for the request parameters to the <code>GetUpgradeStatus</code> operation.
    */
  @js.native
  trait GetUpgradeStatusRequest extends js.Object {
    var DomainName: DomainName
  }

  object GetUpgradeStatusRequest {
    @inline
    def apply(
        DomainName: DomainName
    ): GetUpgradeStatusRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetUpgradeStatusRequest]
    }
  }

  /** Container for the response returned by the <code>GetUpgradeStatus</code> operation.
    */
  @js.native
  trait GetUpgradeStatusResponse extends js.Object {
    var StepStatus: js.UndefOr[UpgradeStatus]
    var UpgradeName: js.UndefOr[UpgradeName]
    var UpgradeStep: js.UndefOr[UpgradeStep]
  }

  object GetUpgradeStatusResponse {
    @inline
    def apply(
        StepStatus: js.UndefOr[UpgradeStatus] = js.undefined,
        UpgradeName: js.UndefOr[UpgradeName] = js.undefined,
        UpgradeStep: js.UndefOr[UpgradeStep] = js.undefined
    ): GetUpgradeStatusResponse = {
      val __obj = js.Dynamic.literal()
      StepStatus.foreach(__v => __obj.updateDynamic("StepStatus")(__v.asInstanceOf[js.Any]))
      UpgradeName.foreach(__v => __obj.updateDynamic("UpgradeName")(__v.asInstanceOf[js.Any]))
      UpgradeStep.foreach(__v => __obj.updateDynamic("UpgradeStep")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetUpgradeStatusResponse]
    }
  }

  /** Describes an inbound cross-cluster connection for Amazon OpenSearch Service. For more information, see [[https://docs.aws.amazon.com/opensearch-service/latest/developerguide/cross-cluster-search.html|Cross-cluster search for Amazon OpenSearch Service]].
    */
  @js.native
  trait InboundConnection extends js.Object {
    var ConnectionId: js.UndefOr[ConnectionId]
    var ConnectionStatus: js.UndefOr[InboundConnectionStatus]
    var LocalDomainInfo: js.UndefOr[DomainInformationContainer]
    var RemoteDomainInfo: js.UndefOr[DomainInformationContainer]
  }

  object InboundConnection {
    @inline
    def apply(
        ConnectionId: js.UndefOr[ConnectionId] = js.undefined,
        ConnectionStatus: js.UndefOr[InboundConnectionStatus] = js.undefined,
        LocalDomainInfo: js.UndefOr[DomainInformationContainer] = js.undefined,
        RemoteDomainInfo: js.UndefOr[DomainInformationContainer] = js.undefined
    ): InboundConnection = {
      val __obj = js.Dynamic.literal()
      ConnectionId.foreach(__v => __obj.updateDynamic("ConnectionId")(__v.asInstanceOf[js.Any]))
      ConnectionStatus.foreach(__v => __obj.updateDynamic("ConnectionStatus")(__v.asInstanceOf[js.Any]))
      LocalDomainInfo.foreach(__v => __obj.updateDynamic("LocalDomainInfo")(__v.asInstanceOf[js.Any]))
      RemoteDomainInfo.foreach(__v => __obj.updateDynamic("RemoteDomainInfo")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InboundConnection]
    }
  }

  /** The status of an inbound cross-cluster connection for OpenSearch Service.
    */
  @js.native
  trait InboundConnectionStatus extends js.Object {
    var Message: js.UndefOr[ConnectionStatusMessage]
    var StatusCode: js.UndefOr[InboundConnectionStatusCode]
  }

  object InboundConnectionStatus {
    @inline
    def apply(
        Message: js.UndefOr[ConnectionStatusMessage] = js.undefined,
        StatusCode: js.UndefOr[InboundConnectionStatusCode] = js.undefined
    ): InboundConnectionStatus = {
      val __obj = js.Dynamic.literal()
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      StatusCode.foreach(__v => __obj.updateDynamic("StatusCode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InboundConnectionStatus]
    }
  }

  /** Limits on the number of instances that can be created in OpenSearch Service for a given instance type.
    */
  @js.native
  trait InstanceCountLimits extends js.Object {
    var MaximumInstanceCount: js.UndefOr[MaximumInstanceCount]
    var MinimumInstanceCount: js.UndefOr[MinimumInstanceCount]
  }

  object InstanceCountLimits {
    @inline
    def apply(
        MaximumInstanceCount: js.UndefOr[MaximumInstanceCount] = js.undefined,
        MinimumInstanceCount: js.UndefOr[MinimumInstanceCount] = js.undefined
    ): InstanceCountLimits = {
      val __obj = js.Dynamic.literal()
      MaximumInstanceCount.foreach(__v => __obj.updateDynamic("MaximumInstanceCount")(__v.asInstanceOf[js.Any]))
      MinimumInstanceCount.foreach(__v => __obj.updateDynamic("MinimumInstanceCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceCountLimits]
    }
  }

  /** Instance-related attributes that are available for a given instance type.
    */
  @js.native
  trait InstanceLimits extends js.Object {
    var InstanceCountLimits: js.UndefOr[InstanceCountLimits]
  }

  object InstanceLimits {
    @inline
    def apply(
        InstanceCountLimits: js.UndefOr[InstanceCountLimits] = js.undefined
    ): InstanceLimits = {
      val __obj = js.Dynamic.literal()
      InstanceCountLimits.foreach(__v => __obj.updateDynamic("InstanceCountLimits")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceLimits]
    }
  }

  /** Lists all instance types and available features for a given OpenSearch or Elasticsearch version.
    */
  @js.native
  trait InstanceTypeDetails extends js.Object {
    var AdvancedSecurityEnabled: js.UndefOr[Boolean]
    var AppLogsEnabled: js.UndefOr[Boolean]
    var CognitoEnabled: js.UndefOr[Boolean]
    var EncryptionEnabled: js.UndefOr[Boolean]
    var InstanceRole: js.UndefOr[InstanceRoleList]
    var InstanceType: js.UndefOr[OpenSearchPartitionInstanceType]
    var WarmEnabled: js.UndefOr[Boolean]
  }

  object InstanceTypeDetails {
    @inline
    def apply(
        AdvancedSecurityEnabled: js.UndefOr[Boolean] = js.undefined,
        AppLogsEnabled: js.UndefOr[Boolean] = js.undefined,
        CognitoEnabled: js.UndefOr[Boolean] = js.undefined,
        EncryptionEnabled: js.UndefOr[Boolean] = js.undefined,
        InstanceRole: js.UndefOr[InstanceRoleList] = js.undefined,
        InstanceType: js.UndefOr[OpenSearchPartitionInstanceType] = js.undefined,
        WarmEnabled: js.UndefOr[Boolean] = js.undefined
    ): InstanceTypeDetails = {
      val __obj = js.Dynamic.literal()
      AdvancedSecurityEnabled.foreach(__v => __obj.updateDynamic("AdvancedSecurityEnabled")(__v.asInstanceOf[js.Any]))
      AppLogsEnabled.foreach(__v => __obj.updateDynamic("AppLogsEnabled")(__v.asInstanceOf[js.Any]))
      CognitoEnabled.foreach(__v => __obj.updateDynamic("CognitoEnabled")(__v.asInstanceOf[js.Any]))
      EncryptionEnabled.foreach(__v => __obj.updateDynamic("EncryptionEnabled")(__v.asInstanceOf[js.Any]))
      InstanceRole.foreach(__v => __obj.updateDynamic("InstanceRole")(__v.asInstanceOf[js.Any]))
      InstanceType.foreach(__v => __obj.updateDynamic("InstanceType")(__v.asInstanceOf[js.Any]))
      WarmEnabled.foreach(__v => __obj.updateDynamic("WarmEnabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceTypeDetails]
    }
  }

  /** Limits for a given instance type and for each of its roles.
    */
  @js.native
  trait Limits extends js.Object {
    var AdditionalLimits: js.UndefOr[AdditionalLimitList]
    var InstanceLimits: js.UndefOr[InstanceLimits]
    var StorageTypes: js.UndefOr[StorageTypeList]
  }

  object Limits {
    @inline
    def apply(
        AdditionalLimits: js.UndefOr[AdditionalLimitList] = js.undefined,
        InstanceLimits: js.UndefOr[InstanceLimits] = js.undefined,
        StorageTypes: js.UndefOr[StorageTypeList] = js.undefined
    ): Limits = {
      val __obj = js.Dynamic.literal()
      AdditionalLimits.foreach(__v => __obj.updateDynamic("AdditionalLimits")(__v.asInstanceOf[js.Any]))
      InstanceLimits.foreach(__v => __obj.updateDynamic("InstanceLimits")(__v.asInstanceOf[js.Any]))
      StorageTypes.foreach(__v => __obj.updateDynamic("StorageTypes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Limits]
    }
  }

  /** Container for the parameters to the <code>ListDomainNames</code> operation.
    */
  @js.native
  trait ListDomainNamesRequest extends js.Object {
    var EngineType: js.UndefOr[EngineType]
  }

  object ListDomainNamesRequest {
    @inline
    def apply(
        EngineType: js.UndefOr[EngineType] = js.undefined
    ): ListDomainNamesRequest = {
      val __obj = js.Dynamic.literal()
      EngineType.foreach(__v => __obj.updateDynamic("EngineType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDomainNamesRequest]
    }
  }

  /** The results of a <code>ListDomainNames</code> operation. Contains the names of all domains owned by this account and their respective engine types.
    */
  @js.native
  trait ListDomainNamesResponse extends js.Object {
    var DomainNames: js.UndefOr[DomainInfoList]
  }

  object ListDomainNamesResponse {
    @inline
    def apply(
        DomainNames: js.UndefOr[DomainInfoList] = js.undefined
    ): ListDomainNamesResponse = {
      val __obj = js.Dynamic.literal()
      DomainNames.foreach(__v => __obj.updateDynamic("DomainNames")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDomainNamesResponse]
    }
  }

  /** Container for the request parameters to the <code>ListDomainsForPackage</code> operation.
    */
  @js.native
  trait ListDomainsForPackageRequest extends js.Object {
    var PackageID: PackageID
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDomainsForPackageRequest {
    @inline
    def apply(
        PackageID: PackageID,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDomainsForPackageRequest = {
      val __obj = js.Dynamic.literal(
        "PackageID" -> PackageID.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDomainsForPackageRequest]
    }
  }

  /** Container for the response parameters to the <code>ListDomainsForPackage</code> operation.
    */
  @js.native
  trait ListDomainsForPackageResponse extends js.Object {
    var DomainPackageDetailsList: js.UndefOr[DomainPackageDetailsList]
    var NextToken: js.UndefOr[String]
  }

  object ListDomainsForPackageResponse {
    @inline
    def apply(
        DomainPackageDetailsList: js.UndefOr[DomainPackageDetailsList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListDomainsForPackageResponse = {
      val __obj = js.Dynamic.literal()
      DomainPackageDetailsList.foreach(__v => __obj.updateDynamic("DomainPackageDetailsList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDomainsForPackageResponse]
    }
  }

  @js.native
  trait ListInstanceTypeDetailsRequest extends js.Object {
    var EngineVersion: VersionString
    var DomainName: js.UndefOr[DomainName]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListInstanceTypeDetailsRequest {
    @inline
    def apply(
        EngineVersion: VersionString,
        DomainName: js.UndefOr[DomainName] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListInstanceTypeDetailsRequest = {
      val __obj = js.Dynamic.literal(
        "EngineVersion" -> EngineVersion.asInstanceOf[js.Any]
      )

      DomainName.foreach(__v => __obj.updateDynamic("DomainName")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInstanceTypeDetailsRequest]
    }
  }

  @js.native
  trait ListInstanceTypeDetailsResponse extends js.Object {
    var InstanceTypeDetails: js.UndefOr[InstanceTypeDetailsList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListInstanceTypeDetailsResponse {
    @inline
    def apply(
        InstanceTypeDetails: js.UndefOr[InstanceTypeDetailsList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListInstanceTypeDetailsResponse = {
      val __obj = js.Dynamic.literal()
      InstanceTypeDetails.foreach(__v => __obj.updateDynamic("InstanceTypeDetails")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInstanceTypeDetailsResponse]
    }
  }

  /** Container for the request parameters to the <code>ListPackagesForDomain</code> operation.
    */
  @js.native
  trait ListPackagesForDomainRequest extends js.Object {
    var DomainName: DomainName
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListPackagesForDomainRequest {
    @inline
    def apply(
        DomainName: DomainName,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListPackagesForDomainRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPackagesForDomainRequest]
    }
  }

  /** Container for the response parameters to the <code>ListPackagesForDomain</code> operation.
    */
  @js.native
  trait ListPackagesForDomainResponse extends js.Object {
    var DomainPackageDetailsList: js.UndefOr[DomainPackageDetailsList]
    var NextToken: js.UndefOr[String]
  }

  object ListPackagesForDomainResponse {
    @inline
    def apply(
        DomainPackageDetailsList: js.UndefOr[DomainPackageDetailsList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListPackagesForDomainResponse = {
      val __obj = js.Dynamic.literal()
      DomainPackageDetailsList.foreach(__v => __obj.updateDynamic("DomainPackageDetailsList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPackagesForDomainResponse]
    }
  }

  /** Container for the parameters to the <code>ListTags</code> operation.
    */
  @js.native
  trait ListTagsRequest extends js.Object {
    var ARN: ARN
  }

  object ListTagsRequest {
    @inline
    def apply(
        ARN: ARN
    ): ListTagsRequest = {
      val __obj = js.Dynamic.literal(
        "ARN" -> ARN.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsRequest]
    }
  }

  /** The results of a <code>ListTags</code> operation.
    */
  @js.native
  trait ListTagsResponse extends js.Object {
    var TagList: js.UndefOr[TagList]
  }

  object ListTagsResponse {
    @inline
    def apply(
        TagList: js.UndefOr[TagList] = js.undefined
    ): ListTagsResponse = {
      val __obj = js.Dynamic.literal()
      TagList.foreach(__v => __obj.updateDynamic("TagList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsResponse]
    }
  }

  /** Container for the request parameters to the <code>ListVersions</code> operation.
    */
  @js.native
  trait ListVersionsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListVersionsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListVersionsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVersionsRequest]
    }
  }

  /** Container for the parameters for response received from the <code>ListVersions</code> operation.
    */
  @js.native
  trait ListVersionsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Versions: js.UndefOr[VersionList]
  }

  object ListVersionsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Versions: js.UndefOr[VersionList] = js.undefined
    ): ListVersionsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Versions.foreach(__v => __obj.updateDynamic("Versions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVersionsResponse]
    }
  }

  @js.native
  trait ListVpcEndpointAccessRequest extends js.Object {
    var DomainName: DomainName
    var NextToken: js.UndefOr[NextToken]
  }

  object ListVpcEndpointAccessRequest {
    @inline
    def apply(
        DomainName: DomainName,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListVpcEndpointAccessRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVpcEndpointAccessRequest]
    }
  }

  @js.native
  trait ListVpcEndpointAccessResponse extends js.Object {
    var AuthorizedPrincipalList: AuthorizedPrincipalList
    var NextToken: NextToken
  }

  object ListVpcEndpointAccessResponse {
    @inline
    def apply(
        AuthorizedPrincipalList: AuthorizedPrincipalList,
        NextToken: NextToken
    ): ListVpcEndpointAccessResponse = {
      val __obj = js.Dynamic.literal(
        "AuthorizedPrincipalList" -> AuthorizedPrincipalList.asInstanceOf[js.Any],
        "NextToken" -> NextToken.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListVpcEndpointAccessResponse]
    }
  }

  @js.native
  trait ListVpcEndpointsForDomainRequest extends js.Object {
    var DomainName: DomainName
    var NextToken: js.UndefOr[NextToken]
  }

  object ListVpcEndpointsForDomainRequest {
    @inline
    def apply(
        DomainName: DomainName,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListVpcEndpointsForDomainRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVpcEndpointsForDomainRequest]
    }
  }

  @js.native
  trait ListVpcEndpointsForDomainResponse extends js.Object {
    var NextToken: NextToken
    var VpcEndpointSummaryList: VpcEndpointSummaryList
  }

  object ListVpcEndpointsForDomainResponse {
    @inline
    def apply(
        NextToken: NextToken,
        VpcEndpointSummaryList: VpcEndpointSummaryList
    ): ListVpcEndpointsForDomainResponse = {
      val __obj = js.Dynamic.literal(
        "NextToken" -> NextToken.asInstanceOf[js.Any],
        "VpcEndpointSummaryList" -> VpcEndpointSummaryList.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListVpcEndpointsForDomainResponse]
    }
  }

  @js.native
  trait ListVpcEndpointsRequest extends js.Object {
    var NextToken: js.UndefOr[NextToken]
  }

  object ListVpcEndpointsRequest {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListVpcEndpointsRequest = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVpcEndpointsRequest]
    }
  }

  @js.native
  trait ListVpcEndpointsResponse extends js.Object {
    var NextToken: NextToken
    var VpcEndpointSummaryList: VpcEndpointSummaryList
  }

  object ListVpcEndpointsResponse {
    @inline
    def apply(
        NextToken: NextToken,
        VpcEndpointSummaryList: VpcEndpointSummaryList
    ): ListVpcEndpointsResponse = {
      val __obj = js.Dynamic.literal(
        "NextToken" -> NextToken.asInstanceOf[js.Any],
        "VpcEndpointSummaryList" -> VpcEndpointSummaryList.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListVpcEndpointsResponse]
    }
  }

  /** Specifies whether the Amazon OpenSearch Service domain publishes the OpenSearch application and slow logs to Amazon CloudWatch. For more information, see [[https://docs.aws.amazon.com/opensearch-service/latest/developerguide/createdomain-configure-slow-logs.html|Monitoring OpenSearch logs with Amazon CloudWatch Logs]].
    *
    * '''Note:'''After you enable log publishing, you still have to enable the collection of slow logs using the OpenSearch REST API.
    */
  @js.native
  trait LogPublishingOption extends js.Object {
    var CloudWatchLogsLogGroupArn: js.UndefOr[CloudWatchLogsLogGroupArn]
    var Enabled: js.UndefOr[Boolean]
  }

  object LogPublishingOption {
    @inline
    def apply(
        CloudWatchLogsLogGroupArn: js.UndefOr[CloudWatchLogsLogGroupArn] = js.undefined,
        Enabled: js.UndefOr[Boolean] = js.undefined
    ): LogPublishingOption = {
      val __obj = js.Dynamic.literal()
      CloudWatchLogsLogGroupArn.foreach(__v => __obj.updateDynamic("CloudWatchLogsLogGroupArn")(__v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LogPublishingOption]
    }
  }

  /** The configured log publishing options for the domain and their current status.
    */
  @js.native
  trait LogPublishingOptionsStatus extends js.Object {
    var Options: js.UndefOr[LogPublishingOptions]
    var Status: js.UndefOr[OptionStatus]
  }

  object LogPublishingOptionsStatus {
    @inline
    def apply(
        Options: js.UndefOr[LogPublishingOptions] = js.undefined,
        Status: js.UndefOr[OptionStatus] = js.undefined
    ): LogPublishingOptionsStatus = {
      val __obj = js.Dynamic.literal()
      Options.foreach(__v => __obj.updateDynamic("Options")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LogPublishingOptionsStatus]
    }
  }

  /** Credentials for the master user for a domain.
    */
  @js.native
  trait MasterUserOptions extends js.Object {
    var MasterUserARN: js.UndefOr[ARN]
    var MasterUserName: js.UndefOr[Username]
    var MasterUserPassword: js.UndefOr[Password]
  }

  object MasterUserOptions {
    @inline
    def apply(
        MasterUserARN: js.UndefOr[ARN] = js.undefined,
        MasterUserName: js.UndefOr[Username] = js.undefined,
        MasterUserPassword: js.UndefOr[Password] = js.undefined
    ): MasterUserOptions = {
      val __obj = js.Dynamic.literal()
      MasterUserARN.foreach(__v => __obj.updateDynamic("MasterUserARN")(__v.asInstanceOf[js.Any]))
      MasterUserName.foreach(__v => __obj.updateDynamic("MasterUserName")(__v.asInstanceOf[js.Any]))
      MasterUserPassword.foreach(__v => __obj.updateDynamic("MasterUserPassword")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MasterUserOptions]
    }
  }

  /** Enables or disables node-to-node encryption. For more information, see [[https://docs.aws.amazon.com/opensearch-service/latest/developerguide/ntn.html|Node-to-node encryption for Amazon OpenSearch Service]].
    */
  @js.native
  trait NodeToNodeEncryptionOptions extends js.Object {
    var Enabled: js.UndefOr[Boolean]
  }

  object NodeToNodeEncryptionOptions {
    @inline
    def apply(
        Enabled: js.UndefOr[Boolean] = js.undefined
    ): NodeToNodeEncryptionOptions = {
      val __obj = js.Dynamic.literal()
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NodeToNodeEncryptionOptions]
    }
  }

  /** Status of the node-to-node encryption options for the specified domain.
    */
  @js.native
  trait NodeToNodeEncryptionOptionsStatus extends js.Object {
    var Options: NodeToNodeEncryptionOptions
    var Status: OptionStatus
  }

  object NodeToNodeEncryptionOptionsStatus {
    @inline
    def apply(
        Options: NodeToNodeEncryptionOptions,
        Status: OptionStatus
    ): NodeToNodeEncryptionOptionsStatus = {
      val __obj = js.Dynamic.literal(
        "Options" -> Options.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[NodeToNodeEncryptionOptionsStatus]
    }
  }

  /** Provides the current status of an entity.
    */
  @js.native
  trait OptionStatus extends js.Object {
    var CreationDate: UpdateTimestamp
    var State: OptionState
    var UpdateDate: UpdateTimestamp
    var PendingDeletion: js.UndefOr[Boolean]
    var UpdateVersion: js.UndefOr[UIntValue]
  }

  object OptionStatus {
    @inline
    def apply(
        CreationDate: UpdateTimestamp,
        State: OptionState,
        UpdateDate: UpdateTimestamp,
        PendingDeletion: js.UndefOr[Boolean] = js.undefined,
        UpdateVersion: js.UndefOr[UIntValue] = js.undefined
    ): OptionStatus = {
      val __obj = js.Dynamic.literal(
        "CreationDate" -> CreationDate.asInstanceOf[js.Any],
        "State" -> State.asInstanceOf[js.Any],
        "UpdateDate" -> UpdateDate.asInstanceOf[js.Any]
      )

      PendingDeletion.foreach(__v => __obj.updateDynamic("PendingDeletion")(__v.asInstanceOf[js.Any]))
      UpdateVersion.foreach(__v => __obj.updateDynamic("UpdateVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OptionStatus]
    }
  }

  /** Specifies details about an outbound cross-cluster connection.
    */
  @js.native
  trait OutboundConnection extends js.Object {
    var ConnectionAlias: js.UndefOr[ConnectionAlias]
    var ConnectionId: js.UndefOr[ConnectionId]
    var ConnectionStatus: js.UndefOr[OutboundConnectionStatus]
    var LocalDomainInfo: js.UndefOr[DomainInformationContainer]
    var RemoteDomainInfo: js.UndefOr[DomainInformationContainer]
  }

  object OutboundConnection {
    @inline
    def apply(
        ConnectionAlias: js.UndefOr[ConnectionAlias] = js.undefined,
        ConnectionId: js.UndefOr[ConnectionId] = js.undefined,
        ConnectionStatus: js.UndefOr[OutboundConnectionStatus] = js.undefined,
        LocalDomainInfo: js.UndefOr[DomainInformationContainer] = js.undefined,
        RemoteDomainInfo: js.UndefOr[DomainInformationContainer] = js.undefined
    ): OutboundConnection = {
      val __obj = js.Dynamic.literal()
      ConnectionAlias.foreach(__v => __obj.updateDynamic("ConnectionAlias")(__v.asInstanceOf[js.Any]))
      ConnectionId.foreach(__v => __obj.updateDynamic("ConnectionId")(__v.asInstanceOf[js.Any]))
      ConnectionStatus.foreach(__v => __obj.updateDynamic("ConnectionStatus")(__v.asInstanceOf[js.Any]))
      LocalDomainInfo.foreach(__v => __obj.updateDynamic("LocalDomainInfo")(__v.asInstanceOf[js.Any]))
      RemoteDomainInfo.foreach(__v => __obj.updateDynamic("RemoteDomainInfo")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OutboundConnection]
    }
  }

  /** The status of an outbound cross-cluster connection.
    */
  @js.native
  trait OutboundConnectionStatus extends js.Object {
    var Message: js.UndefOr[ConnectionStatusMessage]
    var StatusCode: js.UndefOr[OutboundConnectionStatusCode]
  }

  object OutboundConnectionStatus {
    @inline
    def apply(
        Message: js.UndefOr[ConnectionStatusMessage] = js.undefined,
        StatusCode: js.UndefOr[OutboundConnectionStatusCode] = js.undefined
    ): OutboundConnectionStatus = {
      val __obj = js.Dynamic.literal()
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      StatusCode.foreach(__v => __obj.updateDynamic("StatusCode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OutboundConnectionStatus]
    }
  }

  /** Basic information about a package.
    */
  @js.native
  trait PackageDetails extends js.Object {
    var AvailablePackageVersion: js.UndefOr[PackageVersion]
    var CreatedAt: js.UndefOr[CreatedAt]
    var ErrorDetails: js.UndefOr[ErrorDetails]
    var LastUpdatedAt: js.UndefOr[LastUpdated]
    var PackageDescription: js.UndefOr[PackageDescription]
    var PackageID: js.UndefOr[PackageID]
    var PackageName: js.UndefOr[PackageName]
    var PackageStatus: js.UndefOr[PackageStatus]
    var PackageType: js.UndefOr[PackageType]
  }

  object PackageDetails {
    @inline
    def apply(
        AvailablePackageVersion: js.UndefOr[PackageVersion] = js.undefined,
        CreatedAt: js.UndefOr[CreatedAt] = js.undefined,
        ErrorDetails: js.UndefOr[ErrorDetails] = js.undefined,
        LastUpdatedAt: js.UndefOr[LastUpdated] = js.undefined,
        PackageDescription: js.UndefOr[PackageDescription] = js.undefined,
        PackageID: js.UndefOr[PackageID] = js.undefined,
        PackageName: js.UndefOr[PackageName] = js.undefined,
        PackageStatus: js.UndefOr[PackageStatus] = js.undefined,
        PackageType: js.UndefOr[PackageType] = js.undefined
    ): PackageDetails = {
      val __obj = js.Dynamic.literal()
      AvailablePackageVersion.foreach(__v => __obj.updateDynamic("AvailablePackageVersion")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      ErrorDetails.foreach(__v => __obj.updateDynamic("ErrorDetails")(__v.asInstanceOf[js.Any]))
      LastUpdatedAt.foreach(__v => __obj.updateDynamic("LastUpdatedAt")(__v.asInstanceOf[js.Any]))
      PackageDescription.foreach(__v => __obj.updateDynamic("PackageDescription")(__v.asInstanceOf[js.Any]))
      PackageID.foreach(__v => __obj.updateDynamic("PackageID")(__v.asInstanceOf[js.Any]))
      PackageName.foreach(__v => __obj.updateDynamic("PackageName")(__v.asInstanceOf[js.Any]))
      PackageStatus.foreach(__v => __obj.updateDynamic("PackageStatus")(__v.asInstanceOf[js.Any]))
      PackageType.foreach(__v => __obj.updateDynamic("PackageType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PackageDetails]
    }
  }

  /** The Amazon S3 location to import the package from.
    */
  @js.native
  trait PackageSource extends js.Object {
    var S3BucketName: js.UndefOr[S3BucketName]
    var S3Key: js.UndefOr[S3Key]
  }

  object PackageSource {
    @inline
    def apply(
        S3BucketName: js.UndefOr[S3BucketName] = js.undefined,
        S3Key: js.UndefOr[S3Key] = js.undefined
    ): PackageSource = {
      val __obj = js.Dynamic.literal()
      S3BucketName.foreach(__v => __obj.updateDynamic("S3BucketName")(__v.asInstanceOf[js.Any]))
      S3Key.foreach(__v => __obj.updateDynamic("S3Key")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PackageSource]
    }
  }

  /** Details about a package version.
    */
  @js.native
  trait PackageVersionHistory extends js.Object {
    var CommitMessage: js.UndefOr[CommitMessage]
    var CreatedAt: js.UndefOr[CreatedAt]
    var PackageVersion: js.UndefOr[PackageVersion]
  }

  object PackageVersionHistory {
    @inline
    def apply(
        CommitMessage: js.UndefOr[CommitMessage] = js.undefined,
        CreatedAt: js.UndefOr[CreatedAt] = js.undefined,
        PackageVersion: js.UndefOr[PackageVersion] = js.undefined
    ): PackageVersionHistory = {
      val __obj = js.Dynamic.literal()
      CommitMessage.foreach(__v => __obj.updateDynamic("CommitMessage")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      PackageVersion.foreach(__v => __obj.updateDynamic("PackageVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PackageVersionHistory]
    }
  }

  /** Container for request parameters to the <code>PurchaseReservedInstanceOffering</code> operation.
    */
  @js.native
  trait PurchaseReservedInstanceOfferingRequest extends js.Object {
    var ReservationName: ReservationToken
    var ReservedInstanceOfferingId: GUID
    var InstanceCount: js.UndefOr[InstanceCount]
  }

  object PurchaseReservedInstanceOfferingRequest {
    @inline
    def apply(
        ReservationName: ReservationToken,
        ReservedInstanceOfferingId: GUID,
        InstanceCount: js.UndefOr[InstanceCount] = js.undefined
    ): PurchaseReservedInstanceOfferingRequest = {
      val __obj = js.Dynamic.literal(
        "ReservationName" -> ReservationName.asInstanceOf[js.Any],
        "ReservedInstanceOfferingId" -> ReservedInstanceOfferingId.asInstanceOf[js.Any]
      )

      InstanceCount.foreach(__v => __obj.updateDynamic("InstanceCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PurchaseReservedInstanceOfferingRequest]
    }
  }

  /** Represents the output of a <code>PurchaseReservedInstanceOffering</code> operation.
    */
  @js.native
  trait PurchaseReservedInstanceOfferingResponse extends js.Object {
    var ReservationName: js.UndefOr[ReservationToken]
    var ReservedInstanceId: js.UndefOr[GUID]
  }

  object PurchaseReservedInstanceOfferingResponse {
    @inline
    def apply(
        ReservationName: js.UndefOr[ReservationToken] = js.undefined,
        ReservedInstanceId: js.UndefOr[GUID] = js.undefined
    ): PurchaseReservedInstanceOfferingResponse = {
      val __obj = js.Dynamic.literal()
      ReservationName.foreach(__v => __obj.updateDynamic("ReservationName")(__v.asInstanceOf[js.Any]))
      ReservedInstanceId.foreach(__v => __obj.updateDynamic("ReservedInstanceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PurchaseReservedInstanceOfferingResponse]
    }
  }

  /** Contains the specific price and frequency of a recurring charges for an OpenSearch Reserved Instance, or for a Reserved Instance offering.
    */
  @js.native
  trait RecurringCharge extends js.Object {
    var RecurringChargeAmount: js.UndefOr[Double]
    var RecurringChargeFrequency: js.UndefOr[String]
  }

  object RecurringCharge {
    @inline
    def apply(
        RecurringChargeAmount: js.UndefOr[Double] = js.undefined,
        RecurringChargeFrequency: js.UndefOr[String] = js.undefined
    ): RecurringCharge = {
      val __obj = js.Dynamic.literal()
      RecurringChargeAmount.foreach(__v => __obj.updateDynamic("RecurringChargeAmount")(__v.asInstanceOf[js.Any]))
      RecurringChargeFrequency.foreach(__v => __obj.updateDynamic("RecurringChargeFrequency")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecurringCharge]
    }
  }

  /** Container for the request parameters to the <code>RejectInboundConnection</code> operation.
    */
  @js.native
  trait RejectInboundConnectionRequest extends js.Object {
    var ConnectionId: ConnectionId
  }

  object RejectInboundConnectionRequest {
    @inline
    def apply(
        ConnectionId: ConnectionId
    ): RejectInboundConnectionRequest = {
      val __obj = js.Dynamic.literal(
        "ConnectionId" -> ConnectionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RejectInboundConnectionRequest]
    }
  }

  /** Represents the output of a <code>RejectInboundConnection</code> operation.
    */
  @js.native
  trait RejectInboundConnectionResponse extends js.Object {
    var Connection: js.UndefOr[InboundConnection]
  }

  object RejectInboundConnectionResponse {
    @inline
    def apply(
        Connection: js.UndefOr[InboundConnection] = js.undefined
    ): RejectInboundConnectionResponse = {
      val __obj = js.Dynamic.literal()
      Connection.foreach(__v => __obj.updateDynamic("Connection")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RejectInboundConnectionResponse]
    }
  }

  /** Container for the request parameters to the <code>RemoveTags</code> operation.
    */
  @js.native
  trait RemoveTagsRequest extends js.Object {
    var ARN: ARN
    var TagKeys: StringList
  }

  object RemoveTagsRequest {
    @inline
    def apply(
        ARN: ARN,
        TagKeys: StringList
    ): RemoveTagsRequest = {
      val __obj = js.Dynamic.literal(
        "ARN" -> ARN.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RemoveTagsRequest]
    }
  }

  /** Details of an OpenSearch Reserved Instance.
    */
  @js.native
  trait ReservedInstance extends js.Object {
    var BillingSubscriptionId: js.UndefOr[Double]
    var CurrencyCode: js.UndefOr[String]
    var Duration: js.UndefOr[Int]
    var FixedPrice: js.UndefOr[Double]
    var InstanceCount: js.UndefOr[Int]
    var InstanceType: js.UndefOr[OpenSearchPartitionInstanceType]
    var PaymentOption: js.UndefOr[ReservedInstancePaymentOption]
    var RecurringCharges: js.UndefOr[RecurringChargeList]
    var ReservationName: js.UndefOr[ReservationToken]
    var ReservedInstanceId: js.UndefOr[GUID]
    var ReservedInstanceOfferingId: js.UndefOr[String]
    var StartTime: js.UndefOr[UpdateTimestamp]
    var State: js.UndefOr[String]
    var UsagePrice: js.UndefOr[Double]
  }

  object ReservedInstance {
    @inline
    def apply(
        BillingSubscriptionId: js.UndefOr[Double] = js.undefined,
        CurrencyCode: js.UndefOr[String] = js.undefined,
        Duration: js.UndefOr[Int] = js.undefined,
        FixedPrice: js.UndefOr[Double] = js.undefined,
        InstanceCount: js.UndefOr[Int] = js.undefined,
        InstanceType: js.UndefOr[OpenSearchPartitionInstanceType] = js.undefined,
        PaymentOption: js.UndefOr[ReservedInstancePaymentOption] = js.undefined,
        RecurringCharges: js.UndefOr[RecurringChargeList] = js.undefined,
        ReservationName: js.UndefOr[ReservationToken] = js.undefined,
        ReservedInstanceId: js.UndefOr[GUID] = js.undefined,
        ReservedInstanceOfferingId: js.UndefOr[String] = js.undefined,
        StartTime: js.UndefOr[UpdateTimestamp] = js.undefined,
        State: js.UndefOr[String] = js.undefined,
        UsagePrice: js.UndefOr[Double] = js.undefined
    ): ReservedInstance = {
      val __obj = js.Dynamic.literal()
      BillingSubscriptionId.foreach(__v => __obj.updateDynamic("BillingSubscriptionId")(__v.asInstanceOf[js.Any]))
      CurrencyCode.foreach(__v => __obj.updateDynamic("CurrencyCode")(__v.asInstanceOf[js.Any]))
      Duration.foreach(__v => __obj.updateDynamic("Duration")(__v.asInstanceOf[js.Any]))
      FixedPrice.foreach(__v => __obj.updateDynamic("FixedPrice")(__v.asInstanceOf[js.Any]))
      InstanceCount.foreach(__v => __obj.updateDynamic("InstanceCount")(__v.asInstanceOf[js.Any]))
      InstanceType.foreach(__v => __obj.updateDynamic("InstanceType")(__v.asInstanceOf[js.Any]))
      PaymentOption.foreach(__v => __obj.updateDynamic("PaymentOption")(__v.asInstanceOf[js.Any]))
      RecurringCharges.foreach(__v => __obj.updateDynamic("RecurringCharges")(__v.asInstanceOf[js.Any]))
      ReservationName.foreach(__v => __obj.updateDynamic("ReservationName")(__v.asInstanceOf[js.Any]))
      ReservedInstanceId.foreach(__v => __obj.updateDynamic("ReservedInstanceId")(__v.asInstanceOf[js.Any]))
      ReservedInstanceOfferingId.foreach(__v => __obj.updateDynamic("ReservedInstanceOfferingId")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      UsagePrice.foreach(__v => __obj.updateDynamic("UsagePrice")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReservedInstance]
    }
  }

  /** Details of an OpenSearch Reserved Instance offering.
    */
  @js.native
  trait ReservedInstanceOffering extends js.Object {
    var CurrencyCode: js.UndefOr[String]
    var Duration: js.UndefOr[Int]
    var FixedPrice: js.UndefOr[Double]
    var InstanceType: js.UndefOr[OpenSearchPartitionInstanceType]
    var PaymentOption: js.UndefOr[ReservedInstancePaymentOption]
    var RecurringCharges: js.UndefOr[RecurringChargeList]
    var ReservedInstanceOfferingId: js.UndefOr[GUID]
    var UsagePrice: js.UndefOr[Double]
  }

  object ReservedInstanceOffering {
    @inline
    def apply(
        CurrencyCode: js.UndefOr[String] = js.undefined,
        Duration: js.UndefOr[Int] = js.undefined,
        FixedPrice: js.UndefOr[Double] = js.undefined,
        InstanceType: js.UndefOr[OpenSearchPartitionInstanceType] = js.undefined,
        PaymentOption: js.UndefOr[ReservedInstancePaymentOption] = js.undefined,
        RecurringCharges: js.UndefOr[RecurringChargeList] = js.undefined,
        ReservedInstanceOfferingId: js.UndefOr[GUID] = js.undefined,
        UsagePrice: js.UndefOr[Double] = js.undefined
    ): ReservedInstanceOffering = {
      val __obj = js.Dynamic.literal()
      CurrencyCode.foreach(__v => __obj.updateDynamic("CurrencyCode")(__v.asInstanceOf[js.Any]))
      Duration.foreach(__v => __obj.updateDynamic("Duration")(__v.asInstanceOf[js.Any]))
      FixedPrice.foreach(__v => __obj.updateDynamic("FixedPrice")(__v.asInstanceOf[js.Any]))
      InstanceType.foreach(__v => __obj.updateDynamic("InstanceType")(__v.asInstanceOf[js.Any]))
      PaymentOption.foreach(__v => __obj.updateDynamic("PaymentOption")(__v.asInstanceOf[js.Any]))
      RecurringCharges.foreach(__v => __obj.updateDynamic("RecurringCharges")(__v.asInstanceOf[js.Any]))
      ReservedInstanceOfferingId.foreach(__v => __obj.updateDynamic("ReservedInstanceOfferingId")(__v.asInstanceOf[js.Any]))
      UsagePrice.foreach(__v => __obj.updateDynamic("UsagePrice")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReservedInstanceOffering]
    }
  }

  @js.native
  trait RevokeVpcEndpointAccessRequest extends js.Object {
    var Account: AWSAccount
    var DomainName: DomainName
  }

  object RevokeVpcEndpointAccessRequest {
    @inline
    def apply(
        Account: AWSAccount,
        DomainName: DomainName
    ): RevokeVpcEndpointAccessRequest = {
      val __obj = js.Dynamic.literal(
        "Account" -> Account.asInstanceOf[js.Any],
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RevokeVpcEndpointAccessRequest]
    }
  }

  @js.native
  trait RevokeVpcEndpointAccessResponse extends js.Object

  object RevokeVpcEndpointAccessResponse {
    @inline
    def apply(): RevokeVpcEndpointAccessResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RevokeVpcEndpointAccessResponse]
    }
  }

  /** The SAML identity povider information.
    */
  @js.native
  trait SAMLIdp extends js.Object {
    var EntityId: SAMLEntityId
    var MetadataContent: SAMLMetadata
  }

  object SAMLIdp {
    @inline
    def apply(
        EntityId: SAMLEntityId,
        MetadataContent: SAMLMetadata
    ): SAMLIdp = {
      val __obj = js.Dynamic.literal(
        "EntityId" -> EntityId.asInstanceOf[js.Any],
        "MetadataContent" -> MetadataContent.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SAMLIdp]
    }
  }

  /** The SAML authentication configuration for an Amazon OpenSearch Service domain.
    */
  @js.native
  trait SAMLOptionsInput extends js.Object {
    var Enabled: js.UndefOr[Boolean]
    var Idp: js.UndefOr[SAMLIdp]
    var MasterBackendRole: js.UndefOr[BackendRole]
    var MasterUserName: js.UndefOr[Username]
    var RolesKey: js.UndefOr[String]
    var SessionTimeoutMinutes: js.UndefOr[IntegerClass]
    var SubjectKey: js.UndefOr[String]
  }

  object SAMLOptionsInput {
    @inline
    def apply(
        Enabled: js.UndefOr[Boolean] = js.undefined,
        Idp: js.UndefOr[SAMLIdp] = js.undefined,
        MasterBackendRole: js.UndefOr[BackendRole] = js.undefined,
        MasterUserName: js.UndefOr[Username] = js.undefined,
        RolesKey: js.UndefOr[String] = js.undefined,
        SessionTimeoutMinutes: js.UndefOr[IntegerClass] = js.undefined,
        SubjectKey: js.UndefOr[String] = js.undefined
    ): SAMLOptionsInput = {
      val __obj = js.Dynamic.literal()
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      Idp.foreach(__v => __obj.updateDynamic("Idp")(__v.asInstanceOf[js.Any]))
      MasterBackendRole.foreach(__v => __obj.updateDynamic("MasterBackendRole")(__v.asInstanceOf[js.Any]))
      MasterUserName.foreach(__v => __obj.updateDynamic("MasterUserName")(__v.asInstanceOf[js.Any]))
      RolesKey.foreach(__v => __obj.updateDynamic("RolesKey")(__v.asInstanceOf[js.Any]))
      SessionTimeoutMinutes.foreach(__v => __obj.updateDynamic("SessionTimeoutMinutes")(__v.asInstanceOf[js.Any]))
      SubjectKey.foreach(__v => __obj.updateDynamic("SubjectKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SAMLOptionsInput]
    }
  }

  /** Describes the SAML application configured for the domain.
    */
  @js.native
  trait SAMLOptionsOutput extends js.Object {
    var Enabled: js.UndefOr[Boolean]
    var Idp: js.UndefOr[SAMLIdp]
    var RolesKey: js.UndefOr[String]
    var SessionTimeoutMinutes: js.UndefOr[IntegerClass]
    var SubjectKey: js.UndefOr[String]
  }

  object SAMLOptionsOutput {
    @inline
    def apply(
        Enabled: js.UndefOr[Boolean] = js.undefined,
        Idp: js.UndefOr[SAMLIdp] = js.undefined,
        RolesKey: js.UndefOr[String] = js.undefined,
        SessionTimeoutMinutes: js.UndefOr[IntegerClass] = js.undefined,
        SubjectKey: js.UndefOr[String] = js.undefined
    ): SAMLOptionsOutput = {
      val __obj = js.Dynamic.literal()
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      Idp.foreach(__v => __obj.updateDynamic("Idp")(__v.asInstanceOf[js.Any]))
      RolesKey.foreach(__v => __obj.updateDynamic("RolesKey")(__v.asInstanceOf[js.Any]))
      SessionTimeoutMinutes.foreach(__v => __obj.updateDynamic("SessionTimeoutMinutes")(__v.asInstanceOf[js.Any]))
      SubjectKey.foreach(__v => __obj.updateDynamic("SubjectKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SAMLOptionsOutput]
    }
  }

  /** Specifies details about a scheduled Auto-Tune action. For more information, see [[https://docs.aws.amazon.com/opensearch-service/latest/developerguide/auto-tune.html|Auto-Tune for Amazon OpenSearch Service]].
    */
  @js.native
  trait ScheduledAutoTuneDetails extends js.Object {
    var Action: js.UndefOr[ScheduledAutoTuneDescription]
    var ActionType: js.UndefOr[ScheduledAutoTuneActionType]
    var Date: js.UndefOr[AutoTuneDate]
    var Severity: js.UndefOr[ScheduledAutoTuneSeverityType]
  }

  object ScheduledAutoTuneDetails {
    @inline
    def apply(
        Action: js.UndefOr[ScheduledAutoTuneDescription] = js.undefined,
        ActionType: js.UndefOr[ScheduledAutoTuneActionType] = js.undefined,
        Date: js.UndefOr[AutoTuneDate] = js.undefined,
        Severity: js.UndefOr[ScheduledAutoTuneSeverityType] = js.undefined
    ): ScheduledAutoTuneDetails = {
      val __obj = js.Dynamic.literal()
      Action.foreach(__v => __obj.updateDynamic("Action")(__v.asInstanceOf[js.Any]))
      ActionType.foreach(__v => __obj.updateDynamic("ActionType")(__v.asInstanceOf[js.Any]))
      Date.foreach(__v => __obj.updateDynamic("Date")(__v.asInstanceOf[js.Any]))
      Severity.foreach(__v => __obj.updateDynamic("Severity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScheduledAutoTuneDetails]
    }
  }

  /** The current status of the service software for an Amazon OpenSearch Service domain. For more information, see [[https://docs.aws.amazon.com/opensearch-service/latest/developerguide/service-software.html|Service software updates in Amazon OpenSearch Service]].
    */
  @js.native
  trait ServiceSoftwareOptions extends js.Object {
    var AutomatedUpdateDate: js.UndefOr[DeploymentCloseDateTimeStamp]
    var Cancellable: js.UndefOr[Boolean]
    var CurrentVersion: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var NewVersion: js.UndefOr[String]
    var OptionalDeployment: js.UndefOr[Boolean]
    var UpdateAvailable: js.UndefOr[Boolean]
    var UpdateStatus: js.UndefOr[DeploymentStatus]
  }

  object ServiceSoftwareOptions {
    @inline
    def apply(
        AutomatedUpdateDate: js.UndefOr[DeploymentCloseDateTimeStamp] = js.undefined,
        Cancellable: js.UndefOr[Boolean] = js.undefined,
        CurrentVersion: js.UndefOr[String] = js.undefined,
        Description: js.UndefOr[String] = js.undefined,
        NewVersion: js.UndefOr[String] = js.undefined,
        OptionalDeployment: js.UndefOr[Boolean] = js.undefined,
        UpdateAvailable: js.UndefOr[Boolean] = js.undefined,
        UpdateStatus: js.UndefOr[DeploymentStatus] = js.undefined
    ): ServiceSoftwareOptions = {
      val __obj = js.Dynamic.literal()
      AutomatedUpdateDate.foreach(__v => __obj.updateDynamic("AutomatedUpdateDate")(__v.asInstanceOf[js.Any]))
      Cancellable.foreach(__v => __obj.updateDynamic("Cancellable")(__v.asInstanceOf[js.Any]))
      CurrentVersion.foreach(__v => __obj.updateDynamic("CurrentVersion")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      NewVersion.foreach(__v => __obj.updateDynamic("NewVersion")(__v.asInstanceOf[js.Any]))
      OptionalDeployment.foreach(__v => __obj.updateDynamic("OptionalDeployment")(__v.asInstanceOf[js.Any]))
      UpdateAvailable.foreach(__v => __obj.updateDynamic("UpdateAvailable")(__v.asInstanceOf[js.Any]))
      UpdateStatus.foreach(__v => __obj.updateDynamic("UpdateStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServiceSoftwareOptions]
    }
  }

  /** The time, in UTC format, when OpenSearch Service takes a daily automated snapshot of the specified domain. Default is <code>0</code> hours.
    */
  @js.native
  trait SnapshotOptions extends js.Object {
    var AutomatedSnapshotStartHour: js.UndefOr[IntegerClass]
  }

  object SnapshotOptions {
    @inline
    def apply(
        AutomatedSnapshotStartHour: js.UndefOr[IntegerClass] = js.undefined
    ): SnapshotOptions = {
      val __obj = js.Dynamic.literal()
      AutomatedSnapshotStartHour.foreach(__v => __obj.updateDynamic("AutomatedSnapshotStartHour")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SnapshotOptions]
    }
  }

  /** Container for information about a daily automated snapshot for an OpenSearch Service domain.
    */
  @js.native
  trait SnapshotOptionsStatus extends js.Object {
    var Options: SnapshotOptions
    var Status: OptionStatus
  }

  object SnapshotOptionsStatus {
    @inline
    def apply(
        Options: SnapshotOptions,
        Status: OptionStatus
    ): SnapshotOptionsStatus = {
      val __obj = js.Dynamic.literal(
        "Options" -> Options.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SnapshotOptionsStatus]
    }
  }

  /** Container for the request parameters to the <code>StartServiceSoftwareUpdate</code> operation.
    */
  @js.native
  trait StartServiceSoftwareUpdateRequest extends js.Object {
    var DomainName: DomainName
  }

  object StartServiceSoftwareUpdateRequest {
    @inline
    def apply(
        DomainName: DomainName
    ): StartServiceSoftwareUpdateRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartServiceSoftwareUpdateRequest]
    }
  }

  /** Represents the output of a <code>StartServiceSoftwareUpdate</code> operation. Contains the status of the update.
    */
  @js.native
  trait StartServiceSoftwareUpdateResponse extends js.Object {
    var ServiceSoftwareOptions: js.UndefOr[ServiceSoftwareOptions]
  }

  object StartServiceSoftwareUpdateResponse {
    @inline
    def apply(
        ServiceSoftwareOptions: js.UndefOr[ServiceSoftwareOptions] = js.undefined
    ): StartServiceSoftwareUpdateResponse = {
      val __obj = js.Dynamic.literal()
      ServiceSoftwareOptions.foreach(__v => __obj.updateDynamic("ServiceSoftwareOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartServiceSoftwareUpdateResponse]
    }
  }

  /** A list of storage types for an Amazon OpenSearch Service domain that are available for a given intance type.
    */
  @js.native
  trait StorageType extends js.Object {
    var StorageSubTypeName: js.UndefOr[StorageSubTypeName]
    var StorageTypeLimits: js.UndefOr[StorageTypeLimitList]
    var StorageTypeName: js.UndefOr[StorageTypeName]
  }

  object StorageType {
    @inline
    def apply(
        StorageSubTypeName: js.UndefOr[StorageSubTypeName] = js.undefined,
        StorageTypeLimits: js.UndefOr[StorageTypeLimitList] = js.undefined,
        StorageTypeName: js.UndefOr[StorageTypeName] = js.undefined
    ): StorageType = {
      val __obj = js.Dynamic.literal()
      StorageSubTypeName.foreach(__v => __obj.updateDynamic("StorageSubTypeName")(__v.asInstanceOf[js.Any]))
      StorageTypeLimits.foreach(__v => __obj.updateDynamic("StorageTypeLimits")(__v.asInstanceOf[js.Any]))
      StorageTypeName.foreach(__v => __obj.updateDynamic("StorageTypeName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StorageType]
    }
  }

  /** Limits that are applicable for the given Amazon OpenSearch Service storage type.
    */
  @js.native
  trait StorageTypeLimit extends js.Object {
    var LimitName: js.UndefOr[LimitName]
    var LimitValues: js.UndefOr[LimitValueList]
  }

  object StorageTypeLimit {
    @inline
    def apply(
        LimitName: js.UndefOr[LimitName] = js.undefined,
        LimitValues: js.UndefOr[LimitValueList] = js.undefined
    ): StorageTypeLimit = {
      val __obj = js.Dynamic.literal()
      LimitName.foreach(__v => __obj.updateDynamic("LimitName")(__v.asInstanceOf[js.Any]))
      LimitValues.foreach(__v => __obj.updateDynamic("LimitValues")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StorageTypeLimit]
    }
  }

  /** A tag (key-value pair) for an Amazon OpenSearch Service resource.
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

  /** Container for the request parameters to the <code>UpdateDomain</code> operation.
    */
  @js.native
  trait UpdateDomainConfigRequest extends js.Object {
    var DomainName: DomainName
    var AccessPolicies: js.UndefOr[PolicyDocument]
    var AdvancedOptions: js.UndefOr[AdvancedOptions]
    var AdvancedSecurityOptions: js.UndefOr[AdvancedSecurityOptionsInput]
    var AutoTuneOptions: js.UndefOr[AutoTuneOptions]
    var ClusterConfig: js.UndefOr[ClusterConfig]
    var CognitoOptions: js.UndefOr[CognitoOptions]
    var DomainEndpointOptions: js.UndefOr[DomainEndpointOptions]
    var DryRun: js.UndefOr[DryRun]
    var EBSOptions: js.UndefOr[EBSOptions]
    var EncryptionAtRestOptions: js.UndefOr[EncryptionAtRestOptions]
    var LogPublishingOptions: js.UndefOr[LogPublishingOptions]
    var NodeToNodeEncryptionOptions: js.UndefOr[NodeToNodeEncryptionOptions]
    var SnapshotOptions: js.UndefOr[SnapshotOptions]
    var VPCOptions: js.UndefOr[VPCOptions]
  }

  object UpdateDomainConfigRequest {
    @inline
    def apply(
        DomainName: DomainName,
        AccessPolicies: js.UndefOr[PolicyDocument] = js.undefined,
        AdvancedOptions: js.UndefOr[AdvancedOptions] = js.undefined,
        AdvancedSecurityOptions: js.UndefOr[AdvancedSecurityOptionsInput] = js.undefined,
        AutoTuneOptions: js.UndefOr[AutoTuneOptions] = js.undefined,
        ClusterConfig: js.UndefOr[ClusterConfig] = js.undefined,
        CognitoOptions: js.UndefOr[CognitoOptions] = js.undefined,
        DomainEndpointOptions: js.UndefOr[DomainEndpointOptions] = js.undefined,
        DryRun: js.UndefOr[DryRun] = js.undefined,
        EBSOptions: js.UndefOr[EBSOptions] = js.undefined,
        EncryptionAtRestOptions: js.UndefOr[EncryptionAtRestOptions] = js.undefined,
        LogPublishingOptions: js.UndefOr[LogPublishingOptions] = js.undefined,
        NodeToNodeEncryptionOptions: js.UndefOr[NodeToNodeEncryptionOptions] = js.undefined,
        SnapshotOptions: js.UndefOr[SnapshotOptions] = js.undefined,
        VPCOptions: js.UndefOr[VPCOptions] = js.undefined
    ): UpdateDomainConfigRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      AccessPolicies.foreach(__v => __obj.updateDynamic("AccessPolicies")(__v.asInstanceOf[js.Any]))
      AdvancedOptions.foreach(__v => __obj.updateDynamic("AdvancedOptions")(__v.asInstanceOf[js.Any]))
      AdvancedSecurityOptions.foreach(__v => __obj.updateDynamic("AdvancedSecurityOptions")(__v.asInstanceOf[js.Any]))
      AutoTuneOptions.foreach(__v => __obj.updateDynamic("AutoTuneOptions")(__v.asInstanceOf[js.Any]))
      ClusterConfig.foreach(__v => __obj.updateDynamic("ClusterConfig")(__v.asInstanceOf[js.Any]))
      CognitoOptions.foreach(__v => __obj.updateDynamic("CognitoOptions")(__v.asInstanceOf[js.Any]))
      DomainEndpointOptions.foreach(__v => __obj.updateDynamic("DomainEndpointOptions")(__v.asInstanceOf[js.Any]))
      DryRun.foreach(__v => __obj.updateDynamic("DryRun")(__v.asInstanceOf[js.Any]))
      EBSOptions.foreach(__v => __obj.updateDynamic("EBSOptions")(__v.asInstanceOf[js.Any]))
      EncryptionAtRestOptions.foreach(__v => __obj.updateDynamic("EncryptionAtRestOptions")(__v.asInstanceOf[js.Any]))
      LogPublishingOptions.foreach(__v => __obj.updateDynamic("LogPublishingOptions")(__v.asInstanceOf[js.Any]))
      NodeToNodeEncryptionOptions.foreach(__v => __obj.updateDynamic("NodeToNodeEncryptionOptions")(__v.asInstanceOf[js.Any]))
      SnapshotOptions.foreach(__v => __obj.updateDynamic("SnapshotOptions")(__v.asInstanceOf[js.Any]))
      VPCOptions.foreach(__v => __obj.updateDynamic("VPCOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDomainConfigRequest]
    }
  }

  /** The results of an <code>UpdateDomain</code> request. Contains the status of the domain being updated.
    */
  @js.native
  trait UpdateDomainConfigResponse extends js.Object {
    var DomainConfig: DomainConfig
    var DryRunResults: js.UndefOr[DryRunResults]
  }

  object UpdateDomainConfigResponse {
    @inline
    def apply(
        DomainConfig: DomainConfig,
        DryRunResults: js.UndefOr[DryRunResults] = js.undefined
    ): UpdateDomainConfigResponse = {
      val __obj = js.Dynamic.literal(
        "DomainConfig" -> DomainConfig.asInstanceOf[js.Any]
      )

      DryRunResults.foreach(__v => __obj.updateDynamic("DryRunResults")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDomainConfigResponse]
    }
  }

  /** Container for request parameters to the <code>UpdatePackage</code> operation.
    */
  @js.native
  trait UpdatePackageRequest extends js.Object {
    var PackageID: PackageID
    var PackageSource: PackageSource
    var CommitMessage: js.UndefOr[CommitMessage]
    var PackageDescription: js.UndefOr[PackageDescription]
  }

  object UpdatePackageRequest {
    @inline
    def apply(
        PackageID: PackageID,
        PackageSource: PackageSource,
        CommitMessage: js.UndefOr[CommitMessage] = js.undefined,
        PackageDescription: js.UndefOr[PackageDescription] = js.undefined
    ): UpdatePackageRequest = {
      val __obj = js.Dynamic.literal(
        "PackageID" -> PackageID.asInstanceOf[js.Any],
        "PackageSource" -> PackageSource.asInstanceOf[js.Any]
      )

      CommitMessage.foreach(__v => __obj.updateDynamic("CommitMessage")(__v.asInstanceOf[js.Any]))
      PackageDescription.foreach(__v => __obj.updateDynamic("PackageDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePackageRequest]
    }
  }

  /** Container for the response returned by the <code>UpdatePackage</code> operation.
    */
  @js.native
  trait UpdatePackageResponse extends js.Object {
    var PackageDetails: js.UndefOr[PackageDetails]
  }

  object UpdatePackageResponse {
    @inline
    def apply(
        PackageDetails: js.UndefOr[PackageDetails] = js.undefined
    ): UpdatePackageResponse = {
      val __obj = js.Dynamic.literal()
      PackageDetails.foreach(__v => __obj.updateDynamic("PackageDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePackageResponse]
    }
  }

  @js.native
  trait UpdateVpcEndpointRequest extends js.Object {
    var VpcEndpointId: VpcEndpointId
    var VpcOptions: VPCOptions
  }

  object UpdateVpcEndpointRequest {
    @inline
    def apply(
        VpcEndpointId: VpcEndpointId,
        VpcOptions: VPCOptions
    ): UpdateVpcEndpointRequest = {
      val __obj = js.Dynamic.literal(
        "VpcEndpointId" -> VpcEndpointId.asInstanceOf[js.Any],
        "VpcOptions" -> VpcOptions.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateVpcEndpointRequest]
    }
  }

  @js.native
  trait UpdateVpcEndpointResponse extends js.Object {
    var VpcEndpoint: VpcEndpoint
  }

  object UpdateVpcEndpointResponse {
    @inline
    def apply(
        VpcEndpoint: VpcEndpoint
    ): UpdateVpcEndpointResponse = {
      val __obj = js.Dynamic.literal(
        "VpcEndpoint" -> VpcEndpoint.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateVpcEndpointResponse]
    }
  }

  /** Container for the request parameters to the <code>UpgradeDomain</code> operation.
    */
  @js.native
  trait UpgradeDomainRequest extends js.Object {
    var DomainName: DomainName
    var TargetVersion: VersionString
    var AdvancedOptions: js.UndefOr[AdvancedOptions]
    var PerformCheckOnly: js.UndefOr[Boolean]
  }

  object UpgradeDomainRequest {
    @inline
    def apply(
        DomainName: DomainName,
        TargetVersion: VersionString,
        AdvancedOptions: js.UndefOr[AdvancedOptions] = js.undefined,
        PerformCheckOnly: js.UndefOr[Boolean] = js.undefined
    ): UpgradeDomainRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "TargetVersion" -> TargetVersion.asInstanceOf[js.Any]
      )

      AdvancedOptions.foreach(__v => __obj.updateDynamic("AdvancedOptions")(__v.asInstanceOf[js.Any]))
      PerformCheckOnly.foreach(__v => __obj.updateDynamic("PerformCheckOnly")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpgradeDomainRequest]
    }
  }

  /** Container for the response returned by <code>UpgradeDomain</code> operation.
    */
  @js.native
  trait UpgradeDomainResponse extends js.Object {
    var AdvancedOptions: js.UndefOr[AdvancedOptions]
    var ChangeProgressDetails: js.UndefOr[ChangeProgressDetails]
    var DomainName: js.UndefOr[DomainName]
    var PerformCheckOnly: js.UndefOr[Boolean]
    var TargetVersion: js.UndefOr[VersionString]
    var UpgradeId: js.UndefOr[String]
  }

  object UpgradeDomainResponse {
    @inline
    def apply(
        AdvancedOptions: js.UndefOr[AdvancedOptions] = js.undefined,
        ChangeProgressDetails: js.UndefOr[ChangeProgressDetails] = js.undefined,
        DomainName: js.UndefOr[DomainName] = js.undefined,
        PerformCheckOnly: js.UndefOr[Boolean] = js.undefined,
        TargetVersion: js.UndefOr[VersionString] = js.undefined,
        UpgradeId: js.UndefOr[String] = js.undefined
    ): UpgradeDomainResponse = {
      val __obj = js.Dynamic.literal()
      AdvancedOptions.foreach(__v => __obj.updateDynamic("AdvancedOptions")(__v.asInstanceOf[js.Any]))
      ChangeProgressDetails.foreach(__v => __obj.updateDynamic("ChangeProgressDetails")(__v.asInstanceOf[js.Any]))
      DomainName.foreach(__v => __obj.updateDynamic("DomainName")(__v.asInstanceOf[js.Any]))
      PerformCheckOnly.foreach(__v => __obj.updateDynamic("PerformCheckOnly")(__v.asInstanceOf[js.Any]))
      TargetVersion.foreach(__v => __obj.updateDynamic("TargetVersion")(__v.asInstanceOf[js.Any]))
      UpgradeId.foreach(__v => __obj.updateDynamic("UpgradeId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpgradeDomainResponse]
    }
  }

  /** History of the last 10 upgrades and upgrade eligibility checks for an Amazon OpenSearch Service domain.
    */
  @js.native
  trait UpgradeHistory extends js.Object {
    var StartTimestamp: js.UndefOr[StartTimestamp]
    var StepsList: js.UndefOr[UpgradeStepsList]
    var UpgradeName: js.UndefOr[UpgradeName]
    var UpgradeStatus: js.UndefOr[UpgradeStatus]
  }

  object UpgradeHistory {
    @inline
    def apply(
        StartTimestamp: js.UndefOr[StartTimestamp] = js.undefined,
        StepsList: js.UndefOr[UpgradeStepsList] = js.undefined,
        UpgradeName: js.UndefOr[UpgradeName] = js.undefined,
        UpgradeStatus: js.UndefOr[UpgradeStatus] = js.undefined
    ): UpgradeHistory = {
      val __obj = js.Dynamic.literal()
      StartTimestamp.foreach(__v => __obj.updateDynamic("StartTimestamp")(__v.asInstanceOf[js.Any]))
      StepsList.foreach(__v => __obj.updateDynamic("StepsList")(__v.asInstanceOf[js.Any]))
      UpgradeName.foreach(__v => __obj.updateDynamic("UpgradeName")(__v.asInstanceOf[js.Any]))
      UpgradeStatus.foreach(__v => __obj.updateDynamic("UpgradeStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpgradeHistory]
    }
  }

  /** Represents a single step of an upgrade or upgrade eligibility check workflow.
    */
  @js.native
  trait UpgradeStepItem extends js.Object {
    var Issues: js.UndefOr[Issues]
    var ProgressPercent: js.UndefOr[Double]
    var UpgradeStep: js.UndefOr[UpgradeStep]
    var UpgradeStepStatus: js.UndefOr[UpgradeStatus]
  }

  object UpgradeStepItem {
    @inline
    def apply(
        Issues: js.UndefOr[Issues] = js.undefined,
        ProgressPercent: js.UndefOr[Double] = js.undefined,
        UpgradeStep: js.UndefOr[UpgradeStep] = js.undefined,
        UpgradeStepStatus: js.UndefOr[UpgradeStatus] = js.undefined
    ): UpgradeStepItem = {
      val __obj = js.Dynamic.literal()
      Issues.foreach(__v => __obj.updateDynamic("Issues")(__v.asInstanceOf[js.Any]))
      ProgressPercent.foreach(__v => __obj.updateDynamic("ProgressPercent")(__v.asInstanceOf[js.Any]))
      UpgradeStep.foreach(__v => __obj.updateDynamic("UpgradeStep")(__v.asInstanceOf[js.Any]))
      UpgradeStepStatus.foreach(__v => __obj.updateDynamic("UpgradeStepStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpgradeStepItem]
    }
  }

  /** Information about the subnets and security groups for an Amazon OpenSearch Service domain provisioned within a virtual private cloud (VPC). For more information, see [[https://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html|Launching your Amazon OpenSearch Service domains using a VPC]]. This information only exists if the domain was created with <code>VPCOptions</code>.
    */
  @js.native
  trait VPCDerivedInfo extends js.Object {
    var AvailabilityZones: js.UndefOr[StringList]
    var SecurityGroupIds: js.UndefOr[StringList]
    var SubnetIds: js.UndefOr[StringList]
    var VPCId: js.UndefOr[String]
  }

  object VPCDerivedInfo {
    @inline
    def apply(
        AvailabilityZones: js.UndefOr[StringList] = js.undefined,
        SecurityGroupIds: js.UndefOr[StringList] = js.undefined,
        SubnetIds: js.UndefOr[StringList] = js.undefined,
        VPCId: js.UndefOr[String] = js.undefined
    ): VPCDerivedInfo = {
      val __obj = js.Dynamic.literal()
      AvailabilityZones.foreach(__v => __obj.updateDynamic("AvailabilityZones")(__v.asInstanceOf[js.Any]))
      SecurityGroupIds.foreach(__v => __obj.updateDynamic("SecurityGroupIds")(__v.asInstanceOf[js.Any]))
      SubnetIds.foreach(__v => __obj.updateDynamic("SubnetIds")(__v.asInstanceOf[js.Any]))
      VPCId.foreach(__v => __obj.updateDynamic("VPCId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VPCDerivedInfo]
    }
  }

  /** Status of the VPC options for a specified domain.
    */
  @js.native
  trait VPCDerivedInfoStatus extends js.Object {
    var Options: VPCDerivedInfo
    var Status: OptionStatus
  }

  object VPCDerivedInfoStatus {
    @inline
    def apply(
        Options: VPCDerivedInfo,
        Status: OptionStatus
    ): VPCDerivedInfoStatus = {
      val __obj = js.Dynamic.literal(
        "Options" -> Options.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[VPCDerivedInfoStatus]
    }
  }

  /** Options to specify the subnets and security groups for an Amazon OpenSearch Service VPC endpoint. For more information, see [[https://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html|Launching your Amazon OpenSearch Service domains using a VPC]].
    */
  @js.native
  trait VPCOptions extends js.Object {
    var SecurityGroupIds: js.UndefOr[StringList]
    var SubnetIds: js.UndefOr[StringList]
  }

  object VPCOptions {
    @inline
    def apply(
        SecurityGroupIds: js.UndefOr[StringList] = js.undefined,
        SubnetIds: js.UndefOr[StringList] = js.undefined
    ): VPCOptions = {
      val __obj = js.Dynamic.literal()
      SecurityGroupIds.foreach(__v => __obj.updateDynamic("SecurityGroupIds")(__v.asInstanceOf[js.Any]))
      SubnetIds.foreach(__v => __obj.updateDynamic("SubnetIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VPCOptions]
    }
  }

  /** The status of the the OpenSearch or Elasticsearch version options for the specified Amazon OpenSearch Service domain.
    */
  @js.native
  trait VersionStatus extends js.Object {
    var Options: VersionString
    var Status: OptionStatus
  }

  object VersionStatus {
    @inline
    def apply(
        Options: VersionString,
        Status: OptionStatus
    ): VersionStatus = {
      val __obj = js.Dynamic.literal(
        "Options" -> Options.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[VersionStatus]
    }
  }

  /** The connection endpoint for connecting to an Amazon OpenSearch Service domain through a proxy.
    */
  @js.native
  trait VpcEndpoint extends js.Object {
    var DomainArn: js.UndefOr[DomainArn]
    var Endpoint: js.UndefOr[Endpoint]
    var Status: js.UndefOr[VpcEndpointStatus]
    var VpcEndpointId: js.UndefOr[VpcEndpointId]
    var VpcEndpointOwner: js.UndefOr[AWSAccount]
    var VpcOptions: js.UndefOr[VPCDerivedInfo]
  }

  object VpcEndpoint {
    @inline
    def apply(
        DomainArn: js.UndefOr[DomainArn] = js.undefined,
        Endpoint: js.UndefOr[Endpoint] = js.undefined,
        Status: js.UndefOr[VpcEndpointStatus] = js.undefined,
        VpcEndpointId: js.UndefOr[VpcEndpointId] = js.undefined,
        VpcEndpointOwner: js.UndefOr[AWSAccount] = js.undefined,
        VpcOptions: js.UndefOr[VPCDerivedInfo] = js.undefined
    ): VpcEndpoint = {
      val __obj = js.Dynamic.literal()
      DomainArn.foreach(__v => __obj.updateDynamic("DomainArn")(__v.asInstanceOf[js.Any]))
      Endpoint.foreach(__v => __obj.updateDynamic("Endpoint")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      VpcEndpointId.foreach(__v => __obj.updateDynamic("VpcEndpointId")(__v.asInstanceOf[js.Any]))
      VpcEndpointOwner.foreach(__v => __obj.updateDynamic("VpcEndpointOwner")(__v.asInstanceOf[js.Any]))
      VpcOptions.foreach(__v => __obj.updateDynamic("VpcOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VpcEndpoint]
    }
  }

  /** Error information when attempting to describe an Amazon OpenSearch Service-managed VPC endpoint.
    */
  @js.native
  trait VpcEndpointError extends js.Object {
    var ErrorCode: js.UndefOr[VpcEndpointErrorCode]
    var ErrorMessage: js.UndefOr[String]
    var VpcEndpointId: js.UndefOr[VpcEndpointId]
  }

  object VpcEndpointError {
    @inline
    def apply(
        ErrorCode: js.UndefOr[VpcEndpointErrorCode] = js.undefined,
        ErrorMessage: js.UndefOr[String] = js.undefined,
        VpcEndpointId: js.UndefOr[VpcEndpointId] = js.undefined
    ): VpcEndpointError = {
      val __obj = js.Dynamic.literal()
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      VpcEndpointId.foreach(__v => __obj.updateDynamic("VpcEndpointId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VpcEndpointError]
    }
  }

  /** Summary information for an Amazon OpenSearch Service-managed VPC endpoint.
    */
  @js.native
  trait VpcEndpointSummary extends js.Object {
    var DomainArn: js.UndefOr[DomainArn]
    var Status: js.UndefOr[VpcEndpointStatus]
    var VpcEndpointId: js.UndefOr[VpcEndpointId]
    var VpcEndpointOwner: js.UndefOr[String]
  }

  object VpcEndpointSummary {
    @inline
    def apply(
        DomainArn: js.UndefOr[DomainArn] = js.undefined,
        Status: js.UndefOr[VpcEndpointStatus] = js.undefined,
        VpcEndpointId: js.UndefOr[VpcEndpointId] = js.undefined,
        VpcEndpointOwner: js.UndefOr[String] = js.undefined
    ): VpcEndpointSummary = {
      val __obj = js.Dynamic.literal()
      DomainArn.foreach(__v => __obj.updateDynamic("DomainArn")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      VpcEndpointId.foreach(__v => __obj.updateDynamic("VpcEndpointId")(__v.asInstanceOf[js.Any]))
      VpcEndpointOwner.foreach(__v => __obj.updateDynamic("VpcEndpointOwner")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VpcEndpointSummary]
    }
  }

  /** The zone awareness configuration for an Amazon OpenSearch Service domain.
    */
  @js.native
  trait ZoneAwarenessConfig extends js.Object {
    var AvailabilityZoneCount: js.UndefOr[IntegerClass]
  }

  object ZoneAwarenessConfig {
    @inline
    def apply(
        AvailabilityZoneCount: js.UndefOr[IntegerClass] = js.undefined
    ): ZoneAwarenessConfig = {
      val __obj = js.Dynamic.literal()
      AvailabilityZoneCount.foreach(__v => __obj.updateDynamic("AvailabilityZoneCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ZoneAwarenessConfig]
    }
  }
}
