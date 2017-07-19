package cn.zhixing.service;

import java.util.List;

import cn.zhixing.pojo.BaseDict;
import cn.zhixing.pojo.Customer;
import cn.zhixing.pojo.QueryVo;

public interface CustomerService {

	public List<BaseDict> findDictByCode(String code);
	
	public List<Customer> findCustomerByVo(QueryVo vo);
	public Integer findCustomerByVoCount(QueryVo vo);
	
	public Customer findCustomerById(Long id);
	
	public void updateCustomerById(Customer customer);
	
	public void delCustomerById(Long id);
}
