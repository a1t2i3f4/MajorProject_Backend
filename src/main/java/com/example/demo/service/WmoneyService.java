package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modal.Wmoney;
import com.example.demo.repo.WmoneyRepository;


@Service
public class WmoneyService {
	@Autowired
	private WmoneyRepository repo;


	public Wmoney getWmoneyById(Long id) {
		try {
			Wmoney wmoney = this.repo.findById(id).get();
			return wmoney;
		} catch (Exception e) {
			return null;
		}
	}

	public List<Wmoney> getAllWmoney() {
		return  (List<Wmoney>) this.repo.findAll();
	}

	public Wmoney addMoney(Wmoney wmoney) {
		this.repo.save(wmoney);
		return wmoney;
	}

	public void updateWmoney(Long eId, Wmoney emp) {
		try {
			Wmoney wmoney = repo.findById(eId).get();
			wmoney.setUserId(emp.getUserId());
			wmoney.setMoney(emp.getMoney());

			repo.save(wmoney);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
