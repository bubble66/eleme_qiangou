package org.eleme.qianggou.dal.Do;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * CartsDo
 * 存放购物车信息
 * @author xuegang.xg xguestc@126.com
 * @version 1.0
 */

@Entity
@Table(name = "carts")
public class CartsDo  implements Serializable {

	private static final long serialVersionUID = 4L;

	@Id
	@Column(name = "cart_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer cartId;

	@Column(name = "token_id")
	private Integer tokenId;

	@Column(name = "item_id")
	private Integer itemId;
	
	@Column(name = "price")
	private Integer price;
	
	@Column(name = "count")
	private Integer count;

	// 无参数的构造器
	public CartsDo() {
	}

	// 初始化全部成员变量的构造器
	public CartsDo(Integer userId, Integer tokenId, Integer itemId, Integer price, Integer count) {
		this.tokenId = tokenId;
		this.itemId = itemId;
		this.price = price;
		this.count = count;
	}

	public Integer getCartId() {
		return cartId;
	}

	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}

	public Integer getTokenId() {
		return tokenId;
	}

	public void setTokenId(Integer tokenId) {
		this.tokenId = tokenId;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}
	
}
