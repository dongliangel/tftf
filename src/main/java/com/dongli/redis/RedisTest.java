package com.dongli.redis;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.asm.Type;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:Redis.xml")
public class RedisTest {

	 @Autowired
	 RedisTemplate redisTemplate;
	 
	 @Test
	 public void testRedis() {
//		 redisTemplate.opsForValue().set("spring","hello reids");
//		 redisTemplate.opsForValue().append("spring","i am a cooler");
//		 String va = redisTemplate.opsForValue().get("spring");
//		 System.out.println(va);
               ArrayList<User> list = new ArrayList<User>();	
                    User u1=new User("zcb","123");
                    User u2=new User("zzk","123");
                    User u3=new User("zy","123");
                    User u4=new User("wf","123");
                    list.add(u1);
                    list.add(u2);
                    list.add(u3);
                    list.add(u4);
                   User array[] =new User[list.size()];
		            redisTemplate.opsForList().leftPush("user1",list);
	 }
	
}
