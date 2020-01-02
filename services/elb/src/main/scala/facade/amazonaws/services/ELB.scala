package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object elb {
  type AccessLogEnabled                = Boolean
  type AccessLogInterval               = Int
  type AccessLogPrefix                 = String
  type AccessPointName                 = String
  type AccessPointPort                 = Int
  type AdditionalAttributeKey          = String
  type AdditionalAttributeValue        = String
  type AdditionalAttributes            = js.Array[AdditionalAttribute]
  type AppCookieStickinessPolicies     = js.Array[AppCookieStickinessPolicy]
  type AttributeName                   = String
  type AttributeType                   = String
  type AttributeValue                  = String
  type AvailabilityZone                = String
  type AvailabilityZones               = js.Array[AvailabilityZone]
  type BackendServerDescriptions       = js.Array[BackendServerDescription]
  type Cardinality                     = String
  type ConnectionDrainingEnabled       = Boolean
  type ConnectionDrainingTimeout       = Int
  type CookieExpirationPeriod          = Double
  type CookieName                      = String
  type CreatedTime                     = js.Date
  type CrossZoneLoadBalancingEnabled   = Boolean
  type DNSName                         = String
  type DefaultValue                    = String
  type Description                     = String
  type EndPointPort                    = Int
  type HealthCheckInterval             = Int
  type HealthCheckTarget               = String
  type HealthCheckTimeout              = Int
  type HealthyThreshold                = Int
  type IdleTimeout                     = Int
  type InstanceId                      = String
  type InstancePort                    = Int
  type InstanceStates                  = js.Array[InstanceState]
  type Instances                       = js.Array[Instance]
  type LBCookieStickinessPolicies      = js.Array[LBCookieStickinessPolicy]
  type Limits                          = js.Array[Limit]
  type ListenerDescriptions            = js.Array[ListenerDescription]
  type Listeners                       = js.Array[Listener]
  type LoadBalancerDescriptions        = js.Array[LoadBalancerDescription]
  type LoadBalancerNames               = js.Array[AccessPointName]
  type LoadBalancerNamesMax20          = js.Array[AccessPointName]
  type LoadBalancerScheme              = String
  type Marker                          = String
  type Max                             = String
  type Name                            = String
  type PageSize                        = Int
  type PolicyAttributeDescriptions     = js.Array[PolicyAttributeDescription]
  type PolicyAttributeTypeDescriptions = js.Array[PolicyAttributeTypeDescription]
  type PolicyAttributes                = js.Array[PolicyAttribute]
  type PolicyDescriptions              = js.Array[PolicyDescription]
  type PolicyName                      = String
  type PolicyNames                     = js.Array[PolicyName]
  type PolicyTypeDescriptions          = js.Array[PolicyTypeDescription]
  type PolicyTypeName                  = String
  type PolicyTypeNames                 = js.Array[PolicyTypeName]
  type Ports                           = js.Array[AccessPointPort]
  type Protocol                        = String
  type ReasonCode                      = String
  type S3BucketName                    = String
  type SSLCertificateId                = String
  type SecurityGroupId                 = String
  type SecurityGroupName               = String
  type SecurityGroupOwnerAlias         = String
  type SecurityGroups                  = js.Array[SecurityGroupId]
  type State                           = String
  type SubnetId                        = String
  type Subnets                         = js.Array[SubnetId]
  type TagDescriptions                 = js.Array[TagDescription]
  type TagKey                          = String
  type TagKeyList                      = js.Array[TagKeyOnly]
  type TagList                         = js.Array[Tag]
  type TagValue                        = String
  type UnhealthyThreshold              = Int
  type VPCId                           = String

  implicit final class ELBOps(private val service: ELB) extends AnyVal {

    @inline def addTagsFuture(params: AddTagsInput): Future[AddTagsOutput] = service.addTags(params).promise.toFuture
    @inline def applySecurityGroupsToLoadBalancerFuture(
        params: ApplySecurityGroupsToLoadBalancerInput
    ): Future[ApplySecurityGroupsToLoadBalancerOutput] =
      service.applySecurityGroupsToLoadBalancer(params).promise.toFuture
    @inline def attachLoadBalancerToSubnetsFuture(
        params: AttachLoadBalancerToSubnetsInput
    ): Future[AttachLoadBalancerToSubnetsOutput] = service.attachLoadBalancerToSubnets(params).promise.toFuture
    @inline def configureHealthCheckFuture(params: ConfigureHealthCheckInput): Future[ConfigureHealthCheckOutput] =
      service.configureHealthCheck(params).promise.toFuture
    @inline def createAppCookieStickinessPolicyFuture(
        params: CreateAppCookieStickinessPolicyInput
    ): Future[CreateAppCookieStickinessPolicyOutput] = service.createAppCookieStickinessPolicy(params).promise.toFuture
    @inline def createLBCookieStickinessPolicyFuture(
        params: CreateLBCookieStickinessPolicyInput
    ): Future[CreateLBCookieStickinessPolicyOutput] = service.createLBCookieStickinessPolicy(params).promise.toFuture
    @inline def createLoadBalancerFuture(params: CreateAccessPointInput): Future[CreateAccessPointOutput] =
      service.createLoadBalancer(params).promise.toFuture
    @inline def createLoadBalancerListenersFuture(
        params: CreateLoadBalancerListenerInput
    ): Future[CreateLoadBalancerListenerOutput] = service.createLoadBalancerListeners(params).promise.toFuture
    @inline def createLoadBalancerPolicyFuture(
        params: CreateLoadBalancerPolicyInput
    ): Future[CreateLoadBalancerPolicyOutput] = service.createLoadBalancerPolicy(params).promise.toFuture
    @inline def deleteLoadBalancerFuture(params: DeleteAccessPointInput): Future[DeleteAccessPointOutput] =
      service.deleteLoadBalancer(params).promise.toFuture
    @inline def deleteLoadBalancerListenersFuture(
        params: DeleteLoadBalancerListenerInput
    ): Future[DeleteLoadBalancerListenerOutput] = service.deleteLoadBalancerListeners(params).promise.toFuture
    @inline def deleteLoadBalancerPolicyFuture(
        params: DeleteLoadBalancerPolicyInput
    ): Future[DeleteLoadBalancerPolicyOutput] = service.deleteLoadBalancerPolicy(params).promise.toFuture
    @inline def deregisterInstancesFromLoadBalancerFuture(
        params: DeregisterEndPointsInput
    ): Future[DeregisterEndPointsOutput] = service.deregisterInstancesFromLoadBalancer(params).promise.toFuture
    @inline def describeAccountLimitsFuture(params: DescribeAccountLimitsInput): Future[DescribeAccountLimitsOutput] =
      service.describeAccountLimits(params).promise.toFuture
    @inline def describeInstanceHealthFuture(params: DescribeEndPointStateInput): Future[DescribeEndPointStateOutput] =
      service.describeInstanceHealth(params).promise.toFuture
    @inline def describeLoadBalancerAttributesFuture(
        params: DescribeLoadBalancerAttributesInput
    ): Future[DescribeLoadBalancerAttributesOutput] = service.describeLoadBalancerAttributes(params).promise.toFuture
    @inline def describeLoadBalancerPoliciesFuture(
        params: DescribeLoadBalancerPoliciesInput
    ): Future[DescribeLoadBalancerPoliciesOutput] = service.describeLoadBalancerPolicies(params).promise.toFuture
    @inline def describeLoadBalancerPolicyTypesFuture(
        params: DescribeLoadBalancerPolicyTypesInput
    ): Future[DescribeLoadBalancerPolicyTypesOutput] = service.describeLoadBalancerPolicyTypes(params).promise.toFuture
    @inline def describeLoadBalancersFuture(params: DescribeAccessPointsInput): Future[DescribeAccessPointsOutput] =
      service.describeLoadBalancers(params).promise.toFuture
    @inline def describeTagsFuture(params: DescribeTagsInput): Future[DescribeTagsOutput] =
      service.describeTags(params).promise.toFuture
    @inline def detachLoadBalancerFromSubnetsFuture(
        params: DetachLoadBalancerFromSubnetsInput
    ): Future[DetachLoadBalancerFromSubnetsOutput] = service.detachLoadBalancerFromSubnets(params).promise.toFuture
    @inline def disableAvailabilityZonesForLoadBalancerFuture(
        params: RemoveAvailabilityZonesInput
    ): Future[RemoveAvailabilityZonesOutput] = service.disableAvailabilityZonesForLoadBalancer(params).promise.toFuture
    @inline def enableAvailabilityZonesForLoadBalancerFuture(
        params: AddAvailabilityZonesInput
    ): Future[AddAvailabilityZonesOutput] = service.enableAvailabilityZonesForLoadBalancer(params).promise.toFuture
    @inline def modifyLoadBalancerAttributesFuture(
        params: ModifyLoadBalancerAttributesInput
    ): Future[ModifyLoadBalancerAttributesOutput] = service.modifyLoadBalancerAttributes(params).promise.toFuture
    @inline def registerInstancesWithLoadBalancerFuture(
        params: RegisterEndPointsInput
    ): Future[RegisterEndPointsOutput] = service.registerInstancesWithLoadBalancer(params).promise.toFuture
    @inline def removeTagsFuture(params: RemoveTagsInput): Future[RemoveTagsOutput] =
      service.removeTags(params).promise.toFuture
    @inline def setLoadBalancerListenerSSLCertificateFuture(
        params: SetLoadBalancerListenerSSLCertificateInput
    ): Future[SetLoadBalancerListenerSSLCertificateOutput] =
      service.setLoadBalancerListenerSSLCertificate(params).promise.toFuture
    @inline def setLoadBalancerPoliciesForBackendServerFuture(
        params: SetLoadBalancerPoliciesForBackendServerInput
    ): Future[SetLoadBalancerPoliciesForBackendServerOutput] =
      service.setLoadBalancerPoliciesForBackendServer(params).promise.toFuture
    @inline def setLoadBalancerPoliciesOfListenerFuture(
        params: SetLoadBalancerPoliciesOfListenerInput
    ): Future[SetLoadBalancerPoliciesOfListenerOutput] =
      service.setLoadBalancerPoliciesOfListener(params).promise.toFuture
  }
}

package elb {
  @js.native
  @JSImport("aws-sdk", "ELB")
  class ELB() extends js.Object {
    def this(config: AWSConfig) = this()

    def addTags(params: AddTagsInput): Request[AddTagsOutput] = js.native
    def applySecurityGroupsToLoadBalancer(
        params: ApplySecurityGroupsToLoadBalancerInput
    ): Request[ApplySecurityGroupsToLoadBalancerOutput] = js.native
    def attachLoadBalancerToSubnets(
        params: AttachLoadBalancerToSubnetsInput
    ): Request[AttachLoadBalancerToSubnetsOutput]                                                    = js.native
    def configureHealthCheck(params: ConfigureHealthCheckInput): Request[ConfigureHealthCheckOutput] = js.native
    def createAppCookieStickinessPolicy(
        params: CreateAppCookieStickinessPolicyInput
    ): Request[CreateAppCookieStickinessPolicyOutput] = js.native
    def createLBCookieStickinessPolicy(
        params: CreateLBCookieStickinessPolicyInput
    ): Request[CreateLBCookieStickinessPolicyOutput]                                         = js.native
    def createLoadBalancer(params: CreateAccessPointInput): Request[CreateAccessPointOutput] = js.native
    def createLoadBalancerListeners(
        params: CreateLoadBalancerListenerInput
    ): Request[CreateLoadBalancerListenerOutput] = js.native
    def createLoadBalancerPolicy(params: CreateLoadBalancerPolicyInput): Request[CreateLoadBalancerPolicyOutput] =
      js.native
    def deleteLoadBalancer(params: DeleteAccessPointInput): Request[DeleteAccessPointOutput] = js.native
    def deleteLoadBalancerListeners(
        params: DeleteLoadBalancerListenerInput
    ): Request[DeleteLoadBalancerListenerOutput] = js.native
    def deleteLoadBalancerPolicy(params: DeleteLoadBalancerPolicyInput): Request[DeleteLoadBalancerPolicyOutput] =
      js.native
    def deregisterInstancesFromLoadBalancer(params: DeregisterEndPointsInput): Request[DeregisterEndPointsOutput] =
      js.native
    def describeAccountLimits(params: DescribeAccountLimitsInput): Request[DescribeAccountLimitsOutput]  = js.native
    def describeInstanceHealth(params: DescribeEndPointStateInput): Request[DescribeEndPointStateOutput] = js.native
    def describeLoadBalancerAttributes(
        params: DescribeLoadBalancerAttributesInput
    ): Request[DescribeLoadBalancerAttributesOutput] = js.native
    def describeLoadBalancerPolicies(
        params: DescribeLoadBalancerPoliciesInput
    ): Request[DescribeLoadBalancerPoliciesOutput] = js.native
    def describeLoadBalancerPolicyTypes(
        params: DescribeLoadBalancerPolicyTypesInput
    ): Request[DescribeLoadBalancerPolicyTypesOutput]                                                 = js.native
    def describeLoadBalancers(params: DescribeAccessPointsInput): Request[DescribeAccessPointsOutput] = js.native
    def describeTags(params: DescribeTagsInput): Request[DescribeTagsOutput]                          = js.native
    def detachLoadBalancerFromSubnets(
        params: DetachLoadBalancerFromSubnetsInput
    ): Request[DetachLoadBalancerFromSubnetsOutput] = js.native
    def disableAvailabilityZonesForLoadBalancer(
        params: RemoveAvailabilityZonesInput
    ): Request[RemoveAvailabilityZonesOutput] = js.native
    def enableAvailabilityZonesForLoadBalancer(params: AddAvailabilityZonesInput): Request[AddAvailabilityZonesOutput] =
      js.native
    def modifyLoadBalancerAttributes(
        params: ModifyLoadBalancerAttributesInput
    ): Request[ModifyLoadBalancerAttributesOutput]                                                          = js.native
    def registerInstancesWithLoadBalancer(params: RegisterEndPointsInput): Request[RegisterEndPointsOutput] = js.native
    def removeTags(params: RemoveTagsInput): Request[RemoveTagsOutput]                                      = js.native
    def setLoadBalancerListenerSSLCertificate(
        params: SetLoadBalancerListenerSSLCertificateInput
    ): Request[SetLoadBalancerListenerSSLCertificateOutput] = js.native
    def setLoadBalancerPoliciesForBackendServer(
        params: SetLoadBalancerPoliciesForBackendServerInput
    ): Request[SetLoadBalancerPoliciesForBackendServerOutput] = js.native
    def setLoadBalancerPoliciesOfListener(
        params: SetLoadBalancerPoliciesOfListenerInput
    ): Request[SetLoadBalancerPoliciesOfListenerOutput] = js.native
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
    @inline
    def apply(
        Enabled: AccessLogEnabled,
        EmitInterval: js.UndefOr[AccessLogInterval] = js.undefined,
        S3BucketName: js.UndefOr[S3BucketName] = js.undefined,
        S3BucketPrefix: js.UndefOr[AccessLogPrefix] = js.undefined
    ): AccessLog = {
      val __obj = js.Dynamic.literal(
        "Enabled" -> Enabled.asInstanceOf[js.Any]
      )

      EmitInterval.foreach(__v => __obj.updateDynamic("EmitInterval")(__v.asInstanceOf[js.Any]))
      S3BucketName.foreach(__v => __obj.updateDynamic("S3BucketName")(__v.asInstanceOf[js.Any]))
      S3BucketPrefix.foreach(__v => __obj.updateDynamic("S3BucketPrefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccessLog]
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
    @inline
    def apply(
        AvailabilityZones: AvailabilityZones,
        LoadBalancerName: AccessPointName
    ): AddAvailabilityZonesInput = {
      val __obj = js.Dynamic.literal(
        "AvailabilityZones" -> AvailabilityZones.asInstanceOf[js.Any],
        "LoadBalancerName"  -> LoadBalancerName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AddAvailabilityZonesInput]
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
    @inline
    def apply(
        AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined
    ): AddAvailabilityZonesOutput = {
      val __obj = js.Dynamic.literal()
      AvailabilityZones.foreach(__v => __obj.updateDynamic("AvailabilityZones")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AddAvailabilityZonesOutput]
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
    @inline
    def apply(
        LoadBalancerNames: LoadBalancerNames,
        Tags: TagList
    ): AddTagsInput = {
      val __obj = js.Dynamic.literal(
        "LoadBalancerNames" -> LoadBalancerNames.asInstanceOf[js.Any],
        "Tags"              -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AddTagsInput]
    }
  }

  /**
    * Contains the output of AddTags.
    */
  @js.native
  trait AddTagsOutput extends js.Object {}

  object AddTagsOutput {
    @inline
    def apply(
        ): AddTagsOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[AddTagsOutput]
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
    @inline
    def apply(
        Key: js.UndefOr[AdditionalAttributeKey] = js.undefined,
        Value: js.UndefOr[AdditionalAttributeValue] = js.undefined
    ): AdditionalAttribute = {
      val __obj = js.Dynamic.literal()
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AdditionalAttribute]
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
    @inline
    def apply(
        CookieName: js.UndefOr[CookieName] = js.undefined,
        PolicyName: js.UndefOr[PolicyName] = js.undefined
    ): AppCookieStickinessPolicy = {
      val __obj = js.Dynamic.literal()
      CookieName.foreach(__v => __obj.updateDynamic("CookieName")(__v.asInstanceOf[js.Any]))
      PolicyName.foreach(__v => __obj.updateDynamic("PolicyName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AppCookieStickinessPolicy]
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
    @inline
    def apply(
        LoadBalancerName: AccessPointName,
        SecurityGroups: SecurityGroups
    ): ApplySecurityGroupsToLoadBalancerInput = {
      val __obj = js.Dynamic.literal(
        "LoadBalancerName" -> LoadBalancerName.asInstanceOf[js.Any],
        "SecurityGroups"   -> SecurityGroups.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ApplySecurityGroupsToLoadBalancerInput]
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
    @inline
    def apply(
        SecurityGroups: js.UndefOr[SecurityGroups] = js.undefined
    ): ApplySecurityGroupsToLoadBalancerOutput = {
      val __obj = js.Dynamic.literal()
      SecurityGroups.foreach(__v => __obj.updateDynamic("SecurityGroups")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApplySecurityGroupsToLoadBalancerOutput]
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
    @inline
    def apply(
        LoadBalancerName: AccessPointName,
        Subnets: Subnets
    ): AttachLoadBalancerToSubnetsInput = {
      val __obj = js.Dynamic.literal(
        "LoadBalancerName" -> LoadBalancerName.asInstanceOf[js.Any],
        "Subnets"          -> Subnets.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AttachLoadBalancerToSubnetsInput]
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
    @inline
    def apply(
        Subnets: js.UndefOr[Subnets] = js.undefined
    ): AttachLoadBalancerToSubnetsOutput = {
      val __obj = js.Dynamic.literal()
      Subnets.foreach(__v => __obj.updateDynamic("Subnets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AttachLoadBalancerToSubnetsOutput]
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
    @inline
    def apply(
        InstancePort: js.UndefOr[InstancePort] = js.undefined,
        PolicyNames: js.UndefOr[PolicyNames] = js.undefined
    ): BackendServerDescription = {
      val __obj = js.Dynamic.literal()
      InstancePort.foreach(__v => __obj.updateDynamic("InstancePort")(__v.asInstanceOf[js.Any]))
      PolicyNames.foreach(__v => __obj.updateDynamic("PolicyNames")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BackendServerDescription]
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
    @inline
    def apply(
        HealthCheck: HealthCheck,
        LoadBalancerName: AccessPointName
    ): ConfigureHealthCheckInput = {
      val __obj = js.Dynamic.literal(
        "HealthCheck"      -> HealthCheck.asInstanceOf[js.Any],
        "LoadBalancerName" -> LoadBalancerName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ConfigureHealthCheckInput]
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
    @inline
    def apply(
        HealthCheck: js.UndefOr[HealthCheck] = js.undefined
    ): ConfigureHealthCheckOutput = {
      val __obj = js.Dynamic.literal()
      HealthCheck.foreach(__v => __obj.updateDynamic("HealthCheck")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfigureHealthCheckOutput]
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
    @inline
    def apply(
        Enabled: ConnectionDrainingEnabled,
        Timeout: js.UndefOr[ConnectionDrainingTimeout] = js.undefined
    ): ConnectionDraining = {
      val __obj = js.Dynamic.literal(
        "Enabled" -> Enabled.asInstanceOf[js.Any]
      )

      Timeout.foreach(__v => __obj.updateDynamic("Timeout")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConnectionDraining]
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
    @inline
    def apply(
        IdleTimeout: IdleTimeout
    ): ConnectionSettings = {
      val __obj = js.Dynamic.literal(
        "IdleTimeout" -> IdleTimeout.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ConnectionSettings]
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
    @inline
    def apply(
        Listeners: Listeners,
        LoadBalancerName: AccessPointName,
        AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined,
        Scheme: js.UndefOr[LoadBalancerScheme] = js.undefined,
        SecurityGroups: js.UndefOr[SecurityGroups] = js.undefined,
        Subnets: js.UndefOr[Subnets] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateAccessPointInput = {
      val __obj = js.Dynamic.literal(
        "Listeners"        -> Listeners.asInstanceOf[js.Any],
        "LoadBalancerName" -> LoadBalancerName.asInstanceOf[js.Any]
      )

      AvailabilityZones.foreach(__v => __obj.updateDynamic("AvailabilityZones")(__v.asInstanceOf[js.Any]))
      Scheme.foreach(__v => __obj.updateDynamic("Scheme")(__v.asInstanceOf[js.Any]))
      SecurityGroups.foreach(__v => __obj.updateDynamic("SecurityGroups")(__v.asInstanceOf[js.Any]))
      Subnets.foreach(__v => __obj.updateDynamic("Subnets")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAccessPointInput]
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
    @inline
    def apply(
        DNSName: js.UndefOr[DNSName] = js.undefined
    ): CreateAccessPointOutput = {
      val __obj = js.Dynamic.literal()
      DNSName.foreach(__v => __obj.updateDynamic("DNSName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAccessPointOutput]
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
    @inline
    def apply(
        CookieName: CookieName,
        LoadBalancerName: AccessPointName,
        PolicyName: PolicyName
    ): CreateAppCookieStickinessPolicyInput = {
      val __obj = js.Dynamic.literal(
        "CookieName"       -> CookieName.asInstanceOf[js.Any],
        "LoadBalancerName" -> LoadBalancerName.asInstanceOf[js.Any],
        "PolicyName"       -> PolicyName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateAppCookieStickinessPolicyInput]
    }
  }

  /**
    * Contains the output for CreateAppCookieStickinessPolicy.
    */
  @js.native
  trait CreateAppCookieStickinessPolicyOutput extends js.Object {}

  object CreateAppCookieStickinessPolicyOutput {
    @inline
    def apply(
        ): CreateAppCookieStickinessPolicyOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[CreateAppCookieStickinessPolicyOutput]
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
    @inline
    def apply(
        LoadBalancerName: AccessPointName,
        PolicyName: PolicyName,
        CookieExpirationPeriod: js.UndefOr[CookieExpirationPeriod] = js.undefined
    ): CreateLBCookieStickinessPolicyInput = {
      val __obj = js.Dynamic.literal(
        "LoadBalancerName" -> LoadBalancerName.asInstanceOf[js.Any],
        "PolicyName"       -> PolicyName.asInstanceOf[js.Any]
      )

      CookieExpirationPeriod.foreach(__v => __obj.updateDynamic("CookieExpirationPeriod")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLBCookieStickinessPolicyInput]
    }
  }

  /**
    * Contains the output for CreateLBCookieStickinessPolicy.
    */
  @js.native
  trait CreateLBCookieStickinessPolicyOutput extends js.Object {}

  object CreateLBCookieStickinessPolicyOutput {
    @inline
    def apply(
        ): CreateLBCookieStickinessPolicyOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[CreateLBCookieStickinessPolicyOutput]
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
    @inline
    def apply(
        Listeners: Listeners,
        LoadBalancerName: AccessPointName
    ): CreateLoadBalancerListenerInput = {
      val __obj = js.Dynamic.literal(
        "Listeners"        -> Listeners.asInstanceOf[js.Any],
        "LoadBalancerName" -> LoadBalancerName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateLoadBalancerListenerInput]
    }
  }

  /**
    * Contains the parameters for CreateLoadBalancerListener.
    */
  @js.native
  trait CreateLoadBalancerListenerOutput extends js.Object {}

  object CreateLoadBalancerListenerOutput {
    @inline
    def apply(
        ): CreateLoadBalancerListenerOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[CreateLoadBalancerListenerOutput]
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
    @inline
    def apply(
        LoadBalancerName: AccessPointName,
        PolicyName: PolicyName,
        PolicyTypeName: PolicyTypeName,
        PolicyAttributes: js.UndefOr[PolicyAttributes] = js.undefined
    ): CreateLoadBalancerPolicyInput = {
      val __obj = js.Dynamic.literal(
        "LoadBalancerName" -> LoadBalancerName.asInstanceOf[js.Any],
        "PolicyName"       -> PolicyName.asInstanceOf[js.Any],
        "PolicyTypeName"   -> PolicyTypeName.asInstanceOf[js.Any]
      )

      PolicyAttributes.foreach(__v => __obj.updateDynamic("PolicyAttributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLoadBalancerPolicyInput]
    }
  }

  /**
    * Contains the output of CreateLoadBalancerPolicy.
    */
  @js.native
  trait CreateLoadBalancerPolicyOutput extends js.Object {}

  object CreateLoadBalancerPolicyOutput {
    @inline
    def apply(
        ): CreateLoadBalancerPolicyOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[CreateLoadBalancerPolicyOutput]
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
    @inline
    def apply(
        Enabled: CrossZoneLoadBalancingEnabled
    ): CrossZoneLoadBalancing = {
      val __obj = js.Dynamic.literal(
        "Enabled" -> Enabled.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CrossZoneLoadBalancing]
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
    @inline
    def apply(
        LoadBalancerName: AccessPointName
    ): DeleteAccessPointInput = {
      val __obj = js.Dynamic.literal(
        "LoadBalancerName" -> LoadBalancerName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteAccessPointInput]
    }
  }

  /**
    * Contains the output of DeleteLoadBalancer.
    */
  @js.native
  trait DeleteAccessPointOutput extends js.Object {}

  object DeleteAccessPointOutput {
    @inline
    def apply(
        ): DeleteAccessPointOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteAccessPointOutput]
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
    @inline
    def apply(
        LoadBalancerName: AccessPointName,
        LoadBalancerPorts: Ports
    ): DeleteLoadBalancerListenerInput = {
      val __obj = js.Dynamic.literal(
        "LoadBalancerName"  -> LoadBalancerName.asInstanceOf[js.Any],
        "LoadBalancerPorts" -> LoadBalancerPorts.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteLoadBalancerListenerInput]
    }
  }

  /**
    * Contains the output of DeleteLoadBalancerListeners.
    */
  @js.native
  trait DeleteLoadBalancerListenerOutput extends js.Object {}

  object DeleteLoadBalancerListenerOutput {
    @inline
    def apply(
        ): DeleteLoadBalancerListenerOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteLoadBalancerListenerOutput]
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
    @inline
    def apply(
        LoadBalancerName: AccessPointName,
        PolicyName: PolicyName
    ): DeleteLoadBalancerPolicyInput = {
      val __obj = js.Dynamic.literal(
        "LoadBalancerName" -> LoadBalancerName.asInstanceOf[js.Any],
        "PolicyName"       -> PolicyName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteLoadBalancerPolicyInput]
    }
  }

  /**
    * Contains the output of DeleteLoadBalancerPolicy.
    */
  @js.native
  trait DeleteLoadBalancerPolicyOutput extends js.Object {}

  object DeleteLoadBalancerPolicyOutput {
    @inline
    def apply(
        ): DeleteLoadBalancerPolicyOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteLoadBalancerPolicyOutput]
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
    @inline
    def apply(
        Instances: Instances,
        LoadBalancerName: AccessPointName
    ): DeregisterEndPointsInput = {
      val __obj = js.Dynamic.literal(
        "Instances"        -> Instances.asInstanceOf[js.Any],
        "LoadBalancerName" -> LoadBalancerName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeregisterEndPointsInput]
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
    @inline
    def apply(
        Instances: js.UndefOr[Instances] = js.undefined
    ): DeregisterEndPointsOutput = {
      val __obj = js.Dynamic.literal()
      Instances.foreach(__v => __obj.updateDynamic("Instances")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeregisterEndPointsOutput]
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
    @inline
    def apply(
        LoadBalancerNames: js.UndefOr[LoadBalancerNames] = js.undefined,
        Marker: js.UndefOr[Marker] = js.undefined,
        PageSize: js.UndefOr[PageSize] = js.undefined
    ): DescribeAccessPointsInput = {
      val __obj = js.Dynamic.literal()
      LoadBalancerNames.foreach(__v => __obj.updateDynamic("LoadBalancerNames")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAccessPointsInput]
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
    @inline
    def apply(
        LoadBalancerDescriptions: js.UndefOr[LoadBalancerDescriptions] = js.undefined,
        NextMarker: js.UndefOr[Marker] = js.undefined
    ): DescribeAccessPointsOutput = {
      val __obj = js.Dynamic.literal()
      LoadBalancerDescriptions.foreach(__v => __obj.updateDynamic("LoadBalancerDescriptions")(__v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.updateDynamic("NextMarker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAccessPointsOutput]
    }
  }

  @js.native
  trait DescribeAccountLimitsInput extends js.Object {
    var Marker: js.UndefOr[Marker]
    var PageSize: js.UndefOr[PageSize]
  }

  object DescribeAccountLimitsInput {
    @inline
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
    @inline
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

  /**
    * Contains the parameters for DescribeInstanceHealth.
    */
  @js.native
  trait DescribeEndPointStateInput extends js.Object {
    var LoadBalancerName: AccessPointName
    var Instances: js.UndefOr[Instances]
  }

  object DescribeEndPointStateInput {
    @inline
    def apply(
        LoadBalancerName: AccessPointName,
        Instances: js.UndefOr[Instances] = js.undefined
    ): DescribeEndPointStateInput = {
      val __obj = js.Dynamic.literal(
        "LoadBalancerName" -> LoadBalancerName.asInstanceOf[js.Any]
      )

      Instances.foreach(__v => __obj.updateDynamic("Instances")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEndPointStateInput]
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
    @inline
    def apply(
        InstanceStates: js.UndefOr[InstanceStates] = js.undefined
    ): DescribeEndPointStateOutput = {
      val __obj = js.Dynamic.literal()
      InstanceStates.foreach(__v => __obj.updateDynamic("InstanceStates")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEndPointStateOutput]
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
    @inline
    def apply(
        LoadBalancerName: AccessPointName
    ): DescribeLoadBalancerAttributesInput = {
      val __obj = js.Dynamic.literal(
        "LoadBalancerName" -> LoadBalancerName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeLoadBalancerAttributesInput]
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
    @inline
    def apply(
        LoadBalancerAttributes: js.UndefOr[LoadBalancerAttributes] = js.undefined
    ): DescribeLoadBalancerAttributesOutput = {
      val __obj = js.Dynamic.literal()
      LoadBalancerAttributes.foreach(__v => __obj.updateDynamic("LoadBalancerAttributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeLoadBalancerAttributesOutput]
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
    @inline
    def apply(
        LoadBalancerName: js.UndefOr[AccessPointName] = js.undefined,
        PolicyNames: js.UndefOr[PolicyNames] = js.undefined
    ): DescribeLoadBalancerPoliciesInput = {
      val __obj = js.Dynamic.literal()
      LoadBalancerName.foreach(__v => __obj.updateDynamic("LoadBalancerName")(__v.asInstanceOf[js.Any]))
      PolicyNames.foreach(__v => __obj.updateDynamic("PolicyNames")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeLoadBalancerPoliciesInput]
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
    @inline
    def apply(
        PolicyDescriptions: js.UndefOr[PolicyDescriptions] = js.undefined
    ): DescribeLoadBalancerPoliciesOutput = {
      val __obj = js.Dynamic.literal()
      PolicyDescriptions.foreach(__v => __obj.updateDynamic("PolicyDescriptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeLoadBalancerPoliciesOutput]
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
    @inline
    def apply(
        PolicyTypeNames: js.UndefOr[PolicyTypeNames] = js.undefined
    ): DescribeLoadBalancerPolicyTypesInput = {
      val __obj = js.Dynamic.literal()
      PolicyTypeNames.foreach(__v => __obj.updateDynamic("PolicyTypeNames")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeLoadBalancerPolicyTypesInput]
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
    @inline
    def apply(
        PolicyTypeDescriptions: js.UndefOr[PolicyTypeDescriptions] = js.undefined
    ): DescribeLoadBalancerPolicyTypesOutput = {
      val __obj = js.Dynamic.literal()
      PolicyTypeDescriptions.foreach(__v => __obj.updateDynamic("PolicyTypeDescriptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeLoadBalancerPolicyTypesOutput]
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
    @inline
    def apply(
        LoadBalancerNames: LoadBalancerNamesMax20
    ): DescribeTagsInput = {
      val __obj = js.Dynamic.literal(
        "LoadBalancerNames" -> LoadBalancerNames.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeTagsInput]
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
    @inline
    def apply(
        TagDescriptions: js.UndefOr[TagDescriptions] = js.undefined
    ): DescribeTagsOutput = {
      val __obj = js.Dynamic.literal()
      TagDescriptions.foreach(__v => __obj.updateDynamic("TagDescriptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTagsOutput]
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
    @inline
    def apply(
        LoadBalancerName: AccessPointName,
        Subnets: Subnets
    ): DetachLoadBalancerFromSubnetsInput = {
      val __obj = js.Dynamic.literal(
        "LoadBalancerName" -> LoadBalancerName.asInstanceOf[js.Any],
        "Subnets"          -> Subnets.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DetachLoadBalancerFromSubnetsInput]
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
    @inline
    def apply(
        Subnets: js.UndefOr[Subnets] = js.undefined
    ): DetachLoadBalancerFromSubnetsOutput = {
      val __obj = js.Dynamic.literal()
      Subnets.foreach(__v => __obj.updateDynamic("Subnets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetachLoadBalancerFromSubnetsOutput]
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
    @inline
    def apply(
        HealthyThreshold: HealthyThreshold,
        Interval: HealthCheckInterval,
        Target: HealthCheckTarget,
        Timeout: HealthCheckTimeout,
        UnhealthyThreshold: UnhealthyThreshold
    ): HealthCheck = {
      val __obj = js.Dynamic.literal(
        "HealthyThreshold"   -> HealthyThreshold.asInstanceOf[js.Any],
        "Interval"           -> Interval.asInstanceOf[js.Any],
        "Target"             -> Target.asInstanceOf[js.Any],
        "Timeout"            -> Timeout.asInstanceOf[js.Any],
        "UnhealthyThreshold" -> UnhealthyThreshold.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[HealthCheck]
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
    @inline
    def apply(
        InstanceId: js.UndefOr[InstanceId] = js.undefined
    ): Instance = {
      val __obj = js.Dynamic.literal()
      InstanceId.foreach(__v => __obj.updateDynamic("InstanceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Instance]
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
    @inline
    def apply(
        Description: js.UndefOr[Description] = js.undefined,
        InstanceId: js.UndefOr[InstanceId] = js.undefined,
        ReasonCode: js.UndefOr[ReasonCode] = js.undefined,
        State: js.UndefOr[State] = js.undefined
    ): InstanceState = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      InstanceId.foreach(__v => __obj.updateDynamic("InstanceId")(__v.asInstanceOf[js.Any]))
      ReasonCode.foreach(__v => __obj.updateDynamic("ReasonCode")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceState]
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
    @inline
    def apply(
        CookieExpirationPeriod: js.UndefOr[CookieExpirationPeriod] = js.undefined,
        PolicyName: js.UndefOr[PolicyName] = js.undefined
    ): LBCookieStickinessPolicy = {
      val __obj = js.Dynamic.literal()
      CookieExpirationPeriod.foreach(__v => __obj.updateDynamic("CookieExpirationPeriod")(__v.asInstanceOf[js.Any]))
      PolicyName.foreach(__v => __obj.updateDynamic("PolicyName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LBCookieStickinessPolicy]
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
    @inline
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
    *  For information about the protocols and the ports supported by Elastic Load Balancing, see [[http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-listener-config.html|Listeners for Your Classic Load Balancer]] in the <i>Classic Load Balancers Guide</i>.
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
    @inline
    def apply(
        InstancePort: InstancePort,
        LoadBalancerPort: AccessPointPort,
        Protocol: Protocol,
        InstanceProtocol: js.UndefOr[Protocol] = js.undefined,
        SSLCertificateId: js.UndefOr[SSLCertificateId] = js.undefined
    ): Listener = {
      val __obj = js.Dynamic.literal(
        "InstancePort"     -> InstancePort.asInstanceOf[js.Any],
        "LoadBalancerPort" -> LoadBalancerPort.asInstanceOf[js.Any],
        "Protocol"         -> Protocol.asInstanceOf[js.Any]
      )

      InstanceProtocol.foreach(__v => __obj.updateDynamic("InstanceProtocol")(__v.asInstanceOf[js.Any]))
      SSLCertificateId.foreach(__v => __obj.updateDynamic("SSLCertificateId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Listener]
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
    @inline
    def apply(
        Listener: js.UndefOr[Listener] = js.undefined,
        PolicyNames: js.UndefOr[PolicyNames] = js.undefined
    ): ListenerDescription = {
      val __obj = js.Dynamic.literal()
      Listener.foreach(__v => __obj.updateDynamic("Listener")(__v.asInstanceOf[js.Any]))
      PolicyNames.foreach(__v => __obj.updateDynamic("PolicyNames")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListenerDescription]
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
    @inline
    def apply(
        AccessLog: js.UndefOr[AccessLog] = js.undefined,
        AdditionalAttributes: js.UndefOr[AdditionalAttributes] = js.undefined,
        ConnectionDraining: js.UndefOr[ConnectionDraining] = js.undefined,
        ConnectionSettings: js.UndefOr[ConnectionSettings] = js.undefined,
        CrossZoneLoadBalancing: js.UndefOr[CrossZoneLoadBalancing] = js.undefined
    ): LoadBalancerAttributes = {
      val __obj = js.Dynamic.literal()
      AccessLog.foreach(__v => __obj.updateDynamic("AccessLog")(__v.asInstanceOf[js.Any]))
      AdditionalAttributes.foreach(__v => __obj.updateDynamic("AdditionalAttributes")(__v.asInstanceOf[js.Any]))
      ConnectionDraining.foreach(__v => __obj.updateDynamic("ConnectionDraining")(__v.asInstanceOf[js.Any]))
      ConnectionSettings.foreach(__v => __obj.updateDynamic("ConnectionSettings")(__v.asInstanceOf[js.Any]))
      CrossZoneLoadBalancing.foreach(__v => __obj.updateDynamic("CrossZoneLoadBalancing")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LoadBalancerAttributes]
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
    @inline
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
        VPCId: js.UndefOr[VPCId] = js.undefined
    ): LoadBalancerDescription = {
      val __obj = js.Dynamic.literal()
      AvailabilityZones.foreach(__v => __obj.updateDynamic("AvailabilityZones")(__v.asInstanceOf[js.Any]))
      BackendServerDescriptions.foreach(__v =>
        __obj.updateDynamic("BackendServerDescriptions")(__v.asInstanceOf[js.Any])
      )
      CanonicalHostedZoneName.foreach(__v => __obj.updateDynamic("CanonicalHostedZoneName")(__v.asInstanceOf[js.Any]))
      CanonicalHostedZoneNameID.foreach(__v =>
        __obj.updateDynamic("CanonicalHostedZoneNameID")(__v.asInstanceOf[js.Any])
      )
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      DNSName.foreach(__v => __obj.updateDynamic("DNSName")(__v.asInstanceOf[js.Any]))
      HealthCheck.foreach(__v => __obj.updateDynamic("HealthCheck")(__v.asInstanceOf[js.Any]))
      Instances.foreach(__v => __obj.updateDynamic("Instances")(__v.asInstanceOf[js.Any]))
      ListenerDescriptions.foreach(__v => __obj.updateDynamic("ListenerDescriptions")(__v.asInstanceOf[js.Any]))
      LoadBalancerName.foreach(__v => __obj.updateDynamic("LoadBalancerName")(__v.asInstanceOf[js.Any]))
      Policies.foreach(__v => __obj.updateDynamic("Policies")(__v.asInstanceOf[js.Any]))
      Scheme.foreach(__v => __obj.updateDynamic("Scheme")(__v.asInstanceOf[js.Any]))
      SecurityGroups.foreach(__v => __obj.updateDynamic("SecurityGroups")(__v.asInstanceOf[js.Any]))
      SourceSecurityGroup.foreach(__v => __obj.updateDynamic("SourceSecurityGroup")(__v.asInstanceOf[js.Any]))
      Subnets.foreach(__v => __obj.updateDynamic("Subnets")(__v.asInstanceOf[js.Any]))
      VPCId.foreach(__v => __obj.updateDynamic("VPCId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LoadBalancerDescription]
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
    @inline
    def apply(
        LoadBalancerAttributes: LoadBalancerAttributes,
        LoadBalancerName: AccessPointName
    ): ModifyLoadBalancerAttributesInput = {
      val __obj = js.Dynamic.literal(
        "LoadBalancerAttributes" -> LoadBalancerAttributes.asInstanceOf[js.Any],
        "LoadBalancerName"       -> LoadBalancerName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ModifyLoadBalancerAttributesInput]
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
    @inline
    def apply(
        LoadBalancerAttributes: js.UndefOr[LoadBalancerAttributes] = js.undefined,
        LoadBalancerName: js.UndefOr[AccessPointName] = js.undefined
    ): ModifyLoadBalancerAttributesOutput = {
      val __obj = js.Dynamic.literal()
      LoadBalancerAttributes.foreach(__v => __obj.updateDynamic("LoadBalancerAttributes")(__v.asInstanceOf[js.Any]))
      LoadBalancerName.foreach(__v => __obj.updateDynamic("LoadBalancerName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ModifyLoadBalancerAttributesOutput]
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
    @inline
    def apply(
        AppCookieStickinessPolicies: js.UndefOr[AppCookieStickinessPolicies] = js.undefined,
        LBCookieStickinessPolicies: js.UndefOr[LBCookieStickinessPolicies] = js.undefined,
        OtherPolicies: js.UndefOr[PolicyNames] = js.undefined
    ): Policies = {
      val __obj = js.Dynamic.literal()
      AppCookieStickinessPolicies.foreach(__v =>
        __obj.updateDynamic("AppCookieStickinessPolicies")(__v.asInstanceOf[js.Any])
      )
      LBCookieStickinessPolicies.foreach(__v =>
        __obj.updateDynamic("LBCookieStickinessPolicies")(__v.asInstanceOf[js.Any])
      )
      OtherPolicies.foreach(__v => __obj.updateDynamic("OtherPolicies")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Policies]
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
    @inline
    def apply(
        AttributeName: js.UndefOr[AttributeName] = js.undefined,
        AttributeValue: js.UndefOr[AttributeValue] = js.undefined
    ): PolicyAttribute = {
      val __obj = js.Dynamic.literal()
      AttributeName.foreach(__v => __obj.updateDynamic("AttributeName")(__v.asInstanceOf[js.Any]))
      AttributeValue.foreach(__v => __obj.updateDynamic("AttributeValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PolicyAttribute]
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
    @inline
    def apply(
        AttributeName: js.UndefOr[AttributeName] = js.undefined,
        AttributeValue: js.UndefOr[AttributeValue] = js.undefined
    ): PolicyAttributeDescription = {
      val __obj = js.Dynamic.literal()
      AttributeName.foreach(__v => __obj.updateDynamic("AttributeName")(__v.asInstanceOf[js.Any]))
      AttributeValue.foreach(__v => __obj.updateDynamic("AttributeValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PolicyAttributeDescription]
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
    @inline
    def apply(
        AttributeName: js.UndefOr[AttributeName] = js.undefined,
        AttributeType: js.UndefOr[AttributeType] = js.undefined,
        Cardinality: js.UndefOr[Cardinality] = js.undefined,
        DefaultValue: js.UndefOr[DefaultValue] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined
    ): PolicyAttributeTypeDescription = {
      val __obj = js.Dynamic.literal()
      AttributeName.foreach(__v => __obj.updateDynamic("AttributeName")(__v.asInstanceOf[js.Any]))
      AttributeType.foreach(__v => __obj.updateDynamic("AttributeType")(__v.asInstanceOf[js.Any]))
      Cardinality.foreach(__v => __obj.updateDynamic("Cardinality")(__v.asInstanceOf[js.Any]))
      DefaultValue.foreach(__v => __obj.updateDynamic("DefaultValue")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PolicyAttributeTypeDescription]
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
    @inline
    def apply(
        PolicyAttributeDescriptions: js.UndefOr[PolicyAttributeDescriptions] = js.undefined,
        PolicyName: js.UndefOr[PolicyName] = js.undefined,
        PolicyTypeName: js.UndefOr[PolicyTypeName] = js.undefined
    ): PolicyDescription = {
      val __obj = js.Dynamic.literal()
      PolicyAttributeDescriptions.foreach(__v =>
        __obj.updateDynamic("PolicyAttributeDescriptions")(__v.asInstanceOf[js.Any])
      )
      PolicyName.foreach(__v => __obj.updateDynamic("PolicyName")(__v.asInstanceOf[js.Any]))
      PolicyTypeName.foreach(__v => __obj.updateDynamic("PolicyTypeName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PolicyDescription]
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
    @inline
    def apply(
        Description: js.UndefOr[Description] = js.undefined,
        PolicyAttributeTypeDescriptions: js.UndefOr[PolicyAttributeTypeDescriptions] = js.undefined,
        PolicyTypeName: js.UndefOr[PolicyTypeName] = js.undefined
    ): PolicyTypeDescription = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      PolicyAttributeTypeDescriptions.foreach(__v =>
        __obj.updateDynamic("PolicyAttributeTypeDescriptions")(__v.asInstanceOf[js.Any])
      )
      PolicyTypeName.foreach(__v => __obj.updateDynamic("PolicyTypeName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PolicyTypeDescription]
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
    @inline
    def apply(
        Instances: Instances,
        LoadBalancerName: AccessPointName
    ): RegisterEndPointsInput = {
      val __obj = js.Dynamic.literal(
        "Instances"        -> Instances.asInstanceOf[js.Any],
        "LoadBalancerName" -> LoadBalancerName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RegisterEndPointsInput]
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
    @inline
    def apply(
        Instances: js.UndefOr[Instances] = js.undefined
    ): RegisterEndPointsOutput = {
      val __obj = js.Dynamic.literal()
      Instances.foreach(__v => __obj.updateDynamic("Instances")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterEndPointsOutput]
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
    @inline
    def apply(
        AvailabilityZones: AvailabilityZones,
        LoadBalancerName: AccessPointName
    ): RemoveAvailabilityZonesInput = {
      val __obj = js.Dynamic.literal(
        "AvailabilityZones" -> AvailabilityZones.asInstanceOf[js.Any],
        "LoadBalancerName"  -> LoadBalancerName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RemoveAvailabilityZonesInput]
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
    @inline
    def apply(
        AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined
    ): RemoveAvailabilityZonesOutput = {
      val __obj = js.Dynamic.literal()
      AvailabilityZones.foreach(__v => __obj.updateDynamic("AvailabilityZones")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RemoveAvailabilityZonesOutput]
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
    @inline
    def apply(
        LoadBalancerNames: LoadBalancerNames,
        Tags: TagKeyList
    ): RemoveTagsInput = {
      val __obj = js.Dynamic.literal(
        "LoadBalancerNames" -> LoadBalancerNames.asInstanceOf[js.Any],
        "Tags"              -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RemoveTagsInput]
    }
  }

  /**
    * Contains the output of RemoveTags.
    */
  @js.native
  trait RemoveTagsOutput extends js.Object {}

  object RemoveTagsOutput {
    @inline
    def apply(
        ): RemoveTagsOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[RemoveTagsOutput]
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
    @inline
    def apply(
        LoadBalancerName: AccessPointName,
        LoadBalancerPort: AccessPointPort,
        SSLCertificateId: SSLCertificateId
    ): SetLoadBalancerListenerSSLCertificateInput = {
      val __obj = js.Dynamic.literal(
        "LoadBalancerName" -> LoadBalancerName.asInstanceOf[js.Any],
        "LoadBalancerPort" -> LoadBalancerPort.asInstanceOf[js.Any],
        "SSLCertificateId" -> SSLCertificateId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SetLoadBalancerListenerSSLCertificateInput]
    }
  }

  /**
    * Contains the output of SetLoadBalancerListenerSSLCertificate.
    */
  @js.native
  trait SetLoadBalancerListenerSSLCertificateOutput extends js.Object {}

  object SetLoadBalancerListenerSSLCertificateOutput {
    @inline
    def apply(
        ): SetLoadBalancerListenerSSLCertificateOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[SetLoadBalancerListenerSSLCertificateOutput]
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
    @inline
    def apply(
        InstancePort: EndPointPort,
        LoadBalancerName: AccessPointName,
        PolicyNames: PolicyNames
    ): SetLoadBalancerPoliciesForBackendServerInput = {
      val __obj = js.Dynamic.literal(
        "InstancePort"     -> InstancePort.asInstanceOf[js.Any],
        "LoadBalancerName" -> LoadBalancerName.asInstanceOf[js.Any],
        "PolicyNames"      -> PolicyNames.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SetLoadBalancerPoliciesForBackendServerInput]
    }
  }

  /**
    * Contains the output of SetLoadBalancerPoliciesForBackendServer.
    */
  @js.native
  trait SetLoadBalancerPoliciesForBackendServerOutput extends js.Object {}

  object SetLoadBalancerPoliciesForBackendServerOutput {
    @inline
    def apply(
        ): SetLoadBalancerPoliciesForBackendServerOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[SetLoadBalancerPoliciesForBackendServerOutput]
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
    @inline
    def apply(
        LoadBalancerName: AccessPointName,
        LoadBalancerPort: AccessPointPort,
        PolicyNames: PolicyNames
    ): SetLoadBalancerPoliciesOfListenerInput = {
      val __obj = js.Dynamic.literal(
        "LoadBalancerName" -> LoadBalancerName.asInstanceOf[js.Any],
        "LoadBalancerPort" -> LoadBalancerPort.asInstanceOf[js.Any],
        "PolicyNames"      -> PolicyNames.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SetLoadBalancerPoliciesOfListenerInput]
    }
  }

  /**
    * Contains the output of SetLoadBalancePoliciesOfListener.
    */
  @js.native
  trait SetLoadBalancerPoliciesOfListenerOutput extends js.Object {}

  object SetLoadBalancerPoliciesOfListenerOutput {
    @inline
    def apply(
        ): SetLoadBalancerPoliciesOfListenerOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[SetLoadBalancerPoliciesOfListenerOutput]
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
    @inline
    def apply(
        GroupName: js.UndefOr[SecurityGroupName] = js.undefined,
        OwnerAlias: js.UndefOr[SecurityGroupOwnerAlias] = js.undefined
    ): SourceSecurityGroup = {
      val __obj = js.Dynamic.literal()
      GroupName.foreach(__v => __obj.updateDynamic("GroupName")(__v.asInstanceOf[js.Any]))
      OwnerAlias.foreach(__v => __obj.updateDynamic("OwnerAlias")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SourceSecurityGroup]
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
    @inline
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
    * The tags associated with a load balancer.
    */
  @js.native
  trait TagDescription extends js.Object {
    var LoadBalancerName: js.UndefOr[AccessPointName]
    var Tags: js.UndefOr[TagList]
  }

  object TagDescription {
    @inline
    def apply(
        LoadBalancerName: js.UndefOr[AccessPointName] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): TagDescription = {
      val __obj = js.Dynamic.literal()
      LoadBalancerName.foreach(__v => __obj.updateDynamic("LoadBalancerName")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TagDescription]
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
    @inline
    def apply(
        Key: js.UndefOr[TagKey] = js.undefined
    ): TagKeyOnly = {
      val __obj = js.Dynamic.literal()
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TagKeyOnly]
    }
  }
}
