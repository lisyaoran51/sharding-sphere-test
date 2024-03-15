package com.linkpay.agencyBase.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Course implements Serializable {
    private Long cid;
    private String cname;
    private Long userId;
    private String cstatus;
}