package com.hxy.entity.vo;

import com.hxy.entity.Resume;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author hexy
 * @date 2018/12/1415:47
 */
@Setter
@Getter
@NoArgsConstructor
public class ResumeModifyModel {

    @NotEmpty
    private Integer id;

    @NotEmpty
    private String title;

    private String mdMaterial;

    private String description;

    public ResumeModifyModel(Resume article) {
        this.id = article.getId();
        this.title = article.getTitle();
        this.mdMaterial = article.getMdMaterial();
        this.description = article.getIntroduction();
    }
}
