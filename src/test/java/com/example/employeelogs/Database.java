package com.example.employeelogs;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Database {
    @Test
    public void Database()  {
        Connection conn=null;
        try{
            // 加载驱动类
            Class.forName("com.mysql.cj.jdbc.Driver");
            long start =System.currentTimeMillis();
            // 建立连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/content_center?serverTimezone=UTC&nullCatalogMeansCurrent=true",
                    "root", "root");
            long end = System.currentTimeMillis();
            System.out.println(conn);
            System.out.println("建立连接耗时： " + (end - start) + "ms 毫秒");
        }catch (SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }

    }
}
