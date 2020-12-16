package com.example.easyexceldemo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.format.DateTimeFormat;
import lombok.Data;

/**
 * Created by zhuguowei on 2020/12/16.
 */
@Data
public class ExcelData {
    @ExcelProperty("品牌")
    private String brands;
    @ExcelProperty("媒体分类")
    private String platform;
    @ExcelProperty("发布人")
    private String screenName;
    @ExcelProperty("情感属性")
    private String sentimentDesc;
    @ExcelProperty("阅读数")
    private Integer readCount;
    @ExcelProperty("点赞数")
    private Integer praisesCount;
    @ExcelProperty("评论数")
    private Integer commentsCount;
    @ExcelProperty("转发数")
    private Integer repostsCount;
    @ExcelProperty("互动")
    private Integer interactionCount;
    @ExcelProperty("粉丝数")
    private Integer followersCount;
    @ExcelProperty("原文链接")
    private String pageUrl;
    @ExcelProperty("日期")
    @DateTimeFormat("yyyy-MM-dd")
    private String publishDate;
    @ExcelProperty("发布时间")
    @DateTimeFormat("yyyy-MM-dd HH:mm:ss")
    private String createdAt;
    @ExcelProperty("标题")
    private String postTitle;
    @ExcelProperty("摘要")
    private String text;
}
