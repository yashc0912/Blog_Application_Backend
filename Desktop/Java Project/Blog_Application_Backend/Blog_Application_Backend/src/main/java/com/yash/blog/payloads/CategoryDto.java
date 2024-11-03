package com.yash.blog.payloads;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CategoryDto {

	
	private Integer categoryId;
	@NotBlank
	@Size(min = 4, message = "Min size of category title is 4")
	private String categoryTitle;
	
	@NotBlank
	@Size(max =10, message = "min size of category desc is 10")
	private String categoryDescription;
	
}
