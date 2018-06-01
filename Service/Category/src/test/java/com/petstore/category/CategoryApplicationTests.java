package com.petstore.category;

import com.petstore.category.domain.Category;
import com.petstore.category.repository.CategoryRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = CategoryApplication.class)
@WebAppConfiguration
public class CategoryApplicationTests {

	@Autowired
	private CategoryRepository categoryRepository;

	@Test
	public void init() {
		Category c = new Category();
		categoryRepository.insert(c);
	}

}
