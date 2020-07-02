package com.curise.StockMarket.auth.dao;

import com.curise.StockMarket.common.entity.Permission;

import java.util.List;

/**
 * 〈权限Dao〉
 *
 * @author Sx
 * @create 2020/06/13
 * @since 1.0.0
 */
public interface PermissionDao {

    /**
     * 根据角色id查找权限列表
     * @param roleId 角色id
     * @return 权限列表
     */
    List<Permission> findByRoleId(Integer roleId);
}
