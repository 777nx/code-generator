package com.fantasy.maker.model;

import lombok.Data;

/**
 * 动态模版配置
 */
@Data
public class DataModel {

    /**
     * 是否循环（开关）
     */
    private boolean loop;

    /**
     * 作者（字符串，填充值）
     */
    private String author = "Fantasy";

    /**
     * 输出信息
     */
    private String outputText = "输出结果";
}
