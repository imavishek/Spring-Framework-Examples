package com.avishek.spring;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[]{SpringConfig.class};
		
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[]{SpringConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[]{"*.abhi"};
	}

}
