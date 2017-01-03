package junit.test;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.h.www.entity.House;
import com.h.www.service.HouseService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"claspath:spring-**.xml"})
public class HouseServiceImplTest {
	@Resource(name = "houseService")
	private HouseService houseService;
	
	@Test
	public void testInsert() {

	}

	@Test
	public void testDeleteById() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectById() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectHousePieChartData() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectCountAll() {
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

	@Test
	public void testSelectHouseIdByfour() throws Exception {
		House house=new House();
		houseService.selectHouseIdByfour(house);
	}

	@Test
	public void testSelectHouseByHouseId() {
		fail("Not yet implemented");
	}

}
