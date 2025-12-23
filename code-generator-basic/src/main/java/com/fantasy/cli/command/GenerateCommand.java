package com.fantasy.cli.command;

import cn.hutool.core.bean.BeanUtil;
import com.fantasy.generator.MainGenerator;
import com.fantasy.model.MainTemplateConfig;
import lombok.Data;
import picocli.CommandLine;

import java.util.concurrent.Callable;

@CommandLine.Command(name = "generate", mixinStandardHelpOptions = true)
@Data
public class GenerateCommand implements Callable {

    /**
     * 是否生成循环
     */
    @CommandLine.Option(names = {"-l", "--loop"}, description = "是否循环", arity = "0..1", interactive = true, echo = true)
    private boolean loop;

    /**
     * 作者注释
     */
    @CommandLine.Option(names = {"-a", "--author"}, description = "作者名称", arity = "0..1", interactive = true, echo = true)
    private String author = "Fantasy";

    /**
     * 输出信息
     */
    @CommandLine.Option(names = {"-o", "--outputText"}, description = "输出文本", arity = "0..1", interactive = true, echo = true)
    private String outputText = "sum = ";


    @Override
    public Object call() throws Exception {
        MainTemplateConfig mainTemplateConfig = new MainTemplateConfig();
        BeanUtil.copyProperties(this, mainTemplateConfig);
        MainGenerator.doGenerate(mainTemplateConfig);
        return 0;
    }
}
