<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>

<c:forEach var="ch" items="${CH1}"> 
		<p>Id SP: ${ch.DSSP.idSP}</p>
		<p>Chip: ${ch.c.tenChip}</p>
        <p>Độ rộng màn hình: ${ch.doRongMan}</p>
        <p>Giá sản phẩm: ${ch.giaSP}</p>
    </c:forEach>
</body>
</html>