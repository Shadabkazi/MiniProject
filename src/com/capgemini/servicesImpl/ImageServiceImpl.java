package com.capgemini.servicesImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.daos.ImageDAO;
import com.capgemini.models.Image;
import com.capgemini.services.ImageService;
@Service
@Transactional
public class ImageServiceImpl implements ImageService {
	@Autowired
	private ImageDAO imageDao;

	@Override
	public List<Image> findAll() {
		// TODO Auto-generated method stub
		return imageDao.getAllImages();
	}

	@Override
	public Image findImageById(int imageId) {
		// TODO Auto-generated method stub
		return imageDao.getImageById(imageId);
	}

	@Override
	public void add(Image image) {
		// TODO Auto-generated method stub
		imageDao.insert(image);
		
	}

	@Override
	public void edit(Image image) {
		// TODO Auto-generated method stub
		imageDao.update(image);
	}

	@Override
	public void remove(Image image) {
		// TODO Auto-generated method stub
		imageDao.delete(image);
	}
	


}
