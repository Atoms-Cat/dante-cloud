/*
 * Copyright (c) 2019-2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *
 * Project Name: eurynome-cloud
 * Module Name: eurynome-cloud-security
 * File Name: SecurityMetadataStorage.java
 * Author: gengwei.zheng
 * Date: 2020/12/30 下午2:26
 * LastModified: 2020/12/30 下午2:26
 */

package cn.herodotus.eurynome.security.strategy;

import cn.herodotus.eurynome.security.definition.RequestMapping;

import java.util.List;

/**
 * <p>Project: eurynome-cloud </p>
 * <p>File: SecurityMetadataStorage </p>
 *
 * <p>Description: SecurityMetadataStorage接口，预期要支持微服务和单体等不同需求的存储方式 </p>
 *
 * @author : gengwei.zheng
 * @date : 2020/12/30 14:26
 */
public abstract class SecurityMetadataStorage {

    public abstract void save(List<RequestMapping> requestMappings);

    public abstract List<RequestMapping> findAll();
}
