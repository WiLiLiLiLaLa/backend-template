package cn.scut.template.service;

import cn.scut.template.entity.Student;

import java.util.List;

/**
 * @Author: LiuChong
 * @Date: 2019/5/11 18:00
 * @Description:
 */
public interface StudentService {

	void add(Student student);

	Student getById(Integer id);

	List<Student> getAll();
}
