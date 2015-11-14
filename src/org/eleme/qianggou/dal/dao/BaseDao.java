package org.eleme.qianggou.dal.dao;

import java.util.List;
import java.io.Serializable;

/**
 * Description: 实现基本的数据库查询接口
 * @author xuegang.xg xguestc@126.com
 * @version 1.0
 */
public interface BaseDao<T>
{
	// 根据ID加载实体
	T get(Class<T> entityClazz , Serializable id);
	// 保存实体
	Serializable save(T entity);
	// 更新实体
	void update(T entity);
	// 删除实体
	void delete(T entity);
	// 根据ID删除实体
	void delete(Class<T> entityClazz , Serializable id);
	// 获取所有实体
	List<T> findAll(Class<T> entityClazz);
	// 获取实体总数
	long findCount(Class<T> entityClazz);
}
