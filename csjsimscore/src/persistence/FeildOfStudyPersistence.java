/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistence;

import domain.FeildOfStudy;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author cslab
 */
public class FeildOfStudyPersistence implements IFeildOfStudyPersistence {
    
    public boolean save(FeildOfStudy FeildOfStudy) throws SQLException {
        int affectedRow;
        String query = "Insert into FeildOfStudy (name, departmentId) Values(?,?)";
        try (Connection conn = DbConnection.getConnection()) {
            try (PreparedStatement prepare = conn.prepareStatement(query)) {
                prepare.setString(1, FeildOfStudy.getName());
                prepare.setInt(2, FeildOfStudy.getDepartmentId());
                affectedRow = prepare.executeUpdate();
            }
        }
        return affectedRow > 0;
    }
}
