package com.bigfish.airports.data;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.bigfish.airports.TestConfiguration;

@ContextConfiguration(
	loader = AnnotationConfigContextLoader.class,
	classes = {
		TestConfiguration.class,
	}
)
//@ActiveProfiles("dev")
@TestPropertySource(locations="classpath:test.properties")
public abstract class BaseTest extends AbstractTransactionalJUnit4SpringContextTests {

}
