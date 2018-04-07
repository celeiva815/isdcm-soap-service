/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;
import utils.DateHelper;
import utils.MySqlConnector;

/**
 *
 * @author Tito
 */
@WebService(serviceName = "SearchVideoService")
@Stateless()
public class SearchVideoService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "FindVideoByAuthor")
    public String findVideoByAuthor(@WebParam(name = "author") String txt) {
        
        
        
        return "";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "FindVideoByTitle")
    public String findVideoByTitle(@WebParam(name = "title") String search) {
        
        Connection connection = MySqlConnector.getInstance().getConnection();
        String[] words = search.split(" ");
        String query = "Select * from videos WHERE";
        
        for (int i = 0; i < words.length; i++) {
            
            query += " POSITION(? in title) > 0";
            
            if (i < words.length - 1) {
                query += " AND";
            }
        }
       
          try  {
            
            PreparedStatement pstmt = connection.prepareStatement(query);
            for (int i = 0; i < words.length; i++) {
            
                pstmt.setString(i+1, words[i]);
            }
            
            ResultSet rs = pstmt.executeQuery();
            
            while(rs.next())
            {
                int id = rs.getInt("ID");
                String title = rs.getString("TITLE");
            }

            return "";
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } 
          
          return "";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "FindVideoByYear")
    public String findVideoByYear(@WebParam(name = "year") int year) {
        //TODO write your implementation code here:
        return null;
    }
}
