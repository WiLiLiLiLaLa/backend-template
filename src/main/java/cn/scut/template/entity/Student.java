package cn.scut.template.entity;

import java.util.Date;
import lombok.Data;

/**
 * @Author: LiuChong
 * @Date: 2019/5/11 18:46
 * @Description:
 */
@Data
public class Student {
	private Integer id;

	private String name;

	private Date birthday;

	private Integer age;
}