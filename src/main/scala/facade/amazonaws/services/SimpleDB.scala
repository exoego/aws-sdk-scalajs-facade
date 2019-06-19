package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
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
    def apply(Name: String,
              Value: String,
              AlternateNameEncoding: js.UndefOr[String] = js.undefined,
              AlternateValueEncoding: js.UndefOr[String] = js.undefined): Attribute = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name"  -> Name.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any],
        "AlternateNameEncoding" -> AlternateNameEncoding.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AlternateValueEncoding" -> AlternateValueEncoding.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Attribute]
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
    def apply(DomainName: String, Items: DeletableItemList): BatchDeleteAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "Items"      -> Items.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDeleteAttributesRequest]
    }
  }

  @js.native
  trait BatchPutAttributesRequest extends js.Object {
    var DomainName: String
    var Items: ReplaceableItemList
  }

  object BatchPutAttributesRequest {
    def apply(DomainName: String, Items: ReplaceableItemList): BatchPutAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "Items"      -> Items.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchPutAttributesRequest]
    }
  }

  @js.native
  trait CreateDomainRequest extends js.Object {
    var DomainName: String
  }

  object CreateDomainRequest {
    def apply(DomainName: String): CreateDomainRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("DomainName" -> DomainName.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDomainRequest]
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
    def apply(Name: String, Value: js.UndefOr[String] = js.undefined): DeletableAttribute = {
      val _fields = IndexedSeq[(String, js.Any)]("Name" -> Name.asInstanceOf[js.Any], "Value" -> Value.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeletableAttribute]
    }
  }

  @js.native
  trait DeletableItem extends js.Object {
    var Name: String
    var Attributes: js.UndefOr[DeletableAttributeList]
  }

  object DeletableItem {
    def apply(Name: String, Attributes: js.UndefOr[DeletableAttributeList] = js.undefined): DeletableItem = {
      val _fields = IndexedSeq[(String, js.Any)]("Name" -> Name.asInstanceOf[js.Any], "Attributes" -> Attributes.map {
        x =>
          x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeletableItem]
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
    def apply(DomainName: String,
              ItemName: String,
              Attributes: js.UndefOr[DeletableAttributeList] = js.undefined,
              Expected: js.UndefOr[UpdateCondition] = js.undefined): DeleteAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "ItemName"   -> ItemName.asInstanceOf[js.Any],
        "Attributes" -> Attributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Expected" -> Expected.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAttributesRequest]
    }
  }

  @js.native
  trait DeleteDomainRequest extends js.Object {
    var DomainName: String
  }

  object DeleteDomainRequest {
    def apply(DomainName: String): DeleteDomainRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("DomainName" -> DomainName.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDomainRequest]
    }
  }

  @js.native
  trait DomainMetadataRequest extends js.Object {
    var DomainName: String
  }

  object DomainMetadataRequest {
    def apply(DomainName: String): DomainMetadataRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("DomainName" -> DomainName.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DomainMetadataRequest]
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
    def apply(AttributeNameCount: js.UndefOr[Int] = js.undefined,
              AttributeNamesSizeBytes: js.UndefOr[Double] = js.undefined,
              AttributeValueCount: js.UndefOr[Int] = js.undefined,
              AttributeValuesSizeBytes: js.UndefOr[Double] = js.undefined,
              ItemCount: js.UndefOr[Int] = js.undefined,
              ItemNamesSizeBytes: js.UndefOr[Double] = js.undefined,
              Timestamp: js.UndefOr[Int] = js.undefined): DomainMetadataResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttributeNameCount" -> AttributeNameCount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AttributeNamesSizeBytes" -> AttributeNamesSizeBytes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AttributeValueCount" -> AttributeValueCount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AttributeValuesSizeBytes" -> AttributeValuesSizeBytes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ItemCount" -> ItemCount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ItemNamesSizeBytes" -> ItemNamesSizeBytes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Timestamp" -> Timestamp.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DomainMetadataResult]
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
    def apply(DomainName: String,
              ItemName: String,
              AttributeNames: js.UndefOr[AttributeNameList] = js.undefined,
              ConsistentRead: js.UndefOr[Boolean] = js.undefined): GetAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "ItemName"   -> ItemName.asInstanceOf[js.Any],
        "AttributeNames" -> AttributeNames.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ConsistentRead" -> ConsistentRead.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAttributesRequest]
    }
  }

  @js.native
  trait GetAttributesResult extends js.Object {
    var Attributes: js.UndefOr[AttributeList]
  }

  object GetAttributesResult {
    def apply(Attributes: js.UndefOr[AttributeList] = js.undefined): GetAttributesResult = {
      val _fields = IndexedSeq[(String, js.Any)]("Attributes" -> Attributes.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAttributesResult]
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
    def apply(Attributes: AttributeList,
              Name: String,
              AlternateNameEncoding: js.UndefOr[String] = js.undefined): Item = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Attributes" -> Attributes.asInstanceOf[js.Any],
        "Name"       -> Name.asInstanceOf[js.Any],
        "AlternateNameEncoding" -> AlternateNameEncoding.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Item]
    }
  }

  @js.native
  trait ListDomainsRequest extends js.Object {
    var MaxNumberOfDomains: js.UndefOr[Int]
    var NextToken: js.UndefOr[String]
  }

  object ListDomainsRequest {
    def apply(MaxNumberOfDomains: js.UndefOr[Int] = js.undefined,
              NextToken: js.UndefOr[String] = js.undefined): ListDomainsRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("MaxNumberOfDomains" -> MaxNumberOfDomains.map { x =>
        x.asInstanceOf[js.Any]
      }, "NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDomainsRequest]
    }
  }

  @js.native
  trait ListDomainsResult extends js.Object {
    var DomainNames: js.UndefOr[DomainNameList]
    var NextToken: js.UndefOr[String]
  }

  object ListDomainsResult {
    def apply(DomainNames: js.UndefOr[DomainNameList] = js.undefined,
              NextToken: js.UndefOr[String] = js.undefined): ListDomainsResult = {
      val _fields = IndexedSeq[(String, js.Any)]("DomainNames" -> DomainNames.map { x =>
        x.asInstanceOf[js.Any]
      }, "NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDomainsResult]
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
    def apply(Attributes: ReplaceableAttributeList,
              DomainName: String,
              ItemName: String,
              Expected: js.UndefOr[UpdateCondition] = js.undefined): PutAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Attributes" -> Attributes.asInstanceOf[js.Any],
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "ItemName"   -> ItemName.asInstanceOf[js.Any],
        "Expected" -> Expected.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutAttributesRequest]
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
    def apply(Name: String, Value: String, Replace: js.UndefOr[Boolean] = js.undefined): ReplaceableAttribute = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name"  -> Name.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any],
        "Replace" -> Replace.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReplaceableAttribute]
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
    def apply(Attributes: ReplaceableAttributeList, Name: String): ReplaceableItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Attributes" -> Attributes.asInstanceOf[js.Any],
        "Name"       -> Name.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReplaceableItem]
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
    def apply(SelectExpression: String,
              ConsistentRead: js.UndefOr[Boolean] = js.undefined,
              NextToken: js.UndefOr[String] = js.undefined): SelectRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SelectExpression" -> SelectExpression.asInstanceOf[js.Any],
        "ConsistentRead" -> ConsistentRead.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SelectRequest]
    }
  }

  @js.native
  trait SelectResult extends js.Object {
    var Items: js.UndefOr[ItemList]
    var NextToken: js.UndefOr[String]
  }

  object SelectResult {
    def apply(Items: js.UndefOr[ItemList] = js.undefined,
              NextToken: js.UndefOr[String] = js.undefined): SelectResult = {
      val _fields = IndexedSeq[(String, js.Any)]("Items" -> Items.map { x =>
        x.asInstanceOf[js.Any]
      }, "NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SelectResult]
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
    def apply(Exists: js.UndefOr[Boolean] = js.undefined,
              Name: js.UndefOr[String] = js.undefined,
              Value: js.UndefOr[String] = js.undefined): UpdateCondition = {
      val _fields = IndexedSeq[(String, js.Any)]("Exists" -> Exists.map { x =>
        x.asInstanceOf[js.Any]
      }, "Name" -> Name.map { x =>
        x.asInstanceOf[js.Any]
      }, "Value" -> Value.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateCondition]
    }
  }
}
