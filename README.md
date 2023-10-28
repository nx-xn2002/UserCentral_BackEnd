# 用户中心项目-后端

## 技术选型

- Java
- Spring + SpringMVC + SpringBoot 框架
- MyBatis + MyBatis Plus 数据访问框架
- MySQL 数据库
- jUnit 单元测试库

### 数据库设计

用户表:

- id(主键) bigint
- username 昵称 varchar
- user_account 登录账号 varchar
- avatar_url 头像 varchar
- gender 性别 tinyint
- user_password 密码 varchar
- phone 电话 varchar
- email 邮箱 varchar
- user_status 状态 0 正常 int 
- create_time 创建时间 datetime
- update_time 更新时间 datetime
- deleted_flag 是否删除 0 1 (逻辑删除) tinyint