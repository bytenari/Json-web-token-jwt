package com.example.filtertest.filtertest;

import javax.servlet.*;
import java.io.IOException;

public class FirstFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {
        // 필터 초기화 작업
    }

    public void doFilter(ServletRequest request,
                         ServletResponse response,
                         FilterChain chain)
            throws IOException, ServletException {
        // 1. request 파리미터를 이용하여 요청의 필터 작업 수행
        // 2. 체인의 다음 필터 처리
        System.out.println("================================시작");
        chain.doFilter(request, response);        // 3. response를 이용하여 응답의 필터링 작업 수행
        System.out.println("================================종료");
    }

    public void destroy() {
        // 주로 필터가 사용한 자원을 반납
        System.out.println("FirstFilter 사라짐");
        Filter.super.destroy();
    }
}