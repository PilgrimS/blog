package com.hxy.entity.vo;

import com.hxy.entity.Article;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author hexy
 * @date 2018/12/1415:35
 */
@Setter
@Getter
@NoArgsConstructor
public class BlogModifyModel {

    @NotEmpty
    private Integer id;

    @NotEmpty
    private String title;

    private String mdMaterial;

    private String description;

    public BlogModifyModel(Article article) {
        this.id = article.getId();
        this.title = article.getTitle();
        this.mdMaterial = article.getMdMaterial();
        this.description = article.getIntroduction();
    }
}