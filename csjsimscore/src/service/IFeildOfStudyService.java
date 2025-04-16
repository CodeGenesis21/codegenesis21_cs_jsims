/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import domain.FeildOfStudy;
import java.sql.SQLException;
/**
 *
 * @author cslab
 */
public interface IFeildOfStudyService {
    boolean register(FeildOfStudy FeildOfStudy)throws SQLException;
 
}
