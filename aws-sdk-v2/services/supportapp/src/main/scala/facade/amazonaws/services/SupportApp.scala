package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object supportapp {
  type SlackWorkspaceConfigurationList = js.Array[SlackWorkspaceConfiguration]
  type awsAccountAlias = String
  type booleanValue = Boolean
  type channelId = String
  type channelName = String
  type paginationToken = String
  type roleArn = String
  type slackChannelConfigurationList = js.Array[SlackChannelConfiguration]
  type teamId = String
  type teamName = String

  final class SupportAppOps(private val service: SupportApp) extends AnyVal {

    @inline def createSlackChannelConfigurationFuture(params: CreateSlackChannelConfigurationRequest): Future[CreateSlackChannelConfigurationResult] = service.createSlackChannelConfiguration(params).promise().toFuture
    @inline def deleteAccountAliasFuture(params: DeleteAccountAliasRequest): Future[DeleteAccountAliasResult] = service.deleteAccountAlias(params).promise().toFuture
    @inline def deleteSlackChannelConfigurationFuture(params: DeleteSlackChannelConfigurationRequest): Future[DeleteSlackChannelConfigurationResult] = service.deleteSlackChannelConfiguration(params).promise().toFuture
    @inline def deleteSlackWorkspaceConfigurationFuture(params: DeleteSlackWorkspaceConfigurationRequest): Future[DeleteSlackWorkspaceConfigurationResult] = service.deleteSlackWorkspaceConfiguration(params).promise().toFuture
    @inline def getAccountAliasFuture(params: GetAccountAliasRequest): Future[GetAccountAliasResult] = service.getAccountAlias(params).promise().toFuture
    @inline def listSlackChannelConfigurationsFuture(params: ListSlackChannelConfigurationsRequest): Future[ListSlackChannelConfigurationsResult] = service.listSlackChannelConfigurations(params).promise().toFuture
    @inline def listSlackWorkspaceConfigurationsFuture(params: ListSlackWorkspaceConfigurationsRequest): Future[ListSlackWorkspaceConfigurationsResult] = service.listSlackWorkspaceConfigurations(params).promise().toFuture
    @inline def putAccountAliasFuture(params: PutAccountAliasRequest): Future[PutAccountAliasResult] = service.putAccountAlias(params).promise().toFuture
    @inline def registerSlackWorkspaceForOrganizationFuture(params: RegisterSlackWorkspaceForOrganizationRequest): Future[RegisterSlackWorkspaceForOrganizationResult] = service.registerSlackWorkspaceForOrganization(params).promise().toFuture
    @inline def updateSlackChannelConfigurationFuture(params: UpdateSlackChannelConfigurationRequest): Future[UpdateSlackChannelConfigurationResult] = service.updateSlackChannelConfiguration(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/supportapp", JSImport.Namespace, "AWS.SupportApp")
  class SupportApp() extends js.Object {
    def this(config: AWSConfig) = this()

    def createSlackChannelConfiguration(params: CreateSlackChannelConfigurationRequest): Request[CreateSlackChannelConfigurationResult] = js.native
    def deleteAccountAlias(params: DeleteAccountAliasRequest): Request[DeleteAccountAliasResult] = js.native
    def deleteSlackChannelConfiguration(params: DeleteSlackChannelConfigurationRequest): Request[DeleteSlackChannelConfigurationResult] = js.native
    def deleteSlackWorkspaceConfiguration(params: DeleteSlackWorkspaceConfigurationRequest): Request[DeleteSlackWorkspaceConfigurationResult] = js.native
    def getAccountAlias(params: GetAccountAliasRequest): Request[GetAccountAliasResult] = js.native
    def listSlackChannelConfigurations(params: ListSlackChannelConfigurationsRequest): Request[ListSlackChannelConfigurationsResult] = js.native
    def listSlackWorkspaceConfigurations(params: ListSlackWorkspaceConfigurationsRequest): Request[ListSlackWorkspaceConfigurationsResult] = js.native
    def putAccountAlias(params: PutAccountAliasRequest): Request[PutAccountAliasResult] = js.native
    def registerSlackWorkspaceForOrganization(params: RegisterSlackWorkspaceForOrganizationRequest): Request[RegisterSlackWorkspaceForOrganizationResult] = js.native
    def updateSlackChannelConfiguration(params: UpdateSlackChannelConfigurationRequest): Request[UpdateSlackChannelConfigurationResult] = js.native
  }
  object SupportApp {
    @inline implicit def toOps(service: SupportApp): SupportAppOps = {
      new SupportAppOps(service)
    }
  }

  @js.native
  trait CreateSlackChannelConfigurationRequest extends js.Object {
    var channelId: channelId
    var channelRoleArn: roleArn
    var notifyOnCaseSeverity: NotificationSeverityLevel
    var teamId: teamId
    var channelName: js.UndefOr[channelName]
    var notifyOnAddCorrespondenceToCase: js.UndefOr[booleanValue]
    var notifyOnCreateOrReopenCase: js.UndefOr[booleanValue]
    var notifyOnResolveCase: js.UndefOr[booleanValue]
  }

  object CreateSlackChannelConfigurationRequest {
    @inline
    def apply(
        channelId: channelId,
        channelRoleArn: roleArn,
        notifyOnCaseSeverity: NotificationSeverityLevel,
        teamId: teamId,
        channelName: js.UndefOr[channelName] = js.undefined,
        notifyOnAddCorrespondenceToCase: js.UndefOr[booleanValue] = js.undefined,
        notifyOnCreateOrReopenCase: js.UndefOr[booleanValue] = js.undefined,
        notifyOnResolveCase: js.UndefOr[booleanValue] = js.undefined
    ): CreateSlackChannelConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "channelId" -> channelId.asInstanceOf[js.Any],
        "channelRoleArn" -> channelRoleArn.asInstanceOf[js.Any],
        "notifyOnCaseSeverity" -> notifyOnCaseSeverity.asInstanceOf[js.Any],
        "teamId" -> teamId.asInstanceOf[js.Any]
      )

      channelName.foreach(__v => __obj.updateDynamic("channelName")(__v.asInstanceOf[js.Any]))
      notifyOnAddCorrespondenceToCase.foreach(__v => __obj.updateDynamic("notifyOnAddCorrespondenceToCase")(__v.asInstanceOf[js.Any]))
      notifyOnCreateOrReopenCase.foreach(__v => __obj.updateDynamic("notifyOnCreateOrReopenCase")(__v.asInstanceOf[js.Any]))
      notifyOnResolveCase.foreach(__v => __obj.updateDynamic("notifyOnResolveCase")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSlackChannelConfigurationRequest]
    }
  }

  @js.native
  trait CreateSlackChannelConfigurationResult extends js.Object

  object CreateSlackChannelConfigurationResult {
    @inline
    def apply(): CreateSlackChannelConfigurationResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateSlackChannelConfigurationResult]
    }
  }

  @js.native
  trait DeleteAccountAliasRequest extends js.Object

  object DeleteAccountAliasRequest {
    @inline
    def apply(): DeleteAccountAliasRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteAccountAliasRequest]
    }
  }

  @js.native
  trait DeleteAccountAliasResult extends js.Object

  object DeleteAccountAliasResult {
    @inline
    def apply(): DeleteAccountAliasResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteAccountAliasResult]
    }
  }

  @js.native
  trait DeleteSlackChannelConfigurationRequest extends js.Object {
    var channelId: channelId
    var teamId: teamId
  }

  object DeleteSlackChannelConfigurationRequest {
    @inline
    def apply(
        channelId: channelId,
        teamId: teamId
    ): DeleteSlackChannelConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "channelId" -> channelId.asInstanceOf[js.Any],
        "teamId" -> teamId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteSlackChannelConfigurationRequest]
    }
  }

  @js.native
  trait DeleteSlackChannelConfigurationResult extends js.Object

  object DeleteSlackChannelConfigurationResult {
    @inline
    def apply(): DeleteSlackChannelConfigurationResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteSlackChannelConfigurationResult]
    }
  }

  @js.native
  trait DeleteSlackWorkspaceConfigurationRequest extends js.Object {
    var teamId: teamId
  }

  object DeleteSlackWorkspaceConfigurationRequest {
    @inline
    def apply(
        teamId: teamId
    ): DeleteSlackWorkspaceConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "teamId" -> teamId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteSlackWorkspaceConfigurationRequest]
    }
  }

  @js.native
  trait DeleteSlackWorkspaceConfigurationResult extends js.Object

  object DeleteSlackWorkspaceConfigurationResult {
    @inline
    def apply(): DeleteSlackWorkspaceConfigurationResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteSlackWorkspaceConfigurationResult]
    }
  }

  @js.native
  trait GetAccountAliasRequest extends js.Object

  object GetAccountAliasRequest {
    @inline
    def apply(): GetAccountAliasRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetAccountAliasRequest]
    }
  }

  @js.native
  trait GetAccountAliasResult extends js.Object {
    var accountAlias: js.UndefOr[awsAccountAlias]
  }

  object GetAccountAliasResult {
    @inline
    def apply(
        accountAlias: js.UndefOr[awsAccountAlias] = js.undefined
    ): GetAccountAliasResult = {
      val __obj = js.Dynamic.literal()
      accountAlias.foreach(__v => __obj.updateDynamic("accountAlias")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAccountAliasResult]
    }
  }

  @js.native
  trait ListSlackChannelConfigurationsRequest extends js.Object {
    var nextToken: js.UndefOr[paginationToken]
  }

  object ListSlackChannelConfigurationsRequest {
    @inline
    def apply(
        nextToken: js.UndefOr[paginationToken] = js.undefined
    ): ListSlackChannelConfigurationsRequest = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSlackChannelConfigurationsRequest]
    }
  }

  @js.native
  trait ListSlackChannelConfigurationsResult extends js.Object {
    var slackChannelConfigurations: slackChannelConfigurationList
    var nextToken: js.UndefOr[paginationToken]
  }

  object ListSlackChannelConfigurationsResult {
    @inline
    def apply(
        slackChannelConfigurations: slackChannelConfigurationList,
        nextToken: js.UndefOr[paginationToken] = js.undefined
    ): ListSlackChannelConfigurationsResult = {
      val __obj = js.Dynamic.literal(
        "slackChannelConfigurations" -> slackChannelConfigurations.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSlackChannelConfigurationsResult]
    }
  }

  @js.native
  trait ListSlackWorkspaceConfigurationsRequest extends js.Object {
    var nextToken: js.UndefOr[paginationToken]
  }

  object ListSlackWorkspaceConfigurationsRequest {
    @inline
    def apply(
        nextToken: js.UndefOr[paginationToken] = js.undefined
    ): ListSlackWorkspaceConfigurationsRequest = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSlackWorkspaceConfigurationsRequest]
    }
  }

  @js.native
  trait ListSlackWorkspaceConfigurationsResult extends js.Object {
    var nextToken: js.UndefOr[paginationToken]
    var slackWorkspaceConfigurations: js.UndefOr[SlackWorkspaceConfigurationList]
  }

  object ListSlackWorkspaceConfigurationsResult {
    @inline
    def apply(
        nextToken: js.UndefOr[paginationToken] = js.undefined,
        slackWorkspaceConfigurations: js.UndefOr[SlackWorkspaceConfigurationList] = js.undefined
    ): ListSlackWorkspaceConfigurationsResult = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      slackWorkspaceConfigurations.foreach(__v => __obj.updateDynamic("slackWorkspaceConfigurations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSlackWorkspaceConfigurationsResult]
    }
  }

  @js.native
  trait PutAccountAliasRequest extends js.Object {
    var accountAlias: awsAccountAlias
  }

  object PutAccountAliasRequest {
    @inline
    def apply(
        accountAlias: awsAccountAlias
    ): PutAccountAliasRequest = {
      val __obj = js.Dynamic.literal(
        "accountAlias" -> accountAlias.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutAccountAliasRequest]
    }
  }

  @js.native
  trait PutAccountAliasResult extends js.Object

  object PutAccountAliasResult {
    @inline
    def apply(): PutAccountAliasResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutAccountAliasResult]
    }
  }

  @js.native
  trait RegisterSlackWorkspaceForOrganizationRequest extends js.Object {
    var teamId: teamId
  }

  object RegisterSlackWorkspaceForOrganizationRequest {
    @inline
    def apply(
        teamId: teamId
    ): RegisterSlackWorkspaceForOrganizationRequest = {
      val __obj = js.Dynamic.literal(
        "teamId" -> teamId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RegisterSlackWorkspaceForOrganizationRequest]
    }
  }

  @js.native
  trait RegisterSlackWorkspaceForOrganizationResult extends js.Object {
    var accountType: js.UndefOr[AccountType]
    var teamId: js.UndefOr[teamId]
    var teamName: js.UndefOr[teamName]
  }

  object RegisterSlackWorkspaceForOrganizationResult {
    @inline
    def apply(
        accountType: js.UndefOr[AccountType] = js.undefined,
        teamId: js.UndefOr[teamId] = js.undefined,
        teamName: js.UndefOr[teamName] = js.undefined
    ): RegisterSlackWorkspaceForOrganizationResult = {
      val __obj = js.Dynamic.literal()
      accountType.foreach(__v => __obj.updateDynamic("accountType")(__v.asInstanceOf[js.Any]))
      teamId.foreach(__v => __obj.updateDynamic("teamId")(__v.asInstanceOf[js.Any]))
      teamName.foreach(__v => __obj.updateDynamic("teamName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterSlackWorkspaceForOrganizationResult]
    }
  }

  /** The configuration for a Slack channel that you added for your Amazon Web Services account.
    */
  @js.native
  trait SlackChannelConfiguration extends js.Object {
    var channelId: channelId
    var teamId: teamId
    var channelName: js.UndefOr[channelName]
    var channelRoleArn: js.UndefOr[roleArn]
    var notifyOnAddCorrespondenceToCase: js.UndefOr[booleanValue]
    var notifyOnCaseSeverity: js.UndefOr[NotificationSeverityLevel]
    var notifyOnCreateOrReopenCase: js.UndefOr[booleanValue]
    var notifyOnResolveCase: js.UndefOr[booleanValue]
  }

  object SlackChannelConfiguration {
    @inline
    def apply(
        channelId: channelId,
        teamId: teamId,
        channelName: js.UndefOr[channelName] = js.undefined,
        channelRoleArn: js.UndefOr[roleArn] = js.undefined,
        notifyOnAddCorrespondenceToCase: js.UndefOr[booleanValue] = js.undefined,
        notifyOnCaseSeverity: js.UndefOr[NotificationSeverityLevel] = js.undefined,
        notifyOnCreateOrReopenCase: js.UndefOr[booleanValue] = js.undefined,
        notifyOnResolveCase: js.UndefOr[booleanValue] = js.undefined
    ): SlackChannelConfiguration = {
      val __obj = js.Dynamic.literal(
        "channelId" -> channelId.asInstanceOf[js.Any],
        "teamId" -> teamId.asInstanceOf[js.Any]
      )

      channelName.foreach(__v => __obj.updateDynamic("channelName")(__v.asInstanceOf[js.Any]))
      channelRoleArn.foreach(__v => __obj.updateDynamic("channelRoleArn")(__v.asInstanceOf[js.Any]))
      notifyOnAddCorrespondenceToCase.foreach(__v => __obj.updateDynamic("notifyOnAddCorrespondenceToCase")(__v.asInstanceOf[js.Any]))
      notifyOnCaseSeverity.foreach(__v => __obj.updateDynamic("notifyOnCaseSeverity")(__v.asInstanceOf[js.Any]))
      notifyOnCreateOrReopenCase.foreach(__v => __obj.updateDynamic("notifyOnCreateOrReopenCase")(__v.asInstanceOf[js.Any]))
      notifyOnResolveCase.foreach(__v => __obj.updateDynamic("notifyOnResolveCase")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SlackChannelConfiguration]
    }
  }

  /** The configuration for a Slack workspace that you added to an Amazon Web Services account.
    */
  @js.native
  trait SlackWorkspaceConfiguration extends js.Object {
    var teamId: teamId
    var allowOrganizationMemberAccount: js.UndefOr[booleanValue]
    var teamName: js.UndefOr[teamName]
  }

  object SlackWorkspaceConfiguration {
    @inline
    def apply(
        teamId: teamId,
        allowOrganizationMemberAccount: js.UndefOr[booleanValue] = js.undefined,
        teamName: js.UndefOr[teamName] = js.undefined
    ): SlackWorkspaceConfiguration = {
      val __obj = js.Dynamic.literal(
        "teamId" -> teamId.asInstanceOf[js.Any]
      )

      allowOrganizationMemberAccount.foreach(__v => __obj.updateDynamic("allowOrganizationMemberAccount")(__v.asInstanceOf[js.Any]))
      teamName.foreach(__v => __obj.updateDynamic("teamName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SlackWorkspaceConfiguration]
    }
  }

  @js.native
  trait UpdateSlackChannelConfigurationRequest extends js.Object {
    var channelId: channelId
    var teamId: teamId
    var channelName: js.UndefOr[channelName]
    var channelRoleArn: js.UndefOr[roleArn]
    var notifyOnAddCorrespondenceToCase: js.UndefOr[booleanValue]
    var notifyOnCaseSeverity: js.UndefOr[NotificationSeverityLevel]
    var notifyOnCreateOrReopenCase: js.UndefOr[booleanValue]
    var notifyOnResolveCase: js.UndefOr[booleanValue]
  }

  object UpdateSlackChannelConfigurationRequest {
    @inline
    def apply(
        channelId: channelId,
        teamId: teamId,
        channelName: js.UndefOr[channelName] = js.undefined,
        channelRoleArn: js.UndefOr[roleArn] = js.undefined,
        notifyOnAddCorrespondenceToCase: js.UndefOr[booleanValue] = js.undefined,
        notifyOnCaseSeverity: js.UndefOr[NotificationSeverityLevel] = js.undefined,
        notifyOnCreateOrReopenCase: js.UndefOr[booleanValue] = js.undefined,
        notifyOnResolveCase: js.UndefOr[booleanValue] = js.undefined
    ): UpdateSlackChannelConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "channelId" -> channelId.asInstanceOf[js.Any],
        "teamId" -> teamId.asInstanceOf[js.Any]
      )

      channelName.foreach(__v => __obj.updateDynamic("channelName")(__v.asInstanceOf[js.Any]))
      channelRoleArn.foreach(__v => __obj.updateDynamic("channelRoleArn")(__v.asInstanceOf[js.Any]))
      notifyOnAddCorrespondenceToCase.foreach(__v => __obj.updateDynamic("notifyOnAddCorrespondenceToCase")(__v.asInstanceOf[js.Any]))
      notifyOnCaseSeverity.foreach(__v => __obj.updateDynamic("notifyOnCaseSeverity")(__v.asInstanceOf[js.Any]))
      notifyOnCreateOrReopenCase.foreach(__v => __obj.updateDynamic("notifyOnCreateOrReopenCase")(__v.asInstanceOf[js.Any]))
      notifyOnResolveCase.foreach(__v => __obj.updateDynamic("notifyOnResolveCase")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSlackChannelConfigurationRequest]
    }
  }

  @js.native
  trait UpdateSlackChannelConfigurationResult extends js.Object {
    var channelId: js.UndefOr[channelId]
    var channelName: js.UndefOr[channelName]
    var channelRoleArn: js.UndefOr[roleArn]
    var notifyOnAddCorrespondenceToCase: js.UndefOr[booleanValue]
    var notifyOnCaseSeverity: js.UndefOr[NotificationSeverityLevel]
    var notifyOnCreateOrReopenCase: js.UndefOr[booleanValue]
    var notifyOnResolveCase: js.UndefOr[booleanValue]
    var teamId: js.UndefOr[teamId]
  }

  object UpdateSlackChannelConfigurationResult {
    @inline
    def apply(
        channelId: js.UndefOr[channelId] = js.undefined,
        channelName: js.UndefOr[channelName] = js.undefined,
        channelRoleArn: js.UndefOr[roleArn] = js.undefined,
        notifyOnAddCorrespondenceToCase: js.UndefOr[booleanValue] = js.undefined,
        notifyOnCaseSeverity: js.UndefOr[NotificationSeverityLevel] = js.undefined,
        notifyOnCreateOrReopenCase: js.UndefOr[booleanValue] = js.undefined,
        notifyOnResolveCase: js.UndefOr[booleanValue] = js.undefined,
        teamId: js.UndefOr[teamId] = js.undefined
    ): UpdateSlackChannelConfigurationResult = {
      val __obj = js.Dynamic.literal()
      channelId.foreach(__v => __obj.updateDynamic("channelId")(__v.asInstanceOf[js.Any]))
      channelName.foreach(__v => __obj.updateDynamic("channelName")(__v.asInstanceOf[js.Any]))
      channelRoleArn.foreach(__v => __obj.updateDynamic("channelRoleArn")(__v.asInstanceOf[js.Any]))
      notifyOnAddCorrespondenceToCase.foreach(__v => __obj.updateDynamic("notifyOnAddCorrespondenceToCase")(__v.asInstanceOf[js.Any]))
      notifyOnCaseSeverity.foreach(__v => __obj.updateDynamic("notifyOnCaseSeverity")(__v.asInstanceOf[js.Any]))
      notifyOnCreateOrReopenCase.foreach(__v => __obj.updateDynamic("notifyOnCreateOrReopenCase")(__v.asInstanceOf[js.Any]))
      notifyOnResolveCase.foreach(__v => __obj.updateDynamic("notifyOnResolveCase")(__v.asInstanceOf[js.Any]))
      teamId.foreach(__v => __obj.updateDynamic("teamId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSlackChannelConfigurationResult]
    }
  }
}
