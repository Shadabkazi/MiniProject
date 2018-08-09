package com.capgemini.services;

import java.util.List;

import com.capgemini.models.Image;

public interface ImageService {

List<Image> findAll();
	
Image findImageById(int imageId);
	
	void add(Image image);
	void edit(Image image);
	void remove(Image image);
	
}