package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object iotsecuretunneling {
  type AmazonResourceName = String
  type ClientAccessToken = String
  type DateType = js.Date
  type DeleteFlag = Boolean
  type Description = String
  type MaxResults = Int
  type NextToken = String
  type Service = String
  type ServiceList = js.Array[Service]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type ThingName = String
  type TimeoutInMin = Int
  type TunnelArn = String
  type TunnelId = String
  type TunnelSummaryList = js.Array[TunnelSummary]

  implicit final class IoTSecureTunnelingOps(private val service: IoTSecureTunneling) extends AnyVal {

    @inline def closeTunnelFuture(params: CloseTunnelRequest): Future[CloseTunnelResponse] = service.closeTunnel(params).promise().toFuture
    @inline def describeTunnelFuture(params: DescribeTunnelRequest): Future[DescribeTunnelResponse] = service.describeTunnel(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def listTunnelsFuture(params: ListTunnelsRequest): Future[ListTunnelsResponse] = service.listTunnels(params).promise().toFuture
    @inline def openTunnelFuture(params: OpenTunnelRequest): Future[OpenTunnelResponse] = service.openTunnel(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture

  }
}

package iotsecuretunneling {
  @js.native
  @JSImport("aws-sdk/clients/iotsecuretunneling", JSImport.Namespace, "AWS.IoTSecureTunneling")
  class IoTSecureTunneling() extends js.Object {
    def this(config: AWSConfig) = this()

    def closeTunnel(params: CloseTunnelRequest): Request[CloseTunnelResponse] = js.native
    def describeTunnel(params: DescribeTunnelRequest): Request[DescribeTunnelResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def listTunnels(params: ListTunnelsRequest): Request[ListTunnelsResponse] = js.native
    def openTunnel(params: OpenTunnelRequest): Request[OpenTunnelResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
  }

  @js.native
  trait CloseTunnelRequest extends js.Object {
    var tunnelId: TunnelId
    var delete: js.UndefOr[DeleteFlag]
  }

  object CloseTunnelRequest {
    @inline
    def apply(
        tunnelId: TunnelId,
        delete: js.UndefOr[DeleteFlag] = js.undefined
    ): CloseTunnelRequest = {
      val __obj = js.Dynamic.literal(
        "tunnelId" -> tunnelId.asInstanceOf[js.Any]
      )

      delete.foreach(__v => __obj.updateDynamic("delete")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CloseTunnelRequest]
    }
  }

  @js.native
  trait CloseTunnelResponse extends js.Object

  object CloseTunnelResponse {
    @inline
    def apply(): CloseTunnelResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CloseTunnelResponse]
    }
  }

  /** The state of a connection.
    */
  @js.native
  trait ConnectionState extends js.Object {
    var lastUpdatedAt: js.UndefOr[DateType]
    var status: js.UndefOr[ConnectionStatus]
  }

  object ConnectionState {
    @inline
    def apply(
        lastUpdatedAt: js.UndefOr[DateType] = js.undefined,
        status: js.UndefOr[ConnectionStatus] = js.undefined
    ): ConnectionState = {
      val __obj = js.Dynamic.literal()
      lastUpdatedAt.foreach(__v => __obj.updateDynamic("lastUpdatedAt")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConnectionState]
    }
  }

  @js.native
  sealed trait ConnectionStatus extends js.Any
  object ConnectionStatus {
    val CONNECTED = "CONNECTED".asInstanceOf[ConnectionStatus]
    val DISCONNECTED = "DISCONNECTED".asInstanceOf[ConnectionStatus]

    @inline def values = js.Array(CONNECTED, DISCONNECTED)
  }

  @js.native
  trait DescribeTunnelRequest extends js.Object {
    var tunnelId: TunnelId
  }

  object DescribeTunnelRequest {
    @inline
    def apply(
        tunnelId: TunnelId
    ): DescribeTunnelRequest = {
      val __obj = js.Dynamic.literal(
        "tunnelId" -> tunnelId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeTunnelRequest]
    }
  }

  @js.native
  trait DescribeTunnelResponse extends js.Object {
    var tunnel: js.UndefOr[Tunnel]
  }

  object DescribeTunnelResponse {
    @inline
    def apply(
        tunnel: js.UndefOr[Tunnel] = js.undefined
    ): DescribeTunnelResponse = {
      val __obj = js.Dynamic.literal()
      tunnel.foreach(__v => __obj.updateDynamic("tunnel")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTunnelResponse]
    }
  }

  /** The destination configuration.
    */
  @js.native
  trait DestinationConfig extends js.Object {
    var services: ServiceList
    var thingName: js.UndefOr[ThingName]
  }

  object DestinationConfig {
    @inline
    def apply(
        services: ServiceList,
        thingName: js.UndefOr[ThingName] = js.undefined
    ): DestinationConfig = {
      val __obj = js.Dynamic.literal(
        "services" -> services.asInstanceOf[js.Any]
      )

      thingName.foreach(__v => __obj.updateDynamic("thingName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DestinationConfig]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: AmazonResourceName
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        resourceArn: AmazonResourceName
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var tags: js.UndefOr[TagList]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  @js.native
  trait ListTunnelsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var thingName: js.UndefOr[ThingName]
  }

  object ListTunnelsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        thingName: js.UndefOr[ThingName] = js.undefined
    ): ListTunnelsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      thingName.foreach(__v => __obj.updateDynamic("thingName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTunnelsRequest]
    }
  }

  @js.native
  trait ListTunnelsResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var tunnelSummaries: js.UndefOr[TunnelSummaryList]
  }

  object ListTunnelsResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        tunnelSummaries: js.UndefOr[TunnelSummaryList] = js.undefined
    ): ListTunnelsResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      tunnelSummaries.foreach(__v => __obj.updateDynamic("tunnelSummaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTunnelsResponse]
    }
  }

  @js.native
  trait OpenTunnelRequest extends js.Object {
    var description: js.UndefOr[Description]
    var destinationConfig: js.UndefOr[DestinationConfig]
    var tags: js.UndefOr[TagList]
    var timeoutConfig: js.UndefOr[TimeoutConfig]
  }

  object OpenTunnelRequest {
    @inline
    def apply(
        description: js.UndefOr[Description] = js.undefined,
        destinationConfig: js.UndefOr[DestinationConfig] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined,
        timeoutConfig: js.UndefOr[TimeoutConfig] = js.undefined
    ): OpenTunnelRequest = {
      val __obj = js.Dynamic.literal()
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      destinationConfig.foreach(__v => __obj.updateDynamic("destinationConfig")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      timeoutConfig.foreach(__v => __obj.updateDynamic("timeoutConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OpenTunnelRequest]
    }
  }

  @js.native
  trait OpenTunnelResponse extends js.Object {
    var destinationAccessToken: js.UndefOr[ClientAccessToken]
    var sourceAccessToken: js.UndefOr[ClientAccessToken]
    var tunnelArn: js.UndefOr[TunnelArn]
    var tunnelId: js.UndefOr[TunnelId]
  }

  object OpenTunnelResponse {
    @inline
    def apply(
        destinationAccessToken: js.UndefOr[ClientAccessToken] = js.undefined,
        sourceAccessToken: js.UndefOr[ClientAccessToken] = js.undefined,
        tunnelArn: js.UndefOr[TunnelArn] = js.undefined,
        tunnelId: js.UndefOr[TunnelId] = js.undefined
    ): OpenTunnelResponse = {
      val __obj = js.Dynamic.literal()
      destinationAccessToken.foreach(__v => __obj.updateDynamic("destinationAccessToken")(__v.asInstanceOf[js.Any]))
      sourceAccessToken.foreach(__v => __obj.updateDynamic("sourceAccessToken")(__v.asInstanceOf[js.Any]))
      tunnelArn.foreach(__v => __obj.updateDynamic("tunnelArn")(__v.asInstanceOf[js.Any]))
      tunnelId.foreach(__v => __obj.updateDynamic("tunnelId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OpenTunnelResponse]
    }
  }

  /** An arbitary key/value pair used to add searchable metadata to secure tunnel resources.
    */
  @js.native
  trait Tag extends js.Object {
    var key: TagKey
    var value: TagValue
  }

  object Tag {
    @inline
    def apply(
        key: TagKey,
        value: TagValue
    ): Tag = {
      val __obj = js.Dynamic.literal(
        "key" -> key.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: AmazonResourceName
    var tags: TagList
  }

  object TagResourceRequest {
    @inline
    def apply(
        resourceArn: AmazonResourceName,
        tags: TagList
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tags" -> tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object

  object TagResourceResponse {
    @inline
    def apply(): TagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  /** Tunnel timeout configuration.
    */
  @js.native
  trait TimeoutConfig extends js.Object {
    var maxLifetimeTimeoutMinutes: js.UndefOr[TimeoutInMin]
  }

  object TimeoutConfig {
    @inline
    def apply(
        maxLifetimeTimeoutMinutes: js.UndefOr[TimeoutInMin] = js.undefined
    ): TimeoutConfig = {
      val __obj = js.Dynamic.literal()
      maxLifetimeTimeoutMinutes.foreach(__v => __obj.updateDynamic("maxLifetimeTimeoutMinutes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TimeoutConfig]
    }
  }

  /** A connection between a source computer and a destination device.
    */
  @js.native
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

  object Tunnel {
    @inline
    def apply(
        createdAt: js.UndefOr[DateType] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        destinationConfig: js.UndefOr[DestinationConfig] = js.undefined,
        destinationConnectionState: js.UndefOr[ConnectionState] = js.undefined,
        lastUpdatedAt: js.UndefOr[DateType] = js.undefined,
        sourceConnectionState: js.UndefOr[ConnectionState] = js.undefined,
        status: js.UndefOr[TunnelStatus] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined,
        timeoutConfig: js.UndefOr[TimeoutConfig] = js.undefined,
        tunnelArn: js.UndefOr[TunnelArn] = js.undefined,
        tunnelId: js.UndefOr[TunnelId] = js.undefined
    ): Tunnel = {
      val __obj = js.Dynamic.literal()
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      destinationConfig.foreach(__v => __obj.updateDynamic("destinationConfig")(__v.asInstanceOf[js.Any]))
      destinationConnectionState.foreach(__v => __obj.updateDynamic("destinationConnectionState")(__v.asInstanceOf[js.Any]))
      lastUpdatedAt.foreach(__v => __obj.updateDynamic("lastUpdatedAt")(__v.asInstanceOf[js.Any]))
      sourceConnectionState.foreach(__v => __obj.updateDynamic("sourceConnectionState")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      timeoutConfig.foreach(__v => __obj.updateDynamic("timeoutConfig")(__v.asInstanceOf[js.Any]))
      tunnelArn.foreach(__v => __obj.updateDynamic("tunnelArn")(__v.asInstanceOf[js.Any]))
      tunnelId.foreach(__v => __obj.updateDynamic("tunnelId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Tunnel]
    }
  }

  @js.native
  sealed trait TunnelStatus extends js.Any
  object TunnelStatus {
    val OPEN = "OPEN".asInstanceOf[TunnelStatus]
    val CLOSED = "CLOSED".asInstanceOf[TunnelStatus]

    @inline def values = js.Array(OPEN, CLOSED)
  }

  /** Information about the tunnel.
    */
  @js.native
  trait TunnelSummary extends js.Object {
    var createdAt: js.UndefOr[DateType]
    var description: js.UndefOr[Description]
    var lastUpdatedAt: js.UndefOr[DateType]
    var status: js.UndefOr[TunnelStatus]
    var tunnelArn: js.UndefOr[TunnelArn]
    var tunnelId: js.UndefOr[TunnelId]
  }

  object TunnelSummary {
    @inline
    def apply(
        createdAt: js.UndefOr[DateType] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        lastUpdatedAt: js.UndefOr[DateType] = js.undefined,
        status: js.UndefOr[TunnelStatus] = js.undefined,
        tunnelArn: js.UndefOr[TunnelArn] = js.undefined,
        tunnelId: js.UndefOr[TunnelId] = js.undefined
    ): TunnelSummary = {
      val __obj = js.Dynamic.literal()
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      lastUpdatedAt.foreach(__v => __obj.updateDynamic("lastUpdatedAt")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      tunnelArn.foreach(__v => __obj.updateDynamic("tunnelArn")(__v.asInstanceOf[js.Any]))
      tunnelId.foreach(__v => __obj.updateDynamic("tunnelId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TunnelSummary]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var resourceArn: AmazonResourceName
    var tagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        resourceArn: AmazonResourceName,
        tagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tagKeys" -> tagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object

  object UntagResourceResponse {
    @inline
    def apply(): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UntagResourceResponse]
    }
  }
}
