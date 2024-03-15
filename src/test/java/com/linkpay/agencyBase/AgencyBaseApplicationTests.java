package com.linkpay.agencyBase;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.linkpay.agencyBase.mapper.CourseMapper;
import com.linkpay.agencyBase.model.Course;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class AgencyBaseApplicationTests {

	@Autowired
	private CourseMapper courseMapper;

	@Test
	void addCourse() {

		for( int i = 0; i < 10; i++) {
			Course course = new Course();
			course.setCname("uuu" + i);
			course.setUserId(100L + i);
			course.setCstatus("normal" + i);
			courseMapper.insert(course);
		}

	}

	@Test
	void findCourse() {

		QueryWrapper<Course> queryWrapper = new QueryWrapper<>();
		queryWrapper.eq("cid", 975412273713512448L);


		Course course = courseMapper.selectOne(queryWrapper);
		System.out.println(course);

	}


}
