package com.ims.repository;

import com.ims.entity.CategoryEntity;
import com.ims.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {
    List<CategoryEntity> findAllByCategoryNameContaining(String categoryName);
    List<CategoryEntity> findAllByMerchantId(Long merchant);
}
