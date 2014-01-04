package com.danai.service;

import java.util.List;

import com.danai.model.Location;

public interface LocationService {

	public void add(Location location);
	public void edit(Location location);
	public void delete(int locationId);
	public Location getLocation(int locationId);
	public List getAllLocation();

}


