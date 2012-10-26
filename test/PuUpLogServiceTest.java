

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import basic.BasicSpringTest;

import com.yao.pu.model.PuUpLog;
import com.yao.pu.service.PuUpLogServiceI;

/**
 * 
 * 该测试为集成测试，非单元测试
 * 
 * User: Zhang Kaitao
 * Date: 11-12-26 下午4:33
 * Version: 1.0
 */
//@Ignore

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"classpath:spring.xml","classpath:spring-hibernate.xml"})
//@Transactional
//@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
public class PuUpLogServiceTest extends BasicSpringTest{
    
    
    @Autowired
    private PuUpLogServiceI puUpLogService;
    
 
    @Test
    public void testCreate() {
    	PuUpLog t = new PuUpLog();
    	t.setUpLog("test on ");
    	t.setNo(1);
    	t.setAddDate(new Date());
    	//t.setSid((long) 3);
    	
    	puUpLogService.add(t);
    	

    }



}
