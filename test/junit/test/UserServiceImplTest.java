package junit.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.h.www.dao.UserMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-dao.xml"})
public class UserServiceImplTest {
	@Autowired
	private UserMapper userMapper;
	@Test
	public void testInsert() {

	}

	@Test
	public void testDeleteById() {
		
	}

	@Test
	public void testUpdate() {
		
	}

	@Test
	public void testSelectById() {
		
	}

	@Test
	public void testSelectUserBasicInfo() {
		
	}

	@Test
	public void testSelectUserAndHouseAndHouseDept() {
		
	}

}
