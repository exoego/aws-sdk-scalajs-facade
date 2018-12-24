package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object elb {
  type AccessLogEnabled = Boolean
  type AccessLogInterval = Int
  type AccessLogPrefix = String
  type AccessPointName = String
  type AccessPointPort = Int
  type AdditionalAttributeKey = String
  type AdditionalAttributeValue = String
  type AdditionalAttributes = js.Array[AdditionalAttribute]
  type AppCookieStickinessPolicies = js.Array[AppCookieStickinessPolicy]
  type AttributeName = String
  type AttributeType = String
  type AttributeValue = String
  type AvailabilityZone = String
  type AvailabilityZones = js.Array[AvailabilityZone]
  type BackendServerDescriptions = js.Array[BackendServerDescription]
  type Cardinality = String
  type ConnectionDrainingEnabled = Boolean
  type ConnectionDrainingTimeout = Int
  type CookieExpirationPeriod = Double
  type CookieName = String
  type CreatedTime = js.Date
  type CrossZoneLoadBalancingEnabled = Boolean
  type DNSName = String
  type DefaultValue = String
  type Description = String
  type EndPointPort = Int
  type HealthCheckInterval = Int
  type HealthCheckTarget = String
  type HealthCheckTimeout = Int
  type HealthyThreshold = Int
  type IdleTimeout = Int
  type InstanceId = String
  type InstancePort = Int
  type InstanceStates = js.Array[InstanceState]
  type Instances = js.Array[Instance]
  type LBCookieStickinessPolicies = js.Array[LBCookieStickinessPolicy]
  type Limits = js.Array[Limit]
  type ListenerDescriptions = js.Array[ListenerDescription]
  type Listeners = js.Array[Listener]
  type LoadBalancerDescriptions = js.Array[LoadBalancerDescription]
  type LoadBalancerNames = js.Array[AccessPointName]
  type LoadBalancerNamesMax20 = js.Array[AccessPointName]
  type LoadBalancerScheme = String
  type Marker = String
  type Max = String
  type Name = String
  type PageSize = Int
  type PolicyAttributeDescriptions = js.Array[PolicyAttributeDescription]
  type PolicyAttributeTypeDescriptions = js.Array[PolicyAttributeTypeDescription]
  type PolicyAttributes = js.Array[PolicyAttribute]
  type PolicyDescriptions = js.Array[PolicyDescription]
  type PolicyName = String
  type PolicyNames = js.Array[PolicyName]
  type PolicyTypeDescriptions = js.Array[PolicyTypeDescription]
  type PolicyTypeName = String
  type PolicyTypeNames = js.Array[PolicyTypeName]
  type Ports = js.Array[AccessPointPort]
  type Protocol = String
  type ReasonCode = String
  type S3BucketName = String
  type SSLCertificateId = String
  type SecurityGroupId = String
  type SecurityGroupName = String
  type SecurityGroupOwnerAlias = String
  type SecurityGroups = js.Array[SecurityGroupId]
  type State = String
  type SubnetId = String
  type Subnets = js.Array[SubnetId]
  type TagDescriptions = js.Array[TagDescription]
  type TagKey = String
  type TagKeyList = js.Array[TagKeyOnly]
  type TagList = js.Array[Tag]
  type TagValue = String
  type UnhealthyThreshold = Int
  type VPCId = String
}

package elb {
  @js.native
  @JSImport("aws-sdk", "ELB")
  class ELB() extends js.Object {
    def this(config: AWSConfig) = this()

    def addTags(params: AddTagsInput): Request[AddTagsOutput] = js.native
    def applySecurityGroupsToLoadBalancer(params: ApplySecurityGroupsToLoadBalancerInput): Request[ApplySecurityGroupsToLoadBalancerOutput] = js.native
    def attachLoadBalancerToSubnets(params: AttachLoadBalancerToSubnetsInput): Request[AttachLoadBalancerToSubnetsOutput] = js.native
    def configureHealthCheck(params: ConfigureHealthCheckInput): Request[ConfigureHealthCheckOutput] = js.native
    def createAppCookieStickinessPolicy(params: CreateAppCookieStickinessPolicyInput): Request[CreateAppCookieStickinessPolicyOutput] = js.native
    def createLBCookieStickinessPolicy(params: CreateLBCookieStickinessPolicyInput): Request[CreateLBCookieStickinessPolicyOutput] = js.native
    def createLoadBalancer(params: CreateAccessPointInput): Request[CreateAccessPointOutput] = js.native
    def createLoadBalancerListeners(params: CreateLoadBalancerListenerInput): Request[CreateLoadBalancerListenerOutput] = js.native
    def createLoadBalancerPolicy(params: CreateLoadBalancerPolicyInput): Request[CreateLoadBalancerPolicyOutput] = js.native
    def deleteLoadBalancer(params: DeleteAccessPointInput): Request[DeleteAccessPointOutput] = js.native
    def deleteLoadBalancerListeners(params: DeleteLoadBalancerListenerInput): Request[DeleteLoadBalancerListenerOutput] = js.native
    def deleteLoadBalancerPolicy(params: DeleteLoadBalancerPolicyInput): Request[DeleteLoadBalancerPolicyOutput] = js.native
    def deregisterInstancesFromLoadBalancer(params: DeregisterEndPointsInput): Request[DeregisterEndPointsOutput] = js.native
    def describeAccountLimits(params: DescribeAccountLimitsInput): Request[DescribeAccountLimitsOutput] = js.native
    def describeInstanceHealth(params: DescribeEndPointStateInput): Request[DescribeEndPointStateOutput] = js.native
    def describeLoadBalancerAttributes(params: DescribeLoadBalancerAttributesInput): Request[DescribeLoadBalancerAttributesOutput] = js.native
    def describeLoadBalancerPolicies(params: DescribeLoadBalancerPoliciesInput): Request[DescribeLoadBalancerPoliciesOutput] = js.native
    def describeLoadBalancerPolicyTypes(params: DescribeLoadBalancerPolicyTypesInput): Request[DescribeLoadBalancerPolicyTypesOutput] = js.native
    def describeLoadBalancers(params: DescribeAccessPointsInput): Request[DescribeAccessPointsOutput] = js.native
    def describeTags(params: DescribeTagsInput): Request[DescribeTagsOutput] = js.native
    def detachLoadBalancerFromSubnets(params: DetachLoadBalancerFromSubnetsInput): Request[DetachLoadBalancerFromSubnetsOutput] = js.native
    def disableAvailabilityZonesForLoadBalancer(params: RemoveAvailabilityZonesInput): Request[RemoveAvailabilityZonesOutput] = js.native
    def enableAvailabilityZonesForLoadBalancer(params: AddAvailabilityZonesInput): Request[AddAvailabilityZonesOutput] = js.native
    def modifyLoadBalancerAttributes(params: ModifyLoadBalancerAttributesInput): Request[ModifyLoadBalancerAttributesOutput] = js.native
    def registerInstancesWithLoadBalancer(params: RegisterEndPointsInput): Request[RegisterEndPointsOutput] = js.native
    def removeTags(params: RemoveTagsInput): Request[RemoveTagsOutput] = js.native
    def setLoadBalancerListenerSSLCertificate(params: SetLoadBalancerListenerSSLCertificateInput): Request[SetLoadBalancerListenerSSLCertificateOutput] = js.native
    def setLoadBalancerPoliciesForBackendServer(params: SetLoadBalancerPoliciesForBackendServerInput): Request[SetLoadBalancerPoliciesForBackendServerOutput] = js.native
    def setLoadBalancerPoliciesOfListener(params: SetLoadBalancerPoliciesOfListenerInput): Request[SetLoadBalancerPoliciesOfListenerOutput] = js.native
  }

  /**
   * Information about the <code>AccessLog</code> attribute.
   */
  @js.native
  trait AccessLog extends js.Object {
    var Enabled: AccessLogEnabled
    var EmitInterval: js.UndefOr[AccessLogInterval]
    var S3BucketName: js.UndefOr[S3BucketName]
    var S3BucketPrefix: js.UndefOr[AccessLogPrefix]
  }

  object AccessLog {
    def apply(
      Enabled: AccessLogEnabled,
      EmitInterval: js.UndefOr[AccessLogInterval] = js.undefined,
      S3BucketName: js.UndefOr[S3BucketName] = js.undefined,
      S3BucketPrefix: js.UndefOr[AccessLogPrefix] = js.undefined): AccessLog = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Enabled" -> Enabled.asInstanceOf[js.Any],
        "EmitInterval" -> EmitInterval.map { x => x.asInstanceOf[js.Any] },
        "S3BucketName" -> S3BucketName.map { x => x.asInstanceOf[js.Any] },
        "S3BucketPrefix" -> S3BucketPrefix.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AccessLog]
    }
  }

  /**
   * Contains the parameters for EnableAvailabilityZonesForLoadBalancer.
   */
  @js.native
  trait AddAvailabilityZonesInput extends js.Object {
    var AvailabilityZones: AvailabilityZones
    var LoadBalancerName: AccessPointName
  }

  object AddAvailabilityZonesInput {
    def apply(
      AvailabilityZones: AvailabilityZones,
      LoadBalancerName: AccessPointName): AddAvailabilityZonesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AvailabilityZones" -> AvailabilityZones.asInstanceOf[js.Any],
        "LoadBalancerName" -> LoadBalancerName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddAvailabilityZonesInput]
    }
  }

  /**
   * Contains the output of EnableAvailabilityZonesForLoadBalancer.
   */
  @js.native
  trait AddAvailabilityZonesOutput extends js.Object {
    var AvailabilityZones: js.UndefOr[AvailabilityZones]
  }

  object AddAvailabilityZonesOutput {
    def apply(
      AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined): AddAvailabilityZonesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AvailabilityZones" -> AvailabilityZones.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddAvailabilityZonesOutput]
    }
  }

  /**
   * Contains the parameters for AddTags.
   */
  @js.native
  trait AddTagsInput extends js.Object {
    var LoadBalancerNames: LoadBalancerNames
    var Tags: TagList
  }

  object AddTagsInput {
    def apply(
      LoadBalancerNames: LoadBalancerNames,
      Tags: TagList): AddTagsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LoadBalancerNames" -> LoadBalancerNames.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddTagsInput]
    }
  }

  /**
   * Contains the output of AddTags.
   */
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
   * This data type is reserved.
   */
  @js.native
  trait AdditionalAttribute extends js.Object {
    var Key: js.UndefOr[AdditionalAttributeKey]
    var Value: js.UndefOr[AdditionalAttributeValue]
  }

  object AdditionalAttribute {
    def apply(
      Key: js.UndefOr[AdditionalAttributeKey] = js.undefined,
      Value: js.UndefOr[AdditionalAttributeValue] = js.undefined): AdditionalAttribute = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdditionalAttribute]
    }
  }

  /**
   * Information about a policy for application-controlled session stickiness.
   */
  @js.native
  trait AppCookieStickinessPolicy extends js.Object {
    var CookieName: js.UndefOr[CookieName]
    var PolicyName: js.UndefOr[PolicyName]
  }

  object AppCookieStickinessPolicy {
    def apply(
      CookieName: js.UndefOr[CookieName] = js.undefined,
      PolicyName: js.UndefOr[PolicyName] = js.undefined): AppCookieStickinessPolicy = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CookieName" -> CookieName.map { x => x.asInstanceOf[js.Any] },
        "PolicyName" -> PolicyName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AppCookieStickinessPolicy]
    }
  }

  /**
   * Contains the parameters for ApplySecurityGroupsToLoadBalancer.
   */
  @js.native
  trait ApplySecurityGroupsToLoadBalancerInput extends js.Object {
    var LoadBalancerName: AccessPointName
    var SecurityGroups: SecurityGroups
  }

  object ApplySecurityGroupsToLoadBalancerInput {
    def apply(
      LoadBalancerName: AccessPointName,
      SecurityGroups: SecurityGroups): ApplySecurityGroupsToLoadBalancerInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LoadBalancerName" -> LoadBalancerName.asInstanceOf[js.Any],
        "SecurityGroups" -> SecurityGroups.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApplySecurityGroupsToLoadBalancerInput]
    }
  }

  /**
   * Contains the output of ApplySecurityGroupsToLoadBalancer.
   */
  @js.native
  trait ApplySecurityGroupsToLoadBalancerOutput extends js.Object {
    var SecurityGroups: js.UndefOr[SecurityGroups]
  }

  object ApplySecurityGroupsToLoadBalancerOutput {
    def apply(
      SecurityGroups: js.UndefOr[SecurityGroups] = js.undefined): ApplySecurityGroupsToLoadBalancerOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SecurityGroups" -> SecurityGroups.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApplySecurityGroupsToLoadBalancerOutput]
    }
  }

  /**
   * Contains the parameters for AttachLoaBalancerToSubnets.
   */
  @js.native
  trait AttachLoadBalancerToSubnetsInput extends js.Object {
    var LoadBalancerName: AccessPointName
    var Subnets: Subnets
  }

  object AttachLoadBalancerToSubnetsInput {
    def apply(
      LoadBalancerName: AccessPointName,
      Subnets: Subnets): AttachLoadBalancerToSubnetsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LoadBalancerName" -> LoadBalancerName.asInstanceOf[js.Any],
        "Subnets" -> Subnets.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachLoadBalancerToSubnetsInput]
    }
  }

  /**
   * Contains the output of AttachLoadBalancerToSubnets.
   */
  @js.native
  trait AttachLoadBalancerToSubnetsOutput extends js.Object {
    var Subnets: js.UndefOr[Subnets]
  }

  object AttachLoadBalancerToSubnetsOutput {
    def apply(
      Subnets: js.UndefOr[Subnets] = js.undefined): AttachLoadBalancerToSubnetsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Subnets" -> Subnets.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachLoadBalancerToSubnetsOutput]
    }
  }

  /**
   * Information about the configuration of an EC2 instance.
   */
  @js.native
  trait BackendServerDescription extends js.Object {
    var InstancePort: js.UndefOr[InstancePort]
    var PolicyNames: js.UndefOr[PolicyNames]
  }

  object BackendServerDescription {
    def apply(
      InstancePort: js.UndefOr[InstancePort] = js.undefined,
      PolicyNames: js.UndefOr[PolicyNames] = js.undefined): BackendServerDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstancePort" -> InstancePort.map { x => x.asInstanceOf[js.Any] },
        "PolicyNames" -> PolicyNames.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BackendServerDescription]
    }
  }

  /**
   * Contains the parameters for ConfigureHealthCheck.
   */
  @js.native
  trait ConfigureHealthCheckInput extends js.Object {
    var HealthCheck: HealthCheck
    var LoadBalancerName: AccessPointName
  }

  object ConfigureHealthCheckInput {
    def apply(
      HealthCheck: HealthCheck,
      LoadBalancerName: AccessPointName): ConfigureHealthCheckInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HealthCheck" -> HealthCheck.asInstanceOf[js.Any],
        "LoadBalancerName" -> LoadBalancerName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfigureHealthCheckInput]
    }
  }

  /**
   * Contains the output of ConfigureHealthCheck.
   */
  @js.native
  trait ConfigureHealthCheckOutput extends js.Object {
    var HealthCheck: js.UndefOr[HealthCheck]
  }

  object ConfigureHealthCheckOutput {
    def apply(
      HealthCheck: js.UndefOr[HealthCheck] = js.undefined): ConfigureHealthCheckOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HealthCheck" -> HealthCheck.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfigureHealthCheckOutput]
    }
  }

  /**
   * Information about the <code>ConnectionDraining</code> attribute.
   */
  @js.native
  trait ConnectionDraining extends js.Object {
    var Enabled: ConnectionDrainingEnabled
    var Timeout: js.UndefOr[ConnectionDrainingTimeout]
  }

  object ConnectionDraining {
    def apply(
      Enabled: ConnectionDrainingEnabled,
      Timeout: js.UndefOr[ConnectionDrainingTimeout] = js.undefined): ConnectionDraining = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Enabled" -> Enabled.asInstanceOf[js.Any],
        "Timeout" -> Timeout.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConnectionDraining]
    }
  }

  /**
   * Information about the <code>ConnectionSettings</code> attribute.
   */
  @js.native
  trait ConnectionSettings extends js.Object {
    var IdleTimeout: IdleTimeout
  }

  object ConnectionSettings {
    def apply(
      IdleTimeout: IdleTimeout): ConnectionSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdleTimeout" -> IdleTimeout.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConnectionSettings]
    }
  }

  /**
   * Contains the parameters for CreateLoadBalancer.
   */
  @js.native
  trait CreateAccessPointInput extends js.Object {
    var Listeners: Listeners
    var LoadBalancerName: AccessPointName
    var AvailabilityZones: js.UndefOr[AvailabilityZones]
    var Scheme: js.UndefOr[LoadBalancerScheme]
    var SecurityGroups: js.UndefOr[SecurityGroups]
    var Subnets: js.UndefOr[Subnets]
    var Tags: js.UndefOr[TagList]
  }

  object CreateAccessPointInput {
    def apply(
      Listeners: Listeners,
      LoadBalancerName: AccessPointName,
      AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined,
      Scheme: js.UndefOr[LoadBalancerScheme] = js.undefined,
      SecurityGroups: js.UndefOr[SecurityGroups] = js.undefined,
      Subnets: js.UndefOr[Subnets] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): CreateAccessPointInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Listeners" -> Listeners.asInstanceOf[js.Any],
        "LoadBalancerName" -> LoadBalancerName.asInstanceOf[js.Any],
        "AvailabilityZones" -> AvailabilityZones.map { x => x.asInstanceOf[js.Any] },
        "Scheme" -> Scheme.map { x => x.asInstanceOf[js.Any] },
        "SecurityGroups" -> SecurityGroups.map { x => x.asInstanceOf[js.Any] },
        "Subnets" -> Subnets.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAccessPointInput]
    }
  }

  /**
   * Contains the output for CreateLoadBalancer.
   */
  @js.native
  trait CreateAccessPointOutput extends js.Object {
    var DNSName: js.UndefOr[DNSName]
  }

  object CreateAccessPointOutput {
    def apply(
      DNSName: js.UndefOr[DNSName] = js.undefined): CreateAccessPointOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DNSName" -> DNSName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAccessPointOutput]
    }
  }

  /**
   * Contains the parameters for CreateAppCookieStickinessPolicy.
   */
  @js.native
  trait CreateAppCookieStickinessPolicyInput extends js.Object {
    var CookieName: CookieName
    var LoadBalancerName: AccessPointName
    var PolicyName: PolicyName
  }

  object CreateAppCookieStickinessPolicyInput {
    def apply(
      CookieName: CookieName,
      LoadBalancerName: AccessPointName,
      PolicyName: PolicyName): CreateAppCookieStickinessPolicyInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CookieName" -> CookieName.asInstanceOf[js.Any],
        "LoadBalancerName" -> LoadBalancerName.asInstanceOf[js.Any],
        "PolicyName" -> PolicyName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAppCookieStickinessPolicyInput]
    }
  }

  /**
   * Contains the output for CreateAppCookieStickinessPolicy.
   */
  @js.native
  trait CreateAppCookieStickinessPolicyOutput extends js.Object {

  }

  object CreateAppCookieStickinessPolicyOutput {
    def apply(): CreateAppCookieStickinessPolicyOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAppCookieStickinessPolicyOutput]
    }
  }

  /**
   * Contains the parameters for CreateLBCookieStickinessPolicy.
   */
  @js.native
  trait CreateLBCookieStickinessPolicyInput extends js.Object {
    var LoadBalancerName: AccessPointName
    var PolicyName: PolicyName
    var CookieExpirationPeriod: js.UndefOr[CookieExpirationPeriod]
  }

  object CreateLBCookieStickinessPolicyInput {
    def apply(
      LoadBalancerName: AccessPointName,
      PolicyName: PolicyName,
      CookieExpirationPeriod: js.UndefOr[CookieExpirationPeriod] = js.undefined): CreateLBCookieStickinessPolicyInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LoadBalancerName" -> LoadBalancerName.asInstanceOf[js.Any],
        "PolicyName" -> PolicyName.asInstanceOf[js.Any],
        "CookieExpirationPeriod" -> CookieExpirationPeriod.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLBCookieStickinessPolicyInput]
    }
  }

  /**
   * Contains the output for CreateLBCookieStickinessPolicy.
   */
  @js.native
  trait CreateLBCookieStickinessPolicyOutput extends js.Object {

  }

  object CreateLBCookieStickinessPolicyOutput {
    def apply(): CreateLBCookieStickinessPolicyOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLBCookieStickinessPolicyOutput]
    }
  }

  /**
   * Contains the parameters for CreateLoadBalancerListeners.
   */
  @js.native
  trait CreateLoadBalancerListenerInput extends js.Object {
    var Listeners: Listeners
    var LoadBalancerName: AccessPointName
  }

  object CreateLoadBalancerListenerInput {
    def apply(
      Listeners: Listeners,
      LoadBalancerName: AccessPointName): CreateLoadBalancerListenerInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Listeners" -> Listeners.asInstanceOf[js.Any],
        "LoadBalancerName" -> LoadBalancerName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLoadBalancerListenerInput]
    }
  }

  /**
   * Contains the parameters for CreateLoadBalancerListener.
   */
  @js.native
  trait CreateLoadBalancerListenerOutput extends js.Object {

  }

  object CreateLoadBalancerListenerOutput {
    def apply(): CreateLoadBalancerListenerOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLoadBalancerListenerOutput]
    }
  }

  /**
   * Contains the parameters for CreateLoadBalancerPolicy.
   */
  @js.native
  trait CreateLoadBalancerPolicyInput extends js.Object {
    var LoadBalancerName: AccessPointName
    var PolicyName: PolicyName
    var PolicyTypeName: PolicyTypeName
    var PolicyAttributes: js.UndefOr[PolicyAttributes]
  }

  object CreateLoadBalancerPolicyInput {
    def apply(
      LoadBalancerName: AccessPointName,
      PolicyName: PolicyName,
      PolicyTypeName: PolicyTypeName,
      PolicyAttributes: js.UndefOr[PolicyAttributes] = js.undefined): CreateLoadBalancerPolicyInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LoadBalancerName" -> LoadBalancerName.asInstanceOf[js.Any],
        "PolicyName" -> PolicyName.asInstanceOf[js.Any],
        "PolicyTypeName" -> PolicyTypeName.asInstanceOf[js.Any],
        "PolicyAttributes" -> PolicyAttributes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLoadBalancerPolicyInput]
    }
  }

  /**
   * Contains the output of CreateLoadBalancerPolicy.
   */
  @js.native
  trait CreateLoadBalancerPolicyOutput extends js.Object {

  }

  object CreateLoadBalancerPolicyOutput {
    def apply(): CreateLoadBalancerPolicyOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLoadBalancerPolicyOutput]
    }
  }

  /**
   * Information about the <code>CrossZoneLoadBalancing</code> attribute.
   */
  @js.native
  trait CrossZoneLoadBalancing extends js.Object {
    var Enabled: CrossZoneLoadBalancingEnabled
  }

  object CrossZoneLoadBalancing {
    def apply(
      Enabled: CrossZoneLoadBalancingEnabled): CrossZoneLoadBalancing = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Enabled" -> Enabled.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CrossZoneLoadBalancing]
    }
  }

  /**
   * Contains the parameters for DeleteLoadBalancer.
   */
  @js.native
  trait DeleteAccessPointInput extends js.Object {
    var LoadBalancerName: AccessPointName
  }

  object DeleteAccessPointInput {
    def apply(
      LoadBalancerName: AccessPointName): DeleteAccessPointInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LoadBalancerName" -> LoadBalancerName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAccessPointInput]
    }
  }

  /**
   * Contains the output of DeleteLoadBalancer.
   */
  @js.native
  trait DeleteAccessPointOutput extends js.Object {

  }

  object DeleteAccessPointOutput {
    def apply(): DeleteAccessPointOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAccessPointOutput]
    }
  }

  /**
   * Contains the parameters for DeleteLoadBalancerListeners.
   */
  @js.native
  trait DeleteLoadBalancerListenerInput extends js.Object {
    var LoadBalancerName: AccessPointName
    var LoadBalancerPorts: Ports
  }

  object DeleteLoadBalancerListenerInput {
    def apply(
      LoadBalancerName: AccessPointName,
      LoadBalancerPorts: Ports): DeleteLoadBalancerListenerInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LoadBalancerName" -> LoadBalancerName.asInstanceOf[js.Any],
        "LoadBalancerPorts" -> LoadBalancerPorts.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteLoadBalancerListenerInput]
    }
  }

  /**
   * Contains the output of DeleteLoadBalancerListeners.
   */
  @js.native
  trait DeleteLoadBalancerListenerOutput extends js.Object {

  }

  object DeleteLoadBalancerListenerOutput {
    def apply(): DeleteLoadBalancerListenerOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteLoadBalancerListenerOutput]
    }
  }

  /**
   * Contains the parameters for DeleteLoadBalancerPolicy.
   */
  @js.native
  trait DeleteLoadBalancerPolicyInput extends js.Object {
    var LoadBalancerName: AccessPointName
    var PolicyName: PolicyName
  }

  object DeleteLoadBalancerPolicyInput {
    def apply(
      LoadBalancerName: AccessPointName,
      PolicyName: PolicyName): DeleteLoadBalancerPolicyInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LoadBalancerName" -> LoadBalancerName.asInstanceOf[js.Any],
        "PolicyName" -> PolicyName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteLoadBalancerPolicyInput]
    }
  }

  /**
   * Contains the output of DeleteLoadBalancerPolicy.
   */
  @js.native
  trait DeleteLoadBalancerPolicyOutput extends js.Object {

  }

  object DeleteLoadBalancerPolicyOutput {
    def apply(): DeleteLoadBalancerPolicyOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteLoadBalancerPolicyOutput]
    }
  }

  /**
   * Contains the parameters for DeregisterInstancesFromLoadBalancer.
   */
  @js.native
  trait DeregisterEndPointsInput extends js.Object {
    var Instances: Instances
    var LoadBalancerName: AccessPointName
  }

  object DeregisterEndPointsInput {
    def apply(
      Instances: Instances,
      LoadBalancerName: AccessPointName): DeregisterEndPointsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Instances" -> Instances.asInstanceOf[js.Any],
        "LoadBalancerName" -> LoadBalancerName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeregisterEndPointsInput]
    }
  }

  /**
   * Contains the output of DeregisterInstancesFromLoadBalancer.
   */
  @js.native
  trait DeregisterEndPointsOutput extends js.Object {
    var Instances: js.UndefOr[Instances]
  }

  object DeregisterEndPointsOutput {
    def apply(
      Instances: js.UndefOr[Instances] = js.undefined): DeregisterEndPointsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Instances" -> Instances.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeregisterEndPointsOutput]
    }
  }

  /**
   * Contains the parameters for DescribeLoadBalancers.
   */
  @js.native
  trait DescribeAccessPointsInput extends js.Object {
    var LoadBalancerNames: js.UndefOr[LoadBalancerNames]
    var Marker: js.UndefOr[Marker]
    var PageSize: js.UndefOr[PageSize]
  }

  object DescribeAccessPointsInput {
    def apply(
      LoadBalancerNames: js.UndefOr[LoadBalancerNames] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined,
      PageSize: js.UndefOr[PageSize] = js.undefined): DescribeAccessPointsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LoadBalancerNames" -> LoadBalancerNames.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "PageSize" -> PageSize.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAccessPointsInput]
    }
  }

  /**
   * Contains the parameters for DescribeLoadBalancers.
   */
  @js.native
  trait DescribeAccessPointsOutput extends js.Object {
    var LoadBalancerDescriptions: js.UndefOr[LoadBalancerDescriptions]
    var NextMarker: js.UndefOr[Marker]
  }

  object DescribeAccessPointsOutput {
    def apply(
      LoadBalancerDescriptions: js.UndefOr[LoadBalancerDescriptions] = js.undefined,
      NextMarker: js.UndefOr[Marker] = js.undefined): DescribeAccessPointsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LoadBalancerDescriptions" -> LoadBalancerDescriptions.map { x => x.asInstanceOf[js.Any] },
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAccessPointsOutput]
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

  /**
   * Contains the parameters for DescribeInstanceHealth.
   */
  @js.native
  trait DescribeEndPointStateInput extends js.Object {
    var LoadBalancerName: AccessPointName
    var Instances: js.UndefOr[Instances]
  }

  object DescribeEndPointStateInput {
    def apply(
      LoadBalancerName: AccessPointName,
      Instances: js.UndefOr[Instances] = js.undefined): DescribeEndPointStateInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LoadBalancerName" -> LoadBalancerName.asInstanceOf[js.Any],
        "Instances" -> Instances.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEndPointStateInput]
    }
  }

  /**
   * Contains the output for DescribeInstanceHealth.
   */
  @js.native
  trait DescribeEndPointStateOutput extends js.Object {
    var InstanceStates: js.UndefOr[InstanceStates]
  }

  object DescribeEndPointStateOutput {
    def apply(
      InstanceStates: js.UndefOr[InstanceStates] = js.undefined): DescribeEndPointStateOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceStates" -> InstanceStates.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEndPointStateOutput]
    }
  }

  /**
   * Contains the parameters for DescribeLoadBalancerAttributes.
   */
  @js.native
  trait DescribeLoadBalancerAttributesInput extends js.Object {
    var LoadBalancerName: AccessPointName
  }

  object DescribeLoadBalancerAttributesInput {
    def apply(
      LoadBalancerName: AccessPointName): DescribeLoadBalancerAttributesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LoadBalancerName" -> LoadBalancerName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLoadBalancerAttributesInput]
    }
  }

  /**
   * Contains the output of DescribeLoadBalancerAttributes.
   */
  @js.native
  trait DescribeLoadBalancerAttributesOutput extends js.Object {
    var LoadBalancerAttributes: js.UndefOr[LoadBalancerAttributes]
  }

  object DescribeLoadBalancerAttributesOutput {
    def apply(
      LoadBalancerAttributes: js.UndefOr[LoadBalancerAttributes] = js.undefined): DescribeLoadBalancerAttributesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LoadBalancerAttributes" -> LoadBalancerAttributes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLoadBalancerAttributesOutput]
    }
  }

  /**
   * Contains the parameters for DescribeLoadBalancerPolicies.
   */
  @js.native
  trait DescribeLoadBalancerPoliciesInput extends js.Object {
    var LoadBalancerName: js.UndefOr[AccessPointName]
    var PolicyNames: js.UndefOr[PolicyNames]
  }

  object DescribeLoadBalancerPoliciesInput {
    def apply(
      LoadBalancerName: js.UndefOr[AccessPointName] = js.undefined,
      PolicyNames: js.UndefOr[PolicyNames] = js.undefined): DescribeLoadBalancerPoliciesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LoadBalancerName" -> LoadBalancerName.map { x => x.asInstanceOf[js.Any] },
        "PolicyNames" -> PolicyNames.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLoadBalancerPoliciesInput]
    }
  }

  /**
   * Contains the output of DescribeLoadBalancerPolicies.
   */
  @js.native
  trait DescribeLoadBalancerPoliciesOutput extends js.Object {
    var PolicyDescriptions: js.UndefOr[PolicyDescriptions]
  }

  object DescribeLoadBalancerPoliciesOutput {
    def apply(
      PolicyDescriptions: js.UndefOr[PolicyDescriptions] = js.undefined): DescribeLoadBalancerPoliciesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyDescriptions" -> PolicyDescriptions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLoadBalancerPoliciesOutput]
    }
  }

  /**
   * Contains the parameters for DescribeLoadBalancerPolicyTypes.
   */
  @js.native
  trait DescribeLoadBalancerPolicyTypesInput extends js.Object {
    var PolicyTypeNames: js.UndefOr[PolicyTypeNames]
  }

  object DescribeLoadBalancerPolicyTypesInput {
    def apply(
      PolicyTypeNames: js.UndefOr[PolicyTypeNames] = js.undefined): DescribeLoadBalancerPolicyTypesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyTypeNames" -> PolicyTypeNames.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLoadBalancerPolicyTypesInput]
    }
  }

  /**
   * Contains the output of DescribeLoadBalancerPolicyTypes.
   */
  @js.native
  trait DescribeLoadBalancerPolicyTypesOutput extends js.Object {
    var PolicyTypeDescriptions: js.UndefOr[PolicyTypeDescriptions]
  }

  object DescribeLoadBalancerPolicyTypesOutput {
    def apply(
      PolicyTypeDescriptions: js.UndefOr[PolicyTypeDescriptions] = js.undefined): DescribeLoadBalancerPolicyTypesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyTypeDescriptions" -> PolicyTypeDescriptions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLoadBalancerPolicyTypesOutput]
    }
  }

  /**
   * Contains the parameters for DescribeTags.
   */
  @js.native
  trait DescribeTagsInput extends js.Object {
    var LoadBalancerNames: LoadBalancerNamesMax20
  }

  object DescribeTagsInput {
    def apply(
      LoadBalancerNames: LoadBalancerNamesMax20): DescribeTagsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LoadBalancerNames" -> LoadBalancerNames.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTagsInput]
    }
  }

  /**
   * Contains the output for DescribeTags.
   */
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

  /**
   * Contains the parameters for DetachLoadBalancerFromSubnets.
   */
  @js.native
  trait DetachLoadBalancerFromSubnetsInput extends js.Object {
    var LoadBalancerName: AccessPointName
    var Subnets: Subnets
  }

  object DetachLoadBalancerFromSubnetsInput {
    def apply(
      LoadBalancerName: AccessPointName,
      Subnets: Subnets): DetachLoadBalancerFromSubnetsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LoadBalancerName" -> LoadBalancerName.asInstanceOf[js.Any],
        "Subnets" -> Subnets.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachLoadBalancerFromSubnetsInput]
    }
  }

  /**
   * Contains the output of DetachLoadBalancerFromSubnets.
   */
  @js.native
  trait DetachLoadBalancerFromSubnetsOutput extends js.Object {
    var Subnets: js.UndefOr[Subnets]
  }

  object DetachLoadBalancerFromSubnetsOutput {
    def apply(
      Subnets: js.UndefOr[Subnets] = js.undefined): DetachLoadBalancerFromSubnetsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Subnets" -> Subnets.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachLoadBalancerFromSubnetsOutput]
    }
  }

  /**
   * Information about a health check.
   */
  @js.native
  trait HealthCheck extends js.Object {
    var HealthyThreshold: HealthyThreshold
    var Interval: HealthCheckInterval
    var Target: HealthCheckTarget
    var Timeout: HealthCheckTimeout
    var UnhealthyThreshold: UnhealthyThreshold
  }

  object HealthCheck {
    def apply(
      HealthyThreshold: HealthyThreshold,
      Interval: HealthCheckInterval,
      Target: HealthCheckTarget,
      Timeout: HealthCheckTimeout,
      UnhealthyThreshold: UnhealthyThreshold): HealthCheck = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HealthyThreshold" -> HealthyThreshold.asInstanceOf[js.Any],
        "Interval" -> Interval.asInstanceOf[js.Any],
        "Target" -> Target.asInstanceOf[js.Any],
        "Timeout" -> Timeout.asInstanceOf[js.Any],
        "UnhealthyThreshold" -> UnhealthyThreshold.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HealthCheck]
    }
  }

  /**
   * The ID of an EC2 instance.
   */
  @js.native
  trait Instance extends js.Object {
    var InstanceId: js.UndefOr[InstanceId]
  }

  object Instance {
    def apply(
      InstanceId: js.UndefOr[InstanceId] = js.undefined): Instance = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Instance]
    }
  }

  /**
   * Information about the state of an EC2 instance.
   */
  @js.native
  trait InstanceState extends js.Object {
    var Description: js.UndefOr[Description]
    var InstanceId: js.UndefOr[InstanceId]
    var ReasonCode: js.UndefOr[ReasonCode]
    var State: js.UndefOr[State]
  }

  object InstanceState {
    def apply(
      Description: js.UndefOr[Description] = js.undefined,
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      ReasonCode: js.UndefOr[ReasonCode] = js.undefined,
      State: js.UndefOr[State] = js.undefined): InstanceState = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "ReasonCode" -> ReasonCode.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceState]
    }
  }

  /**
   * Information about a policy for duration-based session stickiness.
   */
  @js.native
  trait LBCookieStickinessPolicy extends js.Object {
    var CookieExpirationPeriod: js.UndefOr[CookieExpirationPeriod]
    var PolicyName: js.UndefOr[PolicyName]
  }

  object LBCookieStickinessPolicy {
    def apply(
      CookieExpirationPeriod: js.UndefOr[CookieExpirationPeriod] = js.undefined,
      PolicyName: js.UndefOr[PolicyName] = js.undefined): LBCookieStickinessPolicy = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CookieExpirationPeriod" -> CookieExpirationPeriod.map { x => x.asInstanceOf[js.Any] },
        "PolicyName" -> PolicyName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LBCookieStickinessPolicy]
    }
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
   *  For information about the protocols and the ports supported by Elastic Load Balancing, see <a href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-listener-config.html">Listeners for Your Classic Load Balancer</a> in the <i>Classic Load Balancers Guide</i>.
   */
  @js.native
  trait Listener extends js.Object {
    var InstancePort: InstancePort
    var LoadBalancerPort: AccessPointPort
    var Protocol: Protocol
    var InstanceProtocol: js.UndefOr[Protocol]
    var SSLCertificateId: js.UndefOr[SSLCertificateId]
  }

  object Listener {
    def apply(
      InstancePort: InstancePort,
      LoadBalancerPort: AccessPointPort,
      Protocol: Protocol,
      InstanceProtocol: js.UndefOr[Protocol] = js.undefined,
      SSLCertificateId: js.UndefOr[SSLCertificateId] = js.undefined): Listener = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstancePort" -> InstancePort.asInstanceOf[js.Any],
        "LoadBalancerPort" -> LoadBalancerPort.asInstanceOf[js.Any],
        "Protocol" -> Protocol.asInstanceOf[js.Any],
        "InstanceProtocol" -> InstanceProtocol.map { x => x.asInstanceOf[js.Any] },
        "SSLCertificateId" -> SSLCertificateId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Listener]
    }
  }

  /**
   * The policies enabled for a listener.
   */
  @js.native
  trait ListenerDescription extends js.Object {
    var Listener: js.UndefOr[Listener]
    var PolicyNames: js.UndefOr[PolicyNames]
  }

  object ListenerDescription {
    def apply(
      Listener: js.UndefOr[Listener] = js.undefined,
      PolicyNames: js.UndefOr[PolicyNames] = js.undefined): ListenerDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Listener" -> Listener.map { x => x.asInstanceOf[js.Any] },
        "PolicyNames" -> PolicyNames.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListenerDescription]
    }
  }

  /**
   * The attributes for a load balancer.
   */
  @js.native
  trait LoadBalancerAttributes extends js.Object {
    var AccessLog: js.UndefOr[AccessLog]
    var AdditionalAttributes: js.UndefOr[AdditionalAttributes]
    var ConnectionDraining: js.UndefOr[ConnectionDraining]
    var ConnectionSettings: js.UndefOr[ConnectionSettings]
    var CrossZoneLoadBalancing: js.UndefOr[CrossZoneLoadBalancing]
  }

  object LoadBalancerAttributes {
    def apply(
      AccessLog: js.UndefOr[AccessLog] = js.undefined,
      AdditionalAttributes: js.UndefOr[AdditionalAttributes] = js.undefined,
      ConnectionDraining: js.UndefOr[ConnectionDraining] = js.undefined,
      ConnectionSettings: js.UndefOr[ConnectionSettings] = js.undefined,
      CrossZoneLoadBalancing: js.UndefOr[CrossZoneLoadBalancing] = js.undefined): LoadBalancerAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccessLog" -> AccessLog.map { x => x.asInstanceOf[js.Any] },
        "AdditionalAttributes" -> AdditionalAttributes.map { x => x.asInstanceOf[js.Any] },
        "ConnectionDraining" -> ConnectionDraining.map { x => x.asInstanceOf[js.Any] },
        "ConnectionSettings" -> ConnectionSettings.map { x => x.asInstanceOf[js.Any] },
        "CrossZoneLoadBalancing" -> CrossZoneLoadBalancing.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LoadBalancerAttributes]
    }
  }

  /**
   * Information about a load balancer.
   */
  @js.native
  trait LoadBalancerDescription extends js.Object {
    var AvailabilityZones: js.UndefOr[AvailabilityZones]
    var BackendServerDescriptions: js.UndefOr[BackendServerDescriptions]
    var CanonicalHostedZoneName: js.UndefOr[DNSName]
    var CanonicalHostedZoneNameID: js.UndefOr[DNSName]
    var CreatedTime: js.UndefOr[CreatedTime]
    var DNSName: js.UndefOr[DNSName]
    var HealthCheck: js.UndefOr[HealthCheck]
    var Instances: js.UndefOr[Instances]
    var ListenerDescriptions: js.UndefOr[ListenerDescriptions]
    var LoadBalancerName: js.UndefOr[AccessPointName]
    var Policies: js.UndefOr[Policies]
    var Scheme: js.UndefOr[LoadBalancerScheme]
    var SecurityGroups: js.UndefOr[SecurityGroups]
    var SourceSecurityGroup: js.UndefOr[SourceSecurityGroup]
    var Subnets: js.UndefOr[Subnets]
    var VPCId: js.UndefOr[VPCId]
  }

  object LoadBalancerDescription {
    def apply(
      AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined,
      BackendServerDescriptions: js.UndefOr[BackendServerDescriptions] = js.undefined,
      CanonicalHostedZoneName: js.UndefOr[DNSName] = js.undefined,
      CanonicalHostedZoneNameID: js.UndefOr[DNSName] = js.undefined,
      CreatedTime: js.UndefOr[CreatedTime] = js.undefined,
      DNSName: js.UndefOr[DNSName] = js.undefined,
      HealthCheck: js.UndefOr[HealthCheck] = js.undefined,
      Instances: js.UndefOr[Instances] = js.undefined,
      ListenerDescriptions: js.UndefOr[ListenerDescriptions] = js.undefined,
      LoadBalancerName: js.UndefOr[AccessPointName] = js.undefined,
      Policies: js.UndefOr[Policies] = js.undefined,
      Scheme: js.UndefOr[LoadBalancerScheme] = js.undefined,
      SecurityGroups: js.UndefOr[SecurityGroups] = js.undefined,
      SourceSecurityGroup: js.UndefOr[SourceSecurityGroup] = js.undefined,
      Subnets: js.UndefOr[Subnets] = js.undefined,
      VPCId: js.UndefOr[VPCId] = js.undefined): LoadBalancerDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AvailabilityZones" -> AvailabilityZones.map { x => x.asInstanceOf[js.Any] },
        "BackendServerDescriptions" -> BackendServerDescriptions.map { x => x.asInstanceOf[js.Any] },
        "CanonicalHostedZoneName" -> CanonicalHostedZoneName.map { x => x.asInstanceOf[js.Any] },
        "CanonicalHostedZoneNameID" -> CanonicalHostedZoneNameID.map { x => x.asInstanceOf[js.Any] },
        "CreatedTime" -> CreatedTime.map { x => x.asInstanceOf[js.Any] },
        "DNSName" -> DNSName.map { x => x.asInstanceOf[js.Any] },
        "HealthCheck" -> HealthCheck.map { x => x.asInstanceOf[js.Any] },
        "Instances" -> Instances.map { x => x.asInstanceOf[js.Any] },
        "ListenerDescriptions" -> ListenerDescriptions.map { x => x.asInstanceOf[js.Any] },
        "LoadBalancerName" -> LoadBalancerName.map { x => x.asInstanceOf[js.Any] },
        "Policies" -> Policies.map { x => x.asInstanceOf[js.Any] },
        "Scheme" -> Scheme.map { x => x.asInstanceOf[js.Any] },
        "SecurityGroups" -> SecurityGroups.map { x => x.asInstanceOf[js.Any] },
        "SourceSecurityGroup" -> SourceSecurityGroup.map { x => x.asInstanceOf[js.Any] },
        "Subnets" -> Subnets.map { x => x.asInstanceOf[js.Any] },
        "VPCId" -> VPCId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LoadBalancerDescription]
    }
  }

  /**
   * Contains the parameters for ModifyLoadBalancerAttributes.
   */
  @js.native
  trait ModifyLoadBalancerAttributesInput extends js.Object {
    var LoadBalancerAttributes: LoadBalancerAttributes
    var LoadBalancerName: AccessPointName
  }

  object ModifyLoadBalancerAttributesInput {
    def apply(
      LoadBalancerAttributes: LoadBalancerAttributes,
      LoadBalancerName: AccessPointName): ModifyLoadBalancerAttributesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LoadBalancerAttributes" -> LoadBalancerAttributes.asInstanceOf[js.Any],
        "LoadBalancerName" -> LoadBalancerName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyLoadBalancerAttributesInput]
    }
  }

  /**
   * Contains the output of ModifyLoadBalancerAttributes.
   */
  @js.native
  trait ModifyLoadBalancerAttributesOutput extends js.Object {
    var LoadBalancerAttributes: js.UndefOr[LoadBalancerAttributes]
    var LoadBalancerName: js.UndefOr[AccessPointName]
  }

  object ModifyLoadBalancerAttributesOutput {
    def apply(
      LoadBalancerAttributes: js.UndefOr[LoadBalancerAttributes] = js.undefined,
      LoadBalancerName: js.UndefOr[AccessPointName] = js.undefined): ModifyLoadBalancerAttributesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LoadBalancerAttributes" -> LoadBalancerAttributes.map { x => x.asInstanceOf[js.Any] },
        "LoadBalancerName" -> LoadBalancerName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyLoadBalancerAttributesOutput]
    }
  }

  /**
   * The policies for a load balancer.
   */
  @js.native
  trait Policies extends js.Object {
    var AppCookieStickinessPolicies: js.UndefOr[AppCookieStickinessPolicies]
    var LBCookieStickinessPolicies: js.UndefOr[LBCookieStickinessPolicies]
    var OtherPolicies: js.UndefOr[PolicyNames]
  }

  object Policies {
    def apply(
      AppCookieStickinessPolicies: js.UndefOr[AppCookieStickinessPolicies] = js.undefined,
      LBCookieStickinessPolicies: js.UndefOr[LBCookieStickinessPolicies] = js.undefined,
      OtherPolicies: js.UndefOr[PolicyNames] = js.undefined): Policies = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AppCookieStickinessPolicies" -> AppCookieStickinessPolicies.map { x => x.asInstanceOf[js.Any] },
        "LBCookieStickinessPolicies" -> LBCookieStickinessPolicies.map { x => x.asInstanceOf[js.Any] },
        "OtherPolicies" -> OtherPolicies.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Policies]
    }
  }

  /**
   * Information about a policy attribute.
   */
  @js.native
  trait PolicyAttribute extends js.Object {
    var AttributeName: js.UndefOr[AttributeName]
    var AttributeValue: js.UndefOr[AttributeValue]
  }

  object PolicyAttribute {
    def apply(
      AttributeName: js.UndefOr[AttributeName] = js.undefined,
      AttributeValue: js.UndefOr[AttributeValue] = js.undefined): PolicyAttribute = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttributeName" -> AttributeName.map { x => x.asInstanceOf[js.Any] },
        "AttributeValue" -> AttributeValue.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PolicyAttribute]
    }
  }

  /**
   * Information about a policy attribute.
   */
  @js.native
  trait PolicyAttributeDescription extends js.Object {
    var AttributeName: js.UndefOr[AttributeName]
    var AttributeValue: js.UndefOr[AttributeValue]
  }

  object PolicyAttributeDescription {
    def apply(
      AttributeName: js.UndefOr[AttributeName] = js.undefined,
      AttributeValue: js.UndefOr[AttributeValue] = js.undefined): PolicyAttributeDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttributeName" -> AttributeName.map { x => x.asInstanceOf[js.Any] },
        "AttributeValue" -> AttributeValue.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PolicyAttributeDescription]
    }
  }

  /**
   * Information about a policy attribute type.
   */
  @js.native
  trait PolicyAttributeTypeDescription extends js.Object {
    var AttributeName: js.UndefOr[AttributeName]
    var AttributeType: js.UndefOr[AttributeType]
    var Cardinality: js.UndefOr[Cardinality]
    var DefaultValue: js.UndefOr[DefaultValue]
    var Description: js.UndefOr[Description]
  }

  object PolicyAttributeTypeDescription {
    def apply(
      AttributeName: js.UndefOr[AttributeName] = js.undefined,
      AttributeType: js.UndefOr[AttributeType] = js.undefined,
      Cardinality: js.UndefOr[Cardinality] = js.undefined,
      DefaultValue: js.UndefOr[DefaultValue] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined): PolicyAttributeTypeDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttributeName" -> AttributeName.map { x => x.asInstanceOf[js.Any] },
        "AttributeType" -> AttributeType.map { x => x.asInstanceOf[js.Any] },
        "Cardinality" -> Cardinality.map { x => x.asInstanceOf[js.Any] },
        "DefaultValue" -> DefaultValue.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PolicyAttributeTypeDescription]
    }
  }

  /**
   * Information about a policy.
   */
  @js.native
  trait PolicyDescription extends js.Object {
    var PolicyAttributeDescriptions: js.UndefOr[PolicyAttributeDescriptions]
    var PolicyName: js.UndefOr[PolicyName]
    var PolicyTypeName: js.UndefOr[PolicyTypeName]
  }

  object PolicyDescription {
    def apply(
      PolicyAttributeDescriptions: js.UndefOr[PolicyAttributeDescriptions] = js.undefined,
      PolicyName: js.UndefOr[PolicyName] = js.undefined,
      PolicyTypeName: js.UndefOr[PolicyTypeName] = js.undefined): PolicyDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PolicyAttributeDescriptions" -> PolicyAttributeDescriptions.map { x => x.asInstanceOf[js.Any] },
        "PolicyName" -> PolicyName.map { x => x.asInstanceOf[js.Any] },
        "PolicyTypeName" -> PolicyTypeName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PolicyDescription]
    }
  }

  /**
   * Information about a policy type.
   */
  @js.native
  trait PolicyTypeDescription extends js.Object {
    var Description: js.UndefOr[Description]
    var PolicyAttributeTypeDescriptions: js.UndefOr[PolicyAttributeTypeDescriptions]
    var PolicyTypeName: js.UndefOr[PolicyTypeName]
  }

  object PolicyTypeDescription {
    def apply(
      Description: js.UndefOr[Description] = js.undefined,
      PolicyAttributeTypeDescriptions: js.UndefOr[PolicyAttributeTypeDescriptions] = js.undefined,
      PolicyTypeName: js.UndefOr[PolicyTypeName] = js.undefined): PolicyTypeDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "PolicyAttributeTypeDescriptions" -> PolicyAttributeTypeDescriptions.map { x => x.asInstanceOf[js.Any] },
        "PolicyTypeName" -> PolicyTypeName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PolicyTypeDescription]
    }
  }

  /**
   * Contains the parameters for RegisterInstancesWithLoadBalancer.
   */
  @js.native
  trait RegisterEndPointsInput extends js.Object {
    var Instances: Instances
    var LoadBalancerName: AccessPointName
  }

  object RegisterEndPointsInput {
    def apply(
      Instances: Instances,
      LoadBalancerName: AccessPointName): RegisterEndPointsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Instances" -> Instances.asInstanceOf[js.Any],
        "LoadBalancerName" -> LoadBalancerName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterEndPointsInput]
    }
  }

  /**
   * Contains the output of RegisterInstancesWithLoadBalancer.
   */
  @js.native
  trait RegisterEndPointsOutput extends js.Object {
    var Instances: js.UndefOr[Instances]
  }

  object RegisterEndPointsOutput {
    def apply(
      Instances: js.UndefOr[Instances] = js.undefined): RegisterEndPointsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Instances" -> Instances.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterEndPointsOutput]
    }
  }

  /**
   * Contains the parameters for DisableAvailabilityZonesForLoadBalancer.
   */
  @js.native
  trait RemoveAvailabilityZonesInput extends js.Object {
    var AvailabilityZones: AvailabilityZones
    var LoadBalancerName: AccessPointName
  }

  object RemoveAvailabilityZonesInput {
    def apply(
      AvailabilityZones: AvailabilityZones,
      LoadBalancerName: AccessPointName): RemoveAvailabilityZonesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AvailabilityZones" -> AvailabilityZones.asInstanceOf[js.Any],
        "LoadBalancerName" -> LoadBalancerName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveAvailabilityZonesInput]
    }
  }

  /**
   * Contains the output for DisableAvailabilityZonesForLoadBalancer.
   */
  @js.native
  trait RemoveAvailabilityZonesOutput extends js.Object {
    var AvailabilityZones: js.UndefOr[AvailabilityZones]
  }

  object RemoveAvailabilityZonesOutput {
    def apply(
      AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined): RemoveAvailabilityZonesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AvailabilityZones" -> AvailabilityZones.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveAvailabilityZonesOutput]
    }
  }

  /**
   * Contains the parameters for RemoveTags.
   */
  @js.native
  trait RemoveTagsInput extends js.Object {
    var LoadBalancerNames: LoadBalancerNames
    var Tags: TagKeyList
  }

  object RemoveTagsInput {
    def apply(
      LoadBalancerNames: LoadBalancerNames,
      Tags: TagKeyList): RemoveTagsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LoadBalancerNames" -> LoadBalancerNames.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveTagsInput]
    }
  }

  /**
   * Contains the output of RemoveTags.
   */
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
   * Contains the parameters for SetLoadBalancerListenerSSLCertificate.
   */
  @js.native
  trait SetLoadBalancerListenerSSLCertificateInput extends js.Object {
    var LoadBalancerName: AccessPointName
    var LoadBalancerPort: AccessPointPort
    var SSLCertificateId: SSLCertificateId
  }

  object SetLoadBalancerListenerSSLCertificateInput {
    def apply(
      LoadBalancerName: AccessPointName,
      LoadBalancerPort: AccessPointPort,
      SSLCertificateId: SSLCertificateId): SetLoadBalancerListenerSSLCertificateInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LoadBalancerName" -> LoadBalancerName.asInstanceOf[js.Any],
        "LoadBalancerPort" -> LoadBalancerPort.asInstanceOf[js.Any],
        "SSLCertificateId" -> SSLCertificateId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetLoadBalancerListenerSSLCertificateInput]
    }
  }

  /**
   * Contains the output of SetLoadBalancerListenerSSLCertificate.
   */
  @js.native
  trait SetLoadBalancerListenerSSLCertificateOutput extends js.Object {

  }

  object SetLoadBalancerListenerSSLCertificateOutput {
    def apply(): SetLoadBalancerListenerSSLCertificateOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetLoadBalancerListenerSSLCertificateOutput]
    }
  }

  /**
   * Contains the parameters for SetLoadBalancerPoliciesForBackendServer.
   */
  @js.native
  trait SetLoadBalancerPoliciesForBackendServerInput extends js.Object {
    var InstancePort: EndPointPort
    var LoadBalancerName: AccessPointName
    var PolicyNames: PolicyNames
  }

  object SetLoadBalancerPoliciesForBackendServerInput {
    def apply(
      InstancePort: EndPointPort,
      LoadBalancerName: AccessPointName,
      PolicyNames: PolicyNames): SetLoadBalancerPoliciesForBackendServerInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstancePort" -> InstancePort.asInstanceOf[js.Any],
        "LoadBalancerName" -> LoadBalancerName.asInstanceOf[js.Any],
        "PolicyNames" -> PolicyNames.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetLoadBalancerPoliciesForBackendServerInput]
    }
  }

  /**
   * Contains the output of SetLoadBalancerPoliciesForBackendServer.
   */
  @js.native
  trait SetLoadBalancerPoliciesForBackendServerOutput extends js.Object {

  }

  object SetLoadBalancerPoliciesForBackendServerOutput {
    def apply(): SetLoadBalancerPoliciesForBackendServerOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetLoadBalancerPoliciesForBackendServerOutput]
    }
  }

  /**
   * Contains the parameters for SetLoadBalancePoliciesOfListener.
   */
  @js.native
  trait SetLoadBalancerPoliciesOfListenerInput extends js.Object {
    var LoadBalancerName: AccessPointName
    var LoadBalancerPort: AccessPointPort
    var PolicyNames: PolicyNames
  }

  object SetLoadBalancerPoliciesOfListenerInput {
    def apply(
      LoadBalancerName: AccessPointName,
      LoadBalancerPort: AccessPointPort,
      PolicyNames: PolicyNames): SetLoadBalancerPoliciesOfListenerInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LoadBalancerName" -> LoadBalancerName.asInstanceOf[js.Any],
        "LoadBalancerPort" -> LoadBalancerPort.asInstanceOf[js.Any],
        "PolicyNames" -> PolicyNames.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetLoadBalancerPoliciesOfListenerInput]
    }
  }

  /**
   * Contains the output of SetLoadBalancePoliciesOfListener.
   */
  @js.native
  trait SetLoadBalancerPoliciesOfListenerOutput extends js.Object {

  }

  object SetLoadBalancerPoliciesOfListenerOutput {
    def apply(): SetLoadBalancerPoliciesOfListenerOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetLoadBalancerPoliciesOfListenerOutput]
    }
  }

  /**
   * Information about a source security group.
   */
  @js.native
  trait SourceSecurityGroup extends js.Object {
    var GroupName: js.UndefOr[SecurityGroupName]
    var OwnerAlias: js.UndefOr[SecurityGroupOwnerAlias]
  }

  object SourceSecurityGroup {
    def apply(
      GroupName: js.UndefOr[SecurityGroupName] = js.undefined,
      OwnerAlias: js.UndefOr[SecurityGroupOwnerAlias] = js.undefined): SourceSecurityGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupName" -> GroupName.map { x => x.asInstanceOf[js.Any] },
        "OwnerAlias" -> OwnerAlias.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SourceSecurityGroup]
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
   * The tags associated with a load balancer.
   */
  @js.native
  trait TagDescription extends js.Object {
    var LoadBalancerName: js.UndefOr[AccessPointName]
    var Tags: js.UndefOr[TagList]
  }

  object TagDescription {
    def apply(
      LoadBalancerName: js.UndefOr[AccessPointName] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): TagDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LoadBalancerName" -> LoadBalancerName.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagDescription]
    }
  }

  /**
   * The key of a tag.
   */
  @js.native
  trait TagKeyOnly extends js.Object {
    var Key: js.UndefOr[TagKey]
  }

  object TagKeyOnly {
    def apply(
      Key: js.UndefOr[TagKey] = js.undefined): TagKeyOnly = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagKeyOnly]
    }
  }
}
