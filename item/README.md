һ����ѯ���ܵ�ʵ��
���ݿ�����jar����
    jdbcָ�������ݿ����ӣ���һ�ֻ�׼��һ��api���������������޸�����
    odbc�ǿ������ݿ⻥����ODBC����Դ��ASP�����ADO��������ݿ�֮��Ľӿڡ�
    c3p0���ݿ����ӳ�
    dbcp���ݿ����ӳ�
 �����ļ���ȡ��
    c3p0�������ļ���������c3p0-config.xml����ȥbinĿ¼�²��ң���������ԴĿ¼�Զ���ȡ��
        JdbcUtils�������ݿ����
    dbcpһ����dbcp.properties��
        ��ȡJDBCUtils.class.getClassLoader().getResourceAsStream("dbcp.properties")
		
����servlet����ע�����ʽ��ʵ��
    @WebServlet("/getMater")

���ڷ���˷���
	hosts·�����һ������,Ĭ��Ϊ(127.0.0.1       localhost)
    127.0.0.1       wendellup
	
	��war����webappsĿ¼�£���jar��ֱ������
	�޸�tomcat�е�server.xml�ļ�
	<Host name="wendellup" ?appBase="webapps"
         unpackWARs="true" autoDeploy="true"
         xmlValidation="false" xmlNamespaceAware="false">
		<Context path="" docBase="E:\myeclipse_workspace\Z_myframework\WebRoot" debug="5" reloadable="false" />?
     </Host>

���ڱ���
form������iso-8859-1
a ��ǩ����  utf-8
�����tomcat��iso-8859-1��Ϊutf-8��form���ύ��ʽ��Ϊget������ת��