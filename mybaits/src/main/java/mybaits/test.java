package mybaits;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import bean.MyMapping;
import bean.maptest;
import bean.student;
import util.GetSession;

public class test {
	 
	// 使用类加载器加载mybatis的配置文件（它也加载关联的映射文件）
	private static GetSession sqlSessionFactorys;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		MyMapping mapper=null;
		SqlSessionFactory sqlSessionFactory=sqlSessionFactorys.getSession();
		
		
		SqlSession session = sqlSessionFactory.openSession();

		
		try {
			
			 mapper = session.getMapper(MyMapping.class);
			if(mapper==null){
				sqlSessionFactory.getConfiguration().addMapper(MyMapping.class);
			}
				
			
			String u = mapper.selectBlog("001");
			System.out.println(u);

		} finally {
			session.close();
			
		}
	}
}
