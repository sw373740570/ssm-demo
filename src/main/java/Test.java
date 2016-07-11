import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.micro.feeling.StoreEntity;
import com.micro.feeling.service.StoreService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class Test {
	private static Logger logger = Logger.getLogger(Test.class);
	
	@Resource
	private StoreService service;
	
	@org.junit.Test
	public void testMy() {
		StoreEntity store = service.getStore(3);
		logger.info(JSON.toJSONString(store));
	}
}
