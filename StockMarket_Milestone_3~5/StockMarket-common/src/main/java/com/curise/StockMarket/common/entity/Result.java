package com.curise.StockMarket.common.entity;

import lombok.Data;

/**
 * 〈响应实体〉
 *
 * @author Sx
 * @create 2020/06/13
 * @since 1.0.0
 */
@Data
public class Result {

    private int code;
    private String message;
    private Object data;

}
