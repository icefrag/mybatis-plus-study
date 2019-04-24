package com.wurui.demomybatisplusstudy;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wurui.demomybatisplusstudy.sys.entity.User;
import com.wurui.demomybatisplusstudy.sys.mapper.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemomybatisPlusStudyApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	private UserMapper userMapper;

	@Test
	public void testSelect() {
		System.out.println(("----- selectAll method test ------"));
		List<User> userList = userMapper.selectList(null);
		Assert.assertEquals(5, userList.size());
		userList.forEach(System.out::println);

		Page page = new Page();
		page.setSize(2);
		page.setCurrent(1);
		System.out.println(userMapper.selectPage(page));
	}

}
