<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <p>This is the homepage!</p>
       <p>Mj here</p>
       <p>Jose Here new messagenkjn</p>
       
       <form:form action="${pageContext.request.contextPath}/getProducts"
        method="POST">
        <input type="submit" value="Get Products">
    </form:form>
      
    </body>
</html>
