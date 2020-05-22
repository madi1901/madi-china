package mqdi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DBManager {
    private Connection connection;
    public void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");///
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/x?useUnicode=true&serverTimezone=UTC","root", ""
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addPeople(People people){
        try{

            PreparedStatement statement = connection.prepareStatement("" +
                    "INSERT INTO `people` (id, name, surname, gender, age) " +
                    "VALUES (NULL, ?, ?, ?, ?)"
            );
            statement.setString(1, people.getName());
            statement.setString(2, people.getSurname());
            statement.setString(3, people.getGender());
            statement.setString(4, people.getAge());

            statement.executeUpdate();// Insert, Delete, Update

            statement.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public ArrayList<People> getAllPeople(){
        ArrayList<People> peopleList = new ArrayList<>();
        try{
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM `people`");
            ResultSet resultSet = statement.executeQuery();/// Select

            while(resultSet.next()){
                Integer id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                String gender = resultSet.getString("gender");
                String age = resultSet.getString("age");

                peopleList.add(new People(id, name, surname, gender, age));
            }
            statement.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return peopleList;
    }

    public void deletePeople(Integer id){
        try{
            PreparedStatement statement = connection.prepareStatement("" +
                    "DELETE FROM `people` WHERE id = ?"
            );
            statement.setInt(1, id);
            statement.executeUpdate();
            statement.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
