package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object importexport {
  type APIVersion            = String
  type ArtifactList          = js.Array[Artifact]
  type Carrier               = String
  type CreationDate          = js.Date
  type CurrentManifest       = String
  type Description           = String
  type ErrorCount            = Int
  type ErrorMessage          = String
  type GenericString         = String
  type IsCanceled            = Boolean
  type IsTruncated           = Boolean
  type JobId                 = String
  type JobIdList             = js.Array[GenericString]
  type JobsList              = js.Array[Job]
  type LocationCode          = String
  type LocationMessage       = String
  type LogBucket             = String
  type LogKey                = String
  type Manifest              = String
  type ManifestAddendum      = String
  type Marker                = String
  type MaxJobs               = Int
  type ProgressCode          = String
  type ProgressMessage       = String
  type Signature             = String
  type SignatureFileContents = String
  type Success               = Boolean
  type TrackingNumber        = String
  type URL                   = String
  type ValidateOnly          = Boolean
  type WarningMessage        = String
  type city                  = String
  type company               = String
  type country               = String
  type name                  = String
  type phoneNumber           = String
  type postalCode            = String
  type stateOrProvince       = String
  type street1               = String
  type street2               = String
  type street3               = String

  implicit final class ImportExportOps(private val service: ImportExport) extends AnyVal {

    @inline def cancelJobFuture(params: CancelJobInput): Future[CancelJobOutput] =
      service.cancelJob(params).promise().toFuture
    @inline def createJobFuture(params: CreateJobInput): Future[CreateJobOutput] =
      service.createJob(params).promise().toFuture
    @inline def getShippingLabelFuture(params: GetShippingLabelInput): Future[GetShippingLabelOutput] =
      service.getShippingLabel(params).promise().toFuture
    @inline def getStatusFuture(params: GetStatusInput): Future[GetStatusOutput] =
      service.getStatus(params).promise().toFuture
    @inline def listJobsFuture(params: ListJobsInput): Future[ListJobsOutput] =
      service.listJobs(params).promise().toFuture
    @inline def updateJobFuture(params: UpdateJobInput): Future[UpdateJobOutput] =
      service.updateJob(params).promise().toFuture
  }
}

package importexport {
  @js.native
  @JSImport("aws-sdk", "ImportExport")
  class ImportExport() extends js.Object {
    def this(config: AWSConfig) = this()

    def cancelJob(params: CancelJobInput): Request[CancelJobOutput]                      = js.native
    def createJob(params: CreateJobInput): Request[CreateJobOutput]                      = js.native
    def getShippingLabel(params: GetShippingLabelInput): Request[GetShippingLabelOutput] = js.native
    def getStatus(params: GetStatusInput): Request[GetStatusOutput]                      = js.native
    def listJobs(params: ListJobsInput): Request[ListJobsOutput]                         = js.native
    def updateJob(params: UpdateJobInput): Request[UpdateJobOutput]                      = js.native
  }

  /**
    * A discrete item that contains the description and URL of an artifact (such as a PDF).
    */
  @js.native
  trait Artifact extends js.Object {
    var Description: js.UndefOr[Description]
    var URL: js.UndefOr[URL]
  }

  object Artifact {
    @inline
    def apply(
        Description: js.UndefOr[Description] = js.undefined,
        URL: js.UndefOr[URL] = js.undefined
    ): Artifact = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      URL.foreach(__v => __obj.updateDynamic("URL")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Artifact]
    }
  }

  /**
    * The account specified does not have the appropriate bucket permissions.
    */
  @js.native
  trait BucketPermissionExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
    * Input structure for the CancelJob operation.
    */
  @js.native
  trait CancelJobInput extends js.Object {
    var JobId: JobId
    var APIVersion: js.UndefOr[APIVersion]
  }

  object CancelJobInput {
    @inline
    def apply(
        JobId: JobId,
        APIVersion: js.UndefOr[APIVersion] = js.undefined
    ): CancelJobInput = {
      val __obj = js.Dynamic.literal(
        "JobId" -> JobId.asInstanceOf[js.Any]
      )

      APIVersion.foreach(__v => __obj.updateDynamic("APIVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CancelJobInput]
    }
  }

  /**
    * Output structure for the CancelJob operation.
    */
  @js.native
  trait CancelJobOutput extends js.Object {
    var Success: js.UndefOr[Success]
  }

  object CancelJobOutput {
    @inline
    def apply(
        Success: js.UndefOr[Success] = js.undefined
    ): CancelJobOutput = {
      val __obj = js.Dynamic.literal()
      Success.foreach(__v => __obj.updateDynamic("Success")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CancelJobOutput]
    }
  }

  /**
    * The specified job ID has been canceled and is no longer valid.
    */
  @js.native
  trait CanceledJobIdExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
    * Input structure for the CreateJob operation.
    */
  @js.native
  trait CreateJobInput extends js.Object {
    var JobType: JobType
    var Manifest: Manifest
    var ValidateOnly: ValidateOnly
    var APIVersion: js.UndefOr[APIVersion]
    var ManifestAddendum: js.UndefOr[ManifestAddendum]
  }

  object CreateJobInput {
    @inline
    def apply(
        JobType: JobType,
        Manifest: Manifest,
        ValidateOnly: ValidateOnly,
        APIVersion: js.UndefOr[APIVersion] = js.undefined,
        ManifestAddendum: js.UndefOr[ManifestAddendum] = js.undefined
    ): CreateJobInput = {
      val __obj = js.Dynamic.literal(
        "JobType"      -> JobType.asInstanceOf[js.Any],
        "Manifest"     -> Manifest.asInstanceOf[js.Any],
        "ValidateOnly" -> ValidateOnly.asInstanceOf[js.Any]
      )

      APIVersion.foreach(__v => __obj.updateDynamic("APIVersion")(__v.asInstanceOf[js.Any]))
      ManifestAddendum.foreach(__v => __obj.updateDynamic("ManifestAddendum")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateJobInput]
    }
  }

  /**
    * Output structure for the CreateJob operation.
    */
  @js.native
  trait CreateJobOutput extends js.Object {
    var ArtifactList: js.UndefOr[ArtifactList]
    var JobId: js.UndefOr[JobId]
    var JobType: js.UndefOr[JobType]
    var Signature: js.UndefOr[Signature]
    var SignatureFileContents: js.UndefOr[SignatureFileContents]
    var WarningMessage: js.UndefOr[WarningMessage]
  }

  object CreateJobOutput {
    @inline
    def apply(
        ArtifactList: js.UndefOr[ArtifactList] = js.undefined,
        JobId: js.UndefOr[JobId] = js.undefined,
        JobType: js.UndefOr[JobType] = js.undefined,
        Signature: js.UndefOr[Signature] = js.undefined,
        SignatureFileContents: js.UndefOr[SignatureFileContents] = js.undefined,
        WarningMessage: js.UndefOr[WarningMessage] = js.undefined
    ): CreateJobOutput = {
      val __obj = js.Dynamic.literal()
      ArtifactList.foreach(__v => __obj.updateDynamic("ArtifactList")(__v.asInstanceOf[js.Any]))
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      JobType.foreach(__v => __obj.updateDynamic("JobType")(__v.asInstanceOf[js.Any]))
      Signature.foreach(__v => __obj.updateDynamic("Signature")(__v.asInstanceOf[js.Any]))
      SignatureFileContents.foreach(__v => __obj.updateDynamic("SignatureFileContents")(__v.asInstanceOf[js.Any]))
      WarningMessage.foreach(__v => __obj.updateDynamic("WarningMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateJobOutput]
    }
  }

  /**
    * Each account can create only a certain number of jobs per day. If you need to create more than this, please contact awsimportexport@amazon.com to explain your particular use case.
    */
  @js.native
  trait CreateJobQuotaExceededExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
    * Indicates that the specified job has expired out of the system.
    */
  @js.native
  trait ExpiredJobIdExceptionException extends js.Object {
    val message: ErrorMessage
  }

  @js.native
  trait GetShippingLabelInput extends js.Object {
    var jobIds: JobIdList
    var APIVersion: js.UndefOr[APIVersion]
    var city: js.UndefOr[city]
    var company: js.UndefOr[company]
    var country: js.UndefOr[country]
    var name: js.UndefOr[name]
    var phoneNumber: js.UndefOr[phoneNumber]
    var postalCode: js.UndefOr[postalCode]
    var stateOrProvince: js.UndefOr[stateOrProvince]
    var street1: js.UndefOr[street1]
    var street2: js.UndefOr[street2]
    var street3: js.UndefOr[street3]
  }

  object GetShippingLabelInput {
    @inline
    def apply(
        jobIds: JobIdList,
        APIVersion: js.UndefOr[APIVersion] = js.undefined,
        city: js.UndefOr[city] = js.undefined,
        company: js.UndefOr[company] = js.undefined,
        country: js.UndefOr[country] = js.undefined,
        name: js.UndefOr[name] = js.undefined,
        phoneNumber: js.UndefOr[phoneNumber] = js.undefined,
        postalCode: js.UndefOr[postalCode] = js.undefined,
        stateOrProvince: js.UndefOr[stateOrProvince] = js.undefined,
        street1: js.UndefOr[street1] = js.undefined,
        street2: js.UndefOr[street2] = js.undefined,
        street3: js.UndefOr[street3] = js.undefined
    ): GetShippingLabelInput = {
      val __obj = js.Dynamic.literal(
        "jobIds" -> jobIds.asInstanceOf[js.Any]
      )

      APIVersion.foreach(__v => __obj.updateDynamic("APIVersion")(__v.asInstanceOf[js.Any]))
      city.foreach(__v => __obj.updateDynamic("city")(__v.asInstanceOf[js.Any]))
      company.foreach(__v => __obj.updateDynamic("company")(__v.asInstanceOf[js.Any]))
      country.foreach(__v => __obj.updateDynamic("country")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      phoneNumber.foreach(__v => __obj.updateDynamic("phoneNumber")(__v.asInstanceOf[js.Any]))
      postalCode.foreach(__v => __obj.updateDynamic("postalCode")(__v.asInstanceOf[js.Any]))
      stateOrProvince.foreach(__v => __obj.updateDynamic("stateOrProvince")(__v.asInstanceOf[js.Any]))
      street1.foreach(__v => __obj.updateDynamic("street1")(__v.asInstanceOf[js.Any]))
      street2.foreach(__v => __obj.updateDynamic("street2")(__v.asInstanceOf[js.Any]))
      street3.foreach(__v => __obj.updateDynamic("street3")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetShippingLabelInput]
    }
  }

  @js.native
  trait GetShippingLabelOutput extends js.Object {
    var ShippingLabelURL: js.UndefOr[GenericString]
    var Warning: js.UndefOr[GenericString]
  }

  object GetShippingLabelOutput {
    @inline
    def apply(
        ShippingLabelURL: js.UndefOr[GenericString] = js.undefined,
        Warning: js.UndefOr[GenericString] = js.undefined
    ): GetShippingLabelOutput = {
      val __obj = js.Dynamic.literal()
      ShippingLabelURL.foreach(__v => __obj.updateDynamic("ShippingLabelURL")(__v.asInstanceOf[js.Any]))
      Warning.foreach(__v => __obj.updateDynamic("Warning")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetShippingLabelOutput]
    }
  }

  /**
    * Input structure for the GetStatus operation.
    */
  @js.native
  trait GetStatusInput extends js.Object {
    var JobId: JobId
    var APIVersion: js.UndefOr[APIVersion]
  }

  object GetStatusInput {
    @inline
    def apply(
        JobId: JobId,
        APIVersion: js.UndefOr[APIVersion] = js.undefined
    ): GetStatusInput = {
      val __obj = js.Dynamic.literal(
        "JobId" -> JobId.asInstanceOf[js.Any]
      )

      APIVersion.foreach(__v => __obj.updateDynamic("APIVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetStatusInput]
    }
  }

  /**
    * Output structure for the GetStatus operation.
    */
  @js.native
  trait GetStatusOutput extends js.Object {
    var ArtifactList: js.UndefOr[ArtifactList]
    var Carrier: js.UndefOr[Carrier]
    var CreationDate: js.UndefOr[CreationDate]
    var CurrentManifest: js.UndefOr[CurrentManifest]
    var ErrorCount: js.UndefOr[ErrorCount]
    var JobId: js.UndefOr[JobId]
    var JobType: js.UndefOr[JobType]
    var LocationCode: js.UndefOr[LocationCode]
    var LocationMessage: js.UndefOr[LocationMessage]
    var LogBucket: js.UndefOr[LogBucket]
    var LogKey: js.UndefOr[LogKey]
    var ProgressCode: js.UndefOr[ProgressCode]
    var ProgressMessage: js.UndefOr[ProgressMessage]
    var Signature: js.UndefOr[Signature]
    var SignatureFileContents: js.UndefOr[Signature]
    var TrackingNumber: js.UndefOr[TrackingNumber]
  }

  object GetStatusOutput {
    @inline
    def apply(
        ArtifactList: js.UndefOr[ArtifactList] = js.undefined,
        Carrier: js.UndefOr[Carrier] = js.undefined,
        CreationDate: js.UndefOr[CreationDate] = js.undefined,
        CurrentManifest: js.UndefOr[CurrentManifest] = js.undefined,
        ErrorCount: js.UndefOr[ErrorCount] = js.undefined,
        JobId: js.UndefOr[JobId] = js.undefined,
        JobType: js.UndefOr[JobType] = js.undefined,
        LocationCode: js.UndefOr[LocationCode] = js.undefined,
        LocationMessage: js.UndefOr[LocationMessage] = js.undefined,
        LogBucket: js.UndefOr[LogBucket] = js.undefined,
        LogKey: js.UndefOr[LogKey] = js.undefined,
        ProgressCode: js.UndefOr[ProgressCode] = js.undefined,
        ProgressMessage: js.UndefOr[ProgressMessage] = js.undefined,
        Signature: js.UndefOr[Signature] = js.undefined,
        SignatureFileContents: js.UndefOr[Signature] = js.undefined,
        TrackingNumber: js.UndefOr[TrackingNumber] = js.undefined
    ): GetStatusOutput = {
      val __obj = js.Dynamic.literal()
      ArtifactList.foreach(__v => __obj.updateDynamic("ArtifactList")(__v.asInstanceOf[js.Any]))
      Carrier.foreach(__v => __obj.updateDynamic("Carrier")(__v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.updateDynamic("CreationDate")(__v.asInstanceOf[js.Any]))
      CurrentManifest.foreach(__v => __obj.updateDynamic("CurrentManifest")(__v.asInstanceOf[js.Any]))
      ErrorCount.foreach(__v => __obj.updateDynamic("ErrorCount")(__v.asInstanceOf[js.Any]))
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      JobType.foreach(__v => __obj.updateDynamic("JobType")(__v.asInstanceOf[js.Any]))
      LocationCode.foreach(__v => __obj.updateDynamic("LocationCode")(__v.asInstanceOf[js.Any]))
      LocationMessage.foreach(__v => __obj.updateDynamic("LocationMessage")(__v.asInstanceOf[js.Any]))
      LogBucket.foreach(__v => __obj.updateDynamic("LogBucket")(__v.asInstanceOf[js.Any]))
      LogKey.foreach(__v => __obj.updateDynamic("LogKey")(__v.asInstanceOf[js.Any]))
      ProgressCode.foreach(__v => __obj.updateDynamic("ProgressCode")(__v.asInstanceOf[js.Any]))
      ProgressMessage.foreach(__v => __obj.updateDynamic("ProgressMessage")(__v.asInstanceOf[js.Any]))
      Signature.foreach(__v => __obj.updateDynamic("Signature")(__v.asInstanceOf[js.Any]))
      SignatureFileContents.foreach(__v => __obj.updateDynamic("SignatureFileContents")(__v.asInstanceOf[js.Any]))
      TrackingNumber.foreach(__v => __obj.updateDynamic("TrackingNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetStatusOutput]
    }
  }

  /**
    * The AWS Access Key ID specified in the request did not match the manifest's accessKeyId value. The manifest and the request authentication must use the same AWS Access Key ID.
    */
  @js.native
  trait InvalidAccessKeyIdExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
    * The address specified in the manifest is invalid.
    */
  @js.native
  trait InvalidAddressExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
    * One or more customs parameters was invalid. Please correct and resubmit.
    */
  @js.native
  trait InvalidCustomsExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
    * File system specified in export manifest is invalid.
    */
  @js.native
  trait InvalidFileSystemExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
    * The JOBID was missing, not found, or not associated with the AWS account.
    */
  @js.native
  trait InvalidJobIdExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
    * One or more manifest fields was invalid. Please correct and resubmit.
    */
  @js.native
  trait InvalidManifestFieldExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
    * One or more parameters had an invalid value.
    */
  @js.native
  trait InvalidParameterExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
    * The client tool version is invalid.
    */
  @js.native
  trait InvalidVersionExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
    * Representation of a job returned by the ListJobs operation.
    */
  @js.native
  trait Job extends js.Object {
    var CreationDate: js.UndefOr[CreationDate]
    var IsCanceled: js.UndefOr[IsCanceled]
    var JobId: js.UndefOr[JobId]
    var JobType: js.UndefOr[JobType]
  }

  object Job {
    @inline
    def apply(
        CreationDate: js.UndefOr[CreationDate] = js.undefined,
        IsCanceled: js.UndefOr[IsCanceled] = js.undefined,
        JobId: js.UndefOr[JobId] = js.undefined,
        JobType: js.UndefOr[JobType] = js.undefined
    ): Job = {
      val __obj = js.Dynamic.literal()
      CreationDate.foreach(__v => __obj.updateDynamic("CreationDate")(__v.asInstanceOf[js.Any]))
      IsCanceled.foreach(__v => __obj.updateDynamic("IsCanceled")(__v.asInstanceOf[js.Any]))
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      JobType.foreach(__v => __obj.updateDynamic("JobType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Job]
    }
  }

  /**
    * Specifies whether the job to initiate is an import or export job.
    */
  @js.native
  sealed trait JobType extends js.Any
  object JobType extends js.Object {
    val Import = "Import".asInstanceOf[JobType]
    val Export = "Export".asInstanceOf[JobType]

    val values = js.Object.freeze(js.Array(Import, Export))
  }

  /**
    * Input structure for the ListJobs operation.
    */
  @js.native
  trait ListJobsInput extends js.Object {
    var APIVersion: js.UndefOr[APIVersion]
    var Marker: js.UndefOr[Marker]
    var MaxJobs: js.UndefOr[MaxJobs]
  }

  object ListJobsInput {
    @inline
    def apply(
        APIVersion: js.UndefOr[APIVersion] = js.undefined,
        Marker: js.UndefOr[Marker] = js.undefined,
        MaxJobs: js.UndefOr[MaxJobs] = js.undefined
    ): ListJobsInput = {
      val __obj = js.Dynamic.literal()
      APIVersion.foreach(__v => __obj.updateDynamic("APIVersion")(__v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.updateDynamic("Marker")(__v.asInstanceOf[js.Any]))
      MaxJobs.foreach(__v => __obj.updateDynamic("MaxJobs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListJobsInput]
    }
  }

  /**
    * Output structure for the ListJobs operation.
    */
  @js.native
  trait ListJobsOutput extends js.Object {
    var IsTruncated: js.UndefOr[IsTruncated]
    var Jobs: js.UndefOr[JobsList]
  }

  object ListJobsOutput {
    @inline
    def apply(
        IsTruncated: js.UndefOr[IsTruncated] = js.undefined,
        Jobs: js.UndefOr[JobsList] = js.undefined
    ): ListJobsOutput = {
      val __obj = js.Dynamic.literal()
      IsTruncated.foreach(__v => __obj.updateDynamic("IsTruncated")(__v.asInstanceOf[js.Any]))
      Jobs.foreach(__v => __obj.updateDynamic("Jobs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListJobsOutput]
    }
  }

  /**
    * Your manifest is not well-formed.
    */
  @js.native
  trait MalformedManifestExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
    * One or more required customs parameters was missing from the manifest.
    */
  @js.native
  trait MissingCustomsExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
    * One or more required fields were missing from the manifest file. Please correct and resubmit.
    */
  @js.native
  trait MissingManifestFieldExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
    * One or more required parameters was missing from the request.
    */
  @js.native
  trait MissingParameterExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
    * Your manifest file contained buckets from multiple regions. A job is restricted to buckets from one region. Please correct and resubmit.
    */
  @js.native
  trait MultipleRegionsExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
    * The specified bucket does not exist. Create the specified bucket or change the manifest's bucket, exportBucket, or logBucket field to a bucket that the account, as specified by the manifest's Access Key ID, has write permissions to.
    */
  @js.native
  trait NoSuchBucketExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
    * AWS Import/Export cannot cancel the job
    */
  @js.native
  trait UnableToCancelJobIdExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
    * AWS Import/Export cannot update the job
    */
  @js.native
  trait UnableToUpdateJobIdExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
    * Input structure for the UpateJob operation.
    */
  @js.native
  trait UpdateJobInput extends js.Object {
    var JobId: JobId
    var JobType: JobType
    var Manifest: Manifest
    var ValidateOnly: ValidateOnly
    var APIVersion: js.UndefOr[APIVersion]
  }

  object UpdateJobInput {
    @inline
    def apply(
        JobId: JobId,
        JobType: JobType,
        Manifest: Manifest,
        ValidateOnly: ValidateOnly,
        APIVersion: js.UndefOr[APIVersion] = js.undefined
    ): UpdateJobInput = {
      val __obj = js.Dynamic.literal(
        "JobId"        -> JobId.asInstanceOf[js.Any],
        "JobType"      -> JobType.asInstanceOf[js.Any],
        "Manifest"     -> Manifest.asInstanceOf[js.Any],
        "ValidateOnly" -> ValidateOnly.asInstanceOf[js.Any]
      )

      APIVersion.foreach(__v => __obj.updateDynamic("APIVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateJobInput]
    }
  }

  /**
    * Output structure for the UpateJob operation.
    */
  @js.native
  trait UpdateJobOutput extends js.Object {
    var ArtifactList: js.UndefOr[ArtifactList]
    var Success: js.UndefOr[Success]
    var WarningMessage: js.UndefOr[WarningMessage]
  }

  object UpdateJobOutput {
    @inline
    def apply(
        ArtifactList: js.UndefOr[ArtifactList] = js.undefined,
        Success: js.UndefOr[Success] = js.undefined,
        WarningMessage: js.UndefOr[WarningMessage] = js.undefined
    ): UpdateJobOutput = {
      val __obj = js.Dynamic.literal()
      ArtifactList.foreach(__v => __obj.updateDynamic("ArtifactList")(__v.asInstanceOf[js.Any]))
      Success.foreach(__v => __obj.updateDynamic("Success")(__v.asInstanceOf[js.Any]))
      WarningMessage.foreach(__v => __obj.updateDynamic("WarningMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateJobOutput]
    }
  }
}
