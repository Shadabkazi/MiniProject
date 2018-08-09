package com.capgemini.daos;

import java.util.List;

import com.capgemini.models.Image;

public interface ImageDAO {

List<Image> getAllImages();
	
	Image getImageById(int imageId);
	
	void insert(Image image);
	void update(Image image);
	void delete(Image image);

	

}
