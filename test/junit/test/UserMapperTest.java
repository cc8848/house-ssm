package junit.test;

import static org.junit.Assert.fail;

import java.io.File;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.h.www.dao.UserMapper;
import com.h.www.entity.User;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-dao.xml")

public class UserMapperTest {
	@Autowired
	UserMapper userMapper;

	@Test
	public void testDeleteById() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectById() throws Exception {

	}
	@Test
	public void testSelectByHouseid() throws Exception {
		System.out.println(userMapper.selectByHouseid(1));
	}

	@Test
	public void testSelectUserAndHouseAndDeptById() throws Exception {
		System.out.println(userMapper.selectUserAndHouseAndDeptById(1));
	}

	@Test
	public void testSelectUserAndHouseAndDept() throws Exception {
		PageHelper.startPage(1, 6);
		Page<User> page = (Page<User>) userMapper.selectUserAndHouseAndDept();
		List<User> userlist = page.getResult();
		System.out.println("一页有" + page.getPageSize() + "条数据");
		System.out.println("共" + page.getTotal() + "条数据");
		for (User user : userlist) {
			System.out.println(user);
		}
	}
	@Test
	public void testSelectAllBasic() throws Exception {
		System.out.println(System.getProperty("user.dir"));

	}

	@Test
	public void testInsert() throws Exception {
		long st = System.currentTimeMillis();
		User user = new User();
		for (int j = 0; j < 15000; j++) {
			user.setUname("陈" + j);
			if (j < 10) {
				user.setUindentyid("42028118760723534" + j);
			} else if (j < 100) {
				user.setUindentyid("4202811876072345" + j);
			} else if (j < 1000) {
				user.setUindentyid("420281187607233" + j);
			} else if (j < 10000) {
				user.setUindentyid("42028118760723" + j);
			} else {
				user.setUindentyid("4202811876072" + j);
			}
			user.setPhone("071599998888");
			user.setUborndate(new Date());
			user.setUillness("无");
			user.setHouseid((int) ((j % 4) + 2));
			user.setUserDescrib("无");
			user.setIshouseOwner(j % 4 == 0 ? true : false);
			userMapper.insert(user);
		}
		long et = System.currentTimeMillis();
		System.out.println("共花费了" + (et - st) + "毫秒");

	}

	@Test
	public void testUpdateById() throws Exception {
		long st = System.currentTimeMillis();
		for (int i = 4; i < 15003; i++) {
			User user = userMapper.selectById(i);
			user.setHouseid((int) (i / 4 + 1));
			userMapper.updateById(user);
		}
		long et = System.currentTimeMillis();
		System.out.println("共花費了:" + (et - st) + "毫秒");

		// 26885毫秒 修改15000/4條數據，7.17毫秒一个

	}

}
