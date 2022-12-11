package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object licensemanagerusersubscriptions {
  type BoxInteger = Int
  type FilterList = js.Array[Filter]
  type IdentityProviderSummaryList = js.Array[IdentityProviderSummary]
  type InstanceSummaryList = js.Array[InstanceSummary]
  type InstanceUserSummaryList = js.Array[InstanceUserSummary]
  type ProductUserSummaryList = js.Array[ProductUserSummary]
  type SecurityGroup = String
  type SettingsSubnetsList = js.Array[Subnet]
  type StringList = js.Array[String]
  type Subnet = String
  type Subnets = js.Array[Subnet]

  final class LicenseManagerUserSubscriptionsOps(private val service: LicenseManagerUserSubscriptions) extends AnyVal {

    @inline def associateUserFuture(params: AssociateUserRequest): Future[AssociateUserResponse] = service.associateUser(params).promise().toFuture
    @inline def deregisterIdentityProviderFuture(params: DeregisterIdentityProviderRequest): Future[DeregisterIdentityProviderResponse] = service.deregisterIdentityProvider(params).promise().toFuture
    @inline def disassociateUserFuture(params: DisassociateUserRequest): Future[DisassociateUserResponse] = service.disassociateUser(params).promise().toFuture
    @inline def listIdentityProvidersFuture(params: ListIdentityProvidersRequest): Future[ListIdentityProvidersResponse] = service.listIdentityProviders(params).promise().toFuture
    @inline def listInstancesFuture(params: ListInstancesRequest): Future[ListInstancesResponse] = service.listInstances(params).promise().toFuture
    @inline def listProductSubscriptionsFuture(params: ListProductSubscriptionsRequest): Future[ListProductSubscriptionsResponse] = service.listProductSubscriptions(params).promise().toFuture
    @inline def listUserAssociationsFuture(params: ListUserAssociationsRequest): Future[ListUserAssociationsResponse] = service.listUserAssociations(params).promise().toFuture
    @inline def registerIdentityProviderFuture(params: RegisterIdentityProviderRequest): Future[RegisterIdentityProviderResponse] = service.registerIdentityProvider(params).promise().toFuture
    @inline def startProductSubscriptionFuture(params: StartProductSubscriptionRequest): Future[StartProductSubscriptionResponse] = service.startProductSubscription(params).promise().toFuture
    @inline def stopProductSubscriptionFuture(params: StopProductSubscriptionRequest): Future[StopProductSubscriptionResponse] = service.stopProductSubscription(params).promise().toFuture
    @inline def updateIdentityProviderSettingsFuture(params: UpdateIdentityProviderSettingsRequest): Future[UpdateIdentityProviderSettingsResponse] = service.updateIdentityProviderSettings(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/licensemanagerusersubscriptions", JSImport.Namespace, "AWS.LicenseManagerUserSubscriptions")
  class LicenseManagerUserSubscriptions() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateUser(params: AssociateUserRequest): Request[AssociateUserResponse] = js.native
    def deregisterIdentityProvider(params: DeregisterIdentityProviderRequest): Request[DeregisterIdentityProviderResponse] = js.native
    def disassociateUser(params: DisassociateUserRequest): Request[DisassociateUserResponse] = js.native
    def listIdentityProviders(params: ListIdentityProvidersRequest): Request[ListIdentityProvidersResponse] = js.native
    def listInstances(params: ListInstancesRequest): Request[ListInstancesResponse] = js.native
    def listProductSubscriptions(params: ListProductSubscriptionsRequest): Request[ListProductSubscriptionsResponse] = js.native
    def listUserAssociations(params: ListUserAssociationsRequest): Request[ListUserAssociationsResponse] = js.native
    def registerIdentityProvider(params: RegisterIdentityProviderRequest): Request[RegisterIdentityProviderResponse] = js.native
    def startProductSubscription(params: StartProductSubscriptionRequest): Request[StartProductSubscriptionResponse] = js.native
    def stopProductSubscription(params: StopProductSubscriptionRequest): Request[StopProductSubscriptionResponse] = js.native
    def updateIdentityProviderSettings(params: UpdateIdentityProviderSettingsRequest): Request[UpdateIdentityProviderSettingsResponse] = js.native
  }
  object LicenseManagerUserSubscriptions {
    @inline implicit def toOps(service: LicenseManagerUserSubscriptions): LicenseManagerUserSubscriptionsOps = {
      new LicenseManagerUserSubscriptionsOps(service)
    }
  }

  /** Details about an Active Directory identity provider.
    */
  @js.native
  trait ActiveDirectoryIdentityProvider extends js.Object {
    var DirectoryId: js.UndefOr[String]
  }

  object ActiveDirectoryIdentityProvider {
    @inline
    def apply(
        DirectoryId: js.UndefOr[String] = js.undefined
    ): ActiveDirectoryIdentityProvider = {
      val __obj = js.Dynamic.literal()
      DirectoryId.foreach(__v => __obj.updateDynamic("DirectoryId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActiveDirectoryIdentityProvider]
    }
  }

  @js.native
  trait AssociateUserRequest extends js.Object {
    var IdentityProvider: IdentityProvider
    var InstanceId: String
    var Username: String
    var Domain: js.UndefOr[String]
  }

  object AssociateUserRequest {
    @inline
    def apply(
        IdentityProvider: IdentityProvider,
        InstanceId: String,
        Username: String,
        Domain: js.UndefOr[String] = js.undefined
    ): AssociateUserRequest = {
      val __obj = js.Dynamic.literal(
        "IdentityProvider" -> IdentityProvider.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "Username" -> Username.asInstanceOf[js.Any]
      )

      Domain.foreach(__v => __obj.updateDynamic("Domain")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateUserRequest]
    }
  }

  @js.native
  trait AssociateUserResponse extends js.Object {
    var InstanceUserSummary: InstanceUserSummary
  }

  object AssociateUserResponse {
    @inline
    def apply(
        InstanceUserSummary: InstanceUserSummary
    ): AssociateUserResponse = {
      val __obj = js.Dynamic.literal(
        "InstanceUserSummary" -> InstanceUserSummary.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociateUserResponse]
    }
  }

  @js.native
  trait DeregisterIdentityProviderRequest extends js.Object {
    var IdentityProvider: IdentityProvider
    var Product: String
  }

  object DeregisterIdentityProviderRequest {
    @inline
    def apply(
        IdentityProvider: IdentityProvider,
        Product: String
    ): DeregisterIdentityProviderRequest = {
      val __obj = js.Dynamic.literal(
        "IdentityProvider" -> IdentityProvider.asInstanceOf[js.Any],
        "Product" -> Product.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeregisterIdentityProviderRequest]
    }
  }

  @js.native
  trait DeregisterIdentityProviderResponse extends js.Object {
    var IdentityProviderSummary: IdentityProviderSummary
  }

  object DeregisterIdentityProviderResponse {
    @inline
    def apply(
        IdentityProviderSummary: IdentityProviderSummary
    ): DeregisterIdentityProviderResponse = {
      val __obj = js.Dynamic.literal(
        "IdentityProviderSummary" -> IdentityProviderSummary.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeregisterIdentityProviderResponse]
    }
  }

  @js.native
  trait DisassociateUserRequest extends js.Object {
    var IdentityProvider: IdentityProvider
    var InstanceId: String
    var Username: String
    var Domain: js.UndefOr[String]
  }

  object DisassociateUserRequest {
    @inline
    def apply(
        IdentityProvider: IdentityProvider,
        InstanceId: String,
        Username: String,
        Domain: js.UndefOr[String] = js.undefined
    ): DisassociateUserRequest = {
      val __obj = js.Dynamic.literal(
        "IdentityProvider" -> IdentityProvider.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "Username" -> Username.asInstanceOf[js.Any]
      )

      Domain.foreach(__v => __obj.updateDynamic("Domain")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociateUserRequest]
    }
  }

  @js.native
  trait DisassociateUserResponse extends js.Object {
    var InstanceUserSummary: InstanceUserSummary
  }

  object DisassociateUserResponse {
    @inline
    def apply(
        InstanceUserSummary: InstanceUserSummary
    ): DisassociateUserResponse = {
      val __obj = js.Dynamic.literal(
        "InstanceUserSummary" -> InstanceUserSummary.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociateUserResponse]
    }
  }

  /** A filter name and value pair that is used to return more specific results from a describe operation. Filters can be used to match a set of resources by specific criteria, such as tags, attributes, or IDs.
    */
  @js.native
  trait Filter extends js.Object {
    var Attribute: js.UndefOr[String]
    var Operation: js.UndefOr[String]
    var Value: js.UndefOr[String]
  }

  object Filter {
    @inline
    def apply(
        Attribute: js.UndefOr[String] = js.undefined,
        Operation: js.UndefOr[String] = js.undefined,
        Value: js.UndefOr[String] = js.undefined
    ): Filter = {
      val __obj = js.Dynamic.literal()
      Attribute.foreach(__v => __obj.updateDynamic("Attribute")(__v.asInstanceOf[js.Any]))
      Operation.foreach(__v => __obj.updateDynamic("Operation")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Filter]
    }
  }

  /** Details about an identity provider.
    */
  @js.native
  trait IdentityProvider extends js.Object {
    var ActiveDirectoryIdentityProvider: js.UndefOr[ActiveDirectoryIdentityProvider]
  }

  object IdentityProvider {
    @inline
    def apply(
        ActiveDirectoryIdentityProvider: js.UndefOr[ActiveDirectoryIdentityProvider] = js.undefined
    ): IdentityProvider = {
      val __obj = js.Dynamic.literal()
      ActiveDirectoryIdentityProvider.foreach(__v => __obj.updateDynamic("ActiveDirectoryIdentityProvider")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IdentityProvider]
    }
  }

  /** Describes an identity provider.
    */
  @js.native
  trait IdentityProviderSummary extends js.Object {
    var IdentityProvider: IdentityProvider
    var Product: String
    var Settings: Settings
    var Status: String
    var FailureMessage: js.UndefOr[String]
  }

  object IdentityProviderSummary {
    @inline
    def apply(
        IdentityProvider: IdentityProvider,
        Product: String,
        Settings: Settings,
        Status: String,
        FailureMessage: js.UndefOr[String] = js.undefined
    ): IdentityProviderSummary = {
      val __obj = js.Dynamic.literal(
        "IdentityProvider" -> IdentityProvider.asInstanceOf[js.Any],
        "Product" -> Product.asInstanceOf[js.Any],
        "Settings" -> Settings.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any]
      )

      FailureMessage.foreach(__v => __obj.updateDynamic("FailureMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IdentityProviderSummary]
    }
  }

  /** Describes an EC2 instance providing user-based subscriptions.
    */
  @js.native
  trait InstanceSummary extends js.Object {
    var InstanceId: String
    var Products: StringList
    var Status: String
    var LastStatusCheckDate: js.UndefOr[String]
    var StatusMessage: js.UndefOr[String]
  }

  object InstanceSummary {
    @inline
    def apply(
        InstanceId: String,
        Products: StringList,
        Status: String,
        LastStatusCheckDate: js.UndefOr[String] = js.undefined,
        StatusMessage: js.UndefOr[String] = js.undefined
    ): InstanceSummary = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "Products" -> Products.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any]
      )

      LastStatusCheckDate.foreach(__v => __obj.updateDynamic("LastStatusCheckDate")(__v.asInstanceOf[js.Any]))
      StatusMessage.foreach(__v => __obj.updateDynamic("StatusMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceSummary]
    }
  }

  /** Describes users of an EC2 instance providing user-based subscriptions.
    */
  @js.native
  trait InstanceUserSummary extends js.Object {
    var IdentityProvider: IdentityProvider
    var InstanceId: String
    var Status: String
    var Username: String
    var AssociationDate: js.UndefOr[String]
    var DisassociationDate: js.UndefOr[String]
    var Domain: js.UndefOr[String]
    var StatusMessage: js.UndefOr[String]
  }

  object InstanceUserSummary {
    @inline
    def apply(
        IdentityProvider: IdentityProvider,
        InstanceId: String,
        Status: String,
        Username: String,
        AssociationDate: js.UndefOr[String] = js.undefined,
        DisassociationDate: js.UndefOr[String] = js.undefined,
        Domain: js.UndefOr[String] = js.undefined,
        StatusMessage: js.UndefOr[String] = js.undefined
    ): InstanceUserSummary = {
      val __obj = js.Dynamic.literal(
        "IdentityProvider" -> IdentityProvider.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any],
        "Username" -> Username.asInstanceOf[js.Any]
      )

      AssociationDate.foreach(__v => __obj.updateDynamic("AssociationDate")(__v.asInstanceOf[js.Any]))
      DisassociationDate.foreach(__v => __obj.updateDynamic("DisassociationDate")(__v.asInstanceOf[js.Any]))
      Domain.foreach(__v => __obj.updateDynamic("Domain")(__v.asInstanceOf[js.Any]))
      StatusMessage.foreach(__v => __obj.updateDynamic("StatusMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceUserSummary]
    }
  }

  @js.native
  trait ListIdentityProvidersRequest extends js.Object {
    var MaxResults: js.UndefOr[BoxInteger]
    var NextToken: js.UndefOr[String]
  }

  object ListIdentityProvidersRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[BoxInteger] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListIdentityProvidersRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListIdentityProvidersRequest]
    }
  }

  @js.native
  trait ListIdentityProvidersResponse extends js.Object {
    var IdentityProviderSummaries: IdentityProviderSummaryList
    var NextToken: js.UndefOr[String]
  }

  object ListIdentityProvidersResponse {
    @inline
    def apply(
        IdentityProviderSummaries: IdentityProviderSummaryList,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListIdentityProvidersResponse = {
      val __obj = js.Dynamic.literal(
        "IdentityProviderSummaries" -> IdentityProviderSummaries.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListIdentityProvidersResponse]
    }
  }

  @js.native
  trait ListInstancesRequest extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[BoxInteger]
    var NextToken: js.UndefOr[String]
  }

  object ListInstancesRequest {
    @inline
    def apply(
        Filters: js.UndefOr[FilterList] = js.undefined,
        MaxResults: js.UndefOr[BoxInteger] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListInstancesRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInstancesRequest]
    }
  }

  @js.native
  trait ListInstancesResponse extends js.Object {
    var InstanceSummaries: js.UndefOr[InstanceSummaryList]
    var NextToken: js.UndefOr[String]
  }

  object ListInstancesResponse {
    @inline
    def apply(
        InstanceSummaries: js.UndefOr[InstanceSummaryList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListInstancesResponse = {
      val __obj = js.Dynamic.literal()
      InstanceSummaries.foreach(__v => __obj.updateDynamic("InstanceSummaries")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInstancesResponse]
    }
  }

  @js.native
  trait ListProductSubscriptionsRequest extends js.Object {
    var IdentityProvider: IdentityProvider
    var Product: String
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[BoxInteger]
    var NextToken: js.UndefOr[String]
  }

  object ListProductSubscriptionsRequest {
    @inline
    def apply(
        IdentityProvider: IdentityProvider,
        Product: String,
        Filters: js.UndefOr[FilterList] = js.undefined,
        MaxResults: js.UndefOr[BoxInteger] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListProductSubscriptionsRequest = {
      val __obj = js.Dynamic.literal(
        "IdentityProvider" -> IdentityProvider.asInstanceOf[js.Any],
        "Product" -> Product.asInstanceOf[js.Any]
      )

      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProductSubscriptionsRequest]
    }
  }

  @js.native
  trait ListProductSubscriptionsResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var ProductUserSummaries: js.UndefOr[ProductUserSummaryList]
  }

  object ListProductSubscriptionsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        ProductUserSummaries: js.UndefOr[ProductUserSummaryList] = js.undefined
    ): ListProductSubscriptionsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ProductUserSummaries.foreach(__v => __obj.updateDynamic("ProductUserSummaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProductSubscriptionsResponse]
    }
  }

  @js.native
  trait ListUserAssociationsRequest extends js.Object {
    var IdentityProvider: IdentityProvider
    var InstanceId: String
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[BoxInteger]
    var NextToken: js.UndefOr[String]
  }

  object ListUserAssociationsRequest {
    @inline
    def apply(
        IdentityProvider: IdentityProvider,
        InstanceId: String,
        Filters: js.UndefOr[FilterList] = js.undefined,
        MaxResults: js.UndefOr[BoxInteger] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListUserAssociationsRequest = {
      val __obj = js.Dynamic.literal(
        "IdentityProvider" -> IdentityProvider.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUserAssociationsRequest]
    }
  }

  @js.native
  trait ListUserAssociationsResponse extends js.Object {
    var InstanceUserSummaries: js.UndefOr[InstanceUserSummaryList]
    var NextToken: js.UndefOr[String]
  }

  object ListUserAssociationsResponse {
    @inline
    def apply(
        InstanceUserSummaries: js.UndefOr[InstanceUserSummaryList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListUserAssociationsResponse = {
      val __obj = js.Dynamic.literal()
      InstanceUserSummaries.foreach(__v => __obj.updateDynamic("InstanceUserSummaries")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUserAssociationsResponse]
    }
  }

  /** The summary of the user-based subscription products for a user.
    */
  @js.native
  trait ProductUserSummary extends js.Object {
    var IdentityProvider: IdentityProvider
    var Product: String
    var Status: String
    var Username: String
    var Domain: js.UndefOr[String]
    var StatusMessage: js.UndefOr[String]
    var SubscriptionEndDate: js.UndefOr[String]
    var SubscriptionStartDate: js.UndefOr[String]
  }

  object ProductUserSummary {
    @inline
    def apply(
        IdentityProvider: IdentityProvider,
        Product: String,
        Status: String,
        Username: String,
        Domain: js.UndefOr[String] = js.undefined,
        StatusMessage: js.UndefOr[String] = js.undefined,
        SubscriptionEndDate: js.UndefOr[String] = js.undefined,
        SubscriptionStartDate: js.UndefOr[String] = js.undefined
    ): ProductUserSummary = {
      val __obj = js.Dynamic.literal(
        "IdentityProvider" -> IdentityProvider.asInstanceOf[js.Any],
        "Product" -> Product.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any],
        "Username" -> Username.asInstanceOf[js.Any]
      )

      Domain.foreach(__v => __obj.updateDynamic("Domain")(__v.asInstanceOf[js.Any]))
      StatusMessage.foreach(__v => __obj.updateDynamic("StatusMessage")(__v.asInstanceOf[js.Any]))
      SubscriptionEndDate.foreach(__v => __obj.updateDynamic("SubscriptionEndDate")(__v.asInstanceOf[js.Any]))
      SubscriptionStartDate.foreach(__v => __obj.updateDynamic("SubscriptionStartDate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProductUserSummary]
    }
  }

  @js.native
  trait RegisterIdentityProviderRequest extends js.Object {
    var IdentityProvider: IdentityProvider
    var Product: String
    var Settings: js.UndefOr[Settings]
  }

  object RegisterIdentityProviderRequest {
    @inline
    def apply(
        IdentityProvider: IdentityProvider,
        Product: String,
        Settings: js.UndefOr[Settings] = js.undefined
    ): RegisterIdentityProviderRequest = {
      val __obj = js.Dynamic.literal(
        "IdentityProvider" -> IdentityProvider.asInstanceOf[js.Any],
        "Product" -> Product.asInstanceOf[js.Any]
      )

      Settings.foreach(__v => __obj.updateDynamic("Settings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterIdentityProviderRequest]
    }
  }

  @js.native
  trait RegisterIdentityProviderResponse extends js.Object {
    var IdentityProviderSummary: IdentityProviderSummary
  }

  object RegisterIdentityProviderResponse {
    @inline
    def apply(
        IdentityProviderSummary: IdentityProviderSummary
    ): RegisterIdentityProviderResponse = {
      val __obj = js.Dynamic.literal(
        "IdentityProviderSummary" -> IdentityProviderSummary.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RegisterIdentityProviderResponse]
    }
  }

  /** The registered identity provider’s product related configuration settings such as the subnets to provision VPC endpoints, and the security group ID that is associated with the VPC endpoints. The security group should permit inbound TCP port 1688 communication from resources in the VPC.
    */
  @js.native
  trait Settings extends js.Object {
    var SecurityGroupId: SecurityGroup
    var Subnets: SettingsSubnetsList
  }

  object Settings {
    @inline
    def apply(
        SecurityGroupId: SecurityGroup,
        Subnets: SettingsSubnetsList
    ): Settings = {
      val __obj = js.Dynamic.literal(
        "SecurityGroupId" -> SecurityGroupId.asInstanceOf[js.Any],
        "Subnets" -> Subnets.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Settings]
    }
  }

  @js.native
  trait StartProductSubscriptionRequest extends js.Object {
    var IdentityProvider: IdentityProvider
    var Product: String
    var Username: String
    var Domain: js.UndefOr[String]
  }

  object StartProductSubscriptionRequest {
    @inline
    def apply(
        IdentityProvider: IdentityProvider,
        Product: String,
        Username: String,
        Domain: js.UndefOr[String] = js.undefined
    ): StartProductSubscriptionRequest = {
      val __obj = js.Dynamic.literal(
        "IdentityProvider" -> IdentityProvider.asInstanceOf[js.Any],
        "Product" -> Product.asInstanceOf[js.Any],
        "Username" -> Username.asInstanceOf[js.Any]
      )

      Domain.foreach(__v => __obj.updateDynamic("Domain")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartProductSubscriptionRequest]
    }
  }

  @js.native
  trait StartProductSubscriptionResponse extends js.Object {
    var ProductUserSummary: ProductUserSummary
  }

  object StartProductSubscriptionResponse {
    @inline
    def apply(
        ProductUserSummary: ProductUserSummary
    ): StartProductSubscriptionResponse = {
      val __obj = js.Dynamic.literal(
        "ProductUserSummary" -> ProductUserSummary.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartProductSubscriptionResponse]
    }
  }

  @js.native
  trait StopProductSubscriptionRequest extends js.Object {
    var IdentityProvider: IdentityProvider
    var Product: String
    var Username: String
    var Domain: js.UndefOr[String]
  }

  object StopProductSubscriptionRequest {
    @inline
    def apply(
        IdentityProvider: IdentityProvider,
        Product: String,
        Username: String,
        Domain: js.UndefOr[String] = js.undefined
    ): StopProductSubscriptionRequest = {
      val __obj = js.Dynamic.literal(
        "IdentityProvider" -> IdentityProvider.asInstanceOf[js.Any],
        "Product" -> Product.asInstanceOf[js.Any],
        "Username" -> Username.asInstanceOf[js.Any]
      )

      Domain.foreach(__v => __obj.updateDynamic("Domain")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopProductSubscriptionRequest]
    }
  }

  @js.native
  trait StopProductSubscriptionResponse extends js.Object {
    var ProductUserSummary: ProductUserSummary
  }

  object StopProductSubscriptionResponse {
    @inline
    def apply(
        ProductUserSummary: ProductUserSummary
    ): StopProductSubscriptionResponse = {
      val __obj = js.Dynamic.literal(
        "ProductUserSummary" -> ProductUserSummary.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StopProductSubscriptionResponse]
    }
  }

  @js.native
  trait UpdateIdentityProviderSettingsRequest extends js.Object {
    var IdentityProvider: IdentityProvider
    var Product: String
    var UpdateSettings: UpdateSettings
  }

  object UpdateIdentityProviderSettingsRequest {
    @inline
    def apply(
        IdentityProvider: IdentityProvider,
        Product: String,
        UpdateSettings: UpdateSettings
    ): UpdateIdentityProviderSettingsRequest = {
      val __obj = js.Dynamic.literal(
        "IdentityProvider" -> IdentityProvider.asInstanceOf[js.Any],
        "Product" -> Product.asInstanceOf[js.Any],
        "UpdateSettings" -> UpdateSettings.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateIdentityProviderSettingsRequest]
    }
  }

  @js.native
  trait UpdateIdentityProviderSettingsResponse extends js.Object {
    var IdentityProviderSummary: IdentityProviderSummary
  }

  object UpdateIdentityProviderSettingsResponse {
    @inline
    def apply(
        IdentityProviderSummary: IdentityProviderSummary
    ): UpdateIdentityProviderSettingsResponse = {
      val __obj = js.Dynamic.literal(
        "IdentityProviderSummary" -> IdentityProviderSummary.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateIdentityProviderSettingsResponse]
    }
  }

  /** Updates the registered identity provider’s product related configuration settings such as the subnets to provision VPC endpoints.
    */
  @js.native
  trait UpdateSettings extends js.Object {
    var AddSubnets: Subnets
    var RemoveSubnets: Subnets
    var SecurityGroupId: js.UndefOr[SecurityGroup]
  }

  object UpdateSettings {
    @inline
    def apply(
        AddSubnets: Subnets,
        RemoveSubnets: Subnets,
        SecurityGroupId: js.UndefOr[SecurityGroup] = js.undefined
    ): UpdateSettings = {
      val __obj = js.Dynamic.literal(
        "AddSubnets" -> AddSubnets.asInstanceOf[js.Any],
        "RemoveSubnets" -> RemoveSubnets.asInstanceOf[js.Any]
      )

      SecurityGroupId.foreach(__v => __obj.updateDynamic("SecurityGroupId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSettings]
    }
  }
}
