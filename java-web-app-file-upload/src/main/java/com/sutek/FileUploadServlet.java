package com.sutek;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.List;

@WebServlet("/uploadFile")
public class FileUploadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (ServletFileUpload.isMultipartContent(request)) {
            try {
                List<FileItem> multiparts = new ServletFileUpload(new DiskFileItemFactory()).parseRequest(request);
                for (FileItem item : multiparts) {
                    if (!item.isFormField()) {
                        String name = new File(item.getName()).getName();
                        item.write(new File("uploads" + File.separator + name));
                    }
                }
                request.setAttribute("message", "File Uploaded Successfully");
                getServletContext().getRequestDispatcher("/uploadSuccess.jsp").forward(request, response);
            } catch (Exception e) {
                request.setAttribute("message", "File Upload Failed due to " + e);
                getServletContext().getRequestDispatcher("/upload.jsp").forward(request, response);
            }
        } else {
            request.setAttribute("message", "Sorry this Servlet only handles file upload request");
            getServletContext().getRequestDispatcher("/upload.jsp").forward(request, response);
        }
    }
}
