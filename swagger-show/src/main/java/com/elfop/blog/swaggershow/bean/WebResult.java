package com.elfop.blog.swaggershow.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @Description: 统一的数据返回对象
 * @author: liu zhenming
 * @version: V1.0
 * @date: 2019/7/9  10:12
 */
@Data
@Builder
@ApiModel(value = "统一数据返回对象", description = "所有数据经此包装")
public class WebResult implements Serializable {

    public static final String REQUEST_STATUS_ERROR = "error";
    public static final String REQUEST_STATUS_SUCCESS = "success";
    private static final long serialVersionUID = 1L;
    /**
     * 状态码
     */
    @ApiModelProperty(required = true, value = "返回状态码", dataType = "int", example = "200", position = 0)
    private int code;
    /**
     * 返回数据
     */
    @ApiModelProperty(required = true, value = "返回数据", dataType = "string", example = "data", position = 1)
    private Object data;
    /**
     * msg信息
     */
    @ApiModelProperty(required = true, value = "返回message 信息", dataType = "string", example = "success", position = 2)
    private String message;


}
