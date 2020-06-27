package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

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
  @Factory
  trait Artifact extends js.Object {
    var Description: js.UndefOr[Description]
    var URL: js.UndefOr[URL]
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
  @Factory
  trait CancelJobInput extends js.Object {
    var JobId: JobId
    var APIVersion: js.UndefOr[APIVersion]
  }

  /**
    * Output structure for the CancelJob operation.
    */
  @js.native
  @Factory
  trait CancelJobOutput extends js.Object {
    var Success: js.UndefOr[Success]
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
  @Factory
  trait CreateJobInput extends js.Object {
    var JobType: JobType
    var Manifest: Manifest
    var ValidateOnly: ValidateOnly
    var APIVersion: js.UndefOr[APIVersion]
    var ManifestAddendum: js.UndefOr[ManifestAddendum]
  }

  /**
    * Output structure for the CreateJob operation.
    */
  @js.native
  @Factory
  trait CreateJobOutput extends js.Object {
    var ArtifactList: js.UndefOr[ArtifactList]
    var JobId: js.UndefOr[JobId]
    var JobType: js.UndefOr[JobType]
    var Signature: js.UndefOr[Signature]
    var SignatureFileContents: js.UndefOr[SignatureFileContents]
    var WarningMessage: js.UndefOr[WarningMessage]
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
  @Factory
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

  @js.native
  @Factory
  trait GetShippingLabelOutput extends js.Object {
    var ShippingLabelURL: js.UndefOr[GenericString]
    var Warning: js.UndefOr[GenericString]
  }

  /**
    * Input structure for the GetStatus operation.
    */
  @js.native
  @Factory
  trait GetStatusInput extends js.Object {
    var JobId: JobId
    var APIVersion: js.UndefOr[APIVersion]
  }

  /**
    * Output structure for the GetStatus operation.
    */
  @js.native
  @Factory
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
  @Factory
  trait Job extends js.Object {
    var CreationDate: js.UndefOr[CreationDate]
    var IsCanceled: js.UndefOr[IsCanceled]
    var JobId: js.UndefOr[JobId]
    var JobType: js.UndefOr[JobType]
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
  @Factory
  trait ListJobsInput extends js.Object {
    var APIVersion: js.UndefOr[APIVersion]
    var Marker: js.UndefOr[Marker]
    var MaxJobs: js.UndefOr[MaxJobs]
  }

  /**
    * Output structure for the ListJobs operation.
    */
  @js.native
  @Factory
  trait ListJobsOutput extends js.Object {
    var IsTruncated: js.UndefOr[IsTruncated]
    var Jobs: js.UndefOr[JobsList]
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
  @Factory
  trait UpdateJobInput extends js.Object {
    var JobId: JobId
    var JobType: JobType
    var Manifest: Manifest
    var ValidateOnly: ValidateOnly
    var APIVersion: js.UndefOr[APIVersion]
  }

  /**
    * Output structure for the UpateJob operation.
    */
  @js.native
  @Factory
  trait UpdateJobOutput extends js.Object {
    var ArtifactList: js.UndefOr[ArtifactList]
    var Success: js.UndefOr[Success]
    var WarningMessage: js.UndefOr[WarningMessage]
  }
}
