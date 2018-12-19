package cn.hurrican.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class MySqlConfig {

    private Integer id;

    private String host;

    private String user;

    private String password;

    private String db;

    private Long version;


}
