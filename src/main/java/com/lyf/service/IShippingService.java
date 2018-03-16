package com.lyf.service;

import com.github.pagehelper.PageInfo;
import com.lyf.common.ServerResponse;
import com.lyf.pojo.Shipping;

/**
 * Created by Quincy.
 */
public interface IShippingService {
    ServerResponse add(Integer id, Shipping shipping);

    ServerResponse delete(Integer id, Integer shippingId);

    ServerResponse update(Integer userId, Shipping shipping);

    ServerResponse<Shipping> select(Integer id, Integer shippingId);

    ServerResponse<PageInfo> list(Integer userId, int pageNum, int pageSize);
}
