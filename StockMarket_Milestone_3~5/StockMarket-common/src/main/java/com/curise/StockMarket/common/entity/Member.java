package com.curise.StockMarket.common.entity;

import lombok.Data;

import java.util.Date;
import java.util.Set;

/**
 * 〈会员实体〉
 *
 * @author Sx
 * @create 2020/06/13
 * @since 1.0.0
 */
@Data
public class Member{

    private int id;
    private String memberName;
    private String password;
    private String mobile;
    private String email;
    private short sex;
    private Date birthday;
    private Date createTime;
    private Set<Role> roles;

}
