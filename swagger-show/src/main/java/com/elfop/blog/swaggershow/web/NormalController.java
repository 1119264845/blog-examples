package com.elfop.blog.swaggershow.web;

import com.elfop.blog.swaggershow.bean.PageVo;
import com.elfop.blog.swaggershow.bean.Person;
import com.elfop.blog.swaggershow.bean.WebProResult;
import com.elfop.blog.swaggershow.bean.WebResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

import static com.elfop.blog.swaggershow.bean.WebResult.REQUEST_STATUS_SUCCESS;

/**
 * @Description:
 * @author: liu zhenming
 * @version: V1.0
 * @date: 2019/8/2  13:56
 */
@RestController
@RequestMapping("api")
@Api(value = "swaggerApi展示", tags = {"处理返回json格式的数据"})
public class NormalController {

    @ApiOperation(value = "获取person json返回值", notes = "该操作不会展示嵌套的数据注释")
    @PostMapping("/person")
    public WebResult findPerson() {
        return WebResult.builder()
                .code(200)
                .message(REQUEST_STATUS_SUCCESS)
                .data(new Person(1, "myName", "123456", "测试数据"))
                .build();
    }

    @ApiOperation(value = "获取person json返回值", notes = "通过泛型指定,我们告诉了swagger属性内的对象是什么")
    @PostMapping("/person/pro")
    public WebProResult<Person> findPersonPro() {
        return WebProResult.<Person>builder()
                .code(200)
                .message(REQUEST_STATUS_SUCCESS)
                .data(new Person(1, "myName", "123456", "测试数据"))
                .build();
    }

    @ApiOperation(value = "获取person json返回值", notes = "通过泛型指定,多层嵌套也可展示")
    @PostMapping("/person/page")
    public WebProResult<PageVo<Person>> findPersonPage() {

        Person person = new Person(1, "myName", "123456", "测试数据");

        PageVo<Person> pageVo = PageVo.<Person>builder()
                .page(1)
                .size(10)
                .total(20)
                .values(Collections.singletonList(person))
                .build();

        return WebProResult.<PageVo<Person>>builder()
                .code(200)
                .message(REQUEST_STATUS_SUCCESS)
                .data(pageVo)
                .build();
    }


}
