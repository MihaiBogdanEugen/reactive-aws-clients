package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import com.github.j5ik2o.reactive.aws.utils.ToOptionSupport

trait ToAllOps
    extends ToOptionSupport
    with ToAccountGateResultOps
    with ToAccountLimitOps
    with ToAutoDeploymentOps
    with ToCancelUpdateStackRequestOps
    with ToChangeOps
    with ToChangeSetSummaryOps
    with ToContinueUpdateRollbackRequestOps
    with ToCreateChangeSetRequestOps
    with ToCreateChangeSetResponseOps
    with ToCreateStackInstancesRequestOps
    with ToCreateStackInstancesResponseOps
    with ToCreateStackRequestOps
    with ToCreateStackResponseOps
    with ToCreateStackSetRequestOps
    with ToCreateStackSetResponseOps
    with ToDeleteChangeSetRequestOps
    with ToDeleteStackInstancesRequestOps
    with ToDeleteStackInstancesResponseOps
    with ToDeleteStackRequestOps
    with ToDeleteStackSetRequestOps
    with ToDeploymentTargetsOps
    with ToDeregisterTypeRequestOps
    with ToDescribeAccountLimitsRequestOps
    with ToDescribeAccountLimitsResponseOps
    with ToDescribeChangeSetRequestOps
    with ToDescribeChangeSetResponseOps
    with ToDescribeStackDriftDetectionStatusRequestOps
    with ToDescribeStackDriftDetectionStatusResponseOps
    with ToDescribeStackEventsRequestOps
    with ToDescribeStackEventsResponseOps
    with ToDescribeStackInstanceRequestOps
    with ToDescribeStackInstanceResponseOps
    with ToDescribeStackResourceDriftsRequestOps
    with ToDescribeStackResourceDriftsResponseOps
    with ToDescribeStackResourceRequestOps
    with ToDescribeStackResourceResponseOps
    with ToDescribeStackResourcesRequestOps
    with ToDescribeStackResourcesResponseOps
    with ToDescribeStackSetOperationRequestOps
    with ToDescribeStackSetOperationResponseOps
    with ToDescribeStackSetRequestOps
    with ToDescribeStackSetResponseOps
    with ToDescribeStacksRequestOps
    with ToDescribeStacksResponseOps
    with ToDescribeTypeRegistrationRequestOps
    with ToDescribeTypeRegistrationResponseOps
    with ToDescribeTypeRequestOps
    with ToDescribeTypeResponseOps
    with ToDetectStackDriftRequestOps
    with ToDetectStackDriftResponseOps
    with ToDetectStackResourceDriftRequestOps
    with ToDetectStackResourceDriftResponseOps
    with ToDetectStackSetDriftRequestOps
    with ToDetectStackSetDriftResponseOps
    with ToEstimateTemplateCostRequestOps
    with ToEstimateTemplateCostResponseOps
    with ToExecuteChangeSetRequestOps
    with ToExportOps
    with ToGetStackPolicyRequestOps
    with ToGetStackPolicyResponseOps
    with ToGetTemplateRequestOps
    with ToGetTemplateResponseOps
    with ToGetTemplateSummaryRequestOps
    with ToGetTemplateSummaryResponseOps
    with ToListChangeSetsRequestOps
    with ToListChangeSetsResponseOps
    with ToListExportsRequestOps
    with ToListExportsResponseOps
    with ToListImportsRequestOps
    with ToListImportsResponseOps
    with ToListStackInstancesRequestOps
    with ToListStackInstancesResponseOps
    with ToListStackResourcesRequestOps
    with ToListStackResourcesResponseOps
    with ToListStackSetOperationResultsRequestOps
    with ToListStackSetOperationResultsResponseOps
    with ToListStackSetOperationsRequestOps
    with ToListStackSetOperationsResponseOps
    with ToListStackSetsRequestOps
    with ToListStackSetsResponseOps
    with ToListStacksRequestOps
    with ToListStacksResponseOps
    with ToListTypeRegistrationsRequestOps
    with ToListTypeRegistrationsResponseOps
    with ToListTypeVersionsRequestOps
    with ToListTypeVersionsResponseOps
    with ToListTypesRequestOps
    with ToListTypesResponseOps
    with ToLoggingConfigOps
    with ToOutputOps
    with ToParameterConstraintsOps
    with ToParameterDeclarationOps
    with ToParameterOps
    with ToPhysicalResourceIdContextKeyValuePairOps
    with ToPropertyDifferenceOps
    with ToRecordHandlerProgressRequestOps
    with ToRegisterTypeRequestOps
    with ToRegisterTypeResponseOps
    with ToResourceChangeDetailOps
    with ToResourceChangeOps
    with ToResourceIdentifierSummaryOps
    with ToResourceTargetDefinitionOps
    with ToResourceToImportOps
    with ToRollbackConfigurationOps
    with ToRollbackTriggerOps
    with ToSetStackPolicyRequestOps
    with ToSetTypeDefaultVersionRequestOps
    with ToSignalResourceRequestOps
    with ToStackDriftInformationOps
    with ToStackDriftInformationSummaryOps
    with ToStackEventOps
    with ToStackInstanceOps
    with ToStackInstanceSummaryOps
    with ToStackOps
    with ToStackResourceDetailOps
    with ToStackResourceDriftInformationOps
    with ToStackResourceDriftInformationSummaryOps
    with ToStackResourceDriftOps
    with ToStackResourceOps
    with ToStackResourceSummaryOps
    with ToStackSetDriftDetectionDetailsOps
    with ToStackSetOperationOps
    with ToStackSetOperationPreferencesOps
    with ToStackSetOperationResultSummaryOps
    with ToStackSetOperationSummaryOps
    with ToStackSetOps
    with ToStackSetSummaryOps
    with ToStackSummaryOps
    with ToStopStackSetOperationRequestOps
    with ToTagOps
    with ToTemplateParameterOps
    with ToTypeSummaryOps
    with ToTypeVersionSummaryOps
    with ToUpdateStackInstancesRequestOps
    with ToUpdateStackInstancesResponseOps
    with ToUpdateStackRequestOps
    with ToUpdateStackResponseOps
    with ToUpdateStackSetRequestOps
    with ToUpdateStackSetResponseOps
    with ToUpdateTerminationProtectionRequestOps
    with ToUpdateTerminationProtectionResponseOps
    with ToValidateTemplateRequestOps
    with ToValidateTemplateResponseOps
