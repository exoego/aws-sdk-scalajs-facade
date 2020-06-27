package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

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

    @inline def addTagsFuture(params: AddTagsInput): Future[AddTagsOutput] = service.addTags(params).promise().toFuture
    @inline def applySecurityGroupsToLoadBalancerFuture(
        params: ApplySecurityGroupsToLoadBalancerInput
    ): Future[ApplySecurityGroupsToLoadBalancerOutput] =
      service.applySecurityGroupsToLoadBalancer(params).promise().toFuture
    @inline def attachLoadBalancerToSubnetsFuture(
        params: AttachLoadBalancerToSubnetsInput
    ): Future[AttachLoadBalancerToSubnetsOutput] = service.attachLoadBalancerToSubnets(params).promise().toFuture
    @inline def configureHealthCheckFuture(params: ConfigureHealthCheckInput): Future[ConfigureHealthCheckOutput] =
      service.configureHealthCheck(params).promise().toFuture
    @inline def createAppCookieStickinessPolicyFuture(
        params: CreateAppCookieStickinessPolicyInput
    ): Future[CreateAppCookieStickinessPolicyOutput] =
      service.createAppCookieStickinessPolicy(params).promise().toFuture
    @inline def createLBCookieStickinessPolicyFuture(
        params: CreateLBCookieStickinessPolicyInput
    ): Future[CreateLBCookieStickinessPolicyOutput] = service.createLBCookieStickinessPolicy(params).promise().toFuture
    @inline def createLoadBalancerFuture(params: CreateAccessPointInput): Future[CreateAccessPointOutput] =
      service.createLoadBalancer(params).promise().toFuture
    @inline def createLoadBalancerListenersFuture(
        params: CreateLoadBalancerListenerInput
    ): Future[CreateLoadBalancerListenerOutput] = service.createLoadBalancerListeners(params).promise().toFuture
    @inline def createLoadBalancerPolicyFuture(
        params: CreateLoadBalancerPolicyInput
    ): Future[CreateLoadBalancerPolicyOutput] = service.createLoadBalancerPolicy(params).promise().toFuture
    @inline def deleteLoadBalancerFuture(params: DeleteAccessPointInput): Future[DeleteAccessPointOutput] =
      service.deleteLoadBalancer(params).promise().toFuture
    @inline def deleteLoadBalancerListenersFuture(
        params: DeleteLoadBalancerListenerInput
    ): Future[DeleteLoadBalancerListenerOutput] = service.deleteLoadBalancerListeners(params).promise().toFuture
    @inline def deleteLoadBalancerPolicyFuture(
        params: DeleteLoadBalancerPolicyInput
    ): Future[DeleteLoadBalancerPolicyOutput] = service.deleteLoadBalancerPolicy(params).promise().toFuture
    @inline def deregisterInstancesFromLoadBalancerFuture(
        params: DeregisterEndPointsInput
    ): Future[DeregisterEndPointsOutput] = service.deregisterInstancesFromLoadBalancer(params).promise().toFuture
    @inline def describeAccountLimitsFuture(params: DescribeAccountLimitsInput): Future[DescribeAccountLimitsOutput] =
      service.describeAccountLimits(params).promise().toFuture
    @inline def describeInstanceHealthFuture(params: DescribeEndPointStateInput): Future[DescribeEndPointStateOutput] =
      service.describeInstanceHealth(params).promise().toFuture
    @inline def describeLoadBalancerAttributesFuture(
        params: DescribeLoadBalancerAttributesInput
    ): Future[DescribeLoadBalancerAttributesOutput] = service.describeLoadBalancerAttributes(params).promise().toFuture
    @inline def describeLoadBalancerPoliciesFuture(
        params: DescribeLoadBalancerPoliciesInput
    ): Future[DescribeLoadBalancerPoliciesOutput] = service.describeLoadBalancerPolicies(params).promise().toFuture
    @inline def describeLoadBalancerPolicyTypesFuture(
        params: DescribeLoadBalancerPolicyTypesInput
    ): Future[DescribeLoadBalancerPolicyTypesOutput] =
      service.describeLoadBalancerPolicyTypes(params).promise().toFuture
    @inline def describeLoadBalancersFuture(params: DescribeAccessPointsInput): Future[DescribeAccessPointsOutput] =
      service.describeLoadBalancers(params).promise().toFuture
    @inline def describeTagsFuture(params: DescribeTagsInput): Future[DescribeTagsOutput] =
      service.describeTags(params).promise().toFuture
    @inline def detachLoadBalancerFromSubnetsFuture(
        params: DetachLoadBalancerFromSubnetsInput
    ): Future[DetachLoadBalancerFromSubnetsOutput] = service.detachLoadBalancerFromSubnets(params).promise().toFuture
    @inline def disableAvailabilityZonesForLoadBalancerFuture(
        params: RemoveAvailabilityZonesInput
    ): Future[RemoveAvailabilityZonesOutput] =
      service.disableAvailabilityZonesForLoadBalancer(params).promise().toFuture
    @inline def enableAvailabilityZonesForLoadBalancerFuture(
        params: AddAvailabilityZonesInput
    ): Future[AddAvailabilityZonesOutput] = service.enableAvailabilityZonesForLoadBalancer(params).promise().toFuture
    @inline def modifyLoadBalancerAttributesFuture(
        params: ModifyLoadBalancerAttributesInput
    ): Future[ModifyLoadBalancerAttributesOutput] = service.modifyLoadBalancerAttributes(params).promise().toFuture
    @inline def registerInstancesWithLoadBalancerFuture(
        params: RegisterEndPointsInput
    ): Future[RegisterEndPointsOutput] = service.registerInstancesWithLoadBalancer(params).promise().toFuture
    @inline def removeTagsFuture(params: RemoveTagsInput): Future[RemoveTagsOutput] =
      service.removeTags(params).promise().toFuture
    @inline def setLoadBalancerListenerSSLCertificateFuture(
        params: SetLoadBalancerListenerSSLCertificateInput
    ): Future[SetLoadBalancerListenerSSLCertificateOutput] =
      service.setLoadBalancerListenerSSLCertificate(params).promise().toFuture
    @inline def setLoadBalancerPoliciesForBackendServerFuture(
        params: SetLoadBalancerPoliciesForBackendServerInput
    ): Future[SetLoadBalancerPoliciesForBackendServerOutput] =
      service.setLoadBalancerPoliciesForBackendServer(params).promise().toFuture
    @inline def setLoadBalancerPoliciesOfListenerFuture(
        params: SetLoadBalancerPoliciesOfListenerInput
    ): Future[SetLoadBalancerPoliciesOfListenerOutput] =
      service.setLoadBalancerPoliciesOfListener(params).promise().toFuture
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
  @Factory
  trait AccessLog extends js.Object {
    var Enabled: AccessLogEnabled
    var EmitInterval: js.UndefOr[AccessLogInterval]
    var S3BucketName: js.UndefOr[S3BucketName]
    var S3BucketPrefix: js.UndefOr[AccessLogPrefix]
  }

  /**
    * Contains the parameters for EnableAvailabilityZonesForLoadBalancer.
    */
  @js.native
  @Factory
  trait AddAvailabilityZonesInput extends js.Object {
    var AvailabilityZones: AvailabilityZones
    var LoadBalancerName: AccessPointName
  }

  /**
    * Contains the output of EnableAvailabilityZonesForLoadBalancer.
    */
  @js.native
  @Factory
  trait AddAvailabilityZonesOutput extends js.Object {
    var AvailabilityZones: js.UndefOr[AvailabilityZones]
  }

  /**
    * Contains the parameters for AddTags.
    */
  @js.native
  @Factory
  trait AddTagsInput extends js.Object {
    var LoadBalancerNames: LoadBalancerNames
    var Tags: TagList
  }

  /**
    * Contains the output of AddTags.
    */
  @js.native
  @Factory
  trait AddTagsOutput extends js.Object {}

  /**
    * This data type is reserved.
    */
  @js.native
  @Factory
  trait AdditionalAttribute extends js.Object {
    var Key: js.UndefOr[AdditionalAttributeKey]
    var Value: js.UndefOr[AdditionalAttributeValue]
  }

  /**
    * Information about a policy for application-controlled session stickiness.
    */
  @js.native
  @Factory
  trait AppCookieStickinessPolicy extends js.Object {
    var CookieName: js.UndefOr[CookieName]
    var PolicyName: js.UndefOr[PolicyName]
  }

  /**
    * Contains the parameters for ApplySecurityGroupsToLoadBalancer.
    */
  @js.native
  @Factory
  trait ApplySecurityGroupsToLoadBalancerInput extends js.Object {
    var LoadBalancerName: AccessPointName
    var SecurityGroups: SecurityGroups
  }

  /**
    * Contains the output of ApplySecurityGroupsToLoadBalancer.
    */
  @js.native
  @Factory
  trait ApplySecurityGroupsToLoadBalancerOutput extends js.Object {
    var SecurityGroups: js.UndefOr[SecurityGroups]
  }

  /**
    * Contains the parameters for AttachLoaBalancerToSubnets.
    */
  @js.native
  @Factory
  trait AttachLoadBalancerToSubnetsInput extends js.Object {
    var LoadBalancerName: AccessPointName
    var Subnets: Subnets
  }

  /**
    * Contains the output of AttachLoadBalancerToSubnets.
    */
  @js.native
  @Factory
  trait AttachLoadBalancerToSubnetsOutput extends js.Object {
    var Subnets: js.UndefOr[Subnets]
  }

  /**
    * Information about the configuration of an EC2 instance.
    */
  @js.native
  @Factory
  trait BackendServerDescription extends js.Object {
    var InstancePort: js.UndefOr[InstancePort]
    var PolicyNames: js.UndefOr[PolicyNames]
  }

  /**
    * Contains the parameters for ConfigureHealthCheck.
    */
  @js.native
  @Factory
  trait ConfigureHealthCheckInput extends js.Object {
    var HealthCheck: HealthCheck
    var LoadBalancerName: AccessPointName
  }

  /**
    * Contains the output of ConfigureHealthCheck.
    */
  @js.native
  @Factory
  trait ConfigureHealthCheckOutput extends js.Object {
    var HealthCheck: js.UndefOr[HealthCheck]
  }

  /**
    * Information about the <code>ConnectionDraining</code> attribute.
    */
  @js.native
  @Factory
  trait ConnectionDraining extends js.Object {
    var Enabled: ConnectionDrainingEnabled
    var Timeout: js.UndefOr[ConnectionDrainingTimeout]
  }

  /**
    * Information about the <code>ConnectionSettings</code> attribute.
    */
  @js.native
  @Factory
  trait ConnectionSettings extends js.Object {
    var IdleTimeout: IdleTimeout
  }

  /**
    * Contains the parameters for CreateLoadBalancer.
    */
  @js.native
  @Factory
  trait CreateAccessPointInput extends js.Object {
    var Listeners: Listeners
    var LoadBalancerName: AccessPointName
    var AvailabilityZones: js.UndefOr[AvailabilityZones]
    var Scheme: js.UndefOr[LoadBalancerScheme]
    var SecurityGroups: js.UndefOr[SecurityGroups]
    var Subnets: js.UndefOr[Subnets]
    var Tags: js.UndefOr[TagList]
  }

  /**
    * Contains the output for CreateLoadBalancer.
    */
  @js.native
  @Factory
  trait CreateAccessPointOutput extends js.Object {
    var DNSName: js.UndefOr[DNSName]
  }

  /**
    * Contains the parameters for CreateAppCookieStickinessPolicy.
    */
  @js.native
  @Factory
  trait CreateAppCookieStickinessPolicyInput extends js.Object {
    var CookieName: CookieName
    var LoadBalancerName: AccessPointName
    var PolicyName: PolicyName
  }

  /**
    * Contains the output for CreateAppCookieStickinessPolicy.
    */
  @js.native
  @Factory
  trait CreateAppCookieStickinessPolicyOutput extends js.Object {}

  /**
    * Contains the parameters for CreateLBCookieStickinessPolicy.
    */
  @js.native
  @Factory
  trait CreateLBCookieStickinessPolicyInput extends js.Object {
    var LoadBalancerName: AccessPointName
    var PolicyName: PolicyName
    var CookieExpirationPeriod: js.UndefOr[CookieExpirationPeriod]
  }

  /**
    * Contains the output for CreateLBCookieStickinessPolicy.
    */
  @js.native
  @Factory
  trait CreateLBCookieStickinessPolicyOutput extends js.Object {}

  /**
    * Contains the parameters for CreateLoadBalancerListeners.
    */
  @js.native
  @Factory
  trait CreateLoadBalancerListenerInput extends js.Object {
    var Listeners: Listeners
    var LoadBalancerName: AccessPointName
  }

  /**
    * Contains the parameters for CreateLoadBalancerListener.
    */
  @js.native
  @Factory
  trait CreateLoadBalancerListenerOutput extends js.Object {}

  /**
    * Contains the parameters for CreateLoadBalancerPolicy.
    */
  @js.native
  @Factory
  trait CreateLoadBalancerPolicyInput extends js.Object {
    var LoadBalancerName: AccessPointName
    var PolicyName: PolicyName
    var PolicyTypeName: PolicyTypeName
    var PolicyAttributes: js.UndefOr[PolicyAttributes]
  }

  /**
    * Contains the output of CreateLoadBalancerPolicy.
    */
  @js.native
  @Factory
  trait CreateLoadBalancerPolicyOutput extends js.Object {}

  /**
    * Information about the <code>CrossZoneLoadBalancing</code> attribute.
    */
  @js.native
  @Factory
  trait CrossZoneLoadBalancing extends js.Object {
    var Enabled: CrossZoneLoadBalancingEnabled
  }

  /**
    * Contains the parameters for DeleteLoadBalancer.
    */
  @js.native
  @Factory
  trait DeleteAccessPointInput extends js.Object {
    var LoadBalancerName: AccessPointName
  }

  /**
    * Contains the output of DeleteLoadBalancer.
    */
  @js.native
  @Factory
  trait DeleteAccessPointOutput extends js.Object {}

  /**
    * Contains the parameters for DeleteLoadBalancerListeners.
    */
  @js.native
  @Factory
  trait DeleteLoadBalancerListenerInput extends js.Object {
    var LoadBalancerName: AccessPointName
    var LoadBalancerPorts: Ports
  }

  /**
    * Contains the output of DeleteLoadBalancerListeners.
    */
  @js.native
  @Factory
  trait DeleteLoadBalancerListenerOutput extends js.Object {}

  /**
    * Contains the parameters for DeleteLoadBalancerPolicy.
    */
  @js.native
  @Factory
  trait DeleteLoadBalancerPolicyInput extends js.Object {
    var LoadBalancerName: AccessPointName
    var PolicyName: PolicyName
  }

  /**
    * Contains the output of DeleteLoadBalancerPolicy.
    */
  @js.native
  @Factory
  trait DeleteLoadBalancerPolicyOutput extends js.Object {}

  /**
    * Contains the parameters for DeregisterInstancesFromLoadBalancer.
    */
  @js.native
  @Factory
  trait DeregisterEndPointsInput extends js.Object {
    var Instances: Instances
    var LoadBalancerName: AccessPointName
  }

  /**
    * Contains the output of DeregisterInstancesFromLoadBalancer.
    */
  @js.native
  @Factory
  trait DeregisterEndPointsOutput extends js.Object {
    var Instances: js.UndefOr[Instances]
  }

  /**
    * Contains the parameters for DescribeLoadBalancers.
    */
  @js.native
  @Factory
  trait DescribeAccessPointsInput extends js.Object {
    var LoadBalancerNames: js.UndefOr[LoadBalancerNames]
    var Marker: js.UndefOr[Marker]
    var PageSize: js.UndefOr[PageSize]
  }

  /**
    * Contains the parameters for DescribeLoadBalancers.
    */
  @js.native
  @Factory
  trait DescribeAccessPointsOutput extends js.Object {
    var LoadBalancerDescriptions: js.UndefOr[LoadBalancerDescriptions]
    var NextMarker: js.UndefOr[Marker]
  }

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

  /**
    * Contains the parameters for DescribeInstanceHealth.
    */
  @js.native
  @Factory
  trait DescribeEndPointStateInput extends js.Object {
    var LoadBalancerName: AccessPointName
    var Instances: js.UndefOr[Instances]
  }

  /**
    * Contains the output for DescribeInstanceHealth.
    */
  @js.native
  @Factory
  trait DescribeEndPointStateOutput extends js.Object {
    var InstanceStates: js.UndefOr[InstanceStates]
  }

  /**
    * Contains the parameters for DescribeLoadBalancerAttributes.
    */
  @js.native
  @Factory
  trait DescribeLoadBalancerAttributesInput extends js.Object {
    var LoadBalancerName: AccessPointName
  }

  /**
    * Contains the output of DescribeLoadBalancerAttributes.
    */
  @js.native
  @Factory
  trait DescribeLoadBalancerAttributesOutput extends js.Object {
    var LoadBalancerAttributes: js.UndefOr[LoadBalancerAttributes]
  }

  /**
    * Contains the parameters for DescribeLoadBalancerPolicies.
    */
  @js.native
  @Factory
  trait DescribeLoadBalancerPoliciesInput extends js.Object {
    var LoadBalancerName: js.UndefOr[AccessPointName]
    var PolicyNames: js.UndefOr[PolicyNames]
  }

  /**
    * Contains the output of DescribeLoadBalancerPolicies.
    */
  @js.native
  @Factory
  trait DescribeLoadBalancerPoliciesOutput extends js.Object {
    var PolicyDescriptions: js.UndefOr[PolicyDescriptions]
  }

  /**
    * Contains the parameters for DescribeLoadBalancerPolicyTypes.
    */
  @js.native
  @Factory
  trait DescribeLoadBalancerPolicyTypesInput extends js.Object {
    var PolicyTypeNames: js.UndefOr[PolicyTypeNames]
  }

  /**
    * Contains the output of DescribeLoadBalancerPolicyTypes.
    */
  @js.native
  @Factory
  trait DescribeLoadBalancerPolicyTypesOutput extends js.Object {
    var PolicyTypeDescriptions: js.UndefOr[PolicyTypeDescriptions]
  }

  /**
    * Contains the parameters for DescribeTags.
    */
  @js.native
  @Factory
  trait DescribeTagsInput extends js.Object {
    var LoadBalancerNames: LoadBalancerNamesMax20
  }

  /**
    * Contains the output for DescribeTags.
    */
  @js.native
  @Factory
  trait DescribeTagsOutput extends js.Object {
    var TagDescriptions: js.UndefOr[TagDescriptions]
  }

  /**
    * Contains the parameters for DetachLoadBalancerFromSubnets.
    */
  @js.native
  @Factory
  trait DetachLoadBalancerFromSubnetsInput extends js.Object {
    var LoadBalancerName: AccessPointName
    var Subnets: Subnets
  }

  /**
    * Contains the output of DetachLoadBalancerFromSubnets.
    */
  @js.native
  @Factory
  trait DetachLoadBalancerFromSubnetsOutput extends js.Object {
    var Subnets: js.UndefOr[Subnets]
  }

  /**
    * Information about a health check.
    */
  @js.native
  @Factory
  trait HealthCheck extends js.Object {
    var HealthyThreshold: HealthyThreshold
    var Interval: HealthCheckInterval
    var Target: HealthCheckTarget
    var Timeout: HealthCheckTimeout
    var UnhealthyThreshold: UnhealthyThreshold
  }

  /**
    * The ID of an EC2 instance.
    */
  @js.native
  @Factory
  trait Instance extends js.Object {
    var InstanceId: js.UndefOr[InstanceId]
  }

  /**
    * Information about the state of an EC2 instance.
    */
  @js.native
  @Factory
  trait InstanceState extends js.Object {
    var Description: js.UndefOr[Description]
    var InstanceId: js.UndefOr[InstanceId]
    var ReasonCode: js.UndefOr[ReasonCode]
    var State: js.UndefOr[State]
  }

  /**
    * Information about a policy for duration-based session stickiness.
    */
  @js.native
  @Factory
  trait LBCookieStickinessPolicy extends js.Object {
    var CookieExpirationPeriod: js.UndefOr[CookieExpirationPeriod]
    var PolicyName: js.UndefOr[PolicyName]
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
    *  For information about the protocols and the ports supported by Elastic Load Balancing, see [[http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-listener-config.html|Listeners for Your Classic Load Balancer]] in the <i>Classic Load Balancers Guide</i>.
    */
  @js.native
  @Factory
  trait Listener extends js.Object {
    var InstancePort: InstancePort
    var LoadBalancerPort: AccessPointPort
    var Protocol: Protocol
    var InstanceProtocol: js.UndefOr[Protocol]
    var SSLCertificateId: js.UndefOr[SSLCertificateId]
  }

  /**
    * The policies enabled for a listener.
    */
  @js.native
  @Factory
  trait ListenerDescription extends js.Object {
    var Listener: js.UndefOr[Listener]
    var PolicyNames: js.UndefOr[PolicyNames]
  }

  /**
    * The attributes for a load balancer.
    */
  @js.native
  @Factory
  trait LoadBalancerAttributes extends js.Object {
    var AccessLog: js.UndefOr[AccessLog]
    var AdditionalAttributes: js.UndefOr[AdditionalAttributes]
    var ConnectionDraining: js.UndefOr[ConnectionDraining]
    var ConnectionSettings: js.UndefOr[ConnectionSettings]
    var CrossZoneLoadBalancing: js.UndefOr[CrossZoneLoadBalancing]
  }

  /**
    * Information about a load balancer.
    */
  @js.native
  @Factory
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

  /**
    * Contains the parameters for ModifyLoadBalancerAttributes.
    */
  @js.native
  @Factory
  trait ModifyLoadBalancerAttributesInput extends js.Object {
    var LoadBalancerAttributes: LoadBalancerAttributes
    var LoadBalancerName: AccessPointName
  }

  /**
    * Contains the output of ModifyLoadBalancerAttributes.
    */
  @js.native
  @Factory
  trait ModifyLoadBalancerAttributesOutput extends js.Object {
    var LoadBalancerAttributes: js.UndefOr[LoadBalancerAttributes]
    var LoadBalancerName: js.UndefOr[AccessPointName]
  }

  /**
    * The policies for a load balancer.
    */
  @js.native
  @Factory
  trait Policies extends js.Object {
    var AppCookieStickinessPolicies: js.UndefOr[AppCookieStickinessPolicies]
    var LBCookieStickinessPolicies: js.UndefOr[LBCookieStickinessPolicies]
    var OtherPolicies: js.UndefOr[PolicyNames]
  }

  /**
    * Information about a policy attribute.
    */
  @js.native
  @Factory
  trait PolicyAttribute extends js.Object {
    var AttributeName: js.UndefOr[AttributeName]
    var AttributeValue: js.UndefOr[AttributeValue]
  }

  /**
    * Information about a policy attribute.
    */
  @js.native
  @Factory
  trait PolicyAttributeDescription extends js.Object {
    var AttributeName: js.UndefOr[AttributeName]
    var AttributeValue: js.UndefOr[AttributeValue]
  }

  /**
    * Information about a policy attribute type.
    */
  @js.native
  @Factory
  trait PolicyAttributeTypeDescription extends js.Object {
    var AttributeName: js.UndefOr[AttributeName]
    var AttributeType: js.UndefOr[AttributeType]
    var Cardinality: js.UndefOr[Cardinality]
    var DefaultValue: js.UndefOr[DefaultValue]
    var Description: js.UndefOr[Description]
  }

  /**
    * Information about a policy.
    */
  @js.native
  @Factory
  trait PolicyDescription extends js.Object {
    var PolicyAttributeDescriptions: js.UndefOr[PolicyAttributeDescriptions]
    var PolicyName: js.UndefOr[PolicyName]
    var PolicyTypeName: js.UndefOr[PolicyTypeName]
  }

  /**
    * Information about a policy type.
    */
  @js.native
  @Factory
  trait PolicyTypeDescription extends js.Object {
    var Description: js.UndefOr[Description]
    var PolicyAttributeTypeDescriptions: js.UndefOr[PolicyAttributeTypeDescriptions]
    var PolicyTypeName: js.UndefOr[PolicyTypeName]
  }

  /**
    * Contains the parameters for RegisterInstancesWithLoadBalancer.
    */
  @js.native
  @Factory
  trait RegisterEndPointsInput extends js.Object {
    var Instances: Instances
    var LoadBalancerName: AccessPointName
  }

  /**
    * Contains the output of RegisterInstancesWithLoadBalancer.
    */
  @js.native
  @Factory
  trait RegisterEndPointsOutput extends js.Object {
    var Instances: js.UndefOr[Instances]
  }

  /**
    * Contains the parameters for DisableAvailabilityZonesForLoadBalancer.
    */
  @js.native
  @Factory
  trait RemoveAvailabilityZonesInput extends js.Object {
    var AvailabilityZones: AvailabilityZones
    var LoadBalancerName: AccessPointName
  }

  /**
    * Contains the output for DisableAvailabilityZonesForLoadBalancer.
    */
  @js.native
  @Factory
  trait RemoveAvailabilityZonesOutput extends js.Object {
    var AvailabilityZones: js.UndefOr[AvailabilityZones]
  }

  /**
    * Contains the parameters for RemoveTags.
    */
  @js.native
  @Factory
  trait RemoveTagsInput extends js.Object {
    var LoadBalancerNames: LoadBalancerNames
    var Tags: TagKeyList
  }

  /**
    * Contains the output of RemoveTags.
    */
  @js.native
  @Factory
  trait RemoveTagsOutput extends js.Object {}

  /**
    * Contains the parameters for SetLoadBalancerListenerSSLCertificate.
    */
  @js.native
  @Factory
  trait SetLoadBalancerListenerSSLCertificateInput extends js.Object {
    var LoadBalancerName: AccessPointName
    var LoadBalancerPort: AccessPointPort
    var SSLCertificateId: SSLCertificateId
  }

  /**
    * Contains the output of SetLoadBalancerListenerSSLCertificate.
    */
  @js.native
  @Factory
  trait SetLoadBalancerListenerSSLCertificateOutput extends js.Object {}

  /**
    * Contains the parameters for SetLoadBalancerPoliciesForBackendServer.
    */
  @js.native
  @Factory
  trait SetLoadBalancerPoliciesForBackendServerInput extends js.Object {
    var InstancePort: EndPointPort
    var LoadBalancerName: AccessPointName
    var PolicyNames: PolicyNames
  }

  /**
    * Contains the output of SetLoadBalancerPoliciesForBackendServer.
    */
  @js.native
  @Factory
  trait SetLoadBalancerPoliciesForBackendServerOutput extends js.Object {}

  /**
    * Contains the parameters for SetLoadBalancePoliciesOfListener.
    */
  @js.native
  @Factory
  trait SetLoadBalancerPoliciesOfListenerInput extends js.Object {
    var LoadBalancerName: AccessPointName
    var LoadBalancerPort: AccessPointPort
    var PolicyNames: PolicyNames
  }

  /**
    * Contains the output of SetLoadBalancePoliciesOfListener.
    */
  @js.native
  @Factory
  trait SetLoadBalancerPoliciesOfListenerOutput extends js.Object {}

  /**
    * Information about a source security group.
    */
  @js.native
  @Factory
  trait SourceSecurityGroup extends js.Object {
    var GroupName: js.UndefOr[SecurityGroupName]
    var OwnerAlias: js.UndefOr[SecurityGroupOwnerAlias]
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
    * The tags associated with a load balancer.
    */
  @js.native
  @Factory
  trait TagDescription extends js.Object {
    var LoadBalancerName: js.UndefOr[AccessPointName]
    var Tags: js.UndefOr[TagList]
  }

  /**
    * The key of a tag.
    */
  @js.native
  @Factory
  trait TagKeyOnly extends js.Object {
    var Key: js.UndefOr[TagKey]
  }
}
