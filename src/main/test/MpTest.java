import com.obtk.mp.mapper.EmployeeMapper;
import com.obtk.mp.po.Employee;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author 小麦爱吃草莓
 * @date 2020-12-25 15:47:57
 */
public class MpTest {
    private ApplicationContext ac =
            new ClassPathXmlApplicationContext("applicationContext.xml");

    private EmployeeMapper employeeMapper = ac.getBean("employeeMapper",EmployeeMapper.class);

    /**
     *  测试数据源
     */
    @Test
    public void dataResourceTest() throws SQLException {
        DataSource dataSource = ac.getBean("dataSource", DataSource.class);
        System.out.println(dataSource);

        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }

    /**
     * 通用 插入操作
     */
    @Test
    public void addEmployee(){
        Employee employee = new Employee();
        employee.setE_name("喵咪2");
        employee.setE_gender("女");
        employee.setE_age(21);
        int result = employeeMapper.insert(employee);
        System.out.println("result:"+result);
        System.out.println("hhahah");
    }


}
