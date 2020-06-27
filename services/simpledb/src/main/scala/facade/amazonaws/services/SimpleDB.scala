package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

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

    @inline def batchDeleteAttributesFuture(params: BatchDeleteAttributesRequest): Future[js.Object] =
      service.batchDeleteAttributes(params).promise().toFuture
    @inline def batchPutAttributesFuture(params: BatchPutAttributesRequest): Future[js.Object] =
      service.batchPutAttributes(params).promise().toFuture
    @inline def createDomainFuture(params: CreateDomainRequest): Future[js.Object] =
      service.createDomain(params).promise().toFuture
    @inline def deleteAttributesFuture(params: DeleteAttributesRequest): Future[js.Object] =
      service.deleteAttributes(params).promise().toFuture
    @inline def deleteDomainFuture(params: DeleteDomainRequest): Future[js.Object] =
      service.deleteDomain(params).promise().toFuture
    @inline def domainMetadataFuture(params: DomainMetadataRequest): Future[DomainMetadataResult] =
      service.domainMetadata(params).promise().toFuture
    @inline def getAttributesFuture(params: GetAttributesRequest): Future[GetAttributesResult] =
      service.getAttributes(params).promise().toFuture
    @inline def listDomainsFuture(params: ListDomainsRequest): Future[ListDomainsResult] =
      service.listDomains(params).promise().toFuture
    @inline def putAttributesFuture(params: PutAttributesRequest): Future[js.Object] =
      service.putAttributes(params).promise().toFuture
    @inline def selectFuture(params: SelectRequest): Future[SelectResult] = service.select(params).promise().toFuture
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
    */
  @js.native
  @Factory
  trait Attribute extends js.Object {
    var Name: String
    var Value: String
    var AlternateNameEncoding: js.UndefOr[String]
    var AlternateValueEncoding: js.UndefOr[String]
  }

  /**
    * The specified attribute does not exist.
    */
  @js.native
  trait AttributeDoesNotExistException extends js.Object {
    val BoxUsage: Float
  }

  @js.native
  @Factory
  trait BatchDeleteAttributesRequest extends js.Object {
    var DomainName: String
    var Items: DeletableItemList
  }

  @js.native
  @Factory
  trait BatchPutAttributesRequest extends js.Object {
    var DomainName: String
    var Items: ReplaceableItemList
  }

  @js.native
  @Factory
  trait CreateDomainRequest extends js.Object {
    var DomainName: String
  }

  /**
    */
  @js.native
  @Factory
  trait DeletableAttribute extends js.Object {
    var Name: String
    var Value: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DeletableItem extends js.Object {
    var Name: String
    var Attributes: js.UndefOr[DeletableAttributeList]
  }

  @js.native
  @Factory
  trait DeleteAttributesRequest extends js.Object {
    var DomainName: String
    var ItemName: String
    var Attributes: js.UndefOr[DeletableAttributeList]
    var Expected: js.UndefOr[UpdateCondition]
  }

  @js.native
  @Factory
  trait DeleteDomainRequest extends js.Object {
    var DomainName: String
  }

  @js.native
  @Factory
  trait DomainMetadataRequest extends js.Object {
    var DomainName: String
  }

  @js.native
  @Factory
  trait DomainMetadataResult extends js.Object {
    var AttributeNameCount: js.UndefOr[Int]
    var AttributeNamesSizeBytes: js.UndefOr[Double]
    var AttributeValueCount: js.UndefOr[Int]
    var AttributeValuesSizeBytes: js.UndefOr[Double]
    var ItemCount: js.UndefOr[Int]
    var ItemNamesSizeBytes: js.UndefOr[Double]
    var Timestamp: js.UndefOr[Int]
  }

  /**
    * The item name was specified more than once.
    */
  @js.native
  trait DuplicateItemNameException extends js.Object {
    val BoxUsage: Float
  }

  @js.native
  @Factory
  trait GetAttributesRequest extends js.Object {
    var DomainName: String
    var ItemName: String
    var AttributeNames: js.UndefOr[AttributeNameList]
    var ConsistentRead: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait GetAttributesResult extends js.Object {
    var Attributes: js.UndefOr[AttributeList]
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
    */
  @js.native
  @Factory
  trait Item extends js.Object {
    var Attributes: AttributeList
    var Name: String
    var AlternateNameEncoding: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListDomainsRequest extends js.Object {
    var MaxNumberOfDomains: js.UndefOr[Int]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListDomainsResult extends js.Object {
    var DomainNames: js.UndefOr[DomainNameList]
    var NextToken: js.UndefOr[String]
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
  @Factory
  trait PutAttributesRequest extends js.Object {
    var Attributes: ReplaceableAttributeList
    var DomainName: String
    var ItemName: String
    var Expected: js.UndefOr[UpdateCondition]
  }

  /**
    */
  @js.native
  @Factory
  trait ReplaceableAttribute extends js.Object {
    var Name: String
    var Value: String
    var Replace: js.UndefOr[Boolean]
  }

  /**
    */
  @js.native
  @Factory
  trait ReplaceableItem extends js.Object {
    var Attributes: ReplaceableAttributeList
    var Name: String
  }

  /**
    * A timeout occurred when attempting to query the specified domain with specified query expression.
    */
  @js.native
  trait RequestTimeoutException extends js.Object {
    val BoxUsage: Float
  }

  @js.native
  @Factory
  trait SelectRequest extends js.Object {
    var SelectExpression: String
    var ConsistentRead: js.UndefOr[Boolean]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait SelectResult extends js.Object {
    var Items: js.UndefOr[ItemList]
    var NextToken: js.UndefOr[String]
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
  @Factory
  trait UpdateCondition extends js.Object {
    var Exists: js.UndefOr[Boolean]
    var Name: js.UndefOr[String]
    var Value: js.UndefOr[String]
  }
}
