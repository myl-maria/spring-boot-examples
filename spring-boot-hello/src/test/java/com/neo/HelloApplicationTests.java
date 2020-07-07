package com.neo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloApplicationTests {

	@Test
	public void contextLoads() {
		System.out.println("Hello Spring Boot 2.0!");
	}

	@Test
    public void test(){
	    List<String> list = new ArrayList();
	    list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");

        for(String str : list){
            System.out.println(str);
            if(str.equals("222")){
                list.add(1,"555");
            }
        }

    }

    @Test
    public void test1() {
        Map<Integer, String> map = new HashMap();
        map.put(1,"111");
        map.put(2, "222");
        map.put(3, "333");
        map.put(4, "444");

        for (String str : map.values()) {
            System.out.println(str);
            if (str.equals("222")) {
                map.put(5, "555");
            }
        }

    }

}
