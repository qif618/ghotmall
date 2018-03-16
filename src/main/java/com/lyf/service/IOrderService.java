package com.lyf.service;

import com.lyf.common.ServerResponse;

/**
 * Created by Quincy.
 */
public interface IOrderService {
    ServerResponse pay(Long orderNo,Integer userId,String path);
}
