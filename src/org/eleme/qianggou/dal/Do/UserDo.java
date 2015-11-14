package org.eleme.qianggou.dal.Do;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * UserDo
 * 
 * @author xuegang.xg xguestc@126.com
 * @version 1.0
 */

@Entity
@Table(name = "user")
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class UserDo implements Serializable {

	private static final long serialVersionUID = 2L;

	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "name")
	private String name;

	@Column(name = "password")
	private String password;

	// 无参数的构造器
	public UserDo() {
	}

	// 初始化全部成员变量的构造器
	public UserDo(Integer id, String name, String password) {
		this.id = id;
		this.name = name;
		this.password = password;
	}

	// id的setter和getter方法
	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return this.id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
