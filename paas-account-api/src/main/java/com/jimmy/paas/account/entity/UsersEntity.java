package com.jimmy.paas.account.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * <p>
 *
 * </p>
 *
 * @author jimmy
 * @since 2021-09-27
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("ac_users")
public class UsersEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 昵称
     */
    @TableField("nick_name")
    private String nickName;

    /**
     * 用户名称
     */
    @TableField("username")
    private String username;

    /**
     * 密码
     */
    @TableField("`password`")
    private String password;

    /**
     * token
     */
    @TableField("token")
    private String token;

    @TableField("version")
    @Version
    private Integer version;

    /**
     * 逻辑删除：0-正常 1-删除
     */
    @TableField("deleted")
    @TableLogic
    private Integer deleted;

    @TableField("created_by")
    private Integer createdBy;

    @TableField("created_time")
    private LocalDateTime createdTime;

    @TableField("updated_by")
    private Integer updatedBy;

    @TableField("updated_time")
    private LocalDateTime updatedTime;


    public static final String ID = "id";

    public static final String NICK_NAME = "nick_name";

    public static final String USERNAME = "username";

    public static final String PASSWORD = "password";

    public static final String TOKEN = "token";

    public static final String VERSION = "version";

    public static final String DELETED = "deleted";

    public static final String CREATED_BY = "created_by";

    public static final String CREATED_TIME = "created_time";

    public static final String UPDATED_BY = "updated_by";

    public static final String UPDATED_TIME = "updated_time";

}
