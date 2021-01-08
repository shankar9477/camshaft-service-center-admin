/*
 * package com.deo;
 * 
 * import javax.servlet.http.HttpServletRequest; import javax.servlet.http.Part;
 * import com.bean.empregistrationbean;; public class getFileName { public
 * String uploadFile(HttpServletRequest request) { String fileName=""; try {
 * Part filePart = request.getPart("photo"); fileName = getFileName(filePart); }
 * catch(Exception e) { fileName=""; } return fileName; }
 * 
 * public String getFileName(Part part) { String Name=""; final String
 * partHeader = part.getHeader("content-disposition");
 * System.out.println("**partHeader: "+partHeader); for(String content :
 * part.getHeader("content-disposition").split(";")) {
 * if(content.trim().startsWith("filename")) { Name =
 * content.substring(content.indexOf('=') + 1).trim().replace("\"",""); } return
 * null; } return Name; } }
 */