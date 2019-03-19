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
	/**
	 * @Fields tables : 需生成文件对应的表名数组（按需更变）
	 */
	private static final String[] TABLE_NAMES = new String[] { "wo_close", "wo_detail" };

	/**
	 * @Fields tables : 生成文件所在包名（按需更变）
	 */
	private static final String PACKAGE_NAME = "com.timor";

	public static void main(String[] args)
	{
		// 代码生成器
		AutoGenerator mpg = new AutoGenerator();

		/*-- 全局配置 --*/
		GlobalConfig gc = new GlobalConfig();
		gc.setOutputDir("D://CodeGenerator//");
		gc.setAuthor("YuanZhe");
		mpg.setGlobalConfig(gc);

		/*-- 数据源配置 --*/
		// TODO 按需更变
		DataSourceConfig dsc = new DataSourceConfig();
		dsc.setUrl("");
		dsc.setDriverName("com.mysql.jdbc.Driver");
		dsc.setUsername("");
		dsc.setPassword("");
		mpg.setDataSource(dsc);

		/*-- 数据库表配置 --*/
		StrategyConfig strategy = new StrategyConfig();
		strategy.setNaming(NamingStrategy.underline_to_camel);
		strategy.setColumnNaming(NamingStrategy.underline_to_camel);
		strategy.setRestControllerStyle(true);
		strategy.setInclude(TABLE_NAMES);
		strategy.setControllerMappingHyphenStyle(true);
		mpg.setStrategy(strategy);

		/*-- 包配置 --*/
		PackageConfig pc = new PackageConfig();
		pc.setParent(PACKAGE_NAME);
		mpg.setPackageInfo(pc);

		/*-- 采用 Freemarker 模板引擎（默认 Velocity） --*/
		mpg.setTemplateEngine(new FreemarkerTemplateEngine());

		mpg.execute();// 执行
	}

}
