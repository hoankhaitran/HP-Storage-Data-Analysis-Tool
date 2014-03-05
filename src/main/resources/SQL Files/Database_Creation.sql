------------------------------------------------------------------
-- Table: "ColumnDefinitions"

-- DROP TABLE "ColumnDefinitions";

CREATE TABLE "ColumnDefinitions"
(
  primary_key integer,
  "ColumnName" character(50),
  "ColumnDBName" character(50),
  "ColumnNumber" integer,
  "ColumnGroupNumber" integer
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "ColumnDefinitions"
  OWNER TO postgres;
------------------------------------------------------------------

------------------------------------------------------------------

-- Table: "Group1Name"

-- DROP TABLE "Group1Name";

CREATE TABLE "Group1Name"
(
  "UUID" character(50)[],
  "InstallDate" time without time zone,
  "HPICSMVersion" character(10)[],
  "DateReported" timestamp without time zone,
  "SupportDataVersion" integer,
  "HPICVersion" character(10)[],
  "primaryKey" integer NOT NULL
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "Group1Name"
  OWNER TO postgres;
------------------------------------------------------------------

------------------------------------------------------------------
-- Table: "Group2Name"

-- DROP TABLE "Group2Name";

CREATE TABLE "Group2Name"
(
  "XPCount" integer,
  "P9000Count" integer,
  "EVACount" integer,
  "P2000Count" integer,
  "P4000Count" integer,
  "MSACount" integer,
  "3PARCount" integer,
  "StoreOnceCount" integer
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "Group2Name"
  OWNER TO postgres;
------------------------------------------------------------------

------------------------------------------------------------------
-- Table: "Group3Name"

-- DROP TABLE "Group3Name";

CREATE TABLE "Group3Name"
(
  "ClusterCount" integer,
  "HostsCount" integer,
  "DatastoresCount" integer,
  "VMsCount" integer,
  "DiskCount" integer,
  "vCenterCount" integer
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "Group3Name"
  OWNER TO postgres;
------------------------------------------------------------------

------------------------------------------------------------------
-- Table: "Group4Name"

-- DROP TABLE "Group4Name";

CREATE TABLE "Group4Name"
(
  "CreateDSCount" integer,
  "CreateDSAvgTime" integer,
  "CreateDSMaxTime" integer,
  "ExpandDSCount" integer,
  "ExpandDSAvgTime" integer,
  "ExpandDSMaxTime" integer,
  "DeleteDSCount" integer,
  "DeleteDSAvgTime" integer,
  "DeleteDSMaxTime" integer,
  "DSMonitorGSCount" integer,
  "DSMonitorDSAvgTime" integer,
  "DSMonitorNewsFeedCount" integer,
  "DSMonitorNewsFeedTime" integer,
  "DSMonitorHealthCount" integer,
  "DSMonitorHealthTime" integer,
  "DSMonitorTasksCount" integer,
  "DSMonitorTasksTime" integer,
  "DSManageGSCount" integer,
  "DSManageGSTime" integer,
  "DSManageOverviewCount" integer,
  "DSManageOverviewTime" integer,
  "DSManageStorageCount" integer,
  "DSManageStorageTime" integer,
  "DSManageSwFwCount" integer,
  "DSManageSwFwTime" integer,
  "DSManageStorageSummaryCount" integer,
  "DSManageStorageSummaryTime" integer,
  "DSManageStorageSVolsCount" integer,
  "DSManageStorageSVolsTime" integer,
  "DSManageStorageVDisksCount" integer,
  "DSManageStorageHBAsCount" integer,
  "DSManageStorageHBAsTime" integer,
  "DSManageStoragePathsCount" integer,
  "DSManageStoragePathsTime" integer,
  "DSManageStorageReplicationsCount" integer,
  "DSManageStorageReplicationsTime" integer,
  "DSManageStorageVM2VolumesCount" integer,
  "DSManageStorageVM2VolumesTime" integer,
  "CreateDSSuccessCount" integer,
  "ExpandDSSuccessCount" integer,
  "DeleteDSSuccessCount" integer,
  "CreateDSFailureCount" integer,
  "ExpandDSFailureCount" integer,
  "DeleteDSFailureCount" integer,
  "DSManageStorageVDisksTime" integer
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "Group4Name"
  OWNER TO postgres;
------------------------------------------------------------------

------------------------------------------------------------------
-- Table: "Group5Name"

-- DROP TABLE "Group5Name";

CREATE TABLE "Group5Name"
(
  "CreateVMCount" integer,
  "CreateVMAvgTime" integer,
  "CreateVMMaxTime" integer,
  "ExpandVMCount" integer,
  "ExpandVMAvgTime" integer,
  "ExpandVMMaxTime" integer,
  "DeleteVMCount" integer,
  "DeleteVMAvgTime" integer,
  "DeleteVMMaxTime" integer,
  "VMMonitorGSCount" integer,
  "VMMonitorVMAvgTime" integer,
  "VMMonitorNewsFeedCount" integer,
  "VMMonitorNewsFeedTime" integer,
  "VMMonitorHealthCount" integer,
  "VMMonitorHealthTime" integer,
  "VMMonitorTasksCount" integer,
  "VMMonitorTasksTime" integer,
  "VMManageGSCount" integer,
  "VMManageGSTime" integer,
  "VMManageOverviewCount" integer,
  "VMManageOverviewTime" integer,
  "VMManageStorageCount" integer,
  "VMManageStorageTime" integer,
  "VMManageSwFwCount" integer,
  "VMManageSwFwTime" integer,
  "VMManageStorageSummaryCount" integer,
  "VMManageStorageSummaryTime" integer,
  "VMManageStorageSVolsCount" integer,
  "VMManageStorageSVolsTime" integer,
  "VMManageStorageVDisksCount" integer,
  "VMManageStorageHBAsCount" integer,
  "VMManageStorageHBAsTime" integer,
  "VMManageStoragePathsCount" integer,
  "VMManageStoragePathsTime" integer,
  "VMManageStorageReplicationsCount" integer,
  "VMManageStorageReplicationsTime" integer,
  "VMManageStorageVM2VolumesCount" integer,
  "VMManageStorageVM2VolumesTime" integer,
  "CreateVMSuccessCount" integer,
  "ExpandVMSuccessCount" integer,
  "DeleteVMSuccessCount" integer,
  "CreateVMFailureCount" integer,
  "ExpandVMFailureCount" integer,
  "DeleteVMFailureCount" integer,
  "VMManageStorageVDisksTime" integer
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "Group5Name"
  OWNER TO postgres;
------------------------------------------------------------------

------------------------------------------------------------------
-- Table: "Group6Name"

-- DROP TABLE "Group6Name";

CREATE TABLE "Group6Name"
(
  "DeleteVolCount" integer,
  "DeleteVolAvgTime" integer,
  "DeleteVolMaxTime" integer,
  "DeleteVolSuccessCount" integer,
  "DeleteVolFailureCount" integer
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "Group6Name"
  OWNER TO postgres;
------------------------------------------------------------------

------------------------------------------------------------------
-- Table: "Group7Name"

-- DROP TABLE "Group7Name";

CREATE TABLE "Group7Name"
(
  "MonitorHeaderCount" integer,
  "MonitorHeaderTime" integer,
  "MonitorFooterCount" integer,
  "MonitorFooterTime" integer
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "Group7Name"
  OWNER TO postgres;
------------------------------------------------------------------

------------------------------------------------------------------
-- Table: "Group8Name"

-- DROP TABLE "Group8Name";

CREATE TABLE "Group8Name"
(
  "HeaderHealthCount" integer,
  "HeaderTasksCount" integer,
  "ActionsCreateDSCount" integer,
  "ActionsCreateVMCount" integer,
  "ActionsCloneVMCount" integer,
  "HeaderProductVersionCount" integer,
  "HeaderHostPropertiesCount" integer,
  "HeaderCommStatusCount" integer,
  "HeaderSAPCount" integer,
  "HeaderVASAURLCount" integer,
  "HeaderReloadPageCount" integer,
  "HeaderRefreshCache" integer
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "Group8Name"
  OWNER TO postgres;
------------------------------------------------------------------

------------------------------------------------------------------
-- Table: "Group9Name"

-- DROP TABLE "Group9Name";

CREATE TABLE "Group9Name"
(
  "HostMonitorGSCount" integer,
  "HostMonitorGSTime" integer,
  "HostMonitorNewesFeedCount" integer,
  "HostMonitorHealthCount" integer,
  "HostMonitorHealthTime" integer,
  "HostMonitorTasksCount" integer,
  "HostMonitorTasksTime" integer
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "Group9Name"
  OWNER TO postgres;
------------------------------------------------------------------

------------------------------------------------------------------
-- Table: "Group10Name"

-- DROP TABLE "Group10Name";

CREATE TABLE "Group10Name"
(
  "ClusterMonitorGSCount" integer,
  "ClusterMonitorGSTime" integer,
  "ClusterMonitorNewesFeedCount" integer,
  "ClusterMonitorHealthCount" integer,
  "ClusterMonitorHealthTime" integer,
  "ClusterMonitorTasksCount" integer,
  "ClusterMonitorTasksTime" integer
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "Group10Name"
  OWNER TO postgres;
------------------------------------------------------------------

------------------------------------------------------------------
-- Table: "Group11Name"

-- DROP TABLE "Group11Name";

CREATE TABLE "Group11Name"
(
  "HostManageGSCount" integer,
  "HostManageGSTime" integer,
  "HostManageOverviewCount" integer,
  "HostManageOverviewTime" integer,
  "HostManageHostCount" integer,
  "HostManageHostTime" integer,
  "HostManageNetworkingCount" integer,
  "HostManageNetworkingTime" integer,
  "HostManageInfrastructureCount" integer,
  "HostManageInfrastructureTime" integer,
  "HostManageFullSummaryCount" integer,
  "HostManageFullSummaryTime" integer,
  "HostManageBriefSummaryCount" integer,
  "HostManageBriefSummaryTime" integer,
  "HostManageStorageCount" integer,
  "HostManageStorageTime" integer,
  "HostManageSwFwCount" integer,
  "HostManageSwFwTime" integer,
  "HostManageStorageSummaryCount" integer,
  "HostManageStorageSummaryTime" integer,
  "HostManageStorageSVolsCount" integer,
  "HostManageStorageSVolsTime" integer,
  "HostManageStorageVDisksCount" integer,
  "HostManageStorageVDisksTime" integer,
  "HostManageStorageHBAsCount" integer,
  "HostManageStorageHBAsTime" integer,
  "HostManageStoragePathsCount" integer,
  "HostManageStoragePathsTime" integer,
  "HostManageStorageReplicationsCount" integer,
  "HostManageStorageReplicationsTime" integer,
  "HostManageStorageVM2VolumesCount" integer,
  "HostManageStorageVM2VolumesTime" integer
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "Group11Name"
  OWNER TO postgres;
------------------------------------------------------------------

------------------------------------------------------------------
-- Table: "Group12Name"

-- DROP TABLE "Group12Name";

CREATE TABLE "Group12Name"
(
  "ClusterManageGSCount" integer,
  "ClusterManageGSTime" integer,
  "ClusterManageOverviewCount" integer,
  "ClusterManageOverviewTime" integer,
  "ClusterManageClusterCount" integer,
  "ClusterManageClusterTime" integer,
  "ClusterManageStorageCount" integer,
  "ClusterManageStorageTime" integer,
  "ClusterManageSwFwCount" integer,
  "ClusterManageSwFwTime" integer,
  "ClusterManageInfrastructureCount" integer,
  "ClusterManageInfrastructureTime" integer,
  "ClusterManageStorageSummaryCount" integer,
  "ClusterManageStorageSummaryTime" integer,
  "ClusterManageStorageSVolsCount" integer,
  "ClusterManageStorageSVolsTime" integer,
  "ClusterManageStorageVDisksCount" integer,
  "ClusterManageStorageVDisksTime" integer,
  "ClusterManageStorageHBAsCount" integer,
  "ClusterManageStorageHBAsTime" integer,
  "ClusterManageStoragePathsCount" integer,
  "ClusterManageStoragePathsTime" integer,
  "ClusterManageStorageReplicationsCount" integer,
  "ClusterManageStorageReplicationsTime" integer,
  "ClusterManageStorageVM2VolumesCount" integer,
  "ClusterManageStorageVM2VolumesTime" integer
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "Group12Name"
  OWNER TO postgres;
------------------------------------------------------------------

------------------------------------------------------------------
-- Table: "Group13Name"

-- DROP TABLE "Group13Name";

CREATE TABLE "Group13Name"
(
  "DAMAllStorageCount" integer,
  "DAMAllStorageTime" integer,
  "DamSystemSummaryCount" integer,
  "DamSystemSummaryTime" integer,
  "DamStorageSummaryCount" integer,
  "DamStorageSummaryTime" integer,
  "DamSystemOverviewCount" integer,
  "DamSystemOverviewTime" integer,
  "DamHealthCount" integer,
  "DamHealthTime" integer,
  "DamLaunchLinksCount" integer,
  "DamLaunchLinksTime" integer
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "Group13Name"
  OWNER TO postgres;
------------------------------------------------------------------

------------------------------------------------------------------
-- Table: "Group14Name"

-- DROP TABLE "Group14Name";

CREATE TABLE "Group14Name"
(
  "vCenterVersions" character(1)[],
  "ESXVersions(unique)" character(1)[],
  "InstalledModule" character(1)[],
  "InitialPopulateTime" integer,
  "VASARegistrationCount" integer,
  "Servers" integer,
  "iLos" integer,
  "OAs" integer,
  "VCMs" integer
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "Group14Name"
  OWNER TO postgres;
------------------------------------------------------------------

