package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object snowball {
  type AddressId = String
  type AddressList = js.Array[Address]
  type AmiId = String
  type ClusterId = String
  type ClusterListEntryList = js.Array[ClusterListEntry]
  type CompatibleImageList = js.Array[CompatibleImage]
  type Ec2AmiResourceList = js.Array[Ec2AmiResource]
  type EventTriggerDefinitionList = js.Array[EventTriggerDefinition]
  type GSTIN = String
  type JobId = String
  type JobListEntryList = js.Array[JobListEntry]
  type JobMetadataList = js.Array[JobMetadata]
  type JobStateList = js.Array[JobState]
  type KmsKeyARN = String
  type LambdaResourceList = js.Array[LambdaResource]
  type ListLimit = Int
  type ResourceARN = String
  type RoleARN = String
  type S3ResourceList = js.Array[S3Resource]
  type SnsTopicARN = String
  type Timestamp = js.Date

  final class SnowballOps(private val service: Snowball) extends AnyVal {

    @inline def cancelClusterFuture(params: CancelClusterRequest): Future[CancelClusterResult] = service.cancelCluster(params).promise().toFuture
    @inline def cancelJobFuture(params: CancelJobRequest): Future[CancelJobResult] = service.cancelJob(params).promise().toFuture
    @inline def createAddressFuture(params: CreateAddressRequest): Future[CreateAddressResult] = service.createAddress(params).promise().toFuture
    @inline def createClusterFuture(params: CreateClusterRequest): Future[CreateClusterResult] = service.createCluster(params).promise().toFuture
    @inline def createJobFuture(params: CreateJobRequest): Future[CreateJobResult] = service.createJob(params).promise().toFuture
    @inline def createReturnShippingLabelFuture(params: CreateReturnShippingLabelRequest): Future[CreateReturnShippingLabelResult] = service.createReturnShippingLabel(params).promise().toFuture
    @inline def describeAddressFuture(params: DescribeAddressRequest): Future[DescribeAddressResult] = service.describeAddress(params).promise().toFuture
    @inline def describeAddressesFuture(params: DescribeAddressesRequest): Future[DescribeAddressesResult] = service.describeAddresses(params).promise().toFuture
    @inline def describeClusterFuture(params: DescribeClusterRequest): Future[DescribeClusterResult] = service.describeCluster(params).promise().toFuture
    @inline def describeJobFuture(params: DescribeJobRequest): Future[DescribeJobResult] = service.describeJob(params).promise().toFuture
    @inline def describeReturnShippingLabelFuture(params: DescribeReturnShippingLabelRequest): Future[DescribeReturnShippingLabelResult] = service.describeReturnShippingLabel(params).promise().toFuture
    @inline def getJobManifestFuture(params: GetJobManifestRequest): Future[GetJobManifestResult] = service.getJobManifest(params).promise().toFuture
    @inline def getJobUnlockCodeFuture(params: GetJobUnlockCodeRequest): Future[GetJobUnlockCodeResult] = service.getJobUnlockCode(params).promise().toFuture
    @inline def getSnowballUsageFuture(params: GetSnowballUsageRequest): Future[GetSnowballUsageResult] = service.getSnowballUsage(params).promise().toFuture
    @inline def getSoftwareUpdatesFuture(params: GetSoftwareUpdatesRequest): Future[GetSoftwareUpdatesResult] = service.getSoftwareUpdates(params).promise().toFuture
    @inline def listClusterJobsFuture(params: ListClusterJobsRequest): Future[ListClusterJobsResult] = service.listClusterJobs(params).promise().toFuture
    @inline def listClustersFuture(params: ListClustersRequest): Future[ListClustersResult] = service.listClusters(params).promise().toFuture
    @inline def listCompatibleImagesFuture(params: ListCompatibleImagesRequest): Future[ListCompatibleImagesResult] = service.listCompatibleImages(params).promise().toFuture
    @inline def listJobsFuture(params: ListJobsRequest): Future[ListJobsResult] = service.listJobs(params).promise().toFuture
    @inline def updateClusterFuture(params: UpdateClusterRequest): Future[UpdateClusterResult] = service.updateCluster(params).promise().toFuture
    @inline def updateJobFuture(params: UpdateJobRequest): Future[UpdateJobResult] = service.updateJob(params).promise().toFuture
    @inline def updateJobShipmentStateFuture(params: UpdateJobShipmentStateRequest): Future[UpdateJobShipmentStateResult] = service.updateJobShipmentState(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/snowball", JSImport.Namespace, "AWS.Snowball")
  class Snowball() extends js.Object {
    def this(config: AWSConfig) = this()

    def cancelCluster(params: CancelClusterRequest): Request[CancelClusterResult] = js.native
    def cancelJob(params: CancelJobRequest): Request[CancelJobResult] = js.native
    def createAddress(params: CreateAddressRequest): Request[CreateAddressResult] = js.native
    def createCluster(params: CreateClusterRequest): Request[CreateClusterResult] = js.native
    def createJob(params: CreateJobRequest): Request[CreateJobResult] = js.native
    def createReturnShippingLabel(params: CreateReturnShippingLabelRequest): Request[CreateReturnShippingLabelResult] = js.native
    def describeAddress(params: DescribeAddressRequest): Request[DescribeAddressResult] = js.native
    def describeAddresses(params: DescribeAddressesRequest): Request[DescribeAddressesResult] = js.native
    def describeCluster(params: DescribeClusterRequest): Request[DescribeClusterResult] = js.native
    def describeJob(params: DescribeJobRequest): Request[DescribeJobResult] = js.native
    def describeReturnShippingLabel(params: DescribeReturnShippingLabelRequest): Request[DescribeReturnShippingLabelResult] = js.native
    def getJobManifest(params: GetJobManifestRequest): Request[GetJobManifestResult] = js.native
    def getJobUnlockCode(params: GetJobUnlockCodeRequest): Request[GetJobUnlockCodeResult] = js.native
    def getSnowballUsage(params: GetSnowballUsageRequest): Request[GetSnowballUsageResult] = js.native
    def getSoftwareUpdates(params: GetSoftwareUpdatesRequest): Request[GetSoftwareUpdatesResult] = js.native
    def listClusterJobs(params: ListClusterJobsRequest): Request[ListClusterJobsResult] = js.native
    def listClusters(params: ListClustersRequest): Request[ListClustersResult] = js.native
    def listCompatibleImages(params: ListCompatibleImagesRequest): Request[ListCompatibleImagesResult] = js.native
    def listJobs(params: ListJobsRequest): Request[ListJobsResult] = js.native
    def updateCluster(params: UpdateClusterRequest): Request[UpdateClusterResult] = js.native
    def updateJob(params: UpdateJobRequest): Request[UpdateJobResult] = js.native
    def updateJobShipmentState(params: UpdateJobShipmentStateRequest): Request[UpdateJobShipmentStateResult] = js.native
  }
  object Snowball {
    @inline implicit def toOps(service: Snowball): SnowballOps = {
      new SnowballOps(service)
    }
  }

  /** The address that you want the Snow device(s) associated with a specific job to be shipped to. Addresses are validated at the time of creation. The address you provide must be located within the serviceable area of your region. Although no individual elements of the <code>Address</code> are required, if the address is invalid or unsupported, then an exception is thrown.
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
    @inline
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
        Street3: js.UndefOr[String] = js.undefined
    ): Address = {
      val __obj = js.Dynamic.literal()
      AddressId.foreach(__v => __obj.updateDynamic("AddressId")(__v.asInstanceOf[js.Any]))
      City.foreach(__v => __obj.updateDynamic("City")(__v.asInstanceOf[js.Any]))
      Company.foreach(__v => __obj.updateDynamic("Company")(__v.asInstanceOf[js.Any]))
      Country.foreach(__v => __obj.updateDynamic("Country")(__v.asInstanceOf[js.Any]))
      IsRestricted.foreach(__v => __obj.updateDynamic("IsRestricted")(__v.asInstanceOf[js.Any]))
      Landmark.foreach(__v => __obj.updateDynamic("Landmark")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      PhoneNumber.foreach(__v => __obj.updateDynamic("PhoneNumber")(__v.asInstanceOf[js.Any]))
      PostalCode.foreach(__v => __obj.updateDynamic("PostalCode")(__v.asInstanceOf[js.Any]))
      PrefectureOrDistrict.foreach(__v => __obj.updateDynamic("PrefectureOrDistrict")(__v.asInstanceOf[js.Any]))
      StateOrProvince.foreach(__v => __obj.updateDynamic("StateOrProvince")(__v.asInstanceOf[js.Any]))
      Street1.foreach(__v => __obj.updateDynamic("Street1")(__v.asInstanceOf[js.Any]))
      Street2.foreach(__v => __obj.updateDynamic("Street2")(__v.asInstanceOf[js.Any]))
      Street3.foreach(__v => __obj.updateDynamic("Street3")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Address]
    }
  }

  @js.native
  trait CancelClusterRequest extends js.Object {
    var ClusterId: ClusterId
  }

  object CancelClusterRequest {
    @inline
    def apply(
        ClusterId: ClusterId
    ): CancelClusterRequest = {
      val __obj = js.Dynamic.literal(
        "ClusterId" -> ClusterId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CancelClusterRequest]
    }
  }

  @js.native
  trait CancelClusterResult extends js.Object

  object CancelClusterResult {
    @inline
    def apply(): CancelClusterResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CancelClusterResult]
    }
  }

  @js.native
  trait CancelJobRequest extends js.Object {
    var JobId: JobId
  }

  object CancelJobRequest {
    @inline
    def apply(
        JobId: JobId
    ): CancelJobRequest = {
      val __obj = js.Dynamic.literal(
        "JobId" -> JobId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CancelJobRequest]
    }
  }

  @js.native
  trait CancelJobResult extends js.Object

  object CancelJobResult {
    @inline
    def apply(): CancelJobResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CancelJobResult]
    }
  }

  /** Contains a cluster's state, a cluster's ID, and other important information.
    */
  @js.native
  trait ClusterListEntry extends js.Object {
    var ClusterId: js.UndefOr[String]
    var ClusterState: js.UndefOr[ClusterState]
    var CreationDate: js.UndefOr[Timestamp]
    var Description: js.UndefOr[String]
  }

  object ClusterListEntry {
    @inline
    def apply(
        ClusterId: js.UndefOr[String] = js.undefined,
        ClusterState: js.UndefOr[ClusterState] = js.undefined,
        CreationDate: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[String] = js.undefined
    ): ClusterListEntry = {
      val __obj = js.Dynamic.literal()
      ClusterId.foreach(__v => __obj.updateDynamic("ClusterId")(__v.asInstanceOf[js.Any]))
      ClusterState.foreach(__v => __obj.updateDynamic("ClusterState")(__v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.updateDynamic("CreationDate")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClusterListEntry]
    }
  }

  /** Contains metadata about a specific cluster.
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
    var TaxDocuments: js.UndefOr[TaxDocuments]
  }

  object ClusterMetadata {
    @inline
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
        SnowballType: js.UndefOr[SnowballType] = js.undefined,
        TaxDocuments: js.UndefOr[TaxDocuments] = js.undefined
    ): ClusterMetadata = {
      val __obj = js.Dynamic.literal()
      AddressId.foreach(__v => __obj.updateDynamic("AddressId")(__v.asInstanceOf[js.Any]))
      ClusterId.foreach(__v => __obj.updateDynamic("ClusterId")(__v.asInstanceOf[js.Any]))
      ClusterState.foreach(__v => __obj.updateDynamic("ClusterState")(__v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.updateDynamic("CreationDate")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      ForwardingAddressId.foreach(__v => __obj.updateDynamic("ForwardingAddressId")(__v.asInstanceOf[js.Any]))
      JobType.foreach(__v => __obj.updateDynamic("JobType")(__v.asInstanceOf[js.Any]))
      KmsKeyARN.foreach(__v => __obj.updateDynamic("KmsKeyARN")(__v.asInstanceOf[js.Any]))
      Notification.foreach(__v => __obj.updateDynamic("Notification")(__v.asInstanceOf[js.Any]))
      Resources.foreach(__v => __obj.updateDynamic("Resources")(__v.asInstanceOf[js.Any]))
      RoleARN.foreach(__v => __obj.updateDynamic("RoleARN")(__v.asInstanceOf[js.Any]))
      ShippingOption.foreach(__v => __obj.updateDynamic("ShippingOption")(__v.asInstanceOf[js.Any]))
      SnowballType.foreach(__v => __obj.updateDynamic("SnowballType")(__v.asInstanceOf[js.Any]))
      TaxDocuments.foreach(__v => __obj.updateDynamic("TaxDocuments")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClusterMetadata]
    }
  }

  /** A JSON-formatted object that describes a compatible Amazon Machine Image (AMI), including the ID and name for a Snow device AMI. This AMI is compatible with the device's physical hardware requirements, and it should be able to be run in an SBE1 instance on the device.
    */
  @js.native
  trait CompatibleImage extends js.Object {
    var AmiId: js.UndefOr[String]
    var Name: js.UndefOr[String]
  }

  object CompatibleImage {
    @inline
    def apply(
        AmiId: js.UndefOr[String] = js.undefined,
        Name: js.UndefOr[String] = js.undefined
    ): CompatibleImage = {
      val __obj = js.Dynamic.literal()
      AmiId.foreach(__v => __obj.updateDynamic("AmiId")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CompatibleImage]
    }
  }

  @js.native
  trait CreateAddressRequest extends js.Object {
    var Address: Address
  }

  object CreateAddressRequest {
    @inline
    def apply(
        Address: Address
    ): CreateAddressRequest = {
      val __obj = js.Dynamic.literal(
        "Address" -> Address.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateAddressRequest]
    }
  }

  @js.native
  trait CreateAddressResult extends js.Object {
    var AddressId: js.UndefOr[String]
  }

  object CreateAddressResult {
    @inline
    def apply(
        AddressId: js.UndefOr[String] = js.undefined
    ): CreateAddressResult = {
      val __obj = js.Dynamic.literal()
      AddressId.foreach(__v => __obj.updateDynamic("AddressId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAddressResult]
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
    var TaxDocuments: js.UndefOr[TaxDocuments]
  }

  object CreateClusterRequest {
    @inline
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
        SnowballType: js.UndefOr[SnowballType] = js.undefined,
        TaxDocuments: js.UndefOr[TaxDocuments] = js.undefined
    ): CreateClusterRequest = {
      val __obj = js.Dynamic.literal(
        "AddressId" -> AddressId.asInstanceOf[js.Any],
        "JobType" -> JobType.asInstanceOf[js.Any],
        "Resources" -> Resources.asInstanceOf[js.Any],
        "RoleARN" -> RoleARN.asInstanceOf[js.Any],
        "ShippingOption" -> ShippingOption.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      ForwardingAddressId.foreach(__v => __obj.updateDynamic("ForwardingAddressId")(__v.asInstanceOf[js.Any]))
      KmsKeyARN.foreach(__v => __obj.updateDynamic("KmsKeyARN")(__v.asInstanceOf[js.Any]))
      Notification.foreach(__v => __obj.updateDynamic("Notification")(__v.asInstanceOf[js.Any]))
      SnowballType.foreach(__v => __obj.updateDynamic("SnowballType")(__v.asInstanceOf[js.Any]))
      TaxDocuments.foreach(__v => __obj.updateDynamic("TaxDocuments")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateClusterRequest]
    }
  }

  @js.native
  trait CreateClusterResult extends js.Object {
    var ClusterId: js.UndefOr[ClusterId]
  }

  object CreateClusterResult {
    @inline
    def apply(
        ClusterId: js.UndefOr[ClusterId] = js.undefined
    ): CreateClusterResult = {
      val __obj = js.Dynamic.literal()
      ClusterId.foreach(__v => __obj.updateDynamic("ClusterId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateClusterResult]
    }
  }

  @js.native
  trait CreateJobRequest extends js.Object {
    var AddressId: js.UndefOr[AddressId]
    var ClusterId: js.UndefOr[ClusterId]
    var Description: js.UndefOr[String]
    var DeviceConfiguration: js.UndefOr[DeviceConfiguration]
    var ForwardingAddressId: js.UndefOr[AddressId]
    var JobType: js.UndefOr[JobType]
    var KmsKeyARN: js.UndefOr[KmsKeyARN]
    var Notification: js.UndefOr[Notification]
    var Resources: js.UndefOr[JobResource]
    var RoleARN: js.UndefOr[RoleARN]
    var ShippingOption: js.UndefOr[ShippingOption]
    var SnowballCapacityPreference: js.UndefOr[SnowballCapacity]
    var SnowballType: js.UndefOr[SnowballType]
    var TaxDocuments: js.UndefOr[TaxDocuments]
  }

  object CreateJobRequest {
    @inline
    def apply(
        AddressId: js.UndefOr[AddressId] = js.undefined,
        ClusterId: js.UndefOr[ClusterId] = js.undefined,
        Description: js.UndefOr[String] = js.undefined,
        DeviceConfiguration: js.UndefOr[DeviceConfiguration] = js.undefined,
        ForwardingAddressId: js.UndefOr[AddressId] = js.undefined,
        JobType: js.UndefOr[JobType] = js.undefined,
        KmsKeyARN: js.UndefOr[KmsKeyARN] = js.undefined,
        Notification: js.UndefOr[Notification] = js.undefined,
        Resources: js.UndefOr[JobResource] = js.undefined,
        RoleARN: js.UndefOr[RoleARN] = js.undefined,
        ShippingOption: js.UndefOr[ShippingOption] = js.undefined,
        SnowballCapacityPreference: js.UndefOr[SnowballCapacity] = js.undefined,
        SnowballType: js.UndefOr[SnowballType] = js.undefined,
        TaxDocuments: js.UndefOr[TaxDocuments] = js.undefined
    ): CreateJobRequest = {
      val __obj = js.Dynamic.literal()
      AddressId.foreach(__v => __obj.updateDynamic("AddressId")(__v.asInstanceOf[js.Any]))
      ClusterId.foreach(__v => __obj.updateDynamic("ClusterId")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DeviceConfiguration.foreach(__v => __obj.updateDynamic("DeviceConfiguration")(__v.asInstanceOf[js.Any]))
      ForwardingAddressId.foreach(__v => __obj.updateDynamic("ForwardingAddressId")(__v.asInstanceOf[js.Any]))
      JobType.foreach(__v => __obj.updateDynamic("JobType")(__v.asInstanceOf[js.Any]))
      KmsKeyARN.foreach(__v => __obj.updateDynamic("KmsKeyARN")(__v.asInstanceOf[js.Any]))
      Notification.foreach(__v => __obj.updateDynamic("Notification")(__v.asInstanceOf[js.Any]))
      Resources.foreach(__v => __obj.updateDynamic("Resources")(__v.asInstanceOf[js.Any]))
      RoleARN.foreach(__v => __obj.updateDynamic("RoleARN")(__v.asInstanceOf[js.Any]))
      ShippingOption.foreach(__v => __obj.updateDynamic("ShippingOption")(__v.asInstanceOf[js.Any]))
      SnowballCapacityPreference.foreach(__v => __obj.updateDynamic("SnowballCapacityPreference")(__v.asInstanceOf[js.Any]))
      SnowballType.foreach(__v => __obj.updateDynamic("SnowballType")(__v.asInstanceOf[js.Any]))
      TaxDocuments.foreach(__v => __obj.updateDynamic("TaxDocuments")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateJobRequest]
    }
  }

  @js.native
  trait CreateJobResult extends js.Object {
    var JobId: js.UndefOr[JobId]
  }

  object CreateJobResult {
    @inline
    def apply(
        JobId: js.UndefOr[JobId] = js.undefined
    ): CreateJobResult = {
      val __obj = js.Dynamic.literal()
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateJobResult]
    }
  }

  @js.native
  trait CreateReturnShippingLabelRequest extends js.Object {
    var JobId: JobId
    var ShippingOption: js.UndefOr[ShippingOption]
  }

  object CreateReturnShippingLabelRequest {
    @inline
    def apply(
        JobId: JobId,
        ShippingOption: js.UndefOr[ShippingOption] = js.undefined
    ): CreateReturnShippingLabelRequest = {
      val __obj = js.Dynamic.literal(
        "JobId" -> JobId.asInstanceOf[js.Any]
      )

      ShippingOption.foreach(__v => __obj.updateDynamic("ShippingOption")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateReturnShippingLabelRequest]
    }
  }

  @js.native
  trait CreateReturnShippingLabelResult extends js.Object {
    var Status: js.UndefOr[ShippingLabelStatus]
  }

  object CreateReturnShippingLabelResult {
    @inline
    def apply(
        Status: js.UndefOr[ShippingLabelStatus] = js.undefined
    ): CreateReturnShippingLabelResult = {
      val __obj = js.Dynamic.literal()
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateReturnShippingLabelResult]
    }
  }

  /** Defines the real-time status of a Snow device's data transfer while the device is at AWS. This data is only available while a job has a <code>JobState</code> value of <code>InProgress</code>, for both import and export jobs.
    */
  @js.native
  trait DataTransfer extends js.Object {
    var BytesTransferred: js.UndefOr[Double]
    var ObjectsTransferred: js.UndefOr[Double]
    var TotalBytes: js.UndefOr[Double]
    var TotalObjects: js.UndefOr[Double]
  }

  object DataTransfer {
    @inline
    def apply(
        BytesTransferred: js.UndefOr[Double] = js.undefined,
        ObjectsTransferred: js.UndefOr[Double] = js.undefined,
        TotalBytes: js.UndefOr[Double] = js.undefined,
        TotalObjects: js.UndefOr[Double] = js.undefined
    ): DataTransfer = {
      val __obj = js.Dynamic.literal()
      BytesTransferred.foreach(__v => __obj.updateDynamic("BytesTransferred")(__v.asInstanceOf[js.Any]))
      ObjectsTransferred.foreach(__v => __obj.updateDynamic("ObjectsTransferred")(__v.asInstanceOf[js.Any]))
      TotalBytes.foreach(__v => __obj.updateDynamic("TotalBytes")(__v.asInstanceOf[js.Any]))
      TotalObjects.foreach(__v => __obj.updateDynamic("TotalObjects")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataTransfer]
    }
  }

  @js.native
  trait DescribeAddressRequest extends js.Object {
    var AddressId: AddressId
  }

  object DescribeAddressRequest {
    @inline
    def apply(
        AddressId: AddressId
    ): DescribeAddressRequest = {
      val __obj = js.Dynamic.literal(
        "AddressId" -> AddressId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeAddressRequest]
    }
  }

  @js.native
  trait DescribeAddressResult extends js.Object {
    var Address: js.UndefOr[Address]
  }

  object DescribeAddressResult {
    @inline
    def apply(
        Address: js.UndefOr[Address] = js.undefined
    ): DescribeAddressResult = {
      val __obj = js.Dynamic.literal()
      Address.foreach(__v => __obj.updateDynamic("Address")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAddressResult]
    }
  }

  @js.native
  trait DescribeAddressesRequest extends js.Object {
    var MaxResults: js.UndefOr[ListLimit]
    var NextToken: js.UndefOr[String]
  }

  object DescribeAddressesRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[ListLimit] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): DescribeAddressesRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAddressesRequest]
    }
  }

  @js.native
  trait DescribeAddressesResult extends js.Object {
    var Addresses: js.UndefOr[AddressList]
    var NextToken: js.UndefOr[String]
  }

  object DescribeAddressesResult {
    @inline
    def apply(
        Addresses: js.UndefOr[AddressList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): DescribeAddressesResult = {
      val __obj = js.Dynamic.literal()
      Addresses.foreach(__v => __obj.updateDynamic("Addresses")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAddressesResult]
    }
  }

  @js.native
  trait DescribeClusterRequest extends js.Object {
    var ClusterId: ClusterId
  }

  object DescribeClusterRequest {
    @inline
    def apply(
        ClusterId: ClusterId
    ): DescribeClusterRequest = {
      val __obj = js.Dynamic.literal(
        "ClusterId" -> ClusterId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeClusterRequest]
    }
  }

  @js.native
  trait DescribeClusterResult extends js.Object {
    var ClusterMetadata: js.UndefOr[ClusterMetadata]
  }

  object DescribeClusterResult {
    @inline
    def apply(
        ClusterMetadata: js.UndefOr[ClusterMetadata] = js.undefined
    ): DescribeClusterResult = {
      val __obj = js.Dynamic.literal()
      ClusterMetadata.foreach(__v => __obj.updateDynamic("ClusterMetadata")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeClusterResult]
    }
  }

  @js.native
  trait DescribeJobRequest extends js.Object {
    var JobId: JobId
  }

  object DescribeJobRequest {
    @inline
    def apply(
        JobId: JobId
    ): DescribeJobRequest = {
      val __obj = js.Dynamic.literal(
        "JobId" -> JobId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeJobRequest]
    }
  }

  @js.native
  trait DescribeJobResult extends js.Object {
    var JobMetadata: js.UndefOr[JobMetadata]
    var SubJobMetadata: js.UndefOr[JobMetadataList]
  }

  object DescribeJobResult {
    @inline
    def apply(
        JobMetadata: js.UndefOr[JobMetadata] = js.undefined,
        SubJobMetadata: js.UndefOr[JobMetadataList] = js.undefined
    ): DescribeJobResult = {
      val __obj = js.Dynamic.literal()
      JobMetadata.foreach(__v => __obj.updateDynamic("JobMetadata")(__v.asInstanceOf[js.Any]))
      SubJobMetadata.foreach(__v => __obj.updateDynamic("SubJobMetadata")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeJobResult]
    }
  }

  @js.native
  trait DescribeReturnShippingLabelRequest extends js.Object {
    var JobId: js.UndefOr[JobId]
  }

  object DescribeReturnShippingLabelRequest {
    @inline
    def apply(
        JobId: js.UndefOr[JobId] = js.undefined
    ): DescribeReturnShippingLabelRequest = {
      val __obj = js.Dynamic.literal()
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeReturnShippingLabelRequest]
    }
  }

  @js.native
  trait DescribeReturnShippingLabelResult extends js.Object {
    var ExpirationDate: js.UndefOr[Timestamp]
    var Status: js.UndefOr[ShippingLabelStatus]
  }

  object DescribeReturnShippingLabelResult {
    @inline
    def apply(
        ExpirationDate: js.UndefOr[Timestamp] = js.undefined,
        Status: js.UndefOr[ShippingLabelStatus] = js.undefined
    ): DescribeReturnShippingLabelResult = {
      val __obj = js.Dynamic.literal()
      ExpirationDate.foreach(__v => __obj.updateDynamic("ExpirationDate")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeReturnShippingLabelResult]
    }
  }

  /** The container for <code>SnowconeDeviceConfiguration</code>.
    */
  @js.native
  trait DeviceConfiguration extends js.Object {
    var SnowconeDeviceConfiguration: js.UndefOr[SnowconeDeviceConfiguration]
  }

  object DeviceConfiguration {
    @inline
    def apply(
        SnowconeDeviceConfiguration: js.UndefOr[SnowconeDeviceConfiguration] = js.undefined
    ): DeviceConfiguration = {
      val __obj = js.Dynamic.literal()
      SnowconeDeviceConfiguration.foreach(__v => __obj.updateDynamic("SnowconeDeviceConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeviceConfiguration]
    }
  }

  /** A JSON-formatted object that contains the IDs for an Amazon Machine Image (AMI), including the Amazon EC2 AMI ID and the Snow device AMI ID. Each AMI has these two IDs to simplify identifying the AMI in both the AWS Cloud and on the device.
    */
  @js.native
  trait Ec2AmiResource extends js.Object {
    var AmiId: AmiId
    var SnowballAmiId: js.UndefOr[String]
  }

  object Ec2AmiResource {
    @inline
    def apply(
        AmiId: AmiId,
        SnowballAmiId: js.UndefOr[String] = js.undefined
    ): Ec2AmiResource = {
      val __obj = js.Dynamic.literal(
        "AmiId" -> AmiId.asInstanceOf[js.Any]
      )

      SnowballAmiId.foreach(__v => __obj.updateDynamic("SnowballAmiId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Ec2AmiResource]
    }
  }

  /** The container for the EventResourceARN.
    */
  @js.native
  trait EventTriggerDefinition extends js.Object {
    var EventResourceARN: js.UndefOr[ResourceARN]
  }

  object EventTriggerDefinition {
    @inline
    def apply(
        EventResourceARN: js.UndefOr[ResourceARN] = js.undefined
    ): EventTriggerDefinition = {
      val __obj = js.Dynamic.literal()
      EventResourceARN.foreach(__v => __obj.updateDynamic("EventResourceARN")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventTriggerDefinition]
    }
  }

  @js.native
  trait GetJobManifestRequest extends js.Object {
    var JobId: JobId
  }

  object GetJobManifestRequest {
    @inline
    def apply(
        JobId: JobId
    ): GetJobManifestRequest = {
      val __obj = js.Dynamic.literal(
        "JobId" -> JobId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetJobManifestRequest]
    }
  }

  @js.native
  trait GetJobManifestResult extends js.Object {
    var ManifestURI: js.UndefOr[String]
  }

  object GetJobManifestResult {
    @inline
    def apply(
        ManifestURI: js.UndefOr[String] = js.undefined
    ): GetJobManifestResult = {
      val __obj = js.Dynamic.literal()
      ManifestURI.foreach(__v => __obj.updateDynamic("ManifestURI")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetJobManifestResult]
    }
  }

  @js.native
  trait GetJobUnlockCodeRequest extends js.Object {
    var JobId: JobId
  }

  object GetJobUnlockCodeRequest {
    @inline
    def apply(
        JobId: JobId
    ): GetJobUnlockCodeRequest = {
      val __obj = js.Dynamic.literal(
        "JobId" -> JobId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetJobUnlockCodeRequest]
    }
  }

  @js.native
  trait GetJobUnlockCodeResult extends js.Object {
    var UnlockCode: js.UndefOr[String]
  }

  object GetJobUnlockCodeResult {
    @inline
    def apply(
        UnlockCode: js.UndefOr[String] = js.undefined
    ): GetJobUnlockCodeResult = {
      val __obj = js.Dynamic.literal()
      UnlockCode.foreach(__v => __obj.updateDynamic("UnlockCode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetJobUnlockCodeResult]
    }
  }

  @js.native
  trait GetSnowballUsageRequest extends js.Object

  object GetSnowballUsageRequest {
    @inline
    def apply(): GetSnowballUsageRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetSnowballUsageRequest]
    }
  }

  @js.native
  trait GetSnowballUsageResult extends js.Object {
    var SnowballLimit: js.UndefOr[Int]
    var SnowballsInUse: js.UndefOr[Int]
  }

  object GetSnowballUsageResult {
    @inline
    def apply(
        SnowballLimit: js.UndefOr[Int] = js.undefined,
        SnowballsInUse: js.UndefOr[Int] = js.undefined
    ): GetSnowballUsageResult = {
      val __obj = js.Dynamic.literal()
      SnowballLimit.foreach(__v => __obj.updateDynamic("SnowballLimit")(__v.asInstanceOf[js.Any]))
      SnowballsInUse.foreach(__v => __obj.updateDynamic("SnowballsInUse")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSnowballUsageResult]
    }
  }

  @js.native
  trait GetSoftwareUpdatesRequest extends js.Object {
    var JobId: JobId
  }

  object GetSoftwareUpdatesRequest {
    @inline
    def apply(
        JobId: JobId
    ): GetSoftwareUpdatesRequest = {
      val __obj = js.Dynamic.literal(
        "JobId" -> JobId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetSoftwareUpdatesRequest]
    }
  }

  @js.native
  trait GetSoftwareUpdatesResult extends js.Object {
    var UpdatesURI: js.UndefOr[String]
  }

  object GetSoftwareUpdatesResult {
    @inline
    def apply(
        UpdatesURI: js.UndefOr[String] = js.undefined
    ): GetSoftwareUpdatesResult = {
      val __obj = js.Dynamic.literal()
      UpdatesURI.foreach(__v => __obj.updateDynamic("UpdatesURI")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSoftwareUpdatesResult]
    }
  }

  /** The tax documents required in AWS Regions in India.
    */
  @js.native
  trait INDTaxDocuments extends js.Object {
    var GSTIN: js.UndefOr[GSTIN]
  }

  object INDTaxDocuments {
    @inline
    def apply(
        GSTIN: js.UndefOr[GSTIN] = js.undefined
    ): INDTaxDocuments = {
      val __obj = js.Dynamic.literal()
      GSTIN.foreach(__v => __obj.updateDynamic("GSTIN")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[INDTaxDocuments]
    }
  }

  /** Each <code>JobListEntry</code> object contains a job's state, a job's ID, and a value that indicates whether the job is a job part, in the case of an export job.
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
    @inline
    def apply(
        CreationDate: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[String] = js.undefined,
        IsMaster: js.UndefOr[Boolean] = js.undefined,
        JobId: js.UndefOr[String] = js.undefined,
        JobState: js.UndefOr[JobState] = js.undefined,
        JobType: js.UndefOr[JobType] = js.undefined,
        SnowballType: js.UndefOr[SnowballType] = js.undefined
    ): JobListEntry = {
      val __obj = js.Dynamic.literal()
      CreationDate.foreach(__v => __obj.updateDynamic("CreationDate")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      IsMaster.foreach(__v => __obj.updateDynamic("IsMaster")(__v.asInstanceOf[js.Any]))
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      JobState.foreach(__v => __obj.updateDynamic("JobState")(__v.asInstanceOf[js.Any]))
      JobType.foreach(__v => __obj.updateDynamic("JobType")(__v.asInstanceOf[js.Any]))
      SnowballType.foreach(__v => __obj.updateDynamic("SnowballType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobListEntry]
    }
  }

  /** Contains job logs. Whenever a Snow device is used to import data into or export data out of Amazon S3, you'll have the option of downloading a PDF job report. Job logs are returned as a part of the response syntax of the <code>DescribeJob</code> action in the <code>JobMetadata</code> data type. The job logs can be accessed for up to 60 minutes after this request has been made. To access any of the job logs after 60 minutes have passed, you'll have to make another call to the <code>DescribeJob</code> action. For import jobs, the PDF job report becomes available at the end of the import process. For export jobs, your job report typically becomes available while the Snow device for your job part is being delivered to you. The job report provides you insight into the state of your Amazon S3 data transfer. The report includes details about your job or job part for your records. For deeper visibility into the status of your transferred objects, you can look at the two associated logs:
    * a success log and a failure log. The logs are saved in comma-separated value (CSV) format, and the name of each log includes the ID of the job or job part that the log describes.
    */
  @js.native
  trait JobLogs extends js.Object {
    var JobCompletionReportURI: js.UndefOr[String]
    var JobFailureLogURI: js.UndefOr[String]
    var JobSuccessLogURI: js.UndefOr[String]
  }

  object JobLogs {
    @inline
    def apply(
        JobCompletionReportURI: js.UndefOr[String] = js.undefined,
        JobFailureLogURI: js.UndefOr[String] = js.undefined,
        JobSuccessLogURI: js.UndefOr[String] = js.undefined
    ): JobLogs = {
      val __obj = js.Dynamic.literal()
      JobCompletionReportURI.foreach(__v => __obj.updateDynamic("JobCompletionReportURI")(__v.asInstanceOf[js.Any]))
      JobFailureLogURI.foreach(__v => __obj.updateDynamic("JobFailureLogURI")(__v.asInstanceOf[js.Any]))
      JobSuccessLogURI.foreach(__v => __obj.updateDynamic("JobSuccessLogURI")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobLogs]
    }
  }

  /** Contains information about a specific job including shipping information, job status, and other important metadata. This information is returned as a part of the response syntax of the <code>DescribeJob</code> action.
    */
  @js.native
  trait JobMetadata extends js.Object {
    var AddressId: js.UndefOr[AddressId]
    var ClusterId: js.UndefOr[String]
    var CreationDate: js.UndefOr[Timestamp]
    var DataTransferProgress: js.UndefOr[DataTransfer]
    var Description: js.UndefOr[String]
    var DeviceConfiguration: js.UndefOr[DeviceConfiguration]
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
    var TaxDocuments: js.UndefOr[TaxDocuments]
  }

  object JobMetadata {
    @inline
    def apply(
        AddressId: js.UndefOr[AddressId] = js.undefined,
        ClusterId: js.UndefOr[String] = js.undefined,
        CreationDate: js.UndefOr[Timestamp] = js.undefined,
        DataTransferProgress: js.UndefOr[DataTransfer] = js.undefined,
        Description: js.UndefOr[String] = js.undefined,
        DeviceConfiguration: js.UndefOr[DeviceConfiguration] = js.undefined,
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
        SnowballType: js.UndefOr[SnowballType] = js.undefined,
        TaxDocuments: js.UndefOr[TaxDocuments] = js.undefined
    ): JobMetadata = {
      val __obj = js.Dynamic.literal()
      AddressId.foreach(__v => __obj.updateDynamic("AddressId")(__v.asInstanceOf[js.Any]))
      ClusterId.foreach(__v => __obj.updateDynamic("ClusterId")(__v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.updateDynamic("CreationDate")(__v.asInstanceOf[js.Any]))
      DataTransferProgress.foreach(__v => __obj.updateDynamic("DataTransferProgress")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DeviceConfiguration.foreach(__v => __obj.updateDynamic("DeviceConfiguration")(__v.asInstanceOf[js.Any]))
      ForwardingAddressId.foreach(__v => __obj.updateDynamic("ForwardingAddressId")(__v.asInstanceOf[js.Any]))
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      JobLogInfo.foreach(__v => __obj.updateDynamic("JobLogInfo")(__v.asInstanceOf[js.Any]))
      JobState.foreach(__v => __obj.updateDynamic("JobState")(__v.asInstanceOf[js.Any]))
      JobType.foreach(__v => __obj.updateDynamic("JobType")(__v.asInstanceOf[js.Any]))
      KmsKeyARN.foreach(__v => __obj.updateDynamic("KmsKeyARN")(__v.asInstanceOf[js.Any]))
      Notification.foreach(__v => __obj.updateDynamic("Notification")(__v.asInstanceOf[js.Any]))
      Resources.foreach(__v => __obj.updateDynamic("Resources")(__v.asInstanceOf[js.Any]))
      RoleARN.foreach(__v => __obj.updateDynamic("RoleARN")(__v.asInstanceOf[js.Any]))
      ShippingDetails.foreach(__v => __obj.updateDynamic("ShippingDetails")(__v.asInstanceOf[js.Any]))
      SnowballCapacityPreference.foreach(__v => __obj.updateDynamic("SnowballCapacityPreference")(__v.asInstanceOf[js.Any]))
      SnowballType.foreach(__v => __obj.updateDynamic("SnowballType")(__v.asInstanceOf[js.Any]))
      TaxDocuments.foreach(__v => __obj.updateDynamic("TaxDocuments")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobMetadata]
    }
  }

  /** Contains an array of AWS resource objects. Each object represents an Amazon S3 bucket, an AWS Lambda function, or an Amazon Machine Image (AMI) based on Amazon EC2 that is associated with a particular job.
    */
  @js.native
  trait JobResource extends js.Object {
    var Ec2AmiResources: js.UndefOr[Ec2AmiResourceList]
    var LambdaResources: js.UndefOr[LambdaResourceList]
    var S3Resources: js.UndefOr[S3ResourceList]
  }

  object JobResource {
    @inline
    def apply(
        Ec2AmiResources: js.UndefOr[Ec2AmiResourceList] = js.undefined,
        LambdaResources: js.UndefOr[LambdaResourceList] = js.undefined,
        S3Resources: js.UndefOr[S3ResourceList] = js.undefined
    ): JobResource = {
      val __obj = js.Dynamic.literal()
      Ec2AmiResources.foreach(__v => __obj.updateDynamic("Ec2AmiResources")(__v.asInstanceOf[js.Any]))
      LambdaResources.foreach(__v => __obj.updateDynamic("LambdaResources")(__v.asInstanceOf[js.Any]))
      S3Resources.foreach(__v => __obj.updateDynamic("S3Resources")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobResource]
    }
  }

  /** Contains a key range. For export jobs, a <code>S3Resource</code> object can have an optional <code>KeyRange</code> value. The length of the range is defined at job creation, and has either an inclusive <code>BeginMarker</code>, an inclusive <code>EndMarker</code>, or both. Ranges are UTF-8 binary sorted.
    */
  @js.native
  trait KeyRange extends js.Object {
    var BeginMarker: js.UndefOr[String]
    var EndMarker: js.UndefOr[String]
  }

  object KeyRange {
    @inline
    def apply(
        BeginMarker: js.UndefOr[String] = js.undefined,
        EndMarker: js.UndefOr[String] = js.undefined
    ): KeyRange = {
      val __obj = js.Dynamic.literal()
      BeginMarker.foreach(__v => __obj.updateDynamic("BeginMarker")(__v.asInstanceOf[js.Any]))
      EndMarker.foreach(__v => __obj.updateDynamic("EndMarker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KeyRange]
    }
  }

  /** Identifies
    */
  @js.native
  trait LambdaResource extends js.Object {
    var EventTriggers: js.UndefOr[EventTriggerDefinitionList]
    var LambdaArn: js.UndefOr[ResourceARN]
  }

  object LambdaResource {
    @inline
    def apply(
        EventTriggers: js.UndefOr[EventTriggerDefinitionList] = js.undefined,
        LambdaArn: js.UndefOr[ResourceARN] = js.undefined
    ): LambdaResource = {
      val __obj = js.Dynamic.literal()
      EventTriggers.foreach(__v => __obj.updateDynamic("EventTriggers")(__v.asInstanceOf[js.Any]))
      LambdaArn.foreach(__v => __obj.updateDynamic("LambdaArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LambdaResource]
    }
  }

  @js.native
  trait ListClusterJobsRequest extends js.Object {
    var ClusterId: ClusterId
    var MaxResults: js.UndefOr[ListLimit]
    var NextToken: js.UndefOr[String]
  }

  object ListClusterJobsRequest {
    @inline
    def apply(
        ClusterId: ClusterId,
        MaxResults: js.UndefOr[ListLimit] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListClusterJobsRequest = {
      val __obj = js.Dynamic.literal(
        "ClusterId" -> ClusterId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListClusterJobsRequest]
    }
  }

  @js.native
  trait ListClusterJobsResult extends js.Object {
    var JobListEntries: js.UndefOr[JobListEntryList]
    var NextToken: js.UndefOr[String]
  }

  object ListClusterJobsResult {
    @inline
    def apply(
        JobListEntries: js.UndefOr[JobListEntryList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListClusterJobsResult = {
      val __obj = js.Dynamic.literal()
      JobListEntries.foreach(__v => __obj.updateDynamic("JobListEntries")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListClusterJobsResult]
    }
  }

  @js.native
  trait ListClustersRequest extends js.Object {
    var MaxResults: js.UndefOr[ListLimit]
    var NextToken: js.UndefOr[String]
  }

  object ListClustersRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[ListLimit] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListClustersRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListClustersRequest]
    }
  }

  @js.native
  trait ListClustersResult extends js.Object {
    var ClusterListEntries: js.UndefOr[ClusterListEntryList]
    var NextToken: js.UndefOr[String]
  }

  object ListClustersResult {
    @inline
    def apply(
        ClusterListEntries: js.UndefOr[ClusterListEntryList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListClustersResult = {
      val __obj = js.Dynamic.literal()
      ClusterListEntries.foreach(__v => __obj.updateDynamic("ClusterListEntries")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListClustersResult]
    }
  }

  @js.native
  trait ListCompatibleImagesRequest extends js.Object {
    var MaxResults: js.UndefOr[ListLimit]
    var NextToken: js.UndefOr[String]
  }

  object ListCompatibleImagesRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[ListLimit] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListCompatibleImagesRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCompatibleImagesRequest]
    }
  }

  @js.native
  trait ListCompatibleImagesResult extends js.Object {
    var CompatibleImages: js.UndefOr[CompatibleImageList]
    var NextToken: js.UndefOr[String]
  }

  object ListCompatibleImagesResult {
    @inline
    def apply(
        CompatibleImages: js.UndefOr[CompatibleImageList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListCompatibleImagesResult = {
      val __obj = js.Dynamic.literal()
      CompatibleImages.foreach(__v => __obj.updateDynamic("CompatibleImages")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCompatibleImagesResult]
    }
  }

  @js.native
  trait ListJobsRequest extends js.Object {
    var MaxResults: js.UndefOr[ListLimit]
    var NextToken: js.UndefOr[String]
  }

  object ListJobsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[ListLimit] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListJobsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListJobsRequest]
    }
  }

  @js.native
  trait ListJobsResult extends js.Object {
    var JobListEntries: js.UndefOr[JobListEntryList]
    var NextToken: js.UndefOr[String]
  }

  object ListJobsResult {
    @inline
    def apply(
        JobListEntries: js.UndefOr[JobListEntryList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListJobsResult = {
      val __obj = js.Dynamic.literal()
      JobListEntries.foreach(__v => __obj.updateDynamic("JobListEntries")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListJobsResult]
    }
  }

  /** The Amazon Simple Notification Service (Amazon SNS) notification settings associated with a specific job. The <code>Notification</code> object is returned as a part of the response syntax of the <code>DescribeJob</code> action in the <code>JobMetadata</code> data type. When the notification settings are defined during job creation, you can choose to notify based on a specific set of job states using the <code>JobStatesToNotify</code> array of strings, or you can specify that you want to have Amazon SNS notifications sent out for all job states with <code>NotifyAll</code> set to true.
    */
  @js.native
  trait Notification extends js.Object {
    var JobStatesToNotify: js.UndefOr[JobStateList]
    var NotifyAll: js.UndefOr[Boolean]
    var SnsTopicARN: js.UndefOr[SnsTopicARN]
  }

  object Notification {
    @inline
    def apply(
        JobStatesToNotify: js.UndefOr[JobStateList] = js.undefined,
        NotifyAll: js.UndefOr[Boolean] = js.undefined,
        SnsTopicARN: js.UndefOr[SnsTopicARN] = js.undefined
    ): Notification = {
      val __obj = js.Dynamic.literal()
      JobStatesToNotify.foreach(__v => __obj.updateDynamic("JobStatesToNotify")(__v.asInstanceOf[js.Any]))
      NotifyAll.foreach(__v => __obj.updateDynamic("NotifyAll")(__v.asInstanceOf[js.Any]))
      SnsTopicARN.foreach(__v => __obj.updateDynamic("SnsTopicARN")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Notification]
    }
  }

  /** Each <code>S3Resource</code> object represents an Amazon S3 bucket that your transferred data will be exported from or imported into. For export jobs, this object can have an optional <code>KeyRange</code> value. The length of the range is defined at job creation, and has either an inclusive <code>BeginMarker</code>, an inclusive <code>EndMarker</code>, or both. Ranges are UTF-8 binary sorted.
    */
  @js.native
  trait S3Resource extends js.Object {
    var BucketArn: js.UndefOr[ResourceARN]
    var KeyRange: js.UndefOr[KeyRange]
  }

  object S3Resource {
    @inline
    def apply(
        BucketArn: js.UndefOr[ResourceARN] = js.undefined,
        KeyRange: js.UndefOr[KeyRange] = js.undefined
    ): S3Resource = {
      val __obj = js.Dynamic.literal()
      BucketArn.foreach(__v => __obj.updateDynamic("BucketArn")(__v.asInstanceOf[js.Any]))
      KeyRange.foreach(__v => __obj.updateDynamic("KeyRange")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3Resource]
    }
  }

  /** The <code>Status</code> and <code>TrackingNumber</code> information for an inbound or outbound shipment.
    */
  @js.native
  trait Shipment extends js.Object {
    var Status: js.UndefOr[String]
    var TrackingNumber: js.UndefOr[String]
  }

  object Shipment {
    @inline
    def apply(
        Status: js.UndefOr[String] = js.undefined,
        TrackingNumber: js.UndefOr[String] = js.undefined
    ): Shipment = {
      val __obj = js.Dynamic.literal()
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TrackingNumber.foreach(__v => __obj.updateDynamic("TrackingNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Shipment]
    }
  }

  /** A job's shipping information, including inbound and outbound tracking numbers and shipping speed options.
    */
  @js.native
  trait ShippingDetails extends js.Object {
    var InboundShipment: js.UndefOr[Shipment]
    var OutboundShipment: js.UndefOr[Shipment]
    var ShippingOption: js.UndefOr[ShippingOption]
  }

  object ShippingDetails {
    @inline
    def apply(
        InboundShipment: js.UndefOr[Shipment] = js.undefined,
        OutboundShipment: js.UndefOr[Shipment] = js.undefined,
        ShippingOption: js.UndefOr[ShippingOption] = js.undefined
    ): ShippingDetails = {
      val __obj = js.Dynamic.literal()
      InboundShipment.foreach(__v => __obj.updateDynamic("InboundShipment")(__v.asInstanceOf[js.Any]))
      OutboundShipment.foreach(__v => __obj.updateDynamic("OutboundShipment")(__v.asInstanceOf[js.Any]))
      ShippingOption.foreach(__v => __obj.updateDynamic("ShippingOption")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ShippingDetails]
    }
  }

  /** Specifies the device configuration for an AWS Snowcone job.
    */
  @js.native
  trait SnowconeDeviceConfiguration extends js.Object {
    var WirelessConnection: js.UndefOr[WirelessConnection]
  }

  object SnowconeDeviceConfiguration {
    @inline
    def apply(
        WirelessConnection: js.UndefOr[WirelessConnection] = js.undefined
    ): SnowconeDeviceConfiguration = {
      val __obj = js.Dynamic.literal()
      WirelessConnection.foreach(__v => __obj.updateDynamic("WirelessConnection")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SnowconeDeviceConfiguration]
    }
  }

  /** The tax documents required in your AWS Region.
    */
  @js.native
  trait TaxDocuments extends js.Object {
    var IND: js.UndefOr[INDTaxDocuments]
  }

  object TaxDocuments {
    @inline
    def apply(
        IND: js.UndefOr[INDTaxDocuments] = js.undefined
    ): TaxDocuments = {
      val __obj = js.Dynamic.literal()
      IND.foreach(__v => __obj.updateDynamic("IND")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TaxDocuments]
    }
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
    @inline
    def apply(
        ClusterId: ClusterId,
        AddressId: js.UndefOr[AddressId] = js.undefined,
        Description: js.UndefOr[String] = js.undefined,
        ForwardingAddressId: js.UndefOr[AddressId] = js.undefined,
        Notification: js.UndefOr[Notification] = js.undefined,
        Resources: js.UndefOr[JobResource] = js.undefined,
        RoleARN: js.UndefOr[RoleARN] = js.undefined,
        ShippingOption: js.UndefOr[ShippingOption] = js.undefined
    ): UpdateClusterRequest = {
      val __obj = js.Dynamic.literal(
        "ClusterId" -> ClusterId.asInstanceOf[js.Any]
      )

      AddressId.foreach(__v => __obj.updateDynamic("AddressId")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      ForwardingAddressId.foreach(__v => __obj.updateDynamic("ForwardingAddressId")(__v.asInstanceOf[js.Any]))
      Notification.foreach(__v => __obj.updateDynamic("Notification")(__v.asInstanceOf[js.Any]))
      Resources.foreach(__v => __obj.updateDynamic("Resources")(__v.asInstanceOf[js.Any]))
      RoleARN.foreach(__v => __obj.updateDynamic("RoleARN")(__v.asInstanceOf[js.Any]))
      ShippingOption.foreach(__v => __obj.updateDynamic("ShippingOption")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateClusterRequest]
    }
  }

  @js.native
  trait UpdateClusterResult extends js.Object

  object UpdateClusterResult {
    @inline
    def apply(): UpdateClusterResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateClusterResult]
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
    @inline
    def apply(
        JobId: JobId,
        AddressId: js.UndefOr[AddressId] = js.undefined,
        Description: js.UndefOr[String] = js.undefined,
        ForwardingAddressId: js.UndefOr[AddressId] = js.undefined,
        Notification: js.UndefOr[Notification] = js.undefined,
        Resources: js.UndefOr[JobResource] = js.undefined,
        RoleARN: js.UndefOr[RoleARN] = js.undefined,
        ShippingOption: js.UndefOr[ShippingOption] = js.undefined,
        SnowballCapacityPreference: js.UndefOr[SnowballCapacity] = js.undefined
    ): UpdateJobRequest = {
      val __obj = js.Dynamic.literal(
        "JobId" -> JobId.asInstanceOf[js.Any]
      )

      AddressId.foreach(__v => __obj.updateDynamic("AddressId")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      ForwardingAddressId.foreach(__v => __obj.updateDynamic("ForwardingAddressId")(__v.asInstanceOf[js.Any]))
      Notification.foreach(__v => __obj.updateDynamic("Notification")(__v.asInstanceOf[js.Any]))
      Resources.foreach(__v => __obj.updateDynamic("Resources")(__v.asInstanceOf[js.Any]))
      RoleARN.foreach(__v => __obj.updateDynamic("RoleARN")(__v.asInstanceOf[js.Any]))
      ShippingOption.foreach(__v => __obj.updateDynamic("ShippingOption")(__v.asInstanceOf[js.Any]))
      SnowballCapacityPreference.foreach(__v => __obj.updateDynamic("SnowballCapacityPreference")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateJobRequest]
    }
  }

  @js.native
  trait UpdateJobResult extends js.Object

  object UpdateJobResult {
    @inline
    def apply(): UpdateJobResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateJobResult]
    }
  }

  @js.native
  trait UpdateJobShipmentStateRequest extends js.Object {
    var JobId: JobId
    var ShipmentState: ShipmentState
  }

  object UpdateJobShipmentStateRequest {
    @inline
    def apply(
        JobId: JobId,
        ShipmentState: ShipmentState
    ): UpdateJobShipmentStateRequest = {
      val __obj = js.Dynamic.literal(
        "JobId" -> JobId.asInstanceOf[js.Any],
        "ShipmentState" -> ShipmentState.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateJobShipmentStateRequest]
    }
  }

  @js.native
  trait UpdateJobShipmentStateResult extends js.Object

  object UpdateJobShipmentStateResult {
    @inline
    def apply(): UpdateJobShipmentStateResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateJobShipmentStateResult]
    }
  }

  /** Configures the wireless connection on an AWS Snowcone device.
    */
  @js.native
  trait WirelessConnection extends js.Object {
    var IsWifiEnabled: js.UndefOr[Boolean]
  }

  object WirelessConnection {
    @inline
    def apply(
        IsWifiEnabled: js.UndefOr[Boolean] = js.undefined
    ): WirelessConnection = {
      val __obj = js.Dynamic.literal()
      IsWifiEnabled.foreach(__v => __obj.updateDynamic("IsWifiEnabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WirelessConnection]
    }
  }
}
