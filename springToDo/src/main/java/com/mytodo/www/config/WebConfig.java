package com.mytodo.www.config;

import javax.servlet.Filter;
import javax.servlet.ServletRegistration;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

	
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		//root-context.xml을 대신하는 클래스 설정 (RootConfig.class)
		return new Class[] {RootConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		//servlet-context.xml을 대신하는 클래스 설정
		return new Class[] {ServletConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		//Servlet home 매핑 주소
		return new String[] {"/"};
	}

	@Override
	protected Filter[] getServletFilters() {
		// 요청/응답시 인코딩 필터 설정
		CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();
		encodingFilter.setEncoding("UTF-8");	//요청시 인코딩 처리 (request)
		encodingFilter.setForceEncoding(true);	//응답시 인코딩 처리 (response)
		
		return new Filter[] {encodingFilter};
	}
	
	@Override
	protected void customizeRegistration(ServletRegistration.Dynamic registration) {
		// 그외 기타 사용자 설정
		// 사용자 지정 익셉션 설정을 할것인지 처리
		registration.setInitParameter("throwExceptionIfNotHandlerFount", "true");
	}
	

}
