package com.lyf.service;

import com.lyf.common.ServerResponse;
import com.lyf.vo.CartVo;

/**
 * Created by Quincy.
 */
public interface ICartService {
    ServerResponse<CartVo> list (Integer userId);
    ServerResponse<CartVo> add(Integer userId,Integer productId,Integer count);
    ServerResponse<CartVo> update(Integer userId,Integer productId,Integer count);
    ServerResponse<CartVo> deleteProduct(Integer userId,String productIds);
    ServerResponse<CartVo> selectOrUnSelect (Integer userId,Integer productId,Integer checked);
    ServerResponse<Integer> getCartProductCount(Integer userId);
}
