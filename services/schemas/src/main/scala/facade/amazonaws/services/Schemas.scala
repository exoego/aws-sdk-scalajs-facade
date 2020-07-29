package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object schemas {
  type Body = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type GetDiscoveredSchemaVersionItemInput = String
  type Tags = js.Dictionary[__string]
  type __integer = Int
  type __listOfDiscovererSummary = js.Array[DiscovererSummary]
  type __listOfGetDiscoveredSchemaVersionItemInput = js.Array[GetDiscoveredSchemaVersionItemInput]
  type __listOfRegistrySummary = js.Array[RegistrySummary]
  type __listOfSchemaSummary = js.Array[SchemaSummary]
  type __listOfSchemaVersionSummary = js.Array[SchemaVersionSummary]
  type __listOfSearchSchemaSummary = js.Array[SearchSchemaSummary]
  type __listOfSearchSchemaVersionSummary = js.Array[SearchSchemaVersionSummary]
  type __listOf__string = js.Array[__string]
  type __long = Double
  type __string = String
  type __stringMin0Max256 = String
  type __stringMin0Max36 = String
  type __stringMin1Max100000 = String
  type __stringMin20Max1600 = String
  type __timestampIso8601 = js.Date

  implicit final class SchemasOps(private val service: Schemas) extends AnyVal {

    @inline def createDiscovererFuture(params: CreateDiscovererRequest): Future[CreateDiscovererResponse] = service.createDiscoverer(params).promise().toFuture
    @inline def createRegistryFuture(params: CreateRegistryRequest): Future[CreateRegistryResponse] = service.createRegistry(params).promise().toFuture
    @inline def createSchemaFuture(params: CreateSchemaRequest): Future[CreateSchemaResponse] = service.createSchema(params).promise().toFuture
    @inline def deleteDiscovererFuture(params: DeleteDiscovererRequest): Future[js.Object] = service.deleteDiscoverer(params).promise().toFuture
    @inline def deleteRegistryFuture(params: DeleteRegistryRequest): Future[js.Object] = service.deleteRegistry(params).promise().toFuture
    @inline def deleteResourcePolicyFuture(params: DeleteResourcePolicyRequest): Future[js.Object] = service.deleteResourcePolicy(params).promise().toFuture
    @inline def deleteSchemaFuture(params: DeleteSchemaRequest): Future[js.Object] = service.deleteSchema(params).promise().toFuture
    @inline def deleteSchemaVersionFuture(params: DeleteSchemaVersionRequest): Future[js.Object] = service.deleteSchemaVersion(params).promise().toFuture
    @inline def describeCodeBindingFuture(params: DescribeCodeBindingRequest): Future[DescribeCodeBindingResponse] = service.describeCodeBinding(params).promise().toFuture
    @inline def describeDiscovererFuture(params: DescribeDiscovererRequest): Future[DescribeDiscovererResponse] = service.describeDiscoverer(params).promise().toFuture
    @inline def describeRegistryFuture(params: DescribeRegistryRequest): Future[DescribeRegistryResponse] = service.describeRegistry(params).promise().toFuture
    @inline def describeSchemaFuture(params: DescribeSchemaRequest): Future[DescribeSchemaResponse] = service.describeSchema(params).promise().toFuture
    @inline def getCodeBindingSourceFuture(params: GetCodeBindingSourceRequest): Future[GetCodeBindingSourceResponse] = service.getCodeBindingSource(params).promise().toFuture
    @inline def getDiscoveredSchemaFuture(params: GetDiscoveredSchemaRequest): Future[GetDiscoveredSchemaResponse] = service.getDiscoveredSchema(params).promise().toFuture
    @inline def getResourcePolicyFuture(params: GetResourcePolicyRequest): Future[GetResourcePolicyResponse] = service.getResourcePolicy(params).promise().toFuture
    @inline def listDiscoverersFuture(params: ListDiscoverersRequest): Future[ListDiscoverersResponse] = service.listDiscoverers(params).promise().toFuture
    @inline def listRegistriesFuture(params: ListRegistriesRequest): Future[ListRegistriesResponse] = service.listRegistries(params).promise().toFuture
    @inline def listSchemaVersionsFuture(params: ListSchemaVersionsRequest): Future[ListSchemaVersionsResponse] = service.listSchemaVersions(params).promise().toFuture
    @inline def listSchemasFuture(params: ListSchemasRequest): Future[ListSchemasResponse] = service.listSchemas(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def putCodeBindingFuture(params: PutCodeBindingRequest): Future[PutCodeBindingResponse] = service.putCodeBinding(params).promise().toFuture
    @inline def putResourcePolicyFuture(params: PutResourcePolicyRequest): Future[PutResourcePolicyResponse] = service.putResourcePolicy(params).promise().toFuture
    @inline def searchSchemasFuture(params: SearchSchemasRequest): Future[SearchSchemasResponse] = service.searchSchemas(params).promise().toFuture
    @inline def startDiscovererFuture(params: StartDiscovererRequest): Future[StartDiscovererResponse] = service.startDiscoverer(params).promise().toFuture
    @inline def stopDiscovererFuture(params: StopDiscovererRequest): Future[StopDiscovererResponse] = service.stopDiscoverer(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[js.Object] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[js.Object] = service.untagResource(params).promise().toFuture
    @inline def updateDiscovererFuture(params: UpdateDiscovererRequest): Future[UpdateDiscovererResponse] = service.updateDiscoverer(params).promise().toFuture
    @inline def updateRegistryFuture(params: UpdateRegistryRequest): Future[UpdateRegistryResponse] = service.updateRegistry(params).promise().toFuture
    @inline def updateSchemaFuture(params: UpdateSchemaRequest): Future[UpdateSchemaResponse] = service.updateSchema(params).promise().toFuture
  }
}

package schemas {
  @js.native
  @JSImport("aws-sdk", "Schemas", "AWS.Schemas")
  class Schemas() extends js.Object {
    def this(config: AWSConfig) = this()

    def createDiscoverer(params: CreateDiscovererRequest): Request[CreateDiscovererResponse] = js.native
    def createRegistry(params: CreateRegistryRequest): Request[CreateRegistryResponse] = js.native
    def createSchema(params: CreateSchemaRequest): Request[CreateSchemaResponse] = js.native
    def deleteDiscoverer(params: DeleteDiscovererRequest): Request[js.Object] = js.native
    def deleteRegistry(params: DeleteRegistryRequest): Request[js.Object] = js.native
    def deleteResourcePolicy(params: DeleteResourcePolicyRequest): Request[js.Object] = js.native
    def deleteSchema(params: DeleteSchemaRequest): Request[js.Object] = js.native
    def deleteSchemaVersion(params: DeleteSchemaVersionRequest): Request[js.Object] = js.native
    def describeCodeBinding(params: DescribeCodeBindingRequest): Request[DescribeCodeBindingResponse] = js.native
    def describeDiscoverer(params: DescribeDiscovererRequest): Request[DescribeDiscovererResponse] = js.native
    def describeRegistry(params: DescribeRegistryRequest): Request[DescribeRegistryResponse] = js.native
    def describeSchema(params: DescribeSchemaRequest): Request[DescribeSchemaResponse] = js.native
    def getCodeBindingSource(params: GetCodeBindingSourceRequest): Request[GetCodeBindingSourceResponse] = js.native
    def getDiscoveredSchema(params: GetDiscoveredSchemaRequest): Request[GetDiscoveredSchemaResponse] = js.native
    def getResourcePolicy(params: GetResourcePolicyRequest): Request[GetResourcePolicyResponse] = js.native
    def listDiscoverers(params: ListDiscoverersRequest): Request[ListDiscoverersResponse] = js.native
    def listRegistries(params: ListRegistriesRequest): Request[ListRegistriesResponse] = js.native
    def listSchemaVersions(params: ListSchemaVersionsRequest): Request[ListSchemaVersionsResponse] = js.native
    def listSchemas(params: ListSchemasRequest): Request[ListSchemasResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def putCodeBinding(params: PutCodeBindingRequest): Request[PutCodeBindingResponse] = js.native
    def putResourcePolicy(params: PutResourcePolicyRequest): Request[PutResourcePolicyResponse] = js.native
    def searchSchemas(params: SearchSchemasRequest): Request[SearchSchemasResponse] = js.native
    def startDiscoverer(params: StartDiscovererRequest): Request[StartDiscovererResponse] = js.native
    def stopDiscoverer(params: StopDiscovererRequest): Request[StopDiscovererResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[js.Object] = js.native
    def untagResource(params: UntagResourceRequest): Request[js.Object] = js.native
    def updateDiscoverer(params: UpdateDiscovererRequest): Request[UpdateDiscovererResponse] = js.native
    def updateRegistry(params: UpdateRegistryRequest): Request[UpdateRegistryResponse] = js.native
    def updateSchema(params: UpdateSchemaRequest): Request[UpdateSchemaResponse] = js.native
  }

  @js.native
  sealed trait CodeGenerationStatus extends js.Any
  object CodeGenerationStatus {
    val CREATE_IN_PROGRESS = "CREATE_IN_PROGRESS".asInstanceOf[CodeGenerationStatus]
    val CREATE_COMPLETE = "CREATE_COMPLETE".asInstanceOf[CodeGenerationStatus]
    val CREATE_FAILED = "CREATE_FAILED".asInstanceOf[CodeGenerationStatus]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(CREATE_IN_PROGRESS, CREATE_COMPLETE, CREATE_FAILED))
  }

  /**
    */
  @js.native
  trait CreateDiscovererRequest extends js.Object {
    var SourceArn: __stringMin20Max1600
    var Description: js.UndefOr[__stringMin0Max256]
    var Tags: js.UndefOr[Tags]
  }

  object CreateDiscovererRequest {
    @inline
    def apply(
        SourceArn: __stringMin20Max1600,
        Description: js.UndefOr[__stringMin0Max256] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateDiscovererRequest = {
      val __obj = js.Dynamic.literal(
        "SourceArn" -> SourceArn.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDiscovererRequest]
    }
  }

  @js.native
  trait CreateDiscovererResponse extends js.Object {
    var Description: js.UndefOr[__string]
    var DiscovererArn: js.UndefOr[__string]
    var DiscovererId: js.UndefOr[__string]
    var SourceArn: js.UndefOr[__string]
    var State: js.UndefOr[DiscovererState]
    var Tags: js.UndefOr[Tags]
  }

  object CreateDiscovererResponse {
    @inline
    def apply(
        Description: js.UndefOr[__string] = js.undefined,
        DiscovererArn: js.UndefOr[__string] = js.undefined,
        DiscovererId: js.UndefOr[__string] = js.undefined,
        SourceArn: js.UndefOr[__string] = js.undefined,
        State: js.UndefOr[DiscovererState] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateDiscovererResponse = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DiscovererArn.foreach(__v => __obj.updateDynamic("DiscovererArn")(__v.asInstanceOf[js.Any]))
      DiscovererId.foreach(__v => __obj.updateDynamic("DiscovererId")(__v.asInstanceOf[js.Any]))
      SourceArn.foreach(__v => __obj.updateDynamic("SourceArn")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDiscovererResponse]
    }
  }

  @js.native
  trait CreateRegistryRequest extends js.Object {
    var RegistryName: __string
    var Description: js.UndefOr[__stringMin0Max256]
    var Tags: js.UndefOr[Tags]
  }

  object CreateRegistryRequest {
    @inline
    def apply(
        RegistryName: __string,
        Description: js.UndefOr[__stringMin0Max256] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateRegistryRequest = {
      val __obj = js.Dynamic.literal(
        "RegistryName" -> RegistryName.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRegistryRequest]
    }
  }

  @js.native
  trait CreateRegistryResponse extends js.Object {
    var Description: js.UndefOr[__string]
    var RegistryArn: js.UndefOr[__string]
    var RegistryName: js.UndefOr[__string]
    var Tags: js.UndefOr[Tags]
  }

  object CreateRegistryResponse {
    @inline
    def apply(
        Description: js.UndefOr[__string] = js.undefined,
        RegistryArn: js.UndefOr[__string] = js.undefined,
        RegistryName: js.UndefOr[__string] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateRegistryResponse = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      RegistryArn.foreach(__v => __obj.updateDynamic("RegistryArn")(__v.asInstanceOf[js.Any]))
      RegistryName.foreach(__v => __obj.updateDynamic("RegistryName")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRegistryResponse]
    }
  }

  @js.native
  trait CreateSchemaRequest extends js.Object {
    var Content: __stringMin1Max100000
    var RegistryName: __string
    var SchemaName: __string
    var Type: Type
    var Description: js.UndefOr[__stringMin0Max256]
    var Tags: js.UndefOr[Tags]
  }

  object CreateSchemaRequest {
    @inline
    def apply(
        Content: __stringMin1Max100000,
        RegistryName: __string,
        SchemaName: __string,
        Type: Type,
        Description: js.UndefOr[__stringMin0Max256] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateSchemaRequest = {
      val __obj = js.Dynamic.literal(
        "Content" -> Content.asInstanceOf[js.Any],
        "RegistryName" -> RegistryName.asInstanceOf[js.Any],
        "SchemaName" -> SchemaName.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSchemaRequest]
    }
  }

  @js.native
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

  object CreateSchemaResponse {
    @inline
    def apply(
        Description: js.UndefOr[__string] = js.undefined,
        LastModified: js.UndefOr[__timestampIso8601] = js.undefined,
        SchemaArn: js.UndefOr[__string] = js.undefined,
        SchemaName: js.UndefOr[__string] = js.undefined,
        SchemaVersion: js.UndefOr[__string] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        Type: js.UndefOr[__string] = js.undefined,
        VersionCreatedDate: js.UndefOr[__timestampIso8601] = js.undefined
    ): CreateSchemaResponse = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LastModified.foreach(__v => __obj.updateDynamic("LastModified")(__v.asInstanceOf[js.Any]))
      SchemaArn.foreach(__v => __obj.updateDynamic("SchemaArn")(__v.asInstanceOf[js.Any]))
      SchemaName.foreach(__v => __obj.updateDynamic("SchemaName")(__v.asInstanceOf[js.Any]))
      SchemaVersion.foreach(__v => __obj.updateDynamic("SchemaVersion")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      VersionCreatedDate.foreach(__v => __obj.updateDynamic("VersionCreatedDate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSchemaResponse]
    }
  }

  @js.native
  trait DeleteDiscovererRequest extends js.Object {
    var DiscovererId: __string
  }

  object DeleteDiscovererRequest {
    @inline
    def apply(
        DiscovererId: __string
    ): DeleteDiscovererRequest = {
      val __obj = js.Dynamic.literal(
        "DiscovererId" -> DiscovererId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteDiscovererRequest]
    }
  }

  @js.native
  trait DeleteRegistryRequest extends js.Object {
    var RegistryName: __string
  }

  object DeleteRegistryRequest {
    @inline
    def apply(
        RegistryName: __string
    ): DeleteRegistryRequest = {
      val __obj = js.Dynamic.literal(
        "RegistryName" -> RegistryName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteRegistryRequest]
    }
  }

  @js.native
  trait DeleteResourcePolicyRequest extends js.Object {
    var RegistryName: js.UndefOr[__string]
  }

  object DeleteResourcePolicyRequest {
    @inline
    def apply(
        RegistryName: js.UndefOr[__string] = js.undefined
    ): DeleteResourcePolicyRequest = {
      val __obj = js.Dynamic.literal()
      RegistryName.foreach(__v => __obj.updateDynamic("RegistryName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteResourcePolicyRequest]
    }
  }

  @js.native
  trait DeleteSchemaRequest extends js.Object {
    var RegistryName: __string
    var SchemaName: __string
  }

  object DeleteSchemaRequest {
    @inline
    def apply(
        RegistryName: __string,
        SchemaName: __string
    ): DeleteSchemaRequest = {
      val __obj = js.Dynamic.literal(
        "RegistryName" -> RegistryName.asInstanceOf[js.Any],
        "SchemaName" -> SchemaName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteSchemaRequest]
    }
  }

  @js.native
  trait DeleteSchemaVersionRequest extends js.Object {
    var RegistryName: __string
    var SchemaName: __string
    var SchemaVersion: __string
  }

  object DeleteSchemaVersionRequest {
    @inline
    def apply(
        RegistryName: __string,
        SchemaName: __string,
        SchemaVersion: __string
    ): DeleteSchemaVersionRequest = {
      val __obj = js.Dynamic.literal(
        "RegistryName" -> RegistryName.asInstanceOf[js.Any],
        "SchemaName" -> SchemaName.asInstanceOf[js.Any],
        "SchemaVersion" -> SchemaVersion.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteSchemaVersionRequest]
    }
  }

  @js.native
  trait DescribeCodeBindingRequest extends js.Object {
    var Language: __string
    var RegistryName: __string
    var SchemaName: __string
    var SchemaVersion: js.UndefOr[__string]
  }

  object DescribeCodeBindingRequest {
    @inline
    def apply(
        Language: __string,
        RegistryName: __string,
        SchemaName: __string,
        SchemaVersion: js.UndefOr[__string] = js.undefined
    ): DescribeCodeBindingRequest = {
      val __obj = js.Dynamic.literal(
        "Language" -> Language.asInstanceOf[js.Any],
        "RegistryName" -> RegistryName.asInstanceOf[js.Any],
        "SchemaName" -> SchemaName.asInstanceOf[js.Any]
      )

      SchemaVersion.foreach(__v => __obj.updateDynamic("SchemaVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeCodeBindingRequest]
    }
  }

  @js.native
  trait DescribeCodeBindingResponse extends js.Object {
    var CreationDate: js.UndefOr[__timestampIso8601]
    var LastModified: js.UndefOr[__timestampIso8601]
    var SchemaVersion: js.UndefOr[__string]
    var Status: js.UndefOr[CodeGenerationStatus]
  }

  object DescribeCodeBindingResponse {
    @inline
    def apply(
        CreationDate: js.UndefOr[__timestampIso8601] = js.undefined,
        LastModified: js.UndefOr[__timestampIso8601] = js.undefined,
        SchemaVersion: js.UndefOr[__string] = js.undefined,
        Status: js.UndefOr[CodeGenerationStatus] = js.undefined
    ): DescribeCodeBindingResponse = {
      val __obj = js.Dynamic.literal()
      CreationDate.foreach(__v => __obj.updateDynamic("CreationDate")(__v.asInstanceOf[js.Any]))
      LastModified.foreach(__v => __obj.updateDynamic("LastModified")(__v.asInstanceOf[js.Any]))
      SchemaVersion.foreach(__v => __obj.updateDynamic("SchemaVersion")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeCodeBindingResponse]
    }
  }

  @js.native
  trait DescribeDiscovererRequest extends js.Object {
    var DiscovererId: __string
  }

  object DescribeDiscovererRequest {
    @inline
    def apply(
        DiscovererId: __string
    ): DescribeDiscovererRequest = {
      val __obj = js.Dynamic.literal(
        "DiscovererId" -> DiscovererId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeDiscovererRequest]
    }
  }

  @js.native
  trait DescribeDiscovererResponse extends js.Object {
    var Description: js.UndefOr[__string]
    var DiscovererArn: js.UndefOr[__string]
    var DiscovererId: js.UndefOr[__string]
    var SourceArn: js.UndefOr[__string]
    var State: js.UndefOr[DiscovererState]
    var Tags: js.UndefOr[Tags]
  }

  object DescribeDiscovererResponse {
    @inline
    def apply(
        Description: js.UndefOr[__string] = js.undefined,
        DiscovererArn: js.UndefOr[__string] = js.undefined,
        DiscovererId: js.UndefOr[__string] = js.undefined,
        SourceArn: js.UndefOr[__string] = js.undefined,
        State: js.UndefOr[DiscovererState] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): DescribeDiscovererResponse = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DiscovererArn.foreach(__v => __obj.updateDynamic("DiscovererArn")(__v.asInstanceOf[js.Any]))
      DiscovererId.foreach(__v => __obj.updateDynamic("DiscovererId")(__v.asInstanceOf[js.Any]))
      SourceArn.foreach(__v => __obj.updateDynamic("SourceArn")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDiscovererResponse]
    }
  }

  @js.native
  trait DescribeRegistryRequest extends js.Object {
    var RegistryName: __string
  }

  object DescribeRegistryRequest {
    @inline
    def apply(
        RegistryName: __string
    ): DescribeRegistryRequest = {
      val __obj = js.Dynamic.literal(
        "RegistryName" -> RegistryName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeRegistryRequest]
    }
  }

  @js.native
  trait DescribeRegistryResponse extends js.Object {
    var Description: js.UndefOr[__string]
    var RegistryArn: js.UndefOr[__string]
    var RegistryName: js.UndefOr[__string]
    var Tags: js.UndefOr[Tags]
  }

  object DescribeRegistryResponse {
    @inline
    def apply(
        Description: js.UndefOr[__string] = js.undefined,
        RegistryArn: js.UndefOr[__string] = js.undefined,
        RegistryName: js.UndefOr[__string] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): DescribeRegistryResponse = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      RegistryArn.foreach(__v => __obj.updateDynamic("RegistryArn")(__v.asInstanceOf[js.Any]))
      RegistryName.foreach(__v => __obj.updateDynamic("RegistryName")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRegistryResponse]
    }
  }

  @js.native
  trait DescribeSchemaRequest extends js.Object {
    var RegistryName: __string
    var SchemaName: __string
    var SchemaVersion: js.UndefOr[__string]
  }

  object DescribeSchemaRequest {
    @inline
    def apply(
        RegistryName: __string,
        SchemaName: __string,
        SchemaVersion: js.UndefOr[__string] = js.undefined
    ): DescribeSchemaRequest = {
      val __obj = js.Dynamic.literal(
        "RegistryName" -> RegistryName.asInstanceOf[js.Any],
        "SchemaName" -> SchemaName.asInstanceOf[js.Any]
      )

      SchemaVersion.foreach(__v => __obj.updateDynamic("SchemaVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSchemaRequest]
    }
  }

  @js.native
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

  object DescribeSchemaResponse {
    @inline
    def apply(
        Content: js.UndefOr[__string] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        LastModified: js.UndefOr[__timestampIso8601] = js.undefined,
        SchemaArn: js.UndefOr[__string] = js.undefined,
        SchemaName: js.UndefOr[__string] = js.undefined,
        SchemaVersion: js.UndefOr[__string] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        Type: js.UndefOr[__string] = js.undefined,
        VersionCreatedDate: js.UndefOr[__timestampIso8601] = js.undefined
    ): DescribeSchemaResponse = {
      val __obj = js.Dynamic.literal()
      Content.foreach(__v => __obj.updateDynamic("Content")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LastModified.foreach(__v => __obj.updateDynamic("LastModified")(__v.asInstanceOf[js.Any]))
      SchemaArn.foreach(__v => __obj.updateDynamic("SchemaArn")(__v.asInstanceOf[js.Any]))
      SchemaName.foreach(__v => __obj.updateDynamic("SchemaName")(__v.asInstanceOf[js.Any]))
      SchemaVersion.foreach(__v => __obj.updateDynamic("SchemaVersion")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      VersionCreatedDate.foreach(__v => __obj.updateDynamic("VersionCreatedDate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSchemaResponse]
    }
  }

  @js.native
  sealed trait DiscovererState extends js.Any
  object DiscovererState {
    val STARTED = "STARTED".asInstanceOf[DiscovererState]
    val STOPPED = "STOPPED".asInstanceOf[DiscovererState]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(STARTED, STOPPED))
  }

  @js.native
  trait DiscovererSummary extends js.Object {
    var DiscovererArn: js.UndefOr[__string]
    var DiscovererId: js.UndefOr[__string]
    var SourceArn: js.UndefOr[__string]
    var State: js.UndefOr[DiscovererState]
    var Tags: js.UndefOr[Tags]
  }

  object DiscovererSummary {
    @inline
    def apply(
        DiscovererArn: js.UndefOr[__string] = js.undefined,
        DiscovererId: js.UndefOr[__string] = js.undefined,
        SourceArn: js.UndefOr[__string] = js.undefined,
        State: js.UndefOr[DiscovererState] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): DiscovererSummary = {
      val __obj = js.Dynamic.literal()
      DiscovererArn.foreach(__v => __obj.updateDynamic("DiscovererArn")(__v.asInstanceOf[js.Any]))
      DiscovererId.foreach(__v => __obj.updateDynamic("DiscovererId")(__v.asInstanceOf[js.Any]))
      SourceArn.foreach(__v => __obj.updateDynamic("SourceArn")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DiscovererSummary]
    }
  }

  @js.native
  trait GetCodeBindingSourceRequest extends js.Object {
    var Language: __string
    var RegistryName: __string
    var SchemaName: __string
    var SchemaVersion: js.UndefOr[__string]
  }

  object GetCodeBindingSourceRequest {
    @inline
    def apply(
        Language: __string,
        RegistryName: __string,
        SchemaName: __string,
        SchemaVersion: js.UndefOr[__string] = js.undefined
    ): GetCodeBindingSourceRequest = {
      val __obj = js.Dynamic.literal(
        "Language" -> Language.asInstanceOf[js.Any],
        "RegistryName" -> RegistryName.asInstanceOf[js.Any],
        "SchemaName" -> SchemaName.asInstanceOf[js.Any]
      )

      SchemaVersion.foreach(__v => __obj.updateDynamic("SchemaVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCodeBindingSourceRequest]
    }
  }

  @js.native
  trait GetCodeBindingSourceResponse extends js.Object {
    var Body: js.UndefOr[Body]
  }

  object GetCodeBindingSourceResponse {
    @inline
    def apply(
        Body: js.UndefOr[Body] = js.undefined
    ): GetCodeBindingSourceResponse = {
      val __obj = js.Dynamic.literal()
      Body.foreach(__v => __obj.updateDynamic("Body")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCodeBindingSourceResponse]
    }
  }

  @js.native
  trait GetDiscoveredSchemaRequest extends js.Object {
    var Events: __listOfGetDiscoveredSchemaVersionItemInput
    var Type: Type
  }

  object GetDiscoveredSchemaRequest {
    @inline
    def apply(
        Events: __listOfGetDiscoveredSchemaVersionItemInput,
        Type: Type
    ): GetDiscoveredSchemaRequest = {
      val __obj = js.Dynamic.literal(
        "Events" -> Events.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetDiscoveredSchemaRequest]
    }
  }

  @js.native
  trait GetDiscoveredSchemaResponse extends js.Object {
    var Content: js.UndefOr[__string]
  }

  object GetDiscoveredSchemaResponse {
    @inline
    def apply(
        Content: js.UndefOr[__string] = js.undefined
    ): GetDiscoveredSchemaResponse = {
      val __obj = js.Dynamic.literal()
      Content.foreach(__v => __obj.updateDynamic("Content")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDiscoveredSchemaResponse]
    }
  }

  @js.native
  trait GetResourcePolicyRequest extends js.Object {
    var RegistryName: js.UndefOr[__string]
  }

  object GetResourcePolicyRequest {
    @inline
    def apply(
        RegistryName: js.UndefOr[__string] = js.undefined
    ): GetResourcePolicyRequest = {
      val __obj = js.Dynamic.literal()
      RegistryName.foreach(__v => __obj.updateDynamic("RegistryName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetResourcePolicyRequest]
    }
  }

  @js.native
  trait GetResourcePolicyResponse extends js.Object {
    var Policy: js.UndefOr[__string]
    var RevisionId: js.UndefOr[__string]
  }

  object GetResourcePolicyResponse {
    @inline
    def apply(
        Policy: js.UndefOr[__string] = js.undefined,
        RevisionId: js.UndefOr[__string] = js.undefined
    ): GetResourcePolicyResponse = {
      val __obj = js.Dynamic.literal()
      Policy.foreach(__v => __obj.updateDynamic("Policy")(__v.asInstanceOf[js.Any]))
      RevisionId.foreach(__v => __obj.updateDynamic("RevisionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetResourcePolicyResponse]
    }
  }

  @js.native
  trait ListDiscoverersRequest extends js.Object {
    var DiscovererIdPrefix: js.UndefOr[__string]
    var Limit: js.UndefOr[__integer]
    var NextToken: js.UndefOr[__string]
    var SourceArnPrefix: js.UndefOr[__string]
  }

  object ListDiscoverersRequest {
    @inline
    def apply(
        DiscovererIdPrefix: js.UndefOr[__string] = js.undefined,
        Limit: js.UndefOr[__integer] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined,
        SourceArnPrefix: js.UndefOr[__string] = js.undefined
    ): ListDiscoverersRequest = {
      val __obj = js.Dynamic.literal()
      DiscovererIdPrefix.foreach(__v => __obj.updateDynamic("DiscovererIdPrefix")(__v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SourceArnPrefix.foreach(__v => __obj.updateDynamic("SourceArnPrefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDiscoverersRequest]
    }
  }

  @js.native
  trait ListDiscoverersResponse extends js.Object {
    var Discoverers: js.UndefOr[__listOfDiscovererSummary]
    var NextToken: js.UndefOr[__string]
  }

  object ListDiscoverersResponse {
    @inline
    def apply(
        Discoverers: js.UndefOr[__listOfDiscovererSummary] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListDiscoverersResponse = {
      val __obj = js.Dynamic.literal()
      Discoverers.foreach(__v => __obj.updateDynamic("Discoverers")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDiscoverersResponse]
    }
  }

  @js.native
  trait ListRegistriesRequest extends js.Object {
    var Limit: js.UndefOr[__integer]
    var NextToken: js.UndefOr[__string]
    var RegistryNamePrefix: js.UndefOr[__string]
    var Scope: js.UndefOr[__string]
  }

  object ListRegistriesRequest {
    @inline
    def apply(
        Limit: js.UndefOr[__integer] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined,
        RegistryNamePrefix: js.UndefOr[__string] = js.undefined,
        Scope: js.UndefOr[__string] = js.undefined
    ): ListRegistriesRequest = {
      val __obj = js.Dynamic.literal()
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RegistryNamePrefix.foreach(__v => __obj.updateDynamic("RegistryNamePrefix")(__v.asInstanceOf[js.Any]))
      Scope.foreach(__v => __obj.updateDynamic("Scope")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRegistriesRequest]
    }
  }

  @js.native
  trait ListRegistriesResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var Registries: js.UndefOr[__listOfRegistrySummary]
  }

  object ListRegistriesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[__string] = js.undefined,
        Registries: js.UndefOr[__listOfRegistrySummary] = js.undefined
    ): ListRegistriesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Registries.foreach(__v => __obj.updateDynamic("Registries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRegistriesResponse]
    }
  }

  @js.native
  trait ListSchemaVersionsRequest extends js.Object {
    var RegistryName: __string
    var SchemaName: __string
    var Limit: js.UndefOr[__integer]
    var NextToken: js.UndefOr[__string]
  }

  object ListSchemaVersionsRequest {
    @inline
    def apply(
        RegistryName: __string,
        SchemaName: __string,
        Limit: js.UndefOr[__integer] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListSchemaVersionsRequest = {
      val __obj = js.Dynamic.literal(
        "RegistryName" -> RegistryName.asInstanceOf[js.Any],
        "SchemaName" -> SchemaName.asInstanceOf[js.Any]
      )

      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSchemaVersionsRequest]
    }
  }

  @js.native
  trait ListSchemaVersionsResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var SchemaVersions: js.UndefOr[__listOfSchemaVersionSummary]
  }

  object ListSchemaVersionsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[__string] = js.undefined,
        SchemaVersions: js.UndefOr[__listOfSchemaVersionSummary] = js.undefined
    ): ListSchemaVersionsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SchemaVersions.foreach(__v => __obj.updateDynamic("SchemaVersions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSchemaVersionsResponse]
    }
  }

  @js.native
  trait ListSchemasRequest extends js.Object {
    var RegistryName: __string
    var Limit: js.UndefOr[__integer]
    var NextToken: js.UndefOr[__string]
    var SchemaNamePrefix: js.UndefOr[__string]
  }

  object ListSchemasRequest {
    @inline
    def apply(
        RegistryName: __string,
        Limit: js.UndefOr[__integer] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined,
        SchemaNamePrefix: js.UndefOr[__string] = js.undefined
    ): ListSchemasRequest = {
      val __obj = js.Dynamic.literal(
        "RegistryName" -> RegistryName.asInstanceOf[js.Any]
      )

      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SchemaNamePrefix.foreach(__v => __obj.updateDynamic("SchemaNamePrefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSchemasRequest]
    }
  }

  @js.native
  trait ListSchemasResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var Schemas: js.UndefOr[__listOfSchemaSummary]
  }

  object ListSchemasResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[__string] = js.undefined,
        Schemas: js.UndefOr[__listOfSchemaSummary] = js.undefined
    ): ListSchemasResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Schemas.foreach(__v => __obj.updateDynamic("Schemas")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSchemasResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: __string
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceArn: __string
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[Tags]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        Tags: js.UndefOr[Tags] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  @js.native
  trait PutCodeBindingRequest extends js.Object {
    var Language: __string
    var RegistryName: __string
    var SchemaName: __string
    var SchemaVersion: js.UndefOr[__string]
  }

  object PutCodeBindingRequest {
    @inline
    def apply(
        Language: __string,
        RegistryName: __string,
        SchemaName: __string,
        SchemaVersion: js.UndefOr[__string] = js.undefined
    ): PutCodeBindingRequest = {
      val __obj = js.Dynamic.literal(
        "Language" -> Language.asInstanceOf[js.Any],
        "RegistryName" -> RegistryName.asInstanceOf[js.Any],
        "SchemaName" -> SchemaName.asInstanceOf[js.Any]
      )

      SchemaVersion.foreach(__v => __obj.updateDynamic("SchemaVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutCodeBindingRequest]
    }
  }

  @js.native
  trait PutCodeBindingResponse extends js.Object {
    var CreationDate: js.UndefOr[__timestampIso8601]
    var LastModified: js.UndefOr[__timestampIso8601]
    var SchemaVersion: js.UndefOr[__string]
    var Status: js.UndefOr[CodeGenerationStatus]
  }

  object PutCodeBindingResponse {
    @inline
    def apply(
        CreationDate: js.UndefOr[__timestampIso8601] = js.undefined,
        LastModified: js.UndefOr[__timestampIso8601] = js.undefined,
        SchemaVersion: js.UndefOr[__string] = js.undefined,
        Status: js.UndefOr[CodeGenerationStatus] = js.undefined
    ): PutCodeBindingResponse = {
      val __obj = js.Dynamic.literal()
      CreationDate.foreach(__v => __obj.updateDynamic("CreationDate")(__v.asInstanceOf[js.Any]))
      LastModified.foreach(__v => __obj.updateDynamic("LastModified")(__v.asInstanceOf[js.Any]))
      SchemaVersion.foreach(__v => __obj.updateDynamic("SchemaVersion")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutCodeBindingResponse]
    }
  }

  /**
    * The name of the policy.
    */
  @js.native
  trait PutResourcePolicyRequest extends js.Object {
    var Policy: __string
    var RegistryName: js.UndefOr[__string]
    var RevisionId: js.UndefOr[__string]
  }

  object PutResourcePolicyRequest {
    @inline
    def apply(
        Policy: __string,
        RegistryName: js.UndefOr[__string] = js.undefined,
        RevisionId: js.UndefOr[__string] = js.undefined
    ): PutResourcePolicyRequest = {
      val __obj = js.Dynamic.literal(
        "Policy" -> Policy.asInstanceOf[js.Any]
      )

      RegistryName.foreach(__v => __obj.updateDynamic("RegistryName")(__v.asInstanceOf[js.Any]))
      RevisionId.foreach(__v => __obj.updateDynamic("RevisionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutResourcePolicyRequest]
    }
  }

  @js.native
  trait PutResourcePolicyResponse extends js.Object {
    var Policy: js.UndefOr[__string]
    var RevisionId: js.UndefOr[__string]
  }

  object PutResourcePolicyResponse {
    @inline
    def apply(
        Policy: js.UndefOr[__string] = js.undefined,
        RevisionId: js.UndefOr[__string] = js.undefined
    ): PutResourcePolicyResponse = {
      val __obj = js.Dynamic.literal()
      Policy.foreach(__v => __obj.updateDynamic("Policy")(__v.asInstanceOf[js.Any]))
      RevisionId.foreach(__v => __obj.updateDynamic("RevisionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutResourcePolicyResponse]
    }
  }

  @js.native
  trait RegistrySummary extends js.Object {
    var RegistryArn: js.UndefOr[__string]
    var RegistryName: js.UndefOr[__string]
    var Tags: js.UndefOr[Tags]
  }

  object RegistrySummary {
    @inline
    def apply(
        RegistryArn: js.UndefOr[__string] = js.undefined,
        RegistryName: js.UndefOr[__string] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): RegistrySummary = {
      val __obj = js.Dynamic.literal()
      RegistryArn.foreach(__v => __obj.updateDynamic("RegistryArn")(__v.asInstanceOf[js.Any]))
      RegistryName.foreach(__v => __obj.updateDynamic("RegistryName")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegistrySummary]
    }
  }

  /**
    * A summary of schema details.
    */
  @js.native
  trait SchemaSummary extends js.Object {
    var LastModified: js.UndefOr[__timestampIso8601]
    var SchemaArn: js.UndefOr[__string]
    var SchemaName: js.UndefOr[__string]
    var Tags: js.UndefOr[Tags]
    var VersionCount: js.UndefOr[__long]
  }

  object SchemaSummary {
    @inline
    def apply(
        LastModified: js.UndefOr[__timestampIso8601] = js.undefined,
        SchemaArn: js.UndefOr[__string] = js.undefined,
        SchemaName: js.UndefOr[__string] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        VersionCount: js.UndefOr[__long] = js.undefined
    ): SchemaSummary = {
      val __obj = js.Dynamic.literal()
      LastModified.foreach(__v => __obj.updateDynamic("LastModified")(__v.asInstanceOf[js.Any]))
      SchemaArn.foreach(__v => __obj.updateDynamic("SchemaArn")(__v.asInstanceOf[js.Any]))
      SchemaName.foreach(__v => __obj.updateDynamic("SchemaName")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      VersionCount.foreach(__v => __obj.updateDynamic("VersionCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SchemaSummary]
    }
  }

  @js.native
  trait SchemaVersionSummary extends js.Object {
    var SchemaArn: js.UndefOr[__string]
    var SchemaName: js.UndefOr[__string]
    var SchemaVersion: js.UndefOr[__string]
  }

  object SchemaVersionSummary {
    @inline
    def apply(
        SchemaArn: js.UndefOr[__string] = js.undefined,
        SchemaName: js.UndefOr[__string] = js.undefined,
        SchemaVersion: js.UndefOr[__string] = js.undefined
    ): SchemaVersionSummary = {
      val __obj = js.Dynamic.literal()
      SchemaArn.foreach(__v => __obj.updateDynamic("SchemaArn")(__v.asInstanceOf[js.Any]))
      SchemaName.foreach(__v => __obj.updateDynamic("SchemaName")(__v.asInstanceOf[js.Any]))
      SchemaVersion.foreach(__v => __obj.updateDynamic("SchemaVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SchemaVersionSummary]
    }
  }

  @js.native
  trait SearchSchemaSummary extends js.Object {
    var RegistryName: js.UndefOr[__string]
    var SchemaArn: js.UndefOr[__string]
    var SchemaName: js.UndefOr[__string]
    var SchemaVersions: js.UndefOr[__listOfSearchSchemaVersionSummary]
  }

  object SearchSchemaSummary {
    @inline
    def apply(
        RegistryName: js.UndefOr[__string] = js.undefined,
        SchemaArn: js.UndefOr[__string] = js.undefined,
        SchemaName: js.UndefOr[__string] = js.undefined,
        SchemaVersions: js.UndefOr[__listOfSearchSchemaVersionSummary] = js.undefined
    ): SearchSchemaSummary = {
      val __obj = js.Dynamic.literal()
      RegistryName.foreach(__v => __obj.updateDynamic("RegistryName")(__v.asInstanceOf[js.Any]))
      SchemaArn.foreach(__v => __obj.updateDynamic("SchemaArn")(__v.asInstanceOf[js.Any]))
      SchemaName.foreach(__v => __obj.updateDynamic("SchemaName")(__v.asInstanceOf[js.Any]))
      SchemaVersions.foreach(__v => __obj.updateDynamic("SchemaVersions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchSchemaSummary]
    }
  }

  @js.native
  trait SearchSchemaVersionSummary extends js.Object {
    var CreatedDate: js.UndefOr[__timestampIso8601]
    var SchemaVersion: js.UndefOr[__string]
  }

  object SearchSchemaVersionSummary {
    @inline
    def apply(
        CreatedDate: js.UndefOr[__timestampIso8601] = js.undefined,
        SchemaVersion: js.UndefOr[__string] = js.undefined
    ): SearchSchemaVersionSummary = {
      val __obj = js.Dynamic.literal()
      CreatedDate.foreach(__v => __obj.updateDynamic("CreatedDate")(__v.asInstanceOf[js.Any]))
      SchemaVersion.foreach(__v => __obj.updateDynamic("SchemaVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchSchemaVersionSummary]
    }
  }

  @js.native
  trait SearchSchemasRequest extends js.Object {
    var Keywords: __string
    var RegistryName: __string
    var Limit: js.UndefOr[__integer]
    var NextToken: js.UndefOr[__string]
  }

  object SearchSchemasRequest {
    @inline
    def apply(
        Keywords: __string,
        RegistryName: __string,
        Limit: js.UndefOr[__integer] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): SearchSchemasRequest = {
      val __obj = js.Dynamic.literal(
        "Keywords" -> Keywords.asInstanceOf[js.Any],
        "RegistryName" -> RegistryName.asInstanceOf[js.Any]
      )

      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchSchemasRequest]
    }
  }

  @js.native
  trait SearchSchemasResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var Schemas: js.UndefOr[__listOfSearchSchemaSummary]
  }

  object SearchSchemasResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[__string] = js.undefined,
        Schemas: js.UndefOr[__listOfSearchSchemaSummary] = js.undefined
    ): SearchSchemasResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Schemas.foreach(__v => __obj.updateDynamic("Schemas")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchSchemasResponse]
    }
  }

  @js.native
  trait StartDiscovererRequest extends js.Object {
    var DiscovererId: __string
  }

  object StartDiscovererRequest {
    @inline
    def apply(
        DiscovererId: __string
    ): StartDiscovererRequest = {
      val __obj = js.Dynamic.literal(
        "DiscovererId" -> DiscovererId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StartDiscovererRequest]
    }
  }

  @js.native
  trait StartDiscovererResponse extends js.Object {
    var DiscovererId: js.UndefOr[__string]
    var State: js.UndefOr[DiscovererState]
  }

  object StartDiscovererResponse {
    @inline
    def apply(
        DiscovererId: js.UndefOr[__string] = js.undefined,
        State: js.UndefOr[DiscovererState] = js.undefined
    ): StartDiscovererResponse = {
      val __obj = js.Dynamic.literal()
      DiscovererId.foreach(__v => __obj.updateDynamic("DiscovererId")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartDiscovererResponse]
    }
  }

  @js.native
  trait StopDiscovererRequest extends js.Object {
    var DiscovererId: __string
  }

  object StopDiscovererRequest {
    @inline
    def apply(
        DiscovererId: __string
    ): StopDiscovererRequest = {
      val __obj = js.Dynamic.literal(
        "DiscovererId" -> DiscovererId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StopDiscovererRequest]
    }
  }

  @js.native
  trait StopDiscovererResponse extends js.Object {
    var DiscovererId: js.UndefOr[__string]
    var State: js.UndefOr[DiscovererState]
  }

  object StopDiscovererResponse {
    @inline
    def apply(
        DiscovererId: js.UndefOr[__string] = js.undefined,
        State: js.UndefOr[DiscovererState] = js.undefined
    ): StopDiscovererResponse = {
      val __obj = js.Dynamic.literal()
      DiscovererId.foreach(__v => __obj.updateDynamic("DiscovererId")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopDiscovererResponse]
    }
  }

  /**
    */
  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: __string
    var Tags: Tags
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceArn: __string,
        Tags: Tags
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  sealed trait Type extends js.Any
  object Type {
    val OpenApi3 = "OpenApi3".asInstanceOf[Type]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(OpenApi3))
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: __string
    var TagKeys: __listOf__string
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceArn: __string,
        TagKeys: __listOf__string
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UpdateDiscovererRequest extends js.Object {
    var DiscovererId: __string
    var Description: js.UndefOr[__stringMin0Max256]
  }

  object UpdateDiscovererRequest {
    @inline
    def apply(
        DiscovererId: __string,
        Description: js.UndefOr[__stringMin0Max256] = js.undefined
    ): UpdateDiscovererRequest = {
      val __obj = js.Dynamic.literal(
        "DiscovererId" -> DiscovererId.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDiscovererRequest]
    }
  }

  @js.native
  trait UpdateDiscovererResponse extends js.Object {
    var Description: js.UndefOr[__string]
    var DiscovererArn: js.UndefOr[__string]
    var DiscovererId: js.UndefOr[__string]
    var SourceArn: js.UndefOr[__string]
    var State: js.UndefOr[DiscovererState]
    var Tags: js.UndefOr[Tags]
  }

  object UpdateDiscovererResponse {
    @inline
    def apply(
        Description: js.UndefOr[__string] = js.undefined,
        DiscovererArn: js.UndefOr[__string] = js.undefined,
        DiscovererId: js.UndefOr[__string] = js.undefined,
        SourceArn: js.UndefOr[__string] = js.undefined,
        State: js.UndefOr[DiscovererState] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): UpdateDiscovererResponse = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DiscovererArn.foreach(__v => __obj.updateDynamic("DiscovererArn")(__v.asInstanceOf[js.Any]))
      DiscovererId.foreach(__v => __obj.updateDynamic("DiscovererId")(__v.asInstanceOf[js.Any]))
      SourceArn.foreach(__v => __obj.updateDynamic("SourceArn")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDiscovererResponse]
    }
  }

  /**
    * Updates the registry.
    */
  @js.native
  trait UpdateRegistryRequest extends js.Object {
    var RegistryName: __string
    var Description: js.UndefOr[__stringMin0Max256]
  }

  object UpdateRegistryRequest {
    @inline
    def apply(
        RegistryName: __string,
        Description: js.UndefOr[__stringMin0Max256] = js.undefined
    ): UpdateRegistryRequest = {
      val __obj = js.Dynamic.literal(
        "RegistryName" -> RegistryName.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRegistryRequest]
    }
  }

  @js.native
  trait UpdateRegistryResponse extends js.Object {
    var Description: js.UndefOr[__string]
    var RegistryArn: js.UndefOr[__string]
    var RegistryName: js.UndefOr[__string]
    var Tags: js.UndefOr[Tags]
  }

  object UpdateRegistryResponse {
    @inline
    def apply(
        Description: js.UndefOr[__string] = js.undefined,
        RegistryArn: js.UndefOr[__string] = js.undefined,
        RegistryName: js.UndefOr[__string] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): UpdateRegistryResponse = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      RegistryArn.foreach(__v => __obj.updateDynamic("RegistryArn")(__v.asInstanceOf[js.Any]))
      RegistryName.foreach(__v => __obj.updateDynamic("RegistryName")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRegistryResponse]
    }
  }

  @js.native
  trait UpdateSchemaRequest extends js.Object {
    var RegistryName: __string
    var SchemaName: __string
    var ClientTokenId: js.UndefOr[__stringMin0Max36]
    var Content: js.UndefOr[__stringMin1Max100000]
    var Description: js.UndefOr[__stringMin0Max256]
    var Type: js.UndefOr[Type]
  }

  object UpdateSchemaRequest {
    @inline
    def apply(
        RegistryName: __string,
        SchemaName: __string,
        ClientTokenId: js.UndefOr[__stringMin0Max36] = js.undefined,
        Content: js.UndefOr[__stringMin1Max100000] = js.undefined,
        Description: js.UndefOr[__stringMin0Max256] = js.undefined,
        Type: js.UndefOr[Type] = js.undefined
    ): UpdateSchemaRequest = {
      val __obj = js.Dynamic.literal(
        "RegistryName" -> RegistryName.asInstanceOf[js.Any],
        "SchemaName" -> SchemaName.asInstanceOf[js.Any]
      )

      ClientTokenId.foreach(__v => __obj.updateDynamic("ClientTokenId")(__v.asInstanceOf[js.Any]))
      Content.foreach(__v => __obj.updateDynamic("Content")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSchemaRequest]
    }
  }

  @js.native
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

  object UpdateSchemaResponse {
    @inline
    def apply(
        Description: js.UndefOr[__string] = js.undefined,
        LastModified: js.UndefOr[__timestampIso8601] = js.undefined,
        SchemaArn: js.UndefOr[__string] = js.undefined,
        SchemaName: js.UndefOr[__string] = js.undefined,
        SchemaVersion: js.UndefOr[__string] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        Type: js.UndefOr[__string] = js.undefined,
        VersionCreatedDate: js.UndefOr[__timestampIso8601] = js.undefined
    ): UpdateSchemaResponse = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LastModified.foreach(__v => __obj.updateDynamic("LastModified")(__v.asInstanceOf[js.Any]))
      SchemaArn.foreach(__v => __obj.updateDynamic("SchemaArn")(__v.asInstanceOf[js.Any]))
      SchemaName.foreach(__v => __obj.updateDynamic("SchemaName")(__v.asInstanceOf[js.Any]))
      SchemaVersion.foreach(__v => __obj.updateDynamic("SchemaVersion")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      VersionCreatedDate.foreach(__v => __obj.updateDynamic("VersionCreatedDate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSchemaResponse]
    }
  }
}
