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
- user_role 用户角色 0 普通用户 1 管理员
- create_time 创建时间 datetime
- update_time 更新时间 datetime
- deleted_flag 是否删除 0 1 (逻辑删除) tinyint

### 注册逻辑

1. 用户在前端输入账户+密码，以及校验码(todo)
2. 校验用户的账户和密码是否符合要求，对密码进行二次校验
    - 账户不少于4位
    - 密码不少于8位
    - 其他校验
    - 账户不能重复
    - 账户不包含特殊字符
    - 二次校验密码相同
3. 对密码进行加密 (**密码千万不要明文存储到数据库中**)
4. 向数据库插入用户数据

### 登录逻辑

接受参数：用户账户、密码

请求类型：POST

请求体：JSON格式的数据

返回值：用户信息(**脱敏**)

#### 逻辑

1. 校验用户账户和密码是否合法
    1. 非空
    2. 账户长度不少于4位
    3. 密码不少于8位
    4. 账户不包含特殊字符
2. 校验密码输入是否正确，和数据库密文密码对比
3. 记录用户登录(`session`),将其存到服务器上
4. 返回用户信息

#### 如何知道哪个用户登录

1. 连接服务端后，得到一个session1状态，返回给前端
2. 登录成功后，得到了登录成功的session,返回给前端一个设置cookie的"命令"

```session => cookie```

3. 前端接收到后端的命令后，设置cookie，保存到浏览器内
4. 前端再次请求后端的时候（相同的域名），在请求头中带上cookie去请求
5. 后端拿取前端传来的cookie，找到对应的session
6. 后端从session中可以取出基于该session储存的变量（用户登录信息、登录名）

### 用户管理

！！！必须鉴权

1. 查询用户
    1. 允许根据用户名查询
2. 删除用户
