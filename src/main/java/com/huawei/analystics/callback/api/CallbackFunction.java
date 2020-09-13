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

package com.huawei.analystics.callback.api;

import com.huawei.analystics.callback.bean.ExportDataCallbackReq;
import com.huawei.analystics.callback.bean.ResultResp;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/**
 * CallbackFunction
 *
 * @since 2020-08-14
 */
@RestController
@RequestMapping("/analytics")
public class CallbackFunction {
    /**
     * callback
     *
     * @param req
     * @return
     */
    @RequestMapping(value = "/callbackinterface", method = RequestMethod.POST)
    public ResultResp callback(@RequestBody ExportDataCallbackReq req) {
        ResultResp result = new ResultResp();
        // Analytics Kit导出任务生成完成后，接收回调
        System.out.println(req.getExportDataFilePath());
        // 拿到下载地址，继续往下做业务逻辑
        result.setResultCode("0");
        result.setResultMsg("success");
        return result;
    }
}
