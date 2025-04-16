/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package persistence;

import domain.FeildOfStudy;
import java.sql.SQLException;
/**
 *
 * @author cslab
 */
public interface IFeildOfStudyPersistence {
      boolean save(FeildOfStudy FeildOfStudy)throws SQLException ;
}
