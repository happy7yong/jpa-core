package com.meta.jpacore.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "memo")
public class Memo {

    @Id
    private long id;

    //nullable:null 허용 여부
    //unique:중복 허용 여부(false일때 중복 허용)
    @Column(name = "username", nullable = false, unique = true)
    private String username;


    //length : 컬럼 길이 지정
    @Column(name = "contents", nullable = false, length=500)
    private String content;
}
