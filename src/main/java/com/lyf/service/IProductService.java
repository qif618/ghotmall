package com.lyf.service;

import com.github.pagehelper.PageInfo;
import com.lyf.common.ServerResponse;
import com.lyf.pojo.Product;
import com.lyf.vo.ProductDetailVo;

/**
 * Created by Quincy.
 */
public interface IProductService {
    ServerResponse saveOrUpdateProduct(Product product);
    ServerResponse<String> setSaleStatus(Integer productId,Integer status);
    ServerResponse<ProductDetailVo> manageProductDetail(Integer productId);
    ServerResponse<PageInfo> getProductList(int pageNum, int pageSize);
    ServerResponse<PageInfo> searchProduct(String productName,Integer productId,int pageNum,int pageSize);
}
