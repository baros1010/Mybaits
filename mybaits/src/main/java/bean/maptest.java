package bean;

import java.util.List;

public interface maptest {
 student getuser(String id);
 List<student> getUsers();
 int addSutdent(student s);
 int updateStudent(student s);
 int deleteStudent(String id);
}
