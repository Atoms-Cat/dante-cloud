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
 * Module Name: eurynome-cloud-data
 * File Name: EnableLogCollection.java
 * Author: gengwei.zheng
 * Date: 2020/5/23 上午10:04
 * LastModified: 2020/5/23 上午10:04
 */

package cn.herodotus.eurynome.data.annotation;

import cn.herodotus.eurynome.data.configuration.LogstashConfiguration;
import cn.herodotus.eurynome.operation.properties.ManagementProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * <p>Project: eurynome-cloud </p>
 * <p>File: EnableLogCollection </p>
 *
 * <p>Description: 开启日志收集 </p>
 *
 * @author : gengwei.zheng
 * @date : 2020/5/23 10:04
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@EnableConfigurationProperties(ManagementProperties.class)
@Import(LogstashConfiguration.class)
public @interface EnableLogCollection {
}
