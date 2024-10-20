package com.yash.blog.services;

import java.util.List;
import com.yash.blog.payloads.CategoryDto;



public interface CategoryService {
	
	//create
	
	 CategoryDto createCategory(CategoryDto categoryDto);
	
	//update
	CategoryDto updateCategory(CategoryDto categoryDto, Integer categorytId);
	
	//delete
	
	void deleteCategory(Integer categoryId);
	
	//get
	
	CategoryDto getCategory(Integer categoryId);
	
	//getAll
	
	List<CategoryDto> getCategories();

}
