package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object outposts {
  type AccountId                  = String
  type AvailabilityZone           = String
  type AvailabilityZoneId         = String
  type InstanceType               = String
  type InstanceTypeListDefinition = js.Array[InstanceTypeItem]
  type LifeCycleStatus            = String
  type MaxResults1000             = Int
  type OutpostArn                 = String
  type OutpostDescription         = String
  type OutpostId                  = String
  type OutpostName                = String
  type OwnerId                    = String
  type SiteDescription            = String
  type SiteId                     = String
  type SiteName                   = String
  type Token                      = String
  type outpostListDefinition      = js.Array[Outpost]
  type siteListDefinition         = js.Array[Site]

  implicit final class OutpostsOps(private val service: Outposts) extends AnyVal {

    @inline def createOutpostFuture(params: CreateOutpostInput): Future[CreateOutpostOutput] =
      service.createOutpost(params).promise().toFuture
    @inline def getOutpostFuture(params: GetOutpostInput): Future[GetOutpostOutput] =
      service.getOutpost(params).promise().toFuture
    @inline def getOutpostInstanceTypesFuture(
        params: GetOutpostInstanceTypesInput
    ): Future[GetOutpostInstanceTypesOutput] = service.getOutpostInstanceTypes(params).promise().toFuture
    @inline def listOutpostsFuture(params: ListOutpostsInput): Future[ListOutpostsOutput] =
      service.listOutposts(params).promise().toFuture
    @inline def listSitesFuture(params: ListSitesInput): Future[ListSitesOutput] =
      service.listSites(params).promise().toFuture
  }
}

package outposts {
  @js.native
  @JSImport("aws-sdk", "Outposts")
  class Outposts() extends js.Object {
    def this(config: AWSConfig) = this()

    def createOutpost(params: CreateOutpostInput): Request[CreateOutpostOutput] = js.native
    def getOutpost(params: GetOutpostInput): Request[GetOutpostOutput]          = js.native
    def getOutpostInstanceTypes(params: GetOutpostInstanceTypesInput): Request[GetOutpostInstanceTypesOutput] =
      js.native
    def listOutposts(params: ListOutpostsInput): Request[ListOutpostsOutput] = js.native
    def listSites(params: ListSitesInput): Request[ListSitesOutput]          = js.native
  }

  @js.native
  @Factory
  trait CreateOutpostInput extends js.Object {
    var SiteId: SiteId
    var AvailabilityZone: js.UndefOr[AvailabilityZone]
    var AvailabilityZoneId: js.UndefOr[AvailabilityZoneId]
    var Description: js.UndefOr[OutpostDescription]
    var Name: js.UndefOr[OutpostName]
  }

  @js.native
  @Factory
  trait CreateOutpostOutput extends js.Object {
    var Outpost: js.UndefOr[Outpost]
  }

  @js.native
  @Factory
  trait GetOutpostInput extends js.Object {
    var OutpostId: OutpostId
  }

  @js.native
  @Factory
  trait GetOutpostInstanceTypesInput extends js.Object {
    var OutpostId: OutpostId
    var MaxResults: js.UndefOr[MaxResults1000]
    var NextToken: js.UndefOr[Token]
  }

  @js.native
  @Factory
  trait GetOutpostInstanceTypesOutput extends js.Object {
    var InstanceTypes: js.UndefOr[InstanceTypeListDefinition]
    var NextToken: js.UndefOr[Token]
    var OutpostArn: js.UndefOr[OutpostArn]
    var OutpostId: js.UndefOr[OutpostId]
  }

  @js.native
  @Factory
  trait GetOutpostOutput extends js.Object {
    var Outpost: js.UndefOr[Outpost]
  }

  /**
    * Information about an instance type.
    */
  @js.native
  @Factory
  trait InstanceTypeItem extends js.Object {
    var InstanceType: js.UndefOr[InstanceType]
  }

  @js.native
  @Factory
  trait ListOutpostsInput extends js.Object {
    var MaxResults: js.UndefOr[MaxResults1000]
    var NextToken: js.UndefOr[Token]
  }

  @js.native
  @Factory
  trait ListOutpostsOutput extends js.Object {
    var NextToken: js.UndefOr[Token]
    var Outposts: js.UndefOr[outpostListDefinition]
  }

  @js.native
  @Factory
  trait ListSitesInput extends js.Object {
    var MaxResults: js.UndefOr[MaxResults1000]
    var NextToken: js.UndefOr[Token]
  }

  @js.native
  @Factory
  trait ListSitesOutput extends js.Object {
    var NextToken: js.UndefOr[Token]
    var Sites: js.UndefOr[siteListDefinition]
  }

  /**
    * Information about an Outpost.
    */
  @js.native
  @Factory
  trait Outpost extends js.Object {
    var AvailabilityZone: js.UndefOr[AvailabilityZone]
    var AvailabilityZoneId: js.UndefOr[AvailabilityZoneId]
    var Description: js.UndefOr[OutpostDescription]
    var LifeCycleStatus: js.UndefOr[LifeCycleStatus]
    var Name: js.UndefOr[OutpostName]
    var OutpostArn: js.UndefOr[OutpostArn]
    var OutpostId: js.UndefOr[OutpostId]
    var OwnerId: js.UndefOr[OwnerId]
    var SiteId: js.UndefOr[SiteId]
  }

  /**
    * Information about a site.
    */
  @js.native
  @Factory
  trait Site extends js.Object {
    var AccountId: js.UndefOr[AccountId]
    var Description: js.UndefOr[SiteDescription]
    var Name: js.UndefOr[SiteName]
    var SiteId: js.UndefOr[SiteId]
  }
}
