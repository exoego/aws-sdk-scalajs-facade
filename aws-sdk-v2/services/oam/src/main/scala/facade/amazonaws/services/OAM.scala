package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object oam {
  type Arn = String
  type LabelTemplate = String
  type ListAttachedLinksItems = js.Array[ListAttachedLinksItem]
  type ListAttachedLinksMaxResults = Int
  type ListLinksItems = js.Array[ListLinksItem]
  type ListLinksMaxResults = Int
  type ListSinksItems = js.Array[ListSinksItem]
  type ListSinksMaxResults = Int
  type NextToken = String
  type ResourceIdentifier = String
  type ResourceTypesInput = js.Array[ResourceType]
  type ResourceTypesOutput = js.Array[String]
  type SinkName = String
  type SinkPolicy = String
  type TagKey = String
  type TagKeys = js.Array[TagKey]
  type TagMapInput = js.Dictionary[TagValue]
  type TagMapOutput = js.Dictionary[String]
  type TagValue = String

  final class OAMOps(private val service: OAM) extends AnyVal {

    @inline def createLinkFuture(params: CreateLinkInput): Future[CreateLinkOutput] = service.createLink(params).promise().toFuture
    @inline def createSinkFuture(params: CreateSinkInput): Future[CreateSinkOutput] = service.createSink(params).promise().toFuture
    @inline def deleteLinkFuture(params: DeleteLinkInput): Future[DeleteLinkOutput] = service.deleteLink(params).promise().toFuture
    @inline def deleteSinkFuture(params: DeleteSinkInput): Future[DeleteSinkOutput] = service.deleteSink(params).promise().toFuture
    @inline def getLinkFuture(params: GetLinkInput): Future[GetLinkOutput] = service.getLink(params).promise().toFuture
    @inline def getSinkFuture(params: GetSinkInput): Future[GetSinkOutput] = service.getSink(params).promise().toFuture
    @inline def getSinkPolicyFuture(params: GetSinkPolicyInput): Future[GetSinkPolicyOutput] = service.getSinkPolicy(params).promise().toFuture
    @inline def listAttachedLinksFuture(params: ListAttachedLinksInput): Future[ListAttachedLinksOutput] = service.listAttachedLinks(params).promise().toFuture
    @inline def listLinksFuture(params: ListLinksInput): Future[ListLinksOutput] = service.listLinks(params).promise().toFuture
    @inline def listSinksFuture(params: ListSinksInput): Future[ListSinksOutput] = service.listSinks(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceInput): Future[ListTagsForResourceOutput] = service.listTagsForResource(params).promise().toFuture
    @inline def putSinkPolicyFuture(params: PutSinkPolicyInput): Future[PutSinkPolicyOutput] = service.putSinkPolicy(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceInput): Future[TagResourceOutput] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceInput): Future[UntagResourceOutput] = service.untagResource(params).promise().toFuture
    @inline def updateLinkFuture(params: UpdateLinkInput): Future[UpdateLinkOutput] = service.updateLink(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/oam", JSImport.Namespace, "AWS.OAM")
  class OAM() extends js.Object {
    def this(config: AWSConfig) = this()

    def createLink(params: CreateLinkInput): Request[CreateLinkOutput] = js.native
    def createSink(params: CreateSinkInput): Request[CreateSinkOutput] = js.native
    def deleteLink(params: DeleteLinkInput): Request[DeleteLinkOutput] = js.native
    def deleteSink(params: DeleteSinkInput): Request[DeleteSinkOutput] = js.native
    def getLink(params: GetLinkInput): Request[GetLinkOutput] = js.native
    def getSink(params: GetSinkInput): Request[GetSinkOutput] = js.native
    def getSinkPolicy(params: GetSinkPolicyInput): Request[GetSinkPolicyOutput] = js.native
    def listAttachedLinks(params: ListAttachedLinksInput): Request[ListAttachedLinksOutput] = js.native
    def listLinks(params: ListLinksInput): Request[ListLinksOutput] = js.native
    def listSinks(params: ListSinksInput): Request[ListSinksOutput] = js.native
    def listTagsForResource(params: ListTagsForResourceInput): Request[ListTagsForResourceOutput] = js.native
    def putSinkPolicy(params: PutSinkPolicyInput): Request[PutSinkPolicyOutput] = js.native
    def tagResource(params: TagResourceInput): Request[TagResourceOutput] = js.native
    def untagResource(params: UntagResourceInput): Request[UntagResourceOutput] = js.native
    def updateLink(params: UpdateLinkInput): Request[UpdateLinkOutput] = js.native
  }
  object OAM {
    @inline implicit def toOps(service: OAM): OAMOps = {
      new OAMOps(service)
    }
  }

  @js.native
  trait CreateLinkInput extends js.Object {
    var LabelTemplate: LabelTemplate
    var ResourceTypes: ResourceTypesInput
    var SinkIdentifier: ResourceIdentifier
    var Tags: js.UndefOr[TagMapInput]
  }

  object CreateLinkInput {
    @inline
    def apply(
        LabelTemplate: LabelTemplate,
        ResourceTypes: ResourceTypesInput,
        SinkIdentifier: ResourceIdentifier,
        Tags: js.UndefOr[TagMapInput] = js.undefined
    ): CreateLinkInput = {
      val __obj = js.Dynamic.literal(
        "LabelTemplate" -> LabelTemplate.asInstanceOf[js.Any],
        "ResourceTypes" -> ResourceTypes.asInstanceOf[js.Any],
        "SinkIdentifier" -> SinkIdentifier.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLinkInput]
    }
  }

  @js.native
  trait CreateLinkOutput extends js.Object {
    var Arn: js.UndefOr[String]
    var Id: js.UndefOr[String]
    var Label: js.UndefOr[String]
    var LabelTemplate: js.UndefOr[String]
    var ResourceTypes: js.UndefOr[ResourceTypesOutput]
    var SinkArn: js.UndefOr[String]
    var Tags: js.UndefOr[TagMapOutput]
  }

  object CreateLinkOutput {
    @inline
    def apply(
        Arn: js.UndefOr[String] = js.undefined,
        Id: js.UndefOr[String] = js.undefined,
        Label: js.UndefOr[String] = js.undefined,
        LabelTemplate: js.UndefOr[String] = js.undefined,
        ResourceTypes: js.UndefOr[ResourceTypesOutput] = js.undefined,
        SinkArn: js.UndefOr[String] = js.undefined,
        Tags: js.UndefOr[TagMapOutput] = js.undefined
    ): CreateLinkOutput = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Label.foreach(__v => __obj.updateDynamic("Label")(__v.asInstanceOf[js.Any]))
      LabelTemplate.foreach(__v => __obj.updateDynamic("LabelTemplate")(__v.asInstanceOf[js.Any]))
      ResourceTypes.foreach(__v => __obj.updateDynamic("ResourceTypes")(__v.asInstanceOf[js.Any]))
      SinkArn.foreach(__v => __obj.updateDynamic("SinkArn")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLinkOutput]
    }
  }

  @js.native
  trait CreateSinkInput extends js.Object {
    var Name: SinkName
    var Tags: js.UndefOr[TagMapInput]
  }

  object CreateSinkInput {
    @inline
    def apply(
        Name: SinkName,
        Tags: js.UndefOr[TagMapInput] = js.undefined
    ): CreateSinkInput = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSinkInput]
    }
  }

  @js.native
  trait CreateSinkOutput extends js.Object {
    var Arn: js.UndefOr[String]
    var Id: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var Tags: js.UndefOr[TagMapOutput]
  }

  object CreateSinkOutput {
    @inline
    def apply(
        Arn: js.UndefOr[String] = js.undefined,
        Id: js.UndefOr[String] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        Tags: js.UndefOr[TagMapOutput] = js.undefined
    ): CreateSinkOutput = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSinkOutput]
    }
  }

  @js.native
  trait DeleteLinkInput extends js.Object {
    var Identifier: ResourceIdentifier
  }

  object DeleteLinkInput {
    @inline
    def apply(
        Identifier: ResourceIdentifier
    ): DeleteLinkInput = {
      val __obj = js.Dynamic.literal(
        "Identifier" -> Identifier.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteLinkInput]
    }
  }

  @js.native
  trait DeleteLinkOutput extends js.Object

  object DeleteLinkOutput {
    @inline
    def apply(): DeleteLinkOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteLinkOutput]
    }
  }

  @js.native
  trait DeleteSinkInput extends js.Object {
    var Identifier: ResourceIdentifier
  }

  object DeleteSinkInput {
    @inline
    def apply(
        Identifier: ResourceIdentifier
    ): DeleteSinkInput = {
      val __obj = js.Dynamic.literal(
        "Identifier" -> Identifier.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteSinkInput]
    }
  }

  @js.native
  trait DeleteSinkOutput extends js.Object

  object DeleteSinkOutput {
    @inline
    def apply(): DeleteSinkOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteSinkOutput]
    }
  }

  @js.native
  trait GetLinkInput extends js.Object {
    var Identifier: ResourceIdentifier
  }

  object GetLinkInput {
    @inline
    def apply(
        Identifier: ResourceIdentifier
    ): GetLinkInput = {
      val __obj = js.Dynamic.literal(
        "Identifier" -> Identifier.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetLinkInput]
    }
  }

  @js.native
  trait GetLinkOutput extends js.Object {
    var Arn: js.UndefOr[String]
    var Id: js.UndefOr[String]
    var Label: js.UndefOr[String]
    var LabelTemplate: js.UndefOr[String]
    var ResourceTypes: js.UndefOr[ResourceTypesOutput]
    var SinkArn: js.UndefOr[String]
    var Tags: js.UndefOr[TagMapOutput]
  }

  object GetLinkOutput {
    @inline
    def apply(
        Arn: js.UndefOr[String] = js.undefined,
        Id: js.UndefOr[String] = js.undefined,
        Label: js.UndefOr[String] = js.undefined,
        LabelTemplate: js.UndefOr[String] = js.undefined,
        ResourceTypes: js.UndefOr[ResourceTypesOutput] = js.undefined,
        SinkArn: js.UndefOr[String] = js.undefined,
        Tags: js.UndefOr[TagMapOutput] = js.undefined
    ): GetLinkOutput = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Label.foreach(__v => __obj.updateDynamic("Label")(__v.asInstanceOf[js.Any]))
      LabelTemplate.foreach(__v => __obj.updateDynamic("LabelTemplate")(__v.asInstanceOf[js.Any]))
      ResourceTypes.foreach(__v => __obj.updateDynamic("ResourceTypes")(__v.asInstanceOf[js.Any]))
      SinkArn.foreach(__v => __obj.updateDynamic("SinkArn")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLinkOutput]
    }
  }

  @js.native
  trait GetSinkInput extends js.Object {
    var Identifier: ResourceIdentifier
  }

  object GetSinkInput {
    @inline
    def apply(
        Identifier: ResourceIdentifier
    ): GetSinkInput = {
      val __obj = js.Dynamic.literal(
        "Identifier" -> Identifier.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetSinkInput]
    }
  }

  @js.native
  trait GetSinkOutput extends js.Object {
    var Arn: js.UndefOr[String]
    var Id: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var Tags: js.UndefOr[TagMapOutput]
  }

  object GetSinkOutput {
    @inline
    def apply(
        Arn: js.UndefOr[String] = js.undefined,
        Id: js.UndefOr[String] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        Tags: js.UndefOr[TagMapOutput] = js.undefined
    ): GetSinkOutput = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSinkOutput]
    }
  }

  @js.native
  trait GetSinkPolicyInput extends js.Object {
    var SinkIdentifier: ResourceIdentifier
  }

  object GetSinkPolicyInput {
    @inline
    def apply(
        SinkIdentifier: ResourceIdentifier
    ): GetSinkPolicyInput = {
      val __obj = js.Dynamic.literal(
        "SinkIdentifier" -> SinkIdentifier.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetSinkPolicyInput]
    }
  }

  @js.native
  trait GetSinkPolicyOutput extends js.Object {
    var Policy: js.UndefOr[String]
    var SinkArn: js.UndefOr[String]
    var SinkId: js.UndefOr[String]
  }

  object GetSinkPolicyOutput {
    @inline
    def apply(
        Policy: js.UndefOr[String] = js.undefined,
        SinkArn: js.UndefOr[String] = js.undefined,
        SinkId: js.UndefOr[String] = js.undefined
    ): GetSinkPolicyOutput = {
      val __obj = js.Dynamic.literal()
      Policy.foreach(__v => __obj.updateDynamic("Policy")(__v.asInstanceOf[js.Any]))
      SinkArn.foreach(__v => __obj.updateDynamic("SinkArn")(__v.asInstanceOf[js.Any]))
      SinkId.foreach(__v => __obj.updateDynamic("SinkId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSinkPolicyOutput]
    }
  }

  @js.native
  trait ListAttachedLinksInput extends js.Object {
    var SinkIdentifier: ResourceIdentifier
    var MaxResults: js.UndefOr[ListAttachedLinksMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAttachedLinksInput {
    @inline
    def apply(
        SinkIdentifier: ResourceIdentifier,
        MaxResults: js.UndefOr[ListAttachedLinksMaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAttachedLinksInput = {
      val __obj = js.Dynamic.literal(
        "SinkIdentifier" -> SinkIdentifier.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAttachedLinksInput]
    }
  }

  /** A structure that contains information about one link attached to this monitoring account sink.
    */
  @js.native
  trait ListAttachedLinksItem extends js.Object {
    var Label: js.UndefOr[String]
    var LinkArn: js.UndefOr[String]
    var ResourceTypes: js.UndefOr[ResourceTypesOutput]
  }

  object ListAttachedLinksItem {
    @inline
    def apply(
        Label: js.UndefOr[String] = js.undefined,
        LinkArn: js.UndefOr[String] = js.undefined,
        ResourceTypes: js.UndefOr[ResourceTypesOutput] = js.undefined
    ): ListAttachedLinksItem = {
      val __obj = js.Dynamic.literal()
      Label.foreach(__v => __obj.updateDynamic("Label")(__v.asInstanceOf[js.Any]))
      LinkArn.foreach(__v => __obj.updateDynamic("LinkArn")(__v.asInstanceOf[js.Any]))
      ResourceTypes.foreach(__v => __obj.updateDynamic("ResourceTypes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAttachedLinksItem]
    }
  }

  @js.native
  trait ListAttachedLinksOutput extends js.Object {
    var Items: ListAttachedLinksItems
    var NextToken: js.UndefOr[String]
  }

  object ListAttachedLinksOutput {
    @inline
    def apply(
        Items: ListAttachedLinksItems,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListAttachedLinksOutput = {
      val __obj = js.Dynamic.literal(
        "Items" -> Items.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAttachedLinksOutput]
    }
  }

  @js.native
  trait ListLinksInput extends js.Object {
    var MaxResults: js.UndefOr[ListLinksMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListLinksInput {
    @inline
    def apply(
        MaxResults: js.UndefOr[ListLinksMaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListLinksInput = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLinksInput]
    }
  }

  /** A structure that contains information about one of this source account's links to a monitoring account.
    */
  @js.native
  trait ListLinksItem extends js.Object {
    var Arn: js.UndefOr[String]
    var Id: js.UndefOr[String]
    var Label: js.UndefOr[String]
    var ResourceTypes: js.UndefOr[ResourceTypesOutput]
    var SinkArn: js.UndefOr[String]
  }

  object ListLinksItem {
    @inline
    def apply(
        Arn: js.UndefOr[String] = js.undefined,
        Id: js.UndefOr[String] = js.undefined,
        Label: js.UndefOr[String] = js.undefined,
        ResourceTypes: js.UndefOr[ResourceTypesOutput] = js.undefined,
        SinkArn: js.UndefOr[String] = js.undefined
    ): ListLinksItem = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Label.foreach(__v => __obj.updateDynamic("Label")(__v.asInstanceOf[js.Any]))
      ResourceTypes.foreach(__v => __obj.updateDynamic("ResourceTypes")(__v.asInstanceOf[js.Any]))
      SinkArn.foreach(__v => __obj.updateDynamic("SinkArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLinksItem]
    }
  }

  @js.native
  trait ListLinksOutput extends js.Object {
    var Items: ListLinksItems
    var NextToken: js.UndefOr[String]
  }

  object ListLinksOutput {
    @inline
    def apply(
        Items: ListLinksItems,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListLinksOutput = {
      val __obj = js.Dynamic.literal(
        "Items" -> Items.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLinksOutput]
    }
  }

  @js.native
  trait ListSinksInput extends js.Object {
    var MaxResults: js.UndefOr[ListSinksMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListSinksInput {
    @inline
    def apply(
        MaxResults: js.UndefOr[ListSinksMaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListSinksInput = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSinksInput]
    }
  }

  /** A structure that contains information about one of this monitoring account's sinks.
    */
  @js.native
  trait ListSinksItem extends js.Object {
    var Arn: js.UndefOr[String]
    var Id: js.UndefOr[String]
    var Name: js.UndefOr[String]
  }

  object ListSinksItem {
    @inline
    def apply(
        Arn: js.UndefOr[String] = js.undefined,
        Id: js.UndefOr[String] = js.undefined,
        Name: js.UndefOr[String] = js.undefined
    ): ListSinksItem = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSinksItem]
    }
  }

  @js.native
  trait ListSinksOutput extends js.Object {
    var Items: ListSinksItems
    var NextToken: js.UndefOr[String]
  }

  object ListSinksOutput {
    @inline
    def apply(
        Items: ListSinksItems,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListSinksOutput = {
      val __obj = js.Dynamic.literal(
        "Items" -> Items.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSinksOutput]
    }
  }

  @js.native
  trait ListTagsForResourceInput extends js.Object {
    var ResourceArn: Arn
  }

  object ListTagsForResourceInput {
    @inline
    def apply(
        ResourceArn: Arn
    ): ListTagsForResourceInput = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceInput]
    }
  }

  @js.native
  trait ListTagsForResourceOutput extends js.Object {
    var Tags: js.UndefOr[TagMapOutput]
  }

  object ListTagsForResourceOutput {
    @inline
    def apply(
        Tags: js.UndefOr[TagMapOutput] = js.undefined
    ): ListTagsForResourceOutput = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceOutput]
    }
  }

  @js.native
  trait PutSinkPolicyInput extends js.Object {
    var Policy: SinkPolicy
    var SinkIdentifier: ResourceIdentifier
  }

  object PutSinkPolicyInput {
    @inline
    def apply(
        Policy: SinkPolicy,
        SinkIdentifier: ResourceIdentifier
    ): PutSinkPolicyInput = {
      val __obj = js.Dynamic.literal(
        "Policy" -> Policy.asInstanceOf[js.Any],
        "SinkIdentifier" -> SinkIdentifier.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutSinkPolicyInput]
    }
  }

  @js.native
  trait PutSinkPolicyOutput extends js.Object {
    var Policy: js.UndefOr[String]
    var SinkArn: js.UndefOr[String]
    var SinkId: js.UndefOr[String]
  }

  object PutSinkPolicyOutput {
    @inline
    def apply(
        Policy: js.UndefOr[String] = js.undefined,
        SinkArn: js.UndefOr[String] = js.undefined,
        SinkId: js.UndefOr[String] = js.undefined
    ): PutSinkPolicyOutput = {
      val __obj = js.Dynamic.literal()
      Policy.foreach(__v => __obj.updateDynamic("Policy")(__v.asInstanceOf[js.Any]))
      SinkArn.foreach(__v => __obj.updateDynamic("SinkArn")(__v.asInstanceOf[js.Any]))
      SinkId.foreach(__v => __obj.updateDynamic("SinkId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutSinkPolicyOutput]
    }
  }

  @js.native
  trait TagResourceInput extends js.Object {
    var ResourceArn: Arn
    var Tags: TagMapInput
  }

  object TagResourceInput {
    @inline
    def apply(
        ResourceArn: Arn,
        Tags: TagMapInput
    ): TagResourceInput = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagResourceInput]
    }
  }

  @js.native
  trait TagResourceOutput extends js.Object

  object TagResourceOutput {
    @inline
    def apply(): TagResourceOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagResourceOutput]
    }
  }

  @js.native
  trait UntagResourceInput extends js.Object {
    var ResourceArn: Arn
    var TagKeys: TagKeys
  }

  object UntagResourceInput {
    @inline
    def apply(
        ResourceArn: Arn,
        TagKeys: TagKeys
    ): UntagResourceInput = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagResourceInput]
    }
  }

  @js.native
  trait UntagResourceOutput extends js.Object

  object UntagResourceOutput {
    @inline
    def apply(): UntagResourceOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UntagResourceOutput]
    }
  }

  @js.native
  trait UpdateLinkInput extends js.Object {
    var Identifier: ResourceIdentifier
    var ResourceTypes: ResourceTypesInput
  }

  object UpdateLinkInput {
    @inline
    def apply(
        Identifier: ResourceIdentifier,
        ResourceTypes: ResourceTypesInput
    ): UpdateLinkInput = {
      val __obj = js.Dynamic.literal(
        "Identifier" -> Identifier.asInstanceOf[js.Any],
        "ResourceTypes" -> ResourceTypes.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateLinkInput]
    }
  }

  @js.native
  trait UpdateLinkOutput extends js.Object {
    var Arn: js.UndefOr[String]
    var Id: js.UndefOr[String]
    var Label: js.UndefOr[String]
    var LabelTemplate: js.UndefOr[LabelTemplate]
    var ResourceTypes: js.UndefOr[ResourceTypesOutput]
    var SinkArn: js.UndefOr[String]
    var Tags: js.UndefOr[TagMapOutput]
  }

  object UpdateLinkOutput {
    @inline
    def apply(
        Arn: js.UndefOr[String] = js.undefined,
        Id: js.UndefOr[String] = js.undefined,
        Label: js.UndefOr[String] = js.undefined,
        LabelTemplate: js.UndefOr[LabelTemplate] = js.undefined,
        ResourceTypes: js.UndefOr[ResourceTypesOutput] = js.undefined,
        SinkArn: js.UndefOr[String] = js.undefined,
        Tags: js.UndefOr[TagMapOutput] = js.undefined
    ): UpdateLinkOutput = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Label.foreach(__v => __obj.updateDynamic("Label")(__v.asInstanceOf[js.Any]))
      LabelTemplate.foreach(__v => __obj.updateDynamic("LabelTemplate")(__v.asInstanceOf[js.Any]))
      ResourceTypes.foreach(__v => __obj.updateDynamic("ResourceTypes")(__v.asInstanceOf[js.Any]))
      SinkArn.foreach(__v => __obj.updateDynamic("SinkArn")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateLinkOutput]
    }
  }
}
