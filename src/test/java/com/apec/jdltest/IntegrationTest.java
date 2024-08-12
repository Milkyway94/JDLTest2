package com.apec.jdltest;

import com.apec.jdltest.config.AsyncSyncConfiguration;
import com.apec.jdltest.config.EmbeddedCassandra;
import com.apec.jdltest.config.EmbeddedRedis;
import com.apec.jdltest.config.JacksonConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { JdlTestApp.class, JacksonConfiguration.class, AsyncSyncConfiguration.class })
@EmbeddedRedis
@EmbeddedCassandra
public @interface IntegrationTest {
}
