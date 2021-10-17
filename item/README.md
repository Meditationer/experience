一个查询功能的实现
数据库连接jar包：
    jdbc指的是数据库连接，是一种基准，一个api，其它是在其上修改升级
    odbc是开放数据库互连，ODBC数据源是ASP程序的ADO组件和数据库之间的接口。
    c3p0数据库连接池
    dbcp数据库连接池
 配置文件读取：
    c3p0的配置文件名必须是c3p0-config.xml。会去bin目录下查找，这里是资源目录自动读取。
        JdbcUtils就是数据库操作
    dbcp一般用dbcp.properties。
        读取JDBCUtils.class.getClassLoader().getResourceAsStream("dbcp.properties")
		
关于servlet，用注解的形式来实现
    @WebServlet("/getMater")

关于服务端发布
	hosts路径添加一条域名,默认为(127.0.0.1       localhost)
    127.0.0.1       wendellup
	
	打war包放webapps目录下，打jar包直接运行
	修改tomcat中的server.xml文件
	<Host name="wendellup" ?appBase="webapps"
         unpackWARs="true" autoDeploy="true"
         xmlValidation="false" xmlNamespaceAware="false">
		<Context path="" docBase="E:\myeclipse_workspace\Z_myframework\WebRoot" debug="5" reloadable="false" />?
     </Host>

关于编码
form表单过来iso-8859-1
a 标签过来  utf-8
解决：tomcat的iso-8859-1改为utf-8，form表单提交方式改为get不进行转码