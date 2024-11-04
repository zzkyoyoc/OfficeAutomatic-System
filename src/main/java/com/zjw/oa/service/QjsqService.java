package com.zjw.oa.service;



import com.zjw.oa.entity.Qjsq;

import java.util.List;

/**
 * Description 请假
 *
 * @author dddz97
 * @date 2019-03-21 10:47:26
 */
public interface QjsqService {

    Integer addQjsq(Qjsq qjsq);

    List<Qjsq> getQjList(Qjsq qjsq);

    Qjsq getQj(Qjsq qjsq);

    void agreeQj(Qjsq qjsq) throws Exception;

}
