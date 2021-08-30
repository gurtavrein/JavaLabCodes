package lab;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class buttons_19BCE2101 extends Application {
    public void start(Stage primaryStage) {
    Button red = new Button("red");
    Button green = new Button("green");
    Button blue = new Button("blue");
    Button pink = new Button("pink");
    Button black = new Button("black");

    red.setOnAction(new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent event) {
        red.setStyle("-fx-background-color: Red");
        System.out.println("RED");
    }
    });
    
    green.setOnAction(new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent event) {
        green.setStyle("-fx-background-color: Green");
        System.out.println("GREEN");
    }
    });
    
    blue.setOnAction(new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent event) {
        blue.setStyle("-fx-background-color: Blue");
        System.out.println("BLUE");
    }
    });
    
    pink.setOnAction(new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent event) {
        pink.setStyle("-fx-background-color: Pink");
        System.out.println("PINK");
    }
    });
    
    black.setOnAction(new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent event) {
        black.setStyle("-fx-background-color: Black");
        System.out.println("BLACK");
    }
    });
    
    GridPane root=new GridPane(); 
    Scene scene = new Scene(root,300,300);
    root.addRow(0,red);
    root.addRow(1,green);
    root.addRow(2,blue);
    root.addRow(3,pink);
    root.addRow(4,black);
    
    primaryStage.setScene(scene);
    primaryStage.setTitle("Click on button:");
    primaryStage.show();
    }
    
    public static void main(String[] args) {
    launch(args);
    }

}
