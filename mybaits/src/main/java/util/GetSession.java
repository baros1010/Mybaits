package util;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import bean.maptest;
import mybaits.test;

public class GetSession {
public static SqlSessionFactory getSession(){
	// TODO 自動生成されたメソッド・スタブ
	ClassLoader cl = test.class.getClassLoader();
	InputStream is ;
	
	if(cl!=null){
		is =cl.getResourceAsStream("conf.xml");
	}else{
		is=ClassLoader.getSystemResourceAsStream("conf.xml");
	}
	

	SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
	return sqlSessionFactory;
}
}
