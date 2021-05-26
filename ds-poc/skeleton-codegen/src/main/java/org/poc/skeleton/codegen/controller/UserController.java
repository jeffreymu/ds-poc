
package org.poc.skeleton.codegen.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @ResponseBody
    @GetMapping("/page")
    public Object selectPage(Model model){
        Page page=new Page(1,20);

        return page;
    }

}
