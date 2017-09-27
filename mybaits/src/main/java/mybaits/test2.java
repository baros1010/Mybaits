package mybaits;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import bean.maptest;
import bean.student;
import util.GetSession;

public class test2 {

	private static GetSession sqlSessionFactorys;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		maptest mapper = null;
		SqlSessionFactory sqlSessionFactory = sqlSessionFactorys.getSession();

		SqlSession session = sqlSessionFactory.openSession();
		try {
			mapper = session.getMapper(maptest.class);
			if (mapper == null) {
				sqlSessionFactory.getConfiguration().addMapper(maptest.class);
			}
			//
//			student u = mapper.getuser("001");
//			System.out.println(u);
//
//			List<student> users = mapper.getUsers();
//			System.out.println(users);
//
//			student s = new student();
//			s.setId("1221");
//			s.setName("kaouri");
//			s.setTel("1212344");
//			int i = mapper.addSutdent(s);
//			System.out.println(i);
//			session.commit();
//
//			student s1 = new student();
//			s1.setId("1221");
//			s1.setName("firas");
//			s1.setTel("99999");
//			int j = mapper.updateStudent(s1);
//			System.out.println(j);
//			session.commit();

			int k =mapper.deleteStudent("123");
			session.commit();
		} finally {
			session.close();

		}

	}
}
