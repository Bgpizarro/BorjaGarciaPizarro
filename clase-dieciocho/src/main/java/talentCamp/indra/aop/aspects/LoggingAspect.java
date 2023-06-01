package talentCamp.indra.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	@Before(value="execution(* indra.talentCamp.aop.controllers.AopDemoController.*(..))")
	public void logBefore(JoinPoint joinPoint) {
		
		Logger logger=LoggerFactory.getLogger(LoggingAspect.class);
		logger.info("Entrando al metodo "+ joinPoint.getSignature().getName()
				+" de la clase "+ joinPoint.getClass().getName());
	}
	
	@After(value="execution(* indra.talentCamp.aop.controllers.AopDemoController.*(..))")
	public void logAfter(JoinPoint joinPoint) {
		Logger logger=LoggerFactory.getLogger(LoggingAspect.class);
		logger.info("Saliendo del metodo "+ joinPoint.getSignature().getName()
				+" de la clase "+ joinPoint.getClass().getName());
	}
	
	
}
