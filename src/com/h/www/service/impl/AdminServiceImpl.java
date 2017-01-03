package com.h.www.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.h.www.dao.AdminMapper;
import com.h.www.dao.FunctionMapper;
import com.h.www.entity.Admin;
import com.h.www.entity.Function;
import com.h.www.service.AdminService;

@Service("adminService")
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminMapper adminMapper;
	@Autowired
	private FunctionMapper functionMapper;
	
	/**
	 * 插入數據
	 * @param entity
	 * @return
	 * @throws Exception 
	 */
	@Override
	public int insert(Admin entity) throws Exception {
		return adminMapper.insert(entity);
	}

	/**
	 * 根據id進行刪除
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@Override
	public int deleteById(int id) throws Exception {
		// TODO Auto-generated method stub
		return adminMapper.deleteById(id);
	}

	/**
	 * 進行更新
	 * @param entity
	 * @return
	 * @throws Exception 
	 */
	@Override
	public int update(Admin entity) throws Exception {
		// TODO Auto-generated method stub
		return adminMapper.update(entity);
	}

	/**
	 * 根據id來查詢具體數據
	 * @param uid
	 * @return
	 * @throws Exception
	 */
	@Override
	public Admin selectById(int uid) throws Exception {
		// TODO Auto-generated method stub
		return adminMapper.selectById(uid);
	}

	/**
	 * 根據Id來查詢用戶是否存在，存在則返回具體數據，不存在則返回空值
	 * @param uid
	 * @return
	 * @throws Exception 
	 */
	@Override
	public Admin selectCompleteInfo(int uid) throws Exception {
		if (adminMapper.selectById(uid) != null) {
			// 1.首先將Admin和Group表中的數據填充到admin中
			Admin admin = adminMapper.selectAdminAndGroupByAdminId(uid);

			// 2.将Function表中的数据填充到admin中
			// 2.1将functionid转换成String[]
			String strFunctionId = admin.getGroup().getFunctionId();
			String[] functionArr = strFunctionId.split(",");
			// 2.2获取List<Funtion>
			List<Function> funlist = functionMapper
					.selectFunctionListByFunctionId(functionArr);
			// 2.3填充List<function>
			admin.setFunlist(funlist);
			// 返回admin
			return admin;
		}
		return null;
	}

	/**
	 * @param name：用户名
	 * @param pwd:密码
	 * @throws Exception 
	 * @return返回Admin或者null
	 */
	@Override
	public Admin selectByNameAndPassword(String name, String pwd) throws Exception {
		return adminMapper.selectByNameAndPwd(name, pwd);
	}

	@Override
	public int updateLoginTimeAndLoginIp(Admin admin) {
		return adminMapper.updateLoginTimeAndLoginIp(admin);
	}
	

}
