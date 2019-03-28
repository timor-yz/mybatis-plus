package com.timor.mybatisplus.generator;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

/**
 * @Description Mybatis Plus Generator
 * @author YuanZhe
 * @date 2019年3月19日 下午3:51:59
 * 
 */
public class CodeGenerator
{

	public static void main(String[] args)
	{
		// 代码生成器
		AutoGenerator mpg = new AutoGenerator();

		/*-- 全局配置 --*/
		GlobalConfig gc = new GlobalConfig();
		gc.setOutputDir(ConfigInfo.OUTPUT_DIR);
		gc.setAuthor(ConfigInfo.AUTHOR);
		mpg.setGlobalConfig(gc);

		/*-- 数据源配置 --*/
		DataSourceConfig dsc = new DataSourceConfig();
		dsc.setUrl(ConfigInfo.URL);
		dsc.setDriverName(ConfigInfo.DRIVER_NAME);
		dsc.setUsername(ConfigInfo.USERNAME);
		dsc.setPassword(ConfigInfo.PASSWORD);
		mpg.setDataSource(dsc);

		/*-- 数据库表配置 --*/
		StrategyConfig strategy = new StrategyConfig();
		strategy.setNaming(NamingStrategy.underline_to_camel);
		strategy.setColumnNaming(NamingStrategy.underline_to_camel);
		strategy.setRestControllerStyle(true);
		strategy.setInclude(ConfigInfo.TABLE_NAMES);
		strategy.setControllerMappingHyphenStyle(true);
		mpg.setStrategy(strategy);

		/*-- 包配置 --*/
		PackageConfig pc = new PackageConfig();
		pc.setParent(ConfigInfo.PACKAGE_NAME);
		mpg.setPackageInfo(pc);

		/*-- 采用 Freemarker 模板引擎（默认 Velocity） --*/
		mpg.setTemplateEngine(new FreemarkerTemplateEngine());

		mpg.execute();// 执行
	}

}
