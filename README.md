# MyBlog
个人博客系统
**个人博客功能：**

**技术组合：**

*  后端：Spring Boot + JPA + thymeleaf模板
*  数据库：MySQL
*  前端UI：Semantic UI框架

**工具与环境：**

*  IDEA
*  Maven 3
*  JDK 8
*  Axure RP 8

**课程内容模块：**

*  需求分析与功能规划
*  页面设计与开发
*  技术框架搭建
*  后端管理功能实现
*  前端管理功能实现

## 1、需求与功能

个人博客系统的用户故事：

角色：**普通访客**，**管理员（我）**

*  访客，可以分页查看所有的博客
*  访客，可以快速查看博客数最多的6个分类
*  访客，可以查看所有的分类
*  访客，可以查看某个分类下的博客列表
*  访客，可以快速查看标记博客最多的10个标签
*  访客，可以查看所有的标签
*  访客，可以查看某个标签下的博客列表
*  访客，可以根据年度时间线查看博客列表
*  访客，可以快速查看最新的推荐博客
*  访客，可以用关键字全局搜索博客
*  访客，可以查看单个博客内容
*  访客，可以对博客内容进行评论
*  访客，可以赞赏博客内容
*  访客，可以微信扫码阅读博客内容
*  访客，可以在首页扫描公众号二维码关注我
*  我，可以用户名和密码登录后台管理
*  我，可以管理博客
   *  我，可以发布新博客
   *  我，可以对博客进行分类
   *  我，可以对博客打标签
   *  我，可以修改博客
   *  我，可以删除博客
   *  我，可以根据标题，分类，标签查询博客
*  我，可以管理博客分类
   *  我，可以新增一个分类
   *  我，可以修改一个分类
   *  我，可以删除一个分类
   *  我，可以根据分类名称查询分类
*  我，可以管理标签
   *  我，可以新增一个标签
   *  我，可以修改一个标签
   *  我，可以删除一个标签
   *  我，可以根据名称查询标签

### 1.2 功能规划

https://ws2.sinaimg.cn/large/006tKfTcgy1fk7m27hbn4j31ds0ycdnp.jpg

## 2、页面设计与开发

### 2.1 设计

**页面规划：**

前端展示：首页、详情页、分类、标签、归档、关于我

后台管理：模板页

### 2.2 页面开发

[Semantic UI官网](https://semantic-ui.com/)

[Semantic UI中文官网](http://www.semantic-ui.cn/)

[WebStorm下载与破解](https://imcoding.me/blogs/5)

[背景图片资源](https://www.toptal.com/designers/subtlepatterns/)

### 2.3 插件集成

[编辑器 Markdown](https://pandao.github.io/editor.md/)

[内容排版 typo.css](https://github.com/sofish/typo.css)

[动画 animate.css](https://daneden.github.io/animate.css/)

[代码高亮 prism](https://github.com/PrismJS/prism)

[目录生成 Tocbot](https://tscanlin.github.io/tocbot/)

[滚动侦测 waypoints](http://imakewebthings.com/waypoints/)

[平滑滚动 jquery.scrollTo](https://github.com/flesler/jquery.scrollTo)

[二维码生成 qrcode.js](https://davidshimjs.github.io/qrcodejs/)

## 3、框架搭建

>  [IDEA下载 https://www.jetbrains.com/idea/](https://www.jetbrains.com/idea/)

### 3.1 构建与配置

**1、引入Spring Boot模块：**

*  web
*  Thymeleaf
*  JPA
*  MySQL
*  Aspects
*  DevTools

4、设计与规范

### 4.1 实体设计

**实体类：**
*  博客 Blog
*  博客分类 Type
*  博客标签 Tag
*  博客评论 Comment
*  用户 User

### 4.2 应用分层

### 4.3 命名约定

**Service/DAO层命名约定：**

*  获取单个对象的方法用get做前缀。
*  获取多个对象的方法用list做前缀。
*  获取统计值的方法用count做前缀。
*  插入的方法用save(推荐)或insert做前缀。
*  删除的方法用remove(推荐)或delete做前缀。
*  修改的方法用update做前缀。

## 5、后台管理功能实现

### 5.1 登录

**1、构建登录页面和后台管理首页**

**2、UserService和UserRepository**

**3、LoginController实现登录**

**4、MD5加密**

**5、登录拦截器**

### 5.2 分类管理

**1、分类管理页面**

**2、分类列表分页**

**3、分类新增、修改、删除**

### 5.3 标签管理

### 5.4 博客管理

**1、博客分页查询**

**2、博客新增**

**3、博客修改**

**4、博客删除**

## 6、前端展示功能实现

### 6.1 首页展示

**1、博客列表**

**2、top分类**

**3、top标签**

**4、最新博客推荐**

**5、博客详情**

**2、评论功能**/////////////暂未实现

*  评论信息提交与回复功能
*  评论信息列表展示功能
*  管理员回复评论功能

### 6.2 分类页

### 6.3 标签页

### 6.4 归档页

### 6.5 关于我





