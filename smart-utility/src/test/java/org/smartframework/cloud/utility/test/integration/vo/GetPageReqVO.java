package org.smartframework.cloud.utility.test.integration.vo;

import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class GetPageReqVO {

    private String str;
    private long[] ids;

}