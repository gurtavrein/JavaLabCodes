/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.fat;
import java.sql.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TabPane;
import javafx.scene.control.Tab;
/**
 *
 * @author Gurtavrein Singh
 */
public class CSE3099_19BCE2101 extends Application {
@Override
public void start(Stage primaryStage) {
try {
            TabPane tabPane = new TabPane();

        Tab tab1 = new Tab("Planes", new Label("Show all planes available"));
        Tab tab2 = new Tab("Cars"  , new Label("Show all cars available"));
        Tab tab3 = new Tab("Boats" , new Label("Show all boats available"));

        tabPane.getTabs().add(tab1);
        tabPane.getTabs().add(tab2);
        tabPane.getTabs().add(tab3);
Text t1 = new Text();
t1.setText("Name");
TextField t2 = new TextField();

Text t3 = new Text();
t3.setText("Reg no");
TextField t4 = new TextField();

Text t5 = new Text(); 
t5.setText("School");
TextField t6 = new TextField();

Text t7 = new Text();
t7.setText("Phone no");
TextField t8 = new TextField();

Text t9=new Text();
t9.setText("Choose");
ComboBox c = new ComboBox();
c.getItems().add("Online Industrial Internship[OII]");
c.getItems().add("Online Course[OC]");

//drop down
Button btn = new Button(); btn.setText("Submit");
btn.setOnAction(new EventHandler<ActionEvent>() {
@Override
public void handle(ActionEvent event) {
String v1=t2.getText();
String v2=t4.getText();
String v3=t6.getText();
String v4=t8.getText();
Object v5 = c.getSelectionModel().getSelectedItem();
try{
        Class.forName("com.mysql.jdbc.Driver");
        String Db_url="jdbc:mysql://localhost:3306/javatraining";
        Connection DBCon=DriverManager.getConnection(Db_url,"root","" );
        Statement st1=DBCon.createStatement();
        st1.executeUpdate("insert into Intern values ('"+v1+"','"+v2+"','"+v3+"','"+v4+"','"+v5+"');");
        System.out.println("Data Entered");
    
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
root.addRow(4,t9,c);
root.addRow(7, btn);
Scene scene = new Scene(root, 400, 400);
primaryStage.setTitle("CSE3099");
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
