/*
 * TencentBlueKing is pleased to support the open source community by making
 * 蓝鲸智云-权限中心Java SDK(iam-java-sdk) available.
 * Copyright (C) 2017-2021 THL A29 Limited, a Tencent company. All rights reserved.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at http://opensource.org/licenses/MIT
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.tencent.bk.sdk.iam.dto.manager;

import lombok.Data;

@Data
public class ManagerPath {
    /**
     * 系统ID
     */
    String system;
    /**
     * 资源类型
     */
    String type;
    /**
     * 资源实例ID
     */
    String id;
    /**
     * 资源实例ID名称
     */
    String name;

    public ManagerPath(String system, String type, String id, String name) {
        this.system = system;
        this.type = type;
        this.id = id;
        this.name = name;
    }
}
