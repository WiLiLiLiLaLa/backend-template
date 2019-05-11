package cn.scut.template.service.impl;

import cn.scut.template.dao.StudentMapper;
import cn.scut.template.entity.Student;
import cn.scut.template.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
 * @Author: LiuChong
 * @Date: 2019/5/11 18:00
 * @Description:
 */
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentMapper studentMapper;

	@Override
	@Transactional
	public void add(Student student) {
		studentMapper.insert(student);
	}

	@Override
	public Student getById(Integer id) {
		return studentMapper.findById(id);
	}

	@Override
	public List<Student> getAll() {
		return studentMapper.find();
	}
}
