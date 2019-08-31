package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object elbv2 {
  type ActionOrder    = Int
  type ActionTypeEnum = String
  type Actions        = js.Array[Action]
  type AllocationId   = String
  type AuthenticateCognitoActionAuthenticationRequestExtraParams =
    js.Dictionary[AuthenticateCognitoActionAuthenticationRequestParamValue]
  type AuthenticateCognitoActionAuthenticationRequestParamName  = String
  type AuthenticateCognitoActionAuthenticationRequestParamValue = String
  type AuthenticateCognitoActionConditionalBehaviorEnum         = String
  type AuthenticateCognitoActionScope                           = String
  type AuthenticateCognitoActionSessionCookieName               = String
  type AuthenticateCognitoActionSessionTimeout                  = Double
  type AuthenticateCognitoActionUserPoolArn                     = String
  type AuthenticateCognitoActionUserPoolClientId                = String
  type AuthenticateCognitoActionUserPoolDomain                  = String
  type AuthenticateOidcActionAuthenticationRequestExtraParams =
    js.Dictionary[AuthenticateOidcActionAuthenticationRequestParamValue]
  type AuthenticateOidcActionAuthenticationRequestParamName  = String
  type AuthenticateOidcActionAuthenticationRequestParamValue = String
  type AuthenticateOidcActionAuthorizationEndpoint           = String
  type AuthenticateOidcActionClientId                        = String
  type AuthenticateOidcActionClientSecret                    = String
  type AuthenticateOidcActionConditionalBehaviorEnum         = String
  type AuthenticateOidcActionIssuer                          = String
  type AuthenticateOidcActionScope                           = String
  type AuthenticateOidcActionSessionCookieName               = String
  type AuthenticateOidcActionSessionTimeout                  = Double
  type AuthenticateOidcActionTokenEndpoint                   = String
  type AuthenticateOidcActionUseExistingClientSecret         = Boolean
  type AuthenticateOidcActionUserInfoEndpoint                = String
  type AvailabilityZones                                     = js.Array[AvailabilityZone]
  type CanonicalHostedZoneId                                 = String
  type CertificateArn                                        = String
  type CertificateList                                       = js.Array[Certificate]
  type CipherName                                            = String
  type CipherPriority                                        = Int
  type Ciphers                                               = js.Array[Cipher]
  type ConditionFieldName                                    = String
  type CreatedTime                                           = js.Date
  type DNSName                                               = String
  type Default                                               = Boolean
  type Description                                           = String
  type FixedResponseActionContentType                        = String
  type FixedResponseActionMessage                            = String
  type FixedResponseActionStatusCode                         = String
  type HealthCheckEnabled                                    = Boolean
  type HealthCheckIntervalSeconds                            = Int
  type HealthCheckPort                                       = String
  type HealthCheckThresholdCount                             = Int
  type HealthCheckTimeoutSeconds                             = Int
  type HttpCode                                              = String
  type HttpHeaderConditionName                               = String
  type IpAddress                                             = String
  type IpAddressType                                         = String
  type IsDefault                                             = Boolean
  type Limits                                                = js.Array[Limit]
  type ListOfString                                          = js.Array[StringValue]
  type ListenerArn                                           = String
  type ListenerArns                                          = js.Array[ListenerArn]
  type Listeners                                             = js.Array[Listener]
  type LoadBalancerAddresses                                 = js.Array[LoadBalancerAddress]
  type LoadBalancerArn                                       = String
  type LoadBalancerArns                                      = js.Array[LoadBalancerArn]
  type LoadBalancerAttributeKey                              = String
  type LoadBalancerAttributeValue                            = String
  type LoadBalancerAttributes                                = js.Array[LoadBalancerAttribute]
  type LoadBalancerName                                      = String
  type LoadBalancerNames                                     = js.Array[LoadBalancerName]
  type LoadBalancerSchemeEnum                                = String
  type LoadBalancerStateEnum                                 = String
  type LoadBalancerTypeEnum                                  = String
  type LoadBalancers                                         = js.Array[LoadBalancer]
  type Marker                                                = String
  type Max                                                   = String
  type Name                                                  = String
  type PageSize                                              = Int
  type Path                                                  = String
  type Port                                                  = Int
  type ProtocolEnum                                          = String
  type QueryStringKeyValuePairList                           = js.Array[QueryStringKeyValuePair]
  type RedirectActionHost                                    = String
  type RedirectActionPath                                    = String
  type RedirectActionPort                                    = String
  type RedirectActionProtocol                                = String
  type RedirectActionQuery                                   = String
  type RedirectActionStatusCodeEnum                          = String
  type ResourceArn                                           = String
  type ResourceArns                                          = js.Array[ResourceArn]
  type RuleArn                                               = String
  type RuleArns                                              = js.Array[RuleArn]
  type RuleConditionList                                     = js.Array[RuleCondition]
  type RulePriority                                          = Int
  type RulePriorityList                                      = js.Array[RulePriorityPair]
  type Rules                                                 = js.Array[Rule]
  type SecurityGroupId                                       = String
  type SecurityGroups                                        = js.Array[SecurityGroupId]
  type SslPolicies                                           = js.Array[SslPolicy]
  type SslPolicyName                                         = String
  type SslPolicyNames                                        = js.Array[SslPolicyName]
  type SslProtocol                                           = String
  type SslProtocols                                          = js.Array[SslProtocol]
  type StateReason                                           = String
  type StringValue                                           = String
  type SubnetId                                              = String
  type SubnetMappings                                        = js.Array[SubnetMapping]
  type Subnets                                               = js.Array[SubnetId]
  type TagDescriptions                                       = js.Array[TagDescription]
  type TagKey                                                = String
  type TagKeys                                               = js.Array[TagKey]
  type TagList                                               = js.Array[Tag]
  type TagValue                                              = String
  type TargetDescriptions                                    = js.Array[TargetDescription]
  type TargetGroupArn                                        = String
  type TargetGroupArns                                       = js.Array[TargetGroupArn]
  type TargetGroupAttributeKey                               = String
  type TargetGroupAttributeValue                             = String
  type TargetGroupAttributes                                 = js.Array[TargetGroupAttribute]
  type TargetGroupName                                       = String
  type TargetGroupNames                                      = js.Array[TargetGroupName]
  type TargetGroups                                          = js.Array[TargetGroup]
  type TargetHealthDescriptions                              = js.Array[TargetHealthDescription]
  type TargetHealthReasonEnum                                = String
  type TargetHealthStateEnum                                 = String
  type TargetId                                              = String
  type TargetTypeEnum                                        = String
  type VpcId                                                 = String
  type ZoneName                                              = String

  implicit final class ELBv2Ops(private val service: ELBv2) extends AnyVal {

    def addListenerCertificatesFuture(params: AddListenerCertificatesInput): Future[AddListenerCertificatesOutput] =
      service.addListenerCertificates(params).promise.toFuture
    def addTagsFuture(params: AddTagsInput): Future[AddTagsOutput] = service.addTags(params).promise.toFuture
    def createListenerFuture(params: CreateListenerInput): Future[CreateListenerOutput] =
      service.createListener(params).promise.toFuture
    def createLoadBalancerFuture(params: CreateLoadBalancerInput): Future[CreateLoadBalancerOutput] =
      service.createLoadBalancer(params).promise.toFuture
    def createRuleFuture(params: CreateRuleInput): Future[CreateRuleOutput] =
      service.createRule(params).promise.toFuture
    def createTargetGroupFuture(params: CreateTargetGroupInput): Future[CreateTargetGroupOutput] =
      service.createTargetGroup(params).promise.toFuture
    def deleteListenerFuture(params: DeleteListenerInput): Future[DeleteListenerOutput] =
      service.deleteListener(params).promise.toFuture
    def deleteLoadBalancerFuture(params: DeleteLoadBalancerInput): Future[DeleteLoadBalancerOutput] =
      service.deleteLoadBalancer(params).promise.toFuture
    def deleteRuleFuture(params: DeleteRuleInput): Future[DeleteRuleOutput] =
      service.deleteRule(params).promise.toFuture
    def deleteTargetGroupFuture(params: DeleteTargetGroupInput): Future[DeleteTargetGroupOutput] =
      service.deleteTargetGroup(params).promise.toFuture
    def deregisterTargetsFuture(params: DeregisterTargetsInput): Future[DeregisterTargetsOutput] =
      service.deregisterTargets(params).promise.toFuture
    def describeAccountLimitsFuture(params: DescribeAccountLimitsInput): Future[DescribeAccountLimitsOutput] =
      service.describeAccountLimits(params).promise.toFuture
    def describeListenerCertificatesFuture(
        params: DescribeListenerCertificatesInput
    ): Future[DescribeListenerCertificatesOutput] = service.describeListenerCertificates(params).promise.toFuture
    def describeListenersFuture(params: DescribeListenersInput): Future[DescribeListenersOutput] =
      service.describeListeners(params).promise.toFuture
    def describeLoadBalancerAttributesFuture(
        params: DescribeLoadBalancerAttributesInput
    ): Future[DescribeLoadBalancerAttributesOutput] = service.describeLoadBalancerAttributes(params).promise.toFuture
    def describeLoadBalancersFuture(params: DescribeLoadBalancersInput): Future[DescribeLoadBalancersOutput] =
      service.describeLoadBalancers(params).promise.toFuture
    def describeRulesFuture(params: DescribeRulesInput): Future[DescribeRulesOutput] =
      service.describeRules(params).promise.toFuture
    def describeSSLPoliciesFuture(params: DescribeSSLPoliciesInput): Future[DescribeSSLPoliciesOutput] =
      service.describeSSLPolicies(params).promise.toFuture
    def describeTagsFuture(params: DescribeTagsInput): Future[DescribeTagsOutput] =
      service.describeTags(params).promise.toFuture
    def describeTargetGroupAttributesFuture(
        params: DescribeTargetGroupAttributesInput
    ): Future[DescribeTargetGroupAttributesOutput] = service.describeTargetGroupAttributes(params).promise.toFuture
    def describeTargetGroupsFuture(params: DescribeTargetGroupsInput): Future[DescribeTargetGroupsOutput] =
      service.describeTargetGroups(params).promise.toFuture
    def describeTargetHealthFuture(params: DescribeTargetHealthInput): Future[DescribeTargetHealthOutput] =
      service.describeTargetHealth(params).promise.toFuture
    def modifyListenerFuture(params: ModifyListenerInput): Future[ModifyListenerOutput] =
      service.modifyListener(params).promise.toFuture
    def modifyLoadBalancerAttributesFuture(
        params: ModifyLoadBalancerAttributesInput
    ): Future[ModifyLoadBalancerAttributesOutput] = service.modifyLoadBalancerAttributes(params).promise.toFuture
    def modifyRuleFuture(params: ModifyRuleInput): Future[ModifyRuleOutput] =
      service.modifyRule(params).promise.toFuture
    def modifyTargetGroupAttributesFuture(
        params: ModifyTargetGroupAttributesInput
    ): Future[ModifyTargetGroupAttributesOutput] = service.modifyTargetGroupAttributes(params).promise.toFuture
    def modifyTargetGroupFuture(params: ModifyTargetGroupInput): Future[ModifyTargetGroupOutput] =
      service.modifyTargetGroup(params).promise.toFuture
    def registerTargetsFuture(params: RegisterTargetsInput): Future[RegisterTargetsOutput] =
      service.registerTargets(params).promise.toFuture
    def removeListenerCertificatesFuture(
        params: RemoveListenerCertificatesInput
    ): Future[RemoveListenerCertificatesOutput] = service.removeListenerCertificates(params).promise.toFuture
    def removeTagsFuture(params: RemoveTagsInput): Future[RemoveTagsOutput] =
      service.removeTags(params).promise.toFuture
    def setIpAddressTypeFuture(params: SetIpAddressTypeInput): Future[SetIpAddressTypeOutput] =
      service.setIpAddressType(params).promise.toFuture
    def setRulePrioritiesFuture(params: SetRulePrioritiesInput): Future[SetRulePrioritiesOutput] =
      service.setRulePriorities(params).promise.toFuture
    def setSecurityGroupsFuture(params: SetSecurityGroupsInput): Future[SetSecurityGroupsOutput] =
      service.setSecurityGroups(params).promise.toFuture
    def setSubnetsFuture(params: SetSubnetsInput): Future[SetSubnetsOutput] =
      service.setSubnets(params).promise.toFuture
  }
}

package elbv2 {
  @js.native
  @JSImport("aws-sdk", "ELBv2")
  class ELBv2() extends js.Object {
    def this(config: AWSConfig) = this()

    def addListenerCertificates(params: AddListenerCertificatesInput): Request[AddListenerCertificatesOutput] =
      js.native
    def addTags(params: AddTagsInput): Request[AddTagsOutput]                                           = js.native
    def createListener(params: CreateListenerInput): Request[CreateListenerOutput]                      = js.native
    def createLoadBalancer(params: CreateLoadBalancerInput): Request[CreateLoadBalancerOutput]          = js.native
    def createRule(params: CreateRuleInput): Request[CreateRuleOutput]                                  = js.native
    def createTargetGroup(params: CreateTargetGroupInput): Request[CreateTargetGroupOutput]             = js.native
    def deleteListener(params: DeleteListenerInput): Request[DeleteListenerOutput]                      = js.native
    def deleteLoadBalancer(params: DeleteLoadBalancerInput): Request[DeleteLoadBalancerOutput]          = js.native
    def deleteRule(params: DeleteRuleInput): Request[DeleteRuleOutput]                                  = js.native
    def deleteTargetGroup(params: DeleteTargetGroupInput): Request[DeleteTargetGroupOutput]             = js.native
    def deregisterTargets(params: DeregisterTargetsInput): Request[DeregisterTargetsOutput]             = js.native
    def describeAccountLimits(params: DescribeAccountLimitsInput): Request[DescribeAccountLimitsOutput] = js.native
    def describeListenerCertificates(
        params: DescribeListenerCertificatesInput
    ): Request[DescribeListenerCertificatesOutput]                                          = js.native
    def describeListeners(params: DescribeListenersInput): Request[DescribeListenersOutput] = js.native
    def describeLoadBalancerAttributes(
        params: DescribeLoadBalancerAttributesInput
    ): Request[DescribeLoadBalancerAttributesOutput]                                                    = js.native
    def describeLoadBalancers(params: DescribeLoadBalancersInput): Request[DescribeLoadBalancersOutput] = js.native
    def describeRules(params: DescribeRulesInput): Request[DescribeRulesOutput]                         = js.native
    def describeSSLPolicies(params: DescribeSSLPoliciesInput): Request[DescribeSSLPoliciesOutput]       = js.native
    def describeTags(params: DescribeTagsInput): Request[DescribeTagsOutput]                            = js.native
    def describeTargetGroupAttributes(
        params: DescribeTargetGroupAttributesInput
    ): Request[DescribeTargetGroupAttributesOutput]                                                  = js.native
    def describeTargetGroups(params: DescribeTargetGroupsInput): Request[DescribeTargetGroupsOutput] = js.native
    def describeTargetHealth(params: DescribeTargetHealthInput): Request[DescribeTargetHealthOutput] = js.native
    def modifyListener(params: ModifyListenerInput): Request[ModifyListenerOutput]                   = js.native
    def modifyLoadBalancerAttributes(
        params: ModifyLoadBalancerAttributesInput
    ): Request[ModifyLoadBalancerAttributesOutput]                                          = js.native
    def modifyRule(params: ModifyRuleInput): Request[ModifyRuleOutput]                      = js.native
    def modifyTargetGroup(params: ModifyTargetGroupInput): Request[ModifyTargetGroupOutput] = js.native
    def modifyTargetGroupAttributes(
        params: ModifyTargetGroupAttributesInput
    ): Request[ModifyTargetGroupAttributesOutput]                                     = js.native
    def registerTargets(params: RegisterTargetsInput): Request[RegisterTargetsOutput] = js.native
    def removeListenerCertificates(params: RemoveListenerCertificatesInput): Request[RemoveListenerCertificatesOutput] =
      js.native
    def removeTags(params: RemoveTagsInput): Request[RemoveTagsOutput]                      = js.native
    def setIpAddressType(params: SetIpAddressTypeInput): Request[SetIpAddressTypeOutput]    = js.native
    def setRulePriorities(params: SetRulePrioritiesInput): Request[SetRulePrioritiesOutput] = js.native
    def setSecurityGroups(params: SetSecurityGroupsInput): Request[SetSecurityGroupsOutput] = js.native
    def setSubnets(params: SetSubnetsInput): Request[SetSubnetsOutput]                      = js.native
  }

  /**
    * Information about an action.
    */
  @js.native
  trait Action extends js.Object {
    var Type: ActionTypeEnum
    var AuthenticateCognitoConfig: js.UndefOr[AuthenticateCognitoActionConfig]
    var AuthenticateOidcConfig: js.UndefOr[AuthenticateOidcActionConfig]
    var FixedResponseConfig: js.UndefOr[FixedResponseActionConfig]
    var Order: js.UndefOr[ActionOrder]
    var RedirectConfig: js.UndefOr[RedirectActionConfig]
    var TargetGroupArn: js.UndefOr[TargetGroupArn]
  }

  object Action {
    def apply(
        Type: ActionTypeEnum,
        AuthenticateCognitoConfig: js.UndefOr[AuthenticateCognitoActionConfig] = js.undefined,
        AuthenticateOidcConfig: js.UndefOr[AuthenticateOidcActionConfig] = js.undefined,
        FixedResponseConfig: js.UndefOr[FixedResponseActionConfig] = js.undefined,
        Order: js.UndefOr[ActionOrder] = js.undefined,
        RedirectConfig: js.UndefOr[RedirectActionConfig] = js.undefined,
        TargetGroupArn: js.UndefOr[TargetGroupArn] = js.undefined
    ): Action = {
      val __obj = js.Dynamic.literal(
        "Type" -> Type.asInstanceOf[js.Any]
      )

      AuthenticateCognitoConfig.foreach(
        __v => __obj.updateDynamic("AuthenticateCognitoConfig")(__v.asInstanceOf[js.Any])
      )
      AuthenticateOidcConfig.foreach(__v => __obj.updateDynamic("AuthenticateOidcConfig")(__v.asInstanceOf[js.Any]))
      FixedResponseConfig.foreach(__v => __obj.updateDynamic("FixedResponseConfig")(__v.asInstanceOf[js.Any]))
      Order.foreach(__v => __obj.updateDynamic("Order")(__v.asInstanceOf[js.Any]))
      RedirectConfig.foreach(__v => __obj.updateDynamic("RedirectConfig")(__v.asInstanceOf[js.Any]))
      TargetGroupArn.foreach(__v => __obj.updateDynamic("TargetGroupArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Action]
    }
  }

  object ActionTypeEnumEnum {
    val forward                = "forward"
    val `authenticate-oidc`    = "authenticate-oidc"
    val `authenticate-cognito` = "authenticate-cognito"
    val redirect               = "redirect"
    val `fixed-response`       = "fixed-response"

    val values =
      js.Object.freeze(js.Array(forward, `authenticate-oidc`, `authenticate-cognito`, redirect, `fixed-response`))
  }

  @js.native
  trait AddListenerCertificatesInput extends js.Object {
    var Certificates: CertificateList
    var ListenerArn: ListenerArn
  }

  object AddListenerCertificatesInput {
    def apply(
        Certificates: CertificateList,
        ListenerArn: ListenerArn
    ): AddListenerCertificatesInput = {
      val __obj = js.Dynamic.literal(
        "Certificates" -> Certificates.asInstanceOf[js.Any],
        "ListenerArn"  -> ListenerArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AddListenerCertificatesInput]
    }
  }

  @js.native
  trait AddListenerCertificatesOutput extends js.Object {
    var Certificates: js.UndefOr[CertificateList]
  }

  object AddListenerCertificatesOutput {
    def apply(
        Certificates: js.UndefOr[CertificateList] = js.undefined
    ): AddListenerCertificatesOutput = {
      val __obj = js.Dynamic.literal()
      Certificates.foreach(__v => __obj.updateDynamic("Certificates")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AddListenerCertificatesOutput]
    }
  }

  @js.native
  trait AddTagsInput extends js.Object {
    var ResourceArns: ResourceArns
    var Tags: TagList
  }

  object AddTagsInput {
    def apply(
        ResourceArns: ResourceArns,
        Tags: TagList
    ): AddTagsInput = {
      val __obj = js.Dynamic.literal(
        "ResourceArns" -> ResourceArns.asInstanceOf[js.Any],
        "Tags"         -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AddTagsInput]
    }
  }

  @js.native
  trait AddTagsOutput extends js.Object {}

  object AddTagsOutput {
    def apply(
        ): AddTagsOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[AddTagsOutput]
    }
  }

  object AuthenticateCognitoActionConditionalBehaviorEnumEnum {
    val deny         = "deny"
    val allow        = "allow"
    val authenticate = "authenticate"

    val values = js.Object.freeze(js.Array(deny, allow, authenticate))
  }

  /**
    * Request parameters to use when integrating with Amazon Cognito to authenticate users.
    */
  @js.native
  trait AuthenticateCognitoActionConfig extends js.Object {
    var UserPoolArn: AuthenticateCognitoActionUserPoolArn
    var UserPoolClientId: AuthenticateCognitoActionUserPoolClientId
    var UserPoolDomain: AuthenticateCognitoActionUserPoolDomain
    var AuthenticationRequestExtraParams: js.UndefOr[AuthenticateCognitoActionAuthenticationRequestExtraParams]
    var OnUnauthenticatedRequest: js.UndefOr[AuthenticateCognitoActionConditionalBehaviorEnum]
    var Scope: js.UndefOr[AuthenticateCognitoActionScope]
    var SessionCookieName: js.UndefOr[AuthenticateCognitoActionSessionCookieName]
    var SessionTimeout: js.UndefOr[AuthenticateCognitoActionSessionTimeout]
  }

  object AuthenticateCognitoActionConfig {
    def apply(
        UserPoolArn: AuthenticateCognitoActionUserPoolArn,
        UserPoolClientId: AuthenticateCognitoActionUserPoolClientId,
        UserPoolDomain: AuthenticateCognitoActionUserPoolDomain,
        AuthenticationRequestExtraParams: js.UndefOr[AuthenticateCognitoActionAuthenticationRequestExtraParams] =
          js.undefined,
        OnUnauthenticatedRequest: js.UndefOr[AuthenticateCognitoActionConditionalBehaviorEnum] = js.undefined,
        Scope: js.UndefOr[AuthenticateCognitoActionScope] = js.undefined,
        SessionCookieName: js.UndefOr[AuthenticateCognitoActionSessionCookieName] = js.undefined,
        SessionTimeout: js.UndefOr[AuthenticateCognitoActionSessionTimeout] = js.undefined
    ): AuthenticateCognitoActionConfig = {
      val __obj = js.Dynamic.literal(
        "UserPoolArn"      -> UserPoolArn.asInstanceOf[js.Any],
        "UserPoolClientId" -> UserPoolClientId.asInstanceOf[js.Any],
        "UserPoolDomain"   -> UserPoolDomain.asInstanceOf[js.Any]
      )

      AuthenticationRequestExtraParams.foreach(
        __v => __obj.updateDynamic("AuthenticationRequestExtraParams")(__v.asInstanceOf[js.Any])
      )
      OnUnauthenticatedRequest.foreach(__v => __obj.updateDynamic("OnUnauthenticatedRequest")(__v.asInstanceOf[js.Any]))
      Scope.foreach(__v => __obj.updateDynamic("Scope")(__v.asInstanceOf[js.Any]))
      SessionCookieName.foreach(__v => __obj.updateDynamic("SessionCookieName")(__v.asInstanceOf[js.Any]))
      SessionTimeout.foreach(__v => __obj.updateDynamic("SessionTimeout")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AuthenticateCognitoActionConfig]
    }
  }

  object AuthenticateOidcActionConditionalBehaviorEnumEnum {
    val deny         = "deny"
    val allow        = "allow"
    val authenticate = "authenticate"

    val values = js.Object.freeze(js.Array(deny, allow, authenticate))
  }

  /**
    * Request parameters when using an identity provider (IdP) that is compliant with OpenID Connect (OIDC) to authenticate users.
    */
  @js.native
  trait AuthenticateOidcActionConfig extends js.Object {
    var AuthorizationEndpoint: AuthenticateOidcActionAuthorizationEndpoint
    var ClientId: AuthenticateOidcActionClientId
    var Issuer: AuthenticateOidcActionIssuer
    var TokenEndpoint: AuthenticateOidcActionTokenEndpoint
    var UserInfoEndpoint: AuthenticateOidcActionUserInfoEndpoint
    var AuthenticationRequestExtraParams: js.UndefOr[AuthenticateOidcActionAuthenticationRequestExtraParams]
    var ClientSecret: js.UndefOr[AuthenticateOidcActionClientSecret]
    var OnUnauthenticatedRequest: js.UndefOr[AuthenticateOidcActionConditionalBehaviorEnum]
    var Scope: js.UndefOr[AuthenticateOidcActionScope]
    var SessionCookieName: js.UndefOr[AuthenticateOidcActionSessionCookieName]
    var SessionTimeout: js.UndefOr[AuthenticateOidcActionSessionTimeout]
    var UseExistingClientSecret: js.UndefOr[AuthenticateOidcActionUseExistingClientSecret]
  }

  object AuthenticateOidcActionConfig {
    def apply(
        AuthorizationEndpoint: AuthenticateOidcActionAuthorizationEndpoint,
        ClientId: AuthenticateOidcActionClientId,
        Issuer: AuthenticateOidcActionIssuer,
        TokenEndpoint: AuthenticateOidcActionTokenEndpoint,
        UserInfoEndpoint: AuthenticateOidcActionUserInfoEndpoint,
        AuthenticationRequestExtraParams: js.UndefOr[AuthenticateOidcActionAuthenticationRequestExtraParams] =
          js.undefined,
        ClientSecret: js.UndefOr[AuthenticateOidcActionClientSecret] = js.undefined,
        OnUnauthenticatedRequest: js.UndefOr[AuthenticateOidcActionConditionalBehaviorEnum] = js.undefined,
        Scope: js.UndefOr[AuthenticateOidcActionScope] = js.undefined,
        SessionCookieName: js.UndefOr[AuthenticateOidcActionSessionCookieName] = js.undefined,
        SessionTimeout: js.UndefOr[AuthenticateOidcActionSessionTimeout] = js.undefined,
        UseExistingClientSecret: js.UndefOr[AuthenticateOidcActionUseExistingClientSecret] = js.undefined
    ): AuthenticateOidcActionConfig = {
      val __obj = js.Dynamic.literal(
        "AuthorizationEndpoint" -> AuthorizationEndpoint.asInstanceOf[js.Any],
        "ClientId"              -> ClientId.asInstanceOf[js.Any],
        "Issuer"                -> Issuer.asInstanceOf[js.Any],
        "TokenEndpoint"         -> TokenEndpoint.asInstanceOf[js.Any],
        "UserInfoEndpoint"      -> UserInfoEndpoint.asInstanceOf[js.Any]
      )

      AuthenticationRequestExtraParams.foreach(
        __v => __obj.updateDynamic("AuthenticationRequestExtraParams")(__v.asInstanceOf[js.Any])
      )
      ClientSecret.foreach(__v => __obj.updateDynamic("ClientSecret")(__v.asInstanceOf[js.Any]))
      OnUnauthenticatedRequest.foreach(__v => __obj.updateDynamic("OnUnauthenticatedRequest")(__v.asInstanceOf[js.Any]))
      Scope.foreach(__v => __obj.updateDynamic("Scope")(__v.asInstanceOf[js.Any]))
      SessionCookieName.foreach(__v => __obj.updateDynamic("SessionCookieName")(__v.asInstanceOf[js.Any]))
      SessionTimeout.foreach(__v => __obj.updateDynamic("SessionTimeout")(__v.asInstanceOf[js.Any]))
      UseExistingClientSecret.foreach(__v => __obj.updateDynamic("UseExistingClientSecret")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AuthenticateOidcActionConfig]
    }
  }

  /**
    * Information about an Availability Zone.
    */
  @js.native
  trait AvailabilityZone extends js.Object {
    var LoadBalancerAddresses: js.UndefOr[LoadBalancerAddresses]
    var SubnetId: js.UndefOr[SubnetId]
    var ZoneName: js.UndefOr[ZoneName]
  }

  object AvailabilityZone {
    def apply(
        LoadBalancerAddresses: js.UndefOr[LoadBalancerAddresses] = js.undefined,
        SubnetId: js.UndefOr[SubnetId] = js.undefined,
        ZoneName: js.UndefOr[ZoneName] = js.undefined
    ): AvailabilityZone = {
      val __obj = js.Dynamic.literal()
      LoadBalancerAddresses.foreach(__v => __obj.updateDynamic("LoadBalancerAddresses")(__v.asInstanceOf[js.Any]))
      SubnetId.foreach(__v => __obj.updateDynamic("SubnetId")(__v.asInstanceOf[js.Any]))
      ZoneName.foreach(__v => __obj.updateDynamic("ZoneName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AvailabilityZone]
    }
  }

  /**
    * Information about an SSL server certificate.
    */
  @js.native
  trait Certificate extends js.Object {
    var CertificateArn: js.UndefOr[CertificateArn]
    var IsDefault: js.UndefOr[Default]
  }

  object Certificate {
    def apply(
        CertificateArn: js.UndefOr[CertificateArn] = js.undefined,
        IsDefault: js.UndefOr[Default] = js.undefined
    ): Certificate = {
      val __obj = js.Dynamic.literal()
      CertificateArn.foreach(__v => __obj.updateDynamic("CertificateArn")(__v.asInstanceOf[js.Any]))
      IsDefault.foreach(__v => __obj.updateDynamic("IsDefault")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Certificate]
    }
  }

  /**
    * Information about a cipher used in a policy.
    */
  @js.native
  trait Cipher extends js.Object {
    var Name: js.UndefOr[CipherName]
    var Priority: js.UndefOr[CipherPriority]
  }

  object Cipher {
    def apply(
        Name: js.UndefOr[CipherName] = js.undefined,
        Priority: js.UndefOr[CipherPriority] = js.undefined
    ): Cipher = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Priority.foreach(__v => __obj.updateDynamic("Priority")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Cipher]
    }
  }

  @js.native
  trait CreateListenerInput extends js.Object {
    var DefaultActions: Actions
    var LoadBalancerArn: LoadBalancerArn
    var Port: Port
    var Protocol: ProtocolEnum
    var Certificates: js.UndefOr[CertificateList]
    var SslPolicy: js.UndefOr[SslPolicyName]
  }

  object CreateListenerInput {
    def apply(
        DefaultActions: Actions,
        LoadBalancerArn: LoadBalancerArn,
        Port: Port,
        Protocol: ProtocolEnum,
        Certificates: js.UndefOr[CertificateList] = js.undefined,
        SslPolicy: js.UndefOr[SslPolicyName] = js.undefined
    ): CreateListenerInput = {
      val __obj = js.Dynamic.literal(
        "DefaultActions"  -> DefaultActions.asInstanceOf[js.Any],
        "LoadBalancerArn" -> LoadBalancerArn.asInstanceOf[js.Any],
        "Port"            -> Port.asInstanceOf[js.Any],
        "Protocol"        -> Protocol.asInstanceOf[js.Any]
      )

      Certificates.foreach(__v => __obj.updateDynamic("Certificates")(__v.asInstanceOf[js.Any]))
      SslPolicy.foreach(__v => __obj.updateDynamic("SslPolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateListenerInput]
    }
  }

  @js.native
  trait CreateListenerOutput extends js.Object {
    var Listeners: js.UndefOr[Listeners]
  }

  object CreateListenerOutput {
    def apply(
        Listeners: js.UndefOr[Listeners] = js.undefined
    ): CreateListenerOutput = {
      val __obj = js.Dynamic.literal()
      Listeners.foreach(__v => __obj.updateDynamic("Listeners")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateListenerOutput]
    }
  }

  @js.native
  trait CreateLoadBalancerInput extends js.Object {
    var Name: LoadBalancerName
    var IpAddressType: js.UndefOr[IpAddressType]
    var Scheme: js.UndefOr[LoadBalancerSchemeEnum]
    var SecurityGroups: js.UndefOr[SecurityGroups]
    var SubnetMappings: js.UndefOr[SubnetMappings]
    var Subnets: js.UndefOr[Subnets]
    var Tags: js.UndefOr[TagList]
    var Type: js.UndefOr[LoadBalancerTypeEnum]
  }

  object CreateLoadBalancerInput {
    def apply(
        Name: LoadBalancerName,
        IpAddressType: js.UndefOr[IpAddressType] = js.undefined,
        Scheme: js.UndefOr[LoadBalancerSchemeEnum] = js.undefined,
        SecurityGroups: js.UndefOr[SecurityGroups] = js.undefined,
        SubnetMappings: js.UndefOr[SubnetMappings] = js.undefined,
        Subnets: js.UndefOr[Subnets] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        Type: js.UndefOr[LoadBalancerTypeEnum] = js.undefined
    ): CreateLoadBalancerInput = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      IpAddressType.foreach(__v => __obj.updateDynamic("IpAddressType")(__v.asInstanceOf[js.Any]))
      Scheme.foreach(__v => __obj.updateDynamic("Scheme")(__v.asInstanceOf[js.Any]))
      SecurityGroups.foreach(__v => __obj.updateDynamic("SecurityGroups")(__v.asInstanceOf[js.Any]))
      SubnetMappings.foreach(__v => __obj.updateDynamic("SubnetMappings")(__v.asInstanceOf[js.Any]))
      Subnets.foreach(__v => __obj.updateDynamic("Subnets")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLoadBalancerInput]
    }
  }

  @js.native
  trait CreateLoadBalancerOutput extends js.Object {
    var LoadBalancers: js.UndefOr[LoadBalancers]
  }

  object CreateLoadBalancerOutput {
    def apply(
        LoadBalancers: js.UndefOr[LoadBalancers] = js.undefined
    ): CreateLoadBalancerOutput = {
      val __obj = js.Dynamic.literal()
      LoadBalancers.foreach(__v => __obj.updateDynamic("LoadBalancers")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLoadBalancerOutput]
    }
  }

  @js.native
  trait CreateRuleInput extends js.Object {
    var Actions: Actions
    var Conditions: RuleConditionList
    var ListenerArn: ListenerArn
    var Priority: RulePriority
  }

  object CreateRuleInput {
    def apply(
        Actions: Actions,
        Conditions: RuleConditionList,
        ListenerArn: ListenerArn,
        Priority: RulePriority
    ): CreateRuleInput = {
      val __obj = js.Dynamic.literal(
        "Actions"     -> Actions.asInstanceOf[js.Any],
        "Conditions"  -> Conditions.asInstanceOf[js.Any],
        "ListenerArn" -> ListenerArn.asInstanceOf[js.Any],
        "Priority"    -> Priority.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateRuleInput]
    }
  }

  @js.native
  trait CreateRuleOutput extends js.Object {
    var Rules: js.UndefOr[Rules]
  }

  object CreateRuleOutput {
    def apply(
        Rules: js.UndefOr[Rules] = js.undefined
    ): CreateRuleOutput = {
      val __obj = js.Dynamic.literal()
      Rules.foreach(__v => __obj.updateDynamic("Rules")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRuleOutput]
    }
  }

  @js.native
  trait CreateTargetGroupInput extends js.Object {
    var Name: TargetGroupName
    var HealthCheckEnabled: js.UndefOr[HealthCheckEnabled]
    var HealthCheckIntervalSeconds: js.UndefOr[HealthCheckIntervalSeconds]
    var HealthCheckPath: js.UndefOr[Path]
    var HealthCheckPort: js.UndefOr[HealthCheckPort]
    var HealthCheckProtocol: js.UndefOr[ProtocolEnum]
    var HealthCheckTimeoutSeconds: js.UndefOr[HealthCheckTimeoutSeconds]
    var HealthyThresholdCount: js.UndefOr[HealthCheckThresholdCount]
    var Matcher: js.UndefOr[Matcher]
    var Port: js.UndefOr[Port]
    var Protocol: js.UndefOr[ProtocolEnum]
    var TargetType: js.UndefOr[TargetTypeEnum]
    var UnhealthyThresholdCount: js.UndefOr[HealthCheckThresholdCount]
    var VpcId: js.UndefOr[VpcId]
  }

  object CreateTargetGroupInput {
    def apply(
        Name: TargetGroupName,
        HealthCheckEnabled: js.UndefOr[HealthCheckEnabled] = js.undefined,
        HealthCheckIntervalSeconds: js.UndefOr[HealthCheckIntervalSeconds] = js.undefined,
        HealthCheckPath: js.UndefOr[Path] = js.undefined,
        HealthCheckPort: js.UndefOr[HealthCheckPort] = js.undefined,
        HealthCheckProtocol: js.UndefOr[ProtocolEnum] = js.undefined,
        HealthCheckTimeoutSeconds: js.UndefOr[HealthCheckTimeoutSeconds] = js.undefined,
        HealthyThresholdCount: js.UndefOr[HealthCheckThresholdCount] = js.undefined,
        Matcher: js.UndefOr[Matcher] = js.undefined,
        Port: js.UndefOr[Port] = js.undefined,
        Protocol: js.UndefOr[ProtocolEnum] = js.undefined,
        TargetType: js.UndefOr[TargetTypeEnum] = js.undefined,
        UnhealthyThresholdCount: js.UndefOr[HealthCheckThresholdCount] = js.undefined,
        VpcId: js.UndefOr[VpcId] = js.undefined
    ): CreateTargetGroupInput = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      HealthCheckEnabled.foreach(__v => __obj.updateDynamic("HealthCheckEnabled")(__v.asInstanceOf[js.Any]))
      HealthCheckIntervalSeconds.foreach(
        __v => __obj.updateDynamic("HealthCheckIntervalSeconds")(__v.asInstanceOf[js.Any])
      )
      HealthCheckPath.foreach(__v => __obj.updateDynamic("HealthCheckPath")(__v.asInstanceOf[js.Any]))
      HealthCheckPort.foreach(__v => __obj.updateDynamic("HealthCheckPort")(__v.asInstanceOf[js.Any]))
      HealthCheckProtocol.foreach(__v => __obj.updateDynamic("HealthCheckProtocol")(__v.asInstanceOf[js.Any]))
      HealthCheckTimeoutSeconds.foreach(
        __v => __obj.updateDynamic("HealthCheckTimeoutSeconds")(__v.asInstanceOf[js.Any])
      )
      HealthyThresholdCount.foreach(__v => __obj.updateDynamic("HealthyThresholdCount")(__v.asInstanceOf[js.Any]))
      Matcher.foreach(__v => __obj.updateDynamic("Matcher")(__v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      Protocol.foreach(__v => __obj.updateDynamic("Protocol")(__v.asInstanceOf[js.Any]))
      TargetType.foreach(__v => __obj.updateDynamic("TargetType")(__v.asInstanceOf[js.Any]))
      UnhealthyThresholdCount.foreach(__v => __obj.updateDynamic("UnhealthyThresholdCount")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTargetGroupInput]
    }
  }

  @js.native
  trait CreateTargetGroupOutput extends js.Object {
    var TargetGroups: js.UndefOr[TargetGroups]
  }

  object CreateTargetGroupOutput {
    def apply(
        TargetGroups: js.UndefOr[TargetGroups] = js.undefined
    ): CreateTargetGroupOutput = {
      val __obj = js.Dynamic.literal()
      TargetGroups.foreach(__v => __obj.updateDynamic("TargetGroups")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTargetGroupOutput]
    }
  }

  @js.native
  trait DeleteListenerInput extends js.Object {
    var ListenerArn: ListenerArn
  }

  object DeleteListenerInput {
    def apply(
        ListenerArn: ListenerArn
    ): DeleteListenerInput = {
      val __obj = js.Dynamic.literal(
        "ListenerArn" -> ListenerArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteListenerInput]
    }
  }

  @js.native
  trait DeleteListenerOutput extends js.Object {}

  object DeleteListenerOutput {
    def apply(
        ): DeleteListenerOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteListenerOutput]
    }
  }

  @js.native
  trait DeleteLoadBalancerInput extends js.Object {
    var LoadBalancerArn: LoadBalancerArn
  }

  object DeleteLoadBalancerInput {
    def apply(
        LoadBalancerArn: LoadBalancerArn
    ): DeleteLoadBalancerInput = {
      val __obj = js.Dynamic.literal(
        "LoadBalancerArn" -> LoadBalancerArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteLoadBalancerInput]
    }
  }

  @js.native
  trait DeleteLoadBalancerOutput extends js.Object {}

  object DeleteLoadBalancerOutput {
    def apply(
        ): DeleteLoadBalancerOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteLoadBalancerOutput]
    }
  }

  @js.native
  trait DeleteRuleInput extends js.Object {
    var RuleArn: RuleArn
  }

  object DeleteRuleInput {
    def apply(
        RuleArn: RuleArn
    ): DeleteRuleInput = {
      val __obj = js.Dynamic.literal(
        "RuleArn" -> RuleArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteRuleInput]
    }
  }

  @js.native
  trait DeleteRuleOutput extends js.Object {}

  object DeleteRuleOutput {
    def apply(
        ): DeleteRuleOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteRuleOutput]
    }
  }

  @js.native
  trait DeleteTargetGroupInput extends js.Object {
    var TargetGroupArn: TargetGroupArn
  }

  object DeleteTargetGroupInput {
    def apply(
        TargetGroupArn: TargetGroupArn
    ): DeleteTargetGroupInput = {
      val __obj = js.Dynamic.literal(
        "TargetGroupArn" -> TargetGroupArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteTargetGroupInput]
    }
  }

  @js.native
  trait DeleteTargetGroupOutput extends js.Object {}

  object DeleteTargetGroupOutput {
    def apply(
        ): DeleteTargetGroupOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteTargetGroupOutput]
    }
  }

  @js.native
  trait DeregisterTargetsInput extends js.Object {
    var TargetGroupArn: TargetGroupArn
    var Targets: TargetDescriptions
  }

  object DeregisterTargetsInput {
    def apply(
        TargetGroupArn: TargetGroupArn,
        Targets: TargetDescriptions
    ): DeregisterTargetsInput = {
      val __obj = js.Dynamic.literal(
        "TargetGroupArn" -> TargetGroupArn.asInstanceOf[js.Any],
        "Targets"        -> Targets.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeregisterTargetsInput]
    }
  }

  @js.native
  trait DeregisterTargetsOutput extends js.Object {}

  object DeregisterTargetsOutput {
    def apply(
        ): DeregisterTargetsOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeregisterTargetsOutput]
    }
  }

  @js.native
  trait DescribeAccountLimitsInput extends js.Object {
    var Marker: js.UndefOr[Marker]
    var PageSize: js.UndefOr[PageSize]
  }

  object DescribeAccountLimitsInput {
    def apply(
        Marker: js.UndefOr[Marker] = js.undefined,
        PageSize: js.UndefOr[PageSize] = js.undefined
    ): DescribeAccountLimitsInput = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAccountLimitsInput]
    }
  }

  @js.native
  trait DescribeAccountLimitsOutput extends js.Object {
    var Limits: js.UndefOr[Limits]
    var NextMarker: js.UndefOr[Marker]
  }

  object DescribeAccountLimitsOutput {
    def apply(
        Limits: js.UndefOr[Limits] = js.undefined,
        NextMarker: js.UndefOr[Marker] = js.undefined
    ): DescribeAccountLimitsOutput = {
      val __obj = js.Dynamic.literal()
      Limits.foreach(__v => __obj.updateDynamic("Limits")(__v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAccountLimitsOutput]
    }
  }

  @js.native
  trait DescribeListenerCertificatesInput extends js.Object {
    var ListenerArn: ListenerArn
    var Marker: js.UndefOr[Marker]
    var PageSize: js.UndefOr[PageSize]
  }

  object DescribeListenerCertificatesInput {
    def apply(
        ListenerArn: ListenerArn,
        Marker: js.UndefOr[Marker] = js.undefined,
        PageSize: js.UndefOr[PageSize] = js.undefined
    ): DescribeListenerCertificatesInput = {
      val __obj = js.Dynamic.literal(
        "ListenerArn" -> ListenerArn.asInstanceOf[js.Any]
      )

      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeListenerCertificatesInput]
    }
  }

  @js.native
  trait DescribeListenerCertificatesOutput extends js.Object {
    var Certificates: js.UndefOr[CertificateList]
    var NextMarker: js.UndefOr[Marker]
  }

  object DescribeListenerCertificatesOutput {
    def apply(
        Certificates: js.UndefOr[CertificateList] = js.undefined,
        NextMarker: js.UndefOr[Marker] = js.undefined
    ): DescribeListenerCertificatesOutput = {
      val __obj = js.Dynamic.literal()
      Certificates.foreach(__v => __obj.updateDynamic("Certificates")(__v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeListenerCertificatesOutput]
    }
  }

  @js.native
  trait DescribeListenersInput extends js.Object {
    var ListenerArns: js.UndefOr[ListenerArns]
    var LoadBalancerArn: js.UndefOr[LoadBalancerArn]
    var Marker: js.UndefOr[Marker]
    var PageSize: js.UndefOr[PageSize]
  }

  object DescribeListenersInput {
    def apply(
        ListenerArns: js.UndefOr[ListenerArns] = js.undefined,
        LoadBalancerArn: js.UndefOr[LoadBalancerArn] = js.undefined,
        Marker: js.UndefOr[Marker] = js.undefined,
        PageSize: js.UndefOr[PageSize] = js.undefined
    ): DescribeListenersInput = {
      val __obj = js.Dynamic.literal()
      ListenerArns.foreach(__v => __obj.updateDynamic("ListenerArns")(__v.asInstanceOf[js.Any]))
      LoadBalancerArn.foreach(__v => __obj.updateDynamic("LoadBalancerArn")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeListenersInput]
    }
  }

  @js.native
  trait DescribeListenersOutput extends js.Object {
    var Listeners: js.UndefOr[Listeners]
    var NextMarker: js.UndefOr[Marker]
  }

  object DescribeListenersOutput {
    def apply(
        Listeners: js.UndefOr[Listeners] = js.undefined,
        NextMarker: js.UndefOr[Marker] = js.undefined
    ): DescribeListenersOutput = {
      val __obj = js.Dynamic.literal()
      Listeners.foreach(__v => __obj.updateDynamic("Listeners")(__v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeListenersOutput]
    }
  }

  @js.native
  trait DescribeLoadBalancerAttributesInput extends js.Object {
    var LoadBalancerArn: LoadBalancerArn
  }

  object DescribeLoadBalancerAttributesInput {
    def apply(
        LoadBalancerArn: LoadBalancerArn
    ): DescribeLoadBalancerAttributesInput = {
      val __obj = js.Dynamic.literal(
        "LoadBalancerArn" -> LoadBalancerArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeLoadBalancerAttributesInput]
    }
  }

  @js.native
  trait DescribeLoadBalancerAttributesOutput extends js.Object {
    var Attributes: js.UndefOr[LoadBalancerAttributes]
  }

  object DescribeLoadBalancerAttributesOutput {
    def apply(
        Attributes: js.UndefOr[LoadBalancerAttributes] = js.undefined
    ): DescribeLoadBalancerAttributesOutput = {
      val __obj = js.Dynamic.literal()
      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeLoadBalancerAttributesOutput]
    }
  }

  @js.native
  trait DescribeLoadBalancersInput extends js.Object {
    var LoadBalancerArns: js.UndefOr[LoadBalancerArns]
    var Marker: js.UndefOr[Marker]
    var Names: js.UndefOr[LoadBalancerNames]
    var PageSize: js.UndefOr[PageSize]
  }

  object DescribeLoadBalancersInput {
    def apply(
        LoadBalancerArns: js.UndefOr[LoadBalancerArns] = js.undefined,
        Marker: js.UndefOr[Marker] = js.undefined,
        Names: js.UndefOr[LoadBalancerNames] = js.undefined,
        PageSize: js.UndefOr[PageSize] = js.undefined
    ): DescribeLoadBalancersInput = {
      val __obj = js.Dynamic.literal()
      LoadBalancerArns.foreach(__v => __obj.updateDynamic("LoadBalancerArns")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      Names.foreach(__v => __obj.updateDynamic("Names")(__v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeLoadBalancersInput]
    }
  }

  @js.native
  trait DescribeLoadBalancersOutput extends js.Object {
    var LoadBalancers: js.UndefOr[LoadBalancers]
    var NextMarker: js.UndefOr[Marker]
  }

  object DescribeLoadBalancersOutput {
    def apply(
        LoadBalancers: js.UndefOr[LoadBalancers] = js.undefined,
        NextMarker: js.UndefOr[Marker] = js.undefined
    ): DescribeLoadBalancersOutput = {
      val __obj = js.Dynamic.literal()
      LoadBalancers.foreach(__v => __obj.updateDynamic("LoadBalancers")(__v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeLoadBalancersOutput]
    }
  }

  @js.native
  trait DescribeRulesInput extends js.Object {
    var ListenerArn: js.UndefOr[ListenerArn]
    var Marker: js.UndefOr[Marker]
    var PageSize: js.UndefOr[PageSize]
    var RuleArns: js.UndefOr[RuleArns]
  }

  object DescribeRulesInput {
    def apply(
        ListenerArn: js.UndefOr[ListenerArn] = js.undefined,
        Marker: js.UndefOr[Marker] = js.undefined,
        PageSize: js.UndefOr[PageSize] = js.undefined,
        RuleArns: js.UndefOr[RuleArns] = js.undefined
    ): DescribeRulesInput = {
      val __obj = js.Dynamic.literal()
      ListenerArn.foreach(__v => __obj.updateDynamic("ListenerArn")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      RuleArns.foreach(__v => __obj.updateDynamic("RuleArns")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRulesInput]
    }
  }

  @js.native
  trait DescribeRulesOutput extends js.Object {
    var NextMarker: js.UndefOr[Marker]
    var Rules: js.UndefOr[Rules]
  }

  object DescribeRulesOutput {
    def apply(
        NextMarker: js.UndefOr[Marker] = js.undefined,
        Rules: js.UndefOr[Rules] = js.undefined
    ): DescribeRulesOutput = {
      val __obj = js.Dynamic.literal()
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      Rules.foreach(__v => __obj.updateDynamic("Rules")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRulesOutput]
    }
  }

  @js.native
  trait DescribeSSLPoliciesInput extends js.Object {
    var Marker: js.UndefOr[Marker]
    var Names: js.UndefOr[SslPolicyNames]
    var PageSize: js.UndefOr[PageSize]
  }

  object DescribeSSLPoliciesInput {
    def apply(
        Marker: js.UndefOr[Marker] = js.undefined,
        Names: js.UndefOr[SslPolicyNames] = js.undefined,
        PageSize: js.UndefOr[PageSize] = js.undefined
    ): DescribeSSLPoliciesInput = {
      val __obj = js.Dynamic.literal()
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      Names.foreach(__v => __obj.updateDynamic("Names")(__v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSSLPoliciesInput]
    }
  }

  @js.native
  trait DescribeSSLPoliciesOutput extends js.Object {
    var NextMarker: js.UndefOr[Marker]
    var SslPolicies: js.UndefOr[SslPolicies]
  }

  object DescribeSSLPoliciesOutput {
    def apply(
        NextMarker: js.UndefOr[Marker] = js.undefined,
        SslPolicies: js.UndefOr[SslPolicies] = js.undefined
    ): DescribeSSLPoliciesOutput = {
      val __obj = js.Dynamic.literal()
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      SslPolicies.foreach(__v => __obj.updateDynamic("SslPolicies")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSSLPoliciesOutput]
    }
  }

  @js.native
  trait DescribeTagsInput extends js.Object {
    var ResourceArns: ResourceArns
  }

  object DescribeTagsInput {
    def apply(
        ResourceArns: ResourceArns
    ): DescribeTagsInput = {
      val __obj = js.Dynamic.literal(
        "ResourceArns" -> ResourceArns.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeTagsInput]
    }
  }

  @js.native
  trait DescribeTagsOutput extends js.Object {
    var TagDescriptions: js.UndefOr[TagDescriptions]
  }

  object DescribeTagsOutput {
    def apply(
        TagDescriptions: js.UndefOr[TagDescriptions] = js.undefined
    ): DescribeTagsOutput = {
      val __obj = js.Dynamic.literal()
      TagDescriptions.foreach(__v => __obj.updateDynamic("TagDescriptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTagsOutput]
    }
  }

  @js.native
  trait DescribeTargetGroupAttributesInput extends js.Object {
    var TargetGroupArn: TargetGroupArn
  }

  object DescribeTargetGroupAttributesInput {
    def apply(
        TargetGroupArn: TargetGroupArn
    ): DescribeTargetGroupAttributesInput = {
      val __obj = js.Dynamic.literal(
        "TargetGroupArn" -> TargetGroupArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeTargetGroupAttributesInput]
    }
  }

  @js.native
  trait DescribeTargetGroupAttributesOutput extends js.Object {
    var Attributes: js.UndefOr[TargetGroupAttributes]
  }

  object DescribeTargetGroupAttributesOutput {
    def apply(
        Attributes: js.UndefOr[TargetGroupAttributes] = js.undefined
    ): DescribeTargetGroupAttributesOutput = {
      val __obj = js.Dynamic.literal()
      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTargetGroupAttributesOutput]
    }
  }

  @js.native
  trait DescribeTargetGroupsInput extends js.Object {
    var LoadBalancerArn: js.UndefOr[LoadBalancerArn]
    var Marker: js.UndefOr[Marker]
    var Names: js.UndefOr[TargetGroupNames]
    var PageSize: js.UndefOr[PageSize]
    var TargetGroupArns: js.UndefOr[TargetGroupArns]
  }

  object DescribeTargetGroupsInput {
    def apply(
        LoadBalancerArn: js.UndefOr[LoadBalancerArn] = js.undefined,
        Marker: js.UndefOr[Marker] = js.undefined,
        Names: js.UndefOr[TargetGroupNames] = js.undefined,
        PageSize: js.UndefOr[PageSize] = js.undefined,
        TargetGroupArns: js.UndefOr[TargetGroupArns] = js.undefined
    ): DescribeTargetGroupsInput = {
      val __obj = js.Dynamic.literal()
      LoadBalancerArn.foreach(__v => __obj.updateDynamic("LoadBalancerArn")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      Names.foreach(__v => __obj.updateDynamic("Names")(__v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      TargetGroupArns.foreach(__v => __obj.updateDynamic("TargetGroupArns")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTargetGroupsInput]
    }
  }

  @js.native
  trait DescribeTargetGroupsOutput extends js.Object {
    var NextMarker: js.UndefOr[Marker]
    var TargetGroups: js.UndefOr[TargetGroups]
  }

  object DescribeTargetGroupsOutput {
    def apply(
        NextMarker: js.UndefOr[Marker] = js.undefined,
        TargetGroups: js.UndefOr[TargetGroups] = js.undefined
    ): DescribeTargetGroupsOutput = {
      val __obj = js.Dynamic.literal()
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      TargetGroups.foreach(__v => __obj.updateDynamic("TargetGroups")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTargetGroupsOutput]
    }
  }

  @js.native
  trait DescribeTargetHealthInput extends js.Object {
    var TargetGroupArn: TargetGroupArn
    var Targets: js.UndefOr[TargetDescriptions]
  }

  object DescribeTargetHealthInput {
    def apply(
        TargetGroupArn: TargetGroupArn,
        Targets: js.UndefOr[TargetDescriptions] = js.undefined
    ): DescribeTargetHealthInput = {
      val __obj = js.Dynamic.literal(
        "TargetGroupArn" -> TargetGroupArn.asInstanceOf[js.Any]
      )

      Targets.foreach(__v => __obj.updateDynamic("Targets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTargetHealthInput]
    }
  }

  @js.native
  trait DescribeTargetHealthOutput extends js.Object {
    var TargetHealthDescriptions: js.UndefOr[TargetHealthDescriptions]
  }

  object DescribeTargetHealthOutput {
    def apply(
        TargetHealthDescriptions: js.UndefOr[TargetHealthDescriptions] = js.undefined
    ): DescribeTargetHealthOutput = {
      val __obj = js.Dynamic.literal()
      TargetHealthDescriptions.foreach(__v => __obj.updateDynamic("TargetHealthDescriptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTargetHealthOutput]
    }
  }

  /**
    * Information about an action that returns a custom HTTP response.
    */
  @js.native
  trait FixedResponseActionConfig extends js.Object {
    var StatusCode: FixedResponseActionStatusCode
    var ContentType: js.UndefOr[FixedResponseActionContentType]
    var MessageBody: js.UndefOr[FixedResponseActionMessage]
  }

  object FixedResponseActionConfig {
    def apply(
        StatusCode: FixedResponseActionStatusCode,
        ContentType: js.UndefOr[FixedResponseActionContentType] = js.undefined,
        MessageBody: js.UndefOr[FixedResponseActionMessage] = js.undefined
    ): FixedResponseActionConfig = {
      val __obj = js.Dynamic.literal(
        "StatusCode" -> StatusCode.asInstanceOf[js.Any]
      )

      ContentType.foreach(__v => __obj.updateDynamic("ContentType")(__v.asInstanceOf[js.Any]))
      MessageBody.foreach(__v => __obj.updateDynamic("MessageBody")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FixedResponseActionConfig]
    }
  }

  /**
    * Information about a host header condition.
    */
  @js.native
  trait HostHeaderConditionConfig extends js.Object {
    var Values: js.UndefOr[ListOfString]
  }

  object HostHeaderConditionConfig {
    def apply(
        Values: js.UndefOr[ListOfString] = js.undefined
    ): HostHeaderConditionConfig = {
      val __obj = js.Dynamic.literal()
      Values.foreach(__v => __obj.updateDynamic("Values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HostHeaderConditionConfig]
    }
  }

  /**
    * Information about an HTTP header condition.
    *  There is a set of standard HTTP header fields. You can also define custom HTTP header fields.
    */
  @js.native
  trait HttpHeaderConditionConfig extends js.Object {
    var HttpHeaderName: js.UndefOr[HttpHeaderConditionName]
    var Values: js.UndefOr[ListOfString]
  }

  object HttpHeaderConditionConfig {
    def apply(
        HttpHeaderName: js.UndefOr[HttpHeaderConditionName] = js.undefined,
        Values: js.UndefOr[ListOfString] = js.undefined
    ): HttpHeaderConditionConfig = {
      val __obj = js.Dynamic.literal()
      HttpHeaderName.foreach(__v => __obj.updateDynamic("HttpHeaderName")(__v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.updateDynamic("Values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HttpHeaderConditionConfig]
    }
  }

  /**
    * Information about an HTTP method condition.
    *  HTTP defines a set of request methods, also referred to as HTTP verbs. For more information, see the [[https://www.iana.org/assignments/http-methods/http-methods.xhtml|HTTP Method Registry]]. You can also define custom HTTP methods.
    */
  @js.native
  trait HttpRequestMethodConditionConfig extends js.Object {
    var Values: js.UndefOr[ListOfString]
  }

  object HttpRequestMethodConditionConfig {
    def apply(
        Values: js.UndefOr[ListOfString] = js.undefined
    ): HttpRequestMethodConditionConfig = {
      val __obj = js.Dynamic.literal()
      Values.foreach(__v => __obj.updateDynamic("Values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HttpRequestMethodConditionConfig]
    }
  }

  object IpAddressTypeEnum {
    val ipv4      = "ipv4"
    val dualstack = "dualstack"

    val values = js.Object.freeze(js.Array(ipv4, dualstack))
  }

  /**
    * Information about an Elastic Load Balancing resource limit for your AWS account.
    */
  @js.native
  trait Limit extends js.Object {
    var Max: js.UndefOr[Max]
    var Name: js.UndefOr[Name]
  }

  object Limit {
    def apply(
        Max: js.UndefOr[Max] = js.undefined,
        Name: js.UndefOr[Name] = js.undefined
    ): Limit = {
      val __obj = js.Dynamic.literal()
      Max.foreach(__v => __obj.updateDynamic("Max")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Limit]
    }
  }

  /**
    * Information about a listener.
    */
  @js.native
  trait Listener extends js.Object {
    var Certificates: js.UndefOr[CertificateList]
    var DefaultActions: js.UndefOr[Actions]
    var ListenerArn: js.UndefOr[ListenerArn]
    var LoadBalancerArn: js.UndefOr[LoadBalancerArn]
    var Port: js.UndefOr[Port]
    var Protocol: js.UndefOr[ProtocolEnum]
    var SslPolicy: js.UndefOr[SslPolicyName]
  }

  object Listener {
    def apply(
        Certificates: js.UndefOr[CertificateList] = js.undefined,
        DefaultActions: js.UndefOr[Actions] = js.undefined,
        ListenerArn: js.UndefOr[ListenerArn] = js.undefined,
        LoadBalancerArn: js.UndefOr[LoadBalancerArn] = js.undefined,
        Port: js.UndefOr[Port] = js.undefined,
        Protocol: js.UndefOr[ProtocolEnum] = js.undefined,
        SslPolicy: js.UndefOr[SslPolicyName] = js.undefined
    ): Listener = {
      val __obj = js.Dynamic.literal()
      Certificates.foreach(__v => __obj.updateDynamic("Certificates")(__v.asInstanceOf[js.Any]))
      DefaultActions.foreach(__v => __obj.updateDynamic("DefaultActions")(__v.asInstanceOf[js.Any]))
      ListenerArn.foreach(__v => __obj.updateDynamic("ListenerArn")(__v.asInstanceOf[js.Any]))
      LoadBalancerArn.foreach(__v => __obj.updateDynamic("LoadBalancerArn")(__v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      Protocol.foreach(__v => __obj.updateDynamic("Protocol")(__v.asInstanceOf[js.Any]))
      SslPolicy.foreach(__v => __obj.updateDynamic("SslPolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Listener]
    }
  }

  /**
    * Information about a load balancer.
    */
  @js.native
  trait LoadBalancer extends js.Object {
    var AvailabilityZones: js.UndefOr[AvailabilityZones]
    var CanonicalHostedZoneId: js.UndefOr[CanonicalHostedZoneId]
    var CreatedTime: js.UndefOr[CreatedTime]
    var DNSName: js.UndefOr[DNSName]
    var IpAddressType: js.UndefOr[IpAddressType]
    var LoadBalancerArn: js.UndefOr[LoadBalancerArn]
    var LoadBalancerName: js.UndefOr[LoadBalancerName]
    var Scheme: js.UndefOr[LoadBalancerSchemeEnum]
    var SecurityGroups: js.UndefOr[SecurityGroups]
    var State: js.UndefOr[LoadBalancerState]
    var Type: js.UndefOr[LoadBalancerTypeEnum]
    var VpcId: js.UndefOr[VpcId]
  }

  object LoadBalancer {
    def apply(
        AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined,
        CanonicalHostedZoneId: js.UndefOr[CanonicalHostedZoneId] = js.undefined,
        CreatedTime: js.UndefOr[CreatedTime] = js.undefined,
        DNSName: js.UndefOr[DNSName] = js.undefined,
        IpAddressType: js.UndefOr[IpAddressType] = js.undefined,
        LoadBalancerArn: js.UndefOr[LoadBalancerArn] = js.undefined,
        LoadBalancerName: js.UndefOr[LoadBalancerName] = js.undefined,
        Scheme: js.UndefOr[LoadBalancerSchemeEnum] = js.undefined,
        SecurityGroups: js.UndefOr[SecurityGroups] = js.undefined,
        State: js.UndefOr[LoadBalancerState] = js.undefined,
        Type: js.UndefOr[LoadBalancerTypeEnum] = js.undefined,
        VpcId: js.UndefOr[VpcId] = js.undefined
    ): LoadBalancer = {
      val __obj = js.Dynamic.literal()
      AvailabilityZones.foreach(__v => __obj.updateDynamic("AvailabilityZones")(__v.asInstanceOf[js.Any]))
      CanonicalHostedZoneId.foreach(__v => __obj.updateDynamic("CanonicalHostedZoneId")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      DNSName.foreach(__v => __obj.updateDynamic("DNSName")(__v.asInstanceOf[js.Any]))
      IpAddressType.foreach(__v => __obj.updateDynamic("IpAddressType")(__v.asInstanceOf[js.Any]))
      LoadBalancerArn.foreach(__v => __obj.updateDynamic("LoadBalancerArn")(__v.asInstanceOf[js.Any]))
      LoadBalancerName.foreach(__v => __obj.updateDynamic("LoadBalancerName")(__v.asInstanceOf[js.Any]))
      Scheme.foreach(__v => __obj.updateDynamic("Scheme")(__v.asInstanceOf[js.Any]))
      SecurityGroups.foreach(__v => __obj.updateDynamic("SecurityGroups")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LoadBalancer]
    }
  }

  /**
    * Information about a static IP address for a load balancer.
    */
  @js.native
  trait LoadBalancerAddress extends js.Object {
    var AllocationId: js.UndefOr[AllocationId]
    var IpAddress: js.UndefOr[IpAddress]
  }

  object LoadBalancerAddress {
    def apply(
        AllocationId: js.UndefOr[AllocationId] = js.undefined,
        IpAddress: js.UndefOr[IpAddress] = js.undefined
    ): LoadBalancerAddress = {
      val __obj = js.Dynamic.literal()
      AllocationId.foreach(__v => __obj.updateDynamic("AllocationId")(__v.asInstanceOf[js.Any]))
      IpAddress.foreach(__v => __obj.updateDynamic("IpAddress")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LoadBalancerAddress]
    }
  }

  /**
    * Information about a load balancer attribute.
    */
  @js.native
  trait LoadBalancerAttribute extends js.Object {
    var Key: js.UndefOr[LoadBalancerAttributeKey]
    var Value: js.UndefOr[LoadBalancerAttributeValue]
  }

  object LoadBalancerAttribute {
    def apply(
        Key: js.UndefOr[LoadBalancerAttributeKey] = js.undefined,
        Value: js.UndefOr[LoadBalancerAttributeValue] = js.undefined
    ): LoadBalancerAttribute = {
      val __obj = js.Dynamic.literal()
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LoadBalancerAttribute]
    }
  }

  object LoadBalancerSchemeEnumEnum {
    val `internet-facing` = "internet-facing"
    val internal          = "internal"

    val values = js.Object.freeze(js.Array(`internet-facing`, internal))
  }

  /**
    * Information about the state of the load balancer.
    */
  @js.native
  trait LoadBalancerState extends js.Object {
    var Code: js.UndefOr[LoadBalancerStateEnum]
    var Reason: js.UndefOr[StateReason]
  }

  object LoadBalancerState {
    def apply(
        Code: js.UndefOr[LoadBalancerStateEnum] = js.undefined,
        Reason: js.UndefOr[StateReason] = js.undefined
    ): LoadBalancerState = {
      val __obj = js.Dynamic.literal()
      Code.foreach(__v => __obj.updateDynamic("Code")(__v.asInstanceOf[js.Any]))
      Reason.foreach(__v => __obj.updateDynamic("Reason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LoadBalancerState]
    }
  }

  object LoadBalancerStateEnumEnum {
    val active          = "active"
    val provisioning    = "provisioning"
    val active_impaired = "active_impaired"
    val failed          = "failed"

    val values = js.Object.freeze(js.Array(active, provisioning, active_impaired, failed))
  }

  object LoadBalancerTypeEnumEnum {
    val application = "application"
    val network     = "network"

    val values = js.Object.freeze(js.Array(application, network))
  }

  /**
    * Information to use when checking for a successful response from a target.
    */
  @js.native
  trait Matcher extends js.Object {
    var HttpCode: HttpCode
  }

  object Matcher {
    def apply(
        HttpCode: HttpCode
    ): Matcher = {
      val __obj = js.Dynamic.literal(
        "HttpCode" -> HttpCode.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Matcher]
    }
  }

  @js.native
  trait ModifyListenerInput extends js.Object {
    var ListenerArn: ListenerArn
    var Certificates: js.UndefOr[CertificateList]
    var DefaultActions: js.UndefOr[Actions]
    var Port: js.UndefOr[Port]
    var Protocol: js.UndefOr[ProtocolEnum]
    var SslPolicy: js.UndefOr[SslPolicyName]
  }

  object ModifyListenerInput {
    def apply(
        ListenerArn: ListenerArn,
        Certificates: js.UndefOr[CertificateList] = js.undefined,
        DefaultActions: js.UndefOr[Actions] = js.undefined,
        Port: js.UndefOr[Port] = js.undefined,
        Protocol: js.UndefOr[ProtocolEnum] = js.undefined,
        SslPolicy: js.UndefOr[SslPolicyName] = js.undefined
    ): ModifyListenerInput = {
      val __obj = js.Dynamic.literal(
        "ListenerArn" -> ListenerArn.asInstanceOf[js.Any]
      )

      Certificates.foreach(__v => __obj.updateDynamic("Certificates")(__v.asInstanceOf[js.Any]))
      DefaultActions.foreach(__v => __obj.updateDynamic("DefaultActions")(__v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      Protocol.foreach(__v => __obj.updateDynamic("Protocol")(__v.asInstanceOf[js.Any]))
      SslPolicy.foreach(__v => __obj.updateDynamic("SslPolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyListenerInput]
    }
  }

  @js.native
  trait ModifyListenerOutput extends js.Object {
    var Listeners: js.UndefOr[Listeners]
  }

  object ModifyListenerOutput {
    def apply(
        Listeners: js.UndefOr[Listeners] = js.undefined
    ): ModifyListenerOutput = {
      val __obj = js.Dynamic.literal()
      Listeners.foreach(__v => __obj.updateDynamic("Listeners")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyListenerOutput]
    }
  }

  @js.native
  trait ModifyLoadBalancerAttributesInput extends js.Object {
    var Attributes: LoadBalancerAttributes
    var LoadBalancerArn: LoadBalancerArn
  }

  object ModifyLoadBalancerAttributesInput {
    def apply(
        Attributes: LoadBalancerAttributes,
        LoadBalancerArn: LoadBalancerArn
    ): ModifyLoadBalancerAttributesInput = {
      val __obj = js.Dynamic.literal(
        "Attributes"      -> Attributes.asInstanceOf[js.Any],
        "LoadBalancerArn" -> LoadBalancerArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ModifyLoadBalancerAttributesInput]
    }
  }

  @js.native
  trait ModifyLoadBalancerAttributesOutput extends js.Object {
    var Attributes: js.UndefOr[LoadBalancerAttributes]
  }

  object ModifyLoadBalancerAttributesOutput {
    def apply(
        Attributes: js.UndefOr[LoadBalancerAttributes] = js.undefined
    ): ModifyLoadBalancerAttributesOutput = {
      val __obj = js.Dynamic.literal()
      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyLoadBalancerAttributesOutput]
    }
  }

  @js.native
  trait ModifyRuleInput extends js.Object {
    var RuleArn: RuleArn
    var Actions: js.UndefOr[Actions]
    var Conditions: js.UndefOr[RuleConditionList]
  }

  object ModifyRuleInput {
    def apply(
        RuleArn: RuleArn,
        Actions: js.UndefOr[Actions] = js.undefined,
        Conditions: js.UndefOr[RuleConditionList] = js.undefined
    ): ModifyRuleInput = {
      val __obj = js.Dynamic.literal(
        "RuleArn" -> RuleArn.asInstanceOf[js.Any]
      )

      Actions.foreach(__v => __obj.updateDynamic("Actions")(__v.asInstanceOf[js.Any]))
      Conditions.foreach(__v => __obj.updateDynamic("Conditions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyRuleInput]
    }
  }

  @js.native
  trait ModifyRuleOutput extends js.Object {
    var Rules: js.UndefOr[Rules]
  }

  object ModifyRuleOutput {
    def apply(
        Rules: js.UndefOr[Rules] = js.undefined
    ): ModifyRuleOutput = {
      val __obj = js.Dynamic.literal()
      Rules.foreach(__v => __obj.updateDynamic("Rules")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyRuleOutput]
    }
  }

  @js.native
  trait ModifyTargetGroupAttributesInput extends js.Object {
    var Attributes: TargetGroupAttributes
    var TargetGroupArn: TargetGroupArn
  }

  object ModifyTargetGroupAttributesInput {
    def apply(
        Attributes: TargetGroupAttributes,
        TargetGroupArn: TargetGroupArn
    ): ModifyTargetGroupAttributesInput = {
      val __obj = js.Dynamic.literal(
        "Attributes"     -> Attributes.asInstanceOf[js.Any],
        "TargetGroupArn" -> TargetGroupArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ModifyTargetGroupAttributesInput]
    }
  }

  @js.native
  trait ModifyTargetGroupAttributesOutput extends js.Object {
    var Attributes: js.UndefOr[TargetGroupAttributes]
  }

  object ModifyTargetGroupAttributesOutput {
    def apply(
        Attributes: js.UndefOr[TargetGroupAttributes] = js.undefined
    ): ModifyTargetGroupAttributesOutput = {
      val __obj = js.Dynamic.literal()
      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyTargetGroupAttributesOutput]
    }
  }

  @js.native
  trait ModifyTargetGroupInput extends js.Object {
    var TargetGroupArn: TargetGroupArn
    var HealthCheckEnabled: js.UndefOr[HealthCheckEnabled]
    var HealthCheckIntervalSeconds: js.UndefOr[HealthCheckIntervalSeconds]
    var HealthCheckPath: js.UndefOr[Path]
    var HealthCheckPort: js.UndefOr[HealthCheckPort]
    var HealthCheckProtocol: js.UndefOr[ProtocolEnum]
    var HealthCheckTimeoutSeconds: js.UndefOr[HealthCheckTimeoutSeconds]
    var HealthyThresholdCount: js.UndefOr[HealthCheckThresholdCount]
    var Matcher: js.UndefOr[Matcher]
    var UnhealthyThresholdCount: js.UndefOr[HealthCheckThresholdCount]
  }

  object ModifyTargetGroupInput {
    def apply(
        TargetGroupArn: TargetGroupArn,
        HealthCheckEnabled: js.UndefOr[HealthCheckEnabled] = js.undefined,
        HealthCheckIntervalSeconds: js.UndefOr[HealthCheckIntervalSeconds] = js.undefined,
        HealthCheckPath: js.UndefOr[Path] = js.undefined,
        HealthCheckPort: js.UndefOr[HealthCheckPort] = js.undefined,
        HealthCheckProtocol: js.UndefOr[ProtocolEnum] = js.undefined,
        HealthCheckTimeoutSeconds: js.UndefOr[HealthCheckTimeoutSeconds] = js.undefined,
        HealthyThresholdCount: js.UndefOr[HealthCheckThresholdCount] = js.undefined,
        Matcher: js.UndefOr[Matcher] = js.undefined,
        UnhealthyThresholdCount: js.UndefOr[HealthCheckThresholdCount] = js.undefined
    ): ModifyTargetGroupInput = {
      val __obj = js.Dynamic.literal(
        "TargetGroupArn" -> TargetGroupArn.asInstanceOf[js.Any]
      )

      HealthCheckEnabled.foreach(__v => __obj.updateDynamic("HealthCheckEnabled")(__v.asInstanceOf[js.Any]))
      HealthCheckIntervalSeconds.foreach(
        __v => __obj.updateDynamic("HealthCheckIntervalSeconds")(__v.asInstanceOf[js.Any])
      )
      HealthCheckPath.foreach(__v => __obj.updateDynamic("HealthCheckPath")(__v.asInstanceOf[js.Any]))
      HealthCheckPort.foreach(__v => __obj.updateDynamic("HealthCheckPort")(__v.asInstanceOf[js.Any]))
      HealthCheckProtocol.foreach(__v => __obj.updateDynamic("HealthCheckProtocol")(__v.asInstanceOf[js.Any]))
      HealthCheckTimeoutSeconds.foreach(
        __v => __obj.updateDynamic("HealthCheckTimeoutSeconds")(__v.asInstanceOf[js.Any])
      )
      HealthyThresholdCount.foreach(__v => __obj.updateDynamic("HealthyThresholdCount")(__v.asInstanceOf[js.Any]))
      Matcher.foreach(__v => __obj.updateDynamic("Matcher")(__v.asInstanceOf[js.Any]))
      UnhealthyThresholdCount.foreach(__v => __obj.updateDynamic("UnhealthyThresholdCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyTargetGroupInput]
    }
  }

  @js.native
  trait ModifyTargetGroupOutput extends js.Object {
    var TargetGroups: js.UndefOr[TargetGroups]
  }

  object ModifyTargetGroupOutput {
    def apply(
        TargetGroups: js.UndefOr[TargetGroups] = js.undefined
    ): ModifyTargetGroupOutput = {
      val __obj = js.Dynamic.literal()
      TargetGroups.foreach(__v => __obj.updateDynamic("TargetGroups")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyTargetGroupOutput]
    }
  }

  /**
    * Information about a path pattern condition.
    */
  @js.native
  trait PathPatternConditionConfig extends js.Object {
    var Values: js.UndefOr[ListOfString]
  }

  object PathPatternConditionConfig {
    def apply(
        Values: js.UndefOr[ListOfString] = js.undefined
    ): PathPatternConditionConfig = {
      val __obj = js.Dynamic.literal()
      Values.foreach(__v => __obj.updateDynamic("Values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PathPatternConditionConfig]
    }
  }

  object ProtocolEnumEnum {
    val HTTP    = "HTTP"
    val HTTPS   = "HTTPS"
    val TCP     = "TCP"
    val TLS     = "TLS"
    val UDP     = "UDP"
    val TCP_UDP = "TCP_UDP"

    val values = js.Object.freeze(js.Array(HTTP, HTTPS, TCP, TLS, UDP, TCP_UDP))
  }

  /**
    * Information about a query string condition.
    *  The query string component of a URI starts after the first '?' character and is terminated by either a '#' character or the end of the URI. A typical query string contains key/value pairs separated by '&amp;' characters. The allowed characters are specified by RFC 3986. Any character can be percentage encoded.
    */
  @js.native
  trait QueryStringConditionConfig extends js.Object {
    var Values: js.UndefOr[QueryStringKeyValuePairList]
  }

  object QueryStringConditionConfig {
    def apply(
        Values: js.UndefOr[QueryStringKeyValuePairList] = js.undefined
    ): QueryStringConditionConfig = {
      val __obj = js.Dynamic.literal()
      Values.foreach(__v => __obj.updateDynamic("Values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QueryStringConditionConfig]
    }
  }

  /**
    * Information about a key/value pair.
    */
  @js.native
  trait QueryStringKeyValuePair extends js.Object {
    var Key: js.UndefOr[StringValue]
    var Value: js.UndefOr[StringValue]
  }

  object QueryStringKeyValuePair {
    def apply(
        Key: js.UndefOr[StringValue] = js.undefined,
        Value: js.UndefOr[StringValue] = js.undefined
    ): QueryStringKeyValuePair = {
      val __obj = js.Dynamic.literal()
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QueryStringKeyValuePair]
    }
  }

  /**
    * Information about a redirect action.
    *  A URI consists of the following components: protocol://hostname:port/path?query. You must modify at least one of the following components to avoid a redirect loop: protocol, hostname, port, or path. Any components that you do not modify retain their original values.
    *  You can reuse URI components using the following reserved keywords:
    * * #{protocol}
    *  * #{host}
    *  * #{port}
    *  * #{path} (the leading "/" is removed)
    *  * #{query}
    * For example, you can change the path to "/new/#{path}", the hostname to "example.#{host}", or the query to "#{query}&amp;value=xyz".
    */
  @js.native
  trait RedirectActionConfig extends js.Object {
    var StatusCode: RedirectActionStatusCodeEnum
    var Host: js.UndefOr[RedirectActionHost]
    var Path: js.UndefOr[RedirectActionPath]
    var Port: js.UndefOr[RedirectActionPort]
    var Protocol: js.UndefOr[RedirectActionProtocol]
    var Query: js.UndefOr[RedirectActionQuery]
  }

  object RedirectActionConfig {
    def apply(
        StatusCode: RedirectActionStatusCodeEnum,
        Host: js.UndefOr[RedirectActionHost] = js.undefined,
        Path: js.UndefOr[RedirectActionPath] = js.undefined,
        Port: js.UndefOr[RedirectActionPort] = js.undefined,
        Protocol: js.UndefOr[RedirectActionProtocol] = js.undefined,
        Query: js.UndefOr[RedirectActionQuery] = js.undefined
    ): RedirectActionConfig = {
      val __obj = js.Dynamic.literal(
        "StatusCode" -> StatusCode.asInstanceOf[js.Any]
      )

      Host.foreach(__v => __obj.updateDynamic("Host")(__v.asInstanceOf[js.Any]))
      Path.foreach(__v => __obj.updateDynamic("Path")(__v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      Protocol.foreach(__v => __obj.updateDynamic("Protocol")(__v.asInstanceOf[js.Any]))
      Query.foreach(__v => __obj.updateDynamic("Query")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RedirectActionConfig]
    }
  }

  object RedirectActionStatusCodeEnumEnum {
    val HTTP_301 = "HTTP_301"
    val HTTP_302 = "HTTP_302"

    val values = js.Object.freeze(js.Array(HTTP_301, HTTP_302))
  }

  @js.native
  trait RegisterTargetsInput extends js.Object {
    var TargetGroupArn: TargetGroupArn
    var Targets: TargetDescriptions
  }

  object RegisterTargetsInput {
    def apply(
        TargetGroupArn: TargetGroupArn,
        Targets: TargetDescriptions
    ): RegisterTargetsInput = {
      val __obj = js.Dynamic.literal(
        "TargetGroupArn" -> TargetGroupArn.asInstanceOf[js.Any],
        "Targets"        -> Targets.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RegisterTargetsInput]
    }
  }

  @js.native
  trait RegisterTargetsOutput extends js.Object {}

  object RegisterTargetsOutput {
    def apply(
        ): RegisterTargetsOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[RegisterTargetsOutput]
    }
  }

  @js.native
  trait RemoveListenerCertificatesInput extends js.Object {
    var Certificates: CertificateList
    var ListenerArn: ListenerArn
  }

  object RemoveListenerCertificatesInput {
    def apply(
        Certificates: CertificateList,
        ListenerArn: ListenerArn
    ): RemoveListenerCertificatesInput = {
      val __obj = js.Dynamic.literal(
        "Certificates" -> Certificates.asInstanceOf[js.Any],
        "ListenerArn"  -> ListenerArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RemoveListenerCertificatesInput]
    }
  }

  @js.native
  trait RemoveListenerCertificatesOutput extends js.Object {}

  object RemoveListenerCertificatesOutput {
    def apply(
        ): RemoveListenerCertificatesOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[RemoveListenerCertificatesOutput]
    }
  }

  @js.native
  trait RemoveTagsInput extends js.Object {
    var ResourceArns: ResourceArns
    var TagKeys: TagKeys
  }

  object RemoveTagsInput {
    def apply(
        ResourceArns: ResourceArns,
        TagKeys: TagKeys
    ): RemoveTagsInput = {
      val __obj = js.Dynamic.literal(
        "ResourceArns" -> ResourceArns.asInstanceOf[js.Any],
        "TagKeys"      -> TagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RemoveTagsInput]
    }
  }

  @js.native
  trait RemoveTagsOutput extends js.Object {}

  object RemoveTagsOutput {
    def apply(
        ): RemoveTagsOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[RemoveTagsOutput]
    }
  }

  /**
    * Information about a rule.
    */
  @js.native
  trait Rule extends js.Object {
    var Actions: js.UndefOr[Actions]
    var Conditions: js.UndefOr[RuleConditionList]
    var IsDefault: js.UndefOr[IsDefault]
    var Priority: js.UndefOr[String]
    var RuleArn: js.UndefOr[RuleArn]
  }

  object Rule {
    def apply(
        Actions: js.UndefOr[Actions] = js.undefined,
        Conditions: js.UndefOr[RuleConditionList] = js.undefined,
        IsDefault: js.UndefOr[IsDefault] = js.undefined,
        Priority: js.UndefOr[String] = js.undefined,
        RuleArn: js.UndefOr[RuleArn] = js.undefined
    ): Rule = {
      val __obj = js.Dynamic.literal()
      Actions.foreach(__v => __obj.updateDynamic("Actions")(__v.asInstanceOf[js.Any]))
      Conditions.foreach(__v => __obj.updateDynamic("Conditions")(__v.asInstanceOf[js.Any]))
      IsDefault.foreach(__v => __obj.updateDynamic("IsDefault")(__v.asInstanceOf[js.Any]))
      Priority.foreach(__v => __obj.updateDynamic("Priority")(__v.asInstanceOf[js.Any]))
      RuleArn.foreach(__v => __obj.updateDynamic("RuleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Rule]
    }
  }

  /**
    * Information about a condition for a rule.
    */
  @js.native
  trait RuleCondition extends js.Object {
    var Field: js.UndefOr[ConditionFieldName]
    var HostHeaderConfig: js.UndefOr[HostHeaderConditionConfig]
    var HttpHeaderConfig: js.UndefOr[HttpHeaderConditionConfig]
    var HttpRequestMethodConfig: js.UndefOr[HttpRequestMethodConditionConfig]
    var PathPatternConfig: js.UndefOr[PathPatternConditionConfig]
    var QueryStringConfig: js.UndefOr[QueryStringConditionConfig]
    var SourceIpConfig: js.UndefOr[SourceIpConditionConfig]
    var Values: js.UndefOr[ListOfString]
  }

  object RuleCondition {
    def apply(
        Field: js.UndefOr[ConditionFieldName] = js.undefined,
        HostHeaderConfig: js.UndefOr[HostHeaderConditionConfig] = js.undefined,
        HttpHeaderConfig: js.UndefOr[HttpHeaderConditionConfig] = js.undefined,
        HttpRequestMethodConfig: js.UndefOr[HttpRequestMethodConditionConfig] = js.undefined,
        PathPatternConfig: js.UndefOr[PathPatternConditionConfig] = js.undefined,
        QueryStringConfig: js.UndefOr[QueryStringConditionConfig] = js.undefined,
        SourceIpConfig: js.UndefOr[SourceIpConditionConfig] = js.undefined,
        Values: js.UndefOr[ListOfString] = js.undefined
    ): RuleCondition = {
      val __obj = js.Dynamic.literal()
      Field.foreach(__v => __obj.updateDynamic("Field")(__v.asInstanceOf[js.Any]))
      HostHeaderConfig.foreach(__v => __obj.updateDynamic("HostHeaderConfig")(__v.asInstanceOf[js.Any]))
      HttpHeaderConfig.foreach(__v => __obj.updateDynamic("HttpHeaderConfig")(__v.asInstanceOf[js.Any]))
      HttpRequestMethodConfig.foreach(__v => __obj.updateDynamic("HttpRequestMethodConfig")(__v.asInstanceOf[js.Any]))
      PathPatternConfig.foreach(__v => __obj.updateDynamic("PathPatternConfig")(__v.asInstanceOf[js.Any]))
      QueryStringConfig.foreach(__v => __obj.updateDynamic("QueryStringConfig")(__v.asInstanceOf[js.Any]))
      SourceIpConfig.foreach(__v => __obj.updateDynamic("SourceIpConfig")(__v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.updateDynamic("Values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RuleCondition]
    }
  }

  /**
    * Information about the priorities for the rules for a listener.
    */
  @js.native
  trait RulePriorityPair extends js.Object {
    var Priority: js.UndefOr[RulePriority]
    var RuleArn: js.UndefOr[RuleArn]
  }

  object RulePriorityPair {
    def apply(
        Priority: js.UndefOr[RulePriority] = js.undefined,
        RuleArn: js.UndefOr[RuleArn] = js.undefined
    ): RulePriorityPair = {
      val __obj = js.Dynamic.literal()
      Priority.foreach(__v => __obj.updateDynamic("Priority")(__v.asInstanceOf[js.Any]))
      RuleArn.foreach(__v => __obj.updateDynamic("RuleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RulePriorityPair]
    }
  }

  @js.native
  trait SetIpAddressTypeInput extends js.Object {
    var IpAddressType: IpAddressType
    var LoadBalancerArn: LoadBalancerArn
  }

  object SetIpAddressTypeInput {
    def apply(
        IpAddressType: IpAddressType,
        LoadBalancerArn: LoadBalancerArn
    ): SetIpAddressTypeInput = {
      val __obj = js.Dynamic.literal(
        "IpAddressType"   -> IpAddressType.asInstanceOf[js.Any],
        "LoadBalancerArn" -> LoadBalancerArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SetIpAddressTypeInput]
    }
  }

  @js.native
  trait SetIpAddressTypeOutput extends js.Object {
    var IpAddressType: js.UndefOr[IpAddressType]
  }

  object SetIpAddressTypeOutput {
    def apply(
        IpAddressType: js.UndefOr[IpAddressType] = js.undefined
    ): SetIpAddressTypeOutput = {
      val __obj = js.Dynamic.literal()
      IpAddressType.foreach(__v => __obj.updateDynamic("IpAddressType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SetIpAddressTypeOutput]
    }
  }

  @js.native
  trait SetRulePrioritiesInput extends js.Object {
    var RulePriorities: RulePriorityList
  }

  object SetRulePrioritiesInput {
    def apply(
        RulePriorities: RulePriorityList
    ): SetRulePrioritiesInput = {
      val __obj = js.Dynamic.literal(
        "RulePriorities" -> RulePriorities.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SetRulePrioritiesInput]
    }
  }

  @js.native
  trait SetRulePrioritiesOutput extends js.Object {
    var Rules: js.UndefOr[Rules]
  }

  object SetRulePrioritiesOutput {
    def apply(
        Rules: js.UndefOr[Rules] = js.undefined
    ): SetRulePrioritiesOutput = {
      val __obj = js.Dynamic.literal()
      Rules.foreach(__v => __obj.updateDynamic("Rules")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SetRulePrioritiesOutput]
    }
  }

  @js.native
  trait SetSecurityGroupsInput extends js.Object {
    var LoadBalancerArn: LoadBalancerArn
    var SecurityGroups: SecurityGroups
  }

  object SetSecurityGroupsInput {
    def apply(
        LoadBalancerArn: LoadBalancerArn,
        SecurityGroups: SecurityGroups
    ): SetSecurityGroupsInput = {
      val __obj = js.Dynamic.literal(
        "LoadBalancerArn" -> LoadBalancerArn.asInstanceOf[js.Any],
        "SecurityGroups"  -> SecurityGroups.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SetSecurityGroupsInput]
    }
  }

  @js.native
  trait SetSecurityGroupsOutput extends js.Object {
    var SecurityGroupIds: js.UndefOr[SecurityGroups]
  }

  object SetSecurityGroupsOutput {
    def apply(
        SecurityGroupIds: js.UndefOr[SecurityGroups] = js.undefined
    ): SetSecurityGroupsOutput = {
      val __obj = js.Dynamic.literal()
      SecurityGroupIds.foreach(__v => __obj.updateDynamic("SecurityGroupIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SetSecurityGroupsOutput]
    }
  }

  @js.native
  trait SetSubnetsInput extends js.Object {
    var LoadBalancerArn: LoadBalancerArn
    var SubnetMappings: js.UndefOr[SubnetMappings]
    var Subnets: js.UndefOr[Subnets]
  }

  object SetSubnetsInput {
    def apply(
        LoadBalancerArn: LoadBalancerArn,
        SubnetMappings: js.UndefOr[SubnetMappings] = js.undefined,
        Subnets: js.UndefOr[Subnets] = js.undefined
    ): SetSubnetsInput = {
      val __obj = js.Dynamic.literal(
        "LoadBalancerArn" -> LoadBalancerArn.asInstanceOf[js.Any]
      )

      SubnetMappings.foreach(__v => __obj.updateDynamic("SubnetMappings")(__v.asInstanceOf[js.Any]))
      Subnets.foreach(__v => __obj.updateDynamic("Subnets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SetSubnetsInput]
    }
  }

  @js.native
  trait SetSubnetsOutput extends js.Object {
    var AvailabilityZones: js.UndefOr[AvailabilityZones]
  }

  object SetSubnetsOutput {
    def apply(
        AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined
    ): SetSubnetsOutput = {
      val __obj = js.Dynamic.literal()
      AvailabilityZones.foreach(__v => __obj.updateDynamic("AvailabilityZones")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SetSubnetsOutput]
    }
  }

  /**
    * Information about a source IP condition.
    *  You can use this condition to route based on the IP address of the source that connects to the load balancer. If a client is behind a proxy, this is the IP address of the proxy not the IP address of the client.
    */
  @js.native
  trait SourceIpConditionConfig extends js.Object {
    var Values: js.UndefOr[ListOfString]
  }

  object SourceIpConditionConfig {
    def apply(
        Values: js.UndefOr[ListOfString] = js.undefined
    ): SourceIpConditionConfig = {
      val __obj = js.Dynamic.literal()
      Values.foreach(__v => __obj.updateDynamic("Values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SourceIpConditionConfig]
    }
  }

  /**
    * Information about a policy used for SSL negotiation.
    */
  @js.native
  trait SslPolicy extends js.Object {
    var Ciphers: js.UndefOr[Ciphers]
    var Name: js.UndefOr[SslPolicyName]
    var SslProtocols: js.UndefOr[SslProtocols]
  }

  object SslPolicy {
    def apply(
        Ciphers: js.UndefOr[Ciphers] = js.undefined,
        Name: js.UndefOr[SslPolicyName] = js.undefined,
        SslProtocols: js.UndefOr[SslProtocols] = js.undefined
    ): SslPolicy = {
      val __obj = js.Dynamic.literal()
      Ciphers.foreach(__v => __obj.updateDynamic("Ciphers")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      SslProtocols.foreach(__v => __obj.updateDynamic("SslProtocols")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SslPolicy]
    }
  }

  /**
    * Information about a subnet mapping.
    */
  @js.native
  trait SubnetMapping extends js.Object {
    var AllocationId: js.UndefOr[AllocationId]
    var SubnetId: js.UndefOr[SubnetId]
  }

  object SubnetMapping {
    def apply(
        AllocationId: js.UndefOr[AllocationId] = js.undefined,
        SubnetId: js.UndefOr[SubnetId] = js.undefined
    ): SubnetMapping = {
      val __obj = js.Dynamic.literal()
      AllocationId.foreach(__v => __obj.updateDynamic("AllocationId")(__v.asInstanceOf[js.Any]))
      SubnetId.foreach(__v => __obj.updateDynamic("SubnetId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SubnetMapping]
    }
  }

  /**
    * Information about a tag.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: js.UndefOr[TagValue]
  }

  object Tag {
    def apply(
        Key: TagKey,
        Value: js.UndefOr[TagValue] = js.undefined
    ): Tag = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any]
      )

      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Tag]
    }
  }

  /**
    * The tags associated with a resource.
    */
  @js.native
  trait TagDescription extends js.Object {
    var ResourceArn: js.UndefOr[ResourceArn]
    var Tags: js.UndefOr[TagList]
  }

  object TagDescription {
    def apply(
        ResourceArn: js.UndefOr[ResourceArn] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): TagDescription = {
      val __obj = js.Dynamic.literal()
      ResourceArn.foreach(__v => __obj.updateDynamic("ResourceArn")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TagDescription]
    }
  }

  /**
    * Information about a target.
    */
  @js.native
  trait TargetDescription extends js.Object {
    var Id: TargetId
    var AvailabilityZone: js.UndefOr[ZoneName]
    var Port: js.UndefOr[Port]
  }

  object TargetDescription {
    def apply(
        Id: TargetId,
        AvailabilityZone: js.UndefOr[ZoneName] = js.undefined,
        Port: js.UndefOr[Port] = js.undefined
    ): TargetDescription = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      AvailabilityZone.foreach(__v => __obj.updateDynamic("AvailabilityZone")(__v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TargetDescription]
    }
  }

  /**
    * Information about a target group.
    */
  @js.native
  trait TargetGroup extends js.Object {
    var HealthCheckEnabled: js.UndefOr[HealthCheckEnabled]
    var HealthCheckIntervalSeconds: js.UndefOr[HealthCheckIntervalSeconds]
    var HealthCheckPath: js.UndefOr[Path]
    var HealthCheckPort: js.UndefOr[HealthCheckPort]
    var HealthCheckProtocol: js.UndefOr[ProtocolEnum]
    var HealthCheckTimeoutSeconds: js.UndefOr[HealthCheckTimeoutSeconds]
    var HealthyThresholdCount: js.UndefOr[HealthCheckThresholdCount]
    var LoadBalancerArns: js.UndefOr[LoadBalancerArns]
    var Matcher: js.UndefOr[Matcher]
    var Port: js.UndefOr[Port]
    var Protocol: js.UndefOr[ProtocolEnum]
    var TargetGroupArn: js.UndefOr[TargetGroupArn]
    var TargetGroupName: js.UndefOr[TargetGroupName]
    var TargetType: js.UndefOr[TargetTypeEnum]
    var UnhealthyThresholdCount: js.UndefOr[HealthCheckThresholdCount]
    var VpcId: js.UndefOr[VpcId]
  }

  object TargetGroup {
    def apply(
        HealthCheckEnabled: js.UndefOr[HealthCheckEnabled] = js.undefined,
        HealthCheckIntervalSeconds: js.UndefOr[HealthCheckIntervalSeconds] = js.undefined,
        HealthCheckPath: js.UndefOr[Path] = js.undefined,
        HealthCheckPort: js.UndefOr[HealthCheckPort] = js.undefined,
        HealthCheckProtocol: js.UndefOr[ProtocolEnum] = js.undefined,
        HealthCheckTimeoutSeconds: js.UndefOr[HealthCheckTimeoutSeconds] = js.undefined,
        HealthyThresholdCount: js.UndefOr[HealthCheckThresholdCount] = js.undefined,
        LoadBalancerArns: js.UndefOr[LoadBalancerArns] = js.undefined,
        Matcher: js.UndefOr[Matcher] = js.undefined,
        Port: js.UndefOr[Port] = js.undefined,
        Protocol: js.UndefOr[ProtocolEnum] = js.undefined,
        TargetGroupArn: js.UndefOr[TargetGroupArn] = js.undefined,
        TargetGroupName: js.UndefOr[TargetGroupName] = js.undefined,
        TargetType: js.UndefOr[TargetTypeEnum] = js.undefined,
        UnhealthyThresholdCount: js.UndefOr[HealthCheckThresholdCount] = js.undefined,
        VpcId: js.UndefOr[VpcId] = js.undefined
    ): TargetGroup = {
      val __obj = js.Dynamic.literal()
      HealthCheckEnabled.foreach(__v => __obj.updateDynamic("HealthCheckEnabled")(__v.asInstanceOf[js.Any]))
      HealthCheckIntervalSeconds.foreach(
        __v => __obj.updateDynamic("HealthCheckIntervalSeconds")(__v.asInstanceOf[js.Any])
      )
      HealthCheckPath.foreach(__v => __obj.updateDynamic("HealthCheckPath")(__v.asInstanceOf[js.Any]))
      HealthCheckPort.foreach(__v => __obj.updateDynamic("HealthCheckPort")(__v.asInstanceOf[js.Any]))
      HealthCheckProtocol.foreach(__v => __obj.updateDynamic("HealthCheckProtocol")(__v.asInstanceOf[js.Any]))
      HealthCheckTimeoutSeconds.foreach(
        __v => __obj.updateDynamic("HealthCheckTimeoutSeconds")(__v.asInstanceOf[js.Any])
      )
      HealthyThresholdCount.foreach(__v => __obj.updateDynamic("HealthyThresholdCount")(__v.asInstanceOf[js.Any]))
      LoadBalancerArns.foreach(__v => __obj.updateDynamic("LoadBalancerArns")(__v.asInstanceOf[js.Any]))
      Matcher.foreach(__v => __obj.updateDynamic("Matcher")(__v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      Protocol.foreach(__v => __obj.updateDynamic("Protocol")(__v.asInstanceOf[js.Any]))
      TargetGroupArn.foreach(__v => __obj.updateDynamic("TargetGroupArn")(__v.asInstanceOf[js.Any]))
      TargetGroupName.foreach(__v => __obj.updateDynamic("TargetGroupName")(__v.asInstanceOf[js.Any]))
      TargetType.foreach(__v => __obj.updateDynamic("TargetType")(__v.asInstanceOf[js.Any]))
      UnhealthyThresholdCount.foreach(__v => __obj.updateDynamic("UnhealthyThresholdCount")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TargetGroup]
    }
  }

  /**
    * Information about a target group attribute.
    */
  @js.native
  trait TargetGroupAttribute extends js.Object {
    var Key: js.UndefOr[TargetGroupAttributeKey]
    var Value: js.UndefOr[TargetGroupAttributeValue]
  }

  object TargetGroupAttribute {
    def apply(
        Key: js.UndefOr[TargetGroupAttributeKey] = js.undefined,
        Value: js.UndefOr[TargetGroupAttributeValue] = js.undefined
    ): TargetGroupAttribute = {
      val __obj = js.Dynamic.literal()
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TargetGroupAttribute]
    }
  }

  /**
    * Information about the current health of a target.
    */
  @js.native
  trait TargetHealth extends js.Object {
    var Description: js.UndefOr[Description]
    var Reason: js.UndefOr[TargetHealthReasonEnum]
    var State: js.UndefOr[TargetHealthStateEnum]
  }

  object TargetHealth {
    def apply(
        Description: js.UndefOr[Description] = js.undefined,
        Reason: js.UndefOr[TargetHealthReasonEnum] = js.undefined,
        State: js.UndefOr[TargetHealthStateEnum] = js.undefined
    ): TargetHealth = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Reason.foreach(__v => __obj.updateDynamic("Reason")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TargetHealth]
    }
  }

  /**
    * Information about the health of a target.
    */
  @js.native
  trait TargetHealthDescription extends js.Object {
    var HealthCheckPort: js.UndefOr[HealthCheckPort]
    var Target: js.UndefOr[TargetDescription]
    var TargetHealth: js.UndefOr[TargetHealth]
  }

  object TargetHealthDescription {
    def apply(
        HealthCheckPort: js.UndefOr[HealthCheckPort] = js.undefined,
        Target: js.UndefOr[TargetDescription] = js.undefined,
        TargetHealth: js.UndefOr[TargetHealth] = js.undefined
    ): TargetHealthDescription = {
      val __obj = js.Dynamic.literal()
      HealthCheckPort.foreach(__v => __obj.updateDynamic("HealthCheckPort")(__v.asInstanceOf[js.Any]))
      Target.foreach(__v => __obj.updateDynamic("Target")(__v.asInstanceOf[js.Any]))
      TargetHealth.foreach(__v => __obj.updateDynamic("TargetHealth")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TargetHealthDescription]
    }
  }

  object TargetHealthReasonEnumEnum {
    val `Elb.RegistrationInProgress`      = "Elb.RegistrationInProgress"
    val `Elb.InitialHealthChecking`       = "Elb.InitialHealthChecking"
    val `Target.ResponseCodeMismatch`     = "Target.ResponseCodeMismatch"
    val `Target.Timeout`                  = "Target.Timeout"
    val `Target.FailedHealthChecks`       = "Target.FailedHealthChecks"
    val `Target.NotRegistered`            = "Target.NotRegistered"
    val `Target.NotInUse`                 = "Target.NotInUse"
    val `Target.DeregistrationInProgress` = "Target.DeregistrationInProgress"
    val `Target.InvalidState`             = "Target.InvalidState"
    val `Target.IpUnusable`               = "Target.IpUnusable"
    val `Target.HealthCheckDisabled`      = "Target.HealthCheckDisabled"
    val `Elb.InternalError`               = "Elb.InternalError"

    val values = js.Object.freeze(
      js.Array(
        `Elb.RegistrationInProgress`,
        `Elb.InitialHealthChecking`,
        `Target.ResponseCodeMismatch`,
        `Target.Timeout`,
        `Target.FailedHealthChecks`,
        `Target.NotRegistered`,
        `Target.NotInUse`,
        `Target.DeregistrationInProgress`,
        `Target.InvalidState`,
        `Target.IpUnusable`,
        `Target.HealthCheckDisabled`,
        `Elb.InternalError`
      )
    )
  }

  object TargetHealthStateEnumEnum {
    val initial     = "initial"
    val healthy     = "healthy"
    val unhealthy   = "unhealthy"
    val unused      = "unused"
    val draining    = "draining"
    val unavailable = "unavailable"

    val values = js.Object.freeze(js.Array(initial, healthy, unhealthy, unused, draining, unavailable))
  }

  object TargetTypeEnumEnum {
    val instance = "instance"
    val ip       = "ip"
    val lambda   = "lambda"

    val values = js.Object.freeze(js.Array(instance, ip, lambda))
  }
}
