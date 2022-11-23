package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Wmoney {


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long UserId;
	private Long money;

	public Long getUserId() {
		return UserId;
	}
	public void setUserId(Long userId) {
		this.UserId = userId;
	}
	public Long getMoney() {
		return money;
	}
	public void setMoney(Long money) {
		this.money = money;
	}
	public Wmoney() {}
	

public Wmoney(Long userId, Long money) {
	super();
	this.UserId = userId;
	this.money = money;
}
@Override
public String toString() {
	return "Wmoney [UserId=" + UserId + ", money=" + money + "]";
}

}