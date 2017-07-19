package cn.zhixing.dao;

import java.util.List;

import cn.zhixing.pojo.BaseDict;

public interface DictMapper {

	
	public List<BaseDict> findDictByCode(String code);
}
