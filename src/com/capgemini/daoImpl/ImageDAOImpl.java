package com.capgemini.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.capgemini.daos.ImageDAO;
import com.capgemini.models.Image;
@Repository
public class ImageDAOImpl implements ImageDAO{
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public List<Image> getAllImages() {
		// TODO Auto-generated method stub
		return (List<Image>) hibernateTemplate.find("from Image");
	}

	@Override
	public Image getImageById(int image_id) {
		// TODO Auto-generated method stub
		return hibernateTemplate.get(Image.class, image_id);
	}

	@Override
	public void insert(Image image) {
		// TODO Auto-generated method stub
		hibernateTemplate.save(image);
	}

	@Override
	public void update(Image image) {
		// TODO Auto-generated method stub
		hibernateTemplate.update(image);
	}

	@Override
	public void delete(Image image) {
		// TODO Auto-generated method stub
		hibernateTemplate.delete(image);
		
	}
	
	
}