package com.fantasy.maker.meta;

import cn.hutool.core.io.resource.ResourceUtil;
import cn.hutool.json.JSONUtil;

public class MetaManager {

    private static volatile Meta meta;

    public static Meta getMetaObject() {
        if (meta == null) {
            synchronized (MetaManager.class) {
                if (meta == null) {
                    return initMeta();
                }
            }
        }
        return meta;
    }

    public static Meta initMeta() {
//        String metaJson = ResourceUtil.readUtf8Str("meta.json");
        String metaJson = ResourceUtil.readUtf8Str("springboot-init-meta.json");
        Meta newMata = JSONUtil.toBean(metaJson, Meta.class);
        // 校验配置文件，处理默认值
        MetaValidator.doValidAndFill(newMata);
        return newMata;
    }
}
