package com.example.demo.modal;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity

public class Wmoney implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long walletId;
	private Long money;

	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
	
	public Wmoney(Long walletId, Long money, User user) {
		super();
		this.walletId = walletId;
		this.money = money;
		this.user = user;
	}
	public Long getWalletId() {
		return walletId;
	}
	public void setWalletId(Long walletId) {
		this.walletId = walletId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Long getUserId() {
		return walletId;
	}
	public void setUserId(Long walletId) {
		this.walletId = walletId;
	}
	public Long getMoney() {
		return money;
	}
	public void setMoney(Long money) {
		this.money = money;
	}
	
	public Wmoney() {}
	

public Wmoney(Long walletId, Long money) {
	super();
	this.walletId = walletId;
	this.money = money;
}
@Override
public String toString() {
	return "Wmoney [walletId=" + walletId + ", money=" + money + "]";
}

}