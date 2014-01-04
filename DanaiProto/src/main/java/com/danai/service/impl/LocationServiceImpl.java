package com.danai.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.danai.dao.LocationDao;
import com.danai.model.Location;
import com.danai.service.LocationService;

public class LocationServiceImpl implements LocationService {

	@Autowired
	private LocationDao locationDao;
	
	@Override
	public void add(Location location) {
		// TODO Auto-generated method stub

	}

	@Override
	public void edit(Location location) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int locationId) {
		// TODO Auto-generated method stub

	}

	@Override
	public Location getLocation(int locationId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List getAllLocation() {
		// TODO Auto-generated method stub
		return null;
	}

}
