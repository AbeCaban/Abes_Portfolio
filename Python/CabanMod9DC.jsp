<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>DC Comics Characters</title>
</head>
<body>
  <h1>DC Comics Characters</h1>
  <ul>
    <c:set var="dcCharacters" value="<%= new java.util.ArrayList<String>() %>"/>
    <%-- Add characters to the list --%>
    <%
      ArrayList<String> dcCharacters = (ArrayList<String>)pageContext.getAttribute("dcCharacters");
      dcCharacters.add("Superman");
      dcCharacters.add("Batman");
      dcCharacters.add("Wonder Woman");
    %>
    <c:forEach var="character" items="${dcCharacters}">
      <li>${character}</li>
    </c:forEach>
  </ul>
</body>
</html>
