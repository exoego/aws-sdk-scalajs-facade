package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object snowball {
  type AddressId                  = String
  type AddressList                = js.Array[Address]
  type AmiId                      = String
  type ClusterId                  = String
  type ClusterListEntryList       = js.Array[ClusterListEntry]
  type CompatibleImageList        = js.Array[CompatibleImage]
  type Ec2AmiResourceList         = js.Array[Ec2AmiResource]
  type EventTriggerDefinitionList = js.Array[EventTriggerDefinition]
  type JobId                      = String
  type JobListEntryList           = js.Array[JobListEntry]
  type JobMetadataList            = js.Array[JobMetadata]
  type JobStateList               = js.Array[JobState]
  type KmsKeyARN                  = String
  type LambdaResourceList         = js.Array[LambdaResource]
  type ListLimit                  = Int
  type ResourceARN                = String
  type RoleARN                    = String
  type S3ResourceList             = js.Array[S3Resource]
  type SnsTopicARN                = String
  type Timestamp                  = js.Date

  implicit final class SnowballOps(private val service: Snowball) extends AnyVal {

    @inline def cancelClusterFuture(params: CancelClusterRequest): Future[CancelClusterResult] =
      service.cancelCluster(params).promise().toFuture
    @inline def cancelJobFuture(params: CancelJobRequest): Future[CancelJobResult] =
      service.cancelJob(params).promise().toFuture
    @inline def createAddressFuture(params: CreateAddressRequest): Future[CreateAddressResult] =
      service.createAddress(params).promise().toFuture
    @inline def createClusterFuture(params: CreateClusterRequest): Future[CreateClusterResult] =
      service.createCluster(params).promise().toFuture
    @inline def createJobFuture(params: CreateJobRequest): Future[CreateJobResult] =
      service.createJob(params).promise().toFuture
    @inline def describeAddressFuture(params: DescribeAddressRequest): Future[DescribeAddressResult] =
      service.describeAddress(params).promise().toFuture
    @inline def describeAddressesFuture(params: DescribeAddressesRequest): Future[DescribeAddressesResult] =
      service.describeAddresses(params).promise().toFuture
    @inline def describeClusterFuture(params: DescribeClusterRequest): Future[DescribeClusterResult] =
      service.describeCluster(params).promise().toFuture
    @inline def describeJobFuture(params: DescribeJobRequest): Future[DescribeJobResult] =
      service.describeJob(params).promise().toFuture
    @inline def getJobManifestFuture(params: GetJobManifestRequest): Future[GetJobManifestResult] =
      service.getJobManifest(params).promise().toFuture
    @inline def getJobUnlockCodeFuture(params: GetJobUnlockCodeRequest): Future[GetJobUnlockCodeResult] =
      service.getJobUnlockCode(params).promise().toFuture
    @inline def getSnowballUsageFuture(params: GetSnowballUsageRequest): Future[GetSnowballUsageResult] =
      service.getSnowballUsage(params).promise().toFuture
    @inline def getSoftwareUpdatesFuture(params: GetSoftwareUpdatesRequest): Future[GetSoftwareUpdatesResult] =
      service.getSoftwareUpdates(params).promise().toFuture
    @inline def listClusterJobsFuture(params: ListClusterJobsRequest): Future[ListClusterJobsResult] =
      service.listClusterJobs(params).promise().toFuture
    @inline def listClustersFuture(params: ListClustersRequest): Future[ListClustersResult] =
      service.listClusters(params).promise().toFuture
    @inline def listCompatibleImagesFuture(params: ListCompatibleImagesRequest): Future[ListCompatibleImagesResult] =
      service.listCompatibleImages(params).promise().toFuture
    @inline def listJobsFuture(params: ListJobsRequest): Future[ListJobsResult] =
      service.listJobs(params).promise().toFuture
    @inline def updateClusterFuture(params: UpdateClusterRequest): Future[UpdateClusterResult] =
      service.updateCluster(params).promise().toFuture
    @inline def updateJobFuture(params: UpdateJobRequest): Future[UpdateJobResult] =
      service.updateJob(params).promise().toFuture
  }
}

package snowball {
  @js.native
  @JSImport("aws-sdk", "Snowball")
  class Snowball() extends js.Object {
    def this(config: AWSConfig) = this()

    def cancelCluster(params: CancelClusterRequest): Request[CancelClusterResult]                      = js.native
    def cancelJob(params: CancelJobRequest): Request[CancelJobResult]                                  = js.native
    def createAddress(params: CreateAddressRequest): Request[CreateAddressResult]                      = js.native
    def createCluster(params: CreateClusterRequest): Request[CreateClusterResult]                      = js.native
    def createJob(params: CreateJobRequest): Request[CreateJobResult]                                  = js.native
    def describeAddress(params: DescribeAddressRequest): Request[DescribeAddressResult]                = js.native
    def describeAddresses(params: DescribeAddressesRequest): Request[DescribeAddressesResult]          = js.native
    def describeCluster(params: DescribeClusterRequest): Request[DescribeClusterResult]                = js.native
    def describeJob(params: DescribeJobRequest): Request[DescribeJobResult]                            = js.native
    def getJobManifest(params: GetJobManifestRequest): Request[GetJobManifestResult]                   = js.native
    def getJobUnlockCode(params: GetJobUnlockCodeRequest): Request[GetJobUnlockCodeResult]             = js.native
    def getSnowballUsage(params: GetSnowballUsageRequest): Request[GetSnowballUsageResult]             = js.native
    def getSoftwareUpdates(params: GetSoftwareUpdatesRequest): Request[GetSoftwareUpdatesResult]       = js.native
    def listClusterJobs(params: ListClusterJobsRequest): Request[ListClusterJobsResult]                = js.native
    def listClusters(params: ListClustersRequest): Request[ListClustersResult]                         = js.native
    def listCompatibleImages(params: ListCompatibleImagesRequest): Request[ListCompatibleImagesResult] = js.native
    def listJobs(params: ListJobsRequest): Request[ListJobsResult]                                     = js.native
    def updateCluster(params: UpdateClusterRequest): Request[UpdateClusterResult]                      = js.native
    def updateJob(params: UpdateJobRequest): Request[UpdateJobResult]                                  = js.native
  }

  /**
    * The address that you want the Snowball or Snowballs associated with a specific job to be shipped to. Addresses are validated at the time of creation. The address you provide must be located within the serviceable area of your region. Although no individual elements of the <code>Address</code> are required, if the address is invalid or unsupported, then an exception is thrown.
    */
  @js.native
  @Factory
  trait Address extends js.Object {
    var AddressId: js.UndefOr[AddressId]
    var City: js.UndefOr[String]
    var Company: js.UndefOr[String]
    var Country: js.UndefOr[String]
    var IsRestricted: js.UndefOr[Boolean]
    var Landmark: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var PhoneNumber: js.UndefOr[String]
    var PostalCode: js.UndefOr[String]
    var PrefectureOrDistrict: js.UndefOr[String]
    var StateOrProvince: js.UndefOr[String]
    var Street1: js.UndefOr[String]
    var Street2: js.UndefOr[String]
    var Street3: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait CancelClusterRequest extends js.Object {
    var ClusterId: ClusterId
  }

  @js.native
  @Factory
  trait CancelClusterResult extends js.Object {}

  @js.native
  @Factory
  trait CancelJobRequest extends js.Object {
    var JobId: JobId
  }

  @js.native
  @Factory
  trait CancelJobResult extends js.Object {}

  /**
    * Contains a cluster's state, a cluster's ID, and other important information.
    */
  @js.native
  @Factory
  trait ClusterListEntry extends js.Object {
    var ClusterId: js.UndefOr[String]
    var ClusterState: js.UndefOr[ClusterState]
    var CreationDate: js.UndefOr[Timestamp]
    var Description: js.UndefOr[String]
  }

  /**
    * Contains metadata about a specific cluster.
    */
  @js.native
  @Factory
  trait ClusterMetadata extends js.Object {
    var AddressId: js.UndefOr[AddressId]
    var ClusterId: js.UndefOr[String]
    var ClusterState: js.UndefOr[ClusterState]
    var CreationDate: js.UndefOr[Timestamp]
    var Description: js.UndefOr[String]
    var ForwardingAddressId: js.UndefOr[AddressId]
    var JobType: js.UndefOr[JobType]
    var KmsKeyARN: js.UndefOr[KmsKeyARN]
    var Notification: js.UndefOr[Notification]
    var Resources: js.UndefOr[JobResource]
    var RoleARN: js.UndefOr[RoleARN]
    var ShippingOption: js.UndefOr[ShippingOption]
    var SnowballType: js.UndefOr[SnowballType]
  }

  @js.native
  sealed trait ClusterState extends js.Any
  object ClusterState extends js.Object {
    val AwaitingQuorum = "AwaitingQuorum".asInstanceOf[ClusterState]
    val Pending        = "Pending".asInstanceOf[ClusterState]
    val InUse          = "InUse".asInstanceOf[ClusterState]
    val Complete       = "Complete".asInstanceOf[ClusterState]
    val Cancelled      = "Cancelled".asInstanceOf[ClusterState]

    val values = js.Object.freeze(js.Array(AwaitingQuorum, Pending, InUse, Complete, Cancelled))
  }

  /**
    * A JSON-formatted object that describes a compatible Amazon Machine Image (AMI), including the ID and name for a Snowball Edge AMI. This AMI is compatible with the device's physical hardware requirements, and it should be able to be run in an SBE1 instance on the device.
    */
  @js.native
  @Factory
  trait CompatibleImage extends js.Object {
    var AmiId: js.UndefOr[String]
    var Name: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait CreateAddressRequest extends js.Object {
    var Address: Address
  }

  @js.native
  @Factory
  trait CreateAddressResult extends js.Object {
    var AddressId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait CreateClusterRequest extends js.Object {
    var AddressId: AddressId
    var JobType: JobType
    var Resources: JobResource
    var RoleARN: RoleARN
    var ShippingOption: ShippingOption
    var Description: js.UndefOr[String]
    var ForwardingAddressId: js.UndefOr[AddressId]
    var KmsKeyARN: js.UndefOr[KmsKeyARN]
    var Notification: js.UndefOr[Notification]
    var SnowballType: js.UndefOr[SnowballType]
  }

  @js.native
  @Factory
  trait CreateClusterResult extends js.Object {
    var ClusterId: js.UndefOr[ClusterId]
  }

  @js.native
  @Factory
  trait CreateJobRequest extends js.Object {
    var AddressId: js.UndefOr[AddressId]
    var ClusterId: js.UndefOr[ClusterId]
    var Description: js.UndefOr[String]
    var ForwardingAddressId: js.UndefOr[AddressId]
    var JobType: js.UndefOr[JobType]
    var KmsKeyARN: js.UndefOr[KmsKeyARN]
    var Notification: js.UndefOr[Notification]
    var Resources: js.UndefOr[JobResource]
    var RoleARN: js.UndefOr[RoleARN]
    var ShippingOption: js.UndefOr[ShippingOption]
    var SnowballCapacityPreference: js.UndefOr[SnowballCapacity]
    var SnowballType: js.UndefOr[SnowballType]
  }

  @js.native
  @Factory
  trait CreateJobResult extends js.Object {
    var JobId: js.UndefOr[JobId]
  }

  /**
    * Defines the real-time status of a Snowball's data transfer while the device is at AWS. This data is only available while a job has a <code>JobState</code> value of <code>InProgress</code>, for both import and export jobs.
    */
  @js.native
  @Factory
  trait DataTransfer extends js.Object {
    var BytesTransferred: js.UndefOr[Double]
    var ObjectsTransferred: js.UndefOr[Double]
    var TotalBytes: js.UndefOr[Double]
    var TotalObjects: js.UndefOr[Double]
  }

  @js.native
  @Factory
  trait DescribeAddressRequest extends js.Object {
    var AddressId: AddressId
  }

  @js.native
  @Factory
  trait DescribeAddressResult extends js.Object {
    var Address: js.UndefOr[Address]
  }

  @js.native
  @Factory
  trait DescribeAddressesRequest extends js.Object {
    var MaxResults: js.UndefOr[ListLimit]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeAddressesResult extends js.Object {
    var Addresses: js.UndefOr[AddressList]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeClusterRequest extends js.Object {
    var ClusterId: ClusterId
  }

  @js.native
  @Factory
  trait DescribeClusterResult extends js.Object {
    var ClusterMetadata: js.UndefOr[ClusterMetadata]
  }

  @js.native
  @Factory
  trait DescribeJobRequest extends js.Object {
    var JobId: JobId
  }

  @js.native
  @Factory
  trait DescribeJobResult extends js.Object {
    var JobMetadata: js.UndefOr[JobMetadata]
    var SubJobMetadata: js.UndefOr[JobMetadataList]
  }

  /**
    * A JSON-formatted object that contains the IDs for an Amazon Machine Image (AMI), including the Amazon EC2 AMI ID and the Snowball Edge AMI ID. Each AMI has these two IDs to simplify identifying the AMI in both the AWS Cloud and on the device.
    */
  @js.native
  @Factory
  trait Ec2AmiResource extends js.Object {
    var AmiId: AmiId
    var SnowballAmiId: js.UndefOr[String]
  }

  /**
    * The container for the EventResourceARN.
    */
  @js.native
  @Factory
  trait EventTriggerDefinition extends js.Object {
    var EventResourceARN: js.UndefOr[ResourceARN]
  }

  @js.native
  @Factory
  trait GetJobManifestRequest extends js.Object {
    var JobId: JobId
  }

  @js.native
  @Factory
  trait GetJobManifestResult extends js.Object {
    var ManifestURI: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetJobUnlockCodeRequest extends js.Object {
    var JobId: JobId
  }

  @js.native
  @Factory
  trait GetJobUnlockCodeResult extends js.Object {
    var UnlockCode: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetSnowballUsageRequest extends js.Object {}

  @js.native
  @Factory
  trait GetSnowballUsageResult extends js.Object {
    var SnowballLimit: js.UndefOr[Int]
    var SnowballsInUse: js.UndefOr[Int]
  }

  @js.native
  @Factory
  trait GetSoftwareUpdatesRequest extends js.Object {
    var JobId: JobId
  }

  @js.native
  @Factory
  trait GetSoftwareUpdatesResult extends js.Object {
    var UpdatesURI: js.UndefOr[String]
  }

  /**
    * Each <code>JobListEntry</code> object contains a job's state, a job's ID, and a value that indicates whether the job is a job part, in the case of an export job.
    */
  @js.native
  @Factory
  trait JobListEntry extends js.Object {
    var CreationDate: js.UndefOr[Timestamp]
    var Description: js.UndefOr[String]
    var IsMaster: js.UndefOr[Boolean]
    var JobId: js.UndefOr[String]
    var JobState: js.UndefOr[JobState]
    var JobType: js.UndefOr[JobType]
    var SnowballType: js.UndefOr[SnowballType]
  }

  /**
    * Contains job logs. Whenever Snowball is used to import data into or export data out of Amazon S3, you'll have the option of downloading a PDF job report. Job logs are returned as a part of the response syntax of the <code>DescribeJob</code> action in the <code>JobMetadata</code> data type. The job logs can be accessed for up to 60 minutes after this request has been made. To access any of the job logs after 60 minutes have passed, you'll have to make another call to the <code>DescribeJob</code> action.
    *  For import jobs, the PDF job report becomes available at the end of the import process. For export jobs, your job report typically becomes available while the Snowball for your job part is being delivered to you.
    *  The job report provides you insight into the state of your Amazon S3 data transfer. The report includes details about your job or job part for your records.
    *  For deeper visibility into the status of your transferred objects, you can look at the two associated logs: a success log and a failure log. The logs are saved in comma-separated value (CSV) format, and the name of each log includes the ID of the job or job part that the log describes.
    */
  @js.native
  @Factory
  trait JobLogs extends js.Object {
    var JobCompletionReportURI: js.UndefOr[String]
    var JobFailureLogURI: js.UndefOr[String]
    var JobSuccessLogURI: js.UndefOr[String]
  }

  /**
    * Contains information about a specific job including shipping information, job status, and other important metadata. This information is returned as a part of the response syntax of the <code>DescribeJob</code> action.
    */
  @js.native
  @Factory
  trait JobMetadata extends js.Object {
    var AddressId: js.UndefOr[AddressId]
    var ClusterId: js.UndefOr[String]
    var CreationDate: js.UndefOr[Timestamp]
    var DataTransferProgress: js.UndefOr[DataTransfer]
    var Description: js.UndefOr[String]
    var ForwardingAddressId: js.UndefOr[AddressId]
    var JobId: js.UndefOr[String]
    var JobLogInfo: js.UndefOr[JobLogs]
    var JobState: js.UndefOr[JobState]
    var JobType: js.UndefOr[JobType]
    var KmsKeyARN: js.UndefOr[KmsKeyARN]
    var Notification: js.UndefOr[Notification]
    var Resources: js.UndefOr[JobResource]
    var RoleARN: js.UndefOr[RoleARN]
    var ShippingDetails: js.UndefOr[ShippingDetails]
    var SnowballCapacityPreference: js.UndefOr[SnowballCapacity]
    var SnowballType: js.UndefOr[SnowballType]
  }

  /**
    * Contains an array of AWS resource objects. Each object represents an Amazon S3 bucket, an AWS Lambda function, or an Amazon Machine Image (AMI) based on Amazon EC2 that is associated with a particular job.
    */
  @js.native
  @Factory
  trait JobResource extends js.Object {
    var Ec2AmiResources: js.UndefOr[Ec2AmiResourceList]
    var LambdaResources: js.UndefOr[LambdaResourceList]
    var S3Resources: js.UndefOr[S3ResourceList]
  }

  @js.native
  sealed trait JobState extends js.Any
  object JobState extends js.Object {
    val New                    = "New".asInstanceOf[JobState]
    val PreparingAppliance     = "PreparingAppliance".asInstanceOf[JobState]
    val PreparingShipment      = "PreparingShipment".asInstanceOf[JobState]
    val InTransitToCustomer    = "InTransitToCustomer".asInstanceOf[JobState]
    val WithCustomer           = "WithCustomer".asInstanceOf[JobState]
    val InTransitToAWS         = "InTransitToAWS".asInstanceOf[JobState]
    val WithAWSSortingFacility = "WithAWSSortingFacility".asInstanceOf[JobState]
    val WithAWS                = "WithAWS".asInstanceOf[JobState]
    val InProgress             = "InProgress".asInstanceOf[JobState]
    val Complete               = "Complete".asInstanceOf[JobState]
    val Cancelled              = "Cancelled".asInstanceOf[JobState]
    val Listing                = "Listing".asInstanceOf[JobState]
    val Pending                = "Pending".asInstanceOf[JobState]

    val values = js.Object.freeze(
      js.Array(
        New,
        PreparingAppliance,
        PreparingShipment,
        InTransitToCustomer,
        WithCustomer,
        InTransitToAWS,
        WithAWSSortingFacility,
        WithAWS,
        InProgress,
        Complete,
        Cancelled,
        Listing,
        Pending
      )
    )
  }

  @js.native
  sealed trait JobType extends js.Any
  object JobType extends js.Object {
    val IMPORT    = "IMPORT".asInstanceOf[JobType]
    val EXPORT    = "EXPORT".asInstanceOf[JobType]
    val LOCAL_USE = "LOCAL_USE".asInstanceOf[JobType]

    val values = js.Object.freeze(js.Array(IMPORT, EXPORT, LOCAL_USE))
  }

  /**
    * Contains a key range. For export jobs, a <code>S3Resource</code> object can have an optional <code>KeyRange</code> value. The length of the range is defined at job creation, and has either an inclusive <code>BeginMarker</code>, an inclusive <code>EndMarker</code>, or both. Ranges are UTF-8 binary sorted.
    */
  @js.native
  @Factory
  trait KeyRange extends js.Object {
    var BeginMarker: js.UndefOr[String]
    var EndMarker: js.UndefOr[String]
  }

  /**
    * Identifies
    */
  @js.native
  @Factory
  trait LambdaResource extends js.Object {
    var EventTriggers: js.UndefOr[EventTriggerDefinitionList]
    var LambdaArn: js.UndefOr[ResourceARN]
  }

  @js.native
  @Factory
  trait ListClusterJobsRequest extends js.Object {
    var ClusterId: ClusterId
    var MaxResults: js.UndefOr[ListLimit]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListClusterJobsResult extends js.Object {
    var JobListEntries: js.UndefOr[JobListEntryList]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListClustersRequest extends js.Object {
    var MaxResults: js.UndefOr[ListLimit]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListClustersResult extends js.Object {
    var ClusterListEntries: js.UndefOr[ClusterListEntryList]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListCompatibleImagesRequest extends js.Object {
    var MaxResults: js.UndefOr[ListLimit]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListCompatibleImagesResult extends js.Object {
    var CompatibleImages: js.UndefOr[CompatibleImageList]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListJobsRequest extends js.Object {
    var MaxResults: js.UndefOr[ListLimit]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListJobsResult extends js.Object {
    var JobListEntries: js.UndefOr[JobListEntryList]
    var NextToken: js.UndefOr[String]
  }

  /**
    * The Amazon Simple Notification Service (Amazon SNS) notification settings associated with a specific job. The <code>Notification</code> object is returned as a part of the response syntax of the <code>DescribeJob</code> action in the <code>JobMetadata</code> data type.
    *  When the notification settings are defined during job creation, you can choose to notify based on a specific set of job states using the <code>JobStatesToNotify</code> array of strings, or you can specify that you want to have Amazon SNS notifications sent out for all job states with <code>NotifyAll</code> set to true.
    */
  @js.native
  @Factory
  trait Notification extends js.Object {
    var JobStatesToNotify: js.UndefOr[JobStateList]
    var NotifyAll: js.UndefOr[Boolean]
    var SnsTopicARN: js.UndefOr[SnsTopicARN]
  }

  /**
    * Each <code>S3Resource</code> object represents an Amazon S3 bucket that your transferred data will be exported from or imported into. For export jobs, this object can have an optional <code>KeyRange</code> value. The length of the range is defined at job creation, and has either an inclusive <code>BeginMarker</code>, an inclusive <code>EndMarker</code>, or both. Ranges are UTF-8 binary sorted.
    */
  @js.native
  @Factory
  trait S3Resource extends js.Object {
    var BucketArn: js.UndefOr[ResourceARN]
    var KeyRange: js.UndefOr[KeyRange]
  }

  /**
    * The <code>Status</code> and <code>TrackingNumber</code> information for an inbound or outbound shipment.
    */
  @js.native
  @Factory
  trait Shipment extends js.Object {
    var Status: js.UndefOr[String]
    var TrackingNumber: js.UndefOr[String]
  }

  /**
    * A job's shipping information, including inbound and outbound tracking numbers and shipping speed options.
    */
  @js.native
  @Factory
  trait ShippingDetails extends js.Object {
    var InboundShipment: js.UndefOr[Shipment]
    var OutboundShipment: js.UndefOr[Shipment]
    var ShippingOption: js.UndefOr[ShippingOption]
  }

  @js.native
  sealed trait ShippingOption extends js.Any
  object ShippingOption extends js.Object {
    val SECOND_DAY = "SECOND_DAY".asInstanceOf[ShippingOption]
    val NEXT_DAY   = "NEXT_DAY".asInstanceOf[ShippingOption]
    val EXPRESS    = "EXPRESS".asInstanceOf[ShippingOption]
    val STANDARD   = "STANDARD".asInstanceOf[ShippingOption]

    val values = js.Object.freeze(js.Array(SECOND_DAY, NEXT_DAY, EXPRESS, STANDARD))
  }

  @js.native
  sealed trait SnowballCapacity extends js.Any
  object SnowballCapacity extends js.Object {
    val T50          = "T50".asInstanceOf[SnowballCapacity]
    val T80          = "T80".asInstanceOf[SnowballCapacity]
    val T100         = "T100".asInstanceOf[SnowballCapacity]
    val T42          = "T42".asInstanceOf[SnowballCapacity]
    val NoPreference = "NoPreference".asInstanceOf[SnowballCapacity]

    val values = js.Object.freeze(js.Array(T50, T80, T100, T42, NoPreference))
  }

  @js.native
  sealed trait SnowballType extends js.Any
  object SnowballType extends js.Object {
    val STANDARD = "STANDARD".asInstanceOf[SnowballType]
    val EDGE     = "EDGE".asInstanceOf[SnowballType]
    val EDGE_C   = "EDGE_C".asInstanceOf[SnowballType]
    val EDGE_CG  = "EDGE_CG".asInstanceOf[SnowballType]

    val values = js.Object.freeze(js.Array(STANDARD, EDGE, EDGE_C, EDGE_CG))
  }

  @js.native
  @Factory
  trait UpdateClusterRequest extends js.Object {
    var ClusterId: ClusterId
    var AddressId: js.UndefOr[AddressId]
    var Description: js.UndefOr[String]
    var ForwardingAddressId: js.UndefOr[AddressId]
    var Notification: js.UndefOr[Notification]
    var Resources: js.UndefOr[JobResource]
    var RoleARN: js.UndefOr[RoleARN]
    var ShippingOption: js.UndefOr[ShippingOption]
  }

  @js.native
  @Factory
  trait UpdateClusterResult extends js.Object {}

  @js.native
  @Factory
  trait UpdateJobRequest extends js.Object {
    var JobId: JobId
    var AddressId: js.UndefOr[AddressId]
    var Description: js.UndefOr[String]
    var ForwardingAddressId: js.UndefOr[AddressId]
    var Notification: js.UndefOr[Notification]
    var Resources: js.UndefOr[JobResource]
    var RoleARN: js.UndefOr[RoleARN]
    var ShippingOption: js.UndefOr[ShippingOption]
    var SnowballCapacityPreference: js.UndefOr[SnowballCapacity]
  }

  @js.native
  @Factory
  trait UpdateJobResult extends js.Object {}
}
