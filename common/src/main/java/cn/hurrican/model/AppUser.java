package cn.hurrican.model;

import lombok.Data;

import java.util.Date;

/**
 * @author Hurrican
 * @Date 2019/5/8  11:02
 * @since 1.0.0
 */
@Data
public class AppUser {

    private Long id;

    private String username;

    private String nickname;

    private String email;


    private String phone;

    private Date registerTime;

    private String address;


}
