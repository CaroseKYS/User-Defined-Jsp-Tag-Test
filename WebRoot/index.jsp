<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="ex" uri="/hello" %>

<!DOCTYPE>
<html>
  <head>
  	<title>Test</title>
  </head>
  
  <body>
    <%-- <ex:Hello/> --%>
    <ex:Hello message="This is message body1. " required="true">
    </ex:Hello>
  </body>
</html>
