package junit.test;

import static org.junit.Assert.fail;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.h.www.entity.Admin;
import com.h.www.service.AdminService;
import com.h.www.utils.MD5Util;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-dao.xml",
		"classpath:spring-service.xml"})
public class AdminServiceImplTest {

	@Resource(name = "adminService")
	private AdminService adminService;

	@Test
	public void testInsert() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteById() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdate() throws Exception {
		Admin admin = new Admin();
		// 实现MD5加密
		// for (int i = 6; i < 9; i++) {
		// admin = adminService.selectById(i);
		admin = adminService.selectById(10);
		System.out.println(admin);
		admin.setPassword(MD5Util.MD5(admin.getPassword()));
		System.out.println(admin);
		adminService.update(admin);
		// }
	}

	@Test
	public void testSelectById() throws Exception {
		System.out.println(adminService.selectById(6));
	}

	@Test
	public void testSelectCompleteInfo() throws Exception {
		Admin admin = adminService.selectCompleteInfo(6);
		System.out.println(admin);
	}

}
