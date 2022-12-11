package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object securitylake {
  type AccessTypeList = js.Array[AccessType]
  type AccountList = js.Array[String]
  type AccountSourcesList = js.Array[AccountSources]
  type AllDimensionsMap = js.Dictionary[TwoDimensionsMap]
  type AutoEnableNewRegionConfigurationList = js.Array[AutoEnableNewRegionConfiguration]
  type AwsAccountId = String
  type AwsSourceTypeList = js.Array[AwsLogSourceType]
  type CreateSubscriberRequestSubscriberNameString = String
  type CreateSubscriptionNotificationConfigurationRequestSubscriptionEndpointString = String
  type CustomSourceType = String
  type DimensionSet = js.Array[Dimension]
  type FailuresResponseList = js.Array[FailuresResponse]
  type Failureslist = js.Array[Failures]
  type InputSet = js.Array[SafeString]
  type LakeConfigurationRequestMap = js.Dictionary[LakeConfigurationRequest]
  type LakeConfigurationResponseMap = js.Dictionary[LakeConfigurationResponse]
  type LogsStatusList = js.Array[LogsStatus]
  type RegionSet = js.Array[Region]
  type RegionSourceTypesAccountsList = js.Array[AllDimensionsMap]
  type RetentionSettingList = js.Array[RetentionSetting]
  type RetentionSettingRetentionPeriodInteger = Int
  type RoleArn = String
  type S3BucketArn = String
  type SafeString = String
  type SnsTopicArn = String
  type SourceTypeList = js.Array[SourceType]
  type SubscriberList = js.Array[SubscriberResource]
  type SyntheticTimestamp_date_time = js.Date
  type TagsMap = js.Dictionary[String]
  type TwoDimensionsMap = js.Dictionary[ValueSet]
  type UUID = String
  type UpdateDatalakeExceptionsExpiryRequestExceptionMessageExpiryLong = Double
  type UpdateSubscriberRequestSubscriberNameString = String
  type UpdateSubscriptionNotificationConfigurationRequestSubscriptionEndpointString = String
  type ValueSet = js.Array[String]

  final class SecurityLakeOps(private val service: SecurityLake) extends AnyVal {

    @inline def createAwsLogSourceFuture(params: CreateAwsLogSourceRequest): Future[CreateAwsLogSourceResponse] = service.createAwsLogSource(params).promise().toFuture
    @inline def createCustomLogSourceFuture(params: CreateCustomLogSourceRequest): Future[CreateCustomLogSourceResponse] = service.createCustomLogSource(params).promise().toFuture
    @inline def createDatalakeAutoEnableFuture(params: CreateDatalakeAutoEnableRequest): Future[CreateDatalakeAutoEnableResponse] = service.createDatalakeAutoEnable(params).promise().toFuture
    @inline def createDatalakeDelegatedAdminFuture(params: CreateDatalakeDelegatedAdminRequest): Future[CreateDatalakeDelegatedAdminResponse] = service.createDatalakeDelegatedAdmin(params).promise().toFuture
    @inline def createDatalakeExceptionsSubscriptionFuture(params: CreateDatalakeExceptionsSubscriptionRequest): Future[CreateDatalakeExceptionsSubscriptionResponse] = service.createDatalakeExceptionsSubscription(params).promise().toFuture
    @inline def createDatalakeFuture(params: CreateDatalakeRequest): Future[CreateDatalakeResponse] = service.createDatalake(params).promise().toFuture
    @inline def createSubscriberFuture(params: CreateSubscriberRequest): Future[CreateSubscriberResponse] = service.createSubscriber(params).promise().toFuture
    @inline def createSubscriptionNotificationConfigurationFuture(params: CreateSubscriptionNotificationConfigurationRequest): Future[CreateSubscriptionNotificationConfigurationResponse] = service.createSubscriptionNotificationConfiguration(params).promise().toFuture
    @inline def deleteAwsLogSourceFuture(params: DeleteAwsLogSourceRequest): Future[DeleteAwsLogSourceResponse] = service.deleteAwsLogSource(params).promise().toFuture
    @inline def deleteCustomLogSourceFuture(params: DeleteCustomLogSourceRequest): Future[DeleteCustomLogSourceResponse] = service.deleteCustomLogSource(params).promise().toFuture
    @inline def deleteDatalakeAutoEnableFuture(params: DeleteDatalakeAutoEnableRequest): Future[DeleteDatalakeAutoEnableResponse] = service.deleteDatalakeAutoEnable(params).promise().toFuture
    @inline def deleteDatalakeDelegatedAdminFuture(params: DeleteDatalakeDelegatedAdminRequest): Future[DeleteDatalakeDelegatedAdminResponse] = service.deleteDatalakeDelegatedAdmin(params).promise().toFuture
    @inline def deleteDatalakeExceptionsSubscriptionFuture(params: DeleteDatalakeExceptionsSubscriptionRequest): Future[DeleteDatalakeExceptionsSubscriptionResponse] = service.deleteDatalakeExceptionsSubscription(params).promise().toFuture
    @inline def deleteDatalakeFuture(params: DeleteDatalakeRequest): Future[DeleteDatalakeResponse] = service.deleteDatalake(params).promise().toFuture
    @inline def deleteSubscriberFuture(params: DeleteSubscriberRequest): Future[DeleteSubscriberResponse] = service.deleteSubscriber(params).promise().toFuture
    @inline def deleteSubscriptionNotificationConfigurationFuture(params: DeleteSubscriptionNotificationConfigurationRequest): Future[DeleteSubscriptionNotificationConfigurationResponse] = service.deleteSubscriptionNotificationConfiguration(params).promise().toFuture
    @inline def getDatalakeAutoEnableFuture(params: GetDatalakeAutoEnableRequest): Future[GetDatalakeAutoEnableResponse] = service.getDatalakeAutoEnable(params).promise().toFuture
    @inline def getDatalakeExceptionsExpiryFuture(params: GetDatalakeExceptionsExpiryRequest): Future[GetDatalakeExceptionsExpiryResponse] = service.getDatalakeExceptionsExpiry(params).promise().toFuture
    @inline def getDatalakeExceptionsSubscriptionFuture(params: GetDatalakeExceptionsSubscriptionRequest): Future[GetDatalakeExceptionsSubscriptionResponse] = service.getDatalakeExceptionsSubscription(params).promise().toFuture
    @inline def getDatalakeFuture(params: GetDatalakeRequest): Future[GetDatalakeResponse] = service.getDatalake(params).promise().toFuture
    @inline def getDatalakeStatusFuture(params: GetDatalakeStatusRequest): Future[GetDatalakeStatusResponse] = service.getDatalakeStatus(params).promise().toFuture
    @inline def getSubscriberFuture(params: GetSubscriberRequest): Future[GetSubscriberResponse] = service.getSubscriber(params).promise().toFuture
    @inline def listDatalakeExceptionsFuture(params: ListDatalakeExceptionsRequest): Future[ListDatalakeExceptionsResponse] = service.listDatalakeExceptions(params).promise().toFuture
    @inline def listLogSourcesFuture(params: ListLogSourcesRequest): Future[ListLogSourcesResponse] = service.listLogSources(params).promise().toFuture
    @inline def listSubscribersFuture(params: ListSubscribersRequest): Future[ListSubscribersResponse] = service.listSubscribers(params).promise().toFuture
    @inline def updateDatalakeExceptionsExpiryFuture(params: UpdateDatalakeExceptionsExpiryRequest): Future[UpdateDatalakeExceptionsExpiryResponse] = service.updateDatalakeExceptionsExpiry(params).promise().toFuture
    @inline def updateDatalakeExceptionsSubscriptionFuture(params: UpdateDatalakeExceptionsSubscriptionRequest): Future[UpdateDatalakeExceptionsSubscriptionResponse] = service.updateDatalakeExceptionsSubscription(params).promise().toFuture
    @inline def updateDatalakeFuture(params: UpdateDatalakeRequest): Future[UpdateDatalakeResponse] = service.updateDatalake(params).promise().toFuture
    @inline def updateSubscriberFuture(params: UpdateSubscriberRequest): Future[UpdateSubscriberResponse] = service.updateSubscriber(params).promise().toFuture
    @inline def updateSubscriptionNotificationConfigurationFuture(params: UpdateSubscriptionNotificationConfigurationRequest): Future[UpdateSubscriptionNotificationConfigurationResponse] = service.updateSubscriptionNotificationConfiguration(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/securitylake", JSImport.Namespace, "AWS.SecurityLake")
  class SecurityLake() extends js.Object {
    def this(config: AWSConfig) = this()

    def createAwsLogSource(params: CreateAwsLogSourceRequest): Request[CreateAwsLogSourceResponse] = js.native
    def createCustomLogSource(params: CreateCustomLogSourceRequest): Request[CreateCustomLogSourceResponse] = js.native
    def createDatalake(params: CreateDatalakeRequest): Request[CreateDatalakeResponse] = js.native
    def createDatalakeAutoEnable(params: CreateDatalakeAutoEnableRequest): Request[CreateDatalakeAutoEnableResponse] = js.native
    def createDatalakeDelegatedAdmin(params: CreateDatalakeDelegatedAdminRequest): Request[CreateDatalakeDelegatedAdminResponse] = js.native
    def createDatalakeExceptionsSubscription(params: CreateDatalakeExceptionsSubscriptionRequest): Request[CreateDatalakeExceptionsSubscriptionResponse] = js.native
    def createSubscriber(params: CreateSubscriberRequest): Request[CreateSubscriberResponse] = js.native
    def createSubscriptionNotificationConfiguration(params: CreateSubscriptionNotificationConfigurationRequest): Request[CreateSubscriptionNotificationConfigurationResponse] = js.native
    def deleteAwsLogSource(params: DeleteAwsLogSourceRequest): Request[DeleteAwsLogSourceResponse] = js.native
    def deleteCustomLogSource(params: DeleteCustomLogSourceRequest): Request[DeleteCustomLogSourceResponse] = js.native
    def deleteDatalake(params: DeleteDatalakeRequest): Request[DeleteDatalakeResponse] = js.native
    def deleteDatalakeAutoEnable(params: DeleteDatalakeAutoEnableRequest): Request[DeleteDatalakeAutoEnableResponse] = js.native
    def deleteDatalakeDelegatedAdmin(params: DeleteDatalakeDelegatedAdminRequest): Request[DeleteDatalakeDelegatedAdminResponse] = js.native
    def deleteDatalakeExceptionsSubscription(params: DeleteDatalakeExceptionsSubscriptionRequest): Request[DeleteDatalakeExceptionsSubscriptionResponse] = js.native
    def deleteSubscriber(params: DeleteSubscriberRequest): Request[DeleteSubscriberResponse] = js.native
    def deleteSubscriptionNotificationConfiguration(params: DeleteSubscriptionNotificationConfigurationRequest): Request[DeleteSubscriptionNotificationConfigurationResponse] = js.native
    def getDatalake(params: GetDatalakeRequest): Request[GetDatalakeResponse] = js.native
    def getDatalakeAutoEnable(params: GetDatalakeAutoEnableRequest): Request[GetDatalakeAutoEnableResponse] = js.native
    def getDatalakeExceptionsExpiry(params: GetDatalakeExceptionsExpiryRequest): Request[GetDatalakeExceptionsExpiryResponse] = js.native
    def getDatalakeExceptionsSubscription(params: GetDatalakeExceptionsSubscriptionRequest): Request[GetDatalakeExceptionsSubscriptionResponse] = js.native
    def getDatalakeStatus(params: GetDatalakeStatusRequest): Request[GetDatalakeStatusResponse] = js.native
    def getSubscriber(params: GetSubscriberRequest): Request[GetSubscriberResponse] = js.native
    def listDatalakeExceptions(params: ListDatalakeExceptionsRequest): Request[ListDatalakeExceptionsResponse] = js.native
    def listLogSources(params: ListLogSourcesRequest): Request[ListLogSourcesResponse] = js.native
    def listSubscribers(params: ListSubscribersRequest): Request[ListSubscribersResponse] = js.native
    def updateDatalake(params: UpdateDatalakeRequest): Request[UpdateDatalakeResponse] = js.native
    def updateDatalakeExceptionsExpiry(params: UpdateDatalakeExceptionsExpiryRequest): Request[UpdateDatalakeExceptionsExpiryResponse] = js.native
    def updateDatalakeExceptionsSubscription(params: UpdateDatalakeExceptionsSubscriptionRequest): Request[UpdateDatalakeExceptionsSubscriptionResponse] = js.native
    def updateSubscriber(params: UpdateSubscriberRequest): Request[UpdateSubscriberResponse] = js.native
    def updateSubscriptionNotificationConfiguration(params: UpdateSubscriptionNotificationConfigurationRequest): Request[UpdateSubscriptionNotificationConfigurationResponse] = js.native
  }
  object SecurityLake {
    @inline implicit def toOps(service: SecurityLake): SecurityLakeOps = {
      new SecurityLakeOps(service)
    }
  }

  /** Security Lake can collect logs and events from supported Amazon Web Services services and custom sources.
    */
  @js.native
  trait AccountSources extends js.Object {
    var account: String
    var sourceType: String
    var eventClass: js.UndefOr[OcsfEventClass]
    var logsStatus: js.UndefOr[LogsStatusList]
  }

  object AccountSources {
    @inline
    def apply(
        account: String,
        sourceType: String,
        eventClass: js.UndefOr[OcsfEventClass] = js.undefined,
        logsStatus: js.UndefOr[LogsStatusList] = js.undefined
    ): AccountSources = {
      val __obj = js.Dynamic.literal(
        "account" -> account.asInstanceOf[js.Any],
        "sourceType" -> sourceType.asInstanceOf[js.Any]
      )

      eventClass.foreach(__v => __obj.updateDynamic("eventClass")(__v.asInstanceOf[js.Any]))
      logsStatus.foreach(__v => __obj.updateDynamic("logsStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccountSources]
    }
  }

  /** Automatically enable new organization accounts as member accounts from a Security Lake administrator account.
    */
  @js.native
  trait AutoEnableNewRegionConfiguration extends js.Object {
    var region: Region
    var sources: AwsSourceTypeList
  }

  object AutoEnableNewRegionConfiguration {
    @inline
    def apply(
        region: Region,
        sources: AwsSourceTypeList
    ): AutoEnableNewRegionConfiguration = {
      val __obj = js.Dynamic.literal(
        "region" -> region.asInstanceOf[js.Any],
        "sources" -> sources.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AutoEnableNewRegionConfiguration]
    }
  }

  @js.native
  trait CreateAwsLogSourceRequest extends js.Object {
    var inputOrder: DimensionSet
    var enableAllDimensions: js.UndefOr[AllDimensionsMap]
    var enableSingleDimension: js.UndefOr[InputSet]
    var enableTwoDimensions: js.UndefOr[TwoDimensionsMap]
  }

  object CreateAwsLogSourceRequest {
    @inline
    def apply(
        inputOrder: DimensionSet,
        enableAllDimensions: js.UndefOr[AllDimensionsMap] = js.undefined,
        enableSingleDimension: js.UndefOr[InputSet] = js.undefined,
        enableTwoDimensions: js.UndefOr[TwoDimensionsMap] = js.undefined
    ): CreateAwsLogSourceRequest = {
      val __obj = js.Dynamic.literal(
        "inputOrder" -> inputOrder.asInstanceOf[js.Any]
      )

      enableAllDimensions.foreach(__v => __obj.updateDynamic("enableAllDimensions")(__v.asInstanceOf[js.Any]))
      enableSingleDimension.foreach(__v => __obj.updateDynamic("enableSingleDimension")(__v.asInstanceOf[js.Any]))
      enableTwoDimensions.foreach(__v => __obj.updateDynamic("enableTwoDimensions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAwsLogSourceRequest]
    }
  }

  @js.native
  trait CreateAwsLogSourceResponse extends js.Object {
    var failed: js.UndefOr[AccountList]
    var processing: js.UndefOr[AccountList]
  }

  object CreateAwsLogSourceResponse {
    @inline
    def apply(
        failed: js.UndefOr[AccountList] = js.undefined,
        processing: js.UndefOr[AccountList] = js.undefined
    ): CreateAwsLogSourceResponse = {
      val __obj = js.Dynamic.literal()
      failed.foreach(__v => __obj.updateDynamic("failed")(__v.asInstanceOf[js.Any]))
      processing.foreach(__v => __obj.updateDynamic("processing")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAwsLogSourceResponse]
    }
  }

  @js.native
  trait CreateCustomLogSourceRequest extends js.Object {
    var customSourceName: CustomSourceType
    var eventClass: OcsfEventClass
    var glueInvocationRoleArn: RoleArn
    var logProviderAccountId: AwsAccountId
  }

  object CreateCustomLogSourceRequest {
    @inline
    def apply(
        customSourceName: CustomSourceType,
        eventClass: OcsfEventClass,
        glueInvocationRoleArn: RoleArn,
        logProviderAccountId: AwsAccountId
    ): CreateCustomLogSourceRequest = {
      val __obj = js.Dynamic.literal(
        "customSourceName" -> customSourceName.asInstanceOf[js.Any],
        "eventClass" -> eventClass.asInstanceOf[js.Any],
        "glueInvocationRoleArn" -> glueInvocationRoleArn.asInstanceOf[js.Any],
        "logProviderAccountId" -> logProviderAccountId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateCustomLogSourceRequest]
    }
  }

  @js.native
  trait CreateCustomLogSourceResponse extends js.Object {
    var customDataLocation: String
    var glueCrawlerName: String
    var glueDatabaseName: String
    var glueTableName: String
    var logProviderAccessRoleArn: String
  }

  object CreateCustomLogSourceResponse {
    @inline
    def apply(
        customDataLocation: String,
        glueCrawlerName: String,
        glueDatabaseName: String,
        glueTableName: String,
        logProviderAccessRoleArn: String
    ): CreateCustomLogSourceResponse = {
      val __obj = js.Dynamic.literal(
        "customDataLocation" -> customDataLocation.asInstanceOf[js.Any],
        "glueCrawlerName" -> glueCrawlerName.asInstanceOf[js.Any],
        "glueDatabaseName" -> glueDatabaseName.asInstanceOf[js.Any],
        "glueTableName" -> glueTableName.asInstanceOf[js.Any],
        "logProviderAccessRoleArn" -> logProviderAccessRoleArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateCustomLogSourceResponse]
    }
  }

  @js.native
  trait CreateDatalakeAutoEnableRequest extends js.Object {
    var configurationForNewAccounts: AutoEnableNewRegionConfigurationList
  }

  object CreateDatalakeAutoEnableRequest {
    @inline
    def apply(
        configurationForNewAccounts: AutoEnableNewRegionConfigurationList
    ): CreateDatalakeAutoEnableRequest = {
      val __obj = js.Dynamic.literal(
        "configurationForNewAccounts" -> configurationForNewAccounts.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateDatalakeAutoEnableRequest]
    }
  }

  @js.native
  trait CreateDatalakeAutoEnableResponse extends js.Object

  object CreateDatalakeAutoEnableResponse {
    @inline
    def apply(): CreateDatalakeAutoEnableResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateDatalakeAutoEnableResponse]
    }
  }

  @js.native
  trait CreateDatalakeDelegatedAdminRequest extends js.Object {
    var account: SafeString
  }

  object CreateDatalakeDelegatedAdminRequest {
    @inline
    def apply(
        account: SafeString
    ): CreateDatalakeDelegatedAdminRequest = {
      val __obj = js.Dynamic.literal(
        "account" -> account.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateDatalakeDelegatedAdminRequest]
    }
  }

  @js.native
  trait CreateDatalakeDelegatedAdminResponse extends js.Object

  object CreateDatalakeDelegatedAdminResponse {
    @inline
    def apply(): CreateDatalakeDelegatedAdminResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateDatalakeDelegatedAdminResponse]
    }
  }

  @js.native
  trait CreateDatalakeExceptionsSubscriptionRequest extends js.Object {
    var notificationEndpoint: SafeString
    var subscriptionProtocol: SubscriptionProtocolType
  }

  object CreateDatalakeExceptionsSubscriptionRequest {
    @inline
    def apply(
        notificationEndpoint: SafeString,
        subscriptionProtocol: SubscriptionProtocolType
    ): CreateDatalakeExceptionsSubscriptionRequest = {
      val __obj = js.Dynamic.literal(
        "notificationEndpoint" -> notificationEndpoint.asInstanceOf[js.Any],
        "subscriptionProtocol" -> subscriptionProtocol.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateDatalakeExceptionsSubscriptionRequest]
    }
  }

  @js.native
  trait CreateDatalakeExceptionsSubscriptionResponse extends js.Object

  object CreateDatalakeExceptionsSubscriptionResponse {
    @inline
    def apply(): CreateDatalakeExceptionsSubscriptionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateDatalakeExceptionsSubscriptionResponse]
    }
  }

  @js.native
  trait CreateDatalakeRequest extends js.Object {
    var configurations: js.UndefOr[LakeConfigurationRequestMap]
    var enableAll: js.UndefOr[Boolean]
    var metaStoreManagerRoleArn: js.UndefOr[RoleArn]
    var regions: js.UndefOr[RegionSet]
  }

  object CreateDatalakeRequest {
    @inline
    def apply(
        configurations: js.UndefOr[LakeConfigurationRequestMap] = js.undefined,
        enableAll: js.UndefOr[Boolean] = js.undefined,
        metaStoreManagerRoleArn: js.UndefOr[RoleArn] = js.undefined,
        regions: js.UndefOr[RegionSet] = js.undefined
    ): CreateDatalakeRequest = {
      val __obj = js.Dynamic.literal()
      configurations.foreach(__v => __obj.updateDynamic("configurations")(__v.asInstanceOf[js.Any]))
      enableAll.foreach(__v => __obj.updateDynamic("enableAll")(__v.asInstanceOf[js.Any]))
      metaStoreManagerRoleArn.foreach(__v => __obj.updateDynamic("metaStoreManagerRoleArn")(__v.asInstanceOf[js.Any]))
      regions.foreach(__v => __obj.updateDynamic("regions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDatalakeRequest]
    }
  }

  @js.native
  trait CreateDatalakeResponse extends js.Object

  object CreateDatalakeResponse {
    @inline
    def apply(): CreateDatalakeResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateDatalakeResponse]
    }
  }

  @js.native
  trait CreateSubscriberRequest extends js.Object {
    var accountId: AwsAccountId
    var externalId: SafeString
    var sourceTypes: SourceTypeList
    var subscriberName: CreateSubscriberRequestSubscriberNameString
    var accessTypes: js.UndefOr[AccessTypeList]
    var subscriberDescription: js.UndefOr[SafeString]
  }

  object CreateSubscriberRequest {
    @inline
    def apply(
        accountId: AwsAccountId,
        externalId: SafeString,
        sourceTypes: SourceTypeList,
        subscriberName: CreateSubscriberRequestSubscriberNameString,
        accessTypes: js.UndefOr[AccessTypeList] = js.undefined,
        subscriberDescription: js.UndefOr[SafeString] = js.undefined
    ): CreateSubscriberRequest = {
      val __obj = js.Dynamic.literal(
        "accountId" -> accountId.asInstanceOf[js.Any],
        "externalId" -> externalId.asInstanceOf[js.Any],
        "sourceTypes" -> sourceTypes.asInstanceOf[js.Any],
        "subscriberName" -> subscriberName.asInstanceOf[js.Any]
      )

      accessTypes.foreach(__v => __obj.updateDynamic("accessTypes")(__v.asInstanceOf[js.Any]))
      subscriberDescription.foreach(__v => __obj.updateDynamic("subscriberDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSubscriberRequest]
    }
  }

  @js.native
  trait CreateSubscriberResponse extends js.Object {
    var subscriptionId: UUID
    var roleArn: js.UndefOr[RoleArn]
    var s3BucketArn: js.UndefOr[S3BucketArn]
    var snsArn: js.UndefOr[SnsTopicArn]
  }

  object CreateSubscriberResponse {
    @inline
    def apply(
        subscriptionId: UUID,
        roleArn: js.UndefOr[RoleArn] = js.undefined,
        s3BucketArn: js.UndefOr[S3BucketArn] = js.undefined,
        snsArn: js.UndefOr[SnsTopicArn] = js.undefined
    ): CreateSubscriberResponse = {
      val __obj = js.Dynamic.literal(
        "subscriptionId" -> subscriptionId.asInstanceOf[js.Any]
      )

      roleArn.foreach(__v => __obj.updateDynamic("roleArn")(__v.asInstanceOf[js.Any]))
      s3BucketArn.foreach(__v => __obj.updateDynamic("s3BucketArn")(__v.asInstanceOf[js.Any]))
      snsArn.foreach(__v => __obj.updateDynamic("snsArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSubscriberResponse]
    }
  }

  @js.native
  trait CreateSubscriptionNotificationConfigurationRequest extends js.Object {
    var subscriptionId: UUID
    var createSqs: js.UndefOr[Boolean]
    var httpsApiKeyName: js.UndefOr[String]
    var httpsApiKeyValue: js.UndefOr[String]
    var httpsMethod: js.UndefOr[HttpsMethod]
    var roleArn: js.UndefOr[RoleArn]
    var subscriptionEndpoint: js.UndefOr[CreateSubscriptionNotificationConfigurationRequestSubscriptionEndpointString]
  }

  object CreateSubscriptionNotificationConfigurationRequest {
    @inline
    def apply(
        subscriptionId: UUID,
        createSqs: js.UndefOr[Boolean] = js.undefined,
        httpsApiKeyName: js.UndefOr[String] = js.undefined,
        httpsApiKeyValue: js.UndefOr[String] = js.undefined,
        httpsMethod: js.UndefOr[HttpsMethod] = js.undefined,
        roleArn: js.UndefOr[RoleArn] = js.undefined,
        subscriptionEndpoint: js.UndefOr[CreateSubscriptionNotificationConfigurationRequestSubscriptionEndpointString] = js.undefined
    ): CreateSubscriptionNotificationConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "subscriptionId" -> subscriptionId.asInstanceOf[js.Any]
      )

      createSqs.foreach(__v => __obj.updateDynamic("createSqs")(__v.asInstanceOf[js.Any]))
      httpsApiKeyName.foreach(__v => __obj.updateDynamic("httpsApiKeyName")(__v.asInstanceOf[js.Any]))
      httpsApiKeyValue.foreach(__v => __obj.updateDynamic("httpsApiKeyValue")(__v.asInstanceOf[js.Any]))
      httpsMethod.foreach(__v => __obj.updateDynamic("httpsMethod")(__v.asInstanceOf[js.Any]))
      roleArn.foreach(__v => __obj.updateDynamic("roleArn")(__v.asInstanceOf[js.Any]))
      subscriptionEndpoint.foreach(__v => __obj.updateDynamic("subscriptionEndpoint")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSubscriptionNotificationConfigurationRequest]
    }
  }

  @js.native
  trait CreateSubscriptionNotificationConfigurationResponse extends js.Object {
    var queueArn: js.UndefOr[SafeString]
  }

  object CreateSubscriptionNotificationConfigurationResponse {
    @inline
    def apply(
        queueArn: js.UndefOr[SafeString] = js.undefined
    ): CreateSubscriptionNotificationConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      queueArn.foreach(__v => __obj.updateDynamic("queueArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSubscriptionNotificationConfigurationResponse]
    }
  }

  @js.native
  trait DeleteAwsLogSourceRequest extends js.Object {
    var inputOrder: DimensionSet
    var disableAllDimensions: js.UndefOr[AllDimensionsMap]
    var disableSingleDimension: js.UndefOr[InputSet]
    var disableTwoDimensions: js.UndefOr[TwoDimensionsMap]
  }

  object DeleteAwsLogSourceRequest {
    @inline
    def apply(
        inputOrder: DimensionSet,
        disableAllDimensions: js.UndefOr[AllDimensionsMap] = js.undefined,
        disableSingleDimension: js.UndefOr[InputSet] = js.undefined,
        disableTwoDimensions: js.UndefOr[TwoDimensionsMap] = js.undefined
    ): DeleteAwsLogSourceRequest = {
      val __obj = js.Dynamic.literal(
        "inputOrder" -> inputOrder.asInstanceOf[js.Any]
      )

      disableAllDimensions.foreach(__v => __obj.updateDynamic("disableAllDimensions")(__v.asInstanceOf[js.Any]))
      disableSingleDimension.foreach(__v => __obj.updateDynamic("disableSingleDimension")(__v.asInstanceOf[js.Any]))
      disableTwoDimensions.foreach(__v => __obj.updateDynamic("disableTwoDimensions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteAwsLogSourceRequest]
    }
  }

  @js.native
  trait DeleteAwsLogSourceResponse extends js.Object {
    var failed: js.UndefOr[AccountList]
    var processing: js.UndefOr[AccountList]
  }

  object DeleteAwsLogSourceResponse {
    @inline
    def apply(
        failed: js.UndefOr[AccountList] = js.undefined,
        processing: js.UndefOr[AccountList] = js.undefined
    ): DeleteAwsLogSourceResponse = {
      val __obj = js.Dynamic.literal()
      failed.foreach(__v => __obj.updateDynamic("failed")(__v.asInstanceOf[js.Any]))
      processing.foreach(__v => __obj.updateDynamic("processing")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteAwsLogSourceResponse]
    }
  }

  @js.native
  trait DeleteCustomLogSourceRequest extends js.Object {
    var customSourceName: String
  }

  object DeleteCustomLogSourceRequest {
    @inline
    def apply(
        customSourceName: String
    ): DeleteCustomLogSourceRequest = {
      val __obj = js.Dynamic.literal(
        "customSourceName" -> customSourceName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteCustomLogSourceRequest]
    }
  }

  @js.native
  trait DeleteCustomLogSourceResponse extends js.Object {
    var customDataLocation: String
  }

  object DeleteCustomLogSourceResponse {
    @inline
    def apply(
        customDataLocation: String
    ): DeleteCustomLogSourceResponse = {
      val __obj = js.Dynamic.literal(
        "customDataLocation" -> customDataLocation.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteCustomLogSourceResponse]
    }
  }

  @js.native
  trait DeleteDatalakeAutoEnableRequest extends js.Object {
    var removeFromConfigurationForNewAccounts: AutoEnableNewRegionConfigurationList
  }

  object DeleteDatalakeAutoEnableRequest {
    @inline
    def apply(
        removeFromConfigurationForNewAccounts: AutoEnableNewRegionConfigurationList
    ): DeleteDatalakeAutoEnableRequest = {
      val __obj = js.Dynamic.literal(
        "removeFromConfigurationForNewAccounts" -> removeFromConfigurationForNewAccounts.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteDatalakeAutoEnableRequest]
    }
  }

  @js.native
  trait DeleteDatalakeAutoEnableResponse extends js.Object

  object DeleteDatalakeAutoEnableResponse {
    @inline
    def apply(): DeleteDatalakeAutoEnableResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteDatalakeAutoEnableResponse]
    }
  }

  @js.native
  trait DeleteDatalakeDelegatedAdminRequest extends js.Object {
    var account: SafeString
  }

  object DeleteDatalakeDelegatedAdminRequest {
    @inline
    def apply(
        account: SafeString
    ): DeleteDatalakeDelegatedAdminRequest = {
      val __obj = js.Dynamic.literal(
        "account" -> account.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteDatalakeDelegatedAdminRequest]
    }
  }

  @js.native
  trait DeleteDatalakeDelegatedAdminResponse extends js.Object

  object DeleteDatalakeDelegatedAdminResponse {
    @inline
    def apply(): DeleteDatalakeDelegatedAdminResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteDatalakeDelegatedAdminResponse]
    }
  }

  @js.native
  trait DeleteDatalakeExceptionsSubscriptionRequest extends js.Object

  object DeleteDatalakeExceptionsSubscriptionRequest {
    @inline
    def apply(): DeleteDatalakeExceptionsSubscriptionRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteDatalakeExceptionsSubscriptionRequest]
    }
  }

  @js.native
  trait DeleteDatalakeExceptionsSubscriptionResponse extends js.Object {
    var status: SafeString
  }

  object DeleteDatalakeExceptionsSubscriptionResponse {
    @inline
    def apply(
        status: SafeString
    ): DeleteDatalakeExceptionsSubscriptionResponse = {
      val __obj = js.Dynamic.literal(
        "status" -> status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteDatalakeExceptionsSubscriptionResponse]
    }
  }

  @js.native
  trait DeleteDatalakeRequest extends js.Object

  object DeleteDatalakeRequest {
    @inline
    def apply(): DeleteDatalakeRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteDatalakeRequest]
    }
  }

  @js.native
  trait DeleteDatalakeResponse extends js.Object

  object DeleteDatalakeResponse {
    @inline
    def apply(): DeleteDatalakeResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteDatalakeResponse]
    }
  }

  @js.native
  trait DeleteSubscriberRequest extends js.Object {
    var id: String
  }

  object DeleteSubscriberRequest {
    @inline
    def apply(
        id: String
    ): DeleteSubscriberRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteSubscriberRequest]
    }
  }

  @js.native
  trait DeleteSubscriberResponse extends js.Object

  object DeleteSubscriberResponse {
    @inline
    def apply(): DeleteSubscriberResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteSubscriberResponse]
    }
  }

  @js.native
  trait DeleteSubscriptionNotificationConfigurationRequest extends js.Object {
    var subscriptionId: UUID
  }

  object DeleteSubscriptionNotificationConfigurationRequest {
    @inline
    def apply(
        subscriptionId: UUID
    ): DeleteSubscriptionNotificationConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "subscriptionId" -> subscriptionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteSubscriptionNotificationConfigurationRequest]
    }
  }

  @js.native
  trait DeleteSubscriptionNotificationConfigurationResponse extends js.Object

  object DeleteSubscriptionNotificationConfigurationResponse {
    @inline
    def apply(): DeleteSubscriptionNotificationConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteSubscriptionNotificationConfigurationResponse]
    }
  }

  /** List of all failures.
    */
  @js.native
  trait Failures extends js.Object {
    var exceptionMessage: SafeString
    var remediation: SafeString
    var timestamp: SyntheticTimestamp_date_time
  }

  object Failures {
    @inline
    def apply(
        exceptionMessage: SafeString,
        remediation: SafeString,
        timestamp: SyntheticTimestamp_date_time
    ): Failures = {
      val __obj = js.Dynamic.literal(
        "exceptionMessage" -> exceptionMessage.asInstanceOf[js.Any],
        "remediation" -> remediation.asInstanceOf[js.Any],
        "timestamp" -> timestamp.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Failures]
    }
  }

  /** Response element for actions which make changes namely create, update, or delete actions.
    */
  @js.native
  trait FailuresResponse extends js.Object {
    var failures: js.UndefOr[Failureslist]
    var region: js.UndefOr[SafeString]
  }

  object FailuresResponse {
    @inline
    def apply(
        failures: js.UndefOr[Failureslist] = js.undefined,
        region: js.UndefOr[SafeString] = js.undefined
    ): FailuresResponse = {
      val __obj = js.Dynamic.literal()
      failures.foreach(__v => __obj.updateDynamic("failures")(__v.asInstanceOf[js.Any]))
      region.foreach(__v => __obj.updateDynamic("region")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FailuresResponse]
    }
  }

  @js.native
  trait GetDatalakeAutoEnableRequest extends js.Object

  object GetDatalakeAutoEnableRequest {
    @inline
    def apply(): GetDatalakeAutoEnableRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetDatalakeAutoEnableRequest]
    }
  }

  @js.native
  trait GetDatalakeAutoEnableResponse extends js.Object {
    var autoEnableNewAccounts: AutoEnableNewRegionConfigurationList
  }

  object GetDatalakeAutoEnableResponse {
    @inline
    def apply(
        autoEnableNewAccounts: AutoEnableNewRegionConfigurationList
    ): GetDatalakeAutoEnableResponse = {
      val __obj = js.Dynamic.literal(
        "autoEnableNewAccounts" -> autoEnableNewAccounts.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetDatalakeAutoEnableResponse]
    }
  }

  @js.native
  trait GetDatalakeExceptionsExpiryRequest extends js.Object

  object GetDatalakeExceptionsExpiryRequest {
    @inline
    def apply(): GetDatalakeExceptionsExpiryRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetDatalakeExceptionsExpiryRequest]
    }
  }

  @js.native
  trait GetDatalakeExceptionsExpiryResponse extends js.Object {
    var exceptionMessageExpiry: Double
  }

  object GetDatalakeExceptionsExpiryResponse {
    @inline
    def apply(
        exceptionMessageExpiry: Double
    ): GetDatalakeExceptionsExpiryResponse = {
      val __obj = js.Dynamic.literal(
        "exceptionMessageExpiry" -> exceptionMessageExpiry.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetDatalakeExceptionsExpiryResponse]
    }
  }

  @js.native
  trait GetDatalakeExceptionsSubscriptionRequest extends js.Object

  object GetDatalakeExceptionsSubscriptionRequest {
    @inline
    def apply(): GetDatalakeExceptionsSubscriptionRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetDatalakeExceptionsSubscriptionRequest]
    }
  }

  @js.native
  trait GetDatalakeExceptionsSubscriptionResponse extends js.Object {
    var protocolAndNotificationEndpoint: ProtocolAndNotificationEndpoint
  }

  object GetDatalakeExceptionsSubscriptionResponse {
    @inline
    def apply(
        protocolAndNotificationEndpoint: ProtocolAndNotificationEndpoint
    ): GetDatalakeExceptionsSubscriptionResponse = {
      val __obj = js.Dynamic.literal(
        "protocolAndNotificationEndpoint" -> protocolAndNotificationEndpoint.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetDatalakeExceptionsSubscriptionResponse]
    }
  }

  @js.native
  trait GetDatalakeRequest extends js.Object

  object GetDatalakeRequest {
    @inline
    def apply(): GetDatalakeRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetDatalakeRequest]
    }
  }

  @js.native
  trait GetDatalakeResponse extends js.Object {
    var configurations: LakeConfigurationResponseMap
  }

  object GetDatalakeResponse {
    @inline
    def apply(
        configurations: LakeConfigurationResponseMap
    ): GetDatalakeResponse = {
      val __obj = js.Dynamic.literal(
        "configurations" -> configurations.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetDatalakeResponse]
    }
  }

  @js.native
  trait GetDatalakeStatusRequest extends js.Object {
    var accountSet: js.UndefOr[InputSet]
    var maxAccountResults: js.UndefOr[Int]
    var nextToken: js.UndefOr[SafeString]
  }

  object GetDatalakeStatusRequest {
    @inline
    def apply(
        accountSet: js.UndefOr[InputSet] = js.undefined,
        maxAccountResults: js.UndefOr[Int] = js.undefined,
        nextToken: js.UndefOr[SafeString] = js.undefined
    ): GetDatalakeStatusRequest = {
      val __obj = js.Dynamic.literal()
      accountSet.foreach(__v => __obj.updateDynamic("accountSet")(__v.asInstanceOf[js.Any]))
      maxAccountResults.foreach(__v => __obj.updateDynamic("maxAccountResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDatalakeStatusRequest]
    }
  }

  @js.native
  trait GetDatalakeStatusResponse extends js.Object {
    var accountSourcesList: AccountSourcesList
    var nextToken: js.UndefOr[SafeString]
  }

  object GetDatalakeStatusResponse {
    @inline
    def apply(
        accountSourcesList: AccountSourcesList,
        nextToken: js.UndefOr[SafeString] = js.undefined
    ): GetDatalakeStatusResponse = {
      val __obj = js.Dynamic.literal(
        "accountSourcesList" -> accountSourcesList.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDatalakeStatusResponse]
    }
  }

  @js.native
  trait GetSubscriberRequest extends js.Object {
    var id: String
  }

  object GetSubscriberRequest {
    @inline
    def apply(
        id: String
    ): GetSubscriberRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetSubscriberRequest]
    }
  }

  @js.native
  trait GetSubscriberResponse extends js.Object {
    var subscriber: js.UndefOr[SubscriberResource]
  }

  object GetSubscriberResponse {
    @inline
    def apply(
        subscriber: js.UndefOr[SubscriberResource] = js.undefined
    ): GetSubscriberResponse = {
      val __obj = js.Dynamic.literal()
      subscriber.foreach(__v => __obj.updateDynamic("subscriber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSubscriberResponse]
    }
  }

  /** Provides details of lake configuration object in Amazon Security Lake.
    */
  @js.native
  trait LakeConfigurationRequest extends js.Object {
    var encryptionKey: js.UndefOr[String]
    var replicationDestinationRegions: js.UndefOr[RegionSet]
    var replicationRoleArn: js.UndefOr[RoleArn]
    var retentionSettings: js.UndefOr[RetentionSettingList]
    var tagsMap: js.UndefOr[TagsMap]
  }

  object LakeConfigurationRequest {
    @inline
    def apply(
        encryptionKey: js.UndefOr[String] = js.undefined,
        replicationDestinationRegions: js.UndefOr[RegionSet] = js.undefined,
        replicationRoleArn: js.UndefOr[RoleArn] = js.undefined,
        retentionSettings: js.UndefOr[RetentionSettingList] = js.undefined,
        tagsMap: js.UndefOr[TagsMap] = js.undefined
    ): LakeConfigurationRequest = {
      val __obj = js.Dynamic.literal()
      encryptionKey.foreach(__v => __obj.updateDynamic("encryptionKey")(__v.asInstanceOf[js.Any]))
      replicationDestinationRegions.foreach(__v => __obj.updateDynamic("replicationDestinationRegions")(__v.asInstanceOf[js.Any]))
      replicationRoleArn.foreach(__v => __obj.updateDynamic("replicationRoleArn")(__v.asInstanceOf[js.Any]))
      retentionSettings.foreach(__v => __obj.updateDynamic("retentionSettings")(__v.asInstanceOf[js.Any]))
      tagsMap.foreach(__v => __obj.updateDynamic("tagsMap")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LakeConfigurationRequest]
    }
  }

  /** Provides details of lake configuration object in Amazon Security Lake.
    */
  @js.native
  trait LakeConfigurationResponse extends js.Object {
    var encryptionKey: js.UndefOr[String]
    var replicationDestinationRegions: js.UndefOr[RegionSet]
    var replicationRoleArn: js.UndefOr[RoleArn]
    var retentionSettings: js.UndefOr[RetentionSettingList]
    var s3BucketArn: js.UndefOr[S3BucketArn]
    var status: js.UndefOr[settingsStatus]
    var tagsMap: js.UndefOr[TagsMap]
  }

  object LakeConfigurationResponse {
    @inline
    def apply(
        encryptionKey: js.UndefOr[String] = js.undefined,
        replicationDestinationRegions: js.UndefOr[RegionSet] = js.undefined,
        replicationRoleArn: js.UndefOr[RoleArn] = js.undefined,
        retentionSettings: js.UndefOr[RetentionSettingList] = js.undefined,
        s3BucketArn: js.UndefOr[S3BucketArn] = js.undefined,
        status: js.UndefOr[settingsStatus] = js.undefined,
        tagsMap: js.UndefOr[TagsMap] = js.undefined
    ): LakeConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      encryptionKey.foreach(__v => __obj.updateDynamic("encryptionKey")(__v.asInstanceOf[js.Any]))
      replicationDestinationRegions.foreach(__v => __obj.updateDynamic("replicationDestinationRegions")(__v.asInstanceOf[js.Any]))
      replicationRoleArn.foreach(__v => __obj.updateDynamic("replicationRoleArn")(__v.asInstanceOf[js.Any]))
      retentionSettings.foreach(__v => __obj.updateDynamic("retentionSettings")(__v.asInstanceOf[js.Any]))
      s3BucketArn.foreach(__v => __obj.updateDynamic("s3BucketArn")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      tagsMap.foreach(__v => __obj.updateDynamic("tagsMap")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LakeConfigurationResponse]
    }
  }

  @js.native
  trait ListDatalakeExceptionsRequest extends js.Object {
    var maxFailures: js.UndefOr[Int]
    var nextToken: js.UndefOr[SafeString]
    var regionSet: js.UndefOr[RegionSet]
  }

  object ListDatalakeExceptionsRequest {
    @inline
    def apply(
        maxFailures: js.UndefOr[Int] = js.undefined,
        nextToken: js.UndefOr[SafeString] = js.undefined,
        regionSet: js.UndefOr[RegionSet] = js.undefined
    ): ListDatalakeExceptionsRequest = {
      val __obj = js.Dynamic.literal()
      maxFailures.foreach(__v => __obj.updateDynamic("maxFailures")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      regionSet.foreach(__v => __obj.updateDynamic("regionSet")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDatalakeExceptionsRequest]
    }
  }

  @js.native
  trait ListDatalakeExceptionsResponse extends js.Object {
    var nonRetryableFailures: FailuresResponseList
    var nextToken: js.UndefOr[SafeString]
  }

  object ListDatalakeExceptionsResponse {
    @inline
    def apply(
        nonRetryableFailures: FailuresResponseList,
        nextToken: js.UndefOr[SafeString] = js.undefined
    ): ListDatalakeExceptionsResponse = {
      val __obj = js.Dynamic.literal(
        "nonRetryableFailures" -> nonRetryableFailures.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDatalakeExceptionsResponse]
    }
  }

  @js.native
  trait ListLogSourcesRequest extends js.Object {
    var inputOrder: js.UndefOr[DimensionSet]
    var listAllDimensions: js.UndefOr[AllDimensionsMap]
    var listSingleDimension: js.UndefOr[InputSet]
    var listTwoDimensions: js.UndefOr[TwoDimensionsMap]
    var maxResults: js.UndefOr[Int]
    var nextToken: js.UndefOr[SafeString]
  }

  object ListLogSourcesRequest {
    @inline
    def apply(
        inputOrder: js.UndefOr[DimensionSet] = js.undefined,
        listAllDimensions: js.UndefOr[AllDimensionsMap] = js.undefined,
        listSingleDimension: js.UndefOr[InputSet] = js.undefined,
        listTwoDimensions: js.UndefOr[TwoDimensionsMap] = js.undefined,
        maxResults: js.UndefOr[Int] = js.undefined,
        nextToken: js.UndefOr[SafeString] = js.undefined
    ): ListLogSourcesRequest = {
      val __obj = js.Dynamic.literal()
      inputOrder.foreach(__v => __obj.updateDynamic("inputOrder")(__v.asInstanceOf[js.Any]))
      listAllDimensions.foreach(__v => __obj.updateDynamic("listAllDimensions")(__v.asInstanceOf[js.Any]))
      listSingleDimension.foreach(__v => __obj.updateDynamic("listSingleDimension")(__v.asInstanceOf[js.Any]))
      listTwoDimensions.foreach(__v => __obj.updateDynamic("listTwoDimensions")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLogSourcesRequest]
    }
  }

  @js.native
  trait ListLogSourcesResponse extends js.Object {
    var regionSourceTypesAccountsList: RegionSourceTypesAccountsList
    var nextToken: js.UndefOr[String]
  }

  object ListLogSourcesResponse {
    @inline
    def apply(
        regionSourceTypesAccountsList: RegionSourceTypesAccountsList,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListLogSourcesResponse = {
      val __obj = js.Dynamic.literal(
        "regionSourceTypesAccountsList" -> regionSourceTypesAccountsList.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLogSourcesResponse]
    }
  }

  @js.native
  trait ListSubscribersRequest extends js.Object {
    var maxResults: js.UndefOr[Int]
    var nextToken: js.UndefOr[SafeString]
  }

  object ListSubscribersRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[Int] = js.undefined,
        nextToken: js.UndefOr[SafeString] = js.undefined
    ): ListSubscribersRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSubscribersRequest]
    }
  }

  @js.native
  trait ListSubscribersResponse extends js.Object {
    var subscribers: SubscriberList
    var nextToken: js.UndefOr[SafeString]
  }

  object ListSubscribersResponse {
    @inline
    def apply(
        subscribers: SubscriberList,
        nextToken: js.UndefOr[SafeString] = js.undefined
    ): ListSubscribersResponse = {
      val __obj = js.Dynamic.literal(
        "subscribers" -> subscribers.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSubscribersResponse]
    }
  }

  /** Log status for the Security Lake account.
    */
  @js.native
  trait LogsStatus extends js.Object {
    var healthStatus: SourceStatus
    var pathToLogs: String
  }

  object LogsStatus {
    @inline
    def apply(
        healthStatus: SourceStatus,
        pathToLogs: String
    ): LogsStatus = {
      val __obj = js.Dynamic.literal(
        "healthStatus" -> healthStatus.asInstanceOf[js.Any],
        "pathToLogs" -> pathToLogs.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[LogsStatus]
    }
  }

  /** Notifications in Security Lake which dictates how notifications are posted at the endpoint.
    */
  @js.native
  trait ProtocolAndNotificationEndpoint extends js.Object {
    var endpoint: js.UndefOr[SafeString]
    var protocol: js.UndefOr[SafeString]
  }

  object ProtocolAndNotificationEndpoint {
    @inline
    def apply(
        endpoint: js.UndefOr[SafeString] = js.undefined,
        protocol: js.UndefOr[SafeString] = js.undefined
    ): ProtocolAndNotificationEndpoint = {
      val __obj = js.Dynamic.literal()
      endpoint.foreach(__v => __obj.updateDynamic("endpoint")(__v.asInstanceOf[js.Any]))
      protocol.foreach(__v => __obj.updateDynamic("protocol")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProtocolAndNotificationEndpoint]
    }
  }

  /** Retention settings for the destination Amazon S3 buckets in Security Lake.
    */
  @js.native
  trait RetentionSetting extends js.Object {
    var retentionPeriod: js.UndefOr[RetentionSettingRetentionPeriodInteger]
    var storageClass: js.UndefOr[StorageClass]
  }

  object RetentionSetting {
    @inline
    def apply(
        retentionPeriod: js.UndefOr[RetentionSettingRetentionPeriodInteger] = js.undefined,
        storageClass: js.UndefOr[StorageClass] = js.undefined
    ): RetentionSetting = {
      val __obj = js.Dynamic.literal()
      retentionPeriod.foreach(__v => __obj.updateDynamic("retentionPeriod")(__v.asInstanceOf[js.Any]))
      storageClass.foreach(__v => __obj.updateDynamic("storageClass")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RetentionSetting]
    }
  }

  /** The supported source types from which logs and events are collected in Amazon Security Lake.
    */
  @js.native
  trait SourceType extends js.Object {
    var awsSourceType: js.UndefOr[AwsLogSourceType]
    var customSourceType: js.UndefOr[CustomSourceType]
  }

  object SourceType {
    @inline
    def apply(
        awsSourceType: js.UndefOr[AwsLogSourceType] = js.undefined,
        customSourceType: js.UndefOr[CustomSourceType] = js.undefined
    ): SourceType = {
      val __obj = js.Dynamic.literal()
      awsSourceType.foreach(__v => __obj.updateDynamic("awsSourceType")(__v.asInstanceOf[js.Any]))
      customSourceType.foreach(__v => __obj.updateDynamic("customSourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SourceType]
    }
  }

  /** Provides details of the Amazon Security Lake account subscription. Subscribers are notified of new objects for a source as the data is written to your Amazon Security Lake S3 bucket.
    */
  @js.native
  trait SubscriberResource extends js.Object {
    var accountId: AwsAccountId
    var sourceTypes: SourceTypeList
    var subscriptionId: UUID
    var accessTypes: js.UndefOr[AccessTypeList]
    var createdAt: js.UndefOr[SyntheticTimestamp_date_time]
    var externalId: js.UndefOr[SafeString]
    var roleArn: js.UndefOr[RoleArn]
    var s3BucketArn: js.UndefOr[S3BucketArn]
    var snsArn: js.UndefOr[SnsTopicArn]
    var subscriberDescription: js.UndefOr[SafeString]
    var subscriberName: js.UndefOr[SafeString]
    var subscriptionEndpoint: js.UndefOr[String]
    var subscriptionProtocol: js.UndefOr[EndpointProtocol]
    var subscriptionStatus: js.UndefOr[SubscriptionStatus]
    var updatedAt: js.UndefOr[SyntheticTimestamp_date_time]
  }

  object SubscriberResource {
    @inline
    def apply(
        accountId: AwsAccountId,
        sourceTypes: SourceTypeList,
        subscriptionId: UUID,
        accessTypes: js.UndefOr[AccessTypeList] = js.undefined,
        createdAt: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined,
        externalId: js.UndefOr[SafeString] = js.undefined,
        roleArn: js.UndefOr[RoleArn] = js.undefined,
        s3BucketArn: js.UndefOr[S3BucketArn] = js.undefined,
        snsArn: js.UndefOr[SnsTopicArn] = js.undefined,
        subscriberDescription: js.UndefOr[SafeString] = js.undefined,
        subscriberName: js.UndefOr[SafeString] = js.undefined,
        subscriptionEndpoint: js.UndefOr[String] = js.undefined,
        subscriptionProtocol: js.UndefOr[EndpointProtocol] = js.undefined,
        subscriptionStatus: js.UndefOr[SubscriptionStatus] = js.undefined,
        updatedAt: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined
    ): SubscriberResource = {
      val __obj = js.Dynamic.literal(
        "accountId" -> accountId.asInstanceOf[js.Any],
        "sourceTypes" -> sourceTypes.asInstanceOf[js.Any],
        "subscriptionId" -> subscriptionId.asInstanceOf[js.Any]
      )

      accessTypes.foreach(__v => __obj.updateDynamic("accessTypes")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      externalId.foreach(__v => __obj.updateDynamic("externalId")(__v.asInstanceOf[js.Any]))
      roleArn.foreach(__v => __obj.updateDynamic("roleArn")(__v.asInstanceOf[js.Any]))
      s3BucketArn.foreach(__v => __obj.updateDynamic("s3BucketArn")(__v.asInstanceOf[js.Any]))
      snsArn.foreach(__v => __obj.updateDynamic("snsArn")(__v.asInstanceOf[js.Any]))
      subscriberDescription.foreach(__v => __obj.updateDynamic("subscriberDescription")(__v.asInstanceOf[js.Any]))
      subscriberName.foreach(__v => __obj.updateDynamic("subscriberName")(__v.asInstanceOf[js.Any]))
      subscriptionEndpoint.foreach(__v => __obj.updateDynamic("subscriptionEndpoint")(__v.asInstanceOf[js.Any]))
      subscriptionProtocol.foreach(__v => __obj.updateDynamic("subscriptionProtocol")(__v.asInstanceOf[js.Any]))
      subscriptionStatus.foreach(__v => __obj.updateDynamic("subscriptionStatus")(__v.asInstanceOf[js.Any]))
      updatedAt.foreach(__v => __obj.updateDynamic("updatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SubscriberResource]
    }
  }

  @js.native
  trait UpdateDatalakeExceptionsExpiryRequest extends js.Object {
    var exceptionMessageExpiry: UpdateDatalakeExceptionsExpiryRequestExceptionMessageExpiryLong
  }

  object UpdateDatalakeExceptionsExpiryRequest {
    @inline
    def apply(
        exceptionMessageExpiry: UpdateDatalakeExceptionsExpiryRequestExceptionMessageExpiryLong
    ): UpdateDatalakeExceptionsExpiryRequest = {
      val __obj = js.Dynamic.literal(
        "exceptionMessageExpiry" -> exceptionMessageExpiry.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateDatalakeExceptionsExpiryRequest]
    }
  }

  @js.native
  trait UpdateDatalakeExceptionsExpiryResponse extends js.Object

  object UpdateDatalakeExceptionsExpiryResponse {
    @inline
    def apply(): UpdateDatalakeExceptionsExpiryResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateDatalakeExceptionsExpiryResponse]
    }
  }

  @js.native
  trait UpdateDatalakeExceptionsSubscriptionRequest extends js.Object {
    var notificationEndpoint: SafeString
    var subscriptionProtocol: SubscriptionProtocolType
  }

  object UpdateDatalakeExceptionsSubscriptionRequest {
    @inline
    def apply(
        notificationEndpoint: SafeString,
        subscriptionProtocol: SubscriptionProtocolType
    ): UpdateDatalakeExceptionsSubscriptionRequest = {
      val __obj = js.Dynamic.literal(
        "notificationEndpoint" -> notificationEndpoint.asInstanceOf[js.Any],
        "subscriptionProtocol" -> subscriptionProtocol.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateDatalakeExceptionsSubscriptionRequest]
    }
  }

  @js.native
  trait UpdateDatalakeExceptionsSubscriptionResponse extends js.Object

  object UpdateDatalakeExceptionsSubscriptionResponse {
    @inline
    def apply(): UpdateDatalakeExceptionsSubscriptionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateDatalakeExceptionsSubscriptionResponse]
    }
  }

  @js.native
  trait UpdateDatalakeRequest extends js.Object {
    var configurations: LakeConfigurationRequestMap
  }

  object UpdateDatalakeRequest {
    @inline
    def apply(
        configurations: LakeConfigurationRequestMap
    ): UpdateDatalakeRequest = {
      val __obj = js.Dynamic.literal(
        "configurations" -> configurations.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateDatalakeRequest]
    }
  }

  @js.native
  trait UpdateDatalakeResponse extends js.Object

  object UpdateDatalakeResponse {
    @inline
    def apply(): UpdateDatalakeResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateDatalakeResponse]
    }
  }

  @js.native
  trait UpdateSubscriberRequest extends js.Object {
    var id: String
    var externalId: js.UndefOr[SafeString]
    var sourceTypes: js.UndefOr[SourceTypeList]
    var subscriberDescription: js.UndefOr[SafeString]
    var subscriberName: js.UndefOr[UpdateSubscriberRequestSubscriberNameString]
  }

  object UpdateSubscriberRequest {
    @inline
    def apply(
        id: String,
        externalId: js.UndefOr[SafeString] = js.undefined,
        sourceTypes: js.UndefOr[SourceTypeList] = js.undefined,
        subscriberDescription: js.UndefOr[SafeString] = js.undefined,
        subscriberName: js.UndefOr[UpdateSubscriberRequestSubscriberNameString] = js.undefined
    ): UpdateSubscriberRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )

      externalId.foreach(__v => __obj.updateDynamic("externalId")(__v.asInstanceOf[js.Any]))
      sourceTypes.foreach(__v => __obj.updateDynamic("sourceTypes")(__v.asInstanceOf[js.Any]))
      subscriberDescription.foreach(__v => __obj.updateDynamic("subscriberDescription")(__v.asInstanceOf[js.Any]))
      subscriberName.foreach(__v => __obj.updateDynamic("subscriberName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSubscriberRequest]
    }
  }

  @js.native
  trait UpdateSubscriberResponse extends js.Object {
    var subscriber: js.UndefOr[SubscriberResource]
  }

  object UpdateSubscriberResponse {
    @inline
    def apply(
        subscriber: js.UndefOr[SubscriberResource] = js.undefined
    ): UpdateSubscriberResponse = {
      val __obj = js.Dynamic.literal()
      subscriber.foreach(__v => __obj.updateDynamic("subscriber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSubscriberResponse]
    }
  }

  @js.native
  trait UpdateSubscriptionNotificationConfigurationRequest extends js.Object {
    var subscriptionId: UUID
    var createSqs: js.UndefOr[Boolean]
    var httpsApiKeyName: js.UndefOr[String]
    var httpsApiKeyValue: js.UndefOr[String]
    var httpsMethod: js.UndefOr[HttpsMethod]
    var roleArn: js.UndefOr[RoleArn]
    var subscriptionEndpoint: js.UndefOr[UpdateSubscriptionNotificationConfigurationRequestSubscriptionEndpointString]
  }

  object UpdateSubscriptionNotificationConfigurationRequest {
    @inline
    def apply(
        subscriptionId: UUID,
        createSqs: js.UndefOr[Boolean] = js.undefined,
        httpsApiKeyName: js.UndefOr[String] = js.undefined,
        httpsApiKeyValue: js.UndefOr[String] = js.undefined,
        httpsMethod: js.UndefOr[HttpsMethod] = js.undefined,
        roleArn: js.UndefOr[RoleArn] = js.undefined,
        subscriptionEndpoint: js.UndefOr[UpdateSubscriptionNotificationConfigurationRequestSubscriptionEndpointString] = js.undefined
    ): UpdateSubscriptionNotificationConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "subscriptionId" -> subscriptionId.asInstanceOf[js.Any]
      )

      createSqs.foreach(__v => __obj.updateDynamic("createSqs")(__v.asInstanceOf[js.Any]))
      httpsApiKeyName.foreach(__v => __obj.updateDynamic("httpsApiKeyName")(__v.asInstanceOf[js.Any]))
      httpsApiKeyValue.foreach(__v => __obj.updateDynamic("httpsApiKeyValue")(__v.asInstanceOf[js.Any]))
      httpsMethod.foreach(__v => __obj.updateDynamic("httpsMethod")(__v.asInstanceOf[js.Any]))
      roleArn.foreach(__v => __obj.updateDynamic("roleArn")(__v.asInstanceOf[js.Any]))
      subscriptionEndpoint.foreach(__v => __obj.updateDynamic("subscriptionEndpoint")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSubscriptionNotificationConfigurationRequest]
    }
  }

  @js.native
  trait UpdateSubscriptionNotificationConfigurationResponse extends js.Object {
    var queueArn: js.UndefOr[SafeString]
  }

  object UpdateSubscriptionNotificationConfigurationResponse {
    @inline
    def apply(
        queueArn: js.UndefOr[SafeString] = js.undefined
    ): UpdateSubscriptionNotificationConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      queueArn.foreach(__v => __obj.updateDynamic("queueArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSubscriptionNotificationConfigurationResponse]
    }
  }
}
