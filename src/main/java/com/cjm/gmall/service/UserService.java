package com.cjm.gmall.service;

import java.util.List;

import com.cjm.gmall.bean.UserAddress;

/**
 * �û�����
 * @author �¼���
 *
 */
public interface UserService {
	
	/**
	 * �����û�id�������е��ջ���ַ
	 * @param userId
	 * @return
	 */
	public List<UserAddress> getUserAddressList(String userId);

}
