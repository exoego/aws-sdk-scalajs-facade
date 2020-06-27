package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object elbv2 {
  type ActionOrder  = Int
  type Actions      = js.Array[Action]
  type AllocationId = String
  type AuthenticateCognitoActionAuthenticationRequestExtraParams =
    js.Dictionary[AuthenticateCognitoActionAuthenticationRequestParamValue]
  type AuthenticateCognitoActionAuthenticationRequestParamName  = String
  type AuthenticateCognitoActionAuthenticationRequestParamValue = String
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
  type LoadBalancers                                         = js.Array[LoadBalancer]
  type Marker                                                = String
  type Max                                                   = String
  type Name                                                  = String
  type PageSize                                              = Int
  type Path                                                  = String
  type Port                                                  = Int
  type PrivateIPv4Address                                    = String
  type QueryStringKeyValuePairList                           = js.Array[QueryStringKeyValuePair]
  type RedirectActionHost                                    = String
  type RedirectActionPath                                    = String
  type RedirectActionPort                                    = String
  type RedirectActionProtocol                                = String
  type RedirectActionQuery                                   = String
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
  type TargetGroupList                                       = js.Array[TargetGroupTuple]
  type TargetGroupName                                       = String
  type TargetGroupNames                                      = js.Array[TargetGroupName]
  type TargetGroupStickinessDurationSeconds                  = Int
  type TargetGroupStickinessEnabled                          = Boolean
  type TargetGroupWeight                                     = Int
  type TargetGroups                                          = js.Array[TargetGroup]
  type TargetHealthDescriptions                              = js.Array[TargetHealthDescription]
  type TargetId                                              = String
  type VpcId                                                 = String
  type ZoneName                                              = String

  implicit final class ELBv2Ops(private val service: ELBv2) extends AnyVal {

    @inline def addListenerCertificatesFuture(
        params: AddListenerCertificatesInput
    ): Future[AddListenerCertificatesOutput]                               = service.addListenerCertificates(params).promise().toFuture
    @inline def addTagsFuture(params: AddTagsInput): Future[AddTagsOutput] = service.addTags(params).promise().toFuture
    @inline def createListenerFuture(params: CreateListenerInput): Future[CreateListenerOutput] =
      service.createListener(params).promise().toFuture
    @inline def createLoadBalancerFuture(params: CreateLoadBalancerInput): Future[CreateLoadBalancerOutput] =
      service.createLoadBalancer(params).promise().toFuture
    @inline def createRuleFuture(params: CreateRuleInput): Future[CreateRuleOutput] =
      service.createRule(params).promise().toFuture
    @inline def createTargetGroupFuture(params: CreateTargetGroupInput): Future[CreateTargetGroupOutput] =
      service.createTargetGroup(params).promise().toFuture
    @inline def deleteListenerFuture(params: DeleteListenerInput): Future[DeleteListenerOutput] =
      service.deleteListener(params).promise().toFuture
    @inline def deleteLoadBalancerFuture(params: DeleteLoadBalancerInput): Future[DeleteLoadBalancerOutput] =
      service.deleteLoadBalancer(params).promise().toFuture
    @inline def deleteRuleFuture(params: DeleteRuleInput): Future[DeleteRuleOutput] =
      service.deleteRule(params).promise().toFuture
    @inline def deleteTargetGroupFuture(params: DeleteTargetGroupInput): Future[DeleteTargetGroupOutput] =
      service.deleteTargetGroup(params).promise().toFuture
    @inline def deregisterTargetsFuture(params: DeregisterTargetsInput): Future[DeregisterTargetsOutput] =
      service.deregisterTargets(params).promise().toFuture
    @inline def describeAccountLimitsFuture(params: DescribeAccountLimitsInput): Future[DescribeAccountLimitsOutput] =
      service.describeAccountLimits(params).promise().toFuture
    @inline def describeListenerCertificatesFuture(
        params: DescribeListenerCertificatesInput
    ): Future[DescribeListenerCertificatesOutput] = service.describeListenerCertificates(params).promise().toFuture
    @inline def describeListenersFuture(params: DescribeListenersInput): Future[DescribeListenersOutput] =
      service.describeListeners(params).promise().toFuture
    @inline def describeLoadBalancerAttributesFuture(
        params: DescribeLoadBalancerAttributesInput
    ): Future[DescribeLoadBalancerAttributesOutput] = service.describeLoadBalancerAttributes(params).promise().toFuture
    @inline def describeLoadBalancersFuture(params: DescribeLoadBalancersInput): Future[DescribeLoadBalancersOutput] =
      service.describeLoadBalancers(params).promise().toFuture
    @inline def describeRulesFuture(params: DescribeRulesInput): Future[DescribeRulesOutput] =
      service.describeRules(params).promise().toFuture
    @inline def describeSSLPoliciesFuture(params: DescribeSSLPoliciesInput): Future[DescribeSSLPoliciesOutput] =
      service.describeSSLPolicies(params).promise().toFuture
    @inline def describeTagsFuture(params: DescribeTagsInput): Future[DescribeTagsOutput] =
      service.describeTags(params).promise().toFuture
    @inline def describeTargetGroupAttributesFuture(
        params: DescribeTargetGroupAttributesInput
    ): Future[DescribeTargetGroupAttributesOutput] = service.describeTargetGroupAttributes(params).promise().toFuture
    @inline def describeTargetGroupsFuture(params: DescribeTargetGroupsInput): Future[DescribeTargetGroupsOutput] =
      service.describeTargetGroups(params).promise().toFuture
    @inline def describeTargetHealthFuture(params: DescribeTargetHealthInput): Future[DescribeTargetHealthOutput] =
      service.describeTargetHealth(params).promise().toFuture
    @inline def modifyListenerFuture(params: ModifyListenerInput): Future[ModifyListenerOutput] =
      service.modifyListener(params).promise().toFuture
    @inline def modifyLoadBalancerAttributesFuture(
        params: ModifyLoadBalancerAttributesInput
    ): Future[ModifyLoadBalancerAttributesOutput] = service.modifyLoadBalancerAttributes(params).promise().toFuture
    @inline def modifyRuleFuture(params: ModifyRuleInput): Future[ModifyRuleOutput] =
      service.modifyRule(params).promise().toFuture
    @inline def modifyTargetGroupAttributesFuture(
        params: ModifyTargetGroupAttributesInput
    ): Future[ModifyTargetGroupAttributesOutput] = service.modifyTargetGroupAttributes(params).promise().toFuture
    @inline def modifyTargetGroupFuture(params: ModifyTargetGroupInput): Future[ModifyTargetGroupOutput] =
      service.modifyTargetGroup(params).promise().toFuture
    @inline def registerTargetsFuture(params: RegisterTargetsInput): Future[RegisterTargetsOutput] =
      service.registerTargets(params).promise().toFuture
    @inline def removeListenerCertificatesFuture(
        params: RemoveListenerCertificatesInput
    ): Future[RemoveListenerCertificatesOutput] = service.removeListenerCertificates(params).promise().toFuture
    @inline def removeTagsFuture(params: RemoveTagsInput): Future[RemoveTagsOutput] =
      service.removeTags(params).promise().toFuture
    @inline def setIpAddressTypeFuture(params: SetIpAddressTypeInput): Future[SetIpAddressTypeOutput] =
      service.setIpAddressType(params).promise().toFuture
    @inline def setRulePrioritiesFuture(params: SetRulePrioritiesInput): Future[SetRulePrioritiesOutput] =
      service.setRulePriorities(params).promise().toFuture
    @inline def setSecurityGroupsFuture(params: SetSecurityGroupsInput): Future[SetSecurityGroupsOutput] =
      service.setSecurityGroups(params).promise().toFuture
    @inline def setSubnetsFuture(params: SetSubnetsInput): Future[SetSubnetsOutput] =
      service.setSubnets(params).promise().toFuture
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
  @Factory
  trait Action extends js.Object {
    var Type: ActionTypeEnum
    var AuthenticateCognitoConfig: js.UndefOr[AuthenticateCognitoActionConfig]
    var AuthenticateOidcConfig: js.UndefOr[AuthenticateOidcActionConfig]
    var FixedResponseConfig: js.UndefOr[FixedResponseActionConfig]
    var ForwardConfig: js.UndefOr[ForwardActionConfig]
    var Order: js.UndefOr[ActionOrder]
    var RedirectConfig: js.UndefOr[RedirectActionConfig]
    var TargetGroupArn: js.UndefOr[TargetGroupArn]
  }

  @js.native
  sealed trait ActionTypeEnum extends js.Any
  object ActionTypeEnum extends js.Object {
    val forward                = "forward".asInstanceOf[ActionTypeEnum]
    val `authenticate-oidc`    = "authenticate-oidc".asInstanceOf[ActionTypeEnum]
    val `authenticate-cognito` = "authenticate-cognito".asInstanceOf[ActionTypeEnum]
    val redirect               = "redirect".asInstanceOf[ActionTypeEnum]
    val `fixed-response`       = "fixed-response".asInstanceOf[ActionTypeEnum]

    val values =
      js.Object.freeze(js.Array(forward, `authenticate-oidc`, `authenticate-cognito`, redirect, `fixed-response`))
  }

  @js.native
  @Factory
  trait AddListenerCertificatesInput extends js.Object {
    var Certificates: CertificateList
    var ListenerArn: ListenerArn
  }

  @js.native
  @Factory
  trait AddListenerCertificatesOutput extends js.Object {
    var Certificates: js.UndefOr[CertificateList]
  }

  @js.native
  @Factory
  trait AddTagsInput extends js.Object {
    var ResourceArns: ResourceArns
    var Tags: TagList
  }

  @js.native
  @Factory
  trait AddTagsOutput extends js.Object {}

  @js.native
  sealed trait AuthenticateCognitoActionConditionalBehaviorEnum extends js.Any
  object AuthenticateCognitoActionConditionalBehaviorEnum extends js.Object {
    val deny         = "deny".asInstanceOf[AuthenticateCognitoActionConditionalBehaviorEnum]
    val allow        = "allow".asInstanceOf[AuthenticateCognitoActionConditionalBehaviorEnum]
    val authenticate = "authenticate".asInstanceOf[AuthenticateCognitoActionConditionalBehaviorEnum]

    val values = js.Object.freeze(js.Array(deny, allow, authenticate))
  }

  /**
    * Request parameters to use when integrating with Amazon Cognito to authenticate users.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait AuthenticateOidcActionConditionalBehaviorEnum extends js.Any
  object AuthenticateOidcActionConditionalBehaviorEnum extends js.Object {
    val deny         = "deny".asInstanceOf[AuthenticateOidcActionConditionalBehaviorEnum]
    val allow        = "allow".asInstanceOf[AuthenticateOidcActionConditionalBehaviorEnum]
    val authenticate = "authenticate".asInstanceOf[AuthenticateOidcActionConditionalBehaviorEnum]

    val values = js.Object.freeze(js.Array(deny, allow, authenticate))
  }

  /**
    * Request parameters when using an identity provider (IdP) that is compliant with OpenID Connect (OIDC) to authenticate users.
    */
  @js.native
  @Factory
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

  /**
    * Information about an Availability Zone.
    */
  @js.native
  @Factory
  trait AvailabilityZone extends js.Object {
    var LoadBalancerAddresses: js.UndefOr[LoadBalancerAddresses]
    var SubnetId: js.UndefOr[SubnetId]
    var ZoneName: js.UndefOr[ZoneName]
  }

  /**
    * Information about an SSL server certificate.
    */
  @js.native
  @Factory
  trait Certificate extends js.Object {
    var CertificateArn: js.UndefOr[CertificateArn]
    var IsDefault: js.UndefOr[Default]
  }

  /**
    * Information about a cipher used in a policy.
    */
  @js.native
  @Factory
  trait Cipher extends js.Object {
    var Name: js.UndefOr[CipherName]
    var Priority: js.UndefOr[CipherPriority]
  }

  @js.native
  @Factory
  trait CreateListenerInput extends js.Object {
    var DefaultActions: Actions
    var LoadBalancerArn: LoadBalancerArn
    var Port: Port
    var Protocol: ProtocolEnum
    var Certificates: js.UndefOr[CertificateList]
    var SslPolicy: js.UndefOr[SslPolicyName]
  }

  @js.native
  @Factory
  trait CreateListenerOutput extends js.Object {
    var Listeners: js.UndefOr[Listeners]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait CreateLoadBalancerOutput extends js.Object {
    var LoadBalancers: js.UndefOr[LoadBalancers]
  }

  @js.native
  @Factory
  trait CreateRuleInput extends js.Object {
    var Actions: Actions
    var Conditions: RuleConditionList
    var ListenerArn: ListenerArn
    var Priority: RulePriority
  }

  @js.native
  @Factory
  trait CreateRuleOutput extends js.Object {
    var Rules: js.UndefOr[Rules]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait CreateTargetGroupOutput extends js.Object {
    var TargetGroups: js.UndefOr[TargetGroups]
  }

  @js.native
  @Factory
  trait DeleteListenerInput extends js.Object {
    var ListenerArn: ListenerArn
  }

  @js.native
  @Factory
  trait DeleteListenerOutput extends js.Object {}

  @js.native
  @Factory
  trait DeleteLoadBalancerInput extends js.Object {
    var LoadBalancerArn: LoadBalancerArn
  }

  @js.native
  @Factory
  trait DeleteLoadBalancerOutput extends js.Object {}

  @js.native
  @Factory
  trait DeleteRuleInput extends js.Object {
    var RuleArn: RuleArn
  }

  @js.native
  @Factory
  trait DeleteRuleOutput extends js.Object {}

  @js.native
  @Factory
  trait DeleteTargetGroupInput extends js.Object {
    var TargetGroupArn: TargetGroupArn
  }

  @js.native
  @Factory
  trait DeleteTargetGroupOutput extends js.Object {}

  @js.native
  @Factory
  trait DeregisterTargetsInput extends js.Object {
    var TargetGroupArn: TargetGroupArn
    var Targets: TargetDescriptions
  }

  @js.native
  @Factory
  trait DeregisterTargetsOutput extends js.Object {}

  @js.native
  @Factory
  trait DescribeAccountLimitsInput extends js.Object {
    var Marker: js.UndefOr[Marker]
    var PageSize: js.UndefOr[PageSize]
  }

  @js.native
  @Factory
  trait DescribeAccountLimitsOutput extends js.Object {
    var Limits: js.UndefOr[Limits]
    var NextMarker: js.UndefOr[Marker]
  }

  @js.native
  @Factory
  trait DescribeListenerCertificatesInput extends js.Object {
    var ListenerArn: ListenerArn
    var Marker: js.UndefOr[Marker]
    var PageSize: js.UndefOr[PageSize]
  }

  @js.native
  @Factory
  trait DescribeListenerCertificatesOutput extends js.Object {
    var Certificates: js.UndefOr[CertificateList]
    var NextMarker: js.UndefOr[Marker]
  }

  @js.native
  @Factory
  trait DescribeListenersInput extends js.Object {
    var ListenerArns: js.UndefOr[ListenerArns]
    var LoadBalancerArn: js.UndefOr[LoadBalancerArn]
    var Marker: js.UndefOr[Marker]
    var PageSize: js.UndefOr[PageSize]
  }

  @js.native
  @Factory
  trait DescribeListenersOutput extends js.Object {
    var Listeners: js.UndefOr[Listeners]
    var NextMarker: js.UndefOr[Marker]
  }

  @js.native
  @Factory
  trait DescribeLoadBalancerAttributesInput extends js.Object {
    var LoadBalancerArn: LoadBalancerArn
  }

  @js.native
  @Factory
  trait DescribeLoadBalancerAttributesOutput extends js.Object {
    var Attributes: js.UndefOr[LoadBalancerAttributes]
  }

  @js.native
  @Factory
  trait DescribeLoadBalancersInput extends js.Object {
    var LoadBalancerArns: js.UndefOr[LoadBalancerArns]
    var Marker: js.UndefOr[Marker]
    var Names: js.UndefOr[LoadBalancerNames]
    var PageSize: js.UndefOr[PageSize]
  }

  @js.native
  @Factory
  trait DescribeLoadBalancersOutput extends js.Object {
    var LoadBalancers: js.UndefOr[LoadBalancers]
    var NextMarker: js.UndefOr[Marker]
  }

  @js.native
  @Factory
  trait DescribeRulesInput extends js.Object {
    var ListenerArn: js.UndefOr[ListenerArn]
    var Marker: js.UndefOr[Marker]
    var PageSize: js.UndefOr[PageSize]
    var RuleArns: js.UndefOr[RuleArns]
  }

  @js.native
  @Factory
  trait DescribeRulesOutput extends js.Object {
    var NextMarker: js.UndefOr[Marker]
    var Rules: js.UndefOr[Rules]
  }

  @js.native
  @Factory
  trait DescribeSSLPoliciesInput extends js.Object {
    var Marker: js.UndefOr[Marker]
    var Names: js.UndefOr[SslPolicyNames]
    var PageSize: js.UndefOr[PageSize]
  }

  @js.native
  @Factory
  trait DescribeSSLPoliciesOutput extends js.Object {
    var NextMarker: js.UndefOr[Marker]
    var SslPolicies: js.UndefOr[SslPolicies]
  }

  @js.native
  @Factory
  trait DescribeTagsInput extends js.Object {
    var ResourceArns: ResourceArns
  }

  @js.native
  @Factory
  trait DescribeTagsOutput extends js.Object {
    var TagDescriptions: js.UndefOr[TagDescriptions]
  }

  @js.native
  @Factory
  trait DescribeTargetGroupAttributesInput extends js.Object {
    var TargetGroupArn: TargetGroupArn
  }

  @js.native
  @Factory
  trait DescribeTargetGroupAttributesOutput extends js.Object {
    var Attributes: js.UndefOr[TargetGroupAttributes]
  }

  @js.native
  @Factory
  trait DescribeTargetGroupsInput extends js.Object {
    var LoadBalancerArn: js.UndefOr[LoadBalancerArn]
    var Marker: js.UndefOr[Marker]
    var Names: js.UndefOr[TargetGroupNames]
    var PageSize: js.UndefOr[PageSize]
    var TargetGroupArns: js.UndefOr[TargetGroupArns]
  }

  @js.native
  @Factory
  trait DescribeTargetGroupsOutput extends js.Object {
    var NextMarker: js.UndefOr[Marker]
    var TargetGroups: js.UndefOr[TargetGroups]
  }

  @js.native
  @Factory
  trait DescribeTargetHealthInput extends js.Object {
    var TargetGroupArn: TargetGroupArn
    var Targets: js.UndefOr[TargetDescriptions]
  }

  @js.native
  @Factory
  trait DescribeTargetHealthOutput extends js.Object {
    var TargetHealthDescriptions: js.UndefOr[TargetHealthDescriptions]
  }

  /**
    * Information about an action that returns a custom HTTP response.
    */
  @js.native
  @Factory
  trait FixedResponseActionConfig extends js.Object {
    var StatusCode: FixedResponseActionStatusCode
    var ContentType: js.UndefOr[FixedResponseActionContentType]
    var MessageBody: js.UndefOr[FixedResponseActionMessage]
  }

  /**
    * Information about a forward action.
    */
  @js.native
  @Factory
  trait ForwardActionConfig extends js.Object {
    var TargetGroupStickinessConfig: js.UndefOr[TargetGroupStickinessConfig]
    var TargetGroups: js.UndefOr[TargetGroupList]
  }

  /**
    * Information about a host header condition.
    */
  @js.native
  @Factory
  trait HostHeaderConditionConfig extends js.Object {
    var Values: js.UndefOr[ListOfString]
  }

  /**
    * Information about an HTTP header condition.
    *  There is a set of standard HTTP header fields. You can also define custom HTTP header fields.
    */
  @js.native
  @Factory
  trait HttpHeaderConditionConfig extends js.Object {
    var HttpHeaderName: js.UndefOr[HttpHeaderConditionName]
    var Values: js.UndefOr[ListOfString]
  }

  /**
    * Information about an HTTP method condition.
    *  HTTP defines a set of request methods, also referred to as HTTP verbs. For more information, see the [[https://www.iana.org/assignments/http-methods/http-methods.xhtml|HTTP Method Registry]]. You can also define custom HTTP methods.
    */
  @js.native
  @Factory
  trait HttpRequestMethodConditionConfig extends js.Object {
    var Values: js.UndefOr[ListOfString]
  }

  @js.native
  sealed trait IpAddressType extends js.Any
  object IpAddressType extends js.Object {
    val ipv4      = "ipv4".asInstanceOf[IpAddressType]
    val dualstack = "dualstack".asInstanceOf[IpAddressType]

    val values = js.Object.freeze(js.Array(ipv4, dualstack))
  }

  /**
    * Information about an Elastic Load Balancing resource limit for your AWS account.
    */
  @js.native
  @Factory
  trait Limit extends js.Object {
    var Max: js.UndefOr[Max]
    var Name: js.UndefOr[Name]
  }

  /**
    * Information about a listener.
    */
  @js.native
  @Factory
  trait Listener extends js.Object {
    var Certificates: js.UndefOr[CertificateList]
    var DefaultActions: js.UndefOr[Actions]
    var ListenerArn: js.UndefOr[ListenerArn]
    var LoadBalancerArn: js.UndefOr[LoadBalancerArn]
    var Port: js.UndefOr[Port]
    var Protocol: js.UndefOr[ProtocolEnum]
    var SslPolicy: js.UndefOr[SslPolicyName]
  }

  /**
    * Information about a load balancer.
    */
  @js.native
  @Factory
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

  /**
    * Information about a static IP address for a load balancer.
    */
  @js.native
  @Factory
  trait LoadBalancerAddress extends js.Object {
    var AllocationId: js.UndefOr[AllocationId]
    var IpAddress: js.UndefOr[IpAddress]
    var PrivateIPv4Address: js.UndefOr[PrivateIPv4Address]
  }

  /**
    * Information about a load balancer attribute.
    */
  @js.native
  @Factory
  trait LoadBalancerAttribute extends js.Object {
    var Key: js.UndefOr[LoadBalancerAttributeKey]
    var Value: js.UndefOr[LoadBalancerAttributeValue]
  }

  @js.native
  sealed trait LoadBalancerSchemeEnum extends js.Any
  object LoadBalancerSchemeEnum extends js.Object {
    val `internet-facing` = "internet-facing".asInstanceOf[LoadBalancerSchemeEnum]
    val internal          = "internal".asInstanceOf[LoadBalancerSchemeEnum]

    val values = js.Object.freeze(js.Array(`internet-facing`, internal))
  }

  /**
    * Information about the state of the load balancer.
    */
  @js.native
  @Factory
  trait LoadBalancerState extends js.Object {
    var Code: js.UndefOr[LoadBalancerStateEnum]
    var Reason: js.UndefOr[StateReason]
  }

  @js.native
  sealed trait LoadBalancerStateEnum extends js.Any
  object LoadBalancerStateEnum extends js.Object {
    val active          = "active".asInstanceOf[LoadBalancerStateEnum]
    val provisioning    = "provisioning".asInstanceOf[LoadBalancerStateEnum]
    val active_impaired = "active_impaired".asInstanceOf[LoadBalancerStateEnum]
    val failed          = "failed".asInstanceOf[LoadBalancerStateEnum]

    val values = js.Object.freeze(js.Array(active, provisioning, active_impaired, failed))
  }

  @js.native
  sealed trait LoadBalancerTypeEnum extends js.Any
  object LoadBalancerTypeEnum extends js.Object {
    val application = "application".asInstanceOf[LoadBalancerTypeEnum]
    val network     = "network".asInstanceOf[LoadBalancerTypeEnum]

    val values = js.Object.freeze(js.Array(application, network))
  }

  /**
    * Information to use when checking for a successful response from a target.
    */
  @js.native
  @Factory
  trait Matcher extends js.Object {
    var HttpCode: HttpCode
  }

  @js.native
  @Factory
  trait ModifyListenerInput extends js.Object {
    var ListenerArn: ListenerArn
    var Certificates: js.UndefOr[CertificateList]
    var DefaultActions: js.UndefOr[Actions]
    var Port: js.UndefOr[Port]
    var Protocol: js.UndefOr[ProtocolEnum]
    var SslPolicy: js.UndefOr[SslPolicyName]
  }

  @js.native
  @Factory
  trait ModifyListenerOutput extends js.Object {
    var Listeners: js.UndefOr[Listeners]
  }

  @js.native
  @Factory
  trait ModifyLoadBalancerAttributesInput extends js.Object {
    var Attributes: LoadBalancerAttributes
    var LoadBalancerArn: LoadBalancerArn
  }

  @js.native
  @Factory
  trait ModifyLoadBalancerAttributesOutput extends js.Object {
    var Attributes: js.UndefOr[LoadBalancerAttributes]
  }

  @js.native
  @Factory
  trait ModifyRuleInput extends js.Object {
    var RuleArn: RuleArn
    var Actions: js.UndefOr[Actions]
    var Conditions: js.UndefOr[RuleConditionList]
  }

  @js.native
  @Factory
  trait ModifyRuleOutput extends js.Object {
    var Rules: js.UndefOr[Rules]
  }

  @js.native
  @Factory
  trait ModifyTargetGroupAttributesInput extends js.Object {
    var Attributes: TargetGroupAttributes
    var TargetGroupArn: TargetGroupArn
  }

  @js.native
  @Factory
  trait ModifyTargetGroupAttributesOutput extends js.Object {
    var Attributes: js.UndefOr[TargetGroupAttributes]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait ModifyTargetGroupOutput extends js.Object {
    var TargetGroups: js.UndefOr[TargetGroups]
  }

  /**
    * Information about a path pattern condition.
    */
  @js.native
  @Factory
  trait PathPatternConditionConfig extends js.Object {
    var Values: js.UndefOr[ListOfString]
  }

  @js.native
  sealed trait ProtocolEnum extends js.Any
  object ProtocolEnum extends js.Object {
    val HTTP    = "HTTP".asInstanceOf[ProtocolEnum]
    val HTTPS   = "HTTPS".asInstanceOf[ProtocolEnum]
    val TCP     = "TCP".asInstanceOf[ProtocolEnum]
    val TLS     = "TLS".asInstanceOf[ProtocolEnum]
    val UDP     = "UDP".asInstanceOf[ProtocolEnum]
    val TCP_UDP = "TCP_UDP".asInstanceOf[ProtocolEnum]

    val values = js.Object.freeze(js.Array(HTTP, HTTPS, TCP, TLS, UDP, TCP_UDP))
  }

  /**
    * Information about a query string condition.
    *  The query string component of a URI starts after the first '?' character and is terminated by either a '#' character or the end of the URI. A typical query string contains key/value pairs separated by '&amp;' characters. The allowed characters are specified by RFC 3986. Any character can be percentage encoded.
    */
  @js.native
  @Factory
  trait QueryStringConditionConfig extends js.Object {
    var Values: js.UndefOr[QueryStringKeyValuePairList]
  }

  /**
    * Information about a key/value pair.
    */
  @js.native
  @Factory
  trait QueryStringKeyValuePair extends js.Object {
    var Key: js.UndefOr[StringValue]
    var Value: js.UndefOr[StringValue]
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
  @Factory
  trait RedirectActionConfig extends js.Object {
    var StatusCode: RedirectActionStatusCodeEnum
    var Host: js.UndefOr[RedirectActionHost]
    var Path: js.UndefOr[RedirectActionPath]
    var Port: js.UndefOr[RedirectActionPort]
    var Protocol: js.UndefOr[RedirectActionProtocol]
    var Query: js.UndefOr[RedirectActionQuery]
  }

  @js.native
  sealed trait RedirectActionStatusCodeEnum extends js.Any
  object RedirectActionStatusCodeEnum extends js.Object {
    val HTTP_301 = "HTTP_301".asInstanceOf[RedirectActionStatusCodeEnum]
    val HTTP_302 = "HTTP_302".asInstanceOf[RedirectActionStatusCodeEnum]

    val values = js.Object.freeze(js.Array(HTTP_301, HTTP_302))
  }

  @js.native
  @Factory
  trait RegisterTargetsInput extends js.Object {
    var TargetGroupArn: TargetGroupArn
    var Targets: TargetDescriptions
  }

  @js.native
  @Factory
  trait RegisterTargetsOutput extends js.Object {}

  @js.native
  @Factory
  trait RemoveListenerCertificatesInput extends js.Object {
    var Certificates: CertificateList
    var ListenerArn: ListenerArn
  }

  @js.native
  @Factory
  trait RemoveListenerCertificatesOutput extends js.Object {}

  @js.native
  @Factory
  trait RemoveTagsInput extends js.Object {
    var ResourceArns: ResourceArns
    var TagKeys: TagKeys
  }

  @js.native
  @Factory
  trait RemoveTagsOutput extends js.Object {}

  /**
    * Information about a rule.
    */
  @js.native
  @Factory
  trait Rule extends js.Object {
    var Actions: js.UndefOr[Actions]
    var Conditions: js.UndefOr[RuleConditionList]
    var IsDefault: js.UndefOr[IsDefault]
    var Priority: js.UndefOr[String]
    var RuleArn: js.UndefOr[RuleArn]
  }

  /**
    * Information about a condition for a rule.
    */
  @js.native
  @Factory
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

  /**
    * Information about the priorities for the rules for a listener.
    */
  @js.native
  @Factory
  trait RulePriorityPair extends js.Object {
    var Priority: js.UndefOr[RulePriority]
    var RuleArn: js.UndefOr[RuleArn]
  }

  @js.native
  @Factory
  trait SetIpAddressTypeInput extends js.Object {
    var IpAddressType: IpAddressType
    var LoadBalancerArn: LoadBalancerArn
  }

  @js.native
  @Factory
  trait SetIpAddressTypeOutput extends js.Object {
    var IpAddressType: js.UndefOr[IpAddressType]
  }

  @js.native
  @Factory
  trait SetRulePrioritiesInput extends js.Object {
    var RulePriorities: RulePriorityList
  }

  @js.native
  @Factory
  trait SetRulePrioritiesOutput extends js.Object {
    var Rules: js.UndefOr[Rules]
  }

  @js.native
  @Factory
  trait SetSecurityGroupsInput extends js.Object {
    var LoadBalancerArn: LoadBalancerArn
    var SecurityGroups: SecurityGroups
  }

  @js.native
  @Factory
  trait SetSecurityGroupsOutput extends js.Object {
    var SecurityGroupIds: js.UndefOr[SecurityGroups]
  }

  @js.native
  @Factory
  trait SetSubnetsInput extends js.Object {
    var LoadBalancerArn: LoadBalancerArn
    var SubnetMappings: js.UndefOr[SubnetMappings]
    var Subnets: js.UndefOr[Subnets]
  }

  @js.native
  @Factory
  trait SetSubnetsOutput extends js.Object {
    var AvailabilityZones: js.UndefOr[AvailabilityZones]
  }

  /**
    * Information about a source IP condition.
    *  You can use this condition to route based on the IP address of the source that connects to the load balancer. If a client is behind a proxy, this is the IP address of the proxy not the IP address of the client.
    */
  @js.native
  @Factory
  trait SourceIpConditionConfig extends js.Object {
    var Values: js.UndefOr[ListOfString]
  }

  /**
    * Information about a policy used for SSL negotiation.
    */
  @js.native
  @Factory
  trait SslPolicy extends js.Object {
    var Ciphers: js.UndefOr[Ciphers]
    var Name: js.UndefOr[SslPolicyName]
    var SslProtocols: js.UndefOr[SslProtocols]
  }

  /**
    * Information about a subnet mapping.
    */
  @js.native
  @Factory
  trait SubnetMapping extends js.Object {
    var AllocationId: js.UndefOr[AllocationId]
    var PrivateIPv4Address: js.UndefOr[PrivateIPv4Address]
    var SubnetId: js.UndefOr[SubnetId]
  }

  /**
    * Information about a tag.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: js.UndefOr[TagValue]
  }

  /**
    * The tags associated with a resource.
    */
  @js.native
  @Factory
  trait TagDescription extends js.Object {
    var ResourceArn: js.UndefOr[ResourceArn]
    var Tags: js.UndefOr[TagList]
  }

  /**
    * Information about a target.
    */
  @js.native
  @Factory
  trait TargetDescription extends js.Object {
    var Id: TargetId
    var AvailabilityZone: js.UndefOr[ZoneName]
    var Port: js.UndefOr[Port]
  }

  /**
    * Information about a target group.
    */
  @js.native
  @Factory
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

  /**
    * Information about a target group attribute.
    */
  @js.native
  @Factory
  trait TargetGroupAttribute extends js.Object {
    var Key: js.UndefOr[TargetGroupAttributeKey]
    var Value: js.UndefOr[TargetGroupAttributeValue]
  }

  /**
    * Information about the target group stickiness for a rule.
    */
  @js.native
  @Factory
  trait TargetGroupStickinessConfig extends js.Object {
    var DurationSeconds: js.UndefOr[TargetGroupStickinessDurationSeconds]
    var Enabled: js.UndefOr[TargetGroupStickinessEnabled]
  }

  /**
    * Information about how traffic will be distributed between multiple target groups in a forward rule.
    */
  @js.native
  @Factory
  trait TargetGroupTuple extends js.Object {
    var TargetGroupArn: js.UndefOr[TargetGroupArn]
    var Weight: js.UndefOr[TargetGroupWeight]
  }

  /**
    * Information about the current health of a target.
    */
  @js.native
  @Factory
  trait TargetHealth extends js.Object {
    var Description: js.UndefOr[Description]
    var Reason: js.UndefOr[TargetHealthReasonEnum]
    var State: js.UndefOr[TargetHealthStateEnum]
  }

  /**
    * Information about the health of a target.
    */
  @js.native
  @Factory
  trait TargetHealthDescription extends js.Object {
    var HealthCheckPort: js.UndefOr[HealthCheckPort]
    var Target: js.UndefOr[TargetDescription]
    var TargetHealth: js.UndefOr[TargetHealth]
  }

  @js.native
  sealed trait TargetHealthReasonEnum extends js.Any
  object TargetHealthReasonEnum extends js.Object {
    val `Elb.RegistrationInProgress`      = "Elb.RegistrationInProgress".asInstanceOf[TargetHealthReasonEnum]
    val `Elb.InitialHealthChecking`       = "Elb.InitialHealthChecking".asInstanceOf[TargetHealthReasonEnum]
    val `Target.ResponseCodeMismatch`     = "Target.ResponseCodeMismatch".asInstanceOf[TargetHealthReasonEnum]
    val `Target.Timeout`                  = "Target.Timeout".asInstanceOf[TargetHealthReasonEnum]
    val `Target.FailedHealthChecks`       = "Target.FailedHealthChecks".asInstanceOf[TargetHealthReasonEnum]
    val `Target.NotRegistered`            = "Target.NotRegistered".asInstanceOf[TargetHealthReasonEnum]
    val `Target.NotInUse`                 = "Target.NotInUse".asInstanceOf[TargetHealthReasonEnum]
    val `Target.DeregistrationInProgress` = "Target.DeregistrationInProgress".asInstanceOf[TargetHealthReasonEnum]
    val `Target.InvalidState`             = "Target.InvalidState".asInstanceOf[TargetHealthReasonEnum]
    val `Target.IpUnusable`               = "Target.IpUnusable".asInstanceOf[TargetHealthReasonEnum]
    val `Target.HealthCheckDisabled`      = "Target.HealthCheckDisabled".asInstanceOf[TargetHealthReasonEnum]
    val `Elb.InternalError`               = "Elb.InternalError".asInstanceOf[TargetHealthReasonEnum]

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

  @js.native
  sealed trait TargetHealthStateEnum extends js.Any
  object TargetHealthStateEnum extends js.Object {
    val initial     = "initial".asInstanceOf[TargetHealthStateEnum]
    val healthy     = "healthy".asInstanceOf[TargetHealthStateEnum]
    val unhealthy   = "unhealthy".asInstanceOf[TargetHealthStateEnum]
    val unused      = "unused".asInstanceOf[TargetHealthStateEnum]
    val draining    = "draining".asInstanceOf[TargetHealthStateEnum]
    val unavailable = "unavailable".asInstanceOf[TargetHealthStateEnum]

    val values = js.Object.freeze(js.Array(initial, healthy, unhealthy, unused, draining, unavailable))
  }

  @js.native
  sealed trait TargetTypeEnum extends js.Any
  object TargetTypeEnum extends js.Object {
    val instance = "instance".asInstanceOf[TargetTypeEnum]
    val ip       = "ip".asInstanceOf[TargetTypeEnum]
    val lambda   = "lambda".asInstanceOf[TargetTypeEnum]

    val values = js.Object.freeze(js.Array(instance, ip, lambda))
  }
}
