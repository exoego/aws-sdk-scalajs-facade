package facade.amazonaws.services

import scalajs._
import facade.amazonaws._

package object elasticloadbalancing {
  type AccessLogEnabled = Boolean
  type AccessLogInterval = Integer
  type AccessLogPrefix = String
  type AccessPointName = String
  type AccessPointPort = Integer
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
  type ConnectionDrainingTimeout = Integer
  type CookieExpirationPeriod = Long
  type CookieName = String
  type CreatedTime = js.Date
  type CrossZoneLoadBalancingEnabled = Boolean
  type DNSName = String
  type DefaultValue = String
  type Description = String
  type EndPointPort = Integer
  type HealthCheckInterval = Integer
  type HealthCheckTarget = String
  type HealthCheckTimeout = Integer
  type HealthyThreshold = Integer
  type IdleTimeout = Integer
  type InstanceId = String
  type InstancePort = Integer
  type InstanceStates = js.Array[InstanceState]
  type Instances = js.Array[Instance]
  type LBCookieStickinessPolicies = js.Array[LBCookieStickinessPolicy]
  type ListenerDescriptions = js.Array[ListenerDescription]
  type Listeners = js.Array[Listener]
  type LoadBalancerDescriptions = js.Array[LoadBalancerDescription]
  type LoadBalancerNames = js.Array[AccessPointName]
  type LoadBalancerNamesMax20 = js.Array[AccessPointName]
  type LoadBalancerScheme = String
  type Marker = String
  type PageSize = Integer
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
  type UnhealthyThreshold = Integer
  type VPCId = String
}

package elasticloadbalancing {
  @js.native
  trait Elasticloadbalancing extends js.Object {
    def addTags(params: AddTagsInput, callback: Callback[AddTagsOutput]): Unit = js.native
    def addTags(params: AddTagsInput): Request[AddTagsOutput] = js.native
    def applySecurityGroupsToLoadBalancer(params: ApplySecurityGroupsToLoadBalancerInput, callback: Callback[ApplySecurityGroupsToLoadBalancerOutput]): Unit = js.native
    def applySecurityGroupsToLoadBalancer(params: ApplySecurityGroupsToLoadBalancerInput): Request[ApplySecurityGroupsToLoadBalancerOutput] = js.native
    def attachLoadBalancerToSubnets(params: AttachLoadBalancerToSubnetsInput, callback: Callback[AttachLoadBalancerToSubnetsOutput]): Unit = js.native
    def attachLoadBalancerToSubnets(params: AttachLoadBalancerToSubnetsInput): Request[AttachLoadBalancerToSubnetsOutput] = js.native
    def configureHealthCheck(params: ConfigureHealthCheckInput, callback: Callback[ConfigureHealthCheckOutput]): Unit = js.native
    def configureHealthCheck(params: ConfigureHealthCheckInput): Request[ConfigureHealthCheckOutput] = js.native
    def createAppCookieStickinessPolicy(params: CreateAppCookieStickinessPolicyInput, callback: Callback[CreateAppCookieStickinessPolicyOutput]): Unit = js.native
    def createAppCookieStickinessPolicy(params: CreateAppCookieStickinessPolicyInput): Request[CreateAppCookieStickinessPolicyOutput] = js.native
    def createLBCookieStickinessPolicy(params: CreateLBCookieStickinessPolicyInput, callback: Callback[CreateLBCookieStickinessPolicyOutput]): Unit = js.native
    def createLBCookieStickinessPolicy(params: CreateLBCookieStickinessPolicyInput): Request[CreateLBCookieStickinessPolicyOutput] = js.native
    def createLoadBalancer(params: CreateAccessPointInput, callback: Callback[CreateAccessPointOutput]): Unit = js.native
    def createLoadBalancer(params: CreateAccessPointInput): Request[CreateAccessPointOutput] = js.native
    def createLoadBalancerListeners(params: CreateLoadBalancerListenerInput, callback: Callback[CreateLoadBalancerListenerOutput]): Unit = js.native
    def createLoadBalancerListeners(params: CreateLoadBalancerListenerInput): Request[CreateLoadBalancerListenerOutput] = js.native
    def createLoadBalancerPolicy(params: CreateLoadBalancerPolicyInput, callback: Callback[CreateLoadBalancerPolicyOutput]): Unit = js.native
    def createLoadBalancerPolicy(params: CreateLoadBalancerPolicyInput): Request[CreateLoadBalancerPolicyOutput] = js.native
    def deleteLoadBalancer(params: DeleteAccessPointInput, callback: Callback[DeleteAccessPointOutput]): Unit = js.native
    def deleteLoadBalancer(params: DeleteAccessPointInput): Request[DeleteAccessPointOutput] = js.native
    def deleteLoadBalancerListeners(params: DeleteLoadBalancerListenerInput, callback: Callback[DeleteLoadBalancerListenerOutput]): Unit = js.native
    def deleteLoadBalancerListeners(params: DeleteLoadBalancerListenerInput): Request[DeleteLoadBalancerListenerOutput] = js.native
    def deleteLoadBalancerPolicy(params: DeleteLoadBalancerPolicyInput, callback: Callback[DeleteLoadBalancerPolicyOutput]): Unit = js.native
    def deleteLoadBalancerPolicy(params: DeleteLoadBalancerPolicyInput): Request[DeleteLoadBalancerPolicyOutput] = js.native
    def deregisterInstancesFromLoadBalancer(params: DeregisterEndPointsInput, callback: Callback[DeregisterEndPointsOutput]): Unit = js.native
    def deregisterInstancesFromLoadBalancer(params: DeregisterEndPointsInput): Request[DeregisterEndPointsOutput] = js.native
    def describeInstanceHealth(params: DescribeEndPointStateInput, callback: Callback[DescribeEndPointStateOutput]): Unit = js.native
    def describeInstanceHealth(params: DescribeEndPointStateInput): Request[DescribeEndPointStateOutput] = js.native
    def describeLoadBalancerAttributes(params: DescribeLoadBalancerAttributesInput, callback: Callback[DescribeLoadBalancerAttributesOutput]): Unit = js.native
    def describeLoadBalancerAttributes(params: DescribeLoadBalancerAttributesInput): Request[DescribeLoadBalancerAttributesOutput] = js.native
    def describeLoadBalancerPolicies(params: DescribeLoadBalancerPoliciesInput, callback: Callback[DescribeLoadBalancerPoliciesOutput]): Unit = js.native
    def describeLoadBalancerPolicies(params: DescribeLoadBalancerPoliciesInput): Request[DescribeLoadBalancerPoliciesOutput] = js.native
    def describeLoadBalancerPolicyTypes(params: DescribeLoadBalancerPolicyTypesInput, callback: Callback[DescribeLoadBalancerPolicyTypesOutput]): Unit = js.native
    def describeLoadBalancerPolicyTypes(params: DescribeLoadBalancerPolicyTypesInput): Request[DescribeLoadBalancerPolicyTypesOutput] = js.native
    def describeLoadBalancers(params: DescribeAccessPointsInput, callback: Callback[DescribeAccessPointsOutput]): Unit = js.native
    def describeLoadBalancers(params: DescribeAccessPointsInput): Request[DescribeAccessPointsOutput] = js.native
    def describeTags(params: DescribeTagsInput, callback: Callback[DescribeTagsOutput]): Unit = js.native
    def describeTags(params: DescribeTagsInput): Request[DescribeTagsOutput] = js.native
    def detachLoadBalancerFromSubnets(params: DetachLoadBalancerFromSubnetsInput, callback: Callback[DetachLoadBalancerFromSubnetsOutput]): Unit = js.native
    def detachLoadBalancerFromSubnets(params: DetachLoadBalancerFromSubnetsInput): Request[DetachLoadBalancerFromSubnetsOutput] = js.native
    def disableAvailabilityZonesForLoadBalancer(params: RemoveAvailabilityZonesInput, callback: Callback[RemoveAvailabilityZonesOutput]): Unit = js.native
    def disableAvailabilityZonesForLoadBalancer(params: RemoveAvailabilityZonesInput): Request[RemoveAvailabilityZonesOutput] = js.native
    def enableAvailabilityZonesForLoadBalancer(params: AddAvailabilityZonesInput, callback: Callback[AddAvailabilityZonesOutput]): Unit = js.native
    def enableAvailabilityZonesForLoadBalancer(params: AddAvailabilityZonesInput): Request[AddAvailabilityZonesOutput] = js.native
    def modifyLoadBalancerAttributes(params: ModifyLoadBalancerAttributesInput, callback: Callback[ModifyLoadBalancerAttributesOutput]): Unit = js.native
    def modifyLoadBalancerAttributes(params: ModifyLoadBalancerAttributesInput): Request[ModifyLoadBalancerAttributesOutput] = js.native
    def registerInstancesWithLoadBalancer(params: RegisterEndPointsInput, callback: Callback[RegisterEndPointsOutput]): Unit = js.native
    def registerInstancesWithLoadBalancer(params: RegisterEndPointsInput): Request[RegisterEndPointsOutput] = js.native
    def removeTags(params: RemoveTagsInput, callback: Callback[RemoveTagsOutput]): Unit = js.native
    def removeTags(params: RemoveTagsInput): Request[RemoveTagsOutput] = js.native
    def setLoadBalancerListenerSSLCertificate(params: SetLoadBalancerListenerSSLCertificateInput, callback: Callback[SetLoadBalancerListenerSSLCertificateOutput]): Unit = js.native
    def setLoadBalancerListenerSSLCertificate(params: SetLoadBalancerListenerSSLCertificateInput): Request[SetLoadBalancerListenerSSLCertificateOutput] = js.native
    def setLoadBalancerPoliciesForBackendServer(params: SetLoadBalancerPoliciesForBackendServerInput, callback: Callback[SetLoadBalancerPoliciesForBackendServerOutput]): Unit = js.native
    def setLoadBalancerPoliciesForBackendServer(params: SetLoadBalancerPoliciesForBackendServerInput): Request[SetLoadBalancerPoliciesForBackendServerOutput] = js.native
    def setLoadBalancerPoliciesOfListener(params: SetLoadBalancerPoliciesOfListenerInput, callback: Callback[SetLoadBalancerPoliciesOfListenerOutput]): Unit = js.native
    def setLoadBalancerPoliciesOfListener(params: SetLoadBalancerPoliciesOfListenerInput): Request[SetLoadBalancerPoliciesOfListenerOutput] = js.native
  }

  /**
   * <p>Information about the <code>AccessLog</code> attribute.</p>
   */
  @js.native
  trait AccessLog extends js.Object {
    var Enabled: AccessLogEnabled
    var S3BucketName: S3BucketName
    var EmitInterval: AccessLogInterval
    var S3BucketPrefix: AccessLogPrefix
  }

  object AccessLog {
    def apply(
      Enabled: js.UndefOr[AccessLogEnabled] = js.undefined,
      S3BucketName: js.UndefOr[S3BucketName] = js.undefined,
      EmitInterval: js.UndefOr[AccessLogInterval] = js.undefined,
      S3BucketPrefix: js.UndefOr[AccessLogPrefix] = js.undefined
    ): AccessLog = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Enabled" -> Enabled.map { x => x: js.Any }),
        ("S3BucketName" -> S3BucketName.map { x => x: js.Any }),
        ("EmitInterval" -> EmitInterval.map { x => x: js.Any }),
        ("S3BucketPrefix" -> S3BucketPrefix.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AccessLog]
    }
  }

  /**
   * <p>The specified load balancer does not exist.</p>
   */
  @js.native
  trait AccessPointNotFoundExceptionException extends js.Object {

  }

  /**
   * <p>Contains the parameters for EnableAvailabilityZonesForLoadBalancer.</p>
   */
  @js.native
  trait AddAvailabilityZonesInput extends js.Object {
    var LoadBalancerName: AccessPointName
    var AvailabilityZones: AvailabilityZones
  }

  object AddAvailabilityZonesInput {
    def apply(
      LoadBalancerName: js.UndefOr[AccessPointName] = js.undefined,
      AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined
    ): AddAvailabilityZonesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LoadBalancerName" -> LoadBalancerName.map { x => x: js.Any }),
        ("AvailabilityZones" -> AvailabilityZones.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddAvailabilityZonesInput]
    }
  }

  /**
   * <p>Contains the output of EnableAvailabilityZonesForLoadBalancer.</p>
   */
  @js.native
  trait AddAvailabilityZonesOutput extends js.Object {
    var AvailabilityZones: AvailabilityZones
  }

  object AddAvailabilityZonesOutput {
    def apply(
      AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined
    ): AddAvailabilityZonesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AvailabilityZones" -> AvailabilityZones.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddAvailabilityZonesOutput]
    }
  }

  /**
   * <p>Contains the parameters for AddTags.</p>
   */
  @js.native
  trait AddTagsInput extends js.Object {
    var LoadBalancerNames: LoadBalancerNames
    var Tags: TagList
  }

  object AddTagsInput {
    def apply(
      LoadBalancerNames: js.UndefOr[LoadBalancerNames] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined
    ): AddTagsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LoadBalancerNames" -> LoadBalancerNames.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddTagsInput]
    }
  }

  /**
   * <p>Contains the output of AddTags.</p>
   */
  @js.native
  trait AddTagsOutput extends js.Object {

  }

  object AddTagsOutput {
    def apply(

    ): AddTagsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddTagsOutput]
    }
  }

  /**
   * <p>This data type is reserved.</p>
   */
  @js.native
  trait AdditionalAttribute extends js.Object {
    var Key: AdditionalAttributeKey
    var Value: AdditionalAttributeValue
  }

  object AdditionalAttribute {
    def apply(
      Key: js.UndefOr[AdditionalAttributeKey] = js.undefined,
      Value: js.UndefOr[AdditionalAttributeValue] = js.undefined
    ): AdditionalAttribute = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Key" -> Key.map { x => x: js.Any }),
        ("Value" -> Value.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdditionalAttribute]
    }
  }

  /**
   * <p>Information about a policy for application-controlled session stickiness.</p>
   */
  @js.native
  trait AppCookieStickinessPolicy extends js.Object {
    var PolicyName: PolicyName
    var CookieName: CookieName
  }

  object AppCookieStickinessPolicy {
    def apply(
      PolicyName: js.UndefOr[PolicyName] = js.undefined,
      CookieName: js.UndefOr[CookieName] = js.undefined
    ): AppCookieStickinessPolicy = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PolicyName" -> PolicyName.map { x => x: js.Any }),
        ("CookieName" -> CookieName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AppCookieStickinessPolicy]
    }
  }

  /**
   * <p>Contains the parameters for ApplySecurityGroupsToLoadBalancer.</p>
   */
  @js.native
  trait ApplySecurityGroupsToLoadBalancerInput extends js.Object {
    var LoadBalancerName: AccessPointName
    var SecurityGroups: SecurityGroups
  }

  object ApplySecurityGroupsToLoadBalancerInput {
    def apply(
      LoadBalancerName: js.UndefOr[AccessPointName] = js.undefined,
      SecurityGroups: js.UndefOr[SecurityGroups] = js.undefined
    ): ApplySecurityGroupsToLoadBalancerInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LoadBalancerName" -> LoadBalancerName.map { x => x: js.Any }),
        ("SecurityGroups" -> SecurityGroups.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApplySecurityGroupsToLoadBalancerInput]
    }
  }

  /**
   * <p>Contains the output of ApplySecurityGroupsToLoadBalancer.</p>
   */
  @js.native
  trait ApplySecurityGroupsToLoadBalancerOutput extends js.Object {
    var SecurityGroups: SecurityGroups
  }

  object ApplySecurityGroupsToLoadBalancerOutput {
    def apply(
      SecurityGroups: js.UndefOr[SecurityGroups] = js.undefined
    ): ApplySecurityGroupsToLoadBalancerOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SecurityGroups" -> SecurityGroups.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApplySecurityGroupsToLoadBalancerOutput]
    }
  }

  /**
   * <p>Contains the parameters for AttachLoaBalancerToSubnets.</p>
   */
  @js.native
  trait AttachLoadBalancerToSubnetsInput extends js.Object {
    var LoadBalancerName: AccessPointName
    var Subnets: Subnets
  }

  object AttachLoadBalancerToSubnetsInput {
    def apply(
      LoadBalancerName: js.UndefOr[AccessPointName] = js.undefined,
      Subnets: js.UndefOr[Subnets] = js.undefined
    ): AttachLoadBalancerToSubnetsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LoadBalancerName" -> LoadBalancerName.map { x => x: js.Any }),
        ("Subnets" -> Subnets.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachLoadBalancerToSubnetsInput]
    }
  }

  /**
   * <p>Contains the output of AttachLoadBalancerToSubnets.</p>
   */
  @js.native
  trait AttachLoadBalancerToSubnetsOutput extends js.Object {
    var Subnets: Subnets
  }

  object AttachLoadBalancerToSubnetsOutput {
    def apply(
      Subnets: js.UndefOr[Subnets] = js.undefined
    ): AttachLoadBalancerToSubnetsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Subnets" -> Subnets.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachLoadBalancerToSubnetsOutput]
    }
  }

  /**
   * <p>Information about the configuration of an EC2 instance.</p>
   */
  @js.native
  trait BackendServerDescription extends js.Object {
    var InstancePort: InstancePort
    var PolicyNames: PolicyNames
  }

  object BackendServerDescription {
    def apply(
      InstancePort: js.UndefOr[InstancePort] = js.undefined,
      PolicyNames: js.UndefOr[PolicyNames] = js.undefined
    ): BackendServerDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstancePort" -> InstancePort.map { x => x: js.Any }),
        ("PolicyNames" -> PolicyNames.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BackendServerDescription]
    }
  }

  /**
   * <p>The specified ARN does not refer to a valid SSL certificate in AWS Identity and Access Management (IAM) or AWS Certificate Manager (ACM). Note that if you recently uploaded the certificate to IAM, this error might indicate that the certificate is not fully available yet.</p>
   */
  @js.native
  trait CertificateNotFoundExceptionException extends js.Object {

  }

  /**
   * <p>Contains the parameters for ConfigureHealthCheck.</p>
   */
  @js.native
  trait ConfigureHealthCheckInput extends js.Object {
    var LoadBalancerName: AccessPointName
    var HealthCheck: HealthCheck
  }

  object ConfigureHealthCheckInput {
    def apply(
      LoadBalancerName: js.UndefOr[AccessPointName] = js.undefined,
      HealthCheck: js.UndefOr[HealthCheck] = js.undefined
    ): ConfigureHealthCheckInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LoadBalancerName" -> LoadBalancerName.map { x => x: js.Any }),
        ("HealthCheck" -> HealthCheck.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfigureHealthCheckInput]
    }
  }

  /**
   * <p>Contains the output of ConfigureHealthCheck.</p>
   */
  @js.native
  trait ConfigureHealthCheckOutput extends js.Object {
    var HealthCheck: HealthCheck
  }

  object ConfigureHealthCheckOutput {
    def apply(
      HealthCheck: js.UndefOr[HealthCheck] = js.undefined
    ): ConfigureHealthCheckOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("HealthCheck" -> HealthCheck.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfigureHealthCheckOutput]
    }
  }

  /**
   * <p>Information about the <code>ConnectionDraining</code> attribute.</p>
   */
  @js.native
  trait ConnectionDraining extends js.Object {
    var Enabled: ConnectionDrainingEnabled
    var Timeout: ConnectionDrainingTimeout
  }

  object ConnectionDraining {
    def apply(
      Enabled: js.UndefOr[ConnectionDrainingEnabled] = js.undefined,
      Timeout: js.UndefOr[ConnectionDrainingTimeout] = js.undefined
    ): ConnectionDraining = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Enabled" -> Enabled.map { x => x: js.Any }),
        ("Timeout" -> Timeout.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConnectionDraining]
    }
  }

  /**
   * <p>Information about the <code>ConnectionSettings</code> attribute.</p>
   */
  @js.native
  trait ConnectionSettings extends js.Object {
    var IdleTimeout: IdleTimeout
  }

  object ConnectionSettings {
    def apply(
      IdleTimeout: js.UndefOr[IdleTimeout] = js.undefined
    ): ConnectionSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IdleTimeout" -> IdleTimeout.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConnectionSettings]
    }
  }

  /**
   * <p>Contains the parameters for CreateLoadBalancer.</p>
   */
  @js.native
  trait CreateAccessPointInput extends js.Object {
    var Listeners: Listeners
    var Subnets: Subnets
    var SecurityGroups: SecurityGroups
    var LoadBalancerName: AccessPointName
    var Tags: TagList
    var Scheme: LoadBalancerScheme
    var AvailabilityZones: AvailabilityZones
  }

  object CreateAccessPointInput {
    def apply(
      Listeners: js.UndefOr[Listeners] = js.undefined,
      Subnets: js.UndefOr[Subnets] = js.undefined,
      SecurityGroups: js.UndefOr[SecurityGroups] = js.undefined,
      LoadBalancerName: js.UndefOr[AccessPointName] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      Scheme: js.UndefOr[LoadBalancerScheme] = js.undefined,
      AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined
    ): CreateAccessPointInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Listeners" -> Listeners.map { x => x: js.Any }),
        ("Subnets" -> Subnets.map { x => x: js.Any }),
        ("SecurityGroups" -> SecurityGroups.map { x => x: js.Any }),
        ("LoadBalancerName" -> LoadBalancerName.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any }),
        ("Scheme" -> Scheme.map { x => x: js.Any }),
        ("AvailabilityZones" -> AvailabilityZones.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAccessPointInput]
    }
  }

  /**
   * <p>Contains the output for CreateLoadBalancer.</p>
   */
  @js.native
  trait CreateAccessPointOutput extends js.Object {
    var DNSName: DNSName
  }

  object CreateAccessPointOutput {
    def apply(
      DNSName: js.UndefOr[DNSName] = js.undefined
    ): CreateAccessPointOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DNSName" -> DNSName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAccessPointOutput]
    }
  }

  /**
   * <p>Contains the parameters for CreateAppCookieStickinessPolicy.</p>
   */
  @js.native
  trait CreateAppCookieStickinessPolicyInput extends js.Object {
    var LoadBalancerName: AccessPointName
    var PolicyName: PolicyName
    var CookieName: CookieName
  }

  object CreateAppCookieStickinessPolicyInput {
    def apply(
      LoadBalancerName: js.UndefOr[AccessPointName] = js.undefined,
      PolicyName: js.UndefOr[PolicyName] = js.undefined,
      CookieName: js.UndefOr[CookieName] = js.undefined
    ): CreateAppCookieStickinessPolicyInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LoadBalancerName" -> LoadBalancerName.map { x => x: js.Any }),
        ("PolicyName" -> PolicyName.map { x => x: js.Any }),
        ("CookieName" -> CookieName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAppCookieStickinessPolicyInput]
    }
  }

  /**
   * <p>Contains the output for CreateAppCookieStickinessPolicy.</p>
   */
  @js.native
  trait CreateAppCookieStickinessPolicyOutput extends js.Object {

  }

  object CreateAppCookieStickinessPolicyOutput {
    def apply(

    ): CreateAppCookieStickinessPolicyOutput = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAppCookieStickinessPolicyOutput]
    }
  }

  /**
   * <p>Contains the parameters for CreateLBCookieStickinessPolicy.</p>
   */
  @js.native
  trait CreateLBCookieStickinessPolicyInput extends js.Object {
    var LoadBalancerName: AccessPointName
    var PolicyName: PolicyName
    var CookieExpirationPeriod: CookieExpirationPeriod
  }

  object CreateLBCookieStickinessPolicyInput {
    def apply(
      LoadBalancerName: js.UndefOr[AccessPointName] = js.undefined,
      PolicyName: js.UndefOr[PolicyName] = js.undefined,
      CookieExpirationPeriod: js.UndefOr[CookieExpirationPeriod] = js.undefined
    ): CreateLBCookieStickinessPolicyInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LoadBalancerName" -> LoadBalancerName.map { x => x: js.Any }),
        ("PolicyName" -> PolicyName.map { x => x: js.Any }),
        ("CookieExpirationPeriod" -> CookieExpirationPeriod.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLBCookieStickinessPolicyInput]
    }
  }

  /**
   * <p>Contains the output for CreateLBCookieStickinessPolicy.</p>
   */
  @js.native
  trait CreateLBCookieStickinessPolicyOutput extends js.Object {

  }

  object CreateLBCookieStickinessPolicyOutput {
    def apply(

    ): CreateLBCookieStickinessPolicyOutput = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLBCookieStickinessPolicyOutput]
    }
  }

  /**
   * <p>Contains the parameters for CreateLoadBalancerListeners.</p>
   */
  @js.native
  trait CreateLoadBalancerListenerInput extends js.Object {
    var LoadBalancerName: AccessPointName
    var Listeners: Listeners
  }

  object CreateLoadBalancerListenerInput {
    def apply(
      LoadBalancerName: js.UndefOr[AccessPointName] = js.undefined,
      Listeners: js.UndefOr[Listeners] = js.undefined
    ): CreateLoadBalancerListenerInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LoadBalancerName" -> LoadBalancerName.map { x => x: js.Any }),
        ("Listeners" -> Listeners.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLoadBalancerListenerInput]
    }
  }

  /**
   * <p>Contains the parameters for CreateLoadBalancerListener.</p>
   */
  @js.native
  trait CreateLoadBalancerListenerOutput extends js.Object {

  }

  object CreateLoadBalancerListenerOutput {
    def apply(

    ): CreateLoadBalancerListenerOutput = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLoadBalancerListenerOutput]
    }
  }

  /**
   * <p>Contains the parameters for CreateLoadBalancerPolicy.</p>
   */
  @js.native
  trait CreateLoadBalancerPolicyInput extends js.Object {
    var LoadBalancerName: AccessPointName
    var PolicyName: PolicyName
    var PolicyTypeName: PolicyTypeName
    var PolicyAttributes: PolicyAttributes
  }

  object CreateLoadBalancerPolicyInput {
    def apply(
      LoadBalancerName: js.UndefOr[AccessPointName] = js.undefined,
      PolicyName: js.UndefOr[PolicyName] = js.undefined,
      PolicyTypeName: js.UndefOr[PolicyTypeName] = js.undefined,
      PolicyAttributes: js.UndefOr[PolicyAttributes] = js.undefined
    ): CreateLoadBalancerPolicyInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LoadBalancerName" -> LoadBalancerName.map { x => x: js.Any }),
        ("PolicyName" -> PolicyName.map { x => x: js.Any }),
        ("PolicyTypeName" -> PolicyTypeName.map { x => x: js.Any }),
        ("PolicyAttributes" -> PolicyAttributes.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLoadBalancerPolicyInput]
    }
  }

  /**
   * <p>Contains the output of CreateLoadBalancerPolicy.</p>
   */
  @js.native
  trait CreateLoadBalancerPolicyOutput extends js.Object {

  }

  object CreateLoadBalancerPolicyOutput {
    def apply(

    ): CreateLoadBalancerPolicyOutput = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLoadBalancerPolicyOutput]
    }
  }

  /**
   * <p>Information about the <code>CrossZoneLoadBalancing</code> attribute.</p>
   */
  @js.native
  trait CrossZoneLoadBalancing extends js.Object {
    var Enabled: CrossZoneLoadBalancingEnabled
  }

  object CrossZoneLoadBalancing {
    def apply(
      Enabled: js.UndefOr[CrossZoneLoadBalancingEnabled] = js.undefined
    ): CrossZoneLoadBalancing = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Enabled" -> Enabled.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CrossZoneLoadBalancing]
    }
  }

  /**
   * <p>Contains the parameters for DeleteLoadBalancer.</p>
   */
  @js.native
  trait DeleteAccessPointInput extends js.Object {
    var LoadBalancerName: AccessPointName
  }

  object DeleteAccessPointInput {
    def apply(
      LoadBalancerName: js.UndefOr[AccessPointName] = js.undefined
    ): DeleteAccessPointInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LoadBalancerName" -> LoadBalancerName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAccessPointInput]
    }
  }

  /**
   * <p>Contains the output of DeleteLoadBalancer.</p>
   */
  @js.native
  trait DeleteAccessPointOutput extends js.Object {

  }

  object DeleteAccessPointOutput {
    def apply(

    ): DeleteAccessPointOutput = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAccessPointOutput]
    }
  }

  /**
   * <p>Contains the parameters for DeleteLoadBalancerListeners.</p>
   */
  @js.native
  trait DeleteLoadBalancerListenerInput extends js.Object {
    var LoadBalancerName: AccessPointName
    var LoadBalancerPorts: Ports
  }

  object DeleteLoadBalancerListenerInput {
    def apply(
      LoadBalancerName: js.UndefOr[AccessPointName] = js.undefined,
      LoadBalancerPorts: js.UndefOr[Ports] = js.undefined
    ): DeleteLoadBalancerListenerInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LoadBalancerName" -> LoadBalancerName.map { x => x: js.Any }),
        ("LoadBalancerPorts" -> LoadBalancerPorts.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteLoadBalancerListenerInput]
    }
  }

  /**
   * <p>Contains the output of DeleteLoadBalancerListeners.</p>
   */
  @js.native
  trait DeleteLoadBalancerListenerOutput extends js.Object {

  }

  object DeleteLoadBalancerListenerOutput {
    def apply(

    ): DeleteLoadBalancerListenerOutput = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteLoadBalancerListenerOutput]
    }
  }

  /**
   * <p>Contains the parameters for DeleteLoadBalancerPolicy.</p>
   */
  @js.native
  trait DeleteLoadBalancerPolicyInput extends js.Object {
    var LoadBalancerName: AccessPointName
    var PolicyName: PolicyName
  }

  object DeleteLoadBalancerPolicyInput {
    def apply(
      LoadBalancerName: js.UndefOr[AccessPointName] = js.undefined,
      PolicyName: js.UndefOr[PolicyName] = js.undefined
    ): DeleteLoadBalancerPolicyInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LoadBalancerName" -> LoadBalancerName.map { x => x: js.Any }),
        ("PolicyName" -> PolicyName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteLoadBalancerPolicyInput]
    }
  }

  /**
   * <p>Contains the output of DeleteLoadBalancerPolicy.</p>
   */
  @js.native
  trait DeleteLoadBalancerPolicyOutput extends js.Object {

  }

  object DeleteLoadBalancerPolicyOutput {
    def apply(

    ): DeleteLoadBalancerPolicyOutput = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteLoadBalancerPolicyOutput]
    }
  }

  @js.native
  trait DependencyThrottleExceptionException extends js.Object {

  }

  /**
   * <p>Contains the parameters for DeregisterInstancesFromLoadBalancer.</p>
   */
  @js.native
  trait DeregisterEndPointsInput extends js.Object {
    var LoadBalancerName: AccessPointName
    var Instances: Instances
  }

  object DeregisterEndPointsInput {
    def apply(
      LoadBalancerName: js.UndefOr[AccessPointName] = js.undefined,
      Instances: js.UndefOr[Instances] = js.undefined
    ): DeregisterEndPointsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LoadBalancerName" -> LoadBalancerName.map { x => x: js.Any }),
        ("Instances" -> Instances.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeregisterEndPointsInput]
    }
  }

  /**
   * <p>Contains the output of DeregisterInstancesFromLoadBalancer.</p>
   */
  @js.native
  trait DeregisterEndPointsOutput extends js.Object {
    var Instances: Instances
  }

  object DeregisterEndPointsOutput {
    def apply(
      Instances: js.UndefOr[Instances] = js.undefined
    ): DeregisterEndPointsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Instances" -> Instances.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeregisterEndPointsOutput]
    }
  }

  /**
   * <p>Contains the parameters for DescribeLoadBalancers.</p>
   */
  @js.native
  trait DescribeAccessPointsInput extends js.Object {
    var LoadBalancerNames: LoadBalancerNames
    var Marker: Marker
    var PageSize: PageSize
  }

  object DescribeAccessPointsInput {
    def apply(
      LoadBalancerNames: js.UndefOr[LoadBalancerNames] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined,
      PageSize: js.UndefOr[PageSize] = js.undefined
    ): DescribeAccessPointsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LoadBalancerNames" -> LoadBalancerNames.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("PageSize" -> PageSize.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAccessPointsInput]
    }
  }

  /**
   * <p>Contains the parameters for DescribeLoadBalancers.</p>
   */
  @js.native
  trait DescribeAccessPointsOutput extends js.Object {
    var LoadBalancerDescriptions: LoadBalancerDescriptions
    var NextMarker: Marker
  }

  object DescribeAccessPointsOutput {
    def apply(
      LoadBalancerDescriptions: js.UndefOr[LoadBalancerDescriptions] = js.undefined,
      NextMarker: js.UndefOr[Marker] = js.undefined
    ): DescribeAccessPointsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LoadBalancerDescriptions" -> LoadBalancerDescriptions.map { x => x: js.Any }),
        ("NextMarker" -> NextMarker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAccessPointsOutput]
    }
  }

  /**
   * <p>Contains the parameters for DescribeInstanceHealth.</p>
   */
  @js.native
  trait DescribeEndPointStateInput extends js.Object {
    var LoadBalancerName: AccessPointName
    var Instances: Instances
  }

  object DescribeEndPointStateInput {
    def apply(
      LoadBalancerName: js.UndefOr[AccessPointName] = js.undefined,
      Instances: js.UndefOr[Instances] = js.undefined
    ): DescribeEndPointStateInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LoadBalancerName" -> LoadBalancerName.map { x => x: js.Any }),
        ("Instances" -> Instances.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEndPointStateInput]
    }
  }

  /**
   * <p>Contains the output for DescribeInstanceHealth.</p>
   */
  @js.native
  trait DescribeEndPointStateOutput extends js.Object {
    var InstanceStates: InstanceStates
  }

  object DescribeEndPointStateOutput {
    def apply(
      InstanceStates: js.UndefOr[InstanceStates] = js.undefined
    ): DescribeEndPointStateOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceStates" -> InstanceStates.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEndPointStateOutput]
    }
  }

  /**
   * <p>Contains the parameters for DescribeLoadBalancerAttributes.</p>
   */
  @js.native
  trait DescribeLoadBalancerAttributesInput extends js.Object {
    var LoadBalancerName: AccessPointName
  }

  object DescribeLoadBalancerAttributesInput {
    def apply(
      LoadBalancerName: js.UndefOr[AccessPointName] = js.undefined
    ): DescribeLoadBalancerAttributesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LoadBalancerName" -> LoadBalancerName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLoadBalancerAttributesInput]
    }
  }

  /**
   * <p>Contains the output of DescribeLoadBalancerAttributes.</p>
   */
  @js.native
  trait DescribeLoadBalancerAttributesOutput extends js.Object {
    var LoadBalancerAttributes: LoadBalancerAttributes
  }

  object DescribeLoadBalancerAttributesOutput {
    def apply(
      LoadBalancerAttributes: js.UndefOr[LoadBalancerAttributes] = js.undefined
    ): DescribeLoadBalancerAttributesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LoadBalancerAttributes" -> LoadBalancerAttributes.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLoadBalancerAttributesOutput]
    }
  }

  /**
   * <p>Contains the parameters for DescribeLoadBalancerPolicies.</p>
   */
  @js.native
  trait DescribeLoadBalancerPoliciesInput extends js.Object {
    var LoadBalancerName: AccessPointName
    var PolicyNames: PolicyNames
  }

  object DescribeLoadBalancerPoliciesInput {
    def apply(
      LoadBalancerName: js.UndefOr[AccessPointName] = js.undefined,
      PolicyNames: js.UndefOr[PolicyNames] = js.undefined
    ): DescribeLoadBalancerPoliciesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LoadBalancerName" -> LoadBalancerName.map { x => x: js.Any }),
        ("PolicyNames" -> PolicyNames.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLoadBalancerPoliciesInput]
    }
  }

  /**
   * <p>Contains the output of DescribeLoadBalancerPolicies.</p>
   */
  @js.native
  trait DescribeLoadBalancerPoliciesOutput extends js.Object {
    var PolicyDescriptions: PolicyDescriptions
  }

  object DescribeLoadBalancerPoliciesOutput {
    def apply(
      PolicyDescriptions: js.UndefOr[PolicyDescriptions] = js.undefined
    ): DescribeLoadBalancerPoliciesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PolicyDescriptions" -> PolicyDescriptions.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLoadBalancerPoliciesOutput]
    }
  }

  /**
   * <p>Contains the parameters for DescribeLoadBalancerPolicyTypes.</p>
   */
  @js.native
  trait DescribeLoadBalancerPolicyTypesInput extends js.Object {
    var PolicyTypeNames: PolicyTypeNames
  }

  object DescribeLoadBalancerPolicyTypesInput {
    def apply(
      PolicyTypeNames: js.UndefOr[PolicyTypeNames] = js.undefined
    ): DescribeLoadBalancerPolicyTypesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PolicyTypeNames" -> PolicyTypeNames.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLoadBalancerPolicyTypesInput]
    }
  }

  /**
   * <p>Contains the output of DescribeLoadBalancerPolicyTypes.</p>
   */
  @js.native
  trait DescribeLoadBalancerPolicyTypesOutput extends js.Object {
    var PolicyTypeDescriptions: PolicyTypeDescriptions
  }

  object DescribeLoadBalancerPolicyTypesOutput {
    def apply(
      PolicyTypeDescriptions: js.UndefOr[PolicyTypeDescriptions] = js.undefined
    ): DescribeLoadBalancerPolicyTypesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PolicyTypeDescriptions" -> PolicyTypeDescriptions.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeLoadBalancerPolicyTypesOutput]
    }
  }

  /**
   * <p>Contains the parameters for DescribeTags.</p>
   */
  @js.native
  trait DescribeTagsInput extends js.Object {
    var LoadBalancerNames: LoadBalancerNamesMax20
  }

  object DescribeTagsInput {
    def apply(
      LoadBalancerNames: js.UndefOr[LoadBalancerNamesMax20] = js.undefined
    ): DescribeTagsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LoadBalancerNames" -> LoadBalancerNames.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTagsInput]
    }
  }

  /**
   * <p>Contains the output for DescribeTags.</p>
   */
  @js.native
  trait DescribeTagsOutput extends js.Object {
    var TagDescriptions: TagDescriptions
  }

  object DescribeTagsOutput {
    def apply(
      TagDescriptions: js.UndefOr[TagDescriptions] = js.undefined
    ): DescribeTagsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TagDescriptions" -> TagDescriptions.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTagsOutput]
    }
  }

  /**
   * <p>Contains the parameters for DetachLoadBalancerFromSubnets.</p>
   */
  @js.native
  trait DetachLoadBalancerFromSubnetsInput extends js.Object {
    var LoadBalancerName: AccessPointName
    var Subnets: Subnets
  }

  object DetachLoadBalancerFromSubnetsInput {
    def apply(
      LoadBalancerName: js.UndefOr[AccessPointName] = js.undefined,
      Subnets: js.UndefOr[Subnets] = js.undefined
    ): DetachLoadBalancerFromSubnetsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LoadBalancerName" -> LoadBalancerName.map { x => x: js.Any }),
        ("Subnets" -> Subnets.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachLoadBalancerFromSubnetsInput]
    }
  }

  /**
   * <p>Contains the output of DetachLoadBalancerFromSubnets.</p>
   */
  @js.native
  trait DetachLoadBalancerFromSubnetsOutput extends js.Object {
    var Subnets: Subnets
  }

  object DetachLoadBalancerFromSubnetsOutput {
    def apply(
      Subnets: js.UndefOr[Subnets] = js.undefined
    ): DetachLoadBalancerFromSubnetsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Subnets" -> Subnets.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachLoadBalancerFromSubnetsOutput]
    }
  }

  /**
   * <p>The specified load balancer name already exists for this account.</p>
   */
  @js.native
  trait DuplicateAccessPointNameExceptionException extends js.Object {

  }

  /**
   * <p>A listener already exists for the specified load balancer name and port, but with a different instance port, protocol, or SSL certificate.</p>
   */
  @js.native
  trait DuplicateListenerExceptionException extends js.Object {

  }

  /**
   * <p>A policy with the specified name already exists for this load balancer.</p>
   */
  @js.native
  trait DuplicatePolicyNameExceptionException extends js.Object {

  }

  /**
   * <p>A tag key was specified more than once.</p>
   */
  @js.native
  trait DuplicateTagKeysExceptionException extends js.Object {

  }

  /**
   * <p>Information about a health check.</p>
   */
  @js.native
  trait HealthCheck extends js.Object {
    var Target: HealthCheckTarget
    var UnhealthyThreshold: UnhealthyThreshold
    var HealthyThreshold: HealthyThreshold
    var Interval: HealthCheckInterval
    var Timeout: HealthCheckTimeout
  }

  object HealthCheck {
    def apply(
      Target: js.UndefOr[HealthCheckTarget] = js.undefined,
      UnhealthyThreshold: js.UndefOr[UnhealthyThreshold] = js.undefined,
      HealthyThreshold: js.UndefOr[HealthyThreshold] = js.undefined,
      Interval: js.UndefOr[HealthCheckInterval] = js.undefined,
      Timeout: js.UndefOr[HealthCheckTimeout] = js.undefined
    ): HealthCheck = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Target" -> Target.map { x => x: js.Any }),
        ("UnhealthyThreshold" -> UnhealthyThreshold.map { x => x: js.Any }),
        ("HealthyThreshold" -> HealthyThreshold.map { x => x: js.Any }),
        ("Interval" -> Interval.map { x => x: js.Any }),
        ("Timeout" -> Timeout.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HealthCheck]
    }
  }

  /**
   * <p>The ID of an EC2 instance.</p>
   */
  @js.native
  trait Instance extends js.Object {
    var InstanceId: InstanceId
  }

  object Instance {
    def apply(
      InstanceId: js.UndefOr[InstanceId] = js.undefined
    ): Instance = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceId" -> InstanceId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Instance]
    }
  }

  /**
   * <p>Information about the state of an EC2 instance.</p>
   */
  @js.native
  trait InstanceState extends js.Object {
    var InstanceId: InstanceId
    var State: State
    var ReasonCode: ReasonCode
    var Description: Description
  }

  object InstanceState {
    def apply(
      InstanceId: js.UndefOr[InstanceId] = js.undefined,
      State: js.UndefOr[State] = js.undefined,
      ReasonCode: js.UndefOr[ReasonCode] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined
    ): InstanceState = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("State" -> State.map { x => x: js.Any }),
        ("ReasonCode" -> ReasonCode.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceState]
    }
  }

  /**
   * <p>The requested configuration change is not valid.</p>
   */
  @js.native
  trait InvalidConfigurationRequestExceptionException extends js.Object {

  }

  /**
   * <p>The specified endpoint is not valid.</p>
   */
  @js.native
  trait InvalidEndPointExceptionException extends js.Object {

  }

  /**
   * <p>The specified value for the schema is not valid. You can only specify a scheme for load balancers in a VPC.</p>
   */
  @js.native
  trait InvalidSchemeExceptionException extends js.Object {

  }

  /**
   * <p>One or more of the specified security groups do not exist.</p>
   */
  @js.native
  trait InvalidSecurityGroupExceptionException extends js.Object {

  }

  /**
   * <p>The specified VPC has no associated Internet gateway.</p>
   */
  @js.native
  trait InvalidSubnetExceptionException extends js.Object {

  }

  /**
   * <p>Information about a policy for duration-based session stickiness.</p>
   */
  @js.native
  trait LBCookieStickinessPolicy extends js.Object {
    var PolicyName: PolicyName
    var CookieExpirationPeriod: CookieExpirationPeriod
  }

  object LBCookieStickinessPolicy {
    def apply(
      PolicyName: js.UndefOr[PolicyName] = js.undefined,
      CookieExpirationPeriod: js.UndefOr[CookieExpirationPeriod] = js.undefined
    ): LBCookieStickinessPolicy = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PolicyName" -> PolicyName.map { x => x: js.Any }),
        ("CookieExpirationPeriod" -> CookieExpirationPeriod.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LBCookieStickinessPolicy]
    }
  }

  /**
   * <p>Information about a listener.</p> <p>For information about the protocols and the ports supported by Elastic Load Balancing, see <a href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-listener-config.html">Listeners for Your Classic Load Balancer</a> in the <i>Classic Load Balancers Guide</i>.</p>
   */
  @js.native
  trait Listener extends js.Object {
    var InstancePort: InstancePort
    var LoadBalancerPort: AccessPointPort
    var SSLCertificateId: SSLCertificateId
    var Protocol: Protocol
    var InstanceProtocol: Protocol
  }

  object Listener {
    def apply(
      InstancePort: js.UndefOr[InstancePort] = js.undefined,
      LoadBalancerPort: js.UndefOr[AccessPointPort] = js.undefined,
      SSLCertificateId: js.UndefOr[SSLCertificateId] = js.undefined,
      Protocol: js.UndefOr[Protocol] = js.undefined,
      InstanceProtocol: js.UndefOr[Protocol] = js.undefined
    ): Listener = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstancePort" -> InstancePort.map { x => x: js.Any }),
        ("LoadBalancerPort" -> LoadBalancerPort.map { x => x: js.Any }),
        ("SSLCertificateId" -> SSLCertificateId.map { x => x: js.Any }),
        ("Protocol" -> Protocol.map { x => x: js.Any }),
        ("InstanceProtocol" -> InstanceProtocol.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Listener]
    }
  }

  /**
   * <p>The policies enabled for a listener.</p>
   */
  @js.native
  trait ListenerDescription extends js.Object {
    var Listener: Listener
    var PolicyNames: PolicyNames
  }

  object ListenerDescription {
    def apply(
      Listener: js.UndefOr[Listener] = js.undefined,
      PolicyNames: js.UndefOr[PolicyNames] = js.undefined
    ): ListenerDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Listener" -> Listener.map { x => x: js.Any }),
        ("PolicyNames" -> PolicyNames.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListenerDescription]
    }
  }

  /**
   * <p>The load balancer does not have a listener configured at the specified port.</p>
   */
  @js.native
  trait ListenerNotFoundExceptionException extends js.Object {

  }

  /**
   * <p>The specified load balancer attribute does not exist.</p>
   */
  @js.native
  trait LoadBalancerAttributeNotFoundExceptionException extends js.Object {

  }

  /**
   * <p>The attributes for a load balancer.</p>
   */
  @js.native
  trait LoadBalancerAttributes extends js.Object {
    var ConnectionDraining: ConnectionDraining
    var AdditionalAttributes: AdditionalAttributes
    var AccessLog: AccessLog
    var ConnectionSettings: ConnectionSettings
    var CrossZoneLoadBalancing: CrossZoneLoadBalancing
  }

  object LoadBalancerAttributes {
    def apply(
      ConnectionDraining: js.UndefOr[ConnectionDraining] = js.undefined,
      AdditionalAttributes: js.UndefOr[AdditionalAttributes] = js.undefined,
      AccessLog: js.UndefOr[AccessLog] = js.undefined,
      ConnectionSettings: js.UndefOr[ConnectionSettings] = js.undefined,
      CrossZoneLoadBalancing: js.UndefOr[CrossZoneLoadBalancing] = js.undefined
    ): LoadBalancerAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ConnectionDraining" -> ConnectionDraining.map { x => x: js.Any }),
        ("AdditionalAttributes" -> AdditionalAttributes.map { x => x: js.Any }),
        ("AccessLog" -> AccessLog.map { x => x: js.Any }),
        ("ConnectionSettings" -> ConnectionSettings.map { x => x: js.Any }),
        ("CrossZoneLoadBalancing" -> CrossZoneLoadBalancing.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LoadBalancerAttributes]
    }
  }

  /**
   * <p>Information about a load balancer.</p>
   */
  @js.native
  trait LoadBalancerDescription extends js.Object {
    var HealthCheck: HealthCheck
    var CreatedTime: CreatedTime
    var Policies: Policies
    var Subnets: Subnets
    var CanonicalHostedZoneName: DNSName
    var SecurityGroups: SecurityGroups
    var LoadBalancerName: AccessPointName
    var ListenerDescriptions: ListenerDescriptions
    var VPCId: VPCId
    var Instances: Instances
    var SourceSecurityGroup: SourceSecurityGroup
    var BackendServerDescriptions: BackendServerDescriptions
    var Scheme: LoadBalancerScheme
    var CanonicalHostedZoneNameID: DNSName
    var DNSName: DNSName
    var AvailabilityZones: AvailabilityZones
  }

  object LoadBalancerDescription {
    def apply(
      HealthCheck: js.UndefOr[HealthCheck] = js.undefined,
      CreatedTime: js.UndefOr[CreatedTime] = js.undefined,
      Policies: js.UndefOr[Policies] = js.undefined,
      Subnets: js.UndefOr[Subnets] = js.undefined,
      CanonicalHostedZoneName: js.UndefOr[DNSName] = js.undefined,
      SecurityGroups: js.UndefOr[SecurityGroups] = js.undefined,
      LoadBalancerName: js.UndefOr[AccessPointName] = js.undefined,
      ListenerDescriptions: js.UndefOr[ListenerDescriptions] = js.undefined,
      VPCId: js.UndefOr[VPCId] = js.undefined,
      Instances: js.UndefOr[Instances] = js.undefined,
      SourceSecurityGroup: js.UndefOr[SourceSecurityGroup] = js.undefined,
      BackendServerDescriptions: js.UndefOr[BackendServerDescriptions] = js.undefined,
      Scheme: js.UndefOr[LoadBalancerScheme] = js.undefined,
      CanonicalHostedZoneNameID: js.UndefOr[DNSName] = js.undefined,
      DNSName: js.UndefOr[DNSName] = js.undefined,
      AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined
    ): LoadBalancerDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("HealthCheck" -> HealthCheck.map { x => x: js.Any }),
        ("CreatedTime" -> CreatedTime.map { x => x: js.Any }),
        ("Policies" -> Policies.map { x => x: js.Any }),
        ("Subnets" -> Subnets.map { x => x: js.Any }),
        ("CanonicalHostedZoneName" -> CanonicalHostedZoneName.map { x => x: js.Any }),
        ("SecurityGroups" -> SecurityGroups.map { x => x: js.Any }),
        ("LoadBalancerName" -> LoadBalancerName.map { x => x: js.Any }),
        ("ListenerDescriptions" -> ListenerDescriptions.map { x => x: js.Any }),
        ("VPCId" -> VPCId.map { x => x: js.Any }),
        ("Instances" -> Instances.map { x => x: js.Any }),
        ("SourceSecurityGroup" -> SourceSecurityGroup.map { x => x: js.Any }),
        ("BackendServerDescriptions" -> BackendServerDescriptions.map { x => x: js.Any }),
        ("Scheme" -> Scheme.map { x => x: js.Any }),
        ("CanonicalHostedZoneNameID" -> CanonicalHostedZoneNameID.map { x => x: js.Any }),
        ("DNSName" -> DNSName.map { x => x: js.Any }),
        ("AvailabilityZones" -> AvailabilityZones.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LoadBalancerDescription]
    }
  }

  /**
   * <p>Contains the parameters for ModifyLoadBalancerAttributes.</p>
   */
  @js.native
  trait ModifyLoadBalancerAttributesInput extends js.Object {
    var LoadBalancerName: AccessPointName
    var LoadBalancerAttributes: LoadBalancerAttributes
  }

  object ModifyLoadBalancerAttributesInput {
    def apply(
      LoadBalancerName: js.UndefOr[AccessPointName] = js.undefined,
      LoadBalancerAttributes: js.UndefOr[LoadBalancerAttributes] = js.undefined
    ): ModifyLoadBalancerAttributesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LoadBalancerName" -> LoadBalancerName.map { x => x: js.Any }),
        ("LoadBalancerAttributes" -> LoadBalancerAttributes.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyLoadBalancerAttributesInput]
    }
  }

  /**
   * <p>Contains the output of ModifyLoadBalancerAttributes.</p>
   */
  @js.native
  trait ModifyLoadBalancerAttributesOutput extends js.Object {
    var LoadBalancerName: AccessPointName
    var LoadBalancerAttributes: LoadBalancerAttributes
  }

  object ModifyLoadBalancerAttributesOutput {
    def apply(
      LoadBalancerName: js.UndefOr[AccessPointName] = js.undefined,
      LoadBalancerAttributes: js.UndefOr[LoadBalancerAttributes] = js.undefined
    ): ModifyLoadBalancerAttributesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LoadBalancerName" -> LoadBalancerName.map { x => x: js.Any }),
        ("LoadBalancerAttributes" -> LoadBalancerAttributes.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyLoadBalancerAttributesOutput]
    }
  }

  /**
   * <p>The policies for a load balancer.</p>
   */
  @js.native
  trait Policies extends js.Object {
    var AppCookieStickinessPolicies: AppCookieStickinessPolicies
    var LBCookieStickinessPolicies: LBCookieStickinessPolicies
    var OtherPolicies: PolicyNames
  }

  object Policies {
    def apply(
      AppCookieStickinessPolicies: js.UndefOr[AppCookieStickinessPolicies] = js.undefined,
      LBCookieStickinessPolicies: js.UndefOr[LBCookieStickinessPolicies] = js.undefined,
      OtherPolicies: js.UndefOr[PolicyNames] = js.undefined
    ): Policies = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AppCookieStickinessPolicies" -> AppCookieStickinessPolicies.map { x => x: js.Any }),
        ("LBCookieStickinessPolicies" -> LBCookieStickinessPolicies.map { x => x: js.Any }),
        ("OtherPolicies" -> OtherPolicies.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Policies]
    }
  }

  /**
   * <p>Information about a policy attribute.</p>
   */
  @js.native
  trait PolicyAttribute extends js.Object {
    var AttributeName: AttributeName
    var AttributeValue: AttributeValue
  }

  object PolicyAttribute {
    def apply(
      AttributeName: js.UndefOr[AttributeName] = js.undefined,
      AttributeValue: js.UndefOr[AttributeValue] = js.undefined
    ): PolicyAttribute = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AttributeName" -> AttributeName.map { x => x: js.Any }),
        ("AttributeValue" -> AttributeValue.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PolicyAttribute]
    }
  }

  /**
   * <p>Information about a policy attribute.</p>
   */
  @js.native
  trait PolicyAttributeDescription extends js.Object {
    var AttributeName: AttributeName
    var AttributeValue: AttributeValue
  }

  object PolicyAttributeDescription {
    def apply(
      AttributeName: js.UndefOr[AttributeName] = js.undefined,
      AttributeValue: js.UndefOr[AttributeValue] = js.undefined
    ): PolicyAttributeDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AttributeName" -> AttributeName.map { x => x: js.Any }),
        ("AttributeValue" -> AttributeValue.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PolicyAttributeDescription]
    }
  }

  /**
   * <p>Information about a policy attribute type.</p>
   */
  @js.native
  trait PolicyAttributeTypeDescription extends js.Object {
    var Description: Description
    var DefaultValue: DefaultValue
    var Cardinality: Cardinality
    var AttributeName: AttributeName
    var AttributeType: AttributeType
  }

  object PolicyAttributeTypeDescription {
    def apply(
      Description: js.UndefOr[Description] = js.undefined,
      DefaultValue: js.UndefOr[DefaultValue] = js.undefined,
      Cardinality: js.UndefOr[Cardinality] = js.undefined,
      AttributeName: js.UndefOr[AttributeName] = js.undefined,
      AttributeType: js.UndefOr[AttributeType] = js.undefined
    ): PolicyAttributeTypeDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Description" -> Description.map { x => x: js.Any }),
        ("DefaultValue" -> DefaultValue.map { x => x: js.Any }),
        ("Cardinality" -> Cardinality.map { x => x: js.Any }),
        ("AttributeName" -> AttributeName.map { x => x: js.Any }),
        ("AttributeType" -> AttributeType.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PolicyAttributeTypeDescription]
    }
  }

  /**
   * <p>Information about a policy.</p>
   */
  @js.native
  trait PolicyDescription extends js.Object {
    var PolicyName: PolicyName
    var PolicyTypeName: PolicyTypeName
    var PolicyAttributeDescriptions: PolicyAttributeDescriptions
  }

  object PolicyDescription {
    def apply(
      PolicyName: js.UndefOr[PolicyName] = js.undefined,
      PolicyTypeName: js.UndefOr[PolicyTypeName] = js.undefined,
      PolicyAttributeDescriptions: js.UndefOr[PolicyAttributeDescriptions] = js.undefined
    ): PolicyDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PolicyName" -> PolicyName.map { x => x: js.Any }),
        ("PolicyTypeName" -> PolicyTypeName.map { x => x: js.Any }),
        ("PolicyAttributeDescriptions" -> PolicyAttributeDescriptions.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PolicyDescription]
    }
  }

  /**
   * <p>One or more of the specified policies do not exist.</p>
   */
  @js.native
  trait PolicyNotFoundExceptionException extends js.Object {

  }

  /**
   * <p>Information about a policy type.</p>
   */
  @js.native
  trait PolicyTypeDescription extends js.Object {
    var PolicyTypeName: PolicyTypeName
    var Description: Description
    var PolicyAttributeTypeDescriptions: PolicyAttributeTypeDescriptions
  }

  object PolicyTypeDescription {
    def apply(
      PolicyTypeName: js.UndefOr[PolicyTypeName] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined,
      PolicyAttributeTypeDescriptions: js.UndefOr[PolicyAttributeTypeDescriptions] = js.undefined
    ): PolicyTypeDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PolicyTypeName" -> PolicyTypeName.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("PolicyAttributeTypeDescriptions" -> PolicyAttributeTypeDescriptions.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PolicyTypeDescription]
    }
  }

  /**
   * <p>One or more of the specified policy types do not exist.</p>
   */
  @js.native
  trait PolicyTypeNotFoundExceptionException extends js.Object {

  }

  /**
   * <p>Contains the parameters for RegisterInstancesWithLoadBalancer.</p>
   */
  @js.native
  trait RegisterEndPointsInput extends js.Object {
    var LoadBalancerName: AccessPointName
    var Instances: Instances
  }

  object RegisterEndPointsInput {
    def apply(
      LoadBalancerName: js.UndefOr[AccessPointName] = js.undefined,
      Instances: js.UndefOr[Instances] = js.undefined
    ): RegisterEndPointsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LoadBalancerName" -> LoadBalancerName.map { x => x: js.Any }),
        ("Instances" -> Instances.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterEndPointsInput]
    }
  }

  /**
   * <p>Contains the output of RegisterInstancesWithLoadBalancer.</p>
   */
  @js.native
  trait RegisterEndPointsOutput extends js.Object {
    var Instances: Instances
  }

  object RegisterEndPointsOutput {
    def apply(
      Instances: js.UndefOr[Instances] = js.undefined
    ): RegisterEndPointsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Instances" -> Instances.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterEndPointsOutput]
    }
  }

  /**
   * <p>Contains the parameters for DisableAvailabilityZonesForLoadBalancer.</p>
   */
  @js.native
  trait RemoveAvailabilityZonesInput extends js.Object {
    var LoadBalancerName: AccessPointName
    var AvailabilityZones: AvailabilityZones
  }

  object RemoveAvailabilityZonesInput {
    def apply(
      LoadBalancerName: js.UndefOr[AccessPointName] = js.undefined,
      AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined
    ): RemoveAvailabilityZonesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LoadBalancerName" -> LoadBalancerName.map { x => x: js.Any }),
        ("AvailabilityZones" -> AvailabilityZones.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveAvailabilityZonesInput]
    }
  }

  /**
   * <p>Contains the output for DisableAvailabilityZonesForLoadBalancer.</p>
   */
  @js.native
  trait RemoveAvailabilityZonesOutput extends js.Object {
    var AvailabilityZones: AvailabilityZones
  }

  object RemoveAvailabilityZonesOutput {
    def apply(
      AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined
    ): RemoveAvailabilityZonesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AvailabilityZones" -> AvailabilityZones.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveAvailabilityZonesOutput]
    }
  }

  /**
   * <p>Contains the parameters for RemoveTags.</p>
   */
  @js.native
  trait RemoveTagsInput extends js.Object {
    var LoadBalancerNames: LoadBalancerNames
    var Tags: TagKeyList
  }

  object RemoveTagsInput {
    def apply(
      LoadBalancerNames: js.UndefOr[LoadBalancerNames] = js.undefined,
      Tags: js.UndefOr[TagKeyList] = js.undefined
    ): RemoveTagsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LoadBalancerNames" -> LoadBalancerNames.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveTagsInput]
    }
  }

  /**
   * <p>Contains the output of RemoveTags.</p>
   */
  @js.native
  trait RemoveTagsOutput extends js.Object {

  }

  object RemoveTagsOutput {
    def apply(

    ): RemoveTagsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveTagsOutput]
    }
  }

  /**
   * <p>Contains the parameters for SetLoadBalancerListenerSSLCertificate.</p>
   */
  @js.native
  trait SetLoadBalancerListenerSSLCertificateInput extends js.Object {
    var LoadBalancerName: AccessPointName
    var LoadBalancerPort: AccessPointPort
    var SSLCertificateId: SSLCertificateId
  }

  object SetLoadBalancerListenerSSLCertificateInput {
    def apply(
      LoadBalancerName: js.UndefOr[AccessPointName] = js.undefined,
      LoadBalancerPort: js.UndefOr[AccessPointPort] = js.undefined,
      SSLCertificateId: js.UndefOr[SSLCertificateId] = js.undefined
    ): SetLoadBalancerListenerSSLCertificateInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LoadBalancerName" -> LoadBalancerName.map { x => x: js.Any }),
        ("LoadBalancerPort" -> LoadBalancerPort.map { x => x: js.Any }),
        ("SSLCertificateId" -> SSLCertificateId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetLoadBalancerListenerSSLCertificateInput]
    }
  }

  /**
   * <p>Contains the output of SetLoadBalancerListenerSSLCertificate.</p>
   */
  @js.native
  trait SetLoadBalancerListenerSSLCertificateOutput extends js.Object {

  }

  object SetLoadBalancerListenerSSLCertificateOutput {
    def apply(

    ): SetLoadBalancerListenerSSLCertificateOutput = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetLoadBalancerListenerSSLCertificateOutput]
    }
  }

  /**
   * <p>Contains the parameters for SetLoadBalancerPoliciesForBackendServer.</p>
   */
  @js.native
  trait SetLoadBalancerPoliciesForBackendServerInput extends js.Object {
    var LoadBalancerName: AccessPointName
    var InstancePort: EndPointPort
    var PolicyNames: PolicyNames
  }

  object SetLoadBalancerPoliciesForBackendServerInput {
    def apply(
      LoadBalancerName: js.UndefOr[AccessPointName] = js.undefined,
      InstancePort: js.UndefOr[EndPointPort] = js.undefined,
      PolicyNames: js.UndefOr[PolicyNames] = js.undefined
    ): SetLoadBalancerPoliciesForBackendServerInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LoadBalancerName" -> LoadBalancerName.map { x => x: js.Any }),
        ("InstancePort" -> InstancePort.map { x => x: js.Any }),
        ("PolicyNames" -> PolicyNames.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetLoadBalancerPoliciesForBackendServerInput]
    }
  }

  /**
   * <p>Contains the output of SetLoadBalancerPoliciesForBackendServer.</p>
   */
  @js.native
  trait SetLoadBalancerPoliciesForBackendServerOutput extends js.Object {

  }

  object SetLoadBalancerPoliciesForBackendServerOutput {
    def apply(

    ): SetLoadBalancerPoliciesForBackendServerOutput = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetLoadBalancerPoliciesForBackendServerOutput]
    }
  }

  /**
   * <p>Contains the parameters for SetLoadBalancePoliciesOfListener.</p>
   */
  @js.native
  trait SetLoadBalancerPoliciesOfListenerInput extends js.Object {
    var LoadBalancerName: AccessPointName
    var LoadBalancerPort: AccessPointPort
    var PolicyNames: PolicyNames
  }

  object SetLoadBalancerPoliciesOfListenerInput {
    def apply(
      LoadBalancerName: js.UndefOr[AccessPointName] = js.undefined,
      LoadBalancerPort: js.UndefOr[AccessPointPort] = js.undefined,
      PolicyNames: js.UndefOr[PolicyNames] = js.undefined
    ): SetLoadBalancerPoliciesOfListenerInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LoadBalancerName" -> LoadBalancerName.map { x => x: js.Any }),
        ("LoadBalancerPort" -> LoadBalancerPort.map { x => x: js.Any }),
        ("PolicyNames" -> PolicyNames.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetLoadBalancerPoliciesOfListenerInput]
    }
  }

  /**
   * <p>Contains the output of SetLoadBalancePoliciesOfListener.</p>
   */
  @js.native
  trait SetLoadBalancerPoliciesOfListenerOutput extends js.Object {

  }

  object SetLoadBalancerPoliciesOfListenerOutput {
    def apply(

    ): SetLoadBalancerPoliciesOfListenerOutput = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetLoadBalancerPoliciesOfListenerOutput]
    }
  }

  /**
   * <p>Information about a source security group.</p>
   */
  @js.native
  trait SourceSecurityGroup extends js.Object {
    var OwnerAlias: SecurityGroupOwnerAlias
    var GroupName: SecurityGroupName
  }

  object SourceSecurityGroup {
    def apply(
      OwnerAlias: js.UndefOr[SecurityGroupOwnerAlias] = js.undefined,
      GroupName: js.UndefOr[SecurityGroupName] = js.undefined
    ): SourceSecurityGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("OwnerAlias" -> OwnerAlias.map { x => x: js.Any }),
        ("GroupName" -> GroupName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SourceSecurityGroup]
    }
  }

  /**
   * <p>One or more of the specified subnets do not exist.</p>
   */
  @js.native
  trait SubnetNotFoundExceptionException extends js.Object {

  }

  /**
   * <p>Information about a tag.</p>
   */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  object Tag {
    def apply(
      Key: js.UndefOr[TagKey] = js.undefined,
      Value: js.UndefOr[TagValue] = js.undefined
    ): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Key" -> Key.map { x => x: js.Any }),
        ("Value" -> Value.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  /**
   * <p>The tags associated with a load balancer.</p>
   */
  @js.native
  trait TagDescription extends js.Object {
    var LoadBalancerName: AccessPointName
    var Tags: TagList
  }

  object TagDescription {
    def apply(
      LoadBalancerName: js.UndefOr[AccessPointName] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined
    ): TagDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LoadBalancerName" -> LoadBalancerName.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagDescription]
    }
  }

  /**
   * <p>The key of a tag.</p>
   */
  @js.native
  trait TagKeyOnly extends js.Object {
    var Key: TagKey
  }

  object TagKeyOnly {
    def apply(
      Key: js.UndefOr[TagKey] = js.undefined
    ): TagKeyOnly = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Key" -> Key.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagKeyOnly]
    }
  }

  /**
   * <p>The quota for the number of load balancers has been reached.</p>
   */
  @js.native
  trait TooManyAccessPointsExceptionException extends js.Object {

  }

  /**
   * <p>The quota for the number of policies for this load balancer has been reached.</p>
   */
  @js.native
  trait TooManyPoliciesExceptionException extends js.Object {

  }

  /**
   * <p>The quota for the number of tags that can be assigned to a load balancer has been reached.</p>
   */
  @js.native
  trait TooManyTagsExceptionException extends js.Object {

  }

  @js.native
  trait UnsupportedProtocolExceptionException extends js.Object {

  }
}
