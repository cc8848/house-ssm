package junit.test;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.h.www.dao.HouseMapper;
import com.h.www.entity.House;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-dao.xml")
public class HouseMapperTest {
	@Autowired
	private HouseMapper houseMapper;

	@Test
	public void testDeleteById() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsert() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectByHouseId() throws Exception {
		House house = new House();
		house.setHousezorn(1);
		house.setHousebuilding(1);
		house.setHouselevel(1);
		house.setHouseroomnum(1);
		System.out.println(houseMapper.selectHouseIdByFour(house));
	}

	@Test
	public void testSelectAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateById() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectSellPercent() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectUnSellPercent() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectCountAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectHouseIdByFour() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateHouseSetHouseNotEmpty() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateHouseSetHouseEmpty() {
		fail("Not yet implemented");
	}

}
