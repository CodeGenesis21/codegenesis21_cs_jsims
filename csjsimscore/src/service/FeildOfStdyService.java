/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import domain.FeildOfStudy;
import java.sql.SQLException;
import persistence.FeildOfStudyPersistence;
import persistence.IFeildOfStudyPersistence;
/**
 *
 * @author cslab
 */
public class FeildOfStdyService implements IFeildOfStudyService {
    private final IFeildOfStudyPersistence feildOfStudyPersistance = new FeildOfStudyPersistence();
   
    public boolean register(FeildOfStudy FeildOfStudy) throws SQLException {
         return feildOfStudyPersistance.save(FeildOfStudy);
    }
    
    
}
