/*
 * Copyright 2020. Huawei Technologies Co., Ltd. All rights reserved.



   Licensed under the Apache License, Version 2.0 (the "License");

   you may not use this file except in compliance with the License.

   You may obtain a copy of the License at



     http://www.apache.org/licenses/LICENSE-2.0



   Unless required by applicable law or agreed to in writing, software

   distributed under the License is distributed on an "AS IS" BASIS,

   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

   See the License for the specific language governing permissions and

   limitations under the License.
 */
package com.huawei.analystics.callback.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

import org.springframework.validation.annotation.Validated;

import java.io.Serializable;
/**
 * ExportDataCallbackReq
 *
 * @since 2020-08-14
 */
@Validated
public class ExportDataCallbackReq implements Serializable {

    private static final long serialVersionUID = -8014011591749838257L;

    @JsonProperty("request_id")
    private String exportDataRequestId;

    @JsonProperty("app_id")
    private String exportDataAppId;

    @JsonProperty("status")
    private String exportDataStatus;

    @JsonProperty("file_path")
    private String exportDataFilePath;

    @JsonProperty("status_time")
    private String statusTime;

    /**
     * Gets request id.
     *
     * @return the request id
     */
    public String getExportDataRequestId() {
        return exportDataRequestId;
    }

    /**
     * Sets request id.
     *
     * @param exportDataRequestId the request id
     */
    public void setExportDataRequestId(String exportDataRequestId) {
        this.exportDataRequestId = exportDataRequestId;
    }

    /**
     * Gets app id.
     *
     * @return the app id
     */
    public String getExportDataAppId() {
        return exportDataAppId;
    }

    /**
     * Sets app id.
     *
     * @param exportDataAppId the app id
     */
    public void setExportDataAppId(String exportDataAppId) {
        this.exportDataAppId = exportDataAppId;
    }

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getExportDataStatus() {
        return exportDataStatus;
    }

    /**
     * Sets status.
     *
     * @param exportDataStatus the status
     */
    public void setExportDataStatus(String exportDataStatus) {
        this.exportDataStatus = exportDataStatus;
    }

    /**
     * Gets file path.
     *
     * @return the file path
     */
    public String getExportDataFilePath() {
        return exportDataFilePath;
    }

    /**
     * Sets file path.
     *
     * @param exportDataFilePath the file path
     */
    public void setExportDataFilePath(String exportDataFilePath) {
        this.exportDataFilePath = exportDataFilePath;
    }

    /**
     * Gets status time.
     *
     * @return the status time
     */
    public String getStatusTime() {
        return statusTime;
    }

    /**
     * Sets status time.
     *
     * @param statusTime the status time
     */
    public void setStatusTime(String statusTime) {
        this.statusTime = statusTime;
    }
}
