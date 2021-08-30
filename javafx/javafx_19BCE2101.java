/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.javafx;
import java.sql.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Gurtavrein Singh
 */
public class javafx_19BCE2101 extends Application {
@Override
public void start(Stage primaryStage) {
try {
Text t1 = new Text(); t1.setText("Name");
TextField t2 = new TextField();
Text t3 = new Text(); t3.setText("Realtionship");
TextField t4 = new TextField();
Text t5 = new Text(); t5.setText("DOB");
TextField t6 = new TextField();
Text t7 = new Text(); t7.setText("Favourite Colour");
TextField t8 = new TextField();
Text t9 = new Text(); t9.setText("Favourite Place");
TextField t10 = new TextField();
Text t11 = new Text(); t11.setText("Phone No");
TextField t12 = new TextField();
Button btn = new Button(); btn.setText("Submit");
btn.setOnAction(new EventHandler<ActionEvent>() {
@Override
public void handle(ActionEvent event) {
String v2=t2.getText();
String v4=t4.getText();
String v6=t6.getText();
String v8=t8.getText();
String v10=t10.getText();
String v12=t12.getText();
//System.out.println(" Realtionship ::" + t4.getText());
//System.out.println(" DOB ::" + t6.getText());
//System.out.println(" Favourite Colour ::" + t8.getText());
//System.out.println(" Favourite Place ::" + t10.getText());
//System.out.println(" Contact No ::" + t12.getText());

try{
        Class.forName("com.mysql.jdbc.Driver");
        String Db_url="jdbc:mysql://localhost:3306/javatraining";
        Connection DBCon=DriverManager.getConnection(Db_url,"root","" );
        Statement st1=DBCon.createStatement();
        st1.executeUpdate("insert into family values ('"+v2+"','"+v4+"','"+v6+"','"+v8+"','"+v10+"','"+v12+"');");
        System.out.println("--------------DATA ENTERED TO TABLE-------------");
    
}catch(Exception e){
    System.out.println(e);
}

}
});
GridPane root = new GridPane();
root.addRow(0, t1, t2);
root.addRow(1, t3, t4);
root.addRow(2, t5, t6);
root.addRow(3, t7, t8);
root.addRow(4, t9, t10);
root.addRow(5, t11, t12);
root.addRow(6, btn);
Scene scene = new Scene(root, 300, 250);
primaryStage.setTitle("My Family Page");
primaryStage.setScene(scene);
primaryStage.show();
} catch (Exception e) {
e.printStackTrace();
}
}
public static void main(String[] args) {
launch(args);
}
}

