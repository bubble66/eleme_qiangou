package org.eleme.qianggou.dal.Do;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * foodDo
 * @author  xuegang.xg xguestc@126.com
 * @version  1.0
 */

@Entity
@Table(name="food")
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class FoodDo implements Serializable{
	
		private static final long serialVersionUID = 1L;

		@Id	@Column(name="id")
		private Integer id;

		@Column(name="stock")
		private Integer stock;
		// �Ƿ���
		@Column(name="price")
		private Integer price;


		//�޲����Ĺ�����
		public FoodDo()
		{
		}
		// ��ʼ��ȫ����Ա�����Ĺ�����
		public FoodDo(Integer id , Integer stock, Integer price)
		{
			this.id = id;
			this.stock = stock;
			this.price = price;
		}

		// id��setter��getter����
		public void setId(Integer id)
		{
			this.id = id;
		}
		public Integer getId()
		{
			return this.id;
		}
		public Integer getStock() {
			return stock;
		}
		public void setStock(Integer stock) {
			this.stock = stock;
		}
		public Integer getPrice() {
			return price;
		}
		public void setPrice(Integer price) {
			this.price = price;
		}

}
