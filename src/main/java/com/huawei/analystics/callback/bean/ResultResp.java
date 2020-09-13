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
 * ResultResp
 *
 * @since 2020-08-14
 */
@Validated
public class ResultResp implements Serializable {

    private static final long serialVersionUID = 3708679542810950331L;

    @JsonProperty("result_code")
    private String resultCode;

    @JsonProperty("result_msg")
    private String resultMsg;

    /**
     * Gets result code.
     *
     * @return the result code
     */
    public String getResultCode() {
        return resultCode;
    }

    /**
     * Sets result code.
     *
     * @param resultCode the result code
     */
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    /**
     * Gets result msg.
     *
     * @return the result msg
     */
    public String getResultMsg() {
        return resultMsg;
    }

    /**
     * Sets result msg.
     *
     * @param resultMsg the result msg
     */
    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }
}
