package com.fantasy.maker;

// import com.fantasy.maker.cli.CommandExecutor;

import com.fantasy.maker.generator.main.GenerateTemplate;
import com.fantasy.maker.generator.main.MainGenerator;
import com.fantasy.maker.generator.main.ZipGenerator;
import freemarker.template.TemplateException;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws TemplateException, IOException, InterruptedException {
//        GenerateTemplate generateTemplate = new MainGenerator();
        GenerateTemplate generateTemplate = new ZipGenerator();
        generateTemplate.doGenerate();
    }
}
