package swagger.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;


import java.util.Date;

@Api(value = "用户表")
@Data
public class User {
    @ApiModelProperty(value = "密码",required = true)
    private String id;
    @ApiModelProperty(value = "用户名",required = true)
    private String name;
    @ApiModelProperty("删除")
    private Integer del_flag;
    @ApiModelProperty("创建人")
    private String create_by;
    @ApiModelProperty("创建时间")
    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date create_date;
    @ApiModelProperty("更新人")
    private String update_by;
    @ApiModelProperty("修改时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    private Date update_date;
}
