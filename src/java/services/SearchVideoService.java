/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;
import models.VideoDAO;
import models.Video;

/**
 *
 * @author Tito
 */
@WebService(serviceName = "SearchVideoService")
@Stateless()
public class SearchVideoService {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "FindVideoByTitle")
    public List<Video> findVideoByTitle(@WebParam(name = "title") String search) {
        
        VideoDAO dao = VideoDAO.getInstance();
        return dao.searchVideos(search, "title");
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "FindVideoByYear")
    public List<Video> findVideoByYear(@WebParam(name = "year") int year) {
       
        VideoDAO dao = VideoDAO.getInstance();
        return dao.searchVideos(year);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "FindVideoByAuthor")
    public List<Video> findVideoByAuthor(@WebParam(name = "author") String search) {
        
        VideoDAO dao = VideoDAO.getInstance();
        return dao.searchVideos(search, "author");
    }
}
