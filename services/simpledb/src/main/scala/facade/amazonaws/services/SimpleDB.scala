package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object simpledb {
  type AttributeList            = js.Array[Attribute]
  type AttributeNameList        = js.Array[String]
  type DeletableAttributeList   = js.Array[DeletableAttribute]
  type DeletableItemList        = js.Array[DeletableItem]
  type DomainNameList           = js.Array[String]
  type ItemList                 = js.Array[Item]
  type ReplaceableAttributeList = js.Array[ReplaceableAttribute]
  type ReplaceableItemList      = js.Array[ReplaceableItem]

  implicit final class SimpleDBOps(private val service: SimpleDB) extends AnyVal {

    def batchDeleteAttributesFuture(params: BatchDeleteAttributesRequest): Future[js.Object] =
      service.batchDeleteAttributes(params).promise.toFuture
    def batchPutAttributesFuture(params: BatchPutAttributesRequest): Future[js.Object] =
      service.batchPutAttributes(params).promise.toFuture
    def createDomainFuture(params: CreateDomainRequest): Future[js.Object] =
      service.createDomain(params).promise.toFuture
    def deleteAttributesFuture(params: DeleteAttributesRequest): Future[js.Object] =
      service.deleteAttributes(params).promise.toFuture
    def deleteDomainFuture(params: DeleteDomainRequest): Future[js.Object] =
      service.deleteDomain(params).promise.toFuture
    def domainMetadataFuture(params: DomainMetadataRequest): Future[DomainMetadataResult] =
      service.domainMetadata(params).promise.toFuture
    def getAttributesFuture(params: GetAttributesRequest): Future[GetAttributesResult] =
      service.getAttributes(params).promise.toFuture
    def listDomainsFuture(params: ListDomainsRequest): Future[ListDomainsResult] =
      service.listDomains(params).promise.toFuture
    def putAttributesFuture(params: PutAttributesRequest): Future[js.Object] =
      service.putAttributes(params).promise.toFuture
    def selectFuture(params: SelectRequest): Future[SelectResult] = service.select(params).promise.toFuture
  }
}

package simpledb {
  @js.native
  @JSImport("aws-sdk", "SimpleDB")
  class SimpleDB() extends js.Object {
    def this(config: AWSConfig) = this()

    def batchDeleteAttributes(params: BatchDeleteAttributesRequest): Request[js.Object] = js.native
    def batchPutAttributes(params: BatchPutAttributesRequest): Request[js.Object]       = js.native
    def createDomain(params: CreateDomainRequest): Request[js.Object]                   = js.native
    def deleteAttributes(params: DeleteAttributesRequest): Request[js.Object]           = js.native
    def deleteDomain(params: DeleteDomainRequest): Request[js.Object]                   = js.native
    def domainMetadata(params: DomainMetadataRequest): Request[DomainMetadataResult]    = js.native
    def getAttributes(params: GetAttributesRequest): Request[GetAttributesResult]       = js.native
    def listDomains(params: ListDomainsRequest): Request[ListDomainsResult]             = js.native
    def putAttributes(params: PutAttributesRequest): Request[js.Object]                 = js.native
    def select(params: SelectRequest): Request[SelectResult]                            = js.native
  }

  /**
    *
    */
  @js.native
  trait Attribute extends js.Object {
    var Name: String
    var Value: String
    var AlternateNameEncoding: js.UndefOr[String]
    var AlternateValueEncoding: js.UndefOr[String]
  }

  object Attribute {
    def apply(
        Name: String,
        Value: String,
        AlternateNameEncoding: js.UndefOr[String] = js.undefined,
        AlternateValueEncoding: js.UndefOr[String] = js.undefined
    ): Attribute = {
      val __obj = js.Dictionary[js.Any](
        "Name"  -> Name.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )

      AlternateNameEncoding.foreach(__v => __obj.update("AlternateNameEncoding", __v.asInstanceOf[js.Any]))
      AlternateValueEncoding.foreach(__v => __obj.update("AlternateValueEncoding", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Attribute]
    }
  }

  /**
    * The specified attribute does not exist.
    */
  @js.native
  trait AttributeDoesNotExistException extends js.Object {
    val BoxUsage: Float
  }

  @js.native
  trait BatchDeleteAttributesRequest extends js.Object {
    var DomainName: String
    var Items: DeletableItemList
  }

  object BatchDeleteAttributesRequest {
    def apply(
        DomainName: String,
        Items: DeletableItemList
    ): BatchDeleteAttributesRequest = {
      val __obj = js.Dictionary[js.Any](
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "Items"      -> Items.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BatchDeleteAttributesRequest]
    }
  }

  @js.native
  trait BatchPutAttributesRequest extends js.Object {
    var DomainName: String
    var Items: ReplaceableItemList
  }

  object BatchPutAttributesRequest {
    def apply(
        DomainName: String,
        Items: ReplaceableItemList
    ): BatchPutAttributesRequest = {
      val __obj = js.Dictionary[js.Any](
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "Items"      -> Items.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BatchPutAttributesRequest]
    }
  }

  @js.native
  trait CreateDomainRequest extends js.Object {
    var DomainName: String
  }

  object CreateDomainRequest {
    def apply(
        DomainName: String
    ): CreateDomainRequest = {
      val __obj = js.Dictionary[js.Any](
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateDomainRequest]
    }
  }

  /**
    *
    */
  @js.native
  trait DeletableAttribute extends js.Object {
    var Name: String
    var Value: js.UndefOr[String]
  }

  object DeletableAttribute {
    def apply(
        Name: String,
        Value: js.UndefOr[String] = js.undefined
    ): DeletableAttribute = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Value.foreach(__v => __obj.update("Value", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeletableAttribute]
    }
  }

  @js.native
  trait DeletableItem extends js.Object {
    var Name: String
    var Attributes: js.UndefOr[DeletableAttributeList]
  }

  object DeletableItem {
    def apply(
        Name: String,
        Attributes: js.UndefOr[DeletableAttributeList] = js.undefined
    ): DeletableItem = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Attributes.foreach(__v => __obj.update("Attributes", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeletableItem]
    }
  }

  @js.native
  trait DeleteAttributesRequest extends js.Object {
    var DomainName: String
    var ItemName: String
    var Attributes: js.UndefOr[DeletableAttributeList]
    var Expected: js.UndefOr[UpdateCondition]
  }

  object DeleteAttributesRequest {
    def apply(
        DomainName: String,
        ItemName: String,
        Attributes: js.UndefOr[DeletableAttributeList] = js.undefined,
        Expected: js.UndefOr[UpdateCondition] = js.undefined
    ): DeleteAttributesRequest = {
      val __obj = js.Dictionary[js.Any](
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "ItemName"   -> ItemName.asInstanceOf[js.Any]
      )

      Attributes.foreach(__v => __obj.update("Attributes", __v.asInstanceOf[js.Any]))
      Expected.foreach(__v => __obj.update("Expected", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteAttributesRequest]
    }
  }

  @js.native
  trait DeleteDomainRequest extends js.Object {
    var DomainName: String
  }

  object DeleteDomainRequest {
    def apply(
        DomainName: String
    ): DeleteDomainRequest = {
      val __obj = js.Dictionary[js.Any](
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteDomainRequest]
    }
  }

  @js.native
  trait DomainMetadataRequest extends js.Object {
    var DomainName: String
  }

  object DomainMetadataRequest {
    def apply(
        DomainName: String
    ): DomainMetadataRequest = {
      val __obj = js.Dictionary[js.Any](
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DomainMetadataRequest]
    }
  }

  @js.native
  trait DomainMetadataResult extends js.Object {
    var AttributeNameCount: js.UndefOr[Int]
    var AttributeNamesSizeBytes: js.UndefOr[Double]
    var AttributeValueCount: js.UndefOr[Int]
    var AttributeValuesSizeBytes: js.UndefOr[Double]
    var ItemCount: js.UndefOr[Int]
    var ItemNamesSizeBytes: js.UndefOr[Double]
    var Timestamp: js.UndefOr[Int]
  }

  object DomainMetadataResult {
    def apply(
        AttributeNameCount: js.UndefOr[Int] = js.undefined,
        AttributeNamesSizeBytes: js.UndefOr[Double] = js.undefined,
        AttributeValueCount: js.UndefOr[Int] = js.undefined,
        AttributeValuesSizeBytes: js.UndefOr[Double] = js.undefined,
        ItemCount: js.UndefOr[Int] = js.undefined,
        ItemNamesSizeBytes: js.UndefOr[Double] = js.undefined,
        Timestamp: js.UndefOr[Int] = js.undefined
    ): DomainMetadataResult = {
      val __obj = js.Dictionary.empty[js.Any]
      AttributeNameCount.foreach(__v => __obj.update("AttributeNameCount", __v.asInstanceOf[js.Any]))
      AttributeNamesSizeBytes.foreach(__v => __obj.update("AttributeNamesSizeBytes", __v.asInstanceOf[js.Any]))
      AttributeValueCount.foreach(__v => __obj.update("AttributeValueCount", __v.asInstanceOf[js.Any]))
      AttributeValuesSizeBytes.foreach(__v => __obj.update("AttributeValuesSizeBytes", __v.asInstanceOf[js.Any]))
      ItemCount.foreach(__v => __obj.update("ItemCount", __v.asInstanceOf[js.Any]))
      ItemNamesSizeBytes.foreach(__v => __obj.update("ItemNamesSizeBytes", __v.asInstanceOf[js.Any]))
      Timestamp.foreach(__v => __obj.update("Timestamp", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DomainMetadataResult]
    }
  }

  /**
    * The item name was specified more than once.
    */
  @js.native
  trait DuplicateItemNameException extends js.Object {
    val BoxUsage: Float
  }

  @js.native
  trait GetAttributesRequest extends js.Object {
    var DomainName: String
    var ItemName: String
    var AttributeNames: js.UndefOr[AttributeNameList]
    var ConsistentRead: js.UndefOr[Boolean]
  }

  object GetAttributesRequest {
    def apply(
        DomainName: String,
        ItemName: String,
        AttributeNames: js.UndefOr[AttributeNameList] = js.undefined,
        ConsistentRead: js.UndefOr[Boolean] = js.undefined
    ): GetAttributesRequest = {
      val __obj = js.Dictionary[js.Any](
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "ItemName"   -> ItemName.asInstanceOf[js.Any]
      )

      AttributeNames.foreach(__v => __obj.update("AttributeNames", __v.asInstanceOf[js.Any]))
      ConsistentRead.foreach(__v => __obj.update("ConsistentRead", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAttributesRequest]
    }
  }

  @js.native
  trait GetAttributesResult extends js.Object {
    var Attributes: js.UndefOr[AttributeList]
  }

  object GetAttributesResult {
    def apply(
        Attributes: js.UndefOr[AttributeList] = js.undefined
    ): GetAttributesResult = {
      val __obj = js.Dictionary.empty[js.Any]
      Attributes.foreach(__v => __obj.update("Attributes", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAttributesResult]
    }
  }

  /**
    * The specified NextToken is not valid.
    */
  @js.native
  trait InvalidNextTokenException extends js.Object {
    val BoxUsage: Float
  }

  /**
    * Too many predicates exist in the query expression.
    */
  @js.native
  trait InvalidNumberPredicatesException extends js.Object {
    val BoxUsage: Float
  }

  /**
    * Too many predicates exist in the query expression.
    */
  @js.native
  trait InvalidNumberValueTestsException extends js.Object {
    val BoxUsage: Float
  }

  /**
    * The value for a parameter is invalid.
    */
  @js.native
  trait InvalidParameterValueException extends js.Object {
    val BoxUsage: Float
  }

  /**
    * The specified query expression syntax is not valid.
    */
  @js.native
  trait InvalidQueryExpressionException extends js.Object {
    val BoxUsage: Float
  }

  /**
    *
    */
  @js.native
  trait Item extends js.Object {
    var Attributes: AttributeList
    var Name: String
    var AlternateNameEncoding: js.UndefOr[String]
  }

  object Item {
    def apply(
        Attributes: AttributeList,
        Name: String,
        AlternateNameEncoding: js.UndefOr[String] = js.undefined
    ): Item = {
      val __obj = js.Dictionary[js.Any](
        "Attributes" -> Attributes.asInstanceOf[js.Any],
        "Name"       -> Name.asInstanceOf[js.Any]
      )

      AlternateNameEncoding.foreach(__v => __obj.update("AlternateNameEncoding", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Item]
    }
  }

  @js.native
  trait ListDomainsRequest extends js.Object {
    var MaxNumberOfDomains: js.UndefOr[Int]
    var NextToken: js.UndefOr[String]
  }

  object ListDomainsRequest {
    def apply(
        MaxNumberOfDomains: js.UndefOr[Int] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListDomainsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      MaxNumberOfDomains.foreach(__v => __obj.update("MaxNumberOfDomains", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDomainsRequest]
    }
  }

  @js.native
  trait ListDomainsResult extends js.Object {
    var DomainNames: js.UndefOr[DomainNameList]
    var NextToken: js.UndefOr[String]
  }

  object ListDomainsResult {
    def apply(
        DomainNames: js.UndefOr[DomainNameList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListDomainsResult = {
      val __obj = js.Dictionary.empty[js.Any]
      DomainNames.foreach(__v => __obj.update("DomainNames", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDomainsResult]
    }
  }

  /**
    * The request must contain the specified missing parameter.
    */
  @js.native
  trait MissingParameterException extends js.Object {
    val BoxUsage: Float
  }

  /**
    * The specified domain does not exist.
    */
  @js.native
  trait NoSuchDomainException extends js.Object {
    val BoxUsage: Float
  }

  /**
    * Too many attributes in this domain.
    */
  @js.native
  trait NumberDomainAttributesExceededException extends js.Object {
    val BoxUsage: Float
  }

  /**
    * Too many bytes in this domain.
    */
  @js.native
  trait NumberDomainBytesExceededException extends js.Object {
    val BoxUsage: Float
  }

  /**
    * Too many domains exist per this account.
    */
  @js.native
  trait NumberDomainsExceededException extends js.Object {
    val BoxUsage: Float
  }

  /**
    * Too many attributes in this item.
    */
  @js.native
  trait NumberItemAttributesExceededException extends js.Object {
    val BoxUsage: Float
  }

  /**
    * Too many attributes exist in a single call.
    */
  @js.native
  trait NumberSubmittedAttributesExceededException extends js.Object {
    val BoxUsage: Float
  }

  /**
    * Too many items exist in a single call.
    */
  @js.native
  trait NumberSubmittedItemsExceededException extends js.Object {
    val BoxUsage: Float
  }

  @js.native
  trait PutAttributesRequest extends js.Object {
    var Attributes: ReplaceableAttributeList
    var DomainName: String
    var ItemName: String
    var Expected: js.UndefOr[UpdateCondition]
  }

  object PutAttributesRequest {
    def apply(
        Attributes: ReplaceableAttributeList,
        DomainName: String,
        ItemName: String,
        Expected: js.UndefOr[UpdateCondition] = js.undefined
    ): PutAttributesRequest = {
      val __obj = js.Dictionary[js.Any](
        "Attributes" -> Attributes.asInstanceOf[js.Any],
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "ItemName"   -> ItemName.asInstanceOf[js.Any]
      )

      Expected.foreach(__v => __obj.update("Expected", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutAttributesRequest]
    }
  }

  /**
    *
    */
  @js.native
  trait ReplaceableAttribute extends js.Object {
    var Name: String
    var Value: String
    var Replace: js.UndefOr[Boolean]
  }

  object ReplaceableAttribute {
    def apply(
        Name: String,
        Value: String,
        Replace: js.UndefOr[Boolean] = js.undefined
    ): ReplaceableAttribute = {
      val __obj = js.Dictionary[js.Any](
        "Name"  -> Name.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )

      Replace.foreach(__v => __obj.update("Replace", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReplaceableAttribute]
    }
  }

  /**
    *
    */
  @js.native
  trait ReplaceableItem extends js.Object {
    var Attributes: ReplaceableAttributeList
    var Name: String
  }

  object ReplaceableItem {
    def apply(
        Attributes: ReplaceableAttributeList,
        Name: String
    ): ReplaceableItem = {
      val __obj = js.Dictionary[js.Any](
        "Attributes" -> Attributes.asInstanceOf[js.Any],
        "Name"       -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ReplaceableItem]
    }
  }

  /**
    * A timeout occurred when attempting to query the specified domain with specified query expression.
    */
  @js.native
  trait RequestTimeoutException extends js.Object {
    val BoxUsage: Float
  }

  @js.native
  trait SelectRequest extends js.Object {
    var SelectExpression: String
    var ConsistentRead: js.UndefOr[Boolean]
    var NextToken: js.UndefOr[String]
  }

  object SelectRequest {
    def apply(
        SelectExpression: String,
        ConsistentRead: js.UndefOr[Boolean] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): SelectRequest = {
      val __obj = js.Dictionary[js.Any](
        "SelectExpression" -> SelectExpression.asInstanceOf[js.Any]
      )

      ConsistentRead.foreach(__v => __obj.update("ConsistentRead", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SelectRequest]
    }
  }

  @js.native
  trait SelectResult extends js.Object {
    var Items: js.UndefOr[ItemList]
    var NextToken: js.UndefOr[String]
  }

  object SelectResult {
    def apply(
        Items: js.UndefOr[ItemList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): SelectResult = {
      val __obj = js.Dictionary.empty[js.Any]
      Items.foreach(__v => __obj.update("Items", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SelectResult]
    }
  }

  /**
    * Too many attributes requested.
    */
  @js.native
  trait TooManyRequestedAttributesException extends js.Object {
    val BoxUsage: Float
  }

  /**
    * Specifies the conditions under which data should be updated. If an update condition is specified for a request, the data will only be updated if the condition is satisfied. For example, if an attribute with a specific name and value exists, or if a specific attribute doesn't exist.
    */
  @js.native
  trait UpdateCondition extends js.Object {
    var Exists: js.UndefOr[Boolean]
    var Name: js.UndefOr[String]
    var Value: js.UndefOr[String]
  }

  object UpdateCondition {
    def apply(
        Exists: js.UndefOr[Boolean] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        Value: js.UndefOr[String] = js.undefined
    ): UpdateCondition = {
      val __obj = js.Dictionary.empty[js.Any]
      Exists.foreach(__v => __obj.update("Exists", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.update("Value", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateCondition]
    }
  }
}
