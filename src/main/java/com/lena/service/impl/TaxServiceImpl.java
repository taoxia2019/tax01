package com.lena.service.impl;

import com.lena.entity.Tax;
import com.lena.mapper.TaxMapper;
import com.lena.service.ITaxService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lena
 * @since 2019-03-08
 */
@Service
public class TaxServiceImpl extends ServiceImpl<TaxMapper, Tax> implements ITaxService {

}
