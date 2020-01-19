package com.messiyang.aliwxplaydemo.service.impl;


import com.messiyang.aliwxplaydemo.mapper.ProductMapper;
import com.messiyang.aliwxplaydemo.pojo.Product;
import com.messiyang.aliwxplaydemo.pojo.ProductExample;
import com.messiyang.aliwxplaydemo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductMapper productMapper;
	
	@Override
	public List<Product> getProducts() {
		
		ProductExample pe = new ProductExample();
//		Criteria pc = pe.createCriteria();
		List<Product> list = productMapper.selectByExample(pe);
		
		return list;
	}

	@Override
	public Product getProductById(String productId) {
		
		return productMapper.selectByPrimaryKey(productId);
	}

}
