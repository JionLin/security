package com.security.demo1.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.security.demo1.entity.Users;
import org.springframework.stereotype.Repository;

/**
 * @author johnny
 * @Classname UsersMapper
 * @Description
 * @Date 2022/5/1 23:04
 */
@Repository
public interface UsersMapper extends BaseMapper<Users> {
}
