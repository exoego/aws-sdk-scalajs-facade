package facade.amazonaws.services

import scalajs._
import facade.amazonaws._

package object importexport {
  type APIVersion = String
  type ArtifactList = js.Array[Artifact]
  type Carrier = String
  type CreationDate = js.Date
  type CurrentManifest = String
  type Description = String
  type ErrorCount = Integer
  type ErrorMessage = String
  type GenericString = String
  type IsCanceled = Boolean
  type IsTruncated = Boolean
  type JobId = String
  type JobIdList = js.Array[GenericString]
  type JobType = String
  type JobsList = js.Array[Job]
  type LocationCode = String
  type LocationMessage = String
  type LogBucket = String
  type LogKey = String
  type Manifest = String
  type ManifestAddendum = String
  type Marker = String
  type MaxJobs = Integer
  type ProgressCode = String
  type ProgressMessage = String
  type Signature = String
  type SignatureFileContents = String
  type Success = Boolean
  type TrackingNumber = String
  type URL = String
  type ValidateOnly = Boolean
  type WarningMessage = String
}

package importexport {
  @js.native
  trait Importexport extends js.Object {
    def cancelJob(params: CancelJobInput, callback: Callback[CancelJobOutput]): Unit = js.native
    def cancelJob(params: CancelJobInput): Request[CancelJobOutput] = js.native
    def createJob(params: CreateJobInput, callback: Callback[CreateJobOutput]): Unit = js.native
    def createJob(params: CreateJobInput): Request[CreateJobOutput] = js.native
    def getShippingLabel(params: GetShippingLabelInput, callback: Callback[GetShippingLabelOutput]): Unit = js.native
    def getShippingLabel(params: GetShippingLabelInput): Request[GetShippingLabelOutput] = js.native
    def getStatus(params: GetStatusInput, callback: Callback[GetStatusOutput]): Unit = js.native
    def getStatus(params: GetStatusInput): Request[GetStatusOutput] = js.native
    def listJobs(params: ListJobsInput, callback: Callback[ListJobsOutput]): Unit = js.native
    def listJobs(params: ListJobsInput): Request[ListJobsOutput] = js.native
    def updateJob(params: UpdateJobInput, callback: Callback[UpdateJobOutput]): Unit = js.native
    def updateJob(params: UpdateJobInput): Request[UpdateJobOutput] = js.native
  }

  /**
   * A discrete item that contains the description and URL of an artifact (such as a PDF).
   */
  @js.native
  trait Artifact extends js.Object {
    var Description: Description
    var URL: URL
  }

  object Artifact {
    def apply(
      Description: js.UndefOr[Description] = js.undefined,
      URL: js.UndefOr[URL] = js.undefined
    ): Artifact = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Description" -> Description.map { x => x: js.Any }),
        ("URL" -> URL.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Artifact]
    }
  }

  /**
   * The account specified does not have the appropriate bucket permissions.
   */
  @js.native
  trait BucketPermissionExceptionException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * Input structure for the CancelJob operation.
   */
  @js.native
  trait CancelJobInput extends js.Object {
    var JobId: JobId
    var APIVersion: APIVersion
  }

  object CancelJobInput {
    def apply(
      JobId: js.UndefOr[JobId] = js.undefined,
      APIVersion: js.UndefOr[APIVersion] = js.undefined
    ): CancelJobInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("JobId" -> JobId.map { x => x: js.Any }),
        ("APIVersion" -> APIVersion.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelJobInput]
    }
  }

  /**
   * Output structure for the CancelJob operation.
   */
  @js.native
  trait CancelJobOutput extends js.Object {
    var Success: Success
  }

  object CancelJobOutput {
    def apply(
      Success: js.UndefOr[Success] = js.undefined
    ): CancelJobOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Success" -> Success.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelJobOutput]
    }
  }

  /**
   * The specified job ID has been canceled and is no longer valid.
   */
  @js.native
  trait CanceledJobIdExceptionException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * Input structure for the CreateJob operation.
   */
  @js.native
  trait CreateJobInput extends js.Object {
    var ValidateOnly: ValidateOnly
    var APIVersion: APIVersion
    var Manifest: Manifest
    var JobType: JobType
    var ManifestAddendum: ManifestAddendum
  }

  object CreateJobInput {
    def apply(
      ValidateOnly: js.UndefOr[ValidateOnly] = js.undefined,
      APIVersion: js.UndefOr[APIVersion] = js.undefined,
      Manifest: js.UndefOr[Manifest] = js.undefined,
      JobType: js.UndefOr[JobType] = js.undefined,
      ManifestAddendum: js.UndefOr[ManifestAddendum] = js.undefined
    ): CreateJobInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ValidateOnly" -> ValidateOnly.map { x => x: js.Any }),
        ("APIVersion" -> APIVersion.map { x => x: js.Any }),
        ("Manifest" -> Manifest.map { x => x: js.Any }),
        ("JobType" -> JobType.map { x => x: js.Any }),
        ("ManifestAddendum" -> ManifestAddendum.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateJobInput]
    }
  }

  /**
   * Output structure for the CreateJob operation.
   */
  @js.native
  trait CreateJobOutput extends js.Object {
    var JobId: JobId
    var SignatureFileContents: SignatureFileContents
    var Signature: Signature
    var WarningMessage: WarningMessage
    var ArtifactList: ArtifactList
    var JobType: JobType
  }

  object CreateJobOutput {
    def apply(
      JobId: js.UndefOr[JobId] = js.undefined,
      SignatureFileContents: js.UndefOr[SignatureFileContents] = js.undefined,
      Signature: js.UndefOr[Signature] = js.undefined,
      WarningMessage: js.UndefOr[WarningMessage] = js.undefined,
      ArtifactList: js.UndefOr[ArtifactList] = js.undefined,
      JobType: js.UndefOr[JobType] = js.undefined
    ): CreateJobOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("JobId" -> JobId.map { x => x: js.Any }),
        ("SignatureFileContents" -> SignatureFileContents.map { x => x: js.Any }),
        ("Signature" -> Signature.map { x => x: js.Any }),
        ("WarningMessage" -> WarningMessage.map { x => x: js.Any }),
        ("ArtifactList" -> ArtifactList.map { x => x: js.Any }),
        ("JobType" -> JobType.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateJobOutput]
    }
  }

  /**
   * Each account can create only a certain number of jobs per day. If you need to create more than this, please contact awsimportexport@amazon.com to explain your particular use case.
   */
  @js.native
  trait CreateJobQuotaExceededExceptionException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * Indicates that the specified job has expired out of the system.
   */
  @js.native
  trait ExpiredJobIdExceptionException extends js.Object {
    var message: ErrorMessage
  }

  @js.native
  trait GetShippingLabelInput extends js.Object {
    var city: GenericString
    var name: GenericString
    var phoneNumber: GenericString
    var street1: GenericString
    var country: GenericString
    var postalCode: GenericString
    var street2: GenericString
    var company: GenericString
    var APIVersion: GenericString
    var stateOrProvince: GenericString
    var street3: GenericString
    var jobIds: JobIdList
  }

  object GetShippingLabelInput {
    def apply(
      city: js.UndefOr[GenericString] = js.undefined,
      name: js.UndefOr[GenericString] = js.undefined,
      phoneNumber: js.UndefOr[GenericString] = js.undefined,
      street1: js.UndefOr[GenericString] = js.undefined,
      country: js.UndefOr[GenericString] = js.undefined,
      postalCode: js.UndefOr[GenericString] = js.undefined,
      street2: js.UndefOr[GenericString] = js.undefined,
      company: js.UndefOr[GenericString] = js.undefined,
      APIVersion: js.UndefOr[GenericString] = js.undefined,
      stateOrProvince: js.UndefOr[GenericString] = js.undefined,
      street3: js.UndefOr[GenericString] = js.undefined,
      jobIds: js.UndefOr[JobIdList] = js.undefined
    ): GetShippingLabelInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("city" -> city.map { x => x: js.Any }),
        ("name" -> name.map { x => x: js.Any }),
        ("phoneNumber" -> phoneNumber.map { x => x: js.Any }),
        ("street1" -> street1.map { x => x: js.Any }),
        ("country" -> country.map { x => x: js.Any }),
        ("postalCode" -> postalCode.map { x => x: js.Any }),
        ("street2" -> street2.map { x => x: js.Any }),
        ("company" -> company.map { x => x: js.Any }),
        ("APIVersion" -> APIVersion.map { x => x: js.Any }),
        ("stateOrProvince" -> stateOrProvince.map { x => x: js.Any }),
        ("street3" -> street3.map { x => x: js.Any }),
        ("jobIds" -> jobIds.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetShippingLabelInput]
    }
  }

  @js.native
  trait GetShippingLabelOutput extends js.Object {
    var ShippingLabelURL: GenericString
    var Warning: GenericString
  }

  object GetShippingLabelOutput {
    def apply(
      ShippingLabelURL: js.UndefOr[GenericString] = js.undefined,
      Warning: js.UndefOr[GenericString] = js.undefined
    ): GetShippingLabelOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ShippingLabelURL" -> ShippingLabelURL.map { x => x: js.Any }),
        ("Warning" -> Warning.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetShippingLabelOutput]
    }
  }

  /**
   * Input structure for the GetStatus operation.
   */
  @js.native
  trait GetStatusInput extends js.Object {
    var JobId: JobId
    var APIVersion: APIVersion
  }

  object GetStatusInput {
    def apply(
      JobId: js.UndefOr[JobId] = js.undefined,
      APIVersion: js.UndefOr[APIVersion] = js.undefined
    ): GetStatusInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("JobId" -> JobId.map { x => x: js.Any }),
        ("APIVersion" -> APIVersion.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetStatusInput]
    }
  }

  /**
   * Output structure for the GetStatus operation.
   */
  @js.native
  trait GetStatusOutput extends js.Object {
    var CreationDate: CreationDate
    var LocationCode: LocationCode
    var LogBucket: LogBucket
    var ProgressMessage: ProgressMessage
    var ErrorCount: ErrorCount
    var TrackingNumber: TrackingNumber
    var JobId: JobId
    var CurrentManifest: CurrentManifest
    var ProgressCode: ProgressCode
    var LocationMessage: LocationMessage
    var SignatureFileContents: Signature
    var Signature: Signature
    var ArtifactList: ArtifactList
    var JobType: JobType
    var Carrier: Carrier
    var LogKey: LogKey
  }

  object GetStatusOutput {
    def apply(
      CreationDate: js.UndefOr[CreationDate] = js.undefined,
      LocationCode: js.UndefOr[LocationCode] = js.undefined,
      LogBucket: js.UndefOr[LogBucket] = js.undefined,
      ProgressMessage: js.UndefOr[ProgressMessage] = js.undefined,
      ErrorCount: js.UndefOr[ErrorCount] = js.undefined,
      TrackingNumber: js.UndefOr[TrackingNumber] = js.undefined,
      JobId: js.UndefOr[JobId] = js.undefined,
      CurrentManifest: js.UndefOr[CurrentManifest] = js.undefined,
      ProgressCode: js.UndefOr[ProgressCode] = js.undefined,
      LocationMessage: js.UndefOr[LocationMessage] = js.undefined,
      SignatureFileContents: js.UndefOr[Signature] = js.undefined,
      Signature: js.UndefOr[Signature] = js.undefined,
      ArtifactList: js.UndefOr[ArtifactList] = js.undefined,
      JobType: js.UndefOr[JobType] = js.undefined,
      Carrier: js.UndefOr[Carrier] = js.undefined,
      LogKey: js.UndefOr[LogKey] = js.undefined
    ): GetStatusOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CreationDate" -> CreationDate.map { x => x: js.Any }),
        ("LocationCode" -> LocationCode.map { x => x: js.Any }),
        ("LogBucket" -> LogBucket.map { x => x: js.Any }),
        ("ProgressMessage" -> ProgressMessage.map { x => x: js.Any }),
        ("ErrorCount" -> ErrorCount.map { x => x: js.Any }),
        ("TrackingNumber" -> TrackingNumber.map { x => x: js.Any }),
        ("JobId" -> JobId.map { x => x: js.Any }),
        ("CurrentManifest" -> CurrentManifest.map { x => x: js.Any }),
        ("ProgressCode" -> ProgressCode.map { x => x: js.Any }),
        ("LocationMessage" -> LocationMessage.map { x => x: js.Any }),
        ("SignatureFileContents" -> SignatureFileContents.map { x => x: js.Any }),
        ("Signature" -> Signature.map { x => x: js.Any }),
        ("ArtifactList" -> ArtifactList.map { x => x: js.Any }),
        ("JobType" -> JobType.map { x => x: js.Any }),
        ("Carrier" -> Carrier.map { x => x: js.Any }),
        ("LogKey" -> LogKey.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetStatusOutput]
    }
  }

  /**
   * The AWS Access Key ID specified in the request did not match the manifest's accessKeyId value. The manifest and the request authentication must use the same AWS Access Key ID.
   */
  @js.native
  trait InvalidAccessKeyIdExceptionException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * The address specified in the manifest is invalid.
   */
  @js.native
  trait InvalidAddressExceptionException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * One or more customs parameters was invalid. Please correct and resubmit.
   */
  @js.native
  trait InvalidCustomsExceptionException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * File system specified in export manifest is invalid.
   */
  @js.native
  trait InvalidFileSystemExceptionException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * The JOBID was missing, not found, or not associated with the AWS account.
   */
  @js.native
  trait InvalidJobIdExceptionException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * One or more manifest fields was invalid. Please correct and resubmit.
   */
  @js.native
  trait InvalidManifestFieldExceptionException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * One or more parameters had an invalid value.
   */
  @js.native
  trait InvalidParameterExceptionException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * The client tool version is invalid.
   */
  @js.native
  trait InvalidVersionExceptionException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * Representation of a job returned by the ListJobs operation.
   */
  @js.native
  trait Job extends js.Object {
    var JobId: JobId
    var CreationDate: CreationDate
    var IsCanceled: IsCanceled
    var JobType: JobType
  }

  object Job {
    def apply(
      JobId: js.UndefOr[JobId] = js.undefined,
      CreationDate: js.UndefOr[CreationDate] = js.undefined,
      IsCanceled: js.UndefOr[IsCanceled] = js.undefined,
      JobType: js.UndefOr[JobType] = js.undefined
    ): Job = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("JobId" -> JobId.map { x => x: js.Any }),
        ("CreationDate" -> CreationDate.map { x => x: js.Any }),
        ("IsCanceled" -> IsCanceled.map { x => x: js.Any }),
        ("JobType" -> JobType.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    var MaxJobs: MaxJobs
    var Marker: Marker
    var APIVersion: APIVersion
  }

  object ListJobsInput {
    def apply(
      MaxJobs: js.UndefOr[MaxJobs] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined,
      APIVersion: js.UndefOr[APIVersion] = js.undefined
    ): ListJobsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("MaxJobs" -> MaxJobs.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("APIVersion" -> APIVersion.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListJobsInput]
    }
  }

  /**
   * Output structure for the ListJobs operation.
   */
  @js.native
  trait ListJobsOutput extends js.Object {
    var Jobs: JobsList
    var IsTruncated: IsTruncated
  }

  object ListJobsOutput {
    def apply(
      Jobs: js.UndefOr[JobsList] = js.undefined,
      IsTruncated: js.UndefOr[IsTruncated] = js.undefined
    ): ListJobsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Jobs" -> Jobs.map { x => x: js.Any }),
        ("IsTruncated" -> IsTruncated.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListJobsOutput]
    }
  }

  /**
   * Your manifest is not well-formed.
   */
  @js.native
  trait MalformedManifestExceptionException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * One or more required customs parameters was missing from the manifest.
   */
  @js.native
  trait MissingCustomsExceptionException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * One or more required fields were missing from the manifest file. Please correct and resubmit.
   */
  @js.native
  trait MissingManifestFieldExceptionException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * One or more required parameters was missing from the request.
   */
  @js.native
  trait MissingParameterExceptionException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * Your manifest file contained buckets from multiple regions. A job is restricted to buckets from one region. Please correct and resubmit.
   */
  @js.native
  trait MultipleRegionsExceptionException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * The specified bucket does not exist. Create the specified bucket or change the manifest's bucket, exportBucket, or logBucket field to a bucket that the account, as specified by the manifest's Access Key ID, has write permissions to.
   */
  @js.native
  trait NoSuchBucketExceptionException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * AWS Import/Export cannot cancel the job
   */
  @js.native
  trait UnableToCancelJobIdExceptionException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * AWS Import/Export cannot update the job
   */
  @js.native
  trait UnableToUpdateJobIdExceptionException extends js.Object {
    var message: ErrorMessage
  }

  /**
   * Input structure for the UpateJob operation.
   */
  @js.native
  trait UpdateJobInput extends js.Object {
    var ValidateOnly: ValidateOnly
    var JobId: JobId
    var APIVersion: APIVersion
    var Manifest: Manifest
    var JobType: JobType
  }

  object UpdateJobInput {
    def apply(
      ValidateOnly: js.UndefOr[ValidateOnly] = js.undefined,
      JobId: js.UndefOr[JobId] = js.undefined,
      APIVersion: js.UndefOr[APIVersion] = js.undefined,
      Manifest: js.UndefOr[Manifest] = js.undefined,
      JobType: js.UndefOr[JobType] = js.undefined
    ): UpdateJobInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ValidateOnly" -> ValidateOnly.map { x => x: js.Any }),
        ("JobId" -> JobId.map { x => x: js.Any }),
        ("APIVersion" -> APIVersion.map { x => x: js.Any }),
        ("Manifest" -> Manifest.map { x => x: js.Any }),
        ("JobType" -> JobType.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateJobInput]
    }
  }

  /**
   * Output structure for the UpateJob operation.
   */
  @js.native
  trait UpdateJobOutput extends js.Object {
    var Success: Success
    var WarningMessage: WarningMessage
    var ArtifactList: ArtifactList
  }

  object UpdateJobOutput {
    def apply(
      Success: js.UndefOr[Success] = js.undefined,
      WarningMessage: js.UndefOr[WarningMessage] = js.undefined,
      ArtifactList: js.UndefOr[ArtifactList] = js.undefined
    ): UpdateJobOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Success" -> Success.map { x => x: js.Any }),
        ("WarningMessage" -> WarningMessage.map { x => x: js.Any }),
        ("ArtifactList" -> ArtifactList.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateJobOutput]
    }
  }
}
