package com.elfop.blog.swaggershow.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @Description:
 * @author: liu zhenming
 * @version: V1.0
 * @date: 2019/8/2  14:32
 */
@Data
@Builder
@ApiModel(value = "分页数据", description = "分页数据统一返回对象")
public class PageVo<T> {

    @ApiModelProperty(value = "列表数据", dataType = "String", name = "values", example = "")
    private List<T> values;

    /**
     * 分页
     */
    @ApiModelProperty(value = "第几页", dataType = "int", name = "page", example = "1")
    private int page;
    /**
     * 分页值
     */
    @ApiModelProperty(value = "每页多少条", dataType = "int", name = "size", example = "10")
    private int size;
    /**
     * 一共查询了多少条数据
     */
    @ApiModelProperty(value = "一共查询了多少条数据(不需要传输 仅返回时展示使用)", dataType = "long", name = "total", notes = "不需要传输 仅返回时展示使用")
    private long total;


}