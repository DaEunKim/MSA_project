/**
 * packageName    : org.member.core.aop
 * fileName       : TimeTraceAop
 * author         : dani
 * date           : 2022/08/26
 * description    :
 */
package org.member.core.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TimeTraceAop {
    @Around("execution(* org.member..*(..))") // 어디에 사용할건지 공통 관심사를 타겟팅해준다.
    public Object execute(ProceedingJoinPoint joinPoint) throws Throwable {

        long start = System.currentTimeMillis();
        System.out.println("START: " + joinPoint.toShortString());

        try {
            return joinPoint.proceed(); // 다음 메서드로 진행
        } finally {
            long finish = System.currentTimeMillis();
            long timeMs = finish - start;

            System.out.println("END: " + joinPoint.toShortString() + " " + timeMs + "ms");
        }
    }
}