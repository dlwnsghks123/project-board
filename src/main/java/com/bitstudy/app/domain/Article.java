package com.bitstudy.app.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import java.time.LocalDateTime;


@Getter
@Setter
@ToString
@Entity
public class Article {

    private Long id;
    private String title; //제목
    private String content; //본문
    private String hashtag; //해시태그

    //메타데이터
    private LocalDateTime createdAt; //생성일시
    private String createdBy; //생성일시
    private LocalDateTime modifiedAt; //수정일시
    private String modifiedBt; //수정일시



}
