package cuit;

import java.io.FileNotFoundException;

import org.apache.log4j.Logger;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Log4jConfigurer;

/**
 * @author guangyin
 */
@RunWith(SpringJUnit4ClassRunner.class)  
@TransactionConfiguration(transactionManager = "transactionManager")
@Transactional
/**ContextConfiguration spring引用的properties位置需要放在src下。
 * 测试时需要将app-context*.xml中的测试配置文件打开：
 * <value>classpath:com/better517na/config/test-jdbc.properties</value>
 * <value>classpath:com/better517na/config/test-log_config.properties</value>
 * 关闭外部配置文件
 * <value>/WEB-INF/config/jdbc.properties</value>
 * <value>/WEB-INF/config/log_config.properties</value>  
 * */
@ContextConfiguration("/com/better517na/config/spring/app-context*.xml")
public class BaseTest  {
	protected Logger logger = Logger.getLogger(BaseTest.class);
	 static {  
	        try {  
	            Log4jConfigurer.initLogging("WebRoot/WEB-INF/log4j.properties");  
	        } catch (FileNotFoundException ex) {  
	            System.err.println("Cannot Initialize log4j");  
	        }  
	    }  
    public ApplicationContext getAc() {
    	ApplicationContext ac = new ClassPathXmlApplicationContext("/com/better517na/config/spring/app-context*.xml");
    	return ac;
    }
   
}
