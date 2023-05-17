package com.example.projet1705.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDao {


    private Connection conn ;



    public void ConnectPostGreSql() {
        try {
            Class.forName("org.postgresql.Driver"); // chargement du driver
//            String url = "jdbc:postgresql://localhost/postgres?userClass.forName(" org.postgresql.Driver")
            String url = "jdbc:postgresql://localhost/postgres?user=postgres&password=0000";

            conn = DriverManager.getConnection(url);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
        public List<Users> listusers()

        {
            List<Users> Users = new ArrayList<Users>();
            ConnectPostGreSql();

            Statement st = null ;
            try {
                st = conn.createStatement();
                ResultSet rs = st.executeQuery("select *  FROM usertab");
                while (rs.next()) {
                    Users.add(new Users(rs.getInt("id"), rs.getString("nom"), rs.getString("prenom") , rs.getInt("age"),  rs.getString("email"), rs.getString("motDePasse")));
                }

                return Users;
            }
            catch  (SQLException e)
            {
                throw new RuntimeException(e);
            }
        }

    public void addStudent(Users s) {
        try {
            ConnectPostGreSql();
            PreparedStatement preparedStatement =
                    conn.prepareStatement("INSERT INTO usertab(nom, prenom , age , email , motDepasse) VALUES(?, ?, ? ,? , ? );");
            preparedStatement.setString(1, s.getNom());
            preparedStatement.setString(2, s.getPrenom());
            preparedStatement.setInt(3, s.getAge());
            preparedStatement.setString(4, s.getEmail());
            preparedStatement.setString(5, s.getMotDePasse());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException();

        }


    }


    }

