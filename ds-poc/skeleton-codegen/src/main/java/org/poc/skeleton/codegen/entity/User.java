
package org.poc.skeleton.codegen.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;


@TableName("user")
@Data
public class User implements Serializable {

    /**
     * 用户ID
     */
    private String id;

    /**
     * 用户名
     */
    private String name;

    /**
     * 用户年龄
     */
    private Integer age;

    /**
     * 描述
     */
    private String desc;

    /**
     * 状态
     */
    @TableField(exist = false)
    private String state;

}
