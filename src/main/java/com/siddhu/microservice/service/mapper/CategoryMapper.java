package com.siddhu.microservice.service.mapper;

import com.siddhu.microservice.domain.Category;
import com.siddhu.microservice.service.dto.CategoryDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Category} and its DTO {@link CategoryDTO}.
 */
@Mapper(componentModel = "spring")
public interface CategoryMapper extends EntityMapper<CategoryDTO, Category> {}
