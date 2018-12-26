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
  type HealthCheckEnabled = Boolean
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
  class ELBv2() extends js.Object {
    def this(config: AWSConfig) = this()

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
      TargetGroupArn: js.UndefOr[TargetGroupArn] = js.undefined): Action = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Type" -> Type.asInstanceOf[js.Any],
        "AuthenticateCognitoConfig" -> AuthenticateCognitoConfig.map { x => x.asInstanceOf[js.Any] },
        "AuthenticateOidcConfig" -> AuthenticateOidcConfig.map { x => x.asInstanceOf[js.Any] },
        "FixedResponseConfig" -> FixedResponseConfig.map { x => x.asInstanceOf[js.Any] },
        "Order" -> Order.map { x => x.asInstanceOf[js.Any] },
        "RedirectConfig" -> RedirectConfig.map { x => x.asInstanceOf[js.Any] },
        "TargetGroupArn" -> TargetGroupArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var Certificates: CertificateList
    var ListenerArn: ListenerArn
  }

  object AddListenerCertificatesInput {
    def apply(
      Certificates: CertificateList,
      ListenerArn: ListenerArn): AddListenerCertificatesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Certificates" -> Certificates.asInstanceOf[js.Any],
        "ListenerArn" -> ListenerArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
    var ResourceArns: ResourceArns
    var Tags: TagList
  }

  object AddTagsInput {
    def apply(
      ResourceArns: ResourceArns,
      Tags: TagList): AddTagsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArns" -> ResourceArns.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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

  object AuthenticateCognitoActionConditionalBehaviorEnumEnum {
    val deny = "deny"
    val allow = "allow"
    val authenticate = "authenticate"

    val values = IndexedSeq(deny, allow, authenticate)
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
      AuthenticationRequestExtraParams: js.UndefOr[AuthenticateCognitoActionAuthenticationRequestExtraParams] = js.undefined,
      OnUnauthenticatedRequest: js.UndefOr[AuthenticateCognitoActionConditionalBehaviorEnum] = js.undefined,
      Scope: js.UndefOr[AuthenticateCognitoActionScope] = js.undefined,
      SessionCookieName: js.UndefOr[AuthenticateCognitoActionSessionCookieName] = js.undefined,
      SessionTimeout: js.UndefOr[AuthenticateCognitoActionSessionTimeout] = js.undefined): AuthenticateCognitoActionConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UserPoolArn" -> UserPoolArn.asInstanceOf[js.Any],
        "UserPoolClientId" -> UserPoolClientId.asInstanceOf[js.Any],
        "UserPoolDomain" -> UserPoolDomain.asInstanceOf[js.Any],
        "AuthenticationRequestExtraParams" -> AuthenticationRequestExtraParams.map { x => x.asInstanceOf[js.Any] },
        "OnUnauthenticatedRequest" -> OnUnauthenticatedRequest.map { x => x.asInstanceOf[js.Any] },
        "Scope" -> Scope.map { x => x.asInstanceOf[js.Any] },
        "SessionCookieName" -> SessionCookieName.map { x => x.asInstanceOf[js.Any] },
        "SessionTimeout" -> SessionTimeout.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * Request parameters when using an identity provider (IdP) that is compliant with OpenID Connect (OIDC) to authenticate users.
   */
  @js.native
  trait AuthenticateOidcActionConfig extends js.Object {
    var AuthorizationEndpoint: AuthenticateOidcActionAuthorizationEndpoint
    var ClientId: AuthenticateOidcActionClientId
    var ClientSecret: AuthenticateOidcActionClientSecret
    var Issuer: AuthenticateOidcActionIssuer
    var TokenEndpoint: AuthenticateOidcActionTokenEndpoint
    var UserInfoEndpoint: AuthenticateOidcActionUserInfoEndpoint
    var AuthenticationRequestExtraParams: js.UndefOr[AuthenticateOidcActionAuthenticationRequestExtraParams]
    var OnUnauthenticatedRequest: js.UndefOr[AuthenticateOidcActionConditionalBehaviorEnum]
    var Scope: js.UndefOr[AuthenticateOidcActionScope]
    var SessionCookieName: js.UndefOr[AuthenticateOidcActionSessionCookieName]
    var SessionTimeout: js.UndefOr[AuthenticateOidcActionSessionTimeout]
  }

  object AuthenticateOidcActionConfig {
    def apply(
      AuthorizationEndpoint: AuthenticateOidcActionAuthorizationEndpoint,
      ClientId: AuthenticateOidcActionClientId,
      ClientSecret: AuthenticateOidcActionClientSecret,
      Issuer: AuthenticateOidcActionIssuer,
      TokenEndpoint: AuthenticateOidcActionTokenEndpoint,
      UserInfoEndpoint: AuthenticateOidcActionUserInfoEndpoint,
      AuthenticationRequestExtraParams: js.UndefOr[AuthenticateOidcActionAuthenticationRequestExtraParams] = js.undefined,
      OnUnauthenticatedRequest: js.UndefOr[AuthenticateOidcActionConditionalBehaviorEnum] = js.undefined,
      Scope: js.UndefOr[AuthenticateOidcActionScope] = js.undefined,
      SessionCookieName: js.UndefOr[AuthenticateOidcActionSessionCookieName] = js.undefined,
      SessionTimeout: js.UndefOr[AuthenticateOidcActionSessionTimeout] = js.undefined): AuthenticateOidcActionConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AuthorizationEndpoint" -> AuthorizationEndpoint.asInstanceOf[js.Any],
        "ClientId" -> ClientId.asInstanceOf[js.Any],
        "ClientSecret" -> ClientSecret.asInstanceOf[js.Any],
        "Issuer" -> Issuer.asInstanceOf[js.Any],
        "TokenEndpoint" -> TokenEndpoint.asInstanceOf[js.Any],
        "UserInfoEndpoint" -> UserInfoEndpoint.asInstanceOf[js.Any],
        "AuthenticationRequestExtraParams" -> AuthenticationRequestExtraParams.map { x => x.asInstanceOf[js.Any] },
        "OnUnauthenticatedRequest" -> OnUnauthenticatedRequest.map { x => x.asInstanceOf[js.Any] },
        "Scope" -> Scope.map { x => x.asInstanceOf[js.Any] },
        "SessionCookieName" -> SessionCookieName.map { x => x.asInstanceOf[js.Any] },
        "SessionTimeout" -> SessionTimeout.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AuthenticateOidcActionConfig]
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
      ZoneName: js.UndefOr[ZoneName] = js.undefined): AvailabilityZone = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LoadBalancerAddresses" -> LoadBalancerAddresses.map { x => x.asInstanceOf[js.Any] },
        "SubnetId" -> SubnetId.map { x => x.asInstanceOf[js.Any] },
        "ZoneName" -> ZoneName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AvailabilityZone]
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
      IsDefault: js.UndefOr[Default] = js.undefined): Certificate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CertificateArn" -> CertificateArn.map { x => x.asInstanceOf[js.Any] },
        "IsDefault" -> IsDefault.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Certificate]
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
      Priority: js.UndefOr[CipherPriority] = js.undefined): Cipher = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Priority" -> Priority.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Cipher]
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
      SslPolicy: js.UndefOr[SslPolicyName] = js.undefined): CreateListenerInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DefaultActions" -> DefaultActions.asInstanceOf[js.Any],
        "LoadBalancerArn" -> LoadBalancerArn.asInstanceOf[js.Any],
        "Port" -> Port.asInstanceOf[js.Any],
        "Protocol" -> Protocol.asInstanceOf[js.Any],
        "Certificates" -> Certificates.map { x => x.asInstanceOf[js.Any] },
        "SslPolicy" -> SslPolicy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
      Type: js.UndefOr[LoadBalancerTypeEnum] = js.undefined): CreateLoadBalancerInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "IpAddressType" -> IpAddressType.map { x => x.asInstanceOf[js.Any] },
        "Scheme" -> Scheme.map { x => x.asInstanceOf[js.Any] },
        "SecurityGroups" -> SecurityGroups.map { x => x.asInstanceOf[js.Any] },
        "SubnetMappings" -> SubnetMappings.map { x => x.asInstanceOf[js.Any] },
        "Subnets" -> Subnets.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
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
      Priority: RulePriority): CreateRuleInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Actions" -> Actions.asInstanceOf[js.Any],
        "Conditions" -> Conditions.asInstanceOf[js.Any],
        "ListenerArn" -> ListenerArn.asInstanceOf[js.Any],
        "Priority" -> Priority.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
      VpcId: js.UndefOr[VpcId] = js.undefined): CreateTargetGroupInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "HealthCheckEnabled" -> HealthCheckEnabled.map { x => x.asInstanceOf[js.Any] },
        "HealthCheckIntervalSeconds" -> HealthCheckIntervalSeconds.map { x => x.asInstanceOf[js.Any] },
        "HealthCheckPath" -> HealthCheckPath.map { x => x.asInstanceOf[js.Any] },
        "HealthCheckPort" -> HealthCheckPort.map { x => x.asInstanceOf[js.Any] },
        "HealthCheckProtocol" -> HealthCheckProtocol.map { x => x.asInstanceOf[js.Any] },
        "HealthCheckTimeoutSeconds" -> HealthCheckTimeoutSeconds.map { x => x.asInstanceOf[js.Any] },
        "HealthyThresholdCount" -> HealthyThresholdCount.map { x => x.asInstanceOf[js.Any] },
        "Matcher" -> Matcher.map { x => x.asInstanceOf[js.Any] },
        "Port" -> Port.map { x => x.asInstanceOf[js.Any] },
        "Protocol" -> Protocol.map { x => x.asInstanceOf[js.Any] },
        "TargetType" -> TargetType.map { x => x.asInstanceOf[js.Any] },
        "UnhealthyThresholdCount" -> UnhealthyThresholdCount.map { x => x.asInstanceOf[js.Any] },
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
    var ListenerArn: ListenerArn
  }

  object DeleteListenerInput {
    def apply(
      ListenerArn: ListenerArn): DeleteListenerInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ListenerArn" -> ListenerArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
    var LoadBalancerArn: LoadBalancerArn
  }

  object DeleteLoadBalancerInput {
    def apply(
      LoadBalancerArn: LoadBalancerArn): DeleteLoadBalancerInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LoadBalancerArn" -> LoadBalancerArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
    var RuleArn: RuleArn
  }

  object DeleteRuleInput {
    def apply(
      RuleArn: RuleArn): DeleteRuleInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RuleArn" -> RuleArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
    var TargetGroupArn: TargetGroupArn
  }

  object DeleteTargetGroupInput {
    def apply(
      TargetGroupArn: TargetGroupArn): DeleteTargetGroupInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TargetGroupArn" -> TargetGroupArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
    var TargetGroupArn: TargetGroupArn
    var Targets: TargetDescriptions
  }

  object DeregisterTargetsInput {
    def apply(
      TargetGroupArn: TargetGroupArn,
      Targets: TargetDescriptions): DeregisterTargetsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TargetGroupArn" -> TargetGroupArn.asInstanceOf[js.Any],
        "Targets" -> Targets.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
    var ListenerArn: ListenerArn
    var Marker: js.UndefOr[Marker]
    var PageSize: js.UndefOr[PageSize]
  }

  object DescribeListenerCertificatesInput {
    def apply(
      ListenerArn: ListenerArn,
      Marker: js.UndefOr[Marker] = js.undefined,
      PageSize: js.UndefOr[PageSize] = js.undefined): DescribeListenerCertificatesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ListenerArn" -> ListenerArn.asInstanceOf[js.Any],
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
      PageSize: js.UndefOr[PageSize] = js.undefined): DescribeListenersInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ListenerArns" -> ListenerArns.map { x => x.asInstanceOf[js.Any] },
        "LoadBalancerArn" -> LoadBalancerArn.map { x => x.asInstanceOf[js.Any] },
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
    var LoadBalancerArn: LoadBalancerArn
  }

  object DescribeLoadBalancerAttributesInput {
    def apply(
      LoadBalancerArn: LoadBalancerArn): DescribeLoadBalancerAttributesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LoadBalancerArn" -> LoadBalancerArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
    var Marker: js.UndefOr[Marker]
    var Names: js.UndefOr[LoadBalancerNames]
    var PageSize: js.UndefOr[PageSize]
  }

  object DescribeLoadBalancersInput {
    def apply(
      LoadBalancerArns: js.UndefOr[LoadBalancerArns] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined,
      Names: js.UndefOr[LoadBalancerNames] = js.undefined,
      PageSize: js.UndefOr[PageSize] = js.undefined): DescribeLoadBalancersInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LoadBalancerArns" -> LoadBalancerArns.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "Names" -> Names.map { x => x.asInstanceOf[js.Any] },
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
    var Marker: js.UndefOr[Marker]
    var PageSize: js.UndefOr[PageSize]
    var RuleArns: js.UndefOr[RuleArns]
  }

  object DescribeRulesInput {
    def apply(
      ListenerArn: js.UndefOr[ListenerArn] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined,
      PageSize: js.UndefOr[PageSize] = js.undefined,
      RuleArns: js.UndefOr[RuleArns] = js.undefined): DescribeRulesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ListenerArn" -> ListenerArn.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "PageSize" -> PageSize.map { x => x.asInstanceOf[js.Any] },
        "RuleArns" -> RuleArns.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeRulesInput]
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
      Rules: js.UndefOr[Rules] = js.undefined): DescribeRulesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] },
        "Rules" -> Rules.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeRulesOutput]
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
      PageSize: js.UndefOr[PageSize] = js.undefined): DescribeSSLPoliciesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "Names" -> Names.map { x => x.asInstanceOf[js.Any] },
        "PageSize" -> PageSize.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSSLPoliciesInput]
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
      SslPolicies: js.UndefOr[SslPolicies] = js.undefined): DescribeSSLPoliciesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] },
        "SslPolicies" -> SslPolicies.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSSLPoliciesOutput]
    }
  }

  @js.native
  trait DescribeTagsInput extends js.Object {
    var ResourceArns: ResourceArns
  }

  object DescribeTagsInput {
    def apply(
      ResourceArns: ResourceArns): DescribeTagsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArns" -> ResourceArns.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
    var TargetGroupArn: TargetGroupArn
  }

  object DescribeTargetGroupAttributesInput {
    def apply(
      TargetGroupArn: TargetGroupArn): DescribeTargetGroupAttributesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TargetGroupArn" -> TargetGroupArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
      TargetGroupArns: js.UndefOr[TargetGroupArns] = js.undefined): DescribeTargetGroupsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LoadBalancerArn" -> LoadBalancerArn.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "Names" -> Names.map { x => x.asInstanceOf[js.Any] },
        "PageSize" -> PageSize.map { x => x.asInstanceOf[js.Any] },
        "TargetGroupArns" -> TargetGroupArns.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTargetGroupsInput]
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
      TargetGroups: js.UndefOr[TargetGroups] = js.undefined): DescribeTargetGroupsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] },
        "TargetGroups" -> TargetGroups.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTargetGroupsOutput]
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
      Targets: js.UndefOr[TargetDescriptions] = js.undefined): DescribeTargetHealthInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TargetGroupArn" -> TargetGroupArn.asInstanceOf[js.Any],
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
      MessageBody: js.UndefOr[FixedResponseActionMessage] = js.undefined): FixedResponseActionConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StatusCode" -> StatusCode.asInstanceOf[js.Any],
        "ContentType" -> ContentType.map { x => x.asInstanceOf[js.Any] },
        "MessageBody" -> MessageBody.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FixedResponseActionConfig]
    }
  }

  object IpAddressTypeEnum {
    val ipv4 = "ipv4"
    val dualstack = "dualstack"

    val values = IndexedSeq(ipv4, dualstack)
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
      Name: js.UndefOr[Name] = js.undefined): Limit = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Max" -> Max.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Limit]
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
      SslPolicy: js.UndefOr[SslPolicyName] = js.undefined): Listener = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Certificates" -> Certificates.map { x => x.asInstanceOf[js.Any] },
        "DefaultActions" -> DefaultActions.map { x => x.asInstanceOf[js.Any] },
        "ListenerArn" -> ListenerArn.map { x => x.asInstanceOf[js.Any] },
        "LoadBalancerArn" -> LoadBalancerArn.map { x => x.asInstanceOf[js.Any] },
        "Port" -> Port.map { x => x.asInstanceOf[js.Any] },
        "Protocol" -> Protocol.map { x => x.asInstanceOf[js.Any] },
        "SslPolicy" -> SslPolicy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Listener]
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
      VpcId: js.UndefOr[VpcId] = js.undefined): LoadBalancer = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AvailabilityZones" -> AvailabilityZones.map { x => x.asInstanceOf[js.Any] },
        "CanonicalHostedZoneId" -> CanonicalHostedZoneId.map { x => x.asInstanceOf[js.Any] },
        "CreatedTime" -> CreatedTime.map { x => x.asInstanceOf[js.Any] },
        "DNSName" -> DNSName.map { x => x.asInstanceOf[js.Any] },
        "IpAddressType" -> IpAddressType.map { x => x.asInstanceOf[js.Any] },
        "LoadBalancerArn" -> LoadBalancerArn.map { x => x.asInstanceOf[js.Any] },
        "LoadBalancerName" -> LoadBalancerName.map { x => x.asInstanceOf[js.Any] },
        "Scheme" -> Scheme.map { x => x.asInstanceOf[js.Any] },
        "SecurityGroups" -> SecurityGroups.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] },
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LoadBalancer]
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
      IpAddress: js.UndefOr[IpAddress] = js.undefined): LoadBalancerAddress = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AllocationId" -> AllocationId.map { x => x.asInstanceOf[js.Any] },
        "IpAddress" -> IpAddress.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LoadBalancerAddress]
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
      Value: js.UndefOr[LoadBalancerAttributeValue] = js.undefined): LoadBalancerAttribute = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LoadBalancerAttribute]
    }
  }

  object LoadBalancerSchemeEnumEnum {
    val `internet-facing` = "internet-facing"
    val internal = "internal"

    val values = IndexedSeq(`internet-facing`, internal)
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
   * Information to use when checking for a successful response from a target.
   */
  @js.native
  trait Matcher extends js.Object {
    var HttpCode: HttpCode
  }

  object Matcher {
    def apply(
      HttpCode: HttpCode): Matcher = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HttpCode" -> HttpCode.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Matcher]
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
      SslPolicy: js.UndefOr[SslPolicyName] = js.undefined): ModifyListenerInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ListenerArn" -> ListenerArn.asInstanceOf[js.Any],
        "Certificates" -> Certificates.map { x => x.asInstanceOf[js.Any] },
        "DefaultActions" -> DefaultActions.map { x => x.asInstanceOf[js.Any] },
        "Port" -> Port.map { x => x.asInstanceOf[js.Any] },
        "Protocol" -> Protocol.map { x => x.asInstanceOf[js.Any] },
        "SslPolicy" -> SslPolicy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var Attributes: LoadBalancerAttributes
    var LoadBalancerArn: LoadBalancerArn
  }

  object ModifyLoadBalancerAttributesInput {
    def apply(
      Attributes: LoadBalancerAttributes,
      LoadBalancerArn: LoadBalancerArn): ModifyLoadBalancerAttributesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Attributes" -> Attributes.asInstanceOf[js.Any],
        "LoadBalancerArn" -> LoadBalancerArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
    var RuleArn: RuleArn
    var Actions: js.UndefOr[Actions]
    var Conditions: js.UndefOr[RuleConditionList]
  }

  object ModifyRuleInput {
    def apply(
      RuleArn: RuleArn,
      Actions: js.UndefOr[Actions] = js.undefined,
      Conditions: js.UndefOr[RuleConditionList] = js.undefined): ModifyRuleInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RuleArn" -> RuleArn.asInstanceOf[js.Any],
        "Actions" -> Actions.map { x => x.asInstanceOf[js.Any] },
        "Conditions" -> Conditions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var Attributes: TargetGroupAttributes
    var TargetGroupArn: TargetGroupArn
  }

  object ModifyTargetGroupAttributesInput {
    def apply(
      Attributes: TargetGroupAttributes,
      TargetGroupArn: TargetGroupArn): ModifyTargetGroupAttributesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Attributes" -> Attributes.asInstanceOf[js.Any],
        "TargetGroupArn" -> TargetGroupArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
      UnhealthyThresholdCount: js.UndefOr[HealthCheckThresholdCount] = js.undefined): ModifyTargetGroupInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TargetGroupArn" -> TargetGroupArn.asInstanceOf[js.Any],
        "HealthCheckEnabled" -> HealthCheckEnabled.map { x => x.asInstanceOf[js.Any] },
        "HealthCheckIntervalSeconds" -> HealthCheckIntervalSeconds.map { x => x.asInstanceOf[js.Any] },
        "HealthCheckPath" -> HealthCheckPath.map { x => x.asInstanceOf[js.Any] },
        "HealthCheckPort" -> HealthCheckPort.map { x => x.asInstanceOf[js.Any] },
        "HealthCheckProtocol" -> HealthCheckProtocol.map { x => x.asInstanceOf[js.Any] },
        "HealthCheckTimeoutSeconds" -> HealthCheckTimeoutSeconds.map { x => x.asInstanceOf[js.Any] },
        "HealthyThresholdCount" -> HealthyThresholdCount.map { x => x.asInstanceOf[js.Any] },
        "Matcher" -> Matcher.map { x => x.asInstanceOf[js.Any] },
        "UnhealthyThresholdCount" -> UnhealthyThresholdCount.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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

  object ProtocolEnumEnum {
    val HTTP = "HTTP"
    val HTTPS = "HTTPS"
    val TCP = "TCP"

    val values = IndexedSeq(HTTP, HTTPS, TCP)
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
      Query: js.UndefOr[RedirectActionQuery] = js.undefined): RedirectActionConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StatusCode" -> StatusCode.asInstanceOf[js.Any],
        "Host" -> Host.map { x => x.asInstanceOf[js.Any] },
        "Path" -> Path.map { x => x.asInstanceOf[js.Any] },
        "Port" -> Port.map { x => x.asInstanceOf[js.Any] },
        "Protocol" -> Protocol.map { x => x.asInstanceOf[js.Any] },
        "Query" -> Query.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var TargetGroupArn: TargetGroupArn
    var Targets: TargetDescriptions
  }

  object RegisterTargetsInput {
    def apply(
      TargetGroupArn: TargetGroupArn,
      Targets: TargetDescriptions): RegisterTargetsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TargetGroupArn" -> TargetGroupArn.asInstanceOf[js.Any],
        "Targets" -> Targets.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
    var Certificates: CertificateList
    var ListenerArn: ListenerArn
  }

  object RemoveListenerCertificatesInput {
    def apply(
      Certificates: CertificateList,
      ListenerArn: ListenerArn): RemoveListenerCertificatesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Certificates" -> Certificates.asInstanceOf[js.Any],
        "ListenerArn" -> ListenerArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
    var ResourceArns: ResourceArns
    var TagKeys: TagKeys
  }

  object RemoveTagsInput {
    def apply(
      ResourceArns: ResourceArns,
      TagKeys: TagKeys): RemoveTagsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArns" -> ResourceArns.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
      RuleArn: js.UndefOr[RuleArn] = js.undefined): Rule = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Actions" -> Actions.map { x => x.asInstanceOf[js.Any] },
        "Conditions" -> Conditions.map { x => x.asInstanceOf[js.Any] },
        "IsDefault" -> IsDefault.map { x => x.asInstanceOf[js.Any] },
        "Priority" -> Priority.map { x => x.asInstanceOf[js.Any] },
        "RuleArn" -> RuleArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Rule]
    }
  }

  /**
   * Information about a condition for a rule.
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
      RuleArn: js.UndefOr[RuleArn] = js.undefined): RulePriorityPair = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Priority" -> Priority.map { x => x.asInstanceOf[js.Any] },
        "RuleArn" -> RuleArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RulePriorityPair]
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
      LoadBalancerArn: LoadBalancerArn): SetIpAddressTypeInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IpAddressType" -> IpAddressType.asInstanceOf[js.Any],
        "LoadBalancerArn" -> LoadBalancerArn.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
    var RulePriorities: RulePriorityList
  }

  object SetRulePrioritiesInput {
    def apply(
      RulePriorities: RulePriorityList): SetRulePrioritiesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RulePriorities" -> RulePriorities.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
    var LoadBalancerArn: LoadBalancerArn
    var SecurityGroups: SecurityGroups
  }

  object SetSecurityGroupsInput {
    def apply(
      LoadBalancerArn: LoadBalancerArn,
      SecurityGroups: SecurityGroups): SetSecurityGroupsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LoadBalancerArn" -> LoadBalancerArn.asInstanceOf[js.Any],
        "SecurityGroups" -> SecurityGroups.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
    var LoadBalancerArn: LoadBalancerArn
    var SubnetMappings: js.UndefOr[SubnetMappings]
    var Subnets: js.UndefOr[Subnets]
  }

  object SetSubnetsInput {
    def apply(
      LoadBalancerArn: LoadBalancerArn,
      SubnetMappings: js.UndefOr[SubnetMappings] = js.undefined,
      Subnets: js.UndefOr[Subnets] = js.undefined): SetSubnetsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LoadBalancerArn" -> LoadBalancerArn.asInstanceOf[js.Any],
        "SubnetMappings" -> SubnetMappings.map { x => x.asInstanceOf[js.Any] },
        "Subnets" -> Subnets.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
      SslProtocols: js.UndefOr[SslProtocols] = js.undefined): SslPolicy = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Ciphers" -> Ciphers.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "SslProtocols" -> SslProtocols.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SslPolicy]
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
      SubnetId: js.UndefOr[SubnetId] = js.undefined): SubnetMapping = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AllocationId" -> AllocationId.map { x => x.asInstanceOf[js.Any] },
        "SubnetId" -> SubnetId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SubnetMapping]
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
      Value: js.UndefOr[TagValue] = js.undefined): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.asInstanceOf[js.Any],
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
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
      Tags: js.UndefOr[TagList] = js.undefined): TagDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagDescription]
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
      Port: js.UndefOr[Port] = js.undefined): TargetDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any],
        "AvailabilityZone" -> AvailabilityZone.map { x => x.asInstanceOf[js.Any] },
        "Port" -> Port.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TargetDescription]
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
      VpcId: js.UndefOr[VpcId] = js.undefined): TargetGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HealthCheckEnabled" -> HealthCheckEnabled.map { x => x.asInstanceOf[js.Any] },
        "HealthCheckIntervalSeconds" -> HealthCheckIntervalSeconds.map { x => x.asInstanceOf[js.Any] },
        "HealthCheckPath" -> HealthCheckPath.map { x => x.asInstanceOf[js.Any] },
        "HealthCheckPort" -> HealthCheckPort.map { x => x.asInstanceOf[js.Any] },
        "HealthCheckProtocol" -> HealthCheckProtocol.map { x => x.asInstanceOf[js.Any] },
        "HealthCheckTimeoutSeconds" -> HealthCheckTimeoutSeconds.map { x => x.asInstanceOf[js.Any] },
        "HealthyThresholdCount" -> HealthyThresholdCount.map { x => x.asInstanceOf[js.Any] },
        "LoadBalancerArns" -> LoadBalancerArns.map { x => x.asInstanceOf[js.Any] },
        "Matcher" -> Matcher.map { x => x.asInstanceOf[js.Any] },
        "Port" -> Port.map { x => x.asInstanceOf[js.Any] },
        "Protocol" -> Protocol.map { x => x.asInstanceOf[js.Any] },
        "TargetGroupArn" -> TargetGroupArn.map { x => x.asInstanceOf[js.Any] },
        "TargetGroupName" -> TargetGroupName.map { x => x.asInstanceOf[js.Any] },
        "TargetType" -> TargetType.map { x => x.asInstanceOf[js.Any] },
        "UnhealthyThresholdCount" -> UnhealthyThresholdCount.map { x => x.asInstanceOf[js.Any] },
        "VpcId" -> VpcId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TargetGroup]
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
      Value: js.UndefOr[TargetGroupAttributeValue] = js.undefined): TargetGroupAttribute = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TargetGroupAttribute]
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
      State: js.UndefOr[TargetHealthStateEnum] = js.undefined): TargetHealth = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Reason" -> Reason.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TargetHealth]
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
      TargetHealth: js.UndefOr[TargetHealth] = js.undefined): TargetHealthDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HealthCheckPort" -> HealthCheckPort.map { x => x.asInstanceOf[js.Any] },
        "Target" -> Target.map { x => x.asInstanceOf[js.Any] },
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
    val `Target.HealthCheckDisabled` = "Target.HealthCheckDisabled"
    val `Elb.InternalError` = "Elb.InternalError"

    val values = IndexedSeq(`Elb.RegistrationInProgress`, `Elb.InitialHealthChecking`, `Target.ResponseCodeMismatch`, `Target.Timeout`, `Target.FailedHealthChecks`, `Target.NotRegistered`, `Target.NotInUse`, `Target.DeregistrationInProgress`, `Target.InvalidState`, `Target.IpUnusable`, `Target.HealthCheckDisabled`, `Elb.InternalError`)
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
    val lambda = "lambda"

    val values = IndexedSeq(instance, ip, lambda)
  }
}
