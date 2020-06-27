package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object iotsecuretunneling {
  type AmazonResourceName = String
  type ClientAccessToken  = String
  type DateType           = js.Date
  type DeleteFlag         = Boolean
  type Description        = String
  type MaxResults         = Int
  type NextToken          = String
  type Service            = String
  type ServiceList        = js.Array[Service]
  type TagKey             = String
  type TagKeyList         = js.Array[TagKey]
  type TagList            = js.Array[Tag]
  type TagValue           = String
  type ThingName          = String
  type TimeoutInMin       = Int
  type TunnelArn          = String
  type TunnelId           = String
  type TunnelSummaryList  = js.Array[TunnelSummary]

  implicit final class IoTSecureTunnelingOps(private val service: IoTSecureTunneling) extends AnyVal {

    @inline def closeTunnelFuture(params: CloseTunnelRequest): Future[CloseTunnelResponse] =
      service.closeTunnel(params).promise().toFuture
    @inline def describeTunnelFuture(params: DescribeTunnelRequest): Future[DescribeTunnelResponse] =
      service.describeTunnel(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise().toFuture
    @inline def listTunnelsFuture(params: ListTunnelsRequest): Future[ListTunnelsResponse] =
      service.listTunnels(params).promise().toFuture
    @inline def openTunnelFuture(params: OpenTunnelRequest): Future[OpenTunnelResponse] =
      service.openTunnel(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise().toFuture
  }
}

package iotsecuretunneling {
  @js.native
  @JSImport("aws-sdk", "IoTSecureTunneling")
  class IoTSecureTunneling() extends js.Object {
    def this(config: AWSConfig) = this()

    def closeTunnel(params: CloseTunnelRequest): Request[CloseTunnelResponse]                         = js.native
    def describeTunnel(params: DescribeTunnelRequest): Request[DescribeTunnelResponse]                = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def listTunnels(params: ListTunnelsRequest): Request[ListTunnelsResponse]                         = js.native
    def openTunnel(params: OpenTunnelRequest): Request[OpenTunnelResponse]                            = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse]                         = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse]                   = js.native
  }

  @js.native
  @Factory
  trait CloseTunnelRequest extends js.Object {
    var tunnelId: TunnelId
    var delete: js.UndefOr[DeleteFlag]
  }

  @js.native
  @Factory
  trait CloseTunnelResponse extends js.Object {}

  /**
    * The state of a connection.
    */
  @js.native
  @Factory
  trait ConnectionState extends js.Object {
    var lastUpdatedAt: js.UndefOr[DateType]
    var status: js.UndefOr[ConnectionStatus]
  }

  @js.native
  sealed trait ConnectionStatus extends js.Any
  object ConnectionStatus extends js.Object {
    val CONNECTED    = "CONNECTED".asInstanceOf[ConnectionStatus]
    val DISCONNECTED = "DISCONNECTED".asInstanceOf[ConnectionStatus]

    val values = js.Object.freeze(js.Array(CONNECTED, DISCONNECTED))
  }

  @js.native
  @Factory
  trait DescribeTunnelRequest extends js.Object {
    var tunnelId: TunnelId
  }

  @js.native
  @Factory
  trait DescribeTunnelResponse extends js.Object {
    var tunnel: js.UndefOr[Tunnel]
  }

  /**
    * The destination configuration.
    */
  @js.native
  @Factory
  trait DestinationConfig extends js.Object {
    var services: ServiceList
    var thingName: ThingName
  }

  @js.native
  @Factory
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: AmazonResourceName
  }

  @js.native
  @Factory
  trait ListTagsForResourceResponse extends js.Object {
    var tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait ListTunnelsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var thingName: js.UndefOr[ThingName]
  }

  @js.native
  @Factory
  trait ListTunnelsResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var tunnelSummaries: js.UndefOr[TunnelSummaryList]
  }

  @js.native
  @Factory
  trait OpenTunnelRequest extends js.Object {
    var description: js.UndefOr[Description]
    var destinationConfig: js.UndefOr[DestinationConfig]
    var tags: js.UndefOr[TagList]
    var timeoutConfig: js.UndefOr[TimeoutConfig]
  }

  @js.native
  @Factory
  trait OpenTunnelResponse extends js.Object {
    var destinationAccessToken: js.UndefOr[ClientAccessToken]
    var sourceAccessToken: js.UndefOr[ClientAccessToken]
    var tunnelArn: js.UndefOr[TunnelArn]
    var tunnelId: js.UndefOr[TunnelId]
  }

  /**
    * An arbitary key/value pair used to add searchable metadata to secure tunnel resources.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var key: TagKey
    var value: TagValue
  }

  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var resourceArn: AmazonResourceName
    var tags: TagList
  }

  @js.native
  @Factory
  trait TagResourceResponse extends js.Object {}

  /**
    * Tunnel timeout configuration.
    */
  @js.native
  @Factory
  trait TimeoutConfig extends js.Object {
    var maxLifetimeTimeoutMinutes: js.UndefOr[TimeoutInMin]
  }

  /**
    * A connection between a source computer and a destination device.
    */
  @js.native
  @Factory
  trait Tunnel extends js.Object {
    var createdAt: js.UndefOr[DateType]
    var description: js.UndefOr[Description]
    var destinationConfig: js.UndefOr[DestinationConfig]
    var destinationConnectionState: js.UndefOr[ConnectionState]
    var lastUpdatedAt: js.UndefOr[DateType]
    var sourceConnectionState: js.UndefOr[ConnectionState]
    var status: js.UndefOr[TunnelStatus]
    var tags: js.UndefOr[TagList]
    var timeoutConfig: js.UndefOr[TimeoutConfig]
    var tunnelArn: js.UndefOr[TunnelArn]
    var tunnelId: js.UndefOr[TunnelId]
  }

  @js.native
  sealed trait TunnelStatus extends js.Any
  object TunnelStatus extends js.Object {
    val OPEN   = "OPEN".asInstanceOf[TunnelStatus]
    val CLOSED = "CLOSED".asInstanceOf[TunnelStatus]

    val values = js.Object.freeze(js.Array(OPEN, CLOSED))
  }

  /**
    * Information about the tunnel.
    */
  @js.native
  @Factory
  trait TunnelSummary extends js.Object {
    var createdAt: js.UndefOr[DateType]
    var description: js.UndefOr[Description]
    var lastUpdatedAt: js.UndefOr[DateType]
    var status: js.UndefOr[TunnelStatus]
    var tunnelArn: js.UndefOr[TunnelArn]
    var tunnelId: js.UndefOr[TunnelId]
  }

  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var resourceArn: AmazonResourceName
    var tagKeys: TagKeyList
  }

  @js.native
  @Factory
  trait UntagResourceResponse extends js.Object {}
}
