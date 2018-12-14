package com.hxy.entity.form;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author hexy
 * @date 2018/12/1416:52
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ArticleSearchForm {

    /**
     * 文章标题
     */
    @NotEmpty
    private String name;
}