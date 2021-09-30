package com.jimmy;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.querys.MySqlQuery;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import com.baomidou.mybatisplus.generator.fill.Column;
import com.baomidou.mybatisplus.generator.fill.Property;
import com.baomidou.mybatisplus.generator.keywords.MySqlKeyWordsHandler;
import com.jimmy.base.BaseController;
import com.jimmy.base.BaseEntity;

/**
 * @Description
 * @Author zhangguoq
 **/
public class GeneratorDemo {
    public static void main(String[] args) {
        DataSourceConfig.Builder dataBuilder = new DataSourceConfig.Builder("jdbc:mysql://localhost:3306/project?zeroDateTimeBehavior=convertToNull&useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC&autoReconnect=true", "root", "Root-1234")
                .dbQuery(new MySqlQuery())
                .typeConvert(new MySqlTypeConvert())
                .keyWordsHandler(new MySqlKeyWordsHandler());

        FastAutoGenerator.create(dataBuilder)
                .globalConfig(builder -> {
                    // 设置作者
                    builder.author("jimmy")
                            // 禁止打开目录
                            .disableOpenDir()
                            // 自定义路径
                            .outputDir("/Users/jimmy/study/project/generator/src/main/java/")
                            // 覆盖已生成文件
                            .fileOverride();
                })
                // 设置父包名
                .packageConfig(builder -> builder.parent("com.jimmy")
                        .controller("saas.web.controller")
                        .service("paas.account.service")
                        .serviceImpl("paas.account.service.impl")
                        .mapper("paas.account.dao")
                        .entity("paas.account.entity")
                        .xml("paas.account.dao.xml"))
                .strategyConfig(builder -> builder
                        .addTablePrefix("ac_")
                        // controller
                        .controllerBuilder()
                        .superClass(BaseController.class)
                        .enableHyphenStyle()
                        .enableRestStyle()
                        .formatFileName("%sAction")
                        // service
                        .serviceBuilder()
                        .formatServiceFileName("%sService")
                        .formatServiceImplFileName("%sServiceImpl")
                        //mapper
                        .mapperBuilder()
                        .enableMapperAnnotation()
                        .enableBaseResultMap()
                        .enableBaseColumnList()
                        .formatMapperFileName("%sDao")
                        .formatXmlFileName("%sXml")
                        // entity
                        .entityBuilder()
                        .superClass(BaseEntity.class)
                        .disableSerialVersionUID()
                        .enableColumnConstant()
                        .enableChainModel()
                        .enableLombok()
                        .enableRemoveIsPrefix()
                        .enableTableFieldAnnotation()
                        .versionColumnName("version")
                        .versionPropertyName("version")
                        .logicDeleteColumnName("deleted")
                        .logicDeletePropertyName("deleted")
                        .addTableFills(new Column("create_time", FieldFill.INSERT))
                        .addTableFills(new Property("updateTime", FieldFill.INSERT_UPDATE))
                        .idType(IdType.AUTO)
                        .formatFileName("%sEntity")
                        .build())
                // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .templateEngine(new FreemarkerTemplateEngine())
                .execute();
    }
}