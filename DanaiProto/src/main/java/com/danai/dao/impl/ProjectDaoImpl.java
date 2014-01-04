package com.danai.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.danai.dao.ProjectDao;
import com.danai.model.Project;

@Repository
public class ProjectDaoImpl implements ProjectDao {
	
	@Autowired
	private SessionFactory session;

	@Transactional
	public void add(Project Project) {
		// TODO Auto-generated method stub
		session.getCurrentSession().save(Project);

	}

	@Transactional
	public void edit(Project Project) {
		// TODO Auto-generated method stub
		session.getCurrentSession().update(Project);

	}

	@Transactional
	public void delete(int ProjectId) {
		// TODO Auto-generated method stub
		session.getCurrentSession().delete(getProject(ProjectId));

	}

	@Transactional
	public Project getProject(int ProjectId) {
		// TODO Auto-generated method stub
		return (Project)session.getCurrentSession().get(Project.class, ProjectId);
	}

	@Transactional
	public List getAllProject() {
		// TODO Auto-generated method stub	
		return session.getCurrentSession().createQuery("from Project").list();
	}

}
