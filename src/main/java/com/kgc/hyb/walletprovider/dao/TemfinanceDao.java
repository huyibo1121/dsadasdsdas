package com.kgc.hyb.walletprovider.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import wallet.bean.Temfinance;

/**
 * @author 胡怡博
 * @version 0.0.1
 * @Description 临时订单表
 * @date 2019/12/11 8:40
 */
@Mapper
public interface TemfinanceDao {

    /**
     * 临时订单表插入数据
     * @param temfinance
     * @return
     */
    public int addTemfinance(Temfinance temfinance);

    /**
     * 根据id删除临时订单
     * @param tid
     * @return
     */
    public int deleteTemfinanceById(@Param("tid") Integer tid);

    /**
     * 根据订单时间删除临时订单
     * @param ftime
     * @return
     */
    public int deleteTmfinanceByFtime(@Param("ftime") String ftime);

    /**
     * 根据id查询临时订单
     * @param tid
     * @return
     */
    public Temfinance queryTemfinanceById(@Param("tid") Integer tid);
}
