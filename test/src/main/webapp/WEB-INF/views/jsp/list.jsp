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
dsdfsf
<c:forEach items="${imgSPs}" var="SP">
${SP.idSP} <br>
/resources/Ảnh/${SP.img2}<br>
/resources/Ảnh/${SP.img1} <br>
/resources/Ảnh/${SP.img3}<br>
/resources/Ảnh/${SP.img4}<br>
/resources/Ảnh/${SP.img5}<br>
/resources/Ảnh/${SP.img6}<br>
/resources/Ảnh/${SP.img7}<br>
/resources/Ảnh/${SP.img8}<br>
/resources/Ảnh/${SP.img9}<br>
/resources/Ảnh/${SP.img10}<br>
/resources/Ảnh/${SP.img11}<br>
/resources/Ảnh/${SP.img12}<br>
/resources/Ảnh/${SP.img13}<br>
/resources/Ảnh/${SP.img14}<br>
/resources/Ảnh/${SP.img15}<br>
/resources/Ảnh/${SP.img16}<br>
/resources/Ảnh/${SP.img17}<br>
/resources/Ảnh/${SP.img18}<br>
/resources/Ảnh/${SP.img19}<br>
/resources/Ảnh/${SP.img20}<br>
<a href="chitiet?id=${SP.idSP}">chi tiết</a>
</c:forEach>
</body>
</html>