package cn.scut.template.dao;

import cn.scut.template.entity.Student;import org.apache.ibatis.annotations.Param;import java.util.List;

/**
 * @Author: LiuChong
 * @Date: 2019/5/11 18:46
 * @Description:
 */
public interface StudentMapper {
	int insert(Student record);

	int insertSelective(Student record);

	Student findById(@Param("id") Integer id);

	List<Student> find();
}