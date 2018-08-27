package org.mozilla.components.telemetry.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface TelemetryDoc {
    String action();

    String method();

    String object();

    String value();

    TelemetryExtra[] extras();
}
