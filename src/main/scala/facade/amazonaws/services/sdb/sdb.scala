package facade.amazonaws.services

import scalajs._
import facade.amazonaws._

package object sdb {
  type AttributeList = js.Array[Attribute]
  type AttributeNameList = js.Array[String]
  type DeletableAttributeList = js.Array[DeletableAttribute]
  type DeletableItemList = js.Array[DeletableItem]
  type DomainNameList = js.Array[String]
  type ItemList = js.Array[Item]
  type ReplaceableAttributeList = js.Array[ReplaceableAttribute]
  type ReplaceableItemList = js.Array[ReplaceableItem]
}

package sdb {
  @js.native
  trait Sdb extends js.Object {
    def batchDeleteAttributes(params: BatchDeleteAttributesRequest, callback: Callback[js.Object]): Unit = js.native
    def batchDeleteAttributes(params: BatchDeleteAttributesRequest): Request[js.Object] = js.native
    def batchPutAttributes(params: BatchPutAttributesRequest, callback: Callback[js.Object]): Unit = js.native
    def batchPutAttributes(params: BatchPutAttributesRequest): Request[js.Object] = js.native
    def createDomain(params: CreateDomainRequest, callback: Callback[js.Object]): Unit = js.native
    def createDomain(params: CreateDomainRequest): Request[js.Object] = js.native
    def deleteAttributes(params: DeleteAttributesRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteAttributes(params: DeleteAttributesRequest): Request[js.Object] = js.native
    def deleteDomain(params: DeleteDomainRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteDomain(params: DeleteDomainRequest): Request[js.Object] = js.native
    def domainMetadata(params: DomainMetadataRequest, callback: Callback[DomainMetadataResult]): Unit = js.native
    def domainMetadata(params: DomainMetadataRequest): Request[DomainMetadataResult] = js.native
    def getAttributes(params: GetAttributesRequest, callback: Callback[GetAttributesResult]): Unit = js.native
    def getAttributes(params: GetAttributesRequest): Request[GetAttributesResult] = js.native
    def listDomains(params: ListDomainsRequest, callback: Callback[ListDomainsResult]): Unit = js.native
    def listDomains(params: ListDomainsRequest): Request[ListDomainsResult] = js.native
    def putAttributes(params: PutAttributesRequest, callback: Callback[js.Object]): Unit = js.native
    def putAttributes(params: PutAttributesRequest): Request[js.Object] = js.native
    def select(params: SelectRequest, callback: Callback[SelectResult]): Unit = js.native
    def select(params: SelectRequest): Request[SelectResult] = js.native
  }

  /**
   * <p></p>
   */
  @js.native
  trait Attribute extends js.Object {
    var Name: String
    var AlternateNameEncoding: String
    var Value: String
    var AlternateValueEncoding: String
  }

  object Attribute {
    def apply(
      Name: js.UndefOr[String] = js.undefined,
      AlternateNameEncoding: js.UndefOr[String] = js.undefined,
      Value: js.UndefOr[String] = js.undefined,
      AlternateValueEncoding: js.UndefOr[String] = js.undefined
    ): Attribute = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("AlternateNameEncoding" -> AlternateNameEncoding.map { x => x: js.Any }),
        ("Value" -> Value.map { x => x: js.Any }),
        ("AlternateValueEncoding" -> AlternateValueEncoding.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Attribute]
    }
  }

  /**
   * <p>The specified attribute does not exist.</p>
   */
  @js.native
  trait AttributeDoesNotExistException extends js.Object {
    var BoxUsage: Float
  }

  @js.native
  trait BatchDeleteAttributesRequest extends js.Object {
    var DomainName: String
    var Items: DeletableItemList
  }

  object BatchDeleteAttributesRequest {
    def apply(
      DomainName: js.UndefOr[String] = js.undefined,
      Items: js.UndefOr[DeletableItemList] = js.undefined
    ): BatchDeleteAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DomainName" -> DomainName.map { x => x: js.Any }),
        ("Items" -> Items.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDeleteAttributesRequest]
    }
  }

  @js.native
  trait BatchPutAttributesRequest extends js.Object {
    var DomainName: String
    var Items: ReplaceableItemList
  }

  object BatchPutAttributesRequest {
    def apply(
      DomainName: js.UndefOr[String] = js.undefined,
      Items: js.UndefOr[ReplaceableItemList] = js.undefined
    ): BatchPutAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DomainName" -> DomainName.map { x => x: js.Any }),
        ("Items" -> Items.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchPutAttributesRequest]
    }
  }

  @js.native
  trait CreateDomainRequest extends js.Object {
    var DomainName: String
  }

  object CreateDomainRequest {
    def apply(
      DomainName: js.UndefOr[String] = js.undefined
    ): CreateDomainRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DomainName" -> DomainName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDomainRequest]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait DeletableAttribute extends js.Object {
    var Name: String
    var Value: String
  }

  object DeletableAttribute {
    def apply(
      Name: js.UndefOr[String] = js.undefined,
      Value: js.UndefOr[String] = js.undefined
    ): DeletableAttribute = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("Value" -> Value.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeletableAttribute]
    }
  }

  @js.native
  trait DeletableItem extends js.Object {
    var Name: String
    var Attributes: DeletableAttributeList
  }

  object DeletableItem {
    def apply(
      Name: js.UndefOr[String] = js.undefined,
      Attributes: js.UndefOr[DeletableAttributeList] = js.undefined
    ): DeletableItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("Attributes" -> Attributes.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeletableItem]
    }
  }

  @js.native
  trait DeleteAttributesRequest extends js.Object {
    var DomainName: String
    var ItemName: String
    var Attributes: DeletableAttributeList
    var Expected: UpdateCondition
  }

  object DeleteAttributesRequest {
    def apply(
      DomainName: js.UndefOr[String] = js.undefined,
      ItemName: js.UndefOr[String] = js.undefined,
      Attributes: js.UndefOr[DeletableAttributeList] = js.undefined,
      Expected: js.UndefOr[UpdateCondition] = js.undefined
    ): DeleteAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DomainName" -> DomainName.map { x => x: js.Any }),
        ("ItemName" -> ItemName.map { x => x: js.Any }),
        ("Attributes" -> Attributes.map { x => x: js.Any }),
        ("Expected" -> Expected.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAttributesRequest]
    }
  }

  @js.native
  trait DeleteDomainRequest extends js.Object {
    var DomainName: String
  }

  object DeleteDomainRequest {
    def apply(
      DomainName: js.UndefOr[String] = js.undefined
    ): DeleteDomainRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DomainName" -> DomainName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDomainRequest]
    }
  }

  @js.native
  trait DomainMetadataRequest extends js.Object {
    var DomainName: String
  }

  object DomainMetadataRequest {
    def apply(
      DomainName: js.UndefOr[String] = js.undefined
    ): DomainMetadataRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DomainName" -> DomainName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DomainMetadataRequest]
    }
  }

  @js.native
  trait DomainMetadataResult extends js.Object {
    var AttributeNamesSizeBytes: Long
    var ItemNamesSizeBytes: Long
    var AttributeValuesSizeBytes: Long
    var ItemCount: Integer
    var AttributeValueCount: Integer
    var Timestamp: Integer
    var AttributeNameCount: Integer
  }

  object DomainMetadataResult {
    def apply(
      AttributeNamesSizeBytes: js.UndefOr[Long] = js.undefined,
      ItemNamesSizeBytes: js.UndefOr[Long] = js.undefined,
      AttributeValuesSizeBytes: js.UndefOr[Long] = js.undefined,
      ItemCount: js.UndefOr[Integer] = js.undefined,
      AttributeValueCount: js.UndefOr[Integer] = js.undefined,
      Timestamp: js.UndefOr[Integer] = js.undefined,
      AttributeNameCount: js.UndefOr[Integer] = js.undefined
    ): DomainMetadataResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AttributeNamesSizeBytes" -> AttributeNamesSizeBytes.map { x => x: js.Any }),
        ("ItemNamesSizeBytes" -> ItemNamesSizeBytes.map { x => x: js.Any }),
        ("AttributeValuesSizeBytes" -> AttributeValuesSizeBytes.map { x => x: js.Any }),
        ("ItemCount" -> ItemCount.map { x => x: js.Any }),
        ("AttributeValueCount" -> AttributeValueCount.map { x => x: js.Any }),
        ("Timestamp" -> Timestamp.map { x => x: js.Any }),
        ("AttributeNameCount" -> AttributeNameCount.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DomainMetadataResult]
    }
  }

  /**
   * <p>The item name was specified more than once. </p>
   */
  @js.native
  trait DuplicateItemNameException extends js.Object {
    var BoxUsage: Float
  }

  @js.native
  trait GetAttributesRequest extends js.Object {
    var DomainName: String
    var ItemName: String
    var AttributeNames: AttributeNameList
    var ConsistentRead: Boolean
  }

  object GetAttributesRequest {
    def apply(
      DomainName: js.UndefOr[String] = js.undefined,
      ItemName: js.UndefOr[String] = js.undefined,
      AttributeNames: js.UndefOr[AttributeNameList] = js.undefined,
      ConsistentRead: js.UndefOr[Boolean] = js.undefined
    ): GetAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DomainName" -> DomainName.map { x => x: js.Any }),
        ("ItemName" -> ItemName.map { x => x: js.Any }),
        ("AttributeNames" -> AttributeNames.map { x => x: js.Any }),
        ("ConsistentRead" -> ConsistentRead.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAttributesRequest]
    }
  }

  @js.native
  trait GetAttributesResult extends js.Object {
    var Attributes: AttributeList
  }

  object GetAttributesResult {
    def apply(
      Attributes: js.UndefOr[AttributeList] = js.undefined
    ): GetAttributesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Attributes" -> Attributes.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAttributesResult]
    }
  }

  /**
   * <p>The specified NextToken is not valid. </p>
   */
  @js.native
  trait InvalidNextTokenException extends js.Object {
    var BoxUsage: Float
  }

  /**
   * <p>Too many predicates exist in the query expression.</p>
   */
  @js.native
  trait InvalidNumberPredicatesException extends js.Object {
    var BoxUsage: Float
  }

  /**
   * <p>Too many predicates exist in the query expression.</p>
   */
  @js.native
  trait InvalidNumberValueTestsException extends js.Object {
    var BoxUsage: Float
  }

  /**
   * <p>The value for a parameter is invalid.</p>
   */
  @js.native
  trait InvalidParameterValueException extends js.Object {
    var BoxUsage: Float
  }

  /**
   * <p>The specified query expression syntax is not valid.</p>
   */
  @js.native
  trait InvalidQueryExpressionException extends js.Object {
    var BoxUsage: Float
  }

  /**
   * <p></p>
   */
  @js.native
  trait Item extends js.Object {
    var Name: String
    var AlternateNameEncoding: String
    var Attributes: AttributeList
  }

  object Item {
    def apply(
      Name: js.UndefOr[String] = js.undefined,
      AlternateNameEncoding: js.UndefOr[String] = js.undefined,
      Attributes: js.UndefOr[AttributeList] = js.undefined
    ): Item = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("AlternateNameEncoding" -> AlternateNameEncoding.map { x => x: js.Any }),
        ("Attributes" -> Attributes.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Item]
    }
  }

  @js.native
  trait ListDomainsRequest extends js.Object {
    var MaxNumberOfDomains: Integer
    var NextToken: String
  }

  object ListDomainsRequest {
    def apply(
      MaxNumberOfDomains: js.UndefOr[Integer] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined
    ): ListDomainsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("MaxNumberOfDomains" -> MaxNumberOfDomains.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDomainsRequest]
    }
  }

  @js.native
  trait ListDomainsResult extends js.Object {
    var DomainNames: DomainNameList
    var NextToken: String
  }

  object ListDomainsResult {
    def apply(
      DomainNames: js.UndefOr[DomainNameList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined
    ): ListDomainsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DomainNames" -> DomainNames.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDomainsResult]
    }
  }

  /**
   * <p>The request must contain the specified missing parameter.</p>
   */
  @js.native
  trait MissingParameterException extends js.Object {
    var BoxUsage: Float
  }

  /**
   * <p>The specified domain does not exist.</p>
   */
  @js.native
  trait NoSuchDomainException extends js.Object {
    var BoxUsage: Float
  }

  /**
   * <p>Too many attributes in this domain.</p>
   */
  @js.native
  trait NumberDomainAttributesExceededException extends js.Object {
    var BoxUsage: Float
  }

  /**
   * <p>Too many bytes in this domain.</p>
   */
  @js.native
  trait NumberDomainBytesExceededException extends js.Object {
    var BoxUsage: Float
  }

  /**
   * <p>Too many domains exist per this account.</p>
   */
  @js.native
  trait NumberDomainsExceededException extends js.Object {
    var BoxUsage: Float
  }

  /**
   * <p>Too many attributes in this item.</p>
   */
  @js.native
  trait NumberItemAttributesExceededException extends js.Object {
    var BoxUsage: Float
  }

  /**
   * <p>Too many attributes exist in a single call.</p>
   */
  @js.native
  trait NumberSubmittedAttributesExceededException extends js.Object {
    var BoxUsage: Float
  }

  /**
   * <p>Too many items exist in a single call.</p>
   */
  @js.native
  trait NumberSubmittedItemsExceededException extends js.Object {
    var BoxUsage: Float
  }

  @js.native
  trait PutAttributesRequest extends js.Object {
    var DomainName: String
    var ItemName: String
    var Attributes: ReplaceableAttributeList
    var Expected: UpdateCondition
  }

  object PutAttributesRequest {
    def apply(
      DomainName: js.UndefOr[String] = js.undefined,
      ItemName: js.UndefOr[String] = js.undefined,
      Attributes: js.UndefOr[ReplaceableAttributeList] = js.undefined,
      Expected: js.UndefOr[UpdateCondition] = js.undefined
    ): PutAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DomainName" -> DomainName.map { x => x: js.Any }),
        ("ItemName" -> ItemName.map { x => x: js.Any }),
        ("Attributes" -> Attributes.map { x => x: js.Any }),
        ("Expected" -> Expected.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutAttributesRequest]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait ReplaceableAttribute extends js.Object {
    var Name: String
    var Value: String
    var Replace: Boolean
  }

  object ReplaceableAttribute {
    def apply(
      Name: js.UndefOr[String] = js.undefined,
      Value: js.UndefOr[String] = js.undefined,
      Replace: js.UndefOr[Boolean] = js.undefined
    ): ReplaceableAttribute = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("Value" -> Value.map { x => x: js.Any }),
        ("Replace" -> Replace.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReplaceableAttribute]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait ReplaceableItem extends js.Object {
    var Name: String
    var Attributes: ReplaceableAttributeList
  }

  object ReplaceableItem {
    def apply(
      Name: js.UndefOr[String] = js.undefined,
      Attributes: js.UndefOr[ReplaceableAttributeList] = js.undefined
    ): ReplaceableItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("Attributes" -> Attributes.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReplaceableItem]
    }
  }

  /**
   * <p>A timeout occurred when attempting to query the specified domain with specified query expression.</p>
   */
  @js.native
  trait RequestTimeoutException extends js.Object {
    var BoxUsage: Float
  }

  @js.native
  trait SelectRequest extends js.Object {
    var SelectExpression: String
    var NextToken: String
    var ConsistentRead: Boolean
  }

  object SelectRequest {
    def apply(
      SelectExpression: js.UndefOr[String] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined,
      ConsistentRead: js.UndefOr[Boolean] = js.undefined
    ): SelectRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SelectExpression" -> SelectExpression.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any }),
        ("ConsistentRead" -> ConsistentRead.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SelectRequest]
    }
  }

  @js.native
  trait SelectResult extends js.Object {
    var Items: ItemList
    var NextToken: String
  }

  object SelectResult {
    def apply(
      Items: js.UndefOr[ItemList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined
    ): SelectResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Items" -> Items.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SelectResult]
    }
  }

  /**
   * <p>Too many attributes requested.</p>
   */
  @js.native
  trait TooManyRequestedAttributesException extends js.Object {
    var BoxUsage: Float
  }

  /**
   * <p> Specifies the conditions under which data should be updated. If an update condition is specified for a request, the data will only be updated if the condition is satisfied. For example, if an attribute with a specific name and value exists, or if a specific attribute doesn't exist. </p>
   */
  @js.native
  trait UpdateCondition extends js.Object {
    var Name: String
    var Value: String
    var Exists: Boolean
  }

  object UpdateCondition {
    def apply(
      Name: js.UndefOr[String] = js.undefined,
      Value: js.UndefOr[String] = js.undefined,
      Exists: js.UndefOr[Boolean] = js.undefined
    ): UpdateCondition = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("Value" -> Value.map { x => x: js.Any }),
        ("Exists" -> Exists.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateCondition]
    }
  }
}
