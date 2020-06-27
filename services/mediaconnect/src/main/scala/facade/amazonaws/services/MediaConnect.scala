package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object mediaconnect {
  type MaxResults                      = Int
  type __integer                       = Int
  type __listOfAddOutputRequest        = js.Array[AddOutputRequest]
  type __listOfEntitlement             = js.Array[Entitlement]
  type __listOfGrantEntitlementRequest = js.Array[GrantEntitlementRequest]
  type __listOfListedEntitlement       = js.Array[ListedEntitlement]
  type __listOfListedFlow              = js.Array[ListedFlow]
  type __listOfOutput                  = js.Array[Output]
  type __listOf__string                = js.Array[__string]
  type __mapOf__string                 = js.Dictionary[__string]
  type __string                        = String

  implicit final class MediaConnectOps(private val service: MediaConnect) extends AnyVal {

    @inline def addFlowOutputsFuture(params: AddFlowOutputsRequest): Future[AddFlowOutputsResponse] =
      service.addFlowOutputs(params).promise().toFuture
    @inline def createFlowFuture(params: CreateFlowRequest): Future[CreateFlowResponse] =
      service.createFlow(params).promise().toFuture
    @inline def deleteFlowFuture(params: DeleteFlowRequest): Future[DeleteFlowResponse] =
      service.deleteFlow(params).promise().toFuture
    @inline def describeFlowFuture(params: DescribeFlowRequest): Future[DescribeFlowResponse] =
      service.describeFlow(params).promise().toFuture
    @inline def grantFlowEntitlementsFuture(
        params: GrantFlowEntitlementsRequest
    ): Future[GrantFlowEntitlementsResponse] = service.grantFlowEntitlements(params).promise().toFuture
    @inline def listEntitlementsFuture(params: ListEntitlementsRequest): Future[ListEntitlementsResponse] =
      service.listEntitlements(params).promise().toFuture
    @inline def listFlowsFuture(params: ListFlowsRequest): Future[ListFlowsResponse] =
      service.listFlows(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise().toFuture
    @inline def removeFlowOutputFuture(params: RemoveFlowOutputRequest): Future[RemoveFlowOutputResponse] =
      service.removeFlowOutput(params).promise().toFuture
    @inline def revokeFlowEntitlementFuture(
        params: RevokeFlowEntitlementRequest
    ): Future[RevokeFlowEntitlementResponse] = service.revokeFlowEntitlement(params).promise().toFuture
    @inline def startFlowFuture(params: StartFlowRequest): Future[StartFlowResponse] =
      service.startFlow(params).promise().toFuture
    @inline def stopFlowFuture(params: StopFlowRequest): Future[StopFlowResponse] =
      service.stopFlow(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[js.Object] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[js.Object] =
      service.untagResource(params).promise().toFuture
    @inline def updateFlowEntitlementFuture(
        params: UpdateFlowEntitlementRequest
    ): Future[UpdateFlowEntitlementResponse] = service.updateFlowEntitlement(params).promise().toFuture
    @inline def updateFlowOutputFuture(params: UpdateFlowOutputRequest): Future[UpdateFlowOutputResponse] =
      service.updateFlowOutput(params).promise().toFuture
    @inline def updateFlowSourceFuture(params: UpdateFlowSourceRequest): Future[UpdateFlowSourceResponse] =
      service.updateFlowSource(params).promise().toFuture
  }
}

package mediaconnect {
  @js.native
  @JSImport("aws-sdk", "MediaConnect")
  class MediaConnect() extends js.Object {
    def this(config: AWSConfig) = this()

    def addFlowOutputs(params: AddFlowOutputsRequest): Request[AddFlowOutputsResponse]                      = js.native
    def createFlow(params: CreateFlowRequest): Request[CreateFlowResponse]                                  = js.native
    def deleteFlow(params: DeleteFlowRequest): Request[DeleteFlowResponse]                                  = js.native
    def describeFlow(params: DescribeFlowRequest): Request[DescribeFlowResponse]                            = js.native
    def grantFlowEntitlements(params: GrantFlowEntitlementsRequest): Request[GrantFlowEntitlementsResponse] = js.native
    def listEntitlements(params: ListEntitlementsRequest): Request[ListEntitlementsResponse]                = js.native
    def listFlows(params: ListFlowsRequest): Request[ListFlowsResponse]                                     = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse]       = js.native
    def removeFlowOutput(params: RemoveFlowOutputRequest): Request[RemoveFlowOutputResponse]                = js.native
    def revokeFlowEntitlement(params: RevokeFlowEntitlementRequest): Request[RevokeFlowEntitlementResponse] = js.native
    def startFlow(params: StartFlowRequest): Request[StartFlowResponse]                                     = js.native
    def stopFlow(params: StopFlowRequest): Request[StopFlowResponse]                                        = js.native
    def tagResource(params: TagResourceRequest): Request[js.Object]                                         = js.native
    def untagResource(params: UntagResourceRequest): Request[js.Object]                                     = js.native
    def updateFlowEntitlement(params: UpdateFlowEntitlementRequest): Request[UpdateFlowEntitlementResponse] = js.native
    def updateFlowOutput(params: UpdateFlowOutputRequest): Request[UpdateFlowOutputResponse]                = js.native
    def updateFlowSource(params: UpdateFlowSourceRequest): Request[UpdateFlowSourceResponse]                = js.native
  }

  /**
    * A request to add outputs to the specified flow.
    */
  @js.native
  @Factory
  trait AddFlowOutputsRequest extends js.Object {
    var FlowArn: __string
    var Outputs: __listOfAddOutputRequest
  }

  @js.native
  @Factory
  trait AddFlowOutputsResponse extends js.Object {
    var FlowArn: js.UndefOr[__string]
    var Outputs: js.UndefOr[__listOfOutput]
  }

  /**
    * The output that you want to add to this flow.
    */
  @js.native
  @Factory
  trait AddOutputRequest extends js.Object {
    var Protocol: Protocol
    var CidrAllowList: js.UndefOr[__listOf__string]
    var Description: js.UndefOr[__string]
    var Destination: js.UndefOr[__string]
    var Encryption: js.UndefOr[Encryption]
    var MaxLatency: js.UndefOr[__integer]
    var Name: js.UndefOr[__string]
    var Port: js.UndefOr[__integer]
    var RemoteId: js.UndefOr[__string]
    var SmoothingLatency: js.UndefOr[__integer]
    var StreamId: js.UndefOr[__string]
  }

  @js.native
  sealed trait Algorithm extends js.Any
  object Algorithm extends js.Object {
    val aes128 = "aes128".asInstanceOf[Algorithm]
    val aes192 = "aes192".asInstanceOf[Algorithm]
    val aes256 = "aes256".asInstanceOf[Algorithm]

    val values = js.Object.freeze(js.Array(aes128, aes192, aes256))
  }

  /**
    * Creates a new flow. The request must include one source. The request optionally can include outputs (up to 20) and entitlements (up to 50).
    */
  @js.native
  @Factory
  trait CreateFlowRequest extends js.Object {
    var Name: __string
    var Source: SetSourceRequest
    var AvailabilityZone: js.UndefOr[__string]
    var Entitlements: js.UndefOr[__listOfGrantEntitlementRequest]
    var Outputs: js.UndefOr[__listOfAddOutputRequest]
  }

  @js.native
  @Factory
  trait CreateFlowResponse extends js.Object {
    var Flow: js.UndefOr[Flow]
  }

  @js.native
  @Factory
  trait DeleteFlowRequest extends js.Object {
    var FlowArn: __string
  }

  @js.native
  @Factory
  trait DeleteFlowResponse extends js.Object {
    var FlowArn: js.UndefOr[__string]
    var Status: js.UndefOr[Status]
  }

  @js.native
  @Factory
  trait DescribeFlowRequest extends js.Object {
    var FlowArn: __string
  }

  @js.native
  @Factory
  trait DescribeFlowResponse extends js.Object {
    var Flow: js.UndefOr[Flow]
    var Messages: js.UndefOr[Messages]
  }

  /**
    * Information about the encryption of the flow.
    */
  @js.native
  @Factory
  trait Encryption extends js.Object {
    var Algorithm: Algorithm
    var RoleArn: __string
    var ConstantInitializationVector: js.UndefOr[__string]
    var DeviceId: js.UndefOr[__string]
    var KeyType: js.UndefOr[KeyType]
    var Region: js.UndefOr[__string]
    var ResourceId: js.UndefOr[__string]
    var SecretArn: js.UndefOr[__string]
    var Url: js.UndefOr[__string]
  }

  /**
    * The settings for a flow entitlement.
    */
  @js.native
  @Factory
  trait Entitlement extends js.Object {
    var EntitlementArn: __string
    var Name: __string
    var Subscribers: __listOf__string
    var DataTransferSubscriberFeePercent: js.UndefOr[__integer]
    var Description: js.UndefOr[__string]
    var Encryption: js.UndefOr[Encryption]
  }

  /**
    * The settings for a flow, including its source, outputs, and entitlements.
    */
  @js.native
  @Factory
  trait Flow extends js.Object {
    var AvailabilityZone: __string
    var Entitlements: __listOfEntitlement
    var FlowArn: __string
    var Name: __string
    var Outputs: __listOfOutput
    var Source: Source
    var Status: Status
    var Description: js.UndefOr[__string]
    var EgressIp: js.UndefOr[__string]
  }

  /**
    * The entitlements that you want to grant on a flow.
    */
  @js.native
  @Factory
  trait GrantEntitlementRequest extends js.Object {
    var Subscribers: __listOf__string
    var DataTransferSubscriberFeePercent: js.UndefOr[__integer]
    var Description: js.UndefOr[__string]
    var Encryption: js.UndefOr[Encryption]
    var Name: js.UndefOr[__string]
  }

  /**
    * A request to grant entitlements on a flow.
    */
  @js.native
  @Factory
  trait GrantFlowEntitlementsRequest extends js.Object {
    var Entitlements: __listOfGrantEntitlementRequest
    var FlowArn: __string
  }

  @js.native
  @Factory
  trait GrantFlowEntitlementsResponse extends js.Object {
    var Entitlements: js.UndefOr[__listOfEntitlement]
    var FlowArn: js.UndefOr[__string]
  }

  @js.native
  sealed trait KeyType extends js.Any
  object KeyType extends js.Object {
    val speke        = "speke".asInstanceOf[KeyType]
    val `static-key` = "static-key".asInstanceOf[KeyType]

    val values = js.Object.freeze(js.Array(speke, `static-key`))
  }

  @js.native
  @Factory
  trait ListEntitlementsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListEntitlementsResponse extends js.Object {
    var Entitlements: js.UndefOr[__listOfListedEntitlement]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListFlowsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListFlowsResponse extends js.Object {
    var Flows: js.UndefOr[__listOfListedFlow]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: __string
  }

  @js.native
  @Factory
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[__mapOf__string]
  }

  /**
    * An entitlement that has been granted to you from other AWS accounts.
    */
  @js.native
  @Factory
  trait ListedEntitlement extends js.Object {
    var EntitlementArn: __string
    var EntitlementName: __string
    var DataTransferSubscriberFeePercent: js.UndefOr[__integer]
  }

  /**
    * Provides a summary of a flow, including its ARN, Availability Zone, and source type.
    */
  @js.native
  @Factory
  trait ListedFlow extends js.Object {
    var AvailabilityZone: __string
    var Description: __string
    var FlowArn: __string
    var Name: __string
    var SourceType: SourceType
    var Status: Status
  }

  /**
    * Messages that provide the state of the flow.
    */
  @js.native
  @Factory
  trait Messages extends js.Object {
    var Errors: __listOf__string
  }

  /**
    * The settings for an output.
    */
  @js.native
  @Factory
  trait Output extends js.Object {
    var Name: __string
    var OutputArn: __string
    var DataTransferSubscriberFeePercent: js.UndefOr[__integer]
    var Description: js.UndefOr[__string]
    var Destination: js.UndefOr[__string]
    var Encryption: js.UndefOr[Encryption]
    var EntitlementArn: js.UndefOr[__string]
    var MediaLiveInputArn: js.UndefOr[__string]
    var Port: js.UndefOr[__integer]
    var Transport: js.UndefOr[Transport]
  }

  @js.native
  sealed trait Protocol extends js.Any
  object Protocol extends js.Object {
    val `zixi-push` = "zixi-push".asInstanceOf[Protocol]
    val `rtp-fec`   = "rtp-fec".asInstanceOf[Protocol]
    val rtp         = "rtp".asInstanceOf[Protocol]
    val `zixi-pull` = "zixi-pull".asInstanceOf[Protocol]
    val rist        = "rist".asInstanceOf[Protocol]

    val values = js.Object.freeze(js.Array(`zixi-push`, `rtp-fec`, rtp, `zixi-pull`, rist))
  }

  @js.native
  @Factory
  trait RemoveFlowOutputRequest extends js.Object {
    var FlowArn: __string
    var OutputArn: __string
  }

  @js.native
  @Factory
  trait RemoveFlowOutputResponse extends js.Object {
    var FlowArn: js.UndefOr[__string]
    var OutputArn: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait RevokeFlowEntitlementRequest extends js.Object {
    var EntitlementArn: __string
    var FlowArn: __string
  }

  @js.native
  @Factory
  trait RevokeFlowEntitlementResponse extends js.Object {
    var EntitlementArn: js.UndefOr[__string]
    var FlowArn: js.UndefOr[__string]
  }

  /**
    * The settings for the source of the flow.
    */
  @js.native
  @Factory
  trait SetSourceRequest extends js.Object {
    var Decryption: js.UndefOr[Encryption]
    var Description: js.UndefOr[__string]
    var EntitlementArn: js.UndefOr[__string]
    var IngestPort: js.UndefOr[__integer]
    var MaxBitrate: js.UndefOr[__integer]
    var MaxLatency: js.UndefOr[__integer]
    var Name: js.UndefOr[__string]
    var Protocol: js.UndefOr[Protocol]
    var StreamId: js.UndefOr[__string]
    var WhitelistCidr: js.UndefOr[__string]
  }

  /**
    * The settings for the source of the flow.
    */
  @js.native
  @Factory
  trait Source extends js.Object {
    var Name: __string
    var SourceArn: __string
    var DataTransferSubscriberFeePercent: js.UndefOr[__integer]
    var Decryption: js.UndefOr[Encryption]
    var Description: js.UndefOr[__string]
    var EntitlementArn: js.UndefOr[__string]
    var IngestIp: js.UndefOr[__string]
    var IngestPort: js.UndefOr[__integer]
    var Transport: js.UndefOr[Transport]
    var WhitelistCidr: js.UndefOr[__string]
  }

  @js.native
  sealed trait SourceType extends js.Any
  object SourceType extends js.Object {
    val OWNED    = "OWNED".asInstanceOf[SourceType]
    val ENTITLED = "ENTITLED".asInstanceOf[SourceType]

    val values = js.Object.freeze(js.Array(OWNED, ENTITLED))
  }

  @js.native
  @Factory
  trait StartFlowRequest extends js.Object {
    var FlowArn: __string
  }

  @js.native
  @Factory
  trait StartFlowResponse extends js.Object {
    var FlowArn: js.UndefOr[__string]
    var Status: js.UndefOr[Status]
  }

  @js.native
  sealed trait Status extends js.Any
  object Status extends js.Object {
    val STANDBY  = "STANDBY".asInstanceOf[Status]
    val ACTIVE   = "ACTIVE".asInstanceOf[Status]
    val UPDATING = "UPDATING".asInstanceOf[Status]
    val DELETING = "DELETING".asInstanceOf[Status]
    val STARTING = "STARTING".asInstanceOf[Status]
    val STOPPING = "STOPPING".asInstanceOf[Status]
    val ERROR    = "ERROR".asInstanceOf[Status]

    val values = js.Object.freeze(js.Array(STANDBY, ACTIVE, UPDATING, DELETING, STARTING, STOPPING, ERROR))
  }

  @js.native
  @Factory
  trait StopFlowRequest extends js.Object {
    var FlowArn: __string
  }

  @js.native
  @Factory
  trait StopFlowResponse extends js.Object {
    var FlowArn: js.UndefOr[__string]
    var Status: js.UndefOr[Status]
  }

  /**
    * The tags to add to the resource. A tag is an array of key-value pairs. Tag keys can have a maximum character length of 128 characters, and tag values can have a maximum length of 256 characters.
    */
  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var ResourceArn: __string
    var Tags: __mapOf__string
  }

  /**
    * Attributes related to the transport stream that are used in a source or output.
    */
  @js.native
  @Factory
  trait Transport extends js.Object {
    var Protocol: Protocol
    var CidrAllowList: js.UndefOr[__listOf__string]
    var MaxBitrate: js.UndefOr[__integer]
    var MaxLatency: js.UndefOr[__integer]
    var RemoteId: js.UndefOr[__string]
    var SmoothingLatency: js.UndefOr[__integer]
    var StreamId: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: __string
    var TagKeys: __listOf__string
  }

  /**
    * Information about the encryption of the flow.
    */
  @js.native
  @Factory
  trait UpdateEncryption extends js.Object {
    var Algorithm: js.UndefOr[Algorithm]
    var ConstantInitializationVector: js.UndefOr[__string]
    var DeviceId: js.UndefOr[__string]
    var KeyType: js.UndefOr[KeyType]
    var Region: js.UndefOr[__string]
    var ResourceId: js.UndefOr[__string]
    var RoleArn: js.UndefOr[__string]
    var SecretArn: js.UndefOr[__string]
    var Url: js.UndefOr[__string]
  }

  /**
    * The entitlement fields that you want to update.
    */
  @js.native
  @Factory
  trait UpdateFlowEntitlementRequest extends js.Object {
    var EntitlementArn: __string
    var FlowArn: __string
    var Description: js.UndefOr[__string]
    var Encryption: js.UndefOr[UpdateEncryption]
    var Subscribers: js.UndefOr[__listOf__string]
  }

  @js.native
  @Factory
  trait UpdateFlowEntitlementResponse extends js.Object {
    var Entitlement: js.UndefOr[Entitlement]
    var FlowArn: js.UndefOr[__string]
  }

  /**
    * The fields that you want to update in the output.
    */
  @js.native
  @Factory
  trait UpdateFlowOutputRequest extends js.Object {
    var FlowArn: __string
    var OutputArn: __string
    var CidrAllowList: js.UndefOr[__listOf__string]
    var Description: js.UndefOr[__string]
    var Destination: js.UndefOr[__string]
    var Encryption: js.UndefOr[UpdateEncryption]
    var MaxLatency: js.UndefOr[__integer]
    var Port: js.UndefOr[__integer]
    var Protocol: js.UndefOr[Protocol]
    var RemoteId: js.UndefOr[__string]
    var SmoothingLatency: js.UndefOr[__integer]
    var StreamId: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait UpdateFlowOutputResponse extends js.Object {
    var FlowArn: js.UndefOr[__string]
    var Output: js.UndefOr[Output]
  }

  /**
    * A request to update the source of a flow.
    */
  @js.native
  @Factory
  trait UpdateFlowSourceRequest extends js.Object {
    var FlowArn: __string
    var SourceArn: __string
    var Decryption: js.UndefOr[UpdateEncryption]
    var Description: js.UndefOr[__string]
    var EntitlementArn: js.UndefOr[__string]
    var IngestPort: js.UndefOr[__integer]
    var MaxBitrate: js.UndefOr[__integer]
    var MaxLatency: js.UndefOr[__integer]
    var Protocol: js.UndefOr[Protocol]
    var StreamId: js.UndefOr[__string]
    var WhitelistCidr: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait UpdateFlowSourceResponse extends js.Object {
    var FlowArn: js.UndefOr[__string]
    var Source: js.UndefOr[Source]
  }
}
