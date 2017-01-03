package junit.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.h.www.dao.AdminMapper;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-dao.xml")
public class AdminMapperTest {
	@Autowired
	AdminMapper adminMapper;

	@Test
	public void testDeleteById() {
		System.out.println();
	}

	@Test
	public void testInsert() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectById() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectByNameAndPwd() throws Exception {
		System.out.println(adminMapper.selectByNameAndPwd("admin", "admin"));
	}

	@Test
	public void testSelectAdminAndGroupByAdminId() throws Exception {
		System.out.println(adminMapper.selectAdminAndGroupByAdminId(6));
	}

	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}
	@Test
	public void testUpdateLoginTime() {

	}
}
