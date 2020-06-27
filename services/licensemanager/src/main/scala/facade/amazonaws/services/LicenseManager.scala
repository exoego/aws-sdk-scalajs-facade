package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object licensemanager {
  type BoxBoolean                       = Boolean
  type BoxInteger                       = Int
  type BoxLong                          = Double
  type ConsumedLicenseSummaryList       = js.Array[ConsumedLicenseSummary]
  type DateTime                         = js.Date
  type FilterName                       = String
  type FilterValue                      = String
  type FilterValues                     = js.Array[FilterValue]
  type Filters                          = js.Array[Filter]
  type InventoryFilterList              = js.Array[InventoryFilter]
  type LicenseConfigurationAssociations = js.Array[LicenseConfigurationAssociation]
  type LicenseConfigurationUsageList    = js.Array[LicenseConfigurationUsage]
  type LicenseConfigurations            = js.Array[LicenseConfiguration]
  type LicenseOperationFailureList      = js.Array[LicenseOperationFailure]
  type LicenseSpecifications            = js.Array[LicenseSpecification]
  type ManagedResourceSummaryList       = js.Array[ManagedResourceSummary]
  type MetadataList                     = js.Array[Metadata]
  type ProductInformationFilterList     = js.Array[ProductInformationFilter]
  type ProductInformationList           = js.Array[ProductInformation]
  type ResourceInventoryList            = js.Array[ResourceInventory]
  type StringList                       = js.Array[String]
  type TagKeyList                       = js.Array[String]
  type TagList                          = js.Array[Tag]

  implicit final class LicenseManagerOps(private val service: LicenseManager) extends AnyVal {

    @inline def createLicenseConfigurationFuture(
        params: CreateLicenseConfigurationRequest
    ): Future[CreateLicenseConfigurationResponse] = service.createLicenseConfiguration(params).promise().toFuture
    @inline def deleteLicenseConfigurationFuture(
        params: DeleteLicenseConfigurationRequest
    ): Future[DeleteLicenseConfigurationResponse] = service.deleteLicenseConfiguration(params).promise().toFuture
    @inline def getLicenseConfigurationFuture(
        params: GetLicenseConfigurationRequest
    ): Future[GetLicenseConfigurationResponse] = service.getLicenseConfiguration(params).promise().toFuture
    @inline def getServiceSettingsFuture(params: GetServiceSettingsRequest): Future[GetServiceSettingsResponse] =
      service.getServiceSettings(params).promise().toFuture
    @inline def listAssociationsForLicenseConfigurationFuture(
        params: ListAssociationsForLicenseConfigurationRequest
    ): Future[ListAssociationsForLicenseConfigurationResponse] =
      service.listAssociationsForLicenseConfiguration(params).promise().toFuture
    @inline def listFailuresForLicenseConfigurationOperationsFuture(
        params: ListFailuresForLicenseConfigurationOperationsRequest
    ): Future[ListFailuresForLicenseConfigurationOperationsResponse] =
      service.listFailuresForLicenseConfigurationOperations(params).promise().toFuture
    @inline def listLicenseConfigurationsFuture(
        params: ListLicenseConfigurationsRequest
    ): Future[ListLicenseConfigurationsResponse] = service.listLicenseConfigurations(params).promise().toFuture
    @inline def listLicenseSpecificationsForResourceFuture(
        params: ListLicenseSpecificationsForResourceRequest
    ): Future[ListLicenseSpecificationsForResourceResponse] =
      service.listLicenseSpecificationsForResource(params).promise().toFuture
    @inline def listResourceInventoryFuture(
        params: ListResourceInventoryRequest
    ): Future[ListResourceInventoryResponse] = service.listResourceInventory(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise().toFuture
    @inline def listUsageForLicenseConfigurationFuture(
        params: ListUsageForLicenseConfigurationRequest
    ): Future[ListUsageForLicenseConfigurationResponse] =
      service.listUsageForLicenseConfiguration(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise().toFuture
    @inline def updateLicenseConfigurationFuture(
        params: UpdateLicenseConfigurationRequest
    ): Future[UpdateLicenseConfigurationResponse] = service.updateLicenseConfiguration(params).promise().toFuture
    @inline def updateLicenseSpecificationsForResourceFuture(
        params: UpdateLicenseSpecificationsForResourceRequest
    ): Future[UpdateLicenseSpecificationsForResourceResponse] =
      service.updateLicenseSpecificationsForResource(params).promise().toFuture
    @inline def updateServiceSettingsFuture(
        params: UpdateServiceSettingsRequest
    ): Future[UpdateServiceSettingsResponse] = service.updateServiceSettings(params).promise().toFuture
  }
}

package licensemanager {
  @js.native
  @JSImport("aws-sdk", "LicenseManager")
  class LicenseManager() extends js.Object {
    def this(config: AWSConfig) = this()

    def createLicenseConfiguration(
        params: CreateLicenseConfigurationRequest
    ): Request[CreateLicenseConfigurationResponse] = js.native
    def deleteLicenseConfiguration(
        params: DeleteLicenseConfigurationRequest
    ): Request[DeleteLicenseConfigurationResponse] = js.native
    def getLicenseConfiguration(params: GetLicenseConfigurationRequest): Request[GetLicenseConfigurationResponse] =
      js.native
    def getServiceSettings(params: GetServiceSettingsRequest): Request[GetServiceSettingsResponse] = js.native
    def listAssociationsForLicenseConfiguration(
        params: ListAssociationsForLicenseConfigurationRequest
    ): Request[ListAssociationsForLicenseConfigurationResponse] = js.native
    def listFailuresForLicenseConfigurationOperations(
        params: ListFailuresForLicenseConfigurationOperationsRequest
    ): Request[ListFailuresForLicenseConfigurationOperationsResponse] = js.native
    def listLicenseConfigurations(
        params: ListLicenseConfigurationsRequest
    ): Request[ListLicenseConfigurationsResponse] = js.native
    def listLicenseSpecificationsForResource(
        params: ListLicenseSpecificationsForResourceRequest
    ): Request[ListLicenseSpecificationsForResourceResponse]                                                = js.native
    def listResourceInventory(params: ListResourceInventoryRequest): Request[ListResourceInventoryResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse]       = js.native
    def listUsageForLicenseConfiguration(
        params: ListUsageForLicenseConfigurationRequest
    ): Request[ListUsageForLicenseConfigurationResponse]                            = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse]       = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateLicenseConfiguration(
        params: UpdateLicenseConfigurationRequest
    ): Request[UpdateLicenseConfigurationResponse] = js.native
    def updateLicenseSpecificationsForResource(
        params: UpdateLicenseSpecificationsForResourceRequest
    ): Request[UpdateLicenseSpecificationsForResourceResponse]                                              = js.native
    def updateServiceSettings(params: UpdateServiceSettingsRequest): Request[UpdateServiceSettingsResponse] = js.native
  }

  /**
    * Describes automated discovery.
    */
  @js.native
  @Factory
  trait AutomatedDiscoveryInformation extends js.Object {
    var LastRunTime: js.UndefOr[DateTime]
  }

  /**
    * Details about license consumption.
    */
  @js.native
  @Factory
  trait ConsumedLicenseSummary extends js.Object {
    var ConsumedLicenses: js.UndefOr[BoxLong]
    var ResourceType: js.UndefOr[ResourceType]
  }

  @js.native
  @Factory
  trait CreateLicenseConfigurationRequest extends js.Object {
    var LicenseCountingType: LicenseCountingType
    var Name: String
    var Description: js.UndefOr[String]
    var LicenseCount: js.UndefOr[BoxLong]
    var LicenseCountHardLimit: js.UndefOr[BoxBoolean]
    var LicenseRules: js.UndefOr[StringList]
    var ProductInformationList: js.UndefOr[ProductInformationList]
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateLicenseConfigurationResponse extends js.Object {
    var LicenseConfigurationArn: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DeleteLicenseConfigurationRequest extends js.Object {
    var LicenseConfigurationArn: String
  }

  @js.native
  @Factory
  trait DeleteLicenseConfigurationResponse extends js.Object {}

  /**
    * A filter name and value pair that is used to return more specific results from a describe operation. Filters can be used to match a set of resources by specific criteria, such as tags, attributes, or IDs.
    */
  @js.native
  @Factory
  trait Filter extends js.Object {
    var Name: js.UndefOr[FilterName]
    var Values: js.UndefOr[FilterValues]
  }

  @js.native
  @Factory
  trait GetLicenseConfigurationRequest extends js.Object {
    var LicenseConfigurationArn: String
  }

  @js.native
  @Factory
  trait GetLicenseConfigurationResponse extends js.Object {
    var AutomatedDiscoveryInformation: js.UndefOr[AutomatedDiscoveryInformation]
    var ConsumedLicenseSummaryList: js.UndefOr[ConsumedLicenseSummaryList]
    var ConsumedLicenses: js.UndefOr[BoxLong]
    var Description: js.UndefOr[String]
    var LicenseConfigurationArn: js.UndefOr[String]
    var LicenseConfigurationId: js.UndefOr[String]
    var LicenseCount: js.UndefOr[BoxLong]
    var LicenseCountHardLimit: js.UndefOr[BoxBoolean]
    var LicenseCountingType: js.UndefOr[LicenseCountingType]
    var LicenseRules: js.UndefOr[StringList]
    var ManagedResourceSummaryList: js.UndefOr[ManagedResourceSummaryList]
    var Name: js.UndefOr[String]
    var OwnerAccountId: js.UndefOr[String]
    var ProductInformationList: js.UndefOr[ProductInformationList]
    var Status: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait GetServiceSettingsRequest extends js.Object {}

  @js.native
  @Factory
  trait GetServiceSettingsResponse extends js.Object {
    var EnableCrossAccountsDiscovery: js.UndefOr[BoxBoolean]
    var LicenseManagerResourceShareArn: js.UndefOr[String]
    var OrganizationConfiguration: js.UndefOr[OrganizationConfiguration]
    var S3BucketArn: js.UndefOr[String]
    var SnsTopicArn: js.UndefOr[String]
  }

  /**
    * An inventory filter.
    */
  @js.native
  @Factory
  trait InventoryFilter extends js.Object {
    var Condition: InventoryFilterCondition
    var Name: String
    var Value: js.UndefOr[String]
  }

  @js.native
  sealed trait InventoryFilterCondition extends js.Any
  object InventoryFilterCondition extends js.Object {
    val EQUALS      = "EQUALS".asInstanceOf[InventoryFilterCondition]
    val NOT_EQUALS  = "NOT_EQUALS".asInstanceOf[InventoryFilterCondition]
    val BEGINS_WITH = "BEGINS_WITH".asInstanceOf[InventoryFilterCondition]
    val CONTAINS    = "CONTAINS".asInstanceOf[InventoryFilterCondition]

    val values = js.Object.freeze(js.Array(EQUALS, NOT_EQUALS, BEGINS_WITH, CONTAINS))
  }

  /**
    * A license configuration is an abstraction of a customer license agreement that can be consumed and enforced by License Manager. Components include specifications for the license type (licensing by instance, socket, CPU, or vCPU), allowed tenancy (shared tenancy, Dedicated Instance, Dedicated Host, or all of these), host affinity (how long a VM must be associated with a host), and the number of licenses purchased and used.
    */
  @js.native
  @Factory
  trait LicenseConfiguration extends js.Object {
    var AutomatedDiscoveryInformation: js.UndefOr[AutomatedDiscoveryInformation]
    var ConsumedLicenseSummaryList: js.UndefOr[ConsumedLicenseSummaryList]
    var ConsumedLicenses: js.UndefOr[BoxLong]
    var Description: js.UndefOr[String]
    var LicenseConfigurationArn: js.UndefOr[String]
    var LicenseConfigurationId: js.UndefOr[String]
    var LicenseCount: js.UndefOr[BoxLong]
    var LicenseCountHardLimit: js.UndefOr[BoxBoolean]
    var LicenseCountingType: js.UndefOr[LicenseCountingType]
    var LicenseRules: js.UndefOr[StringList]
    var ManagedResourceSummaryList: js.UndefOr[ManagedResourceSummaryList]
    var Name: js.UndefOr[String]
    var OwnerAccountId: js.UndefOr[String]
    var ProductInformationList: js.UndefOr[ProductInformationList]
    var Status: js.UndefOr[String]
  }

  /**
    * Describes an association with a license configuration.
    */
  @js.native
  @Factory
  trait LicenseConfigurationAssociation extends js.Object {
    var AssociationTime: js.UndefOr[DateTime]
    var ResourceArn: js.UndefOr[String]
    var ResourceOwnerId: js.UndefOr[String]
    var ResourceType: js.UndefOr[ResourceType]
  }

  @js.native
  sealed trait LicenseConfigurationStatus extends js.Any
  object LicenseConfigurationStatus extends js.Object {
    val AVAILABLE = "AVAILABLE".asInstanceOf[LicenseConfigurationStatus]
    val DISABLED  = "DISABLED".asInstanceOf[LicenseConfigurationStatus]

    val values = js.Object.freeze(js.Array(AVAILABLE, DISABLED))
  }

  /**
    * Details about the usage of a resource associated with a license configuration.
    */
  @js.native
  @Factory
  trait LicenseConfigurationUsage extends js.Object {
    var AssociationTime: js.UndefOr[DateTime]
    var ConsumedLicenses: js.UndefOr[BoxLong]
    var ResourceArn: js.UndefOr[String]
    var ResourceOwnerId: js.UndefOr[String]
    var ResourceStatus: js.UndefOr[String]
    var ResourceType: js.UndefOr[ResourceType]
  }

  @js.native
  sealed trait LicenseCountingType extends js.Any
  object LicenseCountingType extends js.Object {
    val vCPU     = "vCPU".asInstanceOf[LicenseCountingType]
    val Instance = "Instance".asInstanceOf[LicenseCountingType]
    val Core     = "Core".asInstanceOf[LicenseCountingType]
    val Socket   = "Socket".asInstanceOf[LicenseCountingType]

    val values = js.Object.freeze(js.Array(vCPU, Instance, Core, Socket))
  }

  /**
    * Describes the failure of a license operation.
    */
  @js.native
  @Factory
  trait LicenseOperationFailure extends js.Object {
    var ErrorMessage: js.UndefOr[String]
    var FailureTime: js.UndefOr[DateTime]
    var MetadataList: js.UndefOr[MetadataList]
    var OperationName: js.UndefOr[String]
    var OperationRequestedBy: js.UndefOr[String]
    var ResourceArn: js.UndefOr[String]
    var ResourceOwnerId: js.UndefOr[String]
    var ResourceType: js.UndefOr[ResourceType]
  }

  /**
    * Details for associating a license configuration with a resource.
    */
  @js.native
  @Factory
  trait LicenseSpecification extends js.Object {
    var LicenseConfigurationArn: String
  }

  @js.native
  @Factory
  trait ListAssociationsForLicenseConfigurationRequest extends js.Object {
    var LicenseConfigurationArn: String
    var MaxResults: js.UndefOr[BoxInteger]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListAssociationsForLicenseConfigurationResponse extends js.Object {
    var LicenseConfigurationAssociations: js.UndefOr[LicenseConfigurationAssociations]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListFailuresForLicenseConfigurationOperationsRequest extends js.Object {
    var LicenseConfigurationArn: String
    var MaxResults: js.UndefOr[BoxInteger]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListFailuresForLicenseConfigurationOperationsResponse extends js.Object {
    var LicenseOperationFailureList: js.UndefOr[LicenseOperationFailureList]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListLicenseConfigurationsRequest extends js.Object {
    var Filters: js.UndefOr[Filters]
    var LicenseConfigurationArns: js.UndefOr[StringList]
    var MaxResults: js.UndefOr[BoxInteger]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListLicenseConfigurationsResponse extends js.Object {
    var LicenseConfigurations: js.UndefOr[LicenseConfigurations]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListLicenseSpecificationsForResourceRequest extends js.Object {
    var ResourceArn: String
    var MaxResults: js.UndefOr[BoxInteger]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListLicenseSpecificationsForResourceResponse extends js.Object {
    var LicenseSpecifications: js.UndefOr[LicenseSpecifications]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListResourceInventoryRequest extends js.Object {
    var Filters: js.UndefOr[InventoryFilterList]
    var MaxResults: js.UndefOr[BoxInteger]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListResourceInventoryResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var ResourceInventoryList: js.UndefOr[ResourceInventoryList]
  }

  @js.native
  @Factory
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: String
  }

  @js.native
  @Factory
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait ListUsageForLicenseConfigurationRequest extends js.Object {
    var LicenseConfigurationArn: String
    var Filters: js.UndefOr[Filters]
    var MaxResults: js.UndefOr[BoxInteger]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListUsageForLicenseConfigurationResponse extends js.Object {
    var LicenseConfigurationUsageList: js.UndefOr[LicenseConfigurationUsageList]
    var NextToken: js.UndefOr[String]
  }

  /**
    * Summary information about a managed resource.
    */
  @js.native
  @Factory
  trait ManagedResourceSummary extends js.Object {
    var AssociationCount: js.UndefOr[BoxLong]
    var ResourceType: js.UndefOr[ResourceType]
  }

  /**
    * Reserved.
    */
  @js.native
  @Factory
  trait Metadata extends js.Object {
    var Name: js.UndefOr[String]
    var Value: js.UndefOr[String]
  }

  /**
    * Configuration information for AWS Organizations.
    */
  @js.native
  @Factory
  trait OrganizationConfiguration extends js.Object {
    var EnableIntegration: Boolean
  }

  /**
    * Describes product information for a license configuration.
    */
  @js.native
  @Factory
  trait ProductInformation extends js.Object {
    var ProductInformationFilterList: ProductInformationFilterList
    var ResourceType: String
  }

  /**
    * Describes product information filters.
    */
  @js.native
  @Factory
  trait ProductInformationFilter extends js.Object {
    var ProductInformationFilterComparator: String
    var ProductInformationFilterName: String
    var ProductInformationFilterValue: StringList
  }

  /**
    * Details about a resource.
    */
  @js.native
  @Factory
  trait ResourceInventory extends js.Object {
    var Platform: js.UndefOr[String]
    var PlatformVersion: js.UndefOr[String]
    var ResourceArn: js.UndefOr[String]
    var ResourceId: js.UndefOr[String]
    var ResourceOwningAccountId: js.UndefOr[String]
    var ResourceType: js.UndefOr[ResourceType]
  }

  @js.native
  sealed trait ResourceType extends js.Any
  object ResourceType extends js.Object {
    val EC2_INSTANCE                     = "EC2_INSTANCE".asInstanceOf[ResourceType]
    val EC2_HOST                         = "EC2_HOST".asInstanceOf[ResourceType]
    val EC2_AMI                          = "EC2_AMI".asInstanceOf[ResourceType]
    val RDS                              = "RDS".asInstanceOf[ResourceType]
    val SYSTEMS_MANAGER_MANAGED_INSTANCE = "SYSTEMS_MANAGER_MANAGED_INSTANCE".asInstanceOf[ResourceType]

    val values = js.Object.freeze(js.Array(EC2_INSTANCE, EC2_HOST, EC2_AMI, RDS, SYSTEMS_MANAGER_MANAGED_INSTANCE))
  }

  /**
    * Details about a tag for a license configuration.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var Key: js.UndefOr[String]
    var Value: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var ResourceArn: String
    var Tags: TagList
  }

  @js.native
  @Factory
  trait TagResourceResponse extends js.Object {}

  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: String
    var TagKeys: TagKeyList
  }

  @js.native
  @Factory
  trait UntagResourceResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateLicenseConfigurationRequest extends js.Object {
    var LicenseConfigurationArn: String
    var Description: js.UndefOr[String]
    var LicenseConfigurationStatus: js.UndefOr[LicenseConfigurationStatus]
    var LicenseCount: js.UndefOr[BoxLong]
    var LicenseCountHardLimit: js.UndefOr[BoxBoolean]
    var LicenseRules: js.UndefOr[StringList]
    var Name: js.UndefOr[String]
    var ProductInformationList: js.UndefOr[ProductInformationList]
  }

  @js.native
  @Factory
  trait UpdateLicenseConfigurationResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateLicenseSpecificationsForResourceRequest extends js.Object {
    var ResourceArn: String
    var AddLicenseSpecifications: js.UndefOr[LicenseSpecifications]
    var RemoveLicenseSpecifications: js.UndefOr[LicenseSpecifications]
  }

  @js.native
  @Factory
  trait UpdateLicenseSpecificationsForResourceResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateServiceSettingsRequest extends js.Object {
    var EnableCrossAccountsDiscovery: js.UndefOr[BoxBoolean]
    var OrganizationConfiguration: js.UndefOr[OrganizationConfiguration]
    var S3BucketArn: js.UndefOr[String]
    var SnsTopicArn: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait UpdateServiceSettingsResponse extends js.Object {}
}
