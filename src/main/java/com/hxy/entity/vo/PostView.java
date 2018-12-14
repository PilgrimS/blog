package com.hxy.entity.vo;

import com.hxy.entity.Article;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.time.DateFormatUtils;

/**
 * @author hexy
 * @date 2018/12/1415:37
 */
@Getter
@Setter
@AllArgsConstructor
public class PostView {

    private Integer id;
    private String title;
    private String description;
    private String dateTime;
    private String htmlMaterial;

    /**
     * 拷贝构造方法
     *
     * @param article 文章
     */
    public PostView(Article article) {
        id = article.getId();
        title = article.getTitle();
        description = article.getIntroduction();
        dateTime = DateFormatUtils.format(article.getGmtCreate(), "yyyy-MM-dd HH:mm");
        htmlMaterial = article.getHtmlMaterial();
    }
}
