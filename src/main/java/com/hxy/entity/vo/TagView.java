package com.hxy.entity.vo;

import com.hxy.entity.Tag;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author hexy
 * @date 2018/12/1415:47
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TagView {

    private Integer tagId;
    private String tagName;
    private Integer articleCount;

    public TagView(Tag tag) {
        this.tagId = tag.getId();
        this.tagName = tag.getName();
    }
}
