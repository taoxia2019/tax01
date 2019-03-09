package com.lena.service.impl;

import com.lena.entity.Dept;
import com.lena.mapper.DeptMapper;
import com.lena.service.IDeptService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
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
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept> implements IDeptService {

}
