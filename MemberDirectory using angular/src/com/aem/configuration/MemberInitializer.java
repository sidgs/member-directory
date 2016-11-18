package com.aem.configuration;

import javax.servlet.Filter;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MemberInitializer  extends AbstractAnnotationConfigDispatcherServletInitializer  {
		 
	    @Override
	    protected Class<?>[] getRootConfigClasses() {
	        return new Class[] { MemberConfiguration.class };
	    }
	  
	    @Override
	    protected Class<?>[] getServletConfigClasses() {
	        return null;
	    }
	  
	    @Override
	    protected String[] getServletMappings() {
	        return new String[] { "/" };
	    }
	    
	    @Override
	    protected Filter[] getServletFilters() {
	    	Filter [] singleton = { new CORSFilter() };
	    	return singleton;
		}
	 
	}

