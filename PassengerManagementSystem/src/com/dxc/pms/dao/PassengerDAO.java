package com.dxc.pms.dao;

import java.util.List;

import com.dxc.pms.model.Passenger;

public interface PassengerDAO {
	public Passenger getPassenger(int pnrNumber);
	public List<Passenger> getAllPassenger();
	public void addPassenger(Passenger passenger);
	public void deletePassenger(int pnrNumber);
	public void updatePassenger(Passenger passenger);
}
