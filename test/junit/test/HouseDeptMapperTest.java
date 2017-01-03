package junit.test;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.h.www.dao.HouseDeptMapper;
import com.h.www.entity.HouseDept;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring-dao.xml"})
public class HouseDeptMapperTest {
	@Autowired
	private HouseDeptMapper houseDeptMapper;

	@Test
	public void testInsert() throws Exception {
		long st = System.currentTimeMillis();
		HouseDept dept = new HouseDept();
		for (int i = 0; i < 3189; i++) {
			dept.setHouseid((i + 3));
			dept.setDebt((double) i);
			houseDeptMapper.insert(dept);
		}
		long et = System.currentTimeMillis();
		System.out.println("共花费了:" + (et - st) + "毫秒");
		
	}

	@Test
	public void testInsertSelective() {
		fail("Not yet implemented");
	}
	@Test
	public void testUpdateHouseeptByHouseId() throws Exception{
		HouseDept dept=new HouseDept();
		dept.setDebt(100.00);
		dept.setHouseid(1);
		houseDeptMapper.updateHousedeptByHouseId(dept);
	}

}
