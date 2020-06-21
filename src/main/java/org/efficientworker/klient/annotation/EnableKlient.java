package org.efficientworker.klient.annotation;

import org.efficientworker.klient.KlientConfiguration;
import org.efficientworker.klient.KlientRegistrar;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author herseus
 * @since 2020/6/21
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({KlientConfiguration.class, KlientRegistrar.class})
public @interface EnableKlient {
}
