package com.dxc.pms.dao;

import java.util.ArrayList;
import java.util.List;

import com.dxc.pms.model.Passenger;

public class PassengerDAOImpl implements PassengerDAO {
	
	List<Passenger> allPassenger=new ArrayList<Passenger>();

	@Override
	public Passenger getPassenger(int pnrNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Passenger> getAllPassenger() {
		
		return allPassenger;
	}

	@Override
	public void addPassenger(Passenger passenger) {
		allPassenger.add(passenger);

	}

	@Override
	public void deletePassenger(int pnrNumber) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updatePassenger(Passenger passenger) {
		// TODO Auto-generated method stub

	}

}
