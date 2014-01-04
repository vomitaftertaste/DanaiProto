package com.danai.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.danai.dao.LocationDao;
import com.danai.model.Location;

public class LocationDaoImpl implements LocationDao {
	
	@Autowired
	private SessionFactory session;

	@Override
	public void add(Location location) {
		// TODO Auto-generated method stub
		session.getCurrentSession().save(location);

	}

	@Override
	public void edit(Location location) {
		// TODO Auto-generated method stub
		session.getCurrentSession().update(location);

	}

	@Override
	public void delete(int locationId) {
		// TODO Auto-generated method stub
		session.getCurrentSession().delete(getLocation(locationId));

	}

	@Override
	public Location getLocation(int locationId) {
		// TODO Auto-generated method stub
		return (Location)session.getCurrentSession().get(Location.class, locationId);
	}

	@Override
	public List getAllLocation() {
		// TODO Auto-generated method stub
		return session.getCurrentSession().createQuery("from Location").list();
	}

}
