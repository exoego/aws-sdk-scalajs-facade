package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object schemas {
  type Body                                        = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type GetDiscoveredSchemaVersionItemInput         = String
  type Tags                                        = js.Dictionary[__string]
  type __boolean                                   = Boolean
  type __integer                                   = Int
  type __integerMin1Max29000                       = Int
  type __listOfDiscovererSummary                   = js.Array[DiscovererSummary]
  type __listOfGetDiscoveredSchemaVersionItemInput = js.Array[GetDiscoveredSchemaVersionItemInput]
  type __listOfRegistrySummary                     = js.Array[RegistrySummary]
  type __listOfSchemaSummary                       = js.Array[SchemaSummary]
  type __listOfSchemaVersionSummary                = js.Array[SchemaVersionSummary]
  type __listOfSearchSchemaSummary                 = js.Array[SearchSchemaSummary]
  type __listOfSearchSchemaVersionSummary          = js.Array[SearchSchemaVersionSummary]
  type __listOf__string                            = js.Array[__string]
  type __long                                      = Double
  type __string                                    = String
  type __stringMin0Max256                          = String
  type __stringMin0Max36                           = String
  type __stringMin1Max100000                       = String
  type __stringMin1Max1600                         = String
  type __stringMin20Max1600                        = String
  type __timestampIso8601                          = js.Date

  implicit final class SchemasOps(private val service: Schemas) extends AnyVal {

    @inline def createDiscovererFuture(params: CreateDiscovererRequest): Future[CreateDiscovererResponse] =
      service.createDiscoverer(params).promise().toFuture
    @inline def createRegistryFuture(params: CreateRegistryRequest): Future[CreateRegistryResponse] =
      service.createRegistry(params).promise().toFuture
    @inline def createSchemaFuture(params: CreateSchemaRequest): Future[CreateSchemaResponse] =
      service.createSchema(params).promise().toFuture
    @inline def deleteDiscovererFuture(params: DeleteDiscovererRequest): Future[js.Object] =
      service.deleteDiscoverer(params).promise().toFuture
    @inline def deleteRegistryFuture(params: DeleteRegistryRequest): Future[js.Object] =
      service.deleteRegistry(params).promise().toFuture
    @inline def deleteSchemaFuture(params: DeleteSchemaRequest): Future[js.Object] =
      service.deleteSchema(params).promise().toFuture
    @inline def deleteSchemaVersionFuture(params: DeleteSchemaVersionRequest): Future[js.Object] =
      service.deleteSchemaVersion(params).promise().toFuture
    @inline def describeCodeBindingFuture(params: DescribeCodeBindingRequest): Future[DescribeCodeBindingResponse] =
      service.describeCodeBinding(params).promise().toFuture
    @inline def describeDiscovererFuture(params: DescribeDiscovererRequest): Future[DescribeDiscovererResponse] =
      service.describeDiscoverer(params).promise().toFuture
    @inline def describeRegistryFuture(params: DescribeRegistryRequest): Future[DescribeRegistryResponse] =
      service.describeRegistry(params).promise().toFuture
    @inline def describeSchemaFuture(params: DescribeSchemaRequest): Future[DescribeSchemaResponse] =
      service.describeSchema(params).promise().toFuture
    @inline def getCodeBindingSourceFuture(params: GetCodeBindingSourceRequest): Future[GetCodeBindingSourceResponse] =
      service.getCodeBindingSource(params).promise().toFuture
    @inline def getDiscoveredSchemaFuture(params: GetDiscoveredSchemaRequest): Future[GetDiscoveredSchemaResponse] =
      service.getDiscoveredSchema(params).promise().toFuture
    @inline def listDiscoverersFuture(params: ListDiscoverersRequest): Future[ListDiscoverersResponse] =
      service.listDiscoverers(params).promise().toFuture
    @inline def listRegistriesFuture(params: ListRegistriesRequest): Future[ListRegistriesResponse] =
      service.listRegistries(params).promise().toFuture
    @inline def listSchemaVersionsFuture(params: ListSchemaVersionsRequest): Future[ListSchemaVersionsResponse] =
      service.listSchemaVersions(params).promise().toFuture
    @inline def listSchemasFuture(params: ListSchemasRequest): Future[ListSchemasResponse] =
      service.listSchemas(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise().toFuture
    @inline def lockServiceLinkedRoleFuture(
        params: LockServiceLinkedRoleRequest
    ): Future[LockServiceLinkedRoleResponse] = service.lockServiceLinkedRole(params).promise().toFuture
    @inline def putCodeBindingFuture(params: PutCodeBindingRequest): Future[PutCodeBindingResponse] =
      service.putCodeBinding(params).promise().toFuture
    @inline def searchSchemasFuture(params: SearchSchemasRequest): Future[SearchSchemasResponse] =
      service.searchSchemas(params).promise().toFuture
    @inline def startDiscovererFuture(params: StartDiscovererRequest): Future[StartDiscovererResponse] =
      service.startDiscoverer(params).promise().toFuture
    @inline def stopDiscovererFuture(params: StopDiscovererRequest): Future[StopDiscovererResponse] =
      service.stopDiscoverer(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[js.Object] =
      service.tagResource(params).promise().toFuture
    @inline def unlockServiceLinkedRoleFuture(
        params: UnlockServiceLinkedRoleRequest
    ): Future[UnlockServiceLinkedRoleResponse] = service.unlockServiceLinkedRole(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[js.Object] =
      service.untagResource(params).promise().toFuture
    @inline def updateDiscovererFuture(params: UpdateDiscovererRequest): Future[UpdateDiscovererResponse] =
      service.updateDiscoverer(params).promise().toFuture
    @inline def updateRegistryFuture(params: UpdateRegistryRequest): Future[UpdateRegistryResponse] =
      service.updateRegistry(params).promise().toFuture
    @inline def updateSchemaFuture(params: UpdateSchemaRequest): Future[UpdateSchemaResponse] =
      service.updateSchema(params).promise().toFuture
  }
}

package schemas {
  @js.native
  @JSImport("aws-sdk", "Schemas")
  class Schemas() extends js.Object {
    def this(config: AWSConfig) = this()

    def createDiscoverer(params: CreateDiscovererRequest): Request[CreateDiscovererResponse]                = js.native
    def createRegistry(params: CreateRegistryRequest): Request[CreateRegistryResponse]                      = js.native
    def createSchema(params: CreateSchemaRequest): Request[CreateSchemaResponse]                            = js.native
    def deleteDiscoverer(params: DeleteDiscovererRequest): Request[js.Object]                               = js.native
    def deleteRegistry(params: DeleteRegistryRequest): Request[js.Object]                                   = js.native
    def deleteSchema(params: DeleteSchemaRequest): Request[js.Object]                                       = js.native
    def deleteSchemaVersion(params: DeleteSchemaVersionRequest): Request[js.Object]                         = js.native
    def describeCodeBinding(params: DescribeCodeBindingRequest): Request[DescribeCodeBindingResponse]       = js.native
    def describeDiscoverer(params: DescribeDiscovererRequest): Request[DescribeDiscovererResponse]          = js.native
    def describeRegistry(params: DescribeRegistryRequest): Request[DescribeRegistryResponse]                = js.native
    def describeSchema(params: DescribeSchemaRequest): Request[DescribeSchemaResponse]                      = js.native
    def getCodeBindingSource(params: GetCodeBindingSourceRequest): Request[GetCodeBindingSourceResponse]    = js.native
    def getDiscoveredSchema(params: GetDiscoveredSchemaRequest): Request[GetDiscoveredSchemaResponse]       = js.native
    def listDiscoverers(params: ListDiscoverersRequest): Request[ListDiscoverersResponse]                   = js.native
    def listRegistries(params: ListRegistriesRequest): Request[ListRegistriesResponse]                      = js.native
    def listSchemaVersions(params: ListSchemaVersionsRequest): Request[ListSchemaVersionsResponse]          = js.native
    def listSchemas(params: ListSchemasRequest): Request[ListSchemasResponse]                               = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse]       = js.native
    def lockServiceLinkedRole(params: LockServiceLinkedRoleRequest): Request[LockServiceLinkedRoleResponse] = js.native
    def putCodeBinding(params: PutCodeBindingRequest): Request[PutCodeBindingResponse]                      = js.native
    def searchSchemas(params: SearchSchemasRequest): Request[SearchSchemasResponse]                         = js.native
    def startDiscoverer(params: StartDiscovererRequest): Request[StartDiscovererResponse]                   = js.native
    def stopDiscoverer(params: StopDiscovererRequest): Request[StopDiscovererResponse]                      = js.native
    def tagResource(params: TagResourceRequest): Request[js.Object]                                         = js.native
    def unlockServiceLinkedRole(params: UnlockServiceLinkedRoleRequest): Request[UnlockServiceLinkedRoleResponse] =
      js.native
    def untagResource(params: UntagResourceRequest): Request[js.Object]                      = js.native
    def updateDiscoverer(params: UpdateDiscovererRequest): Request[UpdateDiscovererResponse] = js.native
    def updateRegistry(params: UpdateRegistryRequest): Request[UpdateRegistryResponse]       = js.native
    def updateSchema(params: UpdateSchemaRequest): Request[UpdateSchemaResponse]             = js.native
  }

  @js.native
  sealed trait CodeGenerationStatus extends js.Any
  object CodeGenerationStatus extends js.Object {
    val CREATE_IN_PROGRESS = "CREATE_IN_PROGRESS".asInstanceOf[CodeGenerationStatus]
    val CREATE_COMPLETE    = "CREATE_COMPLETE".asInstanceOf[CodeGenerationStatus]
    val CREATE_FAILED      = "CREATE_FAILED".asInstanceOf[CodeGenerationStatus]

    val values = js.Object.freeze(js.Array(CREATE_IN_PROGRESS, CREATE_COMPLETE, CREATE_FAILED))
  }

  @js.native
  @Factory
  trait CreateDiscovererRequest extends js.Object {
    var SourceArn: __stringMin20Max1600
    var Description: js.UndefOr[__stringMin0Max256]
    var Tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
  trait CreateDiscovererResponse extends js.Object {
    var Description: js.UndefOr[__string]
    var DiscovererArn: js.UndefOr[__string]
    var DiscovererId: js.UndefOr[__string]
    var SourceArn: js.UndefOr[__string]
    var State: js.UndefOr[DiscovererState]
    var Tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
  trait CreateRegistryRequest extends js.Object {
    var RegistryName: __string
    var Description: js.UndefOr[__stringMin0Max256]
    var Tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
  trait CreateRegistryResponse extends js.Object {
    var Description: js.UndefOr[__string]
    var RegistryArn: js.UndefOr[__string]
    var RegistryName: js.UndefOr[__string]
    var Tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
  trait CreateSchemaRequest extends js.Object {
    var Content: __stringMin1Max100000
    var RegistryName: __string
    var SchemaName: __string
    var Type: Type
    var Description: js.UndefOr[__stringMin0Max256]
    var Tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
  trait CreateSchemaResponse extends js.Object {
    var Description: js.UndefOr[__string]
    var LastModified: js.UndefOr[__timestampIso8601]
    var SchemaArn: js.UndefOr[__string]
    var SchemaName: js.UndefOr[__string]
    var SchemaVersion: js.UndefOr[__string]
    var Tags: js.UndefOr[Tags]
    var Type: js.UndefOr[__string]
    var VersionCreatedDate: js.UndefOr[__timestampIso8601]
  }

  @js.native
  @Factory
  trait DeleteDiscovererRequest extends js.Object {
    var DiscovererId: __string
  }

  @js.native
  @Factory
  trait DeleteRegistryRequest extends js.Object {
    var RegistryName: __string
  }

  @js.native
  @Factory
  trait DeleteSchemaRequest extends js.Object {
    var RegistryName: __string
    var SchemaName: __string
  }

  @js.native
  @Factory
  trait DeleteSchemaVersionRequest extends js.Object {
    var RegistryName: __string
    var SchemaName: __string
    var SchemaVersion: __string
  }

  @js.native
  @Factory
  trait DescribeCodeBindingRequest extends js.Object {
    var Language: __string
    var RegistryName: __string
    var SchemaName: __string
    var SchemaVersion: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait DescribeCodeBindingResponse extends js.Object {
    var CreationDate: js.UndefOr[__timestampIso8601]
    var LastModified: js.UndefOr[__timestampIso8601]
    var SchemaVersion: js.UndefOr[__string]
    var Status: js.UndefOr[CodeGenerationStatus]
  }

  @js.native
  @Factory
  trait DescribeDiscovererRequest extends js.Object {
    var DiscovererId: __string
  }

  @js.native
  @Factory
  trait DescribeDiscovererResponse extends js.Object {
    var Description: js.UndefOr[__string]
    var DiscovererArn: js.UndefOr[__string]
    var DiscovererId: js.UndefOr[__string]
    var SourceArn: js.UndefOr[__string]
    var State: js.UndefOr[DiscovererState]
    var Tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
  trait DescribeRegistryRequest extends js.Object {
    var RegistryName: __string
  }

  @js.native
  @Factory
  trait DescribeRegistryResponse extends js.Object {
    var Description: js.UndefOr[__string]
    var RegistryArn: js.UndefOr[__string]
    var RegistryName: js.UndefOr[__string]
    var Tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
  trait DescribeSchemaRequest extends js.Object {
    var RegistryName: __string
    var SchemaName: __string
    var SchemaVersion: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait DescribeSchemaResponse extends js.Object {
    var Content: js.UndefOr[__string]
    var Description: js.UndefOr[__string]
    var LastModified: js.UndefOr[__timestampIso8601]
    var SchemaArn: js.UndefOr[__string]
    var SchemaName: js.UndefOr[__string]
    var SchemaVersion: js.UndefOr[__string]
    var Tags: js.UndefOr[Tags]
    var Type: js.UndefOr[__string]
    var VersionCreatedDate: js.UndefOr[__timestampIso8601]
  }

  @js.native
  sealed trait DiscovererState extends js.Any
  object DiscovererState extends js.Object {
    val STARTED = "STARTED".asInstanceOf[DiscovererState]
    val STOPPED = "STOPPED".asInstanceOf[DiscovererState]

    val values = js.Object.freeze(js.Array(STARTED, STOPPED))
  }

  @js.native
  @Factory
  trait DiscovererSummary extends js.Object {
    var DiscovererArn: js.UndefOr[__string]
    var DiscovererId: js.UndefOr[__string]
    var SourceArn: js.UndefOr[__string]
    var State: js.UndefOr[DiscovererState]
    var Tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
  trait GetCodeBindingSourceRequest extends js.Object {
    var Language: __string
    var RegistryName: __string
    var SchemaName: __string
    var SchemaVersion: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait GetCodeBindingSourceResponse extends js.Object {
    var Body: js.UndefOr[Body]
  }

  @js.native
  @Factory
  trait GetDiscoveredSchemaRequest extends js.Object {
    var Events: __listOfGetDiscoveredSchemaVersionItemInput
    var Type: Type
  }

  @js.native
  @Factory
  trait GetDiscoveredSchemaResponse extends js.Object {
    var Content: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListDiscoverersRequest extends js.Object {
    var DiscovererIdPrefix: js.UndefOr[__string]
    var Limit: js.UndefOr[__integer]
    var NextToken: js.UndefOr[__string]
    var SourceArnPrefix: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListDiscoverersResponse extends js.Object {
    var Discoverers: js.UndefOr[__listOfDiscovererSummary]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListRegistriesRequest extends js.Object {
    var Limit: js.UndefOr[__integer]
    var NextToken: js.UndefOr[__string]
    var RegistryNamePrefix: js.UndefOr[__string]
    var Scope: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListRegistriesResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var Registries: js.UndefOr[__listOfRegistrySummary]
  }

  @js.native
  @Factory
  trait ListSchemaVersionsRequest extends js.Object {
    var RegistryName: __string
    var SchemaName: __string
    var Limit: js.UndefOr[__integer]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListSchemaVersionsResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var SchemaVersions: js.UndefOr[__listOfSchemaVersionSummary]
  }

  @js.native
  @Factory
  trait ListSchemasRequest extends js.Object {
    var RegistryName: __string
    var Limit: js.UndefOr[__integer]
    var NextToken: js.UndefOr[__string]
    var SchemaNamePrefix: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListSchemasResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var Schemas: js.UndefOr[__listOfSchemaSummary]
  }

  @js.native
  @Factory
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: __string
  }

  @js.native
  @Factory
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: Tags
  }

  @js.native
  @Factory
  trait LockServiceLinkedRoleRequest extends js.Object {
    var RoleArn: __stringMin1Max1600
    var Timeout: __integerMin1Max29000
  }

  @js.native
  @Factory
  trait LockServiceLinkedRoleResponse extends js.Object {
    var CanBeDeleted: js.UndefOr[__boolean]
    var ReasonOfFailure: js.UndefOr[__stringMin1Max1600]
    var RelatedResources: js.UndefOr[__listOfDiscovererSummary]
  }

  @js.native
  @Factory
  trait PutCodeBindingRequest extends js.Object {
    var Language: __string
    var RegistryName: __string
    var SchemaName: __string
    var SchemaVersion: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait PutCodeBindingResponse extends js.Object {
    var CreationDate: js.UndefOr[__timestampIso8601]
    var LastModified: js.UndefOr[__timestampIso8601]
    var SchemaVersion: js.UndefOr[__string]
    var Status: js.UndefOr[CodeGenerationStatus]
  }

  @js.native
  @Factory
  trait RegistrySummary extends js.Object {
    var RegistryArn: js.UndefOr[__string]
    var RegistryName: js.UndefOr[__string]
    var Tags: js.UndefOr[Tags]
  }

  /**
    * A summary of schema details.
    */
  @js.native
  @Factory
  trait SchemaSummary extends js.Object {
    var LastModified: js.UndefOr[__timestampIso8601]
    var SchemaArn: js.UndefOr[__string]
    var SchemaName: js.UndefOr[__string]
    var Tags: js.UndefOr[Tags]
    var VersionCount: js.UndefOr[__long]
  }

  @js.native
  @Factory
  trait SchemaVersionSummary extends js.Object {
    var SchemaArn: js.UndefOr[__string]
    var SchemaName: js.UndefOr[__string]
    var SchemaVersion: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait SearchSchemaSummary extends js.Object {
    var RegistryName: js.UndefOr[__string]
    var SchemaArn: js.UndefOr[__string]
    var SchemaName: js.UndefOr[__string]
    var SchemaVersions: js.UndefOr[__listOfSearchSchemaVersionSummary]
  }

  @js.native
  @Factory
  trait SearchSchemaVersionSummary extends js.Object {
    var CreatedDate: js.UndefOr[__timestampIso8601]
    var SchemaVersion: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait SearchSchemasRequest extends js.Object {
    var Keywords: __string
    var RegistryName: __string
    var Limit: js.UndefOr[__integer]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait SearchSchemasResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var Schemas: js.UndefOr[__listOfSearchSchemaSummary]
  }

  @js.native
  @Factory
  trait StartDiscovererRequest extends js.Object {
    var DiscovererId: __string
  }

  @js.native
  @Factory
  trait StartDiscovererResponse extends js.Object {
    var DiscovererId: js.UndefOr[__string]
    var State: js.UndefOr[DiscovererState]
  }

  @js.native
  @Factory
  trait StopDiscovererRequest extends js.Object {
    var DiscovererId: __string
  }

  @js.native
  @Factory
  trait StopDiscovererResponse extends js.Object {
    var DiscovererId: js.UndefOr[__string]
    var State: js.UndefOr[DiscovererState]
  }

  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var ResourceArn: __string
    var Tags: Tags
  }

  @js.native
  sealed trait Type extends js.Any
  object Type extends js.Object {
    val OpenApi3 = "OpenApi3".asInstanceOf[Type]

    val values = js.Object.freeze(js.Array(OpenApi3))
  }

  @js.native
  @Factory
  trait UnlockServiceLinkedRoleRequest extends js.Object {
    var RoleArn: __stringMin1Max1600
  }

  @js.native
  @Factory
  trait UnlockServiceLinkedRoleResponse extends js.Object {}

  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: __string
    var TagKeys: __listOf__string
  }

  @js.native
  @Factory
  trait UpdateDiscovererRequest extends js.Object {
    var DiscovererId: __string
    var Description: js.UndefOr[__stringMin0Max256]
  }

  @js.native
  @Factory
  trait UpdateDiscovererResponse extends js.Object {
    var Description: js.UndefOr[__string]
    var DiscovererArn: js.UndefOr[__string]
    var DiscovererId: js.UndefOr[__string]
    var SourceArn: js.UndefOr[__string]
    var State: js.UndefOr[DiscovererState]
    var Tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
  trait UpdateRegistryRequest extends js.Object {
    var RegistryName: __string
    var Description: js.UndefOr[__stringMin0Max256]
  }

  @js.native
  @Factory
  trait UpdateRegistryResponse extends js.Object {
    var Description: js.UndefOr[__string]
    var RegistryArn: js.UndefOr[__string]
    var RegistryName: js.UndefOr[__string]
    var Tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
  trait UpdateSchemaRequest extends js.Object {
    var RegistryName: __string
    var SchemaName: __string
    var ClientTokenId: js.UndefOr[__stringMin0Max36]
    var Content: js.UndefOr[__stringMin1Max100000]
    var Description: js.UndefOr[__stringMin0Max256]
    var Type: js.UndefOr[Type]
  }

  @js.native
  @Factory
  trait UpdateSchemaResponse extends js.Object {
    var Description: js.UndefOr[__string]
    var LastModified: js.UndefOr[__timestampIso8601]
    var SchemaArn: js.UndefOr[__string]
    var SchemaName: js.UndefOr[__string]
    var SchemaVersion: js.UndefOr[__string]
    var Tags: js.UndefOr[Tags]
    var Type: js.UndefOr[__string]
    var VersionCreatedDate: js.UndefOr[__timestampIso8601]
  }
}
