
package servlets;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;

/**
 *
 * @author Paolo
 */
public class NoteServlet extends HttpServlet {
    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String path = getServletContext().getRealPath("/WEB-INF/note.txt");

        BufferedReader br = new BufferedReader(new FileReader(new File(path)));
        
        Note note = new Note(br.readLine(), br.readLine());
        request.setAttribute("note", note);
   
        br.close();
        if(request.getParameter("edit") == null){
        getServletContext().getRequestDispatcher("/WEB-INF/viewNote.jsp").forward(request, response);
        return;
        }else{
        getServletContext().getRequestDispatcher("/WEB-INF/editNote.jsp").forward(request, response);
        return;
        }
        
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false)));
        
        pw.println(request.getParameter("title"));
        pw.println(request.getParameter("content"));
        
        pw.close();

        BufferedReader br = new BufferedReader(new FileReader(new File(path)));
        
        Note note = new Note(br.readLine(), br.readLine());
        request.setAttribute("note", note);
        br.close();
        
        getServletContext().getRequestDispatcher("/WEB-INF/viewNote.jsp").forward(request, response);
        return;
        
    }
}

