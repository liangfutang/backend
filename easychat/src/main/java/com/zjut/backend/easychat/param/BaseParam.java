package com.zjut.backend.easychat.param;

import com.zjut.backend.common.convention.result.PageParam;
import lombok.Data;

/**
 * @author tlf
 */
@Data
public class BaseParam extends PageParam {

    public BaseParam() {}

    public BaseParam(Boolean needPage, Integer pageNo, Integer pageSize) {
        this.needPage = needPage;
        setPageNo(pageNo);
        setPageSize(pageSize);
    }

    /**
     * 当前查询条件中是否需要使用limit分页查找
     */
    private Boolean needPage;

    /**
     * 查询开始时间
     */
    private String startTime;

    /**
     * 查询截至时间
     */
    private String endTime;
}
