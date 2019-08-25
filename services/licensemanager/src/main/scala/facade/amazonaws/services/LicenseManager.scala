package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

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
  type InventoryFilterCondition         = String
  type InventoryFilterList              = js.Array[InventoryFilter]
  type LicenseConfigurationAssociations = js.Array[LicenseConfigurationAssociation]
  type LicenseConfigurationStatus       = String
  type LicenseConfigurationUsageList    = js.Array[LicenseConfigurationUsage]
  type LicenseConfigurations            = js.Array[LicenseConfiguration]
  type LicenseCountingType              = String
  type LicenseSpecifications            = js.Array[LicenseSpecification]
  type ManagedResourceSummaryList       = js.Array[ManagedResourceSummary]
  type ResourceInventoryList            = js.Array[ResourceInventory]
  type ResourceType                     = String
  type StringList                       = js.Array[String]
  type TagKeyList                       = js.Array[String]
  type TagList                          = js.Array[Tag]

  implicit final class LicenseManagerOps(val service: LicenseManager) extends AnyVal {

    def createLicenseConfigurationFuture(
        params: CreateLicenseConfigurationRequest
    ): Future[CreateLicenseConfigurationResponse] = service.createLicenseConfiguration(params).promise.toFuture
    def deleteLicenseConfigurationFuture(
        params: DeleteLicenseConfigurationRequest
    ): Future[DeleteLicenseConfigurationResponse] = service.deleteLicenseConfiguration(params).promise.toFuture
    def getLicenseConfigurationFuture(params: GetLicenseConfigurationRequest): Future[GetLicenseConfigurationResponse] =
      service.getLicenseConfiguration(params).promise.toFuture
    def getServiceSettingsFuture(params: GetServiceSettingsRequest): Future[GetServiceSettingsResponse] =
      service.getServiceSettings(params).promise.toFuture
    def listAssociationsForLicenseConfigurationFuture(
        params: ListAssociationsForLicenseConfigurationRequest
    ): Future[ListAssociationsForLicenseConfigurationResponse] =
      service.listAssociationsForLicenseConfiguration(params).promise.toFuture
    def listLicenseConfigurationsFuture(
        params: ListLicenseConfigurationsRequest
    ): Future[ListLicenseConfigurationsResponse] = service.listLicenseConfigurations(params).promise.toFuture
    def listLicenseSpecificationsForResourceFuture(
        params: ListLicenseSpecificationsForResourceRequest
    ): Future[ListLicenseSpecificationsForResourceResponse] =
      service.listLicenseSpecificationsForResource(params).promise.toFuture
    def listResourceInventoryFuture(params: ListResourceInventoryRequest): Future[ListResourceInventoryResponse] =
      service.listResourceInventory(params).promise.toFuture
    def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise.toFuture
    def listUsageForLicenseConfigurationFuture(
        params: ListUsageForLicenseConfigurationRequest
    ): Future[ListUsageForLicenseConfigurationResponse] =
      service.listUsageForLicenseConfiguration(params).promise.toFuture
    def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise.toFuture
    def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise.toFuture
    def updateLicenseConfigurationFuture(
        params: UpdateLicenseConfigurationRequest
    ): Future[UpdateLicenseConfigurationResponse] = service.updateLicenseConfiguration(params).promise.toFuture
    def updateLicenseSpecificationsForResourceFuture(
        params: UpdateLicenseSpecificationsForResourceRequest
    ): Future[UpdateLicenseSpecificationsForResourceResponse] =
      service.updateLicenseSpecificationsForResource(params).promise.toFuture
    def updateServiceSettingsFuture(params: UpdateServiceSettingsRequest): Future[UpdateServiceSettingsResponse] =
      service.updateServiceSettings(params).promise.toFuture
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
    * Details about license consumption.
    */
  @js.native
  trait ConsumedLicenseSummary extends js.Object {
    var ConsumedLicenses: js.UndefOr[BoxLong]
    var ResourceType: js.UndefOr[ResourceType]
  }

  object ConsumedLicenseSummary {
    def apply(
        ConsumedLicenses: js.UndefOr[BoxLong] = js.undefined,
        ResourceType: js.UndefOr[ResourceType] = js.undefined
    ): ConsumedLicenseSummary = {
      val __obj = js.Dictionary.empty[js.Any]
      ConsumedLicenses.foreach(__v => __obj.update("ConsumedLicenses", __v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.update("ResourceType", __v.asInstanceOf[js.Any]))
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
    var Tags: js.UndefOr[TagList]
  }

  object CreateLicenseConfigurationRequest {
    def apply(
        LicenseCountingType: LicenseCountingType,
        Name: String,
        Description: js.UndefOr[String] = js.undefined,
        LicenseCount: js.UndefOr[BoxLong] = js.undefined,
        LicenseCountHardLimit: js.UndefOr[BoxBoolean] = js.undefined,
        LicenseRules: js.UndefOr[StringList] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateLicenseConfigurationRequest = {
      val __obj = js.Dictionary[js.Any](
        "LicenseCountingType" -> LicenseCountingType.asInstanceOf[js.Any],
        "Name"                -> Name.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      LicenseCount.foreach(__v => __obj.update("LicenseCount", __v.asInstanceOf[js.Any]))
      LicenseCountHardLimit.foreach(__v => __obj.update("LicenseCountHardLimit", __v.asInstanceOf[js.Any]))
      LicenseRules.foreach(__v => __obj.update("LicenseRules", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLicenseConfigurationRequest]
    }
  }

  @js.native
  trait CreateLicenseConfigurationResponse extends js.Object {
    var LicenseConfigurationArn: js.UndefOr[String]
  }

  object CreateLicenseConfigurationResponse {
    def apply(
        LicenseConfigurationArn: js.UndefOr[String] = js.undefined
    ): CreateLicenseConfigurationResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      LicenseConfigurationArn.foreach(__v => __obj.update("LicenseConfigurationArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLicenseConfigurationResponse]
    }
  }

  @js.native
  trait DeleteLicenseConfigurationRequest extends js.Object {
    var LicenseConfigurationArn: String
  }

  object DeleteLicenseConfigurationRequest {
    def apply(
        LicenseConfigurationArn: String
    ): DeleteLicenseConfigurationRequest = {
      val __obj = js.Dictionary[js.Any](
        "LicenseConfigurationArn" -> LicenseConfigurationArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteLicenseConfigurationRequest]
    }
  }

  @js.native
  trait DeleteLicenseConfigurationResponse extends js.Object {}

  object DeleteLicenseConfigurationResponse {
    def apply(
        ): DeleteLicenseConfigurationResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteLicenseConfigurationResponse]
    }
  }

  /**
    * A filter name and value pair that is used to return a more specific list of results from a describe operation. Filters can be used to match a set of resources by specific criteria, such as tags, attributes, or IDs. The filters supported by a <code>Describe</code> operation are documented with the <code>Describe</code> operation.
    */
  @js.native
  trait Filter extends js.Object {
    var Name: js.UndefOr[FilterName]
    var Values: js.UndefOr[FilterValues]
  }

  object Filter {
    def apply(
        Name: js.UndefOr[FilterName] = js.undefined,
        Values: js.UndefOr[FilterValues] = js.undefined
    ): Filter = {
      val __obj = js.Dictionary.empty[js.Any]
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.update("Values", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Filter]
    }
  }

  @js.native
  trait GetLicenseConfigurationRequest extends js.Object {
    var LicenseConfigurationArn: String
  }

  object GetLicenseConfigurationRequest {
    def apply(
        LicenseConfigurationArn: String
    ): GetLicenseConfigurationRequest = {
      val __obj = js.Dictionary[js.Any](
        "LicenseConfigurationArn" -> LicenseConfigurationArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetLicenseConfigurationRequest]
    }
  }

  @js.native
  trait GetLicenseConfigurationResponse extends js.Object {
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
    var Status: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  object GetLicenseConfigurationResponse {
    def apply(
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
        Status: js.UndefOr[String] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): GetLicenseConfigurationResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ConsumedLicenseSummaryList.foreach(__v => __obj.update("ConsumedLicenseSummaryList", __v.asInstanceOf[js.Any]))
      ConsumedLicenses.foreach(__v => __obj.update("ConsumedLicenses", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      LicenseConfigurationArn.foreach(__v => __obj.update("LicenseConfigurationArn", __v.asInstanceOf[js.Any]))
      LicenseConfigurationId.foreach(__v => __obj.update("LicenseConfigurationId", __v.asInstanceOf[js.Any]))
      LicenseCount.foreach(__v => __obj.update("LicenseCount", __v.asInstanceOf[js.Any]))
      LicenseCountHardLimit.foreach(__v => __obj.update("LicenseCountHardLimit", __v.asInstanceOf[js.Any]))
      LicenseCountingType.foreach(__v => __obj.update("LicenseCountingType", __v.asInstanceOf[js.Any]))
      LicenseRules.foreach(__v => __obj.update("LicenseRules", __v.asInstanceOf[js.Any]))
      ManagedResourceSummaryList.foreach(__v => __obj.update("ManagedResourceSummaryList", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      OwnerAccountId.foreach(__v => __obj.update("OwnerAccountId", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLicenseConfigurationResponse]
    }
  }

  @js.native
  trait GetServiceSettingsRequest extends js.Object {}

  object GetServiceSettingsRequest {
    def apply(
        ): GetServiceSettingsRequest = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[GetServiceSettingsRequest]
    }
  }

  @js.native
  trait GetServiceSettingsResponse extends js.Object {
    var EnableCrossAccountsDiscovery: js.UndefOr[BoxBoolean]
    var OrganizationConfiguration: js.UndefOr[OrganizationConfiguration]
    var S3BucketArn: js.UndefOr[String]
    var SnsTopicArn: js.UndefOr[String]
  }

  object GetServiceSettingsResponse {
    def apply(
        EnableCrossAccountsDiscovery: js.UndefOr[BoxBoolean] = js.undefined,
        OrganizationConfiguration: js.UndefOr[OrganizationConfiguration] = js.undefined,
        S3BucketArn: js.UndefOr[String] = js.undefined,
        SnsTopicArn: js.UndefOr[String] = js.undefined
    ): GetServiceSettingsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      EnableCrossAccountsDiscovery.foreach(
        __v => __obj.update("EnableCrossAccountsDiscovery", __v.asInstanceOf[js.Any])
      )
      OrganizationConfiguration.foreach(__v => __obj.update("OrganizationConfiguration", __v.asInstanceOf[js.Any]))
      S3BucketArn.foreach(__v => __obj.update("S3BucketArn", __v.asInstanceOf[js.Any]))
      SnsTopicArn.foreach(__v => __obj.update("SnsTopicArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetServiceSettingsResponse]
    }
  }

  /**
    * An inventory filter object.
    */
  @js.native
  trait InventoryFilter extends js.Object {
    var Condition: InventoryFilterCondition
    var Name: String
    var Value: js.UndefOr[String]
  }

  object InventoryFilter {
    def apply(
        Condition: InventoryFilterCondition,
        Name: String,
        Value: js.UndefOr[String] = js.undefined
    ): InventoryFilter = {
      val __obj = js.Dictionary[js.Any](
        "Condition" -> Condition.asInstanceOf[js.Any],
        "Name"      -> Name.asInstanceOf[js.Any]
      )

      Value.foreach(__v => __obj.update("Value", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InventoryFilter]
    }
  }

  object InventoryFilterConditionEnum {
    val EQUALS      = "EQUALS"
    val NOT_EQUALS  = "NOT_EQUALS"
    val BEGINS_WITH = "BEGINS_WITH"
    val CONTAINS    = "CONTAINS"

    val values = IndexedSeq(EQUALS, NOT_EQUALS, BEGINS_WITH, CONTAINS)
  }

  /**
    * A license configuration is an abstraction of a customer license agreement that can be consumed and enforced by License Manager. Components include specifications for the license type (licensing by instance, socket, CPU, or VCPU), tenancy (shared tenancy, Amazon EC2 Dedicated Instance, Amazon EC2 Dedicated Host, or any of these), host affinity (how long a VM must be associated with a host), the number of licenses purchased and used.
    */
  @js.native
  trait LicenseConfiguration extends js.Object {
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
    var Status: js.UndefOr[String]
  }

  object LicenseConfiguration {
    def apply(
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
        Status: js.UndefOr[String] = js.undefined
    ): LicenseConfiguration = {
      val __obj = js.Dictionary.empty[js.Any]
      ConsumedLicenseSummaryList.foreach(__v => __obj.update("ConsumedLicenseSummaryList", __v.asInstanceOf[js.Any]))
      ConsumedLicenses.foreach(__v => __obj.update("ConsumedLicenses", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      LicenseConfigurationArn.foreach(__v => __obj.update("LicenseConfigurationArn", __v.asInstanceOf[js.Any]))
      LicenseConfigurationId.foreach(__v => __obj.update("LicenseConfigurationId", __v.asInstanceOf[js.Any]))
      LicenseCount.foreach(__v => __obj.update("LicenseCount", __v.asInstanceOf[js.Any]))
      LicenseCountHardLimit.foreach(__v => __obj.update("LicenseCountHardLimit", __v.asInstanceOf[js.Any]))
      LicenseCountingType.foreach(__v => __obj.update("LicenseCountingType", __v.asInstanceOf[js.Any]))
      LicenseRules.foreach(__v => __obj.update("LicenseRules", __v.asInstanceOf[js.Any]))
      ManagedResourceSummaryList.foreach(__v => __obj.update("ManagedResourceSummaryList", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      OwnerAccountId.foreach(__v => __obj.update("OwnerAccountId", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LicenseConfiguration]
    }
  }

  /**
    * Describes a server resource that is associated with a license configuration.
    */
  @js.native
  trait LicenseConfigurationAssociation extends js.Object {
    var AssociationTime: js.UndefOr[DateTime]
    var ResourceArn: js.UndefOr[String]
    var ResourceOwnerId: js.UndefOr[String]
    var ResourceType: js.UndefOr[ResourceType]
  }

  object LicenseConfigurationAssociation {
    def apply(
        AssociationTime: js.UndefOr[DateTime] = js.undefined,
        ResourceArn: js.UndefOr[String] = js.undefined,
        ResourceOwnerId: js.UndefOr[String] = js.undefined,
        ResourceType: js.UndefOr[ResourceType] = js.undefined
    ): LicenseConfigurationAssociation = {
      val __obj = js.Dictionary.empty[js.Any]
      AssociationTime.foreach(__v => __obj.update("AssociationTime", __v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.update("ResourceArn", __v.asInstanceOf[js.Any]))
      ResourceOwnerId.foreach(__v => __obj.update("ResourceOwnerId", __v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.update("ResourceType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LicenseConfigurationAssociation]
    }
  }

  object LicenseConfigurationStatusEnum {
    val AVAILABLE = "AVAILABLE"
    val DISABLED  = "DISABLED"

    val values = IndexedSeq(AVAILABLE, DISABLED)
  }

  /**
    * Contains details of the usage of each resource from the license pool.
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
    def apply(
        AssociationTime: js.UndefOr[DateTime] = js.undefined,
        ConsumedLicenses: js.UndefOr[BoxLong] = js.undefined,
        ResourceArn: js.UndefOr[String] = js.undefined,
        ResourceOwnerId: js.UndefOr[String] = js.undefined,
        ResourceStatus: js.UndefOr[String] = js.undefined,
        ResourceType: js.UndefOr[ResourceType] = js.undefined
    ): LicenseConfigurationUsage = {
      val __obj = js.Dictionary.empty[js.Any]
      AssociationTime.foreach(__v => __obj.update("AssociationTime", __v.asInstanceOf[js.Any]))
      ConsumedLicenses.foreach(__v => __obj.update("ConsumedLicenses", __v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.update("ResourceArn", __v.asInstanceOf[js.Any]))
      ResourceOwnerId.foreach(__v => __obj.update("ResourceOwnerId", __v.asInstanceOf[js.Any]))
      ResourceStatus.foreach(__v => __obj.update("ResourceStatus", __v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.update("ResourceType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LicenseConfigurationUsage]
    }
  }

  object LicenseCountingTypeEnum {
    val vCPU     = "vCPU"
    val Instance = "Instance"
    val Core     = "Core"
    val Socket   = "Socket"

    val values = IndexedSeq(vCPU, Instance, Core, Socket)
  }

  /**
    * Object used for associating a license configuration with a resource.
    */
  @js.native
  trait LicenseSpecification extends js.Object {
    var LicenseConfigurationArn: String
  }

  object LicenseSpecification {
    def apply(
        LicenseConfigurationArn: String
    ): LicenseSpecification = {
      val __obj = js.Dictionary[js.Any](
        "LicenseConfigurationArn" -> LicenseConfigurationArn.asInstanceOf[js.Any]
      )

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
    def apply(
        LicenseConfigurationArn: String,
        MaxResults: js.UndefOr[BoxInteger] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListAssociationsForLicenseConfigurationRequest = {
      val __obj = js.Dictionary[js.Any](
        "LicenseConfigurationArn" -> LicenseConfigurationArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAssociationsForLicenseConfigurationRequest]
    }
  }

  @js.native
  trait ListAssociationsForLicenseConfigurationResponse extends js.Object {
    var LicenseConfigurationAssociations: js.UndefOr[LicenseConfigurationAssociations]
    var NextToken: js.UndefOr[String]
  }

  object ListAssociationsForLicenseConfigurationResponse {
    def apply(
        LicenseConfigurationAssociations: js.UndefOr[LicenseConfigurationAssociations] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListAssociationsForLicenseConfigurationResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      LicenseConfigurationAssociations.foreach(
        __v => __obj.update("LicenseConfigurationAssociations", __v.asInstanceOf[js.Any])
      )
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAssociationsForLicenseConfigurationResponse]
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
    def apply(
        Filters: js.UndefOr[Filters] = js.undefined,
        LicenseConfigurationArns: js.UndefOr[StringList] = js.undefined,
        MaxResults: js.UndefOr[BoxInteger] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListLicenseConfigurationsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      LicenseConfigurationArns.foreach(__v => __obj.update("LicenseConfigurationArns", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLicenseConfigurationsRequest]
    }
  }

  @js.native
  trait ListLicenseConfigurationsResponse extends js.Object {
    var LicenseConfigurations: js.UndefOr[LicenseConfigurations]
    var NextToken: js.UndefOr[String]
  }

  object ListLicenseConfigurationsResponse {
    def apply(
        LicenseConfigurations: js.UndefOr[LicenseConfigurations] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListLicenseConfigurationsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      LicenseConfigurations.foreach(__v => __obj.update("LicenseConfigurations", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
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
    def apply(
        ResourceArn: String,
        MaxResults: js.UndefOr[BoxInteger] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListLicenseSpecificationsForResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLicenseSpecificationsForResourceRequest]
    }
  }

  @js.native
  trait ListLicenseSpecificationsForResourceResponse extends js.Object {
    var LicenseSpecifications: js.UndefOr[LicenseSpecifications]
    var NextToken: js.UndefOr[String]
  }

  object ListLicenseSpecificationsForResourceResponse {
    def apply(
        LicenseSpecifications: js.UndefOr[LicenseSpecifications] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListLicenseSpecificationsForResourceResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      LicenseSpecifications.foreach(__v => __obj.update("LicenseSpecifications", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
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
    def apply(
        Filters: js.UndefOr[InventoryFilterList] = js.undefined,
        MaxResults: js.UndefOr[BoxInteger] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListResourceInventoryRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResourceInventoryRequest]
    }
  }

  @js.native
  trait ListResourceInventoryResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var ResourceInventoryList: js.UndefOr[ResourceInventoryList]
  }

  object ListResourceInventoryResponse {
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        ResourceInventoryList: js.UndefOr[ResourceInventoryList] = js.undefined
    ): ListResourceInventoryResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      ResourceInventoryList.foreach(__v => __obj.update("ResourceInventoryList", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResourceInventoryResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: String
  }

  object ListTagsForResourceRequest {
    def apply(
        ResourceArn: String
    ): ListTagsForResourceRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        Tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
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
    def apply(
        LicenseConfigurationArn: String,
        Filters: js.UndefOr[Filters] = js.undefined,
        MaxResults: js.UndefOr[BoxInteger] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListUsageForLicenseConfigurationRequest = {
      val __obj = js.Dictionary[js.Any](
        "LicenseConfigurationArn" -> LicenseConfigurationArn.asInstanceOf[js.Any]
      )

      Filters.foreach(__v => __obj.update("Filters", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUsageForLicenseConfigurationRequest]
    }
  }

  @js.native
  trait ListUsageForLicenseConfigurationResponse extends js.Object {
    var LicenseConfigurationUsageList: js.UndefOr[LicenseConfigurationUsageList]
    var NextToken: js.UndefOr[String]
  }

  object ListUsageForLicenseConfigurationResponse {
    def apply(
        LicenseConfigurationUsageList: js.UndefOr[LicenseConfigurationUsageList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListUsageForLicenseConfigurationResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      LicenseConfigurationUsageList.foreach(
        __v => __obj.update("LicenseConfigurationUsageList", __v.asInstanceOf[js.Any])
      )
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUsageForLicenseConfigurationResponse]
    }
  }

  /**
    * Summary for a resource.
    */
  @js.native
  trait ManagedResourceSummary extends js.Object {
    var AssociationCount: js.UndefOr[BoxLong]
    var ResourceType: js.UndefOr[ResourceType]
  }

  object ManagedResourceSummary {
    def apply(
        AssociationCount: js.UndefOr[BoxLong] = js.undefined,
        ResourceType: js.UndefOr[ResourceType] = js.undefined
    ): ManagedResourceSummary = {
      val __obj = js.Dictionary.empty[js.Any]
      AssociationCount.foreach(__v => __obj.update("AssociationCount", __v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.update("ResourceType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ManagedResourceSummary]
    }
  }

  /**
    * Object containing configuration information for AWS Organizations.
    */
  @js.native
  trait OrganizationConfiguration extends js.Object {
    var EnableIntegration: Boolean
  }

  object OrganizationConfiguration {
    def apply(
        EnableIntegration: Boolean
    ): OrganizationConfiguration = {
      val __obj = js.Dictionary[js.Any](
        "EnableIntegration" -> EnableIntegration.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[OrganizationConfiguration]
    }
  }

  /**
    * A set of attributes that describe a resource.
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
    def apply(
        Platform: js.UndefOr[String] = js.undefined,
        PlatformVersion: js.UndefOr[String] = js.undefined,
        ResourceArn: js.UndefOr[String] = js.undefined,
        ResourceId: js.UndefOr[String] = js.undefined,
        ResourceOwningAccountId: js.UndefOr[String] = js.undefined,
        ResourceType: js.UndefOr[ResourceType] = js.undefined
    ): ResourceInventory = {
      val __obj = js.Dictionary.empty[js.Any]
      Platform.foreach(__v => __obj.update("Platform", __v.asInstanceOf[js.Any]))
      PlatformVersion.foreach(__v => __obj.update("PlatformVersion", __v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.update("ResourceArn", __v.asInstanceOf[js.Any]))
      ResourceId.foreach(__v => __obj.update("ResourceId", __v.asInstanceOf[js.Any]))
      ResourceOwningAccountId.foreach(__v => __obj.update("ResourceOwningAccountId", __v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.update("ResourceType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceInventory]
    }
  }

  object ResourceTypeEnum {
    val EC2_INSTANCE = "EC2_INSTANCE"
    val EC2_HOST     = "EC2_HOST"
    val EC2_AMI      = "EC2_AMI"

    val values = IndexedSeq(EC2_INSTANCE, EC2_HOST, EC2_AMI)
  }

  /**
    * Tag for a resource in a key-value format.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: js.UndefOr[String]
    var Value: js.UndefOr[String]
  }

  object Tag {
    def apply(
        Key: js.UndefOr[String] = js.undefined,
        Value: js.UndefOr[String] = js.undefined
    ): Tag = {
      val __obj = js.Dictionary.empty[js.Any]
      Key.foreach(__v => __obj.update("Key", __v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.update("Value", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: String
    var Tags: TagList
  }

  object TagResourceRequest {
    def apply(
        ResourceArn: String,
        Tags: TagList
    ): TagResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "Tags"        -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object {}

  object TagResourceResponse {
    def apply(
        ): TagResourceResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: String
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    def apply(
        ResourceArn: String,
        TagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeys"     -> TagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object {}

  object UntagResourceResponse {
    def apply(
        ): UntagResourceResponse = {
      val __obj = js.Dictionary.empty[js.Any]

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
  }

  object UpdateLicenseConfigurationRequest {
    def apply(
        LicenseConfigurationArn: String,
        Description: js.UndefOr[String] = js.undefined,
        LicenseConfigurationStatus: js.UndefOr[LicenseConfigurationStatus] = js.undefined,
        LicenseCount: js.UndefOr[BoxLong] = js.undefined,
        LicenseCountHardLimit: js.UndefOr[BoxBoolean] = js.undefined,
        LicenseRules: js.UndefOr[StringList] = js.undefined,
        Name: js.UndefOr[String] = js.undefined
    ): UpdateLicenseConfigurationRequest = {
      val __obj = js.Dictionary[js.Any](
        "LicenseConfigurationArn" -> LicenseConfigurationArn.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      LicenseConfigurationStatus.foreach(__v => __obj.update("LicenseConfigurationStatus", __v.asInstanceOf[js.Any]))
      LicenseCount.foreach(__v => __obj.update("LicenseCount", __v.asInstanceOf[js.Any]))
      LicenseCountHardLimit.foreach(__v => __obj.update("LicenseCountHardLimit", __v.asInstanceOf[js.Any]))
      LicenseRules.foreach(__v => __obj.update("LicenseRules", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateLicenseConfigurationRequest]
    }
  }

  @js.native
  trait UpdateLicenseConfigurationResponse extends js.Object {}

  object UpdateLicenseConfigurationResponse {
    def apply(
        ): UpdateLicenseConfigurationResponse = {
      val __obj = js.Dictionary.empty[js.Any]

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
    def apply(
        ResourceArn: String,
        AddLicenseSpecifications: js.UndefOr[LicenseSpecifications] = js.undefined,
        RemoveLicenseSpecifications: js.UndefOr[LicenseSpecifications] = js.undefined
    ): UpdateLicenseSpecificationsForResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )

      AddLicenseSpecifications.foreach(__v => __obj.update("AddLicenseSpecifications", __v.asInstanceOf[js.Any]))
      RemoveLicenseSpecifications.foreach(__v => __obj.update("RemoveLicenseSpecifications", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateLicenseSpecificationsForResourceRequest]
    }
  }

  @js.native
  trait UpdateLicenseSpecificationsForResourceResponse extends js.Object {}

  object UpdateLicenseSpecificationsForResourceResponse {
    def apply(
        ): UpdateLicenseSpecificationsForResourceResponse = {
      val __obj = js.Dictionary.empty[js.Any]

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
    def apply(
        EnableCrossAccountsDiscovery: js.UndefOr[BoxBoolean] = js.undefined,
        OrganizationConfiguration: js.UndefOr[OrganizationConfiguration] = js.undefined,
        S3BucketArn: js.UndefOr[String] = js.undefined,
        SnsTopicArn: js.UndefOr[String] = js.undefined
    ): UpdateServiceSettingsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      EnableCrossAccountsDiscovery.foreach(
        __v => __obj.update("EnableCrossAccountsDiscovery", __v.asInstanceOf[js.Any])
      )
      OrganizationConfiguration.foreach(__v => __obj.update("OrganizationConfiguration", __v.asInstanceOf[js.Any]))
      S3BucketArn.foreach(__v => __obj.update("S3BucketArn", __v.asInstanceOf[js.Any]))
      SnsTopicArn.foreach(__v => __obj.update("SnsTopicArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateServiceSettingsRequest]
    }
  }

  @js.native
  trait UpdateServiceSettingsResponse extends js.Object {}

  object UpdateServiceSettingsResponse {
    def apply(
        ): UpdateServiceSettingsResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[UpdateServiceSettingsResponse]
    }
  }
}
