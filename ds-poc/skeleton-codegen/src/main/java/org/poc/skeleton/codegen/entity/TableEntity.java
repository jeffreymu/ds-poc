
package org.poc.skeleton.codegen.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;


@Data
public class TableEntity implements Serializable {

    /**
     * 名称
     */
    private String tableName;

    /**
     * 备注
     */
    private String comments;

    /**
     * 主键
     */
    private ColumnEntity pk;

    /**
     * 列名
     */
    private List<ColumnEntity> columns;

    /**
     * 驼峰类型
     */
    private String caseClassName;

    /**
     * 普通类型
     */
    private String lowerClassName;
}

