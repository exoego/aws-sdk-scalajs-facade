package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
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
  type InventoryFilterCondition = String
  type InventoryFilterList = js.Array[InventoryFilter]
  type LicenseConfigurationAssociations = js.Array[LicenseConfigurationAssociation]
  type LicenseConfigurationStatus = String
  type LicenseConfigurationUsageList = js.Array[LicenseConfigurationUsage]
  type LicenseConfigurations = js.Array[LicenseConfiguration]
  type LicenseCountingType = String
  type LicenseSpecifications = js.Array[LicenseSpecification]
  type ManagedResourceSummaryList = js.Array[ManagedResourceSummary]
  type ResourceInventoryList = js.Array[ResourceInventory]
  type ResourceType = String
  type StringList = js.Array[String]
  type TagKeyList = js.Array[String]
  type TagList = js.Array[Tag]
}

package licensemanager {
  @js.native
  @JSImport("aws-sdk", "LicenseManager")
  class LicenseManager(config: AWSConfig) extends js.Object {
    def createLicenseConfiguration(params: CreateLicenseConfigurationRequest): Request[CreateLicenseConfigurationResponse] = js.native
    def deleteLicenseConfiguration(params: DeleteLicenseConfigurationRequest): Request[DeleteLicenseConfigurationResponse] = js.native
    def getLicenseConfiguration(params: GetLicenseConfigurationRequest): Request[GetLicenseConfigurationResponse] = js.native
    def getServiceSettings(params: GetServiceSettingsRequest): Request[GetServiceSettingsResponse] = js.native
    def listAssociationsForLicenseConfiguration(params: ListAssociationsForLicenseConfigurationRequest): Request[ListAssociationsForLicenseConfigurationResponse] = js.native
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

  /**
   * <p>Details about license consumption.</p>
   */
  @js.native
  trait ConsumedLicenseSummary extends js.Object {
    var ConsumedLicenses: js.UndefOr[BoxLong]
    var ResourceType: js.UndefOr[ResourceType]
  }

  object ConsumedLicenseSummary {
    def apply(
      ConsumedLicenses: js.UndefOr[BoxLong] = js.undefined,
      ResourceType: js.UndefOr[ResourceType] = js.undefined): ConsumedLicenseSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConsumedLicenses" -> ConsumedLicenses.map { x => x.asInstanceOf[js.Any] },
        "ResourceType" -> ResourceType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConsumedLicenseSummary]
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
      Tags: js.UndefOr[TagList] = js.undefined): CreateLicenseConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LicenseCountingType" -> LicenseCountingType.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "LicenseCount" -> LicenseCount.map { x => x.asInstanceOf[js.Any] },
        "LicenseCountHardLimit" -> LicenseCountHardLimit.map { x => x.asInstanceOf[js.Any] },
        "LicenseRules" -> LicenseRules.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLicenseConfigurationRequest]
    }
  }

  @js.native
  trait CreateLicenseConfigurationResponse extends js.Object {
    var LicenseConfigurationArn: js.UndefOr[String]
  }

  object CreateLicenseConfigurationResponse {
    def apply(
      LicenseConfigurationArn: js.UndefOr[String] = js.undefined): CreateLicenseConfigurationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LicenseConfigurationArn" -> LicenseConfigurationArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLicenseConfigurationResponse]
    }
  }

  @js.native
  trait DeleteLicenseConfigurationRequest extends js.Object {
    var LicenseConfigurationArn: String
  }

  object DeleteLicenseConfigurationRequest {
    def apply(
      LicenseConfigurationArn: String): DeleteLicenseConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LicenseConfigurationArn" -> LicenseConfigurationArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteLicenseConfigurationRequest]
    }
  }

  @js.native
  trait DeleteLicenseConfigurationResponse extends js.Object {

  }

  object DeleteLicenseConfigurationResponse {
    def apply(): DeleteLicenseConfigurationResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteLicenseConfigurationResponse]
    }
  }

  /**
   * <p>A filter name and value pair that is used to return a more specific list of results from a describe operation. Filters can be used to match a set of resources by specific criteria, such as tags, attributes, or IDs. The filters supported by a <code>Describe</code> operation are documented with the <code>Describe</code> operation.</p>
   */
  @js.native
  trait Filter extends js.Object {
    var Name: js.UndefOr[FilterName]
    var Values: js.UndefOr[FilterValues]
  }

  object Filter {
    def apply(
      Name: js.UndefOr[FilterName] = js.undefined,
      Values: js.UndefOr[FilterValues] = js.undefined): Filter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Values" -> Values.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Filter]
    }
  }

  @js.native
  trait GetLicenseConfigurationRequest extends js.Object {
    var LicenseConfigurationArn: String
  }

  object GetLicenseConfigurationRequest {
    def apply(
      LicenseConfigurationArn: String): GetLicenseConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LicenseConfigurationArn" -> LicenseConfigurationArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLicenseConfigurationRequest]
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
      Tags: js.UndefOr[TagList] = js.undefined): GetLicenseConfigurationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConsumedLicenseSummaryList" -> ConsumedLicenseSummaryList.map { x => x.asInstanceOf[js.Any] },
        "ConsumedLicenses" -> ConsumedLicenses.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "LicenseConfigurationArn" -> LicenseConfigurationArn.map { x => x.asInstanceOf[js.Any] },
        "LicenseConfigurationId" -> LicenseConfigurationId.map { x => x.asInstanceOf[js.Any] },
        "LicenseCount" -> LicenseCount.map { x => x.asInstanceOf[js.Any] },
        "LicenseCountHardLimit" -> LicenseCountHardLimit.map { x => x.asInstanceOf[js.Any] },
        "LicenseCountingType" -> LicenseCountingType.map { x => x.asInstanceOf[js.Any] },
        "LicenseRules" -> LicenseRules.map { x => x.asInstanceOf[js.Any] },
        "ManagedResourceSummaryList" -> ManagedResourceSummaryList.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "OwnerAccountId" -> OwnerAccountId.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLicenseConfigurationResponse]
    }
  }

  @js.native
  trait GetServiceSettingsRequest extends js.Object {

  }

  object GetServiceSettingsRequest {
    def apply(): GetServiceSettingsRequest = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetServiceSettingsRequest]
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
      SnsTopicArn: js.UndefOr[String] = js.undefined): GetServiceSettingsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EnableCrossAccountsDiscovery" -> EnableCrossAccountsDiscovery.map { x => x.asInstanceOf[js.Any] },
        "OrganizationConfiguration" -> OrganizationConfiguration.map { x => x.asInstanceOf[js.Any] },
        "S3BucketArn" -> S3BucketArn.map { x => x.asInstanceOf[js.Any] },
        "SnsTopicArn" -> SnsTopicArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetServiceSettingsResponse]
    }
  }

  /**
   * <p>An inventory filter object.</p>
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
      Value: js.UndefOr[String] = js.undefined): InventoryFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Condition" -> Condition.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InventoryFilter]
    }
  }

  object InventoryFilterConditionEnum {
    val EQUALS = "EQUALS"
    val NOT_EQUALS = "NOT_EQUALS"
    val BEGINS_WITH = "BEGINS_WITH"
    val CONTAINS = "CONTAINS"

    val values = IndexedSeq(EQUALS, NOT_EQUALS, BEGINS_WITH, CONTAINS)
  }

  /**
   * <p>A license configuration is an abstraction of a customer license agreement that can be consumed and enforced by License Manager. Components include specifications for the license type (licensing by instance, socket, CPU, or VCPU), tenancy (shared tenancy, Amazon EC2 Dedicated Instance, Amazon EC2 Dedicated Host, or any of these), host affinity (how long a VM must be associated with a host), the number of licenses purchased and used.</p>
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
      Status: js.UndefOr[String] = js.undefined): LicenseConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConsumedLicenseSummaryList" -> ConsumedLicenseSummaryList.map { x => x.asInstanceOf[js.Any] },
        "ConsumedLicenses" -> ConsumedLicenses.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "LicenseConfigurationArn" -> LicenseConfigurationArn.map { x => x.asInstanceOf[js.Any] },
        "LicenseConfigurationId" -> LicenseConfigurationId.map { x => x.asInstanceOf[js.Any] },
        "LicenseCount" -> LicenseCount.map { x => x.asInstanceOf[js.Any] },
        "LicenseCountHardLimit" -> LicenseCountHardLimit.map { x => x.asInstanceOf[js.Any] },
        "LicenseCountingType" -> LicenseCountingType.map { x => x.asInstanceOf[js.Any] },
        "LicenseRules" -> LicenseRules.map { x => x.asInstanceOf[js.Any] },
        "ManagedResourceSummaryList" -> ManagedResourceSummaryList.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "OwnerAccountId" -> OwnerAccountId.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LicenseConfiguration]
    }
  }

  /**
   * <p>Describes a server resource that is associated with a license configuration.</p>
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
      ResourceType: js.UndefOr[ResourceType] = js.undefined): LicenseConfigurationAssociation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AssociationTime" -> AssociationTime.map { x => x.asInstanceOf[js.Any] },
        "ResourceArn" -> ResourceArn.map { x => x.asInstanceOf[js.Any] },
        "ResourceOwnerId" -> ResourceOwnerId.map { x => x.asInstanceOf[js.Any] },
        "ResourceType" -> ResourceType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LicenseConfigurationAssociation]
    }
  }

  object LicenseConfigurationStatusEnum {
    val AVAILABLE = "AVAILABLE"
    val DISABLED = "DISABLED"

    val values = IndexedSeq(AVAILABLE, DISABLED)
  }

  /**
   * <p>Contains details of the usage of each resource from the license pool.</p>
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
      ResourceType: js.UndefOr[ResourceType] = js.undefined): LicenseConfigurationUsage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AssociationTime" -> AssociationTime.map { x => x.asInstanceOf[js.Any] },
        "ConsumedLicenses" -> ConsumedLicenses.map { x => x.asInstanceOf[js.Any] },
        "ResourceArn" -> ResourceArn.map { x => x.asInstanceOf[js.Any] },
        "ResourceOwnerId" -> ResourceOwnerId.map { x => x.asInstanceOf[js.Any] },
        "ResourceStatus" -> ResourceStatus.map { x => x.asInstanceOf[js.Any] },
        "ResourceType" -> ResourceType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LicenseConfigurationUsage]
    }
  }

  object LicenseCountingTypeEnum {
    val vCPU = "vCPU"
    val Instance = "Instance"
    val Core = "Core"
    val Socket = "Socket"

    val values = IndexedSeq(vCPU, Instance, Core, Socket)
  }

  /**
   * <p>Object used for associating a license configuration with a resource.</p>
   */
  @js.native
  trait LicenseSpecification extends js.Object {
    var LicenseConfigurationArn: String
  }

  object LicenseSpecification {
    def apply(
      LicenseConfigurationArn: String): LicenseSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LicenseConfigurationArn" -> LicenseConfigurationArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LicenseSpecification]
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
      NextToken: js.UndefOr[String] = js.undefined): ListAssociationsForLicenseConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LicenseConfigurationArn" -> LicenseConfigurationArn.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAssociationsForLicenseConfigurationRequest]
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
      NextToken: js.UndefOr[String] = js.undefined): ListAssociationsForLicenseConfigurationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LicenseConfigurationAssociations" -> LicenseConfigurationAssociations.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAssociationsForLicenseConfigurationResponse]
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
      NextToken: js.UndefOr[String] = js.undefined): ListLicenseConfigurationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "LicenseConfigurationArns" -> LicenseConfigurationArns.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListLicenseConfigurationsRequest]
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
      NextToken: js.UndefOr[String] = js.undefined): ListLicenseConfigurationsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LicenseConfigurations" -> LicenseConfigurations.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListLicenseConfigurationsResponse]
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
      NextToken: js.UndefOr[String] = js.undefined): ListLicenseSpecificationsForResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListLicenseSpecificationsForResourceRequest]
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
      NextToken: js.UndefOr[String] = js.undefined): ListLicenseSpecificationsForResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LicenseSpecifications" -> LicenseSpecifications.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListLicenseSpecificationsForResourceResponse]
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
      NextToken: js.UndefOr[String] = js.undefined): ListResourceInventoryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListResourceInventoryRequest]
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
      ResourceInventoryList: js.UndefOr[ResourceInventoryList] = js.undefined): ListResourceInventoryResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "ResourceInventoryList" -> ResourceInventoryList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListResourceInventoryResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: String
  }

  object ListTagsForResourceRequest {
    def apply(
      ResourceArn: String): ListTagsForResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[TagList]
  }

  object ListTagsForResourceResponse {
    def apply(
      Tags: js.UndefOr[TagList] = js.undefined): ListTagsForResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceResponse]
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
      NextToken: js.UndefOr[String] = js.undefined): ListUsageForLicenseConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LicenseConfigurationArn" -> LicenseConfigurationArn.asInstanceOf[js.Any],
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListUsageForLicenseConfigurationRequest]
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
      NextToken: js.UndefOr[String] = js.undefined): ListUsageForLicenseConfigurationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LicenseConfigurationUsageList" -> LicenseConfigurationUsageList.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListUsageForLicenseConfigurationResponse]
    }
  }

  /**
   * <p>Summary for a resource.</p>
   */
  @js.native
  trait ManagedResourceSummary extends js.Object {
    var AssociationCount: js.UndefOr[BoxLong]
    var ResourceType: js.UndefOr[ResourceType]
  }

  object ManagedResourceSummary {
    def apply(
      AssociationCount: js.UndefOr[BoxLong] = js.undefined,
      ResourceType: js.UndefOr[ResourceType] = js.undefined): ManagedResourceSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AssociationCount" -> AssociationCount.map { x => x.asInstanceOf[js.Any] },
        "ResourceType" -> ResourceType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ManagedResourceSummary]
    }
  }

  /**
   * <p>Object containing configuration information for AWS Organizations.</p>
   */
  @js.native
  trait OrganizationConfiguration extends js.Object {
    var EnableIntegration: Boolean
  }

  object OrganizationConfiguration {
    def apply(
      EnableIntegration: Boolean): OrganizationConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EnableIntegration" -> EnableIntegration.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OrganizationConfiguration]
    }
  }

  /**
   * <p>A set of attributes that describe a resource.</p>
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
      ResourceType: js.UndefOr[ResourceType] = js.undefined): ResourceInventory = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Platform" -> Platform.map { x => x.asInstanceOf[js.Any] },
        "PlatformVersion" -> PlatformVersion.map { x => x.asInstanceOf[js.Any] },
        "ResourceArn" -> ResourceArn.map { x => x.asInstanceOf[js.Any] },
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] },
        "ResourceOwningAccountId" -> ResourceOwningAccountId.map { x => x.asInstanceOf[js.Any] },
        "ResourceType" -> ResourceType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceInventory]
    }
  }

  object ResourceTypeEnum {
    val EC2_INSTANCE = "EC2_INSTANCE"
    val EC2_HOST = "EC2_HOST"
    val EC2_AMI = "EC2_AMI"

    val values = IndexedSeq(EC2_INSTANCE, EC2_HOST, EC2_AMI)
  }

  /**
   * <p>Tag for a resource in a key-value format.</p>
   */
  @js.native
  trait Tag extends js.Object {
    var Key: js.UndefOr[String]
    var Value: js.UndefOr[String]
  }

  object Tag {
    def apply(
      Key: js.UndefOr[String] = js.undefined,
      Value: js.UndefOr[String] = js.undefined): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
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
      Tags: TagList): TagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object {

  }

  object TagResourceResponse {
    def apply(): TagResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagResourceResponse]
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
      TagKeys: TagKeyList): UntagResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object {

  }

  object UntagResourceResponse {
    def apply(): UntagResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagResourceResponse]
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
      Name: js.UndefOr[String] = js.undefined): UpdateLicenseConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LicenseConfigurationArn" -> LicenseConfigurationArn.asInstanceOf[js.Any],
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "LicenseConfigurationStatus" -> LicenseConfigurationStatus.map { x => x.asInstanceOf[js.Any] },
        "LicenseCount" -> LicenseCount.map { x => x.asInstanceOf[js.Any] },
        "LicenseCountHardLimit" -> LicenseCountHardLimit.map { x => x.asInstanceOf[js.Any] },
        "LicenseRules" -> LicenseRules.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateLicenseConfigurationRequest]
    }
  }

  @js.native
  trait UpdateLicenseConfigurationResponse extends js.Object {

  }

  object UpdateLicenseConfigurationResponse {
    def apply(): UpdateLicenseConfigurationResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateLicenseConfigurationResponse]
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
      RemoveLicenseSpecifications: js.UndefOr[LicenseSpecifications] = js.undefined): UpdateLicenseSpecificationsForResourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "AddLicenseSpecifications" -> AddLicenseSpecifications.map { x => x.asInstanceOf[js.Any] },
        "RemoveLicenseSpecifications" -> RemoveLicenseSpecifications.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateLicenseSpecificationsForResourceRequest]
    }
  }

  @js.native
  trait UpdateLicenseSpecificationsForResourceResponse extends js.Object {

  }

  object UpdateLicenseSpecificationsForResourceResponse {
    def apply(): UpdateLicenseSpecificationsForResourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateLicenseSpecificationsForResourceResponse]
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
      SnsTopicArn: js.UndefOr[String] = js.undefined): UpdateServiceSettingsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EnableCrossAccountsDiscovery" -> EnableCrossAccountsDiscovery.map { x => x.asInstanceOf[js.Any] },
        "OrganizationConfiguration" -> OrganizationConfiguration.map { x => x.asInstanceOf[js.Any] },
        "S3BucketArn" -> S3BucketArn.map { x => x.asInstanceOf[js.Any] },
        "SnsTopicArn" -> SnsTopicArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateServiceSettingsRequest]
    }
  }

  @js.native
  trait UpdateServiceSettingsResponse extends js.Object {

  }

  object UpdateServiceSettingsResponse {
    def apply(): UpdateServiceSettingsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateServiceSettingsResponse]
    }
  }
}
