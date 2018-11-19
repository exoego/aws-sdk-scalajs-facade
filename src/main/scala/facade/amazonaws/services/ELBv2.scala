package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object elbv2 {
  type ActionOrder = Int
  type ActionTypeEnum = String
  type Actions = js.Array[Action]
  type AllocationId = String
  type AuthenticateCognitoActionAuthenticationRequestExtraParams = js.Dictionary[AuthenticateCognitoActionAuthenticationRequestParamValue]
  type AuthenticateCognitoActionAuthenticationRequestParamName = String
  type AuthenticateCognitoActionAuthenticationRequestParamValue = String
  type AuthenticateCognitoActionConditionalBehaviorEnum = String
  type AuthenticateCognitoActionScope = String
  type AuthenticateCognitoActionSessionCookieName = String
  type AuthenticateCognitoActionSessionTimeout = Double
  type AuthenticateCognitoActionUserPoolArn = String
  type AuthenticateCognitoActionUserPoolClientId = String
  type AuthenticateCognitoActionUserPoolDomain = String
  type AuthenticateOidcActionAuthenticationRequestExtraParams = js.Dictionary[AuthenticateOidcActionAuthenticationRequestParamValue]
  type AuthenticateOidcActionAuthenticationRequestParamName = String
  type AuthenticateOidcActionAuthenticationRequestParamValue = String
  type AuthenticateOidcActionAuthorizationEndpoint = String
  type AuthenticateOidcActionClientId = String
  type AuthenticateOidcActionClientSecret = String
  type AuthenticateOidcActionConditionalBehaviorEnum = String
  type AuthenticateOidcActionIssuer = String
  type AuthenticateOidcActionScope = String
  type AuthenticateOidcActionSessionCookieName = String
  type AuthenticateOidcActionSessionTimeout = Double
  type AuthenticateOidcActionTokenEndpoint = String
  type AuthenticateOidcActionUserInfoEndpoint = String
  type AvailabilityZones = js.Array[AvailabilityZone]
  type CanonicalHostedZoneId = String
  type CertificateArn = String
  type CertificateList = js.Array[Certificate]
  type CipherName = String
  type CipherPriority = Int
  type Ciphers = js.Array[Cipher]
  type ConditionFieldName = String
  type CreatedTime = js.Date
  type DNSName = String
  type Default = Boolean
  type Description = String
  type FixedResponseActionContentType = String
  type FixedResponseActionMessage = String
  type FixedResponseActionStatusCode = String
  type HealthCheckIntervalSeconds = Int
  type HealthCheckPort = String
  type HealthCheckThresholdCount = Int
  type HealthCheckTimeoutSeconds = Int
  type HttpCode = String
  type IpAddress = String
  type IpAddressType = String
  type IsDefault = Boolean
  type Limits = js.Array[Limit]
  type ListOfString = js.Array[StringValue]
  type ListenerArn = String
  type ListenerArns = js.Array[ListenerArn]
  type Listeners = js.Array[Listener]
  type LoadBalancerAddresses = js.Array[LoadBalancerAddress]
  type LoadBalancerArn = String
  type LoadBalancerArns = js.Array[LoadBalancerArn]
  type LoadBalancerAttributeKey = String
  type LoadBalancerAttributeValue = String
  type LoadBalancerAttributes = js.Array[LoadBalancerAttribute]
  type LoadBalancerName = String
  type LoadBalancerNames = js.Array[LoadBalancerName]
  type LoadBalancerSchemeEnum = String
  type LoadBalancerStateEnum = String
  type LoadBalancerTypeEnum = String
  type LoadBalancers = js.Array[LoadBalancer]
  type Marker = String
  type Max = String
  type Name = String
  type PageSize = Int
  type Path = String
  type Port = Int
  type ProtocolEnum = String
  type RedirectActionHost = String
  type RedirectActionPath = String
  type RedirectActionPort = String
  type RedirectActionProtocol = String
  type RedirectActionQuery = String
  type RedirectActionStatusCodeEnum = String
  type ResourceArn = String
  type ResourceArns = js.Array[ResourceArn]
  type RuleArn = String
  type RuleArns = js.Array[RuleArn]
  type RuleConditionList = js.Array[RuleCondition]
  type RulePriority = Int
  type RulePriorityList = js.Array[RulePriorityPair]
  type Rules = js.Array[Rule]
  type SecurityGroupId = String
  type SecurityGroups = js.Array[SecurityGroupId]
  type SslPolicies = js.Array[SslPolicy]
  type SslPolicyName = String
  type SslPolicyNames = js.Array[SslPolicyName]
  type SslProtocol = String
  type SslProtocols = js.Array[SslProtocol]
  type StateReason = String
  type StringValue = String
  type SubnetId = String
  type SubnetMappings = js.Array[SubnetMapping]
  type Subnets = js.Array[SubnetId]
  type TagDescriptions = js.Array[TagDescription]
  type TagKey = String
  type TagKeys = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type TargetDescriptions = js.Array[TargetDescription]
  type TargetGroupArn = String
  type TargetGroupArns = js.Array[TargetGroupArn]
  type TargetGroupAttributeKey = String
  type TargetGroupAttributeValue = String
  type TargetGroupAttributes = js.Array[TargetGroupAttribute]
  type TargetGroupName = String
  type TargetGroupNames = js.Array[TargetGroupName]
  type TargetGroups = js.Array[TargetGroup]
  type TargetHealthDescriptions = js.Array[TargetHealthDescription]
  type TargetHealthReasonEnum = String
  type TargetHealthStateEnum = String
  type TargetId = String
  type TargetTypeEnum = String
  type VpcId = String
  type ZoneName = String
}

package elbv2 {
  @js.native
  @JSImport("aws-sdk", "ELBv2")
  class ELBv2(config: AWSConfig) extends js.Object {
    def addListenerCertificates(params: AddListenerCertificatesInput): Request[AddListenerCertificatesOutput] = js.native
    def addTags(params: AddTagsInput): Request[AddTagsOutput] = js.native
    def createListener(params: CreateListenerInput): Request[CreateListenerOutput] = js.native
    def createLoadBalancer(params: CreateLoadBalancerInput): Request[CreateLoadBalancerOutput] = js.native
    def createRule(params: CreateRuleInput): Request[CreateRuleOutput] = js.native
    def createTargetGroup(params: CreateTargetGroupInput): Request[CreateTargetGroupOutput] = js.native
    def deleteListener(params: DeleteListenerInput): Request[DeleteListenerOutput] = js.native
    def deleteLoadBalancer(params: DeleteLoadBalancerInput): Request[DeleteLoadBalancerOutput] = js.native
    def deleteRule(params: DeleteRuleInput): Request[DeleteRuleOutput] = js.native
    def deleteTargetGroup(params: DeleteTargetGroupInput): Request[DeleteTargetGroupOutput] = js.native
    def deregisterTargets(params: DeregisterTargetsInput): Request[DeregisterTargetsOutput] = js.native
    def describeAccountLimits(params: DescribeAccountLimitsInput): Request[DescribeAccountLimitsOutput] = js.native
    def describeListenerCertificates(params: DescribeListenerCertificatesInput): Request[DescribeListenerCertificatesOutput] = js.native
    def describeListeners(params: DescribeListenersInput): Request[DescribeListenersOutput] = js.native
    def describeLoadBalancerAttributes(params: DescribeLoadBalancerAttributesInput): Request[DescribeLoadBalancerAttributesOutput] = js.native
    def describeLoadBalancers(params: DescribeLoadBalancersInput): Request[DescribeLoadBalancersOutput] = js.native
    def describeRules(params: DescribeRulesInput): Request[DescribeRulesOutput] = js.native
    def describeSSLPolicies(params: DescribeSSLPoliciesInput): Request[DescribeSSLPoliciesOutput] = js.native
    def describeTags(params: DescribeTagsInput): Request[DescribeTagsOutput] = js.native
    def describeTargetGroupAttributes(params: DescribeTargetGroupAttributesInput): Request[DescribeTargetGroupAttributesOutput] = js.native
    def describeTargetGroups(params: DescribeTargetGroupsInput): Request[DescribeTargetGroupsOutput] = js.native
    def describeTargetHealth(params: DescribeTargetHealthInput): Request[DescribeTargetHealthOutput] = js.native
    def modifyListener(params: ModifyListenerInput): Request[ModifyListenerOutput] = js.native
    def modifyLoadBalancerAttributes(params: ModifyLoadBalancerAttributesInput): Request[ModifyLoadBalancerAttributesOutput] = js.native
    def modifyRule(params: ModifyRuleInput): Request[ModifyRuleOutput] = js.native
    def modifyTargetGroup(params: ModifyTargetGroupInput): Request[ModifyTargetGroupOutput] = js.native
    def modifyTargetGroupAttributes(params: ModifyTargetGroupAttributesInput): Request[ModifyTargetGroupAttributesOutput] = js.native
    def registerTargets(params: RegisterTargetsInput): Request[RegisterTargetsOutput] = js.native
    def removeListenerCertificates(params: RemoveListenerCertificatesInput): Request[RemoveListenerCertificatesOutput] = js.native
    def removeTags(params: RemoveTagsInput): Request[RemoveTagsOutput] = js.native
    def setIpAddressType(params: SetIpAddressTypeInput): Request[SetIpAddressTypeOutput] = js.native
    def setRulePriorities(params: SetRulePrioritiesInput): Request[SetRulePrioritiesOutput] = js.native
    def setSecurityGroups(params: SetSecurityGroupsInput): Request[SetSecurityGroupsOutput] = js.native
    def setSubnets(params: SetSubnetsInput): Request[SetSubnetsOutput] = js.native
  }

  /**
   * <p>Information about an action.</p>
   */
  @js.native
  trait Action extends js.Object {
    var RedirectConfig: js.UndefOr[RedirectActionConfig]
    var FixedResponseConfig: js.UndefOr[FixedResponseActionConfig]
    var TargetGroupArn: js.UndefOr[TargetGroupArn]
    var AuthenticateCognitoConfig: js.UndefOr[AuthenticateCognitoActionConfig]
    var AuthenticateOidcConfig: js.UndefOr[AuthenticateOidcActionConfig]
    var Order: js.UndefOr[ActionOrder]
    var Type: js.UndefOr[ActionTypeEnum]
  }

  object Action {
    def apply(
      RedirectConfig: js.UndefOr[RedirectActionConfig] = js.undefined,
      FixedResponseConfig: js.UndefOr[FixedResponseActionConfig] = js.undefined,
      TargetGroupArn: js.UndefOr[TargetGroupArn] = js.undefined,
      AuthenticateCognitoConfig: js.UndefOr[AuthenticateCognitoActionConfig] = js.undefined,
      AuthenticateOidcConfig: js.UndefOr[AuthenticateOidcActionConfig] = js.undefined,
      Order: js.UndefOr[ActionOrder] = js.undefined,
      Type: js.UndefOr[ActionTypeEnum] = js.undefined): Action = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RedirectConfig" -> RedirectConfig.map { x => x.asInstanceOf[js.Any] },
        "FixedResponseConfig" -> FixedResponseConfig.map { x => x.asInstanceOf[js.Any] },
        "TargetGroupArn" -> TargetGroupArn.map { x => x.asInstanceOf[js.Any] },
        "AuthenticateCognitoConfig" -> AuthenticateCognitoConfig.map { x => x.asInstanceOf[js.Any] },
        "AuthenticateOidcConfig" -> AuthenticateOidcConfig.map { x => x.asInstanceOf[js.Any] },
        "Order" -> Order.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Action]
    }
  }

  object ActionTypeEnumEnum {
    val forward = "forward"
    val `authenticate-oidc` = "authenticate-oidc"
    val `authenticate-cognito` = "authenticate-cognito"
    val redirect = "redirect"
    val `fixed-response` = "fixed-response"

    val values = IndexedSeq(forward, `authenticate-oidc`, `authenticate-cognito`, redirect, `fixed-response`)
  }

  @js.native
  trait AddListenerCertificatesInput extends js.Object {
    var ListenerArn: js.UndefOr[ListenerArn]
    var Certificates: js.UndefOr[CertificateList]
  }

  object AddListenerCertificatesInput {
    def apply(
      ListenerArn: js.UndefOr[ListenerArn] = js.undefined,
      Certificates: js.UndefOr[CertificateList] = js.undefined): AddListenerCertificatesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ListenerArn" -> ListenerArn.map { x => x.asInstanceOf[js.Any] },
        "Certificates" -> Certificates.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddListenerCertificatesInput]
    }
  }

  @js.native
  trait AddListenerCertificatesOutput extends js.Object {
    var Certificates: js.UndefOr[CertificateList]
  }

  object AddListenerCertificatesOutput {
    def apply(
      Certificates: js.UndefOr[CertificateList] = js.undefined): AddListenerCertificatesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Certificates" -> Certificates.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddListenerCertificatesOutput]
    }
  }

  @js.native
  trait AddTagsInput extends js.Object {
    var ResourceArns: js.UndefOr[ResourceArns]
    var Tags: js.UndefOr[TagList]
  }

  object AddTagsInput {
    def apply(
      ResourceArns: js.UndefOr[ResourceArns] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): AddTagsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArns" -> ResourceArns.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddTagsInput]
    }
  }

  @js.native
  trait AddTagsOutput extends js.Object {

  }

  object AddTagsOutput {
    def apply(): AddTagsOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddTagsOutput]
    }
  }

  /**
   * <p>The specified allocation ID does not exist.</p>
   */
  @js.native
  trait AllocationIdNotFoundExceptionException extends js.Object {

  }

  object AuthenticateCognitoActionConditionalBehaviorEnumEnum {
    val deny = "deny"
    val allow = "allow"
    val authenticate = "authenticate"

    val values = IndexedSeq(deny, allow, authenticate)
  }

  /**
   * <p>Request parameters to use when integrating with Amazon Cognito to authenticate users.</p>
   */
  @js.native
  trait AuthenticateCognitoActionConfig extends js.Object {
    var UserPoolClientId: js.UndefOr[AuthenticateCognitoActionUserPoolClientId]
    var Scope: js.UndefOr[AuthenticateCognitoActionScope]
    var UserPoolDomain: js.UndefOr[AuthenticateCognitoActionUserPoolDomain]
    var SessionTimeout: js.UndefOr[AuthenticateCognitoActionSessionTimeout]
    var SessionCookieName: js.UndefOr[AuthenticateCognitoActionSessionCookieName]
    var AuthenticationRequestExtraParams: js.UndefOr[AuthenticateCognitoActionAuthenticationRequestExtraParams]
    var OnUnauthenticatedRequest: js.UndefOr[AuthenticateCognitoActionConditionalBehaviorEnum]
    var UserPoolArn: js.UndefOr[AuthenticateCognitoActionUserPoolArn]
  }

  object AuthenticateCognitoActionConfig {
    def apply(
      UserPoolClientId: js.UndefOr[AuthenticateCognitoActionUserPoolClientId] = js.undefined,
      Scope: js.UndefOr[AuthenticateCognitoActionScope] = js.undefined,
      UserPoolDomain: js.UndefOr[AuthenticateCognitoActionUserPoolDomain] = js.undefined,
      SessionTimeout: js.UndefOr[AuthenticateCognitoActionSessionTimeout] = js.undefined,
      SessionCookieName: js.UndefOr[AuthenticateCognitoActionSessionCookieName] = js.undefined,
      AuthenticationRequestExtraParams: js.UndefOr[AuthenticateCognitoActionAuthenticationRequestExtraParams] = js.undefined,
      OnUnauthenticatedRequest: js.UndefOr[AuthenticateCognitoActionConditionalBehaviorEnum] = js.undefined,
      UserPoolArn: js.UndefOr[AuthenticateCognitoActionUserPoolArn] = js.undefined): AuthenticateCognitoActionConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolClientId" -> UserPoolClientId.map { x => x.asInstanceOf[js.Any] },
        "Scope" -> Scope.map { x => x.asInstanceOf[js.Any] },
        "UserPoolDomain" -> UserPoolDomain.map { x => x.asInstanceOf[js.Any] },
        "SessionTimeout" -> SessionTimeout.map { x => x.asInstanceOf[js.Any] },
        "SessionCookieName" -> SessionCookieName.map { x => x.asInstanceOf[js.Any] },
        "AuthenticationRequestExtraParams" -> AuthenticationRequestExtraParams.map { x => x.asInstanceOf[js.Any] },
        "OnUnauthenticatedRequest" -> OnUnauthenticatedRequest.map { x => x.asInstanceOf[js.Any] },
        "UserPoolArn" -> UserPoolArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AuthenticateCognitoActionConfig]
    }
  }

  object AuthenticateOidcActionConditionalBehaviorEnumEnum {
    val deny = "deny"
    val allow = "allow"
    val authenticate = "authenticate"

    val values = IndexedSeq(deny, allow, authenticate)
  }

  /**
   * <p>Request parameters when using an identity provider (IdP) that is compliant with OpenID Connect (OIDC) to authenticate users.</p>
   */
  @js.native
  trait AuthenticateOidcActionConfig extends js.Object {
    var AuthorizationEndpoint: js.UndefOr[AuthenticateOidcActionAuthorizationEndpoint]
    var Scope: js.UndefOr[AuthenticateOidcActionScope]
    var UserInfoEndpoint: js.UndefOr[AuthenticateOidcActionUserInfoEndpoint]
    var ClientId: js.UndefOr[AuthenticateOidcActionClientId]
    var ClientSecret: js.UndefOr[AuthenticateOidcActionClientSecret]
    var SessionTimeout: js.UndefOr[AuthenticateOidcActionSessionTimeout]
    var Issuer: js.UndefOr[AuthenticateOidcActionIssuer]
    var TokenEndpoint: js.UndefOr[AuthenticateOidcActionTokenEndpoint]
    var SessionCookieName: js.UndefOr[AuthenticateOidcActionSessionCookieName]
    var AuthenticationRequestExtraParams: js.UndefOr[AuthenticateOidcActionAuthenticationRequestExtraParams]
    var OnUnauthenticatedRequest: js.UndefOr[AuthenticateOidcActionConditionalBehaviorEnum]
  }

  object AuthenticateOidcActionConfig {
    def apply(
      AuthorizationEndpoint: js.UndefOr[AuthenticateOidcActionAuthorizationEndpoint] = js.undefined,
      Scope: js.UndefOr[AuthenticateOidcActionScope] = js.undefined,
      UserInfoEndpoint: js.UndefOr[AuthenticateOidcActionUserInfoEndpoint] = js.undefined,
      ClientId: js.UndefOr[AuthenticateOidcActionClientId] = js.undefined,
      ClientSecret: js.UndefOr[AuthenticateOidcActionClientSecret] = js.undefined,
      SessionTimeout: js.UndefOr[AuthenticateOidcActionSessionTimeout] = js.undefined,
      Issuer: js.UndefOr[AuthenticateOidcActionIssuer] = js.undefined,
      TokenEndpoint: js.UndefOr[AuthenticateOidcActionTokenEndpoint] = js.undefined,
      SessionCookieName: js.UndefOr[AuthenticateOidcActionSessionCookieName] = js.undefined,
      AuthenticationRequestExtraParams: js.UndefOr[AuthenticateOidcActionAuthenticationRequestExtraParams] = js.undefined,
      OnUnauthenticatedRequest: js.UndefOr[AuthenticateOidcActionConditionalBehaviorEnum] = js.undefined): AuthenticateOidcActionConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AuthorizationEndpoint" -> AuthorizationEndpoint.map { x => x.asInstanceOf[js.Any] },
        "Scope" -> Scope.map { x => x.asInstanceOf[js.Any] },
        "UserInfoEndpoint" -> UserInfoEndpoint.map { x => x.asInstanceOf[js.Any] },
        "ClientId" -> ClientId.map { x => x.asInstanceOf[js.Any] },
        "ClientSecret" -> ClientSecret.map { x => x.asInstanceOf[js.Any] },
        "SessionTimeout" -> SessionTimeout.map { x => x.asInstanceOf[js.Any] },
        "Issuer" -> Issuer.map { x => x.asInstanceOf[js.Any] },
        "TokenEndpoint" -> TokenEndpoint.map { x => x.asInstanceOf[js.Any] },
        "SessionCookieName" -> SessionCookieName.map { x => x.asInstanceOf[js.Any] },
        "AuthenticationRequestExtraParams" -> AuthenticationRequestExtraParams.map { x => x.asInstanceOf[js.Any] },
        "OnUnauthenticatedRequest" -> OnUnauthenticatedRequest.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AuthenticateOidcActionConfig]
    }
  }

  /**
   * <p>Information about an Availability Zone.</p>
   */
  @js.native
  trait AvailabilityZone extends js.Object {
    var ZoneName: js.UndefOr[ZoneName]
    var SubnetId: js.UndefOr[SubnetId]
    var LoadBalancerAddresses: js.UndefOr[LoadBalancerAddresses]
  }

  object AvailabilityZone {
    def apply(
      ZoneName: js.UndefOr[ZoneName] = js.undefined,
      SubnetId: js.UndefOr[SubnetId] = js.undefined,
      LoadBalancerAddresses: js.UndefOr[LoadBalancerAddresses] = js.undefined): AvailabilityZone = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ZoneName" -> ZoneName.map { x => x.asInstanceOf[js.Any] },
        "SubnetId" -> SubnetId.map { x => x.asInstanceOf[js.Any] },
        "LoadBalancerAddresses" -> LoadBalancerAddresses.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AvailabilityZone]
    }
  }

  /**
   * <p>The specified Availability Zone is not supported.</p>
   */
  @js.native
  trait AvailabilityZoneNotSupportedExceptionException extends js.Object {

  }

  /**
   * <p>Information about an SSL server certificate.</p>
   */
  @js.native
  trait Certificate extends js.Object {
    var CertificateArn: js.UndefOr[CertificateArn]
    var IsDefault: js.UndefOr[Default]
  }

  object Certificate {
    def apply(
      CertificateArn: js.UndefOr[CertificateArn] = js.undefined,
      IsDefault: js.UndefOr[Default] = js.undefined): Certificate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CertificateArn" -> CertificateArn.map { x => x.asInstanceOf[js.Any] },
        "IsDefault" -> IsDefault.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Certificate]
    }
  }

  /**
   * <p>The specified certificate does not exist.</p>
   */
  @js.native
  trait CertificateNotFoundExceptionException extends js.Object {

  }

  /**
   * <p>Information about a cipher used in a policy.</p>
   */
  @js.native
  trait Cipher extends js.Object {
    var Name: js.UndefOr[CipherName]
    var Priority: js.UndefOr[CipherPriority]
  }

  object Cipher {
    def apply(
      Name: js.UndefOr[CipherName] = js.undefined,
      Priority: js.UndefOr[CipherPriority] = js.undefined): Cipher = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Priority" -> Priority.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Cipher]
    }
  }

  @js.native
  trait CreateListenerInput extends js.Object {
    var DefaultActions: js.UndefOr[Actions]
    var Port: js.UndefOr[Port]
    var SslPolicy: js.UndefOr[SslPolicyName]
    var Protocol: js.UndefOr[ProtocolEnum]
    var LoadBalancerArn: js.UndefOr[LoadBalancerArn]
    var Certificates: js.UndefOr[CertificateList]
  }

  object CreateListenerInput {
    def apply(
      DefaultActions: js.UndefOr[Actions] = js.undefined,
      Port: js.UndefOr[Port] = js.undefined,
      SslPolicy: js.UndefOr[SslPolicyName] = js.undefined,
      Protocol: js.UndefOr[ProtocolEnum] = js.undefined,
      LoadBalancerArn: js.UndefOr[LoadBalancerArn] = js.undefined,
      Certificates: js.UndefOr[CertificateList] = js.undefined): CreateListenerInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DefaultActions" -> DefaultActions.map { x => x.asInstanceOf[js.Any] },
        "Port" -> Port.map { x => x.asInstanceOf[js.Any] },
        "SslPolicy" -> SslPolicy.map { x => x.asInstanceOf[js.Any] },
        "Protocol" -> Protocol.map { x => x.asInstanceOf[js.Any] },
        "LoadBalancerArn" -> LoadBalancerArn.map { x => x.asInstanceOf[js.Any] },
        "Certificates" -> Certificates.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateListenerInput]
    }
  }

  @js.native
  trait CreateListenerOutput extends js.Object {
    var Listeners: js.UndefOr[Listeners]
  }

  object CreateListenerOutput {
    def apply(
      Listeners: js.UndefOr[Listeners] = js.undefined): CreateListenerOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Listeners" -> Listeners.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateListenerOutput]
    }
  }

  @js.native
  trait CreateLoadBalancerInput extends js.Object {
    var Name: js.UndefOr[LoadBalancerName]
    var Subnets: js.UndefOr[Subnets]
    var SubnetMappings: js.UndefOr[SubnetMappings]
    var SecurityGroups: js.UndefOr[SecurityGroups]
    var IpAddressType: js.UndefOr[IpAddressType]
    var Tags: js.UndefOr[TagList]
    var Scheme: js.UndefOr[LoadBalancerSchemeEnum]
    var Type: js.UndefOr[LoadBalancerTypeEnum]
  }

  object CreateLoadBalancerInput {
    def apply(
      Name: js.UndefOr[LoadBalancerName] = js.undefined,
      Subnets: js.UndefOr[Subnets] = js.undefined,
      SubnetMappings: js.UndefOr[SubnetMappings] = js.undefined,
      SecurityGroups: js.UndefOr[SecurityGroups] = js.undefined,
      IpAddressType: js.UndefOr[IpAddressType] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      Scheme: js.UndefOr[LoadBalancerSchemeEnum] = js.undefined,
      Type: js.UndefOr[LoadBalancerTypeEnum] = js.undefined): CreateLoadBalancerInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Subnets" -> Subnets.map { x => x.asInstanceOf[js.Any] },
        "SubnetMappings" -> SubnetMappings.map { x => x.asInstanceOf[js.Any] },
        "SecurityGroups" -> SecurityGroups.map { x => x.asInstanceOf[js.Any] },
        "IpAddressType" -> IpAddressType.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "Scheme" -> Scheme.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLoadBalancerInput]
    }
  }

  @js.native
  trait CreateLoadBalancerOutput extends js.Object {
    var LoadBalancers: js.UndefOr[LoadBalancers]
  }

  object CreateLoadBalancerOutput {
    def apply(
      LoadBalancers: js.UndefOr[LoadBalancers] = js.undefined): CreateLoadBalancerOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LoadBalancers" -> LoadBalancers.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLoadBalancerOutput]
    }
  }

  @js.native
  trait CreateRuleInput extends js.Object {
    var ListenerArn: js.UndefOr[ListenerArn]
    var Conditions: js.UndefOr[RuleConditionList]
    var Priority: js.UndefOr[RulePriority]
    var Actions: js.UndefOr[Actions]
  }

  object CreateRuleInput {
    def apply(
      ListenerArn: js.UndefOr[ListenerArn] = js.undefined,
      Conditions: js.UndefOr[RuleConditionList] = js.undefined,
      Priority: js.UndefOr[RulePriority] = js.undefined,
      Actions: js.UndefOr[Actions] = js.undefined): CreateRuleInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ListenerArn" -> ListenerArn.map { x => x.asInstanceOf[js.Any] },
        "Conditions" -> Conditions.map { x => x.asInstanceOf[js.Any] },
        "Priority" -> Priority.map { x => x.asInstanceOf[js.Any] },
        "Actions" -> Actions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRuleInput]
    }
  }

  @js.native
  trait CreateRuleOutput extends js.Object {
    var Rules: js.UndefOr[Rules]
  }

  object CreateRuleOutput {
    def apply(
      Rules: js.UndefOr[Rules] = js.undefined): CreateRuleOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Rules" -> Rules.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRuleOutput]
    }
  }

  @js.native
  trait CreateTargetGroupInput extends js.Object {
    var HealthCheckPort: js.UndefOr[HealthCheckPort]
    var TargetType: js.UndefOr[TargetTypeEnum]
    var Name: js.UndefOr[TargetGroupName]
    var UnhealthyThresholdCount: js.UndefOr[HealthCheckThresholdCount]
    var HealthyThresholdCount: js.UndefOr[HealthCheckThresholdCount]
    var HealthCheckProtocol: js.UndefOr[ProtocolEnum]
    var HealthCheckIntervalSeconds: js.UndefOr[HealthCheckIntervalSeconds]
    var HealthCheckTimeoutSeconds: js.UndefOr[HealthCheckTimeoutSeconds]
    var Port: js.UndefOr[Port]
    var HealthCheckPath: js.UndefOr[Path]
    var Protocol: js.UndefOr[ProtocolEnum]
    var Matcher: js.UndefOr[Matcher]
    var VpcId: js.UndefOr[VpcId]
  }

  object CreateTargetGroupInput {
    def apply(
      HealthCheckPort: js.UndefOr[HealthCheckPort] = js.undefined,
      TargetType: js.UndefOr[TargetTypeEnum] = js.undefined,
      Name: js.UndefOr[TargetGroupName] = js.undefined,
      UnhealthyThresholdCount: js.UndefOr[HealthCheckThresholdCount] = js.undefined,
      HealthyThresholdCount: js.UndefOr[HealthCheckThresholdCount] = js.undefined,
      HealthCheckProtocol: js.UndefOr[ProtocolEnum] = js.undefined,
      HealthCheckIntervalSeconds: js.UndefOr[HealthCheckIntervalSeconds] = js.undefined,
      HealthCheckTimeoutSeconds: js.UndefOr[HealthCheckTimeoutSeconds] = js.undefined,
      Port: js.UndefOr[Port] = js.undefined,
      HealthCheckPath: js.UndefOr[Path] = js.undefined,
      Protocol: js.UndefOr[ProtocolEnum] = js.undefined,
      Matcher: js.UndefOr[Matcher] = js.undefined,
      VpcId: js.UndefOr[VpcId] = js.undefined): CreateTargetGroupInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HealthCheckPort" -> HealthCheckPort.map { x => x.asInstanceOf[js.Any] },
        "TargetType" -> TargetType.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "UnhealthyThresholdCount" -> UnhealthyThresholdCount.map { x => x.asInstanceOf[js.Any] },
        "HealthyThresholdCount" -> HealthyThresholdCount.map { x => x.asInstanceOf[js.Any] },
        "HealthCheckProtocol" -> HealthCheckProtocol.map { x => x.asInstanceOf[js.Any] },
        "HealthCheckIntervalSeconds" -> HealthCheckIntervalSeconds.map { x => x.asInstanceOf[js.Any] },
        "HealthCheckTimeoutSeconds" -> HealthCheckTimeoutSeconds.map { x => x.asInstanceOf[js.Any] },
        "Port" -> Port.map { x => x.asInstanceOf[js.Any] },
        "HealthCheckPath" -> HealthCheckPath.map { x => x.asInstanceOf[js.Any] },
        "Protocol" -> Protocol.map { x => x.asInstanceOf[js.Any] },
        "Matcher" -> Matcher.map { x => x.asInstanceOf[js.Any] },
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTargetGroupInput]
    }
  }

  @js.native
  trait CreateTargetGroupOutput extends js.Object {
    var TargetGroups: js.UndefOr[TargetGroups]
  }

  object CreateTargetGroupOutput {
    def apply(
      TargetGroups: js.UndefOr[TargetGroups] = js.undefined): CreateTargetGroupOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TargetGroups" -> TargetGroups.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTargetGroupOutput]
    }
  }

  @js.native
  trait DeleteListenerInput extends js.Object {
    var ListenerArn: js.UndefOr[ListenerArn]
  }

  object DeleteListenerInput {
    def apply(
      ListenerArn: js.UndefOr[ListenerArn] = js.undefined): DeleteListenerInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ListenerArn" -> ListenerArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteListenerInput]
    }
  }

  @js.native
  trait DeleteListenerOutput extends js.Object {

  }

  object DeleteListenerOutput {
    def apply(): DeleteListenerOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteListenerOutput]
    }
  }

  @js.native
  trait DeleteLoadBalancerInput extends js.Object {
    var LoadBalancerArn: js.UndefOr[LoadBalancerArn]
  }

  object DeleteLoadBalancerInput {
    def apply(
      LoadBalancerArn: js.UndefOr[LoadBalancerArn] = js.undefined): DeleteLoadBalancerInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LoadBalancerArn" -> LoadBalancerArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteLoadBalancerInput]
    }
  }

  @js.native
  trait DeleteLoadBalancerOutput extends js.Object {

  }

  object DeleteLoadBalancerOutput {
    def apply(): DeleteLoadBalancerOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteLoadBalancerOutput]
    }
  }

  @js.native
  trait DeleteRuleInput extends js.Object {
    var RuleArn: js.UndefOr[RuleArn]
  }

  object DeleteRuleInput {
    def apply(
      RuleArn: js.UndefOr[RuleArn] = js.undefined): DeleteRuleInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RuleArn" -> RuleArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRuleInput]
    }
  }

  @js.native
  trait DeleteRuleOutput extends js.Object {

  }

  object DeleteRuleOutput {
    def apply(): DeleteRuleOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRuleOutput]
    }
  }

  @js.native
  trait DeleteTargetGroupInput extends js.Object {
    var TargetGroupArn: js.UndefOr[TargetGroupArn]
  }

  object DeleteTargetGroupInput {
    def apply(
      TargetGroupArn: js.UndefOr[TargetGroupArn] = js.undefined): DeleteTargetGroupInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TargetGroupArn" -> TargetGroupArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTargetGroupInput]
    }
  }

  @js.native
  trait DeleteTargetGroupOutput extends js.Object {

  }

  object DeleteTargetGroupOutput {
    def apply(): DeleteTargetGroupOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTargetGroupOutput]
    }
  }

  @js.native
  trait DeregisterTargetsInput extends js.Object {
    var TargetGroupArn: js.UndefOr[TargetGroupArn]
    var Targets: js.UndefOr[TargetDescriptions]
  }

  object DeregisterTargetsInput {
    def apply(
      TargetGroupArn: js.UndefOr[TargetGroupArn] = js.undefined,
      Targets: js.UndefOr[TargetDescriptions] = js.undefined): DeregisterTargetsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TargetGroupArn" -> TargetGroupArn.map { x => x.asInstanceOf[js.Any] },
        "Targets" -> Targets.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeregisterTargetsInput]
    }
  }

  @js.native
  trait DeregisterTargetsOutput extends js.Object {

  }

  object DeregisterTargetsOutput {
    def apply(): DeregisterTargetsOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeregisterTargetsOutput]
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
      PageSize: js.UndefOr[PageSize] = js.undefined): DescribeAccountLimitsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "PageSize" -> PageSize.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAccountLimitsInput]
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
      NextMarker: js.UndefOr[Marker] = js.undefined): DescribeAccountLimitsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Limits" -> Limits.map { x => x.asInstanceOf[js.Any] },
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAccountLimitsOutput]
    }
  }

  @js.native
  trait DescribeListenerCertificatesInput extends js.Object {
    var ListenerArn: js.UndefOr[ListenerArn]
    var Marker: js.UndefOr[Marker]
    var PageSize: js.UndefOr[PageSize]
  }

  object DescribeListenerCertificatesInput {
    def apply(
      ListenerArn: js.UndefOr[ListenerArn] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined,
      PageSize: js.UndefOr[PageSize] = js.undefined): DescribeListenerCertificatesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ListenerArn" -> ListenerArn.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "PageSize" -> PageSize.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeListenerCertificatesInput]
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
      NextMarker: js.UndefOr[Marker] = js.undefined): DescribeListenerCertificatesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Certificates" -> Certificates.map { x => x.asInstanceOf[js.Any] },
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeListenerCertificatesOutput]
    }
  }

  @js.native
  trait DescribeListenersInput extends js.Object {
    var LoadBalancerArn: js.UndefOr[LoadBalancerArn]
    var ListenerArns: js.UndefOr[ListenerArns]
    var Marker: js.UndefOr[Marker]
    var PageSize: js.UndefOr[PageSize]
  }

  object DescribeListenersInput {
    def apply(
      LoadBalancerArn: js.UndefOr[LoadBalancerArn] = js.undefined,
      ListenerArns: js.UndefOr[ListenerArns] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined,
      PageSize: js.UndefOr[PageSize] = js.undefined): DescribeListenersInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LoadBalancerArn" -> LoadBalancerArn.map { x => x.asInstanceOf[js.Any] },
        "ListenerArns" -> ListenerArns.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "PageSize" -> PageSize.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeListenersInput]
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
      NextMarker: js.UndefOr[Marker] = js.undefined): DescribeListenersOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Listeners" -> Listeners.map { x => x.asInstanceOf[js.Any] },
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeListenersOutput]
    }
  }

  @js.native
  trait DescribeLoadBalancerAttributesInput extends js.Object {
    var LoadBalancerArn: js.UndefOr[LoadBalancerArn]
  }

  object DescribeLoadBalancerAttributesInput {
    def apply(
      LoadBalancerArn: js.UndefOr[LoadBalancerArn] = js.undefined): DescribeLoadBalancerAttributesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LoadBalancerArn" -> LoadBalancerArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLoadBalancerAttributesInput]
    }
  }

  @js.native
  trait DescribeLoadBalancerAttributesOutput extends js.Object {
    var Attributes: js.UndefOr[LoadBalancerAttributes]
  }

  object DescribeLoadBalancerAttributesOutput {
    def apply(
      Attributes: js.UndefOr[LoadBalancerAttributes] = js.undefined): DescribeLoadBalancerAttributesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Attributes" -> Attributes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLoadBalancerAttributesOutput]
    }
  }

  @js.native
  trait DescribeLoadBalancersInput extends js.Object {
    var LoadBalancerArns: js.UndefOr[LoadBalancerArns]
    var Names: js.UndefOr[LoadBalancerNames]
    var Marker: js.UndefOr[Marker]
    var PageSize: js.UndefOr[PageSize]
  }

  object DescribeLoadBalancersInput {
    def apply(
      LoadBalancerArns: js.UndefOr[LoadBalancerArns] = js.undefined,
      Names: js.UndefOr[LoadBalancerNames] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined,
      PageSize: js.UndefOr[PageSize] = js.undefined): DescribeLoadBalancersInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LoadBalancerArns" -> LoadBalancerArns.map { x => x.asInstanceOf[js.Any] },
        "Names" -> Names.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "PageSize" -> PageSize.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLoadBalancersInput]
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
      NextMarker: js.UndefOr[Marker] = js.undefined): DescribeLoadBalancersOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LoadBalancers" -> LoadBalancers.map { x => x.asInstanceOf[js.Any] },
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLoadBalancersOutput]
    }
  }

  @js.native
  trait DescribeRulesInput extends js.Object {
    var ListenerArn: js.UndefOr[ListenerArn]
    var RuleArns: js.UndefOr[RuleArns]
    var Marker: js.UndefOr[Marker]
    var PageSize: js.UndefOr[PageSize]
  }

  object DescribeRulesInput {
    def apply(
      ListenerArn: js.UndefOr[ListenerArn] = js.undefined,
      RuleArns: js.UndefOr[RuleArns] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined,
      PageSize: js.UndefOr[PageSize] = js.undefined): DescribeRulesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ListenerArn" -> ListenerArn.map { x => x.asInstanceOf[js.Any] },
        "RuleArns" -> RuleArns.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "PageSize" -> PageSize.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeRulesInput]
    }
  }

  @js.native
  trait DescribeRulesOutput extends js.Object {
    var Rules: js.UndefOr[Rules]
    var NextMarker: js.UndefOr[Marker]
  }

  object DescribeRulesOutput {
    def apply(
      Rules: js.UndefOr[Rules] = js.undefined,
      NextMarker: js.UndefOr[Marker] = js.undefined): DescribeRulesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Rules" -> Rules.map { x => x.asInstanceOf[js.Any] },
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeRulesOutput]
    }
  }

  @js.native
  trait DescribeSSLPoliciesInput extends js.Object {
    var Names: js.UndefOr[SslPolicyNames]
    var Marker: js.UndefOr[Marker]
    var PageSize: js.UndefOr[PageSize]
  }

  object DescribeSSLPoliciesInput {
    def apply(
      Names: js.UndefOr[SslPolicyNames] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined,
      PageSize: js.UndefOr[PageSize] = js.undefined): DescribeSSLPoliciesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Names" -> Names.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "PageSize" -> PageSize.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSSLPoliciesInput]
    }
  }

  @js.native
  trait DescribeSSLPoliciesOutput extends js.Object {
    var SslPolicies: js.UndefOr[SslPolicies]
    var NextMarker: js.UndefOr[Marker]
  }

  object DescribeSSLPoliciesOutput {
    def apply(
      SslPolicies: js.UndefOr[SslPolicies] = js.undefined,
      NextMarker: js.UndefOr[Marker] = js.undefined): DescribeSSLPoliciesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SslPolicies" -> SslPolicies.map { x => x.asInstanceOf[js.Any] },
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSSLPoliciesOutput]
    }
  }

  @js.native
  trait DescribeTagsInput extends js.Object {
    var ResourceArns: js.UndefOr[ResourceArns]
  }

  object DescribeTagsInput {
    def apply(
      ResourceArns: js.UndefOr[ResourceArns] = js.undefined): DescribeTagsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArns" -> ResourceArns.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTagsInput]
    }
  }

  @js.native
  trait DescribeTagsOutput extends js.Object {
    var TagDescriptions: js.UndefOr[TagDescriptions]
  }

  object DescribeTagsOutput {
    def apply(
      TagDescriptions: js.UndefOr[TagDescriptions] = js.undefined): DescribeTagsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TagDescriptions" -> TagDescriptions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTagsOutput]
    }
  }

  @js.native
  trait DescribeTargetGroupAttributesInput extends js.Object {
    var TargetGroupArn: js.UndefOr[TargetGroupArn]
  }

  object DescribeTargetGroupAttributesInput {
    def apply(
      TargetGroupArn: js.UndefOr[TargetGroupArn] = js.undefined): DescribeTargetGroupAttributesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TargetGroupArn" -> TargetGroupArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTargetGroupAttributesInput]
    }
  }

  @js.native
  trait DescribeTargetGroupAttributesOutput extends js.Object {
    var Attributes: js.UndefOr[TargetGroupAttributes]
  }

  object DescribeTargetGroupAttributesOutput {
    def apply(
      Attributes: js.UndefOr[TargetGroupAttributes] = js.undefined): DescribeTargetGroupAttributesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Attributes" -> Attributes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTargetGroupAttributesOutput]
    }
  }

  @js.native
  trait DescribeTargetGroupsInput extends js.Object {
    var PageSize: js.UndefOr[PageSize]
    var Names: js.UndefOr[TargetGroupNames]
    var TargetGroupArns: js.UndefOr[TargetGroupArns]
    var LoadBalancerArn: js.UndefOr[LoadBalancerArn]
    var Marker: js.UndefOr[Marker]
  }

  object DescribeTargetGroupsInput {
    def apply(
      PageSize: js.UndefOr[PageSize] = js.undefined,
      Names: js.UndefOr[TargetGroupNames] = js.undefined,
      TargetGroupArns: js.UndefOr[TargetGroupArns] = js.undefined,
      LoadBalancerArn: js.UndefOr[LoadBalancerArn] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined): DescribeTargetGroupsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PageSize" -> PageSize.map { x => x.asInstanceOf[js.Any] },
        "Names" -> Names.map { x => x.asInstanceOf[js.Any] },
        "TargetGroupArns" -> TargetGroupArns.map { x => x.asInstanceOf[js.Any] },
        "LoadBalancerArn" -> LoadBalancerArn.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTargetGroupsInput]
    }
  }

  @js.native
  trait DescribeTargetGroupsOutput extends js.Object {
    var TargetGroups: js.UndefOr[TargetGroups]
    var NextMarker: js.UndefOr[Marker]
  }

  object DescribeTargetGroupsOutput {
    def apply(
      TargetGroups: js.UndefOr[TargetGroups] = js.undefined,
      NextMarker: js.UndefOr[Marker] = js.undefined): DescribeTargetGroupsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TargetGroups" -> TargetGroups.map { x => x.asInstanceOf[js.Any] },
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTargetGroupsOutput]
    }
  }

  @js.native
  trait DescribeTargetHealthInput extends js.Object {
    var TargetGroupArn: js.UndefOr[TargetGroupArn]
    var Targets: js.UndefOr[TargetDescriptions]
  }

  object DescribeTargetHealthInput {
    def apply(
      TargetGroupArn: js.UndefOr[TargetGroupArn] = js.undefined,
      Targets: js.UndefOr[TargetDescriptions] = js.undefined): DescribeTargetHealthInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TargetGroupArn" -> TargetGroupArn.map { x => x.asInstanceOf[js.Any] },
        "Targets" -> Targets.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTargetHealthInput]
    }
  }

  @js.native
  trait DescribeTargetHealthOutput extends js.Object {
    var TargetHealthDescriptions: js.UndefOr[TargetHealthDescriptions]
  }

  object DescribeTargetHealthOutput {
    def apply(
      TargetHealthDescriptions: js.UndefOr[TargetHealthDescriptions] = js.undefined): DescribeTargetHealthOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TargetHealthDescriptions" -> TargetHealthDescriptions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTargetHealthOutput]
    }
  }

  /**
   * <p>A listener with the specified port already exists.</p>
   */
  @js.native
  trait DuplicateListenerExceptionException extends js.Object {

  }

  /**
   * <p>A load balancer with the specified name already exists.</p>
   */
  @js.native
  trait DuplicateLoadBalancerNameExceptionException extends js.Object {

  }

  /**
   * <p>A tag key was specified more than once.</p>
   */
  @js.native
  trait DuplicateTagKeysExceptionException extends js.Object {

  }

  /**
   * <p>A target group with the specified name already exists.</p>
   */
  @js.native
  trait DuplicateTargetGroupNameExceptionException extends js.Object {

  }

  /**
   * <p>Information about an action that returns a custom HTTP response.</p>
   */
  @js.native
  trait FixedResponseActionConfig extends js.Object {
    var MessageBody: js.UndefOr[FixedResponseActionMessage]
    var StatusCode: js.UndefOr[FixedResponseActionStatusCode]
    var ContentType: js.UndefOr[FixedResponseActionContentType]
  }

  object FixedResponseActionConfig {
    def apply(
      MessageBody: js.UndefOr[FixedResponseActionMessage] = js.undefined,
      StatusCode: js.UndefOr[FixedResponseActionStatusCode] = js.undefined,
      ContentType: js.UndefOr[FixedResponseActionContentType] = js.undefined): FixedResponseActionConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MessageBody" -> MessageBody.map { x => x.asInstanceOf[js.Any] },
        "StatusCode" -> StatusCode.map { x => x.asInstanceOf[js.Any] },
        "ContentType" -> ContentType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FixedResponseActionConfig]
    }
  }

  /**
   * <p>The health of the specified targets could not be retrieved due to an internal error.</p>
   */
  @js.native
  trait HealthUnavailableExceptionException extends js.Object {

  }

  /**
   * <p>The specified configuration is not valid with this protocol.</p>
   */
  @js.native
  trait IncompatibleProtocolsExceptionException extends js.Object {

  }

  /**
   * <p>The requested configuration is not valid.</p>
   */
  @js.native
  trait InvalidConfigurationRequestExceptionException extends js.Object {

  }

  /**
   * <p>The requested action is not valid.</p>
   */
  @js.native
  trait InvalidLoadBalancerActionExceptionException extends js.Object {

  }

  /**
   * <p>The requested scheme is not valid.</p>
   */
  @js.native
  trait InvalidSchemeExceptionException extends js.Object {

  }

  /**
   * <p>The specified security group does not exist.</p>
   */
  @js.native
  trait InvalidSecurityGroupExceptionException extends js.Object {

  }

  /**
   * <p>The specified subnet is out of available addresses.</p>
   */
  @js.native
  trait InvalidSubnetExceptionException extends js.Object {

  }

  /**
   * <p>The specified target does not exist, is not in the same VPC as the target group, or has an unsupported instance type.</p>
   */
  @js.native
  trait InvalidTargetExceptionException extends js.Object {

  }

  object IpAddressTypeEnum {
    val ipv4 = "ipv4"
    val dualstack = "dualstack"

    val values = IndexedSeq(ipv4, dualstack)
  }

  /**
   * <p>Information about an Elastic Load Balancing resource limit for your AWS account.</p>
   */
  @js.native
  trait Limit extends js.Object {
    var Name: js.UndefOr[Name]
    var Max: js.UndefOr[Max]
  }

  object Limit {
    def apply(
      Name: js.UndefOr[Name] = js.undefined,
      Max: js.UndefOr[Max] = js.undefined): Limit = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Max" -> Max.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Limit]
    }
  }

  /**
   * <p>Information about a listener.</p>
   */
  @js.native
  trait Listener extends js.Object {
    var ListenerArn: js.UndefOr[ListenerArn]
    var DefaultActions: js.UndefOr[Actions]
    var Port: js.UndefOr[Port]
    var SslPolicy: js.UndefOr[SslPolicyName]
    var Protocol: js.UndefOr[ProtocolEnum]
    var LoadBalancerArn: js.UndefOr[LoadBalancerArn]
    var Certificates: js.UndefOr[CertificateList]
  }

  object Listener {
    def apply(
      ListenerArn: js.UndefOr[ListenerArn] = js.undefined,
      DefaultActions: js.UndefOr[Actions] = js.undefined,
      Port: js.UndefOr[Port] = js.undefined,
      SslPolicy: js.UndefOr[SslPolicyName] = js.undefined,
      Protocol: js.UndefOr[ProtocolEnum] = js.undefined,
      LoadBalancerArn: js.UndefOr[LoadBalancerArn] = js.undefined,
      Certificates: js.UndefOr[CertificateList] = js.undefined): Listener = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ListenerArn" -> ListenerArn.map { x => x.asInstanceOf[js.Any] },
        "DefaultActions" -> DefaultActions.map { x => x.asInstanceOf[js.Any] },
        "Port" -> Port.map { x => x.asInstanceOf[js.Any] },
        "SslPolicy" -> SslPolicy.map { x => x.asInstanceOf[js.Any] },
        "Protocol" -> Protocol.map { x => x.asInstanceOf[js.Any] },
        "LoadBalancerArn" -> LoadBalancerArn.map { x => x.asInstanceOf[js.Any] },
        "Certificates" -> Certificates.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Listener]
    }
  }

  /**
   * <p>The specified listener does not exist.</p>
   */
  @js.native
  trait ListenerNotFoundExceptionException extends js.Object {

  }

  /**
   * <p>Information about a load balancer.</p>
   */
  @js.native
  trait LoadBalancer extends js.Object {
    var CreatedTime: js.UndefOr[CreatedTime]
    var CanonicalHostedZoneId: js.UndefOr[CanonicalHostedZoneId]
    var SecurityGroups: js.UndefOr[SecurityGroups]
    var LoadBalancerName: js.UndefOr[LoadBalancerName]
    var IpAddressType: js.UndefOr[IpAddressType]
    var State: js.UndefOr[LoadBalancerState]
    var Scheme: js.UndefOr[LoadBalancerSchemeEnum]
    var DNSName: js.UndefOr[DNSName]
    var LoadBalancerArn: js.UndefOr[LoadBalancerArn]
    var Type: js.UndefOr[LoadBalancerTypeEnum]
    var AvailabilityZones: js.UndefOr[AvailabilityZones]
    var VpcId: js.UndefOr[VpcId]
  }

  object LoadBalancer {
    def apply(
      CreatedTime: js.UndefOr[CreatedTime] = js.undefined,
      CanonicalHostedZoneId: js.UndefOr[CanonicalHostedZoneId] = js.undefined,
      SecurityGroups: js.UndefOr[SecurityGroups] = js.undefined,
      LoadBalancerName: js.UndefOr[LoadBalancerName] = js.undefined,
      IpAddressType: js.UndefOr[IpAddressType] = js.undefined,
      State: js.UndefOr[LoadBalancerState] = js.undefined,
      Scheme: js.UndefOr[LoadBalancerSchemeEnum] = js.undefined,
      DNSName: js.UndefOr[DNSName] = js.undefined,
      LoadBalancerArn: js.UndefOr[LoadBalancerArn] = js.undefined,
      Type: js.UndefOr[LoadBalancerTypeEnum] = js.undefined,
      AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined,
      VpcId: js.UndefOr[VpcId] = js.undefined): LoadBalancer = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreatedTime" -> CreatedTime.map { x => x.asInstanceOf[js.Any] },
        "CanonicalHostedZoneId" -> CanonicalHostedZoneId.map { x => x.asInstanceOf[js.Any] },
        "SecurityGroups" -> SecurityGroups.map { x => x.asInstanceOf[js.Any] },
        "LoadBalancerName" -> LoadBalancerName.map { x => x.asInstanceOf[js.Any] },
        "IpAddressType" -> IpAddressType.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] },
        "Scheme" -> Scheme.map { x => x.asInstanceOf[js.Any] },
        "DNSName" -> DNSName.map { x => x.asInstanceOf[js.Any] },
        "LoadBalancerArn" -> LoadBalancerArn.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] },
        "AvailabilityZones" -> AvailabilityZones.map { x => x.asInstanceOf[js.Any] },
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LoadBalancer]
    }
  }

  /**
   * <p>Information about a static IP address for a load balancer.</p>
   */
  @js.native
  trait LoadBalancerAddress extends js.Object {
    var IpAddress: js.UndefOr[IpAddress]
    var AllocationId: js.UndefOr[AllocationId]
  }

  object LoadBalancerAddress {
    def apply(
      IpAddress: js.UndefOr[IpAddress] = js.undefined,
      AllocationId: js.UndefOr[AllocationId] = js.undefined): LoadBalancerAddress = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IpAddress" -> IpAddress.map { x => x.asInstanceOf[js.Any] },
        "AllocationId" -> AllocationId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LoadBalancerAddress]
    }
  }

  /**
   * <p>Information about a load balancer attribute.</p>
   */
  @js.native
  trait LoadBalancerAttribute extends js.Object {
    var Key: js.UndefOr[LoadBalancerAttributeKey]
    var Value: js.UndefOr[LoadBalancerAttributeValue]
  }

  object LoadBalancerAttribute {
    def apply(
      Key: js.UndefOr[LoadBalancerAttributeKey] = js.undefined,
      Value: js.UndefOr[LoadBalancerAttributeValue] = js.undefined): LoadBalancerAttribute = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LoadBalancerAttribute]
    }
  }

  /**
   * <p>The specified load balancer does not exist.</p>
   */
  @js.native
  trait LoadBalancerNotFoundExceptionException extends js.Object {

  }

  object LoadBalancerSchemeEnumEnum {
    val `internet-facing` = "internet-facing"
    val internal = "internal"

    val values = IndexedSeq(`internet-facing`, internal)
  }

  /**
   * <p>Information about the state of the load balancer.</p>
   */
  @js.native
  trait LoadBalancerState extends js.Object {
    var Code: js.UndefOr[LoadBalancerStateEnum]
    var Reason: js.UndefOr[StateReason]
  }

  object LoadBalancerState {
    def apply(
      Code: js.UndefOr[LoadBalancerStateEnum] = js.undefined,
      Reason: js.UndefOr[StateReason] = js.undefined): LoadBalancerState = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Code" -> Code.map { x => x.asInstanceOf[js.Any] },
        "Reason" -> Reason.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LoadBalancerState]
    }
  }

  object LoadBalancerStateEnumEnum {
    val active = "active"
    val provisioning = "provisioning"
    val active_impaired = "active_impaired"
    val failed = "failed"

    val values = IndexedSeq(active, provisioning, active_impaired, failed)
  }

  object LoadBalancerTypeEnumEnum {
    val application = "application"
    val network = "network"

    val values = IndexedSeq(application, network)
  }

  /**
   * <p>Information to use when checking for a successful response from a target.</p>
   */
  @js.native
  trait Matcher extends js.Object {
    var HttpCode: js.UndefOr[HttpCode]
  }

  object Matcher {
    def apply(
      HttpCode: js.UndefOr[HttpCode] = js.undefined): Matcher = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HttpCode" -> HttpCode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Matcher]
    }
  }

  @js.native
  trait ModifyListenerInput extends js.Object {
    var ListenerArn: js.UndefOr[ListenerArn]
    var DefaultActions: js.UndefOr[Actions]
    var Port: js.UndefOr[Port]
    var SslPolicy: js.UndefOr[SslPolicyName]
    var Protocol: js.UndefOr[ProtocolEnum]
    var Certificates: js.UndefOr[CertificateList]
  }

  object ModifyListenerInput {
    def apply(
      ListenerArn: js.UndefOr[ListenerArn] = js.undefined,
      DefaultActions: js.UndefOr[Actions] = js.undefined,
      Port: js.UndefOr[Port] = js.undefined,
      SslPolicy: js.UndefOr[SslPolicyName] = js.undefined,
      Protocol: js.UndefOr[ProtocolEnum] = js.undefined,
      Certificates: js.UndefOr[CertificateList] = js.undefined): ModifyListenerInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ListenerArn" -> ListenerArn.map { x => x.asInstanceOf[js.Any] },
        "DefaultActions" -> DefaultActions.map { x => x.asInstanceOf[js.Any] },
        "Port" -> Port.map { x => x.asInstanceOf[js.Any] },
        "SslPolicy" -> SslPolicy.map { x => x.asInstanceOf[js.Any] },
        "Protocol" -> Protocol.map { x => x.asInstanceOf[js.Any] },
        "Certificates" -> Certificates.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyListenerInput]
    }
  }

  @js.native
  trait ModifyListenerOutput extends js.Object {
    var Listeners: js.UndefOr[Listeners]
  }

  object ModifyListenerOutput {
    def apply(
      Listeners: js.UndefOr[Listeners] = js.undefined): ModifyListenerOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Listeners" -> Listeners.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyListenerOutput]
    }
  }

  @js.native
  trait ModifyLoadBalancerAttributesInput extends js.Object {
    var LoadBalancerArn: js.UndefOr[LoadBalancerArn]
    var Attributes: js.UndefOr[LoadBalancerAttributes]
  }

  object ModifyLoadBalancerAttributesInput {
    def apply(
      LoadBalancerArn: js.UndefOr[LoadBalancerArn] = js.undefined,
      Attributes: js.UndefOr[LoadBalancerAttributes] = js.undefined): ModifyLoadBalancerAttributesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LoadBalancerArn" -> LoadBalancerArn.map { x => x.asInstanceOf[js.Any] },
        "Attributes" -> Attributes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyLoadBalancerAttributesInput]
    }
  }

  @js.native
  trait ModifyLoadBalancerAttributesOutput extends js.Object {
    var Attributes: js.UndefOr[LoadBalancerAttributes]
  }

  object ModifyLoadBalancerAttributesOutput {
    def apply(
      Attributes: js.UndefOr[LoadBalancerAttributes] = js.undefined): ModifyLoadBalancerAttributesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Attributes" -> Attributes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyLoadBalancerAttributesOutput]
    }
  }

  @js.native
  trait ModifyRuleInput extends js.Object {
    var RuleArn: js.UndefOr[RuleArn]
    var Conditions: js.UndefOr[RuleConditionList]
    var Actions: js.UndefOr[Actions]
  }

  object ModifyRuleInput {
    def apply(
      RuleArn: js.UndefOr[RuleArn] = js.undefined,
      Conditions: js.UndefOr[RuleConditionList] = js.undefined,
      Actions: js.UndefOr[Actions] = js.undefined): ModifyRuleInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RuleArn" -> RuleArn.map { x => x.asInstanceOf[js.Any] },
        "Conditions" -> Conditions.map { x => x.asInstanceOf[js.Any] },
        "Actions" -> Actions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyRuleInput]
    }
  }

  @js.native
  trait ModifyRuleOutput extends js.Object {
    var Rules: js.UndefOr[Rules]
  }

  object ModifyRuleOutput {
    def apply(
      Rules: js.UndefOr[Rules] = js.undefined): ModifyRuleOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Rules" -> Rules.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyRuleOutput]
    }
  }

  @js.native
  trait ModifyTargetGroupAttributesInput extends js.Object {
    var TargetGroupArn: js.UndefOr[TargetGroupArn]
    var Attributes: js.UndefOr[TargetGroupAttributes]
  }

  object ModifyTargetGroupAttributesInput {
    def apply(
      TargetGroupArn: js.UndefOr[TargetGroupArn] = js.undefined,
      Attributes: js.UndefOr[TargetGroupAttributes] = js.undefined): ModifyTargetGroupAttributesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TargetGroupArn" -> TargetGroupArn.map { x => x.asInstanceOf[js.Any] },
        "Attributes" -> Attributes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyTargetGroupAttributesInput]
    }
  }

  @js.native
  trait ModifyTargetGroupAttributesOutput extends js.Object {
    var Attributes: js.UndefOr[TargetGroupAttributes]
  }

  object ModifyTargetGroupAttributesOutput {
    def apply(
      Attributes: js.UndefOr[TargetGroupAttributes] = js.undefined): ModifyTargetGroupAttributesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Attributes" -> Attributes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyTargetGroupAttributesOutput]
    }
  }

  @js.native
  trait ModifyTargetGroupInput extends js.Object {
    var HealthCheckPort: js.UndefOr[HealthCheckPort]
    var UnhealthyThresholdCount: js.UndefOr[HealthCheckThresholdCount]
    var HealthyThresholdCount: js.UndefOr[HealthCheckThresholdCount]
    var TargetGroupArn: js.UndefOr[TargetGroupArn]
    var HealthCheckProtocol: js.UndefOr[ProtocolEnum]
    var HealthCheckIntervalSeconds: js.UndefOr[HealthCheckIntervalSeconds]
    var HealthCheckTimeoutSeconds: js.UndefOr[HealthCheckTimeoutSeconds]
    var HealthCheckPath: js.UndefOr[Path]
    var Matcher: js.UndefOr[Matcher]
  }

  object ModifyTargetGroupInput {
    def apply(
      HealthCheckPort: js.UndefOr[HealthCheckPort] = js.undefined,
      UnhealthyThresholdCount: js.UndefOr[HealthCheckThresholdCount] = js.undefined,
      HealthyThresholdCount: js.UndefOr[HealthCheckThresholdCount] = js.undefined,
      TargetGroupArn: js.UndefOr[TargetGroupArn] = js.undefined,
      HealthCheckProtocol: js.UndefOr[ProtocolEnum] = js.undefined,
      HealthCheckIntervalSeconds: js.UndefOr[HealthCheckIntervalSeconds] = js.undefined,
      HealthCheckTimeoutSeconds: js.UndefOr[HealthCheckTimeoutSeconds] = js.undefined,
      HealthCheckPath: js.UndefOr[Path] = js.undefined,
      Matcher: js.UndefOr[Matcher] = js.undefined): ModifyTargetGroupInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HealthCheckPort" -> HealthCheckPort.map { x => x.asInstanceOf[js.Any] },
        "UnhealthyThresholdCount" -> UnhealthyThresholdCount.map { x => x.asInstanceOf[js.Any] },
        "HealthyThresholdCount" -> HealthyThresholdCount.map { x => x.asInstanceOf[js.Any] },
        "TargetGroupArn" -> TargetGroupArn.map { x => x.asInstanceOf[js.Any] },
        "HealthCheckProtocol" -> HealthCheckProtocol.map { x => x.asInstanceOf[js.Any] },
        "HealthCheckIntervalSeconds" -> HealthCheckIntervalSeconds.map { x => x.asInstanceOf[js.Any] },
        "HealthCheckTimeoutSeconds" -> HealthCheckTimeoutSeconds.map { x => x.asInstanceOf[js.Any] },
        "HealthCheckPath" -> HealthCheckPath.map { x => x.asInstanceOf[js.Any] },
        "Matcher" -> Matcher.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyTargetGroupInput]
    }
  }

  @js.native
  trait ModifyTargetGroupOutput extends js.Object {
    var TargetGroups: js.UndefOr[TargetGroups]
  }

  object ModifyTargetGroupOutput {
    def apply(
      TargetGroups: js.UndefOr[TargetGroups] = js.undefined): ModifyTargetGroupOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TargetGroups" -> TargetGroups.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyTargetGroupOutput]
    }
  }

  /**
   * <p>This operation is not allowed.</p>
   */
  @js.native
  trait OperationNotPermittedExceptionException extends js.Object {

  }

  /**
   * <p>The specified priority is in use.</p>
   */
  @js.native
  trait PriorityInUseExceptionException extends js.Object {

  }

  object ProtocolEnumEnum {
    val HTTP = "HTTP"
    val HTTPS = "HTTPS"
    val TCP = "TCP"

    val values = IndexedSeq(HTTP, HTTPS, TCP)
  }

  /**
   * <p>Information about a redirect action.</p> <p>A URI consists of the following components: protocol://hostname:port/path?query. You must modify at least one of the following components to avoid a redirect loop: protocol, hostname, port, or path. Any components that you do not modify retain their original values.</p> <p>You can reuse URI components using the following reserved keywords:</p> <ul> <li> <p>#{protocol}</p> </li> <li> <p>#{host}</p> </li> <li> <p>#{port}</p> </li> <li> <p>#{path} (the leading "/" is removed)</p> </li> <li> <p>#{query}</p> </li> </ul> <p>For example, you can change the path to "/new/#{path}", the hostname to "example.#{host}", or the query to "#{query}&amp;value=xyz".</p>
   */
  @js.native
  trait RedirectActionConfig extends js.Object {
    var Path: js.UndefOr[RedirectActionPath]
    var StatusCode: js.UndefOr[RedirectActionStatusCodeEnum]
    var Query: js.UndefOr[RedirectActionQuery]
    var Port: js.UndefOr[RedirectActionPort]
    var Protocol: js.UndefOr[RedirectActionProtocol]
    var Host: js.UndefOr[RedirectActionHost]
  }

  object RedirectActionConfig {
    def apply(
      Path: js.UndefOr[RedirectActionPath] = js.undefined,
      StatusCode: js.UndefOr[RedirectActionStatusCodeEnum] = js.undefined,
      Query: js.UndefOr[RedirectActionQuery] = js.undefined,
      Port: js.UndefOr[RedirectActionPort] = js.undefined,
      Protocol: js.UndefOr[RedirectActionProtocol] = js.undefined,
      Host: js.UndefOr[RedirectActionHost] = js.undefined): RedirectActionConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Path" -> Path.map { x => x.asInstanceOf[js.Any] },
        "StatusCode" -> StatusCode.map { x => x.asInstanceOf[js.Any] },
        "Query" -> Query.map { x => x.asInstanceOf[js.Any] },
        "Port" -> Port.map { x => x.asInstanceOf[js.Any] },
        "Protocol" -> Protocol.map { x => x.asInstanceOf[js.Any] },
        "Host" -> Host.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RedirectActionConfig]
    }
  }

  object RedirectActionStatusCodeEnumEnum {
    val HTTP_301 = "HTTP_301"
    val HTTP_302 = "HTTP_302"

    val values = IndexedSeq(HTTP_301, HTTP_302)
  }

  @js.native
  trait RegisterTargetsInput extends js.Object {
    var TargetGroupArn: js.UndefOr[TargetGroupArn]
    var Targets: js.UndefOr[TargetDescriptions]
  }

  object RegisterTargetsInput {
    def apply(
      TargetGroupArn: js.UndefOr[TargetGroupArn] = js.undefined,
      Targets: js.UndefOr[TargetDescriptions] = js.undefined): RegisterTargetsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TargetGroupArn" -> TargetGroupArn.map { x => x.asInstanceOf[js.Any] },
        "Targets" -> Targets.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterTargetsInput]
    }
  }

  @js.native
  trait RegisterTargetsOutput extends js.Object {

  }

  object RegisterTargetsOutput {
    def apply(): RegisterTargetsOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterTargetsOutput]
    }
  }

  @js.native
  trait RemoveListenerCertificatesInput extends js.Object {
    var ListenerArn: js.UndefOr[ListenerArn]
    var Certificates: js.UndefOr[CertificateList]
  }

  object RemoveListenerCertificatesInput {
    def apply(
      ListenerArn: js.UndefOr[ListenerArn] = js.undefined,
      Certificates: js.UndefOr[CertificateList] = js.undefined): RemoveListenerCertificatesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ListenerArn" -> ListenerArn.map { x => x.asInstanceOf[js.Any] },
        "Certificates" -> Certificates.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveListenerCertificatesInput]
    }
  }

  @js.native
  trait RemoveListenerCertificatesOutput extends js.Object {

  }

  object RemoveListenerCertificatesOutput {
    def apply(): RemoveListenerCertificatesOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveListenerCertificatesOutput]
    }
  }

  @js.native
  trait RemoveTagsInput extends js.Object {
    var ResourceArns: js.UndefOr[ResourceArns]
    var TagKeys: js.UndefOr[TagKeys]
  }

  object RemoveTagsInput {
    def apply(
      ResourceArns: js.UndefOr[ResourceArns] = js.undefined,
      TagKeys: js.UndefOr[TagKeys] = js.undefined): RemoveTagsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArns" -> ResourceArns.map { x => x.asInstanceOf[js.Any] },
        "TagKeys" -> TagKeys.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveTagsInput]
    }
  }

  @js.native
  trait RemoveTagsOutput extends js.Object {

  }

  object RemoveTagsOutput {
    def apply(): RemoveTagsOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveTagsOutput]
    }
  }

  /**
   * <p>A specified resource is in use.</p>
   */
  @js.native
  trait ResourceInUseExceptionException extends js.Object {

  }

  /**
   * <p>Information about a rule.</p>
   */
  @js.native
  trait Rule extends js.Object {
    var Priority: js.UndefOr[String]
    var Conditions: js.UndefOr[RuleConditionList]
    var RuleArn: js.UndefOr[RuleArn]
    var Actions: js.UndefOr[Actions]
    var IsDefault: js.UndefOr[IsDefault]
  }

  object Rule {
    def apply(
      Priority: js.UndefOr[String] = js.undefined,
      Conditions: js.UndefOr[RuleConditionList] = js.undefined,
      RuleArn: js.UndefOr[RuleArn] = js.undefined,
      Actions: js.UndefOr[Actions] = js.undefined,
      IsDefault: js.UndefOr[IsDefault] = js.undefined): Rule = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Priority" -> Priority.map { x => x.asInstanceOf[js.Any] },
        "Conditions" -> Conditions.map { x => x.asInstanceOf[js.Any] },
        "RuleArn" -> RuleArn.map { x => x.asInstanceOf[js.Any] },
        "Actions" -> Actions.map { x => x.asInstanceOf[js.Any] },
        "IsDefault" -> IsDefault.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Rule]
    }
  }

  /**
   * <p>Information about a condition for a rule.</p>
   */
  @js.native
  trait RuleCondition extends js.Object {
    var Field: js.UndefOr[ConditionFieldName]
    var Values: js.UndefOr[ListOfString]
  }

  object RuleCondition {
    def apply(
      Field: js.UndefOr[ConditionFieldName] = js.undefined,
      Values: js.UndefOr[ListOfString] = js.undefined): RuleCondition = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Field" -> Field.map { x => x.asInstanceOf[js.Any] },
        "Values" -> Values.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RuleCondition]
    }
  }

  /**
   * <p>The specified rule does not exist.</p>
   */
  @js.native
  trait RuleNotFoundExceptionException extends js.Object {

  }

  /**
   * <p>Information about the priorities for the rules for a listener.</p>
   */
  @js.native
  trait RulePriorityPair extends js.Object {
    var RuleArn: js.UndefOr[RuleArn]
    var Priority: js.UndefOr[RulePriority]
  }

  object RulePriorityPair {
    def apply(
      RuleArn: js.UndefOr[RuleArn] = js.undefined,
      Priority: js.UndefOr[RulePriority] = js.undefined): RulePriorityPair = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RuleArn" -> RuleArn.map { x => x.asInstanceOf[js.Any] },
        "Priority" -> Priority.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RulePriorityPair]
    }
  }

  /**
   * <p>The specified SSL policy does not exist.</p>
   */
  @js.native
  trait SSLPolicyNotFoundExceptionException extends js.Object {

  }

  @js.native
  trait SetIpAddressTypeInput extends js.Object {
    var LoadBalancerArn: js.UndefOr[LoadBalancerArn]
    var IpAddressType: js.UndefOr[IpAddressType]
  }

  object SetIpAddressTypeInput {
    def apply(
      LoadBalancerArn: js.UndefOr[LoadBalancerArn] = js.undefined,
      IpAddressType: js.UndefOr[IpAddressType] = js.undefined): SetIpAddressTypeInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LoadBalancerArn" -> LoadBalancerArn.map { x => x.asInstanceOf[js.Any] },
        "IpAddressType" -> IpAddressType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetIpAddressTypeInput]
    }
  }

  @js.native
  trait SetIpAddressTypeOutput extends js.Object {
    var IpAddressType: js.UndefOr[IpAddressType]
  }

  object SetIpAddressTypeOutput {
    def apply(
      IpAddressType: js.UndefOr[IpAddressType] = js.undefined): SetIpAddressTypeOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IpAddressType" -> IpAddressType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetIpAddressTypeOutput]
    }
  }

  @js.native
  trait SetRulePrioritiesInput extends js.Object {
    var RulePriorities: js.UndefOr[RulePriorityList]
  }

  object SetRulePrioritiesInput {
    def apply(
      RulePriorities: js.UndefOr[RulePriorityList] = js.undefined): SetRulePrioritiesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RulePriorities" -> RulePriorities.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetRulePrioritiesInput]
    }
  }

  @js.native
  trait SetRulePrioritiesOutput extends js.Object {
    var Rules: js.UndefOr[Rules]
  }

  object SetRulePrioritiesOutput {
    def apply(
      Rules: js.UndefOr[Rules] = js.undefined): SetRulePrioritiesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Rules" -> Rules.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetRulePrioritiesOutput]
    }
  }

  @js.native
  trait SetSecurityGroupsInput extends js.Object {
    var LoadBalancerArn: js.UndefOr[LoadBalancerArn]
    var SecurityGroups: js.UndefOr[SecurityGroups]
  }

  object SetSecurityGroupsInput {
    def apply(
      LoadBalancerArn: js.UndefOr[LoadBalancerArn] = js.undefined,
      SecurityGroups: js.UndefOr[SecurityGroups] = js.undefined): SetSecurityGroupsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LoadBalancerArn" -> LoadBalancerArn.map { x => x.asInstanceOf[js.Any] },
        "SecurityGroups" -> SecurityGroups.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetSecurityGroupsInput]
    }
  }

  @js.native
  trait SetSecurityGroupsOutput extends js.Object {
    var SecurityGroupIds: js.UndefOr[SecurityGroups]
  }

  object SetSecurityGroupsOutput {
    def apply(
      SecurityGroupIds: js.UndefOr[SecurityGroups] = js.undefined): SetSecurityGroupsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SecurityGroupIds" -> SecurityGroupIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetSecurityGroupsOutput]
    }
  }

  @js.native
  trait SetSubnetsInput extends js.Object {
    var LoadBalancerArn: js.UndefOr[LoadBalancerArn]
    var Subnets: js.UndefOr[Subnets]
    var SubnetMappings: js.UndefOr[SubnetMappings]
  }

  object SetSubnetsInput {
    def apply(
      LoadBalancerArn: js.UndefOr[LoadBalancerArn] = js.undefined,
      Subnets: js.UndefOr[Subnets] = js.undefined,
      SubnetMappings: js.UndefOr[SubnetMappings] = js.undefined): SetSubnetsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LoadBalancerArn" -> LoadBalancerArn.map { x => x.asInstanceOf[js.Any] },
        "Subnets" -> Subnets.map { x => x.asInstanceOf[js.Any] },
        "SubnetMappings" -> SubnetMappings.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetSubnetsInput]
    }
  }

  @js.native
  trait SetSubnetsOutput extends js.Object {
    var AvailabilityZones: js.UndefOr[AvailabilityZones]
  }

  object SetSubnetsOutput {
    def apply(
      AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined): SetSubnetsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AvailabilityZones" -> AvailabilityZones.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetSubnetsOutput]
    }
  }

  /**
   * <p>Information about a policy used for SSL negotiation.</p>
   */
  @js.native
  trait SslPolicy extends js.Object {
    var SslProtocols: js.UndefOr[SslProtocols]
    var Ciphers: js.UndefOr[Ciphers]
    var Name: js.UndefOr[SslPolicyName]
  }

  object SslPolicy {
    def apply(
      SslProtocols: js.UndefOr[SslProtocols] = js.undefined,
      Ciphers: js.UndefOr[Ciphers] = js.undefined,
      Name: js.UndefOr[SslPolicyName] = js.undefined): SslPolicy = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SslProtocols" -> SslProtocols.map { x => x.asInstanceOf[js.Any] },
        "Ciphers" -> Ciphers.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SslPolicy]
    }
  }

  /**
   * <p>Information about a subnet mapping.</p>
   */
  @js.native
  trait SubnetMapping extends js.Object {
    var SubnetId: js.UndefOr[SubnetId]
    var AllocationId: js.UndefOr[AllocationId]
  }

  object SubnetMapping {
    def apply(
      SubnetId: js.UndefOr[SubnetId] = js.undefined,
      AllocationId: js.UndefOr[AllocationId] = js.undefined): SubnetMapping = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SubnetId" -> SubnetId.map { x => x.asInstanceOf[js.Any] },
        "AllocationId" -> AllocationId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SubnetMapping]
    }
  }

  /**
   * <p>The specified subnet does not exist.</p>
   */
  @js.native
  trait SubnetNotFoundExceptionException extends js.Object {

  }

  /**
   * <p>Information about a tag.</p>
   */
  @js.native
  trait Tag extends js.Object {
    var Key: js.UndefOr[TagKey]
    var Value: js.UndefOr[TagValue]
  }

  object Tag {
    def apply(
      Key: js.UndefOr[TagKey] = js.undefined,
      Value: js.UndefOr[TagValue] = js.undefined): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  /**
   * <p>The tags associated with a resource.</p>
   */
  @js.native
  trait TagDescription extends js.Object {
    var ResourceArn: js.UndefOr[ResourceArn]
    var Tags: js.UndefOr[TagList]
  }

  object TagDescription {
    def apply(
      ResourceArn: js.UndefOr[ResourceArn] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): TagDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagDescription]
    }
  }

  /**
   * <p>Information about a target.</p>
   */
  @js.native
  trait TargetDescription extends js.Object {
    var Id: js.UndefOr[TargetId]
    var Port: js.UndefOr[Port]
    var AvailabilityZone: js.UndefOr[ZoneName]
  }

  object TargetDescription {
    def apply(
      Id: js.UndefOr[TargetId] = js.undefined,
      Port: js.UndefOr[Port] = js.undefined,
      AvailabilityZone: js.UndefOr[ZoneName] = js.undefined): TargetDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Port" -> Port.map { x => x.asInstanceOf[js.Any] },
        "AvailabilityZone" -> AvailabilityZone.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TargetDescription]
    }
  }

  /**
   * <p>Information about a target group.</p>
   */
  @js.native
  trait TargetGroup extends js.Object {
    var HealthCheckPort: js.UndefOr[HealthCheckPort]
    var TargetType: js.UndefOr[TargetTypeEnum]
    var TargetGroupName: js.UndefOr[TargetGroupName]
    var LoadBalancerArns: js.UndefOr[LoadBalancerArns]
    var UnhealthyThresholdCount: js.UndefOr[HealthCheckThresholdCount]
    var HealthyThresholdCount: js.UndefOr[HealthCheckThresholdCount]
    var TargetGroupArn: js.UndefOr[TargetGroupArn]
    var HealthCheckProtocol: js.UndefOr[ProtocolEnum]
    var HealthCheckIntervalSeconds: js.UndefOr[HealthCheckIntervalSeconds]
    var HealthCheckTimeoutSeconds: js.UndefOr[HealthCheckTimeoutSeconds]
    var Port: js.UndefOr[Port]
    var HealthCheckPath: js.UndefOr[Path]
    var Protocol: js.UndefOr[ProtocolEnum]
    var Matcher: js.UndefOr[Matcher]
    var VpcId: js.UndefOr[VpcId]
  }

  object TargetGroup {
    def apply(
      HealthCheckPort: js.UndefOr[HealthCheckPort] = js.undefined,
      TargetType: js.UndefOr[TargetTypeEnum] = js.undefined,
      TargetGroupName: js.UndefOr[TargetGroupName] = js.undefined,
      LoadBalancerArns: js.UndefOr[LoadBalancerArns] = js.undefined,
      UnhealthyThresholdCount: js.UndefOr[HealthCheckThresholdCount] = js.undefined,
      HealthyThresholdCount: js.UndefOr[HealthCheckThresholdCount] = js.undefined,
      TargetGroupArn: js.UndefOr[TargetGroupArn] = js.undefined,
      HealthCheckProtocol: js.UndefOr[ProtocolEnum] = js.undefined,
      HealthCheckIntervalSeconds: js.UndefOr[HealthCheckIntervalSeconds] = js.undefined,
      HealthCheckTimeoutSeconds: js.UndefOr[HealthCheckTimeoutSeconds] = js.undefined,
      Port: js.UndefOr[Port] = js.undefined,
      HealthCheckPath: js.UndefOr[Path] = js.undefined,
      Protocol: js.UndefOr[ProtocolEnum] = js.undefined,
      Matcher: js.UndefOr[Matcher] = js.undefined,
      VpcId: js.UndefOr[VpcId] = js.undefined): TargetGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HealthCheckPort" -> HealthCheckPort.map { x => x.asInstanceOf[js.Any] },
        "TargetType" -> TargetType.map { x => x.asInstanceOf[js.Any] },
        "TargetGroupName" -> TargetGroupName.map { x => x.asInstanceOf[js.Any] },
        "LoadBalancerArns" -> LoadBalancerArns.map { x => x.asInstanceOf[js.Any] },
        "UnhealthyThresholdCount" -> UnhealthyThresholdCount.map { x => x.asInstanceOf[js.Any] },
        "HealthyThresholdCount" -> HealthyThresholdCount.map { x => x.asInstanceOf[js.Any] },
        "TargetGroupArn" -> TargetGroupArn.map { x => x.asInstanceOf[js.Any] },
        "HealthCheckProtocol" -> HealthCheckProtocol.map { x => x.asInstanceOf[js.Any] },
        "HealthCheckIntervalSeconds" -> HealthCheckIntervalSeconds.map { x => x.asInstanceOf[js.Any] },
        "HealthCheckTimeoutSeconds" -> HealthCheckTimeoutSeconds.map { x => x.asInstanceOf[js.Any] },
        "Port" -> Port.map { x => x.asInstanceOf[js.Any] },
        "HealthCheckPath" -> HealthCheckPath.map { x => x.asInstanceOf[js.Any] },
        "Protocol" -> Protocol.map { x => x.asInstanceOf[js.Any] },
        "Matcher" -> Matcher.map { x => x.asInstanceOf[js.Any] },
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TargetGroup]
    }
  }

  /**
   * <p>You've reached the limit on the number of load balancers per target group.</p>
   */
  @js.native
  trait TargetGroupAssociationLimitExceptionException extends js.Object {

  }

  /**
   * <p>Information about a target group attribute.</p>
   */
  @js.native
  trait TargetGroupAttribute extends js.Object {
    var Key: js.UndefOr[TargetGroupAttributeKey]
    var Value: js.UndefOr[TargetGroupAttributeValue]
  }

  object TargetGroupAttribute {
    def apply(
      Key: js.UndefOr[TargetGroupAttributeKey] = js.undefined,
      Value: js.UndefOr[TargetGroupAttributeValue] = js.undefined): TargetGroupAttribute = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TargetGroupAttribute]
    }
  }

  /**
   * <p>The specified target group does not exist.</p>
   */
  @js.native
  trait TargetGroupNotFoundExceptionException extends js.Object {

  }

  /**
   * <p>Information about the current health of a target.</p>
   */
  @js.native
  trait TargetHealth extends js.Object {
    var State: js.UndefOr[TargetHealthStateEnum]
    var Reason: js.UndefOr[TargetHealthReasonEnum]
    var Description: js.UndefOr[Description]
  }

  object TargetHealth {
    def apply(
      State: js.UndefOr[TargetHealthStateEnum] = js.undefined,
      Reason: js.UndefOr[TargetHealthReasonEnum] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined): TargetHealth = {
      val _fields = IndexedSeq[(String, js.Any)](
        "State" -> State.map { x => x.asInstanceOf[js.Any] },
        "Reason" -> Reason.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TargetHealth]
    }
  }

  /**
   * <p>Information about the health of a target.</p>
   */
  @js.native
  trait TargetHealthDescription extends js.Object {
    var Target: js.UndefOr[TargetDescription]
    var HealthCheckPort: js.UndefOr[HealthCheckPort]
    var TargetHealth: js.UndefOr[TargetHealth]
  }

  object TargetHealthDescription {
    def apply(
      Target: js.UndefOr[TargetDescription] = js.undefined,
      HealthCheckPort: js.UndefOr[HealthCheckPort] = js.undefined,
      TargetHealth: js.UndefOr[TargetHealth] = js.undefined): TargetHealthDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Target" -> Target.map { x => x.asInstanceOf[js.Any] },
        "HealthCheckPort" -> HealthCheckPort.map { x => x.asInstanceOf[js.Any] },
        "TargetHealth" -> TargetHealth.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TargetHealthDescription]
    }
  }

  object TargetHealthReasonEnumEnum {
    val `Elb.RegistrationInProgress` = "Elb.RegistrationInProgress"
    val `Elb.InitialHealthChecking` = "Elb.InitialHealthChecking"
    val `Target.ResponseCodeMismatch` = "Target.ResponseCodeMismatch"
    val `Target.Timeout` = "Target.Timeout"
    val `Target.FailedHealthChecks` = "Target.FailedHealthChecks"
    val `Target.NotRegistered` = "Target.NotRegistered"
    val `Target.NotInUse` = "Target.NotInUse"
    val `Target.DeregistrationInProgress` = "Target.DeregistrationInProgress"
    val `Target.InvalidState` = "Target.InvalidState"
    val `Target.IpUnusable` = "Target.IpUnusable"
    val `Elb.InternalError` = "Elb.InternalError"

    val values = IndexedSeq(`Elb.RegistrationInProgress`, `Elb.InitialHealthChecking`, `Target.ResponseCodeMismatch`, `Target.Timeout`, `Target.FailedHealthChecks`, `Target.NotRegistered`, `Target.NotInUse`, `Target.DeregistrationInProgress`, `Target.InvalidState`, `Target.IpUnusable`, `Elb.InternalError`)
  }

  object TargetHealthStateEnumEnum {
    val initial = "initial"
    val healthy = "healthy"
    val unhealthy = "unhealthy"
    val unused = "unused"
    val draining = "draining"
    val unavailable = "unavailable"

    val values = IndexedSeq(initial, healthy, unhealthy, unused, draining, unavailable)
  }

  object TargetTypeEnumEnum {
    val instance = "instance"
    val ip = "ip"

    val values = IndexedSeq(instance, ip)
  }

  /**
   * <p>You've reached the limit on the number of actions per rule.</p>
   */
  @js.native
  trait TooManyActionsExceptionException extends js.Object {

  }

  /**
   * <p>You've reached the limit on the number of certificates per load balancer.</p>
   */
  @js.native
  trait TooManyCertificatesExceptionException extends js.Object {

  }

  /**
   * <p>You've reached the limit on the number of listeners per load balancer.</p>
   */
  @js.native
  trait TooManyListenersExceptionException extends js.Object {

  }

  /**
   * <p>You've reached the limit on the number of load balancers for your AWS account.</p>
   */
  @js.native
  trait TooManyLoadBalancersExceptionException extends js.Object {

  }

  /**
   * <p>You've reached the limit on the number of times a target can be registered with a load balancer.</p>
   */
  @js.native
  trait TooManyRegistrationsForTargetIdExceptionException extends js.Object {

  }

  /**
   * <p>You've reached the limit on the number of rules per load balancer.</p>
   */
  @js.native
  trait TooManyRulesExceptionException extends js.Object {

  }

  /**
   * <p>You've reached the limit on the number of tags per load balancer.</p>
   */
  @js.native
  trait TooManyTagsExceptionException extends js.Object {

  }

  /**
   * <p>You've reached the limit on the number of target groups for your AWS account.</p>
   */
  @js.native
  trait TooManyTargetGroupsExceptionException extends js.Object {

  }

  /**
   * <p>You've reached the limit on the number of targets.</p>
   */
  @js.native
  trait TooManyTargetsExceptionException extends js.Object {

  }

  /**
   * <p>The specified protocol is not supported.</p>
   */
  @js.native
  trait UnsupportedProtocolExceptionException extends js.Object {

  }
}
