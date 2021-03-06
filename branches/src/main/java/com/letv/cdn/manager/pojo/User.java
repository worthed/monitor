package com.letv.cdn.manager.pojo;

public class User {
	
	/**用户类型：CDN用户*/
	public static final Object TYPE_CDN = "cdn";
	/**用户类型：CLOUD(云视频)用户*/
    public static final Object TYPE_CLOUD = "cloud";
    
    /**计费类型：95峰值*/
    public static final String CHARGE_TYPE_95PEAK = "95peak";
    /**计费类型：第四峰值*/
    public static final String CHARGE_TYPE_FOURTHPEAK = "fourthpeak";
    /**计费类型：峰值*/
    public static final String CHARGE_TYPE_MAXPEAK = "maxpeak";
    
    public static final Integer CAL_TYPE_DOMAIN = 0;
    
    public static final Integer CAL_TYPE_USER = 1;
    
    public User(String username, String email, Integer userid,
			Integer usertypeId, Integer parentid, String userkey) {
		super();
		this.username = username;
		this.email = email;
		this.userid = userid;
		this.usertypeId = usertypeId;
		this.parentid = parentid;
		this.userkey = userkey;
	}
    
    

	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}



	public User() {
		super();
	}



	/**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.id
     *
     * @mbggenerated Tue Oct 14 11:26:46 CST 2014
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.username
     *
     * @mbggenerated Tue Oct 14 11:26:46 CST 2014
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.password
     *
     * @mbggenerated Tue Oct 14 11:26:46 CST 2014
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.peak
     *
     * @mbggenerated Tue Oct 14 11:26:46 CST 2014
     */
    private Integer peak;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.download
     *
     * @mbggenerated Tue Oct 14 11:26:46 CST 2014
     */
    private Integer download;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.type
     *
     * @mbggenerated Tue Oct 14 11:26:46 CST 2014
     */
    private String type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.defaultpwd
     *
     * @mbggenerated Tue Oct 14 11:26:46 CST 2014
     */
    private String defaultpwd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.email
     *
     * @mbggenerated Tue Oct 14 11:26:46 CST 2014
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.userid
     *
     * @mbggenerated Tue Oct 14 11:26:46 CST 2014
     */
    private Integer userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.usertype_id
     *
     * @mbggenerated Tue Oct 14 11:26:46 CST 2014
     */
    private Integer usertypeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.parentid
     *
     * @mbggenerated Tue Oct 14 11:26:46 CST 2014
     */
    private Integer parentid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.userkey
     *
     * @mbggenerated Tue Oct 14 11:26:46 CST 2014
     */
    private String userkey;
    
    private Integer calType;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.id
     *
     * @return the value of user.id
     *
     * @mbggenerated Tue Oct 14 11:26:46 CST 2014
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.id
     *
     * @param id the value for user.id
     *
     * @mbggenerated Tue Oct 14 11:26:46 CST 2014
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.username
     *
     * @return the value of user.username
     *
     * @mbggenerated Tue Oct 14 11:26:46 CST 2014
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.username
     *
     * @param username the value for user.username
     *
     * @mbggenerated Tue Oct 14 11:26:46 CST 2014
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.password
     *
     * @return the value of user.password
     *
     * @mbggenerated Tue Oct 14 11:26:46 CST 2014
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.password
     *
     * @param password the value for user.password
     *
     * @mbggenerated Tue Oct 14 11:26:46 CST 2014
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.peak
     *
     * @return the value of user.peak
     *
     * @mbggenerated Tue Oct 14 11:26:46 CST 2014
     */
    public Integer getPeak() {
        return peak;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.peak
     *
     * @param peak the value for user.peak
     *
     * @mbggenerated Tue Oct 14 11:26:46 CST 2014
     */
    public void setPeak(Integer peak) {
        this.peak = peak;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.download
     *
     * @return the value of user.download
     *
     * @mbggenerated Tue Oct 14 11:26:46 CST 2014
     */
    public Integer getDownload() {
        return download;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.download
     *
     * @param download the value for user.download
     *
     * @mbggenerated Tue Oct 14 11:26:46 CST 2014
     */
    public void setDownload(Integer download) {
        this.download = download;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.type
     *
     * @return the value of user.type
     *
     * @mbggenerated Tue Oct 14 11:26:46 CST 2014
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.type
     *
     * @param type the value for user.type
     *
     * @mbggenerated Tue Oct 14 11:26:46 CST 2014
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.defaultpwd
     *
     * @return the value of user.defaultpwd
     *
     * @mbggenerated Tue Oct 14 11:26:46 CST 2014
     */
    public String getDefaultpwd() {
        return defaultpwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.defaultpwd
     *
     * @param defaultpwd the value for user.defaultpwd
     *
     * @mbggenerated Tue Oct 14 11:26:46 CST 2014
     */
    public void setDefaultpwd(String defaultpwd) {
        this.defaultpwd = defaultpwd == null ? null : defaultpwd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.email
     *
     * @return the value of user.email
     *
     * @mbggenerated Tue Oct 14 11:26:46 CST 2014
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.email
     *
     * @param email the value for user.email
     *
     * @mbggenerated Tue Oct 14 11:26:46 CST 2014
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.userid
     *
     * @return the value of user.userid
     *
     * @mbggenerated Tue Oct 14 11:26:46 CST 2014
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.userid
     *
     * @param userid the value for user.userid
     *
     * @mbggenerated Tue Oct 14 11:26:46 CST 2014
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.usertype_id
     *
     * @return the value of user.usertype_id
     *
     * @mbggenerated Tue Oct 14 11:26:46 CST 2014
     */
    public Integer getUsertypeId() {
        return usertypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.usertype_id
     *
     * @param usertypeId the value for user.usertype_id
     *
     * @mbggenerated Tue Oct 14 11:26:46 CST 2014
     */
    public void setUsertypeId(Integer usertypeId) {
        this.usertypeId = usertypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.parentid
     *
     * @return the value of user.parentid
     *
     * @mbggenerated Tue Oct 14 11:26:46 CST 2014
     */
    public Integer getParentid() {
        return parentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.parentid
     *
     * @param parentid the value for user.parentid
     *
     * @mbggenerated Tue Oct 14 11:26:46 CST 2014
     */
    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.userkey
     *
     * @return the value of user.userkey
     *
     * @mbggenerated Tue Oct 14 11:26:46 CST 2014
     */
    public String getUserkey() {
        return userkey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.userkey
     *
     * @param userkey the value for user.userkey
     *
     * @mbggenerated Tue Oct 14 11:26:46 CST 2014
     */
    public void setUserkey(String userkey) {
        this.userkey = userkey == null ? null : userkey.trim();
    }



	public Integer getCalType() {
		return calType;
	}



	public void setCalType(Integer calType) {
		this.calType = calType;
	}
}