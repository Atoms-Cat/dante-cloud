package cn.herodotus.eurynome.rest.annotation;

import cn.herodotus.eurynome.rest.configuration.RestConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * <p> Description : Rest Component 相关配置Enable注解 </p>
 *
 * @author : gengwei.zheng
 * @date : 2020/3/2 11:01
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(RestConfiguration.class)
public @interface EnableHerodotusRest {
}
