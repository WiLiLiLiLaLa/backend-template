package cn.scut.template.controller;

import cn.scut.template.entity.Student;
import cn.scut.template.response.BaseResult;
import cn.scut.template.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;

/**
 * @Author: LiuChong
 * @Date: 2019/5/11 18:04
 * @Description:
 */
@Api(value = "学生管理API")
@RestController
@RequestMapping("/student")
@Slf4j
public class StudentController {

	@Autowired
	private StudentService studentService;

	@ApiOperation(value = "增加学生信息", notes = "根据Student对象创建用户")
	@PostMapping("")
	public BaseResult add(@RequestBody Student student) {
		try {
			studentService.add(student);
			return BaseResult.success();
		} catch (Exception e) {
			log.error("增加学生信息失败!" + e.getMessage(), e);
			return BaseResult.failWithMsg("增加学生信息失败!");
		}
	}

	@ApiOperation(value = "获取学生信息", notes = "根据url的id来获取用户详细信息")
	@ApiImplicitParam(name = "id", value = "学生ID", required = true, dataType = "int", paramType = "path")
	@GetMapping("/{id}")
	public BaseResult<Student> getStudent(@PathVariable Integer id) {
		try {
			return BaseResult.successWithData(studentService.getById(id));
		} catch (Exception e) {
			log.error("获取学生信息失败!" + e.getMessage(), e);
			return BaseResult.failWithMsg("获取学生信息失败!");
		}
	}

	@ApiOperation(value = "获取所有学生信息", notes = "获取所有学生信息")
	@GetMapping("/all")
	public BaseResult<List<Student>> getStudent() {
		try {
			return BaseResult.successWithData(studentService.getAll());
		} catch (Exception e) {
			log.error("获取所有学生信息!" + e.getMessage(), e);
			return BaseResult.failWithMsg("获取所有学生信息!");
		}
	}
}
