Java Server Pages (JSP)
=======================

5.2 Reading Request Information
-------------------------------
When an HTTP client such as web browser sends a request to a web server, along with the request it also sends some HTTP variables like Remote address, Remote host, Content type etc. In some cases these variables are useful to the programmers.
use: request.getMethod(), request.getRequestURI(), request.getProtocol(), request.getPathInfo(), request.getPathTranslated(), request.getQueryString(), request.getContentLength(), request.getContentType(), request.getServerName(), request.getServerPort(), request.getRemoteUser(), request.getRemoteAddr(), request.getRemoteHost(), request.getAuthType()


