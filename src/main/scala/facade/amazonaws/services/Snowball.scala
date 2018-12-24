package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object snowball {
  type AddressId = String
  type AddressList = js.Array[Address]
  type AmiId = String
  type ClusterId = String
  type ClusterListEntryList = js.Array[ClusterListEntry]
  type ClusterState = String
  type CompatibleImageList = js.Array[CompatibleImage]
  type Ec2AmiResourceList = js.Array[Ec2AmiResource]
  type EventTriggerDefinitionList = js.Array[EventTriggerDefinition]
  type JobId = String
  type JobListEntryList = js.Array[JobListEntry]
  type JobMetadataList = js.Array[JobMetadata]
  type JobState = String
  type JobStateList = js.Array[JobState]
  type JobType = String
  type KmsKeyARN = String
  type LambdaResourceList = js.Array[LambdaResource]
  type ListLimit = Int
  type ResourceARN = String
  type RoleARN = String
  type S3ResourceList = js.Array[S3Resource]
  type ShippingOption = String
  type SnowballCapacity = String
  type SnowballType = String
  type SnsTopicARN = String
  type Timestamp = js.Date
}

package snowball {
  @js.native
  @JSImport("aws-sdk", "Snowball")
  class Snowball() extends js.Object {
    def this(config: AWSConfig) = this()

    def cancelCluster(params: CancelClusterRequest): Request[CancelClusterResult] = js.native
    def cancelJob(params: CancelJobRequest): Request[CancelJobResult] = js.native
    def createAddress(params: CreateAddressRequest): Request[CreateAddressResult] = js.native
    def createCluster(params: CreateClusterRequest): Request[CreateClusterResult] = js.native
    def createJob(params: CreateJobRequest): Request[CreateJobResult] = js.native
    def describeAddress(params: DescribeAddressRequest): Request[DescribeAddressResult] = js.native
    def describeAddresses(params: DescribeAddressesRequest): Request[DescribeAddressesResult] = js.native
    def describeCluster(params: DescribeClusterRequest): Request[DescribeClusterResult] = js.native
    def describeJob(params: DescribeJobRequest): Request[DescribeJobResult] = js.native
    def getJobManifest(params: GetJobManifestRequest): Request[GetJobManifestResult] = js.native
    def getJobUnlockCode(params: GetJobUnlockCodeRequest): Request[GetJobUnlockCodeResult] = js.native
    def getSnowballUsage(params: GetSnowballUsageRequest): Request[GetSnowballUsageResult] = js.native
    def listClusterJobs(params: ListClusterJobsRequest): Request[ListClusterJobsResult] = js.native
    def listClusters(params: ListClustersRequest): Request[ListClustersResult] = js.native
    def listCompatibleImages(params: ListCompatibleImagesRequest): Request[ListCompatibleImagesResult] = js.native
    def listJobs(params: ListJobsRequest): Request[ListJobsResult] = js.native
    def updateCluster(params: UpdateClusterRequest): Request[UpdateClusterResult] = js.native
    def updateJob(params: UpdateJobRequest): Request[UpdateJobResult] = js.native
  }

  /**
   * The address that you want the Snowball or Snowballs associated with a specific job to be shipped to. Addresses are validated at the time of creation. The address you provide must be located within the serviceable area of your region. Although no individual elements of the <code>Address</code> are required, if the address is invalid or unsupported, then an exception is thrown.
   */
  @js.native
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

  object Address {
    def apply(
      AddressId: js.UndefOr[AddressId] = js.undefined,
      City: js.UndefOr[String] = js.undefined,
      Company: js.UndefOr[String] = js.undefined,
      Country: js.UndefOr[String] = js.undefined,
      IsRestricted: js.UndefOr[Boolean] = js.undefined,
      Landmark: js.UndefOr[String] = js.undefined,
      Name: js.UndefOr[String] = js.undefined,
      PhoneNumber: js.UndefOr[String] = js.undefined,
      PostalCode: js.UndefOr[String] = js.undefined,
      PrefectureOrDistrict: js.UndefOr[String] = js.undefined,
      StateOrProvince: js.UndefOr[String] = js.undefined,
      Street1: js.UndefOr[String] = js.undefined,
      Street2: js.UndefOr[String] = js.undefined,
      Street3: js.UndefOr[String] = js.undefined): Address = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AddressId" -> AddressId.map { x => x.asInstanceOf[js.Any] },
        "City" -> City.map { x => x.asInstanceOf[js.Any] },
        "Company" -> Company.map { x => x.asInstanceOf[js.Any] },
        "Country" -> Country.map { x => x.asInstanceOf[js.Any] },
        "IsRestricted" -> IsRestricted.map { x => x.asInstanceOf[js.Any] },
        "Landmark" -> Landmark.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "PhoneNumber" -> PhoneNumber.map { x => x.asInstanceOf[js.Any] },
        "PostalCode" -> PostalCode.map { x => x.asInstanceOf[js.Any] },
        "PrefectureOrDistrict" -> PrefectureOrDistrict.map { x => x.asInstanceOf[js.Any] },
        "StateOrProvince" -> StateOrProvince.map { x => x.asInstanceOf[js.Any] },
        "Street1" -> Street1.map { x => x.asInstanceOf[js.Any] },
        "Street2" -> Street2.map { x => x.asInstanceOf[js.Any] },
        "Street3" -> Street3.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Address]
    }
  }

  @js.native
  trait CancelClusterRequest extends js.Object {
    var ClusterId: ClusterId
  }

  object CancelClusterRequest {
    def apply(
      ClusterId: ClusterId): CancelClusterRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterId" -> ClusterId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelClusterRequest]
    }
  }

  @js.native
  trait CancelClusterResult extends js.Object {

  }

  object CancelClusterResult {
    def apply(): CancelClusterResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelClusterResult]
    }
  }

  @js.native
  trait CancelJobRequest extends js.Object {
    var JobId: JobId
  }

  object CancelJobRequest {
    def apply(
      JobId: JobId): CancelJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobId" -> JobId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelJobRequest]
    }
  }

  @js.native
  trait CancelJobResult extends js.Object {

  }

  object CancelJobResult {
    def apply(): CancelJobResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelJobResult]
    }
  }

  /**
   * Contains a cluster's state, a cluster's ID, and other important information.
   */
  @js.native
  trait ClusterListEntry extends js.Object {
    var ClusterId: js.UndefOr[String]
    var ClusterState: js.UndefOr[ClusterState]
    var CreationDate: js.UndefOr[Timestamp]
    var Description: js.UndefOr[String]
  }

  object ClusterListEntry {
    def apply(
      ClusterId: js.UndefOr[String] = js.undefined,
      ClusterState: js.UndefOr[ClusterState] = js.undefined,
      CreationDate: js.UndefOr[Timestamp] = js.undefined,
      Description: js.UndefOr[String] = js.undefined): ClusterListEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterId" -> ClusterId.map { x => x.asInstanceOf[js.Any] },
        "ClusterState" -> ClusterState.map { x => x.asInstanceOf[js.Any] },
        "CreationDate" -> CreationDate.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClusterListEntry]
    }
  }

  /**
   * Contains metadata about a specific cluster.
   */
  @js.native
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

  object ClusterMetadata {
    def apply(
      AddressId: js.UndefOr[AddressId] = js.undefined,
      ClusterId: js.UndefOr[String] = js.undefined,
      ClusterState: js.UndefOr[ClusterState] = js.undefined,
      CreationDate: js.UndefOr[Timestamp] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      ForwardingAddressId: js.UndefOr[AddressId] = js.undefined,
      JobType: js.UndefOr[JobType] = js.undefined,
      KmsKeyARN: js.UndefOr[KmsKeyARN] = js.undefined,
      Notification: js.UndefOr[Notification] = js.undefined,
      Resources: js.UndefOr[JobResource] = js.undefined,
      RoleARN: js.UndefOr[RoleARN] = js.undefined,
      ShippingOption: js.UndefOr[ShippingOption] = js.undefined,
      SnowballType: js.UndefOr[SnowballType] = js.undefined): ClusterMetadata = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AddressId" -> AddressId.map { x => x.asInstanceOf[js.Any] },
        "ClusterId" -> ClusterId.map { x => x.asInstanceOf[js.Any] },
        "ClusterState" -> ClusterState.map { x => x.asInstanceOf[js.Any] },
        "CreationDate" -> CreationDate.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "ForwardingAddressId" -> ForwardingAddressId.map { x => x.asInstanceOf[js.Any] },
        "JobType" -> JobType.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyARN" -> KmsKeyARN.map { x => x.asInstanceOf[js.Any] },
        "Notification" -> Notification.map { x => x.asInstanceOf[js.Any] },
        "Resources" -> Resources.map { x => x.asInstanceOf[js.Any] },
        "RoleARN" -> RoleARN.map { x => x.asInstanceOf[js.Any] },
        "ShippingOption" -> ShippingOption.map { x => x.asInstanceOf[js.Any] },
        "SnowballType" -> SnowballType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClusterMetadata]
    }
  }

  object ClusterStateEnum {
    val AwaitingQuorum = "AwaitingQuorum"
    val Pending = "Pending"
    val InUse = "InUse"
    val Complete = "Complete"
    val Cancelled = "Cancelled"

    val values = IndexedSeq(AwaitingQuorum, Pending, InUse, Complete, Cancelled)
  }

  /**
   * A JSON-formatted object that describes a compatible Amazon Machine Image (AMI). For more information on compatible AMIs, see <a href="http://docs.aws.amazon.com/snowball/latest/developer-guide/using-ec2.html">Using Amazon EC2 Compute Instances</a> in the <i>AWS Snowball Developer Guide</i>.
   */
  @js.native
  trait CompatibleImage extends js.Object {
    var AmiId: js.UndefOr[String]
    var Name: js.UndefOr[String]
  }

  object CompatibleImage {
    def apply(
      AmiId: js.UndefOr[String] = js.undefined,
      Name: js.UndefOr[String] = js.undefined): CompatibleImage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AmiId" -> AmiId.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CompatibleImage]
    }
  }

  @js.native
  trait CreateAddressRequest extends js.Object {
    var Address: Address
  }

  object CreateAddressRequest {
    def apply(
      Address: Address): CreateAddressRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Address" -> Address.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAddressRequest]
    }
  }

  @js.native
  trait CreateAddressResult extends js.Object {
    var AddressId: js.UndefOr[String]
  }

  object CreateAddressResult {
    def apply(
      AddressId: js.UndefOr[String] = js.undefined): CreateAddressResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AddressId" -> AddressId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAddressResult]
    }
  }

  @js.native
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

  object CreateClusterRequest {
    def apply(
      AddressId: AddressId,
      JobType: JobType,
      Resources: JobResource,
      RoleARN: RoleARN,
      ShippingOption: ShippingOption,
      Description: js.UndefOr[String] = js.undefined,
      ForwardingAddressId: js.UndefOr[AddressId] = js.undefined,
      KmsKeyARN: js.UndefOr[KmsKeyARN] = js.undefined,
      Notification: js.UndefOr[Notification] = js.undefined,
      SnowballType: js.UndefOr[SnowballType] = js.undefined): CreateClusterRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AddressId" -> AddressId.asInstanceOf[js.Any],
        "JobType" -> JobType.asInstanceOf[js.Any],
        "Resources" -> Resources.asInstanceOf[js.Any],
        "RoleARN" -> RoleARN.asInstanceOf[js.Any],
        "ShippingOption" -> ShippingOption.asInstanceOf[js.Any],
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "ForwardingAddressId" -> ForwardingAddressId.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyARN" -> KmsKeyARN.map { x => x.asInstanceOf[js.Any] },
        "Notification" -> Notification.map { x => x.asInstanceOf[js.Any] },
        "SnowballType" -> SnowballType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateClusterRequest]
    }
  }

  @js.native
  trait CreateClusterResult extends js.Object {
    var ClusterId: js.UndefOr[ClusterId]
  }

  object CreateClusterResult {
    def apply(
      ClusterId: js.UndefOr[ClusterId] = js.undefined): CreateClusterResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterId" -> ClusterId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateClusterResult]
    }
  }

  @js.native
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

  object CreateJobRequest {
    def apply(
      AddressId: js.UndefOr[AddressId] = js.undefined,
      ClusterId: js.UndefOr[ClusterId] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      ForwardingAddressId: js.UndefOr[AddressId] = js.undefined,
      JobType: js.UndefOr[JobType] = js.undefined,
      KmsKeyARN: js.UndefOr[KmsKeyARN] = js.undefined,
      Notification: js.UndefOr[Notification] = js.undefined,
      Resources: js.UndefOr[JobResource] = js.undefined,
      RoleARN: js.UndefOr[RoleARN] = js.undefined,
      ShippingOption: js.UndefOr[ShippingOption] = js.undefined,
      SnowballCapacityPreference: js.UndefOr[SnowballCapacity] = js.undefined,
      SnowballType: js.UndefOr[SnowballType] = js.undefined): CreateJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AddressId" -> AddressId.map { x => x.asInstanceOf[js.Any] },
        "ClusterId" -> ClusterId.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "ForwardingAddressId" -> ForwardingAddressId.map { x => x.asInstanceOf[js.Any] },
        "JobType" -> JobType.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyARN" -> KmsKeyARN.map { x => x.asInstanceOf[js.Any] },
        "Notification" -> Notification.map { x => x.asInstanceOf[js.Any] },
        "Resources" -> Resources.map { x => x.asInstanceOf[js.Any] },
        "RoleARN" -> RoleARN.map { x => x.asInstanceOf[js.Any] },
        "ShippingOption" -> ShippingOption.map { x => x.asInstanceOf[js.Any] },
        "SnowballCapacityPreference" -> SnowballCapacityPreference.map { x => x.asInstanceOf[js.Any] },
        "SnowballType" -> SnowballType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateJobRequest]
    }
  }

  @js.native
  trait CreateJobResult extends js.Object {
    var JobId: js.UndefOr[JobId]
  }

  object CreateJobResult {
    def apply(
      JobId: js.UndefOr[JobId] = js.undefined): CreateJobResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobId" -> JobId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateJobResult]
    }
  }

  /**
   * Defines the real-time status of a Snowball's data transfer while the device is at AWS. This data is only available while a job has a <code>JobState</code> value of <code>InProgress</code>, for both import and export jobs.
   */
  @js.native
  trait DataTransfer extends js.Object {
    var BytesTransferred: js.UndefOr[Double]
    var ObjectsTransferred: js.UndefOr[Double]
    var TotalBytes: js.UndefOr[Double]
    var TotalObjects: js.UndefOr[Double]
  }

  object DataTransfer {
    def apply(
      BytesTransferred: js.UndefOr[Double] = js.undefined,
      ObjectsTransferred: js.UndefOr[Double] = js.undefined,
      TotalBytes: js.UndefOr[Double] = js.undefined,
      TotalObjects: js.UndefOr[Double] = js.undefined): DataTransfer = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BytesTransferred" -> BytesTransferred.map { x => x.asInstanceOf[js.Any] },
        "ObjectsTransferred" -> ObjectsTransferred.map { x => x.asInstanceOf[js.Any] },
        "TotalBytes" -> TotalBytes.map { x => x.asInstanceOf[js.Any] },
        "TotalObjects" -> TotalObjects.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DataTransfer]
    }
  }

  @js.native
  trait DescribeAddressRequest extends js.Object {
    var AddressId: AddressId
  }

  object DescribeAddressRequest {
    def apply(
      AddressId: AddressId): DescribeAddressRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AddressId" -> AddressId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAddressRequest]
    }
  }

  @js.native
  trait DescribeAddressResult extends js.Object {
    var Address: js.UndefOr[Address]
  }

  object DescribeAddressResult {
    def apply(
      Address: js.UndefOr[Address] = js.undefined): DescribeAddressResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Address" -> Address.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAddressResult]
    }
  }

  @js.native
  trait DescribeAddressesRequest extends js.Object {
    var MaxResults: js.UndefOr[ListLimit]
    var NextToken: js.UndefOr[String]
  }

  object DescribeAddressesRequest {
    def apply(
      MaxResults: js.UndefOr[ListLimit] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeAddressesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAddressesRequest]
    }
  }

  @js.native
  trait DescribeAddressesResult extends js.Object {
    var Addresses: js.UndefOr[AddressList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeAddressesResult {
    def apply(
      Addresses: js.UndefOr[AddressList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeAddressesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Addresses" -> Addresses.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAddressesResult]
    }
  }

  @js.native
  trait DescribeClusterRequest extends js.Object {
    var ClusterId: ClusterId
  }

  object DescribeClusterRequest {
    def apply(
      ClusterId: ClusterId): DescribeClusterRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterId" -> ClusterId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeClusterRequest]
    }
  }

  @js.native
  trait DescribeClusterResult extends js.Object {
    var ClusterMetadata: js.UndefOr[ClusterMetadata]
  }

  object DescribeClusterResult {
    def apply(
      ClusterMetadata: js.UndefOr[ClusterMetadata] = js.undefined): DescribeClusterResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterMetadata" -> ClusterMetadata.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeClusterResult]
    }
  }

  @js.native
  trait DescribeJobRequest extends js.Object {
    var JobId: JobId
  }

  object DescribeJobRequest {
    def apply(
      JobId: JobId): DescribeJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobId" -> JobId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeJobRequest]
    }
  }

  @js.native
  trait DescribeJobResult extends js.Object {
    var JobMetadata: js.UndefOr[JobMetadata]
    var SubJobMetadata: js.UndefOr[JobMetadataList]
  }

  object DescribeJobResult {
    def apply(
      JobMetadata: js.UndefOr[JobMetadata] = js.undefined,
      SubJobMetadata: js.UndefOr[JobMetadataList] = js.undefined): DescribeJobResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobMetadata" -> JobMetadata.map { x => x.asInstanceOf[js.Any] },
        "SubJobMetadata" -> SubJobMetadata.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeJobResult]
    }
  }

  /**
   * A JSON-formatted object that contains the IDs for an Amazon Machine Image (AMI), including the Amazon EC2 AMI ID and the Snowball Edge AMI ID. Each AMI has these two IDs to simplify identifying the AMI in both the AWS Cloud and on the device.
   */
  @js.native
  trait Ec2AmiResource extends js.Object {
    var AmiId: AmiId
    var SnowballAmiId: js.UndefOr[String]
  }

  object Ec2AmiResource {
    def apply(
      AmiId: AmiId,
      SnowballAmiId: js.UndefOr[String] = js.undefined): Ec2AmiResource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AmiId" -> AmiId.asInstanceOf[js.Any],
        "SnowballAmiId" -> SnowballAmiId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Ec2AmiResource]
    }
  }

  /**
   * The container for the EventResourceARN.
   */
  @js.native
  trait EventTriggerDefinition extends js.Object {
    var EventResourceARN: js.UndefOr[ResourceARN]
  }

  object EventTriggerDefinition {
    def apply(
      EventResourceARN: js.UndefOr[ResourceARN] = js.undefined): EventTriggerDefinition = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EventResourceARN" -> EventResourceARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventTriggerDefinition]
    }
  }

  @js.native
  trait GetJobManifestRequest extends js.Object {
    var JobId: JobId
  }

  object GetJobManifestRequest {
    def apply(
      JobId: JobId): GetJobManifestRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobId" -> JobId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetJobManifestRequest]
    }
  }

  @js.native
  trait GetJobManifestResult extends js.Object {
    var ManifestURI: js.UndefOr[String]
  }

  object GetJobManifestResult {
    def apply(
      ManifestURI: js.UndefOr[String] = js.undefined): GetJobManifestResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ManifestURI" -> ManifestURI.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetJobManifestResult]
    }
  }

  @js.native
  trait GetJobUnlockCodeRequest extends js.Object {
    var JobId: JobId
  }

  object GetJobUnlockCodeRequest {
    def apply(
      JobId: JobId): GetJobUnlockCodeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobId" -> JobId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetJobUnlockCodeRequest]
    }
  }

  @js.native
  trait GetJobUnlockCodeResult extends js.Object {
    var UnlockCode: js.UndefOr[String]
  }

  object GetJobUnlockCodeResult {
    def apply(
      UnlockCode: js.UndefOr[String] = js.undefined): GetJobUnlockCodeResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UnlockCode" -> UnlockCode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetJobUnlockCodeResult]
    }
  }

  @js.native
  trait GetSnowballUsageRequest extends js.Object {

  }

  object GetSnowballUsageRequest {
    def apply(): GetSnowballUsageRequest = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSnowballUsageRequest]
    }
  }

  @js.native
  trait GetSnowballUsageResult extends js.Object {
    var SnowballLimit: js.UndefOr[Int]
    var SnowballsInUse: js.UndefOr[Int]
  }

  object GetSnowballUsageResult {
    def apply(
      SnowballLimit: js.UndefOr[Int] = js.undefined,
      SnowballsInUse: js.UndefOr[Int] = js.undefined): GetSnowballUsageResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SnowballLimit" -> SnowballLimit.map { x => x.asInstanceOf[js.Any] },
        "SnowballsInUse" -> SnowballsInUse.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSnowballUsageResult]
    }
  }

  /**
   * Each <code>JobListEntry</code> object contains a job's state, a job's ID, and a value that indicates whether the job is a job part, in the case of an export job.
   */
  @js.native
  trait JobListEntry extends js.Object {
    var CreationDate: js.UndefOr[Timestamp]
    var Description: js.UndefOr[String]
    var IsMaster: js.UndefOr[Boolean]
    var JobId: js.UndefOr[String]
    var JobState: js.UndefOr[JobState]
    var JobType: js.UndefOr[JobType]
    var SnowballType: js.UndefOr[SnowballType]
  }

  object JobListEntry {
    def apply(
      CreationDate: js.UndefOr[Timestamp] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      IsMaster: js.UndefOr[Boolean] = js.undefined,
      JobId: js.UndefOr[String] = js.undefined,
      JobState: js.UndefOr[JobState] = js.undefined,
      JobType: js.UndefOr[JobType] = js.undefined,
      SnowballType: js.UndefOr[SnowballType] = js.undefined): JobListEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationDate" -> CreationDate.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "IsMaster" -> IsMaster.map { x => x.asInstanceOf[js.Any] },
        "JobId" -> JobId.map { x => x.asInstanceOf[js.Any] },
        "JobState" -> JobState.map { x => x.asInstanceOf[js.Any] },
        "JobType" -> JobType.map { x => x.asInstanceOf[js.Any] },
        "SnowballType" -> SnowballType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JobListEntry]
    }
  }

  /**
   * Contains job logs. Whenever Snowball is used to import data into or export data out of Amazon S3, you'll have the option of downloading a PDF job report. Job logs are returned as a part of the response syntax of the <code>DescribeJob</code> action in the <code>JobMetadata</code> data type. The job logs can be accessed for up to 60 minutes after this request has been made. To access any of the job logs after 60 minutes have passed, you'll have to make another call to the <code>DescribeJob</code> action.
   *  For import jobs, the PDF job report becomes available at the end of the import process. For export jobs, your job report typically becomes available while the Snowball for your job part is being delivered to you.
   *  The job report provides you insight into the state of your Amazon S3 data transfer. The report includes details about your job or job part for your records.
   *  For deeper visibility into the status of your transferred objects, you can look at the two associated logs: a success log and a failure log. The logs are saved in comma-separated value (CSV) format, and the name of each log includes the ID of the job or job part that the log describes.
   */
  @js.native
  trait JobLogs extends js.Object {
    var JobCompletionReportURI: js.UndefOr[String]
    var JobFailureLogURI: js.UndefOr[String]
    var JobSuccessLogURI: js.UndefOr[String]
  }

  object JobLogs {
    def apply(
      JobCompletionReportURI: js.UndefOr[String] = js.undefined,
      JobFailureLogURI: js.UndefOr[String] = js.undefined,
      JobSuccessLogURI: js.UndefOr[String] = js.undefined): JobLogs = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobCompletionReportURI" -> JobCompletionReportURI.map { x => x.asInstanceOf[js.Any] },
        "JobFailureLogURI" -> JobFailureLogURI.map { x => x.asInstanceOf[js.Any] },
        "JobSuccessLogURI" -> JobSuccessLogURI.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JobLogs]
    }
  }

  /**
   * Contains information about a specific job including shipping information, job status, and other important metadata. This information is returned as a part of the response syntax of the <code>DescribeJob</code> action.
   */
  @js.native
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

  object JobMetadata {
    def apply(
      AddressId: js.UndefOr[AddressId] = js.undefined,
      ClusterId: js.UndefOr[String] = js.undefined,
      CreationDate: js.UndefOr[Timestamp] = js.undefined,
      DataTransferProgress: js.UndefOr[DataTransfer] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      ForwardingAddressId: js.UndefOr[AddressId] = js.undefined,
      JobId: js.UndefOr[String] = js.undefined,
      JobLogInfo: js.UndefOr[JobLogs] = js.undefined,
      JobState: js.UndefOr[JobState] = js.undefined,
      JobType: js.UndefOr[JobType] = js.undefined,
      KmsKeyARN: js.UndefOr[KmsKeyARN] = js.undefined,
      Notification: js.UndefOr[Notification] = js.undefined,
      Resources: js.UndefOr[JobResource] = js.undefined,
      RoleARN: js.UndefOr[RoleARN] = js.undefined,
      ShippingDetails: js.UndefOr[ShippingDetails] = js.undefined,
      SnowballCapacityPreference: js.UndefOr[SnowballCapacity] = js.undefined,
      SnowballType: js.UndefOr[SnowballType] = js.undefined): JobMetadata = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AddressId" -> AddressId.map { x => x.asInstanceOf[js.Any] },
        "ClusterId" -> ClusterId.map { x => x.asInstanceOf[js.Any] },
        "CreationDate" -> CreationDate.map { x => x.asInstanceOf[js.Any] },
        "DataTransferProgress" -> DataTransferProgress.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "ForwardingAddressId" -> ForwardingAddressId.map { x => x.asInstanceOf[js.Any] },
        "JobId" -> JobId.map { x => x.asInstanceOf[js.Any] },
        "JobLogInfo" -> JobLogInfo.map { x => x.asInstanceOf[js.Any] },
        "JobState" -> JobState.map { x => x.asInstanceOf[js.Any] },
        "JobType" -> JobType.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyARN" -> KmsKeyARN.map { x => x.asInstanceOf[js.Any] },
        "Notification" -> Notification.map { x => x.asInstanceOf[js.Any] },
        "Resources" -> Resources.map { x => x.asInstanceOf[js.Any] },
        "RoleARN" -> RoleARN.map { x => x.asInstanceOf[js.Any] },
        "ShippingDetails" -> ShippingDetails.map { x => x.asInstanceOf[js.Any] },
        "SnowballCapacityPreference" -> SnowballCapacityPreference.map { x => x.asInstanceOf[js.Any] },
        "SnowballType" -> SnowballType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JobMetadata]
    }
  }

  /**
   * Contains an array of AWS resource objects. Each object represents an Amazon S3 bucket, an AWS Lambda function, or an Amazon Machine Image (AMI) based on Amazon EC2 that is associated with a particular job.
   */
  @js.native
  trait JobResource extends js.Object {
    var Ec2AmiResources: js.UndefOr[Ec2AmiResourceList]
    var LambdaResources: js.UndefOr[LambdaResourceList]
    var S3Resources: js.UndefOr[S3ResourceList]
  }

  object JobResource {
    def apply(
      Ec2AmiResources: js.UndefOr[Ec2AmiResourceList] = js.undefined,
      LambdaResources: js.UndefOr[LambdaResourceList] = js.undefined,
      S3Resources: js.UndefOr[S3ResourceList] = js.undefined): JobResource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Ec2AmiResources" -> Ec2AmiResources.map { x => x.asInstanceOf[js.Any] },
        "LambdaResources" -> LambdaResources.map { x => x.asInstanceOf[js.Any] },
        "S3Resources" -> S3Resources.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JobResource]
    }
  }

  object JobStateEnum {
    val New = "New"
    val PreparingAppliance = "PreparingAppliance"
    val PreparingShipment = "PreparingShipment"
    val InTransitToCustomer = "InTransitToCustomer"
    val WithCustomer = "WithCustomer"
    val InTransitToAWS = "InTransitToAWS"
    val WithAWSSortingFacility = "WithAWSSortingFacility"
    val WithAWS = "WithAWS"
    val InProgress = "InProgress"
    val Complete = "Complete"
    val Cancelled = "Cancelled"
    val Listing = "Listing"
    val Pending = "Pending"

    val values = IndexedSeq(New, PreparingAppliance, PreparingShipment, InTransitToCustomer, WithCustomer, InTransitToAWS, WithAWSSortingFacility, WithAWS, InProgress, Complete, Cancelled, Listing, Pending)
  }

  object JobTypeEnum {
    val IMPORT = "IMPORT"
    val EXPORT = "EXPORT"
    val LOCAL_USE = "LOCAL_USE"

    val values = IndexedSeq(IMPORT, EXPORT, LOCAL_USE)
  }

  /**
   * Contains a key range. For export jobs, a <code>S3Resource</code> object can have an optional <code>KeyRange</code> value. The length of the range is defined at job creation, and has either an inclusive <code>BeginMarker</code>, an inclusive <code>EndMarker</code>, or both. Ranges are UTF-8 binary sorted.
   */
  @js.native
  trait KeyRange extends js.Object {
    var BeginMarker: js.UndefOr[String]
    var EndMarker: js.UndefOr[String]
  }

  object KeyRange {
    def apply(
      BeginMarker: js.UndefOr[String] = js.undefined,
      EndMarker: js.UndefOr[String] = js.undefined): KeyRange = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BeginMarker" -> BeginMarker.map { x => x.asInstanceOf[js.Any] },
        "EndMarker" -> EndMarker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KeyRange]
    }
  }

  /**
   * Identifies
   */
  @js.native
  trait LambdaResource extends js.Object {
    var EventTriggers: js.UndefOr[EventTriggerDefinitionList]
    var LambdaArn: js.UndefOr[ResourceARN]
  }

  object LambdaResource {
    def apply(
      EventTriggers: js.UndefOr[EventTriggerDefinitionList] = js.undefined,
      LambdaArn: js.UndefOr[ResourceARN] = js.undefined): LambdaResource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EventTriggers" -> EventTriggers.map { x => x.asInstanceOf[js.Any] },
        "LambdaArn" -> LambdaArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LambdaResource]
    }
  }

  @js.native
  trait ListClusterJobsRequest extends js.Object {
    var ClusterId: ClusterId
    var MaxResults: js.UndefOr[ListLimit]
    var NextToken: js.UndefOr[String]
  }

  object ListClusterJobsRequest {
    def apply(
      ClusterId: ClusterId,
      MaxResults: js.UndefOr[ListLimit] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): ListClusterJobsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterId" -> ClusterId.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListClusterJobsRequest]
    }
  }

  @js.native
  trait ListClusterJobsResult extends js.Object {
    var JobListEntries: js.UndefOr[JobListEntryList]
    var NextToken: js.UndefOr[String]
  }

  object ListClusterJobsResult {
    def apply(
      JobListEntries: js.UndefOr[JobListEntryList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): ListClusterJobsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobListEntries" -> JobListEntries.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListClusterJobsResult]
    }
  }

  @js.native
  trait ListClustersRequest extends js.Object {
    var MaxResults: js.UndefOr[ListLimit]
    var NextToken: js.UndefOr[String]
  }

  object ListClustersRequest {
    def apply(
      MaxResults: js.UndefOr[ListLimit] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): ListClustersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListClustersRequest]
    }
  }

  @js.native
  trait ListClustersResult extends js.Object {
    var ClusterListEntries: js.UndefOr[ClusterListEntryList]
    var NextToken: js.UndefOr[String]
  }

  object ListClustersResult {
    def apply(
      ClusterListEntries: js.UndefOr[ClusterListEntryList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): ListClustersResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterListEntries" -> ClusterListEntries.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListClustersResult]
    }
  }

  @js.native
  trait ListCompatibleImagesRequest extends js.Object {
    var MaxResults: js.UndefOr[ListLimit]
    var NextToken: js.UndefOr[String]
  }

  object ListCompatibleImagesRequest {
    def apply(
      MaxResults: js.UndefOr[ListLimit] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): ListCompatibleImagesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListCompatibleImagesRequest]
    }
  }

  @js.native
  trait ListCompatibleImagesResult extends js.Object {
    var CompatibleImages: js.UndefOr[CompatibleImageList]
    var NextToken: js.UndefOr[String]
  }

  object ListCompatibleImagesResult {
    def apply(
      CompatibleImages: js.UndefOr[CompatibleImageList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): ListCompatibleImagesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CompatibleImages" -> CompatibleImages.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListCompatibleImagesResult]
    }
  }

  @js.native
  trait ListJobsRequest extends js.Object {
    var MaxResults: js.UndefOr[ListLimit]
    var NextToken: js.UndefOr[String]
  }

  object ListJobsRequest {
    def apply(
      MaxResults: js.UndefOr[ListLimit] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): ListJobsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListJobsRequest]
    }
  }

  @js.native
  trait ListJobsResult extends js.Object {
    var JobListEntries: js.UndefOr[JobListEntryList]
    var NextToken: js.UndefOr[String]
  }

  object ListJobsResult {
    def apply(
      JobListEntries: js.UndefOr[JobListEntryList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): ListJobsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobListEntries" -> JobListEntries.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListJobsResult]
    }
  }

  /**
   * The Amazon Simple Notification Service (Amazon SNS) notification settings associated with a specific job. The <code>Notification</code> object is returned as a part of the response syntax of the <code>DescribeJob</code> action in the <code>JobMetadata</code> data type.
   *  When the notification settings are defined during job creation, you can choose to notify based on a specific set of job states using the <code>JobStatesToNotify</code> array of strings, or you can specify that you want to have Amazon SNS notifications sent out for all job states with <code>NotifyAll</code> set to true.
   */
  @js.native
  trait Notification extends js.Object {
    var JobStatesToNotify: js.UndefOr[JobStateList]
    var NotifyAll: js.UndefOr[Boolean]
    var SnsTopicARN: js.UndefOr[SnsTopicARN]
  }

  object Notification {
    def apply(
      JobStatesToNotify: js.UndefOr[JobStateList] = js.undefined,
      NotifyAll: js.UndefOr[Boolean] = js.undefined,
      SnsTopicARN: js.UndefOr[SnsTopicARN] = js.undefined): Notification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobStatesToNotify" -> JobStatesToNotify.map { x => x.asInstanceOf[js.Any] },
        "NotifyAll" -> NotifyAll.map { x => x.asInstanceOf[js.Any] },
        "SnsTopicARN" -> SnsTopicARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Notification]
    }
  }

  /**
   * Each <code>S3Resource</code> object represents an Amazon S3 bucket that your transferred data will be exported from or imported into. For export jobs, this object can have an optional <code>KeyRange</code> value. The length of the range is defined at job creation, and has either an inclusive <code>BeginMarker</code>, an inclusive <code>EndMarker</code>, or both. Ranges are UTF-8 binary sorted.
   */
  @js.native
  trait S3Resource extends js.Object {
    var BucketArn: js.UndefOr[ResourceARN]
    var KeyRange: js.UndefOr[KeyRange]
  }

  object S3Resource {
    def apply(
      BucketArn: js.UndefOr[ResourceARN] = js.undefined,
      KeyRange: js.UndefOr[KeyRange] = js.undefined): S3Resource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BucketArn" -> BucketArn.map { x => x.asInstanceOf[js.Any] },
        "KeyRange" -> KeyRange.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3Resource]
    }
  }

  /**
   * The <code>Status</code> and <code>TrackingNumber</code> information for an inbound or outbound shipment.
   */
  @js.native
  trait Shipment extends js.Object {
    var Status: js.UndefOr[String]
    var TrackingNumber: js.UndefOr[String]
  }

  object Shipment {
    def apply(
      Status: js.UndefOr[String] = js.undefined,
      TrackingNumber: js.UndefOr[String] = js.undefined): Shipment = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "TrackingNumber" -> TrackingNumber.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Shipment]
    }
  }

  /**
   * A job's shipping information, including inbound and outbound tracking numbers and shipping speed options.
   */
  @js.native
  trait ShippingDetails extends js.Object {
    var InboundShipment: js.UndefOr[Shipment]
    var OutboundShipment: js.UndefOr[Shipment]
    var ShippingOption: js.UndefOr[ShippingOption]
  }

  object ShippingDetails {
    def apply(
      InboundShipment: js.UndefOr[Shipment] = js.undefined,
      OutboundShipment: js.UndefOr[Shipment] = js.undefined,
      ShippingOption: js.UndefOr[ShippingOption] = js.undefined): ShippingDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InboundShipment" -> InboundShipment.map { x => x.asInstanceOf[js.Any] },
        "OutboundShipment" -> OutboundShipment.map { x => x.asInstanceOf[js.Any] },
        "ShippingOption" -> ShippingOption.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ShippingDetails]
    }
  }

  object ShippingOptionEnum {
    val SECOND_DAY = "SECOND_DAY"
    val NEXT_DAY = "NEXT_DAY"
    val EXPRESS = "EXPRESS"
    val STANDARD = "STANDARD"

    val values = IndexedSeq(SECOND_DAY, NEXT_DAY, EXPRESS, STANDARD)
  }

  object SnowballCapacityEnum {
    val T50 = "T50"
    val T80 = "T80"
    val T100 = "T100"
    val T42 = "T42"
    val NoPreference = "NoPreference"

    val values = IndexedSeq(T50, T80, T100, T42, NoPreference)
  }

  object SnowballTypeEnum {
    val STANDARD = "STANDARD"
    val EDGE = "EDGE"
    val EDGE_C = "EDGE_C"
    val EDGE_CG = "EDGE_CG"

    val values = IndexedSeq(STANDARD, EDGE, EDGE_C, EDGE_CG)
  }

  @js.native
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

  object UpdateClusterRequest {
    def apply(
      ClusterId: ClusterId,
      AddressId: js.UndefOr[AddressId] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      ForwardingAddressId: js.UndefOr[AddressId] = js.undefined,
      Notification: js.UndefOr[Notification] = js.undefined,
      Resources: js.UndefOr[JobResource] = js.undefined,
      RoleARN: js.UndefOr[RoleARN] = js.undefined,
      ShippingOption: js.UndefOr[ShippingOption] = js.undefined): UpdateClusterRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClusterId" -> ClusterId.asInstanceOf[js.Any],
        "AddressId" -> AddressId.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "ForwardingAddressId" -> ForwardingAddressId.map { x => x.asInstanceOf[js.Any] },
        "Notification" -> Notification.map { x => x.asInstanceOf[js.Any] },
        "Resources" -> Resources.map { x => x.asInstanceOf[js.Any] },
        "RoleARN" -> RoleARN.map { x => x.asInstanceOf[js.Any] },
        "ShippingOption" -> ShippingOption.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateClusterRequest]
    }
  }

  @js.native
  trait UpdateClusterResult extends js.Object {

  }

  object UpdateClusterResult {
    def apply(): UpdateClusterResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateClusterResult]
    }
  }

  @js.native
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

  object UpdateJobRequest {
    def apply(
      JobId: JobId,
      AddressId: js.UndefOr[AddressId] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      ForwardingAddressId: js.UndefOr[AddressId] = js.undefined,
      Notification: js.UndefOr[Notification] = js.undefined,
      Resources: js.UndefOr[JobResource] = js.undefined,
      RoleARN: js.UndefOr[RoleARN] = js.undefined,
      ShippingOption: js.UndefOr[ShippingOption] = js.undefined,
      SnowballCapacityPreference: js.UndefOr[SnowballCapacity] = js.undefined): UpdateJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobId" -> JobId.asInstanceOf[js.Any],
        "AddressId" -> AddressId.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "ForwardingAddressId" -> ForwardingAddressId.map { x => x.asInstanceOf[js.Any] },
        "Notification" -> Notification.map { x => x.asInstanceOf[js.Any] },
        "Resources" -> Resources.map { x => x.asInstanceOf[js.Any] },
        "RoleARN" -> RoleARN.map { x => x.asInstanceOf[js.Any] },
        "ShippingOption" -> ShippingOption.map { x => x.asInstanceOf[js.Any] },
        "SnowballCapacityPreference" -> SnowballCapacityPreference.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateJobRequest]
    }
  }

  @js.native
  trait UpdateJobResult extends js.Object {

  }

  object UpdateJobResult {
    def apply(): UpdateJobResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateJobResult]
    }
  }
}
