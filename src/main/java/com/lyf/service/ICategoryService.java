package com.lyf.service;

import com.lyf.common.ServerResponse;
import com.lyf.pojo.Category;

import java.util.List;

/**
 * Created by Quincy on 2018/3/14.
 */
public interface ICategoryService {

    ServerResponse addCategory(String categoryName, Integer parentId);
    ServerResponse updateCategoryName(Integer categoryId,String categoryName);
    ServerResponse<List<Category>> getChildrenParallelCategory(Integer categoryId);
    ServerResponse<List<Integer>> selectCategoryAndChildrenById(Integer categoryId);

}
