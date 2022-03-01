package com.z.Pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rubbish {
    private Integer id;
    private String name;
    private Integer cid;
    private String describe;

}
