package com.elfop.blog.swaggershow.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @Description:
 * @author: liu zhenming
 * @version: V1.0
 * @date: 2019/8/2  11:46
 */
@Data
@Builder
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "Person对象")
public class Person {

    @ApiModelProperty("索引id")
    private int id;

    @ApiModelProperty(value = "用户姓名")
    private String name;

    @ApiModelProperty(value = "密码")
    private String pwd;

    @ApiModelProperty(value = "备注")
    private String remark;

    public Person(int id, String name, String pwd, String remark) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.remark = remark;
    }
}
