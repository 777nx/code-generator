package com.fantasy.web.job;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class ClearCosJobHandlerTest {

    @Resource
    private ClearCosJobHandler clearCosJobHandler;

    @Test
    void clearCosJobHandler() throws Exception {
        clearCosJobHandler.clearCosJobHandler();
    }
}
