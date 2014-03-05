package edu.csus.csc191.models;

public class DynamicCsv 
{
	private String SupportDataVersion = "a_column"; //// 1
	private String UUID = "b_column"; //// 2
	private String DateReported = "c_column"; //// 3
	private String HPICSMInstallDate = "d_column"; //// 4
	private String HPICSMVersion = "e_column"; //// 5
	private String HPICVersion = "f_column"; //// 6
	private String XPCount = "g_column"; //// 7
	private String P9000Count = "h_column"; //// 8
	private String EVACount = "i_column"; //// 9
	private String P2000Count = "j_column"; //// 10
	private String P4000Count = "k_column"; //// 11
	private String MSACount = "l_column"; //// 12
	private String ClusterCount = "m_column"; //// 13
	private String HostsCount = "n_column"; //// 14
	private String DatastoresCount = "o_column"; //// 15
	private String VMsCount = "p_column"; //// 16
	private String DiskCount = "q_column"; //// 17
	private String ThreePARCount = "r_column"; //// 18
	private String HPICSMBuild = "s_column"; //// 19
	private String VCenterCount = "t_column"; //// 20
	private String VCenterVersions = "u_column"; //// 21
	private String ESXVersionsUnique = "v_column"; //// 22
	private String InstalledModule = "w_column"; //// 23
	private String StoreOnceCount = "x_column"; //// 24
	private String InitialPopulateTime = "y_column"; //// 25
	private String AverageRefreshTime = "z_column"; //// 26
	private String CreateDSCount = "aa_column"; //// 27
	private String CreateDSAvgTime = "ab_column"; //// 28
	private String CreateDSMaxTime = "ac_column"; //// 29
	private String CreateVMCount = "ad_column"; //// 30
	private String CreateVMAvgTime = "ae_column"; //// 31
	private String CreateVMMaxTime = "af_column"; //// 32
	private String CloneVMCount = "ag_column"; //// 33
	private String CloneVMAvgTime = "ah_column"; //// 34
	private String CloneVMMaxTime = "ai_column"; //// 35
	private String ExpandDSCount = "aj_column"; //// 36
	private String ExpandDSAvgTime = "ak_column"; //// 37
	private String ExpandDSMaxTime = "al_column"; //// 38
	private String DeleteDSCount = "am_column"; //// 39
	private String DeleteDSAvgTime = "an_column"; //// 40
	private String DeleteDSMaxTime = "ao_column"; //// 41
	private String DeleteVolCount = "ap_column"; //// 42
	private String DeleteVolAvgTime = "aq_column"; //// 43
	private String DeleteVolMaxTime = "ar_column"; //// 44
	private String DeleteVMCount = "as_column"; //// 45
	private String DeleteVMAvgTime = "at_column"; //// 46
	private String DeleteVMMaxTime = "au_column"; //// 47
	private String MonitorHeaderCount = "av_column"; //// 48
	private String MonitorHeaderTime = "aw_column"; //// 49
	private String MonitorFooterCount = "ax_column"; //// 50
	private String MonitorFooterTime = "ay_column"; //// 51
	private String HeaderHealthCount = "az_column"; //// 52
	private String HeaderTasksCount = "ba_column"; //// 53
	private String ActionsCreateDSCount = "bb_column"; //// 54
	private String ActionsCreateVMCount = "bc_column"; //// 55
	private String ActionsCloneVMCount = "bd_column"; //// 56
	private String HeaderProductVersionCount = "be_column"; //// 57
	private String HeaderHostPropertiesCount = "bf_column"; //// 58
	private String HeaderCommStatusCount = "bg_column"; //// 59
	private String HeaderSAPCount = "bh_column"; //// 60
	private String HeaderVASAURLCount = "bi_column"; //// 61
	private String HeaderReloadPageCount = "bj_column"; //// 62
	private String HeaderRefreshCache = "bk_column"; //// 63
	private String HostMonitorGSCount = "bl_column"; //// 64
	private String HostMonitorGSTime = "bm_column"; //// 65
	private String HostMonitorNewsFeedCount = "bn_column"; //// 66
	private String HostMonitorNewsFeedTime = "bo_column"; //// 67
	private String HostMonitorHealthCount = "bp_column"; //// 68
	private String HostMonitorHealthTime = "bq_column"; //// 69
	private String HostMonitorTasksCount = "br_column"; //// 70
	private String HostMonitorTasksTime = "bs_column"; //// 71
	private String VMMonitorGSCount = "bt_column"; //// 72
	private String VMMonitorGSTime = "bu_column"; //// 73
	private String VMMonitorNewsFeedCount = "bv_column"; //// 74
	private String VMMonitorNewsFeedTime = "bw_column"; //// 75
	private String VMMonitorHealthCount = "bx_column"; //// 76
	private String VMMonitorHealthTime = "by_column"; //// 77
	private String VMMonitorTasksCount = "bz_column"; //// 78
	private String VMMonitorTasksTime = "ca_column"; //// 79
	private String DSMonitorGSCount = "cb_column"; //// 80
	private String DSMonitorGSTime = "cc_column"; //// 81
	private String DSMonitorNewsFeedCount = "cd_column"; //// 82
	private String DSMonitorNewsFeedTime = "ce_column"; //// 83
	private String DSMonitorHealthCount = "cf_column"; //// 84
	private String DSMonitorHealthTime = "cg_column"; //// 85
	private String DSMonitorTasksCount = "ch_column"; //// 86
	private String DSMonitorTasksTime = "ci_column"; //// 87
	private String ClusterMonitorGSCount = "cj_column"; //// 88
	private String ClusterMonitorGSTime = "ck_column"; //// 89
	private String ClusterMonitorNewsFeedCount = "cl_column"; //// 90
	private String ClusterMonitorNewsFeedTime = "cm_column"; //// 91
	private String ClusterMonitorHealthCount = "cn_column"; //// 92
	private String ClusterMonitorHealthTime = "co_column"; //// 93
	private String ClusterMonitorTasksCount = "cp_column"; //// 94
	private String ClusterMonitorTasksTime = "cq_column"; //// 95
	private String HostManageGSCount = "cr_column"; //// 96
	private String HostManageGSTime = "cs_column"; //// 97
	private String HostManageOverviewCount = "ct_column"; //// 98
	private String HostManageOverviewTime = "cu_column"; //// 99
	private String HostManageHostCount = "cv_column"; //// 100
	private String HostManageHostTime = "cw_column"; //// 101
	private String HostManageNetworkingCount = "cx_column"; //// 102
	private String HostManageNetworkingTime = "cy_column"; //// 103
	private String HostManageInfrastructureCount = "cz_column"; //// 104
	private String HostManageInfrastructureTime = "da_column"; //// 105
	private String HostManageFullSummaryCount = "db_column"; //// 106
	private String HostManageFullSummaryTime = "dc_column"; //// 107
	private String HostManageBriefSummaryCount = "dd_column"; //// 108
	private String HostManageBriefSummaryTime = "de_column"; //// 109
	private String HostManageStorageCount = "df_column"; //// 110
	private String HostManageStorageTime = "dg_column"; //// 111
	private String HostManageSwFwCount = "dh_column"; //// 112
	private String HostManageSwFwTime = "di_column"; //// 113
	private String HostManageStorageSummaryCount = "dj_column"; //// 114
	private String HostManageStorageSummaryTime = "dk_column"; //// 115
	private String HostManageStorageSVolsCount = "dl_column"; //// 116
	private String HostManageStorageSVolsTime = "dm_column"; //// 117
	private String HostManageStorageVDisksCount = "dn_column"; //// 118
	private String HostManageStorageVDisksTime = "do_column"; //// 119
	private String HostManageStorageHBAsCount = "dp_column"; //// 120
	private String HostManageStorageHBAsTime = "dq_column"; //// 121
	private String HostManageStoragePathsCount = "dr_column"; //// 122
	private String HostManageStoragePathsTime = "ds_column"; //// 123
	private String HostManageStorageReplicationsCount = "dt_column"; //// 124
	private String HostManageStorageReplicationsTime = "du_column"; //// 125
	private String HostManageStorageVM2VolumesCount = "dv_column"; //// 126
	private String HostManageStorageVM2VolumesTime = "dw_column"; //// 127
	private String VMManageGSCount = "dx_column"; //// 128
	private String VMManageGSTime = "dy_column"; //// 129
	private String VMManageOverviewCount = "dz_column"; //// 130
	private String VMManageOverviewTime = "ea_column"; //// 131
	private String VMManageStorageCount = "eb_column"; //// 132
	private String VMManageStorageTime = "ec_column"; //// 133
	private String VMManageSwFwCount = "ed_column"; //// 134
	private String VMManageSwFwTime = "ee_column"; //// 135
	private String VMManageStorageSummaryCount = "ef_column"; //// 136
	private String VMManageStorageSummaryTime = "eg_column"; //// 137
	private String VMManageStorageSVolsCount = "eh_column"; //// 138
	private String VMManageStorageSVolsTime = "ei_column"; //// 139
	private String VMManageStorageVDisksCount = "ej_column"; //// 140
	private String VMManageStorageVDisksTime = "ek_column"; //// 141
	private String VMManageStorageHBAsCount = "el_column"; //// 142
	private String VMManageStorageHBAsTime = "em_column"; //// 143
	private String VMManageStoragePathsCount = "en_column"; //// 144
	private String VMManageStoragePathsTime = "eo_column"; //// 145
	private String VMManageStorageReplicationsCount = "ep_column"; //// 146
	private String VMManageStorageReplicationsTime = "eq_column"; //// 147
	private String VMManageStorageVM2VolumesCount = "er_column"; //// 148
	private String VMManageStorageVM2VolumesTime = "es_column"; //// 149
	private String DSManageGSCount = "et_column"; //// 150
	private String DSManageGSTime = "eu_column"; //// 151
	private String DSManageOverviewCount = "ev_column"; //// 152
	private String DSManageOverviewTime = "ew_column"; //// 153
	private String DSManageStorageCount = "ex_column"; //// 154
	private String DSManageStorageTime = "ey_column"; //// 155
	private String DSManageSwFwCount = "ez_column"; //// 156
	private String DSManageSwFwTime = "fa_column"; //// 157
	private String DSManageStorageSummaryCount = "fb_column"; //// 158
	private String DSManageStorageSummaryTime = "fc_column"; //// 159
	private String DSManageStorageSVolsCount = "fd_column"; //// 160
	private String DSManageStorageSVolsTime = "fe_column"; //// 161
	private String DSManageStorageVDisksCount = "ff_column"; //// 162
	private String DSManageStorageVDisksTime = "fg_column"; //// 163
	private String DSManageStorageHBAsCount = "fh_column"; //// 164
	private String DSManageStorageHBAsTime = "fi_column"; //// 165
	private String DSManageStoragePathsCount = "fj_column"; //// 166
	private String DSManageStoragePathsTime = "fk_column"; //// 167
	private String DSManageStorageReplicationsCount = "fl_column"; //// 168
	private String DSManageStorageReplicationsTime = "fm_column"; //// 169
	private String DSManageStorageVM2VolumesCount = "fn_column"; //// 170
	private String DSManageStorageVM2VolumesTime = "fo_column"; //// 171
	private String ClusterManageGSCount = "fp_column"; //// 172
	private String ClusterManageGSTime = "fq_column"; //// 173
	private String ClusterManageOverviewCount = "fr_column"; //// 174
	private String ClusterManageOverviewTime = "fs_column"; //// 175
	private String ClusterManageClusterCount = "ft_column"; //// 176
	private String ClusterManageClusterTime = "fu_column"; //// 177
	private String ClusterManageStorageCount = "fv_column"; //// 178
	private String ClusterManageStorageTime = "fw_column"; //// 179
	private String ClusterManageSwFwCount = "fx_column"; //// 180
	private String ClusterManageSwFwTime = "fy_column"; //// 181
	private String ClusterManageInfrastructureCount = "fz_column"; //// 182
	private String ClusterManageInfrastructureTime = "ga_column"; //// 183
	private String ClusterManageStorageSummaryCount = "gb_column"; //// 184
	private String ClusterManageStorageSummaryTime = "gc_column"; //// 185
	private String ClusterManageStorageSVolsCount = "gd_column"; //// 186
	private String ClusterManageStorageSVolsTime = "ge_column"; //// 187
	private String ClusterManageStorageVDisksCount = "gf_column"; //// 188
	private String ClusterManageStorageVDisksTime = "gg_column"; //// 189
	private String ClusterManageStorageHBAsCount = "gh_column"; //// 190
	private String ClusterManageStorageHBAsTime = "gi_column"; //// 191
	private String ClusterManageStoragePathsCount = "gj_column"; //// 192
	private String ClusterManageStoragePathsTime = "gk_column"; //// 193
	private String ClusterManageStorageReplicationsCount = "gl_column"; //// 194
	private String ClusterManageStorageReplicationsTime = "gm_column"; //// 195
	private String ClusterManageStorageVM2VolumesCount = "gn_column"; //// 196
	private String ClusterManageStorageVM2VolumesTime = "go_column"; //// 197
	private String CreateDSSuccessCount = "gp_column"; //// 198
	private String CreateVMSuccessCount = "gq_column"; //// 199
	private String CloneVMSuccessCount = "gr_column"; //// 200
	private String ExpandDSSuccessCount = "gs_column"; //// 201
	private String DeleteDSSuccessCount = "gt_column"; //// 202
	private String DeleteVolSuccessCount = "gu_column"; //// 203
	private String DeleteVmSuccessCount = "gv_column"; //// 204
	private String CreateDSFailureCount = "gw_column"; //// 205
	private String CreateVMFailureCount = "gx_column"; //// 206
	private String CloneVMFailureCount = "gy_column"; //// 207
	private String ExpandDSFailureCount = "gz_column"; //// 208
	private String DeleteDSFailureCount = "ha_column"; //// 209
	private String DeleteVolFailureCount = "hb_column"; //// 210
	private String DeleteVmFailureCount = "hc_column"; //// 211
	private String VASARegistrationCount = "hd_column"; //// 212
	private String DAMAllStorageCount = "he_column"; //// 213
	private String DAMAllStorageTime = "hf_column"; //// 214
	private String DAMSystemSummaryCount = "hg_column"; //// 215
	private String DAMSystemSummaryTime = "hh_column"; //// 216
	private String DAMStorageSummaryCount = "hi_column"; //// 217
	private String DAMStorageSummaryTime = "hj_column"; //// 218
	private String DAMSystemOverviewCount = "hk_column"; //// 219
	private String DAMSystemOverviewTime = "hl_column"; //// 220
	private String DAMHealthCount = "hm_column"; //// 221
	private String DAMHealthTime = "hn_column"; //// 222
	private String DAMLaunchLinksCount = "ho_column"; //// 223
	private String DAMLaunchLinksTime = "hp_column"; //// 224
	private String Servers = "hq_column"; //// 225
	private String ILos = "hr_column"; //// 226
	private String OAs = "hs_column"; //// 227
	private String VCMs = "ht_column"; //// 228
	private String Id = "id";


	// 0
	public String getSupportDataVersion() {
		return SupportDataVersion;
	}

	public void setSupportDataVersion(String tSupportDataVersion) {
		this.SupportDataVersion = tSupportDataVersion;
	}

	// 1
	public String getUUID() {
		return UUID;
	}

	public void setUUID(String tUUID) {
		this.UUID = tUUID;
	}

	// 2
	public String getDateReported() {
		return DateReported;
	}

	public void setDateReported(String tDateReported) {
		this.DateReported = tDateReported;
	}

	// 3
	public String getHPICSMInstallDate() {
		return HPICSMInstallDate;
	}

	public void setHPICSMInstallDate(String tHPICSMInstallDate) {
		this.HPICSMInstallDate = tHPICSMInstallDate;
	}

	// 4
	public String getHPICSMVersion() {
		return HPICSMVersion;
	}

	public void setHPICSMVersion(String tHPICSMVersion) {
		this.HPICSMVersion = tHPICSMVersion;
	}

	// 5
	public String getHPICVersion() {
		return HPICVersion;
	}

	public void setHPICVersion(String tHPICVersion) {
		this.HPICVersion = tHPICVersion;
	}

	// 6
	public String getXPCount() {
		return XPCount;
	}

	public void setXPCount(String tXPCount) {
		this.XPCount = tXPCount;
	}

	// 7
	public String getP9000Count() {
		return P9000Count;
	}

	public void setP9000Count(String tP9000Count) {
		this.P9000Count = tP9000Count;
	}

	// 8
	public String getEVACount() {
		return EVACount;
	}

	public void setEVACount(String tEVACount) {
		this.EVACount = tEVACount;
	}

	// 9
	public String getP2000Count() {
		return P2000Count;
	}

	public void setP2000Count(String tP2000Count) {
		this.P2000Count = tP2000Count;
	}

	// 10
	public String getP4000Count() {
		return P4000Count;
	}

	public void setP4000Count(String tP4000Count) {
		this.P4000Count = tP4000Count;
	}

	// 11
	public String getMSACount() {
		return MSACount;
	}

	public void setMSACount(String tMSACount) {
		this.MSACount = tMSACount;
	}

	// 12
	public String getClusterCount() {
		return ClusterCount;
	}

	public void setClusterCount(String tClusterCount) {
		this.ClusterCount = tClusterCount;
	}

	// 13
	public String getHostsCount() {
		return HostsCount;
	}

	public void setHostsCount(String tHostsCount) {
		this.HostsCount = tHostsCount;
	}

	// 14
	public String getDatastoresCount() {
		return DatastoresCount;
	}

	public void setDatastoresCount(String tDatastoresCount) {
		this.DatastoresCount = tDatastoresCount;
	}

	// 15
	public String getVMsCount() {
		return VMsCount;
	}

	public void setVMsCount(String tVMsCount) {
		this.VMsCount = tVMsCount;
	}

	// 16
	public String getDiskCount() {
		return DiskCount;
	}

	public void setDiskCount(String tDiskCount) {
		this.DiskCount = tDiskCount;
	}

	// 17
	public String getThreePARCount() {
		return ThreePARCount;
	}

	public void setThreePARCount(String t3PARCount) {
		this.ThreePARCount = t3PARCount;
	}

	// 18
	public String getHPICSMBuild() {
		return HPICSMBuild;
	}

	public void setHPICSMBuild(String tHPICSMBuild) {
		this.HPICSMBuild = tHPICSMBuild;
	}

	// 19
	public String getVCenterCount() {
		return VCenterCount;
	}

	public void setVCenterCount(String tVCenterCount) {
		this.VCenterCount = tVCenterCount;
	}

	// 20
	public String getVCenterVersions() {
		return VCenterVersions;
	}

	public void setVCenterVersions(String tVCenterVersions) {
		this.VCenterVersions = tVCenterVersions;
	}

	// 21
	public String getESXVersionsUnique() {
		return ESXVersionsUnique;
	}

	public void setESXVersionsUnique(String tESXVersionsUnique) {
		this.ESXVersionsUnique = tESXVersionsUnique;
	}

	// 22
	public String getInstalledModule() {
		return InstalledModule;
	}

	public void setInstalledModule(String tInstalledModule) {
		this.InstalledModule = tInstalledModule;
	}

	// 23
	public String getStoreOnceCount() {
		return StoreOnceCount;
	}

	public void setStoreOnceCount(String tStoreOnceCount) {
		this.StoreOnceCount = tStoreOnceCount;
	}

	// 24
	public String getInitialPopulateTime() {
		return InitialPopulateTime;
	}

	public void setInitialPopulateTime(String tInitialPopulateTime) {
		this.InitialPopulateTime = tInitialPopulateTime;
	}

	// 25
	public String getAverageRefreshTime() {
		return AverageRefreshTime;
	}

	public void setAverageRefreshTime(String tAverageRefreshTime) {
		this.AverageRefreshTime = tAverageRefreshTime;
	}

	// 26
	public String getCreateDSCount() {
		return CreateDSCount;
	}

	public void setCreateDSCount(String tCreateDSCount) {
		this.CreateDSCount = tCreateDSCount;
	}

	// 27
	public String getCreateDSAvgTime() {
		return CreateDSAvgTime;
	}

	public void setCreateDSAvgTime(String tCreateDSAvgTime) {
		this.CreateDSAvgTime = tCreateDSAvgTime;
	}

	// 28
	public String getCreateDSMaxTime() {
		return CreateDSMaxTime;
	}

	public void setCreateDSMaxTime(String tCreateDSMaxTime) {
		this.CreateDSMaxTime = tCreateDSMaxTime;
	}

	// 29
	public String getCreateVMCount() {
		return CreateVMCount;
	}

	public void setCreateVMCount(String tCreateVMCount) {
		this.CreateVMCount = tCreateVMCount;
	}

	// 30
	public String getCreateVMAvgTime() {
		return CreateVMAvgTime;
	}

	public void setCreateVMAvgTime(String tCreateVMAvgTime) {
		this.CreateVMAvgTime = tCreateVMAvgTime;
	}

	// 31
	public String getCreateVMMaxTime() {
		return CreateVMMaxTime;
	}

	public void setCreateVMMaxTime(String tCreateVMMaxTime) {
		this.CreateVMMaxTime = tCreateVMMaxTime;
	}

	// 32
	public String getCloneVMCount() {
		return CloneVMCount;
	}

	public void setCloneVMCount(String tCloneVMCount) {
		this.CloneVMCount = tCloneVMCount;
	}

	// 33
	public String getCloneVMAvgTime() {
		return CloneVMAvgTime;
	}

	public void setCloneVMAvgTime(String tCloneVMAvgTime) {
		this.CloneVMAvgTime = tCloneVMAvgTime;
	}

	// 34
	public String getCloneVMMaxTime() {
		return CloneVMMaxTime;
	}

	public void setCloneVMMaxTime(String tCloneVMMaxTime) {
		this.CloneVMMaxTime = tCloneVMMaxTime;
	}

	// 35
	public String getExpandDSCount() {
		return ExpandDSCount;
	}

	public void setExpandDSCount(String tExpandDSCount) {
		this.ExpandDSCount = tExpandDSCount;
	}

	// 36
	public String getExpandDSAvgTime() {
		return ExpandDSAvgTime;
	}

	public void setExpandDSAvgTime(String tExpandDSAvgTime) {
		this.ExpandDSAvgTime = tExpandDSAvgTime;
	}

	// 37
	public String getExpandDSMaxTime() {
		return ExpandDSMaxTime;
	}

	public void setExpandDSMaxTime(String tExpandDSMaxTime) {
		this.ExpandDSMaxTime = tExpandDSMaxTime;
	}

	// 38
	public String getDeleteDSCount() {
		return DeleteDSCount;
	}

	public void setDeleteDSCount(String tDeleteDSCount) {
		this.DeleteDSCount = tDeleteDSCount;
	}

	// 39
	public String getDeleteDSAvgTime() {
		return DeleteDSAvgTime;
	}

	public void setDeleteDSAvgTime(String tDeleteDSAvgTime) {
		this.DeleteDSAvgTime = tDeleteDSAvgTime;
	}

	// 40
	public String getDeleteDSMaxTime() {
		return DeleteDSMaxTime;
	}

	public void setDeleteDSMaxTime(String tDeleteDSMaxTime) {
		this.DeleteDSMaxTime = tDeleteDSMaxTime;
	}

	// 41
	public String getDeleteVolCount() {
		return DeleteVolCount;
	}

	public void setDeleteVolCount(String tDeleteVolCount) {
		this.DeleteVolCount = tDeleteVolCount;
	}

	// 42
	public String getDeleteVolAvgTime() {
		return DeleteVolAvgTime;
	}

	public void setDeleteVolAvgTime(String tDeleteVolAvgTime) {
		this.DeleteVolAvgTime = tDeleteVolAvgTime;
	}

	// 43
	public String getDeleteVolMaxTime() {
		return DeleteVolMaxTime;
	}

	public void setDeleteVolMaxTime(String tDeleteVolMaxTime) {
		this.DeleteVolMaxTime = tDeleteVolMaxTime;
	}

	// 44
	public String getDeleteVMCount() {
		return DeleteVMCount;
	}

	public void setDeleteVMCount(String tDeleteVMCount) {
		this.DeleteVMCount = tDeleteVMCount;
	}

	// 45
	public String getDeleteVMAvgTime() {
		return DeleteVMAvgTime;
	}

	public void setDeleteVMAvgTime(String tDeleteVMAvgTime) {
		this.DeleteVMAvgTime = tDeleteVMAvgTime;
	}

	// 46
	public String getDeleteVMMaxTime() {
		return DeleteVMMaxTime;
	}

	public void setDeleteVMMaxTime(String tDeleteVMMaxTime) {
		this.DeleteVMMaxTime = tDeleteVMMaxTime;
	}

	// 47
	public String getMonitorHeaderCount() {
		return MonitorHeaderCount;
	}

	public void setMonitorHeaderCount(String tMonitorHeaderCount) {
		this.MonitorHeaderCount = tMonitorHeaderCount;
	}

	// 48
	public String getMonitorHeaderTime() {
		return MonitorHeaderTime;
	}

	public void setMonitorHeaderTime(String tMonitorHeaderTime) {
		this.MonitorHeaderTime = tMonitorHeaderTime;
	}

	// 49
	public String getMonitorFooterCount() {
		return MonitorFooterCount;
	}

	public void setMonitorFooterCount(String tMonitorFooterCount) {
		this.MonitorFooterCount = tMonitorFooterCount;
	}

	// 50
	public String getMonitorFooterTime() {
		return MonitorFooterTime;
	}

	public void setMonitorFooterTime(String tMonitorFooterTime) {
		this.MonitorFooterTime = tMonitorFooterTime;
	}

	// 51
	public String getHeaderHealthCount() {
		return HeaderHealthCount;
	}

	public void setHeaderHealthCount(String tHeaderHealthCount) {
		this.HeaderHealthCount = tHeaderHealthCount;
	}

	// 52
	public String getHeaderTasksCount() {
		return HeaderTasksCount;
	}

	public void setHeaderTasksCount(String tHeaderTasksCount) {
		this.HeaderTasksCount = tHeaderTasksCount;
	}

	// 53
	public String getActionsCreateDSCount() {
		return ActionsCreateDSCount;
	}

	public void setActionsCreateDSCount(String tActionsCreateDSCount) {
		this.ActionsCreateDSCount = tActionsCreateDSCount;
	}

	// 54
	public String getActionsCreateVMCount() {
		return ActionsCreateVMCount;
	}

	public void setActionsCreateVMCount(String tActionsCreateVMCount) {
		this.ActionsCreateVMCount = tActionsCreateVMCount;
	}

	// 55
	public String getActionsCloneVMCount() {
		return ActionsCloneVMCount;
	}

	public void setActionsCloneVMCount(String tActionsCloneVMCount) {
		this.ActionsCloneVMCount = tActionsCloneVMCount;
	}

	// 56
	public String getHeaderProductVersionCount() {
		return HeaderProductVersionCount;
	}

	public void setHeaderProductVersionCount(String tHeaderProductVersionCount) {
		this.HeaderProductVersionCount = tHeaderProductVersionCount;
	}

	// 57
	public String getHeaderHostPropertiesCount() {
		return HeaderHostPropertiesCount;
	}

	public void setHeaderHostPropertiesCount(String tHeaderHostPropertiesCount) {
		this.HeaderHostPropertiesCount = tHeaderHostPropertiesCount;
	}

	// 58
	public String getHeaderCommStatusCount() {
		return HeaderCommStatusCount;
	}

	public void setHeaderCommStatusCount(String tHeaderCommStatusCount) {
		this.HeaderCommStatusCount = tHeaderCommStatusCount;
	}

	// 59
	public String getHeaderSAPCount() {
		return HeaderSAPCount;
	}

	public void setHeaderSAPCount(String tHeaderSAPCount) {
		this.HeaderSAPCount = tHeaderSAPCount;
	}

	// 60
	public String getHeaderVASAURLCount() {
		return HeaderVASAURLCount;
	}

	public void setHeaderVASAURLCount(String tHeaderVASAURLCount) {
		this.HeaderVASAURLCount = tHeaderVASAURLCount;
	}

	// 61
	public String getHeaderReloadPageCount() {
		return HeaderReloadPageCount;
	}

	public void setHeaderReloadPageCount(String tHeaderReloadPageCount) {
		this.HeaderReloadPageCount = tHeaderReloadPageCount;
	}

	// 62
	public String getHeaderRefreshCache() {
		return HeaderRefreshCache;
	}

	public void setHeaderRefreshCache(String tHeaderRefreshCache) {
		this.HeaderRefreshCache = tHeaderRefreshCache;
	}

	// 63
	public String getHostMonitorGSCount() {
		return HostMonitorGSCount;
	}

	public void setHostMonitorGSCount(String tHostMonitorGSCount) {
		this.HostMonitorGSCount = tHostMonitorGSCount;
	}

	// 64
	public String getHostMonitorGSTime() {
		return HostMonitorGSTime;
	}

	public void setHostMonitorGSTime(String tHostMonitorGSTime) {
		this.HostMonitorGSTime = tHostMonitorGSTime;
	}

	// 65
	public String getHostMonitorNewsFeedCount() {
		return HostMonitorNewsFeedCount;
	}

	public void setHostMonitorNewsFeedCount(String tHostMonitorNewsFeedCount) {
		this.HostMonitorNewsFeedCount = tHostMonitorNewsFeedCount;
	}

	// 66
	public String getHostMonitorNewsFeedTime() {
		return HostMonitorNewsFeedTime;
	}

	public void setHostMonitorNewsFeedTime(String tHostMonitorNewsFeedTime) {
		this.HostMonitorNewsFeedTime = tHostMonitorNewsFeedTime;
	}

	// 67
	public String getHostMonitorHealthCount() {
		return HostMonitorHealthCount;
	}

	public void setHostMonitorHealthCount(String tHostMonitorHealthCount) {
		this.HostMonitorHealthCount = tHostMonitorHealthCount;
	}

	// 68
	public String getHostMonitorHealthTime() {
		return HostMonitorHealthTime;
	}

	public void setHostMonitorHealthTime(String tHostMonitorHealthTime) {
		this.HostMonitorHealthTime = tHostMonitorHealthTime;
	}

	// 69
	public String getHostMonitorTasksCount() {
		return HostMonitorTasksCount;
	}

	public void setHostMonitorTasksCount(String tHostMonitorTasksCount) {
		this.HostMonitorTasksCount = tHostMonitorTasksCount;
	}

	// 70
	public String getHostMonitorTasksTime() {
		return HostMonitorTasksTime;
	}

	public void setHostMonitorTasksTime(String tHostMonitorTasksTime) {
		this.HostMonitorTasksTime = tHostMonitorTasksTime;
	}

	// 71
	public String getVMMonitorGSCount() {
		return VMMonitorGSCount;
	}

	public void setVMMonitorGSCount(String tVMMonitorGSCount) {
		this.VMMonitorGSCount = tVMMonitorGSCount;
	}

	// 72
	public String getVMMonitorGSTime() {
		return VMMonitorGSTime;
	}

	public void setVMMonitorGSTime(String tVMMonitorGSTime) {
		this.VMMonitorGSTime = tVMMonitorGSTime;
	}

	// 73
	public String getVMMonitorNewsFeedCount() {
		return VMMonitorNewsFeedCount;
	}

	public void setVMMonitorNewsFeedCount(String tVMMonitorNewsFeedCount) {
		this.VMMonitorNewsFeedCount = tVMMonitorNewsFeedCount;
	}

	// 74
	public String getVMMonitorNewsFeedTime() {
		return VMMonitorNewsFeedTime;
	}

	public void setVMMonitorNewsFeedTime(String tVMMonitorNewsFeedTime) {
		this.VMMonitorNewsFeedTime = tVMMonitorNewsFeedTime;
	}

	// 75
	public String getVMMonitorHealthCount() {
		return VMMonitorHealthCount;
	}

	public void setVMMonitorHealthCount(String tVMMonitorHealthCount) {
		this.VMMonitorHealthCount = tVMMonitorHealthCount;
	}

	// 76
	public String getVMMonitorHealthTime() {
		return VMMonitorHealthTime;
	}

	public void setVMMonitorHealthTime(String tVMMonitorHealthTime) {
		this.VMMonitorHealthTime = tVMMonitorHealthTime;
	}

	// 77
	public String getVMMonitorTasksCount() {
		return VMMonitorTasksCount;
	}

	public void setVMMonitorTasksCount(String tVMMonitorTasksCount) {
		this.VMMonitorTasksCount = tVMMonitorTasksCount;
	}

	// 78
	public String getVMMonitorTasksTime() {
		return VMMonitorTasksTime;
	}

	public void setVMMonitorTasksTime(String tVMMonitorTasksTime) {
		this.VMMonitorTasksTime = tVMMonitorTasksTime;
	}

	// 79
	public String getDSMonitorGSCount() {
		return DSMonitorGSCount;
	}

	public void setDSMonitorGSCount(String tDSMonitorGSCount) {
		this.DSMonitorGSCount = tDSMonitorGSCount;
	}

	// 80
	public String getDSMonitorGSTime() {
		return DSMonitorGSTime;
	}

	public void setDSMonitorGSTime(String tDSMonitorGSTime) {
		this.DSMonitorGSTime = tDSMonitorGSTime;
	}

	// 81
	public String getDSMonitorNewsFeedCount() {
		return DSMonitorNewsFeedCount;
	}

	public void setDSMonitorNewsFeedCount(String tDSMonitorNewsFeedCount) {
		this.DSMonitorNewsFeedCount = tDSMonitorNewsFeedCount;
	}

	// 82
	public String getDSMonitorNewsFeedTime() {
		return DSMonitorNewsFeedTime;
	}

	public void setDSMonitorNewsFeedTime(String tDSMonitorNewsFeedTime) {
		this.DSMonitorNewsFeedTime = tDSMonitorNewsFeedTime;
	}

	// 83
	public String getDSMonitorHealthCount() {
		return DSMonitorHealthCount;
	}

	public void setDSMonitorHealthCount(String tDSMonitorHealthCount) {
		this.DSMonitorHealthCount = tDSMonitorHealthCount;
	}

	// 84
	public String getDSMonitorHealthTime() {
		return DSMonitorHealthTime;
	}

	public void setDSMonitorHealthTime(String tDSMonitorHealthTime) {
		this.DSMonitorHealthTime = tDSMonitorHealthTime;
	}

	// 85
	public String getDSMonitorTasksCount() {
		return DSMonitorTasksCount;
	}

	public void setDSMonitorTasksCount(String tDSMonitorTasksCount) {
		this.DSMonitorTasksCount = tDSMonitorTasksCount;
	}

	// 86
	public String getDSMonitorTasksTime() {
		return DSMonitorTasksTime;
	}

	public void setDSMonitorTasksTime(String tDSMonitorTasksTime) {
		this.DSMonitorTasksTime = tDSMonitorTasksTime;
	}

	// 87
	public String getClusterMonitorGSCount() {
		return ClusterMonitorGSCount;
	}

	public void setClusterMonitorGSCount(String tClusterMonitorGSCount) {
		this.ClusterMonitorGSCount = tClusterMonitorGSCount;
	}

	// 88
	public String getClusterMonitorGSTime() {
		return ClusterMonitorGSTime;
	}

	public void setClusterMonitorGSTime(String tClusterMonitorGSTime) {
		this.ClusterMonitorGSTime = tClusterMonitorGSTime;
	}

	// 89
	public String getClusterMonitorNewsFeedCount() {
		return ClusterMonitorNewsFeedCount;
	}

	public void setClusterMonitorNewsFeedCount(String tClusterMonitorNewsFeedCount) {
		this.ClusterMonitorNewsFeedCount = tClusterMonitorNewsFeedCount;
	}

	// 90
	public String getClusterMonitorNewsFeedTime() {
		return ClusterMonitorNewsFeedTime;
	}

	public void setClusterMonitorNewsFeedTime(String tClusterMonitorNewsFeedTime) {
		this.ClusterMonitorNewsFeedTime = tClusterMonitorNewsFeedTime;
	}

	// 91
	public String getClusterMonitorHealthCount() {
		return ClusterMonitorHealthCount;
	}

	public void setClusterMonitorHealthCount(String tClusterMonitorHealthCount) {
		this.ClusterMonitorHealthCount = tClusterMonitorHealthCount;
	}

	// 92
	public String getClusterMonitorHealthTime() {
		return ClusterMonitorHealthTime;
	}

	public void setClusterMonitorHealthTime(String tClusterMonitorHealthTime) {
		this.ClusterMonitorHealthTime = tClusterMonitorHealthTime;
	}

	// 93
	public String getClusterMonitorTasksCount() {
		return ClusterMonitorTasksCount;
	}

	public void setClusterMonitorTasksCount(String tClusterMonitorTasksCount) {
		this.ClusterMonitorTasksCount = tClusterMonitorTasksCount;
	}

	// 94
	public String getClusterMonitorTasksTime() {
		return ClusterMonitorTasksTime;
	}

	public void setClusterMonitorTasksTime(String tClusterMonitorTasksTime) {
		this.ClusterMonitorTasksTime = tClusterMonitorTasksTime;
	}

	// 95
	public String getHostManageGSCount() {
		return HostManageGSCount;
	}

	public void setHostManageGSCount(String tHostManageGSCount) {
		this.HostManageGSCount = tHostManageGSCount;
	}

	// 96
	public String getHostManageGSTime() {
		return HostManageGSTime;
	}

	public void setHostManageGSTime(String tHostManageGSTime) {
		this.HostManageGSTime = tHostManageGSTime;
	}

	// 97
	public String getHostManageOverviewCount() {
		return HostManageOverviewCount;
	}

	public void setHostManageOverviewCount(String tHostManageOverviewCount) {
		this.HostManageOverviewCount = tHostManageOverviewCount;
	}

	// 98
	public String getHostManageOverviewTime() {
		return HostManageOverviewTime;
	}

	public void setHostManageOverviewTime(String tHostManageOverviewTime) {
		this.HostManageOverviewTime = tHostManageOverviewTime;
	}

	// 99
	public String getHostManageHostCount() {
		return HostManageHostCount;
	}

	public void setHostManageHostCount(String tHostManageHostCount) {
		this.HostManageHostCount = tHostManageHostCount;
	}

	// 100
	public String getHostManageHostTime() {
		return HostManageHostTime;
	}

	public void setHostManageHostTime(String tHostManageHostTime) {
		this.HostManageHostTime = tHostManageHostTime;
	}

	// 101
	public String getHostManageNetworkingCount() {
		return HostManageNetworkingCount;
	}

	public void setHostManageNetworkingCount(String tHostManageNetworkingCount) {
		this.HostManageNetworkingCount = tHostManageNetworkingCount;
	}

	// 102
	public String getHostManageNetworkingTime() {
		return HostManageNetworkingTime;
	}

	public void setHostManageNetworkingTime(String tHostManageNetworkingTime) {
		this.HostManageNetworkingTime = tHostManageNetworkingTime;
	}

	// 103
	public String getHostManageInfrastructureCount() {
		return HostManageInfrastructureCount;
	}

	public void setHostManageInfrastructureCount(String tHostManageInfrastructureCount) {
		this.HostManageInfrastructureCount = tHostManageInfrastructureCount;
	}

	// 104
	public String getHostManageInfrastructureTime() {
		return HostManageInfrastructureTime;
	}

	public void setHostManageInfrastructureTime(String tHostManageInfrastructureTime) {
		this.HostManageInfrastructureTime = tHostManageInfrastructureTime;
	}

	// 105
	public String getHostManageFullSummaryCount() {
		return HostManageFullSummaryCount;
	}

	public void setHostManageFullSummaryCount(String tHostManageFullSummaryCount) {
		this.HostManageFullSummaryCount = tHostManageFullSummaryCount;
	}

	// 106
	public String getHostManageFullSummaryTime() {
		return HostManageFullSummaryTime;
	}

	public void setHostManageFullSummaryTime(String tHostManageFullSummaryTime) {
		this.HostManageFullSummaryTime = tHostManageFullSummaryTime;
	}

	// 107
	public String getHostManageBriefSummaryCount() {
		return HostManageBriefSummaryCount;
	}

	public void setHostManageBriefSummaryCount(String tHostManageBriefSummaryCount) {
		this.HostManageBriefSummaryCount = tHostManageBriefSummaryCount;
	}

	// 108
	public String getHostManageBriefSummaryTime() {
		return HostManageBriefSummaryTime;
	}

	public void setHostManageBriefSummaryTime(String tHostManageBriefSummaryTime) {
		this.HostManageBriefSummaryTime = tHostManageBriefSummaryTime;
	}

	// 109
	public String getHostManageStorageCount() {
		return HostManageStorageCount;
	}

	public void setHostManageStorageCount(String tHostManageStorageCount) {
		this.HostManageStorageCount = tHostManageStorageCount;
	}

	// 110
	public String getHostManageStorageTime() {
		return HostManageStorageTime;
	}

	public void setHostManageStorageTime(String tHostManageStorageTime) {
		this.HostManageStorageTime = tHostManageStorageTime;
	}

	// 111
	public String getHostManageSwFwCount() {
		return HostManageSwFwCount;
	}

	public void setHostManageSwFwCount(String tHostManageSwFwCount) {
		this.HostManageSwFwCount = tHostManageSwFwCount;
	}

	// 112
	public String getHostManageSwFwTime() {
		return HostManageSwFwTime;
	}

	public void setHostManageSwFwTime(String tHostManageSwFwTime) {
		this.HostManageSwFwTime = tHostManageSwFwTime;
	}

	// 113
	public String getHostManageStorageSummaryCount() {
		return HostManageStorageSummaryCount;
	}

	public void setHostManageStorageSummaryCount(String tHostManageStorageSummaryCount) {
		this.HostManageStorageSummaryCount = tHostManageStorageSummaryCount;
	}

	// 114
	public String getHostManageStorageSummaryTime() {
		return HostManageStorageSummaryTime;
	}

	public void setHostManageStorageSummaryTime(String tHostManageStorageSummaryTime) {
		this.HostManageStorageSummaryTime = tHostManageStorageSummaryTime;
	}

	// 115
	public String getHostManageStorageSVolsCount() {
		return HostManageStorageSVolsCount;
	}

	public void setHostManageStorageSVolsCount(String tHostManageStorageSVolsCount) {
		this.HostManageStorageSVolsCount = tHostManageStorageSVolsCount;
	}

	// 116
	public String getHostManageStorageSVolsTime() {
		return HostManageStorageSVolsTime;
	}

	public void setHostManageStorageSVolsTime(String tHostManageStorageSVolsTime) {
		this.HostManageStorageSVolsTime = tHostManageStorageSVolsTime;
	}

	// 117
	public String getHostManageStorageVDisksCount() {
		return HostManageStorageVDisksCount;
	}

	public void setHostManageStorageVDisksCount(String tHostManageStorageVDisksCount) {
		this.HostManageStorageVDisksCount = tHostManageStorageVDisksCount;
	}

	// 118
	public String getHostManageStorageVDisksTime() {
		return HostManageStorageVDisksTime;
	}

	public void setHostManageStorageVDisksTime(String tHostManageStorageVDisksTime) {
		this.HostManageStorageVDisksTime = tHostManageStorageVDisksTime;
	}

	// 119
	public String getHostManageStorageHBAsCount() {
		return HostManageStorageHBAsCount;
	}

	public void setHostManageStorageHBAsCount(String tHostManageStorageHBAsCount) {
		this.HostManageStorageHBAsCount = tHostManageStorageHBAsCount;
	}

	// 120
	public String getHostManageStorageHBAsTime() {
		return HostManageStorageHBAsTime;
	}

	public void setHostManageStorageHBAsTime(String tHostManageStorageHBAsTime) {
		this.HostManageStorageHBAsTime = tHostManageStorageHBAsTime;
	}

	// 121
	public String getHostManageStoragePathsCount() {
		return HostManageStoragePathsCount;
	}

	public void setHostManageStoragePathsCount(String tHostManageStoragePathsCount) {
		this.HostManageStoragePathsCount = tHostManageStoragePathsCount;
	}

	// 122
	public String getHostManageStoragePathsTime() {
		return HostManageStoragePathsTime;
	}

	public void setHostManageStoragePathsTime(String tHostManageStoragePathsTime) {
		this.HostManageStoragePathsTime = tHostManageStoragePathsTime;
	}

	// 123
	public String getHostManageStorageReplicationsCount() {
		return HostManageStorageReplicationsCount;
	}

	public void setHostManageStorageReplicationsCount(String tHostManageStorageReplicationsCount) {
		this.HostManageStorageReplicationsCount = tHostManageStorageReplicationsCount;
	}

	// 124
	public String getHostManageStorageReplicationsTime() {
		return HostManageStorageReplicationsTime;
	}

	public void setHostManageStorageReplicationsTime(String tHostManageStorageReplicationsTime) {
		this.HostManageStorageReplicationsTime = tHostManageStorageReplicationsTime;
	}

	// 125
	public String getHostManageStorageVM2VolumesCount() {
		return HostManageStorageVM2VolumesCount;
	}

	public void setHostManageStorageVM2VolumesCount(String tHostManageStorageVM2VolumesCount) {
		this.HostManageStorageVM2VolumesCount = tHostManageStorageVM2VolumesCount;
	}

	// 126
	public String getHostManageStorageVM2VolumesTime() {
		return HostManageStorageVM2VolumesTime;
	}

	public void setHostManageStorageVM2VolumesTime(String tHostManageStorageVM2VolumesTime) {
		this.HostManageStorageVM2VolumesTime = tHostManageStorageVM2VolumesTime;
	}

	// 127
	public String getVMManageGSCount() {
		return VMManageGSCount;
	}

	public void setVMManageGSCount(String tVMManageGSCount) {
		this.VMManageGSCount = tVMManageGSCount;
	}

	// 128
	public String getVMManageGSTime() {
		return VMManageGSTime;
	}

	public void setVMManageGSTime(String tVMManageGSTime) {
		this.VMManageGSTime = tVMManageGSTime;
	}

	// 129
	public String getVMManageOverviewCount() {
		return VMManageOverviewCount;
	}

	public void setVMManageOverviewCount(String tVMManageOverviewCount) {
		this.VMManageOverviewCount = tVMManageOverviewCount;
	}

	// 130
	public String getVMManageOverviewTime() {
		return VMManageOverviewTime;
	}

	public void setVMManageOverviewTime(String tVMManageOverviewTime) {
		this.VMManageOverviewTime = tVMManageOverviewTime;
	}

	// 131
	public String getVMManageStorageCount() {
		return VMManageStorageCount;
	}

	public void setVMManageStorageCount(String tVMManageStorageCount) {
		this.VMManageStorageCount = tVMManageStorageCount;
	}

	// 132
	public String getVMManageStorageTime() {
		return VMManageStorageTime;
	}

	public void setVMManageStorageTime(String tVMManageStorageTime) {
		this.VMManageStorageTime = tVMManageStorageTime;
	}

	// 133
	public String getVMManageSwFwCount() {
		return VMManageSwFwCount;
	}

	public void setVMManageSwFwCount(String tVMManageSwFwCount) {
		this.VMManageSwFwCount = tVMManageSwFwCount;
	}

	// 134
	public String getVMManageSwFwTime() {
		return VMManageSwFwTime;
	}

	public void setVMManageSwFwTime(String tVMManageSwFwTime) {
		this.VMManageSwFwTime = tVMManageSwFwTime;
	}

	// 135
	public String getVMManageStorageSummaryCount() {
		return VMManageStorageSummaryCount;
	}

	public void setVMManageStorageSummaryCount(String tVMManageStorageSummaryCount) {
		this.VMManageStorageSummaryCount = tVMManageStorageSummaryCount;
	}

	// 136
	public String getVMManageStorageSummaryTime() {
		return VMManageStorageSummaryTime;
	}

	public void setVMManageStorageSummaryTime(String tVMManageStorageSummaryTime) {
		this.VMManageStorageSummaryTime = tVMManageStorageSummaryTime;
	}

	// 137
	public String getVMManageStorageSVolsCount() {
		return VMManageStorageSVolsCount;
	}

	public void setVMManageStorageSVolsCount(String tVMManageStorageSVolsCount) {
		this.VMManageStorageSVolsCount = tVMManageStorageSVolsCount;
	}

	// 138
	public String getVMManageStorageSVolsTime() {
		return VMManageStorageSVolsTime;
	}

	public void setVMManageStorageSVolsTime(String tVMManageStorageSVolsTime) {
		this.VMManageStorageSVolsTime = tVMManageStorageSVolsTime;
	}

	// 139
	public String getVMManageStorageVDisksCount() {
		return VMManageStorageVDisksCount;
	}

	public void setVMManageStorageVDisksCount(String tVMManageStorageVDisksCount) {
		this.VMManageStorageVDisksCount = tVMManageStorageVDisksCount;
	}

	// 140
	public String getVMManageStorageVDisksTime() {
		return VMManageStorageVDisksTime;
	}

	public void setVMManageStorageVDisksTime(String tVMManageStorageVDisksTime) {
		this.VMManageStorageVDisksTime = tVMManageStorageVDisksTime;
	}

	// 141
	public String getVMManageStorageHBAsCount() {
		return VMManageStorageHBAsCount;
	}

	public void setVMManageStorageHBAsCount(String tVMManageStorageHBAsCount) {
		this.VMManageStorageHBAsCount = tVMManageStorageHBAsCount;
	}

	// 142
	public String getVMManageStorageHBAsTime() {
		return VMManageStorageHBAsTime;
	}

	public void setVMManageStorageHBAsTime(String tVMManageStorageHBAsTime) {
		this.VMManageStorageHBAsTime = tVMManageStorageHBAsTime;
	}

	// 143
	public String getVMManageStoragePathsCount() {
		return VMManageStoragePathsCount;
	}

	public void setVMManageStoragePathsCount(String tVMManageStoragePathsCount) {
		this.VMManageStoragePathsCount = tVMManageStoragePathsCount;
	}

	// 144
	public String getVMManageStoragePathsTime() {
		return VMManageStoragePathsTime;
	}

	public void setVMManageStoragePathsTime(String tVMManageStoragePathsTime) {
		this.VMManageStoragePathsTime = tVMManageStoragePathsTime;
	}

	// 145
	public String getVMManageStorageReplicationsCount() {
		return VMManageStorageReplicationsCount;
	}

	public void setVMManageStorageReplicationsCount(String tVMManageStorageReplicationsCount) {
		this.VMManageStorageReplicationsCount = tVMManageStorageReplicationsCount;
	}

	// 146
	public String getVMManageStorageReplicationsTime() {
		return VMManageStorageReplicationsTime;
	}

	public void setVMManageStorageReplicationsTime(String tVMManageStorageReplicationsTime) {
		this.VMManageStorageReplicationsTime = tVMManageStorageReplicationsTime;
	}

	// 147
	public String getVMManageStorageVM2VolumesCount() {
		return VMManageStorageVM2VolumesCount;
	}

	public void setVMManageStorageVM2VolumesCount(String tVMManageStorageVM2VolumesCount) {
		this.VMManageStorageVM2VolumesCount = tVMManageStorageVM2VolumesCount;
	}

	// 148
	public String getVMManageStorageVM2VolumesTime() {
		return VMManageStorageVM2VolumesTime;
	}

	public void setVMManageStorageVM2VolumesTime(String tVMManageStorageVM2VolumesTime) {
		this.VMManageStorageVM2VolumesTime = tVMManageStorageVM2VolumesTime;
	}

	// 149
	public String getDSManageGSCount() {
		return DSManageGSCount;
	}

	public void setDSManageGSCount(String tDSManageGSCount) {
		this.DSManageGSCount = tDSManageGSCount;
	}

	// 150
	public String getDSManageGSTime() {
		return DSManageGSTime;
	}

	public void setDSManageGSTime(String tDSManageGSTime) {
		this.DSManageGSTime = tDSManageGSTime;
	}

	// 151
	public String getDSManageOverviewCount() {
		return DSManageOverviewCount;
	}

	public void setDSManageOverviewCount(String tDSManageOverviewCount) {
		this.DSManageOverviewCount = tDSManageOverviewCount;
	}

	// 152
	public String getDSManageOverviewTime() {
		return DSManageOverviewTime;
	}

	public void setDSManageOverviewTime(String tDSManageOverviewTime) {
		this.DSManageOverviewTime = tDSManageOverviewTime;
	}

	// 153
	public String getDSManageStorageCount() {
		return DSManageStorageCount;
	}

	public void setDSManageStorageCount(String tDSManageStorageCount) {
		this.DSManageStorageCount = tDSManageStorageCount;
	}

	// 154
	public String getDSManageStorageTime() {
		return DSManageStorageTime;
	}

	public void setDSManageStorageTime(String tDSManageStorageTime) {
		this.DSManageStorageTime = tDSManageStorageTime;
	}

	// 155
	public String getDSManageSwFwCount() {
		return DSManageSwFwCount;
	}

	public void setDSManageSwFwCount(String tDSManageSwFwCount) {
		this.DSManageSwFwCount = tDSManageSwFwCount;
	}

	// 156
	public String getDSManageSwFwTime() {
		return DSManageSwFwTime;
	}

	public void setDSManageSwFwTime(String tDSManageSwFwTime) {
		this.DSManageSwFwTime = tDSManageSwFwTime;
	}

	// 157
	public String getDSManageStorageSummaryCount() {
		return DSManageStorageSummaryCount;
	}

	public void setDSManageStorageSummaryCount(String tDSManageStorageSummaryCount) {
		this.DSManageStorageSummaryCount = tDSManageStorageSummaryCount;
	}

	// 158
	public String getDSManageStorageSummaryTime() {
		return DSManageStorageSummaryTime;
	}

	public void setDSManageStorageSummaryTime(String tDSManageStorageSummaryTime) {
		this.DSManageStorageSummaryTime = tDSManageStorageSummaryTime;
	}

	// 159
	public String getDSManageStorageSVolsCount() {
		return DSManageStorageSVolsCount;
	}

	public void setDSManageStorageSVolsCount(String tDSManageStorageSVolsCount) {
		this.DSManageStorageSVolsCount = tDSManageStorageSVolsCount;
	}

	// 160
	public String getDSManageStorageSVolsTime() {
		return DSManageStorageSVolsTime;
	}

	public void setDSManageStorageSVolsTime(String tDSManageStorageSVolsTime) {
		this.DSManageStorageSVolsTime = tDSManageStorageSVolsTime;
	}

	// 161
	public String getDSManageStorageVDisksCount() {
		return DSManageStorageVDisksCount;
	}

	public void setDSManageStorageVDisksCount(String tDSManageStorageVDisksCount) {
		this.DSManageStorageVDisksCount = tDSManageStorageVDisksCount;
	}

	// 162
	public String getDSManageStorageVDisksTime() {
		return DSManageStorageVDisksTime;
	}

	public void setDSManageStorageVDisksTime(String tDSManageStorageVDisksTime) {
		this.DSManageStorageVDisksTime = tDSManageStorageVDisksTime;
	}

	// 163
	public String getDSManageStorageHBAsCount() {
		return DSManageStorageHBAsCount;
	}

	public void setDSManageStorageHBAsCount(String tDSManageStorageHBAsCount) {
		this.DSManageStorageHBAsCount = tDSManageStorageHBAsCount;
	}

	// 164
	public String getDSManageStorageHBAsTime() {
		return DSManageStorageHBAsTime;
	}

	public void setDSManageStorageHBAsTime(String tDSManageStorageHBAsTime) {
		this.DSManageStorageHBAsTime = tDSManageStorageHBAsTime;
	}

	// 165
	public String getDSManageStoragePathsCount() {
		return DSManageStoragePathsCount;
	}

	public void setDSManageStoragePathsCount(String tDSManageStoragePathsCount) {
		this.DSManageStoragePathsCount = tDSManageStoragePathsCount;
	}

	// 166
	public String getDSManageStoragePathsTime() {
		return DSManageStoragePathsTime;
	}

	public void setDSManageStoragePathsTime(String tDSManageStoragePathsTime) {
		this.DSManageStoragePathsTime = tDSManageStoragePathsTime;
	}

	// 167
	public String getDSManageStorageReplicationsCount() {
		return DSManageStorageReplicationsCount;
	}

	public void setDSManageStorageReplicationsCount(String tDSManageStorageReplicationsCount) {
		this.DSManageStorageReplicationsCount = tDSManageStorageReplicationsCount;
	}

	// 168
	public String getDSManageStorageReplicationsTime() {
		return DSManageStorageReplicationsTime;
	}

	public void setDSManageStorageReplicationsTime(String tDSManageStorageReplicationsTime) {
		this.DSManageStorageReplicationsTime = tDSManageStorageReplicationsTime;
	}

	// 169
	public String getDSManageStorageVM2VolumesCount() {
		return DSManageStorageVM2VolumesCount;
	}

	public void setDSManageStorageVM2VolumesCount(String tDSManageStorageVM2VolumesCount) {
		this.DSManageStorageVM2VolumesCount = tDSManageStorageVM2VolumesCount;
	}

	// 170
	public String getDSManageStorageVM2VolumesTime() {
		return DSManageStorageVM2VolumesTime;
	}

	public void setDSManageStorageVM2VolumesTime(String tDSManageStorageVM2VolumesTime) {
		this.DSManageStorageVM2VolumesTime = tDSManageStorageVM2VolumesTime;
	}

	// 171
	public String getClusterManageGSCount() {
		return ClusterManageGSCount;
	}

	public void setClusterManageGSCount(String tClusterManageGSCount) {
		this.ClusterManageGSCount = tClusterManageGSCount;
	}

	// 172
	public String getClusterManageGSTime() {
		return ClusterManageGSTime;
	}

	public void setClusterManageGSTime(String tClusterManageGSTime) {
		this.ClusterManageGSTime = tClusterManageGSTime;
	}

	// 173
	public String getClusterManageOverviewCount() {
		return ClusterManageOverviewCount;
	}

	public void setClusterManageOverviewCount(String tClusterManageOverviewCount) {
		this.ClusterManageOverviewCount = tClusterManageOverviewCount;
	}

	// 174
	public String getClusterManageOverviewTime() {
		return ClusterManageOverviewTime;
	}

	public void setClusterManageOverviewTime(String tClusterManageOverviewTime) {
		this.ClusterManageOverviewTime = tClusterManageOverviewTime;
	}

	// 175
	public String getClusterManageClusterCount() {
		return ClusterManageClusterCount;
	}

	public void setClusterManageClusterCount(String tClusterManageClusterCount) {
		this.ClusterManageClusterCount = tClusterManageClusterCount;
	}

	// 176
	public String getClusterManageClusterTime() {
		return ClusterManageClusterTime;
	}

	public void setClusterManageClusterTime(String tClusterManageClusterTime) {
		this.ClusterManageClusterTime = tClusterManageClusterTime;
	}

	// 177
	public String getClusterManageStorageCount() {
		return ClusterManageStorageCount;
	}

	public void setClusterManageStorageCount(String tClusterManageStorageCount) {
		this.ClusterManageStorageCount = tClusterManageStorageCount;
	}

	// 178
	public String getClusterManageStorageTime() {
		return ClusterManageStorageTime;
	}

	public void setClusterManageStorageTime(String tClusterManageStorageTime) {
		this.ClusterManageStorageTime = tClusterManageStorageTime;
	}

	// 179
	public String getClusterManageSwFwCount() {
		return ClusterManageSwFwCount;
	}

	public void setClusterManageSwFwCount(String tClusterManageSwFwCount) {
		this.ClusterManageSwFwCount = tClusterManageSwFwCount;
	}

	// 180
	public String getClusterManageSwFwTime() {
		return ClusterManageSwFwTime;
	}

	public void setClusterManageSwFwTime(String tClusterManageSwFwTime) {
		this.ClusterManageSwFwTime = tClusterManageSwFwTime;
	}

	// 181
	public String getClusterManageInfrastructureCount() {
		return ClusterManageInfrastructureCount;
	}

	public void setClusterManageInfrastructureCount(String tClusterManageInfrastructureCount) {
		this.ClusterManageInfrastructureCount = tClusterManageInfrastructureCount;
	}

	// 182
	public String getClusterManageInfrastructureTime() {
		return ClusterManageInfrastructureTime;
	}

	public void setClusterManageInfrastructureTime(String tClusterManageInfrastructureTime) {
		this.ClusterManageInfrastructureTime = tClusterManageInfrastructureTime;
	}

	// 183
	public String getClusterManageStorageSummaryCount() {
		return ClusterManageStorageSummaryCount;
	}

	public void setClusterManageStorageSummaryCount(String tClusterManageStorageSummaryCount) {
		this.ClusterManageStorageSummaryCount = tClusterManageStorageSummaryCount;
	}

	// 184
	public String getClusterManageStorageSummaryTime() {
		return ClusterManageStorageSummaryTime;
	}

	public void setClusterManageStorageSummaryTime(String tClusterManageStorageSummaryTime) {
		this.ClusterManageStorageSummaryTime = tClusterManageStorageSummaryTime;
	}

	// 185
	public String getClusterManageStorageSVolsCount() {
		return ClusterManageStorageSVolsCount;
	}

	public void setClusterManageStorageSVolsCount(String tClusterManageStorageSVolsCount) {
		this.ClusterManageStorageSVolsCount = tClusterManageStorageSVolsCount;
	}

	// 186
	public String getClusterManageStorageSVolsTime() {
		return ClusterManageStorageSVolsTime;
	}

	public void setClusterManageStorageSVolsTime(String tClusterManageStorageSVolsTime) {
		this.ClusterManageStorageSVolsTime = tClusterManageStorageSVolsTime;
	}

	// 187
	public String getClusterManageStorageVDisksCount() {
		return ClusterManageStorageVDisksCount;
	}

	public void setClusterManageStorageVDisksCount(String tClusterManageStorageVDisksCount) {
		this.ClusterManageStorageVDisksCount = tClusterManageStorageVDisksCount;
	}

	// 188
	public String getClusterManageStorageVDisksTime() {
		return ClusterManageStorageVDisksTime;
	}

	public void setClusterManageStorageVDisksTime(String tClusterManageStorageVDisksTime) {
		this.ClusterManageStorageVDisksTime = tClusterManageStorageVDisksTime;
	}

	// 189
	public String getClusterManageStorageHBAsCount() {
		return ClusterManageStorageHBAsCount;
	}

	public void setClusterManageStorageHBAsCount(String tClusterManageStorageHBAsCount) {
		this.ClusterManageStorageHBAsCount = tClusterManageStorageHBAsCount;
	}

	// 190
	public String getClusterManageStorageHBAsTime() {
		return ClusterManageStorageHBAsTime;
	}

	public void setClusterManageStorageHBAsTime(String tClusterManageStorageHBAsTime) {
		this.ClusterManageStorageHBAsTime = tClusterManageStorageHBAsTime;
	}

	// 191
	public String getClusterManageStoragePathsCount() {
		return ClusterManageStoragePathsCount;
	}

	public void setClusterManageStoragePathsCount(String tClusterManageStoragePathsCount) {
		this.ClusterManageStoragePathsCount = tClusterManageStoragePathsCount;
	}

	// 192
	public String getClusterManageStoragePathsTime() {
		return ClusterManageStoragePathsTime;
	}

	public void setClusterManageStoragePathsTime(String tClusterManageStoragePathsTime) {
		this.ClusterManageStoragePathsTime = tClusterManageStoragePathsTime;
	}

	// 193
	public String getClusterManageStorageReplicationsCount() {
		return ClusterManageStorageReplicationsCount;
	}

	public void setClusterManageStorageReplicationsCount(String tClusterManageStorageReplicationsCount) {
		this.ClusterManageStorageReplicationsCount = tClusterManageStorageReplicationsCount;
	}

	// 194
	public String getClusterManageStorageReplicationsTime() {
		return ClusterManageStorageReplicationsTime;
	}

	public void setClusterManageStorageReplicationsTime(String tClusterManageStorageReplicationsTime) {
		this.ClusterManageStorageReplicationsTime = tClusterManageStorageReplicationsTime;
	}

	// 195
	public String getClusterManageStorageVM2VolumesCount() {
		return ClusterManageStorageVM2VolumesCount;
	}

	public void setClusterManageStorageVM2VolumesCount(String tClusterManageStorageVM2VolumesCount) {
		this.ClusterManageStorageVM2VolumesCount = tClusterManageStorageVM2VolumesCount;
	}

	// 196
	public String getClusterManageStorageVM2VolumesTime() {
		return ClusterManageStorageVM2VolumesTime;
	}

	public void setClusterManageStorageVM2VolumesTime(String tClusterManageStorageVM2VolumesTime) {
		this.ClusterManageStorageVM2VolumesTime = tClusterManageStorageVM2VolumesTime;
	}

	// 197
	public String getCreateDSSuccessCount() {
		return CreateDSSuccessCount;
	}

	public void setCreateDSSuccessCount(String tCreateDSSuccessCount) {
		this.CreateDSSuccessCount = tCreateDSSuccessCount;
	}

	// 198
	public String getCreateVMSuccessCount() {
		return CreateVMSuccessCount;
	}

	public void setCreateVMSuccessCount(String tCreateVMSuccessCount) {
		this.CreateVMSuccessCount = tCreateVMSuccessCount;
	}

	// 199
	public String getCloneVMSuccessCount() {
		return CloneVMSuccessCount;
	}

	public void setCloneVMSuccessCount(String tCloneVMSuccessCount) {
		this.CloneVMSuccessCount = tCloneVMSuccessCount;
	}

	// 200
	public String getExpandDSSuccessCount() {
		return ExpandDSSuccessCount;
	}

	public void setExpandDSSuccessCount(String tExpandDSSuccessCount) {
		this.ExpandDSSuccessCount = tExpandDSSuccessCount;
	}

	// 201
	public String getDeleteDSSuccessCount() {
		return DeleteDSSuccessCount;
	}

	public void setDeleteDSSuccessCount(String tDeleteDSSuccessCount) {
		this.DeleteDSSuccessCount = tDeleteDSSuccessCount;
	}

	// 202
	public String getDeleteVolSuccessCount() {
		return DeleteVolSuccessCount;
	}

	public void setDeleteVolSuccessCount(String tDeleteVolSuccessCount) {
		this.DeleteVolSuccessCount = tDeleteVolSuccessCount;
	}

	// 203
	public String getDeleteVmSuccessCount() {
		return DeleteVmSuccessCount;
	}

	public void setDeleteVmSuccessCount(String tDeleteVmSuccessCount) {
		this.DeleteVmSuccessCount = tDeleteVmSuccessCount;
	}

	// 204
	public String getCreateDSFailureCount() {
		return CreateDSFailureCount;
	}

	public void setCreateDSFailureCount(String tCreateDSFailureCount) {
		this.CreateDSFailureCount = tCreateDSFailureCount;
	}

	// 205
	public String getCreateVMFailureCount() {
		return CreateVMFailureCount;
	}

	public void setCreateVMFailureCount(String tCreateVMFailureCount) {
		this.CreateVMFailureCount = tCreateVMFailureCount;
	}

	// 206
	public String getCloneVMFailureCount() {
		return CloneVMFailureCount;
	}

	public void setCloneVMFailureCount(String tCloneVMFailureCount) {
		this.CloneVMFailureCount = tCloneVMFailureCount;
	}

	// 207
	public String getExpandDSFailureCount() {
		return ExpandDSFailureCount;
	}

	public void setExpandDSFailureCount(String tExpandDSFailureCount) {
		this.ExpandDSFailureCount = tExpandDSFailureCount;
	}

	// 208
	public String getDeleteDSFailureCount() {
		return DeleteDSFailureCount;
	}

	public void setDeleteDSFailureCount(String tDeleteDSFailureCount) {
		this.DeleteDSFailureCount = tDeleteDSFailureCount;
	}

	// 209
	public String getDeleteVolFailureCount() {
		return DeleteVolFailureCount;
	}

	public void setDeleteVolFailureCount(String tDeleteVolFailureCount) {
		this.DeleteVolFailureCount = tDeleteVolFailureCount;
	}

	// 210
	public String getDeleteVmFailureCount() {
		return DeleteVmFailureCount;
	}

	public void setDeleteVmFailureCount(String tDeleteVmFailureCount) {
		this.DeleteVmFailureCount = tDeleteVmFailureCount;
	}

	// 211
	public String getVASARegistrationCount() {
		return VASARegistrationCount;
	}

	public void setVASARegistrationCount(String tVASARegistrationCount) {
		this.VASARegistrationCount = tVASARegistrationCount;
	}

	// 212
	public String getDAMAllStorageCount() {
		return DAMAllStorageCount;
	}

	public void setDAMAllStorageCount(String tDAMAllStorageCount) {
		this.DAMAllStorageCount = tDAMAllStorageCount;
	}

	// 213
	public String getDAMAllStorageTime() {
		return DAMAllStorageTime;
	}

	public void setDAMAllStorageTime(String tDAMAllStorageTime) {
		this.DAMAllStorageTime = tDAMAllStorageTime;
	}

	// 214
	public String getDAMSystemSummaryCount() {
		return DAMSystemSummaryCount;
	}

	public void setDAMSystemSummaryCount(String tDAMSystemSummaryCount) {
		this.DAMSystemSummaryCount = tDAMSystemSummaryCount;
	}

	// 215
	public String getDAMSystemSummaryTime() {
		return DAMSystemSummaryTime;
	}

	public void setDAMSystemSummaryTime(String tDAMSystemSummaryTime) {
		this.DAMSystemSummaryTime = tDAMSystemSummaryTime;
	}

	// 216
	public String getDAMStorageSummaryCount() {
		return DAMStorageSummaryCount;
	}

	public void setDAMStorageSummaryCount(String tDAMStorageSummaryCount) {
		this.DAMStorageSummaryCount = tDAMStorageSummaryCount;
	}

	// 217
	public String getDAMStorageSummaryTime() {
		return DAMStorageSummaryTime;
	}

	public void setDAMStorageSummaryTime(String tDAMStorageSummaryTime) {
		this.DAMStorageSummaryTime = tDAMStorageSummaryTime;
	}

	// 218
	public String getDAMSystemOverviewCount() {
		return DAMSystemOverviewCount;
	}

	public void setDAMSystemOverviewCount(String tDAMSystemOverviewCount) {
		this.DAMSystemOverviewCount = tDAMSystemOverviewCount;
	}

	// 219
	public String getDAMSystemOverviewTime() {
		return DAMSystemOverviewTime;
	}

	public void setDAMSystemOverviewTime(String tDAMSystemOverviewTime) {
		this.DAMSystemOverviewTime = tDAMSystemOverviewTime;
	}

	// 220
	public String getDAMHealthCount() {
		return DAMHealthCount;
	}

	public void setDAMHealthCount(String tDAMHealthCount) {
		this.DAMHealthCount = tDAMHealthCount;
	}

	// 221
	public String getDAMHealthTime() {
		return DAMHealthTime;
	}

	public void setDAMHealthTime(String tDAMHealthTime) {
		this.DAMHealthTime = tDAMHealthTime;
	}

	// 222
	public String getDAMLaunchLinksCount() {
		return DAMLaunchLinksCount;
	}

	public void setDAMLaunchLinksCount(String tDAMLaunchLinksCount) {
		this.DAMLaunchLinksCount = tDAMLaunchLinksCount;
	}

	// 223
	public String getDAMLaunchLinksTime() {
		return DAMLaunchLinksTime;
	}

	public void setDAMLaunchLinksTime(String tDAMLaunchLinksTime) {
		this.DAMLaunchLinksTime = tDAMLaunchLinksTime;
	}

	// 224
	public String getServers() {
		return Servers;
	}

	public void setServers(String tServers) {
		this.Servers = tServers;
	}

	// 225
	public String getILos() {
		return ILos;
	}

	public void setILos(String tILos) {
		this.ILos = tILos;
	}

	// 226
	public String getOAs() {
		return OAs;
	}

	public void setOAs(String tOAs) {
		this.OAs = tOAs;
	}

	// 227
	public String getVCMs() {
		return VCMs;
	}

	public void setVCMs(String tVCMs) {
		this.VCMs = tVCMs;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}
}
