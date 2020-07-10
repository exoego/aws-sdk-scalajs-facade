package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object es {
  type ARN = String
  type AdditionalLimitList = js.Array[AdditionalLimit]
  type AdvancedOptions = js.Dictionary[String]
  type CloudWatchLogsLogGroupArn = String
  type CompatibleElasticsearchVersionsList = js.Array[CompatibleVersionsMap]
  type ConnectionAlias = String
  type CreatedAt = js.Date
  type CrossClusterSearchConnectionId = String
  type CrossClusterSearchConnectionStatusMessage = String
  type DeploymentCloseDateTimeStamp = js.Date
  type DescribePackagesFilterList = js.Array[DescribePackagesFilter]
  type DescribePackagesFilterValue = String
  type DescribePackagesFilterValues = js.Array[DescribePackagesFilterValue]
  type DomainId = String
  type DomainInfoList = js.Array[DomainInfo]
  type DomainName = String
  type DomainNameList = js.Array[DomainName]
  type DomainPackageDetailsList = js.Array[DomainPackageDetails]
  type ElasticsearchDomainStatusList = js.Array[ElasticsearchDomainStatus]
  type ElasticsearchInstanceTypeList = js.Array[ESPartitionInstanceType]
  type ElasticsearchVersionList = js.Array[ElasticsearchVersionString]
  type ElasticsearchVersionString = String
  type EndpointsMap = js.Dictionary[ServiceUrl]
  type ErrorMessage = String
  type ErrorType = String
  type FilterList = js.Array[Filter]
  type GUID = String
  type IdentityPoolId = String
  type InboundCrossClusterSearchConnections = js.Array[InboundCrossClusterSearchConnection]
  type InstanceCount = Int
  type InstanceRole = String
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
  type MinimumInstanceCount = Int
  type NextToken = String
  type NonEmptyString = String
  type OutboundCrossClusterSearchConnections = js.Array[OutboundCrossClusterSearchConnection]
  type OwnerId = String
  type PackageDescription = String
  type PackageDetailsList = js.Array[PackageDetails]
  type PackageID = String
  type PackageName = String
  type Password = String
  type PolicyDocument = String
  type RecurringChargeList = js.Array[RecurringCharge]
  type ReferencePath = String
  type Region = String
  type ReservationToken = String
  type ReservedElasticsearchInstanceList = js.Array[ReservedElasticsearchInstance]
  type ReservedElasticsearchInstanceOfferingList = js.Array[ReservedElasticsearchInstanceOffering]
  type RoleArn = String
  type S3BucketName = String
  type S3Key = String
  type ServiceUrl = String
  type StartTimestamp = js.Date
  type StorageSubTypeName = String
  type StorageTypeLimitList = js.Array[StorageTypeLimit]
  type StorageTypeList = js.Array[StorageType]
  type StorageTypeName = String
  type StringList = js.Array[String]
  type TagKey = String
  type TagList = js.Array[Tag]
  type TagValue = String
  type UIntValue = Int
  type UpdateTimestamp = js.Date
  type UpgradeHistoryList = js.Array[UpgradeHistory]
  type UpgradeName = String
  type UpgradeStepsList = js.Array[UpgradeStepItem]
  type UserPoolId = String
  type Username = String
  type ValueStringList = js.Array[NonEmptyString]

  implicit final class ESOps(private val service: ES) extends AnyVal {

    @inline def acceptInboundCrossClusterSearchConnectionFuture(
        params: AcceptInboundCrossClusterSearchConnectionRequest
    ): Future[AcceptInboundCrossClusterSearchConnectionResponse] =
      service.acceptInboundCrossClusterSearchConnection(params).promise().toFuture
    @inline def addTagsFuture(params: AddTagsRequest): Future[js.Object] = service.addTags(params).promise().toFuture
    @inline def associatePackageFuture(params: AssociatePackageRequest): Future[AssociatePackageResponse] =
      service.associatePackage(params).promise().toFuture
    @inline def cancelElasticsearchServiceSoftwareUpdateFuture(
        params: CancelElasticsearchServiceSoftwareUpdateRequest
    ): Future[CancelElasticsearchServiceSoftwareUpdateResponse] =
      service.cancelElasticsearchServiceSoftwareUpdate(params).promise().toFuture
    @inline def createElasticsearchDomainFuture(
        params: CreateElasticsearchDomainRequest
    ): Future[CreateElasticsearchDomainResponse] = service.createElasticsearchDomain(params).promise().toFuture
    @inline def createOutboundCrossClusterSearchConnectionFuture(
        params: CreateOutboundCrossClusterSearchConnectionRequest
    ): Future[CreateOutboundCrossClusterSearchConnectionResponse] =
      service.createOutboundCrossClusterSearchConnection(params).promise().toFuture
    @inline def createPackageFuture(params: CreatePackageRequest): Future[CreatePackageResponse] =
      service.createPackage(params).promise().toFuture
    @inline def deleteElasticsearchDomainFuture(
        params: DeleteElasticsearchDomainRequest
    ): Future[DeleteElasticsearchDomainResponse] = service.deleteElasticsearchDomain(params).promise().toFuture
    @inline def deleteElasticsearchServiceRoleFuture(): Future[js.Object] =
      service.deleteElasticsearchServiceRole().promise().toFuture
    @inline def deleteInboundCrossClusterSearchConnectionFuture(
        params: DeleteInboundCrossClusterSearchConnectionRequest
    ): Future[DeleteInboundCrossClusterSearchConnectionResponse] =
      service.deleteInboundCrossClusterSearchConnection(params).promise().toFuture
    @inline def deleteOutboundCrossClusterSearchConnectionFuture(
        params: DeleteOutboundCrossClusterSearchConnectionRequest
    ): Future[DeleteOutboundCrossClusterSearchConnectionResponse] =
      service.deleteOutboundCrossClusterSearchConnection(params).promise().toFuture
    @inline def deletePackageFuture(params: DeletePackageRequest): Future[DeletePackageResponse] =
      service.deletePackage(params).promise().toFuture
    @inline def describeElasticsearchDomainConfigFuture(
        params: DescribeElasticsearchDomainConfigRequest
    ): Future[DescribeElasticsearchDomainConfigResponse] =
      service.describeElasticsearchDomainConfig(params).promise().toFuture
    @inline def describeElasticsearchDomainFuture(
        params: DescribeElasticsearchDomainRequest
    ): Future[DescribeElasticsearchDomainResponse] = service.describeElasticsearchDomain(params).promise().toFuture
    @inline def describeElasticsearchDomainsFuture(
        params: DescribeElasticsearchDomainsRequest
    ): Future[DescribeElasticsearchDomainsResponse] = service.describeElasticsearchDomains(params).promise().toFuture
    @inline def describeElasticsearchInstanceTypeLimitsFuture(
        params: DescribeElasticsearchInstanceTypeLimitsRequest
    ): Future[DescribeElasticsearchInstanceTypeLimitsResponse] =
      service.describeElasticsearchInstanceTypeLimits(params).promise().toFuture
    @inline def describeInboundCrossClusterSearchConnectionsFuture(
        params: DescribeInboundCrossClusterSearchConnectionsRequest
    ): Future[DescribeInboundCrossClusterSearchConnectionsResponse] =
      service.describeInboundCrossClusterSearchConnections(params).promise().toFuture
    @inline def describeOutboundCrossClusterSearchConnectionsFuture(
        params: DescribeOutboundCrossClusterSearchConnectionsRequest
    ): Future[DescribeOutboundCrossClusterSearchConnectionsResponse] =
      service.describeOutboundCrossClusterSearchConnections(params).promise().toFuture
    @inline def describePackagesFuture(params: DescribePackagesRequest): Future[DescribePackagesResponse] =
      service.describePackages(params).promise().toFuture
    @inline def describeReservedElasticsearchInstanceOfferingsFuture(
        params: DescribeReservedElasticsearchInstanceOfferingsRequest
    ): Future[DescribeReservedElasticsearchInstanceOfferingsResponse] =
      service.describeReservedElasticsearchInstanceOfferings(params).promise().toFuture
    @inline def describeReservedElasticsearchInstancesFuture(
        params: DescribeReservedElasticsearchInstancesRequest
    ): Future[DescribeReservedElasticsearchInstancesResponse] =
      service.describeReservedElasticsearchInstances(params).promise().toFuture
    @inline def dissociatePackageFuture(params: DissociatePackageRequest): Future[DissociatePackageResponse] =
      service.dissociatePackage(params).promise().toFuture
    @inline def getCompatibleElasticsearchVersionsFuture(
        params: GetCompatibleElasticsearchVersionsRequest
    ): Future[GetCompatibleElasticsearchVersionsResponse] =
      service.getCompatibleElasticsearchVersions(params).promise().toFuture
    @inline def getUpgradeHistoryFuture(params: GetUpgradeHistoryRequest): Future[GetUpgradeHistoryResponse] =
      service.getUpgradeHistory(params).promise().toFuture
    @inline def getUpgradeStatusFuture(params: GetUpgradeStatusRequest): Future[GetUpgradeStatusResponse] =
      service.getUpgradeStatus(params).promise().toFuture
    @inline def listDomainNamesFuture(): Future[ListDomainNamesResponse] = service.listDomainNames().promise().toFuture
    @inline def listDomainsForPackageFuture(
        params: ListDomainsForPackageRequest
    ): Future[ListDomainsForPackageResponse] = service.listDomainsForPackage(params).promise().toFuture
    @inline def listElasticsearchInstanceTypesFuture(
        params: ListElasticsearchInstanceTypesRequest
    ): Future[ListElasticsearchInstanceTypesResponse] =
      service.listElasticsearchInstanceTypes(params).promise().toFuture
    @inline def listElasticsearchVersionsFuture(
        params: ListElasticsearchVersionsRequest
    ): Future[ListElasticsearchVersionsResponse] = service.listElasticsearchVersions(params).promise().toFuture
    @inline def listPackagesForDomainFuture(
        params: ListPackagesForDomainRequest
    ): Future[ListPackagesForDomainResponse] = service.listPackagesForDomain(params).promise().toFuture
    @inline def listTagsFuture(params: ListTagsRequest): Future[ListTagsResponse] =
      service.listTags(params).promise().toFuture
    @inline def purchaseReservedElasticsearchInstanceOfferingFuture(
        params: PurchaseReservedElasticsearchInstanceOfferingRequest
    ): Future[PurchaseReservedElasticsearchInstanceOfferingResponse] =
      service.purchaseReservedElasticsearchInstanceOffering(params).promise().toFuture
    @inline def rejectInboundCrossClusterSearchConnectionFuture(
        params: RejectInboundCrossClusterSearchConnectionRequest
    ): Future[RejectInboundCrossClusterSearchConnectionResponse] =
      service.rejectInboundCrossClusterSearchConnection(params).promise().toFuture
    @inline def removeTagsFuture(params: RemoveTagsRequest): Future[js.Object] =
      service.removeTags(params).promise().toFuture
    @inline def startElasticsearchServiceSoftwareUpdateFuture(
        params: StartElasticsearchServiceSoftwareUpdateRequest
    ): Future[StartElasticsearchServiceSoftwareUpdateResponse] =
      service.startElasticsearchServiceSoftwareUpdate(params).promise().toFuture
    @inline def updateElasticsearchDomainConfigFuture(
        params: UpdateElasticsearchDomainConfigRequest
    ): Future[UpdateElasticsearchDomainConfigResponse] =
      service.updateElasticsearchDomainConfig(params).promise().toFuture
    @inline def upgradeElasticsearchDomainFuture(
        params: UpgradeElasticsearchDomainRequest
    ): Future[UpgradeElasticsearchDomainResponse] = service.upgradeElasticsearchDomain(params).promise().toFuture
  }
}

package es {
  @js.native
  @JSImport("aws-sdk", "ES", "AWS.ES")
  class ES() extends js.Object {
    def this(config: AWSConfig) = this()

    def acceptInboundCrossClusterSearchConnection(
        params: AcceptInboundCrossClusterSearchConnectionRequest
    ): Request[AcceptInboundCrossClusterSearchConnectionResponse] = js.native
    def addTags(params: AddTagsRequest): Request[js.Object] = js.native
    def associatePackage(params: AssociatePackageRequest): Request[AssociatePackageResponse] = js.native
    def cancelElasticsearchServiceSoftwareUpdate(
        params: CancelElasticsearchServiceSoftwareUpdateRequest
    ): Request[CancelElasticsearchServiceSoftwareUpdateResponse] = js.native
    def createElasticsearchDomain(
        params: CreateElasticsearchDomainRequest
    ): Request[CreateElasticsearchDomainResponse] = js.native
    def createOutboundCrossClusterSearchConnection(
        params: CreateOutboundCrossClusterSearchConnectionRequest
    ): Request[CreateOutboundCrossClusterSearchConnectionResponse] = js.native
    def createPackage(params: CreatePackageRequest): Request[CreatePackageResponse] = js.native
    def deleteElasticsearchDomain(
        params: DeleteElasticsearchDomainRequest
    ): Request[DeleteElasticsearchDomainResponse] = js.native
    def deleteElasticsearchServiceRole(): Request[js.Object] = js.native
    def deleteInboundCrossClusterSearchConnection(
        params: DeleteInboundCrossClusterSearchConnectionRequest
    ): Request[DeleteInboundCrossClusterSearchConnectionResponse] = js.native
    def deleteOutboundCrossClusterSearchConnection(
        params: DeleteOutboundCrossClusterSearchConnectionRequest
    ): Request[DeleteOutboundCrossClusterSearchConnectionResponse] = js.native
    def deletePackage(params: DeletePackageRequest): Request[DeletePackageResponse] = js.native
    def describeElasticsearchDomain(
        params: DescribeElasticsearchDomainRequest
    ): Request[DescribeElasticsearchDomainResponse] = js.native
    def describeElasticsearchDomainConfig(
        params: DescribeElasticsearchDomainConfigRequest
    ): Request[DescribeElasticsearchDomainConfigResponse] = js.native
    def describeElasticsearchDomains(
        params: DescribeElasticsearchDomainsRequest
    ): Request[DescribeElasticsearchDomainsResponse] = js.native
    def describeElasticsearchInstanceTypeLimits(
        params: DescribeElasticsearchInstanceTypeLimitsRequest
    ): Request[DescribeElasticsearchInstanceTypeLimitsResponse] = js.native
    def describeInboundCrossClusterSearchConnections(
        params: DescribeInboundCrossClusterSearchConnectionsRequest
    ): Request[DescribeInboundCrossClusterSearchConnectionsResponse] = js.native
    def describeOutboundCrossClusterSearchConnections(
        params: DescribeOutboundCrossClusterSearchConnectionsRequest
    ): Request[DescribeOutboundCrossClusterSearchConnectionsResponse] = js.native
    def describePackages(params: DescribePackagesRequest): Request[DescribePackagesResponse] = js.native
    def describeReservedElasticsearchInstanceOfferings(
        params: DescribeReservedElasticsearchInstanceOfferingsRequest
    ): Request[DescribeReservedElasticsearchInstanceOfferingsResponse] = js.native
    def describeReservedElasticsearchInstances(
        params: DescribeReservedElasticsearchInstancesRequest
    ): Request[DescribeReservedElasticsearchInstancesResponse] = js.native
    def dissociatePackage(params: DissociatePackageRequest): Request[DissociatePackageResponse] = js.native
    def getCompatibleElasticsearchVersions(
        params: GetCompatibleElasticsearchVersionsRequest
    ): Request[GetCompatibleElasticsearchVersionsResponse] = js.native
    def getUpgradeHistory(params: GetUpgradeHistoryRequest): Request[GetUpgradeHistoryResponse] = js.native
    def getUpgradeStatus(params: GetUpgradeStatusRequest): Request[GetUpgradeStatusResponse] = js.native
    def listDomainNames(): Request[ListDomainNamesResponse] = js.native
    def listDomainsForPackage(params: ListDomainsForPackageRequest): Request[ListDomainsForPackageResponse] = js.native
    def listElasticsearchInstanceTypes(
        params: ListElasticsearchInstanceTypesRequest
    ): Request[ListElasticsearchInstanceTypesResponse] = js.native
    def listElasticsearchVersions(
        params: ListElasticsearchVersionsRequest
    ): Request[ListElasticsearchVersionsResponse] = js.native
    def listPackagesForDomain(params: ListPackagesForDomainRequest): Request[ListPackagesForDomainResponse] = js.native
    def listTags(params: ListTagsRequest): Request[ListTagsResponse] = js.native
    def purchaseReservedElasticsearchInstanceOffering(
        params: PurchaseReservedElasticsearchInstanceOfferingRequest
    ): Request[PurchaseReservedElasticsearchInstanceOfferingResponse] = js.native
    def rejectInboundCrossClusterSearchConnection(
        params: RejectInboundCrossClusterSearchConnectionRequest
    ): Request[RejectInboundCrossClusterSearchConnectionResponse] = js.native
    def removeTags(params: RemoveTagsRequest): Request[js.Object] = js.native
    def startElasticsearchServiceSoftwareUpdate(
        params: StartElasticsearchServiceSoftwareUpdateRequest
    ): Request[StartElasticsearchServiceSoftwareUpdateResponse] = js.native
    def updateElasticsearchDomainConfig(
        params: UpdateElasticsearchDomainConfigRequest
    ): Request[UpdateElasticsearchDomainConfigResponse] = js.native
    def upgradeElasticsearchDomain(
        params: UpgradeElasticsearchDomainRequest
    ): Request[UpgradeElasticsearchDomainResponse] = js.native
  }

  /**
    * Container for the parameters to the <code><a>AcceptInboundCrossClusterSearchConnection</a></code> operation.
    */
  @js.native
  trait AcceptInboundCrossClusterSearchConnectionRequest extends js.Object {
    var CrossClusterSearchConnectionId: CrossClusterSearchConnectionId
  }

  object AcceptInboundCrossClusterSearchConnectionRequest {
    @inline
    def apply(
        CrossClusterSearchConnectionId: CrossClusterSearchConnectionId
    ): AcceptInboundCrossClusterSearchConnectionRequest = {
      val __obj = js.Dynamic.literal(
        "CrossClusterSearchConnectionId" -> CrossClusterSearchConnectionId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AcceptInboundCrossClusterSearchConnectionRequest]
    }
  }

  /**
    * The result of a <code><a>AcceptInboundCrossClusterSearchConnection</a></code> operation. Contains details of accepted inbound connection.
    */
  @js.native
  trait AcceptInboundCrossClusterSearchConnectionResponse extends js.Object {
    var CrossClusterSearchConnection: js.UndefOr[InboundCrossClusterSearchConnection]
  }

  object AcceptInboundCrossClusterSearchConnectionResponse {
    @inline
    def apply(
        CrossClusterSearchConnection: js.UndefOr[InboundCrossClusterSearchConnection] = js.undefined
    ): AcceptInboundCrossClusterSearchConnectionResponse = {
      val __obj = js.Dynamic.literal()
      CrossClusterSearchConnection.foreach(__v =>
        __obj.updateDynamic("CrossClusterSearchConnection")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[AcceptInboundCrossClusterSearchConnectionResponse]
    }
  }

  /**
    * The configured access rules for the domain's document and search endpoints, and the current status of those rules.
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

  /**
    * Container for the parameters to the <code><a>AddTags</a></code> operation. Specify the tags that you want to attach to the Elasticsearch domain.
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

  /**
    * List of limits that are specific to a given InstanceType and for each of it's <code> <a>InstanceRole</a> </code> .
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

  /**
    * Status of the advanced options for the specified Elasticsearch domain. Currently, the following advanced options are available:
    * * Option to allow references to indices in an HTTP request body. Must be <code>false</code> when configuring access to individual sub-resources. By default, the value is <code>true</code>. See <a href="http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-advanced-options" target="_blank">Configuration Advanced Options</a> for more information.
    *  * Option to specify the percentage of heap space that is allocated to field data. By default, this setting is unbounded.
    * For more information, see [[http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-advanced-options|Configuring Advanced Options]].
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

  /**
    * Specifies the advanced security configuration: whether advanced security is enabled, whether the internal database option is enabled.
    */
  @js.native
  trait AdvancedSecurityOptions extends js.Object {
    var Enabled: js.UndefOr[Boolean]
    var InternalUserDatabaseEnabled: js.UndefOr[Boolean]
  }

  object AdvancedSecurityOptions {
    @inline
    def apply(
        Enabled: js.UndefOr[Boolean] = js.undefined,
        InternalUserDatabaseEnabled: js.UndefOr[Boolean] = js.undefined
    ): AdvancedSecurityOptions = {
      val __obj = js.Dynamic.literal()
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      InternalUserDatabaseEnabled.foreach(__v =>
        __obj.updateDynamic("InternalUserDatabaseEnabled")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[AdvancedSecurityOptions]
    }
  }

  /**
    * Specifies the advanced security configuration: whether advanced security is enabled, whether the internal database option is enabled, master username and password (if internal database is enabled), and master user ARN (if IAM is enabled).
    */
  @js.native
  trait AdvancedSecurityOptionsInput extends js.Object {
    var Enabled: js.UndefOr[Boolean]
    var InternalUserDatabaseEnabled: js.UndefOr[Boolean]
    var MasterUserOptions: js.UndefOr[MasterUserOptions]
  }

  object AdvancedSecurityOptionsInput {
    @inline
    def apply(
        Enabled: js.UndefOr[Boolean] = js.undefined,
        InternalUserDatabaseEnabled: js.UndefOr[Boolean] = js.undefined,
        MasterUserOptions: js.UndefOr[MasterUserOptions] = js.undefined
    ): AdvancedSecurityOptionsInput = {
      val __obj = js.Dynamic.literal()
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      InternalUserDatabaseEnabled.foreach(__v =>
        __obj.updateDynamic("InternalUserDatabaseEnabled")(__v.asInstanceOf[js.Any])
      )
      MasterUserOptions.foreach(__v => __obj.updateDynamic("MasterUserOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AdvancedSecurityOptionsInput]
    }
  }

  /**
    * Specifies the status of advanced security options for the specified Elasticsearch domain.
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

  /**
    * Container for request parameters to <code> <a>AssociatePackage</a> </code> operation.
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

  /**
    * Container for response returned by <code> <a>AssociatePackage</a> </code> operation.
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

  /**
    * Container for the parameters to the <code><a>CancelElasticsearchServiceSoftwareUpdate</a></code> operation. Specifies the name of the Elasticsearch domain that you wish to cancel a service software update on.
    */
  @js.native
  trait CancelElasticsearchServiceSoftwareUpdateRequest extends js.Object {
    var DomainName: DomainName
  }

  object CancelElasticsearchServiceSoftwareUpdateRequest {
    @inline
    def apply(
        DomainName: DomainName
    ): CancelElasticsearchServiceSoftwareUpdateRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CancelElasticsearchServiceSoftwareUpdateRequest]
    }
  }

  /**
    * The result of a <code>CancelElasticsearchServiceSoftwareUpdate</code> operation. Contains the status of the update.
    */
  @js.native
  trait CancelElasticsearchServiceSoftwareUpdateResponse extends js.Object {
    var ServiceSoftwareOptions: js.UndefOr[ServiceSoftwareOptions]
  }

  object CancelElasticsearchServiceSoftwareUpdateResponse {
    @inline
    def apply(
        ServiceSoftwareOptions: js.UndefOr[ServiceSoftwareOptions] = js.undefined
    ): CancelElasticsearchServiceSoftwareUpdateResponse = {
      val __obj = js.Dynamic.literal()
      ServiceSoftwareOptions.foreach(__v => __obj.updateDynamic("ServiceSoftwareOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CancelElasticsearchServiceSoftwareUpdateResponse]
    }
  }

  /**
    * Options to specify the Cognito user and identity pools for Kibana authentication. For more information, see <a href="http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-cognito-auth.html" target="_blank">Amazon Cognito Authentication for Kibana</a>.
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

  /**
    * Status of the Cognito options for the specified Elasticsearch domain.
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

  /**
    * A map from an <code> <a>ElasticsearchVersion</a> </code> to a list of compatible <code> <a>ElasticsearchVersion</a> </code> s to which the domain can be upgraded.
    */
  @js.native
  trait CompatibleVersionsMap extends js.Object {
    var SourceVersion: js.UndefOr[ElasticsearchVersionString]
    var TargetVersions: js.UndefOr[ElasticsearchVersionList]
  }

  object CompatibleVersionsMap {
    @inline
    def apply(
        SourceVersion: js.UndefOr[ElasticsearchVersionString] = js.undefined,
        TargetVersions: js.UndefOr[ElasticsearchVersionList] = js.undefined
    ): CompatibleVersionsMap = {
      val __obj = js.Dynamic.literal()
      SourceVersion.foreach(__v => __obj.updateDynamic("SourceVersion")(__v.asInstanceOf[js.Any]))
      TargetVersions.foreach(__v => __obj.updateDynamic("TargetVersions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CompatibleVersionsMap]
    }
  }

  @js.native
  trait CreateElasticsearchDomainRequest extends js.Object {
    var DomainName: DomainName
    var AccessPolicies: js.UndefOr[PolicyDocument]
    var AdvancedOptions: js.UndefOr[AdvancedOptions]
    var AdvancedSecurityOptions: js.UndefOr[AdvancedSecurityOptionsInput]
    var CognitoOptions: js.UndefOr[CognitoOptions]
    var DomainEndpointOptions: js.UndefOr[DomainEndpointOptions]
    var EBSOptions: js.UndefOr[EBSOptions]
    var ElasticsearchClusterConfig: js.UndefOr[ElasticsearchClusterConfig]
    var ElasticsearchVersion: js.UndefOr[ElasticsearchVersionString]
    var EncryptionAtRestOptions: js.UndefOr[EncryptionAtRestOptions]
    var LogPublishingOptions: js.UndefOr[LogPublishingOptions]
    var NodeToNodeEncryptionOptions: js.UndefOr[NodeToNodeEncryptionOptions]
    var SnapshotOptions: js.UndefOr[SnapshotOptions]
    var VPCOptions: js.UndefOr[VPCOptions]
  }

  object CreateElasticsearchDomainRequest {
    @inline
    def apply(
        DomainName: DomainName,
        AccessPolicies: js.UndefOr[PolicyDocument] = js.undefined,
        AdvancedOptions: js.UndefOr[AdvancedOptions] = js.undefined,
        AdvancedSecurityOptions: js.UndefOr[AdvancedSecurityOptionsInput] = js.undefined,
        CognitoOptions: js.UndefOr[CognitoOptions] = js.undefined,
        DomainEndpointOptions: js.UndefOr[DomainEndpointOptions] = js.undefined,
        EBSOptions: js.UndefOr[EBSOptions] = js.undefined,
        ElasticsearchClusterConfig: js.UndefOr[ElasticsearchClusterConfig] = js.undefined,
        ElasticsearchVersion: js.UndefOr[ElasticsearchVersionString] = js.undefined,
        EncryptionAtRestOptions: js.UndefOr[EncryptionAtRestOptions] = js.undefined,
        LogPublishingOptions: js.UndefOr[LogPublishingOptions] = js.undefined,
        NodeToNodeEncryptionOptions: js.UndefOr[NodeToNodeEncryptionOptions] = js.undefined,
        SnapshotOptions: js.UndefOr[SnapshotOptions] = js.undefined,
        VPCOptions: js.UndefOr[VPCOptions] = js.undefined
    ): CreateElasticsearchDomainRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      AccessPolicies.foreach(__v => __obj.updateDynamic("AccessPolicies")(__v.asInstanceOf[js.Any]))
      AdvancedOptions.foreach(__v => __obj.updateDynamic("AdvancedOptions")(__v.asInstanceOf[js.Any]))
      AdvancedSecurityOptions.foreach(__v => __obj.updateDynamic("AdvancedSecurityOptions")(__v.asInstanceOf[js.Any]))
      CognitoOptions.foreach(__v => __obj.updateDynamic("CognitoOptions")(__v.asInstanceOf[js.Any]))
      DomainEndpointOptions.foreach(__v => __obj.updateDynamic("DomainEndpointOptions")(__v.asInstanceOf[js.Any]))
      EBSOptions.foreach(__v => __obj.updateDynamic("EBSOptions")(__v.asInstanceOf[js.Any]))
      ElasticsearchClusterConfig.foreach(__v =>
        __obj.updateDynamic("ElasticsearchClusterConfig")(__v.asInstanceOf[js.Any])
      )
      ElasticsearchVersion.foreach(__v => __obj.updateDynamic("ElasticsearchVersion")(__v.asInstanceOf[js.Any]))
      EncryptionAtRestOptions.foreach(__v => __obj.updateDynamic("EncryptionAtRestOptions")(__v.asInstanceOf[js.Any]))
      LogPublishingOptions.foreach(__v => __obj.updateDynamic("LogPublishingOptions")(__v.asInstanceOf[js.Any]))
      NodeToNodeEncryptionOptions.foreach(__v =>
        __obj.updateDynamic("NodeToNodeEncryptionOptions")(__v.asInstanceOf[js.Any])
      )
      SnapshotOptions.foreach(__v => __obj.updateDynamic("SnapshotOptions")(__v.asInstanceOf[js.Any]))
      VPCOptions.foreach(__v => __obj.updateDynamic("VPCOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateElasticsearchDomainRequest]
    }
  }

  /**
    * The result of a <code>CreateElasticsearchDomain</code> operation. Contains the status of the newly created Elasticsearch domain.
    */
  @js.native
  trait CreateElasticsearchDomainResponse extends js.Object {
    var DomainStatus: js.UndefOr[ElasticsearchDomainStatus]
  }

  object CreateElasticsearchDomainResponse {
    @inline
    def apply(
        DomainStatus: js.UndefOr[ElasticsearchDomainStatus] = js.undefined
    ): CreateElasticsearchDomainResponse = {
      val __obj = js.Dynamic.literal()
      DomainStatus.foreach(__v => __obj.updateDynamic("DomainStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateElasticsearchDomainResponse]
    }
  }

  /**
    * Container for the parameters to the <code><a>CreateOutboundCrossClusterSearchConnection</a></code> operation.
    */
  @js.native
  trait CreateOutboundCrossClusterSearchConnectionRequest extends js.Object {
    var ConnectionAlias: ConnectionAlias
    var DestinationDomainInfo: DomainInformation
    var SourceDomainInfo: DomainInformation
  }

  object CreateOutboundCrossClusterSearchConnectionRequest {
    @inline
    def apply(
        ConnectionAlias: ConnectionAlias,
        DestinationDomainInfo: DomainInformation,
        SourceDomainInfo: DomainInformation
    ): CreateOutboundCrossClusterSearchConnectionRequest = {
      val __obj = js.Dynamic.literal(
        "ConnectionAlias" -> ConnectionAlias.asInstanceOf[js.Any],
        "DestinationDomainInfo" -> DestinationDomainInfo.asInstanceOf[js.Any],
        "SourceDomainInfo" -> SourceDomainInfo.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateOutboundCrossClusterSearchConnectionRequest]
    }
  }

  /**
    * The result of a <code><a>CreateOutboundCrossClusterSearchConnection</a></code> request. Contains the details of the newly created cross-cluster search connection.
    */
  @js.native
  trait CreateOutboundCrossClusterSearchConnectionResponse extends js.Object {
    var ConnectionAlias: js.UndefOr[ConnectionAlias]
    var ConnectionStatus: js.UndefOr[OutboundCrossClusterSearchConnectionStatus]
    var CrossClusterSearchConnectionId: js.UndefOr[CrossClusterSearchConnectionId]
    var DestinationDomainInfo: js.UndefOr[DomainInformation]
    var SourceDomainInfo: js.UndefOr[DomainInformation]
  }

  object CreateOutboundCrossClusterSearchConnectionResponse {
    @inline
    def apply(
        ConnectionAlias: js.UndefOr[ConnectionAlias] = js.undefined,
        ConnectionStatus: js.UndefOr[OutboundCrossClusterSearchConnectionStatus] = js.undefined,
        CrossClusterSearchConnectionId: js.UndefOr[CrossClusterSearchConnectionId] = js.undefined,
        DestinationDomainInfo: js.UndefOr[DomainInformation] = js.undefined,
        SourceDomainInfo: js.UndefOr[DomainInformation] = js.undefined
    ): CreateOutboundCrossClusterSearchConnectionResponse = {
      val __obj = js.Dynamic.literal()
      ConnectionAlias.foreach(__v => __obj.updateDynamic("ConnectionAlias")(__v.asInstanceOf[js.Any]))
      ConnectionStatus.foreach(__v => __obj.updateDynamic("ConnectionStatus")(__v.asInstanceOf[js.Any]))
      CrossClusterSearchConnectionId.foreach(__v =>
        __obj.updateDynamic("CrossClusterSearchConnectionId")(__v.asInstanceOf[js.Any])
      )
      DestinationDomainInfo.foreach(__v => __obj.updateDynamic("DestinationDomainInfo")(__v.asInstanceOf[js.Any]))
      SourceDomainInfo.foreach(__v => __obj.updateDynamic("SourceDomainInfo")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateOutboundCrossClusterSearchConnectionResponse]
    }
  }

  /**
    * Container for request parameters to <code> <a>CreatePackage</a> </code> operation.
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

  /**
    * Container for response returned by <code> <a>CreatePackage</a> </code> operation.
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

  /**
    * Container for the parameters to the <code><a>DeleteElasticsearchDomain</a></code> operation. Specifies the name of the Elasticsearch domain that you want to delete.
    */
  @js.native
  trait DeleteElasticsearchDomainRequest extends js.Object {
    var DomainName: DomainName
  }

  object DeleteElasticsearchDomainRequest {
    @inline
    def apply(
        DomainName: DomainName
    ): DeleteElasticsearchDomainRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteElasticsearchDomainRequest]
    }
  }

  /**
    * The result of a <code>DeleteElasticsearchDomain</code> request. Contains the status of the pending deletion, or no status if the domain and all of its resources have been deleted.
    */
  @js.native
  trait DeleteElasticsearchDomainResponse extends js.Object {
    var DomainStatus: js.UndefOr[ElasticsearchDomainStatus]
  }

  object DeleteElasticsearchDomainResponse {
    @inline
    def apply(
        DomainStatus: js.UndefOr[ElasticsearchDomainStatus] = js.undefined
    ): DeleteElasticsearchDomainResponse = {
      val __obj = js.Dynamic.literal()
      DomainStatus.foreach(__v => __obj.updateDynamic("DomainStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteElasticsearchDomainResponse]
    }
  }

  /**
    * Container for the parameters to the <code><a>DeleteInboundCrossClusterSearchConnection</a></code> operation.
    */
  @js.native
  trait DeleteInboundCrossClusterSearchConnectionRequest extends js.Object {
    var CrossClusterSearchConnectionId: CrossClusterSearchConnectionId
  }

  object DeleteInboundCrossClusterSearchConnectionRequest {
    @inline
    def apply(
        CrossClusterSearchConnectionId: CrossClusterSearchConnectionId
    ): DeleteInboundCrossClusterSearchConnectionRequest = {
      val __obj = js.Dynamic.literal(
        "CrossClusterSearchConnectionId" -> CrossClusterSearchConnectionId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteInboundCrossClusterSearchConnectionRequest]
    }
  }

  /**
    * The result of a <code><a>DeleteInboundCrossClusterSearchConnection</a></code> operation. Contains details of deleted inbound connection.
    */
  @js.native
  trait DeleteInboundCrossClusterSearchConnectionResponse extends js.Object {
    var CrossClusterSearchConnection: js.UndefOr[InboundCrossClusterSearchConnection]
  }

  object DeleteInboundCrossClusterSearchConnectionResponse {
    @inline
    def apply(
        CrossClusterSearchConnection: js.UndefOr[InboundCrossClusterSearchConnection] = js.undefined
    ): DeleteInboundCrossClusterSearchConnectionResponse = {
      val __obj = js.Dynamic.literal()
      CrossClusterSearchConnection.foreach(__v =>
        __obj.updateDynamic("CrossClusterSearchConnection")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DeleteInboundCrossClusterSearchConnectionResponse]
    }
  }

  /**
    * Container for the parameters to the <code><a>DeleteOutboundCrossClusterSearchConnection</a></code> operation.
    */
  @js.native
  trait DeleteOutboundCrossClusterSearchConnectionRequest extends js.Object {
    var CrossClusterSearchConnectionId: CrossClusterSearchConnectionId
  }

  object DeleteOutboundCrossClusterSearchConnectionRequest {
    @inline
    def apply(
        CrossClusterSearchConnectionId: CrossClusterSearchConnectionId
    ): DeleteOutboundCrossClusterSearchConnectionRequest = {
      val __obj = js.Dynamic.literal(
        "CrossClusterSearchConnectionId" -> CrossClusterSearchConnectionId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteOutboundCrossClusterSearchConnectionRequest]
    }
  }

  /**
    * The result of a <code><a>DeleteOutboundCrossClusterSearchConnection</a></code> operation. Contains details of deleted outbound connection.
    */
  @js.native
  trait DeleteOutboundCrossClusterSearchConnectionResponse extends js.Object {
    var CrossClusterSearchConnection: js.UndefOr[OutboundCrossClusterSearchConnection]
  }

  object DeleteOutboundCrossClusterSearchConnectionResponse {
    @inline
    def apply(
        CrossClusterSearchConnection: js.UndefOr[OutboundCrossClusterSearchConnection] = js.undefined
    ): DeleteOutboundCrossClusterSearchConnectionResponse = {
      val __obj = js.Dynamic.literal()
      CrossClusterSearchConnection.foreach(__v =>
        __obj.updateDynamic("CrossClusterSearchConnection")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DeleteOutboundCrossClusterSearchConnectionResponse]
    }
  }

  /**
    * Container for request parameters to <code> <a>DeletePackage</a> </code> operation.
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

  /**
    * Container for response parameters to <code> <a>DeletePackage</a> </code> operation.
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
  sealed trait DeploymentStatus extends js.Any
  object DeploymentStatus extends js.Object {
    val PENDING_UPDATE = "PENDING_UPDATE".asInstanceOf[DeploymentStatus]
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[DeploymentStatus]
    val COMPLETED = "COMPLETED".asInstanceOf[DeploymentStatus]
    val NOT_ELIGIBLE = "NOT_ELIGIBLE".asInstanceOf[DeploymentStatus]
    val ELIGIBLE = "ELIGIBLE".asInstanceOf[DeploymentStatus]

    val values = js.Object.freeze(js.Array(PENDING_UPDATE, IN_PROGRESS, COMPLETED, NOT_ELIGIBLE, ELIGIBLE))
  }

  /**
    * Container for the parameters to the <code>DescribeElasticsearchDomainConfig</code> operation. Specifies the domain name for which you want configuration information.
    */
  @js.native
  trait DescribeElasticsearchDomainConfigRequest extends js.Object {
    var DomainName: DomainName
  }

  object DescribeElasticsearchDomainConfigRequest {
    @inline
    def apply(
        DomainName: DomainName
    ): DescribeElasticsearchDomainConfigRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeElasticsearchDomainConfigRequest]
    }
  }

  /**
    * The result of a <code>DescribeElasticsearchDomainConfig</code> request. Contains the configuration information of the requested domain.
    */
  @js.native
  trait DescribeElasticsearchDomainConfigResponse extends js.Object {
    var DomainConfig: ElasticsearchDomainConfig
  }

  object DescribeElasticsearchDomainConfigResponse {
    @inline
    def apply(
        DomainConfig: ElasticsearchDomainConfig
    ): DescribeElasticsearchDomainConfigResponse = {
      val __obj = js.Dynamic.literal(
        "DomainConfig" -> DomainConfig.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeElasticsearchDomainConfigResponse]
    }
  }

  /**
    * Container for the parameters to the <code><a>DescribeElasticsearchDomain</a></code> operation.
    */
  @js.native
  trait DescribeElasticsearchDomainRequest extends js.Object {
    var DomainName: DomainName
  }

  object DescribeElasticsearchDomainRequest {
    @inline
    def apply(
        DomainName: DomainName
    ): DescribeElasticsearchDomainRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeElasticsearchDomainRequest]
    }
  }

  /**
    * The result of a <code>DescribeElasticsearchDomain</code> request. Contains the status of the domain specified in the request.
    */
  @js.native
  trait DescribeElasticsearchDomainResponse extends js.Object {
    var DomainStatus: ElasticsearchDomainStatus
  }

  object DescribeElasticsearchDomainResponse {
    @inline
    def apply(
        DomainStatus: ElasticsearchDomainStatus
    ): DescribeElasticsearchDomainResponse = {
      val __obj = js.Dynamic.literal(
        "DomainStatus" -> DomainStatus.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeElasticsearchDomainResponse]
    }
  }

  /**
    * Container for the parameters to the <code><a>DescribeElasticsearchDomains</a></code> operation. By default, the API returns the status of all Elasticsearch domains.
    */
  @js.native
  trait DescribeElasticsearchDomainsRequest extends js.Object {
    var DomainNames: DomainNameList
  }

  object DescribeElasticsearchDomainsRequest {
    @inline
    def apply(
        DomainNames: DomainNameList
    ): DescribeElasticsearchDomainsRequest = {
      val __obj = js.Dynamic.literal(
        "DomainNames" -> DomainNames.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeElasticsearchDomainsRequest]
    }
  }

  /**
    * The result of a <code>DescribeElasticsearchDomains</code> request. Contains the status of the specified domains or all domains owned by the account.
    */
  @js.native
  trait DescribeElasticsearchDomainsResponse extends js.Object {
    var DomainStatusList: ElasticsearchDomainStatusList
  }

  object DescribeElasticsearchDomainsResponse {
    @inline
    def apply(
        DomainStatusList: ElasticsearchDomainStatusList
    ): DescribeElasticsearchDomainsResponse = {
      val __obj = js.Dynamic.literal(
        "DomainStatusList" -> DomainStatusList.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeElasticsearchDomainsResponse]
    }
  }

  /**
    * Container for the parameters to <code> <a>DescribeElasticsearchInstanceTypeLimits</a> </code> operation.
    */
  @js.native
  trait DescribeElasticsearchInstanceTypeLimitsRequest extends js.Object {
    var ElasticsearchVersion: ElasticsearchVersionString
    var InstanceType: ESPartitionInstanceType
    var DomainName: js.UndefOr[DomainName]
  }

  object DescribeElasticsearchInstanceTypeLimitsRequest {
    @inline
    def apply(
        ElasticsearchVersion: ElasticsearchVersionString,
        InstanceType: ESPartitionInstanceType,
        DomainName: js.UndefOr[DomainName] = js.undefined
    ): DescribeElasticsearchInstanceTypeLimitsRequest = {
      val __obj = js.Dynamic.literal(
        "ElasticsearchVersion" -> ElasticsearchVersion.asInstanceOf[js.Any],
        "InstanceType" -> InstanceType.asInstanceOf[js.Any]
      )

      DomainName.foreach(__v => __obj.updateDynamic("DomainName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeElasticsearchInstanceTypeLimitsRequest]
    }
  }

  /**
    * Container for the parameters received from <code> <a>DescribeElasticsearchInstanceTypeLimits</a> </code> operation.
    */
  @js.native
  trait DescribeElasticsearchInstanceTypeLimitsResponse extends js.Object {
    var LimitsByRole: js.UndefOr[LimitsByRole]
  }

  object DescribeElasticsearchInstanceTypeLimitsResponse {
    @inline
    def apply(
        LimitsByRole: js.UndefOr[LimitsByRole] = js.undefined
    ): DescribeElasticsearchInstanceTypeLimitsResponse = {
      val __obj = js.Dynamic.literal()
      LimitsByRole.foreach(__v => __obj.updateDynamic("LimitsByRole")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeElasticsearchInstanceTypeLimitsResponse]
    }
  }

  /**
    * Container for the parameters to the <code><a>DescribeInboundCrossClusterSearchConnections</a></code> operation.
    */
  @js.native
  trait DescribeInboundCrossClusterSearchConnectionsRequest extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeInboundCrossClusterSearchConnectionsRequest {
    @inline
    def apply(
        Filters: js.UndefOr[FilterList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeInboundCrossClusterSearchConnectionsRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeInboundCrossClusterSearchConnectionsRequest]
    }
  }

  /**
    * The result of a <code><a>DescribeInboundCrossClusterSearchConnections</a></code> request. Contains the list of connections matching the filter criteria.
    */
  @js.native
  trait DescribeInboundCrossClusterSearchConnectionsResponse extends js.Object {
    var CrossClusterSearchConnections: js.UndefOr[InboundCrossClusterSearchConnections]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeInboundCrossClusterSearchConnectionsResponse {
    @inline
    def apply(
        CrossClusterSearchConnections: js.UndefOr[InboundCrossClusterSearchConnections] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeInboundCrossClusterSearchConnectionsResponse = {
      val __obj = js.Dynamic.literal()
      CrossClusterSearchConnections.foreach(__v =>
        __obj.updateDynamic("CrossClusterSearchConnections")(__v.asInstanceOf[js.Any])
      )
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeInboundCrossClusterSearchConnectionsResponse]
    }
  }

  /**
    * Container for the parameters to the <code><a>DescribeOutboundCrossClusterSearchConnections</a></code> operation.
    */
  @js.native
  trait DescribeOutboundCrossClusterSearchConnectionsRequest extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeOutboundCrossClusterSearchConnectionsRequest {
    @inline
    def apply(
        Filters: js.UndefOr[FilterList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeOutboundCrossClusterSearchConnectionsRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeOutboundCrossClusterSearchConnectionsRequest]
    }
  }

  /**
    * The result of a <code><a>DescribeOutboundCrossClusterSearchConnections</a></code> request. Contains the list of connections matching the filter criteria.
    */
  @js.native
  trait DescribeOutboundCrossClusterSearchConnectionsResponse extends js.Object {
    var CrossClusterSearchConnections: js.UndefOr[OutboundCrossClusterSearchConnections]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeOutboundCrossClusterSearchConnectionsResponse {
    @inline
    def apply(
        CrossClusterSearchConnections: js.UndefOr[OutboundCrossClusterSearchConnections] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeOutboundCrossClusterSearchConnectionsResponse = {
      val __obj = js.Dynamic.literal()
      CrossClusterSearchConnections.foreach(__v =>
        __obj.updateDynamic("CrossClusterSearchConnections")(__v.asInstanceOf[js.Any])
      )
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeOutboundCrossClusterSearchConnectionsResponse]
    }
  }

  /**
    * Filter to apply in <code>DescribePackage</code> response.
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

  @js.native
  sealed trait DescribePackagesFilterName extends js.Any
  object DescribePackagesFilterName extends js.Object {
    val PackageID = "PackageID".asInstanceOf[DescribePackagesFilterName]
    val PackageName = "PackageName".asInstanceOf[DescribePackagesFilterName]
    val PackageStatus = "PackageStatus".asInstanceOf[DescribePackagesFilterName]

    val values = js.Object.freeze(js.Array(PackageID, PackageName, PackageStatus))
  }

  /**
    * Container for request parameters to <code> <a>DescribePackage</a> </code> operation.
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

  /**
    * Container for response returned by <code> <a>DescribePackages</a> </code> operation.
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

  /**
    * Container for parameters to <code>DescribeReservedElasticsearchInstanceOfferings</code>
    */
  @js.native
  trait DescribeReservedElasticsearchInstanceOfferingsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var ReservedElasticsearchInstanceOfferingId: js.UndefOr[GUID]
  }

  object DescribeReservedElasticsearchInstanceOfferingsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ReservedElasticsearchInstanceOfferingId: js.UndefOr[GUID] = js.undefined
    ): DescribeReservedElasticsearchInstanceOfferingsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ReservedElasticsearchInstanceOfferingId.foreach(__v =>
        __obj.updateDynamic("ReservedElasticsearchInstanceOfferingId")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DescribeReservedElasticsearchInstanceOfferingsRequest]
    }
  }

  /**
    * Container for results from <code>DescribeReservedElasticsearchInstanceOfferings</code>
    */
  @js.native
  trait DescribeReservedElasticsearchInstanceOfferingsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var ReservedElasticsearchInstanceOfferings: js.UndefOr[ReservedElasticsearchInstanceOfferingList]
  }

  object DescribeReservedElasticsearchInstanceOfferingsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ReservedElasticsearchInstanceOfferings: js.UndefOr[ReservedElasticsearchInstanceOfferingList] = js.undefined
    ): DescribeReservedElasticsearchInstanceOfferingsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ReservedElasticsearchInstanceOfferings.foreach(__v =>
        __obj.updateDynamic("ReservedElasticsearchInstanceOfferings")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DescribeReservedElasticsearchInstanceOfferingsResponse]
    }
  }

  /**
    * Container for parameters to <code>DescribeReservedElasticsearchInstances</code>
    */
  @js.native
  trait DescribeReservedElasticsearchInstancesRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var ReservedElasticsearchInstanceId: js.UndefOr[GUID]
  }

  object DescribeReservedElasticsearchInstancesRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ReservedElasticsearchInstanceId: js.UndefOr[GUID] = js.undefined
    ): DescribeReservedElasticsearchInstancesRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ReservedElasticsearchInstanceId.foreach(__v =>
        __obj.updateDynamic("ReservedElasticsearchInstanceId")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DescribeReservedElasticsearchInstancesRequest]
    }
  }

  /**
    * Container for results from <code>DescribeReservedElasticsearchInstances</code>
    */
  @js.native
  trait DescribeReservedElasticsearchInstancesResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var ReservedElasticsearchInstances: js.UndefOr[ReservedElasticsearchInstanceList]
  }

  object DescribeReservedElasticsearchInstancesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        ReservedElasticsearchInstances: js.UndefOr[ReservedElasticsearchInstanceList] = js.undefined
    ): DescribeReservedElasticsearchInstancesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ReservedElasticsearchInstances.foreach(__v =>
        __obj.updateDynamic("ReservedElasticsearchInstances")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DescribeReservedElasticsearchInstancesResponse]
    }
  }

  /**
    * Container for request parameters to <code> <a>DissociatePackage</a> </code> operation.
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

  /**
    * Container for response returned by <code> <a>DissociatePackage</a> </code> operation.
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

  /**
    * Options to configure endpoint for the Elasticsearch domain.
    */
  @js.native
  trait DomainEndpointOptions extends js.Object {
    var EnforceHTTPS: js.UndefOr[Boolean]
    var TLSSecurityPolicy: js.UndefOr[TLSSecurityPolicy]
  }

  object DomainEndpointOptions {
    @inline
    def apply(
        EnforceHTTPS: js.UndefOr[Boolean] = js.undefined,
        TLSSecurityPolicy: js.UndefOr[TLSSecurityPolicy] = js.undefined
    ): DomainEndpointOptions = {
      val __obj = js.Dynamic.literal()
      EnforceHTTPS.foreach(__v => __obj.updateDynamic("EnforceHTTPS")(__v.asInstanceOf[js.Any]))
      TLSSecurityPolicy.foreach(__v => __obj.updateDynamic("TLSSecurityPolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DomainEndpointOptions]
    }
  }

  /**
    * The configured endpoint options for the domain and their current status.
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

  @js.native
  trait DomainInfo extends js.Object {
    var DomainName: js.UndefOr[DomainName]
  }

  object DomainInfo {
    @inline
    def apply(
        DomainName: js.UndefOr[DomainName] = js.undefined
    ): DomainInfo = {
      val __obj = js.Dynamic.literal()
      DomainName.foreach(__v => __obj.updateDynamic("DomainName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DomainInfo]
    }
  }

  @js.native
  trait DomainInformation extends js.Object {
    var DomainName: DomainName
    var OwnerId: js.UndefOr[OwnerId]
    var Region: js.UndefOr[Region]
  }

  object DomainInformation {
    @inline
    def apply(
        DomainName: DomainName,
        OwnerId: js.UndefOr[OwnerId] = js.undefined,
        Region: js.UndefOr[Region] = js.undefined
    ): DomainInformation = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      OwnerId.foreach(__v => __obj.updateDynamic("OwnerId")(__v.asInstanceOf[js.Any]))
      Region.foreach(__v => __obj.updateDynamic("Region")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DomainInformation]
    }
  }

  /**
    * Information on a package that is associated with a domain.
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
      ReferencePath.foreach(__v => __obj.updateDynamic("ReferencePath")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DomainPackageDetails]
    }
  }

  @js.native
  sealed trait DomainPackageStatus extends js.Any
  object DomainPackageStatus extends js.Object {
    val ASSOCIATING = "ASSOCIATING".asInstanceOf[DomainPackageStatus]
    val ASSOCIATION_FAILED = "ASSOCIATION_FAILED".asInstanceOf[DomainPackageStatus]
    val ACTIVE = "ACTIVE".asInstanceOf[DomainPackageStatus]
    val DISSOCIATING = "DISSOCIATING".asInstanceOf[DomainPackageStatus]
    val DISSOCIATION_FAILED = "DISSOCIATION_FAILED".asInstanceOf[DomainPackageStatus]

    val values = js.Object.freeze(js.Array(ASSOCIATING, ASSOCIATION_FAILED, ACTIVE, DISSOCIATING, DISSOCIATION_FAILED))
  }

  /**
    * Options to enable, disable, and specify the properties of EBS storage volumes. For more information, see <a href="http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-ebs" target="_blank"> Configuring EBS-based Storage</a>.
    */
  @js.native
  trait EBSOptions extends js.Object {
    var EBSEnabled: js.UndefOr[Boolean]
    var Iops: js.UndefOr[IntegerClass]
    var VolumeSize: js.UndefOr[IntegerClass]
    var VolumeType: js.UndefOr[VolumeType]
  }

  object EBSOptions {
    @inline
    def apply(
        EBSEnabled: js.UndefOr[Boolean] = js.undefined,
        Iops: js.UndefOr[IntegerClass] = js.undefined,
        VolumeSize: js.UndefOr[IntegerClass] = js.undefined,
        VolumeType: js.UndefOr[VolumeType] = js.undefined
    ): EBSOptions = {
      val __obj = js.Dynamic.literal()
      EBSEnabled.foreach(__v => __obj.updateDynamic("EBSEnabled")(__v.asInstanceOf[js.Any]))
      Iops.foreach(__v => __obj.updateDynamic("Iops")(__v.asInstanceOf[js.Any]))
      VolumeSize.foreach(__v => __obj.updateDynamic("VolumeSize")(__v.asInstanceOf[js.Any]))
      VolumeType.foreach(__v => __obj.updateDynamic("VolumeType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EBSOptions]
    }
  }

  /**
    * Status of the EBS options for the specified Elasticsearch domain.
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

  @js.native
  sealed trait ESPartitionInstanceType extends js.Any
  object ESPartitionInstanceType extends js.Object {
    val `m3.medium.elasticsearch` = "m3.medium.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `m3.large.elasticsearch` = "m3.large.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `m3.xlarge.elasticsearch` = "m3.xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `m3.2xlarge.elasticsearch` = "m3.2xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `m4.large.elasticsearch` = "m4.large.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `m4.xlarge.elasticsearch` = "m4.xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `m4.2xlarge.elasticsearch` = "m4.2xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `m4.4xlarge.elasticsearch` = "m4.4xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `m4.10xlarge.elasticsearch` = "m4.10xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `m5.large.elasticsearch` = "m5.large.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `m5.xlarge.elasticsearch` = "m5.xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `m5.2xlarge.elasticsearch` = "m5.2xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `m5.4xlarge.elasticsearch` = "m5.4xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `m5.12xlarge.elasticsearch` = "m5.12xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `r5.large.elasticsearch` = "r5.large.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `r5.xlarge.elasticsearch` = "r5.xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `r5.2xlarge.elasticsearch` = "r5.2xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `r5.4xlarge.elasticsearch` = "r5.4xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `r5.12xlarge.elasticsearch` = "r5.12xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `c5.large.elasticsearch` = "c5.large.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `c5.xlarge.elasticsearch` = "c5.xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `c5.2xlarge.elasticsearch` = "c5.2xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `c5.4xlarge.elasticsearch` = "c5.4xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `c5.9xlarge.elasticsearch` = "c5.9xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `c5.18xlarge.elasticsearch` = "c5.18xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `ultrawarm1.medium.elasticsearch` = "ultrawarm1.medium.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `ultrawarm1.large.elasticsearch` = "ultrawarm1.large.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `t2.micro.elasticsearch` = "t2.micro.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `t2.small.elasticsearch` = "t2.small.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `t2.medium.elasticsearch` = "t2.medium.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `r3.large.elasticsearch` = "r3.large.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `r3.xlarge.elasticsearch` = "r3.xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `r3.2xlarge.elasticsearch` = "r3.2xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `r3.4xlarge.elasticsearch` = "r3.4xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `r3.8xlarge.elasticsearch` = "r3.8xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `i2.xlarge.elasticsearch` = "i2.xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `i2.2xlarge.elasticsearch` = "i2.2xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `d2.xlarge.elasticsearch` = "d2.xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `d2.2xlarge.elasticsearch` = "d2.2xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `d2.4xlarge.elasticsearch` = "d2.4xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `d2.8xlarge.elasticsearch` = "d2.8xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `c4.large.elasticsearch` = "c4.large.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `c4.xlarge.elasticsearch` = "c4.xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `c4.2xlarge.elasticsearch` = "c4.2xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `c4.4xlarge.elasticsearch` = "c4.4xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `c4.8xlarge.elasticsearch` = "c4.8xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `r4.large.elasticsearch` = "r4.large.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `r4.xlarge.elasticsearch` = "r4.xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `r4.2xlarge.elasticsearch` = "r4.2xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `r4.4xlarge.elasticsearch` = "r4.4xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `r4.8xlarge.elasticsearch` = "r4.8xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `r4.16xlarge.elasticsearch` = "r4.16xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `i3.large.elasticsearch` = "i3.large.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `i3.xlarge.elasticsearch` = "i3.xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `i3.2xlarge.elasticsearch` = "i3.2xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `i3.4xlarge.elasticsearch` = "i3.4xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `i3.8xlarge.elasticsearch` = "i3.8xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `i3.16xlarge.elasticsearch` = "i3.16xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]

    val values = js.Object.freeze(
      js.Array(
        `m3.medium.elasticsearch`,
        `m3.large.elasticsearch`,
        `m3.xlarge.elasticsearch`,
        `m3.2xlarge.elasticsearch`,
        `m4.large.elasticsearch`,
        `m4.xlarge.elasticsearch`,
        `m4.2xlarge.elasticsearch`,
        `m4.4xlarge.elasticsearch`,
        `m4.10xlarge.elasticsearch`,
        `m5.large.elasticsearch`,
        `m5.xlarge.elasticsearch`,
        `m5.2xlarge.elasticsearch`,
        `m5.4xlarge.elasticsearch`,
        `m5.12xlarge.elasticsearch`,
        `r5.large.elasticsearch`,
        `r5.xlarge.elasticsearch`,
        `r5.2xlarge.elasticsearch`,
        `r5.4xlarge.elasticsearch`,
        `r5.12xlarge.elasticsearch`,
        `c5.large.elasticsearch`,
        `c5.xlarge.elasticsearch`,
        `c5.2xlarge.elasticsearch`,
        `c5.4xlarge.elasticsearch`,
        `c5.9xlarge.elasticsearch`,
        `c5.18xlarge.elasticsearch`,
        `ultrawarm1.medium.elasticsearch`,
        `ultrawarm1.large.elasticsearch`,
        `t2.micro.elasticsearch`,
        `t2.small.elasticsearch`,
        `t2.medium.elasticsearch`,
        `r3.large.elasticsearch`,
        `r3.xlarge.elasticsearch`,
        `r3.2xlarge.elasticsearch`,
        `r3.4xlarge.elasticsearch`,
        `r3.8xlarge.elasticsearch`,
        `i2.xlarge.elasticsearch`,
        `i2.2xlarge.elasticsearch`,
        `d2.xlarge.elasticsearch`,
        `d2.2xlarge.elasticsearch`,
        `d2.4xlarge.elasticsearch`,
        `d2.8xlarge.elasticsearch`,
        `c4.large.elasticsearch`,
        `c4.xlarge.elasticsearch`,
        `c4.2xlarge.elasticsearch`,
        `c4.4xlarge.elasticsearch`,
        `c4.8xlarge.elasticsearch`,
        `r4.large.elasticsearch`,
        `r4.xlarge.elasticsearch`,
        `r4.2xlarge.elasticsearch`,
        `r4.4xlarge.elasticsearch`,
        `r4.8xlarge.elasticsearch`,
        `r4.16xlarge.elasticsearch`,
        `i3.large.elasticsearch`,
        `i3.xlarge.elasticsearch`,
        `i3.2xlarge.elasticsearch`,
        `i3.4xlarge.elasticsearch`,
        `i3.8xlarge.elasticsearch`,
        `i3.16xlarge.elasticsearch`
      )
    )
  }

  @js.native
  sealed trait ESWarmPartitionInstanceType extends js.Any
  object ESWarmPartitionInstanceType extends js.Object {
    val `ultrawarm1.medium.elasticsearch` = "ultrawarm1.medium.elasticsearch".asInstanceOf[ESWarmPartitionInstanceType]
    val `ultrawarm1.large.elasticsearch` = "ultrawarm1.large.elasticsearch".asInstanceOf[ESWarmPartitionInstanceType]

    val values = js.Object.freeze(js.Array(`ultrawarm1.medium.elasticsearch`, `ultrawarm1.large.elasticsearch`))
  }

  /**
    * Specifies the configuration for the domain cluster, such as the type and number of instances.
    */
  @js.native
  trait ElasticsearchClusterConfig extends js.Object {
    var DedicatedMasterCount: js.UndefOr[IntegerClass]
    var DedicatedMasterEnabled: js.UndefOr[Boolean]
    var DedicatedMasterType: js.UndefOr[ESPartitionInstanceType]
    var InstanceCount: js.UndefOr[IntegerClass]
    var InstanceType: js.UndefOr[ESPartitionInstanceType]
    var WarmCount: js.UndefOr[IntegerClass]
    var WarmEnabled: js.UndefOr[Boolean]
    var WarmType: js.UndefOr[ESWarmPartitionInstanceType]
    var ZoneAwarenessConfig: js.UndefOr[ZoneAwarenessConfig]
    var ZoneAwarenessEnabled: js.UndefOr[Boolean]
  }

  object ElasticsearchClusterConfig {
    @inline
    def apply(
        DedicatedMasterCount: js.UndefOr[IntegerClass] = js.undefined,
        DedicatedMasterEnabled: js.UndefOr[Boolean] = js.undefined,
        DedicatedMasterType: js.UndefOr[ESPartitionInstanceType] = js.undefined,
        InstanceCount: js.UndefOr[IntegerClass] = js.undefined,
        InstanceType: js.UndefOr[ESPartitionInstanceType] = js.undefined,
        WarmCount: js.UndefOr[IntegerClass] = js.undefined,
        WarmEnabled: js.UndefOr[Boolean] = js.undefined,
        WarmType: js.UndefOr[ESWarmPartitionInstanceType] = js.undefined,
        ZoneAwarenessConfig: js.UndefOr[ZoneAwarenessConfig] = js.undefined,
        ZoneAwarenessEnabled: js.UndefOr[Boolean] = js.undefined
    ): ElasticsearchClusterConfig = {
      val __obj = js.Dynamic.literal()
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
      __obj.asInstanceOf[ElasticsearchClusterConfig]
    }
  }

  /**
    * Specifies the configuration status for the specified Elasticsearch domain.
    */
  @js.native
  trait ElasticsearchClusterConfigStatus extends js.Object {
    var Options: ElasticsearchClusterConfig
    var Status: OptionStatus
  }

  object ElasticsearchClusterConfigStatus {
    @inline
    def apply(
        Options: ElasticsearchClusterConfig,
        Status: OptionStatus
    ): ElasticsearchClusterConfigStatus = {
      val __obj = js.Dynamic.literal(
        "Options" -> Options.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ElasticsearchClusterConfigStatus]
    }
  }

  /**
    * The configuration of an Elasticsearch domain.
    */
  @js.native
  trait ElasticsearchDomainConfig extends js.Object {
    var AccessPolicies: js.UndefOr[AccessPoliciesStatus]
    var AdvancedOptions: js.UndefOr[AdvancedOptionsStatus]
    var AdvancedSecurityOptions: js.UndefOr[AdvancedSecurityOptionsStatus]
    var CognitoOptions: js.UndefOr[CognitoOptionsStatus]
    var DomainEndpointOptions: js.UndefOr[DomainEndpointOptionsStatus]
    var EBSOptions: js.UndefOr[EBSOptionsStatus]
    var ElasticsearchClusterConfig: js.UndefOr[ElasticsearchClusterConfigStatus]
    var ElasticsearchVersion: js.UndefOr[ElasticsearchVersionStatus]
    var EncryptionAtRestOptions: js.UndefOr[EncryptionAtRestOptionsStatus]
    var LogPublishingOptions: js.UndefOr[LogPublishingOptionsStatus]
    var NodeToNodeEncryptionOptions: js.UndefOr[NodeToNodeEncryptionOptionsStatus]
    var SnapshotOptions: js.UndefOr[SnapshotOptionsStatus]
    var VPCOptions: js.UndefOr[VPCDerivedInfoStatus]
  }

  object ElasticsearchDomainConfig {
    @inline
    def apply(
        AccessPolicies: js.UndefOr[AccessPoliciesStatus] = js.undefined,
        AdvancedOptions: js.UndefOr[AdvancedOptionsStatus] = js.undefined,
        AdvancedSecurityOptions: js.UndefOr[AdvancedSecurityOptionsStatus] = js.undefined,
        CognitoOptions: js.UndefOr[CognitoOptionsStatus] = js.undefined,
        DomainEndpointOptions: js.UndefOr[DomainEndpointOptionsStatus] = js.undefined,
        EBSOptions: js.UndefOr[EBSOptionsStatus] = js.undefined,
        ElasticsearchClusterConfig: js.UndefOr[ElasticsearchClusterConfigStatus] = js.undefined,
        ElasticsearchVersion: js.UndefOr[ElasticsearchVersionStatus] = js.undefined,
        EncryptionAtRestOptions: js.UndefOr[EncryptionAtRestOptionsStatus] = js.undefined,
        LogPublishingOptions: js.UndefOr[LogPublishingOptionsStatus] = js.undefined,
        NodeToNodeEncryptionOptions: js.UndefOr[NodeToNodeEncryptionOptionsStatus] = js.undefined,
        SnapshotOptions: js.UndefOr[SnapshotOptionsStatus] = js.undefined,
        VPCOptions: js.UndefOr[VPCDerivedInfoStatus] = js.undefined
    ): ElasticsearchDomainConfig = {
      val __obj = js.Dynamic.literal()
      AccessPolicies.foreach(__v => __obj.updateDynamic("AccessPolicies")(__v.asInstanceOf[js.Any]))
      AdvancedOptions.foreach(__v => __obj.updateDynamic("AdvancedOptions")(__v.asInstanceOf[js.Any]))
      AdvancedSecurityOptions.foreach(__v => __obj.updateDynamic("AdvancedSecurityOptions")(__v.asInstanceOf[js.Any]))
      CognitoOptions.foreach(__v => __obj.updateDynamic("CognitoOptions")(__v.asInstanceOf[js.Any]))
      DomainEndpointOptions.foreach(__v => __obj.updateDynamic("DomainEndpointOptions")(__v.asInstanceOf[js.Any]))
      EBSOptions.foreach(__v => __obj.updateDynamic("EBSOptions")(__v.asInstanceOf[js.Any]))
      ElasticsearchClusterConfig.foreach(__v =>
        __obj.updateDynamic("ElasticsearchClusterConfig")(__v.asInstanceOf[js.Any])
      )
      ElasticsearchVersion.foreach(__v => __obj.updateDynamic("ElasticsearchVersion")(__v.asInstanceOf[js.Any]))
      EncryptionAtRestOptions.foreach(__v => __obj.updateDynamic("EncryptionAtRestOptions")(__v.asInstanceOf[js.Any]))
      LogPublishingOptions.foreach(__v => __obj.updateDynamic("LogPublishingOptions")(__v.asInstanceOf[js.Any]))
      NodeToNodeEncryptionOptions.foreach(__v =>
        __obj.updateDynamic("NodeToNodeEncryptionOptions")(__v.asInstanceOf[js.Any])
      )
      SnapshotOptions.foreach(__v => __obj.updateDynamic("SnapshotOptions")(__v.asInstanceOf[js.Any]))
      VPCOptions.foreach(__v => __obj.updateDynamic("VPCOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ElasticsearchDomainConfig]
    }
  }

  /**
    * The current status of an Elasticsearch domain.
    */
  @js.native
  trait ElasticsearchDomainStatus extends js.Object {
    var ARN: ARN
    var DomainId: DomainId
    var DomainName: DomainName
    var ElasticsearchClusterConfig: ElasticsearchClusterConfig
    var AccessPolicies: js.UndefOr[PolicyDocument]
    var AdvancedOptions: js.UndefOr[AdvancedOptions]
    var AdvancedSecurityOptions: js.UndefOr[AdvancedSecurityOptions]
    var CognitoOptions: js.UndefOr[CognitoOptions]
    var Created: js.UndefOr[Boolean]
    var Deleted: js.UndefOr[Boolean]
    var DomainEndpointOptions: js.UndefOr[DomainEndpointOptions]
    var EBSOptions: js.UndefOr[EBSOptions]
    var ElasticsearchVersion: js.UndefOr[ElasticsearchVersionString]
    var EncryptionAtRestOptions: js.UndefOr[EncryptionAtRestOptions]
    var Endpoint: js.UndefOr[ServiceUrl]
    var Endpoints: js.UndefOr[EndpointsMap]
    var LogPublishingOptions: js.UndefOr[LogPublishingOptions]
    var NodeToNodeEncryptionOptions: js.UndefOr[NodeToNodeEncryptionOptions]
    var Processing: js.UndefOr[Boolean]
    var ServiceSoftwareOptions: js.UndefOr[ServiceSoftwareOptions]
    var SnapshotOptions: js.UndefOr[SnapshotOptions]
    var UpgradeProcessing: js.UndefOr[Boolean]
    var VPCOptions: js.UndefOr[VPCDerivedInfo]
  }

  object ElasticsearchDomainStatus {
    @inline
    def apply(
        ARN: ARN,
        DomainId: DomainId,
        DomainName: DomainName,
        ElasticsearchClusterConfig: ElasticsearchClusterConfig,
        AccessPolicies: js.UndefOr[PolicyDocument] = js.undefined,
        AdvancedOptions: js.UndefOr[AdvancedOptions] = js.undefined,
        AdvancedSecurityOptions: js.UndefOr[AdvancedSecurityOptions] = js.undefined,
        CognitoOptions: js.UndefOr[CognitoOptions] = js.undefined,
        Created: js.UndefOr[Boolean] = js.undefined,
        Deleted: js.UndefOr[Boolean] = js.undefined,
        DomainEndpointOptions: js.UndefOr[DomainEndpointOptions] = js.undefined,
        EBSOptions: js.UndefOr[EBSOptions] = js.undefined,
        ElasticsearchVersion: js.UndefOr[ElasticsearchVersionString] = js.undefined,
        EncryptionAtRestOptions: js.UndefOr[EncryptionAtRestOptions] = js.undefined,
        Endpoint: js.UndefOr[ServiceUrl] = js.undefined,
        Endpoints: js.UndefOr[EndpointsMap] = js.undefined,
        LogPublishingOptions: js.UndefOr[LogPublishingOptions] = js.undefined,
        NodeToNodeEncryptionOptions: js.UndefOr[NodeToNodeEncryptionOptions] = js.undefined,
        Processing: js.UndefOr[Boolean] = js.undefined,
        ServiceSoftwareOptions: js.UndefOr[ServiceSoftwareOptions] = js.undefined,
        SnapshotOptions: js.UndefOr[SnapshotOptions] = js.undefined,
        UpgradeProcessing: js.UndefOr[Boolean] = js.undefined,
        VPCOptions: js.UndefOr[VPCDerivedInfo] = js.undefined
    ): ElasticsearchDomainStatus = {
      val __obj = js.Dynamic.literal(
        "ARN" -> ARN.asInstanceOf[js.Any],
        "DomainId" -> DomainId.asInstanceOf[js.Any],
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "ElasticsearchClusterConfig" -> ElasticsearchClusterConfig.asInstanceOf[js.Any]
      )

      AccessPolicies.foreach(__v => __obj.updateDynamic("AccessPolicies")(__v.asInstanceOf[js.Any]))
      AdvancedOptions.foreach(__v => __obj.updateDynamic("AdvancedOptions")(__v.asInstanceOf[js.Any]))
      AdvancedSecurityOptions.foreach(__v => __obj.updateDynamic("AdvancedSecurityOptions")(__v.asInstanceOf[js.Any]))
      CognitoOptions.foreach(__v => __obj.updateDynamic("CognitoOptions")(__v.asInstanceOf[js.Any]))
      Created.foreach(__v => __obj.updateDynamic("Created")(__v.asInstanceOf[js.Any]))
      Deleted.foreach(__v => __obj.updateDynamic("Deleted")(__v.asInstanceOf[js.Any]))
      DomainEndpointOptions.foreach(__v => __obj.updateDynamic("DomainEndpointOptions")(__v.asInstanceOf[js.Any]))
      EBSOptions.foreach(__v => __obj.updateDynamic("EBSOptions")(__v.asInstanceOf[js.Any]))
      ElasticsearchVersion.foreach(__v => __obj.updateDynamic("ElasticsearchVersion")(__v.asInstanceOf[js.Any]))
      EncryptionAtRestOptions.foreach(__v => __obj.updateDynamic("EncryptionAtRestOptions")(__v.asInstanceOf[js.Any]))
      Endpoint.foreach(__v => __obj.updateDynamic("Endpoint")(__v.asInstanceOf[js.Any]))
      Endpoints.foreach(__v => __obj.updateDynamic("Endpoints")(__v.asInstanceOf[js.Any]))
      LogPublishingOptions.foreach(__v => __obj.updateDynamic("LogPublishingOptions")(__v.asInstanceOf[js.Any]))
      NodeToNodeEncryptionOptions.foreach(__v =>
        __obj.updateDynamic("NodeToNodeEncryptionOptions")(__v.asInstanceOf[js.Any])
      )
      Processing.foreach(__v => __obj.updateDynamic("Processing")(__v.asInstanceOf[js.Any]))
      ServiceSoftwareOptions.foreach(__v => __obj.updateDynamic("ServiceSoftwareOptions")(__v.asInstanceOf[js.Any]))
      SnapshotOptions.foreach(__v => __obj.updateDynamic("SnapshotOptions")(__v.asInstanceOf[js.Any]))
      UpgradeProcessing.foreach(__v => __obj.updateDynamic("UpgradeProcessing")(__v.asInstanceOf[js.Any]))
      VPCOptions.foreach(__v => __obj.updateDynamic("VPCOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ElasticsearchDomainStatus]
    }
  }

  /**
    * Status of the Elasticsearch version options for the specified Elasticsearch domain.
    */
  @js.native
  trait ElasticsearchVersionStatus extends js.Object {
    var Options: ElasticsearchVersionString
    var Status: OptionStatus
  }

  object ElasticsearchVersionStatus {
    @inline
    def apply(
        Options: ElasticsearchVersionString,
        Status: OptionStatus
    ): ElasticsearchVersionStatus = {
      val __obj = js.Dynamic.literal(
        "Options" -> Options.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ElasticsearchVersionStatus]
    }
  }

  /**
    * Specifies the Encryption At Rest Options.
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

  /**
    * Status of the Encryption At Rest options for the specified Elasticsearch domain.
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

  /**
    * A filter used to limit results when describing inbound or outbound cross-cluster search connections. Multiple values can be specified per filter. A cross-cluster search connection must match at least one of the specified values for it to be returned from an operation.
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

  /**
    * Container for request parameters to <code> <a>GetCompatibleElasticsearchVersions</a> </code> operation.
    */
  @js.native
  trait GetCompatibleElasticsearchVersionsRequest extends js.Object {
    var DomainName: js.UndefOr[DomainName]
  }

  object GetCompatibleElasticsearchVersionsRequest {
    @inline
    def apply(
        DomainName: js.UndefOr[DomainName] = js.undefined
    ): GetCompatibleElasticsearchVersionsRequest = {
      val __obj = js.Dynamic.literal()
      DomainName.foreach(__v => __obj.updateDynamic("DomainName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCompatibleElasticsearchVersionsRequest]
    }
  }

  /**
    * Container for response returned by <code> <a>GetCompatibleElasticsearchVersions</a> </code> operation.
    */
  @js.native
  trait GetCompatibleElasticsearchVersionsResponse extends js.Object {
    var CompatibleElasticsearchVersions: js.UndefOr[CompatibleElasticsearchVersionsList]
  }

  object GetCompatibleElasticsearchVersionsResponse {
    @inline
    def apply(
        CompatibleElasticsearchVersions: js.UndefOr[CompatibleElasticsearchVersionsList] = js.undefined
    ): GetCompatibleElasticsearchVersionsResponse = {
      val __obj = js.Dynamic.literal()
      CompatibleElasticsearchVersions.foreach(__v =>
        __obj.updateDynamic("CompatibleElasticsearchVersions")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[GetCompatibleElasticsearchVersionsResponse]
    }
  }

  /**
    * Container for request parameters to <code> <a>GetUpgradeHistory</a> </code> operation.
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

  /**
    * Container for response returned by <code> <a>GetUpgradeHistory</a> </code> operation.
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

  /**
    * Container for request parameters to <code> <a>GetUpgradeStatus</a> </code> operation.
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

  /**
    * Container for response returned by <code> <a>GetUpgradeStatus</a> </code> operation.
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

  /**
    * Specifies details of an inbound connection.
    */
  @js.native
  trait InboundCrossClusterSearchConnection extends js.Object {
    var ConnectionStatus: js.UndefOr[InboundCrossClusterSearchConnectionStatus]
    var CrossClusterSearchConnectionId: js.UndefOr[CrossClusterSearchConnectionId]
    var DestinationDomainInfo: js.UndefOr[DomainInformation]
    var SourceDomainInfo: js.UndefOr[DomainInformation]
  }

  object InboundCrossClusterSearchConnection {
    @inline
    def apply(
        ConnectionStatus: js.UndefOr[InboundCrossClusterSearchConnectionStatus] = js.undefined,
        CrossClusterSearchConnectionId: js.UndefOr[CrossClusterSearchConnectionId] = js.undefined,
        DestinationDomainInfo: js.UndefOr[DomainInformation] = js.undefined,
        SourceDomainInfo: js.UndefOr[DomainInformation] = js.undefined
    ): InboundCrossClusterSearchConnection = {
      val __obj = js.Dynamic.literal()
      ConnectionStatus.foreach(__v => __obj.updateDynamic("ConnectionStatus")(__v.asInstanceOf[js.Any]))
      CrossClusterSearchConnectionId.foreach(__v =>
        __obj.updateDynamic("CrossClusterSearchConnectionId")(__v.asInstanceOf[js.Any])
      )
      DestinationDomainInfo.foreach(__v => __obj.updateDynamic("DestinationDomainInfo")(__v.asInstanceOf[js.Any]))
      SourceDomainInfo.foreach(__v => __obj.updateDynamic("SourceDomainInfo")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InboundCrossClusterSearchConnection]
    }
  }

  /**
    * Specifies the coonection status of an inbound cross-cluster search connection.
    */
  @js.native
  trait InboundCrossClusterSearchConnectionStatus extends js.Object {
    var Message: js.UndefOr[CrossClusterSearchConnectionStatusMessage]
    var StatusCode: js.UndefOr[InboundCrossClusterSearchConnectionStatusCode]
  }

  object InboundCrossClusterSearchConnectionStatus {
    @inline
    def apply(
        Message: js.UndefOr[CrossClusterSearchConnectionStatusMessage] = js.undefined,
        StatusCode: js.UndefOr[InboundCrossClusterSearchConnectionStatusCode] = js.undefined
    ): InboundCrossClusterSearchConnectionStatus = {
      val __obj = js.Dynamic.literal()
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      StatusCode.foreach(__v => __obj.updateDynamic("StatusCode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InboundCrossClusterSearchConnectionStatus]
    }
  }

  @js.native
  sealed trait InboundCrossClusterSearchConnectionStatusCode extends js.Any
  object InboundCrossClusterSearchConnectionStatusCode extends js.Object {
    val PENDING_ACCEPTANCE = "PENDING_ACCEPTANCE".asInstanceOf[InboundCrossClusterSearchConnectionStatusCode]
    val APPROVED = "APPROVED".asInstanceOf[InboundCrossClusterSearchConnectionStatusCode]
    val REJECTING = "REJECTING".asInstanceOf[InboundCrossClusterSearchConnectionStatusCode]
    val REJECTED = "REJECTED".asInstanceOf[InboundCrossClusterSearchConnectionStatusCode]
    val DELETING = "DELETING".asInstanceOf[InboundCrossClusterSearchConnectionStatusCode]
    val DELETED = "DELETED".asInstanceOf[InboundCrossClusterSearchConnectionStatusCode]

    val values = js.Object.freeze(js.Array(PENDING_ACCEPTANCE, APPROVED, REJECTING, REJECTED, DELETING, DELETED))
  }

  /**
    * InstanceCountLimits represents the limits on number of instances that be created in Amazon Elasticsearch for given InstanceType.
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

  /**
    * InstanceLimits represents the list of instance related attributes that are available for given InstanceType.
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

  /**
    * Limits for given InstanceType and for each of it's role. <br/> Limits contains following <code> <a>StorageTypes,</a> </code> <code> <a>InstanceLimits</a> </code> and <code> <a>AdditionalLimits</a> </code>
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

  /**
    * The result of a <code>ListDomainNames</code> operation. Contains the names of all Elasticsearch domains owned by this account.
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

  /**
    * Container for request parameters to <code> <a>ListDomainsForPackage</a> </code> operation.
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

  /**
    * Container for response parameters to <code> <a>ListDomainsForPackage</a> </code> operation.
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

  /**
    * Container for the parameters to the <code> <a>ListElasticsearchInstanceTypes</a> </code> operation.
    */
  @js.native
  trait ListElasticsearchInstanceTypesRequest extends js.Object {
    var ElasticsearchVersion: ElasticsearchVersionString
    var DomainName: js.UndefOr[DomainName]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListElasticsearchInstanceTypesRequest {
    @inline
    def apply(
        ElasticsearchVersion: ElasticsearchVersionString,
        DomainName: js.UndefOr[DomainName] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListElasticsearchInstanceTypesRequest = {
      val __obj = js.Dynamic.literal(
        "ElasticsearchVersion" -> ElasticsearchVersion.asInstanceOf[js.Any]
      )

      DomainName.foreach(__v => __obj.updateDynamic("DomainName")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListElasticsearchInstanceTypesRequest]
    }
  }

  /**
    * Container for the parameters returned by <code> <a>ListElasticsearchInstanceTypes</a> </code> operation.
    */
  @js.native
  trait ListElasticsearchInstanceTypesResponse extends js.Object {
    var ElasticsearchInstanceTypes: js.UndefOr[ElasticsearchInstanceTypeList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListElasticsearchInstanceTypesResponse {
    @inline
    def apply(
        ElasticsearchInstanceTypes: js.UndefOr[ElasticsearchInstanceTypeList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListElasticsearchInstanceTypesResponse = {
      val __obj = js.Dynamic.literal()
      ElasticsearchInstanceTypes.foreach(__v =>
        __obj.updateDynamic("ElasticsearchInstanceTypes")(__v.asInstanceOf[js.Any])
      )
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListElasticsearchInstanceTypesResponse]
    }
  }

  /**
    * Container for the parameters to the <code> <a>ListElasticsearchVersions</a> </code> operation. <p> Use <code> <a>MaxResults</a> </code> to control the maximum number of results to retrieve in a single call.
    *  Use <code> <a>NextToken</a> </code> in response to retrieve more results. If the received response does not contain a NextToken, then there are no more results to retrieve.
    *  </p>
    */
  @js.native
  trait ListElasticsearchVersionsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListElasticsearchVersionsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListElasticsearchVersionsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListElasticsearchVersionsRequest]
    }
  }

  /**
    * Container for the parameters for response received from <code> <a>ListElasticsearchVersions</a> </code> operation.
    */
  @js.native
  trait ListElasticsearchVersionsResponse extends js.Object {
    var ElasticsearchVersions: js.UndefOr[ElasticsearchVersionList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListElasticsearchVersionsResponse {
    @inline
    def apply(
        ElasticsearchVersions: js.UndefOr[ElasticsearchVersionList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListElasticsearchVersionsResponse = {
      val __obj = js.Dynamic.literal()
      ElasticsearchVersions.foreach(__v => __obj.updateDynamic("ElasticsearchVersions")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListElasticsearchVersionsResponse]
    }
  }

  /**
    * Container for request parameters to <code> <a>ListPackagesForDomain</a> </code> operation.
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

  /**
    * Container for response parameters to <code> <a>ListPackagesForDomain</a> </code> operation.
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

  /**
    * Container for the parameters to the <code><a>ListTags</a></code> operation. Specify the <code>ARN</code> for the Elasticsearch domain to which the tags are attached that you want to view are attached.
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

  /**
    * The result of a <code>ListTags</code> operation. Contains tags for all requested Elasticsearch domains.
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

  /**
    * <p>Log Publishing option that is set for given domain. <br/>Attributes and their details:* CloudWatchLogsLogGroupArn: ARN of the Cloudwatch log group to which log needs to be published.
    *  * Enabled: Whether the log publishing for given log type is enabled or not
    * </p>
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
      CloudWatchLogsLogGroupArn.foreach(__v =>
        __obj.updateDynamic("CloudWatchLogsLogGroupArn")(__v.asInstanceOf[js.Any])
      )
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LogPublishingOption]
    }
  }

  /**
    * The configured log publishing options for the domain and their current status.
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

  /**
    * <p>Type of Log File, it can be one of the following:* INDEX_SLOW_LOGS: Index slow logs contain insert requests that took more time than configured index query log threshold to execute.
    *  * SEARCH_SLOW_LOGS: Search slow logs contain search queries that took more time than configured search query log threshold to execute.
    *  * ES_APPLICATION_LOGS: Elasticsearch application logs contain information about errors and warnings raised during the operation of the service and can be useful for troubleshooting.
    * </p>
    */
  @js.native
  sealed trait LogType extends js.Any
  object LogType extends js.Object {
    val INDEX_SLOW_LOGS = "INDEX_SLOW_LOGS".asInstanceOf[LogType]
    val SEARCH_SLOW_LOGS = "SEARCH_SLOW_LOGS".asInstanceOf[LogType]
    val ES_APPLICATION_LOGS = "ES_APPLICATION_LOGS".asInstanceOf[LogType]

    val values = js.Object.freeze(js.Array(INDEX_SLOW_LOGS, SEARCH_SLOW_LOGS, ES_APPLICATION_LOGS))
  }

  /**
    * Credentials for the master user: username and password, ARN, or both.
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

  /**
    * Specifies the node-to-node encryption options.
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

  /**
    * Status of the node-to-node encryption options for the specified Elasticsearch domain.
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

  /**
    * The state of a requested change. One of the following:
    * * Processing: The request change is still in-process.
    *  * Active: The request change is processed and deployed to the Elasticsearch domain.
    */
  @js.native
  sealed trait OptionState extends js.Any
  object OptionState extends js.Object {
    val RequiresIndexDocuments = "RequiresIndexDocuments".asInstanceOf[OptionState]
    val Processing = "Processing".asInstanceOf[OptionState]
    val Active = "Active".asInstanceOf[OptionState]

    val values = js.Object.freeze(js.Array(RequiresIndexDocuments, Processing, Active))
  }

  /**
    * Provides the current status of the entity.
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

  /**
    * Specifies details of an outbound connection.
    */
  @js.native
  trait OutboundCrossClusterSearchConnection extends js.Object {
    var ConnectionAlias: js.UndefOr[ConnectionAlias]
    var ConnectionStatus: js.UndefOr[OutboundCrossClusterSearchConnectionStatus]
    var CrossClusterSearchConnectionId: js.UndefOr[CrossClusterSearchConnectionId]
    var DestinationDomainInfo: js.UndefOr[DomainInformation]
    var SourceDomainInfo: js.UndefOr[DomainInformation]
  }

  object OutboundCrossClusterSearchConnection {
    @inline
    def apply(
        ConnectionAlias: js.UndefOr[ConnectionAlias] = js.undefined,
        ConnectionStatus: js.UndefOr[OutboundCrossClusterSearchConnectionStatus] = js.undefined,
        CrossClusterSearchConnectionId: js.UndefOr[CrossClusterSearchConnectionId] = js.undefined,
        DestinationDomainInfo: js.UndefOr[DomainInformation] = js.undefined,
        SourceDomainInfo: js.UndefOr[DomainInformation] = js.undefined
    ): OutboundCrossClusterSearchConnection = {
      val __obj = js.Dynamic.literal()
      ConnectionAlias.foreach(__v => __obj.updateDynamic("ConnectionAlias")(__v.asInstanceOf[js.Any]))
      ConnectionStatus.foreach(__v => __obj.updateDynamic("ConnectionStatus")(__v.asInstanceOf[js.Any]))
      CrossClusterSearchConnectionId.foreach(__v =>
        __obj.updateDynamic("CrossClusterSearchConnectionId")(__v.asInstanceOf[js.Any])
      )
      DestinationDomainInfo.foreach(__v => __obj.updateDynamic("DestinationDomainInfo")(__v.asInstanceOf[js.Any]))
      SourceDomainInfo.foreach(__v => __obj.updateDynamic("SourceDomainInfo")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OutboundCrossClusterSearchConnection]
    }
  }

  /**
    * Specifies the connection status of an outbound cross-cluster search connection.
    */
  @js.native
  trait OutboundCrossClusterSearchConnectionStatus extends js.Object {
    var Message: js.UndefOr[CrossClusterSearchConnectionStatusMessage]
    var StatusCode: js.UndefOr[OutboundCrossClusterSearchConnectionStatusCode]
  }

  object OutboundCrossClusterSearchConnectionStatus {
    @inline
    def apply(
        Message: js.UndefOr[CrossClusterSearchConnectionStatusMessage] = js.undefined,
        StatusCode: js.UndefOr[OutboundCrossClusterSearchConnectionStatusCode] = js.undefined
    ): OutboundCrossClusterSearchConnectionStatus = {
      val __obj = js.Dynamic.literal()
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      StatusCode.foreach(__v => __obj.updateDynamic("StatusCode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OutboundCrossClusterSearchConnectionStatus]
    }
  }

  @js.native
  sealed trait OutboundCrossClusterSearchConnectionStatusCode extends js.Any
  object OutboundCrossClusterSearchConnectionStatusCode extends js.Object {
    val PENDING_ACCEPTANCE = "PENDING_ACCEPTANCE".asInstanceOf[OutboundCrossClusterSearchConnectionStatusCode]
    val VALIDATING = "VALIDATING".asInstanceOf[OutboundCrossClusterSearchConnectionStatusCode]
    val VALIDATION_FAILED = "VALIDATION_FAILED".asInstanceOf[OutboundCrossClusterSearchConnectionStatusCode]
    val PROVISIONING = "PROVISIONING".asInstanceOf[OutboundCrossClusterSearchConnectionStatusCode]
    val ACTIVE = "ACTIVE".asInstanceOf[OutboundCrossClusterSearchConnectionStatusCode]
    val REJECTED = "REJECTED".asInstanceOf[OutboundCrossClusterSearchConnectionStatusCode]
    val DELETING = "DELETING".asInstanceOf[OutboundCrossClusterSearchConnectionStatusCode]
    val DELETED = "DELETED".asInstanceOf[OutboundCrossClusterSearchConnectionStatusCode]

    val values = js.Object.freeze(
      js.Array(PENDING_ACCEPTANCE, VALIDATING, VALIDATION_FAILED, PROVISIONING, ACTIVE, REJECTED, DELETING, DELETED)
    )
  }

  /**
    * Basic information about a package.
    */
  @js.native
  trait PackageDetails extends js.Object {
    var CreatedAt: js.UndefOr[CreatedAt]
    var ErrorDetails: js.UndefOr[ErrorDetails]
    var PackageDescription: js.UndefOr[PackageDescription]
    var PackageID: js.UndefOr[PackageID]
    var PackageName: js.UndefOr[PackageName]
    var PackageStatus: js.UndefOr[PackageStatus]
    var PackageType: js.UndefOr[PackageType]
  }

  object PackageDetails {
    @inline
    def apply(
        CreatedAt: js.UndefOr[CreatedAt] = js.undefined,
        ErrorDetails: js.UndefOr[ErrorDetails] = js.undefined,
        PackageDescription: js.UndefOr[PackageDescription] = js.undefined,
        PackageID: js.UndefOr[PackageID] = js.undefined,
        PackageName: js.UndefOr[PackageName] = js.undefined,
        PackageStatus: js.UndefOr[PackageStatus] = js.undefined,
        PackageType: js.UndefOr[PackageType] = js.undefined
    ): PackageDetails = {
      val __obj = js.Dynamic.literal()
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      ErrorDetails.foreach(__v => __obj.updateDynamic("ErrorDetails")(__v.asInstanceOf[js.Any]))
      PackageDescription.foreach(__v => __obj.updateDynamic("PackageDescription")(__v.asInstanceOf[js.Any]))
      PackageID.foreach(__v => __obj.updateDynamic("PackageID")(__v.asInstanceOf[js.Any]))
      PackageName.foreach(__v => __obj.updateDynamic("PackageName")(__v.asInstanceOf[js.Any]))
      PackageStatus.foreach(__v => __obj.updateDynamic("PackageStatus")(__v.asInstanceOf[js.Any]))
      PackageType.foreach(__v => __obj.updateDynamic("PackageType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PackageDetails]
    }
  }

  /**
    * The S3 location for importing the package specified as <code>S3BucketName</code> and <code>S3Key</code>
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

  @js.native
  sealed trait PackageStatus extends js.Any
  object PackageStatus extends js.Object {
    val COPYING = "COPYING".asInstanceOf[PackageStatus]
    val COPY_FAILED = "COPY_FAILED".asInstanceOf[PackageStatus]
    val VALIDATING = "VALIDATING".asInstanceOf[PackageStatus]
    val VALIDATION_FAILED = "VALIDATION_FAILED".asInstanceOf[PackageStatus]
    val AVAILABLE = "AVAILABLE".asInstanceOf[PackageStatus]
    val DELETING = "DELETING".asInstanceOf[PackageStatus]
    val DELETED = "DELETED".asInstanceOf[PackageStatus]
    val DELETE_FAILED = "DELETE_FAILED".asInstanceOf[PackageStatus]

    val values = js.Object.freeze(
      js.Array(COPYING, COPY_FAILED, VALIDATING, VALIDATION_FAILED, AVAILABLE, DELETING, DELETED, DELETE_FAILED)
    )
  }

  @js.native
  sealed trait PackageType extends js.Any
  object PackageType extends js.Object {
    val `TXT-DICTIONARY` = "TXT-DICTIONARY".asInstanceOf[PackageType]

    val values = js.Object.freeze(js.Array(`TXT-DICTIONARY`))
  }

  /**
    * Container for parameters to <code>PurchaseReservedElasticsearchInstanceOffering</code>
    */
  @js.native
  trait PurchaseReservedElasticsearchInstanceOfferingRequest extends js.Object {
    var ReservationName: ReservationToken
    var ReservedElasticsearchInstanceOfferingId: GUID
    var InstanceCount: js.UndefOr[InstanceCount]
  }

  object PurchaseReservedElasticsearchInstanceOfferingRequest {
    @inline
    def apply(
        ReservationName: ReservationToken,
        ReservedElasticsearchInstanceOfferingId: GUID,
        InstanceCount: js.UndefOr[InstanceCount] = js.undefined
    ): PurchaseReservedElasticsearchInstanceOfferingRequest = {
      val __obj = js.Dynamic.literal(
        "ReservationName" -> ReservationName.asInstanceOf[js.Any],
        "ReservedElasticsearchInstanceOfferingId" -> ReservedElasticsearchInstanceOfferingId.asInstanceOf[js.Any]
      )

      InstanceCount.foreach(__v => __obj.updateDynamic("InstanceCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PurchaseReservedElasticsearchInstanceOfferingRequest]
    }
  }

  /**
    * Represents the output of a <code>PurchaseReservedElasticsearchInstanceOffering</code> operation.
    */
  @js.native
  trait PurchaseReservedElasticsearchInstanceOfferingResponse extends js.Object {
    var ReservationName: js.UndefOr[ReservationToken]
    var ReservedElasticsearchInstanceId: js.UndefOr[GUID]
  }

  object PurchaseReservedElasticsearchInstanceOfferingResponse {
    @inline
    def apply(
        ReservationName: js.UndefOr[ReservationToken] = js.undefined,
        ReservedElasticsearchInstanceId: js.UndefOr[GUID] = js.undefined
    ): PurchaseReservedElasticsearchInstanceOfferingResponse = {
      val __obj = js.Dynamic.literal()
      ReservationName.foreach(__v => __obj.updateDynamic("ReservationName")(__v.asInstanceOf[js.Any]))
      ReservedElasticsearchInstanceId.foreach(__v =>
        __obj.updateDynamic("ReservedElasticsearchInstanceId")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[PurchaseReservedElasticsearchInstanceOfferingResponse]
    }
  }

  /**
    * Contains the specific price and frequency of a recurring charges for a reserved Elasticsearch instance, or for a reserved Elasticsearch instance offering.
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

  /**
    * Container for the parameters to the <code><a>RejectInboundCrossClusterSearchConnection</a></code> operation.
    */
  @js.native
  trait RejectInboundCrossClusterSearchConnectionRequest extends js.Object {
    var CrossClusterSearchConnectionId: CrossClusterSearchConnectionId
  }

  object RejectInboundCrossClusterSearchConnectionRequest {
    @inline
    def apply(
        CrossClusterSearchConnectionId: CrossClusterSearchConnectionId
    ): RejectInboundCrossClusterSearchConnectionRequest = {
      val __obj = js.Dynamic.literal(
        "CrossClusterSearchConnectionId" -> CrossClusterSearchConnectionId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RejectInboundCrossClusterSearchConnectionRequest]
    }
  }

  /**
    * The result of a <code><a>RejectInboundCrossClusterSearchConnection</a></code> operation. Contains details of rejected inbound connection.
    */
  @js.native
  trait RejectInboundCrossClusterSearchConnectionResponse extends js.Object {
    var CrossClusterSearchConnection: js.UndefOr[InboundCrossClusterSearchConnection]
  }

  object RejectInboundCrossClusterSearchConnectionResponse {
    @inline
    def apply(
        CrossClusterSearchConnection: js.UndefOr[InboundCrossClusterSearchConnection] = js.undefined
    ): RejectInboundCrossClusterSearchConnectionResponse = {
      val __obj = js.Dynamic.literal()
      CrossClusterSearchConnection.foreach(__v =>
        __obj.updateDynamic("CrossClusterSearchConnection")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[RejectInboundCrossClusterSearchConnectionResponse]
    }
  }

  /**
    * Container for the parameters to the <code><a>RemoveTags</a></code> operation. Specify the <code>ARN</code> for the Elasticsearch domain from which you want to remove the specified <code>TagKey</code>.
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

  /**
    * Details of a reserved Elasticsearch instance.
    */
  @js.native
  trait ReservedElasticsearchInstance extends js.Object {
    var CurrencyCode: js.UndefOr[String]
    var Duration: js.UndefOr[Int]
    var ElasticsearchInstanceCount: js.UndefOr[Int]
    var ElasticsearchInstanceType: js.UndefOr[ESPartitionInstanceType]
    var FixedPrice: js.UndefOr[Double]
    var PaymentOption: js.UndefOr[ReservedElasticsearchInstancePaymentOption]
    var RecurringCharges: js.UndefOr[RecurringChargeList]
    var ReservationName: js.UndefOr[ReservationToken]
    var ReservedElasticsearchInstanceId: js.UndefOr[GUID]
    var ReservedElasticsearchInstanceOfferingId: js.UndefOr[String]
    var StartTime: js.UndefOr[UpdateTimestamp]
    var State: js.UndefOr[String]
    var UsagePrice: js.UndefOr[Double]
  }

  object ReservedElasticsearchInstance {
    @inline
    def apply(
        CurrencyCode: js.UndefOr[String] = js.undefined,
        Duration: js.UndefOr[Int] = js.undefined,
        ElasticsearchInstanceCount: js.UndefOr[Int] = js.undefined,
        ElasticsearchInstanceType: js.UndefOr[ESPartitionInstanceType] = js.undefined,
        FixedPrice: js.UndefOr[Double] = js.undefined,
        PaymentOption: js.UndefOr[ReservedElasticsearchInstancePaymentOption] = js.undefined,
        RecurringCharges: js.UndefOr[RecurringChargeList] = js.undefined,
        ReservationName: js.UndefOr[ReservationToken] = js.undefined,
        ReservedElasticsearchInstanceId: js.UndefOr[GUID] = js.undefined,
        ReservedElasticsearchInstanceOfferingId: js.UndefOr[String] = js.undefined,
        StartTime: js.UndefOr[UpdateTimestamp] = js.undefined,
        State: js.UndefOr[String] = js.undefined,
        UsagePrice: js.UndefOr[Double] = js.undefined
    ): ReservedElasticsearchInstance = {
      val __obj = js.Dynamic.literal()
      CurrencyCode.foreach(__v => __obj.updateDynamic("CurrencyCode")(__v.asInstanceOf[js.Any]))
      Duration.foreach(__v => __obj.updateDynamic("Duration")(__v.asInstanceOf[js.Any]))
      ElasticsearchInstanceCount.foreach(__v =>
        __obj.updateDynamic("ElasticsearchInstanceCount")(__v.asInstanceOf[js.Any])
      )
      ElasticsearchInstanceType.foreach(__v =>
        __obj.updateDynamic("ElasticsearchInstanceType")(__v.asInstanceOf[js.Any])
      )
      FixedPrice.foreach(__v => __obj.updateDynamic("FixedPrice")(__v.asInstanceOf[js.Any]))
      PaymentOption.foreach(__v => __obj.updateDynamic("PaymentOption")(__v.asInstanceOf[js.Any]))
      RecurringCharges.foreach(__v => __obj.updateDynamic("RecurringCharges")(__v.asInstanceOf[js.Any]))
      ReservationName.foreach(__v => __obj.updateDynamic("ReservationName")(__v.asInstanceOf[js.Any]))
      ReservedElasticsearchInstanceId.foreach(__v =>
        __obj.updateDynamic("ReservedElasticsearchInstanceId")(__v.asInstanceOf[js.Any])
      )
      ReservedElasticsearchInstanceOfferingId.foreach(__v =>
        __obj.updateDynamic("ReservedElasticsearchInstanceOfferingId")(__v.asInstanceOf[js.Any])
      )
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      UsagePrice.foreach(__v => __obj.updateDynamic("UsagePrice")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReservedElasticsearchInstance]
    }
  }

  /**
    * Details of a reserved Elasticsearch instance offering.
    */
  @js.native
  trait ReservedElasticsearchInstanceOffering extends js.Object {
    var CurrencyCode: js.UndefOr[String]
    var Duration: js.UndefOr[Int]
    var ElasticsearchInstanceType: js.UndefOr[ESPartitionInstanceType]
    var FixedPrice: js.UndefOr[Double]
    var PaymentOption: js.UndefOr[ReservedElasticsearchInstancePaymentOption]
    var RecurringCharges: js.UndefOr[RecurringChargeList]
    var ReservedElasticsearchInstanceOfferingId: js.UndefOr[GUID]
    var UsagePrice: js.UndefOr[Double]
  }

  object ReservedElasticsearchInstanceOffering {
    @inline
    def apply(
        CurrencyCode: js.UndefOr[String] = js.undefined,
        Duration: js.UndefOr[Int] = js.undefined,
        ElasticsearchInstanceType: js.UndefOr[ESPartitionInstanceType] = js.undefined,
        FixedPrice: js.UndefOr[Double] = js.undefined,
        PaymentOption: js.UndefOr[ReservedElasticsearchInstancePaymentOption] = js.undefined,
        RecurringCharges: js.UndefOr[RecurringChargeList] = js.undefined,
        ReservedElasticsearchInstanceOfferingId: js.UndefOr[GUID] = js.undefined,
        UsagePrice: js.UndefOr[Double] = js.undefined
    ): ReservedElasticsearchInstanceOffering = {
      val __obj = js.Dynamic.literal()
      CurrencyCode.foreach(__v => __obj.updateDynamic("CurrencyCode")(__v.asInstanceOf[js.Any]))
      Duration.foreach(__v => __obj.updateDynamic("Duration")(__v.asInstanceOf[js.Any]))
      ElasticsearchInstanceType.foreach(__v =>
        __obj.updateDynamic("ElasticsearchInstanceType")(__v.asInstanceOf[js.Any])
      )
      FixedPrice.foreach(__v => __obj.updateDynamic("FixedPrice")(__v.asInstanceOf[js.Any]))
      PaymentOption.foreach(__v => __obj.updateDynamic("PaymentOption")(__v.asInstanceOf[js.Any]))
      RecurringCharges.foreach(__v => __obj.updateDynamic("RecurringCharges")(__v.asInstanceOf[js.Any]))
      ReservedElasticsearchInstanceOfferingId.foreach(__v =>
        __obj.updateDynamic("ReservedElasticsearchInstanceOfferingId")(__v.asInstanceOf[js.Any])
      )
      UsagePrice.foreach(__v => __obj.updateDynamic("UsagePrice")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReservedElasticsearchInstanceOffering]
    }
  }

  @js.native
  sealed trait ReservedElasticsearchInstancePaymentOption extends js.Any
  object ReservedElasticsearchInstancePaymentOption extends js.Object {
    val ALL_UPFRONT = "ALL_UPFRONT".asInstanceOf[ReservedElasticsearchInstancePaymentOption]
    val PARTIAL_UPFRONT = "PARTIAL_UPFRONT".asInstanceOf[ReservedElasticsearchInstancePaymentOption]
    val NO_UPFRONT = "NO_UPFRONT".asInstanceOf[ReservedElasticsearchInstancePaymentOption]

    val values = js.Object.freeze(js.Array(ALL_UPFRONT, PARTIAL_UPFRONT, NO_UPFRONT))
  }

  /**
    * The current options of an Elasticsearch domain service software options.
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

  /**
    * Specifies the time, in UTC format, when the service takes a daily automated snapshot of the specified Elasticsearch domain. Default value is <code>0</code> hours.
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
      AutomatedSnapshotStartHour.foreach(__v =>
        __obj.updateDynamic("AutomatedSnapshotStartHour")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[SnapshotOptions]
    }
  }

  /**
    * Status of a daily automated snapshot.
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

  /**
    * Container for the parameters to the <code><a>StartElasticsearchServiceSoftwareUpdate</a></code> operation. Specifies the name of the Elasticsearch domain that you wish to schedule a service software update on.
    */
  @js.native
  trait StartElasticsearchServiceSoftwareUpdateRequest extends js.Object {
    var DomainName: DomainName
  }

  object StartElasticsearchServiceSoftwareUpdateRequest {
    @inline
    def apply(
        DomainName: DomainName
    ): StartElasticsearchServiceSoftwareUpdateRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StartElasticsearchServiceSoftwareUpdateRequest]
    }
  }

  /**
    * The result of a <code>StartElasticsearchServiceSoftwareUpdate</code> operation. Contains the status of the update.
    */
  @js.native
  trait StartElasticsearchServiceSoftwareUpdateResponse extends js.Object {
    var ServiceSoftwareOptions: js.UndefOr[ServiceSoftwareOptions]
  }

  object StartElasticsearchServiceSoftwareUpdateResponse {
    @inline
    def apply(
        ServiceSoftwareOptions: js.UndefOr[ServiceSoftwareOptions] = js.undefined
    ): StartElasticsearchServiceSoftwareUpdateResponse = {
      val __obj = js.Dynamic.literal()
      ServiceSoftwareOptions.foreach(__v => __obj.updateDynamic("ServiceSoftwareOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartElasticsearchServiceSoftwareUpdateResponse]
    }
  }

  /**
    * StorageTypes represents the list of storage related types and their attributes that are available for given InstanceType.
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

  /**
    * Limits that are applicable for given storage type.
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

  @js.native
  sealed trait TLSSecurityPolicy extends js.Any
  object TLSSecurityPolicy extends js.Object {
    val `Policy-Min-TLS-1-0-2019-07` = "Policy-Min-TLS-1-0-2019-07".asInstanceOf[TLSSecurityPolicy]
    val `Policy-Min-TLS-1-2-2019-07` = "Policy-Min-TLS-1-2-2019-07".asInstanceOf[TLSSecurityPolicy]

    val values = js.Object.freeze(js.Array(`Policy-Min-TLS-1-0-2019-07`, `Policy-Min-TLS-1-2-2019-07`))
  }

  /**
    * Specifies a key value pair for a resource tag.
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

  /**
    * Container for the parameters to the <code><a>UpdateElasticsearchDomain</a></code> operation. Specifies the type and number of instances in the domain cluster.
    */
  @js.native
  trait UpdateElasticsearchDomainConfigRequest extends js.Object {
    var DomainName: DomainName
    var AccessPolicies: js.UndefOr[PolicyDocument]
    var AdvancedOptions: js.UndefOr[AdvancedOptions]
    var AdvancedSecurityOptions: js.UndefOr[AdvancedSecurityOptionsInput]
    var CognitoOptions: js.UndefOr[CognitoOptions]
    var DomainEndpointOptions: js.UndefOr[DomainEndpointOptions]
    var EBSOptions: js.UndefOr[EBSOptions]
    var ElasticsearchClusterConfig: js.UndefOr[ElasticsearchClusterConfig]
    var LogPublishingOptions: js.UndefOr[LogPublishingOptions]
    var SnapshotOptions: js.UndefOr[SnapshotOptions]
    var VPCOptions: js.UndefOr[VPCOptions]
  }

  object UpdateElasticsearchDomainConfigRequest {
    @inline
    def apply(
        DomainName: DomainName,
        AccessPolicies: js.UndefOr[PolicyDocument] = js.undefined,
        AdvancedOptions: js.UndefOr[AdvancedOptions] = js.undefined,
        AdvancedSecurityOptions: js.UndefOr[AdvancedSecurityOptionsInput] = js.undefined,
        CognitoOptions: js.UndefOr[CognitoOptions] = js.undefined,
        DomainEndpointOptions: js.UndefOr[DomainEndpointOptions] = js.undefined,
        EBSOptions: js.UndefOr[EBSOptions] = js.undefined,
        ElasticsearchClusterConfig: js.UndefOr[ElasticsearchClusterConfig] = js.undefined,
        LogPublishingOptions: js.UndefOr[LogPublishingOptions] = js.undefined,
        SnapshotOptions: js.UndefOr[SnapshotOptions] = js.undefined,
        VPCOptions: js.UndefOr[VPCOptions] = js.undefined
    ): UpdateElasticsearchDomainConfigRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      AccessPolicies.foreach(__v => __obj.updateDynamic("AccessPolicies")(__v.asInstanceOf[js.Any]))
      AdvancedOptions.foreach(__v => __obj.updateDynamic("AdvancedOptions")(__v.asInstanceOf[js.Any]))
      AdvancedSecurityOptions.foreach(__v => __obj.updateDynamic("AdvancedSecurityOptions")(__v.asInstanceOf[js.Any]))
      CognitoOptions.foreach(__v => __obj.updateDynamic("CognitoOptions")(__v.asInstanceOf[js.Any]))
      DomainEndpointOptions.foreach(__v => __obj.updateDynamic("DomainEndpointOptions")(__v.asInstanceOf[js.Any]))
      EBSOptions.foreach(__v => __obj.updateDynamic("EBSOptions")(__v.asInstanceOf[js.Any]))
      ElasticsearchClusterConfig.foreach(__v =>
        __obj.updateDynamic("ElasticsearchClusterConfig")(__v.asInstanceOf[js.Any])
      )
      LogPublishingOptions.foreach(__v => __obj.updateDynamic("LogPublishingOptions")(__v.asInstanceOf[js.Any]))
      SnapshotOptions.foreach(__v => __obj.updateDynamic("SnapshotOptions")(__v.asInstanceOf[js.Any]))
      VPCOptions.foreach(__v => __obj.updateDynamic("VPCOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateElasticsearchDomainConfigRequest]
    }
  }

  /**
    * The result of an <code>UpdateElasticsearchDomain</code> request. Contains the status of the Elasticsearch domain being updated.
    */
  @js.native
  trait UpdateElasticsearchDomainConfigResponse extends js.Object {
    var DomainConfig: ElasticsearchDomainConfig
  }

  object UpdateElasticsearchDomainConfigResponse {
    @inline
    def apply(
        DomainConfig: ElasticsearchDomainConfig
    ): UpdateElasticsearchDomainConfigResponse = {
      val __obj = js.Dynamic.literal(
        "DomainConfig" -> DomainConfig.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateElasticsearchDomainConfigResponse]
    }
  }

  /**
    * Container for request parameters to <code> <a>UpgradeElasticsearchDomain</a> </code> operation.
    */
  @js.native
  trait UpgradeElasticsearchDomainRequest extends js.Object {
    var DomainName: DomainName
    var TargetVersion: ElasticsearchVersionString
    var PerformCheckOnly: js.UndefOr[Boolean]
  }

  object UpgradeElasticsearchDomainRequest {
    @inline
    def apply(
        DomainName: DomainName,
        TargetVersion: ElasticsearchVersionString,
        PerformCheckOnly: js.UndefOr[Boolean] = js.undefined
    ): UpgradeElasticsearchDomainRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "TargetVersion" -> TargetVersion.asInstanceOf[js.Any]
      )

      PerformCheckOnly.foreach(__v => __obj.updateDynamic("PerformCheckOnly")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpgradeElasticsearchDomainRequest]
    }
  }

  /**
    * Container for response returned by <code> <a>UpgradeElasticsearchDomain</a> </code> operation.
    */
  @js.native
  trait UpgradeElasticsearchDomainResponse extends js.Object {
    var DomainName: js.UndefOr[DomainName]
    var PerformCheckOnly: js.UndefOr[Boolean]
    var TargetVersion: js.UndefOr[ElasticsearchVersionString]
  }

  object UpgradeElasticsearchDomainResponse {
    @inline
    def apply(
        DomainName: js.UndefOr[DomainName] = js.undefined,
        PerformCheckOnly: js.UndefOr[Boolean] = js.undefined,
        TargetVersion: js.UndefOr[ElasticsearchVersionString] = js.undefined
    ): UpgradeElasticsearchDomainResponse = {
      val __obj = js.Dynamic.literal()
      DomainName.foreach(__v => __obj.updateDynamic("DomainName")(__v.asInstanceOf[js.Any]))
      PerformCheckOnly.foreach(__v => __obj.updateDynamic("PerformCheckOnly")(__v.asInstanceOf[js.Any]))
      TargetVersion.foreach(__v => __obj.updateDynamic("TargetVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpgradeElasticsearchDomainResponse]
    }
  }

  /**
    * History of the last 10 Upgrades and Upgrade Eligibility Checks.
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

  @js.native
  sealed trait UpgradeStatus extends js.Any
  object UpgradeStatus extends js.Object {
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[UpgradeStatus]
    val SUCCEEDED = "SUCCEEDED".asInstanceOf[UpgradeStatus]
    val SUCCEEDED_WITH_ISSUES = "SUCCEEDED_WITH_ISSUES".asInstanceOf[UpgradeStatus]
    val FAILED = "FAILED".asInstanceOf[UpgradeStatus]

    val values = js.Object.freeze(js.Array(IN_PROGRESS, SUCCEEDED, SUCCEEDED_WITH_ISSUES, FAILED))
  }

  @js.native
  sealed trait UpgradeStep extends js.Any
  object UpgradeStep extends js.Object {
    val PRE_UPGRADE_CHECK = "PRE_UPGRADE_CHECK".asInstanceOf[UpgradeStep]
    val SNAPSHOT = "SNAPSHOT".asInstanceOf[UpgradeStep]
    val UPGRADE = "UPGRADE".asInstanceOf[UpgradeStep]

    val values = js.Object.freeze(js.Array(PRE_UPGRADE_CHECK, SNAPSHOT, UPGRADE))
  }

  /**
    * Represents a single step of the Upgrade or Upgrade Eligibility Check workflow.
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

  /**
    * Options to specify the subnets and security groups for VPC endpoint. For more information, see <a href="http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-vpc.html" target="_blank"> VPC Endpoints for Amazon Elasticsearch Service Domains</a>.
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

  /**
    * Status of the VPC options for the specified Elasticsearch domain.
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

  /**
    * Options to specify the subnets and security groups for VPC endpoint. For more information, see <a href="http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-vpc.html" target="_blank"> VPC Endpoints for Amazon Elasticsearch Service Domains</a>.
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

  /**
    * The type of EBS volume, standard, gp2, or io1. See <a href="http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-ebs" target="_blank">Configuring EBS-based Storage</a>for more information.
    */
  @js.native
  sealed trait VolumeType extends js.Any
  object VolumeType extends js.Object {
    val standard = "standard".asInstanceOf[VolumeType]
    val gp2 = "gp2".asInstanceOf[VolumeType]
    val io1 = "io1".asInstanceOf[VolumeType]

    val values = js.Object.freeze(js.Array(standard, gp2, io1))
  }

  /**
    * Specifies the zone awareness configuration for the domain cluster, such as the number of availability zones.
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
