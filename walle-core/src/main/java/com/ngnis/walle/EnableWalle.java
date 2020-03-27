package com.ngnis.walle;

import com.ngnis.walle.config.AccountAutoConfiguration;
import com.ngnis.walle.config.BoardAutoConfiguration;
import com.ngnis.walle.config.WalleAutoConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * 通过该注解开启所有
 *
 * @author houyi.wh
 * @since 2018-09-09
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({AccountAutoConfiguration.class, BoardAutoConfiguration.class})
public @interface EnableWalle {

}
