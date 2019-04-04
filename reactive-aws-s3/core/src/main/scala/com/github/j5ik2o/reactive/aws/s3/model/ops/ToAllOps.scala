package com.github.j5ik2o.reactive.aws.s3.model.ops

trait ToAllOps
    extends ToAbortIncompleteMultipartUploadOps
    with ToAbortMultipartUploadRequestOps
    with ToAbortMultipartUploadResponseOps
    with ToAccelerateConfigurationOps
    with ToAccessControlPolicyOps
    with ToAccessControlTranslationOps
    with ToAnalyticsAndOperatorOps
    with ToAnalyticsConfigurationOps
    with ToAnalyticsExportDestinationOps
    with ToAnalyticsFilterOps
    with ToAnalyticsS3BucketDestinationOps
    with ToBucketLifecycleConfigurationOps
    with ToBucketLoggingStatusOps
    with ToBucketOps
    with ToCORSConfigurationOps
    with ToCORSRuleOps
    with ToCSVInputOps
    with ToCSVOutputOps
    with ToCommonPrefixOps
    with ToCompleteMultipartUploadRequestOps
    with ToCompleteMultipartUploadResponseOps
    with ToCompletedMultipartUploadOps
    with ToCompletedPartOps
    with ToConditionOps
    with ToCopyObjectRequestOps
    with ToCopyObjectResponseOps
    with ToCopyObjectResultOps
    with ToCopyPartResultOps
    with ToCreateBucketConfigurationOps
    with ToCreateBucketRequestOps
    with ToCreateBucketResponseOps
    with ToCreateMultipartUploadRequestOps
    with ToCreateMultipartUploadResponseOps
    with ToDefaultRetentionOps
    with ToDeleteBucketAnalyticsConfigurationRequestOps
    with ToDeleteBucketAnalyticsConfigurationResponseOps
    with ToDeleteBucketCorsRequestOps
    with ToDeleteBucketCorsResponseOps
    with ToDeleteBucketEncryptionRequestOps
    with ToDeleteBucketEncryptionResponseOps
    with ToDeleteBucketInventoryConfigurationRequestOps
    with ToDeleteBucketInventoryConfigurationResponseOps
    with ToDeleteBucketLifecycleRequestOps
    with ToDeleteBucketLifecycleResponseOps
    with ToDeleteBucketMetricsConfigurationRequestOps
    with ToDeleteBucketMetricsConfigurationResponseOps
    with ToDeleteBucketPolicyRequestOps
    with ToDeleteBucketPolicyResponseOps
    with ToDeleteBucketReplicationRequestOps
    with ToDeleteBucketReplicationResponseOps
    with ToDeleteBucketRequestOps
    with ToDeleteBucketResponseOps
    with ToDeleteBucketTaggingRequestOps
    with ToDeleteBucketTaggingResponseOps
    with ToDeleteBucketWebsiteRequestOps
    with ToDeleteBucketWebsiteResponseOps
    with ToDeleteMarkerEntryOps
    with ToDeleteMarkerReplicationOps
    with ToDeleteObjectRequestOps
    with ToDeleteObjectResponseOps
    with ToDeleteObjectTaggingRequestOps
    with ToDeleteObjectTaggingResponseOps
    with ToDeleteObjectsRequestOps
    with ToDeleteObjectsResponseOps
    with ToDeleteOps
    with ToDeletePublicAccessBlockRequestOps
    with ToDeletePublicAccessBlockResponseOps
    with ToDeletedObjectOps
    with ToDestinationOps
    with ToEncryptionConfigurationOps
    with ToEncryptionOps
    with ToErrorDocumentOps
    with ToFilterRuleOps
    with ToGetBucketAccelerateConfigurationRequestOps
    with ToGetBucketAccelerateConfigurationResponseOps
    with ToGetBucketAclRequestOps
    with ToGetBucketAclResponseOps
    with ToGetBucketAnalyticsConfigurationRequestOps
    with ToGetBucketAnalyticsConfigurationResponseOps
    with ToGetBucketCorsRequestOps
    with ToGetBucketCorsResponseOps
    with ToGetBucketEncryptionRequestOps
    with ToGetBucketEncryptionResponseOps
    with ToGetBucketInventoryConfigurationRequestOps
    with ToGetBucketInventoryConfigurationResponseOps
    with ToGetBucketLifecycleConfigurationRequestOps
    with ToGetBucketLifecycleConfigurationResponseOps
    with ToGetBucketLocationRequestOps
    with ToGetBucketLocationResponseOps
    with ToGetBucketLoggingRequestOps
    with ToGetBucketLoggingResponseOps
    with ToGetBucketMetricsConfigurationRequestOps
    with ToGetBucketMetricsConfigurationResponseOps
    with ToGetBucketNotificationConfigurationRequestOps
    with ToGetBucketNotificationConfigurationResponseOps
    with ToGetBucketPolicyRequestOps
    with ToGetBucketPolicyResponseOps
    with ToGetBucketPolicyStatusRequestOps
    with ToGetBucketPolicyStatusResponseOps
    with ToGetBucketReplicationRequestOps
    with ToGetBucketReplicationResponseOps
    with ToGetBucketRequestPaymentRequestOps
    with ToGetBucketRequestPaymentResponseOps
    with ToGetBucketTaggingRequestOps
    with ToGetBucketTaggingResponseOps
    with ToGetBucketVersioningRequestOps
    with ToGetBucketVersioningResponseOps
    with ToGetBucketWebsiteRequestOps
    with ToGetBucketWebsiteResponseOps
    with ToGetObjectAclRequestOps
    with ToGetObjectAclResponseOps
    with ToGetObjectLegalHoldRequestOps
    with ToGetObjectLegalHoldResponseOps
    with ToGetObjectLockConfigurationRequestOps
    with ToGetObjectLockConfigurationResponseOps
    with ToGetObjectRequestOps
    with ToGetObjectResponseOps
    with ToGetObjectRetentionRequestOps
    with ToGetObjectRetentionResponseOps
    with ToGetObjectTaggingRequestOps
    with ToGetObjectTaggingResponseOps
    with ToGetObjectTorrentRequestOps
    with ToGetObjectTorrentResponseOps
    with ToGetPublicAccessBlockRequestOps
    with ToGetPublicAccessBlockResponseOps
    with ToGlacierJobParametersOps
    with ToGrantOps
    with ToGranteeOps
    with ToHeadBucketRequestOps
    with ToHeadBucketResponseOps
    with ToHeadObjectRequestOps
    with ToHeadObjectResponseOps
    with ToIndexDocumentOps
    with ToInitiatorOps
    with ToInputSerializationOps
    with ToInventoryConfigurationOps
    with ToInventoryDestinationOps
    with ToInventoryEncryptionOps
    with ToInventoryFilterOps
    with ToInventoryS3BucketDestinationOps
    with ToInventoryScheduleOps
    with ToJSONInputOps
    with ToJSONOutputOps
    with ToLambdaFunctionConfigurationOps
    with ToLifecycleExpirationOps
    with ToLifecycleRuleAndOperatorOps
    with ToLifecycleRuleFilterOps
    with ToLifecycleRuleOps
    with ToListBucketAnalyticsConfigurationsRequestOps
    with ToListBucketAnalyticsConfigurationsResponseOps
    with ToListBucketInventoryConfigurationsRequestOps
    with ToListBucketInventoryConfigurationsResponseOps
    with ToListBucketMetricsConfigurationsRequestOps
    with ToListBucketMetricsConfigurationsResponseOps
    with ToListBucketsRequestOps
    with ToListBucketsResponseOps
    with ToListMultipartUploadsRequestOps
    with ToListMultipartUploadsResponseOps
    with ToListObjectVersionsRequestOps
    with ToListObjectVersionsResponseOps
    with ToListObjectsRequestOps
    with ToListObjectsResponseOps
    with ToListObjectsV2RequestOps
    with ToListObjectsV2ResponseOps
    with ToListPartsRequestOps
    with ToListPartsResponseOps
    with ToLoggingEnabledOps
    with ToMetadataEntryOps
    with ToMetricsAndOperatorOps
    with ToMetricsConfigurationOps
    with ToMetricsFilterOps
    with ToMultipartUploadOps
    with ToNoncurrentVersionExpirationOps
    with ToNoncurrentVersionTransitionOps
    with ToNotificationConfigurationFilterOps
    with ToNotificationConfigurationOps
    with ToObjectIdentifierOps
    with ToObjectLockConfigurationOps
    with ToObjectLockLegalHoldOps
    with ToObjectLockRetentionOps
    with ToObjectLockRuleOps
    with ToObjectVersionOps
    with ToOutputLocationOps
    with ToOutputSerializationOps
    with ToOwnerOps
    with ToParquetInputOps
    with ToPartOps
    with ToPolicyStatusOps
    with ToPublicAccessBlockConfigurationOps
    with ToPutBucketAccelerateConfigurationRequestOps
    with ToPutBucketAccelerateConfigurationResponseOps
    with ToPutBucketAclRequestOps
    with ToPutBucketAclResponseOps
    with ToPutBucketAnalyticsConfigurationRequestOps
    with ToPutBucketAnalyticsConfigurationResponseOps
    with ToPutBucketCorsRequestOps
    with ToPutBucketCorsResponseOps
    with ToPutBucketEncryptionRequestOps
    with ToPutBucketEncryptionResponseOps
    with ToPutBucketInventoryConfigurationRequestOps
    with ToPutBucketInventoryConfigurationResponseOps
    with ToPutBucketLifecycleConfigurationRequestOps
    with ToPutBucketLifecycleConfigurationResponseOps
    with ToPutBucketLoggingRequestOps
    with ToPutBucketLoggingResponseOps
    with ToPutBucketMetricsConfigurationRequestOps
    with ToPutBucketMetricsConfigurationResponseOps
    with ToPutBucketNotificationConfigurationRequestOps
    with ToPutBucketNotificationConfigurationResponseOps
    with ToPutBucketPolicyRequestOps
    with ToPutBucketPolicyResponseOps
    with ToPutBucketReplicationRequestOps
    with ToPutBucketReplicationResponseOps
    with ToPutBucketRequestPaymentRequestOps
    with ToPutBucketRequestPaymentResponseOps
    with ToPutBucketTaggingRequestOps
    with ToPutBucketTaggingResponseOps
    with ToPutBucketVersioningRequestOps
    with ToPutBucketVersioningResponseOps
    with ToPutBucketWebsiteRequestOps
    with ToPutBucketWebsiteResponseOps
    with ToPutObjectAclRequestOps
    with ToPutObjectAclResponseOps
    with ToPutObjectLegalHoldRequestOps
    with ToPutObjectLegalHoldResponseOps
    with ToPutObjectLockConfigurationRequestOps
    with ToPutObjectLockConfigurationResponseOps
    with ToPutObjectRequestOps
    with ToPutObjectResponseOps
    with ToPutObjectRetentionRequestOps
    with ToPutObjectRetentionResponseOps
    with ToPutObjectTaggingRequestOps
    with ToPutObjectTaggingResponseOps
    with ToPutPublicAccessBlockRequestOps
    with ToPutPublicAccessBlockResponseOps
    with ToQueueConfigurationOps
    with ToRedirectAllRequestsToOps
    with ToRedirectOps
    with ToReplicationConfigurationOps
    with ToReplicationRuleAndOperatorOps
    with ToReplicationRuleFilterOps
    with ToReplicationRuleOps
    with ToRequestPaymentConfigurationOps
    with ToRestoreObjectRequestOps
    with ToRestoreObjectResponseOps
    with ToRestoreRequestOps
    with ToRoutingRuleOps
    with ToS3ErrorOps
    with ToS3KeyFilterOps
    with ToS3LocationOps
    with ToS3ObjectOps
    with ToSSEKMSOps
    with ToSSES3Ops
    with ToSelectParametersOps
    with ToServerSideEncryptionByDefaultOps
    with ToServerSideEncryptionConfigurationOps
    with ToServerSideEncryptionRuleOps
    with ToSourceSelectionCriteriaOps
    with ToSseKmsEncryptedObjectsOps
    with ToStorageClassAnalysisDataExportOps
    with ToStorageClassAnalysisOps
    with ToTagOps
    with ToTaggingOps
    with ToTargetGrantOps
    with ToTopicConfigurationOps
    with ToTransitionOps
    with ToUploadPartCopyRequestOps
    with ToUploadPartCopyResponseOps
    with ToUploadPartRequestOps
    with ToUploadPartResponseOps
    with ToVersioningConfigurationOps
    with ToWebsiteConfigurationOps