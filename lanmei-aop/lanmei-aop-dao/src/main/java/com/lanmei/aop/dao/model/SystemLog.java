package com.lanmei.aop.dao.model;

import java.util.Date;

public class SystemLog {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column system_log.log_id
     *
     * @mbggenerated
     */
    private Integer logId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column system_log.description
     *
     * @mbggenerated
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column system_log.layer
     *
     * @mbggenerated
     */
    private String layer;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column system_log.method
     *
     * @mbggenerated
     */
    private String method;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column system_log.LogType
     *
     * @mbggenerated
     */
    private Byte logtype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column system_log.request_ip
     *
     * @mbggenerated
     */
    private String requestIp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column system_log.exception_code
     *
     * @mbggenerated
     */
    private String exceptionCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column system_log.exception_detail
     *
     * @mbggenerated
     */
    private String exceptionDetail;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column system_log.params
     *
     * @mbggenerated
     */
    private String params;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column system_log.create_by
     *
     * @mbggenerated
     */
    private String createBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column system_log.create_date
     *
     * @mbggenerated
     */
    private Date createDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column system_log.log_id
     *
     * @return the value of system_log.log_id
     *
     * @mbggenerated
     */
    public Integer getLogId() {
        return logId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column system_log.log_id
     *
     * @param logId the value for system_log.log_id
     *
     * @mbggenerated
     */
    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column system_log.description
     *
     * @return the value of system_log.description
     *
     * @mbggenerated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column system_log.description
     *
     * @param description the value for system_log.description
     *
     * @mbggenerated
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column system_log.layer
     *
     * @return the value of system_log.layer
     *
     * @mbggenerated
     */
    public String getLayer() {
        return layer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column system_log.layer
     *
     * @param layer the value for system_log.layer
     *
     * @mbggenerated
     */
    public void setLayer(String layer) {
        this.layer = layer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column system_log.method
     *
     * @return the value of system_log.method
     *
     * @mbggenerated
     */
    public String getMethod() {
        return method;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column system_log.method
     *
     * @param method the value for system_log.method
     *
     * @mbggenerated
     */
    public void setMethod(String method) {
        this.method = method;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column system_log.LogType
     *
     * @return the value of system_log.LogType
     *
     * @mbggenerated
     */
    public Byte getLogtype() {
        return logtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column system_log.LogType
     *
     * @param logtype the value for system_log.LogType
     *
     * @mbggenerated
     */
    public void setLogtype(Byte logtype) {
        this.logtype = logtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column system_log.request_ip
     *
     * @return the value of system_log.request_ip
     *
     * @mbggenerated
     */
    public String getRequestIp() {
        return requestIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column system_log.request_ip
     *
     * @param requestIp the value for system_log.request_ip
     *
     * @mbggenerated
     */
    public void setRequestIp(String requestIp) {
        this.requestIp = requestIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column system_log.exception_code
     *
     * @return the value of system_log.exception_code
     *
     * @mbggenerated
     */
    public String getExceptionCode() {
        return exceptionCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column system_log.exception_code
     *
     * @param exceptionCode the value for system_log.exception_code
     *
     * @mbggenerated
     */
    public void setExceptionCode(String exceptionCode) {
        this.exceptionCode = exceptionCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column system_log.exception_detail
     *
     * @return the value of system_log.exception_detail
     *
     * @mbggenerated
     */
    public String getExceptionDetail() {
        return exceptionDetail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column system_log.exception_detail
     *
     * @param exceptionDetail the value for system_log.exception_detail
     *
     * @mbggenerated
     */
    public void setExceptionDetail(String exceptionDetail) {
        this.exceptionDetail = exceptionDetail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column system_log.params
     *
     * @return the value of system_log.params
     *
     * @mbggenerated
     */
    public String getParams() {
        return params;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column system_log.params
     *
     * @param params the value for system_log.params
     *
     * @mbggenerated
     */
    public void setParams(String params) {
        this.params = params;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column system_log.create_by
     *
     * @return the value of system_log.create_by
     *
     * @mbggenerated
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column system_log.create_by
     *
     * @param createBy the value for system_log.create_by
     *
     * @mbggenerated
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column system_log.create_date
     *
     * @return the value of system_log.create_date
     *
     * @mbggenerated
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column system_log.create_date
     *
     * @param createDate the value for system_log.create_date
     *
     * @mbggenerated
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}