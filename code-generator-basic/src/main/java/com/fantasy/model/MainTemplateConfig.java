package com.fantasy.model;

import lombok.Data;

/**
 * 静态模版配置
 */
@Data
public class MainTemplateConfig {

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
