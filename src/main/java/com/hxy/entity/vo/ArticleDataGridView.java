package com.hxy.entity.vo;

import com.hxy.entity.Article;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

/**
 * @author hexy
 * @date 2018/12/1415:36
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ArticleDataGridView {

    private Integer id;

    private String title;

    private Date gmtCreate;

    private Date gmtModified;

    private String introduction;

    public ArticleDataGridView(Article article) {
        this.id = article.getId();
        this.title = article.getTitle();
        this.gmtModified = article.getGmtModified();
        this.gmtCreate = article.getGmtCreate();
        this.introduction = article.getIntroduction();
    }
}
