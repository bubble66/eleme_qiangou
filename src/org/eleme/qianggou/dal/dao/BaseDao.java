package org.eleme.qianggou.dal.dao;

import java.util.List;
import java.io.Serializable;

/**
 * Description: ʵ�ֻ��������ݿ��ѯ�ӿ�
 * @author xuegang.xg xguestc@126.com
 * @version 1.0
 */
public interface BaseDao<T>
{
	// ����ID����ʵ��
	T get(Class<T> entityClazz , Serializable id);
	// ����ʵ��
	Serializable save(T entity);
	// ����ʵ��
	void update(T entity);
	// ɾ��ʵ��
	void delete(T entity);
	// ����IDɾ��ʵ��
	void delete(Class<T> entityClazz , Serializable id);
	// ��ȡ����ʵ��
	List<T> findAll(Class<T> entityClazz);
	// ��ȡʵ������
	long findCount(Class<T> entityClazz);
}
