package com.gss.test5.DAO;

import com.gss.test5.Student;
import com.gss.test5.StudentMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class StudentJDBCTemplate implements StudentDAO {

//    private static String SQL_INSERT = "INSERT INTO test5.student (NAME, AGE) VALUES (?, ?)";
//    private static String SQL_SELECT_WHERE_ID = "SELECT * FROM Student WHERE id = ?";
//    private static String SQL_SELECT = "SELECT * FROM Student";
//    private static String SQL_DELETE = "DELETE FROM Student WHERE id = ?";
//    private static String SQL_UPDATE = "UPDATE Student SET age = ? WHERE id = ?";
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;
    private static String SQL_INSERT;
    private static String SQL_SELECT_WHERE_ID;
    private static String SQL_SELECT;
    private static String SQL_DELETE;
    private static String SQL_UPDATE;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }

    public void create(String name, Integer age) {
        System.out.println("create: "+ SQL_INSERT);
        jdbcTemplateObject.update(SQL_INSERT, name, age);
        System.out.println("Created Record Name = " + name + " Age = " + age);
    }

    public Student getStudent(Integer id) {
        return jdbcTemplateObject.queryForObject(SQL_SELECT_WHERE_ID,
                new Object[]{id}, new StudentMapper());
    }

    public List<Student> listStudents() {
        return jdbcTemplateObject.query(SQL_SELECT,
                new StudentMapper());
    }

    public void delete(Integer id) {
        jdbcTemplateObject.update(SQL_DELETE, id);
        System.out.println("Deleted Record with ID = " + id);
    }

    public void update(Integer id, Integer age) {
        jdbcTemplateObject.update(SQL_UPDATE, age, id);
        System.out.println("Updated Record with ID = " + id);
    }

    public void setSQL_INSERT(String SQL_INSERT) {
        StudentJDBCTemplate.SQL_INSERT = SQL_INSERT;
    }

    public String getSQL_INSERT() {
        return SQL_INSERT;
    }

    public void setSQL_SELECT_WHERE_ID(String SQL_SELECT_WHERE_ID) {
        StudentJDBCTemplate.SQL_SELECT_WHERE_ID = SQL_SELECT_WHERE_ID;
    }

    public String getSQL_SELECT_WHERE_ID() {
        return SQL_SELECT_WHERE_ID;
    }

    public void setSQL_SELECT(String SQL_SELECT) {
        StudentJDBCTemplate.SQL_SELECT = SQL_SELECT;
    }

    public String getSQL_SELECT() {
        return SQL_SELECT;
    }

    public void setSQL_DELETE(String SQL_SELECT) {
        SQL_DELETE = SQL_DELETE;
    }

    public String getSQL_DELETE() {
        return SQL_DELETE;
    }

    public void setSQL_UPDATE(String SQL_UPDATE) {
        StudentJDBCTemplate.SQL_UPDATE = SQL_UPDATE;
    }

    public String getSQL_UPDATE() {
        return SQL_UPDATE;
    }
}
