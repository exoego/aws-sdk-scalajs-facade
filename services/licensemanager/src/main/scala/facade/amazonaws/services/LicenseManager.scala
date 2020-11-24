package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object licensemanager {
  type BoxBoolean = Boolean
  type BoxInteger = Int
  type BoxLong = Double
  type ConsumedLicenseSummaryList = js.Array[ConsumedLicenseSummary]
  type DateTime = js.Date
  type FilterName = String
  type FilterValue = String
  type FilterValues = js.Array[FilterValue]
  type Filters = js.Array[Filter]
  type InventoryFilterList = js.Array[InventoryFilter]
  type LicenseConfigurationAssociations = js.Array[LicenseConfigurationAssociation]
  type LicenseConfigurationUsageList = js.Array[LicenseConfigurationUsage]
  type LicenseConfigurations = js.Array[LicenseConfiguration]
  type LicenseOperationFailureList = js.Array[LicenseOperationFailure]
  type LicenseSpecifications = js.Array[LicenseSpecification]
  type ManagedResourceSummaryList = js.Array[ManagedResourceSummary]
  type MetadataList = js.Array[Metadata]
  type ProductInformationFilterList = js.Array[ProductInformationFilter]
  type ProductInformationList = js.Array[ProductInformation]
  type ResourceInventoryList = js.Array[ResourceInventory]
  type StringList = js.Array[String]
  type TagKeyList = js.Array[String]
  type TagList = js.Array[Tag]

  implicit final class LicenseManagerOps(private val service: LicenseManager) extends AnyVal {

    @inline def createLicenseConfigurationFuture(params: CreateLicenseConfigurationRequest): Future[CreateLicenseConfigurationResponse] = service.createLicenseConfiguration(params).promise().toFuture
    @inline def deleteLicenseConfigurationFuture(params: DeleteLicenseConfigurationRequest): Future[DeleteLicenseConfigurationResponse] = service.deleteLicenseConfiguration(params).promise().toFuture
    @inline def getLicenseConfigurationFuture(params: GetLicenseConfigurationRequest): Future[GetLicenseConfigurationResponse] = service.getLicenseConfiguration(params).promise().toFuture
    @inline def getServiceSettingsFuture(params: GetServiceSettingsRequest): Future[GetServiceSettingsResponse] = service.getServiceSettings(params).promise().toFuture
    @inline def listAssociationsForLicenseConfigurationFuture(params: ListAssociationsForLicenseConfigurationRequest): Future[ListAssociationsForLicenseConfigurationResponse] = service.listAssociationsForLicenseConfiguration(params).promise().toFuture
    @inline def listFailuresForLicenseConfigurationOperationsFuture(params: ListFailuresForLicenseConfigurationOperationsRequest): Future[ListFailuresForLicenseConfigurationOperationsResponse] = service.listFailuresForLicenseConfigurationOperations(params).promise().toFuture
    @inline def listLicenseConfigurationsFuture(params: ListLicenseConfigurationsRequest): Future[ListLicenseConfigurationsResponse] = service.listLicenseConfigurations(params).promise().toFuture
    @inline def listLicenseSpecificationsForResourceFuture(params: ListLicenseSpecificationsForResourceRequest): Future[ListLicenseSpecificationsForResourceResponse] = service.listLicenseSpecificationsForResource(params).promise().toFuture
    @inline def listResourceInventoryFuture(params: ListResourceInventoryRequest): Future[ListResourceInventoryResponse] = service.listResourceInventory(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def listUsageForLicenseConfigurationFuture(params: ListUsageForLicenseConfigurationRequest): Future[ListUsageForLicenseConfigurationResponse] = service.listUsageForLicenseConfiguration(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateLicenseConfigurationFuture(params: UpdateLicenseConfigurationRequest): Future[UpdateLicenseConfigurationResponse] = service.updateLicenseConfiguration(params).promise().toFuture
    @inline def updateLicenseSpecificationsForResourceFuture(params: UpdateLicenseSpecificationsForResourceRequest): Future[UpdateLicenseSpecificationsForResourceResponse] = service.updateLicenseSpecificationsForResource(params).promise().toFuture
    @inline def updateServiceSettingsFuture(params: UpdateServiceSettingsRequest): Future[UpdateServiceSettingsResponse] = service.updateServiceSettings(params).promise().toFuture

  }
}

package licensemanager {
  @js.native
  @JSImport("aws-sdk/clients/licensemanager", JSImport.Namespace, "AWS.LicenseManager")
  class LicenseManager() extends js.Object {
    def this(config: AWSConfig) = this()

    def createLicenseConfiguration(params: CreateLicenseConfigurationRequest): Request[CreateLicenseConfigurationResponse] = js.native
    def deleteLicenseConfiguration(params: DeleteLicenseConfigurationRequest): Request[DeleteLicenseConfigurationResponse] = js.native
    def getLicenseConfiguration(params: GetLicenseConfigurationRequest): Request[GetLicenseConfigurationResponse] = js.native
    def getServiceSettings(params: GetServiceSettingsRequest): Request[GetServiceSettingsResponse] = js.native
    def listAssociationsForLicenseConfiguration(params: ListAssociationsForLicenseConfigurationRequest): Request[ListAssociationsForLicenseConfigurationResponse] = js.native
    def listFailuresForLicenseConfigurationOperations(params: ListFailuresForLicenseConfigurationOperationsRequest): Request[ListFailuresForLicenseConfigurationOperationsResponse] = js.native
    def listLicenseConfigurations(params: ListLicenseConfigurationsRequest): Request[ListLicenseConfigurationsResponse] = js.native
    def listLicenseSpecificationsForResource(params: ListLicenseSpecificationsForResourceRequest): Request[ListLicenseSpecificationsForResourceResponse] = js.native
    def listResourceInventory(params: ListResourceInventoryRequest): Request[ListResourceInventoryResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def listUsageForLicenseConfiguration(params: ListUsageForLicenseConfigurationRequest): Request[ListUsageForLicenseConfigurationResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateLicenseConfiguration(params: UpdateLicenseConfigurationRequest): Request[UpdateLicenseConfigurationResponse] = js.native
    def updateLicenseSpecificationsForResource(params: UpdateLicenseSpecificationsForResourceRequest): Request[UpdateLicenseSpecificationsForResourceResponse] = js.native
    def updateServiceSettings(params: UpdateServiceSettingsRequest): Request[UpdateServiceSettingsResponse] = js.native
  }

  /** Describes automated discovery.
    */
  @js.native
  trait AutomatedDiscoveryInformation extends js.Object {
    var LastRunTime: js.UndefOr[DateTime]
  }

  object AutomatedDiscoveryInformation {
    @inline
    def apply(
        LastRunTime: js.UndefOr[DateTime] = js.undefined
    ): AutomatedDiscoveryInformation = {
      val __obj = js.Dynamic.literal()
      LastRunTime.foreach(__v => __obj.updateDynamic("LastRunTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutomatedDiscoveryInformation]
    }
  }

  /** Details about license consumption.
    */
  @js.native
  trait ConsumedLicenseSummary extends js.Object {
    var ConsumedLicenses: js.UndefOr[BoxLong]
    var ResourceType: js.UndefOr[ResourceType]
  }

  object ConsumedLicenseSummary {
    @inline
    def apply(
        ConsumedLicenses: js.UndefOr[BoxLong] = js.undefined,
        ResourceType: js.UndefOr[ResourceType] = js.undefined
    ): ConsumedLicenseSummary = {
      val __obj = js.Dynamic.literal()
      ConsumedLicenses.foreach(__v => __obj.updateDynamic("ConsumedLicenses")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConsumedLicenseSummary]
    }
  }

  @js.native
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

  object CreateLicenseConfigurationRequest {
    @inline
    def apply(
        LicenseCountingType: LicenseCountingType,
        Name: String,
        Description: js.UndefOr[String] = js.undefined,
        LicenseCount: js.UndefOr[BoxLong] = js.undefined,
        LicenseCountHardLimit: js.UndefOr[BoxBoolean] = js.undefined,
        LicenseRules: js.UndefOr[StringList] = js.undefined,
        ProductInformationList: js.UndefOr[ProductInformationList] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateLicenseConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "LicenseCountingType" -> LicenseCountingType.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LicenseCount.foreach(__v => __obj.updateDynamic("LicenseCount")(__v.asInstanceOf[js.Any]))
      LicenseCountHardLimit.foreach(__v => __obj.updateDynamic("LicenseCountHardLimit")(__v.asInstanceOf[js.Any]))
      LicenseRules.foreach(__v => __obj.updateDynamic("LicenseRules")(__v.asInstanceOf[js.Any]))
      ProductInformationList.foreach(__v => __obj.updateDynamic("ProductInformationList")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLicenseConfigurationRequest]
    }
  }

  @js.native
  trait CreateLicenseConfigurationResponse extends js.Object {
    var LicenseConfigurationArn: js.UndefOr[String]
  }

  object CreateLicenseConfigurationResponse {
    @inline
    def apply(
        LicenseConfigurationArn: js.UndefOr[String] = js.undefined
    ): CreateLicenseConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      LicenseConfigurationArn.foreach(__v => __obj.updateDynamic("LicenseConfigurationArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLicenseConfigurationResponse]
    }
  }

  @js.native
  trait DeleteLicenseConfigurationRequest extends js.Object {
    var LicenseConfigurationArn: String
  }

  object DeleteLicenseConfigurationRequest {
    @inline
    def apply(
        LicenseConfigurationArn: String
    ): DeleteLicenseConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "LicenseConfigurationArn" -> LicenseConfigurationArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteLicenseConfigurationRequest]
    }
  }

  @js.native
  trait DeleteLicenseConfigurationResponse extends js.Object

  object DeleteLicenseConfigurationResponse {
    @inline
    def apply(): DeleteLicenseConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteLicenseConfigurationResponse]
    }
  }

  /** A filter name and value pair that is used to return more specific results from a describe operation. Filters can be used to match a set of resources by specific criteria, such as tags, attributes, or IDs.
    */
  @js.native
  trait Filter extends js.Object {
    var Name: js.UndefOr[FilterName]
    var Values: js.UndefOr[FilterValues]
  }

  object Filter {
    @inline
    def apply(
        Name: js.UndefOr[FilterName] = js.undefined,
        Values: js.UndefOr[FilterValues] = js.undefined
    ): Filter = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.updateDynamic("Values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Filter]
    }
  }

  @js.native
  trait GetLicenseConfigurationRequest extends js.Object {
    var LicenseConfigurationArn: String
  }

  object GetLicenseConfigurationRequest {
    @inline
    def apply(
        LicenseConfigurationArn: String
    ): GetLicenseConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "LicenseConfigurationArn" -> LicenseConfigurationArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetLicenseConfigurationRequest]
    }
  }

  @js.native
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

  object GetLicenseConfigurationResponse {
    @inline
    def apply(
        AutomatedDiscoveryInformation: js.UndefOr[AutomatedDiscoveryInformation] = js.undefined,
        ConsumedLicenseSummaryList: js.UndefOr[ConsumedLicenseSummaryList] = js.undefined,
        ConsumedLicenses: js.UndefOr[BoxLong] = js.undefined,
        Description: js.UndefOr[String] = js.undefined,
        LicenseConfigurationArn: js.UndefOr[String] = js.undefined,
        LicenseConfigurationId: js.UndefOr[String] = js.undefined,
        LicenseCount: js.UndefOr[BoxLong] = js.undefined,
        LicenseCountHardLimit: js.UndefOr[BoxBoolean] = js.undefined,
        LicenseCountingType: js.UndefOr[LicenseCountingType] = js.undefined,
        LicenseRules: js.UndefOr[StringList] = js.undefined,
        ManagedResourceSummaryList: js.UndefOr[ManagedResourceSummaryList] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        OwnerAccountId: js.UndefOr[String] = js.undefined,
        ProductInformationList: js.UndefOr[ProductInformationList] = js.undefined,
        Status: js.UndefOr[String] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): GetLicenseConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      AutomatedDiscoveryInformation.foreach(__v => __obj.updateDynamic("AutomatedDiscoveryInformation")(__v.asInstanceOf[js.Any]))
      ConsumedLicenseSummaryList.foreach(__v => __obj.updateDynamic("ConsumedLicenseSummaryList")(__v.asInstanceOf[js.Any]))
      ConsumedLicenses.foreach(__v => __obj.updateDynamic("ConsumedLicenses")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LicenseConfigurationArn.foreach(__v => __obj.updateDynamic("LicenseConfigurationArn")(__v.asInstanceOf[js.Any]))
      LicenseConfigurationId.foreach(__v => __obj.updateDynamic("LicenseConfigurationId")(__v.asInstanceOf[js.Any]))
      LicenseCount.foreach(__v => __obj.updateDynamic("LicenseCount")(__v.asInstanceOf[js.Any]))
      LicenseCountHardLimit.foreach(__v => __obj.updateDynamic("LicenseCountHardLimit")(__v.asInstanceOf[js.Any]))
      LicenseCountingType.foreach(__v => __obj.updateDynamic("LicenseCountingType")(__v.asInstanceOf[js.Any]))
      LicenseRules.foreach(__v => __obj.updateDynamic("LicenseRules")(__v.asInstanceOf[js.Any]))
      ManagedResourceSummaryList.foreach(__v => __obj.updateDynamic("ManagedResourceSummaryList")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      OwnerAccountId.foreach(__v => __obj.updateDynamic("OwnerAccountId")(__v.asInstanceOf[js.Any]))
      ProductInformationList.foreach(__v => __obj.updateDynamic("ProductInformationList")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLicenseConfigurationResponse]
    }
  }

  @js.native
  trait GetServiceSettingsRequest extends js.Object

  object GetServiceSettingsRequest {
    @inline
    def apply(): GetServiceSettingsRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetServiceSettingsRequest]
    }
  }

  @js.native
  trait GetServiceSettingsResponse extends js.Object {
    var EnableCrossAccountsDiscovery: js.UndefOr[BoxBoolean]
    var LicenseManagerResourceShareArn: js.UndefOr[String]
    var OrganizationConfiguration: js.UndefOr[OrganizationConfiguration]
    var S3BucketArn: js.UndefOr[String]
    var SnsTopicArn: js.UndefOr[String]
  }

  object GetServiceSettingsResponse {
    @inline
    def apply(
        EnableCrossAccountsDiscovery: js.UndefOr[BoxBoolean] = js.undefined,
        LicenseManagerResourceShareArn: js.UndefOr[String] = js.undefined,
        OrganizationConfiguration: js.UndefOr[OrganizationConfiguration] = js.undefined,
        S3BucketArn: js.UndefOr[String] = js.undefined,
        SnsTopicArn: js.UndefOr[String] = js.undefined
    ): GetServiceSettingsResponse = {
      val __obj = js.Dynamic.literal()
      EnableCrossAccountsDiscovery.foreach(__v => __obj.updateDynamic("EnableCrossAccountsDiscovery")(__v.asInstanceOf[js.Any]))
      LicenseManagerResourceShareArn.foreach(__v => __obj.updateDynamic("LicenseManagerResourceShareArn")(__v.asInstanceOf[js.Any]))
      OrganizationConfiguration.foreach(__v => __obj.updateDynamic("OrganizationConfiguration")(__v.asInstanceOf[js.Any]))
      S3BucketArn.foreach(__v => __obj.updateDynamic("S3BucketArn")(__v.asInstanceOf[js.Any]))
      SnsTopicArn.foreach(__v => __obj.updateDynamic("SnsTopicArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetServiceSettingsResponse]
    }
  }

  /** An inventory filter.
    */
  @js.native
  trait InventoryFilter extends js.Object {
    var Condition: InventoryFilterCondition
    var Name: String
    var Value: js.UndefOr[String]
  }

  object InventoryFilter {
    @inline
    def apply(
        Condition: InventoryFilterCondition,
        Name: String,
        Value: js.UndefOr[String] = js.undefined
    ): InventoryFilter = {
      val __obj = js.Dynamic.literal(
        "Condition" -> Condition.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InventoryFilter]
    }
  }

  @js.native
  sealed trait InventoryFilterCondition extends js.Any
  object InventoryFilterCondition {
    val EQUALS = "EQUALS".asInstanceOf[InventoryFilterCondition]
    val NOT_EQUALS = "NOT_EQUALS".asInstanceOf[InventoryFilterCondition]
    val BEGINS_WITH = "BEGINS_WITH".asInstanceOf[InventoryFilterCondition]
    val CONTAINS = "CONTAINS".asInstanceOf[InventoryFilterCondition]

    @inline def values = js.Array(EQUALS, NOT_EQUALS, BEGINS_WITH, CONTAINS)
  }

  /** A license configuration is an abstraction of a customer license agreement that can be consumed and enforced by License Manager. Components include specifications for the license type (licensing by instance, socket, CPU, or vCPU), allowed tenancy (shared tenancy, Dedicated Instance, Dedicated Host, or all of these), host affinity (how long a VM must be associated with a host), and the number of licenses purchased and used.
    */
  @js.native
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

  object LicenseConfiguration {
    @inline
    def apply(
        AutomatedDiscoveryInformation: js.UndefOr[AutomatedDiscoveryInformation] = js.undefined,
        ConsumedLicenseSummaryList: js.UndefOr[ConsumedLicenseSummaryList] = js.undefined,
        ConsumedLicenses: js.UndefOr[BoxLong] = js.undefined,
        Description: js.UndefOr[String] = js.undefined,
        LicenseConfigurationArn: js.UndefOr[String] = js.undefined,
        LicenseConfigurationId: js.UndefOr[String] = js.undefined,
        LicenseCount: js.UndefOr[BoxLong] = js.undefined,
        LicenseCountHardLimit: js.UndefOr[BoxBoolean] = js.undefined,
        LicenseCountingType: js.UndefOr[LicenseCountingType] = js.undefined,
        LicenseRules: js.UndefOr[StringList] = js.undefined,
        ManagedResourceSummaryList: js.UndefOr[ManagedResourceSummaryList] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        OwnerAccountId: js.UndefOr[String] = js.undefined,
        ProductInformationList: js.UndefOr[ProductInformationList] = js.undefined,
        Status: js.UndefOr[String] = js.undefined
    ): LicenseConfiguration = {
      val __obj = js.Dynamic.literal()
      AutomatedDiscoveryInformation.foreach(__v => __obj.updateDynamic("AutomatedDiscoveryInformation")(__v.asInstanceOf[js.Any]))
      ConsumedLicenseSummaryList.foreach(__v => __obj.updateDynamic("ConsumedLicenseSummaryList")(__v.asInstanceOf[js.Any]))
      ConsumedLicenses.foreach(__v => __obj.updateDynamic("ConsumedLicenses")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LicenseConfigurationArn.foreach(__v => __obj.updateDynamic("LicenseConfigurationArn")(__v.asInstanceOf[js.Any]))
      LicenseConfigurationId.foreach(__v => __obj.updateDynamic("LicenseConfigurationId")(__v.asInstanceOf[js.Any]))
      LicenseCount.foreach(__v => __obj.updateDynamic("LicenseCount")(__v.asInstanceOf[js.Any]))
      LicenseCountHardLimit.foreach(__v => __obj.updateDynamic("LicenseCountHardLimit")(__v.asInstanceOf[js.Any]))
      LicenseCountingType.foreach(__v => __obj.updateDynamic("LicenseCountingType")(__v.asInstanceOf[js.Any]))
      LicenseRules.foreach(__v => __obj.updateDynamic("LicenseRules")(__v.asInstanceOf[js.Any]))
      ManagedResourceSummaryList.foreach(__v => __obj.updateDynamic("ManagedResourceSummaryList")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      OwnerAccountId.foreach(__v => __obj.updateDynamic("OwnerAccountId")(__v.asInstanceOf[js.Any]))
      ProductInformationList.foreach(__v => __obj.updateDynamic("ProductInformationList")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LicenseConfiguration]
    }
  }

  /** Describes an association with a license configuration.
    */
  @js.native
  trait LicenseConfigurationAssociation extends js.Object {
    var AmiAssociationScope: js.UndefOr[String]
    var AssociationTime: js.UndefOr[DateTime]
    var ResourceArn: js.UndefOr[String]
    var ResourceOwnerId: js.UndefOr[String]
    var ResourceType: js.UndefOr[ResourceType]
  }

  object LicenseConfigurationAssociation {
    @inline
    def apply(
        AmiAssociationScope: js.UndefOr[String] = js.undefined,
        AssociationTime: js.UndefOr[DateTime] = js.undefined,
        ResourceArn: js.UndefOr[String] = js.undefined,
        ResourceOwnerId: js.UndefOr[String] = js.undefined,
        ResourceType: js.UndefOr[ResourceType] = js.undefined
    ): LicenseConfigurationAssociation = {
      val __obj = js.Dynamic.literal()
      AmiAssociationScope.foreach(__v => __obj.updateDynamic("AmiAssociationScope")(__v.asInstanceOf[js.Any]))
      AssociationTime.foreach(__v => __obj.updateDynamic("AssociationTime")(__v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.updateDynamic("ResourceArn")(__v.asInstanceOf[js.Any]))
      ResourceOwnerId.foreach(__v => __obj.updateDynamic("ResourceOwnerId")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LicenseConfigurationAssociation]
    }
  }

  @js.native
  sealed trait LicenseConfigurationStatus extends js.Any
  object LicenseConfigurationStatus {
    val AVAILABLE = "AVAILABLE".asInstanceOf[LicenseConfigurationStatus]
    val DISABLED = "DISABLED".asInstanceOf[LicenseConfigurationStatus]

    @inline def values = js.Array(AVAILABLE, DISABLED)
  }

  /** Details about the usage of a resource associated with a license configuration.
    */
  @js.native
  trait LicenseConfigurationUsage extends js.Object {
    var AssociationTime: js.UndefOr[DateTime]
    var ConsumedLicenses: js.UndefOr[BoxLong]
    var ResourceArn: js.UndefOr[String]
    var ResourceOwnerId: js.UndefOr[String]
    var ResourceStatus: js.UndefOr[String]
    var ResourceType: js.UndefOr[ResourceType]
  }

  object LicenseConfigurationUsage {
    @inline
    def apply(
        AssociationTime: js.UndefOr[DateTime] = js.undefined,
        ConsumedLicenses: js.UndefOr[BoxLong] = js.undefined,
        ResourceArn: js.UndefOr[String] = js.undefined,
        ResourceOwnerId: js.UndefOr[String] = js.undefined,
        ResourceStatus: js.UndefOr[String] = js.undefined,
        ResourceType: js.UndefOr[ResourceType] = js.undefined
    ): LicenseConfigurationUsage = {
      val __obj = js.Dynamic.literal()
      AssociationTime.foreach(__v => __obj.updateDynamic("AssociationTime")(__v.asInstanceOf[js.Any]))
      ConsumedLicenses.foreach(__v => __obj.updateDynamic("ConsumedLicenses")(__v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.updateDynamic("ResourceArn")(__v.asInstanceOf[js.Any]))
      ResourceOwnerId.foreach(__v => __obj.updateDynamic("ResourceOwnerId")(__v.asInstanceOf[js.Any]))
      ResourceStatus.foreach(__v => __obj.updateDynamic("ResourceStatus")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LicenseConfigurationUsage]
    }
  }

  @js.native
  sealed trait LicenseCountingType extends js.Any
  object LicenseCountingType {
    val vCPU = "vCPU".asInstanceOf[LicenseCountingType]
    val Instance = "Instance".asInstanceOf[LicenseCountingType]
    val Core = "Core".asInstanceOf[LicenseCountingType]
    val Socket = "Socket".asInstanceOf[LicenseCountingType]

    @inline def values = js.Array(vCPU, Instance, Core, Socket)
  }

  /** Describes the failure of a license operation.
    */
  @js.native
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

  object LicenseOperationFailure {
    @inline
    def apply(
        ErrorMessage: js.UndefOr[String] = js.undefined,
        FailureTime: js.UndefOr[DateTime] = js.undefined,
        MetadataList: js.UndefOr[MetadataList] = js.undefined,
        OperationName: js.UndefOr[String] = js.undefined,
        OperationRequestedBy: js.UndefOr[String] = js.undefined,
        ResourceArn: js.UndefOr[String] = js.undefined,
        ResourceOwnerId: js.UndefOr[String] = js.undefined,
        ResourceType: js.UndefOr[ResourceType] = js.undefined
    ): LicenseOperationFailure = {
      val __obj = js.Dynamic.literal()
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      FailureTime.foreach(__v => __obj.updateDynamic("FailureTime")(__v.asInstanceOf[js.Any]))
      MetadataList.foreach(__v => __obj.updateDynamic("MetadataList")(__v.asInstanceOf[js.Any]))
      OperationName.foreach(__v => __obj.updateDynamic("OperationName")(__v.asInstanceOf[js.Any]))
      OperationRequestedBy.foreach(__v => __obj.updateDynamic("OperationRequestedBy")(__v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.updateDynamic("ResourceArn")(__v.asInstanceOf[js.Any]))
      ResourceOwnerId.foreach(__v => __obj.updateDynamic("ResourceOwnerId")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LicenseOperationFailure]
    }
  }

  /** Details for associating a license configuration with a resource.
    */
  @js.native
  trait LicenseSpecification extends js.Object {
    var LicenseConfigurationArn: String
    var AmiAssociationScope: js.UndefOr[String]
  }

  object LicenseSpecification {
    @inline
    def apply(
        LicenseConfigurationArn: String,
        AmiAssociationScope: js.UndefOr[String] = js.undefined
    ): LicenseSpecification = {
      val __obj = js.Dynamic.literal(
        "LicenseConfigurationArn" -> LicenseConfigurationArn.asInstanceOf[js.Any]
      )

      AmiAssociationScope.foreach(__v => __obj.updateDynamic("AmiAssociationScope")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LicenseSpecification]
    }
  }

  @js.native
  trait ListAssociationsForLicenseConfigurationRequest extends js.Object {
    var LicenseConfigurationArn: String
    var MaxResults: js.UndefOr[BoxInteger]
    var NextToken: js.UndefOr[String]
  }

  object ListAssociationsForLicenseConfigurationRequest {
    @inline
    def apply(
        LicenseConfigurationArn: String,
        MaxResults: js.UndefOr[BoxInteger] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListAssociationsForLicenseConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "LicenseConfigurationArn" -> LicenseConfigurationArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAssociationsForLicenseConfigurationRequest]
    }
  }

  @js.native
  trait ListAssociationsForLicenseConfigurationResponse extends js.Object {
    var LicenseConfigurationAssociations: js.UndefOr[LicenseConfigurationAssociations]
    var NextToken: js.UndefOr[String]
  }

  object ListAssociationsForLicenseConfigurationResponse {
    @inline
    def apply(
        LicenseConfigurationAssociations: js.UndefOr[LicenseConfigurationAssociations] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListAssociationsForLicenseConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      LicenseConfigurationAssociations.foreach(__v => __obj.updateDynamic("LicenseConfigurationAssociations")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAssociationsForLicenseConfigurationResponse]
    }
  }

  @js.native
  trait ListFailuresForLicenseConfigurationOperationsRequest extends js.Object {
    var LicenseConfigurationArn: String
    var MaxResults: js.UndefOr[BoxInteger]
    var NextToken: js.UndefOr[String]
  }

  object ListFailuresForLicenseConfigurationOperationsRequest {
    @inline
    def apply(
        LicenseConfigurationArn: String,
        MaxResults: js.UndefOr[BoxInteger] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListFailuresForLicenseConfigurationOperationsRequest = {
      val __obj = js.Dynamic.literal(
        "LicenseConfigurationArn" -> LicenseConfigurationArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFailuresForLicenseConfigurationOperationsRequest]
    }
  }

  @js.native
  trait ListFailuresForLicenseConfigurationOperationsResponse extends js.Object {
    var LicenseOperationFailureList: js.UndefOr[LicenseOperationFailureList]
    var NextToken: js.UndefOr[String]
  }

  object ListFailuresForLicenseConfigurationOperationsResponse {
    @inline
    def apply(
        LicenseOperationFailureList: js.UndefOr[LicenseOperationFailureList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListFailuresForLicenseConfigurationOperationsResponse = {
      val __obj = js.Dynamic.literal()
      LicenseOperationFailureList.foreach(__v => __obj.updateDynamic("LicenseOperationFailureList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFailuresForLicenseConfigurationOperationsResponse]
    }
  }

  @js.native
  trait ListLicenseConfigurationsRequest extends js.Object {
    var Filters: js.UndefOr[Filters]
    var LicenseConfigurationArns: js.UndefOr[StringList]
    var MaxResults: js.UndefOr[BoxInteger]
    var NextToken: js.UndefOr[String]
  }

  object ListLicenseConfigurationsRequest {
    @inline
    def apply(
        Filters: js.UndefOr[Filters] = js.undefined,
        LicenseConfigurationArns: js.UndefOr[StringList] = js.undefined,
        MaxResults: js.UndefOr[BoxInteger] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListLicenseConfigurationsRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      LicenseConfigurationArns.foreach(__v => __obj.updateDynamic("LicenseConfigurationArns")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLicenseConfigurationsRequest]
    }
  }

  @js.native
  trait ListLicenseConfigurationsResponse extends js.Object {
    var LicenseConfigurations: js.UndefOr[LicenseConfigurations]
    var NextToken: js.UndefOr[String]
  }

  object ListLicenseConfigurationsResponse {
    @inline
    def apply(
        LicenseConfigurations: js.UndefOr[LicenseConfigurations] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListLicenseConfigurationsResponse = {
      val __obj = js.Dynamic.literal()
      LicenseConfigurations.foreach(__v => __obj.updateDynamic("LicenseConfigurations")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLicenseConfigurationsResponse]
    }
  }

  @js.native
  trait ListLicenseSpecificationsForResourceRequest extends js.Object {
    var ResourceArn: String
    var MaxResults: js.UndefOr[BoxInteger]
    var NextToken: js.UndefOr[String]
  }

  object ListLicenseSpecificationsForResourceRequest {
    @inline
    def apply(
        ResourceArn: String,
        MaxResults: js.UndefOr[BoxInteger] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListLicenseSpecificationsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLicenseSpecificationsForResourceRequest]
    }
  }

  @js.native
  trait ListLicenseSpecificationsForResourceResponse extends js.Object {
    var LicenseSpecifications: js.UndefOr[LicenseSpecifications]
    var NextToken: js.UndefOr[String]
  }

  object ListLicenseSpecificationsForResourceResponse {
    @inline
    def apply(
        LicenseSpecifications: js.UndefOr[LicenseSpecifications] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListLicenseSpecificationsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      LicenseSpecifications.foreach(__v => __obj.updateDynamic("LicenseSpecifications")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLicenseSpecificationsForResourceResponse]
    }
  }

  @js.native
  trait ListResourceInventoryRequest extends js.Object {
    var Filters: js.UndefOr[InventoryFilterList]
    var MaxResults: js.UndefOr[BoxInteger]
    var NextToken: js.UndefOr[String]
  }

  object ListResourceInventoryRequest {
    @inline
    def apply(
        Filters: js.UndefOr[InventoryFilterList] = js.undefined,
        MaxResults: js.UndefOr[BoxInteger] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListResourceInventoryRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResourceInventoryRequest]
    }
  }

  @js.native
  trait ListResourceInventoryResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var ResourceInventoryList: js.UndefOr[ResourceInventoryList]
  }

  object ListResourceInventoryResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        ResourceInventoryList: js.UndefOr[ResourceInventoryList] = js.undefined
    ): ListResourceInventoryResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ResourceInventoryList.foreach(__v => __obj.updateDynamic("ResourceInventoryList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResourceInventoryResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: String
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceArn: String
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[TagList]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        Tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  @js.native
  trait ListUsageForLicenseConfigurationRequest extends js.Object {
    var LicenseConfigurationArn: String
    var Filters: js.UndefOr[Filters]
    var MaxResults: js.UndefOr[BoxInteger]
    var NextToken: js.UndefOr[String]
  }

  object ListUsageForLicenseConfigurationRequest {
    @inline
    def apply(
        LicenseConfigurationArn: String,
        Filters: js.UndefOr[Filters] = js.undefined,
        MaxResults: js.UndefOr[BoxInteger] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListUsageForLicenseConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "LicenseConfigurationArn" -> LicenseConfigurationArn.asInstanceOf[js.Any]
      )

      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUsageForLicenseConfigurationRequest]
    }
  }

  @js.native
  trait ListUsageForLicenseConfigurationResponse extends js.Object {
    var LicenseConfigurationUsageList: js.UndefOr[LicenseConfigurationUsageList]
    var NextToken: js.UndefOr[String]
  }

  object ListUsageForLicenseConfigurationResponse {
    @inline
    def apply(
        LicenseConfigurationUsageList: js.UndefOr[LicenseConfigurationUsageList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListUsageForLicenseConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      LicenseConfigurationUsageList.foreach(__v => __obj.updateDynamic("LicenseConfigurationUsageList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUsageForLicenseConfigurationResponse]
    }
  }

  /** Summary information about a managed resource.
    */
  @js.native
  trait ManagedResourceSummary extends js.Object {
    var AssociationCount: js.UndefOr[BoxLong]
    var ResourceType: js.UndefOr[ResourceType]
  }

  object ManagedResourceSummary {
    @inline
    def apply(
        AssociationCount: js.UndefOr[BoxLong] = js.undefined,
        ResourceType: js.UndefOr[ResourceType] = js.undefined
    ): ManagedResourceSummary = {
      val __obj = js.Dynamic.literal()
      AssociationCount.foreach(__v => __obj.updateDynamic("AssociationCount")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ManagedResourceSummary]
    }
  }

  /** Reserved.
    */
  @js.native
  trait Metadata extends js.Object {
    var Name: js.UndefOr[String]
    var Value: js.UndefOr[String]
  }

  object Metadata {
    @inline
    def apply(
        Name: js.UndefOr[String] = js.undefined,
        Value: js.UndefOr[String] = js.undefined
    ): Metadata = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Metadata]
    }
  }

  /** Configuration information for AWS Organizations.
    */
  @js.native
  trait OrganizationConfiguration extends js.Object {
    var EnableIntegration: Boolean
  }

  object OrganizationConfiguration {
    @inline
    def apply(
        EnableIntegration: Boolean
    ): OrganizationConfiguration = {
      val __obj = js.Dynamic.literal(
        "EnableIntegration" -> EnableIntegration.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[OrganizationConfiguration]
    }
  }

  /** Describes product information for a license configuration.
    */
  @js.native
  trait ProductInformation extends js.Object {
    var ProductInformationFilterList: ProductInformationFilterList
    var ResourceType: String
  }

  object ProductInformation {
    @inline
    def apply(
        ProductInformationFilterList: ProductInformationFilterList,
        ResourceType: String
    ): ProductInformation = {
      val __obj = js.Dynamic.literal(
        "ProductInformationFilterList" -> ProductInformationFilterList.asInstanceOf[js.Any],
        "ResourceType" -> ResourceType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ProductInformation]
    }
  }

  /** Describes product information filters.
    */
  @js.native
  trait ProductInformationFilter extends js.Object {
    var ProductInformationFilterComparator: String
    var ProductInformationFilterName: String
    var ProductInformationFilterValue: StringList
  }

  object ProductInformationFilter {
    @inline
    def apply(
        ProductInformationFilterComparator: String,
        ProductInformationFilterName: String,
        ProductInformationFilterValue: StringList
    ): ProductInformationFilter = {
      val __obj = js.Dynamic.literal(
        "ProductInformationFilterComparator" -> ProductInformationFilterComparator.asInstanceOf[js.Any],
        "ProductInformationFilterName" -> ProductInformationFilterName.asInstanceOf[js.Any],
        "ProductInformationFilterValue" -> ProductInformationFilterValue.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ProductInformationFilter]
    }
  }

  /** Details about a resource.
    */
  @js.native
  trait ResourceInventory extends js.Object {
    var Platform: js.UndefOr[String]
    var PlatformVersion: js.UndefOr[String]
    var ResourceArn: js.UndefOr[String]
    var ResourceId: js.UndefOr[String]
    var ResourceOwningAccountId: js.UndefOr[String]
    var ResourceType: js.UndefOr[ResourceType]
  }

  object ResourceInventory {
    @inline
    def apply(
        Platform: js.UndefOr[String] = js.undefined,
        PlatformVersion: js.UndefOr[String] = js.undefined,
        ResourceArn: js.UndefOr[String] = js.undefined,
        ResourceId: js.UndefOr[String] = js.undefined,
        ResourceOwningAccountId: js.UndefOr[String] = js.undefined,
        ResourceType: js.UndefOr[ResourceType] = js.undefined
    ): ResourceInventory = {
      val __obj = js.Dynamic.literal()
      Platform.foreach(__v => __obj.updateDynamic("Platform")(__v.asInstanceOf[js.Any]))
      PlatformVersion.foreach(__v => __obj.updateDynamic("PlatformVersion")(__v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.updateDynamic("ResourceArn")(__v.asInstanceOf[js.Any]))
      ResourceId.foreach(__v => __obj.updateDynamic("ResourceId")(__v.asInstanceOf[js.Any]))
      ResourceOwningAccountId.foreach(__v => __obj.updateDynamic("ResourceOwningAccountId")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceInventory]
    }
  }

  @js.native
  sealed trait ResourceType extends js.Any
  object ResourceType {
    val EC2_INSTANCE = "EC2_INSTANCE".asInstanceOf[ResourceType]
    val EC2_HOST = "EC2_HOST".asInstanceOf[ResourceType]
    val EC2_AMI = "EC2_AMI".asInstanceOf[ResourceType]
    val RDS = "RDS".asInstanceOf[ResourceType]
    val SYSTEMS_MANAGER_MANAGED_INSTANCE = "SYSTEMS_MANAGER_MANAGED_INSTANCE".asInstanceOf[ResourceType]

    @inline def values = js.Array(EC2_INSTANCE, EC2_HOST, EC2_AMI, RDS, SYSTEMS_MANAGER_MANAGED_INSTANCE)
  }

  /** Details about a tag for a license configuration.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: js.UndefOr[String]
    var Value: js.UndefOr[String]
  }

  object Tag {
    @inline
    def apply(
        Key: js.UndefOr[String] = js.undefined,
        Value: js.UndefOr[String] = js.undefined
    ): Tag = {
      val __obj = js.Dynamic.literal()
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: String
    var Tags: TagList
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceArn: String,
        Tags: TagList
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
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
    var ResourceArn: String
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceArn: String,
        TagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
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

  object UpdateLicenseConfigurationRequest {
    @inline
    def apply(
        LicenseConfigurationArn: String,
        Description: js.UndefOr[String] = js.undefined,
        LicenseConfigurationStatus: js.UndefOr[LicenseConfigurationStatus] = js.undefined,
        LicenseCount: js.UndefOr[BoxLong] = js.undefined,
        LicenseCountHardLimit: js.UndefOr[BoxBoolean] = js.undefined,
        LicenseRules: js.UndefOr[StringList] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        ProductInformationList: js.UndefOr[ProductInformationList] = js.undefined
    ): UpdateLicenseConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "LicenseConfigurationArn" -> LicenseConfigurationArn.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LicenseConfigurationStatus.foreach(__v => __obj.updateDynamic("LicenseConfigurationStatus")(__v.asInstanceOf[js.Any]))
      LicenseCount.foreach(__v => __obj.updateDynamic("LicenseCount")(__v.asInstanceOf[js.Any]))
      LicenseCountHardLimit.foreach(__v => __obj.updateDynamic("LicenseCountHardLimit")(__v.asInstanceOf[js.Any]))
      LicenseRules.foreach(__v => __obj.updateDynamic("LicenseRules")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ProductInformationList.foreach(__v => __obj.updateDynamic("ProductInformationList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateLicenseConfigurationRequest]
    }
  }

  @js.native
  trait UpdateLicenseConfigurationResponse extends js.Object

  object UpdateLicenseConfigurationResponse {
    @inline
    def apply(): UpdateLicenseConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateLicenseConfigurationResponse]
    }
  }

  @js.native
  trait UpdateLicenseSpecificationsForResourceRequest extends js.Object {
    var ResourceArn: String
    var AddLicenseSpecifications: js.UndefOr[LicenseSpecifications]
    var RemoveLicenseSpecifications: js.UndefOr[LicenseSpecifications]
  }

  object UpdateLicenseSpecificationsForResourceRequest {
    @inline
    def apply(
        ResourceArn: String,
        AddLicenseSpecifications: js.UndefOr[LicenseSpecifications] = js.undefined,
        RemoveLicenseSpecifications: js.UndefOr[LicenseSpecifications] = js.undefined
    ): UpdateLicenseSpecificationsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )

      AddLicenseSpecifications.foreach(__v => __obj.updateDynamic("AddLicenseSpecifications")(__v.asInstanceOf[js.Any]))
      RemoveLicenseSpecifications.foreach(__v => __obj.updateDynamic("RemoveLicenseSpecifications")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateLicenseSpecificationsForResourceRequest]
    }
  }

  @js.native
  trait UpdateLicenseSpecificationsForResourceResponse extends js.Object

  object UpdateLicenseSpecificationsForResourceResponse {
    @inline
    def apply(): UpdateLicenseSpecificationsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateLicenseSpecificationsForResourceResponse]
    }
  }

  @js.native
  trait UpdateServiceSettingsRequest extends js.Object {
    var EnableCrossAccountsDiscovery: js.UndefOr[BoxBoolean]
    var OrganizationConfiguration: js.UndefOr[OrganizationConfiguration]
    var S3BucketArn: js.UndefOr[String]
    var SnsTopicArn: js.UndefOr[String]
  }

  object UpdateServiceSettingsRequest {
    @inline
    def apply(
        EnableCrossAccountsDiscovery: js.UndefOr[BoxBoolean] = js.undefined,
        OrganizationConfiguration: js.UndefOr[OrganizationConfiguration] = js.undefined,
        S3BucketArn: js.UndefOr[String] = js.undefined,
        SnsTopicArn: js.UndefOr[String] = js.undefined
    ): UpdateServiceSettingsRequest = {
      val __obj = js.Dynamic.literal()
      EnableCrossAccountsDiscovery.foreach(__v => __obj.updateDynamic("EnableCrossAccountsDiscovery")(__v.asInstanceOf[js.Any]))
      OrganizationConfiguration.foreach(__v => __obj.updateDynamic("OrganizationConfiguration")(__v.asInstanceOf[js.Any]))
      S3BucketArn.foreach(__v => __obj.updateDynamic("S3BucketArn")(__v.asInstanceOf[js.Any]))
      SnsTopicArn.foreach(__v => __obj.updateDynamic("SnsTopicArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateServiceSettingsRequest]
    }
  }

  @js.native
  trait UpdateServiceSettingsResponse extends js.Object

  object UpdateServiceSettingsResponse {
    @inline
    def apply(): UpdateServiceSettingsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateServiceSettingsResponse]
    }
  }
}
