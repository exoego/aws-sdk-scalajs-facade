package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
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
  type JobType               = String
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

  implicit final class ImportExportOps(val service: ImportExport) extends AnyVal {

    def cancelJobFuture(params: CancelJobInput): Future[CancelJobOutput] = service.cancelJob(params).promise.toFuture
    def createJobFuture(params: CreateJobInput): Future[CreateJobOutput] = service.createJob(params).promise.toFuture
    def getShippingLabelFuture(params: GetShippingLabelInput): Future[GetShippingLabelOutput] =
      service.getShippingLabel(params).promise.toFuture
    def getStatusFuture(params: GetStatusInput): Future[GetStatusOutput] = service.getStatus(params).promise.toFuture
    def listJobsFuture(params: ListJobsInput): Future[ListJobsOutput]    = service.listJobs(params).promise.toFuture
    def updateJobFuture(params: UpdateJobInput): Future[UpdateJobOutput] = service.updateJob(params).promise.toFuture
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
    def apply(
        Description: js.UndefOr[Description] = js.undefined,
        URL: js.UndefOr[URL] = js.undefined
    ): Artifact = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "URL" -> URL.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Artifact]
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
    def apply(
        JobId: JobId,
        APIVersion: js.UndefOr[APIVersion] = js.undefined
    ): CancelJobInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobId" -> JobId.asInstanceOf[js.Any],
        "APIVersion" -> APIVersion.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelJobInput]
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
    def apply(
        Success: js.UndefOr[Success] = js.undefined
    ): CancelJobOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Success" -> Success.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelJobOutput]
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
    def apply(
        JobType: JobType,
        Manifest: Manifest,
        ValidateOnly: ValidateOnly,
        APIVersion: js.UndefOr[APIVersion] = js.undefined,
        ManifestAddendum: js.UndefOr[ManifestAddendum] = js.undefined
    ): CreateJobInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobType"      -> JobType.asInstanceOf[js.Any],
        "Manifest"     -> Manifest.asInstanceOf[js.Any],
        "ValidateOnly" -> ValidateOnly.asInstanceOf[js.Any],
        "APIVersion" -> APIVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ManifestAddendum" -> ManifestAddendum.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateJobInput]
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
    def apply(
        ArtifactList: js.UndefOr[ArtifactList] = js.undefined,
        JobId: js.UndefOr[JobId] = js.undefined,
        JobType: js.UndefOr[JobType] = js.undefined,
        Signature: js.UndefOr[Signature] = js.undefined,
        SignatureFileContents: js.UndefOr[SignatureFileContents] = js.undefined,
        WarningMessage: js.UndefOr[WarningMessage] = js.undefined
    ): CreateJobOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ArtifactList" -> ArtifactList.map { x =>
          x.asInstanceOf[js.Any]
        },
        "JobId" -> JobId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "JobType" -> JobType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Signature" -> Signature.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SignatureFileContents" -> SignatureFileContents.map { x =>
          x.asInstanceOf[js.Any]
        },
        "WarningMessage" -> WarningMessage.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateJobOutput]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "jobIds" -> jobIds.asInstanceOf[js.Any],
        "APIVersion" -> APIVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "city" -> city.map { x =>
          x.asInstanceOf[js.Any]
        },
        "company" -> company.map { x =>
          x.asInstanceOf[js.Any]
        },
        "country" -> country.map { x =>
          x.asInstanceOf[js.Any]
        },
        "name" -> name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "phoneNumber" -> phoneNumber.map { x =>
          x.asInstanceOf[js.Any]
        },
        "postalCode" -> postalCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "stateOrProvince" -> stateOrProvince.map { x =>
          x.asInstanceOf[js.Any]
        },
        "street1" -> street1.map { x =>
          x.asInstanceOf[js.Any]
        },
        "street2" -> street2.map { x =>
          x.asInstanceOf[js.Any]
        },
        "street3" -> street3.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetShippingLabelInput]
    }
  }

  @js.native
  trait GetShippingLabelOutput extends js.Object {
    var ShippingLabelURL: js.UndefOr[GenericString]
    var Warning: js.UndefOr[GenericString]
  }

  object GetShippingLabelOutput {
    def apply(
        ShippingLabelURL: js.UndefOr[GenericString] = js.undefined,
        Warning: js.UndefOr[GenericString] = js.undefined
    ): GetShippingLabelOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ShippingLabelURL" -> ShippingLabelURL.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Warning" -> Warning.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetShippingLabelOutput]
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
    def apply(
        JobId: JobId,
        APIVersion: js.UndefOr[APIVersion] = js.undefined
    ): GetStatusInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobId" -> JobId.asInstanceOf[js.Any],
        "APIVersion" -> APIVersion.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetStatusInput]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "ArtifactList" -> ArtifactList.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Carrier" -> Carrier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationDate" -> CreationDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CurrentManifest" -> CurrentManifest.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ErrorCount" -> ErrorCount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "JobId" -> JobId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "JobType" -> JobType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LocationCode" -> LocationCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LocationMessage" -> LocationMessage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LogBucket" -> LogBucket.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LogKey" -> LogKey.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ProgressCode" -> ProgressCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ProgressMessage" -> ProgressMessage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Signature" -> Signature.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SignatureFileContents" -> SignatureFileContents.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TrackingNumber" -> TrackingNumber.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetStatusOutput]
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
    def apply(
        CreationDate: js.UndefOr[CreationDate] = js.undefined,
        IsCanceled: js.UndefOr[IsCanceled] = js.undefined,
        JobId: js.UndefOr[JobId] = js.undefined,
        JobType: js.UndefOr[JobType] = js.undefined
    ): Job = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationDate" -> CreationDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IsCanceled" -> IsCanceled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "JobId" -> JobId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "JobType" -> JobType.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Job]
    }
  }

  /**
    * Specifies whether the job to initiate is an import or export job.
    */
  object JobTypeEnum {
    val Import = "Import"
    val Export = "Export"

    val values = IndexedSeq(Import, Export)
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
    def apply(
        APIVersion: js.UndefOr[APIVersion] = js.undefined,
        Marker: js.UndefOr[Marker] = js.undefined,
        MaxJobs: js.UndefOr[MaxJobs] = js.undefined
    ): ListJobsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "APIVersion" -> APIVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Marker" -> Marker.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxJobs" -> MaxJobs.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListJobsInput]
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
    def apply(
        IsTruncated: js.UndefOr[IsTruncated] = js.undefined,
        Jobs: js.UndefOr[JobsList] = js.undefined
    ): ListJobsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IsTruncated" -> IsTruncated.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Jobs" -> Jobs.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListJobsOutput]
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
    def apply(
        JobId: JobId,
        JobType: JobType,
        Manifest: Manifest,
        ValidateOnly: ValidateOnly,
        APIVersion: js.UndefOr[APIVersion] = js.undefined
    ): UpdateJobInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "JobId"        -> JobId.asInstanceOf[js.Any],
        "JobType"      -> JobType.asInstanceOf[js.Any],
        "Manifest"     -> Manifest.asInstanceOf[js.Any],
        "ValidateOnly" -> ValidateOnly.asInstanceOf[js.Any],
        "APIVersion" -> APIVersion.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateJobInput]
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
    def apply(
        ArtifactList: js.UndefOr[ArtifactList] = js.undefined,
        Success: js.UndefOr[Success] = js.undefined,
        WarningMessage: js.UndefOr[WarningMessage] = js.undefined
    ): UpdateJobOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ArtifactList" -> ArtifactList.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Success" -> Success.map { x =>
          x.asInstanceOf[js.Any]
        },
        "WarningMessage" -> WarningMessage.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateJobOutput]
    }
  }
}
